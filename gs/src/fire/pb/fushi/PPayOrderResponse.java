package fire.pb.fushi;

import mkdb.Procedure;
import net.sf.json.JSONObject;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import fire.pb.fushi.SAddCash;
import fire.pb.fushi.payday.PSubscribeOrderResponse;
import fire.pb.fushi.spotcheck.SpotCheckManage;
import fire.pb.game.MoneyType;
import fire.pb.main.ConfigManager;
import fire.pb.main.Gs;
import fire.pb.util.DateValidate;
import fire.pb.util.MessageUtil;

public class PPayOrderResponse extends Procedure {
	public static final Logger logger = Logger.getLogger("RECHARGE");
	
	final private JSONObject jsonObject;
	final private short version;
	final private int serverid;
	final private long roleid;
	final private String gamesnstr;
	
	public PPayOrderResponse(JSONObject jsonObject, short version, int serverid, long roleid, String gamesnstr) {
		this.jsonObject = jsonObject;
		this.version = version;
		this.serverid = serverid;
		this.roleid = roleid;
		this.gamesnstr = gamesnstr;
	}
	
	public static boolean dealChargeLimit(long roleid, int goodid) {
		if(!ConfigManager.isChargeLimit)
			return false;
		xbean.RoleChargeLimit rcl = xtable.Roleschargelimit.get(roleid);
		if(rcl != null) {
			xbean.ChargeRecord cr = rcl.getChargeslimit().get(new Integer(goodid));
			if(cr != null) {
				cr.setChargecount(cr.getChargecount() + 1);
				cr.setChargetime(System.currentTimeMillis());
			} else {
				xbean.ChargeRecord newCr = xbean.Pod.newChargeRecord();
				newCr.setChargecount(1);
				newCr.setChargetime(System.currentTimeMillis());
				rcl.getChargeslimit().put(new Integer(goodid), newCr);
			}
		} else {
			xbean.RoleChargeLimit newRcl = xbean.Pod.newRoleChargeLimit();
			xbean.ChargeRecord newCr = xbean.Pod.newChargeRecord();
			newCr.setChargecount(1);
			newCr.setChargetime(System.currentTimeMillis());
			newRcl.getChargeslimit().put(new Integer(goodid), newCr);
			xtable.Roleschargelimit.insert(roleid, newRcl);
		}
		return true;
	}
	
	private boolean dealPcWebOrder(final long gamesn,final String platsn) {
		xbean.Properties prop = xtable.Properties.get(roleid); //?????????
		if(prop == null) {
			logger.error("PPayOrderResponse.dealPcWebOrder:???????????????????????????????????????:" + roleid + ".");
			return false;
		}
		//???????????????????????????
		Long historytime = xtable.Platorderhistroy.select(platsn);
		if(historytime != null){
			logger.error("PPayOrderResponse.dealPcWebOrder:???????????????????????? " + roleid + ",?????????????????????:" + platsn + ",??????:" +  DateValidate.getTimeString(historytime.longValue()));
			return false;
		}
		int userid = prop.getUserid();
		String strProductId = jsonObject.getString("ProductId");
		Double dMoney = jsonObject.getDouble("Money");
		int iMoney = dMoney.intValue();
		ChargeConfig conf = FushiManager.getChargeConfigByProductID(strProductId);
		if(conf == null) {
			logger.warn("PPayOrderResponse.dealPcWebOrder:????????????????????????????????????????????????:" + strProductId + ",????????????????????????!");
			conf = FushiManager.getChargeConfigByMoney(iMoney);
			if(conf == null) {
				logger.error("PPayOrderResponse.dealPcWebOrder:?????????????????????????????????????????????????????????:" + strProductId + "," + iMoney + ",??????~!");
				return false;
			} else {
				logger.warn("PPayOrderResponse.dealPcWebOrder:?????????????????????:" + iMoney + ",????????????:" + conf.getProductid() + "!");
			}
		}
		int confgoodid = conf.id;
		int cash = iMoney;
		if (conf.kind == 1) {
        	//????????????????????????
			int fushiNum = conf.sellnum + conf.sellnummore;
			int extraGold = 0;
			
			int isFirstCharge = 0;			// add by yebin ??????????????????
			xbean.FirstCharge firstCharge = xtable.Firstchargenew.get(userid);
			if (firstCharge == null){
				firstCharge = xbean.Pod.newFirstCharge();
				xtable.Firstchargenew.insert(userid, firstCharge);
			}
			if (firstCharge.getFirstchargetime() < FushiManager.FIRST_CHARGE_START_TIME){
				firstCharge.setFirstchargetime(System.currentTimeMillis());
			}
			if (firstCharge.getFirstchargeclearpresenttime() < FushiManager.FIRST_CHARGE_CLEAR_PRESENT_START_TIME) {
				firstCharge.setFirstchargeclearpresenttime(System.currentTimeMillis());
				firstCharge.setChargestatus(1);
				isFirstCharge = 1;
			}
			psendWhileCommit(roleid, new SRefreshChargeState((int)firstCharge.getChargestatus(), 0));
			
			logger.info("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+roleid+"]??????????????????,??????PAddCoin,??????:" + fushiNum);
			if (!new PAddCoin(userid, ConfigManager.getGsZoneId(), gamesn, fushiNum, new HashMap<String, String>(), cash, platsn,
					gamesnstr, conf.sellnum + extraGold, "").call()){
				logger.error("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+roleid+"]??????????????????,PAddCoin.call()?????????");
				return false;
			}
			
			String sgood = String.valueOf(confgoodid);			
			
			// ????????????
			String platstr = jsonObject.getString("Channel");
			if(platstr == null){
				platstr = "";
			}
			fire.log.YYLogger.OpChargeLog(roleid, platsn, sgood, 1, cash, conf.sellnum, fushiNum - conf.sellnum, "RMB", "", "", platstr, isFirstCharge);			
			fire.log.YYLogger.OpTokenGetLog(roleid, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, MoneyType.MoneyType_HearthStone, fushiNum, 0, new fire.log.beans.ItemBean());
			
			List<String> paras = MessageUtil.getMsgParaList(String.valueOf(fushiNum));
			fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 145154, 0, paras);
			
			fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
			bag.addSysCurrency((long)(conf.sellnum*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_EXCHANGE))
					, MoneyType.MoneyType_EreditPoint, "??????????????????", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, 0);
			
			new PAddVipExp(roleid,conf.sellnum, PAddVipExp.REASON_ADD_VIP_EXP_CHARGE).call();
			logger.info("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+ roleid +"]???????????????????????????");
        } else if (conf.kind == 2) {
        	//????????????
        	int subtime = conf.sellnum;
        	int fushiNum = conf.sellnummore;
        	int extraGold = 0;
        	
        	int isFirstCharge = 0;			// add by yebin ??????????????????
			xbean.FirstCharge firstCharge = xtable.Firstchargenew.get(userid);
			if (firstCharge == null){
				firstCharge = xbean.Pod.newFirstCharge();
				xtable.Firstchargenew.insert(userid, firstCharge);
			}
			if (firstCharge.getFirstchargetime() < FushiManager.FIRST_CHARGE_START_TIME){
				firstCharge.setFirstchargetime(System.currentTimeMillis());
			}
			if (firstCharge.getFirstchargeclearpresenttime() < FushiManager.FIRST_CHARGE_CLEAR_PRESENT_START_TIME) {
				firstCharge.setFirstchargeclearpresenttime(System.currentTimeMillis());
				firstCharge.setChargestatus(1);
				isFirstCharge = 1;
			}
			psendWhileCommit(roleid, new SRefreshChargeState((int)firstCharge.getChargestatus(), 0));
        	
        	logger.info("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+roleid+"]????????????????????????,??????PSubscribeOrderResponse,????????????:" + subtime + ",??????:" + fushiNum);
        	if(!new PSubscribeOrderResponse(roleid, subtime).call()) {
        		return false;
        	}
        	if(fushiNum > 0) {
            	if (!new PAddCoin(userid, ConfigManager.getGsZoneId(), gamesn, fushiNum, new HashMap<String, String>(), cash, platsn,
						gamesnstr, 0 + extraGold, "").call()){
					logger.error("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+roleid+"]????????????????????????,PAddCoin.call()?????????");
					return false;
				}
        	} else {
        		
        	}
        	
        	//???????????????????????????????????????????????????????????????????????????????????????????????????
        	final int dika = subtime;
			mkdb.Procedure proc = new mkdb.Procedure() {
				@Override
				public boolean process() {
					xbean.YbNums ybNums = xtable.Fushinum.get(userid);
					if (ybNums == null){
						ybNums = xbean.Pod.newYbNums();
						xtable.Fushinum.insert(userid, ybNums);
					}
					xbean.YbNum ybNum = ybNums.getRoleyb().get(roleid);
					if (ybNum == null) {
						ybNum = xbean.Pod.newYbNum();
						ybNums.getRoleyb().put(roleid, ybNum);
					}
					long oldall=ybNum.getFushiall();
					ybNum.setFushiall(ybNum.getFushiall() + dika * 20);//??????????????????
					logger.info("PPayOrderResponse.dealPcWebOrder:??????:" + dika + ",???????????????:" + dika * 20 + ",??????["+roleid+"]???????????????????????????????????????.");
					SpotCheckManage.refreshTradingOpenState(roleid, oldall, ybNum.getFushiall());//???????????????????????????
					return true;
				}
			};
			mkdb.Procedure.pexecuteWhileCommit(proc);
        	
        	String sgood = String.valueOf(confgoodid);			
			
			// ????????????
			String platstr = jsonObject.getString("Channel");
			if(platstr == null){
				platstr = "";
			}				
			fire.log.YYLogger.OpChargeLog(roleid, platsn, sgood, 1, cash, conf.sellnum * 20, conf.sellnummore, "RMB", "", "", platstr, isFirstCharge);			
			fire.log.YYLogger.OpTokenGetLog(roleid, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, MoneyType.MoneyType_HearthStone, conf.sellnum * 20 + conf.sellnummore, 0, new fire.log.beans.ItemBean());

//			fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
//			bag.addSysCurrency((long)(sChargeCfg.sellnum*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_EXCHANGE))
//					, MoneyType.MoneyType_EreditPoint, "??????????????????", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, 0);
//			
//			new PAddVipExp(user.getPrevloginroleid(),sChargeCfg.sellnum, PAddVipExp.REASON_ADD_VIP_EXP_CHARGE).call();
			logger.info("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+ roleid +"]?????????????????????????????????");
        } else {
        	logger.info("PPayOrderResponse.dealPcWebOrder:????????????userid:" + userid + ",??????["+ roleid +"]??????????????????,????????????kind=" + conf.kind + ",????????????!");
        	FushiManager.logger.info("userid:" + userid + ",??????[" + roleid + "]????????????kind=" + conf.kind + ",????????????????????????!");
            return false;
        }
		
		long inserttime = System.currentTimeMillis();
		xtable.Platorderhistroy.insert(platsn, inserttime);
		logger.info("PPayOrderResponse.dealPcWebOrder:????????????platsn:" + platsn + ",????????????:" + DateValidate.getTimeString(inserttime));
		logger.info("PPayOrderResponse.dealPcWebOrder:????????????gamesn:" + gamesn + ",userid:" + userid + ",??????[" + roleid + "]???????????????????????????");
		
		PPayOrderResponse.dealChargeLimit(this.roleid, confgoodid);
		return true;
	}

	@Override
	protected boolean process() throws Exception {
		try {
			logger.info("PPayOrderResponse.???????????????????????????.gamesn:" + gamesnstr + ",version:" + version);
			String platsn = jsonObject.getString("OrderId");
			long gamesn = Long.parseLong(gamesnstr);
			if(!String.valueOf(serverid).equals(Gs.serverid)) {
				logger.error("PPayOrderResponse.????????????:" + gamesn + ",???????????????id:" + serverid + ",???????????????id:" + Gs.serverid);
				return true;
			}
			if(gamesn < 0) {
				return dealPcWebOrder(gamesn, platsn);
			}
			String strProductId = jsonObject.getString("ProductId");
			Double dMoney = jsonObject.getDouble("Money");
			xbean.ChargeOrder chargeOrder = xtable.Chargeorder.get(gamesn);
			boolean findInChargeOrder = true;
			if (chargeOrder == null) {
				chargeOrder = xtable.Failedchargeorder.get(gamesn);
				if (chargeOrder == null) {
					logger.error("PPayOrderResponse.????????????:" + gamesn + "???gs?????????????????????????????????????????????!");
					return false;
					//...???????????????
//					ChargeConfig conf = FushiManager.getChargeConfigByProductID(jsonObject.getString("ProductId"));
//					if(conf == null) {
//						logger.error("PPayOrderResponse.????????????????????????????????????????????????:" + jsonObject.getString("ProductId"));
//						return true;
//					} else {
//						xbean.Properties prop = xtable.Properties.select(roleid);
//						if(prop == null) {
//							logger.error("PPayOrderResponse.??????????????????????????????????????????????????????:" + roleid + ",??????????????????.");
//							return true;
//						}
//						chargeOrder = xbean.Pod.newChargeOrder();
//						long chargeSn = xtable.Chargeorder.insert(chargeOrder);
//						logger.info("PPayOrderResponse.????????????:" + gamesn + "?????????,??????????????????:" + chargeSn);
//						gamesn = chargeSn;
//					    chargeOrder.setStatus(1);
//					    chargeOrder.setNum(Integer.parseInt(jsonObject.getString("Money")));
//					    chargeOrder.setPlatformuid(prop.getPlatformuid());
//					    chargeOrder.setPlattype("tempplattype");
//					    chargeOrder.setRoleid(roleid);
//					    chargeOrder.setUserid(prop.getUserid());
//					    chargeOrder.setCreatetime(System.currentTimeMillis());
//					    chargeOrder.setGoodid(conf.id);
//					    chargeOrder.setGoodnum(Integer.parseInt(jsonObject.getString("ProductCount")));
//					    xbean.ChargeHistory chargeHistory = xtable.Chargehistory.get(prop.getUserid());
//					    if (chargeHistory == null){
//					    	chargeHistory = xbean.Pod.newChargeHistory();
//					    	xtable.Chargehistory.insert(prop.getUserid(), chargeHistory);
//					    }
//					    xbean.ChargeOrder chargeOrder2 = chargeOrder.copy();
//					    chargeHistory.getCharges().put(chargeSn, chargeOrder2);
//					    findInChargeOrder = true;
//					}
				} else
					findInChargeOrder = false;
			}
			int userid = chargeOrder.getUserid();
			logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid);	
			int cash = chargeOrder.getNum();
			if (cash <= 0) {
				logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",????????????<=0!");
				return false;
			}
			
			ChargeConfig sChargeCfg = null;
			if(fire.pb.fushi.Module.GetPayServiceType() == 0){
				sChargeCfg = ConfigManager.getInstance().getConf(SAddCash.class).get(chargeOrder.getGoodid());
			}else{
				sChargeCfg = ConfigManager.getInstance().getConf(SAddCashPCard.class).get(chargeOrder.getGoodid());
			}
			if (sChargeCfg == null) {
				logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",?????????????????????????????????:" + chargeOrder.getGoodid());
				return false;
			}
			if (!strProductId.equalsIgnoreCase(sChargeCfg.getProductid())) {
				logger.warn("PPayOrderResponse.????????????gamesn:" + gamesn + ",strProductId:" + strProductId + ",???????????????ID:" + sChargeCfg.getProductid());
				//Double jiage = new Integer(sChargeCfg.getSellpricenum()).doubleValue();
				int iMoney = dMoney.intValue();
				if(iMoney != sChargeCfg.getSellpricenum()){
					logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",iMoney:" + iMoney + ",????????????????????????:" + sChargeCfg.getSellpricenum());
					return false;
				}
			}
			xbean.User user = xtable.User.get(userid);
			if (!user.getIdlist().contains(roleid)) {
				logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",???????????????????????????:" + roleid);
				return false;
			}
            logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+ roleid +"]??????????????????,????????????kind=" + sChargeCfg.kind);
            if (sChargeCfg.kind == 1) {
            	//????????????????????????
				int fushiNum = sChargeCfg.sellnum + sChargeCfg.sellnummore;
				int extraGold = 0;
				
				int isFirstCharge = 0;			// add by yebin ??????????????????
				xbean.FirstCharge firstCharge = xtable.Firstchargenew.get(userid);
				if (firstCharge == null){
					firstCharge = xbean.Pod.newFirstCharge();
					xtable.Firstchargenew.insert(userid, firstCharge);
				}
				if (firstCharge.getFirstchargetime() < FushiManager.FIRST_CHARGE_START_TIME){
					firstCharge.setFirstchargetime(System.currentTimeMillis());
				}
				if (firstCharge.getFirstchargeclearpresenttime() < FushiManager.FIRST_CHARGE_CLEAR_PRESENT_START_TIME) {
					firstCharge.setFirstchargeclearpresenttime(System.currentTimeMillis());
					firstCharge.setChargestatus(1);
					isFirstCharge = 1;
				}
				psendWhileCommit(chargeOrder.getRoleid(), new SRefreshChargeState((int)firstCharge.getChargestatus(), 0));
				
				logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+roleid+"]??????????????????,??????PAddCoin,??????:" + fushiNum);
				if (!new PAddCoin(userid, ConfigManager.getGsZoneId(), gamesn, fushiNum, new HashMap<String, String>(), cash, platsn,
						gamesnstr, sChargeCfg.sellnum + extraGold, "").call()){
					logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+roleid+"]??????????????????,PAddCoin.call()?????????");
					return false;
				}
				
				String sgood = String.valueOf(chargeOrder.getGoodid());			
				
				// ????????????
				String platstr = jsonObject.getString("Channel");
				if(platstr == null){
					platstr = "";
				}
				fire.log.YYLogger.OpChargeLog(user.getPrevloginroleid(), platsn, sgood, chargeOrder.getGoodnum(), cash, sChargeCfg.sellnum, fushiNum - sChargeCfg.sellnum, "RMB", "", "", platstr, isFirstCharge);			
				fire.log.YYLogger.OpTokenGetLog(roleid, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, MoneyType.MoneyType_HearthStone, fushiNum, 0, new fire.log.beans.ItemBean());
				
				List<String> paras = MessageUtil.getMsgParaList(String.valueOf(fushiNum));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 145154, 0, paras);
				
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				bag.addSysCurrency((long)(sChargeCfg.sellnum*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_EXCHANGE))
						, MoneyType.MoneyType_EreditPoint, "??????????????????", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, 0);
				
				new PAddVipExp(user.getPrevloginroleid(),sChargeCfg.sellnum, PAddVipExp.REASON_ADD_VIP_EXP_CHARGE).call();
				logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+ roleid +"]???????????????????????????");
            } else if (sChargeCfg.kind == 2) {
            	//????????????
            	int subtime = sChargeCfg.sellnum;
            	int fushiNum = sChargeCfg.sellnummore;
            	int extraGold = 0;
            	
            	int isFirstCharge = 0;			// add by yebin ??????????????????
				xbean.FirstCharge firstCharge = xtable.Firstchargenew.get(userid);
				if (firstCharge == null){
					firstCharge = xbean.Pod.newFirstCharge();
					xtable.Firstchargenew.insert(userid, firstCharge);
				}
				if (firstCharge.getFirstchargetime() < FushiManager.FIRST_CHARGE_START_TIME){
					firstCharge.setFirstchargetime(System.currentTimeMillis());
				}
				if (firstCharge.getFirstchargeclearpresenttime() < FushiManager.FIRST_CHARGE_CLEAR_PRESENT_START_TIME) {
					firstCharge.setFirstchargeclearpresenttime(System.currentTimeMillis());
					firstCharge.setChargestatus(1);
					isFirstCharge = 1;
				}
				psendWhileCommit(chargeOrder.getRoleid(), new SRefreshChargeState((int)firstCharge.getChargestatus(), 0));
            	
            	logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+roleid+"]????????????????????????,??????PSubscribeOrderResponse,????????????:" + subtime + ",??????:" + fushiNum);
            	if(!new PSubscribeOrderResponse(roleid, subtime).call()) {
            		return false;
            	}
            	if(fushiNum > 0) {
	            	if (!new PAddCoin(userid, ConfigManager.getGsZoneId(), gamesn, fushiNum, new HashMap<String, String>(), cash, platsn,
							gamesnstr, 0 + extraGold, "").call()){
						logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+roleid+"]????????????????????????,PAddCoin.call()?????????");
						return false;
					}
            	} else {
            		
            	}
            	
            	//???????????????????????????????????????????????????????????????????????????????????????????????????
            	final int dika = subtime;
				mkdb.Procedure proc = new mkdb.Procedure() {
					@Override
					public boolean process() {
						xbean.YbNums ybNums = xtable.Fushinum.get(userid);
						if (ybNums == null){
							ybNums = xbean.Pod.newYbNums();
							xtable.Fushinum.insert(userid, ybNums);
						}
						xbean.YbNum ybNum = ybNums.getRoleyb().get(roleid);
						if (ybNum == null) {
							ybNum = xbean.Pod.newYbNum();
							ybNums.getRoleyb().put(roleid, ybNum);
						}
						long oldall=ybNum.getFushiall();
						ybNum.setFushiall(ybNum.getFushiall() + dika * 20);//??????????????????
						logger.info("PPayOrderResponse.??????:" + dika + ",???????????????:" + dika * 20 + ",??????["+roleid+"]???????????????????????????????????????.");
						SpotCheckManage.refreshTradingOpenState(roleid, oldall, ybNum.getFushiall());//???????????????????????????
						return true;
					}
				};
				mkdb.Procedure.pexecuteWhileCommit(proc);
            	
            	String sgood = String.valueOf(chargeOrder.getGoodid());			
				
				// ????????????
				String platstr = jsonObject.getString("Channel");
				if(platstr == null){
					platstr = "";
				}				
				fire.log.YYLogger.OpChargeLog(user.getPrevloginroleid(), platsn, sgood, chargeOrder.getGoodnum(), cash, sChargeCfg.sellnum * 20, sChargeCfg.sellnummore, "RMB", "", "", platstr, isFirstCharge);			
				fire.log.YYLogger.OpTokenGetLog(roleid, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, MoneyType.MoneyType_HearthStone, sChargeCfg.sellnum * 20 + sChargeCfg.sellnummore, 0, new fire.log.beans.ItemBean());

//				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
//				bag.addSysCurrency((long)(sChargeCfg.sellnum*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_EXCHANGE))
//						, MoneyType.MoneyType_EreditPoint, "??????????????????", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhiget, 0);
//				
//				new PAddVipExp(user.getPrevloginroleid(),sChargeCfg.sellnum, PAddVipExp.REASON_ADD_VIP_EXP_CHARGE).call();
				logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+ roleid +"]?????????????????????????????????");
            } else {
            	logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????["+ roleid +"]??????????????????,????????????kind=" + sChargeCfg.kind + ",????????????!");
            	FushiManager.logger.info("userid:" + userid + ",??????[" + roleid + "]????????????kind=" + sChargeCfg.kind + ",????????????????????????!");
                return false;
            }
            
			chargeOrder.setStatus(0);
			xbean.ChargeHistory chargeHistory = xtable.Chargehistory.get(userid);
			if (chargeHistory != null) {
				xbean.ChargeOrder chargeOrder2 = chargeHistory.getCharges().get(gamesn);
				chargeOrder2.setStatus(0);
			} else {
				logger.error("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????[" + roleid + "]???ChargeHistory???????????????.");
			}

			xbean.Properties properties = xtable.Properties.get(roleid);
			if(properties != null){
				properties.setLastchargetime(System.currentTimeMillis());
			}
			
			if (findInChargeOrder) {
				logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????[" + roleid + "]???????????????Chargeorder??????.");
				xtable.Chargeorder.remove(gamesn);
			} else {
				logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????[" + roleid + "]???????????????FailedChargeorder??????.");
				xtable.Failedchargeorder.remove(gamesn);
			}
			PPayOrderResponse.dealChargeLimit(this.roleid, chargeOrder.getGoodid());
			logger.info("PPayOrderResponse.????????????gamesn:" + gamesn + ",userid:" + userid + ",??????[" + roleid + "]???????????????????????????");
		} catch (Exception e) {
			logger.error("?????????????????????e=" + e);
			e.printStackTrace();
		}
		return true;
	}

}

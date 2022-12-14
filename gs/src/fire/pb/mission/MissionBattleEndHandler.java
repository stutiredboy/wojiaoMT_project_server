package fire.pb.mission;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import fire.log.YYLogger;
import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.HelpCountManage;
import fire.pb.PAddClanPointProc;
import fire.pb.PAddExpProc;
import fire.pb.RoleConfigManager;
import fire.pb.battle.BasicEndHandler;
import fire.pb.battle.BattleConfig;
import fire.pb.battle.BattleField;
import fire.pb.circletask.AnYeMaXiTuanConf;
import fire.pb.clan.ClanUtils;
import fire.pb.common.SCommon;
import fire.pb.game.MoneyType;
import fire.pb.main.ConfigManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.MessageUtil;

public class MissionBattleEndHandler extends BasicEndHandler {
	private final int questid;
	private final int needresult;
	private final long capitalid;
	private final Set<Long> finishTaskRoles = new HashSet<Long>();
	private int helpBonus;
	public MissionBattleEndHandler( final int questid, final int result,
			final long capitalid) {
		this.questid = questid;
		this.needresult = result;
		this.capitalid = capitalid;
		this.helpBonus = -1;
	}
	
	private boolean F(final long memberid, final boolean checkchengjiu) {
		return new PMissionProc() {
			@Override
			protected boolean missionExecute() {
				if (new PCommitMajorMission(memberid, questid, memberid == capitalid, true).call()) {
					finishTaskRoles.add(memberid);
					return true;
				}
				return false;
			}
		}.call();
	}
	
	
	@Override
	protected boolean handleCamera() {
		BattleConfig battleConfig = fire.pb.battle.Module.getInstance().getBattleConfigs().get(battle.getConfigid());
		if(battleConfig!=null && battleConfig.cameratype > 0){
			BattleField.outBattlevideoProcess(battle,
					(byte)battleConfig.cameratype, 
					battle.getConfigid(),
					BattleField.getLeaderRoleid(battle,true));/**/
		}
		return true;
		
	}
	
	@Override
	protected boolean handleAward() {
		RoleMission mission = new MissionColumn(capitalid, true).getMission(questid);
		
		if(mission != null) {
			int teamshare = mission.getConf().exeIndo.share;
			if (teamshare == 0) {
				//?????????
				java.util.List<xbean.Fighter> roleids = super.getWinRoles();
				F(capitalid, !roleids.isEmpty());
			} else {
				java.util.List<xbean.Fighter> roleids = super.getWinRoles();
				for (xbean.Fighter xfighter : roleids) {
					F(xfighter.getUniqueid(), !roleids.isEmpty());
				}
			}
		} else {
			java.util.List<xbean.Fighter> roleids = super.getWinRoles();
			for (xbean.Fighter xfighter : roleids) {
				F(xfighter.getUniqueid(), !roleids.isEmpty());
			}
		}
		
		if(this.helpBonus <= 0){
			Module.logger.info("??????[" + capitalid + "]??????????????????:" + questid + ",HelpBonus=" + helpBonus + ",??????????????????!");
			return true;
		}
		Module.logger.info("??????[" + capitalid + "]??????????????????:" + questid + ",HelpBonus=" + helpBonus + ",???????????????,????????????????????????????????????");
	
		//???????????????????????????????????????
		int finishtaskroleLv = 0;
		Set<Long> factionids = new HashSet<Long>();
		for (Long roleid : this.finishTaskRoles){
			Integer memlevel = xtable.Properties.selectLevel(roleid);
			if(memlevel > finishtaskroleLv)
				finishtaskroleLv = memlevel;
			Long clankey=xtable.Properties.selectClankey(roleid);
			if(clankey!=null&&clankey>0){
				factionids.add(clankey);
			}
		}
		//if(finishtaskroleLv < 30)//????????????30?????????????????????????????????????????????????????????????????????????????????MTG-3344
			//return true;
		
		//java.util.List<xbean.Fighter> roleids = super.getWinRoles();
		//????????????????????????
		StringBuilder sb = new StringBuilder();
		
		for (xbean.Fighter xfighter : this.battle.getFighters().values()) {
			long memberid = xfighter.getUniqueid();
			Integer memlevel = xtable.Properties.selectLevel(memberid);
			if(memlevel == null || memlevel <= 0)
				continue;
			if(this.finishTaskRoles.contains(memberid))
				continue;
			
			String rolename = xtable.Properties.selectRolename(memberid);
			sb.append(rolename).append(",");
			
			if(finishtaskroleLv - memlevel > 5) //???????????????????????????5?????????????????????????????????????????? MTG-3348
				continue;
			MissionColumn rolemissions = new MissionColumn(memberid, false);
			RoleMission mission2 = rolemissions.getMission(questid);
			if (mission2 == null) {
				//?????????????????????????????????????????????
				final SCommon cc = RoleConfigManager.getRoleCommonConfig(350);
				int shenwang = (cc == null ? 2 : Integer.parseInt(cc.getValue()));
				int resultsw=HelpCountManage.getInstance().addShengWangValue(memberid, shenwang, "??????????????????????????????");
				long addsw = 0;
				if(resultsw>0){
					fire.pb.item.Pack bag = new fire.pb.item.Pack(memberid, false);
					long realAdd = bag.addSysCurrency(resultsw,
							MoneyType.MoneyType_ShengWang, "awardID:" + 0,
							fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, 0);
					if(realAdd > 0){
						addsw = realAdd;
						//MessageUtil.pSendAddOrRemoveCurrency(memberid, realAdd,MoneyType.MoneyType_ShengWang);
						java.util.List<String> para = new LinkedList<String>();
						para.add(String.valueOf(realAdd));
						MessageMgr.psendMsgNotifyWhileCommit(memberid, 166126, para);
					} else {
						Module.logger.error("??????[" + memberid + "]????????????????????????:addSysCurrency shengwang error!realAdd=" + realAdd);
					}
				}
				final fire.pb.PropRole prole = new fire.pb.PropRole(memberid, false);
				long addexp = HelpCountManage.getAddExpValueByHelpFight(memberid);
				long resultexp=HelpCountManage.getInstance().addExpValue(memberid, 1, "??????????????????????????????");
				if(resultexp>0){
					new fire.pb.PAddExpProc(memberid, addexp, PAddExpProc.OTHER,"??????????????????").call();
				}
				Module.logger.info("??????[" + memberid + "]??????????????????[" + questid + "]addexp=" + addexp + ",resultexp=" + resultexp + ";addsw=" + addsw + ",resultsw=" + resultsw);
			}
		}
		//??????????????????????????????
		for (xbean.Fighter xfighter : this.battle.getFighters().values()) {
			long memberid = xfighter.getUniqueid();
			Integer memlevel = xtable.Properties.selectLevel(memberid);
			if(memlevel == null || memlevel <= 0)
				continue;
			if(this.finishTaskRoles.contains(memberid))
				continue;
			if(finishtaskroleLv - memlevel > 5) //???????????????????????????5?????????????????????????????????????????? MTG-3348
				continue;
			Long memfikey=xtable.Properties.selectClankey(memberid);
			if(memfikey != null && memfikey > 0){
				if(factionids.contains(memfikey)){
					MissionColumn rolemissions = new MissionColumn(memberid, false);
					RoleMission mission3 = rolemissions.getMission(questid);
					if (mission3 == null) {
						final SCommon cc = RoleConfigManager.getRoleCommonConfig(350);
						int shenwang = (cc == null ? 2 : Integer.parseInt(cc.getValue()));
						int resultsw=HelpCountManage.getInstance().addShengWangValue(memberid, shenwang, "??????????????????????????????");
						long addsw = 0;
						if(resultsw>0){
							fire.pb.item.Pack bag = new fire.pb.item.Pack(memberid, false);
							long realAdd = bag.addSysCurrency(resultsw,
									MoneyType.MoneyType_ShengWang, "awardID:" + 0,
									fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, 0);
							//?????????????????????????????????????????????
							if(realAdd > 0){
								addsw = realAdd;
								//MessageUtil.pSendAddOrRemoveCurrency(memberid, realAdd,MoneyType.MoneyType_ShengWang);
								java.util.List<String> para = new LinkedList<String>();
								para.add(String.valueOf(realAdd));
								MessageMgr.psendMsgNotifyWhileCommit(memberid, 166126, para);
							} else {
								Module.logger.error("??????????????????????????????:addSysCurrency shengwang error!realAdd=" + realAdd);
							}
						}
						int addcount = 5;
						int resultvalue=HelpCountManage.getInstance().addFactionValue(memberid, addcount, "??????????????????????????????");
						if(resultvalue>0){
							new PAddClanPointProc(memberid, resultvalue, YYLoggerTuJingEnum.tujing_Value_Task,false, "??????????????????").call();
						}
						HelpCountManage.getInstance().addFactionHelpNum(memberid, "????????????????????????");
						Module.logger.info("??????[" + memberid + "]??????????????????[" + questid + "]addcount=" + addcount + ",resultvalue=" + resultvalue + ";addsw=" + addsw + ",resultsw=" + resultsw);
					}
				}
			}	
		}
		
		//??????????????????
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.lastIndexOf(","));
			MissionConfig conf = MissionManager.getInstance().getMissionConfig(questid);
			if (conf != null) {
				fire.pb.talk.MessageMgr.sendHelpMsg(capitalid, conf.missionId, conf.missionName, sb.toString());
			}
		}
		
		return true;
	}
	@Override
	public boolean handleOutBattle(final int index,int petkey) throws Exception {
		super.handleOutBattle( index,petkey );
		xbean.Fighter xfighter = battle.getFighters().get( index );
		if (needresult == 0 && xfighter != null && xfighter.getFightertype() == xbean.Fighter.FIGHTER_ROLE) {
			return F(xfighter.getUniqueid(), false);
		}
		return true;
	}
	
	@Override
	public boolean handleDeath() {
		if (needresult != 0)
			super.handleDeath();
		java.util.List<xbean.Fighter> roleids;
		if (needresult == 0) {
			roleids = super.getDeadRoles();
			RoleMission mission = new MissionColumn(capitalid, true).getMission(questid);
			if(mission != null) {
				helpBonus = mission.getConf().exeIndo.helpBonus;
				int teamshare = mission.getConf().exeIndo.share;
				if (teamshare == 0) {
					//?????????
					F(capitalid, false);
				} else {
					for (xbean.Fighter xfighter : roleids) {
						F(xfighter.getUniqueid(), false);
					}
				}
			} else {
				for (xbean.Fighter xfighter : roleids) {
					F(xfighter.getUniqueid(), false);
				}
			}
		}
		roleids = super.getWinRoles();
		RoleMission mission = new MissionColumn(capitalid, true).getMission(questid);
		if(mission != null) {
			int teamshare = mission.getConf().exeIndo.share;
			helpBonus = mission.getConf().exeIndo.helpBonus;
			if (teamshare == 0) {
				//?????????
				if (needresult != 0 && roleids.contains(Long.valueOf(capitalid))) {
					F(capitalid, !roleids.isEmpty());
				} else {
					YYLogger.completeTaskLog(capitalid, questid, YYLogger.FAIL_FLAG, "?????????????????????????????????");
				}
			} else {
				if(roleids.isEmpty()) {
					YYLogger.completeTaskLog(capitalid, questid, YYLogger.FAIL_FLAG, "?????????????????????????????????");
				} else {
					for (xbean.Fighter xfighter : roleids) {
						F(xfighter.getUniqueid(), !roleids.isEmpty());
					}
				}
			}
		} else {
			for (xbean.Fighter xfighter : roleids) {
				F(xfighter.getUniqueid(), !roleids.isEmpty());
			}
		}
			
		return true;
	}
}

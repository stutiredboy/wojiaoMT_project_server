
package fire.pb.shop;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.game.MoneyType;

import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CExchangeCurrency__ extends mkio.Protocol { }

/** 货币兑换
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CExchangeCurrency extends __CExchangeCurrency__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		
		new mkdb.Procedure() {
			
			@Override
			protected boolean process() throws Exception {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				
				long ret = 0;
				int newMoney = 0;
				// 缁楋妇鐓堕崗鎴炲床
				if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_HearthStone) {
					// 閸忔垶宕查柧璺虹.
					if (fire.pb.fushi.Module.GetPayServiceType() == 1)
						return false;
					
					if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_SilverCoin && this.dealHearthStone()) {
						newMoney = money * 10000;
						ret = bag.addSysMoney(newMoney, "1缁楋妇鐓堕崗鎴炲床10000闁捐泛绔�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
						if (ret != 0) {
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160402, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					} 
					// 閸忔垶宕查柌鎴濈
					else if (dstmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealHearthStone()) {
						newMoney = money * 100;
						ret = bag.addSysGold(newMoney, "1缁楋妇鐓堕崗鎴炲床100闁叉垵绔�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);						
						if (ret != 0) {
							ret = bag.addSysCurrency((long)(newMoney*fire.pb.fushi.Module.getCreditPointValue(fire.pb.fushi.Module.CREDITPOINT_IN_FS2GOLD))
									, MoneyType.MoneyType_EreditPoint, "1缁楋妇鐓堕崗鎴炲床100闁叉垵绔�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
							fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160403, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
						}
					}
				}
				// 闁叉垵绔甸崗鎴炲床
				else if (srcmoneytype == fire.pb.game.MoneyType.MoneyType_GoldCoin && this.dealGold()) {
					newMoney = money * 100;
					ret = bag.addSysMoney(newMoney, "1闁叉垵绔甸崗鎴炲床100闁捐泛绔�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuan, 0);
					if (ret != 0) {
						fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 160404, java.util.Arrays.asList(Integer.toString(money), Integer.toString(newMoney)));
					}
				}
				
				return ret == 0 ? false : true ;
			}
			
			
			/**
			 * 缁楋妇鐓跺Λ?閺屻儱鑻熼幍锝夋珟
			 * @return true ok
			 */
			public boolean dealHearthStone() {
				// 閼惧嘲褰囩粭锔剧叾
				if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
				else {
					xbean.YbNums ybNums = xtable.Fushinum.get(userid);
					if (ybNums == null) {
						return false;
					}
					xbean.YbNum ybNum = ybNums.getRoleyb().get(roleid);
					if (ybNum == null) {
						return false;
					}
					if (ybNum.getNum() < 0 || ybNum.getSysnum() < 0) {
						return false;
					}

					return fire.pb.fushi.FushiManager.subFushiFromUser(userid, roleid, money, 0, 0,
							fire.pb.fushi.FushiConst.REASON_SUB_EXCHANGE_CURRENCY, YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, true);
				}
			}
			
			/**
			 * 閹碉綁娅庨柌鎴濈
			 * @return true ok
			 */
			public boolean dealGold() {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subGold(-money, "鐠愌冪閸忔垶宕�", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_huobiduihuancost, 0);
				return ret == 0 ? false : true ;
			}
			
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810653;

	public int getType() {
		return 810653;
	}

	public int srcmoneytype; // 源类型 参考game.xml中MoneyType
	public int dstmoneytype; // 目标类型 参考game.xml中MoneyType
	public int money; // 数量

	public CExchangeCurrency() {
	}

	public CExchangeCurrency(int _srcmoneytype_, int _dstmoneytype_, int _money_) {
		this.srcmoneytype = _srcmoneytype_;
		this.dstmoneytype = _dstmoneytype_;
		this.money = _money_;
	}

	public final boolean _validator_() {
		if (srcmoneytype < 1 || srcmoneytype > 10) return false;
		if (dstmoneytype < 1 || dstmoneytype > 10) return false;
		if (money < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcmoneytype);
		_os_.marshal(dstmoneytype);
		_os_.marshal(money);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcmoneytype = _os_.unmarshal_int();
		dstmoneytype = _os_.unmarshal_int();
		money = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CExchangeCurrency) {
			CExchangeCurrency _o_ = (CExchangeCurrency)_o1_;
			if (srcmoneytype != _o_.srcmoneytype) return false;
			if (dstmoneytype != _o_.dstmoneytype) return false;
			if (money != _o_.money) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcmoneytype;
		_h_ += dstmoneytype;
		_h_ += money;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcmoneytype).append(",");
		_sb_.append(dstmoneytype).append(",");
		_sb_.append(money).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CExchangeCurrency _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcmoneytype - _o_.srcmoneytype;
		if (0 != _c_) return _c_;
		_c_ = dstmoneytype - _o_.dstmoneytype;
		if (0 != _c_) return _c_;
		_c_ = money - _o_.money;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


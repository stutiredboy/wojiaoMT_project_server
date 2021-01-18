
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabChargeReturnProfitReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 妫板棗褰囬崗鍛�?鑹扮箲閸掆晛顨涢崝?
 * @author changhao
 *
 */
public class CGrabChargeReturnProfitReward extends __CGrabChargeReturnProfitReward__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure grabchargereturnprofitreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.EChargeReturnProfit profits = xtable.Roleid2chargereturnprofit.get(roleid);
				
				if (profits == null)
				{
					FushiManager.logger.info("濞屸�冲帠閸婇棿绗夐懗浠嬵暙閸�?");
					return true;
				}
				
				xbean.ChargeReturnProfit profit = profits.getReturnprofitmap().get(id);
				if (profit == null)
				{
					FushiManager.logger.info("濞屸剝婀佹潻娆庨嚋閸忓懎?鑹扮箲閸掆晠銆嶉惄?");
					return true;					
				}
				
				SChargeReturnProfit config = fire.pb.main.ConfigManager.getInstance().getConf(SChargeReturnProfit.class).get(id);
				if (config == null)
				{
					FushiManager.logger.info("濞屸剝婀佹潻娆庨嚋閸忓懎?鑹扮箲閸掆晠銆嶉惄?");
					return true;						
				}
				
				if (profit.getStatus() == 1) // 
				{
					int c = 0;
					for (Integer id : config.getRewarditems())
					{	
						int c1 = 0; //缁嬪秴浜曢張澶屽仯閺咃附璁� by changhao
						for (Integer num : config.getRewarditemnums())
						{
							if (c == c1) //瀵版鍩屾總鏍уС鐎电懓绨查惃鍕殶闁�? by changhao
							{
								int added = fire.pb.util.BagUtil.addItem(roleid, id, num, fire.pb.skill.liveskill.LiveSkillManager.ChargetGrab, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_chongzhifanli, 1, true);
								
								if (num != added)
								{
									FushiManager.logger.info("閸欐垶鏂佹總鏍уС婢惰精瑙﹂崣顖濆厴閺勵垵鍎楅崠鍛姬娴�?");
									fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 140655, null);
									return false;						
								}									
							}							
							
							c1 ++;
						}
						
						c ++;
					}
					 
					profit.setStatus(0); //鐠佸墽鐤嗘稉鍝勫嚒妫板棗褰囬悩鑸�?? by changhao
					SGrabChargeReturnProfitReward msg = new SGrabChargeReturnProfitReward();
					msg.id = profit.getId();
					msg.status = 0;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
					
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 160009, null);
				}
				
				return true;
			};
		};
		
		grabchargereturnprofitreward.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812481;

	public int getType() {
		return 812481;
	}

	public int id; // 充值返利项目ID by changhao

	public CGrabChargeReturnProfitReward() {
	}

	public CGrabChargeReturnProfitReward(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGrabChargeReturnProfitReward) {
			CGrabChargeReturnProfitReward _o_ = (CGrabChargeReturnProfitReward)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGrabChargeReturnProfitReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


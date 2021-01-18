
package fire.pb.battle;

import java.util.Arrays;

import fire.pb.PropRole;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.talk.MessageMgr;


import fire.pb.team.Team;
import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationPlayPKResult__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationPlayPKResult extends __CInvitationPlayPKResult__ {
	@Override
	protected void process() {
		// protocol handle 閺勵垰鎯侀崥灞惧壈閸掑洨顥�
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid<0){
			return;
		}
		if(acceptresult==1){
			//閸掋倖鏌囨稉?娴滄盯?鏄忕帆閿涘苯缍嬮崜宥嗘Ц娑撳秵妲搁崷銊ょ瀵姴婀撮崶鎾呯礉閹存牞?鍛Ц娑撳秵妲哥捄婵堫瀲婢额亣绻�
			xbean.Properties guestprop=xtable.Properties.select(guestid);
			if(guestprop.getCruise() > 0) {
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162103, null);
				return ;
			}
			//閸掋倖鏌囨稉銈勯嚋娴滅儤妲告稉宥嗘Ц閸︺劌鎮撴稉?娑擃亪妲︽导宥勮厬
			//閸掋倖鏌囬惄顔界垼閺勵垰鎯侀張澶愭Е娴煎稄绱濋棁?鐟曚浇?鍐閻╊喗鐖ｉ崷銊╂Е娴煎秳鑵戦惃鍕Ц閹�?
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			//閸掋倖鏌囬弰顖氭儊閺勵垯绔存稉顏堟Е娴煎秶娈戦幋鎰喅
			if (guestteam != null){
				if(guestteam.getAllMemberIds().contains(sourceid)){
					fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 160460, null);//閹绘劗銇氭稉宥堝厴闁�?鐠囧嘲鎮撶紒鍕Е閸�?
					CInvitationPlayPK.sendremoveTickTime(sourceid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
					return;
				}
			}
			// 閸掋倖鏌囨稉銈�?鍛闂傚娈戠捄婵堫瀲
			if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(guestid, sourceid)){
	            fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 120063, 0, null);
	            fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 120063, 0, null);
	            CInvitationPlayPK.sendremoveTickTime(sourceid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
	            return ;
			}
			BuffAgent hostAgent = new BuffRoleImpl(sourceid, true);
			if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
				MessageMgr.sendMsgNotify(guestid, 162126, Arrays.asList(new PropRole(sourceid,true).getName()));
				return ;
			}
			new PSendInvitePlayPK(sourceid,guestid).submit();
		}else{
			//閹锋帞绮烽崚鍥╊棎
			fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 160425, 0, null);
			CInvitationPlayPK.sendremoveTickTime(sourceid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793689;

	public int getType() {
		return 793689;
	}

	public long sourceid; // 发起邀请人的id
	public int acceptresult; // 0拒绝  1接受

	public CInvitationPlayPKResult() {
	}

	public CInvitationPlayPKResult(long _sourceid_, int _acceptresult_) {
		this.sourceid = _sourceid_;
		this.acceptresult = _acceptresult_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sourceid);
		_os_.marshal(acceptresult);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sourceid = _os_.unmarshal_long();
		acceptresult = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationPlayPKResult) {
			CInvitationPlayPKResult _o_ = (CInvitationPlayPKResult)_o1_;
			if (sourceid != _o_.sourceid) return false;
			if (acceptresult != _o_.acceptresult) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sourceid;
		_h_ += acceptresult;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sourceid).append(",");
		_sb_.append(acceptresult).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInvitationPlayPKResult _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(sourceid - _o_.sourceid);
		if (0 != _c_) return _c_;
		_c_ = acceptresult - _o_.acceptresult;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


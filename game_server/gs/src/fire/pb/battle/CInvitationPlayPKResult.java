
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
		// protocol handle 鏄惁鍚屾剰鍒囩
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid<0){
			return;
		}
		if(acceptresult==1){
			//鍒ゆ柇涓?浜涢?昏緫锛屽綋鍓嶆槸涓嶆槸鍦ㄤ竴寮犲湴鍥撅紝鎴栬?呮槸涓嶆槸璺濈澶繙
			xbean.Properties guestprop=xtable.Properties.select(guestid);
			if(guestprop.getCruise() > 0) {
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162103, null);
				return ;
			}
			//鍒ゆ柇涓や釜浜烘槸涓嶆槸鍦ㄥ悓涓?涓槦浼嶄腑
			//鍒ゆ柇鐩爣鏄惁鏈夐槦浼嶏紝闇?瑕佽?冭檻鐩爣鍦ㄩ槦浼嶄腑鐨勭姸鎬?
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			//鍒ゆ柇鏄惁鏄竴涓槦浼嶇殑鎴愬憳
			if (guestteam != null){
				if(guestteam.getAllMemberIds().contains(sourceid)){
					fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 160460, null);//鎻愮ず涓嶈兘閭?璇峰悓缁勯槦鍛?
					CInvitationPlayPK.sendremoveTickTime(sourceid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
					return;
				}
			}
			// 鍒ゆ柇涓よ?呬箣闂寸殑璺濈
			if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(guestid, sourceid)){
	            fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 120063, 0, null);
	            fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 120063, 0, null);
	            CInvitationPlayPK.sendremoveTickTime(sourceid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
	            return ;
			}
			BuffAgent hostAgent = new BuffRoleImpl(sourceid, true);
			if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
				MessageMgr.sendMsgNotify(guestid, 162126, Arrays.asList(new PropRole(sourceid,true).getName()));
				return ;
			}
			new PSendInvitePlayPK(sourceid,guestid).submit();
		}else{
			//鎷掔粷鍒囩
			fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 160425, 0, null);
			CInvitationPlayPK.sendremoveTickTime(sourceid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
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


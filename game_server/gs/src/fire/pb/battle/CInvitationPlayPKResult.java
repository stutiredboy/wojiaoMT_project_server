
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
		// protocol handle 闁哄嫷鍨伴幆渚�宕ョ仦鎯у闁告帒娲ㄩˉ锟�
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid<0){
			return;
		}
		if(acceptresult==1){
			//闁告帇鍊栭弻鍥ㄧ▔?濞存粍鐩�?閺勫繒甯嗛柨娑樿嫰缂嶅宕滃鍡樞﹀☉鎾崇У濡叉悂宕烽妸銈囶伇鐎殿喚濮村﹢鎾炊閹惧懐绀夐柟瀛樼墳?閸涱喗笑濞戞挸绉靛Σ鍝ユ崉濠靛牜鐎插棰濅海缁伙拷
			xbean.Properties guestprop=xtable.Properties.select(guestid);
			if(guestprop.getCruise() > 0) {
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162103, null);
				return ;
			}
			//闁告帇鍊栭弻鍥ㄧ▔閵堝嫰鍤嬪ù婊呭劋濡插憡绋夊鍡樞﹂柛锔哄妼閹挻绋�?濞戞搩浜Σ锔藉瀹ュ嫯鍘�
			//闁告帇鍊栭弻鍥儎椤旂晫鍨奸柡鍕靛灠閹線寮垫径鎰曞ù鐓庣▌缁辨繈妫�?閻熸洑娴�?閸愵厽顎氶柣鈺婂枟閻栵綁宕烽妸鈺傂曞ù鐓庣С閼垫垿鎯冮崟顓炐﹂柟锟�?
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍕靛灟缁斿瓨绋夐鍫熜曞ù鐓庣Ф濞堟垿骞嬮幇顒佸枀
			if (guestteam != null){
				if(guestteam.getAllMemberIds().contains(sourceid)){
					fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 160460, null);//闁圭粯鍔楅妵姘▔瀹ュ牆鍘撮梺锟�?閻犲洤鍢查幃鎾剁磼閸曨垱袝闁革拷?
					CInvitationPlayPK.sendremoveTickTime(sourceid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
					return;
				}
			}
			// 闁告帇鍊栭弻鍥ㄧ▔閵堬拷?閸涱剛顓洪梻鍌氼嚟濞堟垹鎹勫┑鍫��
			if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(guestid, sourceid)){
	            fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 120063, 0, null);
	            fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 120063, 0, null);
	            CInvitationPlayPK.sendremoveTickTime(sourceid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
	            return ;
			}
			BuffAgent hostAgent = new BuffRoleImpl(sourceid, true);
			if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
				MessageMgr.sendMsgNotify(guestid, 162126, Arrays.asList(new PropRole(sourceid,true).getName()));
				return ;
			}
			new PSendInvitePlayPK(sourceid,guestid).submit();
		}else{
			//闁归攱甯炵划鐑藉礆閸モ晩妫�
			fire.pb.talk.MessageMgr.sendMsgNotify(sourceid, 160425, 0, null);
			CInvitationPlayPK.sendremoveTickTime(sourceid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
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


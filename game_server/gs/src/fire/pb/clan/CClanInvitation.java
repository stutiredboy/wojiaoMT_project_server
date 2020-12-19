
package fire.pb.clan;

import java.util.Arrays;

import fire.pb.GameSystemConfig;
import fire.pb.SysConfigType;
import fire.pb.clan.srv.ClanBaseManager;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CClanInvitation__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CClanInvitation extends __CClanInvitation__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, true);
		if(clanInfo==null){
			MessageMgr.sendMsgNotify(roleid, 145077, null);
			return;
		}
		//杩囨护璁剧疆浜嗕笉璁╅個璇峰叕浼氱殑
		Integer refval = GameSystemConfig.getSysConfig(guestroleid, SysConfigType.refuseclan);
		if(refval != null && refval.intValue() == 1){
			MessageMgr.sendMsgNotify(roleid, 166061, null);
			return;
		}
		// 琚個璇风帺瀹舵湁鍏細
		if(ClanUtils.getClanInfoById(guestroleid, true)!=null){
			MessageMgr.sendMsgNotify(roleid, 145115, null);
			return;
		}
		// 瀵规柟绛夌骇涓嶈冻
		xbean.Properties properties = xtable.Properties.select(guestroleid);
		if (properties.getLevel() < ClanBaseManager.getInstance().getJoinClanLevel()) {// 鍒ゆ柇琚個璇峰叆浼氳?呯瓑绾?
			MessageMgr.sendMsgNotify(roleid, 160371, Arrays.asList(ClanBaseManager.getInstance().getJoinClanLevel()+""));
			return;
		}
		// 鍏細浜烘暟鏄惁杈惧埌涓婇檺
		if (ClanUtils.isClanMemberFull(clanInfo)) {
			// 鍏細婊″憳
			MessageMgr.sendMsgNotify(roleid, 145011, null);
			return;
		}
		//鍒ゆ柇杩欎釜鑱屼綅鏄惁宸茬粡婊′簡
		if(ClanUtils.isAddClanPositionFull(clanInfo)){
			MessageMgr.sendMsgNotify(roleid, 160310, null);
			return;
		}
		
		byte inviteType = 0;
//		// 浼氶暱鍜屽壇浼氶暱閭?璇?  杩樻湁鍥㈤暱
//		if( clanInfo.getClanmaster()==roleid || clanInfo.getClanvicemaster()==roleid){
//			inviteType = 1;
//		}
		xbean.ClanMemberInfo masterInfo = clanInfo.getMembers().get(roleid);
		if(masterInfo.getClanposition()>=ClanPositionType.ClanMaster&&masterInfo.getClanposition()<=ClanPositionType.ClanArmyGroup4){
			inviteType = 1;
		}
		SClanInvitation sClanInvitation = new SClanInvitation();
		sClanInvitation.clanlevel = clanInfo.getClanlevel();
		sClanInvitation.clannname = clanInfo.getClanname();
		sClanInvitation.hostrolename = new fire.pb.PropRole(roleid, true).getName();
		sClanInvitation.hostroleid = roleid;
		sClanInvitation.invitetype = inviteType;
		gnet.link.Onlines.getInstance().send(guestroleid, sClanInvitation);
		//鍙戦?佺郴缁熸彁绀?
		MessageMgr.sendMsgNotify(roleid, 172017, null);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808461;

	public int getType() {
		return 808461;
	}

	public long guestroleid;

	public CClanInvitation() {
	}

	public CClanInvitation(long _guestroleid_) {
		this.guestroleid = _guestroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(guestroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		guestroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CClanInvitation) {
			CClanInvitation _o_ = (CClanInvitation)_o1_;
			if (guestroleid != _o_.guestroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)guestroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(guestroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CClanInvitation _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(guestroleid - _o_.guestroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


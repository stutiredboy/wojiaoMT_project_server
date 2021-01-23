
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
		//閺夆晛娲﹂幎銈囨媼閸撗呮瀭濞存粌妫旂粭澶屾媼閳哄懎锟藉鎷犲畡鏉垮絾濞村吋姘ㄥ▓锟�
		Integer refval = GameSystemConfig.getSysConfig(guestroleid, SysConfigType.refuseclan);
		if(refval != null && refval.intValue() == 1){
			MessageMgr.sendMsgNotify(roleid, 166061, null);
			return;
		}
		// 閻炴凹鍋婇崐瀣嫚妞嬪骸璐熼悗纭呭煐濠�渚�宕楅璺ㄧ獥
		if(ClanUtils.getClanInfoById(guestroleid, true)!=null){
			MessageMgr.sendMsgNotify(roleid, 145115, null);
			return;
		}
		// 閻庝絻顫夐弻鐔虹驳婢跺矂鐛撳☉鎾崇Х閸愶拷
		xbean.Properties properties = xtable.Properties.select(guestroleid);
		if (properties.getLevel() < ClanBaseManager.getInstance().getJoinClanLevel()) {// 闁告帇鍊栭弻鍥╂偖椤愶箑锟藉鎷犲畡鏉垮汲濞村吋淇�?閸涱垳鎼肩紒锟�?
			MessageMgr.sendMsgNotify(roleid, 160371, Arrays.asList(ClanBaseManager.getInstance().getJoinClanLevel()+""));
			return;
		}
		// 闁稿浚鍏涚槐鐗堢閻戞ɑ娈堕柡鍕靛灠閹焦娼忛幆褍鐓傚☉鎾筹躬濡撅拷
		if (ClanUtils.isClanMemberFull(clanInfo)) {
			// 闁稿浚鍏涚槐鏉款煥閳ヨ櫕鍠�
			MessageMgr.sendMsgNotify(roleid, 145011, null);
			return;
		}
		//闁告帇鍊栭弻鍥ㄦ交濞嗗酣鍤嬮柤鍗炲缂嶅懘寮伴姘剨鐎规瓕灏欑划鈥愁煥閳ヨ尙鍟�
		if(ClanUtils.isAddClanPositionFull(clanInfo)){
			MessageMgr.sendMsgNotify(roleid, 160310, null);
			return;
		}
		
		byte inviteType = 0;
//		// 濞村吋宀搁弳閬嶅椽鐏炶棄顥屽ù鍏煎哺閺嗛亶鏌�?閻狅拷?  閺夆晜蓱濠�渚�宕堕姀銈嗘瘣
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
		//闁告瑦鍨�?娴ｆ椽鍏囩紓浣哄枑瑜颁胶绮�?
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



package fire.pb.team;



import fire.pb.PropRole;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.buff.OperateType;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCallbackMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 鍙洖
 * @author changhao
 *
 */
public class CCallbackMember extends __CCallbackMember__ {
	
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure callbackMemberP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//楠岃瘉璇ヨ鑹叉槸鍚﹁繕鏄槦浼嶉槦闀?
//				Long[] roleids = new Long[team.getAllMemberIds().size()];
//				roleids[0] = leaderRoleId;
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,team.getAllMemberIds()));
				//Lock end
				
				if(!checkTeamStatusValid(leaderRoleId))
				{
					//闃熶紞锛堥槦闀匡級鐨勭姸鎬佹鏃朵笉鑳藉彫鍥炴殏绂荤殑闃熷憳锛堜緥濡傚湪鎴樻枟椋炶涓級(illegal)
					TeamManager.logger.debug("闃熶紞锛堥槦闀匡級鐨勭姸鎬佹鏃朵笉鑳藉彫鍥炴殏绂婚槦鍛?,teamId: " + teamId);
					return true;
				}
				
				PropRole leaderprole = new PropRole(leaderRoleId, true);
				if(leaderprole.getProperties().getCruise() > 0) {
					TeamManager.logger.debug("闃熶紞锛堥槦闀匡級鐨勫贰娓哥姸鎬?,姝ゆ椂涓嶈兘鍙洖鏆傜闃熷憳,teamId: " + teamId);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 160434, null);
					return true;
				}
				
				PropRole callbackprole = new PropRole(memberid, true);
				if(callbackprole.getProperties().getCruise() > 0) {
					TeamManager.logger.debug("鍙洖闃熷憳鐨勫贰娓哥姸鎬?,姝ゆ椂涓嶈兘鍙洖鏆傜闃熷憳,teamId: " + teamId);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 160434, null);
					return true;
				}
				
				Long battleid = xtable.Roleid2battleid.select(memberid);
				if (battleid != null)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162134, null);
					return true;
				}
				
				java.util.List<Long> absentList = new java.util.LinkedList<Long>();
				absentList.addAll(team.getAbsentMemberIds());
				java.util.List<Long> callbacklist = new java.util.LinkedList<Long>();
				
				for(long roleId : absentList)
				{
					BuffAgent buffagent = new BuffRoleImpl(roleId);
					if(roleId == memberid && buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM_MEMBER_NORMAL))
					{
						//鑳借繘鍏ユ甯哥姸鎬佺殑闃熷憳鎵嶅彫鍞?
						callbacklist.add(roleId);
					}
				}
				//TODO 鍙戦?佺粰鏆傜闃熷憳鍜屽綊闃熶腑闃熷憳锛氶槦闀挎鍦ㄥ彫鍞?
				if(callbacklist.size() == 0)
				{
					//闃熶紞娌℃湁鍙彫鍞ょ殑鏆傜闃熷憳
					//psend(leaderRoleId,new STeamError(TeamError.NoAbsentMember));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 150117, null);
					TeamManager.logger.debug("闃熷憳涓嶈兘琚彫鍥炲彲鑳藉湪鎴樻枟,teamId: " + teamId);
					return true;
				}
				else
				{
					SAskforCallBack sAskforCallBack = new SAskforCallBack();
					sAskforCallBack.leaderid = leaderRoleId;
					psendWhileCommit(callbacklist, sAskforCallBack);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 140880, null);
				}
				
				
				return true;
			}
		};
		callbackMemberP.submit();
	}
	

	private boolean checkTeamStatusValid(long leaderRoleId)
	{
		BuffAgent agent = new BuffRoleImpl(leaderRoleId);
		return agent.canAddBuff(OperateType.TEAM_CALL_BACK_MEMBER);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794443;

	public int getType() {
		return 794443;
	}

	public long memberid; // 召唤的队员id by changhao

	public CCallbackMember() {
	}

	public CCallbackMember(long _memberid_) {
		this.memberid = _memberid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(memberid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		memberid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCallbackMember) {
			CCallbackMember _o_ = (CCallbackMember)_o1_;
			if (memberid != _o_.memberid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)memberid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(memberid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CCallbackMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(memberid - _o_.memberid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


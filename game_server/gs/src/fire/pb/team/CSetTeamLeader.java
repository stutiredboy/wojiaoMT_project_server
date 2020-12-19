
package fire.pb.team;
import fire.pb.StateCommon;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetTeamLeader__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 璁剧疆闃熼暱
 * @author changhao
 *
 */
public class CSetTeamLeader extends __CSetTeamLeader__ {
	private long now = 0L;//procedure寮?濮嬫椂淇濆瓨涓?涓綋鍓嶆椂闂达紝淇濊瘉姝rocedure涓椂闂寸殑缁熶竴鎬?
	
	Team team;
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long oldLeaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (oldLeaderRoleId < 0)
			return;
		final long newLeaderRoleId = roleid;
		mkdb.Procedure setTeamLeaderP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(oldLeaderRoleId);
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(oldLeaderRoleId))
					return true;//楠岃瘉鍘熼槦闀挎槸鍚﹁繕鏄槦浼嶇殑闃熼暱
				if(!team.isInTeam(newLeaderRoleId))
					return true;//楠岃瘉鏂伴槦闀挎槸鍚﹀湪闃熶紞涓?
				Long[] roleids = new Long[2];
				if(oldLeaderRoleId < newLeaderRoleId)
				{
					roleids[0] = oldLeaderRoleId;
					roleids[1] = newLeaderRoleId;
				}
				else
				{
					roleids[0] = newLeaderRoleId;
					roleids[1] = oldLeaderRoleId;
				}
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end

				now = System.currentTimeMillis();

				if (checkPvP(oldLeaderRoleId, newLeaderRoleId) != 0) {
					return true;
				}

				if(!checkLeaderOnline(oldLeaderRoleId))
				{
					//鐢宠鑰呬笉鍦ㄧ嚎锛坕llegal锛?
					TeamManager.logger.debug("FAIL:鐢宠鑰呬笉鍦ㄧ嚎,LeaderID: " +oldLeaderRoleId);
				}
				else if(!checkTeamStatusValid(team))
				{
					//闃熶紞澶勪簬涓嶅彲浠ユ崲闃熼暱鐨勭姸鎬侊紙鎴樻枟涓笉鑳芥崲闃熼暱锛?(illegal)
					TeamManager.logger.debug("FAIL:闃熶紞澶勪簬涓嶅彲浠ユ崲闃熼暱鐨勭姸鎬侊紙渚嬪椋炶銆佹垬鏂楋級,teamId: " +teamId);
				}
				else if(!checkTeamNotInSwitchStatus(team))
				{
					//闃熶紞澶勪簬鏇存崲闃熼暱鐢宠鐘舵??
					//psend(oldLeaderRoleId, new STeamError(TeamError.InChangeLeaderStatus));
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 141210, null);
					TeamManager.logger.debug("FAIL:闃熶紞澶勪簬鏇存崲闃熼暱鐢宠鐘舵??,teamId: " +teamId);
				}
				else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//闃熶紞2鍒嗛挓鍐呮垚鍔熸洿鎹㈣繃闃熼暱
					//psend(oldLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 141209, null);
					TeamManager.logger.debug("FAIL:闃熶紞2鍒嗛挓鍐呮垚鍔熸洿鎹㈣繃闃熼暱,teamId: " +teamId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//鏂伴槦闀夸笉澶勪簬姝ｅ父鐘舵??(鏆傜銆佺绾跨瓑鐘舵??)锛坕llgal锛?
					psend(newLeaderRoleId, new STeamError(TeamError.MembersNotNormal));
					TeamManager.logger.debug("FAIL:鏂伴槦闀夸笉澶勪簬姝ｅ父鐘舵??,newLeaderRoleId: " +newLeaderRoleId);
				}
				else if(StateCommon.isTrusteeshipState(newLeaderRoleId)) //濡傛灉鍦ㄦ柊闃熼暱鍦ㄦ墭绠＄姸鎬佷腑 by changhao
				{
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 160408, null);
				}
				else
				{
					BuffAgent buffagent = new BuffRoleImpl(newLeaderRoleId);
					if (!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER))
					{
						// 鏂伴槦闀垮浜庝笉鑳藉綋闃熼暱鐨勭姸鎬?
						TeamManager.logger.debug("FAIL:鏂伴槦闀垮浜庝笉鑳藉綋闃熼暱鐨勭姸鎬?,newLeaderRoleId: " + newLeaderRoleId);
					} else
					{
						TeamManager.logger.debug("SUCC:鍙互鍙戝嚭鏇存崲闃熼暱閭?璇?,teamId: " + teamId);
						team.getTeamInfo().setSwitchleaderid(newLeaderRoleId);
						team.getTeamInfo().setSwitchleadertime(now);
						SAskforSetLeader sAskforSetLeader = new SAskforSetLeader();
						sAskforSetLeader.leaderid = oldLeaderRoleId;
						
						TeamManager.getInstance().delTeamMatch(oldLeaderRoleId); //浜ゆ崲闃熼暱绂诲紑鍖归厤 by changhao
						
						psendWhileCommit(oldLeaderRoleId, new SRequestSetLeaderSucc(newLeaderRoleId));
						psendWhileCommit(newLeaderRoleId, sAskforSetLeader);
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(oldLeaderRoleId, 141251, null);
					}
				}

				return true;
			}
		};
		setTeamLeaderP.submit();
		
	}

	// 妫?娴婸VP
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 閲嶆柊璁剧疆闃熼暱
		return fire.pb.battle.pvp.PvPTeamHandle.onSetTeamLeader(oldLeaderRoleId, newLeaderRoleId);
	}

//	// 鐢宠鑰呮槸涓?涓槦浼嶇殑闃熼暱锛熷彧鑳藉湪Procedure涓璋冪敤
//	private boolean checkOldLeaderInTeam(long leaderRoleId,Team team)
//	{
//		if(team.getTeamInfo().getTeamleaderid() == leaderRoleId)
//			return true;
//		else
//			return false;
//	}
	
	// 鐢宠鑰呭湪绾??鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//闃熶紞澶勪簬鍙互鎹㈤槦闀跨殑鐘舵?侊紵锛堥琛岋紝鎴樻枟涓笉鑳芥崲闃熼暱锛岃繕鏈夊叾浠栫姸鎬佸悧锛燂級
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent buffagent = new BuffRoleImpl(team.getTeamLeaderId());
		int conflictId = buffagent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//闃熶紞涓嶅浜庢洿鎹㈤槦闀跨敵璇风姸鎬侊紵
	private boolean checkTeamNotInSwitchStatus(Team team)
	{
		if(team.getTeamInfo().getSwitchleaderid() == -1)
			return true;
		else if((now - team.getTeamInfo().getSwitchleadertime()) > TeamManager.MAX_INVITE_TIMEOUT )
		{
			team.getTeamInfo().setSwitchleaderid(-1);
			return true;
		}
		else
			return false;
	}
	
	//闃熶紞2鍒嗛挓鍐呮湭鏇存崲杩囬槦闀匡紵
	private boolean checkTeamNoSuccSwitchIn2min(Team team)
	{
		if((now - team.getTeamInfo().getSuccessswitchtime()) > TeamManager.MIN_SUCCESS_SWITCH_LEADER_PERIOD )
			return true;
		else
			return false;
	}
	
	//鏂伴槦闀垮浜庢甯哥姸鎬侊紵鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkNewLeaderNormal(Team team, long memberRoleId)
	{
		for(xbean.TeamMember member: team.getTeamInfo().getMembers())
		{
			if(member.getRoleid() == memberRoleId)
			{
				if(member.getState() == TeamMemberState.eTeamAbsent)
					return false;
				else
					return true;
			}
		}
		return false;
	}
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794444;

	public int getType() {
		return 794444;
	}

	public long roleid;

	public CSetTeamLeader() {
	}

	public CSetTeamLeader(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetTeamLeader) {
			CSetTeamLeader _o_ = (CSetTeamLeader)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetTeamLeader _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


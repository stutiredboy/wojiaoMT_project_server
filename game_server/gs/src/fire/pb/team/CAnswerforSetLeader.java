
package fire.pb.team;
import fire.pb.StateCommon;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAnswerforSetLeader__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAnswerforSetLeader extends __CAnswerforSetLeader__ {
	
	private long now = 0L;//procedure寮?濮嬫椂淇濆瓨涓?涓綋鍓嶆椂闂达紝淇濊瘉姝rocedure涓椂闂寸殑缁熶竴鎬?
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long newLeaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (newLeaderRoleId < 0)
			return;
		mkdb.Procedure setTeamLeaderP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start
				Long teamId = xtable.Roleid2teamid.select(newLeaderRoleId);
				now = System.currentTimeMillis();
				
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;

				long oldLeaderRoleId = team.getTeamInfo().getTeamleaderid();
				if(!team.isInTeam(newLeaderRoleId))
				{
					TeamManager.logger.debug("鍥炲簲鑰呬笉鏄竴涓槦浼嶇殑闃熷憳, newLeaderRoleId: " + newLeaderRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141056, null);
					psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
					return true;
				}
				if(team.isTeamLeader(newLeaderRoleId))
				{
					TeamManager.logger.debug("鍥炲簲鑰呭凡缁忔槸闃熼暱, newLeaderRoleId: " + newLeaderRoleId);
					return true;
				}
				
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

				if(agree == 0)
				{//鎷掔粷鎴愪负闃熼暱
					if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
					{
						//鍥炲簲鑰呬笉鏄浠诲懡鐨勬柊闃熼暱(illegal)
						TeamManager.logger.debug("FAIL:鍥炲簲鑰呬笉鏄浠诲懡鐨勬柊闃熼暱, teamId: " + teamId);
						psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
						return true;
					}
					team.getTeamInfo().setSwitchleaderid(-1);
					team.getTeamInfo().setSwitchleadertime(-1);
					psend(oldLeaderRoleId, new STeamError(TeamError.RefuseChangeLeader));
					TeamManager.logger.debug("SUCC:鎷掔粷鎴愪负闃熼暱, roleid: " + newLeaderRoleId);
					return true;
				}

				if (checkPvP(oldLeaderRoleId, newLeaderRoleId) != 0) {
					return true;
				}

				if(!checkLeaderOnline(newLeaderRoleId))
				{
					//鍥炲簲鑰呬笉鍦ㄧ嚎(illegal)
					TeamManager.logger.debug("FAIL:鍥炲簲鑰呬笉鍦ㄧ嚎, roleid: " + newLeaderRoleId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//鍥炲簲鑰呭浜庨潪姝ｅ父鐘舵?侊紙鏆傜銆佷笅绾跨瓑锛?(illegal)
					TeamManager.logger.debug("FAIL:鍥炲簲鑰呭浜庨潪姝ｅ父鐘舵?侊紙鏆傜銆佷笅绾跨瓑锛?, roleid: " + newLeaderRoleId);
					MessageMgr.psendMsgNotifyWhileCommit(team.getTeamLeaderId(), 141671, null);
					MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141671, null);
				}
				else if(!checkTeamStatusValid(team))
				{
					//闃熶紞澶勪簬涓嶅彲鎹㈤槦闀跨姸鎬侊紙椋炶鎴栨垬鏂椾笉鑳斤級(illegal)
					TeamManager.logger.debug("FAIL:闃熶紞澶勪簬涓嶅彲鎹㈤槦闀跨姸鎬侊紙椋炶鎴栨垬鏂椾笉鑳斤級, teamId: " + teamId);
				}
				else if(!checkTeamInSwitchStatus(team))
				{
					//闃熶紞涓嶅浜庢洿鎹㈤槦闀跨敵璇风姸鎬佹垨鑰呰秴鏃?(illegal)
					TeamManager.logger.debug("FAIL:闃熶紞涓嶅浜庢洿鎹㈤槦闀跨敵璇风姸鎬佹垨鑰呰秴鏃?, teamId: " + teamId);
				}
				else if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
				{
					//鍥炲簲鑰呬笉鏄浠诲懡鐨勬柊闃熼暱(illegal)
					TeamManager.logger.debug("FAIL:鍥炲簲鑰呬笉鏄浠诲懡鐨勬柊闃熼暱, teamId: " + teamId);
				}
				/*else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//闃熶紞2鍒嗛挓鍙兘鏇存崲闃熼暱涓?娆?
					psend(newLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					TeamManager.logger.debug("FAIL:闃熶紞2鍒嗛挓鍙兘鏇存崲闃熼暱涓?娆?, teamId: " + teamId);
				}*/
				else
				{
					
					//xbean.TeamInfo team = xtable.Team.get(team);
					if(team.switchTeamLeaderWithSP(newLeaderRoleId))
					{
						team.getTeamInfo().setSuccessswitchtime(now);
						TeamManager.logger.debugWhileCommit("SUCC:闃熶紞鏇存崲闃熼暱, teamId: " + teamId);
					}
					else
						TeamManager.logger.debug("FAIL:闃熶紞鏇存崲闃熼暱澶辫触, teamId: " + teamId);
				}
					 
				return true;
			}
		};
		setTeamLeaderP.submit();
	}

	// 妫?娴婸VP
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 鍥炵瓟鏄惁鎺ュ彈闃熼暱浠诲懡
		return fire.pb.battle.pvp.PvPTeamHandle.onAnswerforSetLeader(oldLeaderRoleId, newLeaderRoleId);
	}

	// 鍥炲簲鑰呭湪绾??鍙兘鍦≒rocedure涓璋冪敤锛岄攣leaderRoleId鐨剅olelock
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//鍥炲簲鑰呭浜庢甯哥姸鎬侊紵鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkNewLeaderNormal(Team team, long memberRoleId)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		for(xbean.TeamMember member: team.getTeamInfo().getMembers())
		{
			if(member.getRoleid() == memberRoleId && member.getState() == fire.pb.team.TeamMemberState.eTeamNormal)
				return true;
		}
		return false;
	}
	
	
	//闃熶紞澶勪簬鍙互鎹㈤槦闀跨殑鐘舵?侊紵锛堥琛岋紝鎴樻枟涓笉鑳芥崲闃熼暱锛岃繕鏈夊叾浠栫姸鎬佸悧锛燂級
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent agent = new BuffRoleImpl(team.getTeamLeaderId(),true);
		int conflictId = agent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//闃熶紞澶勪簬鏇存崲闃熼暱鐢宠鐘舵?佸苟涓旀湭瓒呮椂锛?
	private boolean checkTeamInSwitchStatus(Team team)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		if(team.getTeamInfo().getSwitchleaderid() == -1)
			return false;
		else if((now - team.getTeamInfo().getSwitchleadertime()) > TeamManager.MAX_INVITE_TIMEOUT )
		{
			team.getTeamInfo().setSwitchleaderid(-1);
			return false;
		}
		else
			return true;
	}
	
	//鍥炲簲鑰呭氨鏄柊闃熼暱锛?
	private boolean checkAnwserIsNewLeader(Team team , long newLeaderId)
	{
		if(team.getTeamInfo().getSwitchleaderid() == newLeaderId)
			return true;
		else
			return false;
	}
	
	//闃熶紞2鍒嗛挓鍐呮湭鎴愬姛鏇存崲杩囬槦闀匡紵
	private boolean checkTeamNoSuccSwitchIn2min(Team team)
	{
		if((now - team.getTeamInfo().getSuccessswitchtime()) > TeamManager.MIN_SUCCESS_SWITCH_LEADER_PERIOD )
			return true;
		else
			return false;
	}
	
	
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794455;

	public int getType() {
		return 794455;
	}

	public byte agree; // 0 拒绝 1同意

	public CAnswerforSetLeader() {
	}

	public CAnswerforSetLeader(byte _agree_) {
		this.agree = _agree_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(agree);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		agree = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAnswerforSetLeader) {
			CAnswerforSetLeader _o_ = (CAnswerforSetLeader)_o1_;
			if (agree != _o_.agree) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)agree;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(agree).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAnswerforSetLeader _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


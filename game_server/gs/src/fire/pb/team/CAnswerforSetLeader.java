
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
	
	private long now = 0L;//procedure�?始时保存�?个当前时间，保证此procedure中时间的统一�?
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
				
				//先验证队伍是否为�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;

				long oldLeaderRoleId = team.getTeamInfo().getTeamleaderid();
				if(!team.isInTeam(newLeaderRoleId))
				{
					TeamManager.logger.debug("回应者不是一个队伍的队员, newLeaderRoleId: " + newLeaderRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141056, null);
					psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
					return true;
				}
				if(team.isTeamLeader(newLeaderRoleId))
				{
					TeamManager.logger.debug("回应者已经是队长, newLeaderRoleId: " + newLeaderRoleId);
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
				{//拒绝成为队长
					if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
					{
						//回应者不是要任命的新队长(illegal)
						TeamManager.logger.debug("FAIL:回应者不是要任命的新队长, teamId: " + teamId);
						psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
						return true;
					}
					team.getTeamInfo().setSwitchleaderid(-1);
					team.getTeamInfo().setSwitchleadertime(-1);
					psend(oldLeaderRoleId, new STeamError(TeamError.RefuseChangeLeader));
					TeamManager.logger.debug("SUCC:拒绝成为队长, roleid: " + newLeaderRoleId);
					return true;
				}

				if (checkPvP(oldLeaderRoleId, newLeaderRoleId) != 0) {
					return true;
				}

				if(!checkLeaderOnline(newLeaderRoleId))
				{
					//回应者不在线(illegal)
					TeamManager.logger.debug("FAIL:回应者不在线, roleid: " + newLeaderRoleId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//回应者处于非正常状�?�（暂离、下线等�?(illegal)
					TeamManager.logger.debug("FAIL:回应者处于非正常状�?�（暂离、下线等�?, roleid: " + newLeaderRoleId);
					MessageMgr.psendMsgNotifyWhileCommit(team.getTeamLeaderId(), 141671, null);
					MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141671, null);
				}
				else if(!checkTeamStatusValid(team))
				{
					//队伍处于不可换队长状态（飞行或战斗不能）(illegal)
					TeamManager.logger.debug("FAIL:队伍处于不可换队长状态（飞行或战斗不能）, teamId: " + teamId);
				}
				else if(!checkTeamInSwitchStatus(team))
				{
					//队伍不处于更换队长申请状态或者超�?(illegal)
					TeamManager.logger.debug("FAIL:队伍不处于更换队长申请状态或者超�?, teamId: " + teamId);
				}
				else if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
				{
					//回应者不是要任命的新队长(illegal)
					TeamManager.logger.debug("FAIL:回应者不是要任命的新队长, teamId: " + teamId);
				}
				/*else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//队伍2分钟只能更换队长�?�?
					psend(newLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					TeamManager.logger.debug("FAIL:队伍2分钟只能更换队长�?�?, teamId: " + teamId);
				}*/
				else
				{
					
					//xbean.TeamInfo team = xtable.Team.get(team);
					if(team.switchTeamLeaderWithSP(newLeaderRoleId))
					{
						team.getTeamInfo().setSuccessswitchtime(now);
						TeamManager.logger.debugWhileCommit("SUCC:队伍更换队长, teamId: " + teamId);
					}
					else
						TeamManager.logger.debug("FAIL:队伍更换队长失败, teamId: " + teamId);
				}
					 
				return true;
			}
		};
		setTeamLeaderP.submit();
	}

	// �?测PVP
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 回答是否接受队长任命
		return fire.pb.battle.pvp.PvPTeamHandle.onAnswerforSetLeader(oldLeaderRoleId, newLeaderRoleId);
	}

	// 回应者在�??只能在Procedure中被调用，锁leaderRoleId的rolelock
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//回应者处于正常状态？只能在Procedure中被调用
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
	
	
	//队伍处于可以换队长的状�?�？（飞行，战斗中不能换队长，还有其他状态吗？）
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent agent = new BuffRoleImpl(team.getTeamLeaderId(),true);
		int conflictId = agent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//队伍处于更换队长申请状�?�并且未超时�?
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
	
	//回应者就是新队长�?
	private boolean checkAnwserIsNewLeader(Team team , long newLeaderId)
	{
		if(team.getTeamInfo().getSwitchleaderid() == newLeaderId)
			return true;
		else
			return false;
	}
	
	//队伍2分钟内未成功更换过队长？
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

	public byte agree; // 0 �ܾ� 1ͬ��

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


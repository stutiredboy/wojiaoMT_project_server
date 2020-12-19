
package fire.pb.team;
import java.util.ArrayList;
import java.util.List;

import fire.pb.PropRole;
import fire.pb.StateCommon;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.buff.OperateType;
import fire.pb.event.LeaveTeamSpecialQuestEvent;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CExpelMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 璇风闃熷憳
 * @author changhao
 *
 */
public class CExpelMember extends __CExpelMember__ {
	
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		final long expeledRoleId = roleid;
		mkdb.Procedure expelMemberP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//楠岃瘉璇ヨ鑹叉槸鍚﹁繕鏄槦浼嶇殑闃熼暱
				Long[] roleids = new Long[2];
				if(leaderRoleId < expeledRoleId)
				{
					roleids[0] = leaderRoleId;
					roleids[1] = expeledRoleId;
				}
				else
				{
					roleids[0] = expeledRoleId;
					roleids[1] = leaderRoleId;
				}
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end

				if (checkPvP(leaderRoleId, expeledRoleId) != 0) {
					return true;
				}

				if(!checkLeaderInTeam(leaderRoleId, team))
				{
					//韪汉鑰呬笉鍦ㄩ槦浼嶄腑鎴栬?呬笉鏄槦闀?(illegal)
					TeamManager.logger.debug("FAIL:韪汉鑰呬笉鍦ㄩ槦浼嶄腑鎴栬?呬笉鏄槦闀?,韪汉鑰匢d: "+ leaderRoleId);
				}
				else if(!checkLeaderOnline(leaderRoleId))
				{
					//TODO 韪汉鑰呬笉鍦ㄧ嚎(illegal)
					TeamManager.logger.debug("FAIL:韪汉鑰呬笉鍦ㄧ嚎,韪汉鑰匢d: "+ leaderRoleId);
				}
				else if(!checkExpeledIsMember(team, expeledRoleId))
				{
					//TODO 琚涪鑰呬笉鏄涪浜鸿?呴槦浼嶆垚鍛?(illegal)
					TeamManager.logger.debug("FAIL:琚涪鑰呬笉鏄涪浜鸿?呴槦浼嶆垚鍛?,琚涪鑰匢d: "+ expeledRoleId);
				}
				else if(!checkTeamLeaderState(leaderRoleId))
				{
					//TODO 闃熶紞鐘舵?佷笉鍏佽(illegal)
					TeamManager.logger.debug("FAIL:闃熶紞鐘舵?佷笉鍏佽,琚涪鑰匢d: "+ expeledRoleId);
				}
				else
				{
					team.removeTeamMemberWithSP(expeledRoleId,false);
					
					//鍚戣绂婚槦鑰呭彂閫佹秷鎭?
					PropRole prole = new PropRole(team.getTeamInfo().getTeamleaderid(), true);
					List<String> name = new ArrayList<String>();
					name.add(prole.getName());
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(expeledRoleId, 140641, name);
					PropRole expelrole = new PropRole(expeledRoleId, true);
					List<String> expelname = new ArrayList<String>();
					expelname.add(expelrole.getName());
					for(long memberId : team.getAllMemberIds())
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(memberId,141208,expelname);
					TeamManager.logger.debug("SUCC:闃熶紞韪汉,琚涪鑰匢d: "+ expeledRoleId);
				}
	//			FactionPatrol.setRoleTaskFailed(expeledRoleId);  //琚涪鍑洪槦浼嶅悗锛屾湁甯淳鍥涙柟宸¤浠诲姟鐨勮鑹茶璁颁换鍔″け璐?
				fire.pb.event.Poster.getPoster().dispatchEvent(new LeaveTeamSpecialQuestEvent(expeledRoleId));
				return true;
			}
		};
		expelMemberP.submit();
		
	}

	// 妫?娴婸VP
	private static int checkPvP(long leaderRoleId, long expeledRoleId) {
		// 璇风闃熷憳
		return fire.pb.battle.pvp.PvPTeamHandle.onExpelMember(leaderRoleId, expeledRoleId);
	}
	
	// 韪汉鑰呮槸涓?涓槦浼嶇殑闃熼暱锛??鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkLeaderInTeam(long leaderRoleId,Team team)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		if(team.getTeamInfo() != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;

	}
	
	// 韪汉鑰呭湪绾??鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//琚涪鑰呮槸闃熼暱闃熶紞鐨勯槦鍛橈紵鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkExpeledIsMember(Team team, long expeledRoleId)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		for(xbean.TeamMember member: team.getTeamInfo().getMembers())
		{
			if(member.getRoleid() == expeledRoleId)
				return true;
		}
		return false;
	}
	
	// 閭?璇疯?呯姸鎬佷笉鍏佽? 鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkTeamLeaderState(long roleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(roleId);
		return buffagent.canAddBuff(OperateType.TEAM_EXPEL_MEMBER);
	}
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794442;

	public int getType() {
		return 794442;
	}

	public long roleid;

	public CExpelMember() {
	}

	public CExpelMember(long _roleid_) {
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
		if (_o1_ instanceof CExpelMember) {
			CExpelMember _o_ = (CExpelMember)_o1_;
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

	public int compareTo(CExpelMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
 * 鐠囬顬囬梼鐔锋喅
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
				//閸忓牓鐛欑拠渚�妲︽导宥嗘Ц閸氾缚璐熺粚?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//妤犲矁鐦夌拠銉潡閼瑰弶妲搁崥锕佺箷閺勵垶妲︽导宥囨畱闂冪喖鏆�
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
					//闊澀姹夐懓鍛瑝閸︺劑妲︽导宥勮厬閹存牞?鍛瑝閺勵垶妲﹂梹?(illegal)
					TeamManager.logger.debug("FAIL:闊澀姹夐懓鍛瑝閸︺劑妲︽导宥勮厬閹存牞?鍛瑝閺勵垶妲﹂梹?,闊澀姹夐懓鍖: "+ leaderRoleId);
				}
				else if(!checkLeaderOnline(leaderRoleId))
				{
					//TODO 闊澀姹夐懓鍛瑝閸︺劎鍤�(illegal)
					TeamManager.logger.debug("FAIL:闊澀姹夐懓鍛瑝閸︺劎鍤�,闊澀姹夐懓鍖: "+ leaderRoleId);
				}
				else if(!checkExpeledIsMember(team, expeledRoleId))
				{
					//TODO 鐞氼偉娑懓鍛瑝閺勵垵娑禍楦�?鍛存Е娴煎秵鍨氶崨?(illegal)
					TeamManager.logger.debug("FAIL:鐞氼偉娑懓鍛瑝閺勵垵娑禍楦�?鍛存Е娴煎秵鍨氶崨?,鐞氼偉娑懓鍖: "+ expeledRoleId);
				}
				else if(!checkTeamLeaderState(leaderRoleId))
				{
					//TODO 闂冪喍绱為悩鑸�?浣风瑝閸忎浇顔�(illegal)
					TeamManager.logger.debug("FAIL:闂冪喍绱為悩鑸�?浣风瑝閸忎浇顔�,鐞氼偉娑懓鍖: "+ expeledRoleId);
				}
				else
				{
					team.removeTeamMemberWithSP(expeledRoleId,false);
					
					//閸氭垼顫︾粋濠氭Е閼板懎褰傞柅浣圭Х閹�?
					PropRole prole = new PropRole(team.getTeamInfo().getTeamleaderid(), true);
					List<String> name = new ArrayList<String>();
					name.add(prole.getName());
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(expeledRoleId, 140641, name);
					PropRole expelrole = new PropRole(expeledRoleId, true);
					List<String> expelname = new ArrayList<String>();
					expelname.add(expelrole.getName());
					for(long memberId : team.getAllMemberIds())
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(memberId,141208,expelname);
					TeamManager.logger.debug("SUCC:闂冪喍绱為煪顫眽,鐞氼偉娑懓鍖: "+ expeledRoleId);
				}
	//			FactionPatrol.setRoleTaskFailed(expeledRoleId);  //鐞氼偉娑崙娲Е娴煎秴鎮楅敍灞炬箒鐢喗娣抽崶娑欐煙瀹嘎ゎ潒娴犺濮熼惃鍕潡閼硅尪顩︾拋棰佹崲閸斺�炽亼鐠�?
				fire.pb.event.Poster.getPoster().dispatchEvent(new LeaveTeamSpecialQuestEvent(expeledRoleId));
				return true;
			}
		};
		expelMemberP.submit();
		
	}

	// 濡�?濞村└VP
	private static int checkPvP(long leaderRoleId, long expeledRoleId) {
		// 鐠囬顬囬梼鐔锋喅
		return fire.pb.battle.pvp.PvPTeamHandle.onExpelMember(leaderRoleId, expeledRoleId);
	}
	
	// 闊澀姹夐懓鍛Ц娑�?娑擃亪妲︽导宥囨畱闂冪喖鏆遍敍??閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkLeaderInTeam(long leaderRoleId,Team team)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		if(team.getTeamInfo() != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;

	}
	
	// 闊澀姹夐懓鍛躬缁�??閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//鐞氼偉娑懓鍛Ц闂冪喖鏆遍梼鐔剁礊閻ㄥ嫰妲﹂崨姗堢吹閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
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
	
	// 闁�?鐠囩柉?鍛Ц閹椒绗夐崗浣筋啅? 閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
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


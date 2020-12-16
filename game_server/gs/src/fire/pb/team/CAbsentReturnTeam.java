package fire.pb.team;

import fire.pb.PropRole;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbsentReturnTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
//暂离或回归队�? by changhao
public class CAbsentReturnTeam extends __CAbsentReturnTeam__ {

	private Team team;

	@Override
	protected void process() {
		TeamManager.logger.debug("Enter: " + this.getClass());
		// protocol handle
		final long memberRoleId = gnet.link.Onlines.getInstance().findRoleid(
				this);
		if (memberRoleId < 0)
			return;
		if (checkPvP(memberRoleId, absent) != 0) {
			return;
		}

		PAbsentReturnTeam absentReturnTeamP = new PAbsentReturnTeam(
				memberRoleId, absent);

		if (absent == 1)
		{ //如果暂离的话 by changhao
			absentReturnTeamP.submit();
		} 
		/*
		else if (absent == 2) //请求回归(应对同地图客户端自动�?始寻路问�?)
		{
			Long teamId = xtable.Roleid2teamid.select(memberRoleId);
			if (teamId != null)
				team = new Team(teamId, true);
			else
				return;
			
			if (!team.isInTeam(memberRoleId))
				return;
			long leaderRoleId = team.getTeamInfo().getTeamleaderid();
			PropRole prole = new PropRole(leaderRoleId, true);
			SAbsentReturnTeam sendret = new SAbsentReturnTeam();		
			if(prole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("队伍（队长）的巡游状�?,此时不能归队,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160435, null);
				sendret.ret = 0;
			} else {
				sendret.ret = 1;
			}
			gnet.link.Onlines.getInstance().send(memberRoleId, sendret);
			return;
		}
		*/
		else
		{
			Long teamId = xtable.Roleid2teamid.select(memberRoleId);

			if (teamId != null)
				team = new Team(teamId, true);
			else
				return;
			
			//是否在队伍中 by changhao
			if (!team.isInTeam(memberRoleId))
				return;
			
			long leaderRoleId = team.getTeamInfo().getTeamleaderid();
			PropRole prole = new PropRole(leaderRoleId, true);
			if(prole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("队伍（队长）的巡游状�?,此时不能归队,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160435, null);
				return;
			}
			PropRole pmemrole = new PropRole(memberRoleId, true);
			if(pmemrole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("队伍（队员）的巡游状�?,此时不能归队,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160436, null);
				return;
			}
			
			Long leaderclanfightid = xtable.Roleid2clanfightid.select(leaderRoleId); //如果队长在公会战场不能回归队�? by changhao
			if (leaderclanfightid != null)
			{
				Long memberclanfightid = xtable.Roleid2clanfightid.select(memberRoleId);
				if (!leaderclanfightid.equals(memberclanfightid))
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 410020, null); //队长在公会战场内部能回归 by changhao
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410021, null); //队员在公会战场外不能回归 by changhao
					return;
				}
			}
			
			Role memberRole = RoleManager.getInstance().getRoleByID(memberRoleId);
			Role leaderRole = RoleManager.getInstance().getRoleByID(leaderRoleId);
			if (memberRole == null || leaderRole == null)
			{
				TeamManager.logger.error("can't get role scene when return team");
				return;
			}
			
			if (memberRole.getScene() == leaderRole.getScene()) //如果和队伍在同一个场�? by changhao
			{
				//拉到队长�? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 1);
				go.submit();				
				//absentReturnTeamP.submit();
			}
			else
			{
				//拉到队长�? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 2);
				go.submit();
			}
		}
	}

	// �?测PVP
	private static int checkPvP(long roleId, byte absent) {
		// 暂离或回�?
		return fire.pb.battle.pvp.PvPTeamHandle.onAbsentReturn(roleId, absent);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794441;

	public int getType() {
		return 794441;
	}

	public byte absent; // 1��ʾ���� 0��ʾ�ع�

	public CAbsentReturnTeam() {
	}

	public CAbsentReturnTeam(byte _absent_) {
		this.absent = _absent_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(absent);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		absent = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbsentReturnTeam) {
			CAbsentReturnTeam _o_ = (CAbsentReturnTeam)_o1_;
			if (absent != _o_.absent) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)absent;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(absent).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbsentReturnTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = absent - _o_.absent;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

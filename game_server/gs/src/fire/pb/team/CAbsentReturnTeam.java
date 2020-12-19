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
//鏆傜鎴栧洖褰掗槦浼? by changhao
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
		{ //濡傛灉鏆傜鐨勮瘽 by changhao
			absentReturnTeamP.submit();
		} 
		/*
		else if (absent == 2) //璇锋眰鍥炲綊(搴斿鍚屽湴鍥惧鎴风鑷姩寮?濮嬪璺棶棰?)
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
				TeamManager.logger.debug("闃熶紞锛堥槦闀匡級鐨勫贰娓哥姸鎬?,姝ゆ椂涓嶈兘褰掗槦,teamId: " + teamId);
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
			
			//鏄惁鍦ㄩ槦浼嶄腑 by changhao
			if (!team.isInTeam(memberRoleId))
				return;
			
			long leaderRoleId = team.getTeamInfo().getTeamleaderid();
			PropRole prole = new PropRole(leaderRoleId, true);
			if(prole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闃熶紞锛堥槦闀匡級鐨勫贰娓哥姸鎬?,姝ゆ椂涓嶈兘褰掗槦,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160435, null);
				return;
			}
			PropRole pmemrole = new PropRole(memberRoleId, true);
			if(pmemrole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闃熶紞锛堥槦鍛橈級鐨勫贰娓哥姸鎬?,姝ゆ椂涓嶈兘褰掗槦,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160436, null);
				return;
			}
			
			Long leaderclanfightid = xtable.Roleid2clanfightid.select(leaderRoleId); //濡傛灉闃熼暱鍦ㄥ叕浼氭垬鍦轰笉鑳藉洖褰掗槦浼? by changhao
			if (leaderclanfightid != null)
			{
				Long memberclanfightid = xtable.Roleid2clanfightid.select(memberRoleId);
				if (!leaderclanfightid.equals(memberclanfightid))
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 410020, null); //闃熼暱鍦ㄥ叕浼氭垬鍦哄唴閮ㄨ兘鍥炲綊 by changhao
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410021, null); //闃熷憳鍦ㄥ叕浼氭垬鍦哄涓嶈兘鍥炲綊 by changhao
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
			
			if (memberRole.getScene() == leaderRole.getScene()) //濡傛灉鍜岄槦浼嶅湪鍚屼竴涓満鏅? by changhao
			{
				//鎷夊埌闃熼暱閭? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 1);
				go.submit();				
				//absentReturnTeamP.submit();
			}
			else
			{
				//鎷夊埌闃熼暱閭? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 2);
				go.submit();
			}
		}
	}

	// 妫?娴婸VP
	private static int checkPvP(long roleId, byte absent) {
		// 鏆傜鎴栧洖褰?
		return fire.pb.battle.pvp.PvPTeamHandle.onAbsentReturn(roleId, absent);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794441;

	public int getType() {
		return 794441;
	}

	public byte absent; // 1表示暂离 0表示回归

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

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
//闁哄棗鍊婚‖鍥箣閺嵮勭鐟滅増甯″Σ锔藉? by changhao
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
		{ //濠碘�冲�归悘澶愬汲閸屾粠鐎查柣銊ュ閻︼拷 by changhao
			absentReturnTeamP.submit();
		} 
		/*
		else if (absent == 2) //閻犲洭鏀遍惇浼村炊閻愯尙绉�(閹煎瓨鏌ㄩ顕�宕ョ仦鑺ュ嬀闁搞儲鍎抽褰掑箣妞嬪寒浼傞柤濂変簻婵晛顕�?濠殿喖顑呴鎵崉椤栫偞锛栧Λ锟�?)
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
				TeamManager.logger.debug("闂傚啰鍠嶇槐鐐烘晬閸儲袝闂傦拷閸栵紕绀嗛柣銊ュ鐠愭澘銆掗崫銉バ﹂柟锟�?,婵縿鍊栧鍌涚▔瀹ュ牆鍘寸憸鐗堝浮濡诧拷,teamId: " + teamId);
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
			
			//闁哄嫷鍨伴幆渚�宕烽妸鈺傂曞ù鐓庣С閼碉拷 by changhao
			if (!team.isInTeam(memberRoleId))
				return;
			
			long leaderRoleId = team.getTeamInfo().getTeamleaderid();
			PropRole prole = new PropRole(leaderRoleId, true);
			if(prole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闂傚啰鍠嶇槐鐐烘晬閸儲袝闂傦拷閸栵紕绀嗛柣銊ュ鐠愭澘銆掗崫銉バ﹂柟锟�?,婵縿鍊栧鍌涚▔瀹ュ牆鍘寸憸鐗堝浮濡诧拷,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160435, null);
				return;
			}
			PropRole pmemrole = new PropRole(memberRoleId, true);
			if(pmemrole.getProperties().getCruise() > 0) {
				TeamManager.logger.debug("闂傚啰鍠嶇槐鐐烘晬閸儲袝闁告稒锕槐姘舵儍閸曨偉绐楁繛鎾虫憸婵悂骞�?,婵縿鍊栧鍌涚▔瀹ュ牆鍘寸憸鐗堝浮濡诧拷,teamId: " + teamId);
				fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 160436, null);
				return;
			}
			
			Long leaderclanfightid = xtable.Roleid2clanfightid.select(leaderRoleId); //濠碘�冲�归悘澶愭⒓閻斿吋姣愰柛锔哄妼閸欐洘瀵煎顓炵仜闁革箒妗ㄧ粭澶愭嚄閽樺绀�鐟滅増甯″Σ锔藉? by changhao
			if (leaderclanfightid != null)
			{
				Long memberclanfightid = xtable.Roleid2clanfightid.select(memberRoleId);
				if (!leaderclanfightid.equals(memberclanfightid))
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(memberRoleId, 410020, null); //闂傚啰鍠栭弳閬嶅捶閵娿儱褰嗗ù鍏肩閸剟宕烽崫鍕暥闂侇喓鍔忛崗姗�宕堕悙鑼Ш by changhao
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 410021, null); //闂傚啰鍠庨幉鎶藉捶閵娿儱褰嗗ù鍏肩閸剟宕烽崫鍕垫▎濞戞挸绉烽崗姗�宕堕悙鑼Ш by changhao
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
			
			if (memberRole.getScene() == leaderRole.getScene()) //濠碘�冲�归悘澶愬椽瀹�鍕曞ù鐓庣Т濠�顏堝触鐏炶偐顏卞☉鎿冧簻濠э拷闁猴拷? by changhao
			{
				//闁瑰嘲顦崺宀勬⒓閻斿吋姣愰梺锟�? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 1);
				go.submit();				
				//absentReturnTeamP.submit();
			}
			else
			{
				//闁瑰嘲顦崺宀勬⒓閻斿吋姣愰梺锟�? by changhao
				fire.pb.team.PGotoTeamLeader go = new fire.pb.team.PGotoTeamLeader(team, memberRoleId, 2);
				go.submit();
			}
		}
	}

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long roleId, byte absent) {
		// 闁哄棗鍊婚‖鍥箣閺嵮勭鐟滐拷?
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

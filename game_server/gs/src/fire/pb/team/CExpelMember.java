
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
 * 閻犲洭顥撻‖鍥⒓閻旈攱鍠�
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
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//濡ょ姴鐭侀惁澶屾嫚閵夘煈娼￠柤鐟板级濡叉悂宕ラ敃浣虹闁哄嫷鍨跺Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗭拷
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
					//闂婎亶婢�濮瑰鎳撻崨顒傜憹闁革负鍔戝Σ锔藉瀹ュ嫯鍘柟瀛樼墳?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�?(illegal)
					TeamManager.logger.debug("FAIL:闂婎亶婢�濮瑰鎳撻崨顒傜憹闁革负鍔戝Σ锔藉瀹ュ嫯鍘柟瀛樼墳?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�?,闂婎亶婢�濮瑰鎳撻崠顣�: "+ leaderRoleId);
				}
				else if(!checkLeaderOnline(leaderRoleId))
				{
					//TODO 闂婎亶婢�濮瑰鎳撻崨顒傜憹闁革负鍔庨崵锟�(illegal)
					TeamManager.logger.debug("FAIL:闂婎亶婢�濮瑰鎳撻崨顒傜憹闁革负鍔庨崵锟�,闂婎亶婢�濮瑰鎳撻崠顣�: "+ leaderRoleId);
				}
				else if(!checkExpeledIsMember(team, expeledRoleId))
				{
					//TODO 閻炴凹鍋夊☉顏堟嚀閸涱剛鐟濋柡鍕靛灥濞戭亝绂嶆ウ锟�?閸涘瓨袝濞寸厧绉甸崹姘跺川?(illegal)
					TeamManager.logger.debug("FAIL:閻炴凹鍋夊☉顏堟嚀閸涱剛鐟濋柡鍕靛灥濞戭亝绂嶆ウ锟�?閸涘瓨袝濞寸厧绉甸崹姘跺川?,閻炴凹鍋夊☉顏堟嚀閸栴晩: "+ expeledRoleId);
				}
				else if(!checkTeamLeaderState(leaderRoleId))
				{
					//TODO 闂傚啰鍠嶇槐鐐烘偐閼革拷?娴ｉ鐟濋柛蹇庢祰椤旓拷(illegal)
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐烘偐閼革拷?娴ｉ鐟濋柛蹇庢祰椤旓拷,閻炴凹鍋夊☉顏堟嚀閸栴晩: "+ expeledRoleId);
				}
				else
				{
					team.removeTeamMemberWithSP(expeledRoleId,false);
					
					//闁告碍鍨奸～锔剧矉婵犳碍袝闁兼澘鎳庤ぐ鍌炴焻娴ｅ湱啸闁癸拷?
					PropRole prole = new PropRole(team.getTeamInfo().getTeamleaderid(), true);
					List<String> name = new ArrayList<String>();
					name.add(prole.getName());
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(expeledRoleId, 140641, name);
					PropRole expelrole = new PropRole(expeledRoleId, true);
					List<String> expelname = new ArrayList<String>();
					expelname.add(expelrole.getName());
					for(long memberId : team.getAllMemberIds())
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(memberId,141208,expelname);
					TeamManager.logger.debug("SUCC:闂傚啰鍠嶇槐鐐虹叒椤厽鐪�,閻炴凹鍋夊☉顏堟嚀閸栴晩: "+ expeledRoleId);
				}
	//			FactionPatrol.setRoleTaskFailed(expeledRoleId);  //閻炴凹鍋夊☉顏堝礄濞差亝袝濞寸厧绉撮幃妤呮晬鐏炵偓绠掗悽顖ｅ枟濞ｆ娊宕跺☉娆愮厵鐎瑰槑銈庢綊濞寸姾顕ф慨鐔兼儍閸曨噮娼￠柤纭呭蔼椤╋妇鎷嬫０浣瑰床闁告柡锟界偨浜奸悹锟�?
				fire.pb.event.Poster.getPoster().dispatchEvent(new LeaveTeamSpecialQuestEvent(expeledRoleId));
				return true;
			}
		};
		expelMemberP.submit();
		
	}

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long leaderRoleId, long expeledRoleId) {
		// 閻犲洭顥撻‖鍥⒓閻旈攱鍠�
		return fire.pb.battle.pvp.PvPTeamHandle.onExpelMember(leaderRoleId, expeledRoleId);
	}
	
	// 闂婎亶婢�濮瑰鎳撻崨顔叫﹀☉锟�?濞戞搩浜Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗛亶鏁�??闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkLeaderInTeam(long leaderRoleId,Team team)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		if(team.getTeamInfo() != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;

	}
	
	// 闂婎亶婢�濮瑰鎳撻崨顓熻含缂侊拷??闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//閻炴凹鍋夊☉顏堟嚀閸涱喗笑闂傚啰鍠栭弳閬嶆⒓閻斿墎绀婇柣銊ュ濡诧箓宕ㄥ鍫㈠惞闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
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
	
	// 闂侊拷?閻犲洨鏌�?閸涱垰笑闁诡兛妞掔粭澶愬礂娴ｇ瓔鍟�? 闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
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


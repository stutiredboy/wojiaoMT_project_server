
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
 * 閻犱礁澧介悿鍡涙⒓閻斿吋姣�
 * @author changhao
 *
 */
public class CSetTeamLeader extends __CSetTeamLeader__ {
	private long now = 0L;//procedure鐎碉拷?濠殿喖顑嗗鍌涚┍濠靛棛鎽犲☉锟�?濞戞搩浜滅紞瀣礈瀹ュ棙顦ч梻鍌濇彧缁辨繃绌卞┑濠勬婵繍妲歳ocedure濞戞搩鍘藉鍌炴⒒鐎靛憡鐣辩紓浣哄枍缁旀挳骞�?
	
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
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(oldLeaderRoleId))
					return true;//濡ょ姴鐭侀惁澶愬储閻斿吋袝闂傦拷閹稿孩笑闁告熬绠掔换鏇㈠及椤栫偞袝濞寸厧绉跺▓鎴︽⒓閻斿吋姣�
				if(!team.isInTeam(newLeaderRoleId))
					return true;//濡ょ姴鐭侀惁澶愬棘娴煎瓨袝闂傦拷閹稿孩笑闁告熬绠戝﹢顏堟⒓閻斿墎绀婂☉锟�?
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
					//闁汇垹鐤囬顒勬嚀閸涱剛鐟濋柛锔哄妿閸ゅ酣鏁嶉崸鏄筶egal闁匡拷?
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒勬嚀閸涱剛鐟濋柛锔哄妿閸わ拷,LeaderID: " +oldLeaderRoleId);
				}
				else if(!checkTeamStatusValid(team))
				{
					//闂傚啰鍠嶇槐鐐村緞閸曨亞鑹惧☉鎾崇Т瑜板弶绂掗妷锕�搴婇梻鍐枛閺嗛亶鎯冮崟顓炐﹂柟顑跨筏缁辨瑩骞嬪Ο缁樼亶濞戞搩鍘虹粭澶愭嚄閼恒儱搴婇梻鍐枛閺嗛亶鏁�?(illegal)
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐村緞閸曨亞鑹惧☉鎾崇Т瑜板弶绂掗妷锕�搴婇梻鍐枛閺嗛亶鎯冮崟顓炐﹂柟顑跨筏缁辨瑦绗熺�ｎ亶娲ゅ瀣仩椤㈡垿濡存担鐟扮仜闁哄倹顨愮槐锟�,teamId: " +teamId);
				}
				else if(!checkTeamNotInSwitchStatus(team))
				{
					//闂傚啰鍠嶇槐鐐村緞閸曨亞鑹鹃柡鍥х摠瀹曟煡姊奸悢鍏兼瘣闁汇垹鐤囬顒勬偐閼革拷??
					//psend(oldLeaderRoleId, new STeamError(TeamError.InChangeLeaderStatus));
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 141210, null);
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐村緞閸曨亞鑹鹃柡鍥х摠瀹曟煡姊奸悢鍏兼瘣闁汇垹鐤囬顒勬偐閼革拷??,teamId: " +teamId);
				}
				else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//闂傚啰鍠嶇槐锟�2闁告帒妫濋幐鎾诲礃閸涱喖鐏囬柛鏃傚枑濞插潡骞戦姀锝囩畺闂傚啰鍠栭弳锟�
					//psend(oldLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 141209, null);
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐锟�2闁告帒妫濋幐鎾诲礃閸涱喖鐏囬柛鏃傚枑濞插潡骞戦姀锝囩畺闂傚啰鍠栭弳锟�,teamId: " +teamId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//闁哄倷鍗冲Σ锕傛⒐婢跺摜鐟濆璺哄缁剙顫㈤敐鍛煑闁绘鍩�??(闁哄棗鍊婚‖鍥Υ娴ｄ警鐎茬紒鎹愭硶閻℃垿鎮╅懜锟�??)闁挎稑娼焞lgal闁匡拷?
					psend(newLeaderRoleId, new STeamError(TeamError.MembersNotNormal));
					TeamManager.logger.debug("FAIL:闁哄倷鍗冲Σ锕傛⒐婢跺摜鐟濆璺哄缁剙顫㈤敐鍛煑闁绘鍩�??,newLeaderRoleId: " +newLeaderRoleId);
				}
				else if(StateCommon.isTrusteeshipState(newLeaderRoleId)) //濠碘�冲�归悘澶愬捶閵婏附鐓�闂傚啰鍠栭弳閬嶅捶閵婏箑顫ㄧ紒鐙呯磿婵悂骞�娴ｇ柉鍘� by changhao
				{
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 160408, null);
				}
				else
				{
					BuffAgent buffagent = new BuffRoleImpl(newLeaderRoleId);
					if (!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER))
					{
						// 闁哄倷鍗冲Σ锕傛⒐閸噮妲卞ù婊冪凹缁楀鎳楅挊澶岀Ъ闂傚啰鍠栭弳閬嶆儍閸曨厼笑闁癸拷?
						TeamManager.logger.debug("FAIL:闁哄倷鍗冲Σ锕傛⒐閸噮妲卞ù婊冪凹缁楀鎳楅挊澶岀Ъ闂傚啰鍠栭弳閬嶆儍閸曨厼笑闁癸拷?,newLeaderRoleId: " + newLeaderRoleId);
					} else
					{
						TeamManager.logger.debug("SUCC:闁告瑯鍨禍鎺楀矗閹存繂姣夐柡鍥х摠瀹曟煡姊奸悢鍏兼瘣闂侊拷?閻狅拷?,teamId: " + teamId);
						team.getTeamInfo().setSwitchleaderid(newLeaderRoleId);
						team.getTeamInfo().setSwitchleadertime(now);
						SAskforSetLeader sAskforSetLeader = new SAskforSetLeader();
						sAskforSetLeader.leaderid = oldLeaderRoleId;
						
						TeamManager.getInstance().delTeamMatch(oldLeaderRoleId); //濞存嚎鍊栧畷鏌ユ⒓閻斿吋姣愮紒鍌濐嚙缁辨垿宕犺ぐ鎺戝赋 by changhao
						
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

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 闂佹彃绉甸弻濠勬媼閸撗呮瀭闂傚啰鍠栭弳锟�
		return fire.pb.battle.pvp.PvPTeamHandle.onSetTeamLeader(oldLeaderRoleId, newLeaderRoleId);
	}

//	// 闁汇垹鐤囬顒勬嚀閸涱喗笑濞戯拷?濞戞搩浜Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗛亶鏁嶉悢宄版锭闁煎疇妫勫﹢鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
//	private boolean checkOldLeaderInTeam(long leaderRoleId,Team team)
//	{
//		if(team.getTeamInfo().getTeamleaderid() == leaderRoleId)
//			return true;
//		else
//			return false;
//	}
	
	// 闁汇垹鐤囬顒勬嚀閸涱厽韬紒锟�??闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//闂傚啰鍠嶇槐鐐村緞閸曨亞鑹鹃柛娆樺灟娴滄帡骞戦姀銈喰曢梻锟界捄銊︾暠闁绘鍩�?娓氬﹦鍚归柨娑樼墦椤ワ絿鎮板畝瀣闁瑰瓨蓱閺嬬喐绋夐婵堢憹闁煎疇濮ゅ畷鏌ユ⒓閻斿吋姣愰柨娑樼焷缁绘洟寮垫径濠傚緭濞寸姵鐗滄慨鎼佸箑娴ｅ憡鍋嬮柨娑氬櫐缁憋拷
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent buffagent = new BuffRoleImpl(team.getTeamLeaderId());
		int conflictId = buffagent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//闂傚啰鍠嶇槐鐐寸▔瀹ュ拋妲卞ù婊冨濞插潡骞戦姀銈喰曢梻锟界捄銊︽殼閻犲洭顥撴慨鎼佸箑娓氬﹦鍚�
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
	
	//闂傚啰鍠嶇槐锟�2闁告帒妫濋幐鎾诲礃閸涱喗寮撻柡鍥х摠瀹曞弶娼婚崶顒佇曢梻锟介崠锛勫惞
	private boolean checkTeamNoSuccSwitchIn2min(Team team)
	{
		if((now - team.getTeamInfo().getSuccessswitchtime()) > TeamManager.MIN_SUCCESS_SWITCH_LEADER_PERIOD )
			return true;
		else
			return false;
	}
	
	//闁哄倷鍗冲Σ锕傛⒐閸噮妲卞ù婊冨椤掓粎鏁崫銉バ﹂柟顑跨筏缁辩敻宕ｉ鍥у幋闁革腹澧ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
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


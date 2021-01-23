
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
	
	private long now = 0L;//procedure鐎碉拷?濠殿喖顑嗗鍌涚┍濠靛棛鎽犲☉锟�?濞戞搩浜滅紞瀣礈瀹ュ棙顦ч梻鍌濇彧缁辨繃绌卞┑濠勬婵繍妲歳ocedure濞戞搩鍘藉鍌炴⒒鐎靛憡鐣辩紓浣哄枍缁旀挳骞�?
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
				
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;

				long oldLeaderRoleId = team.getTeamInfo().getTeamleaderid();
				if(!team.isInTeam(newLeaderRoleId))
				{
					TeamManager.logger.debug("闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柡鍕靛灟缁斿瓨绋夐鍫熜曞ù鐓庣Ф濞堟垿姊奸悢閿嬪枀, newLeaderRoleId: " + newLeaderRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141056, null);
					psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
					return true;
				}
				if(team.isTeamLeader(newLeaderRoleId))
				{
					TeamManager.logger.debug("闁搞儳鍋涚花鏌ユ嚀閸涱厼鍤掔紓浣哥箲濡叉悂姊奸悢鍏兼瘣, newLeaderRoleId: " + newLeaderRoleId);
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
				{//闁归攱甯炵划鐑藉箣閹邦亣绀嬮梻鍐枛閺嗭拷
					if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
					{
						//闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柡鍕靛灥椤╋附绂掔拠鍙夊殥闁汇劌瀚弻濠囨⒓閻斿吋姣�(illegal)
						TeamManager.logger.debug("FAIL:闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柡鍕靛灥椤╋附绂掔拠鍙夊殥闁汇劌瀚弻濠囨⒓閻斿吋姣�, teamId: " + teamId);
						psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
						return true;
					}
					team.getTeamInfo().setSwitchleaderid(-1);
					team.getTeamInfo().setSwitchleadertime(-1);
					psend(oldLeaderRoleId, new STeamError(TeamError.RefuseChangeLeader));
					TeamManager.logger.debug("SUCC:闁归攱甯炵划鐑藉箣閹邦亣绀嬮梻鍐枛閺嗭拷, roleid: " + newLeaderRoleId);
					return true;
				}

				if (checkPvP(oldLeaderRoleId, newLeaderRoleId) != 0) {
					return true;
				}

				if(!checkLeaderOnline(newLeaderRoleId))
				{
					//闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柛锔哄妿閸わ拷(illegal)
					TeamManager.logger.debug("FAIL:闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柛锔哄妿閸わ拷, roleid: " + newLeaderRoleId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//闁搞儳鍋涚花鏌ユ嚀閸涱収妲卞ù婊冮叄濞碱亜顫㈤敐鍛煑闁绘鍩�?娓氬﹦绀勯柡鍡楀�婚‖鍥Υ娴ｉ鐟撶紒鎹愭硶閻℃垿鏁�?(illegal)
					TeamManager.logger.debug("FAIL:闁搞儳鍋涚花鏌ユ嚀閸涱収妲卞ù婊冮叄濞碱亜顫㈤敐鍛煑闁绘鍩�?娓氬﹦绀勯柡鍡楀�婚‖鍥Υ娴ｉ鐟撶紒鎹愭硶閻℃垿鏁�?, roleid: " + newLeaderRoleId);
					MessageMgr.psendMsgNotifyWhileCommit(team.getTeamLeaderId(), 141671, null);
					MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141671, null);
				}
				else if(!checkTeamStatusValid(team))
				{
					//闂傚啰鍠嶇槐鐐村緞閸曨亞鑹惧☉鎾崇Т瑜版煡骞戦姀銈喰曢梻锟界捄銊バ﹂柟顑跨筏缁辨瑦顦伴悙棰濇斀闁瑰瓨鐗楅崹顒勫棘濡炲墽鐟濋柤铏灮缁憋拷(illegal)
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐村緞閸曨亞鑹惧☉鎾崇Т瑜版煡骞戦姀銈喰曢梻锟界捄銊バ﹂柟顑跨筏缁辨瑦顦伴悙棰濇斀闁瑰瓨鐗楅崹顒勫棘濡炲墽鐟濋柤铏灮缁憋拷, teamId: " + teamId);
				}
				else if(!checkTeamInSwitchStatus(team))
				{
					//闂傚啰鍠嶇槐鐐寸▔瀹ュ拋妲卞ù婊冨濞插潡骞戦姀銈喰曢梻锟界捄銊︽殼閻犲洭顥撴慨鎼佸箑娴ｇ懓鐏楅柤鏉挎嚀缁夋挳寮�?(illegal)
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐寸▔瀹ュ拋妲卞ù婊冨濞插潡骞戦姀銈喰曢梻锟界捄銊︽殼閻犲洭顥撴慨鎼佸箑娴ｇ懓鐏楅柤鏉挎嚀缁夋挳寮�?, teamId: " + teamId);
				}
				else if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
				{
					//闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柡鍕靛灥椤╋附绂掔拠鍙夊殥闁汇劌瀚弻濠囨⒓閻斿吋姣�(illegal)
					TeamManager.logger.debug("FAIL:闁搞儳鍋涚花鏌ユ嚀閸涱剛鐟濋柡鍕靛灥椤╋附绂掔拠鍙夊殥闁汇劌瀚弻濠囨⒓閻斿吋姣�, teamId: " + teamId);
				}
				/*else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//闂傚啰鍠嶇槐锟�2闁告帒妫濋幐鎾诲矗椤忓洤鍘撮柡鍥х摠瀹曟煡姊奸悢鍏兼瘣濞戯拷?婵烇拷?
					psend(newLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐锟�2闁告帒妫濋幐鎾诲矗椤忓洤鍘撮柡鍥х摠瀹曟煡姊奸悢鍏兼瘣濞戯拷?婵烇拷?, teamId: " + teamId);
				}*/
				else
				{
					
					//xbean.TeamInfo team = xtable.Team.get(team);
					if(team.switchTeamLeaderWithSP(newLeaderRoleId))
					{
						team.getTeamInfo().setSuccessswitchtime(now);
						TeamManager.logger.debugWhileCommit("SUCC:闂傚啰鍠嶇槐鐐哄即鐎涙ê搴婇梻鍐枛閺嗭拷, teamId: " + teamId);
					}
					else
						TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐哄即鐎涙ê搴婇梻鍐枛閺嗚鲸寰勬潏顐バ�, teamId: " + teamId);
				}
					 
				return true;
			}
		};
		setTeamLeaderP.submit();
	}

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 闁搞儳鍋熼悺鐔煎及椤栨碍鍎婇柟鎭掑劚瑜板牓姊奸悢鍏兼瘣濞寸姾顕ч幊锟�
		return fire.pb.battle.pvp.PvPTeamHandle.onAnswerforSetLeader(oldLeaderRoleId, newLeaderRoleId);
	}

	// 闁搞儳鍋涚花鏌ユ嚀閸涱厽韬紒锟�??闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢闁挎稑鐭傞弨顤瞖aderRoleId闁汇劌澧攐lelock
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//闁搞儳鍋涚花鏌ユ嚀閸涱収妲卞ù婊冨椤掓粎鏁崫銉バ﹂柟顑跨筏缁辩敻宕ｉ鍥у幋闁革腹澧ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
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
	
	
	//闂傚啰鍠嶇槐鐐村緞閸曨亞鑹鹃柛娆樺灟娴滄帡骞戦姀銈喰曢梻锟界捄銊︾暠闁绘鍩�?娓氬﹦鍚归柨娑樼墦椤ワ絿鎮板畝瀣闁瑰瓨蓱閺嬬喐绋夐婵堢憹闁煎疇濮ゅ畷鏌ユ⒓閻斿吋姣愰柨娑樼焷缁绘洟寮垫径濠傚緭濞寸姵鐗滄慨鎼佸箑娴ｅ憡鍋嬮柨娑氬櫐缁憋拷
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent agent = new BuffRoleImpl(team.getTeamLeaderId(),true);
		int conflictId = agent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//闂傚啰鍠嶇槐鐐村緞閸曨亞鑹鹃柡鍥х摠瀹曟煡姊奸悢鍏兼瘣闁汇垹鐤囬顒勬偐閼革拷?娴ｆ瓕瀚欏☉鎾存⒐濠�顓犳惥閸涱喗顦ч柨锟�?
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
	
	//闁搞儳鍋涚花鏌ユ嚀閸涱厽鐨戦柡鍕靛灡閺屽﹪姊奸悢鍏兼瘣闁匡拷?
	private boolean checkAnwserIsNewLeader(Team team , long newLeaderId)
	{
		if(team.getTeamInfo().getSwitchleaderid() == newLeaderId)
			return true;
		else
			return false;
	}
	
	//闂傚啰鍠嶇槐锟�2闁告帒妫濋幐鎾诲礃閸涱喗寮撻柟瀛樺姇婵盯寮寸�涙ê搴婇弶鈺佹喘濡诧箓姊归崠锛勫惞
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


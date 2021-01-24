
package fire.pb.team;

import fire.pb.PropRole;
import fire.pb.battle.PlayPKManage;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.clan.ClanUtils;
import fire.pb.talk.MessageMgr;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestJoinTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 閻犲洭鏀遍惇浼村礉閻樻彃寮抽梻鍐枍缁憋拷
 * @author changhao
 *
 */
public class CRequestJoinTeam extends __CRequestJoinTeam__ {
	private long now = 0L;//procedure鐎碉拷?濠殿喖顑嗗鍌涚┍濠靛棛鎽犲☉锟�?濞戞搩浜滅紞瀣礈瀹ュ棙顦ч梻鍌濇彧缁辨繃绌卞┑濠勬婵繍妲歳ocedure濞戞搩鍘藉鍌炴⒒鐎靛憡鐣辩紓浣哄枍缁旀挳骞�?
	Team team;
	@Override
	protected void process() {
		// protocol handle
		final long applierRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (applierRoleId < 0)
			return;
		xbean.Properties prop = xtable.Properties.select(roleid);
		if (prop == null)
		{
			return;
		}
		
		Long appliedclanfightid = xtable.Roleid2clanfightid.select(roleid);//濠碘�冲�归悘澶愭偨鐎圭媭鍤為柣銊ュ濡诧附瀵煎鍛含闁稿浚鍏涚槐浼村箣濡儤绨氬☉锟�? by changhao
		if (appliedclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//濠碘�冲�归悘澶愭偨鐎圭媭鍤為柤鏉挎噹濠�顏堝礂椤戣法绐楅柟瀛樏┃锟藉☉锟�? by changhao
			if (!appliedclanfightid.equals(applierclanfightid))
			{
 			    MessageMgr.sendMsgNotify(applierRoleId, 410025,  null);
 			    return;
			}
			else
			{
				xbean.ClanInfo claninfo = ClanUtils.getClanInfoById(roleid, true);
				if (claninfo == null)
				{
					return;
				}
				
				xbean.ClanMemberInfo memberinfo = claninfo.getMembers().get(applierRoleId);
				if (memberinfo == null)
				{
	 			    MessageMgr.sendMsgNotify(applierRoleId, 410026,  null);
					return;
				}
			}
		}
		else
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//闁汇垹鐤囬顒勬嚀閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(appliedclanfightid))
				{
	 			    MessageMgr.sendMsgNotify(applierclanfightid, 410027,  null);	
	 			    return;
				}				
			}
		}
		
		TeamManager.logger.debug("閻熸瑦甯熸竟濠囨晬閸︽矟 = " +applierRoleId+"闁挎稑顦遍弫鐢垫嫚? 闁稿繈鍎靛Σ锟�");
		//add by cn 濠碘�冲�归悘澶愬捶閵娿儱绀嬮柟鍛婂灥閸犲懘寮Δ鍐ㄐ﹂柟锟�?,濞戞挸绉撮崢鎴犳媼缁嬪灝顫ｉ柛蹇嬪劙閹广垺鎷呴弴銏⌒曞ù锟�?
		BuffAgent agent = new BuffRoleImpl(applierRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141133,  null);
			return;
		}

		PropRole applierprop = new PropRole(applierRoleId, true);
		if(applierprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:闁汇垹鐤囬顒勫礂閵夆晜袝闁硷拷?" + applierRoleId + "闁革负鍔岀拹鏉裤�掗崫銉バ﹂柟锟�?,婵縿鍊栧鍌涚▔瀹ュ牆鍘撮柣銏犵枃椤曨剟宕楅妷鈺傂�");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
			return;
		}
		
		PropRole leaderprop = new PropRole(roleid, true);
		if(leaderprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:闂傚啰鍠嶇槐鐐烘⒓閻斿吋姣�" + roleid + "闁汇垹鐤囬顒佺?" + applierRoleId + "闂傚啰鍠嶇槐鐐烘⒓閻斿吋姣愭慨婵撶到濠�顏勵啅閳╁啰鍩楅柣妯垮煐??,濞戞挸绉烽崗姗�鎮界�圭媭鍤為柛蹇嬪劦濡诧拷");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162026, null);
			return;
		}
		
		if (checkPvP(roleid, applierRoleId) != 0) {
			return;
		}

		BuffAgent leaderAgent = new BuffRoleImpl(roleid, true);
		if (leaderAgent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141867,  null);
			return;
		}
		mkdb.Procedure requestJoinTeamP = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(roleid);
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
				{
					//閻庝絻顫夐弻鐔哥▔瀹ュ懏韬梻鍐枍缁辩偞绋�?
					//psend(applierRoleId, new STeamError(TeamError.ObjectNotInTeam));
					//TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒佸緞鏉堫偉袝闁挎稑鑻顕�寮柅娑氱憹闁革负鍔戝Σ锔藉瀹ュ嫯鍘�,roleid"+ roleid);
										
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150035, null);					
					return true;
				}
				if(!team.isInTeam(roleid))
					return true;//濡ょ姴鐭侀惁澶屾嫚閵夘煈娼￠柤鐟板级濡叉悂宕ラ敃浣虹闁革负鍔戝Σ锔藉瀹ュ嫯鍘�
				final long leaderRoleId = team.getTeamInfo().getTeamleaderid();
				Long[] roleids = new Long[2];
				if(leaderRoleId < applierRoleId)
				{
					roleids[0] = leaderRoleId;
					roleids[1] = applierRoleId;
				}
				else
				{
					roleids[0] = applierRoleId;
					roleids[1] = leaderRoleId;
				}
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end

				now = System.currentTimeMillis();
				
				if(!checkOnline(applierRoleId))
				{
					//闁汇垹鐤囬顒勬嚀閸涱剛鐟濋柛锔哄妿閸わ拷(illegal)
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒勬嚀閸涱剛鐟濋柛锔哄妿閸わ拷,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierNotInTeam(applierRoleId))
				{
					//闁汇垹鐤囬顒勬嚀閸涱厽韬梻鍐枍缁辩偞绋�?(illegal)
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 140855, null);
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒勬嚀閸涱厽韬梻鍐枍缁辩偞绋�?,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierStatusValid(applierRoleId))
				{
					//闁汇垹鐤囬顒勬嚀閸涱収妲卞ù婊冪凹缁楀鎳楅悾灞炬殼閻犲洭顥撶划宥夋⒓閻旂儤鐣遍柣妯垮煐?娓氬﹦鍚归柨娑樼墦椤ワ絿鎮板畝瀣閻犵儤鍨甸弲銏ゆ晬鐏炵偓鍟橀柟钘夘煭缁辨繈骞庨妶锟�?娴ｈ櫣鎼奸柨锟�?
					psend(applierRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒勬嚀閸涱収妲卞ù婊冪凹缁楀鎳楅悾灞炬殼閻犲洭顥撶划宥夋⒓閻旂儤鐣遍柣妯垮煐?娓氬﹦鍚归柨娑樼墦椤ワ絿鎮板畝瀣閻犵儤鍨甸弲銏ゆ晬鐏炵偓鍟橀柟钘夘煭缁辨繈骞庨妶锟�?娴ｈ櫣鎼奸柨锟�?,applierRoleId"+ applierRoleId);
				}
				else if(!checkLeaderTeamFuncEnable(leaderRoleId))
				{
					//闂傚啰鍠栭弳杈╃磼閸曨垱袝鐎碉拷?闁稿繗娅曞﹢顓㈠箥閹惧磭纾�
					//psend(applierRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141201, null);
					TeamManager.logger.debug("FAIL:闂傚啰鍠栭弳杈╃磼閸曨垱袝鐎碉拷?闁稿繗娅曞﹢顓㈠箥閹惧磭纾�,leaderRoleId"+ leaderRoleId);
				}
				else if(!checkTeamNotFull(team))
				{
					//闂傚啰鍠嶇槐鐐寸閻戞ɑ娈剁�圭寮跺锟�
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 145045, 0, null);
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐寸閻戞ɑ娈剁�圭寮跺锟�,teamId"+ teamId);
				}
				else if(!checkTeamFilter(team,applierRoleId))
				{
					TeamManager.logger.debug("FAIL:TeamFilter闁告熬绠戦崰锟�,TeamId: "+teamId);
				}
				else if(team.isApplyListFull())
				{
					//闂傚啰鍠嶇槐鐐烘偨鐎圭媭鍤為柛鎺擃殙閵嗗啫顔忛崣澶婂К闁匡拷?15濞戞搩浜风槐锟�
					psend(applierRoleId, new STeamError(TeamError.ApplyListFull));
					TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐烘偨鐎圭媭鍤為柛鎺擃殙閵嗗啫顔忛崣澶婂К闁匡拷?15濞戞搩浜风槐锟�,teamId"+ teamId);
				}
				else if(team.getTeamInfo().getApplierids().containsKey(applierRoleId))
				{
					//闁汇垹鐤囬顒勬嚀閸涱噮鍔�闁革负鍔忛姘舵⒓閻斿墎绀婇柣銏犵枃椤曨剟宕氬Δ鍕╋拷鍐╃▔?
					psend(applierRoleId, new STeamError(TeamError.AlreadyApply));
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒勬嚀閸涱噮鍔�闁革负鍔忛姘舵⒓閻斿墎绀婇柣銏犵枃椤曨剟宕氬Δ鍕╋拷鍐╃▔?,teamId"+ teamId);
				}
				else if(!checkLevelRequirementValid(team, applierRoleId))
				{
					//闁汇垹鐤囬顒勬嚀閸涱喗寮撻弶鍫熷劤閸╁矂姊奸悢鍓佺缂佺嫏鍐ㄧ劶閻熸洑鐒﹂惇锟�
					//psend(applierRoleId, new STeamError(TeamError.ApplierLevelValid));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141207, null);
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒勬嚀閸涱喗寮撻弶鍫熷劤閸╁矂姊奸悢鍓佺缂佺嫏鍐ㄧ劶閻熸洑鐒﹂惇锟�,applierRoleId"+ applierRoleId);
				}
				else{
					
					boolean inWaiting1 = false;
					boolean inWaiting = false;
					//闁告瑦鍨奸幑锝嗙?
					final fire.pb.map.Role  invitMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(applierRoleId);
					final fire.pb.map.Role  desMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(leaderRoleId);
					if(invitMaprole == null || desMaprole == null){
						return true;
					}
//					int srcMapId = invitMaprole.getMapId();
//					int desMapId = desMaprole.getMapId();
					
//					if (srcMapId != desMapId) {
//						if (fire.pb.buff.Module.existState(leaderRoleId,
//								BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//							MessageMgr.sendMsgNotify(applierRoleId, 160201, null);
//							return false;
//						}
//					} else {
						if (inWaiting || inWaiting1) {
							fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(
									applierRoleId, 145250, null);
							return false;
						}
//					}
						
					xbean.Properties applierProperty = xtable.Properties.get(applierRoleId);
						
					//婵★拷?闁哄被鍎抽弫鐢垫嫚閻わ拷?閸涱喗笑闁告熬闄勫褏鎼剧�圭姷绠瑰☉鎿冧邯濡诧附瀵煎鍫濇闁告柣鍔岀亸顕�鏌婂鍥ㄧ暠闂傦拷?婵拷? by changhao
					xbean.TeamMatch teammatch = TeamManager.getInstance().getTeamMatchByTeamid(teamId);
					if (teammatch != null && applierProperty != null)
					{
						int applierlevel = applierProperty.getLevel();
						if (applierlevel >= teammatch.getLevelmin() && applierlevel <= teammatch.getLevelmax())
						{		
							mkdb.Procedure.pexecuteWhileCommit(new PAcceptToTeam(leaderRoleId, applierRoleId, 1, false));
							return true;
						}
					}
					
					team.getTeamInfo().getApplierids().put(applierRoleId, now);

					//闁告碍鍨垮Σ锕傛⒐閹稿孩绾柡鍌涘閺佺數鎷犲畡鏉跨仚閻烇拷?
					SAddTeamApply sAddTeamApply = new SAddTeamApply();
					fire.pb.team.TeamApplyBasic  teamApplyBasic = new fire.pb.team.TeamApplyBasic();
					//teamApplyBasic.face = applierProperty.getFaction();
					teamApplyBasic.level = applierProperty.getLevel();
					teamApplyBasic.roleid = applierRoleId;
					teamApplyBasic.rolename = applierProperty.getRolename();
					teamApplyBasic.school = applierProperty.getSchool();
					//teamApplyBasic.title = applierProperty.getTitle();
					teamApplyBasic.shape = applierProperty.getShape();
					fire.pb.map.Role.getPlayerComponents(applierRoleId, teamApplyBasic.components);
					sAddTeamApply.applylist.add(teamApplyBasic);
					psendWhileCommit(leaderRoleId, sAddTeamApply);
					//闁告碍鍨归弫鐢垫嫚閻わ拷?閸涙壆绠查柛銉у仦閸ㄦ岸宕濋悢鏈电箚闁癸拷?
					SRequestJoinSucc sRequestJoinSucc = new SRequestJoinSucc();
					xbean.Properties leaderProperty = xtable.Properties.get(leaderRoleId);
					sRequestJoinSucc.rolename = leaderProperty.getRolename();
					psendWhileCommit(applierRoleId, sRequestJoinSucc);

					java.util.ArrayList<String> param = new java.util.ArrayList<String>();
					param.add(sRequestJoinSucc.rolename);
					
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150041, param);
					
					TeamManager.logger.debug("SUCC:婵犲◥銈呭枙闁哄锟藉弶顐介柨娑樼焸濡诧附瀵煎鍛濞寸姰鍎茬敮鎾矗濡ゅ啯鏆ら悹鍥╂焿??,teamId"+ teamId);
				}
				return true;
			}
		};
		requestJoinTeamP.submit();
	}

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long targetRoleId, long selfRoleId) {
		// 闁汇垹鐤囬顒勫礉閻樻彃寮抽柛鎺濆亗濮瑰姊奸悢鍓佺
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestJoinTeam(targetRoleId, selfRoleId);
	}

	//闁汇垹鐤囬顒勬嚀閸涱厽韬紒鎯у皡缁憋拷
	private boolean checkOnline(long roleId)
	{
		if(xtable.Roleonoffstate.get(roleId) == fire.pb.state.State.ENTRY_STATE)
			return true;
		else
			return false;
	}
	
	//闁汇垹鐤囬顒勬嚀閸涱剛鐟濋柛锔哄姂濡诧附瀵煎鍕幀闁匡拷?
	private boolean checkApplierNotInTeam(long applierRoleId)
	{
		if(xtable.Roleid2teamid.get(applierRoleId) == null)
			return true;
		else
			return false;
	}
	
	//闁汇垹鐤囬顒勬嚀閸涱収妲卞ù婊冩唉閸忔﹢鎮界�圭媭鍤炵紓浣稿濡诧箓鎯冮崟顓炐﹂柟顑跨筏缁辩敻鏁嶉崼銉＇閻炴稑鐭夌槐婵堟崉閹存繃娅岄柨娑樻湰閹叉粓骞楁繝蹇曠闁硅翰鍊�?娴ｈ櫣鎼煎☉鎾崇Х閸忔绱掗崟顖浶曢柨锟�?
	private boolean checkApplierStatusValid(long applierRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(applierRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("闁绘壕鏅涢锟�(roleId=" + applierRoleId+")濠㈣泛瀚花顒佺▔瀹ュ牆鍘寸紓浣稿濡诧箓鎯冮崟顓炐﹂柟锟�?");
			return true;
		}
		return true;
	}
	
	
	//闂傚啰鍠栭弳杈╃磼閸曨垱袝鐎碉拷?闁稿繗娅曟晶锕�顕�?闁匡拷?
	private boolean checkLeaderTeamFuncEnable(long leaderRoleId)
	{
//		if(fire.pb.SystemSettingConfig.checkRoleSetting(leaderRoleId, fire.pb.SysSetType.AcceptTeam)<=0)
//			return false;
//		else
			return true;
	}
	
	private boolean checkTeamFilter(Team team, long roleId)
	{
		TeamFilter filter = team.getFilter();
		if(filter == null)
			return true;
		return filter.checkRequestJoin(team.getTeamLeaderId(), roleId);
	}
	
	//闂傚啰鍠嶇槐鐐寸閻戞ɑ娈堕柡鍫簼瀵囨晬?
	private boolean checkTeamNotFull(Team team)
	{
		if(team.getTeamInfo().getMembers().size() < TeamManager.MAX_MEMBER_COUNT)
			return true;
		else
			return false;
	}
	
	//闁汇垹鐤囬顒勬嚀閸涚増褰ч柛鎺嶅嵆濡诧附瀵煎鍥崜闁告帩鍋夐々锕�效閸岋妇鍚�
	private boolean checkLevelRequirementValid(Team team, long applierRoleId)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		int applierLevel = xtable.Properties.get(applierRoleId).getLevel();
		if(applierLevel >= team.getTeamInfo().getMinlevel() && applierLevel <= team.getTeamInfo().getMaxlevel())
			return true;
		else
			return false;
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794449;

	public int getType() {
		return 794449;
	}

	public long roleid; // 别人队伍的队长ID

	public CRequestJoinTeam() {
	}

	public CRequestJoinTeam(long _roleid_) {
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
		if (_o1_ instanceof CRequestJoinTeam) {
			CRequestJoinTeam _o_ = (CRequestJoinTeam)_o1_;
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

	public int compareTo(CRequestJoinTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
 * 鐠囬攱鐪伴崝鐘插弳闂冪喍绱�
 * @author changhao
 *
 */
public class CRequestJoinTeam extends __CRequestJoinTeam__ {
	private long now = 0L;//procedure瀵�?婵妞傛穱婵嗙摠娑�?娑擃亜缍嬮崜宥嗘闂傝揪绱濇穱婵婄槈濮濐槚rocedure娑擃厽妞傞梻瀵告畱缂佺喍绔撮幀?
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
		
		Long appliedclanfightid = xtable.Roleid2clanfightid.select(roleid);//婵″倹鐏夐悽瀹狀嚞閻ㄥ嫰妲︽导宥呮躬閸忣兛绱伴幋妯烘簚娑�? by changhao
		if (appliedclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//婵″倹鐏夐悽瀹狀嚞閼板懎婀崗顑跨窗閹存ê婧�娑�? by changhao
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
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//閻㈠疇顕懓鍛躬閸忣兛绱伴幋妯烘簚娑�? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(appliedclanfightid))
				{
	 			    MessageMgr.sendMsgNotify(applierclanfightid, 410027,  null);	
	 			    return;
				}				
			}
		}
		
		TeamManager.logger.debug("鐟欐帟澹婇敍鍦沝 = " +applierRoleId+"閿涘鏁电拠? 閸忋儵妲�");
		//add by cn 婵″倹鐏夐崷銊ュ礋閹告垵鍠呴弬妤冨Ц閹�?,娑撳秴鍘戠拋绋垮閸忋儰鎹㈡担鏇㈡Е娴�?
		BuffAgent agent = new BuffRoleImpl(applierRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141133,  null);
			return;
		}

		PropRole applierprop = new PropRole(applierRoleId, true);
		if(applierprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:閻㈠疇顕崗銉╂Е閼�?" + applierRoleId + "閸︺劌璐板〒鍝ュЦ閹�?,濮濄倖妞傛稉宥堝厴閻㈠疇顕崗銉╂Е");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
			return;
		}
		
		PropRole leaderprop = new PropRole(roleid, true);
		if(leaderprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:闂冪喍绱為梼鐔兼毐" + roleid + "閻㈠疇顕禍?" + applierRoleId + "闂冪喍绱為梼鐔兼毐濮濓絽婀鈩冪埗閻樿埖??,娑撳秷鍏橀悽瀹狀嚞閸忋儵妲�");
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
				//閸忓牓鐛欑拠渚�妲︽导宥嗘Ц閸氾缚璐熺粚?
				if(teamId != null)
					team = new Team(teamId,false);
				else
				{
					//鐎佃鏌熸稉宥呮躬闂冪喍绱炴稉?
					//psend(applierRoleId, new STeamError(TeamError.ObjectNotInTeam));
					//TeamManager.logger.debug("FAIL:閻㈠疇顕径杈Е閿涘苯顕弬閫涚瑝閸︺劑妲︽导宥勮厬,roleid"+ roleid);
										
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150035, null);					
					return true;
				}
				if(!team.isInTeam(roleid))
					return true;//妤犲矁鐦夌拠銉潡閼瑰弶妲搁崥锕佺箷閸︺劑妲︽导宥勮厬
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
					//閻㈠疇顕懓鍛瑝閸︺劎鍤�(illegal)
					TeamManager.logger.debug("FAIL:閻㈠疇顕懓鍛瑝閸︺劎鍤�,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierNotInTeam(applierRoleId))
				{
					//閻㈠疇顕懓鍛躬闂冪喍绱炴稉?(illegal)
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 140855, null);
					TeamManager.logger.debug("FAIL:閻㈠疇顕懓鍛躬闂冪喍绱炴稉?,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierStatusValid(applierRoleId))
				{
					//閻㈠疇顕懓鍛槱娴滃簼绗夐懗鐣屾暤鐠囬绮嶉梼鐔烘畱閻樿埖?渚婄吹閿涘牓顥ｇ悰宀嬬礉鐠烘垵鏅㈤敍灞炬啘閹藉绱濋幎銈�?浣虹搼閿�?
					psend(applierRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:閻㈠疇顕懓鍛槱娴滃簼绗夐懗鐣屾暤鐠囬绮嶉梼鐔烘畱閻樿埖?渚婄吹閿涘牓顥ｇ悰宀嬬礉鐠烘垵鏅㈤敍灞炬啘閹藉绱濋幎銈�?浣虹搼閿�?,applierRoleId"+ applierRoleId);
				}
				else if(!checkLeaderTeamFuncEnable(leaderRoleId))
				{
					//闂冪喖鏆辩紒鍕Е瀵�?閸忚櫕婀幍鎾崇磻
					//psend(applierRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141201, null);
					TeamManager.logger.debug("FAIL:闂冪喖鏆辩紒鍕Е瀵�?閸忚櫕婀幍鎾崇磻,leaderRoleId"+ leaderRoleId);
				}
				else if(!checkTeamNotFull(team))
				{
					//闂冪喍绱炴禍鐑樻殶瀹稿弶寮�
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 145045, 0, null);
					TeamManager.logger.debug("FAIL:闂冪喍绱炴禍鐑樻殶瀹稿弶寮�,teamId"+ teamId);
				}
				else if(!checkTeamFilter(team,applierRoleId))
				{
					TeamManager.logger.debug("FAIL:TeamFilter閸氾箑鍠�,TeamId: "+teamId);
				}
				else if(team.isApplyListFull())
				{
					//闂冪喍绱為悽瀹狀嚞閸掓銆冨鍙夊姬閿�?15娑擃亷绱�
					psend(applierRoleId, new STeamError(TeamError.ApplyListFull));
					TeamManager.logger.debug("FAIL:闂冪喍绱為悽瀹狀嚞閸掓銆冨鍙夊姬閿�?15娑擃亷绱�,teamId"+ teamId);
				}
				else if(team.getTeamInfo().getApplierids().containsKey(applierRoleId))
				{
					//閻㈠疇顕懓鍛劀閸︺劏顕氶梼鐔剁礊閻㈠疇顕崚妤勩�冩稉?
					psend(applierRoleId, new STeamError(TeamError.AlreadyApply));
					TeamManager.logger.debug("FAIL:閻㈠疇顕懓鍛劀閸︺劏顕氶梼鐔剁礊閻㈠疇顕崚妤勩�冩稉?,teamId"+ teamId);
				}
				else if(!checkLevelRequirementValid(team, applierRoleId))
				{
					//閻㈠疇顕懓鍛弓鏉堟儳鍩岄梼鐔剁礊缁狙冨焼鐟曚焦鐪�
					//psend(applierRoleId, new STeamError(TeamError.ApplierLevelValid));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141207, null);
					TeamManager.logger.debug("FAIL:閻㈠疇顕懓鍛弓鏉堟儳鍩岄梼鐔剁礊缁狙冨焼鐟曚焦鐪�,applierRoleId"+ applierRoleId);
				}
				else{
					
					boolean inWaiting1 = false;
					boolean inWaiting = false;
					//閸欐垼鎹ｆ禍?
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
						
					//濡�?閺屻儳鏁电拠鐤�?鍛Ц閸氾附寮х搾瀹犵箹娑擃亪妲︽导宥堝殰閸斻劌灏柊宥囨畱闂�?濮�? by changhao
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

					//閸氭垿妲﹂梹鎸庢纯閺傛壆鏁电拠宄板灙鐞�?
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
					//閸氭垹鏁电拠鐤�?鍛扮箲閸ョ偞鍨氶崝鐔朵繆閹�?
					SRequestJoinSucc sRequestJoinSucc = new SRequestJoinSucc();
					xbean.Properties leaderProperty = xtable.Properties.get(leaderRoleId);
					sRequestJoinSucc.rolename = leaderProperty.getRolename();
					psendWhileCommit(applierRoleId, sRequestJoinSucc);

					java.util.ArrayList<String> param = new java.util.ArrayList<String>();
					param.add(sRequestJoinSucc.rolename);
					
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150041, param);
					
					TeamManager.logger.debug("SUCC:濠娐ゅ喕閺夆�叉閿涘矂妲︽导宥呭讲娴犮儲甯撮崣妤冩暤鐠囩柉??,teamId"+ teamId);
				}
				return true;
			}
		};
		requestJoinTeamP.submit();
	}

	// 濡�?濞村└VP
	private static int checkPvP(long targetRoleId, long selfRoleId) {
		// 閻㈠疇顕崝鐘插弳閸掝偂姹夐梼鐔剁礊
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestJoinTeam(targetRoleId, selfRoleId);
	}

	//閻㈠疇顕懓鍛躬缁惧尅绱�
	private boolean checkOnline(long roleId)
	{
		if(xtable.Roleonoffstate.get(roleId) == fire.pb.state.State.ENTRY_STATE)
			return true;
		else
			return false;
	}
	
	//閻㈠疇顕懓鍛瑝閸︺劑妲︽导宥勮厬閿�?
	private boolean checkApplierNotInTeam(long applierRoleId)
	{
		if(xtable.Roleid2teamid.get(applierRoleId) == null)
			return true;
		else
			return false;
	}
	
	//閻㈠疇顕懓鍛槱娴滃氦鍏橀悽瀹狀嚞缂佸嫰妲﹂惃鍕Ц閹緤绱甸敍鍫ヮ棧鐞涘矉绱濈捄鎴濇櫌閿涘本鎲滈幗濠忕礉閹躲倝?浣虹搼娑撳秷鍏樼紒鍕Е閿�?
	private boolean checkApplierStatusValid(long applierRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(applierRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("閻溾晛顔�(roleId=" + applierRoleId+")婢跺嫪绨稉宥堝厴缂佸嫰妲﹂惃鍕Ц閹�?");
			return true;
		}
		return true;
	}
	
	
	//闂冪喖鏆辩紒鍕Е瀵�?閸忚櫕澧﹀?閿�?
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
	
	//闂冪喍绱炴禍鐑樻殶閺堫亝寮ч敍?
	private boolean checkTeamNotFull(Team team)
	{
		if(team.getTeamInfo().getMembers().size() < TeamManager.MAX_MEMBER_COUNT)
			return true;
		else
			return false;
	}
	
	//閻㈠疇顕懓鍛版彧閸掍即妲︽导宥囬獓閸掝偉顩﹀Ч鍌︾吹
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


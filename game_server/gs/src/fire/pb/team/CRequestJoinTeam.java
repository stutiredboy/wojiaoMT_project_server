
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
 * 请求加入队伍
 * @author changhao
 *
 */
public class CRequestJoinTeam extends __CRequestJoinTeam__ {
	private long now = 0L;//procedure�?始时保存�?个当前时间，保证此procedure中时间的统一�?
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
		
		Long appliedclanfightid = xtable.Roleid2clanfightid.select(roleid);//如果申请的队伍在公会战场�? by changhao
		if (appliedclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//如果申请者在公会战场�? by changhao
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
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//申请者在公会战场�? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(appliedclanfightid))
				{
	 			    MessageMgr.sendMsgNotify(applierclanfightid, 410027,  null);	
	 			    return;
				}				
			}
		}
		
		TeamManager.logger.debug("角色（Id = " +applierRoleId+"）申�? 入队");
		//add by cn 如果在单挑决斗状�?,不允许加入任何队�?
		BuffAgent agent = new BuffRoleImpl(applierRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141133,  null);
			return;
		}

		PropRole applierprop = new PropRole(applierRoleId, true);
		if(applierprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:申请入队�?" + applierRoleId + "在巡游状�?,此时不能申请入队");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
			return;
		}
		
		PropRole leaderprop = new PropRole(roleid, true);
		if(leaderprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:队伍队长" + roleid + "申请�?" + applierRoleId + "队伍队长正在巡游状�??,不能申请入队");
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
				//先验证队伍是否为�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
				{
					//对方不在队伍�?
					//psend(applierRoleId, new STeamError(TeamError.ObjectNotInTeam));
					//TeamManager.logger.debug("FAIL:申请失败，对方不在队伍中,roleid"+ roleid);
										
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150035, null);					
					return true;
				}
				if(!team.isInTeam(roleid))
					return true;//验证该角色是否还在队伍中
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
					//申请者不在线(illegal)
					TeamManager.logger.debug("FAIL:申请者不在线,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierNotInTeam(applierRoleId))
				{
					//申请者在队伍�?(illegal)
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 140855, null);
					TeamManager.logger.debug("FAIL:申请者在队伍�?,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierStatusValid(applierRoleId))
				{
					//申请者处于不能申请组队的状�?�？（飞行，跑商，摆摊，护�?�等�?
					psend(applierRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:申请者处于不能申请组队的状�?�？（飞行，跑商，摆摊，护�?�等�?,applierRoleId"+ applierRoleId);
				}
				else if(!checkLeaderTeamFuncEnable(leaderRoleId))
				{
					//队长组队�?关未打开
					//psend(applierRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141201, null);
					TeamManager.logger.debug("FAIL:队长组队�?关未打开,leaderRoleId"+ leaderRoleId);
				}
				else if(!checkTeamNotFull(team))
				{
					//队伍人数已满
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 145045, 0, null);
					TeamManager.logger.debug("FAIL:队伍人数已满,teamId"+ teamId);
				}
				else if(!checkTeamFilter(team,applierRoleId))
				{
					TeamManager.logger.debug("FAIL:TeamFilter否决,TeamId: "+teamId);
				}
				else if(team.isApplyListFull())
				{
					//队伍申请列表已满�?15个）
					psend(applierRoleId, new STeamError(TeamError.ApplyListFull));
					TeamManager.logger.debug("FAIL:队伍申请列表已满�?15个）,teamId"+ teamId);
				}
				else if(team.getTeamInfo().getApplierids().containsKey(applierRoleId))
				{
					//申请者正在该队伍申请列表�?
					psend(applierRoleId, new STeamError(TeamError.AlreadyApply));
					TeamManager.logger.debug("FAIL:申请者正在该队伍申请列表�?,teamId"+ teamId);
				}
				else if(!checkLevelRequirementValid(team, applierRoleId))
				{
					//申请者未达到队伍级别要求
					//psend(applierRoleId, new STeamError(TeamError.ApplierLevelValid));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141207, null);
					TeamManager.logger.debug("FAIL:申请者未达到队伍级别要求,applierRoleId"+ applierRoleId);
				}
				else{
					
					boolean inWaiting1 = false;
					boolean inWaiting = false;
					//发起�?
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
						
					//�?查申请�?�是否满足这个队伍自动匹配的�?�? by changhao
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

					//向队长更新申请列�?
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
					//向申请�?�返回成功信�?
					SRequestJoinSucc sRequestJoinSucc = new SRequestJoinSucc();
					xbean.Properties leaderProperty = xtable.Properties.get(leaderRoleId);
					sRequestJoinSucc.rolename = leaderProperty.getRolename();
					psendWhileCommit(applierRoleId, sRequestJoinSucc);

					java.util.ArrayList<String> param = new java.util.ArrayList<String>();
					param.add(sRequestJoinSucc.rolename);
					
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150041, param);
					
					TeamManager.logger.debug("SUCC:满足条件，队伍可以接受申请�??,teamId"+ teamId);
				}
				return true;
			}
		};
		requestJoinTeamP.submit();
	}

	// �?测PVP
	private static int checkPvP(long targetRoleId, long selfRoleId) {
		// 申请加入别人队伍
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestJoinTeam(targetRoleId, selfRoleId);
	}

	//申请者在线？
	private boolean checkOnline(long roleId)
	{
		if(xtable.Roleonoffstate.get(roleId) == fire.pb.state.State.ENTRY_STATE)
			return true;
		else
			return false;
	}
	
	//申请者不在队伍中�?
	private boolean checkApplierNotInTeam(long applierRoleId)
	{
		if(xtable.Roleid2teamid.get(applierRoleId) == null)
			return true;
		else
			return false;
	}
	
	//申请者处于能申请组队的状态？（飞行，跑商，摆摊，护�?�等不能组队�?
	private boolean checkApplierStatusValid(long applierRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(applierRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("玩家(roleId=" + applierRoleId+")处于不能组队的状�?");
			return true;
		}
		return true;
	}
	
	
	//队长组队�?关打�?�?
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
	
	//队伍人数未满�?
	private boolean checkTeamNotFull(Team team)
	{
		if(team.getTeamInfo().getMembers().size() < TeamManager.MAX_MEMBER_COUNT)
			return true;
		else
			return false;
	}
	
	//申请者达到队伍级别要求？
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

	public long roleid; // ���˶���Ķӳ�ID

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


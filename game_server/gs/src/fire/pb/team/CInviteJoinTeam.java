
package fire.pb.team;

import fire.pb.PropRole;
import fire.pb.StateCommon;
import fire.pb.battle.PlayPKManage;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffConstant.StateType;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.buff.OperateType;
import fire.pb.clan.ClanUtils;
import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.talk.MessageMgr;





// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInviteJoinTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInviteJoinTeam extends __CInviteJoinTeam__ {
	//final static int MEMBER_MAX_COUNT = 4;//4个，作用于队伍成员人数（不包括队长），同时发出的�?请个�?
	
	//final static long MAX_INVITE_TIMEOUT = 30*1000;//30s,作用于邀请超时，同一�?请限制时�?

	private long now = 0L;//procedure�?始时保存�?个当前时间，保证此procedure中时间的统一�?
	
	@Override
	protected void process()
	{
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long inviterRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (inviterRoleId < 0)
			return;
		final long invitedRoleId = roleid;
		if(inviterRoleId == invitedRoleId)
		{
			MessageMgr.sendMsgNotify(inviterRoleId, 166006,  null);			
			
			return;
		}
		
		if (invitedRoleId < 0)
		{
			return;
		}
		
		BuffAgent agent = new BuffRoleImpl(inviterRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			if (fire.pb.team.TeamManager.isInTeam(inviterRoleId))
				MessageMgr.sendMsgNotify(inviterRoleId, 141866,  null);
			else 
 			    MessageMgr.sendMsgNotify(inviterRoleId, 141133,  null);
			return;
		}
	
		Long inviterclanfightid = xtable.Roleid2clanfightid.select(inviterRoleId);//如果�?请�?�在公会战场�? by changhao
		if (inviterclanfightid != null)
		{
			Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//如果被邀请�?�在公会战场�? by changhao
			if (!inviterclanfightid.equals(invitedclanfightid))
			{
 			    MessageMgr.sendMsgNotify(inviterRoleId, 410022,  null);
 			    return;
			}
			else
			{
				xbean.ClanInfo claninfo = ClanUtils.getClanInfoById(inviterRoleId, true);
				if (claninfo == null)
				{
					return;
				}
				
				xbean.ClanMemberInfo memberinfo = claninfo.getMembers().get(invitedRoleId);
				if (memberinfo == null)
				{
	 			    MessageMgr.sendMsgNotify(inviterRoleId, 410023,  null);
					return;
				}
			}
		}
		else
		{
			Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//如果被邀请�?�在公会战场�? by changhao
			if (invitedclanfightid != null)
			{
				if (!invitedclanfightid.equals(inviterclanfightid))
				{
	 			    MessageMgr.sendMsgNotify(inviterRoleId, 410024,  null);	
	 			    return;
				}				
			}
		}
		
		PropRole prole = new PropRole(invitedRoleId, true);
		if(prole.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CInviteJoinTeam:被邀请人" + invitedRoleId + "巡游状�??,此时不能入队");
			fire.pb.talk.MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
			return;
		}
		
		PropRole inviterroleid = new PropRole(inviterRoleId, true);
		if(inviterroleid.getProperties().getCruise() > 0) {
			TeamManager.logger.error("CInviteJoinTeam:�?请人" + inviterroleid + "被邀请人" + invitedRoleId + "�?请人在巡游状�?,不能�?请某�?");
			fire.pb.talk.MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
			return;
		}
		
		agent = new BuffRoleImpl(invitedRoleId,true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(inviterRoleId, 141865,  null);
			return;
		}

		if (checkPvP(inviterRoleId, invitedRoleId) != 0) {
			return;
		}

		mkdb.Procedure createTeamP = new mkdb.Procedure()
		{

			@Override /*lock顺序 team->roleid->match by changhao*/
			protected boolean process()
			{
				Team team = null;
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(inviterRoleId);
				//先验证队伍是否为�?,来决定是否锁teamlock
				if(teamId != null)
				{//锁teamlock
					team = new Team(teamId,false);
					//if(!team.isTeamLeader(inviterRoleId))
					//	return true;//验证该角色是否还是队伍的队长
				}
				
				// 按顺序锁rolelock�? teamlock
				Long inviterTeamId = null;
				Long invitedTeamId = null;
				if (inviterRoleId < invitedRoleId)
				{
					inviterTeamId = xtable.Roleid2teamid.get(inviterRoleId);
					invitedTeamId = xtable.Roleid2teamid.get(invitedRoleId);
				} else
				{
					invitedTeamId = xtable.Roleid2teamid.get(invitedRoleId);
					inviterTeamId = xtable.Roleid2teamid.get(inviterRoleId);
				}
				//lock end
				
				now = System.currentTimeMillis();
				
				if(!checkOnline(invitedRoleId, inviterRoleId))
				{
					//返回消息被邀请的玩家不在�?(illegal)
					TeamManager.logger.info("FAIL:CInviteJoinTeam:被邀请的玩家不在�?,RoleId: "+invitedRoleId);
				}
				else if(!checkInviterStatus(inviterRoleId))
				{
					//�?请�?�处于不能组队的状�?? 
					MessageMgr.psendMsgNotify(inviterRoleId, 141618, null);
//					psend(inviterRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:�?请�?�处于不能组队的状�??,RoleId: "+inviterRoleId);
				}
				else if(!checkInvitedStatus(invitedRoleId))
				{
					//被邀请�?�处于不能组队的状�?? 
					MessageMgr.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
//					psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:被邀请�?�处于不能组队的状�??,RoleId: "+invitedRoleId);
				}
				else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
				{
					//被邀请�?�的组队功能没有打开
//					psend(inviterRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					MessageMgr.psendMsgNotify(inviterRoleId, 141201, null);
					TeamManager.logger.info("FAIL:CInviteJoinTeam:被邀请�?�的组队功能没有打开,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkInvitedInNoTeam(invitedTeamId))
				{
					//被邀请�?�在队伍�?
					//psend(inviterRoleId, new STeamError(TeamError.ObjectInTeam));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:被邀请�?�在队伍�?,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141191, null);
				}
				else if(!checkNotBeingInvited(invitedRoleId))
				{
					//被邀请�?�正在被其他人邀请中 
//					psend(inviterRoleId, new STeamError(TeamError.BeingInvited));
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141202, null);
					TeamManager.logger.info("FAIL:CInviteJoinTeam:被邀请�?�正在被其他人邀请中,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkNotInvitedIn30s(invitedRoleId, inviterRoleId, inviterTeamId))
				{
					//被邀请�??30秒内曾经被队伍或者个人邀请过
					//psend(inviterRoleId, new STeamError(TeamError.InvitedIn30s));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:被邀请�??30秒内曾经被队伍或者个人邀请过,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141050, null);
				}
				else if(team != null)
				{
					//Team team = new Team(inviterTeamId,false);
					//来自队伍的邀�?
					//if(!checkInviterIsLeader(inviterRoleId, team))
					//{
					//	//�?请�?�不是队�?(illegal)
					//	TeamManager.logger.debug("FAIL:�?请�?�不是队�?,RoleId: "+inviterRoleId);
					//}
					if(!checkTeamNotFull(team))
					{
						//�?请队伍满�?
						psendWhileCommit(inviterRoleId, new STeamError(TeamError.TeamFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:�?请队伍满�?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamFilter(team, invitedRoleId))
					{
						TeamManager.logger.info("FAIL:CInviteJoinTeam:TeamFilter否决,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamInviteNotFull(team))
					{
						//�?请队伍的正在�?请人数达�?4个，不能再邀请更�?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:�?请队伍的正在�?请人数达�?4个，不能再邀请更�?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamLeaderState(inviterRoleId))
					{
						//�?请队伍的正在�?请人数达�?4个，不能再邀请更�?
						//psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:队长当前状�?�不能邀请�??");
					}
//					else if (fire.pb.buff.Module.existState(invitedRoleId,
//								BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(inviterRoleId, 160202, null);
//						TeamManager.logger.info("CInviteJoinTeam:玩家(roleId=" + roleid+")invite处于副本�?,不能组队");
//					}
					else{
						if(!checkMap()){
							return false;
						}
						
						boolean isForceTeam = TeamManager.getInstance().isForceTeam(teamId, invitedRoleId);
												
						TeamManager.logger.info("SUCC:CInviteJoinTeam:满足条件，可以发出队伍邀�? "+inviterTeamId);
						// 满足条件，可以发出队伍邀�?
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = xtable.Properties.get(inviterRoleId).getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 保存�?�?,这里不用定时器，可以被动方式清除
						//保存�?请到队伍
						team.getTeamInfo().getInvitingids().put(invitedRoleId,now);
						//保存�?请到被邀请表，先看被�?请�?�的�?请信息是否已存在
						xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
						if(inviteInfo == null)
						{
							inviteInfo = xbean.Pod.newInviteInfo();
							xtable.Teaminvite.add(invitedRoleId, inviteInfo);
						}
						
						if (inviterTeamId == null)
						{
							return false;
						}
						
						inviteInfo.setBeinginvited(true);
						inviteInfo.getInviting().setTeamid(inviterTeamId);
						inviteInfo.getInviting().setRoleid(inviterRoleId);
						inviteInfo.getInviting().setInvitetime(now);						
						inviteInfo.getInvited().add(inviteInfo.getInviting().copy());
						
						if (isForceTeam && force == 1)
						{
							snd.op = 1;
							mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);								
						}
						else if (!team.isTeamLeader(inviterRoleId)) //如果�?请�?�不是队�? by changhao
						{
							snd.op = 2;
							snd.leaderroleid = team.getTeamLeaderId();
							psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
							MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
							// 发�?�邀�?
							mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);								
						}
						else
						{
							
							xbean.Properties invitedProp = xtable.Properties.select(invitedRoleId);
							if (invitedProp != null)
							{
								Integer v = invitedProp.getSysconfigmap().get(11);
								if (v != null)
								{
									if (v == 1)
									{
										MessageMgr.psendMsgNotify(inviterRoleId, 166060, null);
										return false;
									}
								}
							}
							
							snd.op = 0;
							psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
							MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
							// 发�?�邀�?
							mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);							
						}
					}
			
				}
				else
				{
					//来自个人的邀�?
					if(!checkSingleInviteNotFull(inviterRoleId))
					{
						//�?请�?�正在邀请人数达�?4个，不能再邀请更�?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.debug("FAIL:�?请�?�正在邀请人数达�?4个，不能再邀请更 "+inviterRoleId);
					}
					else if(!checkTeamFilter(inviterRoleId, invitedRoleId))
					{
						TeamManager.logger.debug("FAIL:TeamFilter否决,TeamId: "+inviterTeamId);
					}
					else if (fire.pb.buff.Module.existState(invitedRoleId,
							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						Message.sendMsgNotify(inviterRoleId, 160202, null);
						TeamManager.logger.info("玩家(roleId=" + invitedRoleId+")invite处于副本�?,不能组队");
					}
					else if (fire.pb.buff.Module.existState(inviterRoleId,
							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						Message.sendMsgNotify(inviterRoleId, 160202, null);
						TeamManager.logger.info("玩家(roleId=" + inviterRoleId+")invite处于副本�?,不能组队");
					}
					else
					{
						if(!checkMap()){
							return false;
						}
						
						TeamManager.logger.debug("SUCC:满足条件，可以发出个人邀�? "+inviterRoleId);
						// 满足条件，可以发出个人邀�?
						xbean.Properties inviterProperty = xtable.Properties.get(inviterRoleId);
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = inviterProperty.getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 保存�?�?,这里不用定时器，可以被动方式清除
						//保存�?请到个人�?请表
						xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
						if(singleInvitings == null)
						{
							singleInvitings = xbean.Pod.newSingleInvitings();
							xtable.Singleinviting.add(inviterRoleId, singleInvitings);
						}
						singleInvitings.getInvitingids().put(invitedRoleId, now);
						//保存�?请到被邀请表，先看被�?请�?�的�?请信息是否已存在
						xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
						if(inviteInfo == null)
						{
							inviteInfo = xbean.Pod.newInviteInfo();
							xtable.Teaminvite.add(invitedRoleId, inviteInfo);
						}
						inviteInfo.setBeinginvited(true);
						if(inviterTeamId == null)
							inviterTeamId = -1L;
						inviteInfo.getInviting().setTeamid(inviterTeamId);
						inviteInfo.getInviting().setRoleid(inviterRoleId);
						inviteInfo.getInviting().setInvitetime(now);						
						inviteInfo.getInvited().add(inviteInfo.getInviting().copy());
						
						// 发�?�邀�?
						psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
						MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
						mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);
					}
				}
					
				return true;
			}
			
			private boolean checkMap(){
							
				boolean inWaiting1 = false;
				boolean inWaiting = false;

				//发起�?
				final fire.pb.map.Role  invitMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(inviterRoleId);
				final fire.pb.map.Role  desMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(invitedRoleId);
				if(invitMaprole == null || desMaprole == null){
					return true;
				}
				int srcMapId = invitMaprole.getMapId();
				MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(srcMapId);
				
				int desMapId = desMaprole.getMapId();
				MapConfig descfg = ConfigManager.getInstance().getConf(MapConfig.class).get(desMapId);
				
				if (srcMapId != desMapId) {
					
//					if (fire.pb.buff.Module.existState(inviterRoleId,
//							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(inviterRoleId, 160202, null);
//						return false;
//					}
					
				} else {
					if (inWaiting || inWaiting1) {
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(
								inviterRoleId, 145250, null);
						return false;
					}
				}
				
				//在安全地�? 不校验组�?
				if(cfg == null || descfg == null){
					return true;
				}
				if(cfg.getSafemap() == descfg.getSafemap() && cfg.getSafemap() == 1){
					return true;
				}
				
				return true;	
			}
		};
		createTeamP.submit();
	}

	// �?测PVP
	private static int checkPvP(long inviterRoleId, long invitedRoleId) {
		// �?请成�?
		return fire.pb.battle.pvp.PvPTeamHandle.onInviteJoinTeam(inviterRoleId, invitedRoleId);
	}

	// �?请�?�和被邀请�?�同时在�??只能在Procedure中被调用
	private boolean checkOnline(long invitedRoleId, long inviterRoleId)
	{
		if(StateCommon.isOnlineBuffer(invitedRoleId))
			return true;
		else
		{
			//对方不在�?
			MessageMgr.sendMsgNotify(inviterRoleId, 141701, null);
			return false;
		}
	}	
	
	//�?请�?�处于可以组队的状�?�？（非跑商、飞行�?�单人任务等�?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("玩家(roleId=" + inviterRoleId+")处于不能组队的状�?");
			return false;
		}
		return true;
	}
	
	//被邀请�?�处于可以组队的状�?�？（非跑商、飞行�?�单人任务等�?
	private boolean checkInvitedStatus(long invitedRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(invitedRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("玩家(roleId=" + invitedRoleId+")处于不能组队的状�?");
			return false;
		}
		return true;
	}
	
	// 被邀请�?�组队开关已打开?只能在Procedure中被调用
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
		//组队�?�?
//		if(fire.pb.SystemSettingConfig.checkRoleSetting(invitedRoleId, fire.pb.SysSetType.AcceptTeam)<=0)
//			return false;
//		else
			return true;
	}
	
	// 被邀请�?�不在队伍中？只能在Procedure中被调用
	private boolean checkInvitedInNoTeam(Long invitedTeamId)
	{
		if(invitedTeamId == null)
			return true;
		else
			return false;
	}
	
	// 被邀请�?�没有正在被�?请？只能在Procedure中被调用
	private boolean checkNotBeingInvited(long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
		
		if (inviteInfo == null)//如果没有记录，表示从未被�?请过
			return true;
		if(!inviteInfo.getBeinginvited())
		{
			//如果正在�?请位为false，肯定不处于被邀请状态，清除过期�?�?
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else if ((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{
			//处于�?请状态，但是已经超时，需要更新被�?请�?�状态为不处于被�?请状态，同时清除过期�?�?
			inviteInfo.setBeinginvited(false);
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else
			return false;
	}
	
	//清除�?请表中的过期�?�?,只能在Procedure中被调用
	private void cleanTimeoutInvites(java.util.List<xbean.TeamInvite> invites)
	{
		java.util.List<xbean.TeamInvite> timeoutList = new java.util.ArrayList<xbean.TeamInvite>();
		for (xbean.TeamInvite invite : invites)
		{
			if ((now - invite.getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
				timeoutList.add(invite);
		}
		invites.removeAll(timeoutList);
	}

	// 这个�?请没有被队伍或�?�个人在30秒内�?请过？只能在Procedure中被调用
	private boolean checkNotInvitedIn30s(long invitedRoleId, long inviterRoleId, Long inviterTeamId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
		if(inviteInfo!=null)
		{
			java.util.List<xbean.TeamInvite> timeoutList = new java.util.ArrayList<xbean.TeamInvite>();
			boolean result = true;
			for (xbean.TeamInvite invited : inviteInfo.getInvited())
			{
				if ((now - invited.getInvitetime()) < TeamManager.MAX_INVITE_TIMEOUT)
				{
					if (!result)
						continue;// 如果已经找到（result == false），就没必要进行后面的判断了
					else if (invited.getRoleid() == inviterRoleId)
						result = false;// roleid相等
					else if (inviterTeamId != null && invited.getTeamid() == inviterTeamId)
						result = false;// inviterTeamId存在并且teamId相等
				} else
					timeoutList.add(invited);// 超过30秒的过会�?起删�?
			}
			inviteInfo.getInvited().removeAll(timeoutList);
			return result;
		}
		else
		{
			return true;
		}
	}
	

	// �?请�?�是队长？只能在Procedure中被调用
	private boolean checkInviterIsLeader(long inviterRoleId , Team team)
	{
		if(team.getTeamInfo().getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}

	// �?请�?�队伍人�?<5? 只能在Procedure中被调用
	private boolean checkTeamNotFull(Team team)
	{
		if (team.getTeamInfo().getMembers().size() < TeamManager.MAX_MEMBER_COUNT)
			return true;
		else
			return false;
	}
	

	private boolean checkTeamFilter(Team team, long roleId)
	{
		TeamFilter filter = team.getFilter();
		if(filter == null)
			return true;
		return filter.checkInviteJoin(team.getTeamLeaderId(), roleId);
	}
	
	private boolean checkTeamFilter(long inviterId, long roleId)
	{
		TeamFilter filter = TeamManager.getActiveFilter(inviterId);
		if(filter == null)
			return true;
		return filter.checkInviteJoin(inviterId, roleId);
	}
	
	// �?请�?�队伍的�?请次�?<4? 只能在Procedure中被调用
	private boolean checkTeamInviteNotFull(Team team)
	{
		//先清理过期邀�?
		cleanTimoutInvitings(team.getTeamInfo().getInvitingids());
		if (team.getTeamInfo().getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	// �?请�?�状态不允许? 只能在Procedure中被调用
	private boolean checkTeamLeaderState(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId);
		return buffagent.canAddBuff(OperateType.TEAM_INVITE);
	}
	
	// �?请�?�的�?请次�?<4? 只能在Procedure中被调用
	private boolean checkSingleInviteNotFull(long inviterRoleId)
	{
		xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
		//先清理过期邀�?
		if(singleInvitings == null)
			return true;
		cleanTimoutInvitings(singleInvitings.getInvitingids());
		if (singleInvitings.getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	//清除队伍和个人邀请�?�中的过期邀�?
	private void cleanTimoutInvitings(java.util.Map<Long,Long> invitings)
	{
		Object[] keys = invitings.keySet().toArray();
		for(int i = 0; i <keys.length;i++)
		{
			if ((now - invitings.get(keys[i])) > TeamManager.MAX_INVITE_TIMEOUT)
			invitings.remove(keys[i]);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794446;

	public int getType() {
		return 794446;
	}

	public long roleid; // �������߽�ɫID
	public int force; // ǿ�ƶԷ����� by changhao

	public CInviteJoinTeam() {
	}

	public CInviteJoinTeam(long _roleid_, int _force_) {
		this.roleid = _roleid_;
		this.force = _force_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(force);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		force = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInviteJoinTeam) {
			CInviteJoinTeam _o_ = (CInviteJoinTeam)_o1_;
			if (roleid != _o_.roleid) return false;
			if (force != _o_.force) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += force;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(force).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInviteJoinTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = force - _o_.force;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
	//final static int MEMBER_MAX_COUNT = 4;//4涓紝浣滅敤浜庨槦浼嶆垚鍛樹汉鏁帮紙涓嶅寘鎷槦闀匡級锛屽悓鏃跺彂鍑虹殑閭?璇蜂釜鏁?
	
	//final static long MAX_INVITE_TIMEOUT = 30*1000;//30s,浣滅敤浜庨個璇疯秴鏃讹紝鍚屼竴閭?璇烽檺鍒舵椂闂?

	private long now = 0L;//procedure寮?濮嬫椂淇濆瓨涓?涓綋鍓嶆椂闂达紝淇濊瘉姝rocedure涓椂闂寸殑缁熶竴鎬?
	
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
	
		Long inviterclanfightid = xtable.Roleid2clanfightid.select(inviterRoleId);//濡傛灉閭?璇疯?呭湪鍏細鎴樺満涓? by changhao
		if (inviterclanfightid != null)
		{
			Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濡傛灉琚個璇疯?呭湪鍏細鎴樺満涓? by changhao
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
			Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濡傛灉琚個璇疯?呭湪鍏細鎴樺満涓? by changhao
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
			TeamManager.logger.info("CInviteJoinTeam:琚個璇蜂汉" + invitedRoleId + "宸℃父鐘舵??,姝ゆ椂涓嶈兘鍏ラ槦");
			fire.pb.talk.MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
			return;
		}
		
		PropRole inviterroleid = new PropRole(inviterRoleId, true);
		if(inviterroleid.getProperties().getCruise() > 0) {
			TeamManager.logger.error("CInviteJoinTeam:閭?璇蜂汉" + inviterroleid + "琚個璇蜂汉" + invitedRoleId + "閭?璇蜂汉鍦ㄥ贰娓哥姸鎬?,涓嶈兘閭?璇锋煇浜?");
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

			@Override /*lock椤哄簭 team->roleid->match by changhao*/
			protected boolean process()
			{
				Team team = null;
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(inviterRoleId);
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?,鏉ュ喅瀹氭槸鍚﹂攣teamlock
				if(teamId != null)
				{//閿乼eamlock
					team = new Team(teamId,false);
					//if(!team.isTeamLeader(inviterRoleId))
					//	return true;//楠岃瘉璇ヨ鑹叉槸鍚﹁繕鏄槦浼嶇殑闃熼暱
				}
				
				// 鎸夐『搴忛攣rolelock鍜? teamlock
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
					//杩斿洖娑堟伅琚個璇风殑鐜╁涓嶅湪绾?(illegal)
					TeamManager.logger.info("FAIL:CInviteJoinTeam:琚個璇风殑鐜╁涓嶅湪绾?,RoleId: "+invitedRoleId);
				}
				else if(!checkInviterStatus(inviterRoleId))
				{
					//閭?璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵?? 
					MessageMgr.psendMsgNotify(inviterRoleId, 141618, null);
//					psend(inviterRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閭?璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵??,RoleId: "+inviterRoleId);
				}
				else if(!checkInvitedStatus(invitedRoleId))
				{
					//琚個璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵?? 
					MessageMgr.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
//					psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:琚個璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵??,RoleId: "+invitedRoleId);
				}
				else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
				{
					//琚個璇疯?呯殑缁勯槦鍔熻兘娌℃湁鎵撳紑
//					psend(inviterRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					MessageMgr.psendMsgNotify(inviterRoleId, 141201, null);
					TeamManager.logger.info("FAIL:CInviteJoinTeam:琚個璇疯?呯殑缁勯槦鍔熻兘娌℃湁鎵撳紑,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkInvitedInNoTeam(invitedTeamId))
				{
					//琚個璇疯?呭湪闃熶紞涓?
					//psend(inviterRoleId, new STeamError(TeamError.ObjectInTeam));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:琚個璇疯?呭湪闃熶紞涓?,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141191, null);
				}
				else if(!checkNotBeingInvited(invitedRoleId))
				{
					//琚個璇疯?呮鍦ㄨ鍏朵粬浜洪個璇蜂腑 
//					psend(inviterRoleId, new STeamError(TeamError.BeingInvited));
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141202, null);
					TeamManager.logger.info("FAIL:CInviteJoinTeam:琚個璇疯?呮鍦ㄨ鍏朵粬浜洪個璇蜂腑,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkNotInvitedIn30s(invitedRoleId, inviterRoleId, inviterTeamId))
				{
					//琚個璇疯??30绉掑唴鏇剧粡琚槦浼嶆垨鑰呬釜浜洪個璇疯繃
					//psend(inviterRoleId, new STeamError(TeamError.InvitedIn30s));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:琚個璇疯??30绉掑唴鏇剧粡琚槦浼嶆垨鑰呬釜浜洪個璇疯繃,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141050, null);
				}
				else if(team != null)
				{
					//Team team = new Team(inviterTeamId,false);
					//鏉ヨ嚜闃熶紞鐨勯個璇?
					//if(!checkInviterIsLeader(inviterRoleId, team))
					//{
					//	//閭?璇疯?呬笉鏄槦闀?(illegal)
					//	TeamManager.logger.debug("FAIL:閭?璇疯?呬笉鏄槦闀?,RoleId: "+inviterRoleId);
					//}
					if(!checkTeamNotFull(team))
					{
						//閭?璇烽槦浼嶆弧浜?
						psendWhileCommit(inviterRoleId, new STeamError(TeamError.TeamFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:閭?璇烽槦浼嶆弧浜?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamFilter(team, invitedRoleId))
					{
						TeamManager.logger.info("FAIL:CInviteJoinTeam:TeamFilter鍚﹀喅,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamInviteNotFull(team))
					{
						//閭?璇烽槦浼嶇殑姝ｅ湪閭?璇蜂汉鏁拌揪鍒?4涓紝涓嶈兘鍐嶉個璇锋洿澶?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:閭?璇烽槦浼嶇殑姝ｅ湪閭?璇蜂汉鏁拌揪鍒?4涓紝涓嶈兘鍐嶉個璇锋洿澶?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamLeaderState(inviterRoleId))
					{
						//閭?璇烽槦浼嶇殑姝ｅ湪閭?璇蜂汉鏁拌揪鍒?4涓紝涓嶈兘鍐嶉個璇锋洿澶?
						//psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:闃熼暱褰撳墠鐘舵?佷笉鑳介個璇枫??");
					}
//					else if (fire.pb.buff.Module.existState(invitedRoleId,
//								BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(inviterRoleId, 160202, null);
//						TeamManager.logger.info("CInviteJoinTeam:鐜╁(roleId=" + roleid+")invite澶勪簬鍓湰涓?,涓嶈兘缁勯槦");
//					}
					else{
						if(!checkMap()){
							return false;
						}
						
						boolean isForceTeam = TeamManager.getInstance().isForceTeam(teamId, invitedRoleId);
												
						TeamManager.logger.info("SUCC:CInviteJoinTeam:婊¤冻鏉′欢锛屽彲浠ュ彂鍑洪槦浼嶉個璇? "+inviterTeamId);
						// 婊¤冻鏉′欢锛屽彲浠ュ彂鍑洪槦浼嶉個璇?
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = xtable.Properties.get(inviterRoleId).getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 淇濆瓨閭?璇?,杩欓噷涓嶇敤瀹氭椂鍣紝鍙互琚姩鏂瑰紡娓呴櫎
						//淇濆瓨閭?璇峰埌闃熶紞
						team.getTeamInfo().getInvitingids().put(invitedRoleId,now);
						//淇濆瓨閭?璇峰埌琚個璇疯〃锛屽厛鐪嬭閭?璇疯?呯殑閭?璇蜂俊鎭槸鍚﹀凡瀛樺湪
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
						else if (!team.isTeamLeader(inviterRoleId)) //濡傛灉閭?璇疯?呬笉鏄槦闀? by changhao
						{
							snd.op = 2;
							snd.leaderroleid = team.getTeamLeaderId();
							psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
							MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
							// 鍙戦?侀個璇?
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
							// 鍙戦?侀個璇?
							mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);							
						}
					}
			
				}
				else
				{
					//鏉ヨ嚜涓汉鐨勯個璇?
					if(!checkSingleInviteNotFull(inviterRoleId))
					{
						//閭?璇疯?呮鍦ㄩ個璇蜂汉鏁拌揪鍒?4涓紝涓嶈兘鍐嶉個璇锋洿澶?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.debug("FAIL:閭?璇疯?呮鍦ㄩ個璇蜂汉鏁拌揪鍒?4涓紝涓嶈兘鍐嶉個璇锋洿 "+inviterRoleId);
					}
					else if(!checkTeamFilter(inviterRoleId, invitedRoleId))
					{
						TeamManager.logger.debug("FAIL:TeamFilter鍚﹀喅,TeamId: "+inviterTeamId);
					}
					else if (fire.pb.buff.Module.existState(invitedRoleId,
							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						Message.sendMsgNotify(inviterRoleId, 160202, null);
						TeamManager.logger.info("鐜╁(roleId=" + invitedRoleId+")invite澶勪簬鍓湰涓?,涓嶈兘缁勯槦");
					}
					else if (fire.pb.buff.Module.existState(inviterRoleId,
							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						Message.sendMsgNotify(inviterRoleId, 160202, null);
						TeamManager.logger.info("鐜╁(roleId=" + inviterRoleId+")invite澶勪簬鍓湰涓?,涓嶈兘缁勯槦");
					}
					else
					{
						if(!checkMap()){
							return false;
						}
						
						TeamManager.logger.debug("SUCC:婊¤冻鏉′欢锛屽彲浠ュ彂鍑轰釜浜洪個璇? "+inviterRoleId);
						// 婊¤冻鏉′欢锛屽彲浠ュ彂鍑轰釜浜洪個璇?
						xbean.Properties inviterProperty = xtable.Properties.get(inviterRoleId);
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = inviterProperty.getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 淇濆瓨閭?璇?,杩欓噷涓嶇敤瀹氭椂鍣紝鍙互琚姩鏂瑰紡娓呴櫎
						//淇濆瓨閭?璇峰埌涓汉閭?璇疯〃
						xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
						if(singleInvitings == null)
						{
							singleInvitings = xbean.Pod.newSingleInvitings();
							xtable.Singleinviting.add(inviterRoleId, singleInvitings);
						}
						singleInvitings.getInvitingids().put(invitedRoleId, now);
						//淇濆瓨閭?璇峰埌琚個璇疯〃锛屽厛鐪嬭閭?璇疯?呯殑閭?璇蜂俊鎭槸鍚﹀凡瀛樺湪
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
						
						// 鍙戦?侀個璇?
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

				//鍙戣捣浜?
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
				
				//鍦ㄥ畨鍏ㄥ湴鍥? 涓嶆牎楠岀粍闃?
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

	// 妫?娴婸VP
	private static int checkPvP(long inviterRoleId, long invitedRoleId) {
		// 閭?璇锋垚鍛?
		return fire.pb.battle.pvp.PvPTeamHandle.onInviteJoinTeam(inviterRoleId, invitedRoleId);
	}

	// 閭?璇疯?呭拰琚個璇疯?呭悓鏃跺湪绾??鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkOnline(long invitedRoleId, long inviterRoleId)
	{
		if(StateCommon.isOnlineBuffer(invitedRoleId))
			return true;
		else
		{
			//瀵规柟涓嶅湪绾?
			MessageMgr.sendMsgNotify(inviterRoleId, 141701, null);
			return false;
		}
	}	
	
	//閭?璇疯?呭浜庡彲浠ョ粍闃熺殑鐘舵?侊紵锛堥潪璺戝晢銆侀琛屻?佸崟浜轰换鍔＄瓑锛?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("鐜╁(roleId=" + inviterRoleId+")澶勪簬涓嶈兘缁勯槦鐨勭姸鎬?");
			return false;
		}
		return true;
	}
	
	//琚個璇疯?呭浜庡彲浠ョ粍闃熺殑鐘舵?侊紵锛堥潪璺戝晢銆侀琛屻?佸崟浜轰换鍔＄瓑锛?
	private boolean checkInvitedStatus(long invitedRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(invitedRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("鐜╁(roleId=" + invitedRoleId+")澶勪簬涓嶈兘缁勯槦鐨勭姸鎬?");
			return false;
		}
		return true;
	}
	
	// 琚個璇疯?呯粍闃熷紑鍏冲凡鎵撳紑?鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
		//缁勯槦寮?鍏?
//		if(fire.pb.SystemSettingConfig.checkRoleSetting(invitedRoleId, fire.pb.SysSetType.AcceptTeam)<=0)
//			return false;
//		else
			return true;
	}
	
	// 琚個璇疯?呬笉鍦ㄩ槦浼嶄腑锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkInvitedInNoTeam(Long invitedTeamId)
	{
		if(invitedTeamId == null)
			return true;
		else
			return false;
	}
	
	// 琚個璇疯?呮病鏈夋鍦ㄨ閭?璇凤紵鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkNotBeingInvited(long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
		
		if (inviteInfo == null)//濡傛灉娌℃湁璁板綍锛岃〃绀轰粠鏈閭?璇疯繃
			return true;
		if(!inviteInfo.getBeinginvited())
		{
			//濡傛灉姝ｅ湪閭?璇蜂綅涓篺alse锛岃偗瀹氫笉澶勪簬琚個璇风姸鎬侊紝娓呴櫎杩囨湡閭?璇?
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else if ((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{
			//澶勪簬閭?璇风姸鎬侊紝浣嗘槸宸茬粡瓒呮椂锛岄渶瑕佹洿鏂拌閭?璇疯?呯姸鎬佷负涓嶅浜庤閭?璇风姸鎬侊紝鍚屾椂娓呴櫎杩囨湡閭?璇?
			inviteInfo.setBeinginvited(false);
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else
			return false;
	}
	
	//娓呴櫎閭?璇疯〃涓殑杩囨湡閭?璇?,鍙兘鍦≒rocedure涓璋冪敤
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

	// 杩欎釜閭?璇锋病鏈夎闃熶紞鎴栬?呬釜浜哄湪30绉掑唴閭?璇疯繃锛熷彧鑳藉湪Procedure涓璋冪敤
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
						continue;// 濡傛灉宸茬粡鎵惧埌锛坮esult == false锛夛紝灏辨病蹇呰杩涜鍚庨潰鐨勫垽鏂簡
					else if (invited.getRoleid() == inviterRoleId)
						result = false;// roleid鐩哥瓑
					else if (inviterTeamId != null && invited.getTeamid() == inviterTeamId)
						result = false;// inviterTeamId瀛樺湪骞朵笖teamId鐩哥瓑
				} else
					timeoutList.add(invited);// 瓒呰繃30绉掔殑杩囦細涓?璧峰垹闄?
			}
			inviteInfo.getInvited().removeAll(timeoutList);
			return result;
		}
		else
		{
			return true;
		}
	}
	

	// 閭?璇疯?呮槸闃熼暱锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkInviterIsLeader(long inviterRoleId , Team team)
	{
		if(team.getTeamInfo().getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}

	// 閭?璇疯?呴槦浼嶄汉鏁?<5? 鍙兘鍦≒rocedure涓璋冪敤
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
	
	// 閭?璇疯?呴槦浼嶇殑閭?璇锋鏁?<4? 鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkTeamInviteNotFull(Team team)
	{
		//鍏堟竻鐞嗚繃鏈熼個璇?
		cleanTimoutInvitings(team.getTeamInfo().getInvitingids());
		if (team.getTeamInfo().getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	// 閭?璇疯?呯姸鎬佷笉鍏佽? 鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkTeamLeaderState(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId);
		return buffagent.canAddBuff(OperateType.TEAM_INVITE);
	}
	
	// 閭?璇疯?呯殑閭?璇锋鏁?<4? 鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkSingleInviteNotFull(long inviterRoleId)
	{
		xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
		//鍏堟竻鐞嗚繃鏈熼個璇?
		if(singleInvitings == null)
			return true;
		cleanTimoutInvitings(singleInvitings.getInvitingids());
		if (singleInvitings.getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	//娓呴櫎闃熶紞鍜屼釜浜洪個璇疯?呬腑鐨勮繃鏈熼個璇?
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

	public long roleid; // 被邀请者角色ID
	public int force; // 强制对方进组 by changhao

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



package fire.pb.team;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import fire.pb.PropRole;
import fire.pb.StateCommon;
import fire.pb.battle.PlayPKManage;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.clan.ClanUtils;
import fire.pb.event.ArriveTeamSpecialQuestEvent;
import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRespondInvite__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 鍥炲簲閭?璇?
 * @author changhao
 *
 */
public class CRespondInvite extends __CRespondInvite__ {
		
	//final static int MEMBER_MAX_COUNT = 4;//4涓紝浣滅敤浜庨槦浼嶆垚鍛樹汉鏁帮紙涓嶅寘鎷槦闀匡級锛屽悓鏃跺彂鍑虹殑閭?璇蜂釜鏁?
	
	//final static long MAX_INVITE_TIMEOUT = 30*1000;//30s,浣滅敤浜庨個璇疯秴鏃讹紝鍚屼竴閭?璇烽檺鍒舵椂闂?
	private long now = 0L;//procedure寮?濮嬫椂淇濆瓨涓?涓?硷紝淇濊瘉姝rocedure涓椂闂寸殑缁熶竴鎬?
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long invitedRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (invitedRoleId < 0)
			return;	
		
		mkdb.Procedure resInviteP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				now = System.currentTimeMillis();
				//lock start
				//楠岃瘉鏄惁琚個璇?
				try
				{
				xbean.InviteInfo inviteInfo = xtable.Teaminvite.select(invitedRoleId);
				if(inviteInfo == null)
					return true;
				else if(!inviteInfo.getBeinginvited())
					return true;
				else if((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
				{   //閭?璇疯秴鏃?
					inviteInfo.setBeinginvited(false);
					return true;
				}
				
				xbean.TeamInvite inviting = inviteInfo.getInviting();
				long inviterRoleId = inviting.getRoleid();
				Long inviterTeamId = null;
				if(inviting.getTeamid() > -1)
					inviterTeamId = inviting.getTeamid();
				int lockState = 0;
				if(agree == 1)
				{
					Long inviterclanfightid = xtable.Roleid2clanfightid.select(inviterRoleId);//濡傛灉閭?璇疯?呭湪鍏細鎴樺満涓? by changhao
					if (inviterclanfightid != null)
					{
						Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濡傛灉琚個璇疯?呭湪鍏細鎴樺満涓? by changhao
						if (!inviterclanfightid.equals(invitedclanfightid))
						{
			 			    MessageMgr.sendMsgNotify(inviterRoleId, 410022,  null);
			 			    MessageMgr.sendMsgNotify(invitedRoleId, 410031,  null);
			 			    return true;
						}
						else
						{
							xbean.ClanInfo claninfo = ClanUtils.getClanInfoById(inviterRoleId, true);
							if (claninfo == null)
							{
								return true;
							}
							
							xbean.ClanMemberInfo memberinfo = claninfo.getMembers().get(invitedRoleId);
							if (memberinfo == null)
							{
				 			    MessageMgr.sendMsgNotify(inviterRoleId, 410023,  null);
				 			    MessageMgr.sendMsgNotify(invitedRoleId, 410029,  null);
								return true;
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
				 			    MessageMgr.sendMsgNotify(invitedRoleId, 410032,  null);	
				 			    return true;
							}				
						}
					}						
					
					PropRole inviterprop = new PropRole(inviterRoleId, true);
					if(inviterprop.getProperties().getCruise() > 0)
					{
						MessageMgr.sendMsgNotify(invitedRoleId, 162026, null);
						MessageMgr.sendMsgNotify(inviterRoleId, 162027, null);
						TeamManager.logger.info("CRespondInvite1:閭?璇蜂汉" + inviterRoleId + "琚個璇蜂汉" + invitedRoleId + ",閭?璇蜂汉鍦ㄥ贰娓哥姸鎬?,涓嶈兘閭?璇锋煇浜?");
						return true;
					}
					
					PropRole invitedprop = new PropRole(invitedRoleId, true);
					if(invitedprop.getProperties().getCruise() > 0)
					{
						MessageMgr.sendMsgNotify(invitedRoleId, 162027, null);
						MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
						TeamManager.logger.info("CRespondInvite2:閭?璇蜂汉" + inviterRoleId + "琚個璇蜂汉" + invitedRoleId + ",閭?璇蜂汉鍦ㄥ贰娓哥姸鎬?,涓嶈兘閭?璇锋煇浜?");
						return true;
					}
					
					if(checkInviteFromTeam(inviterTeamId))
					{
						//鏉ヨ嚜闃熶紞鐨勯個璇凤紝閿乼eam锛岄槦闀垮拰琚個璇疯??
						lockState = 3;
					}
					else
					{
						//鏉ヨ嚜涓汉鐨勯個璇凤紝鐪嬬幇鍦ㄦ湁鏃犻槦浼?
						inviterTeamId = xtable.Roleid2teamid.select(inviterRoleId);
						if(inviterTeamId!= null)
						{//鏈夐槦浼嶏紝鐪嬫槸鍚︽槸闃熼暱
							lockState = 3;//閿乼eam锛岄槦闀垮拰琚個璇疯??
						}
						else
						{//鏃犻槦浼嶏紝閿侀個璇疯?呭拰琚個璇疯??
							lockState = 2;
						}
					}
				}
				else
				{//鍙攣琚個璇疯?呯殑rolelock
					lockState = 1;
				}
				
				switch (lockState)
				{
				case 1://鍙攣琚個璇疯?呯殑rolelock
					Long[] roleids1 = new Long[1];
					roleids1[0] = invitedRoleId;
					this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids1));
					break;
				case 2://鏃犻槦浼嶏紝閿侀個璇疯?呭拰琚個璇疯??
					Object[] roleids2 = new Object[2];
					if(inviterRoleId < invitedRoleId)
					{
						roleids2[0] = inviterRoleId;
						roleids2[1] = invitedRoleId;
					}
					else
					{
						roleids2[0] = invitedRoleId;
						roleids2[1] = inviterRoleId;
					}
					this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, roleids2));
					break;

				case 3://閿乼eam锛屽拰鎵?鏈変汉
					xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId);
					if(teamInfo == null)
					{
						psend(invitedRoleId, new STeamError(TeamError.InviterTeamNotExist));
						TeamManager.logger.debug("FAIL:閭?璇锋偍鐨勯槦浼嶅凡缁忚В鏁?,TeamId: "+inviterTeamId);
						return true;
					}
					team = new Team(inviterTeamId,false);
					Set<Long> roleids = team.getAllMemberIdSet();
					roleids.add(invitedRoleId);
					this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, roleids));
					break;
				default:
					return true;
				}
				if(agree == 1){
				}
				PropRole prole = new PropRole(invitedRoleId, true);
				String invitedName = prole.getName();
				
				Long invitedTeamId = xtable.Roleid2teamid.get(invitedRoleId);
				if(!checkInviteExist(invitedRoleId))
				{
					//閭?璇峰凡缁忚秴鏃舵垨鑰呴個璇蜂笉瀛樺湪锛坕llegal锛?
					TeamManager.logger.debug("FAIL:閭?璇峰凡缁忚秴鏃舵垨鑰呴個璇蜂笉瀛樺湪,RoleId: "+invitedRoleId);
					return true;
				}
				if(agree == 1)
				{
					if (checkPvP(inviterRoleId, invitedRoleId) != 0) {
						return true;
					}

					if(!checkOnline(invitedRoleId))
					{
						//琚個璇疯?呬笉鍦ㄧ嚎,鎺ュ彈閭?璇峰悗鍙堜笅绾夸簡锛燂紙illegal锛?
						TeamManager.logger.debug("FAIL:琚個璇疯?呬笉鍦ㄧ嚎,鎺ュ彈閭?璇峰悗鍙堜笅绾夸簡锛?,RoleId: "+invitedRoleId);
					}
					/*else if(!checkInvitedStatus(invitedRoleId))
					{
						//琚個璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵??
						//psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
						Message.psendMsgNotify(invitedRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
						TeamManager.logger.debug("FAIL:琚個璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵??,RoleId: "+invitedRoleId);
					}*/
					else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
					{
						//琚個璇疯?呯殑缁勯槦鍔熻兘娌℃湁鎵撳紑
						psend(invitedRoleId, new STeamError(TeamError.SelfTeamFunctionClose));
						TeamManager.logger.debug("FAIL:琚個璇疯?呯殑缁勯槦鍔熻兘娌℃湁鎵撳紑,RoleId: "+invitedRoleId);
					}
					else if(!checkInvitedInNoTeam(invitedTeamId))
					{
						//琚個璇疯?呭湪闃熶紞涓紙illegal锛?
						TeamManager.logger.debug("FAIL:琚個璇疯?呭湪闃熶紞涓?,RoleId: "+invitedTeamId);
					}
//					else if (fire.pb.buff.Module.existState(inviterRoleId, BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(invitedRoleId, 160202, null);
//						TeamManager.logger.debug("CRespondInvite:鐜╁(roleId=" + inviterRoleId+")invite澶勪簬鍓湰涓?,涓嶈兘缁勯槦");
//					}
					else if(inviting.getTeamid() > -1)
					{
						TeamManager.logger.debug("INFO:鏉ヨ嚜闃熶紞鐨勯個璇?,TeamId: "+inviterTeamId);
						//鏉ヨ嚜闃熶紞鐨勯個璇?
						xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId);
						if(!checkInviterTeamExist(teamInfo))
						{
							//閭?璇锋偍鐨勯槦浼嶅凡缁忚В鏁?
							psend(invitedRoleId, new STeamError(TeamError.InviterTeamNotExist));
							TeamManager.logger.debug("FAIL:閭?璇锋偍鐨勯槦浼嶅凡缁忚В鏁?,TeamId: "+inviterTeamId);
						}
						else if(!checkTeamInvitingValid(teamInfo, invitedRoleId))
						{
							//闃熶紞閭?璇峰凡缁忚秴鏃讹紙illegal锛?
							TeamManager.logger.debug("FAIL:闃熶紞閭?璇峰凡缁忚秴鏃?,TeamId: "+inviterTeamId);
						}
						
						else if(!checkTeamNotFull(teamInfo)){
							MessageMgr.psendMsgNotify(invitedRoleId, 145740, null);
							//瀵规柟闃熶紞浜烘暟宸叉弧
							psend(invitedRoleId, new STeamError(TeamError.TeamFull));
							TeamManager.logger.debug("FAIL:瀵规柟闃熶紞浜烘暟宸叉弧,TeamId: "+inviterTeamId);
						}
						else if(isLeaderInDuel(teamInfo.getTeamleaderid()))
						{
							// 闃熼暱鍦ㄥ喅鏂? by changhao
							TeamManager.logger.debug("FAIL:闃熼暱鍦ㄥ喅鏂?,TeamId: "+inviterTeamId);
						}else if(checkMap(teamInfo.getTeamleaderid(), invitedRoleId)){
							//闃熶紞鍙互鍔犲叆杩欎釜鏂版垚鍛?
							Team team = new Team(inviterTeamId,false);
							TeamManager.logger.debugWhileCommit("SUCC:闃熶紞鍙互鍔犲叆杩欎釜鏂版垚鍛?(鍘熸潵鐨勯槦浼?),TeamId: "+inviterTeamId);
							boolean ok = team.addNewMemberWithSP(invitedRoleId);
							//濡傛灉鎴愬姛鍏ラ槦鏌ョ湅鏄惁闇?瑕佹媺浠栧埌闃熼暱鏃佽竟 by changhao
							if (ok)
							{
								boolean iscruise = checkCruiseWhenInvited(invitedRoleId);
								if(iscruise){
									//琚個璇疯?呭贰娓哥姸鎬?,鍏ラ槦鍚庣珛鍗虫殏绂伙紒
									new PAbsentReturnTeam(invitedRoleId, 1).call();
								} else {
									int ret = TeamManager.getInstance().execGotoLeader(invitedRoleId, team, true, 2);
									if (ret == 0)
									{
										xbean.Properties invitedprop = xtable.Properties.get(invitedRoleId);
										
										List<String> params = new ArrayList<String>();
										params.add(invitedprop.getRolename());
										fire.pb.talk.MessageMgr.sendMsgNotify(teamInfo.getTeamleaderid(), 160196 ,params);	
									}
								}
							}
							
							fire.pb.event.Poster.getPoster().dispatchEvent(new ArriveTeamSpecialQuestEvent(team.getTeamLeaderId(), invitedRoleId));
							
							return ok;
						}
					}
					else //杩欓噷鏄笉搴旇杩涙潵鐨勶紝娌℃湁闃熶紞涓嶈兘閭?璇? by changhao
					{
						TeamManager.logger.debug("INFO:鏉ヨ嚜涓汉鐨勯個璇?,inviterRoleId: "+inviterRoleId);
						//鏉ヨ嚜涓汉鐨勯個璇?
						if(!checkOnline(inviterRoleId))
						{
							// 閭?璇疯?呬笉鍦ㄧ嚎
							psend(invitedRoleId, new STeamError(TeamError.ObjectOffline));
							TeamManager.logger.debug("FAIL:閭?璇疯?呬笉鍦ㄧ嚎,inviterRoleId: "+inviterRoleId);
						}
						/*else if(!checkInviterStatus(inviterRoleId))
						{
							//閭?璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵??
							//psend(invitedRoleId, new STeamError(TeamError.ObjectInUnteamState));
							Message.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
							TeamManager.logger.debug("FAIL:閭?璇疯?呭浜庝笉鑳界粍闃熺殑鐘舵??,inviterRoleId: "+inviterRoleId);
						}*/else
						{
							//鑾峰彇閭?璇疯?呯幇鍦ㄧ殑闃熶紞ID
							inviterTeamId = xtable.Roleid2teamid.get(inviterRoleId);
							if(checkInviterInTeam(inviterTeamId))
							{
								mkdb.Trace.log(mkdb.Trace.DEBUG, "閭?璇疯?呴個璇锋椂娌℃湁闃熶紞锛屼絾鏄洖澶嶆椂宸茬粡鏈夐槦浼?,TeamId: "+inviterTeamId);
								//閭?璇疯?呴個璇锋椂娌℃湁闃熶紞锛屼絾鏄洖澶嶆椂宸茬粡鏈夐槦浼嶏紝鍙兘鏄垰寤虹珛鐨勶紝杩欐椂涔熷彲浠ュ姞鍏?
								xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId); 
								if(!checkInviterIsLeader(inviterRoleId, teamInfo))
								{
									//閭?璇疯?呬笉鏄槦闀?
									//psend(invitedRoleId, new STeamError(TeamError.ObjectNotLeader));
									MessageMgr.psendMsgNotify(invitedRoleId, 141861, null);
									TeamManager.logger.debug("FAIL:閭?璇疯?呬笉鏄槦闀?,TeamId: "+inviterTeamId);
								}
								else if(isLeaderInDuel(inviterRoleId))
								{
									// 闃熼暱鍦ㄥ喅鏂?
									TeamManager.logger.debug("FAIL:闃熼暱鍦ㄥ喅鏂?,TeamId: "+inviterTeamId);
								}
								else if(!checkTeamInvitingValid(teamInfo, invitedRoleId))
								{
									//閭?璇峰凡缁忚秴鏃讹紙illegal锛?
									TeamManager.logger.debug("FAIL:閭?璇峰凡缁忚秴鏃?,TeamId: "+inviterTeamId);
								}
								else if(checkTeamNotFull(teamInfo) && checkMap(teamInfo.getTeamleaderid(), invitedRoleId))
								{
									Team team = new Team(inviterTeamId,false);
									//濡傛灉鏈夌粨濠氫换鍔℃槸涓嶅厑璁稿拰鍏朵粬浜虹粍闃熺殑
//									if(!MarryTaskStepManager.checkMarryTaskState(team.getAllMemberIds(), invitedRoleId)){
//										//TODO
//										
//									}else{
										TeamManager.logger.debugWhileCommit("SUCC:闃熶紞鍔犲叆杩欎釜鏂版垚鍛?(鍚庢潵鐨勯槦浼?),TeamId: "+inviterTeamId);
										return team.addNewMemberWithSP(invitedRoleId);
									//}
								}
							}
							else
							{
								//閭?璇疯?呴個璇锋椂娌℃湁闃熶紞锛岀幇鍦ㄤ粛鐒舵病鏈夛紝闇?瑕佸缓绔嬫柊鐨勯槦浼嶏紝鍐嶅姞鍏?
								TeamManager.logger.debug("INFO:閭?璇疯?呴個璇锋椂娌℃湁闃熶紞锛岀幇鍦ㄤ粛鐒舵病鏈?,inviterRoleId: "+inviterRoleId);
								if(!checkSingleInvitingExist(inviterRoleId, invitedRoleId))
								{
									//閭?璇疯?呯殑閭?璇峰凡缁忚秴鏃讹紙illigal锛?
									TeamManager.logger.debug("FAIL:閭?璇疯?呯殑閭?璇峰凡缁忚秴鏃?,inviterRoleId: "+inviterRoleId);
								}
								else if(isLeaderInDuel(inviterRoleId))
								{
									// 闃熼暱鍦ㄥ喅鏂?
									TeamManager.logger.debug("FAIL:闃熼暱鍦ㄥ喅鏂?,TeamId: "+inviterTeamId);
								}
								else if(checkMap(inviterRoleId, invitedRoleId))
								{
									//寤虹珛鏂扮殑闃熶紞锛岄個璇疯?呬负闃熼暱锛岄個璇疯?呯殑閭?璇峰叏绉诲埌闃熶紞涓?
									Team team = TeamManager.getInstance().createNewTeam(inviterRoleId);
									if(team == null)
									{
										//fire.pb.talk.Message.sendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
										fire.pb.talk.MessageMgr.sendMsgNotify(invitedRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
										TeamManager.logger.debug("FAIL:鍒涘缓闃熶紞澶辫触锛堝彲鑳界敱浜庣姸鎬佸啿绐侊級銆?");
										return true;
									}
									//濡傛灉鏈夌粨濠氫换鍔℃槸涓嶅厑璁稿拰鍏朵粬浜虹粍闃熺殑
//									if(!MarryTaskStepManager.checkMarryTaskState(team.getAllMemberIds(), invitedRoleId)){
//										//TODO
//										return true;
//									}
									//娣诲姞鏂版垚鍛?
									TeamManager.logger.debugWhileCommit("SUCC:闃熶紞鍔犲叆杩欎釜鏂版垚鍛?(鏂板缓鐨勯槦浼嶏紝閭?璇疯?呬负闃熼暱),TeamId: "+inviterTeamId);
									return team.addNewMemberWithSP(invitedRoleId);
								}
							}
						}
					}
				}
				else
				{
					java.util.List<String> name = new java.util.ArrayList<String>();
					name.add(invitedName);
					if(checkInviteFromTeam(inviterTeamId))
					{
						//鍙戦?佺粰闃熼暱
						Long leaderId = xtable.Team.selectTeamleaderid(inviterTeamId);
						if(leaderId!=null)
						{
							fire.pb.talk.MessageMgr.psendMsgNotify(leaderId, 140851, name);
							psendWhileCommit(leaderId, new SRespondInvite(invitedRoleId,(byte)0));
						}
					}
					else
					{
						//鍙戦?佺粰閭?璇疯??
						fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 140851, name);
						psendWhileCommit(inviterRoleId, new SRespondInvite(invitedRoleId,(byte)0));
					}
					TeamManager.logger.debug("FAIL锛屼笉鎺ュ彈缁勯槦閭?璇?,invitedRoleId: "+invitedRoleId);
				}
				//涓嶆帴鍙楅個璇锋垨鑰呮帴鍙楅個璇风殑鏉′欢鏈弧瓒筹紝閮借鍒犻櫎閭?璇?
				}
				finally{
					deleteInvite(invitedRoleId);
				}
				return true;
			}
			
		};
		resInviteP.submit();		
	}
	
	private boolean checkMap(long leaderRoleId, long applierRoleId){
		boolean inWaiting1 = false;
		boolean inWaiting = false;
		
		//鍙戣捣浜?
		final fire.pb.map.Role  invitMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(leaderRoleId);
		final fire.pb.map.Role  desMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(applierRoleId);
		if(invitMaprole == null || desMaprole == null){
			return true;
		}
		int srcMapId = invitMaprole.getMapId();
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(srcMapId);
		
		int desMapId = desMaprole.getMapId();
		MapConfig descfg = ConfigManager.getInstance().getConf(MapConfig.class).get(desMapId);
		
		if(inWaiting || inWaiting1){
			return false;
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

	// 妫?娴婸VP
	private static int checkPvP(long inviterRoleId, long invitedRoleId) {
		// 鍥炲簲閭?璇?
		return fire.pb.battle.pvp.PvPTeamHandle.onRespondInvite(inviterRoleId, invitedRoleId);
	}

	//閭?璇峰瓨鍦ㄨ?屼笖娌¤秴鏃讹紵鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkInviteExist(long invitedRoleId)
	{
		//鍏堜粠閭?璇疯〃涓煡鎵捐浜烘槸鍚﹁閭?璇?
		xbean.InviteInfo invite = xtable.Teaminvite.get(invitedRoleId);
		if(invite == null)
			return false;
		else if(!invite.getBeinginvited())
			return false;
		else if((now - invite.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{   //閭?璇疯秴鏃?
			invite.setBeinginvited(false);
			cleanTimeoutInvites(invite.getInvited());
			return false;
		}
		else
			return true;
	}
	
	// 琚個璇疯?呭湪绾??鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkOnline(long roleId)
	{
		if(StateCommon.isOnline(roleId))
			return true;
		else
			return false;
	}	
	
	
	// 琚個璇疯?呯粍闃熷紑鍏冲凡鎵撳紑?鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
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
	
	private boolean checkCruiseWhenInvited(long invitedRoleId){
		PropRole prole = new PropRole(invitedRoleId, true);
		if(prole.getProperties().getCruise() > 0) {
			return true;
		}
		return false;
	}
	
	//鏉ヨ嚜闃熶紞鐨勯個璇凤紵锛坒alse鏄潵鑷釜浜猴級鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkInviteFromTeam(Long inviterTeamId)
	{
		if(inviterTeamId != null)
			return true;
		else
			return false;
	}
	
	//閭?璇烽槦浼嶈繕瀛樺湪锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkInviterTeamExist(xbean.TeamInfo teamInfo)
	{
		if(teamInfo != null)
			return true;
		else
			return false;
	}
	
	//闃熶紞鐨勯個璇蜂腑瀛樺湪杩欎釜閭?璇凤紝鑰屼笖杩樻湭瓒呮椂锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkTeamInvitingValid(xbean.TeamInfo teamInfo, long invitedRoleId)
	{
		java.util.Map<Long,Long> invitings = teamInfo.getInvitingids();
	    cleanTimoutInvitings(invitings);
	    if(invitings.get(invitedRoleId) != null)
	    	return true;
	    else
	    	return false;
	}
	//闃熶紞鐨勪汉鏁版湭杈惧埌5浜猴紵鍙兘鍦≒rocedure涓璋冪敤
	private boolean checkTeamNotFull(xbean.TeamInfo teamInfo)
	{
		if (teamInfo.getMembers().size() < 4)
			return true;
		else
			return false;
	}
	
/*	//閭?璇疯?呭浜庡彲浠ョ粍闃熺殑鐘舵?侊紵锛堥潪璺戝晢銆侀琛屻?佸崟浜轰换鍔＄瓑锛?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(StateType.STATE_TEAM))
		{
			TeamManager.logger.info("鐜╁(roleId=" + inviterRoleId+")澶勪簬涓嶈兘缁勯槦鐨勭姸鎬?");
			return true;
		}
		return true;
	}
*/	
	//閭?璇疯?呭浜庨槦浼嶄腑锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkInviterInTeam(Long inviterTeamId)
	{
		if(inviterTeamId != null)
			return true;
		else
			return false;
	}
	
	// 閭?璇疯?呮槸闃熼暱锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkInviterIsLeader(long inviterRoleId , xbean.TeamInfo teamInfo)
	{
		if(teamInfo.getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}
	
	//涓汉閭?璇疯〃涓殑閭?璇峰瓨鍦紵鍙兘鍦≒rocedure涓皟鐢?
	private boolean checkSingleInvitingExist(long inviterRoleId, long invitedRoleId)
	{
		xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
		if(singleInvitings == null)
			return false;
		else
		{
			cleanTimoutInvitings(singleInvitings.getInvitingids());
			if(singleInvitings.getInvitingids().get(invitedRoleId) == null)
				return false;
		    else
		    	return true;
		}
	}
	
	
	//浣跨帺瀹跺洖鍒版湭琚個璇风姸鎬?,鍚屾椂鍒犻櫎杩囨湡閭?璇?
	private void deleteInvite(final long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.select(invitedRoleId);
		if(inviteInfo == null)
			return;
		//鍒犻櫎team琛ㄤ腑鐨刬nviting淇℃伅鎴栬?匰ingleInvitings涓殑inviting淇℃伅
		if(inviteInfo.getInviting().getTeamid() > -1)
		{
			xbean.TeamInfo team = xtable.Team.get(inviteInfo.getInviting().getTeamid());
			inviteInfo = xtable.Teaminvite.get(invitedRoleId);
			if(inviteInfo == null)
				return;
			if(team != null)
				team.getInvitingids().remove(invitedRoleId);
		}
		else
		{
			/*Set<Long> rids = new HashSet<Long>();
			rids.add(invitedRoleId);
			rids.add(inviteInfo.getInviting().getRoleid());
			Lockeys.lock(xtable.Locks.ROLELOCK, rids);*/
			inviteInfo = xtable.Teaminvite.get(invitedRoleId);
			if(inviteInfo == null)
				return;
			final long invitingroleid = inviteInfo.getInviting().getRoleid();
			mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure(){
				@Override
				protected boolean process() throws Exception
				{
					xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(invitingroleid);
					if(singleInvitings != null)
					{
						singleInvitings.getInvitingids().remove(invitedRoleId);
						if(singleInvitings.getInvitingids().size() == 0)
							xtable.Singleinviting.remove(invitingroleid);
					}
					return true;
				}
			});
		}
		
		//鏇存柊invites琛ㄤ腑鐨勪俊鎭?
		inviteInfo.setBeinginvited(false);
		cleanTimeoutInvites(inviteInfo.getInvited());
		//濡傛灉invited涓篃娌℃湁浠讳綍淇℃伅锛屽垯姝ゆ潯InviteInfo娌℃湁瀛樺湪鐨勫繀瑕侊紝鍙互鍒犻櫎
		if(inviteInfo.getInvited().size() == 0)
			xtable.Teaminvite.remove(invitedRoleId);
		
		
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
	
	public boolean isLeaderInDuel(long leaderRoleId)
	{
		BuffAgent agent = new BuffRoleImpl(leaderRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID))
		{
			MessageMgr.sendMsgNotify(leaderRoleId, 141867,  null);
			return true;
		}
		else
			return false;
	}
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794448;

	public int getType() {
		return 794448;
	}

	public byte agree; // agree为1接受邀请，为0拒绝邀请

	public CRespondInvite() {
	}

	public CRespondInvite(byte _agree_) {
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
		if (_o1_ instanceof CRespondInvite) {
			CRespondInvite _o_ = (CRespondInvite)_o1_;
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

	public int compareTo(CRespondInvite _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


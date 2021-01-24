
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
	//final static int MEMBER_MAX_COUNT = 4;//4濞戞搩浜风槐婵囨媴濠婂懏鏆忓ù婊冮叄濡诧附瀵煎鍡楃亣闁告稒眉濮瑰寮敮顔剧濞戞挸绉寸�垫﹢骞忛鍕曢梻锟介崠锛勭闁挎稑鑻幃鎾诲籍鐠哄搫绲洪柛鎴ｆ濞堟垿鏌�?閻犲洩娓归柌婊堝极?
	
	//final static long MAX_INVITE_TIMEOUT = 30*1000;//30s,濞达絾绮庨弫銈嗙鎼淬劌锟藉鎷犻悿顖溞㈤柡鍐啇缁辨繈宕ョ仦鑲╊伇闂侊拷?閻犲洨鍏樺娲礆閼稿灚顦ч梻锟�?

	private long now = 0L;//procedure鐎碉拷?濠殿喖顑嗗鍌涚┍濠靛棛鎽犲☉锟�?濞戞搩浜滅紞瀣礈瀹ュ棙顦ч梻鍌濇彧缁辨繃绌卞┑濠勬婵繍妲歳ocedure濞戞搩鍘藉鍌炴⒒鐎靛憡鐣辩紓浣哄枍缁旀挳骞�?
	
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
	
		Long inviterclanfightid = xtable.Roleid2clanfightid.select(inviterRoleId);//濠碘�冲�归悘澶愭焽?閻犲洨鏌�?閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
		if (inviterclanfightid != null)
		{
			Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濠碘�冲�归悘澶屾偖椤愶箑锟藉鎷犻悿锟�?閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
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
			Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濠碘�冲�归悘澶屾偖椤愶箑锟藉鎷犻悿锟�?閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
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
			TeamManager.logger.info("CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚閾氬倹鐪�" + invitedRoleId + "鐎圭硶鍓濋悥鍫曟偐閼革拷??,婵縿鍊栧鍌涚▔瀹ュ牆鍘撮柛蹇嬪劦濡诧拷");
			fire.pb.talk.MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
			return;
		}
		
		PropRole inviterroleid = new PropRole(inviterRoleId, true);
		if(inviterroleid.getProperties().getCruise() > 0) {
			TeamManager.logger.error("CInviteJoinTeam:闂侊拷?閻犲洩娓瑰Ч锟�" + inviterroleid + "閻炴凹鍋婇崐瀣嫚閾氬倹鐪�" + invitedRoleId + "闂侊拷?閻犲洩娓瑰Ч澶愬捶閵娿儴绐楁繛鎾虫憸婵悂骞�?,濞戞挸绉烽崗姗�鏌�?閻犲洭鏀遍悡鍥ㄧ?");
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

			@Override /*lock濡炪倕鎼花锟� team->roleid->match by changhao*/
			protected boolean process()
			{
				Team team = null;
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(inviterRoleId);
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?,闁哄鍎遍崰鍛拷瑙勭濡叉悂宕ラ敃鍌涙暁teamlock
				if(teamId != null)
				{//闂佸じ杈渆amlock
					team = new Team(teamId,false);
					//if(!team.isTeamLeader(inviterRoleId))
					//	return true;//濡ょ姴鐭侀惁澶屾嫚閵夘煈娼￠柤鐟板级濡叉悂宕ラ敃浣虹闁哄嫷鍨跺Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗭拷
				}
				
				// 闁圭顦甸妴搴㈡償韫囨稒鏁歳olelock闁革拷? teamlock
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
					//閺夆晜鏌ㄥú鏍р槈閸喍绱栭悶姘煎亰閸婂鎷犳搴㈢暠闁绘壕鏅涢宥嗙▔瀹ュ懏韬紒锟�?(illegal)
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚妞嬪孩鐣遍柣婧炬櫅椤斿秵绋夊鍛含缂侊拷?,RoleId: "+invitedRoleId);
				}
				else if(!checkInviterStatus(inviterRoleId))
				{
					//闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�?? 
					MessageMgr.psendMsgNotify(inviterRoleId, 141618, null);
//					psend(inviterRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�??,RoleId: "+inviterRoleId);
				}
				else if(!checkInvitedStatus(invitedRoleId))
				{
					//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�?? 
					MessageMgr.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
//					psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�??,RoleId: "+invitedRoleId);
				}
				else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
				{
					//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱垱鐣辩紓浣稿濡诧箓宕濋悢璇插幋婵炲备鍓濆﹢渚�骞嶉幘宕囩；
//					psend(inviterRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					MessageMgr.psendMsgNotify(inviterRoleId, 141201, null);
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱垱鐣辩紓浣稿濡诧箓宕濋悢璇插幋婵炲备鍓濆﹢渚�骞嶉幘宕囩；,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkInvitedInNoTeam(invitedTeamId))
				{
					//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱厽韬梻鍐枍缁辩偞绋�?
					//psend(inviterRoleId, new STeamError(TeamError.ObjectInTeam));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱厽韬梻鍐枍缁辩偞绋�?,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141191, null);
				}
				else if(!checkNotBeingInvited(invitedRoleId))
				{
					//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱噮鍔�闁革负鍔忛～锕傚礂閺堢數閾傚ù婊勬そ閸婂鎷犻摎鍌濆幀 
//					psend(inviterRoleId, new STeamError(TeamError.BeingInvited));
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141202, null);
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱噮鍔�闁革负鍔忛～锕傚礂閺堢數閾傚ù婊勬そ閸婂鎷犻摎鍌濆幀,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkNotInvitedIn30s(invitedRoleId, inviterRoleId, inviterTeamId))
				{
					//閻炴凹鍋婇崐瀣嫚閻わ拷??30缂佸甯掗崬鎾即閸撗呯梾閻炴凹鍋婂Σ锔藉瀹ュ棗鐏楅柤鏉挎噸闁叉粍绂嶅ú顏勶拷瀣嫚閻ゎ垳绠�
					//psend(inviterRoleId, new STeamError(TeamError.InvitedIn30s));
					TeamManager.logger.info("FAIL:CInviteJoinTeam:閻炴凹鍋婇崐瀣嫚閻わ拷??30缂佸甯掗崬鎾即閸撗呯梾閻炴凹鍋婂Σ锔藉瀹ュ棗鐏楅柤鏉挎噸闁叉粍绂嶅ú顏勶拷瀣嫚閻ゎ垳绠�,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141050, null);
				}
				else if(team != null)
				{
					//Team team = new Team(inviterTeamId,false);
					//闁哄鍎撮崵婊堟⒓閻斿墎绀婇柣銊ュ閸婂鎷�?
					//if(!checkInviterIsLeader(inviterRoleId, team))
					//{
					//	//闂侊拷?閻犲洨鏌�?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�?(illegal)
					//	TeamManager.logger.debug("FAIL:闂侊拷?閻犲洨鏌�?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�?,RoleId: "+inviterRoleId);
					//}
					if(!checkTeamNotFull(team))
					{
						//闂侊拷?閻犲洨鍏樺Σ锔藉瀹ュ棗濮ù锟�?
						psendWhileCommit(inviterRoleId, new STeamError(TeamError.TeamFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:闂侊拷?閻犲洨鍏樺Σ锔藉瀹ュ棗濮ù锟�?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamFilter(team, invitedRoleId))
					{
						TeamManager.logger.info("FAIL:CInviteJoinTeam:TeamFilter闁告熬绠戦崰锟�,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamInviteNotFull(team))
					{
						//闂侊拷?閻犲洨鍏樺Σ锔藉瀹ュ洦鐣辨慨婵撶到濠�顏堟焽?閻犲洩娓瑰Ч澶愬极閹峰本褰ч柛锟�?4濞戞搩浜风槐婵囩▔瀹ュ牆鍘撮柛鎰Ч閸婂鎷犻柨瀣函濠拷?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:闂侊拷?閻犲洨鍏樺Σ锔藉瀹ュ洦鐣辨慨婵撶到濠�顏堟焽?閻犲洩娓瑰Ч澶愬极閹峰本褰ч柛锟�?4濞戞搩浜风槐婵囩▔瀹ュ牆鍘撮柛鎰Ч閸婂鎷犻柨瀣函濠拷?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamLeaderState(inviterRoleId))
					{
						//闂侊拷?閻犲洨鍏樺Σ锔藉瀹ュ洦鐣辨慨婵撶到濠�顏堟焽?閻犲洩娓瑰Ч澶愬极閹峰本褰ч柛锟�?4濞戞搩浜风槐婵囩▔瀹ュ牆鍘撮柛鎰Ч閸婂鎷犻柨瀣函濠拷?
						//psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.info("FAIL:CInviteJoinTeam:闂傚啰鍠栭弳杈亹閹惧啿顤呴柣妯垮煐?娴ｉ鐟濋柤鍏呯矙閸婂鎷犻弸锟�??");
					}
//					else if (fire.pb.buff.Module.existState(invitedRoleId,
//								BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(inviterRoleId, 160202, null);
//						TeamManager.logger.info("CInviteJoinTeam:闁绘壕鏅涢锟�(roleId=" + roleid+")invite濠㈣泛瀚花顒勫礈椤栨稒鎷卞☉锟�?,濞戞挸绉烽崗妯肩磼閸曨垱袝");
//					}
					else{
						if(!checkMap()){
							return false;
						}
						
						boolean isForceTeam = TeamManager.getInstance().isForceTeam(teamId, invitedRoleId);
												
						TeamManager.logger.info("SUCC:CInviteJoinTeam:婵犲◥銈呭枙闁哄锟藉弶顐介柨娑樿嫰瑜板弶绂掗妷銉ョ岛闁告垶妞藉Σ锔藉瀹ュ锟藉鎷�? "+inviterTeamId);
						// 婵犲◥銈呭枙闁哄锟藉弶顐介柨娑樿嫰瑜板弶绂掗妷銉ョ岛闁告垶妞藉Σ锔藉瀹ュ锟藉鎷�?
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = xtable.Properties.get(inviterRoleId).getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 濞ｅ洦绻傞悺銊╂焽?閻狅拷?,閺夆晜鐟╅崳閿嬬▔瀹ュ洦鏆忛悗瑙勭濡炲倿宕抽…鎺旂闁告瑯鍨禍鎺旀偖椤愩垹袟闁哄倻鎳撶槐鈥炽�掗崨瀛樼彑
						//濞ｅ洦绻傞悺銊╂焽?閻犲洤鍢查崺宀勬⒓閻斿墎绀�
						team.getTeamInfo().getInvitingids().put(invitedRoleId,now);
						//濞ｅ洦绻傞悺銊╂焽?閻犲洤鍢查崺宀�鎮锕�锟藉鎷犻悿顖橈拷鍐晬鐏炶棄甯ラ柣顏勵儓椤箓鏌�?閻犲洨鏌�?閸涱垱鐣遍梺锟�?閻犲洩娓规穱濠囧箒椤栨稒笑闁告熬绠戦崙锛勶拷娑櫭﹢锟�
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
						else if (!team.isTeamLeader(inviterRoleId)) //濠碘�冲�归悘澶愭焽?閻犲洨鏌�?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�? by changhao
						{
							snd.op = 2;
							snd.leaderroleid = team.getTeamLeaderId();
							psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
							MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
							// 闁告瑦鍨�?娓氾拷閸婂鎷�?
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
							// 闁告瑦鍨�?娓氾拷閸婂鎷�?
							mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);							
						}
					}
			
				}
				else
				{
					//闁哄鍎撮崵婊勭▔椤忓啯鐪介柣銊ュ閸婂鎷�?
					if(!checkSingleInviteNotFull(inviterRoleId))
					{
						//闂侊拷?閻犲洨鏌�?閸涱噮鍔�闁革负鍔戦崐瀣嫚閾氬倹鐪介柡浣瑰閹活亪宕�?4濞戞搩浜风槐婵囩▔瀹ュ牆鍘撮柛鎰Ч閸婂鎷犻柨瀣函濠拷?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.debug("FAIL:闂侊拷?閻犲洨鏌�?閸涱噮鍔�闁革负鍔戦崐瀣嫚閾氬倹鐪介柡浣瑰閹活亪宕�?4濞戞搩浜风槐婵囩▔瀹ュ牆鍘撮柛鎰Ч閸婂鎷犻柨瀣函 "+inviterRoleId);
					}
					else if(!checkTeamFilter(inviterRoleId, invitedRoleId))
					{
						TeamManager.logger.debug("FAIL:TeamFilter闁告熬绠戦崰锟�,TeamId: "+inviterTeamId);
					}
					else if (fire.pb.buff.Module.existState(invitedRoleId,
							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						Message.sendMsgNotify(inviterRoleId, 160202, null);
						TeamManager.logger.info("闁绘壕鏅涢锟�(roleId=" + invitedRoleId+")invite濠㈣泛瀚花顒勫礈椤栨稒鎷卞☉锟�?,濞戞挸绉烽崗妯肩磼閸曨垱袝");
					}
					else if (fire.pb.buff.Module.existState(inviterRoleId,
							BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						Message.sendMsgNotify(inviterRoleId, 160202, null);
						TeamManager.logger.info("闁绘壕鏅涢锟�(roleId=" + inviterRoleId+")invite濠㈣泛瀚花顒勫礈椤栨稒鎷卞☉锟�?,濞戞挸绉烽崗妯肩磼閸曨垱袝");
					}
					else
					{
						if(!checkMap()){
							return false;
						}
						
						TeamManager.logger.debug("SUCC:婵犲◥銈呭枙闁哄锟藉弶顐介柨娑樿嫰瑜板弶绂掗妷銉ョ岛闁告垼妗ㄩ柌婊勭濞差亜锟藉鎷�? "+inviterRoleId);
						// 婵犲◥銈呭枙闁哄锟藉弶顐介柨娑樿嫰瑜板弶绂掗妷銉ョ岛闁告垼妗ㄩ柌婊勭濞差亜锟藉鎷�?
						xbean.Properties inviterProperty = xtable.Properties.get(inviterRoleId);
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = inviterProperty.getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 濞ｅ洦绻傞悺銊╂焽?閻狅拷?,閺夆晜鐟╅崳閿嬬▔瀹ュ洦鏆忛悗瑙勭濡炲倿宕抽…鎺旂闁告瑯鍨禍鎺旀偖椤愩垹袟闁哄倻鎳撶槐鈥炽�掗崨瀛樼彑
						//濞ｅ洦绻傞悺銊╂焽?閻犲洤鍢查崺灞剧▔椤忓啯鐪介梺锟�?閻犲洨鏌夐妴锟�
						xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
						if(singleInvitings == null)
						{
							singleInvitings = xbean.Pod.newSingleInvitings();
							xtable.Singleinviting.add(inviterRoleId, singleInvitings);
						}
						singleInvitings.getInvitingids().put(invitedRoleId, now);
						//濞ｅ洦绻傞悺銊╂焽?閻犲洤鍢查崺宀�鎮锕�锟藉鎷犻悿顖橈拷鍐晬鐏炶棄甯ラ柣顏勵儓椤箓鏌�?閻犲洨鏌�?閸涱垱鐣遍梺锟�?閻犲洩娓规穱濠囧箒椤栨稒笑闁告熬绠戦崙锛勶拷娑櫭﹢锟�
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
						
						// 闁告瑦鍨�?娓氾拷閸婂鎷�?
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

				//闁告瑦鍨奸幑锝嗙?
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
				
				//闁革负鍔岄悾銊╁礂閵娿儲鍕鹃柛锟�? 濞戞挸绉甸悧搴㈩殽瀹�锟界划宥夋⒓?
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

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long inviterRoleId, long invitedRoleId) {
		// 闂侊拷?閻犲洭鏀遍崹姘跺川?
		return fire.pb.battle.pvp.PvPTeamHandle.onInviteJoinTeam(inviterRoleId, invitedRoleId);
	}

	// 闂侊拷?閻犲洨鏌�?閸涱厽瀚查悶姘煎亰閸婂鎷犻悿锟�?閸涱厽鍊遍柡鍐硾濠�顏嗙棯??闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkOnline(long invitedRoleId, long inviterRoleId)
	{
		if(StateCommon.isOnlineBuffer(invitedRoleId))
			return true;
		else
		{
			//閻庝絻顫夐弻鐔哥▔瀹ュ懏韬紒锟�?
			MessageMgr.sendMsgNotify(inviterRoleId, 141701, null);
			return false;
		}
	}	
	
	//闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冮瑜板弶绂掗妷褏鐭嬮梻鍐枔濞堟垿鎮╅懜锟�?娓氬﹦鍚归柨娑樼墦濞碱亞鎹勯幋婵囨珜闁靛棔绶氶ˉ锝囨偘鐏烇拷?娴ｇ绀嬪ù婊嗘〃閹广垽宕濋敍鍕惣闁匡拷?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("闁绘壕鏅涢锟�(roleId=" + inviterRoleId+")濠㈣泛瀚花顒佺▔瀹ュ牆鍘寸紓浣稿濡诧箓鎯冮崟顓炐﹂柟锟�?");
			return false;
		}
		return true;
	}
	
	//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱収妲卞ù婊冮瑜板弶绂掗妷褏鐭嬮梻鍐枔濞堟垿鎮╅懜锟�?娓氬﹦鍚归柨娑樼墦濞碱亞鎹勯幋婵囨珜闁靛棔绶氶ˉ锝囨偘鐏烇拷?娴ｇ绀嬪ù婊嗘〃閹广垽宕濋敍鍕惣闁匡拷?
	private boolean checkInvitedStatus(long invitedRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(invitedRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("闁绘壕鏅涢锟�(roleId=" + invitedRoleId+")濠㈣泛瀚花顒佺▔瀹ュ牆鍘寸紓浣稿濡诧箓鎯冮崟顓炐﹂柟锟�?");
			return false;
		}
		return true;
	}
	
	// 閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱垳鐭嬮梻鍐枎缁辨垿宕楅崘鎻掑殥闁瑰灚鎸哥槐锟�?闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
		//缂備礁瀚板Σ锕�顕�?闁革拷?
//		if(fire.pb.SystemSettingConfig.checkRoleSetting(invitedRoleId, fire.pb.SysSetType.AcceptTeam)<=0)
//			return false;
//		else
			return true;
	}
	
	// 閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱剛鐟濋柛锔哄姂濡诧附瀵煎鍕幀闁挎稓鍠庤ぐ褔鎳楅挊澶嬭含Procedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInvitedInNoTeam(Long invitedTeamId)
	{
		if(invitedTeamId == null)
			return true;
		else
			return false;
	}
	
	// 閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱喚姊鹃柡鍫濐槹椤掓粓宕烽妸顭戞蕉闂侊拷?閻犲洤鍤栫槐鐢稿矗椤忓洤鍘撮柛锔瑰ⅴrocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkNotBeingInvited(long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
		
		if (inviteInfo == null)//濠碘�冲�归悘澶娾柦閳╁啯绠掗悹浣规緲缂嶅秹鏁嶅畝鍐︼拷鍐矆鏉炴壆鐭ら柡鍫海椤箓鏌�?閻犲洨鏌夌换锟�
			return true;
		if(!inviteInfo.getBeinginvited())
		{
			//濠碘�冲�归悘澶婎潰閿濆懏韬梺锟�?閻犲洩娓圭紞鍛▔缁＄lse闁挎稑鐭侀崑妤冿拷瑙勭煯缁楀寰勯崟顏嗚壘閻炴凹鍋婇崐瀣嫚妞嬪骸笑闁诡兛绶ょ槐婵嗐�掗崨瀛樼彑閺夆晛娲﹀﹢锟犳焽?閻狅拷?
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else if ((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{
			//濠㈣泛瀚花顒勬焽?閻犲洭顥撴慨鎼佸箑娓氬﹦绀夊ù锝呮濡茬顔忛懠顒傜梾閻℃帒鎳忓鍌炴晬瀹�鍕粯閻熸洑鐒﹀ú鍧楀棘閹峰矈娼堕梺锟�?閻犲洨鏌�?閸涱垰笑闁诡兛妞掔拹鐔哥▔瀹ュ拋妲卞ù婊冩唉椤箓鏌�?閻犲洭顥撴慨鎼佸箑娓氬﹦绀夐柛姘湰濡炲倸銆掗崨瀛樼彑閺夆晛娲﹀﹢锟犳焽?閻狅拷?
			inviteInfo.setBeinginvited(false);
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else
			return false;
	}
	
	//婵炴挸鎳樺▍搴ㄦ焽?閻犲洨鏌夐妴鍐╃▔椤撶姵鐣遍弶鈺佹处濠�锟犳焽?閻狅拷?,闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
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

	// 閺夆晜鐟ら柌婊堟焽?閻犲洭鏀遍惀鍛村嫉婢跺寒娼堕梻鍐枍缁辩偤骞嬮弽锟�?閸涱剟鍤嬪ù婊冩惈濠�锟�30缂佸甯掗崬鎾焽?閻犲洨鏌夌换鍐晬閻斿嘲娑ч柤瀹犳濠�鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
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
						continue;// 濠碘�冲�归悘澶婎啅閼碱剛鐥呴柟鍨劤閸╁矂鏁嶉崸鐢ult == false闁挎稑顧�缁辨繄浜告潏銊ф⒕闊洤鎳撻々锔芥交濞戞粠鏀介柛姘叄濞间即鎯冮崟顐㈢伈闁哄偆鍘虹花锟�
					else if (invited.getRoleid() == inviterRoleId)
						result = false;// roleid闁烩晛鎽滈悺锟�
					else if (inviterTeamId != null && invited.getTeamid() == inviterTeamId)
						result = false;// inviterTeamId閻庢稒锚濠�顏堢嵁閺堢數鐟瑃eamId闁烩晛鎽滈悺锟�
				} else
					timeoutList.add(invited);// 閻℃帒鎳撶换锟�30缂佸甯炲▓鎴炴交閸ワ妇绐楀☉锟�?閻犙冨槻閸ㄥ綊姊�?
			}
			inviteInfo.getInvited().removeAll(timeoutList);
			return result;
		}
		else
		{
			return true;
		}
	}
	

	// 闂侊拷?閻犲洨鏌�?閸涱喗笑闂傚啰鍠栭弳閬嶆晬閻斿嘲娑ч柤瀹犳濠�鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInviterIsLeader(long inviterRoleId , Team team)
	{
		if(team.getTeamInfo().getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}

	// 闂侊拷?閻犲洨鏌�?閸涘瓨袝濞寸厧绉冲Ч澶愬极?<5? 闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
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
	
	// 闂侊拷?閻犲洨鏌�?閸涘瓨袝濞寸厧绉跺▓鎴︽焽?閻犲洭鏀遍濂稿极?<4? 闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkTeamInviteNotFull(Team team)
	{
		//闁稿繐鐗婄粩濠氭偠閸℃氨绠栭柡鍫㈠枛閸婂鎷�?
		cleanTimoutInvitings(team.getTeamInfo().getInvitingids());
		if (team.getTeamInfo().getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	// 闂侊拷?閻犲洨鏌�?閸涱垰笑闁诡兛妞掔粭澶愬礂娴ｇ瓔鍟�? 闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkTeamLeaderState(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId);
		return buffagent.canAddBuff(OperateType.TEAM_INVITE);
	}
	
	// 闂侊拷?閻犲洨鏌�?閸涱垱鐣遍梺锟�?閻犲洭鏀遍濂稿极?<4? 闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkSingleInviteNotFull(long inviterRoleId)
	{
		xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
		//闁稿繐鐗婄粩濠氭偠閸℃氨绠栭柡鍫㈠枛閸婂鎷�?
		if(singleInvitings == null)
			return true;
		cleanTimoutInvitings(singleInvitings.getInvitingids());
		if (singleInvitings.getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	//婵炴挸鎳樺▍搴ㄦ⒓閻斿墎绀婇柛婊冨闁叉粍绂嶅ú顏勶拷瀣嫚閻わ拷?閸涱剝鍘柣銊ュ缁诲啴寮甸悢鐓庯拷瀣嫚?
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


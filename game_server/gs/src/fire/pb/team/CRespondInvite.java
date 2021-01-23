
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
 * 闁搞儳鍋涚花鏌ユ焽?閻狅拷?
 * @author changhao
 *
 */
public class CRespondInvite extends __CRespondInvite__ {
		
	//final static int MEMBER_MAX_COUNT = 4;//4濞戞搩浜风槐婵囨媴濠婂懏鏆忓ù婊冮叄濡诧附瀵煎鍡楃亣闁告稒眉濮瑰寮敮顔剧濞戞挸绉寸�垫﹢骞忛鍕曢梻锟介崠锛勭闁挎稑鑻幃鎾诲籍鐠哄搫绲洪柛鎴ｆ濞堟垿鏌�?閻犲洩娓归柌婊堝极?
	
	//final static long MAX_INVITE_TIMEOUT = 30*1000;//30s,濞达絾绮庨弫銈嗙鎼淬劌锟藉鎷犻悿顖溞㈤柡鍐啇缁辨繈宕ョ仦鑲╊伇闂侊拷?閻犲洨鍏樺娲礆閼稿灚顦ч梻锟�?
	private long now = 0L;//procedure鐎碉拷?濠殿喖顑嗗鍌涚┍濠靛棛鎽犲☉锟�?濞戞搩浜�?绾绀夊ǎ鍥ㄧ箚閻﹀顫㈤ˇ鏉沷cedure濞戞搩鍘藉鍌炴⒒鐎靛憡鐣辩紓浣哄枍缁旀挳骞�?
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
				//濡ょ姴鐭侀惁澶愬及椤栨碍鍎婇悶姘煎亰閸婂鎷�?
				try
				{
				xbean.InviteInfo inviteInfo = xtable.Teaminvite.select(invitedRoleId);
				if(inviteInfo == null)
					return true;
				else if(!inviteInfo.getBeinginvited())
					return true;
				else if((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
				{   //闂侊拷?閻犲洨鏌夌粔鎾籍?
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
					Long inviterclanfightid = xtable.Roleid2clanfightid.select(inviterRoleId);//濠碘�冲�归悘澶愭焽?閻犲洨鏌�?閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
					if (inviterclanfightid != null)
					{
						Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濠碘�冲�归悘澶屾偖椤愶箑锟藉鎷犻悿锟�?閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
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
						Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//濠碘�冲�归悘澶屾偖椤愶箑锟藉鎷犻悿锟�?閸涱厽韬柛蹇ｅ厸缁变即骞嬪Ο鐑樼皻濞戯拷? by changhao
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
						TeamManager.logger.info("CRespondInvite1:闂侊拷?閻犲洩娓瑰Ч锟�" + inviterRoleId + "閻炴凹鍋婇崐瀣嫚閾氬倹鐪�" + invitedRoleId + ",闂侊拷?閻犲洩娓瑰Ч澶愬捶閵娿儴绐楁繛鎾虫憸婵悂骞�?,濞戞挸绉烽崗姗�鏌�?閻犲洭鏀遍悡鍥ㄧ?");
						return true;
					}
					
					PropRole invitedprop = new PropRole(invitedRoleId, true);
					if(invitedprop.getProperties().getCruise() > 0)
					{
						MessageMgr.sendMsgNotify(invitedRoleId, 162027, null);
						MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
						TeamManager.logger.info("CRespondInvite2:闂侊拷?閻犲洩娓瑰Ч锟�" + inviterRoleId + "閻炴凹鍋婇崐瀣嫚閾氬倹鐪�" + invitedRoleId + ",闂侊拷?閻犲洩娓瑰Ч澶愬捶閵娿儴绐楁繛鎾虫憸婵悂骞�?,濞戞挸绉烽崗姗�鏌�?閻犲洭鏀遍悡鍥ㄧ?");
						return true;
					}
					
					if(checkInviteFromTeam(inviterTeamId))
					{
						//闁哄鍎撮崵婊堟⒓閻斿墎绀婇柣銊ュ閸婂鎷犻崙銈囩闂佸じ杈渆am闁挎稑鐭傚Σ锕傛⒐閸喗瀚查悶姘煎亰閸婂鎷犻悿锟�??
						lockState = 3;
					}
					else
					{
						//闁哄鍎撮崵婊勭▔椤忓啯鐪介柣銊ュ閸婂鎷犻崙銈囩闁活亜顑囬獮鍥捶閵婏附绠掗柡鍐█濡诧附瀵�?
						inviterTeamId = xtable.Roleid2teamid.select(inviterRoleId);
						if(inviterTeamId!= null)
						{//闁哄牆顦靛Σ锔藉瀹ュ繒绀夐柣顏勵儐濡叉悂宕ラ敂鑺バ﹂梻鍐枛閺嗭拷
							lockState = 3;//闂佸じ杈渆am闁挎稑鐭傚Σ锕傛⒐閸喗瀚查悶姘煎亰閸婂鎷犻悿锟�??
						}
						else
						{//闁哄啰濞�濡诧附瀵煎蹇曠闂佸じ绶氶崐瀣嫚閻わ拷?閸涱厽瀚查悶姘煎亰閸婂鎷犻悿锟�??
							lockState = 2;
						}
					}
				}
				else
				{//闁告瑯浜弨锝囨偖椤愶箑锟藉鎷犻悿锟�?閸涱垱鐣眗olelock
					lockState = 1;
				}
				
				switch (lockState)
				{
				case 1://闁告瑯浜弨锝囨偖椤愶箑锟藉鎷犻悿锟�?閸涱垱鐣眗olelock
					Long[] roleids1 = new Long[1];
					roleids1[0] = invitedRoleId;
					this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids1));
					break;
				case 2://闁哄啰濞�濡诧附瀵煎蹇曠闂佸じ绶氶崐瀣嫚閻わ拷?閸涱厽瀚查悶姘煎亰閸婂鎷犻悿锟�??
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

				case 3://闂佸じ杈渆am闁挎稑鑻幏浼村箥?闁哄牆顦Ч锟�
					xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId);
					if(teamInfo == null)
					{
						psend(invitedRoleId, new STeamError(TeamError.InviterTeamNotExist));
						TeamManager.logger.debug("FAIL:闂侊拷?閻犲洭鏀遍崑宥夋儍閸曨垱袝濞寸厧绉撮崙锛勭磼韫囨鎺楀极?,TeamId: "+inviterTeamId);
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
					//闂侊拷?閻犲洤鍢查崙锛勭磼韫囨氨孝闁哄啳鍩栭崹銊╂嚀閸涙潙锟藉鎷犻摎鍌滅憹閻庢稒锚濠�顏堟晬閸ф樄legal闁匡拷?
					TeamManager.logger.debug("FAIL:闂侊拷?閻犲洤鍢查崙锛勭磼韫囨氨孝闁哄啳鍩栭崹銊╂嚀閸涙潙锟藉鎷犻摎鍌滅憹閻庢稒锚濠�锟�,RoleId: "+invitedRoleId);
					return true;
				}
				if(agree == 1)
				{
					if (checkPvP(inviterRoleId, invitedRoleId) != 0) {
						return true;
					}

					if(!checkOnline(invitedRoleId))
					{
						//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱剛鐟濋柛锔哄妿閸わ拷,闁规亽鍎辫ぐ鍫ユ焽?閻犲洤鍢查幃妤呭矗閸粎鐟撶紒鎯с仒缁繝鏁嶉悤鍌滅illegal闁匡拷?
						TeamManager.logger.debug("FAIL:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱剛鐟濋柛锔哄妿閸わ拷,闁规亽鍎辫ぐ鍫ユ焽?閻犲洤鍢查幃妤呭矗閸粎鐟撶紒鎯с仒缁繝鏁�?,RoleId: "+invitedRoleId);
					}
					/*else if(!checkInvitedStatus(invitedRoleId))
					{
						//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�??
						//psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
						Message.psendMsgNotify(invitedRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
						TeamManager.logger.debug("FAIL:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�??,RoleId: "+invitedRoleId);
					}*/
					else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
					{
						//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱垱鐣辩紓浣稿濡诧箓宕濋悢璇插幋婵炲备鍓濆﹢渚�骞嶉幘宕囩；
						psend(invitedRoleId, new STeamError(TeamError.SelfTeamFunctionClose));
						TeamManager.logger.debug("FAIL:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱垱鐣辩紓浣稿濡诧箓宕濋悢璇插幋婵炲备鍓濆﹢渚�骞嶉幘宕囩；,RoleId: "+invitedRoleId);
					}
					else if(!checkInvitedInNoTeam(invitedTeamId))
					{
						//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱厽韬梻鍐枍缁辩偞绋夐銊хillegal闁匡拷?
						TeamManager.logger.debug("FAIL:閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱厽韬梻鍐枍缁辩偞绋�?,RoleId: "+invitedTeamId);
					}
//					else if (fire.pb.buff.Module.existState(inviterRoleId, BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(invitedRoleId, 160202, null);
//						TeamManager.logger.debug("CRespondInvite:闁绘壕鏅涢锟�(roleId=" + inviterRoleId+")invite濠㈣泛瀚花顒勫礈椤栨稒鎷卞☉锟�?,濞戞挸绉烽崗妯肩磼閸曨垱袝");
//					}
					else if(inviting.getTeamid() > -1)
					{
						TeamManager.logger.debug("INFO:闁哄鍎撮崵婊堟⒓閻斿墎绀婇柣銊ュ閸婂鎷�?,TeamId: "+inviterTeamId);
						//闁哄鍎撮崵婊堟⒓閻斿墎绀婇柣銊ュ閸婂鎷�?
						xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId);
						if(!checkInviterTeamExist(teamInfo))
						{
							//闂侊拷?閻犲洭鏀遍崑宥夋儍閸曨垱袝濞寸厧绉撮崙锛勭磼韫囨鎺楀极?
							psend(invitedRoleId, new STeamError(TeamError.InviterTeamNotExist));
							TeamManager.logger.debug("FAIL:闂侊拷?閻犲洭鏀遍崑宥夋儍閸曨垱袝濞寸厧绉撮崙锛勭磼韫囨鎺楀极?,TeamId: "+inviterTeamId);
						}
						else if(!checkTeamInvitingValid(teamInfo, invitedRoleId))
						{
							//闂傚啰鍠嶇槐鐐烘焽?閻犲洤鍢查崙锛勭磼韫囨氨孝闁哄啳顔愮槐妾宭legal闁匡拷?
							TeamManager.logger.debug("FAIL:闂傚啰鍠嶇槐鐐烘焽?閻犲洤鍢查崙锛勭磼韫囨氨孝闁猴拷?,TeamId: "+inviterTeamId);
						}
						
						else if(!checkTeamNotFull(teamInfo)){
							MessageMgr.psendMsgNotify(invitedRoleId, 145740, null);
							//閻庝絻顫夐弻鐔兼⒓閻斿墎绀婂ù婊呭劋閺嗙喎顔忛崣澶婂К
							psend(invitedRoleId, new STeamError(TeamError.TeamFull));
							TeamManager.logger.debug("FAIL:閻庝絻顫夐弻鐔兼⒓閻斿墎绀婂ù婊呭劋閺嗙喎顔忛崣澶婂К,TeamId: "+inviterTeamId);
						}
						else if(isLeaderInDuel(teamInfo.getTeamleaderid()))
						{
							// 闂傚啰鍠栭弳閬嶅捶閵娿儱鏋�闁猴拷? by changhao
							TeamManager.logger.debug("FAIL:闂傚啰鍠栭弳閬嶅捶閵娿儱鏋�闁猴拷?,TeamId: "+inviterTeamId);
						}else if(checkMap(teamInfo.getTeamleaderid(), invitedRoleId)){
							//闂傚啰鍠嶇槐鐐哄矗椤栨瑤绨伴柛鏃傚Т閸欏棙娼诲▎搴ㄥ殝闁哄倻澧楅崹姘跺川?
							Team team = new Team(inviterTeamId,false);
							TeamManager.logger.debugWhileCommit("SUCC:闂傚啰鍠嶇槐鐐哄矗椤栨瑤绨伴柛鏃傚Т閸欏棙娼诲▎搴ㄥ殝闁哄倻澧楅崹姘跺川?(闁告鍠愬鐢告儍閸曨垱袝濞达拷?),TeamId: "+inviterTeamId);
							boolean ok = team.addNewMemberWithSP(invitedRoleId);
							//濠碘�冲�归悘澶愬箣閹邦剙顫犻柛蹇嬪劦濡诧箓寮婚妷褎绠欓柡鍕靛灠閹線妫�?閻熸洑鐒︽刊鐑樼閺嵮冪厒闂傚啰鍠栭弳閬嶅籍娴ｇ晫鐝� by changhao
							if (ok)
							{
								boolean iscruise = checkCruiseWhenInvited(invitedRoleId);
								if(iscruise){
									//閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱叀绐楁繛鎾虫憸婵悂骞�?,闁稿繈鍎靛Σ锕傚触鎼达絿褰岄柛妤勬珪濞堝繒绮嬫导娆戠＜
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
					else //閺夆晜鐟╅崳鐑藉及椤栨瑧鐟濋幖瀛樻椤曟碍娼诲☉娆愰檷闁汇劌瀚哥槐婵嗏柦閳╁啯绠掗梻鍐枍缁辩偞绋夊鍫濆幋闂侊拷?閻狅拷? by changhao
					{
						TeamManager.logger.debug("INFO:闁哄鍎撮崵婊勭▔椤忓啯鐪介柣銊ュ閸婂鎷�?,inviterRoleId: "+inviterRoleId);
						//闁哄鍎撮崵婊勭▔椤忓啯鐪介柣銊ュ閸婂鎷�?
						if(!checkOnline(inviterRoleId))
						{
							// 闂侊拷?閻犲洨鏌�?閸涱剛鐟濋柛锔哄妿閸わ拷
							psend(invitedRoleId, new STeamError(TeamError.ObjectOffline));
							TeamManager.logger.debug("FAIL:闂侊拷?閻犲洨鏌�?閸涱剛鐟濋柛锔哄妿閸わ拷,inviterRoleId: "+inviterRoleId);
						}
						/*else if(!checkInviterStatus(inviterRoleId))
						{
							//闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�??
							//psend(invitedRoleId, new STeamError(TeamError.ObjectInUnteamState));
							Message.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
							TeamManager.logger.debug("FAIL:闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冪凹缁楀鎳楅悾宀�鐭嬮梻鍐枔濞堟垿鎮╅懜锟�??,inviterRoleId: "+inviterRoleId);
						}*/else
						{
							//闁兼儳鍢茶ぐ鍥焽?閻犲洨鏌�?閸涱垰绠涢柛锔哄妿濞堟垿姊奸悢鍓佺ID
							inviterTeamId = xtable.Roleid2teamid.get(inviterRoleId);
							if(checkInviterInTeam(inviterTeamId))
							{
								mkdb.Trace.log(mkdb.Trace.DEBUG, "闂侊拷?閻犲洨鏌�?閸涙潙锟藉鎷犻柨瀣槯婵炲备鍓濆﹢渚�姊奸悢鍓佺闁挎稑濂旂徊楣冨及椤栨碍绀�濠㈣泛绉靛鍌氼啅閼碱剛鐥呴柡鍫濐樀濡诧附瀵�?,TeamId: "+inviterTeamId);
								//闂侊拷?閻犲洨鏌�?閸涙潙锟藉鎷犻柨瀣槯婵炲备鍓濆﹢渚�姊奸悢鍓佺闁挎稑濂旂徊楣冨及椤栨碍绀�濠㈣泛绉靛鍌氼啅閼碱剛鐥呴柡鍫濐樀濡诧附瀵煎蹇曠闁告瑯鍨甸崗姗�寮伴姘仩鐎点倛娅ｉ悵娑㈡儍閸曞墎绀夐弶鈺傜懄濡炲倹绋婇悢宄拌濞寸姰鍎辨慨鐐哄礂?
								xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId); 
								if(!checkInviterIsLeader(inviterRoleId, teamInfo))
								{
									//闂侊拷?閻犲洨鏌�?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�?
									//psend(invitedRoleId, new STeamError(TeamError.ObjectNotLeader));
									MessageMgr.psendMsgNotify(invitedRoleId, 141861, null);
									TeamManager.logger.debug("FAIL:闂侊拷?閻犲洨鏌�?閸涱剛鐟濋柡鍕靛灦濡诧箓姊�?,TeamId: "+inviterTeamId);
								}
								else if(isLeaderInDuel(inviterRoleId))
								{
									// 闂傚啰鍠栭弳閬嶅捶閵娿儱鏋�闁猴拷?
									TeamManager.logger.debug("FAIL:闂傚啰鍠栭弳閬嶅捶閵娿儱鏋�闁猴拷?,TeamId: "+inviterTeamId);
								}
								else if(!checkTeamInvitingValid(teamInfo, invitedRoleId))
								{
									//闂侊拷?閻犲洤鍢查崙锛勭磼韫囨氨孝闁哄啳顔愮槐妾宭legal闁匡拷?
									TeamManager.logger.debug("FAIL:闂侊拷?閻犲洤鍢查崙锛勭磼韫囨氨孝闁猴拷?,TeamId: "+inviterTeamId);
								}
								else if(checkTeamNotFull(teamInfo) && checkMap(teamInfo.getTeamleaderid(), invitedRoleId))
								{
									Team team = new Team(inviterTeamId,false);
									//濠碘�冲�归悘澶愬嫉婢跺瞼娉㈠┑鐘崇煯閹广垽宕濋埄鍐┬﹀☉鎾崇Т閸樻垹鎷嬬粙鎸庡闁稿繑婀圭划顒佺閾忓湱鐭嬮梻鍐枔濞堬拷
//									if(!MarryTaskStepManager.checkMarryTaskState(team.getAllMemberIds(), invitedRoleId)){
//										//TODO
//										
//									}else{
										TeamManager.logger.debugWhileCommit("SUCC:闂傚啰鍠嶇槐鐐哄礉閻樻彃寮抽弶鈺傜懁闁叉粓寮悧鍫濈亣闁革拷?(闁告艾瀛╁鐢告儍閸曨垱袝濞达拷?),TeamId: "+inviterTeamId);
										return team.addNewMemberWithSP(invitedRoleId);
									//}
								}
							}
							else
							{
								//闂侊拷?閻犲洨鏌�?閸涙潙锟藉鎷犻柨瀣槯婵炲备鍓濆﹢渚�姊奸悢鍓佺闁挎稑鐬奸獮鍥捶閵娿倗鐭濋柣鎺曞煐閻ュ懘寮垫径娑氱闂傦拷?閻熸洑绀佺紓鎾剁博鐎ｎ偅鐓�闁汇劌瀚板Σ锔藉瀹ュ繒绀夐柛鎰Т婵偤宕�?
								TeamManager.logger.debug("INFO:闂侊拷?閻犲洨鏌�?閸涙潙锟藉鎷犻柨瀣槯婵炲备鍓濆﹢渚�姊奸悢鍓佺闁挎稑鐬奸獮鍥捶閵娿倗鐭濋柣鎺曞煐閻ュ懘寮�?,inviterRoleId: "+inviterRoleId);
								if(!checkSingleInvitingExist(inviterRoleId, invitedRoleId))
								{
									//闂侊拷?閻犲洨鏌�?閸涱垱鐣遍梺锟�?閻犲洤鍢查崙锛勭磼韫囨氨孝闁哄啳顔愮槐妾宭ligal闁匡拷?
									TeamManager.logger.debug("FAIL:闂侊拷?閻犲洨鏌�?閸涱垱鐣遍梺锟�?閻犲洤鍢查崙锛勭磼韫囨氨孝闁猴拷?,inviterRoleId: "+inviterRoleId);
								}
								else if(isLeaderInDuel(inviterRoleId))
								{
									// 闂傚啰鍠栭弳閬嶅捶閵娿儱鏋�闁猴拷?
									TeamManager.logger.debug("FAIL:闂傚啰鍠栭弳閬嶅捶閵娿儱鏋�闁猴拷?,TeamId: "+inviterTeamId);
								}
								else if(checkMap(inviterRoleId, invitedRoleId))
								{
									//鐎点倛娅ｉ悵娑㈠棘閹殿喗鐣遍梻鍐枍缁辩偤鏁嶅畝鍕拷瀣嫚閻わ拷?閸涱剝绀嬮梻鍐枛閺嗛亶鏁嶅畝鍕拷瀣嫚閻わ拷?閸涱垱鐣遍梺锟�?閻犲洤鍢查崣蹇曠矓鐠囨彃鐓傞梻鍐枍缁辩偞绋�?
									Team team = TeamManager.getInstance().createNewTeam(inviterRoleId);
									if(team == null)
									{
										//fire.pb.talk.Message.sendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
										fire.pb.talk.MessageMgr.sendMsgNotify(invitedRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
										TeamManager.logger.debug("FAIL:闁告帗绋戠紓鎾绘⒓閻斿墎绀婂鎯扮簿鐟欙箓鏁嶉崼婵嗚闁煎磭鏅弫杈ㄧ鎼达絽笑闁诡兛绀侀崯璺ㄧ玻娓氬﹦绀嗛柕锟�?");
										return true;
									}
									//濠碘�冲�归悘澶愬嫉婢跺瞼娉㈠┑鐘崇煯閹广垽宕濋埄鍐┬﹀☉鎾崇Т閸樻垹鎷嬬粙鎸庡闁稿繑婀圭划顒佺閾忓湱鐭嬮梻鍐枔濞堬拷
//									if(!MarryTaskStepManager.checkMarryTaskState(team.getAllMemberIds(), invitedRoleId)){
//										//TODO
//										return true;
//									}
									//婵烇綀顕ф慨鐐哄棘閻楀牆鐏囬柛锟�?
									TeamManager.logger.debugWhileCommit("SUCC:闂傚啰鍠嶇槐鐐哄礉閻樻彃寮抽弶鈺傜懁闁叉粓寮悧鍫濈亣闁革拷?(闁哄倹婢樼紓鎾绘儍閸曨垱袝濞寸厧绋勭槐婵嬫焽?閻犲洨鏌�?閸涱剝绀嬮梻鍐枛閺嗭拷),TeamId: "+inviterTeamId);
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
						//闁告瑦鍨�?娴ｈ櫣鑸堕梻鍐枛閺嗭拷
						Long leaderId = xtable.Team.selectTeamleaderid(inviterTeamId);
						if(leaderId!=null)
						{
							fire.pb.talk.MessageMgr.psendMsgNotify(leaderId, 140851, name);
							psendWhileCommit(leaderId, new SRespondInvite(invitedRoleId,(byte)0));
						}
					}
					else
					{
						//闁告瑦鍨�?娴ｈ櫣鑸堕梺锟�?閻犲洨鏌�??
						fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 140851, name);
						psendWhileCommit(inviterRoleId, new SRespondInvite(invitedRoleId,(byte)0));
					}
					TeamManager.logger.debug("FAIL闁挎稑濂旂粭澶愬箳閵夈儱缍�缂備礁瀚板Σ锕傛焽?閻狅拷?,invitedRoleId: "+invitedRoleId);
				}
				//濞戞挸绉电敮鎾矗濡ゅ懎锟藉鎷犻柨瀣仐闁兼澘鎳忕敮鎾矗濡ゅ懎锟藉鎷犳搴㈢暠闁哄锟藉弶顐介柡鍫簼瀵呮惥缁涘湱绀夐梺顔硷拷鐕佹矗闁告帞濞�濞呭酣鏌�?閻狅拷?
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
		
		//闁告瑦鍨奸幑锝嗙?
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
		
		//闁革负鍔岄悾銊╁礂閵娿儲鍕鹃柛锟�? 濞戞挸绉甸悧搴㈩殽瀹�锟界划宥夋⒓?
		if(cfg == null || descfg == null){
			return true;
		}
		if(cfg.getSafemap() == descfg.getSafemap() && cfg.getSafemap() == 1){
			return true;
		}
		
		return true;
	}

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long inviterRoleId, long invitedRoleId) {
		// 闁搞儳鍋涚花鏌ユ焽?閻狅拷?
		return fire.pb.battle.pvp.PvPTeamHandle.onRespondInvite(inviterRoleId, invitedRoleId);
	}

	//闂侊拷?閻犲洤鍢查悺銊╁捶閵婏拷?鐏炶偐鐟繛灞勩倗孝闁哄啳顔愮槐鐢稿矗椤忓洤鍘撮柛锔瑰ⅴrocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInviteExist(long invitedRoleId)
	{
		//闁稿繐鐗呯划鐘绘焽?閻犲洨鏌夐妴鍐╃▔椤撶喓鍙�闁瑰灚宕橀姘閻戞ɑ笑闁告熬绠掗～锕傛焽?閻狅拷?
		xbean.InviteInfo invite = xtable.Teaminvite.get(invitedRoleId);
		if(invite == null)
			return false;
		else if(!invite.getBeinginvited())
			return false;
		else if((now - invite.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{   //闂侊拷?閻犲洨鏌夌粔鎾籍?
			invite.setBeinginvited(false);
			cleanTimeoutInvites(invite.getInvited());
			return false;
		}
		else
			return true;
	}
	
	// 閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱厽韬紒锟�??闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkOnline(long roleId)
	{
		if(StateCommon.isOnline(roleId))
			return true;
		else
			return false;
	}	
	
	
	// 閻炴凹鍋婇崐瀣嫚閻わ拷?閸涱垳鐭嬮梻鍐枎缁辨垿宕楅崘鎻掑殥闁瑰灚鎸哥槐锟�?闁告瑯浜ｉ崗姗�宕烽埉鎶畂cedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
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
	
	private boolean checkCruiseWhenInvited(long invitedRoleId){
		PropRole prole = new PropRole(invitedRoleId, true);
		if(prole.getProperties().getCruise() > 0) {
			return true;
		}
		return false;
	}
	
	//闁哄鍎撮崵婊堟⒓閻斿墎绀婇柣銊ュ閸婂鎷犻崙銈囧惞闁挎稑娼歛lse闁哄嫷鍨卞鐢告嚊椤忓啴鍤嬪ù婊呭皑缁辨岸宕ｉ鍥у幋闁革腹澧ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInviteFromTeam(Long inviterTeamId)
	{
		if(inviterTeamId != null)
			return true;
		else
			return false;
	}
	
	//闂侊拷?閻犲洨鍏樺Σ锔藉瀹ュ牏绠烽悗娑櫭﹢顏堟晬閻斿嘲娑ч柤瀹犳濠�鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInviterTeamExist(xbean.TeamInfo teamInfo)
	{
		if(teamInfo != null)
			return true;
		else
			return false;
	}
	
	//闂傚啰鍠嶇槐鐐烘儍閸曨垰锟藉鎷犻摎鍌濆幀閻庢稒锚濠�顏呮交濞嗗酣鍤嬮梺锟�?閻犲洤鍤栫槐婵嬫嚀鐏炶偐鐟弶鈺偵戝﹢顓犳惥閸涱喗顦ч柨娑氬枎瑜把囨嚄閽樺韬琍rocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkTeamInvitingValid(xbean.TeamInfo teamInfo, long invitedRoleId)
	{
		java.util.Map<Long,Long> invitings = teamInfo.getInvitingids();
	    cleanTimoutInvitings(invitings);
	    if(invitings.get(invitedRoleId) != null)
	    	return true;
	    else
	    	return false;
	}
	//闂傚啰鍠嶇槐鐐烘儍閸曨亝鐪介柡浣哄濠�顓熸綇閹冪厒5濞存粎灏ㄧ槐鐢稿矗椤忓洤鍘撮柛锔瑰ⅴrocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkTeamNotFull(xbean.TeamInfo teamInfo)
	{
		if (teamInfo.getMembers().size() < 4)
			return true;
		else
			return false;
	}
	
/*	//闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冮瑜板弶绂掗妷褏鐭嬮梻鍐枔濞堟垿鎮╅懜锟�?娓氬﹦鍚归柨娑樼墦濞碱亞鎹勯幋婵囨珜闁靛棔绶氶ˉ锝囨偘鐏烇拷?娴ｇ绀嬪ù婊嗘〃閹广垽宕濋敍鍕惣闁匡拷?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(StateType.STATE_TEAM))
		{
			TeamManager.logger.info("闁绘壕鏅涢锟�(roleId=" + inviterRoleId+")濠㈣泛瀚花顒佺▔瀹ュ牆鍘寸紓浣稿濡诧箓鎯冮崟顓炐﹂柟锟�?");
			return true;
		}
		return true;
	}
*/	
	//闂侊拷?閻犲洨鏌�?閸涱収妲卞ù婊冮叄濡诧附瀵煎鍕幀闁挎稓鍠庤ぐ褔鎳楅挊澶嬭含Procedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInviterInTeam(Long inviterTeamId)
	{
		if(inviterTeamId != null)
			return true;
		else
			return false;
	}
	
	// 闂侊拷?閻犲洨鏌�?閸涱喗笑闂傚啰鍠栭弳閬嶆晬閻斿嘲娑ч柤瀹犳濠�鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkInviterIsLeader(long inviterRoleId , xbean.TeamInfo teamInfo)
	{
		if(teamInfo.getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}
	
	//濞戞搩浜欏Ч澶愭焽?閻犲洨鏌夐妴鍐╃▔椤撶姵鐣遍梺锟�?閻犲洤鍢查悺銊╁捶椤帞鍚归柛娆樹海閸忔﹢宕烽埉鎶畂cedure濞戞搩鍙�閻ㄧ喖鎮�?
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
	
	
	//濞达綀娉曠敮铏癸拷纭呮硾濞叉牠宕氶悧鍫熷紦閻炴凹鍋婇崐瀣嫚妞嬪骸笑闁癸拷?,闁告艾鏈鍌炲礆閻樼粯鐝熼弶鈺佹处濠�锟犳焽?閻狅拷?
	private void deleteInvite(final long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.select(invitedRoleId);
		if(inviteInfo == null)
			return;
		//闁告帞濞�濞呭窐eam閻炴稏鍔嬮懙鎴︽儍閸掔惢viting濞ｅ洠鍓濇导鍛村箣閺嶏拷?閸栫櫡ngleInvitings濞戞搩鍘惧▓鎱絥viting濞ｅ洠鍓濇导锟�
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
		
		//闁哄洤鐡ㄩ弻濂縩vites閻炴稏鍔嬮懙鎴︽儍閸曨亙绻嗛柟锟�?
		inviteInfo.setBeinginvited(false);
		cleanTimeoutInvites(inviteInfo.getInvited());
		//濠碘�冲�归悘濉眓vited濞戞搩鍘虹弧鍐ㄢ柦閳╁啯绠掑ù鐘侯唺缂嶅秵绌遍埄鍐х礀闁挎稑鑻崹顖氼潰閵堝棙钂婭nviteInfo婵炲备鍓濆﹢浣猴拷娑櫭﹢顏堟儍閸曨偆绠戦悷鏇氱筏缁辨繈宕ｉ娆庣鞍闁告帞濞�濞咃拷
		if(inviteInfo.getInvited().size() == 0)
			xtable.Teaminvite.remove(invitedRoleId);
		
		
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


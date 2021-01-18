
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
 * 閸ョ偛绨查柇?鐠�?
 * @author changhao
 *
 */
public class CRespondInvite extends __CRespondInvite__ {
		
	//final static int MEMBER_MAX_COUNT = 4;//4娑擃亷绱濇担婊呮暏娴滃酣妲︽导宥嗗灇閸涙ü姹夐弫甯礄娑撳秴瀵橀幏顒勬Е闂�鍖＄礆閿涘苯鎮撻弮璺哄絺閸戣櫣娈戦柇?鐠囪渹閲滈弫?
	
	//final static long MAX_INVITE_TIMEOUT = 30*1000;//30s,娴ｆ粎鏁ゆ禍搴ㄥ�嬬拠鐤Т閺冭绱濋崥灞肩闁�?鐠囩兘妾洪崚鑸垫闂�?
	private long now = 0L;//procedure瀵�?婵妞傛穱婵嗙摠娑�?娑擃亜?纭风礉娣囨繆鐦夊顦杛ocedure娑擃厽妞傞梻瀵告畱缂佺喍绔撮幀?
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
				//妤犲矁鐦夐弰顖氭儊鐞氼偊鍊嬬拠?
				try
				{
				xbean.InviteInfo inviteInfo = xtable.Teaminvite.select(invitedRoleId);
				if(inviteInfo == null)
					return true;
				else if(!inviteInfo.getBeinginvited())
					return true;
				else if((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
				{   //闁�?鐠囩柉绉撮弮?
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
					Long inviterclanfightid = xtable.Roleid2clanfightid.select(inviterRoleId);//婵″倹鐏夐柇?鐠囩柉?鍛躬閸忣兛绱伴幋妯烘簚娑�? by changhao
					if (inviterclanfightid != null)
					{
						Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//婵″倹鐏夌悮顐﹀�嬬拠鐤�?鍛躬閸忣兛绱伴幋妯烘簚娑�? by changhao
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
						Long invitedclanfightid = xtable.Roleid2clanfightid.select(invitedRoleId);//婵″倹鐏夌悮顐﹀�嬬拠鐤�?鍛躬閸忣兛绱伴幋妯烘簚娑�? by changhao
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
						TeamManager.logger.info("CRespondInvite1:闁�?鐠囪渹姹�" + inviterRoleId + "鐞氼偊鍊嬬拠铚傛眽" + invitedRoleId + ",闁�?鐠囪渹姹夐崷銊ヨ窗濞撳摜濮搁幀?,娑撳秷鍏橀柇?鐠囬攱鐓囨禍?");
						return true;
					}
					
					PropRole invitedprop = new PropRole(invitedRoleId, true);
					if(invitedprop.getProperties().getCruise() > 0)
					{
						MessageMgr.sendMsgNotify(invitedRoleId, 162027, null);
						MessageMgr.sendMsgNotify(inviterRoleId, 162026, null);
						TeamManager.logger.info("CRespondInvite2:闁�?鐠囪渹姹�" + inviterRoleId + "鐞氼偊鍊嬬拠铚傛眽" + invitedRoleId + ",闁�?鐠囪渹姹夐崷銊ヨ窗濞撳摜濮搁幀?,娑撳秷鍏橀柇?鐠囬攱鐓囨禍?");
						return true;
					}
					
					if(checkInviteFromTeam(inviterTeamId))
					{
						//閺夈儴鍤滈梼鐔剁礊閻ㄥ嫰鍊嬬拠鍑ょ礉闁夸辜eam閿涘矂妲﹂梹鍨嫲鐞氼偊鍊嬬拠鐤�??
						lockState = 3;
					}
					else
					{
						//閺夈儴鍤滄稉顏冩眽閻ㄥ嫰鍊嬬拠鍑ょ礉閻骞囬崷銊︽箒閺冪娀妲︽导?
						inviterTeamId = xtable.Roleid2teamid.select(inviterRoleId);
						if(inviterTeamId!= null)
						{//閺堝妲︽导宥忕礉閻妲搁崥锔芥Ц闂冪喖鏆�
							lockState = 3;//闁夸辜eam閿涘矂妲﹂梹鍨嫲鐞氼偊鍊嬬拠鐤�??
						}
						else
						{//閺冪娀妲︽导宥忕礉闁夸線鍊嬬拠鐤�?鍛嫲鐞氼偊鍊嬬拠鐤�??
							lockState = 2;
						}
					}
				}
				else
				{//閸欘亪鏀ｇ悮顐﹀�嬬拠鐤�?鍛畱rolelock
					lockState = 1;
				}
				
				switch (lockState)
				{
				case 1://閸欘亪鏀ｇ悮顐﹀�嬬拠鐤�?鍛畱rolelock
					Long[] roleids1 = new Long[1];
					roleids1[0] = invitedRoleId;
					this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids1));
					break;
				case 2://閺冪娀妲︽导宥忕礉闁夸線鍊嬬拠鐤�?鍛嫲鐞氼偊鍊嬬拠鐤�??
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

				case 3://闁夸辜eam閿涘苯鎷伴幍?閺堝姹�
					xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId);
					if(teamInfo == null)
					{
						psend(invitedRoleId, new STeamError(TeamError.InviterTeamNotExist));
						TeamManager.logger.debug("FAIL:闁�?鐠囬攱鍋嶉惃鍕Е娴煎秴鍑＄紒蹇毿掗弫?,TeamId: "+inviterTeamId);
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
					//闁�?鐠囧嘲鍑＄紒蹇氱Т閺冭埖鍨ㄩ懓鍛村�嬬拠铚傜瑝鐎涙ê婀敍鍧昹legal閿�?
					TeamManager.logger.debug("FAIL:闁�?鐠囧嘲鍑＄紒蹇氱Т閺冭埖鍨ㄩ懓鍛村�嬬拠铚傜瑝鐎涙ê婀�,RoleId: "+invitedRoleId);
					return true;
				}
				if(agree == 1)
				{
					if (checkPvP(inviterRoleId, invitedRoleId) != 0) {
						return true;
					}

					if(!checkOnline(invitedRoleId))
					{
						//鐞氼偊鍊嬬拠鐤�?鍛瑝閸︺劎鍤�,閹恒儱褰堥柇?鐠囧嘲鎮楅崣鍫滅瑓缁惧じ绨￠敍鐕傜礄illegal閿�?
						TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛瑝閸︺劎鍤�,閹恒儱褰堥柇?鐠囧嘲鎮楅崣鍫滅瑓缁惧じ绨￠敍?,RoleId: "+invitedRoleId);
					}
					/*else if(!checkInvitedStatus(invitedRoleId))
					{
						//鐞氼偊鍊嬬拠鐤�?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�??
						//psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
						Message.psendMsgNotify(invitedRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
						TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�??,RoleId: "+invitedRoleId);
					}*/
					else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
					{
						//鐞氼偊鍊嬬拠鐤�?鍛畱缂佸嫰妲﹂崝鐔诲厴濞屸剝婀侀幍鎾崇磻
						psend(invitedRoleId, new STeamError(TeamError.SelfTeamFunctionClose));
						TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛畱缂佸嫰妲﹂崝鐔诲厴濞屸剝婀侀幍鎾崇磻,RoleId: "+invitedRoleId);
					}
					else if(!checkInvitedInNoTeam(invitedTeamId))
					{
						//鐞氼偊鍊嬬拠鐤�?鍛躬闂冪喍绱炴稉顓ㄧ礄illegal閿�?
						TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛躬闂冪喍绱炴稉?,RoleId: "+invitedTeamId);
					}
//					else if (fire.pb.buff.Module.existState(inviterRoleId, BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//						MessageMgr.sendMsgNotify(invitedRoleId, 160202, null);
//						TeamManager.logger.debug("CRespondInvite:閻溾晛顔�(roleId=" + inviterRoleId+")invite婢跺嫪绨崜顖涙拱娑�?,娑撳秷鍏樼紒鍕Е");
//					}
					else if(inviting.getTeamid() > -1)
					{
						TeamManager.logger.debug("INFO:閺夈儴鍤滈梼鐔剁礊閻ㄥ嫰鍊嬬拠?,TeamId: "+inviterTeamId);
						//閺夈儴鍤滈梼鐔剁礊閻ㄥ嫰鍊嬬拠?
						xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId);
						if(!checkInviterTeamExist(teamInfo))
						{
							//闁�?鐠囬攱鍋嶉惃鍕Е娴煎秴鍑＄紒蹇毿掗弫?
							psend(invitedRoleId, new STeamError(TeamError.InviterTeamNotExist));
							TeamManager.logger.debug("FAIL:闁�?鐠囬攱鍋嶉惃鍕Е娴煎秴鍑＄紒蹇毿掗弫?,TeamId: "+inviterTeamId);
						}
						else if(!checkTeamInvitingValid(teamInfo, invitedRoleId))
						{
							//闂冪喍绱為柇?鐠囧嘲鍑＄紒蹇氱Т閺冭绱檌llegal閿�?
							TeamManager.logger.debug("FAIL:闂冪喍绱為柇?鐠囧嘲鍑＄紒蹇氱Т閺�?,TeamId: "+inviterTeamId);
						}
						
						else if(!checkTeamNotFull(teamInfo)){
							MessageMgr.psendMsgNotify(invitedRoleId, 145740, null);
							//鐎佃鏌熼梼鐔剁礊娴滅儤鏆熷鍙夊姬
							psend(invitedRoleId, new STeamError(TeamError.TeamFull));
							TeamManager.logger.debug("FAIL:鐎佃鏌熼梼鐔剁礊娴滅儤鏆熷鍙夊姬,TeamId: "+inviterTeamId);
						}
						else if(isLeaderInDuel(teamInfo.getTeamleaderid()))
						{
							// 闂冪喖鏆遍崷銊ュ枀閺�? by changhao
							TeamManager.logger.debug("FAIL:闂冪喖鏆遍崷銊ュ枀閺�?,TeamId: "+inviterTeamId);
						}else if(checkMap(teamInfo.getTeamleaderid(), invitedRoleId)){
							//闂冪喍绱為崣顖欎簰閸旂姴鍙嗘潻娆庨嚋閺傜増鍨氶崨?
							Team team = new Team(inviterTeamId,false);
							TeamManager.logger.debugWhileCommit("SUCC:闂冪喍绱為崣顖欎簰閸旂姴鍙嗘潻娆庨嚋閺傜増鍨氶崨?(閸樼喐娼甸惃鍕Е娴�?),TeamId: "+inviterTeamId);
							boolean ok = team.addNewMemberWithSP(invitedRoleId);
							//婵″倹鐏夐幋鎰閸忋儵妲﹂弻銉ф箙閺勵垰鎯侀棁?鐟曚焦濯烘禒鏍у煂闂冪喖鏆遍弮浣界珶 by changhao
							if (ok)
							{
								boolean iscruise = checkCruiseWhenInvited(invitedRoleId);
								if(iscruise){
									//鐞氼偊鍊嬬拠鐤�?鍛窗濞撳摜濮搁幀?,閸忋儵妲﹂崥搴ｇ彌閸楄櫕娈忕粋浼欑磼
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
					else //鏉╂瑩鍣烽弰顖欑瑝鎼存棁顕氭潻娑欐降閻ㄥ嫸绱濆▽鈩冩箒闂冪喍绱炴稉宥堝厴闁�?鐠�? by changhao
					{
						TeamManager.logger.debug("INFO:閺夈儴鍤滄稉顏冩眽閻ㄥ嫰鍊嬬拠?,inviterRoleId: "+inviterRoleId);
						//閺夈儴鍤滄稉顏冩眽閻ㄥ嫰鍊嬬拠?
						if(!checkOnline(inviterRoleId))
						{
							// 闁�?鐠囩柉?鍛瑝閸︺劎鍤�
							psend(invitedRoleId, new STeamError(TeamError.ObjectOffline));
							TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛瑝閸︺劎鍤�,inviterRoleId: "+inviterRoleId);
						}
						/*else if(!checkInviterStatus(inviterRoleId))
						{
							//闁�?鐠囩柉?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�??
							//psend(invitedRoleId, new STeamError(TeamError.ObjectInUnteamState));
							Message.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
							TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�??,inviterRoleId: "+inviterRoleId);
						}*/else
						{
							//閼惧嘲褰囬柇?鐠囩柉?鍛箛閸︺劎娈戦梼鐔剁礊ID
							inviterTeamId = xtable.Roleid2teamid.get(inviterRoleId);
							if(checkInviterInTeam(inviterTeamId))
							{
								mkdb.Trace.log(mkdb.Trace.DEBUG, "闁�?鐠囩柉?鍛村�嬬拠閿嬫濞屸剝婀侀梼鐔剁礊閿涘奔绲鹃弰顖氭礀婢跺秵妞傚鑼病閺堝妲︽导?,TeamId: "+inviterTeamId);
								//闁�?鐠囩柉?鍛村�嬬拠閿嬫濞屸剝婀侀梼鐔剁礊閿涘奔绲鹃弰顖氭礀婢跺秵妞傚鑼病閺堝妲︽导宥忕礉閸欘垵鍏橀弰顖氬灠瀵よ櫣鐝涢惃鍕剁礉鏉╂瑦妞傛稊鐔峰讲娴犮儱濮為崗?
								xbean.TeamInfo teamInfo = xtable.Team.get(inviterTeamId); 
								if(!checkInviterIsLeader(inviterRoleId, teamInfo))
								{
									//闁�?鐠囩柉?鍛瑝閺勵垶妲﹂梹?
									//psend(invitedRoleId, new STeamError(TeamError.ObjectNotLeader));
									MessageMgr.psendMsgNotify(invitedRoleId, 141861, null);
									TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛瑝閺勵垶妲﹂梹?,TeamId: "+inviterTeamId);
								}
								else if(isLeaderInDuel(inviterRoleId))
								{
									// 闂冪喖鏆遍崷銊ュ枀閺�?
									TeamManager.logger.debug("FAIL:闂冪喖鏆遍崷銊ュ枀閺�?,TeamId: "+inviterTeamId);
								}
								else if(!checkTeamInvitingValid(teamInfo, invitedRoleId))
								{
									//闁�?鐠囧嘲鍑＄紒蹇氱Т閺冭绱檌llegal閿�?
									TeamManager.logger.debug("FAIL:闁�?鐠囧嘲鍑＄紒蹇氱Т閺�?,TeamId: "+inviterTeamId);
								}
								else if(checkTeamNotFull(teamInfo) && checkMap(teamInfo.getTeamleaderid(), invitedRoleId))
								{
									Team team = new Team(inviterTeamId,false);
									//婵″倹鐏夐張澶岀波婵犳矮鎹㈤崝鈩冩Ц娑撳秴鍘戠拋绋挎嫲閸忔湹绮禍铏圭矋闂冪喓娈�
//									if(!MarryTaskStepManager.checkMarryTaskState(team.getAllMemberIds(), invitedRoleId)){
//										//TODO
//										
//									}else{
										TeamManager.logger.debugWhileCommit("SUCC:闂冪喍绱為崝鐘插弳鏉╂瑤閲滈弬鐗堝灇閸�?(閸氬孩娼甸惃鍕Е娴�?),TeamId: "+inviterTeamId);
										return team.addNewMemberWithSP(invitedRoleId);
									//}
								}
							}
							else
							{
								//闁�?鐠囩柉?鍛村�嬬拠閿嬫濞屸剝婀侀梼鐔剁礊閿涘瞼骞囬崷銊ょ矝閻掕埖鐥呴張澶涚礉闂�?鐟曚礁缂撶粩瀣煀閻ㄥ嫰妲︽导宥忕礉閸愬秴濮為崗?
								TeamManager.logger.debug("INFO:闁�?鐠囩柉?鍛村�嬬拠閿嬫濞屸剝婀侀梼鐔剁礊閿涘瞼骞囬崷銊ょ矝閻掕埖鐥呴張?,inviterRoleId: "+inviterRoleId);
								if(!checkSingleInvitingExist(inviterRoleId, invitedRoleId))
								{
									//闁�?鐠囩柉?鍛畱闁�?鐠囧嘲鍑＄紒蹇氱Т閺冭绱檌lligal閿�?
									TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛畱闁�?鐠囧嘲鍑＄紒蹇氱Т閺�?,inviterRoleId: "+inviterRoleId);
								}
								else if(isLeaderInDuel(inviterRoleId))
								{
									// 闂冪喖鏆遍崷銊ュ枀閺�?
									TeamManager.logger.debug("FAIL:闂冪喖鏆遍崷銊ュ枀閺�?,TeamId: "+inviterTeamId);
								}
								else if(checkMap(inviterRoleId, invitedRoleId))
								{
									//瀵よ櫣鐝涢弬鎵畱闂冪喍绱為敍宀勫�嬬拠鐤�?鍛礋闂冪喖鏆遍敍宀勫�嬬拠鐤�?鍛畱闁�?鐠囧嘲鍙忕粔璇插煂闂冪喍绱炴稉?
									Team team = TeamManager.getInstance().createNewTeam(inviterRoleId);
									if(team == null)
									{
										//fire.pb.talk.Message.sendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_SELF_CANT_IN_TEAM, null);
										fire.pb.talk.MessageMgr.sendMsgNotify(invitedRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
										TeamManager.logger.debug("FAIL:閸掓稑缂撻梼鐔剁礊婢惰精瑙﹂敍鍫濆讲閼崇晫鏁辨禍搴ｅЦ閹礁鍟跨粣渚婄礆閵�?");
										return true;
									}
									//婵″倹鐏夐張澶岀波婵犳矮鎹㈤崝鈩冩Ц娑撳秴鍘戠拋绋挎嫲閸忔湹绮禍铏圭矋闂冪喓娈�
//									if(!MarryTaskStepManager.checkMarryTaskState(team.getAllMemberIds(), invitedRoleId)){
//										//TODO
//										return true;
//									}
									//濞ｈ濮為弬鐗堝灇閸�?
									TeamManager.logger.debugWhileCommit("SUCC:闂冪喍绱為崝鐘插弳鏉╂瑤閲滈弬鐗堝灇閸�?(閺傛澘缂撻惃鍕Е娴煎稄绱濋柇?鐠囩柉?鍛礋闂冪喖鏆�),TeamId: "+inviterTeamId);
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
						//閸欐垿?浣虹舶闂冪喖鏆�
						Long leaderId = xtable.Team.selectTeamleaderid(inviterTeamId);
						if(leaderId!=null)
						{
							fire.pb.talk.MessageMgr.psendMsgNotify(leaderId, 140851, name);
							psendWhileCommit(leaderId, new SRespondInvite(invitedRoleId,(byte)0));
						}
					}
					else
					{
						//閸欐垿?浣虹舶闁�?鐠囩柉??
						fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 140851, name);
						psendWhileCommit(inviterRoleId, new SRespondInvite(invitedRoleId,(byte)0));
					}
					TeamManager.logger.debug("FAIL閿涘奔绗夐幒銉ュ綀缂佸嫰妲﹂柇?鐠�?,invitedRoleId: "+invitedRoleId);
				}
				//娑撳秵甯撮崣妤呭�嬬拠閿嬪灗閼板懏甯撮崣妤呭�嬬拠椋庢畱閺夆�叉閺堫亝寮х搾绛圭礉闁�燁洣閸掔娀娅庨柇?鐠�?
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
		
		//閸欐垼鎹ｆ禍?
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
		
		//閸︺劌鐣ㄩ崗銊ユ勾閸�? 娑撳秵鐗庢宀�绮嶉梼?
		if(cfg == null || descfg == null){
			return true;
		}
		if(cfg.getSafemap() == descfg.getSafemap() && cfg.getSafemap() == 1){
			return true;
		}
		
		return true;
	}

	// 濡�?濞村└VP
	private static int checkPvP(long inviterRoleId, long invitedRoleId) {
		// 閸ョ偛绨查柇?鐠�?
		return fire.pb.battle.pvp.PvPTeamHandle.onRespondInvite(inviterRoleId, invitedRoleId);
	}

	//闁�?鐠囧嘲鐡ㄩ崷銊�?灞肩瑬濞屄ょТ閺冭绱甸崣顏囧厴閸︹墥rocedure娑擃叀顫︾拫鍐暏
	private boolean checkInviteExist(long invitedRoleId)
	{
		//閸忓牅绮犻柇?鐠囩柉銆冩稉顓熺叀閹垫崘顕氭禍鐑樻Ц閸氾箒顫﹂柇?鐠�?
		xbean.InviteInfo invite = xtable.Teaminvite.get(invitedRoleId);
		if(invite == null)
			return false;
		else if(!invite.getBeinginvited())
			return false;
		else if((now - invite.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{   //闁�?鐠囩柉绉撮弮?
			invite.setBeinginvited(false);
			cleanTimeoutInvites(invite.getInvited());
			return false;
		}
		else
			return true;
	}
	
	// 鐞氼偊鍊嬬拠鐤�?鍛躬缁�??閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkOnline(long roleId)
	{
		if(StateCommon.isOnline(roleId))
			return true;
		else
			return false;
	}	
	
	
	// 鐞氼偊鍊嬬拠鐤�?鍛矋闂冪喎绱戦崗鍐插嚒閹垫挸绱�?閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
		return true;
	}
	// 鐞氼偊鍊嬬拠鐤�?鍛瑝閸︺劑妲︽导宥勮厬閿涚喎褰ч懗钘夋躬Procedure娑擃叀顫︾拫鍐暏
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
	
	//閺夈儴鍤滈梼鐔剁礊閻ㄥ嫰鍊嬬拠鍑ょ吹閿涘潚alse閺勵垱娼甸懛顏冮嚋娴滅尨绱氶崣顏囧厴閸︹墥rocedure娑擃叀顫︾拫鍐暏
	private boolean checkInviteFromTeam(Long inviterTeamId)
	{
		if(inviterTeamId != null)
			return true;
		else
			return false;
	}
	
	//闁�?鐠囩兘妲︽导宥堢箷鐎涙ê婀敍鐔峰涧閼宠棄婀狿rocedure娑擃叀顫︾拫鍐暏
	private boolean checkInviterTeamExist(xbean.TeamInfo teamInfo)
	{
		if(teamInfo != null)
			return true;
		else
			return false;
	}
	
	//闂冪喍绱為惃鍕�嬬拠铚傝厬鐎涙ê婀潻娆庨嚋闁�?鐠囧嚖绱濋懓灞肩瑬鏉╂ɑ婀搾鍛閿涚喎褰ч懗钘夋躬Procedure娑擃叀顫︾拫鍐暏
	private boolean checkTeamInvitingValid(xbean.TeamInfo teamInfo, long invitedRoleId)
	{
		java.util.Map<Long,Long> invitings = teamInfo.getInvitingids();
	    cleanTimoutInvitings(invitings);
	    if(invitings.get(invitedRoleId) != null)
	    	return true;
	    else
	    	return false;
	}
	//闂冪喍绱為惃鍕眽閺佺増婀潏鎯у煂5娴滅尨绱甸崣顏囧厴閸︹墥rocedure娑擃叀顫︾拫鍐暏
	private boolean checkTeamNotFull(xbean.TeamInfo teamInfo)
	{
		if (teamInfo.getMembers().size() < 4)
			return true;
		else
			return false;
	}
	
/*	//闁�?鐠囩柉?鍛槱娴滃骸褰叉禒銉х矋闂冪喓娈戦悩鑸�?渚婄吹閿涘牓娼捄鎴濇櫌閵嗕線顥ｇ悰灞�?浣稿礋娴滆桨鎹㈤崝锛勭搼閿�?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(StateType.STATE_TEAM))
		{
			TeamManager.logger.info("閻溾晛顔�(roleId=" + inviterRoleId+")婢跺嫪绨稉宥堝厴缂佸嫰妲﹂惃鍕Ц閹�?");
			return true;
		}
		return true;
	}
*/	
	//闁�?鐠囩柉?鍛槱娴滃酣妲︽导宥勮厬閿涚喎褰ч懗钘夋躬Procedure娑擃叀顫︾拫鍐暏
	private boolean checkInviterInTeam(Long inviterTeamId)
	{
		if(inviterTeamId != null)
			return true;
		else
			return false;
	}
	
	// 闁�?鐠囩柉?鍛Ц闂冪喖鏆遍敍鐔峰涧閼宠棄婀狿rocedure娑擃叀顫︾拫鍐暏
	private boolean checkInviterIsLeader(long inviterRoleId , xbean.TeamInfo teamInfo)
	{
		if(teamInfo.getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}
	
	//娑擃亙姹夐柇?鐠囩柉銆冩稉顓犳畱闁�?鐠囧嘲鐡ㄩ崷顭掔吹閸欘亣鍏橀崷鈮抮ocedure娑擃叀鐨熼悽?
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
	
	
	//娴ｈ法甯虹�硅泛娲栭崚鐗堟弓鐞氼偊鍊嬬拠椋庡Ц閹�?,閸氬本妞傞崚鐘绘珟鏉╁洦婀￠柇?鐠�?
	private void deleteInvite(final long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.select(invitedRoleId);
		if(inviteInfo == null)
			return;
		//閸掔娀娅巘eam鐞涖劋鑵戦惃鍒琻viting娣団剝浼呴幋鏍�?鍖癷ngleInvitings娑擃厾娈慽nviting娣団剝浼�
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
		
		//閺囧瓨鏌奿nvites鐞涖劋鑵戦惃鍕繆閹�?
		inviteInfo.setBeinginvited(false);
		cleanTimeoutInvites(inviteInfo.getInvited());
		//婵″倹鐏塱nvited娑擃厺绡冨▽鈩冩箒娴犺缍嶆穱鈩冧紖閿涘苯鍨銈嗘蒋InviteInfo濞屸剝婀佺�涙ê婀惃鍕箑鐟曚緤绱濋崣顖欎簰閸掔娀娅�
		if(inviteInfo.getInvited().size() == 0)
			xtable.Teaminvite.remove(invitedRoleId);
		
		
	}
	
	
	//濞撳懘娅庨柇?鐠囩柉銆冩稉顓犳畱鏉╁洦婀￠柇?鐠�?,閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
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
	
	//濞撳懘娅庨梼鐔剁礊閸滃奔閲滄禍娲�嬬拠鐤�?鍛厬閻ㄥ嫯绻冮張鐔煎�嬬拠?
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


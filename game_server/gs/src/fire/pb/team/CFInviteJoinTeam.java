
package fire.pb.team;

import fire.pb.StateCommon;
import fire.pb.battle.PlayPKManage;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.buff.OperateType;
import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CFInviteJoinTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CFInviteJoinTeam extends __CFInviteJoinTeam__ {
private long now = 0L;//procedure瀵�?婵妞傛穱婵嗙摠娑�?娑擃亜缍嬮崜宥嗘闂傝揪绱濇穱婵婄槈濮濐槚rocedure娑擃厽妞傞梻瀵告畱缂佺喍绔撮幀?
	
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
			return;
		//add by cn 婵″倹鐏夐崷銊ュ礋閹告垵鍠呴弬妤冨Ц閹�?,娑撳秴鍘戠拋绋垮閸忋儰鎹㈡担鏇㈡Е娴�?
		BuffAgent agent = new BuffRoleImpl(inviterRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			if (fire.pb.team.TeamManager.isInTeam(inviterRoleId))
				MessageMgr.sendMsgNotify(inviterRoleId, 141866,  null);
			else 
 			    MessageMgr.sendMsgNotify(inviterRoleId, 141133,  null);
			return;
		}
		
		agent = new BuffRoleImpl(invitedRoleId,true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(inviterRoleId, 141865,  null);
			return;
		}
		mkdb.Procedure createTeamP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				Team team = null;
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(inviterRoleId);
				//閸忓牓鐛欑拠渚�妲︽导宥嗘Ц閸氾缚璐熺粚?,閺夈儱鍠呯�规碍妲搁崥锕傛敚teamlock
				if(teamId != null)
				{//闁夸辜eamlock
					team = new Team(teamId,false);
					if(!team.isTeamLeader(inviterRoleId))
						return true;//妤犲矁鐦夌拠銉潡閼瑰弶妲搁崥锕佺箷閺勵垶妲︽导宥囨畱闂冪喖鏆�
				}
				
				// 閹稿銆庢惔蹇涙敚rolelock閸�? teamlock
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
					//鏉╂柨娲栧☉鍫熶紖鐞氼偊鍊嬬拠椋庢畱閻溾晛顔嶆稉宥呮躬缁�?(illegal)
					TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠椋庢畱閻溾晛顔嶆稉宥呮躬缁�?,RoleId: "+invitedRoleId);
				}
				else if(!checkInviterStatus(inviterRoleId))
				{
					//闁�?鐠囩柉?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�?? 
					MessageMgr.psendMsgNotify(inviterRoleId, 141618, null);
//					psend(inviterRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�??,RoleId: "+inviterRoleId);
				}
				else if(!checkInvitedStatus(invitedRoleId))
				{
					//鐞氼偊鍊嬬拠鐤�?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�?? 
					MessageMgr.psendMsgNotify(inviterRoleId, TeamManager.ERROR_MSG_OBJECT_CANT_IN_TEAM, null);
//					psend(invitedRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛槱娴滃簼绗夐懗鐣岀矋闂冪喓娈戦悩鑸�??,RoleId: "+invitedRoleId);
				}
				else if(!checkInvitedTeamFuctionEnable(invitedRoleId))
				{
					//鐞氼偊鍊嬬拠鐤�?鍛畱缂佸嫰妲﹂崝鐔诲厴濞屸剝婀侀幍鎾崇磻
//					psend(inviterRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					MessageMgr.psendMsgNotify(inviterRoleId, 141201, null);
					TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛畱缂佸嫰妲﹂崝鐔诲厴濞屸剝婀侀幍鎾崇磻,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkInvitedInNoTeam(invitedTeamId))
				{
					//鐞氼偊鍊嬬拠鐤�?鍛躬闂冪喍绱炴稉?
					//psend(inviterRoleId, new STeamError(TeamError.ObjectInTeam));
					TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛躬闂冪喍绱炴稉?,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141191, null);
				}
				else if(!checkNotBeingInvited(invitedRoleId))
				{
					//鐞氼偊鍊嬬拠鐤�?鍛劀閸︺劏顫﹂崗鏈电铂娴滄椽鍊嬬拠铚傝厬 
//					psend(inviterRoleId, new STeamError(TeamError.BeingInvited));
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141202, null);
					TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�?鍛劀閸︺劏顫﹂崗鏈电铂娴滄椽鍊嬬拠铚傝厬,invitedRoleId: "+invitedRoleId);
				}
				else if(!checkNotInvitedIn30s(invitedRoleId, inviterRoleId, inviterTeamId))
				{
					//鐞氼偊鍊嬬拠鐤�??30缁夋帒鍞撮弴鍓х病鐞氼偊妲︽导宥嗗灗閼板懍閲滄禍娲�嬬拠鐤箖
					//psend(inviterRoleId, new STeamError(TeamError.InvitedIn30s));
					TeamManager.logger.debug("FAIL:鐞氼偊鍊嬬拠鐤�??30缁夋帒鍞撮弴鍓х病鐞氼偊妲︽导宥嗗灗閼板懍閲滄禍娲�嬬拠鐤箖,invitedRoleId: "+invitedRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotify(inviterRoleId, 141050, null);
				}
				else if(team != null)
				{
					//Team team = new Team(inviterTeamId,false);
					//閺夈儴鍤滈梼鐔剁礊閻ㄥ嫰鍊嬬拠?
					if(!checkInviterIsLeader(inviterRoleId, team))
					{
						//闁�?鐠囩柉?鍛瑝閺勵垶妲﹂梹?(illegal)
						TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛瑝閺勵垶妲﹂梹?,RoleId: "+inviterRoleId);
					}
					else if(!checkTeamNotFull(team))
					{
						//闁�?鐠囩兘妲︽导宥嗗姬娴�?
						psendWhileCommit(inviterRoleId, new STeamError(TeamError.TeamFull));
						TeamManager.logger.debug("FAIL:闁�?鐠囩兘妲︽导宥嗗姬娴�?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamFilter(team, invitedRoleId))
					{
						TeamManager.logger.debug("FAIL:TeamFilter閸氾箑鍠�,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamInviteNotFull(team))
					{
						//闁�?鐠囩兘妲︽导宥囨畱濮濓絽婀柇?鐠囪渹姹夐弫鎷屾彧閸�?4娑擃亷绱濇稉宥堝厴閸愬秹鍊嬬拠閿嬫纯婢�?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.debug("FAIL:闁�?鐠囩兘妲︽导宥囨畱濮濓絽婀柇?鐠囪渹姹夐弫鎷屾彧閸�?4娑擃亷绱濇稉宥堝厴閸愬秹鍊嬬拠閿嬫纯婢�?,TeamId: "+inviterTeamId);
					}
					else if(!checkTeamLeaderState(inviterRoleId))
					{
						//闁�?鐠囩兘妲︽导宥囨畱濮濓絽婀柇?鐠囪渹姹夐弫鎷屾彧閸�?4娑擃亷绱濇稉宥堝厴閸愬秹鍊嬬拠閿嬫纯婢�?
						//psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.debug("FAIL:闂冪喖鏆辫ぐ鎾冲閻樿埖?浣风瑝閼充粙鍊嬬拠鏋�??");
					}
					else{
						if(!checkMap()){
							return false;
						}
						
						TeamManager.logger.debug("SUCC:濠娐ゅ喕閺夆�叉閿涘苯褰叉禒銉ュ絺閸戞椽妲︽导宥夊�嬬拠? "+inviterTeamId);
						// 濠娐ゅ喕閺夆�叉閿涘苯褰叉禒銉ュ絺閸戞椽妲︽导宥夊�嬬拠?
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = xtable.Properties.get(inviterRoleId).getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 娣囨繂鐡ㄩ柇?鐠�?,鏉╂瑩鍣锋稉宥囨暏鐎规碍妞傞崳顭掔礉閸欘垯浜掔悮顐㈠З閺傜懓绱″〒鍛存珟
						//娣囨繂鐡ㄩ柇?鐠囧嘲鍩岄梼鐔剁礊
						team.getTeamInfo().getInvitingids().put(invitedRoleId,now);
						//娣囨繂鐡ㄩ柇?鐠囧嘲鍩岀悮顐﹀�嬬拠鐤�冮敍灞藉帥閻顫﹂柇?鐠囩柉?鍛畱闁�?鐠囪渹淇婇幁顖涙Ц閸氾箑鍑＄�涙ê婀�
						xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
						if(inviteInfo == null)
						{
							inviteInfo = xbean.Pod.newInviteInfo();
							xtable.Teaminvite.add(invitedRoleId, inviteInfo);
						}
						inviteInfo.setBeinginvited(true);
						inviteInfo.getInviting().setTeamid(inviterTeamId);
						inviteInfo.getInviting().setRoleid(inviterRoleId);
						inviteInfo.getInviting().setInvitetime(now);						
						inviteInfo.getInvited().add(inviteInfo.getInviting().copy());
						psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
						MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
						// 閸欐垿?渚�鍊嬬拠?
						mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);
					}
			
				} else
				{
					//閺夈儴鍤滄稉顏冩眽閻ㄥ嫰鍊嬬拠?
					if(!checkSingleInviteNotFull(inviterRoleId))
					{
						//闁�?鐠囩柉?鍛劀閸︺劑鍊嬬拠铚傛眽閺佹媽鎻崚?4娑擃亷绱濇稉宥堝厴閸愬秹鍊嬬拠閿嬫纯婢�?
						psend(inviterRoleId, new STeamError(TeamError.InviteingsFull));
						TeamManager.logger.debug("FAIL:闁�?鐠囩柉?鍛劀閸︺劑鍊嬬拠铚傛眽閺佹媽鎻崚?4娑擃亷绱濇稉宥堝厴閸愬秹鍊嬬拠閿嬫纯 "+inviterRoleId);
					}
					else if(!checkTeamFilter(inviterRoleId, invitedRoleId))
					{
						TeamManager.logger.debug("FAIL:TeamFilter閸氾箑鍠�,TeamId: "+inviterTeamId);
					}
					else
					{
						
						if(!checkMap()){
							return false;
						}
						
						TeamManager.logger.debug("SUCC:濠娐ゅ喕閺夆�叉閿涘苯褰叉禒銉ュ絺閸戣桨閲滄禍娲�嬬拠? "+inviterRoleId);
						// 濠娐ゅ喕閺夆�叉閿涘苯褰叉禒銉ュ絺閸戣桨閲滄禍娲�嬬拠?
						xbean.Properties inviterProperty = xtable.Properties.get(inviterRoleId);
						SInviteJoinTeam snd = new SInviteJoinTeam();
						snd.op = 0;
						snd.invitername = inviterProperty.getRolename();
						snd.inviterlevel = xtable.Properties.get(inviterRoleId).getLevel();
						// 娣囨繂鐡ㄩ柇?鐠�?,鏉╂瑩鍣锋稉宥囨暏鐎规碍妞傞崳顭掔礉閸欘垯浜掔悮顐㈠З閺傜懓绱″〒鍛存珟
						//娣囨繂鐡ㄩ柇?鐠囧嘲鍩屾稉顏冩眽闁�?鐠囩柉銆�
						xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
						if(singleInvitings == null)
						{
							singleInvitings = xbean.Pod.newSingleInvitings();
							xtable.Singleinviting.add(inviterRoleId, singleInvitings);
						}
						singleInvitings.getInvitingids().put(invitedRoleId, now);
						//娣囨繂鐡ㄩ柇?鐠囧嘲鍩岀悮顐﹀�嬬拠鐤�冮敍灞藉帥閻顫﹂柇?鐠囩柉?鍛畱闁�?鐠囪渹淇婇幁顖涙Ц閸氾箑鍑＄�涙ê婀�
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
						
						// 閸欐垿?渚�鍊嬬拠?
						psendWhileCommit(inviterRoleId, new SInviteJoinSucc(invitedRoleId));
						MessageMgr.psendMsgNotify(inviterRoleId, 142358, null);
						mkdb.Procedure.psendWhileCommit(invitedRoleId, snd);
					}
				}
					
				return true;
			}
			
			private boolean checkMap(){

				//閸欐垼鎹ｆ禍?
				final fire.pb.map.Role  invitMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(inviterRoleId);
				final fire.pb.map.Role  desMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(invitedRoleId);
				if(invitMaprole == null || desMaprole == null){
					return true;
				}
				int srcMapId = invitMaprole.getMapId();
				MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(srcMapId);
				
				int desMapId = desMaprole.getMapId();
				MapConfig descfg = ConfigManager.getInstance().getConf(MapConfig.class).get(desMapId);
				
				//閸︺劌鐣ㄩ崗銊ユ勾閸�? 娑撳秵鐗庢宀�绮嶉梼?
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
	
	// 闁�?鐠囩柉?鍛嫲鐞氼偊鍊嬬拠鐤�?鍛倱閺冭泛婀痪??閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkOnline(long invitedRoleId, long inviterRoleId)
	{
		if(StateCommon.isOnline(invitedRoleId))
			return true;
		else
		{
			//鐎佃鏌熸稉宥呮躬缁�?
			MessageMgr.sendMsgNotify(inviterRoleId, 141701, null);
			return false;
		}
	}	
	
	//闁�?鐠囩柉?鍛槱娴滃骸褰叉禒銉х矋闂冪喓娈戦悩鑸�?渚婄吹閿涘牓娼捄鎴濇櫌閵嗕線顥ｇ悰灞�?浣稿礋娴滆桨鎹㈤崝锛勭搼閿�?
	private boolean checkInviterStatus(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("閻溾晛顔�(roleId=" + inviterRoleId+")婢跺嫪绨稉宥堝厴缂佸嫰妲﹂惃鍕Ц閹�?");
			return false;
		}
		return true;
	}
	
	//鐞氼偊鍊嬬拠鐤�?鍛槱娴滃骸褰叉禒銉х矋闂冪喓娈戦悩鑸�?渚婄吹閿涘牓娼捄鎴濇櫌閵嗕線顥ｇ悰灞�?浣稿礋娴滆桨鎹㈤崝锛勭搼閿�?
	private boolean checkInvitedStatus(long invitedRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(invitedRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("閻溾晛顔�(roleId=" + invitedRoleId+")婢跺嫪绨稉宥堝厴缂佸嫰妲﹂惃鍕Ц閹�?");
			return false;
		}
		return true;
	}
	
	// 鐞氼偊鍊嬬拠鐤�?鍛矋闂冪喎绱戦崗鍐插嚒閹垫挸绱�?閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkInvitedTeamFuctionEnable(long invitedRoleId)
	{
		//缂佸嫰妲﹀?閸�?
//		if(fire.pb.SystemSettingConfig.checkRoleSetting(invitedRoleId, fire.pb.SysSetType.AcceptTeam)<=0)
//			return false;
//		else
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
	
	// 鐞氼偊鍊嬬拠鐤�?鍛梾閺堝顒滈崷銊潶闁�?鐠囧嚖绱甸崣顏囧厴閸︹墥rocedure娑擃叀顫︾拫鍐暏
	private boolean checkNotBeingInvited(long invitedRoleId)
	{
		xbean.InviteInfo inviteInfo = xtable.Teaminvite.get(invitedRoleId);
		
		if (inviteInfo == null)//婵″倹鐏夊▽鈩冩箒鐠佹澘缍嶉敍宀冦�冪粈杞扮矤閺堫亣顫﹂柇?鐠囩柉绻�
			return true;
		if(!inviteInfo.getBeinginvited())
		{
			//婵″倹鐏夊锝呮躬闁�?鐠囪渹缍呮稉绡篴lse閿涘矁鍋楃�规矮绗夋径鍕艾鐞氼偊鍊嬬拠椋庡Ц閹緤绱濆〒鍛存珟鏉╁洦婀￠柇?鐠�?
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else if ((now - inviteInfo.getInviting().getInvitetime()) > TeamManager.MAX_INVITE_TIMEOUT)
		{
			//婢跺嫪绨柇?鐠囬濮搁幀渚婄礉娴ｅ棙妲稿鑼病鐡掑懏妞傞敍宀勬付鐟曚焦娲块弬鎷岊潶闁�?鐠囩柉?鍛Ц閹椒璐熸稉宥咁槱娴滃氦顫﹂柇?鐠囬濮搁幀渚婄礉閸氬本妞傚〒鍛存珟鏉╁洦婀￠柇?鐠�?
			inviteInfo.setBeinginvited(false);
			cleanTimeoutInvites(inviteInfo.getInvited());
			return true;
		}
		else
			return false;
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

	// 鏉╂瑤閲滈柇?鐠囬攱鐥呴張澶庮潶闂冪喍绱為幋鏍�?鍛嚋娴滃搫婀�30缁夋帒鍞撮柇?鐠囩柉绻冮敍鐔峰涧閼宠棄婀狿rocedure娑擃叀顫︾拫鍐暏
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
						continue;// 婵″倹鐏夊鑼病閹垫儳鍩岄敍鍧甧sult == false閿涘绱濈亸杈ㄧ梾韫囧懓顩︽潻娑滎攽閸氬酣娼伴惃鍕灲閺傤厺绨�
					else if (invited.getRoleid() == inviterRoleId)
						result = false;// roleid閻╁摜鐡�
					else if (inviterTeamId != null && invited.getTeamid() == inviterTeamId)
						result = false;// inviterTeamId鐎涙ê婀獮鏈电瑬teamId閻╁摜鐡�
				} else
					timeoutList.add(invited);// 鐡掑懓绻�30缁夋帞娈戞潻鍥︾窗娑�?鐠у嘲鍨归梽?
			}
			inviteInfo.getInvited().removeAll(timeoutList);
			return result;
		}
		else
		{
			return true;
		}
	}
	

	// 闁�?鐠囩柉?鍛Ц闂冪喖鏆遍敍鐔峰涧閼宠棄婀狿rocedure娑擃叀顫︾拫鍐暏
	private boolean checkInviterIsLeader(long inviterRoleId , Team team)
	{
		if(team.getTeamInfo().getTeamleaderid() == inviterRoleId)
			return true;
		else
			return false;
	}

	// 闁�?鐠囩柉?鍛存Е娴煎秳姹夐弫?<5? 閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkTeamNotFull(Team team)
	{
		if (team.getTeamInfo().getMembers().size() < 4)
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
	
	// 闁�?鐠囩柉?鍛存Е娴煎秶娈戦柇?鐠囬攱顐奸弫?<4? 閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkTeamInviteNotFull(Team team)
	{
		//閸忓牊绔婚悶鍡氱箖閺堢喖鍊嬬拠?
		cleanTimoutInvitings(team.getTeamInfo().getInvitingids());
		if (team.getTeamInfo().getInvitingids().size() < 4)
			return true;
		else
			return false;
	}
	
	// 闁�?鐠囩柉?鍛Ц閹椒绗夐崗浣筋啅? 閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkTeamLeaderState(long inviterRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(inviterRoleId);
		return buffagent.canAddBuff(OperateType.TEAM_INVITE);
	}
	
	// 闁�?鐠囩柉?鍛畱闁�?鐠囬攱顐奸弫?<4? 閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkSingleInviteNotFull(long inviterRoleId)
	{
		xbean.SingleInvitings singleInvitings = xtable.Singleinviting.get(inviterRoleId);
		//閸忓牊绔婚悶鍡氱箖閺堢喖鍊嬬拠?
		if(singleInvitings == null)
			return true;
		cleanTimoutInvitings(singleInvitings.getInvitingids());
		if (singleInvitings.getInvitingids().size() < 4)
			return true;
		else
			return false;
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

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794493;

	public int getType() {
		return 794493;
	}

	public long roleid; // 被邀请者角色ID

	public CFInviteJoinTeam() {
	}

	public CFInviteJoinTeam(long _roleid_) {
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
		if (_o1_ instanceof CFInviteJoinTeam) {
			CFInviteJoinTeam _o_ = (CFInviteJoinTeam)_o1_;
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

	public int compareTo(CFInviteJoinTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


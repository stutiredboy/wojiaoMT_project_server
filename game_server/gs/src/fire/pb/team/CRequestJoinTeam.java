
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
 * 璇锋眰鍔犲叆闃熶紞
 * @author changhao
 *
 */
public class CRequestJoinTeam extends __CRequestJoinTeam__ {
	private long now = 0L;//procedure寮?濮嬫椂淇濆瓨涓?涓綋鍓嶆椂闂达紝淇濊瘉姝rocedure涓椂闂寸殑缁熶竴鎬?
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
		
		Long appliedclanfightid = xtable.Roleid2clanfightid.select(roleid);//濡傛灉鐢宠鐨勯槦浼嶅湪鍏細鎴樺満涓? by changhao
		if (appliedclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//濡傛灉鐢宠鑰呭湪鍏細鎴樺満涓? by changhao
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
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//鐢宠鑰呭湪鍏細鎴樺満涓? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(appliedclanfightid))
				{
	 			    MessageMgr.sendMsgNotify(applierclanfightid, 410027,  null);	
	 			    return;
				}				
			}
		}
		
		TeamManager.logger.debug("瑙掕壊锛圛d = " +applierRoleId+"锛夌敵璇? 鍏ラ槦");
		//add by cn 濡傛灉鍦ㄥ崟鎸戝喅鏂楃姸鎬?,涓嶅厑璁稿姞鍏ヤ换浣曢槦浼?
		BuffAgent agent = new BuffRoleImpl(applierRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141133,  null);
			return;
		}

		PropRole applierprop = new PropRole(applierRoleId, true);
		if(applierprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:鐢宠鍏ラ槦鑰?" + applierRoleId + "鍦ㄥ贰娓哥姸鎬?,姝ゆ椂涓嶈兘鐢宠鍏ラ槦");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
			return;
		}
		
		PropRole leaderprop = new PropRole(roleid, true);
		if(leaderprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:闃熶紞闃熼暱" + roleid + "鐢宠浜?" + applierRoleId + "闃熶紞闃熼暱姝ｅ湪宸℃父鐘舵??,涓嶈兘鐢宠鍏ラ槦");
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
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?
				if(teamId != null)
					team = new Team(teamId,false);
				else
				{
					//瀵规柟涓嶅湪闃熶紞涓?
					//psend(applierRoleId, new STeamError(TeamError.ObjectNotInTeam));
					//TeamManager.logger.debug("FAIL:鐢宠澶辫触锛屽鏂逛笉鍦ㄩ槦浼嶄腑,roleid"+ roleid);
										
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150035, null);					
					return true;
				}
				if(!team.isInTeam(roleid))
					return true;//楠岃瘉璇ヨ鑹叉槸鍚﹁繕鍦ㄩ槦浼嶄腑
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
					//鐢宠鑰呬笉鍦ㄧ嚎(illegal)
					TeamManager.logger.debug("FAIL:鐢宠鑰呬笉鍦ㄧ嚎,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierNotInTeam(applierRoleId))
				{
					//鐢宠鑰呭湪闃熶紞涓?(illegal)
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 140855, null);
					TeamManager.logger.debug("FAIL:鐢宠鑰呭湪闃熶紞涓?,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierStatusValid(applierRoleId))
				{
					//鐢宠鑰呭浜庝笉鑳界敵璇风粍闃熺殑鐘舵?侊紵锛堥琛岋紝璺戝晢锛屾憜鎽婏紝鎶ら?佺瓑锛?
					psend(applierRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:鐢宠鑰呭浜庝笉鑳界敵璇风粍闃熺殑鐘舵?侊紵锛堥琛岋紝璺戝晢锛屾憜鎽婏紝鎶ら?佺瓑锛?,applierRoleId"+ applierRoleId);
				}
				else if(!checkLeaderTeamFuncEnable(leaderRoleId))
				{
					//闃熼暱缁勯槦寮?鍏虫湭鎵撳紑
					//psend(applierRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141201, null);
					TeamManager.logger.debug("FAIL:闃熼暱缁勯槦寮?鍏虫湭鎵撳紑,leaderRoleId"+ leaderRoleId);
				}
				else if(!checkTeamNotFull(team))
				{
					//闃熶紞浜烘暟宸叉弧
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 145045, 0, null);
					TeamManager.logger.debug("FAIL:闃熶紞浜烘暟宸叉弧,teamId"+ teamId);
				}
				else if(!checkTeamFilter(team,applierRoleId))
				{
					TeamManager.logger.debug("FAIL:TeamFilter鍚﹀喅,TeamId: "+teamId);
				}
				else if(team.isApplyListFull())
				{
					//闃熶紞鐢宠鍒楄〃宸叉弧锛?15涓級
					psend(applierRoleId, new STeamError(TeamError.ApplyListFull));
					TeamManager.logger.debug("FAIL:闃熶紞鐢宠鍒楄〃宸叉弧锛?15涓級,teamId"+ teamId);
				}
				else if(team.getTeamInfo().getApplierids().containsKey(applierRoleId))
				{
					//鐢宠鑰呮鍦ㄨ闃熶紞鐢宠鍒楄〃涓?
					psend(applierRoleId, new STeamError(TeamError.AlreadyApply));
					TeamManager.logger.debug("FAIL:鐢宠鑰呮鍦ㄨ闃熶紞鐢宠鍒楄〃涓?,teamId"+ teamId);
				}
				else if(!checkLevelRequirementValid(team, applierRoleId))
				{
					//鐢宠鑰呮湭杈惧埌闃熶紞绾у埆瑕佹眰
					//psend(applierRoleId, new STeamError(TeamError.ApplierLevelValid));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141207, null);
					TeamManager.logger.debug("FAIL:鐢宠鑰呮湭杈惧埌闃熶紞绾у埆瑕佹眰,applierRoleId"+ applierRoleId);
				}
				else{
					
					boolean inWaiting1 = false;
					boolean inWaiting = false;
					//鍙戣捣浜?
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
						
					//妫?鏌ョ敵璇疯?呮槸鍚︽弧瓒宠繖涓槦浼嶈嚜鍔ㄥ尮閰嶇殑闇?姹? by changhao
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

					//鍚戦槦闀挎洿鏂扮敵璇峰垪琛?
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
					//鍚戠敵璇疯?呰繑鍥炴垚鍔熶俊鎭?
					SRequestJoinSucc sRequestJoinSucc = new SRequestJoinSucc();
					xbean.Properties leaderProperty = xtable.Properties.get(leaderRoleId);
					sRequestJoinSucc.rolename = leaderProperty.getRolename();
					psendWhileCommit(applierRoleId, sRequestJoinSucc);

					java.util.ArrayList<String> param = new java.util.ArrayList<String>();
					param.add(sRequestJoinSucc.rolename);
					
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150041, param);
					
					TeamManager.logger.debug("SUCC:婊¤冻鏉′欢锛岄槦浼嶅彲浠ユ帴鍙楃敵璇疯??,teamId"+ teamId);
				}
				return true;
			}
		};
		requestJoinTeamP.submit();
	}

	// 妫?娴婸VP
	private static int checkPvP(long targetRoleId, long selfRoleId) {
		// 鐢宠鍔犲叆鍒汉闃熶紞
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestJoinTeam(targetRoleId, selfRoleId);
	}

	//鐢宠鑰呭湪绾匡紵
	private boolean checkOnline(long roleId)
	{
		if(xtable.Roleonoffstate.get(roleId) == fire.pb.state.State.ENTRY_STATE)
			return true;
		else
			return false;
	}
	
	//鐢宠鑰呬笉鍦ㄩ槦浼嶄腑锛?
	private boolean checkApplierNotInTeam(long applierRoleId)
	{
		if(xtable.Roleid2teamid.get(applierRoleId) == null)
			return true;
		else
			return false;
	}
	
	//鐢宠鑰呭浜庤兘鐢宠缁勯槦鐨勭姸鎬侊紵锛堥琛岋紝璺戝晢锛屾憜鎽婏紝鎶ら?佺瓑涓嶈兘缁勯槦锛?
	private boolean checkApplierStatusValid(long applierRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(applierRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("鐜╁(roleId=" + applierRoleId+")澶勪簬涓嶈兘缁勯槦鐨勭姸鎬?");
			return true;
		}
		return true;
	}
	
	
	//闃熼暱缁勯槦寮?鍏虫墦寮?锛?
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
	
	//闃熶紞浜烘暟鏈弧锛?
	private boolean checkTeamNotFull(Team team)
	{
		if(team.getTeamInfo().getMembers().size() < TeamManager.MAX_MEMBER_COUNT)
			return true;
		else
			return false;
	}
	
	//鐢宠鑰呰揪鍒伴槦浼嶇骇鍒姹傦紵
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



package fire.pb.battle.livedie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fire.pb.PropRole;
import fire.pb.StateCommon;
import fire.pb.battle.pvp.PvPHelperManager;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.talk.MessageMgr;
import fire.pb.team.PAbsentReturnTeam;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.title.COffTitle;
import fire.pb.util.MessageUtil;

import org.apache.log4j.Logger;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptLiveDieBattle extends __CAcceptLiveDieBattle__ {
	@Override
	protected void process() {
		// npcå¤åºæå¼æ?
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//å¤æ­ä¸æä¹¦çäººæ¯å¦å­å?
		Long hostid=xtable.Livedie2key.select(guestid);
		//å¤æ­æ¯å¦æä¸æä¹¦çäºº
		if(hostid==null){
			//æç¤ºæ²¡æç»ä½ ä¸æä¹¦çäº?162079
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162079, null);
			return ;
		}
		//è·å¾ä¸æä¹¦ä¿¡æ¯ï¼å¤æ­æ¯å¦è¿æ
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			logger.info("æä¹¦å·²ç»è¿æäº?");
			return ;
		}
		
		//å¤æ­ç©å®¶æ¯å¦å¨çº¿
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		//å¤æ­èªå·±æ¯å¦å¨å¯æ¬ï¼å¨å¯æ¬æ æ³åéè¯·æ±?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162002, null);
			return ;
		}
		xbean.Properties guestprop=xtable.Properties.select(guestid);
		//ç«æåºå°å¾æ æ³?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162121, null);
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162130, Arrays.asList(guestprop.getRolename()));
			return ;
		}
		//å¤æ­ä¸æä¹¦çç©å®¶æ¯å¦å¨æææèè§æ?
		BuffAgent hostAgent = new BuffRoleImpl(hostid, true);
		if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(guestid, 162132, null);
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162130, Arrays.asList(guestprop.getRolename()));
			return ;
		}
		if (hostAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 144999, 0, null);
			return ;
		}
		//å¤æ­å¯¹æ¹æ¯å¦å¨çº¿
		if (!StateCommon.isOnlineBuffer(hostid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		int isteamfight=0;
		
		//å¤æ­ææç±»åï¼æ¯ç»éè¿æ¯åäºº
		if(hostliveDieRoleInfo.getSelecttype()==1){//ç»é
			isteamfight=1;
			//å¦ææ¯ç»éï¼é?è¦å¤æ­å½åéä¼æ¯å¦é½æ¯éé?
			//ç»éå³æ,åèµ·äººä¸æ¯éé¿æ¶,æ¥åäººç¹å»å¼æ?,æ¥åäººä¼æç¤ºåèµ·äººä¸æ¯éé?,åèµ·äººä¼æç¤ºæ¥åäººå·²ç»æ¥åå³æ?,è¯·æä¸ºéé?
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam==null){
				//æç¤ºåèµ·äººï¼æä¸ºéé¿
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			if(hostteam.getTeamLeaderId()!=hostid){
				//æç¤ºåèµ·äººï¼æä¸ºéé¿
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			//å¤æ­éä¼ä¸­çæåæ¯å¦ç¬¦åè¦æ±
			if(isTeamCanFight(hostteam,hostid)==false){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			if(guestteam==null){
				//ä¸æ¯éé¿ï¼æ æ³åºæ?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//å¤æ­æ¯å¦æ¯éé?
			if(guestteam.getTeamLeaderId()!=guestid){
				//ä¸æ¯éé¿ï¼æ æ³åºæ?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//å¤æ­éä¼ä¸­çæåæ¯å¦ç¬¦åè¦æ±
			if(isTeamCanFight(guestteam,guestid)==false){
				return ;
			}
			//å¦ææéä¼ï¼æç¦»ç¶æ?ä¹ä¸è½å¼?æ?
			if(hostteam.getAbsentMemberIds().contains(hostid)){
				//æç¤ºåèµ·äººï¼æä¸ºéé¿
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162080, null);
				return ;
			}
			if(guestteam.getAbsentMemberIds().contains(guestid)){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			
		}else{
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			if(guestteam!=null){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162112, null);
				return ;
			}
			//åäººæä¹¦å¿é¡»é½æ¯åäººæè½åå 
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam!=null&&hostteam.getFighterMemberIds().contains(hostid)){
				//ç´æ¥æç®æ ç©å®¶æç¦»äº
				//å¦ææéä¼å°±æç¦»éä¼
				new PAbsentReturnTeam(hostid, 1).submit();
			}
		}

		new PLiveDieBattle(hostid,guestid,isteamfight).submit();
		
	}
	
	/**
	 * å¤æ­éä¼ä¸­çæåæ¯å¦ç¬¦åè¦æ±
	 * @param guestteam
	 * @param guestid  é?è¦æç¤ºæ¶æ¯çç®æ id
	 * @return
	 */
	public boolean isTeamCanFight(Team guestteam,long guestid){
		//å¤æ­å½åéä¼ä¸­çç©å®¶ç­çº§æ¯å¦ç¬¦åè¦æ±ï¼æ¯å¦æä¸è¿æä¹¦æè?è¢«å¤±è´¥
		List<Long> guestlevelLess50 = new ArrayList<Long>();
		List<Long> guestfightLess50 = new ArrayList<Long>();
		
		List<Long> guestmembers = guestteam.getNormalMemberIds();
		for (long mem : guestmembers) {
			PropRole guestrole = new PropRole(mem, true);
			if (guestrole.getLevel() < LiveDieMange.getLiveDieLevel()) {
				//æç¤ºéä¼ä¸­æç­çº§ä¸ç¬¦åè¦æ±ç
				guestlevelLess50.add(mem);
			}
			//èº«ä¸æçæ­»æç§°å·
			if(COffTitle.isLiveDieTitle(guestrole)){
				//æç¤ºéä¼ä¸­æèº«ä¸æçæ­»æç§°å·
				guestfightLess50.add(mem);
			}
		}
		if (!guestlevelLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestlevelLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//æç¤ºéä¼ä¸­æç­çº§ä¸ç¬¦åè¦æ±ç
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162119,paras);
			return false;
		}
		if (!guestfightLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestfightLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//æç¤ºéä¼ä¸­æèº«ä¸æçæ­»æç§°å·
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162118,paras);
			return false;
		}
		return true;
	}
	
	
	public static final Logger logger = Logger.getLogger("BATTLE");
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793839;

	public int getType() {
		return 793839;
	}


	public CAcceptLiveDieBattle() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptLiveDieBattle) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptLiveDieBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


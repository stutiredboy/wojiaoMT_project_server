
package fire.pb.battle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.lang.Math;

import gnet.link.Onlines;
import fire.pb.GameSystemConfig;
import fire.pb.PropRole;
import fire.pb.StateCommon;
import fire.pb.SysConfigType;
import fire.pb.battle.pvp.PvPHelperManager;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.main.ConfigManager;
import fire.pb.map.GridPos;
import fire.pb.map.MapConfig;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.scene.AreaInfo;
import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.MapUtil;
import fire.pb.main.ConfigManager;
import fire.pb.battle.SPKDrop;
import org.apache.log4j.Logger;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationPlayPK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationPlayPK extends __CInvitationPlayPK__ {
	public static final Map<Integer, SPKDrop> PKDropConfig_CFGS = ConfigManager.getInstance().getConf(SPKDrop.class);
	static private final Logger logger = Logger.getLogger("BATTLE");
	@Override
	protected void process() {
		// protocol handle
		//閭?璇峰垏纾?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid<0){
			return;
		}
		//鑷繁涓嶈兘閭?璇疯嚜宸?
		if(hostid==objectid){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		//鍒ゆ柇濡傛灉鏈夐槦浼嶏紝涓嶆槸闃熼暱鏃犳硶閭?璇?
		Team hostTeam = TeamManager.selectTeamByRoleId(hostid);
		if (hostTeam != null && hostTeam.isNormalMember(hostid)){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120061, 0, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		
		//鍒ゆ柇鐩爣鏄惁鏈夐槦浼嶏紝闇?瑕佽?冭檻鐩爣鍦ㄩ槦浼嶄腑鐨勭姸鎬?
		Team guestteam = TeamManager.selectTeamByRoleId(objectid);
		if(guestteam!=null){
			//鍒ゆ柇鏄惁鍦ㄩ槦浼嶄腑锛屽鏋滃湪闃熶紞涓渶瑕佹浛鎹㈤槦闀跨殑id
			if(guestteam.isNormalMember(objectid)){
				objectid = guestteam.getTeamLeaderId();
			}
		}
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null)
			return ;
		
		Role gRole = RoleManager.getInstance().getRoleByID(objectid);
		if (gRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return ;
		}
		if(hostTeam != null && guestteam == null )
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,194038, null);
			return;
		}
		//鍒ゆ柇鑷繁鏄惁鍦ㄥ壇鏈紝鍦ㄥ壇鏈棤娉曞彂閫佽姹?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return ;
		}
		//绔炴妧鍦哄湴鍥炬棤娉曞垏纾?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return ;
		}

		// 鍒ゆ柇鏄惁鍦ㄥ畨鍏ㄥ湴鍥句腑
		if(hostRole.getMapId() == PKDropConfig_CFGS.get(1).safeMapid)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
		}
		
		//鍒ゆ柇鑷繁鏄惁鍦ㄦ垬鏂楁垨鑰呰鎴?
		BuffAgent hostAgent = new BuffRoleImpl(hostid, true);
		if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 160494, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		xbean.Properties hostprop=xtable.Properties.select(hostid);
		if(hostprop.getCruise() > 0 ) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162102, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return ;
		}
		
		if (hostAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		
		//鍒ゆ柇瀵规柟鏄惁鍦ㄧ嚎
		if (!StateCommon.isOnlineBuffer(objectid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		xbean.Properties guestprop=xtable.Properties.select(objectid);
		if(guestprop.getCruise() > 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162103, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return ;
		}
		
		// 鍒ゆ柇涓よ?呬箣闂寸殑璺濈
		if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(hostid, objectid)){
            fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120063, 0, null);
            sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
            return ;
		}
		
		//鍒ゆ柇鏄惁鏄竴涓槦浼嶇殑鎴愬憳
		if (guestteam != null){
			if(guestteam.getTeamLeaderId()==hostid){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//鎻愮ず涓嶈兘閭?璇峰悓缁勯槦鍛?
				sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
				return;
			}
			if(hostTeam!=null){
				if(guestteam.getTeamId()==hostTeam.getTeamId()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//鎻愮ず涓嶈兘閭?璇峰悓缁勯槦鍛?
					sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
					return;
				}
			}
		}
		//鍒ゆ柇绛夌骇
		if(hostTeam!=null){
			List<Long> hostteamMembers = hostTeam.getNormalMemberIds();
			for (Long mem : hostteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162001 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
					return ;
				}
			}
		}else{
			//鑷繁绛夌骇涓嶈冻锛屾棤娉曢個璇?
			PropRole propRole = new PropRole(hostid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162000 ,null);
				sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
				return ;
			}
		}
		if(guestteam!=null){
			List<Long> guestteamMembers = guestteam.getNormalMemberIds();
			for (Long mem : guestteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160322 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
					return ;
				}
			}
		}else{
			//鐩爣绛夌骇涓嶈冻锛屾棤娉曢個璇?
			PropRole propRole = new PropRole(objectid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160491 ,null);
				sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
				return ;
			}
		}
		// 濡傛灉寮篜鐨勪汉鏈夊ぇ浜庤寮篜鐨勪汉20绾х殑鍒欎笉浜堝己P
		if(hostRole != null && gRole != null )
		{
			int levelLimit = PKDropConfig_CFGS.get(1).levelLimit;
			PropRole role = new PropRole(hostid, true);
			PropRole guestrole = new PropRole(objectid, true);
			if ( Math.abs(role.getLevel() - guestrole.getLevel()) >= levelLimit) {
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 194037 ,null);
				sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
				return ;
			}
		}
		
		
		//鍒ゆ柇鐩爣鏄惁鍦ㄦ甯稿湴鍥?
		MapConfig cfg2 = ConfigManager.getInstance().getConf(MapConfig.class).get(gRole.getMapId());
		if(cfg2.dynamic ==1){
			//鎻愮ず鐩爣鐜╁涓嶅湪姝ｅ父鍦板浘
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,140436, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return ;
		}
		//鍒ゆ柇鏄惁鍦ㄦ垬鏂楁垨鑰呰鎴?     瀵规柟鍦ㄦ垬鏂楀拰瑙傛垬涓嶈兘鍙戦?侀個璇?
		BuffAgent guestAgent = new BuffRoleImpl(objectid, true);
		if (guestAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 144987, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		if (guestAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
			return;
		}
		//鍒ゆ柇鏄惁閮藉湪鎿傚彴锛屽鏋滃湪鎿傚彴鐩存帴鍒囩锛屽鏋滀笉鏄湪鎿傚彴闇?瑕佸垽鏂窛绂伙紝骞朵笖鏄惁鍦ㄥ悓灞?
		GridPos hpos = hostRole.getPos().toGridPos();
		AreaInfo hareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), hpos.getX(), hpos.getY());
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(hareaInfo!=null&&hareaInfo.isQiecuoArea()&&gareaInfo!=null&&gareaInfo.isQiecuoArea()){
			//閮芥槸鍦ㄦ搨鍙帮紝鐩存帴璧板垏纾嬮?昏緫
			new PSendInvitePlayPK(hostid,objectid).submit();
		}
		else{
			//鍒ゆ柇瀵规柟鏄惁鍏抽棴鍒囩
			Integer refQcVal = GameSystemConfig.getSysConfig(objectid, SysConfigType.refuseqiecuo);
			if(refQcVal != null && refQcVal.intValue() == 1){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid,160426 , null);
				sendremoveTickTime(hostid);//閫氱煡瀹㈡埛绔彇娑堝畾鏃跺櫒
				return;
			}
			PropRole propRole = new PropRole(hostid, true);
			String roleName=propRole.getName();//鐜╁鍚嶇О
			int roleLv=propRole.getLevel();//绛夌骇
			int curTeamNum=0;//褰撳墠闃熶紞浜烘暟
			//鍙戦?侀個璇?
			SInvitationPlayPK sInvitationPlayPK = new SInvitationPlayPK();
			//160422	5	鐜╁$parameter1$($parameter2$绾?)閭?璇蜂笌浣犲垏纾?	鍒囩鎻愮ず
			//160423	5	$parameter1$闃熶紞($parameter2$绾?,$parameter3$/5)閭?璇蜂笌浣犲垏纾?	鍒囩鎻愮ず
			if (hostTeam != null){
				//濡傛灉涓嶆槸闃熼暱锛屾殏绂荤殑浜鸿涓烘槸鍗曚汉
				if(!hostTeam.isAbsentMember(hostid)){
					curTeamNum=hostTeam.getNormalMemberIds().size();
				}
			}
			sInvitationPlayPK.sourceid=hostid;
			sInvitationPlayPK.rolelevel=roleLv;
			sInvitationPlayPK.rolename=roleName;
			sInvitationPlayPK.teamnum=curTeamNum;
			Onlines.getInstance().send(objectid, sInvitationPlayPK);
		}
		
	}
	

	/**
	 * 鍙戦?佸鎴风锛岃瀹㈡埛绔彇娑堝畾鏃跺櫒
	 * @param roleid
	 */
	public static void sendremoveTickTime(long roleid){
		SInvitationPlayPKResult sInvitationPlayPKResult=new SInvitationPlayPKResult();
		gnet.link.Onlines.getInstance().send(roleid, sInvitationPlayPKResult);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793687;

	public int getType() {
		return 793687;
	}

	public long objectid;

	public CInvitationPlayPK() {
	}

	public CInvitationPlayPK(long _objectid_) {
		this.objectid = _objectid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(objectid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		objectid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationPlayPK) {
			CInvitationPlayPK _o_ = (CInvitationPlayPK)_o1_;
			if (objectid != _o_.objectid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)objectid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(objectid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInvitationPlayPK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(objectid - _o_.objectid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
		//�?请切�?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid<0){
			return;
		}
		//自己不能�?请自�?
		if(hostid==objectid){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		//判断如果有队伍，不是队长无法�?�?
		Team hostTeam = TeamManager.selectTeamByRoleId(hostid);
		if (hostTeam != null && hostTeam.isNormalMember(hostid)){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120061, 0, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		
		//判断目标是否有队伍，�?要�?�虑目标在队伍中的状�?
		Team guestteam = TeamManager.selectTeamByRoleId(objectid);
		if(guestteam!=null){
			//判断是否在队伍中，如果在队伍中需要替换队长的id
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
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return ;
		}
		if(hostTeam != null && guestteam == null )
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,194038, null);
			return;
		}
		//判断自己是否在副本，在副本无法发送请�?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return ;
		}
		//竞技场地图无法切�?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return ;
		}

		// 判断是否在安全地图中
		if(hostRole.getMapId() == PKDropConfig_CFGS.get(1).safeMapid)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
		}
		
		//判断自己是否在战斗或者观�?
		BuffAgent hostAgent = new BuffRoleImpl(hostid, true);
		if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 160494, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		xbean.Properties hostprop=xtable.Properties.select(hostid);
		if(hostprop.getCruise() > 0 ) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162102, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return ;
		}
		
		if (hostAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		
		//判断对方是否在线
		if (!StateCommon.isOnlineBuffer(objectid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		xbean.Properties guestprop=xtable.Properties.select(objectid);
		if(guestprop.getCruise() > 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162103, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return ;
		}
		
		// 判断两�?�之间的距离
		if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(hostid, objectid)){
            fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120063, 0, null);
            sendremoveTickTime(hostid);//通知客户端取消定时器
            return ;
		}
		
		//判断是否是一个队伍的成员
		if (guestteam != null){
			if(guestteam.getTeamLeaderId()==hostid){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//提示不能�?请同组队�?
				sendremoveTickTime(hostid);//通知客户端取消定时器
				return;
			}
			if(hostTeam!=null){
				if(guestteam.getTeamId()==hostTeam.getTeamId()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//提示不能�?请同组队�?
					sendremoveTickTime(hostid);//通知客户端取消定时器
					return;
				}
			}
		}
		//判断等级
		if(hostTeam!=null){
			List<Long> hostteamMembers = hostTeam.getNormalMemberIds();
			for (Long mem : hostteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162001 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//通知客户端取消定时器
					return ;
				}
			}
		}else{
			//自己等级不足，无法邀�?
			PropRole propRole = new PropRole(hostid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162000 ,null);
				sendremoveTickTime(hostid);//通知客户端取消定时器
				return ;
			}
		}
		if(guestteam!=null){
			List<Long> guestteamMembers = guestteam.getNormalMemberIds();
			for (Long mem : guestteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160322 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//通知客户端取消定时器
					return ;
				}
			}
		}else{
			//目标等级不足，无法邀�?
			PropRole propRole = new PropRole(objectid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160491 ,null);
				sendremoveTickTime(hostid);//通知客户端取消定时器
				return ;
			}
		}
		// 如果强P的人有大于被强P的人20级的则不予强P
		if(hostRole != null && gRole != null )
		{
			int levelLimit = PKDropConfig_CFGS.get(1).levelLimit;
			PropRole role = new PropRole(hostid, true);
			PropRole guestrole = new PropRole(objectid, true);
			if ( Math.abs(role.getLevel() - guestrole.getLevel()) >= levelLimit) {
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 194037 ,null);
				sendremoveTickTime(hostid);//通知客户端取消定时器
				return ;
			}
		}
		
		
		//判断目标是否在正常地�?
		MapConfig cfg2 = ConfigManager.getInstance().getConf(MapConfig.class).get(gRole.getMapId());
		if(cfg2.dynamic ==1){
			//提示目标玩家不在正常地图
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,140436, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return ;
		}
		//判断是否在战斗或者观�?     对方在战斗和观战不能发�?�邀�?
		BuffAgent guestAgent = new BuffRoleImpl(objectid, true);
		if (guestAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 144987, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		if (guestAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//通知客户端取消定时器
			return;
		}
		//判断是否都在擂台，如果在擂台直接切磋，如果不是在擂台�?要判断距离，并且是否在同�?
		GridPos hpos = hostRole.getPos().toGridPos();
		AreaInfo hareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), hpos.getX(), hpos.getY());
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(hareaInfo!=null&&hareaInfo.isQiecuoArea()&&gareaInfo!=null&&gareaInfo.isQiecuoArea()){
			//都是在擂台，直接走切磋�?�辑
			new PSendInvitePlayPK(hostid,objectid).submit();
		}
		else{
			//判断对方是否关闭切磋
			Integer refQcVal = GameSystemConfig.getSysConfig(objectid, SysConfigType.refuseqiecuo);
			if(refQcVal != null && refQcVal.intValue() == 1){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid,160426 , null);
				sendremoveTickTime(hostid);//通知客户端取消定时器
				return;
			}
			PropRole propRole = new PropRole(hostid, true);
			String roleName=propRole.getName();//玩家名称
			int roleLv=propRole.getLevel();//等级
			int curTeamNum=0;//当前队伍人数
			//发�?�邀�?
			SInvitationPlayPK sInvitationPlayPK = new SInvitationPlayPK();
			//160422	5	玩家$parameter1$($parameter2$�?)�?请与你切�?	切磋提示
			//160423	5	$parameter1$队伍($parameter2$�?,$parameter3$/5)�?请与你切�?	切磋提示
			if (hostTeam != null){
				//如果不是队长，暂离的人认为是单人
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
	 * 发�?�客户端，让客户端取消定时器
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


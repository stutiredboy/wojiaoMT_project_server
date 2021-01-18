
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
		//闁�?鐠囧嘲鍨忕壕?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid<0){
			return;
		}
		//閼奉亜绻佹稉宥堝厴闁�?鐠囩柉鍤滃?
		if(hostid==objectid){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		//閸掋倖鏌囨俊鍌涚亯閺堝妲︽导宥忕礉娑撳秵妲搁梼鐔兼毐閺冪姵纭堕柇?鐠�?
		Team hostTeam = TeamManager.selectTeamByRoleId(hostid);
		if (hostTeam != null && hostTeam.isNormalMember(hostid)){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120061, 0, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		
		//閸掋倖鏌囬惄顔界垼閺勵垰鎯侀張澶愭Е娴煎稄绱濋棁?鐟曚浇?鍐閻╊喗鐖ｉ崷銊╂Е娴煎秳鑵戦惃鍕Ц閹�?
		Team guestteam = TeamManager.selectTeamByRoleId(objectid);
		if(guestteam!=null){
			//閸掋倖鏌囬弰顖氭儊閸︺劑妲︽导宥勮厬閿涘苯顩ч弸婊冩躬闂冪喍绱炴稉顓㈡付鐟曚焦娴涢幑銏ゆЕ闂�璺ㄦ畱id
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
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return ;
		}
		if(hostTeam != null && guestteam == null )
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,194038, null);
			return;
		}
		//閸掋倖鏌囬懛顏勭箒閺勵垰鎯侀崷銊ュ閺堫剨绱濋崷銊ュ閺堫剚妫ゅ▔鏇炲絺闁浇顕Ч?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return ;
		}
		//缁旂偞濡ч崷鍝勬勾閸ョ偓妫ゅ▔鏇炲瀼绾�?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return ;
		}

		// 閸掋倖鏌囬弰顖氭儊閸︺劌鐣ㄩ崗銊ユ勾閸ュ彞鑵�
		if(hostRole.getMapId() == PKDropConfig_CFGS.get(1).safeMapid)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
		}
		
		//閸掋倖鏌囬懛顏勭箒閺勵垰鎯侀崷銊﹀灛閺傛鍨ㄩ懓鍛邦潎閹�?
		BuffAgent hostAgent = new BuffRoleImpl(hostid, true);
		if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 160494, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		xbean.Properties hostprop=xtable.Properties.select(hostid);
		if(hostprop.getCruise() > 0 ) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162102, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return ;
		}
		
		if (hostAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		
		//閸掋倖鏌囩�佃鏌熼弰顖氭儊閸︺劎鍤�
		if (!StateCommon.isOnlineBuffer(objectid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		xbean.Properties guestprop=xtable.Properties.select(objectid);
		if(guestprop.getCruise() > 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162103, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return ;
		}
		
		// 閸掋倖鏌囨稉銈�?鍛闂傚娈戠捄婵堫瀲
		if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(hostid, objectid)){
            fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120063, 0, null);
            sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
            return ;
		}
		
		//閸掋倖鏌囬弰顖氭儊閺勵垯绔存稉顏堟Е娴煎秶娈戦幋鎰喅
		if (guestteam != null){
			if(guestteam.getTeamLeaderId()==hostid){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//閹绘劗銇氭稉宥堝厴闁�?鐠囧嘲鎮撶紒鍕Е閸�?
				sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
				return;
			}
			if(hostTeam!=null){
				if(guestteam.getTeamId()==hostTeam.getTeamId()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//閹绘劗銇氭稉宥堝厴闁�?鐠囧嘲鎮撶紒鍕Е閸�?
					sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
					return;
				}
			}
		}
		//閸掋倖鏌囩粵澶岄獓
		if(hostTeam!=null){
			List<Long> hostteamMembers = hostTeam.getNormalMemberIds();
			for (Long mem : hostteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162001 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
					return ;
				}
			}
		}else{
			//閼奉亜绻佺粵澶岄獓娑撳秷鍐婚敍灞炬￥濞夋洟鍊嬬拠?
			PropRole propRole = new PropRole(hostid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162000 ,null);
				sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
				return ;
			}
		}
		if(guestteam!=null){
			List<Long> guestteamMembers = guestteam.getNormalMemberIds();
			for (Long mem : guestteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160322 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
					return ;
				}
			}
		}else{
			//閻╊喗鐖ｇ粵澶岄獓娑撳秷鍐婚敍灞炬￥濞夋洟鍊嬬拠?
			PropRole propRole = new PropRole(objectid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160491 ,null);
				sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
				return ;
			}
		}
		// 婵″倹鐏夊绡滈惃鍕眽閺堝銇囨禍搴ゎ潶瀵瘻閻ㄥ嫪姹�20缁狙呮畱閸掓瑤绗夋禍鍫濆繁P
		if(hostRole != null && gRole != null )
		{
			int levelLimit = PKDropConfig_CFGS.get(1).levelLimit;
			PropRole role = new PropRole(hostid, true);
			PropRole guestrole = new PropRole(objectid, true);
			if ( Math.abs(role.getLevel() - guestrole.getLevel()) >= levelLimit) {
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 194037 ,null);
				sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
				return ;
			}
		}
		
		
		//閸掋倖鏌囬惄顔界垼閺勵垰鎯侀崷銊︻劀鐢婀撮崶?
		MapConfig cfg2 = ConfigManager.getInstance().getConf(MapConfig.class).get(gRole.getMapId());
		if(cfg2.dynamic ==1){
			//閹绘劗銇氶惄顔界垼閻溾晛顔嶆稉宥呮躬濮濓絽鐖堕崷鏉挎禈
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,140436, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return ;
		}
		//閸掋倖鏌囬弰顖氭儊閸︺劍鍨弬妤佸灗閼板懓顫囬幋?     鐎佃鏌熼崷銊﹀灛閺傛鎷扮憴鍌涘灛娑撳秷鍏橀崣鎴�?渚�鍊嬬拠?
		BuffAgent guestAgent = new BuffRoleImpl(objectid, true);
		if (guestAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 144987, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		if (guestAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
			return;
		}
		//閸掋倖鏌囬弰顖氭儊闁棄婀幙鍌氬酱閿涘苯顩ч弸婊冩躬閹垮倸褰撮惄瀛樺复閸掑洨顥愰敍灞筋洤閺嬫粈绗夐弰顖氭躬閹垮倸褰撮棁?鐟曚礁鍨介弬顓＄獩缁備紮绱濋獮鏈电瑬閺勵垰鎯侀崷銊ユ倱鐏�?
		GridPos hpos = hostRole.getPos().toGridPos();
		AreaInfo hareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), hpos.getX(), hpos.getY());
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(hareaInfo!=null&&hareaInfo.isQiecuoArea()&&gareaInfo!=null&&gareaInfo.isQiecuoArea()){
			//闁姤妲搁崷銊︽惃閸欏府绱濋惄瀛樺复鐠ф澘鍨忕壕瀣�?鏄忕帆
			new PSendInvitePlayPK(hostid,objectid).submit();
		}
		else{
			//閸掋倖鏌囩�佃鏌熼弰顖氭儊閸忔娊妫撮崚鍥╊棎
			Integer refQcVal = GameSystemConfig.getSysConfig(objectid, SysConfigType.refuseqiecuo);
			if(refQcVal != null && refQcVal.intValue() == 1){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid,160426 , null);
				sendremoveTickTime(hostid);//闁氨鐓＄�广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
				return;
			}
			PropRole propRole = new PropRole(hostid, true);
			String roleName=propRole.getName();//閻溾晛顔嶉崥宥囆�
			int roleLv=propRole.getLevel();//缁涘楠�
			int curTeamNum=0;//瑜版挸澧犻梼鐔剁礊娴滅儤鏆�
			//閸欐垿?渚�鍊嬬拠?
			SInvitationPlayPK sInvitationPlayPK = new SInvitationPlayPK();
			//160422	5	閻溾晛顔�$parameter1$($parameter2$缁�?)闁�?鐠囪渹绗屾担鐘插瀼绾�?	閸掑洨顥愰幓鎰仛
			//160423	5	$parameter1$闂冪喍绱�($parameter2$缁�?,$parameter3$/5)闁�?鐠囪渹绗屾担鐘插瀼绾�?	閸掑洨顥愰幓鎰仛
			if (hostTeam != null){
				//婵″倹鐏夋稉宥嗘Ц闂冪喖鏆遍敍灞炬畯缁傝崵娈戞禍楦款吇娑撶儤妲搁崡鏇氭眽
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
	 * 閸欐垿?浣割吂閹撮顏敍宀冾唨鐎广垺鍩涚粩顖氬絿濞戝牆鐣鹃弮璺烘珤
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


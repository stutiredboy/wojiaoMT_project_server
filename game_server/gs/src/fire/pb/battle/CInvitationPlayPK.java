
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
		//闂侊拷?閻犲洤鍢查崹蹇曞?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid<0){
			return;
		}
		//闁煎浜滅换浣圭▔瀹ュ牆鍘撮梺锟�?閻犲洨鏌夐崵婊冾啅?
		if(hostid==objectid){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		//闁告帇鍊栭弻鍥ㄤ繆閸屾稓浜柡鍫濐樀濡诧附瀵煎蹇曠濞戞挸绉靛Σ鎼佹⒓閻斿吋姣愰柡鍐У绾爼鏌�?閻狅拷?
		Team hostTeam = TeamManager.selectTeamByRoleId(hostid);
		if (hostTeam != null && hostTeam.isNormalMember(hostid)){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120061, 0, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		
		//闁告帇鍊栭弻鍥儎椤旂晫鍨奸柡鍕靛灠閹線寮垫径鎰曞ù鐓庣▌缁辨繈妫�?閻熸洑娴�?閸愵厽顎氶柣鈺婂枟閻栵綁宕烽妸鈺傂曞ù鐓庣С閼垫垿鎯冮崟顓炐﹂柟锟�?
		Team guestteam = TeamManager.selectTeamByRoleId(objectid);
		if(guestteam!=null){
			//闁告帇鍊栭弻鍥及椤栨碍鍎婇柛锔哄姂濡诧附瀵煎鍕幀闁挎稑鑻々褔寮稿鍐╄含闂傚啰鍠嶇槐鐐寸▔椤撱垺浠橀悷鏇氱劍濞存盯骞戦姀銈喰曢梻锟界捄銊︾暠id
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
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return ;
		}
		if(hostTeam != null && guestteam == null )
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,194038, null);
			return;
		}
		//闁告帇鍊栭弻鍥嚊椤忓嫮绠掗柡鍕靛灠閹線宕烽妸銉ヮ棇闁哄牜鍓ㄧ槐婵嬪捶閵娿儱顥岄柡鍫墯濡倕鈻旈弴鐐茬岛闂侇偂娴囬顒�效?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return ;
		}
		//缂佹梻鍋炴俊褔宕烽崫鍕嬀闁搞儳鍋撳Λ銈呪枖閺囩偛鐎肩痪锟�?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return ;
		}

		// 闁告帇鍊栭弻鍥及椤栨碍鍎婇柛锔哄妼閻ｃ劑宕楅妸銉﹀嬀闁搞儱褰為懙锟�
		if(hostRole.getMapId() == PKDropConfig_CFGS.get(1).safeMapid)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162002, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
		}
		
		//闁告帇鍊栭弻鍥嚊椤忓嫮绠掗柡鍕靛灠閹線宕烽妸锕�鐏涢柡鍌涱殕閸ㄣ劑鎳撻崨閭︽綆闁癸拷?
		BuffAgent hostAgent = new BuffRoleImpl(hostid, true);
		if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 160494, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		xbean.Properties hostprop=xtable.Properties.select(hostid);
		if(hostprop.getCruise() > 0 ) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162102, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return ;
		}
		
		if (hostAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		
		//闁告帇鍊栭弻鍥╋拷浣冾潐閺岀喖寮伴姘剨闁革负鍔庨崵锟�
		if (!StateCommon.isOnlineBuffer(objectid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		xbean.Properties guestprop=xtable.Properties.select(objectid);
		if(guestprop.getCruise() > 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162103, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return ;
		}
		
		// 闁告帇鍊栭弻鍥ㄧ▔閵堬拷?閸涱剛顓洪梻鍌氼嚟濞堟垹鎹勫┑鍫��
		if (!fire.pb.battle.PSendInvitePlayPK.checkRoleDistance(hostid, objectid)){
            fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 120063, 0, null);
            sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
            return ;
		}
		
		//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍕靛灟缁斿瓨绋夐鍫熜曞ù鐓庣Ф濞堟垿骞嬮幇顒佸枀
		if (guestteam != null){
			if(guestteam.getTeamLeaderId()==hostid){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//闁圭粯鍔楅妵姘▔瀹ュ牆鍘撮梺锟�?閻犲洤鍢查幃鎾剁磼閸曨垱袝闁革拷?
				sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
				return;
			}
			if(hostTeam!=null){
				if(guestteam.getTeamId()==hostTeam.getTeamId()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160460, null);//闁圭粯鍔楅妵姘▔瀹ュ牆鍘撮梺锟�?閻犲洤鍢查幃鎾剁磼閸曨垱袝闁革拷?
					sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
					return;
				}
			}
		}
		//闁告帇鍊栭弻鍥╃驳婢跺矂鐛�
		if(hostTeam!=null){
			List<Long> hostteamMembers = hostTeam.getNormalMemberIds();
			for (Long mem : hostteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162001 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
					return ;
				}
			}
		}else{
			//闁煎浜滅换浣虹驳婢跺矂鐛撳☉鎾崇Х閸愬鏁嶇仦鐐骏婵炲娲熼崐瀣嫚?
			PropRole propRole = new PropRole(hostid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162000 ,null);
				sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
				return ;
			}
		}
		if(guestteam!=null){
			List<Long> guestteamMembers = guestteam.getNormalMemberIds();
			for (Long mem : guestteamMembers) {
				PropRole role = new PropRole(mem, true);
				if (role.getLevel() < CSendInvitePlayPK.PVP_LEVEL) {
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160322 ,Arrays.asList(CSendInvitePlayPK.PVP_LEVEL+""));
					sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
					return ;
				}
			}
		}else{
			//闁烩晩鍠楅悥锝囩驳婢跺矂鐛撳☉鎾崇Х閸愬鏁嶇仦鐐骏婵炲娲熼崐瀣嫚?
			PropRole propRole = new PropRole(objectid, true);
			if(propRole.getLevel()< CSendInvitePlayPK.PVP_LEVEL){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 160491 ,null);
				sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
				return ;
			}
		}
		// 濠碘�冲�归悘澶婎嚕缁℃粓鎯冮崟顏呯溄闁哄牆顦妵鍥ㄧ鎼淬値娼剁�殿喚鐦婚柣銊ュ濮癸拷20缂佺嫏鍛暠闁告帗鐟ょ粭澶嬬閸繂绻丳
		if(hostRole != null && gRole != null )
		{
			int levelLimit = PKDropConfig_CFGS.get(1).levelLimit;
			PropRole role = new PropRole(hostid, true);
			PropRole guestrole = new PropRole(objectid, true);
			if ( Math.abs(role.getLevel() - guestrole.getLevel()) >= levelLimit) {
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 194037 ,null);
				sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
				return ;
			}
		}
		
		
		//闁告帇鍊栭弻鍥儎椤旂晫鍨奸柡鍕靛灠閹線宕烽妸锔诲妧閻㈩垳顭堝﹢鎾炊?
		MapConfig cfg2 = ConfigManager.getInstance().getConf(MapConfig.class).get(gRole.getMapId());
		if(cfg2.dynamic ==1){
			//闁圭粯鍔楅妵姘舵儎椤旂晫鍨奸柣婧炬櫅椤斿秵绋夊鍛含婵繐绲介悥鍫曞捶閺夋寧绂�
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,140436, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return ;
		}
		//闁告帇鍊栭弻鍥及椤栨碍鍎婇柛锔哄妽閸剟寮Δ浣哥仐闁兼澘鎳撻～鍥箣?     閻庝絻顫夐弻鐔煎捶閵婏箑鐏涢柡鍌涱殔閹锋壆鎲撮崒娑樼仜濞戞挸绉烽崗姗�宕ｉ幋锟�?娓氾拷閸婂鎷�?
		BuffAgent guestAgent = new BuffRoleImpl(objectid, true);
		if (guestAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||guestAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(hostid, 144987, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		if (guestAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 144999, 0, null);
			sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
			return;
		}
		//闁告帇鍊栭弻鍥及椤栨碍鍎婇梺顔挎濠�顏堝箼閸屾艾閰遍柨娑樿嫰椤┭囧几濠婂啯韬柟鍨�歌ぐ鎾儎鐎涙ê澶嶉柛鎺戞川椤ユ劙鏁嶇仦绛嬫搐闁哄绮堢粭澶愬及椤栨碍韬柟鍨�歌ぐ鎾?閻熸洑绀侀崹浠嬪棘椤擄紕鐛╃紒鍌欑串缁辨繈鐛張鐢电懍闁哄嫷鍨伴幆渚�宕烽妸銉﹀�遍悘锟�?
		GridPos hpos = hostRole.getPos().toGridPos();
		AreaInfo hareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), hpos.getX(), hpos.getY());
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(hareaInfo!=null&&hareaInfo.isQiecuoArea()&&gareaInfo!=null&&gareaInfo.isQiecuoArea()){
			//闂侇喛濮ゅΣ鎼佸捶閵婏附鎯冮柛娆忓簻缁辨繈鎯勭�涙ê澶嶉悹褎婢橀崹蹇曞鐎ｏ拷?閺勫繒甯�
			new PSendInvitePlayPK(hostid,objectid).submit();
		}
		else{
			//闁告帇鍊栭弻鍥╋拷浣冾潐閺岀喖寮伴姘剨闁稿繑濞婂Λ鎾礆閸モ晩妫�
			Integer refQcVal = GameSystemConfig.getSysConfig(objectid, SysConfigType.refuseqiecuo);
			if(refQcVal != null && refQcVal.intValue() == 1){
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid,160426 , null);
				sendremoveTickTime(hostid);//闂侇偅姘ㄩ悡锛勶拷骞垮灪閸╂稓绮╅姘悼婵炴垵鐗嗛悾楣冨籍鐠虹儤鐝�
				return;
			}
			PropRole propRole = new PropRole(hostid, true);
			String roleName=propRole.getName();//闁绘壕鏅涢宥夊触瀹ュ泦锟�
			int roleLv=propRole.getLevel();//缂佹稑顦辨锟�
			int curTeamNum=0;//鐟滅増鎸告晶鐘绘⒓閻斿墎绀婂ù婊呭劋閺嗭拷
			//闁告瑦鍨�?娓氾拷閸婂鎷�?
			SInvitationPlayPK sInvitationPlayPK = new SInvitationPlayPK();
			//160422	5	闁绘壕鏅涢锟�$parameter1$($parameter2$缂侊拷?)闂侊拷?閻犲洩娓圭粭灞炬媴閻樻彃鐎肩痪锟�?	闁告帒娲ㄩˉ鎰板箵閹邦喓浠�
			//160423	5	$parameter1$闂傚啰鍠嶇槐锟�($parameter2$缂侊拷?,$parameter3$/5)闂侊拷?閻犲洩娓圭粭灞炬媴閻樻彃鐎肩痪锟�?	闁告帒娲ㄩˉ鎰板箵閹邦喓浠�
			if (hostTeam != null){
				//濠碘�冲�归悘澶嬬▔瀹ュ棙笑闂傚啰鍠栭弳閬嶆晬鐏炵偓鐣紒鍌濆吹濞堟垶绂嶆ウ娆惧悋濞戞挾鍎ゅΣ鎼佸础閺囨碍鐪�
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
	 * 闁告瑦鍨�?娴ｅ壊鍚傞柟鎾棑椤忣剟鏁嶅畝鍐惧敤閻庡箍鍨洪崺娑氱博椤栨艾绲挎繛鎴濈墕閻ｉ箖寮捄鐑樼彜
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


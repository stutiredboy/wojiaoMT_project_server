
package fire.pb.npc;

import java.util.Collections;

import fire.pb.PropRole;
import fire.pb.main.ConfigManager;
import fire.pb.map.Npc;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.SceneNpcManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVisitNpc__ extends mkio.Protocol { }

/** 客户端请求访问 NPC
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CVisitNpc extends __CVisitNpc__ {
	private boolean checkGatherTask( long roleid, final SGatherConfig conf ) {
		if ( conf.tasks == null || conf.tasks.isEmpty() ) {
			Module.logger.error("閲囬泦鐗╃殑tasks瀛楁涓虹┖");
			return true;
		}
		if ( fire.pb.mission.Module.getInstance().checkGather(roleid, conf) ) {
			return true;
		}
		return false;
	}
	private void gatherProcess( long roleid, int gatherid ) {
		// 
		SGatherConfig conf = ConfigManager.getInstance().getConf(fire.pb.npc.SGatherConfig.class).get(gatherid );
		if ( conf == null ) {
			Module.logger.error( "娌℃湁璇ラ噰闆嗙墿鐨勯厤缃?" + gatherid );
			return;
		}

		if ( !checkGatherTask( roleid, conf ) )
			return;

		fire.msp.npc.GCheckGathering send = new fire.msp.npc.GCheckGathering();
		send.gatherkey = npckey;
		send.roleid = roleid;
		fire.pb.GsClient.sendToScene( send );
	}
	
	public static void getScenarioQuests( 
			final long roleid,
			final int npcid, 
			SVisitNpc svisitNpc ) {
		try {
			svisitNpc.scenarioquests.clear();
			svisitNpc.scenarioquests = new fire.pb.mission.MissionColumn(roleid, true).getMissionsByNpcid(npcid, svisitNpc);
			Collections.sort(svisitNpc.scenarioquests);

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	private void onVisitNpc( final long roleid, final SNpcShare share ) {
		//濡傛灉鏄壇鏈帺娉曞唴鐨刵pc锛屾埅璧?
		if (share.npctype == 16) {
			fire.pb.instancezone.Module.visitNpc(roleid, npckey, share);
			return;
		}
		//鏃ュ父鍓湰鐜╂硶鍐呯殑npc
		if (share.npctype == 17) {
			fire.pb.mission.instance.InstanceManager.visitNpc(roleid, npckey, share);
			return;
		}
		//鎹夐浠诲姟鐜╂硶鍐呯殑npc
		if (share.npctype == 28) {
			if (mkdb.Transaction.current() != null) {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).call();
			}
			else {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).submit();
			}
			return;
		}
		
		//涓?娆℃?у壇鏈帺娉曞唴鐨刵pc
		if (fire.pb.mission.instance.line.LineInstManager.getInstance().checkLineNpc(share.getId())) {
			fire.pb.mission.instance.line.LineInstManager.visitNpc(roleid, npckey, share);
			return;
		}
		// added by cn
		// 鏈夌殑浠诲姟涓?,鐜╁鍙兘鏍规湰娌℃湁璁块棶npc鐨勮祫鏍?,鐩存帴杩斿洖鎻愮ず淇℃伅,涓嶉渶瑕佸脊鍑烘湇鍔″垪琛?,濡傛灉鏈夎繖绉嶆儏鍐?,缁熶竴鍐欏湪杩欎釜
		// 鏂规硶閲?
		if (!checkNpcVisitable(roleid)){
			Module.logger.info("npc is unvisitable");
			return;
		}
		
		//濡傛灉鏄壒娈婄殑npc璁块棶澶勭悊妗?
		SpecialNpcDialogProcessor processor = SpecialVisitProcessCreator.getInstance().createNpcDialogProcessor(roleid, npckey);
		if(null != processor){
			Module.logger.info("specialNpcDialog. npcid:"+share.id);
			processor.onVisitNpc();
			return;
		}
		
		final SVisitNpc svisitNpc = new SVisitNpc();
		svisitNpc.npckey = npckey;
		final java.util.List<Integer> services = NpcServiceManager.getInstance().getShowServicesIDSByNpcKey(roleid, npckey);
		if (null != services) {
			svisitNpc.services.addAll(services);
		}
		getScenarioQuests(roleid, share.id, svisitNpc);
		
		gnet.link.Onlines.getInstance().send(roleid, svisitNpc);
		Module.logger.info("SVisitNpc鍗忚鍐呭-" + getString(svisitNpc,share.id));
	}
	

	private String getString(SVisitNpc svisitNpc,int npcid) {
		StringBuffer sb = new StringBuffer();
		sb.append("NPC:[" + npcid + "],");
		sb.append("Services:[");
		for(Integer serviceid : svisitNpc.services){
			sb.append(serviceid +";");
		}
		sb.append("],");
		sb.append("ScenarioQuests:[");
		for(Integer serviceid : svisitNpc.scenarioquests){
			sb.append(serviceid +";");
		}
		sb.append("].");
		return sb.toString();
	}
	@Override
	protected void process() {

		//Module.logger.info("褰撳墠璁块棶npc id + " + NpcServiceManager.getNpcIDByKey(npckey));
		
		// protocol handle
		// TODO:浜鸿兘鍚﹁闂甆PC,浜虹墿鐘舵?佺殑鍒ゆ柇锛屼緥濡備氦鏄擄紝鎴樻枟涓?...
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			Module.logger.error("璁块棶npc鐨勮鑹? 锛? " + roleid + "鏈夐敊");
			return;
		}
		
		PropRole prole = new PropRole(roleid, true);	
		if(prole.getProperties().getCruise() > 0) {
			Module.logger.error("璁块棶npc鐨勮鑹? 锛? " + roleid + "宸℃父鐘舵?侊紝绂佹璁块棶.");
			return;
		}

		// 鍙垎浜殑npc锛?
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		if (npc == null){
			Module.logger.error("璁块棶npc涓嶅瓨鍦? 锛? " + npckey);
			return;
		}
		final SNpcShare share = NpcManager.getInstance().getNpcShareByID( npc.getNpcID() );
		if ( share == null ){
			Module.logger.error("璁块棶npc鐨刬d 锛? " + npc.getNpcID() + "鏈夐敊 share涓簄ull");
			return;
		}
		if ( share.npctype == 5 ) {
			Role role = RoleManager.getInstance().getRoleByID(roleid);
			if(!role.checkDistance(npc,400)){
				Module.logger.error("璁块棶npc鐨勮窛绂昏繃杩? 锛? " + npc.getNpcID());
				return;
			}
			gatherProcess( roleid, share.id );
			return;
		}
		if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, roleid)){
			Module.logger.error("npc鐨勮窛绂昏繃杩? 锛? " + npc.getNpcID());
			return;
		}
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
		if (team != null) {
			if (team.isTeamLeader(roleid)) {
				if (share.share==1) {
					for (Long member : team.getNormalMemberIds()) {
						onVisitNpc( member, share );
					}
				} else {
					onVisitNpc( roleid, share );
				}
			} else {
				if ( team.isAbsentMember( roleid ) ) {
					onVisitNpc( roleid, share );
				}
			}
		} else {
			onVisitNpc( roleid, share );
		}
	}

	

	private boolean checkNpcVisitable(long roleid) {

		// 鏅哄姏璇曠粌鐨勭壒娈婂鐞?
//		if(!fire.pb.activity.keju.KejuManager.getInstance().checkNpcVisitable(roleid,npckey)){
//			Module.logger.info("鏅哄姏璇曠粌npc,鐜╁涓嶈兘璁块棶:"+roleid);
//			return false;
//		}
		// 鏅哄姏璇曠粌鐨勭壒娈婂鐞? end
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795433;

	public int getType() {
		return 795433;
	}

	public long npckey; // npckey为npc的唯一ID

	public CVisitNpc() {
	}

	public CVisitNpc(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CVisitNpc) {
			CVisitNpc _o_ = (CVisitNpc)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CVisitNpc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

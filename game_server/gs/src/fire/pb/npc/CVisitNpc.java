
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
			Module.logger.error("闁插洭娉﹂悧鈺冩畱tasks鐎涙顔屾稉铏光敄");
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
			Module.logger.error( "濞屸剝婀佺拠銉╁櫚闂嗗棛澧块惃鍕帳缂�?" + gatherid );
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
		//婵″倹鐏夐弰顖氬閺堫剛甯哄▔鏇炲敶閻ㄥ埖pc閿涘本鍩呯挧?
		if (share.npctype == 16) {
			fire.pb.instancezone.Module.visitNpc(roleid, npckey, share);
			return;
		}
		//閺冦儱鐖堕崜顖涙拱閻溾晜纭堕崘鍛畱npc
		if (share.npctype == 17) {
			fire.pb.mission.instance.InstanceManager.visitNpc(roleid, npckey, share);
			return;
		}
		//閹瑰顑楁禒璇插閻溾晜纭堕崘鍛畱npc
		if (share.npctype == 28) {
			if (mkdb.Transaction.current() != null) {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).call();
			}
			else {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).submit();
			}
			return;
		}
		
		//娑�?濞嗏剝?褍澹囬張顒傚负濞夋洖鍞撮惃鍒祊c
		if (fire.pb.mission.instance.line.LineInstManager.getInstance().checkLineNpc(share.getId())) {
			fire.pb.mission.instance.line.LineInstManager.visitNpc(roleid, npckey, share);
			return;
		}
		// added by cn
		// 閺堝娈戞禒璇插娑�?,閻溾晛顔嶉崣顖濆厴閺嶈婀板▽鈩冩箒鐠佸潡妫秐pc閻ㄥ嫯绁弽?,閻╁瓨甯存潻鏂挎礀閹绘劗銇氭穱鈩冧紖,娑撳秹娓剁憰浣歌剨閸戠儤婀囬崝鈥冲灙鐞�?,婵″倹鐏夐張澶庣箹缁夊秵鍎忛崘?,缂佺喍绔撮崘娆忔躬鏉╂瑤閲�
		// 閺傝纭堕柌?
		if (!checkNpcVisitable(roleid)){
			Module.logger.info("npc is unvisitable");
			return;
		}
		
		//婵″倹鐏夐弰顖滃濞堝﹦娈憂pc鐠佸潡妫舵径鍕倞濡�?
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
		Module.logger.info("SVisitNpc閸楀繗顔呴崘鍛啇-" + getString(svisitNpc,share.id));
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

		//Module.logger.info("瑜版挸澧犵拋鍧楁６npc id + " + NpcServiceManager.getNpcIDByKey(npckey));
		
		// protocol handle
		// TODO:娴滈缚鍏橀崥锕侇問闂傜攩PC,娴滆櫣澧块悩鑸�?浣烘畱閸掋倖鏌囬敍灞肩伐婵″倷姘﹂弰鎿勭礉閹存ɑ鏋熸稉?...
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			Module.logger.error("鐠佸潡妫秐pc閻ㄥ嫯顫楅懝? 閿�? " + roleid + "閺堝鏁�");
			return;
		}
		
		PropRole prole = new PropRole(roleid, true);	
		if(prole.getProperties().getCruise() > 0) {
			Module.logger.error("鐠佸潡妫秐pc閻ㄥ嫯顫楅懝? 閿�? " + roleid + "瀹糕剝鐖堕悩鑸�?渚婄礉缁備焦顒涚拋鍧楁６.");
			return;
		}

		// 閸欘垰鍨庢禍顐ゆ畱npc閿�?
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		if (npc == null){
			Module.logger.error("鐠佸潡妫秐pc娑撳秴鐡ㄩ崷? 閿�? " + npckey);
			return;
		}
		final SNpcShare share = NpcManager.getInstance().getNpcShareByID( npc.getNpcID() );
		if ( share == null ){
			Module.logger.error("鐠佸潡妫秐pc閻ㄥ埇d 閿�? " + npc.getNpcID() + "閺堝鏁� share娑撶皠ull");
			return;
		}
		if ( share.npctype == 5 ) {
			Role role = RoleManager.getInstance().getRoleByID(roleid);
			if(!role.checkDistance(npc,400)){
				Module.logger.error("鐠佸潡妫秐pc閻ㄥ嫯绐涚粋鏄忕箖鏉�? 閿�? " + npc.getNpcID());
				return;
			}
			gatherProcess( roleid, share.id );
			return;
		}
		if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, roleid)){
			Module.logger.error("npc閻ㄥ嫯绐涚粋鏄忕箖鏉�? 閿�? " + npc.getNpcID());
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

		// 閺呭搫濮忕拠鏇犵矊閻ㄥ嫮澹掑▓濠傤槱閻�?
//		if(!fire.pb.activity.keju.KejuManager.getInstance().checkNpcVisitable(roleid,npckey)){
//			Module.logger.info("閺呭搫濮忕拠鏇犵矊npc,閻溾晛顔嶆稉宥堝厴鐠佸潡妫�:"+roleid);
//			return false;
//		}
		// 閺呭搫濮忕拠鏇犵矊閻ㄥ嫮澹掑▓濠傤槱閻�? end
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

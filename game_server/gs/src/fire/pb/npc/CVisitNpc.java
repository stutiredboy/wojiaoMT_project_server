
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
			Module.logger.error("闂佹彃娲▔锕傛偋閳哄啯鐣眛asks閻庢稒顨嗛灞剧▔閾忓厜鏁�");
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
			Module.logger.error( "婵炲备鍓濆﹢浣烘嫚閵夆晛娅氶梻鍡楁婢у潡鎯冮崟顖氬赋缂傦拷?" + gatherid );
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
		//濠碘�冲�归悘澶愬及椤栨艾顥岄柡鍫墰鐢搫鈻旈弴鐐叉暥闁汇劌鍩杙c闁挎稑鏈崺鍛導?
		if (share.npctype == 16) {
			fire.pb.instancezone.Module.visitNpc(roleid, npckey, share);
			return;
		}
		//闁哄啨鍎遍悥鍫曞礈椤栨稒鎷遍柣婧炬櫆绾爼宕橀崨顖涚暠npc
		if (share.npctype == 17) {
			fire.pb.mission.instance.InstanceManager.visitNpc(roleid, npckey, share);
			return;
		}
		//闁圭懓顦甸妤佺鐠囨彃顫ら柣婧炬櫆绾爼宕橀崨顖涚暠npc
		if (share.npctype == 28) {
			if (mkdb.Transaction.current() != null) {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).call();
			}
			else {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).submit();
			}
			return;
		}
		
		//濞戯拷?婵炲棌鍓�?瑜嶆竟鍥嫉椤掑倸璐熸繛澶嬫礀閸炴挳鎯冮崚绁奵
		if (fire.pb.mission.instance.line.LineInstManager.getInstance().checkLineNpc(share.getId())) {
			fire.pb.mission.instance.line.LineInstManager.visitNpc(roleid, npckey, share);
			return;
		}
		// added by cn
		// 闁哄牆顦卞▓鎴炵鐠囨彃顫ゅ☉锟�?,闁绘壕鏅涢宥夊矗椤栨繂鍘撮柡宥堫潐濠�鏉库柦閳╁啯绠掗悹浣告健濡pc闁汇劌瀚粊顐﹀冀?,闁烩晛鐡ㄧ敮瀛樻交閺傛寧绀�闁圭粯鍔楅妵姘┍閳╁啩绱�,濞戞挸绉瑰〒鍓佹啺娴ｆ瓕鍓ㄩ柛鎴犲劋濠�鍥礉閳ュ啿鐏欓悶锟�?,濠碘�冲�归悘澶愬嫉婢跺海绠圭紒澶婄У閸庡繘宕�?,缂備胶鍠嶇粩鎾礃濞嗗繑韬弶鈺傜懁闁诧拷
		// 闁哄倽顫夌涵鍫曟煂?
		if (!checkNpcVisitable(roleid)){
			Module.logger.info("npc is unvisitable");
			return;
		}
		
		//濠碘�冲�归悘澶愬及椤栨粌顥楁繛鍫濓功濞堟唫pc閻犱礁娼″Λ鑸靛緞閸曨厽鍊炴俊锟�?
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
		Module.logger.info("SVisitNpc闁告绻楅鍛村礃閸涱収鍟�-" + getString(svisitNpc,share.id));
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

		//Module.logger.info("鐟滅増鎸告晶鐘垫媼閸ф锛杗pc id + " + NpcServiceManager.getNpcIDByKey(npckey));
		
		// protocol handle
		// TODO:濞存粓缂氶崗姗�宕ラ敃渚囧晱闂傚倻鏀㏄C,濞存粏娅ｆ晶鍧楁偐閼革拷?娴ｇ儤鐣遍柛鎺嬪�栭弻鍥晬鐏炶偐浼愬┑鈥冲�峰锕傚及閹垮嫮绀夐柟瀛樕戦弸鐔哥▔?...
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			Module.logger.error("閻犱礁娼″Λ绉恜c闁汇劌瀚～妤呮嚌? 闁匡拷? " + roleid + "闁哄牆顦甸弫锟�");
			return;
		}
		
		PropRole prole = new PropRole(roleid, true);	
		if(prole.getProperties().getCruise() > 0) {
			Module.logger.error("閻犱礁娼″Λ绉恜c闁汇劌瀚～妤呮嚌? 闁匡拷? " + roleid + "鐎圭硶鍓濋悥鍫曟偐閼革拷?娓氬﹦绀夌紒鍌欑劍椤掓稓鎷嬮崸妤侊紪.");
			return;
		}

		// 闁告瑯鍨伴崹搴㈢椤愩倖鐣眓pc闁匡拷?
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		if (npc == null){
			Module.logger.error("閻犱礁娼″Λ绉恜c濞戞挸绉撮悺銊╁捶? 闁匡拷? " + npckey);
			return;
		}
		final SNpcShare share = NpcManager.getInstance().getNpcShareByID( npc.getNpcID() );
		if ( share == null ){
			Module.logger.error("閻犱礁娼″Λ绉恜c闁汇劌鍩嘾 闁匡拷? " + npc.getNpcID() + "闁哄牆顦甸弫锟� share濞戞挾鐨爑ll");
			return;
		}
		if ( share.npctype == 5 ) {
			Role role = RoleManager.getInstance().getRoleByID(roleid);
			if(!role.checkDistance(npc,400)){
				Module.logger.error("閻犱礁娼″Λ绉恜c闁汇劌瀚粣娑氱矉閺勫繒绠栭弶锟�? 闁匡拷? " + npc.getNpcID());
				return;
			}
			gatherProcess( roleid, share.id );
			return;
		}
		if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, roleid)){
			Module.logger.error("npc闁汇劌瀚粣娑氱矉閺勫繒绠栭弶锟�? 闁匡拷? " + npc.getNpcID());
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

		// 闁哄懎鎼慨蹇曟嫚閺囩姷鐭婇柣銊ュ婢规帒鈻撴繝鍌ゆП闁伙拷?
//		if(!fire.pb.activity.keju.KejuManager.getInstance().checkNpcVisitable(roleid,npckey)){
//			Module.logger.info("闁哄懎鎼慨蹇曟嫚閺囩姷鐭妌pc,闁绘壕鏅涢宥嗙▔瀹ュ牆鍘撮悹浣告健濡拷:"+roleid);
//			return false;
//		}
		// 闁哄懎鎼慨蹇曟嫚閺囩姷鐭婇柣銊ュ婢规帒鈻撴繝鍌ゆП闁伙拷? end
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

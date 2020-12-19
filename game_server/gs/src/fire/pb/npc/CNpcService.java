
package fire.pb.npc;

import fire.pb.activity.impexam.PApplyImpExamProc;
import fire.pb.activity.winner.CReqStartWinner;
import fire.pb.activity.winner.CStartWinnerBattle;
import fire.pb.battle.pvp.IPvPServiceHandle;
import fire.pb.battle.pvp.PvPServiceHandleFactory;
import fire.pb.circletask.CircleTask;
import fire.pb.circletask.CircleTaskManager;
import fire.pb.circletask.PAcceptCircTask;
import fire.pb.circletask.PSendMail2Dst;
import fire.pb.circletask.PSubmitCircleTask;
import fire.pb.circletask.SRenXingCircleTask;
import fire.pb.circletask.catchit.EnterCatchItBattle;
import fire.pb.effect.Module;
import fire.pb.game.MoneyType;
import fire.pb.instancezone.PInstNpcService;
import fire.pb.instancezone.bingfeng.BingFengLandMgr;
import fire.pb.instancezone.bingfeng.BingFengWangZuoConfig;
import fire.pb.instancezone.bingfeng.PBattletoBingFeng;
import fire.pb.instancezone.conf.InstanceZoneConfig;
import fire.pb.map.SceneNpcManager;
import fire.pb.master.MasterManager;
import fire.pb.mission.PAcceptMajorMission;
import fire.pb.mission.instance.InstanceManager;
import fire.pb.mission.instance.PBackInstanceScenceProc;
import fire.pb.mission.instance.PGiveInstanceProc;
import fire.pb.mission.instance.line.LineInstManager;
import fire.pb.ranklist.SRequestRankList;
import fire.pb.ranklist.proc.RankListManager;
import fire.pb.school.shouxi.CChallengeShouXiDiZi;
import fire.pb.school.shouxi.CCheckCanElect;
import fire.pb.school.shouxi.CReqCandidatesList;
import fire.pb.talk.MessageMgr;
import fire.pb.weibo.PTakeWeiBoAwardProc;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CNpcService__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CNpcService extends __CNpcService__ {

	boolean dealNpcServiceMapping(final long roleid, final int serviceid){
		try {		
			SNpcServiceMapping conf = NpcServiceManager.getInstance().getServiceMappingByServiceID(serviceid);
			if(null == conf)
				return false;
			int curType = conf.getType();
			//NPC鏈嶅姟鏄犲皠琛ㄩ噷鍚勪釜绫诲瀷鐨勫叿浣撳疄鐜?
			switch (curType) {
			case NpcServiceMappingTypes.NONE: {
				break;
			}
			case NpcServiceMappingTypes.ACCEPT_CIRCLE_TASK: {
				//鎺ュ彈寰幆浠诲姟
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new PAcceptCircTask(roleid, npckey, npcid, conf.getParam1(), true).submit();
				return true;
			}
			case NpcServiceMappingTypes.SUBMIT_CIRCLE_TASK: {
				//鎻愪氦寰幆浠诲姟
				new PSubmitCircleTask(conf.getParam1(), roleid, npckey, new java.util.ArrayList<fire.pb.npc.SubmitUnit>()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TASK: {
				//鏌ヨ寰幆浠诲姟
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new fire.pb.circletask.catchit.PQueryCatchItTaskTime(roleid, npcid, conf.getParam1()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TEAM: {
				break;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_BATTLE: {
				//杩涘叆寰幆浠诲姟鏄庨浄鎬垬鏂?
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				EnterCatchItBattle enter = new EnterCatchItBattle(roleid, npckey, npcid, conf.getParam1());
				enter.enterBattle();
				return true;
			}
			case NpcServiceMappingTypes.CIRCLE_PRODUCE: {
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new fire.pb.item.PProduceItem(roleid, conf.getParam1(), npcid, conf.getParam2()).submit();
				return true;
			}
			case NpcServiceMappingTypes.RENXING_CIRCLE_TASK: {
				//浠绘?т竴涓换鍔?
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				int renxingtimes = sq.getRenXingCircTaskCount(roleid, conf.getParam1());
				gnet.link.Onlines.getInstance().send(roleid, new SRenXingCircleTask(serviceid, conf.getParam1(), renxingtimes, npckey));
				return true;
			}
			case NpcServiceMappingTypes.CHALLENGE_NPC: {
				//鎸戞垬npc
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				boolean ret = sq.exeCircTaskBattle(roleid, npckey, conf.getParam1(), npcid);
				Module.logger.debug("鐜╁[" + roleid + "]" + "exeCircTaskBattle缁撴灉:" + ret);
				return true;
			}
			case NpcServiceMappingTypes.ENTER_INST: {
	
				Integer instid = conf.getParam1();
				InstanceZoneConfig zoneconfig = fire.pb.instancezone.Module
						.getInstance().getInstanceZoneConfigs()
						.get(instid.intValue());
				if (zoneconfig == null) {
					return false;
				}
				new PInstNpcService(instid, serviceid, roleid).submit();
				return true;
			}
			case NpcServiceMappingTypes.ACCEPT_TUPO: {
				new PAcceptMajorMission(roleid, conf.getParam1(), true,true).call();
			}
			default:
				break;
			}
			return false;
		} catch (Exception e) {
			// TODO 鑷姩鐢熸垚鐨? catch 鍧?
			Module.logger.error("鐜╁[" + roleid + "]" + "serviceid:" + serviceid + "閿欒");
			return false;			
		}
	}

	@Override
	public void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		if (!fire.pb.StateCommon.isOnline(roleid))
			return;
		if(100002 != serviceid && fire.pb.buff.Module.existState(roleid, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER))
			return;
		// 鎸堿lt+B 鑾峰彇鍙姞鍏ュ鏃忓垪琛?
		//NPC濂栧姳鍙戞斁
		if(PNpcAwardProc.containedByNpcAward(this.serviceid)){
			new PNpcAwardProc(roleid, this.serviceid).submit();
			return;
		}
		
		int npcId = NpcServiceManager.getNpcIDByKey(npckey);
		
		fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, true);
		long v = bag.getCurrency(MoneyType.MoneyType_ProfContribute);
		if (serviceid == NpcServices.ONE_LIEVEL_TITLE)
		{
			if (v >= 60)
			{
				new PAcceptCircTask(roleid, npckey, npcId, 1120000, true).submit();			
			}
			else
			{
				java.util.ArrayList<String> s = new java.util.ArrayList<String>();
				s.add("60");
				MessageMgr.sendMsgNotify(roleid, 190070, s);				
			}
			
			return;
		}
		
		if (serviceid == NpcServices.TWO_LIEVEL_TITLE)
		{
			if (v >= 120)
			{
				new PAcceptCircTask(roleid, npckey, npcId, 1130000, true).submit();		
			}
			else
			{
				java.util.ArrayList<String> s = new java.util.ArrayList<String>();
				s.add("120");
				MessageMgr.sendMsgNotify(roleid, 190070, s);				
			}
			
			return;
		}
		
		if (serviceid == NpcServices.THREE_LIEVEL_TITLE)
		{
			if (v >= 180)
			{
				new PAcceptCircTask(roleid, npckey, npcId, 1140000, true).submit();		
			}
			else
			{
				java.util.ArrayList<String> s = new java.util.ArrayList<String>();
				s.add("180");
				MessageMgr.sendMsgNotify(roleid, 190070, s);						
			}
			
			return;
		}
		
		//serviceid -> type -> params 鏄犲皠鍏崇郴琛?
		if (dealNpcServiceMapping(roleid, serviceid)) {
			Module.logger.error("NPC鏈嶅姟鏄犲皠琛ㄥ鐞嗕簡瑙掕壊[" + roleid + "]鐨勬湇鍔" + serviceid + "].");
			return;
		}
		
		//澶勭悊閫佷俊绫诲惊鐜换鍔＄殑鏈嶅姟
		if (CircleTaskManager.getInstance().isSendMailService(serviceid)){
			Module.logger.info("瑙掕壊[" + roleid + "]鐨勬湇鍔" + serviceid + "]鏄?佷俊绫诲惊鐜换鍔℃湇鍔?.");
			int npcid = NpcServiceManager.getNpcIDByKey(npckey);
			new PSendMail2Dst(roleid, npcid, serviceid).submit();
			return;
		}
		
		if (serviceid == NpcServices.ENTER_CLAN_FIGHT)
		{
			new fire.pb.clan.fight.PEnterClanFightBattleField(roleid).submit();
			return;
		}
		
		if (!SceneNpcManager.checkDistance(npckey, roleid)) {
			MessageMgr.sendMsgNotify(roleid, 142369, null);
			return;
		}
		
		final SNpcShare share = NpcManager.getInstance().getNpcShareByID(npcId);
		if(share == null)
		{
			Module.logger.error("SNpcShare == null,npcId = "+ npcId + ",serviceid = "+serviceid+",roleid = " + roleid);
			return;
		}
		
		// 濡傛灉鏄壇鏈帺娉曞唴npc鐨勬湇鍔★紝鎴蛋
		if (share.npctype == 16) {
			if (serviceid == NpcServices.WATCH_INST_NPC_BATTLE) {
				new fire.pb.instancezone.PWatchNpcBattle(roleid, npckey).submit();
				return;
			}
			
			if (serviceid == NpcServices.END_INST_NPC_BATTLE) {
				new fire.pb.instancezone.PEndNpcBattle(roleid, npckey).submit();
				return;
			}
			
			fire.pb.instancezone.Module.doNpcService(roleid, npckey, share, serviceid);
			return;
		}
		
		if(!fire.pb.npc.NpcServiceManager.getInstance().hasServiceByNpcKey(roleid, npckey, serviceid))
			return;

		fire.pb.map.Npc gsnpc = fire.pb.map.SceneNpcManager.selectNpcByKey(npckey);
		if (gsnpc == null)
			return;
		
		if (serviceid == NpcServices.SEND_MAIL
				|| serviceid == NpcServices.CIRCTASK_SCHOOL1 || serviceid == NpcServices.CIRCTASK_SCHOOL2 
				|| serviceid == NpcServices.CIRCTASK_SCHOOL3 || serviceid == NpcServices.CIRCTASK_SCHOOL4
				 || serviceid == NpcServices.CIRCTASK_SCHOOL5 || serviceid == NpcServices.CIRCTASK_SCHOOL6
				 || serviceid == NpcServices.CIRCTASK_SCHOOL_SUBMIT1
				 || serviceid == NpcServices.CIRCTASK_SCHOOL_SUBMIT2
				 || serviceid == NpcServices.CIRCTASK_SCHOOL_SUBMIT3
				 || serviceid == NpcServices.CIRCTASK_SCHOOL_SUBMIT4
				 || serviceid == NpcServices.CIRCTASK_SCHOOL_SUBMIT5
				 || serviceid == NpcServices.CIRCTASK_SCHOOL_SUBMIT6
				 || serviceid == NpcServices.CATCH_IT
				 || serviceid == NpcServices.CATCH_IT_SUBMIT
				 || serviceid == NpcServices.CATCH_IT_Battle
				 || serviceid == NpcServices.CATCH_IT_QUERY) {
			CircleTaskManager.getInstance().process(roleid, npckey, serviceid);
			return;
		}
		
		if (serviceid == NpcServices.TIMER_NPC_Battle) {
			new fire.pb.activity.timernpc.PTimerNpcFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.EVENT_NPC_Battle) {
			new fire.pb.mission.treasuremap.PEventNpcFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.WATCH_NPC_BATTLE) {
			new fire.pb.activity.timernpc.PWatchNpcBattle(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.WATCH_EVENTNPC_BATTLE) {
			new fire.pb.mission.treasuremap.PWatchNpcBattle(roleid, npcId, npckey).submit();
			return;
		}
		
		//TODO 涓存椂娴嬭瘯鎴樻枟鐢?,闅忔椂鍑嗗鍒犻櫎
		if (serviceid == 999999) {
			new fire.pb.activity.timernpc.PFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.FORTUNE_WHEEL) {
			PReqFortuneWheel pwheel = new PReqFortuneWheel(roleid, npckey, npcId, true, NpcServices.FORTUNE_WHEEL);
			pwheel.submit();
			return;
		}
		
		if (serviceid == NpcServices.LEADER_SEE_CAMPAIGN_LIST) {// 浜х湅绔為?夊悕鍗?  by changhao
			new fire.pb.school.shouxi.PSendCandidateList(roleid, npckey).submit();
			return;
		}
		if (serviceid == NpcServices.VOTING) {// 鎶曠エ
			new CReqCandidatesList(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CAMPAIGN) { //绔為?? by changhao
			new CCheckCanElect(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CHALLENGE) {// 鎸戞垬棣栧腑
			new CChallengeShouXiDiZi(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_MY_CAMPAIGN) {// 鍒锋柊棣栧腑鑳藉姏
			new fire.pb.school.shouxi.PMyElector(roleid, npckey).submit();
			return;
		}
		///////////////////鍐犲啗璇曠偧start//////////////////////////////////////
		if (serviceid == NpcServices.WINNER_START) {// 鍙傚姞鍐犲啗璇曠偧
			new CReqStartWinner(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.FIGHT_WINNER) {
			new CStartWinnerBattle(roleid, npckey).process();
			return;
		}
		////////////////////////鍐犲啗璇曠偧end//////////////////////////////////////

		
		if (InstanceManager.getInstance().getInstNpcServers().contains(serviceid)) {
			new PGiveInstanceProc(roleid, npckey, serviceid).submit();
			return;
		}
		
		if (LineInstManager.getInstance().getInstNpcServers().contains(serviceid)) {
			new fire.pb.mission.instance.line.PGiveLineProc(roleid, npckey, serviceid).submit();
			return;
		}
		
		if (serviceid == NpcServices.BACK_COPY_SERVICE) {
			new PBackInstanceScenceProc(roleid).submit();
			return;
		}
		
		
		
		if(serviceid == 1923){
			fire.pb.mission.ExecuteReqGoto.trans2Pos(roleid, 1014, 39, 27, false);
			return;
		}
		if(serviceid == 1924){
			fire.pb.mission.ExecuteReqGoto.trans2Pos(roleid, 1004, 27, 89, false);
			return;
		}
		if(serviceid == 1925){
			fire.pb.mission.ExecuteReqGoto.trans2Pos(roleid, 1008, 89, 38, false);
			return;
		}

		//鎵撳紑鍐板皝鐜嬪骇鐣岄潰
		if (serviceid == NpcServices.ENTER_BINGFENG) {
			BingFengWangZuoConfig bfconfig = BingFengLandMgr.getInstance().getBingFengConfigByRoleLv(roleid);
			if (bfconfig != null) {
				int rankid = BingFengLandMgr.getInstance().getRankIdByInstzoneId(bfconfig.getInstzoneid());
				SRequestRankList requestRankList = RankListManager.getInstance().getRankListResponse(rankid, roleid, 0);
				gnet.link.Onlines.getInstance().send(roleid, requestRankList);
				fire.pb.instancezone.bingfeng.BingFengLandMgr.sendSBingFengInfo(roleid, rankid);
			}
			else {
				int rankid = BingFengLandMgr.getInstance().getRankIdByInstzoneId(1);
				SRequestRankList requestRankList = RankListManager.getInstance().getRankListResponse(rankid, roleid, 0);
				gnet.link.Onlines.getInstance().send(roleid, requestRankList);
				fire.pb.instancezone.bingfeng.BingFengLandMgr.sendSBingFengInfo(roleid, rankid);
			}
			return;
		}
		
		
		if (serviceid == 1078 || serviceid == 1079){
			new PReceiveAccountInfoAward(roleid,serviceid).submit();
			return;
		}
		
		if(serviceid == 1987){//棰嗗彇鍙戝井鍗氬鍔?
			new PTakeWeiBoAwardProc(roleid).submit();
			return;
		}

		// PvP鏈嶅姟鐨勫鐞?
		IPvPServiceHandle sHandle = PvPServiceHandleFactory.create(serviceid);
		if (sHandle != null) {
			sHandle.handle(roleid, serviceid);
			return;
		}

		if (BingFengLandMgr.bingFengServiceids.contains(serviceid)) {
			new PBattletoBingFeng(roleid, npcId).submit();
			return;
		}

		//鏀惧純鍓湰浠诲姟
		if(serviceid == 1801){
			InstanceManager.getInstance().abandonInstanceTask(roleid);
			return;
		}
		
		if(MasterManager.masterService(roleid, serviceid)){
			return;
		}
		
		if (serviceid == NpcServices.IMPEXAM_STATE) {
			new PApplyImpExamProc(roleid,ImpExamType.IMPEXAM_STATE,1).submit();
			return;
		}
		
		if (serviceid == NpcServices.RESET_LINEINST) {
			new fire.pb.mission.instance.line.PSendResetLineTask(roleid).submit();
			return;
		}
		
		if (serviceid == NpcServices.QUERY_LINEINST) {
			new fire.pb.mission.instance.line.PQueryLineTime(roleid).submit();
			return;
		}
		
		if (serviceid == NpcServices.LOOK_YAO_QIAN) {
			new fire.pb.npc.PLookYaoQian(roleid, npckey).submit();
		}
	}


	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795435;

	public int getType() {
		return 795435;
	}

	public long npckey; // npckey为npc的唯一ID
	public int serviceid; // 服务ID

	public CNpcService() {
	}

	public CNpcService(long _npckey_, int _serviceid_) {
		this.npckey = _npckey_;
		this.serviceid = _serviceid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		_os_.marshal(serviceid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		serviceid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CNpcService) {
			CNpcService _o_ = (CNpcService)_o1_;
			if (npckey != _o_.npckey) return false;
			if (serviceid != _o_.serviceid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		_h_ += serviceid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(serviceid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CNpcService _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = serviceid - _o_.serviceid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

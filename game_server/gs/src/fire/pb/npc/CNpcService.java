
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
			//NPC閺堝秴濮熼弰鐘茬殸鐞涖劑鍣烽崥鍕嚋缁鐎烽惃鍕徔娴ｆ挸鐤勯悳?
			switch (curType) {
			case NpcServiceMappingTypes.NONE: {
				break;
			}
			case NpcServiceMappingTypes.ACCEPT_CIRCLE_TASK: {
				//閹恒儱褰堝顏嗗箚娴犺濮�
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new PAcceptCircTask(roleid, npckey, npcid, conf.getParam1(), true).submit();
				return true;
			}
			case NpcServiceMappingTypes.SUBMIT_CIRCLE_TASK: {
				//閹绘劒姘﹀顏嗗箚娴犺濮�
				new PSubmitCircleTask(conf.getParam1(), roleid, npckey, new java.util.ArrayList<fire.pb.npc.SubmitUnit>()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TASK: {
				//閺屻儴顕楀顏嗗箚娴犺濮�
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new fire.pb.circletask.catchit.PQueryCatchItTaskTime(roleid, npcid, conf.getParam1()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TEAM: {
				break;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_BATTLE: {
				//鏉╂稑鍙嗗顏嗗箚娴犺濮熼弰搴ㄦ祫閹亝鍨弬?
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
				//娴犵粯?褌绔存稉顏冩崲閸�?
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				int renxingtimes = sq.getRenXingCircTaskCount(roleid, conf.getParam1());
				gnet.link.Onlines.getInstance().send(roleid, new SRenXingCircleTask(serviceid, conf.getParam1(), renxingtimes, npckey));
				return true;
			}
			case NpcServiceMappingTypes.CHALLENGE_NPC: {
				//閹告垶鍨琻pc
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				boolean ret = sq.exeCircTaskBattle(roleid, npckey, conf.getParam1(), npcid);
				Module.logger.debug("閻溾晛顔峓" + roleid + "]" + "exeCircTaskBattle缂佹挻鐏�:" + ret);
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
			// TODO 閼奉亜濮╅悽鐔稿灇閻�? catch 閸�?
			Module.logger.error("閻溾晛顔峓" + roleid + "]" + "serviceid:" + serviceid + "闁挎瑨顕�");
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
		// 閹稿牽lt+B 閼惧嘲褰囬崣顖氬閸忋儱顔嶉弮蹇撳灙鐞�?
		//NPC婵傛牕濮抽崣鎴炴杹
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
		
		//serviceid -> type -> params 閺勭姴鐨犻崗宕囬兇鐞�?
		if (dealNpcServiceMapping(roleid, serviceid)) {
			Module.logger.error("NPC閺堝秴濮熼弰鐘茬殸鐞涖劌顦╅悶鍡曠啊鐟欐帟澹奫" + roleid + "]閻ㄥ嫭婀囬崝顡�" + serviceid + "].");
			return;
		}
		
		//婢跺嫮鎮婇柅浣蜂繆缁鎯婇悳顖欐崲閸旓紕娈戦張宥呭
		if (CircleTaskManager.getInstance().isSendMailService(serviceid)){
			Module.logger.info("鐟欐帟澹奫" + roleid + "]閻ㄥ嫭婀囬崝顡�" + serviceid + "]閺勵垶?浣蜂繆缁鎯婇悳顖欐崲閸斺剝婀囬崝?.");
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
		
		// 婵″倹鐏夐弰顖氬閺堫剛甯哄▔鏇炲敶npc閻ㄥ嫭婀囬崝鈽呯礉閹搭亣铔�
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
		
		//TODO 娑撳瓨妞傚ù瀣槸閹存ɑ鏋熼悽?,闂呭繑妞傞崙鍡楊槵閸掔娀娅�
		if (serviceid == 999999) {
			new fire.pb.activity.timernpc.PFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.FORTUNE_WHEEL) {
			PReqFortuneWheel pwheel = new PReqFortuneWheel(roleid, npckey, npcId, true, NpcServices.FORTUNE_WHEEL);
			pwheel.submit();
			return;
		}
		
		if (serviceid == NpcServices.LEADER_SEE_CAMPAIGN_LIST) {// 娴溠呮箙缁旂偤?澶婃倳閸�?  by changhao
			new fire.pb.school.shouxi.PSendCandidateList(roleid, npckey).submit();
			return;
		}
		if (serviceid == NpcServices.VOTING) {// 閹舵洜銈�
			new CReqCandidatesList(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CAMPAIGN) { //缁旂偤?? by changhao
			new CCheckCanElect(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CHALLENGE) {// 閹告垶鍨＃鏍ц厬
			new CChallengeShouXiDiZi(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_MY_CAMPAIGN) {// 閸掗攱鏌婃＃鏍ц厬閼宠棄濮�
			new fire.pb.school.shouxi.PMyElector(roleid, npckey).submit();
			return;
		}
		///////////////////閸愮姴鍟楃拠鏇犲仹start//////////////////////////////////////
		if (serviceid == NpcServices.WINNER_START) {// 閸欏倸濮為崘鐘插晽鐠囨洜鍋�
			new CReqStartWinner(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.FIGHT_WINNER) {
			new CStartWinnerBattle(roleid, npckey).process();
			return;
		}
		////////////////////////閸愮姴鍟楃拠鏇犲仹end//////////////////////////////////////

		
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

		//閹垫挸绱戦崘鏉跨殱閻滃楠囬悾宀勬桨
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
		
		if(serviceid == 1987){//妫板棗褰囬崣鎴濅簳閸楁艾顨涢崝?
			new PTakeWeiBoAwardProc(roleid).submit();
			return;
		}

		// PvP閺堝秴濮熼惃鍕槱閻�?
		IPvPServiceHandle sHandle = PvPServiceHandleFactory.create(serviceid);
		if (sHandle != null) {
			sHandle.handle(roleid, serviceid);
			return;
		}

		if (BingFengLandMgr.bingFengServiceids.contains(serviceid)) {
			new PBattletoBingFeng(roleid, npcId).submit();
			return;
		}

		//閺�鎯х磾閸擃垱婀版禒璇插
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

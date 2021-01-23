
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
			//NPC闁哄牆绉存慨鐔煎及閻樿尙娈搁悶娑栧姂閸ｇ兘宕ラ崟顏堝殝缂侇偉顕ч悗鐑芥儍閸曨偄寰斿ù锝嗘尭閻ゅ嫰鎮�?
			switch (curType) {
			case NpcServiceMappingTypes.NONE: {
				break;
			}
			case NpcServiceMappingTypes.ACCEPT_CIRCLE_TASK: {
				//闁规亽鍎辫ぐ鍫濐嚗椤忓棗绠氬ù鐘侯嚙婵拷
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new PAcceptCircTask(roleid, npckey, npcid, conf.getParam1(), true).submit();
				return true;
			}
			case NpcServiceMappingTypes.SUBMIT_CIRCLE_TASK: {
				//闁圭粯鍔掑锕�顕ラ鍡楃畾濞寸姾顕ф慨锟�
				new PSubmitCircleTask(conf.getParam1(), roleid, npckey, new java.util.ArrayList<fire.pb.npc.SubmitUnit>()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TASK: {
				//闁哄被鍎撮妤�顕ラ鍡楃畾濞寸姾顕ф慨锟�
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new fire.pb.circletask.catchit.PQueryCatchItTaskTime(roleid, npcid, conf.getParam1()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TEAM: {
				break;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_BATTLE: {
				//閺夆晜绋戦崣鍡楊嚗椤忓棗绠氬ù鐘侯嚙婵喖寮版惔銊︾カ闁诡剦浜濋崹顒勫棘?
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
				//濞寸姷绮�?瑜岀粩瀛樼▔椤忓啯宕查柛锟�?
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				int renxingtimes = sq.getRenXingCircTaskCount(roleid, conf.getParam1());
				gnet.link.Onlines.getInstance().send(roleid, new SRenXingCircleTask(serviceid, conf.getParam1(), renxingtimes, npckey));
				return true;
			}
			case NpcServiceMappingTypes.CHALLENGE_NPC: {
				//闁瑰憡鍨堕崹鐞籶c
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				boolean ret = sq.exeCircTaskBattle(roleid, npckey, conf.getParam1(), npcid);
				Module.logger.debug("闁绘壕鏅涢宄�" + roleid + "]" + "exeCircTaskBattle缂備焦鎸婚悘锟�:" + ret);
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
			// TODO 闁煎浜滄慨鈺呮偨閻旂鐏囬柣锟�? catch 闁革拷?
			Module.logger.error("闁绘壕鏅涢宄�" + roleid + "]" + "serviceid:" + serviceid + "闂佹寧鐟ㄩ锟�");
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
		// 闁圭鐗絣t+B 闁兼儳鍢茶ぐ鍥矗椤栨艾顫ｉ柛蹇嬪劚椤斿秹寮箛鎾崇仚閻烇拷?
		//NPC濠靛倹鐗曟慨鎶藉矗閹寸偞鏉�
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
		
		//serviceid -> type -> params 闁哄嫮濮撮惃鐘诲礂瀹曞洭鍏囬悶锟�?
		if (dealNpcServiceMapping(roleid, serviceid)) {
			Module.logger.error("NPC闁哄牆绉存慨鐔煎及閻樿尙娈搁悶娑栧妼椤︹晠鎮堕崱鏇犲晩閻熸瑦甯熸竟濂�" + roleid + "]闁汇劌瀚﹢鍥礉椤★拷" + serviceid + "].");
			return;
		}
		
		//濠㈣泛瀚幃濠囨焻娴ｈ渹绻嗙紒顐ヮ嚙閹﹪鎮抽娆愬床闁告棑绱曞▓鎴﹀嫉瀹ュ懎顫�
		if (CircleTaskManager.getInstance().isSendMailService(serviceid)){
			Module.logger.info("閻熸瑦甯熸竟濂�" + roleid + "]闁汇劌瀚﹢鍥礉椤★拷" + serviceid + "]闁哄嫷鍨�?娴ｈ渹绻嗙紒顐ヮ嚙閹﹪鎮抽娆愬床闁告柡鍓濆﹢鍥礉?.");
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
		
		// 濠碘�冲�归悘澶愬及椤栨艾顥岄柡鍫墰鐢搫鈻旈弴鐐叉暥npc闁汇劌瀚﹢鍥礉閳藉懐绀夐柟鎼海閾旓拷
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
		
		//TODO 濞戞挸鐡ㄥ鍌毭圭�ｎ厾妲搁柟瀛樕戦弸鐔兼偨?,闂傚懎绻戝鍌炲礄閸℃妲甸柛鎺斿█濞咃拷
		if (serviceid == 999999) {
			new fire.pb.activity.timernpc.PFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.FORTUNE_WHEEL) {
			PReqFortuneWheel pwheel = new PReqFortuneWheel(roleid, npckey, npcId, true, NpcServices.FORTUNE_WHEEL);
			pwheel.submit();
			return;
		}
		
		if (serviceid == NpcServices.LEADER_SEE_CAMPAIGN_LIST) {// 濞存籂鍛畽缂佹梻鍋�?婢跺﹥鍊抽柛锟�?  by changhao
			new fire.pb.school.shouxi.PSendCandidateList(roleid, npckey).submit();
			return;
		}
		if (serviceid == NpcServices.VOTING) {// 闁硅埖娲滈妶锟�
			new CReqCandidatesList(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CAMPAIGN) { //缂佹梻鍋�?? by changhao
			new CCheckCanElect(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CHALLENGE) {// 闁瑰憡鍨堕崹顒侊純閺嵮嗗幀
			new CChallengeShouXiDiZi(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_MY_CAMPAIGN) {// 闁告帡鏀遍弻濠冿純閺嵮嗗幀闁煎疇妫勬慨锟�
			new fire.pb.school.shouxi.PMyElector(roleid, npckey).submit();
			return;
		}
		///////////////////闁告劗濮撮崯妤冩嫚閺囩姴浠箂tart//////////////////////////////////////
		if (serviceid == NpcServices.WINNER_START) {// 闁告瑥鍊告慨鐐哄礃閻樻彃鏅介悹鍥ㄦ礈閸嬶拷
			new CReqStartWinner(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.FIGHT_WINNER) {
			new CStartWinnerBattle(roleid, npckey).process();
			return;
		}
		////////////////////////闁告劗濮撮崯妤冩嫚閺囩姴浠筫nd//////////////////////////////////////

		
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

		//闁瑰灚鎸哥槐鎴﹀礃閺夎法娈遍柣婊冾儏妤犲洭鎮惧畝鍕〃
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
		
		if(serviceid == 1987){//濡澘妫楄ぐ鍥矗閹存繀绨抽柛妤佽壘椤ㄦ盯宕�?
			new PTakeWeiBoAwardProc(roleid).submit();
			return;
		}

		// PvP闁哄牆绉存慨鐔兼儍閸曨偒妲遍柣锟�?
		IPvPServiceHandle sHandle = PvPServiceHandleFactory.create(serviceid);
		if (sHandle != null) {
			sHandle.handle(roleid, serviceid);
			return;
		}

		if (BingFengLandMgr.bingFengServiceids.contains(serviceid)) {
			new PBattletoBingFeng(roleid, npcId).submit();
			return;
		}

		//闁猴拷閹呯＞闁告搩鍨卞﹢鐗堢鐠囨彃顫�
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


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
			//NPC闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎮疯閹矂骞樼紒妯猴拷鍨箾閹寸儐浼嗛柟杈剧畱閻鐓崶銊р檨闁绘挾鍠栭弻锟犲礃閵娿儻鎷烽崫銉︽殰闁割偅娲橀悡鏇熺箾閸℃鐛滈棅顒夊墴閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾盯鈥﹂幋婵囩亾濠殿噯绲婚崹褰掑煘閹达附鍊烽柤纰卞墮椤わ拷闂備浇顕栭崰鏍磹閸ф宓侀柛鎰典簼瀹曞鎮跺☉鎺戝⒉妞ゎ偄绉瑰娲传閸曨喚妾ㄩ梺鍛婂姉閸嬫挾绱為崱娑欌拻闁稿本鐟х粣鏃�绻涢懝鏉垮惞鐎垫澘锕畷绋课旈敓鐣岀矆閸屾稐绻嗘い鏍ㄧ箖椤忕娀鏌￠崱顓犵暤闁哄本娲樺鍕幢濡崵褰呯紓鍌欑筏閹风兘鎮楅敐搴′簴濞存粍绮撻悡顐﹀炊閵婏箑鏆楁繝鈷�鍕缂佺粯鐩畷濂告偄閾忓湱鏆紓鍌欐祰妞存悂骞愰懡銈囩當闁绘梻鍘ч悙濠勬喐瀹�鍕闁芥ê顦藉〒濠氭煏閸繃顥為柤鑼█閺屾盯濡烽敐鍛瀳闂佽法鍠撻弲顐﹀极婵犳艾钃熼柨婵嗩槸缁狅綁鏌ㄥ┑鍡樺晽闁瑰墽绮悡鏇㈠箹鏉堝墽纾块弫鍫ユ⒑閸濆嫭婀伴柣鈺婂灠椤曪綁骞橀鍢夆晠鏌曟径鍫濓拷妤呮儎鎼淬劍鐓熼幖杈剧稻閺嗏晛顭胯椤ㄥ﹤顕ｆ繝姘╅柍鍝勫�婚悾鎶芥⒒閸屾瑧鍔嶉悗绗涘懏宕查柛灞绢嚤濞戞ǚ鏋庨柟瀛樼矌閸撱劌顪冮妶鍡樺蔼闁搞劍妞介幃锟犳偄閸忚偐鍘梺鍓插亝缁诲啴宕崇憴鍕╀簻闊浄绲藉顕�鏌″畝锟介崰鏍�佸璺哄耿婵☆垯璀︽导锟�?
			switch (curType) {
			case NpcServiceMappingTypes.NONE: {
				break;
			}
			case NpcServiceMappingTypes.ACCEPT_CIRCLE_TASK: {
				//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑﹦绋忔繝銏ｆ硾椤戝洭銆呴幓鎹楀綊鎮╁顔煎壈缂佺偓鍎冲鈥愁嚕閸洖閱囨い鎰垫線缁ㄥ瓨绻涚�涙鐭婄紓宥咃躬瀵鈽夐姀鈺傛櫇闂佹寧绻傚ú銊╊敇婵傚憡鈷戦柟鑲╁仜閿熻姤鐗犻妴鍐幢濞戞锕傛煕閺囥劌鏋ら柣銈忔嫹闂備礁婀遍崑鎾诲箚鐏炶娇娑㈡倷閻㈢數锛濇繛杈剧到閹碱偅鐗庨梻浣哄帶缂嶅﹦绮婚弽褝鑰垮〒姘炬嫹婵﹨娅ｇ槐鎺懳熻箛姘汗闁瑰嘲鍟撮弫鍐磼濮橆剚鍎繝鐢靛仜濡鎹㈤崱娑樼哗闁兼亽鍎禍婊堟煛閸モ晛浠︽い銉у仱閹顫濋悙顒�顏�
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new PAcceptCircTask(roleid, npckey, npcid, conf.getParam1(), true).submit();
				return true;
			}
			case NpcServiceMappingTypes.SUBMIT_CIRCLE_TASK: {
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣埖鍔栭悡娆撴煟閹寸伝顏堟倿閻愵剛绠鹃悘蹇旂墬濞呭﹪鏌＄仦璇插鐎殿喗鎸抽、鏃堝川椤撗傜处婵犵绱曢崑鎴﹀磹閺嶎灐楦跨疀濞戞锛熼梺姹囧灪閹爼鏁撻幋鎺旂獢鐎殿噮鍣ｅ畷鐓庘攽閸℃熬鎷烽崹顔规斀閹烘娊宕愰弴銏犵柈濞村吋娼欏Ч鏌ユ煛婢跺﹦姘ㄩ柡锟芥禒瀣厽闁归偊鍓氶埢鏇㈡煕閵堝洤鏋庨柍瑙勫灴椤㈡岸鏁撻悾宀�涓嶉柡宥庡幑閿熸垝绀侀～婵嬪箛娴ｅ墣顏堟⒒娓氾拷閿熻姤绋撻埞鎺楁煕閺冿拷閸ㄥ灝顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
				new PSubmitCircleTask(conf.getParam1(), roleid, npckey, new java.util.ArrayList<fire.pb.npc.SubmitUnit>()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TASK: {
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑧绱撴担闈涚仼婵炲懏锕㈤弻鈩冩媴閸撴彃鍓辨繛锝呮搐閿曨亝淇婇幆鎵杸闁哄倹顑欐导鎾斥攽閿涘嫬浜奸柛濠冪墪鐓ら煫鍥ㄧ☉绾惧潡鏌ｉ姀鈩冨仩闁跨喐鍨濈欢姘嚕椤曪拷瀹曠厧鈹戦崱姘炬嫹閸喒鏀介幒鎶藉磹閺囥垹鐤ù鍏兼綑濮规煡鏌℃径濠勬皑闁猴拷娴犲鐓熼柟閭﹀墯閳绘洟鏌涢妶鍥ф瀻闁宠鍨块、姘舵晸閻ｅ瞼涓嶉柡宥庡幑閿熸垝绀侀～婵嬪箛娴ｅ墣顏堟⒒娓氾拷閿熻姤绋撻埞鎺楁煕閺冿拷閸ㄥ灝顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new fire.pb.circletask.catchit.PQueryCatchItTaskTime(roleid, npcid, conf.getParam1()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TEAM: {
				break;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_BATTLE: {
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾稑娅ч梺娲诲幗閻熲晠寮婚悢鍛婄秶闁告挆鍛闂備焦妞块崢浠嬨�冩繝鍥ц摕婵炴垯鍨归悞娲煕閹邦喖浜炬い鎾崇秺濮婃椽骞栭悙璇ф嫹閺嶎厹锟藉啴宕卞☉妯滐箓鏌涢弴銊ユ灓闁汇倧鎷烽梻浣告贡閸嬫捇骞嗙仦杞挎盯鎮欓悽鐢碉紳婵炶揪绲介幖顐ｇ墡闂備胶鍘х紞濠勭不閺嵮嶈�垮〒姘炬嫹婵﹨娅ｇ槐鎺懳熻箛姘汗闁瑰嘲鍟撮弫鍐磼濮橆剚鍎繝鐢靛仜濡鎹㈤崱娑樼哗闁兼亽鍎禍婊堟煛閸愭寧瀚归梺绋垮婵炲﹤顕ｇ粙搴撴婵鍋撶�氳绻涢崼婵堜虎闁哄鍊曢…鑳槼妞ゃ劌锕悰顕�宕卞☉妯肩潉闂佸壊鍋呴幆濠囧煛閸涱喚鍙嗛梺鍝勫�归崕宕囷拷姘叄閺屾稓锟斤綆鍋勫ù顔芥叏婵犲嫮甯涢柟宄版噽缁數锟斤綆浜濋悾浼存⒒娴ｅ憡鍟為柟纰卞亰濮婁粙宕熼鐘电効閻庡箍鍎遍幊澶愬绩娴犲鍊甸柨婵嗙凹缁ㄥ鏌ｆ惔顔煎箹妞ゎ亜鍟存俊鍫曞幢濡ゅ啰鎳嗛梺璇插閸戝綊宕滃▎鎺斾罕闂備浇娉曢崳锕傚箯閿燂拷?
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
				//濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愰—鍐拷锝庝邯椤庢鏌涢妸锔剧疄闁哄被鍔戦幃銈夊磼濞戞﹩浼�?闂傚倷娴囧畷鐢稿窗閹邦喖鍨濈�癸拷閸曨剙鍓堕梺鍏肩ゴ閺呮盯宕瑰┑瀣厓闁告繂瀚弸锕傛煙瀹勬澘妲婚柍钘夘槸閳诲骸螣閻撳骸楔闂傚倷绀佺壕顓犲垝椤栨凹娼栫憸鐗堝笒妗呴梺鍛婃处閸犳岸鎮块敓浠嬫⒑鐟欏嫬绀冩繛鍛礀閳绘捇寮婚妷锕�锟界敻鎮峰▎蹇擃仾缂侊拷閸愵喗鐓熼柟鍨缁★拷閻庢鍠涢褔鍩ユ径鎰潊闁斥晛鍟鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				int renxingtimes = sq.getRenXingCircTaskCount(roleid, conf.getParam1());
				gnet.link.Onlines.getInstance().send(roleid, new SRenXingCircleTask(serviceid, conf.getParam1(), renxingtimes, npckey));
				return true;
			}
			case NpcServiceMappingTypes.CHALLENGE_NPC: {
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼幑鎰靛殭缂佺姷鍠栭弻銊╂偄閸濆嫅銏ゆ煕閵娿儱锟藉潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉╂⒑閹肩偛濡奸柛濠傛健瀵鏁愭径瀣拷鐑芥⒒閸喎鍠曢柟宄板槻閻ｏ繝鏁撻敓锟�
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				boolean ret = sq.exeCircTaskBattle(roleid, npckey, conf.getParam1(), npcid);
				Module.logger.debug("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘偩鐏炴儳娈岄柣搴㈢閹倿鐛箛娑欐櫢闁跨噦鎷�" + roleid + "]" + "exeCircTaskBattle缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹閸濄儳涓嶉柡澶婄氨閺�浠嬫煟濡櫣锛嶆い锝嗙叀閺屾稒绻濋崒婊冪厽闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷:" + ret);
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
			// TODO 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫澪ラ柛鎰ㄦ櫆閸庣喖鏌曡箛瀣労婵炶尙顭堥埞鎴︽偐鐠囇冧紣闁诲孩鍑归崣鍐ㄧ暦閿濆牏鐤�婵炴垶鐟ч崢鎾绘⒑閸涘﹦绠撻悗姘煎弮瀹曞啿煤椤忓懐鍘遍柣搴祷閸斿本鎱ㄩ崒鐐寸厸鐎癸拷鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘围闁搞儜鍐冾亪姊婚崒娆愮グ妞ゆ泦鍛床闁归偊鍎ú顏嶆晣闁靛繒濮鹃幗鏇㈡⒑閹稿海绠撴い锔垮嵆瀵煡骞栨担鍦弳闂佺粯娲栭崐鍦拷姘炬嫹? catch 闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掕棄鈹戦悩瀹犲缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘偩鐏炴儳娈岄柣搴㈢閹倿鐛箛娑欐櫢闁跨噦鎷�" + roleid + "]" + "serviceid:" + serviceid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弮锟介幏婵嬪箯妞嬪海绠旀繛鎴炆戞径鍕煕鐎ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹");
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
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔顕�鏁撻弬銈囩暤鐎规洖銈告俊鐑芥晝閿熻姤绂嶆潏鈺冪＝濞达絽鎲￠埢鏇㈡煛瀹�瀣+B 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮濡炪倖姊婚崢褔锝為埡鍛拺婵炶尪顕ч獮妤併亜閵娿儲顥㈠┑锛勬暬瀹曠喖顢涘顒�鏁ら梻渚�娼ч…鍫ュ礉瀹�鍕婂鈹戦崱鈺傚瘜闂侀潧鐗嗘鍛婄閸撗呯＝鐎广儱瀚粣鏃傦拷娈垮枦椤曆囧煡婢跺鐓ラ柛娑卞灡濠㈡垿姊虹拠鎻掑毐缂傚秴妫欑粋宥咁煥閸曨剙寮块柟鑲╄ˉ濡插懎銆掓繝姘厪闁割偅绻冮ˉ鐐烘煟閹惧崬鍔ょ紒杈ㄥ笚瀵板嫮浠﹂幆褎鐣俊鐐�栧ú鈺冪礊娓氾拷閵嗕礁鈻庨幋鐐茬／闂侀潧臎閸曨剛甯嗛梻鍌氬�峰ù鍥綖婢舵劕纾跨�规洖娲らˉ姘亜閹捐泛鏋旀い鈺呮敱閹便劌螣閸喚鍘梺缁樻尵閸犳牠寮婚敐澶婄婵犻潧娲らˇ鈺呮煟鎼淬垻鍟查柟鍑ゆ嫹?
		//NPC濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳婀遍幉鎼佹偋閸繄鐟查梺绋款儏椤戝寮婚敓鐘茬倞闁宠桨鐒﹂悗楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鎮㈤悡搴ｇ暰闂佺粯顨呴悧婊兾涢崟顖涒拺婵炶尪顕ч獮妤併亜閵娿儻韬�殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灪椤旀牠鎮為幆顬″綊鎮崨顖滄殼闂佸搫澶囬崜婵嗩嚗閸曨偀妲堟繛鍡楁禋娴硷拷
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
		
		//serviceid -> type -> params 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔筋焽閸樠囧几閻斿吋鐓欏〒姘仢婵倹顨ラ悙杈捐�挎い銏＄懇閹稿﹥寰勬繝鍌ゆ闂傚倸鍊烽懗鍓佸垝椤栫偐锟斤箓宕奸妷顔芥櫔閻熸粌绻掗崚鎺楀醇閵夈儳锛滃┑鐘诧攻閸旀牜锟芥艾缍婇幃宄扳枎韫囨搩浠剧紓渚婃嫹闁跨喕妫勯埞鎴︽倷閸欏鏋欓梺鍛婄懃閸燁偊鎮惧畡鎷旀棃宕ㄩ鐘诧拷鐐差渻閵堝棗绗傜紒锟芥担鍦浄闁冲搫鎳忛埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓?
		if (dealNpcServiceMapping(roleid, serviceid)) {
			Module.logger.error("NPC闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎮疯閹矂骞樼紒妯猴拷鍨箾閹寸儐浼嗛柟杈剧畱閻鐓崶銊р檨闁绘挾鍠栭弻锟犲礃閵娿儻鎷烽崫銉︽殰闁割偅娲橀悡鏇熺箾閸℃鐛滈棅顒夊墴閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾盯鈥﹂幋婵囩亾濠殿噯绲婚崹褰掑煘閹达附鍊烽柤纰卞墮椤わ拷闂備浇顕栭崰鏍磹閸ф宓侀柛鎰典簼瀹曞鎮跺☉鎺戝⒉妞ゎ偄绉瑰娲传閸曨喚妾ㄩ梺鍛婂姇婢т粙鏁撻崐鐔哥彧濞ｅ洤锕幃娆擃敂閸曡埖瀚圭憸鏃堝箠濞嗘帇浜归柟鐑樺灩閺屟囨⒑缂佹﹩鐒炬い鏇嗗懐涓嶉柡宥庡幗閻撴洘銇勯幇鍓佺ɑ缂侊拷閿熻棄螖閻橀潧浜奸柛銊ょ矙瀵鏁撻悩鑼�為梺瀹犳〃缁插潡濮�閵堝棛鍘搁梺鍛婁緱娴滄繂鈻嶆繝鍥ㄧ厸鐎癸拷鐎ｎ剛袦闂佽鍠撻崹钘夌暦椤愶箑唯闁挎洩鎷锋繛鍛殜濮婂搫效閸パ呭姶闂佹悶鍔嶆繛濠傜暦娴兼潙绠涙い鏃�鍎冲畷銉╂⒑缂佹ɑ鐓ラ柟鑺ョ矒濮婁粙宕熼娑氬弳闂佺粯娲栭崐鍦拷姘炬嫹" + roleid + "]闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸涘♁顏堝Χ閹间礁鏋侀柛鎰靛枛椤懘鏌曢崼婵囧櫧闁稿﹦鍋涢—鍐Χ閸℃鍤嬮梺鍦厴椤ユ挾妲愰幒妤佹櫢闁兼亽鍎辩欢鐐烘倵閿濆啫濡虹紒銊ヮ煼濮婅櫣锟藉湱濮甸ˉ澶愭煙閸愯尙绠抽柨鐔诲Г閻旑剟骞忛敓锟�" + serviceid + "].");
			return;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣亗閹兼番鍨昏ぐ搴繆閵堝洤啸闁稿鐩畷顖烆敍濠婂嫬搴婂┑鐘绘涧椤戝懘鎮欐繝鍥ㄧ厪濠电倯鍐ㄦ殭閸熺鈹戦悩鍨毄闁稿濞�楠炴捇顢旈崱娆戭槸闂佽法鍠曟慨銈囨崲濞戙垹绠婚柧蹇ｅ亯绾拷闂備胶鎳撶粻宥夊垂閽樺鏆﹂柛妤冨亹閺嬪酣鏌熺�电顎撶紒鍗炲级娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夐柟杈剧畱绾炬寧绻涘顔荤盎闁告俺顫夌换娑㈠幢濡闉嶉梺缁樻尰閻燂箓濡甸崟顖氬唨闁靛ě鍐╂闂傚倸顭崜锕傚礈閻旂厧钃熼柣鏃傗拡閺佸﹪鏌﹀Ο渚Т闁哄鐟ラ—鍐Χ閸愩劎浠剧紓浣割儐閸ㄥ潡宕洪姀鈩冨劅闁靛鍎抽悿锟芥俊鐐�栫敮顏堝箯妞嬪海纾奸柕濠忕到閸旓附鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸屾稒鐣煎┑鐘殿暯濡插懘宕戦崨鏉戝瀭闁荤喐瀚堥敐澶婄疀闁哄鐏濆畵鍡涙⒑缂佹ê濮�闁哄懏绮撻幃妯荤瑹閿熻棄顫忛搹瑙勫厹闁告侗鍠栧☉褏绱撴担鍝勑ｉ柛銊ョ秺閺佹捇鎳為妷銊ヮ棟濡炪倧绠撴禍鍫曞极閹剧粯瀵犲璺虹灱閺嗘盯姊虹粙鍧楀弰濞存粌鐖奸悰顔界節閸愨晛鍔呭銈庡幗鐢偟绮欒箛娑欌拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
		if (CircleTaskManager.getInstance().isSendMailService(serviceid)){
			Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸涘♁顏堝Χ閹间礁鏋侀柛鎰靛枛椤懘鏌曢崼婵囧櫧闁稿﹦鍋涢—鍐Χ閸℃鍤嬮梺鍦厴椤ユ挾妲愰幒妤佹櫢闁兼亽鍎辩欢鐐烘倵閿濆啫濡虹紒銊ヮ煼濮婅櫣锟藉湱濮甸ˉ澶愭煙閸愯尙绠抽柨鐔诲Г閻旑剟骞忛敓锟�" + serviceid + "]闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕缂傚秴锕顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩獮姗�鎼归銉ь攨闂備胶鎳撶粻宥夊垂閽樺鏆﹂柛妤冨亹閺嬪酣鏌熺�电顎撶紒鍗炲级娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夐柟杈剧畱绾炬寧绻涘顔荤盎闁告俺顫夌换娑㈠幢濡闉嶉梺缁樻尰閻燂箓濡甸崟顖氬唨闁靛ě鍐╂闂傚倸顭崜锕傚礈閻旂厧钃熼柣鏃傗拡閺佸﹪鏌﹀Ο渚Т闁哄鐟ラ—鍐Χ閸愩劎浠剧紓浣割儐閸ㄥ潡宕洪姀鈩冨劅闁靛鍎抽悿锟芥俊鐐�栫敮顏堝箯妞嬪海纾奸柕濠忕到閸旓附鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸屾稒鐣奸梻鍌欑閹碱偊鎯屾径灞惧床婵犻潧妫涢弳锔界節婵犲倸鏆婇柡锟芥禒瀣厱闁宠棄妫楀銊╂煥閻旂粯顥夋繛纭风節瀵鈽夐姀鐘栥劍銇勯弮鍌氬付妞ゎ偀鏅濈槐鎾寸瑹婵犲啫顏堕梻浣芥硶閸ｏ箓骞忛敓锟�?.");
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
		
		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒瀚悡鐘垫喐閻楀牆绗ч柣锝嗘そ閹稿﹪鎮㈤悮瀛樺闁谎冩啞鐎氬綊姊洪崨濠冨闁告挻鐩畷銏ゅ箹娴ｅ厜鎷洪梺鍛婃尰瑜板啯绂嶆禒瀣厱閻庯綆浜滈顏堟煛閸涙澘鐓愰悗浣冨亹閿熻姤绋掗敋濞寸姴鎼—鍐Χ閸℃瑥顫х紒鐐緲缁夊綊鐛崱娑橀唶闁靛濡囬崢鎾剁磽閸屾瑧鍔嶉拑杈ㄣ亜閵夈儳澧㈤柨鐔诲Г椤旀牠宕板Δ鍛闁规儼妫勭粻鏍ㄧ箾閸℃ɑ灏柣顓燁殔椤法鎹勬笟顖氬壉濡炪倖姊归弨绨哻闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸涘♁顏堝Χ閹间礁鏋侀柛鎰靛枛椤懘鏌曢崼婵囧櫧闁稿﹦鍋涢—鍐Χ閸℃鍤嬮梺鍦厴椤ユ挾妲愰幒妤佹櫢闁兼亽鍎辩欢鐐烘煙闁箑骞橀柛妯绘崌濮婃椽鎳為妷鍐句邯钘濆ù鍏兼綑闂傤垶鏌ｉ敐鍛伇缁炬儳銈搁弻銊╂偄鐠囨畫鎾讹拷鍨緲鐎氫即鐛崶顒夋晣闁绘ɑ褰冪粻銉╂⒒閸屾瑧顦︽繝锟介柆宥呯厱闁割偁鍎遍崒銊╂煕濠靛棗鈻曠憸鐗堝笚閸婂鏌ら幁鎺戝姢闁告瑥瀚板娲传閸曨偅娈查梺瑙勭摃瀹曠敻鏁撻懞銉у暡闁瑰嚖鎷�
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
		
		//TODO 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎电濡介梺绋款儍閸婃繈寮婚弴鐔虹闁割煈鍠栨慨璺衡攽閻愬瓨灏い顓犲厴瀵鈽夊顐ｅ媰缂傚倷闄嶉崹鐟扳枔瑜斿娲閳轰胶妲ｉ梺鍛婄懃缁绘﹢鐛箛娑欏�婚柤鎭掑劜濞呮粓鏌熼懖鈺勊夐柨鐔绘绾绢參顢欓幒鎾剁瘈缁剧増锕幏鐑藉礃閼碱剟鐛撻梻浣筋嚃閸犳牠宕愰崹顕呭殨濠电姵纰嶉崑鍕煟濮橆剛鎽犻悗姘愁潐缁绘盯骞嬮悙鍨櫍闂佽法鍠撻弲顐﹀磻閵堝宓侀悗锝庡枟閺呮繈鏌ㄩ悢鍓佺煓鐎规洘鐟╅幃鈺冪磼濡厧骞楅梻浣告惈閸婃悂鎮樺┑瀣畺闁硅揪闄勯悡鏇㈡倵閿濆牆鐓愰悗姘炬嫹?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缂佺姷濞�楠炴牗娼忛崜褏蓱閻庤娲橀悡锟犲蓟閻旂尨鎷峰☉娆樼劷缂佺姰鍎茬换娑㈠箻閹颁胶鍚嬮梺鍝勬湰缁嬫垿鎮惧┑瀣櫢濞寸姴顑呯壕缁樼箾閹寸偞鐨戦柣顓炴閺屾盯寮撮妸銉т画闂佺粯鎸诲ú鐔煎蓟瀹ュ鐓涘ù锝呮啞閻忔挸鈹戦悙鑼闁搞劎鍎ょ粚杈ㄧ節閸ャ劌娈ゅ銈嗗笂閻掞箑袙閸儲鈷戦柛婵嗗濠�浼存煟閳哄﹤鐏﹂柣娑卞櫍楠炴帒螖閿熻棄螞濮楋拷楠炴牜锟芥稒蓱鐏忎即鏌ｆ惔锝咁暭缂佺粯绻堥幃浠嬫濞戞鎹曢梻浣哥秺閺�閬嶅垂閸ф宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘
		if (serviceid == 999999) {
			new fire.pb.activity.timernpc.PFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.FORTUNE_WHEEL) {
			PReqFortuneWheel pwheel = new PReqFortuneWheel(roleid, npckey, npcId, true, NpcServices.FORTUNE_WHEEL);
			pwheel.submit();
			return;
		}
		
		if (serviceid == NpcServices.LEADER_SEE_CAMPAIGN_LIST) {// 濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鎳庨弳妤呮⒑缁嬭法鐏遍柛瀣☉椤斿繐鈹戦崶銉ょ盎闂佸搫鍊搁悘婵嬪煕閺冨牊鐓涢柛鈾�鏅涢悘锝囩磼鏉堛劍宕岀�规洘甯掗埢搴ㄥ箣濠靛棭鐎村┑鐘愁問閸犳牠鏁冮妶澶嗭拷锕�鐣￠幍顔芥闂佺鎻梽鍕疾閹间焦鐓ラ柣鏇炲�圭�氾拷?婵犵數濮烽弫鍛婃叏娴兼潙鍨傞柣鎾崇岸閺嬫牗绻涢幋娆忕仾闁哄懏绻堥弻鏇熷緞閸℃ɑ鐝旂紒鐐劤缂嶅﹪寮婚悢鐓庣畾闁哄鏅濋幘缁樼厽闁规儳鐡ㄧ粈瀣煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�?  by changhao
			new fire.pb.school.shouxi.PSendCandidateList(roleid, npckey).submit();
			return;
		}
		if (serviceid == NpcServices.VOTING) {// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磸閿熸垝鐒︾换婵嬪炊瑜庡Σ顒勬⒑閸濆嫮鈻夐柣蹇斿姍瀹曨偊宕熼悽闈涘汲闂備礁澹婇崑鍛村箚婵犲拋妯勯梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�
			new CReqCandidatesList(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CAMPAIGN) { //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴顏呭濡炪値鍋勭换鎴犳崲濠靛棭娼╂い鎺戝亰缁遍亶姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?? by changhao
			new CCheckCanElect(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CHALLENGE) {// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼幑鎰靛殭缂佺姷鍠栭弻銊╂偄閸濆嫅銏ゆ煕閵娿儱锟藉潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉╂⒑閹肩偛濡奸柛濠傜秺婵＄敻宕熼姘鳖唺閻庡箍鍎卞ú銊╂偤濡偐纾藉ù锝勭矙閸濈儤淇婇銏犳殻鐎殿喖顭烽崹鎯х暦閸ャ劍顔撴俊鐐�栭弻銊╁触鐎ｎ啟澶婎煥閸曞灚顔旈梺缁樺灥濞诧妇锟芥熬鎷�
			new CChallengeShouXiDiZi(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_MY_CAMPAIGN) {// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣芥硶閸犳挻鎱ㄧ�靛摜纾奸柍鍝勬噺閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箯閹达附鍋勯悘蹇庣劍閺傦拷闂備胶绮摫鐟滄澘鍟村鎼佹晜閸撗咃紲闁哄鐗勯崝宥壦夐崼銉︾厸閻忕偤娼婚幏宄扮暦閸ャ劍顔撴俊鐐�栭弻銊╁触鐎ｎ啟澶婎煥閸曞灚顔旈梺缁樺灥濞诧妇锟芥艾缍婂濠氬磼濮橆剨鎷烽悜鑺ュ殑闁割偅娲栭崒銊ф喐閺冨牆绠栭柛褎顨呴悙濠冦亜椤掑澧柣鈺婂灠閻ｇ兘鎮㈢喊杈ㄦ櫌婵炶揪绲块…鍫熷鎼淬劍鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷
			new fire.pb.school.shouxi.PMyElector(roleid, npckey).submit();
			return;
		}
		///////////////////闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲锋繝寰锋澘锟芥捇鎮為敃鍌氱煑闊洦绋掗悡娆戠磽娴ｉ潧鐏╅柡瀣洴閺岋綁濡舵惔鈩冪亶婵烇絽娲ら敃顏呬繆閸洖宸濇い鎾跺枑椤斿姊虹拠鎻掝劉缁炬澘绉撮悾婵嬪箹娴ｆ瓕鎽曢梺璺ㄥ枔婵挳鎮欐繝鍥ㄧ厓閺夌偞澹嗛幃濂告煏韫囨洖违鐟滅増甯楅崑鎰版煟閵忕姷浠涙繛鍫熺崺art//////////////////////////////////////
		if (serviceid == NpcServices.WINNER_START) {// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻渚�娼чˇ顐﹀疾濞戞艾顥氱憸鐗堝笚閻撴洘绻涢幋鐑囧叕闁猴拷婵犳碍鐓曟繛鍡楃箳缁犲鏌″畝瀣М妤犵偛娲、妤佹媴閻熸澘澹嶇紓鍌氬�风欢銈夊箯閻戣姤鐓曢柟浼存涧閺嬬喖鏌ｉ幘璺烘瀾濞ｅ洤锕、娑樷攽閹邦剚顔勭紓鍌欑劍瑜板啴鈥﹂悜钘夎摕闁跨喓濮村婵囥亜閹烘垵锟藉鎮￠幘缁樷拺閻犲洠锟借櫕鐏堢紓鍌氱Т閿曘倝鎮鹃悜钘夐唶闁哄洨鍊ｉ埡鍛叆闁哄啫鍊藉鍛婁繆閹绘帞鍩ｆ慨濠勭帛閹峰懏绗熼婊冨Ъ婵＄偑鍊栭崹鍫曞垂閸ф宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘
			new CReqStartWinner(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.FIGHT_WINNER) {
			new CStartWinnerBattle(roleid, npckey).process();
			return;
		}
		////////////////////////闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲锋繝寰锋澘锟芥捇鎮為敃鍌氱煑闊洦绋掗悡娆戠磽娴ｉ潧鐏╅柡瀣洴閺岋綁濡舵惔鈩冪亶婵烇絽娲ら敃顏呬繆閸洖宸濇い鎾跺枑椤斿姊虹拠鎻掝劉缁炬澘绉撮悾婵嬪箹娴ｆ瓕鎽曢梺璺ㄥ枔婵挳鎮欐繝鍥ㄧ厓閺夌偞澹嗛幃濂告煏韫囨洖违鐟滅増甯楅崑鎰箾閸繄浠㈠┑锛勭殸d//////////////////////////////////////

		
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

		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛濠呭煐閹便劌螣閹稿海銆愮紓浣哄С閸楁娊寮诲☉妯锋斀闁告洦鍋勬慨鏇烆渻閵堝骸浜濇繛鑼枛瀵鎮㈤崨濠勭Ф闂佸憡鎸嗛崨顔筋啅缂傚倸鍊风欢銈夊箯閻戣姤鐓曢柟浼存涧閺嬬喖鏌ｉ幘瀵糕槈妞ゎ叀娉曢幑鍕传閸曢潧濡风紓浣鸿檸閸欙拷闁糕晜鐗滈幑銏犫槈閵忕娀鍞堕梺闈涱槶閸婃牠宕板鑸碘拺闁告繂瀚悞璺ㄧ磼闊厾鐭欓柍銉畵婵℃悂鍩℃担渚О闂備浇顕栭崹搴ㄥ礃椤垶顥嶆繝鐢靛Т閻ュ寮堕崠鈩冨婵°倓鐒﹂崣蹇涙煛婢跺娈繛宸憾閺佸洭鏌曡箛鏇炐ラ柣锝嗘そ濮婅櫣鎷犻垾宕囷拷濠氭煕濞戝崬鏋熼柣锝囧厴濮婄粯鎷呴崨濠傛殘濠电偠顕滅粻鎾崇暦濠婂喚娼╅悹杞扮秿閵夆晜鐓ラ柣鏇炲�圭�氾拷
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
		
		if(serviceid == 1987){//濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佸憡渚楅崣搴ㄦ偄閸℃ü绻嗘い鏍ㄧ懅缁夋寧绻涢幋鐑嗙劯闁哄啫鐗嗙粈瀣煃閻氬瓨瀚瑰┑顔款潐椤ㄥ﹤顫忓ú顏勭闁绘劖褰冩慨鍫曟⒑閸涘﹥灏伴柣鐔叉櫊楠炲棛浠︽潪鎸庢瀹曘劑顢欓幆褍绠ラ梻浣筋嚙鐎涒晝绮欓幒妞伙拷锕傚炊閳哄啩绗夐梺鐟邦嚟婵澹曟總鍛婄厪濠电姴绻掗悾閬嶆煃缂佹ɑ绀嬮柡宀嬬磿娴狅箓宕滆濡插牓鏌х紒妯煎ⅹ闂囧鏌ㄥ┑鍡欏妞ゃ儱顦伴妵鍕Ψ閿斿墽鐣靛銈庝簻閸熷瓨淇婇崼鏇炵闁靛鍎洪悗鎾⒒娴ｅ搫鍔﹂柡鍛櫊瀹曡瀵肩�涙ê浠奸梺缁樺灱婵倝寮查幖浣圭叆闁绘洖鍊圭�氾拷?
			new PTakeWeiBoAwardProc(roleid).submit();
			return;
		}

		// PvP闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎮疯閹矂骞樼紒妯猴拷鍨箾閹寸儐浼嗛柟杈剧畱閻鐓崶銊р檨闁绘挾鍠栭弻锟犲磼濮樺彉铏庨梺璇″枟閸ㄥ潡寮诲☉娆愬劅闁挎稑瀚呰閺岋紕浠﹂崜褎鍒涢悗娈垮枟閹歌櫕淇婇幖浣肝ㄩ柕鍫濈墕閻掕鈹戦悩娈挎毌闁告挻绻堥幃锟犲焺閸愵亶娲搁梺鍓插亝濞叉牠鎷戦悢鍏肩叆婵犻潧妫Σ褰掓煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?
		IPvPServiceHandle sHandle = PvPServiceHandleFactory.create(serviceid);
		if (sHandle != null) {
			sHandle.handle(roleid, serviceid);
			return;
		}

		if (BingFengLandMgr.bingFengServiceids.contains(serviceid)) {
			new PBattletoBingFeng(roleid, npcId).submit();
			return;
		}

		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煟閹惧鎳勯柕鍥у瀵�燁槼妞ゃ儲绮撻弻鐔兼惞椤愩垹顫掗梺杞扮缁夊綊骞冨▎鎾村�绘俊顖炴敱鐎氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐Ψ閳轰胶鐣鹃梺鍛婃处閸ㄩ亶鎮￠弴銏＄厪濠电偛鐏濋崝姘舵煠缁嬭法绉洪柡灞诲姂瀵潙螣閾忛�涚礄闂備浇顕栭崯顐﹀炊瑜旈崬鍫曟⒑闂堟稓绠氶柡鍛矌缁﹪顢曢敂瑙ｆ嫼闂佺厧顫曢崐鏇炵摥婵犵數鍋犻婊呯不閹烘桅闁圭増婢樼粈鍐┿亜閺囩偞顥犵紒瀣箻濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�
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


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
			//NPC闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟顔炬焿椤﹀綊鏌熼姘辩劯妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋嗙粻楣冩煙鐎电鍓卞ù鐓庢閺岀喐娼忛崜褏鏆犻梺娲诲幗椤ㄥ﹪鎮￠锕�鐐婇柕濞э拷濡俱劑姊虹紒妯诲暗闁哥姵鐗犲濠氭晸閻樿尙顦ㄩ梺闈涱焾閸庡骞忛悜钘変紶闁靛闄勫▓浼存⒑閸撴彃浜濇繛鍙夛耿閹繝寮撮悢铏诡啎闂佺硶鍓濋〃濠囨偘濠婂牊顥婃い鎺戭槸婢ф挳鏌＄仦闈╂嫹瀹曞洦娈曢柣搴秵閸撴瑩宕哄畝鍕叄濞村吋鐟х粔顕�鏌＄仦鍓ф创闁炽儻绠撻獮瀣攽閸モ晙澹曞┑鐘愁問閸ｎ垳寰婃繝姘瀭鐟滅増甯掗悡姗�鏌熸潏楣冩闁稿﹦鍏橀弻銈囧枈閸楃偛顫╁銈冨�ч幏鐑芥⒒閸屾瑦绁版い鏇熺墵瀹曚即寮介鐐碉紮闂佺鍕垫畼鐎规挷绶氶弻娑㈠箛閸忓摜鍑归悗瑙勬礀椤︾敻骞冪捄琛℃闁圭儤鍨甸埛澶婎渻閵堝骸浜滅紒澶屾嚀椤繐煤椤忓嫪绱堕梺鍛婃处閸犳艾顬婇妸鈺傗拺闁告稑锕ゆ慨澶愭煕鐎ｎ偅灏电紒杈╁仱瀹曞崬鈽夊▎灞惧闂備胶顭堥張顒勬偡瑜忕划锝夊籍閿熺晫鎹㈠☉銏″殞闁哄鐏濋幆鐐烘倵閸偅绶查柨鏇ㄤ簻閻ｉ绮欑拠鐐閺佹捇鎮惧畝锟介惌鍡涙煕鐏炲墽鈼ョ紒璇叉閵囧嫰寮介妸褏鐣哄銈呯箳婵烇拷闁哄矉绻濆畷閬嶎敇閻樺灚娈奸梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠楠炪垺淇婇婵嗗惞鐟滄澘鎳愮槐鎾诲磼濞嗘垹鐡橀梺褰掝棑閸忔﹢骞冨Δ鍛櫜閹肩补锟借尙鎸夊┑鐐茬摠缁秶鍒掗幘缁樺亗妞ゆ劧绠戦悙濠囨煏婵犲繒鐣遍柡鍡橆殕缁绘繈鍩涢敓浠嬪礋椤掑偆妲扮紓鍌欒兌缁垶鎯勯姘辨殾濠靛倸鎲￠崑鍕煣韫囨挻璐￠柡鍡╁幘缁辨捇宕掑▎鎰偘婵＄偛鐡ㄩ幃鍌炵嵁閹扮増鍤掗柕鍫濇川閻ｅ爼姊虹紒妯烩拻闁告鍥ㄥ�峰┑鐘插閸犳劗锟界櫢鎷烽柛鏇ㄥ亞椤︹晠姊洪懞銉冾亪藝閽樺锟芥帗绻濆顓犲帾闂佸壊鍋呯换鍐夐悙鐑樼厾闁肩⒈鍓欓埢鍫ユ煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟芥娊姊绘担鑺ョ《闁哥姵鎹囧鏌ヮ敃閿曪拷閺嬩礁鈹戦悩瀹犲闁藉啰鍠栭弻銊モ攽閸♀晜笑缂備胶濯寸紞渚�寮婚妸銉㈡斀闁糕剝锚閺呬粙姊洪悷鏉库挃缂侇噮鍨堕幃锟犲即閵忕姷顔愰柡澶婄墕婢х晫澹曢崸妤�鏋侀柛顐犲劜閳锋垿鏌涘┑鍡楊仾婵狅拷娴煎瓨鐓熼柍鍝勶工閻忕姵銇勯弴顏嗙М妤犵偞锕㈤、娆撳床婢跺棙娅婇柡灞炬礃瀵板嫰宕煎┑鎾村婵°倕鎳忛崕搴ㄥ箹濞ｎ剙濡介柣鎾跺枛楠炴牗娼忛崜褏蓱闂佸搫妫岄弲娑⑩�﹂懗顖ｆЪ濡炪們鍔岄敃銈夘敋閿濆棛绡�婵﹩鍎甸埡鍛厓闁告繂瀚敓钘夘煼閹箖骞庨懞銉㈡嫽闂佺鏈悷褔宕濆澶嬪�电紒妤佺☉閹冲繐鐣烽弻銉︾厱閻忕偟铏庨崵銈嗙箾閹寸們姘跺几鎼淬劍鐓欓悗娑欘焽閻矂鏌涢幘鍗炲妞ゎ亜鍟存俊鍫曞幢濡缚鏁块梻浣规偠閸斿秴顪冩禒瀣畺闁跨喓濮甸崑鍕煕韫囨艾浜归柛姗嗕邯濮婃椽宕滈幓鎺嶇凹缂備浇顕ч崯鏉戠暦瀹曞洦鍠嗛柛鏇楁櫃缁ㄥ妫呴銏＄カ缂佽尪妫勯锝夘敋閿熶粙寮婚垾宕囨殕闁跨喍绮欏畷浼村冀椤撴粣鎷锋担鍓叉僵閻犲搫鎼懓鍨攽閳藉棗鐏熼悹锟介敂钘夘嚤闁跨噦鎷�?
			switch (curType) {
			case NpcServiceMappingTypes.NONE: {
				break;
			}
			case NpcServiceMappingTypes.ACCEPT_CIRCLE_TASK: {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒閿曪妇绮欒箛鏃傜瘈闁靛骏绲剧涵鐐亜閹存繃鍠橀柕鍡楁嚇楠炴捇骞戝Δ锟界紞濠囧箖閳轰緡鍟呮い鏃傚帶婢瑰牏绱撴担鍝勪壕闁稿骸鍟块…鍥灳閹颁礁娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊ｄ簻闁规澘鐏氱欢姘辩磼閵娿儳鎽犵紒缁樼〒閿熻姤绋掗…鍥儗婵犲嫮纾界�广儱鎷戦煬顒傦拷娈垮枦椤曆囧煡婢舵劕顫呴柍鍝勫�瑰▍鍥⒒娴ｇ懓顕滅紒璇插�哥叅闁靛ň鏅╅弫鍥р攽閸屾碍鍟為柍閿嬪灴閺岀喖鎳栭埡浣风捕闂佽法鍠曟慨銈夋偋閻樿违闁告劦鍠栭獮銏＄箾閹寸儐鐒搁柨鏇炲�归悡鏇㈡煛閸ャ儱濡奸柡瀣ㄥ�濋弻锝夊Χ韫囨柨顏堕梻鍌氬�风粈浣革耿闁秴纾婚柟鎹愵嚙缁犳岸鎮橀悙璺衡枏婵炴垯鍨洪崐鐑芥煟閵忋垺鏆╅柨娑欑箖缁绘稒娼忛崜褍鍩岄梺鍦拡閸嬪懘鎮ф惔銊︹拻濞达絽鎼敮鍓佺磽瀹ュ拑鍔熺紒顔碱煼瀵�燁檪闁兼澘鐏濋妴鎺戭潩閻愵剙顏舵繝娈垮枛閿曘劌鈻嶉敐鍥潟闁圭儤鍤﹂悢鑽ょ杸婵﹩鍏涘Ч妤呮⒑閻熸澘妲婚柛鐔告尦瀵偊宕橀鑲╋紲濠殿喗锕╅崜姘跺磿椤忓懐绡�闁汇垽娼ф禒婊勪繆椤愶綆娈橀柟骞垮灲瀹曞崬鈽夊Ο鐓庢憢闂備礁鍚嬫禍浠嬪磿椤栨稓顩叉繝濠傜墛閻撴盯鏌涢妷銏℃珔濞寸媴闄勯妵鍕Ψ瑜嶆禒閬嶆煙椤旂瓔娈旀い顐ｇ箞閹瑩顢楅敓浠嬵敂閿燂拷
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new PAcceptCircTask(roleid, npckey, npcid, conf.getParam1(), true).submit();
				return true;
			}
			case NpcServiceMappingTypes.SUBMIT_CIRCLE_TASK: {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴鐎殿喖鐖煎畷鐓庮潩椤撶喓褰呴梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨奸崺鏍礉閺嶎厽鍋傛繛鍡樻尰閻撶喖鏌熺�甸晲绱虫い蹇撶墛閸婂潡鏌ｉ幇闈涘缂佺娀绠栭幃妯跨疀閺冨倸顫у┑鐐叉噹閿曨亪寮婚敍鍕勃閻犲洦褰冮～鍥倵濞堝灝鏋熼柟鍛婂▕閵嗕線寮崼婵嗙獩濡炪倖鎸嗛崒婊冾槱婵犵數濮烽。顔炬閺囥垹纾婚柟杈剧畱绾惧綊鏌″搴ｄ汗濡わ箒娉曢悿锟藉┑鐐村灦椤洭鏁嶉悢鍏尖拺婵懓娲ら悘顏堟煙椤旇偐鍩ｉ柡浣规崌楠炲骞掗弮鍌滃床闁诲孩顔栭崳顕�宕抽敐鍛殾闁绘挸绨堕弨浠嬫煕閳╁啰鍟查柟椋庡厴瀹曞綊顢欑憴鍕澑闂佸湱鍎ゆ繛濠傜暦閹版澘鍗抽柕蹇曞Х閺屽牊绻涢弶鎴濇倯婵炲吋鐟ユ晥闁哄被鍎查悡娑橆熆鐠虹尨鍔熸慨妯稿姂閺岋繝鏁撻懞銉ь浄閻庯綆鍋嗛崢浠嬫⒑瑜版帒浜伴柛鎾村哺閸┿垽寮撮姀锛勫幈闂侀潧鐗嗗ú銈夊几鎼淬劍鐓冮悷娆忓閻忓瓨銇勯姀鈥冲摵闁轰焦鎹囬幃鎯х暆閿熻姤绋夊澶嬬厸鐎广儱楠搁獮鎴︽煥閻旂鐏婄紒锟芥笟锟介敐鐐测攽鐎ｎ亞鐤�婵炶揪绲芥晶锝夘敂閸啿鎷绘繛鎾寸啲閹风兘鏌ㄩ悢璇残撶紒瀣崌閸╃偤骞掑Δ浣哄幈闂佸搫鍠涢幏鐑芥煕閵娿儳浠㈡い鏇秮椤㈡洟鏁冮敓鐣岀不閼姐倗纾藉ù锝堝亗閹存績鏋嶉柕蹇嬪�栭埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓
				new PSubmitCircleTask(conf.getParam1(), roleid, npckey, new java.util.ArrayList<fire.pb.npc.SubmitUnit>()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TASK: {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌ｉ幘瀵告噮缂佽鲸鎸婚幏鍛存濞戞矮鎮ｆ繝鐢靛仜閹冲繘鏁冮姀銈呰摕闁斥晛鍟刊鎾煕閹炬潙绲婚柛鎾归哺缁绘盯鏁愰崨顔芥倷闂佹寧娲︽禍婵囩┍婵犲洤绠氶柟娈垮枤閺夋悂姊洪崫鍕拷褰掝敄濞嗘劕顕遍柟鐐灱閺�浠嬫煥濞戞ê顏╁ù婊冦偢閺屾稒绻濋崘顏勨吂闁绘挶鍊濋悡顐﹀炊閵娧�妲堢紒鐐劤濞硷繝寮婚敐澶婎潊闁斥晛鍟禒鈺呮⒑鐠恒劌鏋戦柛銊︾箘濞嗐垹顫濋澶婃濡炪倖娲╅幏椋庯拷瑙勬礈閸樠囧煘閹达箑骞㈡慨妯煎亾鐎氬綊鏌涢…鎴濇灀闁猴拷娴犲绠抽柟鎯版绾惧綊鏌￠崶銉ョ仼闁汇値鍠栭湁闁稿繐鍚嬬紞鎴炴叏鐟欏嫮鍙�闁哄备鍓濆鍕節閸曨剛娈ら梻浣哄皑閹峰嘲霉閻樺樊鍎愰柣鎾跺枛閺岀喖鏌囬敃锟芥晶顖炴煃缂佹ɑ绀嬮柡灞剧洴婵″爼宕惰閻庡姊虹�圭媭娼愰柛銊ユ健閵嗕礁顫濋懜鍨闂佷紮绲介惉鍏肩▔瀹ュ鐓涚�广儱楠搁獮鎴︽煥閻旂鐏婄紒锟芥笟锟介敐鐐测攽鐎ｎ亞鐤�婵炶揪绲芥晶锝夘敂閸啿鎷绘繛鎾寸啲閹风兘鏌ㄩ悢璇残撶紒瀣崌閸╃偤骞掑Δ浣哄幈闂佸搫鍠涢幏鐑芥煕閵娿儳浠㈡い鏇秮椤㈡洟鏁冮敓鐣岀不閼姐倗纾藉ù锝堝亗閹存績鏋嶉柕蹇嬪�栭埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				new fire.pb.circletask.catchit.PQueryCatchItTaskTime(roleid, npcid, conf.getParam1()).submit();
				return true;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_TEAM: {
				break;
			}
			case NpcServiceMappingTypes.QUERY_CIRCLE_BATTLE: {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈粙鎴濃枍瑜斿鍝劽虹拠鎻掔闂佽崵鍟块弲鐘差嚕婵犳碍鍋勯柛娑橈功缁夊爼姊洪崨濠冨瘷闁告侗鍠楅蹇涙⒒閸屾瑧鍔嶆俊鐐叉健瀹曘垺绂掔�ｎ煉鎷烽崘鈺冪瘈闁搞儜鍡樻啺婵犵數鍋為崹顖炲垂瑜版帗鍊挎繛宸簼閻撴洟鏌熼柇锕�鏋涘ù婊呭亾閵囧嫰骞樺畷鍥┬ㄥ┑顔硷攻濡炰粙鐛弽顓熷�烽悹鍥囧嫬顏堕梺鍝勭▉閸樺綊鏁撻挊澶婃殻鐎规洖宕埥澶娢熷鎰暤闁哄本鐩鎾Ω閵夛妇浜鹃梻浣圭湽閸娧囧箯閻戣姤鈷掑ù锝呮啞鐠愶繝鏌涚�ｎ偅宕屾鐐叉娴狅附娼幐搴ｆ创闁诡喗鐟╅幃浠嬫偨绾板闂繝鐢靛仩閹活亞寰婃禒瀣妞ゆ劧绲挎晶锟犳⒒閸屾瑨鍏岄柛妯犲懐绀婂┑鐘插娑撳秹鏌″畵顔肩Х閿熻棄鐏濋妴鎺戭潩閻愵剙顏舵繝娈垮枛閿曘劌鈻嶉敐鍥潟闁圭儤鍤﹂悢鑽ょ杸婵﹩鍏涘Ч妤呮⒑閻熸澘妲婚柛鐔告尦瀵偊宕橀鑲╋紲濠殿喗锕╅崜姘跺磿椤忓懐绡�闁汇垽娼ф禒婊勪繆椤愶綆娈橀柟骞垮灲瀹曞崬鈽夊Ο鐓庢憢闂備礁鍚嬫禍浠嬪磿椤栨稓顩叉繝濠傜墛閻撴盯鏌涢幇顓烆嚋閻庢艾缍婂铏圭矙閸噮鍔夋繝鐢靛仜閿曘倝顢氶敐鍥╃煓閹煎瓨鎸婚～宥呪攽椤旂瓔鐒介柛瀣尵閿熻姤淇洪～澶屾崲濞戙垹閱囨繝闈涚墔閾忓酣姊洪崫鍕靛剭闁稿﹥娲熼垾锕傛嚄椤栵絾歇婵＄偑鍊戦崝宀勬晝椤忓牊鍋樻い鏇嫹鐎规洖宕埥澶娢熼懖鈺傜秮闂傚倷绀佹竟濠囧磻閸涙潙绠氬┑鐘叉搐閻撴盯鏌涘☉鍗炴灓闁告瑥妫濆娲传閸曨偓鎷疯ぐ鎺戠？鐎规洖娴勯幏宄邦潩椤掑嫬寮伴梺鍝勬湰缁嬫捇鏁撻弬銈囩У闁稿瀚湁妞ゆ棁濮ら崣蹇撯攽閻樻彃顏悽顖涚洴閺岀喎鐣￠悧鍫濇缂備緡鍠氶弫鎼佹晸閺傘倗绉靛ù婊勭箞閹偓瀵肩�涙ǚ鎷绘繛杈剧到閹诧繝宕悙鐑樼厵缁炬澘宕禍鐗堟叏婵犱胶鐭欑�规洜鍠栭、姗�鎮╅悽闈涘Ы闂佽楠哥粻宥夊磿闁秴绠犲鑸靛姇缂佲晛霉閻樺樊鍎愰柛濠勬暬閺屻劌鈹戦崱娆忓毈缂備降鍔岄…鐑藉蓟閿濆棙鍎熸い鏃傚帶缁犵懓顪冮妶搴濈盎闁哥喎鐡ㄦ穱濠囧醇閺囩偛鑰垮┑掳鍊曢崯浼村箠閸℃稒鈷戦悹鍥ㄥ絻椤掋垽鏌涢幋婵堢Ш鐎规洘绮岄埢搴ㄥ箳閺傚墽缍嶉梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�?
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
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姍閳ユ棃宕橀搴㈠闁挎繂绨奸柇顖涖亜鎼淬埄娈滈柡灞剧洴婵℃悂鏁傞崜褏鏉介梻浣告惈鐞氼偊宕濋幋锕�绠栭柕鍫濐槸绾惧吋绻涢幋鐑囦緵濞寸》鎷�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鏋涢柛銊︾箘閿熺晫娅㈤幏鐑芥煕閺囥劌澧柛鎾崇埣濮婃椽宕楅懖鈹垮仦闂佸搫鎳忛惄顖氱暦閻熸壋鏀介悗锝庡亞閸樻捇姊洪崨濠勭畵閻庢凹鍓熷鎼佹晝閸屾稓鍘甸悗鐟板濠㈡ê危婵犳碍鐓冮柦妯侯樈濡叉悂鏌嶇拠鏌ヮ�楅摶锝夋煟閹炬娊顎楀Δ鏃堟⒒閸屾艾锟介绮堟担鍝勵棜妞ゆ挾濮撮崹婵囥亜閺嶃劌鍤繛鍏肩墱閹叉悂鎮ч崼婵堢懆婵℃鎳樺娲川婵犲啫顦╅梺鍝ュУ瀹�鎼佸箖閸ф鏅稿ù鐘差儐閳锋垿鎮峰▎蹇擃仼缂侊拷閸愨晝绠鹃柛娑卞枟缁�锟介梺宕囩帛閹瑰洤顕ｆ繝姘ㄩ柨鏇嫹闁跨喓鏅弫濠氬箖瀹勬壋鏋庨煫鍥ㄦ惄娴犲墽绱撴笟濠冨闂佸憡鍔﹂崰妤呮偂閻斿吋鐓欓柛顭戝枛椤忣偆绱掗埥鍛闂佽瀛╅鏍窗濞戙埄鏁嬬憸鏃堝春閵夛箑绶為柟閭﹀墻濞煎﹪姊洪弬銉︽珔闁哥噥鍨堕、鏃堟偄閸忓皷鎷绘繛杈剧秬婵倗娑甸崼鏇熺厱闁挎繂绻掗悾鍨殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�?
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				int renxingtimes = sq.getRenXingCircTaskCount(roleid, conf.getParam1());
				gnet.link.Onlines.getInstance().send(roleid, new SRenXingCircleTask(serviceid, conf.getParam1(), renxingtimes, npckey));
				return true;
			}
			case NpcServiceMappingTypes.CHALLENGE_NPC: {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栭獮鎴﹀箛闂堟稒顔勭紓鍌欒兌婵兘宕伴弽顓炶摕闁靛ň鏅滈崑鍕煕濠靛棗鐝旈柕蹇嬪�栭悡鏇㈡煏婵炲灝鍔氶柨鐔绘濞尖�愁嚕鐠囨祴妲堥柕蹇婃櫆閺呮繈姊洪幐搴ｇ畵婵☆偅鐩棟闁靛鏅滈埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾稒绻濋崒娑樹淮閻庢鍠栭…鐑藉极閹邦厼绶為悗锝庝悍閹风兘鎮滈懞銉㈡嫽闂佸壊鍋嗛崰搴ㄥ窗閺囥垺鐓欑�瑰嫭婢樺Σ濠氭煟閿濆繒绡�闁轰焦鎹囬弫鎾绘晸閿燂拷
				int npcid = NpcServiceManager.getNpcIDByKey(npckey);
				fire.pb.circletask.CircleTask sq = new CircleTask(roleid, true);
				boolean ret = sq.exeCircTaskBattle(roleid, npckey, conf.getParam1(), npcid);
				Module.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê浠奸柣蹇曞仦閸庡啿鈻撳畝鍕厽閹兼番鍨婚。鏌ユ煙椤旂厧锟藉潡鎮伴璺ㄧ杸婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹" + roleid + "]" + "exeCircTaskBattle缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涘┑鍕姢濞戞挸绉归弻鈩冨緞婵犲嫭鐨戦梺鐚存嫹濞寸姴顑嗛悡鐔镐繆椤栨繃顏犻柨娑樼У閵囧嫰鏁愰崱娆忓绩闂佸搫鏈粙鎺旀崲濠靛纾兼繝濠傚暟閸樹粙姊绘担鍛婃儓閻炴凹鍋婂畷婵嬪箣閿曪拷缁犳牠鏌曢崼婵愭Ц缁炬儳鍚嬬换娑㈠箣閻戝洣绶垫繛瀵搞�嬮幏锟�:" + ret);
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
			// TODO 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙璺虹毢妞ゎ厼鐗撻崺鐐哄箣閿旇棄浜归柣鐘叉厂閸愌呯煑闂備浇顕х�涒晠宕欒ぐ鎺戠煑闁告劑鍔庨弳锕傛煥濠靛棛澧㈤柣銈忔嫹婵犵數鍋為崹鍫曟偡瑜斿畷銏ゅ箻缂佹ǚ鎷洪梺鍛婄☉閿曪妇绮婚幘缁樺�垫慨妯煎帶瀵喚锟借娲栭崯璺ㄥ弲濡炪倕绻愰幊鎰板储闁秵鐓熼幖鎼灣缁佺兘鏌涢弬鎸庢拱闁逛究鍔戝畷鎺楁倷鐎电骞愰柣搴ｆ閹风兘鎮楅敐搴″鐞氾箓鏌ｆ惔銏╁晱闁革綆鍣ｅ畷鎶芥晲閸涱垱娈鹃梺鍦劋椤ㄥ懎娲块梻浣规偠閸庢粓宕橀崘鍙ラ偗婵﹤顭峰畷鎺戔枎閹邦喓鍋樻俊鐐�栧▔锕傚川椤旂厧绨ラ梻浣哥秺閸嬪﹪宕曢鍔芥椽顢斿鍡樻珝闂備線娼х换鎺撴叏妤ｅ啫绠洪柡鍥ュ灪閳锋垿鏌熺粙鎸庢崳缂佺姵鎸婚妵鍕晜閸喖绁悗娈垮枟閻擄繝鐛弽銊﹀闁革富鍘煎鎶芥⒒娴ｈ櫣甯涙繛鍙夌墵瀹曟劙宕烽銊﹀婵鍋撶�氾拷? catch 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笩濡嫰鍩為幋锔藉亹閻庡湱濮撮ˉ婵堢磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê浠奸柣蹇曞仦閸庡啿鈻撳畝鍕厽閹兼番鍨婚。鏌ユ煙椤旂厧锟藉潡鎮伴璺ㄧ杸婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹" + roleid + "]" + "serviceid:" + serviceid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵噣鏁撴禒瀣婵犻潧顑呯粻顖氼渻鐎ｎ亝鎹ｇ紒鐘虫⒐缁绘盯骞嬮悙鍡樺灦瀵板嫰宕熼娑氬幈闁诲函绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑闂堟单鍫ュ疾濠婂牆纾婚柛鈩冪♁閻撴洟鎮橀悙鎻掆挃闁宠棄顦伴妵鍕疀閵夛箑顏�");
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
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撴い鏇嫹闁轰焦鎹囧顒勫Χ閸モ晜娈奸柣搴ゎ潐濞叉牠濡堕崨濠佺箚闁绘垼濮ら弲婵嬫煥閻旇袚缂佸倸绉靛蹇涘煛閸愵亷绱冲┑鐐舵彧缁蹭粙骞夐敓鐘茬厺闁哄洢鍨洪悡娑氾拷鐧告嫹閻庯綆鍋勯锟�+B 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤绻堥獮濠傗攽鐎ｎ亞顓煎銈嗘閸嬫劖鏅堕姘ｆ斀闁绘劘灏欓幗鐘电磼椤旇偐鐏辩紒杈╁仦缁绘繈宕惰閹芥洖鈹戦悙鏉戠仧闁搞劎鎳撻弫顔戒繆閻愵亜锟芥牕顫忔繝姘偍鐟滄棃鏁愰悙鍝勭厸闁告侗鍠掗幏鍝勨攽閻愯泛钄兼い鏇嗗洨宓佹俊銈勯檷娴滄粓鏌曟繛鍨姕妞ゃ儯鍨归埞鎴︽晬閸曨剚姣堥悗瑙勬礈閸犳牠銆佸☉姗嗘僵妞ゆ帪鎷烽柡浣靛�濆缁樼瑹閿熻棄顭囪閳ワ箓宕奸妷銉ь槷閻庣櫢鎷烽柛鏇烇工椤︻垶鍩為幋锕�骞㈤柍鍝勫�搁惁婊堟⒒娓氾拷濞佳囨偋閸℃﹩娈介柛娑橈功椤╂煡鏌涢幘妤�鎳愰敍婵嬫倵楠炲灝鍔氶悗姘煎枤缁綁寮崒锔藉婵炲牆鐏濋弸锔姐亜閺囧棗娲ら悡鈥愁熆鐠轰警鐓柣鎾卞劦閺屾稑鈽夐崡鐐典画濠电姰鍨洪崹鍨潖閾忚瀚氶柟缁樺笒濮ｆ劗绱撻崒姘毙㈡俊顐ｇ懅缁顓奸崪浣哄弳闂佸憡娲﹂崜娆忣嚕閸ф鐓欓柤娴嬫櫈钘熷┑鈩冨絻閹冲酣濡撮幒鎾剁瘈婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柣鎰劋閻撶喖鏌熼幆褍鑸归柛鏂诲�楃槐鎺撴綇閵娿儳鐟查悗鍨緲鐎氼喗绂掗敃鍌氱畾鐟滃酣鎮鹃浣风箚闁绘劦浜滈敓鑺ョ墪鐓ら柍鍝勫暟缁�濠傘�掑鐐闂侀潧妫旂粈渚�鍩㈡惔銊ョ闁绘劘灏欓敍蹇涙⒒娓氾拷濞佳嗗櫣闂佸憡娲﹂崜娑氭暜閸℃稒鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儺鍓ㄧ紞鏍ь熆閼搁潧濮囩痪鎹愭硶閿熷�燁潐濞叉牕煤閵堝＆澶婎潩椤撴粈绨婚梺瑙勫礃濞夋盯寮搁弮锟介妵鍕煛閸涱喗鏆犻梺閫涚┒閸斿矁鐏掗梺鍓茬厛閸犳岸宕㈤锔解拺缂備焦蓱鐏忕敻鏌涢悩宕囧⒌鐎殿喖顭烽弫鎰緞婵犲嫷鍚呮繝鐢靛█濞佳兠洪妶澹﹀洭鍩￠崨顔惧幗闁瑰吋鐣崹濠氬疮閺屻儲鐓欓柛鎴欏�栫�氾拷?
		//NPC濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾閸庡啿锕㈤柆宥呯疅闁归棿鐒﹂崑瀣煕椤愶絿绠橀柣鐔哥叀濮婅櫣绮欏▎鎯у壈濡炪倖鍨甸ˇ闈涱嚕婵犳碍鏅搁柣妯垮皺閸婄偤姊虹�圭姵銆冮柣鎺炵畵閹銈ｉ崘鈹炬嫼闂佸憡绋戦敃锕傚箠閸愵亞纾肩紓浣癸公閼拌法锟芥鍠栭…鐑藉箖閵忋倖鍋傞幖杈剧悼閺嗕即姊绘担铏瑰笡妞ゃ劌鎳橀幃褍顭ㄩ崗鐐洴瀹曠喖顢涘☉鎺撳婵犵數鍋犵亸顏堫敋瑜旈悰顔嘉旀担鍏哥盎闂侀潧顭堥崕濠氱叕椤掑偊鎷峰▓鍨灈妞ゎ厾鍏橀獮鍐閵堝棗浠忛柣搴㈢♁閿氭い蹇撶埣濮婂搫效閸パ呬痪濡炪倖姊归悧鐘诲箖閻愬搫绠氭い顑斤拷宕囩Ш闁诡噮浜畷銊╊敍濠婂嫭顔撻梻鍌欑閹碱偅寰勯崶顒�绀堟繝闈涙－閸ゆ鏌涢弴銊ヤ簮婵℃彃鐗婄换娑㈠幢濡や胶顩版繛瀵搞�嬮幏锟�
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
		
		//serviceid -> type -> params 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欑粵瀣姺闂佸憡顭嗛崶褍鍤戦梺缁樻煥閸氬鎮″▎蹇嬶拷鎺戭潩椤掑倷铏庢繝娈垮枛閸婂綊銆冮妷鈺傚�烽弶鍫熷礃閿熻姤瀵ч妵鍕閿涘嫭鍣伴梺鍦焾閿曘儱顕ラ崟顒傜瘈闁稿被鍊栭ˉ澶愭⒒閸屾艾锟芥悂宕愰悜鑺ュ殑闁告挷绀侀崹婵囥亜閺嶎偄浜归柨鐔告灮缁犳挸鐣锋總绋课ㄦい鏃囧Г濞呮棃鏌ｉ悢鍝ョ煀缂佺粯甯″畷姘跺箳濡わ拷闁卞洭鏌曟径鍫濆姢闁挎稒绮岄埞鎴︽偐鐠囇勬暰闂佸憡姊归悧婊堟晸閼恒儴澹樼紓宥咃躬楠炲啫鐣￠幍铏�婚棅顐㈡处閹尖晜绂掗崜褏纾藉〒姘攻鐎氬綊姊虹捄銊ユ灆婵☆偄瀚伴崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆТ闁哄鐟╁娲川婵犲嫭鍣ч梺鍝ュ櫏閸嬪﹪骞冮幆褏鏆嬮柟閿嬫⒐濡啫鐣烽妸鈺婃晣闁绘顕滈幏鐑芥倷瀹割喗瀵岄梺闈涚墕濡绮崒婊呯＜闁跨喕濮ら幏鍛村捶椤撗勭カ闂備礁鍟块幖顐﹀箠韫囨稑鐓曢柟杈鹃檮閸嬶綁鏌熼鐔风瑨濠碘�冲悑缁绘盯宕ㄩ鐓庮潚闂佸搫鐬奸崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
		if (dealNpcServiceMapping(roleid, serviceid)) {
			Module.logger.error("NPC闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟顔炬焿椤﹀綊鏌熼姘辩劯妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋嗙粻楣冩煙鐎电鍓卞ù鐓庢閺岀喐娼忛崜褏鏆犻梺娲诲幗椤ㄥ﹪鎮￠锕�鐐婇柕濞э拷濡俱劑姊虹紒妯诲暗闁哥姵鐗犲濠氭晸閻樿尙顦ㄩ梺闈涱焾閸庡骞忛悜钘変紶闁靛闄勫▓浼存⒑閸撴彃浜濇繛鍙夛耿閹繝寮撮悢铏诡啎闂佺硶鍓濋〃濠囨偘濠婂牊顥婃い鎺戭槸婢ф挳鏌＄仦闈╂嫹瀹曞洦娈曢柣搴秵閸撴瑩宕哄畝鍕叄濞村吋鐟х粔顕�鏌＄仦鍓ф创闁炽儻绠撻獮瀣攽閸モ晙澹曞┑鐘愁問閸ｎ垳寰婃繝姘瀭鐟滅増甯掗悡姗�鏌熸潏楣冩闁稿﹦鍏橀弻銈囧枈閸楃偛顫╁銈冨�ч幏鐑芥⒒閸屾瑦绁版い鏇熺墵瀹曚即寮介鐐碉紮闂佺鍕垫畼鐎规挷绶氶弻娑㈠箛閸忓摜鍑归悗瑙勬礀椤︾敻骞冪捄琛℃闁圭儤鍨甸埛澶婎渻閵堝骸浜滅紒澶屾嚀椤繐煤椤忓嫪绱堕梺鍛婃处閸犳艾顬婇妸鈺傗拺闁告稑锕ゆ慨鍥ь熆瑜岀划娆撳极閹捐纾归柣鏂挎憸瑜把勭箾閿濆懏鎼愰柨鏇ㄤ邯楠炲啫鈻庨幙鍐╂櫆闂佸憡娲濋崺鏍拷姘贡閹叉悂寮崼婵堢枃濠电偛妫欑敮鍥ㄧ瑜版帗鐓欓柣鎴灻悘鈺呮煛鐏炵喎娲﹂埛鎴犵磽娴ｇ櫢渚涢柣鎺斿亾閵囧嫰寮撮崱妤佸櫧濞戞挸绉归弻鈥愁吋鎼粹�崇闂佺粯鎸诲ú姗�濡甸崟顖氱疀闁告挷鑳惰摫缂傚倷绶ら幏鐑芥煥閻旂粯顥夐摶鏍煟濮楋拷濞佳勭婵傚憡鐓曢柕濞垮�楅惌娆戯拷娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓欓敓鐣屽仱濮婅櫣锟藉湱濮甸妴鍐磼閹绘帗鍋ュ┑顕嗘嫹闂侀潧鐗嗗Λ娑㈠储閹间焦鈷戦柛娑橈梗缁跺崬霉濠婂嫮绠撻柍璇茬У缁绘繈宕堕妸褍骞愰柣搴ｆ閹风兘鎮楅敐搴″鐞氾箓姊绘担绛嬪殐闁哥姵鎹囧畷褰掓寠婢跺本娈惧銈嗗姧缁犳垵鏁梻浣瑰濞测晠骞忛柨瀣闁告侗鍣▓婊勬叏婵犲倹鎯堥弫鍫ユ煕閵夋垵鎳庢慨鍫曟⒒娴ｈ鍋犻柛鏂跨У缁绘稒绻濋崒婊勬婵炴潙鍚嬪娆戠不濞戞瑣浜滈柡鍐挎嫹闁稿骸鍟块悾鐑藉Ψ閳哄倵鎷虹紓鍌欑劍钃遍柣鎾卞劦閺岀喖鎳為妷褏鐓夊┑顔硷梗缁瑥鐣烽悢纰辨晬婵炴垶鑹惧鎶芥⒒娴ｈ櫣甯涙繛鍙夌墵瀹曟劙宕烽銊﹀婵鍋撶�氾拷" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘☉妯锋妞ゅ繐鐗嗗洿闂佸綊妫跨粈渚�寮告笟锟介弻娑㈠箛闂堟稒鐏堝銈庡亜閹虫﹢寮婚弴銏犻唶婵犻潧娲ゅ▍褔姊虹粙鍖″姛闁稿鐩垾鏃堝礃椤斿槈褔鏌涢埄鍐炬疁闁搞倕顑夊娲捶椤撶偛骞嬪銈冨劜閹告儳危閹版澘绠虫俊銈勭劍濞呫垽姊洪崗闂磋埅闁稿氦浜▎銏ゆ倷閻戞ê锟界敻鏌ㄥ┑鍡楁殭濠德ゆ缁辨帡濡搁妷顔惧悑濠殿喖锕ㄥ▍锝夋晸閽樺璐″┑顔炬暬钘熷鑸靛姈閻撴瑩鏌涢幇顖氱毢缂佺姵濞婇弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�" + serviceid + "].");
			return;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊姗�骞冨▎鎰瘈闁搞儯鍔庨崢顏呯節閻㈤潧锟筋垶宕橀妸锔筋唲闂佸摜鍠撻…鍫ュ煘閹达附鍋愰柛顭戝亝濮ｅ嫰姊虹粙娆惧剳濠电儑鎷峰Δ鐘靛仦閹瑰洭銆侀弮鍫濆耿婵炲棙鍩堝Σ鎼佹⒒娴ｈ姤纭堕柛鐘虫礃閹便劑濡堕崶銊ュ簥濠电偞鍨崹鍦不婵犳碍鐓ｉ煫鍥风到娴滎垳鐥銊﹀闂傚倸鍊烽懗鍫曞箠閹惧墎涓嶇�广儱顦崹鍌炴煢濡警妲洪柡鍡畵閺屾稑螖閸愩劋姹楅梺鍝勵儏闁帮綁寮婚悢鐚存嫹閻㈡鐒炬い搴㈡尵缁辨帡宕￠悙鑼獓婵烇絽娲ら敃顏堝箖濞嗘搩鏁傞柛鏇″煐鐎氬綊鏌″搴″箹缂侊拷婢舵劖鐓欓弶鍫濆⒔閻ｈ京鐥悙顒�顕滅紒缁樼☉椤斿繘顢欓懡銈囨晨闂備礁鎲℃穱娲綖婢跺本宕叉繛鎴欏灩楠炪垺淇婇婵愬殭闂傚绉瑰铏圭磼濡闉嶉梺鑽ゅ櫐缁犳挻淇婇悽绋跨妞ゆ牗鑹鹃崬銊╂⒑闂堟丹娑㈠礃閳哄偆鍟囬梻鍌氬�搁崐鎼佲�﹂鍕闁挎洖鍊哥粈鍫ユ煟閺冨倸甯堕柦鍐枛閺岋綁寮崒妤佸珱闂佽桨绀侀敃顏堝蓟閿曪拷铻ｅ〒姘煎灡瀛濋梻浣告惈椤戝棝鎮烽妷鈹撅拷鏃堝礃椤斿槈褔鏌涢幇鈺佸濞寸姴澧界槐鎾存媴閸撴彃鍓遍梺鎼炲妼濞尖�崇暦濞差亜顫呴柍鈺佸暙閸斿懘姊洪棃娑辩劸闁稿孩濞婇幃鍧楁晸閼恒儰绻嗛柣鎰典簻閿熻姤鐗滈弫顕�顢旈崼婵堫唵婵＄偛顑呭ù椋庡婵傚憡鐓忓┑鐘茬箳閸掍即鏌涢弮鎾绘闁逛究鍔嶇换婵嬪礋椤撶偟顐奸梻浣烘嚀閸㈡煡骞婂Ο铏规殾闁靛濡囩弧锟介梺绋挎湰缁嬫帡鎮鹃悡搴樻斀闁绘ɑ顔栭弳顖涗繆閹绘帗鍤囩�规洘鍨垮畷銊╁级閹存繄锟筋參姊洪懡銈呮瀾閻庢艾鐗撻弫鎰緞婵犲嫮鏉搁梻浣告惈椤︻垶鎮樺┑鍡欐殼闁糕剝绋掗埛鎴犵磽娴ｅ顏呮叏閿熶粙姊洪崫鍕櫤缂侇喗鎹囬獮鍐ㄎ熼懡銈囨嚌闂佽法鍠曞Λ鍕綖韫囨稒鎯為悷娆忓閸樺綊姊洪崨濠佺繁闁哥姵鐗曢埥澶庮槾缂佽鲸鎸婚幏鍛村传閸曟埊缍侀弻娑㈠Ω閵壯呅ㄩ梺杞扮劍閹瑰洭骞婇悙鍝勎ㄩ柕濞垮労濡喐淇婇悙顏勶拷褏绮婚幘瀵割洸闁割偅娲栭弸渚�鏌熼崜褏甯涢悗鐢靛Т椤法鎹勯搹鍦紘闂佸搫妫欓惄顖氼潖閾忓湱鐭欓柛褎顨呭鐗堢箾鐎涙鐭婇柣鏍с偢閹即顢欓悾宀�鐦堥梺鍛婂姀閺呮盯宕濋崨顓ф富闁靛牆楠搁獮妤呮偨椤栨粌浠х紒顔界懆缁犳稑鈽夊▎灞惧闂佽崵濮垫禍浠嬪礉鐏炶В鏋嶉柟鎵閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹
		if (CircleTaskManager.getInstance().isSendMailService(serviceid)){
			Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘☉妯锋妞ゅ繐鐗嗗洿闂佸綊妫跨粈渚�寮告笟锟介弻娑㈠箛闂堟稒鐏堝銈庡亜閹虫﹢寮婚弴銏犻唶婵犻潧娲ゅ▍褔姊虹粙鍖″姛闁稿鐩垾鏃堝礃椤斿槈褔鏌涢埄鍐炬疁闁搞倕顑夊娲捶椤撶偛骞嬪銈冨劜閹告儳危閹版澘绠虫俊銈勭劍濞呫垽姊洪崗闂磋埅闁稿氦浜▎銏ゆ倷閻戞ê锟界敻鏌ㄥ┑鍡楁殭濠德ゆ缁辨帡濡搁妷顔惧悑濠殿喖锕ㄥ▍锝夋晸閽樺璐″┑顔炬暬钘熷鑸靛姈閻撴瑩鏌涢幇顖氱毢缂佺姵濞婇弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�" + serviceid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︺儳绱撻崒姘毙㈤柨鏇ㄤ簻椤曪綁顢曢敃锟界粻鑽ょ磽娴ｈ偂鎴濃枍閵忋倖鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灦閻涱喖顫滈敓浠嬪箹瑜版帩鏁冮柕澹本鏁ら梻鍌氬�烽懗鍫曞箠閹惧墎涓嶇�广儱顦崹鍌炴煢濡警妲洪柡鍡畵閺屾稑螖閸愩劋姹楅梺鍝勵儏闁帮綁寮婚悢鐚存嫹閻㈡鐒炬い搴㈡尵缁辨帡宕￠悙鑼獓婵烇絽娲ら敃顏堝箖濞嗘搩鏁傞柛鏇″煐鐎氬綊鏌″搴″箹缂侊拷婢舵劖鐓欓弶鍫濆⒔閻ｈ京鐥悙顒�顕滅紒缁樼☉椤斿繘顢欓懡銈囨晨闂備礁鎲℃穱娲綖婢跺本宕叉繛鎴欏灩楠炪垺淇婇婵愬殭闂傚绉瑰铏圭磼濡闉嶉梺鑽ゅ櫐缁犳挻淇婇悽绋跨妞ゆ牗鑹鹃崬銊╂⒑闂堟丹娑㈠礃閳哄偆鍟囬梻鍌氬�搁崐鎼佲�﹂鍕闁挎洖鍊哥粈鍫ユ煟閺冨倸甯堕柦鍐枛閺岋綁寮崒妤佸珱闂佽桨绀侀敃顏堝蓟閿曪拷铻ｅ〒姘煎灡瀛濋梻浣告惈椤戝棝鎮烽妷鈹撅拷鏃堝礃椤斿槈褔鏌涢幇鈺佸濞寸姴澧界槐鎾存媴閸撴彃鍓遍梺鎼炲妼濞尖�崇暦濞差亜顫呴柍鈺佸暙閸斿懘姊洪棃娑辩劸闁稿孩濞婇幃鍧楁晸閼恒儰绻嗛柣鎰典簻閿熻姤鐗滈弫顕�顢旈崼婵堫唵婵＄偛顑呭ù椋庡婵傚憡鐓忓┑鐘茬箳閸掍即鏌涢弮鎾绘闁逛究鍔嶇换婵嬪礋椤撶偟顐奸梻浣烘嚀閸㈡煡骞婂Ο铏规殾闁靛濡囩弧锟介梺绋挎湰缁嬫帡鎮炬總鍛娾拻闁稿本鐟чˇ锕傛煙绾板崬浜伴柟顖氭湰瀵板嫮浠﹂幆褍绨ユ繝鐢靛█濞佳兾涘☉銏犳辈闁挎梻鏅弧锟芥繝鐢靛Т閸婃悂寮虫繝鍥ㄧ厸闁跨喕濮ょ粋鎺旓拷锝庡亞閸橀亶姊虹�圭姵顥夋俊顐ｎ殔椤曪綁濡搁埡鍌滃弳闂佺粯姊荤划顖炈夋径瀣缁绢參顥撶弧锟介悗娈垮枦椤曆囧煡婢舵劕顫呴柣妯荤墦閸斿秹濡甸崟顖氱睄闁稿本鑹炬禒妯侯渻閵堝骸浜愰柡鍛箘濡叉劙骞樼�靛摜鎳濇繝鐢靛Т閸燁偊顢旈崼鏇熲拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?.");
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
		
		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗悗姘煎弮閹繝鎮╅崹顐㈡瀾闂佺粯顨呴悧鍡欑箔瑜旈弻锝夋晲閸℃ǜ浠㈤梺鍦焾閿曨亪骞冮姀銈嗗仏閻庢稒锚椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹥妞藉畷銊︾節閸愵煈妲遍梻浣告啞閹稿鎯勯姘辨殾闁靛繈鍊曠粻鐟懊归敐鍛辅闁归攱妞藉娲川婵犲啫闉嶉悷婊勬緲閸燁垳绮嬪鍡欘浄閻庯綆鍋嗛崢閬嶆煟鎼搭垳绉靛ù婊勭矒椤㈡棃顢旈崼鐔哄幐闂佸憡绋掑姗�鎮￠幇鐗堝�靛ù锝呭暙娴滃綊鏌ㄩ悢璇残撶紒瀣浮閺佸绻涚�电孝闁圭⒈鍋婇垾鏃堝礃椤斿槈褔鏌涢埄鍐噧妞ゎ値鍛＜闁绘劦鍓氱欢鑼磼婢跺﹦绉洪柣娑卞櫍瀹曞崬鈽夊锟介崬鍫曟⒑闂堟侗妾у┑鈥虫喘瀹曘垽骞橀崜浣猴紳闂佺鏈悷褔宕濆澶嬪珔閺夊牄鍔婃禍婊堟煏婢跺牆鍔ゅ褋鍨介弻銊╂偄鐠囨畫鎾淬亜閺冿拷閻楃姴鐣烽弶璇炬棃宕ㄩ鐙�鍞堕梻浣筋潐閸庣厧螞閸曨厾涓嶉柡宥冨妿缁犻箖鏌涢埄鍏╂垹浜搁銏＄厽妞ゆ挾鍣ュ▓鏃�銇勯鈩冪《闁圭懓瀚粭鐔碱敍濮橆剙顥庡┑锛勫亼閸婃牕顫忚ぐ鎺戠哗缂併劌鎽堕梻鍌氬�搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘☉妯锋妞ゅ繐鐗嗗洿闂佸綊妫跨粈渚�寮告笟锟介弻娑㈠箛闂堟稒鐏堝銈庡亜閹虫﹢寮婚弴銏犻唶婵犻潧娲ゅ▍褔姊虹粙鍖″姛闁稿鐩垾鏃堝礃椤斿槈褔鏌涢埄鍐炬疁闁搞倕顑夊娲捶椤撶偛骞嬪銈冨劜閹告儳危閹版澘绠虫俊銈勭劍濞呫垽姊洪崗闂磋埅闁稿氦浜▎銏ゆ倷閻戞鍘甸梻渚囧弿缁犳垿鐛锟介弻娑樜熺紒妯虹３濠殿喖锕ュ浠嬪箠閻愬搫唯闁告劕褰為柇顖炴寠濠靛枹褰掑礂閸忚偐绋囬梻鍌氬亞閸ㄥ爼寮婚敐澶嬫櫜闁告侗鍨虫导鍥╃磼閻愵剙鍔ら柕鍫熸倐瀵濡搁埡鍌氫簻闁荤姴娲﹂悾顐﹀箻鐠佽瀚归柛顭戝亝缁舵煡鎮楀顐㈠祮闁绘侗鍣ｅ畷鍫曨敆婢跺娅嶉梻浣虹帛钃辩憸鏉垮暟缁濡烽埡鍌楁嫽闂佺鏈悷褔藝閿旂晫绡�闁跨喍绮欓弻鍡楊吋閸涱垰骞堥梻浣稿閸嬩線宕曢柆宥呯＜闁靛ň鏅滈悡鏇熺節闂堟稒顥滈柍缁樻礈閹叉悂鎮ч崼婵堢懖闂佺锕ら…鐑藉蓟閵堝绠掗柟鐑樺灥婵垽姊洪崨濠勬噧閻庢碍婢橀～蹇撁洪鍕炊闂佸憡娲﹂崑鍛枔閺屻儲鈷戦悷娆忓閹藉啰锟借娲滈弫濠氬极閹剧粯鍤嶉柕澹啯娈归梻浣烘嚀閸ゆ牠骞忛敓锟�
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
		
		//TODO 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴ｆ暩椤牊淇婃禒瀣拺缂佸顑欓崕宥夋煕婵犲啰绠炵�殿喖顭峰鎾偄閾忚鍟庨梻浣稿閻撳牓宕伴弽銊﹀弿閻犻缚銆�閺�浠嬫煟閹邦剛鎽犻悘蹇ｅ幗閵囧嫰顢橀悩鎻掑箣閻庢鍠涢褔鍩ユ径濠庢僵妞ゆ劧绲芥刊鎵磽閸屾艾锟界兘姊藉澶婂瀭闁荤喐澹嬮弸鏃傛喐閺傛娼栨繛宸簼椤ュ牓鏌嶆潪鎷屽厡婵¤缍佸娲川婵犲嫭鍣х紓浣虹帛閿曘垽鎮伴璺ㄧ杸婵炴垶鐟ラ敓钘夘煼閺屻倝骞侀幒鎴濆濠电偛鎳忕划鎾诲蓟閻斿吋鍤冮柍鍝勫婢舵劖鐓ラ柣鏃傜帛椤ュ鐥紒銏犲籍妞ゃ垺鐟╅獮鎺楀箻閸撲胶妲囩紓浣稿⒔婢ф鏁冮锕�绠柣鎴ｆ缁�鍐煠绾板崬澧撮柣娑欐崌濮婄粯鎷呯粵瀣異闂佸摜濮甸悧鐘茬暦閹版澘鍨傛い鏇炴噹濞堛劍绻濋悽闈浶ｇ痪鏉跨Ч瀹曟垿宕熼娑氬幗濠殿喗锕╅崜娑㈠箺閻樼粯鍊垫慨妯诲墯濞兼劗绱掔紒妯兼创妤犵偛顑夐幃娆撳垂椤愩垺鐝濋梻鍌欐祰濞夋洟宕伴幘璇茬柧妞ゆ劧绠戠壕濠氭煏閸繍妲虹�规挷绶氶幃妤呮晲鎼粹剝鐏嶉梺鍝勬噺缁诲牓寮婚妸鈺傚亜闁告挷鑳堕悡鎾绘倵鐟欏嫭绀冮柣鐔叉櫊楠炲啴鍩￠崘顏嗭紲濠碘槅鍨抽崢褔鐛Δ鍛拻濞达絽鎲￠幆鍫ユ煕婵犲啯鍊愰柟顔矫埞鎴狅拷锝庝簽閻ｆ椽姊虹涵鍛涧闂傚嫬瀚伴幃锟犲即閵忊�筹拷鐢告煥濠靛棛澧曢柣鎾村姍閹顫濋悙顒�顏�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磽娴ｅ搫啸濠电儑鎷峰Δ鐘靛仦閻楁顭囪箛娑樼鐟滃繗鎽梺璇叉唉椤煤濮楋拷閹繝鏁撻悩鑼舵憰闂佺粯姊荤亸銊╁箯瀹勬壋妲堟繛鍡橆焽閸旈绱撴担鍝勑為柛搴ゅ皺閹广垹鈽夐姀鐘殿啋闂佸綊顣﹂懗鍫曞触鐎ｎ喗鈷戦柛婵嗗濠�鎵磼鐎ｎ偄鐏撮柟顔藉劤閳规垹锟斤綆鍋呭▍銏＄箾鐎电孝妞ゆ垵鎳愭竟鏇犵磼濡偐顔曢梺鐟邦嚟閸嬬偤鎯冮幋锔界厽妞ゆ挾鍋為ˉ銏ゆ煛鐏炲墽娲寸�殿喗鎸虫俊鎼佸Ψ瑜岄悽濠氭⒒娴ｈ櫣甯涢柟姝岊嚙鐓ら柣鏃傚帶閽冪喓锟藉箍鍎遍ˇ顖炴偂濞戞◤褰掓晲閸涱喖鏆堥梺璇茬箲閹告悂鍩為幋锔藉�烽柤纰卞墮椤ｅ爼姊洪幖鐐插闁稿簺鍊楃划姘綇閵娧呯槇闂佹悶鍎崝灞解枔閵堝拋娓婚柕鍫濇缁楀倿鏌ｉ幒鐐电暠鐞氭瑩鏌涢鐘插姕闁抽攱鍨块弻娑樷攽閸℃浠惧┑鐙呮嫹濞寸厧鐡ㄩ悡鐔兼煃閸濆嫸宸ラ柣蹇ョ畵閺岋絽鈽夐崡鐐寸彎濡ょ姷鍋炵敮鎺曠亙闂佽法鍠曞Λ鍕亱濠殿喗顨愰幏閿嬵殽閻愬澧遍柨鐔诲Г缁嬫帟鎽柣蹇撶箣閸楁娊寮婚敐鍡樺劅闁挎繂鎷嬮弳顓犵磽娴ｈ櫣甯涚紒璇茬墦楠炲啯绂掔�ｎ偒妫冨┑鐐村灦椤ㄥ牓骞戦弴銏♀拻濞达絽鎽滅粔娲煛閿熶粙鏌嗗鍛�梺绉嗗嫷娈樼�规挷绶氶悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�
		if (serviceid == 999999) {
			new fire.pb.activity.timernpc.PFightProc(roleid, npcId, npckey).submit();
			return;
		}
		
		if (serviceid == NpcServices.FORTUNE_WHEEL) {
			PReqFortuneWheel pwheel = new PReqFortuneWheel(roleid, npckey, npcId, true, NpcServices.FORTUNE_WHEEL);
			pwheel.submit();
			return;
		}
		
		if (serviceid == NpcServices.LEADER_SEE_CAMPAIGN_LIST) {// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秹骞婃惔銊ユ辈婵°倕鎳忛埛鎴犵磼鐎ｎ厽纭堕柣蹇涗憾閺屾稓锟斤綆鍋嗛埥澶嬨亜閺傝法绠伴柍瑙勫灴瀹曞爼濡烽妶鍥╂晨闂傚倷绀侀幖顐﹀磹閹间焦鍊舵繝闈涱儏閻撴洟鏌￠崘銊у闁绘挻鐩弻娑㈠煢閿熶粙寮插☉銏″�堕柨婵嗘川绾惧ジ寮堕崼娑樺鐎规洖鐬奸敓鍊燁潐濞叉鏁幒妤�鐓濋幖娣妼缁狅絾绻濋棃娑欙紞闁诲孩娼欓埞鎴︽偐閹颁礁鏅遍梺鍝ュУ閻楃娀寮崘顔嘉у璺烘４閹风兘鏁冮敓浠嬫偩閿熺姴绠ユい鏃囧Г椤旀洟姊绘担渚敯闁规椿浜浠嬪礋椤栨氨鏌ч梺褰掓？閻掞箓鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繐霉閸忓吋缍戦柛銊ュ�块弻锝夊箻瀹曞洤鍝洪梺鍝勵儐閻楁鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑閸濆嫭鍣虹紒璇茬墦瀵寮撮悢椋庣獮闂佺硶鍓濊摫闁绘繃姊荤槐鎺楁倷椤掞拷閸斻倗绱撳鍜冭含鐎殿喖顭烽幃銏ゆ偂鎼达絿鏆伴梻浣告惈椤︻垶寮插┑瀣缂備焦顭囬崢浠嬫⒑鐟欏嫬鍔ら柣掳鍔庣划鍫拷锝庡枟閻撴盯鎮橀悙棰濆殭濠殿喖鍊块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�?  by changhao
			new fire.pb.school.shouxi.PSendCandidateList(roleid, npckey).submit();
			return;
		}
		if (serviceid == NpcServices.VOTING) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紭闂佽法鍠愰崹婵嬫倿閿旂偓宕叉繝闈涱儏閻愬﹦鎲告惔鈭ワ綁顢楅崟顑芥嫼闂佸憡绻傜�氼噣鍩㈡径鎰厽闊洦鏌ㄦ慨宥囷拷瑙勬处閸嬪﹤鐣烽悢鍏煎仺闂傚牊绋戝Ч鏌ユ⒒閸屾瑧顦﹀鐟帮躬瀹曟垿宕ㄩ弶鎴犵暰婵犵數濮撮幏瀣熼崟顖涒拺闁告繂瀚～锕傛煕閺冿拷閸ㄥ潡鐛崘顔嘉у璺猴功閿涙粌鈹戦悙鏉戠仸闁挎洍鏅滅�靛ジ鏁撻敓锟�
			new CReqCandidatesList(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CAMPAIGN) { //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳顢旈崨顓т紦濠碉紕鍋戦崐銈夊磻閸曨厽宕查柟瀵稿У瀹曞弶绻濋棃娑欙紞婵炲皷鏅滈妵鍕箳閹存繀鍠婄紓渚�浜舵禍璺侯潖缂佹ɑ濯撮柤鎭掑劤閵嗗﹪姊洪棃鈺冪Ф缂佺姵鎹囬悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷?? by changhao
			new CCheckCanElect(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_CHALLENGE) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栭獮鎴﹀箛闂堟稒顔勭紓鍌欒兌婵兘宕伴弽顓炶摕闁靛ň鏅滈崑鍕煕濠靛棗鐝旈柕蹇嬪�栭悡鏇㈡煏婵炲灝鍔氶柨鐔绘濞尖�愁嚕鐠囨祴妲堥柕蹇婃櫆閺呮繈姊洪幐搴ｇ畵婵☆偅鐩棟闁靛鏅滈埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾稒绻濋崒婊呅ㄦ繝纰夌磿閺佽鐣烽悢纰辨晬婵﹢纭搁崬娲煟鎼达紕鐣柛搴″船鐓ら柕濞炬櫆閸嬨倖淇婇婵嗕汗缁炬崘妫勯湁闁挎繂瀚惌娆撴煕濠靛牆鍔嬪ǎ鍥э躬椤㈡洟濮�閻樿櫕顔掗柣搴㈩問閸犳牠鈥﹂悜钘夊瀭闁诡垎鍛闂佹悶鍎崝宥夘敊閹剧繝绻嗛柣鎰典簻閿熻姤鐗犲濠氬Ω閳轰浇袝闁诲函缍嗛崯鐔稿緞婵犲海鍙嗛梺鍛婃礀閻忔岸顢欓弮鍫熲拺缂備焦锚閻忋儲绻涚拠褍顩柨鐔诲Г閻旑剟骞忛敓锟�
			new CChallengeShouXiDiZi(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.LEADER_MY_CAMPAIGN) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴懞銉с�婇梺鍝ュУ閹稿骞堥妸褝鎷烽棃娑欐喐缁炬儳銈搁弻宥夊传閸曨剙娅ら梺鎶芥敱閸ㄥ爼濡甸崟顖氱闁绘劖娼欓鍓佺磽閸屾瑧顦︽い锔垮嵆楠炴劙骞庨挊澶岊唵闂佺鎻梽鍕磻閸曨垱鍊堕煫鍥ф捣閸斿秹鏌￠崒锔藉闂傚倸鍊烽懗鍓佸垝椤栨繃鎳岄柣鐔哥矋濠㈡﹢宕弶鎴殨闁归棿鐒﹂弲婊堟煕閹炬鎷戠槐鏌ユ⒑閸濆嫷妲搁柣妤�瀚板畷婵嗩吋婢癸箑顦靛畷濂稿Ψ閿旀儳骞愰梺璇茬箳閸嬨倕顭囨繝姘鐎瑰嫭澹嗛弳锕傛煕閵夛絽濡芥い鏃�鎸绘穱濠囨倷椤忓嫸鎷烽弽顓炶摕闁靛ň鏅涚憴锕傛倵閿濆骸鏆夊璺侯煬閻撱儵鏌涢弴鐐典粵妞ゆ梹妫冨铏圭磼濡櫣浠村┑鐐额嚋婵″洭鏁撻懞銉ㄥ缂傚秴锕ら～蹇旂節濮橆剛锛滃┑顔斤供閸撱劑骞忛悜鑺ュ�婚柤鎭掑劚濞堟垿姊洪崜鎻掍簼婵炲弶鐗犲畷鎺楀Ω瑜庨崰鎰版煛閸愩劎澧曠紒鐘崇墵閺屾稖顦虫い銊ユ嚇閹瑦绻濋崘锔跨盎濡炪倖甯掗ˇ顖涙櫠椤栫偞鐓熼柍鍝勶工閻忕娀鏌ｉ敐鍥у幋闁诡喓鍨婚崰濠冩綇閵婏附鐝滄繝鐢靛仩閹活亞寰婇崸妞伙拷锕傚醇閻斿鍤ら柟鍏肩暘閸斿秹鍩涢幒鎳ㄥ綊鏁愰崼婢挾鐥鐐靛煟闁哄本鐩弫鎰疀閺囩姵娈兼俊銈囧Х閸嬫稓鎹㈠锟藉顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷
			new fire.pb.school.shouxi.PMyElector(roleid, npckey).submit();
			return;
		}
		///////////////////闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒婵℃煡鏀辩换婵嗩嚗闁垮绶查柨鐔诲Г閹瑰洭骞冮悙鐑樻櫇闁稿本姘ㄩ悡鎴︽椤愩垺澶勭紒瀣浮閹�斥枎閹寸姷锛濇繛杈剧秮濞佳囨倶閳哄懏鐓涢悗锝庡亞濞叉挳鏌″畝瀣М濠德ゅ煐閹棃鍩勯崘顏冩喚婵犵數鍎戠徊钘壝洪妶澶嬫櫇妞ゅ繐鎳嶇换鍡涙煕椤愶絾绀�鐎瑰憡绻冮妵鍕箻鐠虹儤鐎惧銈嗘煥椤﹂潧顫忛搹瑙勫珰闁圭粯甯╅崝澶岀磼閻愵剚绶茬紒澶嬫尦閹儳鈹戠�ｎ亞顔愭繛杈剧稻閻℃洟骞楅弴銏♀拺閻犳亽鍔岄弸鏂库攽椤旇姤灏﹂柟顔界懄缁绘繈宕堕妸褍甯楅梺鍝勵槺閸嬬偞绔熼崱娑樼畺濠靛倸鎲￠悡蹇涚叓閸ャ劍绀�鏉╂繈鎮峰鍛暭閻㈩垱顨婂畷鎴﹀箛閻楀牏鍘介梺闈涚箳婵攱绂掑☉娆戠闁割偆鍠撳畷绡磖t//////////////////////////////////////
		if (serviceid == NpcServices.WINNER_START) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樼瑹閿熻棄顭囪钘濇い鎰剁畱閻ょ偓绻涢幋鐐跺妞ゃ儲姘ㄩ幉鎼佹偋閸繄鐟查梺缁樻尰濞叉鎹㈠☉銏犵闁绘垵娲ら崣鏇㈡⒑閻氬瓨瀚规繝鐢靛У绾板秹鎮￠弴鐔虹闁糕剝顨堢粻宕囩磼閻樺樊鐓奸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ婵°倗濮烽崑娑樏洪鈧拷浣肝旀担鐟邦�撻梺鑽ゅ枑濠㈡ɑ绔熷鍥╃＝闁稿本鑹鹃敓浠嬵棑濞嗐垽濡舵径濠勵唵闂佺粯鍨兼慨銈夋偂閺囥垺鐓欏ù鐓庣摠濞懷囨煛鐎ｎ剙鏋涢柡宀嬬秮楠炴鎹勯悜妯硷拷鐐箾閿濆懏鎼愰柨鏇ㄤ邯閵嗕礁鈽夊Ο閿嬫杸闂佸綊鍋婇崜姘额敊閸曨厾纾介柛灞剧懅閸斿秶鎲搁弶鍨殻闁炽儻绠撻幃婊堟寠婢跺孩鎲伴梻浣芥硶閸犳挻鎱ㄩ弶鎴晠婵犻潧娲㈡禍婊堟煙閻戞ê鐏ラ柨鐔绘椤兘骞冮敓鐘茬缂備焦菤閹锋椽鏌ｉ悩鍙夌闁跨喎锟界喐鐝柣蹇撶墢缁辨捇宕掑姣欍垽鏌ㄩ弴妯猴拷婵嬪箖妤ｅ啯鍊婚柦妯侯樀閸炲爼姊洪崫鍕窛闁稿缍侀崺锟犲川椤旀儳寮抽梻浣告惈閸燁偊宕愰挊澶樼�堕柛娑橈梗缁诲棝鏌熺紒妯虹闁糕晪绲鹃幈銊︾節閸曨厼绗￠梺鐟板槻閹冲繒绮悢纰辨晬婵犲﹤鍟瓏婵犵绱曢崑鎴﹀磹閺嶎厼鍨傞柛顐ｆ礀閸ㄥ倿鏌涜椤ㄥ牆鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�
			new CReqStartWinner(roleid, npckey).process();
			return;
		}
		if (serviceid == NpcServices.FIGHT_WINNER) {
			new CStartWinnerBattle(roleid, npckey).process();
			return;
		}
		////////////////////////闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒婵℃煡鏀辩换婵嗩嚗闁垮绶查柨鐔诲Г閹瑰洭骞冮悙鐑樻櫇闁稿本姘ㄩ悡鎴︽椤愩垺澶勭紒瀣浮閹�斥枎閹寸姷锛濇繛杈剧秮濞佳囨倶閳哄懏鐓涢悗锝庡亞濞叉挳鏌″畝瀣М濠德ゅ煐閹棃鍩勯崘顏冩喚婵犵數鍎戠徊钘壝洪妶澶嬫櫇妞ゅ繐鎳嶇换鍡涙煕椤愶絾绀�鐎瑰憡绻冮妵鍕箻鐠虹儤鐎惧銈嗘煥椤﹂潧顫忛搹瑙勫珰闁圭粯甯╅崝澶岀磼閻愵剚绶茬紒澶嬫尦閹儳鈹戠�ｎ亞顔愭繛杈剧稻閻℃洟骞楅弴銏♀拺閻犳亽鍔岄弸鏂库攽椤旇姤灏﹂柟顔界懄缁绘繈宕堕妸褍甯楅梺鍝勵槺閸嬬偞绔熼崱娑樼畺濠靛倸鎲￠悡蹇涚叓閸ャ劍绀�鏉╂繈鎮峰鍛暭閻㈩垱顨婂畷鎴﹀箛椤撶姷顔曢梺鍓插亝缁诲嫭绂掗姀鐘斀闁挎稑瀚▓绔�//////////////////////////////////////

		
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

		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸涱厾鍘梺閫涚┒閸斿矁鐏掗梺鍦焾濞寸兘濡撮幇顔剧＝濞达絽鎼皬闂佸憡顨嗘繛濠傤嚕鐠囨祴妲堟俊顖炴敱閺傦拷闂備礁鎲″ú锕傚磻閸曨剚鍙忛柡鍥╁剱濞撳鏌曢崼婵嬵�楀ù婊勭箖缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤兘骞冮姀銈呭窛濠电姴瀚倴闂傚倷绀侀幉锟犲箰閸℃稑宸濇い鏃傜摂閸熷懐绱撻崒姘拷鎼佸磹妞嬪孩顐介柕鍫濐槸缁狀垶鏌ｉ幋锝呅撻柣鎾存礋閺岀喐瀵肩�涙ɑ閿梺鍝勵儑閸犳牠寮婚敐澶婄閻庣數纭跺Σ鍫濐渻閵堝骸寮ㄦ繛澶嬫礋楠炴垿宕熼姘炊闂佸憡娲熷褎淇婃搴ｇ＝濞达綁缂氬鎼佹煕濞嗘瑦瀚归梻浣虹《閺呮粓鎮у鍫濈闁靛繒濮Σ鍫ユ煏韫囨洖鈻堥柛鐐茬埣濮婃椽妫冨☉杈ㄐら梺绋匡攻閻楃姴鐣烽弶娆炬僵闁煎摜顣介幏娲⒑閸涘﹦绠撻悗姘煎櫍閹偟鎹勯妸褏锛滈梻濠庡亽閸橀箖鎯屽▎鎾寸厓闁靛鍨抽悾闈涒攽閳╁啯鍊愰柛鈹惧墲閹峰懏绗熼娴剁偤姊婚崒娆愮グ妞ゆ洘鐗犲畷瑙勬償閵娿儳顦ㄥ銈庡幗閸ㄥ爼藟瀹ュ棛绡�闁汇垽娼у瓭闂佹眹鍎遍ˇ闈涱嚕閸洖绀岄柍鈺佸暙椤忚泛鈹戞幊閸婃捇鎮為敃鍌氱煑闊洦绋掗悡娑橆熆鐠轰警鍎忔繛鍫枟缁绘稑顔忛缁樺枤闂佽桨绀佸ú顓㈠蓟閺囷紕鐤�闁哄洨鍊妷鈺傜厽闁挎繂妫欓妵婵囨叏婵犲懏顏犻柟椋庡█閸ㄦ儳鐣烽崶閿嬪濠电姵纰嶉悡鏇熺箾閹存繂鑸归柡瀣枛閺岋綁鏁愰崶褍骞嬪┑顔硷功缁垶骞忛崨鏉戝窛濠电姴鍊瑰▓妯荤節閻㈤潧浠╂い鏇熺矌缁骞樺畷鍥ㄦ濠电姴锕ら崰姘焽閳哄懏鍋ｉ弶鐐村缁夊潡鏌曟径鍡樻珕闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�
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
		
		if(serviceid == 1987){//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊块幐濠冪珶閳哄绉�规洏鍔戝鍫曞箣閻欏懐骞㈤梻鍌欑閹测剝绗熷Δ鍛煑閹兼番鍔嶉崑鍕煕閳╁厾鑲╂崲閸℃ǜ浜滈柡宥冨妿閹冲懐绱掓径瀣嚋缂佺粯鐩獮瀣倻閸℃瑥濮遍梻浣告惈閸燁偊鎮ч崱娆戠焼閻庯綆鍠楅悡鍐煟濮橆剛鎽犻悗姘辨嚀閳规垿顢欏▎鐐秷濡炪們鍔岄敃銈夛綖韫囨拋娲敂閸曨収鍟囬梻浣虹帛閸旀牞銇愰崘鈺傚弿闁割偅娲橀埛鎴︽煕濞戞﹫鏀婚悘蹇庡嵆閺岋綁鎮㈤崣澶嬬彋濡ょ姷鍋涘Λ娑欑閿旇姤濮滈柟绋垮椤ュ牏锟借娲忛崝鎴︺�佸▎鎾崇畾鐟滃秶绮婚妷鈺傗拻濞达絿鐡旈崵娆撴倵濞戞帗娅囩紒顔界懇楠炴帒顪冩导娆愬闁挎洖鍊搁悙濠囨煃閸濆嫬鏆曠紒妤�顦靛娲偡闁箑娈舵繝娈垮櫍椤ユ挻绔熼弴鐔洪檮闁告稑锕﹂崢顏呯節閻㈤潧孝缂佺粯甯￠幃楣冩焼瀹ュ棛鍘撶紓鍌欑劍钃辩紒锟界�ｎ喗鐓涚�癸拷鐎ｎ剛锛熸繛瀵稿缁犳挸鐣峰鍡╂Х濠碘剝褰冮悧鎾诲蓟瑜忕槐鎺懳熼悡搴樺悅闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩冪懃椤わ拷婵＄偑鍊戦崕閬嵥囨导鏉懳﹂柛鏇ㄥ灠鍞梺鎸庢煥婢т粙鎮鹃棃娑辨富闁靛牆绨肩花濠氭煕閻旈鎽犲ǎ鍥э躬瀹曞ジ寮撮悙娈挎О闂備線娼ч…鍫ュ磿濞差亝鍊甸柟缁㈠枟閳锋帒霉閿濆懏鎯堥柛鏃撶畵閺岋繝宕ㄩ鍛彋閻庤娲濋～澶岋拷浣冨亹閿熻姤绋掗敋濞寸姴銈稿铏圭磼濡櫣浼囨繝娈垮枔閸婃繂顕ｉ弻銉ョ濞达絽婀遍崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?
			new PTakeWeiBoAwardProc(roleid).submit();
			return;
		}

		// PvP闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟顔炬焿椤﹀綊鏌熼姘辩劯妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋嗙粻楣冩煙鐎电鍓卞ù鐓庢閺岀喐娼忛崜褏鏆犻梺娲诲幗椤ㄥ﹪鎮￠锕�鐐婇柕濞э拷濡俱劑姊虹紒妯诲暗闁哥姵鐗犲濠氭晸閻樿尙锛滃┑顔矫ぐ澶愭惞鎼淬劍鈷戦悹鍥ｏ拷铏亶闂佹悶鍔屽鈥愁嚕鐠囨祴妲堟繛鍡樺姇閸斿懘姊洪幐搴ｂ槈閻庢艾鎳撻ˇ褰掓煛瀹�瀣？濞寸媴绠撳畷婊嗩槼闁告帗鐩幃妤�鈻撻崹顔界亶闂佽鐡曞▍鏇熺┍婵犲洤绠瑰ù锝堝�介妸鈺傜厪闁割偅绻勬晶鏇㈡煟閹烘洦鍤欓柍瑙勫灴閹晛鈻撻幐搴㈢槣闂備礁鎲￠幐鑽ゆ崲閸儱绠栭柨鐔哄Т閻掓椽鏌涢幇鍏告喚婵炲弶鎮傚娲礈閹绘帊绨煎┑鐐插级閻楃娀骞忛幋锔藉亜闁稿繗鍋愰崣鍡椻攽閻樼粯娑ф俊顐幖鍗辩憸鐗堝笚閻撴盯鏌涘☉鍗炴灍闁稿﹥鍔欓弻锛勪沪鐠囨彃顫囬梺璇″枔閸婃繂鐣烽幒鎴旀婵妫旂槐锟�?
		IPvPServiceHandle sHandle = PvPServiceHandleFactory.create(serviceid);
		if (sHandle != null) {
			sHandle.handle(roleid, serviceid);
			return;
		}

		if (BingFengLandMgr.bingFengServiceids.contains(serviceid)) {
			new PBattletoBingFeng(roleid, npcId).submit();
			return;
		}

		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘介梺瑙勫劤椤曨參骞婇崟顖涚厪闁搞儜鍐句純閻庢鍠栭敓鐣屽櫏濡茬厧顪冮妶鍐ㄥ姕缂侇喗鎹囧濠氭偄閸忓吋鍎銈嗗姂閸ㄥ綊锝為幒妤佲拺閺夌偞澹嗛ˇ锔剧磼婢跺﹦绉烘鐐插暙閳诲酣骞橀弶鎴嫹缂佹ü绻嗘い鏍仦閺侀亶鎮楀顑惧仮婵﹦绮幏鍛村川婵犲倹娈樼紓鍌欑椤戝棝宕归崸妤�鏋侀柛鎰靛枛鍞梺瀹犳〃閼冲爼鎮炬ィ鍐┾拺闁告稑锕ユ径鍕煕閵娾晙鎲鹃柟顕嗙節瀵挳濮�閿涘嫬甯惧┑鐘垫暩閸嬫盯鎮樺┑瀣婵鍩栭悡鐘电磼鐎ｎ厽纭剁紒澶嬫そ閺岋紕浠︾拠鎻掝潎閻庢鍠楀娆掔亽闂佹儳绻橀敓鑺ョ〒缁�鍕⒒閸屾瑦绁版い鏇熺墵瀹曨垶顢曢敃锟介悙濠勬喐閺冨牆鑸归柛顐ｆ礃閳锋垿姊婚崼鐔恒�掔紒鐘冲哺閺岋繝宕ㄩ鍓х厒缂備緡鍠栭敃顏堛�侀弴銏℃櫆閻熸瑱绲剧�氬ジ姊绘担鍝勫付妞ゎ偅娲熷畷鎰板即閻愬灚鎳冩繝鐢靛Х閺佹悂宕戦悩娲绘晪婵犲﹤鎳愭稉宥夋煙閻戞﹩娈斿鍛存⒑閸︻厼顣兼繝銏☆焽缁牓宕橀埞澶哥盎闂佸搫娲ㄩ崑鐐核夐悩鐢电＜閻庯綆浜炵粻缁樻叏婵犲懏顏犻柟鐟板婵℃悂濡烽敂鎯х稈闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹
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

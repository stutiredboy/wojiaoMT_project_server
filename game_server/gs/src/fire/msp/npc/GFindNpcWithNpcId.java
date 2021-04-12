
package fire.msp.npc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import fire.pb.activity.timernpc.TimerNpcService;
import fire.pb.game.SUseXueYueKey;
import fire.pb.map.Npc;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFindNpcWithNpcId__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFindNpcWithNpcId extends __GFindNpcWithNpcId__ {
	@Override
	protected void process() {
		// protocol handle
		int actId = TimerNpcService.getInstance().getActId(npcid);
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喖宕崟顒�锟藉酣姊虹紒妯虹瑨闁挎洏鍎垫俊鐢稿礋椤斿墽鏉搁梺瑙勫礃濞夋盯鍩涢崼銉︹拺閺夌偞澹嗛ˇ锔姐亜閹存繃鍠樻鐐差樀瀹曘劍绻濋崘銊ュΤ闂備線娼ч…鍫ュ磿閹惰姤鍋柛鏇ㄥ灡閳锋垿姊婚崼鐔峰礋闁割偁鍎遍悿鐐箾閹存瑥鐏柛瀣�圭换娑㈠箣濞嗗繒浠鹃梺缁樻尰濞叉鎹㈠☉銏犵婵犻潧妫滈崺鐐烘⒑閸濆嫷鍎嶉柛濠冪箞瀵鈽夊Ο閿嬬�婚棅顐㈡处濡繐螞閻愮儤鈷戦悗鍦濞兼劙鏌涢妸銉﹀仴妤犵偛鍟埢搴ㄥ箻瀹曞洨鍘┑鐘灱閸╂牞鎽梺鎸庣◥缁舵艾顫忛崫鍕懷囧炊瑜忛崝鎾⒑閸撹尙鍘涘ù婊庝簻椤曪綁寮婚妷锕�浜归梺鑲┾拡閸撴艾鈻撴ィ鍐┾拺婵懓娲ら悘鈺呮煙鐠囇呯瘈鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�
		if (actId == -1) {
			return;
		}
		
		boolean findit = false;
		int findmapid = 0;
		int findposx = 0;
		int findposy = 0;
		long npckey = 0;
		
		Role sceneRole = RoleManager.getInstance().getRoleByID(roleid);
		int roleMapid = sceneRole.getMapId();
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁涘缍堟繝銏㈡嚀濡瑩寮茬捄浣曟棃宕ㄩ鐙呯幢闂佽鍑界紞鍡涘窗濡ゅ懏鍋傞柡鍥ュ灪閻撳啴鏌嶆潪鎵槮闁哄鍊栫换娑㈠醇椤掑倻袦闂佸搫琚崐婵嬪箖瑜斿畷鐓庘攽閹邦剚鐤傞梻鍌欑窔濞佳兠洪妶鍥锋嫹濮樼厧鐏ｇ紒顔款嚙閳藉濮�閻樻鍟嬮梻浣告惈椤︿即宕归崹顐ゎ洸閻犻缚銆�閺�浠嬫煟閹邦垰鐨洪柟鐣屽Х缁辨帡顢欓懖鈺冧紘缂備浇浜崑鐐垫崲濠靛鐐婄憸鎴﹀箺閺囥垺鈷戠紓浣股戦埛鎺楁煕濡姴鎳愭稉宥嗘叏濡潡鍝洪柛鐘冲姉閿熻棄绠嶉崕閬嵥囬姣垦囧蓟閵夈儳楠囬梺鍓插亝缁嬫垶淇婄粙妫电懓顭ㄩ崟顓犵厜闂佸搫鏈ú鐔风暦閻撳簶鏀介柛銉戝嫷浠梻鍌欑劍閹爼宕愰弴鐏绘椽顢橀姀鐘烘憰闂佺粯姊婚埛鍫ュ极婵犲洦鐓熼柟鎯у暱椤掋垺绂嶅☉銏♀拻濞达絽鎽滈弸鍐┿亜閺囧棗鍠氬鈺呮煥閺傚灝鈷斿☉鎾崇У缁绘盯骞嬪▎蹇曚患缂備緡鍋勭粔褰掑蓟閻旂尨鎷烽悽娈跨劸闁告挸纾槐鎺撴綇椤垶鐤佸┑顔硷工椤嘲鐣烽幒鎴旀瀻闁瑰濮峰畷鍙夌節閻㈤潧浠╁鐟扮墕閻ｇ兘妫冨☉鍗炴婵犵數濮村ú锕傚磻閳哄喛鎷烽惂鍛婂闂佽法鍠撻弲顐ゅ垝閸喓绡�闁稿本顨嗛弬锟介梻浣虹帛閿氱�殿喖鐖奸獮鏍箛閻楀牏鍙冮梺鍛婂姦娴滄粓寮搁弮鍫熺叆闁绘梻鍎ゅ▍鏇熺箾閸涱偄鐏叉鐐茬箻閹粓鎳為妷褍寮抽梻浣虹帛濡線顢氳椤ｈ法绱撻崒娆戭槮闁稿﹤婀遍弫顕�鏁撻悩鍙夌�梺鍛婂姦閸犳牜澹曢崗鍏煎弿婵☆垰銇橀崥顐︽煛閸℃洖宓嗛柡宀嬬秮閹垽宕妷褏鍘戠紓鍌欑贰閸犳牠鎯屾笟锟介幃妯硷拷锝庡枟閳锋垹绱撴担鑲℃垿藟閸℃绠鹃柛婊冨暟閹厧顭跨憴鍕闁圭锕ョ粩鐔封攽閸℃瑧楔闂佽桨鐒﹂崝娆忕暦閵娾晩鏁婇柦妯侯槸婢瑰秹姊虹拠鎻掝劉缂佸甯為幑銏ゅ醇閵夈儳鐣哄┑掳鍊曢崯顖炲窗閸℃稒鐓曢柡鍥ュ妼婢ь喗銇勯敂瑙勬珚婵﹥妞藉畷銊︾節閸愩劍娈梻浣告憸婵敻鎮ч悩缁樺仒妞ゆ洩鎷风�规洘锕㈤垾锔撅拷锝庡亝閵囨繃銇勯姀鈩冾棃鐎规洏鍔戦、娆戠驳鐎ｂ晜鍩涢梻鍌氬�搁崐宄懊归崶褉鏋栭柡鍥ュ灩闂傤垶鏌ㄩ弴鐐诧拷鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		Map<Long, NPC> allNpcInScreens = role.getAllNpcsInScreens();
		for (NPC npc : allNpcInScreens.values()) {
			if (npc.getNpcID() == npcid) {
				findit = true;
				findmapid = npc.getScene().getMapID();
				findposx = npc.getPos().toGridPos().getX();
				findposy = npc.getPos().toGridPos().getY();
				npckey = npc.getNpcKey();
				break;
			}
		}
		
		//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜忛弳锕傛煟閵忋埄鐒剧紒鎰殜閺岀喖鏌囬敃锟介弸娑㈡煕閵婏妇绠炴鐐寸墪鑿愭い鎺炴嫹闁诲浚浜濈换娑㈠川椤栨锝吳庨崶褝韬┑鈥崇埣瀹曘劑顢欓崗纰变哗缂傚倸鍊烽懗鑸垫叏閹惰棄纭�闁规儼妫勯拑鐔哥箾閹寸們姘ｉ崼鐔稿弿婵°倧鎷烽柣妤�锕顐﹀箚瑜夐弨浠嬫煟閹邦剙绾ч柛锝堟閳规垿鎮滈崶銊ヮ伓闂傚倷绀侀幖顐︽儗婢跺苯绶ら柛濠勫枔娴滀粙姊绘担鐟板姢缂佺粯锕㈤弫鎾绘嚍閵壯侊拷鎺戭渻鐟欏嫬鈻曟慨濠勭帛閹峰懘宕ㄦ繝鍐ㄦ瀾濠电姵顔栭崰妤�顭囧▎鎺斾罕婵犵數濞�濞佳囶敄閸涘瓨瀚呴柣鏂挎憸缁犻箖鏌熺�涙鎳冮柣蹇婃櫊閺岋綁骞掗幘娣虎闂佸搫鏈惄顖炵嵁閸ヮ剙绀傞柛婵勫劜鐎垫粍绻濈喊妯哄⒉鐟滄澘鍟撮幃褔宕卞☉妯煎幋闂佺鎻梽鍕磹閻戣姤鐓曟繛鍡楁禋濡叉悂鏌ｅ┑鍥ㄢ拻缂佽鲸鎹囧畷鎺戭潩濮ｆ瑱绱曠槐鎺楁晸閼恒儳鐟归柨鐔剁矙閺佹劙鎮欓崜浣烘澑闂佺懓褰為悞锕�顪冩禒瀣拷渚�寮崼婵堫槹濡炪倖鎸嗛崘鈺傛緫闂傚倸鍊搁崐椋庣矆娴ｉ潻鑰块梺顒�绉寸壕鍧楁煏閸繍妲哥紒鐘虫緲閳规垿鎮╃�圭姴顥濈紓浣哄閸ㄨ泛顫忓ú顏嶆晢闁跨喓鏅划鏃堟偨缁嬭法鍘遍梺鐟邦嚟閸嬬偤宕ｈ箛娑欑厽闁绘柨鎼。濂告煙閸忕厧濮嶉柡灞剧洴瀵噣鏁撻挊澶屾殕闁归棿绀侀拑鐔兼煟閺傚灝鎮戦柟顖滃仦閵囧嫰骞囬懜闈涱伓婵＄偑鍊曠换鎰版偋濠婂牆鏋侀悗锝庡枟閻撱儲绻濋棃娑欙紞婵″弶鎮傞弻娑㈠Ω閵夈儻鎷疯ぐ鎺懳﹂柛鏇ㄥ灠缁犳盯鏌嶆潪鎷屽厡濞寸厧瀚槐鎾存媴閻熸澘顫庨梺绋款儍閸婃繂顕ｆ繝姘櫜闁糕剝锚閸斿懎顪冮妶鍡欏缂侇喖瀛╅悧搴㈢節閻㈤潧浠滈柣掳鍔庨崚鎺曠疀閹绢垱鐏冨┑鐐村灦缁孩绂嶉柆宥嗏拻濞达綀娅ｇ敮娑㈡煛鐏炶濮傜�规洏鍎抽敓鏂ょ秵閸犳牠鎮￠弴銏＄厵閺夊牓绠栧顕�鏌嶉柨瀣诞闁哄本鐩、鏇㈡晲閸ヨ埖娈规繝鐢靛仜閹冲骸螞濠靛绠栨俊銈忔嫹妞ゎ偅绻堥幃娆擃敆閿熶粙顢旈敓锟�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喕濮ゅú鐔肩嵁婵犲懐鐤�婵炴垶顭囬敍娑㈡⒑鐠恒劌鏋斿┑顔炬暬閹ょ疀閹垮啰鍞甸柣鐘荤細濞咃絾鏅堕弴銏＄厱闁哄啫鍊归弳顒勬煛鐏炶锟芥繈骞冭瀹曠厧鈹戦幇顒佺杺闂傚倷绶氬褍煤閵堝浄鎷峰鐓庣仯缂侇喛顕ч埥澶愬閻樻鍟嬮梻浣告惈椤︿即宕归崹顐ゎ洸閻犻缚銆�閺�浠嬫煟閹邦垰鐨洪柟鐣屽Х缁辨帡顢欓懖鈺冧紘缂備浇浜崑鐐垫崲濠靛鐐婄憸鎴﹀箺閺囥垺鈷戠紓浣股戦埛鎺楁煕濡姴鎳愭稉宥嗘叏濡潡鍝洪柛鐘冲姉閿熻棄绠嶉崕閬嵥囬姣垦囧蓟閵夈儳楠囬梺鍓插亝缁嬫垶淇婄粙妫电懓顭ㄩ崟顓犵厜闂佸搫鏈ú鐔风暦閻撳簶鏀介柛銉戝嫷浠梻鍌欑劍閹爼宕愰弴鐏绘椽顢橀姀鐘烘憰闂佹寧绋戠�氼亜鈻介鍫熺厱闁圭偓顨呯�氼剟宕归柆宥嗏拻濞达綀濮ら妴鍐磼閿熻姤绗熼敓钘夌暦閹版澘閿ゆ俊銈忔嫹缂佺姷濞�閺岋綁骞囬浣瑰創闁哥儐鍨堕幃宄邦煥閸愵�咃拷瑙勬礈閺佸鐛幒妤�绠婚柛鎾茶兌濡插洭姊绘担鍦菇闁搞劏妫勯…鍥槼缂佸倹甯掗…銊╁醇閻斿搫骞楅梺鍦劋婵炲﹤鐣峰┑瀣闁挎洩鎷烽柡瀣╃窔閺屾盯骞囬棃娑欑亪濡炪値鍋勯幊姗�寮婚弴銏犻唶婵犻潧娲﹂幃娆戠磽娴ｉ绛忕紒鐘虫尭椤繘鎼圭憴鍕／闂侀潧顭堥崕鏌ユ偟閵忋倖鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗?
		if (!findit) {
			xbean.timerNpcInfoCol npcInfo = xtable.Timernpcinfotable.select(actId);
			if (npcInfo == null) {
				return;
			}
			
			List<Long> npcList = new ArrayList<Long>();
			for (Map.Entry<Long, xbean.timerNpcInfo> npcinfos : npcInfo.getNpcinfo().entrySet()) {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氭澘顕ｉ崨濠勭懝闁跨喍绮欏濠氭偄閸忓皷鎷婚柣搴ㄦ涧婢瑰﹤危椤斿墽纾藉ù锝呮惈鍟告繝鐢靛剳閹风兘姊洪崫鍕伇闁哥姵鐗犻獮鍐ㄢ枎閹垮啯鏅㈤梺璺ㄥ枍缁瑥鐣峰┑鍫熷磯閻炴稈鍓濋弬锟芥俊鐐�栧Λ浣肝涢崟顖氱厺闁哄洢鍨洪悡娑氾拷鐧告嫹閻庯綆鍓涜ⅵ婵＄偑鍊戦崹娲�冮崱妤婂殫闁告洦鍙忛幏鐑芥晲鎼粹�茬盎濠电偛鐗嗗濠囨⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煟閹达絽袚闁稿﹤娼￠弻銊╁即閻愯鎷疯ぐ鎺戠？闁瑰濮甸崰鎰版煟濡わ拷閻楀棛绮幒鏃傜＜闁跨喕濮ゅ鍕暆鐎ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘┑鍕姎閺嶁�愁渻閵堝啫濡奸柨鏇ㄤ邯閹即顢氶敓钘夌暦婵傜唯闁靛绨堕弲鐘诲蓟瀹ュ棙濮滈柟宄拌嫰閸樷�愁渻閵堝棙鈷愰柛鏃�鐗滈幑銏犫槈濞嗘劗绉堕梺鍛婃寙閸愩劎鍘掗梻鍌欒兌椤㈠﹥鎱ㄩ妶鍥у灊闁规崘顕х粻鏍旈敐鍛殲闁哄懏鎮傞弻銊╂偆閸屾稑顏�? 0=缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銏╁晱闁哥姵宀稿顐ｇ節濮樸儻鎷锋担鑲濇棃宕ㄩ鑺ヮ仧濠电偛顕慨鎾敄閸岀偞鏅搁柤鎭掑劜椤ュ牏锟借娲橀敃銏ゃ�佸▎鎾村癄濠㈣泛鏈宥嗙節閻㈤潧袨闁搞劌缍婂畷銏狀煥閸繄鏌у┑鐘诧工閻楀﹪宕曟惔鈧簻闁哄稁鍋勬禒婊堟煛鐎ｂ晝绐旈柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱� 1=闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牠鈥栨径鎰拺闁荤喐婢橀弳閬嶆煟椤撶偛锟芥悂锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦鈽夐柨鏇樺劦瀹曟洟骞橀幇浣瑰瘜闂侀潧鐗嗗Λ妤呮倶閵夛妇绠剧�瑰壊鍠栭獮鏍煟閿濆鏁遍悗闈涖偢瀵爼骞嬮悩鍨緫濠碉紕鍋戦崐鏍蓟閵婏附娅犲ù鐘差儐閸嬪倿鏌熼崜褏甯涢柍閿嬪灴閹綊骞侀幒鎴濐瀳濠电偛鎳忛崝娆撳蓟閻旂厧绀勯柕鍫濇椤忥拷? 2=闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч閿濈偛鈹戠�ｎ偅娅囬梺绋跨焿婵″洨绮欒箛鏃傜瘈闁靛骏绲介悡鎰版煕閺冿拷閻楃姴鐣烽幋锕�围濠㈣泛顑囬崢鎼佹⒑閹肩偛鍔楅柡鍛☉閻剟姊绘担铏瑰笡閻㈩垱甯￠弫鍐Ψ瑜庡畷鍙夌箾閹存瑥鐏╂鐐灪娣囧﹪顢涘┑鍥朵哗婵炲濮甸幐鍐差潖濞差亜绠归柣鎰絻椤绱撴担绛嬪殭闁绘鎸搁锝囨嫚瀹割喖鎮戞繝銏ｆ硾璋╅柕濞炬櫆閻撱儵鏌￠崘銊ワ拷鐟扳枍閺囩伝褰掓偂鎼淬垺鎮欓梺瀹狀潐閸ㄥ潡宕洪崟顖氱闁靛ě鍛仭闂傚倷鑳剁划顖炪�冮崱娑樼闁搞儜灞芥闁荤姴娲︾粊鏉懳ｉ崼銉︾厪闊洤锕ュ▍鍡涙煛閸涱喚绠炴慨濠冩そ楠炴劖鎯旈敐鍥╂殼婵犵數鍋涢惇浼村礉鎼粹垾锝夊箛閻楀牆浜遍梺鍓插亖閸ㄥ顢欓弴銏＄厽閹兼番鍨婚埦浣广亜椤撶偞鍠橀柟顔挎珪缁绘繂顫濋鐘插箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐
				if (npcinfos.getValue().getNpcstatus() == 0) { //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐碉拷鐟版啞缁诲牓寮婚弴銏犲耿婵°倕顑嗛弫鐐箾閿濆懏鎼愰柨鏇ㄤ邯閻涱噣骞樼拠鑼唺闂佸搫鍊哥花閬嶅矗濞差亝鈷掑ù锝呮啞閹牓鏌￠崼顐㈠⒋闁诡垰瀚伴、娑㈡倷椤忓孩瀚瑰〒姘炬嫹鐎殿喗鎸虫慨锟介柍鈺佸暞閻濇娊姊绘担瑙勫仩闁稿寒鍣ｅ鎻掆攽閸垻骞撳┑掳鍊ч幏鐑芥煃鐟欏嫬鐏撮柟顔界懇閹崇娀顢楁担鐟版灈缂傚倸鍊风欢锟犲闯椤栨粎绀婂〒姘炬嫹闁绘侗鍠涚粻娑樷槈濞嗘劖顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
					npcList.add(npcinfos.getKey());
				}
			}
			
			for (Long npckeyy : npcList) {
				Npc npc = SceneNpcManager.selectNpcByKey(npckeyy);
				if (npc == null)
					continue;
				
				if (roleMapid == npc.getMapId()) {
					findit = true;
					findmapid = roleMapid;
					findposx = npc.getPos().toGridPos().getX();
					findposy = npc.getPos().toGridPos().getY();
					npckey = npckeyy;
					break;
				}
			}
		}
		
		if (!findit) {
			xbean.timerNpcInfoCol npcInfo = xtable.Timernpcinfotable.select(actId);
			if (npcInfo == null) {
				return;
			}
			
			List<Long> npcList = new ArrayList<Long>();
			for (Map.Entry<Long, xbean.timerNpcInfo> npcinfos : npcInfo.getNpcinfo().entrySet()) {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氭澘顕ｉ崨濠勭懝闁跨喍绮欏濠氭偄閸忓皷鎷婚柣搴ㄦ涧婢瑰﹤危椤斿墽纾藉ù锝呮惈鍟告繝鐢靛剳閹风兘姊洪崫鍕伇闁哥姵鐗犻獮鍐ㄢ枎閹垮啯鏅㈤梺璺ㄥ枍缁瑥鐣峰┑鍫熷磯閻炴稈鍓濋弬锟芥俊鐐�栧Λ浣肝涢崟顖氱厺闁哄洢鍨洪悡娑氾拷鐧告嫹閻庯綆鍓涜ⅵ婵＄偑鍊戦崹娲�冮崱妤婂殫闁告洦鍙忛幏鐑芥晲鎼粹�茬盎濠电偛鐗嗗濠囨⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煟閹达絽袚闁稿﹤娼￠弻銊╁即閻愯鎷疯ぐ鎺戠？闁瑰濮甸崰鎰版煟濡わ拷閻楀棛绮幒鏃傜＜闁跨喕濮ゅ鍕暆鐎ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘┑鍕姎閺嶁�愁渻閵堝啫濡奸柨鏇ㄤ邯閹即顢氶敓钘夌暦婵傜唯闁靛绨堕弲鐘诲蓟瀹ュ棙濮滈柟宄拌嫰閸樷�愁渻閵堝棙鈷愰柛鏃�鐗滈幑銏犫槈濞嗘劗绉堕梺鍛婃寙閸愩劎鍘掗梻鍌欒兌椤㈠﹥鎱ㄩ妶鍥у灊闁规崘顕х粻鏍旈敐鍛殲闁哄懏鎮傞弻銊╂偆閸屾稑顏�? 0=缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銏╁晱闁哥姵宀稿顐ｇ節濮樸儻鎷锋担鑲濇棃宕ㄩ鑺ヮ仧濠电偛顕慨鎾敄閸岀偞鏅搁柤鎭掑劜椤ュ牏锟借娲橀敃銏ゃ�佸▎鎾村癄濠㈣泛鏈宥嗙節閻㈤潧袨闁搞劌缍婂畷銏狀煥閸繄鏌у┑鐘诧工閻楀﹪宕曟惔鈧簻闁哄稁鍋勬禒婊堟煛鐎ｂ晝绐旈柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱� 1=闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牠鈥栨径鎰拺闁荤喐婢橀弳閬嶆煟椤撶偛锟芥悂锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦鈽夐柨鏇樺劦瀹曟洟骞橀幇浣瑰瘜闂侀潧鐗嗗Λ妤呮倶閵夛妇绠剧�瑰壊鍠栭獮鏍煟閿濆鏁遍悗闈涖偢瀵爼骞嬮悩鍨緫濠碉紕鍋戦崐鏍蓟閵婏附娅犲ù鐘差儐閸嬪倿鏌熼崜褏甯涢柍閿嬪灴閹綊骞侀幒鎴濐瀳濠电偛鎳忛崝娆撳蓟閻旂厧绀勯柕鍫濇椤忥拷? 2=闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч閿濈偛鈹戠�ｎ偅娅囬梺绋跨焿婵″洨绮欒箛鏃傜瘈闁靛骏绲介悡鎰版煕閺冿拷閻楃姴鐣烽幋锕�围濠㈣泛顑囬崢鎼佹⒑閹肩偛鍔楅柡鍛☉閻剟姊绘担铏瑰笡閻㈩垱甯￠弫鍐Ψ瑜庡畷鍙夌箾閹存瑥鐏╂鐐灪娣囧﹪顢涘┑鍥朵哗婵炲濮甸幐鍐差潖濞差亜绠归柣鎰絻椤绱撴担绛嬪殭闁绘鎸搁锝囨嫚瀹割喖鎮戞繝銏ｆ硾璋╅柕濞炬櫆閻撱儵鏌￠崘銊ワ拷鐟扳枍閺囩伝褰掓偂鎼淬垺鎮欓梺瀹狀潐閸ㄥ潡宕洪崟顖氱闁靛ě鍛仭闂傚倷鑳剁划顖炪�冮崱娑樼闁搞儜灞芥闁荤姴娲︾粊鏉懳ｉ崼銉︾厪闊洤锕ュ▍鍡涙煛閸涱喚绠炴慨濠冩そ楠炴劖鎯旈敐鍥╂殼婵犵數鍋涢惇浼村礉鎼粹垾锝夊箛閻楀牆浜遍梺鍓插亖閸ㄥ顢欓弴銏＄厽閹兼番鍨婚埦浣广亜椤撶偞鍠橀柟顔挎珪缁绘繂顫濋鐘插箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐
				if (npcinfos.getValue().getNpcstatus() == 0) { //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐碉拷鐟版啞缁诲牓寮婚弴銏犲耿婵°倕顑嗛弫鐐箾閿濆懏鎼愰柨鏇ㄤ邯閻涱噣骞樼拠鑼唺闂佸搫鍊哥花閬嶅矗濞差亝鈷掑ù锝呮啞閹牓鏌￠崼顐㈠⒋闁诡垰瀚伴、娑㈡倷椤忓孩瀚瑰〒姘炬嫹鐎殿喗鎸虫慨锟介柍鈺佸暞閻濇娊姊绘担瑙勫仩闁稿寒鍣ｅ鎻掆攽閸垻骞撳┑掳鍊ч幏鐑芥煃鐟欏嫬鐏撮柟顔界懇閹崇娀顢楁担鐟版灈缂傚倸鍊风欢锟犲闯椤栨粎绀婂〒姘炬嫹闁绘侗鍠涚粻娑樷槈濞嗘劖顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
					npcList.add(npcinfos.getKey());
				}
			}
			
			int index = Misc.getRandomBetween(0, npcList.size() - 1);
			npckey = npcList.get(index);
			
			Npc npc = SceneNpcManager.selectNpcByKey(npckey);
			if (npc == null) {
				MessageMgr.psendMsgNotify(roleid, 170021, null);
				return;
			}
			findit = true;
			findmapid = npc.getMapId();
			findposx = npc.getPos().toGridPos().getX();
			findposy = npc.getPos().toGridPos().getY();
		}
		
		if (!findit)
			return;
		
		SUseXueYueKey useKey = new SUseXueYueKey(npcid, npckey, findmapid, findposx, findposy);
		gnet.link.Onlines.getInstance().send(roleid, useKey);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730436;

	public int getType() {
		return 730436;
	}

	public long roleid;
	public int npcid;

	public GFindNpcWithNpcId() {
	}

	public GFindNpcWithNpcId(long _roleid_, int _npcid_) {
		this.roleid = _roleid_;
		this.npcid = _npcid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npcid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npcid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFindNpcWithNpcId) {
			GFindNpcWithNpcId _o_ = (GFindNpcWithNpcId)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npcid != _o_.npcid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += npcid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GFindNpcWithNpcId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = npcid - _o_.npcid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


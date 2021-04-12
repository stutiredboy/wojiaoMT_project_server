
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBuyNpcShop__ extends mkio.Protocol { }

/** NPC购买协议
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBuyNpcShop extends __CBuyNpcShop__ {
	@Override
	protected void process() {
		// protocol handle
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬫繝娈垮櫙閹风兘姊洪弬銉︽珔闁哥喐濯介妵鎰板幢濞戞瑢鎷洪柣鐘叉处瑜板啴顢楅姀鈩冨弿婵☆垳顭堟俊鍧楁煕閹烘挸娴い銏＄洴閹瑩宕ｉ崒锔剧暤闁哄本鐩鎾Ω閵壯傚摋缂傚倷鑳舵慨鎾�﹂悜钘夌畺婵°倕鎳忛ˉ鍫熺箾閹寸偟鎳勯柛鐘冲姍濮婄儤瀵煎▎鎴犐戝┑锛勫仒缁瑥顕ｆ繝姘櫜闁糕剝锚閸斿懘姊洪棃娑氱疄闁糕晛瀚板鎶藉焺閸愵亞鐦堥梺姹囧灲濞佳勭濠婂牊鐓ラ柡鍥ュ妺缁ㄧ粯銇勯弴顏嗙ɑ缂佺粯绻傞～婵嬵敆閸屾艾肖闂傚倷绀侀幉锟犲礉閹达箑绀夐幖杈剧悼閻滃鏌ｉ幇顔煎妺闁抽攱鍨圭槐鎺楊敍濞戞瑧顦ㄥ銈庡亜閿曨亪寮诲☉妯滅喖宕楅崗鑲╁涧闂備浇娉曢崰鏇熸叏閵堝鍤岄柛鎾楀懐顦繝鐢靛Т濞层倝鎷戦悢鍝ョ闁瑰鍊戝璺哄嚑閹兼番鍔庨崣鎾绘煕閵夆晩妫戠紒瀣煼閺屽秶绱掑Ο璇茬３濠殿喖锕ㄥ▍锝囧垝濞嗗繆鏋庨柟顖嗗啫螚闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹
		final gnet.link.Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笧閺咁偆妲愰幘瀛樺濠殿喗鍨奸崑鎰板箲閵忋倕骞㈡繛鎴炵懅閸橀亶姊洪棃娑辨▓闁哥姵鐗楅弲鍫曨敊閸撗勶紡闂佽鍨庨崟顐℃樊闂備礁鎼張顒�煤閻旈鏆﹂柣鎾崇岸閺�浠嬫煕閵夋垵瀚ぐ娲⒒閸屾瑧顦﹂柟纰卞亰椤㈡牠宕ㄩ婊呯厠闂佹眹鍨归悘姘暦閸欏绠鹃柟瀛樼懃閻忊晜顨ラ悙顏勭仾濞ｅ洤锕、娑橆潩椤撶喎鍓垫俊鐐�ら崑鍕煀閿濆拋娼栭柛婵嗗閺嗭箓鏌涢妷銏℃珔缂佹せ锟芥枼鏀芥い鏃傘�嬪銉х磽瀹ュ拑鏀诲ǎ鍥э躬閹晫绮欑捄顭戞Ч婵＄偑鍊栭悧妤�顫濋妸鈺婃晩闁圭儤顨嗛悡鐔兼煟濡厧鍔嬫い蹇曞█閺屾稒鎯斿☉姗堟嫹濠靛绠栨俊銈呮噹缁�鍫㈡喐韫囨洖顥氶柛蹇涙？缁诲棝鏌曢崼婵嗩伀妞わ讣绠撻弻锝堢疀閹捐埖鎲奸梺閫涚┒閸斿秶鎹㈠┑瀣闁崇懓銇橀搹搴ㄦ煟鎼淬値娼愭繛鎻掔箻瀹曟繂顓奸崶銊ュ簥濠电娀娼ч鍛矆鐎ｎ偁浜滈柟鏉垮缁嬬粯銇勯弮锟介崝妤冩閹捐纾兼慨姗嗗墾閹风兘鎮滈懞銉ユ畱闂佽偐顭堥悘姘跺矗韫囨稒鐓熼柕蹇曞Х娴犳盯鏌￠崱妯肩煉闁哄苯绉规俊鐑藉Ψ瑜濈槐鐐烘⒑閸濆嫭锛旈梻鍕缁岃鲸绻濋崶顬囩叓閸ャ劍鐓ユい蹇氬煐娣囧﹪鎮欓鍕舵嫹閵堝纾婚柛娑卞灠閸ㄦ繈鏌熼幑鎰靛殭闁哄绶氶弻鐔煎箚瑜滈崵鐔搞亜閳哄啫鍘撮柟顔筋殜閺佹劖鎯旈垾鎰佹交缂傚倷妞掔欢銈囩不閹捐绠栨俊銈呮噽瀹撲線鏌涢…鎴濇灈濠殿喖楠搁—鍐Χ韫囨挾妲ｉ梺鎼炲妼绾绢參宕氶幒鏃�瀚氱�瑰壊鍠楅崓鐢告煛婢跺﹦澧戦柛鏂跨焸瀵悂骞嬮敂钘夛拷鍨殽閻愯尙浠㈤柛鏃�纰嶉妵鍕晜閸喖绁悗瑙勬礃閸ㄥ灝鐣烽幒鎳舵帡骞撻幒妤�寮伴悗瑙勬礀閻栧ジ宕洪埄鍐瘈闁告洦鍋呴崐鐥�
//		if (npckey != 0) {
//			if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, role.getRoleid()))
//				return;
//		}
//		int npcid = 0;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑磿閹寸姵鍠愰柣妤�鐗嗙粭鎺楁煛閸曗晛鍔﹂柡灞剧洴瀵挳濡搁妷褌鍝楅梻浣规偠閸斿矂宕愰崹顕呮綎婵炲樊浜堕弫鍡涙煥閻旂儤娅曠紒顔芥閹晫绮欑捄顭掔幢闂備線娼ч悧鍡浰囨导瀛樺亗婵炴垯鍨洪悡鏇㈡煏婢跺牆濡奸柣鎾村姉缁辨帡鎳滈悽鐐癸拷鎺旂磼鏉堛劍灏い鎾炽偢瀹曞崬鈻庤箛濠傛倕闂傚倷绀侀悿鍥綖婢舵劕鍨傞悹杞拌閸ゆ鏌涢弴銊ヤ簽闁哄棗妫楅埞鎴︽偐閹绘帗娈婚梺闈涚墢濡姊婚崒姘拷鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磽娓氬﹥瀚规繝銏ｅ煐閸旀牠鎮￠妷鈺傜厸闁搞儮鏅涙禒婊堟煥閻旇袚闁诡喖鍊搁悾鐑藉箳濡わ拷鎯熼梺鎸庢煥婢т粙顢欓弴銏″�甸柣鐔告緲椤ュ繘鏌涢悩铏闁兼椽浜堕幊锟犲Χ閸モ晪绱查梻浣虹帛閻熼亶骞忛悜鑺ョ厱闁靛鍎抽崺锝囷拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�
//		if (buytype == ShopBuyType.NORMAL_SHOP) {
//			npcid = fire.pb.map.SceneNpcManager.getNpcIDByKey(npckey);
//			if (npcid < 0) {
//				xdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛椤忕姷绱掗敓鑺ョ節閸屾鏂�闂佺粯蓱瑜板啯绂嶉悙鐑樼厽闁圭儤姊瑰▍鏇㈡煙閸欏鍊愭鐐差儔閺佸啴鏁撻懞銉敯闂傚倷娴囬～澶嬬珶閸℃ɑ娅犳俊銈呮噹绾惧綊鏌ｉ幋锝呅撻柣鎾跺枛閺屾洝绠涚�ｎ亞浠鹃梺鍝勬閺呯娀寮婚敐澶嬫櫜闁割偅绻勯崢顐ょ磽娴ｈ櫣甯涚紒璇茬墛閹便劑鏁撴禒瀣叆婵犻潧妫欓崳浠嬫煕濮楀棗浜版慨濠冩そ瀹曘劍绻濋崘锝嗗婵犵數鍋涘鍓佸垝鎼淬劌绀嗛柟鐑橆殔闁卞洭鏌曟径鍫濆姎闁兼澘鐏濋埞鎴︽倷閺夋垹浠搁梺鑽ゅ暀閸パ冨亶闂佹眹鍨归幉锟犲磹閻㈠憡鐓熼柣鏂挎啞缁跺弶銇勮箛锝勭盎妞ゎ厼娼￠幃鐑芥偋閸偅锛嗛梻浣筋嚃閸犳岸宕戦悙鍝勎ч柨婵嗩槸缁�鍐煃閸濆嫬鏆欐鐐茬墦濮婄粯绗熼敓钘夘焽瑜旈幃褔宕卞☉妯肩枃閻庣櫢鎷烽柛鏇ㄥ墯濞呫垽姊洪懞銉冾亪藝閽樺铏圭紦閿燂拷 id=" + npckey);
//				return;
//			}
//		}
		
		fire.pb.shop.SGoods goods = fire.pb.shop.Module.sGoodsMap.get(goodsid);
		if (null == goods) {
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐烘煙閸忕厧濮嶉柡灞剧洴瀵剙鈻庨幆褍澹庨梻浣筋嚃閸犳銆冮崨杈剧稏婵犻潧顑愰弫鍥煟閹邦剙绾ч柟铏懇濮婄粯鎷呴崨濠冨創闂佸搫鐗滈崜娆戝弲濠碘槅鍨拃锕傚吹濡ゅ懏鐓曢柡鍥ュ妼閻忕娀姊洪崡鐐村缂佺粯绻堝Λ鍐ㄢ槈濞嗘ɑ顥ｆ俊鐐�ら崑鍛枈瀹ュ洦宕叉繝闈涱儐閸嬨劑姊婚崼鐔衡棩缂侇喖鐖煎娲偡閺夋寧姣愰梻浣稿簻缂嶄線鐛崱妤冩殕闁告洦鍋嗛敍婊堟⒑缂佹ê濮岄悘蹇ｄ邯楠炴寮撮悙鈺傛杸闂佺粯鍔栧娆撴倶閿曞倹鍤曢柕鍫濐槹閻撴盯鏌ㄩ悢璇残撶紒鍌涘笧閿熸枻缍嗛崑鍡涘储閸楃偐鏀介柣鎰綑閻忋儳锟借娲﹂崜鐔煎箖濮楋拷閺屽棗顓奸崱娆忓箞闂備胶绮ú鏍磹閸︻叏鎷峰鐐" +  goodsid  + "]");
			return;
		}
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬫繝娈垮櫙閹风兘姊洪弬銉︽珔闁哥喐濯介妵鎰板幢濞戞瑢鎷洪柣鐘叉处瑜板啴顢楅姀銏㈡／闁哄娉曡倴闂佸摜濮撮敃銈夘敇閸忕厧绶炲┑鐑嗘緛缁犳捇寮诲☉銏犲嵆闁靛鍎查悵顔尖攽閳ュ啿绾ч柛搴㈠▕閳ユ棃宕橀鍢壯囨煕閹扳晛濡煎┑顔芥礀椤啴濡惰箛鏇熷仹闂佺绻戦敋妞ゎ偄绻戠换婵嗩潩椤掑偊绱叉繝鐢靛仜濡瑩宕洪崼婢綁顢氶敓钘夘潖濞差亜鎹舵い鎾寸♁鐎氭盯姊虹粙娆惧剰婵☆偅绻堝顐﹀箻缂佹ê娈熼梺闈涱檧婵″洤鈻撻妶澶嬧拺缂佸娉曠粻鏌ユ煥濮樿埖鐓熼柨婵嗩樈濡垿鏌熼崣澶嬪唉鐎规洜鍠栭、鏇㈩敃閵忊槅鍟岄梻鍌氬�风粈渚�骞栭位鍥ㄥ閺夋垵鐎悷婊呭鐢宕戦埡鍛厽闁逛即娼ф晶鎵磼閻樿崵鐣洪柡宀�鍠栭獮鍡氼檨闁搞倗鍠栭弻娑㈡偄閸濄儱寮ㄩ梺鍝勭灱閸犳牠骞冨鍛┏閻庯綆鍋掑Λ鏍⒒娴ｈ姤纭堕柛鐘虫礃閹便劑濡舵径妯绘櫓闂佸搫绋侀崢鑲╃玻濡ゅ懏鐓涚�广儱楠搁獮妤呮煕婵犲懎鐓愰柟渚垮妼椤粓宕卞Δ锟介埛鎺楁⒑閹肩偛锟芥牠銆冩繝鍥ц摕婵炴垯鍨归崡鎶芥煏婵炲灝鍔氭い顐邯濮婅櫣绮欓幐搴㈠闯闂佸摜濮甸崝娆愪繆閻㈢绀嬫い鏍ㄧ椤ユ繈姊洪崜鑼帥闁哥姵顨婂畷鎰邦敍閻愮补鎷烘繛鏉戝悑閻熝咃拷浣冨亹缁辨帡顢欓悾灞惧櫑濡炪値鍋勭换鎺旀閹烘嚦鐔烘嫚瀹割噯鎷烽幘缁樷拺闁诡垎鍛唺闂佺娅曢幐鍓у垝椤撱垺鏅搁柣妯绘灱閹锋椽姊婚崒姘卞缂佸甯楀鍕礋椤栨稓鍘介梺鍐叉惈閿曘倝鎮橀悩鐐戒簻闁哄浂浜炵粔顔筋殽閻愬瓨宕屾鐐村浮瀹曞崬顫滈崱妯肩Ь闂傚倸鍊风欢姘焽瑜忛幑銏ゅ箳閹炬潙寮块梺缁樺灩閻℃棃寮繝鍥ㄧ厵闁规鍠栭。濂告煃闁垮鐏撮柟顔肩秺楠炰線骞掗幋婵愮�虫繝鐢靛仜閹冲繘宕濆▎鎾宠摕闁绘梻鍘х粈鍕煏閸繃顥滄い蹇ユ嫹
		if (buytype == ShopBuyType.NORMAL_SHOP) {
			fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
			if (ns == null || !ns.getGoodsids().contains(goodsid)) {
				mkdb.Trace.info("NPC婵犵數濮烽弫鍛婃叏閹绢喗鍎夊鑸靛姇缁狙囨煕閺嶃倕澧查悗姘愁潐娣囧﹪濡堕崟顓炲闂佸憡鐟ョ换姗�寮婚敐澶婄闁挎繂妫Λ鍕磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖鐗徊钘夆枔濠靛鈷戦柛蹇撳悑缁跺弶绻涚涵椋庣瘈鐎殿喛顕ч埥澶愬閳╁啯鐝曢梺鑽ゅТ濞诧箒銇愰崘顏嗕笉闁煎鍊楃壕钘壝归敐鍛儓閺嶏繝姊洪崫鍕潶闁告梹鍨块崹楣冩晝閸屾岸鏁滃┑掳鍊撶粈浣糕枔濠靛鈷掗柛灞炬皑婢ф稓绱掔�ｎ偄鐏撮柨婵堝仜閻ｆ繈鏁撻悾灞绢潟闁规儳顕悷鐟扳攽閻樻彃鏆欐い蹇撶埣濮婄粯鎷呴崨濠傛殘濠电偠顕滅粻鎾崇暦瑜版帗鐒肩�广儱妫楁禍妤呮⒑閸濆嫭宸濋柛鐘虫尵瀵囨晸娴犲鈷掗柛灞炬皑婢ф稓绱掔�ｎ偄娴挊鐔哥節婵犲倸顏ュù婊勭矒閻擃偊宕舵搴☆嚤闂備緡鍙庨崹鍫曞蓟閳ュ磭鏆嗛悗锝庡墰閻﹀牓鎮楃憴鍕鐎规洦鍓濋悘鎺楁⒑缁嬭法绠抽柛妯犲洤鍨傞梺顒�绉甸埛鎺懨归敐鍥╂憘闁搞倕鍟撮弻娑㈡偐瀹曞洤鈷堢紓浣戒含閸嬬偟鎹㈠┑瀣＜婵犲﹤瀚鏇㈡⒒娴ｇ顥忛柛瀣噹鐓ら柡宓嫭娈伴梻鍌氬�风欢姘焽瑜旇棟妞ゆ挶鍨圭壕鍧楀级閸偄浜介柡鍡╁灡缁绘繈鎮介棃娴躲儵鏌℃担鍛婂暈闁逛究鍔戦、姗�濮�閻樻鍞甸梻浣告啞閸旓箓宕伴弽顐ょ焼闁告劦鍠楅悡鍐级閻愰潧顣兼い锕傛敱缁绘盯鏁愭惔鈩冪彎闂佸搫鐭夌徊楣冨箚閺冨牆围閹兼番鍨荤粔閿嬬節閻㈤潧浠︾紒浣规尦瀵煡鎮╅懡銈呯ウ闂婎偄娲︾粙鎺楀疾閹间焦鐓ラ柣鏇炲�圭�氾拷?.shopid:" + shopid + "goodsid:" + goodsid);
				return;
			}
		}
		
		fire.pb.shop.utils.ShopParameters params = new fire.pb.shop.utils.ShopParameters();
		params.role = new fire.pb.PropRole(role.getRoleid(), true);
		params.goods = goods;
		params.num = num;
		params.shopId = shopid;
		
		new fire.pb.shop.srv.BuyShopFactory(params, buytype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810633;

	public int getType() {
		return 810633;
	}

	public int shopid; // 商店序号
	public int goodsid; // 商品id
	public int num; // 购买数量
	public int buytype; // 购买类型

	public CBuyNpcShop() {
	}

	public CBuyNpcShop(int _shopid_, int _goodsid_, int _num_, int _buytype_) {
		this.shopid = _shopid_;
		this.goodsid = _goodsid_;
		this.num = _num_;
		this.buytype = _buytype_;
	}

	public final boolean _validator_() {
		if (shopid < 1) return false;
		if (goodsid < 0) return false;
		if (num < 1) return false;
		if (buytype < 0 || buytype > 11) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(shopid);
		_os_.marshal(goodsid);
		_os_.marshal(num);
		_os_.marshal(buytype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		shopid = _os_.unmarshal_int();
		goodsid = _os_.unmarshal_int();
		num = _os_.unmarshal_int();
		buytype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CBuyNpcShop) {
			CBuyNpcShop _o_ = (CBuyNpcShop)_o1_;
			if (shopid != _o_.shopid) return false;
			if (goodsid != _o_.goodsid) return false;
			if (num != _o_.num) return false;
			if (buytype != _o_.buytype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += shopid;
		_h_ += goodsid;
		_h_ += num;
		_h_ += buytype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(shopid).append(",");
		_sb_.append(goodsid).append(",");
		_sb_.append(num).append(",");
		_sb_.append(buytype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CBuyNpcShop _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = shopid - _o_.shopid;
		if (0 != _c_) return _c_;
		_c_ = goodsid - _o_.goodsid;
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		_c_ = buytype - _o_.buytype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


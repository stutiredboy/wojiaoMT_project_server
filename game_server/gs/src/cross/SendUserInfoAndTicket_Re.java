
package cross;
import fire.pb.cross.Constant;
import fire.pb.cross.CrossManager;
import fire.pb.cross.SendRoleInfo;
import fire.pb.main.ConfigManager;

import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SendUserInfoAndTicket_Re__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SendUserInfoAndTicket_Re extends __SendUserInfoAndTicket_Re__ {
	@Override
	protected void process() {
		CrossManager.logger.info("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰骞囬棃娑橆潽闁诲孩鑹剧紞濠囧蓟閵娾晛鍗抽柣鎰嚋閹风兘骞栨担鐟帮拷宄扳攽閻樻彃鏆斿ù婊勭矒閺岀喖鎼归悷棰佹勃闁诲孩鑹惧﹢杈╂閹惧瓨濯撮柣鐔告緲椤秴顪冮妶鍐ㄥ闁挎洦浜滈锝嗙節濮橆厼浜滈梺绋跨箺閸嬫劙宕濋悜鑺モ拺闁圭瀛╃粚鍧楁煙瀹勬澘妲绘い顓″劵椤﹀湱绱掗悩宕囧⒌鐎殿喖顭锋俊鑸靛緞婵犲嫰鐛撻梻浣告贡椤牊顨ラ崨濠勵浄闁圭虎鍠楅埛鎴︽煕濠靛棗顏繝锟芥导瀛樼厽闁冲搫锕ら悘鈥城庨崶褝韬柟顔界矌缁數锟斤綆鍋呭▍鎾绘⒒娴ｈ櫣甯涢柟绋挎憸閿熻棄鐏氱敮鎺椻�﹂崶顒佸殥闁靛牆娲ㄩ敍婵嬫⒑缁嬫寧婀伴柤褰掔畺閺佹挻绂掔�ｅ灚顥栭梺鐟板槻椤戝顕ｆ繝姘ㄩ柕澹嫮鍙勯梻鍌欒兌缁垶鈥﹂崼銉晪鐟滃繒鍒掓繝姘唨妞ゆ劧绲介弸鎴︽⒑缂佹﹩娈旈柣妤�妫涚划顓㈠箳閹炽劌缍婇幊鏍煛娴ｅ弶鐎伴梻浣告惈閺堫剟鎯勯姘煎殨闁圭虎鍠栨儫闂侀潧顦崕鍝勵焽娴犲鈷掑ù锝勮閻掗箖鎮楀☉鎺撴珚妤犵偞鍨垮畷鎯邦檨婵炲吋鐗犻弻褑绠涢幘纾嬬缂佺偓鍎抽崥瀣┍婵犲浂鏁嶆繝鍨姇濞堫厾绱掗悙顒佺凡缂佸鎳撻～蹇涙惞閸︻厾鐓撻梺鍛婄墤閿熻棄鍘栫槐锝嗙節閻㈤潧浠滈柣銊у厴閺佹捇鎳為妷銉ヮ潽闂佹悶鍊栧ú鏍煘閹达附鍋愰悗鍦Т椤ユ繈姊虹紒妯虹瑲婵＄偘绮欏璇测槈閵忕姷鐤�闂佸疇妗ㄧ粈渚�鈥栫�ｎ剛纾藉ù锝囨嚀婵鏌涚�ｃ劌锟芥洟锝炶箛鎾佹椽顢旈崟顓фФ闂備礁婀辩划顖滄暜婵犲嫯濮抽柤娴嬫櫇绾捐棄霉閿濆洨鎽傞柛銈嗙懇閺屾稒绻濋崒婊呅ㄥΔ鐘靛仜閻楁挻淇婇幖浣哥厸濞达絽瀚囬崘鍓у數闁荤姾妗ㄧ拃锕傚磿瀹�鍕厵闂佸灝顑嗛妵婵囨叏婵犲懏顏犳繛鎴犳暬瀹曘劑顢樺┑鍥╂綎闂傚倷鑳堕…鍫ヮ敄閸℃稒鍎庢い鏍仜閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘绔熼姘殜闁瑰嚖绻濆缁樻媴閸涘﹤鏆堥柣銏╁灡椤ㄥ牓寮鍢夋棃宕ㄩ鐘垫毎闂備礁鎼崯顐︽偋閸℃ê鍔旈梻鍌欑窔濞佳囨晬韫囨洑娌柤鎭掑劜濮ｅ姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹鍓ф惥娴ｈ銇濋柡浣稿暣瀹曟帒顫濋鍌︽嫹椤撱垺鈷戠紓浣癸供濞堟棃鏌ｅΔ锟藉Λ婵嗙暦濠靛绫嶉柛顐ゅ暱閹峰姊虹粙鎸庢拱闁荤啙鍥х鐎广儱顦伴崐鐢电磼濡や胶鈽夐柛鐘宠壘椤洭寮借閺�浠嬫煟濡櫣鏋冨瑙勶耿閺岋綁濡堕崶褌澹曢梺闈涙搐鐎氫即鐛崶顒�閱囬柡鍥╁櫏閿熻棄绉瑰铏圭矙濞嗘儳鍓炬繛瀛樼矤娴滎亜顕ｆ繝姘╅柍鍝勫�告禍婊堟⒑缂佹ê鐏﹂柨姘舵煕閺冨偆妫瀍rId=" + userid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹥妞藉畷銊︾節閸愵煈妲遍梻浣侯焾椤戝懐锟芥矮鍗抽悰顕�宕卞☉娆忥拷鐑芥煟閹寸們姘跺箯閾忓湱纾介柛灞剧懅閸斿秹鎷戦柆宥嗙厽闁靛绠戦悘鎾煛鐏炲墽娲村┑鈩冩倐閺佸倿鎳為妷锔界杺UserInfoAndTicket_Re闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰寮撮悙鎼！闁诲孩鑹剧紞濠囧蓟濞戙垹绠涢梻鍫熺♁閻忓牓鎮楅悷鐗堝暈缂佽鍟存俊鐢稿礋椤栨艾鍞ㄩ梺闈浤涢敓钘壩ｉ崼銉︾厵闁稿繐鍚嬬紞鎴︽煥閺囨ê锟芥繈宕洪悙鍝勭闁绘劘灏欓悿鍥⒒娴ｄ警鐒鹃柨鏇樺劚鐓ら柣鏃囧亹瀹撲線鐓崶銊︾┛闁归鍏橀弫鎰償閳╁啰浜梻浣告惈椤戝嫮绮堟笟锟介崺鐐哄箣閿旇棄浜归梺鍛婄懃椤︻垶藝閳哄懏鈷戠紓浣股戠亸顏堟煕鎼达絾鏆�殿喖顭烽弫鎰緞婵犲倸绁梻浣虹帛閸旀﹢顢氬鍫濈闁绘垼妫勯幑鑸点亜閹惧崬濡介悗姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷!");
		long roleid = CrossManager.getInstance().getTransferRoleByUserId(userid);
		if (roleid <= 0){
			CrossManager.logger.error("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰骞囬棃娑橆潽闁诲孩鑹剧紞濠囧蓟閵娾晛鍗抽柣鎰嚋閹风兘骞栨担鐟帮拷宄扳攽閻樻彃鏆斿ù婊勭矒閺岀喖鎼归悷棰佹勃闁诲孩鑹惧﹢杈╂閹惧瓨濯撮柣鐔告緲椤秴顪冮妶鍐ㄥ闁挎洦浜滈锝嗙節濮橆厼浜滈梺绋跨箺閸嬫劙宕濋悜鑺モ拺闁圭瀛╃粚鍧楁煙瀹勬澘妲绘い顓″劵椤﹀湱绱掗悩宕囧⒌鐎殿喖顭锋俊鑸靛緞婵犲嫰鐛撻梻浣告贡椤牊顨ラ崨濠勵浄闁圭虎鍠楅埛鎴︽煕濠靛棗顏繝锟芥导瀛樼厽闁冲搫锕ら悘鈥城庨崶褝韬柟顔界矒閹稿﹥寰勫畝濠傛倛濠电姷鏁告繛锟芥繛浣冲厾娲晝閸屾氨顔嗛梺鍛婎殘閸嬫劙寮ㄦ禒瀣厓闁宠桨绀侀弳鏂棵归悩闈涒枅闁哄本鐩顕�鏁撴禒瀣瀭闁汇垽娼荤紞鏍叓閸ャ劍濯兼繛宸憾閺佸倿鏌涢弴銊ュ季闁哥偛鐖煎铏规兜閸涱収妫堥梺瑙勬た娴滅偛顕ユ繝鍥ч敜婵°倓绀佹禒濂告⒑濮瑰洤鐏╅柟璇х節閸╂盯骞嬮敂鐣屽幗闂佺粯鏌ㄩ幉锛勬閺屻儲鐓涢柛鈩冪煯閸氼偆绱掓潏銊ョ缂佽鲸甯掗～婊堝醇閿濆繑瀚归柛褎顨嗛悡娆愩亜閺囩偞顥犵紒鈽呮嫹婵＄偑鍊戦崹娲�冩繝鍌滄殾闁绘梻鍘ч崹鍌涖亜閹板墎绋婚柣婵囩矒濮婂宕掑▎鎴М闂佽绁撮敓鍊熺М濞差亝鏅濋柛灞炬皑椤︻厼鈹戦悙鍙夘棡闁告梹顨婇妴鍛存煥鐎ｃ劋绨婚梺鍝勭▉閸嬪嫭绂掗敃鍌涚厓闂佸灝顑呴悘鎾煙椤旇偐绉虹�规洖鐖奸弫鎰疀閺傛浼撻梻浣告啞閸旀浜稿▎鎿冩晩闁硅揪闄勯埛鎴炴叏閻熺増鎼愰柣鎺撴そ閺屾盯濡搁妸銈呮儓闂佽桨绶￠崰鏍亙婵炶揪缍�閵嗭拷闁猴拷閾忣偆绡�闁汇垽娼у瓭濠电偠顕滅粻鎾崇暦闂堟侗鍚嬪璺侯儑閸橆亝绻濋姀锝庡殐闁搞劋鍗抽獮濠囧箛椤戔晪缍佸畷鍫曨敆娴ｅ弶瀚藉┑鐐舵彧缂嶏拷濠殿喓鍊楀☉鐢稿醇閺囩喓鍘遍梺缁橆焾鐏忔瑨鍊撮梻浣告啞鐢鏁幒妤�鐓濋幖娣�楅悿锟介梺鍝勬川閸犳劙顢欓弴銏♀拻濞达絿顭堥ˉ蹇涙煕鐎ｎ亝鍣归悡銈夋煥閺囩偛锟芥悂寮告笟锟介弻娑㈠焺閸愮偓鈻嶉悷婊呭鐢寮查弻銉︾厱闁靛鍎遍。鎶芥煕閺傛寧鍟炵紒缁樼箞婵拷闁靛繆锟借櫕鐣梺璇插绾板秴顭垮锟介敐鐐剁疀閺囩姷锛滃┑鈽嗗灥椤曆囶敁閹剧粯鈷戦柛娑橈功閳藉鏌ㄩ弴妯猴拷婵嗩嚕閹惰棄閱囨繝闈涘暞閺傦拷闂備胶绮崝娆撀烽崒鐐插惞閻庯綆鍓涚壕濂告煟濡寧鐝悘蹇ｅ弮閺岋綁鏁愰崶褍骞嬪Δ鐘靛仜濞撮鍒掗悽纰夋嫹閿濆骸浜濇繛鍛尵缁辨挻鎷呴崫鍕婵犳鍨垫慨銈囩矉瀹ュ鏁嗛柛鏇ㄥ亞椤︻噣姊虹紒妯虹伇濠殿喓鍊濋崺娑㈠箣閿旇棄浠梺璇″幗鐢帗淇婃總鍛婄厸閻庯綆鍋呴悡銉╂煃鐟欏嫬鐏存い銏＄懇閹瑩顢楁担鍦闂傚倷娴囬鏍闯椤栨粍宕叉繝闈涱儏缁犳牠鏌嶉崫鍕櫤闁稿鍔戦弻娑⑩�﹂幋婵呭缂備焦澧庨崜婵囩┍婵犲洦鍊锋い蹇撳閹风兘寮介鐐殿唶婵°倧绲介崯顐ゅ婵犳碍鐓熼柟閭﹀墯閹牓姊婚崒銈呯仸闁哄本鐩弫鍌滄嫚閹绘帞顔掔紓浣哄亾閸庢娊濡堕幖浣歌摕闁绘梻鍘х粻鐢告煙閻戞绠撻柛鎾村▕濮婄儤瀵煎▎鎴炲仹闂佽桨绀侀…宄邦嚕婵犳碍鏅柛鏇ㄤ簼閸曞啴鏌ｉ悩鍙夌┛妞ゆ洘绮撻獮蹇撶暋閹佃櫕鏂�闂佺硶鍓濋悷锕�鈻撴ィ鍐╁仭婵犲﹤鎳庨。濂告偨椤栨娅婄�殿噮鍋婂畷姗�顢欓悾灞藉妇闂傚鍋勫ù鍕緤閸撗勵偨婵﹩鍘虹换鍡樹繆閵堝嫮鍔嶉悘蹇曟暩缁辨帗娼忛妸锕�纾抽悗瑙勬礃鐢帡鍩㈡惔銊ョ妞ゆ挾鍟樺鍕箚闁绘劦浜滈敓鑺ョ墵瀹曞綊鎮界粙璺ㄧ枃濠碘槅鍨辩�笛囁夐妶鍡曠箚闁绘劦浜滈敓鑺ョ墵閹冾煥閸繄锛熼梺鍦濠㈡﹢寮告笟锟介弻娑㈠Ψ閹搭垱瀚归梺鐚存嫹濞寸姴顑嗛悡鏇㈡倶閻愭彃鈷旈柣顓滃�濋弻锝夊箳閹存績鎸冮梺璺ㄥ枔閺咁偊骞婇幘璇茬疅闁挎稑瀚畷鏌ユ煕閹伴潧鏋涘鍛存⒑閸涘﹥澶勯柛銊ゅ嵆瀹曟﹢鏁撴禒瀣拺闂傚牊涓瑰☉銏℃櫢闁芥ê顦介悗鍫曟煏婵炵偓娅嗛柍閿嬪灴閺屾稑鈹戦崟顐㈠闁哄稄绻濆铏圭磼濮楀棙鐣兼繝娈垮枟閹告娊鏁愰悙鍓佺杸闁哄洨濮烽敍婊冣攽閳藉棗鐏ラ柛瀣姍楠炲﹤鈹戠�ｎ偀鎷洪柣鐘充航閸斿矂寮稿▎鎰箚妞ゆ劑鍨归顓㈡煃閵夘垳鐣电�规洖鐖兼俊姝岊槾闁伙箑鐗嗛埞鎴︻敊閺傘倓绶甸梺鍛婃尰閻╊垶銆佸▎鎾冲耿婵炴垶鐟㈤幏娲煟閻樺厖鑸柛鏂胯嫰閳诲秹骞囬悧鍫㈠幍闂佸憡鍨崐鏍拷姘炬嫹?:" + userid + "!");
			return;	
		}
		CrossManager.logger.info("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰骞囬棃娑橆潽闁诲孩鑹剧紞濠囧蓟閵娾晛鍗抽柣鎰嚋閹风兘骞栨担鐟帮拷宄扳攽閻樻彃鏆斿ù婊勭矒閺岀喖鎼归悷棰佹勃闁诲孩鑹惧﹢杈╂閹惧瓨濯撮柣鐔告緲椤秴顪冮妶鍐ㄥ闁挎洦浜滈锝嗙節濮橆厼浜滈梺绋跨箺閸嬫劙宕濋悜鑺モ拺闁圭瀛╃粚鍧楁煙瀹勬澘妲绘い顓″劵椤﹀湱绱掗悩宕囧⒌鐎殿喖顭锋俊鑸靛緞婵犲嫰鐛撻梻浣告贡椤牊顨ラ崨濠勵浄闁圭虎鍠楅埛鎴︽煕濠靛棗顏繝锟芥导瀛樼厽闁冲搫锕ら悘鈥城庨崶褝韬柟顔界矌缁數锟斤綆鍋呭▍鎾绘⒒娴ｈ櫣甯涢柟绋挎憸閿熻棄鐏氱敮鎺椻�﹂崶顒佸殥闁靛牆娲ㄩ敍婵嬫⒑缁嬫寧婀伴柤褰掔畺閺佹挻绂掔�ｅ灚顥栭梺鐟板槻椤戝顕ｆ繝姘ㄩ柕澹嫮鍙勯梻鍌欒兌缁垶鈥﹂崼銉晪鐟滃繒鍒掓繝姘唨妞ゆ劧绲介弸鎴︽⒑缂佹﹩娈旈柣妤�妫涚划顓㈠箳閹炽劌缍婇幊鏍煛娴ｅ弶鐎伴梻浣告惈閺堫剟鎯勯姘煎殨闁圭虎鍠栨儫闂侀潧顦崕鍝勵焽娴犲鈷掑ù锝勮閻掗箖鎮楀☉鎺撴珚妤犵偞鍨垮畷鎯邦檨婵炲吋鐗犻弻褑绠涢幘纾嬬缂佺偓鍎抽崥瀣┍婵犲浂鏁嶆繝鍨姇濞堫厾绱掗悙顒佺凡缂佸鎳撻～蹇涙惞閸︻厾鐓撻梺鍛婄墤閿熻棄鍘栫槐锝嗙節閻㈤潧浠滈柣銊у厴閺佹捇鎳為妷銉ヮ潽闂佹悶鍊栧ú鏍煘閹达附鍋愰悗鍦Т椤ユ繈姊虹紒妯虹瑲婵＄偘绮欏璇测槈閵忕姷鐤�闂佸疇妗ㄧ粈渚�鈥栫�ｎ剛纾藉ù锝囨嚀婵鏌涚�ｃ劌锟芥洟锝炶箛鎾佹椽顢旈崟顓фФ闂備礁婀辩划顖滄暜婵犲嫯濮抽柤娴嬫櫇绾捐棄霉閿濆洨鎽傞柛銈嗙懇閺屾稒绻濋崒婊呅ㄥΔ鐘靛仜閻楁挻淇婇幖浣哥厸濞达絽瀚囬崘鍓у數闁荤姾妗ㄧ拃锕傚磿瀹�鍕厵闂佸灝顑嗛妵婵囨叏婵犲懏顏犳繛鎴犳暬瀹曘劑顢樺┑鍥╂綎闂傚倷鑳堕…鍫ヮ敄閸℃稒鍎庢い鏍仜閺嬩線鏌熼崜褏甯涢柛銈呯Ч閺屾洘绔熼姘殜闁瑰嚖绻濆缁樻媴閸涘﹤鏆堥柣銏╁灡椤ㄥ牓寮鍢夋棃宕ㄩ鐘垫毎闂備礁鎼崯顐︽偋閸℃ê鍔旈梻鍌欑窔濞佳囨晬韫囨洑娌柤鎭掑劜濮ｅ姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹鍓ф惥娴ｈ銇濋柡浣稿暣瀹曟帒顫濋鍌︽嫹椤撱垺鈷戠紓浣癸供濞堟棃鏌ｅΔ锟藉Λ婵嗙暦濠靛绫嶉柛顐ゅ暱閹峰姊虹粙鎸庢拱闁荤啙鍥х鐎广儱顦伴崐鐢电磼濡や胶鈽夐柛鐘宠壘椤洭寮借閺�浠嬫煟濡櫣鏋冨瑙勶耿閺岋綁濡堕崶褌澹曢梺闈涙搐鐎氫即鐛崶顒�閱囬柡鍥╁櫏閿熻棄绉瑰铏圭矙濞嗘儳鍓炬繛瀛樼矤娴滎亜顕ｆ繝姘╅柍鍝勫�告禍婊堟⒑閸涘﹥灏柤鍐茬埣閹繝骞橀弬銉︽杸濡炪倖姊婚妴瀣礉閻旇櫣纾兼い鏇炴噹閻忥附顨ラ悙鑼鐎规洏鍔戦、娑樷槈濡崵锟筋參姊绘担鍛婂暈婵炶绠撳畷鎴﹀磼閻愯弓绱跺┑掳鍊曢幊蹇涘煕閹烘嚚褰掓晲閸曨噮鍔呴梺缁樺浮缁犳牠骞冨Δ锟介埥澶愬箳閹惧褰嗙紓鍌欒兌缁垳绮欓幒鏃�宕叉繝闈涱儏绾惧吋绻濇繝鍌氼仾妞ゆ梹娲熷缁樻媴閻戞ê娈岄梺瀹︽澘濡跨紓鍌涙崌楠炲棝鈥栭濠勭М鐎规洖銈告俊鐑芥晜閹冪瑲闂備浇宕垫慨鎯р枍閿濆纾块柕鍫濐槸缁犳岸鏌涢銈呮灁缂佺姴澧介敓鐣屾嚀婢瑰﹪宕伴弽褜鍤曟い鏃�鎷濋幏宄扳枔閸喗鐝梺绋款儏閿曨亪鎮伴鍢夌喖鎳栭埡鍐跨床婵犵妲呴崹宕囧垝椤栫儐鏁傞柣鏂垮悑閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�.roleId=" + roleid + ",retcode=" + retcode);
		if (retcode != RET_OK) {
			return;
		}
		
		boolean needResetData = xtable.Crosstemproles.select(roleid) == null;
		SendRoleInfo send = new SendRoleInfo();
		send.myzoneid = Integer.parseInt(Gs.serverid);
		send.userid = userid;
		send.roleid = roleid;
		send.flag = Constant.TO_CROSS;
		send.needcleardata = (byte)(needResetData ? 1 : 0);
		CrossManager.getInstance().sendToCrossServer(Constant.SendRoleInfo, send);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 229;

	public int getType() {
		return 229;
	}

	public final static int RET_OK = 0;
	public final static int RET_NETWORK_ERROR = 1;
	public final static int RET_MULTI_LOGIN = 2;
	public final static int RET_SERVER_OVERLOAD = 3;

	public int retcode;
	public int userid;
	public byte flag;

	public SendUserInfoAndTicket_Re() {
	}

	public SendUserInfoAndTicket_Re(int _retcode_, int _userid_, byte _flag_) {
		this.retcode = _retcode_;
		this.userid = _userid_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(retcode);
		_os_.marshal(userid);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		retcode = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SendUserInfoAndTicket_Re) {
			SendUserInfoAndTicket_Re _o_ = (SendUserInfoAndTicket_Re)_o1_;
			if (retcode != _o_.retcode) return false;
			if (userid != _o_.userid) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += retcode;
		_h_ += userid;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(retcode).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SendUserInfoAndTicket_Re _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = retcode - _o_.retcode;
		if (0 != _c_) return _c_;
		_c_ = userid - _o_.userid;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


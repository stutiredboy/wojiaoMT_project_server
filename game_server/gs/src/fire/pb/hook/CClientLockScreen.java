
package fire.pb.hook;

import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CClientLockScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CClientLockScreen extends __CClientLockScreen__ {
	@Override
	protected void process() {
		// protocol handle
		gnet.link.Role role = Onlines.getInstance().find(this);
		if(role == null)
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑呴—鍐Χ閸愩劎浠鹃梺鑽ゅ暱閺呯娀鐛崘顔肩労闁告劏鏅涢崝鍛渻閵堝棙鈷愰柛銊︾箓椤繈鏁冮崒娑掓嫽闂佺鏈懝楣冩晸娴犲妫戠紒顔肩墛缁楃喖鏁撴禒瀣祦濠㈣埖鍔栭弲鎼佹煟濡搫鏆卞ù鐙�鍙冨娲濞戣鲸孝闂佸搫鎳忕划鎾愁嚕閹绘巻鏀介悗锝庡亞閸橆亝绻濋姀锝嗙【婵☆偅鐟ラ埢宥夊川椤撗勭闂佸憡绋戦悺銊╁煕閹达附鐓曟繛鎴烇公閺�璇差熆鐠哄搫顏柡灞剧洴婵℃悂濡堕崨顓犮偖闁诲氦顫夊ú姗�鏁冮姀銈呮瀬闁规儳顕々鐑芥倵閿濆骸浜愰柟閿嬫そ濮婂宕掑鍗烆杸婵炴垶鎸鹃幊鎾诲煡婢跺娼╂い鎰剁到婵即姊绘担铏瑰笡闁告棑绠撳畷婊堟晝閸屾氨鏌堥梺鎼炲労閸撴岸鍩涢幒妤佺厱閻忕偞宕樻竟姗�鏌ㄩ悢鐑樻珪闁稿繑锕㈤獮濠偽旈崨顓㈠敹闂佸搫娲﹂〃鎰板箯閻戣姤鏅濋柛灞惧哺閸炲爼姊虹紒妯荤；闁绘帪绠撻、娆撳籍閸啿鎷洪悷婊呭鐢鏁嶉悢鍏肩厽闁硅櫣鍋熼悾鐢碉拷娈垮枟瑜板啴鍩為幋锕�鐐婇柕澶堝�楅惄搴ㄦ⒒婵犲骸浜滄繛璇х畵楠炴劙鎮欓浣圭彿闂佸搫娲㈤崹娲偂閵忋倖鐓曢柟鏉垮悁缁ㄥ鏌＄�ｎ偆娲撮柡宀嬬磿娴狅箓鎮欓鍌ゆЧ闁诲氦顫夊ú婊堝储瑜旈崺鐐哄箣閿曪拷缁犳稒銇勯幘绛圭础闁搞儯鍔夐幏娲煟閻樺弶绀岄柨鐔绘绾绢厽绂掗鐐粹拺缂佸顑欓崕鎴︽煕鐎ｃ劌锟芥牗绌辨繝鍥ㄥ仺缂佸娉曢ˇ鏉款渻閵堝棛澧慨妯稿姂閹潡鏁撴禒瀣拻濞达絽鎽滈弸鍐╀繆濡炵厧濮傞柟铏殜閹虫粓妫冨☉鍗炴闂備礁鎲″ú锕傚礈濞戞氨涓嶅Δ锝呭暞閸婂灚绻涢幋鐐垫噽闁绘帊绮欓弻锝夘敇閻戝棗鍓板銈庡幖濞硷繝骞冮悜鑺ュ亱闁割偒鍋呴敓銉︾節绾版﹫鎷烽崘鑼獓闂佸憡姊归悷鈺呮偘椤斿槈鐔烘兜闁垮顏跺┑鐐村灦椤忣亪顢旈崼顐ｆ櫅闂佺懓澧界划顖炴偂閻斿吋鐓熸俊顖氭惈缁狙呯磼閿熻棄鐣濋崟顒傚幈闂佽鍎抽顓犵不閻愮儤鐓欐い鏇嫹缂佺姵鐗曢悾閿嬬附缁嬪灝宓嗛梺缁樻煥瀵墎锟芥俺鍋愮槐鎾存媴妤︽寧顎楅梺鍛娒妶鎼佺嵁婵犲懐鐤�婵炴垶鐟ユ禒褍顪冮妶鍛闁绘锕幃锟犲即閵忥紕鍘搁梺鍛婂姈鐎笛咃拷姘秺濮婃椽鎳￠妶鍛瘣闂佸搫鎳愭繛锟介柟顔诲嵆椤㈡岸鏁撻挊澶屾殾闁告鍋愬Σ鍫熺箾閸℃ê濮堟い蹇曞枛濮婄粯鎷呯粙鎸庡�繛瀛樼矆缁瑥鐣烽弴銏╂晬婵炴垶鍑瑰ú绋库攽閻樿宸ラ柣妤�绻樺畷锝夊箻缂佹鍘遍梺闈涱檧缁茶姤淇婃禒瀣�堕煫鍥ㄧ♁濞懷勩亜椤撯�冲姷妞わ箒娅曠换娑㈠矗婢跺瞼鐓傚┑鈥冲级閸旀瑩鐛幒鎳虫梹鎷呯憴鍕典户闂傚倷娴囨慨銈夋晪濡炪倧绠撴禍璺侯嚕閹惰棄骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸靛鐎涙鍘卞┑鐐叉缁绘垿藟濠婂牊鐓冮悷娆忓閻忔挳鏌熼鐣屾噰鐎殿喖鐖奸獮瀣偐鏉堫煈鏁囬梻鍌氬�烽悞锔撅拷绗涘懎鏋堢�广儱顦闂佸憡娲﹂崰姘舵偪閿熶粙姊洪幐搴ｇ畵闁瑰啿绉堕懞杈ㄧ附閸涘ň鎷洪梻鍌氱墛缁嬫帡骞栭幇鐗堝�垫慨姗嗗亜瀹撳棛锟芥鍣崑濠傜暦閹烘埈鐓ラ柛鏇ㄥ亞瑜版挳姊绘担鍛婂暈闁荤喆鍎佃棟閺夊牄鍔庨々鍙夈亜韫囨挾澧涢柍閿嬪灴閺屾盯骞樺Δ锟介幊搴ｇ箔閿熺姵鈷戠紓浣癸供濞堟ê鈹戦悜鍥ㄥ闁诲孩顔栭崰鏍�﹂悜钘夋瀬闁圭増婢樺钘壝归敐鍥ㄥ殌缂傚倹鎹囧缁樻媴閼恒儳銆婇梺鍝ュУ濞叉牞鐏嬮梺鍛婃处閸亪鏁撻弬銈囩暤鐎规洖鐖奸、鏂款吋閸犻偊浜炵槐鎾诲磼濞嗘埈妲梺绋匡工濠�閬嶅极椤曪拷閺佹捇鎮╅崣澶嬓氶梻浣芥硶閸犳挻鎱ㄩ弶鎴晠婵犻潧娲㈡禍婊堟煛閸愭寧瀚归梺绋垮婵炲﹪鎮伴锟藉畷濂稿Ψ閿旇瀚藉┑鐐舵彧缁插潡鈥﹂崼銉ユ辈闂侇剙绉甸悡娆戠棯閺夊灝鑸瑰ù婊勫閿熷�燁潐濞叉﹢宕濆Δ鍐╊潟闁圭儤鍤﹂悢铏圭＜婵☆垳鍘ф繛鍥⒒閸屾瑧顦﹀鐟帮躬閹繝宕奸妷銉э紱婵炶揪绲藉﹢閬嶃�呴崣澶岀瘈濠电姴鍊绘晶娑㈡煟閹惧磭绠婚柣鎿冨亰瀹曟儼顧傞柡锟界紒妯镐簻妞ゆ劦婢侀弨鑽ょ磼缂佹娲寸�规洖銈搁幃銏㈠寲閺囩喎顏搁梻鍌欑窔濞佳兠洪妶鍥锋嫹濮橆偄宓嗛柕鍡曠铻ｅ〒姘煎灣閸欏棝姊洪崨濠傚Е闁绘挸鐗嗛…鍥ㄦ償閵婏妇鍘介柟鍏肩暘閸娿倕顭囬幇顓犵闁圭粯甯炵粻鑽わ拷瑙勬礃缁诲牓鐛�ｎ喗鏅滈柣姘摠鐎氱懓霉閿濆洨銆婇柡瀣叄閺岀喖鎮欓浣虹▏濠电偛鐗忛崰鏍ь潖濞差亝顥堟繛鎴ｉ哺閳绘捇姊洪崫銉バｉ柣妤冨Т椤曪綁顢曢妷锝勬睏闂佸湱鍎ら幐鎾箯婵犳碍鈷戠紒瀣濠�浼存煠瑜版帞鐣洪柡浣规崌閹崇偤濡烽敃锟介敓鑺ュ姉閿熷�燁潐濞叉﹢宕濆▎鎾跺祦闁哄秲鍔嶆刊鎾煕濠靛嫬鍔电紒鍗炲船閳规垿鎮╅崹顐ｆ瘎婵犳鍠楀娆戝弲闂侀潧鐗嗗ú銊︾▔瀹ュ棎浜滈柡宥庡亜娴狅箓鏌ｉ幘璺烘灈闁哄瞼鍠愬蹇涘礈瑜嶉崺宀勬偠濮橆厼鍝烘慨濠呮缁辨帒螣鐠囨煡鐎洪梻浣藉吹閸熷潡寮插☉顫稏闊洦鎷嬪ú顏嶆晜鐎广儱妫欏▍宥夋⒒娓氾拷濞佳嗗櫣闂佸憡渚楅崰妤咁敊韫囨稒鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰喊妞ゃ垺鐗犲畷姗�顢欓懖鈺嬬串婵犵數濞�濞佳囶敄閸涘瓨瀚呴柣鏂垮悑閻撶喖鏌￠崒娑卞劌婵炲牏濞�閺屾盯鎮㈤柨瀣闂侀潧娲ょ�氭澘顕ｉ鍕瀭妞ゆ棁妫勯敓绛嬪灦濮婅櫣鎷犻懠顒傤唹闂佸湱顭堟晶钘壩ｉ幇鏉跨閻庢稒锚椤庢挻绻涚�电孝妞ゆ垵鎳橀獮妤呮偨閸涘ň鎷洪梺闈╁瘜閸欏酣鎮為悙顑句簻妞ゆ挾濮撮崢鎾煟濞戝崬鏋︾紒鐘崇☉閳藉螣閾忓湱宕洪梻浣筋嚙鐎涒晝绮欓幒妤佹櫔濠电偛顕刊顓㈠矗閸愵煈娼栭柧蹇氼潐閸犲棝鏌涢弴銏℃锭闁哄懘浜跺娲閳哄啰校闂佸摜濮甸悧鏇炵暤閸曨剛绠鹃悗鐢殿焾鐢爼鏌ｆ幊閸旀垿宕哄☉銏犵闁圭偨鍔岀紞濠囧极閹版澘閱囨繝銏╁墯閹搁箖鎯�椤忓牜鏁囬柣鎰版涧閻撶喖姊洪崫鍕拱闁烩晩鍨跺顐﹀箛椤栨粎鏉搁梺鍝勬川婵潧鈻撻崗闂寸箚闁靛牆娲ゅ暩闂佺顑嗙粙鎾诲箲閵忕媭娼ㄩ柨鐔绘椤曪綁顢曢敃锟界粻鑽ょ磽娴ｈ偂鎴濃枍閵忋倖鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸閸烆垶姊洪棃娑辨Ф闁稿骸鐤囬妵鎰緞鐎ｂ晝绠氶梺缁樺姦娴滄粓鏁撻懞銉у⒈闁轰緡鍣ｉ獮鎺楀籍閹炬潙顏跺┑顔筋焽閸樠冾嚕椤旀拝鎷风憴鍕闁搞劌娼″顐㈩吋婢跺﹦顦板銈嗗釜閹风兘鏌＄�ｎ偄鐏存慨濠冩そ瀹曨偊宕熼锝嗩唲闂備胶绮〃鍛涘☉姘灊濠电姵鑹鹃崘锟藉銈嗘尵閸犳捇宕㈡禒瀣拺缁绢厼鎳忚ぐ褏绱掗弻銉х暫閽樼喎顭跨捄铏圭伇缁炬儳銈搁弻锝呂熼悜妯锋灆闂佺粯鎸搁妶鎼佸蓟閿涘嫪娌柛鎾楀嫬鍨辨俊銈囧Х閸嬬偤鏁冮姀銈呯疇闁绘ê鐏氬畷澶愭煕濠靛棗顏╅柤鍨姍濮婂宕掑▎鎴濆闁诲海鐟抽崨顖滅厯闂佸湱鍎ら弻銊╁垂濠靛鐓欓柣鎰靛墮婢ь垱绻涢崗鑲╁⒌闁哄睙鍡欑杸婵ê鍚嬬紞鍫ユ煟鎼淬垻顣茬�癸拷閹间礁钃熺�广儱顦敮闂侀潧锛忓鍥╊槸闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤栨鎷烽敃鍌涘�婚柦妯侯槼閹芥洖鈹戦悙鏉戠仸閼裤倖淇婇幓鎺斿ⅵ闁哄本绋戣灃闁告劑鍔嬬划鍫曟⒑閸愭彃妲绘い锔诲灦閸╃偤骞嬮敂鑺ユ珫闂佸憡娲﹂崑鍌涚珶閺囥垺鈷戦悹鍥ｏ拷铏亪闂佺锕ラ幃鍌炴晲閻愬墎鐤�闁哄洨濮烽敍婊冣攽閳藉棗鐏ユい鏇嗗浂鏁侀柟鍓х節缁诲棝鏌ｉ幇顒佲枙闁稿骸绻掔槐鎺楀Ω閵娿儰姹楅梺纭呭紦閸楀啿鐣烽崡鐐╂瀻闁瑰濯寸槐鎶芥⒒娴ｄ警鐒鹃柡鍫墮椤繈濡搁妷褎鎳冩繝鐢靛Х椤ｈ棄危閸涙潙纾婚柛娑卞灡瀹曟煡鏌涘畝锟介崑鐐哄磻閳哄喛鎷烽悷鏉款伃闁稿锕幃锟犲Ψ閳哄倻鍘遍梺瑙勬緲婢у海绮欐繝姘厽閹肩补妲呴悡鍏兼叏婵犲啯銇濈�规洜鍏橀、姗�鎮欓幓鎺濈�辩紓鍌氬�峰ù鍥敋瑜斿畷顖烆敃閵夘喗姣庨梻浣烘嚀閸氬鎮鹃鍫濈鐎广儱顦悡鏇㈡煙閻戞﹩娈曢柣鎾存礋閹﹢鎮欓幓鎺嗘寖闂佺懓鍟块幊蹇涘Φ閸曨垱鏅滈柤娴嬫櫇閺嗐倝姊洪崫鍕伇闁哥姵鎹囧畷鐗堢節閸パ咁攨闂佺粯鍔栨竟鍡涙儎鎼淬劍鈷戠紓浣股戠亸顏堟煕婵犲啰绠炵�殿喖顭峰鎾偄閾忚鍟庨梻浣虹帛閸旓箓宕滃鑸靛仧闁哄啫鍊荤壕濂告煟閹伴潧澧柛鏂诲�栭妵鍕敇閻樻彃骞嬮悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚弶鍛婁繆閻愵亜锟芥牜鏁繝鍥ㄥ�块柨鏇炲�哥壕鍧楁煙閹冾暢缁炬儳銈搁弻锝夊箛闂堟稑顫╅梺鍛婃煟閸婃妲愰幘鎰佸悑闁告粌鍟抽崥顐︽倵濞堝灝鏋涙い顓犲厴瀵偊骞囬鐐电獮婵犵數濮寸�涒晝绱為崒鐐粹拻濞达綀娅ｇ敮娑㈡煥濮樿埖鐓曢柣鏃堟敱閸嬨儳锟芥鍠楁繛濠傜暦婵傜唯闁挎棁顫夌�氳偐绱撻崒姘拷鐑芥倿閿曚焦鎳岄梺璇茬箰濞存碍绂嶉鍫濊摕婵炴垶鐟﹂崕鐔兼煏閸繃鍣芥慨锝冨灲濮婃椽鎮烽幍顔炬殯闂佹悶鍔岀紞濠囧春閵夛箑绶為柟閭﹀墻濞煎﹪姊虹紒妯曟垿顢欓弽顓炶Е闁告稑鐡ㄩ埛鎺懨归敐鍫燁仩閻㈩垱鐩弻娑㈠Ω閳哄倹閿柧鑽ゅ仦缁绘盯骞嬪▎蹇曚患缂備緤鎷峰鑸靛姈閻撴瑩姊婚崒姘煎殶闁告柨绉归弻锝夊箻鐠虹儤鐏堝Δ鐘靛仦閻楁洝褰佸銈嗗釜閹风兘鏌ｈ箛锝呮珝闁哄矉缍侀獮娆撳礃閵娧傛闂備礁鎼張顒傜矙閹达絿浜欏┑鐐舵彧缁茶法娑甸崼鏇炲嚑婵炲棙鎸婚崐鍨箾閸繄浠㈤柡瀣堕檮閵囧嫰寮撮崱妤佹悙闁绘挴锟芥剚鐔嗛柤鎼佹涧婵洦銇勯銏″殗闁哄苯绉规俊鐑藉Ψ閵夈儳顑堢紓鍌欓檷閸斿鍒掑▎蹇ｆ綎缂備焦蓱婵潙銆掑鐓庣仯闁告梹鎮傚娲传閸曨厼鈷堥梺鍛婃尰缁嬫捇宕氶幒鎴旀瀻闁规儳纾娲⒑閹稿孩鈷掔紒顕呭灦瀵彃顭ㄩ崼鐔叉嫼闂佸憡鎸昏ぐ鍐╃濠靛洨绠鹃柛娆忣檧閼板潡鏌涢埡鍌滄创妤犵偞甯掕灃濞达絽鎼獮鍫ユ⒑鐠囪尙绠抽柛瀣♁閺呰埖绂掔�ｎ亞鐤囬梺鍛婁緱閸犳挻绂嶅鍫熺叆闁哄啫娲ゆ禍褰掓煟閿濆洦鏆柡灞革拷宕囨殕闁跨喍绮欏畷浼村箻鐠囪尙顔嗛梺缁樏肩拃锕�危閸撗呯＝濞达絽寮堕～澶愭煙妞嬪骸鍘存慨濠勭帛閹峰懐绮电�ｎ亝鐣伴梻浣告憸婵潧鐣濈粙璺ㄦ殾婵°倧鎷锋い顐ｇ矒閺佹捇鎸婃径妯烘濡炪倖鍔х粻鎴犵矆閸愨斂浜滈柡鍐ㄦ搐娴滃綊鏌ㄥ☉娆戠煀闁宠鍨块、娆戠驳鐎ｎ剙濮煎┑鐐茬摠缁娀宕滈悢椋庢殾闁靛繈鍊ら弫鍡涙煕閺囥劌鍘撮柟椋庣帛缁绘稒娼忛崜褏袣婵犳鍠撻崐妤�鈽夐悽绋块唶闁哄洨鍠撻崢閬嶆⒑缂佹﹩鐒炬繛鍛礈娴滄悂鎮介悽鐢碉紲濡炪倖姊婚妴瀣叕椤掑嫭鐓欐い鏍ㄥ嚬濡拷閻庢鍠栭悥濂稿Υ閸屾埃鏋栧☉鏃偽杘leList婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠囨倿閿曞倸纾块柟鍓х帛閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒娑樹淮閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插缂嶅倿姊绘担铏瑰笡闁挎岸鏌涢悢閿嬪仴鐎殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝棝顢栧▎鎾崇？闊洦鏌ｆ禍婊堟煙鐎涙绠栭柛銈呮喘閺屾盯鍩￠崘銊ゆ濡ょ姷鍋涢澶愬极閸岀偞瀵犲璺侯槹閻繘姊婚崒娆戭槮婵狅拷鏉堚晛鍨濇い鏍ㄧ矋閺嗘粍淇婇妶蹇斿闂佸磭绮幑鍥�佸锟介幃婊堝幢濡櫣妲ｉ梻鍌欑窔濞佳囨偋閸℃あ娑樷枎閹寸姷鐒奸柣搴秵閿熷鍨婚幊鎾烩�﹂妸鈺佺妞ゅ繐瀚崢浠嬫煟鎼淬埄鍟忛柛鐘崇墵閳ワ箓鏌ㄧ�ｂ晝绠氶梺褰掓？缁�渚�鎮″☉銏＄厱閻忕偛澧介悡顖滅磼閵娿倗鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ闂備礁鎼悧婊堝礈濞戞艾鍨濇繛鍡樻尭缁狅綁鏌ㄩ弮鍌滃笡闁哄懏绮撳铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷
		new fire.pb.state.PRoleLockScreen(role.getRoleid(),(lock!=0)?Boolean.TRUE:Boolean.FALSE).submit();		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810344;

	public int getType() {
		return 810344;
	}

	public byte lock;

	public CClientLockScreen() {
	}

	public CClientLockScreen(byte _lock_) {
		this.lock = _lock_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(lock);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		lock = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CClientLockScreen) {
			CClientLockScreen _o_ = (CClientLockScreen)_o1_;
			if (lock != _o_.lock) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)lock;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(lock).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CClientLockScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = lock - _o_.lock;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.msp.title;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyTitle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyTitle extends __GNotifyTitle__ {
	@Override
	protected void process() {
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		if(null == role.getScene()) return;
		role.setMyTitleInfo(title);
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓氱粭鐔肺旈敓鍊熺亱闂佽法鍠撴慨鐢稿煕閹达附鐓熼柣鏂挎啞缁舵煡鏌￠崱娑楁喚闁哄矉缍侀、姗�鎮欑拠褎瀚归柟闂寸筏缂嶆牠鐓崶銊р檨闁诡垳鍋ら幃宄扳枎韫囨搩浠奸梺缁樼箑閸楀啿顫忓ú顏勪紶闁告洦鍣鍫曟⒑缁嬪灝顒㈡俊鐐扮矙瀵偊骞樼紒妯烘疅闂侀潧顦介崰妤呮偪娓氾拷濮婃椽宕崟顓犲姽缂傚倸绋勯幏椋庣磽娴ｅ搫校闁烩晩鍨伴锝夘敋閿熶粙寮幘瀵割浄閻庯綆鍋勯崜顓㈡⒑绾懏褰ч梻鍕閹繝寮撮姀锛勫幍闂佺粯鍨惰摫閻忓浚鍘界换娑㈠箹椤撶偞鐏嶅銈冨妸閸庣敻骞冨▎鎾村仾婵炲牆銇橀柇顖炴煙椤曪拷缁犳牠骞冨鍫熷癄濠㈣泛鑻敓鐣屽仱濮婃椽妫冨☉杈╁彋闁诲酣娼ч惌鍌氱暦椤栨稒鍎熼柕濠忚吂閹峰姊虹粙鎸庢拱闁荤啙鍛幓闁哄喛鎷风紒缁樼♁閹峰懘宕橀崣澶婃閻庤娲橀悡锟犲蓟濞戙埄鏁冮柣妯诲絻婵海绱掗悙顒�鍔ょ紓宥咃躬瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劗绱撴担鍝勪壕闁稿孩濞婇垾锕傛倻閽樺鎽曞┑鐐村灟閸ㄥ綊宕￠幎鑺ョ厪濠电偛鐏濋崝銈吤归悪锟介崣鍐潖閾忓湱纾兼俊顖濐嚙闂夊秴鈹戦悙鎻掔骇妞ゎ厼娲獮鎴﹀閻橆偅顫嶉梺闈涚箳婵兘顢樺ú顏呪拺缂備焦锚閻忋儲绻涚仦鍌氾拷婵嗙暦閿濆鍗抽柕蹇婃閹风粯绻濋悽闈浶㈠Δ鐘叉啞閺呰埖绻濆顓犲幈闂佽鍎抽顓€�傞懠顒傜＜鐎癸拷閸愵喖鎽电紓浣虹帛缁诲牆鐣烽幆閭︽Ь濡炪倧瀵岄崣鍐箖瀹勯偊鐓ラ柛鎰碉拷顖嗗拑鎷风憴鍕８闁搞劌顭烽弫鎾绘嚍閵壯�妾ㄩ柦鍐憾閺屾稑鈻庤箛鏇狀唶闂佸疇顫夐崹鍧楀箖閳哄懎绠甸柟铏瑰仦鐎氬湱鎲搁悧鍫濈瑨缂佺姵宀搁弻娑㈩敃閻樻彃濮庨梺鍝勵儎缁舵岸寮诲☉銏╂晝闁绘ɑ褰冩慨鏇㈡⒑缂佹ɑ灏版繛鑼枛瀵寮撮悢椋庣獮闁诲函缍嗘禍鐐寸閹绢喗鈷戦柛婵勫劚鏍￠悗鐧告嫹闁归棿绀佺粻鏍ㄤ繆閵堝懏鍣圭紒鐙�鍣ｉ弻銈夊箒閹烘垵濮夐梺褰掓敱濡炰粙寮婚敐澶嬪亹闁告瑥顦ˇ鈺呮偡濠婂嫭绶查柛鐔告尦閵嗕礁螖閸涱収娼婇梺闈涚墕濡盯宕㈤柆宥嗏拺闁荤喐澹嗛幗鐘电磼鐠囨彃顏紒顔芥閹煎綊鎯傞崨濠傤伓闁荤喐鐟ョ�氼厾澹曢幖浣圭厱闁靛鍔嶉ˉ澶愭煟閿濆懎妲绘い顓滃姂瀹曢亶鍩￠崒鍌楁櫊濮婄粯鎷呯憴鍕哗闂佸憡鏌ㄧ粔鍫曞箲閵忋倕纾奸柣鎰皺閸樻挳姊虹涵鍛涧闂傚嫬瀚板畷鎴﹀箛閻楀牏鍘卞┑鐐叉濞存艾危閸涘浜滈柨鏃囶潐濞呭﹥鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敆閿熻棄鈻嶉妶鍥╃＝濞撴艾娲ら弸鐔兼煙閻熺増鎼愭い鏇悼閹风姴霉鐎ｎ偒娼旈梻渚�娼х换鎺撴叏閻戠瓔鏁婇柟鐑樺灍閺�浠嬪箳閹惰棄纾圭憸鏃堢嵁韫囨稒鍊婚柤鎭掑劤閸樼敻姊洪幆褎绂嬮柛瀣閹便劌顓奸崶閿嬪閻熸瑥瀚壕鎼佹煕閵娿倗鐭欓柕鍡曠閳藉濮�閳ョ鎷锋搴ｇ＜妞ゆ梹顑欏鎰版倵濮橆兙鍋㈡慨濠冩そ閹筹繝濡堕崨鍛灪缁绘稓鎷犺閻ｆ娊鏌曢崶銊ュ鐎规洘锕㈤、娆撴偂鎼淬垹鍔掗梻浣告惈椤︻垶鎮ч崘顔肩柧婵犻潧鐗嗛ˉ姘舵煟閿濆懐鐒块柟椋庡厴閻涱噣宕归鐓庮潛闂備胶鎳撻崯璺ㄦ崲濡寧锛傞梻浣虹帛閸旀寮崫銉ヮ棜濠靛倸鎲￠悡鏇㈡倶閻愰潧浜鹃柣銊﹀灩閿熻姤绋掔换鍌炩�旈崘顔嘉ч幖绮癸拷宕囶唹闂備礁鎲″褰掑垂閻㈠憡鍋╅梺鍨儑闂勫嫰鏌涘☉姗堝伐濞存粍绮撳娲川婵犲倻浠ч梺绋匡攻閻楁粓鏁撻懞銉ㄥ缂傚秴锕濠氭晲婢跺娼婇梺缁樏崯鍧楀汲閸儲鈷戠紒瀣儥閸庢粎绱撳鍕獢鐎殿喛顕ч埥澶愬閻樻牓鍔戦弻銊モ攽閸℃ê娅ｅ銈庡墮椤戝顫忓ú顏咁棃婵炴垶鑹鹃。娲⒑鐎癸附婢樻俊鐣岀磼瀹�鍐摵缂佺粯绻堝畷鎯邦槾妞ゆ柨鐭傚娲捶椤撶偛濡洪梺鍝勮閸旀垿宕洪崨瀛樺仺闁告稑艌閹锋椽姊洪崨濠勭畵閻庢凹鍣ｉ幃姗�鏌嗗鍡欏幈闂佺粯锚绾绢厽鏅堕悽鍛婄厽婵炴垵宕▍宥囷拷瑙勬礀瀹曨剟锝炲┑瀣濠㈣泛鍘滈弲鐘差潖缂佹ɑ濯撮柦妯侯槷濮规顪冮妶搴″箹闁绘绻掑Σ鎰版倷鐎靛摜鐦堥梺鎼炲劀閸℃ɑ鍟洪梻鍌欑窔濞佳嗗闂佸搫鎳忕划鎾崇暦閹达箑绀嬫い鏍ㄧ☉娴狀垶姊洪幖鐐插姌闁告柨閰ｅ鍐测枎閹惧鍘甸梺鍛婃寙閸涱厾顐奸梻浣虹帛閹搁箖宕伴幇顓犫攳濠电姴娲ゅ洿闂佸憡娲﹂崢鍏间繆閻ｅ瞼纾藉〒姘攻鐎氬綊鏌ｆ惔顖滅У闁哥姵顨婇幃锟犲礃椤旂晫鍘繝銏ｅ煐閿氶柣蹇ョ秮閺岋綁鏁愰崶銊︽瘎闂佽法鍠庨敓鐣屽櫏濞兼劖绻涢崣澶屽⒌闁诡喓鍎茬缓浠嬪箹閻戝洦瀚瑰ù锝堝�介弮锟介幏鍛村传閵壯呭祦闂備浇顕ч崙鐣岀礊閸℃稑纾婚柛娑樼摠閸嬬喐銇勯幇銊﹀櫚闁猴拷娴犲鐓熸俊顖濐嚙婢ь垶鏌涢悢椋庣闁哄本鐩幃鈺呭箛娴ｅ湱鏉归梻浣芥〃缁�渚�宕幘顔猴拷渚�寮撮姀鐘栄囨煕濞戝崬鐏ｉ柣鈩兠埞鎴炲箠闁稿ě鍛筏濞寸姴顑呯粣妤佺箾閹寸偞鐨戠紒锟芥繝鍥ㄧ厸鐎广儱楠告禍楣冩煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經濠碉紕鍋戦崐褏绱撳璺虹闁规儼妫勯弰銉︾箾閹存瑥鐏╃紒鐙呯秮閺屻劑寮崒娑欑彧闂佸憡锕㈡禍璺侯潖濞差亜鎹舵い鎾跺仒婢规洖鈹戦悙鎻掓倯闁荤啙鍐惧殫濠电姴瀚�氭岸鎮锋担鐤厡闁硅櫕鎹囬垾锕傚Ω閳轰礁绐涘銈嗘尰缁诲啴锝為弴銏♀拻濞达絽鎲￠幆鍫ユ煛閸偄澧撮柟顖氬椤㈡盯鎮欓懠顒傛毇闂備礁鍟块幖顐﹀箠韫囨稑鍚归柟瀵稿亼娴滄粓鏌熼幖顓炲箹濞存粍鐗犻弻娑欑節閸愵亜顫х紓浣哥焷妞村摜鎹㈠┑瀣倞鐟滃繘鎮￠幋鐐电瘈闁靛骏绲剧涵楣冩煥閺囨ê锟芥繈鏁愰悙鍝勭婵°倓绀侀敓钘夌仛缁绘盯宕煎┑鍫滆檸闂佸搫顑嗛悷褏妲愰幒妤婃晩闁伙絽鏈崳浼存⒑闂堟稒顥欑紒锟芥笟锟介敐鐐差煥閸喐娅㈡繛瀵稿Т椤戝懐绮婚弽顓熺厪闊洤顑呴敓鑺ョ墵楠炲濡烽埡鍌滃幈闁诲繒鍋炲畷妯荤珶濡眹浜滈柡鍥ф濞诧箓鍩涢幒鎳ㄥ綊鏁愰崼鐕佹闂佸憡鑹剧紞濠囧蓟濞戙垺鍋愰柛鎰絻椤酣姊洪崨濠傜瑲閻㈩垱甯￠幃鎯р攽鐎ｎ偅娅㈤梺浼欑到閼活垶宕瑰┑瀣厸闁告劑鍔庢晶娑㈡煕鐎ｃ劌濡跨紒杈ㄥ笧閿熸枻缍嗛崢鐣屾兜閸洘鐓熼柨婵嗩槺閻ｇ儤鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敃椤掍礁顏堕悷婊呭鐢晠寮崟顒傜闁糕剝蓱鐏忎即鏌涚�ｎ亜锟藉潡寮婚弴鐔风窞闁糕剝蓱閻濇洟姊虹紒妯诲鞍婵炲弶顭囬幑銏犫槈閵忕姷顓哄┑鐘绘涧濡粓宕洪悙娴嬫斀闁绘劕寮堕崳娲嫅鏉堚晝纾肩紓浣诡焽濞叉挳鏌熼搹顐ゅ⒌闁糕斁鍓濋幏鍛村捶椤撱劍瀚瑰┑鐘崇閳锋垿鎮楅崷顓烆�屾繛鍏煎姍閺屾盯濡搁妷锕�浠村Δ鐘靛仜閸熸挳宕洪敓鐘茬妞ゅ繐妫寸槐鍙夌節绾版ɑ顫婇柛銊ゅ嵆閳ワ箓鎮滈挊澶嬬�銈呯箰閹虫劗寮ч敓浠嬫⒑濮瑰洤鐏叉繛浣冲嫮顩锋繝濠傜墛閻撶喐銇勮箛鎾虫殭鐎规挸妫涢敓鍊燁潐濞叉鎹㈤崼銉у祦閻庯綆鍠楅弲婵嬫煥閻斿嚖鎷烽悢铏诡啍闂傚倸鍊风粈渚�骞夐敍鍕煓闁硅揪闄勯崑銈夋煏婵炵偓娅呯痪鍓ф嚀閳规垿鎮╁畷鍥舵殹闂佺粯鎸炬繛锟介柡宀�鍠栭、姗�鎮㈡搴ｆ噯闂備礁鎲￠弻锝夊磹濠靛钃熸繛鎴烇供濞笺劑鏌涢埄鍐╃闁告垵婀辩槐鎾存媴閾忕懓绗＄紓浣筋嚙閻楀﹪骞堥妸鈺傛櫢濞寸姴顑嗛悡銉︾節闂堟稒顥炴い銉у█閺屾洟宕卞Ο鍝勵潚濠殿喖锕ㄥ▍锝囨閹烘埈娼ㄩ柛鈩冾焽閺嗐儲绻濈喊妯活潑闁稿鎳愰幑銏ゅ磼閻愭潙浠奸悗鐟板婢瑰寮ㄦ禒瀣厱闁虫拝鎷烽柡鍛箞瀹曪綁宕卞☉娆屾嫼闂佸憡鎸昏ぐ鍐╃閻愮儤鐓曢柣妯挎珪瀹曞瞼锟借娲忛崹鍝勵焽韫囨稑惟鐟滃繘鎯侀崼銉︹拺婵懓娲ら悘鍙夌箾娴ｅ啿鍟伴幗銉╂⒒娴ｇ瓔鍤欓悗娑掓櫊瀹曟瑨銇愰幒鎴犵厬闂佸憡鍔﹂悡鍫ュ吹閺囥垺鐓欓柛鎾茶兌閹藉倿鏌℃担鍛婎棦闁哄本鐩鎾Ω閵夈儺娼鹃梻浣告啞钃遍柟顔煎�垮濠氭晲閸垻鏉搁梺鍝勬川閸嬫鍒掗懜鐢电瘈闁冲嚖鎷烽柛灞剧矌閻撴捇姊虹化鏇熸澓闁稿孩褰冮銉╁礋椤栨氨鐤�濡炪倖鎸炬慨瀵告暜濡ゅ懏鈷戦柤濮愬�曞瓭濠电偠顕滅粻鎾诲箖閿熺姵鏅搁柣娆欐嫹闁轰椒鐒︽穱濠囧Χ閸涱喖娅ら梺纭呮珪瀹�鎼佸蓟閵娿儮鏀介柛鈾�鏅滄晥闂備胶绮幖顐ょ礊娓氾拷閹繝顢曢敃锟介悙濠囨煏婵炲灝鍔氶柡瀣懇濮婃椽鎮烽弶鎸幮╅梺鎼炲灪閻擄繝宕洪妷锕�绶炲┑鐐靛亾閻庡姊虹涵鍛劷闁告柨绉归幃姗�宕卞☉娆屾嫽闂佺鏈懝楣冩晸閼恒儲鍊愮�规洘鍔欓獮鏍ㄦ媴閸濄儻绱梻浣虹帛閸ㄥ吋鎱ㄩ妶澶婂惞闁告洦鍨遍悡鏇熴亜閹板墎绋荤痪鍓ф暬閺屻劑鎮㈤崨濠勪紕缂備胶濮甸幐鎼佹偩闁垮闄勭紒瀣儥濞煎﹪姊洪悙钘夊姎闁哥喕娉曢懞閬嶅Ψ閳哄倵鎷绘繛杈剧导鐠�锕傚绩娴煎瓨鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃銉╁Χ閿濆绀冮柕濞у懏鐎梺璇叉捣濞呫垽骞忛悜鑺ョ厱闁哄洢鍔岄崢鎾煙闁垮銇濋柡宀嬬秮閹晠宕ｆ径瀣�烽柣搴㈩問閸犳牠鎮ユ總鍝ュ祦闁硅揪闄勯弲鎻掝熆鐠轰警鍎戦柛妯烘啞缁绘稒娼忛崜褏袣濡炪値鍋勯ˇ闈涚暦閹版澘绠涙い鏇炴鐎氬綊鎮峰▎蹇擃仾缁剧偓鎮傞弻娑㈠Ω閵夛絽浠柦妯荤箞閺屾盯顢曢敐鍡欘槰闂佺粯鎸鹃崰鏍偂椤愶箑鐐婇柕濠忓閸欏棗鈹戦悙瀛樺剹闁哥姵顨婇獮鍫ュΩ閿斿墽鐦堥梺鍛婂姀閺傚倹绂掗姀銈嗗�甸悷娆忓绾炬悂鏌涢弬璺ㄐら柟骞垮灩閳规垹锟斤綆浜為ˇ鏉款渻閵堝棙灏靛┑顕�娼ч埢鎾寸附閸涘ň鎷绘繛杈剧悼閻℃棃宕靛▎鎾村�垫繛鎴炲笚濞呭懏銇勯锝囩疄濠碘剝鎮傞崺鈩冩媴娓氼垱袧濠电姷顣藉Σ鍛村垂闂堟稈鏋嶉柨婵嗩槸濮规煡鏌ㄩ弴鐐诧拷褰掑煕閹烘鐓曟い鎰╁�曢弸鏃堟煃缂佹ɑ宕岄柡宀嬬磿閿熸枻缍嗘禍顏堝矗閸曨垱鐓涚�癸拷閿熶粙宕伴弽褏鏆︽繝濠傛－濡線鏌﹀Ο鐓庢灈婵﹪缂氶妵鎰板箳閹惧瓨娈告繝纰夌磿閸嬬姴螞閸曨垽缍栭煫鍥ㄦ媼濞差亶鏁傞柛娑卞幗椤撳ジ姊绘笟锟藉褔鎮ч崱娑樼疇闊洦绋掗崐鐢告煟閹伴潧澧扮紒鈽呮嫹闂備線娼х换鍫ュ垂濞差亜鍚归柨鐔绘閳规垿鍩ラ崱妞剧凹缂備浇顕ч悧鎾诲箖娴兼惌鏁婇柛銏狀槹濡啫鐣烽妸鈺婃晩闂傚倸鐡ㄩ惈蹇曠磽閸屾艾锟芥悂宕愰悜鑺ュ�块柨鏇炲�甸敓鏂ょ畵瀹曞爼顢楅敓浠嬪磼閵娾晜鈷戞い鎺炴嫹缂佸鏁婚崺娑㈠箣閿旂晫鍘卞┑鐘绘涧濡顢旈埡鍛厸閻庯絽澧庨悾鐢告煛瀹�锟介崰鎰八囬悧鍫熷劅闁炽儱鍟跨粻锝夋⒒娴ｇ瓔鍤冮柛鐘虫礈閸掓帒鈻庨幘鎲嬫嫹娴ｇ硶妲堟慨妤�妫涢崣鍡涙⒑閸涘﹤澹冮柛鏇ㄥ亞閸橀亶姊婚崒姘拷椋庣矆娓氾拷楠炲鏁嶉崟顒佹濠德板�曢崯顖炲汲濠婂牊鐓ラ柣鏂挎惈瀛濋梺鍝勫閸庣敻寮婚妸鈺傚亜闁告繂瀚呴姀顫嫹閻熺増鍟炵紒璇插暣婵＄敻宕熼姘鳖啋闁荤姾妗ㄧ拃锕傛晸閽樺鐒搁柡灞剧洴閹垺绺芥径濠傚濠电儑绲藉ú銈夋晝椤忓牆绠栨繛鍡樻惄閺佸倿鏌涢弴鈥崇厫閻庢艾缍婇弻鈥愁吋鎼达絼绮跺┑鐐村灦閻熝囨偡瑜版帗鐓ラ柣鏃傜帛椤ュ鏌ｉ敐鍥у幋妤犵偛顑夐弫鍐晸閻ｅ瞼涓嶆繛鎴炵懀娴滄粓鏌熼悙顒夋當閻庢氨鍏樺畷顖氼吋婢跺鎷绘繛杈剧秬椤宕戦悩缁樼厱閹兼番鍨洪妵婵堬拷瑙勬礃缁矂锝炲┑鍫熷磯闁惧繒鎳撻獮鍫ユ⒒娴ｄ警鏀伴柟娲讳邯濮婁粙宕熼娑樹簵濠电偞鍨崹娲偂閺囥垺鍊堕柣鎰閻ｈ姤銇勮箛鎾跺缂侊拷婢跺绡�濠电姴鍊搁顐ょ磼閻樿崵鐣洪柡灞剧☉閳藉宕￠悙鑼啈闂備焦鎮堕崐鏇灻洪銏犺摕闁挎稑瀚▽顏堟煕閹炬瀚崹閬嶆⒒娴ｇ瓔鍤冮柛鐘虫崌瀹曞綊鎸婃径灞炬闂侀潧顭俊鍥╁姬閿熶粙姊洪崨濠冨闁稿瀚埢鎾诲Ψ閳哄倵鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍婊堟懚閻愮鎷烽惂鍛婂闂佸憡娲﹂崑鍡涘蓟瑜斿铏圭磼濡浚浜滆灒濠电姴鍋嗛悞浠嬫煛瀹ュ骸浜炵痪鎹愭闇夐柨婵嗙墕娴滄鏌熺�电浠滈柛銊︽閹妫冨☉娆愬枑缂佺偓鍎抽崥瀣崲濞戙垹绠ｉ柣鎴濇矗缁剁敻姊虹粙鍧楊�楃紒缁樺灩閹广垹鈽夐姀鐘诲敹闂佺粯鏌ㄩ崲鏌ワ綖閹烘垟鏀芥い鏃傘�嬮弨缁樹繆閻愯埖顥夐柣锝囧厴婵℃悂鏁傞崜褏妲囬梻浣告啞濞诧箓宕滃▎蹇婃瀺闁硅揪闄勯埛鎺楁煕鐏炲墽鎳呮い锔肩畵楠炴牜锟芥稒顭囬惌宀�锟藉灚婢橀敃銉х矉閹烘棑鎷烽敐搴′簻濞寸姴銈稿鍝勑ч崶褝鎷烽妶澶婂瀭妞ゆ帊鑳堕々鑼喐閻楀牆绗氶柣鎾寸懇閺岋綁骞嬮悙鍡樺灩娴滄悂顢橀悘璇茬秺閹晝浠﹂崒姘垝闂備礁鎼惌澶岀礊閿熺晫绱掗悩宕囨创鐎殿喗鎸抽幃娆撴偋閸繄鍘遍梻鍌氬�烽悞锕傚磿瀹曞洦宕查柟閭﹀弾濞堜粙鏌熼梻纾嬵唹闁跨喐鏋荤粻鎾崇暦閸洦鏁嗗ù锝夋櫜缁ㄥ姊虹拠鑼缂佽顑夐幃鐐烘晝閸屾碍顥濋梺璺ㄥ枍缁瑥顫忕紒妯诲闁惧繒鎳撶粭鈥愁渻閵堝骸骞栨繛灞傚姂瀹曟岸骞掑Δ濠冩櫖濠殿喗锕徊楣冿綖瀹ュ鍋℃繝濠傚暞閹癸綁鏌熼獮鍨仼闁宠棄顦～婵嬵敃閿濆懎顎忛梻鍌欒兌椤牓寮甸鍕殞濡わ絽鍠涚紞鏍煕閵夘喖澧柍閿嬪灩缁辨帡顢涘☉娆戭槰闂佸搫顦板浠嬪蓟濞戙垹惟闁靛瀵屽Λ鍕渻閵堝棙绌跨紓宥勭窔閵嗕礁顫濋懜鍨闂佽姤锚椤﹂亶寮抽敃鍌涚厵闁绘垶锕╁▓鏇㈡煛閸涱喚鐭掗柡宀嬬畱铻ｅ〒姘煎灡閳绘挻绻涢弶鎴濇倯闁瑰摜绮粚杈ㄧ節閸ヮ灛褔鏌涢妷顔句虎闁靛鏅滈悡鏇㈡倵閿濆骸浜炴繛鍙夋尦閺岀喖顢欓惌顐邯閸╃偤骞嬮悪鍛闁挎繂绨肩花鑺ャ亜閿旇鏋涢柍瑙勫灴椤㈡瑧绮电�ｎ剙濮奸梻浣虹《閺呮粓鎮ч悩璇茬畺闁跨喓濮甸崑鍕⒒閿熶粙骞囬鍓ф毎闂傚倷绶氬褔鎮ч崱娆愬床闁瑰濯撮幏宄邦潩椤掍浇纭�缂備浇椴搁幐濠氬箯閸涘瓨鎯為柣鐔稿椤愬ジ姊哄Ч鍥х労闁搞劍濞婂畷鎴﹀Χ閸涱垱娈惧┑顔筋焾濞夋稓绮婚幎鑺ョ厵闁诡垎鍐炬殺闂佷紮绠戦悧鍡涘煘閹达富鏁婇柡鍌樺�撶欢鐢告⒑閸涘﹥灏伴柣鐔叉櫅閻ｇ兘顢楅崟顐嬧晠鏌曟径妯烘灍閻庨潧鐭傚娲濞戞艾顣哄┑鈽嗗亝閻熝勭閹间焦鍋ㄩ柛娑橈功閸橀亶姊虹紒妯活棃闁猴拷闁秴纾婚柕澶涘瘜濞堜粙鏌ｉ幇顖氱毢缂佺姾灏欑槐鎺旂磼濡偐鐣靛銈庡亝缁诲牓銆佸Ο琛℃婵炲棗娴氭导鏍⒒閸屾瑦绁扮�规洖鐏氶幈銊╁垂椤愩値娲告繛瀵稿Т椤戝懐绮堟径鎰�堕柣鎰礋閹烘鍑犵�广儱顦伴悡娆撴煙濞堝灝鏋涙い锝呫偢閺岋綁骞樼�靛憡鍣伴梺鍝勬湰閻╊垶鐛�ｎ亖鏋庨煫鍥ュ劜鐎氬綊鏌″搴′壕闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓炶摕闁搞儺鍓氶弲婵嬫煥閻斿墎鐭欑�规洘绻堥獮鎺楀箻閸撲緡鍟庨柣搴ｆ嚀婢瑰﹪宕伴弴鐘哄С闁煎鍊楃壕濂告煟濞嗗繑鍣界紒澶樺櫍閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾稖绠涢幘铏�┑顕嗙到鐎氭澘顫忛搹鍦＜婵☆垵娅ｉ悷銊╂⒑閸涘﹨澹樻い鎴濇喘楠炴垿濮�閻橆偅顫嶉梺闈涚箳婵兘顢欓幒妤佺厽閹艰揪绲鹃弳鈺傘亜椤撶偟澧︾�殿喗濞婇弫鎾绘偐閺傘儲瀚奸梻渚�娼荤�靛矂宕㈡總绋垮偍闁圭虎鍠楅悡娑㈡煥閻斿墎鐭欓柡灞芥椤撳ジ宕ㄩ崒锔剧暤闁哄本鐩鎾Ω閵壯傚摋婵＄偑鍊ら崑鍕箠濮楋拷瀵顓兼径瀣檮婵犮垼娉涢鎰涢妶澶嬧拺闁告稑锕ラ埛鎰版煙椤旂厧锟芥悂锝炶箛鎾佹椽顢旈崪浣诡棃婵犵數鍋為崹鍫曟偡閵夆敡鍥煛閸涱喒鎷洪梺鍛婄☉閿曘儵鍩涢幇鐗堢厽闁绘柨寮跺▍濠囨煙椤旇宓嗘い銏″哺閺佹挻绂掔�ｎ剙绁﹂梺鍦劋閸わ箓寮崼鐔告闂佷紮绲介惉鍏肩▔瀹ュ鐓ユ繝闈涙－濡插綊鏌ｉ幘璺烘瀾缂佺粯鐩畷鍗炍熼崗鐓庢珬闂佽瀛╅懝鍓х礊婵犲偆娼栨繛宸簻瀹告繂鈹戦悩鍙夊櫣妞ゃ儲绻堝娲偡閺夋寧姣愰梻浣稿簻缂嶄礁鐣峰ú顏呭�烽柛婵嗗椤撴椽姊洪幐搴㈩梿濠殿喓鍊曢埢宥夊冀椤撶啿鎷洪梺鍛婄☉閿曘儲寰勯崟顖涚厱閻庯綆浜滈敓钘夘煼瀹曟岸骞掗弮锟藉畷澶娿�掑鐓庣仭閻庨潧鐭傚娲濞戞艾顣哄┑鈽嗗亝椤ㄥ﹪骞冨锟芥俊鐑藉煛閸屾粌骞嶉梻浣瑰劤濞存岸宕戦崟顒佸弿鐎广儱顦伴悡娑樏归敐鍫綈鐎规洖鐭傞弻鐔虹矙閸栤剝鏁鹃悗鍨緲鐎氼喗绂掗敃鍌涘殐闁冲搫鎳夐弨娲⒒閸屾瑧鍔嶉柣顏勭秺瀹曟椽宕熼姘�梻渚囧墮缁夋煡鏁撻挊澶婃殻鐎规洖銈告俊鐑芥晜閼恒儺浠ф繝鐢靛仜椤曨厽鎱ㄩ幘顕呮晞闁糕剝銇涘Σ鍫㈡喐閺冨牆钃熼柡鍥ュ灩闁卞洭鏌曡箛濠冩珖闁告梹鎮傚鐑樺濞嗘垶鍋ч梺绋跨箲閿曘垽鎮伴锟介獮鎺楀箠閾忣偅鈷愰柟宄版嚇濡啴鍩￠崒姘间紦濠碉紕鍋涢鍛规搴☆棜闁稿繒顑曟禍婊堟煛閸愭寧瀚瑰銈嗗灦閻熴儵鈥﹂崶顒�绠涢柣妤�鐗嗛敓钘夌仛閹便劌顫滈崱妤�骞嶉梺绋款儍閸ㄦ椽骞堥妸锔剧瘈闁告洦鍘肩粭锟犳⒑閻熸澘妲婚柟铏悾鐑藉Ω閿斿墽鐦堥梺鍛婂姂閸斿本绔熷鍛斀闁挎稑瀚禍濂告煕婵炑冩噽娑撳秹鏌熸潏鍓х暠闁汇値鍣ｉ弻娑滎槼妞ゃ劌鎳橀幃鈥斥攽鐎ｎ偆鍘搁梺鍛婂姂閸斿孩鏅堕弴銏＄厱婵°倓绀侀埢鏇㈡煛瀹�瀣М妤犵偛娲、妤呭磼濞嗘垿鈹忛梻鍌欒兌閹虫捇宕崸妤�鐤柡澶嬪焾濞兼牕鈹戦悩瀹犲缁炬儳鍚嬮幈銊ヮ潨閸℃鈷曢梺鐟板槻閸㈡煡鎮鹃敓鐘茬疇濠电姴鍊荤粔铏癸拷瑙勬礀閻栧ジ銆佸Δ浣哥窞閻庯綆鍋呴悵銊╂⒒閸屾瑧顦﹂柟纰卞亞缁瑦绗熼敓钘夌暦閵忋倖鍤冮柍鍝勫暟楠炴挸鈹戞幊閸婃洟骞婅箛娑欏亗婵炴垶鐔幏鐑界嵁閸喖濮庢俊銈囧Т閹诧紕绮嬪鍡愬亝闁告劏鏅濋崢鐢告倵閻熸澘顏繝銏∶嵄濠电姵纰嶉悡鍐煢濡警妯堟俊顖ゆ嫹婵°倗濮烽崑鐐垫暜閿熺姷宓佹俊顖溿�嬮幏鐑芥偨濞堣法鍔哥紓浣藉蔼濡嫰鍩為幋锔芥櫖闁告洦鍋傞弶顓㈡⒑缁嬪尅鏀婚柣妤佹礈閸欏懘妫呴銏″缂佸鍨规竟鏇㈠锤濡や讲鎷婚梺鍓插亞閸犳捇濡撮幒妤佺厸闁糕槅鍘鹃悾鐢告煛瀹�瀣М鐎殿噮鍣ｅ畷鎺懳旀担鍝ュ降闂傚倷娴囧銊х矆娴ｈ櫣鐭撻柣銏㈩焾缁犵偤鏌曟繛鍨姶婵炵鍔戦弻銊╂偄閻戞ɑ鐝┑鐐村灩閺佸摜鍒掑▎鎴炲珰闁规儳鎳愰幃濂告煙閸欏灏︾�规洜鍠栭、鏃堝幢濞嗘垶姣庨梻鍌氬�烽懗鍓佸垝椤栫偛绀夐柨鏃傛櫕椤╁弶绻濇繝鍌滃闁哄懏鎮傞弻銈夊箒閹烘垵濮㈡繝鈷�鍐粵妞ゃ劊鍎甸幃娆撳级閹存繍娼旈梻渚�娼ч悧鐐电礊娴ｅ摜鏆︽慨妤嬫嫹濠碘剝鐡曢ˇ瀵革拷瑙勬礀閻栫厧顫忓ú顏呭仭闁哄瀵ч崐顖炴⒑娴兼瑧绉靛ù婊庝簻閻ｅ嘲鈹戦崱鈺佹倯婵犮垼娉涢敃锕傚蓟瑜斿楦裤亹閹烘搫绱甸梺缁樺釜缁犳捇骞冮垾鏂ユ闁靛骏绱曢崢閬嶆煟韫囨洖浠掔紒鐘崇懇椤㈡棃宕奸悢鍛婎仧闂備礁鍚嬫禍浠嬪磿閾忣偅娅犻梺顒�绉甸悡銉╂煟閺冨浂鍤欑悮姘舵⒑缂佹ɑ顥旈柛鎾跺枛閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�
		if (title.titleid > 0){
			final fire.pb.title.SOnTitle onTitle = new fire.pb.title.SOnTitle();
			onTitle.roleid = roleid;
			onTitle.titleid = title.titleid;
			onTitle.titlename = title.titlename;
			role.sendAround(onTitle);
		}
		else{
			final fire.pb.title.SOffTitle offTitle = new fire.pb.title.SOffTitle();
			offTitle.roleid = roleid;
			role.sendAround(offTitle);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 732897;

	public int getType() {
		return 732897;
	}

	public long roleid;
	public fire.msp.showtitleinfo title;

	public GNotifyTitle() {
		title = new fire.msp.showtitleinfo();
	}

	public GNotifyTitle(long _roleid_, fire.msp.showtitleinfo _title_) {
		this.roleid = _roleid_;
		this.title = _title_;
	}

	public final boolean _validator_() {
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(title);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		title.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyTitle) {
			GNotifyTitle _o_ = (GNotifyTitle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!title.equals(_o_.title)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += title.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(title).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


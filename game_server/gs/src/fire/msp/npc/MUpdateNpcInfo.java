
package fire.msp.npc;

import fire.pb.map.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MUpdateNpcInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MUpdateNpcInfo extends __MUpdateNpcInfo__ {
	@Override
	protected void process() {
		// protocol handle

		new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				for (NpcInfo createinfo : npcs)
				{
					SceneNpcManager.getInstance().createAddNewNpc(createinfo);

				}

				// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦悡鏇㈡煙鐎电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樺殮閻熼偊鐓ラ柨鐔剁矙瀹曪繝骞庨挊澶庢憰濠电偞鍨惰彜闁哄閰ｉ悡顐﹀炊閵娿倗绻侀梺璺ㄥ枙婵倝銆冮崱娑樜﹂柛鏇ㄥ灱閺佸啴鏌曡箛瀣伄妞ゆ梹甯″鐑樻姜閹殿喖濡介梺鍦嚀濞差厼顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓炶摕闁搞儺鍓氶弲婵嬫煥閻斿墎鐭欑�规洘绻堥獮鎺楀箻閸撲緡鍟庨柣搴ｆ嚀婢瑰﹪宕伴弴鐘哄С闁煎鍊楃壕濂告煟濞嗗繑鍣界紒澶樺櫍閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾稖绠涢幘铏�┑顕嗙到鐎氭澘顫忛搹鍦＜婵☆垵娅ｉ悷銊╂⒑閸涘﹨澹樻い鎴濇喘楠炴垿濮�閻橆偅顫嶅┑鐐叉閸旀绮旈崼鏇熲拺闁告稑锕ョ�垫瑩鏌涘☉妯诲櫤缂侇喖鐭傞崺鐐哄箣閿旇棄锟界兘姊婚崼鐔衡槈濞寸姵锚椤啴濡舵惔鈥崇闂佺绻戦敃銏ゆ偘椤旂晫绡�闁搞儜鍜佸晪闂佽崵濮村ú锕傛偂閿熺姴鏋佹繝濠傚暊閺�浠嬪箳閹惰棄纾归柟鍓х帛閸ゅ嫰鏌涢锝嗙闁稿被鍔戦弻锕�螣娓氼垱孝闂佺尨鎷烽柤鎭掑劘娴滄粓鏌￠崘銊ワ拷濠氬箺閸岀偞鐓熼柟鐑樻尭閸斻倝妫佹径瀣瘈濠电姴鍊块妤�顭胯閸ㄥ磭妲愰幒妤�纾兼慨妯荤樂閵堝洨纾奸弶鍫氭櫅娴狅箓鏌曢崼顒傜М鐎规洘锕㈤崺鐐烘倷椤掞拷椤忔椽姊婚崒娆掑厡妞ゎ厼鐗撳鐢割敆閸曨剙娈炴俊銈忕到閸燁垶寮茬粙妫靛綊鎮╁顔煎壘濠碘槅鍋呴崹鍦閹烘鏁婇柤娴嬫櫅椤わ拷缂傚倷鐒﹂〃鍫ュ窗閺嶎厼鏋侀柟鎯ь嚟椤╃兘鎮楅敐搴″缂佷緤闄勭换婵嬪閿濆懐鍘梺鍛婃⒐閻楃姴顕ｉ弻銉晢闁告洦鍓涢崢閬嶆⒑閸濆嫭鍌ㄩ柛鏂挎湰閺呭爼顢涘☉姘鳖啎闂佸壊鍋嗛崰鎰閺屻儲鐓冮悷娆忓閻忥附顨ラ悙璇ц含闁哄本绋掔换婵嬪礃閳哄喚妲归柣搴ゎ潐濞诧箓宕规潏鈺嬫嫹娴ｅ啫浜归柨鐔诲Г缁嬫帡鏁嬮梺鍛婃尵閹虫捇鍩為幋锔藉�烽柛娆忣樈濡繝姊洪崷顓х劸妞ゎ厾鍏橀獮鍐灳閺傘儲鐎婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯烘诞缂佺姵鐗曢悾鐑筋敍閻愯弓绱堕梺闈涳紡閸滃啰搴婇梻鍌欐祰椤曟牠宕规惔銊ョ妞ゅ繐妫屽Λ銊х磽閸屾艾锟介娆㈤敓鐘茬獥婵°倕鎳忛崑锟犳煃鏉炴壆璐伴柛銈嗘礀閳规垿鎮╁畷鍥舵殹闂佺顑呯�氫即寮婚敐澶婄闁惧浚鍋呭畷鍐差渻閵堝棙鐓ユい锕傛涧椤繐煤椤忓懐鍔靛┑鐐村灦閿氱紒渚囧枛閳规垿鎮欓弶鍨殶闂佸憡鍔х徊楣冩倶娴ｅ壊娓婚柕鍫濇鐏忣亪鏌涢妸锔姐仢闁诡噯绻濋幃銏ゅ礂閼测晛骞楅梻浣告惈閸婂湱锟界瑳鍥х疅闁归棿鐒﹂悡娆撴煣韫囷絽浜濈紒锟介崼銏㈢＜閺夊牄鍔屽ù顕�鏌熼瑙勬珚闁圭厧缍婇、鏇㈠椤喚澶勯梻鍌氬�烽懗鍓佸垝椤栨稓鐟规俊銈呮噹闂傤垶鏌ㄥ┑鍡樺闁搞倖娲栭湁闁绘ê妯婇崕宀勬煥閻旇袚闁绘濮垫穱濠囨倻閽樺）銊╂煃鏉炴壆顦﹂柛娆忥攻娣囧﹪鎮欓鍕舵嫹閹达箑鍨傛繛宸簼閸嬪绻濇繝鍌滃缂佺姵鐓￠弻娑㈠即閵娿儳浠╅柟顖滃枛閹嘲顭ㄩ崟顓犵厐闁告椴搁妵鍕冀椤愵澀娌梺鎶芥敱鐢繝寮诲☉姘勃闁告挆鍕珮婵＄偑鍊х拋锝囩不閹捐钃熼柣鏂挎惈閺嬪牓鏌涘Δ鍐ㄤ粧缂併劌顭烽弻锝夊箻閸楃儑鎷峰┑瀣摕闁哄浄绱曢悿锟介柣搴秵娴滅兘骞忛悜钘夊嵆闁靛繒濮撮悗顓㈡⒑缁嬫寧婀扮紒顔肩Ч瀹曚即骞囬悧鍫㈠幗濠德板�ч幏鐑芥煟濡わ拷濡稓鍒掗鐑嗘僵闁煎摜鏁搁崢閬嶆煙閸忚偐鏆橀柛鈺佸閳绘捇寮撮悙鍐ㄩ叄瀹曟儼顧傞棅顒夊墮閳规垿鍨惧畷鍥х厽閻庤娲忛崝鎴︺�佸▎鎾崇缁炬澘褰夐悽濠氭⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋涚粻鏉库攽閻樺磭顣查柛瀣剁節閺屽秹宕崟顒�娅ｇ紓浣哄У閻楁绌辨繝鍥ч煫鍥ㄦ煥椤忓爼姊绘担鍝ユ瀮婵☆偄瀚拌棟妞ゆ牜鍋涢悡婵嬪箹缁懓鐏抽柣鏂垮悑閸嬪倿骞栫划鐟邦嚒闁靛ň鏅滈埛鎺楁煕鐏炲墽鎳呴柛鏂跨У娣囧﹪鎮欓崣澶婁淮閻庤娲忛崹铏圭紦閻ｅ瞼鐭欓柛顭戝枤瑜板淇婇悙顏勶拷鏍暜閹烘棑鎷峰鐓庡妞ゃ垹锕缁樻媴閸涘﹤鏆堝┑鐐额嚋缁犳挸鐣烽弶娆炬僵闁兼悂娼ф禒楣冩⒑鐠恒劌鏋嶇紒顔界懃椤繘鎼圭憴鍕瀭闂佸憡娲﹂崑鍕叏閵忋倖鈷戞慨鐟版搐閿熻姤娲栫叅妞ゆ挾鍋熼弳锔界箾瀹割喕绨奸柛濠勫厴閺岋綁骞嬮悙鍐╁哺楠炲繑绻濆顓涙嫼闂佺鍋愰崑娑㈠礉閿熶粙鏌ｈ箛鏇炰沪閻庢艾姘﹂ˇ瀵哥磼鏉堛劍灏伴柟宄版嚇閹煎綊鎮烽幍顕呭仹缂傚倸鍊峰ù鍥敋瑜斿畷顖涘閺夋垹顔夐梺闈涚箳婵參寮ㄦ禒瀣�甸柨婵嗙凹缁ㄤ粙鏌ㄥ☉娆戠煀闁宠鍨块、娆撳棘閵堝牞鎷烽幐搴濈箚妞ゆ劑鍎茬涵鑸典繆閸欏濮嶆鐐差儔閺佸倻鎲撮敐鍡楊伜婵犵數鍋犻幓顏嗗緤娴犲绠烘繝濠傜墛閺咁剛锟藉箍鍎卞Λ搴㈢濠婂牊鐓欓悗鐢殿焾娴狅妇绱掗敓鐣岋拷锝庡墾閹烽鎲撮崟顒傤槰濠电偛寮堕悧鐘诲箖妤ｅ啯鍊婚柦妯侯槺閸婄偛顪冮妶搴″箺闁搞劌澧庣槐鐐参旈崨顔规嫽婵炶揪绲介幉锛勬嫻閿熺姵鐓曢幖瀛樼☉閿熻姤绻堟俊鎾礃椤旂厧绐涘銈嗘⒒閸樠勬叏閸涘瓨鈷掗柛灞捐壘閿熺晫鍏橀幃鐐烘晜閹惧懏瀚圭紒妤佺☉閹冲繐鐣烽弻銉︾厱鐎癸拷閿熶粙宕戝☉姘变笉闁绘顕х粻瑙勭箾閿濆骸澧┑锛勫厴閺屻劑鎮㈢拠娈嬫捇鏌ｅΔ渚囨當妞ゆ洏鍎靛畷鐔碱敃閵堝棙鐣烽梻浣芥硶閸犳捇寮查锝囩彾闁哄洢鍨虹�电姴顭跨憴鍕畵缂傚秴锕顐﹀箛閺夎法鍊為梺鍛婃尫缁�浣规叏閻撳簶鏀介柣鎰皺閹界姷绱掗鑲╁ⅵ鐎规洩绻濋獮搴ㄦ寠婢跺孩鎲伴梻浣虹帛濮婂宕㈣缁牓宕熼娑氬帾闂佸壊鍋呯换鍐夊鍕╀簻闊洢鍎茬�氾拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹鑽ゅ垝椤栨稓鈹嶅┑鐘叉处閸婇攱銇勮箛鎾愁伒闁归鍏樺浠嬵敇閻旇渹缃曟繝鐢靛Т閿曘倝鎮ч崱娆忣棜缂備焦顭囩粻楣冩煙鐎涙鎳冮柣蹇婃櫊閺屾盯濡搁妷銉嫹閸ф钃熸繛鎴炵煯濞岊亪鏌涢幘妤嬫嫹婵☆偁鍔嶇换娑氾拷娑欘焽閻绱掗鑺ュ磳鐎殿喖顭烽崹楣冨箛娴ｅ憡鍊梻浣告啞閸旀垿宕濆畝鍕拷鏍拷锝庡枟閳锋垿姊婚崼鐔衡檨妞ゃ儳鍋ら幃浠嬵敍濞戣鲸鐤佹繝纰夌磿閺佽鐣烽悢纰辨晬婵ê宕獮鎰版⒒娴ｄ警鐒鹃柡鍫墰閸掓帞浠︾粵瀣闂侀潧艌閺呮粓鍩涢幋锔界厱婵犻潧妫楅顐︽煟韫囨稐鎲鹃柡灞剧洴閹晛鐣烽崶褉鎷版俊銈囧Х閸嬫盯宕锔癸拷锕傚Ω閳轰胶顦ㄩ梺缁樺姦閸撴瑧绱撻幘缁樷拻濞达綀娅ｉ妴濠囨煕閹惧绠為柍銉畵瀹曞爼顢楅敓钘壭ч弻銉︾厪濠㈣泛妫欏▍鍡涙煃闁垮绗掗棁澶愭煥濠靛棙鍣洪柛鐔哄仱閹綊骞囬崜浣虹槇闂佸搫鐬奸崰鏍箹瑜版帩鏁冮柨婵嗘噽閿涙捇姊绘担绛嬪殐闁哥姵鎹囧畷鏇㈡嚑椤掑倻澶勯梺浼欑到閻ジ鎯屽▎鎾寸厾闁归绀侀悘锟犳煙闊厼宓嗘慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍婵犵數鍋涢惇浼村礉閹存繄鏆﹀ù鍏兼綑缁犲鏌涢幘鍙夘樂缂佹顦版穱濠囧Χ韫囨洖鍩岄梺鍝ュ櫏閸ㄥ爼骞冮敓鐘插嵆闁绘梻绻濈花璇差渻閵堝棙灏甸柛鐘查叄閹﹢濡烽埡鍌滃幐闁诲函缍嗛崑鍡涘煢娓氾拷閺屾洟宕惰椤忣厽銇勯姀鈽嗘疁闁轰焦鎸荤粋鎺旓拷锝呯仛閺呯偤姊洪幖鐐插姉闁哄懏绮撻敐鐐哄即閵忥紕鍘甸梺璇″瀻閸涱喗鍠栧┑鐘愁問閸ㄩ亶骞愰幎钘夎摕婵炴垶菤閺�浠嬫煕閳╁喚娈樼憸鏉挎嚇濮婃椽妫冨☉杈ㄐ㈤梺鍝勬噺缁捇骞冮垾鏂ユ瀻闁规儳顕崣鍕椤愩垺绁紒鑼跺Г缁傚秴鈹戦崼顒佸閻熸瑥瀚粈锟介梺娲诲幖閸婂灝顕ｇ拠娴嬫闁靛繒濮烽崢鎾⒑閸撹尙鍘涢柛鐘崇墬閹便劑寮撮姀鈥筹拷鐢告煕椤垵浜濈紒鑸电叀閹顫濋銏犵ギ闂佺粯渚楅崳锝呯暦閸洦鏁嗗璺侯儐濞呭矂姊绘担渚劸閻炴凹鍋婂畷鎰板即閵忕姷鏌у銈呯箰閻楀﹪鍩涢幒鎳ㄥ綊鏁愰崼鐕佹闂佸憡姘ㄩ幊鎾诲煘閹达附鍊婚柛銉ｅ妼椤忓墎绱撻崒姘拷鎼佸磹閹间礁纾圭憸鐗堝笚閸ゅ苯螖閿濆懎鏆欓柣鎾寸箘閿熻棄绠嶉崕閬嵥囨导鏉戠柧闁哄被鍎查悡鏇熺節婵犲繑瀚归梺鐓庡暱閻栧ジ寮幘缁樺癄濠㈣泛顭弳銏㈢磽娴ｄ粙鍝洪悽顖涱殔椤曘儵宕熼銊﹀闁挎繂鎳愭禒娑㈡煟鎼达絽閲渆dure闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟濞兼瑩锝炲┑瀣殝婵炲牆灏呴幏鐑藉冀閵娧咁啎闁诲孩绋掗…鍥儗婵犲嫮纾界�广儱鎷戦煬顒傦拷娈垮枦椤曆囧煡婢舵劕顫呴柣妯兼暩閺夋悂姊婚崒姘拷鎼佹偋婵犲嫮鐭欓柟鐑橆殕閸婂墎锟藉箍鍎遍ˇ浼村煕閹寸姷纾奸悗锝庝簽娴犮垺銇勯幒瀣仾闁靛洤瀚版俊鎼佸Ψ椤栨繂鎯堥柣搴㈩問閸犳盯顢氳閸┿儲寰勬繝搴㈠兊濡炪倖鍔х徊鑺ュ垔娴煎瓨鈷掑ù锝囩摂閸ゅ啴鏌涢妸銉╁弰鐎规洘锕㈤崺锟犲礃閳哄﹥寤洪梻鍌氬�搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊х煁闁哄棙绮撻弻锝夊籍閸パ傛濠电偞鍨崹鍦矆鐎ｎ偁浜滈柡宥冨妿閵嗘帡鏌ｉ敐鍡椻枙婵﹤顭峰畷鎺戔枎閹烘垵甯俊鐐�ら崢濂告偋韫囨稑绠查柕蹇嬪�曠粻娑㈡煛婢跺骸鍔电悮婵嬫⒑鐠囨彃鍤辩紓宥呮瀹曟粌鈽夊杈╃劶婵犵數濮村ú锕傛偂濞嗘挻鍊甸柣銏☆問閻掗箖宕崫銉х＜闁绘劦鍓欓崝銈夋煏閸喐鍊愮�殿喖顭锋俊鎼佸煛閸屾矮绨婚梻浣告啞閹哥兘鎳楅崼鏇熷亗闁瑰墽绮埛鎴﹀级閻愭潙顥嬮柛鏂跨Ч閺岀喖鎮烽悧鍫濇灎閻庢鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
				pexecuteWhileCommit(new PExecuteAfterNpcCreate(npcs));
				return true;
			}
		}.submit();

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730397;

	public int getType() {
		return 730397;
	}

	public java.util.LinkedList<fire.msp.npc.NpcInfo> npcs;

	public MUpdateNpcInfo() {
		npcs = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
	}

	public MUpdateNpcInfo(java.util.LinkedList<fire.msp.npc.NpcInfo> _npcs_) {
		this.npcs = _npcs_;
	}

	public final boolean _validator_() {
		for (fire.msp.npc.NpcInfo _v_ : npcs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(npcs.size());
		for (fire.msp.npc.NpcInfo _v_ : npcs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.npc.NpcInfo _v_ = new fire.msp.npc.NpcInfo();
			_v_.unmarshal(_os_);
			npcs.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MUpdateNpcInfo) {
			MUpdateNpcInfo _o_ = (MUpdateNpcInfo)_o1_;
			if (!npcs.equals(_o_.npcs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npcs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npcs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


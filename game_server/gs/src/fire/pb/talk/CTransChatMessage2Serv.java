
package fire.pb.talk;

import fire.pb.HelpCountManage;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTransChatMessage2Serv__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTransChatMessage2Serv extends __CTransChatMessage2Serv__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if(fire.pb.talk.ChatChannel.isShutUp(roleId))
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锕傛⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樺啿浠梺闈涱槴閺呮粓寮插┑瀣厪濠㈣泛妫欏▍鍛浖閸涘瓨鈷戦柛娑橈攻婢跺嫰鏌涢妸銈呭祮鐎规洘锕㈤弫鎾寸鐎ｎ偀鎷洪梻鍌氱墛娑撶懓鈽夊顐ｅ媰闂佺粯鍔﹂崜锕傚疮閸ヮ剚鈷掗柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囨鎷烽敃鍌氶唶闁绘洑鐒﹂鏃堟⒑瑜版帗锛熼柣鎺炵畵瀵彃鈹戦崶銉ょ盎闂婎偄娲﹂幐鐐櫠閺囥垺鐓㈤柛鎰典簻閺嬫盯鏌＄仦璇插闁诡喓鍨藉畷顐﹀礋閹存瑥鐏紒杈ㄥ浮閺佹捇鎮惧畝瀣闁挎繂楠搁弸鐔兼煃闁垮娴柡灞剧洴椤㈡洟濡堕崨顔句簴闂備線娼уΛ娆戞暜閹烘绠掗梻浣虹帛閻熼亶骞忛悜鑺ョ厱婵炲棗绻愰弳娆愩亜椤愩垻绠荤�规洦鍋婂畷婵嬪磹閻斿壊浠╅梺鐟板槻椤戝懘鎮鹃悜钘夌倞妞ゅ繐瀚獮渚�姊婚崒姘拷椋庣矆娓氾拷楠炲鏁撻悩顕嗘嫹閸愵喖宸濋柡澶嬪灩閺屽牓姊虹粔鍡楀濞堟洟鏌涚�Ｑ勬珖闁跨喓鏅幊鎾讹拷姘煎幗缁旂喓锟斤綆鍠栫紒鈺伱归悩宸剱闁稿﹦鏁婚弻銊モ攽閸℃瑥鍤紓浣靛妺缁瑩寮诲☉妯滅喓绱掑Ο鐚存嫹閹邦厽鍙忓┑鐘插暞閵囨繄锟借娲忛崝宥囨崲濠靛纾兼慨锝嗗濞茬喎顫忓ú顏勫窛濠电姴瀚崳褎淇婇妶鍥ｉ柟顔煎�块崹楣冩晝閸屾氨鍊炲銈嗗釜閹风兘姊洪崡鐐村枠闁哄矉绻濆畷鍫曞煛娴ｈ鐦ｉ梻浣哥秺閺�鍗烆渻閽樺娼栭柧蹇氼潐閸忔粓鏌涘☉鍗炲箳婵顨婂铏圭矙濞嗘儳鍓辩紓浣割儐鐢绮氭潏銊х瘈闁搞儜鍜佹Н缂傚倷鐒﹂〃澶婎浖閵娧嗗С濠电姵纰嶉埛鎴︽煟閻旂厧浜伴柛銈囧枛閺屾稓锟斤綆鍋嗗ú鎾煙椤旀枻鑰块柛鈺嬬節瀹曟帒鈻庨幋鐘垫毎闂傚倷绀侀幉锟犳偡閵夆敡鍥敍濞戞瑥寮块梺鎼炲労閸撴岸鎮￠崘顔藉仭婵炲棗绻愰鈺呮煟韫囨搩鍤熼柨鐔凤拷鐕佹綈婵炲弶鐗犻幃銉︾附缁嬫寧鐎梺绋跨灱閸嬫稓绮堥崼銏″枑闊洦绋戝Ч鎻捗归悡搴ｆ憼闁抽攱甯￠弻娑氫沪閸撗勫櫙闂佺绻愰張顒勫Φ閸曨垼鏁囬柣鎰版涧閳敻鎮楀▓鍨灓闁轰礁顭烽妴浣肝旈崨顓狅紲濠电姴锕ら幊鎰板储椤栫偞鈷掑ù锝囩摂濞兼劙鏌涙惔銏犫枙妞ゃ垺宀搁、姗�鍩�椤掑﹥瀚归柛娑欐綑閻顭跨捄铏瑰缂併劌顭峰娲传閸曨厸鏋嗛梺绋款儏鐎氼厾绮嬮幒妤佹櫇闁稿本绋撻崢浠嬫⒑鐟欏嫬鍔ゆい鏇ㄥ幖鐓ら柟缁㈠枟閻撴盯鎮橀悙棰濆殭濠殿喖鍊块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�?1闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х棯閹岀吋闁哄矉缍侀獮鍥敊閼恒儲鐦庨梻浣规た閸樹粙鎮烽埡鍛亗妞ゆ劧绠戦悙濠囨煏婵炑嶆嫹婵℃彃鐗忕槐鎾寸瑹婵犲啫顏跺┑鐘灱閸╂牠宕濋弴鐘典笉閻熸瑥瀚粻楣冩煥濠靛棝顎楀褜鍠栭埞鎴︽晬閸曨偄浠樺銈傛櫅閵堢鐣烽妸鈺婃晣婵炴垶鐟﹂弶鍛婁繆閻愵亜锟芥牕顫忚ぐ鎺戝嚑缂備焦顭囬悷瑙勭箾閹存瑥鐏柣鎾存礋楠炴牗娼忛崜褏蓱闂佺粯甯楃�笛囧Φ閸曨垱鏅濋柨鐔绘閿曘垽鏌嗗鍡樻闂佺锕﹂崳銉ヮ焽閹邦厾绠鹃柛娆忣樈閻掍粙鏌℃笟鍥ф珝妤犵偞甯掕灃閻庯綆鍓涢埣銈嗙節閻㈤潧鈻堟繛浣冲浂鏁勯柟鐗堟緲閺嬩線鏌涢弴銊ュ幍濞存粍绮撻弻鐔煎级閸噮鏆㈢紓浣割槸閻栧ジ寮婚妶澶婄骇闁圭楠告禒鎾⒑閸濆嫮鐒跨紒杈ㄦ礃缁傛帡鏁傞悙顒�鐝伴梺鍦帛鐢晠鎮楅幎鑺モ拻濞达絽鎽滈弸鍐╀繆椤愩垹顏挊婵囥亜閺嶃劎绠樺ù婊�绮欏缁樻媴缁嬫寧鍊紓浣风劍閹稿啿顕ｉ幓鎺嗘婵炲棙鍔曞鍧楁煛婢跺﹦澧戦柛鏂挎捣瀵囨晸娴犲鈷戞慨鐟版搐閻忓弶绻涙担鍐插椤╃兘鏌ㄩ弴鐐诧拷褰掓偂濞嗘垹纾奸悗锝庡亜椤曟粓鏌涢悢鍝勪槐闁哄矉绻濆畷銊╁级鐠恒劌甯块梻浣筋嚃閸ㄥ崬螞閸愨晙绻嗛柟闂寸鍞悷婊冪箻瀵悂鏁撴禒瀣拻闁稿本鐟ㄩ崗宀�绱掗鍛仸闁靛棗鍟村畷銊э拷娑櫭禍杈ㄧ節閻㈤潧孝闁哥噥鍋婂畷褰掑籍閸喎锟界敻姊婚崼鐔衡檨闁规彃鎽滈惀顏堝箚瑜嬮崑銏ゆ煙椤旂瓔娈滈柡浣瑰姈閹棃鍨惧畷鍥跺晥缂傚倷鑳堕搹搴ㄥ矗閿熻姤绻涙径瀣创婵狅拷娓氾拷濮婅櫣绱掑Ο璇茬濠电偞鎸抽弨閬嶅疾閸洘鏅滈柤鎭掑劚瀵寧绻濋悽闈浶㈤柛鐕佸灦婵￠潧鈹戦崼顒佸閻熸瑥瀚径鍕煕鐎ｎ亷宸ラ柣锝囧厴閹垻鍠婃潏銊︽珖闂備焦瀵х粙鎴狅拷姘煎弮瀵弶绺介崨濞炬嫽闂佺鏈悷褔藝閿曞倹鐓欓悹鍥囧懐锛熷┑鐙呮嫹濞达綀娅ｇ壕钘夈�掑顒佹悙闁哄鍠栭弻锝夋偄閸欏鐝氶梺缁樹緱閸ｏ絽鐣烽崡鐐╂婵☆垳鍘ч敓鐣屽仱濮婃椽妫冨☉杈╁姼闂佺瀛╁钘夌暦閻㈢围濠㈣泛顑傞幏娲⒑閸涘﹦绠撻悗姘槻鍗辩憸鐗堝笚閻撴洟鏌曟繛鍨姢缂佸妞介幐濠傗攽閸ャ儰绨婚梺鍝勬祩娴滄繄锟芥氨鎳撻埞鎴︻敊绾攱鏁惧┑锛勫仩濡嫰鎮惧畡閭︽建闁跨喕妫勯悾鐑芥晲閸℃绐為柣搴秵娴滄粍绔熷澶嬧拻闁稿本鐟чˇ锕傛煙閼恒儳鐭掔�规洘濞婃俊鐑藉煛娴ｅ摜锟筋參姊洪崜鎻掍簼婵炲弶鐗滅划濠氬冀椤剚妫冮弫鎰板川椤撶喐顔夐梻浣虹帛鐢喖宕戦幇鐗堟櫢闁芥ê顦遍悾顓㈡煕鎼粹�宠埞閾荤偞绻涢幋娆忕仼闁稿被鍔戦弻鐔兼⒒鐎电濡介梺鎶芥敱閸ㄥ潡骞冭ぐ鎺戠畳闁圭儤鍨甸‖鍫濃攽閻愬弶鍣洪柛鏃�鐟╁濠氭偄閻撳海顦╅梺闈涚墕濡顢旈敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣妯兼暩閻掑ジ鏌ｆ惔顖滅У闁哥姵顨婇崺娑㈠箳濡や胶鍘卞銈嗗姂閸婃洟寮搁弮鍫熺厓缂佹鎼崝锔撅拷娈垮枛閻栧ジ宕洪敓鐘茬＜闁挎洑绶ら幏鐑藉箰鎼淬垹寮挎繝鐢靛Т鐎氼喚鏁☉銏＄厵鐎瑰嫮澧楅崵鍥╋拷瑙勬处閸嬪﹤鐣烽悢纰辨晣闁绘洑绀侀幃瀣⒒閸屾艾锟界兘鎳楅崼鏇炵疇闁规崘顕ч崥褰掓煛瀹ュ骸骞栫紒鐙�鍨堕弻銊╂偆閸屾稑顏�?
		if(funtype==FunModelType.FUN_TASKITEM){
			xbean.helpcount helpcount = xtable.Helpcount.select(roleId);
	    	int max=HelpCountManage.getInstance().getHelpItemNumMax(roleId);
	    	if(helpcount!=null&&helpcount.getHelpitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleId, 166087, null);
	    		return;
	    	}
		}
		if (funtype == FunModelType.QIU_ZHU) {
			xbean.helpcount helpcount = xtable.Helpcount.select(roleId);
	    	int max=HelpCountManage.getInstance().getHelpItemNumMax(roleId);
	    	if(helpcount!=null&&helpcount.getHelpitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleId, 166087, null);
	    		return;
	    	}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀�鍠栭獮鍡涘级閸熷啯鎹囬弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顕呮晜闁告侗鍙庢导鎾斥攽閿涘嫬浜奸柛濞垮�濆畷銏＄附閸涘﹤锟借埖绻濋棃娑冲姛濞存粈绮欏缁樻媴缁嬫寧鍊紓浣风劍閹稿啿顕ｉ幓鎺嗘斀閻庯絽楠稿ú顓€�佸☉銏″�烽柡澶嬪煀閹风兘宕归顐ｎ啍闂佺粯鍔樼亸娆愮閵忋倖鐓曢柡鍐挎嫹缁炬澘绉规俊鐢稿礋椤栨稒娅嗛梺鍓茬厛閸犳牜绮婇锟介幃妤冩喆閸曨剛顦ㄩ梺鎼炲妿閺佸宕洪悙鍝勭闁绘瑥鎳忕�氬綊鏌ㄥ┑鍡涱�楀ù婊呭仱閺屾稑螣缂佹ê纾抽梺鍝勫閸撴繂顕ラ崟顓濇勃闁瑰瓨甯楅崟鍐ㄢ攽閻橆喖鐏柟铏尭铻炴繛鎴欏灩缁狀垶鎮峰▎蹇擃仼妞ゆ洟浜堕幃妤�鈽夊▎妯煎姺闂佸憡锕㈡禍璺侯潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劥婢规绱撳鍜冨伐妞ゎ偄绻戠换婵嗩潩椤掑偊绱叉繝鐢靛仜濡瑩宕硅ぐ鎺撳仒闁靛繒濮弨浠嬫煟閹邦垱纭炬い銉ョФ閿熷�燁潐濞叉粓寮繝姘卞祦闊洦鍝庢禍褰掓煙閻戞ɑ灏ù婊勭矒濮婅櫣绱掑Ο璇茬濠电偛顕崗妯挎濡炪倖娲╅幏閿嬫叏婵犲懏顏犳繛鎴犳暬瀹曘劑顢欓崗濂告暘闂備浇宕垫慨鐢稿礉濡ゅ懎绐楅柡宥庡幖閺嬩線鏌熼崜褏甯涢悗鐢靛Т椤法鎹勬笟顖滃彋闂佸綊顥撻崗妯虹暦瑜版帩鏁婇柣鎰靛墯椤旀洖鈹戦悩缁樻锭闁稿﹤顭烽垾锕傚醇閵夈儳顢呴梺瑙勫劶婵倝鎮￠悢鍏肩厸闁稿本绋戦婊堟煙椤栨氨澧曢柍瑙勫灴椤㈡瑩鎳為妷銉嫹閹邦厽鍙忓┑鐘插鐢盯鏌熷畡鐗堝櫧缂侇喚鏁搁敓鏂ょ秵閸嬪棛绮旈悜鑺ョ厽閹兼番鍊ゅ鎰箾閸欏鑰块柍銉畵瀹曞爼濡歌濞叉悂姊鸿ぐ鎺擄紵缂佽绻濆顐﹀磼閻愬鍘卞銈嗗姧缁茶法绮婚幘缁樼厱閻庯綆浜炲瓭濡炪値浜滈崯瀛樹繆閸洖骞㈡俊銈呭暟閹冲棝姊虹拠鎻掝劉闁告垵缍婂畷锝夊礃椤旇偐鐣洪梺璺ㄥ枔婵挳宕￠幎鑺ョ厽闁哄啫娲﹂鐘炽亜閺冿拷濞茬喎顫忛搹鐟板闁哄洨鍋涢埛澶愭⒑閹稿氦澹橀柍瑙勫灴椤㈡瑩宕楅悡搴㈢亷闂備礁鎼惌澶岀礊閿熺晫绱掗悩宕囥�掗柨鐔告灮缂嶅棙绂嶅鍕弿闁靛繈鍨荤壕钘壝归敐鍕煓闁告繃妞介幃浠嬵敍濡ゅ瀚归柟棰佺濞堛劌顪冮妶鍡樼┛闁圭兘顥撻敓鍊燁潐濞叉鏁幒妤嬬稏婵犻潧顑愰弫鍡涙煥閻旂儤娅曠紒顔碱煼閺佹劖寰勭�Ｑ勫濠电偠鎻徊鍧楁偤閺冨牆鍚归柛鎰靛枟閻撴洟鏌曟繛鍨拷鏇炵暤閸℃瑱鎷风憴鍕闁搞劏娉涢锝夊醇閺囩偟顓洪梺缁橆焾濞呮洟顢欓弴銏♀拻濞达綀娅ｇ敮娑欐叏婵犲偆鐓奸柛鈺傜洴瀹曞ジ濡烽妷锔撅拷顒勬⒑缁嬭法鐏遍柛瀣仱閹繝寮撮悢铏诡啎闂佺懓鐡ㄧ换鍌炴嚋鐟欏嫷娈介柣鎰嚟婢ц京绱掓潏銊ユ诞濠碘剝鎮傞弫鎰板川椤撶倫鏇熺節濞堝灝鏋涢柨鏇閸掓帡顢涢悙鑼唵闂佸憡绋掑娆忣啅濠靛棌鏀介柣妯诲絻閿熺晫鎳撻埢鎾愁潨閿熻棄顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑濞茶骞栨い锕備憾楠炴垿濮�閻橆偅鏂�闂佺硶鍓濋悷锕�鈻撻幆褉鏀介柣妯款嚋瀹搞儵鏌涢悢鍝勨枅鐎殿喓鍔嶇粋鎺旓拷锝庡亜閿熺晫鏁婚弻銊モ攽閸℃侗锟芥霉濠婂嫮鐭掗柡灞剧洴楠炴鎲撮崟顓炴锭缂傚倷鑳剁划顖炴儎椤栨凹鍤曢柛顐ｆ礀缁狅絾绻濋棃娑欐悙闁跨喓鐡旈崹浼村煘閹达附鍊烽柟缁樺笚閸婎垶姊洪懡銈呮殌闁告侗鍘奸悘濠囨⒑閸撴彃浜為柛鐘叉捣濞嗐垽鎮欓悜妯煎幍闂備緡鍙忕粻鎴︾嵁濮楋拷閺屾稑螣缂佹ê纾冲┑顔硷龚濞咃絿妲愰幒鎳崇喖宕归鍛棨闂傚倷绀侀浠嬪级閸噮鐎烽梻浣芥硶閸犳洘鎱ㄩ妶鍡欌攳婵炲樊浜风紞鏍ь熆鐠虹儤婀扮�规洖寮剁换娑㈠箣濞嗗繒浠鹃梺鍝勬噺閻擄繝寮诲☉妯锋闁告鍋為悘宥夋⒑鐠団�虫灍闁荤啿鏅涢～蹇撁洪鍕唶闁瑰吋鐣崹褰捤囬埡鍌滅閻庢稒顭囬惌銈吤瑰搴濋偗妤犵偛鍟�靛ジ骞栭鐔告珨闂備浇娉曢崰宥囧垝濞嗗浚鍤曟い鎰剁畱缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?
			new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					xbean.RoleRecourse roleRec = xtable.Rolerecourse.get(roleId);
					if (roleRec == null) {
						roleRec = xbean.Pod.newRoleRecourse();
						xtable.Rolerecourse.insert(roleId, roleRec);
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑鍡╁殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囨⒒缁辨挻鎷呴悾灞界墯闂佺锕ュú婵嬫倶閸愵喗鈷戦柟绋挎捣缁犳捇鏌熼崘鏌ュ弰鐎殿喗濞婇幃娆撴倻濡厧骞堝┑鐘垫暩婵潙煤閿曪拷閳藉顦规俊顐＄劍瀵板嫰骞囬鐘插箺婵犵妲呴崹鎶藉磿閵堝鐓濋柡鍥ュ灪閻撴洟骞栨潏鍓х？缂佺姴纾槐鎺撴綇閵娿儲璇為梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆簼绨芥い锔芥緲椤啴濡堕崱妯烘殫婵犳鍠氶崗姗�寮鍜佺叆闁割偆鍟块幏娲⒒閸屾氨澧涘〒姘殜閹偞銈ｉ崘鈺冨幈闁瑰吋鐣崹褰掑煝閺囩偐鏀介柍鈺佸暞缂嶆垶銇勯銏㈢缁℃捇鏌ｉ鍕攳
					xbean.TaskRecourse taskRec = roleRec.getRecoursetask().get(taskid);
					if (taskRec == null) {
						taskRec = xbean.Pod.newTaskRecourse();
						roleRec.getRecoursetask().put(taskid, taskRec);
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠婚柡浣规崌閹崇偤濡疯閺嬫棃姊洪崫鍕櫤缂佽瀚板畷姘跺箳閹存梹鐎婚梺瑙勫劤绾绢參顢欐繝鍌楁斀閹烘娊宕愰幘缁樺�块柨鏇嫹闁宠绉瑰顕�宕奸悢鍙夊闂備胶顭堥張顒勬偡閵娾晛绀傞悘鐐板嫎娴滄粍銇勯幘璺轰户濠⒀嶉檮閵囧嫰濮�閿涘嫬鈷岄悗瑙勬磸閸旀垿銆佸☉姗嗙叆闁告侗鍨扮敮顒勬⒒閸屾瑧鍔嶉柣顏勭秺瀹曡绻濆顒佺�梺褰掓？閻掞箓宕曞Δ浣瑰弿婵☆垰鐏濋悡鎰版煃闁垮鐏﹂柕鍥у楠炴帡鎮欓弶鎴紦缂傚倸鍊风粈渚�藝娴兼潙绠伴柟鎯版缁犳牠鏌ｉ幇顖ｆ⒖婵炲樊浜堕弫鍌炴煕濞戝崬鐏犳鐐茬墦濮婄粯鎷呯粵瀣秷濠电姰鍨洪敃銏ゅ箠閻旂⒈鏁嶉柣鎰皺閻ゅ洭姊虹憴鍕凡闁告瑦鎹囧畷鍫曨敆娴ｈ顏熼梻浣芥硶閸ｏ箓骞忛敓锟�
					if (!taskRec.getChannellist().contains(Integer.valueOf(messagetype))) {
						taskRec.getChannellist().add(messagetype);
					}
					
					return true;
				}
			}.submit();
		}
		
		boolean flag=ChatChannel.getInstance().process(roleId, messagetype, message, checkshiedmessage, displayinfos, 0);
		if(flag==true&&(funtype==FunModelType.FUN_DIELIVE_CLAN||funtype==FunModelType.FUN_DIELIVE_WORLD)){
			MessageMgr.sendMsgNotify(roleId, 162127, null);
		}
		if(flag == true && funtype == FunModelType.QIU_ZHU) {
			SChatHelpResult snd = new SChatHelpResult();
			snd.result = 0;
			gnet.link.Onlines.getInstance().send(roleId, snd);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 792433;

	public int getType() {
		return 792433;
	}

	public int messagetype; // 消息频道 MsgTye中所定义的部分
	public java.lang.String message; // 内容
	public java.lang.String checkshiedmessage; // 检测屏蔽字的纯文本
	public java.util.ArrayList<fire.pb.talk.DisplayInfo> displayinfos; // 显示道具、宠物、技能
	public int funtype; // 功能类型  类型编号对应FunModelType
	public int taskid; // 任务id

	public CTransChatMessage2Serv() {
		message = "";
		checkshiedmessage = "";
		displayinfos = new java.util.ArrayList<fire.pb.talk.DisplayInfo>();
	}

	public CTransChatMessage2Serv(int _messagetype_, java.lang.String _message_, java.lang.String _checkshiedmessage_, java.util.ArrayList<fire.pb.talk.DisplayInfo> _displayinfos_, int _funtype_, int _taskid_) {
		this.messagetype = _messagetype_;
		this.message = _message_;
		this.checkshiedmessage = _checkshiedmessage_;
		this.displayinfos = _displayinfos_;
		this.funtype = _funtype_;
		this.taskid = _taskid_;
	}

	public final boolean _validator_() {
		for (fire.pb.talk.DisplayInfo _v_ : displayinfos)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(messagetype);
		_os_.marshal(message, "UTF-16LE");
		_os_.marshal(checkshiedmessage, "UTF-16LE");
		_os_.compact_uint32(displayinfos.size());
		for (fire.pb.talk.DisplayInfo _v_ : displayinfos) {
			_os_.marshal(_v_);
		}
		_os_.marshal(funtype);
		_os_.marshal(taskid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		messagetype = _os_.unmarshal_int();
		message = _os_.unmarshal_String("UTF-16LE");
		checkshiedmessage = _os_.unmarshal_String("UTF-16LE");
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.talk.DisplayInfo _v_ = new fire.pb.talk.DisplayInfo();
			_v_.unmarshal(_os_);
			displayinfos.add(_v_);
		}
		funtype = _os_.unmarshal_int();
		taskid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTransChatMessage2Serv) {
			CTransChatMessage2Serv _o_ = (CTransChatMessage2Serv)_o1_;
			if (messagetype != _o_.messagetype) return false;
			if (!message.equals(_o_.message)) return false;
			if (!checkshiedmessage.equals(_o_.checkshiedmessage)) return false;
			if (!displayinfos.equals(_o_.displayinfos)) return false;
			if (funtype != _o_.funtype) return false;
			if (taskid != _o_.taskid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += messagetype;
		_h_ += message.hashCode();
		_h_ += checkshiedmessage.hashCode();
		_h_ += displayinfos.hashCode();
		_h_ += funtype;
		_h_ += taskid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(messagetype).append(",");
		_sb_.append("T").append(message.length()).append(",");
		_sb_.append("T").append(checkshiedmessage.length()).append(",");
		_sb_.append(displayinfos).append(",");
		_sb_.append(funtype).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


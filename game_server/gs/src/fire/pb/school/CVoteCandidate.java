
package fire.pb.school;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVoteCandidate__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟缁嬫鍚嬪璺侯儏娴犲ジ姊虹紒妯虹仼闁烩剝妫冨顐﹀幢濡炴洖缍婇弫鎰板幢濡晲铏庢繝纰夌磿閾忓酣宕抽敐鍜佹綎婵炲樊浜滄导鐘绘煕閺囥劌浜濇繛鍫弮濮婅櫣绮欓崠锟犵反閻庤娲滈弫鎼佸礆閹烘挾绡�婵﹩鍓涢惈鍕⒑閸撴彃浜為柛鐘虫崌瀹曘垺绂掔�ｎ偀鎷洪梺鍛婄箓鐎氼剟寮冲▎鎾寸厽婵°倧鎷烽柨鏇樺劤缁顓兼径濞⒀囨煕閵夈垺娅囬柨娑欑矒濮婅櫣鎲撮崟顐ょシ濡炪倖鍨靛ú銊у垝閺冨牜鏁嬮柨鐔剁矙瀵鏁嶉崟顏呭媰闂佸憡鎸嗛崟顐㈢仭闂傚倷鑳剁涵鍫曞疾濞戞熬鎷峰顓熺凡闁伙絽鍢查～婊堟晸閼恒儰绻嗛柟闂寸鍞梺鎸庢⒒閸嬫捇锝炲鍫熲拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁閺嶎収鏁冮柍鎯板Г閻╊垶銆佸锟芥慨锟介柣妯活問濡茶埖绻濋悽闈涗沪闁割煈鍨跺畷鐟懊洪鍕煣闂佸綊妫块悞锕傛偂閻斿吋鐓ユ繝闈涙閸ｄ粙鏌ｉ幒妤冪暫闁哄矉绻濆畷鍗炍熼懖鈺冨帨闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愮紓鍌欑劍閸旀牠銆冩繝鍥ц摕闁炽儲鍓氶崥瀣箹缁櫢鎷烽崘宸妧闂傚倷娴囧銊х矆娴ｇ尨鎷峰顐㈠祮鐎殿喛顕ч埥澶愬閻橀潧濮堕梻浣侯焾缁诲棝寮插鍫濆瀭闁割煈鍠氶弳锕傛煥濠靛棛澧㈤柣銈忔嫹婵犵數鍋為崹鍫曟偡瑜斿畷銏ゆ焼瀹ュ棌鎷洪梻鍌氱墛娓氭危閸洘鐓曢柕濞垮劜閹牓鏌嶇拠鑼х�规洖鐖奸、妤佹媴閸濆嫬绠哄┑锛勫亼閸婃牠骞愰崼鏇炵鐎广儱娴勯幏宄邦潩閻愵剙顏�?
 * @author changhao
 *
 */
public class CVoteCandidate extends __CVoteCandidate__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole prop=new fire.pb.PropRole(roleid,true);
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠嶇划娆撳箖閸ф鏁婂┑顔藉姃缁ㄥ姊虹憴鍕凡闁绘牜鍘ч‖濠囶敋閿熶粙寮诲☉姘炬嫹閿濆簼鎲炬俊顖ゆ嫹闂備礁鎼惌澶岀礊娓氾拷閻涱喖顫滈敓钘夌暦濡警鍟呮い鏂垮悑閺嗘柨鈹戦悩鍨毄闁稿鍋ゅ畷褰掝敍閻愭彃鐎梺闈╁瘜閸樼偓绋夊鍚ゅ綊宕楅崗鑲╃▏缂備胶濮寸紞濠傤嚕閸洖閱囨繝闈涙閹稿啴鎮楅惂鍛婂濠电偞鍨崹娲偂濞戙垺鍊甸柨婵嗛娴滅偛顭胯閺佸寮婚悢纰辨晩缂佹稑顑嗛悿渚�姊虹紒妯圭繁闁革綇绲介悾鐤亹閹烘繃鏅╅梺缁樻尭鐎垫帒顭囧☉銏♀拻闁稿本鐟ㄩ崗宀勬煙閾忣偅宕岀�规洘鐓″濠氬Ψ椤旇姤娅堝┑鐘灱濞夋盯鏁冮敃鍌氭辈闁挎洖鍊归悡鐔兼煏韫囨洖校闁哥喓鍋ら弻锟犲川椤旇棄锟芥劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱� by changhao
		if(!fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkCanVote(System.currentTimeMillis()))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190072, null);
			return;
		}
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠妤冿拷瑙勬处閸撴盯宕ｉ崨瀛樷拺闂傚牊渚楅悡顓㈡偣閹邦喖鏋戠紒鍌涘笒椤繈鎳滈悽闈涘箞闂備礁缍婇崑濠囧礈濮樿泛鐓濋柡鍥ュ灪閻撶喖鏌￠崒娑橆嚋妞ゃ儯鍨介弻鐔碱敊濞嗙偓缍堥梺闈涚墳缁犳捇鐛幇顓熷劅妞ゆ棁顕ч幗瀣⒒閸屾瑨鍏岀紒顕呭灣閺侇喖螖閸涱厾鐣洪梺绋跨灱閸嬫盯鎷戦悢鍏肩叆婵犻潧妫欓崳铏繆閹绘帞澧涚紒缁樼洴瀹曞崬螣閸濆嫷娼撶紓浣哄亾濠㈡绮旈幘顔癸拷鏃堝礃椤斿槈褔骞栫划鐧告嫹瀹曞浂鍟囧┑鐘垫暩閸嬫盯鎯冮悜鑺ユ櫢闁芥ê顦遍敍宥夋煛閸☆厾鐣遍柍瑙勫灴瀹曟帒顭ㄦ惔锝呭Ъ婵°倗濮烽崑鎴﹀垂閻戞鈹嶅┑鐘叉搐鍥撮棅顐㈡处閺屻劑顢旈崼鏇熲拻濞达綀濮ょ涵鍫曟煕閻樿櫕绀�閾荤偤鏌涢弴銊ョ仚闁跨喐鏋荤粻鎾诲箖濠婂牊瀵犲璺虹灱閺嬪啯绻濋悽闈涒枅婵炰匠鍥舵晞闁告侗鍨抽惌鍡涙煕椤愮姴鐏柛鐘冲姍閻擃偊宕堕妸锔绢槬濡炪們鍎查懝楣冨煘閹达箑纾兼慨姗嗗幖閺嗗牓姊虹紒妯诲蔼闁稿海鏁诲濠氭晲婢跺﹤宓嗛梺缁樺姌椤曟粓骞忛悜钘夋嵍妞ゆ挶鍔嶇�氳鎱ㄥΟ鐓庝壕閻庢熬鎷�?50缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄本娲熷畷鐓庘攽閹邦厜锔剧磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
		if(prop.getLevel() < SchoolConst.TOUPIAO_MINLEVEL)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190080, null);
			return;
		}
		
		long value = prop.getProperties().getHistorymaxprofessioncontribute();
		
		if (value < 100) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ц箛锝呬簼闁绘縿鍔嶇换婵嬫偨闂堟刀銉︺亜閿濆牊顥夐崡閬嶆煕濞戞瑦缍戠痪鎯ь煼閺屾稑鈽夊▎鎴炴闂佽法鍠曞Λ鍕疮椤栨凹鍤楅柛鏇ㄥ灠缁犳稒銇勯幋鏃�娅旂紒鐘虫崌瀵鎮㈤崗鐓庝罕闂佸壊鍋嗛崰鎾诲礄閿熺姵鈷掑ù锝囶焾閼歌绻涘顔煎籍鐎殿喖顭烽弫鎾绘偐閼碱剙锟界偤姊虹�圭姵銆冮柣鎺炵畵閹鎷犲ù瀣杸闂佺粯鍔樼亸娆愭櫠閺囩姷纾肩紓浣癸公閼拌法锟芥鍠栭…鐑藉极閹版澘閱囬柕蹇嬪灪濠㈡垿姊绘担鍛婃儓婵炲眰鍔戝畷鎴濐潨閿熻棄鐣烽鈶芥棃宕ㄩ瑙勫缂傚倷绀侀鍡涱敄濞嗘挸纾块柟鎵閻撴洟鏌￠崘鎸庡闂佽崵鍟块弲鐘绘偘椤曪拷瀹曟﹢顢欓挊澶夌棯婵＄偑鍊栭悧妤冩箒濠殿喛顫夐〃濠傤潖濞差亜鎹舵い鎾跺仜婵℃椽姊洪崷顓х劸闁硅绱曠划瀣箳濡ゅ﹥鏅梺缁樺姉鐞涖儵骞忓ú顏呯厽闁绘柨鎽滈幊鍐倵濮樼厧骞樻繛鍡愬灲楠炴捇骞掑┑鍫濇暩闁荤喐绮岀粔鎾箒闂備礁鐏濋鍥偟閸洘鐓涢柛銉ｅ劚閻忊晠姊虹憗銈咃拷鏍ㄧ┍婵犲洤围闁告洦鍙庡Σ顕�姊虹捄銊ユ灆婵☆偄瀚伴幃銉︾附閸涘﹤浜楀銈嗗姧缁犳垿鎮欐繝鍥ㄧ厪濠电姴绻愰々顒併亜閿斿搫鍔滅紒缁樼〒閿熺晫鏁搁…鍫ヮ敁閹惧墎纾奸柣妯挎珪瀹曞瞼锟芥鍠栭…鐑藉箖閵忋垹鏋堥弶鍫涘妽濞呮牗绻濋悽闈涗沪闁搞劌鐖奸幃鐑筋敍濮ｅ吋鐩畷姗�顢欑憴锝嗗闂佸搫顦遍崑鐐寸珶閸℃蛋鍥晝閸屾稓鍘遍梺缁樻磻缁�渚�鎮橀敐鍥╃＜妞ゆ洖鎳庡顕�鏌熼鍝勭伈闁诡喒鍓濋幆鏃堟晲閸滃啯瀚归柣鎰劋閳锋垿姊婚崼鐔惰吂婵炴垯鍨瑰婵囥亜閹捐泛浠ч柣锝変憾濮婂宕掑顒婃嫹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极瀹ュ鐓熼柟閭﹀幗缂嶆垵霉濠婂棝鍝虹紒缁樼箞閹粙妫冨ù韬插灪缁绘稓浠﹂崒姘炬嫹濡や胶鐝堕柡鍥ュ灩闁裤倖淇婇妶鍕厡闁告鏁诲铏规嫚閳ュ磭浠繝鈷�鍕垫疁閽樼喎顭块懜闈涘闁绘挻鐩弻娑㈠即濡や焦鐝旈梺鍛婃缁犳捇寮婚敍鍕勃閻犲洦褰冮～鍥⒑鐠団�虫灁闁稿﹥绻傞悾鐑藉箳閹存梹顫嶅┑顔筋殔濡梻妲愰敓锟�100闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗙墛椤忕姷绱掗敓鑺ョ節閸屾鏂�闂佺粯蓱瑜板啯绂嶉悙鐑樼厽闁圭儤姊瑰▍鏇㈡煙閸欏鎽冪紒鐘崇洴瀵挳鎮欓懠顑垮枈闂傚倷绀侀幖顐﹀疮椤愶附鍋嬪┑鐘叉搐绾剧懓鈹戦悩宕囶暡闁绘挶鍨烘穱濠囶敍濞嗘帩鍔呭┑陇灏欓崕銈夊Φ閸曨喚鍞╅梺鍛婂姧缁查箖寮敓鑺ヤ繆閻愵亜锟芥牕顫忔繝姘仱闁哄倸绨遍弸鏃堟煥濠靛棭妲归柣鎾寸懇閺岋綁骞嬮敐鍛呮捇鏌℃担浠嬪摵闁靛洤瀚版俊鎼佹晲閸涱厼袝闂備浇顕栭崰妤呮偡閳轰緡鍤曞┑鐘宠壘鍞梺闈涱槶閸庡崬顕ｉ悜鑺モ拺閻犲洦褰冮銏°亜閺冿拷閻楃姴鐣烽弶璇炬棃宕ㄩ鐙�鍞堕梻浣筋潐閸庣厧螞閸曨厾涓嶉柡宥庡幗閻撳啴鏌涘┑鍡楊仾濠殿垰銈搁弻鈩冩媴闂堚晞鍚┑顔硷工椤嘲鐣烽幒鎴僵閺夊牄鍔嶉崰鏍⒒娴ｅ憡鎲稿┑顖涙尦楠炲繘鏁撻敓锟� by changhao
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190076, null);
			return;
		}
				
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閳哄懏鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃顏堝箠閻愬搫唯鐟滃繗銇愰悙顒傜瘈闁汇垽娼у瓭濠电偛鐪伴崐婵嬪箖閸ф鏁嬮柨鐔剁矙瀵鈽夊Ο閿嬵潔濠碘槅鍨伴崥瀣箟婵傚憡鈷戠紓浣股戠亸闈涒攽椤旀儳鍘撮柟顖ゆ嫹濡炪倕绻愰悧鍡欑棯瑜旈弻娑⑩�﹂幋婵囩仌闂佺硶鏅濋崑鐐垫崲濠靛鐓曢柨鐔剁矙瀹曟帒顫濋鍌樺仏闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝夛拷娑氱畾闂佺粯鍨煎Λ鍕暜闂備焦瀵уú鈺呭箯闁垮绠鹃柛顐ゅ櫏濞堟粍鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敇閻樿京绀冮梻鍌欑閹芥粍鎱ㄩ悽鍛婂亱闁绘宕靛畵浣糕攽閻樻彃浜為柣鎾卞劦閺屾盯顢曢敐鍥╃暤闂佽瀵掗崢濂糕�旈崘顔嘉ч柛鈩冾殔椤洭姊虹粙娆剧劸闁稿﹥娲栧畵鍕⒑閸撴彃浜濇繛鍙夛耿閸╂盯骞掗幋娆欐嫹閹烘埈娼╅柣鎰靛墮椤忚埖绻濋悽闈涗粧闁告牜濞�瀹曞爼濡搁妷銈囩秿闂傚倷鑳剁划顖炲礉閺囥垹绠规い鎰╁�楁稉宥嗐亜閺嶎偄浠﹂柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐 by changhao
		if(fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkAlreadyVote(roleid))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170014, null);
			return;
		}

		new fire.pb.school.shouxi.PVoteCandidate(roleid,candidateid,shouxikey).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810436;

	public int getType() {
		return 810436;
	}

	public long candidateid;
	public long shouxikey;

	public CVoteCandidate() {
	}

	public CVoteCandidate(long _candidateid_, long _shouxikey_) {
		this.candidateid = _candidateid_;
		this.shouxikey = _shouxikey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(candidateid);
		_os_.marshal(shouxikey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		candidateid = _os_.unmarshal_long();
		shouxikey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CVoteCandidate) {
			CVoteCandidate _o_ = (CVoteCandidate)_o1_;
			if (candidateid != _o_.candidateid) return false;
			if (shouxikey != _o_.shouxikey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)candidateid;
		_h_ += (int)shouxikey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(candidateid).append(",");
		_sb_.append(shouxikey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CVoteCandidate _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(candidateid - _o_.candidateid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(shouxikey - _o_.shouxikey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


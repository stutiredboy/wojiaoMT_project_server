
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqQuestion__ extends mkio.Protocol { }

/** 向NPC请求问题
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqQuestion extends __CReqQuestion__ {
	@Override
	protected void process() {
		// protocol handle
		final long	roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (!validate(roleid)) {
			return;
		}
//		final fire.pb.mission.schoolanswerques.PReqQuestion pReq=new fire.pb.mission.schoolanswerques.PReqQuestion(npckey, roleid);
//		pReq.submit();
	}
	protected boolean validate(long roleid) {

		if (roleid < 0)
			return false;
//		if (xtable.Properties.select(roleid).getLevel() < 10)
//			return false;
		// TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欑粈鍐┿亜閺囧棗娲ら悡姗�鏌熸潏楣冩闁稿鍔欓弻娑樷枎韫囷絾效闂佽鍠楅悷褏妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓炶摕闁搞儺鍓氶弲婵嬫煥閻斿墎鐭欑�规洘绻堥獮鎺楀箻閸撲緡鍟庨柣搴ｆ嚀婢瑰﹪宕伴弴鐘哄С闁煎鍊楃壕濂告煟濞嗗繑鍣界紒澶樺櫍閺屸�崇暆鐎ｎ剙鍩岄柧浼欑秮閺屾稖绠涢幘铏�┑顕嗙到鐎氭澘顫忛搹鍦＜婵☆垵娅ｉ悷銊╂⒑閸涘﹨澹樻い鎴濇喘楠炴垿濮�閻橆偅顫嶉梺闈涚箳婵兘顢欓幒妤佺厽閹艰揪绲鹃弳鈺傘亜椤撶偟澧︾�殿喗濞婇弫鎾绘偐閺傘儲瀚奸梻渚�娼荤�靛矂宕㈡總绋垮偍閻庢稒菧娴滄粓鏌曟径娑㈡鐎规洖鐭傞弻鈩冩媴鐟欏嫬纾抽悗瑙勬礃閸旀瑩骞冮妶鍡樺闁革富鍘惧暩婵犵數濮烽弫鎼佸磻濞戞﹩鍤曢柛鎾茬劍瀹曟煡鏌涢鐘插姕闁哄懏鐓￠弻锝夊箛椤撶喓绋囩紓浣稿閸嬬喖鏁撻悾灞绢仧闁归鍏橀弻銊╂偄閸撲胶鐓撻梺璇″灠閺堫剙顕ラ崟顖氱疀妞ゆ挾濮撮獮宥夋⒒娴ｈ櫣甯涢柛銊﹀劶閹筋偄顪冮妶鍐ㄥ姕闁绘濞�瀵鎮㈤崜鍙壭ч柟鑲╄ˉ閿熻棄鍟跨粻锝夋⒒娴ｈ姤銆冮柣鎺炵畵瀹曟繈寮介鐐电暰闂佸搫鍊哥花閬嶅绩娴犲鐓曟い鎰剁悼缁犳挻鎱ㄩ敐鍛闁宠鍨块弫宥夊礋椤愨剝婢�闂備胶顭堥敃銉╁垂閸喚鏆﹂柡鍥ュ灪閸ゆ垶銇勯幒宥囶槮閹兼潙锕铏圭矙鐠恒劎浼囬梺绋款儐閸旀瑩寮幘缁樺殟闁靛瀵屽Λ鍐倵鐟欏嫭绀冮柨鏇樺灲閵嗕礁鈻庨幘鍐茬哎婵犮垼顕栭崹鏉棵洪敃鍌涘亗闁哄洢鍨洪悡鍐煃鏉炴壆顦︽鐐瓷戦妵鍕疀閹捐泛顣哄┑顔炬嚀瀵埖绌辨繝鍥ч柛鏇ㄥ枛閸橈紕绱撴担鍙夘潐闁圭兘鏀辩换婵嬫偨闂堟稐绮堕梺缁橆殔濡繈骞冨Ο琛℃斀閻庯綆浜滈崵鎴濃攽閻愭潙鐏﹂柣鐕傜稻缁傚秴顭ㄩ崼鐔哄幐闂佹悶鍎崕杈ㄤ繆閼测晪鎷峰▓鍨珮闁哥姵顨婇妴鍐Ψ閳哄倸锟界兘鏌ょ喊鍗炲妞ゆ梹鍨垮娲濞戞瑥顦╅梺鍛婃⒐閻熲晠鎮伴锟介獮鎺懳旈敓鐣岀不婵犳碍鐓曢煫鍥ㄦ尰閸ｄ粙鏌ｉ埡渚�鍙勬慨濠傤煼瀹曟帒鈻庨幒鎴濆腐婵＄偑鍊ら崢濂告偋韫囨稑绠查柕蹇嬪�曠粻铏繆閵堝繑瀚归梺绋胯閸斿酣骞夐幖浣哥睄闁割偅绻冮悗顒勬⒑閻熸澘鈷旂紒顕呭灦瀹曟垿鍩￠崨顔硷拷鍫曟煟閹扮増娑уù婊呭亾閹便劑鏁愰崨顓т純濠殿喖锕ら幖顐ｆ櫏闂佹悶鍎滈崘銊愩倕鈹戦悙鑼憼缂侇喚濮电粋宥夘敂閸惊銉ッ归敐鍛棌婵炵鍔戦弻銊╂偄閸撲胶鐓撳Δ鐘靛仜閸燁偊鍩㈡惔銊ョ鐎规洖娲悰鎾绘⒒娴ｇ儤鍤�妞ゆ洦鍙冨畷鏇㈠箛椤撶媭娴勫銈嗘尵婵澹曟禒瀣厱閻忕偛澧介幊鍡涙煕韫囨挾鐒搁柡灞熷棛鐤�闁规崘顕у浼存倵鐟欏嫭绌跨紓宥勭閻ｅ嘲顫滈敓浠嬨�侀弮鍫濆耿闁哄洨濮烽幉褰掓⒒閸屾瑧顦﹂柟纰卞亞缁瑦绗熼敓钘夌暦閵忥紕闄勯柛娑橈工閻濇棃姊虹紒妯荤叆闁告艾顑夐幃锟犳偄閸忚偐鍘搁梺绋挎湰濮樸劍绂掗姀掳浜滈柕澶堝劤缁犳彃菐閸パ嶈含妤犵偞鎹囬獮鎺楀籍閸屽倶鍔岃灃闁绘﹢娼ф禒锕傛煟濡や焦绀夌憸棰佺椤啴濡堕崱妤呭殝闂佸綊顥撻崗姗�寮婚敐鍫㈢杸闁挎繂鎳忛悵婵嬫⒑閸濆嫮鐒跨紒缁樼箓閻ｇ兘宕￠悜鍡樺缓闂佺硶鍓濋〃鍛达綖閸у牓姊婚崒姘拷鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳娼￠弻鐔猴拷鐢殿焾鏍￠梺鍝ュУ閸旀瑩寮婚敐鍛傛棃鏁撴禒瀣亱闁糕剝鐟х粻鏃堟煙閻戞ɑ鈷掔痪鎯с偢閺屻劑鎮㈢拠娈嬫挾锟藉灚婢樼�氼剟鎮惧┑鍫嫹閿濆骸浜滄い蹇撶埣濮婅櫣鎷惔鈥虫殲闁哥喓鍋ら幃妤�顫濋鍌溞ㄥ┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘閿熷�熸缁辨挻绗熼崶褎鐏嶉梺鑽ゅ暱閺呮盯顢氶敐澶樻晝闁挎洩鎷风紒鐘哄吹缁辨挻鎷呮慨鎴簻閳绘捇鎮㈤崗灏栨嫼闂傚倸鐗婃笟妤�危閸洘鐓曢幖绮癸拷瀹犲煘閻炴碍鐟╅弻娑㈩敃閵堝懏鐏佺紓浣哄█缁犳牠骞冨Δ锟介埥澶娾枎濡厧濮洪梻浣规た閸樺ジ鎯岄崒鐐茶摕婵炴垶鐔幏鐑芥晲鎼粹�愁潻闂佸搫顑呴柊锝呯暦閿熺姵鐒肩�广儱妫涢崢鐢告⒑鐟欏嫷鍟忛柛鐘崇墵閵嗗倹绺介崨濠勫幈婵犵數濮寸�氼剟宕㈤幘顔界厸閻忕偛澧介埥澶愭煃鐟欏嫬鐏寸�规洖宕灃濠电姳鐒﹂崑鍛磽閸屾艾锟界兘鎮為敃鍌氱闁哄稁鍋嗛惌娆撴煙鏉堟崘鍚傞柨鐔诲Г濡啫鐣峰锟介、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁鏆熼柟鍐插暞閵囧嫰顢曟惔鈩冨櫧缁炬崘妫勯妴鎺戭潩椤掍焦鎮欓梺鍝勵儐閻╊垰顫忛搹瑙勬殰妞ゆ柨澧借ⅵ闁诲孩顔栭崳顕�宕戦崟顖ｆ晣闁稿繒鍘х欢鐐烘倵閿濆簼鎮嶉柟鐑芥敱椤︾増鎯旈娑橆伓闂佽崵鍠愬姗�藟韫囨稒鐓曢柣妯诲墯濞堟﹢鏌ㄩ悢鍓佺煓婵炰匠鍥ㄥ剹闁稿本鍑瑰鏍ㄧ箾瀹割喕绨兼い銉ョ墛缁绘盯骞嬮悙璺侯棟濡炪倧绲介幖顐﹀煘閹达箑鐓￠柛鈩冦仦缁ㄥジ姊洪懡銈呮毐闁哄懐濮撮悾鐑藉传閸曘劍顫嶉梺闈涚箳婵兘顢欐繝鍌楁斀閹烘娊宕愰幘缁樺殑闁割偅娲栭崒銊╂煕濡ゅ啫浜归柡锟芥禒瀣厓闁芥ê顦伴ˉ婊堟煟韫囥儳鍒伴柍瑙勫灴椤㈡瑩鎳為妷褏鈻忛梺鎹愬吹閸嬨倝鐛弽顬ュ酣顢楅敓浠嬫倶椤斿浜滈柍鍝勫閻ㄦ椽鏌熼崣澶嬪�愰柟顔ㄥ洤閱囨繝闈涚墢閹虫牠姊绘担铏瑰笡闁规悂绠栧畷浼村箛椤撶姭鏀虫繝鐢靛Т濞村倿寮鍡樺弿婵妫楁晶顖炴煕婵犲骸鐏︽慨濠冩そ瀹曨偊宕熼澶嬵棓闂備礁鎼幊蹇曟崲閸儱绠氶柨鐔诲Г閵囧嫯绠涢幘璺侯暫缂備胶濮靛銊╁箟缁嬫鍚嬪璺猴功閻ｆ椽姊虹涵鍛涧闂傚嫬瀚伴幃陇绠涘☉娆戝幈闂侀潧顦伴崹鐢稿窗濮橆厼顕遍柛鎰靛枟閸婂灚绻涢崼婵堜虎闁哄鐟х槐鎺楊敊閻ｅ本鍣繛锝呮搐閿曘倝锝為姀鐘垫殕濠电姴鍞浣风箚闁绘劦浜滈敓鑺ョ墵楠炴劙骞栨担鑲澭呯磼鐎ｎ偒鍎ユ繛鍏肩墬缁绘稑顔忛鑽ょ泿缂備胶濮寸紞濠囧蓟閿濆绠涙い鏍电到濞堟繈姊鸿ぐ鎺濇闁稿繑锚椤曪絾绂掔�ｅ灚鏅ｉ梺缁樻濞撳綊鎮芥繝姘拻濞达絿顭堥弳閬嶆煙绾板崬浜版鐐诧攻閹棃濡搁敃锟介悵鏃堟⒑缂佹ɑ鐓ラ柛姘儔閹繝鎮㈤崗鑲╁幐闂佸憡鍔戦崝宀勬晸閻ｅ本鏆鐐茬箻閺佹捇鎮╁畷鍥у箰濠电偠鎻紞浣割焽婵犳氨鍙曟い鎺戝閻撴盯鎮橀悙闈涗壕缂侊拷閸愵亞纾肩紓浣诡焽濞插锟借娲栫紞濠囥�佸▎鎾村亗閹兼惌鍠楀〒鎰攽閻樺灚鏆╁┑顔诲嵆瀹曞綊鎮℃惔妯荤亙濠电偞鍨堕悢顒勫箯瀹勯偊娼╂い鎰╁灩缁侇噣鎮楀▓鍨灈妞ゎ厾鍏樺顐﹀箻缂佹ê浜归梺鍛婄懃椤︻厽绂掗姀銈嗏拻濞达絽鎲￠崯鐐烘煕閺傝法绠荤�殿喗褰冮埥澶愬閳哄倹娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�?
		
		
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795439;

	public int getType() {
		return 795439;
	}

	public long npckey; // npckey为npc的唯一ID

	public CReqQuestion() {
	}

	public CReqQuestion(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqQuestion) {
			CReqQuestion _o_ = (CReqQuestion)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqQuestion _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


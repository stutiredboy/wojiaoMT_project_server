
package cross;
import fire.pb.cross.CrossManager;
import gnet.DeliveryManager;
import gnet.link.Onlines;
import gnet.link.User;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SendUserInfoAndTicket__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SendUserInfoAndTicket extends __SendUserInfoAndTicket__ {
	@Override
	protected void process() {
		// protocol handle
		new mkdb.Procedure(){
			@Override
			protected boolean process() throws Exception {
				CrossManager.logger.info("SendUserInfoAndTicket.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻锛勪沪閸撗勫垱闂佺偨鍎荤粻鎾荤嵁鐎ｎ亖鏀介柛娑卞灡閺呯厧鈹戦敍鍕杭闁稿﹥鍔欏鎻掝煥閸℃劒姹楅梺鍛婂姦閸犳绮婚幒妤佲拻濞达綀娅ｇ敮娑㈡煥濮橆厺绻嗘い鏍ㄧ啲闊剛锟借娲樺ú婵堢不濞戙垹鍗抽柣妯碱暜缁辨煡姊绘担鑺ョ《闁哥姵娲橀幈銊╁Χ閸滀礁娈梺鍛婃处閸嬪棝寮抽崱娑欏�甸柨婵嗛娴滄粍銇勮箛姘【閾绘牠鏌ｅ锟藉褎绂掑鍫熺厽闊洦姊荤粻鐐碉拷瑙勬礃缁诲倿锝炲┑瀣殝闁汇垽娼ч獮宥夋⒒閸屾瑧顦﹂柣蹇旂箞椤㈡牠宕ㄧ�涙ê锟藉爼鏌熺紒銏犳灍闁绘挻鐟╅弻褑绠涢敐鍛凹閻庤娲栭惉濂告晸閸婄噥娼愭繛鍙夌矒閳ワ箓宕奸敐鍥︾胺婵犵數鍋犻幓顏嗗緤娴犲绠规い鎰跺瀹撲線鏌涢鐘插姕闁抽攱甯掗妴鎺戭潩閻愵剙顏舵繝鐢靛仒閸栫娀宕舵担鍛婂缂佸倹甯為敓鏂ょ秵娴滅偤鎮伴妷鈺傗拺闁告繂瀚ⅹ闂佸憡鏌ㄧ粔鎾煝瀹ュ鍋愰柣鎰灊缁ㄥ姊洪崫鍕拷鎼佹倶濠靛鐓曢柡鍐ㄥ�诲Λ顖炴煙鐟欏嫬濮堟い銉ヮ樀濡焦寰勯幇顓犲弳濠电娀娼уΛ娆撳闯閸︻厾纾奸柣娆愮懃鐎氼喚绮绘ィ鍐╃厱婵炴垵宕鍧楁椤掑澧撮柡灞革拷宕囨殕闁跨喍绮欏畷浼村冀椤撴粣鎷锋担绯曟瀻闁圭偓娼欏▓鎰版⒑閸愬弶鎯堥柛鐑嗗弮婵℃悂鍩￠崒姘炬嫹閻㈠憡鍋℃繛鍡楃箰椤忣亜顭跨捄鍝勵伃闁哄本绋撻敓鏂ょ秵娴滃嘲顔忛妷鈺傜厽闁挎繂娲ら崢鎾煙椤斿搫鐏柛鐘诧攻濞煎繘濡搁敂鐣屽綅濠电姷鏁搁崑鐘诲箵椤忓棗绶ら柛褎銇涢敓鏂ょ畵瀹曞ジ鎮㈤搹鐟伴獎闁诲骸绠嶉崕閬嵥囨导鏉戠厱闁圭儤顨嗛悡鏇㈡倶閻愭彃鈷旈柟鍐叉閺屾稖绠涢幘鍓佷紘缂備浇椴哥敮锟犮�佸璺哄窛妞ゆ挾濮冲鎾翠繆閵堝洤啸闁稿鍋ゅ畷婵嗏枎閹捐泛绁﹂梺鍝勭Р閸斿秵鍒婇幘顔界厱婵犻潧瀚崝鐢电磼妲屾牕娅嶆慨濠勭帛閹峰懏绗熼娑氱Ш闂備礁鎲″ú鏍倶濮樿埖鍋╅柛顐ｆ礃閳锋垿鏌﹀Ο渚Ц闁哄棛鍠栭弻娑㈡偐瀹曞洤鈷岄悗娈垮枦椤曆囶敇閸忕厧绶炲┑鐘插楠炴劕鈹戦悙鑸靛涧缂佽弓绮欓獮澶愬灳閺傘儲鐏佸銈嗘尵婵澹曢挊澹濆綊鏁愰崶鍓佸姼濡炪倧绲炬繛濠囧蓟濞戞熬鎷烽敐鍐ㄥ闁跨喕濮ょ换鍌烆敋閿濆洦瀚氭繛鏉戭儐椤秹姊洪棃娑氱畾闁哄懏绮撳鎻掆攽鐎ｎ偀鎷洪梺鍦焾濞撮绮婚幘瀵哥閻忕偛鍊告慨鍌炴煙椤曪拷缁犳牕鐣疯ぐ鎺濇晝闁靛牆娲ㄥΣ鍥ㄧ節閻㈤潧浠滈柣妤�妫濋幃妯衡攽鐎ｎ亜鍤戦梺鍝勫暙閻楀﹪鎮￠弴鐐╂斀闁绘ɑ褰冮弳鐔虹磼閻樿櫕灏伴柕鍥у椤㈡洟濮�閵忋埄鍞堕梺缁樻尪閸婃牠濡甸崟顔剧杸闁圭偓鍓氭导锟芥俊鐐�栧褰掑礉濞嗗浚娼栭柧蹇撴贡绾惧吋淇婇姘儓妞ゎ偅鍨甸—鍐Χ閸℃顦ㄧ紓渚囧枟閹瑰洭鎮伴璺ㄧ杸婵炴垶鐟ラ敓钘夘煼閺岋箑螣娓氼垱笑闂佸摜鍋戦崝宀勨�旈崘顔嘉ч柛鈩兠弳妤呮⒑閸濄儱孝閻庢稈鏅濈划瀣箳閹炽劍妞介、鏃堝川椤忓懎顏圭紓鍌氬�搁崐鐑芥倿閿曞倵锟斤箓宕堕浣稿壒閻庣櫢鎷烽柛鏇ㄥ墰閸樿棄鈹戦悩鑼粵闁告梹鐗曢埢宥夊椤わ拷=" + userinfo.userid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳娼￠弻鐔猴拷鐢殿焾鏍￠梺鍝ュУ閸旀瑩寮婚敐鍛傛棃鏁撴禒瀣亱闁糕剝鐟х粻鏃堟煙閻戞ɑ鈷掔痪鎯с偢閺屻劑鎮㈢拠娈嬫挾锟藉灚婢樼�氼剟鎮惧┑鍫嫹閿濆骸浜滄い蹇撶埣濮婅櫣鎷惔鈥虫殲闁哥喓鍋ら幃妤�顫濋鍌溞ㄥ┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告劦鐓堝Σ閬嶆⒒娴ｄ警鐒炬い鎴濇噽閿熻姤鐭崡鎶芥偘椤曪拷瀹曞崬鈽夊▎蹇ユ嫹閻戣姤鐓熼柟瀵稿�戝璺虹闁惧繐婀辩壕浠嬫煕鐏炲墽鎳呴柛鏂跨Ч閹锋垿鏌嗗鍡欏幗闂侀潧顭粻鎴︽倶閹绢喗鐓涢悘鐐插⒔濞叉潙鈹戦埄鍐╁�愰柡浣稿�块幊鐐哄Ψ閿旂晫鏉篣serInfoAndTicket闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮堥柕鍥у瀵挳鎮欓幖顓燂紒闂佽瀛╅懝鍓х礊婵犲洤钃熸繛鎴欏灩缁犳盯姊婚崼鐔衡檨闁诲繐鐗撻幃妤呮偡閻楀牆鏆堢紓浣筋嚙閸熷瓨淇婇悽绋跨妞ゆ牗鑹鹃崬銊╂⒑闂堟丹娑㈡晸閽樺）锝夊醇閵夛妇鍘甸梺绋跨箰閸氬绱為幋锔界叆闁哄洦锚閿熻姤绻堝畷娲倷閸濆嫮顓洪梺缁樺姌鐏忔瑩鎮块崶顒佲拻濞达絼璀﹂悞楣冩煥閺囨ê鍔氶悡銈夋煟閺冨洤浜圭�规挷绶氶悡顐﹀炊閵婏妇鈹涢梺褰掝棑閸忔﹢寮幇顓熷劅闁斥晛鍟版禍顏堟⒒娴ｅ憡鎯堟い鎴濆缁牊绗熼敓浠嬪春閻愬搫绠ｉ柨鏃囨娴滃綊姊洪崨濠勬噧妞わ富鍨惰棟闁冲搫鎳忛埛鎴犵磽娴ｈ偂鎴犱焊椤忓牊鐓曢幖杈剧稻閺嗩剛锟芥鍠栭…鐑藉极閹邦厼绶炲┑鐘插�哥粊顕�姊绘担铏瑰笡闁告梹锕㈤、姘煥閸繄顔嗛梺缁樺灱濡嫰骞戦懜鐐逛簻闁规儳宕俊浠嬫倵濮樻剚娼愰柟渚垮妼铻ｉ柣鎾崇凹婢规洟鏌ｆ惔銏㈠暡闁瑰嚖鎷�!");
				User user = Onlines.getInstance().getConnectedUsers().getUserByUserId(userinfo.userid);
				if(user != null)
					user.setIp(userinfo.loginip);
				xbean.AUUserInfo info=xbean.Pod.newAUUserInfo();
				info.setRetcode(0);
				info.setFunc(userinfo.func);
				info.setFuncparm(userinfo.funcparm);
				info.setLoginip(userinfo.loginip);
				info.setBlisgm(userinfo.blisgm);
				info.getAuth().addAll(userinfo.auth);
				info.setAlgorithm(userinfo.algorithm);
				info.setNicknameOctets(userinfo.nickname);
				xtable.Auuserinfo.remove(userinfo.userid);
				xtable.Auuserinfo.add(userinfo.userid, info);
				DeliveryManager.getInstance().send(new SendUserInfoAndTicket_Re(SendUserInfoAndTicket_Re.RET_OK, userinfo.userid, flag));
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 228;

	public int getType() {
		return 228;
	}

	public com.locojoy.base.Octets account;
	public cross.UserInfo userinfo;
	public com.locojoy.base.Octets ticket;
	public byte flag;

	public SendUserInfoAndTicket() {
		account = new com.locojoy.base.Octets();
		userinfo = new cross.UserInfo();
		ticket = new com.locojoy.base.Octets();
	}

	public SendUserInfoAndTicket(com.locojoy.base.Octets _account_, cross.UserInfo _userinfo_, com.locojoy.base.Octets _ticket_, byte _flag_) {
		this.account = _account_;
		this.userinfo = _userinfo_;
		this.ticket = _ticket_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		if (!userinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(account);
		_os_.marshal(userinfo);
		_os_.marshal(ticket);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		account = _os_.unmarshal_Octets();
		userinfo.unmarshal(_os_);
		ticket = _os_.unmarshal_Octets();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SendUserInfoAndTicket) {
			SendUserInfoAndTicket _o_ = (SendUserInfoAndTicket)_o1_;
			if (!account.equals(_o_.account)) return false;
			if (!userinfo.equals(_o_.userinfo)) return false;
			if (!ticket.equals(_o_.ticket)) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += account.hashCode();
		_h_ += userinfo.hashCode();
		_h_ += ticket.hashCode();
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("B").append(account.size()).append(",");
		_sb_.append(userinfo).append(",");
		_sb_.append("B").append(ticket.size()).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


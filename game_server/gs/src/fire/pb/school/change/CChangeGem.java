
package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeGem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牆濮涚紓浣哄█缁犳牠寮婚妸鈺傚亜閻犲洦鐣幘鍓佺＜缂備焦顭囬埦渚�鏌熷畡鐗堝殗鐎规洘锕㈠畷锝嗗緞鐎ｎ偄锟介绱撴担鍝勪壕闁稿骸鍟块敃銏ゆ焼瀹ュ懐鐤呴梺褰掓？閻掞箓宕戠�ｎ喗鐓曟い鎰剁悼缁犳ɑ銇勮箛鎿冪吋婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥碍婢橀悾鐑筋敍閻戝棙鏅┑顔筋焽閸樠冣枔椤愶附鈷戦柛娑橈攻婢跺嫰鏌涢妸锕�顥嬬紒顔款嚙閳藉濮�閿涘嫬骞堥梻浣筋潐婢瑰棝寮幖浣稿偍婵炴垶鐟ょ换鍡涙煙缂佹ê绗氶悹鎰剁磿缁辨帗娼忛妸銉ь儌缂備浇椴哥敮鎺曠亽闂佸吋绁撮弲婵嬪级娴犲鐓熼幖娣�ゅ鎰箾閸欏澧甸柟顔哄劦瀹曟姊荤�靛摜鐣鹃梻浣哥秺濡法绮堟担鍛婃殰濠碉紕鍋戦崐鏍偋濡ゅ啰鐭欓柟杈惧瘜閺佸倿鏌涢锝嗙闁抽攱鍨圭槐鎾存媴婵埈浜幃姗�宕￠悙鈺傛杸濡炪倖鏌ㄩ幖顐︽晸閼恒儳绠炴鐐插暣閺佹捇鎮╅崘韫盎闂備胶顭堢换妤呭磻閹版澘鍌ㄥù鐘差儐閳锋垿鏌涘┑鍡楊仼闁跨喕妫勫﹢閬嶆晸閻ｅ瞼鎳楅柛銉戝懏鐒鹃梻浣虹帛閸旀寮崫銉ヮ棜濠靛倸鎲￠崑锝夋煕濠靛棗顏柟顖氱墢缁辨帡鎮▎蹇斿闁绘挸绻橀弻娑㈠Ψ閹存繂鏋ゅù鐓庡暣閹鈻撻崹顔界亶闂佺懓鎲℃繛濠囧Υ娓氾拷瀵噣宕煎┑鍡欑崺婵＄偑鍊栭幐鍡涘磼濠婂喚妲�
public class CChangeGem extends __CChangeGem__ {
	public static final Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		logger.error("-----------------------------婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牆濮涚紓浣哄█缁犳牠寮婚妸鈺傚亜閻犲洦鐣幘鍓佺＜缂備焦顭囬埦渚�鏌熷畡鐗堝殗鐎规洘锕㈠畷锝嗗緞鐎ｎ偄锟介绱撴担鍝勪壕闁稿骸鍟块敃銏ゆ焼瀹ュ懐鐤呴梺褰掓？閻掞箓宕戠�ｎ喗鐓曟い鎰剁悼缁犳ɑ銇勮箛鎿冪吋婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥碍婢橀悾鐑筋敍閻戝棙鏅┑顔筋焽閸樠冣枔椤愶附鈷戦柛娑橈攻婢跺嫰鏌涢妸锕�顥嬬紒顔款嚙閳藉濮�閿涘嫬骞堥梻浣筋潐婢瑰棝寮幖浣稿偍婵炴垶鐟ょ换鍡涙煙缂佹ê绗氶悹鎰剁磿缁辨帗娼忛妸銉ь儌缂備浇椴哥敮鎺曠亽闂佸吋绁撮弲婵嬪级娴犲鐓熼幖娣�ゅ鎰箾閸欏澧甸柟顔哄劦瀹曟姊荤�靛摜鐣鹃梻浣哥秺濡法绮堟担鍛婃殰濠碉紕鍋戦崐鏍偋濡ゅ啰鐭欓柟杈惧瘜閺佸倿鏌涢锝嗙闁抽攱鍨圭槐鎾存媴婵埈浜幃姗�宕￠悙鈺傛杸濡炪倖鏌ㄩ幖顐︽晸閼恒儳绠炴鐐插暣閺佹捇鎮╅崘韫盎闂備胶顭堢换妤呭磻閹版澘鍌ㄥù鐘差儐閳锋垿鏌涘┑鍡楊仼闁跨喕妫勫﹢閬嶆晸閻ｅ瞼鎳楅柛銉戝懏鐒鹃梻浣虹帛閸旀寮崫銉ヮ棜濠靛倸鎲￠崑锝夋煕濠靛棗顏柟顖氱墢缁辨帡鎮▎蹇斿闁绘挸绻橀弻娑㈠Ψ閹存繂鏋ゅù鐓庡暣閹鈻撻崹顔界亶闂佺懓鎲℃繛濠囧Υ娓氾拷瀵噣宕煎┑鍡欑崺婵＄偑鍊栭幐鍡涘磼濠婂喚妲�--婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牆濮涚紓浣哄█缁犳牠寮婚妸鈺傚亜閻犲洦鐣幘鍓佺＜缂備焦顭囬埦渚�鏌熷畡鐗堝殗鐎规洘锕㈠畷锝嗗緞鐎ｎ偄锟介绱撴担鍝勪壕闁稿骸鍟块敃銏ゆ焼瀹ュ懐鐤呴梺褰掓？閻掞箓宕戠�ｎ喗鐓曟い鎰剁悼缁犳ɑ銇勮箛鎿冪吋婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥碍婢橀悾鐑筋敍閻戝棙鏅┑顔筋焽閸樠冣枔椤愶附鈷戦柛娑橈攻婢跺嫰鏌涢妸锕�顥嬬紒顔款嚙閳藉濮�閿涘嫬骞堥梻浣筋潐婢瑰棝寮幖浣稿偍婵炴垶鐟ょ换鍡涙煠绾板崬澧柛銈忔嫹闂佸吋瀵ч崝娆撳蓟濞戙垹唯闁瑰瓨绻勫暩闂佸憡鍑归崑濠囧箖濡ゅ啯鍠嗛柛鏇ㄥ墰閳规稓绱撴担铏瑰笡缂佽鐗撻幃浼搭敊閻ｅ瞼鎳濋梺璺ㄥ枍缁瑥顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹-"+tanzhuangKey+"--濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺灥濞诧絿娆㈤悽鍛娾拺闁硅偐鍋涢敓鑺ョ墪鐓ら柣鏃傚帶閽冪喐绻涢幋娆忕労闁轰礁鍟撮弻銊モ攽閸℃﹩妫ら梺鎸庣♁閿曘垹顫忛搹瑙勫磯闁靛鍎查悘鍡椻攽閳藉棗浜滈悗姘緲閻ｇ兘顢涢悙鑼獓闂佺懓顕慨闈涒枔閻愵剛绡�闂傚牊绋戦敓钘夘煼閳ワ箓宕奸妷顖滅◤闂佸憡绋戦悺銊╂偂閻旈晲绻嗘い鏍ㄦ皑娴犮垽鏌ｉ妸銉︽儓闂囧绻濇繝蹇斿闂佸憡顨嗘繛濠傤嚕婵犳碍鏅查柛鈩兠崝鍛存⒑閹稿海绠撴俊顐幗缁傛帟顦规慨濠囩細閵囨劙骞掑┑鍥舵闂備胶顭堢换鎴︽晝閵忕媭鍤曢悹鍥ㄧゴ濡插牓鏌曡箛鏇炐㈢�规挸妫濆娲濞戣京鍔搁梺绋块叄娴滃爼鏁愰悙鍝勭厸闁告侗鍠掗幏娲⒑閸涘﹦鈽夐柨鏇樺劤娴滄悂顢橀悩鐢碉紳閻庡箍鍎遍幏鎴濐啅閵夛负浜滄い鎰╁灮缁犺崵锟借娲﹂崑濠傜暦濠靛纾归柣鏂垮娴犫晠姊鸿ぐ鎺濇濠电儑鎷烽悗瑙勬穿缁叉儳顕ラ崟顓濇勃闁绘挸瀵掑Λ婊冣攽閻樻鏆滅紒杈ㄦ礋瀹曟垿骞嬮敃锟界壕褰掓煏閸繍妲哥痪鎯ь煼閺屾盯寮撮妸銉ょ爱闂佸搫顑呯粔褰掑蓟閵娾晜鍋嗛柛灞剧☉椤忥拷-"+xilianshiTypeId+"-----------------------------");
		new PChangeGem(roleId, tanzhuangKey, xilianshiTypeId).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810491;

	public int getType() {
		return 810491;
	}

	public int gemkey; // 要转换宝石的itemKey
	public int newgemitemid; // 要转换宝石的itemId

	public CChangeGem() {
	}

	public CChangeGem(int _gemkey_, int _newgemitemid_) {
		this.gemkey = _gemkey_;
		this.newgemitemid = _newgemitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(gemkey);
		_os_.marshal(newgemitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		gemkey = _os_.unmarshal_int();
		newgemitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeGem) {
			CChangeGem _o_ = (CChangeGem)_o1_;
			if (gemkey != _o_.gemkey) return false;
			if (newgemitemid != _o_.newgemitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += gemkey;
		_h_ += newgemitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(gemkey).append(",");
		_sb_.append(newgemitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeGem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = gemkey - _o_.gemkey;
		if (0 != _c_) return _c_;
		_c_ = newgemitemid - _o_.newgemitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


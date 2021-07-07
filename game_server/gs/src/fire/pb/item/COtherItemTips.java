
package fire.pb.item;
import com.locojoy.base.Octets;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COtherItemTips__ extends mkio.Protocol { }

/** 摆摊Tip请求
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COtherItemTips extends __COtherItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long askroleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (askroleId < 0)
			return;
		ItemMaps bag = Module.getInstance().getItemMaps(roleid, packid, true);
		if (bag == null)
			return;
		final ItemBase item = bag.getItem(keyinpack);
		if (item == null) {
			return;
		}

		Octets tips = item.getTips();
		if (tips == null) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮櫘閸ｏ綁寮幘瀵割浄閻庯綆浜為鍡椻攽閻樼粯娑фい鎴濇噽缁顢涘鍏煎瘜闁诲函缍嗘禍婵嬪箲閿濆洨纾奸柣妯挎珪閳锋劗绱掔紒妯兼创妤犵偛顑夐幃娆撳幢濡櫣浠搁悗鍨緲鐎氭澘鐣烽悢纰辨晬婵炴垶鑹鹃獮鍫ユ⒑鐠囨彃鍤辩紒鑼跺Г閺呰埖鎯旈敐鍛氶梺璺ㄥ枍缁瑥顫忓ú顏勪紶闁告洦鍓氶幏鍗炩攽閻愭彃绾фい顓炴喘楠炴垿濮�閻橆偅顫嶉梺闈涚箚閿熺晫顒查幏鐑芥煥鐎ｃ劋绨婚梺鐟版惈缁夌兘宕楀畝锟介幉鎼佸箥椤斿吋鐏堝┑顔硷功缁垶骞忛崨瀛樺殟闁靛缍囬幏鐑藉礃椤忓棛锛滈梺璺ㄥ枙婵倗绮悢鍏兼櫢濞寸姴顑冮敓鎴掔窔瀵粙濡搁妷褏鐛梻浣哥秺閸嬪﹪宕滃┑瀣闁哄洢鍨洪埛鎴︽煕濠靛棗顏柛灞诲姂閺屾盯濡搁妷褏楔闂佸搫鑻澶婄暦閸洖惟鐟滃繘鎯侀崼銉︹拺闁告捁灏欓崢娑㈡煕鐎ｎ亜顏柟渚垮姂瀹曞ジ濡烽妷锔撅拷顒勬⒑閸撴彃浜栭柛搴㈢叀閸╂盯骞掗幊銊ョ秺閺佹劙宕熼鍛Τ闂備胶绮敮妤呭磿鐎圭姷浜欓梻浣虹帛閿氱�殿喖鐖奸獮澶愬传閵壯咃紲濡炪倖妫佹慨銈壦夐崱娑欑厪闁搞儯鍔屾慨宥嗩殽閻愭潙娴鐐差儔閺佹劙宕卞Ο鐑樻瘒濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倹銇勯弽顐粶闁搞劌鍊块弻娑㈡晜鐠囨彃绠绘繛鎴炴尭缁夋挳鍩為幋锔藉亹鐎规洖娴傞弳锟犳⒑缂佹ɑ鎯堢紓宥勭窔閹繝顢曢敃锟介悙濠傤渻鐎ｎ亪顎楅柛鈺佹湰缁绘稓锟芥稒顭囬惌鍡欑磼椤旂晫鎳囩�殿喖顭锋俊鎼佸煛閸屾矮绨荤紓鍌氬�烽悞锕傛晝閳轰絼娑㈠礋椤愮喐鏂�闂佺粯鍔樺▔娑欑瑜版帗鐓涢柛婊冨暟缁夘喗鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敆婵犲啫顏堕梺褰掓？缁�浣哄閸︻叏鎷烽悷鏉款仾闁革絿顥愰妵鎰板箳閹寸姴锟界偤鎮峰鍐鐎殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻锛勪沪缁嬪灝鈷夐悗鍨緲鐎氼噣鏁撻弬銈囩У濞存粍绻堥、娆撳川椤撴稒鏂�闂佺粯鍔曞鍫曞煝閺囩伝鐟邦煥閸愵亜鐓熼悗娈垮櫘閸嬪﹤鐣烽崼鏇ㄦ晢濞达絽鎼敮楣冩⒒婵犲骸浜滄繛璇х畱鐓ら柡宓嫭鐦庨梻鍌氬�风粈渚�骞夐敍鍕床闁告劦鍠撻敓钘夊暞缁绘繈宕掗妶鍡欑▉缂傚倸鍊烽悞锕傗�﹂崶顒佸仭鐟滅増甯楅悡鏇㈡煏婢跺鐏ラ柛鐘宠壘椤洭鎳￠妶鍥╋紳闂佺鏈悷褔藝閿斿浜滈柨鏇炲�烽幉鍓э拷娈垮櫘閸嬪棝骞忛悩缁樺殤妞ゆ帊鐒﹂鏇㈡⒒娴ｅ憡鎯堟繛灞傚灲瀹曞綊宕烽鐘辩瑝闂佹寧绻傞ˇ浼存偂閵夆晜鐓涢柛鎰╁妼閿熺晫鎳撻埢宥夊即閵忥紕鍘卞┑鐐叉缁绘垿藟閵忊剝鍙忓┑鐘叉噺椤忕姷绱掓潏銊ョ瑨閾伙綁鏌ゆ慨鎰拷銈呂ｉ鍕拻濞达絼璀﹂悞楣冩煥閺囨ê锟芥洟鏁冮姀銈嗙劶鐎广儱妫欏▍銏ゆ⒑閸忛棿鑸柛搴㈠▕瀹曨垶寮婚妷锔惧幍闂佸憡鍨崐鏍拷姘炬嫹,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹婵＄偑鍊栭崝锕�顭块敓鐣岀磼椤斿灝鐓愬ǎ鍥э工铻栭柨鐔剁矙楠炲﹥鎯旈妸銉у幋闂佺鎻梽鍕磹閻戣姤鐓涘璺侯儏閻忊晛霉閻樻瑥娲﹂埛鎴︽煙閼测晛浠滃┑陇鍋愮槐鎾愁吋閸滃啳鍚Δ鐘靛仜閸熸潙鐣风粙璇炬梹鎷呴棃鈺傚闂佸灝顑冩禍婊堟煙閻戞ê鐏ラ柨鐔绘椤兘銆佸▎鎾冲嵆闁靛繆妾ч幏娲⒑閼姐倕鏋戝鐟版楠炴鎮╃紒妯煎幗闂佺粯姊瑰娆撳礉閿曞倹鐓欐い鏃�鏋婚懓鍧楁煕閳哄绡�鐎规洘锕㈤、鏃堝幢椤撶姴绨ラ梻鍌氬�烽懗鍓佸垝椤栫偞鏅柣搴㈩問閸犳牗鏅舵惔銊ョ鐟滅増甯楅弲鎼佹煟濡櫣锛嶉柛妯兼暬濮婃椽宕ㄦ繝鍕櫑濡炪倧缂氶崡鍐茬暦閹版澘绠涙い鏇炴鐎氳绻涢崼婵堜虎婵炲懏锕㈤弻娑㈠箻鐎靛憡鍒涘Δ鐘靛仦閸ㄥ灝鐣烽悢纰辨晬婵絽鐨烽弲鐘诲蓟閵娾晛绫嶉柛灞剧矋閹叉﹢姊洪崫銉ユ瀻闂佸府绲介～蹇旂節濮橆剛锛滃┑鐐叉閸旀濡堕弶搴撴斀闁绘劕妯婂Σ瑙勭箾閼碱剙鏋庨柣锝囧厴楠炲酣鎳為妷锔界彇闂備胶顭堥張顒�顫濋妸鈺婃晩闁糕剝绋掗埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓?:" + item.getName());
			return;
		}
		
		SOtherItemTips send = new SOtherItemTips(roleid, packid, keyinpack, tips);
		gnet.link.Onlines.getInstance().sendResponse(this, send);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787767;

	public int getType() {
		return 787767;
	}

	public long roleid; // 目标玩家的id
	public int packid;
	public int keyinpack;

	public COtherItemTips() {
	}

	public COtherItemTips(long _roleid_, int _packid_, int _keyinpack_) {
		this.roleid = _roleid_;
		this.packid = _packid_;
		this.keyinpack = _keyinpack_;
	}

	public final boolean _validator_() {
		if (packid < 1) return false;
		if (keyinpack < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(packid);
		_os_.marshal(keyinpack);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		packid = _os_.unmarshal_int();
		keyinpack = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COtherItemTips) {
			COtherItemTips _o_ = (COtherItemTips)_o1_;
			if (roleid != _o_.roleid) return false;
			if (packid != _o_.packid) return false;
			if (keyinpack != _o_.keyinpack) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += packid;
		_h_ += keyinpack;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(packid).append(",");
		_sb_.append(keyinpack).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(COtherItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = packid - _o_.packid;
		if (0 != _c_) return _c_;
		_c_ = keyinpack - _o_.keyinpack;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


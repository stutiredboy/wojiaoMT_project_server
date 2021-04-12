
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPetAddPoint__ extends mkio.Protocol { }

/** 客户端请求宠物加点
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetAddPoint extends __CPetAddPoint__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂嫮鐭婇棁澶愭煛瀹ュ骸骞楅柣鎾崇箰閳规垿鎮欓棃娑楀濠电偛鎳庡Λ婵嬪蓟濞戙垹围闁告侗鍙庢导鍐⒑閸濆嫯顫﹂柛濠冾殘閸掓帒鈻庨幋鐐茬／闂侀潧顭堥崐妤併仚閾忣偆绡�闁汇垽娼ф禒婊堟煙閾忣偄濮堥柟渚垮姂瀹曞綊顢曢妶鍌涙暤濠电姷鏁告慨鏉懨洪妶鍛函闂傚倸顭崑鍕洪敃鍌氳摕闁靛ň鏅╅弫鍌炴煕椤愶絾绀冮柍閿嬪笒闇夐柨婵嗩樈濡垵鈽夐幘鐟扮毢缂佽鲸甯￠悡顐︻敇閻樼數鍘梻浣筋嚃閸犳鏁嬪銈庡亝缁诲啫顭囪箛娑樼厸闁告劦浜濆▓浠嬫⒒閸屾瑨鍏岀紒顕呭灦瀵濡搁埡浣叫曢柣搴秵閸犳牠鎮挎ィ鍐╃厵闂傚倸顕崝宥夋煟閹惧崬鐏ǎ鍥э躬椤㈡稑鈻庨幒婵嗗Τ婵犵锟藉啿绾ф俊鐐扮矙瀵鏁撻悩鎻掕�垮銈嗘尵婵兘寮抽妶澶嬧拺闁告繂瀚﹢鐗堢箾閸欏顏堫敋閵夆晛绀嬫い鏍ㄨ壘閼板灝鈹戦埥鍡楃仴鐎规洑绲婚妵鎰板川鐎涙ǚ鎷婚梺绋挎湰閻熝囁囬敂鎾呮嫹鐟欏嫭澶勯柛鎾寸懅閸欏懎顪冮妶鍡樺蔼闁搞劌缍婇幏鎴︽偄閸忚偐鍙嗗┑鐘绘涧濡厼危閸濄儳纾兼い鎰╁灮鏁堥梺鍝勮閸旀垿骞冮姀銏″珰婵炲牆顑嗛幐鍓ф閹烘纾兼慨妯荤樂閿濆洨纾奸柛灞剧☉缁椦囨煥閻斿憡鐏紓宥呮瀹曟垿宕ㄩ娑欑�洪梺闈涚箞閸婃牠鍩涢幋锔界厾闁诡厽甯掗崜顓熴亜韫囨挾鍙掗柕濞炬櫆閺呯霉閻樺樊鍎愭い銉ワ攻閵囧嫰骞掗幋顓熜︽繝鈷�鍕唉闁哄矉绱曟禒锕傛閳哄倸顏堕悗瑙勬礀濞诧箑鈻撻弴銏♀拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳冮柣锝夋敱鐎靛ジ寮堕幋婵嗘暏婵＄偑鍊栭幐鑽ゅ垝閿濆绠梺鍨儑閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩绲剧粋鎺旓拷锝呯仛閺咃綁鎮峰鍐弰鐎殿喗鐓℃慨锟介柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鐭傚鎼佸籍閸喓鍘搁梺鍛婄矆缁�浣圭娴煎瓨鐓涘ù锝堫潐瀹曞矂鏌熷畷鍥т槐濠碉紕鍏樻俊鎼佸Ψ椤旂瓔妫ㄩ梻鍌氬�烽悞锕傚箖閸洖鍨傛繛宸簼閸嬪倿鏌ㄩ悢鍝勑ｉ柡鍛叀閺岋綁骞囬锟介。鎶芥煟閵堝繑瀚归梻鍌欑閹碱偊宕愭禒瀣垫晪鐟滃海绮嬪鍛斀閻庯綆鍋�閹锋椽姊洪崨濠勨槈闁挎洏鍊栭幈銊╂晸娴犲鈷戦柛婵嗗閸ｈ櫣绱掔拠鑼闁伙絿鍏樻慨锟介柕鍫濇噽椤旀劖绻涙潏鍓у埌闁告ɑ绮撻獮蹇撁洪鍛幗闂佺粯锚閸樻牠鎳滈鍫熺厱闁哄倽鍎荤�氫即鏌嶇拠鑼ф鐐叉喘閹囧醇閵忕姴绠ラ梻鍌欑閹诧繝宕归鐐茬９闁哄稁鍋撻幏宄邦潩閻愵剙顏�?
		if (cons == 0 && iq == 0 && str == 0 && endu == 0 && agi == 0)
			return;

		final PPetAddPointProc proc = new PPetAddPointProc(roleid, petkey, cons, iq, str, endu, agi);
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788439;

	public int getType() {
		return 788439;
	}

	public int petkey; // 宠物key值,加点的宠物
	public int str; // 力量加点数
	public int iq; // 智力加点数
	public int cons; // 体质加点数
	public int endu; // 耐力加点数
	public int agi; // 敏捷加点数

	public CPetAddPoint() {
	}

	public CPetAddPoint(int _petkey_, int _str_, int _iq_, int _cons_, int _endu_, int _agi_) {
		this.petkey = _petkey_;
		this.str = _str_;
		this.iq = _iq_;
		this.cons = _cons_;
		this.endu = _endu_;
		this.agi = _agi_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		if (str < 0) return false;
		if (iq < 0) return false;
		if (cons < 0) return false;
		if (endu < 0) return false;
		if (agi < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(str);
		_os_.marshal(iq);
		_os_.marshal(cons);
		_os_.marshal(endu);
		_os_.marshal(agi);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		str = _os_.unmarshal_int();
		iq = _os_.unmarshal_int();
		cons = _os_.unmarshal_int();
		endu = _os_.unmarshal_int();
		agi = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPetAddPoint) {
			CPetAddPoint _o_ = (CPetAddPoint)_o1_;
			if (petkey != _o_.petkey) return false;
			if (str != _o_.str) return false;
			if (iq != _o_.iq) return false;
			if (cons != _o_.cons) return false;
			if (endu != _o_.endu) return false;
			if (agi != _o_.agi) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += str;
		_h_ += iq;
		_h_ += cons;
		_h_ += endu;
		_h_ += agi;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(str).append(",");
		_sb_.append(iq).append(",");
		_sb_.append(cons).append(",");
		_sb_.append(endu).append(",");
		_sb_.append(agi).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPetAddPoint _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		_c_ = str - _o_.str;
		if (0 != _c_) return _c_;
		_c_ = iq - _o_.iq;
		if (0 != _c_) return _c_;
		_c_ = cons - _o_.cons;
		if (0 != _c_) return _c_;
		_c_ = endu - _o_.endu;
		if (0 != _c_) return _c_;
		_c_ = agi - _o_.agi;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


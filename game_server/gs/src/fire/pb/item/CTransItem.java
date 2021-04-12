package fire.pb.item;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTransItem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTransItem extends __CTransItem__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (srcpackid == BagTypes.DEPOT || dstpackid == BagTypes.DEPOT) {
			if (!Depot.useDepotCheck(roleId, npcid))
				return;
		}

		if (!checkMove(roleId))
			return;

		if (dstpackid == BagTypes.BAG)
			page = -1; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě鍛帎闂備焦鎮堕崝宥囨崲閸曨垱鏅搁柦妯侯槺閻ｎ參鏌涙惔銊ゆ喚妤犵偛绻掗敓鏂ょ秵閸犳宕戦崟顖涚厱闁斥晛鍘鹃懖鈺傚床闁糕剝菧娴滄粓鏌″鍐ㄥ闁活厼锕弻锝夊Ω閿曪拷閻忔挳鏌＄仦璇诧拷婵嬪箖瑜斿畷鐓庘攽閹邦剚鐤傞梻鍌欑窔濞佳兠洪妶鍥锋嫹濮樼厧鐏ｇ紒顔款嚙閳藉濮�閻樻鍟嬮梺鑽ゅЬ濡椼劎鎷冮敃鍌氱骇闁归棿鐒﹂埛鎺懨归敐鍫綈闁稿濞�閺屾稒绻濋崘鈺冾槶闂佽法鍠曟慨銈夋儗椤曪拷瀹曪繝骞庨悾灞界ウ闂佸憡鍔﹂悡鍫濐焽閵娾晜鐓ラ柣鏂垮閻瑦顨ラ悙鎻掓殭闁宠閰ｉ獮姗�寮堕幋鐐垫澓濠电姷鏁搁崑娑㈡偋婵犲嫸鎷风粭娑樻硽婢跺绶為柟閭﹀幐閹风粯绻涙潏鍓хМ妞ゃ儲鎸荤粙澶愭嚑椤掑倻锛滈梺缁樏崯鍨归鎾呮嫹鐟欏嫭绀冩俊鐐舵椤曪絾绂掔�ｅ灚鏅濋梺鎸庣箓閹冲海鑺遍妷锔剧瘈闁汇垽娼ф禒锕傛煕閵娿儳鍩ｉ柟顖氱焸椤㈡瑧浜搁弽銊у弮婵＄偑鍊曠换鎰涘☉姘棜濠靛倸鎲￠崐鐢告煥濠靛棛鍑圭紒銊ㄦ闇夐柣姗嗗枛閻忔煡鏌＄仦鐣屝㈤柣锝忕節閺屽洭鏁傞崣顐畵濮婅櫣锟藉湱濯鎰版煕閵娿儲鍋ユ鐐插暣椤㈡棃宕煎┑鍡欑崺婵＄偑鍊栧濠氬煕閸喎顕遍柟鎯ь嚟缁★拷闂佹眹鍨藉褎绂掗敃鍌涚厱闁靛鍔嶇涵鐐亜椤愩垻绠茬紒缁樼箓椤繈顢橀悙鐗堝煕濠电姷鏁搁崑鐐哄箰缁嬫鐒介柟鐑橆殕閳锋帡鏌涚仦鎹愬闁跨喕濮ら幃鍌氱暦閹扮増鍊婚柤鎭掑劚閿熻棄娼￠弻銊╁即閻愯鎷疯ぐ鎺戠？闁瑰濮甸崰鎰版煟濡わ拷閻楀棛绮幒鏃傜＜闁跨喕濮ゅ鍕暆鐎ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘☉姗堝姛闁瑰啿鍟撮弻娑㈡偄妞嬪孩鎲兼繛锝呮搐閿曨亪鐛锟介、娆撴偂鎼达絿宕洪梻鍌氬�风欢锟犲矗韫囨稒鈷旈柛鏇ㄥ灠閻撴繂顭跨捄铏圭伇缁惧彞绮欓弻娑氫沪閸撗勫櫙闂佺绻愰懟顖炲煘閹达富鏁婇柣鎰靛墯濮ｅ牓姊虹拠鈥崇仩閻庢矮鍗抽妴浣糕槈濮楀棙鍍甸柡澶婄墑閸斿秹顢欓弴鐔虹瘈鐎典即鏀卞姗�鏁撻懞銉︾妤犵偛锕ラ幆鏃堝閻欙拷閸ゃ倝姊虹紒姗嗙劷缂侇噮鍨堕幃陇绠涢幙鍐數闁荤娀缂氬▍锝嗘櫠閺囥垺鐓曢柡鍐挎嫹缂侇喖绉堕幑銏犫槈閵忕姵銇濋梺鍛婂姀閺呮盯顢旈敓锟�
		new PMoveItemProc(roleId, srckey, number, srcpackid, dstpackid, dstpos,
				page).submit();
	}

	private boolean checkMove(final long roleId) {
		if (srcpackid == BagTypes.QUEST) {
			if (dstpackid != BagTypes.QUEST)
				return false;
		} else {
			if (srcpackid != BagTypes.BAG && srcpackid != BagTypes.DEPOT
					&& srcpackid != BagTypes.TEMP) {
				return false;
			}
			if (dstpackid != BagTypes.BAG && dstpackid != BagTypes.DEPOT) {
				return false;
			}
		}
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787447;

	public int getType() {
		return 787447;
	}

	public int srcpackid;
	public int srckey;
	public int number;
	public int dstpackid;
	public int dstpos;
	public int page;
	public long npcid;

	public CTransItem() {
		npcid = -1;
	}

	public CTransItem(int _srcpackid_, int _srckey_, int _number_, int _dstpackid_, int _dstpos_, int _page_, long _npcid_) {
		this.srcpackid = _srcpackid_;
		this.srckey = _srckey_;
		this.number = _number_;
		this.dstpackid = _dstpackid_;
		this.dstpos = _dstpos_;
		this.page = _page_;
		this.npcid = _npcid_;
	}

	public final boolean _validator_() {
		if (srcpackid < 1) return false;
		if (srckey < 1) return false;
		if (number < -1) return false;
		if (dstpackid < 1) return false;
		if (dstpos < -1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcpackid);
		_os_.marshal(srckey);
		_os_.marshal(number);
		_os_.marshal(dstpackid);
		_os_.marshal(dstpos);
		_os_.marshal(page);
		_os_.marshal(npcid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcpackid = _os_.unmarshal_int();
		srckey = _os_.unmarshal_int();
		number = _os_.unmarshal_int();
		dstpackid = _os_.unmarshal_int();
		dstpos = _os_.unmarshal_int();
		page = _os_.unmarshal_int();
		npcid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTransItem) {
			CTransItem _o_ = (CTransItem)_o1_;
			if (srcpackid != _o_.srcpackid) return false;
			if (srckey != _o_.srckey) return false;
			if (number != _o_.number) return false;
			if (dstpackid != _o_.dstpackid) return false;
			if (dstpos != _o_.dstpos) return false;
			if (page != _o_.page) return false;
			if (npcid != _o_.npcid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcpackid;
		_h_ += srckey;
		_h_ += number;
		_h_ += dstpackid;
		_h_ += dstpos;
		_h_ += page;
		_h_ += (int)npcid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcpackid).append(",");
		_sb_.append(srckey).append(",");
		_sb_.append(number).append(",");
		_sb_.append(dstpackid).append(",");
		_sb_.append(dstpos).append(",");
		_sb_.append(page).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTransItem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcpackid - _o_.srcpackid;
		if (0 != _c_) return _c_;
		_c_ = srckey - _o_.srckey;
		if (0 != _c_) return _c_;
		_c_ = number - _o_.number;
		if (0 != _c_) return _c_;
		_c_ = dstpackid - _o_.dstpackid;
		if (0 != _c_) return _c_;
		_c_ = dstpos - _o_.dstpos;
		if (0 != _c_) return _c_;
		_c_ = page - _o_.page;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npcid - _o_.npcid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeGem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
// 濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳婀遍幉鎼佹偋閸繄顏婚梺璺ㄥ枙濡嫰宕姘煎殫闁告洦鍨扮粻娑㈡煕閹扮數鍘涙俊鎻掓贡缁辨帞绱掑Ο鑲╃杽閻庤娲栭悥鍏间繆閹间礁唯妞ゆ牗绋戦鍫曟⒑缂佹ê鐏卞┑顔哄�濋幃锟犳偄閸忚偐鍘介梺鍝勫�圭�笛囧疮閻愮數纾奸悹鍝勬惈缁狙囨煏閸パ冾伃鐎殿喗鎸抽、鏃堝川椤撗傜处
public class CChangeGem extends __CChangeGem__ {
	public static final Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		logger.error("-----------------------------濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳婀遍幉鎼佹偋閸繄顏婚梺璺ㄥ枙濡嫰宕姘煎殫闁告洦鍨扮粻娑㈡煕閹扮數鍘涙俊鎻掓贡缁辨帞绱掑Ο鑲╃杽閻庤娲栭悥鍏间繆閹间礁唯妞ゆ牗绋戦鍫曟⒑缂佹ê鐏卞┑顔哄�濋幃锟犳偄閸忚偐鍘介梺鍝勫�圭�笛囧疮閻愮數纾奸悹鍝勬惈缁狙囨煏閸パ冾伃鐎殿喗鎸抽、鏃堝川椤撗傜处--濠电姷鏁告慨鐑藉极閸涘﹦绠鹃柨鐔诲Г缁绘稒鎷呴崘鍙夋悙缁炬儳婀遍幉鎼佹偋閸繄顏婚梺璺ㄥ枙濡嫰宕姘煎殫闁告洦鍨扮粻娑㈡煕閹扮數鍘涙俊鑼嚀鑿愰柛銉戝秷鍚悗瑙勬穿缁绘繈鐛笟锟介弫鎾绘晸閿燂拷-"+tanzhuangKey+"--婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐑囦緵闁搞倖娲熼弻娑㈩敃閿濆棛锛橀梺璺ㄥ枙濡嫰宕弶鎴犳殾濠靛倻顭堥～鍛存煟濡灝鐨哄ù婊�鍗抽弻锝嗘償閿濆棭浠ч梺褰掝棑閸忔﹢寮诲☉銏犲嵆闁靛鍎遍～鈺呮⒑閸涘﹥灏紓宥咃工椤繘宕崝鍊熸閹风娀宕ｆ径灞煎濠碉紕鍋戦崐銈夊磻閸曨偀鏋嶉柨鐕傛嫹-"+xilianshiTypeId+"-----------------------------");
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


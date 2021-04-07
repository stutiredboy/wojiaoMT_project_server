
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangePointScheme__ extends mkio.Protocol { }

/** 客户端请求切换加点方案
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangePointScheme extends __CChangePointScheme__ {
	@Override
	protected void process() {
		// protocol handle
		// 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炵偓娅嗛柛銈呭閺屻倗绮欑捄銊ょ驳濠电偛鎳愭慨鍨┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｉ涓茬紒韫矙閹ê顫濇潏鈺冪暥闂佺粯鏌ㄩ崥瀣疾閹间焦鐓㈡俊顖欒濡叉椽鏌￠崱顓犵暤闁哄本娲樺鍕幢濡崵褰呴梻鍌欑瀹曨剙煤椤撱垹钃熼柨婵嗩槸缁秹鏌ㄩ悢璇残撶紒鍌氱У缁傛帞锟斤綆鍋呭▍銏ゆ⒑閼恒儍顏埪ㄩ敓浠嬫椤掑澧撮柡灞革拷宕囨殕闁跨喍绮欏畷浼村冀椤撴粣鎷锋笟锟藉浠嬵敇瑜庨弲銏ゆ⒑鐠恒劌鏋旈柡鍜佸亰閺佹捇鎳為妷銊ヮ棟闂佹悶鍨洪悡锟犳晲閻愬墎鐤�闁哄倽顕ф禍婵嬫⒑閸涘﹤濮�闁哄懏绻堝畷銏ゅ箹娴ｅ厜鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId <= 0)
			return;

		if (schemeid < 0 || schemeid == 0){
			return;
		}
		
		final xbean.Properties prop = xtable.Properties.select(roleId);
		if (null == prop)
			return;
		
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣告贡閸庛倝宕靛顑炴椽顢旈崨顔界彇闂備浇娉曢崰宥囧垝濞嗘挸绠栧Δ锝呭暞閸婂鏌﹀Ο渚Ъ闁硅姤娲熷娲濞戣鲸肖闂佺瀛╂繛濠呮濡炪倖娲╅幏閿嬫叏婵犲懏顏犵紒杈ㄥ笒椤粓宕奸敐蹇斿闁圭娴风粻鎯归敐鍛毐閻庢凹鍣ｉ妴鍛存煥鐎ｃ劋绨婚梺鍝勭▉閸嬪嫭绂掗敃鍌涚厽闁规儳顕ú鎾煛鐏炲墽銆掑ù鐙呯畵瀹曟粏顦存い鎾跺帶閳规垿鎮欓幓鎺撳�梺鍛婃⒐閻楃姵淇婇悽绋跨妞ゆ牓鍊楃粙蹇擃渻閵堝棙顥嗘俊顐㈠椤㈡棃鏁撻敓锟�
		final PChangePointProc changepoint = new PChangePointProc(roleId, schemeid);
		changepoint.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786530;

	public int getType() {
		return 786530;
	}

	public int schemeid;

	public CChangePointScheme() {
	}

	public CChangePointScheme(int _schemeid_) {
		this.schemeid = _schemeid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(schemeid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		schemeid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangePointScheme) {
			CChangePointScheme _o_ = (CChangePointScheme)_o1_;
			if (schemeid != _o_.schemeid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += schemeid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(schemeid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangePointScheme _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = schemeid - _o_.schemeid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestChargeReturnProfit__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟椋庡厴閺屾稑鐣濋敓浠嬪磻閻愮儤鍋傞柡鍥╁枔缁犻箖鏌熸潏鍓хɑ闁绘繍浜幃妤�顫濋悙顒�顏�?闂傚倸鍊搁崐宄懊归崶銊х彾闁割偁鍎荤紞鏍ь熆鐠轰警鍎戦柣婵嗙埣閺屾盯鍩勯崘顏呭櫘婵炴垶鎸哥粔褰掑蓟閿涘嫪娌悹鍥ㄥ絻婵洟姊虹紒妯诲鞍婵炶尙鍠栧濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?
 * @author changhao
 *
 */
public class CRequestChargeReturnProfit extends __CRequestChargeReturnProfit__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);		
		if (roleid < 0)
			return;
		new PChargeReturnProfit(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812479;

	public int getType() {
		return 812479;
	}


	public CRequestChargeReturnProfit() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestChargeReturnProfit) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestChargeReturnProfit _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


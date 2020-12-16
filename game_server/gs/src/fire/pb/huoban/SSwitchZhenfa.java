
package fire.pb.huoban;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SSwitchZhenfa__ extends mkio.Protocol { }

/** �ı����ݵĹ⻷����
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SSwitchZhenfa extends __SSwitchZhenfa__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 818843;

	public int getType() {
		return 818843;
	}

	public int zhenrongid;
	public int zhenfaid;

	public SSwitchZhenfa() {
	}

	public SSwitchZhenfa(int _zhenrongid_, int _zhenfaid_) {
		this.zhenrongid = _zhenrongid_;
		this.zhenfaid = _zhenfaid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(zhenrongid);
		_os_.marshal(zhenfaid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		zhenrongid = _os_.unmarshal_int();
		zhenfaid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SSwitchZhenfa) {
			SSwitchZhenfa _o_ = (SSwitchZhenfa)_o1_;
			if (zhenrongid != _o_.zhenrongid) return false;
			if (zhenfaid != _o_.zhenfaid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += zhenrongid;
		_h_ += zhenfaid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(zhenrongid).append(",");
		_sb_.append(zhenfaid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SSwitchZhenfa _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = zhenrongid - _o_.zhenrongid;
		if (0 != _c_) return _c_;
		_c_ = zhenfaid - _o_.zhenfaid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


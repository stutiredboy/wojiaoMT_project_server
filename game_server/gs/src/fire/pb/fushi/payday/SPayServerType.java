
package fire.pb.fushi.payday;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SPayServerType__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SPayServerType extends __SPayServerType__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812592;

	public int getType() {
		return 812592;
	}

	public int paytype; // ���ѷ���������(0����ͨ1�ǵ㿨) by changhao
	public int opendy; // �Ƿ�򿪶��� 1���� 0�ر�

	public SPayServerType() {
	}

	public SPayServerType(int _paytype_, int _opendy_) {
		this.paytype = _paytype_;
		this.opendy = _opendy_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(paytype);
		_os_.marshal(opendy);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		paytype = _os_.unmarshal_int();
		opendy = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SPayServerType) {
			SPayServerType _o_ = (SPayServerType)_o1_;
			if (paytype != _o_.paytype) return false;
			if (opendy != _o_.opendy) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += paytype;
		_h_ += opendy;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(paytype).append(",");
		_sb_.append(opendy).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SPayServerType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = paytype - _o_.paytype;
		if (0 != _c_) return _c_;
		_c_ = opendy - _o_.opendy;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


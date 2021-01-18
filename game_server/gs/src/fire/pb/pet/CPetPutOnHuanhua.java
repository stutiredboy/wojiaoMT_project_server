
package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPetPutOnHuanhua__ extends mkio.Protocol { }

/** 宠物幻化
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetPutOnHuanhua extends __CPetPutOnHuanhua__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788589;

	public int getType() {
		return 788589;
	}

	public int huanhuaid;
	public int petkey;

	public CPetPutOnHuanhua() {
	}

	public CPetPutOnHuanhua(int _huanhuaid_, int _petkey_) {
		this.huanhuaid = _huanhuaid_;
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (huanhuaid < 0) return false;
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(huanhuaid);
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		huanhuaid = _os_.unmarshal_int();
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPetPutOnHuanhua) {
			CPetPutOnHuanhua _o_ = (CPetPutOnHuanhua)_o1_;
			if (huanhuaid != _o_.huanhuaid) return false;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += huanhuaid;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(huanhuaid).append(",");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPetPutOnHuanhua _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = huanhuaid - _o_.huanhuaid;
		if (0 != _c_) return _c_;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SPetChangeHuanhua__ extends mkio.Protocol { }

/** 宠物幻化结果
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SPetChangeHuanhua extends __SPetChangeHuanhua__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788591;

	public int getType() {
		return 788591;
	}

	public int petkey;
	public int huanhuaid;

	public SPetChangeHuanhua() {
	}

	public SPetChangeHuanhua(int _petkey_, int _huanhuaid_) {
		this.petkey = _petkey_;
		this.huanhuaid = _huanhuaid_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		if (huanhuaid < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(huanhuaid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		huanhuaid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SPetChangeHuanhua) {
			SPetChangeHuanhua _o_ = (SPetChangeHuanhua)_o1_;
			if (petkey != _o_.petkey) return false;
			if (huanhuaid != _o_.huanhuaid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += huanhuaid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(huanhuaid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SPetChangeHuanhua _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		_c_ = huanhuaid - _o_.huanhuaid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


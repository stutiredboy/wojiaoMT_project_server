
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEquipNewZhuanhuan__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEquipNewZhuanhuan extends __CEquipNewZhuanhuan__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810501;

	public int getType() {
		return 810501;
	}

	public int oldkey; // 旧装备的Key
	public int newkey; // 新装备ItemId

	public CEquipNewZhuanhuan() {
	}

	public CEquipNewZhuanhuan(int _oldkey_, int _newkey_) {
		this.oldkey = _oldkey_;
		this.newkey = _newkey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(oldkey);
		_os_.marshal(newkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		oldkey = _os_.unmarshal_int();
		newkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEquipNewZhuanhuan) {
			CEquipNewZhuanhuan _o_ = (CEquipNewZhuanhuan)_o1_;
			if (oldkey != _o_.oldkey) return false;
			if (newkey != _o_.newkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += oldkey;
		_h_ += newkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(oldkey).append(",");
		_sb_.append(newkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEquipNewZhuanhuan _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = oldkey - _o_.oldkey;
		if (0 != _c_) return _c_;
		_c_ = newkey - _o_.newkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


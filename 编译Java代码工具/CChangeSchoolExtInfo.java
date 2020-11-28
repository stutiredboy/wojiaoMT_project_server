
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeSchoolExtInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeSchoolExtInfo extends __CChangeSchoolExtInfo__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		new PChongzhuWeapon(roleId, this.oldkey, this.daojuid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810487;

	public int getType() {
		return 810487;
	}

	public int oldkey; // ��������Key
	public int daojuid; // ����ItemId

	public CChangeSchoolExtInfo() {
	}

	public CChangeSchoolExtInfo(int _oldkey_, int _daojuid_) {
		this.oldkey = _oldkey_;
		this.daojuid = _daojuid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(oldkey);
		_os_.marshal(daojuid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		oldkey = _os_.unmarshal_int();
		daojuid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeSchoolExtInfo) {
			CChangeSchoolExtInfo _o_ = (CChangeSchoolExtInfo)_o1_;
			if (oldkey != _o_.oldkey) return false;
			if (daojuid != _o_.daojuid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += oldkey;
		_h_ += daojuid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(oldkey).append(",");
		_sb_.append(daojuid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeSchoolExtInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = oldkey - _o_.oldkey;
		if (0 != _c_) return _c_;
		_c_ = daojuid - _o_.daojuid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


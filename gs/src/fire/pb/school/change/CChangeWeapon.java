
package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeWeapon__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeWeapon extends __CChangeWeapon__ {
	public static final Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		logger.error("-----------------------------装备点化--武器key-"+srcweaponkey+"--点化石key-"+dianhuashiTypeId+"-----------------------------");
		new PChangeWeapon(roleId, srcweaponkey, dianhuashiTypeId).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810489;

	public int getType() {
		return 810489;
	}

	public int srcweaponkey; // 武器的Key
	public int dianhuashiTypeId; // 点化石itemId

	public CChangeWeapon() {
	}

	public CChangeWeapon(int _srcweaponkey_, int dianhuashiTypeId) {
		this.srcweaponkey = _srcweaponkey_;
		this.dianhuashiTypeId = dianhuashiTypeId;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcweaponkey);
		_os_.marshal(dianhuashiTypeId);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcweaponkey = _os_.unmarshal_int();
		dianhuashiTypeId = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeWeapon) {
			CChangeWeapon _o_ = (CChangeWeapon)_o1_;
			if (srcweaponkey != _o_.srcweaponkey) return false;
			if (dianhuashiTypeId != _o_.dianhuashiTypeId) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcweaponkey;
		_h_ += dianhuashiTypeId;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcweaponkey).append(",");
		_sb_.append(dianhuashiTypeId).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeWeapon _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcweaponkey - _o_.srcweaponkey;
		if (0 != _c_) return _c_;
		_c_ = dianhuashiTypeId - _o_.dianhuashiTypeId;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


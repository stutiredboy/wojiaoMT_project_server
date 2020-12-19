
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPetTakeOffEquip__ extends mkio.Protocol { }

/** 宠物脱下装备
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetTakeOffEquip extends __CPetTakeOffEquip__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787800;

	public int getType() {
		return 787800;
	}

	public int pet_equipkey;
	public int pet_posinpack;
	public int petkey;

	public CPetTakeOffEquip() {
	}

	public CPetTakeOffEquip(int _pet_equipkey_, int _pet_posinpack_, int _petkey_) {
		this.pet_equipkey = _pet_equipkey_;
		this.pet_posinpack = _pet_posinpack_;
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (pet_equipkey < 1) return false;
		if (pet_posinpack < -1) return false;
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(pet_equipkey);
		_os_.marshal(pet_posinpack);
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		pet_equipkey = _os_.unmarshal_int();
		pet_posinpack = _os_.unmarshal_int();
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPetTakeOffEquip) {
			CPetTakeOffEquip _o_ = (CPetTakeOffEquip)_o1_;
			if (pet_equipkey != _o_.pet_equipkey) return false;
			if (pet_posinpack != _o_.pet_posinpack) return false;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += pet_equipkey;
		_h_ += pet_posinpack;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(pet_equipkey).append(",");
		_sb_.append(pet_posinpack).append(",");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPetTakeOffEquip _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = pet_equipkey - _o_.pet_equipkey;
		if (0 != _c_) return _c_;
		_c_ = pet_posinpack - _o_.pet_posinpack;
		if (0 != _c_) return _c_;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SUpgradePet__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SUpgradePet extends __SUpgradePet__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788590;

	public int getType() {
		return 788590;
	}

	public int petkey; // 宠物key
	public int aptid; // 资质id
	public int aptvalue; // 资质值
	public int upgradecount;
	public java.util.LinkedList<Integer> upgradeskill;

	public SUpgradePet() {
		upgradeskill = new java.util.LinkedList<Integer>();
	}

	public SUpgradePet(int _petkey_, int _aptid_, int _aptvalue_, int _upgradecount_, java.util.LinkedList<Integer> _upgradeskill_) {
		this.petkey = _petkey_;
		this.aptid = _aptid_;
		this.aptvalue = _aptvalue_;
		this.upgradecount = _upgradecount_;
		this.upgradeskill = _upgradeskill_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		if (aptid < 0) return false;
		if (aptvalue < 0) return false;
		if (upgradecount < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(aptid);
		_os_.marshal(aptvalue);
		_os_.marshal(upgradecount);
		_os_.compact_uint32(upgradeskill.size());
		for (Integer _v_ : upgradeskill) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		aptid = _os_.unmarshal_int();
		aptvalue = _os_.unmarshal_int();
		upgradecount = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			upgradeskill.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SUpgradePet) {
			SUpgradePet _o_ = (SUpgradePet)_o1_;
			if (petkey != _o_.petkey) return false;
			if (aptid != _o_.aptid) return false;
			if (aptvalue != _o_.aptvalue) return false;
			if (upgradecount != _o_.upgradecount) return false;
			if (!upgradeskill.equals(_o_.upgradeskill)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += aptid;
		_h_ += aptvalue;
		_h_ += upgradecount;
		_h_ += upgradeskill.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(aptid).append(",");
		_sb_.append(aptvalue).append(",");
		_sb_.append(upgradecount).append(",");
		_sb_.append(upgradeskill).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


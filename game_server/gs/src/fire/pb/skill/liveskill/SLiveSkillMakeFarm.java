
package fire.pb.skill.liveskill;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SLiveSkillMakeFarm__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SLiveSkillMakeFarm extends __SLiveSkillMakeFarm__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800528;

	public int getType() {
		return 800528;
	}

	public int addgold;

	public SLiveSkillMakeFarm() {
	}

	public SLiveSkillMakeFarm(int _addgold_) {
		this.addgold = _addgold_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(addgold);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		addgold = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SLiveSkillMakeFarm) {
			SLiveSkillMakeFarm _o_ = (SLiveSkillMakeFarm)_o1_;
			if (addgold != _o_.addgold) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += addgold;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(addgold).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SLiveSkillMakeFarm _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = addgold - _o_.addgold;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


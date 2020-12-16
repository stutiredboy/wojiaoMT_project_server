
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SSetTeamLevel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SSetTeamLevel extends __SSetTeamLevel__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794463;

	public int getType() {
		return 794463;
	}

	public int minlevel;
	public int maxlevel;

	public SSetTeamLevel() {
	}

	public SSetTeamLevel(int _minlevel_, int _maxlevel_) {
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SSetTeamLevel) {
			SSetTeamLevel _o_ = (SSetTeamLevel)_o1_;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += minlevel;
		_h_ += maxlevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SSetTeamLevel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = minlevel - _o_.minlevel;
		if (0 != _c_) return _c_;
		_c_ = maxlevel - _o_.maxlevel;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


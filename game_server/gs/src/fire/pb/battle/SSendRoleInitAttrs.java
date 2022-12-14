
package fire.pb.battle;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SSendRoleInitAttrs__ extends mkio.Protocol { }

/** battle conduct protocol
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SSendRoleInitAttrs extends __SSendRoleInitAttrs__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793455;

	public int getType() {
		return 793455;
	}

	public java.util.HashMap<Integer,Float> roleinitattrs; // 进战斗时主角的二级属性

	public SSendRoleInitAttrs() {
		roleinitattrs = new java.util.HashMap<Integer,Float>();
	}

	public SSendRoleInitAttrs(java.util.HashMap<Integer,Float> _roleinitattrs_) {
		this.roleinitattrs = _roleinitattrs_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(roleinitattrs.size());
		for (java.util.Map.Entry<Integer, Float> _e_ : roleinitattrs.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			float _v_;
			_v_ = _os_.unmarshal_float();
			roleinitattrs.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SSendRoleInitAttrs) {
			SSendRoleInitAttrs _o_ = (SSendRoleInitAttrs)_o1_;
			if (!roleinitattrs.equals(_o_.roleinitattrs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += roleinitattrs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleinitattrs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


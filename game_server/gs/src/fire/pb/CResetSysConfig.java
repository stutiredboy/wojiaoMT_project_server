
package fire.pb;
import gnet.link.Onlines;

import fire.pb.PResetSysConfig;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CResetSysConfig__ extends mkio.Protocol { }

/** 客户端请求修改系统设置
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CResetSysConfig extends __CResetSysConfig__ {
	@Override
	protected void process() {
		if (null == sysconfigmap)
			return;
		if (sysconfigmap.size() > 500)
			return;
		final long roleId = Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		final PResetSysConfig pset = new PResetSysConfig(roleId, this);
		pset.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786447;

	public int getType() {
		return 786447;
	}

	public java.util.HashMap<Integer,Integer> sysconfigmap; // 客户端当前修改的系统设置

	public CResetSysConfig() {
		sysconfigmap = new java.util.HashMap<Integer,Integer>();
	}

	public CResetSysConfig(java.util.HashMap<Integer,Integer> _sysconfigmap_) {
		this.sysconfigmap = _sysconfigmap_;
	}

	public final boolean _validator_() {
		for (java.util.Map.Entry<Integer, Integer> _e_ : sysconfigmap.entrySet()) {
			if (_e_.getKey().intValue() < 0) return false;
			if (_e_.getValue().intValue() < 0) return false;
		}
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(sysconfigmap.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : sysconfigmap.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			sysconfigmap.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CResetSysConfig) {
			CResetSysConfig _o_ = (CResetSysConfig)_o1_;
			if (!sysconfigmap.equals(_o_.sysconfigmap)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += sysconfigmap.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sysconfigmap).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


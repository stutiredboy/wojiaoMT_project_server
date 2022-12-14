
package fire.pb.attr;

import robot.LoginRole;
import robot.LoginUI;
import mkio.ILoginIns;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SRefreshRoleData__ extends mkio.Protocol { }

/** 刷新人物属性的消息
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SRefreshRoleData extends __SRefreshRoleData__ {
	@Override
	protected void process() {
		ILoginIns ins = (ILoginIns)this.getContext();
		if(ins == null) return;
		LoginUI ui = (LoginUI)ins.getLoginUI();
		if(ui == null) return;
		LoginRole role = ui.getLoginRole();
		if(role == null) return;
		if(datas.containsKey(AttrType.LEVEL) && datas.get(AttrType.LEVEL) != 0){
			//说明等级发生了变化，对机器人属性做变化
			float newLevel = datas.get(AttrType.LEVEL);
			if(newLevel < role.getLevel())
				return;
			role.setLevel((int) newLevel);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 799432;

	public int getType() {
		return 799432;
	}

	public java.util.HashMap<Integer,Float> datas; // 变量值ID，变量值

	public SRefreshRoleData() {
		datas = new java.util.HashMap<Integer,Float>();
	}

	public SRefreshRoleData(java.util.HashMap<Integer,Float> _datas_) {
		this.datas = _datas_;
	}

	public final boolean _validator_() {
		for (java.util.Map.Entry<Integer, Float> _e_ : datas.entrySet()) {
			if (_e_.getKey().intValue() <= 0) return false;
		}
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(datas.size());
		for (java.util.Map.Entry<Integer, Float> _e_ : datas.entrySet()) {
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
			datas.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SRefreshRoleData) {
			SRefreshRoleData _o_ = (SRefreshRoleData)_o1_;
			if (!datas.equals(_o_.datas)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += datas.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(datas).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


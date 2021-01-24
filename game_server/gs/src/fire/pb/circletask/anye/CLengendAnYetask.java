
package fire.pb.circletask.anye;

import fire.pb.circletask.CircleTaskManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLengendAnYetask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLengendAnYetask extends __CLengendAnYetask__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;	
		CircleTaskManager.logger.info("闁猴拷鐠哄搫鐓傚ù鑲╁Ь椤曗晜绂掔拠鎻掝潳婵炴垵鐗婃导锟�.閻熸瑦甯熸竟濂�" + roleid + "]閻熸洑妞掔槐鍓佹嫚缂堢姷绉寸紓锟�?" + taskpos + "闁汇劌瀚伴埞鍫ュ箣韫囨挻绀嬪ù鐘侯嚙婵拷!");
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.startLegendAnYeTask(taskpos);
				rayt.refreshAnYeTasks(taskpos);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807458;

	public int getType() {
		return 807458;
	}

	public int taskpos; // 任务栏位

	public CLengendAnYetask() {
	}

	public CLengendAnYetask(int _taskpos_) {
		this.taskpos = _taskpos_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLengendAnYetask) {
			CLengendAnYetask _o_ = (CLengendAnYetask)_o1_;
			if (taskpos != _o_.taskpos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLengendAnYetask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = taskpos - _o_.taskpos;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


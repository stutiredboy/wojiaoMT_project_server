
package xbean.__;

import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public final class PvP3Race extends mkdb.XBean implements xbean.PvP3Race {
	private java.util.LinkedList<xbean.PvP3RaceRole> allroles; // 赛场中的角色的积分排行
	private java.util.LinkedList<Long> allrolesid; // 赛场中的角色ID
	private java.util.LinkedList<xbean.PvP3QueueRole> waitingqueue; // 等待序列

	@Override
	public void _reset_unsafe_() {
		allroles.clear();
		allrolesid.clear();
		waitingqueue.clear();
	}

	PvP3Race(int __, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
		allrolesid = new java.util.LinkedList<Long>();
		waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
	}

	public PvP3Race() {
		this(0, null, null);
	}

	public PvP3Race(PvP3Race _o_) {
		this(_o_, null, null);
	}

	PvP3Race(xbean.PvP3Race _o1_, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		if (_o1_ instanceof PvP3Race) assign((PvP3Race)_o1_);
		else if (_o1_ instanceof PvP3Race.Data) assign((PvP3Race.Data)_o1_);
		else if (_o1_ instanceof PvP3Race.Const) assign(((PvP3Race.Const)_o1_).nThis());
		else throw new UnsupportedOperationException();
	}

	private void assign(PvP3Race _o_) {
		_o_._xdb_verify_unsafe_();
		allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
		for (xbean.PvP3RaceRole _v_ : _o_.allroles)
			allroles.add(new PvP3RaceRole(_v_, this, "allroles"));
		allrolesid = new java.util.LinkedList<Long>();
		allrolesid.addAll(_o_.allrolesid);
		waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
		for (xbean.PvP3QueueRole _v_ : _o_.waitingqueue)
			waitingqueue.add(new PvP3QueueRole(_v_, this, "waitingqueue"));
	}

	private void assign(PvP3Race.Data _o_) {
		allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
		for (xbean.PvP3RaceRole _v_ : _o_.allroles)
			allroles.add(new PvP3RaceRole(_v_, this, "allroles"));
		allrolesid = new java.util.LinkedList<Long>();
		allrolesid.addAll(_o_.allrolesid);
		waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
		for (xbean.PvP3QueueRole _v_ : _o_.waitingqueue)
			waitingqueue.add(new PvP3QueueRole(_v_, this, "waitingqueue"));
	}

	@Override
	public final OctetsStream marshal(OctetsStream _os_) {
		_xdb_verify_unsafe_();
		_os_.compact_uint32(allroles.size());
		for (xbean.PvP3RaceRole _v_ : allroles) {
			_v_.marshal(_os_);
		}
		_os_.compact_uint32(allrolesid.size());
		for (Long _v_ : allrolesid) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(waitingqueue.size());
		for (xbean.PvP3QueueRole _v_ : waitingqueue) {
			_v_.marshal(_os_);
		}
		return _os_;
	}

	@Override
	public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		_xdb_verify_unsafe_();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			xbean.PvP3RaceRole _v_ = new PvP3RaceRole(0, this, "allroles");
			_v_.unmarshal(_os_);
			allroles.add(_v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			long _v_ = 0;
			_v_ = _os_.unmarshal_long();
			allrolesid.add(_v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			xbean.PvP3QueueRole _v_ = new PvP3QueueRole(0, this, "waitingqueue");
			_v_.unmarshal(_os_);
			waitingqueue.add(_v_);
		}
		return _os_;
	}

	@Override
	public xbean.PvP3Race copy() {
		_xdb_verify_unsafe_();
		return new PvP3Race(this);
	}

	@Override
	public xbean.PvP3Race toData() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.PvP3Race toBean() {
		_xdb_verify_unsafe_();
		return new PvP3Race(this); // same as copy()
	}

	@Override
	public xbean.PvP3Race toDataIf() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.PvP3Race toBeanIf() {
		_xdb_verify_unsafe_();
		return this;
	}

	@Override
	public mkdb.Bean toConst() {
		_xdb_verify_unsafe_();
		return new Const();
	}

	@Override
	public java.util.List<xbean.PvP3RaceRole> getAllroles() { // 赛场中的角色的积分排行
		_xdb_verify_unsafe_();
		return mkdb.Logs.logList(new mkdb.LogKey(this, "allroles"), allroles);
	}

	public java.util.List<xbean.PvP3RaceRole> getAllrolesAsData() { // 赛场中的角色的积分排行
		_xdb_verify_unsafe_();
		java.util.List<xbean.PvP3RaceRole> allroles;
		PvP3Race _o_ = this;
		allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
		for (xbean.PvP3RaceRole _v_ : _o_.allroles)
			allroles.add(new PvP3RaceRole.Data(_v_));
		return allroles;
	}

	@Override
	public java.util.List<Long> getAllrolesid() { // 赛场中的角色ID
		_xdb_verify_unsafe_();
		return mkdb.Logs.logList(new mkdb.LogKey(this, "allrolesid"), allrolesid);
	}

	public java.util.List<Long> getAllrolesidAsData() { // 赛场中的角色ID
		_xdb_verify_unsafe_();
		java.util.List<Long> allrolesid;
		PvP3Race _o_ = this;
		allrolesid = new java.util.LinkedList<Long>();
		allrolesid.addAll(_o_.allrolesid);
		return allrolesid;
	}

	@Override
	public java.util.List<xbean.PvP3QueueRole> getWaitingqueue() { // 等待序列
		_xdb_verify_unsafe_();
		return mkdb.Logs.logList(new mkdb.LogKey(this, "waitingqueue"), waitingqueue);
	}

	public java.util.List<xbean.PvP3QueueRole> getWaitingqueueAsData() { // 等待序列
		_xdb_verify_unsafe_();
		java.util.List<xbean.PvP3QueueRole> waitingqueue;
		PvP3Race _o_ = this;
		waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
		for (xbean.PvP3QueueRole _v_ : _o_.waitingqueue)
			waitingqueue.add(new PvP3QueueRole.Data(_v_));
		return waitingqueue;
	}

	@Override
	public final boolean equals(Object _o1_) {
		_xdb_verify_unsafe_();
		PvP3Race _o_ = null;
		if ( _o1_ instanceof PvP3Race ) _o_ = (PvP3Race)_o1_;
		else if ( _o1_ instanceof PvP3Race.Const ) _o_ = ((PvP3Race.Const)_o1_).nThis();
		else return false;
		if (!allroles.equals(_o_.allroles)) return false;
		if (!allrolesid.equals(_o_.allrolesid)) return false;
		if (!waitingqueue.equals(_o_.waitingqueue)) return false;
		return true;
	}

	@Override
	public final int hashCode() {
		_xdb_verify_unsafe_();
		int _h_ = 0;
		_h_ += allroles.hashCode();
		_h_ += allrolesid.hashCode();
		_h_ += waitingqueue.hashCode();
		return _h_;
	}

	@Override
	public String toString() {
		_xdb_verify_unsafe_();
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(allroles);
		_sb_.append(",");
		_sb_.append(allrolesid);
		_sb_.append(",");
		_sb_.append(waitingqueue);
		_sb_.append(")");
		return _sb_.toString();
	}

	@Override
	public mkdb.logs.Listenable newListenable() {
		mkdb.logs.ListenableBean lb = new mkdb.logs.ListenableBean();
		lb.add(new mkdb.logs.ListenableChanged().setVarName("allroles"));
		lb.add(new mkdb.logs.ListenableChanged().setVarName("allrolesid"));
		lb.add(new mkdb.logs.ListenableChanged().setVarName("waitingqueue"));
		return lb;
	}

	private class Const implements xbean.PvP3Race {
		PvP3Race nThis() {
			return PvP3Race.this;
		}

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		@Override
		public xbean.PvP3Race copy() {
			return PvP3Race.this.copy();
		}

		@Override
		public xbean.PvP3Race toData() {
			return PvP3Race.this.toData();
		}

		public xbean.PvP3Race toBean() {
			return PvP3Race.this.toBean();
		}

		@Override
		public xbean.PvP3Race toDataIf() {
			return PvP3Race.this.toDataIf();
		}

		public xbean.PvP3Race toBeanIf() {
			return PvP3Race.this.toBeanIf();
		}

		@Override
		public java.util.List<xbean.PvP3RaceRole> getAllroles() { // 赛场中的角色的积分排行
			_xdb_verify_unsafe_();
			return mkdb.Consts.constList(allroles);
		}

		public java.util.List<xbean.PvP3RaceRole> getAllrolesAsData() { // 赛场中的角色的积分排行
			_xdb_verify_unsafe_();
			java.util.List<xbean.PvP3RaceRole> allroles;
			PvP3Race _o_ = PvP3Race.this;
		allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
		for (xbean.PvP3RaceRole _v_ : _o_.allroles)
			allroles.add(new PvP3RaceRole.Data(_v_));
			return allroles;
		}

		@Override
		public java.util.List<Long> getAllrolesid() { // 赛场中的角色ID
			_xdb_verify_unsafe_();
			return mkdb.Consts.constList(allrolesid);
		}

		public java.util.List<Long> getAllrolesidAsData() { // 赛场中的角色ID
			_xdb_verify_unsafe_();
			java.util.List<Long> allrolesid;
			PvP3Race _o_ = PvP3Race.this;
		allrolesid = new java.util.LinkedList<Long>();
		allrolesid.addAll(_o_.allrolesid);
			return allrolesid;
		}

		@Override
		public java.util.List<xbean.PvP3QueueRole> getWaitingqueue() { // 等待序列
			_xdb_verify_unsafe_();
			return mkdb.Consts.constList(waitingqueue);
		}

		public java.util.List<xbean.PvP3QueueRole> getWaitingqueueAsData() { // 等待序列
			_xdb_verify_unsafe_();
			java.util.List<xbean.PvP3QueueRole> waitingqueue;
			PvP3Race _o_ = PvP3Race.this;
		waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
		for (xbean.PvP3QueueRole _v_ : _o_.waitingqueue)
			waitingqueue.add(new PvP3QueueRole.Data(_v_));
			return waitingqueue;
		}

		@Override
		public mkdb.Bean toConst() {
			_xdb_verify_unsafe_();
			return this;
		}

		@Override
		public boolean isConst() {
			_xdb_verify_unsafe_();
			return true;
		}

		@Override
		public boolean isData() {
			return PvP3Race.this.isData();
		}

		@Override
		public OctetsStream marshal(OctetsStream _os_) {
			return PvP3Race.this.marshal(_os_);
		}

		@Override
		public OctetsStream unmarshal(OctetsStream arg0) throws MarshalException {
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public mkdb.Bean xdbParent() {
			return PvP3Race.this.xdbParent();
		}

		@Override
		public boolean xdbManaged() {
			return PvP3Race.this.xdbManaged();
		}

		@Override
		public String xdbVarname() {
			return PvP3Race.this.xdbVarname();
		}

		@Override
		public Long xdbObjId() {
			return PvP3Race.this.xdbObjId();
		}

		@Override
		public boolean equals(Object obj) {
			return PvP3Race.this.equals(obj);
		}

		@Override
		public int hashCode() {
			return PvP3Race.this.hashCode();
		}

		@Override
		public String toString() {
			return PvP3Race.this.toString();
		}

	}

	public static final class Data implements xbean.PvP3Race {
		private java.util.LinkedList<xbean.PvP3RaceRole> allroles; // 赛场中的角色的积分排行
		private java.util.LinkedList<Long> allrolesid; // 赛场中的角色ID
		private java.util.LinkedList<xbean.PvP3QueueRole> waitingqueue; // 等待序列

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		public Data() {
			allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
			allrolesid = new java.util.LinkedList<Long>();
			waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
		}

		Data(xbean.PvP3Race _o1_) {
			if (_o1_ instanceof PvP3Race) assign((PvP3Race)_o1_);
			else if (_o1_ instanceof PvP3Race.Data) assign((PvP3Race.Data)_o1_);
			else if (_o1_ instanceof PvP3Race.Const) assign(((PvP3Race.Const)_o1_).nThis());
			else throw new UnsupportedOperationException();
		}

		private void assign(PvP3Race _o_) {
			allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
			for (xbean.PvP3RaceRole _v_ : _o_.allroles)
				allroles.add(new PvP3RaceRole.Data(_v_));
			allrolesid = new java.util.LinkedList<Long>();
			allrolesid.addAll(_o_.allrolesid);
			waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
			for (xbean.PvP3QueueRole _v_ : _o_.waitingqueue)
				waitingqueue.add(new PvP3QueueRole.Data(_v_));
		}

		private void assign(PvP3Race.Data _o_) {
			allroles = new java.util.LinkedList<xbean.PvP3RaceRole>();
			for (xbean.PvP3RaceRole _v_ : _o_.allroles)
				allroles.add(new PvP3RaceRole.Data(_v_));
			allrolesid = new java.util.LinkedList<Long>();
			allrolesid.addAll(_o_.allrolesid);
			waitingqueue = new java.util.LinkedList<xbean.PvP3QueueRole>();
			for (xbean.PvP3QueueRole _v_ : _o_.waitingqueue)
				waitingqueue.add(new PvP3QueueRole.Data(_v_));
		}

		@Override
		public final OctetsStream marshal(OctetsStream _os_) {
			_os_.compact_uint32(allroles.size());
			for (xbean.PvP3RaceRole _v_ : allroles) {
				_v_.marshal(_os_);
			}
			_os_.compact_uint32(allrolesid.size());
			for (Long _v_ : allrolesid) {
				_os_.marshal(_v_);
			}
			_os_.compact_uint32(waitingqueue.size());
			for (xbean.PvP3QueueRole _v_ : waitingqueue) {
				_v_.marshal(_os_);
			}
			return _os_;
		}

		@Override
		public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
			for (int size = _os_.uncompact_uint32(); size > 0; --size) {
				xbean.PvP3RaceRole _v_ = xbean.Pod.newPvP3RaceRoleData();
				_v_.unmarshal(_os_);
				allroles.add(_v_);
			}
			for (int size = _os_.uncompact_uint32(); size > 0; --size) {
				long _v_ = 0;
				_v_ = _os_.unmarshal_long();
				allrolesid.add(_v_);
			}
			for (int size = _os_.uncompact_uint32(); size > 0; --size) {
				xbean.PvP3QueueRole _v_ = xbean.Pod.newPvP3QueueRoleData();
				_v_.unmarshal(_os_);
				waitingqueue.add(_v_);
			}
			return _os_;
		}

		@Override
		public xbean.PvP3Race copy() {
			return new Data(this);
		}

		@Override
		public xbean.PvP3Race toData() {
			return new Data(this);
		}

		public xbean.PvP3Race toBean() {
			return new PvP3Race(this, null, null);
		}

		@Override
		public xbean.PvP3Race toDataIf() {
			return this;
		}

		public xbean.PvP3Race toBeanIf() {
			return new PvP3Race(this, null, null);
		}

		// mkdb.Bean interface. Data Unsupported
		public boolean xdbManaged() { throw new UnsupportedOperationException(); }
		public mkdb.Bean xdbParent() { throw new UnsupportedOperationException(); }
		public String xdbVarname()  { throw new UnsupportedOperationException(); }
		public Long    xdbObjId()   { throw new UnsupportedOperationException(); }
		public mkdb.Bean toConst()   { throw new UnsupportedOperationException(); }
		public boolean isConst()    { return false; }
		public boolean isData()     { return true; }

		@Override
		public java.util.List<xbean.PvP3RaceRole> getAllroles() { // 赛场中的角色的积分排行
			return allroles;
		}

		@Override
		public java.util.List<xbean.PvP3RaceRole> getAllrolesAsData() { // 赛场中的角色的积分排行
			return allroles;
		}

		@Override
		public java.util.List<Long> getAllrolesid() { // 赛场中的角色ID
			return allrolesid;
		}

		@Override
		public java.util.List<Long> getAllrolesidAsData() { // 赛场中的角色ID
			return allrolesid;
		}

		@Override
		public java.util.List<xbean.PvP3QueueRole> getWaitingqueue() { // 等待序列
			return waitingqueue;
		}

		@Override
		public java.util.List<xbean.PvP3QueueRole> getWaitingqueueAsData() { // 等待序列
			return waitingqueue;
		}

		@Override
		public final boolean equals(Object _o1_) {
			if (!(_o1_ instanceof PvP3Race.Data)) return false;
			PvP3Race.Data _o_ = (PvP3Race.Data) _o1_;
			if (!allroles.equals(_o_.allroles)) return false;
			if (!allrolesid.equals(_o_.allrolesid)) return false;
			if (!waitingqueue.equals(_o_.waitingqueue)) return false;
			return true;
		}

		@Override
		public final int hashCode() {
			int _h_ = 0;
			_h_ += allroles.hashCode();
			_h_ += allrolesid.hashCode();
			_h_ += waitingqueue.hashCode();
			return _h_;
		}

		@Override
		public String toString() {
			StringBuilder _sb_ = new StringBuilder();
			_sb_.append("(");
			_sb_.append(allroles);
			_sb_.append(",");
			_sb_.append(allrolesid);
			_sb_.append(",");
			_sb_.append(waitingqueue);
			_sb_.append(")");
			return _sb_.toString();
		}

	}
}

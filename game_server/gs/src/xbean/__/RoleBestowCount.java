
package xbean.__;

import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public final class RoleBestowCount extends mkdb.XBean implements xbean.RoleBestowCount {
	private int opentimes; // 拾取次数
	private long lastopentime; // 上次拾取时间

	@Override
	public void _reset_unsafe_() {
		opentimes = 0;
		lastopentime = 0L;
	}

	RoleBestowCount(int __, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
	}

	public RoleBestowCount() {
		this(0, null, null);
	}

	public RoleBestowCount(RoleBestowCount _o_) {
		this(_o_, null, null);
	}

	RoleBestowCount(xbean.RoleBestowCount _o1_, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		if (_o1_ instanceof RoleBestowCount) assign((RoleBestowCount)_o1_);
		else if (_o1_ instanceof RoleBestowCount.Data) assign((RoleBestowCount.Data)_o1_);
		else if (_o1_ instanceof RoleBestowCount.Const) assign(((RoleBestowCount.Const)_o1_).nThis());
		else throw new UnsupportedOperationException();
	}

	private void assign(RoleBestowCount _o_) {
		_o_._xdb_verify_unsafe_();
		opentimes = _o_.opentimes;
		lastopentime = _o_.lastopentime;
	}

	private void assign(RoleBestowCount.Data _o_) {
		opentimes = _o_.opentimes;
		lastopentime = _o_.lastopentime;
	}

	@Override
	public final OctetsStream marshal(OctetsStream _os_) {
		_xdb_verify_unsafe_();
		_os_.marshal(opentimes);
		_os_.marshal(lastopentime);
		return _os_;
	}

	@Override
	public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		_xdb_verify_unsafe_();
		opentimes = _os_.unmarshal_int();
		lastopentime = _os_.unmarshal_long();
		return _os_;
	}

	@Override
	public xbean.RoleBestowCount copy() {
		_xdb_verify_unsafe_();
		return new RoleBestowCount(this);
	}

	@Override
	public xbean.RoleBestowCount toData() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.RoleBestowCount toBean() {
		_xdb_verify_unsafe_();
		return new RoleBestowCount(this); // same as copy()
	}

	@Override
	public xbean.RoleBestowCount toDataIf() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.RoleBestowCount toBeanIf() {
		_xdb_verify_unsafe_();
		return this;
	}

	@Override
	public mkdb.Bean toConst() {
		_xdb_verify_unsafe_();
		return new Const();
	}

	@Override
	public int getOpentimes() { // 拾取次数
		_xdb_verify_unsafe_();
		return opentimes;
	}

	@Override
	public long getLastopentime() { // 上次拾取时间
		_xdb_verify_unsafe_();
		return lastopentime;
	}

	@Override
	public void setOpentimes(int _v_) { // 拾取次数
		_xdb_verify_unsafe_();
		mkdb.Logs.logIf(new mkdb.LogKey(this, "opentimes") {
			protected mkdb.Log create() {
				return new mkdb.logs.LogInt(this, opentimes) {
					public void rollback() { opentimes = _xdb_saved; }
				};}});
		opentimes = _v_;
	}

	@Override
	public void setLastopentime(long _v_) { // 上次拾取时间
		_xdb_verify_unsafe_();
		mkdb.Logs.logIf(new mkdb.LogKey(this, "lastopentime") {
			protected mkdb.Log create() {
				return new mkdb.logs.LogLong(this, lastopentime) {
					public void rollback() { lastopentime = _xdb_saved; }
				};}});
		lastopentime = _v_;
	}

	@Override
	public final boolean equals(Object _o1_) {
		_xdb_verify_unsafe_();
		RoleBestowCount _o_ = null;
		if ( _o1_ instanceof RoleBestowCount ) _o_ = (RoleBestowCount)_o1_;
		else if ( _o1_ instanceof RoleBestowCount.Const ) _o_ = ((RoleBestowCount.Const)_o1_).nThis();
		else return false;
		if (opentimes != _o_.opentimes) return false;
		if (lastopentime != _o_.lastopentime) return false;
		return true;
	}

	@Override
	public final int hashCode() {
		_xdb_verify_unsafe_();
		int _h_ = 0;
		_h_ += opentimes;
		_h_ += lastopentime;
		return _h_;
	}

	@Override
	public String toString() {
		_xdb_verify_unsafe_();
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(opentimes);
		_sb_.append(",");
		_sb_.append(lastopentime);
		_sb_.append(")");
		return _sb_.toString();
	}

	@Override
	public mkdb.logs.Listenable newListenable() {
		mkdb.logs.ListenableBean lb = new mkdb.logs.ListenableBean();
		lb.add(new mkdb.logs.ListenableChanged().setVarName("opentimes"));
		lb.add(new mkdb.logs.ListenableChanged().setVarName("lastopentime"));
		return lb;
	}

	private class Const implements xbean.RoleBestowCount {
		RoleBestowCount nThis() {
			return RoleBestowCount.this;
		}

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		@Override
		public xbean.RoleBestowCount copy() {
			return RoleBestowCount.this.copy();
		}

		@Override
		public xbean.RoleBestowCount toData() {
			return RoleBestowCount.this.toData();
		}

		public xbean.RoleBestowCount toBean() {
			return RoleBestowCount.this.toBean();
		}

		@Override
		public xbean.RoleBestowCount toDataIf() {
			return RoleBestowCount.this.toDataIf();
		}

		public xbean.RoleBestowCount toBeanIf() {
			return RoleBestowCount.this.toBeanIf();
		}

		@Override
		public int getOpentimes() { // 拾取次数
			_xdb_verify_unsafe_();
			return opentimes;
		}

		@Override
		public long getLastopentime() { // 上次拾取时间
			_xdb_verify_unsafe_();
			return lastopentime;
		}

		@Override
		public void setOpentimes(int _v_) { // 拾取次数
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public void setLastopentime(long _v_) { // 上次拾取时间
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
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
			return RoleBestowCount.this.isData();
		}

		@Override
		public OctetsStream marshal(OctetsStream _os_) {
			return RoleBestowCount.this.marshal(_os_);
		}

		@Override
		public OctetsStream unmarshal(OctetsStream arg0) throws MarshalException {
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public mkdb.Bean xdbParent() {
			return RoleBestowCount.this.xdbParent();
		}

		@Override
		public boolean xdbManaged() {
			return RoleBestowCount.this.xdbManaged();
		}

		@Override
		public String xdbVarname() {
			return RoleBestowCount.this.xdbVarname();
		}

		@Override
		public Long xdbObjId() {
			return RoleBestowCount.this.xdbObjId();
		}

		@Override
		public boolean equals(Object obj) {
			return RoleBestowCount.this.equals(obj);
		}

		@Override
		public int hashCode() {
			return RoleBestowCount.this.hashCode();
		}

		@Override
		public String toString() {
			return RoleBestowCount.this.toString();
		}

	}

	public static final class Data implements xbean.RoleBestowCount {
		private int opentimes; // 拾取次数
		private long lastopentime; // 上次拾取时间

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		public Data() {
		}

		Data(xbean.RoleBestowCount _o1_) {
			if (_o1_ instanceof RoleBestowCount) assign((RoleBestowCount)_o1_);
			else if (_o1_ instanceof RoleBestowCount.Data) assign((RoleBestowCount.Data)_o1_);
			else if (_o1_ instanceof RoleBestowCount.Const) assign(((RoleBestowCount.Const)_o1_).nThis());
			else throw new UnsupportedOperationException();
		}

		private void assign(RoleBestowCount _o_) {
			opentimes = _o_.opentimes;
			lastopentime = _o_.lastopentime;
		}

		private void assign(RoleBestowCount.Data _o_) {
			opentimes = _o_.opentimes;
			lastopentime = _o_.lastopentime;
		}

		@Override
		public final OctetsStream marshal(OctetsStream _os_) {
			_os_.marshal(opentimes);
			_os_.marshal(lastopentime);
			return _os_;
		}

		@Override
		public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
			opentimes = _os_.unmarshal_int();
			lastopentime = _os_.unmarshal_long();
			return _os_;
		}

		@Override
		public xbean.RoleBestowCount copy() {
			return new Data(this);
		}

		@Override
		public xbean.RoleBestowCount toData() {
			return new Data(this);
		}

		public xbean.RoleBestowCount toBean() {
			return new RoleBestowCount(this, null, null);
		}

		@Override
		public xbean.RoleBestowCount toDataIf() {
			return this;
		}

		public xbean.RoleBestowCount toBeanIf() {
			return new RoleBestowCount(this, null, null);
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
		public int getOpentimes() { // 拾取次数
			return opentimes;
		}

		@Override
		public long getLastopentime() { // 上次拾取时间
			return lastopentime;
		}

		@Override
		public void setOpentimes(int _v_) { // 拾取次数
			opentimes = _v_;
		}

		@Override
		public void setLastopentime(long _v_) { // 上次拾取时间
			lastopentime = _v_;
		}

		@Override
		public final boolean equals(Object _o1_) {
			if (!(_o1_ instanceof RoleBestowCount.Data)) return false;
			RoleBestowCount.Data _o_ = (RoleBestowCount.Data) _o1_;
			if (opentimes != _o_.opentimes) return false;
			if (lastopentime != _o_.lastopentime) return false;
			return true;
		}

		@Override
		public final int hashCode() {
			int _h_ = 0;
			_h_ += opentimes;
			_h_ += lastopentime;
			return _h_;
		}

		@Override
		public String toString() {
			StringBuilder _sb_ = new StringBuilder();
			_sb_.append("(");
			_sb_.append(opentimes);
			_sb_.append(",");
			_sb_.append(lastopentime);
			_sb_.append(")");
			return _sb_.toString();
		}

	}
}

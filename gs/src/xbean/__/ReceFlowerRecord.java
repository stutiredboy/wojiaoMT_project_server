
package xbean.__;

import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public final class ReceFlowerRecord extends mkdb.XBean implements xbean.ReceFlowerRecord {
	private long triggertime; // 
	private xbean.MarshalReceFlowerRecord marshaldata; // 

	@Override
	public void _reset_unsafe_() {
		triggertime = 0L;
		marshaldata._reset_unsafe_();
	}

	ReceFlowerRecord(int __, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		marshaldata = new MarshalReceFlowerRecord(0, this, "marshaldata");
	}

	public ReceFlowerRecord() {
		this(0, null, null);
	}

	public ReceFlowerRecord(ReceFlowerRecord _o_) {
		this(_o_, null, null);
	}

	ReceFlowerRecord(xbean.ReceFlowerRecord _o1_, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		if (_o1_ instanceof ReceFlowerRecord) assign((ReceFlowerRecord)_o1_);
		else if (_o1_ instanceof ReceFlowerRecord.Data) assign((ReceFlowerRecord.Data)_o1_);
		else if (_o1_ instanceof ReceFlowerRecord.Const) assign(((ReceFlowerRecord.Const)_o1_).nThis());
		else throw new UnsupportedOperationException();
	}

	private void assign(ReceFlowerRecord _o_) {
		_o_._xdb_verify_unsafe_();
		triggertime = _o_.triggertime;
		marshaldata = new MarshalReceFlowerRecord(_o_.marshaldata, this, "marshaldata");
	}

	private void assign(ReceFlowerRecord.Data _o_) {
		triggertime = _o_.triggertime;
		marshaldata = new MarshalReceFlowerRecord(_o_.marshaldata, this, "marshaldata");
	}

	@Override
	public final OctetsStream marshal(OctetsStream _os_) {
		_xdb_verify_unsafe_();
		_os_.marshal(triggertime);
		marshaldata.marshal(_os_);
		return _os_;
	}

	@Override
	public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		_xdb_verify_unsafe_();
		triggertime = _os_.unmarshal_long();
		marshaldata.unmarshal(_os_);
		return _os_;
	}

	@Override
	public xbean.ReceFlowerRecord copy() {
		_xdb_verify_unsafe_();
		return new ReceFlowerRecord(this);
	}

	@Override
	public xbean.ReceFlowerRecord toData() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.ReceFlowerRecord toBean() {
		_xdb_verify_unsafe_();
		return new ReceFlowerRecord(this); // same as copy()
	}

	@Override
	public xbean.ReceFlowerRecord toDataIf() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.ReceFlowerRecord toBeanIf() {
		_xdb_verify_unsafe_();
		return this;
	}

	@Override
	public mkdb.Bean toConst() {
		_xdb_verify_unsafe_();
		return new Const();
	}

	@Override
	public long getTriggertime() { // 
		_xdb_verify_unsafe_();
		return triggertime;
	}

	@Override
	public xbean.MarshalReceFlowerRecord getMarshaldata() { // 
		_xdb_verify_unsafe_();
		return marshaldata;
	}

	@Override
	public void setTriggertime(long _v_) { // 
		_xdb_verify_unsafe_();
		mkdb.Logs.logIf(new mkdb.LogKey(this, "triggertime") {
			protected mkdb.Log create() {
				return new mkdb.logs.LogLong(this, triggertime) {
					public void rollback() { triggertime = _xdb_saved; }
				};}});
		triggertime = _v_;
	}

	@Override
	public final boolean equals(Object _o1_) {
		_xdb_verify_unsafe_();
		ReceFlowerRecord _o_ = null;
		if ( _o1_ instanceof ReceFlowerRecord ) _o_ = (ReceFlowerRecord)_o1_;
		else if ( _o1_ instanceof ReceFlowerRecord.Const ) _o_ = ((ReceFlowerRecord.Const)_o1_).nThis();
		else return false;
		if (triggertime != _o_.triggertime) return false;
		if (!marshaldata.equals(_o_.marshaldata)) return false;
		return true;
	}

	@Override
	public final int hashCode() {
		_xdb_verify_unsafe_();
		int _h_ = 0;
		_h_ += triggertime;
		_h_ += marshaldata.hashCode();
		return _h_;
	}

	@Override
	public String toString() {
		_xdb_verify_unsafe_();
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(triggertime);
		_sb_.append(",");
		_sb_.append(marshaldata);
		_sb_.append(")");
		return _sb_.toString();
	}

	@Override
	public mkdb.logs.Listenable newListenable() {
		mkdb.logs.ListenableBean lb = new mkdb.logs.ListenableBean();
		lb.add(new mkdb.logs.ListenableChanged().setVarName("triggertime"));
		lb.add(new mkdb.logs.ListenableChanged().setVarName("marshaldata"));
		return lb;
	}

	private class Const implements xbean.ReceFlowerRecord {
		ReceFlowerRecord nThis() {
			return ReceFlowerRecord.this;
		}

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		@Override
		public xbean.ReceFlowerRecord copy() {
			return ReceFlowerRecord.this.copy();
		}

		@Override
		public xbean.ReceFlowerRecord toData() {
			return ReceFlowerRecord.this.toData();
		}

		public xbean.ReceFlowerRecord toBean() {
			return ReceFlowerRecord.this.toBean();
		}

		@Override
		public xbean.ReceFlowerRecord toDataIf() {
			return ReceFlowerRecord.this.toDataIf();
		}

		public xbean.ReceFlowerRecord toBeanIf() {
			return ReceFlowerRecord.this.toBeanIf();
		}

		@Override
		public long getTriggertime() { // 
			_xdb_verify_unsafe_();
			return triggertime;
		}

		@Override
		public xbean.MarshalReceFlowerRecord getMarshaldata() { // 
			_xdb_verify_unsafe_();
			return mkdb.Consts.toConst(marshaldata);
		}

		@Override
		public void setTriggertime(long _v_) { // 
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
			return ReceFlowerRecord.this.isData();
		}

		@Override
		public OctetsStream marshal(OctetsStream _os_) {
			return ReceFlowerRecord.this.marshal(_os_);
		}

		@Override
		public OctetsStream unmarshal(OctetsStream arg0) throws MarshalException {
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public mkdb.Bean xdbParent() {
			return ReceFlowerRecord.this.xdbParent();
		}

		@Override
		public boolean xdbManaged() {
			return ReceFlowerRecord.this.xdbManaged();
		}

		@Override
		public String xdbVarname() {
			return ReceFlowerRecord.this.xdbVarname();
		}

		@Override
		public Long xdbObjId() {
			return ReceFlowerRecord.this.xdbObjId();
		}

		@Override
		public boolean equals(Object obj) {
			return ReceFlowerRecord.this.equals(obj);
		}

		@Override
		public int hashCode() {
			return ReceFlowerRecord.this.hashCode();
		}

		@Override
		public String toString() {
			return ReceFlowerRecord.this.toString();
		}

	}

	public static final class Data implements xbean.ReceFlowerRecord {
		private long triggertime; // 
		private xbean.MarshalReceFlowerRecord marshaldata; // 

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		public Data() {
			marshaldata = new MarshalReceFlowerRecord.Data();
		}

		Data(xbean.ReceFlowerRecord _o1_) {
			if (_o1_ instanceof ReceFlowerRecord) assign((ReceFlowerRecord)_o1_);
			else if (_o1_ instanceof ReceFlowerRecord.Data) assign((ReceFlowerRecord.Data)_o1_);
			else if (_o1_ instanceof ReceFlowerRecord.Const) assign(((ReceFlowerRecord.Const)_o1_).nThis());
			else throw new UnsupportedOperationException();
		}

		private void assign(ReceFlowerRecord _o_) {
			triggertime = _o_.triggertime;
			marshaldata = new MarshalReceFlowerRecord.Data(_o_.marshaldata);
		}

		private void assign(ReceFlowerRecord.Data _o_) {
			triggertime = _o_.triggertime;
			marshaldata = new MarshalReceFlowerRecord.Data(_o_.marshaldata);
		}

		@Override
		public final OctetsStream marshal(OctetsStream _os_) {
			_os_.marshal(triggertime);
			marshaldata.marshal(_os_);
			return _os_;
		}

		@Override
		public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
			triggertime = _os_.unmarshal_long();
			marshaldata.unmarshal(_os_);
			return _os_;
		}

		@Override
		public xbean.ReceFlowerRecord copy() {
			return new Data(this);
		}

		@Override
		public xbean.ReceFlowerRecord toData() {
			return new Data(this);
		}

		public xbean.ReceFlowerRecord toBean() {
			return new ReceFlowerRecord(this, null, null);
		}

		@Override
		public xbean.ReceFlowerRecord toDataIf() {
			return this;
		}

		public xbean.ReceFlowerRecord toBeanIf() {
			return new ReceFlowerRecord(this, null, null);
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
		public long getTriggertime() { // 
			return triggertime;
		}

		@Override
		public xbean.MarshalReceFlowerRecord getMarshaldata() { // 
			return marshaldata;
		}

		@Override
		public void setTriggertime(long _v_) { // 
			triggertime = _v_;
		}

		@Override
		public final boolean equals(Object _o1_) {
			if (!(_o1_ instanceof ReceFlowerRecord.Data)) return false;
			ReceFlowerRecord.Data _o_ = (ReceFlowerRecord.Data) _o1_;
			if (triggertime != _o_.triggertime) return false;
			if (!marshaldata.equals(_o_.marshaldata)) return false;
			return true;
		}

		@Override
		public final int hashCode() {
			int _h_ = 0;
			_h_ += triggertime;
			_h_ += marshaldata.hashCode();
			return _h_;
		}

		@Override
		public String toString() {
			StringBuilder _sb_ = new StringBuilder();
			_sb_.append("(");
			_sb_.append(triggertime);
			_sb_.append(",");
			_sb_.append(marshaldata);
			_sb_.append(")");
			return _sb_.toString();
		}

	}
}


package xbean.__;

import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public final class ClanFightHistroyRankRecord extends mkdb.XBean implements xbean.ClanFightHistroyRankRecord {
	private long triggertime; // 
	private xbean.MarshalClanFightHistroyRankRecord marshaldata; // 

	@Override
	public void _reset_unsafe_() {
		triggertime = 0L;
		marshaldata._reset_unsafe_();
	}

	ClanFightHistroyRankRecord(int __, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		marshaldata = new MarshalClanFightHistroyRankRecord(0, this, "marshaldata");
	}

	public ClanFightHistroyRankRecord() {
		this(0, null, null);
	}

	public ClanFightHistroyRankRecord(ClanFightHistroyRankRecord _o_) {
		this(_o_, null, null);
	}

	ClanFightHistroyRankRecord(xbean.ClanFightHistroyRankRecord _o1_, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		if (_o1_ instanceof ClanFightHistroyRankRecord) assign((ClanFightHistroyRankRecord)_o1_);
		else if (_o1_ instanceof ClanFightHistroyRankRecord.Data) assign((ClanFightHistroyRankRecord.Data)_o1_);
		else if (_o1_ instanceof ClanFightHistroyRankRecord.Const) assign(((ClanFightHistroyRankRecord.Const)_o1_).nThis());
		else throw new UnsupportedOperationException();
	}

	private void assign(ClanFightHistroyRankRecord _o_) {
		_o_._xdb_verify_unsafe_();
		triggertime = _o_.triggertime;
		marshaldata = new MarshalClanFightHistroyRankRecord(_o_.marshaldata, this, "marshaldata");
	}

	private void assign(ClanFightHistroyRankRecord.Data _o_) {
		triggertime = _o_.triggertime;
		marshaldata = new MarshalClanFightHistroyRankRecord(_o_.marshaldata, this, "marshaldata");
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
	public xbean.ClanFightHistroyRankRecord copy() {
		_xdb_verify_unsafe_();
		return new ClanFightHistroyRankRecord(this);
	}

	@Override
	public xbean.ClanFightHistroyRankRecord toData() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.ClanFightHistroyRankRecord toBean() {
		_xdb_verify_unsafe_();
		return new ClanFightHistroyRankRecord(this); // same as copy()
	}

	@Override
	public xbean.ClanFightHistroyRankRecord toDataIf() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.ClanFightHistroyRankRecord toBeanIf() {
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
	public xbean.MarshalClanFightHistroyRankRecord getMarshaldata() { // 
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
		ClanFightHistroyRankRecord _o_ = null;
		if ( _o1_ instanceof ClanFightHistroyRankRecord ) _o_ = (ClanFightHistroyRankRecord)_o1_;
		else if ( _o1_ instanceof ClanFightHistroyRankRecord.Const ) _o_ = ((ClanFightHistroyRankRecord.Const)_o1_).nThis();
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

	private class Const implements xbean.ClanFightHistroyRankRecord {
		ClanFightHistroyRankRecord nThis() {
			return ClanFightHistroyRankRecord.this;
		}

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		@Override
		public xbean.ClanFightHistroyRankRecord copy() {
			return ClanFightHistroyRankRecord.this.copy();
		}

		@Override
		public xbean.ClanFightHistroyRankRecord toData() {
			return ClanFightHistroyRankRecord.this.toData();
		}

		public xbean.ClanFightHistroyRankRecord toBean() {
			return ClanFightHistroyRankRecord.this.toBean();
		}

		@Override
		public xbean.ClanFightHistroyRankRecord toDataIf() {
			return ClanFightHistroyRankRecord.this.toDataIf();
		}

		public xbean.ClanFightHistroyRankRecord toBeanIf() {
			return ClanFightHistroyRankRecord.this.toBeanIf();
		}

		@Override
		public long getTriggertime() { // 
			_xdb_verify_unsafe_();
			return triggertime;
		}

		@Override
		public xbean.MarshalClanFightHistroyRankRecord getMarshaldata() { // 
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
			return ClanFightHistroyRankRecord.this.isData();
		}

		@Override
		public OctetsStream marshal(OctetsStream _os_) {
			return ClanFightHistroyRankRecord.this.marshal(_os_);
		}

		@Override
		public OctetsStream unmarshal(OctetsStream arg0) throws MarshalException {
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public mkdb.Bean xdbParent() {
			return ClanFightHistroyRankRecord.this.xdbParent();
		}

		@Override
		public boolean xdbManaged() {
			return ClanFightHistroyRankRecord.this.xdbManaged();
		}

		@Override
		public String xdbVarname() {
			return ClanFightHistroyRankRecord.this.xdbVarname();
		}

		@Override
		public Long xdbObjId() {
			return ClanFightHistroyRankRecord.this.xdbObjId();
		}

		@Override
		public boolean equals(Object obj) {
			return ClanFightHistroyRankRecord.this.equals(obj);
		}

		@Override
		public int hashCode() {
			return ClanFightHistroyRankRecord.this.hashCode();
		}

		@Override
		public String toString() {
			return ClanFightHistroyRankRecord.this.toString();
		}

	}

	public static final class Data implements xbean.ClanFightHistroyRankRecord {
		private long triggertime; // 
		private xbean.MarshalClanFightHistroyRankRecord marshaldata; // 

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		public Data() {
			marshaldata = new MarshalClanFightHistroyRankRecord.Data();
		}

		Data(xbean.ClanFightHistroyRankRecord _o1_) {
			if (_o1_ instanceof ClanFightHistroyRankRecord) assign((ClanFightHistroyRankRecord)_o1_);
			else if (_o1_ instanceof ClanFightHistroyRankRecord.Data) assign((ClanFightHistroyRankRecord.Data)_o1_);
			else if (_o1_ instanceof ClanFightHistroyRankRecord.Const) assign(((ClanFightHistroyRankRecord.Const)_o1_).nThis());
			else throw new UnsupportedOperationException();
		}

		private void assign(ClanFightHistroyRankRecord _o_) {
			triggertime = _o_.triggertime;
			marshaldata = new MarshalClanFightHistroyRankRecord.Data(_o_.marshaldata);
		}

		private void assign(ClanFightHistroyRankRecord.Data _o_) {
			triggertime = _o_.triggertime;
			marshaldata = new MarshalClanFightHistroyRankRecord.Data(_o_.marshaldata);
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
		public xbean.ClanFightHistroyRankRecord copy() {
			return new Data(this);
		}

		@Override
		public xbean.ClanFightHistroyRankRecord toData() {
			return new Data(this);
		}

		public xbean.ClanFightHistroyRankRecord toBean() {
			return new ClanFightHistroyRankRecord(this, null, null);
		}

		@Override
		public xbean.ClanFightHistroyRankRecord toDataIf() {
			return this;
		}

		public xbean.ClanFightHistroyRankRecord toBeanIf() {
			return new ClanFightHistroyRankRecord(this, null, null);
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
		public xbean.MarshalClanFightHistroyRankRecord getMarshaldata() { // 
			return marshaldata;
		}

		@Override
		public void setTriggertime(long _v_) { // 
			triggertime = _v_;
		}

		@Override
		public final boolean equals(Object _o1_) {
			if (!(_o1_ instanceof ClanFightHistroyRankRecord.Data)) return false;
			ClanFightHistroyRankRecord.Data _o_ = (ClanFightHistroyRankRecord.Data) _o1_;
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

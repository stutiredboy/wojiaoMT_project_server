
package xbean.__;

import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public final class PvP3ScoreRecord extends mkdb.XBean implements xbean.PvP3ScoreRecord {
	private long roleid; // roleid
	private String rolename; // 角色名字
	private int score; // 积分

	@Override
	public void _reset_unsafe_() {
		roleid = 0L;
		rolename = "";
		score = 0;
	}

	PvP3ScoreRecord(int __, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		rolename = "";
	}

	public PvP3ScoreRecord() {
		this(0, null, null);
	}

	public PvP3ScoreRecord(PvP3ScoreRecord _o_) {
		this(_o_, null, null);
	}

	PvP3ScoreRecord(xbean.PvP3ScoreRecord _o1_, mkdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		if (_o1_ instanceof PvP3ScoreRecord) assign((PvP3ScoreRecord)_o1_);
		else if (_o1_ instanceof PvP3ScoreRecord.Data) assign((PvP3ScoreRecord.Data)_o1_);
		else if (_o1_ instanceof PvP3ScoreRecord.Const) assign(((PvP3ScoreRecord.Const)_o1_).nThis());
		else throw new UnsupportedOperationException();
	}

	private void assign(PvP3ScoreRecord _o_) {
		_o_._xdb_verify_unsafe_();
		roleid = _o_.roleid;
		rolename = _o_.rolename;
		score = _o_.score;
	}

	private void assign(PvP3ScoreRecord.Data _o_) {
		roleid = _o_.roleid;
		rolename = _o_.rolename;
		score = _o_.score;
	}

	@Override
	public final OctetsStream marshal(OctetsStream _os_) {
		_xdb_verify_unsafe_();
		_os_.marshal(roleid);
		_os_.marshal(rolename, mkdb.Const.IO_CHARSET);
		_os_.marshal(score);
		return _os_;
	}

	@Override
	public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		_xdb_verify_unsafe_();
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String(mkdb.Const.IO_CHARSET);
		score = _os_.unmarshal_int();
		return _os_;
	}

	@Override
	public xbean.PvP3ScoreRecord copy() {
		_xdb_verify_unsafe_();
		return new PvP3ScoreRecord(this);
	}

	@Override
	public xbean.PvP3ScoreRecord toData() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.PvP3ScoreRecord toBean() {
		_xdb_verify_unsafe_();
		return new PvP3ScoreRecord(this); // same as copy()
	}

	@Override
	public xbean.PvP3ScoreRecord toDataIf() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.PvP3ScoreRecord toBeanIf() {
		_xdb_verify_unsafe_();
		return this;
	}

	@Override
	public mkdb.Bean toConst() {
		_xdb_verify_unsafe_();
		return new Const();
	}

	@Override
	public long getRoleid() { // roleid
		_xdb_verify_unsafe_();
		return roleid;
	}

	@Override
	public String getRolename() { // 角色名字
		_xdb_verify_unsafe_();
		return rolename;
	}

	@Override
	public com.locojoy.base.Octets getRolenameOctets() { // 角色名字
		_xdb_verify_unsafe_();
		return com.locojoy.base.Octets.wrap(getRolename(), mkdb.Const.IO_CHARSET);
	}

	@Override
	public int getScore() { // 积分
		_xdb_verify_unsafe_();
		return score;
	}

	@Override
	public void setRoleid(long _v_) { // roleid
		_xdb_verify_unsafe_();
		mkdb.Logs.logIf(new mkdb.LogKey(this, "roleid") {
			protected mkdb.Log create() {
				return new mkdb.logs.LogLong(this, roleid) {
					public void rollback() { roleid = _xdb_saved; }
				};}});
		roleid = _v_;
	}

	@Override
	public void setRolename(String _v_) { // 角色名字
		_xdb_verify_unsafe_();
		if (null == _v_)
			throw new NullPointerException();
		mkdb.Logs.logIf(new mkdb.LogKey(this, "rolename") {
			protected mkdb.Log create() {
				return new mkdb.logs.LogString(this, rolename) {
					public void rollback() { rolename = _xdb_saved; }
				};}});
		rolename = _v_;
	}

	@Override
	public void setRolenameOctets(com.locojoy.base.Octets _v_) { // 角色名字
		_xdb_verify_unsafe_();
		this.setRolename(_v_.getString(mkdb.Const.IO_CHARSET));
	}

	@Override
	public void setScore(int _v_) { // 积分
		_xdb_verify_unsafe_();
		mkdb.Logs.logIf(new mkdb.LogKey(this, "score") {
			protected mkdb.Log create() {
				return new mkdb.logs.LogInt(this, score) {
					public void rollback() { score = _xdb_saved; }
				};}});
		score = _v_;
	}

	@Override
	public final boolean equals(Object _o1_) {
		_xdb_verify_unsafe_();
		PvP3ScoreRecord _o_ = null;
		if ( _o1_ instanceof PvP3ScoreRecord ) _o_ = (PvP3ScoreRecord)_o1_;
		else if ( _o1_ instanceof PvP3ScoreRecord.Const ) _o_ = ((PvP3ScoreRecord.Const)_o1_).nThis();
		else return false;
		if (roleid != _o_.roleid) return false;
		if (!rolename.equals(_o_.rolename)) return false;
		if (score != _o_.score) return false;
		return true;
	}

	@Override
	public final int hashCode() {
		_xdb_verify_unsafe_();
		int _h_ = 0;
		_h_ += roleid;
		_h_ += rolename.hashCode();
		_h_ += score;
		return _h_;
	}

	@Override
	public String toString() {
		_xdb_verify_unsafe_();
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid);
		_sb_.append(",");
		_sb_.append("'").append(rolename).append("'");
		_sb_.append(",");
		_sb_.append(score);
		_sb_.append(")");
		return _sb_.toString();
	}

	@Override
	public mkdb.logs.Listenable newListenable() {
		mkdb.logs.ListenableBean lb = new mkdb.logs.ListenableBean();
		lb.add(new mkdb.logs.ListenableChanged().setVarName("roleid"));
		lb.add(new mkdb.logs.ListenableChanged().setVarName("rolename"));
		lb.add(new mkdb.logs.ListenableChanged().setVarName("score"));
		return lb;
	}

	private class Const implements xbean.PvP3ScoreRecord {
		PvP3ScoreRecord nThis() {
			return PvP3ScoreRecord.this;
		}

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		@Override
		public xbean.PvP3ScoreRecord copy() {
			return PvP3ScoreRecord.this.copy();
		}

		@Override
		public xbean.PvP3ScoreRecord toData() {
			return PvP3ScoreRecord.this.toData();
		}

		public xbean.PvP3ScoreRecord toBean() {
			return PvP3ScoreRecord.this.toBean();
		}

		@Override
		public xbean.PvP3ScoreRecord toDataIf() {
			return PvP3ScoreRecord.this.toDataIf();
		}

		public xbean.PvP3ScoreRecord toBeanIf() {
			return PvP3ScoreRecord.this.toBeanIf();
		}

		@Override
		public long getRoleid() { // roleid
			_xdb_verify_unsafe_();
			return roleid;
		}

		@Override
		public String getRolename() { // 角色名字
			_xdb_verify_unsafe_();
			return rolename;
		}

		@Override
		public com.locojoy.base.Octets getRolenameOctets() { // 角色名字
			_xdb_verify_unsafe_();
			return PvP3ScoreRecord.this.getRolenameOctets();
		}

		@Override
		public int getScore() { // 积分
			_xdb_verify_unsafe_();
			return score;
		}

		@Override
		public void setRoleid(long _v_) { // roleid
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public void setRolename(String _v_) { // 角色名字
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public void setRolenameOctets(com.locojoy.base.Octets _v_) { // 角色名字
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public void setScore(int _v_) { // 积分
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
			return PvP3ScoreRecord.this.isData();
		}

		@Override
		public OctetsStream marshal(OctetsStream _os_) {
			return PvP3ScoreRecord.this.marshal(_os_);
		}

		@Override
		public OctetsStream unmarshal(OctetsStream arg0) throws MarshalException {
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public mkdb.Bean xdbParent() {
			return PvP3ScoreRecord.this.xdbParent();
		}

		@Override
		public boolean xdbManaged() {
			return PvP3ScoreRecord.this.xdbManaged();
		}

		@Override
		public String xdbVarname() {
			return PvP3ScoreRecord.this.xdbVarname();
		}

		@Override
		public Long xdbObjId() {
			return PvP3ScoreRecord.this.xdbObjId();
		}

		@Override
		public boolean equals(Object obj) {
			return PvP3ScoreRecord.this.equals(obj);
		}

		@Override
		public int hashCode() {
			return PvP3ScoreRecord.this.hashCode();
		}

		@Override
		public String toString() {
			return PvP3ScoreRecord.this.toString();
		}

	}

	public static final class Data implements xbean.PvP3ScoreRecord {
		private long roleid; // roleid
		private String rolename; // 角色名字
		private int score; // 积分

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		public Data() {
			rolename = "";
		}

		Data(xbean.PvP3ScoreRecord _o1_) {
			if (_o1_ instanceof PvP3ScoreRecord) assign((PvP3ScoreRecord)_o1_);
			else if (_o1_ instanceof PvP3ScoreRecord.Data) assign((PvP3ScoreRecord.Data)_o1_);
			else if (_o1_ instanceof PvP3ScoreRecord.Const) assign(((PvP3ScoreRecord.Const)_o1_).nThis());
			else throw new UnsupportedOperationException();
		}

		private void assign(PvP3ScoreRecord _o_) {
			roleid = _o_.roleid;
			rolename = _o_.rolename;
			score = _o_.score;
		}

		private void assign(PvP3ScoreRecord.Data _o_) {
			roleid = _o_.roleid;
			rolename = _o_.rolename;
			score = _o_.score;
		}

		@Override
		public final OctetsStream marshal(OctetsStream _os_) {
			_os_.marshal(roleid);
			_os_.marshal(rolename, mkdb.Const.IO_CHARSET);
			_os_.marshal(score);
			return _os_;
		}

		@Override
		public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
			roleid = _os_.unmarshal_long();
			rolename = _os_.unmarshal_String(mkdb.Const.IO_CHARSET);
			score = _os_.unmarshal_int();
			return _os_;
		}

		@Override
		public xbean.PvP3ScoreRecord copy() {
			return new Data(this);
		}

		@Override
		public xbean.PvP3ScoreRecord toData() {
			return new Data(this);
		}

		public xbean.PvP3ScoreRecord toBean() {
			return new PvP3ScoreRecord(this, null, null);
		}

		@Override
		public xbean.PvP3ScoreRecord toDataIf() {
			return this;
		}

		public xbean.PvP3ScoreRecord toBeanIf() {
			return new PvP3ScoreRecord(this, null, null);
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
		public long getRoleid() { // roleid
			return roleid;
		}

		@Override
		public String getRolename() { // 角色名字
			return rolename;
		}

		@Override
		public com.locojoy.base.Octets getRolenameOctets() { // 角色名字
			return com.locojoy.base.Octets.wrap(getRolename(), mkdb.Const.IO_CHARSET);
		}

		@Override
		public int getScore() { // 积分
			return score;
		}

		@Override
		public void setRoleid(long _v_) { // roleid
			roleid = _v_;
		}

		@Override
		public void setRolename(String _v_) { // 角色名字
			if (null == _v_)
				throw new NullPointerException();
			rolename = _v_;
		}

		@Override
		public void setRolenameOctets(com.locojoy.base.Octets _v_) { // 角色名字
			this.setRolename(_v_.getString(mkdb.Const.IO_CHARSET));
		}

		@Override
		public void setScore(int _v_) { // 积分
			score = _v_;
		}

		@Override
		public final boolean equals(Object _o1_) {
			if (!(_o1_ instanceof PvP3ScoreRecord.Data)) return false;
			PvP3ScoreRecord.Data _o_ = (PvP3ScoreRecord.Data) _o1_;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (score != _o_.score) return false;
			return true;
		}

		@Override
		public final int hashCode() {
			int _h_ = 0;
			_h_ += roleid;
			_h_ += rolename.hashCode();
			_h_ += score;
			return _h_;
		}

		@Override
		public String toString() {
			StringBuilder _sb_ = new StringBuilder();
			_sb_.append("(");
			_sb_.append(roleid);
			_sb_.append(",");
			_sb_.append("'").append(rolename).append("'");
			_sb_.append(",");
			_sb_.append(score);
			_sb_.append(")");
			return _sb_.toString();
		}

	}
}

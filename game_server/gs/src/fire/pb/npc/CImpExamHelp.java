
package fire.pb.npc;

import fire.pb.activity.impexam.PSendImpExamHelp;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CImpExamHelp__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CImpExamHelp extends __CImpExamHelp__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid >0){
			new PSendImpExamHelp(roleid,impexamtype).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795467;

	public int getType() {
		return 795467;
	}

	public byte impexamtype;

	public CImpExamHelp() {
	}

	public CImpExamHelp(byte _impexamtype_) {
		this.impexamtype = _impexamtype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(impexamtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		impexamtype = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CImpExamHelp) {
			CImpExamHelp _o_ = (CImpExamHelp)_o1_;
			if (impexamtype != _o_.impexamtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)impexamtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(impexamtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CImpExamHelp _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = impexamtype - _o_.impexamtype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SSendImpExamAssist__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SSendImpExamAssist extends __SSendImpExamAssist__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795466;

	public int getType() {
		return 795466;
	}

	public byte impexamtype;
	public byte assisttype; // Э������
	public int answerid; // �𰸵�id����ȥ�������Э���������Ǵ���𰸵�id

	public SSendImpExamAssist() {
	}

	public SSendImpExamAssist(byte _impexamtype_, byte _assisttype_, int _answerid_) {
		this.impexamtype = _impexamtype_;
		this.assisttype = _assisttype_;
		this.answerid = _answerid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(impexamtype);
		_os_.marshal(assisttype);
		_os_.marshal(answerid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		impexamtype = _os_.unmarshal_byte();
		assisttype = _os_.unmarshal_byte();
		answerid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SSendImpExamAssist) {
			SSendImpExamAssist _o_ = (SSendImpExamAssist)_o1_;
			if (impexamtype != _o_.impexamtype) return false;
			if (assisttype != _o_.assisttype) return false;
			if (answerid != _o_.answerid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)impexamtype;
		_h_ += (int)assisttype;
		_h_ += answerid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(impexamtype).append(",");
		_sb_.append(assisttype).append(",");
		_sb_.append(answerid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SSendImpExamAssist _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = impexamtype - _o_.impexamtype;
		if (0 != _c_) return _c_;
		_c_ = assisttype - _o_.assisttype;
		if (0 != _c_) return _c_;
		_c_ = answerid - _o_.answerid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


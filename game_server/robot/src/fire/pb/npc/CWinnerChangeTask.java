
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CWinnerChangeTask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CWinnerChangeTask extends __CWinnerChangeTask__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795484;

	public int getType() {
		return 795484;
	}

	public int acceptflag; // 0表示取消    1表示接受

	public CWinnerChangeTask() {
	}

	public CWinnerChangeTask(int _acceptflag_) {
		this.acceptflag = _acceptflag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(acceptflag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		acceptflag = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CWinnerChangeTask) {
			CWinnerChangeTask _o_ = (CWinnerChangeTask)_o1_;
			if (acceptflag != _o_.acceptflag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += acceptflag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(acceptflag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CWinnerChangeTask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = acceptflag - _o_.acceptflag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendHelpSW__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendHelpSW extends __CSendHelpSW__ {
	@Override
	protected void process() {
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SSendHelpSW sSendHelpSW=new SSendHelpSW();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sSendHelpSW.helpsw=helpcount.getShengwangvalue();//婢圭増婀�
		}
		gnet.link.Onlines.getInstance().send(roleid, sSendHelpSW);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786547;

	public int getType() {
		return 786547;
	}


	public CSendHelpSW() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendHelpSW) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSendHelpSW _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


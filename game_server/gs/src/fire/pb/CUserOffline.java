
package fire.pb;

import gnet.link.Dispatch;
import fire.pb.state.PRoleOffline;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUserOffline__ extends mkio.Protocol { }

/** �ͻ��ˣ�����ѡ����棺"�˳���Ϸ"��"���ص�¼����"��"���ط�����ѡ��"�����Ŷ��У�"ȡ���Ŷ�"
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUserOffline extends __CUserOffline__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleid > 0)
		{
			new fire.pb.state.PRoleOffline(roleid,PRoleOffline.TYPE_OFFLINE).submit();
			return;
		}
		final int userid = ((Dispatch)this.getContext()).userid;
		gnet.link.Onlines.getInstance().getConnectedUsers().offline(userid, false);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786479;

	public int getType() {
		return 786479;
	}


	public CUserOffline() {
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
		if (_o1_ instanceof CUserOffline) {
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

	public int compareTo(CUserOffline _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


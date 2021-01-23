
package fire.pb;

import fire.pb.state.PRoleOffline;
import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReturnRoleList__ extends mkio.Protocol { }

/** 客户端请求返回角色选择界面
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReturnRoleList extends __CReturnRoleList__ {
	@Override
	protected void process() {
		// protocol handle
		
		gnet.link.Role role = Onlines.getInstance().find(this);
		if(role == null)
			return;
		//闁告帇鍊栭弻鍥及椤栨碍鍎婇柤铏灊缁楀懐鐥崠锛勭妤犵偠鍩栭婊呮暜闂�鎰憮缂佹崘锟�?閸屾瑧鐟撶紒鎯х仢閻ｎ剙袙閺囩偞鍊甸柨娑樿嫰閸燂拷闁告瑦鍙�ReturnRoleList婵炴垵鐗婃导锟�
		new fire.pb.state.PRoleOffline(role.getRoleid(),PRoleOffline.TYPE_CHOSEE_ROLE).submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786477;

	public int getType() {
		return 786477;
	}


	public CReturnRoleList() {
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
		if (_o1_ instanceof CReturnRoleList) {
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

	public int compareTo(CReturnRoleList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SCreateRole__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SCreateRole extends __SCreateRole__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786436;

	public int getType() {
		return 786436;
	}

	public final static int CREATE_OK = 1; // �ɹ�
	public final static int CREATE_ERROR = 2; // ʧ��
	public final static int CREATE_INVALID = 3; // ���Ʋ��Ϸ�
	public final static int CREATE_DUPLICATED = 4; // ����
	public final static int CREATE_OVERCOUNT = 5; // �������½�ɫ��������
	public final static int CREATE_OVERLEN = 6; // ��ɫ������
	public final static int CREATE_SHORTLEN = 7; // ��ɫ������

	public fire.pb.RoleInfo newinfo; // ������Ľ�ɫ��Ϣ

	public SCreateRole() {
		newinfo = new fire.pb.RoleInfo();
	}

	public SCreateRole(fire.pb.RoleInfo _newinfo_) {
		this.newinfo = _newinfo_;
	}

	public final boolean _validator_() {
		if (!newinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SCreateRole) {
			SCreateRole _o_ = (SCreateRole)_o1_;
			if (!newinfo.equals(_o_.newinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(newinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


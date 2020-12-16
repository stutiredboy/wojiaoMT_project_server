
package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SShowPetInfo__ extends mkio.Protocol { }

/** ���������ظ��ͻ��˳�����ĳֻ�������ϸ��Ϣ
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SShowPetInfo extends __SShowPetInfo__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788457;

	public int getType() {
		return 788457;
	}

	public int isxunbaopet; // �Ƿ����ұ����鿴����,1�� 0����
	public fire.pb.Pet petdata; // ������ϸ����

	public SShowPetInfo() {
		petdata = new fire.pb.Pet();
	}

	public SShowPetInfo(int _isxunbaopet_, fire.pb.Pet _petdata_) {
		this.isxunbaopet = _isxunbaopet_;
		this.petdata = _petdata_;
	}

	public final boolean _validator_() {
		if (!petdata._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(isxunbaopet);
		_os_.marshal(petdata);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		isxunbaopet = _os_.unmarshal_int();
		petdata.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SShowPetInfo) {
			SShowPetInfo _o_ = (SShowPetInfo)_o1_;
			if (isxunbaopet != _o_.isxunbaopet) return false;
			if (!petdata.equals(_o_.petdata)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += isxunbaopet;
		_h_ += petdata.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(isxunbaopet).append(",");
		_sb_.append(petdata).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


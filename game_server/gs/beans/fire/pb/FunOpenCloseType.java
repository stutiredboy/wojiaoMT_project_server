
package fire.pb;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class FunOpenCloseType implements Marshal , Comparable<FunOpenCloseType>{
	public final static int FUN_REDPACK = 1; // ���
	public final static int FUN_JHM = 2; // ������
	public final static int FUN_CHECKPOINT = 3; // �㿨������
	public final static int FUN_MONTHCARD = 4; // �¿�
	public final static int FUN_BLACKMARKET = 5; // ����


	public FunOpenCloseType() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof FunOpenCloseType) {
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

	public int compareTo(FunOpenCloseType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


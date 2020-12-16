
package fire.pb.pet;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class PetColumnTypes implements Marshal , Comparable<PetColumnTypes>{
	public final static int PET = 1; // �������ϵĳ�����
	public final static int DEPOT = 2; // ����Ĳֿ������
	public final static int XUNBAOSELLPET = 3; // �ұ������۳�����
	public final static int XUNBAOBUYPET = 4; // �ұ������������
	public final static int MARKETPET = 5; // ����������
	public final static int BLACKMARKETPET = 6; // ���г�����


	public PetColumnTypes() {
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
		if (_o1_ instanceof PetColumnTypes) {
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

	public int compareTo(PetColumnTypes _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


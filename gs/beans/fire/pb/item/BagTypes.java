
package fire.pb.item;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class BagTypes implements Marshal , Comparable<BagTypes>{
	public final static int EMPTY = 0;
	public final static int BAG = 1; // ����
	public final static int DEPOT = 2; // �ֿ�
	public final static int EQUIP = 3; // װ������
	public final static int TEMP = 4; // ��ʱ����
	public final static int QUEST = 5; // ���񱳰�
	public final static int MARKET = 6; // ��������
	public final static int BLACKMARKET = 7; // ���б���
	public final static int PETEQUIP = 8; // ����װ������


	public BagTypes() {
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
		if (_o1_ instanceof BagTypes) {
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

	public int compareTo(BagTypes _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


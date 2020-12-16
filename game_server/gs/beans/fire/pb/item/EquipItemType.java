
package fire.pb.item;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class EquipItemType implements Marshal , Comparable<EquipItemType>{
	public final static int ARMS = 0; // //����
	public final static int ADORN = 2; // //����
	public final static int LORICAE = 3; // //�·�
	public final static int WAISTBAND = 4; // //����
	public final static int BOOT = 5; // //ѥ��
	public final static int TIRE = 6; // //ñ��
	public final static int ROLE_COLOR1 = 50; // Ⱦɫ1
	public final static int ROLE_COLOR2 = 51; // Ⱦɫ2
	public final static int EQUIP_EFFECT = 60; // װ����Ч


	public EquipItemType() {
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
		if (_o1_ instanceof EquipItemType) {
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

	public int compareTo(EquipItemType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


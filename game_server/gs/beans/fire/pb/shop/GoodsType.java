
package fire.pb.shop;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ��Ʒ����
*/
public class GoodsType implements Marshal , Comparable<GoodsType>{
	public final static int NORMAL_ITEM = 1; // ����
	public final static int PET = 2; // ����
	public final static int EQUIP_ITEM = 3; // װ��
	public final static int OTHER_ITEM = 4; // ��������(���ڱ�ʾ�۸񸡶����⴦��)


	public GoodsType() {
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
		if (_o1_ instanceof GoodsType) {
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

	public int compareTo(GoodsType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


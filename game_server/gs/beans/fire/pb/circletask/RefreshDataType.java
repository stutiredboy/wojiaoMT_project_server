
package fire.pb.circletask;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ˢ������������ֶ�ö��ֵ
*/
public class RefreshDataType implements Marshal , Comparable<RefreshDataType>{
	public final static int STATE = 1; // ����״̬
	public final static int DEST_NPD_KEY = 2; // _Ŀ��npckey
	public final static int DEST_NPD_ID = 3; // Ŀ��npcid
	public final static int DEST_MAP_ID = 4; // Ŀ�ĵ�ͼid
	public final static int DEST_XPOS = 5; // Ŀ��x����
	public final static int DEST_YPOS = 6; // Ŀ��y����
	public final static int DEST_ITEM_ID = 7; // Ŀ�ĵ���id
	public final static int SUMNUM = 8; // �ۼƴ���
	public final static int DEST_ITEM1_NUM = 9; // Ŀ�ĵ���1������
	public final static int DEST_ITEM2_ID = 10; // Ŀ�ĵ���2id
	public final static int DEST_ITEM2_NUM = 11; // Ŀ�ĵ���2������
	public final static int QUEST_TYPE = 12; // ��������


	public RefreshDataType() {
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
		if (_o1_ instanceof RefreshDataType) {
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

	public int compareTo(RefreshDataType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


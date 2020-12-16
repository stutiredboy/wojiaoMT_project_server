
package fire.pb.mission;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ReadTimeType implements Marshal , Comparable<ReadTimeType>{
	public final static int TREASE_MAP = 1; // �ڱ�ͼ
	public final static int USE_TASK_ITEM = 2; // ʹ���������
	public final static int FOSSICK = 3; // �ɼ�
	public final static int OPEN_BOX = 4; // ������
	public final static int END_TALK_QUEST = 5; // �����Ի�������
	public final static int BEGIN_BATTLE_QUEST = 6; // 6��ʼս��������
	public final static int END_AREA_QUEST = 7; // ������


	public ReadTimeType() {
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
		if (_o1_ instanceof ReadTimeType) {
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

	public int compareTo(ReadTimeType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


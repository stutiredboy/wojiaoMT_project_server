
package fire.pb.circletask;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class SpecialQuestState implements Marshal , Comparable<SpecialQuestState>{
	public final static int SUCCESS = 1; // �ѳɹ���(���ύ)
	public final static int FAIL = 2; // ��ʧ��
	public final static int DONE = 3; // �����
	public final static int UNDONE = 4; // δ���
	public final static int ABANDONED = 5; // �ѷ���
	public final static int RECYCLE = 6; // ����
	public final static int INSTANCE_ABANDONED = 7; // �����з���


	public SpecialQuestState() {
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
		if (_o1_ instanceof SpecialQuestState) {
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

	public int compareTo(SpecialQuestState _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


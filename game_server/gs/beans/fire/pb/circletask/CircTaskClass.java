
package fire.pb.circletask;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ѭ�������������
*/
public class CircTaskClass implements Marshal , Comparable<CircTaskClass>{
	public final static int CircTask_Mail = 1; // ����
	public final static int CircTask_ItemUse = 2; // ��������
	public final static int CircTask_ItemCollect = 3; // �����ռ�
	public final static int CircTask_ItemFind = 4; // Ѱ�ҵ���
	public final static int CircTask_PetCatch = 5; // �������
	public final static int CircTask_Patrol = 6; // Ѳ��
	public final static int CircTask_CatchIt = 7; // ׽��
	public final static int CircTask_KillMonster = 8; // ɱ�ּ���
	public final static int CircTask_ChallengeNpc = 9; // ��սnpc


	public CircTaskClass() {
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
		if (_o1_ instanceof CircTaskClass) {
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

	public int compareTo(CircTaskClass _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


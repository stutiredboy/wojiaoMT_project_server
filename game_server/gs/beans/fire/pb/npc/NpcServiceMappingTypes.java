
package fire.pb.npc;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class NpcServiceMappingTypes implements Marshal , Comparable<NpcServiceMappingTypes>{
	public final static int NONE = 0;
	public final static int ACCEPT_CIRCLE_TASK = 1; // ������
	public final static int SUBMIT_CIRCLE_TASK = 2; // �ύ����
	public final static int QUERY_CIRCLE_TASK = 3; // ��ѯ����
	public final static int QUERY_CIRCLE_TEAM = 4; // ������
	public final static int QUERY_CIRCLE_BATTLE = 5; // ����ս��
	public final static int CIRCLE_PRODUCE = 6; // ������Ʒ
	public final static int RENXING_CIRCLE_TASK = 7; // ��������
	public final static int CHALLENGE_NPC = 9; // NPC��ս
	public final static int ENTER_INST = 10; // ���븱��
	public final static int POP_UI = 11; // ���������
	public final static int QUERY_CAMERA_URL = 12; // ����¼��·��
	public final static int ACCEPT_TUPO = 13; // ��ͻ������


	public NpcServiceMappingTypes() {
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
		if (_o1_ instanceof NpcServiceMappingTypes) {
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

	public int compareTo(NpcServiceMappingTypes _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


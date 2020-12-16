
package fire.pb.battle;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class OperationType implements Marshal , Comparable<OperationType>{
	public final static int ACTION_ATTACK = 1; // ����
	public final static int ACTION_SKILL = 2; // ʹ�ü���
	public final static int ACTION_USEITEM = 3; // ʹ����Ʒ
	public final static int ACTION_DEFEND = 4; // ����
	public final static int ACTION_PROTECT = 5; // ����
	public final static int ACTION_SUMMON = 6; // �ٻ�����
	public final static int ACTION_WITHDRAW = 7; // �ٻ�����
	public final static int ACTION_CATHCH = 8; // ��׽
	public final static int ACTION_ESCAPE = 9; // ����
	public final static int ACTION_REST = 10; // ��Ϣ
	public final static int ACTION_SPECIAL_SKILL = 11; // ���⼼��
	public final static int ACTION_SUMMON_INSTANT = 12; // ˲ʱ�ٻ�
	public final static int ACTION_ESCAPE_INSTANT = 13; // ˲ʱ����
	public final static int ACTION_FAILURE = 14; // ����ʧ��
	public final static int ACTION_BATTLE_END = 15; // ս������,ֻ��AI�ֵ�AIָ�������Action
	public final static int ACTION_ENVIRONMENTDEMO = 16; // ����ʩ���ߵ�Demo��attackID��0
	public final static int ACTION_ENVIRONMENTCHANGE = 17; // ս�������ı� operateid��ս������id
	public final static int ACTION_ROUNDENDDEMO = 18; // �غ�ĩ����demo
	public final static int ACTION_UNIQUE_SKILL = 19; // ����
	public final static int ACTION_FAILURE_NO_WONDER = 20; // ����ʧ��_����̾�ŵģ�


	public OperationType() {
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
		if (_o1_ instanceof OperationType) {
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

	public int compareTo(OperationType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


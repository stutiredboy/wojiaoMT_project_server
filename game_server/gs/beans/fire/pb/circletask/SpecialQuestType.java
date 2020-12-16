
package fire.pb.circletask;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** �������������,����ְҵ�����еĸ��ֲ�ͬ�����Լ���-���������������
*/
public class SpecialQuestType implements Marshal , Comparable<SpecialQuestType>{
	public final static int Mail = 801001; // ����
	public final static int Patrol = 801002; // Ѳ��
	public final static int BuyItem = 801003; // �����
	public final static int CatchPet = 801004; // ץ�ػ�
	public final static int Demonstrate = 801005; // ʾ��
	public final static int DemonstrateEye = 801006; // ʾ��
	public final static int Rescue = 801007; // Ԯ��
	public final static int Tame = 801008; // ����
	public final static int CaiJi = 801010; // �ɼ�
	public final static int CaiJiFinish = 801030; // �ɼ����
	public final static int ChuanDiXiaoXi = 801011; // ������Ϣ
	public final static int KillMonster = 801012; // ���
	public final static int KillMonsterFinish = 801032; // ������
	public final static int FindItem = 801013; // ���Ѱ��
	public final static int FindItemFinish = 801033; // ���Ѱ�����
	public final static int Answer = 801014; // ����
	public final static int AnswerFinish = 801034; // �������
	public final static int CatchIt_Normal = 1030001; // ׽��
	public final static int CatchIt_Increase = 1030002; // ����


	public SpecialQuestType() {
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
		if (_o1_ instanceof SpecialQuestType) {
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

	public int compareTo(SpecialQuestType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


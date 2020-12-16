
package fire.pb.school;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ShouXiMsgID implements Marshal , Comparable<ShouXiMsgID>{
	public final static int ChallengeLevelNotEnough = 140245; // ��ս��ϯ-�����Ǻ�Σ�յģ�40���Ժ�������ս�ɣ���
	public final static int SchoolContriNotEnough = 140246; // ���ְҵ���׶Ȳ���500�㣬�޷�������ս��
	public final static int InTeam = 140247; // ���뿪���������μ���ս�ɣ�
	public final static int MoneyNotEnough = 140248; // �����ϵĽ�Ǯ������10000������
	public final static int ChallengeSuccess = 140249; // ��ս�ɹ�������Բ���ְҵ��ϯ-���Ӿ�ѡ�ˣ�
	public final static int ChallengeLost = 140250; // ��սʧ�ܣ�ϣ�����´��ٽ�����!
	public final static int NotSuccess = 140251; // ����δ�ɹ���ս��ϯ-���ӣ����ܲμӾ�ѡ��
	public final static int AlreadyCandidate = 140252; // ���ѳɹ���ѡ��
	public final static int VoteLevelNotEnough = 140253; // �ȼ���30������ҷ��ɲ���ͶƱŶ��
	public final static int TiLiNotEnough = 140254; // ������������100�㣬����ͶƱ��
	public final static int AlreadyVote = 140255; // ���������Ѿ�Ͷ��Ʊ��������Ͷ�ˣ�
	public final static int GiveShouXiTitle = 140256; // ��ϲ��������ϯ-���ӳƺš�
	public final static int CancelShouXiTitle = 140257; // �ܱ�Ǹ�����Ѳ�������ϯ-���ӡ�
	public final static int RefreshAbilityToMuch = 140258; // ��Ϣһ�£����������ɣ�
	public final static int ChallengeAffirm = 140259; // ��ս��ϯ-������Ҫ����10000����Ǯ���Ƿ�ȷ����ս��
	public final static int Cantvote = 140260; // ���ڲ���ͶƱʱ��Ŷ��
	public final static int CantChallenge = 140261; // ���ڲ�����սʱ��Ŷ��


	public ShouXiMsgID() {
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
		if (_o1_ instanceof ShouXiMsgID) {
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

	public int compareTo(ShouXiMsgID _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


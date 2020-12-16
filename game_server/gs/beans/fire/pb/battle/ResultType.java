
package fire.pb.battle;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ResultType implements Marshal , Comparable<ResultType>{
	public final static int RESULT_HPCHANGE = 1; // 1:Ŀ��HP�仯
	public final static int RESULT_MPCHANGE = 2; // 2:Ŀ��MP�仯
	public final static int RESULT_SPCHANGE = 4; // 3:Ŀ��SP�仯
	public final static int RESULT_ULHPCHANGE = 8; // 4:��ǰѪ���ޣ��ˣ��仯
	public final static int RESULT_REST = 16; // 5:��Ϣ
	public final static int RESULT_HURT = 32; // 6:Ŀ������
	public final static int RESULT_CRITIC = 64; // 7:Ŀ�걻����
	public final static int RESULT_DEFENCE = 128; // 8:Ŀ�����
	public final static int RESULT_PARRY = 256; // 9:Ŀ���мܣ����ƶ�����ֻ����ͨ�����ᴥ���мܣ�
	public final static int RESULT_DODGE = 512; // 10:Ŀ������
	public final static int RESULT_RUNAWAY = 1024; // 11:Ŀ������
	public final static int RESULT_SEIZE = 2048; // 12:Ŀ�걻��׽
	public final static int RESULT_SUMMONBACK = 4096; // 13:Ŀ�걻�ٻ�
	public final static int RESULT_DEATH = 8192; // 14:Ŀ������������ԭ��
	public final static int RESULT_KICKOUT = 16384; // 15:Ŀ�걻���ɣ�û�й�꼼�ܵĹֺͳ�������ʱ��
	public final static int RESULT_GHOST = 32768; // 16:Ŀ�������״̬���й�꼼�ܵĹֺͳ�������ʱ��
	public final static int RESULT_RELIVE = 65536; // 17:����
	public final static int RESULT_SUMMONPET = 131072; // 18:Ŀ���л�����
	public final static int RESULT_IGNORE_PHYDIC_EFEN = 262144; // 19:���Է���
	public final static int RESULT_ABORBE = 524288; // 20:����
	public final static int RESULT_FIRE_MANA = 1048576; // 21:����
	public final static int RESULT_GODBLESS = 2097152; // 22:����
	public final static int RESULT_EPCHANGE = 4194304; // 23:Ŀ��EP�仯
	public final static int RESULT_DEAD_FULL_RELIVE = 8388608; // 24:��Ѫ����
	public final static int RESULT_SHAPECHAGE = 16777216; // 25:ģ�͸ı�


	public ResultType() {
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
		if (_o1_ instanceof ResultType) {
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

	public int compareTo(ResultType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


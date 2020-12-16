
package fire.pb.attr;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ��Ҫ�����ڴ˼�������ID�����Ҫ��һ���µ����Ժ�ID������߻������������ͻ
*/
public class AttrType implements Marshal , Comparable<AttrType>{
	public final static int CONS = 10; // ����
	public final static int IQ = 20; // ����
	public final static int STR = 30; // ����
	public final static int ENDU = 40; // ����
	public final static int AGI = 50; // ����
	public final static int MAX_HP = 60; // �����������
	public final static int UP_LIMITED_HP = 70; // ��ǰ�������ޣ�С�ڵ�������������ޣ�
	public final static int HP = 80; // ��ǰ����
	public final static int SPIRIT = 90; // ����
	public final static int MAX_MP = 90; // �����
	public final static int MP = 100; // ��ǰ����
	public final static int MAX_SP = 110; // ���ŭ��
	public final static int SP = 120; // ŭ��
	public final static int ATTACK = 130; // ����
	public final static int DEFEND = 140; // ����
	public final static int MAGIC_ATTACK = 150; // ����������
	public final static int MAGIC_DEF = 160; // ����������
	public final static int MEDICAL = 170; // ����ǿ��
	public final static int SEAL = 180; // ��������
	public final static int UNSEAL = 190; // ���ƿ���
	public final static int SPEED = 200; // �ٶ�
	public final static int HIT_RATE = 210; // ����ֵ
	public final static int DODGE_RATE = 220; // ���ֵ
	public final static int PHY_CRIT_PCT = 250; // �������̶ȣ���ʼΪ200%,��2����ͨ�˺���
	public final static int MAGIC_CRIT_PCT = 280; // ħ�������̶ȣ���ʼΪ200%��
	public final static int PHY_CRITC_LEVEL = 230; // �������ȼ�
	public final static int ANTI_PHY_CRITC_LEVEL = 240; // �����Եȼ�
	public final static int MAGIC_CRITC_LEVEL = 260; // ħ�������ȼ�
	public final static int ANTI_MAGIC_CRITC_LEVEL = 270; // ħ�����Եȼ�
	public final static int HEAL_CRIT_LEVEL = 290; // ���Ʊ����ȼ�
	public final static int HEAL_CRIT_PCT = 300; // ���Ʊ����̶�
	public final static int PHFORCE = 450; // ��ǰ����
	public final static int EXP = 470; // ����
	public final static int NEXP = 480; // ��������
	public final static int RENQI = 610; // ����ֵ
	public final static int SCHOOLFUND = 850; // ְҵ���׶�
	public final static int WULI_CHUANTOU = 950; // ����͸
	public final static int WULI_DIKANG = 960; // ����ֿ�
	public final static int FASHU_CHUANTOU = 970; // ������͸
	public final static int FASHU_DIKANG = 980; // �����ֿ�
	public final static int ZHILIAO_JIASHEN = 990; // ���Ƽ���
	public final static int EFFECT_POINT = 1010; // ����Ч����
	public final static int TEMP_SP = 1020; // ��ʱŭ��
	public final static int MASTER_REPUTATION = 1080; // ʦͽ����
	public final static int PET_XUEMAI_MAX = 1150; // ������������
	public final static int PET_LOW_SKILL = 1170; // ����ͼ�������
	public final static int PET_HIGH_SKILL = 1180; // ����߼�������
	public final static int PET_SUPER_SKILL = 1190; // ���ﳬ��������
	public final static int LEVEL = 1230; // �ȼ�
	public final static int PET_LIFE = 1360; // ��������
	public final static int ACTIVESTAR = 1380; // ��Ծ��������
	public final static int POINT = 1400; // Ǳ��
	public final static int QILIZHI = 1410; // ����ֵ
	public final static int QILIZHI_LIMIT = 1420; // ����ֵ����
	public final static int PET_XUE_MAI_LEVEL = 1430; // �����Ǽ�
	public final static int PET_FIGHT_LEVEL = 1430; // �����ս�ȼ�
	public final static int PET_ATTACK_APT = 1440; // ���﹥������
	public final static int PET_DEFEND_APT = 1450; // �����������
	public final static int PET_PHYFORCE_APT = 1460; // ������������
	public final static int PET_MAGIC_APT = 1470; // ���﷨������
	public final static int PET_SPEED_APT = 1480; // �����ٶ�����
	public final static int PET_DODGE_APT = 1490; // �����������
	public final static int PET_GROW_RATE = 1500; // ����ɳ���
	public final static int ENLIMIT = 1520; // ��������
	public final static int PFLIMIT = 1530; // ��������
	public final static int PET_SCALE = 1810; // �����С 1-4
	public final static int ACTIVENESS = 1820; // ��Ծ��ֵ
	public final static int ANTI_CRIT_LEVEL = 2090; // �������Եȼ�
	public final static int KONGZHI_JIACHENG = 2130; // ���Ƽӳ�
	public final static int KONGZHI_MIANYI = 2140; // ��������
	public final static int ENERGY = 3010; // ��ǰ����


	public AttrType() {
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
		if (_o1_ instanceof AttrType) {
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

	public int compareTo(AttrType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


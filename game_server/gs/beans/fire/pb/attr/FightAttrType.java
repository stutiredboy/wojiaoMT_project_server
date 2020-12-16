
package fire.pb.attr;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class FightAttrType implements Marshal , Comparable<FightAttrType>{
	public final static int CONS = 10; // ����
	public final static int IQ = 20; // ����
	public final static int STR = 30; // ����
	public final static int ENDU = 40; // ����
	public final static int AGI = 50; // ����
	public final static int MAX_HP = 60; // �������
	public final static int MAX_MP = 90; // �����
	public final static int MAX_SP = 110; // ���ŭ��
	public final static int ATTACK = 130; // ����
	public final static int DEFEND = 140; // ����
	public final static int MAGIC_ATTACK = 150; // ����������
	public final static int MAGIC_DEF = 160; // ����������
	public final static int MEDICAL = 170; // ����ǿ��
	public final static int SEAL = 180; // ��������
	public final static int UNSEAL = 190; // ��ϵ�ֿ���
	public final static int SPEED = 200; // �ٶ�
	public final static int HIT_RATE = 210; // ����ֵ
	public final static int DODGE_RATE = 220; // ���ֵ
	public final static int PHY_CRITC_LEVEL = 230; // �������ȼ�
	public final static int ANTI_PHY_CRITC_LEVEL = 240; // ���������ȼ�
	public final static int PHYSIC_CRIT_PCT = 250; // �������̶ȣ���ʼΪ200%,��2����ͨ�˺���
	public final static int MAGIC_CRITC_LEVEL = 260; // ħ�������ȼ�
	public final static int ANTI_MAGIC_CRITC_LEVEL = 270; // ��ħ�������ȼ�
	public final static int MAGIC_CRIT_PCT = 280; // ħ�������̶ȣ���ʼΪ200%��
	public final static int HEAL_RATE = 290; // ���Ʊ�����
	public final static int HEAL_DEGREE = 300; // ���Ʊ����̶�
	public final static int IGNORE_PHYSIC_DEFEND_RATE = 310; // ���������������
	public final static int IGNORE_PHYSIC_DEFEND_PCT = 320; // �����������ϵ��
	public final static int IGNORE_MAGIC_DEFEND_RATE = 330; // ���ӷ�����������
	public final static int IGNORE_MAGIC_DEFEND_PCT = 340; // ���ӷ�������ϵ��
	public final static int STEAL_HP_RATE = 350; // ��Ѫ����
	public final static int STEAL_HP_PCT = 360; // ��Ѫϵ������Ѫռ����˺��İٷֱȣ�Ĭ��0%)
	public final static int FIRE_MP_RATE = 370; // ��������
	public final static int FIRE_MP_PCT = 380; // ����ϵ��
	public final static int POISON_RATE = 390; // ��ͨ����ʹ�Է��ж����ʣ�Ĭ��0%)
	public final static int PIOSON_DAMGE_HP = 400; // ����Ѫϵ��
	public final static int PIOSON_DAMGE_MP = 410; // ������ϵ��
	public final static int PIOSON_DAMGE_ROUND = 420; // ���غ���
	public final static int DIE_FORBID_RATE = 430; // ������������
	public final static int DIE_FORBID_ROUND = 440; // ���������غ���
	public final static int PHYSIC_COMBO_ATTACK_RATE = 450; // ������������
	public final static int PHYSIC_COMBO_ATTACK_PCT = 460; // ���������˺�ϵ��
	public final static int PHYSIC_COMBO_ATTACK_COUNT = 470; // ���������������ޣ�ԭ���������ĳ������������ޣ�
	public final static int MAGIC_COMBO_ATTACK_RATE = 480; // ������������
	public final static int MAGIC_COMBO_ATTACK_PCT = 490; // ���������˺�ϵ��
	public final static int MAGIC_COMBO_ATTACK_COUNT = 500; // ����������������
	public final static int EXTRA_ATTACK_RATE = 510; // ׷����
	public final static int EXTRA_ATTACK_PCT = 520; // ׷���˺�ϵ��
	public final static int EXTRA_ATTACK_COUNT = 530; // ׷������
	public final static int DIFFUSE_ATTACK_RATE = 540; // ���伸��
	public final static int DIFFUSE_ATTACK_PCT = 550; // �����˺�ϵ��
	public final static int DIFFUSE_ATTACK_COUNT = 560; // ��������
	public final static int PARRY_RATE = 570; // �мܼ��ʣ�Ĭ��0%)
	public final static int PARRY_PCT = 580; // �񵲼���ϵ��
	public final static int RETURN_HURT_RATE = 590; // ������
	public final static int RETURN_HURT_PCT = 600; // ����̶ȣ������˺�ռ����˺��İٷֱȣ�Ĭ��30%)
	public final static int ATTACK_BACK_RATE = 610; // ������
	public final static int ATTACK_BACK_PCT = 620; // �����̶ȣ����������˺��İٷֱȣ�Ĭ��100%��
	public final static int GOD_BLESS_RATE = 630; // ���Ӽ��ʣ�ԭ��������ø�Ϊ���Ӽ��ʣ�
	public final static int GOD_BLESS_PCT = 640; // ���Ӹ���Ѫ��ϵ��
	public final static int ABSORB_FIRE_ODDS = 650; // ��ϵ����������
	public final static int ABSORB_WATER_ODDS = 660; // ˮϵ����������
	public final static int ABSORB_EARTH_ODDS = 670; // ��ϵ����������
	public final static int ABSORB_THUNDER_ODDS = 680; // ��ϵ����������
	public final static int ABSORB_OTHER_ODDS = 690; // Ԥ��ϵ����������
	public final static int ABSORB_FIRE_PCT = 700; // ��ϵ��������ϵ��
	public final static int ABSORB_WATER_PCT = 710; // ˮϵ��������ϵ��
	public final static int ABSORB_EARTH_PCT = 720; // ��ϵ��������ϵ��
	public final static int ABSORB_THUNDER_PCT = 730; // ��ϵ��������ϵ��
	public final static int ABSORB_OTHER_PCT = 740; // Ԥ��ϵ��������ϵ��
	public final static int PHYSIC_DAMGE_RATE = 750; // �����˺�Ч������
	public final static int ANTI_PHYSIC_DAMGE_RATE = 760; // �������˺�Ч������
	public final static int MAGIC_DAMGE_RATE = 770; // �����˺�Ч������
	public final static int ANTI_MAGIC_DAMGE_RATE = 780; // �ܷ����˺�Ч������
	public final static int HEAL_EFFECT_RATE = 790; // ����Ч������
	public final static int ANTI_HEAL_EFFECT_RATE = 800; // ������Ч������
	public final static int SEAL_LEVEL = 810; // ��ӡ���еȼ�
	public final static int ANTI_SEAL_LEVEL = 820; // ��ӡ���Եȼ�
	public final static int PHYSIC_CRIT_RATE = 830; // ��������������
	public final static int ANTI_PHYSIC_CRIT_RATE = 840; // ����������������
	public final static int MAGIC_CRIT_RATE = 850; // ����������������
	public final static int ANTI_MAGIC_CRIT_RATE = 860; // ������������������
	public final static int HEAL_CRIT_LEVEL = 870; // ���Ʊ�����������
	public final static int ANTI_HEAL_CRIT_LEVEL = 880; // �����Ʊ�����������
	public final static int ANTI_POISON_RATE = 890; // �����ͱ�����ʱ�ж���������
	public final static int ANTI_DIE_FORBID_RATE = 900; // ������������������
	public final static int ANTI_PARRY_RATE = 910; // ����ʱ���񵲼�������
	public final static int ANTI_RETURN_HURT_RATE = 920; // ����ʱ������������
	public final static int ANTI_ATTACK_BACK_RATE = 930; // ����ʱ����������������ԭ����������
	public final static int ANTI_GOD_BLESS_RATE = 940; // ����ʱ�����Ӽ�������
	public final static int PHYSIC_DAMGE_PIERCE_RATE = 950; // ����͸
	public final static int ANTI_PHYSIC_DAMGE_PIERCE_RATE = 960; // ����ֿ�
	public final static int MAGIC_DAMGE_PIERCE_RATE = 970; // ������͸
	public final static int ANTI_MAGIC_DAMGE_PIERCE_RATE = 980; // �����ֿ�
	public final static int HEAL_DEEP_RATE = 990; // ���Ƽ���
	public final static int ANTI_HEAL_DEEP_RATE = 1000; // �����Ƽ���
	public final static int EFFECT_POINT = 1010; // ����Ч����
	public final static int TEMP_SP = 1020; // ��ʱŭ��
	public final static int ENLIMIT = 1520; // ��������
	public final static int PFLIMIT = 1530; // ��������
	public final static int AMEND_HIDDEN_WEAPON_PASSIVE = 1540; // ���ڱ����˺�����
	public final static int ATTACK_BACK_LEVEL = 1750; // �����ȼ�
	public final static int RETURN_HURT_LEVEL = 1760; // ������ȼ�
	public final static int ANTI_ATTACK_BACK_LEVEL = 1770; // �������ȼ�
	public final static int ANTI_RETURN_HURT_LEVEL = 1780; // ��������ȼ�
	public final static int MAGIC_HIT = 1840; // ��������ֵ
	public final static int HEALEDREVISE = 800; // �ؼ�����
	public final static int ANTI_CRITC_LEVEL = 2090; // �����ȼ�
	public final static int KONGZHI_JIACHENG = 2130; // ���Ƽӳ�
	public final static int KONGZHI_MIANYI = 2140; // ��������
	public final static int PHYSIC_FLOAT_VALUE = 2150; // ������
	public final static int MAGIC_FLOAT_VALUE = 2160; // ��������
	public final static int HEAL_FLOAT_VALUE = 2170; // ���Ʋ���
	public final static int DEEP_HEAL_CRITC_LEVEL = 2180; // �����Ʊ���
	public final static int SHAPE_ID = 3000; // ģ��id


	public FightAttrType() {
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
		if (_o1_ instanceof FightAttrType) {
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

	public int compareTo(FightAttrType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


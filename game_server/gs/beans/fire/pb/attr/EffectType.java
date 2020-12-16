
package fire.pb.attr;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class EffectType implements Marshal , Comparable<EffectType>{
	public final static int CONS_ABL = 11;
	public final static int CONS_PCT = 12;
	public final static int IQ_ABL = 21;
	public final static int IQ_PCT = 22;
	public final static int STR_ABL = 31;
	public final static int STR_PCT = 32;
	public final static int ENDU_ABL = 41;
	public final static int ENDU_PCT = 42;
	public final static int AGI_ABL = 51;
	public final static int AGI_PCT = 52;
	public final static int MAX_HP_ABL = 61;
	public final static int MAX_HP_PCT = 62;
	public final static int UP_LIMITED_HP_ABL = 71;
	public final static int UP_LIMITED_HP_PCT = 72;
	public final static int HP_ABL = 81;
	public final static int HP_PCT = 82;
	public final static int MAX_MP_ABL = 91;
	public final static int MAX_MP_PCT = 92;
	public final static int MP_ABL = 101;
	public final static int MP_PCT = 102;
	public final static int MAX_SP_ABL = 111;
	public final static int MAX_SP_PCT = 112;
	public final static int SP_ABL = 121; // ŭ��
	public final static int SP_PCT = 122; // ŭ��
	public final static int DAMAGE_ABL = 131;
	public final static int DAMAGE_PCT = 132;
	public final static int DEFEND_ABL = 141;
	public final static int DEFEND_PCT = 142;
	public final static int MAGIC_ATTACK_ABL = 151; // ����������
	public final static int MAGIC_ATTACK_PCT = 152; // ����������
	public final static int MAGIC_DEF_ABL = 161; // ����������
	public final static int MAGIC_DEF_PCT = 162; // ����������
	public final static int MEDICAL_ABL = 171; // ����ǿ��
	public final static int SEAL_ABL = 181; // ��������
	public final static int UNSEAL_ABL = 191; // ��ϵ�ֿ�
	public final static int UNSEAL_PCT = 192; // ��ϵ�ֿ�
	public final static int SPEED_ABL = 201;
	public final static int SPEED_PCT = 202;
	public final static int HIT_RATE_ABL = 211;
	public final static int HIT_RATE_PCT = 212;
	public final static int DODGE_RATE_ABL = 221;
	public final static int DODGE_RATE_PCT = 222;
	public final static int PHY_CRITC_LEVEL_ABL = 231; // �������ȼ�
	public final static int PHY_CRITC_LEVEL_PCT = 232;
	public final static int ANTI_PHY_CRITC_LEVEL_ABL = 241; // ���������ȼ�
	public final static int PHYSIC_CRIT_PCT_ABL = 251; // �������ӳɣ���ʼΪ200%,��2����ͨ�˺���
	public final static int PHYSIC_CRIT_PCT_PCT = 252; // �������ӳɣ���ʼΪ200%,��2����ͨ�˺���
	public final static int MAGIC_CRITC_LEVEL_ABL = 261; // ħ�������ȼ�
	public final static int MAGIC_CRITC_LEVEL_PCT = 262;
	public final static int ANTI_MAGIC_CRITC_LEVEL_ABL = 271; // ��ħ�������ȼ�
	public final static int MAGIC_CRIT_PCT_ABL = 281; // ħ�������̶�
	public final static int MAGIC_CRIT_PCT_PCT = 282;
	public final static int STEAL_HP_PCT_ABL = 361; // ��Ѫ��������Ѫռ����˺��İٷֱȣ�Ĭ��0%)
	public final static int STEAL_HP_PCT_PCT = 362; // ��Ѫ��������Ѫռ����˺��İٷֱȣ�Ĭ��0%)
	public final static int STEAL_MP_PCT_ABL = 381; // ��������������ռ���mp�˺��İٷֱȣ�Ĭ��0%)
	public final static int POISON_RATE_ABL = 391; // ʹ�Է��ж����ʣ�Ĭ��0%)
	public final static int POISON_RATE_PCT = 392; // ʹ�Է��ж����ʣ�Ĭ��0%)
	public final static int COMBO_ATTACK_RATE_ABL = 451; // ��������
	public final static int COMBO_ATTACK_RATE_PCT = 452; // ��������
	public final static int COMBO_ATTACK_PCT_ABL = 461; // �����˺�ϵ��
	public final static int COMBO_ATTACK_PCT_PCT = 462;
	public final static int COMBO_ATTACK_COUNT_ABL = 471; // ��������
	public final static int COMBO_ATTACK_COUNT_PCT = 472; // ��������
	public final static int MAGIC_COMBO_ATTACK_RATE_ABL = 481; // ������������
	public final static int MAGIC_COMBO_ATTACK_RATE_PCT = 482;
	public final static int MAGIC_COMBO_ATTACK_PCT_ABL = 491; // ���������˺�ϵ��
	public final static int MAGIC_COMBO_ATTACK_PCT_PCT = 492;
	public final static int MAGIC_COMBO_ATTACK_COUNT_ABL = 501; // ������������
	public final static int MAGIC_COMBO_ATTACK_COUNT_PCT = 502; // ������������
	public final static int EXTRA_ATTACK_RATE_ABL = 511; // ׷������
	public final static int EXTRA_ATTACK_RATE_PCT = 512; // ׷������
	public final static int EXTRA_ATTACK_DEGREE_ABL = 521; // ׷���˺�ռ�����˺��ı���
	public final static int EXTRA_ATTACK_DEGREE_PCT = 522; // ׷���˺�ռ�����˺��ı���
	public final static int EXTRA_ATTACK_COUNT_ABL = 531; // ׷������
	public final static int EXTRA_ATTACK_COUNT_PCT = 532; // ׷������
	public final static int PARRY_RATE_ABL = 571; // �мܼ��ʣ�Ĭ��0%)
	public final static int PARRY_RATE_PCT = 572; // �мܼ��ʣ�Ĭ��0%)
	public final static int RETURN_HURT_RATE_ABL = 591; // ������
	public final static int RETURN_HURT_RATE_PCT = 592; // ������
	public final static int RETURN_HURT_PCT_ABL = 601; // ����̶ȣ������˺�ռ����˺��İٷֱȣ�Ĭ��30%)
	public final static int RETURN_HURT_PCT_PCT = 602; // ����̶ȣ������˺�ռ����˺��İٷֱȣ�Ĭ��30%)
	public final static int RETURN_ATTACK_RATE_ABL = 611; // ��������
	public final static int RETURN_ATTACK_RATE_PCT = 612; // ��������
	public final static int RETURN_ATTACK_PCT_ABL = 621; // �����̶ȣ����������˺��İٷֱȣ�Ĭ��100%��
	public final static int RETURN_ATTACK_PCT_PCT = 622; // �����̶ȣ����������˺��İٷֱȣ�Ĭ��100%��
	public final static int ABSORB_FIRE_ODDS_ABL = 651; // ��ϵ����������
	public final static int ABSORB_WATER_ODDS_ABL = 661; // ˮϵ����������
	public final static int ABSORB_EARTH_ODDS_ABL = 671; // ��ϵ����������
	public final static int ABSORB_THUNDER_ODDS_ABL = 681; // ��ϵ����������
	public final static int ABSORB_OTHER_ODDS_ABL = 691; // Ԥ��ϵ����������
	public final static int SEAL_LEVEL_ABL = 811; // ��ӡ���еȼ�
	public final static int ANTI_SEAL_LEVEL_ABL = 821; // ��ӡ���Եȼ�
	public final static int PHYSIC_CRIT_RATE_ABL = 831; // ����������
	public final static int PHYSIC_CRIT_RATE_PCT = 832; // ����������
	public final static int MAGIC_CRIT_RATE_ABL = 851; // �����������ʣ���ʼΪ0%��
	public final static int MAGIC_CRIT_RATE_PCT = 852; // �����������ʣ���ʼΪ0%��
	public final static int ATTACK_BACK_COUNT_ABL = 931; // ��������
	public final static int EFFECT_POINT_ABL = 1011; // ����Ч����
	public final static int TEMP_SP_ABL = 1021; // ��ʱŭ��
	public final static int AMEND_HIDDEN_WEAPON_ACTIVE_ABL = 1220; // ���������˺�����
	public final static int PET_LIFE_ABL = 1361; // ��������
	public final static int PET_ATTACK_APT_ABL = 1441; // ���﹥������
	public final static int PET_DEFEND_APT_ABL = 1451; // �����������
	public final static int PET_PHYFORCE_APT_ABL = 1461; // ������������
	public final static int PET_MAGIC_APT_ABL = 1471; // ���﷨������
	public final static int PET_SPEED_APT_ABL = 1481; // �����ٶ�����
	public final static int PET_DODGE_APT_ABL = 1491; // �����������
	public final static int ENLIMIT_ABL = 1521; // ��������
	public final static int PFLIMIT_ABL = 1531; // ��������
	public final static int OPERATOR = 1581;
	public final static int AIM = 1591;
	public final static int OPERATE_TYPE = 1171;
	public final static int OPERATE_ID = 1181;
	public final static int ATTACK_BACK_LEVEL_ABL = 1751; // �����ȼ�
	public final static int RETURN_HURT_LEVEL_ABL = 1761; // ������ȼ�
	public final static int ANTI_ATTACK_BACK_LEVEL_ABL = 1771; // �������ȼ�
	public final static int ANTI_RETURN_HURT_LEVEL_ABL = 1781; // ��������ȼ�
	public final static int QILIZHI_ABL = 1201; // ����ֵ
	public final static int KONGZHI_JIACHENG = 2131; // ���Ƽӳ�
	public final static int KONGZHI_MIANYI = 2141; // ��������
	public final static int SHAPE_ID = 3001; // ģ��id


	public EffectType() {
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
		if (_o1_ instanceof EffectType) {
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

	public int compareTo(EffectType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}



package fire.pb.ranklist;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ���а�����
*/
public class RankType implements Marshal , Comparable<RankType>{
	public final static int LEVEL_RANK = 1; // �ȼ�����
	public final static int PET_GRADE_RANK = 9; // �����ۺ����������֣����а�
	public final static int FACTION_RANK = 31; // �������а�
	public final static int ROLE_ZONGHE_RANK = 32; // �����ۺ�ʵ�����а�
	public final static int SINGLE_COPY_RANK1 = 21; // �����������˸���40-49��
	public final static int SINGLE_COPY_RANK2 = 22; // �����������˸���50-69��
	public final static int SINGLE_COPY_RANK3 = 23; // �����������˸���70-89��
	public final static int SINGLE_COPY_RANK4 = 24; // �����������˸���90��
	public final static int TEAM_COPY_RANK1 = 27; // ����������Ӹ���50-69��
	public final static int TEAM_COPY_RANK2 = 28; // ����������Ӹ���70-89��
	public final static int ROLE_RANK = 38; // ��ɫ���� by changhao
	public final static int PROFESSION_WARRIOR_RANK = 43; // սʿ by changhao
	public final static int PROFESSION_MAGIC_RANK = 44; // ��ʦ by changhao
	public final static int PROFESSION_PRIEST_RANK = 45; // ��ʦ by changhao
	public final static int PROFESSION_PALADIN_RANK = 46; // ʥ�� by changhao
	public final static int PROFESSION_HUNTER_RANK = 47; // ���� by changhao
	public final static int PROFESSION_DRUID_RANK = 48; // ��³�� by changhao
	public final static int FACTION_RANK_LEVEL = 49; // ����ȼ� by changhao
	public final static int FACTION_ZONGHE = 50; // �����ۺ�ʵ�� by changhao
	public final static int FACTION_MC = 51; // �ۻ�֮�� by changhao
	public final static int FACTION_NAXX = 52; // �ɿ�����˹ by changhao
	public final static int PROFESSION_ROGUE_RANK = 60; // ���� by changhao
	public final static int PROFESSION_SAMAN_RANK = 61; // ���� by changhao
	public final static int PROFESSION_WARLOCK_RANK = 62; // ��ʿ by changhao
	public final static int FACTION_COPY = 70; // ���ḱ�� by changhao
	public final static int PVP5_LAST_GRADE1 = 81; // 5v5�������Ͻ������
	public final static int PVP5_LAST_GRADE2 = 82; // 5v5�������Ͻ��м���
	public final static int PVP5_LAST_GRADE3 = 83; // 5v5�������Ͻ�߼���
	public final static int PVP5_HISTORY_GRADE1 = 84; // 5v5��������ʷ������
	public final static int PVP5_HISTORY_GRADE2 = 85; // 5v5��������ʷ�м���
	public final static int PVP5_HISTORY_GRADE3 = 86; // 5v5��������ʷ�߼���
	public final static int RED_PACK_1 = 101; // ����� ��ͨ�� by changhao
	public final static int RED_PACK_2 = 102; // ����� �㿨�� by changhao
	public final static int FLOWER_RECEIVE = 111; // �ջ��� by changhao
	public final static int FLOWER_GIVE = 112; // �ͻ��� by changhao
	public final static int CLAN_FIGHT_2 = 120; // ����ս���������ܶ��ǳ� by changhao
	public final static int CLAN_FIGHT_4 = 121; // ����ս�������������ǳ� by changhao
	public final static int CLAN_FIGHT_WEEK = 122; // ����ս������������ by changhao
	public final static int CLAN_FIGHT_HISTROY = 123; // ����ս��ʷ���� by changhao


	public RankType() {
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
		if (_o1_ instanceof RankType) {
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

	public int compareTo(RankType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}



package fire.pb.battle;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class BattleType implements Marshal , Comparable<BattleType>{
	public final static int BATTLE_PVE = 10; // ��� ,����pve %10����0
	public final static int BATTLE_HIDEAREA = 1100; // ������ս��
	public final static int BATTLE_SHOWAREA = 1200; // ������ս��
	public final static int BATTLE_BOSS = 30; // pve�е�bossս,��ս����ʱ����Ҫ��һ����ʾ(141614)
	public final static int BATTLE_LINE = 40; // ����ս��
	public final static int BATTLE_CLANBOSS = 50; // ����boss
	public final static int BATTLE_SHOUXI = 60; // capital apprentice
	public final static int BATTLE_PVP = 11; // �д�,����pvp %10����1
	public final static int BATTLE_LIVEDIE = 21; // ����ս
	public final static int BATTLE_DUEL_SINGLE = 31; // ���˾���
	public final static int BATTLE_DUEL_TEAM = 41; // ��Ӿ���
	public final static int BATTLE_BINGFENG_WAR = 100; // ��������ս��
	public final static int BATTLE_INST_BATTLE = 110; // ���ḱ��ս��
	public final static int BATTLE_CLAN_FIGHT = 201; // ����ս by changhao


	public BattleType() {
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
		if (_o1_ instanceof BattleType) {
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

	public int compareTo(BattleType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


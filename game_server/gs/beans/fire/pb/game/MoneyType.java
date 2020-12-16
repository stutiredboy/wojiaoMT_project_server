
package fire.pb.game;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ��������
*/
public class MoneyType implements Marshal , Comparable<MoneyType>{
	public final static int MoneyType_None = 0; // ��Ч����
	public final static int MoneyType_SilverCoin = 1; // ����
	public final static int MoneyType_GoldCoin = 2; // ���
	public final static int MoneyType_HearthStone = 3; // ��ʯ
	public final static int MoneyType_ProfContribute = 4; // ְҵ����
	public final static int MoneyType_RongYu = 5; // ����ֵ
	public final static int MoneyType_FactionContribute = 6; // ���ṱ��
	public final static int MoneyType_ShengWang = 7; // ����
	public final static int MoneyType_FestivalPoint = 8; // ���ջ���
	public final static int MoneyType_GoodTeacherVal = 9; // ��ʦֵ
	public final static int MoneyType_RoleExp = 10; // ��ɫ����
	public final static int MoneyType_Activity = 11; // ��Ծ��
	public final static int MoneyType_Energy = 12; // ����
	public final static int MoneyType_EreditPoint = 13; // ���õ�
	public final static int MoneyType_Item = 99; // ����
	public final static int MoneyType_Num = 15; // ��������


	public MoneyType() {
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
		if (_o1_ instanceof MoneyType) {
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

	public int compareTo(MoneyType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}



package fire.pb.npc;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class MultiExpError implements Marshal , Comparable<MultiExpError>{
	public final static int LevelConditionErr = -2; // �ȼ�����
	public final static int ExistOtherMultiExpBuff = -3; // ���������౶�����buff��������ȡ��ġ�
	public final static int NoOneMultiExpBuff = -4; // �����ڶ౶�����buff�������˻�
	public final static int NoHaveBuffTime = -5; // û�п�����ȡ��ʱ�䣬������ȡ
	public final static int OverMaxHours = -6; // ���϶౶ʱ���buff����4Сʱ


	public MultiExpError() {
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
		if (_o1_ instanceof MultiExpError) {
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

	public int compareTo(MultiExpError _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}



package fire.pb.talk;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class TipsMsgType implements Marshal , Comparable<TipsMsgType>{
	public final static int TIPS_POPMSG = 1; // ͸������ʾ
	public final static int TIPS_NPCTALK = 2; // npc�Ի�����ʾ
	public final static int TIPS_MSG_CHANNEL = 3; // ��ϢƵ����ʾ
	public final static int TIPS_SYSBOARD = 4; // ϵͳ������ʾ
	public final static int TIPS_CONFIRM = 5; // ȷ�Ͽ���ʾ
	public final static int TIPS_CLAN = 7; // ����Ƶ����ʾ
	public final static int TIPS_CUR_CHANNEL = 8; // ��ǰƵ����ʾ
	public final static int TIPS_WORLD = 9; // ����Ƶ����ʾ
	public final static int TIPS_TEAM_CHANNEL = 13; // ����Ƶ����ʾ
	public final static int TIPS_PRO_CHANNEL = 14; // ְҵƵ����ʾ
	public final static int TIPS_SYS_CHANNEL = 15; // ϵͳƵ����ʾ
	public final static int TIPS_ROLE_CHANNEL = 18; // �������ʾ


	public TipsMsgType() {
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
		if (_o1_ instanceof TipsMsgType) {
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

	public int compareTo(TipsMsgType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}



package fire.pb.talk;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ChannelType implements Marshal , Comparable<ChannelType>{
	public final static int CHANNEL_CURRENT = 1; // ��ǰƵ��
	public final static int CHANNEL_TEAM = 2; // ����Ƶ��
	public final static int CHANNEL_PROFESSION = 3; // ְҵƵ��
	public final static int CHANNEL_CLAN = 4; // ����Ƶ��
	public final static int CHANNEL_WORLD = 5; // ����Ƶ��
	public final static int CHANNEL_SYSTEM = 6; // ϵͳƵ��
	public final static int CHANNEL_MESSAGE = 7; // ��ϢƵ��
	public final static int CHANNEL_BUBBLE = 8; // ������Ϣ
	public final static int CHANNEL_SLIDE = 9; // ������Ϣ
	public final static int CHANNEL_TEAM_APPLY = 14; // �������Ƶ��


	public ChannelType() {
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
		if (_o1_ instanceof ChannelType) {
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

	public int compareTo(ChannelType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


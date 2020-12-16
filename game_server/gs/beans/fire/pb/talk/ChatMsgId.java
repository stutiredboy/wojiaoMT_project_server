
package fire.pb.talk;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ChatMsgId implements Marshal , Comparable<ChatMsgId>{
	public final static int CHAT_SPEED_LIMIT = 140497; // �벻Ҫ˵��̫��
	public final static int CANNOT_USE_TEAM_CHANNEL = 140498; // �㻹û�ж���
	public final static int CHAT_WORLD_CHANNEL_TIME_LIMIT = 140500; // ÿ��N�����������Ƶ������
	public final static int CHAT_WORLD_CHANNEL_LEVEL_LIMIT = 140501; // �ȼ�����N������������Ƶ������
	public final static int CANNOT_USE_FACTION_CHANNEL = 141053; // δ���빫��,����ʹ�ù���Ƶ��
	public final static int CHAT_TEAM_APPLY_CHANNEL_TIME_LIMIT = 150028; // ÿ��N��������������Ƶ������
	public final static int CHAT_SCHOOL_CHANNEL_LEVEL_LIMIT = 160471; // �ȼ�����N��������ְҵƵ������
	public final static int CHAT_CURRENT_CHANNEL_LEVEL_LIMIT = 142924; // �ȼ�����N�������ڵ�ǰƵ������


	public ChatMsgId() {
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
		if (_o1_ instanceof ChatMsgId) {
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

	public int compareTo(ChatMsgId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


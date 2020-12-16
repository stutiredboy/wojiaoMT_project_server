
package fire.pb.npc;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class SubmitType implements Marshal , Comparable<SubmitType>{
	public final static int ITEM = 1; // ����npc��������ص���Ʒ
	public final static int PET = 2; // ����npc,������صĳ���
	public final static int MONEY = 3; // ����npc,������صĽ�Ǯ
	public final static int FACTION_MONEY_BOX = 4; // ����npc,��������
	public final static int FAMILY_MONEY_BOX = 5; // ����npc,����
	public final static int INSTANCE_ZONE_ITEM = 13; // �����淨�ڵ��ύ��Ʒ
	public final static int GUILD_ZONE_ITEM = 22; // �����淨�ڵ��ύ��Ʒ


	public SubmitType() {
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
		if (_o1_ instanceof SubmitType) {
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

	public int compareTo(SubmitType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


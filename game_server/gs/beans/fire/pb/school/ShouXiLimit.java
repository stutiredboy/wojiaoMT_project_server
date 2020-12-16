
package fire.pb.school;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ShouXiLimit implements Marshal , Comparable<ShouXiLimit>{
	public final static int CHALLENGE_LEVEL_LIMIT = 40; // ��ս��ϯ�ĵȼ�����
	public final static int SCHOOL_CONTRIBUTE_LIMIT = 500; // ��ս��ϯ��Ҫ��ְҵ���׶�
	public final static int MONEY_LIMIT = 10000; // ��ս��ϯ��Ҫ�Ľ�Ǯ
	public final static int VOTE_LEVEL_LIMIT = 30; // ͶƱ��Ҫ�ĵȼ�
	public final static int TILI_LIMIT = 100; // ͶƱ��Ҫ������ֵ
	public final static int REFRESH_TIMES_LIMIT = 5; // ͶƱ��Ҫ������ֵ


	public ShouXiLimit() {
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
		if (_o1_ instanceof ShouXiLimit) {
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

	public int compareTo(ShouXiLimit _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}



package fire.pb;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class KickErrConst implements Marshal , Comparable<KickErrConst>{
	public final static int ERR_GM_KICKOUT = 2049; // ��GM������
	public final static int ERR_SERVER_SHUTDOWN = 2050; // �������ر�
	public final static int ERR_GACD_PUNISH = 2051; // ����Ҵ���û��ͨ��
	public final static int ERR_RUN_TOO_FAST = 2052; // ��·̫�챻��
	public final static int ERR_GACD_WAIGUA = 2053; // ʹ�����
	public final static int ERR_XUNBAO_SELLROLE = 2054; // �ұ������۽�ɫ
	public final static int ERR_FORBID_USER = 2055; // �˺ű��������
	public final static int ERR_GACD_KICKOUT = 2056; // gacd��-1���������


	public KickErrConst() {
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
		if (_o1_ instanceof KickErrConst) {
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

	public int compareTo(KickErrConst _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


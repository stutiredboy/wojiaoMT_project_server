
package fire.pb;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class LogPriority implements Marshal , Comparable<LogPriority>{
	public final static int LOG_FORMAT = 15; // �����Ϊ��׼����־���磺�˺ŵ�½����ֵ��������ء�
	public final static int LOG_STAT = 16; // ÿ5���Ӽ�¼�ʼ���������Ǯ�޸�������Ʒ�޸����ȡ�
	public final static int LOG_GM = 17; // ��¼GM������log
	public final static int LOG_MONEY = 18; // ��¼��Ǯ�Ĳ�������������ԭ��
	public final static int LOG_CHAR2 = 19; // �����¼����¼����BASE64�����¼��
	public final static int LOG_COUNTER = 20; // ÿ5���Ӽ�¼�ʼ���������Ǯ�޸�������Ʒ�޸����ȡ�
	public final static int LOG_XINGCHENG = 21; // �����ϸ��Ϊ��־���磺�ƶ�����֣���ӣ�ʰȡ�ȡ�
	public final static int LOG_TRADE = 22; // ÿ���̳����ļ�¼��
	public final static int LOG_FUSHI = 23; // �ۼƼ�¼��ҳ�ֵ�����������ķ�ʯ������


	public LogPriority() {
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
		if (_o1_ instanceof LogPriority) {
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

	public int compareTo(LogPriority _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


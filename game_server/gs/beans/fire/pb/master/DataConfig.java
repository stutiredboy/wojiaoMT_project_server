
package fire.pb.master;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ʦͽϵͳ ����Э��
*/
public class DataConfig implements Marshal , Comparable<DataConfig>{
	public final static int REG_MONEY = 20000; // �Ǽ�ʦ���۳�����Ϸ��
	public final static int MONEY1 = 10000; // ͽ��3����7�첻���ߣ������ϵ����۳�ʦ��10000��Ϸ��
	public final static int MONEY2 = 100000; // ͽ��3�����ڲ����ߣ������ϵ����۳�ʦ��100000��Ϸ��
	public final static int REN_QI = 100; // ͽ��3�����ڲ����ߣ������ϵ����۳�ʦ��100����ֵ
	public final static int TAIXUEFUZI_ID = 10215; // ̫ѧ����id
	public final static int EVALUATER_LEVEL1 = 120; // ʦ������һ
	public final static int EVALUATER_LEVEL2 = 100; // ʦ�������
	public final static int EVALUATER_LEVEL3 = 80; // ʦ��������
	public final static int EVALUATER_LEVEL4 = 60; // ʦ��������
	public final static int EVALUATER_LEVEL5 = 40; // ʦ��������


	public DataConfig() {
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
		if (_o1_ instanceof DataConfig) {
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

	public int compareTo(DataConfig _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


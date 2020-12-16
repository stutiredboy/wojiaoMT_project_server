
package fire.pb;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ����������
*/
public class BeginnerTipType implements Marshal , Comparable<BeginnerTipType>{
	public final static int StudyExtendSkill = 0; // ѧϰ��ѧ����
	public final static int GotoSchool = 1; // ��ְҵ
	public final static int ReleaseApprenticeInfo = 2; // ����ͽ����Ϣ
	public final static int ReleaseMasterInfo = 3; // ����ʦ����Ϣ
	public final static int UseShilizhengming = 4; // ʹ��ʵ��֤��
	public final static int BattleSkill = 30001;
	public final static int LevelUp = 30002;
	public final static int AllocateProperty = 30003;
	public final static int AutoFindPath = 30004;
	public final static int UseSkill = 30005;
	public final static int MiniMap = 30006;


	public BeginnerTipType() {
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
		if (_o1_ instanceof BeginnerTipType) {
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

	public int compareTo(BeginnerTipType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


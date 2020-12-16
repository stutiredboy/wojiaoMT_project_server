
package fire.pb.pet;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class PetError implements Marshal , Comparable<PetError>{
	public final static int UnkownError = -1; // δ֪����
	public final static int KeyNotFound = -2; // key�����Ҳ�����Ӧ����
	public final static int PetcolumnFull = -3; // ��ӳ�����ߴ�ȡ����ʱ���������Ѿ�����
	public final static int WrongDstCol = -4; // ͬ�����ڳ��ﲻ���ƶ�.
	public final static int ShowPetCantMoveErr = -5; // չʾ���ﲻ�����
	public final static int FightPetCantMoveErr = -6; // ��ս���ﲻ�����
	public final static int PetNameOverLen = -7; // �������ƹ���
	public final static int PetNameShotLen = -8; // �������ƹ���
	public final static int PetNameInvalid = -9; // �������ַǷ�
	public final static int ShowPetCantFree = -10; // չʾ�ĳ��ﲻ�ܷ���
	public final static int FightPetCantFree = -11; // ���ڲ�ս�ĳ��ﲻ�ܷ���
	public final static int WrongFreeCode = -12; // ����ķ��������


	public PetError() {
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
		if (_o1_ instanceof PetError) {
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

	public int compareTo(PetError _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


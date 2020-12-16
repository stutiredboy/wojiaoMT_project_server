
package fire.pb.move;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class SpriteComponents implements Marshal , Comparable<SpriteComponents>{
	public final static int SPRITE_WEAPON = 1; // ����
	public final static int SPRITE_HEADDRESS = 2; // ͷ��
	public final static int SPRITE_BACKDRESS = 3; // ����
	public final static int SPRITE_FACEDRESS1 = 4; // ����1
	public final static int SPRITE_FACEDRESS2 = 5; // ����2
	public final static int SPRITE_HORSEDRESS = 6; // ����
	public final static int SPRITE_WEAPONCOLOR = 7; // ������ɫ	������ɫ	byte 1Ϊ��ɫ��2Ϊ��ɫ����4Ϊ��ɫ 5Ϊ��ɫ
	public final static int SPRITE_FASHION = 8; // ʱװ
	public final static int ROLE_COLOR1 = 50; // Ⱦɫ��λ1
	public final static int ROLE_COLOR2 = 51; // Ⱦɫ��λ2
	public final static int SPRITE_EQUIP_EFFECT = 60; // װ����Ч


	public SpriteComponents() {
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
		if (_o1_ instanceof SpriteComponents) {
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

	public int compareTo(SpriteComponents _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

}


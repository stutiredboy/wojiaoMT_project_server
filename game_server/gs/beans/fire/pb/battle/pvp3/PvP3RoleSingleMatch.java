
package fire.pb.battle.pvp3;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class PvP3RoleSingleMatch implements Marshal , Comparable<PvP3RoleSingleMatch>{
	public long roleid; // ��ɫID
	public short level; // ��ɫ�ȼ�
	public int shape; // ����
	public int school; // ְҵ

	public PvP3RoleSingleMatch() {
	}

	public PvP3RoleSingleMatch(long _roleid_, short _level_, int _shape_, int _school_) {
		this.roleid = _roleid_;
		this.level = _level_;
		this.shape = _shape_;
		this.school = _school_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(roleid);
		_os_.marshal(level);
		_os_.marshal(shape);
		_os_.marshal(school);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		level = _os_.unmarshal_short();
		shape = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof PvP3RoleSingleMatch) {
			PvP3RoleSingleMatch _o_ = (PvP3RoleSingleMatch)_o1_;
			if (roleid != _o_.roleid) return false;
			if (level != _o_.level) return false;
			if (shape != _o_.shape) return false;
			if (school != _o_.school) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += level;
		_h_ += shape;
		_h_ += school;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(level).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(school).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(PvP3RoleSingleMatch _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = level - _o_.level;
		if (0 != _c_) return _c_;
		_c_ = shape - _o_.shape;
		if (0 != _c_) return _c_;
		_c_ = school - _o_.school;
		if (0 != _c_) return _c_;
		return _c_;
	}

}


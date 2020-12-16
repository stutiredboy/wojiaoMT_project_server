
package fire.pb.battle.livedie;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class LDRoleInfoDes implements Marshal {
	public long roleid; // ��ɫId
	public java.lang.String rolename; // ��ɫ��
	public int shape; // ��ɫ����
	public int level; // ��ɫ�ȼ�
	public int school; // ְҵ
	public int teamnum; // ���鵱ǰ����
	public int teamnummax; // �����������

	public LDRoleInfoDes() {
		rolename = "";
	}

	public LDRoleInfoDes(long _roleid_, java.lang.String _rolename_, int _shape_, int _level_, int _school_, int _teamnum_, int _teamnummax_) {
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.shape = _shape_;
		this.level = _level_;
		this.school = _school_;
		this.teamnum = _teamnum_;
		this.teamnummax = _teamnummax_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(shape);
		_os_.marshal(level);
		_os_.marshal(school);
		_os_.marshal(teamnum);
		_os_.marshal(teamnummax);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		shape = _os_.unmarshal_int();
		level = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		teamnum = _os_.unmarshal_int();
		teamnummax = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof LDRoleInfoDes) {
			LDRoleInfoDes _o_ = (LDRoleInfoDes)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (shape != _o_.shape) return false;
			if (level != _o_.level) return false;
			if (school != _o_.school) return false;
			if (teamnum != _o_.teamnum) return false;
			if (teamnummax != _o_.teamnummax) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += rolename.hashCode();
		_h_ += shape;
		_h_ += level;
		_h_ += school;
		_h_ += teamnum;
		_h_ += teamnummax;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(level).append(",");
		_sb_.append(school).append(",");
		_sb_.append(teamnum).append(",");
		_sb_.append(teamnummax).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


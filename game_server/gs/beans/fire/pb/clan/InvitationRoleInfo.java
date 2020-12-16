
package fire.pb.clan;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class InvitationRoleInfo implements Marshal {
	public long roleid; // ��ɫId
	public java.lang.String rolename; // ��ɫ��
	public int shape; // ��ɫ����
	public int level; // ��ɫ�ȼ�
	public int sex; // �Ա�
	public int school; // ְҵ
	public int fightvalue; // �ۺ�ս��
	public int vip; // vip
	public java.util.HashMap<Byte,Integer> components; // ��ɫ��װ��Ϣkeyֵ�ο�SpriteComponents��ö�٣�valueΪ0��������ĳ����װ

	public InvitationRoleInfo() {
		rolename = "";
		components = new java.util.HashMap<Byte,Integer>();
	}

	public InvitationRoleInfo(long _roleid_, java.lang.String _rolename_, int _shape_, int _level_, int _sex_, int _school_, int _fightvalue_, int _vip_, java.util.HashMap<Byte,Integer> _components_) {
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.shape = _shape_;
		this.level = _level_;
		this.sex = _sex_;
		this.school = _school_;
		this.fightvalue = _fightvalue_;
		this.vip = _vip_;
		this.components = _components_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(shape);
		_os_.marshal(level);
		_os_.marshal(sex);
		_os_.marshal(school);
		_os_.marshal(fightvalue);
		_os_.marshal(vip);
		_os_.compact_uint32(components.size());
		for (java.util.Map.Entry<Byte, Integer> _e_ : components.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		shape = _os_.unmarshal_int();
		level = _os_.unmarshal_int();
		sex = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		fightvalue = _os_.unmarshal_int();
		vip = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			int _v_;
			_v_ = _os_.unmarshal_int();
			components.put(_k_, _v_);
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof InvitationRoleInfo) {
			InvitationRoleInfo _o_ = (InvitationRoleInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (shape != _o_.shape) return false;
			if (level != _o_.level) return false;
			if (sex != _o_.sex) return false;
			if (school != _o_.school) return false;
			if (fightvalue != _o_.fightvalue) return false;
			if (vip != _o_.vip) return false;
			if (!components.equals(_o_.components)) return false;
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
		_h_ += sex;
		_h_ += school;
		_h_ += fightvalue;
		_h_ += vip;
		_h_ += components.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(level).append(",");
		_sb_.append(sex).append(",");
		_sb_.append(school).append(",");
		_sb_.append(fightvalue).append(",");
		_sb_.append(vip).append(",");
		_sb_.append(components).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


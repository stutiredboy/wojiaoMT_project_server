
package fire.pb.move;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class RoleBasicOctets implements Marshal {
	public final static int SHOW_PET = 1; // չʾ���� ShowPetOctets
	public final static int TEAM_INFO = 2; // �����Ϣ TeamInfoOctets
	public final static int TITLE_ID = 3; // ��νID byte [-1,)
	public final static int TITLE_NAME = 4; // ��ν���� String
	public final static int STALL_NAME = 5; // �������� String
	public final static int MODEL_TEMPLATE = 6; // ��������ģ�� byte [0,255]
	public final static int HEADRESS_SHAPE = 7; // ͷ������ byte [0,255]
	public final static int SCENE_STATE = 8; // ��ͼ״̬ int ���ο�SceneState
	public final static int WEAPON_BASEID = 9; // ��ǰװ��������baseID int ûװ����Ϊ0
	public final static int WEAPON_COLOR = 10; // ��ǰװ����������ɫ byte 1Ϊ��ɫ��2Ϊ��ɫ������6Ϊ����ɫ
	public final static int ROLE_ACTUALLY_SHAPE = 12; // ��ɫ������ʱ������ int
	public final static int PLAYING_ACTION = 13; // ��ɫ�������ĳ����Զ���id byte
	public final static int STALL_BOARD = 14; // ̯λ����id byte
	public final static int FOOT_LOGO_ID = 15; // id int
	public final static int AWAKE_STATE = 16; // ����״̬ 95��99 00000 5��bitλ��0�����Ӧ�׶�δ���ѣ�1�����Ѿ����ѣ�����ֵ��int��ֵ��
	public final static int FOLLOW_NPC = 17; // ����npc id
	public final static int CRUISE = 18; // Ѳ��id int,0Ϊû��Ѳ�Σ���0ΪѲ�α��id
	public final static int EFFECT_EQUIP = 19; // װ����Ч
	public final static int CRUISE2 = 20; // Ѳ��id2 int,·��id
	public final static int CRUISE3 = 21; // Ѳ��id3 int,·��id

	public long roleid;
	public java.lang.String rolename;
	public byte dirandschool; // dirΪ����λ��[0,7] ��schoolΪ��4λ [1,9],ת��ΪְҵID[11,19]
	public int shape; // �������	ֻ����1-10��������֮�󣬲�Ҫ�ı����shapeֵ�����Ǹı������ѡ����ö��ֵ���ROLE_ACTUALLY_SHAPE
	public int level;
	public byte camp; // 0����  1���� 2����
	public java.util.HashMap<Byte,Integer> components; // ��ɫ��װ��Ϣkeyֵ�ο�SpriteComponents��ö��
	public java.util.HashMap<Byte,com.locojoy.base.Octets> datas; // ��ѡ���ݣ�keyֵ�ο������ö��(key�������Ϊbyte���ͣ���Ϊint̫��)

	public RoleBasicOctets() {
		rolename = "";
		components = new java.util.HashMap<Byte,Integer>();
		datas = new java.util.HashMap<Byte,com.locojoy.base.Octets>();
	}

	public RoleBasicOctets(long _roleid_, java.lang.String _rolename_, byte _dirandschool_, int _shape_, int _level_, byte _camp_, java.util.HashMap<Byte,Integer> _components_, java.util.HashMap<Byte,com.locojoy.base.Octets> _datas_) {
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.dirandschool = _dirandschool_;
		this.shape = _shape_;
		this.level = _level_;
		this.camp = _camp_;
		this.components = _components_;
		this.datas = _datas_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(dirandschool);
		_os_.marshal(shape);
		_os_.marshal(level);
		_os_.marshal(camp);
		_os_.compact_uint32(components.size());
		for (java.util.Map.Entry<Byte, Integer> _e_ : components.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		_os_.compact_uint32(datas.size());
		for (java.util.Map.Entry<Byte, com.locojoy.base.Octets> _e_ : datas.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		dirandschool = _os_.unmarshal_byte();
		shape = _os_.unmarshal_int();
		level = _os_.unmarshal_int();
		camp = _os_.unmarshal_byte();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			int _v_;
			_v_ = _os_.unmarshal_int();
			components.put(_k_, _v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			com.locojoy.base.Octets _v_;
			_v_ = _os_.unmarshal_Octets();
			datas.put(_k_, _v_);
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof RoleBasicOctets) {
			RoleBasicOctets _o_ = (RoleBasicOctets)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (dirandschool != _o_.dirandschool) return false;
			if (shape != _o_.shape) return false;
			if (level != _o_.level) return false;
			if (camp != _o_.camp) return false;
			if (!components.equals(_o_.components)) return false;
			if (!datas.equals(_o_.datas)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += rolename.hashCode();
		_h_ += (int)dirandschool;
		_h_ += shape;
		_h_ += level;
		_h_ += (int)camp;
		_h_ += components.hashCode();
		_h_ += datas.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(dirandschool).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(level).append(",");
		_sb_.append(camp).append(",");
		_sb_.append(components).append(",");
		_sb_.append(datas).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}



package fire.pb.battle;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class FighterInfo implements Marshal {
	public int fightertype; // ս����Ԫ����
	public long dataid; // ս����Ԫ�ı�� ����Ϊ�����roleid ����͹�����Ϊ���е�baseID
	public java.lang.String fightername; // ս����Ԫ����
	public java.lang.String title; // ս����Ԫ��ν
	public int titleid; // ս����Ԫ��νID
	public int awakestate; // ����״̬ 00000 5��bitλ���ӵ�λ����λ�ֱ��ʶ95��99״̬��0-δ���ѣ�1-���ѣ�����ֵ��int��ֵ��
	public int index; // ս����Ԫ��ս���е����λ��
	public byte bgm; // �Ƿ���GM,0:�� 1����
	public int maxhp; // ���Ѫ��
	public int uplimithp; // Ѫ������
	public int hp; // ��ǰѪ��
	public int ep; // ��ǰЧ����
	public int shape; // ����	����Ϊshortֵ
	public int subtype; // �����ͣ�����Ϊ���ʣ�����Ϊ����Ұ���
	public java.util.HashMap<Byte,Integer> components; // ��ɫ��װ��Ϣkeyֵ�ο�SpriteComponents��ö�٣�valueΪ0��������ĳ����װ
	public java.util.HashMap<Integer,Integer> buffs; // ��ӵ�ս����ӵ�е���ս������ʾ��buff��valueΪ�غ�����Ϊ0��û�лغ����ƣ�
	public int footlogoid; // ��ӡid
	public java.util.LinkedList<Integer> petkeys; // �Ѿ���ս�ĳ���

	public FighterInfo() {
		fightername = "";
		title = "";
		components = new java.util.HashMap<Byte,Integer>();
		buffs = new java.util.HashMap<Integer,Integer>();
		petkeys = new java.util.LinkedList<Integer>();
	}

	public FighterInfo(int _fightertype_, long _dataid_, java.lang.String _fightername_, java.lang.String _title_, int _titleid_, int _awakestate_, int _index_, byte _bgm_, int _maxhp_, int _uplimithp_, int _hp_, int _ep_, int _shape_, int _subtype_, java.util.HashMap<Byte,Integer> _components_, java.util.HashMap<Integer,Integer> _buffs_, int _footlogoid_, java.util.LinkedList<Integer> _petkeys_) {
		this.fightertype = _fightertype_;
		this.dataid = _dataid_;
		this.fightername = _fightername_;
		this.title = _title_;
		this.titleid = _titleid_;
		this.awakestate = _awakestate_;
		this.index = _index_;
		this.bgm = _bgm_;
		this.maxhp = _maxhp_;
		this.uplimithp = _uplimithp_;
		this.hp = _hp_;
		this.ep = _ep_;
		this.shape = _shape_;
		this.subtype = _subtype_;
		this.components = _components_;
		this.buffs = _buffs_;
		this.footlogoid = _footlogoid_;
		this.petkeys = _petkeys_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(fightertype);
		_os_.marshal(dataid);
		_os_.marshal(fightername, "UTF-16LE");
		_os_.marshal(title, "UTF-16LE");
		_os_.marshal(titleid);
		_os_.marshal(awakestate);
		_os_.marshal(index);
		_os_.marshal(bgm);
		_os_.marshal(maxhp);
		_os_.marshal(uplimithp);
		_os_.marshal(hp);
		_os_.marshal(ep);
		_os_.marshal(shape);
		_os_.marshal(subtype);
		_os_.compact_uint32(components.size());
		for (java.util.Map.Entry<Byte, Integer> _e_ : components.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		_os_.compact_uint32(buffs.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : buffs.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		_os_.marshal(footlogoid);
		_os_.compact_uint32(petkeys.size());
		for (Integer _v_ : petkeys) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		fightertype = _os_.unmarshal_int();
		dataid = _os_.unmarshal_long();
		fightername = _os_.unmarshal_String("UTF-16LE");
		title = _os_.unmarshal_String("UTF-16LE");
		titleid = _os_.unmarshal_int();
		awakestate = _os_.unmarshal_int();
		index = _os_.unmarshal_int();
		bgm = _os_.unmarshal_byte();
		maxhp = _os_.unmarshal_int();
		uplimithp = _os_.unmarshal_int();
		hp = _os_.unmarshal_int();
		ep = _os_.unmarshal_int();
		shape = _os_.unmarshal_int();
		subtype = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			int _v_;
			_v_ = _os_.unmarshal_int();
			components.put(_k_, _v_);
		}
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			buffs.put(_k_, _v_);
		}
		footlogoid = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			petkeys.add(_v_);
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof FighterInfo) {
			FighterInfo _o_ = (FighterInfo)_o1_;
			if (fightertype != _o_.fightertype) return false;
			if (dataid != _o_.dataid) return false;
			if (!fightername.equals(_o_.fightername)) return false;
			if (!title.equals(_o_.title)) return false;
			if (titleid != _o_.titleid) return false;
			if (awakestate != _o_.awakestate) return false;
			if (index != _o_.index) return false;
			if (bgm != _o_.bgm) return false;
			if (maxhp != _o_.maxhp) return false;
			if (uplimithp != _o_.uplimithp) return false;
			if (hp != _o_.hp) return false;
			if (ep != _o_.ep) return false;
			if (shape != _o_.shape) return false;
			if (subtype != _o_.subtype) return false;
			if (!components.equals(_o_.components)) return false;
			if (!buffs.equals(_o_.buffs)) return false;
			if (footlogoid != _o_.footlogoid) return false;
			if (!petkeys.equals(_o_.petkeys)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += fightertype;
		_h_ += (int)dataid;
		_h_ += fightername.hashCode();
		_h_ += title.hashCode();
		_h_ += titleid;
		_h_ += awakestate;
		_h_ += index;
		_h_ += (int)bgm;
		_h_ += maxhp;
		_h_ += uplimithp;
		_h_ += hp;
		_h_ += ep;
		_h_ += shape;
		_h_ += subtype;
		_h_ += components.hashCode();
		_h_ += buffs.hashCode();
		_h_ += footlogoid;
		_h_ += petkeys.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(fightertype).append(",");
		_sb_.append(dataid).append(",");
		_sb_.append("T").append(fightername.length()).append(",");
		_sb_.append("T").append(title.length()).append(",");
		_sb_.append(titleid).append(",");
		_sb_.append(awakestate).append(",");
		_sb_.append(index).append(",");
		_sb_.append(bgm).append(",");
		_sb_.append(maxhp).append(",");
		_sb_.append(uplimithp).append(",");
		_sb_.append(hp).append(",");
		_sb_.append(ep).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(subtype).append(",");
		_sb_.append(components).append(",");
		_sb_.append(buffs).append(",");
		_sb_.append(footlogoid).append(",");
		_sb_.append(petkeys).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


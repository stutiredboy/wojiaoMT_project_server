
package fire.pb.battle.pvp5;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class PvP5RoleSingleScoreMid implements Marshal {
	public byte listid; // �����б�(1 or 2)
	public short index; // ����
	public long roleid; // ��ɫID
	public java.lang.String rolename; // ��ɫ����
	public int score; // ����
	public byte battlenum; // �����Ѿ�ս���Ĵ���
	public byte winnum; // ����ʤ������

	public PvP5RoleSingleScoreMid() {
		rolename = "";
	}

	public PvP5RoleSingleScoreMid(byte _listid_, short _index_, long _roleid_, java.lang.String _rolename_, int _score_, byte _battlenum_, byte _winnum_) {
		this.listid = _listid_;
		this.index = _index_;
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.score = _score_;
		this.battlenum = _battlenum_;
		this.winnum = _winnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(listid);
		_os_.marshal(index);
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(score);
		_os_.marshal(battlenum);
		_os_.marshal(winnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		listid = _os_.unmarshal_byte();
		index = _os_.unmarshal_short();
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		score = _os_.unmarshal_int();
		battlenum = _os_.unmarshal_byte();
		winnum = _os_.unmarshal_byte();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof PvP5RoleSingleScoreMid) {
			PvP5RoleSingleScoreMid _o_ = (PvP5RoleSingleScoreMid)_o1_;
			if (listid != _o_.listid) return false;
			if (index != _o_.index) return false;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (score != _o_.score) return false;
			if (battlenum != _o_.battlenum) return false;
			if (winnum != _o_.winnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)listid;
		_h_ += index;
		_h_ += (int)roleid;
		_h_ += rolename.hashCode();
		_h_ += score;
		_h_ += (int)battlenum;
		_h_ += (int)winnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(listid).append(",");
		_sb_.append(index).append(",");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(score).append(",");
		_sb_.append(battlenum).append(",");
		_sb_.append(winnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


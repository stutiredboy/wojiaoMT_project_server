
package fire.pb.battle.pvp3;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class PvP3RoleSingleScoreMid implements Marshal {
	public short index; // ����
	public long roleid; // ��ɫID
	public java.lang.String rolename; // ��ɫ����
	public int score; // ����

	public PvP3RoleSingleScoreMid() {
		rolename = "";
	}

	public PvP3RoleSingleScoreMid(short _index_, long _roleid_, java.lang.String _rolename_, int _score_) {
		this.index = _index_;
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.score = _score_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(index);
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(score);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		index = _os_.unmarshal_short();
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		score = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof PvP3RoleSingleScoreMid) {
			PvP3RoleSingleScoreMid _o_ = (PvP3RoleSingleScoreMid)_o1_;
			if (index != _o_.index) return false;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (score != _o_.score) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += index;
		_h_ += (int)roleid;
		_h_ += rolename.hashCode();
		_h_ += score;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(index).append(",");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(score).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


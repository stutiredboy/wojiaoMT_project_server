
package fire.pb.ranklist;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

/** ���۰�
*/
public class RoleZongheRankRecord implements Marshal {
	public int rank; // ����
	public long roleid; // ��ɫID
	public java.lang.String rolename; // ��������
	public int school; // ְҵ
	public int score; // ������
	public int rolelevel; // �ȼ� by changhao

	public RoleZongheRankRecord() {
		rolename = "";
	}

	public RoleZongheRankRecord(int _rank_, long _roleid_, java.lang.String _rolename_, int _school_, int _score_, int _rolelevel_) {
		this.rank = _rank_;
		this.roleid = _roleid_;
		this.rolename = _rolename_;
		this.school = _school_;
		this.score = _score_;
		this.rolelevel = _rolelevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(rank);
		_os_.marshal(roleid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(school);
		_os_.marshal(score);
		_os_.marshal(rolelevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		rank = _os_.unmarshal_int();
		roleid = _os_.unmarshal_long();
		rolename = _os_.unmarshal_String("UTF-16LE");
		school = _os_.unmarshal_int();
		score = _os_.unmarshal_int();
		rolelevel = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof RoleZongheRankRecord) {
			RoleZongheRankRecord _o_ = (RoleZongheRankRecord)_o1_;
			if (rank != _o_.rank) return false;
			if (roleid != _o_.roleid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (school != _o_.school) return false;
			if (score != _o_.score) return false;
			if (rolelevel != _o_.rolelevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += rank;
		_h_ += (int)roleid;
		_h_ += rolename.hashCode();
		_h_ += school;
		_h_ += score;
		_h_ += rolelevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(rank).append(",");
		_sb_.append(roleid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(school).append(",");
		_sb_.append(score).append(",");
		_sb_.append(rolelevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


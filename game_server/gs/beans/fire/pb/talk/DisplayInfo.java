
package fire.pb.talk;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class DisplayInfo implements Marshal , Comparable<DisplayInfo>{
	public final static int DISPLAY_ITEM = 1;
	public final static int DISPLAY_PET = 2;
	public final static int DISPLAY_TASK = 8; // �������
	public final static int DISPLAY_TEAM_APPLY = 9; // ������� by changhao
	public final static int DISPLAY_ROLL_ITEM = 11; // ROLL�� by changhao
	public final static int DISPLAY_ACTIVITY_ANSWER = 12; // ����� by changhao
	public final static int DISPLAY_LIVEDIE = 13; // ����ս����
	public final static int DISPLAY_BATTLE = 14; // ս��¼������
	public final static int DISPLAY_SACE_ROLE = 15;

	public int displaytype; // ����
	public long roleid; // ��ɫid
	public long shopid; // �̵�id,�ɾ����͵�ʱ�������ʱ��(1�������� 2ѭ������)
	public int counterid; // ��̨id,�ɾ����͵�ʱ���ǳɾͽ���
	public int uniqid; // Ψһid,�ɾ����͵�ʱ�����ǳɾ�id
	public long teamid; // �ӳ�ID by changhao

	public DisplayInfo() {
	}

	public DisplayInfo(int _displaytype_, long _roleid_, long _shopid_, int _counterid_, int _uniqid_, long _teamid_) {
		this.displaytype = _displaytype_;
		this.roleid = _roleid_;
		this.shopid = _shopid_;
		this.counterid = _counterid_;
		this.uniqid = _uniqid_;
		this.teamid = _teamid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(displaytype);
		_os_.marshal(roleid);
		_os_.marshal(shopid);
		_os_.marshal(counterid);
		_os_.marshal(uniqid);
		_os_.marshal(teamid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		displaytype = _os_.unmarshal_int();
		roleid = _os_.unmarshal_long();
		shopid = _os_.unmarshal_long();
		counterid = _os_.unmarshal_int();
		uniqid = _os_.unmarshal_int();
		teamid = _os_.unmarshal_long();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof DisplayInfo) {
			DisplayInfo _o_ = (DisplayInfo)_o1_;
			if (displaytype != _o_.displaytype) return false;
			if (roleid != _o_.roleid) return false;
			if (shopid != _o_.shopid) return false;
			if (counterid != _o_.counterid) return false;
			if (uniqid != _o_.uniqid) return false;
			if (teamid != _o_.teamid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += displaytype;
		_h_ += (int)roleid;
		_h_ += (int)shopid;
		_h_ += counterid;
		_h_ += uniqid;
		_h_ += (int)teamid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(displaytype).append(",");
		_sb_.append(roleid).append(",");
		_sb_.append(shopid).append(",");
		_sb_.append(counterid).append(",");
		_sb_.append(uniqid).append(",");
		_sb_.append(teamid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(DisplayInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = displaytype - _o_.displaytype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(shopid - _o_.shopid);
		if (0 != _c_) return _c_;
		_c_ = counterid - _o_.counterid;
		if (0 != _c_) return _c_;
		_c_ = uniqid - _o_.uniqid;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(teamid - _o_.teamid);
		if (0 != _c_) return _c_;
		return _c_;
	}

}


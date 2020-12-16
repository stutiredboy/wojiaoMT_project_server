
package fire.pb.clan;

import com.locojoy.base.Marshal.Marshal;
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

public class ClanMember implements Marshal {
	public long roleid; // ��ɫid
	public int shapeid; // ͷ��id
	public java.lang.String rolename; // ��Ա����
	public short rolelevel; // ��ɫ�ȼ�
	public int rolecontribution; // ���ṱ�׶�
	public int weekcontribution; // ���ܹ��ṱ�׶�
	public int historycontribution; // ��ʷ���ṱ�׶�
	public int rolefreezedcontribution; // ����Ĺ��ṱ�׶�
	public int preweekcontribution; // ���ܹ��ṱ�׶�
	public int lastonlinetime; // Ϊ0��ʾ���ߣ������ʾ�ϴ�����ʱ��,��λ����
	public byte position;
	public byte school; // ְҵ(ְҵ)
	public int jointime; // ���빫��ʱ��
	public short weekaid; // ����Ԯ��
	public int historyaid; // ��ʷԮ��
	public byte isbannedtalk; // �Ƿ����  0 δ���ԣ� 1����
	public int fightvalue; // �ۺ�ս��
	public short claninstnum; // �μӹ��ḱ������
	public short clanfightnum; // �μӹ���ս����

	public ClanMember() {
		rolename = "";
	}

	public ClanMember(long _roleid_, int _shapeid_, java.lang.String _rolename_, short _rolelevel_, int _rolecontribution_, int _weekcontribution_, int _historycontribution_, int _rolefreezedcontribution_, int _preweekcontribution_, int _lastonlinetime_, byte _position_, byte _school_, int _jointime_, short _weekaid_, int _historyaid_, byte _isbannedtalk_, int _fightvalue_, short _claninstnum_, short _clanfightnum_) {
		this.roleid = _roleid_;
		this.shapeid = _shapeid_;
		this.rolename = _rolename_;
		this.rolelevel = _rolelevel_;
		this.rolecontribution = _rolecontribution_;
		this.weekcontribution = _weekcontribution_;
		this.historycontribution = _historycontribution_;
		this.rolefreezedcontribution = _rolefreezedcontribution_;
		this.preweekcontribution = _preweekcontribution_;
		this.lastonlinetime = _lastonlinetime_;
		this.position = _position_;
		this.school = _school_;
		this.jointime = _jointime_;
		this.weekaid = _weekaid_;
		this.historyaid = _historyaid_;
		this.isbannedtalk = _isbannedtalk_;
		this.fightvalue = _fightvalue_;
		this.claninstnum = _claninstnum_;
		this.clanfightnum = _clanfightnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(roleid);
		_os_.marshal(shapeid);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(rolelevel);
		_os_.marshal(rolecontribution);
		_os_.marshal(weekcontribution);
		_os_.marshal(historycontribution);
		_os_.marshal(rolefreezedcontribution);
		_os_.marshal(preweekcontribution);
		_os_.marshal(lastonlinetime);
		_os_.marshal(position);
		_os_.marshal(school);
		_os_.marshal(jointime);
		_os_.marshal(weekaid);
		_os_.marshal(historyaid);
		_os_.marshal(isbannedtalk);
		_os_.marshal(fightvalue);
		_os_.marshal(claninstnum);
		_os_.marshal(clanfightnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		shapeid = _os_.unmarshal_int();
		rolename = _os_.unmarshal_String("UTF-16LE");
		rolelevel = _os_.unmarshal_short();
		rolecontribution = _os_.unmarshal_int();
		weekcontribution = _os_.unmarshal_int();
		historycontribution = _os_.unmarshal_int();
		rolefreezedcontribution = _os_.unmarshal_int();
		preweekcontribution = _os_.unmarshal_int();
		lastonlinetime = _os_.unmarshal_int();
		position = _os_.unmarshal_byte();
		school = _os_.unmarshal_byte();
		jointime = _os_.unmarshal_int();
		weekaid = _os_.unmarshal_short();
		historyaid = _os_.unmarshal_int();
		isbannedtalk = _os_.unmarshal_byte();
		fightvalue = _os_.unmarshal_int();
		claninstnum = _os_.unmarshal_short();
		clanfightnum = _os_.unmarshal_short();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof ClanMember) {
			ClanMember _o_ = (ClanMember)_o1_;
			if (roleid != _o_.roleid) return false;
			if (shapeid != _o_.shapeid) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (rolelevel != _o_.rolelevel) return false;
			if (rolecontribution != _o_.rolecontribution) return false;
			if (weekcontribution != _o_.weekcontribution) return false;
			if (historycontribution != _o_.historycontribution) return false;
			if (rolefreezedcontribution != _o_.rolefreezedcontribution) return false;
			if (preweekcontribution != _o_.preweekcontribution) return false;
			if (lastonlinetime != _o_.lastonlinetime) return false;
			if (position != _o_.position) return false;
			if (school != _o_.school) return false;
			if (jointime != _o_.jointime) return false;
			if (weekaid != _o_.weekaid) return false;
			if (historyaid != _o_.historyaid) return false;
			if (isbannedtalk != _o_.isbannedtalk) return false;
			if (fightvalue != _o_.fightvalue) return false;
			if (claninstnum != _o_.claninstnum) return false;
			if (clanfightnum != _o_.clanfightnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += shapeid;
		_h_ += rolename.hashCode();
		_h_ += rolelevel;
		_h_ += rolecontribution;
		_h_ += weekcontribution;
		_h_ += historycontribution;
		_h_ += rolefreezedcontribution;
		_h_ += preweekcontribution;
		_h_ += lastonlinetime;
		_h_ += (int)position;
		_h_ += (int)school;
		_h_ += jointime;
		_h_ += weekaid;
		_h_ += historyaid;
		_h_ += (int)isbannedtalk;
		_h_ += fightvalue;
		_h_ += claninstnum;
		_h_ += clanfightnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(shapeid).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(rolelevel).append(",");
		_sb_.append(rolecontribution).append(",");
		_sb_.append(weekcontribution).append(",");
		_sb_.append(historycontribution).append(",");
		_sb_.append(rolefreezedcontribution).append(",");
		_sb_.append(preweekcontribution).append(",");
		_sb_.append(lastonlinetime).append(",");
		_sb_.append(position).append(",");
		_sb_.append(school).append(",");
		_sb_.append(jointime).append(",");
		_sb_.append(weekaid).append(",");
		_sb_.append(historyaid).append(",");
		_sb_.append(isbannedtalk).append(",");
		_sb_.append(fightvalue).append(",");
		_sb_.append(claninstnum).append(",");
		_sb_.append(clanfightnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

}


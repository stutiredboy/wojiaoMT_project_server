
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangePosition__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangePosition extends __CChangePosition__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return fire.pb.clan.srv.ClanAuthManager.getInstance().changePosition(roleid, memberroleid, position);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808464;

	public int getType() {
		return 808464;
	}

	public long memberroleid; // 公会成员的id
	public int position; // 申请的新职位

	public CChangePosition() {
	}

	public CChangePosition(long _memberroleid_, int _position_) {
		this.memberroleid = _memberroleid_;
		this.position = _position_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(memberroleid);
		_os_.marshal(position);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		memberroleid = _os_.unmarshal_long();
		position = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangePosition) {
			CChangePosition _o_ = (CChangePosition)_o1_;
			if (memberroleid != _o_.memberroleid) return false;
			if (position != _o_.position) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)memberroleid;
		_h_ += position;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(memberroleid).append(",");
		_sb_.append(position).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangePosition _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(memberroleid - _o_.memberroleid);
		if (0 != _c_) return _c_;
		_c_ = position - _o_.position;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


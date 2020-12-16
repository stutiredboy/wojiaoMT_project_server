
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanAim__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestClanAim extends __CRequestClanAim__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0 || this.clanid<1) return;
		xbean.ClanInfo clanInfo = xtable.Clans.select(this.clanid);
		if(clanInfo == null) return;
		SClanAim snd = new SClanAim();
		snd.oldclanname = clanInfo.getOldclanname();
		snd.clanaim = clanInfo.getClanaim();
		snd.clanid = clanInfo.getKey();
		gnet.link.Onlines.getInstance().send(roleid, snd);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808479;

	public int getType() {
		return 808479;
	}

	public long clanid; // 公会id

	public CRequestClanAim() {
	}

	public CRequestClanAim(long _clanid_) {
		this.clanid = _clanid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(clanid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		clanid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestClanAim) {
			CRequestClanAim _o_ = (CRequestClanAim)_o1_;
			if (clanid != _o_.clanid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)clanid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(clanid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestClanAim _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(clanid - _o_.clanid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


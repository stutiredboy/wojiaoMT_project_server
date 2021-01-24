
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeSchoolExtInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeSchoolExtInfo extends __CChangeSchoolExtInfo__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				// 闁告瑦鍨�?娴ｈ姤绁柤鍗炲娣囧﹪骞�?
				SChangeSchoolExtInfo send = new SChangeSchoolExtInfo();
				xbean.ChangeSchoolInfo info = xtable.Changeschool.select(roleId);
				if (info != null) {
					int maxChangeWeaponCount = ChangeSchoolUtils.getMaxChangeWeaponCount();
					int maxChangeGemCount = ChangeSchoolUtils.getMaxChangeGemCount();
					send.remainchangeweaponcount = Math.max(maxChangeWeaponCount - info.getChangeweaponcount(), 0);
					send.remainchangegemcount = Math.max(maxChangeGemCount - info.getChangeweaponcount(), 0);
				}
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810487;

	public int getType() {
		return 810487;
	}

	public int oldkey; // 旧武器的Key

	public CChangeSchoolExtInfo() {
	}

	public CChangeSchoolExtInfo(int _oldkey_) {
		this.oldkey = _oldkey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(oldkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		oldkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeSchoolExtInfo) {
			CChangeSchoolExtInfo _o_ = (CChangeSchoolExtInfo)_o1_;
			if (oldkey != _o_.oldkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += oldkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(oldkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeSchoolExtInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = oldkey - _o_.oldkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


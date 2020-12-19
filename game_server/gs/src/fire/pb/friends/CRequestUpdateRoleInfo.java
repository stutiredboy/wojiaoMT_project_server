
package fire.pb.friends;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestUpdateRoleInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestUpdateRoleInfo extends __CRequestUpdateRoleInfo__ {
	@Override
	protected void process() {
		final long currentRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (currentRoleId < 0)
			return;

		mkdb.Procedure proc = new mkdb.Procedure() {
			@Override
			public boolean process() {

				if (xtable.Properties.selectRolename(roleid) == null) {
					// 杩欓噷瀛樺湪鐨勫師鍥犳槸:鏈嶅姟鍣ㄥ垹妗ｄ簡,鑰屽鎴风鏈湴鐨勬渶杩戣仈绯讳汉鍒楄〃鏈垹闄?
					Module.logger.warn("[CRequestUpdateRoleInfo] find non-existent role info, roleId:" + currentRoleId
							+ " targetRoleId:" + roleid);
					return true;
				}
				String clanname ="";
				Long factionId = xtable.Roleidclan.select(roleid);
				if (factionId != null && factionId > 0) {
					clanname = xtable.Clans.selectClanname(factionId);
				}
				SRequestUpdateRoleInfo send = new SRequestUpdateRoleInfo();
				send.friendinfobean = FriendHelper.toInfoBean(currentRoleId, roleid);
				if (clanname != null) {
					send.friendinfobean.factionname = clanname;
				}
				mkdb.Procedure.psendWhileCommit(currentRoleId, send);
				return true;
			}
		};
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 806533;

	public int getType() {
		return 806533;
	}

	public long roleid;

	public CRequestUpdateRoleInfo() {
	}

	public CRequestUpdateRoleInfo(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestUpdateRoleInfo) {
			CRequestUpdateRoleInfo _o_ = (CRequestUpdateRoleInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestUpdateRoleInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


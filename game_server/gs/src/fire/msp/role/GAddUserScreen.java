
package fire.msp.role;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddUserScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddUserScreen extends __GAddUserScreen__ {
	@Override
	protected void process() {
		// protocol handle
		Role reqRole = RoleManager.getInstance().getRoleByID(reqroleid);
		Role addRole = RoleManager.getInstance().getRoleByID(addroleid);
		if(reqRole == null || addRole == null)
			return;
		if(reqRole.getScene().getSceneID() != addRole.getScene().getSceneID())
			return;//濞戞挸绉村﹢顏堝触鐏炶偐顏遍柛锔惧劋濞呮瑦绋夊畡姝瀌
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(reqRole.getScene().getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闁煎浜滅换渚�宕ｉ婵愭綄
			return;
		if(mapcfg.getVisibletype() == 2)//閻忓繐绻樺Σ锕傚矗椤栨繍娼�
		{
			final long reqteamid = reqRole.getTeamID();
			final long addteamid = addRole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		SAddUserScreen sadduser = new SAddUserScreen();
		sadduser.rolelist.add(addRole.getRoleBasic());
		gnet.link.Onlines.getInstance().send(reqroleid, sadduser);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730909;

	public int getType() {
		return 730909;
	}

	public long reqroleid;
	public long addroleid;

	public GAddUserScreen() {
	}

	public GAddUserScreen(long _reqroleid_, long _addroleid_) {
		this.reqroleid = _reqroleid_;
		this.addroleid = _addroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(reqroleid);
		_os_.marshal(addroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		reqroleid = _os_.unmarshal_long();
		addroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddUserScreen) {
			GAddUserScreen _o_ = (GAddUserScreen)_o1_;
			if (reqroleid != _o_.reqroleid) return false;
			if (addroleid != _o_.addroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)reqroleid;
		_h_ += (int)addroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(reqroleid).append(",");
		_sb_.append(addroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddUserScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(reqroleid - _o_.reqroleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(addroleid - _o_.addroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


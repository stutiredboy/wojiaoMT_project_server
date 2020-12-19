
package fire.pb;

import fire.pb.util.CGPlayUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEndPlayCG__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEndPlayCG extends __CEndPlayCG__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		//鍘绘帀鐜╁韬笂鐨勬挱鏀惧姩鐢籦uff
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				
				fire.pb.buff.BuffAgent agent = new fire.pb.buff.BuffRoleImpl(roleid,false);
				agent.removeCBuffWithSP(CGPlayUtil.cgBuffID);
				/*fire.pb.map.Role role = RoleManager.getInstance().getRoleByID(roleid);
				if(id >= 11001 && id <= 11009)
				{
					Transfer.justGotoWhileCommit(roleid, role.getScene(), role.getPos().toGridPos().getX(), role.getPos().toGridPos().getY(), SRoleEnterScene.QUEST);
				}*/
				//GsClient.sendToScene(new GSetPlayCGState(roleid,(byte)0));
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786456;

	public int getType() {
		return 786456;
	}

	public int id; // 动画的id

	public CEndPlayCG() {
	}

	public CEndPlayCG(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		if (id <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEndPlayCG) {
			CEndPlayCG _o_ = (CEndPlayCG)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEndPlayCG _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


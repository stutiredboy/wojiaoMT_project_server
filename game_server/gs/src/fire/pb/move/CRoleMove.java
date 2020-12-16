
package fire.pb.move;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleMove__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleMove extends __CRoleMove__ {
	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)return;
		
		long curr = System.currentTimeMillis();
		if(curr - role.CRoleMove_CheckTime <300){
			return;
		}
		role.CRoleMove_CheckTime = curr;
		
		
		if(! role.checkMoveUnit()) return;
		
		final fire.pb.scene.Scene rs = role.getScene();
		if(null == rs) return;
		
		//added by ZhangChong
		if(rs.getSceneID() != sceneid)
			return;
		
		if( role.isJumping())
			return;
		
		if (!role.canMove())
		{
			role.confirmCurPosition();
			return;
		}

		final SRoleMove snd = new SRoleMove();
		snd.roleid = role.getRoleID();
		//snd.srcpos = this.srcpos;
		snd.destpos = this.destpos;
		role.sendWhoSeeMe(snd);

		role.setCurDestPos(destpos.x, destpos.y);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790433;

	public int getType() {
		return 790433;
	}

	public fire.pb.move.Pos srcpos; // 出发点
	public fire.pb.move.Pos destpos; // 到达点
	public long sceneid; // 场景id

	public CRoleMove() {
		srcpos = new fire.pb.move.Pos();
		destpos = new fire.pb.move.Pos();
	}

	public CRoleMove(fire.pb.move.Pos _srcpos_, fire.pb.move.Pos _destpos_, long _sceneid_) {
		this.srcpos = _srcpos_;
		this.destpos = _destpos_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		if (!srcpos._validator_()) return false;
		if (!destpos._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcpos);
		_os_.marshal(destpos);
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcpos.unmarshal(_os_);
		destpos.unmarshal(_os_);
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleMove) {
			CRoleMove _o_ = (CRoleMove)_o1_;
			if (!srcpos.equals(_o_.srcpos)) return false;
			if (!destpos.equals(_o_.destpos)) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcpos.hashCode();
		_h_ += destpos.hashCode();
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcpos).append(",");
		_sb_.append(destpos).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRoleMove _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcpos.compareTo(_o_.srcpos);
		if (0 != _c_) return _c_;
		_c_ = destpos.compareTo(_o_.destpos);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


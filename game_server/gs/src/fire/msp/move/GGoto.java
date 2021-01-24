
package fire.msp.move;
import fire.pb.scene.BlockInfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GGoto__ extends mkio.Protocol { }

/** Transfor相关的方法
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GGoto extends __GGoto__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		
		if(gototype == fire.pb.move.SRoleEnterScene.SYSTEM_DRAG){
			//缂侇垵宕电划娲箯婢跺鐪藉ù鍏肩婵椽宕氶悧鍫濈樄閻庤姘ㄩ崑锝夋儍閸曨垱顎嶉弶锟�?
			role.justGoto(sceneid, xpos, ypos, BlockInfo.FLOOR_0_Z, gototype);
			return;
		}else if (delta <= 0){
			//濠碘�冲�归悘澶娾柦閳╁啯绠掗悹鍥跺灠濡﹪鎳犻崘銊︾函闁挎稑鐬肩花璺ㄦ兜椤旇棄顎欓柛鎺斿鐎垫氨锟借鑹惧妤呭冀?
			role.justGoto(sceneid, xpos, ypos, BlockInfo.FLOOR_0_Z, gototype);
			return;
		}else{
			//濠碘�冲�归悘澶愬嫉婢跺寒鍤栫�瑰壊鍠涚�垫牠宕舵潏鍓х闂傚懎绻戝┃锟藉☉锟�?濞戞搩浜滆ぐ鏌ユ偨閵娿儲缍忛柡锟�?
			java.util.Random r = fire.pb.scene.MapHelper.getRandom();
			int gox = xpos + (r.nextInt(1) * 2 - 1) * r.nextInt(delta);
			int goy = ypos + (r.nextInt(1) * 2 - 1) * r.nextInt(delta);
			role.justGoto(sceneid, gox, goy, BlockInfo.FLOOR_0_Z, gototype);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724898;

	public int getType() {
		return 724898;
	}

	public long roleid;
	public long sceneid; // 场景id
	public int xpos;
	public int ypos;
	public int delta; // 允许误差
	public int gototype; // 跳转类型

	public GGoto() {
	}

	public GGoto(long _roleid_, long _sceneid_, int _xpos_, int _ypos_, int _delta_, int _gototype_) {
		this.roleid = _roleid_;
		this.sceneid = _sceneid_;
		this.xpos = _xpos_;
		this.ypos = _ypos_;
		this.delta = _delta_;
		this.gototype = _gototype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(sceneid);
		_os_.marshal(xpos);
		_os_.marshal(ypos);
		_os_.marshal(delta);
		_os_.marshal(gototype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		sceneid = _os_.unmarshal_long();
		xpos = _os_.unmarshal_int();
		ypos = _os_.unmarshal_int();
		delta = _os_.unmarshal_int();
		gototype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GGoto) {
			GGoto _o_ = (GGoto)_o1_;
			if (roleid != _o_.roleid) return false;
			if (sceneid != _o_.sceneid) return false;
			if (xpos != _o_.xpos) return false;
			if (ypos != _o_.ypos) return false;
			if (delta != _o_.delta) return false;
			if (gototype != _o_.gototype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)sceneid;
		_h_ += xpos;
		_h_ += ypos;
		_h_ += delta;
		_h_ += gototype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(xpos).append(",");
		_sb_.append(ypos).append(",");
		_sb_.append(delta).append(",");
		_sb_.append(gototype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GGoto _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = xpos - _o_.xpos;
		if (0 != _c_) return _c_;
		_c_ = ypos - _o_.ypos;
		if (0 != _c_) return _c_;
		_c_ = delta - _o_.delta;
		if (0 != _c_) return _c_;
		_c_ = gototype - _o_.gototype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


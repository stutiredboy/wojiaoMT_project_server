
package fire.msp.move;

import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddPowerRestore__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddPowerRestore extends __GAddPowerRestore__ {
	@Override
	protected void process() {
		// protocol handle
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role == null)
		{
			fire.pb.scene.SceneManager.logger.error("GAddPowerRestore闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熶粙鎮块锟介弻鐔煎礈娴ｇ儤鎲橀梺杞扮閿曨亪寮婚悢鍏肩劷闁挎洩鎷烽柡瀣枑閵囧嫰顢曢敐鍡欘槰缂備胶绮换鍫濐嚕閹绢喗鍋戦柨鐔绘铻為柡澶嬫敤濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢樿灃闁挎繂鎳庨弳鐐烘煕鎼达紕效闁哄矉缍佸浠嬪Ω閵夛附娈闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鍣介柣顓熺懇閺岀喐娼忛幆褏妲ｉ梺杞扮閿曨亪寮婚悢鐓庣闁圭儤鍨垫慨绡筰d=" + roleid);
			return;
		}
		if(role.getJumpRole() == null)
			return;
		if(powerrestore > 0)
			role.getJumpRole().setPowerRestore(powerrestore);
		else
			role.getJumpRole().setPowerRestore(0);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724930;

	public int getType() {
		return 724930;
	}

	public long roleid;
	public int powerrestore; // 如果为-1，则为直接清除气力储备

	public GAddPowerRestore() {
	}

	public GAddPowerRestore(long _roleid_, int _powerrestore_) {
		this.roleid = _roleid_;
		this.powerrestore = _powerrestore_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(powerrestore);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		powerrestore = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddPowerRestore) {
			GAddPowerRestore _o_ = (GAddPowerRestore)_o1_;
			if (roleid != _o_.roleid) return false;
			if (powerrestore != _o_.powerrestore) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += powerrestore;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(powerrestore).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddPowerRestore _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = powerrestore - _o_.powerrestore;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;
import org.apache.log4j.Logger;
abstract class __CPetTakeOffHuanhua__ extends mkio.Protocol { }

/** 宠物解除
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetTakeOffHuanhua extends __CPetTakeOffHuanhua__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
		// protocol handle
		logger.error("RECV CPetTakeOffHuanhua---------------------"+ petkey);
		final long roleId=gnet.link.Onlines.getInstance().findRoleid(this);
		 if (roleId < 0) {
		 	return;
		 }
		 // protocol handle
		 if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
		 	fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 131451, null);
		 	return;
		 }
		new PPetTakeOffHuanHua(roleId, petkey).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788590;

	public int getType() {
		return 788590;
	}

	public int petkey;

	public CPetTakeOffHuanhua() {
	}

	public CPetTakeOffHuanhua(int _petkey_) {
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPetTakeOffHuanhua) {
			CPetTakeOffHuanhua _o_ = (CPetTakeOffHuanhua)_o1_;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPetTakeOffHuanhua _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


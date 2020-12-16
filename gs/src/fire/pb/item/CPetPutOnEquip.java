
package fire.pb.pet;
import org.apache.log4j.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPetPutOnEquip__ extends mkio.Protocol { }

/** �����һ� 2151-2160
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetPutOnEquip extends __CPetPutOnEquip__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
		// protocol handle
		logger.info("RECV CPetPutOnEquip\t" + pet_packkey +" --" + pet_dstpos +"--"+ petkey);
		return;
		final long roleId=gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0) {
			return;
		}
		// protocol handle
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 131451, null);
			return;
		}
		new PPutOnPetEquip(roleId, pet_packkey, pet_dstpos).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788589;

	public int getType() {
		return 788589;
	}

	public int pet_packkey;
	public int pet_dstpos;
	public int petkey;

	public CPetPutOnEquip() {
	}

	public CPetPutOnEquip(int _pet_packkey_, int _pet_dstpos_, int _petkey_) {
		this.pet_packkey = _pet_packkey_;
		this.pet_dstpos = _pet_dstpos_;
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (pet_packkey < 1) return false;
		if (pet_dstpos < 0) return false;
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(pet_packkey);
		_os_.marshal(pet_dstpos);
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		pet_packkey = _os_.unmarshal_int();
		pet_dstpos = _os_.unmarshal_int();
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPetPutOnEquip) {
			CPetPutOnEquip _o_ = (CPetPutOnEquip)_o1_;
			if (pet_packkey != _o_.pet_packkey) return false;
			if (pet_dstpos != _o_.pet_dstpos) return false;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += pet_packkey;
		_h_ += pet_dstpos;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(pet_packkey).append(",");
		_sb_.append(pet_dstpos).append(",");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPetPutOnEquip _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = pet_packkey - _o_.pet_packkey;
		if (0 != _c_) return _c_;
		_c_ = pet_dstpos - _o_.pet_dstpos;
		if (0 != _c_) return _c_;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


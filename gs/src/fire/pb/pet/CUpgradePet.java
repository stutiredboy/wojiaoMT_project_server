
package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;
import org.apache.log4j.Logger;
abstract class __CUpgradePet__ extends mkio.Protocol { }

/** 宠物进阶 2157-2160
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpgradePet extends __CUpgradePet__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		logger.error("--------宠物进阶----------------- ----"+ petkey);
		PUpgradePet proc = new PUpgradePet(roleid, petkey,itemkey);
		proc.submit();
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788589;

	public int getType() {
		return 788589;
	}

	public int petkey; // 宠物key
	public int itemkey; // 物品key

	public CUpgradePet() {
	}

	public CUpgradePet(int _petkey_, int _itemkey_) {
		this.petkey = _petkey_;
		this.itemkey = _itemkey_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		if (itemkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(itemkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		itemkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpgradePet) {
			CUpgradePet _o_ = (CUpgradePet)_o1_;
			if (petkey != _o_.petkey) return false;
			if (itemkey != _o_.itemkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += itemkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(itemkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUpgradePet _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		_c_ = itemkey - _o_.itemkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


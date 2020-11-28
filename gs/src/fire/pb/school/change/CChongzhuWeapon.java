
package fire.pb.school.change;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;
import org.apache.log4j.Logger;
abstract class __CChongzhuWeapon__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChongzhuWeapon extends __CChongzhuWeapon__ {
	private static Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		logger.error("-----------------------------装备重铸--武器key-"+this.srcweaponkey+"--重铸石key-"+this.itemid+"-----------------------------");
		new PChongzhuWeapon(roleId, this.srcweaponkey, this.itemid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810493;

	public int getType() {
		return 810493;
	}

	public int srcweaponkey; // ��������Key
	public int itemid; // ������ItemId

	public CChongzhuWeapon() {
	}

	public CChongzhuWeapon(int _srcweaponkey_, int _itemid_) {
		this.srcweaponkey = _srcweaponkey_;
		this.itemid = _itemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcweaponkey);
		_os_.marshal(itemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcweaponkey = _os_.unmarshal_int();
		itemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChongzhuWeapon) {
			CChongzhuWeapon _o_ = (CChongzhuWeapon)_o1_;
			if (srcweaponkey != _o_.srcweaponkey) return false;
			if (itemid != _o_.itemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcweaponkey;
		_h_ += itemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcweaponkey).append(",");
		_sb_.append(itemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChongzhuWeapon _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcweaponkey - _o_.srcweaponkey;
		if (0 != _c_) return _c_;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTaozhuangDianhua__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTaozhuangDianhua extends __CTaozhuangDianhua__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		new PTaozhuangDianhua(roleId, equipkey, itemid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810497;

	public int getType() {
		return 810497;
	}

	public int equipkey;
	public int itemid;

	public CTaozhuangDianhua() {
	}

	public CTaozhuangDianhua(int _equipkey_, int _itemid_) {
		this.equipkey = _equipkey_;
		this.itemid = _itemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(equipkey);
		_os_.marshal(itemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		equipkey = _os_.unmarshal_int();
		itemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTaozhuangDianhua) {
			CTaozhuangDianhua _o_ = (CTaozhuangDianhua)_o1_;
			if (equipkey != _o_.equipkey) return false;
			if (itemid != _o_.itemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += equipkey;
		_h_ += itemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(equipkey).append(",");
		_sb_.append(itemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTaozhuangDianhua _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = equipkey - _o_.equipkey;
		if (0 != _c_) return _c_;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.school.change;

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
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810497;

	public int getType() {
		return 810497;
	}

	public int gemkey;
	public int newgemitemid;

	public CTaozhuangDianhua() {
	}

	public CTaozhuangDianhua(int _gemkey_, int _newgemitemid_) {
		this.gemkey = _gemkey_;
		this.newgemitemid = _newgemitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(gemkey);
		_os_.marshal(newgemitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		gemkey = _os_.unmarshal_int();
		newgemitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTaozhuangDianhua) {
			CTaozhuangDianhua _o_ = (CTaozhuangDianhua)_o1_;
			if (gemkey != _o_.gemkey) return false;
			if (newgemitemid != _o_.newgemitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += gemkey;
		_h_ += newgemitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(gemkey).append(",");
		_sb_.append(newgemitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTaozhuangDianhua _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = gemkey - _o_.gemkey;
		if (0 != _c_) return _c_;
		_c_ = newgemitemid - _o_.newgemitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


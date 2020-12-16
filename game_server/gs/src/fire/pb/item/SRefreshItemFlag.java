
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SRefreshItemFlag__ extends mkio.Protocol { }

/** ������֪ͨ�ͻ���ˢ�µ��ߵ�flag
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SRefreshItemFlag extends __SRefreshItemFlag__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787437;

	public int getType() {
		return 787437;
	}

	public int itemkey; // ����key
	public int flag; // ����flag
	public int packid; // pack������

	public SRefreshItemFlag() {
	}

	public SRefreshItemFlag(int _itemkey_, int _flag_, int _packid_) {
		this.itemkey = _itemkey_;
		this.flag = _flag_;
		this.packid = _packid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemkey);
		_os_.marshal(flag);
		_os_.marshal(packid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemkey = _os_.unmarshal_int();
		flag = _os_.unmarshal_int();
		packid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SRefreshItemFlag) {
			SRefreshItemFlag _o_ = (SRefreshItemFlag)_o1_;
			if (itemkey != _o_.itemkey) return false;
			if (flag != _o_.flag) return false;
			if (packid != _o_.packid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemkey;
		_h_ += flag;
		_h_ += packid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemkey).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(packid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SRefreshItemFlag _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = itemkey - _o_.itemkey;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		_c_ = packid - _o_.packid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


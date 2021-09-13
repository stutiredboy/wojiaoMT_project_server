
package fire.pb.ranklist;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SResGoldCoinRank__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SResGoldCoinRank extends __SResGoldCoinRank__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810243;

	public int getType() {
		return 810243;
	}

	public java.util.LinkedList<fire.pb.ranklist.GoldCoinRank> goldcolininfo; // 金币排行榜

	public SResGoldCoinRank() {
		goldcolininfo = new java.util.LinkedList<fire.pb.ranklist.GoldCoinRank>();
	}

	public SResGoldCoinRank(java.util.LinkedList<fire.pb.ranklist.GoldCoinRank> _goldcolininfo_) {
		this.goldcolininfo = _goldcolininfo_;
	}

	public final boolean _validator_() {
		for (fire.pb.ranklist.GoldCoinRank _v_ : goldcolininfo)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(goldcolininfo.size());
		for (fire.pb.ranklist.GoldCoinRank _v_ : goldcolininfo) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.ranklist.GoldCoinRank _v_ = new fire.pb.ranklist.GoldCoinRank();
			_v_.unmarshal(_os_);
			goldcolininfo.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SResGoldCoinRank) {
			SResGoldCoinRank _o_ = (SResGoldCoinRank)_o1_;
			if (!goldcolininfo.equals(_o_.goldcolininfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += goldcolininfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(goldcolininfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


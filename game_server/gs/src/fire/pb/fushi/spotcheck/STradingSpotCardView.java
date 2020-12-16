
package fire.pb.fushi.spotcheck;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __STradingSpotCardView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class STradingSpotCardView extends __STradingSpotCardView__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812638;

	public int getType() {
		return 812638;
	}

	public java.util.ArrayList<fire.pb.fushi.spotcheck.SpotCardInfo> sellspotcardinfolist; // ����
	public java.util.ArrayList<fire.pb.fushi.spotcheck.SpotCardInfo> buyspotcardinfolist; // ����

	public STradingSpotCardView() {
		sellspotcardinfolist = new java.util.ArrayList<fire.pb.fushi.spotcheck.SpotCardInfo>();
		buyspotcardinfolist = new java.util.ArrayList<fire.pb.fushi.spotcheck.SpotCardInfo>();
	}

	public STradingSpotCardView(java.util.ArrayList<fire.pb.fushi.spotcheck.SpotCardInfo> _sellspotcardinfolist_, java.util.ArrayList<fire.pb.fushi.spotcheck.SpotCardInfo> _buyspotcardinfolist_) {
		this.sellspotcardinfolist = _sellspotcardinfolist_;
		this.buyspotcardinfolist = _buyspotcardinfolist_;
	}

	public final boolean _validator_() {
		for (fire.pb.fushi.spotcheck.SpotCardInfo _v_ : sellspotcardinfolist)
			if (!_v_._validator_()) return false;
		for (fire.pb.fushi.spotcheck.SpotCardInfo _v_ : buyspotcardinfolist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(sellspotcardinfolist.size());
		for (fire.pb.fushi.spotcheck.SpotCardInfo _v_ : sellspotcardinfolist) {
			_os_.marshal(_v_);
		}
		_os_.compact_uint32(buyspotcardinfolist.size());
		for (fire.pb.fushi.spotcheck.SpotCardInfo _v_ : buyspotcardinfolist) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.fushi.spotcheck.SpotCardInfo _v_ = new fire.pb.fushi.spotcheck.SpotCardInfo();
			_v_.unmarshal(_os_);
			sellspotcardinfolist.add(_v_);
		}
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.fushi.spotcheck.SpotCardInfo _v_ = new fire.pb.fushi.spotcheck.SpotCardInfo();
			_v_.unmarshal(_os_);
			buyspotcardinfolist.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof STradingSpotCardView) {
			STradingSpotCardView _o_ = (STradingSpotCardView)_o1_;
			if (!sellspotcardinfolist.equals(_o_.sellspotcardinfolist)) return false;
			if (!buyspotcardinfolist.equals(_o_.buyspotcardinfolist)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += sellspotcardinfolist.hashCode();
		_h_ += buyspotcardinfolist.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sellspotcardinfolist).append(",");
		_sb_.append(buyspotcardinfolist).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


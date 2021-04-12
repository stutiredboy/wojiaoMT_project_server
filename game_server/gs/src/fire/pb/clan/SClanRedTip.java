
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SClanRedTip__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SClanRedTip extends __SClanRedTip__ {
	@Override
	protected void process() {
		// protocol handle
	}

	public static final int TYPE_APPLY=1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘鐓曢柕濞垮劚閿熻棄顭烽獮澶愬箹娴ｇ懓浜遍梺鍓插亝缁诲嫰鎮烽弻銉︹拺缂佸顑欓崕娑樏瑰搴濋偗鐎殿喛顕ч埥澶愬閻樻牓鍔嶉妵鍕籍閸屾艾浠橀梺鎶芥敱鐢�愁潖閻戞ɑ濮滈柟娈垮櫘濡差喖顪冮妶鍡楃仴妞わ箓娼ч锝嗙節濮橆儵鈺呮煃閸濆嫬锟藉憡绂嶉悙鐑樷拺缂佸瀵у﹢鎵磼鐎ｎ偄鐏存い銏℃閺佹捇鏁撻敓锟�
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808517;

	public int getType() {
		return 808517;
	}

	public java.util.HashMap<Integer,Integer> redtips;

	public SClanRedTip() {
		redtips = new java.util.HashMap<Integer,Integer>();
	}

	public SClanRedTip(java.util.HashMap<Integer,Integer> _redtips_) {
		this.redtips = _redtips_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(redtips.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : redtips.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			redtips.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SClanRedTip) {
			SClanRedTip _o_ = (SClanRedTip)_o1_;
			if (!redtips.equals(_o_.redtips)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += redtips.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(redtips).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


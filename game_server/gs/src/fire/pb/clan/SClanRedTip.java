
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

	public static final int TYPE_APPLY=1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑橆殕閻撴洟鏌曟繛鍨姎闁跨喕妫勯…鐑界嵁婢舵劕绠瑰ù锝囨嚀娴滈亶姊洪崜鎻掍簼缂佽瀚伴幃鐑藉蓟閵夛腹鎷虹紓浣割儐椤戞瑩宕曞☉妯忕懓顭ㄦ惔婵嬪仐閻庢鍠涢褔鍩ユ径鎰潊闁绘ɑ鐗撻崝宥夊Φ閸曨垰绫嶉柛灞捐壘娴犳﹢姊洪幎鑺ユ暠閻㈩垪锟芥剚娼栭柣鎴炆戞慨婊堟煙濞堝灝娅樻俊宸枛椤啴濡堕崱妤冧淮濡炪倧绠撳褔顢氶敐鍡欑瘈婵﹩鍎甸埡鍛厓闁告繂瀚敓钘夋啞缁傚秹鎮欓悜妯锋嫼缂備礁顑嗙�笛冿耿閹殿喚纾奸悗锝庡亜閻忓瓨銇勯姀鈩冾棃闁轰焦鎹囬弫鎾绘晸閿燂拷
	
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


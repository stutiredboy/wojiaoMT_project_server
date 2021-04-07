package fire.pb;
import fire.pb.tel.utils.CheckCodeUtils;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReceiveCheckCode__ extends mkio.Protocol { }

/** 发送短信验证
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
public class CReceiveCheckCode extends __CReceiveCheckCode__ {

	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0) {
			return;
		}
		//闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒒娴ｇ瓔鍤欑紒缁樺浮瀹曟垿鎮㈤崗鍏煎劒闁硅偐琛ュ褔寮搁弮鍫熺厽闁挎繂鎳愰悞鍧楁煙妞嬪骸鍘撮柟顖氬�垮畷銊︾節閸屻倓绱﹂梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節闂堟侗鍎滅紓宥嗙墱閿熻棄绠嶉崕閬嵥囨导鏉戠厱闁瑰瓨绶疯ぐ鎺戠闁兼祴鏅滈崳顓㈡煟鎼淬垻鍟查柟鍑ゆ嫹?
		CheckCodeUtils.getCheckCode(roleid, checkcodetype);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786570;

	public int getType() {
		return 786570;
	}

	public byte checkcodetype; // 2 道具安全锁 3藏宝阁

	public CReceiveCheckCode() {
	}

	public CReceiveCheckCode(byte _checkcodetype_) {
		this.checkcodetype = _checkcodetype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(checkcodetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		checkcodetype = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReceiveCheckCode) {
			CReceiveCheckCode _o_ = (CReceiveCheckCode)_o1_;
			if (checkcodetype != _o_.checkcodetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)checkcodetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(checkcodetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReceiveCheckCode _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = checkcodetype - _o_.checkcodetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}
}

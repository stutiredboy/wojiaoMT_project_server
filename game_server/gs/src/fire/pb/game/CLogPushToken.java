package fire.pb.game;

import fire.log.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLogPushToken__ extends mkio.Protocol { }

/** 推送Token日志
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLogPushToken extends __CLogPushToken__ {
	public static final Logger logger = Logger.getLogger("PUSH");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		// protocol handle
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				logger.error("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煕鐎ｅ墎绉柡灞剧☉閳规垿宕卞Δ濠佺棯闂備浇顕栭崹浼存偋閹捐钃熼柨婵嗩槸缁犲鏌涢幇顖ｅ殝闁归鍏樺畷绋课旈敓鐣岀不閺嶃劋绻嗛柕鍫濇噺閸ｇ晫锟借鎸风欢姘跺蓟濞戔懇锟斤箓骞嬪┑鍥╀壕濠电偛顕繛锟界紒鐘崇墪椤繘鎼归悷鏉款嚙闂佸搫娲ㄩ崰鎰版偟閺囩姷纾藉ù锝呭閸庢劙鏌熼幖浣虹暫鐎规洘宀搁獮鎺懳旈敓浠嬫偂濞戙垺鐓曟繝濠忔嫹闁绘帪绠撳鏌ヮ敆閿熶粙鍩為幋锔藉�烽柡澶嬪灩娴犵顪冮妶搴″箹闁绘鎸搁悾鐑藉Ψ閳轰胶锛滈梺缁樺姉鐞涖儵骞忕紒妯肩闁瑰墽顥愭竟妯荤箾鐏炲倸锟芥牜绮嬪鍛傛棃宕ㄩ鎯у箺闂備胶顢婂▍锝夊磻濞戔偓锟藉懘顢楅崒婊咃紲濡炪倖妫佹慨銈壦夐崼銉︾厵妞ゆ梻鏅惌鎺楁煙缁嬪尅鏀荤�垫澘瀚悾婵嬫晸娴犲姹查柨鐕傛嫹?, RoleId=" + roleId + ", Token=" + token);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810374;

	public int getType() {
		return 810374;
	}

	public int token; // 客户端发来的token

	public CLogPushToken() {
	}

	public CLogPushToken(int _token_) {
		this.token = _token_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(token);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		token = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLogPushToken) {
			CLogPushToken _o_ = (CLogPushToken)_o1_;
			if (token != _o_.token) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += token;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(token).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLogPushToken _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = token - _o_.token;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

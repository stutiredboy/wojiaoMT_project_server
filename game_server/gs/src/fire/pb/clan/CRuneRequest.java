
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRuneRequest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRuneRequest extends __CRuneRequest__ {
	@Override
	protected void process() {
		// protocol handle
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂顦伴悡銉╂煛閸愩劌锟界懓鈻嶉弴銏＄厱婵鎷锋繛浣冲洤鐓橀柟杈鹃檮閸婄兘鏌ょ喊鍗炲妞わ絾妞藉铏规嫚閼碱剛顔夌紓浣筋嚙閻楀棝顢氶敐澶婄濞达綀鍊借閺屾盯濡烽姀鈩冪彇闂佹寧绋掔划鎾愁潖閾忓湱纾兼慨妤�妫涢崝绋库攽閻愬弶鍣烘繛鑼枙濡垽姊洪崜鎻掍簴闁稿孩鐓￠幃鈥斥槈閵忊�筹拷鍫曟煟閹伴偊鏉洪柛銈嗙懃閳规垿顢欓悡搴嫹婵犳碍鏅搁柤鎭掑労閸熷繘鏌涢敐搴℃珝鐎规洘濞婇弫鎰板川椤栨稒顔曢梻浣稿閸嬪懎煤瀹ュ鏅搁柤鎭掑劤婢у灚銇勯姀锛勬噰闁瑰磭鍋ゆ俊鐑藉Ψ瑜濈槐锕傛⒒閸屾瑧顦﹂柟纰卞亰閹本寰勭仦鐣岀瓘婵°倧绲介崯顐ょ不濮樿埖鐓涢柛鎰╁妿婢ч亶鏌℃担鍝バｇ紒缁樼洴楠炲鎮滈崶锔捐繑濠电偛顕妴瀣箯閿燂拷
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return fire.pb.clan.srv.ClanManage.sendCRuneRequest(roleid,runerequestinfolist);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808511;

	public int getType() {
		return 808511;
	}

	public java.util.ArrayList<fire.pb.clan.RuneRequestInfo> runerequestinfolist;

	public CRuneRequest() {
		runerequestinfolist = new java.util.ArrayList<fire.pb.clan.RuneRequestInfo>();
	}

	public CRuneRequest(java.util.ArrayList<fire.pb.clan.RuneRequestInfo> _runerequestinfolist_) {
		this.runerequestinfolist = _runerequestinfolist_;
	}

	public final boolean _validator_() {
		for (fire.pb.clan.RuneRequestInfo _v_ : runerequestinfolist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(runerequestinfolist.size());
		for (fire.pb.clan.RuneRequestInfo _v_ : runerequestinfolist) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.clan.RuneRequestInfo _v_ = new fire.pb.clan.RuneRequestInfo();
			_v_.unmarshal(_os_);
			runerequestinfolist.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRuneRequest) {
			CRuneRequest _o_ = (CRuneRequest)_o1_;
			if (!runerequestinfolist.equals(_o_.runerequestinfolist)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += runerequestinfolist.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(runerequestinfolist).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


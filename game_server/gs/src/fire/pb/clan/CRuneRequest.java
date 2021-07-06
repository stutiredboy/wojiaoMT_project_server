
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
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻锛勪沪缁嬪灝鈷夐悗鍨緲鐎氼噣鏁撻弬銈囩У濞存粍绻堥、娆撳川椤撴稒鏂�闂佺粯鍔曞鍫曞煝閺囩伝鐟邦煥閸愵亜鐓熼悗娈垮櫘閸嬪﹤鐣烽崼鏇ㄦ晢濞达絽鎼敮楣冩⒒婵犲骸浜滄繛璇х畱鐓ら柡宓嫭鐦庨梻鍌氬�风粈渚�骞夐敍鍕床闁告劦鍠撻敓钘夊暞缁绘繈宕掗妶鍡欑▉缂傚倸鍊烽悞锕傗�﹂崶顒佸仭鐟滅増甯楅悡鏇㈡煏婢跺鐏ラ柛鐘宠壘椤洭鎳￠妶鍥╋紳闂佺鏈悷褔藝閿斿浜滈柨鏇炲�烽幉鍓э拷娈垮櫘閸嬪棝骞忛悩缁樺殤妞ゆ帊鐒﹂鏇㈡⒒娴ｅ憡鎯堟繛灞傚灲瀹曞綊宕烽鐘辩瑝闂佹寧绻傞ˇ浼存偂閵夆晜鐓涢柛鎰╁妼閿熺晫鎳撻埢宥夊即閵忥紕鍘卞┑顔筋殣閹烽攱绻涙担鍐叉搐閻撴﹢鏌熸潏楣冩闁稿﹦鍏橀弻銈囧枈閸楃偛顫╁銈忕稻濡炶棄顫忛搹瑙勫珰闁肩⒈鍓涢澶岀磽娴ｇ瓔鍤欓柣妤�妫濋、姘舵晲婢跺﹦顔愭繛杈剧秬閸婂�燁樄闁哄本鐩俊鐑藉閳╁啰褰囬梻浣瑰缁嬫帞鍒掗幘鎰佹綎闁惧繐婀辩壕鍏兼叏濡わ拷濡盯宕濈粙搴撴斀闁绘劕寮堕崳鐑樼箾閼碱剙鏋欐俊顐犲灲濮婃椽宕滈幓鎺嶇按闂佺瀛╅悡锟犲箖閳ユ枼妲堥柕蹇婏拷绛规嫹閸洘鐓熼柟浼村亰閺夋椽鏌涢妶鍡欐噧闁宠鍨块、娆撴偂鎼搭垱瀚瑰┑鐘崇閺呮悂鏌ら幁鎺戝姶闁哥喎绻橀弻娑㈡晲鎼粹剝鐝濋悗瑙勬礃婵炲﹪寮幇鏉垮窛妞ゆ牗绋掗鏇㈡⒒娴ｇ顥忛柛瀣噹鐓ょ�广儱顦伴弲鎼佹煠閹帒鍔ゅ褍鐏氶妵鍕閿涘嫭鍣伴梺鐟扮－閸嬨倖淇婇悜钘壩ㄧ憸婵堟閿曞倹鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰喊闁诡垰鏈鍕沪閻ｅ瞼鐡樺┑掳鍊х徊浠嬪疮椤愩倗涓嶆慨妯垮煐閻撴盯鏌涢幇鈺佸濠⒀囦憾閺屸剝鎷呴崫銉愶絿绱掔紒妯兼创妤犵偛顑夐幃婊堝炊閿旀崘绻戞繝鐢靛仜椤曨參濡寸�ｎ喖绠柨鐕傛嫹
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


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
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氭澘顕ｉ崨濠勭懝闁跨喍绮欏璇测槈濡攱顫嶅┑顔筋殔閻楀﹪寮幆褉鏀介柣鎰级閸ｈ棄鈹戦鑲╀粵缂佸矁椴哥换婵嬪炊椤儸鍥ㄧ厱婵炴垵宕弸娑欑箾閸滃啰绡�婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥碍婢橀悾鐑筋敍閻愯尙楠囬梺鐟邦嚟婵潧鈻撴ィ鍐┾拺闂傚牊鍗曢崼銉ョ柧婵炴垶姘ㄥΛ顖滄喐閺冨牆钃熼柣鏃傚皑閹风兘鎮藉▓璺ㄥ姼婵炲濯存俊鍥箖椤曪拷閺佹劖寰勭�Ｑ勫濠电偠鎻徊鍧楁偤閺冨牆鍚规繛鍡樺灩绾捐偐绱撴担濮戭亜霉椤旀拝鎷风憴鍕闁搞劌娼￠獮鍐閵堝懐顦ч梺绋跨箳閸樠囧礉閹烘鈷戠痪顓炴噹娴滃綊鎮跺☉鏍у姎妞ゎ剙锕ㄩˇ鍦拷娈垮枟閹倸顕ｉ锟藉畷濂告偄閸濆嫬绠洪梻鍌欑劍鐎笛呮崲閸岀偛绠犻柟鎵閸婂潡鏌涜椤ㄥ棝鎮″▎蹇ｆ富閻庯綆浜妤呮煕濡粯灏﹂柡宀�鍠栭、娑橆潩椤掑﹥瀚归柛顭戝枤閺嗭箓鏌曟繝蹇擃洭缂佲槄鎷烽梻浣侯焾鐞氼偊宕愰幘鑸殿潟闁挎洖鍊归埛鎺楁煕鐏炴崘澹橀柨鐔剁矙椤ユ挾鍒掗崼鐔虹懝闁跨喍绮欓悰顔藉緞閹邦厽娅㈤梺缁橆焾鐏忔瑩藝椤曪拷濮婃椽骞愭惔鈶╂嫽闂佸搫鎷嬮崑濠囧Υ閸涙潙鐭楀璺虹灱閻﹀牓姊婚崒姘卞濞撴碍顨婂畷鏇烆煥閸涱垳锛濋悗骞垮劚濡稒鏅堕柆宥嗙叆闁绘梻绮ˉ澶岀磼閻樿尙效鐎规洘娲熼弻鍡楃暤閵夈儲澶勯悗闈涖偢瀵爼骞嬮悩鎻掔疄闂傚倷鑳堕幊鎾绘偤閵娧勵偨闁汇値鍨禍褰掓煙閻戞ê鐏╂い蟻鍥ㄢ拺闁稿繗鍋愰妶鎾煛閸涱喚鐭掔�规洘濞婇、姗�濮�閿涘嫬骞楅梺鐟板悑閻ｎ亪宕规繝姘柈闁哄被鍎查悡娆撴煕閹存瑥锟芥牜锟芥熬鎷�?
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

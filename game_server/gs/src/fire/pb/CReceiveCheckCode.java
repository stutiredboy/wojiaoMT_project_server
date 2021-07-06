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
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟版晥濠电媴鎷峰〒姘炬嫹婵﹨娅ｇ槐鎺懳熼搹閫涚礃婵犵妲呴崑鍕拷姘緲椤曪綁宕ㄦ繝鍕嚌闂佽法鍠嶇划娆忣嚕鐠囨祴妲堟俊顖炴敱椤秴鈹戦绛嬫當闁绘锕顐﹀箚瑜夐弨浠嬫煟閹邦剙绾ч柛锝堟閳规垿顢欓懖鈺�绮电紓浣哥焷妞村摜鎹㈠┑瀣倞妞ゎ剦鍎搁崶銊у幈濠电偞鍨靛畷顒勫几濞戞瑧绠鹃柛婊冨暟缁★拷濠殿喖锕ㄥ▍锝夊箲閸曨垰惟闁靛濡囨禍鐐寸節绾版ɑ顫婇柛瀣閿熻姤纰嶅姗�鎮鹃悜绛嬫晬闁绘劘灏欐鍥⒑閻熼偊鍤熷┑顕�娼ч埢鎾淬偅閸愨斁鎷洪梻鍌氱墛閸楁洟宕奸妷銉ф煣濠电偞鍨跺銊ノ涢婊勫枑闁哄啫鐗嗛拑鐔兼煟閺冨倸鐨戦柟椋庡厴閹棄鈻撶捄銊ュЪ濠电偛顕刊瀛樹繆閸ヮ剙绠栨い鏇嫹闁轰焦鍔栧鍕拷锛卞嫬顏烘繝鐢靛仩閹活亞寰婇崸妤佸仱闁哄啫鐗嗛崥瑙勭箾閸℃ê鐏╃痪鎹愬亹缁辨挻鎷呮慨鎴簻闇夋い鏃�鎷濋幏椋庢喆閸曨剛顦ㄩ梺鎼炲妼濞硷繝鐛崘顔碱潊闁靛牆鎳愰ˇ褔姊虹粙璺ㄧ闁告鍥х闁圭儤顨嗛埛鎴犵棯椤撶偞鍣瑰ù婊冪秺閹泛鈽夐弽褍濮庡銈庡墮閿曘劑藝閸︻叏鎷峰▓鍨灍闁诡喖鍊搁锝夘敋閿熻棄鐣锋總鍛婂亜闁告繂瀚粻娲⒒閸屾瑧鍔嶉悗绗涘懏宕查柛宀�鍋涚粻鐘绘煙閹殿喖顣奸柛濠傛健閺屾稖顦虫い銊ユ閹�斥枎韫囷絾瀵岄柣搴秵娴滎亪顢撳Δ鍛厱婵☆垳绮亸锕傛煛瀹�锟介崰鏍�佸☉姗嗘僵妞ゆ帒锕ョ�氬綊鏌涢…鎴濇灓闁哄棴绠撻弻鏇熺節韫囨搩娲紓浣叉閹风兘姊绘担渚劸閻炴凹鍋婂畷鎰板箻閼告娼熼梺鎸庢礀閸婂綊鍩涢幒妤佺厱閻忕偞宕樻竟姗�鏌ㄩ悢鍓佺煓妞ゃ儲鎸鹃崚鎺楀醇閻旇櫣鎳濋梺璺ㄥ枍缁瑩鎮伴钘夌窞闁归偊鍘藉▍銏ゆ⒑缂佹﹩鐒鹃悘蹇旂懇钘濇い鏇嫹婵﹥妞介獮鎰償閳垛晜瀚介梻浣告惈閹峰宕戞繝鍥ラ柛娑欐綑閻顭跨捄铏圭伇闁伙箑鐗撳濠氬磼濮樺崬顤�婵炴挻纰嶉〃濠傜暦閺囩儐鐓ラ柛娑卞灣閿涙繈鎮楅獮鍨姎婵☆偅绋掗弲鍫曟焼瀹ュ棛鍙嗛梺缁樻⒒缁垶藟婢跺瞼纾奸柣妯垮皺鏁堥悗瑙勬礃濞茬喖寮婚崱妤冩殼闁靛鍎叉径鍕倵闂堟稏鍋㈢�殿喖鐖奸獮瀣偐閹绘帞鐤勯梻鍌氬�烽懗鍫曞箠閹剧粯鍋ら柕濞у嫷鍋ㄩ梺姹囧�ら崹顒佺瑜版帗鐓欓柣鎴灻悘鈺傘亜锜婚崶銊㈡嫼闂佺绻楅崑鎰板Χ閹绢喗鐓涢柛娑卞枤閻帞锟借娲樻繛濠囥�佸锟芥慨锟介柨娑樺楠炴姊洪悷鏉挎倯闁伙綆浜畷瑙勭節濮橆剛鏌堥梺鍝勮閸庢煡鎮″▎鎾寸厱闁瑰瓨鐟ラ敓鑺ョ墱閿熻姤鐔幏锟�?
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

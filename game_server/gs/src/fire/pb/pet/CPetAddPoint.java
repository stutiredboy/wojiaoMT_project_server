
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPetAddPoint__ extends mkio.Protocol { }

/** 客户端请求宠物加点
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPetAddPoint extends __CPetAddPoint__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊勭矊闇夐柡宥庡幗閻撳繐鈹戦悙闈涗壕婵炲懎妫濋弻娑㈠Χ閸涱収浼冮梺鍝勮閸婃鍒掑▎鎴炲磯闁靛鍊楁す铏節閻㈤潧浠滈柟铏姈閹便劑宕归銈傛敵婵犵數濮村ú銈呮纯闂傚鍋勫ú锕傚蓟閵娾晩鏁傞柛顐ｆ礃閳锋帒霉閿濆妫戝☉鎾瑰皺缁辨帡鐓鐘电厯闂佽鍠楅敋妞ゎ偅绻冨蹇涘煛閸愵亝娈介梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠栭悿楣冩煙闂傚鍔嶉柣鎾卞灪娣囧﹪顢涘▎鎺濆妳濠碘�冲级濡炰粙寮婚敓鐘插耿妞ゆ挾濮烽弳銈夋⒑閸濆嫭婀版繛鍙壝銉╁礋椤栨艾鑰垮┑鈽嗗灥瀹曚絻銇愰崨瀛樷拻闁稿本鐟чˇ锔撅拷瑙勬处閸撴瑧鍙呭銈嗘尪閸ㄥ綊鎷戦悢鍏肩叆婵犻潧妫Σ鍝ョ磼椤愩垻效闁哄被鍔戦幃銏㈡嫚濞堝鎸剧槐鎺楀磼濮樻瘷锝囩磼閸屾稑绗ч柨鐔告灮缂嶅棝宕戦崨顓涙瀺闁靛繈鍊栭埛鎴︽煠閹帒鍓い蹇撶叒閵娾晜鏅稿ù鐘差儐椤ュ﹥銇勯幒鎴Ц濠⒀勬尦閺岋紕浠﹂棃鈺傚鐎规洖娲﹀▓鏇㈡⒑鐠恒劌鏋嶇紒顔界懃閻ｉ攱瀵奸弶鎴濆敤濡炪倖鎸荤划锝夊箯闁垮鐟归柨鐔绘椤曪絾绂掔�ｅ灚鏅ｉ悷婊冮叄瀵煡濮�閵堝棌鎷洪柣鐘充航閸斿矂寮搁弮鍫熺厸闁告粈绀佹禍浼存煛娴ｈ宕岄柟宕囧仱婵＄兘濡搁妷顔筋棨闂傚倷鐒﹂幃鍫曞垂濞差亝鍋傞柨鐔哄У閺呮煡鏌ｉ幇顒�顣抽柣銈忔嫹闂備礁鎼崐浠嬵敋瑜庣粋宥呪攽鐎ｎ偀鎷洪梺鍛婄☉閿曘倖鎱ㄩ敓浠嬫⒑閸濆嫭鍣虹紒璇茬墕閻ｇ兘濮�閵堝懐顔愭繛杈剧到閸樻粓骞忓ú顏呯厽闁绘ê鍘栭懜顏堟煕閺傝儻瀚伴柍璇茬Ч楠炲洭鎮ч崼銏犲箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐?
		if (cons == 0 && iq == 0 && str == 0 && endu == 0 && agi == 0)
			return;

		final PPetAddPointProc proc = new PPetAddPointProc(roleid, petkey, cons, iq, str, endu, agi);
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788439;

	public int getType() {
		return 788439;
	}

	public int petkey; // 宠物key值,加点的宠物
	public int str; // 力量加点数
	public int iq; // 智力加点数
	public int cons; // 体质加点数
	public int endu; // 耐力加点数
	public int agi; // 敏捷加点数

	public CPetAddPoint() {
	}

	public CPetAddPoint(int _petkey_, int _str_, int _iq_, int _cons_, int _endu_, int _agi_) {
		this.petkey = _petkey_;
		this.str = _str_;
		this.iq = _iq_;
		this.cons = _cons_;
		this.endu = _endu_;
		this.agi = _agi_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		if (str < 0) return false;
		if (iq < 0) return false;
		if (cons < 0) return false;
		if (endu < 0) return false;
		if (agi < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		_os_.marshal(str);
		_os_.marshal(iq);
		_os_.marshal(cons);
		_os_.marshal(endu);
		_os_.marshal(agi);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		str = _os_.unmarshal_int();
		iq = _os_.unmarshal_int();
		cons = _os_.unmarshal_int();
		endu = _os_.unmarshal_int();
		agi = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPetAddPoint) {
			CPetAddPoint _o_ = (CPetAddPoint)_o1_;
			if (petkey != _o_.petkey) return false;
			if (str != _o_.str) return false;
			if (iq != _o_.iq) return false;
			if (cons != _o_.cons) return false;
			if (endu != _o_.endu) return false;
			if (agi != _o_.agi) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += str;
		_h_ += iq;
		_h_ += cons;
		_h_ += endu;
		_h_ += agi;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(str).append(",");
		_sb_.append(iq).append(",");
		_sb_.append(cons).append(",");
		_sb_.append(endu).append(",");
		_sb_.append(agi).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPetAddPoint _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		_c_ = str - _o_.str;
		if (0 != _c_) return _c_;
		_c_ = iq - _o_.iq;
		if (0 != _c_) return _c_;
		_c_ = cons - _o_.cons;
		if (0 != _c_) return _c_;
		_c_ = endu - _o_.endu;
		if (0 != _c_) return _c_;
		_c_ = agi - _o_.agi;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


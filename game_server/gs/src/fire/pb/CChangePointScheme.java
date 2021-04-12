
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangePointScheme__ extends mkio.Protocol { }

/** 客户端请求切换加点方案
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangePointScheme extends __CChangePointScheme__ {
	@Override
	protected void process() {
		// protocol handle
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊勭矊闇夐柡宥庡幗閻撳繐鈹戦悙闈涗壕婵炲懎妫濋弻娑㈠Χ閸涱収浼冮梺鍝勮閸婃鍒掑▎鎴炲磯闁靛鍊楁す铏節閻㈤潧浠滈柟铏姈閹便劑宕归銈傛敵婵犵數濮村ú銈呮纯闂傚鍋勫ú锕傚蓟閵娾晩鏁傞柛顐ｆ礃閳锋帒霉閿濆妫戝☉鎾瑰皺缁辨帡鐓鐘电厯闂佽鍠楅敋妞ゎ偅绻冨蹇涘煛閸愵亝娈介梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠栭悿楣冩煙闂傚鍔嶉柣鎾卞灪娣囧﹪顢涘▎鎺濆妳濠碘�冲级濡炰粙寮婚敓鐘插耿妞ゆ挾濮烽弳銈夋⒑閸濆嫭婀版繛鍙壝銉╁礋椤栨艾鑰垮┑鈽嗗灥瀹曚絻銇愰崨瀛樷拻闁稿本鐟чˇ锔撅拷瑙勬处閸撴瑧鍙呭銈嗘尪閸ㄥ綊鎷戦悢鍏肩叆婵犻潧妫Σ鍝ョ磼椤愩垻效闁哄被鍔戦幃銏㈡嫚濞堝鎸剧槐鎺楀磼濮樻瘷锝囩磼閸屾稑绗ч柨鐔告灮缂嶅棝宕戦崨顓涙瀺闁靛繈鍊栭埛鎴︽煠閹帒鍓い蹇撶叒閵娾晜鏅稿ù鐘差儐椤ュ﹥銇勯幒鎴Ц濠⒀勬尦閺岋紕浠﹂棃鈺傚鐎规洖娲﹀▓鏇㈡⒑鐠恒劌鏋嶇紒顔界懃閻ｉ攱瀵奸弶鎴濆敤濡炪倖鎸荤划锝夊箯闁垮鐟归柨鐔绘椤曪絾绂掔�ｅ灚鏅ｉ悷婊冮叄瀵煡濮�閵堝棌鎷洪柣鐘充航閸斿矂寮搁弮鍫熺厸闁告粈绀佹禍浼存煛娴ｈ宕岄柟宕囧仱婵＄兘濡搁妷顔筋棨闂傚倷鐒﹂幃鍫曞垂濞差亝鍋傞柨鐔哄У閺呮煡鏌ｉ幇顒�顣抽柣銈忔嫹闂備礁鎼崐浠嬵敋瑜庣粋宥呪攽鐎ｎ偀鎷洪梺鍛婄☉閿曘倖鎱ㄩ敓浠嬫⒑閸濆嫭鍣虹紒璇茬墕閻ｇ兘濮�閵堝懐顔愭繛杈剧到閸樻粓骞忓ú顏呯厽闁绘ê鍘栭懜顏堟煕閺傝儻瀚伴柍璇茬Ч楠炲洭鎮ч崼銏犲箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐?
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId <= 0)
			return;

		if (schemeid < 0 || schemeid == 0){
			return;
		}
		
		final xbean.Properties prop = xtable.Properties.select(roleId);
		if (null == prop)
			return;
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴崨濠呯闂佺绨洪崐婵嗙暦闂堟侗娼╂い鎴犲仦濡炰粙銆侀弮鍫濆窛妞ゆ梻鏅ぐ鍥⒒閸屾瑦绁版繛澶嬫礋瀹曟澘顓奸崶褍鐏婂┑鐐叉閹稿摜绮婚弽顬棃鏁愰崨顓熸闂佺锕ら…鐑藉蓟閿曪拷铻ｅ〒姘煎灡姝囬梻浣侯攰婵倕煤閻斿娼栨繛宸簼椤ュ牊绻涢幋锝夊摵閼叉牠姊绘担渚劸閻庢稈鏅滅换娑欑節閸涱噮妫ㄥ┑锛勫亼閸婃牕煤閳哄懎绠梺鍨儐閸欏繐鈹戦悩鍙夊櫤妞ゅ繒濮风槐鎺撴綇閵娿儳鐟ㄥ銈庡亝缁挸鐣锋總鍛婃櫜闊洦鏌ㄩ鍫曟⒑閸︻収鐒炬繛鎾棑缁骞嗛‖鈥崇秺閺佹劙宕ㄩ鐔哥槪闂佽瀛╅崙褰掑闯閿濆违闁告稑鐡ㄩ悡銉╂倵閿濆啫濡虹紒銊ヮ煼濮婃椽宕崟顓涙瀱闂佺顑呯�氼厾绮嬮幒妤佹櫇闁稿本绋撻崢浠嬫⒑鐟欏嫬鍔ゆい鏇ㄥ幖鐓ら柟缁㈠枟閻撴盯鎮橀悙鎻掆挃闁靛棙甯掗湁闁绘瑥鎳愰悾鐢碉拷瑙勬礃缁繘藝鐎涙ǜ浜滈柟鎹愭硾鐢爼鏌嶇憴鍕伌闁诡喗鐟╅獮鎾诲箳閹剧鎷烽鐐粹拺闁告稑锕ラ埛鎰版煟濡ゅ啫校濞ｅ洤锕幃鐣岀矙鐠侯煈妲规俊鐐�栭悧鎾诲磹濡ゅ啰鐭欓煫鍥ㄦ惄濞撳鏌曢崼婵囶棡妞ゃ儱妫欐穱濠囶敃閵忕媭浼冨銈冨灪濡啴寮幘缁樻櫢闁跨噦鎷�
		final PChangePointProc changepoint = new PChangePointProc(roleId, schemeid);
		changepoint.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786530;

	public int getType() {
		return 786530;
	}

	public int schemeid;

	public CChangePointScheme() {
	}

	public CChangePointScheme(int _schemeid_) {
		this.schemeid = _schemeid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(schemeid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		schemeid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangePointScheme) {
			CChangePointScheme _o_ = (CChangePointScheme)_o1_;
			if (schemeid != _o_.schemeid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += schemeid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(schemeid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangePointScheme _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = schemeid - _o_.schemeid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetFirstPayReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忓爼鏌ｆ惔銈庢綈婵炴彃绻樺畷鏇㈠箮閼恒儲娅㈤梺鍝勫�堕崐妤冪矓閻㈠憡鐓曢柣妯虹－婢у崬顭跨憴鍕鐎规洜顭堣灃濞达絽鎼獮宥夋⒒娴ｇ瓔鍤冮柛銊ㄦ珪閺呰泛螖閸氳棄顦板鍕箛椤掑偆鍟囬梻浣告惈椤︿即宕烘繝鍥╁彆妞ゆ帒瀚悡娑㈡倶閻愰鍤欓柨鐔诲Г缁诲牓鐛繝鍌楁斀閻庯綆浜為鐓庮渻閵堝棙顥嗛柛瀣姈閺呭爼顢涘锝嗘杸闂佺粯鍔樼亸娆撳箺閻樼數纾兼い鏃囧亹閻忚京绱掓潏鈺佷沪缂佺粯绻堝畷鎯邦樁闁硅姤娲栭埞鎴︽倷閺夋垹浠ч梺鎼炲妿閹虫捇寮鎴掔箚闁绘劦浜滈敓鑺ョ墪椤繗銇愰幒鎴狅紵閻庤娲栧ú锕傚汲濠婂牊鐓忓┑鐐戝啯鍣介柨娑欑箖缁绘稒娼忛崜褍顕辩紓渚囧枟閻熲晛鐣烽锔藉�绘俊顖氭贡缁犳艾顪冮妶鍡楀闁搞劌缍婂鎶芥晲閸ラ攱瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋鐎规洖缍婇獮鍡氼槾闁哄棴绠撻弻娑㈠Ψ閿濆懎顬夊銈嗘⒐閹哥粯绌辨繝鍥ㄥ�锋い蹇撳閹风兘寮借濞兼牕鈹戦悩瀹犲闁稿被鍔庨幉鎼佸棘濞嗘儳娈ㄩ梺瑙勫劶婵倝宕愰悜鑺ュ�垫繛鎴烆仾椤忓嫷鍤曢柛褎顨嗛埛鎴︽煙缁嬫寧鎹ｇ紒鐘虫尰娣囧﹪顢曢敐搴㈢暦闂侀�涚┒閸旀垵鐣锋總绋款潊闁靛浚婢佺槐鑼磽閸屾艾锟界兘鎮為敃鍌楋拷锕傚炊閳哄啩绗夐梺缁樺姉缁绘繄鎹㈤崱妯镐簻闁规壋鏅涢悘鈺呮煛閸℃鎳囬柡灞界Ч閹稿﹥寰勫Ο鎭嶏箑顪冮妶搴′簼缂侇喗鎸搁悾閿嬬附閸涘﹤浜滄繝闈涘�搁ˇ顔炬閿曞倹鈷戦柤濮愬�曢弸鎴犵磼椤旂厧顒㈤柡鍛版硾铻栭柛鎰ㄦ櫆濞堟澘鈹戞幊閸婃洟骞婃惔锝咁棜濠电姵纰嶉崐鐢告煥濠靛棝顎楅柡瀣枛閺岋綁骞樼�靛憡鍒涢梺鍝勬湰閻╊垱淇婇悜钘夘潊闁斥晛鍟拌ぐ鍛存⒒娴ｅ憡鎯堟い鎴濇瀹曞綊宕稿Δ锟介拑鐔哥箾閹寸們姘跺几鎼淬劎鍙撻柛銉ｅ妽缁�鍫熴亜閺冿拷鐢�愁潖濞差亜浼犻柛鏇ㄥ櫘濞煎爼姊洪崨濠冣拹闁搞劌娼￠悰顕�宕橀鍢壯冾熆鐠虹尨鍔熼柨娑欑矊閳规垿鎮欓弶鎴犱桓闂佹寧娲嶉弲婊咃拷闈涖偢閺佹捇鏁撻敓锟�
 * @author changhao
 *
 */
public class CGetFirstPayReward extends __CGetFirstPayReward__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new PGrabFirstPayAward(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812462;

	public int getType() {
		return 812462;
	}


	public CGetFirstPayReward() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetFirstPayReward) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetFirstPayReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


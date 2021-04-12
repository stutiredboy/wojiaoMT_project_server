
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枙婵倕煤閻旈鏆︽い鏍ㄧ☉椤曢亶鎮楀☉娅亪宕滈悷鎵虫斀闁绘劕寮堕ˉ鐐烘煙缁嬫鐓奸柟顔癸拷鏂ユ瀻闁圭偓娼欓敓鐣屾暬閺岋綁濮�閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽鐐蹭紶闁靛／鍜冪床闂備浇顕栭崹搴ㄥ礃椤忓棌妫ㄧ紓鍌氬�风欢锟犲窗濡ゅ懏鍋￠柍杞扮贰閸ゆ洖鈹戦悩宕囶暡闁稿瀚伴弻锝夊箻閾忣偅宕冲銈忓瘜閸欏啴骞冨畡閭︾叆闁告劦浜為濠囨⒑鏉炴壆璐伴柛鐘崇墵閸┿儲寰勯幇顒夋綂闂佹寧绋戠�氼剛鏁Δ鍛拻闁稿本鐟чˇ锕傛煟韫囨梻绠炴い銏＄墵瀹曞崬螖閸愨晜顔曢柣搴ｆ閹风兘鏌涢弴銊ュ闁告ɑ鎮傞幃妤呮儌閸涘﹤顏堕梺璇插嚱缂嶅棝宕滃☉婧惧徍闂備浇顕х�涒晠顢欓弽顓為棷妞ゆ洩鎷风�规洘绮撻幃銏☆槹鎼淬垺顔曢柣鐔哥矌婢ф鏁埡鍛瀬閻庯綆鍠楅悡鏇熺箾閹存繂鑸归柡瀣枑閵囧嫰寮敓浠嬪垂閸︻厽顫曢柟鎹愵嚙绾惧吋鎱ㄥ鍡楀⒕闁圭兘鏀遍ˇ鐗堟償閵忊晛浠洪梻渚�娼ч悧鍡浰囬婊呬笉妞ゆ牜鍋為悡鐔兼煙鏉堝墽鍒扮悮姘舵⒑缂佹ɑ灏柛搴ｆ暬瀵鏁愭径濠傚祮闂佺粯鍔橀婊堝箯閻戣棄鎹舵い鎾卞妽鐎氳鎱ㄥΟ鐓庝壕閻庢熬鎷�
 * @author changhao
 *
 */
public class CCreateTeam extends __CCreateTeam__ {
	@Override
	protected void process() {
		// protocol handle	
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		/*
		gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(leaderRoleId);
		if (linkrole != null)
		{
			int userid = linkrole.getUserid();
			if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸涱喛纭�缂備浇椴哥敮锟犲箖閳哄懏顥堟繛鎴炲笚閻庝即姊绘担鍛婃儓闁活剙銈稿畷浼村冀椤撶姴绁﹂梺绯曞墲閸戠懓危妤ｅ啯鈷戦柟绋挎捣閳藉绱掓径濠勭Ш鐎殿喖顭烽弫鎾绘偐閹绘帟锟藉灝顪冮妶鍡樺暗濠殿喚鍏樺鎶藉Χ閸涱亝鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰閻瑩鏌曢崱鏇狀槮閾绘牠鏌涘☉鍗炴灍婵炲懌鍨藉鐑樺濞嗘垵鍩岄梺娲诲墮閵堟悂骞嗗畝鍕缂備焦锚閿熺晫鏁婚弻锝夊閻樺啿鏆堟繛瀛樺殠閸婃繈寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖娴ｅ摜绐為柣搴稻閹稿爼宕濋幋婵愭綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇撴閳规垿鍩ラ崱妞剧盎闁诲孩鍑归崰姘跺礆閹烘梹瀚氱�瑰壊鍠栭幃鎴炵節閵忥絾纭鹃柨鏇畵閺佸秹鎮㈤崗灏栨嫽婵炴挻鑹惧ú銈嗘櫠椤斿墽纾煎璺侯煬閸ょ喓绱掗纰辩吋闁诡喒鏅濋幏鐘绘嚑椤掑鏅ｉ梻鍌欑濠�閬嶅煕閸儱鍌ㄥΔ锝呭暙閸屻劍绻濇繝鍌涘櫧缁惧墽鏅敓钘夌畭閸庡崬螞濞戞瑦娅犻柣銏犳啞閻撴盯鎮橀悙闈涗壕缂侊拷鐎ｎ剨鎷风憴鍕闁告鍥х厴闁硅揪绠戠粻娑欍亜閹剧绱￠柛銉ｅ妷閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? by changhao
			{
				DayPayManager.getInstance().ProcessDayPay(userid, leaderRoleId);
			}					
		}
		*/
		
		new PCreateTeam(leaderRoleId).submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794433;

	public int getType() {
		return 794433;
	}


	public CCreateTeam() {
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
		if (_o1_ instanceof CCreateTeam) {
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

	public int compareTo(CCreateTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


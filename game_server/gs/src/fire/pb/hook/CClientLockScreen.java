
package fire.pb.hook;

import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CClientLockScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CClientLockScreen extends __CClientLockScreen__ {
	@Override
	protected void process() {
		// protocol handle
		gnet.link.Role role = Onlines.getInstance().find(this);
		if(role == null)
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锕傛⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樺啿浠梺闈涱槴閺呮粓寮插┑瀣厪濠㈣泛妫欏▍鍛浖閸涘瓨鈷戦柛娑橈攻婢跺嫰鏌涢妸銈呭祮鐎规洘锕㈤弫鎾寸鐎ｎ偀鎷洪梻鍌氱墛娑撶懓鈽夊顐ｅ媰闂佺粯鍔﹂崜锕傚疮閸ヮ剚鈷掗柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囨鎷烽敃鍌氶唶闁绘洑鐒﹂鏃堟⒑瑜版帗锛熼柣鎺炵畵瀵彃鈹戦崶銉ょ盎闂婎偄娲﹂幐鐐櫠閺囥垺鐓㈤柛鎰典簻閺嬫盯鏌＄仦鐐鐎规洜鍘ч埞鎴﹀箛椤撳／鍥ㄢ拺閻犲洠锟藉磭浠梺绋款儑閸嬨倖淇婇悽绋跨妞ゆ牗姘ㄩ悿锟介梻浣哥枃濡椼劑鎳楅懜闈涱嚤闁告洦鍓涚粻楣冩倵濞戞瑯鐒介柣顓烆儏椤潡鎮烽悧鍫￥濠碘�冲级閸旀瑩鐛Ο纭锋嫹濞戞顏堫敁閹剧粯鐓熼柣妯哄级缁�宀勬煕閹惧绠為柟顕�绠栧畷濂稿即閻斿弶瀚肩紓浣鸿檸閸樺ジ骞婅箛娑欏仧妞ゅ繐鐗婇悡鏇㈡煛閸愭寧瀚归梺鑽ゅ暱閺呯娀鎮伴锟藉畷鍗炩槈濞嗘劖顏熼梻浣稿悑娴滀粙宕曢娑氼洸婵犲﹤鐗忛崣鎾绘煕閵夛絽濡介悘蹇涙涧椤儻顦虫繛鍙夌矌濡叉劙骞掑Δ浣规闂佽姤锚椤﹂亶寮抽崱娑欑厱闁哄洢鍔屾晶浼存煕濞嗗繑顥滈柍瑙勫灴閹瑩寮堕幋鐘辨闂備焦瀵х喊宥夊Φ閸曨喚鐤�闁挎繂鎳嶇花濂告⒑闂堟稒鎼愰悗姘嵆瀵偊宕掑鍕彴闂佸憡鐟ラˇ杈ㄧ椤忓牊鈷戦柛鎾楀懎绗￠梺缁橆殘婵烇拷鐎殿喖顭烽弫鎰板椽娴ｇ懓缂撻梻浣芥硶閸犳洖螞閸曨垪锟斤箓宕堕宥喰紓鍌欑閸婂湱鏁敓鐘叉槬闁跨喓濮村婵囥亜閺冿拷閸庢娊鐛崼銉︹拻濞达絿顭堥弳閬嶆煙绾板崬浜扮�规洘鍔楃槐鎺懳熺紒妯煎娇闂備礁澹婇悡鍫ュ磻娴ｅ湱顩叉繝濠傜墛閻撳繘鐓崶褝鏀绘い顐攻缁绘盯宕奸悢绯曟嫻闂侀潧娲ょ�氫即銆佸Ο渚叆闁告劦鐓堝搴ㄦ煟鎼淬値娼愭繛鎻掔箻瀹曟繈骞嬮敂鐚存嫹娴ｇ硶鏋庨柟鐐綑濞堢喖姊洪棃娑辨▓闁哥姵鐗犲顐ャ亹閹烘挴鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔欓獮鏍ㄦ媴閸濄儻绱卞┑鐘垫暩婵潙煤閵堝洨涓嶆い鏍仦閻撶喖鏌熸潏鍓у埌鐞氭岸姊虹紒妯诲鞍闁荤啿鏅涢～蹇撁洪宥嗘櫍闂侀潧臎閸涱喗顔忛梻鍌欑閹碱偊顢栭崘顔肩９婵犻潧顑呴拑鐔兼煟閺傛娈犻柛鐔锋噺閵囧嫰寮崹顔藉�梺璇茬箲閹稿墽妲愰幘瀛樺濞寸姴顑呴幗鐢告⒑閸︻収鐒炬い顓犲厴閻涱喛绠涘☉妯虹獩闁诲孩绋掗敋濞寸媭鍙冨铏规喆閸曢潧鏅遍梺闈╃秵閸犳牕宓勬繛瀵稿帶閻°劑鍩涢幒鎳ㄥ綊鏁愰崼婢挾鐥鐐靛煟闁哄本鐩弫鎰疀閺囩姵娈兼俊銈囧Х閸嬫稓鎹㈠锟藉顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢锝嗙５闁跨喐鏋荤粻鎾崇暦婵傜唯闁靛鍎宠ぐ澶嬩繆閻愵亜锟芥牜鏁幒鏃撴嫹濮樼厧寮�规洘鍨块弫宥夊礋椤掞拷閺嬫垿姊洪崫鍕殭闁绘妫涚划濠氬冀椤撶喓鍘介梺纭呮彧缁查箖藟婢跺瞼纾奸柣妯烘▕閻撳ジ鏌＄仦鍓ф创妤犵偞锕㈤幊鐘垫崉閸濆嫬鑵愰梻鍌欑劍鐎笛呯矙閹烘柨鍨濋柟鐐墯濞兼牠鏌ц箛姘兼綈閻庢碍宀搁弻宥夊Ψ閵壯嶇礊闂佽法鍠曞Λ鍕�﹂悜钘夎摕婵炴垶菤濡插牓鏌涘Δ鍐ㄤ粶闁冲嘲顦埞鎴︽晬閸曨偂澹曢梺璇″枛閸婃悂锝炶箛鏇犵＜婵☆垵顕ч鎾翠繆閻愬樊鍎忕紒銊ㄥ亹閹蹭即宕卞▎鎴狅紳闂佺鏈銊ョ摥婵犵妲呴崑鍛崲閸岀偞鍋╃�瑰嫰鍋婇悡銉╂煕閹板墎绋婚柣搴☆煼濮婃椽宕烽鐐插缂備浇顕ч崯顐ヮ暰闁瑰吋鐣崝宥夊煕閹烘鐓曢悘鐐插⒔閹冲懏銇勯敂鑲╃暤闁哄瞼鍠撻崰濠囧础閻愭壆鐩庨梺缁樻尪閸婃繈寮婚弴鐔虹闁绘劦鍓氶悵鏃傜磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹惧墎纾奸柣鎰靛墮閸斻倗绱撳鍜冭含鐎殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂傚倷鐒﹁摫閻忓浚浜弻娑欐償閵堝懐姣㈤梺鐟扮畭閸ㄥ綊鍩ユ径鎰潊闁绘ɑ顔栭崥鍛存⒒娴ｈ櫣甯涢柛銊╂涧铻炴繛鎴欏灩缁�澶愭煙闂傚鍔嶉柣鎾跺枛楠炴牕菐椤掞拷閻忣噣鏌ｉ幙鍐ㄧ仸闁哄本绋戣灃濞达絿纭堕弸娆撴倵濞堝灝鏋︽い鏇嗗洤鐓″鑸靛姇椤懘鏌嶉妷銉ュ笭缂併劋绮欏缁樻媴娓氼垳鍔搁梺鍝勭墱閸撴稓鍒掑▎鎾崇闁挎梻绮弲婊堟⒑閸撴彃浜濇繛鍙夛耿閸╂盯骞掑Δ浣哄幈闁诲繒鍋涙晶浠嬪箠閸涱喓浜滈柨鏃囧亹閻ｇ敻鏌″畝锟介崰鎾诲箯閻樹警妲剧紓浣叉閹风兘姊绘担绛嬪殐闁哥姵宀稿畷妤�顫滈敓钘夘嚕椤愶箑绀冩い鏃囧亹閿涙粌鈹戦绛嬬劸濞存粠鍓熷畷銏ゎ敆閸曨兘鎷绘繛杈剧秬婵倗娑甸崼鏇熺厱闁绘娅曠亸鐢电磼椤旂》韬柟顖氼樀瀵爼銆傚▔涔禦oleList婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繃鍤囬柛鈺冨仱楠炲鏁傞挊澶夋睏闂備礁婀辩划顖滄暜濡わ拷閳绘捇顢橀悜鍡樺瘜闂侀潧鐗嗗Λ娆戠矆鐎ｎ�㈢懓顭ㄩ崘顏勭厽閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷
		new fire.pb.state.PRoleLockScreen(role.getRoleid(),(lock!=0)?Boolean.TRUE:Boolean.FALSE).submit();		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810344;

	public int getType() {
		return 810344;
	}

	public byte lock;

	public CClientLockScreen() {
	}

	public CClientLockScreen(byte _lock_) {
		this.lock = _lock_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(lock);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		lock = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CClientLockScreen) {
			CClientLockScreen _o_ = (CClientLockScreen)_o1_;
			if (lock != _o_.lock) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)lock;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(lock).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CClientLockScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = lock - _o_.lock;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢凹鍙冨畷宕囧鐎ｃ劋姹楅梺鍦劋閸ㄥ綊宕愰悙鐑樺仭婵犲﹤瀚惌濠囨婢舵劖鐓涚�广儱楠搁獮妤呮煟閹惧磭绠伴柍瑙勫灴閹瑩妫冨☉妤�顥氭繝鐢靛仜閹冲骸螞濠靛钃熸繛鎴欏灩鍥撮梺鍛婁緱閸欏孩瀵奸崘顔解拺闁告繂瀚～锕傛煕婵犲喚娈橀柛鎺撳笒閳诲酣骞嬮悙鑼紡闂備線娼ч…鍫ュ磹濡や降浠氶柧蹇ｅ亞缁★拷闂佹眹鍨藉褎绂掑鍫熺厵闁惧浚鍋勬慨鍫ユ煙娓氬灝濮傜�规洖缍婇、鏇㈠Χ閸屾稒鏆ゆ繝鐢靛Х閺佸憡鎱ㄩ弶鎳ㄦ椽濡堕崨顔惧嚱闂傚倸鍊搁…顒勫磻閸曨個娲晝閸屾俺鎽曢梺闈浥堥弲鈺呭极閸岀偞鐓曟い鎰剁稻缁�鍐煃闁垮绗掗棁澶愭煥濠靛棭妯堟俊顐ｅ灥閳藉骞橀悷鎵缂備浇椴哥敮锟犳偂椤愶富鏁囬柣妯兼暩閸橆垶姊绘担绛嬪殐闁哥姵顨婇弫瀣渻閵堝骸浜濈紒璇插暙椤洩绠涘☉妯煎幐闂佸憡鍔︽禍婵嗏枔娴犲鈷掗柛灞剧懆閸忓瞼绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柛鐘崇墵閹寧銈ｉ崘鈺冨幍闂傚倸鍊搁顓㈠礉瀹ュ鐓熼柟鎯у船閻忣亜菐閸パ嶈含妞ゃ垺绋戦埢搴ㄥ箳濠靛棗韦濠电姷顣介敓钘夊暱缁狙勪繆閻愭壆鐭欑�殿喖顭烽弫鎾绘偐閹绘帟锟藉灝顪冮妶鍡樺暗濠殿喚鍏樺鎶藉Χ婢跺鎷洪梺鍛婄箓鐎氼厼锕㈤悧鍫㈢闁告瑥顥㈤鍫晪闁靛鏅涚粈瀣亜閺嶃劏澹橀柤鏉跨仢閳规垿鍩ラ崱妤冧淮閻庤娲戠徊濠氬Φ閹版澘宸濋悗娑櫱氶幏濠氭⒑缁嬫寧婀伴柣鐔濆泚鍥晜閹惧懏瀚归悷娆忓婢跺嫰鏌涢幘瀵告噮闁告瑥鎳庨—鍐Χ閸℃ê钄奸梺鎼炲妼缂嶅﹪骞忛幋锔藉亜闁稿繗鍋愰崣鍡椻攽閻樼粯娑ф俊顐幖鍗遍柛婵勫劤绾惧吋銇勯幇鈺佺伄閺佸牓姊洪崫鍕潶闁告梹鍨块獮鍐閵忊�崇彴濠电偛鐗嗛鍡涘箰閸撗勵潟闁圭儤顨呯壕鍏兼叏濡崵妯傞柨婵嗘川绾惧ジ鏌涚仦鍓р槈缂佹う鍥ㄧ叆闁绘柨鎲￠悘顔剧磽瀹ュ懏顥㈢�规洘鍨垮畷銊╊敇濞戞瑧锟芥椽姊洪棃娑氱疄闁稿﹥鐗犻崺娑㈠箣閿旂晫鍘鹃梺璇″幗鐢帡宕滈鐔翠簻闊洦鎸鹃崣鎺楁煏婵炵偓娅嗛柡鍛焾闇夐柣妯烘▕閸庢劖銇勯妷銉敾闁靛洤瀚伴獮鎺楀箣椤撶啘锔界節閳凤拷閸曨剙鍞夐梺鍝勭焿缁辨洘绂掗敃鍌涱棃闁冲搫鍊搁鍫曟倵鐟欏嫭绀�婵炶绠戦埢鎾诲即閵忊檧鎷洪柣鐘充航閸斿矂寮稿鍥╃＜妞ゆ梻鏅幊鍐煟閿濆鏁遍悗闈涖偢瀵爼骞嬪┑鍡樻殢濠碉紕鍋戦崐鏍箰閼姐倕鍨濋柨婵嗩槸缁狀垶姊洪崹顕呭剳闁荤喎缍婇弻銊╂偄缂佹﹩妫勫銈嗘穿缁插墽绮嬮幒鏃撴嫹閿濆懐浠涢柡鍜冪秮閹嘲顭ㄩ崘顔煎及閻庢鍠楅悡鈩冩叏閿熶粙鏌曢崼婵囶棏闁归攱妞介弻锝夋偐閸忓懓鍩呴梺鍛婃煥閻倸顕ｉ幖浣哥睄闁割偆鍠撻崢鎼佹⒑閸涘﹦鐭嗙紒锟芥担鍦洸濞寸厧鐡ㄩ悡娑樏归敐鍫綈鐎规洖鐭傞弻鐔风暦閸パ傛婵犵绱曢崗妯讳繆閹间礁唯妞ゆ梻鐡斿Λ銊╂⒒閸屾艾锟界兘鎮為敃鍌氱畺闁割偅娲栭崹鍌涚箾瀹割喕绨奸柛瀣�块弻銊╂偄閸濆嫅锝夋煛閸涱喚鍙�闁哄矉缍侀獮鍥敆閿熶粙銆傞幎鑺ョ厽闁靛牆绻戠�氬綊姊婚崒娆戭槮闁圭⒈鍋婂畷鎰鐎ｅ灚鏅悷婊冩捣缁顓奸崨顏呮杸闁诲函缍嗛崑锟介柟閿嬫そ濮婃椽宕ㄦ繝鍕ㄦ闂佹寧娲忛崐鏍箞閵娾晜鏅稿ù鐘差儐閳锋垿鏌涘┑鍡楊仾闁革綀娅ｇ槐鎺旀嫚閼碱剙顣洪梺浼欑悼閸忔ɑ鎱ㄩ敓浠嬫煏閸繃鍣芥い鏃�鍔栫换娑欐綇閸撗冨煂闂佸憡蓱缁捇鐛箛鎾佹椽顢旈崨顖氬箺闂備胶绮敋闁告ɑ鐗犻幊婊堫敂閸喓鍘遍梺鍝勫�介崕鑽わ拷姘嵆閺屽秶鎷犻懠顑勵殽閻愬弶鍠橀柟顔ㄥ洤閱囬柕蹇曞Т缁犮儵姊婚崒娆戭槮闁硅绻濆畷褰掝敍閻愯尙锛欓梺鍝勭▉閸嬫捇骞忓畡閭︽僵闁绘劦鍓欓锟�?
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


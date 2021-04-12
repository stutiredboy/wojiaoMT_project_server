
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqQuestion__ extends mkio.Protocol { }

/** 向NPC请求问题
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqQuestion extends __CReqQuestion__ {
	@Override
	protected void process() {
		// protocol handle
		final long	roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (!validate(roleid)) {
			return;
		}
//		final fire.pb.mission.schoolanswerques.PReqQuestion pReq=new fire.pb.mission.schoolanswerques.PReqQuestion(npckey, roleid);
//		pReq.submit();
	}
	protected boolean validate(long roleid) {

		if (roleid < 0)
			return false;
//		if (xtable.Properties.select(roleid).getLevel() < 10)
//			return false;
		// TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢瀛樸亜閵夛附宕岄柡浣规崌瀹曟劙鎮ゆ担鍦Х婵犵數鍋涘鍓佹崲閸儲鏅查柣鎰綑缁剁偟锟界櫢鎷烽柨鐔剁矙閹本寰勯幇顓犲幍闂佺粯鍨惰摫妞ゃ儲鐗犻弻鐔割槹鎼粹�冲箣闂佽桨鐒﹂崝鏍箚閺傚簱鏀介柛顐ｇ箓濮ｅ牆鈹戦敍鍕杭闁稿﹥鍨垮畷鏇㈡嚑椤掍礁搴婇梺绋跨灱閸嬫劙鏁撻懞銉︻棃鐎规洘锕㈤、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁骞樻い蹇撶墕濮瑰弶淇婇妶鍕厡缂佲槄鎷锋繝鐢靛仜閻楀棝鎮樺┑瀣嚑婵炴垶鐟ｆ禍婊堟煛閸ャ儱濡肩�殿噮鍠楅〃銉╂倷閼碱剛顔戦梺闈涙处閸旀瑩鐛幒妤�绠婚柛蹇撴噽閻╁酣姊婚崒娆掑厡妞ゎ厼鐗忛幑銏ゅ箳濡わ拷閸屻劎鎲搁弮鍫濇瀬闁瑰墽绮崑鈺呮倶閻愰潧浜炬慨锝呭濮婂搫效閸パ冨Ф婵炲瓨绮犳禍顏堝Υ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啫鈻庨幘宕囬獓闂佺懓顕崕鎰椤撶姷纾介柛灞剧懆閸忓矂鏌ц箛鎾诲弰鐎规洩缍佸畷姗�顢旈崱鏇犵憹闂備礁鎼粙渚�宕㈡總鍛婂珔闁绘柨鍚嬮悡鐔兼煛閸屾氨浠㈡い銉ョ箲娣囧﹪骞撻幒鏃傂ㄥΔ鐘靛仦閻楁洝褰佸銈嗗釜閹风兘鏌ｈ箛锝呮珝闁哄矉绻濆畷鍗烆潨閸℃顫坈闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐ゅ枔缁犻箖鎮楀☉娆樼劷闁活厼鐭傞弻娑氾拷锝庡墮閺嬪酣宕￠柆宥嗙厵闁规鍠栭。濂告煕婵犲嫬鍘撮柡灞剧☉閳规垿宕卞Δ濠佹偅缂傚倷鐒﹂崝鏍矙閹达腹锟芥棃宕橀鍢壯囨煕閳╁啰鎳冩い顐庡懐纾藉〒姘搐閺嬫盯姊虹敮顔剧М鐎殿噮鍋勯鍏煎緞鐎ｎ亷鎷锋搴嫹閻熸澘顥忛柛鐘愁殘閿熶粙娼ч惌鍌氼潖濞差亝顥堟繛鎴炶壘椤ｅ搫鈹戦埥鍡椾簼闁荤啿鏅犲畷鍝勨槈閵忕姷顔婂┑掳鍊撻懗鍫曞储閸楃偐鏀介柍钘夋閻忥絽鈹戦鑺ョ稇閾荤偤骞栧ǎ顒�鐏い鈺勫皺閹叉悂鎮ч崼婵堢懖闂佺粯鎸鹃崰鎰┍婵犲浂鏁嶆慨姗嗗墯閸婎垶姊洪崫鍕棏闁哄懏绻堥幆锟芥い蹇撶墕缁犳氨鎲稿澶婄畺闁硅揪闄勯悡蹇涙煕閵夋垵鍠氭导鍐倵濞堝灝鏋欑紒顔界懄娣囧﹤顫㈠畝濠冃俊鐐�栭幐鎼佸Χ缁嬫娼栨繛宸簻缁犲綊鏌ｉ幇顖ｅ殝闁归鍏樺浠嬵敇閻旇渹鐢婚梻浣稿暱閹碱偊骞婃惔銊﹀珔闁绘柨鍚嬮悡鐔兼煛閸愩劌锟界敻骞忛敓鐘崇厸濞达綁娼婚煬顒勬煛鐏炵偓绀冪紒缁樼洴瀹曞綊顢欓悡搴渐婵犵數濮伴崹鐓庘枖濞戞熬鎷峰顐㈠祮鐎殿喖顭烽弫鎾绘偐閸欏浠㈤梻浣告啞閸斿繘寮插☉銏╂晜闁跨噦鎷�?
		
		
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795439;

	public int getType() {
		return 795439;
	}

	public long npckey; // npckey为npc的唯一ID

	public CReqQuestion() {
	}

	public CReqQuestion(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqQuestion) {
			CReqQuestion _o_ = (CReqQuestion)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqQuestion _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


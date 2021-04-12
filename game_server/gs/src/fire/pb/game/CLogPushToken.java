package fire.pb.game;

import fire.log.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLogPushToken__ extends mkio.Protocol { }

/** 推送Token日志
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLogPushToken extends __CLogPushToken__ {
	public static final Logger logger = Logger.getLogger("PUSH");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		// protocol handle
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘遍柣搴到婢у海绮旈锟介弻锛勪沪閸撗�妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐嶆梹绻濇担鐑橈紡闂傚倸鍊峰ù鍥敋閺嶎厼鍨傚ù鐓庣摠閸嬪鏌熼幑鎰靛殭闁藉啰鍠栭弻銊モ攽閸♀晜笑缂備胶濮撮…鐑藉蓟濞戙垹绠涙い鏍电到濞堟繈姊鸿ぐ鎺濇闁稿繑锚閻ｉ绮欑拠鐐閺佹捇鎮惧畝锟芥稉宥夋煛瀹ュ啫濡虹紒璇叉閺屾洟宕煎┑鍥ф闂侀潻绲块弲顐︽晸閸婄噥娼愰柟鎼侇棑濞嗐垹顫濈捄楦挎憰濠电偞鍨熼幊鍥晸閺傘倗鐣垫鐐差儏閳规垿宕堕埡锟芥竟鏇熺節閻㈤潧浠滄い鏇ㄥ幗缁绘盯鏁撻悾宀�纾奸柣妯虹－婢ь亝銇勯銏㈢闁圭厧缍婇幃鐑藉级濞嗘儳娈梻鍌欑閹碱偄煤閵娾晛绐楅柟鎵閸嬬喖鏌￠崶鈺佇ョ痪鎹愭闇夐柨婵嗘噹椤ュ繘鏌涙惔銏犲闁哄瞼鍠栭獮鏍ㄦ媴閾忚姣囬柣搴ゎ潐濞叉ê鐣濋幖浣哄祦闁圭儤鍤﹂弮鍫熸櫢濞寸姴顑嗛崑鍌涚箾閹存瑥鐏柣鎾存礃缁绘繃绻濊箛鏂款伓闂備胶绮敮顏嗙不閹炬剚鍤曢柡灞诲労閺佸棝鏌ㄩ悢鍓佺煓闁糕晝鍋ら獮瀣晜閽樺鎷烽悜鑺ョ厸濠㈣泛顑呴悘鈺伱归悩娈跨劸妞ゎ亜鍟存俊鑸垫償閳ュ磭顔愰梻浣虹帛椤ㄥ棝骞愰幖浣瑰仼闁绘垼妫勫敮闂佸疇妗ㄩ懗鍫曟晬濠婂牊鈷戠紓浣姑慨澶愭偠濞戞牕鍔︽鐐茬箳缁辨帒螣閼测晩鍟庨梻浣烘嚀婢т粙藟閹邦厾鐝舵俊顖濆吹缁犻箖鎮橀悙鎻掞拷鎼佹晸閼恒儳澧辩紒顔碱儏椤撳ジ宕ㄩ崒娑欘棃鐎规洏鍔戦、娆撳箚瑜嶇粻娲⒒閸屾瑨鍏屾い銏狅工閳诲秹鏁愭径濠勶紱濠电偞鍨熼崑鎾绘晸閽樺鍤囨い銏☆殜瀹曟帒顭ㄩ崪鍐簥濠碉紕鍋戦崐鏍涙担瑙勫弿闁靛牆锛嗘径鎰唶闁靛濡囬崢闈涱渻閵堝棙鈷掗柡鍜佸亰閹矂骞掑Δ浣哄幍缂備礁顑呯亸鍛村绩閼姐倧鎷烽崹顐ｇ凡閻庢凹鍓熼幃鎯р攽鐎ｎ偅娅㈡繛瀵稿Т椤戝懎效閺屻儲鐓ラ柣鏇炲�圭�氾拷?, RoleId=" + roleId + ", Token=" + token);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810374;

	public int getType() {
		return 810374;
	}

	public int token; // 客户端发来的token

	public CLogPushToken() {
	}

	public CLogPushToken(int _token_) {
		this.token = _token_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(token);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		token = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLogPushToken) {
			CLogPushToken _o_ = (CLogPushToken)_o1_;
			if (token != _o_.token) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += token;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(token).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLogPushToken _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = token - _o_.token;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

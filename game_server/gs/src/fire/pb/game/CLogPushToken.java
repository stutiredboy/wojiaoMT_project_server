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
				logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢宕ｆ径妯烩枈闂備胶绮敮鎺楁晝椤忓牆钃熼柡鍥╁枔缁犻箖鏌ｉ幇闈涘闁绘繃姊荤槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢閬嶆煟鎼搭垳鍒板褍娴风划鏃堫敋閿熶粙寮婚敍鍕勃闁告挆锟藉Σ鍫ユ⒑鐎圭媭娼愰柛銊ョ仢閻ｇ兘宕￠悙宥嗘⒐缁绘繃鎷呴悜姗堢础闂傚倸鍊搁崐宄懊归崶顒夋晪闁哄稁鍘奸崹鍌毭归悡搴ｆ憼闁稿顑夐弻鐔煎箲閹伴潧娈梺钘夊暟閸犳牠寮婚妸銉㈡斀闁糕檧鏅滅瑧缂傚倷鑳舵慨鎾�﹂悜钘夎摕婵炴垯鍨圭粻娑欍亜閺嶇數鍒版繛鍫熺箞濮婇缚銇愰幒婵囶棖闂佺绻戦敋闁伙綁顥撶划娆戞嫚閻愵剚顥堥柡浣规崌閹儳鐣濋敓鑺ョ▔瀹ュ鐓涚�广儱鍟俊铏圭磼鐠囧弶顥㈤柡灞炬礋瀹曠厧鈹戦崶褎顏￠梻渚�娼荤徊鍧楀疾椤愶附鏅搁柛濠勫櫏濞兼劙鏌熼幖渚囨婵炲棎鍨归～婵堟崉妤︽寧鎲版繝鐢靛仦閸ㄧ喖骞婇崶顒佹櫢闁哄倶鍊楅悾鍨殽閻愬樊鍎忛柍瑙勫灴瀹曞爼鍩￠敓鑺ョ珶閺囩喓绡�闁汇垽娼ф禒婊勩亜閺囥劌骞楃紒缁樼洴閺佹捇鎮惧畝锟界壕濂告煟濡櫣锛嶅褜浜濋妵鍕敃閵忋垻顔掗梺鍦帶缂嶅﹪骞冮悜钘夌骇婵炲棙鍎冲▓顓㈡⒒閸屾瑧顦﹂柟纰卞亜鐓ら柕濞炬櫅缁愭鏌熼幍顔碱暭闁稿鍠栭弻锟犲炊閳轰絿銉х棯閹规劖顥夐棁澶愭煥濠靛棙鍣规い銉ョ箻閺屾稒鎯旈姀鐘差潚闂佸搫鐬奸崰鏍嵁閺嶃劍濯撮柧蹇氼潐濮ｅ洭鏌ｆ惔銈庢綈婵炲弶锚閻ｆ繈骞栨担鍝勭ウ闂佸湱鍎ら崵锕傚籍閸喐娅㈡繛瀵稿Т椤戝棝宕戦崒娑氱闁瑰瓨鐟ラ悘顏堟煟閹惧瓨绀冪紒缁樼箖缁绘繆绠涢弬娆句紦闂傚倷鑳剁划顖滄暜椤忓棛涓嶉柟鐐墯閸ゆ洟鏌＄仦璇插姶闁轰礁妫濋弻銊╂偄閸撲胶鐓撻梺绯曟櫇閸嬨倝鐛�ｎ喗鏅滈柦妯侯檧閹风兘鎮滈懞銉у幐婵犮垼娉涢鍛存倶閳轰急褰掓偐濞堣法鍔稿銈庝簻閸熷瓨淇婇懜鍨劅闁炽儱纾鎰版⒒娴ｈ櫣甯涙い銊ユ楠炴劙骞栨担鐟颁患闂佺粯鍨煎Λ鍕暜闂備礁鐤囧銊╂嚄閸洘鏅繝濠傜墛閳锋垹绱撴担濮戭亝鎱ㄦ径鎰仩婵炴垶鐗曢崝锔筋殽閻愯尙绠崇紒杈ㄥ笒铻ｉ柤娴嬫櫓閸熷酣姊绘担鐑樺殌濠⒀傜矙钘熼柟閭﹀幘閻濊埖淇婇婵嗗惞缂佺娀绠栭幃姗�鎮欓幓鎺炴嫹閹间焦鏅搁柤鎭掑劤婢ц京绱掗纰卞剰妞ゆ挸銈稿畷銊╁磼濞戞瑯妫冮悗瑙勬磸閸旀垿銆佸▎鎾崇畾鐟滃秶绮诲ú顏呪拻闁稿本鐟ㄩ崗灞俱亜閵忕媴宸ラ柍璇茬Ч閺佹劖寰勬繝鍕剁幢婵犵數鍋為崹鐔煎磻閹剧粯鏅搁柦妯侯槹閸ゅ洦銇勯姀鈽嗘疁鐎规洘甯掗…銊╁椽閸愵亜绨ユ繝纰夌磿閸嬫垿宕愰弽顬稒鎷呯憴鍕伎闂侀潧鐗嗛敍鍡樺緞閹邦剟鍞堕梺闈涱檧婵″洭宕㈤棃娑辨富闁靛牆妫欓埛鎺楁煛閸滀礁浜伴柟顖氱焸楠炴帒螖娴ｅ搫骞嶇紓鍌欑椤戝懐浜搁崨鏉戠哗闁煎鍊ч幏鐑藉垂椤愶絿鍑￠柣搴㈠嚬閸撶喖骞冮幆褉鏀介悗锝庡亝濞呫垺绻涚�电孝妞ゆ垵鎳庢晥闁哄被鍎查悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?, RoleId=" + roleId + ", Token=" + token);
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

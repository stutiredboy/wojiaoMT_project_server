
package fire.pb.skill;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUpdateInborn__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUpdateInborn extends __CUpdateInborn__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleId <= 0)
			return;
		final int apId = this.id;
		if(apId <= 0) return;
		if(flag == 0){
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SkillRole srole = new SkillRole(roleId);
					srole.updateInbornWithValid(apId);
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘靛幈濠殿喗锕╅崢浠嬪Φ濠靛棌鏀介梽鍥春閺嵮屽殫闁告洦鍙忛幏鐑芥晲鎼存繄鑳哄┑鈥冲级閸旀瑥顫忕紒妯肩懝闁跨喕妫勯…鍥樁濠⒀勭箞濮婃椽宕崟顒�娅ら梺鐑╂櫓閸ㄥ爼鐛箛娑樼闁挎棁妫勬禍婊堟煟韫囨挾绠ｉ柣鎺炵畵瀵剟鏁撴禒瀣拻濞达綀娅ｇ敮娑㈡煥濮樻唻鎷峰▓鍨灕闁糕晜鐗曢銉╁礋椤栨氨顦板銈嗙墬缁嬫捇宕㈤柆宥嗙厽閹兼惌鍨崇粔鐢告煕鐎ｎ亝顥犵紒顔碱煼閹瑩鎮滃Ο鐓庡箰闂佽绻掗崑鐔煎疾椤愶絿澧″┑鐘垫暩閸嬬喖鍩涢崼鐔侯洸妞ゅ繐鐗忓畵浣猴拷骞垮劚椤︿粙寮繝鍥ㄥ仯闁诡厽甯掓俊璺拷瑙勬礀閻栫厧顫忔繝姘＜婵炲棙鍩堝Σ顕�姊虹涵鍛撶紒顔芥尭閻ｇ兘骞庨懞銉︽珖闂佺鏈銊╊敊閸℃ü绻嗛柣鎰▕閸庡繑绻涢幘顕呮濠㈣娲樼粋鎺旓拷锝庡亞閸橀亶鏌ｈ箛鏇炰沪鐎规洘蓱缁旂喎顫滈敓浠嬪蓟閵娾晜鍋勯柣鎴炆戦悵顏堟⒑缁嬭法绠查柨鏇樺灲閻涱喗绻濋崑鑺ユ瀹曘劑顢橀姀鐘虫毆闂傚倷绀侀幖顐⒚洪妸鈺佺；婵炴垯鍨圭壕鑽わ拷骞垮劚椤︿即宕戦埄鍐瘈濠电姴鍊搁顏呫亜閵夈儳澧﹂柡宀嬬到閳藉宕￠悙瀵稿綆闁诲氦顫夊ú姗�鏁冮姀銈呮槬闁跨喓濮寸壕鍏兼叏濮楀棗澧棅锕傛⒒閸屾艾锟界兘鎮為敂鎾呮嫹缁楁稑鎳忓畷鏌ユ煕鐏炲墽鐭嬬�规洘鐓￠弻鐔猴拷鐢殿焾椤庢捇鏌熷畡鏉挎Щ妞ゎ偅绻堥、妤呭磼濠х偑鍔戝娲传閸曨剚鎷遍梺鐑╂櫓閸ㄨ泛顕ｉ锕�纾兼繝濠傚閻濅即姊洪崷顓犲笡閻㈩垳鍋ら、娆撳箛椤戣姤鏂�闂佺粯鍔曞Ο濠囧吹閻斿皝鏀芥い鏃傚亾閺嗏晠鏌涢幒鎾崇瑨闁伙絾绻堝畷鐔碱敃閵堝懎绠ｉ梻鍌欒兌椤㈠﹪骞撻鍡嫹闂堟稓鐒哥�殿噮鍋呯换婵嬪炊閵娧冨箻婵犵數鍋炲娆擃敄閸℃せ鏋嶉柛銉ｅ妸娴滄粓鏌￠崘鎸庡闁汇埄鍨辩敮鐔兼倶閸愵喗鈷戠紓浣癸公閼版寧绻涙担鍐插椤╃兘鏌ㄩ弴鐐诧拷褰掑磻閵婏负浜滈柡宥冨劚閿熻姤顨堝褔鏁撴禒瀣拺缂備焦眉缁堕亶鏌涢敐蹇曠М闁绘侗鍣ｉ獮鎺楀箠閾忣偅顥堥柡浣规尰缁傛帞锟斤綆浜為、鍛存⒑鐟欏嫬鍔跺┑顔哄�濋幃陇绠涢幘顖涙杸闂佺粯顭堢亸娆戠不缂佹ü绻嗙紓浣靛灩濞呭秹鏌＄仦绋垮⒉鐎垫澘瀚换婵嬪礃閵婏附鐣肩紓鍌氬�烽懗鍓佸垝椤栨粍宕查柛宀�鍋涢悡婵嬫煙閹规劦鍤欓柛銊ュ�归妵鍕籍閸屾稒鐝悷婊呭閻撯�愁潖缂佹ɑ濯撮柣鎴灻▓宀勬⒑閹肩偛锟芥牠鎮ч悩鑽ゅ祦闊洦绋掗弲鎼佹煥閻曞倹瀚�?
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleId));
					return true;
				}
			}.submit();
		}else{
			new PInbornWithValidProc(roleId, apId).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800445;

	public int getType() {
		return 800445;
	}

	public int id;
	public byte flag; // 0默认方式  1=一键

	public CUpdateInborn() {
	}

	public CUpdateInborn(int _id_, byte _flag_) {
		this.id = _id_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUpdateInborn) {
			CUpdateInborn _o_ = (CUpdateInborn)_o1_;
			if (id != _o_.id) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUpdateInborn _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


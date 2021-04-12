
package fire.pb.fushi.redpack;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendRedPackView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendRedPackView extends __CSendRedPackView__ {
	@Override
	protected void process() {
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氫即宕戞繝鍌橈拷鎺撶節濮橆厾鍘甸梺缁樺灦閿曗晛鈻撻弮鍌滅＜闁跨喓鏅敓鏂ょ秵閸嬪懘宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌ゆК缂傚倸鍊哥粔鎾晝閵堝鍋╅柣鎴ｅГ閸婅崵绱掑☉姗嗗剱闁哄拑缍佸娲濞戣京鍙氱紓浣哄У閸ㄥ潡銆侀弮鍫濋唶闁哄洨鍟块幏娲⒑閸涘﹥宕勯悘蹇旂懇瀹曘垹鈽夐姀锛勫幈闁诲函缍嗛崑鍛暦瀹�鍕厵闁惧浚鍋呭畷宀�锟借娲滈…鍫ｇ亙婵炶揪绲介幖顐︾嵁瀹ュ棔绻嗛柣鎰典簻閿熻姤鐗曡灋濞达綀鍊藉☉銏犵妞ゆ牗姘ㄩˇ顕�姊洪棃娑氬妞わ缚鍗抽幃锟犳偄閸忚偐鍙嗗┑鐘绘涧濡瑩藟閻樼數纾奸柣姗�娼ф禒褔鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级缁挸鐣锋导鏉戝唨妞ゆ挻绮ｉ幏閿嬫媴閼叉繃姊归幏鍛存偡闁讣鎷烽幘鍓佺＜闁绘劦鍓氱欢鍙夈亜閿旇棄顥嬮柨鐔诲Г閼瑰墽绱炴繝鍥ц摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new PSendRedPackView(roleid,modeltype,redpackid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812532;

	public int getType() {
		return 812532;
	}

	public int modeltype; // 红包类型
	public java.lang.String redpackid; // 红包Id  用来处理分页

	public CSendRedPackView() {
		redpackid = "";
	}

	public CSendRedPackView(int _modeltype_, java.lang.String _redpackid_) {
		this.modeltype = _modeltype_;
		this.redpackid = _redpackid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(modeltype);
		_os_.marshal(redpackid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modeltype = _os_.unmarshal_int();
		redpackid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendRedPackView) {
			CSendRedPackView _o_ = (CSendRedPackView)_o1_;
			if (modeltype != _o_.modeltype) return false;
			if (!redpackid.equals(_o_.redpackid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modeltype;
		_h_ += redpackid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modeltype).append(",");
		_sb_.append("T").append(redpackid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


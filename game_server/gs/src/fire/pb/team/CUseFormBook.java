
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUseFormBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告柨鎽滅槐鎺楁倷椤掞拷閸斻倖銇勯鐘插幋鐎殿喖顭烽幃銏ゆ偂鎼达綆鍞归梻渚�锟芥稑宓嗘繛浣冲啠鏋旀い鎾跺Х绾捐棄銆掑顒婃敾閻庢俺顫夌换婵嬪閿濆棛銆愰梺娲诲幖椤︾敻鐛箛娑欏�婚柤鎭掑劚閸擃剟姊洪崨濠勨槈闁挎洏鍊濋、鏃堝醇閺囩啿鎷绘繛杈剧到閹诧繝宕悙瀵哥閻犲泧鍛殼閻庤娲橀崹鍨暦閻旂⒈鏁嶆慨妯诲敾缁遍亶鏌ｆ惔锛勭暛闁稿酣浜堕獮濠冨緞閹邦剛鍝楁繛瀵稿Т椤戝棝鎮￠悢闀愮箚妞ゆ牗渚楅崕銉╂煕閵堝拋鍎戦柨鐔凤拷鐕佹綈闁诡喖鐖煎畷鏇㈡偨缁嬭儻鎽曢梺鎸庣箓閹叉﹢寮崼鐔告婵炲濮撮鍡涘疾濠靛洢浜滈煫鍥ㄦ尭椤忣偊鏌￠崱顓犵暤闁哄瞼鍠撻敓鑺ョ♁椤洦淇婇崶顒佺厸闁跨喕濮ょ粋鎺旓拷锝庡亞閸橀亶姊洪棃娑辨缂佽弓绮欏畷婵嗏枎閹寸姷锛滈梺闈涱焾閸庢椽鎮￠崗鍏煎弿濠电姴鍟妵婵堬拷瑙勬处閸嬪﹤鐣烽悢纰辨晣濠㈣泛鑻埢鍫ユ煛鐏炲墽娲寸�殿噮鍓熷畷绋课旈敓钘夘嚕閺夎鏃堟偐闂堟稐绮堕梺鎸庢处娴滄粓鎮惧畡閭︽建闁跨喕濮ゆ穱濠囧箹娴ｅ壊娼婇梺鏂ユ櫅閸燁垰顭块幋婵冩斀闁挎稑瀚禍濂告煕婵犲啰澧悡銈夋煛瀹ュ海浠滄繛鎴炃氶弸搴ㄦ煙閹碱厼鐏￠悗姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷
 * @author changhao
 *
 */
public class CUseFormBook extends __CUseFormBook__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		for (fire.pb.team.UseFormBook book : listbook)
		{
			new PUseFormationItem(roleid, formationid, book.bookid, book.num).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794553;

	public int getType() {
		return 794553;
	}

	public int formationid; // 光环ID by changhao
	public java.util.LinkedList<fire.pb.team.UseFormBook> listbook; // 使用的光环书 by changhao

	public CUseFormBook() {
		listbook = new java.util.LinkedList<fire.pb.team.UseFormBook>();
	}

	public CUseFormBook(int _formationid_, java.util.LinkedList<fire.pb.team.UseFormBook> _listbook_) {
		this.formationid = _formationid_;
		this.listbook = _listbook_;
	}

	public final boolean _validator_() {
		for (fire.pb.team.UseFormBook _v_ : listbook)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(formationid);
		_os_.compact_uint32(listbook.size());
		for (fire.pb.team.UseFormBook _v_ : listbook) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		formationid = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.team.UseFormBook _v_ = new fire.pb.team.UseFormBook();
			_v_.unmarshal(_os_);
			listbook.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUseFormBook) {
			CUseFormBook _o_ = (CUseFormBook)_o1_;
			if (formationid != _o_.formationid) return false;
			if (!listbook.equals(_o_.listbook)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += formationid;
		_h_ += listbook.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(formationid).append(",");
		_sb_.append(listbook).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


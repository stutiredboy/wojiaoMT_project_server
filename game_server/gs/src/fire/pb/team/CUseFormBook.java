
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUseFormBook__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸斿摜绱掗悙顒�鍔ゆい顓犲厴瀵鎮㈤悡搴ｎ唹闂侀�涘嵆濞佳冣枔椤撶姷纾藉〒姘攻鐎氳绻濋姀锝嗙【闁活厼顦甸獮蹇涙倻閼恒儱鍓梺鍛婄☉閿曘倝顢旈崼鏇熲拻濞达絽鎲￠崯鐐寸箾鐠囇呯暤鐎规洘鍨垮畷鐔碱敍濮樻唻绱遍柣搴＄畭閸庨亶骞婃径鎰哗濞寸姴顑嗛悡鐔镐繆椤栨侗鍎ラ柛銈咁儑閿熷�燁潐閹爼宕曢悽绋胯摕闁挎繂鎲橀弮鍫熸櫢濞寸姴顑嗛弲婵囥亜韫囨挸顏柡鍡畵閺岀喓锟芥稒顭囨俊鍥煛閿熻姤绂掔�ｎ偆鍘遍梺闈涱檧缁蹭粙宕濆▎鎴犵＜闁靛鍎洪悡鍏兼叏婵犲啯銇濈�规洦鍋婂畷鐔碱敇婢跺苯鈻堥柡灞剧洴瀵剟宕稿Δ锟藉鏉课旈悩闈涗粶闁挎洦浜滈悾宄邦潨閿熻姤淇婇幖浣割潊闁斥晛鍟鎴濃攽閿涘嫬浜奸柛濠冪墪鐓ら柡宥庣仜濞戞ǚ鏋庨柟鎼灡鐎氳鎱ㄥΟ鐓庝壕閻庢熬鎷�
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


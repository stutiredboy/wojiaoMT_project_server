
package fire.pb.fushi;
import gnet.link.Role;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CConfirmCharge__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/***
 * 缂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礃閹偤骞栧ǎ顒�濡奸柣顓燁殜楠炴牕菐椤掞拷婵¤偐绱掗幇顓ф畷缂佺粯鐩獮瀣枎韫囨洖濮堕梻浣芥〃缁�浣该洪妶澶婄厴闁硅揪闄勯崑鎰版倵閸︻厼孝妞ゃ儲绻勭槐鎾寸瑹婵犲啫顏堕梻浣侯焾閻ジ宕戦悙鐑樺亗闁哄洨鍠撶粻楣冩煙鏉堝墽绋婚柣婵愪邯閹顫濋悙顒�顏�??
 * @author changhao
 *
 */
public class CConfirmCharge extends __CConfirmCharge__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		new PPayConfirm(roleid, role.getUserid(), this).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812456;

	public int getType() {
		return 812456;
	}

	public int goodid;
	public int goodnum;
	public java.lang.String extra;

	public CConfirmCharge() {
		extra = "";
	}

	public CConfirmCharge(int _goodid_, int _goodnum_, java.lang.String _extra_) {
		this.goodid = _goodid_;
		this.goodnum = _goodnum_;
		this.extra = _extra_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(goodid);
		_os_.marshal(goodnum);
		_os_.marshal(extra, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		goodid = _os_.unmarshal_int();
		goodnum = _os_.unmarshal_int();
		extra = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CConfirmCharge) {
			CConfirmCharge _o_ = (CConfirmCharge)_o1_;
			if (goodid != _o_.goodid) return false;
			if (goodnum != _o_.goodnum) return false;
			if (!extra.equals(_o_.extra)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += goodid;
		_h_ += goodnum;
		_h_ += extra.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(goodid).append(",");
		_sb_.append(goodnum).append(",");
		_sb_.append("T").append(extra.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


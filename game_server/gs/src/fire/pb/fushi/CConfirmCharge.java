
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
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槰闂佽鍨抽崑銈夌嵁閺嶎灔搴敆閿熻姤淇婃總鍛婄厽妞ゆ挾鍣ュ▓婊勵殽閻愬澧懣鎰亜閹虹偞瀚规繝寰枫倕浜圭紒杈ㄥ浮楠炲洭顢樿閻ｉ绱撴担铏瑰笡闁烩晩鍨堕悰顔撅拷锝庝簴閺嬪酣鐓崶銊︾濠殿喖鐖煎缁樻媴閼恒儯锟藉啰绱掗敓鑺ユ媴鐠囥儲妞芥俊鑸靛緞婵犲嫬骞嬮梻浣侯攰閹活亪姊介崟顖氱；闁规壆澧楅崐鐢告煕閿旇骞栫�涙繂顪冮妶鍐ㄥ姕缂佽瀚Σ鎰板箻鐎靛摜鎳濇繝鐢靛Т閸燁偊顢旈崼鏇熲拻濞达絼璀﹂悞楣冩煟椤掞拷閵堢鐣烽幋锔藉�烽柣鎴灻禍妤呮⒑閸濆嫭宸濋柛鐘虫尵缁粯銈ｉ崘鈺冨幍闁哄鐗嗘晶鐣岀矙婵犳碍鐓熸繝鍨姃闁垶鏌熼绛嬫當妞ゎ偅绻堥幃娆擃敆閿熶粙顢旈敓锟�??
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


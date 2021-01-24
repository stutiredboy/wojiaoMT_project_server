
package fire.msp.title;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyTitle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyTitle extends __GNotifyTitle__ {
	@Override
	protected void process() {
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		if(null == role.getScene()) return;
		role.setMyTitleInfo(title);
		// 閺夆晜蓱鐎垫粓宕㈤悢鍛婇檷闁汇劌瀚粊锔剧矙鐎ｎ亜鐎诲☉鎾卞�栧顖氣槈閸喍绱栭悹褍搴滅槐婵囩閵夈儲鍊甸柛娆樺灥閸忔ɑ瀵煎Ο鍝勵嚙闁瑰瓨鍔掔粩鎾级閳╁啰啸闁诡収鍨界槐婵囩▔瀹ュ牏绠栭梻锟�?閻熸洑绀侀褰掑箣妞嬪寒浼傞梺鏉跨Т閹孩寰勯崟顓熷��
		if (title.titleid > 0){
			final fire.pb.title.SOnTitle onTitle = new fire.pb.title.SOnTitle();
			onTitle.roleid = roleid;
			onTitle.titleid = title.titleid;
			onTitle.titlename = title.titlename;
			role.sendAround(onTitle);
		}
		else{
			final fire.pb.title.SOffTitle offTitle = new fire.pb.title.SOffTitle();
			offTitle.roleid = roleid;
			role.sendAround(offTitle);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 732897;

	public int getType() {
		return 732897;
	}

	public long roleid;
	public fire.msp.showtitleinfo title;

	public GNotifyTitle() {
		title = new fire.msp.showtitleinfo();
	}

	public GNotifyTitle(long _roleid_, fire.msp.showtitleinfo _title_) {
		this.roleid = _roleid_;
		this.title = _title_;
	}

	public final boolean _validator_() {
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(title);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		title.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyTitle) {
			GNotifyTitle _o_ = (GNotifyTitle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!title.equals(_o_.title)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += title.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(title).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


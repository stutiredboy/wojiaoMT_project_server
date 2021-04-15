
package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeGem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
// 套装点化
public class CChangeGem extends __CChangeGem__ {
	public static final Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		new PChangeGem(roleId, tanzhuangKey, xilianshiTypeId).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810491;

	public int getType() {
		return 810491;
	}

	public int tanzhuangKey; // 要转换宝石的itemKey
	public int xilianshiTypeId; // 要转换宝石的itemId

	public CChangeGem() {
	}

	public CChangeGem(int _tanzhuangKey_, int _xilianshiTypeId_) {
		this.tanzhuangKey = _tanzhuangKey_;
		this.xilianshiTypeId = _xilianshiTypeId_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(tanzhuangKey);
		_os_.marshal(xilianshiTypeId);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		tanzhuangKey = _os_.unmarshal_int();
		xilianshiTypeId = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeGem) {
			CChangeGem _o_ = (CChangeGem)_o1_;
			if (tanzhuangKey != _o_.tanzhuangKey) return false;
			if (xilianshiTypeId != _o_.xilianshiTypeId) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += tanzhuangKey;
		_h_ += xilianshiTypeId;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(tanzhuangKey).append(",");
		_sb_.append(xilianshiTypeId).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeGem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = tanzhuangKey - _o_.tanzhuangKey;
		if (0 != _c_) return _c_;
		_c_ = xilianshiTypeId - _o_.xilianshiTypeId;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


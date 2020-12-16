
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SAttentionGoods__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SAttentionGoods extends __SAttentionGoods__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810659;

	public int getType() {
		return 810659;
	}

	public int attentype; // ��ע״̬ 1����2��ʾ
	public long id; // Ψһid(�Ƿ��������ݿ��id)
	public int attentiontype; // ��ע���� 1��ע  2ȡ����ע
	public int itemtype; // 1��ͨ���� 2���� 3װ��

	public SAttentionGoods() {
	}

	public SAttentionGoods(int _attentype_, long _id_, int _attentiontype_, int _itemtype_) {
		this.attentype = _attentype_;
		this.id = _id_;
		this.attentiontype = _attentiontype_;
		this.itemtype = _itemtype_;
	}

	public final boolean _validator_() {
		if (attentiontype < 1 || attentiontype > 2) return false;
		if (itemtype < 1 || itemtype > 3) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(attentype);
		_os_.marshal(id);
		_os_.marshal(attentiontype);
		_os_.marshal(itemtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		attentype = _os_.unmarshal_int();
		id = _os_.unmarshal_long();
		attentiontype = _os_.unmarshal_int();
		itemtype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SAttentionGoods) {
			SAttentionGoods _o_ = (SAttentionGoods)_o1_;
			if (attentype != _o_.attentype) return false;
			if (id != _o_.id) return false;
			if (attentiontype != _o_.attentiontype) return false;
			if (itemtype != _o_.itemtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += attentype;
		_h_ += (int)id;
		_h_ += attentiontype;
		_h_ += itemtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(attentype).append(",");
		_sb_.append(id).append(",");
		_sb_.append(attentiontype).append(",");
		_sb_.append(itemtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SAttentionGoods _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = attentype - _o_.attentype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(id - _o_.id);
		if (0 != _c_) return _c_;
		_c_ = attentiontype - _o_.attentiontype;
		if (0 != _c_) return _c_;
		_c_ = itemtype - _o_.itemtype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


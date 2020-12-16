
package fire.pb.item;
import fire.pb.WorldTime;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CItemLoseEffect__ extends mkio.Protocol { }

/** ��ƷʧЧ
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CItemLoseEffect extends __CItemLoseEffect__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				ItemMaps bag = Module.getInstance().getItemMaps(roleid, packid, false);
				if (bag == null)
					return false;
				ItemBase item = bag.getItem(itemkey);
				if (item == null) 
					return false;
				if (packid == BagTypes.EQUIP && item instanceof EquipItem)
					((Equip)bag).onUnequip((EquipItem)item);
				if (Math.abs(WorldTime.getInstance().getTimeInMillis() - item.getDataItem().getLoseeffecttime()) < 60*1000) {
					item.onTimeout();
					return true;
				}
				else {
					item.sendTimeout();
					return true;
				}
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787439;

	public int getType() {
		return 787439;
	}

	public int packid;
	public int itemkey;

	public CItemLoseEffect() {
	}

	public CItemLoseEffect(int _packid_, int _itemkey_) {
		this.packid = _packid_;
		this.itemkey = _itemkey_;
	}

	public final boolean _validator_() {
		if (packid <= 0) return false;
		if (itemkey <= 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(packid);
		_os_.marshal(itemkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		packid = _os_.unmarshal_int();
		itemkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CItemLoseEffect) {
			CItemLoseEffect _o_ = (CItemLoseEffect)_o1_;
			if (packid != _o_.packid) return false;
			if (itemkey != _o_.itemkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += packid;
		_h_ += itemkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(packid).append(",");
		_sb_.append(itemkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CItemLoseEffect _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = packid - _o_.packid;
		if (0 != _c_) return _c_;
		_c_ = itemkey - _o_.itemkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


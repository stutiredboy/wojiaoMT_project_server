
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRuneGive__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRuneGive extends __CRuneGive__ {
	@Override
	protected void process() {
		// protocol handle
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紭闂佽法鍠愰崹婵嬫倿閿旂偓宕叉繝闈涱儏閻愬﹤顪冪�ｎ亝鎹ｉ柍绗哄�曢埞鎴︽偐椤旇偐浼囬梺绯曟櫆閻楃姴鐣峰┑瀣嵆闁绘鏁搁悞鍏肩節閵忥絾纭炬い鎴濆閹广垽宕卞☉娆戝帾闂佸壊鍋呯换鍐闯瑜版帗鐓涢柛鈩兩戠粈瀣煛瀹�瀣М妤犵偞甯￠獮瀣敍濠靛棙鍎撻梻鍌欑閹碱偊鎯屾径宀�绀婂〒姘炬嫹闁绘侗鍣ｅ畷鍫曨敆婢跺娅撻梻浣稿悑娴滀粙宕曢弻銉﹀剨閹艰揪绲跨壕浠嬫煕鐏炲墽鎳嗛柛蹇撹嫰閳规垿顢氶敓钘夘焽瑜戦悘瀣⒑閸涘﹤濮﹂柛鐘崇墵閹锋垿鎮㈤崗鑲╁帾婵犵數鍋熼崑鎾斥枍閸涱垳纾兼い鎰╁灮鏁堥梺鍝勬湰閻╊垱淇婇悜绛嬫晩闁告瑣鍎村鎼佹⒒娴ｇ儤鍤�濠⒀呮櫕閸掓帡顢涢悙鏉戜簵闂佺粯姊婚崢褏绮昏ぐ鎺撶厵缁炬澘宕獮鏍煟韫囥儳绡�闁诡喗顨呴～婵嬫倷椤掞拷椤忥拷
		final long selfroleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(selfroleid < 0) {
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return fire.pb.clan.srv.ClanManage.sendCRuneGive(selfroleid,roleid,givetype,givevalue,itemkey,bagtype);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808509;

	public int getType() {
		return 808509;
	}

	public long roleid;
	public int givetype; // 捐赠类型  0活力  1道具
	public int givevalue; // 物品code
	public int itemkey; // 物品key
	public int bagtype; // 背包类型

	public CRuneGive() {
	}

	public CRuneGive(long _roleid_, int _givetype_, int _givevalue_, int _itemkey_, int _bagtype_) {
		this.roleid = _roleid_;
		this.givetype = _givetype_;
		this.givevalue = _givevalue_;
		this.itemkey = _itemkey_;
		this.bagtype = _bagtype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(givetype);
		_os_.marshal(givevalue);
		_os_.marshal(itemkey);
		_os_.marshal(bagtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		givetype = _os_.unmarshal_int();
		givevalue = _os_.unmarshal_int();
		itemkey = _os_.unmarshal_int();
		bagtype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRuneGive) {
			CRuneGive _o_ = (CRuneGive)_o1_;
			if (roleid != _o_.roleid) return false;
			if (givetype != _o_.givetype) return false;
			if (givevalue != _o_.givevalue) return false;
			if (itemkey != _o_.itemkey) return false;
			if (bagtype != _o_.bagtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += givetype;
		_h_ += givevalue;
		_h_ += itemkey;
		_h_ += bagtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(givetype).append(",");
		_sb_.append(givevalue).append(",");
		_sb_.append(itemkey).append(",");
		_sb_.append(bagtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRuneGive _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = givetype - _o_.givetype;
		if (0 != _c_) return _c_;
		_c_ = givevalue - _o_.givevalue;
		if (0 != _c_) return _c_;
		_c_ = itemkey - _o_.itemkey;
		if (0 != _c_) return _c_;
		_c_ = bagtype - _o_.bagtype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


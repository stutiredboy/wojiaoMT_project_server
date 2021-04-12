
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
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑喘闂備浇娉曢崰鎰板垂濠靛鍊块柨鏃傚亾瀹曞弶绻濋棃娑卞剰闁绘劕锕ら—鍐拷锝庝簼閹癸綁鏌嶇粭鍝勶拷鏇㈠煘閹达附鍋愭い鏃囧亹娴煎洭姊虹化鏇熸珕闁绘濮撮悾宄扳攽鐎ｎ亜宓嗛梺缁橆焽閺佹悂鎮為崗鑲╃瘈闁靛骏绲剧涵鐐亜閹存繂顏柟骞垮灲瀹曞崬鈽夊▎鎴濆妇闂備礁澹婇崑鍛崲閸愵喖闂憸鐗堝笚閻撴盯鏌涢埄鍏╂垹绮堢�ｎ喗鐓涚�癸拷鐎ｎ剛袦濡ょ姷鍋炵敮锟犵嵁鐎ｎ噮鏁嶆繝闈涙閸庢捇姊婚崒娆戭槮闁圭⒈鍋婇幆灞惧緞瀹�锟界粈濠傘�掑鐐闂佺粯渚楅崳锝呯暦閸洦鏁嗗璺侯儐濞呮捇姊绘担绋挎倯濞存粈绮欏畷鏇㈠蓟閵夛箑鍓ㄩ柟鑹版彧缁茶法澹曟禒瀣厱閻忕偛澧介幊鍡涙煕韫囨捁瀚伴柍瑙勫灴椤㈡岸鏁撻挊澶樼劷鐟滄垿鎮樼�ｎ喗鈷戦柛娑橈工婵箓鏌涢悩宕囧⒌闁归攱鍨块幃銏ゅ礂閼测晛甯惧┑鐘垫暩閸嬬喖宕戦幘鏂ユ瀺闁告侗鍨崇壕鍏笺亜閹扳晛鐏弫鍫ユ⒑閸濆嫭婀伴柣鈺婂灡娣囧﹪鎮滅粵瀣櫓闂佸憡鐟ｉ崕鏉戭瀶閹间焦鈷掑ù锝囧劋閸わ拷婵犫拃鍛珪闁告帗甯￠、娑㈡倷閺夋垳绨甸梻浣虹帛濮婂宕㈣缁槒銇愰幒鎾跺幍缂佺偓婢樺畷顒勭嵁閺嶎厽鐓熼煫鍥ュ劤缁★拷闂佽鍠楅〃鍛达綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�
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


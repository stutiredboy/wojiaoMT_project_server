
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
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戝枠闂傚倷娴囧▔鏇㈠窗閹版澘鍨傛繝闈涱儐閸婂潡鏌ㄩ弮鍌氫壕鐎规洖寮剁换婵嬫濞戝崬鍓伴梺缁樺姇閿曘倝鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺屽秶绮崫鍕舵嫹閺囥垹鐓橀柟杈鹃檮閸嬫劖銇勯弮鍥т汗濞寸厧娲铏瑰寲閺囩喐鐝曢梺缁橆殘婵挳鎮惧畡鎵虫斀閻庯綆浜滃畵鍡涙⒑缂佹﹩鐒介柡浣规倐閹偤宕楅懖鈺冪槇闂侀潧楠忕徊鍓ф兜閻愵兙浜滈柟瀛樼箓椤忣偊鏌熼獮鍨伈鐎规洖宕埥澶娾枎閹存繂濡囬梻鍌欑婢瑰﹪宕戦崨顖涘床闁告劦鍠栭梻顖滄喐閻楀牆绗氶柣鎾寸洴閺屾盯鍩勯崗鈺傚灩缁牏锟斤綆鍠楅悡娑氾拷鐧告嫹閻庯綆鍓涜ⅵ婵°倗濮烽崑鐐垫暜閿熺姷宓侀悗锝庡櫘閺佸秵绻濋棃娑欘棡闁稿孩鎹囧濠氬磼濞嗘埈妲梺鍦拡閸嬪﹪骞嗙仦鎯х窞鐎癸拷閿熺晫绮堟繝鍌橈拷鎺戭潩閻愵剙顏堕梻浣虹帛娓氭宕抽敐鍛殾闁割偅娲﹂弫鍡楊熆鐠轰警鍎愭繛鍛崌濮婄粯鎷呯粙鎸庡�繛瀛樼矆缁瑥鐣烽弴銏犺摕闁靛绠戦崜銊╂煙閼圭増褰х紒鑼舵硶婢规洘绂掔�ｎ偆鍘遍柣蹇曞仜婢т粙骞婇崱娑欑厱闊洦鎹佺�氫即鏌嶇憴鍕伌妞ゃ垺宀搁弫鎾绘寠婢舵鍔烽悷婊勫灴閹锟斤綆鍠楅埛鎴︽煕濞戞﹫宸ュ┑顕嗙畵閺屾盯鎮╁畷鍥р拰闂佸綊鏀遍崹鍧楀箖閵忋倕绀傞柤娴嬫櫅鐢儳鈹戦悩鍨毄闁稿鍠栧畷鎴﹀箻閺傘儲鐎洪梺鍛婁緱閸ㄥ磭澹曢崗绗轰簻闁规壋鏅涢悘顕�寮崼銉︹拺闁告繂瀚﹢浼存煟閳哄﹤鐏″ǎ鍥э躬閹粎绮电�ｎ偅娅撻梻浣告啞閻燂綁宕曢弶鎴�堕柟闂寸劍閳锋帒霉閿濆洤鍔嬮柛銈忔嫹濠电姭鎷冮崨顔界彧闂佸憡甯楃敮锟犮�佸☉銏″�烽柡澶嬪灣缁ㄧ敻姊绘担铏瑰笡婵﹤顭峰畷銏ｎ槾缂侇喗妲掗妵鎰板箳閹捐泛骞嶇紓浣哄亾濠㈡ê鐣烽鍕祦闁哄稁鍘介悡鐔肩叓閸ャ儱鍔ょ紒鈽呮嫹闂備浇顕栭崰妤呫�冮崨杈剧稏婵犻潧顑嗛崐閿嬨亜閹虹偞瀚瑰銈呴獜閹凤拷
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


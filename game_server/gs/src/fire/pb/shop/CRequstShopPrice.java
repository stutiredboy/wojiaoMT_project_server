
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequstShopPrice__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequstShopPrice extends __CRequstShopPrice__ {
	@Override
	protected void process() {
		// protocol handle

		final gnet.link.Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		
		long roleid = role.getRoleid();
		
		if (!fire.pb.shop.srv.floating.FileterFloatingShop.getInstance().isFloatingOne(shopid)) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				java.util.ArrayList<fire.pb.shop.Goods> goodsList = fire.pb.shop.srv.floating.FloatingOneManager.getInstance()
						.getGoodsAndPrice(shopid);
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓涢崚鎺戠暆閸曗晪鎷烽崒姣椽顢旈崨顏呭闂備浇濮ら敋妞わ富鍨跺鎶芥偄閸忚偐鍘遍梺缁樏壕顓熸櫠閻㈢鎷峰▓鍨灈妞ゎ厼鍢查锝夊箻椤旇棄浜滈梺鎯х箺椤曟牠宕惔銊︹拻濞达絿顭堥ˉ蹇涙煟閹惧磭澧︾�规洑鍗冲浠嬪Ω瑜忚ぐ楣冩⒑閸涘﹥澶勯柛瀣舵嫹闂佺尨鎷峰ù鐘差儐閻撶喖鏌熼柇锕�澧紒鐙欏洦鐓冪紓浣股戠粈锟介梻鍥ь槹缁绘繃绻濋崒姘间紑闂佹椿鍘界敮鐐烘晸閸婄噥娼愭繛鍙夛耿閺佸啴濮�閵堝懏鐎梺鐟板⒔缁垳锟界數濮撮…鍧楁嚋閻亝鍨归敓浠嬫涧閻倸顫忓ú顏咁棃婵炴垶鑹鹃。鍝勨攽閳藉棗浜濇い銊ユ楠炲牓濡搁埡浣猴紲闂佺粯鍔曢顓㈠储鏉堛劎绡�闁汇垽娼у瓭闂佸摜濮甸懝楣冨煝閹炬剚鐓ラ柛顐ゅ枔閸樺憡绻涙潏鍓у埌闁硅姤绮岄悺顓熶繆閻愵亜锟姐倝宕㈣ぐ鎺戠闁瑰瓨绻勯弳锔芥叏濡ゅ瀚归梺杞扮劍閸旀瑥鐣烽崡鐐嶇喓绱掑Ο鐓庣闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢舵劖鐓涢柛銉㈡櫅閸撻亶鏌涢妶鍡樼闁哄本鐩、鏇㈡晲閸℃瑣锟藉繑绻濋姀锝嗙【妞ゎ収鍓熼幃锟犲Ψ閳哄倻鍘遍梺鍝勬储閸斿矂鐛Ο姹囦簻闁哄喛鎷锋繛鑼枛瀵鏁愰崱妯哄妳闂侀潧绻嗛幊鍥ь瀶閵娾晜鈷戦柟绋块閸濇椽鏌＄仦鍓р槈闁宠鍨剁换婵嬪礃閸欍儱鎽嬮梻鍌欐祰濞夋洟宕版惔銊︽櫢闁伙絽鑻▍蹇旂箾閸忕厧濮堢紒缁樼洴楠炴捇骞掗弮鍌ゅ晪闁诲氦顫夊ú妯好洪悢鑲烘盯宕橀妸銏☆潔濠殿喗锕╅崢浠嬵敊閺囥垺鈷掑ù锝呮啞鐠愶繝鏌涙惔娑橈拷婵嬪Υ閸愵喖骞㈡繛鎴烆焽閿涙瑩姊虹紒妯虹伇濠殿喓鍊濆畷鎰版偨閸涘﹦鍘介梺闈涚箚濡插懘宕箛娑欑厽闁圭儤鏌ㄦ禍鐐亜閵婏絽鍔﹂柟顔界懇閹崇娀顢栭搴″閸欏繐鈹戦悩鎻掝伀閻㈩垱鐩弻鐔风暋閻楀牆娈楅悗瑙勬磸閸斿秶鎹㈠┑瀣窛妞ゆ牭绲鹃弫銈夋⒒閸屾艾锟界兘鎮為敃鍌氱？鐎规洖娲﹀畷鏌ユ煙閹殿喖顣奸柣鎿勬嫹闂備焦瀵х换鍌炲箠閹版澘姹查柨鏇炲�归悡娆撴煕閹捐尪鍏岄柟钘夊�块弻鈩冩媴闂堚晞鍚梺鍝勬湰閻╊垱鎱ㄩ敓浠嬫煟濞嗘瑦瀚瑰┑鈩冨絻缂嶅﹪寮婚敐澶婄厸濠电姴鍊绘禒鎼佹⒑缂佹ü绶遍柛鐘冲哺閺佹捇寮妶鍥┬ｉ梺鍝ュУ椤ㄥ﹤鐣烽幇鐗堢叆閻庯絻鍔嬬花濠氭椤愩垺澶勯柟鍛婃倐瀵娊鎮㈤崗鑲╁幗闂佸疇妗ㄧ欢姘跺矗閸曨剚鍙忓┑鐘插鐢稓绱掔紒妯肩畺闁诡垱妫冮崹楣冩嚑椤掑倹鏅ㄦ繝鐢靛Х閺佹悂宕戝☉銏″剳濞村吋娼欓崹鍌炴煢濡警妲洪柡鍡畵閺岋繝宕堕妷銉т痪闂佹悶鍊栭崹鍫曞Φ閸曨垰绠抽柟鎼灡閺侀箖鏌ｆ惔顫孩妞ゎ偄顦甸獮鍫ュΩ閵夊海鍠栭幃鈩冩償濠靛棭妫滈梻浣筋嚙鐎涒晠鎮㈤鍕闁跨噦鎷�
				mkdb.Procedure.psendWhileCommit(roleid, new SResponseShopPrice(shopid, goodsList));
				
				return true;
			}
		}.submit();

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810635;

	public int getType() {
		return 810635;
	}

	public int shopid; // 商店序号

	public CRequstShopPrice() {
	}

	public CRequstShopPrice(int _shopid_) {
		this.shopid = _shopid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(shopid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		shopid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequstShopPrice) {
			CRequstShopPrice _o_ = (CRequstShopPrice)_o1_;
			if (shopid != _o_.shopid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += shopid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(shopid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequstShopPrice _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = shopid - _o_.shopid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

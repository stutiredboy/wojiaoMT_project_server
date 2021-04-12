
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChamberOfCommerceShop__ extends mkio.Protocol { }

/** 商会买卖协议
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChamberOfCommerceShop extends __CChamberOfCommerceShop__ {
	@Override
	protected void process() {
		// protocol handle
		final gnet.link.Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;

		fire.pb.shop.SGoods goods = fire.pb.shop.Module.sGoodsMap.get(goodsid);
		if (null == goods) {
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐烘煙閸忕厧濮嶉柡灞剧洴瀵剙鈻庨幆褍澹庨梻浣筋嚃閸犳銆冮崨杈剧稏婵犻潧顑愰弫鍥煟閹邦剙绾ч柟铏懇濮婄粯鎷呴崨濠冨創闂佸搫鐗滈崜娆戝弲濠碘槅鍨拃锕傚吹濡ゅ懏鐓曢柡鍥ュ妼閻忕娀姊洪崡鐐村缂佺粯绻堝Λ鍐ㄢ槈濞嗘ɑ顥ｆ俊鐐�ら崑鍛枈瀹ュ洦宕叉繝闈涱儐閸嬨劑姊婚崼鐔衡棩缂侇喖鐖煎娲偡閺夋寧姣愰梻浣稿簻缂嶄線鐛崱妤冩殕闁告洦鍋嗛敍婊堟⒑缂佹ê濮岄悘蹇ｄ邯楠炴寮撮悙鈺傛杸闂佺粯鍔栧娆撴倶閿曞倹鍤曢柕鍫濐槹閻撴盯鏌ㄩ悢璇残撶紒鍌涘笧閿熸枻缍嗛崑鍡涘储閸楃偐鏀介柣鎰綑閻忋儳锟借娲﹂崜鐔煎箖濮楋拷閺屽棗顓奸崱娆忓箞闂備胶绮ú鏍磹閸︻叏鎷峰鐐" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤銆冮崨绮癸拷锕傚Ω閳轰線鍞跺┑鐘绘涧閻楀繐鐣烽崼鏇熲拺缁绢厼鎳庢禍褰掓偠濞戞牕鍔︾�规洖缍婇獮鍡氼槷婵℃彃鐗撻弻鏇＄疀閺囩倫銉╂煟椤愩垹顏慨濠呮缁瑩骞愭惔銏″濠电偞鎸荤喊宥夈�冮崨绮癸拷锕傚炊椤掍礁浜滈梺绋跨箰閻ㄧ兘骞忓ú顏呪拺闁告稑锕︾粻鎾绘倵濮橆剙妲婚崡閬嶆煕濠靛嫬鍔ょ痪鎯с偢閺屾洘绻涢悙顒佺彃闂佽褰冩晶浠嬫晸閼恒儺鍟忛柛鐘崇墵閳ワ箓鎮滈挊澶嬬�梺鍛婂姦閸犳牜澹曢崗鑲╃闁瑰鍋犳竟姗�鎮介娑辨疁婵﹦绮幏鍛村传閵夛妇锟筋喖鈹戦埄鍐︿粻闁告柨娴烽崚鎺楀醇閻旇櫣鎳濋梺璺ㄥ枙濡嫰顢氶敐澶婄闁兼亽鍎遍敓鐣屽厴閺岋綁濮�閵忊剝姣勯梺鎸庣♁缁挸顫忛搹鍦＜婵☆垰娴氭禍顏勭暦椤栫偛鍨傛い鏃�鑹剧紞濠囥�佸鑸垫櫢濞寸姴顑呴拑鐔兼煟閺冨倵鎷￠柡浣革躬閺屻倕霉鐎ｎ偅鐝栨俊銈嗘閺岋絾鎯旈妶搴㈢秷濠电偛寮堕悧鐘诲箖閵夆晛绀傞梻鍌氼嚟缁犳岸姊虹紒妯虹伇婵☆偄瀚弫顕�姊绘笟锟藉褔藝椤撱垹纾挎繛鎴欏灩缁狅絾绻濋棃娑樻殲闁哄偊鎷烽梻鍌欒兌缁垶鏁冮埡鍛；闁告侗鍠栭崹鏂棵归悡搴ｆ憼闁绘挻娲熼弻鐔兼嚋椤掞拷婵¤姤绻涢崨顓熷櫣闂囧鏌ｅΟ鎸庣彧閻忓骏绠撻弻鐔碱敊缁涘鐣奸梺鐟板级閹稿啿鐣烽悢纰辨晢闁稿本顨嗛弲顒勬⒒閸屾瑨鍏岄柟铏崌瀹曠敻寮介鐐殿唵闂佽法鍣﹂幏锟�?.shopid:" + shopid + "goodsid:" + goodsid);
			return;
		}

		fire.pb.shop.utils.ShopParameters params = new fire.pb.shop.utils.ShopParameters();
		params.role = new fire.pb.PropRole(role.getRoleid(), true);
		params.goods = goods;
		params.num = num;
		params.shopId = shopid;
		params.itemkey = itemkey;

		if (buytype == ShopBuyType.CHAMBER_OF_COMMERCE_SHOP_BUY) {
			new fire.pb.shop.srv.BuyShopFactory(params, buytype).submit();
		} else if (buytype == ShopBuyType.CHAMBER_OF_COMMERCE_SHOP_SALE) {
			new fire.pb.shop.srv.SaleShopFactory(params, buytype).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810634;

	public int getType() {
		return 810634;
	}

	public int shopid; // 商店序号
	public int itemkey; // 是物品在背包中的位置,在卖背包中物品时用到。叫itemkey是为了和系统统一称呼。
	public int goodsid; // 商品id
	public int num; // 买卖数量
	public int buytype; // 购买类型

	public CChamberOfCommerceShop() {
	}

	public CChamberOfCommerceShop(int _shopid_, int _itemkey_, int _goodsid_, int _num_, int _buytype_) {
		this.shopid = _shopid_;
		this.itemkey = _itemkey_;
		this.goodsid = _goodsid_;
		this.num = _num_;
		this.buytype = _buytype_;
	}

	public final boolean _validator_() {
		if (goodsid < 0) return false;
		if (num < 1) return false;
		if (buytype < 0 || buytype > 11) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(shopid);
		_os_.marshal(itemkey);
		_os_.marshal(goodsid);
		_os_.marshal(num);
		_os_.marshal(buytype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		shopid = _os_.unmarshal_int();
		itemkey = _os_.unmarshal_int();
		goodsid = _os_.unmarshal_int();
		num = _os_.unmarshal_int();
		buytype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChamberOfCommerceShop) {
			CChamberOfCommerceShop _o_ = (CChamberOfCommerceShop)_o1_;
			if (shopid != _o_.shopid) return false;
			if (itemkey != _o_.itemkey) return false;
			if (goodsid != _o_.goodsid) return false;
			if (num != _o_.num) return false;
			if (buytype != _o_.buytype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += shopid;
		_h_ += itemkey;
		_h_ += goodsid;
		_h_ += num;
		_h_ += buytype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(shopid).append(",");
		_sb_.append(itemkey).append(",");
		_sb_.append(goodsid).append(",");
		_sb_.append(num).append(",");
		_sb_.append(buytype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChamberOfCommerceShop _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = shopid - _o_.shopid;
		if (0 != _c_) return _c_;
		_c_ = itemkey - _o_.itemkey;
		if (0 != _c_) return _c_;
		_c_ = goodsid - _o_.goodsid;
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		_c_ = buytype - _o_.buytype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


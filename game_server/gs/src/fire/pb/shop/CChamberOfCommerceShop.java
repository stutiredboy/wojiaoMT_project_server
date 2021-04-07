
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
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閹兼劙鏌涢弬娆惧剶闁诡喗顨呴～婵嬵敇閻愬弶鎳欓梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠闁卞洦绻濋棃娑欘棞妞ゎ偅纰嶇换婵嬫偨闂堟稐绮堕梺鐟板暱闁帮綁骞嗗畝鍕＜闁绘劘灏幗鏇炩攽閻愭潙鐏﹂懣銈夋煛閿熻姤绂掔�ｎ偆鍘卞┑鐐村灥瀹曨剟鎮橀柆宥嗙厱闁绘洖鍊圭�氾拷" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞顨呴…銊╁醇濠靛牏宕堕梺纭呭亹鐞涖儵宕归幆褉妲堥柕蹇曞Х閻嫰姊虹粙鎸庢拱濞撴碍顨呴…鍥偄閸忓皷鎷洪梺鍛婄箓鐎氬嘲危閸濄儳纾奸柕濞炬櫃閹插墽锟芥鍠栭…鐑藉极閸愵喖纾兼繛鎴炶壘鐢姊绘担鍝ユ瀮婵℃ぜ鍔庣划鍫熺瑹閿熻棄顕ｉ幎鑺ュ�烽柣銏㈡暩閿涙粓姊虹紒妯忣亪宕崹顔氬綊顢氶敓浠嬪蓟閻旂⒈鏁婇柤娴嬫櫇妤旈柣搴ゎ潐濞叉牠鎮ラ崗闂寸箚闁绘垼妫勫敮闂侀潧顦崕娑㈠箣濠靛啯鏂�闂佺粯锕╅崑鍛垔娴煎瓨鐓曢柟鑸妽濞呭懎霉閻樿櫕灏﹂柟顔筋殘閹叉挳宕熼鍌楁晬闂備胶鎳撻崵鏍箯閿燂拷?.shopid:" + shopid + "goodsid:" + goodsid);
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


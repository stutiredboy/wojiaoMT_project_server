
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CExchangeShop__ extends mkio.Protocol { }

/** 兑换商店协议
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CExchangeShop extends __CExchangeShop__ {
	@Override
	protected void process() {
		// protocol handle
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
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣侯攰閹活亞绮婚幋锕�鍨傞柛宀�鍋為崑锝呂旈敂钘夘嚋妞ゅ繒濞�閺岋繝宕遍鐘垫殼闂佸搫鐭夌槐鏇熺閿旂偓瀚氶柟缁樺笒椤捇姊绘担鍦菇闁稿鍊濆畷鎶芥晲婢跺﹨鎽曞┑鐐村灟閸ㄥ綊鎮炲ú顏呯厱闁归偊鍠栨禍楣冩煟閿濆懌鍋㈡慨濠冩そ瀹曨偊宕熼澶嬶紒婵＄偑鍊戦崝灞轿涘☉銏犵闁靛繒濮Σ鍫熸叏濮楀棗浜濋柛鏇炲暟缁辨挻鎷呴崜鎻掑壈闂佽绻戠换鍫ュ春濞戞瑥绶炲┑鐐靛亾閺傦拷闂備胶绮悷銉╁箠韫囨洩鎷峰鎰佹綈缂佺粯绋掑蹇涘礈瑜庨崑褔姊虹粙璺ㄦ槀闁稿﹥顨婇弫鎾绘嚍閵壯屾殹閻庣櫢鎷烽柟闂寸閽冪喖鏌￠崶鈺佹灁闁绘繆鍩栭妵鍕冀閵娿劌顥濋梺鍝勬閿曨亪寮婚悢铏圭煓闁圭楠稿▓妤�鈹戦纭锋敾婵＄偠妫勮灋闁告劦鍠栭悡娑㈡煕鐏炴儳鍤ù纭锋嫹?.shopid:" + shopid + "goodsid:" + goodsid);
			return;
		}

		fire.pb.shop.utils.ShopParameters params = new fire.pb.shop.utils.ShopParameters();
		params.role = new fire.pb.PropRole(role.getRoleid(), true);
		params.goods = goods;
		params.num = num;
		params.shopId = shopid;
		
		if (buytype == ShopBuyType.EXCHANGE_BUY) {
			new fire.pb.shop.srv.BuyShopFactory(params, buytype).submit();
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810655;

	public int getType() {
		return 810655;
	}

	public int shopid; // 商店序号
	public int goodsid; // 商品id
	public int num; // 买卖数量
	public int buytype; // 购买类型

	public CExchangeShop() {
	}

	public CExchangeShop(int _shopid_, int _goodsid_, int _num_, int _buytype_) {
		this.shopid = _shopid_;
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
		_os_.marshal(goodsid);
		_os_.marshal(num);
		_os_.marshal(buytype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		shopid = _os_.unmarshal_int();
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
		if (_o1_ instanceof CExchangeShop) {
			CExchangeShop _o_ = (CExchangeShop)_o1_;
			if (shopid != _o_.shopid) return false;
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
		_h_ += goodsid;
		_h_ += num;
		_h_ += buytype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(shopid).append(",");
		_sb_.append(goodsid).append(",");
		_sb_.append(num).append(",");
		_sb_.append(buytype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CExchangeShop _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = shopid - _o_.shopid;
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


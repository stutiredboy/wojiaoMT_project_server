
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
			mkdb.Trace.info("濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇－濮婃寧绻濋姀锝呯厫闁告梹鐗犻幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫帡藟閻愮儤鐓欓柛蹇曞帶婵秹鏌＄仦鍓ф创鐎殿噮鍓欓埢搴ㄥ箚瑜嶆竟搴ㄦ⒒娴ｇ瓔鍤冮柛鐘愁殜閵嗗啴宕ㄦ潏鍓х◤濠电娀娼ч鎰板极閸ヮ剚鐓熼柟閭﹀墮缁狙囨煙閾忣偆鎳囨慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備礁鎼悧婊堝礈濞嗘垵寮叉繝纰樻閸垳鎷冮敃鍌氬惞婵°倕鎳忛悡鏇㈡煛閸ャ儱濡奸柣蹇曞█濮婃椽宕￠悙鏉戭槱缂備胶绮换鍫澪涢崘銊㈡婵炲棙蓱椤ワ絾淇婇悙顏勶拷銈夊磻閸涱垰鏋堢�广儱娲﹀畷鍙夌節闂堟侗鍎愰柛瀣ㄥ姂濮婂宕奸悢琛℃）缂備緡鍠栭悥鐓庮潖濞差亝鍋￠柡澶嬪濮ｆ劙姊绘担绋跨盎缂傚秳绶氶悰顕�宕卞Δ鍐╂畷闂佸憡娲﹂崑鍡涙晬濠婂牊鈷戠紓浣姑慨宀勬倶韫囷絼閭鐐搭殜瀵挳鎮欓埡鍌涙澑闂備胶绮崝鏍ь焽濞嗘挻鍊堕柨鏇炲�归崵鏇㈡煏閸繍妲归柣鎾寸洴閺屻劑鎮㈢拠娈嬫挾绱掗崒娑樼闁跨喐鏋荤紞鍡涘磻閸℃稑鍌ㄩ柛妤冨亹閺�浠嬫煟閹邦厽缍戦柣蹇嬪劤閿熷�燁潐濞诧箓宕滈悢鐓庣畺婵鎷烽柡灞芥椤撳ジ宕卞▎蹇撶疄闂傚倷鑳剁划顖毭洪弽顓炵９闁革富鍙忛幏宄邦潩閻愵剙顏�" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閵嗗啴宕ㄧ划鐧告嫹閿曞倸惟闁宠桨绶氶崬璺衡攽閻樼粯娑ч柣妤�绻愰悾鐑藉醇閺囩啿鎷虹紒缁㈠幖閹冲孩绂嶈ぐ鎺撳仩婵炴垶鐗曢崝锔撅拷瑙勬礀缂嶅﹪鐛崱姘兼Х濠碘剝褰冮悧鎾诲蓟閺囷紕鐤�闁哄洨鍊妷鈺傜厽妞ゆ劑鍨归顓熸叏婵犲懏顏犵紒顔界懇楠炴劖鎯旈姀鈥愁伆婵犵數鍋為幐鑽ゅ枈瀹ュ锟藉啴宕ㄧ划鐧告嫹閿曞倸鐐婃い鎺嶇娴滄粓姊虹粙璺ㄧ闁汇劎鍏橀獮蹇撁洪鍛嫼闂佸憡绋戦敃锔剧不閹剧粯鍊垫慨姗嗗墮濡插宕￠柆宥嗙厱婵犻潧瀚崝銈囩棯閹佸仮闁哄本娲樼换娑㈡倷椤掍胶褰冮梻浣筋潐瑜板啯鏅舵禒瀣櫢闁兼亽鍎洪崯蹇涙煕閻樺磭澧甸柍銉畵閹粓鎸婃径瀣拷顒勬⒑閸涘﹤濮﹂柛鐘崇墱婢规洟宕楅懖鈺冾啎闂佺懓顕崑鐘崇珶濮楋拷閹粙顢涘☉杈ㄧ杹濠殿喖锕︾划顖炲箯閸涙潙浼犻柕澶涘閿熺瓔鍠栭埞鎴﹀焺閸愶缚绮婚梺鍛婃煥濞寸兘宕氶幒妤�閱囬柣鏃囨閹虫繈姊虹捄銊ユ灆婵☆偄瀚伴、姘舵晲婢跺﹦顔呴梺鍏间航閸庨亶鏁撻悾灞藉幋闁哄矉缍佹慨锟介柕蹇婂墲濮ｅ嫰姊洪幐搴ｂ檨缂侇喗鎸搁～蹇涙惞閸︻厾锛滃┑鈽嗗灠濞存碍绂嶉鍕殾妞ゆ牜鍋涢崹鍌涖亜閺冿拷閼瑰墽绱炴繝鍥ワ拷浣割潩閼稿灚娅㈡繛瀵稿Т椤戝懘鎷戦悢鍏肩厽闁哄啫鍊甸幏锟犳煛娴ｉ潻韬柡灞诲�曢湁閻庯綆鍋呴悵鏍ㄤ繆閵堝棙顥堥柡宀嬬稻閹棃濡舵惔銏㈢Х婵犵數鍋涘鍫曟偋閻樿绠栭柕澶嗘櫅缁�鍌炴⒒閸屾凹鍤熺紒鐘冲哺濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氼剟寮锟藉缁樼瑹閿熻棄顭囪钘濇い鎾卞灩绾炬寧绻涢幋娆忕仼缂佺媴绲剧换婵嬫濞戞ɑ娈查梺鍝勫亰閹风兘姊婚崒娆掑厡缂侇噮鍨堕弫鍐煛閸涱厾锛涢梺鍛婁緱閸犳牠宕归弬妫靛綊鎮℃惔锝嗘喖闂佺粯鎸诲ú鐔煎蓟閻斿吋鍤嬫い鎺炴嫹濠德ゅГ缁绘盯宕ㄩ鐔锋闂傚洤顦甸弻锝呂熼幐搴ｅ涧闁诲繐楠忕粻鎾诲蓟閻旂⒈鏁婄紒娑橆儐閻ｅジ姊洪悷鏉跨骇闁圭鍟块悾鐑芥偄绾拌鲸鏅㈤梺绋挎湰椤ㄥ棝寮查鍕拻闁稿本鐟ㄩ崗宀勬煙閾忣偅宕岀�规洜鏁诲浠嬵敇閻愭鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?.shopid:" + shopid + "goodsid:" + goodsid);
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


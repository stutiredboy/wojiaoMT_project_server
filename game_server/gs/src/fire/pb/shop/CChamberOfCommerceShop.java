
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
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄闁诲繑宀稿畷瀹狀槾缂佽鲸鎸婚幏鍛矙濞嗙偓娈洪梻浣侯焾椤戝啴宕愬┑鍡╁殨閻犲洦绁村Σ鍫ユ煏韫囨洖顫嶉柕濠忚礋娴滄粓鏌￠崘銊ワ拷鍝ユ暜閼哥偣浜滄い鎰枑濞呭洨绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹂梻鍌氬�风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌熼幑鎰【濠殿噮鍓熼弻銊╂偄閸撲胶鐓撳┑顔硷工椤嘲鐣烽幒鎴僵闁告鍎愰弶鍝ョ磽閸屾瑧顦︽い鎴濇閺侇噣鏁撻悩鍙夌�悗骞垮劚椤︻垳鐚惧澶嬬厱妞ゆ劑鍊曢弸鏃堟煕濮楋拷缁犳牕顫忓ú顏勪紶闁告洖鐏氭瓏婵犵數鍋涢ˇ鏉棵哄Ο鑲╃焿闁圭儤顨呴～鍛存煏閸繃锛嶆慨濠冨缁绘繈濮�閿濆懐鍘梺鍛婃⒐閻楃娀骞冮敓鐘参ㄩ柨鏂垮⒔閻﹀牓姊婚崒姘卞缂佸甯¤棢闁绘劗鍎ら悡娆撴煕韫囨洖甯跺┑顔肩Ч閺岋紕浠﹂崜褎鍒涢悗娈垮櫘閸撴瑩鍩㈡惔銊ョ畾鐟滃秵绔熸惔銊︹拻濞达絿鐡旈崵鍐煕閻樻剚娈滈柕鍡楀暣瀹曘劍娼忛崜褏鈼ゆ繝鐢靛█濞佳囶敄閹版澘鏋侀柛銉墯閻撶喖鏌熼柇锕�澧紒鐙欏洦鐓欓柧蹇ｅ亞閹冲洦鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶉梻鍌欑閹碱偊鎮у鍫濈婵炲棙鍨靛鍙夌節绾版ɑ顫婇柛顭戝灣閹峰啴鏁冮崒姘優濠德板�曢幊蹇涙偂閺囥垺鐓涢柛銉ｅ劚婵″ジ鏌ｈ箛鏇炩枅婵﹥妞藉畷锟犳倷閺夋埈妲辩紓鍌欒兌缁垳鎹㈤崼婢盯宕橀妸銏☆潔濠电偛妫欒摫妞ゃ儻绲炬穱濠囨倷椤忓嫸鎷烽妶澶婄；闁告侗鍨伴弸鍫拷骞垮劚濞诧箑鐣烽崣澶岀瘈闂傚牊渚楅崕鎰版煕鐎ｃ劌濮傛慨濠傤煼瀹曞ジ鎮㈢悰鈩冿級缂傚倷绶￠崰鏍偉閻撳寒娼栨繛宸簼閸嬶繝鏌℃径瀣嚋婵絾鍔欏缁樻媴缁嬭法鐩庣紓鍌氱С缁舵岸鎮伴锟藉畷鍗炍旈崘鈺傜暦闂備礁鎲″ú锕傚磻閸℃稒鏅繝濠傜墛閳锋垹绱撴担濮戭亝鎱ㄥ畝鍕�堕煫鍥风导闁垱顨ラ悙鎼疁鐎殿喗鎸抽幃娆撳煛閸屾稒婢戦梻鍌欒兌缁垶宕濋弽褜鐒芥繛鍡樻尰閸婂爼鏌ㄩ弴鐐诧拷褰掑吹閺囥垺鐓忛柛顐ｇ箥濡插綊鏌ｉ幘瀵告创闁哄被鍔戦幃銏㈡嫚濞堝鎸剧槐鎺楀磼濞戞顑傞梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戦崒銊╂煕濡ゅ啫浜归柡锟芥禒瀣厽闁归偊鍘界紞鎴︽煟韫囧鍔ら柨鐔凤拷鐕佹綈婵炶绠撳畷婊堟偄閻撳海鐣哄┑顔筋殣閹风兘鏌＄仦鑺ヮ棞妞ゆ挸銈稿畷鍗炩枎韫囨挾鐤勯梻鍌氬�烽懗鍓佸垝椤栨娲冀椤撶偟锛欓梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柕鍡楀暣瀹曘劎鍒掗惂鍛婂闁挎洖鍊告儫闂佸疇妗ㄧ欢姘跺船鐠鸿　鏀介柣妯肩帛濞懷囨煟濡わ拷缁绘劙鎮鹃悜钘夐唶闁哄洨鍟块幏铏圭磼缂併垹骞栭柟鍐插缁傚秷銇愰幒鎾充哗濠电偞鍨堕悧鏇㈠礉閿旀拝鎷风憴鍕缂傚秴锕悰顕�宕卞鍏夹ユ繝纰樺墲瑜板啴鎮ч幘璇茶摕闁哄浄绱曢悿锟介梺鍝勬川閸婎偊濡烽埡鍌滃幗濡炪倖鍔戦崹褰掝敂椤撶喐鍙忓┑鐘叉噺椤忕姷绱掗鐣屾噰妤犵偞鍔栭幆鏃堝閳ユ剚浼嗗┑鐘垫暩閸嬬偤骞愰懡銈呮瀳鐎广儱顦敓钘夊暣瀹曘劎鍒掗惂鍛婂闁挎洖鍊搁悙濠冦亜閹哄秶顦﹀ù婊勭矒濮婅櫣绮欑捄銊ь唶闂佹眹鍔庨崗姗�鐛箛鎾佹椽顢旈崨顏呭闂備礁鎲＄粙鎴︽晝閿斿墽涓嶉柟鍓х帛閸婂灚鎱ㄥ鍡楀婵℃彃顭峰畷锟犳焼瀹ュ棛鍘卞┑鐘绘涧鐎氼剟宕濋妶鍥╂／闁诡垎浣镐划闂佸搫鏈ú妯兼崲濞戙垺鍊锋い鎺嶈兌瑜板啴姊绘担绛嬫綈鐟滄澘鍟弲鑸电鐎ｎ偅娅㈤梺鍏间航閸庢椽宕箛娑欑厱闁绘ê纾晶鐢告煃閵夘垳鐣甸柟顔界矒閹稿﹥寰勭�ｎ剨鎷烽鍕拺闁告稑锕ゆ慨锕傛煕閻樺磭澧卞瑙勬礋瀹曟鎳栭埡鍐惧晭闂備胶鎳撻顓㈠磻閻樺磭鐝舵慨妤嬫嫹闁诡喕绮欓、娑樷槈鏉堛劎鏉规繝娈垮枛閿曪妇鍒掗鐐茬闁告稒娼欐导鐘绘煏婢舵稑顩柨鐔虹摂閸犳牠鍩為幋锕�鐒洪柛鎰剁細缁姊洪崨濠冪叆婵炲鍏樺畷姘跺箳濡わ拷闁卞洭鏌ｉ弮鍥仩闁硅櫕绻堝铏规崉閵娿儲鐏嗗┑鈽嗗亜鐎氫即銆佸鑸垫櫜濠㈣泛锕﹂鍛存⒑閸忛棿鑸柛搴ㄤ憾閺佹捇鎮剧仦钘夊箣闂佸搫鐭夌紞浣规叏閿熶粙鏌曡箛濠傚⒉婵絽瀚板娲箰鎼达絺妾ㄧ紓渚囧枟閹告悂锝炶箛娑欐優闁革富鍘鹃敍婊冣攽閳藉棗鐏犳繛瀛樼缁傚秹顢旈崟顓熸濡炪倖鐗滈崑娑㈠垂閸屾稏浜滈柡鍐挎嫹闁肩懓澧界槐鐐寸節閸ャ儻鎷锋担鍓叉僵闁肩鐏氬▍銏＄箾鐎电孝妞ゆ垵鎳橀幏鎴︽偄閸忚偐鍘介梺鍝勫暙閸婄敻骞忛敓鐘崇厸濞达綁娼婚煬顒勬煛鐏炶锟芥洟婀侀柣搴秵閸嬪懘鎮甸弽銊ょ箚闁靛牆妫欓ˉ鍫ユ煛瀹�瀣ɑ闁诡垱妫冩俊鑸垫償閵忋垻啸濠电姷鏁搁崑娑橆嚕閸洘鍋嬮柣妯款嚙缁犳牠鏌曟径鍡樻珔缂侊拷閸岀偞鈷掗柛灞惧嚬閸ょ喓绱掗悩鍐插摵婵﹨娅ｇ槐鎺懳熼搹閫涚礃婵犵妲呴崑鍕拷姘煎墴瀵偊顢氶敓钘夘潖缂佹鐟归柨鐔绘椤洩顦归挊婵囥亜閹惧崬鐏╃痪鐐缁绘盯骞嬪▎蹇曚患缂備胶濯寸徊鍓ф崲濠靛顥堟繛鎴炆戝▓鏌ユ⒑閸濆嫬浜伴柟椋庡厴濮婂宕掑▎鎺戝帯缂備緡鍣崹鍫曞极閸愵喖鐓涢柛娑卞幘閿涙盯姊洪崨濠佺繁闁哥姵鐗犲畷褰掑棘濡潧缍婇幃鈩冩償閿濆棙鍠栭梻浣虹帛閹歌煤閻旂厧钃熼柣鏂垮悑閸ゅ銇勯幒鐐村婵犲痉銈呅撶紒缁樼洴瀹曘劑顢橀悢閿嬵仩闂傚倸娲らˇ鐢稿蓟閿濆憘鐔煎箰鎼达絽娑ч梺璇茬箰妤犲繒绮婚幘璇茶摕闁绘梻鈷堥弫濠勭磼濞戞﹩鍎愰柣锝呫偢濮婃椽鎮烽弶璺ㄩ獓闂佸湱顭堥崯鍧楁偩閻戣姤鍋勭痪鎷岄哺閺呫垽姊虹粙鎸庢拱妞ゃ劌妫濆鏌ヮ敆閸曨兘鎷婚梺绋挎湰閻熴劑宕楀畝鍕厵闁惧浚鍋呭畷宀�锟借娲滈弫璇差嚕娴犲鏁囬柣鎰問閸炵敻姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?.shopid:" + shopid + "goodsid:" + goodsid);
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


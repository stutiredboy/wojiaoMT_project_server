
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
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄闁诲繑宀稿畷瀹狀槾缂佽鲸鎸婚幏鍛矙濞嗙偓娈洪梻浣侯焾椤戝啴宕愬┑鍡╁殨閻犲洦绁村Σ鍫ユ煏韫囨洖顫嶉柕濠忚礋娴滄粓鏌￠崘銊ワ拷鍝ユ暜閼哥偣浜滄い鎰枑濞呭洨绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹂梻鍌氬�风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌熼幑鎰【濠殿噮鍓熼弻銊╂偄閸撲胶鐓撳┑顔硷工椤嘲鐣烽幒鎴僵闁告鍎愰弶鍝ョ磽閸屾瑧顦︽い鎴濇閺侇噣鏁撻悩鍙夌�悗骞垮劚椤︻垳鐚惧澶嬬厱妞ゆ劑鍊曢弸鏃堟煕濮楋拷缁犳牕顫忓ú顏勪紶闁告洖鐏氭瓏婵犵數鍋涢ˇ鏉棵哄Ο鑲╃焿闁圭儤顨呴～鍛存煏閸繃锛嶆慨濠冨缁绘繈濮�閿濆懐鍘梺鍛婃⒐閻楃娀骞冮敓鐘参ㄩ柨鏂垮⒔閻﹀牓姊婚崒姘卞缂佸甯¤棢闁绘劗鍎ら悡娆撴煕韫囨洖甯跺┑顔肩Ч閺岋紕浠﹂崜褎鍒涢悗娈垮櫘閸撴瑩鍩㈡惔銊ョ畾鐟滃秵绔熸惔銊︹拻濞达絿鐡旈崵鍐煕閻樻剚娈滈柕鍡楀暣瀹曘劍娼忛崜褏鈼ゆ繝鐢靛█濞佳囶敄閹版澘鏋侀柛銉墯閻撶喖鏌熼柇锕�澧紒鐙欏洦鐓欓柧蹇ｅ亞閹冲洦鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶉梻鍌欑閹碱偊鎮у鍫濈婵炲棙鍨靛鍙夌節绾版ɑ顫婇柛顭戝灣閹峰啴鏁冮崒姘優濠德板�曢幊蹇涙偂閺囥垺鐓涢柛銉ｅ劚婵″ジ鏌ｈ箛鏇炩枅婵﹥妞藉畷锟犳倷閺夋埈妲辩紓鍌欒兌缁垳鎹㈤崼婢盯宕橀妸銏☆潔濠电偛妫欒摫妞ゃ儻绲炬穱濠囨倷椤忓嫸鎷烽妶澶婄；闁告侗鍨伴弸鍫拷骞垮劚濞诧箑鐣烽崣澶岀瘈闂傚牊渚楅崕鎰版煕鐎ｃ劌濮傛慨濠傤煼瀹曞ジ鎮㈢悰鈩冿級缂傚倷绶￠崰鏍偉閻撳寒娼栨繛宸簼閸嬶繝鏌℃径瀣嚋婵絾鍔欏缁樻媴缁嬭法鐩庣紓鍌氱С缁舵岸鎮伴锟藉畷鍗炍旈崘鈺傜暦闂備礁鎲″ú锕傚磻閸℃稒鏅繝濠傜墛閳锋垹绱撴担濮戭亝鎱ㄥ畝鍕�堕煫鍥风导闁垱顨ラ悙鎼疁鐎殿喗鎸抽幃娆撳煛閸屾稒婢戦梻鍌欒兌缁垶宕濋弽褜鐒芥繛鍡樻尰閸婂爼鏌ㄩ弴鐐诧拷褰掑吹閺囥垺鐓忛柛顐ｇ箥濡插綊鏌ｉ幘瀵告创闁哄被鍔戦幃銏㈡嫚濞堝鎸剧槐鎺楀磼濞戞顑傞梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戦崒銊╂煕濡ゅ啫浜归柡锟芥禒瀣厽闁归偊鍘界紞鎴︽煟韫囧鍔ら柨鐔凤拷鐕佹綈婵炶绠撳畷婊堟偄閻撳海鐣哄┑顔筋殣閹风兘鏌＄仦鑺ヮ棞妞ゆ挸銈稿畷鍗炩枎韫囨挾鐤勯梻鍌氬�烽懗鍓佸垝椤栨娲冀椤撶偟锛欓梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠戦埞鎴﹀磼濠婂海鍔稿銈庡亜閹虫﹢寮诲澶娢ㄩ柕澶堝劜濮ｆ劗绱撴担闈涘Ω闁稿酣娼ч～蹇曠磼濡顎撴繛鎾村嚬閸ㄩ亶寮鐐粹拺閻熸瑥瀚妵鐔访瑰鍛户闁告帗甯楃换婵嗩潩椤掑偆鍚呴梻浣瑰濞测晠骞忛悜鑺ョ厱闁靛鍎遍敓钘夋健瀵鈽夊Ο鍏兼畷闂佽法鍠嶇划娆忕暦閹达附鍊烽柛婵嗗閿涙盯姊洪幐搴ｇ畵闁瑰弶锕㈠顕�宕奸悢鍛婄彆闂備浇濮ら敋妞わ缚绮欏畷鐢碉拷锝庝憾濞撳鏌曢崼婵囧櫧缂佺姴鍟块埞鎴︽倻閸ャ劌顏堕梻鍌欑閹碱偊鎯屾径灞惧床婵犻潧妫涢弳锕傛⒑椤掞拷缁嬩線寮崶顒佺厽婵☆垵娅ｆ禒娑欑箾閸縿鍋㈡慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備焦妞块崢濂杆囬崡鐐嶏綁骞囬弶鍨祮闂佺粯鏌х拃锕�霉閸曨垱鈷戦柟绋垮閳锋帡鏌涚�ｎ偅灏甸柨鐔诲Г绾板秴鐣濋幖浣歌摕闁绘棁娅ｇ壕鍏间繆椤栨繃顏犻柣鐔村妼椤啴濡舵惔鈥茬凹闂佸湱鎳撳ú銈夛綖韫囨洜纾兼俊顖濐嚙椤庢捇姊洪棃鈺佺槣闁告ü绮欓幊锝夊炊椤掍讲鎷虹紓浣割儐椤戞瑩鎮炴ィ鍐╃厱濠电姴鍟扮粻鎾绘煟閿濆洤鍘存鐐查叄閹崇偤濡烽敂鐣屽礁婵犵數濮伴崹鐓庘枖濞戙垺鏅濋柕濞炬櫅缁犳椽鏌￠崶鈺佷汗闁猴拷娴犲鐓熼柟閭﹀幗缂嶆垿鏌ｈ箛鏇炴灈闁哄本鐩俊鎼佸Ψ瑜忔闂備浇顕栭崰姘跺磻濞戞艾寮叉俊鐐�曠换鎰板箠閹版澘鍌ㄩ梺顒�绉甸埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑㈡偐瀹曞洤顫х紓浣稿�哥粔鐢稿Χ閿濆绀冮柍鍝勫暙楠炴姊绘担鐟邦嚋缂佽鍊块獮濠傜暆閸曨偆锛涢梺闈涚箚閸撴繈宕ｈ箛鎾斀闁绘ɑ褰冮弳鐐烘煏閸ャ劎绠橀柨鐔凤拷鐕佹綈婵炶绠撳畷鎴炵節閸屾粍娈鹃梺缁樻⒒閳峰牓寮崱妤婄唵閻犺桨璀﹂崕婊呯磼鏉堛劌绗掗柍瑙勫灴閺佸秹宕熼鈩冩線闂備胶顭堥敃銉╁垂閸喚鏆︽繝闈涚墔濞岊亪寮堕悙鏉戭嚋缂佸鍨块崺銉﹀緞閹邦剦娼婇梺缁樕戦鏍船瑜版帗鈷掑〒姘炬嫹婵炰匠鍛床闁圭儤鎸婚崣蹇斻亜閹捐泛锟斤綁鏁愭径濠囧敹闂佺粯姊婚…鍫濐嚕閸喒鏀芥い鏃傜摂濞堟梹淇婇锝庢畷缂佸倸绉撮埞鎴狅拷锝庡亞閸橀亶姊洪崫鍕窛闁稿鐩鎶芥偄閾忓湱锛滈柡澶婄墑閸斿秶浜告导瀛樼厵鐎瑰嫮澧楅崵鍥╋拷瑙勬礃缁捇鐛幘璇茬闁瑰瓨绻嶅Λ鍫ユ⒒閸屾艾锟藉嘲霉閸ヮ剦鏁嬬憸蹇涘箲閵忋倕绠ｉ柣妯哄暱鎼村﹪姊洪崜鎻掍簴闁稿酣浜跺浼村Ψ閿斿墽顔曢梺鐟邦嚟閸嬬喖骞婇崘顏嗙＜闁告挷绀佹禒婊堟煃鐟欏嫬鐏撮柟顔界懇濡啫鈽夊Δ锟介ˉ姘舵⒒娴ｅ憡鎯堥柛瀣躬楠炲繘鎮滈懞銉㈡嫽闂佺鏈悷銊╁礂瀹�锟界槐鎺楊敋閸涱厾浠搁梺璇″枤閸忔ɑ淇婇悜钘夌厸濞达綀娅ｉ弸鍐⒒婵犲骸浜滄繛璇х畱鐓ら柍鍝勬噹缁狀垳锟界懓瀚伴崑濠傤焽閳哄懏鐓欏Λ棰佽兌閸斿秶绱撳鍛ⅱ缂佽鲸鎸婚幏鍛存惞閻熸壆顐肩紓鍌欑椤戝棛鏁幒妞伙拷锕傚炊椤忓棛鏉稿┑鐐村灦椤洭藝椤撱垺鍋℃繝濠傚暣閸欏嫮锟借娲橀崹濂杆囩憴鍕弿濠电姴鎳忛鐘电磼椤旂晫鎳呴柟鐟板婵℃悂鏁傜粵瀣秱闂傚倸鍊烽懗鍫曗�﹂崼銉︽櫇闁靛鏂傞敓钘夊暞缁绘繈宕惰閻庮剟姊洪悷鏉库挃缂侇噮鍨跺畷闈涱吋婢跺鍘繝銏ｎ嚃閸ㄤ即寮甸锟介埢鎾广亹閹烘挾鍘介柟鑹版彧缁查箖顢旈悢鍏肩厵濡炲楠搁崢鎾煛瀹�锟介崰鏍ь潖閼姐倧鎷烽棃娑橆棌婵″樊鍣ｅ娲寠婢跺﹥娈堕梺鍝ュУ閻楃姴顕ｆ繝姘櫢闁绘灏欓崐鐐烘⒑鐎圭姵銆冮柣鎺炵畵閹ɑ绗熼敓钘夘潖閾忓湱纾兼俊顖濆亹閻ｉ箖姊虹化鏇熸珕闁绘濮垫穱濠囨偨缁嬭法顦板銈嗙墬閼归箖宕妸鈺傗拺闂傚牊渚楅悞楣冩煕閺傝法鐒搁挊鐔哥節闂堟侗鍎愰柍閿嬪灴閺屾稑鈹戦崱妤婁痪濡炪們鍎茬划鎾诲蓟閵娾晛鍗抽柕濞垮�濋崑妤呮倵濞堝灝鏋涙い顓犲厴楠炲啴濮�閵堝棙鍎梺闈╁瘜閸橀箖宕㈤鐐粹拻濞达絽鎲＄拹鈩冦亜椤撶偟澧涙い銊ｅ劤缁瑦鎯旈幘瀵镐簴婵犲痉鏉匡拷褔骞忛悜鑺ョ厓閻熸瑥瀚悘瀛樸亜閵忥紕鎳呮繛鎴犳暬閺屻劎锟斤綆鍋呭В搴♀攽閻樻鏆滅紒杈ㄦ礋瀹曟垿鎮╅崣鍌涚洴瀹曠喖顢欓崣銉х秿闂傚倸鍊风粈渚�骞夐敓鐘茬闁挎洖鍊哥粣妤呮煛瀹ュ骸骞楅柛瀣�圭换娑㈠箣濞嗗繒浠鹃梺缁樻尰濞茬喖骞冨锟介幃娆撳级閹存繂袘闂備焦鎮堕崐銈夊礈濞嗘挻绠掔紓浣鸿檸閸欏啴寮ㄦ潏鈺嬫嫹濮樼偓瀚�?.shopid:" + shopid + "goodsid:" + goodsid);
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


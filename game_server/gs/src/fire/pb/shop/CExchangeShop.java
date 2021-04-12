
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
			mkdb.Trace.info("濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉哥紓鍌欑椤戝棛鏁敓鐘叉瀬鐎广儱顦猾宥夋煕椤愩倕鏋旈柛姗�绠栧娲传閸曞灚歇濠电偛顦板ú妯肩矉閹烘顫呴柕鍫濇－濮婃寧绻濋姀锝呯厫闁告梹鐗犻幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫帡藟閻愮儤鐓欓柛蹇曞帶婵秹鏌＄仦鍓ф创鐎殿噮鍓欓埢搴ㄥ箚瑜嶆竟搴ㄦ⒒娴ｇ瓔鍤冮柛鐘愁殜閵嗗啴宕ㄦ潏鍓х◤濠电娀娼ч鎰板极閸ヮ剚鐓熼柟閭﹀墮缁狙囨煙閾忣偆鎳囨慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備礁鎼悧婊堝礈濞嗘垵寮叉繝纰樻閸垳鎷冮敃鍌氬惞婵°倕鎳忛悡鏇㈡煛閸ャ儱濡奸柣蹇曞█濮婃椽宕￠悙鏉戭槱缂備胶绮换鍫澪涢崘銊㈡婵炲棙蓱椤ワ絾淇婇悙顏勶拷銈夊磻閸涱垰鏋堢�广儱娲﹀畷鍙夌節闂堟侗鍎愰柛瀣ㄥ姂濮婂宕奸悢琛℃）缂備緡鍠栭悥鐓庮潖濞差亝鍋￠柡澶嬪濮ｆ劙姊绘担绋跨盎缂傚秳绶氶悰顕�宕卞Δ鍐╂畷闂佸憡娲﹂崑鍡涙晬濠婂牊鈷戠紓浣姑慨宀勬倶韫囷絼閭鐐搭殜瀵挳鎮欓埡鍌涙澑闂備胶绮崝鏍ь焽濞嗘挻鍊堕柨鏇炲�归崵鏇㈡煏閸繍妲归柣鎾寸洴閺屻劑鎮㈢拠娈嬫挾绱掗崒娑樼闁跨喐鏋荤紞鍡涘磻閸℃稑鍌ㄩ柛妤冨亹閺�浠嬫煟閹邦厽缍戦柣蹇嬪劤閿熷�燁潐濞诧箓宕滈悢鐓庣畺婵鎷烽柡灞芥椤撳ジ宕卞▎蹇撶疄闂傚倷鑳剁划顖毭洪弽顓炵９闁革富鍙忛幏宄邦潩閻愵剙顏�" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸妞ゎ偄鎳橀弻宥夊Ψ閵夈儲姣愮紓浣靛妸閸庨潧顫忕紒妯诲濞撴凹鍨遍弫顖炴⒑鐟欏嫭銇熷ù婊呭仧閸掓帗绻濆顒傤吅闂佹寧娲╅幏鐑芥煕閵娿儱锟藉潡寮诲☉妯兼殕闁跨喍绮欏畷鎴︽倷閸濆嫮锛涢梺鎸庣箓閹叉﹢寮崼鐔告珕闂佽姤锚椤︿粙宕电�ｎ亶娓婚柕鍫濇噽缁犲啿鈹戦悜鍥ㄥ闂備礁鎼惌澶屾崲濠靛棛鏆﹂梺顒�绋侀弫鍥煟濡櫣浠涙繛鍫濄偢濮婄粯鎷呴崨濠冨創闂佹椿鍘奸ˇ鍗炍ｉ幇鏉垮嵆闁绘柧璀﹀ù鍕⒑閹稿孩鈷掗柛瀣尵閿熻姤纰嶅畝鎼佸蓟閻旇櫣纾兼俊顖濇閻熴劌顪冮妶搴′簼闁圭懓娲ら～蹇曠磼濡顎撻梺闈╁瘜閸樹粙鎳ｉ崶顒佲拺缂佸顑欓悞楣冩煕婵犲啰绠撻柣锝囧厴楠炲酣鎳為妷锔界彸濠电姰鍨煎▔娑㈡晝閵娾晛绠洪柡鍥╁亹閺�浠嬫煟閹邦厽缍戦柣蹇曞枛閺屾盯濡搁妷褏楔闂佽鍠氶崑娑氬弲濡炪倕绻愰幊鎰板储闁秵鈷戠憸鐗堝笒娴滀即鏌涢悩宕囧缂佸倸绉甸妶锝夊礃閳哄啫骞楅梻浣瑰缁诲倿骞婂畝鍕；闁靛繆鍓濋崣蹇撯攽閻樻彃鏆為柕鍥ㄧ箘閿熷�燁潐濞诧箓宕戞繝鍌滄殾闁绘梻鈷堥弫鍡楊熆鐠轰警鍎滅紒杈ㄥ笒閳规垿鏁嶉崟顐℃澀闂佺锕ラ崹鍨暦濠靛牅娌弶鐐村缁嬫垿鍩ユ径鎰潊闁绘ɑ顔栭崬褰掓⒒娓氾拷濞佳呮崲閹烘挻鍙忔い鎾跺�ｉ敐澶婇唶闁绘梻顭堝鍨攽椤旂瓔娈旀俊顐ｎ殕缁傚秴鈹戠�ｎ偆鍘遍梺鍝勬川閸嬫盯寮抽悢铏圭＜閺夊牄鍔嶇亸浼存煙瀹勭増鍤囩�规洘绮撻獮鎾诲箳閹存繍妫堥梻鍌氬�峰ù鍥敋瑜忛幑銏ゅ箣閻樺啿搴婇梺鍓插亖閸庨亶寮伴妷锔剧闁瑰鍋熼幊鍐磼閸撲礁浠滈柍瑙勫灴閹瑩妫冨☉妤�顥氶梻浣告惈閸嬪﹪骞忛悜鑺モ拻闁稿本鐟ㄩ崗宀�绱掗鍛仸闁诡喚鍏樻俊鐑藉煛娴ｈ櫣鏋冮梻濠庡亜濞诧箑煤閳哄懎绠�瑰嫰鍋婂鈺呮煙妫颁胶鍔嶇紓宥呯墢缁辨挻鎷呴搹鐟扮缂備礁顑嗙敮鎺椻�﹂崶顏嗙杸婵炴垶顭囬ˇ顓㈡偡濠婂啴鍙勭�规洘鍨奸ˇ瑙勬叏婵犲懏顏犵紒顔界懅閹瑰嫰濡搁敂绛嬫綂闂傚倷鑳堕…鍫ユ晝閵夆斂锟藉啯绻濋崶褎鐎梺鐟板⒔缁垶宕靛澶嬬厪濠㈣鍨伴張顒�鈻撹ぐ鎺撶厽閹艰揪绲鹃鐔兼煙妞嬪骸鍘撮柡宀�鍠栧鑽わ拷闈涘濡差噣姊洪挊澶婃殶闁哥姵鐗犲濠氭晸閻樿尙鍊為梺瀹犳〃閻掞箓鎮樻笟锟藉铏圭磼濡偐鐣鹃梺绯曟櫆閻楃姵淇婇悽绋跨妞ゆ牗鑹鹃崬銊╂⒑闂堟侗鐒鹃柛鏂跨焸钘熸繝闈涱儐閳锋垿鏌涘┑鍡楊仾妞ゃ儲绮撻弻銊╁即閵娿倝鍋楅悗娈垮枛椤兘骞冮姀銈嗘優闁革富鍘鹃崢顖炴⒒娴ｅ憡璐℃い顓炵墛椤ㄣ儳绮欐惔鎾寸亖濠德板�ч幏鐑芥煃鐟欏嫬鐏存い銏＄懅濞戠敻鏌ㄧ�ｎ偅姣庡┑鐘殿暜缁辨洟宕戦悩鍙傛盯宕熼鍙ョ綍闂傚倷绀侀幉锟犲礉閿曞倸绐楅柡宥庡幗閸嬪倹绻涢幋娆忕仾闁绘挻娲熼幃姗�鎮欓弶鎴濆Б闂佹悶鍊ら崜娆撴箒缂佺虎鍙冮弨杈╋拷姘炬嫹?.shopid:" + shopid + "goodsid:" + goodsid);
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


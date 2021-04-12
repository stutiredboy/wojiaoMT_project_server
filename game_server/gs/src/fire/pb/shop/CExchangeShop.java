
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
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棭姊挎繝銏ｅ煐閸旀牠鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐烘煙閸忕厧濮嶉柡灞剧洴瀵剙鈻庨幆褍澹庨梻浣筋嚃閸犳銆冮崨杈剧稏婵犻潧顑愰弫鍥煟閹邦剙绾ч柟铏懇濮婄粯鎷呴崨濠冨創闂佸搫鐗滈崜娆戝弲濠碘槅鍨拃锕傚吹濡ゅ懏鐓曢柡鍥ュ妼閻忕娀姊洪崡鐐村缂佺粯绻堝Λ鍐ㄢ槈濞嗘ɑ顥ｆ俊鐐�ら崑鍛枈瀹ュ洦宕叉繝闈涱儐閸嬨劑姊婚崼鐔衡棩缂侇喖鐖煎娲偡閺夋寧姣愰梻浣稿簻缂嶄線鐛崱妤冩殕闁告洦鍋嗛敍婊堟⒑缂佹ê濮岄悘蹇ｄ邯楠炴寮撮悙鈺傛杸闂佺粯鍔栧娆撴倶閿曞倹鍤曢柕鍫濐槹閻撴盯鏌ㄩ悢璇残撶紒鍌涘笧閿熸枻缍嗛崑鍡涘储閸楃偐鏀介柣鎰綑閻忋儳锟借娲﹂崜鐔煎箖濮楋拷閺屽棗顓奸崱娆忓箞闂備胶绮ú鏍磹閸︻叏鎷峰鐐" + goodsid + "]");
			return;
		}

		fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
		if (ns == null || !ns.getGoodsids().contains(goodsid)) {
			mkdb.Trace.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴娓氼垱鏁梺瑙勬た娴滅偟鍒掓繝姘闁挎洩鎷烽柛銊ュ�块弻娑樼暆閿熶粙宕戦悙鍝勭；闁挎繂鎲橀弮鍫熸櫆闁芥ê顦介崵瀣渻閵堝懐绠冲┑鐑囨嫹闂佸搫鐭夌换婵嗙暦闁稁鏁囬柣妯虹仛濞堝ジ姊绘担鍛婃儓闁活厼顦卞Σ鎰板即閻斾警娴勯梺鎸庢⒒閸嬫挾锟芥碍宀搁弻鐔虹磼濡櫣鐟ㄥ銈庡亝閹瑰洤顫忕紒妯诲闁革富鍘介懣鍥⒑缁嬫鐒鹃柛濠冪箓閻ｇ兘骞庨懞銉︽珳婵犮垼娉涢敃銊╁箺閺囩偐鏀介柣鎰綑閻忕喖鏌涢妸銉хШ闁诡喚鍋涚叅妞ゅ繐鎳愰崢閬嶆⒑瑜版帒浜伴柛鐘崇墬缁傚秵銈ｉ崘鈺冨幗闂佹寧绻傞幊宀勫磻閵忊剝鍙忓┑鐘插暞閵囨繄锟借娲﹂崑濠傜暦閻旂⒈鏁嗗璺侯儜缁辨帒鈹戦敍鍕杭闁稿﹥鍨垮畷婵堜沪鏉炴寧绋戦埥澶愬閻樻鍞归梻渚�娼х换鎺撴叏椤撶倣锝夊醇閻旂寮垮┑顔筋殔濡绂嶅┑瀣厱闁哄洨鍋涢弳鐔虹磼鏉堛劍灏伴柟宄版嚇瀹曟粓骞撻幒鎴濐棈闂傚倷娴囬褏鎹㈤幋鐘冲床闁割偁鍎遍弰銉︾箾閹寸偟鎳冪紒鍓佸仜閳规垿鎮欓棃娑楀闂佸搫鍋婇幏鐑芥⒒閸屾瑨鍏岀紒顕呭灦閹兘濡烽埡浣虹枃闂婎偄娲﹀ú鈺呭箯瀹勯偊娼╅柟棰佺劍缂嶅牏绱撴担铏瑰笡缂佸甯掗…鍥疀濞戞顦悷婊冮叄瀹曟垼顦规慨濠呮缁瑧鎹勯妸锔筋潊闂備胶顭堥敃銉┿�冩繝鍥ф瀬闁瑰墽绮崵宥夋煏婢诡垰鏈▓褰掓煟鎼达絾顏熼柟椋庡厴閺岀喖姊荤�靛壊妲梺钘夊暟閸犳牠寮婚敓鐘茬倞闁宠桨鐒﹂悘渚�姊虹紒妯肩畾闁糕晜鐗犳俊鐢稿礋椤栨艾鍞ㄩ梺闈涱焾閸斿矂藟濠靛鈷戦柛婵嗗椤ユ粓鏌ㄩ弴銊ら偗鐎殿喖顭烽幃銏ゆ惞閸︻厾鍘梻浣告贡椤牊顨ョ粙搴撴灁婵°倧鎷烽柍瑙勫灴椤㈡瑧娑甸柨瀣毎婵犵绱曢崑鐘参涢崟顔句罕闂備礁鎲￠崝锕傚窗閺嶎厽鍋傛繛鎴欏灪閻撴洟鎮橀悙鏉戝姢闁搞値鍓欓湁缁绢參鏀辩�氾拷?.shopid:" + shopid + "goodsid:" + goodsid);
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


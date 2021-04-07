
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBuyNpcShop__ extends mkio.Protocol { }

/** NPC购买协议
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBuyNpcShop extends __CBuyNpcShop__ {
	@Override
	protected void process() {
		// protocol handle
		
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ鍡涙⒑鐠囨彃顒㈡慨妯稿妿閸掓帡顢涢悙鍙傦箓鏌涢弴銊ョ仩缂佺姴顭烽幃妤呮濞戞瑦鍠愰梺浼欑稻濡炰粙寮婚敐鍡樺劅闁靛繈鍩勯弳鈩冪節閻㈤潧浠滈柨鏇ㄤ簻椤曪絾绻濆顒傚姶闂佸憡鍔戦崝搴ｇ玻閻愮儤鈷戠紒顖涙礃椤﹪鏌涘Ο鍏兼珪闁跨喕濮ら懝鍓х礊婵犲洤钃熸繛鎴炃氶弸搴ㄧ叓閸ラ绋婚柍缁樻崌濮婅櫣绮欏▎鎯у妧闂佺懓鍤栭幏锟�
		final gnet.link.Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		//闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掔晫绱撴担濮戣偐鎹㈤崱娑欑厱闁靛鍠栨晶顔剧棯閹勫仴闁哄本娲熷畷鐓庘攽閸パ勭彺闂備礁鎼鍛矓閻㈠灚宕叉繛鎴欏灩楠炪垺淇婇姘儓妞ゎ偄閰ｅ鍝勭暦閸モ晛绗″┑顔硷工缂嶅﹥淇婇悽绋跨妞ゆ牗姘ㄩ鎺楁煟閻樼儤顏犻柛搴涘�濋幃妤呭礈瑜忕壕鍏间繆閵堝嫮顦﹂柣蹇撶摠閹便劍绻濋崘鈹夸虎閻庤娲忛崝宥囨崲濠靛绀嬫い鎰剁稻椤旀劗绱撻崒姘拷鐑芥嚄閼稿灚鍙忛柣銏犵仛閺嗘粓鏌嶉妷銉э紞闁哄棴闄勬穱濠囧Χ韫囨柨顏舵俊鐐�ら崑鍛垝閹捐鏋侀柟鎯ь嚟椤╃兘鎮楅敐搴″缂佷緤绠撻幃妤呯嵁閸喖濮庡銈忓瘜閸ㄥ磭鍒掔拠宸僵閺夊牄鍔岄弸鎴︽倵楠炲灝鍔氭い锔垮嵆瀹曟垿宕掑В鎻掗叄瀹曞爼鍩℃繝鍕倯c
//		if (npckey != 0) {
//			if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, role.getRoleid()))
//				return;
//		}
//		int npcid = 0;
		//闂傚倸鍊搁崐鐑芥倿閿曞倹鍎戠憸鐗堝笒閺勩儵鏌涢弴銊ョ仩闁搞劌鍊垮娲敆閿熺晫绮旈悽绋跨；闁靛牆顦伴悡娑㈡煕閵夈劌鐓愮紒鑸电〒缁辨挸顓奸崱娆忊吂闂佸疇顫夐崹璺侯嚗閸曨偆鏆嗗┑鐘插暣閵堢棗闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌ｉ姀銏╃劸缂侊拷婢舵劖鐓ラ柡鍥╁仜閿熻姤鎮傚畷鎺楀Ω閿斿墽顔曢悗鐟板閸犳洜鑺遍懡銈囩＜闁绘瑱鎷烽柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
//		if (buytype == ShopBuyType.NORMAL_SHOP) {
//			npcid = fire.pb.map.SceneNpcManager.getNpcIDByKey(npckey);
//			if (npcid < 0) {
//				xdb.Trace.info("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟缁�濠傗攽閻樻彃浜為柣鎺旀櫕閹叉悂骞嬮敃锟芥闂佽澹嗘晶妤呭磹閻戣姤鐓熼柕蹇嬪灪閺嗏晠鏌ｉ敐鍫濈厫缂佺粯绻堟慨锟介柨婵嗘噽閸橆偊姊洪崨濠冣拹婵炲弶绮庨崚鎺楀醇閵夈儱鑰垮┑鐐村灦閻熝囧储閻㈠憡鍊甸柣鐔告緲椤忣亜顭块悷鐗堫棦闁诡喚鍋為妶锝夊礃閳哄啫骞堥梻渚�娼ч悧鍡涘箠瀹�鍕櫢闁芥ê顦藉ú绺� id=" + npckey);
//				return;
//			}
//		}
		
		fire.pb.shop.SGoods goods = fire.pb.shop.Module.sGoodsMap.get(goodsid);
		if (null == goods) {
			mkdb.Trace.info("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閹兼劙鏌涢弬娆惧剶闁诡喗顨呴～婵嬵敇閻愬弶鎳欓梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠闁卞洦绻濋棃娑欘棞妞ゎ偅纰嶇换婵嬫偨闂堟稐绮堕梺鐟板暱闁帮綁骞嗗畝鍕＜闁绘劘灏幗鏇炩攽閻愭潙鐏﹂懣銈夋煛閿熻姤绂掔�ｎ偆鍘卞┑鐐村灥瀹曨剟鎮橀柆宥嗙厱闁绘洖鍊圭�氾拷" +  goodsid  + "]");
			return;
		}
		
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ鍡涙⒑鐠囨彃顒㈢痪鏉跨Ф閸犲﹤顓兼径濞箓鏌涢弴銊ユ珮婵″弶鍎抽—鍐Χ閸愩劌濮曞銈忕悼閸忔ê顫忔繝姘＜婵炲棙鍩堝Σ顕�姊洪崷顓涙嫛闁稿妫濋弫鎾绘嚍閵夛妇娈ら梺绋跨箲閿氶柣锝夘棑閹叉挳宕熼顐㈡闂備礁鎼ˇ浼村垂瑜版帗鍋╅柣鎰靛墰缁犻箖鏌熼幆褜鍤熼柛鐔哥叀閺岀喖鎮滅粵瀣棖闂佽法鍠曟慨銈夘敊閺嶎厼绐楅柡宥庡幗閸婅埖鎱ㄥ鍡楀⒒闁搞倖顨婇弻娑㈠即閵娿儱顫梺绋挎捣閸犳劙濡甸崟顖氭闁割煈鍠楅崐顖炴⒑娴兼瑧瀵肩紒顔界懃椤繒绱掑Ο璇差�撻梺鎯х箳閹虫挾绮敓鐘斥拺闂傚牊绋掓径鍕煟閳哄﹤鐏犳い鏇秮楠炴捇骞掗崱姗嗘綌闂備線娼х换鎺撴叏閻戠瓔鏁婇柟鎵閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�
		if (buytype == ShopBuyType.NORMAL_SHOP) {
			fire.pb.shop.SNpcSale ns = fire.pb.npc.NpcManager.getInstance().getNpcSale(shopid);
			if (ns == null || !ns.getGoodsids().contains(goodsid)) {
				mkdb.Trace.info("NPC婵犵數濮撮惀澶愬级閸栤剝瀚规俊銈勭劍閸欏繘鏌ｉ幋锝嗩棄缁炬儳顭烽弻锝夊箛椤栵絽娈濋梺鍏兼緲濞硷繝寮诲☉銏℃櫆閻犲洦褰冪粻鑽ょ磽娴ｅ搫校闁哄被鍔戦垾锕傚锤濡や礁娈濋梻鍌氱墛缁嬫垿锝炲畝锟界槐鎾寸瑹婵犲啫顏堕梻浣告啞濞诧箓宕归柆宥嗗亗闁哄洨鍠撶弧锟介梻鍌氱墛缁嬫帡藟濠婂嫨浜滈煫鍥风导闁垶鏌″畝瀣瘈鐎规洖宕灒闁稿繒鍘ч崹閬嶆⒒娴ｇ瓔鍤冮柛鐘崇墱缁辩偞绻濋崒婊勬闂佸壊鍋呭ú鏍ф暜闂備線娼чˇ顓㈠磿鏉堫偒鏆繝鐢靛Х閺佸憡鎱ㄩ銏犵闁告劦鍠栫粈鍐煃鏉炵増顦锋繛锝庡櫍閺岋絾鎯旈妶搴㈢秷濠电偞绁撮弲鐘荤嵁韫囨稒鏅搁柨鐕傛嫹?.shopid:" + shopid + "goodsid:" + goodsid);
				return;
			}
		}
		
		fire.pb.shop.utils.ShopParameters params = new fire.pb.shop.utils.ShopParameters();
		params.role = new fire.pb.PropRole(role.getRoleid(), true);
		params.goods = goods;
		params.num = num;
		params.shopId = shopid;
		
		new fire.pb.shop.srv.BuyShopFactory(params, buytype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810633;

	public int getType() {
		return 810633;
	}

	public int shopid; // 商店序号
	public int goodsid; // 商品id
	public int num; // 购买数量
	public int buytype; // 购买类型

	public CBuyNpcShop() {
	}

	public CBuyNpcShop(int _shopid_, int _goodsid_, int _num_, int _buytype_) {
		this.shopid = _shopid_;
		this.goodsid = _goodsid_;
		this.num = _num_;
		this.buytype = _buytype_;
	}

	public final boolean _validator_() {
		if (shopid < 1) return false;
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
		if (_o1_ instanceof CBuyNpcShop) {
			CBuyNpcShop _o_ = (CBuyNpcShop)_o1_;
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

	public int compareTo(CBuyNpcShop _o_) {
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



package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketBrowse__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketBrowse extends __CMarketBrowse__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		new mkdb.Procedure() {
			
			@Override
			protected boolean process() throws Exception {
				long beginTime = System.currentTimeMillis();
				
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				proxy.marketBrowse(roleId, firstno, twono, threeno,
						itemtype, limitmin, limitmax, browsetype, currpage, pricesort, issearch);
				
				long endTime = System.currentTimeMillis();
				long excuteTime = endTime - beginTime;
				if (excuteTime > 20) {
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍嵁閹达箑绠涢梻鍫熺♁椤斿嫰姊洪悷鏉挎倯婵炲吋鐟╅弫鍐敂閸繆鎽曢梺闈涚墕濞层倝寮搁崼銉︾厱婵°倕鍟禒婊勩亜椤愵偄浜版慨濠傛惈鐓ら悹鍥ㄥ絻缁犳椽姊洪崷顓熷殌婵炲樊鍘奸锝嗙節濮橆剛鍔撮梺鍛婂姂閸斿海绮ｉ悙鐑樼厽閹兼惌鍨崇粔闈浢瑰鍛沪缂佸倹甯楃缓浠嬪川婵炵偓瀚奸梻浣告啞缁诲倻锟芥凹鍙冮弫宥夊籍閸屾粎锛滈梺缁橆焾濞呮洖鐣峰畝锟介敓鑺ヮ問閸犳牠鈥﹂悜钘夋瀬闁圭増婢樺婵嬫煕鐏炲墽鐭婇柡瀣叄閺屽秶鎷犻弻銉ュ及闂佽鍠楅悷鈺呫�侀弽顓熷殟闁靛鍎冲Ο浣虹磽閸屾艾锟芥悂宕愰悜鑺ュ殑闁割偅娲橀幆鐐哄箹濞ｎ剙濡奸柛灞诲妼閳规垿宕掑搴ｅ姼缂備胶濮锋繛锟介柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞劖绂嶉鍫濊摕闁靛ň鏅滈崑鍕磽娴ｇ櫢渚涙俊顐㈠濮婅櫣锟藉湱濯鎰版煕閵娿儲鍋ラ柕鍡曠閳诲酣骞橀弶鎴濆婵＄偑鍊栭崝锕傚磻閸岀偞鐒芥い鏍ㄧ玻閹烽鎲撮崟顒傦紭闂佺瀛╂繛濠囧极閹捐妫橀柕鍫濇川鏍￠梻浣告啞閹歌崵绮欓幘璺哄灊闁割偆鍠撶弧锟介梺鍛婃礉閸╂牜锟芥艾缍婇弻锝堫槻闁硅绱曢敓鑺ヨ壘缂嶅﹤顫忓ú顏勫窛濠电姴鍟ˇ鈺呮⒑缁嬭法绠查柨鏇樺灲閻涱喛绠涢弴鐘碉紲濠碘槅鍨甸崑鎰邦敊閺囥垺鈷戦柣鐔告緲閳锋梹銇勯妷锕�濮堢紒鏃傚枎铻ｉ柤濮愬�楅鏇㈡煟韫囨洖浠滈柛濠冩倐閺佹捇鎳為妷褍鈷岄悗娈垮枟閻撯�崇暦婵傜鍗抽柕濠忛檮濞呮牠姊绘担铏瑰笡闁告梹娲熼、姘额敇閵忕姴鍋嶉梺姹囧灩閹诧繝鍩涢幋锔界厱婵炴垶锕崝鐔兼煃閽樺妯�闁哄被鍔戝鏉懳熼崫鍕曢柣搴ゎ潐濞叉﹢宕濆▎鎾跺祦闁搞儺鍓﹂弫瀣煕閳╁厾顏堫敂閸洘鐓熼柣鏂挎憸閹冲啴鎮楀鐓庡箻缂侇喗姘ㄩ幑鍕Ω瑜忛敍婵嬫倵楠炲灝鍔氶悗姘煎櫍钘濋柨鏇炲�归悡鐔兼煥濠靛棭妯堟俊顐ｅ灩缁辨帡顢欓悾灞惧櫘闂佸綊顥撴繛锟介柟顔界懇椤㈡鎷呴崣澶婎伕闂傚倷鑳堕幊鎾诲床閺屻儱绠犳俊顖欒濞兼牜鎲搁悧鍫濈瑨缂佺姵绋掗妵鍕籍閿熶粙宕曢幎鍓垮洭鍩￠崨顔规嫽闂佺鏈懝楣冩晸閼恒儲鍊愮�规洘鍔栭ˇ鐗堟償閵忊晛浠烘繝娈垮枟閿曗晠宕滈敃鍌涘�块柣锝呮湰閸犳劙鏌￠崘銊у闁诲繑濞婇弻銊╁即閻愯弓绨介梺杞扮濞差參寮婚弴锛勭杸濠电姴鍠氶敓钘夋閺岀喓绮欓崹顔芥濠殿喖锕ュ钘夌暦閵婏妇绡�闁告劦鐓堝Σ閬嶆⒒娴ｈ鍋犻柛鏂款儑濞嗐垹顫濋鍌涙闂佸壊鍋呭ú锕傚极閸屾粣鎷烽獮鍨姎婵☆偄鐭傚绋跨暆閸曨兘鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鐐烘煙椤曞懎娅嶆い銏℃礋閺佸啴鏁撻悾宀�鐭嗗鑸靛姈閻撴瑩寮堕崼婵嗏挃闁伙綁浜堕弻锛勶拷锝傛櫇缁愭棃鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮婚敓鐘插窛妞ゆ棁妫勯敓鑺ュ姍閺岋紕浠︾拠鎻掝潎闂佽鍠撻崐婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟�?").append(excuteTime).append("濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愰梻鍌氬�搁崑鍡涘垂闁秴桅闁告洦鍨伴崘锟介梺闈浤涢崨顖氬笓缂傚倸鍊风欢銈夊箯瀹勬壋鏀介柣妯哄级婢跺嫰鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹥顔嶉梻浣哥枃濡嫰藝闁秵鍎夋い蹇撶墕缁犳氨鎲稿鍫熷亗濠靛倸鎲￠悡娑㈡倶閻愭彃鈷旀繛鍙夋尦閺屾盯鍩℃担鍓蹭純閻庤娲橀敃銏′繆閹间礁唯闁挎柨褰炵花鐣岀磽閸屾艾锟芥悂宕愰幖浣哥９闁告縿鍎抽惌鎾绘煟閵忕姵鍟為柛瀣儔閺岋絽螣濞嗘儳娈梺钘夊暟閸犳牠寮婚弴鐔虹闁绘劦鍓氶悵鏇㈡⒑缁嬫鍎忔俊顐ｇ箞瀵鈽夊顐ｅ媰闂佸憡鎸嗛敓钘壩ｉ崼婵愭富闁靛牆鎳橀悰婊堟煙閸戙倖瀚�");
					fire.pb.shop.srv.market.MarketManager.LOG.error(sbd.toString());
				}
				return true;
			}
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810639;

	public int getType() {
		return 810639;
	}

	public int browsetype; // 浏览类型  1 我要购买 2公示物品
	public int firstno; // 一级页签类型
	public int twono; // 二级页签类型
	public java.util.ArrayList<Integer> threeno; // 三级页签类型
	public int itemtype; // 物品类型
	public int limitmin; // 条件下限
	public int limitmax; // 条件上限
	public int currpage; // 当前页
	public int pricesort; // 价格排序  1升序  2降序
	public int issearch; // 0筛选 1搜索

	public CMarketBrowse() {
		threeno = new java.util.ArrayList<Integer>();
	}

	public CMarketBrowse(int _browsetype_, int _firstno_, int _twono_, java.util.ArrayList<Integer> _threeno_, int _itemtype_, int _limitmin_, int _limitmax_, int _currpage_, int _pricesort_, int _issearch_) {
		this.browsetype = _browsetype_;
		this.firstno = _firstno_;
		this.twono = _twono_;
		this.threeno = _threeno_;
		this.itemtype = _itemtype_;
		this.limitmin = _limitmin_;
		this.limitmax = _limitmax_;
		this.currpage = _currpage_;
		this.pricesort = _pricesort_;
		this.issearch = _issearch_;
	}

	public final boolean _validator_() {
		if (browsetype < 1 || browsetype > 2) return false;
		if (firstno < 1 || firstno > 20) return false;
		if (currpage < 1) return false;
		if (pricesort < 1 || pricesort > 2) return false;
		if (issearch < 0 || issearch > 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(browsetype);
		_os_.marshal(firstno);
		_os_.marshal(twono);
		_os_.compact_uint32(threeno.size());
		for (Integer _v_ : threeno) {
			_os_.marshal(_v_);
		}
		_os_.marshal(itemtype);
		_os_.marshal(limitmin);
		_os_.marshal(limitmax);
		_os_.marshal(currpage);
		_os_.marshal(pricesort);
		_os_.marshal(issearch);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		browsetype = _os_.unmarshal_int();
		firstno = _os_.unmarshal_int();
		twono = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			threeno.add(_v_);
		}
		itemtype = _os_.unmarshal_int();
		limitmin = _os_.unmarshal_int();
		limitmax = _os_.unmarshal_int();
		currpage = _os_.unmarshal_int();
		pricesort = _os_.unmarshal_int();
		issearch = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketBrowse) {
			CMarketBrowse _o_ = (CMarketBrowse)_o1_;
			if (browsetype != _o_.browsetype) return false;
			if (firstno != _o_.firstno) return false;
			if (twono != _o_.twono) return false;
			if (!threeno.equals(_o_.threeno)) return false;
			if (itemtype != _o_.itemtype) return false;
			if (limitmin != _o_.limitmin) return false;
			if (limitmax != _o_.limitmax) return false;
			if (currpage != _o_.currpage) return false;
			if (pricesort != _o_.pricesort) return false;
			if (issearch != _o_.issearch) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += browsetype;
		_h_ += firstno;
		_h_ += twono;
		_h_ += threeno.hashCode();
		_h_ += itemtype;
		_h_ += limitmin;
		_h_ += limitmax;
		_h_ += currpage;
		_h_ += pricesort;
		_h_ += issearch;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(browsetype).append(",");
		_sb_.append(firstno).append(",");
		_sb_.append(twono).append(",");
		_sb_.append(threeno).append(",");
		_sb_.append(itemtype).append(",");
		_sb_.append(limitmin).append(",");
		_sb_.append(limitmax).append(",");
		_sb_.append(currpage).append(",");
		_sb_.append(pricesort).append(",");
		_sb_.append(issearch).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


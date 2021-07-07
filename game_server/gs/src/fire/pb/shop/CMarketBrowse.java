
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
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌氬�烽懗鑸垫叏闁垮绠鹃柨鐔剁矙閺屸�崇暆閿熶粙宕伴弽顓犲祦闁硅揪绠戠粻娑㈡⒒閸喓鈾佹い鏂垮濮婃椽鎮烽弶鎸庡�┑鐐插悑閻熲晠寮崘顕呮晜闁割偅绻嗛幗鏇㈡⒑闂堟稓澧曟繛灞傚�濆鎼佸醇閵夛妇鍘卞┑掳鍊曢崯顐ｇ濠婂嫨浜滄い鎰靛亜娴滅増鎱ㄦ繝鍌涙儓閻撱倝鎮归崶銊ョ祷缂佺姵妞藉娲捶椤撶喎娈屽┑鐐叉▕閸樺ジ顢氶敐鍡欑瘈婵﹩鍓涢崝鎾⒑閸涘﹤濮傞柛鏂挎捣缁綁鎮欓悜妯煎幗闁瑰吋鎯岄崹宕囩矓闂堟耽鐟邦煥閸涱厺娌紓浣稿�圭敮妤冪紦娴犲宸濆┑鐐靛亾鐎氬ジ姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸欏啴寮澶婄睄闁稿本绮庨敍婊堟⒑缂佹﹩鐒炬繛鍛礀閻ｅ嘲鐣濋敓浠嬫晸閼恒儺鍟忛柛鐘崇墵閳ワ箓鎮滈挊澶嬬�梺鍦濠㈡ê顔忓┑瀣厱閻忕偛澧介惌濠囨煛鐎ｎ亪鍙勯柡灞界Ф閹风娀寮婚妷銉ュ強闂備浇顕栭崰妤呮偡閳哄懌锟戒線寮介鐔锋疅闂侀潧顦崕鍐参熸担铏圭＝闁稿本鑹鹃敓鑺ユ倐瀹曟劙鎮滈懞銉ユ畱闂佸壊鍋呭ú姗�骞嗛悙鍝勭婵烇綆鍓欐俊濂告煕鐏炶濡奸柍瑙勫灴瀹曟帒顭ㄦ惔锝呭Ъ缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍔栫粋宥夘敂閸繆鎽曢梺闈浥堥弲婊堝磻閸曨厾纾藉ù锝囨娓氭稒淇婇銏狀伃婵﹨娅ｉ敓钘夋贡婵厼顭囬幇鐗堢厱闁靛鍎查崑銉╂煏閸℃洜顦﹂柍璇查叄楠炴﹢寮堕幋婵嗩棗濠碉紕鍋戦崐鏍礉閿曞倸纾婚柛宀�鍋為悞鑺ャ亜閺嶃劎鐜婚柟鐑筋棑閹叉挳宕熼鍌︾喘闂備胶顭堢�涒晜绻涙繝鍥ф瀬闁规崘顕уΛ姗�鏌曢崼婵囧窛閺嶏繝姊绘担鍛婂暈闁规瓕宕电划娆撳箻鐠哄搫鐏婇梺鍓插亞閸犳挾寮ч敓浠嬫⒑閸涘﹥绀夐柛鈺傜墱閿熻姤鑹剧紞濠囧蓟閿濆牜妲婚梺纭咁嚋缁辨洟鏁撻懞銉ㄥ缂傚秴锕ら～蹇撁洪鍕獩婵犵數濮撮崯顐λ囬埡鍛拺缂佸娉曠粻鏌ユ煥閺囨ê鐏查柣娑卞枦缁犳盯寮撮悩纰夌床婵犵妲呴崹鐢稿磻閹伴偊鏁婇柡鍥ュ灪閳锋垿鏌ｉ悢鍛婄凡闁抽攱姊归妵鍕Ψ閿曪拷婵牏绱掗弮鍌氭瀻閾伙綁鏌ゆ慨鎰拷妤咁敊閺囥垺鐓熼煫鍥ㄦ礀娴犳粓鏌涙繝鍐╁�愰柡浣规崌閹崇偤濡疯閳峰矂鎮楀▓鍨灍闁绘挴锟藉磭鏆﹀┑鍌滎焾閸楁娊鏌曟繝蹇涙婵炲懏鐗犲缁樻媴閾忕懓绗￠梺鍛婃⒐濞茬喖銆佸棰濇晣闁靛繒濮撮崑宥夋⒑濮瑰洤鐏╅柟璇х節閸╂盯骞嬮敂鐣屽幈濠电偞鍨堕敃顐﹀礉閻斿吋鐓冮柦妯侯樈濡拷闂佸搫琚崝鎴濐嚕閺夋嚦鐔煎传閸曨倣鏇㈡煟鎼淬値娼愭繛鍙夛耿瀹曟繂鈻庨幘璺虹ウ闂佹悶鍎洪崜锕傚极鐎ｎ喗鐓曢柍鈺佸幘椤忓牜鏁傞柛顐ｆ礃閻撶喖鏌ｉ弬鎸庢喐闁瑰啿鍟撮幃妤�顫濋悡搴＄缂備緡鍠楀銊╁箲閸曨垰惟鐟滃繘鏁嶅┑瀣�垫鐐茬仢閸旀岸鎮楀鐓庢珝閽樻繈鏌ㄩ弴鐐诧拷褰掓偂閻斿吋鐓ユ繝闈涙－濡牊淇婇锝呯仼缂佽鲸甯￠、娆撴偩鐏炴儳娅橀梻浣哥秺椤ユ挻绻涢敓浠嬫煙椤旂晫鎳囨い銏☆殕閹峰懘宕ｆ径濠庝紩闂傚倸鍊烽懗鍫曞箠閹捐搴婇柡灞诲劚缁犵姵淇婇娆掝劅婵炲吋鐗滈幉鎼佹偋閸繄鐟ㄧ紓浣哄У缁嬫帡濡甸崟顖氱睄闁跨喍绮欏畷鏇㈠箮閸撳灝娲崺锟犲川椤旇瀚介梻浣侯焾閺堫剟鎳濇ィ鍐╂櫢闁兼亽鍎查崐鎰拷瑙勬礃閸旀牠藝閻楀牊鍎熼柕蹇婃櫅娴犵儤绻濆▓鍨灍闁挎洍鏅犲畷婊堟晝閸屾稑锟藉潡鏌ｉ敐鍛拱闁哥姵鍔欓弻锟犲礃閵娧冾暫闂佽绻戞繛濠囧蓟閵娾晛鍗抽柣鎰紦缁ㄤ粙姊烘潪鎵槮婵炲樊鍙冨濠氬即閿涘嫮鏉告繝鐢靛Т閸犳岸鏁撻挊澶嬵棦闁哄瞼鍠撶划娆撳垂椤旇姤顔掓繝娈垮枛閿曘儱顪冮挊澶屾殾闁靛濡囩弧锟介梺鍛婂姦閻撳牆危闁秵鈷掑ù锝堫潐閸嬬娀鏌涢弬娆惧剳婵炲棎鍨归～婵嬵敆閸屾稒顔曢梻浣稿閸嬪懎煤閿曞倸鏋侀柛灞剧玻閹风兘鐛崹顔煎濠碘槅鍋勯惌鍌氼嚕缁嬭法鏆嗛柛鏇ㄥ厴閹峰姊虹粙鎸庢拱闁荤啙鍥佸洭鏁冮崒娑氬幍缂佺偓婢樺畷顒佺閻愮儤鐓欐い鏇炴噹濞呭秵銇勯姀鈩冪闁轰礁鍟撮弫鎾绘偩瀹�锟介惌鍡楊熆閼搁潧濮堥柣鎾寸懇瀵爼宕煎┑鍡忔寖闂佷紮缍佹禍鍫曞蓟閿涘嫸鎷烽敐鍌涙珖缂佹劖妫冮弻鈥崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺濠氭晸閻樻彃绐涘銈嗘濡嫰鏁撻懞銉ュ闁哄矉绱曟禒锔炬嫚閹绘帩娼庨梻浣筋嚃閸犳捇宕愬┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�?").append(excuteTime).append("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê妯婂Λ宀勬⒑鏉炴壆顦﹂柨鏇ㄤ邯瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劙姊婚崒姘拷鎼佸磻閸℃稑鍨傞梺顒�绉存闂佸憡娲﹂崹浼村礃閿熶粙姊洪棃娴ゆ盯宕ㄩ姘瑩缂傚倸鍊搁崐椋庢閵堝绠�瑰嫭澹嬮弨浠嬫煟濡搫绾у璺哄閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕ラ宥夋⒒娴ｅ摜鏋冩俊顐㈠钘濋梺顒�绉甸崕澶嬨亜韫囨挾澧曠紒鐘虫皑閹茬顭ㄩ崼鐔蜂簵婵犻潧鍊搁幉锟犳偂濞戙垺鍊堕柣鎰絻閳锋梹绻涢崣澶嬪唉闁哄本鐩崺鈩冩媴閸撹弓绱旈柣搴ゎ潐濞叉﹢鏁冮姀鈥茬箚闁归棿绀佸敮闂佹寧鏌ㄨぐ鐐佃姳閻ｅ瞼纾介柛灞捐壘閿熻姤鎮傚畷鎰板箹娴ｅ摜锛欓梺鍛婄缚閸庢娊鎯岄幘缁樼厽闁靛繒濮甸崯鐐烘煕鐎ｎ亶鍎旈柡宀嬬到铻ｆ繛鍡樺劤濞堫參姊洪挊澶婃殶闁哥姵鐗犲濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弴銏♀拺缂佸顑欓崕蹇斾繆椤愶絿绠炵�殿喛顕ч埥澶婎潩椤愶絽濯伴梻浣告啞閹稿棝鏁撻挊澹╋綁宕煎┑鎰瘜闂侀潧鐗嗛幊姗�鎮板鍫熺厵闁告垯鍊栫�氾拷");
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


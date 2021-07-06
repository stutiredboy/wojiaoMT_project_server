
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReMarketUp__ extends mkio.Protocol { }

/** 摆摊重新上架
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReMarketUp extends __CReMarketUp__ {
	@Override
	protected void process() {
		// protocol handle
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0) 
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				boolean success = proxy.remarketUp(itemtype, roleId, id, money);
				if (success) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨瀛樺殟闁靛／渚婃嫹婵犲洦鈷戦柛婵勫劚鏍￠梺鍦焾椤兘鐛崼銉ノ╃憸婵嬪箯閻戣姤顥堟繛鎴炵懄閸犳劗绱掗悙顒�鍔ら柕鍫熸倐瀵顓兼径濠佺炊闂佸憡娲﹂崜娆忊枍閵堝鈷戦柟鎯板Г閺侀亶鏌涢妸銉у煟濠碉紕鏁诲畷鐔碱敍濮橀硸鍞洪梻浣虹帛閸旀牕顭囧▎鎿冩晜闁告挷鑳剁壕浠嬫煕鐏炲墽鎳呮い锔奸檮閵囧嫰鏁傞崹顔肩ギ濡ょ姷鍋為崝娆撶嵁鎼淬劍瀵犲璺虹焾閸炵敻姊绘担渚敯闁规椿浜浠嬪礋椤栨氨锛涢梺鍛婃处閸ㄩ亶宕愰崼鏇犲彄闁搞儜鍕闯闂佸憡鏌ㄧ粔褰掑蓟閿熺姴纾奸柨鏃囨椤忓爼姊婚崒姘拷鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐沪闁哄拋浜弻锝嗘償閵忊晛鏅遍梺鍝ュУ閻楃娀骞冮妷锔鹃檮闁告縿鍎辩粊锕傛⒑閸濆嫮鈻夐柛妯垮亹缁鈽夊▎宥勭盎闂佸搫鍊搁悘婵嬪煕閺冨牊鐓ユ繛鎴炵懅閻帗鎱ㄦ繝鍛仩闁圭懓瀚版俊鎼佸Ψ閿旀拝鎷烽搹鍦＝濞撴艾娲ら弸鐔兼煟閻旀潙鍔﹂柟顕�绠栭弻銊э拷锝庡墴濡绢噣姊婚崒姘卞闁哄懏绻勭划娆掔疀閹垮啯瀵岄梺闈涚墕濡瑩藟閸℃ü绻嗘い鎰╁灩椤忣厽銇勯姀鈩冣拻闁圭懓瀚幏鍛村即閻斿壊妫冮梺璇″枓閺呯姴螞閸愩劉妲堟俊銈呭暞瀹曠喖姊婚崒娆愮グ妞ゆ泦鍛床闁瑰濮靛畷鏌ユ煕椤愶絿绠橀柡鍡檮缁绘繈妫冨☉娆欑礊濠电偛鐨烽弲鐘诲蓟閵堝浼犻柕澶涢檮濮ｅ嫰姊洪崨濠庣劷闁轰浇顕ч～蹇撁洪鍕獩婵犵數濮撮崐鎼侊綖瀹ュ鈷戠紓浣股戦幆鍫㈢磼缂佹绠撻柣锝囧厴閺佹劖寰勬繝鍕垫Ч婵＄偑鍊栭悧妤冪矙閹捐鍌ㄩ柟闂寸劍閻撶喖鐓崶銊︾濞寸媴绠撻弻锛勶拷锝庝憾閻撳ジ鏌ｉ幙鍐ㄥ⒋妞ゃ垺顨婂畷鐔碱敆閸屾艾绠伴梻浣筋嚙缁绘帡宕戦悩铏弿闁靛牆锛嗘径濠庣叆闁告洍鏅欑花濠氭⒑閻熸澘鈷旈柛瀣ㄥ姂瀹曟垿濮�椤喗瀚归悷娆忓缁�锟介悗瑙勬处閸撶喖宕洪姀鈩冨劅闁靛牆娲ㄩ弶鎼佹⒑瑜版帞鐣烘い銈呭�垮畷顒勬嚋閻㈢數鐦堥梺姹囧灲濞佳冩毄闂備浇妗ㄩ悞锕傚箖閸屾氨鏆﹂柟杈鹃檮閸嬫劙鎮归崶顏勭毢妞ゆ柨鑻—鍐Χ閸涱垳顔囧┑鈽嗗亝椤ㄥ牆鈻庨姀銈呂ч柛姘ュ�曠紞濠囧箖閳轰緡鍟呮い鏃傚帶婢瑰牏绱撻崒娆掑厡濠殿噣绠栭敐鐐村緞閹邦儵锕傛煕閺囥劌鐏犵紒鐘崇洴閺岀喖顢涘☉姗嗘濡炪倧缂氶崡鍐差潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢碍婢橀悾鐑藉箛閺夊潡鏁滃┑掳鍊ч幏椋庣磼閻橀潧鈻堥柡灞革拷鎰佸悑閹肩补锟藉磭顔愰梻浣虹帛閹稿鎯勯鐐茬畺婵°倕鎳忛弲鏌ュ箹缁櫢鎷烽懠顒傛晨濠碉紕鍋戦崐鏇犳崲閹扮増鍋夊┑鍌滎焾閽冪喖鏌ㄥ┑鍡╂Ч闁稿瀚伴弻娑樷攽閸曨偄濮曢梺闈╂�ラ崶銊у幗闁瑰吋鐣崹褰掑吹椤掑嫭鐓曟繛鍡楃箰閺嗭綁鏌ｅ☉鍗炴珝鐎规洖宕埥澶婎潨閿熶粙宕崼鏇熲拺闂傚牊渚楀褍鈹戦垾铏枠鐎规洏鍨介幃浠嬪川婵炵偓瀚奸梻浣告啞缁嬫垿鏁冮妶澶嬪�堕柣鏂垮悑閻撴洖鈹戦悩鎻掓殶濠⒀囦憾閺屻劑鎮㈢拠娈嬫捇鏌ｉ弮鎴濆⒋妤犵偛绻橀弫鎾绘晸閿燂拷
					fire.pb.shop.srv.market.MarketManager.getInstance().sendMarketContainerByRoleId(roleId);
				}
				return success;
//				return fire.pb.shop.srv.market.MarketManager.getInstance().remarketUp(itemtype, roleId, id);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810656;

	public int getType() {
		return 810656;
	}

	public int itemtype; // 1普通道具 2宠物 3装备
	public long id; // 唯一id(是我服务器数据库的id,传给前端的目的是在重新上架物品时给我返回)
	public int money; // 价钱

	public CReMarketUp() {
	}

	public CReMarketUp(int _itemtype_, long _id_, int _money_) {
		this.itemtype = _itemtype_;
		this.id = _id_;
		this.money = _money_;
	}

	public final boolean _validator_() {
		if (itemtype < 1 || itemtype > 3) return false;
		if (money < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemtype);
		_os_.marshal(id);
		_os_.marshal(money);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemtype = _os_.unmarshal_int();
		id = _os_.unmarshal_long();
		money = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReMarketUp) {
			CReMarketUp _o_ = (CReMarketUp)_o1_;
			if (itemtype != _o_.itemtype) return false;
			if (id != _o_.id) return false;
			if (money != _o_.money) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemtype;
		_h_ += (int)id;
		_h_ += money;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemtype).append(",");
		_sb_.append(id).append(",");
		_sb_.append(money).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReMarketUp _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = itemtype - _o_.itemtype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(id - _o_.id);
		if (0 != _c_) return _c_;
		_c_ = money - _o_.money;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


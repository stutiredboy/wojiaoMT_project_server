
package gnet;


import fire.pb.fushi.FushiManager;
import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __QueryOrderResponse__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class QueryOrderResponse extends __QueryOrderResponse__ {
	@Override
	protected void process() {
		fire.log.LogManager.logger.info("receive QueryOrderResponse.platid:"+platid+",platsn:"+orderserialplat+",gamesn:"+orderserialgame+",errorcode:"+errorcode);
		if (fire.pb.fushi.Module.getIsYYBUser(userid)) {
			FushiManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆浜ら柤鏉挎健濮婃椽顢楅敓鐣岀矓閹绢喖纾奸柕濞у嫬鏋戦梺鍝勫暙閻楀棛绮婚弽銊х鐎瑰壊鍠曠花濠氬箚閻斿吋鈷戦梻鍫熶緱濡牓鏌涢悩鎰佹畼缂佽京鍋為幆鏃堝閵忋垻妲囬梻浣圭湽閸ㄨ棄顭囪閻楀酣姊绘担鍝勫付缂傚秴锕︾划濠氬冀瑜滈崵鏇㈡煕濞戞﹫鍔熼柣鐔风秺閺屻劑鎮㈤崜浣虹厯閻庢鍠栭…宄邦嚕閹绢喖顫呴柣妯款嚙閺佽绻濋悽闈涒枅婵炰匠鍏犳椽濡搁埡浣勓勩亜閹板爼妾柍閿嬪灴閺屾盯鏁傜拠鎻掔闂佸憡锚閻°劑濡甸崟顖毼ㄩ柨鏃囨绾惧啿螖閻橀潧浠滄い锔炬暬閻涱喖顫滈敓浠嬨�佸▎鎾村殐闁冲搫锕ユ晥婵犵绱曢崑鎴﹀磹閺嶎厼绠伴柣鎰靛墯閸欏繘鏌ｉ幋锝嗩棄婵懓寮堕妵鍕箛閸撲焦鍋х紓浣叉閹风兘姊绘担鍦菇闁搞劏妫勯…鍥樄妞ゃ垺鎹囬獮妯肩磼濡厧骞嶅┑锛勫仜椤戝懏顨ラ幖浣稿偍闁圭虎鍠楅悡娑㈡倶閻愭彃鈷旀繛鍙夋綑閳规垿鏁嶉崟顐㈠箣濡炪們鍨洪悷鈺呭箖閳╁啯鍎熸い鏃�鍨濆锔剧磽閸屾艾锟芥悂宕愭搴㈩偨闁靛牆顦粻顖滐拷鐟板閸嬪﹪鎮㈤崱娑欑厾闁归棿鐒﹀☉褍鈹戦鑲╁ⅵ闁哄矉缍侀獮姗�宕橀崣澶嬵啋闂備礁鎼張顒�煤濡警鍤楅柛鏇ㄥ灠闁卞洦绻濋棃娑欙紞闁诲孩鎸冲缁樻媴閾忕懓绗＄紓浣筋嚙缁夌數绮嬪澶樻晜闁割偅绻嗛幗鏇㈡⒑閹稿海绠撻柟鍐差樀瀵劍绂掔�ｎ偆鍘遍梺鍝勬储閸斿本绂嶆ィ鍐╃厵鐎瑰嫭婢樺Σ濠氭煃鐟欏嫬鐏╅柨鐔告灮缂嶅棙绂嶉敐澶婄闁哄洢鍨洪埛鎴︽⒒閸喍绶遍柣鎺楃畺閺屾稒鎯旈鍏肩亪闁告浜堕弻娑㈩敃閵堝懏鐎虹紓浣筋嚙濡瑩濡甸崟顖氬唨闁靛ě鍛殼濠电偛鐡ㄧ划搴ㄥ箠閹剧粯绠掗梻浣虹帛閹稿摜锟芥稈鏅犻獮鏍箛椤撴粈绨诲銈呯箰鐎氼剟寮抽敐鍛斀闁炽儱纾崺锝囷拷瑙勬礀瀹曨剝鐏冮梺鍛婂壃閸愵煈鍤欑紓鍌氬�搁崐鎼佸磹瀹勬噴褰掑炊椤掞拷閺勩儵鏌″畵顔兼噺濞堟洟姊鸿ぐ鎺擄紵闁煎疇娉涢悾鍨瑹閿熶粙寮诲☉銏犵労闁告劗鍋撻悾濂告⒑閸濆嫭顥滄俊顐ｇ箞瀵鈽夐姀鐘插祮闂侀潧顭堥崕鎵姳閽樺娓婚柕鍫濈箺缁�瀣煕閺冿拷閸ㄧ敻锝炶箛鎾佹椽顢旈崨顓熺暟闂備礁鍟垮﹢閬嶅磻閹捐鎷峰顓犳创婵﹥妞藉畷銊︾節閸愩劑鐎洪梻浣哄帶缂嶅﹦绮婚弽顓炴槬闁靛繈鍊曠粻缁樼箾閼碱剛甯涢柡鍜佷邯濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氫即鏁愰悙鍓佺杸婵炴垶鐟﹂崕顏堟⒑闂堚晛鐦滈柛姗�绠栭幃锟犲箻缂佹鍘介梺缁樏崢鏍嚋椤忓牊鐓曢柡鍌氭健閸欏嫰鏌熼鍏煎仴鐎规洜鍠栭、娑樷槈閹烘挸顏归梻鍌欑閹诧紕绮欓幋锔芥櫇闁靛鏅滈崑鍌炴煏婢诡垰鎳愰敍婊勭節閵忥絾纭鹃柡鍫墴瀵娊顢楅崒锔藉婵炲牆鐏濋弸鐔兼煟閹绢垽鎷峰畷鍥ㄦ婵犻潧鍊婚…鍫ュ础閹惰姤鐓忓┑鐘茬箻濡绢喗绻涢崨顓犘ф慨濠勭帛閹峰懘鎼归悷鎵偧闂備焦瀵у畝鎼佸蓟濞戞﹩娼╅柣鎰靛墮椤忓墎绱撻崒姘拷鐑芥倿閿曞倶锟藉啴宕ㄥ銈呮喘濡啫鈽夋潏銊х▉闂備焦鍎崇换鎺戔枍閵忋倕绠柣鎴ｆ閹硅埖銇勯幘璺猴拷顐︽晲閸℃劒绨婚梺闈涱槶閸庡搫螣閿熶粙姊洪崫鍕伇闁哥姵鐗犻獮鏍亹閹烘繃鏅濋梺闈涚箳婵厼顭囬弴鐘电＝闁稿本鐟х拹浼存煕閻樺磭澧甸柟顔ㄥ嫮绡�闁稿被鍊曞▓顐︽⒑閸涘﹥澶勯柛瀣瀵娊宕卞☉娆戝弳闂佺粯姊婚崕銈呪枍閺囩儐鐔嗛悷娆忓缁�鍐磼鏉炴壆鐭欑�规洏鍔嶇换婵嬪礋椤愩垻鐤勯梻鍌欐祰椤曆呮崲閹烘纾绘繛鎴炵懄濞呯姴霉閻樺樊鍎忕紒鐘靛█閺屾盯鍩勯崘顏佹闂佺粯鎸诲ú鐔兼偂椤愶箑鐐婇柕濠忕畱閺嗘姊虹紒妯虹瑲闁诡喖鍊垮濠氭晬閸曨亝鍕冪紓浣割儏閻忔繈鍩涙径鎰拺闁荤喐婢樺Σ濠氭煙閾忣個顏囩亱闂佸憡鍔戦崝澶娢ｉ崼銉︾叄闊浄绲芥禍婊勩亜韫囨碍纭鹃柍瑙勫灴閹晝绱掑Ο濠氭暘婵犵妲呴崑鍛存儎椤栨凹鍤曢柟鎯板Г閺呮繈鏌涚仦鍓с�掗柛姗嗕邯濡懘顢曢姀鈩冩倷濡炪倖鍨甸幊姗�寮幘缁樺殟闁靛／鍐ｆ嫲闁诲氦顫夊ú姗�宕归崹顔炬殾闁绘梻鈷堥弫宥嗙箾閹寸偠澹樻鐐茬墛缁绘繈鎮介棃娑楁勃闂佹悶鍔岄悥濂稿极閸愵噮鏁冮柨鏃�鍎宠ぐ鍡楊渻閵堝棗绗傛俊鐐村笧閹广垽宕卞☉娆戝幈闂佸湱鍋撻〃鍛村疮椤愶妇宓侀悗锝庡枟閳锋垿鏌涘┑鍡楊伀闁绘帟娉曠槐鎾愁吋閸曨厾鐛㈠Δ鐘靛仜閸熸挳宕洪敓鐘插窛妞ゆ梹鍎虫慨鎼佹煟鎼达紕鐣柛搴″船铻炴い鎾卞灪閺呮悂鏌ら幁鎺戝姢濠⒀冪仛閹便劍绻濋崘鈹夸虎濡ょ姷鍋為悧鐘诲箖濞嗘挸绠甸柟鐑樼箘閿熺晫鍏樺缁樻媴娓氼垱鏁┑鐐叉噺濞茬喖鐛幋锕�鐐婃い鎺炴嫹缂佺姵鐗曡灃闁挎繂鎳庨弳鐐烘煕婵犲偆鐓奸柡灞诲�濋獮渚�骞掗幋婵嗩潛濠电偛鐡ㄧ划宥囧垝閹炬剚娼栭柧蹇撴贡绾惧吋淇婇婵愬殭缁炬澘绉撮埞鎴︽倷瀹割喖娈堕梺绋跨箲椤牆螞閻斿吋鍋℃繝濠傚閻撱儲銇勯銏㈢閻撱倖銇勮箛鎾愁仼缂佹劖绋掔换婵嬫偨闂堟刀銏ゆ煕婵犲啯鍊愮�殿喚顭堥埢搴ㄥ箻缁瀚奸梻浣藉吹閸犳劕顭垮Ο琛℃灁闁冲搫鎳忛悡娆撴煕閹存瑥锟芥牜锟芥熬鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈功缁犻箖鏌ㄩ悢璇残撶紒缁樼♁閹峰懘宕橀崣澶嬫倷缂佺偓宕橀褔鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴銏犖ч煫鍥ㄦ煥椤忚泛鈹戦绛嬬劷闁告鍕珷濞寸厧鐡ㄩ悡娆愵殽閻愯尙浠㈤柣蹇撳级椤ㄣ儵鎮欓弶鎴炶癁閻庢鍣崳锝夊极閹惧顩烽悗锝庝簼鏉堝牆鈹戦悩璇у伐闁绘锕幃锟犲即閵忥紕鍘撻梺瀹犳〃缁�渚�寮抽悢鍏肩厓闁告瑣鍎崇粣鏃堟煛瀹�瀣М妤犵偞锕㈠畷锟犳倷閹绘崼鏇㈡⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繈骞嬮敃锟界粻鏍煏閸繍妲哥痪鎯у悑缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�?");
			return;
		}
		new fire.pb.fushi.PQueryOrderResponseNew(this).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 8905;

	public int getType() {
		return 8905;
	}

	public final static int restype_query = 0; // 查询返回结果
	public final static int restype_notify = 0; // 主动通告返回结果

	public int errorcode;
	public int restype;
	public java.lang.String platid; // 平台唯一标识
	public java.lang.String orderserialplat; // 平台用的订单号
	public java.lang.String orderserialgame; // 游戏内自己用的订单号
	public int userid; // 如果返回的结果中，并没有userid的信息，该值为-1
	public com.locojoy.base.Octets vars;

	public QueryOrderResponse() {
		errorcode = ErrorCodes.error_succeed;
		restype = restype_query;
		platid = "";
		orderserialplat = "";
		orderserialgame = "";
		userid = -1;
		vars = new com.locojoy.base.Octets();
	}

	public QueryOrderResponse(int _errorcode_, int _restype_, java.lang.String _platid_, java.lang.String _orderserialplat_, java.lang.String _orderserialgame_, int _userid_, com.locojoy.base.Octets _vars_) {
		this.errorcode = _errorcode_;
		this.restype = _restype_;
		this.platid = _platid_;
		this.orderserialplat = _orderserialplat_;
		this.orderserialgame = _orderserialgame_;
		this.userid = _userid_;
		this.vars = _vars_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(errorcode);
		_os_.marshal(restype);
		_os_.marshal(platid, "UTF-16LE");
		_os_.marshal(orderserialplat, "UTF-16LE");
		_os_.marshal(orderserialgame, "UTF-16LE");
		_os_.marshal(userid);
		_os_.marshal(vars);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		errorcode = _os_.unmarshal_int();
		restype = _os_.unmarshal_int();
		platid = _os_.unmarshal_String("UTF-16LE");
		orderserialplat = _os_.unmarshal_String("UTF-16LE");
		orderserialgame = _os_.unmarshal_String("UTF-16LE");
		userid = _os_.unmarshal_int();
		vars = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof QueryOrderResponse) {
			QueryOrderResponse _o_ = (QueryOrderResponse)_o1_;
			if (errorcode != _o_.errorcode) return false;
			if (restype != _o_.restype) return false;
			if (!platid.equals(_o_.platid)) return false;
			if (!orderserialplat.equals(_o_.orderserialplat)) return false;
			if (!orderserialgame.equals(_o_.orderserialgame)) return false;
			if (userid != _o_.userid) return false;
			if (!vars.equals(_o_.vars)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += errorcode;
		_h_ += restype;
		_h_ += platid.hashCode();
		_h_ += orderserialplat.hashCode();
		_h_ += orderserialgame.hashCode();
		_h_ += userid;
		_h_ += vars.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(errorcode).append(",");
		_sb_.append(restype).append(",");
		_sb_.append("T").append(platid.length()).append(",");
		_sb_.append("T").append(orderserialplat.length()).append(",");
		_sb_.append("T").append(orderserialgame.length()).append(",");
		_sb_.append(userid).append(",");
		_sb_.append("B").append(vars.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


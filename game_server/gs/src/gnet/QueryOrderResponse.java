
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
			FushiManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柟缁㈠枛绾惧ジ鏌曟繛褍瀚弸鎴︽⒑閸濆嫬鏆欓柣妤�妫涚划濠氬冀閵娧咁啎閻庣懓澹婇崰鏇犺姳婵犳艾绠氶柣鏂垮悑閳锋垿姊婚崼鐔剁繁婵☆垰鐗撻弻娑㈡偐閹颁焦鐣肩紓浣戒含閸嬬偤骞嗛弮鍫濐潊闁靛繈鍨诲Σ鍥⒒娴ｅ湱婀介柛銊ㄦ椤洩顦抽柣妤�閰ｅ缁樻媴閸濆嫬浠樼紓鍌氱Т閿曪妇鍒掓繝姘唨鐟滄粓宕甸弴銏＄厱婵炴垶锕崝鐔兼煟閻旈绉洪柡灞诲姂閹垽宕滄担铏瑰幆闁诲孩顔栭崰鏍�﹀畡閭﹀殨闁圭虎鍠栭～鍛存煟濡鍤欓柡浣筋潐缁绘繈鎮介棃娑掓瀰濠电偘鍖犻崗鐘虫そ婵℃悂鍩℃担鍕撳嫨浜滈柟鏉跨埣濡绢噣鏌嶉柨瀣伌闁哄本鐩弫鍌滄嫚閹绘帞顔愰梻浣告啞閿氶柣掳鍔戞俊鐢稿礋椤栨銊╂煥閺冨洦顥夌痪鎯у暱铻栭柣姗�娼ф禒婊勩亜閿旂偓鏆柣娑卞枛椤粓鏁撴禒瀣拷浣糕枎閹炬潙娈愰梺鍐叉惈閿曘儲鏅ュ┑鐘殿暜缁辨洟宕戦幋锕�纾归柡宥庡幖缁犱即鏌ｉ幇闈涘闁告瑥绻橀弻锝夊箣閿濆棭妫勫┑顔炬嚀瀵爼濡甸崟顖氱疀闁告挷鐒﹂崑褏绱撴担鍙夘潐闁归鍏樺缁樻媴閸︻厽鑿囬梺鎼炲姀濡嫰鈥﹂崶顏嶆▌濡炪們鍨洪幑鍥嵁濡偐纾兼俊顖滃帶楠炲秴鈹戦敍鍕粶妞ゆ垵鎳忛〃銉╁箹娴ｇ鍋嶉梺鍦檸閸犳鎮″☉銏″�堕柣鎰絻閳锋梹绻涢崣澶嬬稇闁宠鍨块弫宥夊礋椤愩垹绠ｆ俊鐐�戦崹娲偡閳哄懎绠栭柍鈺佸暞閸庣喐銇勯弮锟介崹婵嗩潩閿斿墽纾介柛灞捐壘閿熻姤鎮傚畷鎰槹鎼淬埄鍋ㄩ梺闈涚墕椤︻垳绮婚婊愭嫹閻熸澘顏柛瀣躬閹垽宕卞☉娆戝幘闂佸綊妫块悞锕�鈽夎閳规垿顢欓懖鈺佲叺闂佸搫鐭夌紞渚�鐛锟藉畷姗�宕ｆ径瀣靛晪闂傚倷绀侀幖顐﹀嫉椤掞拷鐓ゆ俊顖欒閸ゆ鏌涢弴銊ョ仩闂佸崬娲︾换婵嬫濞戞瑱绱為梺璇插閹稿啿顫忕紒妯诲闁惧繒鎳撶粭锛勭磽娴ｇ瓔鍤欑紒澶屾暩缁顓兼径妯绘櫆闂佸壊鍋呯换鍡涘箺閺囥垺鈷戦柟绋挎捣缁犳捇鏌熼崘宸█鐎殿喓鍔嶇粋鎺旓拷锝庡亞閸橀亶姊洪崫鍕偍闁告柨鏈粋宥嗐偅閸愨晝鍘甸悗鐟板濠㈡ê危婵犳碍鐓冮悷娆忓閻忊晠鏌ㄩ悢鍛婄伄缂傚秴妫欑粋宥夋晲婢跺﹦顔戦梺鍝勬储閸ㄦ椽鍩涢幋锔解拻闁割偆鍠嶇欢閬嶆煟閹烘鐣洪柡灞剧♁閹棃顢欓崗鑲╀邯闂佸憡顨婃禍鍫曞蓟濞戙埄鏁冮柕鍫濇噺閻庤櫣绱撴担绛嬪殭婵☆偅鐟╂俊鐢稿礋椤栨艾鍞ㄩ梺闈浤涢崨顖涙婵犵數鍋涢悺銊у垝鎼淬劌绠犻柟鍓х帛缁犳帡姊绘担铏瑰笡闁圭鎽滈敓鑺ョ▓閺呯娀鐛弽顓炵疀妞ゆ挻绮堢花璇差渻閵堝懐绠伴悗姘煎墴瀵娊鏁愰崨顏呮杸闂佺偨鍎辩壕顓㈠春閿濆浄鎷风憴鍕鐎规洦鍓濋悘鍐⒑閸涘﹤澹冮柛鎰电厛閸ゆ瑧绱撻崒姘拷鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帪鎷烽柡鍕╁劦閺屸�崇暤椤斿吋鍣烘繛鍫熸礋濮婇缚銇愰幒鎿勭吹闂佺厧鐤囧▔娑㈡偩閸偆鐟归柨鐔剁矙瀵鈽夐姀鐘靛姶闂佸憡鍔楅崑鎾绘偩婵傚憡鈷戦柛婵嗗椤ユ粍淇婇锝囩疄鐎殿喛顕ч埥澶愬閻樻彃绁梻渚�娼ч…鍫ュ磿閹殿喛濮抽柦妯侯樈濞撳鏌曢崼婵堢缂侊拷鐎ｎ喗鐓曢柡鍐挎嫹闁搞劎鏁婚敐鐐剁疀閹句焦妞介、鏃堝川椤撶喓鏆熼梻鍌欑閸熷灝锕㈤柆宥呯；闁规崘顔愰幏宄邦潩椤撶姵鍒涘┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告劑鍔戦悗娲⒒娴ｅ搫甯剁紓宥咃功缁寮介鐐存К闂侀潧绻堥崐鏇犵不缂佹绠鹃柤纰卞墰鐢盯鏌￠崪浣烽偗婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥矮鍗抽弫鎰版倷閸撲胶鏉稿┑鐐村灦閻燂箓宕曢鍫熲拺闂傚牃鏅涢惁婊堟煕濮楋拷缁犳牠骞冮敓鐘茬缂備焦顭囬崢浠嬫⒑缂佹◤顏堝储閺嶎厽鍤嬫い蹇撶墛閻撴洟鏌￠崒姘仴闁告瑥瀚伴弻鐔碱敊閸忕厧浠撮悗瑙勬礈閸犳牠銆佸☉妯锋闁圭儤鎸搁褰掓⒒閸屾瑧顦﹂柟璇х磿缁瑩骞嬮敂鑺ユ珖闂侀潧顦弲婊堝磻閸岀偞鐓忓璇″灠閹虫劙鏁嶅鍕瘈闁靛骏绲剧涵楣冩煛閸偄澧寸�殿喗濞婇、妤呭磼閿旇棄顏跺┑鐐茬墕閻忔繈寮搁悢鍏肩厽闁圭虎鍨介幏宄扮暦閸ャ劍顔曞┑鐘绘涧閸婂鈥﹂崼銉ョ闁规儼濮ら悡蹇撯攽閻樿尙绠绘俊缁㈠枟缁绘盯宕ㄩ鐘樠勬叏婵犲嫮甯涢柟宄版嚇閹煎綊鎮烽幍顕呭仹闂傚倷鐒︾�笛冪暆閹间礁钃熸繛鎴烇供濞尖晠鏌ｉ幇闈涘妞ゅ繐澧庣槐鎾诲磼濮橆剨鎷烽悜鑺ュ�块柨鏇炲�堕敓钘夊暣瀹曘劌顫㈤妶鍛枠婵☆偄鍟埥澶嬫綇閵娧呪枆闂傚倷鐒﹂崕宕囨崲閹烘垟鏋嶉柕蹇嬪�曠粻顖炴煟閹达絾顥夐柟纭呭煐閵囧嫰骞樼捄鐚存嫹椤愶附鏅查柛鈩冨姃缁ㄥ姊洪棃娑辨Ф闁稿骸鎼灒闁跨喍绮欏娲传閸曨厾浼囬梺鍝ュУ閻楃娀鐛弽顑句汗闁圭儤绻冮弲婵嬫⒑闂堟稓绠冲┑顖ｅ幖椤洭寮撮悩鐢碉紳闂佺鏈悷褏鎷规导瀛樼厱闁绘ê纾晶鐢告煙椤斻劌瀚弧锟介梺绋胯閸婃洖鈻撻锔解拺闁告稑锕ユ径鍕煕鐎ｎ亝顥㈢�殿喗濞婂畷鍗炩槈濞嗘垵寮抽梻浣虹帛濮婂宕曢妶鍛瀺闁哄洨鍎愰悢鍡涙偡濞嗗繐顏紒锟介崘顏嗙＜閺夌偞澹嗛惌娆戯拷瑙勬磸閸斿秶鎹㈠┑瀣妞ゆ劑鍨婚悿鍕⒒閸屾瑦绁版い鏇嗗懏宕查柟鐑橆殔绾剧粯绻涢幋鐐垫噭婵炲懐濮撮湁闁绘ê妯婇崕蹇曠磼閻橀潧鈻堥柡灞剧洴閸╁嫰宕橀浣诡�囬梻浣虹帛閹歌煤閻斿吋鍋傛い鎰剁畱閻愬﹪鏌曟繝蹇曠暠闁哄棙顨婂铏圭磼濡櫣鐟查梺璇″枛閸婂灝顕ｆ繝姘櫖闁告洦浜濋崟鍐磽娴ｅ壊鍎忛柣蹇旂箞閸╂稒寰勯幇顓涙嫼闂佽崵鍠愬妯何ｆ繝姘厵闁惧浚鍊嬮鍥╀罕闂備礁鎲￠崝鎴﹀礉婢跺á锝夊醇閵夛妇鍙勯棅顐㈡祫缁茶姤绂嶅鍕╀簻闊洦纰嶇涵楣冩煃鐟欏嫬鐏撮柟顔规櫇缁辨帒螣婵犳碍鏆樺┑鐘殿暯濡插懘宕戦崨瀛樺剮妞ゆ牗鍑归崵鏇㈡煙閹澘袚闁哄懏绻堥弻娑氫沪閸撗侊拷鎺楁煕濮楀棔閭俊顐㈡嚇椤㈡洟濮�閳╁啯鍊锋俊鐐�栭崹鐢稿箠濮楋拷瀵偊骞樼紒妯烘疅闂侀潧锛忛崘锝嗗闂佽姘﹂～澶娒哄锟藉畷褰掑垂椤旂偓娈鹃梺缁樻⒒閳峰牓寮鍡欑闁瑰鍋犳竟妯活殽閻愯尙澧涚紒缁樼箞閹粙妫冨☉妤佸媰闂備焦鎮堕崝宀勬偉婵傜鏋侀柛鎰靛櫘閺佸啴鏌ㄩ弮锟介崕瀹犮亹閸℃娓婚柕鍫濇缁楀倹淇婇悙鏉戠闁瑰箍鍨藉畷鍗炩槈濞嗘垵骞堥梻浣告贡閸嬫捇銆冮崨鏉戠柈妞ゆ劧濡囧畵渚�鎮楅敐搴℃灍闁抽攱鍨块弻娑樷攽閸℃浼�闂佺粯甯熷▔鏇犳閹炬剚鍚嬮柛鏇ㄥ幘閻涖垹螖閻橀潧浠滈柛鐔告尦瀹曟椽鏁撻悩鎻掔獩濡炪倖姊归崕铏叏閹间焦鐓熼幖杈剧磿閻ｎ參鏌涙惔鈥宠埞閾荤偞銇勯幘鍗炵仾闁哄懏鎮傞弻銈夊箒閹烘垵濮㈡繝鈷�鍐粵闁逛究鍔嶇换婵嬪礃閳瑰じ铏庢俊銈囧Х閸嬬偤鎮ч悩璇茬畺婵炲棙鎸哥粻鐢告煙閻戞绠橀柨鐔烘櫕閸忔ê顫忕紒妯诲濞撴凹鍨遍弫顖氣攽閻愬弶鍣烘繛鑼枛閻涱噣骞嬮敃锟介悙濠冦亜閹虹偞瀚圭紓浣哄У閻楁洝鐏冮梺鎸庣箓閹冲酣寮抽悙鐑樼厱濠电姴鍋嗛悡濂告煛鐏炶锟芥繈鐛笟锟介獮鎺楀箣濠靛棭娼涙繝鐢靛仜閻°劎鍒掑鍥у灊闁圭偓鍓氬鏍煣韫囨挻璐＄痪鎯у悑娣囧﹪顢涘┑鎰缂佺偓婢樼粔鎾煘閹达附鍊风�瑰壊鍠栧▓鍫曟⒑缁嬭法绠叉い顓炵墕铻為柣鏂垮悑閸嬧剝绻濇繝鍌氼仾闁绘挶鍎查妵鍕敃閵忋垻顔囬柣鎾卞�栭妵鍕疀閹炬剚浠肩紓浣瑰姈缁嬫帞鎹㈠┑瀣仺闂傚牊鍒�閵忋倖鐓曞┑鐘插暞閸婃劗锟芥鍠氶…鍫ュ煝鎼淬劌绠荤紒顔款潐鐎氬ジ姊绘担钘夊惞闁哥姵鍔曢…鍨熺悰鈩冪亖闂佸啿鎼幊蹇涙偂濞嗘挻鐓曢柟瀛樼懃閿熻姤鐗滈敓鑺ョ啲閹凤拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堝姛缂佺娀绠栭弻銊╂偄鐠囨畫鎾剁磼缂佹鈾侀柟宄版嚇瀹曟﹢宕ｆ径瀣�风紓浣哄亾瀹曟﹢顢氳閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘垹纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欑粵瀣姺闂佸憡顭嗛崟顒佺彿婵炲鍘ч悺銊╂偂濞嗘劦娈介柣鎰皺娴犮垽鏌ｈ箛鎾崇骇妞ゃ劊鍎甸幃娆撳级閹寸偠鐧侀柣搴㈩問閸ｎ噣宕抽敐澶婃瀬闁规儳顕々鐑芥倵閿濆簼绨奸弶鍫濈墕閳规垿鎮╃拠褍浼愰梺缁橆殔閿曨亪骞冮敓鐘插嵆闁靛骏绱曢崢鎾绘⒑鐎圭姵銆冪紒锟芥笟锟藉鎶芥偄閸忚偐鍘撻梺鍛婄懀閸庡磭绮ｉ弮鍫熺厸鐎癸拷鐎ｎ剛袦濡ょ姷鍋為敃銏犵暦閿熺姵鍊烽柟缁樺醇閺囥垺鈷掑ù锝呮啞閹牓鎮跺鐓庝喊鐎规洘绻堥獮瀣晝閿熺晫绮婚弽顓熺厪闁割偅绻嶅Σ鍝ョ棯閹冩倯缂佺粯鐩獮瀣倻閸ワ妇杩斿┑鐐差嚟閵嗗骞忛敓锟�?");
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


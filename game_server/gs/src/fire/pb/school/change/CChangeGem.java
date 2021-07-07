
package fire.pb.school.change;
import org.apache.log4j.Logger;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeGem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗嗘慨娑氱磽娴ｅ搫鈻堢紒鐘崇墵瀵濡搁埡鍌氫簻闁荤姴娲﹂悾顐﹀箻閸撲胶锛滅紓鍌欑劍椤洭鍩︽笟锟介弻鐔风暋閻楀牆娈楅悗瑙勬礃閿曘垹鐣烽敐鍡楃窞閻庯綆鍋勯敓浠嬵棑缁辨挻鎷呴崫鍕闂佺楠搁崯鍧楁晝閵忋倖鐒肩�广儱鎳愰悿鍛存⒑瑜版帗锛熼柣鎺炵畵瀹曟垹锟斤綆鍠楅悡鏇熴亜閹板墎鎮肩紒鐘成戦妵鍕疀閹垮啰鍚嬪┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘娴滅偞绻濈喊妯活潑闁稿瀚敓鑺ョ濠㈡﹢鎮鹃悜绛嬫晬闁绘垵妫欓弲顒�鈹戦绛嬬劷闁告鍐ｆ灁妞ゆ劧闄勯埛鎴︽煕濞戞﹫鏀诲璺哄閺屾盯濡搁敃锟介ˉ瀣磼椤旀鍤欓柍钘夘樀婵拷闁挎稑瀚獮鍫ユ⒒娴ｇ瓔娼愬鐟版瀵偊骞栨担绋垮亶濠电偞鍨堕悷銈囨崲閸℃稒鐓欑紓浣姑粭姘舵偣閹板墎纾跨紒杈ㄥ笚濞煎繘濡搁妷褜鍎岀紓鍌欐祰妞村摜鏁幒鏇犱航闂備礁鍚嬬粊鎾疾濠靛绾уù鐘差儐閻撶喖骞栧ǎ顒�锟姐倕顭囬幇顓犵闁告瑥顦辨晶鐢告煙椤斿搫鍔︾�规洘顨婂鑽わ拷闈涙憸閻ｉ箖姊绘担鍝ョШ婵☆偉娉曠划鍫熸媴閸涘﹥娈版繝纰夌磿閸嬫垿宕愰弽顓熷亱婵°倕鍟伴惌娆撴煙鏉堟儳鐦滈柡浣稿�块弻娑㈩敃閿濆棛顦ㄩ梺鎶芥敱閸ㄥ湱妲愰幘瀛樺濠殿喗鍩堟禍顏堝箖濮楋拷瀹曪繝鎮欓埡鍌涙澑婵＄偑鍊栭弻銊╁箹椤愶附鏅搁柤鎭掑劤缁犵偞顨ラ悙鎻掓殻闁轰焦鎹囬幃鈺呭礃闊厾鐩庨梻鍌欒兌椤牏鎹㈠Δ鍛；闁圭増婢橀崒銊ッ归悩宸剱闁抽攱鍨块弻娑樷攽閸℃浠奸梺璺ㄥ枙濡嫬锕㈤柆宥嗘櫢闁伙絽鐬奸幊妤呮煕閵夋垵鎳忛悞楣冩⒒娴ｈ櫣甯涢柛鏃�顨婂顐﹀传閵夈儺妫滄繝闈涘�搁幉锟犲磻閿濆鐓曟繝闈涙椤忣亪鏌熼姘卞ⅱ缂佽鲸甯￠幃顏勨枎韫囨柨顦╅梺缁樻尭缁绘﹢寮诲☉銏犖ㄩ柟瀛樼箓閺嬨倕霉閻撳骸鏆ｉ柟顔筋殔閳绘捇宕归鐣屼憾闂備胶鎳撻幉鈩冪箾婵犲洤违濞撴熬鎷风�殿噮鍣ｅ畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃牠骞愰崱娑樼＜婵犲﹤鍠氬Σ锟�
public class CChangeGem extends __CChangeGem__ {
	public static final Logger logger = Logger.getLogger("ITEM");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		logger.error("-----------------------------濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗嗘慨娑氱磽娴ｅ搫鈻堢紒鐘崇墵瀵濡搁埡鍌氫簻闁荤姴娲﹂悾顐﹀箻閸撲胶锛滅紓鍌欑劍椤洭鍩︽笟锟介弻鐔风暋閻楀牆娈楅悗瑙勬礃閿曘垹鐣烽敐鍡楃窞閻庯綆鍋勯敓浠嬵棑缁辨挻鎷呴崫鍕闂佺楠搁崯鍧楁晝閵忋倖鐒肩�广儱鎳愰悿鍛存⒑瑜版帗锛熼柣鎺炵畵瀹曟垹锟斤綆鍠楅悡鏇熴亜閹板墎鎮肩紒鐘成戦妵鍕疀閹垮啰鍚嬪┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘娴滅偞绻濈喊妯活潑闁稿瀚敓鑺ョ濠㈡﹢鎮鹃悜绛嬫晬闁绘垵妫欓弲顒�鈹戦绛嬬劷闁告鍐ｆ灁妞ゆ劧闄勯埛鎴︽煕濞戞﹫鏀诲璺哄閺屾盯濡搁敃锟介ˉ瀣磼椤旀鍤欓柍钘夘樀婵拷闁挎稑瀚獮鍫ユ⒒娴ｇ瓔娼愬鐟版瀵偊骞栨担绋垮亶濠电偞鍨堕悷銈囨崲閸℃稒鐓欑紓浣姑粭姘舵偣閹板墎纾跨紒杈ㄥ笚濞煎繘濡搁妷褜鍎岀紓鍌欐祰妞村摜鏁幒鏇犱航闂備礁鍚嬬粊鎾疾濠靛绾уù鐘差儐閻撶喖骞栧ǎ顒�锟姐倕顭囬幇顓犵闁告瑥顦辨晶鐢告煙椤斿搫鍔︾�规洘顨婂鑽わ拷闈涙憸閻ｉ箖姊绘担鍝ョШ婵☆偉娉曠划鍫熸媴閸涘﹥娈版繝纰夌磿閸嬫垿宕愰弽顓熷亱婵°倕鍟伴惌娆撴煙鏉堟儳鐦滈柡浣稿�块弻娑㈩敃閿濆棛顦ㄩ梺鎶芥敱閸ㄥ湱妲愰幘瀛樺濠殿喗鍩堟禍顏堝箖濮楋拷瀹曪繝鎮欓埡鍌涙澑婵＄偑鍊栭弻銊╁箹椤愶附鏅搁柤鎭掑劤缁犵偞顨ラ悙鎻掓殻闁轰焦鎹囬幃鈺呭礃闊厾鐩庨梻鍌欒兌椤牏鎹㈠Δ鍛；闁圭増婢橀崒銊ッ归悩宸剱闁抽攱鍨块弻娑樷攽閸℃浠奸梺璺ㄥ枙濡嫬锕㈤柆宥嗘櫢闁伙絽鐬奸幊妤呮煕閵夋垵鎳忛悞楣冩⒒娴ｈ櫣甯涢柛鏃�顨婂顐﹀传閵夈儺妫滄繝闈涘�搁幉锟犲磻閿濆鐓曟繝闈涙椤忣亪鏌熼姘卞ⅱ缂佽鲸甯￠幃顏勨枎韫囨柨顦╅梺缁樻尭缁绘﹢寮诲☉銏犖ㄩ柟瀛樼箓閺嬨倕霉閻撳骸鏆ｉ柟顔筋殔閳绘捇宕归鐣屼憾闂備胶鎳撻幉鈩冪箾婵犲洤违濞撴熬鎷风�殿噮鍣ｅ畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃牠骞愰崱娑樼＜婵犲﹤鍠氬Σ锟�--濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗嗘慨娑氱磽娴ｅ搫鈻堢紒鐘崇墵瀵濡搁埡鍌氫簻闁荤姴娲﹂悾顐﹀箻閸撲胶锛滅紓鍌欑劍椤洭鍩︽笟锟介弻鐔风暋閻楀牆娈楅悗瑙勬礃閿曘垹鐣烽敐鍡楃窞閻庯綆鍋勯敓浠嬵棑缁辨挻鎷呴崫鍕闂佺楠搁崯鍧楁晝閵忋倖鐒肩�广儱鎳愰悿鍛存⒑瑜版帗锛熼柣鎺炵畵瀹曟垹锟斤綆鍠楅悡鏇熴亜閹板墎鎮肩紒鐘成戦妵鍕疀閹垮啰鍚嬪┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘娴滅偞绻濈喊妯活潑闁稿瀚敓鑺ョ濠㈡﹢鎮鹃悜绛嬫晬闁绘垵妫欓弲顒�鈹戦绛嬬劷闁告鍐ｆ灁妞ゆ劧闄勯埛鎴︽煕濞戞﹫鏀诲璺哄閺屾盯濡搁敃锟介ˉ瀣磼椤旀鍤欓柍钘夘樀婵拷闁挎稑瀚獮鍫ユ⒒娴ｇ瓔娼愬鐟版瀵偊骞栨担绋垮亶濠电偞鍨堕悷銈囨崲閸℃稒鐓犵痪鏉垮船婢ь垶鏌涢妶蹇斿闂備礁鍚嬬�笛囧礉濞嗘挸钃熸繛鎴欏灩鍞梺鐟扮摠缁诲嫬鏆╅梻浣告啞閸戝綊宕戞繝鍥х畺婵°倕鍟崰鍡涙煕閺囥劌澧伴柍瑙勭〒缁辨挻鎷呴搹鐟扮缂備浇顕ч悧鎾诲箖娴兼惌鏁婇柣锝呯灱閹虫繈姊虹捄銊ユ瀺缂侇喗鐟ラ锝夘敃閿曪拷缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�-"+tanzhuangKey+"--婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯虹仴婵炶绲垮▎銏ゆ偨閸涘ň鎷洪梺纭呭亹閸嬫盯鏁撻懞銉уⅹ閻撱倝鏌ｉ弮鍌氬付闁藉啰鍠愮换娑㈠箣濞嗗繒鍔撮梺杞扮閸熸挳寮婚妸銉㈡斀闁糕剝锕╁Λ銈夋⒑閹稿海鈾侀柨鏇樺灩椤繘鎼圭憴鍕／闂侀潧顭堥崕鏌ユ倶閸℃せ鏀介柍钘夋娴滄粓鎮楀顓熺凡闁伙絿鍏橀、娑㈡倷閼碱剟鐛撻梻浣烘嚀椤曨厽鎱ㄩ棃娑掓灁闁绘劦鍓涚弧锟介梻鍌氱墛缁嬫垿鏁撻挊澶樼吋闁炽儻绠撳畷濂稿Ψ椤栨粎鈼ら梻浣告啞缁嬫垿鎮洪妸鈺傚亗闁绘棃鏅茬换鍡樸亜閺嶃劍鐨戝ù鐘灲閺岋綁濡搁妷锔藉創闂傚洤顦扮换婵囩節韫囨柨顏堕梻浣告啞椤ㄥ棙绻涙繝鍌ゅ殨濠电姵纰嶉弲鏌ユ煕閳╁厾顏堝礉閸涘瓨鈷戦柟绋挎捣缁犳挻淇婇顐㈠箺缂佸倹甯熼ˇ瑙勬叏婵犲洨绱伴柕鍥ㄥ姍楠炴帒鈹戦崶鑸殿棝闂傚倷鑳堕…鍫㈡崲閹达附鏅濋柕蹇曞閸ゆ洟鎮归崶銊с偞婵℃彃鐗撻弻鏇＄疀閺囩倫銏拷瑙勬尭濡繂顫忓ú顏咁棃婵炴垼浜崝鎼佹⒑缁嬪潡鍙勫ù婊冪埣閺佹劙鎮欓崫鍕幐闂佸憡渚楅崰鎺楀箯濞差亝鈷戦柛娑橈功閳藉鏌ㄩ弴妯哄姢濞存粍鎮傞、姗�鎮╅悽纰夌闯闁诲骸绠嶉崕閬嶅箯閹存繍鍟呴柕澶涜礋娴滄粍銇勯幇鈺佺伄缂佺姾宕甸敓鍊燁潐濞诧箓宕戞繝鍌滄殾婵犻潧顑呯壕褰掓煟閺傚灝顥忓ù鐘櫊濮婇缚銇愰幒婵囶棖婵犵數鍎戦幏鐑芥倵鐟欏嫭绌跨紒鍙夊劤椤曘儵宕熼婵囧媰闂佺粯鎸哥�垫帒螞濠婂啠鏀介柣妯活問閺嗘粎绱掓潏銊︾鐎规洘鍨块獮瀣晝閿熺晫澹曡ぐ鎺撶厪闁割偅绻嶅Σ鍝ョ棯閹岀吋闁哄本鐩鎾Ω閵夈倗鐖遍梻浣告惈椤戝懐绮旇ぐ鎺戣摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹-"+xilianshiTypeId+"-----------------------------");
		new PChangeGem(roleId, tanzhuangKey, xilianshiTypeId).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810491;

	public int getType() {
		return 810491;
	}

	public int gemkey; // 要转换宝石的itemKey
	public int newgemitemid; // 要转换宝石的itemId

	public CChangeGem() {
	}

	public CChangeGem(int _gemkey_, int _newgemitemid_) {
		this.gemkey = _gemkey_;
		this.newgemitemid = _newgemitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(gemkey);
		_os_.marshal(newgemitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		gemkey = _os_.unmarshal_int();
		newgemitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeGem) {
			CChangeGem _o_ = (CChangeGem)_o1_;
			if (gemkey != _o_.gemkey) return false;
			if (newgemitemid != _o_.newgemitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += gemkey;
		_h_ += newgemitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(gemkey).append(",");
		_sb_.append(newgemitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChangeGem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = gemkey - _o_.gemkey;
		if (0 != _c_) return _c_;
		_c_ = newgemitemid - _o_.newgemitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


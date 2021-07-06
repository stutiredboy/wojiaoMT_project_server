package fire.pb.game;

import fire.log.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLogPushToken__ extends mkio.Protocol { }

/** 推送Token日志
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLogPushToken extends __CLogPushToken__ {
	public static final Logger logger = Logger.getLogger("PUSH");
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		// protocol handle
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿瀹曪絾寰勫Ο鐑╂瀳闂傚倷鑳剁划顖滄暜閹烘鏅濇い蹇撶墕閽冪喖鏌￠崶鈺佹灁缂佺娀绠栭弻锝夊箛闂堟稑顫梺缁樼箖濮婅崵妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚烽崥鍛存⒒娴ｇ懓顕滅紒璇插�块獮澶娾槈閵忕姷顔掔紓鍌欑劍椤洭宕㈤柆宥嗙厽閹兼惌鍨抽崚鏉款熆瑜嶅ù椋庡垝閺冨牜鏁嬮柨鐔剁矙瀵鏁嶉崟顏呭媰闂佸憡鎸嗛敓钘壩ｉ崼銉︹拺閻庡湱濯鎰版煕閵娿儳浠㈤柣锝囧厴瀹曪繝鎮欏鍡樷拹缂佺粯绻冮幏鍛存倻濮楀牏纭�闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅梺鍝勭▉閸樺ジ宕归崒姣綊鎮℃惔锝嗘喖闂佺顑呴澶愬蓟閻旂厧绠查柟浼存涧濞堫參姊洪挊澶婃殶闁哥姵鐗犲濠氬Ω閵夈垺鏂�闂佺硶妾ч弲婊呯懅缂傚倸鍊烽懗鑸垫叏閹绢喒锟斤箓鎮滈挊澶庢憰濠电偞鍨崹鍦不濞戞瑣浜滈柡宥囨暩閸掔増绻涢崼鐔虹疄婵﹪缂氶妵鎰板箳濠靛浂妫栭梻浣侯焾缁绘垿鏁嬮梺浼欑秮椤ユ挾鍒掑▎鎴炲珰闁绘劦鍓氶ˉ鍫ユ煛娴ｈ宕岄柟顔藉劤閻ｆ繈鏁撻懞銉р枖鐎广儱顦伴悡娑氾拷骞垮劚閸燁偅淇婇搹鍦＜閻犲洤寮堕ˉ銏ゆ煛鐏炵偓绀嬬�规洜鍘ч埞鎴﹀炊瑜庨锟犳⒒娓氾拷濞艰崵寰婇崸妤�鐤炬い鎰堕檮閺呮悂鏌涙繝鍕珡婵炲吋鍔欓弻鐔煎箹娓氬洦顥栧┑鐐叉閸ㄥ綊锝炲┑鍫熷磯濡わ附瀵ч幉鐗堢節閻㈤潧浠﹂柛銊у枛楠炲﹪宕堕浣规闂佸搫鍊堕崐妤呮偩閸偒娈介柣鎰▕閸庡繘鏌嶇憴鍕伌鐎规洖鐖奸崺锟犳晸閼恒儳鐝堕柡鍥╁枔缁★拷闂佹眹鍨藉褎绂掑鍕╀簻闁哄洢鍔岄獮妤冪磼缂佹娲撮柡浣规崌閹儳鐣濋敓鐣屽婵傚憡鐓熸俊顖濇閿涘秴顭胯娴滄繈濡甸崟顖ｆ晝闁靛繈鍨婚鎺楁⒑閸︻厼甯剁紓宥咃躬楠炲啴鎮滈挊澶岄獓濠电偛妫欓崕鍐测枔椤撱垺鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰簻閻撱倝鏌曟繛鐐珔缂佹劖顨婇弻鐔煎箥椤旂⒈鏆梺绋款儑閸犳牠寮婚敓鐘茬倞闁宠桨绲块妷褏妫柟瑙勫姈椤ュ妫佹径鎰叆婵犻潧妫欓崳瑙勩亜閵夈儳绠婚柡灞剧♁閹棃濮�閻樺樊娼氶梻浣告惈閻ジ宕伴弽顓犲祦闁哄秲鍔嶆刊鎾煣韫囨凹娼愭慨锝呮喘閺岋絾鎯旈妶搴㈢秷濠电偛寮堕敋闁伙絾绻堥獮鏍ㄦ媴閸濆嫮銈﹂梻浣告贡閸庛倝宕甸敃鍌氱睄闁割偆鍠愬▍銏＄箾鐎电孝妞ゆ垵妫濆畷鎴﹀磼濞戞氨顔曢梺鐟扮摠閻熴儵鎮橀鍫熺厽闁规儳鐡ㄧ粈鍐磼缂佹绠栫紒缁樼箚缁犳盯寮▎鍙ョ处闂傚倸鍊烽懗鍓佸垝椤栨粍鏆滄い蹇撴娑撳秹鏌熼悙顒�澧柛銈嗘礋閺岋紕浠︾拠鎻掑Ф闂佽桨绀佸Λ婵嬪蓟閵娾晜鍋勯柛鎾茶兌閻撴捇姊虹化鏇熸珖闁稿鍊濋悰顔撅拷锝庡枟閺呮粓鏌﹀Ο渚闁归鍏橀幃婊堟嚍閵壯冨箰濠电姰鍨煎▔娑㈩敄閸涘瓨鍊堕柍杞版�ヨぐ鎺撳亹婵炲牐娉曢崝绋款渻閵堝簼绨婚柛鐔风摠娣囧﹪鎳滈崹顐㈠妳闂佺偨鍎辩壕顓㈩敊閹扮増鈷掑ù锝堟鐢稒銇勯妸銉︻棦妤犵偞鍔欓獮鏍ㄦ媴閻熼鎮ｉ梻浣虹帛閸ㄧ厧螞閸曨偅鏆滈梻鍌欑閻ゅ洤顩奸妸鈺傚殑闁割偅娲橀弲顒佺節婵犲倻澧涢柍閿嬪灩缁辨挻鎷呮慨鎴簼閹便劍寰勯幇顓炰哗濠电偞鍨堕悧鏇㈠礉閿旂瓔娈介柣鎰皺缁犲磭绱掓潏銊ョ瑨閾伙綁鏌ゅù瀣珦闁哥喎閰ｅ缁樻媴閻戞ê娈屾繝鈷�鍌滅煓閽樼喖鏌熼柇锕�骞橀柣婵婂煐娣囧﹪顢涘┑鍡楁優缂備胶濞�缁犳牠骞冨锟介幃娆撳箵閹虹偞瀚归柟闂寸劍閺呮悂鏌ら幁鎺戝姢濠⒀嗕含缁辨帡顢欑喊鍗炲壈濡炪倖鎸搁妶绋跨暦閵娾晛纾兼繛鎴炵懐濡啴鎮楃憴鍕８闁告梹鍨块妴浣糕枎閹惧磭鐣鹃悷婊冪Ф缁煤椤忓應鎷婚梺绋挎湰閻熴劑宕楃仦淇变簻闁靛繒濯村銉╂煃鐠囪尙效闁轰焦鍔栧鍕節閸曞墎骞㈠┑鐘垫暩閸嬬偤宕归悢鐓庣；闁瑰墽绮弲鎼佹煢濡警妲归柛銈呮处閵囧嫰濮�閳藉棙鐤侀悗瑙勬礃鐢帡鈥﹂妸鈺佹そ闁告劦浜滅花銉︾節绾板纾块柛瀣灴瀹曟劙寮介‖顒佺♁閹峰懐鎲撮崟顐紟闂備線娼ч悧鍡涙晬閸℃ê绶為柟閭﹀墴閸炲爼姊洪棃娑辨濠碘�虫喘瀹曘垽妫冨☉杈ㄥ瘜闂侀潧鐗嗗Λ娆撳煕閹烘鐓涢柛婊�绀佹禍浼存煙椤栨氨鐒告鐐村笒铻栧ù锝呮惈楠炲秶绱撻崒娆戭槮妞ゆ垵鎳愭禍鎼佸川閺夋垹鍝楅梺鐓庮潟閸娧囧箯閻戣棄鍨傛い鎰剁悼閸戯繝鏌ｆ惔銏犲毈闁告挾鍠栭獮鍐箚瑜夐弨浠嬫倵閿濆骸浜濇繛鍛灪缁绘稓锟界數顭堝瓭濡炪倖鍨甸幊搴㈡櫏闂佸搫琚崕鏌ユ偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?, RoleId=" + roleId + ", Token=" + token);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810374;

	public int getType() {
		return 810374;
	}

	public int token; // 客户端发来的token

	public CLogPushToken() {
	}

	public CLogPushToken(int _token_) {
		this.token = _token_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(token);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		token = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLogPushToken) {
			CLogPushToken _o_ = (CLogPushToken)_o1_;
			if (token != _o_.token) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += token;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(token).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLogPushToken _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = token - _o_.token;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

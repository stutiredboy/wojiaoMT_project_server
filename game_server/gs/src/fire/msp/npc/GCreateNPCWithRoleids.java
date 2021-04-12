
package fire.msp.npc;


import fire.pb.scene.Scene;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCWithRoleids__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCWithRoleids extends __GCreateNPCWithRoleids__ {
	
	public static final int HUA_JIAO_NPC_ID = 11153;
	public static final int SURPER_HUA_JIAO_NPC_ID = 11270;
	
	@Override
	protected void process() {
		// protocol handle
		NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,npc.npcbaseid, npc.name, npc.dir);
		Scene scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
		SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, new Position(posx, posy), n,npc.time);
		
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛鎺撶☉椤啴濡堕崘銊т痪闂佽崵鍟块弲娑㈡偩閻戣棄纭�闁绘垵妫欑�靛瞼绱撻崒娆戝妽閽冮亶鏌℃径瀣�愭慨濠勭帛閹峰懘鎼归悷鎵偧闂備礁鎲″褰掓偋閺団懇锟斤箓宕惰閺嬪酣鏌熼悙顒佺稇闁跨喕妫勯悥濂稿蓟閵娾晛鍗抽柣鎰嚋閹风柉銇愰幒鎾充簵闂侀潧顧�闂勫嫰宕ｈ箛鏃�鍙忔俊銈忔嫹婵☆偅顨婇悰顔嘉旈崨顔惧幈濠电偛妫楃换鎺旂不婵犳碍鐓涢悘鐐额嚙婵″ジ鏌嶇憴鍕伌鐎规洖宕灒濞撴凹鍨介幏宄扳槈濡攱鏂�闂佸疇妫勫Λ妤呮倶閺屻儲鐓欏瀣閸樺瓨鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶆繝鐢靛О閸ㄧ厧鈻斿☉妯忔椽顢橀悙鍨濠电姴锕ら崯鐘诲绩娴犲鐓曢柍鎾呮嫹闁哄懏绋戦埢鎾活敃閿旇В鎷洪梺鍛婄☉閿曘儲寰勯崟顖涚厱闁靛鍊曞畵鍡涙煛鐏炵瓔鍎旂�规洖鐖兼俊姝岊槾闁伙箑鐗撳濠氬磼濮樺崬顤�缂備礁顑嗙敮陇妫㈠┑鐘诧工閹冲繘宕戦弽銊ょ箚妞ゆ牗绺块敓鏂ゆ嫹闂佺尨鎷峰ù鐘差儐閻撶喐淇婇婵囶仩濞寸姵鐩弻锟犲幢韫囨梹鐝氶梺鍝勬湰缁嬫捇鏁撻弬銈囩У闁稿妫楃叅闁圭虎鍠楅悡娆愩亜閺傝濡奸悗姘煎枤瀵囨晸娴犲鈷戦柟鑲╁仜閸旓拷闂佸憡鍔戦崝瀣箟閸撗呯＝闁稿本鑹鹃敓鐣屽厴閹偤鏁冮崒姘鳖槷濠德板�曢幏瀣极閸曨垳鍙撻柛銉ｅ妿閳句線鏌嶉柨瀣诞闁哄本绋撴禒锕傚箲閹邦剦妫熼梻浣芥硶閸犲秶鍒掑▎鎾嶅骞樼捄鍝勭亰闂佸壊鍋嗛崰鎾绘偡瑜版帗鐓ラ柣鏂垮閻瑩鏌ｅ☉鍗炴珝鐎殿喕绮欓、妯款槼闁哄懏绻堝娲濞戞艾顣虹紓浣虹帛閸ㄥ綊鏁撻懞銉や孩妞ゎ偄顦甸獮鍫ュΩ閵夊海鍠栧畷顐﹀礋椤旇偐鍘撮梻鍌欑閹诧繝鏁嬪銈嗘处閸欏啴寮幘璇茬９闁绘洑鐒︾紞鍫濃攽閻愭彃绾ч柣妤佺矌濡叉劙鎮欑�靛摜鐦堥梺绋挎湰缁秴鈻撴ィ鍐╁仭婵犲﹤鎳庨。濂告偨椤栨娅婄�殿噮鍋婂畷姗�顢欓悾灞藉汲婵犵數濞�濞佳兾涘▎鎾抽棷闁荤喐鍣磋ぐ鎺撳亗閹兼番鍔屽鏉库攽椤旂》鍔熺紒顕呭灦楠炲繘宕ㄧ�涙ê浠梺鍝勵槸閻忔繆顣芥繝鐢靛Х閺佹悂宕戝☉銏″仱闁靛鍎抽弳鍡欑磼鐎ｎ厽纭堕柡鍡畵閺岀喐娼忛崜褏鏆犻悗鐟版啞缁诲啴濡甸崟顖氱睄闁搞儺鐓堝Λ鍕倵濞堝灝鏋涢柣蹇旂箞閸╃偤骞嬮敂钘変汗闁荤姴娉ч崘褏鐭楅梻鍌欒兌缁垶銆冮崨瀛樻櫇妞ゅ繐瀚弳锕傛煙鏉堥箖妾柡鍛絻椤法鎹勬笟顖氬壋闂佸憡锕㈠褔鈥旈崘顔嘉ч柛鈩兠弳妤呮⒑閸濄儱孝婵炴挳顥撻崚鎺楊敇閵忕姷顔婇梺鐟扮摠濮婂綊寮敓浠嬫⒒娴ｅ搫浠洪柛搴☆嚟娴滅鈻庨幘鏉戝壒濠电偛妫欓幐濠氭偂濞戞熬鎷烽惂鍛婂闁诲函缍嗛崜娑溾叺闂傚倷娴囧銊╂倿閿曞倸绀夐柡宓苯娈梺鍛婃处閸撴瑧娆㈤悙鐑樺�甸柨婵嗙凹缁ㄥジ鏌ｈ箛鏃�宕屾慨濠傤煼瀹曟帒鈻庨幇顔哄仒婵＄偑鍊栧ú姗�鎮ч悩鑼殾濞村吋娼欓崘锟藉銈嗗姂閸婃藝椤栨稓绡�闁汇垽娼у瓭闂佺锕ら…宄邦嚕閹惰姤鏅濋柛灞剧〒閸樺崬顪冮妶鍡楀Ё缂佹彃澧界划鍫ユ晸娴犲鐓欐い鏍ㄧ矊閺嬫盯鏌熼鐓庢Щ妞ゎ厹鍔戝畷姗�顢旈崱鈺佹櫔濠碉紕鍋戦崐鎴﹀垂濞差亝鍋￠柍杞拌兌閺嗭箓鏌涢锝嗙闁绘挻鐩弻娑㈠箛閸忓憡鍊ｇ紓浣稿船閸熷潡鍩為幋锔藉�烽柤鎼佹涧濞懷呯磽娴ｈ棄钄奸柛瀣姍瀹曟岸骞掗幋鏃�鐎婚梺瑙勫劤閸樻牜妲愰崼鏇熲拺闁诡垎鍛唶濠电媴鎷烽弶鍫氭櫅椤ユ艾鈹戦崒姘暈闁稿缍侀弻娑㈠Ψ椤旇崵鐩庨梺姹囧妼閹碱偊鈥﹂懗顖ｆЪ濠电偠灏欓崰鏍嵁濡ゅ懎閱囬柡鍥╁枎閿熺晫鍏橀弻锝夊箣閻戝棛鍔烽梺鍛婄懃濡繂顫忛搹鍦＜婵☆垵宕甸ˇ銉╂⒑缁嬪尅宸ユ繝锟介柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌＄仦璇插鐎殿噮鍣ｅ畷鍫曗�﹂幋鐑嗘闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤愵偆鍔烽梺璺ㄥ枔婵挳鎷戦悢鍏肩厪濠电偟鍋撳▍鍛磼椤愩垻效闁哄被鍔戦幃銏ゅ礈娴ｈ櫣鍘俊銈囧Х閸嬫稓鎹㈤幇鏉跨厴闁瑰濯撮幏鐑芥晲鎼存繄鏁栧銈嗘煥濡繂顫忛搹鍦＜婵☆垵娅ｆ导鍥р攽閳藉棗浜滈悗姘緲閻ｇ柉銇愰幒鎴狅紲濠电偞鍨堕悧鏃傝姳婵犳碍鈷戦悷娆忓椤ユ劙鏌￠崨顔炬创闁轰焦鎹囬幊鐐哄Ψ椤旂晫鏉归梻浣筋嚃閸犳帡宕滃┑鍡╁殫闁告洦鍨扮粻娑欍亜閹惧鈾侀悗姘偢濮婃椽鎳￠妶鍛呫垺绻涢懠顒�鈻堥柡浣规崌瀹曟劙鎮㈤崫銉ユ锭婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼椤ュ牊绻涢幋鐐跺妞わ絾妞介弻锝嗘償閵忊懇鏋旈梺鍝勬噽婵烇拷闁诡喗顨呴悾锟犲箥閾忣偅鏉搁梻浣虹帛閿氶柣蹇斿哺瀵娊鍩℃担鍙夋杸濡炪倖妫侀褍鐣甸崱娆欐嫹鐟欏嫭绀夋い顐㈩槺缂傛挻绂掔�ｎ偒妫冮梺鍐叉惈閸熶即鍩ｉ妶鍛斀闁绘﹩鍠栭悘杈ㄧ箾婢跺娲寸�殿喚鏁婚、妤呭礋椤愶綀绶㈡繝鐢靛Т閿曘倝鎮ф繝鍥ㄥ亗闁绘柨鍚嬮悡娆撴⒑椤撱劎鐣遍柡瀣洴閺屾盯寮▎鎯у壎闂佸搫鐭夌换婵嗙暦閵娾晩鏁婇柦妯侯檧閹风兘骞囬悧鍫㈠幐闁诲繒鍋涙晶浠嬪煢娴ｈ櫣纾肩紓浣诡焽缁犵偟锟借娲滈崰鏍�侀弴銏℃櫜闁搞儜鍛枏濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灩鐟欙箓鎮楅敐搴℃灈缂侊拷婢舵劖鐓涚�广儱楠搁獮鏍磼閻橀潧浠遍柡灞炬礃缁绘盯宕归鐓庮棛闂備胶绮Λ浣糕枍閿濆鍎楁繛鍡樻尰閻撴洘銇勯鐔风仴婵炲懏锕㈤弻锝嗘償閵忕姭鏋欏┑顔硷功缁垶骞忛崨鏉戜紶闁靛鍨崇粈濠勭磽閸屾瑧璐伴柛锝庡櫍瀹曞綊宕奸弴鐘茬ウ闂佺鎻粻鎴︽倷婵犲啨浜滈柟鐑樺灥閿熻棄鎽滅划濠囨晝閸屾稈鎷洪梺鍛婃尰瑜板啯绂嶉悙鐑樼厱闁绘娅曠亸鐢电磼椤旀鍤欓柍璇查叄楠炴锟界數顭堥獮鍫熶繆閻愵亜锟芥牠宕濆Δ浣瑰弿闁圭虎鍠栫粈澶嬬節婵犲倻澧涢柣鎾冲暣濮婃椽宕归鍛壈闂佽绻戦幐鎶藉蓟閿涘嫪娌柛鎾楋拷濡插牓姊虹�圭媭娼愰柛銊ョ仢閻ｇ兘宕￠悙宥嗘⒐缁绘繃鎷呴搹璇℃Х濠电姷鏁告慨鐑姐�傛禒瀣婵犻潧顭堟禍褰掓煕閹伴潧鏋熼柛瀣槸閳规垿宕掑搴ｅ姼闂佽棄鍟伴崰鎰崲濞戙垹绠ｉ柣鎰仛閸ｎ參姊虹粙鎸庢崳闁哥姵鐗犲濠氬即閿涘嫮鏉告繝鐢靛Т缁绘垹锟芥艾缍婇弻娑㈠箛椤掞拷缁狙囨煛娓氬洣绨婚柍瑙勫灴閺佸秹宕熼鈩冩線闂備胶顭堥敃銉╁垂閸喚鏆﹂柣鐔稿櫞濞差亶鏁傞柛娑卞幒閻㈠姊绘担绋挎毐闁圭⒈鍋婇獮濠冩償閵娿儱鍤戞繛鎾寸啲閹风兘鏌″畝锟介崰鏍嵁閹达箑绠涙い鎾跺О閿熻姤鍔楃槐鎾存媴閻ｅ苯鐗氶梺绋匡攻缁诲牆顕ｇ拠娴嬫闁靛繒濮撮崬銊ヮ渻閵堝棗濮傞柛銊嚙閳绘棃寮撮姀鈾�鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔曢悾锟犲箠婵犲倻绉虹�规洘鍎奸ˇ鎾煛閸☆厾鐣甸柡宀嬬秮婵拷闁靛繆鏅濋崝鍝ョ磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖妫佹慨銈呅掗崟顖涒拺婵炶尪顕ч獮妤呮煟閻斿弶娅婄�殿喖顭烽幃銏ゅ川婵犲嫮肖濠德板�х徊浠嬪疮椤栫儐鏁佺�广儱顦伴埛鎴犵磼鐎ｎ亞浠㈡い鎺嬪灪閵囧嫰濡搁妷锕�娈楁繝纰樺墲閹告娊鐛幒妤�绠ｆい鎾跺枎閸忓﹪姊绘担铏瑰笡闁告棑绠撳畷婊冣枎閹垮啯鏅滈梺鍓插亝濞叉﹢鍩涢幒鎳ㄥ綊鏁愰崟顕呭妳闂佺尨鎷烽柣妤�鐗呯换鍡樸亜閹扳晛鐏╂い蹇ｅ幘閿熷�燁潐濞叉﹢宕濆▎蹇曟殾缂佸顕抽弮鍫熸櫢濞寸姴顑呴崙鐘层�掑鐐闂佸搫鐬奸崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮婚敓鐘插窛妞ゆ棁妫勯敓鑺ュ姍閺岋紕浠︾拠鎻掝潎闂佽鍠撻崐婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟�
		if(this.npc.npcbaseid == HUA_JIAO_NPC_ID || this.npc.npcbaseid == SURPER_HUA_JIAO_NPC_ID){
			fire.pb.scene.npcai.AIManager.getInstance().npcMoveByAiID(this.npc.npckey, 1, roleids);
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730435;

	public int getType() {
		return 730435;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int posx;
	public int posy;
	public java.util.HashSet<Long> roleids;

	public GCreateNPCWithRoleids() {
		npc = new fire.msp.npc.CreateNpcInfo();
		roleids = new java.util.HashSet<Long>();
	}

	public GCreateNPCWithRoleids(fire.msp.npc.CreateNpcInfo _npc_, int _posx_, int _posy_, java.util.HashSet<Long> _roleids_) {
		this.npc = _npc_;
		this.posx = _posx_;
		this.posy = _posy_;
		this.roleids = _roleids_;
	}

	public final boolean _validator_() {
		if (!npc._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npc);
		_os_.marshal(posx);
		_os_.marshal(posy);
		_os_.compact_uint32(roleids.size());
		for (Long _v_ : roleids) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			long _v_;
			_v_ = _os_.unmarshal_long();
			roleids.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCWithRoleids) {
			GCreateNPCWithRoleids _o_ = (GCreateNPCWithRoleids)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			if (!roleids.equals(_o_.roleids)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += posx;
		_h_ += posy;
		_h_ += roleids.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(roleids).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


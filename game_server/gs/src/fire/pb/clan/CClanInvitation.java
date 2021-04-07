
package fire.pb.clan;

import java.util.Arrays;

import fire.pb.GameSystemConfig;
import fire.pb.SysConfigType;
import fire.pb.clan.srv.ClanBaseManager;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CClanInvitation__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CClanInvitation extends __CClanInvitation__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, true);
		if(clanInfo==null){
			MessageMgr.sendMsgNotify(roleid, 145077, null);
			return;
		}
		//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傛寧鍤囨慨濠冩そ濡啫鈽夊顒夋毇婵犵數鍋犻婊堟⒔閸曨垰绀嗗┑鐘插暟闂勫嫰鏌涘☉姗堝姛闁告﹢浜跺娲捶椤撶偘澹曞銈冨妼閹虫﹢鐛繝鍛杸婵炴垶鐟ラ敓钘夌仛閵囧嫰骞樼捄鐑樼亖缂備胶濞�缁犳牠骞冨Δ锟介埥澶娾枎濡厧濮洪梻浣规た閸樺ジ鏁冮妷锔锯攳濠电姴娴傞弫鍐煥濠靛棙顥戦柟鐤吹缁辨挻绗熼崶褎鐝梺鍛婎焾濡嫰顢氶妷鈺佺妞ゆ挻绻冮崟鍐⒑鐠団�崇�荤�癸拷鐎ｎ偄顏跺┑鐐村灟閸ㄦ椽鍩涢幋锔界厱闁归偊鍓欑痪褔鏌熼姘卞ⅵ闁哄瞼鍠栧畷姗�寮婚妷銉ュ強闂備浇妗ㄩ悞锕傚箲閸ヮ剙绠板┑鐘插暙缁剁偞淇婇姘儓濠㈢懓顑夊缁樻媴閸濄儳楔濡炪們鍎查幐濠氬箞閵娾晛绠绘い鏃囨娴犲ジ姊虹捄銊ユ灁濠殿喖顕惀顏囶樄闁哄本鐩垾锕傚箣濠靛洨浜剧紓鍌欑椤戝牓顢氳閸╃偤骞嬮敂钘夛拷鐑芥倵濞戞瑯鐒界紒瀣喘濮婃椽宕ㄦ繝鍛棟濡炪倖鍨甸幊姗�鏁愰悙娴嬫斀閻庯綆锟筋厸鏅犻弻鏇熷緞閸繄浠鹃梺璇茬箣缁舵艾顫忛搹瑙勫磯闁靛鍎查悵銏ゆ⒑閻熸澘娈╅柟鍑ゆ嫹
		Integer refval = GameSystemConfig.getSysConfig(guestroleid, SysConfigType.refuseclan);
		if(refval != null && refval.intValue() == 1){
			MessageMgr.sendMsgNotify(roleid, 166061, null);
			return;
		}
		// 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顒佹儓缂侊拷閸曨厽鍠愰柣妤�鐗嗙粭鎺旂棯閹规劦鍤欓柍瑙勫灴閹晠宕ｆ径瀣�风紓浣哄亾閸庡磭绱炴繝鍥х畺婵°倕鎳忛弲鏌ュ箹缁櫢鎷烽幇浣规祰闂備浇顕х�涒晝鍠婂澶嬪殞濡わ絽鍟犻敓鑺ユ瀹曟﹢顢旀惔銏狀伓闂佹寧绻傜花濂告焽椤栨稏浜滈幖娣焺濞堟粓鏌熼鑲╃Ш妤犵偛娲、娆撳礂閼测晙閭梻鍌欐祰椤曟牠宕板Δ鍛拷鍐醇濠靛啯顫嶉梺姹囧灮椤牆顔忓┑鍥ヤ簻闁规崘娉涘瓭闁汇埄鍨辩�笛呮崲濠靛鍋ㄩ梻鍫熶緱閿熻姤鎹囬弻鐔风暋閺夋寧些闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繐鐖奸弻锝嗘償閵堝孩缍堝┑鐐插级閿曘垽濡撮崘鈺冪瘈闁搞儯鍎婚幏閿嬬瑹閿熻棄顕ｆ禒瀣垫晝闁挎繂鎳愰敍蹇涙⒒娓氾拷濞佳嗗櫣闂佸憡渚楅崢楣冨磹閿燂拷
		if(ClanUtils.getClanInfoById(guestroleid, true)!=null){
			MessageMgr.sendMsgNotify(roleid, 145115, null);
			return;
		}
		// 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鎳為柆宥嗗殐闁宠桨鑳剁粵蹇旂節閻㈤潧校闁绘棏鍓涚槐鐐哄冀瑜滈悢鍡涙煠閹间焦娑у┑顔兼喘閺岋箓宕橀鍕亪闂佸搫鐭夌紞浣割嚕椤曪拷瀹曞爼鈥﹂幋婊冩憢婵犵绱曢崑鐔煎箠閹捐鐤柛褎銇涢敓鏂ゅ閹瑰嫰濡搁敃锟界壕顖炴⒑閹呯婵狅拷闁秴绀夋い鏍仦閳锋垹绱撴担璇＄劷闁冲彞绶氶弻鐔煎川婵犲啫锟芥劙鏌涢埞鍨姕鐎垫澘瀚伴獮鍥敆閸屻倕鏅梺璇叉唉椤煤閺嵮�鏋栭柨鏇炲�稿敮闂佸啿鎼崐濠氬储闁秵鈷戦悷娆忓椤庢粓鏌涢埡鍌滃⒈闁跨喕濮ら悢顒勫箯閿燂拷
		xbean.Properties properties = xtable.Properties.select(guestroleid);
		if (properties.getLevel() < ClanBaseManager.getInstance().getJoinClanLevel()) {// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ鍡涙⒒娴ｄ警鐒炬い鎴濇閹兾旈崨顓囷箓鏌涢弴銊ョ仩缂佺姵鐩弻娑㈠箻閼艰泛鍘￠梺鍝勬婵烇拷婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥矮鍗抽妴渚�寮介鐐靛�炲銈嗗釜閹烽绱掗悪锟介崹鍫曞蓟閿濆憘鐔煎垂椤旂偓顕楅梻浣告惈濡顢栨径鎰摕闁斥晛鍟欢鐐测攽閻樻彃顏ч柧蹇撻閳规垿顢欓悙顒�娈岄悗娈垮枛婢у酣骞戦姀鐘闁靛繒濮锋鍥⒑閻熸壆鎽犵紒璇插暣瀹曟劙顢涘☉姘鳖啎闂佹寧绻傞幊蹇曠矈椤愶附鐓欓柛鎴欏�栫�氾拷?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鍩勯崘顏嗘嚌濠德板�曢幊搴ㄥ垂閸岀偞鐓欓柟顖滃椤ュ绱掗悩鑼Ш闁哄被鍊曢湁閻庯綆鍋呴悵鏍磼閻愵剙鍔ら柕鍫熸倐瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
			MessageMgr.sendMsgNotify(roleid, 160371, Arrays.asList(ClanBaseManager.getInstance().getJoinClanLevel()+""));
			return;
		}
		// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶銉ョ仾闁绘挾鍠愭穱濠囧Χ韫囨柨顏堕梻浣虹帛椤ㄥ懐鎹㈠锟芥俊鎾川閺夋垼鎽曢梺闈涱檧婵″洭宕㈡禒瀣拺闁荤喖鍋婇崵鐔兼煕婵犲啰澧垫鐐差儏閳规垿宕橀埡鍐х按闂傚倷绀佹竟濠囧磻閸涱劶鍝勵潨閿熶粙骞冮垾鏂ユ闁靛骏绱曢崢閬嶆⒑閸濆嫭鍌ㄩ柛銊ユ惈閳藉顦归柡宀嬬秬缁犳盯寮撮悙鈺傜�伴梻浣告惈閻ジ宕伴弽顓滐拷浣糕槈濡攱鐎婚梺鐟扮摠缁诲倿鈥栨径瀣瘈闁汇垽娼ф禒褔鏌涘Ο鐘叉噺瀹曞弶鎱ㄥΔ瀣闂佺粯渚楅崳锝呯暦閸楃儐娼╅柛蹇撱仚閳哄懏鈷掑ù锝堟鐢盯鏌熼崨濠冨�愮�规洘鍔欓獮鏍ㄦ媴閸濄儱寮ㄥ┑鐘灱閸╂牠宕濋弴鐘典笉闁煎鍊楃壕鍏肩箾閹寸偛鍤柡锟芥导瀛樼厱婵鍘ф禍婊堟煃鐟欏嫬鐏撮柛鈺佸瀹曟﹢鍩℃担鍝勬锭闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹
		if (ClanUtils.isClanMemberFull(clanInfo)) {
			// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷鐓庮熆濠靛牊鍤�妞ゎ偅绻勯幑鍕惞鐠団剝袧濠电姷鏁搁崑鐐哄垂閸撲礁鏋堢�广儱顧�缂嶆牠鏌￠崶銉ョ仾闁绘挻绋戦…璺ㄦ崉娓氼垰鍓鹃梺绋跨昂閸庣敻寮婚敐澶婄闁告鍋涙慨锕傛⒑閸濆嫯瀚扮紒澶庮潐娣囧﹪鎮滈挊澹┾晠鏌ㄩ弮锟介崕鍐测槈瑜斿缁樻媴閸涘﹥鍠愭繝娈垮灡閹告娊鐛箛娑欐櫢闁跨噦鎷�
			MessageMgr.sendMsgNotify(roleid, 145011, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟芥潙鈹戦悙鑼憼闁搞倕閰ｅ畷鎰板冀椤愶絽搴婂┑鐐村灟閸ㄥ綊鐛姀鈥茬箚闁靛牆鎳忛崳鍦拷娈垮枙閸楀啿顫忓ú顏勭闁绘劘顕滈幏鐑藉即閵忊晜鏅炴繝銏ｅ煐閸旀洟鎷戦悢鍏肩厪闁割偅绻嶅Σ鍝ョ棯椤撱劍瀚归梻鍌欒兌缁垶宕濋弴鐐嶇喐绻濋崒妤佺亖濡炪倖鎸炬慨椋庡娴犲鐓曢悘鐐靛亾閻ㄦ垹锟芥稒绻堝铏规兜閸涱喚褰ч梺鎸庣閵囧嫰寮撮鍡櫳戦柣搴ㄦ涧閵堟悂鐛弽顓ф晣闁绘柨鎲￠悵顐⑩攽閻樻剚鍟忛柛鐘愁殜閺佸啴鍩￠崨顓炲亶婵犻潧鍊婚…鍫㈢矆閸儲鐓忓┑鐐靛亾濞呭棝鏌涙繝鍕毈闁诡喖鍢查埢搴ょ疀閹垮啩绱戦梻浣侯攰濡嫰宕幘顔肩畺婵☆垵娉曢悿锟介梺鍝勫暙閸婂綊宕抽锟藉娲川婵犲倻鐟查柣銏╁灲缁绘繂鐣风憴鍕╁亝闁告劑鍔庨悿锟藉┑鐐舵彧缁蹭粙骞栭銏╁殨闁规儼濮ら埛鎺懨归敐鍛儓濞寸姵妞介弻娑欐償閳藉棗娈舵繛瀛樼矌椤牓鍩㈡惔銊ョ鐎规洖娲﹂悞楣冩⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�
		if(ClanUtils.isAddClanPositionFull(clanInfo)){
			MessageMgr.sendMsgNotify(roleid, 160310, null);
			return;
		}
		
		byte inviteType = 0;
//		// 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰▕閻掕姤绻涢崱妯诲碍閻熸瑱绠撻幃妤呮晲鎼存繄鏁栭梺鍝勬濡繈寮婚悢鍏尖拻閻庨潧澹婂Σ顔尖攽椤旀娼愰柣鎾拷鎰佹綎婵炲樊浜堕弫鍡涙煥閻旂儤娅曠紒顔芥瀵爼骞嬮鐔风槣濠电偛顕慨鎾敄閸℃稑纾归柛顐ｆ礃閻撶喖鏌熼柇锕�鐏犻柣鎾村姈閵囧嫰濡烽妷顔叫ч梺闈涙搐鐎氱増淇婇悜钘壩ㄩ柕濞垮労娴煎啴姊婚崒姘悙妞わ妇鏁诲璇测槈濠婂懐鏉搁梺鍝勬川閸嬫稒绂掑锟藉娲川婵犲嫮鐣哄┑锛勫仒缁瑥顕ｆ繝姘櫢闁绘ɑ褰冮懓鍨攽閻愭潙鐏︽い銊ユ瀹曟澘顫濋懜纰樻嫼闂佸憡绻傜�氼噣鎮為崸妤佺厵闁告垯鍊栫�氾拷?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亜閸ㄦ棃鏌熺紒銏犳灈缂佺媭鍨堕弻銊╂偆閸屾稑顏�?  闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾侗妫￠梺鐟板暱閺堫剛鎹㈠┑瀣仺闂傚牊渚楅敓鑺ユ崌閺岀喎鐣￠弶鎸幮╅梺闈涙鐢帡锝炲┑瀣�锋い鎺炴嫹妞ゅ繐鐖奸弻锝嗘償閵堝孩缍堝┑鐐插级閻楃娀骞冮妷鈺佺闁稿繒鍘у鍧楁⒑鐠恒劌鏋嶇紒顔界懇瀵寮撮姀鐘诲敹濠电娀娼уù鍌毼涢敓鐘斥拺濞村吋鐟ㄩ娲煙閸戙倖瀚�
//		if( clanInfo.getClanmaster()==roleid || clanInfo.getClanvicemaster()==roleid){
//			inviteType = 1;
//		}
		xbean.ClanMemberInfo masterInfo = clanInfo.getMembers().get(roleid);
		if(masterInfo.getClanposition()>=ClanPositionType.ClanMaster&&masterInfo.getClanposition()<=ClanPositionType.ClanArmyGroup4){
			inviteType = 1;
		}
		SClanInvitation sClanInvitation = new SClanInvitation();
		sClanInvitation.clanlevel = clanInfo.getClanlevel();
		sClanInvitation.clannname = clanInfo.getClanname();
		sClanInvitation.hostrolename = new fire.pb.PropRole(roleid, true).getName();
		sClanInvitation.hostroleid = roleid;
		sClanInvitation.invitetype = inviteType;
		gnet.link.Onlines.getInstance().send(guestroleid, sClanInvitation);
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌熼鍡楁湰鐎靛本绻涚�电孝妞ゆ垵鎳愮划鍫ュ磼閻愬鍘遍梺闈涱槶閸ㄥ搫鈻嶉崶鈺冩／闁硅鍔栭ˉ澶愭婢舵劖鐓ユ繝闈涙閸ｆ椽鏌熼姘卞ⅵ闁哄矉绱曢敓鏂ょ秵閸嬪嫰鎮橀埡鍛厵闁圭粯甯楅崯鐐烘煥濞戞瑥濮堥柟宄版嚇閹稿﹥寰勬繝鍌濆帿缂傚倸鍊搁崐椋庢閿熺姴闂い鏍仜缁狀垶鏌ㄩ悤鍌涘?
		MessageMgr.sendMsgNotify(roleid, 172017, null);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808461;

	public int getType() {
		return 808461;
	}

	public long guestroleid;

	public CClanInvitation() {
	}

	public CClanInvitation(long _guestroleid_) {
		this.guestroleid = _guestroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(guestroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		guestroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CClanInvitation) {
			CClanInvitation _o_ = (CClanInvitation)_o1_;
			if (guestroleid != _o_.guestroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)guestroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(guestroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CClanInvitation _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(guestroleid - _o_.guestroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


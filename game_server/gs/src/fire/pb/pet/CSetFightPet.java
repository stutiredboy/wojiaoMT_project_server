
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetFightPet__ extends mkio.Protocol { }

/** 请求宠物参战
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetFightPet extends __CSetFightPet__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		Long battleId = xtable.Roleid2battleid.select(roleid);
		if (battleId == null) {
			PSetFightPetProc proc = new PSetFightPetProc(roleid, petkey, true);
			proc.submit();
		} else {
			// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛鎺撶☉椤啴濡堕崘銊т痪闂佹寧娲忛崹褰掓偩閻戠瓔鏁冮柨鏇嫹缂侊拷鐎ｎ喗鐓忓┑鐘茬箻濡绢噣鏌℃径瀣�愭慨濠勭帛閹峰懘宕妷锔撅拷顔尖攽閳藉棗浜滈悗姘煎墲閻忓鈹戞幊閸婃洟骞婅箛娑樼９闁割偅娲橀悡銉︾節闂堟稒顥炵�瑰憡绻勯惀顏堝箚瑜嶉幃鎴︽煏閸パ冾伃鐎殿喗鎸抽幃娆撳级閹寸儐浠╅梻鍌欐祰椤曆勵殽韫囨洜涓嶉柟鎹愵嚙閽冪喖鏌ｉ弮鍌楁嫛闁轰礁锕弻锝夘敇瑜嶆禍钘壝瑰搴濋偗闁靛棔绀佽灒闁煎鍊濆顔剧磽娴ｅ壊鍎忛柣蹇旂箘缁絽鈽夊鍡樺瘜闂侀潧鐗嗛幊鎰不娴煎瓨鐓欑�瑰嫰鍋婇崕蹇斻亜椤撶偞鍠樼�殿噮鍣ｅ畷濂告偄閸欏顏烘繝鐢靛仩閹活亞寰婇崸妤�纾块柕鍫濐槸閸氬綊鏌ㄩ悢鍓佺煓婵﹨娅ｉ幏鐘绘嚑椤掑偆鍞圭紓鍌欐祰椤曆囨偋閸℃稒鍋╅柣鎴犵摂閺佸秹鏌ｉ幋婵囶棡闁哄懏绻堝娲箰鎼粹懇鎷归梺绋块绾绢厾鍒掓繝鍥ㄦ櫇闁跨喍绮欓崺鐐哄箣閻愯尙鐤囬梻浣侯焾閿曘儱煤閻旈鏆﹂柡澶婄氨濡插牓鏌曡箛鏇炐ユい鏂挎娣囧﹪鎮欏顔煎壈闁诲孩绋堥弲鐘茬暦娴兼潙骞㈡繛鎴炵懅閸橀亶姊洪崫鍕偍闁告柨鏈弲鍫曟偋閸稐绨婚梺鎸庢椤曆冣枍瀹ュ鐓涚�癸拷鐎ｎ剛袣缂備胶濮甸惄顖炵嵁濮楋拷瀹曟粍绗熼崶褎鏆梻鍌氬�峰ù鍥х暦閻㈢鐤柛褎顨呴悿楣冩煟濡儤鈻曢柛銈嗘礃閵囧嫰骞囬崜浣烘殸缂備胶濮撮…鐑藉箖瑜版帒鐐婄憸宥囩棯瑜庨妵鍕Ψ閿斿墽鐤勫┑顔硷攻濡炶棄螞閸愩劉妲堟慨姗嗗墻閺嗩偅绻濈喊妯活潑闁稿鎳橀妴鍐╃節閸ャ儻鎷锋笟锟藉顕�宕奸悢鍛婎仧闂備浇娉曢崳锕傚箯閿燂拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枙婵倕煤閻旇偐宓佸┑鐘叉噽閻わ拷濠电偞鍨堕…鍥晬濞戙垺鈷戦悹鎭掑妼閺嬫柨鈹戦鐐毈闁诡噯绻濇俊鐑藉煛閸屾粌骞愰梻浣规偠閸庮噣寮插☉娆戭浄婵犲﹤鐗婇悡銉╂煟閺冨浂鍤欑悮姘舵⒑鐠団�虫灈闁稿﹥鎮傞幃楣冩偪椤栨ü姹楅梺鍦劋閸ㄥ綊鏁嶅鍐ｆ斀闁绘劖娼欓悘锕傛煟濡や焦鈷掗柤楦块哺缁绘繂顫濋娑欏闂備線娼荤�靛矂宕㈡總绋跨閻庯綆鍠楅悡鏇㈡煏婵炑冨濮ｅ牆顪冮妶鍐ㄧ仾婵☆偄鍟村畷娲晸閻樿尙锛滃┑鐐叉閸ㄥ綊鎮鹃悙顑跨箚闁绘劦浜滈敓鑺ョ墵瀹曟繆顦寸紒杈ㄦ尰瀵板嫰骞囬鍌ゅ悈闂備胶绮崝妤呫�傛禒瀣哗闁惧浚鍋嗙弧锟介梺姹囧灲濞佳冪摥婵犵數鍋涢惇浼村磹閺囩伝娲锤濡や讲鎷绘繛杈剧到閹诧繝宕悙灞傦拷鎺戭潩椤撗勭杹閻庤娲忛崹浠嬪箰婵犲啫绶為柛鈩冾焽娴滄牠姊洪懡銈呪枅缂傚倹宀告俊鎾晸娴犲鐓涢柨鐔诲Г缁傛帞锟斤綆鍋嗛崢浠嬫⒑瑜版帒浜伴柛鎾村哺閸┿垽寮撮悢鍓佺畾闂佸湱绮敮鐐哄春閿濆鐓涢悘鐐插⒔濞叉潙鈹戦埄鍐╁�愬┑鈥崇埣瀹曞爼鍩￠崘銊ョ畾闂備浇顕х�涒晠顢欓弽顓炵獥闁哄稁鍘搁敓鏂ょ畵閹粓鎸婃径瀣氶梻浣告啞濞诧箓宕归幍顔剧焼闁告劦鍠楅悡蹇撯攽閻愭垵鍟崳鐣岋拷瑙勬尫缁舵艾顫忕紒妯诲缂佹稑顑呭▓顓犵磽娴ｈ櫣甯涢悽顖楋拷宕囨殾闁硅揪闄勯崑鎰版煣韫囷絽浜滅�殿喖娼″娲濞戞艾顣哄銈忕細閸楀啿鐣烽幇鐗堫棃婵炴垶甯楅弬锟介梻浣虹帛閿氱痪缁㈠弮閵嗗倿寮婚妷锔惧帗闂備礁鐏濋鍛存倶閹绢喗鐓欐い鏃囧亹缁夎櫣锟借娲栭悥濂稿极閹邦垳鐤�闁哄倹顑欐导鎾绘⒒娴ｇ懓鍔ゆ繛瀛樺哺瀹曟垿宕卞Ο纰辨锤闂佽偐顭堥崥锟界紒璇叉閺岋綁骞囬崗鍝ョ泿闂佽法鍠曟慨銈夊垂閸喚鏆︽繝闈涙閺嗗棝鏌涢弴銊ュ婵炲懎娲ら—鍐Χ閸涱垳顔囬梺缁橆殔缁绘劙鎮鹃崹顐ょ懝闁跨喍绮欏璇测槈閵忕姷鐤�闂侀潧顭梽鍕偟閺嵮屾富闁靛牆鍊瑰▍鍥煕韫囨棑鑰挎鐐插暙铻栭柛娑卞枟濞呮粓鏌熼懖鈺勊夐柨鐔凤拷鐔风毢闁烩晛楠搁埞鎴︽倷閼碱剚鎲肩紓渚囧枛缁夊爼宕氶幒妤�绠婚柟棰佺劍缂嶅骸鈹戦悙鍙夆枙濞存粍绮岄蹇撯攽閸″繑鏂�闂佺粯蓱瑜板啴顢旈妶鍡曠箚闁圭粯甯炴晶锔芥叏婵犲啯銇濇鐐村姈閹棃濮�椤喚鍠橀梻鍌欒兌椤牆霉閻戣棄鏋佸┑鐘虫皑瀹撲線鏌涢幇闈涙灍闁稿鍔戦弻娑樷槈濮楀牊鏁惧┑鐐叉噷閸ㄨ棄顫忛搹瑙勫磯闁靛鍎查悵銏ゆ⒑閻熸澘娈╅柟鍑ゆ嫹
			mkdb.Procedure proc = new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					final xbean.BattleInfo battle = xtable.Battle.get(battleId);
					if (battle != null) {
						Integer index = battle.getRoleids().get(roleid);
						if (index != null) {
							xbean.Fighter fighter = battle.getFighters().get(index);
							if (fighter != null) {
								fighter.setInipetkey(petkey);
								fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 180031);
							}
						}
					}
					return true;
				}
			};
			proc.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788440;

	public int getType() {
		return 788440;
	}

	public int petkey; // 请求参战的宠物

	public CSetFightPet() {
	}

	public CSetFightPet(int _petkey_) {
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetFightPet) {
			CSetFightPet _o_ = (CSetFightPet)_o1_;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetFightPet _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


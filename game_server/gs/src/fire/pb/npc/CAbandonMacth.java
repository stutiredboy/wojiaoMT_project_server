
package fire.pb.npc;
import java.util.ArrayList;
import java.util.List;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonMacth__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonMacth extends __CAbandonMacth__ {
	@Override
	protected void process() {
		// protocol handle
		final Long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.npcBattleInfoCol npcBattle = xtable.Npcbattleinfo.get(npckey); 
				if (npcBattle == null)
					return false;
				if (!npcBattle.getBattleroles().containsKey(roleid))
					return false;
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵婵炲棗绻掗崝鎾⒑鏉炴壆顦︽い鎴濇婵＄敻宕熼姘鳖啋闁荤姾娅ｉ崕銈夋倵妤ｅ啯鈷戦柛娑橈功閹冲啰绱掔紒姗堣�挎鐐插暙铻栭柨鐔剁矙閸┿儲寰勬繛鐐�诲┑鐐叉濞撮攱娼婚弮锟界换婵嬫偨闂堟稐绮堕梺缁橆殔閹虫劙宕氶幒鎴旀瀻闁规儳鐤囬幗鏇炩攽閻愭潙鐏﹂懣銈夋煛閿熻姤绂掔�ｎ偆鍘遍梺鍝勬储閸斿本绂嶅鍐ｆ斀妞ゆ棁鍋愭晥濠殿喖锕ㄥ▍锝囨閹烘嚦鐔兼惞閸︻厽鍣梻鍌欑劍鐎笛兠鸿箛娑樼？闁割煈鍋傜换鍡涙煟閵忋埄鐒剧紒锟界�ｎ偁浜滈柡宥冨姀婢规锟借鎸稿Λ妤呪�旈崘顔嘉ч柛娑卞灣椤斿洭姊洪悷鏉挎毐闂佸府缍侀妴渚�寮崼婵嬪敹闂佸搫娲ㄩ崯鍧楀箯缂佹绠鹃弶鍫濆⒔閸掍即鏌熺拠褏绡�妤犵偛妫濆畷濂稿Ψ閿旀儳骞樻繝鐢靛仩鐏忣亪顢氳閹﹢鏁冮崒娑氬幐婵炶揪绲块…鍫ュ汲閿濆應鏀介梽鍥春閺嵮屽殫闁告洦鍊犻悢铏圭＜婵☆垵宕佃ぐ搴♀攽閻樺灚鏆╁┑鐑囨嫹濠电偘鍖犻崶褏锛欐繝鐢靛У閸╁啴鏁撻弬銈囩暤鐎规洜鍘ч埞鎴﹀箛椤掍焦鐝氬┑鐘垫暩婵烇拷婵炰匠鍏犳椽濮�閿涘嫷娲稿┑鐘诧工閻楀﹪鎮″▎鎾寸厵閻熸瑥瀚慨鍫㈢棯椤撶偛鈷斿ù婊勭摃缁犳盯寮撮悩纰夌闯濠电偞鎸婚懝鎯洪妶澶婂嚑闁绘柨鍚嬮悡娆戠磼鐎ｎ亞浠㈤柡鍡氶哺閵囧嫰顢曢姀銏㈩唶闁绘挶鍊栭妵鍕疀閹炬潙娅ｅ┑鐐茬墑閸庨潧顫忓ú顏咁棃婵炴垶鑹鹃。娲⒑閻熸澘鏆辩紒澶嬫尦閸┿垺绂掔�ｅ灚鏅滈梺绯曞墲閻熝囨晬濠靛洨绠鹃弶鍫濆⒔閸掓澘顭块悷甯含鐎规洘娲濈粻娑㈠即閻樼绱茬紓鍌氬�烽悞锕傚煟閵堝鏁傞柛顐ゅ枎娴犲ジ鎮楅悷鏉款仾濠㈢懓顑夊銊︾鐎ｎ偄锟界敻鏌ㄥ┑鍡欏嚬缂併劏濮ら妵鍕箻鐎涙ǜ浠㈠┑顔硷攻濡炰粙鐛幇顓熷劅闁靛繆鎳囬弫宥夋⒒娴ｅ摜绉烘い銉︽崌瀹曟螣娓氼垱缍庢繝鐢靛У閼瑰墽澹曟總鍛婄厪闁割偅绻冮崳钘壝归悩铏�愭慨濠冩そ瀹曨偊宕熼鐘插Ы缂傚倸鍊哥粔宕囨濮樿埖鍋樻い鏃�鎷濋幏鐑芥晲鎼粹剝鐏嶉梺鍝勬噺閻擄繝寮诲☉銏犵參闁跨喍绮欏鎻掝煥閸╄泛顦板鍕暆閿熺晫澹曟禒瀣厱閻忕偛澧介幊鍛磼濞戞绠婚柡宀�鍠愰ˇ鐗堟償閳ュ啿绠ｉ梻浣告惈閺堫剟鎯勯鐐叉槬闁告洦鍨扮粈鍐┿亜韫囧海鍔嶆い搴℃喘濮婄粯鎷呴搹鐟扮闂佽鎮傜粻鏍х暦娴兼潙绠涙い鎾跺Л閺�铏節閻㈤潧孝婵炴潙鍊垮顐㈩吋閸℃瑧鐦堥梻鍌氱墛缁嬫帡藟濞嗘劖鍙忛悷娆忓濞堟粓鏌″畝瀣М濠殿噯鎷烽梺瀹犳〃閼宠埖绂掗銏♀拺闁绘垟鏅滃▍鎾绘煕閵娿劍纭炬い鏇稻缁绘繂顫濋鐔哥彸闂備礁鎲℃笟妤佺濠靛妫橀柨鐔剁矙濮婄粯鎷呴崨濠呯闂佺顑嗛幐鎼佲�﹂崶褉鏋庨柟鍨暞閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�
				npcBattle.getBattleroles().remove(roleid);
				xtable.Role2npcbattle.remove(roleid);
				
				//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾婀遍幉鎼佹偋閸繄鐟ㄧ紒鐐劤椤兘寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳鍟块弳锝囷拷娈垮枛閻栧ジ骞冨▎鎾崇骇闁规惌鍘介ˉ瀣⒑鐠囨煡鍙勬繛浣冲洤围闁归棿绀侀拑鐔兼煏婵炲灝鍔楅柡锟芥禒瀣厱闁虫拝鎷烽柡鍛矋閺呫儵姊婚崒娆戭槮闁圭⒈鍋婇獮濠呯疀閺囩喎搴婇梺鍓插亖閸庨亶鎷戦悢鍝ョ闁瑰鍋熼悡顖涚箾瀹�濠侀偗闁哄瞼鍠撻幉鎾礋椤愩埄娼撴俊鐐�戦崕鑼崲閸曨厽顫曢柟鎯х摠婵挳鏌ｉ悢鍛婄凡妞ゎ偄绉剁槐鎾存媴閸撴彃鍓遍梺鎼炲妼濞尖�崇暦濞差亝鍊烽柛婵嗗椤撴椽姊洪幐搴㈢┛闁归鍏橀弻锝夊箼閸曨厾鐦堥梺鍝勬湰閻╊垶宕洪崟顖氱闁绘劦鍓涢弳顓炩攽閻愬樊鍤熷┑顕呭弮瀵煡鎮╁顔界稁濠电偛妯婃禍婊堝箲閼哥偣浜滈柟鎯ь嚟閳句線鎮楀顓犳创婵﹨娅ｇ划娆忊枎閹冨婵犵妲呴崑鍛淬�冩繝鍥ワ拷浣割潩鐠轰綍銊╂煥閺傚灝鈷旈柣锕�鐗撳铏圭矙濞嗘儳鍓鹃梺鎼炲妼瀹曨剟鈥旈崘鈺冾浄閻庯綆鐓夐幏閿嬬瑹閿熻棄顕ｉ锟藉畷鐓庘攽閸℃瑧宕哄┑锛勫亼閸婃洜鎹㈤幇鏉跨疇閹兼惌鐓堥弫鍌炴煟閻旂顥愰柡锟芥禒瀣叆婵炴垶锚椤忊晛霉濠婂啨鍋㈤柡灞剧♁缁绘繈宕橀鍕ㄦ嫲闁诲氦顫夊ú妯兼崲閸℃蛋鍥╋拷娑櫭肩换鍡涙煕濞嗗浚妲稿┑顔肩Ф閿熻姤顔栭崰妤呭箰閹惰棄绠栭柍鍝勬噺閸嬨劑姊婚崼鐔恒�掓い鏂跨焸濮婂宕掑▎鎴М闂佸湱鈷堥崑濠傜暦閺夊簱妲堥柕蹇曞Х椤斿棝鎮楅悷鏉款仾濠⒀佸劜閹棃濡搁妷褍锟界偤鎮峰鍕疄鐎规洘绻堥幃銏ゅ礂閼测晛骞嶅┑锛勫仜椤戝懏顨ラ幖浣猴拷閿嬩繆閻愵亜锟窖囨⒔閸曨垰绠伴柟鎯版閽冪喖鏌ㄥ┑鍡╂Ч闁哄懏鐓￠弻娑樷槈閸楃偟浠х紓渚囧枤閺佽顫忓ú顏呯劵婵炴垶鍩冮弫锟介梻浣告啞閺屻劎绮旈崼鏇炵闁靛繒濮弨浠嬫倵閿濆簼绨介柨娑欑矊閳规垿鎮╃拠褍浼愰梺鐟板级閻╊垱淇婇幖浣哥厸闁稿本鐔幏鐑芥偨閸涘﹤浠┑鐐叉缁绘劙顢旈鍡欑＜闁跨喍绮欓弫鎾绘偩瀹�锟界壕浠嬫煕鐏炵偓鐨戠�涙繈姊洪幐搴㈠濞存粠浜濇穱濠勶拷娑櫳戞刊瀵哥磼椤栨稒绀冮柣搴☆煼濮婃椽宕烽鐐板濠电偛鍚嬮悷锔剧矉瀹ュ憘鏃堝川椤旀儳骞嶉梻浣侯焾缁绘宕戦幇鏉挎辈婵鎷烽柡灞剧洴閸┾剝鎷呴崜韫磾闁诲氦顫夊ú蹇涘磿閹惰姤鏅搁柡鍌樺�楃粔鐢告煕閹惧銆掑瑙勬礃缁傛帞锟斤綆鍋嗛崢閬嶆煟韫囨洖浠︾�规洘蓱缁旂喎顫滈敓浠嬪蓟閵娾晜鍋勯悹鍥ㄧ暙閹剧粯鐓欐い鏃傚帶閿熻姤鎮傞幃楣冩倻閽樺鐤�濡炪倖鎸嗛崟鎳峰洦鐓欓柤鍦瑜把呯磼閹绘帗鍋ラ柟顔惧仱瀹曟鎳栭埡鍐惧晭闂佸搫顦悧鍡樻櫠娴犲绠栧┑鍌氭啞閻撴洟骞栫�涙鈽夐柨鐔诲Г濞茬喖骞冩ィ鍐╁�婚柦妯侯槼閹芥洟姊洪棃娑辨濠碘�虫喘瀹曘垽鎮介崨濞炬嫽婵炴挻鑹惧ú銈咁嚕鐠恒劎纾奸柣妯哄暱閻忔挳鏌熼鐭亪鍩ユ径濞㈢喕绠涢弴鐔锋畬濡炪値鍘归崝鎴濈暦濮楋拷椤㈡棃宕伴懜顒�濮傛慨濠冩そ瀹曨偊宕熼浣瑰闂備胶鍎甸弲鈺呭垂鏉堛劎鈹嶅┑鐘叉处閸婂鏌﹀Ο渚Ш妞ゆ挸鎼—鍐Χ閸℃瑥顫х紓浣割儐閸ㄥ潡銆侀弮鍫熷殝闁汇垻鏁搁惁鍫㈢磼閸撗冾暭闁挎艾顭胯鐏忔瑩骞夐幖浣哥骇闁割煈鍠楀▓濠氭⒑鐠団�虫殭闁搞儜鍜佸晪闂佽崵濮村ú鈺冧焊椤忓牆绠洪柡鍥╁亹閺�浠嬫煟閹邦厽缍戦柣蹇曞枛閺屾盯鍩℃担鍓蹭純閻庢鍣崑濠傜暦濮楋拷椤㈡瑩鎮剧仦钘夌濠电姷顣藉Σ鍛村垂娴煎瓨鍊舵繝闈涱儐閸庡秹鏌涘┑鍡椻枙鐟滅増甯楅崑鎰版煠婵劕锟芥寮抽鈶╂斀妞ゆ梻銆嬮崝鐔兼煕鎼存稑锟芥鏁撻悾灞炬毄闁告鍥х厺閹兼番鍔岀粻锝夋煟濡哀鎴犲枈瀹ュ棛鈹嶅┑鐘叉处閸婄兘鎮楀☉娆樼劷缂佸娲铏规兜閸涱厜鎾剁磼椤旇姤宕岄柣娑卞櫍楠炲鏁冮敓浠嬶綖閸涘瓨鐓熸慨妤�妫楁禍婵囥亜椤愩垻效婵﹥妞藉Λ鍐ㄢ槈濮橀硸鍞哄┑鐘愁問閸犳岸宕楀锟介妴浣割潨閿熻棄鐣烽锕�绀嬮柕濠忛檮閺夋悂姊绘担铏瑰笡妞ゎ厼娲ㄩ崚鎺楊敍濮橈絾顫嶉悷婊勬瀵鏁愰崨鍌涙閺佹捇鎸婃竟鈺傜☉閳规垶绻濋崟顓炴暥闂傚倸鍊峰ù鍥р枖閺囥垹绐楅柡鍥╁�ｅ☉銏犵妞ゆ牗姘ㄩ崢鎾⒑绾懏褰ч梻鍕瀹曟劖顦版惔顖涘闁荤喐婢橀ˉ蹇涙煕閻樺磭澧柍缁樻崌瀹曞ジ寮撮悢鍙夊闂傚倸鍊搁悧濠勭矙閹烘澶婎煥閸曗晙绨婚梺鐟扮摠缁诲秴螣閿熶粙姊虹紒妯圭繁闁哥姵绋撶划璇测槈濡攱顫嶅┑鐐叉閸旀牠顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�
				List<Long> allRoles = new ArrayList<Long>();
				Team team = TeamManager.selectTeamByRoleId(roleid);
				if (team != null) {
					allRoles.addAll(team.getNormalMemberIds());
					mkdb.Procedure.psend(allRoles, new SMacthResult(npckey, 0));
				}
				
				if (npcBattle.getBattleroles().size() == 0)
					xtable.Npcbattleinfo.remove(npckey);
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795670;

	public int getType() {
		return 795670;
	}

	public long npckey; // npckey

	public CAbandonMacth() {
	}

	public CAbandonMacth(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonMacth) {
			CAbandonMacth _o_ = (CAbandonMacth)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonMacth _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


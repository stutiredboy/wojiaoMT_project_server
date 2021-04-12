package fire.pb.clan;

import fire.log.beans.FactionOpbean;

import fire.pb.talk.MessageMgr;
import fire.pb.util.StringValidateUtil;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChangeClanAim__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChangeClanAim extends __CChangeClanAim__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;

		if (!fire.pb.util.StringValidateUtil.checkIllegalWord(newaim)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 142261, null);
			return;
		}
		if (!StringValidateUtil.checkValidName(newaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺鐟滅増甯╁Λ鎴︽煕韫囨棑鑰跨�殿喖顭烽幃銏㈠枈鏉堛劍娅栨繝娈垮枟閿氱�规洦鍓熼崺鍛存偨閸涘﹤锟界敻鎮峰▎蹇擃仾缂侊拷閿熶粙鎮楃憴鍕闁告挾鍠栧畷娲Ψ閿曪拷缁剁偛鈹戦悙闈涗壕闁诲骸顭峰Λ鍛搭敃閵忊�愁槱濠电偛寮堕悧婊呮閻愮儤鏅搁柨鐕傛嫹?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閻熲晛鐣烽敐澶娢ㄧ憸蹇涘箟瑜版帗鈷掗柛灞剧懆閸忓本銇勯姀鐙呰含妤犵偞鎹囬、鏃堝幢濡ゅ啰鐡樼紓鍌氬�烽悞锕傗�﹂崶顑撅拷鍛存嚑椤掍礁鏋戦梺缁橆殔閻楀棛绮鑸电厽闁规儳鐡ㄧ粈鍫ユ煙閹绘帗鍟為柟顖涙婵℃悂鏁愯箛鏂款伓闂佸憡鍔﹂崰鏍嵁閵忥紕绠鹃柟瀵稿剱閻掍粙鏌＄仦鐔峰枤濞撳鏌曢崼婵囶棞缂佹甯￠幃妤�顫濋悡搴＄睄閻庤娲橀崝娆忕暦婵傜鍗抽柣鏂挎惈楠炴姊绘担鍝ョШ闁稿锕畷瑙勫鐎涙ê浜楅梺褰掑亰閸樿绂嶅鍫熺厪濠㈣泛鐗嗛崝瀛樹繆閸欏銇濋柡宀�鍠栧畷锝嗗緞鐎ｎ亷鎷烽幇顕嗘嫹濞堝灝鏋涢柣鏍с偢閻涱噣骞囬鐔峰妳濡炪倖姊归弸鑽ゆ濡ゅ懏鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰喊鐎殿喚鏁婚、妤呭磼濠婂懐鍘梻浣侯攰閹活亞绮婚幋锔藉亗闁炽儲鍓氶悢鍡涙偣鏉炴媽顒熼柣鎿冨墯缁绘稓绮崫鍕潎闂佸搫鏈惄顖炪�侀弴銏℃櫜闁搞儮鏅濋弳鐘电磽閸屾瑧鍔嶉柛鐐跺吹缁辩偞绗熼敓钘夘嚕婵犳碍鏅插璺侯儏娴滄粓姊洪崨濠勭細闁稿孩濞婇幃鈩冩媴缁洘鏂�闂佺粯锕╅崰鏍倶椤忓牊鐓ラ柡鍥悘鈺呮煟閿濆洤鍘存鐐叉喘瀵爼宕稿Δ浣规當濠电姴鐥夐弶鍖℃嫹瑜旈獮蹇涙倻閼恒儳鍙冮梺鍛婂姦娴滄粓寮稿☉銏＄厸閻忕偛澧介埥澶愭煃閽樺妯�鐎规洩绻濋幃娆戯拷鐢告櫜閹茬偓绻濋悽闈浶ｆい鏃�鐗犲畷瑙勫閹碱厽鏅銈嗘尵婵敻锝為弴銏＄厵闁绘垶蓱椤ユ牠鏌熸搴″幋闁轰焦鍔栭幆鏃堝灳瀹曞浂鍟堢紓鍌欒兌閾忓酣宕㈡總鍛婂亯濠靛倻顭堥拑鐔哥箾閹寸儐鐒搁柣鏃傚劋鐎氭岸鏌涘▎蹇ｆЪ闁谎傜劍缁绘繂鈻撻崹顔界亪闂佹寧娲忛崕閬嶁�旈崘鈺冾浄閻庯綆浜為悾娲⒑閺傘儲娅呴柛鐕佸灦瀹曟洟鎮㈤崗灏栨寖闂佹悶鍎洪崜娆撳及閵夆晜鐓熼柟閭﹀枛閸斿鏌嶉柨瀣伌闁哄瞼鍠撶划娆撳垂椤曞懎濡风紓浣稿⒔閸嬫捇骞冮崒鐐茶摕婵炴垶鐟х弧锟介梺鍛婂姦娴滅偤鎮鹃悜妯肩闁挎繂鎳忛幖鎰版煥閺囥劋绨婚柣锝囨焿閵囨劙骞掑┑鍥ㄦ珖闂備線娼х换鍫ュ垂婵犳碍鍋樻い鏇嫹婵﹨娅ｉ幏鐘诲箵閹烘垶鐦ｇ紓鍌氬�哥粔鏉懳涘┑鍡欐殾婵°倧鎷锋い顐ｇ矒閺佹捇鎸婃径妯烘闂佸綊妫跨粈渚�宕橀敓钘夘渻閵堝棙灏甸柛鐘查叄閺佹捇鎸婃径灞肩驳濡炪們鍔婇崕鐢稿箖濞嗘挻鍤戞い鎴ｅ劵濡炬悂姊绘担鍛婂暈婵﹦鎳撻悾婵嬪箹娴ｆ瓕鎽曢梺鎸庣箓閹叉﹢寮崼鐔告闂佽姤锚閿涘鈽夊Ο閿嬫杸闂佺硶鍓濋悷锕�鈻撴ィ鍐┾拺闂傚牊绋撶粻鐐烘煕婵犲啯绀堢紒顔垮吹缁辨帒螣闂�鎰泿闂備礁鎼崯顐﹀磹閻熸壋鏋嶉柡鍥ュ灪閻撴洘淇婇婊呭笡闁稿﹥鍔栭幈銊︾節閸涱噮浠╅梺鍦嚀鐎氱増淇婇幖浣肝ㄩ柨鏃�鍎崇紞鎺楁⒒閸屾瑨鍏岄柟铏崌瀹曠敻寮介鐐殿唵闂佽法鍣﹂幏锟�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閻熲晛鐣烽敐澶娢ㄧ憸蹇涘箟瑜版帗鈷掗柛灞剧懆閸忓本銇勯姀鐙呰含妤犵偞鎹囬、鏃堝幢濡ゅ啰鐡樼紓鍌氬�烽悞锕傗�﹂崶顑撅拷鍛存嚑椤掍礁鏋戦梺缁橆殔閻楀棛绮鑸电厽闁规儳宕崝锕傛煛瀹�瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷
		if(newaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		
		
		if (newaim.length() == 0) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (newaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, false);
				if (clanInfo == null) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 145077, null);
					return false;
				}
				if (clanInfo.getClanmaster() != roleid && clanInfo.getClanvicemaster() != roleid) {
					fire.pb.talk.MessageMgr.psendMsgNotify(roleid, 150127, null);
					return false;
				}
				clanInfo.setClanaim(newaim);
				mkdb.Procedure.psendWhileCommit(roleid, new SChangeClanAim(newaim));
				fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 145074, null);
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笂缁瑩寮婚妶鍡樺弿闁归偊鍓ㄩ幏鐑藉冀椤愵剚瀚规慨姗嗗墻閻撳ジ鏌″畝瀣М鐎殿噮鍣ｅ畷鎺戭潩椤戣法甯涚紓鍌氬�风欢銈夊箯瀹勯偊鐔嗛悹楦挎閻掑潡鏌熸搴″幋闁诡垰鍊垮畷銊︾節閸屻倓绱﹂梻鍌氬�风粈渚�骞夐垾瓒佹椽鏁冮崒姘憋紱闂佺硶鍓濈粙鎺楀磻閸岀偞鐓欓弶鍫ョ畺濡绢噣鏌嶉柨瀣伌闁哄本绋戦埞鎴﹀幢濡ゅ﹣鐥柣搴ｆ嚀閹诧紕鎹㈤崼銉ヨ摕婵炴垯鍨洪崑鎰版煛鐏炶鍔氱�殿喗婢橀—鍐Χ閸愩劎浠剧紒鐐緲缁夋挳鈥﹂崶顏嗙杸婵炴垶顭傞埡鍛叆闁哄浂浜濈�氬綊鎮楀▓鍨灈闁诲繑绻堥崺鐐哄箣閿旂粯鏅╃紓浣圭☉椤戝棝顢樺ú顏呪拺闁革富鍘奸崢鎾煛閿熶粙鏌嗗鍛傦箓鏌涢弴銊ョ仩閸ユ挳姊洪崨濠佺繁闁告瑥绻橀獮蹇涙倻閽樺鐎銈嗘礀閹冲骸鈻撻妸鈺傗拺閻熸瑥瀚崝鑸典繆椤愩垹顏╅柡渚囧櫍濮婄粯鎷呯粙鎸庢瘣闂佸湱鈷堥崑濠傜暦閹扮増鍋ㄧ紒瀣硶椤斿棝姊洪崨濠勭畵閻庢艾鍢查妴鎺撶節濮橆厾鍘梺鍓插亝缁诲啴藟濠婂懐纾兼俊銈忔嫹闁稿﹤娼″濠氭晲婢跺﹦顔婇梺缁樺姇濡﹤煤椤撶喓绠鹃悗娑欘焽閻鏌熼鐓庯拷鍧楀Υ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩￠崨顓狀槰闂佸憡鐟ラˇ閬嶆晸娴犲鐣烘慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍婵＄偑鍊х�靛矂宕归崼鏇炵畺婵☆垵銆�閺�浠嬫倵閿濆骸浜濇繛鍛灲濮婃椽鎳為妷鍐句邯钘濆ù鍏兼綑绾惧鏌曟竟顖氱У鐎氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻愬弶些闂佷紮绲块崗妯讳繆閹间礁鐓涘┑鐘插暞濞呮捇姊绘担钘壭撻柨姘亜閿旇法鐭欓柡浣规崌閹崇偤濡烽敃锟界壕鍐测攽椤旂》鏀绘俊鐐舵铻為柛鎰靛枛閻撴稑霉閿濆洤鍔嬬悮娆撴⒒閸屾瑧顦﹂柟鐚溿倖鎳岀紓鍌欑贰閸犳骞愮紒妯尖攳濠电姴娲﹂崐濠氭煢濡警妲洪柛妯绘倐濮婅櫣绮欓幐搴㈡嫳缂備緡鍠栭惌鍌炴偘椤旂⒈鍚嬪璺侯儌閹风粯绻涙潏鍓хК濠殿喓鍊楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?
				String name=xtable.Properties.selectRolename(roleid);
				if (name != null) {
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(clanInfo.getMembers().keySet(), 160367, 0,
							java.util.Arrays.asList(name, newaim));
				}
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀勩�傞搹鍦＝濞撴艾锕ョ�氳绻濋姀锝嗙【妞ゆ垵妫濆畷锝堢疀閺傚墽绠氶梺闈涚墕閹峰宕曢幇鐗堝�垫慨妯块哺閸わ拷闁剧粯鐗犻弻锝咁潨閿熻棄顭囪缁傛帒顭ㄩ崟顏嗙畾濡炪倖鍔х徊璺ㄧ不閻愮鎷峰▓鍨珮闁稿锕悰顔嘉熺涵閿嬪闂傚牊绋戦ˉ蹇旂箾閺夋垵顏柡宀嬬稻閹棃顢涘鍛咃綁姊虹粙娆惧剰婵☆偅绻傞悾鐑藉閵堝懐顔愭繛杈剧到閸樻粓骞忓ú顏呪拺闁告稑锕﹂埥澶愭煥閺囨ê锟芥牠骞堥妸顭戞Ь缂備浇椴哥敮锟犲箖閳哄懎绀冮柤纰卞厸缁辨繈鏌ｆ惔銈庢綈婵炲弶顭囬幑銏ゅ磼閻戝洨绋忓┑鐘绘涧濞诧妇绱為崶顒佺厓闁告繂瀚弸锔剧磼鏉堛劌绲婚柍瑙勫灴閹瑧锟芥稒顭囩粙鍥⒑閸涘﹨澹樻い鎴濐樀楠炲啴鎮滈懞銉︽珕闂佽鍎抽幊蹇曪拷姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷
				xbean.ClanMemberInfo fmi = clanInfo.getMembers().get(roleid);
				FactionOpbean factionOpbean = new FactionOpbean(clanInfo.getKey(), clanInfo.getClanname(), 
						FactionOpbean.TYPE_CHANGE_AIM, fmi.getClanposition(), clanInfo.getMembers().size(),
						clanInfo.getClanlevel(), clanInfo.getHouse().entrySet());
				int weekpoint=fire.pb.clan.srv.ClanManage.getWeekclanpoint(roleid,clanInfo);
				fire.log.YYLogger.factionOPEventLog(roleid, factionOpbean,weekpoint);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808459;

	public int getType() {
		return 808459;
	}

	public java.lang.String newaim;

	public CChangeClanAim() {
		newaim = "";
	}

	public CChangeClanAim(java.lang.String _newaim_) {
		this.newaim = _newaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(newaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		newaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChangeClanAim) {
			CChangeClanAim _o_ = (CChangeClanAim)_o1_;
			if (!newaim.equals(_o_.newaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += newaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(newaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

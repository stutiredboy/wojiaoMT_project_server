
package fire.pb.clan;

import fire.pb.clan.srv.ClanBaseManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.CheckName;
import fire.pb.util.StringValidateUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateClan__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCreateClan extends __CCreateClan__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || clanname == null || clanaim == null)
			return;
		int resultCode = CheckName.checkValid(clanname);
		if (resultCode == CheckName.WORD_ILLEGALITY) {
			MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == CheckName.SPECIAL_WORD_TOO_MANY) {
			MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == CheckName.NONE_CHARACTER) {
			MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		if (!StringValidateUtil.checkValidName(clanaim)) {
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺鐟滅増甯╁Λ鎴︽煕韫囨棑鑰跨�殿喖顭烽幃銏㈠枈鏉堛劍娅栨繝娈垮枟閿氱�规洦鍓熼崺鍛存偨閸涘﹤锟界敻鎮峰▎蹇擃仾缂侊拷閿熶粙鎮楃憴鍕闁告挾鍠栧畷娲Ψ閿曪拷缁剁偛鈹戦悙闈涗壕闁诲骸顭峰Λ鍛搭敃閵忊�愁槱濠电偛寮堕悧婊呮閻愮儤鏅搁柨鐕傛嫹?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閻熲晛鐣烽敐澶娢ㄧ憸蹇涘箟瑜版帗鈷掗柛灞剧懆閸忓本銇勯姀鐙呰含妤犵偞鎹囬、鏃堝幢濡ゅ啰鐡樼紓鍌氬�烽悞锕傗�﹂崶顑撅拷鍛存嚑椤掍礁鏋戦梺缁橆殔閻楀棛绮鑸电厽闁规儳鐡ㄧ粈鍫ユ煙閹绘帗鍟為柟顖涙婵℃悂鏁愯箛鏂款伓闂佸憡鍔﹂崰鏍嵁閵忥紕绠鹃柟瀵稿剱閻掍粙鏌＄仦鐔峰枤濞撳鏌曢崼婵囶棞缂佹甯￠幃妤�顫濋悡搴＄睄閻庤娲橀崝娆忕暦婵傜鍗抽柣鏂挎惈楠炴姊绘担鍝ョШ闁稿锕畷瑙勫鐎涙ê浜楅梺褰掑亰閸樿绂嶅鍫熺厪濠㈣泛鐗嗛崝瀛樹繆閸欏銇濋柡宀�鍠栧畷锝嗗緞鐎ｎ亷鎷烽幇顕嗘嫹濞堝灝鏋涢柣鏍с偢閻涱噣骞囬鐔峰妳濡炪倖姊归弸鑽ゆ濡ゅ懏鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰喊鐎殿喚鏁婚、妤呭磼濠婂懐鍘梻浣侯攰閹活亞绮婚幋锔藉亗闁炽儲鍓氶悢鍡涙偣鏉炴媽顒熼柣鎿冨墯缁绘稓绮崫鍕潎闂佸搫鏈惄顖炪�侀弴銏℃櫜闁搞儮鏅濋弳鐘电磽閸屾瑧鍔嶉柛鐐跺吹缁辩偞绗熼敓钘夘嚕婵犳碍鏅插璺侯儏娴滄粓姊洪崨濠勭細闁稿孩濞婇幃鈩冩媴缁洘鏂�闂佺粯锕╅崰鏍倶椤忓牊鐓ラ柡鍥悘鈺呮煟閿濆洤鍘存鐐叉喘瀵爼宕稿Δ浣规當濠电姴鐥夐弶鍖℃嫹瑜旈獮蹇涙倻閼恒儳鍙冮梺鍛婂姦娴滄粓寮稿☉銏＄厸閻忕偛澧介埥澶愭煃閽樺妯�鐎规洩绻濋幃娆戯拷鐢告櫜閹茬偓绻濋悽闈浶ｆい鏃�鐗犲畷瑙勫閹碱厽鏅銈嗘尵婵敻锝為弴銏＄厵闁绘垶蓱椤ユ牠鏌熸搴″幋闁轰焦鍔栭幆鏃堝灳瀹曞浂鍟堢紓鍌欒兌閾忓酣宕㈡總鍛婂亯濠靛倻顭堥拑鐔哥箾閹寸儐鐒搁柣鏃傚劋鐎氭岸鏌涘▎蹇ｆЪ闁谎傜劍缁绘繂鈻撻崹顔界亪闂佹寧娲忛崕閬嶁�旈崘鈺冾浄閻庯綆浜為悾娲⒑閺傘儲娅呴柛鐕佸灦瀹曟洟鎮㈤崗灏栨寖闂佹悶鍎洪崜娆撳及閵夆晜鐓熼柟閭﹀枛閸斿鏌嶉柨瀣伌闁哄瞼鍠撶划娆撳垂椤曞懎濡风紓浣稿⒔閸嬫捇骞冮崒鐐茶摕婵炴垶鐟х弧锟介梺鍛婂姦娴滅偤鎮鹃悜妯肩闁挎繂鎳忛幖鎰版煥閺囥劋绨婚柣锝囨焿閵囨劙骞掑┑鍥ㄦ珖闂備線娼х换鍫ュ垂婵犳碍鍋樻い鏇嫹婵﹨娅ｉ幏鐘诲箵閹烘垶鐦ｇ紓鍌氬�哥粔鏉懳涘┑鍡欐殾婵°倧鎷锋い顐ｇ矒閺佹捇鎸婃径妯烘闂佸綊妫跨粈渚�宕橀敓钘夘渻閵堝棙灏甸柛鐘查叄閺佹捇鎸婃径灞肩驳濡炪們鍔婇崕鐢稿箖濞嗘挻鍤戞い鎴ｅ劵濡炬悂姊绘担鍛婂暈婵﹦鎳撻悾婵嬪箹娴ｆ瓕鎽曢梺鎸庣箓閹叉﹢寮崼鐔告闂佽姤锚閿涘鈽夊Ο閿嬫杸闂佺硶鍓濋悷锕�鈻撴ィ鍐┾拺闂傚牊绋撶粻鐐烘煕婵犲啯绀堢紒顔垮吹缁辨帒螣闂�鎰泿闂備礁鎼崯顐﹀磹閻熸壋鏋嶉柡鍥ュ灪閻撴洘淇婇婊呭笡闁稿﹥鍔栭幈銊︾節閸涱噮浠╅梺鍦嚀鐎氱増淇婇幖浣肝ㄩ柨鏃�鍎崇紞鎺楁⒒閸屾瑨鍏岄柟铏崌瀹曠敻寮介鐐殿唵闂佽法鍣﹂幏锟�?$缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閻熲晛鐣烽敐澶娢ㄧ憸蹇涘箟瑜版帗鈷掗柛灞剧懆閸忓本銇勯姀鐙呰含妤犵偞鎹囬、鏃堝幢濡ゅ啰鐡樼紓鍌氬�烽悞锕傗�﹂崶顑撅拷鍛存嚑椤掍礁鏋戦梺缁橆殔閻楀棛绮鑸电厽闁规儳宕崝锕傛煛瀹�瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷
		if(clanaim.contains("$")){
			MessageMgr.sendMsgNotify(roleid, 145025, null);
			return;
		}
		int chineseCnt = 0;
		int otherCnt = 0;
		for (int i = 0; i < clanname.length(); i++) {
			// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处缂傚啯娲熷缁樻媴閸涘﹥鍎撳┑鐐茬湴閸斿秹骞堥妸锔绘Ч閹艰揪绲块悞鍏肩節閻㈤潧孝闁稿﹦鏁诲銊︾鐎ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥閺岀喖宕楅悡搴☆潚闂佸搫鏈粙鎾寸閿旂偓瀚氶柟缁樺俯濞煎酣姊绘担鍛婃儓闁哄牜鍓欑叅闁绘棃顥撻弳锕傛煟閹惧磭宀搁柡锟芥禒瀣厱闁靛鍨电�氼參顢旈妶澶嬧拺闁煎鍊曢弸鎴犵磼椤斿吋婀版い銊ｅ劦楠炴牗绗熼崶銊︽珨闂備線娼чˇ顐﹀疾濞戞氨鐭嗛悗锝庡亖娴滄粓鏌熼悜妯虹仴闁跨喕妫勯…鐑藉箚娓氾拷瀹曞ジ濡烽敂瑙勫闂備礁鎲＄粙鎴︽晝閵夛箑绶為柛鏇ㄥ灡閻撴洟鏌熼悙顒佺稇闁告繆娅ｉ敓鍊燁潐濞叉垿宕￠幎钘夋瀬闁瑰墽绮弲鎼佹煥閻曞倹瀚�
			String regexStr = CheckName.getRegexStr();
			if (clanname.substring(i, i + 1).matches(regexStr)) {
				chineseCnt++;
			} else {
				otherCnt++;
			}
		}
		double total = chineseCnt + otherCnt / 2.0;
		int factionNameLen = 5;
		if (total < 2 || total > factionNameLen) {
			MessageMgr.sendMsgNotify(roleid, 145088, null);
			return;
		}
		if (clanaim.length() == 0) {
			MessageMgr.sendMsgNotify(roleid, 145091, null);
			return;
		}
		if (clanaim.length() > fire.pb.clan.srv.ClanManage.AIMWORD_MAX) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 145112, null);
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return ClanBaseManager.getInstance().createClan(roleid, clanname, clanaim);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808450;

	public int getType() {
		return 808450;
	}

	public java.lang.String clanname; // 公会名字
	public java.lang.String clanaim; // 公会宗旨（公告）

	public CCreateClan() {
		clanname = "";
		clanaim = "";
	}

	public CCreateClan(java.lang.String _clanname_, java.lang.String _clanaim_) {
		this.clanname = _clanname_;
		this.clanaim = _clanaim_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(clanname, "UTF-16LE");
		_os_.marshal(clanaim, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		clanname = _os_.unmarshal_String("UTF-16LE");
		clanaim = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateClan) {
			CCreateClan _o_ = (CCreateClan)_o1_;
			if (!clanname.equals(_o_.clanname)) return false;
			if (!clanaim.equals(_o_.clanaim)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += clanname.hashCode();
		_h_ += clanaim.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(clanname.length()).append(",");
		_sb_.append("T").append(clanaim.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.battle.livedie;

import fire.pb.PropRole;
import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptLiveDieBattleFirst__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptLiveDieBattleFirst extends __CAcceptLiveDieBattleFirst__ {
	@Override
	protected void process() {
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟界兘姊绘担鍝ワ紞缂侇噮鍨拌灋闁告劦鍠栫粻鏍ㄤ繆閵堝懏鍣洪柡鍛叀楠炴牜鍒掗惂鍛婂闁肩⒈鍓涘▔鍧楁⒒閸屾瑦绁版い鏇嗗懏宕查柟瀵稿Х閻瑩鏌熸潏鍓х暠闁绘挴锟芥剚鐔嗛柤鎼佹涧婵洨绱掗銏⑿ч柡宀�鍠栭幃娆擃敆閿熻姤鏅堕娑氱鐎瑰壊鍠栭獮鏍煃鐟欏嫬鐏撮柟顔界懇閹崇娀顢楅敓浠嬄烽敓浠嬫⒒娴ｈ鍋犻柛鏂挎湰閺呰埖鎯旈敐鍛亰闁诲函缍嗘禍鍫曞触鐎ｎ亶鐔嗛悹杞拌閸庡繘鏌ㄩ悢鐑樻珪缂侇噮鍨辩粚杈ㄧ節閸ヨ埖鏅┑鐐村灦椤ㄥ棝宕板鑸碘拺闁圭瀛╃粈锟介梺绋匡工缂嶅﹪骞冮敓鐘插嵆闁绘梻顭堝鍨攽閳藉棗鐏犻柟纰卞亰閸╂盯寮崼鐔哄幗闂佹寧绻傞ˇ顕�骞夋ィ鍐╃厸鐎癸拷鐎ｎ剛蓱濡ょ姷鍋涢敃顏堝蓟濞戙垹绫嶉柨鐔剁矙瀹曞綊鎮介崨濠備患闂佺粯鍨兼慨銈夊疾閹间焦鐓ラ柣鏇炲�圭�氾拷?
		Long hostid=xtable.Livedie2key.select(guestid);
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺屻劑鎮㈤崫鍕戙垽姊洪崡鐐村缂佺粯绻堝畷褰掝敃閵忕媭娼旈梺鍝ュ枎閹芥粎妲愰幘璇茬＜婵炲棙鍨垫俊钘夘渻閵堝啫濡奸柟铏耿閻涱喗绻濋崒銈嗗缓闂佽法鍠嶇划娆撳箖娴兼惌鏁婇柟鎯ф噺鐎氬綊鏌ㄥ┑鍡楀毐闁归鍏橀、姗�鎮╅崣澶屼邯闂備浇顕栭崰姘跺礂濡警鍤曢悹楦裤��閺嬪酣鏌ｉ幇闈涘缂佷緡鍣ｅ濠氬磼濮橆剨鎷烽悜鑺ュ�块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫熺箾鐎涙鐭嬬紒顔肩Ч瀵煡濡烽埡鍌楁嫼闁荤姵浜介崝灞解枍閹扮増鐓欓柛鎴欏�栫�氾拷
		if(hostid==null){
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡寮堕崼姘珔闁搞劍绻冮妵鍕冀椤愵澀绮剁紓渚婃嫹濠㈣泛顑勭换鍡涙煏閸繃鍣洪柛锝囨嚀椤╁ジ宕ㄩ娑欐杸濡炪倖姊归弸缁樼瑹濞戙垺鐓曢煫鍥ㄦ閼拌法锟芥鍠栭…鐑藉极閸愵喖纾兼繛鎴炶壘鐢姊绘担鍝ユ瀮婵℃ぜ鍔庣划鍫熺瑹閿熻棄顕ｉ幎鑺ュ�烽柣銏㈡暩閿涙粓姊虹紒妯忣亪宕捄銊х當鐟滃繒妲愰幒鎾寸秶闁靛绠戦棄宥夋⒑閻熸澘妲婚柟铏悾鐑芥倻缁涘鏅ｉ梺缁樻閺�閬嶆偟閿涘嫮纾介柛灞捐壘閿熻姤鎮傚畷鎰板传閵壯呯厠婵炶揪绲介崯顖炲箠瀹�锟界槐鎾诲磼濞嗘埈妲銈嗗灥閹虫妫熼梻渚囧墮缁夌敻寮查幖浣圭厸闁稿本锚閿熻姤顨堢划鏃堟偨閸涘﹦鍘遍柣搴秵娴滄粓顢旈銏＄厵妞ゆ梻鐓鍫濈叀濠㈣泛谩閻斿吋鐓ラ悗锝呯仛缂嶅矂姊婚崒娆戭槮闁圭⒈鍋婂畷顖烆敍閻愯尙顔囬梺褰掓？闂勫秹鏁撻挊澶嬪殗妞ゃ垺顨嗛幏鍛存惞鐠団�虫櫗闂傚倷绀佹竟濠囧磻閸℃稑绐楅幖娣妽閸婂爼鏌ㄩ弬鍨挃缁炬儳銈搁弻娑樼暆鐎ｎ喗顎嶉柣搴㈢啲閹凤拷?162129
//			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162129, null);
			sendNoFightPlayer(guestid);
			return ;
		}
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚鍤曢柛顐ｆ礀闁卞洦绻涢幋鐏活亪鈥栫�ｎ喗鈷戠�规洖娲ㄧ敮娑欎繆椤愩垹鏆ｆ鐐插暙铻栭柛娑卞枟濞呮粓鏌熼懖鈺勊夐柨鐔凤拷鐔风毢闁烩晛閰ｅ缁樻媴缁涘娈紓浣虹帛閸ㄥ湱鍒掑▎鎾崇闁挎洩鎷烽柣鎾拷鎰佺唵闁兼悂娼ф慨鍥╃磼椤愩垻效闁哄瞼鍠栭獮鍡氼槻妞わ絽纾槐鎺楀箛椤撗勭暦缂備胶绮惄顖炲极閹版澘宸濇い鏃囧Г閸婄兘姊绘担鐟邦嚋婵炶闄勭粋宥夘敂閸喎浠掑銈嗘⒒閺咁偊鎮疯ぐ鎺撶叆闁绘柨澧庨惌娆撴煏閸℃洜顦﹂柍钘夘樀婵拷闁绘ɑ鐖犻崶銊у幈闂侀潧顦崹鍝勨枍閹剧繝绻嗛柤纰卞墮閸樺瓨鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸屾稒鐣奸梻浣圭湽閸╁嫰宕归弶妫垫椽顢橀悙鍨闂佸湱澧楀姗�宕橀敓钘夘渻閵堝棙灏甸柛瀣█楠炴寮撮姀鈾�鎷洪梺纭呭亹閸嬫盯宕濋幘顔界厱闁规儳顕幊鍥╋拷瑙勬穿缁插墽鎹㈠┑瀣闁挎棁娉曢惄搴ㄦ⒒娴ｅ憡鎯堢紒澶嬬叀瀹曟繃鎯旈妸锝忔嫹閸岀偛钃熼柕澶涘閸橀亶鏌熼懖鈺勊夋俊鎻掑閻擃剟顢楅崒锔藉婵炲牆鐏濋弸娑㈡煟閺嵮佸仮鐎规洘妞介崺鍕礃閳轰緡锟芥捇姊洪懡銈呮灈闁稿锕ゅ嵄閺夊牄鍔庣弧锟介梺姹囧灲濞佳囶敁閹剧粯鐓欏瀣閸樻挳鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			sendNoFightPlayer(guestid);
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			sendNoFightPlayer(guestid);
			return ;
		}
		SAcceptLiveDieBattleFirst sAcceptLiveDieBattleFirst=new SAcceptLiveDieBattleFirst();
		sAcceptLiveDieBattleFirst.hostroleid=hostid;
		sAcceptLiveDieBattleFirst.hostrolename=new PropRole(hostid,true).getName();;
		Onlines.getInstance().send(guestid, sAcceptLiveDieBattleFirst);
	}
	
	public void sendNoFightPlayer(long guestid){
		SAcceptLiveDieBattleFirst sAcceptLiveDieBattleFirst=new SAcceptLiveDieBattleFirst();
		sAcceptLiveDieBattleFirst.hostroleid=0;
		sAcceptLiveDieBattleFirst.hostrolename="";
		Onlines.getInstance().send(guestid, sAcceptLiveDieBattleFirst);
	}
	
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793848;

	public int getType() {
		return 793848;
	}


	public CAcceptLiveDieBattleFirst() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptLiveDieBattleFirst) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptLiveDieBattleFirst _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


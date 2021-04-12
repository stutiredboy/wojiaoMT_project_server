
package cross;
import fire.pb.cross.Constant;
import fire.pb.cross.CrossManager;
import fire.pb.cross.SendRoleInfo;
import fire.pb.main.ConfigManager;

import fire.pb.main.Gs;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SendUserInfoAndTicket_Re__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SendUserInfoAndTicket_Re extends __SendUserInfoAndTicket_Re__ {
	@Override
	protected void process() {
		CrossManager.logger.info("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯幇闈涘閻庢艾缍婇弻銊╁即閻愯鎷烽幖浣瑰�峰┑鐘插暔娴滄粓鏌熼搹鐟颁沪閻庢艾婀辩槐鎾存媴閻熸澘顫嶅銈冨妼閿曨亜顕ｆ繝姘亜闁稿繗鍋愰崝鐑芥⒑閹稿孩绌块柟宄板槻椤儻顦圭紒鐘崇墵瀵濡舵径濠勯獓闂佸湱顭堟鍛婄閹绢喗鈷戦柛婵嗗濠�浼存煟閳哄﹤鐏″ǎ鍥э躬閹粎绮电�ｎ偅娅撻梻浣虹帛閹稿摜锟藉灚甯掗…鍥嚒閵堝洨锛濋梺绋挎湰閼归箖鏁撴禒瀣垫闁瑰嘲顑夊濠氬Ψ閵壯勭叄闂備胶绮…鍫ヮ敋瑜忕划濠氬冀椤愶絽鏋戦梺缁橆殔閻楀棛绮幒鎳ㄥ綊鎳栭埡浣叉瀰闂佸搫鏈惄顖氼嚕閹绢喖惟闁靛鍎哄浠嬫⒒娴ｄ警鐒鹃悗娑掓櫊楠炴垿宕惰濞兼牠鏌ц箛鎾磋础缁炬儳鍚嬫穱濠囶敍濠垫劕娈紒鐐緲缁夌懓顫忛搹鍦煓闁告牑锟藉厖绱ｆ繝鐢靛仜閻ㄧ兘鏁撻懞銉ュ闁搞倖娲栭埞鎴︽偐鐎圭姴顥濋梺缁樺笚濡炰粙寮诲☉銏犵疀闁宠桨绀侀‖瀣磽娴ｇ懓濮夐柛瀣ㄥ�曢～蹇撁洪鍕槶闂佸湱绮敮濠勮姳閼测晝纾藉ù锝囩摂閸ゆ瑩鏌涙繝鍌滅Ш妤犵偛鐗撴俊鎼佸煛娴ｅ嫇鍐剧唵閻犺桨璀﹂崕宀勬煙闁垮銇濇慨濠呮濞戠敻宕ㄩ婵囩潖闂備胶顭堥鍡涙儎椤栫偛鏋侀柟鍓х帛閸ゅ秹鏌曟竟顖氬暊閹凤繝姊绘担鍛婂暈閻㈩垱顨堥弫顔嘉旈崨顓犵暰闂佸搫鍟悧鍡樺劔闂備線娼ч敍蹇曚沪閼恒儲姣夐梻鍌氬�搁崐椋庣矆娓氾拷楠炲鍨剧搾浣规そ閺佸啴宕掑顒傦拷顓㈡⒑缂佹﹩娈旈柣妤�妫濆畷婵嬪籍閸啿鎷婚梺绋挎湰閻熝囧礉瀹ュ鍊电紒妤佺☉閸犳艾顭囬弽褉鏀介柣妯虹枃婢规﹢鏌ｉ妶鍥т壕闁靛洤瀚伴獮鍥醇閺囩噥锟藉秹姊虹粙娆惧剾濞存粠浜濠氬Ω閳哄倸浜滈梺缁樺灦閿氶柛鏃傤棞erId=" + userid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婃椽宕ㄦ繝鍐槱闂佺顑呯�氫即鐛崱娑欏�烽柣鎴炃氶幏铏圭磽閸屾瑧鍔嶉拑閬嶆煟閵婏箑鐏撮柡灞剧洴婵℃悂鏁傞懞銉︽疂UserInfoAndTicket_Re闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氬唨闁靛ě锟藉Σ鍫ユ煙閸忓吋缍戦柨鏇樺�濋崺鐐哄箣閻愯尙鐤囬梻浣侯焾閿曘儱煤閻旇偐宓侀煫鍥ㄦ穿閹风兘鏁愭惔鈩冪亪闂佸搫顑勭粈渚�鍩為幋锔藉亹闁告瑥顦ˇ鈺呮⒑缂佹ɑ灏柛搴ｆ暬瀵鏁愭径濠傚祮闂佺粯鍔橀婊堝箯閻戣棄鎹舵い鎾卞妽鐎氳鎱ㄥΟ鐓庝壕閻庢熬鎷�!");
		long roleid = CrossManager.getInstance().getTransferRoleByUserId(userid);
		if (roleid <= 0){
			CrossManager.logger.error("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯幇闈涘閻庢艾缍婇弻銊╁即閻愯鎷烽幖浣瑰�峰┑鐘插暔娴滄粓鏌熼搹鐟颁沪閻庢艾婀辩槐鎾存媴閻熸澘顫嶅銈冨妼閿曨亜顕ｆ繝姘亜闁稿繗鍋愰崝鐑芥⒑閹稿孩绌块柟宄板槻椤儻顦圭紒鐘崇墵瀵濡舵径濠勯獓闂佸湱顭堟鍛婄閹绢喗鈷戦柛婵嗗濠�浼存煟閳哄﹤鐏″ǎ鍥э躬閹粓鎸婃径宀婂悈婵犵數濞�濞佳兠洪敃鍌氱闁告鍋愰弨浠嬫煃閳轰礁鏆斿ù鐘靛█閺屾盯寮敓浠嬪垂閻㈤潻缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ弾閸炲爼姊虹涵鍛棈闁规椿浜炲濠囧锤濡や礁浠奸梺姹囧灩閹诧繝鍩涢幋锔界厽闁绘柨鎲＄欢鏌ユ煛閸℃矮鍚紒杈ㄥ笧缁辨帒顫滈崼锝忔嫹閸ф鐓欐い鏇炴缁★拷濡炪們鍨洪〃濠傜暦閻旂厧鍨傛い鎰剁稻閻濇粓姊婚崒娆戭槮闁规祴锟借秮娲晝閸屾氨顦┑鐐叉閸旀銆呴柨瀣ㄤ簻闁哄稁鍋勬禒锕傛煃闁垮鐏撮柟顔肩秺瀹曞爼鏁愯箛鏂款伓闂佸憡鍔樼亸娆擃敊閹达附鈷戞慨鐟版搐閻掓椽鏌涢妸銊ゅ惈闁轰緡鍠栬灃濞达綀銆�閺�铏節閻㈤潧孝婵炶绠撳畷闈涱吋婢跺鍘繝銏ｎ嚃閸ㄤ即骞婇幇顑╋綁宕堕浣叉嫽婵炶揪缍�婵倗娑甸崼鏇熺厱闁绘灏欒倴闂佸憡甯楃敮鎺楀煝鎼淬倗鐤�闁哄洨鍠愰鏇㈡⒒娴ｇ顥忛柛瀣噹鐓ら柨鏇炲�搁弸渚�鏌涢埄鍐炬▍鐟滅増甯楅弲鏌ユ煕閵夈儱顣抽柛鏂挎啞缁绘繈濮�閵忊�虫畬闁诲孩纰嶅姗�锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦鈽夐柨鏇樺�濆鎶藉醇濠靛啯鏂�闂佺粯鍔欓·鍌炲吹鐎ｎ剛纾奸柣妯挎珪鐏忣參鏌ｉ敐鍥у幋妤犵偛娴风划鐢碉拷锝庡亝濞呮挾绱撴担鍝勪壕濠殿垵濮ょ粋宥夘敆閸曨偆顦梺缁樺灱婵倝鍩涢幋锔藉仯闁诡厽甯掓俊濂告煛鐎ｎ偅鐓ラ柍瑙勫灴椤㈡瑩鎮欓浣圭槗闂備浇顕栭崳顖滄崲濠靛绠栭柍鍝勬噺閸嬨劑鏌涢…鎴濅壕缂佹墎鍓濇穱濠囨倷椤忓嫸鎷烽弽顓炵濡わ絽鍟壕濠氭煟閹邦剚鎯堥梻鍌ゅ灦閺屾盯鏁傜拠鎻掔缂佺偓鍎抽妶鎼佸蓟閻旂厧绠甸柟鐑樼箓閸撴娊姊烘导娆戞偧闁轰礁顭峰濠氭晬閸曨亝鍕冮柣鐘叉穿椤曟粓骞忓畡鎵虫斀闁糕剝鐟﹀▓楣冩偡濠婂懎顣奸悽顖楁櫊瀵偊宕橀鐣屽帾闂婎偄娴勭徊鍓ф濮橆厺绻嗘俊銈勭劍鐏忕數绱掓潏銊﹀磳鐎规洘甯掗埢搴ㄥ箣椤撶啘婊勪繆閻愵亜锟芥牠宕归悽绋跨疇婵☆垱瀵чˉ銈嗕繆閻愵亜锟芥牠鎮у鍫濈？闁圭増婢橀弸渚�鏌涢妷鎴嫹闁猴拷娴犲鐓曢悘鐐插⒔閻倝鏌ｉ幒鎴濃挃闁跨喓鏅幊鎾诲箟閿涘嫭宕查柛鎰靛枛妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑㈡晸閽樺鐎堕柕濞炬櫆閳锋垿鏌涘┑鍕姎閺嶏繝姊虹紒姗嗘畼濠殿喗鎸抽敐鐐剁疀閺囩姷锛滃┑鈽嗗灥閸嬫劙骞婂┑瀣拺閻犳亽鍔岄弸娆愪繆椤愩垹顏柍銉畵瀹曞爼濡歌閻﹀牆鈹戦鏂や緵闁告挻鐩、娆撳幢濞戞瑢鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?:" + userid + "!");
			return;	
		}
		CrossManager.logger.info("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯幇闈涘閻庢艾缍婇弻銊╁即閻愯鎷烽幖浣瑰�峰┑鐘插暔娴滄粓鏌熼搹鐟颁沪閻庢艾婀辩槐鎾存媴閻熸澘顫嶅銈冨妼閿曨亜顕ｆ繝姘亜闁稿繗鍋愰崝鐑芥⒑閹稿孩绌块柟宄板槻椤儻顦圭紒鐘崇墵瀵濡舵径濠勯獓闂佸湱顭堟鍛婄閹绢喗鈷戦柛婵嗗濠�浼存煟閳哄﹤鐏″ǎ鍥э躬閹粎绮电�ｎ偅娅撻梻浣虹帛閹稿摜锟藉灚甯掗…鍥嚒閵堝洨锛濋梺绋挎湰閼归箖鏁撴禒瀣垫闁瑰嘲顑夊濠氬Ψ閵壯勭叄闂備胶绮…鍫ヮ敋瑜忕划濠氬冀椤愶絽鏋戦梺缁橆殔閻楀棛绮幒鎳ㄥ綊鎳栭埡浣叉瀰闂佸搫鏈惄顖氼嚕閹绢喖惟闁靛鍎哄浠嬫⒒娴ｄ警鐒鹃悗娑掓櫊楠炴垿宕惰濞兼牠鏌ц箛鎾磋础缁炬儳鍚嬫穱濠囶敍濠垫劕娈紒鐐緲缁夌懓顫忛搹鍦煓闁告牑锟藉厖绱ｆ繝鐢靛仜閻ㄧ兘鏁撻懞銉ュ闁搞倖娲栭埞鎴︽偐鐎圭姴顥濋梺缁樺笚濡炰粙寮诲☉銏犵疀闁宠桨绀侀‖瀣磽娴ｇ懓濮夐柛瀣ㄥ�曢～蹇撁洪鍕槶闂佸湱绮敮濠勮姳閼测晝纾藉ù锝囩摂閸ゆ瑩鏌涙繝鍌滅Ш妤犵偛鐗撴俊鎼佸煛娴ｅ嫇鍐剧唵閻犺桨璀﹂崕宀勬煙闁垮銇濇慨濠呮濞戠敻宕ㄩ婵囩潖闂備胶顭堥鍡涙儎椤栫偛鏋侀柟鍓х帛閸ゅ秹鏌曟竟顖氬暊閹凤繝姊绘担鍛婂暈閻㈩垱顨堥弫顔嘉旈崨顓犵暰闂佸搫鍟悧鍡樺劔闂備線娼ч敍蹇曚沪閼恒儲姣夐梻鍌氬�搁崐椋庣矆娓氾拷楠炲鍨剧搾浣规そ閺佸啴宕掑顒傦拷顓㈡⒑缂佹﹩娈旈柣妤�妫濆畷婵嬪籍閸啿鎷婚梺绋挎湰閻熝囧礉瀹ュ鍊电紒妤佺☉閸犳艾顭囬弽褉鏀介柣妯虹枃婢规﹢鏌ｉ妶鍥т壕闁靛洤瀚伴獮鍥醇閺囩噥锟藉秹姊虹粙娆惧剾濞存粠浜濠氬Ω閳哄倸浜滈梺鍛婃尫閼冲爼鎮￠幘鏂ユ斀妞ゆ梻銆嬮崝鐔虹磼椤曞懎鐏︽鐐茬箻瀹曘劑顢涘☉妯荤�梻浣告啞濞诧箓宕戦崒鐐蹭紶婵°倕鎳忛埛鎺懨归敐鍕劅闁绘帡绠栭幃妤�鈽夐幒鎾寸彆缂備胶绮粙鎺旀崲濠靛纾兼繝濠傚椤旀洟姊绘担鐑樺殌闁宦板妿缂傛捇骞嗛‖顒婄秮瀹曞ジ濡烽敂鎯у笚闂佽崵濮惧▍锝夊磿閵堝绠氶柛顐ゅ枔缁犲墽锟界懓澹婇崰鏍ь嚕椤旀拝鎷峰▓鍨珮闁稿锕悰顔嘉熼懖鈺冿紲濠碘槅鍨崇划顖烆敂閻斿吋鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷.roleId=" + roleid + ",retcode=" + retcode);
		if (retcode != RET_OK) {
			return;
		}
		
		boolean needResetData = xtable.Crosstemproles.select(roleid) == null;
		SendRoleInfo send = new SendRoleInfo();
		send.myzoneid = Integer.parseInt(Gs.serverid);
		send.userid = userid;
		send.roleid = roleid;
		send.flag = Constant.TO_CROSS;
		send.needcleardata = (byte)(needResetData ? 1 : 0);
		CrossManager.getInstance().sendToCrossServer(Constant.SendRoleInfo, send);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 229;

	public int getType() {
		return 229;
	}

	public final static int RET_OK = 0;
	public final static int RET_NETWORK_ERROR = 1;
	public final static int RET_MULTI_LOGIN = 2;
	public final static int RET_SERVER_OVERLOAD = 3;

	public int retcode;
	public int userid;
	public byte flag;

	public SendUserInfoAndTicket_Re() {
	}

	public SendUserInfoAndTicket_Re(int _retcode_, int _userid_, byte _flag_) {
		this.retcode = _retcode_;
		this.userid = _userid_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(retcode);
		_os_.marshal(userid);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		retcode = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SendUserInfoAndTicket_Re) {
			SendUserInfoAndTicket_Re _o_ = (SendUserInfoAndTicket_Re)_o1_;
			if (retcode != _o_.retcode) return false;
			if (userid != _o_.userid) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += retcode;
		_h_ += userid;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(retcode).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SendUserInfoAndTicket_Re _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = retcode - _o_.retcode;
		if (0 != _c_) return _c_;
		_c_ = userid - _o_.userid;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


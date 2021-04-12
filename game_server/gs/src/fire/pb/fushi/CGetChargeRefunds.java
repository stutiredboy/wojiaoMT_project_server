
package fire.pb.fushi;

import org.apache.log4j.Logger;

import fire.pb.RoleConfigManager;
import fire.pb.common.SCommon;
import fire.pb.main.Gs;
import gnet.DataBetweenAuAnyAndGS;
import gnet.DeliveryManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetChargeRefunds__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetChargeRefunds extends __CGetChargeRefunds__ {
	private static Logger logger=Logger.getLogger("RECHARGE");
	
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		if (roleid < 0 || userid <0) {
			logger.error("CGetChargeRefunds.userid:" + userid + ",roleid:" + roleid + ".闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵噣鏁撴禒瀣婵犻潧顑呯粻顖氼渻鐎ｎ亝鎹ｇ紒鐘虫⒐缁绘盯骞嬮悙鍡樺灦瀵板嫰宕熼娑氬幈闁诲函绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑閸濆嫭鍌ㄩ柛銊ョ秺閺屽宕堕妸褏鐦堥梺鍓茬厛閸嬪嫭鎱ㄩ崼銉ユ瀬闁割偁鍎查埛鎺懨归敐鍛暈闁诡垰鐗撻弻鐔兼煥鐎ｎ亞浼屽Δ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�?");
			return;
		}
		final SCommon cc = RoleConfigManager.getRoleCommonConfig(309);
		if (cc == null) {
			logger.error("CGetChargeRefunds.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴閸涘﹨纭�婵犫拃鍕垫當妞ゎ厼鐏濊灒闁兼祴鏅欑粭澶愭⒑缂佹﹩鐒界紒顕呭灦閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞闁靛ě鍛獎闂備礁澹婇崑渚�宕曢懡銈囩闁哄诞宀�鍞甸柣鐘烘〃鐠�锕傚磿閹达附鐓熸繝闈涙閸╋綁鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旈崨顓熺彯婵犵數鍋為崹鍫曞箰閸濄儳鐭撶憸鐗堝笒閽冪喖鏌ㄥ☉妯侯仹婵炲矈浜幃褰掑炊閵娿儳绁锋繝娈垮枛濞撮妲愰幘瀛樺闁告繂瀚ぐ娆撴⒑閹肩偛鍔橀柛鏂块叄瀹曘垽骞樼紒妯锋嫼闂佸憡绋戦敃锔剧不閹剧粯鍊垫慨妯煎帶婢ь垳绱掗崒姘毙ч柟顔界懇閹粌螣閻撳骸绠洪梻鍌欒兌閹虫捇骞栭銈囩煋闁割偅娲橀崕妤佺箾閸℃ɑ灏伴柣鎾寸〒閿熺晫娅㈤幏鐑芥倵閿濆骸澧扮悮锕傛⒒娴ｈ櫣銆婇柡鍛〒閿熻姤纰嶅姗�鎮惧畡閭︽建闁跨喕濮ゆ穱濠傤潰瀹�濠冃ㄩ梻浣筋嚃閸ｎ垳绱炴担鍓叉綎缂備焦蓱婵挳鏌涢敂璇插箺闁煎灝娲铏圭矙閹稿孩宕抽梺绋跨昂閸婃鍒掔�ｎ亶鍚嬪璺侯儐濞呮粍绻濋姀銏☆仧缂佺姵鍨电叅妞ゆ挶鍨归弸渚�鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨嗘穱濠囧Χ閸涱喖娅濋梺璺ㄥ枑閺嬭崵绮婚幘宕囨殾濠靛倸鎲￠崑鍕磽閸垹啸闁活厽甯″缁樻媴閸濄儳楔濠碘槅鍋夊▔鏇犲垝閸喐濯撮柟鎵暀閸パ嗘憰闂侀潧锛忛崘銊у闂傚倷鐒﹂幃鍫曞磿椤栫偛绀夐幖娣妼閻撱垹銆掑鐐闂佸搫鑻粔褰掑蓟閵娧嶆嫹閿濆簼绨藉ù鐓庣焸濮婃椽宕崟顐У闂佸憡鎸荤换鍌烆敋閵夆晛绀嬫い鎺嶇閸斿懘姊洪棃娑氱畾闁稿鎹囬弫鎾绘寠婢舵稖鍚梺鍝勮閸婃繂鐣烽敐鍡楃窞閻忕偠袙閹风増绻濆▓鍨灈闁挎洏鍊濋獮鏍敃閿濆棙鐝￠梻鍌欑劍閹爼宕曞鍐惧悑闁糕剝顨忔导鎾绘煟閻斿摜鐭嬫俊顐㈠暣閹即顢欑捄銊ф澑濠电偞鍨堕悷锕�鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�309濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺顭堥悘鍐⒑閹稿海绠撻柟鍐查叄瀵娊鎮欓悜妯煎幈闁硅壈鎻槐鏇熸櫏闂備礁鎼惌澶岀礊娴ｅ壊鍤曞ù鐘差儏鎯熼梺闈涱檧闂勫嫬鈻撻。锟�!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		int rolelevel = xtable.Properties.selectLevel(roleid);
		if(rolelevel < (cc == null ? 0 : Integer.parseInt(cc.getValue()))) {
			logger.error("CGetChargeRefunds.缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥ュ焺閺佸秹鏌ｉ幇顖氱毢妞わ富鍣ｉ弻鐔煎礂閼测晜娈梺鍛婃煥閻倿骞冮垾鏂ユ斀閻庯綆鍋嗛崢鎼佹⒑閸涘﹤濮傞柛鏂挎湰缁傚秵瀵肩�涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾绘⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋戦敓钘夊暣瀹曘劑顢橀崶銊р槈闁宠鍨垮畷鍗炩枎閹邦収鍟庢繝鐢靛仜椤曨參宕㈣閹椽濡搁埡浣烘煣闂佸綊妫块悞锕傛偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼崨濠冨�愰柍銉︽瀹曟﹢顢旀惔銏狀伓闂佹寧绻傜花鑲╄姳缂佹ǜ浜滈柟鍝勵儏閻忣噣鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閿曘垽骞冮敓鐘虫櫢闁绘灏幗鏇㈡⒑缂佹ɑ鈷掗悘蹇嬪姂楠炲繘鎮滈懞銉ヤ缓濠电偛鐗愬▔鏇㈠礉閸涘﹦绠鹃悗鐢殿焾椤庢挾绱掗悩鍐茬伌婵狅拷娴ｇ硶鏀介柣妯款嚋閺�濠氭煕閺冿拷閻楁粓鏁撻懞銉у暡闁瑰嚖鎷�?!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		
		xbean.AUUserInfo userinfo = xtable.Auuserinfo.select(userid);
		if(userinfo == null) {
			logger.error("CGetChargeRefunds.AUUserInfo濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺顭堥悘鍐⒑閹稿海绠撻柟鍐查叄瀵娊鎮欓悜妯煎幈闁硅壈鎻槐鏇熸櫏闂備礁鎼惌澶岀礊娴ｅ壊鍤曞ù鐘差儏鎯熼梺闈涱檧闂勫嫬鈻撻。锟�!userid:" + userid + ",roleid:" + roleid);
			return;
		}
		String username = userinfo.getUsername();
		DataBetweenAuAnyAndGS ausnd = new DataBetweenAuAnyAndGS();
		ausnd.flag = DataBetweenAuAnyAndGS.GS_TO_AuAny;
		ausnd.qtype = 9003;
		ausnd.userid = userid;
		OctetsStream temp = new OctetsStream();
		temp.marshal(username);
		temp.marshal(Gs.serverid);
		ausnd.info = temp;
		DeliveryManager.getInstance().send(ausnd);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812485;

	public int getType() {
		return 812485;
	}


	public CGetChargeRefunds() {
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
		if (_o1_ instanceof CGetChargeRefunds) {
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

	public int compareTo(CGetChargeRefunds _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


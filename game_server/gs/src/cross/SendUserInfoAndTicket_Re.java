
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
		CrossManager.logger.info("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤愵剚瀚归柨鏇炲�搁悙濠冦亜閹虹偞瀚圭紓浣瑰姈椤ㄥ﹪寮婚悢鍏肩劷闁挎洩鎷峰褔绠栭弻銈夊级閹稿骸浠撮梺鍝勬湰閻╊垱淇婇悜绛嬫晩闁绘挸瀵掑鑽ょ磽閸屾艾锟介鎷嬮弻銉ョ柧闁绘顕х粻鏍喐閻楀牆绗掑ù鑲╁█閺屾盯寮撮妸銉ヮ潽闂佺瀛╅幑鍥ь潖閾忓湱纾兼俊顖濐嚙绾板秹姊虹粙鍖″伐婵炲皷锟芥剚鍤曞┑鐘宠壘閻掓椽鏌涢幇鈺佸缂佹劗鍋ゅ娲礈閹绘帊绨肩紓浣筋嚙閸婂綊骞堥妸鈺佄у璺侯儌閹锋椽姊虹涵鍛汗闁稿鐩弫鎾绘嚍閵壯冣拡闂佸憡甯楃敮妤呭箚閺冨牆惟闁靛／灞芥暭闂傚倷绀侀幉鈥趁洪敃鍌氬瀭闁绘鐗嗛崝鏃堟⒒閸屾瑧鍔嶉悗绗涘喚娼栧┑鐘宠壘閻ょ偓銇勯幇鍫曟闁稿浜弻銊╂偄閻戞ê鍔磗erId=" + userid + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺鍛婃处閸嬪嫰骞嗛悙鐑樷拺缂備焦蓱閻ㄦ垿鏌涢妸锔芥暋UserInfoAndTicket_Re闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯弽銊р槈閹兼潙锕ら埞鎴炲箠闁稿﹥娲熼獮蹇曪拷锝庡枛閺嬩礁鈹戦悩鍙夊闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�!");
		long roleid = CrossManager.getInstance().getTransferRoleByUserId(userid);
		if (roleid <= 0){
			CrossManager.logger.error("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤愵剚瀚归柨鏇炲�搁悙濠冦亜閹虹偞瀚圭紓浣瑰姈椤ㄥ﹪寮婚悢鍏肩劷闁挎洩鎷峰褔绠栭弻銈夊级閹稿骸浠撮梺鍝勬湰閻╊垱淇婇悜钘夌婵犻潧娲﹂幏鍗炩攽閳╁啨浠犻柛鏃�鍨甸～蹇撁洪鍕唶闁硅壈鎻徊鍧楁偩閻㈠憡鈷戦柣鐔告緲閺嗚京绱掔紒姗堣�块柟顕嗙節椤㈡宕熼崹顐ｆ珜闂備礁鎲″ú锕傚礈濞嗘劗顩锋い鏍仦閳锋垿鎮归崶锝忔嫹閸愯尙顔戦梺姹囧焺閸ㄨ京鏁Δ浣衡攳濠电姴娲﹂崵宥夋煏婢诡垰鎳愬Σ鍥⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庤箛鏇熸闂佸壊鍋呭ú锕傚极閸℃褰掓晲閸ュ墎鍔告繝銏㈡嚀鐎氭澘顫忕紒妯诲闁告稑锕ら弳鍫濃攽閻愰鍤嬬紒鐘虫尭閻ｇ兘骞庣粵瀣櫓缂佺偓濯芥禍顒勫礉閻戣姤鈷戦悹鎭掑妼閺嬫柨鈹戦鐐毈闁诡噯绻濋幃鈺呮偨閸偓绱℃俊鐐�栭幐楣冨磻閻愬搫闂柛锔诲幘绾惧ジ鏌熼幓鎺濆剳闁伙絿鏁婚弻锛勪沪鐠囪鎷峰┑鍡欐殾鐟滅増甯╅弫鍐煏韫囷絾绶氭俊妤佹尵缁辨捇宕掑▎鎴М濡炪倖鍨甸幊妯挎濡炪倖鐗滈崕鎰板极閸パ�鏀介柛灞剧矤閻掑墽锟界懓鎲＄换鍐Φ閸曨垰鍐�闁靛ě锟藉銊╂⒑閸濄儱校闁绘濮撮～蹇曠磼濡偐鎳濋梺璺ㄥ枙濡嫰鈥﹂崶銊х瘈婵﹩鍓涢鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?:" + userid + "!");
			return;	
		}
		CrossManager.logger.info("SendUserInfoAndTicket_Re.闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤愵剚瀚归柨鏇炲�搁悙濠冦亜閹虹偞瀚圭紓浣瑰姈椤ㄥ﹪寮婚悢鍏肩劷闁挎洩鎷峰褔绠栭弻銈夊级閹稿骸浠撮梺鍝勬湰閻╊垱淇婇悜绛嬫晩闁绘挸瀵掑鑽ょ磽閸屾艾锟介鎷嬮弻銉ョ柧闁绘顕х粻鏍喐閻楀牆绗掑ù鑲╁█閺屾盯寮撮妸銉ヮ潽闂佺瀛╅幑鍥ь潖閾忓湱纾兼俊顖濐嚙绾板秹姊虹粙鍖″伐婵炲皷锟芥剚鍤曞┑鐘宠壘閻掓椽鏌涢幇鈺佸缂佹劗鍋ゅ娲礈閹绘帊绨肩紓浣筋嚙閸婂綊骞堥妸鈺佄у璺侯儌閹锋椽姊虹涵鍛汗闁稿鐩弫鎾绘嚍閵壯冣拡闂佸憡甯楃敮妤呭箚閺冨牆惟闁靛／灞芥暭闂傚倷绀侀幉鈥趁洪敃鍌氬瀭闁绘鐗嗛崝鏃堟⒒閸屾瑧鍔嶉悗绗涘喚娼栧┑鐘宠壘閻ょ偓銇勯幇鍫曟闁稿浜弻銊╂偄閸撲胶鐓撳┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫆缁绘稒绻濋崒婊勬闂佺懓鐡ㄧ缓鎯ｉ崼銉︾厓閻犺櫣鍎ら幆鍫熺箾瀹割喖寮�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�.roleId=" + roleid + ",retcode=" + retcode);
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


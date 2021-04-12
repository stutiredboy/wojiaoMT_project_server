
package cross;
import fire.pb.cross.CrossManager;
import gnet.DeliveryManager;
import gnet.link.Onlines;
import gnet.link.User;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SendUserInfoAndTicket__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SendUserInfoAndTicket extends __SendUserInfoAndTicket__ {
	@Override
	protected void process() {
		// protocol handle
		new mkdb.Procedure(){
			@Override
			protected boolean process() throws Exception {
				CrossManager.logger.info("SendUserInfoAndTicket.闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞剧洴閳ワ箓骞嬪┑鍛晼婵＄偑鍊愰弲婊嗐亹閸愵喗绠掗梻浣虹帛閿氭俊顖氾躬瀹曟洝绠涢弴鐘碉紲闂佽法鍠曟慨銈咁嚗閸曨偆鏆嗛悗锝庡亜椤忚泛螖閻橀潧浠滈柣蹇旂箞瀹曟繂顫濋懜鐢靛幍闂備礁鐏濋鍛存倶閹绢喗鐓欓柧蹇ｅ亝瀹曞瞼锟借娲滈…鍫ｇ亙婵炶揪绲介幖顐︾嵁閸儲鈷掑〒姘炬嫹婵炰匠鍥佸洦绂掔�ｎ亞鐛ラ梺鍝勭Р閸斿秴鈻嶉悩鐐戒簻闁哄倸鐏濋埛鏃傜棯閹规劖顥夐棁澶愭煥濠靛棙鍣圭紒鐙欏嫮绠鹃柛娑卞弿闊剟鏌″畝锟介崰鏍�佸▎鎾村殐闁冲搫鍞妸鈺傚�甸悷娆忓婢跺嫰鏌涚�ｎ亷宸ラ柣锝囧厴閹垻鍠婃潏銊︽珜濠电偠鎻徊鍧椻�﹂崼鐔虹彾鐎广儱顦伴埛鎺楁煕鐏炲墽鎳嗛柛蹇撶灱缁辨帡顢氶崨顓犱桓濡ょ姷鍋為崝娆撶嵁閺嶃劍濯撮柛婵勫劵缁鳖噣姊绘担渚綊闁告洖鐏氶悾鍫曟⒑閽樺鏆熼柛鐘崇墵瀵顓兼径濠勫幐婵炶揪绲介幉鈥斥枔椤撶姷纾藉ù锝囶焾椤ｆ娊鏌涚�ｃ劌锟芥繂顕ｇ拠娴嬫闁靛繆鏅滈弲婵嬫⒑閹稿海绠撴繛灞傚姂閹箖宕归銈囩槇濠电偛鐗嗛悘婵嬪几閺冨牊鐓曞┑鐘插暟缁犳挻銇勯銏㈢閻撱倖銇勮箛鎾愁伀妞ゆ梹鍔欏铏圭磼濡搫顫戝銈嗘礃缁捇鐛箛娑欏�婚柦妯侯槸閸炪劌顪冮妶鍡樺暗闁哥姴瀛╃粋鎺懨洪鍛嫼缂傚倷鐒﹂…鍥儗瀹�鍕厽婵犲灚鍔栧▍銑=" + userinfo.userid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫬鐣濈�ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婃椽宕ㄦ繝鍐槱闂佺顑呯�氫即鐛崱娑欏�烽柣鎴炃氶幏铏圭磽閸屾瑧鍔嶉拑閬嶆煟閵婏箑鐏撮柡灞剧洴婵℃悂鏁傞懞銉︽疂UserInfoAndTicket闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氬唨闁靛ě锟藉Σ鍫ユ煙閸忓吋缍戦柨鏇樺�濋崺鐐哄箣閻愯尙鐤囬梻浣侯焾閿曘儱煤閻旇偐宓侀煫鍥ㄦ穿閹风兘鏁愭惔鈩冪亪闂佸搫顑勭粈渚�鍩為幋锔藉亹闁告瑥顦ˇ鈺呮⒑缂佹ɑ灏柛搴ｆ暬瀵鏁愭径濠傚祮闂佺粯鍔橀婊堝箯閻戣棄鎹舵い鎾卞妽鐎氳鎱ㄥΟ鐓庝壕閻庢熬鎷�!");
				User user = Onlines.getInstance().getConnectedUsers().getUserByUserId(userinfo.userid);
				if(user != null)
					user.setIp(userinfo.loginip);
				xbean.AUUserInfo info=xbean.Pod.newAUUserInfo();
				info.setRetcode(0);
				info.setFunc(userinfo.func);
				info.setFuncparm(userinfo.funcparm);
				info.setLoginip(userinfo.loginip);
				info.setBlisgm(userinfo.blisgm);
				info.getAuth().addAll(userinfo.auth);
				info.setAlgorithm(userinfo.algorithm);
				info.setNicknameOctets(userinfo.nickname);
				xtable.Auuserinfo.remove(userinfo.userid);
				xtable.Auuserinfo.add(userinfo.userid, info);
				DeliveryManager.getInstance().send(new SendUserInfoAndTicket_Re(SendUserInfoAndTicket_Re.RET_OK, userinfo.userid, flag));
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 228;

	public int getType() {
		return 228;
	}

	public com.locojoy.base.Octets account;
	public cross.UserInfo userinfo;
	public com.locojoy.base.Octets ticket;
	public byte flag;

	public SendUserInfoAndTicket() {
		account = new com.locojoy.base.Octets();
		userinfo = new cross.UserInfo();
		ticket = new com.locojoy.base.Octets();
	}

	public SendUserInfoAndTicket(com.locojoy.base.Octets _account_, cross.UserInfo _userinfo_, com.locojoy.base.Octets _ticket_, byte _flag_) {
		this.account = _account_;
		this.userinfo = _userinfo_;
		this.ticket = _ticket_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		if (!userinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(account);
		_os_.marshal(userinfo);
		_os_.marshal(ticket);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		account = _os_.unmarshal_Octets();
		userinfo.unmarshal(_os_);
		ticket = _os_.unmarshal_Octets();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SendUserInfoAndTicket) {
			SendUserInfoAndTicket _o_ = (SendUserInfoAndTicket)_o1_;
			if (!account.equals(_o_.account)) return false;
			if (!userinfo.equals(_o_.userinfo)) return false;
			if (!ticket.equals(_o_.ticket)) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += account.hashCode();
		_h_ += userinfo.hashCode();
		_h_ += ticket.hashCode();
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("B").append(account.size()).append(",");
		_sb_.append(userinfo).append(",");
		_sb_.append("B").append(ticket.size()).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


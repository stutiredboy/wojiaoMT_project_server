
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
				CrossManager.logger.info("SendUserInfoAndTicket.闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌涢…鎴濅簽妞も晜褰冮湁闁绘ê妯婇崕蹇曠磼閿熻姤寰勫畝瀣妤犵偛鐏濋崝姘舵煙闁垮鐏撮柟铏崌瀹曠螖娴ｅ搫骞堥梻渚�娼чˇ浠嬪窗閺嶃劍娅犳い鏂垮⒔绾捐棄霉閿濆懎绾ф繛鍛躬閺岀喖顢欓懖鈺冃ㄩ悗瑙勬处閸嬪﹤鐣烽悢纰辨晢濞达絿顭堟竟宥夋⒒閸屾瑨鍏岀紒顕呭灦楠炴劙骞栨担鍝ワ紮闂佺鍕垫當闁藉啰鍠栭弻宥夊煛娴ｅ憡娈紓浣稿閸嬨倝寮诲☉銏╂晝闁挎繂娲ㄩ悾鍨節濞堝灝鏋旈柛濠冪箓椤繐煤椤忓嫮顔愰梺缁樺姌椤曟粓骞忛悜钘夊唨妞ゆ挾鍠庢禒娲⒑缂佹鐭岄柣婵愭櫩Id=" + userinfo.userid + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺鍛婃处閸嬪嫰骞嗛悙鐑樷拺缂備焦蓱閻ㄦ垿鏌涢妸锔芥暋UserInfoAndTicket闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯弽銊р槈閹兼潙锕ら埞鎴炲箠闁稿﹥娲熼獮蹇曪拷锝庡枛閺嬩礁鈹戦悩鍙夊闁绘挶鍎甸弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�!");
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


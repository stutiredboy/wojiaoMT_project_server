
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
				CrossManager.logger.info("SendUserInfoAndTicket.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦鍓ф创闁炽儻绠撻獮瀣攽閸涱垱鏅煎┑锛勫亼閸婃劙寮插鍡愪汗闁告劦鍠楃粻鎺楁⒒娴ｈ櫣甯涢柨姘繆椤栨熬韬�规洘娲濈粻娑㈠即閻樼绱查梻浣芥硶閸犳洘鎱ㄩ妶鍜佸殫闁告洦鍋嗛弳鍡涙倵閿濆骸浜滄い蹇氭硾铻栭柣姗�娼ф禒婊堟煟韫囨梻绠炵�规洘绻傞～婵嬫嚋閻㈤潧骞嶉梻鍌欑閻忔繈顢栭崨瀛樺�堕柟缁㈠枟閻撴瑩鏌ц箛锝呬簼鐎规洖鐬奸敓鍊燁潐濞叉粓鈥﹂崼锝囦簷濠电偠鎻徊浠嬪箹椤愶妇宓侀柛顐犲劜閳锋帒銆掑鐐濠电偘鍖犻崶浣告处缁傛帞锟斤綆浜為悰銉╂⒑閸濆嫮袪闁告柨绉撮埢宥夋偐閻愭垝绨婚梺鍝勫�搁悘婵嬪煕閺冨倻妫柟瑙勫姈椤ュ妫佹径鎰叆婵犻潧妫欓崳鍦磼閻欐瑥瀚粻楣冩煕濞戝崬寮块棅顒夊墴閺屸�崇暆閿熶粙宕伴弽顓滐拷浣糕枎閹炬潙娈愰梺鍐叉惈閸烆參濡搁埡鍌氾拷鐢告偡濞嗗繐顏璺哄閺屾稓锟斤綆浜峰銉╂煟閿濆洤鍘撮柟顔哄灮閸犲﹥娼忛妸锔界彍婵犵數鍋犻幓顏嗗緤閸фせ锟斤箓宕奸悢铏瑰骄閻庡箍鍎遍ˇ浼村煕閹烘鐓曢悘鐐插⒔閹冲棝鏌涜箛鎾剁伇缂佽鲸甯￠、姘跺川椤撶姳妗撴俊銈囧Х閸嬬偤宕濆▎鎾跺祦闁哄秲鍔嶆刊鎾煕濠靛嫬鍔电紒槌栧櫍濮婄粯鎷呮笟顖涚秺闂佸憡娲栭悘姘舵偩閸洘鈷戦柦妯侯槸閺嗙喖鏌涢悩宕囧⒌鐎殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐垾鏂ユ灁妞ゆ挾濮风壕钘壝归敐鍥剁劸妞わ絾濞婇弻娑氾拷锝冨妼閿熻姤绻傞锝囨嫚濞村顫嶉梺闈涚箚閺呮粓寮插┑瀣拺闁圭娴风粻鎾寸箾鐏炲倸濮傞柟顕�绠栧畷褰掝敃閵堝洨妲囨繝鐢靛仜閻楀棝鎮樺┑瀣嚑闁哄啫鐗婇悡鏇炩攽閻樻彃鏆熺紒鐘虫尰閵囧嫰顢曢姀銏㈩唶闁绘挶鍊栭妵鍕疀閹炬剚浼�濡炪倖姊归崝娆忣潖閾忓湱纾兼俊顖氭惈椤垵顪冮妶鍡樼缂侇喗鎹囬悰顔跨疀濞戞瑥锟藉鏌﹀Ο渚Ц闁哥偑鍔岄—鍐Χ閸℃ê鏆楅梺鍝ュТ鐎涒晝绮嬮幒鎳ㄦ椽顢旈崨顏呭缂傚倸鍊烽悞锕傗�﹂崶顒佸剹鐎癸拷閸曨剛鍘藉┑鐘茬仛閸旀牕鈻嶉姂顤�=" + userinfo.userid + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹥妞藉畷銊︾節閸愵煈妲遍梻浣侯焾椤戝懐锟芥矮鍗抽悰顕�宕卞☉娆忥拷鐑芥煟閹寸們姘跺箯閾忓湱纾介柛灞剧懅閸斿秹鎷戦柆宥嗙厽闁靛绠戦悘鎾煛鐏炲墽娲村┑鈩冩倐閺佸倿鎳為妷锔界杺UserInfoAndTicket闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰寮撮悙鎼！闁诲孩鑹剧紞濠囧蓟濞戙垹绠涢梻鍫熺♁閻忓牓鎮楅悷鐗堝暈缂佽鍟存俊鐢稿礋椤栨艾鍞ㄩ梺闈浤涢敓钘壩ｉ崼銉︾厵闁稿繐鍚嬬紞鎴︽煥閺囨ê锟芥繈宕洪悙鍝勭闁绘劘灏欓悿鍥⒒娴ｄ警鐒鹃柨鏇樺劚鐓ら柣鏃囧亹瀹撲線鐓崶銊︾┛闁归鍏橀弫鎰償閳╁啰浜梻浣告惈椤戝嫮绮堟笟锟介崺鐐哄箣閿旇棄浜归梺鍛婄懃椤︻垶藝閳哄懏鈷戠紓浣股戠亸顏堟煕鎼达絾鏆�殿喖顭烽弫鎰緞婵犲倸绁梻浣虹帛閸旀﹢顢氬鍫濈闁绘垼妫勯幑鑸点亜閹惧崬濡介悗姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷!");
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


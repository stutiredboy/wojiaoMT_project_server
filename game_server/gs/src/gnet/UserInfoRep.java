
package gnet;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import fire.pb.main.ConfigManager;
import fire.pb.state.StateManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __UserInfoRep__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class UserInfoRep extends __UserInfoRep__ {
	
	static String osType = "";
	static Map<String, String> ostypes = new HashMap<String, String>();
	static{
		Properties propConf = ConfigManager.getInstance().getPropConf("sys");
		if (propConf != null)
			osType = propConf.getProperty("sys.os.type");
		String[] tmps = osType.split(";");
		for (String str : tmps) {
			ostypes.put(str, str.substring(str.length()-1));
		}
		
	}
	@Override
	protected void process() {
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				xbean.AUUserInfo info=xbean.Pod.newAUUserInfo();
				info.setRetcode(retcode);
				info.setFunc(func);
				info.setFuncparm(funcparm);
				info.setLoginip(loginip);
				info.setBlisgm(blisgm);
				info.getAuth().addAll(auth);
				info.setAlgorithm(algorithm);
				info.setNicknameOctets(nickname);
				//xdb.Trace.info("UserInfoRep:nickname=" + new String(nickname.getBytes(), "ISO-8859-1"));
				OctetsStream octstream = new OctetsStream(nickname);
				String nickNameStr = octstream.unmarshal_String("ISO-8859-1");
				info.setUsername(octstream.unmarshal_String("UTF-8"));
				info.setNickname(nickNameStr);
				
				//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜忛弳锕傛煟閵忋埄鐒剧紒鎰殜閺岀喖骞嶉纰辨毉闂佺顑戠换婵嗩嚕閸洖閱囨慨姗嗗幗閻濇梻绱撴担鐣屽牚闁稿﹥娲濋悘鍐⒑閹稿海绠撻柟鍐查叄瀵娊鎮欓悜妯煎幈婵犵數濮村ú锕�鈽夎濡焦寰勯幇顓犲幗濠碘槅鍨抽崕銈夊煝閺囥垺鐓曢幖杈剧磿缁犲磭绱掓潏銊ユ诞闁轰焦鎸荤粋鎺旓拷锝庝簽椤︽澘顪冮妶鍡欏缂佸鎹囧畷銏＄鐎ｎ偀鎷洪梺鑽ゅ枛閸嬪﹪宕甸悢鍏肩厱閹兼番鍨规慨宥夋煙椤旀儳浠遍柟宕囧仱婵＄兘鏁愰崟顓犳晨闂傚倷鑳堕幊鎾绘偤閵娧勫床闁告洦鍓氬▍鐘绘煥閺冨洤袚闁告瑥绻愰埞鎴︽偐閹绘帗娈查梺闈涙处缁诲啴濡甸崟顖氼潊闁宠棄妫欓悾鐑芥⒑閻熸澘妲婚柟铏耿楠炲啴鎮滈挊澶岊吋濡炪倖娲栭幊蹇撯枔瑜版帗鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儺鍓﹂弫瀣煛瀹ュ骸骞栫紒鎰殕娣囧﹪濡惰箛鏂款伓闂佺粯鎸堕崐鏍崲濠靛洨绡�闁稿本绮岄·锟介梻浣告惈閹冲繘骞冮崒鐐茶摕闁靛牆顦粻鎺楁煙閻戞ê鐏ュ┑顔奸叄濮婃椽宕妷銉愶絾绻涢懠顒�鏋涚�殿喖顭烽幃銏ゆ偂鎼达綆妲遍梻渚�娼ч悧鍡椢涘Δ鍜佹晜闁跨噦鎷�
				String userNameStr = info.getUsername();
//				String userNameStr = "1234567890@@yingyongbao@2";
				String [] str = userNameStr.split("@");
				if (str.length == 4) {
					if (!str[2].equals("")) {
						info.setPlatname(str[2]);
					}
					else {
						StateManager.logger.info(new StringBuilder().append("userid:")
								.append(userid).append(",username is:").append(userNameStr));
					}
				}
				else {
					StateManager.logger.info(new StringBuilder().append("userid:")
							.append(userid).append(",username is:").append(userNameStr));
				}
				
				Properties prop = ConfigManager.getInstance().getPropConf("sys");
				if (prop != null) {
					String value = prop.getProperty("sys.gm.userids");
					String value2 = prop.getProperty("sys.lowlvgm.userids");
					if(value!=null){
						String gms[]=value.split(";");
						if(gms!=null){
							for(String gmstr:gms){
								if(gmstr!=null){
									String gm[]=gmstr.split("\\$");
									if(gm!=null&&gm.length==2&&info.getUsername().equals(gm[0])){
										info.setBlisgm(1);
										break;
									}
								}
							}
						}
					}
					if(value2!=null){
						String gms[]=value2.split(";");
						if(gms!=null){
							for(String gmstr:gms){
								if(gmstr!=null){
									String gm[]=gmstr.split("\\$");
									if(gm!=null&&gm.length==2&&info.getUsername().equals(gm[0])){
										info.setBlisgm(2);
										break;
									}
								}
							}
						}
					}
				}

				StringBuilder sb = new StringBuilder();
				sb.append("UserInfoRep:").append(",userid:").append(userid);
				sb.append(",func:").append(func);
				sb.append(",username:").append(info.getUsername());
				sb.append(",plattype:").append(info.getNickname());
				sb.append(",blisgm:"+info.getBlisgm());
				sb.append(",loginip:"+loginip);
				//xdb.Trace.info(sb.toString());
				StateManager.logger.info(sb.toString());
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆浜ら柤鏉挎健瀵爼宕煎顓熺彅闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě鍛帒闂備礁鎼Λ娆戝垝閹捐钃熼柣鏂垮悑閸婄粯鎱ㄥΔ锟藉Λ娆撴偩閸洘鈷戞繛鑼额嚙楠炴銇勯妸銉含鐎殿喛顕ч埥澶愬閻橀潧濮堕梻浣侯焾缁绘帗鍒婇鐔侯洸妞ゅ繐鐗勯敓鎴掔椤繈顢橀悢铏剐ら梻渚�娼ч…顓犵不閹存繍鍤曢柛顭戝枓閺�浠嬫煃閽樺顥滈柣蹇ョ節閹绮☉妯诲櫤闁稿繑绮撻弻锝夊箛闂堟稑顫紓浣哄█缁犳牠寮诲☉妯锋闁告鍋樼花濠氭⒑鐠囪尙绠氶柡鍛矒婵＄敻宕熼锝嗘櫍闂佹枼鏅涢崯浼村Υ婵犲洦鈷戦柣鐔告緲濡茬粯銇勯幋婵囧枠妤犵偛顦甸獮姗�顢欓懖鈺婃Ч婵＄偑鍊栭崝锕傚磻閸屾粍顫曢柨鐕傛嫹
				xtable.Auuserinfo.remove(userid);
				xtable.Auuserinfo.add(userid, info);
				return true;
			}
			/*
			private String getOsType(String key) {

				for (Entry<String, String> entry : ostypes.entrySet()) {
					if (entry.getKey().contains(key))
						return entry.getValue();
				}
			
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍦矉閹烘棑鎷烽敐搴′簼婵炲懌鍨藉娲嚍閵夊喚浜棟妞ゆ牜鍋涘Ч鏌ユ⒑椤掞拷缁夌敻鎮￠妷鈺傜厽闁哄啫鍊荤敮娑欍亜閵夈儺妲虹紒杈ㄦ尭椤撳ジ宕崘顓炴儓婵°倗濮烽崑娑㈠疮椤愩儳浜介梺鑽ゅТ濞测晝浜稿▎鎴犵幓闁绘劕顕弧锟介梺姹囧灲濞佳勭瑜旈弻娑氾拷锝庡亝瀹曞矂鏌熼鍡欑瘈濠殿噯鎷烽梺闈涚墕濡矂骞忓ú顏呪拺闁告繂瀚敓钘夌埣瀹曟洟骞撻幒鍡樼�洪梺鍛婄☉閻°劑鎮￠弴銏＄厽闁哄洦姘ㄩˇ锕傛煟韫囥儳鎮肩紒杈ㄥ浮椤㈡瑧鍠婃潏鈺佹倯婵°倗濮烽崑鐐垫暜閹烘洜浜欏┑鐐舵彧缁蹭粙骞栭锔惧祦鐎广儱顦伴埛鎺懨归敐鍥剁劸妞ゃ儱绻橀弻锝夊箻瀹曞洤鈪甸悗瑙勬礃閸ㄥ灝鐣烽悢纰辨晬婵﹢纭稿Σ鐑芥⒒娓氾拷濞佳囨偋閸℃蛋鍥ㄥ鐎涙ê浜楅梺鍝勬储閸ㄦ椽鎮￠崘顔界厱婵犻潧妫楅鎾煕鎼淬垹濮嶉柟顔筋殔椤繈鎮欓锟介锟�,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殲闁哄棙绮嶆穱濠囧Χ閸涱厽娈堕梺娲诲幗閻熲晠寮婚悢鍏煎�绘俊顖炴櫜缁爼姊虹捄銊ユ瀾闁哄宕电划濠氬箻瀹曞洦娈炬繝闈涘�婚…鍫濇暜婵＄偑鍊栧Λ浣规叏閵堝應鏋嶇�广儱鎳夐弨浠嬫煟濡櫣浠涢柡鍡忔櫅閳规垿顢欓悙顒佹瘓闂佺娅曠换鍐Χ閿濆绀冮柕濞у懎骞�婵犵數濮烽弫鍛婃叏閺夋嚚娲晝閸屾稑浜楅梺缁樻煥閸氬鎮¤箛鎿冪唵闁煎摜鏁搁妴鎺楁煟閿濆鎲鹃柡灞稿墲閹峰懘宕ｆ径瀣澒roid
				return "2";

			}
			*/
			
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 211;

	public int getType() {
		return 211;
	}

	public final static int ALGORITHM_NONE = 0x0; // 仅密码
	public final static int ALGORITHM_CARD = 0x00010000; // 密保卡
	public final static int ALGORITHM_HANDSET = 0x00020000; // 手机密保
	public final static int ALGORITHM_USBKEY = 0x00030000; // usbkey
	public final static int ALGORITHM_PHONE = 0x00040100; // 电话密保
	public final static int ALGORITHM_USBKEY2 = 0x00050000; // usbkey2

	public int userid;
	public int retcode;
	public int func; // 新手卡字段
	public int funcparm; // 新手卡附属字段
	public int loginip; // 客户端登录ip
	public byte blisgm; // 是否为GM
	public java.util.ArrayList<Integer> auth; // GM权限列表，具体权限见相关文档
	public int algorithm; // 账号安全级别
	public byte gender; // 0-female,1-male,2-unknown
	public com.locojoy.base.Octets nickname; // 昵称

	public UserInfoRep() {
		auth = new java.util.ArrayList<Integer>();
		nickname = new com.locojoy.base.Octets();
	}

	public UserInfoRep(int _userid_, int _retcode_, int _func_, int _funcparm_, int _loginip_, byte _blisgm_, java.util.ArrayList<Integer> _auth_, int _algorithm_, byte _gender_, com.locojoy.base.Octets _nickname_) {
		this.userid = _userid_;
		this.retcode = _retcode_;
		this.func = _func_;
		this.funcparm = _funcparm_;
		this.loginip = _loginip_;
		this.blisgm = _blisgm_;
		this.auth = _auth_;
		this.algorithm = _algorithm_;
		this.gender = _gender_;
		this.nickname = _nickname_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(userid);
		_os_.marshal(retcode);
		_os_.marshal(func);
		_os_.marshal(funcparm);
		_os_.marshal(loginip);
		_os_.marshal(blisgm);
		_os_.compact_uint32(auth.size());
		for (Integer _v_ : auth) {
			_os_.marshal(_v_);
		}
		_os_.marshal(algorithm);
		_os_.marshal(gender);
		_os_.marshal(nickname);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		userid = _os_.unmarshal_int();
		retcode = _os_.unmarshal_int();
		func = _os_.unmarshal_int();
		funcparm = _os_.unmarshal_int();
		loginip = _os_.unmarshal_int();
		blisgm = _os_.unmarshal_byte();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			auth.add(_v_);
		}
		algorithm = _os_.unmarshal_int();
		gender = _os_.unmarshal_byte();
		nickname = _os_.unmarshal_Octets();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof UserInfoRep) {
			UserInfoRep _o_ = (UserInfoRep)_o1_;
			if (userid != _o_.userid) return false;
			if (retcode != _o_.retcode) return false;
			if (func != _o_.func) return false;
			if (funcparm != _o_.funcparm) return false;
			if (loginip != _o_.loginip) return false;
			if (blisgm != _o_.blisgm) return false;
			if (!auth.equals(_o_.auth)) return false;
			if (algorithm != _o_.algorithm) return false;
			if (gender != _o_.gender) return false;
			if (!nickname.equals(_o_.nickname)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += userid;
		_h_ += retcode;
		_h_ += func;
		_h_ += funcparm;
		_h_ += loginip;
		_h_ += (int)blisgm;
		_h_ += auth.hashCode();
		_h_ += algorithm;
		_h_ += (int)gender;
		_h_ += nickname.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(userid).append(",");
		_sb_.append(retcode).append(",");
		_sb_.append(func).append(",");
		_sb_.append(funcparm).append(",");
		_sb_.append(loginip).append(",");
		_sb_.append(blisgm).append(",");
		_sb_.append(auth).append(",");
		_sb_.append(algorithm).append(",");
		_sb_.append(gender).append(",");
		_sb_.append("B").append(nickname.size()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


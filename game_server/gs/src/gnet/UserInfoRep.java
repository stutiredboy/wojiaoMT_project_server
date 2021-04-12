
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
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑鍡╁殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囨⒒缁辨挻鎷呴悾灞界墯闂佺锕ュú婵嬫倶閸愵喗鈷戦柟绋挎捣缁犳捇鏌熼崘鏌ュ弰鐎殿喗濞婇幃娆撴倻濡厧骞堝┑鐘垫暩婵潙煤閿曪拷閳藉顦规俊顐＄劍瀵板嫰骞囬鐘插箺婵犵妲呴崹鎶藉磿閵堝鐓濋柡鍥ュ灪閻撴洟骞栨潏鍓х？缂佺姴纾槐鎺撴綇閵娿儲璇為梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆簼绨芥い锔芥緲椤啴濡堕崱娆忣潷缂備礁顑嗛幑鍥х暦閵忥紕顩烽悗锝庡亐閹锋椽姊洪懡銈呮灈闁稿锕畷鐢告偄閸忚偐鍘遍柟鍏肩暘閸ㄨ鎱ㄥ澶嬬厵妞ゆ梹鍎虫禒閬嶆煙瀹曞洤浠卞┑锛勫厴閺佹劙宕熼鐘虫櫒闂傚倸鍊烽懗鍫曞箠閹剧粯鍋ら柕濞у嫬搴婇梺鍛婃处閸撴艾鈻嶉悩缁樼叆闁哄啫娲よ闂佸憡鐟ョ换鎰板煘閹达附鍋愰柟缁樺笚濞堟煡姊洪棃娑欏缂佽鍟存俊鐢稿礋椤栨凹娼婇梺瀹犳濡瑩鎮鹃悜鑺モ拺闁荤喐婢樺Σ濠氭煙閾忣偓鑰挎鐐插暣閹粓鎸婃径宀婂悑婵＄偑鍊栧ú鏍箠韫囨挴鏋旂憸鐗堝笚閳锋帡鏌涚仦鎹愬闁跨喕妫勯崲鏌ユ箒闂佹悶鍎洪崜锕傚极鐎ｎ喗鐓涚�广儱楠搁獮鏍磼閹邦収娈曞ǎ鍥э躬婵℃儼绠涢弬娆句紦闂備胶绮幐鍫曞磹閺嶎偅宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｅ憡鎯堥柟鍐茬箻楠炲啴宕掗悙鑼舵憰闂侀潧鐗嗛ˇ顖滅不閹烘鐓欓柣鎴灻悘銉モ攽椤斿ジ鍙勬慨濠冩そ瀹曨偊濡烽妷鎰剁稻缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤兘骞冮姀銈嗗亗閹艰揪缍嗗Σ閬嶆⒒娓氾拷濞佳囨偋閸℃あ娑樜旈崪浣规櫆闂佽法鍣﹂幏锟�
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴鐎殿喖鐖煎畷鐓庮潩椤撶喓褰呴梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷闂侀潧臎閸涱垰甯掗梻鍌欑閹碱偄螞濞嗘垵鍨濋柟鎹愵嚙閽冪喖鏌ｉ弬鍨倯闁稿﹦绮幈銊ノ旈敓钘壩涘▎鎾村仼闁割偅娲橀埛鎴炵箾閼奸鍤欐鐐搭殕閵囧嫰濡搁妷顖濆惈閻庢鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｄ警鐒剧紒缁樺笚閸掑﹪顢橀悢渚锤濡炪倕绻愰悧鍕晸閹存帞顦︽い顐ｇ箞椤㈡﹢鎮㈤搹鍓愩倝姊绘笟锟藉褔鈥﹂鐘典笉闁瑰瓨绻嶉崵鏇㈡煕椤垵鏋撻柡锟芥禒瀣厓闁芥ê顦伴ˉ婊堟煟韫囥儳绡�闁诡喗顨堢划顓炩槈濡娅ら梺绋跨箲缁捇寮婚敐澶婄疀闂傚牊绋戦～顐ょ磽娴ｅ搫鈻堢紒鐘崇墵瀵鈽夊Ο閿嬵潔闂佸憡顨堥崑妯艰姳婵犳碍鈷戦悹鍥皺缁犳岸鏌￠崨顔剧煉濠碉紕鏁诲畷鐔碱敍閿濆棙娅嶉梻浣规灱閺呮盯宕导鏉懳ュ┑鐘叉处閳锋垿鏌ｉ悢鍛婄凡婵¤尙绮妵鍕箣濠靛洤鏋犲Δ鐘靛仜椤︾敻鐛锟介、娆撴嚃閳哄﹥效濠碉紕鍋戦崐鏍礉閿曞倸纾婚柛灞剧矋椤洟鏌ㄩ悤鍌涘
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
			
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔曢顓犲姬閿熶粙姊哄Ч鍥х伈婵炰匠鍕浄鐟滄棃寮诲☉姘炬嫹閿濆骸浜濈�规洖鐭傞弻鐔碱敋閸℃瑧鐦堟繝娈垮櫙閹风兘姊洪棃娑氬婵☆偄鐭傞獮蹇撁洪鍛嫼闂佸憡绻傜�氼剟鏁撻挊澶屽煟鐎规洘娲熼獮鎾诲箳閸℃锟芥椽姊洪崨濠勨槈闁宦板姂閹繝寮撮姀锛勫幗闂佸搫娲﹀銊┧囬敃鍌涚厽闊洢鍎抽幃鑲╃磼鏉堛劌娴い銏＄懅閸犲﹥娼忛埡浣瑰�┑掳鍊楁慨鐑藉磻閻愬灚鏆滈柟鐑樻礈娴滄瑥鈹戦悙鑸靛涧缂佽弓绮欓獮鏍敃閿旀儳绁﹂悗骞垮劚椤︿即鍩涢幒鎳ㄥ綊鏁愰崶鍓佸姼濡炪們鍎辩换姗�寮婚敐澶婄鐎规洖娲ら埅鐢告倵鐟欏嫭绀冮柛銊ョ仢閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗锕㈢涵绋课ｉ悜鑺モ拻濞撴熬鎷锋繛浣冲洦鍋嬮柛鈩冭泲閸ャ劌顕遍悗娑櫭禍妤呮⒑閸濆嫭鍌ㄩ柛銊︽そ閹繝宕橀鐣屽幈濠电娀娼уΛ妤咁敂閹绢喗鐓曢幖娣灩婵秹鏌熼绛嬫當妞ゎ偅绻堥幃娆擃敆閿熶粙顢旈敓锟�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨嗘穱濠囧Χ閸涱厽娈查梺鍝勬缁秵绌辨繝鍥ч柛娑卞幗濞堝爼姊哄ú璇插箺闁荤啿鏅犲濠氭偄閸忕厧锟界粯淇婇鐐存珳缂侇喖鐖煎铏规崉閵娿儲鐎鹃梺鍝勵儓瀹曠數鍒掓繝姘鐎规洖娲﹀▓鐐節闂堟稑锟藉鈥﹂崼婵囨殰濠碉紕鍋戦崐鏍涙担瑙勫弿闁靛牆鎳夐弸宥囷拷骞垮劚閹冲寮ㄦ禒瀣厽婵☆垵娅ｆ禒娑㈡煛閸″繑娅呴柍瑙勫灴椤㈡瑩鎮欓浣圭槗闂備胶顢婂▍鏇犳崲閸愵喖围闁挎繂顦粈鍐煏婵炑冩噹楠烇拷濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柡澶嬪殮濞差亝鏅濋柛灞剧☉娴滄姊虹紒妯荤叆闁告艾顑夐幃陇绠涢幙鍐數闂佺厧鎽滈弫鎼佸Υ閹烘鐓熼柨婵嗩槷閹查箖鏌＄仦绋垮⒉闁瑰嘲鎳樺畷锝嗗緞鐎ｎ剚婢抮oid
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


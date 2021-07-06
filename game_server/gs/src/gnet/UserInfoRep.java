
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
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽閸♀晛娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊﹀弿婵妫楅獮妤呮煟濠靛洦鈷掔紒杈ㄦ尰閹峰懘鎮剧仦鐣屽闂備胶顭堥敃銉ッ哄┑瀣�堕柛鎰靛枟閳锋垿鏌熺粙鎸庢崳缂佺姵鎹囬弻鐔煎礃閺屻儱寮伴悗娈垮枟婵炲﹪骞冨▎鎾村�绘俊顖滃帶楠炲牆鈹戦悩鍨毄濠殿喗娼欑叅闁挎洩鎷烽柍钘夘槼椤﹁淇婇锛勫妽鐎垫澘瀚伴獮鍥敇閻樻彃绠哄┑鐘殿暯濡插懘宕归幎钘夌？闁靛牆顦悡婵嬫煛閸ャ儱鐏柣鎾存礋楠炴牗娼忛崜褏锛熺紓浣哄Т绾绢厾妲愰幒鎾寸秶闁靛鍎茬拠鐐烘⒑鏉炴壆鍔嶉柟姝屽吹缁骞掗弮鎾村闁挎繂绨肩花鑺ャ亜閿旇姤绶叉い顏勫暣婵″爼宕卞▎蹇ｆ椒缂傚倷绀侀鍡涘箲閸パ呮殾闁靛骏绱曢々鐑芥倵閿濆骸浜愰柟閿嬫そ濮婃椽鎳￠妶鍛亪闂佺顑呴敃顏勭暦閻㈠憡鍋勯柛蹇氬亹閸橀亶鏌熼崗鑲╂殬闁搞劏顫夐幈銊ヮ吋婢跺鍘靛銈嗘⒐閸庤櫕绂掗柆宥嗙厵鐎规洖娲ゆ禒鍗炩攽閿涘嫬鍘撮柡浣瑰姍瀹曠喖顢橀悩铏珤闂傚倸鍊搁崐鐑芥嚄閸洖绠犻柟鍓х帛閸嬨倝鏌曟繛褍瀚惔濠囨⒑閸涘﹥澶勯柛鎾磋壘閳诲秹鎮╃紒妯煎弳闂佸搫鍟ú銈堫暱闂備礁鎲￠悷銉ф崲閹版澘鐓橀柟杈鹃檮閸嬫劙鏌熺紒妯虹瑲婵炲牊鐓″娲濞戞瑥顦╃紓浣筋嚙閸熷瓨淇婇悽绋跨妞ゆ牗鍑瑰濠囨⒑鐎圭姵顥夋俊顐ｇ懇閹箖鎮滈懞銉㈡嫼闂佽崵鍠愬妯何ｆ繝姘厵闁惧浚鍋撻懓鎸庮殽閻愭彃鏆ｉ柟顔界矒閹稿﹥寰勫畝濠傛倯濠碉紕鍋戦崐鏍洪弽顓炵疇闊洦鎸撮弸鏃傛喐閻楀牆绗氶柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠曞Λ鍕床閺屻儲绠掗梻浣规偠閸庢椽宕滈敃鍌氭瀬閻庯綆鍠楅悡娑氾拷骞垮劚妤犳悂鐛弽顐ょ＜闁归偊鍙庡▓鏇炃庨崶褝韬┑鈩冨劶缁犳盯寮▎鍙ョ处闂傚倷鑳剁划顖炲箰閸洖纾归柡宥庡亝瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍔肩兘鏁撴禒瀣拻濞达絽鎲￠幆鍫ユ煙閸愯尙绠绘鐐插暣瀹曟帡鎮欓懠鑸垫啺闂備線娼ч悧鍡浰囬婊呬笉闁圭儤顨嗛悡娆撴煟閹寸伝顏堟倶閵夈儮鏀芥い鏂裤偢閸欏嫭鎱ㄦ繝鍐┿仢鐎规洦鍋婃俊鐑藉Ψ閹板墎绋荤紒缁樼洴閹崇娀顢楅敓浠嬪几濞戞熬鎷峰▓鍨灈妞ゎ厾鍏橀獮鍐閵堝棗浜楅柟鑹版彧缂嶅棗危闁秵鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯滄棃宕担瑙勬珕闂備浇娉曢崳锕傚箯閿燂拷
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠撮悗娈垮枛閻栫厧鐣烽悡搴僵妞ゆ挾鍠撹ぐ鍛存⒒娴ｈ鍋犻柛鏂跨Ф閹广垽宕橀鍢夛箓鏌涢弴銊ョ仩闁告劧鎷烽梻渚�娼ц噹闁告侗鍨扮敮鎺楁⒒閸屾瑧顦﹂柟纰卞亜铻炴繛鍡樺灥閸ㄦ繈鏌熼幑鎰靛殭闁藉啰鍠栭弻锝夊棘閸喗鍊梺绋匡功缁垶骞堥妸銉庢棃鏁撻挊澹╂稑鈻庨幘鏉戜患闂佸壊鍋呭ú姗�鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈曢柕鍥у婵℃悂濡烽婵嗘儓闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺缁橈耿濞佳勬叏閸洘鈷掑ù锝勮閻掑墽绱掔紒妯虹瑲闁告帒锕、姗�鎮㈡笟顖涢敜婵＄偑鍊曠换鎰版偋閸曨垱鏅搁柟瀛樺笧椤︼附銇勯锝囩疄妞ゃ垺锕㈤幃銏ゆ惞閸撴劑鍊濆缁樼瑹閿熻棄顭囪閳ワ箓顢橀悩鍏哥瑝闂佺懓鐡ㄧ换宥夊吹閺囥垺鐓曟い顓熷灥閺嬫捇鏌￠敓鑺ョ鐎ｎ偆鍘撻梺鑺ッˇ浼此夊鍫熺厽闊洢鍎崇弧锟介梺璇″枟椤ㄥ牏鍒掗鐐╂婵☆垵顕у▍銈夋⒑缁嬭法绠茬紒顔芥崌瀵鏁愭径濠勭杸闂傚倸鐗婄粙鎴︼綖椤愩倗纾藉ù锝呮惈閳诲牏绱掗悩宕囧⒌鐎殿喛顕ч埥澶娢熼柨瀣垫綌闂備礁鎲￠〃鍫ュ磻濡壈濮冲┑鐘崇閳锋垿鎮归崶顏勭毢缂佺姵宀搁弻锟犲川椤斿墽鐓夋繝纰夌磿閺佽鐣烽悢纰辨晬闁挎繂妫欏▍宥夋⒒娴ｈ鐏遍柡鍛洴瀹曨垱瀵奸弶鎳炽儱鈹戦悩鍙夊闁抽攱鍨块弻锝夋偄閸涘﹦鍑″┑陇灏欑划顖炲Φ閸曨垰绠ｆ繝闈涙搐閺嬬姴螖閻橀潧浠滄い锔炬暬閻涱喖顫滈敓浠嬨�佸▎鎾村殐闁冲搫锕ユ晥婵犵绱曢崑鎴﹀磹閺嶎厼绀夐柨鏇炲�哥壕濠氭煕鐏炲墽鐭嬫い顐ｆ礋閺屻劑鎮ら崒娑橆伓
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
			
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝鏇㈩敋椤撶姴濮柨鐔剁矙濮婂搫效閸パ呬紙濠电偘鍖犻崟顓ф祫閻熸粍妫冨璇测槈濮樼偓瀚归柨婵嗛娴滄繄锟借娲栭惌鍌炲蓟閻旂⒈鏁嬮柛鈩冪懅閻﹀牊绻濆▓鍨珯闁归鍏樺娲濞戞艾顣哄┑鈽嗗亜閻倿鐛箛鎾佹椽顢旈崨顏呭闂備礁鎲＄换鍌滐拷姘煎墴閺佹捇鎸婃径灞界厽閻庤娲樺ú鐔肩嵁閹捐绠抽柛鈩冾焽閿熻姤妞藉娲川婵犲嫧妲堥梺瀹︽澘濮傞柟顕嗙節瀵挳濮�閿涘嫬骞楅梻浣告惈濞诧箑顫濋妸鈹у洭鏁冮崒娑氬幗闂婎偄娲㈤崕鎶藉箖閼测晝纾奸弶鍫涘妼濞搭喗銇勯姀锛勬噮闁哥姴锕ュ蹇涘煛娴ｇ懓锟筋垰鈹戞幊閸婃鎱ㄩ悜钘夌；闁绘劕鐏氶弳婊堟煙閻戞ɑ绀堝ù婊勭懃閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁閺嶎収鏁冮柨鏃�鍎崇粊锕傛倵楠炲灝鍔氭い锔垮嵆閸╂盯骞掗幊銊ョ秺閺佹劙宕堕崜浣稿Ъ婵＄偑鍊戦崕杈╂崲濮楋拷瀵鏁愭径濠勵啋閻庤娲栧ú銈夊焻閻㈠憡鍊甸悷娆忓缁�鍐煕閵娿儳浠㈤柣锝囧厴閹垻鍠婃潏銊︽珫婵犳鍠楅敃銏㈡兜缁嬭锝夋倻閼恒儮鎷绘繛鎾寸啲閹烽攱绻涙担鍐叉处閸嬪鏌涢埄鍐巢闁搞儯鍔岄閬嶆倵濞戞顏呯濡ゅ懏鈷戦柛婵嗗閸屻劑鏌涢妸锔姐仢闁诡噯绻濆畷姗�顢欓悾灞藉箞婵犵數濞�濞佳兾涘Δ鍜佹晜闁圭虎鍠楅悡鏇㈠箹濞ｎ剙鐏╁┑顔肩Ч閺岀喖顢欑粵瀣暥濡炪値鍋呯换鍫ュ箖濞嗘搩鏁嗛柨鐔剁矙椤㈡棃鏁撻敓锟�,婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇缂備焦鍔栭〃鍡樼┍婵犲洤围闁告侗鍘藉▓鏌ユ⒑閸濆嫭顥炵紒顔肩У缁岃鲸绻濋崶顬囨煕濞戝崬骞楁繛鍫濈埣濮婂搫煤鐠囨彃绠洪梺鑽ゅ暱閺呯姴顕ｆ繝姘亜闁稿繒鍘ч敓鐣岀帛娣囧﹪顢涢悙瀛樼彸缂備緡鍠栭悥鐓庮潖閾忚宕夐柕濞垮劜閻庨箖姊洪崫鍕靛創鐎规洜鏁搁崚鎺撶節濮橆剛顔掗悗瑙勬礀濞诧箑鈻撻悙顒傜瘈闂傚牊绋戦敓钘夘煼閳ワ箓宕煎┑鍥ㄦ婵犵绱曢崑鎴﹀磹閺嶎灛娑欐媴鐟欏嫬寮块梺闈涚墕閹冲寮稿鍥锋嫹楠炲灝鍔氶柟鍐差樀瀵劍绂掔�ｎ偆鍘藉┑鈽嗗灥濞咃絾绂掑☉銏＄厸闁糕�崇箲濞呭懘鏌嶇憴鍕伌妞ゃ垺鐟╅幃娆擃敆娴ｅ湱妲楅梻鍌欒兌椤㈠﹤鈻嶉弴鐘冲床闁告劦鍠栧洿闂佹寧绻傞ˇ顖滅矆閸愵喗鐓忓┑鐐戝啯鍣规鐑囨嫹婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌℃径瀣婵炲樊浜濋弲婵嬫煕鐏炲墽鈽夊ù婊勵殜濮婅櫣绱掑Ο鑽ゅ弳闂佸憡鑹鹃澶愬箖闄囩粻娑㈠箼閸愵亜鏁搁梻浣哄帶閹芥粓寮幖浣肝ラ柟鐑橆殕閻撶喖鏌ㄥ┑鍡╂Х闁规煡绠栭弻锛勪沪缁嬪灝鈷夐梺鐟板槻閹虫ê鐣烽敐鍡楃窞閻庯綆鍓氬鎶畂id
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


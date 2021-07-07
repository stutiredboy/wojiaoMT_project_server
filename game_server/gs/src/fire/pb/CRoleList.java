
package fire.pb;
import java.util.Properties;

import gnet.link.Dispatch;
import gnet.link.Kick;
import gnet.link.Onlines;
import mkdb.util.UniqName;
import fire.log.Module;
import fire.pb.main.ConfigManager;
import fire.pb.state.StateManager;

import com.locojoy.base.Octets;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleList__ extends mkio.Protocol { }

/** 客户端发给服务器，请求已有角色列表
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleList extends __CRoleList__ {
	@Override
	protected void process() {
		
		final int userID = ((Dispatch)this.getContext()).userid;
		if(userID == -1){
			kickUser(-1000);
			 mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽缂佺偓鍎抽鎰板船瑜版帗鈷戦悹鎭掑妼閺嬫垿鏌＄�ｎ厼鍚圭紒顔碱煼楠炴ê效閸ラ攱瀚瑰ù锝堝�介弮锟介幏鍛存偡闁讣鎷烽幘瀵哥闁圭偓娼欓崵顒勬煕閵娾晙鎲鹃柡灞诲姂婵″爼宕卞▎鎴犳闁诲骸鍚�閸楁娊寮ㄩ崡鐑嗙唵婵鎷烽柡浣规崌閹崇偤濡烽敂缁㈡Ч婵°倗濮烽崑娑㈡晝閵夆晛绠氶柡鍐ㄧ墕鎯熼梺闈涱槶閸庢娊鏁撶粵瀣籍婵﹨娅ｇ划娆戞崉閵娧傜礃闂備胶顭堥鍥磻閵堝绠栭柨鐔哄У閺呮彃顭跨捄楦垮鐟滄澘瀚板娲箹閻愭彃濮岄梺鍛婃煥閻倸鐣烽悽鍓叉晢濞达綀娅ｉ鏇㈡⒑缁嬭法绠抽柛妯犲嫭鍙忕�广儱顦伴悡娑氾拷鐧告嫹閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�鐎规洦鍓濋悘鎺楁⒑閸忚偐銈撮柡鍛箞瀹曘垹顭ㄩ崼鐔叉嫽婵炶揪绲介幉锟犲箚閸儲鍋犳慨妯煎帶娴滄壆锟借娲樼换鍫ョ嵁鐎ｎ喗鏅濋柨鐔烘櫕缁寮介鐔哄帾闂佸壊鍋呯换宥呂ｉ崫銉ф／闁诡垎鍐╁�紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛銉鏉╂柨鈹戦悙宸殶闁靛棗顑夐獮蹇涙晸閿燂拷  =============");
			return;
		}
		StateManager.logger.info(new StringBuilder("userID=").append(userID).append(" CRoleList"));
		
		fire.pb.main.ConfigManager manager = fire.pb.main.ConfigManager.getInstance();
		if (manager.isNeedActive()) {
			if (!checkUserAccount(userID)) {
				SUserNeedActive sUserNeedActive = new SUserNeedActive((byte) 0);
				Onlines.getInstance().sendResponse(this, sUserNeedActive);	
				return;
			}
		}
		if(manager.getLoginLimitType() != Module.LIMIT_NORMAL_MODE && manager.getUserIDList().size() != 0){
			if(manager.getLoginLimitType() == Module.LIMIT_BLACLIST_MODE){
				if(manager.getUserIDList().contains(userID)){
					Onlines.getInstance().sendResponse(this, new SCreateRoleError(manager.getErrorType()));	
					return;
				}
			}else if(manager.getLoginLimitType() == Module.LIMIT_WHITELIST_MODE){
				if(!manager.getUserIDList().contains(userID)){
					Onlines.getInstance().sendResponse(this, new SCreateRoleError(manager.getErrorType()));	
					return;
				}
			}
		}
		
		long curTime = System.currentTimeMillis();
		xbean.UserPunish userPunish = xtable.Userpunish.select(userID);
		if (userPunish!=null){
			if (curTime<userPunish.getReleasetime()){
				if (!userPunish.getRecords().isEmpty()) {
					try {
						String reason = userPunish.getRecords().get(userPunish.getRecords().size()-1).getReason();
						long endtime = userPunish.getReleasetime();
						Onlines.getInstance().sendResponse(this, new SGACDKickoutMsg(reason, endtime));
					} catch (Exception e) {
						Module.logger.error("send kickoutmsg error", e);
					}
				}
			//	Onlines.getInstance().kick(roleid, -1000);
				kickUser(-1000);
				//p1.send(this.getConnection());
				return;
			}
		}
		
		Integer blisgm = xtable.Auuserinfo.selectBlisgm(userID);
		boolean isGm = false;
		if (blisgm!=null&&(blisgm==1||blisgm==2)) 
			isGm = true;
		Onlines.getInstance().getConnectedUsers().online(this,isGm);
		Properties prop = ConfigManager.getInstance().getPropConf("sys");
		String value = prop.getProperty("sys.apps.cheat");
		fire.pb.SNotifyShieldState sNotifyShieldState = new SNotifyShieldState((byte) 0);
		if (value!=null&&value.equals("0")){
			sNotifyShieldState.state = 1;
		}
		Onlines.getInstance().sendResponse(this, sNotifyShieldState);	
	}
	
	private boolean checkUserAccount(int userID) {
		if (UniqName.exist("activeuser", String.valueOf(userID))!= UniqName.RPC_NOT_EXISTS) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐差渻閵堝棗绗掓い锔垮嵆瀵煡顢旈崼鐔蜂画濠电姴锕ら崯鎵不婵犳碍鐓涘ù锝堫潐瀹曞矂鏌熷畷鍥т槐濠碉紕鏌夐ˇ顕�鏌＄�ｎ偅顥堟慨濠冩そ瀹曨偊宕熼锟藉▍銈囩磽娴ｇ瓔鍤欓悗姘緲閻ｅ嘲顫濈捄铏诡唺闂佺懓鐡ㄥ褰掓倵婵犳碍鈷戦悷娆忓閸斻倗鐥紒銏犲籍妞ゃ垺鐟︾换婵嬪磼濡や焦鏉搁梺鍦劋婵炲﹤鐣烽幇鏉跨缂備焦锚閿熻棄娼￠弻銊╁即椤忓懎顏堕梻浣哥枃椤曆呯矓閻熼偊鍤曟い鎺嶇劍閸庣喖鏌熼幆褏鎽犻柡澶嬫倐濮婄粯鎷呴搹鐟扮闂佹寧宀搁弻锝堢疀閺傚灝鎽甸悗娈垮枟婵炲﹪宕洪埄鍐╁闁告瑥顦伴弶鍛婁繆閻愵亜锟芥牠鎮уΔ鍐煓闁圭儤鏌ч悞濠囨煥閺冨倻鎽傛繛鍫滅矙閺岋綁骞囬姘辨缂備胶濮撮…鐑藉蓟閿涘嫪娌悹鍥ㄥ絻椤姊虹捄銊ユ瀾闁哄宕靛濠冪節濮橆剛顦柣搴秵閸撴繃鎱ㄩ崘娴嬫斀闁绘ê纾。鍙夈亜閵夈儻鏀婚柕鍥у楠炲洭鍩℃担杞扮棯濠电姰鍨煎▔娑氾拷姘嵆瀵鎮㈤搹鍦厯濠电偛妫楁晶浠嬪触鐎ｎ喗鐓㈡俊顖滃帶閺嬫盯鏌″畝瀣М妤犵偛娲、娆撴偂鎼粹槅鐎遍梻鍌欒兌椤牓鏁冮妶澶嬪�舵慨妯挎硾缁犵偤鏌曟繛鍨姶婵炵鍔戦弻娑㈠焺閸愮偓鐣剁紓浣哄Т缂嶅﹤顫忓ú顏勫窛濠电姴瀚悾鍝勨攽閿涘嫬浠掔紒顔界懃椤曪絾绻濆顓炰簻缂佺偓濯芥ご鎼佸疾閳哄啰纾藉ù锝呮贡閳藉銇勯幋婵囶棦闁诡噣绠栧畷濂稿即閻斿弶瀚奸梺璇查濠�杈ㄦ叏閻㈡潌澶嬪緞鐎ｃ劋绨婚梺鎸庢椤曆囨倶閿曞倹鐓曢柍鐟扮仢閻忊晜銇勯幘鍐叉倯鐎垫澘瀚敓鏂ょ秵閸嬪嫰宕濋幒鎾茬箚闁绘劦浜滈敓鑺ョ墵瀹曟繈骞嬮敃锟介崹鍌滅磽娴ｅ顏堫敋鏉堚晪鎷烽惂鍛婂闂佸憡娲﹂崗姗�骞忓ú顏呪拺闁革富鍙庨悞鐐箾閹绢噮妫戠紒顔款嚙椤粓鏁撴禒瀣摕婵炴垶鐔幏鐑芥晲閸愩劌顬堥梺璺ㄥ枙婵倕煤閻旂锟戒礁顫濋懜鍨珳闂佺硶鍓濋悷顖毭归崟顖涚厽閹兼惌鍨抽崚浼存煟韫囨柨鍝虹�殿喗褰冮埞鎴﹀幢閳哄倸鐦滈梻渚�娼ч悧鍡椢涘Δ鍐當闁稿本绮庣壕濂告煥閻旇袚缂佹鍠栭弫鎾寸鐎ｎ煉鎷锋笟锟藉顕�宕煎┑瀣暪闂備礁鎼ú銊╁窗閹捐鍌ㄥù鐘差儐閳锋垹绱撴担鑲℃垿鎮￠妷鈺傜厵闁兼亽鍎抽惌鎺擃殽閻愯韬�规洘锕㈤、娆撴寠婢舵稒瀚归柛顭戝亝閸欏繑淇婇婊冨付閻㈩垵鍩栫换娑㈠川椤撶姌锝嗐亜閵婏絽鍔﹂柟顔界懇楠炴牠顢橀悢鐑樻緬闂佽姘﹂～澶娒哄锟介弫鍐閵堝喛鎷锋担绯曟瀻闁圭偓娼欓惂鍕節閵忥絽鐓愮紒瀣笧閿熻姤鑹剧紞濠囧蓟濞戙埄鏁冮柨婵嗘椤︻參姊洪崨濠勬噭闁圭懓娲璇测槈閵忕姈銊╂煥濠靛棙鍣规い顒�顦靛娲箮閼恒儲鏆犻柣銏╁灲缁绘繂顕ｆ繝姘亜闁绘挸娴烽ˇ銊╂⒑閸涘﹦鎳冩い锔诲灠閳绘挸螖閸涱喒鎷洪梺鍛婄箓鐎氼厼锕㈡导瀛樼厽闁冲搫锕ら悘锕傛煟濞戝崬娅嶆鐐村笒铻栭柨鐔烘櫕缁粯绻濆顓犲弰闂婎偄娴勭徊鑺ョ椤栫偞鐓熺憸宀�娆㈠顒夋綎缂備焦蓱婵挳鎮峰▎蹇擃仼濞寸姭鏅犲娲川婵犲啠鎷归梺鎼炲妼濠�閬嶅礆閹烘挾绡�婵﹩鍓欓崬銊╂偡濠婂嫮鐭掔�规洜鏁诲鎾偄缂堢姷鐩庨梻浣告贡閸庛倝宕归悽鍓叉晜闁冲搫鎳庨懜瑙勩亜閺嶎偄浠﹂柍閿嬪灴閺岀喓绮欓崹顕呭妷濡炪們鍎卞Λ妤呭煘閹达富鏁婇柛婵嗗閹风兘寮撮埗鈺嬫嫹閿曞倸閿ゆ俊銈勭劍濞呫垽姊虹捄銊ユ珢闁瑰嚖鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗙箾绾绡�鐎殿喖顭烽幃銏ゅ川婵犲嫮肖闂備礁鎲￠幐鍡涘川椤旂瓔鍟呯紓鍌氬�搁崐鐑芥嚄閼搁潧鍨旀い鎾卞灩閸ㄥ倿鏌涢锝嗙闁藉啰鍠栭弻鏇熺箾閻愵剚鐝曢梺绋款儏濡繈寮诲☉姘勃闁告挆锟藉Σ鍫濐渻閵堝懘鐛滈柟鍑ゆ嫹?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹鑽ゅ垝椤栨稓鈹嶅┑鐘叉处閸婇攱銇勮箛鎾愁伒闁归鍏樺浠嬵敇閻旇渹缃曟繝鐢靛Т閿曘倝鎮ч崱娆忣棜缂備焦顭囩粻楣冩煙鐎涙鎳冮柣蹇婃櫊閺屾盯濡搁妷銉嫹閸ф钃熸繛鎴炵煯濞岊亪鏌涢幘妤嬫嫹婵☆偁鍔嶇换娑氾拷娑欘焽閻绱掗鑺ュ磳鐎殿喖顭烽崹楣冨箛娴ｅ憡鍊梻浣告啞閸旀垿宕濆畝鍕拷鏍拷锝庡枟閳锋垿姊婚崼鐔衡檨妞ゃ儳鍋ら幃浠嬵敍濞戣鲸鐤佹繝纰夌磿閺佽鐣烽悢纰辨晬婵ê宕獮鎰版⒒娴ｄ警鐒鹃柡鍫墰閸掓帞浠︾粵瀣闂侀潧艌閺呮粓鍩涢幋锔界厱婵犻潧妫楅顐︽煟韫囨稐鎲鹃柡灞剧洴閹晛鐣烽崶褉鎷版俊銈囧Х閸嬫盯宕锔癸拷锕傚Ω閳轰胶顦ㄩ梺缁樺姦閸撴瑧绱撻幘缁樷拻濞达綀娅ｉ妴濠囨煕閹惧绠為柍銉畵瀹曞爼顢楅敓钘壭ч弻銉︾叆闁哄洨鍋涢敓钘夌秺閸╂盯骞掗幊銊ョ秺閺佹劙宕熼鍛Τ闂備胶绮敮妤呭磿鐎圭姷浜欓梻浣虹帛椤牆鈻嶉弴銏犵９闁规壆澧楅悡娑㈡倶閻愬瓨鐏棅顒夊墴閺屸剝鎷呴悷鏉款潔閻庡灚婢樼�氼厾鎹㈠┑瀣妞ゆ挾鍠愰惁鎺撶節閻㈤潧孝闁汇儱顦靛鍫曞礌閳╁啫顏堕悷婊勬閻涱喛绠涘☉娆忥拷濠氭煠閹帒鍔ら柛妯绘崌濮婃椽鎳為妷鍐句邯钘濋柦妯猴級閿濆绠瑰ù锝呮贡閸樻捇鏌ｉ悩鍙夌┛閻忓繑鐟﹂弲銉︿繆閻愵亜锟芥垿宕瑰ú顏侊拷锕傚醇閵夊娲﹀蹇涘煛閸愵亷绱查梻渚�娼ч…鍫ュ礉鐏炲墽顩茬憸鐗堝笚閻撱儵鏌ｉ弮鍌滃笡妞ゃ儱顦甸弻锝堢疀閺冨洤顥濆銈庡幖閻忔繆鐏掔紒缁㈠弮閺�杈╋拷姘愁潐閹便劌螣閻撳骸浠樻繝鈷�鍐憼闁靛洤瀚版慨锟介柍钘夋嚀閿熷�熸硶閿熷�燁潐濞叉﹢銆冩繝鍥х畺闁斥晛鍟崕鐔兼煥濠靛棙宸濈�规挷鐒︾换婵嬫偨闂堟刀銉╂煛娴ｅ憡鍟為柟渚垮妿閿熺晫鏁诲濠氬箯瀹勯偊娼╂い鎰╁灩缁侇噣姊虹拠鈥虫灆闁告濞婇悰顔嘉熼懖鈺冿紲濠碘槅鍨堕弨杈╋拷姘虫閳规垿鎮欓懜闈涙锭缂備焦褰冨锟犲灳閿曞倸閱囬柕澶堝劜鏉堝牓姊绘笟鍥у缂佸鏁婚幃鈥斥枎閹寸姵锛忛梺鍝勵槸閻忔繈鎳滈悷鎳婄懓顭ㄩ崟顐闂佽法鍠庨敓鐣屽櫏濞兼劖绻涢崣澶涜�跨�规洘绻堝浠嬵敃閿濆懎绨ユ繝鐢靛█濞佳兾涢鐑嗙劷闁冲搫鍊舵禍婊堟煙閻戞ê鐏ラ柨鐔烘櫕椤牓顢氶敐澶娢╅柕澶堝灪閺傦拷闂備胶绮敃鈺呭窗閺嶎厽鍊堕梺顒�绉甸悡鏇㈡煃閸濆嫬锟界粯鏅堕悽纰夋嫹鐟欏嫭绀冪紒璇茬墕椤曪絾绂掔�ｅ灚鏅ｉ梺缁樻濞撳湱鑺遍悽鍛娾拻濞达絽鎲￠幆鍫熺箾鐏炲倸濮傜�规洑鍗抽獮姗�宕滄担椋庣憹濠德板�х徊浠嬪疮椤栫偞鍋傞柡鍥ュ灪閻撳啴鏌嶆潪鎵槮闁哄鍊栫换娑㈠醇閻曚胶鍔风紓浣介哺鐢繝骞冮埡鍛闁圭儤妫冮悰鎾绘⒒娓氾拷濞佳兠洪妶鍥锋嫹濮樺崬顣煎ǎ鍥э躬閹粓鎳為妷锔界彆闂備礁鎲￠幐鍡涘川椤撶偠绶熼梻鍌氬�搁崐椋庣矆娓氾拷楠炴牠顢曢敃锟界�氬銇勯幒鐐村闁绘挶鍊濋弻锝夊籍閸偅顥栭梺鍝勬４缁犳捇寮诲☉妯滄棃宕橀…鎺撳闁挎繂顦伴崑鍕煕韫囨洖甯堕柨鐔烘櫕缁垱绌辨繝鍥舵晬婵犻潧娲ㄩ妴濠傗攽閳ユ彃瀚庨柛鏃�鍨甸～蹇涙惞鐟欏嫬鐝伴梺鍛婄懃椤︻垶寮ㄩ鐑嗘富闁靛牆楠告禍婊勩亜閿旇鐏ｉ柛娆忔嚇濡懘顢曢姀鈥愁槱缂備礁顑嗛崹鍦垝閸喎绶炵�癸拷鐎ｎ偄顏跺Δ鐘靛仜閻忔繈宕濆顓犵閻犲泧鍛殸闂佷紮绲块崗妯虹暦閿濆棗绶炵�癸拷閿熶粙鎯侀崼銉︹拻闁稿本姘ㄦ晶娑樸�掑顓ф疁鐎规洘娲濈粻娑㈠即閻樼绱￠梻浣筋嚃閸ㄥ酣宕橀埡渚婃嫹椤栨粎纾藉ù锝堟鐢稓绱掔拠鎻掓殶闁瑰箍鍨归埞鎴炵節閸曨厽婢戦梻浣告惈閸婂綊顢栧▎鎰嚤闁规儳澧庣壕浠嬫煕鐏炴崘澹橀柨鐔剁矙椤ユ挸鈻庨姀銈嗘櫢闁绘ê鍟挎禍妤佺節閵忥絽鐓愰柛鏃�娲滅划濠氼敍閻愬鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�
			return true;
		
		return false;
	}

	private void kickUser(int error) {
		Kick p1 = new Kick();
		p1.linksid = ((Dispatch)this.getContext()).linksid;
		p1.action = Kick.A_QUICK_CLOSE;
		p1.error = error;
		Onlines.sendProtocl(p1, this.getConnection());
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786433;

	public int getType() {
		return 786433;
	}


	public CRoleList() {
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
		if (_o1_ instanceof CRoleList) {
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

	public int compareTo(CRoleList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


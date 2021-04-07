
package fire.pb;

import java.util.HashMap;
import java.util.Map;

import xbean.BattleInfo;
import fire.log.LogManager;
import fire.pb.battle.PEnterBattleAfterEnterWorld;
import fire.pb.battle.SSendBattleStart;
import fire.pb.util.InetAddressUtil;
import gnet.link.Dispatch;
import gnet.link.Kick;
import gnet.link.Onlines;





// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CNotifyDeviceInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CNotifyDeviceInfo extends __CNotifyDeviceInfo__ {

	@Override
	protected void process() {
		
		final int userid = ((Dispatch)this.getContext()).userid;
		if(userid == -1){
			kickUser(-1000);
			mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂磋閿熸枻绠撻、妤佹媴娓氼垱閿ゆ繝寰锋澘锟芥洟骞婃惔銊ュ瀭闁稿瞼鍋為悡锝夌叓閸ャ劌鍤繛鍏煎姍閺岋繝宕卞Ο鑲╃厜闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷  =============");
			return;
		}
		
/*		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {

//				Integer userid = xtable.Properties.selectUserid(roleid);
//				xbean.ActiveUserInfo activeUserInfo = xtable.Activeusertable.select(userid);
//				Integer lev = xtable.Properties.selectLevel(roleid);
				xbean.AUUserInfo userinfo = xtable.Auuserinfo.get(userid);
				
//				java.util.Map<String, Object> params = LogUtil.putRoleBasicParams(roleid, new HashMap<String, Object>());
				Map<String, String> machineInfos = new HashMap<String, String>();
				for (UserInfoUnit uiu : info) {
					machineInfos.put(uiu.key, uiu.value);
				}
				
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劏娉涢～蹇撁洪鍕�銈嗘礀閹冲酣宕滈幍顔剧＝濞达絿顭堥。鎶芥煕鐎ｃ劌锟芥繂顕ｇ拠娴嬫闁靛繒濮村畵鍡涙⒑闂堟侗鐒鹃柛搴や含缁煤椤忓應鎷虹紓浣割儏鐏忓懘宕濋悢鍏肩厱閻庯綆鍋嗗ú鎾煕閳瑰灝鍔滅�垫澘瀚伴獮鍥敇閻斿壊浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉銏犵労闁告劧缂氱花闈涒攽閻愭潙鐏熼柛銊ョ秺閹�斥槈閵忥紕鍘遍梺鍝勬储閸斿矂鐛锟介弻鈩冨緞瀹�濠勫姼闂佸疇顫夐崹鍫曠嵁婵犲洦鐓曞┑鐘插暞缁�瀣拷瑙勬处閸ㄥ爼銆佸☉姗嗙叆闁告侗鍨抽崝鎼佹⒒娴ｅ憡鎯堥悶姘煎亰瀹曟洟寮婚妷锕�浜楅梺鍝勬储閸ㄥ宕ｉ幘缁樼厱闁靛绲芥俊浠嬫倶韫囨洘鏆柡灞诲妼閳藉螣婢剁櫢绲跨槐鎺旂磼濡吋鍒涢悗瑙勬礀閵堟悂骞冮姀鈽嗘Ч閹煎瓨绻勭粈澶愭⒒閸屾瑧顦﹂柟纰卞亰閹崇喖顢涢悙鑼枃濠碘槅鍨拃锕傚吹閺囥垺鐓欑�瑰嫭澹嗛悘閬嶆煟閵堝繑瀚归梻鍌欑閹碱偄煤閵娾晛纾婚柣鏃傗拡閺佸倿鏌ㄩ悤鍌涘
				xbean.UserDeviceInfo userDeviceInfo=xtable.Userdeviceinfotab.get(userid);
				boolean isfirst=false;
				int first=1;
				if(userDeviceInfo==null){
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕缂傚秴锕悰顔芥償閿濆洭鈹忛柣搴秵閸嬪懎鈻嶉崼銉︹拻濞达綀顫夐崑鐘绘煕鎼搭喖鐏︾�规洘绻冮幆鏃堝Ω閵壯冨箳闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐑嗙劯婵炴垶顭囬弳鍡涙煕閺囥劌浜炴い锔诲幖閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊妯侯嚕閸涘﹦鐟归柨鐔剁矙瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹惧墎纾藉〒姘攻鐎氬綊姊虹捄銊ユ珢闁瑰嚖鎷�?
					first=0;
					isfirst=true;
					userDeviceInfo=xbean.Pod.newUserDeviceInfo();
					xtable.Userdeviceinfotab.insert(userid, userDeviceInfo);
				}
				userDeviceInfo.setIp(userinfo!=null?InetAddressUtil.ipInt2String(userinfo.getLoginip()):"auuserinfonull"); // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剛鍙呴梺鎸庢濡嫰宕归弬搴撴斀闁稿本纰嶉崯鐐烘煟閹惧鎳勯柕鍥у瀵�燁槼妞ゃ儲绮撻弻锟犲醇椤愩垹顫梺缁橆殔娑擃敹
				//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸偅缍堝┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锝呭悁闁垶鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旀担璇★拷鍥⒒娴ｄ警鐒惧Δ鐘殿焾闇夊瀣椤洟鏌熼悜妯活棖闁归鍏橀弫鎰償濠靛牊鏅煎┑鐐差嚟婵即宕规繝姘疅闁归棿绀佺粻銉︺亜閺傝法姣為柡瀣嚇濮婃椽宕崟顓犲姽缂傚倸绉抽悞锔界┍婵犲洤绠瑰ù锝堝�介妸鈺傜厪濠㈣埖锚閺嬫瑩鏌熼鍡欑ɑ濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡宥庡幖缁犱即鏌涘┑鍕姢缂侊拷婵犲倵鏀介柣妯哄级瀹告繄锟借鎸风欢姘跺箖濡ゅ懏鏅查幖绮癸拷鑼跺焻婵犵鍓濊ぐ鍐礊婵犲洨宓侀柡宥庡幖缁犺銇勯幘璺轰沪闁诲繐妫涚槐鎾存媴娴犲鎽甸梺鍦嚀濞层倝锝炶箛鎾佹椽顢旈崟顏嗙倞闂備礁鎲″ú锕傚储婵傛悶锟藉倸煤椤忓應鎷洪梺闈╁瘜閸樻悂骞忛敓鐘崇厱閻庯綆浜滈顓㈡煕閳瑰灝鐏╂い鎾冲悑瀵板嫭绻濋崟闈涙暯闂傚倷娴囬～澶愬磿閹惰姤鍊堕柛顐犲劚缂佲晠鏌熼幆鏉啃撻柍閿嬪灴閺岋繝宕掑Ο鍝勫濠电偛鎳庨幊姗�寮诲☉銏″亜闁告瑥顦伴悵鏍р攽閳ュ啿绾ч柛鏃�鐟╁顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷
				userDeviceInfo.setTelcooper(machineInfos.get("TelcoOper")==null?"":machineInfos.get("TelcoOper")); // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸缁炬儳顭烽弻鐔煎箲閹伴潧娈紓渚婃嫹濠㈣泛鐭夐幏鐑界嵁閸喖濮庡銈忓瘜閸ㄨ泛顕ｆ导鏉懳ㄩ柨鏂垮⒔椤旀洟姊洪悷閭﹀殶闁稿鍋ら幆鍐箣閻樺灚锛忔俊銈忕到閸熶即鎮惧ú顏呯厸鐎癸拷閿熶粙宕伴幘缁樻櫢闁伙絽鏈弳鈺傘亜椤撶偟澧曢柡鍡忔櫊濮婄粯鎷呮笟顖涙暞濡炪値鍋勯ˇ顖滃弲闂佺粯鏌ㄩ〃搴ㄥ吹閺囥垺鐓曟い鎰剁稻缁�锟介梺缁樻尰閻╊垶寮诲☉姘勃闁硅鍔曢ˉ婵嗩渻閵堝骸浜濋柛銊ョ仢椤繘鎼圭憴鍕彴闂佺偨鍎辩壕顓熷閸儲鈷戠憸鐗堝俯濡垿鏌涜箛鏂嗩亪锝炶箛鎾佹椽顢旈崪浣诡棃闂備礁鍟块幖顐﹀磹閹间緡鏁傞柨鐕傛嫹?
				userDeviceInfo.setChid(machineInfos.get("ChId")==null?"":machineInfos.get("ChId")); // 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姳鍗抽弻锝夊箛闂堟稑顫紓浣哄█缁犳牠寮婚妸鈺傚亜缂備焦锕╁Λ鍕⒒閸パ屾Ч缂佺粯绻冪换婵嬪磼濞戞ɑ顏ゆ繝鐢靛仩鐏忔瑩銆傞敓锟�
				userDeviceInfo.setPlattype(machineInfos.get("PlatType")==null?"":machineInfos.get("PlatType")); // 婵犵數濮撮惀澶愬级閸栤剝瀚规俊銈勭劍閸欏繘鏌ｉ幋锝嗩棄缁惧墽绮换娑㈠箣濞嗗繒浠奸梺姹囧�ら崳锝夊蓟閵堝绠涘ù锝呮憸娴犳粍绻涚�涙鐭婃繝锟介柆宥嗗剦妞ゅ繐鐗婇崑瀣煕椤愩倕鏋戦柛鐕傛嫹(IOS,android,wp)
				userDeviceInfo.setDeviid(machineInfos.get("DeviId")==null?"":machineInfos.get("DeviId")); // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剛鍙呴梺鎸庢濡嫰宕归弬搴撴斀闁稿本纰嶉崯鐐烘煟閹惧鎳勯柕鍥у瀵�燁槼妞ゃ儲绮撻弻锟犲醇椤愩垹顫梺缁橆殣閹凤拷(mac/idfv)闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌熼幆鏉啃撻柛濠傛健閺屻劑寮撮悙璇ф嫹閸濄儱顥氶柛褎顨嗛悡娆撴偣閸濆嫭鎯堟い銉у仱閺屾盯濡烽鐓庘拻闂佽桨绀佸Λ婵嬪蓟濞戙垹鍗抽柕濞垮劙閸戜粙姊虹化鏇熸珖闁稿鐩垾鏃堝礃椤斿槈褔鏌涢埄鍐噧妞ゎ値鍥ㄢ拺闁煎鍊曢弳锟介梺鎼炲劥閸╂牠寮插鍫熲拻濞撴艾娲ゆ晶顔剧磼婢跺本鏆柟顔癸拷鏂ユ婵鍋撶�氳顨ラ悙鑼虎闁告梹宀搁弻鐔煎礃閼碱剛顔婄紓渚囧枟瀹�绋跨暦缁嬭鏃�鎷呴崫鍕闂傚倷鐒︾�笛囧蓟閵娾晛瑙﹂悗锝庡墾閹峰嘲顫濋悙顒�顏�
				userDeviceInfo.setImei(machineInfos.get("IMEI")==null?"":machineInfos.get("IMEI")); // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺侇棜閻犱警鐓夐幏椋庢喆閸曨剛顦ュ┑鐐茬湴閸斿海鍒掗崼鐔虹瘈闁稿被鍊楅崬鐢告⒑閸忓吋鍊愭繛浣冲嫭鍙忛柛銉墯閻撴洟鏌熼幏灞界厫閻庢艾缍婂濠氬磼濞嗘垵濡介梺璇″枛閻栫厧鐣烽弴銏″�绘俊顖溾拡濞叉悂姊虹紒妯哄鐎殿噮鍓熼弫鎰緞婵犲倸绁梻浣虹帛椤洭寮幖浣规櫖婵犲﹤鐗婇埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓?
				userDeviceInfo.setNetenvir(machineInfos.get("NetEnvir")==null?"":machineInfos.get("NetEnvir")); // 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠楅妵鍕冀椤愵澀绮堕梺鎼炲妼閸婂潡寮诲☉銏℃櫆閻犲洦褰冪粻褰掓⒑閹肩偛濡界紒璇茬墦瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妸鈺傗拺缂佸顑欓崕鎰磼鐠囨彃鏆ｅ┑锛勬暬瀹曠喖顢涘顒�鏁ら梻渚�娼ч…鍫ュ磿閸楃倫鎺楀醇閵夛腹鎷洪梺鍛婄箓鐎氼參鏁嶉弮鍫熺厵闁告垯鍊栫�氾拷(濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查柛妤冧紳閻熼偊鐓ラ柛鏇ㄥ亽濡棛绱撴担浠嬪摵閻㈩垽绻濋悰顔藉緞瀹�瀣闁挎繂楠告禍婊勩亜韫囥儲瀚�3G,4G,wifi)
				userDeviceInfo.setOsver(machineInfos.get("OsVer")==null?"":machineInfos.get("OsVer")); // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剛鍙呴梺闈涚墕濞村嫰骞忛悜钘夊瀭妞ゆ劑鍊曞銊╂⒑閸濆嫯顫﹂柛濠冪墵楠炲牓濡搁埡浣虹杸濡炪倖甯掗敃銉э拷姘愁潐娣囧﹪濡堕崨顔兼闂佸搫瀚ㄩ崕鐢稿蓟閿濆憘鐔兼嚃閳轰胶顐奸梻浣虹帛閹搁箖宕伴幇顓犫攳濠电姴娲ゅ洿闂婎偄娲﹂弻銊╊敂閸洘鈷掑ù锝堟鐢稒銇勯妸銉﹀殗闁轰礁鍟存俊鑸靛緞鐎ｎ偅鐝栭梻渚�娼х换鍫ュ磹閺嶎厼鐤鹃柟闂寸劍閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹(闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ユ繝寰锋澘锟窖囧箯閻戣姤鐓忛柛鈩兠ù顔撅拷瑙勬礈閸忔﹢銆佸锟介幃鈺佲枔閹稿巩锕傛⒒娴ｇ瓔鍤欓柛鎴犳櫕缁辩偤宕卞☉妯肩崶濠德板�曢幊搴ｅ婵犳碍鍊甸柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁靛洤瀚伴獮鍥煛娓氬﹥瀚归柡鍥ュ灩閸戠娀鏌熸潏楣冩闁绘挻鐟ч敓鐣屾嚀鐎氼厼顭垮锟介幊婊嗐亹閹烘挾鍘撻柣鐔哥懃鐎氼剟鎮橀幘顔界厱闁靛ň鏅濋悾鐑橆殽閻愬瓨宕屾鐐村浮瀵剙鈻庨悙顒佺グos9,android4.1)
				userDeviceInfo.setBrtype(machineInfos.get("BrType")==null?"":machineInfos.get("BrType")); // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块叄娴滄儼妫熷銈嗙墬缁孩绋夊澶嬬厪濠㈣泛妫欏▍鍡涙煕婵犲嫭鏆柡灞诲妼閳规垿宕卞☉鎲嬫嫹濡わ拷闇夋繝濠傚缁犳绱掓潏銊ユ诞濠碘剝鎮傞弫鍌炴偩鐏炵虎鍚囩紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柨鐔哄О閿熸垝绶氬鎾閻樻牓鍔嶉妵鍕棘閸喗鍊銈嗘煥鐎氭澘顫忕紒妯诲缂佹稑顑呭▓顓㈡⒑閸涘﹤鐏ｇ紒顔界懇閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�(濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺傚灝娈╅柟椋庡厴閹垹鈻介崨濠冨暗缂佽鲸甯″畷鎺戔槈濡槒鐧侀柣搴ゎ潐濞叉牠濡堕崨濠佺箚闁绘垼妫勫敮閻熸粌绻樺鎶藉箥椤斿墽锛濋梺绋挎湰閻熝囧礉瀹ュ洨纾奸悗锝庡亜閻忋儵鏌ㄩ弴妯虹仾婵炵厧绻橀崺锟犲礃椤忓棗濮告繝鐢靛О閸ㄥジ宕洪弽顓炵闁哄稁鍘奸悡鏇㈡煙鐎涙璐╃憸鐗堝笚閸嬪倿骞栨潏鍓хɑ闁规彃銈稿鐑樻姜閻楀牏銈版俊鐐存綑閹芥粓骞戦姀鐘闁靛繆鍓濆▍婊堟椤愩垺澶勯柡灞诲姂椤㈡棃鏁撻敓锟�)
				String username=xtable.Auuserinfo.selectUsername(userid);
				if(username!=null){
					userDeviceInfo.setUsername(username);
				}
				
				if(isfirst==true){
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鏃�鍤嶉柛銉墻閺佸洭鏌曡箛鏇炐ユい锔诲櫍閹鎯傞崨濠傤伓闂備礁鎲″ú锕傚磻婢舵劕鏄ラ柣鎰嚟缁犻箖鎮楅悽娈跨劸鐎涙繂顪冮妶鍡楃仴婵☆偅绻傞悾鐑藉即閻戝棗鎮戞繝銏ｆ硾椤戝洭宕㈤柆宥嗏拺闁告繂瀚崒銊╂煕閺傝法鐒哥�殿喗鎮傛俊鍫曞炊閳哄喛绱查梻浣虹帛閿曗晠宕伴弽顓炵闁挎洖鍊归悡娑氾拷鐧告嫹閻庯綆鍓涢弳銈夋⒑鏉炴壆鍔嶉柟姝屽吹缁骞掗弮鎾村闁挎繂鍑介幏鐑筋敇濠婂啫顫囬梺鍝勮閸旀垵顕ｉ锟介弫鎾寸鐎ｎ亜鍤戦梺鐓庮潟閸婃牠锝為弴鐔稿弿婵☆垰鐏濋悡鎰亜閵夈儻鏀婚柕鍥у楠炲洭妫冨☉姗嗘浇闂佽瀛╅悢顒勫箯閿燂拷?
					userDeviceInfo.setFirstdeviid(machineInfos.get("DeviId")==null?"":machineInfos.get("DeviId"));
					fire.log.YYLogger.OpRegLog(userid,0,0);
				}
				//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掍礁鍓銈嗗姧缁犳垹绮堥崘顔界厱闁圭偓顨呴崯顖炲磹椤栨埃鏀介柣妯活問閺嗩垶鏌ㄩ悢缁橆棄闁哥喕娉曠槐鐐哄冀椤撶喓鍘卞┑掳鍊ч幏鐑芥煕閻旈攱鍋ユい銏″哺閺佹劖寰勫Ο缁樻珨闂備浇娉曢崰鏇熸叏閵堝棛鈹嶅┑鐘叉处閸婂鏌﹀Ο鐚寸礆闁靛ě鍕瀾闂婎偄娲︽笟妤呭极婵犲洦鐓ラ柣鏇炲�圭�氾拷
				fire.log.YYLogger.OpLog(userid,0, "login",first,0,0,0);
				
				
				
		        if (userinfo != null){
		        	String appsrc = machineInfos.get("appsrc");
		        	String mac = machineInfos.get("mac");
//		        	String os = machineInfos.get("os");
					userinfo.setClientsource(appsrc!=null?appsrc:"");
					userinfo.setMac(mac!=null?mac.toUpperCase():"");
//					userinfo.setOs(osType);
		        	userinfo.setPlatform(appsrc!=null?appsrc:"");
		        	String idfa = machineInfos.get("idfa");
		        	userinfo.setIdfa(idfa!=null?idfa:"");
		        }else {
					LogManager.logger.error("userinfo is null when CNotifyDeviceInfo.userid:"+userid+" infos:"+machineInfos.toString());
				}
				try {
					
					String devicetype = machineInfos.get("devicetype");
					if (devicetype == null) devicetype = "";
					String os = machineInfos.get("os");
					if (os == null) os = ""; 
					String osversion = machineInfos.get("osversion");
					if (osversion == null) osversion = ""; 
					String width = machineInfos.get("width");
					if (width == null) width = ""; 
					String height = machineInfos.get("height");
					if (height == null) height = ""; 
					String mac = machineInfos.get("mac");
					if (mac == null) mac = ""; 
					mac = mac.toUpperCase();
					String appsrc = machineInfos.get("appsrc");
					if (appsrc == null) appsrc =""; 
					String phonenumber = machineInfos.get("phonenumber");
					if (phonenumber == null) phonenumber = ""; 
					String gprs = machineInfos.get("gprs");
					if (gprs == null) gprs = ""; 
					String accesspoint = machineInfos.get("accesspoint");
					if (accesspoint == null) accesspoint = ""; 
					String cpuname = machineInfos.get("cpuName");
					if (cpuname == null) cpuname = "";
					String cpuMaxFreq = machineInfos.get("cpuMaxFreq");
					if (cpuMaxFreq == null) cpuMaxFreq = ""; 
					String cpuCount = machineInfos.get("cpuCount");
					if (cpuCount == null) cpuCount = "";
					String totalMemSize = machineInfos.get("totalMemSize");
					if (totalMemSize == null) totalMemSize = ""; 
					String udid = machineInfos.get("udid");
					if (udid == null) udid = ""; 
					String idfa = machineInfos.get("idfa");
					if (idfa == null) idfa = ""; 
					
//					params.put(RemoteLogParam.MODEL, devicetype);
//					params.put(RemoteLogParam.SYSTEMTYPE, os);
//					params.put(RemoteLogParam.SYSTEMVERSION, osversion);
//					params.put(RemoteLogParam.RESOLUTION, width+height);
//					params.put(RemoteLogParam.MACADDRESS, mac);
//					params.put(RemoteLogParam.CLIENTSOURCE, appsrc);
//					params.put(RemoteLogParam.ACCOUNTSOURCE, userinfo!= null?userinfo.getUsername().substring(0, 4):"userinfo null");//getNickname --> getUsername
//					params.put(RemoteLogParam.PHONENUM, phonenumber);
//					params.put(RemoteLogParam.GPRSIMFO, gprs);
//					params.put(RemoteLogParam.ACCESSPOINT, accesspoint);
//					params.put(RemoteLogParam.CPUNAME, cpuname);
//					params.put(RemoteLogParam.CPUMAXFARQ, cpuMaxFreq);
//					params.put(RemoteLogParam.CPUCOUNT, cpuCount);
//					params.put(RemoteLogParam.TOTALMEMSIZE, totalMemSize);
//					
//					params.put(RemoteLogParam.PEER, InetAddressUtil.ipInt2String(userinfo!= null?userinfo.getLoginip():0));
//					params.put(RemoteLogParam.ACCOUNT,userinfo!= null?userinfo.getUsername():"userinfo null");
//					params.put(RemoteLogParam.UDID, udid);
//					params.put(RemoteLogParam.IDFA, idfa);
//					params.put(RemoteLogParam.SCORE, xtable.Properties.selectRolezonghemaxscore(roleid));
//					LogManager.getInstance().doLog(RemoteLogID.ROLEINFO, params);
//					params.put(RemoteLogParam.FROM, ConfigManager.getGsZoneId());
//					params.put(RemoteLogParam.PLATFORM, appsrc);
//					params.put(RemoteLogParam.USERID,userid);
//					params.put(RemoteLogParam.MAC,mac);
//					params.put(RemoteLogParam.OS,userinfo!=null?userinfo.getOs():"");
//					params.put(RemoteLogParam.ROLEID,roleid);
//					params.put(RemoteLogParam.LEV,lev);
//					params.put(RemoteLogParam.TOTALCASH,activeUserInfo==null?"":activeUserInfo.getChargetotalrmblong());
//					params.put(RemoteLogParam.HINT,"");
//					params.put(RemoteLogParam.CAMP, String.valueOf(new fire.pb.PropRole(roleid, true).getCamp()));
//					LogManager.getInstance().doLog(RemoteLogID.ROLELOGIN, params);
					
//					if (udid.length()>0){
//						sendDataToAuAny(userid,udid);					
//					}
//					if (mac.length() > 0) {
//						mac = mac.replaceAll(":", "");
//						mac = mac.toLowerCase();
//						sendDataToAuAny(userid, mac);
//					}
//					pexecute(new PForbidUserByMacOrIDFA(roleid, mac, idfa));
//					pexecute(new PFskAward(roleid,devicetype));//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡鐔兼煏韫囨洖校闁哥喓鍋ら弻娑欐償閳藉懏鏁剧紓浣虹帛缁诲啰鎹㈠┑瀣＜婵﹢妫跨槐鎴︽⒒娴ｈ櫣甯涚紒璇叉瀹曟椽寮介鐐嶏箓鏌涢弴銊ョ仩缂佺姵鐩弻宥嗘姜閹峰苯鍘℃繛瀵稿█缁犳牕顫忛搹鍦煓婵炲棗澧介崣姘辩磽娴ｈ棄钄兼繛澶嬫礀鍗遍柟鐗堟緲缁犺櫕淇婇妶鍕妽婵炲懌鍨虹换娑氾拷鐢殿焾瀛濆銈嗗灥濡繂鐣烽幋锕�纾奸柣鎰皺椤旀劙鏌℃径濠勫濠⒀呮櫕婢规洟骞愭惔婵堢畾濡炪倖鐗撻崐鏍拷姘炬嫹
				} catch (Exception e) {
					LogManager.logger.error("notify device info error", e);
				}
				
				final SNotifyDeviceInfo msg = new SNotifyDeviceInfo();
				msg.ip = userDeviceInfo.getIp();
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		}.submit();*/
		
		new PNotifyDeviceInfo(userid,info,this).submit();
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
	public static final int PROTOCOL_TYPE = 786514;

	public int getType() {
		return 786514;
	}

	public java.util.ArrayList<fire.pb.UserInfoUnit> info;

	public CNotifyDeviceInfo() {
		info = new java.util.ArrayList<fire.pb.UserInfoUnit>();
	}

	public CNotifyDeviceInfo(java.util.ArrayList<fire.pb.UserInfoUnit> _info_) {
		this.info = _info_;
	}

	public final boolean _validator_() {
		for (fire.pb.UserInfoUnit _v_ : info)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(info.size());
		for (fire.pb.UserInfoUnit _v_ : info) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.UserInfoUnit _v_ = new fire.pb.UserInfoUnit();
			_v_.unmarshal(_os_);
			info.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CNotifyDeviceInfo) {
			CNotifyDeviceInfo _o_ = (CNotifyDeviceInfo)_o1_;
			if (!info.equals(_o_.info)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += info.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(info).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


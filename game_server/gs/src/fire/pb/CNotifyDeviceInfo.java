
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
			mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒绾惧鍞归梺璺ㄥ枑閺嬭崵绮婚幘姹囷拷浣肝旀担鐟邦�撴繛鎾村嚬閸ㄩ亶鏌ㄩ妶鍡欑瘈鐎典即鏀卞姗�鏁撻懞銉︾妤犵偛锕ラ幆鏃堝Ω閵夈儳锟筋參姊虹粙璺ㄧ伇闁稿鍋ら幃锟犳晲婢跺苯褰勯梺鎼炲劘閸斿矂宕甸浣虹闁稿繒鍘ф慨宥夋煛瀹�瀣瘈鐎规洖宕灒闁兼祴鏅濋崢婊堟⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繈骞嬮敃锟界粻鏍煏閸繍妲哥痪鎯у悑缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�  =============");
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
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝蹇撯枖濞戭澁缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ亞閿熺瓔鍘奸—鍐Χ閸℃顦ラ梺鐟板暱闁帮絽鐣峰鍫濈妞ゆ柨澧介敍婵囩箾鏉堝墽鎮兼い顓炵墦閵嗗倿骞庨懞銉у幈闁诲函绲婚崝宀勬晸閼恒儳绠撴い鏇悼閹风姴霉鐎ｎ偒娼旈梻渚�娼х换鎺撴叏閺夋垹鏆ら柛鈩冪♁閳锋垿姊婚崼鐔剁繁闁绘帡绠栭弻娑欐償閵堝嫬鎯堢紓渚囧枦椤曆呭弲濡炪倕绻愰幊澶愬箯閾忓湱纾藉ù锝呭閸庡繘鎮樿箛鎾村殗鐎规洘绻堥幃銏ゅ礂閼测晛骞堥梺璇插嚱缂嶅棝宕戦崱妞曟椽骞橀鐣屽幈闂佸磭鎳撻悘婵嬪礉濠婂拑鎷烽崹顐ｇ凡閻庢矮鍗抽悰顕�宕堕澶嬫櫍闂佺粯鏌ㄦ竟濠冪瑜斿濠氬磼濞嗘劗銈板┑鐐差槹濞茬喎鐣烽幎鑺ユ櫇闁稿本姘ㄩ鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴＄仛閻℃洜绮ｅΔ鍛拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸斞呯磽濮樿精濮抽梻鍫熺▓閺�浠嬫煟閹邦厽缍戦柣蹇曞枛閺屾盯濡搁妷褏楔闂佽鍠掗敓鑺ユ灱濡插牓鏌曡箛銉х？闁告﹢浜跺娲传閸曨剙鍋嶉梺鍛婃煥閻倿鎮伴纰辨建闁跨喍绮欏濠氬焺閸愩劎绐為悗鐧告嫹濠电姴瀚慨濂告⒒娴ｅ摜鏋冩い顐㈩樀瀹曞綊宕奸弴鐘茬ウ婵犵數濮村ú锕傛偂閺囩偐鏀介柣妯诲絻閺嗙偟绱掗敓鐣岋拷锝庡墾閹烽鎲撮崟顒�顦╅梺鎼炲妼閻栧ジ濡存担绯曟婵妫涢崣鍡涙⒑閸涘﹣绶遍柛銊﹀▕瀹曟繈骞栨担鍏夋嫽婵炶揪绲介幉锟犲箚閸儲鍋犳慨妯煎帶娴滄壆锟借娲樺ú鐔奉嚕婵犳艾唯闁挎洩鎷峰ù婊勵殜濮婃椽宕崟顒�鍋嶉梺鎼炲妼椤嘲鐣烽敐澶婄缂備焦顭囬崢閬嶆⒑闂堟侗妾х紒鑼跺Г娣囧﹥绂掔�ｎ偄锟藉爼鐓崶銊︾闁哄棭鍓熼弻锛勪沪鐠囨彃顬堥梺瀹犳椤︻垵鐏掓繝銏犲濞呫垻寰婄捄銊︻潟闁圭儤姊荤壕鍏间繆椤栨艾鎮戦柛鎺撶洴閹鎲撮崟顒傤槬闂侀潧鐗婇幃鍌炵嵁閸愵喖顫呴柍钘夋鏁堥梺鍦帶閻°劎鎹㈤崟顓犵焼濠㈣埖鍔栭埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岀喓鍠婇崡鐐板枈闂佺懓纾崰鏍�佸☉銏″�烽柤纰卞墰閺嬪啯绻濈喊妯活潑闁割煈鍨抽幏鍐晝閸屾艾鎯為梺鍝勬储閸ㄦ椽鎮″▎鎴嫹閻熸澘顏鐟版閹﹢鏌嗗鍡欏幗闂侀潧鐗嗙换鎴狅拷姘秺濮婂宕掑▎鎴М闂佸湱鈷堥崑鍕弲闂侀潧艌閺呮稓澹曟繝姘厽闁哄啫鍊甸幏锟犳煛娴ｇ锟藉潡寮婚妸鈺傚亞闁稿本绋戦锟�
				xbean.UserDeviceInfo userDeviceInfo=xtable.Userdeviceinfotab.get(userid);
				boolean isfirst=false;
				int first=1;
				if(userDeviceInfo==null){
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︺儳绱撻崒姘毙㈤柨鏇ㄤ邯閹即顢欓懞銉ュ妳闂佹寧绻傚ú顓㈠煘韫囨稒鐓熼幖鎼灣缁夌敻鏌涚�ｎ亝鍣归柍璇茬Ч瀹曞ジ濡烽敂瑙勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鎯岄崰鏍倶閿旀拝鎷风憴鍕缂佽鍟撮獮鍡涘籍閸惊鈺呮煏婢诡垰鍟粻鎶芥⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘垵妫涢崝顖氣攽閻愭潙鐏︽い顓炴喘瀵娊宕卞☉娆戝幈闂佸搫娲㈤崝灞剧閻愭番浜滈柨鏃囶嚙楠炴牠鏌嶇憴鍕伌闁诡喒鏅濈槐鎺懳熸繝姘殬濠碉紕鍋戦崐鏍垂閻㈢绠犳俊顖欒閸ゆ洟鏌涘☉姗堝姛闁荤喎缍婇弻銊╂偄閸撲胶鐓撻悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚弶鍛婁繆閻愵亜锟芥牜鏁繝鍥ㄥ�块柨鏇炲�哥壕鍧楁煙閹冾暢缁炬崘妫勯妴鎺戭潩椤掑﹥鏁鹃柣搴㈣壘缂嶅﹤顫忛搹瑙勫磯闁靛鍎查悵銏ゆ⒑閻熸澘娈╅柟鍑ゆ嫹?
					first=0;
					isfirst=true;
					userDeviceInfo=xbean.Pod.newUserDeviceInfo();
					xtable.Userdeviceinfotab.insert(userid, userDeviceInfo);
				}
				userDeviceInfo.setIp(userinfo!=null?InetAddressUtil.ipInt2String(userinfo.getLoginip()):"auuserinfonull"); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠妤冿拷瑙勬处閸撴盯宕ｉ崨瀛樷拺闁圭瀛╅ˉ鍡樹繆椤愩垹顏�规洖缍婂顒佹償閹惧瓨鏉搁梻浣侯焾閺堫剛鍠婂澶婄柈闁绘劗鍎ら悡鐔兼煙閹屽殶闁瑰啿瀚伴弻鏇㈠炊瑜嶉顓狅拷娈垮枛閿熺晫鍣ュΣ鐓庮渻閵堝啫鍔滅紒顔芥崌瀵鏁撻悩鏌ュ敹濡炪倖鍔戦崹褰掞綖椤忓牊鈷戠紓浣癸供濞堟柨鈽夐幙鍐╂毆
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬨�侀弮锟介幏鍛嫚閳藉懏瀚归柛銉墯閳锋帒霉閿濆嫯顒熼柣鎺撳劤铻栭柣妯活問閻掗箖妫佹径濠庢富閻庯綆浜滈銏°亜椤愶絾绀嬮柡宀�鍠栭幃婊兾熷ú缁橆棝闂備礁缍婇ˉ鎾诲礂濮楋拷瀵偊骞囬鐔峰妳濠电娀娼ч悧濠囧疾閻撳簶鏀介柣鎰▕閸ょ喎鈹戦璇插祮鐎规洝顫夌换婵嗩潩椤掑倻鏋�闂備礁缍婂Λ璺ㄧ矆娴ｈ櫣涓嶉柕澶涜礋娴滄粓鏌￠崒婵囩《婵絿鍋ら弻锛勶拷锝庝簼閸ゅ洦鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敇閻樻彃蝎缂傚倸鍊搁崐鍝ョ矓閹惰姤鍊块柨鏃傛櫕閳瑰秴鈹戦悩鍙夋悙缂佺姷鎳撻湁闁挎繂鐗嗛敓鎴掔矙婵℃悂鍩￠崒婊冨妇濠电姰鍨奸崺鏍晪闂佸搫顑嗛悷鈺呭蓟閻旂⒈鏁嬮柛鈩冪懅钃卞┑鐑囩到濞层倝鏁冮鍫濈畺婵炲棙鎼╅弫鍌炴煕閺団�崇厫閻庢艾缍婇弻鈥愁吋鎼粹�崇缂備胶濮抽崡鎶藉蓟濞戞ǚ鏀介柛鏇ㄥ亜婵垻绱撴笟濠冨婵犵數濮撮崐鐢稿绩娴犲鐓熸俊顖氭惈缁狙咃拷鐟版啞缁诲嫰鏁撻崐鐕佹綈闁规悂顥撳▎銏狀潩鐠鸿櫣鐣哄┑掳鍊曢幊蹇涘疾閺屻儱绠圭紒顔炬閹风兘鎳犵捄铏瑰姷婵犵數濮烽。浠嬪礈濠靛浜归柛鎰典簽缁�濠傗攽閻樺弶宸濈�规挷绶氶弻鈥愁吋鎼粹�崇缂備胶濮鹃～澶愬Φ閸曨垰绠婚悹楦挎〃濞岊亪姊虹拠鑼婵☆偅绋撳Σ鎰板箻鐎涙ê顎撴繛瀵稿Т椤戝懘骞楅悽鍛娾拺闁革富鍘介崵锟藉┑鐐茬湴閸婃繈鏁愰悙鍓佺杸闁瑰彞鐒﹀浠嬨�侀弮鍫濈妞ゅ繐妫涢崐鐐烘⒒閸屾瑧顦﹂柟娴嬶拷瓒佹椽鏁冮崒姘亶婵犻潧鍊归幃鍫曟晸閽樺锟藉摜鍙呭銈呯箰閹冲骞忓ú顏呪拺闂傚牃鏅涢惁婊堟煕濡粯鍊愭鐐茬箻閺佹捇鎮╁畷鍥у箞闂佽鍑界紞鍡樼濠婂牜鏁傛い鎾卞灪閻撴洟鏌嶉悷鎵虎闁诲繆鏅滈妵鍕箻閸愬弶鍊悗鍨緲鐎氼厾鎹㈠┑瀣闂傚牊绋掗弳顖炴⒒閸屾艾锟藉嘲霉閸ヮ剨缍栧鑸靛姇绾惧潡鏌熼幆鏉啃撻柛濠傜埣閺屾盯顢曢悩鎻掑缂傚倷璁查弲鐘诲蓟閻旂厧绠氶柡澶婃櫇閹剧粯鐓冮梺鍨儏閻忔挳鏌″畝瀣瘈鐎规洘甯掕灒闁告繂瀚～姘節閻㈤潧浠滈柟鍐查叄楠炲﹤顫滈敓钘夘嚕鐠囨祴妲堥柕蹇婏拷鍏呯盎闂備礁鎲￠悷銉┧囨导瀛樺仧闁哄诞锟介弨浠嬫煃閵夈儱鏆辩紒鐙欏洦鐓曢柡鍐挎嫹闁荤啿鏅涢锝夘敃閿曪拷缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
				userDeviceInfo.setTelcooper(machineInfos.get("TelcoOper")==null?"":machineInfos.get("TelcoOper")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸斿摜绱掗悙顒�鍔ゆい顓犲厴瀵鎮㈤悡搴ｎ唹闂侀�涘嵆濞佳冣枔椤撶姷纾藉〒姘攻鐎氳绻濋姀锝嗙【闁活厼顦甸獮蹇涙倻閻ｅ苯绁﹂梺鍓茬厛閸犳牗鎱ㄦ惔鈽嗘富闁靛牆绻愰惁婊堟煕閵娿劍纭炬い鏇稻鐎靛ジ寮堕幊鐐藉姂閺屻劑寮崹顔规寖濡炪倖姊瑰ú鐔奉潖濞差亝鍋￠梺顓ㄧ畱濞堝爼姊虹粙娆惧剳闁稿鍊濋獮鍡涘礃椤旇偐顓洪梺缁樏悘姘舵晬韫囨柧绻嗛柕鍫濈箳閸掍即鏌涢悢璺哄祮闁诡喗鍎崇叅妞ゅ繐鎳愰崢鎼佹倵閻у憡瀚归梺璺ㄥ枍缁瑥鐣锋导鏉戠缂備焦蓱濞呫垽姊烘导娆戝埌闁哄牜鍓熷鎶藉煛閸屾ü绨诲銈嗘尵閸嬬喐鏅堕弴銏＄厸闁糕�崇箲濞呭﹥鎱ㄦ繝鍕笡闁瑰嘲鎳忕粭鐔碱敍濞戞瑦娈插┑锛勫亼閸娿倝宕戦崟顖�鍥敍濠婂啫鐤鹃梻鍌欒兌缁垶寮婚妸鈹匡拷鍐╂償閵娿儱鎯為梺鍝勬储閸ㄦ椽鎮￠弴鐔翠簻闁规澘澧庣粙鑽ょ磼閿熶粙鏁撴禒瀣拺缂備焦蓱鐏忎即鏌ｉ埡濠傜仸鐎殿喛顕ч埥澶婎潩椤愶絽濯伴梻浣侯攰椤宕濋弴鈶哄鈹戦崱鈺傚瘜闂侀潧鐗嗘鍛婄濠靛鐓曢柕濞垮劤娴犮垺銇勯銏㈢闁圭厧婀遍幉鎾礋椤愩倕閰遍梻鍌欒兌閸嬨劑宕曟潏鈺侇棜妞ゆ挾鍠庨閬嶆煕椤愮姴鍔滈柍閿嬪灩閹叉悂鎮ч崼婵呭垔濠碘槅鍋呴崹鍧楀蓟濞戞粎鐤�闁哄倸妫禍顏堟晲閻愬墎鐤�闁瑰彞鐒﹀浠嬨�侀弮鍫濇そ濞达綀顕栧Λ鍐⒒閸屾瑧顦﹂柛鐔锋健楠炴牠顢曢敃锟界壕褰掓煙闂傚璐伴柡浣稿�块弻銊╂偆閸屾稑顏�?
				userDeviceInfo.setChid(machineInfos.get("ChId")==null?"":machineInfos.get("ChId")); // 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾剁磽娴ｅ搫小闁告濞婂濠氭晲婢跺﹦鐤�闂傚倸鐗婄粙鎴︼綖椤愩倗纾藉ù锝呮惈閳诲牏绱掗悩宕囧⒌鐎殿喖顭锋俊鎼佸煛閸屾矮绨荤紓鍌氬�烽悞锕傛晝閳轰絼娑㈠礋椤栨稈鎷婚梺鎼炲劀鐏炴嫎褏绱撴担铏瑰笡缂佽鍟伴幑銏犫攽鐎ｎ亞锛滃┑鐐村灦钃辨い蹇嬪�栫换婵嬫偨闂堟稐鍝楅柣蹇撶箲閻熲晠濡撮崒鐐存櫢闁跨噦鎷�
				userDeviceInfo.setPlattype(machineInfos.get("PlatType")==null?"":machineInfos.get("PlatType")); // 婵犵數濮烽弫鍛婃叏閹绢喗鍎夊鑸靛姇缁狙囨煕閺嶃倕澧查悗姘愁潐娣囧﹪濡堕崟顓炲闂佸憡鐟ョ换姗�寮婚敐澶婄闁挎繂妫Λ鍕磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓哄┑鐐叉缁绘帗绂掓總鍛娾拺婵懓娲ら敓濮愬�濆畷鎶芥晲婢跺﹨鎽曢梺闈涚墕椤︻垳绮诲☉妯忓綊鏁愰崨顔藉枑婵炲濮电划宥囨崲濞戞熬鎷峰☉娆樼劷闁活厼锕ョ换婵嬫晸娴犲鐒肩�广儱妫楅崜锕�顪冮妶鍛闁绘锕畷鎴狅拷锝庡枟閻撴洘銇勯幇鈺侊拷鏇㈠几閹达附鐓曢柣鏇炲�圭�氾拷(IOS,android,wp)
				userDeviceInfo.setDeviid(machineInfos.get("DeviId")==null?"":machineInfos.get("DeviId")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠妤冿拷瑙勬处閸撴盯宕ｉ崨瀛樷拺闁圭瀛╅ˉ鍡樹繆椤愩垹顏�规洖缍婂顒佹償閹惧瓨鏉搁梻浣侯焾閺堫剛鍠婂澶婄柈闁绘劗鍎ら悡鐔兼煙閹屽殶闁瑰啿瀚伴弻鏇㈠炊瑜嶉顓狅拷娈垮枛閿熺晫鍣ュΣ鐓庮渻閵堝啫鍔滅紒顔芥崌瀵鏁撻悩鏌ュ敹濡炪倖鍔戦崹褰掞綖椤忓牊鈷戠紓浣癸供濞堬綁鏌熼崙銈嗗(mac/idfv)闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀�鍠栭獮鍡涘级閸熷啯鎹囬弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺鍛婄缚閸庨亶藟濮樿埖鐓曠憸搴ㄣ�冮崱娑欏亗婵炲棙鎸婚崑锝夋煕濠靛棗顏柟顖氱墛閵囧嫰濡疯娴犻亶鏌＄仦鍓ф创濠碉紕鍏橀、娆撴偂鎼存ɑ瀚介梻鍌欐祰濡椼劎绮堟担鑲濇稑鈹戠�ｎ亣鎽曞┑鐐村灟閸ㄥ綊宕￠幎鑺ョ厪濠电偛鐏濋崝娆撴煕閹存粎鐭欐慨濠呮閸栨牠寮撮悢鍝ュ絿闂備胶顭堥鍡涙儎椤栫偛鐏抽柡鍐ㄧ墕缁�鍐┿亜閺傛寧顫嶇憸鏃堝蓟濞戙垹鐒洪柛鎰典簼閸Ｑ冾渻閵堝骸锟姐倝宕堕妸銏″闂備胶鍘ч～鏇㈠磹閺囥垹姹查柨鐔剁矙濮婃椽骞栭悙鎻掑Г闂佺硶鏅滈悧鐘差嚕閹绘帩鐓ラ柛顐ゅ暱閹风粯绻涢幘纾嬪婵炲眰鍊栭弲鍫曨敊閸撗咃紲婵犮垼娉涢張顒勫汲椤掑嫭鐓欐い鏃傛閹风兘寮妷锔绘綌婵犳鍠楅…鍥磻閹捐鎷峰鎰佹綈妞ゃ劊鍎甸幃娆撴嚑椤戣儻妾搁梻浣告啞濮婄懓鐣濋幖浣歌摕闁绘梻鍘х粈鍐煠绾板崬澧版い鏂匡功缁辨挻绗熼崶褎鐏嶉悗鐧告嫹缂佸娉曢弳锔剧磼鐎ｎ収鍤﹂柡鍐挎嫹闁瑰嘲鎳樺畷顐﹀礋椤愩値鍟堥梻鍌氬�搁崐鐑芥倿閿旀拝鎷风粭娑樻搐閽冪喖鏌曟繛鐐珔閻熸瑱绠撻幃妤呮晲鎼粹�斥挄闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�
				userDeviceInfo.setImei(machineInfos.get("IMEI")==null?"":machineInfos.get("IMEI")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁嬫妫岄梺绋款儎缁舵艾鐣烽弴鐔哥秶闁宠桨绶″Λ婊堟煟閻樿精顒熼柣鎾愁樀楠炲繑顦版惔銏犳瀭闂佸憡娲﹂崜娑⑺囬妷銉㈡斀闁绘劘灏欏﹢鎾煕閺傛寧鎹ｉ柛鎺撳浮瀹曞ジ鎮㈤搹鍦闂備胶顭堢悮顐﹀磹濡ゅ懎鑸归柣銏犳啞閳锋垿鏌涜箛鎾虫倯闁稿﹥鍔栫换娑欐媴閸愭彃顏柛娆忕箻閺屾盯濡烽鐓庮潽闂佺粯鎸诲ú鐔煎蓟閻旂厧绠悘鐐垫櫕閸橆偊鏌ｆ惔銏ｅ缂傚秴锕ら～蹇旂節濮橆剛锛滃┑鐐叉閸ㄥ灚淇婃禒瀣拺閻犲洠锟借櫕鐏堥梺缁樼墱閸樠囨偩閻戣棄鍗抽柕蹇婏拷绛规嫹缂佹ü绻嗘い鏍ㄥ閹封剝绻涢崣澶嬪�愭慨濠呮缁辨帒螣閸濆嫷娼撻柣搴㈩問閸ｎ噣宕滈悢鐓庢瀬闁归偊鍘肩欢鐐测攽閻樻彃锟藉摜绮婇锟藉缁樻媴閾忕懓绗″銈庡幖濞差厼顕ｉ锕�绠瑰ù锝堫潐濞呮牕鈹戦悩璇у伐闁绘锕崺娑㈠箣閿旇棄浠梺璇″幗鐢帗淇婇崗鑲╃闁告侗鍠栨慨宥夋煛瀹�锟介崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
				userDeviceInfo.setNetenvir(machineInfos.get("NetEnvir")==null?"":machineInfos.get("NetEnvir")); // 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顕�姊哄Ч鍥э拷銈夊窗濡ゅ懎桅闁告洦鍨伴崘锟藉銈嗗姦濠拷缂侇喖鐖煎娲箹閻愭彃顬堥梺绋匡工濞尖�愁嚕鐠囨祴妲堥柕蹇婂墲濞呭棝鏌ｉ悩鍙夊鐟滄澘鍟扮划鏄忋亹閹烘挴鎷洪梺纭呭亹閸嬫稒淇婇悾宀�纾奸悹鍥皺婢э妇锟芥鍠涢褔鍩ユ径鎰潊闁冲搫鍊瑰▍鍥⒒娴ｇ懓顕滅紒璇插�歌灋婵炴垟鎳為崶顒�惟闁冲搫鍊甸幏铏圭磽娴ｅ壊鍎愭い鎴炵懇瀹曟洟骞囬鍓э紲闁荤姴娲﹁ぐ鍐汲閿濆應鏀介柨娑樺閺嗩剛锟借娲滈崰鏍�佸☉姗嗘僵妞ゆ帪鎷烽柡浣靛�濆缁樼瑹閿熻棄顭囪閳ワ箓宕奸妷銉э紵闂佸憡顨堥崐顐﹀箳濡わ拷闁卞洭鏌曟径娑滃悅闁归攱妞藉娲川婵犲嫮鐣甸柣搴㈠嚬閸欏啴寮澶婄睄闁割偆鍠撻崢鐢告⒑閸涘﹤鐏熼柛濠冪墱閿熻姤鐔幏锟�(濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鐓曟俊銈呭暕缁辨娊鏌ｉ悢鐓庝喊闁绘挶鍎甸弻娑㈠即閵娿儰鑸┑鈽嗗亜濡稓妲愰幘瀛樺濞寸姴顑呴幗鐢告煟閵忊晛鐏茬紒缁樼箞閹即顢欓挊澶岀獮閻庣櫢鎷烽悗锝庡亜椤忓爼姊洪幐搴ｇ畵濡ょ姴鎲＄粋宥咁煥閸曗晙绨婚棅顐㈡储閸庤尙锟芥熬鎷�3G,4G,wifi)
				userDeviceInfo.setOsver(machineInfos.get("OsVer")==null?"":machineInfos.get("OsVer")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠妤冿拷瑙勬处閸撴盯宕ｉ崨瀛樷拺闂傚牊绋撴晶鏇熺箾閺夋垵顏鐐茬箻閹粓鎸婃径濠勶拷顓烆渻閵堝棗濮傞柛濠冩礀椤曪綁濡搁埡鍌楁嫼闂佸憡绻傜�氼垶锝為敃鍌涚厱濠电姴鍟版晶鍨殽閻愯尙澧﹀┑鈩冩倐閸┾剝鎷呴搹瑙勬緫濠碉紕鍋戦崐鏍暜閹烘鏅濋柕澹秵瀚规慨妯诲墯濞兼劕菐閸パ嶈含濠碘�崇埣瀹曘劑顢欓崗纰变哗闂傚倷绀侀幖顐わ拷姘ュ姂瀹曟洟鎮界粙鑳憰闂佹寧绻傞幉姗�鎮㈤崗鐓庢異闂佸疇妗ㄩ懗鍫曨敃婵傚憡鈷掑ù锝堟鐢盯鏌熼幖浣虹暫鐎规洑鍗抽獮鍥敇閻橆偅鏁靛┑鐘垫暩婵潙煤閵堝懏绾梻鍌氼煬閸嬪嫬煤閿曞倸钃熼柕濞炬櫓閺佸倿鏌涢锝嗙闁抽攱甯掗湁闁挎繂鐗婇鐘绘偨椤栨稓鈾侀柕鍥у婵℃悂濡烽敃锟藉▓妤呮⒑鏉炴壆顦﹂柛鐔风摠娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崑鍛存偟閺嶎厽鈷掑〒姘炬嫹婵炰匠鍛床闁割偁鍎辩壕褰掓煛瀹ュ骸骞栭柣銈夌畺閺岀喖姊荤�电濡介梺缁樻尪閸庣敻寮婚敐澶婂嵆闁绘劘顕滈幏鐑藉捶椤撱劍瀚规慨妯煎亾鐎氾拷(闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎茬换婵嗩嚗闁垮绶查柨鐔虹崵閸パ咁唵闂佺粯鍨兼慨銈夋偂韫囨稒鐓曢柍鈺佸幘椤忓娊褰掝敊閹惧懏瀚归悷娆忓缁�鍫ユ煕韫囨棑鑰块柕鍡曠椤粓鏁撴禒瀣畺闁宠桨璁查弸鏃堟煙缁嬪灝鐝愰柨鏇炲�归埛鎺懨归敐鍥╂憘闁搞倖鐟╅弻娑㈠箣閻樿櫕鐝紓浣戒含閸嬨倕鐣烽崡鐐╂婵☆垵鍋愬畷鑸电節瀵伴攱婢橀敓鑺ユ礋楠炲﹥鎯旈敐鍜佹婵犵數濮电喊宥夊磹閻㈠憡鐓ユ繝闈涙椤庢鏌＄�ｎ剙鏋涢柡宀嬬秮楠炴锟芥稒顭囬ˇ銊╂⒑闂堟稒鎼愰悗姘嵆閻涱噣宕堕锟介悡娑樸�掑顒婃敾閻庢艾缍婇弻锟犲炊閵夈儳浠奸梺鍛婂灩婵烇拷闁哄瞼鍠愬蹇斻偅閸愨晩锟藉秹姊虹紒妯诲鞍闁荤啙鍥ㄦ櫢闁伙絽鏈崵锟介柣搴㈠嚬閸樺ジ鈥﹂崹顕呮建闁跨喍绮欓獮濠傤煥閸℃劒姹楅梺鍦劋閹搁箖宕㈤幘缁樼厽闁绘柨鎽滈幊鍐倵濮樼厧澧撮柟顔斤耿楠炴﹢顢欓悾灞藉箞闂備線娼ц墝闁哄懏绻堥幃楣冩倻濮楀棙顔旈梺缁樺姇閻°劌鐣风仦缁㈡闁绘劖娼欏ù顔撅拷娈垮櫘閸撴瑩鍩㈡惔銊﹀�锋い鎺嶈兌閵堢殎s9,android4.1)
				userDeviceInfo.setBrtype(machineInfos.get("BrType")==null?"":machineInfos.get("BrType")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠崣鍕瑰鍕姸婵☆偆鍠庨—鍐Χ閸℃瑥顫х紓渚囧枛鐎涒晝绮欐径濠庡悑濠㈣泛顑囬崢顏呯節閵忥絾纭炬俊顐ｇ懃閳诲秹宕卞☉娆戝幈婵犵數濮寸�氼參寮抽鍕厸閻忕偠顕ф俊濂告煃鐟欏嫬鐏寸�规洖宕埥澶愬箟鐎ｎ偄顏跺┑掳鍊ч幏鐑芥婢跺绡�濠电姴鍊搁顐ょ磼閻樻剚鐒界紒杈ㄥ笚濞煎繘濡搁妷锕佺檨濠电姷顣介崜婵嬪箖閸岀偛鏋侀柛宀�鍋為崑鈺呮倶閻愪絻妾搁柛姘川缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵婏絼绮撻梺鍛婄缚閸庢煡寮冲鍫熺叆闁绘柨鎼ⅷ闂佽法鍠愰崹婵堟濮橆剦鍤曢柟缁㈠枛椤懘鏌ｅΟ鑽ゅⅵ闁告柨绉规俊鐢稿礋椤栨碍顥濋梺鍓茬厛閸犳宕愰姘兼富闁靛牆妫欓悡銉╂倵濮橆厽绶叉い顐㈢箳缁辨帒螣鐠囧樊锟芥挾绱撴担鍦槈妞ゆ垵鎳庨埢鎾活敇閵忊檧鎷洪梺鍛婄☉閿曘倝鎮橀敐鍥╃＜妞ゆ梻鏅幊鍥煟濞戝崬鏋︾紒鐘崇☉閳藉鈻庨幇顓т户闂傚倷娴囧▔鏇㈠闯閿曞倸绠柨鐕傛嫹(濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫�搁悘婵嗏枔閳哄懏鐓欏瀣閸樻挳鏌熼鍝勭仼闁宠绮欏畷銊︾節閸愩劍娈紓鍌欐祰妞村摜鏁垾宕囨殾闁圭儤鍨熷Σ鍫熶繆椤栨稒顫楅柣褌绶氶弻锝嗘償閵堝孩缍堝┑鐐插级閻楃姵淇婇崼鏇炲窛濠电姳鑳剁粻姘舵⒑缂佹ê鐏辨俊顐㈠閺侇噣鏌ｉ悢鍝ョ煀缂佺粯锚椤曪綁骞庨挊澶岊吋濡炪倖鏌ㄦ晶浠嬫晬濠靛鈷戠紒瀣濠�浼存煟閻旀繂娲ょ粈澶岋拷骞垮劚濞层劎澹曟總鍛婂�甸柨婵嗛娴滄粓鏌ｈ箛瀣姦闁哄被鍔戝鏉懳熼搹閫涚棯婵犵數鍋熼崢褏鎹㈠锟藉畷娲晸閻樿尙顦ㄥ銈呯箰濡鎱ㄩ崨濠勭瘈闁汇垽娼цⅷ闂佹悶鍔岄妶绋跨暦濞差亜鍐�妞ゆ挾鍋熼ˇ顕�姊洪崫鍕枆闁告ê銈搁幃锟犲即閵忥紕鍘甸柣搴㈢♁椤洨鎷归埡鍐╁枑闁绘鐗嗙粭姘舵煕鐎ｎ亜锟藉潡鐛弽銊︾秶闁告挆鍚锋垿姊虹憴鍕祷闁靛牏顭堥～蹇涙倻濡顫￠梺缁橆殔閻楀繘濡堕悧鍫滅箚闁绘劕鐡ㄧ紞鎴︽煙閼恒儳鐭掓鐐村灴婵拷闁绘﹩鍋呴～宥夋⒑闂堟稓绠氶柛鎾寸箓閳诲秴顭ㄩ崼鐕佹濡炪倖鍔戦崹鐑樺緞閸曨垱鐓涢悘鐐额嚙婵倹銇勯姀鈩冾棃闁轰焦鎹囬弫鎾绘晸閿燂拷)
				String username=xtable.Auuserinfo.selectUsername(userid);
				if(username!=null){
					userDeviceInfo.setUsername(username);
				}
				
				if(isfirst==true){
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁哄喛鎷烽柛銈呯Ч閺屾盯濡烽鐓庘拻闂佽桨绀佸ú顓㈠蓟閺囷紕鐤�闁哄洨鍊妷锔轰簻闁挎棁顕у▍宥夋煙椤旂瓔娈滈柟顖氬�垮畷銊︾節閸屻倓绱﹂梻鍌氬�风粈渚�骞夐垾瓒佹椽鏁冮崒姘憋紱婵犮垼鍩栭崝鏇㈠及閵夆晜鐓熼柟閭﹀墻閸ょ喓绱掗悩鑽ょ暫闁诡喗顨婇幃钘夆枔鐠恒劌濮奸柣搴㈢♁缁诲倿鈥旈崘顔嘉ч柛鈩冾殘娴犳潙鈹戦埥鍡椾簼缂佽鍊块幃楣冩倻閽樺宓嗛梺缁樺灥濡骞冮幋鐐电瘈闁靛骏绲剧涵鐐亜閹存繃鍠樼�规洏鍨介弻鍡楊吋閸″繑瀚奸梻浣告啞缁诲倻锟芥凹鍙冨畷鎺楀Ω閳哄倻鍘遍梺鍝勫�藉▔鏇㈡倿閸濄儻鎷峰▓鍨灍闁诡喖鍊规穱濠囧醇閺囩偟鍊為梺鍐叉惈閸犳稓妲愰弻銉︹拻濞达綀娅ｇ敮娑㈡煥閺囨娅婄�规洑鍗冲浠嬵敇閻愭妲烽梻浣瑰濞叉牠宕愯ぐ鎺撳亗婵炴垶鐔幏鐑芥儌閸涘﹤顏堕梺璇插嚱缂嶅棝宕滃☉銏犳辈闁靛牆顦伴埛鎴﹀级閻愭潙顥嬮柛鏂跨Ч閺岀喎顫㈢仦钘夋優缂備緡鍠栭澶愮嵁閹烘绫嶉柟鐐綑椤忓爼姊洪幐搴ｇ畵闁告垳绮欓獮蹇涙倻缁涘鏅ｅ┑鐘诧工閸燁偊锝為崶顒佲拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶樻晪闁跨喍绮欏顐﹀箻鐎靛壊娴勯柣搴秵娴滄粓宕甸幋锔解拺闁绘挸瀵掑鐔兼煕婵犲啰澧甸柨婵堝仱瀵挳鎮㈢粙鍨紟婵犵妲呴崹浼存倶濠靛鍋傞柟閭﹀幑娴滄粓鏌曟径鍫濆姷闁猴拷婵犳碍鐓忛柛銉戝喚浼冨Δ鐘靛仜濞差厼螞閸愩劉妲堟慨妤�妫欏ù鍥⒒娴ｇ瓔鍤欓悗娑掓櫊閹垽顢楅崟顐ゎ唵闂佽法鍣﹂幏锟�?
					userDeviceInfo.setFirstdeviid(machineInfos.get("DeviId")==null?"":machineInfos.get("DeviId"));
					fire.log.YYLogger.OpRegLog(userid,0,0);
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笂缁�渚�宕滈鐑嗘富闁靛牆妫楁慨褏绱掗悩鍐茬仼缂侇喖鐗撳畷姗�顢欓悾灞藉箞闂備礁婀遍崑鎾汇�冮崨鏉戠柈妞ゆ牜鍋涚壕瑙勩亜閺嶃劌鐒归柡锟芥禒瀣厽婵☆垱妞块崯蹇涙煛閸♀晛鐏﹂柡灞诲姂閹垻绱掑鍡橆棄闂備礁鎽滈崰鏇炩枖閺囩姵顫曢柣鎰惈閸愶拷濡炪倖鎸鹃崰鎾诲储閸楃偐鏀介幒鎶藉磹瑜旈獮蹇涙倻閼恒儳鍘遍梺缁樻閺�閬嶅磻閵夛负浜滈柕蹇婏拷鍐叉懙闂佽桨鐒﹂崝鏍ь嚗閸曨倠鐔虹磼濡崵褰ｉ梻鍌氬�峰ù鍥р枖閺囥垹绐楅柡鍥╁枑閸欏繘鏌曢崼婵囶棤闁崇懓绉撮埞鎴︽偐閸欏顦╅梺绋匡工椤兘寮婚敃锟借灒闁绘艾顕粈鍡涙⒑闂堟丹娑㈠礋椤愶絿锟介箖姊绘繝搴′簻婵炶闄勭粭鐔肺旈崨顓熺�繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�
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
//					pexecute(new PFskAward(roleid,devicetype));//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝鎮㈤崗鑲╁帾闂婎偄娲﹀ú鏍ㄧ墡闂備礁鎽滈崰鎾诲磻閵堝钃熸繛鎴炵懄閸庣喖鏌嶉挊澶嬪櫤闁轰礁澧界槐鎾存媴閾忕懓绗＄紓浣筋嚙閸熶即骞戦姀鐘斀閻庯綆浜為敍婊冣攽椤旀枻鑰挎俊顐ユ硶濡叉劙骞嬮敂瑙ｆ嫽婵炶揪缍�濞咃絿鏁☉姘辩＜閻犲洤寮堕ˉ銏拷瑙勬礃濡炶棄顕ｆ禒瀣垫晣闁绘劕绋勭粻鎾诲蓟濞戙垹鍗抽柕濞垮劤娴犫晝绱撴担鍝勑ｉ柣鈺婂灦瀵顓奸崱妯侯潯闂佺懓鍢查懟顖炲储閳╁啰绠鹃悗鐢殿焾閳诲牏绱掗悩宕囧ⅹ妞ゎ偄绻橀幖褰掑捶椤撶姷鍘繝鐢靛仜濡鏅舵禒瀣煑婵浜壕钘壝归敐鍫燁棄闁藉嫬鍚嬬换娑欏緞鐎ｎ偆顦ラ柛妤呬憾閺岀喖鎮ч崼鐔哄嚒缂備胶濮惧▍鏇熺┍婵犲洤围闁告洦鍘兼俊钘夆攽閻愬弶鍣烽柛銊ㄦ閹广垹鈽夊鐐闁汇垺顔栭悞鍓э拷娑欑箓椤啴濡堕崱妤冧淮濠碘槅鍋呯换鍌炴偩閻戣棄绠ｉ柨鏇嫹缁炬儳銈搁弻锝夊箛椤栨氨姣㈠銈嗘⒐閸旀瑩寮婚埄鍐ㄧ窞濠电姴瀚。鐑樼節閳凤拷閸涱喗鐝繝銏ｎ潐濞茬喖鐛幇顓熷劅婵犻潧鐗忛悾鐐繆閻愵亜锟芥牠鎮ч幘璇茬９闁哄稁鍋撻幏宄邦潩閻愵剙顏�
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


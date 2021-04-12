
package fire.pb.talk;

import com.locojoy.base.Octets;







import fire.pb.HelpCountManage;
import fire.pb.circletask.CircleTask;
import fire.pb.circletask.anye.RoleAnYeTask;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChatItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChatItemTips extends __CChatItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (displayinfo == null || displayinfo.roleid < 0)
			return;
		if(displayinfo.displaytype == DisplayInfo.DISPLAY_TASK && 
				displayinfo.shopid == 2){
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝蹇撯枖濞戭澁缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ亞閿熺瓔鍘奸—鍐Χ閸℃顦ラ梺鐟板暱闁帮絽鐣峰鍫濈妞ゆ柨澧介敍婵囩箾鏉堝墽鎮兼い顓炵墦閵嗗倿骞庨懞銉у幈闁诲函绲婚崝宀勬晸閼恒儳绠撴い鏇悼閹风姴霉鐎ｎ偒娼旈梻渚�娼х换鎺撴叏閺夋垹鏆ら柛鈩冪♁閳锋垿姊婚崼鐔剁繁闁绘帡绠栭弻娑欐償閵堝嫬鎯堢紓渚囧枦椤曆呭弲濡炪倕绻愰幊澶愬箯閾忓湱纾藉ù锝呭閸庡繘鎮樿箛鎾村殗鐎规洘绻堥幃銏ゅ礂閼测晛骞堥梺璇插嚱缂嶅棝宕滃▎鎾冲嚑婵炴垯鍨洪悡娑樏归敐鍫綈鐎规洖鐭傞弻鐔碱敊閻撳簶鎸冩繛瀵稿缁犳捇骞冨▎鎿冩晢濞达絿鍎ら～婊堟⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閵夘喗鏅為梺鍛婄☉閻°劑寮插┑瀣厪濠㈣鍨伴幊鎰版倿閸ф鍊垫鐐茬仢閸旀碍銇勯敂鍨祮鐎规洘鍔欓幃婊堟嚍閵壯冨及闂傚鍋勫ú锕�煤濮楋拷瀹曠敻鏁撻悾宀�纾藉ù锝夘棑缁涘繒绱掗悩铏碍妞ゎ偄绻橀幖褰掓偡閺夋鍤欓梻浣告惈濞层劑宕戝☉銏犵厱濠㈣泛顭〒濠氭煏閸繈顎楁鐐寸墬缁绘稑顔忛鐓庣睄婵犵鍓濋幐鍐茬暦閵娧嶆嫹濞戞顏堟晸閽樺鐓奸柡灞诲�濋獮渚�骞掗幋婵嗩潛濠电偛顕刊顓㈠垂鐠轰警娼栨繛宸簻缁犲綊鏌ｉ幇顓炵祷濠殿喖鐭傚娲川婵犲啰鍙嗛梺娲诲墰閸樠囶敋閵夛妇绡�闁告洦鍘鹃敍婊冣攽閳藉棗鐏﹂柡鍛板皺閼鸿京鎷犲顔藉瘜闂侀潧鐗嗗Λ妤佹叏閿曞倹鐓曢柟鎯х摠閻ㄦ垿鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					boolean ret = CircleTask.getRoleSpecialQuest(displayinfo.roleid, displayinfo.uniqid, displayinfo.counterid, tips);
					if(ret) {
						psendWhileCommit(roleId, tips);
						return true;
					} else {
						psendWhileRollback(roleId, new SChatItemTips(displayinfo, new Octets()));
						return false;
					}
				}
			}.submit();
		} else if(displayinfo.displaytype == DisplayInfo.DISPLAY_TASK && 
				displayinfo.shopid == 3){
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝蹇撯枖濞戭澁缍栭煫鍥ㄦ媼濞差亶鏁傞柛鏇ㄥ亞閿熺瓔鍘奸—鍐Χ閸℃顦ラ梺鐟板暱闁帮絽鐣峰鍫濈妞ゆ柨澧介敍婵囩箾鏉堝墽鎮兼い顓炵墦閵嗗倿骞庨懞銉у幈闁诲函绲婚崝宀勬晸閼恒儳绠撴い鏇悼閹风姴霉鐎ｎ偒娼旈梻渚�娼х换鎺撴叏閺夋垹鏆ら柛鈩冪♁閳锋垿姊婚崼鐔剁繁闁绘帡绠栭弻娑欐償閵堝嫬鎯堢紓渚囧枦椤曆呭弲濡炪倕绻愰幊澶愬箯閾忓湱纾藉ù锝呭閸庡繘鎮樿箛鎾村殗鐎规洘绻堥幃銏ゅ礂閼测晛骞堥梺璇插嚱缁插宕濆畝鍕櫢闁兼亽鍎崇粻鎾淬亜閺囶亞绋荤紒缁樼箓椤繈顢橀悢鍓蹭户闂傚倷鑳剁划顖濇懌閻熸粍婢橀崯鎾箠閹捐鍨傛い鏃囶潐閺傦拷婵＄偑鍊栧濠氭偤閺傚簱鏋旈柡鍐挎嫹濞ｅ洤锕、鏇㈡晲閸ャ劌娅氶梻浣筋嚃閸犳牗鏅舵禒瀣闁告洦鍓涢悷瑙勩亜閺嶃劎鈽夐柣锔界矒濮婄粯绗熼敓钘夘焽瑜嶇叅闁靛牆鎳愰弳锔姐亜閹烘垵顏╃痪鍓ф嚀閳规垿鎮╃�圭姴顥濈紓渚婃嫹濠㈣泛鐭夐幏鐑界嵁閸喖濮庡銈忕細閸楁娊骞冮檱缁犳稑鈽夊▎鎴濆箞闂備線娼ч¨锟界紒鑼跺Г娣囧﹪宕稿Δ浣哄幍闂佸憡鍔曞鑸靛緞閸曨垱鐓忛柛銉戝喚浼冩繝娈垮櫙閹风兘姊虹�圭姵顥夋俊顐ｇ懇閹箖鎮滈懞銉㈡嫼闂佽崵鍠愬妯何ｆ繝姘厵闁惧浚鍊嬮鍫熷仼闁绘垹鐡旈弫鍐煥閺囶亝瀚归柛鐑嗗灦濮婃椽妫冨☉姘暫濠电偠顕滅粻鎾愁嚕閸欏闄勯柛娑樑堥幏濠氭⒑缁嬫寧婀伴柤褰掔畺閺佹捇鎮剧仦钘夊箣闂佽鍠氶崑銈夊极閸愵喖纾兼慨妯夸含閺嗩偊姊绘担绋款棌闁稿鎳庣叅闁哄稁鍋勯ˉ姘舵煕瑜庨〃鍡涙偂閺囩喓绡�闂傚牊绋掗ˉ婊勩亜韫囨梹灏﹂柡宀嬬秮瀵剟骞愭惔顔斤紗闂備礁鎼悮顐﹀礉閹达箑绠栭柕蹇嬪�曠粈鍫澝归敐鍫燁仩闁告﹩鍨跺缁樻媴閸涘﹥鍎撻梺娲诲墮閵堢鐣锋导鏉戝唨妞ゆ挾鍠庢禒鎺戭渻閵堝棙绌块柟鐑筋棑閿熷�燁潐濞叉牜绱炴繝鍥ワ拷浣糕枎閹惧磭鐓戦梺闈涳紡閸滀焦袩闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｆ硾閳句礁煤椤忓嫮鍘搁梺鍛婁緱閸橀箖顢欓崱娑欌拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶婄鐎规洖娲ら崫娲⒑閸濆嫷鍎愰柣妤侇殘閹广垹鈽夐姀鐘殿吅闂佺粯鍔欏褔寮抽敓鐘斥拺闁荤喐婢樺Σ濠氭煕閵忥紕鍙�闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼崗鑲╂殬闁搞劍妲掗妵鎰償椤厾绠氶梺闈涚墕濞层倕鏆╅梻浣侯焾椤戝棝鎯勯姘辨殾妞ゆ牜鍎愰弫宥嗙節婵犲倸顏╅幖鏉戯工閳规垿鎮╃紒妯婚敪濡炪倖鍨甸幊鎰垝閸澁鎷烽敐搴′簴濞存粍绮撻弻鐔虹磼閵忕姷浠梺闈╃导閸楁娊寮婚敓鐘虫櫢濞寸姴顑呮导鐘绘煕閺囨ê濡介柡鍌︽嫹闂傚倷鑳剁划顖炴晝閳哄懎绐楅柡宥庡幗閸婂爼寮堕崼娑樺缂佺姵鍎抽…璺ㄦ崉娓氼垰鍓冲┑鐐插级閹告娊寮婚悢纰辨晬婵浜崝顖炴倵鐟欏嫭绀冮悽顖ょ節楠炲啫鈻庨幘宕囬獓闂佺懓鐡ㄧ划搴ㄦ煢閻㈠憡鈷掗柛灞剧懄缁佺増绻涙径瀣鐎规洘濞婇弫鍐磼濮橀硸鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒鹃崯鍝ョ磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦梻鍫熺♁閹兼劙鎮楀顓熺凡妞ゆ洩缍侀獮姗�顢欓悡搴わ拷鍨攽鎺抽崐褔骞忛柨瀣ㄤ簻闊浄绲奸柇顖炴煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬫偘椤曪拷瀹曞爼顢楁径瀣珜濠电偠鎻徊鍧楀箠閹捐绀堥柣銏㈡暩绾句粙鏌涚仦鍓ф噯闁稿繐鑻埞鎴︻敊閹冨箣閻庢鍣崑鍛崲濠靛棭娼╂い鎺戝暞閹蹭即姊绘担瑙勭伇闁哄懏鐩畷顖烆敃閵堝棭鍋ㄩ梺缁樺姉閸庛倝宕愰悽鍛婄叆婵犻潧妫涢崙鍦磼閵娿劍顥夐棁澶愭煟濡寧鐝悘蹇ョ畵閺岀喖顢欓幐搴ｃ�愬銈庡亝缁诲牆鐣烽敓鐘冲�烽柟鎵虫櫅閸斻倗绱掓潏銊ョ瑲婵炵厧绻樻俊鎼佹晝閿熶粙妫勫澶嬧拺闁荤喐婢樺Σ濠氭煙閾忣個顏堟偩閻戣姤鍊荤紒娑橆儐閺咃絽鈹戦悙鏉戠仸闁荤噥鍨伴…鍥棘鎼存挻鏂�闂佹寧绋戠�氼剚绂嶆總鍛婄厱濠电倯鍐╁櫧濞戞挸绉归弻鐔兼倻濡钄兼繛瀵稿Т閻楁捇寮婚悢鍏尖拻闁圭虎鍠楅鏍⒑鐠恒劌鏋欐俊顐㈠瀹曨垳锟芥稒眉缁诲棝鏌ｉ幋锝嗩棄闁绘挻绋戦湁闁挎繂鎳忛幆鍫ユ煥閻旂儤娅曢柛瀣洴閳ユ棃宕橀鍢壯囨煕閳╁喚娈橀柣鐔稿姍閺岋綁鎮╂潏鈺佸闂佺粯鎼换婵嬫偘椤曪拷楠炲洭寮剁捄顭戞О婵＄偑鍊栧Λ浣筋暰闂佸綊鏀卞浠嬪箖瀹勯偊鐓ラ柛娑卞弾閺嗩參鏌ｉ姀鈺佺仭閻㈩垱顨堢划瀣吋閸℃鍤ら柣搴㈢♁椤洭宕㈤柆宥嗏拺閻熸瑥瀚崝銈嗐亜閺囥劌寮鐐诧躬瀹曞爼顢楁担鍝勫箥婵＄偑鍊栧ú鏍涘☉姘К闁跨喍绮欏鐑樻姜閹殿喖濡介梺鍦嚀濞差厼顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
					int submiterLv = xtable.Properties.selectLevel(roleId);
					if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
						MessageMgr.sendMsgNotify(roleId, 145390, null);
						return false;
					}
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锕傛⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樺啿浠梺闈涱槴閺呮粓寮插┑瀣厪濠㈣泛妫欏▍鍛浖閸涘瓨鈷戦柛娑橈攻婢跺嫰鏌涢妸銈呭祮鐎规洘锕㈤弫鎾寸鐎ｎ偀鎷洪梻鍌氱墛娑撶懓鈽夊顐ｅ媰闂佺粯鍔﹂崜锕傚疮閸ヮ剚鈷掗柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囨鎷烽敃鍌氶唶闁绘洑鐒﹂鏃堟⒑瑜版帗锛熼柣鎺炵畵瀵彃鈹戦崶銉ょ盎闂婎偄娲﹂幐鐐櫠閺囥垺鐓㈤柛鎰典簻閺嬫盯鏌″畝瀣М鐎殿噮鍣ｅ畷鍫曗�﹂幋婊冩憢缂傚倷鑳堕崑鎾诲磿閹惰棄瑙﹂悗锝庡亞閳瑰秴鈹戦悩鍙夌ォ闁轰礁绉电换婵嬫濞戞瑯妫為梺璇″灣閸嬬喓妲愰幘瀛樺闁告挻褰冮崜鏉库攽閻愰鍤嬪┑鈥虫喘楠炴垿濮�閻橆偅鏂�闂佺硶锟藉磭绠查柣蹇庣窔濮婃椽宕滈懠顒�甯ラ梺鍝ュУ椤ㄥ﹪骞冮悽鍓叉晩闁伙絽鐬奸鏇㈡煟鎼淬垻鈾佹い顓炴喘閹矂濡堕崥銈囨嚀椤劍鎯斿┑瀣粣闂備胶绮笟妤呭闯閿濆懐鏆︽慨妤嬫嫹妞ゃ垺顭堥ˇ鎶芥煃鐠囪尙鐒告慨濠勭帛閹峰懘鎼归獮鍖℃嫹婵犲洦鐓涢柛灞剧懅缁愭梻锟借娲樼划宀勫煘閹寸媴鎷烽敐搴濈敖妞ゆ柨妫濆娲川婵犱胶绻侀梺鎼炲姂娴滆泛鐣锋导鏉戝耿婵炴垶鐟ч崢閬嶆⒑閸濆嫭鍌ㄩ柛鏂挎湰缁傚秴顭ㄩ崘鍓у數闂佽崵鍠愬姗�寮冲▎鎾寸厓閻熸瑥瀚悘鎾煙椤旇娅婄�规洖缍婇、鏇㈡晲閸℃瑦顫栭梻鍌氬�烽懗鍫曗�﹂崼銉晞闁糕剝鐟ч惌娆撴煙鏉堝墽鎮煎ù婊堜憾閺岋絾鎯旈敐鍡╀户闂佸綊顥撻崗姗�寮诲☉銏犲嵆闁靛鍎扮花钘夘渻閵堝繐鐦滈柛妯恒偢閸╃偤骞嬮敂钘変汗缂傚倷鐒﹁摫闂佹鍘奸—鍐Χ閸℃浠撮梺鐟板暱鐎涒晠寮查妷鈺傗拺闁告繂瀚～锕傛煕鎼淬垻鍙�闁诡噯绻濋幃銏ゅ礂閼测晛骞愰梻浣告啞閸旀垿宕濆畝鍕櫢闁芥ê顦伴幉鎼佹煛娓氬洤娅嶇�规洖銈稿鎾偄閸濆嫬绠炲┑鐘垫暩閸嬫稑螞濡や緡娈介煫鍥ㄧ☉缂佲晛鈹戦悩宕囶暡闁绘挸绻橀弻娑㈠Ψ閹存繂鏋ゅù鐓庡暣閹鈻撻崹顔界亞缂備緡鍠楅悷锔界┍婵犲偆娼扮�癸拷婵犲喚锟藉洭姊绘担鍛婃儓婵☆偄顕幑銏犫攽閸♀晜缍庨梺鎯х箰濠�閬嶆儗濞嗘挻鐓曠憸搴ㄣ�冭箛娑欐櫢闁兼亽鍎哄▓婊堟煛鐏炶濮傜�殿喗娼欒灒闁告繂瀚闂傚倷鑳堕幊鎾剁不瀹ュ鍨傜憸鐗堝笒閻撴﹢鏌熺�电顎撻柟椋庡厴閺佹劖鎯旈垾鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栭柧蹇氼潐瀹曞鏌曟繛鍨姕闁绘縿鍨藉娲偡閺夋寧顔�闂佺懓鍤栭幏锟�?
					if(!HelpCountManage.getInstance().canAddHelpGiveItemNum(roleId)){
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴鐎殿喖鐖煎畷鐓庮潩椤撶喓褰呴梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸ャ劌娈屽銈傛櫅閵堢鐣烽妸鈺婃晣婵炴垶鐟﹂弶鍛婁繆閻愵亜锟芥牕顫忚ぐ鎺戝嚑缂備焦顭囬悷瑙勭箾閹存瑥鐏柣鎾存礋閻擃偊宕堕妸锔撅拷顓熴亜韫囨挸顏╃紒渚囧亰濮婄粯鎷呯粙娆炬闂佺顑勭欢姘暦閺囥垹钃熼柕澶涚畱娴滄姊洪崫鍕窛闁哥姴妫欑粋宥咁煥閸喓鍘甸梺閫涚祷濞呮洖鈻嶉崨瀛樼叆闁绘棁顕ц濠电偠灏欓崰搴敋閿濆洨鐭欐繛鍡樺劤閹垿姊洪幖鐐插姉闁哄懏绻堥弫宥咁煥閸啿鎷洪柣鐔哥懃鐎氼剛寰婄紒妯镐簻闁瑰瓨绻冮ˉ鐘绘煥閻旇袚闁绘棏鍓熼獮蹇涙晸閿燂拷
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166088, null);
						return false;
					}
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閻曚焦顔旈梺鍛婄缚閸庡骞忓畡鎵虫闁圭儤鎸婚悵姘節绾板纾块柡浣筋嚙閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒�顭囨径鎰拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炴帒螖娴ｉ晲鎴锋俊鐐�曠换鎰版偋婵犲洤鐓曢柟杈鹃檮閻撴瑩鏌ゅù瀣珔濞寸姵绮岄埞鎴﹀灳閻愯棄浠梺鍝勬湰濞茬喎鐣锋總鍛婂亜缂佸灏呴幏鐑藉箛椤撗勵啍闂佺粯鍔栬ぐ鍐汲閵忋倖鐓忛柛銉ｅ妼婵秵顨ラ悙鏉戞诞妤犵偛顑夐幃鈺冩嫚瑜庣�氬綊鏌ｉ幇顒佲枙婵炴挸顭烽弻鏇㈠醇濠靛浂妫炵紓浣诡殔閸婂潡寮婚敐澶婄闁绘劗鏁搁弳銈夋倵濞堝灝鏋熷┑鐐诧躬楠炲啴鍩￠崘顏嗭紲濠碘槅鍨堕弨杈╋拷姘悑缁绘繈鎮介棃娑楀摋闁诲繐娴氭禍顏堛�佸▎鎰瘈闁告洦鍠栧皬闂備胶顭堢换妤呭磻閹邦喖濮柨鐔剁矙濮婃椽妫冨☉姘辩暰濠碘剝褰冪�氫即骞婇幘璇查敜婵°倓鑳堕崢閬嶆⒑瀹曞洦鍤�闁诲繑绻堥幃姗�顢旈崼鐔哄幍濡炪倖鐗楃粙鎺椝夐崼婵冩斀闁斥晛鍟崐鎰攽閿涘嫭鐒挎い锔藉絻閳规垿顢欓懖鈺佺厽濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓姗�姊绘担鍛婂暈闁哄被鍔庨幑銏犖熸笟顖氭闂佸湱绮敮鈺呮偂閵夆晜鐓曟い鎰靛亜娴滄繈鏌￠崨顏呮珚闁诡喗顨婇悰顕�宕归鐓庮潛婵＄偑鍊х紓姘跺础閹惰棄鏄ユ繛鎴欏灩缁狅綁鏌ㄩ弮鍌涙珪闁告ê宕埞鎴︽偐缂佹ɑ閿┑鈽嗗亝椤ㄥ﹪銆侀弮鍫濈厸闁稿本眉缁ㄥ妫呴銏″婵﹤婀辨禍鎼佹晝閸屾稓鍘搁柣蹇曞仜婢ц棄煤閺夋垟鏀介柍鈺佸暞閸婃劕鈹戦垾宕囧煟鐎规洏鍔戦、姗�鎮╅闂寸病濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋鐑嗙劯婵炴垶菤閺嬪酣鏌熼幆褏锛嶆い鏂挎濮婃椽宕ㄦ繝鍕ㄦ濠电偛鍚嬮悷褏鍒掗崼銉ラ唶闁靛濡囬崢鐢电磽閸屾瑧鍔嶉柨姘辩磼濡や胶顣茬紒缁樼洴瀹曘劑顢橀妸銊ユ儓婵犳鍠栭敃锔惧垝椤栫偛绠柛娑欐綑瀹告繂鈹戦悩鎻掞拷鐟扳枔濮楋拷濮婄粯鎷呴挊澶婃優闂佸摜濮村Λ婵嗙暦閺囩喐濯撮柛鎰ㄦ櫓濡劌鈹戦敍鍕杭闁稿﹥鐗犻幃褍螖閸愵亞鐓撻梺鍦劋椤ㄥ懘鎯屽Δ鍛彄闁搞儯鍔庨埦渚�鏌ｉ幘鍗炲姦闁哄矉缍佸鎾倷鐠囇勫闁革富鍙忛幏宄邦潩閻愵剙顏�
			    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select(displayinfo.roleid);
			    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(displayinfo.roleid);
			    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
			    		MessageMgr.sendMsgNotify(roleId, 166093, null);
			    		return false;
			    	}
					
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					//tips:displayinfo闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘梻纾奸柨鐔诲Г瀵板嫰骞囬鐑囨嫹閸洘鐓熼柟鎵濞懷兠瑰鍛壕缂佺粯鐩畷銊╊敍濮橈絾鐎伴梻浣告惈婢跺洭宕滃┑鍡╁殫闁告洦鍓涚弧锟介梺绋挎湰缁牊娼诲顦廳闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︺儳绱撻崒姘毙㈤柨鏇ㄤ邯閻涱噣宕橀埡鍐炬祫闁诲函缍嗘禍婊呯玻濞戞瑧绡�闁汇垽娼у瓭闂佺锕﹂崗姗�骞嗛敓鑺ャ亜韫囨挾澧涢柍閿嬪笒闇夐柨婵嗙墛椤忕娀鏌曢崱妤嬭含闁哄本鐩獮妯硷拷闈涙憸閻ｈ偐绱撴笟鍥ф灍闁荤啿鏅犻悰顔撅拷锝庡枟閺呮繈鏌ㄩ悢鍓佺煓鐎规洘鐟╅幃鈺冪磼濡厧寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�?
					boolean ret = RoleAnYeTask.getRoleAnYeTask(roleId, displayinfo.roleid, displayinfo.uniqid, displayinfo.teamid, tips);
					if(ret) {
						psendWhileCommit(roleId, tips);
						return true;
					} else {
						psendWhileRollback(roleId, new SChatItemTips(displayinfo, new Octets()));
						return false;
					}
				}
			}.submit();
		} else {
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SChatItemTips tips = new SChatItemTips();
					tips.tips = ChatChannel.getInstance().getOctets(roleId, displayinfo);
					if (tips.tips == null)
						return false;
					tips.displayinfo = displayinfo;
					psendWhileCommit(roleId, tips);
					//gnet.link.Onlines.getInstance().send(roleId, tips);
					return true;
				}
			}.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 792445;

	public int getType() {
		return 792445;
	}

	public fire.pb.talk.DisplayInfo displayinfo;

	public CChatItemTips() {
		displayinfo = new fire.pb.talk.DisplayInfo();
	}

	public CChatItemTips(fire.pb.talk.DisplayInfo _displayinfo_) {
		this.displayinfo = _displayinfo_;
	}

	public final boolean _validator_() {
		if (!displayinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(displayinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		displayinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChatItemTips) {
			CChatItemTips _o_ = (CChatItemTips)_o1_;
			if (!displayinfo.equals(_o_.displayinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += displayinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(displayinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChatItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = displayinfo.compareTo(_o_.displayinfo);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.talk;

import fire.pb.HelpCountManage;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTransChatMessage2Serv__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTransChatMessage2Serv extends __CTransChatMessage2Serv__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if(fire.pb.talk.ChatChannel.isShutUp(roleId))
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘⒐閸ㄦ繂顫濋敃鍌涒拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁婢舵劖鏅搁柣妯哄暱娴狀參姊洪棃娑辨Т闁哄懏绮撳鎻掆攽鐎ｎ偆鍘繝銏ｆ硾濡瑥鈻嶉崨顓ф禆闁告稑鐡ㄩ埛鎴︽煕濞戞﹫鏀诲璺哄閺屾盯濡搁妶鍛ギ閻庤娲橀敃銏ゅ极閹惧顩烽悗锝庡亐閹锋椽姊婚崒姘卞濞戞挾鎳撻埥澶婎潩椤愶絽濯伴梻浣虹帛閸旓箓宕滈敃鍌氱柈闁搞儺鍓氶埛鎺楁煕鐏炴崘澹橀柨鐔烘櫕閸忔﹢骞婂Δ鍛唶闁哄洦顨愰幏鐑芥晝閸屾岸鍞堕梺缁樻磻閻掞箓顢欓弮鍫熲拺鐟滅増甯楅敍鐔兼煟閹虹偟鐣电�殿喗褰冮埞鎴﹀炊閵夈倗鐩庨梻濠庡亜濞诧箓骞愰悙顒佹珷闁哄洢鍨洪悡銏ゆ煕閹板吀绨婚柡瀣洴閺岋紕浠︾拠鎻掝潎闂佽鍠撻崹钘夌暦椤愶箑绀嬮柟瀛樼懃閻忣喚绱掓潏銊ユ诞闁轰焦鎹囬幃鎯х暆鐎ｎ偄顏堕梺鎸庣箓妤犳悂寮搁悢鍏肩厓闂佸灝顑呭ù顕�鏌＄仦鍓ф创妞ゃ垺娲熸俊鍫曞川椤斿彞绨撮梻鍌欑窔濞佳兾涘▎鎴炴殰闁圭儤顨嗙粻鎺楁⒒娴ｈ櫣甯涢柣鐔间憾楠炲繘鎮滈懞銉у幈濠电偛妫楃换鎰板汲濞嗘劑浜滄い鎰╁灮缁犺崵锟借娲﹂崑濠傜暦濠靛纾归柣鏂垮娴犫晠姊洪悷鏉挎Щ妞ゆ垵鎳橀幃楣冩倻閽樺鍊炲銈呯箰鐎氼剟鐛笟锟藉濠氬磼濮橆剨鎷锋搴ｇ焼濞撴熬鎷锋鐐差樀閺佹捇鎮╅鍡樺闁告劦鍠栧婵嬫煛婢跺鐏╅柡灞界墦濮婅櫣绮旈崱妤�顏存繛鍫熸礋閺屾稓锟斤急鍕彇闂佽法鍠撻弲顐﹀箠閹捐鎷峰鐓庡箺缂佹梻鍠撻敓鏂ょ秵閸犳牜绱掗埡浼卞綊鎮╁顔煎壉闂佺锕﹂弫濠氬蓟閵娿儮鏀介柛鈩冪懃閸ゎ剛绱撴担闈涘缂侇喗鐟╁璇测槈濡粎鍠撶槐鎺懳熼悮瀛樺闁归偊鍘介崣蹇撯攽閻樻彃鏆為柕鍥ㄧ箘閿熷�燁潐濞插繘宕濆鍥ㄥ床婵犻潧顑呯壕鍏兼叏閿濆棗顕滄繛鑼枎椤繐煤椤忓嫬绐涙繝鐢靛Т鐎氼參宕宠娣囧﹪濡堕崶顬綁鏌熼鐓庯拷鍧楀垂妤ｅ啯鏅濋柛灞炬皑閸婄偛顪冮妶鍡楅嚋闁归鍏樺娲础閻愭潙鏋犻梺鍝勭焿缁绘繂鐣烽崼鏇炵厸濞达綀顫夐惁锝夋⒒娴ｅ摜绉洪柡锟介崡鐑嗘富闁芥ê顦藉鏍煣韫囨凹娼愰柛蹇旂矒閺屾稑鈽夐崡鐐茬濠殿喛顫夐〃濠傤潖閾忓湱鐭欐繛鍡樺劤閸撹京绱撴担鍓插剱閻㈩垱顨堢划姘綇閵娧呯槇闂佹悶鍎滈崪浣剐濈紓鍌氬�烽悞锕傘�冩径濠庢禆闁靛ě鍡椥℃繝鐢靛У绾板秹鍩涢幋锔界厽闁绘梻鍘ф禍浼存煕閵堝洤鏋涢柡灞剧〒閿熸枻缍嗛崑鍡椕洪幘顔界厵妞ゆ梹鏋婚懓鍧楁煕閳哄绡�鐎规洘甯掗埢搴ㄥ箣閻樺灚姣庨梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛鏁￠崶顒夋晬婵炴垶鐟ュ鍧楁⒑閹肩偛鍔撮柛鎾村哺閹繝宕橀钘変画濠电偛妫楃换鎰邦敂閳哄懏鐓熼煫鍥ㄦ惄閸ょ喖鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閻楃娀骞冮妷锔鹃檮缂佸瀵ч悗顒勬⒑缁嬭法鐏遍柛瀣〒缁牓宕奸姀鈥虫瀾闂婎偄娲︾粙鎴澬ч幓鎹楀綊鎮℃惔锝嗘喖闂佹娊鏀辩敮锟犲蓟濞戞矮娌柛鎾楀嫬娅欓梻浣侯焾缁绘劙寮甸鍕﹂柛鏇ㄥ灱閺佸洭鏌ｉ幇鐗堟锭闁愁亞鏁婚幃妤�鈻撻崹顔界亾闂佽桨绀侀…鐑藉Υ娴ｈ倽鏃堝川椤撶媴绱叉繝鐢靛Т閿曘倝骞婇幇鏉垮偍妞ゆ牜鍋為埛鎺懨归敐鍥╂憘婵炲吋鍔欓弻娑欐償閵忕姭鏋欏銈冨灪瀹�鎼併�佸锟介崺锟芥い鎺戯攻鐎氬綊鏌涘☉娆愮稇闁活厽顨呴…璺ㄦ崉閾忕懓顣圭紓浣靛妼椤嘲顫忓ú顏勪紶闁告洦鍘搁弸鍡涙⒑缁嬫鍎忛悗姘煎幘缁骞掑Δ浣规珖闂佺鏈粙鎾诲储娴犲鈷戦悷娆忓閸斻倖銇勯弴銊ュ箹閻撱倝鏌熺紒銏犳灍闁绘挻鐩幃姗�鎮欐０婵嗘婵犳鍠栭崐鍧楀蓟閻旂⒈鏁婇柛婵嗗閹峰嘲鈹戦崱娆愭闂佸湱鍎ら崹鐔肺ｉ崼鐔稿弿婵°倧鎷锋俊顐ｆ⒒濡叉劙鏁撻敓锟�?1闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呮／闁诡垎宀�鍚嬮梺鍝勭焿缂嶄線鐛崶顒夋晩闁兼亽鍎查惁搴ㄦ⒒娴ｈ銇熼柛妯圭矙閹兘鍩￠崨顔间簵濡炪倖鍔х粻鎴︽倷婵犲洦鐓忓┑鐐戝秵瀚瑰┑鈩冨絻閻楀繒妲愰幘瀵哥懝濠电姴鍟璺衡攽閻橆喖鐏遍柛鈺傜墵瀹曟繈寮撮悩鍏哥瑝闁荤喐鐟ョ�氼喚绮绘ィ鍐╃叆婵犻潧妫濋妤�顭胯閸犳牠鍩為幋锔芥櫖闁告洦鍋勬禒妯侯渻閵堝倹娅呴柕鍫㈩焾閻ｇ兘濡搁埡濠冩櫍濠电偞鍨堕悷锕傚级閸涘﹣绻嗛柣鎰典簻閿熻姤鐗曢～蹇氥亹閹烘垵鍤戠紓鍌欑劍椤洭鎮风憴鍕闁瑰瓨鐟ラ悘顏堟煟閹惧瓨绀嬫鐐寸墬濞煎繘宕滆钃遍梻浣虹帛鐢锟界瑳鍥﹂柛鏇ㄥ灡閺呮繈鏌ㄩ悢缁橆棄闁挎洏鍨介弻鍡楊吋閸℃ɑ顏熼梻浣侯焾閿曪箓宕抽妷銉劷闁归偊鍘剧粻楣冩煕濞嗗浚妯堥柣鎺嶇矙閺屸剝绗熼崶褎鐝濆Δ鐘靛仦鐢帟鐏冮柣搴秵閸撴盯鍩ｉ妶鍡欑瘈闁汇垽娼ч埢鍫熺箾娴ｅ啿娴傞弫鍕煙閻楀牊绶查柡瀣╃窔閺屾盯寮撮妸銉ュ箥婵炲瓨绮嶇划鎾诲蓟閻旂厧绾ч柛顭戝櫘閺嗐垻绱撴担鍓叉Ц闁绘牕銈稿濠氬Χ婢跺﹦楠囬梺鍦焾妤犲憡绂掗幘顔解拺闁告繂瀚悞璺ㄧ磼鏉堛劍绀冪紒鍌涘浮閺佸倿鎮欓锟介悵浼存⒑閸︻厾甯涢悽顖楁櫊閹骞庨懞銉㈡嫽婵炶揪绲介幗婊堝几閸愨晙绻嗘い鎰╁灩椤忣參鎸婂┑鍥ヤ簻闁哄秲鍔庣粻妯好瑰锟界划娆忣潖缂佹ɑ濯寸紒瀣閸婎垳绱撴担椋庡妽闁圭鍟块锝夊箵閹哄棙顫嶅┑鐐叉閸旀洖顕ｉ崸妤佺厸濠㈣泛锕︽晶鎴︽煕閺傛寧鎹ｇ�殿啫鍥ㄦ櫢濞寸姴顑嗛埛鎴炴叏閻熺増鎼愰柣蹇撳级缁绘稒鎷呴崘鎻掝伀妞も晝鍏橀弻銊╁即閻愯鎷疯ぐ鎺撳亗婵炲棙鍨圭壕濂告倵閿濆骸浜滄い鏇熺矒閺屾盯鎮㈤崫鍕闂佸搫鐭夌换婵嗙暦閵娾晛绾ч悹鎭掑妼鐢潡姊绘担绛嬪殐闁搞劌宕灋闁告劏鏅欑换鍡涙煙闂傚顦﹂崬顖炴偡濠婂啰绠荤�殿喗鎮傞弫鎾寸鐎ｎ偀鎷婚梺绋挎湰閻熴劑宕楀畝锟界槐鎺楊敋閸涱厾浠搁梺闈涙閸熸潙鐣烽妸褝鎷峰☉娅亝绂嶆潏銊х瘈闁汇垽娼у瓭闂佸摜鍣ラ崑濠傜暦瑜版帒绫嶉柛顐ゅ枎閿熺晫鏁诲濠氬醇閻旇　妾ㄩ梺瑙勫絻閹芥粓鎯�椤忓牆绠氱憸瀣磻閵忋倖鐓欐い鏃傜摂濞堟粓鏌℃担鐟板闁诡垱妫冮崹鎯х暦閸ヨ泛鏅ョ紓鍌氬�烽懗鍫曟惞鎼淬劌鐭楅柨鐔诲Г缁绘稒寰勭�ｎ剚鍒涘┑鐙呮嫹濞撴熬鎷锋慨濠呮缁辨帒螣鐠囪尙顣叉繝鐢靛仦閹告娊寮ㄩ柆宥呯柧闁割偅娲橀弲婊堟煠閹帒鍔氱�殿喗瀵х换婵嬫偨闂堟刀銏ゆ煕閻曚礁鐏﹀┑锟犳涧閳规垿宕奸浣割伓闁荤喐鐟ョ�氼厽寰勯崟顖涚厱閻庯綆浜峰銉╂煟閿濆洤鍘撮柟顔哄灮閸犲﹥娼忛妸锔界彇闂傚倷鐒︾�笛呯矙閹寸媴鎷峰鐓庡籍鐎殿喖寮剁缓浠嬪川婵炵偓瀚介梻浣侯焾閺堫剟鎮疯钘濋柨鏇炲�归悡娆撴偣閸ュ洤鎳愰敍鐔封攽閻欏懏瀚规繛杈剧秬濞咃絿澹曢挊澶堬拷鎺戭潩椤掍焦鎮欓梺鍝勵儑閸犳牠寮婚敐澶嬪亜闁告瑥顦伴悵姘舵⒑缂佹ü绶遍柛锝忕到閻ｇ兘宕￠悙鈺傤潔濠碘槅鍨抽崢褔鏁撻悾灞戒槐婵﹥妞藉Λ鍐ㄢ槈鏉堚晛濮奸梻浣侯焾鐎涒晛顪冮挊澶屾殾闁汇垻顭堝洿婵犮垼娉涢鍌炲箯濞差亝鈷戦柛娑橈功缁犳捇鎮楀顒�妲婚崡杈╂喐閻楀牆绗氶柣鎾存礋閺屾洘绻涢崹顔煎Б缂備礁顦板浠嬪箰婵犲倵鏀介柛銉ｅ劙缁ㄥ姊洪崫鍕ォ濞存粍绻勯敓鑺ユ皑閹虫捇鍩為幋锔绘晩缁绢參鏀遍弫鎯р攽閿涘嫬浠╂俊顐㈠閹儳鐣￠柇锔藉缓闂佽法鍠曞Λ鍕偩閻戣姤鏅查柛鈩冾殘缁愮偤鏌ｆ惔顖滅У濞存粍绮嶇粩鐔奉吋婢跺鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵闁兼亽鍎抽惌鎺旓拷瑙勬礃婵炲﹥淇婇悜钘夌厸濞达絽鎽滈敓绛嬪弮濮婃椽宕滈幓鎺嶇凹濠电偛寮堕悧婊呭垝婵犳艾鍐�妞ゎ剦鍓氬Λ鍐极閹版澘宸濇い鎾跺枑椤斿姊绘担铏瑰笡閻㈩垳鍠栧畷鎴﹀箛閻楀牊娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖绮癸拷瀹犲煘闁捐崵鍋炵换娑㈠箣濞嗗繒浠奸梺绋胯閸旀垿寮婚悢鍏尖拻閻庣數顭堟俊浠嬫⒑閹惰姤鏁遍柛銊ユ健楠炲啳銇愰幒鎴犵暢闂佸湱鍎ら崹鐢糕�栭崼婵冩斀闁绘劕寮堕崳娲煕閺冿拷閻熲晛顕ｆ繝姘亜闁绘挸娴烽ˇ鈺呮⒑闂堟稓澧曟俊顐ｎ殜椤㈡棃鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣儥閸庡繑銇勯敂鐐毈鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崡鎶芥煟濡吋鏆╅柣鎺戙偢閺岋絾鎯旈婊呅ｉ梺鍝ュУ椤ㄥ﹪宕哄☉銏犵婵°倓鑳堕崢鍗烆渻閵堝棗濮傞柛濠冩礋瀵悂寮崼鐔哄帗缂備焦顨呴幖顐﹀礉閿旀拝鎷峰▓鍨灈闁绘牕銈稿畷娲晸閻樿尙锛滈梺鎸庢磻缁躲倝骞忛悜钘夌閹兼番鍨瑰鎸庣節閻㈤潧孝閻庢凹鍠氶弫顔尖槈閵忥紕鍘甸悗鐟板婢ф宕甸崶鈺嬫嫹鐟欏嫭澶勯柛瀣工閻ｇ兘鎮㈢喊杈ㄦ櫍闂佺粯娲戠粈渚�骞冪�ｎ喗鈷掗柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囩偟鐤囬梺瑙勫礃椤曆囧触瑜版帗鐓涚�广儱楠搁獮鏍磼閻欙拷閸ㄥ爼寮婚妸鈺傚亞闁稿本绋戦锟�?
		if(funtype==FunModelType.FUN_TASKITEM){
			xbean.helpcount helpcount = xtable.Helpcount.select(roleId);
	    	int max=HelpCountManage.getInstance().getHelpItemNumMax(roleId);
	    	if(helpcount!=null&&helpcount.getHelpitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleId, 166087, null);
	    		return;
	    	}
		}
		if (funtype == FunModelType.QIU_ZHU) {
			xbean.helpcount helpcount = xtable.Helpcount.select(roleId);
	    	int max=HelpCountManage.getInstance().getHelpItemNumMax(roleId);
	    	if(helpcount!=null&&helpcount.getHelpitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleId, 166087, null);
	    		return;
	    	}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌″畝锟介崰鏍嵁閸℃稑绾ч柛鐔峰暞閹瑰洭寮诲☉娆戠瘈闁稿本绋戞禒鎾⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊箻椤曞懏鏅滈梺鍛婁緱閸欏孩瀵奸幘鏂ユ斀闁挎稑瀚禍濂告煕婵炲灝锟芥繂鐣烽姀锛勯檮闁告稑锕ら敓鍊熷煐缁绘繈妫冨☉鍐插婵炲瓨绮堢划娆忣潖缂佹ɑ濯寸紒瀣閸婎垳绱撴担椋庡妽闁圭鍟块锝夊箵閹哄棙鏂�闁诲函绲芥绋棵洪鈧拷浣糕槈閵忊�筹拷鐑芥煛婢跺鐓�闁归鍏樺畷褰掝敃椤愶綆鍟嶉梻浣虹帛閸旀浜稿▎鎰浄闁靛繈鍊栭悡鏇㈡煛閸愭寧瀚圭紒鐐緲缁夎淇婇悽绋跨妞ゆ牗绋掑▍鍡涙⒑閸撹尙鍘涢柛鐘崇墱缁﹪顢氶敓浠嬪箖濡ゅ啯鍠嗛柛鏇ㄥ墰椤︺劑姊洪幖鐐插闁轰礁顭峰畷娲倷閸濆嫮顓洪梺缁樼懃閹冲繒锟芥艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂懎浠遍柡灞剧☉铻ｇ紓浣姑壕鎶芥⒑閸濆嫬顦柛鎾寸箓椤曘儵宕熼婵囧媰闂佺懓鐡ㄧ敮妤呭礋閸愩劉鏀介柣姗嗗枛閻忣噣鏌熼搹顐ｅ碍閾荤偞绻涢幋娆忕仼缂佺媭鍨堕幃宄扳枎韫囨搩浠煎銈嗘礋娴滃爼骞冨Δ锟介埥澶娾枎濡厧濮洪梻浣告啞閿曘垺绂嶇捄渚綎闁惧繐婀辩壕鍏间繆椤栨繂鍚规い锔哄劦濮婅櫣绮欓崠鈥充紣濠电媴鎷烽梺顒�绉甸弲鎼佹煠閹帒鍔ュ瑙勵焽缁辨挸顓奸崪鍐ㄤ紣濡炪値鍋勭换鎴犳崲濠靛棭娼╂い鎺戝亰缁卞弶绻濋悽闈涗粶婵☆偅鐟╁畷纭呫亹閹烘挸浠掗梺闈涚箳婵參寮ㄦ禒瀣厽闁归偊鍨辩涵鐐亜閵夈儳肖闁跨喎锟界噥娼愭繛鍙夌矒瀵偅绻濆鍗炵ウ闂婎偄娲﹂崫搴㈢瑜版帗鐓欓柣鎴炆戠亸顓灻瑰鍕煉婵﹨娅ｇ槐鎺懳熺拠鑼暡婵犵數鍋涢顓㈠礂濡寧顥ゆ俊鐐�栧ú鈺呭箯闁垮鍙忓┑鐘叉噺椤忕姵绻涢幋鐘虫毈鐎规洏鍔戦、娆撳礂婵傚憡鏆橀梻鍌欐祰瀹曞灚鎱ㄩ悽绋跨婵°倕鎳庣粣妤呮煛瀹ュ骸骞栭柡瀣╃窔閺岀喖宕滆鐢盯鎮楅悽闈浶㈡い顓℃硶閹瑰嫭绗熼婊冨綃闂備礁缍婇ˉ鎾诲礂濡櫣鏆︾憸鐗堝俯閺佸﹪鏌ｉ幇闈涘妞ゆ梹娲栭埞鎴︽偐缂佹ɑ閿梺绋匡工椤兘鍨鹃敃鍌氶唶闁靛鍎抽、鍛存⒑鐟欏嫬鍔跺┑顔哄�濋幃锟犳偄閸忚偐鍘搁梺绋挎湰缁嬫垿顢氬鍫熺厵妞ゆ牗姘ㄦ晶鏇㈡煃鐟欏嫬鐏存い銏＄懇閹崇偤濡烽妷顖涘闁归偊鍘介崣蹇撯攽閻樻彃顏悽顖涚洴閺岀喎鐣￠悧鍫濇缂備緡鍠氶弫鎼佹晸閺傘倗绉甸柛瀣缁棃鎮滈懞銉у幗闁瑰吋鐣崐銈咁焽閹邦厾绠鹃柛娆忣檧閼板潡鏌嶉妷顖滅暤鐎规洖鐖兼俊姝岊檨婵炲弶鎮傚楦裤亹閹烘搫绱电紓浣筋啇缁绘繂顕ｉ锕�纾奸柣鎰嚟閸樺崬顪冮妶鍡楀Ё缂佽尪娉曠划濠氬箻缂佹鍘遍柣搴秵娴滅偛鐡俊鐐�ゆ禍婊堝疮鐎涙ü绻嗛柛顐ｆ礀楠炪垺淇婇妶鍛殶闁瑰啿妫濆铏规嫚閹绘帩鍔夐梺鍛婂灥缂嶅﹤鐣烽敐澶婄妞ゆ棁鍋愰悾娲⒑鐠恒劌鏋斿┑顔芥尦瀹曪繝骞庨懞銉у幗闂佸搫鍟ú锕傤敂閻樼偨浜滈柡鍐挎嫹婵炶尙鍠庨～蹇涙惞閻熸澘顕ч梺鍝勬川閸嬫盯鍩涙径鎰拺闁圭姘︽竟姗�鏌嶇憴鍕伌妞ゃ垺鐟╁畷妤呮偂鎼淬垻浜烽梻鍌欑閹碱偊鎯屾径宀�绀婇柨鐔烘櫕缁辨帡鎮╁畷鍥ワ拷鎺楁煥閻斿憡鐏紓宥呮缁傚秴顭ㄩ崟顒�寮块梺闈涚箞閸ㄨ崵澹曢挊澹濆綊鏁愰崟顓犵厯闂佸憡绻冨浠嬪箖娴犲鏁嶆俊銈咁儐鐎氬綊鏌熸０浣侯槮婵炲牄鍔岄—鍐Χ閸℃鈹涢梺鍦厴椤ユ捇鏁撻崐鐕佹綈婵炲弶顭囬弫顕�骞掑Δ瀣◤濠电娀娼ч鎰板极閸℃稒鐓ラ柣鏃傚劋濞呮洜绱掗纰辩吋闁轰焦鍔栧鍕拷锛卞嫬顏烘繝鐢靛仩閹活亞寰婇崸妤佸仱闁哄啫鐗嗛崥褰掓煕閹伴潧鏋熼柣鎾存礋閺屾洘绻涢崹顕嗘嫹閺囩偟鏆ら柛鈩冪懕閹烽鎲撮崟顒�顦╅梺鎼炲姀濞夋盯顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹﹩鐒炬繛鍛礋椤㈡瑩寮撮姀鈾�鎷绘繛杈剧秬濞咃絿鏁☉娆愬弿濠电姴鍋嗛悡濂告煕閳哄倻娲寸�规洖銈告俊鐑藉Ψ閿旀拝鎷烽鍕拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節瀵挳鎮㈤搹璇″晭闂備胶鎳撻悺銊ф崲閸岀偞鍤嬮悷娆忓濞堜粙鏌ｉ幇顒夊殶濠⒀嗕含缁辨帗娼忛妸銉﹁癁婵犵鍓濋幃鍌炲极閹版澘宸濇い鎾跺�弴鐔虹瘈婵炲牆鐏濋弸娑㈡煥閺囶亜顩柛鎺撳浮椤㈡盯鎮欓懠顒夊數闂備礁鎲＄粙鎺戭焽濞嗗浚鍟呮繝闈涙閺�浠嬫煟濡绲婚柨鐔烘櫕閹虫捇鍩㈤幘鎰佹建闁跨喕妫勯～蹇曠磼濡顎撻梺鍛婄☉閿曘儵宕曢幘缁樷拺婵炶尪顕ч獮鏍ㄣ亜閿曞倷鎲炬鐐村灴婵拷闁绘﹩鍋呴弬锟介梻浣虹《閸撴繈鎮烽敃锟介埢鎾诲箚瑜夐弨浠嬫煟濡鍤嬬�规悶鍎甸弻娑㈡偄閸濆嫧鏋呴悗娈垮枔閸斿秶绮嬮幒鏃撴嫹閿濆骸浜滈柨鐔烘櫕閺佸寮婚妸銉㈡斀闁糕剝渚楅敓鑺ヮ殔闇夋繝濠傚閻帡鏌＄仦鍓ф创妤犵偞顭囬幉鎾礋椤撶偞閿紓鍌氬�烽懗鍓佸垝椤栫偞鍎庢い鏍ㄥ嚬閸ゆ洟鏌涢锝嗙缂佺媴绲剧换婵嬫濞戞瑦鎮欓梺璺ㄥ枔閻℃棃宕规导鏉戠厴闁硅揪闄勯崐鐑芥煙缂佹ê绗氶柛濠庡灦濮婃椽鎳￠妶鍛畬闂佸憡渚楅崢濂告倶婵犲洦鈷戦柛鎾村絻娴滅偤鏌涢悩鍙夋崳婵炲棎鍨介幃娆撴倻濡厧骞嶉梻鍌欑贰閸欏繒绮婚幋锔惧祦婵鎷烽柡灞剧☉铻ｇ紓浣姑壕鍐测攽椤旂》榫氭繛鍜冪悼濡叉劙骞掗幊宕囧枛瀹曞綊顢氶崨顕呮（闂傚倸鍊风粈渚�顢樻禒瀣骇闁割煈鍣悗鐑芥⒒娴ｈ姤纭堕柛鐘虫礃閹便劑濡堕崱娆屾敵濠电偛妯婃禍椋庣礊閺嵮岀唵閻犺櫣鍎ゅ﹢鎵拷瑙勬礀瀵墎鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑閸濆嫭鍣洪柣鎿勭節瀵鈽夊Ο閿嬵潔闂佸憡顨堥崑鐐烘倶瀹ュ鈷戦悹鍥ｏ拷铏亶闂佽崵鍟块弲娑綖韫囨拋娲敂閸曨収鍞堕梺鐟板悑閻ｎ亪宕硅ぐ鎹ゅ洭鍩￠崒婊咁啎闁诲孩绋掗…鍥儗閵堝悿鐟邦煥鎼存繈鍋楀Δ鐘靛仜閸燁垳锟介潧銈搁獮鏍敇閻斿憡鐝ㄩ梻鍌欐祰濞夋洟宕板鍥у灊婵炲棗娴氶崵鏇熴亜閹板墎鐣辩紒鐘哄吹缁辨挻鎷呴懖鈩冨灥閳诲秹濮�閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?
			new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					xbean.RoleRecourse roleRec = xtable.Rolerecourse.get(roleId);
					if (roleRec == null) {
						roleRec = xbean.Pod.newRoleRecourse();
						xtable.Rolerecourse.insert(roleId, roleRec);
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽閸♀晛娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊﹀弿婵妫楅獮妤呮煟濠靛洦鈷掔紒杈ㄦ尰閹峰懘鎮剧仦鐣屽闂備胶顭堥敃銉ッ哄┑瀣�堕柛鎰靛枟閳锋垿鏌熺粙鎸庢崳缂佺姵鎹囬弻鐔煎礃閺屻儱寮伴悗娈垮枟婵炲﹪骞冨▎鎾村�绘俊顖滃帶楠炲牆鈹戦悩鍨毄濠殿喗娼欑叅闁挎洩鎷烽柍钘夘槼椤﹁淇婇锛勫妽鐎垫澘瀚伴獮鍥敇閻樻彃绠哄┑鐘殿暯濡插懘宕归幎钘夌？闁靛牆顦悡婵嬫煛閸ャ儱鐏柣鎾存礋楠炴牗娼忛崜褏锛熺紓浣哄Т绾绢厾妲愰幒鎾寸秶闁靛鍎茬拠鐐烘⒑鏉炴壆鍔嶉柟姝屽吹缁骞掗弮鎾村闁挎繂绨肩花鑺ャ亜閿旇姤绶叉い顏勫暣婵″爼宕卞Ο鐑樻濠电姵顔栭崰姘跺礂濮楋拷瀵偄顓奸崪浣哄弳闂佸壊鍋嗛崯鍧楀箯濞差亝鈷掗柛灞炬皑婢ф稑銆掑顓ф疁闁诡喚鍋為妶锝夊礃閳哄啫骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺戠厺闁哄洨鍋愰弨浠嬫煃閳轰礁鏆炵紓宥嗗灦閵囧嫰顢曢姀銏㈩啋缂佲剝鎹囬弻锝夘敂閸曨厸鏀�
					xbean.TaskRecourse taskRec = roleRec.getRecoursetask().get(taskid);
					if (taskRec == null) {
						taskRec = xbean.Pod.newTaskRecourse();
						roleRec.getRecoursetask().put(taskid, taskRec);
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻濠氭煛娴ｈ宕岄柟宕囧仱婵＄柉顦柡瀣濮婃椽宕崟顒�娅ょ紓浣筋嚙鐎氭澘鐣峰璺虹闁瑰瓨姊归悗濠氭⒑鐟欏嫬鍔ょ痪缁㈠弮椤㈡瑦绻濋崒妤佹杸闁圭儤濞婂畷鎰板箻缂佹ê锟藉潡鏌ㄩ弴顏呭闂佸疇顕х粔鐟邦嚕椤曪拷瀹曞ジ鎮㈤崣澶婎伜闂傚倷鑳堕…鍫ュ嫉椤掑嫭鍋￠柕濞炬櫅缁�鍌炴倶閻愭澘瀚庡ù婊勭矋閵囧嫰骞樼捄杞版埛婵犫拃宥夋闁靛洤瀚版慨锟介柨娑樺閳峰矂鎮楃憴鍕８闁告梹鍨块妴浣糕槈濮楀棛鍙嗛梺鍛婁緱閸ㄦ壆鏁鍕拻闁稿本鐟ч崝宥夋煟椤忓嫮绉虹�规洝顫夌换婵嗩潩椤掍胶锟筋剟姊鸿ぐ鎺擄紵闁绘帪绠撳畷鏇炍旀担鐟板伎濠碘槅鍨伴悘婵嬫偂閹扮増鐓冮梺鍨儏閻忥箓鏌曢崶褍顏鐐村浮閹瑩寮堕幋顓濈处缂傚倸鍊搁崐椋庣矆娓氾拷钘濆ù鍏兼綑缁犱即鏌熼幆鐗堫棄缂佺姵鐗犻弻锝夊箛椤栵絾鈷栧┑鐐叉▕娴滃爼寮崒鐐寸厱婵炴垵宕悘鐘愁殽閻愯尙澧︽慨濠勭帛閹峰懐绮电�ｎ偆绉锋繝鐢靛О閸ㄦ椽鏁冮姀銈呯疇闁绘梻鈷堥弫宥夋煟閹邦垰鐨洪柣銈呮喘濮婅櫣鎲撮崟顒傚嚒闂佸憡鐟﹂幑鍥х暦閸洦鏁嗗ù锝堫潐椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
					if (!taskRec.getChannellist().contains(Integer.valueOf(messagetype))) {
						taskRec.getChannellist().add(messagetype);
					}
					
					return true;
				}
			}.submit();
		}
		
		boolean flag=ChatChannel.getInstance().process(roleId, messagetype, message, checkshiedmessage, displayinfos, 0);
		if(flag==true&&(funtype==FunModelType.FUN_DIELIVE_CLAN||funtype==FunModelType.FUN_DIELIVE_WORLD)){
			MessageMgr.sendMsgNotify(roleId, 162127, null);
		}
		if(flag == true && funtype == FunModelType.QIU_ZHU) {
			SChatHelpResult snd = new SChatHelpResult();
			snd.result = 0;
			gnet.link.Onlines.getInstance().send(roleId, snd);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 792433;

	public int getType() {
		return 792433;
	}

	public int messagetype; // 消息频道 MsgTye中所定义的部分
	public java.lang.String message; // 内容
	public java.lang.String checkshiedmessage; // 检测屏蔽字的纯文本
	public java.util.ArrayList<fire.pb.talk.DisplayInfo> displayinfos; // 显示道具、宠物、技能
	public int funtype; // 功能类型  类型编号对应FunModelType
	public int taskid; // 任务id

	public CTransChatMessage2Serv() {
		message = "";
		checkshiedmessage = "";
		displayinfos = new java.util.ArrayList<fire.pb.talk.DisplayInfo>();
	}

	public CTransChatMessage2Serv(int _messagetype_, java.lang.String _message_, java.lang.String _checkshiedmessage_, java.util.ArrayList<fire.pb.talk.DisplayInfo> _displayinfos_, int _funtype_, int _taskid_) {
		this.messagetype = _messagetype_;
		this.message = _message_;
		this.checkshiedmessage = _checkshiedmessage_;
		this.displayinfos = _displayinfos_;
		this.funtype = _funtype_;
		this.taskid = _taskid_;
	}

	public final boolean _validator_() {
		for (fire.pb.talk.DisplayInfo _v_ : displayinfos)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(messagetype);
		_os_.marshal(message, "UTF-16LE");
		_os_.marshal(checkshiedmessage, "UTF-16LE");
		_os_.compact_uint32(displayinfos.size());
		for (fire.pb.talk.DisplayInfo _v_ : displayinfos) {
			_os_.marshal(_v_);
		}
		_os_.marshal(funtype);
		_os_.marshal(taskid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		messagetype = _os_.unmarshal_int();
		message = _os_.unmarshal_String("UTF-16LE");
		checkshiedmessage = _os_.unmarshal_String("UTF-16LE");
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.talk.DisplayInfo _v_ = new fire.pb.talk.DisplayInfo();
			_v_.unmarshal(_os_);
			displayinfos.add(_v_);
		}
		funtype = _os_.unmarshal_int();
		taskid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTransChatMessage2Serv) {
			CTransChatMessage2Serv _o_ = (CTransChatMessage2Serv)_o1_;
			if (messagetype != _o_.messagetype) return false;
			if (!message.equals(_o_.message)) return false;
			if (!checkshiedmessage.equals(_o_.checkshiedmessage)) return false;
			if (!displayinfos.equals(_o_.displayinfos)) return false;
			if (funtype != _o_.funtype) return false;
			if (taskid != _o_.taskid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += messagetype;
		_h_ += message.hashCode();
		_h_ += checkshiedmessage.hashCode();
		_h_ += displayinfos.hashCode();
		_h_ += funtype;
		_h_ += taskid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(messagetype).append(",");
		_sb_.append("T").append(message.length()).append(",");
		_sb_.append("T").append(checkshiedmessage.length()).append(",");
		_sb_.append(displayinfos).append(",");
		_sb_.append(funtype).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


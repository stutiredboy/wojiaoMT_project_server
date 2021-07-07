
package fire.msp.move;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyMapPetInfo__ extends mkio.Protocol { }

/** GS 向 地图模块 发送消息， 通知展示宠物的信息, 并通知周围玩家
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyMapPetInfo extends __GNotifyMapPetInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null) return;
		if(null == role.getScene()) return;
		if (showpetinfo.petid != 0){
			final fire.pb.scene.movable.ScenePet showpet = 
				fire.pb.scene.movable.God.createPet(showpetinfo.petkey, showpetinfo.petname, showpetinfo.petid,  showpetinfo.color, showpetinfo.bodysize,showpetinfo.showeffect);
			
			if(showpet.checkAllTheSame(role.getShowPet()))
				return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢崘宸劷闁跨喓濮撮拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍐╃彇闂佸憡姊归幃鍌氼潖閸濆嫅褔宕惰閹峰嘲螖閸涱厾锛涢梺瑙勫礃閸╂牕鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺冪磼閻欏懐绋荤紒缁樼洴瀹曞崬螖閸愵亶鍞哄┑鐐差嚟婵箖宕戦幇顔筋潟闁规儳鐡ㄦ刊鎾煕濠靛棗鐝旈柕澶嗘櫆閻撴洟骞栫�涙鈽夐柨鐔诲Г椤ㄥ﹪鐛幋锕�顫呴柣姗嗗亝閺傦拷闂備焦鎮堕崕顕�寮插┑瀣剨闁割偁鍎查埛鎴犵磼鐎ｎ偄顕滄繝锟介幍顔剧＜妞ゆ棁鍋愰悞鍝ユ崉椤栫偞鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍕笡闁瑰嘲鎳忕粭鐔碱敍濠婂啫歇濠碉紕鍋戦崐鏍垂閻㈢鐤柡澶嬪灩閺嗭箓鏌熼柇锕�鍘撮柡锟芥禒瀣�甸柨婵嗙凹濞寸兘鏌熼懞銉︾婵﹨娅ｇ槐鎺懳熼懡銈呭汲闂備胶顢婇婊呮閺囩姵顫曢柣鎰惈閻愬﹥銇勯幒宥堝厡闁告﹢浜跺娲捶椤撶偘澹曞銈冨妼閹虫﹢鐛繝鍛杸闁圭虎鍨遍悘渚�姊洪崨濠勭細闁稿骸纾竟鏇熺鐎ｎ偆鍘遍柣蹇曞仜婢т粙骞婇崨顖滅＜婵炴垶顭囩粻濠氭煛瀹�锟介崰鎰八囬悧鍫熷劅闁炽儱鍟跨粻锝夋⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涢悙鍙夋К闂佸憡娲﹂崹鎵矆閸愵喗鐓曢柟鐐殔閸燁偅顨欑紓鍌氬�搁崐鎼佸磹閻戣姤鍤勯柤鍝ユ暩缁犻箖鏌ㄩ悢鐑樻珪缂佽鲸甯￠幃鈺佺暦閸パ�鎷伴柣搴㈩問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷椤ㄥ﹤鐣烽幋锕�绠荤紓浣姑禒濂告⒑缂佹ê鐏卞┑顔哄�濋崺娑㈠箣閿旂晫鍘遍梺鎸庢椤曆囩嵁濡や降浜滈煫鍥ㄦ礀閺嬫梻绱掓潏銊﹀碍妞ゆ挸銈稿畷鐔碱敇閻橀潧搴婇梺璇插椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐎梺褰掑亰閸樿偐娆㈤悙鐑樺�甸柨婵嗙凹缁ㄩ绱掗妸銉吋婵﹦绮幏鍛村川婵犲倹娈樼紓鍌欑閹碱偄顭囬垾宕囨殾闁哄洢鍨圭粻顕�鏌ら幁鎺戝姎濞寸娀绠栧娲川婵犲啫顦╅梺鎼炲姂娴滃爼宕哄☉銏犵闁挎梻鏅崢鍗炩攽閻樼粯娑ф俊顐ｎ殜椤㈡棃顢曢敂鐣屽幗闂佸湱鍎ゅú妯兼兜閸撲胶纾奸弶鍫涘妼缁椦呯磼鏉堛劌绗掗摶锝夋煠濞村娅囬柡鍡愬�濆缁樻媴妞嬪簼瑕嗙紓浣瑰絻濞尖�崇暦濡わ拷椤粓鏁撴禒瀣仒妞ゆ洩鎷风�规洖宕埥澶娾枎閹存繂楔闂傚倷鐒︾�笛囧蓟閵娿劊浜归柕濞炬櫓閺佸棝鏌涢弴銊ュ幋闁归绮换娑欐綇閸撗冨煂闂佺顕滅槐鏇㈠箯瑜版帗鏅搁柣妯虹－閸樻悂姊洪崨濠勭焼缂侊拷娴ｅ湱顩叉繝闈涚墢绾捐偐绱撴担璇＄劷婵炲弶鎸抽弻鈩冩媴鐟欏嫬闉嶇紓浣稿�圭敮鐐烘晸閺傘倗绉甸柛瀣瀹曘垽骞栨担鍦幗闂婎偄娲﹀ú鏍ㄧ鏉堛劎绠鹃柣鎾冲瘨閻撳吋顨ラ悙鑼闁伙綇绻濋獮宥夘敊閼恒儺鍟庨梻鍌欑劍閹爼宕曢鐐茬鐎广儱顦伴崑鈺呮煟閹达絽袚闁抽攱鍨块幃褰掑炊閵娿儳绁烽梺鎼炲�涙禍顒傛閹炬剚鍚嬮柛娑卞櫘濡箓鎮楃憴鍕闁搞劌鐏濋悾鐑芥偄绾拌鲸鏅梺鎸庣箓濡瑥鈻嶉崱娑欌拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�
			role.setShowPet(showpet);
		}else{
			if(role.getShowPet() == null)
				return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢崘宸劷闁跨喓濮撮拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍐╃彇闂佸憡姊归幃鍌氼潖閸濆嫅褔宕惰閹峰嘲螖閸涱厾锛涢梺瑙勫礃閸╂牕鐣烽崣澶岀闁瑰瓨鐟ラ悘鈺冪磼閻欏懐绋荤紒缁樼洴瀹曞崬螖閸愵亶鍞哄┑鐐差嚟婵箖宕戦幇顔筋潟闁规儳鐡ㄦ刊鎾煕濠靛棗鐝旈柕澶嗘櫆閻撴洟骞栫�涙鈽夐柨鐔诲Г椤ㄥ﹪鐛幋锕�顫呴柣姗嗗亝閺傦拷闂備焦鎮堕崕顕�寮插┑瀣剨闁割偁鍎查埛鎴犵磼鐎ｎ偄顕滄繝锟介幍顔剧＜妞ゆ棁鍋愰悞鍝ユ崉椤栫偞鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍕笡闁瑰嘲鎳忕粭鐔碱敍濠婂啫歇濠碉紕鍋戦崐鏍垂閻㈢鐤柡澶嬪灩閺嗭箓鏌熼柇锕�鍘撮柡锟芥禒瀣�甸柨婵嗙凹濞寸兘鏌熼懞銉︾婵﹨娅ｇ槐鎺懳熼懡銈呭汲闂備胶顢婇婊呮閺囩姵顫曢柣鎰惈閻愬﹥銇勯幒宥堝厡闁告﹢浜跺娲捶椤撶偘澹曞銈冨妼閹虫﹢鐛繝鍛杸闁圭虎鍨遍悘渚�姊洪崨濠勭細闁稿骸纾竟鏇熺鐎ｎ偆鍘遍柣蹇曞仜婢т粙骞婇崨顖滅＜婵炴垶顭囩粻濠氭煛瀹�锟介崰鎰八囬悧鍫熷劅闁炽儱鍟跨粻锝夋⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涢悙鍙夋К闂佸憡娲﹂崹鎵矆閸愵喗鐓曢柟鐐殔閸燁偅顨欑紓鍌氬�搁崐鎼佸磹閻戣姤鍤勯柤鍝ユ暩缁犻箖鏌ㄩ悢鐑樻珪缂佽鲸甯￠幃鈺佺暦閸パ�鎷伴柣搴㈩問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷椤ㄥ﹤鐣烽幋锕�绠荤紓浣姑禒濂告⒑缂佹ê鐏卞┑顔哄�濋崺娑㈠箣閿旂晫鍘遍梺鎸庢椤曆囩嵁濡や降浜滈煫鍥ㄦ礀閺嬫梻绱掓潏銊﹀碍妞ゆ挸銈稿畷鐔碱敇閻橀潧搴婇梺璇插椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐎梺褰掑亰閸樿偐娆㈤悙鐑樺�甸柨婵嗙凹缁ㄩ绱掗妸銉吋婵﹦绮幏鍛村川婵犲倹娈樼紓鍌欑閹碱偄顭囬垾宕囨殾闁哄洢鍨圭粻顕�鏌ら幁鎺戝姎濞寸娀绠栧娲川婵犲啫顦╅梺鎼炲姂娴滃爼宕哄☉銏犵闁挎梻鏅崢鍗炩攽閻樼粯娑ф俊顐ｎ殜椤㈡棃顢曢敂鐣屽幗闂佸湱鍎ゅú妯兼兜閸撲胶纾奸弶鍫涘妼缁椦呯磼鏉堛劌绗掗摶锝夋煠濞村娅囬柡鍡愬�濆缁樻媴妞嬪簼瑕嗙紓浣瑰絻濞尖�崇暦濡わ拷椤粓鏁撴禒瀣仒妞ゆ洩鎷风�规洖宕埥澶娾枎閹存繂楔闂傚倷鐒︾�笛囧蓟閵娿劊浜归柕濞炬櫓閺佸棝鏌涢弴銊ュ幋闁归绮换娑欐綇閸撗冨煂闂佺顕滅槐鏇㈠箯瑜版帗鏅搁柣妯虹－閸樻悂姊洪崨濠勭焼缂侊拷娴ｅ湱顩叉繝闈涚墢绾捐偐绱撴担璇＄劷婵炲弶鎸抽弻鈩冩媴鐟欏嫬闉嶇紓浣稿�圭敮鐐烘晸閺傘倗绉甸柛瀣瀹曘垽骞栨担鍦幗闂婎偄娲﹀ú鏍ㄧ鏉堛劎绠鹃柣鎾冲瘨閻撳吋顨ラ悙鑼闁伙綇绻濋獮宥夘敊閼恒儺鍟庨梻鍌欑劍閹爼宕曢鐐茬鐎广儱顦伴崑鈺呮煟閹达絽袚闁抽攱鍨块幃褰掑炊閵娿儳绁烽梺鎼炲�涙禍顒傛閹炬剚鍚嬮柛娑卞櫘濡箓鎮楃憴鍕闁搞劌鐏濋悾鐑芥偄绾拌鲸鏅梺鎸庣箓濡瑥鈻嶉崱娑欌拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�
			role.setShowPet(null);
		}
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢妶鍥╃＝濞撴艾锕ョ�氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯夸含绾捐棄霉閿濆牊顏犻悽顖涚洴閺岋綁鍩℃繝鍌滀哗闂佷紮绲块崗姗�銆侀弮鍫濋唶婵犻潧鐗滃Σ鐗堜繆閻愵亜锟芥洜鎹㈤幇鏉胯摕濠电姴鍋嗛悡銉╂煕椤愩倕鏆遍柟鐤缁辨帞绱掗姀鐘茬闂佺懓鍟跨换姗�骞冮悽鍓叉晜闁糕剝鐟ч敍婊冾渻閵堝棙顥嗗┑顔哄�楁禍鎼侇敇閵忥紕鍘介梺鎸庣箓椤︿即寮潏鈺冪＜闁惧繗顫夊▍鏇犵磼椤旂晫鎳囩�规洖缍婇、娆撴嚃閳瑰灝浠忛梻鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍仜閽冪喖鏌曟繛鐐珔缂佺姾顫夐妵鍕箛鐠轰警娲悗瑙勬尫缁舵岸寮诲☉銏╂晝闁靛牆鎳忛悘浣虹磽娴ｅ弶顫夐柟椋庡厴濮婄粯鎷呴崷顓熻弴闂佹悶鍔忓Λ鍕�﹂崶顏嶆Ъ缂備礁鍊圭敮锟犲极閸愵喖纾兼繛鎴炶壘楠炲牓姊绘笟锟藉褔鈥﹂崼銉ョ？闁规儼妫勯弰銉╂煥濠靛棭妲归柣鎾寸懄閵囧嫰寮拠鎻掝瀳濠电偛鐪伴崐婵嗙暦閿熺姴绠柤鎭掑劤閸樹粙姊洪崫鍕拷鎼佹倶濠靛锟藉倸鐣烽崶鈺冿紲闂佺粯锚閸熷潡宕悜妯诲弿濠电姴鎳忛鐘电磼椤旂晫鎳呴柟鐟板婵℃瓕顧侀柛鐔风墦濮婄粯鎷呮笟顖滃姼濡炪倖鍨靛Λ婵嗙暦濠靛柈鏃堝礃閵娿儳浜扮紓鍌氬�烽悞锕佸綘闂佺顑呴幊姗�寮诲☉銏犵疀闁靛闄勯悵鏍⒑閸涘鐒介柡浣告憸濡叉劙骞樼拠鑼紲濠电偛妫欓崹鍨繆娴犲鈷戦柟绋垮閻ㄦ垹绱掓潏銊ョ瑨閾绘牕霉閿濆浂鐒鹃柟鐣屾暬濮婃椽宕崟顒佹嫳缂備礁顑嗛幑鍥极閹捐妫橀柕鍫濇川閵堢兘姊洪崨濠冪叆闁活厼鍊搁悾宄扳攽鐎ｎ偅娅囬梺绋挎湰缁嬫捇宕㈤幖浣瑰�甸柣褍鎲＄�氬綊姊虹捄銊ユ瀺缂侇喗鐟ラ悾閿嬪閺夋垵鍞ㄥ銈嗘尰缁綁骞忛柨瀣缂侇垱娲橀悗濠氭⒑閸︻厼浜炬繛鍏肩懇閹倿宕熼鍌滅槇闂侀潧楠忕徊鍓ф兜閻愵兛绻嗘い鎰剁悼閹冲洭鏌熼鏂よ�跨�规洖宕埥澶娾枎鐏炴儳顏烘繝鐢靛仩閹活亞绱為敓鑺ョ箾閸滃啰绉┑鈥崇摠缁绘繈宕堕妸褍骞愰梻浣侯焾閺堫剟鎮疯缁綁寮崒锔藉閻熸瑥瀚粈鍐磼椤旇偐鐒搁柛鈺冨仱楠炲鏁冮敓浠嬫煁閸ヮ剚鐓忛煫鍥ь儏閻忣噣鏌￠崱鎰姦婵﹦绮幏鍛存惞閻熸壆顐兼繝娈垮枛閿曘倝鈥﹀畡鎵殾闁靛骏缍嗗Ο鍕⒑鐠団�虫灍闁荤噦濡囬幑銏犫攽鐎ｎ亞顦板銈嗗釜閹风兘鏌＄�ｎ偄鐏撮柡宀�鍠栭幊鏍煛閸曞﹤顦版穱濠囨偑濞嗗繑鎼愰柛鎴犲Х閿熻棄绠嶉崕閬嵥囨导瀛樺亗闁靛鏅滈悡鐔兼煛閸モ晛浠滈柨鐔绘濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹
		final fire.pb.pet.SShowPetAround send = new fire.pb.pet.SShowPetAround();
		send.roleid = roleid;
		send.showpetid = showpetinfo.petid;
		send.showpetkey = (int)showpetinfo.petkey;
		send.showpetname = showpetinfo.petname;
		send.colour = (byte)showpetinfo.color;
		send.size = (byte)showpetinfo.bodysize;
		send.showeffect = (byte)showpetinfo.showeffect;
		role.sendWhoSeeMeAndMe(send);	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724906;

	public int getType() {
		return 724906;
	}

	public long roleid;
	public fire.msp.showpetinfo showpetinfo;

	public GNotifyMapPetInfo() {
		showpetinfo = new fire.msp.showpetinfo();
	}

	public GNotifyMapPetInfo(long _roleid_, fire.msp.showpetinfo _showpetinfo_) {
		this.roleid = _roleid_;
		this.showpetinfo = _showpetinfo_;
	}

	public final boolean _validator_() {
		if (roleid <= 0) return false;
		if (!showpetinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(showpetinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		showpetinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyMapPetInfo) {
			GNotifyMapPetInfo _o_ = (GNotifyMapPetInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!showpetinfo.equals(_o_.showpetinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += showpetinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(showpetinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


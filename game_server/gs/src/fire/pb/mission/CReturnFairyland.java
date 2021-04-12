
package fire.pb.mission;


import fire.pb.map.MapConfig;
import fire.pb.mission.fairyland.FairylandMgr;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReturnFairyland__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReturnFairyland extends __CReturnFairyland__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸妞ゎ偄鎳橀弻宥夊Ψ閵夈儲姣愮紓浣靛妸閸庨潧顫忕紒妯诲缂佹稑顑嗙紞鍫熺節閵忋垺鍤�婵☆偅鐟╁鑼崉娴ｆ洘妫冨畷銊╊敇閻欏懐骞㈤梻浣筋嚙閸戠晫绱為崱妯碱洸闁哄稁鍘肩紒鈺伱归悩宸剱闁绘挾鍠愭穱濠囶敍濮橆厽鍎撶紓浣哄珡閸愬墽鍞甸柣鐘叉惈閹碱偊顢旈銏＄厸閻忕偛澧介妴鎺楁煥閻斿憡鐏紓宥呮缁傚秹宕奸弴鐐碉紵闂佸搫鍟悧濠囨偂濞戞熬鎷烽惂鍛婂闂佽法鍠嶇划娆忕暦娴兼潙绠婚柤鍛婎問濞肩喖姊洪崷顓炲妺妞ゃ劌鎳橀敐鐐哄川鐎涙鍘藉┑鈽嗗灥濞咃綁鏁嶅鍚ょ懓顭ㄦ惔婵堟晼缂備浇椴搁幑鍥х暦閹烘垟鏋庨柟鐑樺灥鐢垰鈹戦悩鎰佸晱闁哥姵顨呴…鍥р枎閹垮啯鏅梺鎸庣箓椤︻垶鏌嬮崶顒佺厸闁搞儮鏅涢敓鏂ょ秮閺佸啴宕掑☉姘箞闂備礁鎼ú銏ゅ礉瀹�鍕�堕柣妯兼暩绾惧吋銇勯幇鈺佺伄閺佸牓姊洪崫鍕拱缂佸鎸荤粋鎺楁晝閸屾氨顦悷婊冪箻閹繝鏁撻悾宀�纾介柛灞剧懅閸斿秵銇勯妸锕�濮夐柟骞垮灩閳规垹锟斤綆浜為悾鍝勨攽鎺抽崐鏇㈠疮椤栫偛绐楅柛鈩冪♁閻撴洟鏌￠崶銉ュ濠⒀呭閵囧嫰鏁傞崫鍕潎濠殿喖锕ㄥ▍锝囨閹烘嚦鐔虹磼濡搫澹嶇紓鍌氬�烽懗鍓佸垝椤栨粍宕查柛宀�鍎愰弫瀣煥濠靛棙澶勯悗姘缁绘盯寮堕幋顓炲壉濡炪値鍋勭粔鐟邦潖濞差亝顥堟繛鎴炴皑椤斿﹥绻濆▓鍨灓闁轰焦妲掑Λ銏犫攽閻樼粯娑фい鎴濇閸╂盯骞嬮敂鐣屽幈濠电偞鍨堕敃顐﹀礉閻旇櫣纾奸柣妯挎珪瀹曞矂鏌熼绛嬫當妞ゎ偅绻堥幃鈩冩償閳撅拷閹奉偊姊绘担铏广�婇柡鍛矌缁瑩骞掗幋顓炴闂佸憡娲﹂崜娑氱不妤ｅ啯鐓熼柟浼存涧婢ь垶鏌℃径瀣�愭慨濠勭帛閹峰懘鎼归悷鎵偧闂備礁鎲″褰掓晪闂佸磭绮弻銊╁煡婢跺ň鏋庨柟鎼幗闁裤倝鏌ｉ悢鍝ョ煂濠⒀勵殘閺侇喖螖閸涱喖浜楀┑鐐村灦閳笺倛銇愰幒鎾存珳闂佹悶鍎弲婊堝箟濮楋拷濮婃椽骞栭悙璇ф嫹閺嶎厽鍋￠柍鍝勬噹閽冪喖鏌ㄥ┑鍡╂Ч闁哄懏鐓￠弻娑樷槈閸楃偛绠哄ù婊勭♁娣囧﹪鎮欓鍕舵嫹閵堝纾婚柛娑卞灡瀹曟煡鏌涢弴銊ョ仩缂佺姵鐓￠弻娑㈠即閵娿儱顫繝娈垮灡閹告娊寮婚敓鐘茬倞鐟滃酣藟濠婂嫮绠鹃悹鍥囧懐鏆ら梺璇″櫙缁绘繂顕ｉ幘顔碱潊闁挎稑瀚敮妤呮⒒娴ｅ摜鏋冩俊妞煎妿缁牊绗熼敓钘夘嚕閹间礁围濠㈣泛顑囬崢浠嬫⒑閻熺増鎯堢紒澶婄埣閹苯鈻庨幘瀵稿幐闁诲繒鍋涙晶钘壝虹�甸潻鎷峰▓鍨珮闁革綇绲介悾鐑藉箳閹搭厽鍍靛銈嗗釜閹烽绱掗悪鍛ɑ缂佺粯绻傞埢鎾诲垂椤旂晫浜梻浣瑰濞插繘宕曢柆宥侊拷鏃堝礃椤旇棄鐧勬繝銏ｆ硾閺堫剙鈻撻幆褜娓婚柕鍫濇婵呯磼閻樺啿鐏╃紒顔肩墢閿熸枻缍嗛崑浣圭濠婂牊鐓欏ù鐓庣摠濞懷兠瑰鍕垫畼缂佽鲸甯楀蹇涘Ω瑜忛悿鍕攽椤旂》鍔熺紒顕呭灦楠炲繘宕ㄩ娑樻瀭闂佸憡娲﹂崑鍌炲传濡ゅ懏鈷掑ù锝呮啞閸熺偤鏌＄仦璇插妞ゃ垺鐗楀鍕節閸曨剚顔曢梻浣芥硶閸犳挻鎱ㄧ�靛摜涓嶆い鏇嫹闁哄矉缍侀弫鎰板川閺夋浼冪紓鍌欐缁躲倗绮婚幘鎰佹綎闁惧繒鎳撶�垫煡鏌￠崶鈺佷粶闁冲嘲顦—鍐Χ鎼粹�崇濠电偛妯婇崣鍐嵁閸愵喗鍋い鏍煎Ч妤呮⒑閸︻厼鍔嬮柟鎼佺畺瀹曪綁宕卞☉娆屾嫼缂傚倷鐒﹁摫闁绘挶鍎遍…鑳槻闂佸府缍侀獮鍡欎沪鐟欙絾鐎婚梺瑙勬緲閻忔岸顢欓弮鍫熲拺缂備焦锚婵本銇勯弴鐔虹煀妞ゆ柨绻樻俊鐑藉煛閸屾稑娈欓梻浣告惈缁嬩線宕㈡禒瀣亗闁哄洨鍠撶粻楣冩煙鐎涙绠撻柤姝岊潐椤ㄣ儵鎮欐潏鎹愶拷鍧楁煛鐏炶濡奸柍钘夘槸閳诲酣骞嬮悙鍙夌彴濠电姵顔栭崰鏍晝閵娿儮鏋嶉柨婵嗘处椤洟鏌熼悜妯烘闁绘棁顔栭搹鍦＜婵☆垶鏀辩�垫ɑ绻濋悽闈浶ラ柡浣规倐瀹曟垵鈽夐姀鐘殿唵闂佺懓顕慨椋庣矆婵犲倶锟芥帒顫濋悙顒�顏堕梻渚�娼уΛ鏃傜矆娓氾拷閸┿垺鎯旈妸銉х杸濡炪倖甯掗崐濠氭偘椤曪拷濮婄粯鎷呴崫銉ㄩ梺绋款儏閿曨亜鐣烽姀銈呯濞达絽鎽滈鍡椻攽閻愬弶鈻曞ù婊勭箞閸╂盯骞嬮悩鍨紡濡炪倖鎸鹃崑鐐哄闯閻熸噴鐟邦煥閸愵亞楔闂佸搫鏈粙鎾绘晸閺傘倗绉甸柛瀣鐓ら悗鐢告交閹烽鎲撮崟顒傤槰缂備浇顕ч悧濠冪┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟╅悰顕�宕奸妷锔规嫼闁荤姴娲﹁ぐ鍐吹鏉堚晝纾界�广儱鎳忛ˉ銏拷瑙勬礃缁矂鍩㈡惔銊ョ疀妞ゆ洖鎳忕粊顐︽⒒閸屾瑧璐伴柛鎾寸懅缁棃鎮介崨濠備簵闂佸搫娲㈤崹娲偂閸愵喖绾ч柣鎰綑椤ュ鏌涢弬璺ㄐч柡灞剧洴婵″爼宕ㄩ鑲╃崺闂備浇娉曢崰搴ㄦ晸閻ｅ苯娅忔繛鍏煎姈缁绘盯宕ｆ径灞解拡缂備浇浜崑鐐垫崲濠靛鐐婇柕澶樺灡鐎氱懓銆掑鐐閻庢鍠楅幐铏叏閿熶粙鏌嶉埡浣告殲闁绘繃濞婂缁樻媴閾忓箍锟藉﹪鏌涢幘瀵哥疄闁诡喚鍏樻俊鐑芥晜閸撗屽晭闂備浇娉曢崳锕傚箯閿燂拷?
		
		final fire.pb.map.Role role = fire.pb.map.RoleManager.getInstance().getRoleByID(roleid);
		if (role==null)
			return ;
		MapConfig mc = role.getCurMapConfig();
		if (!(mc.getDynamic()==0&&mc.getVisibletype()==0)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143366, null);
			return;
		}
		xbean.RolePos rolePos = xtable.Roleposes.select(roleid);
		//if (rolePos==null||rolePos.getDynamicmap()<1500) {
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灪閵囧嫰骞囬鍡欑厯闂佸搫琚崝鎴﹀箖閵忋倕浼犻柛鏇熷灟閸ㄨ崵妲愰幒妤�绠涙い鎾楀嫮鏆︾紓鍌欒兌缁垶鎯勯鐐靛祦閻庯綆鍠楅崐鐑芥煕椤垵浜滄繛鍛殜濮婄粯鎷呴崨濠傛殘闂佽崵鍠嗛崕鎶藉箲閵忕媭娼ㄩ柨鐔绘椤曪絾绻濆顒�宓嗛梺闈涚箳婵烇拷闁哥偠娉涢埞鎴︽偐缂佹ɑ閿┑鐐茬湴閸旀垶淇婇崼鏇ㄦ晝闁挎棁袙閹锋椽鎮峰鍛暭閻㈩垪鏅涜灋闁硅揪闄勯悡鏇㈢叓閸ャ劍鐎い蹇撶墛閸嬧晠鏌ｉ妶搴＄仜濞存粌缍婇弻鐔兼倻濡偐鐣洪梺鍝勬噺缁诲牆顫忓ú顏咁棃婵炴垶鑹鹃。鍝勨攽閻愯尙婀撮柛鏃�鍨甸悾鐑藉閻欙拷閻撱儵鏌涢銈呮毐闁归绮换娑欐綇閸撗勫仹闂佺儵鍓濆Λ鍐ㄧ暦閻㈢绀冩い鏃傛櫕閸橀亶姊虹紒妯荤叆闁规祴锟藉磭鏆﹂悘鐐缎掗弨浠嬫⒔閸ヮ剙鏄ラ柡宥庡幖缁犳岸鏌￠崘銊у闁绘挻鍨块幃閿嬫媴闂堟冻鎷烽弴鐔稿弿闁稿本绋掗崣蹇撯攽閻樻彃顏悽顖涚洴閺岀喎鐣￠悧鍫濇畻闂佽鍠楃划宀冪亽闂佺粯鍨堕…鍥汲濮樿京纾介柛灞捐壘閿熺晫鍏橀幊妤呮嚋閸偄寮块柣搴ㄦ涧閹芥粓鎯岄幘缁樼厽闁绘梻顭堥ˉ瀣煛閸☆厼顩柟鍙夋倐閹囧醇濠靛牏鎳栭梺璇叉捣閺佸憡鎱ㄩ幘顔癸拷锔炬崉閵婏箑纾梺缁樺灦钃遍柟宄板船閳规垿鎮欓懠顒�顤�闂佺瀛╂繛濠囧春閻愬搫绠ｉ柨鏃囨娴滃湱绱撻崒娆戝妽閽冮亶姊哄▎鎯у箹妞ゎ亜鍟存俊鍫曞幢濡ゅ啩娣梻浣侯攰濞呮洟鏁冮姀銈囧祦闁告劦鍠楅崐鐑芥偡娴ｉ鍔嶆俊鐐扮矙閵嗕線寮崼婵嗙獩濡炪倖鐗楅懝鍓х不閻愮儤鈷掗柛灞剧懆閸忓本銇勯姀鐙呰含鐎规洘妞藉畷鍫曨敆閿熺晫绮堟径宀嬫嫹楠炲灝鍔氶柟鍐差樀瀵顓奸崨顏呮杸闂佺粯蓱瑜板啴寮抽弴鐘电＜閻犲洤寮堕ˉ銏ゆ煛鐏炲墽娲存鐐疵灃闁跨喍绮欏畷顖烆敃閿旀儳绁﹂柣搴秵娴滄牠寮ㄩ懞銉ｄ簻闁哄啫鍊堕敓钘夘儔瀵劎绱掑Ο鍦畾闂佺粯鍔栨竟鍡涙儗濞嗘劦娈介柣鎰絻閺嗭綁鏌熼鐣岀煉闁圭锕ュ鍕暆婵犲倹鍊繝纰夌磿閸嬫垿宕愰弽顬稒鎷呴崫銉︽闂佸壊鐓堥崑浣圭濮樿埖鐓欓柟顖涙緲琚氶梺缁樻尵閸犳牠鐛弽顬ュ酣顢楅敓浠嬫晸婵劕锟芥洟鈥﹂崶顒�绠涙い鎾跺Х椤旀洟姊洪崨濠勬噧妞ぱ嶆嫹闂佸吋婢樺锟犲蓟閳╁啯濯寸紒瀣濞堢粯绻濆▓鍨珯闁归鍏樺娲濞戞艾顣洪梺纭呮珪閸旀瑩骞冩ィ鍐ㄤ紶闁告洏鍔嶉弬锟介梻浣虹帛椤牓顢氬鍐惧晠闁靛鏅滈悡鐔镐繆閵堝繑瀚归梺鎸庢处娴滄粓顢氶敐澶婄闁圭儤绻勯崣鍡涙⒑閸撴彃浜為柛鐘虫崌瀹曘垺銈ｉ崘鈹炬嫼闁荤姴娲犻敓钘夊暱缁犳椽鏌ｉ姀鈺佺仭閻㈩垪锟藉磭鏆︽繝闈涙－濞尖晜銇勯幘瀵哥焼缂併劏顕ч—鍐Χ閸℃顫庨梺闈╃秶缁犳捇鐛箛娑欏�婚柦妯侯槺閻わ拷濠电偠鎻徊鍧楀箠閹剧粯鍎婃繝濠傜墛閳锋帒銆掑鐐濠电偘鍖犻崶銊ヤ罕闂佺硶鍓濋妵鍌氣槈濡粍妫冨畷姗�顢旈崱娆愭闂傚倷绀佸﹢閬嶅磿閵堝锟藉啴宕卞☉娆忎簵闂佸搫娲ㄩ崑鎰板绩娴犲鐓熸俊顖濐嚙缁插鏌ㄩ悢鍑ゆ嫹閻斿嘲鎯炵紓渚囧枟閺屻劎鍙呭銈呯箰閹虫劙宕㈤棃娑辨富闁靛牆妫欑粚鍧楁煙閻戠瓔妫戠紒杈ㄥ浮閹晛鐣烽崶褉鎷伴柣搴㈩問閸犳牠鈥﹀畡鎵殾闁告鍊ｉ弮锟界换婵嬪磼濞戞﹫鎷烽鐐粹拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟顔惧厴婵＄兘鍩￠崘銊с偊闂備礁澹婇崑渚�宕曢弻銉ョ厱闁圭儤鍤氳ぐ鎺撴櫜闁搞儯鍔屽▓灞筋渻閵堝棙绀冪紒顔肩У缁岃鲸绻濋崶鑸垫櫇闂佹寧绋戠�氼剚淇婃禒瀣拺闂侇偅绋撻埞鎺楁煕閺冿拷閸ㄨ埖绌辨繝鍥ч唶闁哄洨鍋熼崐鐐差渻閵堝骸骞楅柛銊ョ仛缁傛帒煤椤忓應鎷绘繛杈剧到閹诧繝宕悙鐑樼厽闁绘梹娼欓崝锕傛寠濠靛绾ч柛顐ｇ濞呭洤鈽夐幘宕囆㈤摶鏍煥濠靛棙鍣归柡鍡樼懅缁辨帡鎮▎蹇斿闁绘挻娲橀妵鍕箛椤斿す銏ゆ煟韫囧﹥娅呴棁澶嬬節婵犲倻澧㈤柣锝嗘そ閺岀喖顢欑粵瀣暥濡炪値鍋呯换鍫ュ箖濞嗘搩鏁嗛柨鐔剁矙椤㈡棃鏁撻敓锟�,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛婵勫劤娑撳秹鏌″搴″箺闁绘挻娲橀妵鍕箛閸撲胶蓱缂備緤鎷烽柨鐔烘櫕缁辨帡鎮欓锟介崝銈嗙箾绾绡�鐎殿喗妲掗ˇ鍓佺磼閻樺磭娲撮柡浣瑰姍瀹曘劑顢楅崒姘瘓闂傚倸鍊风粈渚�骞夐敓鐘冲仭闁靛／鍕簥闂佸湱鍎ら〃鍡涘疾閹间焦鐓曞┑鐘插濞呭繑绻涢崗鐓庡缂佺粯鐩畷锝嗗緞鐏炶В鍚傞梺缁樻尪閸婃繈寮婚妸鈺佺睄闁跨喍绮欓獮蹇撯攽鐎ｎ亞顔嗛悗鐟板閸嬪﹤顭囬埡鍌樹簻闁圭儤鍩堝Σ娲煕濮橆剦鍎旀慨濠冩そ瀹曨偊宕熼鐘插Ы缂傚倸鍊哥粔宕囩矆娓氾拷椤㈡岸鏁愭径妯绘櫌闂佸憡娲﹂崑鍡涱敊閸ヮ剚鐓欓柛蹇氬亹閺嗘﹢鏌涢妸銉хШ鐎殿喗鎮傞獮瀣晜鐟欙絾瀚藉┑鐐舵彧缁蹭粙骞楀鍫熸櫖鐎广儱娲ㄧ壕鍏笺亜閺囩偞鍣归柣蹇曞█閹繝濡舵径瀣幗闂佸搫鍟崐鍝ユ暜閸撲胶纾奸柣妯虹－婢ь剙菐閸パ嶈含濠碘�崇埣瀹曘劑顢欓崗纰变画闂傚倷绀侀幖顐﹀箠韫囨稒鍋傞柨鐔哄Х瀹撲線鏌″搴′壕闁瑰嘲鍢查埥澶娾枎濡厧濮虹紓鍌欒兌婵敻鏁冮姀銈呰摕闁挎繂顦悡娑樸�掑鐐濡炪倕瀛╅〃鍡涘Φ閸曨垼鏁傞柛鏇ㄥ亝濞堢粯绻濈喊姗堟嫹瀹曞洤鐓熼悗瑙勬礃閿曘垽鍨鹃敃鍌氱闁圭偓鍓氭导鎾绘⒒娴ｅ憡鎯堟繛灞傚灲瀹曞綊宕烽鐘辩瑝闂佺粯顭堝▍鏇㈠矗韫囨柧绻嗛柕鍫濇媼閸庢劙鎮楀杈ㄥ殌閾绘牠鏌ｅ锟藉褎绂掑鍫熺厱闁绘洑绀佹禍顖炴煟韫囨挸鏆ｆ慨濠呮閹瑰嫰濡搁妷锔撅拷铏圭磽娓氬洤鏋熼柣鐔叉櫅閻ｅ嘲煤椤忓嫀銊╂煥閺囶亝瀚圭紓浣稿閸嬫盯鍩為幋锔藉�烽梻鍫熺◥婢规洟姊虹拠鍙夊攭妞ゆ泦鍥х厴闁硅揪绠戦悡锟犳煕閳╁喚娈樺ù鐙�鍨跺娲川婵犲海鍔堕梺鍛婃处閸撴瑥顕ｉ崸妤佲拺缂備焦锚閻忥附銇勯鐐村窛鐎殿啫鍥ㄦ櫢濞寸姴顑嗛埛鎴炴叏閻熺増鎼愰柣蹇撳级缁绘稒鎷呴崘鎻掝伀妞も晠鏀辩换婵囩節閸屾粌顤�闂佺粯鎸鹃崰鎰┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｇ懓顕滄繛璇ч檮缁傚秴顭ㄩ崼鐔蜂患闂佹眹鍊ら崹顒佺瑜版帗鐓欓柣鎴灻悘銉╂煟鎼搭喖骞栨い顏勫暣婵″爼宕卞Ο閿嬪闂備胶顭堥鍡涘箰閹间礁鐓濋柟鐐暘閸嬪懘鏌涢幇銊︽澒闁归攱妞介幃宄邦煥閸涱収鏆柣銏╁灡椤ㄥ﹪寮澶嬪亜闁惧繐婀遍敍婊堟⒑鐠恒劌鏋欏┑顔哄�濋獮蹇涘川鐎涙ɑ鍎梻渚囧亝缁嬫捇鎮峰┑鍥╃瘈闁汇垽娼ф禒锕傛煕閵娿儳鍩ｉ柟顔惧厴閺佹劙宕卞▎妯婚敜婵犵數濮撮敃銈夋偋婵犲洦鍋傛繛鍡樻尰閻撴瑩鎮峰▎蹇擃仼濠殿喖鐗忛惀顏堫敇閻愭祴鎸冮梺璺ㄥ枙婵倗绮欓幒鏃�宕查柛顐ｇ箥濞兼牠鏌ц箛姘兼綈閻庢碍宀搁弻銈囧枈閸楃偛顫銈嗘⒐鐢鎹㈠☉姘炬嫹濞戞瑯鐒介柣顓炲缁绘稒寰勭�ｎ剚鍒涢梺鎸庣箘閸嬬姷绮诲☉銏犵濞达綀顫夐妵婵囥亜閵忊剝顥堢�规洜鍠栭、鏇㈠Χ閸パ勬К婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鎮楅悽鍛婁氦闁瑰嘲鍢查～婵嬫偂鎼达紕鐫勯柣搴ゎ潐濞叉繂鈻嶉弴鐘电焿闁圭儤妫戦幏鐑芥晲鎼粹�茬爱闂佸綊鏀卞钘夘潖閾忚鍏滈柛娑卞幒濮规姊虹粙娆惧剱缂佸甯楃粚杈ㄧ節閸パ囨暅濠德板�撻懗鍫曞储閸涘﹦绠鹃弶鍫濆⒔閹ジ鏌ｉ埄鍐╊棃鐎规洟娼ч埢搴ㄥ箻鐎电骞楅梻浣瑰缁诲倿骞婃惔鈭ワ絾绻濆顓熷殙闂佸搫绋侀崢浠嬫偂閵夆晜鐓熼柡鍌氱仢椤ｆ娊鏌ｉ鐔烘噰闁哄被鍔岄埞鎴﹀醇濠靛懐鎹曟俊鐐�ら崢褰掑礉閹存繄鏆﹀┑鍌氭啞閸嬪嫰鏌涘☉姗嗙叕濞寸姍鍥ㄢ拻闁稿本鐟︾粊鏉库攽椤斿搫锟芥繈寮�ｎ亶娓婚柕鍫濈箳閻ｉ潧霉濠婂棙纭炬い鏇秮楠炲酣鎳為妷锔界彇闂備胶顭堥張顒傜矙閹捐鍌ㄩ柛妤冨剱濞撳鏌曢崼婵囶棞濠殿啫鍛＜闁圭粯甯掗埛鏃傜磼椤旇偐澧︾�规洘锕㈤、娆撴偩鐏炶棄绠為梻浣筋嚙閸戠晫绱為崱娑樼；闁告洦鍓氶崣蹇曪拷骞垮劚濞村嫰骞忓畡鎵虫灁闁割煈鍠楅悘鍫ユ⒑缂佹澧遍柛妯犲洦鍋╅梺鍨儑闂勫嫰鏌涢幘鍐茬骇闁哄懏绻傞—鍐Χ鎼粹�茶埅闂佸憡锕㈢粻鏍ь嚕椤愶箑鍐�闁靛鍊楃粻姘舵⒑缂佹ê濮﹀ù婊勭矒閺佹挾绮ｉ弽褎澶勯柍閿嬫閺屾盯寮撮妸銉ヮ潾闂佺粯绻傞悥濂稿蓟濞戙垹鐒洪柛鎰典簼閸ｎ厼顪冮妶搴′簼婵炶尙鍠栧濠氭偄閻撳海顔夐梺閫涘嵆濞佳冣枔椤撶姷纾奸柣鎰靛墮閸斻倝鏌涘顒夊剳闁瑰箍鍨归埥澶愬閻樿尪锟藉灝鈹戦埥鍡楃仴婵炲拑缍佸畷婵堢矙鎼存挻鏂�闂佺偨鍎村▍鏇㈠煝閺囥垺鐓曢柨婵嗙箳缁夘喚锟芥鍠栭…鐑藉极閹版澘骞㈡俊顖氭惈婵℃娊姊绘笟锟藉褏鎹㈤崼銉ユ槬闁告洦鍨板Ч鏌ユ煃閵夛附鐏遍柡锟芥禒瀣厽婵妫楅弸娑㈡煟韫囷絼閭柡灞诲妼椤繈骞夌�ｎ偄顏堕柣鐔哥懃鐎氼厾浜搁銏″�垫慨姗嗗幗缁跺弶銇勯銏㈢閻撱倖銇勮箛鎾愁伀妞ゆ柨娲弻鐔煎礂閼测晜娈梺鎼炲妼椤柉妫熼梺闈涱槴閺呮粓鍩涢幋鐘电＜閻庯綆浜滈惃锟犳煕閺冨倸鏋戦柕鍥у椤㈡﹢鎮欓棃娑辨澑闂備礁鎼幊宀勫磿闂堟侗娼栨繛宸簻娴肩娀鏌涢弴銊ユ珮婵炵厧鐖煎铏圭矙閸噮鍔夐梺缁樻惈缁绘繈鐛崘顔芥櫢闁绘ɑ褰冨畵鍡涙⒑闂堟稓绠氶柨鐔烘櫕椤掓煡骞忛悜钘夐唶闁哄洨鍠撻崢浠嬫⒑瑜版帒浜伴柛妯垮亹瀵板﹥绻濆顓犲帗闂備礁鐏濋鍡浰夐崼銉︾厸鐎癸拷鐎ｎ剛袦濡炪們鍨洪敋妞ゎ厹鍔戝畷姗�骞愭惔鈽嗕紦婵犵數濞�濞佳囶敄閸涘瓨瀚呴柣鏂垮悑閻撱儲绻濋棃娑欘棡妞ゃ儳鍋ら弻娑欐償閿濆懏鐏堥梺鍝勬湰濞茬喎鐣烽悡搴樻斀闁搞儜鍕典槐濠电姵顔栭崳顖滃緤婵犳艾鍨傞柤濮愬�栭～鏇㈡煙閹呮憼濠殿垱娼欓湁闁绘ê妯婇崕蹇涙煙閻ｅ本鏆柡宀嬬秮婵拷闁宠桨鑳舵禒姘舵⒑鐠恒劌鏋欐俊顐㈠婢规洟顢橀姀鐘宠緢闂佹寧娲栭崐褰掓偂濞嗘挻鐓熼柟瀵镐紳椤忓牊鍊块柣鎰靛墰缁犻箖鎮樿箛鏃傚婵炲懎锕弻锛勪沪鐠囪鎷烽弴銏＄畳闂佽鍑界紞鍡涘磻閸涘瓨鍋熼柡鍐ㄧ墛閳锋垿鎮归崶锝忔嫹閾忣偆浜堕梻浣规偠閸斿本鏅舵惔銊ョ闁靛繒濮弨浠嬫煕閳撅拷閺呮稑鈻撻锔解拺闁告繂瀚烽崕娑㈡煕鐎ｎ亜顏柡浣规尰閹便劑骞囬濠冨婵犻潧妫涢弳锕傛煟閵忋埄鏆滈柟椋庡厴閺佹劖鎯斿┑鍫熷瘻闂備胶灏ㄩ幏宄懊归悩宸剱闁绘挸鍟撮弻鏇熷緞閸繂顬夐梺缁樼箥娴滅偤鏁撻悾灞惧殌闁硅绱曢幑銏ゅ醇閵夈儴鎽曞┑鐐村灟閸ㄥ湱绮婚幎鑺ョ厵闁硅鍔栭悵顏堟偣閸モ晛浠遍柟顔筋殘閹叉挳宕熼鍌ゆК缂傚倸鍊哥粔鎾晝椤忓牆违濞撴熬鎷风�殿喗鎸虫慨锟介柣娆欐嫹婵炵厧锕娲濞戞氨鐤勯梺鎼炲姀椤曆囨偩閸偅濯撮柛锔诲幘閻﹀牓姊哄Ч鍥х伈婵炰匠鍐╂瘎闂傚倷娴囧銊х矆娓氾拷楠炲鏁撻悩鑼杽闂侀潧艌閺呮稓绮荤紒妯镐簻闁哄啫娲ゆ禍褰掓煥濞戞瑧鎳囬柟顔煎槻椤劑宕ㄩ褎姣夐梺姹囧焺閸ㄨ京鏁垾宕囨殾婵炲棙鎸婚崑鎰版煕濞嗗繐锟界懓螞閸愵喖鏋侀柟鐗堟緲瀹告繃銇勯幘璺烘瀾妞ゆ柨顦靛缁樻媴閻熸壋鏋欓梺鐚存嫹闂侇剙绉撮崹鍌炴煕瑜庨〃鍛存嫅閻斿吋鐓熼柡鍌氱仢閹垿鏌涢妶鍛殻闁哄苯绉靛顏堟偋閸偅鈻婄紓鍌欑贰閸犳牠鎮ラ悡搴綎婵炲樊浜滃婵嗏攽閻樻彃鏆熼柛妯圭矙濮婅櫣绮欓崠鈩冩暰濠电偠灏欓崰鏍х暦濞差亝鍊烽柛婵嗗椤撴椽姊洪幐搴⑩拻缂侇噮鍨跺鏌ュ煛閸涱喒鎷洪梺绋跨箺閸嬫劙濡堕幘顔界厸闁告粈妞掔花鑺ヤ繆閸欏濮嶉柟顔界懇閹粙鎮界喊澶岄棷婵犵數鍋為幐濠氭嚌閹灐娲Χ閸涱亝鐎哄┑顔筋殣閹风兘鏌＄仦鍓р槈閾伙綁鏌熺粙鍨槰婵☆偄瀚—鍐Χ閸℃锛橀梺绋块叄濞佳囨偩閻戣姤鍋勭痪鎷岄哺閺咁剙鈹戦绛嬬劸濞存粠鍓熷鍫曞川婵犱胶绠氶梺缁樺姦娴滄粓鏁撻懞銉у⒈闁轰緡鍣ｉ獮鎺懳旈敓鐣屽婵犳碍鐓曢柍鈺佸暔娴滄鏌ㄥ┑鍡╂Ч闁哄懏鎮傞弻銊╂偆閸屾稑顏�?
			MissionMajorScenario majorTask = new MissionMajorScenario( roleid, true );
			MissionConfig conf = majorTask.getConf();
			if ( conf == null )
				return;
			
		//	MissionConfig.MissionRewardInfo rewardInfo = conf.rewardInfo;
			if ( FairylandMgr.isInDreamMap(conf.exeIndo.mapID ) ) {
				fire.pb.mission.fairyland.FairylandMgr.getInstance().enterIntoDreamLand(roleid, conf.exeIndo.mapID, rolePos.getDynamicposx(), rolePos.getDynamicposy(),false,true );
			}
			
			return;
		//}
//		else {
//			int mapid = rolePos.getDynamicmap();
//			int posx = rolePos.getDynamicposx();
//			int posy = rolePos.getDynamicposy();
//			fire.pb.mission.dreamland.DreamLandManager.getInstance().enterIntoDreamLand(roleid, mapid, posx, posy,false,true);
//		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805455;

	public int getType() {
		return 805455;
	}


	public CReturnFairyland() {
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
		if (_o1_ instanceof CReturnFairyland) {
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

	public int compareTo(CReturnFairyland _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


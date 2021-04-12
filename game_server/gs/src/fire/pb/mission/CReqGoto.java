
package fire.pb.mission;

import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.DateUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqGoto__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqGoto extends __CReqGoto__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			return;
		}
		
		Team temp = TeamManager.selectTeamByRoleId(roleid); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧秬濞咃綁濡存繝鍥ㄧ厱闁规儳顕粻鐐烘煙閽樺锟藉鏁撻弬銈囩У闁哥姵鐗犻幃娆愮節閸愶缚绨婚梺鐟版惈缁夊墎鎷归悧鍫滅箚妞ゆ劑鍨归弳娆撴煃鐟欏嫬鐏撮柟顔界懃椤斿繘顢欓崗纰卞晙濠碉紕鍋戦崐鏍暜閻旇桨鐒婃繛鍡樺灦椤洟鏌ｉ幇顒夊殶闁荤喎缍婇弻銊╂偄缂佹﹩妫勫銈嗘穿缂嶄線銆侀弴銏℃櫇闁跨喓鏅竟鏇熺附閸涘﹦鍘介梺褰掑亰閸樼晫绱為幋锔界厽鐟滃秶锟芥凹鍘鹃幑銏犫攽鐎ｎ亶娼婇梺鎸庣箓閹虫劙宕㈤锔解拺闁圭娴烽。鑼磼缂佹娲寸�规洜鍘ч埞鎴﹀礋椤愨�冲灊闂傚倷绀侀幖顐︽儗婢跺苯绶ゅΔ锝呭暙缁犳岸鏌￠崘銊у闁哄拋鍓熼弻娑㈠即閵娿儱绠哄┑鐐茬墱閸ㄨ泛顫忕紒妯诲濞撴凹鍨抽崝绋库攽椤旀枻鍏梻鍕缁顓兼径妯绘櫌闂佸憡娲﹂崜姘枍閵忋倖鈷戦柛蹇涙？閼割亪鏌涙惔銊ゆ喚鐎规洜鏁婚、妤呭礋椤掑倸骞堥梻浣瑰缁诲倻鎹㈤幒鏃傜煋妞ゆ梻鐡斿▓浠嬫煟閹邦厼绲婚柡鍡樼懇閺岋綁鏁愯箛鏇犵槇濡ょ姷鍋涚粔褰掑箹瑜版帩鏁冮柨婵嗘缁额偊姊婚崒娆愮グ妞ゆ泦鍥х闁伙絽鐬肩粈濠囨煕閳╁啰鈽夌痪鎯ь煼閺屾盯寮撮妸銉ヮ潾濡炪倐鏅濋崗姗�寮诲澶婁紶闁告洦鍓欏▍銈夋⒑閹惰姤鏁遍柛銊ユ健楠炲啳銇愰幒鎴犵暢闂佸湱鍎ら崹鐢糕�栭崼婵冩斀闁绘劕寮堕崳娲煕閺冿拷閻熲晛顕ｆ繝姘亜闁绘挸娴烽ˇ鈺呮⒑闂堟稓澧曟俊顐ｎ殜椤㈡棃鏁撻敓锟�? by 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繛杈剧悼閻℃柨顭囬幇鐗堢厱閹兼番鍊栭悵顏堟煛閸涙澘鐓愰柟顖涙閺佹劙宕担璇℃％闂傚倷绀侀崥瀣娴犲纾块柡灞诲劚閻鐓崶銊︾叄缂佽妫欓妵鍕冀閵婏妇娈ゆ繛瀵稿О閸ㄤ粙寮婚敐澶婄闁哄鍨甸～鎺楁⒑閸濆嫮鐒跨紓宥勭窔閻涱喖顫滈敓浠嬪箠閻樻椿鏁嗛柛灞剧矊鎼村﹪姊婚崒娆戭槮闁圭⒈鍋婂鐢割敆閸曨剙鍓銈嗙墬缁嬫劗鎹㈤崱娑欑厽闁瑰濮烽幗鍌炴煛娴ｉ潻韬柡宀嬬秮楠炴﹢宕橀懠顒佇炴繝鐢靛仱濡法鍒掑▎蹇ｆ綎缂備焦蓱婵潙銆掑鐓庣仯闁告柨鎲℃穱濠囧Χ閸ヮ灝銏ゆ煙閼恒儳鐭岄柛鎺撳浮瀵噣宕堕妷銈嗙潖闂備礁婀遍崕銈夊垂婵傜绠洪柡鍥╁亹閺�浠嬫煟閹邦厽缍戦柣蹇曞枛閺屾盯濡搁妷锕佺缂備緡鍠栭…鐑藉箹瑜版帩鏁冮柕鍫濇川濡插洭姊婚崒姘拷鎼佹偋婵犲嫮鐭欓柟鐑樻尭缁剁偤鏌涢弴銊ョ仭闁绘挾鍠愮换婵嬫濞戞艾顤�闂佺顑戠粻鐥漢ao
		if(temp != null && temp.isNormalMember(roleid) ){
			return;
		}
		if(mapid==fire.pb.clan.ClanUtils.MAPID){ //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛锛卞喚娓婚柕鍫濇缁岃法绱掗煫顓犵煓闁诡噣绠栭弫鎾绘偐瀹曞洤濮洪梻浣瑰濡礁螞閸曨垱鍎婃繝濠傜墛閳锋帒銆掑鐐濠电偘鍖犻崶銊ヤ罕闂佺硶鍓濋妵鍌氣槈濡攱顫嶅┑鐐叉閸旀牠鎮靛畡閭︽富闁靛牆妫楃粭鎺楁倵濮樼厧寮柟顕嗙節閹晝绱掑Ο鐓庡箺闂備胶绮弻銊╁箟閿涘嫭顐介柡灞诲劜閻撳啴姊洪崹顕呭剱妞ゃ儱鐗撻弻锛勪沪鐠囪鎷烽弽顓炍ч柨鏃囨缁剁偟绱掔�ｎ偄顕滈柛搴㈡尵缁辨捇宕掑▎鎰偘婵＄偞娼欓幗婊堝极椤曪拷楠炴帡寮撮悩杈焻闂傚倸鍊风粈渚�宕ョ�ｎ剛鐭堥柟缁㈠枛閻ら箖鏌嶉崫鍕櫣闁汇値鍣ｉ獮鏍庨锟芥俊浠嬫煃闁垮绗掗棁澶愭煥濠靛棙鍣洪柛鐔哄仱閺屾盯鎮㈤崫鍕闂佸搫鐭夌紞渚�骞冮姀銈呯骇闁瑰瓨绻傝闂備浇濮よ摫缂佽鍟存俊鐢稿礋椤栨艾鍞ㄥ銈嗗姦濠拷缂侇喖澧庣槐鎾寸瑹婵犲啫顏跺┑鐘灱閸╂牠宕濋弽顓熷亗闊洦绋掗悡鏇熴亜閹板墎鎮肩紒鐘崇墬閵囧嫰濡疯鍟哥紓浣介哺鐢繝宕洪妷鈺佸窛妞ゆ梻鈷堟导鎾绘⒒閸屾艾锟芥悂宕愬畡鎳婂綊宕惰閺嬫牠鏌￠崶銉ョ仼缂佹劖顨堥敓钘夌畭閸庡崬煤閵堝鍨傛繝闈涙川缁犻箖鏌涢埄鍏╂垹浜搁悽纰夋嫹鐟欏嫭灏柣鎺炵畵楠炲牓濡搁妷搴㈡⒒閿熸枻缍嗛崑鍕敂閼稿吀绻嗛柣鎰典簻閿熻姤鍨垮畷鐟懊洪鍛画闂佸啿鎼幊搴ｇ不閻樼粯鐓涚�广儱楠搁獮鏍煟閹惧鈽夐柕鍡樺笒椤繈顢楁繝鍐╂毎闂佽瀛╅懝鍓х礊婵犲洤钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�? by 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝曢梻浣藉Г閿氭い锔诲枤缁辨棃寮撮姀鈾�鎷绘繝鐢靛Т妤犲憡绂嶅鍕閻犲泧鍐炬喘缂備緡鍠楅悷鈺呯嵁鐎ｎ喗鍋愮�瑰壊鍠楅ˉ锟犳⒒娴ｄ警娼掗柛鏇炵仛閻ｇ兘姊虹紒妯诲碍缂佺粯锕㈠璇测槈閵忊晜鏅濋梺鎸庣箓濞层劑鎮惧ú顏呪拺闂傚牃鏅濈粙璇测攽閻愯韬�殿喖顭烽弫宥夊礋閼搁潧顏堕梺鎸庣箓缁ㄨ偐鑺辨禒瀣瀬闁割偁鍎查埛鎴︽煕濠靛棗顏繝锟介悧鍫㈢闁肩⒈鍓欓弸搴ㄦ煟閿濆洤鍘撮柟顔瑰墲閹柨螣缂佹ɑ婢戦梻鍌欑缂嶅﹪宕戞繝鍥у偍婵犲﹤鐗婇弲婵嬫煕鐏炲墽鈻撻柟宄版惈閳规垿鎮欑捄楦挎暱濡炪倖娉﹂崶鈺佺ウ濠德板�撻梽宥嗙濠婂牊鐓忓┑鐐茬仢閸旂敻妫呴澶婂闁跨喕濮ら鏍窗濞戙埄鏁嬬憸鏃堝春閵夛箑绶為柟閭﹀墻濞煎﹪姊洪崘鍙夋儓闁稿﹦鎳撻埢宥夊炊椤掍讲鎷绘繛鎾寸啲閹烽攱绻涙担鍐叉处閸嬪鏌涢埄鍐槈缂佺姷濞�閻擃偊宕堕妸褉妾ㄩ梺绋匡功閺佸寮诲☉銏犵婵°倧鎷烽柟铏姍閺佸秴鈹戦崶鈺冾啎闁哄鐗嗘晶鐣岀矓椤旂晫绠惧ù锝呭暱鐎氼亞鎹㈤崱娑欑厽闁挎繂鎳愰悞鍧楁煙妞嬪骸鍘撮柟顖氬�垮畷銊︾節閸屻倓绱﹂梻鍌氬�风粈浣虹礊婵犲伣娑氭崉閵娧呯劶婵炶揪缍�濞咃絾绋夊澶嬬厸鐎广儱楠告禍婵嬫煕閻樺啿濮嶉柡宀嬬到铻栭柨鐔剁矙閹囧幢濞嗘垹鐣堕梺鍦劋濮婅崵澹曟總鍛婄厽婵☆垵娅ｉ敍宥夋煃閸欍儳绐旈柡灞炬礋瀹曟儼顦叉い蹇ｅ幘閿熻姤顔栭崰鏇犲垝濞嗘劒绻嗘慨婵嗙焾濡查箖姊洪崨濠勬噭缂佽鍊块崺鐐哄箣閿旂粯鏅╁┑鐐叉閸嬫挾绱為崼婵愭富闁靛牆鍟俊濂告煙閾忣偓鑰跨�规洘妞介幃娆撳传閸曨収鍚呴梻浣瑰濡礁螞閸曨垱鏅搁柣锝呰嫰閸樻挳鏌＄仦璇诧拷妤呭窗婵犲洤纭�闁绘劕妯婂缁樹繆閻愵亜锟芥垿宕愯楠炲繘鎮滈懞銉㈡嫽闂佺鏈悷褔藝閿曞倹鐓欓悹鍥囧懐鐦堥梺璇″枤閺屽藝鐎靛摜纾兼い鏃囨閸濇椽鏌熼鑲╁煟鐠侯垳鐥幆褍鐒籥o
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾块柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘鐓涢柛鏇楁櫅閸旓箓鏌＄仦鍓ф创鐎殿喗鎸虫俊鎼佸Ψ瑜岄崫妤呮⒒娴ｈ鍋犻柛鏂跨焸瀹曟劙骞栨担鍝ュ幋闂佺鎻粻鎴犲閸忚偐绡�濠电姴鍊归幑锝夋煕閺傛寧鎲哥紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘▎鎴犵煔閺夊牄鍔庣弧锟介梺鎼炲労閻忔稖顦归柣鎿冨亰瀹曞爼濡搁敂鎯у汲婵＄偑鍊曠换鎰版偉閻撳寒娼栨繛宸簻缁�鍌炴煟閹惧啿鐦ㄩ柛銈咁儔濮婃椽宕ㄦ繝鍐ｆ嫻闂佽崵鍟块弲娑㈩敋閿濆棛绡�婵﹩鍘兼禍婊堟⒑缂佹ɑ灏繛瀵稿厴閹偓銈ｉ崘鈹炬嫼缂傚倷鐒﹂敃鈺佲枔閺冨牊鐓熸俊銈勮兌閻﹪鎽堕悙鐑樼厱闁哄洢鍔岄悘锟犳煃闁垮鐏撮柡灞剧洴閺佸倻鎷犻幓鎺旑啈闂備焦鎮堕崐褔骞忛悜鑺モ拻濞达綀娅ｇ敮娑㈡煟濡や焦绀嬪┑鈥冲缁瑥鈻庨幆褎顓垮┑鐘垫暩婵敻鎳濇ィ鍐╁�挎繛宸簼閻撴洟鏌熼幍铏珔濠德ゆ硶缁辨帡骞囬闂存闂佸搫鐭夌徊楣冨箚閺冨牜鏁嶆繝濠傛啗閿濆棛绠鹃悗娑欘焽閻﹪鏌ｉ弽顐㈠付闁伙絿鍏橀幃鐣屽枈婢跺顏堕梺鎸庣箓妤犲憡鏅堕幍顔炬／闁硅鍔栭ˉ澶愭婢舵劖鐓ユ繝闈涙缁佲晠鏌ｉ幒妤冪暫闁哄被鍔戦幃銏㈡嫚濞堝鎹囬弻鐔碱敊閻撳函鎷烽崸妤冨祦闁告劦鍙庡Ο鍕旈悩闈涗沪妞ゎ厼娲獮蹇涙偐缂佹ê娈ゅ銈嗗笒閸婄懓袙閸ヮ剚鈷戦柤濮愬�曢弸鎴犵磼椤旂厧顒㈤柡鍛版硾铻栭柛鎰ㄦ櫆濞堜即姊洪崷顓炲妺闁瑰憡鎮傞、姘舵焼瀹ュ棛鍘藉┑鈽嗗灥閸嬫劗鏁☉銏＄厽闁规儳鐡ㄧ粈瀣煛瀹�瀣瘈鐎规洖鐖兼俊鐑藉Ψ閵夘喚锟借櫕淇婇妶鍥ラ柛瀣仱閵嗗啯绻濋崶褑鎽曢梺鎸庣箓濡瑩宕曢悢鎼炰簻闁哄倸鐏濋幃鎴︽煟韫囨挾澧︽慨濠呮閿熻棄婀辨刊顓烆焽閹扮増鐓曢柕濞垮劜閸嬨儲顨ラ悙鎻掓殭闁宠閰ｉ獮姗�寮堕幋鐐垫澓闂傚倸鍊搁崐鎼佹偋婵犲嫮鐭欓柟鐑橆殕閻撱儲銇勯幘鍗炵仾闁抽攱甯掗湁闁挎繂娲ら崝瀣煕閵堝繑瀚归梻鍌欑劍閹爼宕愰弽顓熷亱闁绘宕靛畵渚�鐓崶銊р檨闁哄懏鎮傞弻銊╂偆閸屾稑顏�
			fire.pb.clan.ClanUtils.enterClanMap(roleid, xpos, ypos);
			return;
		}
		
		final long now = java.util.Calendar.getInstance().getTimeInMillis();
		Long lasttime = xtable.Requestgoto.select(roleid);
		if(lasttime !=null)
		{
			long interval = now - lasttime.longValue();
			if(interval < 1 * DateUtil.ONE_SECOND / 2 * 5){
				MessageMgr.sendMsgNotify(roleid, 162064, null);
				return;
			}
		}
		
		ExecuteReqGoto.trans2Pos(roleid, mapid, xpos, ypos, false);
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xtable.Requestgoto.remove(roleid);
				xtable.Requestgoto.insert(roleid, now);
				/*if (fire.pb.mission.instance.InstanceManager.getInstance().isInstanceCopy(mapid)) {
					return true;
				}
				
				if (fire.pb.mission.instance.line.LineInstManager.getInstance().isInstanceCopy(mapid)) {
					return true;
				}*/
//				xtable.Role2instancetask.remove(roleid);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805516;

	public int getType() {
		return 805516;
	}

	public int mapid;
	public int xpos;
	public int ypos;

	public CReqGoto() {
	}

	public CReqGoto(int _mapid_, int _xpos_, int _ypos_) {
		this.mapid = _mapid_;
		this.xpos = _xpos_;
		this.ypos = _ypos_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(mapid);
		_os_.marshal(xpos);
		_os_.marshal(ypos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		mapid = _os_.unmarshal_int();
		xpos = _os_.unmarshal_int();
		ypos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqGoto) {
			CReqGoto _o_ = (CReqGoto)_o1_;
			if (mapid != _o_.mapid) return false;
			if (xpos != _o_.xpos) return false;
			if (ypos != _o_.ypos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += mapid;
		_h_ += xpos;
		_h_ += ypos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(mapid).append(",");
		_sb_.append(xpos).append(",");
		_sb_.append(ypos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqGoto _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = mapid - _o_.mapid;
		if (0 != _c_) return _c_;
		_c_ = xpos - _o_.xpos;
		if (0 != _c_) return _c_;
		_c_ = ypos - _o_.ypos;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


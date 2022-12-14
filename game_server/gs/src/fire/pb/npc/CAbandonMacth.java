
package fire.pb.npc;
import java.util.ArrayList;
import java.util.List;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonMacth__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonMacth extends __CAbandonMacth__ {
	@Override
	protected void process() {
		// protocol handle
		final Long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				xbean.npcBattleInfoCol npcBattle = xtable.Npcbattleinfo.get(npckey); 
				if (npcBattle == null)
					return false;
				if (!npcBattle.getBattleroles().containsKey(roleid))
					return false;
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓哄┑鐐叉缁绘帡宕濋幘顔解拺閺夌偞澹嗛ˇ锔姐亜閹存繃顥㈠┑锛勬暬瀹曠喖顢涘槌栧晪闂佽崵濮惧▍锝夊磿閵堝鍊靛Δ锝呭暞閳锋垿鏌涘☉姗堝姛闁瑰啿鍟扮槐鎺旂磼濮楀牐锟芥寧顨ラ悙鎻掓殭閾绘牠鏌ㄩ悢鍓佺煓闁糕斂鍎插鍕箾閻愵剛锟借鈹戦悙鍙夘棞婵炴挳鏀卞濠氬籍閿熺晫鎹㈠┑瀣仺闂傚牊绋愮划鍫曟⒑缂佹﹩娈旈柟铏姍瀹曟岸骞掗幋鏃�鐎婚梺瑙勫劤閻ゅ洭骞楅弴鐐╂斀闁绘劖娼欓悘锕傛嚕閵堝鐓涢柨鐔诲Г缁傛帞锟斤綆鍋嗛崢閬嶆⒑閸濆嫭鍌ㄩ柛鏂挎湰缁傚秴顭ㄩ崘锝嗘杸濡炪倖妫侀崑鎰櫏婵犳鍠栭敃銊モ枍閿濆洦顫曢柟鐑樺殾閻斿吋鎯為柛锔诲幗閸ｎ垶姊婚崒娆戝妽閻庣瑳鍏犻缚绠涘☉妯硷紵闂佸壊鐓堥崑鍌滄崲閸℃稒鐓熼柕蹇嬪焺閻掑墽绱掗敓鐣岋拷锝庡亖娴滄粓鏌″鍐ㄥ濠㈣顭囬敓鍊燁潐閹哥螞濡ゅ應锟芥棃宕橀鍢壯囨煕濞戝崬鐏ｆい鏂挎喘濮婃椽鎮烽弶鎸庢瘣闂備礁搴滅紞渚�濡存笟锟藉顕�宕煎┑瀣暪闂備礁鎼ú銊╁疮閸ф绠紓浣诡焽缁犻箖寮堕崼婵嗏挃闁告帊鍗抽弻鐔烘嫚瑜忕弧锟藉Δ鐘靛仜濡繂鐣锋總绋课ㄩ柨鏃�鍎抽獮妯荤節閻㈤潧浠╅悘蹇ｄ邯椤㈡俺顦归柟顔斤耿閺佸啴宕掑☉姘箰濠电偠鎻徊鍧椻�﹂崼銉ユ辈闁挎繂鎳夐弨浠嬫⒔閸ヮ剙鏄ラ柡宓苯娈梺鍛婃处閸婄娀鎮㈤搹鍦紲濠碘槅鍨靛畷浣冦亹鎼粹檧鏀介柣妯虹仛閺嗏晛鈹戦悜鍥ㄥ婵犵數鍋橀崠鐘诲炊瑜忛敍娆愮節閻㈤潧校闁糕晛鍟撮弫鎾诲棘閵堝洨鏆ら悗瑙勬礈閸樠囧煘閹达箑绠涙い鎺嶇劍閻濇艾鈹戦悩鍨毄濠电儑鎷峰┑鐐板尃閸忕姵妞芥慨锟介柨娑樺濞茬鈹戦悩璇у伐闁绘锕幃鈥斥枎閹惧鍘甸柣鐔哥懃鐎氼剚鎱ㄩ崼銏㈡／妞ゆ挾鍋涢埛鏂棵瑰鍕憙缂佺姵鐩鎾偐绾板闂繝鐢靛仦閹稿鎳濋幆顬℃椽濡舵径濠傚殤闂佺粯鏌ㄩ崥瀣偂濞嗘垹纾奸悗锝庝簽娴犮垽鏌￠崱姘跺摵闁靛洤瀚伴、鏇㈠閵忋埄鍞堕梺缁樻尪閸婃牠濡甸崟顔剧杸闁圭偓娼欏▍锝呪攽閻愯尙澧戦柛搴ㄦ涧椤繐煤椤忓拋妫冨┑鐐村灦閼归箖銆傚ú顏呪拺闁荤喐婢橀弳杈╃磼婢跺灏﹂柛鈹垮灪缁傛帞锟斤絽鐏氶弲婊堟⒑缁洖澧查柣鐔濆洦鏅繝闈涙川缁犻箖寮堕崼婵嗏挃闁告帗婢橀…鍧楁偡鐢喛鍚悗瑙勬礃濞叉繄绮诲☉銏犲嵆闁绘顣槐鑼磽閸屾艾锟界兘鎮為敃鍌氱厽闁靛牆顦介弫鍌炴煕椤愩倕鏋庡ù鐘层偢閹鎮烽弶娆句痪婵犮垻鎳撻澶婎嚕閵婏妇顩烽悗锝庡亜閿熺晫鏁婚弻銊モ攽閸℃瑥鍤紓浣靛姀婵倝濡甸崟顖氱閻庢稒菧娴犮垹鈹戦纭锋敾婵＄偘绮欓悰顕�骞囬鐔峰妳闂侀潧绻嗛幊鍥极瀹ュ鈷掑ù锝呮憸缁夌儤銇勯妷锔藉磳鐎规洘顨呰灒濞撴凹鍨辩紞搴㈢節閻㈤潧校闁肩懓澧芥竟鏇熺附閸涘﹦鍘梺鍓插亝缁诲啴宕抽挊澹濆綊鎮╅搹顐拷鎰叏婵犲啯銇濈�规洦鍋婂畷鐔碱敇閻樻彃蝎缂傚倸鍊搁崐鍝ョ矓瀹曞洦顐芥慨妯垮煐閸嬫ɑ銇勯弮锟介幏婵嬪箯閻戣姤鏅查幖绮瑰墲閻忓秹姊洪崫鍕櫤闁绘搫绻濆璇测槈閵忕姷鍙冮梺璺ㄥ枍缁瑥顕ｉ幓鎺濈叆闁糕晞娉涢ˇ鏉款嚗閸曨偆鏆嗛柨鐔烘櫕婢规洘绂掔�ｎ偆鍘遍柣蹇曞仜婢т粙骞婇崨顖滅＜婵炴垶顭囩粻濠氭煛瀹�锟介崰鎰八囬悧鍫熷劅闁炽儱鍟跨粻锝夋⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涢悙鍙夋К闂佸憡娲﹂崹鎵矆閸愨斂浜滈煫鍥ф捣閸斿秵銇勬惔鈩冨枠婵﹦绮幏鍛存惞閻熸壆顐奸梻浣筋潐閹倻绮婚弽褏鏆﹀ù鍏兼綑缁犳稒銇勯幘璺盒涢柡锟介搹顐ょ瘈闁汇垽娼у瓭濠电偞娼欓崐鍨嚕椤愩埄鍚嬮柛鈩冪懅閻﹀牓姊婚崒姘卞缂佸甯¤棢婵炲棙鍔栭崣蹇涙偡濞嗗繐顏存繛鍫熺矒閺屸�崇暆鐎ｎ剛袦婵犳鍣幏鐑芥⒑鐎圭姵銆冮柤瀹犲煐缁傛帡顢橀姀鈾�鎷洪梺缁樺灍閺呮粌鈻嶉幘缁樼厱闁靛鍔嶇涵鐐亜閺囶亞绋荤紒缁樼箓椤繈顢橀悢鍝ュ礁闂傚倷绀侀幉鈩冪瑹濡や胶顩叉繝闈涱儏濡﹢鏌ㄩ悢鍓佺煓婵﹦绮幏鍛村川婵犲懐顢呴梻浣侯焾椤戝棝骞愰幖浣诧拷锕傚炊瑜夐弸搴ㄦ煙閸喖鏆為柡鍛矒濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�
				npcBattle.getBattleroles().remove(roleid);
				xtable.Role2npcbattle.remove(roleid);
				
				//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢杈ㄧ節閻㈤潧孝闁稿﹤缍婂畷鎴﹀Ψ閳哄倻鍘搁柣蹇曞仩椤曆勬叏閸屾粣鎷峰▓鍨灍闁瑰憡濞婇獮鍐ㄢ枎閹寸偛鐝伴悷婊冩捣閿熻姤鑹惧﹢閬嶅箟閹间焦鍋嬮柛顐ｇ箘閻熴劎绱掗悙顒�鍔ゆい顓犲厴瀵濡搁埡鍌氫簻闂佸憡绻傜�氬懘鏁愭径瀣幗闂佽鍎抽崯鍧楀汲閿濆浄鎷峰▓鍨灈闁绘牕銈搁獮鍐ㄢ枎閹惧磭楠囬梺瑙勬儗閸樹粙藟鐎ｎ喗鈷戦悹鍥ㄧ叀閸欏嫭绻涙担鍐叉搐鍥撮梺褰掓？缁�渚�鎷戦悢鍏肩厪濠电偛鐏濋崝妤呮煛閿熻姤绂掔�ｎ偆鍘遍梺铏嫕閹风兘鏌￠崨顔剧煁闁哄懌鍎靛濠氬磼濞嗘埈妲梺鍦拡閸嬪﹪鐛繝鍛杸闁哄洨鍠庢惔濠囨⒑閸撴彃浜栭柛搴ㄤ憾閹锋垿鎮㈤崫銉ь啎闂佺懓顕崑鐔兼偂椤栨稓绠剧�癸拷婵犱線鍋楅梺鍝勭灱閸犳捇骞夐幘顔肩妞ゆ劑鍩勫鎾翠繆閻愵亜锟芥垿宕曢懠顒佸床闁告洦鍘介～鏇㈡煙閹呮憼濠殿垱鎸抽弻锝夋偄閸涘﹦鍑″銈庡亜缁夊墎妲愰幘瀛樺闁告挻褰冮崜閬嶆⒑閹肩偛濡兼繛灏栵拷宕囨殾婵炲樊浜濋崐鐑芥煕濠靛棗顏い鎾存そ濮婃椽骞愭惔銏⑩敍闂佸綊顥撻崗姗�寮婚敐澶婄闁告洦鍘鹃惁鍫ユ⒑閸濆嫭婀伴柣鈺婂灦瀹曟椽宕熼姘鳖槰闂佺粯鍔﹂崜娑㈠汲椤撶偐鏀介柣鎰▕閸ょ喎鈹戦鍛籍鐎殿喗鐓￠幃鈺侇啅椤旂晫绋佹繝鐢靛仜濡﹥绂嶅鍫濈闁煎摜鍋ｆ禍婊堟煙閹屽殶闁冲彞绶氶幃妤�顫濋鐘冲垱濠殿喖锕ㄥ▍锝囧垝濞嗗繆鏋庨柟顖嗗啫顥嶅┑鐘殿暯濡插懘宕戦崨娣拷鍐╃節閸ャ儻鎷锋担鍓叉僵閻犺桨缍嶉妸鈺傜叆闁哄倸鐏濋埛鏃堟煟閿曪拷閻楁挸顫忛搹鍦煓婵炲棙鍎抽崜楣冩⒑閹肩偛濡肩�规洦鍓熼垾鏃堝礃閳哄喚娴勯柣搴秵閻撳骞忛柨瀣懝闁跨喕妫勯锝夘敋閿熻棄鐣烽悡搴樻斀闁糕剝鐟у畷鍝勨攽閿涘嫬浜奸柛濠冩礈閹广垽骞囬弶璺ㄧ枃闁瑰吋鎯岄悡鍫ュ极閸岀偞鐓熼柣鏃傤焾椤ユ劙鏌￠敓鑺ョ鐎ｎ偆鍙嗗┑鐐村灦閿氭い蹇婃櫅闇夋繝濠傚暔閸嬨垽鏌＄仦鍓р檨缂佺粯绻堝畷姗�顢旈崟銊﹀闂佽姘﹂～澶娒哄Ο鍏煎床闁糕剝铔嬮崶鈺嬫嫹濞戞鑲╂崲閸℃稒鐓曟繛鍡楁禋濡茬鈹戦鑲┬ら柨鐔诲Г椤旀牠宕板Δ鍛闁规儼妫勭粻鏍煃閸濆嫭鍣洪柛瀣ㄥ姂濮婂宕奸悢鎭掞拷鎺撱亜閺傝法鐒告慨濠傤煼瀹曟帒鈻庨幋顓熜滈梻浣告贡閳峰牓宕戞繝鍌滄殾闁哄绨卞Σ鍫ユ煏韫囨洖啸妞ゆ柨妫濋幃妤呮偡閺夋浠炬繝鈷�浣稿姕闁诡垱妫冩俊鎼佸Ψ瑜嶉敓鐣屽仱閹嘲顭ㄩ崟顓犵杽閻庤娲樼换鍫ュ箖閵忋倕绀傞柤娴嬫櫅楠炲秴鈹戦敍鍕粶妞ゆ垵鎳忛〃銉╁箹娴ｇ尨鎷烽柨瀣╃箚闁绘劦浜滈敓绐栧洦鈷旈柛鏇ㄥ灠缁犱即鏌熼幆鐗堫棄闁藉啰鍠栭弻銊モ攽閸♀晜效闂佸搫鎳忛悡锟犲蓟濞戞ǚ妲堥柛妤冨仧娴犙呯磽娓氬洤鏋ら柡浣筋嚙椤繐煤椤忓懐鍔靛┑鐐村灦閸╁啴寮敓浠嬫⒒娴ｅ憡鍟為柡灞诲妿缁棃宕奸弴鐐殿唹闂侀潧绻掓慨顓㈠绩娴犲鍊甸柨婵嗙凹缁ㄤ粙鏌ㄥ☉娆戠煀闁宠鍨块幃鈺冩嫚瑜嶆导鎰版⒑閻熸澘绾ч柣鈺婂灡娣囧﹪骞栨担鍝ュ幐闂佺鏈悢顒勫箯閻戣姤鍋ㄩ柛娑橈工娴狀厼鈹戦悙鍙夘棞缂佺粯鍔欓、鏃堫敂閸℃瑧锛滈梺璺ㄥ枍缁瑩寮幘缁樺仼鐎癸拷閿熺晫澹曟禒瀣厱閻忕偟鍋撻惃鎴狅拷娑欑箞濮婃椽骞愭惔銏狀槱婵炲瓨绮犳禍婵囩┍婵犲嫸鎷峰☉娅虫垶鍒婄�靛摜纾兼い鏍ㄧ♁缁�鍐煟鎼粹槅鐓兼慨濠冩そ瀹曠兘顢橀悙鏉款棜婵犵數鍋涢崥瀣偡閿斿墽鐭夌�广儱鎲橀弮鍫濆窛妞ゆ梹鍎抽獮宥夋⒒娴ｄ警鐒剧紒缁橆殜瀹曟垿骞囬弶鎸庤緢濠殿喗顨愰幏鐑芥煛鐏炲墽娲撮柛鈹惧墲閹峰懘宕滈煫顓犵＞闂佽姘﹂～澶娒鸿箛娑樼？闁规儼濮ら弲鎼佹煛閸屾ê锟芥绮旈悽鍛婄厱闁规儳顕妴鎺戭熆鐟欏嫭绀冪紒鍌涘笧閿熸枻缍嗛崑鍡涘储闁秵鐓熼煫鍥ㄦ礀娴狅妇锟借娲樿摫缂佹梻鍠庨～婊堟晸娴犲钃熼柕濞炬櫆閸嬪嫰鎮归崶銊ф殭闁瑰墽绮悡娆愩亜閺冨倸甯堕柨鐔诲Г閹倿骞冩ィ鍐╁�婚柦妯侯槺閻わ拷婵＄偑鍊栭幐鍡涘礋閹冲嘲娲﹂悡娆撴煠閸︻厼顣肩憸鎶婂懐纾奸柟缁樺笚閸嬨儵鏌熼鎯т槐鐎规洘顨婇幊鏍煛閸愭儳鏅梻浣告惈椤︻垶鎮ч崱妯绘珷濞寸姴顑呯粻鏍р攽閸屾碍鍟為柣鎾存礋楠炴牜锟芥稒顭囬埥澶愭煥閻旇袚婵炶尙鍠栭獮鍐┿偅閸愨晛锟藉鏌﹀Ο渚Ъ闁硅姤娲熷娲濞戣鲸顎嗘繝纰橈拷铏枠鐎规洏鍨介幃浠嬪川婵炵偓瀚藉┑鐐存尰閼规儳煤閵堝拋鍤曢悹鎭掑妿绾惧ジ鏌ｅΟ鍝勬毐闁诲繑鎸抽弻鐔碱敊閻偒浜崺銉﹀緞婵炪垻鍠曠粻娑㈠即閻旈攱鐣俊鐐�ら崢褰掑礉閹存繄鏆︽慨妤嬫嫹妞ゃ垺妫冨畷浼存嚋椤掞拷婵倹鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敆娴ｇ懓顏伴梻鍌欒兌閸庣敻寮查埡鍛瀭閺夊牄鍔庨埞宥呪攽閻樺弶澶勯柛濠傤煼閺岋箑螣娓氼垱楔濡炪倖鎸搁幖顐︹�旈崘顔嘉ч柛鈩冪懃椤呯磽娴ｅ壊鍎愰柛銊ユ健閵嗕線寮崼鐔锋疂闂佹眹鍨婚弫鎼佹儊閸垻纾奸柛鎾楀喚鏆梺鎸庤壘椤儻顦堕悘蹇旂懇楠炲骞栨担鍝ラ獓闂佸壊鐓堥崰妤�鈻撴繝姘拺閻犲洠锟借櫕娈梺鎼炲劀閸滀礁鏅梻浣藉吹婵潙煤閳哄啩鐒婃い蹇撶墕缁犳椽鏌￠崶鈺佷汗闁猴拷娴犲鐓熼柟閭﹀幗缂嶆垿鏌ｈ箛鏇炴灈闁哄本鐩崺鈩冩媴閸撹弓绱旈柣搴㈩問閸ｎ噣宕戞繝鍌滄殾婵鎷锋い銏＄懇閹墽浠﹂挊澶岊啈婵犵數濮烽。钘壩ｉ崨鏉戝瀭濞寸厧鐡ㄩ崐鑸电節闂堟侗鍎愰柛搴＄Ч閺屾稑鈹戦崱妞绘灆閻熸粎澧楃敮妤呭磻閹扮増鐓犲┑顔藉姇閿熻姤顨婂鎶筋敃閳垛晜鏂�濡炪倖姊婚妴瀣礉閻斿吋鐓曢幖瀛樼☉閿熻姤顨婇弫鎾绘偩鐏炵偓姣勯梺鍛婎焼閸パ呭幒闁瑰吋鐣崝宀�绮婚敐澶嬬厽婵☆垳鍝�閹寸姴鏋堢�广儱妫涢埞宥呪攽閻樺弶澶勯柛濠勫厴閹鈽夊▎妯煎姺缂備礁顑呭ú顓烆潖閾忚鍏滈柛娑卞帨閹惧墎纾兼い鏃囧Г瀹曞矂鏌ｅ☉鍗炴珝妤犵偛顑夐弫鍐晸娴犲缍栭柛娑樼摠閻撶喐鎱ㄥΔ锟藉Λ妤佺濠靛洢浜滄い鎰╁灮鏁堝┑顔硷攻濡炶棄螞閸愩劉妲堟慨姗�纭搁崬鍝勨攽閻樻剚鍟忛柛鐘冲哺瀹曟顫滈敓浠嬪Υ娴ｅ壊娼ㄩ柨鐔绘閻ｇ兘顢曢敃锟界粈瀣煏婵犲繘妾柡澶嬫倐濮婄粯鎷呴搹鐟扮濡炪値鍘煎ú銊╁礆閹烘鏁嶆慨姗堢稻椤秹鎮峰鍕棃鐎殿喖顭烽弫鎰板川閸屾稒顥堥柡浣规崌閹稿﹥绔熼埡鍌溾槈闁宠鍨剁换婵嬪礋椤撶偞鏆ラ梻鍌氬�搁崐宄懊归崶褉鏋栭柡鍥ュ灩缁愭鏌￠崶鈺侊拷锝呪槈閵忕姷顦板銈嗙墬濮樸劑宕㈤幘顔解拺缁绢厼鎳忚ぐ褔姊婚崟顐㈩伃鐎规洘鍔栭ˇ鐗堟償椤栨稑顏堕梺鑽ゅ枑濠㈡﹢藟韫囨稒鐓曢柣妯虹－婢ь亪鏌嶇紒妯诲磳鐎规洖銈稿鎾偄閸欏顏归梻鍌氬�搁崐鎼佹偋婵犲嫮鐭欓柟鐑橆檪婢跺鐓ラ柛鏇楁櫃缁ㄥ姊洪悷鎵憼缂佽绉磋灒闁跨喍绮欏铏圭磼濡湱绻侀梺鍝ュУ缁嬫挾鍒掔拠娴嬫婵☆垶鏀遍～宥呪攽閻愬弶顥為柛鏃�鐗犻、鏃堟偄閸忓皷鎷绘繛杈剧秬婵倗娑甸崼鏇熺厱闁挎繂绻掗悾鍨殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�
				List<Long> allRoles = new ArrayList<Long>();
				Team team = TeamManager.selectTeamByRoleId(roleid);
				if (team != null) {
					allRoles.addAll(team.getNormalMemberIds());
					mkdb.Procedure.psend(allRoles, new SMacthResult(npckey, 0));
				}
				
				if (npcBattle.getBattleroles().size() == 0)
					xtable.Npcbattleinfo.remove(npckey);
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795670;

	public int getType() {
		return 795670;
	}

	public long npckey; // npckey

	public CAbandonMacth() {
	}

	public CAbandonMacth(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonMacth) {
			CAbandonMacth _o_ = (CAbandonMacth)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonMacth _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


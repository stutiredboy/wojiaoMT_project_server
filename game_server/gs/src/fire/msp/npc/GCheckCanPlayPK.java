
package fire.msp.npc;
import fire.pb.battle.PPlayPKFightView;
import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.GridPos;
import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCheckCanPlayPK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCheckCanPlayPK extends __GCheckCanPlayPK__ {
	@Override
	protected void process() {
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		Role gestRole = RoleManager.getInstance().getRoleByID(guestid);
		GridPos hostGridPos = hostRole.getPos().toGridPos();
		GridPos guestGridPos = gestRole.getPos().toGridPos();
		
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鍋傞柣鏃傚帶缁犲綊鏌熺喊鍗炲箹闁诲骏绲跨槐鎺撳緞鐏炵偓姣堥梺鍝勬湰缁嬫牜绮诲☉銏犵睄闁瑰墽娅㈤幏椋庢崉椤帗瀚规繛鍫濈仢閺嬬喖鏌熼鐓庯拷鎼侇敋閿濆棛顩烽悗锝呯仛閺咃綁姊虹紒妯荤叆闁搞倖鐗犻獮蹇涙倻閽樺鐎銈嗗姦閸嬪懘顢欓弮鍫熲拺缂備焦锚婵矂鎮樿箛鏃傛噭缂佸倹甯℃慨锟介柕鍫濇閸橀亶姊洪崫鍕灕闁圭兘顥撻惀顏堝级鐠恒剱锝囩磼瀹�鍐摵缂佺粯绻堝畷鍫曟嚋閸偅鐝栭梻鍌欑劍鐎笛呮崲閸屾娲晝閸屾岸妫峰銈嗘穿閹烽攱鎱ㄦ繝鍐┿仢闁圭绻濇俊鍫曞川椤旂晫鏆氶梻鍌欑劍閹爼宕曢鐐茬濠㈣埖鍔曠粻顖滅磽娴ｈ鐒界紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈哥紓鍌欒兌缁垶鎯勯鐐茬疇婵犻潧顑呯痪褔鏌涢…鎴濇灍闁稿寒浜缁樻媴閻戞ê娈岄梺鎼炲灱鐏忔瑧妲愰悙瀵哥瘈闁搞儜鍛毇闂備線娼х换鍫ュ磹閺嶎厼纾婚柛宀�鍋涚粻褰掑级閸繂鈷旂紒澶婄仛娣囧﹪鎳犻锟介崢鎾煛瀹�瀣ɑ闁诡垱妫冮弫鎰板幢閳猴拷閹寸兘姊绘担鍝ョШ妞ゃ儲鎹囧畷妤�顫滈敓钘夘嚕鐠囨祴妲堥柕蹇曞Т瀹撳棝姊洪棃娑辩劸闁稿孩澹嗛懞杈ㄧ節濮橆厸鎷洪柣鐘叉处瑜板啴鎯侀妸鈺傜厱婵炲棗绻愰弳娆撴懚閻愮儤鐓曟繛鎴炵懄閸庢鏌℃担绋挎殻闁哄本娲濈粻娑欑節韫囨柨顏堕梺褰掝暒閻掞箒鈪稿┑鐘垫暩婵兘寮幖浣哥；婵炴垶锕╅崵鏇㈡煕椤愶絾绀冮柛瀣儔閺岋絽螣閻撳骸濡洪梺鎸庣☉閸婂湱鎹㈠┑鍡忔灁闁割煈鍠楅悘宥咁渻閵堝骸骞栭柣妤佹尭閻ｅ嘲煤椤忓嫬鍞ㄥ銈嗘尵閸嬬喖鏁嶅▎鎾粹拺婵懓娲ら悘鈺呮煙鐠囇呯瘈闁诡噯绻濇俊鐑芥晜閸撗呮闂傚倸鍊搁悧濠勭矙閹烘澶愭偐缂佹鍘遍梺鐟扮摠缁诲啰鎷归敍鍕＜閺夊牄鍔屽ù顔尖攽閳╁啯鍊愬┑锛勫厴閺佹劙宕ㄩ锟介崹婵嬫⒒閸屾瑧顦﹂柟纰卞亰瀵敻顢楅崟顒�鍓銈嗙墬閸戝綊宕甸弴銏＄厵缂備降鍨归弸娑欍亜椤愩垺鍤囬柡灞炬礉缁犳稓锟斤綆浜炴禒鎯р攽椤曞棛鍒版繛宸幖椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘缁樷拺闁告繂瀚晶閬嶆煕閹捐泛鏋涙鐐叉瀹曠喖顢涢敐鍡樻珫婵犵數鍋為崹鍫曘�冮崼銏笉婵鍩栭埛鎴犵磽娴ｅ顏堟倶鏉堛劋绻嗘い鎰╁灩椤忊晠鏌℃笟鍥ф珝婵﹦绮粭鐔兼晸閽樺鐒界憸鏃囨濡炪倖鎸堕崹褰掑垂閸岀偞鐓ｉ煫鍥ㄦ礃椤忕喖鏌熸搴″幋鐎规洖缍婇、鏇㈠Χ閸滀焦妞掔紓鍌氬�烽懗鍓佸垝椤栨粍宕查柛顐犲劚缁犳牕霉閻樺樊鍎愭い銉ョ墛缁绘盯骞嬮悜鍡樼暭闂佺顫夊ú鐔奉潖缂佹ɑ濯撮柧蹇曟嚀缁椻�愁渻閵堝啫濡奸柟铏耿瀵偊宕橀鍛櫆闂佸憡娲﹂崢钘夆枔妤ｅ啯鍋℃繝濠傛噹椤ｅジ鎮介娑樻诞闁哄被鍔戞俊鍫曞幢閺囩姷鐣鹃梻渚�娼ч悧鍡欐崲閹寸媴鎷峰顒傜Ш婵﹥妞藉畷顐﹀礋闂堟稑澹嗛梻浣哄帶閸熷潡鎮ユ總绋挎瀬闁瑰墽绮�电姴顭跨捄铏圭伇闁哄棙鐩铏圭矙閸ф寮版繛瀛樼矊閻栧ジ鎮伴鐣岀瘈闁搞儜鍛澑闂備礁鎼ˇ鎵拷绗涘嫭缍囬柛顐犲劜閳锋垹绱掗娑欑濠⒀嗗皺缁辨帞锟斤綆鍋勫ù顕�鏌熼鍡欑瘈鐎殿喗鎸虫慨锟介柨娑樺楠炴劙姊绘担瑙勫仩闁稿寒鍨跺畷鏇熸綇閵娿倗绠氭繝闈涘�搁幉锟犳偂閺囩喍绻嗘い鏍ㄧ矊閸斿鏌熼幓鎺撴喐缂佽鲸甯楀蹇涘Ω閵夛箒鐧佹俊鐐�戦崹鍝勭暆缁嬭法鏆﹂柕濞炬櫓閺佸洭鏌ｅΟ鍧楀摵妞ゃ垺锕㈠濠氬磼濞嗘埈妲梺鍦拡閸嬪﹪骞嗙仦鎯х窞鐎癸拷閿熺晫绮堟繝鍌橈拷鎺戭潩閻愵剙顏舵俊銈囧Х閸嬫盯宕�涙ɑ鍙忛柨鐔剁矙閺屾洟宕煎┑鍥ф缂備焦鍔栫粙鎺旀崲濠靛鍋ㄩ梻鍫熷垁閵忋倖鍊垫慨姗嗗墯閹插憡淇婇崣澶婂婵炵厧绻橀崺锟犲礃椤忓海闂梻鍌欒兌椤牓寮甸鍕仭鐟滃繒鍒掓担鍐杸婵炴垶鐟ч崢鐢告倵閻熸澘顏繝銏∶嵄濠电姵纰嶉悡蹇涙煕閳╁厾顏嗙箔閹烘挶浜滄い鎰剁悼缁犵偤鏌熼鐣屾噰妞ゃ垺顨婇弫鎾寸鐎ｅ灚鏅滈梺鍓插亝濞叉﹢鎮￠悢鐓庣婵烇綆鍓欓敓濮愬�曢…鍥箛椤撶姷顔曢梺鍛婄懃椤﹁京绮婚悙鐑樼叆婵犻潧鐗嗘禒锔撅拷鍨緲鐎氼剟鎮惧┑瀣櫢濞寸姴顑嗛崕妤�顭块懜闈涘闁绘挻鐟╅弻锝夊箣閻愬棙鍨胯棢闁哄稁鍘介悡娆忣渻鐎ｎ亪顎楅柛妯绘尦閺屸剝鎷呴悷鏉款潔闂佽鍨遍弻銊╁煘閹达箑閱囨繝闈涙閻︽挻绻濈喊澶岀？闁稿鍨垮畷鎰板箣閿曪拷绾惧潡鏌ょ喊鍗炲鐎规洘鐓￠弻娑樼暆閿熶粙宕戦幇鐗堟櫢闁兼亽鍎查ˉ鍫拷瑙勬礃閿曘垽銆佸▎鎾冲簥濠㈣鍨板ú锕傛偂閺囥垺鐓冮柍杞扮楠炴ɑ銇勮箛鎾跺婵懓寮舵穱濠囧Χ閸涱喖娅ら梺鎶芥敱閸ㄥ潡寮诲☉妯锋斀闁告洦鍋勬慨搴ㄦ煛瀹ュ繒绡�婵﹥妞藉畷銊︾節閸愶絾瀚绘俊鐐�戦崝宀勬晝椤忓牏宓侀柛鎰靛枟閸嬵亝銇勯弽鐢电ɑ闁宠鏈换婵嗏枔閸喗鐏堥梺鎸庢穿婵″洭宕氶幒妤婃晬闁绘劘灏欓鍡涙⒑閸涘﹦鈾佹繛鍏肩懃椤斿繐鈹戦崱蹇旀杸闂佺粯蓱瑜板啴鏁撻悾灞惧殌闁崇粯鎸搁～婊堟晸閽樺娼栫紓浣股戞刊鎾煣韫囨洘鍤�缂佹せ锟芥枼鏀介柍钘夋娴滄粎绱掔紒妯忣亪鎮惧畡閭︾叆闁割偆鍠庢禍婊勭節闂堟稑锟芥悂藝閹殿喚绀婇幖娣灮缁犻箖鎮楅悽娈跨劸鐎涙繂顪冮妶鍡楃仴闁硅櫕鍔楅崚鎺楀醇椤喗瀚归柨婵嗛娴滄牕霉濠婂嫮鐭掗柡宀�鍠栭弻鍥晝閿熻姤鏅舵繝姘厱閹兼番鍨婚惌宀�绱掓潏銊﹀碍妞ゆ挸銈稿畷鐔碱敇閻橀潧搴婇梻鍌欒兌缁垱绗熷Δ鍛棷闁挎繂鎷嬮崵鏇灻归悩宸剰閹喖姊洪幐搴㈢┛闁圭兘鏀遍妵鍕償閵忊�崇闂佸疇顫夐崹鍧椼�佸▎鎾村仼鐎癸拷閿熶粙鎮鹃悽鍛娾拺婵炶尪顕ф禍婵囥亜閵娿儻宸ユい鏇秮楠炴﹢顢欑喊杈ㄧ秱闂備焦瀵х粙鎴狅拷姘煎墴閻涱喖螖閸涱喒鎷绘繝鐢靛Т妤犲憡绂嶅鍕閻犲泧鍛殸闁绘挶鍊濋弻鈥愁吋閸愩劌顬嬪銈傛櫊椤ユ捇骞夐幖浣哥睄闁割偅绻嗛幗鏇㈡⒑鐠恒劌鏋斿┑顔芥綑椤啴鎸婃竟婵嗙秺閺佹劖寰勭�ｎ偆褰哥紓鍌欓檷閸斿繘顢氳閳ユ棃宕橀鍢壯囧箹缁櫢鎷峰畷鍥跺晣濠电姷鏁搁崑娑㈡儑娴兼潙纾规繝闈涱儏缁犳牠鏌熼鍡嫹闁猴拷娴犲鍊甸柨婵嗙凹缁ㄨ姤銇勯敂鑺ョ凡妞ゎ亜鍟存俊鍫曞幢濡ゅ啰鎳嗛梻浣侯焾閿曪箓鈥﹂崼銉晪闁挎繂顦伴幆鐐淬亜閹扳晛锟芥鎯侀崼銉︹拺婵懓娲ら悘鍙夌箾娴ｅ啿瀚々鐑芥煥閺囩偛锟藉綊鎮￠弴銏＄厪濠电偛鐏濋崝銈夋煕閳哄绉柡灞界Ч婵＄兘顢涘鍛闁诲氦顫夊ú鏍Χ閹间焦鏅查柣鎰閺佸﹪鏌﹀Ο渚▓濞村吋鎸荤换婵嗏枔閸喗鐏嶉梺鎸庢皑閿熷�燁潐濞诧箓宕滈悢鐓幬ラ柛灞剧〒闂勫嫰鏌涘☉姗堝姛闁告﹩浜娲箹閻愭彃濡ч梺鍛婂姇瑜扮偟妲愰弮鍫熲拻濞达綀娅ｉ妴濠囨煛閸涱喚绠炵�规洘鍨挎俊鑸靛緞閸剚瀚瑰ù锝呭濞笺劑鏌ㄩ悢鍓佺煓妤犵偛鍟埢搴ㄥ箣椤栨稑顏跺┑鐐村灦椤忎即骞嬮敃锟界壕褰掓煟閹达絽袚闁抽攱甯掗湁闁挎繂鎳忛崯鐐烘煕閻斿搫浠遍柡灞剧洴婵℃悂鈥﹂幋鐐电Х闂備線锟芥稓鈹掗柛鏃�鍨块獮鍐╃鐎ｎ亜鐎銈嗗姂閸ㄥ湱鑺遍妷锔剧瘈闁汇垽娼ч埢鍫熺箾娴ｅ啿鍘惧ú顏勎╃憸宥嗘叏椤掑嫭鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍛仩缂侇喗鐟╅獮鎰償閵忊�愁伆缂傚倷鑳堕崑鎾愁熆濡偐鐭撻柟缁㈠枛閻撴繈鏌熼幑鎰靛殭闁藉啰鍠栭弻鏇熷緞濞戞粌鎮呴梺褰掝棑缁垳鎹㈠┑瀣仺闂傚牊鍒�閵忕姈鏃堟偐閸欏鏆堥梺鍝勬嚀閸╂牜鎹㈠┑鍡╂僵妞ゆ挾濮撮獮鍫ユ⒒娴ｇ瓔娼愮�规洘锚閳绘柨鈽夐姀鐘插殤濠电偞鍨堕悢顒勫箯瀹勬壋鏋旈柛顭戝枟閻忔洖顪冮妶鍡樿偁闁搞儜鍛绩濠电姰鍨奸崺鏍礉閺囶澁缍栭柛娑樼摠閻撶喐淇婇娑欍仧闁哥喎绻橀弻娑㈡倷鐎涙ǜ浠㈠┑顔硷功缁垶骞忛崨瀛樺�绘俊顖滃劋閻ｎ剚淇婇悙顏勶拷鏍洪敃鍌氱煑闁告劑鍔庨弳锕傛煙鐎涙濡囨俊鎻掔墛閹便劌螣婢剁鎯堝Δ鐘靛仦閹告悂鍩為幋锔藉�烽柡澶嬪灩娴犳悂姊洪幐搴㈢５闁哄懏鐩俊鎾箳閹惧墎鐦堝┑顔斤供閸橀箖宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃锟藉灝顕ｉ崘娴嬫瀻闁规儳顕崢閬嶆⒑閸濆嫬鏋﹂柟鐑筋棑缁辨帡顢欓懞銉ョ３閻庢鍠涢褔鍩ユ径鎰潊闁绘鏁稿澶愭⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庨幘宕囩暫闂佺粯鍨煎Λ鍕暜闂備礁鍟块幖顐﹀磹閸涘﹦顩峰┑鍌氭啞閳锋垹绱撴担濮戭亪鎮橀崡鐐╂斀妞ゆ柨鎼敓鑺ョ箓閻ｇ兘骞囬鐘电槇濠殿喗锕╅崢楣冨矗閸愩劉鏀介柍钘夋閻忕喖鎮归敓浠嬫晝閿熻棄宓勯梺鍛婄箓鐎氾拷闁哄啫鐗婇崑鎰版煕濞嗗浚妲搁柡瀣Т閳规垿顢欑涵閿嬫暰濠碉紕鍋犲Λ鍕偩閻戣姤鍊荤紒娑橆儐閺咃綁鎮峰鍐鐎规洘绻勭划娆愭償閹惧瓨鏉搁梻浣虹帛閸旀洖螣婵犲洤鍚归柣鏂垮悑閻撴洟鐓崶銊︻棖闁兼澘鐏濋埞鎴﹀焺閸愨晛鍞夐悗瑙勬磸閸旀垿鐛弽顓ф晣闁绘柨鎲￠悵婵嬫⒒閸屾瑧绐旀繛浣冲嫷娈介煫鍥ㄦ礃椤洟鏌￠崶銉ョ仼闁稿被鍔岄湁闁绘ê妯婇崕鎰亜閵夈儻鏀婚柕鍥у楠炲洭鍩℃担杞扮棯濠电姰鍨煎▔娑氾拷姘嵆瀵鎮㈤搹鍦厯闂佸壊鐓堥崰鎺楀箰閸愵亞纾藉〒姘搐閺嬫稒銇勯鐘插幋闁绘侗鍠栭鍏煎緞濡粯娅旈梻浣虹《閸撴繈鏁嬪銈呯箰閻栧ジ寮婚敐澶嬪亜闁告縿鍎查崳褔鏌ｆ惔銏犲毈闁告妫勯銉╁礋椤栨氨顦板銈嗙墬缁嬫捇宕㈤柆宥嗏拺閻熸瑥瀚粈鍐╃箾婢跺娲寸�殿喖鎲￠幆鏃堝Ω閿旀儳骞楅梻浣瑰缁诲倿藝閽樺）娑㈠箣閿旂晫鍘甸梺鍛婄懃椤︽壆浜搁敂鎾呮嫹鐟欏嫭绀堥柛鐘崇墵閵嗕礁螣濞嗙偓歇缂傚倷妞掔欢锟犲磻婵犲偆娼栭柧蹇氼潐鐎氭岸鏌熺紒妯虹瑨婵絾鍔楃槐鎾诲磼濮樻瘷銏′繆椤愶絿鎳呯紒顔碱儏椤撳ジ宕ㄩ鍛澑闂佽鍑界徊鑺ヮ殽閹间絸鍥敍閻愯尙鍘撮梺纭呮彧缁犳垿鐛姀銈嗙厓闁告繂瀚敓鑺ユ倐閹礁顭ㄩ崼鐔叉嫽婵炴挻鐔幏閿嬬箾娴ｅ啿娲﹂崑瀣煕閳╁啨浜楁繛鎴炃氶弸搴ㄦ煙閹咃紞闁伙綁绠栧娲礈閹绘帊绨撮梺鎼炲姀瀹曞灚绔熼弴鐔洪檮缂佸娉曟鍥⒑閸撴彃浜濈紒瀣灦娣囧﹪鎮惧畝锟界壕濂告煥閻旂儤娅曢柨鐔告灮缂嶅棝宕板Δ鍛亗婵炲棙鍔戞禍婊堟煛閸愩劍绁╅柛銈嗙懅閿熷�燁潐閹哥螞濠靛钃熸繛鎴欏灩閻撴盯鎮楅敐搴″闁伙箑鐗撻幃妤冩喆閸曨剛顦ㄩ梺鎸庢磸閸ㄤ粙濡存笟锟藉顕�宕煎┑鍡氾拷鍨渻閵堝棙灏靛┑顔碱嚟閼洪亶濡烽埡鍌楁嫽闂佺鏈懝楣冩晸閽樺妲婚棁澶愭煕閵夋埊鎷烽柡瀣墵閺岋繝宕堕妷銉т患闂傚倸鍋嗛崹鍫曞蓟閵娾晛鍗抽柣鎰嚋閹风兘宕妷褌绗夊銈嗙墱閸嬬偤鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�?//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙閸戠晫绱為崱妯碱洸闁绘劕鎼崒銊╂煙閹殿喖顣奸柍閿嬪灴閺屻倕霉鐎ｎ偅鐝斿銈忕到閵堟悂骞冨Δ鍐當婵炴垶蓱閹兼劕顩奸崨瀛樷拺闁告稑锕ユ径鍕煕閻樺啿鍝洪柟顔兼健閺佹挻绂掔�ｎ偀鎷洪柣鐔哥懃鐎氼剛绮堥崘鈺冪濠㈣泛顑囧ú鎾煏閸℃锟藉潡骞栬ぐ鎺戞嵍妞ゆ挾濯寸槐鍐测攽閻愯埖褰х紒韫矙楠炴牠顢曢姀銏℃噧闂傚倸鍊风欢姘焽瑜旈幃褎绻濋崶褏鐣洪梺绋挎湰閸戝綊宕甸弴銏″仯闁搞儯鍔庨妶瀛樹繆閹绘帞澧涢柟渚垮妼椤粓宕卞鍓у嚬闂備礁鎲″ú鏍疮閺夋埈娼栭柧蹇氼潐閸忔粓鏌涘锟介悞锔剧礊閸儲鈷戦柛娑橈攻閳锋劖绻涢懠顒�鏋欐俊顐犲灩閳规垿鎮╃紒妯婚敪濡炪倖鍨靛Λ婵嬪春濞戙垹绠抽柟鐐藉妼缂嶅﹪寮幇鏉垮窛妞ゆ挾鍟橀埡鍛�甸悷娆忓鐏忣厽淇婇锝庢疁婵狅拷娴ｇ硶鏀介柣妯款嚋瀹搞儵鏌涢悢璺哄祮鐎规洘妞介弫鎰板炊闁垮顏跺┑鐐茬墕閻忔繈寮稿☉娆嶄簻妞ゆ挶鍨洪弫鍗炃庨崶褝韬鐐寸墬閹峰懘鎳栧┑鍕闁哄本娲濈粻娑欑節閸愮偓缍夋繝鐢靛仜閸氬顫忛崷顓熷床婵犻潧鐗嗛弸鍫熶繆椤栨稒銇熸繛鍏煎灴濮婃椽骞栭悙鎻掝瀱闂佸憡顨嗘繛濠囩嵁閸愩剮鐔烘偘閳╁啯鏉搁梺璇插嚱缁蹭粙鎮樺璺虹柧婵犲﹤鍠氬〒濠氭煏閸繃顥為悘蹇ｄ邯閺屾盯濡搁敂濮愪虎闂佺硶鏅滈惄顖炵嵁鐎ｎ喗鏅滈柣锝呰嫰楠炲秹姊绘担绋挎倯缂佷焦鎸冲鎻掆槈濞嗘埈娴勫┑鐘诧工閸熺娀寮ㄦ禒瀣挃闁搞儜锟介弸宥夋煥濠靛棙澶勬い顐ｆ礋閺岀喖鎮滃鍡橆吂闂佽桨绀侀敃顏堝蓟閿濆鏅查柛娑卞枟閹烽亶姊洪棃鈺傦拷銉╁礃閻愵剙鐦滈梻渚�娼ч悧鍡椢涘▎鎴犵煔閻犳亽鍔庣壕鐣岋拷骞垮劚鐎氼喚绮ｉ弮鍫熺厪闁糕剝娲滈ˇ锕傛懚閺嶎厽鐓曟繛鎴濆船楠炴ɑ銇勯敂鍨祮婵﹥妞藉畷婊堟嚑椤掞拷鐢儵姊虹粙娆惧剰闁瑰啿閰ｉ崺銏狀吋閸滀礁鎮戞繝銏ｆ硾椤戝倿骞忕紒妯肩閺夊牆澧界粔顒佺箾閸滃啰鎮奸柡渚囧枛閳藉鈻庨幇顒�浼庡┑鐘垫暩婵挳宕愰懡銈囩煋闁惧繒娅㈤幏椋庢喆閸曨剛顦ㄧ紓浣筋嚙閻楀棝鎮鹃悜钘壩╃憸婵嬪箯瀹勬壋妲堟繛鍛版珪閸ㄧ敻鍩㈠澶婄倞妞ゆ帊璁查幏铏圭磽娴ｅ壊鍎愰悗绗涘喛鑰块柟娈垮枤绾惧ジ鎮楅敐搴′簻闁诲骏濡囩槐鎺楀磼濞戞ɑ璇炲銈冨灪閻╊垶骞冨▎鎴濆灊閻熸瑥瀚鍦磽閸屾艾锟芥悂宕愰悜鑺ュ�块柨鏇炲�归弲顏堟⒒娴ｇ瓔鍤欏Δ鐘茬箻濮婁粙宕熼姣硷箓鏌涢弴銊ョ伇闁轰礁娲弻锝夊箛椤撶喓绋囩紓浣瑰姈缁嬫挾妲愰幘瀵哥懝闁搞儜鍕粚婵＄偑鍊栧▔锕傚幢濞嗗氦鍩呮繝鐢靛У椤旀牠宕板璺虹疇闁规崘绉ú顏呮櫜闁搞儺浜滃皬闂佽崵濮村ú銈呂熸繝鍌橈拷鎺撶節濮橆厾鍘梺鍓插亝缁诲啴藟濠婂牊鈷戦柛娆忣槺閻帡鏌″畝锟介崰鏍箖濠婂牊鍤嶉柕澶涢檮濞堝摜绱撻崒娆掑厡缂侇噮鍨崇划娆撳箣閿旂粯鏅╅棅顐㈡处娓氭寮繝鍥ㄧ厽闁规崘娅曢幑锝夋煟椤愩垹顏柡宀嬬稻閹棃濮�閳轰焦娅涢梻渚�娼荤紞鍡涘闯閿濆懐鏆﹂柟杈剧畱缁�瀣亜閺嶇數绋婚柡鍜冪稻缁绘繈妫冨☉姗堟嫹婵犳埃锟斤箓宕煎┑鎰櫊濠电娀娼уú銏＄濠婂牊鐓涚�广儱鍟俊鍧楁煃閸欍儳绐旈柡宀嬬秮閺佹劙宕惰楠炲鈹戦纭峰姛缂侇噮鍨堕獮蹇涘川閺夋垵绐涙繝鐢靛Т閸婄懓鈻撳锟藉缁樻媴閸涘﹤鏆堝┑鈽嗗亝閸ㄥ灝顫忔禒瀣妞ゆ挾濮烽悞鍧楁倵楠炲灝鍔氭い锔垮嵆瀹曟劕鐣￠懜顒婃嫹閹烘埈娼╅柣鎾虫捣娴狀參姊洪崫鍕櫝闁哄懐濮撮～蹇斻偊鐟併倓姹楅梺鍦劋閸ㄦ娊宕版繝鍥ㄢ拺闁告稑鈾侀鍛珷闁伙絽鑻崹婵堢磽娴ｉ婊堝磻閸涘瓨鐓曢柟鑸妽濞呭洭鏌涘Ο鍏兼毈闁哄矉绲鹃幆鏃堟晲閸℃ɑ鐦庢俊鐐�ら崢濂告偋婵犲嫮鐭夐柟鐑橆殕閺呮繈鏌涚仦鍓с�掗柛姗�娼ч—鍐Χ閸℃瑥顫ч梺鐓庣秺缁犳牠銆侀弮鍫濈厸闁告侗鍣鎸庣節閵忥絾纭炬い鎴濇川瀵囨晸閼恒儳绡�闁汇垽娼у瓭闂佺锕ラ幃鍌炪�侀弮鍫晝闁挎梻鏅崢钘夘渻閵堝棙灏甸柛搴㈠灴閻擃剟顢楅崟顒傚幐闁诲繒鍋犻褎鎱ㄩ崒婊愭嫹濞堝灝鏋熸繛鍏肩懆閻忔帡姊洪幆褏绠婚柨鐔诲Г缁嬫挾绮堥崟顐熸斀闁挎稑瀚禍濂告煕婵犲啫鐏寸�规洖缍婂畷顐﹀礋鎼淬垻娲寸�规洘锕㈡俊姝岊槼婵炲牓绠栧铏圭磼濡纰嶇紓浣靛妼閻栫厧顕ｉ妸锔绢浄閻庯綆鍋嗛崢鍗烆渻閵堝棗濮﹂柛瀣缁傚秴鈹戠�ｎ偄娈愰梺鍝勭▉閸樹粙鍩涢幒鎳ㄥ綊鏁愰崶鈺傛啒闂佹悶鍊栭悷銉ㄧ亙闂佺粯锚瀵爼骞夐崫銉х＜妞ゆ梹顑欓崵娆愩亜閹惧啿鎮戠�垫澘瀚换婵嬪礋閸撲礁鎯為梻鍌氬�搁崐椋庢閿熺姴绀堟繛鍡樻尭绾拷闂佸搫娲㈤崹褰掓倷婵犲啨浜滈柟铏瑰仦鐎氬湱绱撴担鍝勭彙闁告洦鍘鹃鏇㈡⒑缁洖澧查柣鐔村劜缁傚秹宕滆绾惧ジ鏌涚仦鍓ь暡妞ゃ儯鍨洪幈銊︾節閸愨斂浠㈠┑鈽嗗亜閸燁偊婀侀梺闈涚墕濡盯鍩ユ径瀣ㄤ簻闁瑰墽鍋ㄩ崑銏拷瑙勬礀瀹曨剝鐏冩繝鐢靛С閼宠埖寰勯崟顖涒拻闁稿本鐟︾粊鎵拷瑙勬礈閺佽鐣锋导鏉戠疀闁绘鐗嗘禒顓㈡⒑闂堟冻绱＄�广儱妫楅璺衡攽椤旂瓔鐒介柛妯犲啠鏋嶇�广儱妫▓浠嬫煟閹邦厽鍎楁繛鍫熺矌閿熷�燁潐濞叉﹢鏁冮姀銈冿拷浣糕枎閹炬潙鐧勬繝銏ｅ煐缁嬫帞锟芥艾缍婇弻娑㈩敃閿濆棛顦梺鍛婄懄閹瑰洭寮诲☉銏犖ㄩ柨婵嗘噹椤姊洪幎鑺ユ暠閻㈩垽绻濆濠氭偄閻撳海顦ㄩ梺鍛婄懃椤︻垰鈻撳Δ鍛拺闁告繂瀚﹢浼存煟閳哄﹤鐏﹂柣娑卞櫍楠炴帒螖閿熺晫绮绘繝姘叄闊浄绲芥禍顖炴煟瑜岀欢姘潖缂佹ɑ濯撮柤鎭掑劘閿熻棄鍟撮弻锝夊箳閻愮數鏆ゅΔ鐘靛仦閸ㄥ灝鐣烽崼鏇ㄦ晢闁跨喓鏅划濠氬冀椤撶喓鍘撻梺鍛婄箓鐎氼參宕冲ú顏呯厱闁靛牆妫楅悘锕傛煏閸パ冾伃妤犵偞甯￠獮瀣敇閻旀籂鍥ㄥ�垫繛鎴炵懅缁犵偞鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敆婵犲啫顏舵俊鐐差儏鐎涒晠顢曢懞銉﹀弿婵妫楁晶濠氭煟閹烘梹娅曢柟鍙夋倐瀵噣宕煎┑鍫㈡毇闁荤喐绮嶉弻銊╂偩閻戣棄纭�闁绘垵妫欑�靛矂姊洪棃娑㈢崪缂佽鲸娲熼崺銉﹀緞閹邦厾鍘撻柣鐘叉处閻擄繝宕ｉ崟顒夋闁绘劘鎻懓璺拷娈垮枛閻栧ジ鐛�ｎ噮鏁嶆繛鎴烇供娴兼捇姊绘担绋款棌闁绘挸鐗撳畷顖炲籍閸ャ儰姹楅梺鍦劋閹稿憡绂嶈ぐ鎺撳�甸柣鐔告緲椤ュ繘鏌涢悩宕囧⒌鐎规洘绮撻獮宥夘敊閸撗嶇闯濠电偠鎻徊浠嬪箹椤愶附鍋熼柨鐔哄У閻撴洟鏌曟径娑氬埌濠碘�虫健閺屾稑螣缂佹ê纾抽梺鍝勫閸撴繂顕ラ崟顓濇勃闁瑰瓨甯楅崟鍐ㄢ攽閻橆喖鐏柟铏尭铻炴繝闈涙閺嗭附绻濋棃娑欙紞闁告艾顑呴…璺ㄦ崉娓氼垰鍓抽梺鍛婎焾濡嫰鈥旈崘顔嘉ч柛鈩兠弳妤呮⒑闂堚晝绁烽柛搴ㄤ憾閸┿垽骞樺鍕枛閹虫牠鍩￠崘璺ㄥ簥闂備礁鎼ˇ顖炴偋閸曨垰绀夐悘鐐电叓瑜版帩鏁嬮柨鐔剁矙瀵顓兼径濞€劍銇勯弽銊х煂闁哄棎鍊曡灃闁绘﹢娼ф禒锕傛偨椤栨鎷烽幇浣告濡炪倖娲╅幏椋庯拷瑙勬礃鐢帡鈥﹂妸鈺佺闁割煈鍋嗙粔濂告⒒閸屾艾锟芥悂宕愰幖浣哥９鐎瑰嫭鍣磋ぐ鎺戠倞鐟滄粌霉閺嶎厽鐓忓┑鐐戝啯鍣介柣鎺戝悑缁绘稒娼忛崜褏袣濠电偛鎷戠紞渚�骞嗗畝鍕缂備焦顭囬崢鐢电磽閸屾瑩妾烽柛銊ョ秺瀵悂鎮㈤崗鑲╁幈闁诲函鎬ラ崟顒傚絾缂傚倷鑳剁划顖滄崲閸惊娑㈠礃閵娿垺顫嶉梺鍛婎殘閸嬫稒绔熼崼銏㈢＝闁稿本鐟х粵蹇涙煙妞嬪骸鍘撮柡灞剧洴楠炲洭濡搁敂鑺ョ翻濠电偛鐡ㄧ划宥囧垝閹剧粯鍋傛い鎰剁畱閻愬﹪鏌曟繝蹇曠暠闂傚绉瑰娲箰鎼达絺妲堢紓浣割槸缂嶅﹤顕ｇ拠娴嬫闁靛繆锟藉厖绨婚梻鍌欑閻忔繈顢栭崨鏉戝嚑闁绘ɑ绁撮弨鑺ャ亜閺冨倶锟藉顔忛妷锔轰簻妞ゆ挾鍋涘Σ濠氭煟閿濆洤鍘存鐐村浮楠炲寮敓浠嬫倵婵犳碍鈷戦柣鐔稿閹界姷绱掔拠鎻掞拷鍧楀灳閺嶃劌绶為柟閭﹀幘閸樹粙姊虹紒妯荤叆闁硅姤绮撻幆宀�锟斤綆鍋嗙弧锟介梺闈涚箚濡插嫰鎳撶捄顭掓嫹鐟欏嫭澶勯柛銊ョ埣閻涱喖顫滈敓浠嬨�佸▎鎾村殐闁冲搫鍟悗顕�姊婚崒娆掑厡缂侇噮鍨伴～蹇旂節濮橆剛鍘遍梺鍓插亖閸庨亶寮告担鐚存嫹楠炲灝鍔氭俊顐ｇ懇瀹曪綀绠涢弬鍓х畾濡炪倖鐗楃喊宥夊箚閸儲鐓欐い鏃囨閻忔挳鏌＄仦鍓р槈妞ゆ挸銈稿畷鍫曞Ω閿旂晫妲楀┑鐘愁問閸犳牠鏁冮妷銉富闁芥ê锛夊☉銏犵闁靛鍨洪～宥夋煛婢跺﹦澧愰柡鍛閵囨劗锟斤綆浜栭弨浠嬫煟濡椿鍟忛柡鍡╁灦閺屻劑鎮㈤崙銈嗗闁绘柨鎽滆ぐ褔姊洪崫銉バｉ柨鏇樺灲瀵鈽夐姀鐘靛幋闂佸壊鐓堥崰姘閸儲鍊垫繛鍫濈仢濞呮﹢鏌涢敐蹇曞埌闁伙絿鍏橀獮鎺懳旀担瑙勭彆闂備浇濮ら敋妞わ箒濮ょ�靛ジ骞樼紙鐘电畾闂侀潧鐗嗗ú銈呮毄闂備胶顭堥鍡涙儎椤栫偛绠栨俊顖濄��閺�浠嬫倵閿濆簼绨芥い锔诲枛閳规垿顢欓弬銈勭返闂佸憡顭堥～澶岀矉瀹ュ拋鐓ラ柛顐ゅ枔閸欏棝姊洪崫鍕灕闁归鍏橀弻娑欐償閵忕姭鏋欓梺闈涙閸婂潡骞婇弽顓炵厸闁告劦浜风槐鏌ユ⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮悩鐢电暥闂佸湱鍎ら幐鑸电濠婂嫨浜滈柟鏉垮閹ジ鏌ｉ鐔锋诞闁哄备鍓濋幏鍛喆閸曨偊鐎虹紓鍌欑閸婂湱鏁悙鐑樻櫢闁哄倶鍊楃粔闈浢瑰鍛槐闁诡喗鍎崇叅妞ゅ繐鎳夐幏铏圭磽閸屾瑧鍔嶉柨姘舵煟韫囨岸鍝哄ǎ鍥э躬椤㈡洟濮�閻欙拷娴煎啴鎮楃憴鍕┛缂佺粯绻堥獮鏍亹閹烘繃鏅濋梺鎸庣箓閹冲孩瀵兼惔銏㈢瘈婵炲牆鐏濋弸鐔搞亜閵婏箑濮嶆鐐茬箲椤︾増鎯旈敐鍡础婵＄偑鍊栭幐鐐垔椤撱垺鍊垮Δ锝呭暙绾拷闁哄鐗勯崝濠冪濠婂牊鐓涢柛鎰╁妼閿熺晫鏁婚獮蹇涘焺閸愵亞顔曢梺鍦亾閸撴岸鎮℃總鍛婄厸閻忕偟鍋撶粈瀣拷瑙勬礈閸樠囧煘閹达箑閱囬柕蹇婃櫅閺呫儵姊婚崒娆戭槮闁硅绻濋幊婵囥偅閸愩劎锛欓梺绉嗗嫷娈旈柦鍐枛閺屻劑鎮㈤崫鍕戙垻锟界懓鎲＄换鍐Φ閸曨垰鍐�闁靛鍎抽崝浼存⒑閸濆嫷鍎忛柟鍐叉唉閻忓啴姊虹紒姗堣�挎繛浣冲嫮顩锋繝濠傜墛閻撴洟鏌ｉ弬鎸庡暈缂傚秵鍨块弻锝夋晲婢跺鏆犵紓浣芥閺咁偆鍒掑▎鎾冲瀭妞ゆ棁鍋愰妶顕�姊婚崒娆掑厡缂侇噮鍨跺畷婵單熼梻瀵稿墾濡炪倕绻愰悧濠囧疾閹间焦鐓㈡俊顖欒濡插綊鏌涚�ｃ劌鍔滈柟渚垮妽缁绘繈宕橀埞澶歌檸闁诲氦顫夊ú锕傚磻婵犲倻鏆﹂柣鏃傗拡閺佸棝鏌ㄩ悢鐑樻珪缂侇噯绲介埥澶娾枎閹寸姷妲囨繝鐢靛仜閻楀棝鎮樺┑瀣嚑闁绘柨鍚嬮悡娆戠磼鐎ｎ亞浠㈤柡鍡氶哺閵囧嫰寮撮鍡櫺滈悗娈垮枛椤攱淇婇悜鑺ユ櫆闁兼亽鍎烘禒褔姊婚崒娆愮グ婵炲娲熷畷鎶芥晝閸屾氨顔嗛梺璺ㄥ櫐閹凤拷
		if (hostRole.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())
				&&gestRole.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(guestGridPos.getX(), guestGridPos.getY())) {
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顖毿撻柟渚垮妼椤粓宕卞Δ锟介埛鎺楁⒑缂佹ê绗傜紒顔界懇瀵濡堕崱妯哄伎闂佸綊鍋婇崜銊╁箯閻戣棄鍐�妞ゆ劦鍓氱�氳鎱ㄥ鍡楀⒒闁绘挸銈搁弻鈥崇暆鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘埈娼╂い鎴ｆ硶鐢稓绱撻崒姘拷椋庢閵堝绠�瑰嫰鍋婇悢鍡涙偣妤︽寧顏犻柣鎺戞健閺岀喐顦版惔鈥冲箣闂佺粯渚楅崳锝呯暦瑜版帩鏁婇柣鎾冲瘨濞兼稑鈹戦敍鍕杭闁稿ě鍜冩嫹闂堟稓鐒哥�规洜鎳撻悾鐑藉炊瑜嶉悘濠囨⒑閸濆嫬顏╃紒璇茬墛缁傚秷銇愰幒鎾跺幍闂佺粯鍨惰摫閻忓繒鏁婚弻娑橆潨閸℃洜鍑圭紓浣虹帛缁诲牓骞冩禒瀣棃婵炴垶顨嗛崺娑㈡⒒娴ｄ警鐒炬い鎴濇楠炴劙骞栨担鍝ュ幒閻庡箍鍎遍ˇ顖氼啅濠靛鍊垫繛鎴炵懐閻掍粙鏌涘Ο鎸庮棄妞ゎ亜鍟存俊鍫曞幢濡缚鏁块梻浣告啞閺屻劎绮旈崼鏇熸櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�?
			if (!(hostRole.getScene().getMapID() == PPlayPKFightView.CQMAPID && gestRole.getScene().getMapID() == PPlayPKFightView.CQMAPID)){
				MessageMgr.sendMsgNotify(hostid, 120063, null);
				return ;
			}
			Team team = TeamManager.selectTeamByRoleId(hostid);
			if (team!=null){
				if(team.isInTeam(guestid)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 141389, null);
					return;
				}
			}
		}
		SceneClient.pSend(new MCheckCanPlayPK(hostid, guestid));
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730413;

	public int getType() {
		return 730413;
	}

	public long hostid;
	public long guestid;
	public int checklevel;

	public GCheckCanPlayPK() {
	}

	public GCheckCanPlayPK(long _hostid_, long _guestid_, int _checklevel_) {
		this.hostid = _hostid_;
		this.guestid = _guestid_;
		this.checklevel = _checklevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(hostid);
		_os_.marshal(guestid);
		_os_.marshal(checklevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		hostid = _os_.unmarshal_long();
		guestid = _os_.unmarshal_long();
		checklevel = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCheckCanPlayPK) {
			GCheckCanPlayPK _o_ = (GCheckCanPlayPK)_o1_;
			if (hostid != _o_.hostid) return false;
			if (guestid != _o_.guestid) return false;
			if (checklevel != _o_.checklevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)hostid;
		_h_ += (int)guestid;
		_h_ += checklevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(hostid).append(",");
		_sb_.append(guestid).append(",");
		_sb_.append(checklevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GCheckCanPlayPK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(hostid - _o_.hostid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(guestid - _o_.guestid);
		if (0 != _c_) return _c_;
		_c_ = checklevel - _o_.checklevel;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


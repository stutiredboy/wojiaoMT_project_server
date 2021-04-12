
package fire.pb;

import java.io.UnsupportedEncodingException;

import fire.pb.cross.CrossManager;
import fire.pb.role.PCreateRole;
import fire.pb.util.CheckName;

import org.apache.log4j.Logger;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateRole__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}


public class CCreateRole extends __CCreateRole__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	
	private boolean  sendError(int err){
		final SCreateRoleError res=new SCreateRoleError();
		res.err=err;
		return gnet.link.Onlines.getInstance().sendResponse(this, res);
	}
	
	@Override
	protected void process() {
		if(CrossManager.getInstance().isInCrossServer()){
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞剧洴閳ワ箓骞嬪┑鍛晼婵＄偑鍊愰弲婊嗐亹閸愵喗绠掗梻浣虹帛閿氭俊顖氾躬瀹曟洝绠涢弴鐘碉紲闂佽法鍠曟慨銈咁嚗閸曨偆鏆嗛悗锝庡亜椤忚泛螖閻橀潧浠滈柣蹇旂箞瀹曟繂顫濋懜鐢靛幍闂備礁鐏濋鍛存倶閹绢喗鐓欓柧蹇ｅ亝瀹曞瞼锟借娲滈…鍫ｇ亙婵炶揪绲介幖顐︾嵁閸儲鈷掑〒姘炬嫹婵炰匠鍥佸洭顢橀姀鐘茬�梺鍛婄箓鐎氀囧几瀹ュ鐓曢柕澶樺枛婢ь垶鏌ｉ幘璺烘瀾闁靛洤瀚伴獮妯兼崉閸濆嫬顥庢繝纰橈拷鍐茬骇闁诡喖鍊歌灋濞达絿鎳撶欢鐐烘煙闁箑骞橀柛娆忔閳规垿鎮╃紒妯婚敪濠碘槅鍋呯粙鎺楀疾閸洘鐒肩�广儱妫涢崢閬嶆⒑闂堟稓澧曢柟鍐查叄瀵娊鏁愭径瀣幐闁诲繒鍋涙晶钘壝虹�涙﹩娈介柣鎰彧閼板潡鏌熺粵鍦瘈濠碘�崇埣瀹曞爼濡搁敂鐐潧闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曢敃锟界�氬銇勯幒鎴濐仾闁稿骸瀛╅妵鍕冀椤愵澀鎴烽悗瑙勬尫缁舵岸寮婚悢鍏煎�绘慨妤�妫欓悾鍓佺磽娴ｅ搫孝妞ゎ厾鍏樺璇测槈閵忕姈鈺呮煥閺冨牊鏆滄俊淇卞妼椤啴濡舵惔鈥茬盎缂備礁顦晶搴∥ｉ幇鏉跨閻犲洩灏欓敍婊冣攽椤旀枻渚涢柛鎾卞姂楠炲繘鎮滈挊澶岊啇婵炶揪绲介幗婊堟晬濞嗘挻鍋℃繝濠傛噹椤ｅジ鎮介娑樼缂侇喖顭峰鍓佹嫚閻愵剚顥堥柡浣瑰姍瀹曘劑顢橀悢鍓插敳缂傚倸鍊烽懗鑸垫叏閻戣棄绐楅柡宥庡幖閽冪喖鏌ｉ弮鍥仩缁炬儳銈搁弻鏇＄疀閺囩倫锝夋煟韫囨挾澧㈢紒杈ㄦ尰閹峰懘宕崟鎴到閳规垿鎮欑拠褑鍚悗娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓欓敓鐣屽仱濮婅櫣锟藉湱濮甸妴鍐磼閿熻姤鎷呴崷顓犲骄婵犮垼娉涜墝闁猴拷娴犲鐓冮柦妯侯槹椤ユ粌霉濠婂牏鐣洪柡宀�鍠栧畷娆撳Χ閸℃浼�!!!");
			return;
		}
		
		if(!fire.pb.main.ConfigManager.isCanCreateRole) {
			sendError(SCreateRoleError.CREATE_CREATE_GM_FORBID);
			logger.error("GM闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч閿濈偛鈹戠�ｎ偅娅囬梺绋跨焿婵″洨绮欒箛鏃傜瘈闁靛骏绲介悡鎰版煕閺冿拷閻楃姴鐣烽幋锕�围濠㈣泛顑囬崢鎼佹⒑閹肩偛鍔楅柡鍛☉閻剟姊绘担铏瑰笡閻㈩垱甯￠弫鍐Ψ瑜庡畷鍙夌箾閹存瑥鐏╂鐐灪娣囧﹪顢涘┑鍥朵哗婵炲濮甸幐鍐差潖濞差亜绠归柣鎰絻椤绱撴担绛嬪殭闁绘鎸搁锝嗙節濮橆儵鈺呮煃閸濆嫬锟藉憡绂嶅鍫熲拺闁告稑锕︾粻鎾绘倵濮橆剚鍤囧┑顕嗘嫹闂侀潧绻堥崹濠氭晬濠婂牊鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噧闁伙絿鍏橀獮鎺懳旀担闈╂嫹閻戣姤鍊甸柣銏☆問閻掔偓顨ラ悙鑼ф慨濠勭帛閹峰懐绮电�ｎ亝鐣伴梻浣规偠閸斿苯鐣烽鍕拷锕傚垂椤斻儳鍠庨埢搴ㄦ倷椤掍胶妲梻鍌氬�搁崐鎼佸磹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鍣介柣顓熺懇閺岀喖鎮滃Ο鐑橆啎濠电偞鍨崹鍦矆閸愨斂浜滈柡鍐ㄦ搐椤ュ秹鏌熼懞銉︾闁宠鍨块幃娆撳级閹寸姳鎴烽梻浣规偠閸斿苯锕㈡潏鈺佸灊濠电姵鑹剧粻顕�鏌ら幁鎺戝姢闁告鏁诲铏规嫚閳ュ磭锟藉鏌涘☉鍗炲⒋闁稿顨嗙换婵堝枈濡搫鈷夐悷婊勬緲閸熸挳骞冭缁犳盯寮撮悤浣圭稐闂備浇顫夊畷姗�顢氳婢规洟宕楅崗鐓庡伎濠殿喗顨呭Λ妤佹櫠妤ｅ啯鐓欏瀣閻掑潡鏌曢崶銊ュ妤犵偞甯￠獮瀣偑閿熶粙宕捄琛℃斀閹烘娊宕愯瀵板﹥绂掔�ｎ亞鏌堝銈嗗姂閸婃绋夊澶嬬厽闁哄倸鐏濋幃鎴︽煟閹惧鎳呯紒杈ㄦ尰閹峰懘妫冨☉姘偅闂備礁鎼鍡欑矙閹捐埖顫曢柟鐑橆殕閸嬫劙鏌涢幇顓犮偞闁哄鐟╁娲传閸曨厾鍔圭紓浣虹帛缁诲倿鎮鹃悜钘夐唶闁哄洨鍋熼崢鍛婄箾鏉堝墽鎮兼い顓炵墦钘熼幖娣灮缁★拷缂佸墽澧楄摫妞ゎ偄锕弻娑氾拷锝庡亝瀹曞本顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷!!!");
			return;
		}
		
		// protocol handle
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;		
		final xbean.User u = xtable.User.select(userID);
		// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓鏌ｉ悩杈劅闁绘挸顦甸獮蹇旑槹鎼淬垹鏋傞梺鍛婃处閸撴盯藝閵夈儮鏀介柣鎰邦杺閸ゅ绱掗悩铏碍妞ゆ洩缍佸畷妯侯啅椤旀儳寮抽梻浣稿閸嬪棝宕伴幘璇茬煑闁告洦鍨遍ˉ濠冦亜閹扳晛鐏璺哄缁绘盯宕ｆ径娑滐拷鎸庛亜閵忊剝顥堥柟顔哄灲瀹曟鎳栭埡浣哥婵犵绱曢崑娑㈩敄閸涱噮娈介柟闂寸閸屻劑鏌熺紒銏犳灍闁绘挻鐟﹂妵鍕籍閿熶粙宕曢幎钘夊偍閻庢稒锕╁▓浠嬫煟閹邦垰鐨洪弫鍫濐渻閵堝啫鐏柣鐔叉櫊楠炲﹪寮介鐐靛幐婵炶揪绲介幗婊堫敊閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繐霉閸忓吋缍戦柛銊ュ�块弻锝夊箻瀹曞洤鍝洪梺鍝勵儐閻楁鎹㈠☉銏犵婵炲棗绻掗崝鎾⒑鏉炴壆顦﹂悗姘嵆瀵鈽夊Ο閿嬵潔濠电偛妫欓崝鏇㈠礈瑜版帗鈷戦弶鐐村椤︼箓鏌涙繝鍌涘仴鐎殿喖顭峰鎾偄妞嬪海鐛梻浣虹《閸撴繆鎽梺缁樼箖濞茬喎顫忛搹鍦＜婵☆垵顕ч弳妤呮⒑閸濄儱校闁绘濮撮锝嗙節濮橆剙宓嗛梺缁樻濞咃綁顢欓弴銏♀拺闁告捁灏欓崢娑㈡煕閻樺磭澧柟渚垮妽閹棃鍩ラ崱妯虹槣闂備線娼ч悧鍡涘箠韫囨洜鐭夐悗锝庡枟閻撴洟鏌熼悙顒佺稇闁告繂鎼埞鎴︽晬閸曨剚姣堥悗瑙勬礈閸犳牠銆佸☉銏℃櫜闁糕剝蓱閻濇牠姊婚崒娆戝妽閻庣瑳鍛床闁稿本绮ｉ幏宄扳槈閹烘挻鐝氶梺璇″枟鐎笛呯箔閻斿吋鏅搁柦妯侯樈濞兼牠鏌ц箛姘兼綈闁稿繑绮撻弻娑樷槈閸楃偞鐏撻悷婊勫Ω閸涱垳锛濇繛杈剧悼閻℃棃宕靛▎鎾寸厽婵°倓鐒﹀畷灞绢殽閻愭彃鏆ｉ柡浣规崌閹亪鏁撴禒瀣瀬闁告劦鍠楅悡銉╂煛閸愩劌锟借崵鏁☉銏＄厸闁告粌鍟扮粔顔芥叏婵犲懏顏犵紒杈ㄥ笒铻ｉ煫鍥风导闁垶鏌熼鐭亪锝炲┑鍫熷磯闁惧繐婀卞畷鑸电節閻㈤潧浠﹂柛顭戝灦瀹曠懓煤椤忓嫮鍘遍梺鍦劋椤ㄥ棝鎮￠弴銏″�堕柣鎰綑缁�鍐熆鐟欏嫸鑰块柡灞诲姂閹垻鎷犲▓瀣崌閺岀喖顢欓悡搴嫹閹间焦鍋╅柣鎴ｆ缁犳盯鏌℃径濠冨仴闁哥偛鐖煎娲传閸曨剙绐涢梺绋款儑閸犳牞妫熷銈嗘穿閹风兘鏌熼绛嬫疁闁绘侗鍣ｅ畷褰掝敊閻撳寒娼涢梻鍌欐祰椤曟牠宕归柆宥呯濠电姵鑹剧粻姘舵煛閸愩劎澧曢幆鐔兼⒑闂堟冻绱￠悘鐐跺Г閺嗐儵姊婚崒姘拷宄懊归崶銊﹀弿闁靛牆顦伴弲顏呬繆閻愵亜锟窖咃拷闈涚焸瀹曡瀵奸幖顓熸櫔闂佹寧绻傞幊鎰板汲鐎ｎ喗鈷戞い鎾卞姂濡绢噣鎮楅棃娑氱劯婵﹥妞藉Λ鍐ㄢ槈濮橆剦鏆繝纰樻閸嬪懐绮欓幒妤�鐤鹃柛顐ｆ处閺佸棝鏌涚仦鍓х煁闁挎稑绻樺娲传閸曞灚歇濠电偛顦板ú姗�寮查妷鈺傜厽閹兼番鍊ゅ鎰箾閸欏顏嗗弲濠碘槅鍨伴崥瀣暦閸欏绡�闂傚牊渚楅崕蹇涙煟閹邦剨韬柡灞炬礃缁绘盯宕归鐓幮ラ梻浣哥秺椤ユ捇宕楀锟介獮鍐╃鐎ｎ亜绐涙繝鐢靛Т鐎氼剟鐛Δ鍛拻濞撴熬鎷锋繛浣冲懏宕查柟鐑樻尰閸欏繘姊洪崹顕呭剳妞も晠鏀辩换娑㈠箣濞嗗繒浠鹃梺缁樻尰濞茬喖寮婚弴銏犻唶婵犻潧鐗忛澶愭煟鎼淬垼澹樻繝锟芥潏鈺傤潟闁规崘顕х壕鍏兼叏濮楀棗澧鹃柟鐑芥敱椤︾増鎯旈姀鈺佷缓闂備浇娉曢崰鎾存叏閻㈢纾婚柛灞惧嚬閻斿棝鏌ら幖浣规锭濠殿喖娲ㄧ槐鎺楁偑閿熶粙宕归崼鏇炶摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹
		final fire.pb.role.SCreateRoleConfig config = RoleConfigManager.getCreateRoleConfig(shape);
		if (config == null)
		{
			logger.error("-------------------------婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煠缁嬪灝鎮佺紒璇叉閺屾洟宕煎┑鍥ㄦ倷闁哥喐鎮傚铏圭矙濞嗘儳鍓辩紓浣割儐閹搁箖宕氶幒妤�绫嶉柛銉ｅ劙濮规姊洪崷顓炲妺闁哄被鍔庣划濠囨晝閸屾稈鎷虹紓渚囧灡濞叉牗鏅堕弻銉︾厱闁瑰濮甸崵锟介柛妤�宕埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱閸ㄥ湱妲愰幘瀛樺闁兼祴鍓濋崹瑙勭閹间緡鏁囬柕蹇ョ磿閸樿鲸绻濋悽闈浶㈤柛濠傜秺瀹曟垿濡烽敂缁橆啍闂佺粯鍔栬ぐ鍐汲濞嗘挻鎳氶柡宥庡幗閻撴洘绻涢幋婵嗚埞闁哄绋戦湁闁绘娅曢妵婵囨叏婵犲啯銇濈�规洘绮撻幊鐘活敆閿熺晫鏁妷鈺傗拺缂佸顑欓崕蹇涙倵濮樼厧澧撮柛鈹垮灲楠炴ê鐣烽崶銊︾暦闂備浇娉曢崰鎾诲疾椤愨懡锝夊箛閺夎法顔掗柣搴㈢♁閿氭い搴㈡崌濮婂宕掑鍗烆杸缂備礁顑嗛崹鍧楀灳閺嶃劌绶為柟閭﹀幐閹疯櫣绱撻崒娆戝妽閽冮亶鏌熼姘卞ⅱ缂佽鲸甯炵槐鎺懳熼懖鈺冩澖闂備胶绮笟妤呭闯閿濆懐鏆﹂柛妤冨亹濡插牊淇婇婧炬嫛婵¤尙澧楁穱濠囨倷椤忓嫸鎷烽弽顬稒绗熼敓钘夌暦閹达箑绠涢柛蹇ｅ亜濞差厼顕ｇ捄琛℃瀻闁绘劦鍓欓惁婊堟⒒娓氾拷濞佳囨偋閸℃あ娑樷槈濞嗘劖鐝峰銈嗗笒鐎氼參鎮￠悩缁樼厽闁绘柨鎲＄欢鏌ユ煃闁垮顥堥柡宀�鍠撶划鏃堝幢濡や礁鐝旈梺褰掝棑閸忔﹢寮幇顓熷劅闁炽儲鍓氬鍓х磽娴ｇ懓鍔ょ憸鎵仧閸掓帒鈻庨幘瀹犳憰濠电偞鍨堕惌顔尖柦椤忓牊鐓欓悷娆忓婵洦銇勯妷锔剧疄婵﹥妞藉畷顐﹀礋闂堟稑澹勯梻浣侯焾閿曘儳鎹㈤崼婵愬殨閻犲洦绁村Σ鍫ユ煏韫囧鎷烽崗鍛潖闂傚倷绀佺紞濠囥�傞敃鍌涘�块柨鏇炲�归崑顏勩�掑鐐闂佽鍠楅〃鍛村煝閹捐鍨傛い鏃傛櫕娴滃爼姊绘担绛嬪殐闁哥姵鐗犲畷鎰板箹娴ｇ懓浠奸悗鐟板閸嬪﹤顭囬妸鈺傜叆闁绘柨澧庨惌娆戯拷瑙勬礃濡炰粙寮幘缁樺亹闁肩⒈鍓﹀Σ浼存⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌鈽夐姀鐘栄囨煥閻曞倹瀚�?!!!--------"+shape);
			return;
		}
			
		if (!config.schools.contains(school))
		{
			logger.error("------"+shape+"-------------------婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煠缁嬪灝鎮佺紒璇叉閺屾洟宕煎┑鍥ㄦ倷闁哥喐鎮傚铏圭矙濞嗘儳鍓辩紓浣割儐閹搁箖宕氶幒妤�绫嶉柛銉ｅ劙濮规姊洪崷顓炲妺闁哄被鍔庣划濠囨晝閸屾稈鎷虹紓渚囧灡濞叉牗鏅堕弻銉︾厱闁瑰濮甸崵锟介柛妤�宕埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱閸ㄥ湱妲愰幘瀛樺闁兼祴鍓濋崹瑙勭閹间緡鏁囬柕蹇ョ磿閸樿鲸绻濋悽闈浶㈤柛濠傜秺瀹曟垿濡烽敂缁橆啍闂佺粯鍔栬ぐ鍐汲濞嗘挻鎳氶柡宥庡幗閻撴洘绻涢幋婵嗚埞闁哄绋戦湁闁绘娅曢妵婵囨叏婵犲啯銇濈�规洘绮撻幊鐘活敆閿熺晫鏁妷鈺傗拺缂佸顑欓崕蹇涙倵濮樼厧澧撮柛鈹垮灲楠炴ê鐣烽崶銊︾暦闂備浇娉曢崰鎾诲疾椤愨懡锝夊箛閺夎法顔掗柣搴㈢♁閿氭い搴㈡崌濮婂宕掑鍗烆杸缂備礁顑嗛崹鍧楀灳閺嶃劌绶為柟閭﹀幐閹疯櫣绱撻崒娆戝妽閽冮亶鏌熼姘卞ⅱ缂佽鲸甯炵槐鎺懳熼懖鈺冩澖闂備胶绮笟妤呭闯閿濆懐鏆﹂柛妤冨亹濡插牊淇婇婧炬嫛婵¤尙澧楁穱濠囨倷椤忓嫸鎷烽弽顬稒绗熼敓钘夌暦閹达箑绠涢柛蹇ｅ亜濞差厼顕ｇ捄琛℃瀻闁绘劦鍓欓惁婊堟⒒娓氾拷濞佳囨偋閸℃あ娑樷枎閹惧磭鍘遍梺鍦劋濮婅崵澹曢崗绗轰簻闁哄洨鍋為崳褰掓煟韫囨洖鈻堥柡宀嬬秮閺佹劙宕惰楠炲螖閻橀潧浠︽い顓炴喘閺佹挻绂掔�ｎ偅閿梺纭呭Г缁捇銆佸▎鎾冲嵆闁靛繆妾ч幏娲煟閻斿摜鎳冮悗姘煎弮瀹曟洖螖閸涱喚鍘遍梺闈涱焾閸斿宕ラ锔界叆闁绘棁顕ц闂佺粯妫忛崜鐔肩嵁韫囨稒鏅搁柨鐕傛嫹?!!!------"+school);
			return;
		}
		
		
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閳╁啨浠︾紒顔瑰墲娣囧﹪鎮欓鍕舵嫹閺嶎厼绀夌憸蹇曞垝婵犳艾绠ｉ柣妯烘▕濡粓姊虹粔鍡楀濞堟洟鏌ｉ幘瀵告噰闁哄瞼鍠栭、娑橆煥閸愮偓姣夋俊鐐�戦崕閬嵥囬悽绋胯摕闁挎稑瀚搁幏鐑芥晲閸屾稒鐝栫紓浣瑰姈濡啴寮婚敍鍕勃闁绘劦鍓涢ˇ浼存倵鐟欏嫭绀堥柛妯犲洤鐓橀柟杈剧畱缁犳稒銇勯幘绛圭础闁搞儯鍔夐幏铏圭磽娴ｅ壊鍎愭い鎴炵懇瀹曟洖顓兼径瀣幈闂佸搫鍠涢幏鐑芥煕閵娿儳浠㈡い鏇稻缁绘繂顫濋锟藉畵鍡涙⒑缂佹ɑ顥嗘繛鍜冪秮閹線宕奸妷锔绘濡炪倖鍔戦崹鐑樺緞閸曨剛绠鹃柛娆忣槺閻帞锟芥鍠楁繛濠囧箖閳哄啰纾兼俊顖炴敱鐎氳偐绱撻崒姘拷鐑芥倿閿曚焦鎳岄梺璇茬箰缁绘帗鏅跺Δ鍐╁床婵炴垯鍨洪崵鎴炪亜閹虹偞瀚归梺鍝勵儐缁嬫捇鏁撻懞銉晱闁哥姵鐩、姘愁樄闁糕斂鍎插鍕節鎼淬垹缂撻梻浣虹《閸撴繈鏁嬮梺绋跨箰閿曘儲绌辨繝鍥ㄥ�锋い蹇撳閹风兘寮介锝嗘闂佸湱鍎ら〃鍛瑜版帗鐓欓梺顓ㄧ畱閻忚鲸淇婇姘伃婵﹥妞藉畷顐﹀礋椤撶姴濮界紓鍌欒兌缁垳鎹㈤崒鐐村仼闁绘垼妫勭涵锟介梺缁樺灥濡瑩宕撻悽鍛婄厽闁绘鍎ら鐘绘煕鎼存稑锟芥繈鐛繝鍌楁瀻闁瑰墽琛ラ幏缁樼箾鏉堝墽鎮奸柣鈩冩瀹曠敻宕橀鐣屽幈闂侀潧顭堥崕閬嶆嚋瑜版帗鎳氶柣鎰劋閻撴洟鏌熸导瀛樻锭闁哄鐩弻锛勶拷锝傛櫇缁愭棃鏌＄仦鍓р槈闁伙絾绻堥弫鎾寸鐎ｎ亞锛涢梺缁樺姇閹碱偊宕ラ崷顓ㄦ嫹楠炲灝鍔氭い锔垮嵆閹ょ疀閹垮啰鍞甸柣鐘烘〃鐠�锕傚磿韫囨挴鏀芥い鏂诲妼閹虫劗澹曟總鍛婄厽婵☆垱瀵ч悵顏嗭拷瑙勬礀閻ジ鏁撻懞銉晱闁哥姵鐩、姘愁樄闁糕斂鍎插鍕節鎼淬垹缂撻梻浣虹《閸撴繈鏁嬮梺绋跨箰閿曨亜顫忕紒妯诲闁告稑锕ら弳鍫ユ⒑閸︻収鐒炬俊顐ｇ箓閻ｇ兘濡搁埡濠冩櫓缂備焦绋戦鍛村疾閻樼粯鈷掗柛灞捐壘閿熻姤鎮傚畷鎰暋閹冲﹤缍婂畷鍫曨敆婢跺娅旈梻浣告惈缁嬩線宕㈤懖鈺冪幓婵°倕鎳忛悡娑氾拷骞垮劚妤犳悂鐛Δ鍛厽闁瑰灝瀚�氬綊姊婚崒娆戝妽閻庣瑳鍛床闁稿瞼鍊涢崶顒夋晬婵犲﹤鎳嶇粭澶愭⒑閸濆嫮鈻夐柛妯圭矙閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?
		int nameLen = CheckName.nameLen();
		int length=0;
		try {
			length=(new String(name.getBytes( "gb2312"), "ISO-8859-1")).length();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭濮婄粯鎷呴崨濠傛殘闂佸湱顭堝Λ婵嗙暦閵娾晩鏁嶆繝濠傚暙閼搭垶姊婚崒姘拷椋庣矆娴ｉ潻鑰块梺顒�绉甸幆鐐哄箹濞ｎ剙濡肩紒鎰殕娣囧﹪濡堕崨顔兼缂佺偓鍎抽…鐑藉蓟閺囥垹閱囨繝闈涙搐椤︹晠姊洪崫銉バｉ柛鏃�鐟╁濠氭晸閻樿尙锛滃┑鐐村灥瀹曨剟宕濈仦瑙ｆ斀闁绘劖褰冮幃鎴︽煟濡や胶鐭掓鐐差樀楠炴牗鎷呴悷棰佺綍闂備礁澹婇崑鍛崲閸曨垱鍋￠柕濞炬櫆閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒婊呅ㄦ繝纰夌磿閺佽鐣烽悢纰辨晬婵浜澶愭⒒娴ｄ警鐒鹃柡鍫墴閵嗗啴宕卞▎娆愬婵﹩鍘惧ú瀛樻叏婵犲啯銇濈�规洦鍋婃俊鐑藉Ψ閵堝棗鐓曢梻鍌欒兌椤牏鑺卞ú顏勭９婵°倕鎳庣粻鏌ユ煏韫囨洖袥婵℃彃鐗撻弻鏇＄疀閺囩倫銉︺亜閹惧瓨銇濇慨濠呮缁辨帒螣閸濆嫷娼旀繝鐢靛仜閸氬鎮疯瀹曠増绻濋崒銈呮倯闂佹悶鍎弲婵嬫晬濠靛洨绠鹃弶鍫濆⒔閸掓澘顭块悷甯伐閸楄京鎲搁悧鍫濈瑲闁绘挻鐟╅弻娑樷槈濮楀牆浼愰梺宕囩帛濞茬喖寮婚弴銏犲耿闁哄洨濯Σ顔碱渻閵堝骸浜濈紒璇茬墦楠炲﹤顭ㄩ崼婵嗙�銈嗗姧缂嶅棙绂掕濮婂宕掑▎鎰偘濠电偛顦板ú鐔风暦閹惰姤鏅濋柛灞炬皑椤斿棝姊虹捄銊ユ珢闁瑰嚖鎷�");
			return;
		} 
		
		
		if(length > nameLen){
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭濮婄粯鎷呴崨濠傛殘闂佸湱顭堝Λ婵嗙暦閵娾晩鏁嶆繝濠傚暙閼搭垶姊婚崒姘拷椋庣矆娴ｉ潻鑰块梺顒�绉甸幆鐐哄箹濞ｎ剙濡肩紒鎰殕娣囧﹪濡堕崨顔兼缂佺偓鍎抽…鐑藉蓟閺囥垹閱囨繝闈涙搐椤︹晠姊洪崫銉バｉ柛鏃�鐟╁濠氭晸閻樿尙锛滃┑鐐村灥瀹曨剟宕濈仦瑙ｆ斀闁绘劖褰冮幃鎴︽煟濡や胶鐭掓鐐差樀楠炴牗鎷呴悷棰佺綍闂備礁澹婇崑鍛崲閸曨垱鍋￠柕濞炬櫆閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒婊呅ㄦ繝纰夌磿閺佽鐣烽悢纰辨晬婵浜澶愭⒒娴ｄ警鐒鹃柡鍫墴閵嗗啴宕卞▎娆愬婵﹩鍘惧ú瀛樻叏婵犲啯銇濈�规洦鍋婃俊鐑藉Ψ閵堝棗鐓曢梻鍌欒兌椤牏鑺卞ú顏勭９婵°倕鎳庣粻鏌ユ煏韫囨洖袥婵℃彃鐗撻弻鏇＄疀閺囩倫銉︺亜閹惧瓨銇濇慨濠呮缁辨帒螣閸濆嫷娼旀繝鐢靛仜閸氬鎮疯瀹曠増绻濋崒銈呮倯闂佹悶鍎弲婵嬫晬濠靛洨绠鹃弶鍫濆⒔閸掓澘顭块悷甯伐閸楄京鎲搁悧鍫濈瑲闁绘挻鐟╅弻娑樷槈濮楀牆浼愰梺宕囩帛濞茬喖寮婚弴銏犲耿闁哄洨濯Σ顔碱渻閵堝骸浜濈紒璇茬墦楠炲﹤顭ㄩ崼婵嗙�銈嗗姧缂嶅棙绂掕濮婂宕掑▎鎰偘濠电偛顦板ú鐔风暦閹惰姤鏅濋柛灞炬皑椤斿棝姊虹捄銊ユ珢闁瑰嚖鎷�");
			return;
		}
		else if (length < CCreateRole.NAMELEN_MIN){
			sendError(SCreateRoleError.CREATE_SHORTLEN);
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭濮婄粯鎷呴崨濠傛殘闂佸湱顭堝Λ婵嗙暦閵娾晩鏁嶆繝濠傚暙閼搭垶姊婚崒姘拷椋庣矆娴ｉ潻鑰块梺顒�绉甸幆鐐哄箹濞ｎ剙濡肩紒鎰殕娣囧﹪濡堕崨顔兼缂佺偓鍎抽…鐑藉蓟閺囥垹閱囨繝闈涙搐椤︹晠姊洪崫銉バｉ柛鏃�鐟╁濠氭晸閻樿尙锛滃┑鐐村灥瀹曨剟宕濈仦瑙ｆ斀闁绘劖褰冮幃鎴︽煟濡や胶鐭掓鐐差樀楠炴牗鎷呴悷棰佺綍闂備礁澹婇崑鍛崲閸曨垱鍋￠柕濞炬櫆閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒婊呅ㄦ繝纰夌磿閺佽鐣烽悢纰辨晬婵浜澶愭⒒娴ｄ警鐒鹃柡鍫墴閵嗗啴宕卞▎娆愬婵﹩鍘惧ú瀛樻叏婵犲啯銇濈�规洦鍋婃俊鐑藉Ψ閵堝棗鐓曢梻鍌欒兌椤牏鑺卞ú顏勭９婵°倕鎳庣粻鏌ユ煏韫囨洖袥婵℃彃鐗撻弻鏇＄疀閺囩倫銉︺亜閹惧瓨銇濇慨濠呮缁辨帒螣閸濆嫷娼旀繝鐢靛仜閸氬鎮疯瀹曠増绻濋崒銈呮倯闂佹悶鍎弲婵嬫晬濠靛洨绠鹃弶鍫濆⒔閸掓澘顭块悷甯伐閸楄京鎲搁悧鍫濈瑲闁绘挻鐟╅弻娑樷槈濮楀牆浼愰梺宕囩帛濞茬喖寮婚弴銏犲耿闁哄洨濯Σ顔碱渻閵堝骸浜濈紒璇茬墦楠炲﹤顭ㄩ崼婵嗙�銈嗗姧缂嶅棙绂掕濮婂宕掑▎鎰偘濠电偛顦板ú鐔风暦閹惰姤鏅濋柛灞炬皑椤斿棝姊虹捄銊ユ珢闁瑰嚖鎷�");
			return;
		}
		
		int resultCode = fire.pb.util.CheckName.checkValid(name);
		if(resultCode == CheckName.WORD_ILLEGALITY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垻绮穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵°倕鍟伴惌娆撴煙閻愵剛婀介柨鐔绘閹虫ê顕ｆ繝姘ㄩ柨鏃�鍎冲铏節閻㈤潧鈻堟繛浣冲吘娑㈩敇閻愬稄缍佸畷顐﹀Ψ瑜忛敍婊堟⒑鐠恒劌鏋嶇紒顔界懃閻ｇ兘骞掗幋鏃�顫嶅┑掳鍊曢崯浼存偩閻愵兛绻嗛柣鎰典簻閿熻姤鐗犻幃褍螖閸愩劌鐏婇柟鑹版彧缁查箖寮冲鍕闁瑰鍋為惃鎴犵棯閸撗勬珪闁跨喕妫勭粻宥夊磿闁秴绠犻煫鍥ㄧ☉缁愭鎱ㄥΔ瀣闂佸搫澶囬敓钘夌－閺嗗棝鏌ㄩ悢鍓佺煓鐎规洑鍗冲浠嬵敇閻樿尙銈﹂梻浣虹《閸撴繈宕欓悷鎷旓絾绻濆顓涙嫼闂佸憡绻傜�氼參藟閳ヨ秮鐟邦煥鎼粹�斥拫闂佽桨鐒﹂幑鍥箠閻愬搫唯妞ゆ柨鍚嬪▍娑㈡⒒娓氾拷濞艰崵绱為崱娑樺瀭闁割偅娲滃畵渚�鐓崶銊р檨闁哄懏鎮傞弻銊╂偆閸屾稑顏�2-7濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ顢欓弴銏♀拺缂侇垱娲栨晶鏌ユ嫅闁秵鍊堕煫鍥ч瀹撳棝鏌＄仦鍓ф创濠碘�崇埣瀹曘劑顢涘锝呭緧闂傚倷绀侀幖顐︽儔婵傜绐楅柟閭﹀墻閻掍粙鐓崶銊р槈缂侊拷閸垺鍠愰煫鍥ㄧ☉濮规煡鏌ｅΟ鑽ゃ偞闁猴拷娴犲鐓冮柦妯侯槹椤ユ粌霉濠婂嫮绠為柡灞诲姂瀵潙螣閾忛�涚礄闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺缁樕戦悧鎾诲礉閹达箑钃熺�广儱顦导鐘绘煕閺団�崇厫闁轰焦鍎抽—鍐Χ閸愩劌濮曢梺缁橆殕缁骸危閹版澘绠婚悗闈涙憸閹虫繃绻濋悽闈浶㈤柛鐕佸亰椤㈡棃宕奸弴鐔叉嫽婵炶揪缍�婵倗娑甸崼鏇熺厱闁挎繂绻掗悾鍨殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�4-14濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垼鎽曢梺闈涱檧婵″洭宕ｉ崱妞绘斀闁绘绮☉褎淇婇锝囨噮缂侇喖锕、鏇㈡晜閻ｅ苯骞嶉柣搴ｆ嚀鐎氼厼顭垮Ο浣曪絿绱掑Ο闀愮盎濡炪倖鍔х徊璺ㄧ不閻愭番浜滈柕蹇婃閼板潡鏌熼鐣屾噰闁糕晪绻濆畷鎺戭煥閿熺晫鑺辨禒瀣拻濞达絿鐡旈崵娆撴倵濞戞帗娅婃い銏＄懇瀵粙顢橀悙鐑橈紬婵＄偑鍊栧ú鈺呭箯妞嬪函鎷风憴鍕缂侇喗鎹囬獮鍐閳藉棙效闁瑰吋鐣崹娲敊閺囥垺鈷掑ù锝囶焾椤ュ繘鏌涚�ｎ亝鍣归悡銈夋煛瀹ュ啫濡奸柛鏃�妫冨濠氬磼濞嗘垹鐛㈠┑鐐板尃閸ャ劍娅栭棅顐㈡处缁嬫垹澹曢崗鑲╃瘈濠电姴鍊归崳鍦磼閻樺灚鏆慨濠傤煼瀹曟帒顫濋濠冨闁归棿绀佺壕鐟邦渻鐎ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔闈浢瑰鍐煟闁诡喓鍨藉畷鍗炍熺拠鎻掍紟婵犲痉鏉匡拷鏇㈩敄閸℃瑱鎷峰杈ㄥ殌閾绘牠鏌ｅ锟藉褎绂掑鍫熺叆闁哄洢鍔嬮柇顖滐拷娈垮櫘閸嬪﹪鐛Ο鑲╃＜婵☆垳绮鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘舵⒑闂堟稒鎼愰悗姘嵆閵嗕線寮撮姀鐙�娼婇梺鍐叉惈閸婃劙鏁冮崒娑掓嫼閻庤娲栧ú銊ф暜濞戙垺鐓欓柣鐔哄閹兼劙鏌ｉ敐澶嬫暠缂佽櫣鏅划娆撳垂椤旇偐銈梻鍌欒兌缁垶寮婚妸鈺佸惞闁哄稁鍘肩粻顖炴煟閹达絾顥夐柛銊ュ�归妵鍕箛閳轰緤鎷峰Δ鍜佹晩闁哄洢鍨洪埛鎴︽煟閻旂厧浜伴柛銈囧枛閺屾稓锟斤綆鍓欓弸娑欘殽閻愯韬鐐叉喘椤㈡﹢鎮╁▓鍨櫗闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鏉垮彄婢舵劕閱囬柕澶涘閸樻悂鏌ｈ箛鏇炰哗妞ゆ泦鍥ㄦ櫢闁兼亽鍎崇粻鐐搭殽閻愯韬柡浣规崌閹晠宕ｉ崒鍐ㄦ处閻撴洘绻涢幋婵嗚埞闁哄鍊濋弻銊╂偄缂佹﹩妫勬繝鈷�鍛珪婵″弶鍔欓獮妯硷拷娑櫭鎾绘⒑閸涘﹥灏扮憸鏉垮暣瀹曟粓寮跺▎鐐瘜闂侀潧鐗嗙换鎺楁偩閸偆绠惧ù锝呭暱濞村倿寮�ｎ喗鐓ユ繝闈涙－濡牓鏌℃担鍛婎棦闁哄本鐩鎾Ω閵夈倗鏁栨俊鐐�х�靛矂宕ｉ崘顔肩畺鐎瑰嫰鍋婇悡銉╂煕閹板吀绨芥い鏃�甯掕灃闁绘﹢娼ф禒婊勩亜閿旇棄鈻曞┑锛勬暬楠炲洭寮剁捄顭戝敽闂備礁婀遍搹搴ㄥ垂鏉堚晪鎷峰顑惧仮婵﹦绮幏鍛存惞閻熸壆顐奸梻浣烘嚀閹芥粓鈥﹂崼銉︾畳闂備胶绮崹鐓幬涢崟顖氱闁绘绮悡鏇㈡煙閼割剙濡芥繛鍛暟缁辨帞鎷犻崣澶樻！闂侀潧娲ょ�氫即鐛崶顒�鐓涘ù锝堟〃閹絾淇婇悙顏勶拷鏇灻瑰璺哄偍濞寸姴顑冮敓钘夊暣婵＄兘鍩￠崒姘炬嫹閻戣姤鐓曟繛鍡楁禋濡牊淇婇顒傜暤闁诡喗顨堥幉鎾礋椤掑偆妲梻渚�娼ч悧鍡涘箟閳╁啰鈹嶅┑鐘叉处閸婂鏌﹀Ο鐚寸礆闁靛ň鏅滈悡蹇擃熆鐠団�崇仩闁哥喐澹嗙划鏃堫敊鐏忔牗鏂�闂佺粯锚閻忔岸寮抽埡浣叉斀妞ゆ棁顕у畵鍡欙拷瑙勬礉椤缂撻悾宀�鐭欓柟绋垮琚ｉ梻鍌欑閹碱偆绮欐笟锟藉畷銏ゆ嚃閳哄啰鐒兼繝銏ｅ煐閸旀牠鎮″☉姘炬嫹楠炲灝鍔氶柛鐕佸亝娣囧﹥绂掔�ｎ偆鍘卞┑鐐叉缁绘帞绮婚懠顒傜＜缂備焦顭囩粻鏍磼缂佹绠炵�规洘甯掗～婵嬫⒒鐎靛摜锛涚紓鍌氬�搁崐鐑芥嚄閼稿灚鍙忛柣銏㈩焾绾惧潡鏌熼幆闈舵帡鏁撻弬銈咁洭闁圭懓瀚版俊鎼佹晝閿熺晫澹曢娑氱闁圭偓娼欓崵顒勬煕閵娿倕宓嗙�规洘绮嶅蹇涘煛閸愵亷绱冲┑鐐存尰閼归箖鏁冮妷褝鎷峰顒傜Ш婵﹨娅ｉ幑鍕Ω閵夛妇锟借櫣绱撴笟鍥ф灍闁荤喆鍎甸敐鐐剁疀閹句焦妞介、鏃堝川椤撱劍瀚瑰┑鐘崇閻撳啴寮堕悙鏉戭棆閻犳劗澧楃换娑㈠礂閻撳骸鎽靛┑顔硷攻濡炶棄鐣烽妸锔剧瘈濞达綀娅ｇ粻鎺楁⒒娴ｈ鍋犻柛鏂跨У缁绘稒绻濋崶褏鐣烘俊銈忕到閸燁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷?");
			return;	
		}else if(resultCode == CheckName.SPECIAL_WORD_TOO_MANY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�閺夘參姊虹捄銊ユ灆婵☆偄瀚板畷顖烆敍濮樼厧娈梺鍛婃处閸ㄦ壆绮诲☉銏＄厱闁规崘灏崗宀勬煃缁楀搫锟芥洟鍩為幋锔藉亹妞ゆ棁鍋愭导鍥⒑缁洘娅嗛柣妤冨Т閻ｅ嘲鈹戠�ｎ亜鍞ㄥ銈嗘尵閸嬬喖鏁嶅☉銏♀拺闁告劕寮堕幆鍫ユ煙閸愯尙绠婚柟顕嗙節瀹曟﹢顢欓悾灞藉箞婵犵數濞�濞佳兾涘Δ鍜佹晜闁冲搫鎳忛悡娑㈡倵閿濆懎顣抽柣锝囨暬閺屸�崇暆閿熶粙宕版惔銊﹀仼闁跨喓濮寸痪褔鏌熺粙鍨彁闁冲搫鎳忛埛鎴︽倵閸︻厼校妞ゃ儱顦伴妵鍕晜鐠囪尙浠搁梺绯曟杺閸ㄦ椽骞嗛弮鍫濈劸闁靛／鍐╃亪闂佸湱顒茬换婵囦繆閸洖骞㈡俊顖氬悑椤繃绻濋悽闈浶ユい锝庡枤濡叉劙寮撮姀鐘碉紱闂佺鎻粻鎴犲瑜版帗鐓涚�广儱楠搁獮鏍煕閵娿儱锟藉潡寮婚悢鐓庣畾闁哄鏅濋幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽、鏃堝川椤撗傜处婵犵绱曢崑鎴﹀磹閵堝鍌ㄩ柣鎾崇瘍濞差亝鏅滈柣鎰靛墮鎼村﹤鈹戦悩缁樻锭婵☆偒鍘奸…鍥煛閸屾ü绨婚梺鍦劋閸ㄧ敻鏁撻懞銉﹀�愰柡浣规崌閹墽浠﹂幋鎺擃潟闂備浇顕栭崰鏍床閺屻儮锟斤箓濡搁埡浣侯槹濡炪倖鎸炬慨鐑藉储閹扮増鈷戦柛娆嶅劤娑撹尙绱撳鍕獢鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�");
			return;
		}else if(resultCode == CheckName.NONE_CHARACTER){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹捐泛啸闁告﹩鍨跺缁樻媴閸涘﹥鍎撶紓浣割儎缁舵岸骞冨Ο琛℃婵☆垶鏀遍～宥夋⒑闂堟稓绠冲┑顔惧厴钘濋柡澶嬵儥濞撳鏌曢崼婵囶棤濠⒀屽墯閹便劌螣缁嬪灝顫囬梺璇″枟閸庡磭鍙呭銈呯箰閹冲骞忓ú顏呪拺闁告稑锕︾粻鎾绘倵濮樼厧骞樼紒顔硷躬椤㈡洟濡堕崶鈺嬬床闂佸搫顦悧鍕礉瀹ュ洨鐭嗛悗锝庡枟閻撴瑦銇勯弬鍨倯闁稿鍎甸弻鈩冩媴鐟欏嫬闉嶇紓浣稿�圭敮鐐烘晸閺傘倗绉甸柛瀣舵嫹闂佸綊鏀卞钘夘潖濞差亜宸濆┑鐘插濡插牓姊洪幐搴㈢┛缂佺姵鎹囧畷娲晜閻ｅ瞼鎳濋梺璺ㄥ枍缁瑥顕ｆ繝姘櫜濠㈣泛顑嗗▍婊堟煙閻撳海鎽犵紒璇茬墦瀹曟垵螖閸涱喒鎷洪柡澶屽仦婢瑰棝宕濆澶嬬厵闁荤喓澧楅崰妯活殽閻愭潙濮堢紒缁樼箞瀹曟﹢濡歌閻涱噣鏌ｆ惔锝嗩仧闁归鍏橀弻銊╂偄閸撲胶鐓撳銈冨灪閻熲晠鐛幒鎳虫梹鎷呴棃鈺傚闁汇垹鎲￠崑鈩冪箾閸℃绠版い蹇ｄ簽缁辨帡鏁撴禒瀣唶婵犻潧鍟弬锟介梻浣虹帛閸ㄩ潧煤閿旀拝鎷峰顒傜Ш闁哄矉绲鹃幆鏃堝Χ鎼淬垻绉锋繝鐢靛仦瑜板啰鎹㈠Ο铏规殾婵犻潧顑呯粻锝夋煥閺冨倸鐨戦柟鐑芥敱閹峰懘宕滈崣澶婄紦闂備浇娉曢崰宥囧垝濞嗘挾宓侀柛鎰靛枛椤懘鏌ｅΟ铏逛粵婵炲牊绻堝娲传閸曞灚效濡炪倖鍨堕悷銉ㄧ亱闂佸綊鍋婇崗姗�寮ㄦ禒瀣厽婵☆垵娅ｆ禒娑㈡煛閸″繑娅婇柡灞剧〒閿熸枻缍嗛崜娆愮鏉堚晪鎷风憴鍕闁稿簺鍊楅幑銏犫攽鐎ｎ亞鍊為悷婊冪箻椤㈡瑩宕卞☉娆屾嫼闁荤姵浜介崝灞解枍閹扮増鐓欓柛鎴欏�栫�氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ鎯侀崼銉︹拻闁稿本姘ㄦ晶娑樸�掑顓ф疁鐎规洘娲熼獮鍥偋閸垹骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺撳�堕柟缁㈠枟閻撴稓锟界櫢鎷烽悗锝庡墰琚﹂梻浣芥〃閻掞箓宕濆▎蹇曟殾闁靛ň鏅╅弫宥嗙節婵犲倸鏆欓摝搴ㄦ⒒閸屾艾锟界兘鎳楅崼鏇炵疇闁规崘顕ф惔濠囨煛鐏炶鍔氶幖鏉戯躬閺岋紕浠︾拠鎻掑闂佺粯鎸撮敓鑺ュ墯閻斿棝鎮归崫鍕▏闁割偁鍎遍崙鐘诲箹閹碱厽绶氱紒璇叉閵囧嫰寮介妸褏鐣甸梺鍛婅壘缂嶅﹪寮婚敓鐘插耿妞ゆ挾濮烽弳銈呪攽椤旂》鍔熺紒顕呭灦楠炲繘宕ㄩ娑樻瀭闂佸憡娲﹂崑鍌炲传濡ゅ懏鈷掑ù锝呮啞閸熺偤鏌＄仦璇插闁轰礁鍟撮、鏃堝礋椤撶喐顔曟繝鐢靛█濞佳囶敄閸涱垳涓嶉柨婵嗩槹閻撱儵鏌￠崶鏈电凹閻庢艾婀辩槐鎾存媴閸濆嫅銉モ攽閻戝洦瀚归梻浣告惈閻ジ宕伴弽顓犲祦闁硅揪绠戠粻娑㈡⒒閸喓鈾佹い鏂垮閺岋絾鎯旈敐鍡楁畬闂佺顕滅槐鏇㈠箲閵忋倕绀冩い鏂挎閿曞倹鐓曢柡鍥ュ妼閻忕姷绱掗悩宸吋闁诡喖缍婇幖鍦喆閸曨叏绱涢梻浣瑰缁诲倿藝娴煎瓨鍋傛繛鍡樻尰閻撶姴鈹戦崒姘棌闁哄妞介弻娑㈠Χ閸℃瑦鍣伴梺鍝勮嫰缁夊爼骞夐幘顔肩妞ゆ劑鍊撶槐婵囦繆閻愵亜锟芥垿宕归崫鍕殕缂佸娉曢弳锕傛煕濡ゅ啫锟斤綁鎮㈤崫銉ф嚌濡炪倖鐗楅悷褎寰勯敓锟�?");
			return;
		}
		

		if(null != u){
			int roleNum = 0;
			for (Long rid : u.getIdlist()) {
				xbean.Properties prop = xtable.Properties.select(rid);
				if (prop.getDeletetime()==0)
					roleNum++;
			}
			if(roleNum >= PCreateRole.maxCreateRoleNum){
				logger.error("-----------------------闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸倿鎸婃径澶嬬潖闂傚倷绀侀幉锟犳偡閵夆敡鍥ㄥ閺夋垹鐣哄┑鐐叉閸ㄥ湱澹曢挊澶堬拷鎺戭潩椤掑﹥鏁鹃柣搴㈣壘缂嶅﹤顫忛搹鐟板闁哄洨鍋涢埛澶婎渻閵堝骸骞栨繛灞傚妿閸掓帞绱掑Ο绋夸簼闂佸憡鍔忛弲婵嬪储閻㈠憡鐓熼幖杈剧稻閺嗏晜銇勯鐐靛ⅵ鐎规洘绮撻弻鍡楊吋閸℃瑥骞楅梻浣告贡閸庛倕顫忛悷鎵虫瀺闁哄洨濮风壕濂稿级閸稑濡兼繛鎼枟椤ㄣ儵鎮欏顔叫ㄩ梺璺ㄥ枑閺嬭崵绱為崱妯碱洸閻犲搫銈藉ú顏嶆晣闁靛繆妾ч幏娲煟閻樺厖鑸柛鏂跨焸瀵憡鎯旈妸锔惧弳闂佺粯姊婚崕銈呪枍閺囥垺鐓曢柨婵嗗暙閸旀碍銇勯鐐村枠妤犵偛娲幃褔宕奸姀鐘茬闂傚倷鐒﹂弸濂稿疾濞戙垹鐤い鏍ㄧ矌閻棝鏌涢锝囪穿闁荤喖鍋婇悡銉╂煕濠婏拷閼冲爼宕濋幖浣光拺閻庡湱濯崵娆撴⒑鐢喚绉柣娑卞枤閿熸枻缍嗘禍鏍绩娴犲鐓曢柍鈺佸暟閹充線鏌涢悩璇ц含婵﹤顭峰畷鎺戔枎閹存繂顬夐梻浣告惈椤戝懘濡剁粙娆惧殨闁圭粯宸诲Σ鍫ユ煏韫囨洖啸闁哄苯鐗嗛—鍐Χ閸℃瑥顫х紓渚囧枛濞撮鍒掗崼鐔虹瘈闁搞儯鍔庨崢閬嶆⒑闂堟侗妯堥柛鐘崇墬閺呭爼顢涢悙瀵稿幗闂佽鍎抽顓㈠箠閸曨垱鐓忛柛銉戝喚浼冮悗娈垮枛閿熺晫鍣ュΣ鐓庮渻閵堝啫鍔滅紒顔芥崌瀵鈽夐姀鈥充簻闁荤姴鎼幖顐ょ矈椤曪拷閹鎲撮崟顒傦紭闂佹悶鍔嬬划娆撴偘椤曪拷楠炴帡骞婇搹顐ｂ拹闁瑰嘲鎳樺畷锝嗗緞婵犲簼绱梻鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍仦閸ゅ苯螖閿濆懎鏆為柛瀣ㄥ�濋弻鏇熺箾瑜嶇粔鐢碉拷姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣妯兼暩閻掑ジ鏌ｆ惔顖滅У闁稿鐒︾粋宥咁煥閸喓鍘甸梺鍛婄箓鐎氼喛鍊撮梺鑽ゅУ閸旀帡宕￠幎钘夎摕婵炴垯鍨洪崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹");
				sendError(SCreateRoleError.CREATE_OVERCOUNT);
				return;
			}
		}
		
		
		
		final PCreateRole proc = new PCreateRole(this, userID, config.initequip);
		proc.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786435;

	public int getType() {
		return 786435;
	}

	public final static int NAMELEN_MAX = 14; // 名字的最大长度
	public final static int NAMELEN_MIN = 4; // 名字的最短长度

	public java.lang.String name; // 名称
	public int school; // 职业
	public int shape; // 角色id
	public java.lang.String code; // 招募码

	public CCreateRole() {
		name = "";
		code = "";
	}

	public CCreateRole(java.lang.String _name_, int _school_, int _shape_, java.lang.String _code_) {
		this.name = _name_;
		this.school = _school_;
		this.shape = _shape_;
		this.code = _code_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(name, "UTF-16LE");
		_os_.marshal(school);
		_os_.marshal(shape);
		_os_.marshal(code, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		name = _os_.unmarshal_String("UTF-16LE");
		school = _os_.unmarshal_int();
		shape = _os_.unmarshal_int();
		code = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateRole) {
			CCreateRole _o_ = (CCreateRole)_o1_;
			if (!name.equals(_o_.name)) return false;
			if (school != _o_.school) return false;
			if (shape != _o_.shape) return false;
			if (!code.equals(_o_.code)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += name.hashCode();
		_h_ += school;
		_h_ += shape;
		_h_ += code.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(name.length()).append(",");
		_sb_.append(school).append(",");
		_sb_.append(shape).append(",");
		_sb_.append("T").append(code.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


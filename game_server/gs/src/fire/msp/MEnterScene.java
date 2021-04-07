package fire.msp;

import fire.pb.activity.impexam.ImpExamManager;
import fire.pb.activity.winner.WinnerManager;
import fire.pb.battle.pvp1.PvP1Control;
import fire.pb.battle.pvp1.PvP1Helper;
import fire.pb.battle.pvp3.PvP3Control;
import fire.pb.battle.pvp3.PvP3Helper;
import fire.pb.battle.pvp5.PvP5Control;
import fire.pb.battle.pvp5.PvP5Helper;
import fire.pb.huoban.HuoBanColumn;
import fire.pb.instancezone.bingfeng.BingFengLandMgr;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.Transfer;
import fire.pb.mission.notify.GiftBagMgr;
import fire.pb.mission.notify.TuiSongNotifyManager;
import fire.pb.move.SRoleEnterScene;
import fire.pb.util.DateValidate;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MEnterScene__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/**
 * 濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨椤愩垺澶勯柟鍛婃尦瀵顓兼径瀣弳濠电娀娼уΛ娆撍夐悙瀵哥闁告侗鍨伴埢鍫ユ煛瀹�锟介崰鎾跺垝濞嗘挸绠伴幖娣灩闂傤垶姊绘担鍝ワ紞缂侇噮鍨跺濠氬Ω閳轰胶鍘撮梺纭呮彧闂勫嫰宕戦幇鐗堢厵缂備焦锚娣囶垰霉閻橀潧甯堕柍瑙勫灴閹瑩鎳犻锟介埅杈ㄧ節閻㈤潧鍓抽柟椋庡厴濮婃椽宕崟顕呮蕉闂佸憡鏌ㄩ惌鍌炲春閵夛箑绶炲┑鐐灮閸犳牕鐣疯ぐ鎺濇晪闁告侗鍓涚壕鐐節閻㈤潧啸闁轰礁鎲￠幈銊ヮ吋閸滀礁鎮戦梺绯曞墲椤ㄥ繑瀵奸幘缁樷拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁閺嶎収鏁冮柨鏇嫹缂佺媭鍨堕幃妤呮晲鎼粹剝鐏堥梺鎼炲妼閸婃悂婀侀梺绋跨箳閳峰牓宕濋崘顔界厱闁靛鍠栨晶顕�鏌ｉ幘瀵告创闁哄本绋戦埥澶愬础閻愬浜┑鐐差嚟婵參寮查悩宸綎闁惧繒鎳撶�垫煡鏌￠崶鈺佷粶闁冲嘲顦—鍐Χ閸愩劌顬堥梺缁橆殕閹告悂顢氶敐澶婄鐎瑰壊鍠楅崓闈涱渻閵堝棙灏甸柛鐘查椤曪綁宕稿Δ浣叉嫼闂佸湱顭堝ù椋庣不閹剧繝绻嗘い鎰剁悼閹冲懐绱掗鑲╁ⅵ闁轰焦鎸荤粋鎺旓拷锝庡亐閹锋椽鏌ｉ悩鍙夌闁跨喎锟界喐鐝柣蹇撶Т椤啴濡堕崘銊ヮ瀳闂佹寧娲忛崐婵嬪箖妤ｅ啯鍊婚柦妯猴級閵娾晜鐓冮弶鐐村閸忓本銇勯幘瀛樸仢婵﹨娅ｉ幑鍕Ω閵夛妇褰氶梻浣烘嚀閸ゆ牠骞忛敓锟�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曢妶蹇斿婵鍘ф晶浼存煙楠炲灝鐏叉鐐村浮瀵噣鏁撴禒瀣辈婵犲﹤鐗婇悡鏇㈡煃閳轰礁鏆熼柍鍙ョ窔閺岋綁骞樼�涙顦ㄧ紓浣虹帛閻╊垰鐣烽崡鐐嶇喖宕崟鍨秼闂傚倷娴囬褎顨ヨ箛娑欌挃闁告洦鍨版闂佸憡娲﹂崹鎵不閹惰姤鐓欓柟顖嗗喚鏆㈤梺浼欑悼閺佽顫忛搹鐧告嫹閸︻厼校妞ゃ儱顦伴妵鍕晝閸屾稒閿梺浼欑秮閺�杈╃紦娴犲宸濆┑鐘插�风花濠氭⒒娴ｅ憡鍟為柟鍝ュ厴閹虫宕奸弴锟介崶顒佹櫢闁跨噦鎷�
 * 
 */
public class MEnterScene extends __MEnterScene__ {
	@Override
	protected void process() {

		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role == null)
		{
			role = RoleManager.getInstance().createRole(roleid,sceneid, posx, posy);
		}
		
		//濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨椤愩垺澶勯柟鍛婃尦瀵顓兼径瀣弳濠电娀娼уΛ娆撍夐悙瀵哥闁告侗鍨伴埢鍫ユ煛瀹�锟介崰鎾跺垝濞嗘挸绠伴幖娣灩闂傤垶姊绘担鍝ワ紞缂侇噮鍨跺濠氬Ω閳轰胶鍘撮梺纭呮彧闂勫嫰宕戦幇鐗堢厵缂備焦锚娣囶垰霉閻橀潧甯堕柍瑙勫灴閹瑩鎳犻锟介埅杈ㄧ節閻㈤潧鍓抽柟椋庡厴濮婃椽宕崟顕呮蕉闂佸憡鏌ㄩ惌鍌炲春閵夛箑绶炲┑鐐灮閸犳牠骞婇弽顓炵厸濞达絾鍔呴悢灏佹斀闁绘灏欏Λ鍕煏閸繈顎楁繛鍫熺箞濮婂宕掑顒変患闁诲孩鍑归崳锝夊极閹剧粯鍋╅悘鐐靛亾濮ｅ嫰姊洪崨濠庣劶闁搞儴鍩栭弲锝嗙節闂堟稑锟藉鈥﹂崼銉﹀�峰┑鐘叉处閻撳繐鈹戦悙鎴濆�婚ˇ锕�霉閻樺磭鐭掓慨濠傤煼瀹曟帒鈻庨幒鎴濆腐婵＄偑鍊ら崢濂告偋韫囨稑绠查柕蹇嬪�曠粻铏繆閵堝拑鏀婚柡鍛灲濮婃椽鎳栭埞鐐珱闂佸憡鎸诲畝鎼佹晲閻愬搫鍗抽柣鏃囨椤旀洟姊虹化鏇炲⒉閽冮亶鎮樿箛锝呭籍闁哄本绋戣灃濞达絿纭堕弸娆撴⒑鐠団�虫灍妞ゃ劌鎳橀崺銉﹀緞婵炵偓鐎洪梺鎯ф禋閸嬪嫰鎮橀幘顔界厵妞ゆ洖妫涚弧锟介梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜為柛妯圭矙濮婅櫣绱掑Ο鑽ゅ弳闂佺濮ょ划鎾荤嵁婵犲洤绀嬫い鏍ㄧ☉娴犲搫顪冮妶鍡欏缂侇喖鐭傚鎼佸箣閻樼數锛滈梺鍝勫暙閸婃悂寮搁幋鐘电＜缂備焦顭囩粻鐐碉拷瑙勬礀閻栧吋淇婇幖浣割潊闁炽儱纾Σ顖炴⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋涢拑鐔兼煏婵犲繘妾繛鍛█楠炴牗娼忛崜褎鍋ч梺娲诲幖濡鍩為幋锔藉亹闂婎偒鍘剧粈鍫ユ煙閸忚偐鏆橀柛鏂跨焸閹瑦绻濋崶銊у弳濠电娀娼уΛ娆撳闯瑜版帗鐓冪�瑰嫰鍋婂Σ鍦磼缂佹銆掗柨鐔烘櫕閺佹悂鈥﹂崼銏℃殰闁割偅娲橀悡娆撴煣韫囷絽浜鹃柤鎷屾硶閿熻姤顔栭崳顕�宕戦崟顖ｆ晣濠靛倻顭堥獮銏′繆閵堝懎鏆熼柣娑卞枟缁绘繈鎮介棃娑楁勃闂佹悶鍔忓▔娑綖濠靛惟闁冲鍐╁枠妞ゃ垺宀搁弫鎾绘寠婢舵ɑ缍庡┑鐐叉▕娴滄粎绮昏ぐ鎺撶厽闁归偊鍘肩徊璇测攽椤斿搫鐏紒缁樼箓閳绘捇宕归鐣屼邯缂備礁澧介搹搴ㄥ矗閸愵喚宓侀煫鍥ㄥ搸娴滃綊鏌熼悜妯诲碍濞存粍绮撳铏圭矙鐠恒劎顔戦梺绋款儐閸旀瑥鐣峰┑瀣仺闁告稑艌閹锋椽姊洪崨濠勭畵閻庢凹鍓熼、鏃堝煛閸愵亞锛滅紓鍌欑劍閿氱紒妞﹀洦鐓涘〒姘搐濞呭秶锟借娲栧畷顒勫煡婢跺ň鏋庨悘鐐村劤椤忔椽姊婚崒娆戭槮闁硅绻濆畷婵嬫晜閻ｅ矈娲稿┑鐘诧工閻楀棝宕欓悩纰夋嫹楠炲灝鍔氭繛灞傚妿婢规洘绺界粙璺ㄩ獓闂佸壊鍋呯喊宥呪枍閸涱劶褰掓偐鐠佽櫕鍠氶梺鍝勭灱閸犳牠銆佸☉姗嗘僵妞ゆ帊鐒﹂鎺楁煟鎼淬値娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娓氾拷瀵噣宕煎┑鍫О婵＄偑鍊曠换鎰涘☉銏犳辈濞寸厧鐡ㄩ埛鎺楁煕鐏炲墽鎳勭紒浣哄閵囧嫰寮撮悢鍝勨拰閻庤娲╃徊楣冨箚閺冨牆惟闁靛鍎抽敓绛嬪弮濮婂搫效閸パ呬痪闂佽鍠栭悥濂稿极閹剧粯瀵犲璺侯儏濞堟姊烘潪鎵槮闁稿﹤娼￠獮鍐箚瑜忛弳鍡涙煥閻斿墎鐭欐鐐诧工閳规垿宕辫箛鏃�鏉搁梻浣虹帛椤洨鍒掗姘ｆ鐟滄棃寮婚妸鈺佸嵆妞ゅ繐妫涢弳銈夋⒑闂堟稒顥滈柟铏耿閵嗕線寮撮姀鈩冩珕闂佷紮绲介懟顖炵嵁閸儲鈷掑ù锝囨嚀椤曟粍淇婇锛勫妽闁逛究鍔戞俊鍫曞炊椤垵浠洪梻浣告啞閻熴儵藝鏉堚晝涓嶅Δ锝呭暞閸婂灚绻涢幋鐐垫嚂闁稿浚鍓熼弻銈夋偋閸繍鍤嬮梺閫涚┒閸斿秶鎹㈠┑瀣＜婵☆垵妗ㄩ崚鎺楁⒒娴ｇ瓔鍤冮柛鐘虫崌瀹曞綊鎸婃径灞炬濠电姴锕ょ�氼厽鍒婇弶鎴欙拷鎺戭潩閻撳海浠紒妤佸灥閳规垿鎮╅崹顐ｆ瘎闂佺瀛╅崹鐟邦嚗婵犲洦瀵犲瑙勭箖濡炰粙骞冮埡鍐╁珰闁肩⒈鍓﹀Σ鑸电節閻㈤潧鈻堟繛浣冲厾娲Χ婢舵ɑ鏅梻渚囧墮缁夌敻鎮￠弴鐔虹闁瑰鍎愰悞浠嬫煙閻ｅ苯鈻堥柡宀嬬節瀹曨亝鎷呯粙搴撴嫬闂備浇顕栭崰妤呮晝閵忋倕绠栨繛鍡樻尭缁狙囨煙鐎涙绠撶悮妯衡攽閿涘嫬浜奸柛濞у懎绶ら柟瑙勫姂娴滃綊鏌涢幇闈涙灍缂佺姵甯″缁樻媴閾忕懓绗￠梺鎸庢磵閺呯姴鐣锋导鏉戝唨妞ゆ挾鍋熼ˇ顔尖攽椤旀枻渚涢柛妯哄⒔瀵囨晸娴犲鈷戦悹鎭掑妼閺嬪秶绱掗鐣屾噰闁靛棔绶氬顕�宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂吘锝夘敍閻愮补鎷绘繛杈剧到閹诧繝骞嗛崼銉︾厽婵°倧鎷风紒缁樏锝夘敃閿曪拷缁犵懓銆掑顒佸闁哄拑绲介埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牓骞冮敓鐘插嵆闁绘梻顭堝鍨攽椤旂瓔娈旀俊顐ｎ殕閺呭墎锟芥稒菧娴滄粓骞栧ǎ顒�鐒烘繛鍫熸礋閺屾洟宕惰椤忣參鏌℃担绋匡拷濠氬箟閹绢喖绀嬫い鎺戝�哥紞鍐⒒閸屾瑦绁版い鏇熺墵瀹曚即寮介鐔蜂函闂佺粯鎸稿ù鐑藉汲閿曞倹鈷戞い鎺炴嫹缂佸绶氬顐﹀炊椤掍胶鍘藉┑鈽嗗灡濡炲潡宕箛鏂剧箚闁肩⒈鍓欓崢瀛樻叏婵犲嫮甯涢柟宄版噽閹叉挳宕熼鈥虫憢闂傚倷鑳堕…鍫濐潩閿曪拷閳诲秹寮撮姀鐘电杽闂侀潧顭堥崕鎶藉汲閿曞倹鐓曢柕澶涚到婵″吋銇勮箛鏃�鍊愭慨濠呮缁辨帒螣閻戔晜瀚介梻浣告啞椤棝宕ㄩ婊呭姸闂備胶顭堥惉濂稿磻閻愮儤鍋傛繛鎴欏灪閻撴洘銇勯幇鍓佹偧闁活厼鐬肩槐鎺撴媴閸濆嫬骞嬮梺鍝勬湰缁嬫垿锝炲鍫濆耿婵°倧鎷烽柍宄邦儔濮婅櫣鎷犻垾铏亾闂佺绻戦敋妞ゆ洩缍佸鍫曞箣椤撶喎鍏婇梺鍝勵槸閻楀啴寮插┑鍡欐殾闁哄被鍎查埛鎺懨归敐鍛儓闁汇劍鍨块弻鐔割槹鎼粹�冲箣闂佸搫琚崝宀勫煘閹达箑骞㈤柍鍝勫�愯濮婃椽骞庨懞銉︽殸闂佸湱鎳撳ú顓烆嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崜鑼帥闁革綆鍣ｅ鎶藉閵忋垻锛濇繛鎾磋壘閿曘儳锟芥俺顫夌换婵嬫偨闂堟刀銏＄箾鐠囇呯暤闁糕晜鐩獮瀣攽閹邦喖鏁搁梺鑽ゅЬ濞咃綁宕曢妶澶婄疅闁告縿鍎崇壕鍏肩箾閹寸儐鐒界紒鐘茬－缁辨帗娼忛妸銉х懖濠电偟鍘х换妯讳繆濮濆矈妲鹃梺姹囧�曠�氼剝鐏冮梺缁橈耿濞佳囧礈閹惰姤鐓欓柛鎴欏�栫�氾拷?濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴犵棯閹勫仴鐎殿喖鐖煎畷鐓庮潩椤撶喓褰嗘俊鐐�ら崑鍛洪悢鐓庤摕闁绘柨鍚嬮崐閿嬨亜閹虹偞瀚规繝鈷�灞界仭缂佺粯鐩濠氬级閹存繄銈梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠闁卞洦绻濋棃娑欘棞閼叉牕鈹戦悩娈挎毌闁告挻绻堥幃锟犲焺閸愵亶娲搁梺鍓插亝濞叉牠鎷戦悢鍏肩叆婵犻潧妫Σ褰掓煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?
		new fire.pb.team.PRoleOnline(roleid).submit();
		
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦鍟囬梻浣稿暱閹碱偊骞婃惔銊ュ瀭闁稿瞼鍋為悡鏇熶繆閵堝懎鏆欓柛鎾村▕閺屻倝寮堕幐搴′淮闂佸搫鐭夌徊鍊熺亙闂佽法鍠嶇划娆撳箖瑜斿畷鍗炩枎閹伴潧浠洪梻浣虹帛閸旀宕曢妶澶嬪亗闁哄洢鍨洪悡娑㈡煕閵夛絽鍔氬┑鈥冲悑椤ㄣ儵鎮欓幖顓熺杹闂佸搫鏈粙鎺旀崲濠靛﹦鐤�闁哄倹顑欐导锟�
		new fire.pb.instancezone.PRoleOnline(roleid,sceneid).submit();
		
//		new fire.pb.mission.instance.PRoleOnline(roleid, sceneid).submit();
		
		//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯疀妞ゆ棁妫勬惔濠囨⒑瑜版帒浜伴柛鐘愁殔閻ｇ兘寮婚妷锔惧幍闂備緡鍙忕粻鎴炴櫠妤ｅ啯鐓犻柡澶嬪閸嬨儵鏌″畝锟介崰鎾舵閹烘顫呴柣妯虹－娴滎亪姊绘担铏瑰笡闁告梹娲熼弫鍐敂閸繆鎽曞┑鐐村灦鑿ら柡瀣捣閿熻棄绠嶉崕閬嶅箠鎼淬垺鍙忛柕蹇嬪�栭埛鎴︽煠婵劕锟芥洟寮搁幋锔界厱闁哄喛鎷烽柣鐔叉櫅椤曪絿鎷犲ù瀣潔濠碘槅鍨堕弨閬嶆倵婵犳碍鈷戠憸鐗堝笒娴滀即鏌涢幘瀵糕檨閻庨潧銈搁弫鎾绘晸閿燂拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜閵囨盯鏁撻弬銈囩暤鐎规洖銈搁弫鎰償閵忥紕閽掗梻鍌氬�搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅梺鍝勭▉閸樿偐绮堥崒娑氱闁瑰瓨鐟ラ悘顏堟煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備礁鎼鍕濮樿泛钃熼柣鏃傚帶缁犳煡鏌熸导瀛樻锭婵炲牜鍘剧槐鎾存媴閸濆嫷锟芥挾绱撳鍕獢鐎殿喖顭烽幃銏ゅ礂閼测晛濮洪梻浣瑰濞测晠骞忛悜鑺ョ厸閻庯綆鍓欓弸娑㈡煛瀹�瀣М闁轰焦鍔欏畷鍫曞Ω瑜滈崬绁奵
		fire.pb.timer.AbstractScheduledActivity.sendActivityNpcToMiniMap(sceneid, roleid);
		
		//闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枛閸ㄦ繈骞栧ǎ顒�鐏繛鍛У娣囧﹪濡堕崨顔兼缂備胶濮抽崡鎶藉蓟濞戞ǚ妲堟慨妤�鐗婇弫鎯р攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌徊鍊熺亽闂佸憡绻傜�氼厼袙閹邦喚纾藉ù锝囶焾椤ｆ娊鏌涚�ｃ劌锟芥繂顕ｇ拠娴嬫闁靛繒濮村畵鍡涙⒑闂堟侗鐒鹃柛濠冾殜瀵偊寮介鐔叉嫼闂佺粯鎸稿ù椋庣矓閾忓湱纾奸柣妯虹－婢х數锟芥鍠栭…鐑藉箖閵忋倕绀傞柣鎾冲閻ゅ倿姊绘担绋款棌闁绘挸鐗撳畷鎴﹀幢濞存澘娲、姗�濮�閳撅拷閹锋椽姊婚崒姘卞缂佸鎸婚弲鍫曞箣閿旂晫鍘遍梺鍝勫�藉▔鏇″�寸紓鍌欑贰閸犳鎮烽埡鍛瀬闁瑰墽绮弲鎼佹煥閻曞倹瀚�?   闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸湱绮敮顏堝箯閻戣姤鍋ㄧ紒瀣劵閹芥洟姊洪幐搴㈢闁稿﹤缍婇幃锟犲礃椤旂晫鍘撻柡澶屽仦婢瑰棝藝閿曞倹鐓涢柛鈩冪懃娴犙呯磼鏉堛劌娴柟顔规櫊瀹曟﹢宕ｆ径搴ｆ闂傚倷绀侀幖顐︽儔婵傜绐楅柡宥庡幖缁犵姵绻濇繝鍌滃闁搞劌鍊归妵鍕箛閳轰緤鎷烽妶鍛傦綁宕奸弴鐔叉嫽婵炴挻鐔幏閿嬬箾娴ｅ啿娲﹂崑瀣煕閺囥劌鐏犵紒锟芥径宀嬫嫹楠炲灝鍔氶柟宄邦儔閹偞绂掔�ｎ偆鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�? 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸湱绮敮鈺傚閿熻棄鈹戦敍鍕户闁硅櫕鎹囧畷顖炲锤濡炰紮鎷烽敂鐐磯闁靛绠戠壕顖炴⒑閹呯婵狅拷闁秴绀夋い鏍仦閳锋垹绱撴担璇＄劷闁冲彞绶氶弻鐔煎川婵犲啫锟芥劙鏌嶉妷顖滅暤鐎规洜顭堣灃闁跨喍绮欓弻瀣炊椤掍胶鍘遍梺鏂ユ櫅閸犳艾鈻撻弮鍫熺叆闁绘梻绮ˉ澶嬨亜椤撶姴鍘存鐐诧工閳规垹锟斤綆鍋呭▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹30缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢幘鑼瓘闁瑰嘲鍢查～婵嬵敆閸屾粠鍟嬮柣搴ゎ潐濞叉﹢鏁冮姀鈥茬箚婵繂鐭堝Σ缁樼節濞堝灝娅欓柟鍑ゆ嫹
		xbean.Properties prop =  xtable.Properties.select(roleid);
		Integer curlevel = prop.getLevel();

		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒绱濋梻浣芥〃缁�浣肝涘┑瀣摕闁挎繂妫欓崕鐔搞亜椤愵偄骞楁俊顖氼洺bansize闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣虹帛閸旀牜绮婇幘顔煎嚑鐎广儱顦伴悡鏇熶繆閵堝懎鏆為悘蹇曟珴
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				HuoBanColumn huobanColumn = HuoBanColumn.getHuoBanColumn(roleid, false);
				final Role rolescene = RoleManager.getInstance().getRoleByID(roleid);
				rolescene.setHuobanSize(huobanColumn.getFightHuobanKeys().size());
				return true;
			}
			
		}.submit();

		
		fire.pb.mission.Module.getInstance().enterWorldOK(role.getRoleID());
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫绮婚悩璇茬婵烇綆鍓欐俊鑲╃磼閻樹警娼愰柕鍥у楠炲洭宕滄担鑽锋垿姊洪崨濠勬噧缂佺粯锕㈤幃锟狀敃閿曪拷閻愬﹪鏌曟繝蹇擃洭妞わ负鍔戦弻锝嗘償閵忋埄鏆￠悗鐧告嫹闁归棿绀侀拑鐔兼煥閻斿搫孝闁绘劕锕弻宥嗘姜閹殿喗鍋ч梺闈涱槴閺呮粓鎮￠悢鎼炰簻闁规崘娉涢崜鎶芥煛閿熺晫鎷犻惈顒�閰ｅ畷鎯邦檪闂婎剦鍓熼弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熸潏鍓х暠缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
		if(ImpExamManager.getInstance().isInImpExamTime() != -1 && curlevel>=20){
			ImpExamManager.getInstance().roleLoginCheck(roleid);
		}
		
		fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().roleLoginCheck(roleid, prop.getLevel());
		fire.pb.activity.clanfight.ActivityClanFightManager.getInstance().roleLoginCheck(roleid, prop.getLevel());

		if (curlevel >= PvP1Helper.ENTER_MIN_LEVEL && (PvP1Control.getInstance().isActivityTime() || PvP1Helper.isPvPMap((int) sceneid))) {
			// 1v1
			PvP1Control.getInstance().onRoleOnline(roleid, (int) sceneid);
		} else if (curlevel >= PvP3Helper.ENTER_MIN_LEVEL && (PvP3Control.getInstance().isActivityTime() || PvP3Helper.isPvPMap((int) sceneid))) {
			// 3v3
			PvP3Control.getInstance().onRoleOnline(roleid, (int) sceneid);
		} else if (curlevel >= PvP5Helper.ENTER_MIN_LEVEL && (PvP5Control.getInstance().isActivityTime() || PvP5Helper.isPvPMap((int) sceneid))) {
			// 5v5
			PvP5Control.getInstance().onRoleOnline(roleid, (int) sceneid);
		}
		
		if (BingFengLandMgr.bingFengMaps.contains((int)sceneid)) {
			if (!DateValidate.inTheSameDay(prop.getOfflinetime(), prop.getOnlinetime())) {
				Transfer.justGoto(roleid, 1615, 49, 89, SRoleEnterScene.CHEFU);
			}else
			    BingFengLandMgr.getInstance().sendAfterEnterBingFengLand(roleid, true);
		}
		
		//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎电濡介梺鍝勬噺缁诲牓寮婚妸鈺佸嵆闁绘劘顕滈幏鐑藉箹娴ｆ瓕袝閻熸粎澧楃敮鎺旂不鐟欏嫮绠鹃柨婵嗛婢ь喖鈹戦檱閸嬫劗妲愰幒妤佸亹闁割煈鍋呭В鍫ユ⒑閸濆嫮鐏遍柛鐘崇墵楠炲啳顦圭�规洖銈搁幃銏ゅ传閸曨偅顓奸梻鍌氬�风粈渚�骞栭锕�绠悗锝庡亞椤╁弶銇勮箛鎾跺闁藉啰鍠栭弻锝夊籍閸屾艾浠樼紓浣哄У鐢繝寮婚悢鍏煎�绘俊顖濇娴犳潙顪冮妶搴′壕闁瑰嚖鎷�??
		TuiSongNotifyManager.getInstance().roleLogin(roleid);
		
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌曢崼婵愭Ц缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煟閹捐泛鏋涢柡宀�鍠栭幃娆擃敆閿熶粙鍩㈤弴鐔翠簻閹兼番鍩勫▓婊堟煛瀹�瀣М闁轰礁鍟撮弫鎾寸鐎ｎ偄浜繝闈涘�婚…鍫ユ嫅閻斿吋鐓熼柡鍐ㄦ处椤忕姷鐥幆褍鎮戝ǎ鍥э躬椤㈡稑顫濋鐔峰壍婵＄偑鍊ら崑鍛暜閳ユ剚娼栨繛宸簻娴肩娀鏌曟径鍫濆姕闁绘縿鍨藉娲偡閺夋寧顔�闂佺懓鍤栭幏锟�
		GiftBagMgr.getInstance().roleLogin(roleid, curlevel);
		
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲锋繝寰锋澘锟芥捇鎮為敃鍌氱煑闊洦绋掗悡娆戠磽娴ｉ潧鐏╅柡瀣洴閺岋綁濡舵惔鈩冪亶婵烇絽娲ら敃顏呬繆閸洖宸濇い鎾跺枑椤斿姊虹拠鎻掝劉缁炬澘绉撮悾婵嬪箹娴ｆ瓕鎽曢梺璺ㄥ枔婵挳鎮欐繝鍥ㄧ厓閺夌偞澹嗛幃濂告煏韫囨洖违鐟滅増甯楅崑鎰版煕椤垵浜滄繛鍫濈焸濮婅櫣锟藉湱濮甸ˉ澶嬨亜閿旂偓鏆柣娑卞枛铻ｉ柤娴嬫櫊閳瑰繘姊洪懡銈呮瀾婵犮垺锕㈤敐鐐烘偐缂佹ǚ鎷绘繛杈剧秬椤宕戦悩缁樼厱濠电姴鍟粈瀣煛鐏炴枻韬柡浣瑰姈瀵板嫮浠﹂悾灞诲亰闂傚倸顭崑鍕洪敃鍌氳摕闁靛ě鍕靛仺闂佺粯鍔曞Ο濠囨偄閸℃稒鍋ｉ弶鐐村椤掔喖鏌涙惔銏犵仸缂佺粯绻嗛¨鍌炴煙閸戙倖瀚�
		//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劏娉涢～蹇撁洪鍕�銈嗘礀閹冲酣宕滈幍顔剧＝濞达絿顭堥。鎶芥煕鐎ｃ劌锟芥繂顕ｇ拠娴嬫闁靛繒濮村畵鍡涙⒑闂堟侗鐒鹃柛搴や含缁煤椤忓應鎷虹紓浣割儏鐏忓懘宕濋悢鍏肩厱閻庯綆鍋嗗ú鎾煕閳瑰灝鍔滅�垫澘瀚伴獮鍥敇閻斿壊浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氫即寮诲☉妯锋婵炲棙鍔楃粙鍥⒑濮瑰洤锟姐倝宕板Δ鍐╁床婵犻潧顑嗛ˉ鍫熺箾閹存繂鑸归柛鎾村缁辨挻绗熸繝鍐伓闂備礁鎲￠崝蹇涘疾濠靛牏涓嶅Δ锝呭暞閻撴瑩鎮楅悽娈跨劸濞寸姍鍥ㄧ厽妞ゆ挾鍋炲﹢鏉壳庨崶褝韬�规洩绲惧鍕拷锝庝悍閹风兘骞囬悧鍫㈠幐閻庣櫢鎷烽悗锝庡墰琚︽俊銈囧Х閸嬫稑煤椤撯偓锟戒礁鈽夊鍡樺兊濡炪倖鍔х徊鍨焽閺嵮�鏀介柣妯虹仛閺嗏晠鏌涚�ｎ偆娲撮柟顔ㄥ嫮绡�闁搞儜鍐拷顓㈡⒑閸涘﹥灏柤鍐茬埣閹苯鈻庤箛锝囧數闁荤姾妗ㄧ拃锕傚磿閹寸姷纾奸柍钘夋噺鐎氬綊姊婚崒娆戭槮闁规祴锟借秮娲晝閸屾氨锛涢梺鍛婄☉閻°劑宕戦鍫熺厱闁靛鍠栨晶顖炴煃闁垮鐏撮柡宀嬬秮閹垽宕ㄦ繝鍕殥婵犲痉銈呯毢缂侇噮鍨舵俊鐢稿礋椤栨稒娅嗛柣鐘叉搐瀵爼鎮橀崼銉︾厸濞达絽鎽滄晶锕傛煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�
		if (curlevel >= WinnerManager.MIN_LEVEL) {
			WinnerManager.getInstance().sendWinnerCallPlayer(roleid);
		}
		
		new fire.pb.clan.fight.PRoleOnline(roleid).submit(); //闂傚倸鍊峰ù鍥敋瑜嶉～婵嬫晝閸岋妇绋忔繝銏ｅ煐閸旀洜绮婚弽顓熺厱妞ゆ劧绲剧粈锟界紒鐐劤濞硷繝寮婚悢灏佹灁闁割煈鍠楅悘宥咁渻閵堝骸浜濇繛鍙夌墵濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閻樼數锛滈梺缁樼懃閹虫劗绮欑拠鐫酣宕惰闊剚銇勯姀锛勨槈闁宠棄顦靛畷锟犳倷閹绘帩鐎虫繝鐢靛Х閺佹悂宕戦悢鐓幬ラ悗锝庡墯瀹曞弶绻濋棃娑卞剰闁藉啰鍠栭弻鏇㈠醇濠靛洤顦╅梺绋跨箲缁捇寮诲☉妯锋闁告鍋涚粻缁樼節閵忥絾纭鹃悗姘煎枤濡叉劙骞樼�涙ê顎撻柣鐘叉礌閸撴繈鎮鹃崼鏇熲拺缂佸灏呭銉︺亜椤撶姴鍘存鐐叉閺佹挻绂掔�ｎ偆鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�? by changhao	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720904;

	public int getType() {
		return 720904;
	}

	public long roleid; // 角色ID
	public long sceneid;
	public int posx;
	public int posy;

	public MEnterScene() {
	}

	public MEnterScene(long _roleid_, long _sceneid_, int _posx_, int _posy_) {
		this.roleid = _roleid_;
		this.sceneid = _sceneid_;
		this.posx = _posx_;
		this.posy = _posy_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(sceneid);
		_os_.marshal(posx);
		_os_.marshal(posy);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		sceneid = _os_.unmarshal_long();
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MEnterScene) {
			MEnterScene _o_ = (MEnterScene)_o1_;
			if (roleid != _o_.roleid) return false;
			if (sceneid != _o_.sceneid) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)sceneid;
		_h_ += posx;
		_h_ += posy;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MEnterScene _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = posx - _o_.posx;
		if (0 != _c_) return _c_;
		_c_ = posy - _o_.posy;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


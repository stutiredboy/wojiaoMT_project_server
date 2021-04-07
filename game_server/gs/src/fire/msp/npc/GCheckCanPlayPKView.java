
package fire.msp.npc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import fire.pb.battle.BattleType;
import fire.pb.battle.QCmodelType;
import fire.pb.main.ConfigManager;
import fire.pb.npc.SLeitaiLevel;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneClient;
import fire.pb.scene.SceneManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.GridPos;
import fire.pb.scene.sPos.Position;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCheckCanPlayPKView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCheckCanPlayPKView extends __GCheckCanPlayPKView__ {
	
	public static final Logger logger = Logger.getLogger("BATTLE");
	public static final int CQMAPID=1615;//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣告贡閸庛倝宕靛顑炴椽顢旈崟搴樻櫊閺屽秶锟界锟藉啿鏋ゆ俊顖ゆ嫹婵°倗濮烽崑娑樏洪鐑嗗殨闁割偅娲栫粻浼村箹鏉堝墽纾块柕鍫濈埣濮婂宕掑▎鎴М闂佸湱鈷堥崑濠呮闂佽顔栭崳顖炲箯妞嬪海绠旀繛鎴炆戦崳浠嬫煟椤撶儐妯�闁哄本绋栭ˇ铏繆鐠囇勫
	public static Map<Integer,SLeitaiLevel> sLeitaiLevelmap=ConfigManager.getInstance().getConf(SLeitaiLevel.class);
	
	public static final int MAX_NUM=50;
	
	@Override
	protected void process() {
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ锝夋⒒娴ｅ摜绉烘い銉︽崌瀹曟顫滈敓浠嬪箖娴兼惌鏁嬮柨鐔绘閻ｇ柉銇愰幒婵囨櫓闂佸憡鐟ｉ崕鍐参涢鐐粹拻闁稿本鐟ㄩ崗宀�鐥鐐靛煟鐎殿喗褰冮…銊╁川椤栨粎鍘梻浣筋潐瀹曟ê鈻斿☉銏犲瀭婵犻潧顑嗛悡鍐煕濠靛棗顏┑顖氥偢閺屸剝鎷呴崫銉愶綁鏌熸笟鍨妞ゎ偅绮撳畷鍗炍旈敓浠嬶綖椤愶附鍊甸柣褍鎲＄�氱懓鈹戦悙鏉戠仧闁搞劍妞介崺娑㈠箳閹存瑱鎷烽幒鎴僵妞ゆ帊鐒﹂幃娆愮箾鐎涙鐭嬫い銊ワ躬瀵濡堕崶閿嬪闁革富鍘兼牎缂佺虎鍙冪粻鏍蓟瀹ュ洨纾兼俊顖濐嚙绾惧啿螖閻橀潧浠滄い鎴濐樀瀵偊宕掑鍕瀭闂佹寧绻傚Λ妤咁敂濞差亝鈷掗柛灞剧懅缁愭梹绻涙担鍐叉礌閿熸枻绠撻、姗�濮�閳撅拷閹稿啴姊洪崨濠冨闁搞劑浜跺畷鎰節濮橆厾鍙嗛梺鍝勬川閸嬫盯鏁撻挊澶岀Ш闁诡噯绻濆鎾偄閾忓湱妲囧┑鐘垫暩婵挳宕愰幖浣告辈闁绘柨鍚嬮悡鐔肩叓閸ャ劎鈼ラ柟鏌ョ畺閺屸�崇暆鐎ｎ剛袦闂佺硶鏅涚�氭澘鐣峰锟芥俊姝岊槺闁诡噯缍佸缁樻媴閸︻厽鑿囬梺绋挎捣閸庛倗绮嬪澶嬫櫜濠㈢櫢绠戝ú顓炵暦閿熺姵鍊堕柤濮愬�栭崵锟藉銈庡幑閸旀垵鐣烽悢纰辨晝闁挎繂鐗忓銊╂⒑鐠囧弶鍞夋い顐㈩槸鐓ら柍鍝勫暙缁躲倝鏌涢幘妤�瀚惔濠傗攽閻樼粯娑фい鎴濇噽缁牓宕掗悙瀵稿帗闂侀潧顦崝宀勬儍閾忓湱纾奸柟閭﹀幗閳锋帡鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级缁捇鍨鹃敃鍌氶唶闁挎繂娲ｇ花閿嬬節閻㈤潧浠╅柟娲讳簽缁辩偤鏁撻懞銉ｄ簻妞ゆ劑鍩勫Ο锟藉銈冨灪閻熴儵顢橀崗鐓庣窞閻庯急鍕伖缂傚倷鑳堕搹搴ㄥ储婵傜绠悗锝庡枛閸氬綊鏌涢幇闈涙灍闁绘挻娲熼弻锝呂熺拠鎻掝潽濠电偛鐗婂Λ鍐ㄧ暦閿熺姵鐒肩�广儱妫涢崢鐢告⒒閸屾艾锟芥悂顢氶鈶哄洭鏁冮崒娑樹画濠电偛妫欓悷褔鎮鹃悽鍛婄厸閻忕偠顕ф慨鍌滐拷娈垮櫘閸ｏ絽鐣烽幒鎴叆闁告洦鍓欓弲鐢告⒒閸屾瑧顦﹂柟娴嬶拷婢勬盯骞嬮敃锟界粻顖氼渻鐎ｎ亝鎹ｇ痪鎹愭闇夐柨婵嗙墱濞兼劙鎮楀顓熺闁哄瞼鍠栧畷娆撳Χ閸℃浼�?
		if(modeltype!=QCmodelType.ONE_FIGHT&&modeltype!=QCmodelType.TEAM_FIGHT&&modeltype!=QCmodelType.WATCH_FIGHT){
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣告贡閸庛倝宕靛顑炴椽顢旈崟搴樻櫊閺屽秶锟界锟藉啿鏋ゆ俊顖ゆ嫹婵°倗濮烽崑娑樏洪鈧拷渚�寮介鐐靛幐闂佸憡鍔戦崝宥夋倶閸儲鈷戦柟鑲╁仜婵倻绱掗悩宕囧⒌妤犵偞鐗為妵鎰板箳濠靛洦娅囨俊鐐�ら崑鎺楀储閽樺）鐔哥節閸ャ劉鎷婚梺绋挎湰閻燂妇绮婇悧鍫滅箚婵＄偟鍘ф慨鍌炴煙閾忣偒娈滈柟铏矒瀹曞綊顢曢敐鍥у▏濠电姴鐥夐弶鍖℃嫹瑜旈獮蹇涙倻閼恒儳鍘介梺鎸庣箓閹虫劖绂掑☉姘辩＜婵°倕鍟弸娑㈡煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗘禍锝夊箺閺囥垺鈷戦梻鍫熶緱閻掗箖鏌涙惔顔兼珝鐎殿喖鎲￠幆鏃堝Ω閿旀儳骞嶉梻浣虹帛閸ㄥ爼鈥﹂崶鈺冧笉闁规儳顕粻楣冩煕椤愶絿顣叉繛鍛攻閹便劍绻濋崘鈹夸虎濡ょ姷鍋為崝鏍箚閺冨牊鏅查柛灞句緱濞兼棃姊婚崒娆戭槮闁圭⒈鍋婇幃褍顭ㄩ崼婵堫槶濠电娀娼ч鍛存偪椤斿浜滈柡宥庡亜娴狅箓鏌嶉柨瀣仼缂佽鲸甯楀鍕節閸愮偓顥ｉ梺璇插閼归箖宕查弻銉ョ厺闁圭偓鍓氶悡銉╂煕椤愩倕鏋旈柛妯烘啞缁绘稒娼忛崜褏袦濠电偟鍘ч…宄扮暦濠靛鍋勯柛蹇氬亹閸樼敻姊洪崨濠傜仧闁稿﹥鐗滈敓鑺ョ啲閹凤拷?");
			return ;
		}
		
		if(sLeitaiLevelmap==null){
			logger.error("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣告贡閸庛倝宕靛顑炴椽顢旈崟搴樻櫊閺屽秶锟界锟藉啿鏋ゆ俊顖ゆ嫹婵°倗濮烽崑娑樏洪鈧拷渚�寮介鐐靛幐闂佸憡鍔戦崝宥夋倶閸儲鈷戦柟鑲╁仜婵倻绱掗悩宕囧⒌妤犵偞鐗為妵鎰板箳濠靛洦娅囨俊鐐�ら崑鎺楀储閽樺）鐔哥節閸ャ劉鎷婚梺绋挎湰閻燂妇绮婇悧鍫滅箚婵＄偟鍘ф慨鍌炴煙閾忣偒娈滈柟铏矒瀹曞綊顢曢敐鍥у▏濠电姴鐥夐弶鍖℃嫹瑜旈獮蹇涙倻閼恒儳鍘介梺鎸庣箓閹虫劖绂掑☉姘辩＜婵°倕鍟弸娑㈡煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗘禍锝夊箺閺囥垺鈷戦梻鍫熶緱閻掗箖鏌涙惔顔兼珝鐎殿喖鎲￠幆鏃堝Ω閿旀儳骞嶉梻浣虹帛閸ㄥ爼鈥﹂崶鈺冧笉闁规儳顕粻楣冩煕椤愶絿顣叉繛鍛攻閹便劍绻濋崘鈹夸虎濡ょ姷鍋為崝鏍箚閺冨牊鏅查柛灞句緱濞兼棃姊婚崒娆戭槮闁圭⒈鍋婇幃褍顭ㄩ崼婵堫槶闂佺粯妫侀崑鎰暤娓氾拷閺屸�愁吋鎼粹�崇闁诡垳鍠栧铏癸拷鍦У閵嗗啴鏌ら崘鑼煟闁诡噯绻濋獮瀣晜鐟欙絾瀚奸梺鑽ゅ枑閻熴儳锟芥氨鍏樺畷顖濈疀濞戞瑧鍘遍梺缁樏崯鍧楀传閻戞﹩娈介柣鎰嚟婢х敻鏌熼搹顐ゅ⒌闁糕晪绻濆畷姗�顢旀惔锝呯哎闂傚倸鍊烽懗鍓佸垝椤栫偞鍋￠柨鏇炲�归崑锟犳煏婢跺牆鍓繛宸簻鍥撮梺鎼炲劘閸斿秴鈻撴导瀛樺�甸悷娆忓缁�锟藉┑鐐茬湴閸斿孩绔熼弴鐔侯浄閻庯綆鍋嗛崢閬嶆⒑瑜版帒浜伴柛妯恒偢瀹曟繈濡舵径瀣幐闁诲函绲芥晶搴ㄦ偩閻㈠憡鐓涢悘鐐靛亾缁�瀣拷瑙勬礋娴滃爼銆佸锟介幃銏＄附婢跺澶�");
			return ;
		}
		int levelmin=0;
		int levelmax=1000;
		SLeitaiLevel sLeitaiLevel = sLeitaiLevelmap.get(levelindex);
		if(sLeitaiLevel!=null){
			levelmin=sLeitaiLevel.getLevelmin();
			levelmax=sLeitaiLevel.getLevelmax();
		}
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚鍤曢柛顐ｆ礀闁卞洦銇勯幇鍨窔缂併劌鐡ㄧ换娑氾拷娑欘焽閻﹦绱撳鍜冭含鐎殿喖顭烽幃銏ゆ偂鎼达絿鏆伴柣鐔哥矊缁夌懓顕ｉ搹顐ｇ秶闁靛绲肩花濠氭⒑闂堟稓澧曢柟鍐茬箻瀹曠敻宕堕浣哄幐闁诲繒鍋涙晶钘壝洪幘顔界厸濞达絿顭堥敓钘夋健閻涱噣宕卞鍏夹╁┑鐘殿暯閿熷�熸珪閹牓鏌嶇憴鍕伌闁诡喗鐟╁畷锝嗗緞婵犲喚浠梻鍌欐祰瀹曠敻宕崸妤�鐤炬繛鎴欏焺閺佸鏌ㄥ┑鍡橆棞妞ゆ洟浜堕弻鐔哄枈閸楃偛绠洪梺鍝勬媼閸撴瑩鍩為幋锔藉�烽柡澶嬪灩娴犳悂姊洪幐搴㈢５闁哄懐濮撮锝夊箮閼恒儲娅㈤梺缁樕戦弸濂稿箯濞差亝鈷戦柛娑橈功缁犳捇鎮楀鐓庢灍闁哄懎鐖煎鎾偄缂堢姷鐩庨梻浣瑰濞叉垵顪冮幒妤�瑙︽い鎰堕檮閻撴稑銆掑顒佹悙婵炲懎绉归弻鐔兼偂鎼达絿楔闂佽鍨伴崐鍨暦閵婏妇绡�闁稿被鍊撶槐锔剧磽閸屾瑨鍏岄柧蹇撻叄瀹曘垺绺界粙璺唵闁诲函缍嗛崰鏍偪椤曪拷閺屾盯濡烽姀鈩冪彇缂佺偓鍎抽妶绋款嚕閸洖閱囨繛鎴灻‖瀣磽娴ｅ搫啸闁稿鍊濆濠氭晲閸涱亝顫嶉梺鍛婎殘閸嬬偤鎮靛┑瀣�垫繛鍫濈仢閺嬨倝鏌℃担鍓茬吋妤犵偛鍟粋鎺旓拷锝庡亜娴犳椽姊洪崜鑼帥闁稿瀚埢宥夊閵堝棌鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鐐烘煥閻旇袚婵ǜ鍔戝畷妤�螣閾忚娈鹃悷婊呭鐢帞鐥閺屾盯寮婚婊冿拷褔骞忛悜钘夌閹煎瓨绋愮花濠氭椤愩垺澶勯柟鍝ュ亾閺呭爼寮撮悩鐢碉紲闂佺粯锚閻即宕戦姀銈嗙厸閻忕偛澧介妴鎺懨归悪鍛暤妤犵偞鍨块獮鍥敆婢跺妫ㄩ梻鍌氬�搁崐鐑芥倿閿曪拷椤灝螣閾忚娈惧銈嗗笒鐎氼剟鎮￠垾鎰佺唵闁兼悂娼ф慨鍥╃磼閻樺搫鍚圭紒杈ㄥ笒閳藉顫濋鐐寸暚濠电姵顔栭崰妤冪矙閹达箑鐓橀柟杈鹃檮閸婄兘鏌ょ喊鍗炲闁冲嘲锕娲偡閺夋寧顔�闂佺懓鍤栭幏锟�
		LinkedList<Long> rolelistid=new LinkedList<Long>();//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷鍫曟晸閽樺鏆ｆ鐐叉喘椤㈡瑩宕ｉ妷褏鎲归梻鍌欒兌椤㈠﹪骞撻鍡欎笉闁瑰濮锋稉宥夋煛瀹ュ骸骞栫紒鐘侯潐缁绘盯鏁愭惔鈥愁潻婵犲痉銈呬汗缂佽鲸甯￠幃顏勨枎韫囨柨顦╅梺缁樻尭閸熸挳寮婚弴鐔风窞闁割偅绻傛慨搴ｇ磽娴ｅ搫鐝￠柛鏇楁櫃缁ㄥ姊鸿ぐ鎺戜喊濞存粎鍋ら幆灞解枎閹惧鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ濠电姷顣介崜婵嬪箖閸屾稐绻嗛柣鎴ｆ鍞銈嗘瀹曢潧螞椤栨稓绡�闁汇垽娼цⅴ闂佺懓鍢查崯鏉戠暦濮楋拷椤㈡捇顢涢崱妤佸珔闁瑰嘲鍢查埢鎾诲垂椤旂晫浜梻浣筋嚙缁绘垿鎳濇ィ鍐炬晪闁靛鏅涚粈瀣亜閹惧绠栭柛鏇炲暣濮婅櫣绮欓崠鈥冲闂佸摜濮甸幑鍥婵炲鍘ч悺銊╁煕閹达附鍋ｉ柛銉ｅ妼缁插鏌涢妶澶夋喚闁哄瞼鍠栧畷娆撳Χ閸℃浼�?
		HashMap<Long, Long> watchfight=new HashMap<Long, Long>();
		Scene scene = SceneManager.getInstance().getSceneByID(CQMAPID);
		Set<Integer> aroundIndexs = new java.util.HashSet<Integer>();
		aroundIndexs.add(3);
		aroundIndexs.add(65539);
		Map<Long, Role> roles=scene.getAllRolesInScreens(aroundIndexs);
		int num=0;
		for(Role role : roles.values()){
			GridPos hostGridPos = role.getPos().toGridPos();
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵婵＄偛顑呴崙浠嬪箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻參姊虹粙璺ㄧ閽冨崬菐閸パ嶈含妤犵偞鐗楅幏鍛喆閸曨剛褰嗛梻鍌欑閸氬绂嶆禒瀣？闂侇剙绉寸粈鍫熴亜閹惧崬鐏柍閿嬪笒閵嗘帒顫濋悙顒�顏舵繝鐢靛仧閸樠団�﹂悜鐣屽祦闊洦绋掗弲鎼佹煥閻曞倹瀚�?
			if (!role.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())) {
				continue;
			}
			//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇灻洪鍕槶濠电偛妫欓幐鎼佹儗濡わ拷閳规垿鎮╅幓鎺撴婵炲瓨绮嶇划鎾诲蓟閳ユ剚鍚嬮柛鎰╁妼椤顪冮妶蹇曠ɑ闁绘搫绻濆璇测槈濞嗘劕鍔呴梺瀹犳閹冲孩鎱ㄥ☉姘辩＝濞达絼绮欓崫娲偨椤栨稑绗╅柣蹇撳暣閺岋絾鎯旈婊呅ｉ梺鍛婃尰閻╊垰顕ｉ幎鑺ュ亹缂備焦菤閹锋椽鏌ｉ悩鍙夌闁跨喎锟界喐鐝柣蹇撶墕閳规垿鎮欏顔兼闂佺绻戦敃銏ゆ偘椤旇棄绶為柟閭﹀幖娴滈亶姊洪崜鎻掍簽闁哥姴閰ｉ、鎾诲箻缂佹ǚ鎷洪梻鍌氱墐閺呮盯鎯佸鍫熺厱婵☆垰婀遍惌娆戯拷瑙勬礈閸犳牠寮幘缁樻櫢闁跨噦鎷�
			if(role.getLevel()<fire.pb.battle.CSendInvitePlayPK.PVP_LEVEL){
				continue;
			}
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦缂傚倸鍊风欢銈夊箯閻戣姤鐓曢柍鈺佸暟閳句線鏌ｉ幘璺烘瀾闁逛究鍔岃灃闁跨喍绮欓幃褎绻濋崟鑸靛婵鍋撶�氾拷?婵犵數濮烽弫鍛婃叏娴兼潙鍨傞柣鎾崇岸閺嬫牗绻涢幋娆忕仾闁稿孩鏌ㄩ埞鎴﹀磼濠婂海鍔哥紓浣哄Т缂嶅﹪寮婚妶鍚ゅ湱锟斤綆鍋呴悵鏍磼閻愵剙鍔ら柕鍫熸倐瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
			if(role.getLevel()<levelmin||role.getLevel()>levelmax){
				continue;
			}
			if(school>0){
				if(role.getSchoolId()!=school){
					continue;
				}
			}
			//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傛寧鍤囨慨濠冩そ濡啫鈽夊顒夋毇婵＄偑鍊х紓姘跺础閸愯尙鏆﹂柛顭戝亞缁★拷闂佸憡鍔х紓姘辫姳婵犳碍顥婃い鎰╁灪婢跺嫰鏌熼崨濠冨�愭い銏℃椤㈡洟濡堕崶鈺嬬床闂備胶绮悷銉╁箠韫囨洩鎷峰鐐
			if(role.getRoleID()==hostid){
				continue;
			}
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫ヮ敄閸℃瑦宕查柛顐犲劚閽冪喓锟藉箍鍎卞Λ娆愭叏濠婂牊鐓欐繛鍫濈仢閺嬶妇绱掗幇顓ф疁婵﹥妞藉畷顐﹀Ψ閵夛妇褰氶梻浣哥秺椤ユ捇宕楀Ο渚綎缂備焦蓱婵挳鏌涘☉姗堟敾闁稿孩鎹囬弻锝嗘償閵忥紕娈ら梺绋跨箲閿氶柣锝夘棑閹叉挳宕熼顐㈡闂備礁鎼ˇ浼村垂瑜版帗鍋╅柣鎰靛墰缁犻箖寮堕崼婵嗏挃缂佸鍓氱换娑㈠椽閸愵亝鍋ф繝銏ｎ潐濞叉缂撴禒瀣窛濠电姴瀚獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繂鐣濋崟顒�锟藉爼鏌ㄥ☉妯侯仾闁稿鐗楃换婵嬫濞戝崬鍓遍梺鎶芥敱閸ㄥ潡寮婚悢铏圭煓闁圭瀛╁畷鎶芥⒑鐎圭姵顥夋い锔炬暬瀵鏁愭径妯绘櫍濠电娀娼ч敃銈夊储閿熺姵鈷戦柣鐔稿閻ｎ參鏌涢妸銊︻棄闁伙絽鍢查～婊堟晸娴犲鐏抽柨鏇炲�哥粻锝夋煟濡绲绘慨瑙勭叀濮婂宕掑▎鎴犵崲濠电偘鍖犻崶銊ヤ罕闂佺硶鍓濋摂瀣炊椤掞拷缁狀垳锟界櫢鎷峰┑鐘插暞缁额參姊婚崒姘拷鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掕棄鈹戦悩瀹犲缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
			Team host_Team = TeamManager.selectTeamByRoleId(role.getRoleID());
			if (host_Team != null && host_Team.isNormalMember(role.getRoleID())){
				continue;
			}
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴婵拷闁斥晛鍟拌ぐ锝夋⒒娴ｅ摜绉烘い銉︽崌瀹曟顫滈敓浠嬬嵁閸愨晝顩烽悗锝庝簻閻庮厼顪冮妶鍡楀闁搞劍妞介幃楣冾敆閸屾粎锛濋梺绋挎湰閻熲晛顬婇悜鑺ョ厱闁哄倽娉曞暩闂侀潧娲﹂崝娆忕暦濮楋拷椤㈡﹢鎮╂潏顐㈢劵闂傚倸鍊搁崐鐑芥嚄閸洖纾婚柕濞炬櫅绾惧潡鏌℃径瀣亶闁哄绉归弻锟犲炊閵夈儳浠肩紒鐐劤椤兘寮婚妸鈺傚亞闁稿本绋戦锟�
			if(modeltype==QCmodelType.TEAM_FIGHT){
				//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗘搐閻ㄦ垿鏌熷畡鏉挎Щ妞ゎ偅绻堥、姗�鎮㈤崫鍕闂備礁鎲￠〃濠冪閸洖钃熼柕濞炬櫅閸楁娊鏌ｉ幇顖ｅ殝闁归鏌夐妵鎰板箳閹寸姵鐓ｆ俊鐐�栫敮鎺旓拷姘煎弮瀹曟劙宕奸弴鐔哄幗闂佸綊鍋婇崜娑欑濞戞瑧绠鹃柛娑卞枟缁�鍫㈢磼鏉堛劌娴柟顔规櫊瀹曟﹢鎳犻鎸庢▕濠碉紕鍋戦崐銈嗙濠婂牆鐤悗娑櫭肩换鍡涙煕椤愶絾绀�闁绘劕锕弻宥嗘姜閹峰苯鍘″銈嗗姇閸氬鎹㈠┑鍫濇瀳婵鐗婄�氬綊鏌涢幇顖氱毢濡ょ姴娲铏规嫚閳ヨ櫕鐏堥梺绋匡攻閹倿銆佸鑸垫櫜濠㈣泛锕ら悗顓烆渻閵堝棗濮傞柛銊ㄥ吹缁綁鎮欓悜妯锋嫼閻熸粎澧楃敮鎺撶娴煎瓨鐓曟俊顖濆吹閻帞锟芥鍠楅幐鎶藉箖濡吋瀚氶柤纰卞墰妤旈梻浣筋嚃閸犳帡宕滃┑瀣畾闁哄啫鐗婇弲顒勬煠閸撴彃澧柨鐔诲Г閻楁粓骞戦姀鐘闁靛繒濞�閸炶泛顪冮妶鍡楃瑐缂侊拷娓氾拷椤㈡棃鏁撻敓锟�
				if(host_Team == null){
					continue;
				}
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傛寧鍤囨慨濠冩そ濡啫鈽夊顒夋毇婵＄偑鍊х�靛矂宕瑰畷鍥у灊濠电姵鑹剧粈鍐拷鐟板閸犳岸宕悽鍛娾拺闁稿繐鍚嬮崐鎰箾娴ｅ啿瀚崣蹇涙煕椤愶絿濡囬柡锟介懞銉ｄ簻闁哄啫鍊瑰▍鏇㈡煟椤撶喎绗氶柟渚垮妽缁绘繈宕掗妶鍥ф倯闁诲氦顫夊ú姗�鏁冮姀銈冿拷渚�寮崼婵堫槹濡炪倖甯掗崐鐑芥焽椤栫偞鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰簻閾荤偞绻濋棃娑欏窛妞も晜鐓￠弻娑㈩敃閿濆棛顦悗瑙勬尫缁舵岸骞冨Δ鍛櫜閹肩补鍓濋悘鍫㈢磽娴ｅ搫校缂佸甯℃俊鐢稿礋椤栨氨顔婇悗骞垮劚濞村倸危椤曪拷濮婃椽宕崟闈涘妧闂佺懓鍤栭幏锟�
				if(host_Team.getTeamLeaderId()!=role.getRoleID()){
					continue;
				}
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟瀹ュ浼犻柛鏇ㄥ墮濞咃綁姊婚崒姘簽闁搞劌鐖煎濠氭晲婢跺﹦顓洪梺鎸庣箓閹叉盯骞樺ǎ顑跨盎闂侀潧顦介崹杈╋拷姘炬嫹?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴椤ユ捇鏁撻崐鐕佹綈婵炲弶绻堥敐鐐村緞瀹�锟介惌澶愭煙閻戞ɑ顥栭柟椋庡厴閺佹劖鎯斿┑鍫濆毈婵＄偑鍊戦崕鑼崲閸岀偐锟芥棃宕橀鍢壯囨煕閳╁厾顏堝汲濡ゅ懏鈷戠紒瀣儥閸庢垿鏌涢悩铏暗闁告帗甯″顕�鏁撻悾宀�绱﹀ù鐘差儏瀹告繂鈹戦悩鎻掝仼妤犵偛鐗撳缁樻媴缁涘缍堥梺绋块绾绢厽绔熼弴銏╂晣闁炽儳顒查幏椋庯拷娑欘焽缁★拷闂佹眹鍨藉褎绂掑鍫熺厽婵°倧鎷烽柨鏇ㄤ簻閻ｇ柉銇愰幒鎴濈�銈嗘礀閹冲繒绱炴惔銏㈢瘈闂傚牊绋戦敓鑺ユ倐楠炲鏁撻悩鑼紱闂佸憡娲﹂崹閬嶆偂閺囥垺鐓欓柟瑙勫姇閽勫ジ鏌涜箛鎾存拱闁靛洤瀚伴弫鍌滄嫚閼碱兛妗撴繝娈垮枛閿曘儱顪冮挊澶屾殾妞ゆ劧绠戠粈瀣亜閹伴潧浜楃紒杈ㄧ箞濮婄粯鎷呯憴鍕哗闂佸憡鏌ㄩ澶婄暦閿熺姴绠柣锝呰嫰缁侊箓姊虹化鏇炲⒉妞ゎ厼娲幃鐤亹閹烘挾鍙嗛梺缁樻⒒缁垶藟婢跺浜滈柡鍥朵簽缁嬪鎮楅棃娑栧仮妤犵偞鐗犻、姗�鎮㈤崨濠勫建婵犵數濮烽弫鍛婄箾閿熻姤绻涙担鍐插悩濞戞ǚ鏋庨柟鍨暞閺呪晠姊洪幖鐐插姶闁告挻宀稿畷鎰版偨閸涘﹤浠┑鐐叉缁绘劙顢旈锔界厵闁芥ê顦弳娆愩亜椤忓嫬鏆ｇ�殿喖鐖奸獮瀣倷閸欏鐣奸梻鍌欑閹碱偊骞婇幘鏂ユ灃婵炴垯鍩勯弫鍥煕韫囨洖甯剁紒鍓佸仜閳规垿鎮╅幓鎺撴缂備椒绀侀悥鐓庮潖缂佹鐟归柨鐔绘椤洩顦堕柛锝呯秺濮婃椽宕ㄦ繝鍐槱闂佸憡顭堝Λ鍕煝閹捐绠瑰ù锝呭帨閹峰姊虹粙鎸庢拱闁煎綊绠栭弫鎾绘嚍閵夛箑锟芥劗锟借娲﹂崹杈╋拷闈涖偢瀵爼骞嬮悩闈涚倞闂佽楠哥粻宥夊磿閸楃伝娲晝閸岋妇绋忛梺鍝勬储閸ㄦ椽鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�
				Team selfTeam = TeamManager.selectTeamByRoleId(hostid);
				if(selfTeam!=null){
					if(host_Team.getTeamId()==selfTeam.getTeamId()){
						continue;
					}
				}
				if(fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
					continue;
				}
				rolelistid.add(role.getRoleID());
				num++;
			}else if(modeltype==QCmodelType.WATCH_FIGHT){
				watchFightView(role,watchfight);
				num=watchfight.size();
			}else if(modeltype==QCmodelType.ONE_FIGHT){
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛楠炪垺淇婇悙瀛樼婵＄偘绮欓悰顔撅拷锝庝憾閻斿棙銇勯幋顓炲閻庢凹鍓涘▎銏ゆ倷閻戞鍘甸梻渚囧弿缁犳垿鐛Δ浣虹闁告侗鍠氭晶鐢告煙椤旂瓔娈滈柟顖氬�垮畷銊︾節閸屻倓绱﹂梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鏌ユ煟閹邦喖鍔嬮柛瀣ф櫊閺屾稑鈹戦崱妤婁槐闂佺尨鎷峰ù鐘差儐閻撶喐淇婇婊冨妺闁崇粯娲熼弻锝夊箳濡ゅ啰鏆梺鍝勬湰缁嬫帞鎹㈠┑瀣闁绘劦鍓涢弳顓㈡⒒娴ｅ憡鍟為悽顖涱殘閺侇噣骞掑Δ濠冩櫍闂佺绻掗崢褏娆㈤悙鐑樺�甸柨娑樺船鐎氼剟鎯佽濮婂宕掑▎鎺戝帯缂備緡鍣崹鎷岀亱闂佸憡鍔﹂崰鏍磼閳哄懎绾ч柛顐ｇ濞呮棃鏌熷畡鏉挎Щ妞ゎ偅绻堥、姗�鎮╅幓鎺斿摋闂傚倷绀侀幖顐﹀嫉椤掑嫭鍎庢い鏍仜閺嬩線鏌涘畝锟介崑娑欏閻樼粯鐓曢柡鍥ュ妼娴滀粙鏌ｆ惔銏″唉婵﹦绮幏鍛矙濞嗙偓顥戦梻浣虹帛閹告悂鎮ч幘宕囨殾婵犲﹤鐗婇崑鍕攽閸屾凹妲告繛鍫涘妼椤啴濡堕崱妤呭殝闂佸綊顥撻崗姗�骞楅崼鏇炲唨妞ゆ挾鍠撻崢閬嶆⒑绾懎鐒介柛鏂跨Т閳诲秹宕堕浣哄幐闂佺硶鍓濋悷銉╁煝閸喐鍙忓┑鐘叉噺椤忕姷绱掓潏銊ョ瑨閾伙絽銆掑鐓庣仭妞ゃ儻绻濆缁樻媴閸涘﹥鍎撻梺鐟板暱缁绘﹢骞嗛崟顖ｆ晬闁绘劦浜烽幏閿嬫媴缁洘鐎婚梺瑙勫劤閻°劌鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
				if(host_Team != null){
					continue;
				}
				if(fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
					continue;
				}
				rolelistid.add(role.getRoleID());
				num++;
			}
			if(num>=MAX_NUM){
				break;
			}
		}	
		SceneClient.pSend(new MCheckCanPlayPKView(hostid, modeltype, school, levelindex, rolelistid, watchfight));
	}
	
	/**
	 * 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晢闁稿本鐟фす鎶芥⒒娴ｅ憡鎲稿┑顔芥綑铻炴繝闈涱儏閽冪喐绻涢幋鐐电叝婵炲矈浜弻娑㈠箻濡ゅ瀚瑰┑鈩冨絻閻楁挸顫忛搹瑙勫珰闁肩⒈鍓涢澶愭⒑閻戔晜娅撻柛銊ㄦ硾椤曪絾绻濆顓熸珳婵犮垼娉涜癌闁冲搫鎳忛悡蹇擃熆鐠鸿櫣澧曢柛鏃�娼欓湁缁绢參鏀辩�氬綊姊婚崒娆戝妽闁活亜缍婂畷娲礋椤栨艾鐎梻鍌氱墛缁嬪牓寮稿澶嬬叆婵犻潧妫Σ褰掓煛閸涱喗鍊愰柡宀嬬節瀹曟帒螣閻氬瓨瀚归柡宥庡亾閹峰嘲顫濋悙顒�顏�?
	 * @param role
	 * @param watchfight
	 */
	private  void watchFightView(Role role,HashMap<Long, Long> watchfight){
		//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傛寧鍤囨慨濠冩そ濡啫鈽夊顒夋毇闂備胶鎳撻崯鍧椝囬棃娑卞殨濠电姵纰嶉弲婵嬫煕鐏炲墽銆掗柛妯绘崌濮婅櫣锟藉湱濮甸妴鍐磼閿熻姤绗熼敓钘夘嚕閹惰姤鍊烽柣銏㈡暩閿涙粓姊虹紒妯忣亪宕崹顔氬綊顢氶敓浠嬪蓟閿涘嫪娌柛鎾楀嫬鍨遍梻浣芥〃缁�渚�宕愰崹顔炬殾妞ゆ劧绠戠粈瀣亜閹伴潧浜為柨鐔诲Г閹稿啿顫忕紒妯诲缂佸顑欏Λ宀勬⒑缂佹ɑ灏柣妤佹尭閻ｅ嘲顭ㄩ崼鐔蜂簻婵犻潧鍊搁ˇ顖氣枔閵娿儺娓婚柕鍫濇闁叉粓鏌熸搴″幋闁硅棄鐖煎浠嬵敇閻斿搫骞堥梻浣侯攰閸╁洭宕濆鍛瀺闁搞儺鍓氶悡娑㈡煕閳╁啰鎳冮柍璇茬墛閹便劍绻濋崨顕呬哗缂備浇椴哥敮鎺曠亽婵炴挻鍑归崹閬嵥夐敓鐘斥拻濞达絽鎲￠幆鍫ユ煙閸愯尙绠婚柟顖氬椤㈡盯鎮欓搴㈠濞达絿纭堕弸搴ㄦ煙閹呮憼婵炲懌鍨藉铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷
		//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚埄鍐ㄧ窞閻庯綆浜為崢鎰版⒑閼测晛顣奸悗绗涘洤桅闁告洦鍠氶悿锟介梺瑙勫礃濞夋盯銆傞搹鍦＝濞达絽鎼鎾剁磼閼碱剙浜剧紒宀冮哺缁绘繈宕堕懜鍨珫婵犵數濮撮敃銈夊箠鎼达絿绠旈柨鐔哄У閳锋垿鎮归崶顏勭毢缂佺姵澹嗙槐鎺撳緞鐎ｎ偄鍞夐梺绯曟杺閸庢彃顕ラ崟顖氱疀妞ゆ挾鍠愰鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?
		if(!fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
			return;
		}
		//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换娑㈠箣閻愨晜锛堝┑鐐叉▕娴滄繈寮插┑瀣厱閻忕偟鍋撻惃鎴炪亜閺傛寧鍤囨慨濠冩そ濡啫鈽夊顒夋毇婵＄偑鍊х�靛矂宕瑰畷鍥у灊濠电姵鑹剧粈鍐拷鐟板閸犳岸宕悽鍛婄厽闁绘鍎ら妴鍐偣閿熶粙鏁冮敓钘夊祫濠电偛妯婃禍婵嬫偂閻斿吋鐓熼柡鍌涘閹插摜绱掗悩闈涗槐闁哄备锟藉磭鏆嗛悗锝庡墰閻﹀牓鎮楃憴鍕闁哥姵鐗曡灋闁告劑鍔夊Σ鍫熸叏濮楀棗浜濋柛鈺傜洴濮婄粯鎷呯粵瀣闂備礁搴滅徊浠嬧�﹂崶顏嶆▌闂佽鍨伴惌鍌氱暦閹烘埈娼╅柣鎾冲椤撴寧淇婇悙顏勶拷鏍暜閹烘棑鎷峰鐓庡⒋妤犵偞鍨块幊婊堟倷闁稓鐩庨梻浣筋潐瀹曟ê鈻斿☉銏犲嚑闁哄啫鐗婇悡娑㈡煕閳藉棗骞楅悗姘炬嫹
		Long battleid = xtable.Roleid2battleid.select(role.getRoleID());
		if (battleid==null){//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块叄娴滄儼妫熷銈嗙墱閸嬬偤宕曞Δ浣风箚闁靛牆瀚板宄懊瑰鍕煉闁哄备锟芥剚鍚嬮柛鎰╁妼椤绱撴担鍝勑ｉ柟鐟版喘瀵鈽夊Ο婊呭枔缁辨帒螣閸濆嫭鏁梻鍌欑閹碱偊鎯屾径灞惧床婵犻潧妫涢弳锕傛煟閺傚灝鎮戞い銉ョ墛缁绘盯骞嬮悙鐢靛彎闂佸憡鐗楅悧鐘差潖缂佹ɑ濯村〒姘煎灣閸旂顪冮妶鍡楃仸闁搞劌婀卞Σ鎰版倷鐎涙ê顎撻梺鍛婄缚閸庢彃鈻撻幆褉鏀介柣鎰级椤ョ偤鏌熼崨濠冨�愮�规洩绲剧换婵嬪炊閳轰礁绲奸梻浣规偠閸庣敻藟閹惧墎鐭欓柤濮愬�楃壕鐣岋拷骞垮劚閹冲繘藟閵忊剝鍙忓┑鐘插暞閵囨繈鏌熼鎯у幋妤犵偛绉归、娆撴嚍閵夈儲鐏堟繝纰夌磿閸嬫垿宕愰妶澶婄煑闊洦绋戠粻顖炴煥閻曞倹瀚�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁嶉崟顓犵厯闂佸湱鍎ら幐楣冩偟閸洘鐓曢柍鈺佸暟閹冲懎鈽夐幘宕囆㈤柍瑙勫灴閹晛鐣烽崶鑸垫闂備胶绮幐璇裁洪悢鍏煎亗妞ゆ劧绠戦悙濠勬喐濠婂牆纾块煫鍥ㄧ♁閻撴洟鏌￠崒婵愬殭闁告梹绮撻弻鏇㈠炊瑜嶉顓熴亜閵忊剝绀嬪┑顕嗘嫹闂佺偨鍎村▍鏇㈡倶鎼搭澀绻嗛柕鍫濇搐鍟搁梺绋款儐閻╊垶銆侀弽顓炲窛闁规鍠曢懜顏堟⒒閸屾瑨鍏屾い顓炵墢閹广垹螖閸涱厾锛涢梺鍦濠㈡ê效閺屻儲鐓ラ柣鏇炲�圭�氾拷
			battleid = xtable.Watcherid2battleid.select(role.getRoleID());
		}
		if(battleid == null){
			return;
		}
		Integer battleType = xtable.Battle.selectBattletype(battleid);
		if(battleType == null || battleType != BattleType.BATTLE_PVP){
			return;
		}
		Map<Integer, xbean.Fighter> fighters = xtable.Battle.selectFighters(battleid);
		if(fighters == null) {
			return;
		}
		if(fighters.get(1)!=null&&fighters.get(1).getUniqueid()==role.getRoleID()){
			if(fighters.get(15)!=null&&fighters.get(15).getFightertype() == xbean.Fighter.FIGHTER_ROLE){
				watchfight.put(role.getRoleID(), fighters.get(15).getUniqueid());
			}
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730439;

	public int getType() {
		return 730439;
	}

	public long hostid;
	public int modeltype; // 模块类型
	public int school; // 删选的职业 -1表示全职业
	public int levelindex; // 删选的角色等级区间 0表示全选

	public GCheckCanPlayPKView() {
	}

	public GCheckCanPlayPKView(long _hostid_, int _modeltype_, int _school_, int _levelindex_) {
		this.hostid = _hostid_;
		this.modeltype = _modeltype_;
		this.school = _school_;
		this.levelindex = _levelindex_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(hostid);
		_os_.marshal(modeltype);
		_os_.marshal(school);
		_os_.marshal(levelindex);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		hostid = _os_.unmarshal_long();
		modeltype = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		levelindex = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCheckCanPlayPKView) {
			GCheckCanPlayPKView _o_ = (GCheckCanPlayPKView)_o1_;
			if (hostid != _o_.hostid) return false;
			if (modeltype != _o_.modeltype) return false;
			if (school != _o_.school) return false;
			if (levelindex != _o_.levelindex) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)hostid;
		_h_ += modeltype;
		_h_ += school;
		_h_ += levelindex;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(hostid).append(",");
		_sb_.append(modeltype).append(",");
		_sb_.append(school).append(",");
		_sb_.append(levelindex).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GCheckCanPlayPKView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(hostid - _o_.hostid);
		if (0 != _c_) return _c_;
		_c_ = modeltype - _o_.modeltype;
		if (0 != _c_) return _c_;
		_c_ = school - _o_.school;
		if (0 != _c_) return _c_;
		_c_ = levelindex - _o_.levelindex;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


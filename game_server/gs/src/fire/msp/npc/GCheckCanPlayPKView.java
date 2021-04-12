
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
	public static final int CQMAPID=1615;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴崨濠呯闂佺绨洪崐婵嗙暦闂堟侗娼╂い鎴犲仦濡炰粙銆侀弮鍫濈閹煎瓨蓱濞呭﹪鏌＄仦鐣屝ら柨鐔烘櫕椤ｄ粙鏁撻挊澶婃毐闁哄鍊栨穱濠囶敍閵堝棗顏舵繝寰锋澘锟芥鎱ㄩ悜钘夌；婵炴垶鈼ゅú顏嶆晣闁绘垵妫楀▓銊╂⒑閸撴彃浜濇繛鍙夌墱缁粯瀵奸弶鎴狀啇闁哄鐗嗘晶鐣屽閸ф鐓忛柛顐ｇ箘閸╋絾鎱ㄦ繝鍌ょ吋鐎规洘甯掗埢搴ㄥ箣椤撶啘婊堟⒒娴ｅ憡璐￠柍宄扮墦瀹曟垶绻濋崨顕呮（闂傚倷娴囬～澶愵敊閺嶎厼闂い鏍仜缁狀垰顪冪�ｎ亝鎹ｇ紒鐘虫⒐缁绘盯骞嬮悙鍡樺灴瀹曡櫕绂掔�ｎ偆鍘藉銈嗘尵閸庢劕螣閿熶粙姊洪崫鍕拱缂佸鐗犺棟闁惧浚鍋傜换鍡涙偣閸ュ洤瀚锟�
	public static Map<Integer,SLeitaiLevel> sLeitaiLevelmap=ConfigManager.getInstance().getConf(SLeitaiLevel.class);
	
	public static final int MAX_NUM=50;
	
	@Override
	protected void process() {
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬫繝娈垮櫙閹风兘姊洪弬銉︽珔闁哥喐濯介妵鎰版晲婢跺鎷绘繛杈剧到閹芥粎绮旈悜妯镐簻闁靛闄勫畷宀�锟借娲橀〃鍛达綖濠婂牊鏅稿ù鐘差儏缁犳牕霉閸忓吋鍎楅柡浣割儔閺屻劑鎮㈢紒姗嗘闂佷紮绲块弻澶愬Φ閹版澘绠虫繝闈涙处濞呮捇姊绘担鍛婂暈闁荤噦缍佸畷鏇㈠礃閸欏倹鐩、娑㈡倷缁瀚介梻浣侯焾閺堫剟鎮烽妸鈺佺鐎癸拷閿熶粙鎯�椤忓牜鏁囬柣鎰版涧閻撶喖鎮楀▓鍨灍鐟滄澘鍟撮垾锕傚Ω閳轰礁绐涘銈嗙墬缁酣宕㈤鐐粹拻濞达絿鐡斿鎰拷瑙勬礃閿氶柍缁樻煥閳藉濮�閻樿尙锟筋厼鈹戦悩缁樻锭妞ゆ垵妫濋幃锟犲礃椤旂晫鍘卞┑鐘绘涧濡顢旈鍕ㄦ斀妞ゆ牗鍝庨崑銏ゆ煛鐏炵澧查柟宄版嚇瀹曨偊濡烽幇鍓佺М闁哄瞼鍠愮粭鐔煎垂椤旂⒈鐎虫俊鐐�ら崑鍛垝閹惧磭鏆﹂柛妤冨�ｉ弮鍫熸櫢濞寸姴顑戠紞鏍ㄣ亜閹板爼妾柛濠勬暬閺岋綀顦查柟璇х磿閿熻姤姘ㄩ幊鎾诲煘閹达附鍊烽柡澶嬪灩娴犙囨⒑閹肩偛濡芥俊鐐扮矙瀹曞搫鈽夐姀鐘殿唺闂佺懓鐡ㄩ悷閬嶅箯閻戣棄绠抽柟鎼幗閸嶉潧顪冮妶鍡楃瑐闁绘帪绠撻獮鍐ㄢ枎閹邦喚顔曢柣搴㈢♁椤洭鎯岀�ｎ偁浜滈柕濞垮劵闊剛锟芥鍠栭…閿嬩繆閸洖鐐婇梺鍨儏椤忓爼姊洪棃鈺佺槣闁告ê鍚嬮悧搴ｇ磽娴ｉ缚妾搁柛娆忓暟缁寮介鐐舵憰閻庡箍鍎卞ú銊у閸忛棿绻嗘い鏍ㄧ箥閸ゆ瑧鐥幆褍鏆遍摶鏍煟濮楋拷濞佳勭濠婂嫨浜滈柟瀛樼箥濡拷閻庢鍣崑濠傜暦閹烘埈鐓ラ柛鏇ㄥ亝閻庮參姊绘担鐟邦嚋缂佽鍊歌灋婵°倕鎷嬮弫鍌涚箾瀹割喕绨奸柍閿嬪浮閺屾稓浠﹂崜褎鍣紓浣瑰姈濮婂湱鎹㈠☉娆愬闁告劕寮剁粈宀勬煥閻斿憡鐏紒鐘虫崌閵嗕礁顫滈敓鑺ユ叏閿熶粙鏌嶉幘鍛闂佸湱顭堥崯鏉戭潖濞差亜宸濆┑鐘插暙椤︹晠姊洪幖鐐插濞存粏娉涢悾鐑藉箛椤撶姷鐦堝┑顔斤供閸橀箖宕ｉ崱娑欌拺闁告繂瀚婵嬫煕鐎ｎ偆娲撮柡浣规崌閹稿﹥寰勫畝锟芥闂備浇顕栭崳顖滄崲濠靛棭鍤曢柟缁㈠枟閸嬪嫰鏌ц箛鎾磋础婵℃彃娲ら埞鎴︽偐閸偅姣勬繝娈垮枟閹稿啿鐣烽幇鏉跨濞达絽鎲℃潏鍫ユ⒑缂佹ɑ鐓ラ柛姘儔閹繝鎮㈤懖鈺佸絼闂佹悶鍎崝搴ㄥ煟閵夆晜鐓欓柡灞诲劤閻ｆ椽鏌＄仦闈╂嫹瀹曞洦娈曢柣搴秵閸撴稖鈪甸梻鍌欒兌绾爼寮插☉姘炬嫹濮橆厽绶查柣锝呭槻椤粓鏁撻懞銉ょ箚婵繂鐭堝Σ娲⒑鐠団�虫珯缂傚秳绀侀～蹇曠磼濡顎撻梺闈╁瘜閸樹粙鎳ｉ崶顒佲拺缂佸瀵ч幑锝夋煕鎼存稑锟芥鍒掔�ｎ亶鍚嬪璺侯儐濞呮粍绻濋姀銏☆仧缂佺姵鍨电叅妞ゆ挾鍋熼弳锕傛煥閻斿搫校闁稿﹤鐖奸弻銈嗘叏閹邦剨鎷烽弽顓炲惞闁跨喕妫勯—鍐Χ鎼粹�崇闂佸憡姊归崹鐢告偩閻戣姤鍋勭痪鎷岄哺閺呮繈姊洪幐搴ｇ畵闁绘绻愰‖濠囧Ω閳哄倵鎷洪柣鐘叉搐瀵爼宕径瀣ㄤ簻妞ゆ劑鍩勫Σ鎼佹偂閵堝鐓冮柛婵嗗閺嗘瑧绱掗煬鎻掞拷婵嬪蓟濞戙垹绠绘俊銈忔嫹閻庢凹鍓氶幆鏃�绻濋崒妤佹杸闂佺粯顭囩划顖氣槈瑜庨妵鍕箣濠靛洤娅х紓渚囧枛閻楁挸鐣烽幒妤佸�烽悗鐢殿焾鐢姊绘笟锟藉褔藝椤撱垹绀夌�癸拷閸曨剙鍓梺鎯х箰濠�杈╁婵傚憡鐓欓梺顓ㄧ畱楠炴鏌嶉柨瀣诞闁哄被鍔戦幃銏ゅ礄閵堝棗顏堕梺缁樻磻閻掞妇绱為崼婵冩斀闁绘劖褰冪痪褏绱掗鑺ュ磳闁搞劑绠栭弫鍐磼濮樿泛鏁归梻浣瑰缁诲倸煤閿濆洩濮抽梺鍨儑缁★拷闂佹眹鍨藉褎绂掗埡鍛厵婵炶尪顔婄花鐣岀磼鏉堚晛浠遍柡浣规崌閹崇偤濡烽敐鍕泿婵＄偑鍊栭崝鎴﹀春閸曨倠鐔兼晸閽樺娓婚柕鍫濆暙閻忣亪鏌ｉ悢鏉戝姦妞ゃ垺锕㈠畷妤呮偂鎼达絿鐛梺璇插嚱閹儵宕熼顐＄椽缂傚倸鍊搁崐鐑芥嚄閸洘鎯為幖娣妼閸屻劌鈹戦崒婊庣劸缂佺媭鍨堕幃妤呮晲鎼粹剝鐏堥梺鍛婅壘缂嶅﹪寮诲☉銏犵疀闂傚牊绋掗悘宥夋⒑缂佹ɑ灏版繛鑼枛瀵鏁愰崨鍌滃枔閹风娀骞撻幒婵囨祰濠电姷鏁搁崑娑㈡偋婵犲伣娑㈠礃閵娧勬闂佽法鍠撴慨鐢告倿閼测晪鎷烽獮鍨姎婵☆偅鐩畷銏ゆ偨閸涘ň鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愭い銏″哺椤㈡﹢鍩楅崫鍕枠闁轰礁鍟村畷鎺戔槈濡湱鏁惧┑鐘垫暩閸嬫稑螞濞嗘挻鍋＄憸鏃堝箖妤ｅ啯鍋ㄩ柛娑橈功閸樻悂鏌ｈ箛鏇炰哗妞ゆ泦鍕弿闁稿本绮ｉ幏宄扳枔閸喗鐝梺闈╃秶缁蹭粙鎮鹃悜钘夌闁规惌鍘鹃崣鍡涙⒑閸涘﹥澶勯柛鎾寸懇瀵煡鎮介崨濞炬嫽闂佺鏈悷褔藝閿曞倹鐓欐繛鏉戭儜閹峰嘲顭块崟顒傛创妤犵偛顑夐弫鍐晸閻ｅ瞼涓嶆い鏍ㄥ嚬濞撳鎮楅敐搴濈凹闁圭櫢绲块惀顏堝箲閹邦収妫勯梻鍥ь樀閺屻劌鈹戦崱娆忊拡濠电偛鍚嬮崝娆撳箖濡わ拷椤繈顢橀悢渚Ч闂備礁鎼惉濂稿窗閺嵮呮殾婵炲棙鎸稿洿闂佺硶鍓濋〃蹇斿閿燂拷?
		if(modeltype!=QCmodelType.ONE_FIGHT&&modeltype!=QCmodelType.TEAM_FIGHT&&modeltype!=QCmodelType.WATCH_FIGHT){
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴崨濠呯闂佺绨洪崐婵嗙暦闂堟侗娼╂い鎴犲仦濡炰粙銆侀弮鍫濈閹煎瓨蓱濞呭﹪鏌＄仦鐣屝ら柨鐔烘櫕椤ｄ粙鏁撻挊澶婃毐闁哄鍊栨穱濠囶敍閵堝棗顏舵繝寰锋澘锟芥鎱ㄩ悜钘夌；婵炴垶鈼ゅú顏嶆晣闁逞屽墾閹烽攱绗熼敓钘夘嚕娴犲鏁囬柣鎰版涧楠炴劙姊绘担鍛婂暈闁告梹鍨垮畷婵嗩吋婢跺锟藉爼鏌涢鐘插姕闁抽攱鍨块弻鐔兼嚃閳轰椒绮舵繝娈垮枛閸婅崵妲愰幒妤佸亹鐎规洖娲ら埛灞轿旈悩闈涗沪闁绘鍋ゆ俊鐢稿箛閺夎法顔婂┑鐘绘涧濞诧箑鈻嶉崶銊ょ箚闁绘劦浜滈敓濮愬�濆畷鎴﹀箳濡わ拷閸屻劑鏌﹀Ο鐚寸礆闁绘柨鎽滅弧锟介梺鎼炲劘閸斿骞忔繝姘拺缂佸瀵у﹢浼存煟閻曞倸顩紒顔硷躬閹囧醇濠婂懐鐣炬繝纰夌磿閸嬬喖宕㈣閹便劑宕掗悙瀵稿幍闂佹儳娴氶崑鎺戔枔濠婂牊鐓欓柧蹇ｅ亞閻帞锟借娲栫紞濠囥�侀弴銏℃櫜闁搞儜鍐ｆ瀼濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬湱鎲搁弮鍫㈠祦闊洦绋掗崐濠氭煠閹帒鍔ら柛妯圭矙濮婃椽骞愭惔锝囩暤闂佺娅曢崝鏍矉閹烘垟妲堟慨妯夸含閿涙粌鈹戞幊閸婃洟宕锕�鍑犳繛鎴欏灪閻撴稑霉閿濆牜娼愰悘蹇斿缁辨帡宕掑☉妯碱儌闂佽法鍠愰弸鑽ょ礊閸℃顩查柨婵嗩槸缁犳椽鏌￠崶銉ョ仾闁抽攱鍨垮濠氬醇閻斿墎绻侀梺缁樺浮缁犳牠寮诲☉娆愬劅妞ゆ柨鍚嬮悵婵嬫倵濞堝灝鏋涢柟璇х節楠炲棝寮崼婢晠鏌ㄩ弮锟介崕鎶界嵁瀹ュ鈷掑ù锝堟鐢盯鏌涢妸銉у煟闁炽儻绠撳畷鍫曞煛閸愌呯憹闂備浇顫夐崕鎶筋敋椤撶姷涓嶅Δ锝呭暞閻撴洘銇勯幇鍓佹偧妞わ絽寮剁换娑㈠川椤撱劍鏁鹃梺閫涚┒閸斿秶鎹㈠┑瀣闁崇懓銇橀搹搴繆閵堝洤啸闁稿鍋ゅ畷婵嬪冀椤撶偟鐣鹃梺鍝勫暙閻楀﹪寮查弻銉︾厱閻忕偛褰炵欢杈ㄧ箾閸忓吋顥堟慨濠傤煼瀹曟帒鈻庨幋顓熜滈梻浣告贡閳峰牓宕戞繝鍥х畺鐟滃秹鈥﹂妸鈺侀唶婵犻潧鐗滃Σ鑸电節閻㈤潧鈻堟繛浣冲浂鏁勯柛娑樼摠閸嬵亝銇勯弬娆炬綗濞存粍绮撻弻鈥愁吋鎼粹�茬盎婵炲濯寸粻鎾诲蓟瀹ュ鐓ラ悗锝庝簽娴犺偐绱撴担浠嬪摵閻㈩垱顨呴銉╁礋椤掑倻鐦堥梺鍛婂姉閸嬫捇藟閿濆鈷戦悹鍥ㄥ絻椤掋垽鏌よぐ鎺旂暫鐎规洘鐓″濠氬Ψ閵壯冨箳闂備礁婀遍崑鎾诲礈濮樿埖鍋傞柕澶嗘櫆閻撴洘銇勯幇鈺侊拷鏇㈠几閺冨牊鐓曟俊顖滃劋閸熺偟绱掔紒妯尖檨婵炵厧绻樺畷婊嗩槾鐞氾附绻濋悽闈涗户闁告鍥ｏ拷锕�鐣￠幍顔芥濠电娀娼ч鍡涘磻閸曨垱鐓曢煫鍥ㄨ壘娴滃綊鏌涘Ο鍏兼毈婵﹥妞藉畷銊︾節閸屾粈鎴烽梻浣侯焾閿曘儵鎮у鍫熸櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�?");
			return ;
		}
		
		if(sLeitaiLevelmap==null){
			logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴崨濠呯闂佺绨洪崐婵嗙暦闂堟侗娼╂い鎴犲仦濡炰粙銆侀弮鍫濈閹煎瓨蓱濞呭﹪鏌＄仦鐣屝ら柨鐔烘櫕椤ｄ粙鏁撻挊澶婃毐闁哄鍊栨穱濠囶敍閵堝棗顏舵繝寰锋澘锟芥鎱ㄩ悜钘夌；婵炴垶鈼ゅú顏嶆晣闁逞屽墾閹烽攱绗熼敓钘夘嚕娴犲鏁囬柣鎰版涧楠炴劙姊绘担鍛婂暈闁告梹鍨垮畷婵嗩吋婢跺锟藉爼鏌涢鐘插姕闁抽攱鍨块弻鐔兼嚃閳轰椒绮舵繝娈垮枛閸婅崵妲愰幒妤佸亹鐎规洖娲ら埛灞轿旈悩闈涗沪闁绘鍋ゆ俊鐢稿箛閺夎法顔婂┑鐘绘涧濞诧箑鈻嶉崶銊ょ箚闁绘劦浜滈敓濮愬�濆畷鎴﹀箳濡わ拷閸屻劑鏌﹀Ο鐚寸礆闁绘柨鎽滅弧锟介梺鎼炲劘閸斿骞忔繝姘拺缂佸瀵у﹢浼存煟閻曞倸顩紒顔硷躬閹囧醇濠婂懐鐣炬繝纰夌磿閸嬬喖宕㈣閹便劑宕掗悙瀵稿幍闂佹儳娴氶崑鎺戔枔濠婂牊鐓欓柧蹇ｅ亞閻帞锟借娲栫紞濠囥�侀弴銏℃櫜闁搞儜鍐ｆ瀼濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬湱鎲搁弮鍫㈠祦闊洦绋掗崐濠氭煠閹帒鍔ら柛妯圭矙濮婃椽骞愭惔锝囩暤闂佺娅曢崝鏍矉閹烘垟妲堟慨妯夸含閿涙粌鈹戞幊閸婃洟宕锕�鍑犳繛鎴欏灪閻撴稑霉閿濆牜娼愰悘蹇斿缁辨帡宕掑☉妯碱儌闂佽法鍠愰弸鑽ょ礊閸℃顩查柨婵嗩槸缁犳椽鏌￠崶銉ョ仾闁抽攱鍨垮濠氬醇閻斿墎绻侀梺缁樺浮缁犳牠寮诲☉娆愬劅妞ゆ柨鍚嬮悵婵嬫倵濞堝灝鏋涢柟璇х節楠炲棝寮崼婢晠鏌ㄩ弮锟介崕鎶界嵁瀹ュ鈷掑ù锝堟鐢盯鏌涢妸銉у煟闁炽儻绠撳畷鍫曞煛閸愌呯憹闂備浇顫夐崕鎶筋敋椤撶姷涓嶅Δ锝呭暞閻撴洘銇勯幇鍓佹偧妞わ絽寮剁换娑㈠川椤撱劍鏁鹃梺閫涚┒閸斿秶鎹㈠┑瀣闁崇懓銇橀搹搴繆閵堝洤啸闁稿鍋ゅ畷婵嬪冀椤撶偟鐣鹃梺鍝勫暙閻楀﹪寮查弻銉︾厱閻忕偛褰炵欢杈ㄧ箾閸忓吋顥堟慨濠傤煼瀹曟帒鈻庨幋顓熜滈梻浣告贡閳峰牓宕戞繝鍥х畺鐟滃秹鈥﹂妸鈺侀唶婵犻潧鐗滃Σ鍫曟⒒娴ｈ櫣甯涙俊顐＄窔瀹曟垿骞囬鍌涙婵炴挻鐔幏鐑芥煛鐏為潻鎷烽幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劙姊虹拠鈥崇仯闁哥姵鐗曢～蹇涙惞閻у憡瀚归柛锔诲幖鏍￠梺闈涙閸熸挳寮婚妶澶婄闁肩⒈鍓欓悡鐔兼⒑鐠団�虫珯缂佺粯绻堥悰顔撅拷锝庡枟閺呮粓鎮峰▎娆戠ɑ閻庢艾銈稿娲嚒閵堝懏鐎鹃梺鑽ゅ枂閸庢娊鏁撻懞銉︾殤闁稿繑锚閻ｇ兘顢涘┑鍫㈡澑濠电偞鍨堕悷褔宕㈤柆宥嗏拺缂備焦鈼ら鍫濈柈闁秆勵殔娴肩娀鏌ｉ幋鐑囦緵婵炲牅绮欓弻锝夊箛椤掑娈舵繝鈷�鍛毈闁哄瞼鍠栭幖褰掝敃閵堝應鎷伴梻浣虹《閺咁亞鎹㈠┑鍡欐殾婵鎷锋い銏℃⒐閹棃鏁愰崨顖氭惛闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐沪闁稿绻濋弻銊╁即閻愯鎷疯ぐ鎺戠；闁跨喓濮甸悡蹇擃熆鐠鸿櫣澧曢柛鎿冨幗缁绘稑顔忛鑽ょ泿闁搞儲鎸冲娲箹閻愭彃濮岄梺鍛婃煥缁夋挳鍩㈤幘鏉戭嚤閻庢稒锚閿熺晫鏁婚幃宄扳枎韫囨搩浠剧紓渚婃嫹闁跨喕妫勯埞鎴︽倷閼碱剚鍕鹃梺鍛婃煥鐎涒晝绮╅悢鐓庡嵆闁绘柧璀﹀ù鍕煟鎼搭垳绉甸柛瀣瀹曘垽鏌嗗鍡忔嫼閻熸粎澧楃敮鎺撶娴煎瓨鐓曟俊顖涗航閸嬨垻锟借娲樼换鍫熶繆閼搁潧绶為悗锝庡墮楠炴劙姊虹拠鎻掑毐缂佽尪濮ら弲鑸垫償閵婏箑浠奸梺姹囧灩閹诧繝鎮″☉銏″�堕柣鎰版涧娴滃墽绱掗敓鐣岋拷锝庡墾閹烽鎲撮崟顒傤槹婵炲瓨绮岄悥濂稿Υ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴濮�閿涘嫰妾繝銏ｆ硾椤﹁鲸寰勯敓锟�");
			return ;
		}
		int levelmin=0;
		int levelmax=1000;
		SLeitaiLevel sLeitaiLevel = sLeitaiLevelmap.get(levelindex);
		if(sLeitaiLevel!=null){
			levelmin=sLeitaiLevel.getLevelmin();
			levelmax=sLeitaiLevel.getLevelmax();
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤顨婂畷鐗堢節閸パ咁攨闂佺粯鍔曞Ο濠傤焽閼恒儰绻嗛柣鎰典簻閿熻姤鐗犲畷婵嬪箳閺傚灝鐏婂┑鐐叉濞存岸宕甸弴銏＄厱妞ゆ劧绲剧粈锟介梻浣稿船濞诧箓濡甸崟顖氱疀闁割煈鍋嗙粣鏃傜磽娴ｉ潧濡奸柣掳鍔庨幑銏犫槈濮樼偓瀚规繛鎴炵懐閻掍粙鏌ｉ鐑囧姛缂佽鲸鎸搁濂稿椽閸愵厼鎯堥柣搴㈩問閸犳牠鈥﹂悜钘夌畺闁靛繈鍊栭崑鍌炲箹鏉堝墽鎮奸柡鍡曞嵆閺岋綁鎮㈤崫銉х厐缂備礁顦遍幊鎾活敋閿濆鎯炴い鎰剁悼缁夊爼姊洪棃娑辩叚缂佽尪鍋愰懞杈ㄧ節濮橆厸鎷洪梻鍌氱墛缁嬫挻鏅堕弴銏＄厵闁告劘灏欑粻鑽わ拷瑙勬礈閺佽鐣烽崼鏇ㄦ晢濞达絽鎼獮鎰版⒑鐠囪尙绠抽柛瀣♁閺呭爼鎸婃竟婵囨そ楠炴﹢顢欓悾灞藉箰濠电偠鎻徊鍧椻�﹂崼銉︽櫢闁芥ê顦伴崑銉╂煟濞戝崬娅嶇�规洖宕～婵嬪礂婢跺厜鏅涢埞鎴︽偐濞堟寧姣岄梺璺ㄥ枎閿熺晫鍠愰悵顏堟煙椤栨氨澧﹂柡灞界Ф閹叉挳宕熼銈勭礉闂備浇顕栭崰妤呮偡閳轰胶鏆﹂柨婵嗘缁剁偛鈹戦悩鎻掓灓濞寸媭鍙冨濠氬磼濞嗘劗銈伴悗瑙勬礈閺佽鐣烽鐐查敜婵°倧鎷烽柣銈囧亾缁绘盯骞嬪▎蹇曞姶闂佽桨绀侀澶愬蓟閵娿儮鏀介柛鈩冿供濡偛顪冮妶鍡樼濞存粌鐖煎濠氭偄閸濆嫭鐎抽梺鍛婎殘閸嬫稓绮诲ú顏呪拺闁告繂瀚刊濂告煕閹惧鎳囬柛鈺冨仱楠炲鏁傞挊澶涙嫹閻戣姤鐓涘璺侯儏閻忊晛霉閻樿櫕鍊愭慨濠冩そ楠炴劖鎯旈姀顫穿闂備礁鎼幊鎰叏閹绢噮鏁嬮柨婵嗩槸缁狀噣鏌ら幁鎺戝姕婵炲懌鍨藉铏圭磼濡洘鍨垮鍛婄附缁嬭法顔嗗┑鐐叉▕娴滄繈鍩涢幋锔界厱婵炴垶锕崝鐔虹磼閻樿櫕宕岄柟顔筋殔椤繈鎮℃惔銏憾闂備礁鎼幊搴ㄦ偉閻撳寒鍤曢柟缁㈠枟閸嬪嫮绱撻崼銏犘ラ柣鈺侀叄濮婄粯鎷呴悷閭﹀殝濠电偛寮堕崹鐢糕�旈崘顔肩婵°倧鎷烽悷娆欓檮閵囧嫰骞囬崼鏇燁�嶉梺缁樻尰缁嬫垿濡撮幒鎴僵妞ゆ帊鐒﹂幃娆忊攽閻愬弶鍣圭紒澶婄秺瀵鎮㈤崗鐓庝簵闁硅壈鎻徊鎸庮殭闂傚倷娴囬鏍垂娴兼潙纾归柛顭戝枤閺嗭箓鏌曟繝蹇擃洭缂佲槄鎷烽梻浣侯焾鐞氼偊宕愰幘鑸殿潟闁挎柨澧界壕浠嬫煕鐏炲墽鎳嗛柛蹇撶焸閺屟嗙疀閹捐寮伴悗瑙勬磸閸ㄨ櫣缂撻悾宀�鐭欓悹渚厛閸炵敻姊虹拠鎻掑毐缂傚秴妫濆畷浼村冀椤撶喎浠惧銈嗘穿閹风兘鏌＄仦鍓ф创濠碉紕鍏樻慨锟介柍鈺佸暟瑜板洨绱撴担鍝勪壕闁稿孩濞婃俊鍓佺矙濞嗘儳娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊х闁瑰浼濋鍫氾拷鏍拷锝庡墰绾捐棄霉閿濆懏鎯堥崯鎼佹⒑缁嬫鍎嶉柛濠冪箓椤曪絾绻濆顓熸珳闂佸憡渚楁禍婵嬶綖瀹ュ鈷戦柛娑橆煬濞堟﹢鏌涚�ｎ剙浠遍柟顕�娼ч埞鎴狅拷锝庡亜閿熻棄鐏氱换娑㈠醇濠靛牅铏庨梺鍝勵儍閸婃繈寮婚埄鍐╁闁告捁灏欓崥瀣旈悩闈涗粶闁哥噥鍨崇划瀣箳閺冩挻瀚归柨婵嗛娴滄粌霉閻樿櫕銇濇慨濠冩そ瀹曟粓鎳犻锟界敮銉╂⒑缁嬫鍎忛悗姘煎墴閸┿垹顓兼径濠庢綂闂侀潧鐗嗗Λ宀勫箯婵犳碍鈷戠紒瀣濠�浼存煟閻旀繂娉氶崶顒佹櫇闁稿本绋撻崢鐢电磼閻愵剚绶茬�规洦鍓氱粋宥夋倷閻戞鍙嗛梺缁樻椤曆嗩暱婵犳鍠楄彠闁告梹鍨甸悾宄拔旈敓鍊熺亽闂佹儳绻楅～澶娾枔妤ｅ啯鍋℃繝濠傛噹椤ｅジ鎮介娑樼闁汇儺浜ｉˇ褰掓煛鐏炲墽娲寸�殿喖顭烽、妯侯煥閸愭寧瀚圭憸鏃堢嵁韫囨稒鍊婚柦妯侯槺椤斿洭鏌熼悡搴ｆ憼缂佸鍔楅懞杈ㄧ節濮橆収妫呭銈嗗姂閸ㄧ儤寰勯崟顖涚厵闁告縿鍎辨禍楣冩煛閸涱厾鍩ｇ�殿喗鎸抽幃鈺呮偨绾板搴婇梻鍌欒兌缁垶鏁嬮梺娲讳簷閸楀啿鐣烽幋锕�顫呴柕鍫濇閸樻悂鏌ｈ箛鏇炰粶濠⒀傜矙婵℃挳骞掗幊銊ョ秺閹亪宕ㄩ婊勬婵°倗濮烽崑鐐哄垂閸ф宓侀柛銉墻閺佸棗顭跨捄渚剾婵☆偁鍔戝濠氬磼濮橆剨鎷烽幖浣哥９闁绘垼濮ら崐鍧楁煥閺囶亝瀚瑰銈庡幖閻忔繆鐏掗梺鎯х箺椤鈻撻幆褜娓婚柕鍫濇缁楁帡鎮楀鐓庡⒋闁诡噯绻濋崹楣冨箛娴ｅ搫鏁搁梻浣稿悑閹倸顭囪閹便劑宕堕埡鍐紲闂佺粯锚閹碱偊宕ラ崷顓犵＜閺夊牄鍔岀粭鎺楁煃閽樺妲告い顐ｇ箞椤㈡﹢鎮欑�靛憡娈┑鐘垫暩婵敻顢欓弽顓炵獥婵°倕鍟伴惌娆撴煙鏉堝墽鐣遍柣鎾达耿閺岀喐娼忔ィ鍐╊�嶉梺绋匡功閸忔﹢寮婚妶鍥ф瀳闁告鍋涢～鈺呮⒑閸愭彃妲婚柨鏇ㄤ簻椤繐煤椤忓懎浠梺鍝勵槹鐎笛囶敊閿熶粙姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷
		LinkedList<Long> rolelistid=new LinkedList<Long>();//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚归柛顐ｆ礃閺呮悂鏌﹀Ο渚Ц闁哄棴绲鹃〃銉╂倷閸欏鏋犲銈冨灪閻熲晛鐣烽敐澶娢ㄧ憸蹇涘箟瑜版帗鈷掗柛灞剧懆閸忓本銇勯姀鐙呰含妤犵偞鎹囬、鏃堝幢濞嗗海鐟濋梻浣烘嚀椤曨厽鎱ㄩ柨瀣枖鐎广儱顦伴悡娑氾拷骞垮劚妤犳悂鐛弽顐ょ＜闁绘ü璀﹀鎰磼缂佹娲撮柡浣瑰姈閹棃鍨鹃幇浣逛氦婵犵數濮撮惀澶愬Χ閸涱剚鐫忕紓鍌欐祰妞村摜鏁敓鐘茬畺妞ゅ繐瀚ч弸搴ㄧ叓閸ャ劍鐓ユい锔规櫊濮婅櫣绱掑Ο璇茬闂佸摜鍠愰幐鍐差嚕婵犳艾鍗抽柣鏃堫棑缁愮偤姊洪崜鎻掍簼缂佽鍊归幈銊︽償閿濆洨锛濇繛杈剧到閹碱偊鎮甸敓鐘崇厱闁哄洦顨嗗▍鍐磼閵娿儺鐓兼慨濠囩細閵囨劙骞掗幋婊冩瀳濠电偛鐡ㄧ划搴ㄥ磻閵堝绠氶悘鐐缎掗弸搴ㄦ煙閹屽殶闁告ɑ鎮傞幃妤呮儌閸涘﹤顏堕梺璇插嚱缂嶅棝宕滃☉婧惧徍濠电姷鏁告慨鐑姐�傛禒瀣婵犻潧顑呯粻鏍煕鐏炲墽鈼ョ紒璇叉閺岋綁骞嬮敐鍡╂闁哥儐鍨伴—鍐Χ閸℃﹩姊块悗瑙勬礋濞佳嗙亱濡炪倖鐗楃粙鎾跺姬閿熶粙姊哄Ч鍥х伈婵炰匠鍡忓彺闂傚倷鑳堕幊鎾诲床閺屻儱鐤柡澶嬪灩閺嗭附鎱ㄥΔ瀣濡炪們鍨洪幑鍥�佸☉銏犲耿婵°倓绀侀悵鏃堟⒑閻熸澘妲婚柛銏＄叀閸┿垽骞樼拠鎻掔�銈嗘⒒閺咁偅绂嶉鍫熲拻濞达絿鐡旈崵娆戠磼缂佹ê鐏撮柟铏箖閵堬綁宕橀悙顒佹珨闂備線娼чˇ顐﹀疾濞戞氨鐭嗛悗锝庡亖娴滄粓鏌熼幆褜鍤熺紒鐘崇墵閺屾盯寮撮悙鍙夋濠殿喖锕ㄥ▍锝囧垝濞嗘挸绀岄柍銉ュ暱椤娀姊绘担鍛婃喐濠殿喚鏁婚獮鎴﹀炊椤忓拋妫ㄦ繝鐢靛仜椤曨參宕㈣閹椽濡搁埡浣哄幈闂佺鎻梽鍕磻閿濆鐓曢柕澶涚到婵¤偐绱掗幓鎺濈吋闁哄本鐩俊鑸靛緞婢跺鏋ら梻浣告惈閻ジ宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�?
		HashMap<Long, Long> watchfight=new HashMap<Long, Long>();
		Scene scene = SceneManager.getInstance().getSceneByID(CQMAPID);
		Set<Integer> aroundIndexs = new java.util.HashSet<Integer>();
		aroundIndexs.add(3);
		aroundIndexs.add(65539);
		Map<Long, Role> roles=scene.getAllRolesInScreens(aroundIndexs);
		int num=0;
		for(Role role : roles.values()){
			GridPos hostGridPos = role.getPos().toGridPos();
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閿曞倹鐓欑紒瀣儥閻撳ジ鏌熼鍝勭伈妞ゃ垺顨婂畷鐔碱敃閵堝骸鏁告繝纰夌磿閸嬫盯顢栭崨鏉戠濞寸姴顑呯粻顖氼渻鐎ｎ亜顒㈤柛鐘叉閺屾盯寮撮妸銉ヮ潾濡炪倧瀵岄崣鍐潖閾忓湱鐭欓悹鎭掑妿椤斿鏌﹂崘銊ヨ埞閼挎劙鏌涢妷鎴濈Х閸氼偄螖閻橀潧浠﹂柣妤侇殜楠炲繘宕ㄩ娑樻瀭闂佸憡娲﹂崜娑溿亹閸℃稒鈷掗柛灞剧懅椤︼箓鏌涘顒夊剱缂佸倸绉电粋鎺旓拷锝庝簽閿涚喖姊绘笟鍥у缂佸顕划鍫ュ醇閻旂繝绨婚梺瑙勫劤瀹曨剟鎮橀鍫熺厓闂佸灝顑呯粭鎺楁煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼哥數绡�闁汇垽娼ф禒褔鏌涘Ο鐘叉礌閿熸枻绠撻幃婊堟偩鐏炵晫銈﹂梻濠庡亜濞诧妇绮欓幒妤�鐤鹃柟闂寸劍閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹?
			if (!role.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())) {
				continue;
			}
			//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥╀紳濞差亶鏁傞柛鏇ㄥ弾濡茶埖绻濋悽闈涗粶婵☆偅鐟╅獮鎰板箹娴ｇ懓鍓瑰┑掳鍊ч幏鐑芥煃鐟欏嫬鐏撮柟顔规櫊楠炴捇骞掗幘鎼悩婵犵數鍋涢悺銊у垝瀹ュ洤鍨濋柟鎹愵嚙閽冪喖鏌嶉妷锕�澧柛姘儔閺屾盯骞囬埡浣割瀳濡炪値鍓欓鍛粹�旈崘顔嘉ч煫鍥ㄦ礈钃遍梻浣虹帛閹碱偆鎹㈠┑鍡╁殨閻犲洦绁村Σ鍫熺箾閸℃ê濮囬柛鏂挎嚇濮婅櫣锟藉湱濮甸ˉ澶愭煙閸愭彃顒㈤柟渚垮妼閳藉顫濇潏鈺嬬闯濠电偠鎻徊鑲╁垝濞嗘挸浼犳繛宸簼閸嬨劍銇勯弽銊р槈缂佹せ鏅犻弻锝堢疀閹捐櫕娈婚梺鍝勭焿缁查箖骞嗛弮鍫晬婵犲﹤鎲涢敐澶嬧拺闁告稑锕ョ亸浼存煟閳哄﹤鐏犳い鏇秮楠炲酣鎳為妷銉ゆ睏缂傚倸鍊烽悞锕佸綔闂佸綊鏀卞浠嬪蓟閿濆鍋愰柛娆忣槺椤﹂亶姊虹捄銊ユ瀻闁跨喓鏅崰鎰版偟椤忓牊鐓熼煫鍥ㄦ尵婢ф洟鏌嶇憴鍕伌闁诡喗鐟ラ蹇涱敊閸忕⒈鍟�闂傚倷鑳堕…鍫㈡崲閹达附鏅濋柕蹇嬪�栭崑妯汇亜閺冨洦顥夌紒鍓佸仱閺岀喖鏌囬敃锟介獮鏍瑰鍫滄喚婵﹥妞藉畷婊堝箵閹哄秶鏁栭梻浣告憸婵挳鏌婇敐澶堬拷渚�骞樼拠鑼啋缂傚倷鐒﹁彜闁归攱妞藉濠氬磼濮樺崬顣甸梺鍝勬噺閻╊垶骞嗘担鍓茬叆闁割偆鍠撻崢鍗炩攽閳藉棗鐏犳繝锟介柆宥嗗剹婵炲棙鍩婇幏椋庢喆閸曨剛顦梺鍝ュУ閻楃姴顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
			if(role.getLevel()<fire.pb.battle.CSendInvitePlayPK.PVP_LEVEL){
				continue;
			}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锔剧磽閸屾艾锟芥悂宕愭搴㈩偨闁靛牆顦粻顖炴煟閹达絽袚闁绘挻娲熼弻宥夊煛娴ｅ憡娈堕梺鍐插綖缁舵岸寮婚敐澶婄閻犺櫣鍎ら悗楣冩⒑闁稓鈹掗柛鏂跨焷閻忓啴姊虹捄銊ユ瀺缂侇喗鐟╅獮鍐槼缂佺粯绻堝畷鐔兼嚋闂堟侗浼撴繝娈垮枟椤洭宕戦幘璁规嫹濮樼偓瀚�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繐霉閸忓吋缍戦柛銊ュ�块弻锝夊箻瀹曞洤鍝洪梺鍝勵儐閻楁鎹㈠☉銏犵婵炲棗绻掓禒楣冩⒑缁嬪灝顒㈤柡灞诲姂閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹鎹ｉ柛鏂挎憸缁辨挻鎷呴崫鍕戙垻绱撳鍜冭含鐎殿喖顭锋俊鍫曞触閵堝懏璐￠柨鐔告灮缂嶅棝宕戦崨瀛樺仧闁哄稁鍋嗙壕濂告煟閹伴潧澧柛鏂诲�濋弻鏇㈠醇閻旂锟芥劗锟芥鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?
			if(role.getLevel()<levelmin||role.getLevel()>levelmax){
				continue;
			}
			if(school>0){
				if(role.getSchoolId()!=school){
					continue;
				}
			}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅綁鏌ｉ幇銊︽珕闁挎稑鐗嗛埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牆顕ｉ幓鎺嗘斀閻庯綆鍋嗛崢閬嶆煟韫囨洖浠ч柛瀣崌閹啴骞嬮悙顏冪盎闂佸搫鍊圭�笛囧吹閸ャ劍鍙忓┑鐘插暞閵囨繃淇婇銏犳殭闁宠棄顦～婵嬵敆婢跺鐦掓繝纰夌磿閸嬫垿宕愯缁辨挸顫濈捄铏诡攨闂佸憡鍔樼亸娆撳汲閿曞倹鐓曟い顓熷灥娴滅偟绱掗埥鍛闂傚倷绀侀幉锟犲礉瑜忕槐鎾愁潩鏉堫偄小婵犵數濮电喊宥壦夋繝鍐︿簻闁规壋鏅涢悘顏勵熆鐠哄搫顏柡宀�鍠栧畷銊︾節閸愵煉鎷烽幇顓滀簻闁靛繆鍓濋ˉ鍫熴亜閵忊剝绀嬪┑鈥崇埣瀹曞爼鍩＄�ｎ剙绨ラ梻鍌氬�烽懗鍓佸垝椤栫偞鍋￠柕澶嗘櫅缁犵娀鐓崶銊︾┛闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷
			if(role.getRoleID()==hostid){
				continue;
			}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閵夘喗鏅為梺绯曞墲閻燂箑鐣烽弻銉︾厱妞ゆ劗濮撮崝姘舵煢閸愵亜鏋旈柨鐔绘缁犲秹宕曢崡鐐嶆稑鈻庨幇顓炲伎濠电姴锕ら悧濠囨偂濞嗘劗绠鹃柛顐ｇ箘娴犮垽鏌＄�ｈ泛顩紒杈ㄥ浮楠炲洭顢樿閻や礁鈹戦纭锋敾婵＄偠妫勯悾鐑筋敃閿曪拷鍞梺闈涱檧婵″洩銇愬鑸碘拻濞达絽鎽滅粔鐑樸亜閵夛附宕岀�规洘顨呰灒濞撴凹鍨辩紞搴ｇ磽閸屾瑧鍔嶉拑鍗炩攽椤栨稒灏﹂柡灞剧☉閳藉顫滈崼鐔告毎闂備胶顭堢�涒晠骞戦崶顒�钃熼柨婵嗘閸庣喖鏌曡箛銉х？婵炲牄鍊濆铏圭矙鐠恒劎顔夐梺鎸庡哺閺岋綁鏁愭径妯活棖闂佺懓寮堕幐鍐茬暦閻旂⒈鏁冩い鎰╁灪椤旀捇姊婚崒娆戭槮闁圭⒈鍋婅棟濞村吋娼欓崹鍌滄喐閻楀牆绗氶柛瀣ф櫊閺岋綁骞囬棃娑橆潾缂備胶濞�缁犳牕顕ｉ崼鏇為唶婵犻潧妫岄幐鍐磽娴ｅ壊妯堥柛鎾存皑閹广垹鈽夐姀鐘炽仢闂佸憡鍔︽禍婵嬪磻瑜庣换婵嬪閿濆孩缍堝┑鐐插级椤洨绱撻幘瀵割浄閻庯綆浜滅粣娑欑節閻㈤潧孝閻庢凹鍓熼悰顕�宕奸妷锔规嫽婵炶揪绲介幉锟犲箚閸喓绠鹃悘鐐插�搁悘鑼拷瑙勬礃缁诲倿鎮惧┑瀣妞ゆ帪鎷烽柨鐔绘閻栧ジ寮婚妸銉㈡婵☆垯璀︽禒楣冩⒑缁嬫鍎愰柣妤侇殘閹广垹鈹戠�ｎ偒妫冨┑鐐村灥瀹曨剟宕滈柆宥嗏拺闁规儼濮ら弫閬嶆煕閵娿儲鍋ョ�殿喖顭烽幃銏ゆ惞閸︻厾鍘梻浣告贡椤牏锟芥稈鏅涢悾鐑藉箮閼恒儮鎷洪柣搴℃贡婵敻藟婢跺浜滈柨鏃傚亾閺嗩剛锟芥鍠栭…鐑藉极閹邦厼绶炴俊顖滅帛濞呭秵绻濋悽闈涒枅婵炰匠鍥ㄦ櫇闁靛牆顦崒銊╂煥閻斿搫校闁抽攱鍨块弻锝夋偄缁嬫妫嗛梺浼欑秵閸欏啴寮诲☉銏犖╅柕濠忓瘜濡嫰姊烘导娆戝埌闁搞垺鐓￠敐鐐差煥閸喐娅㈡繛瀵稿Т椤戝懘鎮橀幎鑺ョ叆闁哄洨鍋涢敓钘夋憸缁鏁愭径瀣幗濠碘槅鍨甸褏寰婄紒妯诲弿閻熸瑥瀚崣锟藉┑顔硷工椤嘲鐣烽幒鎴旀瀻闁瑰濮峰畷鍙夌節閻㈤潧浠掗柛鏍█瀹曞爼濡搁妷銈囩秿闂傚倷鑳剁涵鍫曞礈濠靛鎲橀悗锝庡枛閻愬﹥銇勯幒鐐村缂備胶濯崹鎶芥晸閻ｅ本顏熼柟宄板槻閳规垿鎮╅幓鎺撴缂備線顤傞崣鍐潖婵犳艾纾兼慨姗嗗墾閹风兘骞栨担鍝ワ紮婵＄偛顑呯�涒晠顢曢懞銉﹀弿婵妫楁晶濠氭煟閹烘洘顥夐柍瑙勫灴閹晝锟藉湱濮撮ˉ婵堢磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
			Team host_Team = TeamManager.selectTeamByRoleId(role.getRoleID());
			if (host_Team != null && host_Team.isNormalMember(role.getRoleID())){
				continue;
			}
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬫繝娈垮櫙閹风兘姊洪弬銉︽珔闁哥喐濯介妵鎰版晲婢跺鎷绘繛杈剧到閹芥粎绮旈悜妯镐簻闁靛闄勫畷宀�锟借娲橀〃鍛达綖濠婂牊鏅稿ù鐘差儑瀹撲線鏌涢幇銊︽珖妞も晝鍏橀幃妤呮晲鎼存繄鐩庨梺璇插瘨閸樺ジ鈥旈崘顔嘉ч柛鈩冾殔椤洭姊洪幖鐐插婵＄偘绮欓獮鍐┿偅閸愮偓鏅㈤梺绋挎湰缁酣鏁嶅┑瀣拺缂佸瀵у﹢浼存煟閻斿弶娅呮い顒�锕幃婊堟嚍閵壯冨箞闂備礁鎼崐钘夆枖閺囩偞姣勯梻鍌欑窔濞佳兠洪敃鍌氱婵炲棗绻掗弳锔芥叏濡ゅ瀚瑰銈冨灪閿曘垽骞冮埡鍌涚秶妞ゆ劑鍨婚崝鐢告⒒閸屾艾锟芥悂宕愰幖浣哥９闁绘垼濮ら崵鍕煕椤愶絾绀�缁炬儳顭烽弻鏇熺箾閻愵剚鐝旂紒鐐劤濞硷繝寮婚埄鍐ㄧ窞閻庯綆浜炴禍鍫曟⒑閸濆嫷鍎忕紒澶婄秺瀵鏁撻悩鑼�為梺闈涱槶閸庤櫕绂掗懖鈺冪＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�
			if(modeltype==QCmodelType.TEAM_FIGHT){
				//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸℃ɑ鎮欓梺姹囧妽閸ㄥ潡寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁顫滈敓浠嬪箖閵忋倕浼犻柛鏇ㄥ亝椤撳ジ姊婚崒娆戭槮闁硅绻濋妴鍐╃節閸愵亶娲搁梺鍓插亝濞叉牠鎷戦悢鍏肩厪濠电偟鍋撳▍鍛存煕濡や礁鈻曢柡宀嬬秮楠炲洭顢涢敐鍛杺闂備礁缍婇ˉ鎾诲蓟婢舵劕桅闁圭増婢樼粻鎶芥煙鐎电校闁绘搫绲炬穱濠囨倷椤忓嫸鎷烽弽顐ｆ殰闁圭儤妫戦幏宄邦潩閻撳骸绫嶉悗瑙勬礃閸旀瑥鐣锋總绋垮嵆闁绘柨鎼獮妤呮⒒娴ｅ摜绉洪柛瀣躬瀹曟粌鈽夊▎鎴祫濠电偞鍨堕悷褏绮绘ィ鍐╃厱婵炴垵宕弸鐔虹磼閿熶粙宕奸姀銏紲闁哄鐗勯崝灞矫归锟介弻鐔碱敊鐟欏嫭鐝氶悗瑙勬礃閿曘垽骞婇悩娲绘晞闁圭瀛╅埢鏇熺節绾板纾块柛瀣灴瀹曟劙濡堕崱娆樻锤濠电姴锕ら悧鍡涙偪椤曪拷閹鈽夊▍顓″亹閹广垽宕卞☉娆戝幈濡炪倖鍔х徊鍓х矆閿熶粙姊虹紒妯哄闁挎洦浜璇差吋閸℃ê顫￠梺鐟板槻閼活垶宕㈤垾鎰佹富闁靛牆妫楁慨鍥煕濮橆剦鍎戦柟骞垮灩閳规垿宕煎┑鍥╋拷鍐测攽椤旂瓔娈旈柣妤�锕﹂敓鑺ヨ壘缂嶅﹪寮诲☉銏犵疀妞ゆ牗姘ㄥВ銏′繆閵堝洤孝婵炲樊鍘奸～蹇涙惞鐟欏嫬鐝伴梺鐐藉劥濞呮洟鎮橀崼銉︹拺缂佸灏呴弨濠氭煙椤旂厧锟藉潡濡存担鍓叉僵闁肩鐏氬▍婊勭節閵忥絾纭鹃柨鏇樺�濋幃妤咁敇閻戝棙瀵岄梺闈涚墕濡鎱ㄩ崒鐐寸厱闁靛鍔岄崥鍦磼椤曞棛绉柟顔界懇閹粌螣闁垮顏归梺鑽ゅ枑缁孩鏅跺Δ鍐╂殰闁圭儤鎸鹃々鎻捗归悡搴ｆ憼闁绘挻娲樻穱濠囶敍濠靛棗鎯為梺娲诲幗鐢偤鏁撻懞銉晱闁哥姵顨婇獮鎰板箮閽樺鐣哄┑鈽嗗灠閸氬锟芥碍宀搁弻銈囧枈閸楃偛顫俊銈嗘濮婄粯鎷呯粵瀣異闂佸摜濮电敮鈥崇暦濠婂啠鏀介悗锝庝簽閻ｉ箖姊洪崫鍕殭闁绘锕鏌ヮ敆閸曨剛鍘鹃梺鍛婃尰瑜板啯鏅堕锟介弻銊╂偄鐠囨畫鎾绘煟濡や胶鐭掓鐐村灴婵拷闁绘﹩鍋呴～宥夋⒑闂堟稓绠冲┑鐑囨嫹闂佸摜鍋犲▔娑⑩�旈崘顔嘉ч柛鈩冾殘閻熸劗绱撴笟濠冨婵炴挻鐔幏閿嬨亜閵忊剝顥堥柡浣规崌閺佹捇鏁撻敓锟�
				if(host_Team == null){
					continue;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅綁鏌ｉ幇銊︽珕闁挎稑鐗嗛埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牆顕ｉ幓鎺嗘斀閻庯綆鍋嗛崢閬嶆煟韫囨洖浠ч柛瀣崌閹啴骞嬮悙顏冪盎闂佸搫鍊圭�笛囧吹閸ャ劍鍙忓┑鐘插暞閵囨繃淇婇銏犳殭闁宠棄顦～婵嬵敆婢跺鐦掓繝纰夌磿閸嬫垿宕愯閿熶粙娼ч惌鍌氱暦閻熸壆鏆﹂柛銉戝啰浜板┑鐘垫暩婵敻鎳濋崜褏鐭嗛柛鎰典悍閹风兘鎮烽弶娆炬闂佸摜濮靛畝绋跨暦椤掑嫭鍋ㄩ柛娑樑堥幏娲⒑缁嬭法绠伴柛姘儔瀹曟劙骞囬鐘殿啎婵炶揪绲介崯璺拷姘煎弮瀹曪綀绠涘☉娆戝幈濡炪倖鍔х徊鎸庝繆閸ヮ剚鐓涢柨鐔剁矙閹崇偤濡烽敐鍕泿闂備礁鎼崯顐﹀磹閻熸壋鏋嶉柡鍥ュ灪閻撶喐銇勯幘璺烘瀻缂佹宀搁弻鐔哥瑹閸喖顬夌紓浣虹帛缁诲牆鐣烽幒妤�围闁搞儜鍕拷顖炴⒑鐠囧弶鍞夋い顐㈩槸鐓ゆ慨妤嬫嫹闁轰礁鍟存慨锟介柕鍫濆枦閹烽攱绗熼敓钘夘嚕椤曪拷瀹曠厧鈹戦崼顐Ｐу┑锛勫亼閸婃牜鏁幒妤�纾归柣鎴ｅГ閻掕姤銇勯弽顐沪闁抽攱甯￠弻娑氫沪閸撗勫櫘濡炪倧璁ｇ粻鎾诲蓟閻斿搫鏋堥柛妤冨仒缁ㄥ鏌ч懡銈呬沪缂佺粯绻堝Λ鍐ㄢ槈濞嗗繒鐛╂俊鐐�愰弲婊堟偂閿熺姴钃熸繛鎴欏焺閺佸啴鏌ㄥ┑鍡橆棤妞わ富鍙冮幃妤冩喆閸曨剙鐭紓浣藉煐瀹�鎼佺嵁閸愩剮鏃堝川椤旇姤鐝抽梺纭呭亹鐞涖儵宕滃┑瀣�堕柛顐犲灮绾捐棄霉閿濆懏鎯堥弽锛勭磽娴ｅ壊鍎愰悽顖楀墲娣囧﹪鎮界粙璺槹濡炪倖鐗楀銊╊敊婵犲洦鍊垫鐐茬仢閸旀碍绻涢弶鎴濓拷绋垮祫濡炪倖娲╅幏閿嬫叏婵犲啯銇濈�规洦鍋婂畷鐔兼濞戞ê螚闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹
				if(host_Team.getTeamLeaderId()!=role.getRoleID()){
					continue;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝宀勬偉閻撳寒鍤曞┑鐘崇閺呮彃顭跨捄鐚村姛妞ゆ挻妞藉娲箰鎼达絿鐣甸梺鐟板级閻╊垶鐛Ο鍛靛酣顢栫捄銊ф晨闂傚倷绶氬褔藝娴犲鍨傞弶鍫氭櫔閹峰嘲顫濋悙顒�顏�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢瀛樸亜閵夛附宕岄柡浣规崌瀹曟劙鎮ゆ担鍦Х婵犵數鍋涘鍓佹崲閸儲鏅查柣鎰綑缁剁偟锟界櫢鎷烽柨鐔剁矙閹本寰勯幇顓犲幍闂佺粯鍨惰摫妞ゃ儲鐗犻弻鐔割槹鎼粹�冲箣闂佽桨鐒﹂崝鏍箚閺傚簱鏀介柛顐ｇ箓濮ｅ牆鈹戦敍鍕杭闁稿﹥鍨垮畷鏇㈡嚑椤掍礁搴婇梺绋跨灱閸嬫劙鏁撻懞銉︻棃鐎规洘锕㈤、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁骞樻い蹇撶墕濮瑰弶淇婇妶鍛櫤闁抽攱鍨圭槐鎺旓拷锝庡亽閸庛儵鏌涙惔銏犵伌闁哄本鐩幃鈺呮惞椤愩垺娈梻浣告啞鐢鏁垾鎰佸殨妞ゆ洩鎷烽柡浣规崌閹儳鐣濋敓鐣屾閿曪拷闇夐柣妯烘▕閸庡繒锟界懓鎲＄换鍌炲煘閹达附鍋愰柟缁樺俯娴犵厧螖閻橀潧浠滈柣妤佹尭椤繒绱掑Ο璇差�撶紓浣圭☉椤戝棛绱為崼銉︹拺缂佸娼￠妤冪棯缂併垹骞楃紒鏃傚枛瀵挳濮�閳哄倹娅嶉梻浣哄仺閸庢娊顢楅弻銉ョ濡炲鍑介幏宄扳槈濞嗘鍔风紓浣叉閹风兘姊绘担鍦菇闁搞劏妫勯…鍥槼缂佸倹甯掗…銊╁醇閻斿搫骞楁繝寰锋澘锟窖囧箯閻戣姤鐓ラ柡鍥ュ妺缁ㄥ鏌ｉ敐鍥ㄧ効闁靛洦鍔欓獮鎺楀箣濠靛牞鎷烽鐑嗘富闁靛牆妫欑粈锟介梺鐟板暱缁绘帞妲愰悙瀛樺劅闁靛繈鍨婚惁鍫ユ⒒閸屾氨澧涚紒瀣灴閺佹捇鎳為妷锕�锟芥劖顨ラ悙宸█闁轰焦鎹囬幃鈺呮嚑椤掑﹦骞㈤梻鍌欑閹测�趁洪敃鍌氬瀭闂侇剙绉甸崑鍌炴煛閸ャ儱鐏柣鎾寸懇閺岀喓鎲撮崟顐㈩潓闂佽棄瀚妶鎼佸蓟濞戞粎鐤�闁规儳鐡ㄩ幏閬嶆⒑闂堟稒鎼愰悗姘嵆瀵偊宕掑鍕彴闂佽偐鈷堥崗娑橆浖閹惧绡�婵炲牆鐏濋弸娑㈡煥閺囨ê鍔氭い顏勫暣閹稿﹥寰勭仦鐐啎婵＄偑鍊栭崝褏绮婚幋鐘电焼閻庯綆鍋佹禍婊堟煙娴煎瓨娑уù婊勵殘缁辨帗娼忛妸褏鐤勫┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｅ憡鍟為柡灞诲姂椤㈡牗寰勬繝鍕闂佽法鍠撴慨瀵哥不椤曪拷閺岋綁鏁愰崨鏉款伃缂備椒绶ょ粻鎾愁潖閾忕懓瀵查柡鍥╁仜閳峰顪冮妶搴″箹婵炲樊鍙冮獮鍐偪椤栨ü姹楅梺鍦劋閹搁箖宕ｉ崱娑欌拺缂備焦蓱閳锋帞绱掗鍛仸閽樼喎顭跨捄渚剭濞存粍绮撻弻锟犲炊閺堢數鏁栫紓浣割儏椤兘骞冨Δ鍛棃婵炴垶鐗曟禒顔嘉旈悩闈涗沪闁绘濞�閵嗕礁顫滈敓浠嬪箖閵忋倕宸濆┑鐘插瀵ゅ搫鈹戦悩鍨毄濠殿喚鍏樺顐﹀川婵犲嫮顔曢梺璺ㄥ枙婵倗鎹㈠☉娆愬闁告劖褰冮幃鈺傜箾閹寸們姘跺几鎼淬劍鐓欓柛顭戝枛閺嗙偤鏌￠崨顏呮珚婵﹥妞介獮鏍倷閹绘帒肖闂備礁鎲￠幐璇茬暆缁嬭法鏆﹂柟鎵閸嬨劑鏌涘☉姗堝伐濞寸媭鍘奸埞鎴︽倷閸欏妫炵紓浣虹帛閸旀瑩銆侀弮鍫晝闁挎梻鏅崢鐢告⒑閼恒儍顏埶囬鐐叉辈婵炲棙鍔戞禍婊勩亜韫囨挸顏╅柡鍡悼閿熻姤顔栭崰鏍偉婵傚摜宓侀悗锝庡枟閸婄兘鏌涘▎蹇ｆЧ闁伙絽銈稿濠氬磼濞嗘埈妲梺鍦拡閸嬪﹪鐛繝鍥х闁哄倶鍎查悘鍐ㄢ攽閻愭潙鐏熼柛鈺佸瀵偊宕堕浣哄幈闂婎偄娲﹀ú鏍暜閸撲胶纾奸柛鎾茬娴犳粓鏌嶇憴鍕伌闁诡喒鏅犻獮鎾诲箳閹炬惌鍞茬紓鍌氬�峰鎺旂矆娓氾拷閹儵鎮℃惔顔界稁缂傚倷鐒﹂…鍥偡瑜版帗鐓ラ柣鏃傜帛椤ュ銇勯鐐寸┛妞わ箑鐖奸弻娑㈡晲閸涱垳楔濠殿喖锕ュ钘夌暦閵婏妇绡�闁告劦鐓堝Σ閬嶆⒒娴ｅ憡鍟炴い顓炵墕铻為柛鏇ㄥ灠閻撴繈鏌熼幑鎰靛殭缂佺姷鎳撻湁闁挎繂鎳庣敮銊╂煙瀹勯偊鐓兼慨濠呮缁瑩骞愭惔銏″闂備胶鍘х紞濠勭不閺嶎厼鏋侀柟鍓х帛閸ゅ秹鏌曟径娑氱暠闁跨喕濮ら崝妤呮晸閸婄噥娼愭繛璇х畵瀹曡娼忛埡瀣闂傚牊绋忛崑銏拷娈垮枛閻栧ジ鐛�ｎ喗鍋愰梻鍫熺〒閸婄偤姊绘担绛嬪殭濡ょ姴鎽滅划璇差吋婢跺﹦锛熼梺鍛婎殘娴兼繂煤椤忓懏娅囬梺绋跨焿婵″洨绮欒箛娑欌拺闁告繂瀚崒銊╂煕閵婏附銇濋柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堝Δ鐘靛亼閸ㄧ儤绌辨繝鍥ㄥ�烽悗娑欘焽椤︺劌鈹戦敍鍕粧缂侇喗鐟╅幃浼搭敊閹惧懏瀚归柨婵嗙凹閹查箖鏌ｉ弬鎸庮棡闁靛洤瀚伴獮瀣敇閻愬樊娼婚梺璇插閸戝綊宕滃☉妯锋瀻闁靛繈鍊栭崐鐑芥煟閹寸儐鐒介柛妯兼暬濮婄粯绗熼崶褍浼庣紓浣哄У閸ㄥ潡鎮伴鍢夋梹鎷呴搹璇″晭闂備礁鎲℃笟妤呭窗濮橆厽娅犻柣銏犳啞閻撴瑦銇勯弮鍌滄憘婵炲牊绮撻弻鐔碱敍濮橆剨鎷烽崹顔炬殾闁靛濡囩弧锟介梺绋胯閸婃挾妲愰敃鍌涒拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁婢舵劖鏅搁柣妯垮皺椤︻噣姊洪幐搴⑩拻闁哄拋鍋婇妴鍛村蓟閵夛妇鍘介梺褰掑亰閸犳牠宕濈�ｎ喗鐓曢悗锛卞嫭鐝氶梺鍝勬湰缁嬫垿鍩為幋锕�骞㈡俊銈咃梗濡叉劙姊绘担鍝勭殤闁瑰嘲鍢查湁闁绘ê妯婇崕鎰版煟閹捐泛鏋戝ǎ鍥э躬椤㈡稑顭ㄩ崘銊ヮ瀱闂備礁纾划顖毭洪悢鐓庤摕闁挎繂顦粻铏繆閵堝懎鏆熼柡鍡╁亰濮婃椽宕崟顒佹嫳缂備礁顑嗙敮鐐哄箲閵忕姭鏀介悗锝庝簽椤︺劑姊虹紒妯哄Е闁告挻鐩鎶筋敇閵忊檧鎷绘繛杈剧到閹诧繝宕悙鐑樺仺妞ゆ牗渚楀▓姗�鏌℃笟鍥ф珝妤犵偞甯掕灃濠电姴鍟▍宥夋⒒娴ｄ警鐒剧紒缁樺浮瀹曘垼顦存繛鍡愬灲閹瑩鎮滃Ο鐚存嫹閻㈠憡鐓ユ繛鎴灻懜褰掓倵濮樼厧澧撮柟顖欐祰椤﹁鎱ㄦ繝鍌ょ吋鐎规洘甯掗埢搴ㄥ箳閹存繂鑵愮紓鍌氬�风欢锟犲闯椤曪拷瀹曞綊骞忓畝锟芥禍閬嶆⒒娴ｅ憡鍟為柛鏃撶畵瀹曚即寮介銈囷紲闂佸啿鎼幊搴ｇ棯瑜旈弻娑㈩敃閿濆浂鏆″┑鐐叉噺濡啴寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁顫滈敓浠嬪箖閳哄懎绠甸柟鐑樻煥閹藉姊婚崒姘拷椋庣矆娓氾拷楠炴牠顢曢敃锟界�氬銇勯幒鎴濐仾闁稿骸瀛╅妵鍕冀椤愵澀绮堕梺鍝勵儎缁舵岸寮诲☉妯兼殕闁跨喍绮欏畷鎴濃槈濞嗗浚鍤ら梺缁橆焽缁垶鎮￠弴銏＄厸闁搞儯鍎辨俊鐓幟瑰锟界划娆撳蓟閿濆棙鍎熼柕蹇婏拷鍐叉敪婵犳鍠栭敃锔惧垝椤栫偛绠柛娑卞灣閻瑦绻涢崱娆忎壕妞ゃ儲鍨垮缁樻媴閾忕懓绗￠梺鐟版啞閹倿骞冭楠炴ê鐣烽崶銊︻啎婵犵數濮撮敃銈夋偋婵犲洤纾婚柛鏇ㄥ亐閺�浠嬫煕鐏炴儳鍤俊鎻掓啞缁绘盯宕煎☉妯侯瀳濡炪値浜滈崯瀛樹繆閸洖骞㈡俊銈呮噹濞堟繈姊绘担鍝ョШ妞ゃ儲鎹囧畷妤�顫滈敓浠嬬嵁濡ゅ懎閱囬柡鍥╁仜閸炪劌顪冮妶鍡樺暗闁哥姵鎹囧畷銏ゆ焼瀹ュ棌鎷虹紒缁㈠幖閹冲酣鎮炴禒瀣厱闁哄倽娉曞瓭闂佸疇顕х粔鐟扮暦閸洦鏁嗗ù锝呮惈楠炴劙姊绘担铏广�婇柛鎾寸箞閹兘濡烽埡浣哄幒闂佸壊鍋嗛崰鎰板矗韫囨挴鏀介柣妯哄级閸ｇ儤銇勮箛鏇炐ョ紒杈ㄥ笚濞煎繘濡搁妷褏鎳嗛梺鍙ョ串缁蹭粙濡撮幒鎴僵闁绘挸娴锋禒顓烆渻閵堝啫鍔电紒缁樼箓椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘缁樷拺闁荤喐婢橀弳杈╃磼缂佹﹫鑰挎鐐叉瀹曠喖顢涢敐鍡樻珫闂備胶绮崝锔界閻戣棄绠梺鍨儐婵绱掗娑欑闁诲骸顭峰铏规喆閸曨偄濮㈤梺瀹︽澘濡奸柍璇茬Ч婵拷闁靛牆妫岄幏娲煟閻樺厖鑸柛鏂胯嫰閳诲秹骞囬悧鍫㈠幍闂佸憡鍨崐鏍拷姘炬嫹
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
	 * 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒鹃崯鍝ョ磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦梻鍫熺♁閹兼劙鎮楀顓熺凡妞ゆ洩缍侀獮姗�顢欓悡搴わ拷鍨攽鎺抽崐褔骞忛柨瀣ㄤ簻闊浄绲奸柇顖炴煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬫偘椤曪拷瀹曞爼顢楁径瀣珜闂備胶顭堥張顒勬偡瑜庨妵娆撳箮閼恒儮鎷绘繛杈剧到閹诧繝骞夌粙搴撴斀妞ゆ棁濮ょ紞鎴︽懚閻愬绡�闂傚牊渚楅崕蹇涙煢閸愵亜鏋戠紒缁樼洴楠炲鎮欓悽闈涘綆婵犵數鍋涢惌鍫熺椤忓牆钃熸繛鎴欏灩缁犵粯淇婇妶鍜佸剱閻庢氨鎳撻埞鎴﹀焺閸愩劎绁烽梺缁橆殕閹告悂锝炶箛娑欐優閻熸瑥瀚悵浼存⒑閼测斁鎷￠柛鎾寸洴椤㈡瑦寰勯幇顓涙嫼闂佺粯鍨熼弲婊冣枍閹剧粯鐓曢柕濞垮妽绾偓銇勯弴顏嗙ɑ缂佺粯绻傞～婵嬵敇閻斿摜褰告繝鐢靛О閸ㄧ厧鈻斿☉婊呮闂備礁鍟块幖顐﹀箠韫囨稒鍋傞煫鍥ㄦ惄閻斿棝鎮规ウ鎸庮仩濠⒀勬礋閺屾盯寮敓钘夘焽濞嗘挻绠掔紓浣鸿檸閸欏啴寮ㄦ潏鈺嬫嫹濮橆剛绉烘慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備焦妞挎禍婊呯礊婵犲倻鏆︽繛宸簻缁�瀣亜閺嶃劏澹橀柣搴弮濮婂宕掑鍗烆杸缂備礁顑呴悧鎾愁嚕缁嬫鍚嬪璺侯儑閸欏棗鈹戦悩缁樻锭婵☆偒鍘煎嵄鐟滅増甯楅悡娑㈡煕濞戝崬鏋熼柛濠冨姍閺屸�崇暆鐎ｎ剛鐦堥悗瑙勬礃鐢帟鐏掗梺缁樿壘閻°劎锟芥艾缍婇弻鈥愁吋鎼粹�插闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�?
	 * @param role
	 * @param watchfight
	 */
	private  void watchFightView(Role role,HashMap<Long, Long> watchfight){
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅綁鏌ｉ幇銊︽珕闁挎稑鐗嗛埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牆顕ｉ幓鎺嗘斀閻庯綆鍋嗛崢閬嶆煟韫囨洖浠ч柛瀣崌閹啴骞嬮悙顏冪盎闂佸搫鍊圭�笛囧吹閸ャ劍鍙忓┑鐘插暞閵囨繃淇婇銏犳殭闁宠棄顦～婵嬵敆婢跺鐦掗梻鍌氬�烽懗鍫曞箠閹捐鐤柛褎顧傞崶顒侇棃婵炴垵宕▓銊︾節閻㈤潧校缁炬澘绉瑰鎻掆攽鐎ｎ偆鍘遍柣蹇曞仜婢т粙濡撮幒妤佺厱婵☆垳绮畷灞炬叏婵犲懏顏犻柨鐔绘濠�杈ㄦ叏閻㈢违闁告劦浜炵壕濂告煥閻旇袚缂佹鍠栭弫鎾绘寠婢舵ê娈ㄩ梺瑙勫劶婵倝宕愰悜鑺ョ厽闁靛繈鍨洪弳鈺呮煥濞戞瑧鐭掓慨濠呮缁辨帒螣韫囷絼閭�规洦鍨跺畷褰掝敊濮橆剛绉烘い銏″哺閺佹挻绂掔�ｎ亣鎽曢梺鎸庣☉鐎氼亜鈻介鍫熺厱闁圭偓顨呯�氼剟宕归柆宥嗏拻濞达綀濮ら妴鍐磼閿熻姤绗熼敓钘夌暦閹版澘鍨傛い鏃傚亾濞堟儳顪冮妶鍡楀Ё缂佺姵鍨圭划鍫拷锝庡亖娴滄粓鏌熸导瀛樻锭濞存粎鍋ら弻銊╂偄鐠囨畫鎾绘煙缁嬪灝鏆辨い顐㈢箳缁辨帒螣鐠囧樊锟芥挾绱撴担鍓插剱妞ゆ垶鐟ヨ灋鐎癸拷閸曨兘鎷虹紓鍌欑劍钃遍悘蹇ｅ弮閺岋絽螖娴ｇ懓纰嶉梺浼欑到閸㈡煡鈥﹂妸鈺侀唶闁绘棁娓圭花璇测攽閻樼粯娑ч柛濠冩倐钘濇い鏍ㄥ焹閺嬫棃鏌曟繛鍨姶婵炴挸顭烽弻鏇㈠醇濠靛浂妫為梻浣稿级缁捇寮婚悢鍓叉Ч閹肩补锟藉啿绠ｉ梻浣侯攰濡嫰鎮ラ悡搴殨濞寸姴顑愰弫鍥煟閺傛寧鎯堟鐐茬墦濮婄粯鎷呮笟顖涙暞闂佺硶鏅涘ú顓炵暦濠靛棭鍚嬮柛娑变簼閻庢椽姊洪幖鐐插姶闁告挻宀搁幃鈥斥槈閵忥紕鍘遍梺鏂ユ櫅閸熶即骞婇崘顔界厓閻犲洩灏欐晶娑㈡煙娓氬灝濡界紒缁樼箞瀹曘劑顢氶崨顒�鎽嬬紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柟鐑樻礈娴滆棄鈹戦悙瀛樺鞍闁告垵缍婂畷褰掓焼瀹撱儱顦甸弫鎾绘偐閺傘儲瀚藉┑鐐舵彧缁蹭粙骞夐敓鐘茬畾闁割偁鍎查悡娆撴煕閹邦垰鐨虹紒鐘差煼閺岀喖顢涘顒変純濡炪們鍨洪惄顖炲箖濞嗘搩鏁傞幖娣灩椤忚埖绻涙潏鍓ф偧缁绢厼鐖煎鍛婃償閵婏妇鍘甸梺璇″瀻閸涱喗鍠栨繝鐢靛仜閹冲矂宕归挊澶樻綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣婵勫灲濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽崺鍕礃閵娧呯嵁闂佽鍑界紞鍡樼閻愬搫鍌ㄩ柟鎵閳锋垿鏌ゅù瀣珔妞わ絽銈搁幃妤冪箔濞戞ɑ鎼愬鍛存⒑閸涘﹥澶勯柛鐘冲哺閹潡鏁撴禒瀣拺閻熸瑥瀚粈鍐╃箾婢跺娲撮柕鍡楀�块幖褰掑捶椤撶媴绱冲┑鐐舵彧缁蹭粙骞栭锔绘晛闁规儳澧庣壕濂告煠绾板崬澧ù婊冨⒔缁辨帒鐣濋崘顔兼懙缂備胶绮换鍫濈暦閸洘鍤嬮柛顭戝亝閻濐偄鈹戦悩鍨毄濠殿喗鎸抽弫鍐Χ婢跺﹦鐤囬柟鑹版彧缁茶法绮婚弮鍫熺叆闁绘柨鎼牎闂佹娊鏀遍崹鍧楀箖瑜版帒鐐婃い蹇撳濮ｃ垻绱撴担鍝勑ｅ鐟版濡叉劙骞掗幘宕囩獮闁诲函缍嗛崑鍕船婢舵劖鈷戠紒顖涙礃閺夋椽鏌涙惔銏犵祷妞ゆ洏鍎靛畷鐔碱敍濮樿京鏉告俊鐐�栭幐楣冨窗閹伴偊鏁傞柣鏂垮悑閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�?
		if(!fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅綁鏌ｉ幇銊︽珕闁挎稑鐗嗛埞鎴︽倷閸欏鏋欐繛瀛樼矋缁诲牆顕ｉ幓鎺嗘斀閻庯綆鍋嗛崢閬嶆煟韫囨洖浠ч柛瀣崌閹啴骞嬮悙顏冪盎闂佸搫鍊圭�笛囧吹閸ャ劍鍙忓┑鐘插暞閵囨繃淇婇銏犳殭闁宠棄顦～婵嬵敆婢跺鐦掓繝纰夌磿閸嬫垿宕愯閿熶粙娼ч惌鍌氱暦閻熸壆鏆﹂柛銉戝啰浜板┑鐘垫暩婵敻鎳濋崜褏鐭嗛柛鎰典悍閹风兘鎮烽弶娆炬闂佸摜濮靛畝绋跨暦椤掑嫭鍋ㄩ柛娑橈功閸樹粙姊虹紒姗嗙劷闁稿簺鍊濇俊鎾礃椤旇棄浠梺璺ㄥ枍缁瑩寮崘顔芥櫢闁芥ê顦粊顐ｇ節閻㈤潧浠滄俊顖氾攻缁傚秴鈹戠�ｎ偄浜楅梺缁樻煥閸氬鎮￠悢鍏肩厸闁稿本绋戦婊堟煙閹绘帗鎲哥紒杈ㄥ浮閹晠妫冨☉妤侇潟闂備礁鎼径鍥晸閽樺锛嶉柡鍡楁閹鏁愭惔鈥愁潾闂佷紮绠戦悧鎾诲箖濡ゅ啯鍠嗛柛鏇ㄥ墰椤︻參姊洪崫銉バｉ柣妤佹礉閻忓姊洪崨濠傚闁告柨顦嵄闁割偆鍠愰崣蹇旀叏濡わ拷濡绂嶅┑瀣厱闁冲搫鍊诲ú瀛樻叏婵犲嫮甯涢柟宄版噽缁數锟斤綆浜濋鍕⒒閸屾瑧顦﹂幖瀛樼矌瀵板﹥绂掔�Ｑ嶆嫹閿曞倸鐐婃い蹇撶У閳诲矂姊绘担绛嬪殐闁搞劋鍗抽幆宀勫磼濮樿鲸娈鹃梺鍦劋閸╁牆顭囬埡鍛厽闁规儳鍟块銏°亜閹炬潙顕滃ǎ鍥э躬閹瑩顢旈崟鑸靛闁哄稁鍋呴弳婊堟煙閻戞ɑ顥栭柟宄板槻椤繈鎮℃惔鈾�鎷俊銈囧Х閸嬬偤宕归崸妤�绠犳繝濠傜墛閸婄兘姊洪锝囥�掗柣鈺侀叄濮婄粯鎷呯粵瀣秷閻庤娲橀敋闁崇粯鏌ㄩ埥澶愬閻樻彃娈ら梻浣告惈閸燁偊鎮ф繝鍥ㄥ亗婵炴垯鍨洪悡鏇㈡煃閽樺顥滄鐐搭殜閹顫濋悙顒�顏�
		Long battleid = xtable.Roleid2battleid.select(role.getRoleID());
		if (battleid==null){//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈢┛缂佺姵鎹囧顐﹀箻缂佹ê鐧勬繝銏ｆ硾閻ジ寮冲☉銏♀拺缂佸娼￠崣鍕瑰鍕姸婵☆偆鍠庨—鍐Χ閸℃瑥鈷堥梺绋款儑閸嬨倕鐣烽弴鐐嶆梹鎷呮搴ｇ暰闂備線娼ч悧鍡欙拷姘緲椤﹤鐣￠幊濠勬嚀椤劑宕熼鐘靛帨闂備礁鎼径鍥晸閼恒儱澧柛姘儔閺屾盯骞囬埡浣割瀳濡炪値鍓欓鍥╂閹惧瓨濯撮柛婵嗗珔閿濆鐓欓柣鐔哄閸犳锟芥鍠涢褔鍩ユ径濞㈢喎顭ㄩ崨顓熺亖缂備浇椴哥敮鎺曠亽闂佸憡绻傜�氼參寮鍫熲拻闁稿本鐟чˇ锕傛煙绾板崬浜伴柟顖氭湰瀵板嫮浠﹂幆褍绨ユ繝鐢靛█濞佳兾涘☉銏犳辈闁挎洖鍊归悡鐔兼煛閸屾氨浠㈤柟顔藉灦閵囧嫰濡烽妷褍顤�缂備胶绮惄顖炵嵁鐎ｎ喗鍊烽柣銏ゆ涧瑜板酣姊绘担鍛婂暈闁绘顨婇幃褔鎮╁顔界稁缂傚倷鐒﹁摫濠殿垱娼欓妴鎺戭潩閻撳海浠梺鍛婃⒒椤牓鈥旈崘顔嘉ч柛鈩冾殘娴犳悂姊洪幖鐐插婵狅拷閸楃倣锝夊箛閻楀牆锟界兘鎮楀☉娅亪顢撻幘缁樷拺闁告稑锕︾紓姘舵煕鎼淬垹绲婚柍缁樻崌楠炲棜顦柡锟芥禒瀣厽闁归偊鍓欑痪褎銇勯妷褍浠遍柡宀�鍠栧畷銊︾節閸愵煉鎷烽幇顕嗘嫹鐟欏嫭绌跨紒鎻掑⒔閹广垹鈹戠�ｎ亞鍊為梺瀹犳〃缁�浣哄緤婵傚憡鈷掑ù锝堫潐閸嬬娀鏌涙惔锝嗘毈閽樼喖鏌熼幆褍顣抽柣顓熺懇閺屻倖鎱ㄩ幇顒婃嫹濡ゅ啫顥氶柣锝呯焿閹风兘鐛崹顔煎闂佺懓鍟跨换妯挎＂闂侀潧绻嗛崜婵嬪矗韫囨挴鏀介柣妯诲絻閺嗙偤鏌曢崶銊х疄闁哄瞼鍠栭、娆撳箚瑜嶉獮瀣旈悩闈涗粶缂佸缍婇妴浣糕枎閹炬潙娈熼梺闈涱槶閸庢煡鎮橀崼鐔虹瘈缁炬澘顦辩壕鍧楁煕鐎ｎ偄鐏寸�规洘鍔欐俊鑸靛緞婵犲嫮鍘梻濠庡亜濞诧妇绮欓幋鐘典笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋涢ˇ鐢稿极瀹ュ绀嬫い鎾跺Х閸橆垶姊绘担鍛婅础闁稿簺鍊濋獮鎰偅閸愨晛浠ч梺鍓插亝濞叉﹢鎮￠弴銏＄厓闁宠桨绀侀弳鐔兼煙閸愬弶鍣归柍钘夘樀楠炴ê鐣烽崶鍡愬灲閺屽秶鎲撮崟顐や紝闂佽鍠掗弲娑㈡偩閻戣棄鐐婇柤绋跨仛椤旀劙姊婚崒娆掑厡缂侇噮鍨堕獮鎰嫚鐟佷焦妞介幃銏ゅ礂閻撳簼绨垫俊鐐�栭崝褏绮婚幋锔藉�峰┑鐘插閸犳劖绻濇繝鍌滃缁炬儳娼￠悡顐﹀炊閵娧�妾ㄩ梺缁樻尰濞茬喖寮婚敓鐘茬＜婵犲灚鍔曞▓顓㈡⒑閸涘﹥鈷愮紒顔芥崌瀵寮撮姀鐘靛�為悷婊冪Ч椤㈡棃顢橀悢缈犵盎闂侀潧绻嗛崜婵堢矆鐎ｎ亖鏀芥い鏇炴鐎氬綊姊绘担鍝勪缓闁稿孩娼欓埢宥夊即閵忊�筹拷鍫曞箹閹碱厽绶氱紒璇叉閺屾洟宕煎┑鍥ㄦ倷闁哥喐鎮傚铏圭矙濞嗘儳鍓遍梺鐑╂櫓閸ㄥ爼濡存笟锟藉浠嬵敇閻愯尙鐛╅梻浣筋潐椤旀牠宕伴弴銏″殝妞ゅ繐鐗婇埛鎺楁煕鐏炲墽鎳嗛柛蹇撴湰閵囧嫰顢橀悙闈涒叡闂佺懓绠嶉崹纭呯亙闂佸憡渚楅崢楣冩晬濞戙垺鈷戦柛锔诲幖椤ｅ吋绻濋姀鈭额亝鏅ラ梺鍝勮閸庢煡鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�
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


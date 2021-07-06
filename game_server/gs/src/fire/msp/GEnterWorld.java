
package fire.msp;


import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.God;
import fire.pb.scene.movable.Role;
import fire.pb.scene.movable.SceneTeam;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GEnterWorld__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GEnterWorld extends __GEnterWorld__ {
	@Override
	protected void process() {
		
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(null == role)
		{
			role = God.createRole(roleid, rolename, level, schoolid, mapinfo, laststaticmapinfo, 0 != protect, 0, 0);
			if (null == role)
				return;

			role.init(showpet);
			role.init(mode);
			role.init(title);
			role.init(components);
			role.setSceneState(scenestate);
			role.setLastStaticMapInfo(laststaticmapinfo);
			role.setMaxShowNum(this.showrolenum);
			role.setEquipEffect(equipeffect);
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涘┑鍕姢濞戞挸绉归弻鈥愁吋鎼粹�崇闂佺粯鎸诲ú姗�濡甸崟顖氱疀闁告挷鑳惰摫缂傚倷绶ら幏鐑芥煥閻旂儤娅曠紒杈ㄥ浮閹瑩顢楅敓浠嬪礉閵堝棛绠剧痪顓㈩棑缁★拷閻庢鍠楀Σ鎺椝囬崜浣虹＜闁绘ê纾ú鎾煛娴ｇ懓濮嶇�规洏鍔戦、妤呭磼濮橆剚鐦撻梻鍌氬�搁崐椋庣矆娓氾拷楠炲鏁撻悩鍐蹭画闂侀潧锛忛崟顐㈢哎婵犵妲呴崹顖滄媰閿曪拷椤洭寮借閺�浠嬫煟濡櫣鏋冨瑙勶耿濮婃椽宕￠悙鏉戞灎闂佸搫鐭夌紞浣割嚕椤掑嫬鍨傛い鏂垮建閳哄懏鈷戦柛婵嗗閸庢劙鏌ｉ悢鍙夋珔妞ゎ偄绻愮叅妞ゅ繐瀚ˇ褔姊虹粙璺ㄧ闁稿鍔欏畷娆撴晸閻樻枼鎷洪柣鐘叉穿鐏忔瑧绮婚懠顒傜＜閻犲洩灏欐晶鏇㈡煥閺囨ê鐏紒妤冨枛閺佹捇鎸婃径妯荤稁濠电偛妯婃禍婊呯不娴兼潙绠归弶鍫濆⒔閹ジ鏌ｉ敐鍥ㄦ毈婵﹨娅ｇ槐鎺戭潨閸℃鏆ラ梻浣瑰濞诧附绂嶉鍫澪ュ〒姘炬嫹鐎殿噮鍣ｅ畷濂告偄閾氬倹鐫忕紓鍌氬�搁崐鐑芥倿閿曞倵锟斤箓宕堕锟介崒銊╂煢濡警妯堟繛鎾愁煼閺屾洟宕煎┑鍥舵！闁诲繐绻掗弫濠氬蓟濞戞瑦鍎熼柕蹇曞Т椤矂鏌ф导娆戠М闁哄被鍔戦幃銏ゅ礈娴ｈ櫣鍘繝娈垮枛閿曘儱顪冮挊澶屾殾妞ゆ劧绠戠粈瀣亜閺囩偞鍣洪柦鎴濐樀濮婄粯鎷呮笟顖滃姼闂佹寧娲忛崕鐢稿箖瑜旈幃鈺呮嚒閵堝懐銈﹂梻浣稿閸嬩線宕曟潏銊ュ姅闂傚倷绀侀悿鍥ь浖閵娾晜鍤勯柛顐ｆ礃閸嬵亪鏌ㄩ悢璇残撳ǎ鍥э躬閹瑩顢旈崟鑸靛闁哄稁鍋呴弳婊堟煙閻戞﹩娈曢柡鍛箞閺屾洘绔熼姘毙ｉ悗姘愁潐閹便劌顫滈崱妤�顫紓浣割槹濡炰粙寮婚垾宕囨殕閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�闁绘牕銈稿畷娲焺閸愨晛顎撻梻浣哥仢椤戝洤顭囬弽顓熲拻闁稿本鐟чˇ锕傛煙绾板崬浜版い銏＄墵瀹曞崬顪冮姀锛勬创鐎规洘锕㈤、娆撴嚌閻楀牊鍟洪梻鍌欑劍鐎笛呮崲閸岀偛绠熸慨妤嬫嫹闁诡喓鍨藉畷妤呮偂鎼淬垻鏆熼梻鍌欑閻ゅ洤顩奸妸鈺傚殑闁割偅娲﹂弫鍐ㄢ攽閸屾碍鍟為柍閿嬪笒闇夐柨婵嗙墛椤忕娀鎮介娑氭创闁哄瞼鍠撶划娆忊枎閸撗冩倯闂備浇顕栭崰姘跺礂濮楋拷瀹曟椽鏁撻悩鎻掔獩濡炪倖鎸撮崜婵嬪箟閻楀牏绡�闁汇垽娼ф禒锕傛煕閵娧冩灈妤犵偛锕畷鍫曨敆娴ｈ顏熼梻浣告惈閸婂爼宕愬Δ鍛仼闁割煈鍋掑▓浠嬫煟閹邦剚鈻曢柛搴＄箻閺屽秶鎲撮崟顐や紝閻庤娲忛崝鎴濐嚕閸撲焦宕夐柕濞垮劚鍟搁梻鍌氬�搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢幘鑼槮闁搞劍绻冮妵鍕冀閵娧呯厑闂佸搫妫欑划鎾诲蓟閿濆妫橀柟绋块閺嗗牓姊洪崨濠勬噧缂佺粯锕㈠濠氬即閵忕娀鍞跺┑鐘茬仛閸旀牜鐟ф繝纰樺墲椤ㄥ懘骞婂Ο渚綎婵炲樊浜滃婵嗏攽閻樻彃鏆欐い锔规櫊濮婃椽骞栭悙鎻掝瀴婵犮垻鎳撳Λ娑㈠礆閹烘梻纾兼俊顖濆亹閻﹀牆鈹戦鏂や緵闁告ê銈搁弫鎾绘寠婢跺奔绮电紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛鈩冩礈濡垱淇婇悙顏勶拷鏇犳崲閹扮増鍋嬪┑鐘叉搐閻ら箖鏌熼梻瀵稿妽闁绘挾濞�閺岀喖顢橀悢椋庣懆闂佸憡姊归懝楣冨煘閹达富鏁婇柤娴嬫暕瑜旈弻锛勪沪闂堚晜瀚圭�规洖娲﹀▓鏇㈡⒑鐠恒劌鏋嶇紒顔界懃閻ｉ攱瀵奸弶鎴濆敤濡炪倖鎸荤划锝夊箯闁垮濯寸紒顖涙礃椤秴鈹戦绛嬫當婵☆偅鐟╁畷鎾绘濞戣鲸瀵岄梺闈涚墕濡绮崒鐐寸厽闁硅櫣鍋熼悾鍨亜閵忥紕鎳囨鐐村笒铻栧ù锝呮惈楠炴姊洪悷鏉挎倯闁伙綆浜畷鎰板Χ閸滀胶鍔烽梺褰掑亰閸樺墽绮绘ィ鍐╃厱婵炲棗娴氬Σ娲煟椤撶喎绗ч柨鐔凤拷鐕佹綈婵炲弶鍨垮畷锟犲礃瀹割喖娈ㄦ繛瀵稿Т椤戞劙寮崶銊х瘈濠电姴鍟慨鍫ユ倵濮樿鲸鍤�闂囧鏌ㄥ┑鍡欏闁跨喐鍨濈划娆忣嚕椤曪拷瀹曠厧鈹戦崱娆戝春濠碉紕鍋戦崐鏍涙担瑙勫弿闁靛牆顦介弫鍌炴煟閺傝法娈遍柡锟芥禒瀣厽闁归偊鍓氶埢鏇㈡煕閵堝洤鏋庨柍瑙勫灴椤㈡瑩鎳為妷銉ユ敪婵＄偑鍊戦崹娲偋閻樿尙鏆﹂柕濞炬櫓閺佸秵绻濇繝鍌涘櫧闁告柨鐖煎缁樻媴缁嬫妫岄梺绋款儏閹虫劕鈻庨姀銈嗗仾妞ゆ牗眉濮规姊洪崷顓炲妺闁圭鎲＄粋宥呂旈崨顔惧幍闂佺厧婀辨晶妤勩亹瑜忕槐鎺楀蓟閵壯呮毇濡ょ姷鍋涢ˇ鎵紦娴犲宸濆┑鐐靛亾鐎氳偐绱撻崒姘拷鐑芥倿閿曚焦鎳岄梺璇茬箰缁绘帗鏅跺Δ鍐╁床婵炴垯鍨洪崵鎴炪亜閹虹偞瀚归梺鍝勵儐缁嬫捇鏁撻懞銉晱闁哥姵鐗犻垾锕傛煥鐎ｂ晝绠氶梺褰掓？缁�渚�鎮″☉銏＄厱閻忕偛澧介悡顖滅磼閵娿倗鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ闂備礁鎼悧婊堝礈濞戞艾鍨濇繛鍡樻尭缁狅綁鏌ㄩ弮鍌滃笡闁哄懏绮撳铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝嗙節濮橆厼浜滈梺绋跨箰閻ㄧ兘骞忔繝姘厽閹艰揪绲鹃弳鈺傘亜椤撶偟澧涘ǎ鍥э攻缁傛帞锟斤綆鍋�閹锋椽姊洪崨濠勭畵閻庢凹鍙冨畷鎶芥惞閸︻厾锛滈柣鐘叉穿鐏忔瑦鏅堕敂鎾呮嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐婵炶揪绲块…鍫㈢矈椤曪拷濮婄粯鎷呴搹鐟扮闂佸憡姊归敃銏ゃ�佸顒夌叆闁割偅绻勯鍡涙⒑缂佹ê鐏辨俊顐㈠缁鎮烽幊濠傜秺閺佹劙宕卞▎鎰晸闁荤偞纰嶇换鍫ュ蓟閿濆鍋勯柛婵勫劤閻撳倹绻濋埛锟介崟鍨暭闂佽桨绶￠崳锝夌嵁閹烘绫嶉柛灞剧懅閻熸繈姊洪懡銈呮瀾闁荤喆鍎抽敓鑺ュ嚬閸犳氨鍒掔紒妯稿亝闁告劏鏅濋崣鍡椻攽閻樼粯娑ф俊顐ｇ箞椤㈡挸螖閿熶粙鈥﹂懗顖ｆ闂佸摜濮甸悧鐘诲春閻愬搫绠ｉ柨鏃傜摂閿熻姤鍔欏铏圭矙濞嗘儳鍓遍梺鍛婃⒐椤ㄥ懎宓勯梺鍦濠㈡绮婚搹顐＄箚闁靛牆鎷戦弨濠氭煛閸涱喚绠炴慨濠冩そ濡啫鈽夊杈╂毎闂備礁婀遍鑼礊閿熻姤銇勯敃锟界紞濠囧蓟閳ュ磭鏆嗛柨鐔剁矙瀹曚即寮介婊愭嫹娴ｇ硶鏋庨柟鐐綑濞堟劙姊洪崘鍙夋儓闁哥儐鍙冩俊鎼佸煛閸屾熬鎷烽悽鍛婂仭婵炲棗绻愰顏勵熆鐠哄搫顏柡灞剧〒閿熸枻缍嗘禍宄邦啅閵夆晜鐓熼柨婵嗘搐閸樻挳鏌熼鍝勭伄闁哥姴锕ュ蹇涘Ω閿旂晫褰嶅┑鐘垫暩閸嬬娀骞撻鍡楃筏闁秆勩仜閿熸枻绠撳畷濂告偄閾忕懓楠勯柣搴＄畭閸庨亶藝娴兼潙鐓曢柟鐑樺殮瑜版帗鏅查柛娑卞枦绾拷婵犵數濯撮幏宄懊归悩宸剱闁绘挻娲熼弻宥嗘姜閹殿噮妲銈呮禋閸橀箖鏁撻崐鐕佹綈婵炲弶鐗滅槐鐐寸節閸ャ儻鎷锋担鑲濇棃宕ㄩ鐙�妲规俊鐐�栭崝鎴﹀磹瑜忓Σ鎰版偨閸涘ň鎷绘繛杈剧秬濡嫭绂嶈ぐ鎺撶厓鐎瑰嫭澹嗘晶锔撅拷瑙勬礃缁矂锝炲┑瀣垫晢闁稿本绋掗鏇㈡⒒娴ｅ憡鍟為柣鐔村劦钘濋弶鍫氭櫇娑撳秴螖閿濆懎鏆為柣鎾寸懇閹鈽夊▎妯煎姺闂佺懓鍟块崯鎾蓟閿濆牏鐤�濠电姴鍟悵鏍磽娴ｄ粙鍝洪悽顖ょ節楠炲啴鍩℃笟鍥ф櫊濡炪倖姊归崕鎶藉箖閹达附鈷掑ù锝呮啞閹牓鏌ｉ锝囨噰鐎规洖宕埢搴ㄥ箣閻愬甯嗛梻鍌氬�烽悞锔撅拷绗涘懏宕查柛宀�鍋涚粻鐘碉拷骞垮劚濞测晜鎱ㄩ幎鑺ュ仯闁搞儯鍔庨妶鎾煛閿熻姤绂掔�ｎ偆鍘介梺褰掑亰閸撴瑧鐥閺屾盯鎮㈢粙鍨懙闂佸搫鏈惄顖涗繆閻戣姤鏅查柛娑卞帣閵娾晜鈷戠憸鐗堝笚閺佽鲸淇婇悙鎵煓鐎殿喖顭烽弫鎰緞鐎ｎ亙姹楅梻浣告啞閻熴儵藝闁单鍥焼瀹ュ棌鎷洪柣鐘充航閸斿矂寮告惔銊︾叆闁绘梻鍎ゅ▍鏇㈡煕閻樺啿濮嶉柟顔炬暬椤㈡棃宕奸悢鍝勫箺闂傚鍋勫ú锕傚箰閻愵剚娅犻柨鏃囧Г閸欏繐鈹戦悩鎻掓殲闁靛洦绻冮〃銉╂倷閺夋垵顫嶉梺璇″灡濡啯鎱ㄩ敓鑺ャ亜椤愵偄鏋ら柛鐘筹耿濮婂宕掑▎鎺戝帯濡炪値鍘奸悧濠囥�冮妷鈺佷紶闁靛鍎哄Λ婊冾渻閵堝棙灏柛銊ユ贡缁牓宕卞☉娆戝幍闂佺粯鍨堕敋闁诲繐绉归弻锛勶拷锝庝邯閸欏嫰鏌″畝锟介崰鏍嵁閸℃凹妲鹃梺鍦櫕婵數鎹㈠☉銏犲窛妞ゆ劑鍨绘导鍫濃攽椤旂》榫氭繛鍜冪秮楠炴垿宕熼姣尖晠鏌曟径娑橆洭鐟滅増宀稿缁樻媴閻戞ê娈岄梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝嗙節濮橆厼浜滈梺绋跨箰閻ㄧ兘骞忔繝姘厽閹艰揪绱曟禒娑㈡煟閳╁啯绀堢紒顕嗙到铻栭柛娑卞枓閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归崐鍨叏濮楀棗浜滅�规挸妫涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佸啿鎼崐鐟扳枍閸ヮ剚鈷掑ù锝堟鐢盯鎷戞潏鈺傚枑闁哄鐏濋弳鐐烘煙娓氬灝濡介柟顖涙閺佹劙宕堕埡瀣棷婵犵數鍋為幐濠氭嚌妤ｅ啯鏅濋柕澹秵瀚规慨姗嗗墰缁夌儤鎱ㄦ繝鍛仩缂侇喗鐟╅獮鎰償閵忊�愁伆缂傚倸鍊风粈渚�顢栭崱娆愭殰闁炽儱纾弳锕傛煥濠靛棛澧㈤柣銈忔嫹闂備礁鎼崐鍛婃櫠閻ｅ瞼涓嶆慨妯垮煐閳锋垿姊婚崼鐔恒�掑褎娲熼弻鐔风暋闁箑鍓堕悗瑙勬礃濞茬喖鐛崶顒佸亱闁割偅绻愰幏鐑藉垂椤愶絽寮垮┑顔筋殔濡鏅堕幍顔剧＜濠㈣泛鑻崝瀣煙娓氬灝濡界紒缁樼箞瀹曘劑顢氶崨顒�鎽嬮梻鍌欑缂嶅﹪藟閹惧绠鹃柨鐔剁矙閺屾盯濡搁敃锟介崝銈夋煟閿濆洤鍘寸�规洖鐖奸弫鍐晸娴犲绠洪悗锝庝簴閺�浠嬫煟濡櫣浠涢柡鍡忔櫊閺屾稓锟斤綆鍋嗗ú鎾煙椤栨碍澶勯悗闈涖偢瀵爼骞嬮悪锟藉Σ鐑芥⒒娴ｄ警鏀伴柟娲讳簽缁骞嬮敃锟介崙鐘层�掑鐐闂佸搫鐬奸崰鏍嵁閹达箑绠涢梻鍫熺♁椤斿嫭绻濈喊妯活潑闁稿鎳橀弫鍐閵堝懓鎽曢梺鍝勬储閸ㄥ綊鏌嬮崶銊х瘈闂傚牊绋掗幖鎰磼閹邦厾娲撮柡灞革拷鎰佸悑闊洦娲滈惁鍫濃攽椤旂》鍔熺紒顕呭灦楠炲繘宕ㄩ弶鎴濈獩婵犵數濮撮崐鐟扳枔濮楋拷濮婄粯鎷呴挊澶婃優闂佸摜濮村Λ婵嗙暦閺囥垹钃熼柕澶涚秶閹风兘宕橀鍢夈劑鏌嶆潪鎷屽厡妞ゆ梹鍔栫换娑欐綇閸撗呅氬銈嗘礃缁捇鐛箛娑欏�婚柤鎭掑劜濞呭洭姊虹粙鎸庢拱婵ǜ鍔戝畷鎰版倷閻戞ê浠┑鐘诧工閸熸壆绮婚懡銈忔嫹濞堝灝鏋熷┑鐐诧工閻ｇ兘宕￠悙鈺傤潔濠电偛妫欓崹鐢哥嵁閸儲鈷掑ù锝呮啞閹牊绻涚仦鍌氱伈鐎规洘绻勬禒锕傛倷椤掍胶褰垮┑鐐差嚟閸樠囨偤閵娾晜鍋傞柡鍥╁枍缁诲棙銇勯弽銊ь暡閻犳劧绻濋弻锝夘敇閻旂儤鍣梺閫涚┒閸斿秶鎹㈠┑瀣闁崇懓銇橀搹搴㈢節绾版ɑ顫婇柛瀣瀹曨垶顢曢敃锟介悡鈥愁熆鐠轰警鍎愮紓宥呮喘閺屽秵娼幍顕呮М婵繂娲濠氬磼濮橆剨鎷烽悜鑺ュ殑闁割偅娲嶉敓鏂ょ畵瀹曞ジ濡烽敂鎯у笌闂備焦瀵х换鍌毼涘☉鈧拷鍛村蓟閵夛妇鍘卞銈嗗姧缁插墽澹曢幖浣圭叆闁绘梻顭堥悘濠勭磼閼镐絻澹樻い鏇秮椤㈡岸鏁撻挊澶屾殾濠靛倸澹婇弫鍐煥濠靛棙顥為柣婵囩矋缁绘繈鎮介棃娑楀摋闂佽妞挎禍鐐差嚗婵犲啰顩烽悗锝庝海琚濋梻浣芥硶閸犳捇寮查銈嗩潟闁圭儤顨呮儫濡炪値鍘介崹闈涒枔椤撶儐娓婚柕鍫濈凹缁ㄥ鏌涢悢椋庢憼濞ｅ洤锕畷濂稿即閻愯尪锟藉灝鈹戞幊閸娧囧箯妞嬪孩鍋橀柤娴嬫櫇绾句粙鏌涚仦鎹愬闁跨喕妫勯幗婊呭垝閺冨牆绾ч柟瀹犳珪缁嬫垼鐏冮梺鍛婁緱閸橀箖宕㈠ú顏呪拺闁革富鍘兼禍楣冩煕閹炬潙鍝洪柟顕嗙節婵＄兘鍩￠崒婊冨箞婵＄偑鍊栭崝鎴﹀磹閺囥垹鍑犻柡鍐ㄧ墛閻撴洘淇婇姘倯闁哄棌鏅濈槐鎺撴綇閵婏箑闉嶉梺鐟板槻閹虫ê鐣烽悜绛嬫晣鐟滃繑瀵奸崶銊ょ箚闁绘劦浜滈敓濮愬�濆畷鎴﹀礋椤栵拷閸ヮ剚鐒肩�广儱妫欏▍銏ゆ⒑閸忛棿鑸柛搴㈠▕瀹曨垶寮婚妷锔惧幍闂佸憡鍨崐鏍拷姘炬嫹?
		role.clearISee();
		
		role.enterScene();
		SceneTeam team = role.getTeam();
		if(team!=null)
			team.sendTeamInfoToRole(role);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢妶鍥╃＝濞撴艾锕ョ�氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯夸含绾捐棄霉閿濆牊顏犻悽顖涚洴閺岋綁鍩℃繝鍌滀哗闂佷紮绲块崗姗�銆侀弮鍫濋唶婵犻潧鐗滃Σ鐗堜繆閻愵亜锟芥洜鎹㈤幇鏉胯摕濠电姴鍋嗛悡銉╂煕椤愩倕鏆遍柟鐤缁辨帞绱掗姀鐘茬闂佺懓鍟跨换姗�骞冮悽鍓叉晜闁糕剝鐟ч敍婊冾渻閵堝棙顥嗗┑顔哄�楁禍鎼侇敇閵忥紕鍘介梺鎸庣箓椤︿即寮潏鈺冪＜闁惧繗顫夊▍鏇犵磼椤旂晫鎳囩�规洖缍婇、娆撴嚃閳瑰灝浠忛梻鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍嚤濞戞瑦濯撮柟鑲╁剳閹风兘骞掗弴妯规睏闂佸湱鍎ら幐鍛婄閾忓湱纾介柛灞剧懅閸斿秵銇勯鐐村窛鐎殿啫鍥ㄦ櫢濞寸姴顑嗛埛鎴炴叏閻熺増鎼愰柣蹇撳级缁绘稒鎷呴崘鎻掝伀妞も晠鏀辩换婵囩節閸屾凹浠圭紓浣筋嚙濡瑩濡甸崟顖氱疀闁告挷鐒﹂崑褔姊洪悷鏉挎毐婵炲眰鍔戦弫鎾诲磹閻曚焦缍堝┑鐐插级椤洭骞戦姀銈呴唶婵犲灚鍔曞▓銊╂⒑閸︻叀妾搁柛鐘愁殜瀹曟垿骞囬悧鍫㈠幗闂侀潧绻堥崹娲汲閳哄懏鐓涢柛鈩冨姇閸旓附鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷顐﹀Ψ閿旀拝鎷烽灏栨斀闁斥晛鍟ㄦ禒鐘绘煕閺傚潡顎楅柍璇查叄婵拷闁靛牆妫欏▍銏ゆ⒑缂佹◤顏堝疮閹稿海顩叉繝濠傜墛閳锋垹绱掗娑欑濠⒀嗗皺缁辨帞锟斤綆鍋勫ù顕�鏌熼鍡欑瘈闁诡喓鍨藉畷妤呮嚃閳轰礁绠洪梻鍌欑閹碱偊宕愰幖浣瑰�舵繝闈涙焾閿濆鍤掗柕鍫濇川閿涙粓姊洪棃娑辩劸闁稿孩妞介幃锟犲礂闂傚绠氬銈嗗姂閸ㄦ椽宕甸崶銊ｄ簻闁靛繆妲呭▓鏇狅拷鍨緲鐎氼厾鎹㈠┑瀣＜婵°倓绀侀鈺呮⒒閸屾艾锟介绮堟笟锟介獮鏍敃閿旇棄鍓舵繝闈涘�婚…鍫㈢玻濡ゅ懏鐓涚�广儱楠搁獮鏍磼閻樺弶璐￠柟鍙夋倐閹囧醇濠靛懎鍨旈梻浣芥〃缁�渚�宕幘顔艰摕闁哄洢鍨归柋鍥ㄧ節闂堟稒绁╂俊顐ゅ仱濮婃椽骞栭悙鎻掝潊婵＄偞娼欓幉锛勭矚鏉堛劎绡�闁搞儯鍔岄敓浠嬫敱閵囧嫯绠涢幘鎰佷紥闂佸綊顥撻崗姗�鐛�ｎ喗鏅濋柨鐔剁矙瀹曞綊宕掗悙瀵稿幈濠电娀娼уΛ妤呮偟鐎ｎ偆绠鹃柟瀛樼懃閻忊晝绱掗敓浠嬪礃椤旂晫鍘繝鐢靛�崘顭戜痪濡炪倖姊瑰ú鐔奉潖缂佹ɑ濯撮柧蹇曟嚀缁椻�斥攽椤旂》宸ユい顓犲厴瀹曞搫鈽夐姀鐘诲敹闂侀潧顦崕鏌ユ倵椤掑嫭鈷戦柟鑲╁仜閸旀挳鏌涢幘鏉戝摵闁诡噯绻濋幃銏ゆ⒐閹邦喚鐣炬俊鐐�栭悧妤冩崲閸愵噮鏁傞柣妯款梿瑜版帗鍋愮�规洖娲犲銊х磽娴ｈ櫣甯涢柣鈺婂灠閻ｉ攱绺介崨濠備簻闂佺鍋愰崑姗�鎼规惔銏㈢瘈婵炲牆鐏濋弸娑㈡煥閺囨ê锟芥繈鍨鹃敃锟介悾锟犲箥椤旇姤顔曢梻浣告贡閸庛倝宕归悢鐓庡嚑閹兼番鍔嶉悡娆撴倵濞戞瑯鐒界紒鐘虫尰閵囧嫰顢楅敓浠嬎囬棃娑辨綎缂備焦蓱婵挳鎮峰▎蹇擃仴濞寸姍鍕閻庢稒顭囬惌瀣磼椤斿吋鎹ｆ俊鍙夊姍閹瑧锟介潧鎽滈惁鍫ユ⒑缁嬫寧婀扮紒顔肩Т閳绘捇骞嗚閺�浠嬫煟濡偐甯涙繛鎳峰嫪绻嗘い鎰剁悼濞插锟芥鍠楁繛濠傜暦閸楃偐妲堟繛鍡樺灥瀵娊姊绘担铏瑰笡闁哄被鍔嶉弲鑸垫償閵婏箑鍓瑰┑鐐叉閹稿鎮″☉妯忓綊鏁愰崼顐ｇ秷閻庤娲栭惌鍌炲蓟閻旈鏆﹂柛銉戝倹顫曞┑鐘殿暜缁辨洟寮绘径鎯点劍绗熼敓浠嬪蓟閿熺姴骞㈤煫鍥ュ劜鐎氬綊鏌￠崒妯哄姕闁哄偊鎷烽梻鍌欒兌缁垶鏁冮埡鍛獥闁哄稁鍘介崐鑸点亜韫囨挾澧涢柣鎾卞劜閹便劌螣鐠囧弶鏆伴梺鍦厴椤ユ捇骞夐幘顔肩妞ゆ帪鎷风痪鏉跨Ч閺岋絾鎯旈姀銏╂殹濠电姰鍨洪敃銏ゆ晲閻愬墎鐤�闁瑰彞鐒﹀浠嬨�侀弮鍫濈妞ゆ挆鍐╂毆闂傚倷鑳堕幊鎾诲触鐎ｎ喗鍋╂い蹇撶墕閺勩儵鏌涢弴銊ヤ航婵炲吋鐗犻弻娑⑩�﹂幋婵囩亐闂佺尨鎷峰ù鐘差儐閻撳啴鏌﹀Ο渚Ч妞ゃ儲绮岄湁婵犲﹤瀚惌鎺楁煙椤旂瓔娈旀い顐ｇ箞椤㈡洟濮�閻樼偣鍋栭梻鍌欑窔濞佳兾涢弮鍌滅焼濞撴熬鎷烽柨婵堝仜閳规垹锟斤絽鐏氶弲锝夋⒑缂佹ɑ顥嗘繛鍜冪秬閸婃挳姊婚崒姘拷椋庣矆娓氾拷瀹曨垶宕稿Δ锟界粻瑙勩亜閹拌泛鐦滈柡浣稿閺屾盯鍩勯崘顏呭殏闂佺懓鍢查崲鏌ワ綖濠靛绠涘ù锝呮贡缁夐攱淇婇悙顏勶拷鎴﹀礉婵犲洤纾块柣銏㈩焾缁犳牗绻涢崱妯诲鞍闁搞倖鍨堕妵鍕箣閿濆懎濮峰┑锛勫亾閹倸顫忕紒妯诲闁告稑锕ら弳鍫濃攽椤旂》鍔熼柟铏崌閹儳鈹戠�ｎ亞顔愭繛杈剧到閹芥粓鎮鹃崫鍕ㄦ斀閹烘娊宕愯楠炲繘鏌ㄧ�ｃ劋绨诲銈嗗姧缁茶法绮婚悙瀛樺弿濠电姴鎳庨崥褰掓煥閻斿墎鐭欐繛浣冲洤绠熼柨鐔哄Т閻ゆ儳鈹戦崒姘暈闁抽攱甯掗湁闁挎繂娲ら崝瀣煕閵堝繑瀚圭紓鍌氬�烽懗鑸垫叏鐎靛摜鐭撻柣鐔稿閺嗭妇鎲搁悧鍫濈瑲閻庣數濮撮…璺ㄦ崉閻戞ɑ鎷卞┑鐐茬墦缁犳牕顫忓ú顏勫窛濠电姴瀛╅悾濂告⒑缁嬫鍎愰柛鏃�娲栧畵鍕⒑閸撴彃浜為柛鐘虫尵缁粯銈ｉ崘鈺冨幈闂佹枼鏅涢崢楣冾敂閸喎锟藉爼鏌曟径娑樼槣婵炲牅绮欓弻锝夊箛椤栨氨姣㈤柡浣哥墕閳规垿顢欑涵宄板缂備緡鍣崹鍫曠嵁韫囨稑宸濋悗娑櫭▓鐔兼⒑闂堟冻绱″〒姘攻鐎氱懓鈹戦悩鍙夊闁抽攱鍨垮濠氬醇濮橆厽鐝栫紓浣割槸婢у海妲愰幒妤佸亹闁惧浚鍋勭壕鎶芥⒑缂佹ü绶遍柛鐘崇〒缁鈽夊Ο閿嬵潔濠电偛妫欓崝鏍敂閻斿吋鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷?
		role.setBattleReplayStateAndBroacast(false);
		RoleManager.getInstance().addRoleToSchool(roleid, schoolid);
		RoleManager.getInstance().addRoleToCamp(roleid, 0);
		SceneClient.pSend(new MEnterScene(roleid,role.getScene().getSceneID(),role.getPos().getX(),role.getPos().getY()));
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720897;

	public int getType() {
		return 720897;
	}

	public long roleid;
	public int level;
	public java.lang.String rolename;
	public fire.msp.RoleMapInfo mapinfo;
	public fire.msp.RoleMapInfo laststaticmapinfo;
	public int protect;
	public int schoolid;
	public java.util.HashMap<Byte,Integer> components; // 角色换装信息key值参考SpriteComponents的枚举
	public fire.msp.modeinfo mode;
	public fire.msp.showpetinfo showpet;
	public fire.msp.showtitleinfo title;
	public int scenestate;
	public int showrolenum;
	public int equipeffect;

	public GEnterWorld() {
		rolename = "";
		mapinfo = new fire.msp.RoleMapInfo();
		laststaticmapinfo = new fire.msp.RoleMapInfo();
		components = new java.util.HashMap<Byte,Integer>();
		mode = new fire.msp.modeinfo();
		showpet = new fire.msp.showpetinfo();
		title = new fire.msp.showtitleinfo();
	}

	public GEnterWorld(long _roleid_, int _level_, java.lang.String _rolename_, fire.msp.RoleMapInfo _mapinfo_, fire.msp.RoleMapInfo _laststaticmapinfo_, int _protect_, int _schoolid_, java.util.HashMap<Byte,Integer> _components_, fire.msp.modeinfo _mode_, fire.msp.showpetinfo _showpet_, fire.msp.showtitleinfo _title_, int _scenestate_, int _showrolenum_, int _equipeffect_) {
		this.roleid = _roleid_;
		this.level = _level_;
		this.rolename = _rolename_;
		this.mapinfo = _mapinfo_;
		this.laststaticmapinfo = _laststaticmapinfo_;
		this.protect = _protect_;
		this.schoolid = _schoolid_;
		this.components = _components_;
		this.mode = _mode_;
		this.showpet = _showpet_;
		this.title = _title_;
		this.scenestate = _scenestate_;
		this.showrolenum = _showrolenum_;
		this.equipeffect = _equipeffect_;
	}

	public final boolean _validator_() {
		if (!mapinfo._validator_()) return false;
		if (!laststaticmapinfo._validator_()) return false;
		if (!mode._validator_()) return false;
		if (!showpet._validator_()) return false;
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(level);
		_os_.marshal(rolename, "UTF-16LE");
		_os_.marshal(mapinfo);
		_os_.marshal(laststaticmapinfo);
		_os_.marshal(protect);
		_os_.marshal(schoolid);
		_os_.compact_uint32(components.size());
		for (java.util.Map.Entry<Byte, Integer> _e_ : components.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		_os_.marshal(mode);
		_os_.marshal(showpet);
		_os_.marshal(title);
		_os_.marshal(scenestate);
		_os_.marshal(showrolenum);
		_os_.marshal(equipeffect);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		level = _os_.unmarshal_int();
		rolename = _os_.unmarshal_String("UTF-16LE");
		mapinfo.unmarshal(_os_);
		laststaticmapinfo.unmarshal(_os_);
		protect = _os_.unmarshal_int();
		schoolid = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			byte _k_;
			_k_ = _os_.unmarshal_byte();
			int _v_;
			_v_ = _os_.unmarshal_int();
			components.put(_k_, _v_);
		}
		mode.unmarshal(_os_);
		showpet.unmarshal(_os_);
		title.unmarshal(_os_);
		scenestate = _os_.unmarshal_int();
		showrolenum = _os_.unmarshal_int();
		equipeffect = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GEnterWorld) {
			GEnterWorld _o_ = (GEnterWorld)_o1_;
			if (roleid != _o_.roleid) return false;
			if (level != _o_.level) return false;
			if (!rolename.equals(_o_.rolename)) return false;
			if (!mapinfo.equals(_o_.mapinfo)) return false;
			if (!laststaticmapinfo.equals(_o_.laststaticmapinfo)) return false;
			if (protect != _o_.protect) return false;
			if (schoolid != _o_.schoolid) return false;
			if (!components.equals(_o_.components)) return false;
			if (!mode.equals(_o_.mode)) return false;
			if (!showpet.equals(_o_.showpet)) return false;
			if (!title.equals(_o_.title)) return false;
			if (scenestate != _o_.scenestate) return false;
			if (showrolenum != _o_.showrolenum) return false;
			if (equipeffect != _o_.equipeffect) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += level;
		_h_ += rolename.hashCode();
		_h_ += mapinfo.hashCode();
		_h_ += laststaticmapinfo.hashCode();
		_h_ += protect;
		_h_ += schoolid;
		_h_ += components.hashCode();
		_h_ += mode.hashCode();
		_h_ += showpet.hashCode();
		_h_ += title.hashCode();
		_h_ += scenestate;
		_h_ += showrolenum;
		_h_ += equipeffect;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(level).append(",");
		_sb_.append("T").append(rolename.length()).append(",");
		_sb_.append(mapinfo).append(",");
		_sb_.append(laststaticmapinfo).append(",");
		_sb_.append(protect).append(",");
		_sb_.append(schoolid).append(",");
		_sb_.append(components).append(",");
		_sb_.append(mode).append(",");
		_sb_.append(showpet).append(",");
		_sb_.append(title).append(",");
		_sb_.append(scenestate).append(",");
		_sb_.append(showrolenum).append(",");
		_sb_.append(equipeffect).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


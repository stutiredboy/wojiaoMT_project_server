
package fire.pb.battle.livedie;

import fire.pb.PropRole;
import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptLiveDieBattleFirst__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptLiveDieBattleFirst extends __CAcceptLiveDieBattleFirst__ {
	@Override
	protected void process() {
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑夊鐑樻姜閹殿喖濡介梺鍛婃⒐閻熴儵鎮鹃悜钘壩╅柍鍝勶攻閺咃綁鎮峰鍐闁轰焦鎹囬幃鍓т沪閽樺绠ｆ繝娈垮枛閿曪妇鍒掗鐐茬闁告稒娼欐导鐘绘煏婢舵ê鐏ｇ紒锟芥繝鍕＝闁稿本鐟х拹浼存煕閿濆骸娅嶇�规洖缍婇獮蹇撶暆閿熻姤绂嶉柆宥嗏拻濞达絽鎲￠崯鐐烘煕閺冩挾鐣电�规洑鍗冲浠嬵敃閵堝嫮鐟濋梻浣告惈缁夋煡宕濈�ｎ剚宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸℃ǜ浠㈤梺鍝勭焿缁绘繂鐣烽妸鈺婃晩闁诡垎鍐摋濠德板�楁慨鐑藉磻閻愮儤鍋嬫繝濠傜墕缁�鍡涙煙閻戞﹩娈曢柛搴＄焸閺屾稑鈽夊鍫濅紣濡炪倕绻愰悥鐓庮潖濞差亝鍤冮柍鍦亾鐎氭盯姊洪崨濠冨鞍缂佸鍨块崺銏ゅ籍閸繈鏁滃┑掳鍊撶拋鏌ュ箯婵犳碍鈷戠紒瀣濠�浼存煟閻曞倸顩紒顔硷躬閹囧醇濞戞鐩庨梻浣告惈濞层倕螞濡ゅ懎绠犻煫鍥ㄦ尵閺嗭箓鏌＄仦璇插姕闁绘挻鐟╅幃妤呮偨濞堣法鍔搁柛鐔告倐濮婂搫煤鐠囨彃绠洪梺鑽ゅ暱閺呯姴顕ｆ繝姘亜闁告稑锕︾粔鍫曟⒑閸涘﹥瀵欓柛娑卞枟椤斿繘姊婚崒娆掑厡缂侇噮鍨堕獮鎰板箻椤旇姤娅㈤梺鍏间航閸庤鲸鏅堕鐐寸厽闁哄倹瀵чˉ銏ゆ煛鐏炶锟芥繈鐛弽銊﹀閻熸瑥瀚伴弫顏勨攽閻樻剚鍟忛柛鐘崇墪鐓ら柕濞у嫷娼熼梺鍦劋椤ㄥ繘寮崘顔界厪闊洤锕ラ崵鏇犳喐閺冨牆钃熼柍銉ョ－閺嗗棝鏌ㄩ悢鍓佺煓鐎规洑鍗冲浠嬵敇閻愮數鏆繝鐢靛仜濡瑩骞栭埡鍛瀬闁糕剝绋掗悡銉╂煟閺冨浂鍤欑悮姘舵⒑閸濆嫭鍣归柣鏍с偢閵嗕礁鈽夊Ο閿嬵潔濠殿喗锕㈢涵鎼佸疮鎼淬劍鐓熼幖杈剧稻閸わ拷婵犮垻鎳撻敃顏勭暦娴兼潙鍐�妞ゆ挾濮寸粊锕傛⒑閸濆嫮鈻夐柛妯圭矙閹繝宕橀钘変画濠电偛妫楃换鎰邦敂閳哄懏鐓熼煫鍥ㄦ⒐鐏忥箓鏌″畝锟介崰鏍�佸▎鎾村仼閻忕偞鍎冲▍姘舵⒒娴ｇ儤鍤�缁剧虎鍘界换娑㈡晸閼恒儯浜滈柕蹇婃濞堟粓鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ到鐎氼噣宕楀锟藉顐﹀箻鐎靛壊娴勯柣搴秵閸嬶拷闁归绮换娑欐綇閸撗呅氬銈庡亜椤﹂潧鐣烽幋锔藉亹缂備焦顭囬崢閬嶆⒑閸濆嫬锟藉湱锟界瑳鍐胯�垮ù鐓庣摠閻撴盯鏌涘☉娆愮凡闁绘挻鍔欓弻鐔碱敍濞戞瑯妫冮梺杞扮劍閸旀瑥鐣烽妸鈺婃晣闁绘ê宕弸鍫ユ⒒閸屾瑦绁版い鏇嗗洤绀勯柣锝呯灱缁�濠囨煕閳╁喚鐒芥い鈺傜叀閺屾盯顢曢敐鍡欘槬闁荤喐鐟辩粻鎾诲箖濡ゅ懏鏅查幖瀛樼箖閸犳岸姊虹紒妯荤叆婵☆偅绻堥獮鍐喆閸曨剙顫￠梺鐟板槻閻牓宕濋崨瀛樷拺缂佸娼￠妤冪磼缂佹﹫鑰跨�殿喖顭锋俊鎼佸煛閸屾矮绨婚梻浣虹帛閸ㄦ儼鎽梺缁樼箥娴滅偟妲愰幘瀵哥懝闁搞儜鍕蒋闂備焦鎮堕崝蹇旂椤掑倸鍨濇慨姗嗗幗缂嶅洭鏌曟繛褍鎳愬Σ鍥⒒娴ｈ鍋犻柛搴㈡尦瀹曟椽寮介鐐垫煣濡炪倖甯幏鐑芥煃鐟欏嫬鐏撮柟顔界懇瀵爼骞嬮悩杈敇濠碉紕鍋戦崐鎴﹀礉鐏炶娇娑樷攽閸℃瑦娈鹃梺鍝勵槹椤戞瑥顭囬埡鍛厾闁告縿鍎洪弳顖炴煙闁垮銇濇慨濠冩そ瀹曠兘顢樿閸旀悂鏌ｆ惔銏⑩枔闁哄懏绻勯崚鎺楀醇閵夛附娅㈡繛瀵稿Т椤戝棝鍩涢幋鐘电＜閻庯綆浜滈惃锛勶拷瑙勬偠閸庡磭妲愰幘鎰佸悑闁告粌鍟抽崥顐⑽旈悩闈涗粶闁哥喐鎸冲顐﹀箻缂佹ê浜归梺鍦帛鐢帞绮婇锟藉缁樻媴閾忕懓绗″┑顔硷工椤兘鍨鹃敃鍌氶唶婵犲灚鍔曞▓銊╂⒑閸撹尙鍘涢柛鐘冲浮瀵劍绂掔�ｎ偆鍘撻梺鑺ッˇ浼此夊鍫熺厽闊洦娲栭埢鍫ユ煛瀹�锟介崰鎾诲窗婵犲洤纭�闁绘劖婢橀弸鍫ユ⒒娴ｈ櫣銆婇柡鍛矒閹嫰顢涘鐓庢濡炪倖娲╅幏椋庯拷瑙勬礀閵堟悂骞冮姀銈呬紶闁告洦鍋嗛鎴︽⒒閸屾艾锟界兘鎮為敂鎾呮嫹缁楁稑鎳忓畷鏌ユ煕瀹�锟介崐娑㈠炊椤掑鏅梺璺ㄥ枍缁瑩鎮伴钘夌窞閻庯絻鍔屾禍婵嬫⒑閸涘﹤濮�闁哄懏绻堝畷銏ゅ箹娴ｇ懓锟界敻鏌ｈ閹诧紕锟芥艾缍婇弻锝嗘償椤栨粎校闂佸憡鎸荤粙鏍箺椤愨懇鏀介幒鎶藉磹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仾闁哄懏绻冮妵鍕疀閹捐泛顣洪梺钘夊暟閸犳劗鎹㈠☉銏犵婵炲棗绻掓禒鑲╃磽娓氬洤浜滅紒澶婄秺瀵濡搁埡鍌氫簻闂佸憡鎸烽懗鍫曟偂閹剧粯鍊甸悷娆忓缁�锟界紓鍌氱Т閿曨亪鐛崘鈺冾浄閻庯綆浜滅粣娑欑節閻㈤潧孝闁稿﹦鍏橀獮鍐晲婢跺鎷绘繛杈剧秬濞咃絿鏁☉銏＄厱闁靛鍎遍幃鎴︽煙娓氬灝濮傚┑陇鍩栧鍕節閸曨剛鍙勯梻鍌欑缂嶅﹤螞閸ф鍊块柨鏇炲�归崑鍌炴煏婢跺棙娅嗛柣鎾跺枛閺岋繝宕堕埡浣风捕闂佽法鍠曞Λ鍕耿闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗?
		Long hostid=xtable.Livedie2key.select(guestid);
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑呴—鍐Χ閸愩劎浠鹃梺鑽ゅ暱閺呯娀鐛崘顔肩労闁告劏鏅涢崝鍛渻閵堝棙鈷愰柛銊︾箓椤繈鏁冮崒娑掓嫽闂佺鏈懝楣冩晸娴犲妫戠紒顔肩墛缁楃喖鏁撴禒瀣祦濠㈣埖鍔栭弲鎼佹煟濡搫鏆卞ù鐙�鍙冨娲濞戣鲸孝闂佸搫鎳忕划鎾愁嚕閹绘巻鏀介悗锝庡亞閸橆亝绻濋姀锝嗙【婵☆偅鐟ラ埢宥夊川椤撗勭闂佸憡绋戦悺銊╁煕閹达附鐓曟繛鎴烇公閺�璇差熆鐠哄搫顏柡灞剧洴婵℃悂濡堕崨顓犮偖闁诲氦顫夊ú姗�鏁冮姀銈呮瀬闁规儳顕々鐑芥倵閿濆骸浜愰柟閿嬫そ濮婂宕掑鍗烆杸婵炴垶鎸鹃幊鎾诲煡婢跺娼╂い鎰剁到婵即姊绘担铏瑰笡闁告棑绠撳畷婊堟晝閸屾氨鏌堥梺鎼炲労閸撴岸鍩涢幒妤佺厱閻忕偞宕樻竟姗�鏌ㄩ悢鐑樻珪闁稿繑锕㈤獮濠偽旈崨顓㈠敹闂佸搫娲﹂〃鎰板箯閻戣姤鏅濋柛灞惧哺閸炲爼姊虹紒妯荤；闁绘帪绠撻、娆撳籍閸啿鎷洪悷婊呭鐢鏁嶉悢鍏肩厽闁硅櫣鍋熼悾鐢碉拷娈垮枟瑜板啴鍩為幋锕�鐐婇柕澶堝�楅惄搴ㄦ⒒婵犲骸浜滄繛璇х畵楠炴劙鎮欓浣圭彿闂佸搫娲㈤崹娲偂閵忋倖鐓曢柟鏉垮悁缁ㄥ鏌＄�ｎ偆娲撮柡宀嬬磿娴狅妇鎷犻幓鎺濇綆闂備浇顕栭崰鎾诲垂閽樺鏆︽い鎰剁畱缁�瀣煙鐎涙鎳冮柣蹇撳级閹便劍绻濋崘鈹夸虎閻庤娲╃换婵嬪箖濞嗘挸绾ч柟鎼幗琚╃紓鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍ㄧ矋瀹曟煡鏌涢锝囩畼闁哄棴濡囬幉鎼佹偋閸繀鍒婇梺杞扮閸熸挳寮婚弴锛勭杸闁哄洨鍎愰敓钘夋湰缁绘盯宕楅崗纰辨濠殿喖锕ュ钘夌暦椤愶箑唯闁靛濡囬敓钘夘煼濮婅櫣娑甸崨顓夋挾绱掗濂割�楅崡閬嶆煙閻楀牊绶茬紒鐘差煼閹綊宕堕鍕闂佹寧绋掔划宀勫煘閹达附鍊烽柛娆忣樈濡繝姊洪幖鐐插闁诲繑纰嶇粚杈ㄧ節閸ャ劌鐧勬繝銏ｅ煐钃遍悗闈涚焸濮婃椽妫冨☉姘暫闂佸摜鍣ラ崑鍛┍婵犲啰闄勯柛娑橈功閸樼敻姊洪幆褎绂嬮柛瀣崌閹虫捇宕稿Δ浣哄幗濠电偞鍨靛畷顒勫几閻旇櫣纾肩紓浣诡焽缁犵偟锟借娲樼敮鈩冧繆閸洖骞㈡俊銈呭暟婢跺嫰姊婚崒姘拷宄懊归崶褉鏋栭柡鍥ュ灩缁愭锟藉箍鍎卞ú銈夊垂濠靛洨绠鹃柛鈩兩戠亸顓犵磼閻樺磭澧棁澶愭煕韫囨挸鎮戦柛搴㈩殜閺屸剝鎷呴棃鈺勫惈闂佸搫鐬奸崰鏍嵁閸℃凹妲奸梺闈╃稻濡炰粙骞冨Δ锟介～婵嬵敆閸屾簽銊╂⒑閸濆嫯顫﹂柛鏂跨焸閸╃偤骞嬮敃锟介獮銏′繆閵堝繑瀚瑰┑顕嗙稻閸旀瑥顫忔ウ瑁や汗闁圭儤绻冮ˉ鏍⒑缁嬭法绠查柨鏇樺灲婵″瓨鎷呴崜鍙夊缓闂佽法鍠嶇划娆撶嵁閸愵喖鐓涢柛娑卞幘閻撴垶绻濋姀锝嗙【濠靛倹妫冮弻鍥敍閻愮补鎷婚梺绋挎湰閻燂妇绮婇悧鍫涗簻闁哄洨鍠撴晶鐢碉拷瑙勬礃濠㈡﹢锝炲┑鍫熷磯闁惧繗顕栧Σ顖涚節绾版ɑ顫婇柛顭戝灣閹峰啴鏁冮崒姘優闂佸搫娲㈤崹娲磻閿濆憘鏃堟晝娓氬﹪鐛滈梺璺ㄥ枑閺嬪骞忛悜鑺モ拺闁告繂瀚烽崕蹇涙⒑鐢喚绉�殿喖顭烽弫鎰緞婵犲嫮鏉搁梻鍌氬�搁悧濠勭矙閹达讣缍栨い蹇撴绾捐棄霉閿濆妫戦悹鎰嵆閺屾盯鏁愯箛鏇炲煂濡炪値鍋勭换鎴犳崲濠靛棭娼╂い鎺戝亰缁卞弶绻濆▓鍨灍闁挎洍鏅犲畷婊堝Ω閳轰胶顔嗛梺缁樺灱婵倝宕愭繝姘厾闁诡厽甯掗崝姘舵煥閻旂粯顥夋繛纭风節瀵濡搁埡浣稿祮闂佺粯鍔橀婊堝箯閻ゎ垬浜归柟鐑樺灩閿涚喖姊洪悷閭﹀殶濠殿喚鏁诲畷浼村箛閻楀牏鍘藉┑掳鍊ч幏鐑芥煟濡わ拷濡稓鍒掗銏犵闁哄啫鍊婚敍婊堟⒑鐠恒劌鏋欏┑顔哄�曢銉╁礋椤愩倖娈曢柣搴秵閸嬪嫰顢旈崼鏇熲拺閻犲楠搁崯顖炲疮閻愮儤鍊垫慨姗嗗墰缁夌儤鎱ㄦ繝鍛仩闁圭懓瀚版俊鎼佸Ψ閿旀拝鎷烽搹鍦＝濞撴艾娲ら弸鐔兼煟閻斿弶娅呮い鏇秮椤㈡洟鏁冮敓鐣岀不閼姐倗纾藉ù锝咁潠椤忓嫧鏋旈柣鏂垮悑閳锋垿姊婚崼鐔剁繁婵℃彃鐖奸弻娑欐償閳ュ疇鍩為悶姘懇閺屾盯顢曢妶鍛亖缂備胶濞�缁犳牠骞冨Δ锟介埥澶娾枎濡厧濮洪梻浣规た閸樺ジ顢栭崶鈺傤潟闁圭儤顨忛弫濠囨煠濞村鏆曠憸蹇涙晸閼恒儺鍟忛柛鐘愁殜閹繝鍩勯崘褏绠氶梺缁樺灱濡嫰鎮″☉銏＄厱閻忕偟铏庡▓鏇㈡倵濮橆兙鍋㈡慨濠冩そ閹筹繝濡堕崨鍜冪到闇夋繝濠忔嫹缂侇喗鐟ラ悾宄扳攽閸粍鍕冮柣鐔哥懕缁查箖鎮楀ú顏呪拺閻熸瑥瀚ˉ瀣熆瑜庨〃濠囧箖閳ユ枼鏋庨柟鎯ь嚟閸橀亶姊洪悷鎵憼闁荤喆鍎甸弫鎾绘嚍閵壯冣拡闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹
		if(hostid==null){
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳挳鎮楀▓鍨灈闁绘牜鍘ч悾鐑芥偂鎼搭喗鍍靛銈嗘尵閸犳捁銇愰崨瀛樷拻濞达綀顫夐崑鐘绘煕閺傝法肖闁瑰箍鍨藉畷姗�顢欓崲澶涚畵閺屾盯寮撮妸銉т哗闂佸憡鍔ч幏閿嬩繆閻愵亜锟芥牠宕濋敃锟介…鍧楁晸閻ｅ瞼纾兼い鏃傚帶椤ｅ磭绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹀┑鐘垫暩婵即宕归悡搴樻灃婵炴垯鍩勯弫鍕煕閺囥劌骞楃�规洘鐓￠弻娑㈠焺閸愵亖妾ㄩ梺缁樻尭缁绘﹢寮诲☉銏╂晝闁挎繂娲ㄩ悾娲⒑闂堚晝绋绘俊鐐扮矙瀵鈽夐姀鈩冩珳闂佹悶鍎崝灞解枔鐏炵瓔娓婚柕鍫濆�瑰▍鍛存煏閸埄鐒鹃柣锝囧厴婵℃悂鍩℃繝鍐╂珝婵犵數鍋為崹鍫曟偡閿曞倸绾ч柛娑橈梗缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら悧鏇綖韫囨哎浜归柟鐑樺灥閸ゆ垹绱撻崒娆戝妽妞ゎ厼娲幃椋庢喆閸曨厾顔曢梺鐟扮摠閻熴儵鎮橀鍫熺厽闁规儳鐡ㄧ粈瀣煟閹垮啫浜扮�规洖鐖兼俊鎼佹晜缂佹﹩妫濋梻鍌欑閸氬鍒婇挊澶嗘灃闁哄洢鍨洪弲鎼佹煠閹帒鍔撮柛鐔风箻閺屾盯鎮╁畷鍥р拰闂佺偨鍎荤粻鎾诲箖濠婂牊瀵犲璺侯儑閿熺瓔鍓熷娲川婵犲倸袝闂佸摜濮甸悧婊勭珶閺囥垹绀傞柤娴嬫櫇椤旀洟姊洪悷閭﹀殶闁稿濮电粩鐔奉潨閿熶粙骞冩禒瀣垫晬婵炴垼椴搁悿浣糕攽椤旂》鍔熺紒顕呭灦楠炲繘宕ㄩ弶鎴滅炊闂侀潧顧�婵″洭鏁撶粵瀣灈闁宠鍨块崺鍕礃閿旇法涓嶉梻浣告啞閺屻劌霉閻戣棄绀嗛柟鐑橆殔闁卞洭鏌ｉ弮鍥仩闁硅櫕绻堝铏规崉閵娿儲鐏嗗┑鈽嗗亜鐎氫即銆佸鑸垫櫜濠㈣泛锕﹂鍛存⒑閸忛棿鑸柛搴ㄤ憾閺佹捇鎮剧仦钘夊箣闂佸搫鐭夌紞浣规叏閿熶粙鏌曡箛濠傚⒉婵絽瀚板娲箰鎼达絺妾ㄧ紓渚囧枟閹告悂锝炶箛娑欐優闁革富鍘鹃敍婊冣攽閳藉棗鐏犳繛瀛樼缁傚秹顢旈崟顓熸濡炪倖鐗楃划宥呯暦婢舵劖鐓忓┑鐐戝啯鍣介柡鍡愬劦閺岋綁鎮㈤崫銉х厐缂備胶绮敮鎺戝祫闂佸湱澧楀妯肩不閹惰姤鐓欓柟顖嗗苯娈剁紓浣割槸閻栫厧顫忓ú顏咁棃婵炴垼浜崣姘辩磽娴ｅ搫校闁搞劌鐏濊灋闁告洦鍋掗崥瀣熆鐠轰警鍎岄柟閿嬫そ濮婃椽鎳￠妶鍛�惧┑鐘灪閿氶崡鍗炩攽閻樺磭顣查柣鎾寸懇閺屟嗙疀閿濆拑鎷风�ｎ噮鏁傞柛顐ゅ枎娴犲ジ姊虹紒妯虹伇濠殿喓鍊濆畷鎰版嚒閵堝洨锛滃┑鐐村灦閿曗晠宕曢幇鐗堢厸闁告粌鍟扮粔顔芥叏婵犲懏顏犵紒杈ㄥ笒铻ｆ繛鑼帛椤ュ牓姊绘担鍝勭殤闁归鍏樺娲敆閿熺晫绮旈悽绋跨；闁绘柨鍚嬮悡銉︾箾閹寸伝顏堫敂椤愩倗妫柛娆嶅劤閻瑩鏌＄仦鍓с�掑ù鐙呯畵楠炴垿骞囬澶嬵棨闂傚倷娴囧▔鏇㈠窗閺囩喐鍙忛柕鍫濐槸缁犳牠鏌涚仦鐐殤闁哄棴绠撻弻鐔兼偋閸喓鍑℃繛纾嬪亹婵烇拷闁哄本娲樼粩鐔碱敍濮橆厼娅ч梺鍛婎焽婵挳鍩為幋锔藉�烽柤鎼佹涧濞懷呯磽娴ｈ棄绱︾紒顔界懃閻ｇ兘顢涢悜鍡樻櫖闂佺粯鍔樼亸娆撴偪閸ヮ剚鍊甸柣褍鎲＄�氬綊姊虹捄銊ユ灁闁哄拋鍋勫嵄闁圭増婢樼粻濠氭偣閸ヮ亜鐨洪柨娑欑矊閳规垿鎮欓崣澶樻！闂佺硶鏅涢悧鍡楀祫濡炪倖姊婚埛鍫濄�掓繝姘厪闁割偅绻冮ˉ婊堟煟韫囧鍔﹂柡宀�鍠栭幖褰掝敃椤愩倕濮兼繝纰樻閸嬪棝宕伴弽褜娼栫紓浣诡焽閻熷綊鏌涢妷鎴濆枤濞艰崵绱撻崒娆戭槮妞わ箓浜跺顐ゆ嫚瀹割喖娈ㄩ梺鍝勮閸庤京绮婚悷鎳婂綊鏁愰崨顔跨闂佸憡蓱閹倸顫忛搹鍦煓闁圭瀛╅幏閬嶆⒑閹稿骸鍝洪柡灞诲姂閹垻鎷犲▓瀣尰閵囧嫰濡搁妷褍鈪遍梺鍛婂笚鐢�愁嚕椤曪拷瀹曞ジ鎮㈤摎鍌滅处闂傚倷绀侀幉锛勭矙閹达附鏅濋柨鏇炲�搁崒銊╂⒑椤掞拷缁夌敻鎮￠悢鐓庣闁圭⒈鍘奸悘锝囩磼婢舵劖娑ч棁澶嬬節婵犲倸顏柣顓熷笚閵囧嫰濮�閳╁喚妫冨銈冨灪閿曘垺鎱ㄩ敓浠嬫煥濞戞ê顏╂鐐茬У娣囧﹪鎮欓鍕舵嫹閺嵮屾綎濠电姵纰嶉崑鍌涖亜閹拌泛鐦滈柡浣稿�块弻娑㈩敃閿濆洨鐣奸梺鍛婄懕閹烽攱绻濋悽闈浶為柛銊у帶閳绘柨鈽夊鍛�曢梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠楅崑鍌炴煏婢跺棙娅嗛柛濠勬暬閺屻劌鈹戦崱妯烘婵炲濮电粙鎾舵閹炬剚鍚嬮柛娑卞灣閸旑垰鈹戦纭峰伐妞ゎ厼鍢查悾鐑藉箳閹存梹鐎婚梺瑙勬儗閸樺�熲叺闂傚倸鍊风粈浣革耿闁秴鐓曢柛顐犲劚绾捐鈹戦悩鎻掞拷濠氬汲閿斿浜滈柡宥庡亜閸撻亶鏌℃担鍝バч柡宀嬬秮楠炲洭顢涘杈嚄婵＄偑鍊栭弻銊ッ洪鐑嗘綎濡わ箒锟ユ禍褰掓煙閻戞ɑ鎯堢紒杈╂暬濮婂宕掑顒変患缂備礁顦紞濠傤嚕椤愶箑绠荤紓浣姑惂鍕節閵忥絾纭炬い鎴濇噹閳绘挸螖閿熶粙鈥旈崘顔嘉ч柛鎰╁妿娴犳儳顪冮妶鍐ㄥ婵☆偅绻堥悰顔跨疀濞戞ê绐涢柣搴㈢♁钃遍柛搴邯閺岋綁鎮╅崣澶岊槺闂佽法鍠庨敓鐣屽枑閻濐亝绻涢崨顕呮疁婵﹤顭峰畷鎺戭潩椤掑﹥瀚瑰瀣捣閻棗霉閿濆懏璐￠柣婵婃硾閳规垿鎮╅崣澶嬫倷缂佺偓鍎抽…鐑藉蓟濞戙垹鐒洪柛鎰典簴濡插牏绱撴担鐟板妞ゃ劌锕悰顕�寮介‖銉ラ叄椤㈡鏁撻懞銉ょ箚濞寸姴顑嗛悡鏇炩攽閻樻彃锟藉宕洪敐澶嬬厸閻忕偠顕ф慨鍌滐拷娈垮櫘閸撶喎鐣疯ぐ鎺濇晩閻熸瑥瀚惁杈╃磽閸屾瑨鍏岄柛瀣崌瀹曟洟骞庨挊澹┭囨煙闂傚顦﹂柦鍐枑缁绘盯骞嬮悜鍡欏姺闂佸搫妫楀Λ婵嬪箖濡ゅ懏鏅查幖绮瑰墲閻忓秴顪冮妶鍛搭�楃紒澶婄秺瀵鏁愰崱妯哄妳闂侀潧绻堥崹褰掑汲閿熺姵鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗?162129
//			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162129, null);
			sendNoFightPlayer(guestid);
			return ;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繐鐖奸弻锝嗘償閵堝孩缍堝┑鐐村絻缁绘ê鐣烽弴銏犵闁兼亽鍎插▍銏ゆ⒑閸濆嫬锟藉爼宕愬Δ鍐煋闁汇垹鎲￠悡鏇㈡煟濡櫣锛嶅褍宕…璺ㄦ喆閸曨剛顦伴悗瑙勬礈椤牐鐏冩繛杈剧到閹碱偊鐛澶嬧拻濞达絿鐡旈崵鍐煕閵娿劍鐝柡鍛版硾铻栭柛姘虫椤︽澘顕ラ崟顖氱疀妞ゆ帒鍋嗛崯鍥⒒娴ｅ憡鎯堟い锔垮嵆瀹曠儤绻濋崶鈺佸絾濡炪倖甯掔�氼參鎮″☉銏″�堕柣鎰邦杺閸ゆ瑩鏌ㄩ悢璇残撴い銊ワ工閻ｇ兘鎮ч崼銏㈢槇闂佹悶鍎滈崪浣规暏闂傚倷鑳剁划顖炲礉閺囩倣鐔哥節閸屻倗鍔烽梺鍏间航閸庢壆鎹㈤崱娑欑厽闁规澘鍚�缁ㄥ鏌ㄩ悢璇残撻柣妤冨Т閻ｅ嘲鈹戠�ｎ亞顔婇梺鍝勫�搁悘婵嬫倶婵犲倵鏀介柣鎰级椤ユ粍绻涚�涙ê鍝虹�规洜鏁诲鎾閿涘嫬骞堟俊鐐�栭崝褏寰婇崜褏鐭嗛柨鐔剁矙濮婄粯鎷呯粙鑳煘濠电偠顕滄俊鍥箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹拠鑼婵＄偞瀵х粋宥夘敂閸繄浼嬮梺鍝勭▉閸嬫捇骞忛悜鑺ユ櫜閹肩补鍓濋悘宥夋⒑閹惰姤鏁遍柛銊ョ秺閺佹捇宕愰悤浣圭秷濠电偛寮堕悧鏇犲弲闂侀潧臎閸曨剚顔囨繝鐢靛仦閸ㄥ爼鎮烽妶鍥ㄥ床闁糕剝菧娴滄粓鏌熼幍铏珔闁诲繆鏅犻弻锟犲幢椤撶姷蓱濡炪們鍔婇崕鐢稿箖濞嗘挸绠甸柟鐑樻尰椤斿嫰姊洪崜褏甯涢柣妤冨█瀵鈽夊Ο閿嬵潔闂佸憡顨堥崑鐐烘倶瀹ュ應鏀介柣鎰级閸ｈ櫣绱掗鑺ュ磳鐎殿喖顭烽幃銏ゅ礂閻撳孩鐣伴梻浣稿暱閹碱偅鍒婄紒妯虹窞闁归偊鍘鹃崣鍡涙⒑缂佹ɑ鐓ラ柛銈嗙墵楠炲繘鎮滈懞銉ヤ簻婵＄偛顑呯�涒晠顢氬Δ鍛拻濞达絽鎼崝锕傛煛閸涱喚娲撮柡灞斤躬閺佹劙宕担鍦▉缂傚倸鍊烽悞锕佹懌婵犳鍨伴顓犳閹烘垟妲堟慨妤�妫楅崜鏉库攽閻愯尙澧遍柛妯哄⒔濡叉劙骞樼�涙ê顎撻梺鎯х箳閹虫挾绮敓鐘斥拺闁硅偐鍋涙俊鍏肩節閿熶粙鏌嗗鍛槴闂佸湱鍎ら崹鐔煎几鎼淬劍鐓欓柟顖嗗拑绱炲銈嗘尰濡炶棄顫忓ú顏勭閹兼番鍨婚埞娑㈡⒑瑜版帩妫戦柛蹇旓耿瀵鏁愭径濠勵啋濡炪倖鐗撻崐鏍拷姘秺閺岀喐锛愭担钘夊帯闂佸摜鍋熼弫璇差潖濞差亜绀傞柛蹇曞帶閿熻姤鍔栫换娑欐媴閸愭彃顏柛娆忕箻閺屾盯濡烽姀鈩冪彇缂佺偓鍎抽崥瀣Φ閸曨垰绠涢柍杞拌兌娴煎嫰鏌℃担鍝ュⅵ婵﹥妞藉畷顐﹀礋椤撶姳绱橀梻浣告憸婵敻鎮ч悩缁樺仒妞ゆ洩鎷风�规洖宕～婵嬪礂婢跺厜鏅滄穱濠囨倷椤忓嫸鎷疯瀵板﹪鎮剧仦绛嬫濡炪倖鎸炬慨鐢革綖閺囥垺鐓欓柣鎴烇供濞堟梻绱掗悩宕団檨闁靛洤瀚伴獮妯何旈敓鐣岋拷姘煎櫍瀵娊鏁傞崜褏锛濋梺绋挎湰閻熴劑宕楀畝锟界槐鎺楊敋閸涱厾浠搁梺璇″灠鐎氫即銆佸☉銏″�烽柛娆忣槺閿熺瓔鍓熷娲捶椤撶儐鏆┑鐘灪閿氭い鏂跨箰閳规垿宕堕妷銈囩泿闂備礁鎼崯顐⒚洪妶鍫毐闂傚倷鑳堕…鍫ユ晝閿曞倸绀傛俊顖欒濞兼牜绱撴担鑲℃垶鍒婇幘顔界厽闁绘梻鍘ф禍浼存煕閵堝拋鍎忛柍瑙勫灴閹瑦锛愬┑鍡樼杺闂傚倸鍊哥�氼剛锟芥凹鍠氶崚鎺旓拷锝庝憾閸氬顭块懜鐬垿寮插鍫熲拺闁告挻褰冩禍鐐烘煕閻樻彃顒㈢紒鍌涘浮楠炴帡骞嬮鐔风槣闂備線娼ч悧鍡椢涘▎鎾崇厱闁圭儤顨嗛悡娑㈡煕濠婏拷缁�浣圭娴煎瓨鐓欐い鏃傚亾閻掑潡鏌曢崶銊ュ妤犵偞甯￠獮妯兼崉閸濆嫭杈堥梻鍌氬�烽懗鍓佸垝椤栫偛钃熼柕濠忛檮濞呯娀骞栧ǎ顒�濡介柛搴㈩殕缁绘盯宕卞Ο璇查瀺闂佺粯鎸哥换姗�寮诲☉銏犵労闁告劏鏅濋ˇ顓烆渻閵堝繗顓虹紒鐘虫崌瀵顓兼径瀣檮婵犮垼鍩栬摫闁宠鐗婄换婵嗏枔閸喗鐝梺褰掝棑閸忔ê顫忛搹鍦＜婵☆垱娲橀崹鍧楀箖閵夆晜鍋愰悹鍥皺閸婄偤姊洪棃娴ゆ盯宕橀妸褏鏉介梻鍌氬�搁崐椋庢濮橆剦鐒界憸鏃囨濡炪倖鎸堕崹褰掑垂閸岀偞鐓曟繝闈涙椤忋倝鏌＄�ｎ亞效闁哄瞼鍠栧畷婊嗩槾缂佲槄鎷风紓鍌欐祰椤曆兾涘┑瀣摕闁靛牆娲ら弸鍫ユ煕濡ゅ啫浠滄い顐熸櫊濮婃椽宕ㄦ繛鎺濅邯閹椽濡搁埡浣虹杽闂侀潧顭俊鍥╁姬閿熶粙姊洪崨濠冨闁告鍋愮划顓㈡晸閻樻枼鎷洪梺鑽ゅ枑濠㈡ê危婵犳碍鐓欓柧蹇ｅ�嬮鍫熷仼闁绘垼妫勬儫闂佹寧鏌ㄦ晶浠嬫儊閸儲鈷戠紒瀣濠�鎵磼鐎ｎ偄娴柟顔惧亾缁轰粙宕ㄦ繛鐐濠电偠鎻徊钘夛耿閸楃儑鑰垮ù鐘差儐閻撴洟鏌嶆潪鎵槮妞ゅ浚鍘鹃敓鍊燁潐濞叉牜绱炴繝鍌ゅ殨閻犺桨缍嶅☉銏犲瀭妞ゆ劧绲绘禒銏狀渻閵堝啫鐏柨鏇樺灲楠炲啫鈻庨幘鍐茬�銈嗗姧缂嶅棝宕惔銊︹拻闁稿本鐟чˇ锔界節閿熻姤娼忛妸锔界彿濠德板�ч幏閿嬨亜椤撶偟浠㈡い顐ｇ矒閺佹捇鎸婃径灞炬濠殿喗顨愰幏鐑芥煛娴ｈ宕岄柟绋匡攻瀵板嫬螣鐠囪尙妲ｉ梻鍌欑窔濞佳囨偋閸℃あ娑樷枎閹存粎鍓ㄩ梺姹囧灩閹诧繝鎮￠弴銏″�甸柨婵嗛婢ь噣鏌嶇拠鑼妞ゃ劊鍎甸幃娆撳箹椤撶喓鏉归柣搴㈩問閸犳骞愰搹顐ｅ弿闁跨喍绮欓弻宥夊箻閸涱喖顏堕梻浣哥秺閺�鍗烆渻閽樺娼栭柧蹇氼潐閸忔粓鏌涘☉鍗炲箳婵顨婂铏圭矙濞嗘儳鍓遍梺鐑╂櫓閸ㄤ即鎮惧畡鎵虫斀閻庯綆浜為鎺戭渻閵堝棙鈷掗柡鍜佸亰瀹曘垽鏌嗗鍡忔嫼闁荤喐鐟ョ�氼剟宕濋妶鍡愪簻闁哄洢鍔屽顔筋殽閻愯韬�规洖鐖奸崺锛勶拷锝庡亜椤忓爼鏌ｉ悢鍝ユ噧閻庢凹鍘剧划姘辨崉閵娧咃紲闂佸湱绮敮鎺楀煕閺冨牊鐓欐鐐茬仢閻忊晠鏌嶇憴鍕仼闁跨喐鏋荤紞鍡樼閻愭牳鍥Ω閳哄倵鎷洪梺鍦焾鐎涒晠藟閸℃绠惧璺侯儐缁�瀣煙椤栨艾顏柟顖涙婵℃悂鏁傜憴鍕伜婵犵數鍋犻幓顏嗗緤娴犲绠熼柨鐔哄Т缁犳岸鏌涢鐘茬伄缁惧墽鍘ч…璺ㄦ崉娓氼垰鍓抽梺鍛婄懕閹风兘鏌ｆ惔銈庢綈婵炲弶顭囬幑銏ゅ礃椤旇偐鐣鹃梺鍝勫暙閻楀棙鍎梻浣瑰缁诲倻鎹㈤幋鐙呮嫹濮橆剛绉洪柡灞剧☉閻ｆ繈鏁撴禒瀣；婵炴垯鍨虹�氬懘鏌ｉ弬鍨倯闁绘挸绻愰…鍧楁嚋閻㈢妲堝銈傛櫓閸撶喖寮诲☉姗嗘建闁跨喕濮ょ粋宥夊醇閺囩偠鎽曢梺缁樻煥閸氬宕甸崘顔界厓闁告繂瀚姘熆鐠轰警鍎庣紒璇叉閺岀喓绱掑Ο铏圭懆濡炪倕娴氶崣鍐蓟閿濆绠奸柛鎰╁妼閳峰顪冮妶鍐ㄧ仾妞ゃ劌锕ら悾鐑藉箳濡や焦娅嗛梺鑺ッˇ鑺ュ閹惧绡�闁汇垽娼ф禒婊堟煟濡わ拷濡繈骞冨Ο琛℃斀閻庯綆浜滈崵鎴濃攽閻愭潙鐏熼柛銊︽そ閹繝鎮㈤崗鑲╁幐閻庤鎼╅崰鏇犵矆娴ｅ湱顩锋い鏇嫹闁诡喗顨堥幉鎾礋椤掑偆妲版繝纰夌磿閸嬫鍒掑▎蹇曟殾婵炲樊浜滅粈瀣亜閺嶃劍鐨戞い锔哄姂濮婅櫣锟藉湱濮甸妴鍐磼鐠佸湱绡�闁轰焦鎹囬幊鐐哄Ψ閿曪拷绾惧啿鈹戦纭锋敾婵＄偘绮欓獮濠囨晸閻樺弬褔鏌涘☉鍗炴灓濞存粠浜缁樻媴娓氼垳鍔稿銈嗗灥閹虫﹢寮崘顔嘉ч柛娑卞幘閵堫偊姊绘担鍛婃儓妞わ富鍨堕幃褔宕熼姘鳖槷闁硅壈鎻徊鑺ユ叏椤掑嫭鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍌涙儓閺佸牓鏌涢妷鎴濇噸缁辨瑦绻濋悽闈涗粧闁告牜濞�瀹曞爼鎳滈崹顐ｇ彅闂傚倷鑳堕幊鎾存櫠閻ｅ苯鍨濇い鏍仦閸嬪倹绻涢崱妤佺婵炴挸顭烽幃妤呮晲鎼存繈鍋楀銈呭椤ㄥ﹪寮诲☉妯滅喓绱掑Ο鍝勬敪闂備礁鎼惌澶屾閺囩喓顩烽柨鏃傚亾鐎氭岸鏌熺紒妯轰刊婵炵厧閰ｅ缁樻媴缁涘娈愰梺鍝ュУ閹瑰洤鐣烽幇顑芥斀闁糕剝鐟﹀▓楣冩⒑閸︻厼鍔嬮柛銊у枎鍗遍柛顐ゅ枑閸欏繑淇婇妶蹇斿濠碘槅鍋呭璇参ｉ幇鐗堟櫢闁跨噦鎷�
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			sendNoFightPlayer(guestid);
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			sendNoFightPlayer(guestid);
			return ;
		}
		SAcceptLiveDieBattleFirst sAcceptLiveDieBattleFirst=new SAcceptLiveDieBattleFirst();
		sAcceptLiveDieBattleFirst.hostroleid=hostid;
		sAcceptLiveDieBattleFirst.hostrolename=new PropRole(hostid,true).getName();;
		Onlines.getInstance().send(guestid, sAcceptLiveDieBattleFirst);
	}
	
	public void sendNoFightPlayer(long guestid){
		SAcceptLiveDieBattleFirst sAcceptLiveDieBattleFirst=new SAcceptLiveDieBattleFirst();
		sAcceptLiveDieBattleFirst.hostroleid=0;
		sAcceptLiveDieBattleFirst.hostrolename="";
		Onlines.getInstance().send(guestid, sAcceptLiveDieBattleFirst);
	}
	
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793848;

	public int getType() {
		return 793848;
	}


	public CAcceptLiveDieBattleFirst() {
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
		if (_o1_ instanceof CAcceptLiveDieBattleFirst) {
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

	public int compareTo(CAcceptLiveDieBattleFirst _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


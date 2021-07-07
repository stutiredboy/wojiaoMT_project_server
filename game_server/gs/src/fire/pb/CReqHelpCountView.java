
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqHelpCountView__ extends mkio.Protocol { }

/** 客户端请求援助统计面板
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqHelpCountView extends __CReqHelpCountView__ {
	@Override
	protected void process() {
		// protocol handle
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SReqHelpCountView sReqHelpCountView=new SReqHelpCountView();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sReqHelpCountView.expvalue=helpcount.getExpvalue();//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖闂佺娅曢幑鍥灳閺冨牆绀冩い蹇撳鐎氬綊鏌ㄥ┑鍡欏嚬缂併劌銈搁弻鐔兼儌閸濄儳袦闂佸搫鐭夌紞渚�銆佸锟介幃娆撳箹椤撶噥妫ч梻鍌氬�稿ú銈壦囬悽绋胯摕闁靛鍎弨浠嬫煕閳╁叐鎴﹀箖濞嗘挻鈷戦柛娑橈攻閻撱儲銇勯幋婵囧枠闁轰焦鎹囧畷鎰版偆娴ｅ湱绉锋繝鐢靛仜瀵爼鎮ч弴銏╂晪闁挎繂顦柋鍥煛閸モ晛浠ч柣銈呭濮婃椽妫冨☉杈╁姼闂佺瀛╅悷鈺侇嚕椤曪拷瀹曟帡鏁傞挊澶樹紦闂備焦瀵х换鍌涱殽閸涘﹦顩叉繝濠傚娴滄粓鐓崶銊﹀暗闁糕晪绲鹃幈銊︾節閸曨厼绗￠梺鐟板槻閹虫劗鍒掗悽纰夋嫹閿濆簼绨奸柣锝勫嵆濮婄粯鎷呴崨濠冨枑婵犳鍣ｅ褏鍙呴梺缁樻椤ユ捇寮抽敃鍌涚叆闁绘柨鎼瓭缂備胶濯崳锝夊蓟閿曪拷铻ｅ〒姘煎灡鏁堥梻浣筋嚙鐎垫帡宕滈悢濂夋綎婵炲樊浜濋崑锟犳煛婢跺﹦姘ㄩ柟绋垮暟缁辨挻绗熼崶褎鐝梺鎼炲姀濞夋盯顢氶敐澶婅摕闁靛鍎抽鎰箾鏉堝墽鍒版繝锟介柆宥呯煑闁糕剝绋掗埛鎴犵磽娴ｈ偂鎴犵矆閿熶粙姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗
			sReqHelpCountView.shengwangvalue=helpcount.getShengwangvalue();//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬪仴鐎殿喖顭烽弫鎰緞鐎ｎ亙绨婚柣搴ｆ嚀鐎氼厽绔熼崱娑欏剮閹兼番鍔嶉埛鎴︽煕韫囨挸鎮戠紒璺哄级缁绘稓浜搁弽鍨闁归绀佸▓銊╂⒑閸撴彃浜濇繛鍙夌墵閺屽宕堕妸褏顔曢梺鐟邦嚟娴兼繈顢旈崼姘炬嫹閺嶃劌绶炲┑鐐靛亾閺傦拷闂備胶绮崝鏇烆嚕閸洖闂柦妯侯槴閺�鑺ャ亜閺冨洤浜瑰ù鐘崇〒缁辨帒鐣濋崘顔兼懙缂備胶绮换鍫濈暦閸洍锟芥牠顢栭锟藉ú銊╁矗閹剧粯鐓曢柕澶涚到婵′粙鏌ｉ幘鍗炲姕闁靛洤瀚粻娑㈠箻鐠鸿櫣鍘芥繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ崑锟犳⒑椤撱劎鐣辨繛鍫熺箖缁绘繈鎮介棃娑楁勃閻熸粍婢橀崯浼村箲閵忕姈鐔兼惞鐟欏嫭顔曢梺鑽ゅ枑閻熴儳锟芥凹鍣ｉ妴鍛存倻閼恒儱锟界敻鏌ㄥ┑鍡欏嚬缂併劌銈搁弻锝嗘償椤旂厧鈷嬪┑顔硷攻濡炰粙骞冮悜钘夌骇閹煎瓨鎸荤�垫牜绱撻崒娆戣窗闁革綆鍣ｅ畷鍦崉娓氼垰娈ㄩ梺鍝勮閸庤京绮婚悷鎳婂綊鏁愰崨顔跨闂佸憡鐟ュΛ婵嗩潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗
			sReqHelpCountView.factionvalue=helpcount.getClanvalue();//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑橆殕閻撴盯鏌涢弴妤佹珔闁告棑绠撻弻锛勪沪閸撗勫垱閻庢鍠楅幐铏繆閹间礁唯鐟滃矂宕Δ鍛拻濞达綀顫夐崑鐘绘煕閺傝法鐒哥�规洘鍔欓獮鏍ㄦ媴閸濄儱骞嬮梻浣侯攰閹活亞绮婚幋鐘差棜闁稿繗鍋愮弧锟芥繝鐢靛Т閸婂綊骞戦敐澶嬬厱闁哄倹瀵ч幉鍝ョ磼鏉堛劍灏伴柟宄版嚇閹兘寮跺▎鐐秾濠碉紕鍋戦崐鎴﹀礉鐏炶娇娑樷槈閵忕姷顔夐梺闈涚箳婵厼危閸儲鐓忛煫鍥ㄦ礀鍟稿銈嗘尰濡炶棄顫忛搹鍦＜婵☆垰鎼～宥咁渻閵堝棙鈷愰柣妤冨Т椤曪綁骞庨懞銉︽闂佺粯蓱閺嬪ジ骞忛搹鍦＝濞达絽澹婇崕鎾寸箾婢跺绀堢紒顔碱煼閹崇娀顢楅崒婊愮床婵＄偑鍊栧Λ浣规叏閵堝懐鏆︾�癸拷閿熶粙鏁撻懞銉晱闁哥姵鐗犻垾锕傛煥鐎ｂ晝绠氶梺褰掓？缁�渚�鎮″☉銏＄厱閻忕偛澧介悡顖滅磼閵娿倗鐭欐慨濠勭帛閹峰懏绗熼婊冨Ъ闂備礁鎼悧婊堝礈濞戞艾鍨濇繛鍡樻尭缁狅綁鏌ㄩ弮鍌滃笡闁哄懏绮撳铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷
			sReqHelpCountView.helpgiveitemnum=helpcount.getHelpgiveitemnum();
			sReqHelpCountView.helpitemnum=helpcount.getHelpitemnum();
		}
		sReqHelpCountView.expvaluemax=fire.pb.HelpCountManage.getInstance().getExpValueMax(roleid);//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖闂佺娅曢幑鍥灳閺冨牆绀冩い蹇撳鐎氬綊鏌ㄥ┑鍡欏嚬缂併劌銈搁弻鐔兼儌閸濄儳袦闂佸搫鐭夌紞渚�銆佸锟介幃娆撳箹椤撶噥妫ч梻鍌氬�稿ú銈壦囬悽绋胯摕闁靛鍎弨浠嬫煕閳╁叐鎴﹀箖濞嗘挻鈷戦柛娑橈攻閻撱儲銇勯幋婵囧枠闁轰焦鎹囧畷鎰版偆娴ｅ湱绉锋繝鐢靛仜瀵爼鎮ч弴銏╂晪闁挎繂顦柋鍥煛閸モ晛浠ч柣銈呭濮婃椽妫冨☉杈╁姼闂佺瀛╅悷鈺侇嚕椤曪拷瀹曟帡鏁傞挊澶樹紦闂備焦瀵х换鍌涱殽閸涘﹦顩叉繝濠傚娴滄粓鐓崶銊﹀暗闁糕晪绲鹃幈銊︾節閸曨厼绗￠梺鐟板槻閹虫劗鍒掗悽纰夋嫹閿濆簼绨奸柣锝勫嵆濮婄粯鎷呴崨濠冨枑婵犳鍠氶弫濠氬Υ閸愵喖宸濈紒顔炬閹风兘鏁冮崒姘�銈嗘礀閹冲繐顕欏ú顏呪拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳冮柣锝呭槻鐓ゆい蹇撳濞煎﹪姊洪弬銉︽珔闁哥噥鍋婂畷婵嬪川鐎涙ǚ鎷洪梻鍌氱墛娓氭鎮炴ィ鍐╃厱閹兼番鍨归埢鏇熴亜閵忥紕鎳囨鐐村笒铻栧ù锝呭级鐎氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐Χ閸℃ê寮块悗鐧告嫹闁告洦鍓欓敓钘夌埣閻擃偊宕堕妸锔规嫽闂佺懓鍟垮Λ婵嬪蓟閺囥垹鐐婇柕濞垮劚椤帡姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶樼吋妤犵偛顦甸獮鏍ㄦ媴閻熼缃曢梻浣稿閸嬪懐鎹㈤崟顖涘仭闁哄被鍎查埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箲閵囧嫰鏁傞悙顒佹瘓閻庢鍠栭…宄邦嚕閹绢喗鏅柛鏇ㄥ幗濠㈡垿姊虹拠鎻掑毐缂傚秴妫欑粋宥夋倻閽樺顔嗛梺缁樺灱濡嫰宕橀敓钘夘渻閵堝棙灏甸柛瀣枛瀵槒顦规慨濠囩細閵囨劙骞掗幙鍕惞闂備胶绮敮顏嗙不閹捐绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚婵嬫煕鐎ｎ偆娲撮柡浣规崌閹稿﹥寰勭�ｎ厾顢呴梻浣芥硶閸犳洘鎱ㄩ妶澶嬪亜妞ゆ帒瀚粻顖炴煥閻曞倹瀚�?缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻О闂備浇顕栭崹鎶藉磻閵堝宓侀柡宥庣仈鎼搭煈鏁嗛柨鐔诲Г娣囧﹥绺介崨濠勫幗濡炪倖鎸鹃崳銉モ枔濠婂牊鐓涢悘鐐插⒔濞插瓨顨ラ悙鍙夊枠婵☆偄鍟埥澶娾枎閹邦喗姣屽┑鐘垫暩婵即宕规總绋挎槬闁哄稁鍘肩粈澶愭煛閸モ晛啸濞戞挸绉撮埞鎴︽偐瀹曞浂鏆￠梺缁樻尰濞茬喖寮婚悢鐓庣闁归偊鍓濋弫鍧楁⒑缁嬭法绠伴柣顓炲�垮濠氭晲婢跺﹦顔婇梺鐟扮摠閻熴儲绂掗灏栨斀妞ゆ梻銆嬮弨缁樹繆閻愯埖顥夐柣锝囧厴婵℃悂鏁傞崜褏妲囬梻浣告啞閸旓箓鎮￠崼婢綁鏌嗗鍡忔嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓ラ柡鍥崝锔筋殽閻愭潙濮堢紒缁樼箓椤繈顢楅崒婊勬瘞闂傚倷绀侀幖顐﹀疮椤愶附鍋嬮柛鈩兠崝鏃堟⒒閸屾瑧绐旀繛浣冲洦鏅煫鍥ㄧ☉缁�鍐煙缁嬪潡顎楁い蹇撶埣濮婅櫣绱掑Ο鍝勵潕闂佺绨洪崐婵嬪箖閿熺姵鍋勯柛蹇氬亹閸樿棄鈹戦埥鍡楃仯闁告鍥х閻庯綆鍋佹禍婊堢叓閸ャ劍绀�闁宠鐗撻弻锛勪沪閸撗�妾ㄩ梺璇″灡閺屻劑鍩ユ径濠庢建闁割偆鍠庨璺衡攽閻樼粯娑фい鎴濇噽缁寮介妸銈囩畾濡炪倖鐗楅悷銊╊敆閻斿吋鐓曟慨姗嗗墻閸庡繑銇勯鈩冪《闁圭懓瀚粭鐔碱敍濮橆剙顥堥梻鍌欑缂嶅﹪寮ㄩ崡鐑嗘富濞寸姴顑呴拑鐔兼煃閳轰礁鏆欑紒鍓佸仱閹﹢鎮欓弶鎴犱喊濠电偛鐭堟禍婵堟崲濠靛顫呴柕蹇婏拷铏暚婵犵妲呴崑鍛崲閸℃あ娑㈡偄閸忓皷鎷洪梺鍦焾鐎涒晝绮堥敓浠嬫⒑缁嬪尅宸ョ紓宥咃躬楠炲啴鏁撻悩鎻掑祮闂佺粯姊婚…鍫濐嚕閸喒鏀芥い鏃傜摂濞堟梹淇婇锝庢畷闁哄懓鍩栫换婵嗩潩椤撶姴骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺撳�堕柍鍝勫暟绾惧ジ寮堕崼娑樺婵炴惌鍠楅妵鍕閿涘嫭鍣伴梺璇″枛婢ц姤绂掗敃鍌氱畾鐟滃酣鎮甸鍕拺閻犲洦鐓￠妤呮煟韫囨棁澹樻い顓炵仢铻ｇ痪顓㈡敱鐎氳鎱ㄥΟ鐓庡付婵炲懎绉归弻鈩冩媴鐟欏嫬纾抽悗娈垮櫘閸撶喐淇婇崼鏇炵倞闁崇懓鐏濇禒顓㈡⒒閸屾瑧顦﹂柟璇х節瀵濡搁埡浣哥彉濡炪倖甯掗崐濠氭儗婢跺矉鎷烽獮鍨姎婵☆偅顨婇、姘舵焼瀹ュ棗锟藉灚绻涢幋鐑嗕紕婵娉涚粻顖涚箾瀹割喕绨奸柍閿嬪灴閺屾稑鈽夊鍫熸暰閻庤娲栫�氫即骞冨Ο璺ㄧ杸闁哄啫鍊归崳浼存倵鐟欏嫭纾搁柛銊ョ秺閸┿儲寰勯幇顒夋綂闂佹寧绋戠�氼剟鐛崼銉︹拻濞达綀娅ｇ敮娑㈡煥濮樿埖鐓曢柣鏃堟敱閸嬨儳锟借娲﹂崑濠囧箖濠婂吘鐔兼⒐閹邦喚娉块梻鍌欑窔濞佳勵殽韫囨洘顫曢柡鍥ュ灩缁犵娀鏌涢妷銏℃珨闁圭兘顥撻幉鎾礋椤掑偆妲柣搴ゎ潐濞诧箓宕滈悢鐓庢槬闁靛绠戠欢鐐测攽閻愰潧浜鹃柣搴☆煼濡懘顢曢姀鈥冲亶闂佺姘︾亸娆撴晸閼恒儴澹樼紓宥咃躬瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂備焦蓱鐏忕敻鏌涢悩宕囧⒌鐎殿喖顭峰鎾晬閸曨厽婢戦梺璇插嚱缂嶅棙绂嶉悜钘夌闁绘垼妫勯崘锟介悷婊冾槸鍗遍柛顐犲灪閸犳劙骞栧ǎ顒�濡煎鍛存⒑閸涘﹥澶勯柛銊╀憾瀵煡寮婚妷锔惧幈濠电偞鍨靛畷顒勭嵁濡ゅ懏鐓曞┑鐘查閻忥附鎱ㄦ繝鍐┿仢婵☆偄鍟埥澶娾枎閹邦厼锟界兘姊虹拠鎻掝劉婵ǜ鍔嶉弲璺何旀担琛℃敵婵犵數濮村ú銈囩不閻熸噴褰掓晲閸繐鎷锋禒瀣╃憸搴ㄥ窗閹邦噯鎷烽獮鍨姎妞わ富鍨堕幃鐐寸節濮橆厸鎷哄銈嗗釜閹烽绱掓径灞炬毈闁糕晜鐩獮瀣晜閻ｅ苯骞堟繝鐢靛仦閸ㄥ爼鏁冮銏╁晠闁靛／鍛紲濠德板�撶粈渚�宕ú顏呯厵妞ゆ棁宕甸惌娆愩亜閵忥紕娲村┑鈥崇埣瀹曞爼鍩￠崘鈺婃綋闂備浇顕у锕傦綖婢跺♁鍝勎熸笟顖涘瘜闂佽姤锚椤﹂亶寮抽敃鍌涚厽闁哄啫鍊甸幏锟犳煛娴ｅ摜校闁逛究鍔岄～婊堟晸閻ｅ本鍏滅紒瀣嚦閿濆棗顕遍悗娑櫱氶幏缁樼箾鏉堝墽绉繛鍜冪悼閺侇喖鈽夐姀锛勫幈闂佸搫鍟幐楣冩偩閻㈢鎷风憴鍕缂侇喗鎹囧顐﹀礃椤旇偐锛滃┑顔筋焾妞存悂鎮炴ィ鍐╃厽閹艰揪绱曢悾顓㈡煕鎼淬劋鎲鹃挊婵喢归悡搴ｆ憼闁稿鍊块弻锝夊籍閸屾艾浠樼紓浣哄Т缂嶅﹤顕ｉ崼鏇為唶婵犻潧妫岄幐鍐磽娴ｅ壊鍎戠紒顕呭灦婵＄敻宕熼鍓ф澑闂佸搫娲ㄩ崑鐐烘倶閸儲鈷戦柛婵嗗閻忛亶鏌涢悩鍐插閽樻繈鏌ｅΔ锟介悧濠囧磿閻斿吋鐓冮柕澶堝劚閺嗚京绱掗悪鍛М婵﹦绮幏鍛村川婵犲啫鍓甸梺鑽ゅ仦閸戝綊宕戞繝鍌滄殾婵犻潧顑呯粻锝夋煥閺囶亝瀚圭紓浣哄У閻楃娀寮婚弴锛勭杸閻庯綆浜炴导鍕磼閻愵剙鍔ら柛姘儔楠炲牓濡搁妷搴㈡閺佹捇鎸婃竟鈺傜☉閳诲酣骞樺鍜佹Ч鐎垫澘瀚伴獮鍥敇濞戞瑥顏烘繝鐢靛仩閹活亞寰婃禒瀣婵犲﹤鐗婇弲顒傦拷骞垮劚濞层劎澹曢崗绗轰簻闁哄洨鍋為崳褰掓煟韫囥儵妾い銊ｅ劦閹瑩寮堕幋鐘辩礉闁诲氦顫夊ú鏍偉婵傛悶锟戒礁螖閸涱厾锛滃┑顔矫肩粚鍫曞磻婵犲洦鈷掑ù锝囩摂閸ゆ瑩鏌涢幋鐘虫珪缂佽京鍋ゅ畷鍗炍熺喊杈ㄩ敜闂備礁鎼粙渚�宕㈤懖鈺冪＜闁宠桨鎬ヨぐ鎺撳亹鐎瑰壊鍠栭崜閬嶆⒑缂佹ɑ灏版繛鑼枛瀵鎮㈤崗鐓庢疂濡炪倖甯幏宄扳攽闄囨慨銈囨崲濞戙垹宸濇い鎾跺枎閺嬬娀姊洪崫鍕潶闁告梹鍨块獮鍐閵忋垻锛滃┑顔筋殔濡瑩藟婢跺绻嗛柣鎰典簻閿熷鍊濆畷銏＄附缁嬪灝绨ラ梺鍝勮閸庤崵绱為弽顓犲彄闁搞儯鍔嶆刊鍏肩箾瀹割喕鎲鹃柡浣稿�块弻娑㈠即閵娿儱鈷掑┑鈽嗗亞閸犳牕顫忕紒妯肩懝闁跨喕妫勯…鍥樄缁℃捇鏌ㄩ悢鍓佺煓婵﹤顭峰畷鐔碱敃閵忊晙绱旈梻浣筋嚃閸犳岸寮拠宸殨妞ゆ洩鎷风�规洖銈搁幃銏ゅ矗婢跺浼栭梻鍌氬�风粈渚�骞夐敍鍕处闁秆勵殔绾惧潡鏌涘Δ鍐ㄤ汗闁哄绉归悡顐﹀炊閵娧�妾ㄩ梺缁樻尰濞茬喖寮婚弴鐔虹闁割煈鍣幏鐑藉即閻愬灚娈奸梺绯曞墲缁嬫帡鎮￠弴銏＄厓闁荤喐澹嗘禒銏ゆ煟韫囨挸绾фい銊ｅ劦閹瑩骞栭鐘插Ш闂備礁缍婇ˉ鎾寸箾閿熺晫锟芥鍠栭…閿嬩繆閻戣棄唯闁挎棁濮ら惁鎴︽⒒閸屾艾锟芥悂宕愭搴ｇ焼濞撴熬鎷锋鐐寸墵椤㈡洟鍩涘顓熴仢濠碘剝鎮傞崺鈩冩媴閾忕懓鐐婇梻鍌欐祰椤鐣峰锟介、姘愁樄闁诡垰鑻灃闁告侗鍠氶崢閬嶆⒑閺傘儲娅呴柛鐔跺嵆閸╋附绗熼敓浠嬪蓟瀹ュ鐓ラ悗锝庝簽娴煎矂姊虹拠鈥虫灈缂傚秴锕悰顔界瑹閿熶粙鐛幒妤�绠ｆ繝鍨姉閿熷�熸珪缁绘繈鎮介棃娑楃捕闂佺懓鍟跨换妯虹暦濠靛棌鏋庨柟鎯х枃閹芥洟姊虹紒妯烩拻闁告鍛焼闁告洦鍨遍悡蹇涙煕椤愶絿绠栨い銉︾矋閵囧嫯绠涢妷锕�顏�?
		sReqHelpCountView.shengwangvaluemax=fire.pb.HelpCountManage.getInstance().getShengWangValueMax(roleid);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬪仴鐎殿喖顭烽弫鎰緞鐎ｎ亙绨婚柣搴ｆ嚀鐎氼厽绔熼崱娑欏剮閹兼番鍔嶉埛鎴︽煕韫囨挸鎮戠紒璺哄级缁绘稓浜搁弽鍨闁归绀佸▓銊╂⒑閸撴彃浜濇繛鍙夌墵閺屽宕堕妸褏顔曢梺鐟邦嚟娴兼繈顢旈崼姘炬嫹閺嶃劌绶炲┑鐐靛亾閺傦拷闂備胶绮崝鏇烆嚕閸洖闂柦妯侯槴閺�鑺ャ亜閺冨洤浜瑰ù鐘崇〒缁辨帒鐣濋崘顔兼懙缂備胶绮换鍫濈暦閸洍锟芥牠顢栭锟藉ú銊╁矗閹剧粯鐓曢柕澶涚到婵′粙鏌ｉ幘鍗炲姕闁靛洤瀚粻娑㈠箻鐠鸿櫣鍘芥繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ崑锟犳⒑椤撱劎鐣辨繛鍫熺箖缁绘繈鎮介棃娑楁勃閻熸粍婢橀崯浼村箲閵忕姈鐔兼惞鐟欏嫭顔曠紓浣鸿檸閸樺ジ骞婄仦鍓ь洸鐟滅増甯楅悡娆撴煕濠靛棗顏柨娑欐閺岀喐顦版惔鈥冲箣闂佽桨绀侀崯鏉戠暦閹烘嚩鎺斾焊閺嶃劍鐝氶梺鍝勮嫰缁夐潧顭囬鍫濈妞ゆ柨澧藉畷鏌ユ⒒娴ｅ憡鎲搁柛瀣Т閳绘柨鈽夐姀鐘靛幋闂佺鎻梽鍕磻閹邦喚纾藉ù锝堝亗閹达附鐓ユい鎾跺亹閺�浠嬫煃閽樺顥滃ù婊勭箘缁辨帞锟斤綆鍋嗘晶闈涒攽閿涘嫭鏆鐐叉喘閹囧醇閻斿壊浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶樼吋妤犵偛顦甸獮鏍ㄦ媴閻熼缃曢梻浣稿閸嬪懐鎹㈤崟顖涘仭闁哄被鍎查埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箲閵囧嫰鏁傞悙顒佹瘓閻庢鍠栭…宄邦嚕閹绢喗鏅柛鏇ㄥ幗濠㈡垿姊虹拠鎻掑毐缂傚秴妫欑粋宥夋倻閽樺顔嗛梺缁樺灱濡嫰宕橀敓钘夘渻閵堝棙灏甸柛瀣枛瀵槒顦规慨濠囩細閵囨劙骞掗幙鍕惞闂備胶绮敮顏嗙不閹捐绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚婵嬫煕鐎ｎ偆娲撮柡浣规崌閹稿﹥寰勭�ｎ厾顢呴梻浣芥硶閸犳洘鎱ㄩ妶澶嬪亜妞ゆ帒瀚粻顖炴煥閻曞倹瀚�??
		sReqHelpCountView.factionvaluemax=fire.pb.HelpCountManage.getInstance().getClanValueMax(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑橆殕閻撴盯鏌涢弴妤佹珔闁告棑绠撻弻锛勪沪閸撗勫垱閻庢鍠楅幐铏繆閹间礁唯鐟滃矂宕Δ鍛拻濞达綀顫夐崑鐘绘煕閺傝法鐒哥�规洘鍔欓獮鏍ㄦ媴閸濄儱骞嬮梻浣侯攰閹活亞绮婚幋鐘差棜闁稿繗鍋愮弧锟芥繝鐢靛Т閸婂綊骞戦敐澶嬬厱闁哄倹瀵ч幉鍝ョ磼鏉堛劍灏伴柟宄版嚇閹兘寮跺▎鐐秾濠碉紕鍋戦崐鎴﹀礉鐏炶娇娑樷槈閵忕姷顔夐梺闈涚箳婵厼危閸儲鐓忛煫鍥ㄦ礀鍟稿銈嗘尰濡炶棄顫忛搹鍦＜婵☆垰鎼～宥咁渻閵堝棙鈷愰柣妤冨Т椤曪綁骞庨懞銉︽闂佺粯蓱閺嬪ジ骞忛搹鍦＝濞达絽澹婇崕鎾寸箾婢跺绀堢紒顔碱煼閹崇娀顢楅崒婊愮床婵＄偑鍊栧Λ浣规叏閵堝懐鏆︾�癸拷閿熶粙鏁撻懞銉晱闁哥姵鐗犻垾锕傛煥鐎ｂ晝绠氶梺褰掓？缁�渚�鎮″☉銏＄厱閻忕偛澧介悡顖滅磼閵娿儺鐓兼慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼闂備胶鎳撻幗婊堝礂濮楋拷楠炲﹤螖閸涱參鍞堕梺鍝勬川閸犲孩绂嶅Δ鍛拺闁荤喐婢橀埛鏃傜磼椤曞懎鐏﹂柛鈺傜洴楠炲鏁傞悾灞藉箞婵犵數濞�濞佳兾涘Δ鍜佹晜妞ゆ劧闄勯悡鐔兼煙閻戞ɑ绀冪痪顓炲缁辨帗娼忛妸銉ь儌缂備浇椴哥敮鎺曠亽闂佸吋绁撮弲婵嬪级娴犲鐓熼幖娣焺閸熷繘鏌涢敐搴℃珝鐎规洘鍨剁换婵嬪炊閳轰胶銈︽繝纰樻閸ㄧ敻宕戦幇顔碱棜闁稿繘妫跨换鍡樸亜閺嶃劎鐭岄悽顖涚♁閵囧嫯绠涢弴鐐寸亪濠殿喖锕︾划顖炲箯閸涘瓨鍤嶉柕澹緤鎷锋繝鍥ㄢ拺闂傚牃鏅濈粔鍓佺磼閻樿櫕宕岄柣娑卞枦缁犳稑鈽夊▎鎰仧闂備浇娉曢崳锕傚箯閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶樼吋妤犵偛顦甸獮鏍ㄦ媴閻熼缃曢梻浣稿閸嬪懐鎹㈤崟顖涘仭闁哄被鍎查埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箲閵囧嫰鏁傞悙顒佹瘓閻庢鍠栭…宄邦嚕閹绢喗鏅柛鏇ㄥ幗濠㈡垿姊虹拠鎻掑毐缂傚秴妫欑粋宥夋倻閽樺顔嗛梺缁樺灱濡嫰宕橀敓钘夘渻閵堝棙灏甸柛瀣枛瀵槒顦规慨濠囩細閵囨劙骞掗幙鍕惞闂備胶绮敮顏嗙不閹捐绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚婵嬫煕鐎ｎ偆娲撮柡浣规崌閹稿﹥寰勭�ｎ厾顢呴梻浣芥硶閸犳洘鎱ㄩ妶澶嬪亜妞ゆ帒瀚粻顖炴煥閻曞倹瀚�??
		sReqHelpCountView.helpgiveitemnummax=fire.pb.HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
		sReqHelpCountView.helpitemnummax=fire.pb.HelpCountManage.getInstance().getHelpItemNumMax(roleid);
		
		gnet.link.Onlines.getInstance().send(roleid, sReqHelpCountView);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786532;

	public int getType() {
		return 786532;
	}


	public CReqHelpCountView() {
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
		if (_o1_ instanceof CReqHelpCountView) {
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

	public int compareTo(CReqHelpCountView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


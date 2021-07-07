
package fire.msp.task;




import fire.pb.item.PEquipRideProc;
import fire.pb.item.Pack;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GChangeShape__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GChangeShape extends __GChangeShape__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role  role = 
			fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(playerid);
		if(role == null) return;
		if(null == role.getScene()) return;
		
		if(changetype == 0) {
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape){
				role.setTransformid(0);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁绘鐗嗘禒娲⒑閸涘﹦鈽夐柨鏇樺劚閳诲秹濮�閵堝棌鎷洪梺鍛婄箓鐎氼剟鏁撻挊澶屽煟鐎规洘鍔曡灃闁告侗鍠栨禒濂告⒑濮瑰洤鐏い锝庡櫍楠炲繑顦版惔銏犳瀭闂佸憡娲﹂崜娑⑺囬妷鈺傗拺闂傚牊绋撴晶鏇㈡煙濞村澧茬紒宀冮哺缁绘繈宕堕妸銉嫹婵犳碍鐓犻柟顓熷笒閸旀粍绻涢崨顓燁棤缂佽鲸鎹囧畷鎺戔枎閹存繂顬夐梻浣瑰濞插秹寮插☉婊呬罕闂備礁鎲＄粙鎴︽偤閵娾晛鐓曢柟鐑橆殕閻撴洟鎮橀悙鎻掆挃闁瑰啿鎳忛妵鍕晜閼测晝鏆ら梺鍝勬湰閻╊垶骞冮姀銈嗙叆閻庯綆浜欏ǎ顔戒繆閵堝洤啸闁稿鍋ら幃褔鎮╁Ч鍥锋嫹娓氾拷瀵挳濮�閳╁啯鐝栭梻浣芥硶閸犳捇寮查銈呭灊濠电姵纰嶉崑鎰版偣閸ヮ亜鐨烘い鏃�鍔曢埞鎴︽倻閸モ晝校闂佸憡鎸婚悷锔界┍婵犲啰顩烽悗锝庡亞閸樿鲸绻濋悽闈浶㈤柛濠勵焾鍗卞┑鐘崇閻撳啴鎮峰▎蹇擃仼闁诲繑鎸抽弻鐔碱敊鐟欏嫭鐝氶悗瑙勬穿缁叉儳顕ラ崟顒傜瘈閹肩补鎳ｉ悢鍏尖拻闁稿本鐟ㄩ崗宀�绱掗鍛仸妤犵偞鍔栭妶锝夊礃閵娧呭炊闂備礁鎼粙渚�宕㈡總鍛婂珔闁绘柨鍚嬮悡鐔兼煛閸屾氨浠㈤柟顔藉灴閺岋綁骞掑鍥╃厯闂佸搫琚崝鎴濐嚕閹绢噮鏁傞柛娑卞弾娴兼挸鈹戞幊閸婃鎱ㄩ悜钘夌；闁绘劗鍎ら崑瀣節婵犲倹鍣烘い顐ｆ礋閺岀喖鎮滃鍡樼暥缂備胶濮烽弫濠氬蓟閻斿吋鍊绘俊顖濆亹閻ｅジ姊洪崨濠呭妞ゆ垵顦～蹇撁洪鍕炊闂佸憡娲﹂崢楣冨礉閸︻厾纾藉ù锝堟鐢稓绱掔拠鎻掞拷鍧楀箖妤ｅ啯鍊婚柦妯侯槺椤斿﹤鈹戞幊閸娧囧箯妞嬪海纾奸柨鐔剁矙瀹曟﹢顢欓悾灞藉妇濠电姷鏁告慨瀵告崲閹烘鍋╅弶鍫涘妸娴滄粓鏌ㄩ弮鍥舵綈婵炲懎锕ラ幈銊︾節閸涱噮浠╃紓浣介哺鐢帟鐏掗柣鐘叉处閻擄繝鎮楅搹鍦＝闁稿本鐟чˇ锔姐亜閹存繃顥㈢�规洖缍婂畷绋课旈敓浠嬫倶閹惰姤鐓ラ柡鍐ㄥ�告禍鍓э拷瑙勬礀椤︾敻寮婚弴鐔虹瘈闊洦娲滈弳鐘电磼閸撗嗘闁搞劏娉涢～蹇撁洪鍕暰閻熸粌绻掔划濠氬箮閼恒儳鍘甸梺鎯ф禋閸嬪懎鐣峰畝鍕厪闁糕剝顨呴敓钘夋憸閸欏懎顪冮妶鍛闁瑰啿顦甸獮蹇撁洪鍛嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥崝锕傛煙椤曞棛绡�闁诡喓鍨藉畷妤呮嚃閳轰礁绠炴繝鐢靛Х閺佸憡鎱ㄩ幘顔肩柈闁绘鐗婂▍鐘绘⒑椤掞拷缁夌敻鎮″▎鎰垫闁绘劘灏欐禒銏ゆ煟韫囧﹥娅婇柡灞界Ч閹稿﹥寰勫Ο鐑╂瀰濠电姵顔栭崳顖炲箯閻戣姤鈷戠紓浣癸供閻掔偓銇勯弴鍡楁搐閺嬩胶鎲搁悧鍫濈瑲闁抽攱甯掗湁闁挎繂鐗婇鐘绘偨椤栨稓鈾佸ǎ鍥э躬椤㈡洟濮�閻樿櫕顔掗梺鑺ヮ焽閸犳牠寮婚悢鍏煎�锋い鎺嶈兌缁嬪洤顪冮妶鍡樼濞存粠鍓熼弫鎾绘偩鐏炵虎浠ч梺褰掝棑閸忔﹢寮诲☉銏犲嵆闁靛鍎遍～鈺呮⒑鐠恒劌鏋欐俊顐㈠閹ê顫濇潏銊ュ簥濠电偞鍨崹褰掓煁閸ャ劎绡�闂傚牊绋撴晶鏃堟煣韫囨捇鍙勬慨濠冩そ瀹曨偊宕熼棃娑樺Η闂傚倸鍊哥�氼剛锟芥凹鍘剧划姘綇閵娧呯槇闂佹悶鍎撮崺鏍疾濠靛鈷戦梻鍫熺〒缁犲啿鈹戦锝呭箺閻庨潧銈稿畷姗�顢欑憴锝嗗闂佽崵濮村ú鐘绘晸閸婄喐鐝柣婵囩箘缁辨挻鎷呴崫鍕戯綁鏌ｅΔ鍐ㄐ㈡い鏇秮椤㈡洟鏁冮敓鐣岀不閼姐倗纾藉ù锝咁潠椤忓懐顩茬憸鐗堝笚閳锋垿鏌ゅù瀣澒闁瑰嚖绻濋弻娑㈠箼閸曨厾鏆ら悗瑙勬磸閸庢娊鏁撻弬銈囩У闁稿鍊婚幑銏ゅ幢濞戞瑧鍘介梺瑙勬緲閸氾拷缂併劌顭烽弻銊╂偄鐠囨畫鎾绘煟濡や焦绀夐柣蹇擃儐缁绘稒娼忛崜褏袣濡炪値鍋勯ˇ闈涚暦閿濆牏鐤�婵炴垶鐟ч崢顏堟⒑閸撴彃浜濈紒璇茬Т鍗遍柟闂寸劍閻撶喖鏌曢崼婵嬵�楁繛鍛Ч閺岋紕浠﹂悙顒傤槷缂備胶濮电粙鎾绘晸閺傘倗绉靛ù婊呭厴楠炲繘鎮滈挊澶婂敤濡炪倖鎸鹃崑鐔煎储闁秵鈷戦柛锔诲幖閸斿鏌涢妶鍡曚孩闁靛洦鍔欓獮鎺楀箻鐎涙褰搁梻鍌欑劍閹爼宕曢鐐茬閻忕偠袙閺嬫棃鎮橀悙鐢垫憘婵炴挸顭烽弻鏇㈠醇濠靛浂妫＄紓渚婃嫹闁告劦浜炵壕鍏笺亜閺傚灝鎮戦柟鐧哥稻娣囧﹪宕ｆ径濠傤潚濡ょ姷鍋炵敮鈥愁嚕椤曪拷楠炴﹢寮堕幋顓濈处闂傚倷鐒︾�笛呮崲閸屾侗娈介柛娑橈功椤╁弶绻濇繝鍌滃闁绘挾鍠栭悡顐﹀炊閵婏附鍎庨梺鎼炲�楅崰鏍蓟閵娾晜鍋勯悹鍥ㄧ暙閹炬番浜滈柡鍐挎嫹闁绘濮撮悾鐑藉级濞嗙偓鍍甸柣鐘烘閸庛倝鎮楅浣虹瘈闁汇垽娼ф牎闂佸憡绻傞柊锝夊极閹捐绠ｉ柟鐑樻濡差噣鏌х紒妯煎⒌闁哄本绋戦埥澶愬础閻愯尙顔掗梻浣瑰缁嬫帞鍒掑畝鍕厴闁硅揪闄勯崑鎰版偣閸ュ洤鍟╃槐锝夋⒒娴ｅ憡鎲搁柛锝冨劦瀹曟垿宕卞☉妯肩枀闂佸湱铏庨崰妤呭疾濠靛鐓ラ柣鏂垮閻瑩鏌涢埡鍐ㄤ槐妤犵偛顑夐弫鍌炴寠婢跺鐫忛梻鍌欑婢瑰﹪鎮￠崼銉ョ；闁告侗鍘滈幒妤�绀嬫い鎺戝�婚惁鍫濃攽閻愯尙澧曢柣蹇旂箞瀵悂濡舵径瀣幐婵炶揪缍�椤宕愰幇顕嗘嫹鐟欏嫭绀堝褎顨堥幑銏犫攽鐎ｎ亞锛滈梺闈涚墕閹冲繘宕愰姘ｆ斀闁绘﹩鍠栭悘杈ㄧ箾婢跺娲撮柡浣稿暣閺佸啴宕掑顒�浜堕梻鍌欑贰閸撴瑧绮旈悽绋跨厱闁硅揪闄勯悡鏇熺節闂堟稒顥滄い蹇婃櫊閺岋繝宕卞Ο鍏煎櫚闂佸搫鐭夌徊鍊熺亙闂佽法鍠嶇划娆撳极閸愵噮鏁傞柛顐ｇ箘閻ｆ椽姊婚崟顐ｅ窛缂侇喛顕ч埥澶娢熼柨瀣垫綌婵犵數鍋涘Λ娆撳垂閻㈠摜宓侀柛顐ゅ枍缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら悧鐘茬暦濠靛妲鹃悗鍨緲閿曪箓骞戦崟顖毼╃憸宀�绮径鎰拺闁告繂瀚埢澶愭煕濡湱鐭欓柟顕嗙節瀵挳濮�閿涘嫬寮虫繝鐢靛█濞佳兾涘▎鎾抽棷婵炲樊浜濋崑锝夋煙閺夊灝顣崇痪鎹愭硶缁辨帗娼忛妸銉х懖濠电偟鍘х换妯讳繆閹间焦鏅濋柨鐔烘櫕閸犲﹤顓奸崪浣瑰瘜闂侀潧鐗嗗Λ娆戜焊椤撱垺鐓忛柛顐犲焺閻掗箖鏌ｉ敐鍥у幋闁诡喓鍨婚崰濠冩綇閵婏附鐝濋梻鍌欒兌缁垶鏁冮姀鐙�鐒界憸搴ㄥ箚閺冿拷缁绘繈宕掑Δ浣规澑闂備胶绮摫妞ゆ梹鐗犲鎶筋敍濞戞绠氶梺鍦帛鐢宕甸崶鈺嬫嫹鐟欏嫭绀冮柛銊ョ仢閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒勫几閸愨晝绡�婵炲牆鐏濋弸鐔搞亜閵婏箑濮嶆鐐茬箲椤︾増鎯旈娑橆伓濠电偛鐗嗛悘婵嗏枍濮楋拷閺屾稓锟斤綆浜烽煬顒勬煟濞戝崬鏋涢摶锝夋煠濞村娅囬柨娑欑矊閳规垿鍩ラ崱妤冧化缂備緡鍣崹鍫曘�侀弮鍫熷亜闁稿繐鐨烽幏缁樼箾鏉堝墽绉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?
			}
			else
				role.setTransformid(shape);
			role.sendWhoSeeMeAndMe(send);
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if(changetype == 1) {
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬪仴鐎殿喖顭烽弫鎰緞婵犲嫷鍟嬮柣搴ゎ潐濞叉牕煤閵堝浼犳繛宸簼閳锋垿鏌涘┑鍡楊伌闁稿孩鍔欓弻锝呂旀笟鍥ㄧ暭闂佺懓绠嶉崹褰掑煡婢舵劕顫呴柣妯活問閸氬懘姊绘担铏瑰笡闁告梹鐟ラ…鍥樄鐎殿喗濞婇弫鎾绘偐閺傘儲瀚奸梻浣藉吹閸犳劕顭垮Ο浣曪絾绻濆顓犲幈闂侀潧楠忕槐鏇㈠矗閿熶粙姊洪幐搴ｇ畼闁稿鐩崺鐐哄箣閻欏懏瀚归柨婵嗛娴滄粌霉濠婂嫷娈滈柡宀�鍠栧畷妤呮嚃閳哄倹顔冮梻浣规偠閸斿秴危閹烘桅闁归偊鍘介崕鐔搞亜椤愵偄骞樼紒鐘冲哺濮婃椽妫冨☉姘暫濠电偛鐪伴崐鏇㈠汲閳哄懏鈷掑ù锝勮閻掔偓銇勯幋婵囶棦闁诡垰瀚伴、娑橆潩鏉堛劍顔曟俊鐐�栭悧婊堝磿閹版澘鏋佺�广儱妫涚粻楣冩煙鐎电浠滈柣鎺戠秺閺岋繝鏁撴禒瀣優妞ゆ劑鍊楅惁鍫ユ⒑濮瑰洤鐏叉繛浣冲啰鎽ラ梻浣筋嚙鐎涒晝鍠婂澶婄畺闁稿瞼鍋熷畵渚�鐓崶銊р檨闁稿﹤顭烽弻锕�螣娓氼垱效閻庤鎸哥粔鎾�旈崘顔嘉ч柛鈩兠弳妤佺節濞堝灝鏋涚痪缁㈠弮閹崇偤鏌嗗鍛啋濡炪倖妫佽闁瑰嘲顭峰铏圭矙閹稿孩鎷遍梺鐓庣秺缁犳牠寮幘缁樺癄濠㈣泛锕ヤ簺闂傚倸娲らˇ鐢稿蓟濞戙垹唯闁瑰瓨绻冮崳鐑樼箾閸儳鐣烘慨濠冩そ瀹曟粓鎳犻锟界敮銉╂⒑缁嬫鍎忛柟铏悾鐑芥晲閸垻鏉稿┑鐐村灦閻熝囧储闂堟侗娓婚柕鍫濇婢ь亝淇婇锝嗗唉妤犵偛绻橀幃婊堟嚍閵壯冨箰闂佽鍑界紞鍡樼閻愬瓨娅忛梻鍌欑閹碱偆鎮锕�绀夌�癸拷閸曨偆鍘撮梺纭呮彧缁犳垿鐛姀銈嗙厓闁告繂瀚敓鑺ュ姍閺佸倿宕滆閿涙繃绻涙潏鍓ф偧闁硅櫕鎸婚幈銊╁醇閻旂繝绨婚梺闈涱焾閸庡鐓鍌︽嫹濞堝灝鏋涙い顓犲厴瀹曞綊骞嗚閺嗭箓鏌涢妷锝呭妞ゆ梹鎸绘穱濠囨倷椤忓嫸鎷烽弽顬℃椽寮介‖顒佺☉閳诲酣骞嬮娑橆伓濠殿喗锕╅崜娑氱矓閻戞ɑ鍙忓┑鐘插暞閵囨繄锟借娲﹂崑濠傜暦閻斿吋顥堟繛鎴灻ˉ搴♀攽閻樻鏆俊鎻掓嚇瀹曟垿宕熼姘辨焾闂佸搫顦伴崺鍫ュ吹閺囩偐鏀介柣妯虹枃婢规﹢骞嗛悢鍏尖拺闁告劕寮堕幆鍫ユ煕婵犲倹鍟炵紒鍌氱Ч閹瑩鎮滃Ο閿嬪缂傚倷绀侀鍡欙拷绗涘喛鑰块柟娈垮枤绾惧ジ鎮楅敐搴′簻闁诲繐鐡ㄩ妵鍕閳╁喚妫冮梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�
			if(shape == 0) {
				fire.pb.mission.SNpcFollowEnd send = new fire.pb.mission.SNpcFollowEnd();
				send.npcid = shape;
				role.send(send);
			} else {
				fire.pb.mission.SNpcFollowStart send = new fire.pb.mission.SNpcFollowStart();
				send.npcid = shape;
				role.send(send);
			}
		} else if(changetype == 2) {
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬪仴鐎殿喖顭烽弫鎰緞婵犲嫷鍟嬮柣搴ゎ潐濞叉牕煤閵堝浼犳繛宸簼閳锋垿鏌涘┑鍡楊伌闁稿孩鍔欓弻锝呂旀笟鍥ㄧ暭闂佺懓绠嶉崹褰掑煡婢舵劕顫呴柣妯活問閸氬懘姊绘担铏瑰笡闁告梹鐟ラ…鍥樄鐎殿喗濞婇弫鎾绘偐閺傘儲瀚奸梻浣藉吹閸犳劕顭垮Ο浣曪絾绻濆顓犲幈闂侀潧楠忕槐鏇㈠矗閿熶粙姊洪幐搴ｇ畼闁稿鐩崺鐐哄箣閻欏懏瀚归柨婵嗛娴滄粌霉濠婂嫷娈滈柡宀�鍠栧畷妤呮嚃閳哄倹顔冮梻浣规偠閸斿秴危閹烘桅闁归偊鍘介崕鐔搞亜椤愵偄骞樼紒鐘冲哺濮婃椽妫冨☉姘暫濠电偛鐪伴崐鏇㈠汲閳哄懏鈷掑ù锝勮閻掔偓銇勯幋婵囶棦闁诡垰瀚伴、娑橆潩鏉堛劍顔曟俊鐐�栭悧婊堝磿閹版澘鏋佺�广儱妫涚弧锟芥繝鐢靛Т閸婃悂顢旈埡鍛闁哄鍩婂銉╂煃鐟欏嫬鐏撮柟顔规櫇缁辨帒螣婵犳碍鏆樺┑锛勫亼閸婃牠宕归悽绋跨疇婵鎷锋鐐插暙閳诲酣骞囬鍓ф闂備礁鎲″ú锕傚礈濞嗘挸鍑犻柟杈鹃檮閸婂灚顨ラ悙鑼虎闁告梹纰嶉妵鍕晜閸喖绁悗瑙勬礃閸ㄥ潡骞冮姀銈嗏拹闁归偊鍠氶悾鐐繆閻愵亜锟芥牠鎮уΔ鍐╁床闁稿瞼鍋涚憴锕傛煕閿旇骞樼痪鎯с偢閺屽秹鎸婃径瀣闁诲孩鑹剧紞濠傤潖婵犳艾纾兼繛鍡樺灩閻涖垹鈹戦悙鏉垮皟闁告洖鐏氶鏃堟椤愩垺澶勬繛鍙夌墱濞嗐垽濡舵径瀣幈闂佸湱鍋撻〃鍛拷姘煎墴瀹曘垻鎲撮崟顏嗙畾闂侀潧鐗嗙换鎺楀礆娴煎瓨鐓曢柣鏇氱閻忥箓鏌熼鍡欑瘈濠碉紕鍏橀崺锟犲磼濠婂啫绠伴梻鍌欑劍閹爼宕曞ú顏呭亗濞撴熬鎷锋い銏℃瀹曠厧鈹戦崼顐Ｐラ梻鍌欑窔濞佳囨偋閸℃娲Ω瑜嶉ˉ姘攽閸屾粠鐒剧紒鐙欏洦鐓曟い鎰剁悼椤ｅ弶绻涢崨顓熷櫣闂囧鏌ｅ鍡椾簼婵炲懎娲ㄧ槐鎺撴綇閵娿儲璇為梺璇″枓閺呮盯鎮鹃悜钘夌倞闁靛鍎遍悘鈥斥攽鎺抽崐妤佹叏閻戣棄纾婚柣鎰劋閺呮繈鏌曡箛瀣拷妤�鐣垫笟锟介弻娑㈠Ψ椤旂厧鈷掗梺杞扮濞差參寮婚敐澶婂嵆婵ê宕俊钘夘渻閵堝啫鍔氶柣妤佹尭椤繒绱掑Ο璇差�撶紓浣圭☉椤戝懎鈻撻幇鐗堚拺闁告縿鍎辨牎闁汇埄鍨敓鑺ュ墯閸ゆ洟鏌＄仦璇插姕闁稿鍔欓弻銈囧枈閸楃偛顫┑鐐茬墛閸庢娊鍩為幋锔绘晩缂佹稑顑嗛娲⒑瑜版帩妫戦柛蹇旓耿瀵鎮㈡搴㈡闂佹悶鍎滈敓浠嬪几閸涱収娓婚柕鍫濆暙閻忣亪鏌ｅΔ鍐ㄢ枅闁绘侗鍣ｉ獮鍥敇閻斿嘲濡抽梻浣哄仺閸庡浜稿▎鎾崇閻熸瑥瀚弧锟介梺姹囧灲濞佳冩毄闂備浇妗ㄧ粈渚�骞夐敓鐘茬疄闁靛ň鏅滈崐濠氭煢濡警妲归柣搴墴濮婇缚銇愰幒鎿勭吹缂備緤鎷峰ù锝呮惈椤ユ氨绱撴担璇＄劷缂佺娀绠栭弻鐔猴拷娑欘焽閹冲啴鏌ｈ箛锝勯偗闁哄本绋撻敓鏂ょ秵娴滃爼宕曡箛娑欑厓閻熸瑥瀚悘鎾煙椤旇娅婄�规洩绲惧鍕拷锝庡亜閿熺晫鍏樺缁樻媴鐟欏嫬浠╅梺鍛婃煥閻倸鐣烽幇鏉块敜婵°倧鎷烽柦鍐枑缁绘盯骞嬮弮锟介崳浼存煥閻斿憡鐏紒鐘虫崌閻涱喚锟斤綆浜栭弨浠嬫煕閵夈垺娅呴柦鍌氼儔濮婂宕掑▎鎴濆闂佽鍠栭悥鐓庣暦閹版澘鍐�妞ゎ兘锟借櫕鎯堟い顐ｇ矒閺佹捇鎳為妷銈囩畾闂佹眹鍨婚…鍫㈢矆鐎ｎ偁浜滈柡宥冨妽閻ㄦ垿鏌ｉ銏狀伃婵﹨娅ｇ划娆撳箰鎼淬垺瀚抽梻浣规た閸欏酣宕板Δ鍐崥闁绘梻鍘ч崡鎶芥煏韫囧鎷风粵瑙勫闁汇垹鎲￠崑鈩冪箾閸℃绠版い蹇ｄ簽缁辨帡鏁撴禒瀣櫢闁芥ê顦藉〒濠氭煏閸繄绠版い鈺婂墴閺屸剝鎷呯粵瀣濡炪倖娲╃徊鍓ф崲濠靛棭娼╂い鎴旀杹閺呯娀寮诲澶婁紶闁告洦鍋撻幏鐑藉川婵犲嫷娲搁梺缁樺姉閸庛倝鍩涢幋鐘电＜閻庯綆鍋勯婊勭節閿熶粙骞嶉鍓э紲闁诲函缍嗛崑鍕倶鐎涙ǜ浜滈柕蹇婂墲椤ュ牓鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺灥濡盯宕濋姘ｆ斀闁绘劖娼欓悘锕傛嚕閵堝鐓涢悗锝庝邯閸欏嫰鏌″畝锟介崰鏍箖濞嗘搩鏁嗗ù锝堟閳诲繐鈹戦悙宸殶濠殿垼鍙冨畷锝夊礃椤旇偐鐣洪悗鐟板閸嬪﹪鎮￠妷鈺傜厱闁哄洢鍔屾晶浼存煕濞嗗繑顥㈡慨濠勫劋鐎电厧鈻庨幋鐐蹭还闂備胶顭堢换鎴ｆ懌婵烇絽娲ら敃顏堝箖濠婂牊瀵犲璺鸿嫰楠炴劙姊绘担渚劸闁哄牜鍓涚划娆撳箳濡ゅ﹥鏅滈梺缁樻煥閸氬鍩涢幒鎳ㄥ綊鏁愰崼婢挾鐥鐐靛煟闁哄本鐩弫鎰疀閺囩姵娈兼俊銈囧Х閸嬫稓鎹㈠锟藉顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷
			xbean.TransfromInfo ti = xtable.Transfromroles.select(playerid);
			int rideid = 0;
			if (ti != null) {
				rideid = ti.getRide();
			}
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape) {
				role.setTransformid(0);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁绘鐗嗘禒娲⒑閸涘﹦鈽夐柨鏇樺劚閳诲秹濮�閵堝棌鎷洪梺鍛婄箓鐎氼剟鏁撻挊澶屽煟鐎规洘鍔曡灃闁告侗鍠栨禒濂告⒑濮瑰洤鐏い锝庡櫍楠炲繑顦版惔銏犳瀭闂佸憡娲﹂崜娑⑺囬妷鈺傗拺闂傚牊绋撴晶鏇㈡煙濞村澧茬紒宀冮哺缁绘繈宕堕妸銉嫹婵犳碍鐓犻柟顓熷笒閸旀粍绻涢崨顓燁棤缂佽鲸鎹囧畷鎺戔枎閹存繂顬夐梻浣瑰濞插秹寮插☉婊呬罕闂備礁鎲＄粙鎴︽偤閵娾晛鐓曢柟鐑橆殕閻撴洟鎮橀悙鎻掆挃闁瑰啿鎳忛妵鍕晜閼测晝鏆ら梺鍝勬湰閻╊垶骞冮姀銈嗙叆閻庯綆浜欏ǎ顔戒繆閵堝洤啸闁稿鍋ら幃褔鎮╁Ч鍥锋嫹娓氾拷瀵挳濮�閳╁啯鐝栭梻浣芥硶閸犳捇寮查銈呭灊濠电姵纰嶉崑鎰版偣閸ヮ亜鐨烘い鏃�鍔曢埞鎴︽倻閸モ晝校闂佸憡鎸婚悷锔界┍婵犲啰顩烽悗锝庡亞閸樿鲸绻濋悽闈浶㈤柛濠勵焾鍗卞┑鐘崇閻撳啴鎮峰▎蹇擃仼闁诲繑鎸抽弻鐔碱敊鐟欏嫭鐝氶悗瑙勬穿缁叉儳顕ラ崟顒傜瘈閹肩补鎳ｉ悢鍏尖拻闁稿本鐟ㄩ崗宀�绱掗鍛仸妤犵偞鍔栭妶锝夊礃閵娧呭炊闂備礁鎼粙渚�宕㈡總鍛婂珔闁绘柨鍚嬮悡鐔兼煛閸屾氨浠㈤柟顔藉灴閺岋綁骞掑鍥╃厯闂佸搫琚崝鎴濐嚕閹绢噮鏁傞柛娑卞弾娴兼挸鈹戞幊閸婃鎱ㄩ悜钘夌；闁绘劗鍎ら崑瀣節婵犲倹鍣烘い顐ｆ礋閺岀喖鎮滃鍡樼暥缂備胶濮烽弫濠氬蓟閻斿吋鍊绘俊顖濆亹閻ｅジ姊洪崨濠呭妞ゆ垵顦～蹇撁洪鍕炊闂佸憡娲﹂崢楣冨礉閸︻厾纾藉ù锝堟鐢稓绱掔拠鎻掞拷鍧楀箖妤ｅ啯鍊婚柦妯侯槺椤斿﹤鈹戞幊閸娧囧箯妞嬪海纾奸柨鐔剁矙瀹曟﹢顢欓悾灞藉妇濠电姷鏁告慨瀵告崲閹烘鍋╅弶鍫涘妸娴滄粓鏌ㄩ弮鍥舵綈婵炲懎锕ラ幈銊︾節閸涱噮浠╃紓浣介哺鐢帟鐏掗柣鐘叉处閻擄繝鎮楅搹鍦＝闁稿本鐟чˇ锔姐亜閹存繃顥㈢�规洖缍婂畷绋课旈敓浠嬫倶閹惰姤鐓ラ柡鍐ㄥ�告禍鍓э拷瑙勬礀椤︾敻寮婚弴鐔虹瘈闊洦娲滈弳鐘电磼閸撗嗘闁搞劏娉涢～蹇撁洪鍕暰閻熸粌绻掔划濠氬箮閼恒儳鍘甸梺鎯ф禋閸嬪懎鐣峰畝鍕厪闁糕剝顨呴敓钘夋憸閸欏懎顪冮妶鍛闁瑰啿顦甸獮蹇撁洪鍛嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥崝锕傛煙椤曞棛绡�闁诡喓鍨藉畷妤呮嚃閳轰礁绠炴繝鐢靛Х閺佸憡鎱ㄩ幘顔肩柈闁绘鐗婂▍鐘绘⒑椤掞拷缁夌敻鎮″▎鎰垫闁绘劘灏欐禒銏ゆ煟韫囧﹥娅婇柡灞界Ч閹稿﹥寰勫Ο鐑╂瀰濠电姵顔栭崳顖炲箯閻戣姤鈷戠紓浣癸供閻掔偓銇勯弴鍡楁搐閺嬩胶鎲搁悧鍫濈瑲闁抽攱甯掗湁闁挎繂鐗婇鐘绘偨椤栨稓鈾佸ǎ鍥э躬椤㈡洟濮�閻樿櫕顔掗梺鑺ヮ焽閸犳牠寮婚悢鍏煎�锋い鎺嶈兌缁嬪洤顪冮妶鍡樼濞存粠鍓熼弫鎾绘偩鐏炵虎浠ч梺褰掝棑閸忔﹢寮诲☉銏犲嵆闁靛鍎遍～鈺呮⒑鐠恒劌鏋欐俊顐㈠閹ê顫濇潏銊ュ簥濠电偞鍨崹褰掓煁閸ャ劎绡�闂傚牊绋撴晶鏃堟煣韫囨捇鍙勬慨濠冩そ瀹曨偊宕熼棃娑樺Η闂傚倸鍊哥�氼剛锟芥凹鍘剧划姘綇閵娧呯槇闂佹悶鍎撮崺鏍疾濠靛鈷戦梻鍫熺〒缁犲啿鈹戦锝呭箺閻庨潧銈稿畷姗�顢欑憴锝嗗闂佽崵濮村ú鐘绘晸閸婄喐鐝柣婵囩箘缁辨挻鎷呴崫鍕戯綁鏌ｅΔ鍐ㄐ㈡い鏇秮椤㈡洟鏁冮敓鐣岀不閼姐倗纾藉ù锝咁潠椤忓懐顩茬憸鐗堝笚閳锋垿鏌ゅù瀣澒闁瑰嚖绻濋弻娑㈠箼閸曨厾鏆ら悗瑙勬磸閸庢娊鏁撻弬銈囩У闁稿鍊婚幑銏ゅ幢濞戞瑧鍘介梺瑙勬緲閸氾拷缂併劌顭烽弻銊╂偄鐠囨畫鎾绘煟濡や焦绀夐柣蹇擃儐缁绘稒娼忛崜褏袣濡炪値鍋勯ˇ闈涚暦閿濆牏鐤�婵炴垶鐟ч崢顏堟⒑閸撴彃浜濈紒璇茬Т鍗遍柟闂寸劍閻撶喖鏌曢崼婵嬵�楁繛鍛Ч閺岋紕浠﹂悙顒傤槷缂備胶濮电粙鎾绘晸閺傘倗绉靛ù婊呭厴楠炲繘鎮滈挊澶婂敤濡炪倖鎸鹃崑鐔煎储闁秵鈷戦柛锔诲幖閸斿鏌涢妶鍡曚孩闁靛洦鍔欓獮鎺楀箻鐎涙褰搁梻鍌欑劍閹爼宕曢鐐茬閻忕偠袙閺嬫棃鎮橀悙鐢垫憘婵炴挸顭烽弻鏇㈠醇濠靛浂妫＄紓渚婃嫹闁告劦浜炵壕鍏笺亜閺傚灝鎮戦柟鐧哥稻娣囧﹪宕ｆ径濠傤潚濡ょ姷鍋炵敮鈥愁嚕椤曪拷楠炴﹢寮堕幋顓濈处闂傚倷鐒︾�笛呮崲閸屾侗娈介柛娑橈功椤╁弶绻濇繝鍌滃闁绘挾鍠栭悡顐﹀炊閵婏附鍎庨梺鎼炲�楅崰鏍蓟閵娾晜鍋勯悹鍥ㄧ暙閹炬番浜滈柡鍐挎嫹闁绘濮撮悾鐑藉级濞嗙偓鍍甸柣鐘烘閸庛倝鎮楅浣虹瘈闁汇垽娼ф牎闂佸憡绻傞柊锝夊极閹捐绠ｉ柟鐑樻濡差噣鏌х紒妯煎⒌闁哄本绋戦埥澶愬础閻愯尙顔掗梻浣瑰缁嬫帞鍒掑畝鍕厴闁硅揪闄勯崑鎰版偣閸ュ洤鍟╃槐锝夋⒒娴ｅ憡鎲搁柛锝冨劦瀹曟垿宕卞☉妯肩枀闂佸湱铏庨崰妤呭疾濠靛鐓ラ柣鏂垮閻瑩鏌涢埡鍐ㄤ槐妤犵偛顑夐弫鍌炴寠婢跺鐫忛梻鍌欑婢瑰﹪鎮￠崼銉ョ；闁告侗鍘滈幒妤�绀嬫い鎺戝�婚惁鍫濃攽閻愯尙澧曢柣蹇旂箞瀵悂濡舵径瀣幐婵炶揪缍�椤宕愰幇顕嗘嫹鐟欏嫭绀堝褎顨堥幑銏犫攽鐎ｎ亞锛滈梺闈涚墕閹冲繘宕愰姘ｆ斀闁绘﹩鍠栭悘杈ㄧ箾婢跺娲撮柡浣稿暣閺佸啴宕掑顒�浜堕梻鍌欑贰閸撴瑧绮旈悽绋跨厱闁硅揪闄勯悡鏇熺節闂堟稒顥滄い蹇婃櫊閺岋繝宕卞Ο鍏煎櫚闂佸搫鐭夌徊鍊熺亙闂佽法鍠嶇划娆撳极閸愵噮鏁傞柛顐ｇ箘閻ｆ椽姊婚崟顐ｅ窛缂侇喛顕ч埥澶娢熼柨瀣垫綌婵犵數鍋涘Λ娆撳垂閻㈠摜宓侀柛顐ゅ枍缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら悧鐘茬暦濠靛妲鹃悗鍨緲閿曪箓骞戦崟顖毼╃憸宀�绮径鎰拺闁告繂瀚埢澶愭煕濡湱鐭欓柟顕嗙節瀵挳濮�閿涘嫬寮虫繝鐢靛█濞佳兾涘▎鎾抽棷婵炲樊浜濋崑锝夋煙閺夊灝顣崇痪鎹愭硶缁辨帗娼忛妸銉х懖濠电偟鍘х换妯讳繆閹间焦鏅濋柨鐔烘櫕閸犲﹤顓奸崪浣瑰瘜闂侀潧鐗嗗Λ娆戜焊椤撱垺鐓忛柛顐犲焺閻掗箖鏌ｉ敐鍥у幋闁诡喓鍨婚崰濠冩綇閵婏附鐝濋梻鍌欒兌缁垶鏁冮姀鐙�鐒界憸搴ㄥ箚閺冿拷缁绘繈宕掑Δ浣规澑闂備胶绮摫妞ゆ梹鐗犲鎶筋敍濞戞绠氶梺鍦帛鐢宕甸崶鈺嬫嫹鐟欏嫭绀冮柛銊ョ仢閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒勫几閸愨晝绡�婵炲牆鐏濋弸鐔搞亜閵婏箑濮嶆鐐茬箲椤︾増鎯旈娑橆伓濠电偛鐗嗛悘婵嗏枍濮楋拷閺屾稓锟斤綆浜烽煬顒勬煟濞戝崬鏋涢摶锝夋煠濞村娅囬柨娑欑矊閳规垿鍩ラ崱妤冧化缂備緡鍣崹鍫曘�侀弮鍫熷亜闁稿繐鐨烽幏缁樼箾鏉堝墽绉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?
			}
			else {
				role.setTransformid(shape);
			}
			role.sendWhoSeeMeAndMe(send);	
			if(rideid > 0){
				final Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(role.getRoleID(), fire.pb.item.BagTypes.BAG, true);
				if (bag.getItemNum(rideid, 0) > 0) 
					new PEquipRideProc(playerid, rideid, -1).submit();
			}
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if (changetype == 3) {
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢凹鍙冨畷宕囧鐎ｃ劋姹楅梺鍦劋閸ㄥ綊宕愰悙宸富闁靛牆妫楃粭鎺楁煥閺囶亜顩紒顔界懆缁犳盯寮崒婊呮闂備線娼ф蹇曞緤閸撗勫厹闁绘劦鍏欐禍婊堟煙鐎涙绠栭柛鐘筹耿閺屾洟宕卞Δ浣告畻濡ょ姷鍋為幑鍥嵁閹存惊鏃堟晸閻ｅ瞼绀婂┑鐘叉搐缁犳牠鏌嶆潪鎵窗闁哥喎鎳忛妵鍕籍閸屾艾浠樻繝銏㈡嚀閻楀繒妲愰幘瀛樺闁告繂瀚竟鏇㈡⒑缁嬪灝顒㈠┑鐐诧躬楠炲啫螣鐞涒剝鏂�闁诲函缍嗛崑鍡涙偩閹惰姤鈷掗柛灞剧懆閸忓本銇勯鐐靛ⅱ闁瑰箍鍨介獮鍥级閼愁垍鏇㈡煟鎼搭垳绉甸柛鎾寸〒缁牊绻濋崶銊у幍闁诲海鏁搁…鍫濇毄缂備胶鍋撻崕鎶藉Χ閹间礁钃熼柨婵嗘啒閻斿吋鎯為柣褍鎽滅粈濠囨⒒娴ｅ憡鍟為柣鐔间憾楠炲繘鎮滈懞銉㈡嫽婵炶揪绲介幉锟犲箚閸儲鐓涢柛顐亜婢ь噣鎮￠妶鍡欑瘈闂傚牊绋撴晶銏犫槈閹惧磭校缂佺粯鐩獮瀣倷闂堟稒娈归梻浣哥秺椤ユ捇宕楀锟藉顐﹀箛椤撶喎鍔呭┑鐘绘涧濞层倝鏁撻弬銈囩М婵﹪缂氶妵鎰板箳濠靛浂妫栭梻浣侯焾缁绘垿鏁嬪銈嗘穿缂嶄線鐛锟介、娆撴寠婢跺鐫忛梻鍌欑劍閻綊宕规繝姘瀬闁归棿绀佺粈澶愭偣妤﹁￥锟斤拷闁猴拷娴犲鐓熸慨妤�妫楅弸娑㈡煟韫囨稐鎲鹃柡灞剧洴閸╋繝宕掑鍐ｆ嫲闁诲氦顫夊ú妯兼崲閸繍鍤曞ù鐘差儛閺佸洭鏌ｉ弮鍥ㄨ吂缂併劎鏁诲缁樻媴閸涘﹤鏆堥梺鍛婃缁犳挸鐣烽弶璇炬棃宕ㄩ闂寸暗闂備礁鎲￠崝锕傚窗閺嶎偆妫憸鏃堝蓟閿濆绠涙い鎾跺枔缁嬪洤顪冮妶鍐ㄥ姎妞ゆ垵妫濇俊鐢稿礋椤栨稒娅嗛梺鍏肩ゴ閺呮繈寮抽妶澶嬧拺闁告繂瀚悞璺ㄧ磼缂佹绠撻柣锝囧厴瀹曪繝鎮欓埡鍌滐拷濠氭椤愩垺鎼愰悗娑掓櫊瀹曠喖宕橀瑙ｆ嫽婵炴挻鐔幏閿嬬箾娴ｅ啿鍘惧ú顏勎ч柛銉╂敱鐎氳鎱ㄥΟ鐓庡付闁诲骏绠撻弻鐔碱敊閸濆嫮浠剧紓浣诡殘閸犳牠寮幘瀵割浄閻庯綆浜ｉ幗鏇炩攽閻愭潙鐏﹂柨鏇楁櫊閹繝濡烽埡鍌滃幈闂佽澹嬮弲娑欎繆閼恒儳绠鹃柛顐ゅ枔閸欙拷闂佸搫鐭夌徊楣冨箚閺冨牆顫呴柨婵嗘媼濡喐绻濋悽闈涱�撻柟椋庡厴濮婃椽顢楅敓鐣岀矓閻㈢纾垮璺侯儍娴滄粓鐓崶銊﹀暗濠⒀勬礈缁辨帡鎮▎蹇擃伀缂佺娀绠栭弻娑㈠焺閸愵亝鍣ф繛瀛樼矒缁犳牕顕ｉ锕�閱囬柕澶涜吂閹锋椽鏌ｉ悩鍙夊鐟滄澘鍟撮、妤呭閵堝棛鍘介梺鍝勫暞閸ㄥ灚鏅剁�涙﹩娈介柣鎰皺缁犲鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠庢綂闂佺粯锚濡﹤螞瀹�鍕拺閺夌偞澹嗛ˇ锕傛煥閺囥劋閭�殿喖顭烽崹楣冨箛娴ｅ憡鍊梺纭呭亹鐞涖儵鏁撻挊澶岋紞妞ゆ梹鍔楃槐鎾诲磼濞嗘垵濡介梺鍛婃⒐閻楃娀濡撮崘鈺冪瘈闁搞儜鍡樻啺闂備胶鍋ㄩ崕鏌ュ礈濮樿泛瑙﹂悗锝庡枛缁犲湱绱掗鐐仧闁归鍏樺畷妯侯啅椤旂厧螚闂傚倸鍊搁崐宄懊归崶褜娴栭柕濞у懐鐒兼繛杈剧悼鐏忋劑骞忓畡閭︽僵妞ゆ劑鍨圭粊顕�鎮楀▓鍨灕妞ゆ泦鍥х叀濠㈣泛谩閻斿吋鐓ラ悗锝呯仛缂嶅矂姊婚崒娆戭槮闁硅绻濋妴鍐醇閵夈儳锛涢梺缁樻煥閹芥粓銆呴柨瀣ㄤ簻闁规儳宕悘顏堟煟閹捐泛鏋涙鐐寸墪鑿愭い鎺炴嫹闁诲繐宕…璺ㄦ喆閸曞棙鍨挎俊鐢稿礋椤栵絾鏅ｉ梺缁樕戣ぐ鍐嵁鐎ｎ喗鍊垫繛鍫濈仢閺嬫稒銇勯鐘插幋鐎规洘妞藉畷鐔碱敍濮橀硸妲伴梻渚�娼ц噹闁告侗鍨扮粊锕傛⒒閸屾瑨鍏岄柟铏崌瀹曘儳锟斤綆鍠栫粻姘憋拷鐧告嫹闁告洦鍋勯悗顓㈡⒑閸撴彃浜濇繛鍙夛耿瀹曟垵螣閼姐倗鐦堟繝鐢靛Т閸婄粯鏅跺☉銏＄厓闂佸灝顑呴悘鎾煙椤旇偐绉烘鐐扮窔楠炴帡骞嬪┑鎰拷鎶芥⒒娴ｅ憡鎯堟い鎴濇瀹曞綊宕稿Δ锟介拑鐔兼煥濞戞ê顏甸柟椋庡厴閺佹劖鎯斿┑鍥ф灓闂備胶绮幐鎼佸触鐎ｎ喓锟藉啴濡烽埡鍌氾拷鐑芥煠绾板崬澧版い鏃�甯″鐑樻姜閹殿喖濡介梺鍦嚀濞差厼顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?
		//	role.setCruiseid(shape);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姵濞婇弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁绘娲滈崣鍛存⒑闂堟单鍫ュ疾濠婂牆纾挎俊銈呮噺閻撴洟鏌嶉埡浣告灓婵☆垰鎳愰幉鎼佹偋閸繄鐟查梺鍝勬噺閻擄繝寮诲☉銏╂晝妞ゆ劦婢�缁ㄨ偐绱撻崒姘毙㈤柣妤�妫濋崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆЦ婵炲憞鍕瘈婵炲牆鐏濋弸鐔兼煙缁嬪灝鏆遍柨鏇樺灪缁楃喖鏁撻挊澶樻綎闁惧繐婀辩壕鍏间繆椤栨碍绂嬪ù婊勭矎閻忔帗绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厽闁规儳鐡ㄧ粈瀣煙椤旂瓔娈滈柡浣瑰姍瀹曘劑顢橀悢鍑ゆ嫹鎼淬劍鈷掑〒姘搐瀵箖鏌涢妸銉у煟鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梻浣告啞閹稿棝宕熼銏画闂傚倸鍊烽懗鍓佹兜閸洖鐤炬繛鎴炵啲閹峰嘲顫濋鐔哄嚒闂佷紮绲介崲鏌ワ綖濠婂牊鏅稿ù鐘差儏缁犳牗绻涢崱妯绘儎闁轰礁妫楅…璺ㄦ崉閻氬瓨鏁鹃梺绋匡攻濞茬喎顫忔繝姘＜婵﹩鍓ㄩ幏閿嬵槹鎼达絿鐒兼繛鎾寸啲閹烽攱顨ラ悙鎼當妞ゎ厹鍔戝畷鐓庘攽閸垹鐐婇梻浣烘嚀閸氬鎮鹃鍫濈鐎癸拷閿熺晫鍒掓繝姘亹闁惧浚鍋勫鍨攽鎺抽崐鏇㈩敄閸℃瑱鎷峰顒傜Ш闁诡喗顨呴埢鎾诲垂椤旂晫浠屾俊鐐�栧▔锕傚炊閼稿灚娅嶉梻浣侯焾缁绘帡宕㈣濞嗐垽鎮欏ù瀣杸闂佺粯蓱瑜板啴顢旈埡鍌ゆ闁绘劖娼欐慨鍥煃鐟欏嫬鐏撮柟顔界懇閹虫粓妫冨☉娆撴暘缂傚倸鍊峰ù鍥ь嚕閹捐泛鍨濇繛鍡樻尵瀹撲礁顭块懜闈涘闁诲繑濞婇弻锟犲磼濡搫濮曢梺璇茬箣缁舵艾顫忓ú顏勭闁圭粯甯婄花鐓庘攽閻愭彃绾ч柨鏇樺灲瀹曞搫鈽夐姀鐘殿吅闂佺粯顭囬弫鎼佹晬濠婂喚娓婚柕鍫濇婢ь剛绱掔�ｎ偄绗х紒顔肩墦瀹曟﹢鍩￠崘顏嶅晭闂備礁鎲℃笟妤呭储娴犲瑤澶愭倷閻戞鍘梺鎼炲劀閸愬彞绱斿┑鐘殿暯閸撴繈骞冮崒娑楃箚闁绘垹鐡旈弫宥嗙節闂堟稒顥為柛搴㈡崌濮婅櫣鎷犻幓鎺濆妷濡炪倖姊归悧鐘茬暦娴兼潙鍐�妞ゆ挻鍐婚幏鐑芥晝閸屾稑锟藉鏌﹀Ο渚Ч闁诲寒鍓熷娲捶椤撶儐鏆┑鐘灪閿氭い鏂跨箰閳规垹锟斤綆鍋嗛崢閬嶆煟韫囨洖浠滃褌绮欓幆灞剧節閸ャ劎鍘搁柣搴秵閸嬪棝濡撮幒妤佺叆闁绘柨鍤栭幏鐑芥偆娴ｅ湱绉锋繝鐢靛仜瀵爼鎮у鍛潟闁绘劕顕弧锟介梺鎼炲劘閸庡骞忛柨瀣缂侇垱娲橀悗濠氭⒑鐟欏嫬鍔ょ痪缁㈠弮閹偓銈ｉ崘鈺佷画濠电姴锕ら崯鎷屽�寸紓鍌欐祰妞存悂骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾剁磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺闁硅偐鍋涢敓鑺ユ礋閹崇喖顢涘┑鍫滅胺闂傚倷鐒︾�笛呮崲閸岀偛绠犻幖娣妼濮规煡鏌ｉ幇顔煎妺闁绘挻鐩弻娑樷槈閸楃偞鐏撶紓浣哄Х閸嬨倝寮婚敍鍕勃閻犲洦褰冮～鍥倵濞堝灝娅橀柛鎾跺枎閻ｇ柉銇愰幒婵囨櫓闁荤喐鐟ョ�氼剟鎯侀柆宥嗏拻闁稿本鐟ч崝宥嗕繆閻愬弶鍋ョ�规洏鍨介幃锟犵嵁椤掍胶鈽夐摶鏍煕濞戝崬骞橀柛妯绘尦濮婃椽鎮烽柇锕�娈堕梺绋款儐缁嬫挸鈻庨姀銈嗗�锋繛鏉戭儐閺傦拷闂備胶绮摫鐟滄澘鍟撮、鏃堝Χ婢跺鍘搁梺璺ㄥ枍缁瑩骞冮悜鑺ユ櫢缂佽尙灏峚l()
		//	role.setCruiseid2(shape2);
			//role.setCruiseid3(shape3);
		//	Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
		//	SAddUserScreen sadduser = new SAddUserScreen();
		//	sadduser.rolelist.add(addRole.getRoleBasic());
		//	role.sendWhoSeeMeAndMe(sadduser);
			//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		}
		else if (changetype == 4)
		{
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐差渻閵堝棗绗掓い锔垮嵆瀵煡顢旈崼鐔蜂画濠电姴锕ら崯鐗堟櫏婵犵數濯撮幏宄般�掑鐐濠殿喖锕ㄥ▍锝囨閹烘嚦鐔兼惞闁稓绀冨┑鐘殿暯濡插懘宕戦崟顓ㄦ嫹濮樼厧鏋ら柛鎺撳笚缁绘繂顫濋鐐版睏缂傚倸鍊烽悞锕傗�﹂崶顒�鍌ㄩ柣銏犳啞閳锋垹鐥鐐村婵炲吋鍔欓弻娑㈠籍閹惧墎鏆ら悗瑙勬礋濞佳囧煝鎼淬劌绠婚柡澶嬪煀閹风兘宕归锝呭伎濠殿喗顨呭Λ妤佹櫠缂佹ü绻嗛柟缁樺笧缁夋椽鏌＄仦鐐鐎规洘鍎奸ˇ鍙夈亜韫囷絽骞楁い銊ｅ劦閹瑩寮堕幋鐐剁檨婵°倗濮烽崑娑㈩敄閸涙潙鐓橀柟杈剧畱缁犳稒銇勮箛鎾村櫣濞存粍绻堝濠氬磼濮橆剨鎷烽悜鑺ュ�块柨鏇炲�哥粻鏍煕椤愶絾绀�缂侊拷婢跺矉鎷烽惂鍛婂闂佸憡娲﹂崑鍡涙晬濞嗘挻鍋℃繝濠傛噹椤ｅジ鎮介娑樼缂侇喖顭烽幃娆撴倻濡厧甯惧┑鐘垫暩閸嬫盯鎮樺┑瀣閻庢稒顭囩粻鍓х磼濡わ拷閹碱偅鎱ㄩ崒鐐寸厸閻忕偛澧藉ú鎾煕閳轰礁顏�规洘锕㈤幃娆擃敆閸屾稒顔旂紓鍌氬�搁崐鐑芥嚄閼稿灚鍙忓Δ锝呭枤閺佸鎲搁弮鍫濈伋闁哄啫鐗嗙粈鍐┿亜閺傛寧顫嶇憸鏃堝蓟濞戞矮娌柛鎾楋拷濡俱劑姊虹紒妯肩畺闁绘濮撮～蹇涙惞閸︻厾鐓撻柣鐘充航閸斿酣顢欐径鎰拺闁圭瀛╃壕鎼佹煕閵娿倗鐭欓柟顔诲嵆椤㈡岸鏁撻挊澶屾殾婵鎷锋い銏∶…銊╂晸閽樺－褍螖閸涱喒鎷洪梺闈╁瘜閸樺ジ宕濈�ｎ喗鐓曢柕濞垮劤缁夎櫣锟借娲橀崝娆撳箖濞嗘挻鍊绘俊顖炴敱鐎氬ジ姊婚崒姘拷鎼佹偋婵犲啰鐟规俊銈呮噺閸婂灝螖閿濆懎鏆為柣鎾存礋楠炴牗娼忛崜褏锛熼梺鎸庣☉缁夊墎妲愰幒妤婃晩缁绢厼鍢叉导鎰版⒑娴兼瑧绉剁紒缁樼箞瀵宕堕浣规珕闂佽姤锚椤﹀崬危閿濆鈷掗柛灞剧懅缁愭梹绻涙担鍐叉处閸嬪鏌涢埄鍐夸緵婵炲牅绮欓弻娑樷槈濮楀牆濮涘銈傛櫆閻擄繝寮婚垾鎰佸悑閹肩补锟藉磭顔戦梻浣虹帛閹歌煤閺嶎厼鐓橀柟杈鹃檮閸嬫劙鏌熺紒妯虹瑲婵炲牆澧庣槐鎾存媴閸濆嫅銉╂煕鐎ｎ剙鏋涢柡浣规崌閹崇偤濡烽鍏兼珱闂備礁鎽滄慨鐢告偋閻樿鐏抽柨鏇炲�归崐濠氭煢濡警妲洪柣锝嗘そ濮婃椽妫冨☉姘辩杽闂佺锕ラ悧鐘茬暦閹达箑鍐�妞ゆ挾鍠庨敓钘夌仛缁绘盯骞嬮悜鍡曠棯濡炪倕绻愰悧婊堝极閸岀偞鍋ｅΔ锕侊骏閿熸枻鎷烽梺鐚存嫹濞寸姴顑嗛悡鐔兼煙闁箑骞楃紓宥嗗灴閺岋綀绠涢妷褏鏆ら梺鍝勭焿缂嶄線骞冮妶鍡樺闁告縿鍎板鎾绘⒒娴ｇ瓔鍤冮柛鐘冲哺瀹曟垿濡舵径濠勵唶婵犵數濮撮崯顐ゆ閻愮繝绻嗘い鏍ㄧ矊鐢爼鏌℃担瑙勫�愰柡宀嬬秮閹垽宕妷褏鍘戠紓鍌欐祰椤曆囨偋閹剧粯鍋樻い鏃囨硶閻わ拷濠电偞鍨堕悷锕�鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺勩儵鏌涢弴銊ョ仩缂侊拷閸愨斂浜滈煫鍥ㄦ尰椤ョ偤鏌涢妶鍛拱缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枙婵倕煤閻旇偐宓佸┑鐘插暞閸庣喖鏌ㄥ┑鍡樺窛闁绘帒銈稿娲礈閹绘帊绨介梺鍝ュУ閹稿墽鍒掔紒妯稿亝闁告劏鏅濋崢鐢告煟鎼淬垻鈾佹い顓炴喘楠炲﹪宕橀鐣屽幗闂婎偄娴勭徊濂告焽椤栫偞鐓涢悘鐐插⒔閵嗘帡鏌ㄩ悢鍛婄伄缂佽尪濮ら弲鑸垫償閿濆懎袣闂佽法鍠嶇划娆忣潖濞差亜浼犻柛鏇ㄥ幘娴煎洭姊洪崫銉バｉ柣妤冨█閹即顢氶敓钘夌暦閸楃儐娼╅柛蹇撱仚閳哄倷绻嗛柣鎰典簻閿熺獤鍛筏闁伙絽鑻ˉ姘亜閹惧崬鐏柛搴☆槹閵囧嫯绠涢幘璺侯暫缂備胶濮靛銊╁箟閸濄儻鎷烽敐搴℃灈缁炬儳顭烽弻鏇＄疀鐎ｎ亷鎷烽弽顓熷亗婵炴垶鐔幏鐑芥儌閸涘﹤顏堕梺璇插嚱缂嶅棝宕滃☉婧惧徍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴炩棨濞差亶鏁囬柣鎰У閻╊垰鐣峰锟芥俊鎼佸閳藉棙缍屽┑鐘愁問閸犳銆冮崨顓囨稑鈻庨幇顕呮锤闂侀潧鐗嗛幊澶愬绩娴犲鐓ユ繛鎴灻鈺伱瑰鍐﹀仮闁哄本绋掔换婵嬪礃椤忓嫧鍚傞梺缁樻尪閸婃牗绌辨繝鍥舵晬婵犲﹤鍟禒姗�姊洪幖鐐插缂佽瀚伴弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剝鐏嬪┑鐐村灟閸ㄥ綊鎮″Ο纭锋嫹楠炲灝鍔氶柟鍐差樀瀵劍绂掔�ｎ偆鍘藉┑鈽嗗灠閹碱偆鐥椤法鎹勯崫鍕典純闂佸搫鏈粙鎺旀崲濠靛绀嬫い鎰╁灩缁狅綁姊绘担鍛婃儓闁活剙銈稿畷浼村箻閼告娼熼梺鍦劋閸わ箓鎮㈢拋鎸庢そ椤㈡棃宕熼鍌涙緭闂傚倸鍊搁崐椋庣矆娴ｈ櫣绀婂┑鐘叉硽婢舵劕绠婚悹鍥皺椤ρ冣攽閳藉棗鐏ユ繛鍜冪秮瀵娊鏁傞悙顒�鏋戦梺缁橆殔閻楀棙绌遍鐐寸厸濞达綁娼婚煬顒勬煛瀹�瀣М妤犵偛娲Λ鍐ㄢ槈濮楀棙娴囧┑锛勫亼閸婃牕顫忛悷鎳婃椽鎮㈡總澶嬬稁缂傚倷鐒﹁摫濠殿垱鎸抽弻锝夋偄閻撳簼鍠婇梺鎼炲�曢鍥╂閹惧瓨濯寸紒娑橆儏濞堫參姊虹粙鍖￠練闁稿氦顕ц灋闁绘柨顨庡〒濠氭煏閸繃顥犲褔浜堕弻娑氾拷锝庡亞閵嗘帞绱掗鑲╁ⅵ鐎规洘锕㈤、娆撴偩鐏炶棄姹查梻鍌欒兌缁垶寮婚妸锔芥珷閹兼番鍔嶉崕妤佺箾閸℃ê濮堥柛娆忕箰閳规垿鎮╅幓鎺撴闂侀潧娲︾换鍐╃┍婵犲浂鏁冮柕蹇曞У濞堫參姊虹�圭姵顥夋い锔芥緲椤洩绠涘☉妯煎幐婵炶揪绲介幗婊呯矙婵犳碍鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儺鍓﹂弫瀣喐韫囨稑绠查柕蹇嬪�曠粻锝夋煟濡搫鏆遍幖鏉戯躬濮婃椽宕滈幓鎺嶇敖闂佸摜濮寸粔鍫曞箲閵忋倕骞㈡繛鎴炵懅閸樹粙姊洪棃娑氬濡ょ姵鎮傞幃妯绘綇閵娿倗绠氱紓鍌欑贰濠拷闂侇収鍨遍幈銊︾節閸モ晝绐楅梺闈涙处閸旀瑩鐛幒鎴旀斀闁搞儴鍩栭ˉ娑㈡⒒閸屾瑨鍏屾い顓炵墢閹广垽骞嬮敂鑺ユ珨闂傚倷妞掔槐顔惧緤閸ф绀傛慨妤嬫嫹妤犵偛鍟…銊╁川椤栫偐鏀洪梺璇插嚱缂嶅棝宕戦崨顓涙瀺鐎广儱顦伴埛鎺懨归敐鍫燁仩閻㈩垱鐩弻銊╁即濡や焦鐝氶悗瑙勬礃婵炲﹪銆佸☉銏″�烽柤纰卞墻閸炵敻姊婚崒娆戭槮闁诲繑绻堥、鏍炊閳轰礁袣闂佽法鍠嶇划娆忣潖濞差亜绠归柣鎰絻婵矂姊洪崨濠冪叆闂佸府绲介悾鐑藉閵堝棛鍔堕悗骞垮劚濡矂骞忓ú顏呯厽闁绘柨鎽滈幊鍐倵濮樼厧澧寸�规洘绻堟俊鍫曞幢閹邦亞鐩庨梻浣告惈濞层垽宕濆畝鍕祦婵☆垵鍋愮壕鍏笺亜閺冨倵鎷￠柣鎾炽偢閺岀喖顢欓悾灞惧櫚闂佽鍠楃划宀冪亽闂佺粯鎸告鍝ョ不閵夈儮鏀介柨娑樺娴滃ジ鏌涙繝鍐⒌鐎殿喖顭锋俊鎼佸煛娴ｄ警鍟囨俊鐐�栭崝褏绮婚幋鐘电焼濠㈣埖鍔栭悡銉╂煛閸モ晛浠滈柨鐔绘缂嶅﹪骞冮垾鏂ユ婵☆垰绻愮紞濠囧极閹版澘閱囨い鎰剁悼缁夌兘鏌ｆ惔銈庢綈婵炲弶鐗犻幆宀勫磼閻愯尪鎽曢梺鏂ユ櫅閸燁垱鍒婇幘顔藉仭婵炲棗绻愰鈺冪棯閻愵剙鈻曟慨濠勫劋濞碱亪骞嶉鐓庮瀴闂備礁婀遍幊鎾趁洪鐑嗗殨妞ゆ劧绠戠粻鑽ょ磽娴ｈ偂鎴濃枍閵忋倖鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗
			if(role.getCruiseid() == shape || role.getCruiseid() == 0) {
				role.setCruiseid(0);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姵濞婇弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁绘娲滈崣鍛存⒑闂堟单鍫ュ疾濠婂牆纾挎俊銈呮噺閻撴洟鏌嶉埡浣告灓婵☆垰鎳愰幉鎼佹偋閸繄鐟查梺鍝勬噺閻擄繝寮诲☉銏╂晝妞ゆ劦婢�缁ㄨ偐绱撻崒姘毙㈤柣妤�妫濋崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆЦ婵炲憞鍕瘈婵炲牆鐏濋弸鐔兼煙缁嬪灝鏆遍柨鏇樺灪缁楃喖鏁撻挊澶樻綎闁惧繐婀辩壕鍏间繆椤栨碍绂嬪ù婊勭矎閻忔帗绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厽闁规儳鐡ㄧ粈瀣煙椤旂瓔娈滈柡浣瑰姍瀹曘劑顢橀悢鍑ゆ嫹鎼淬劍鈷掑〒姘搐瀵箖鏌涢妸銉у煟鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梻浣告啞閹稿棝宕熼銏画闂傚倸鍊烽懗鍓佹兜閸洖鐤炬繛鎴炵啲閹峰嘲顫濋鐔哄嚒闂佷紮绲介崲鏌ワ綖濠婂牊鏅稿ù鐘差儏缁犳牗绻涢崱妯绘儎闁轰礁妫楅…璺ㄦ崉閻氬瓨鏁鹃梺绋匡攻濞茬喎顫忔繝姘＜婵﹩鍓ㄩ幏閿嬵槹鎼达絿鐒兼繛鎾寸啲閹烽攱顨ラ悙鎼當妞ゎ厹鍔戝畷鐓庘攽閸垹鐐婇梻浣烘嚀閸氬鎮鹃鍫濈鐎癸拷閿熺晫鍒掓繝姘亹闁惧浚鍋勫鍨攽鎺抽崐鏇㈩敄閸℃瑱鎷峰顒傜Ш闁诡喗顨呴埢鎾诲垂椤旂晫浠屾俊鐐�栧▔锕傚炊閼稿灚娅嶉梻浣侯焾缁绘帡宕㈣濞嗐垽鎮欏ù瀣杸闂佺粯蓱瑜板啴顢旈埡鍌ゆ闁绘劖娼欐慨鍥煃鐟欏嫬鐏撮柟顔界懇閹虫粓妫冨☉娆撴暘缂傚倸鍊峰ù鍥ь嚕閹捐泛鍨濇繛鍡樻尵瀹撲礁顭块懜闈涘闁诲繑濞婇弻锟犲磼濡搫濮曢梺璇茬箣缁舵艾顫忓ú顏勭闁圭粯甯婄花鐓庘攽閻愭彃绾ч柨鏇樺灲瀹曞搫鈽夐姀鐘殿吅闂佺粯顭囬弫鎼佹晬濠婂喚娓婚柕鍫濇婢ь剛绱掔�ｎ偄绗х紒顔肩墦瀹曟﹢鍩￠崘顏嶅晭闂備礁鎲℃笟妤呭储娴犲瑤澶愭倷閻戞鍘梺鎼炲劀閸愬彞绱斿┑鐘殿暯閸撴繈骞冮崒娑楃箚闁绘垹鐡旈弫宥嗙節闂堟稒顥為柛搴㈡崌濮婅櫣鎷犻幓鎺濆妷濡炪倖姊归悧鐘茬暦娴兼潙鍐�妞ゆ挻鍐婚幏鐑芥晝閸屾稑锟藉鏌﹀Ο渚Ч闁诲寒鍓熷娲捶椤撶儐鏆┑鐘灪閿氭い鏂跨箰閳规垹锟斤綆鍋嗛崢閬嶆煟韫囨洖浠滃褌绮欓幆灞剧節閸ャ劎鍘搁柣搴秵閸嬪棝濡撮幒妤佺叆闁绘柨鍤栭幏鐑芥偆娴ｅ湱绉锋繝鐢靛仜瀵爼鎮у鍛潟闁绘劕顕弧锟介梺鎼炲劘閸庡骞忛柨瀣缂侇垱娲橀悗濠氭⒑鐟欏嫬鍔ょ痪缁㈠弮閹偓銈ｉ崘鈺佷画濠电姴锕ら崯鎷屽�寸紓鍌欐祰妞存悂骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾剁磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺闁硅偐鍋涢敓鑺ユ礋閹崇喖顢涘┑鍫滅胺闂傚倷鐒︾�笛呮崲閸岀偛绠犻幖娣妼濮规煡鏌ｉ幇顔煎妺闁绘挻鐩弻娑樷槈閸楃偞鐏撶紓浣哄Х閸嬨倝寮婚敍鍕勃閻犲洦褰冮～鍥倵濞堝灝娅橀柛鎾跺枎閻ｇ柉銇愰幒婵囨櫓闁荤喐鐟ョ�氼剟鎯侀柆宥嗏拻闁稿本鐟ч崝宥嗕繆閻愬弶鍋ョ�规洏鍨介幃锟犵嵁椤掍胶鈽夐摶鏍煕濞戝崬骞橀柛妯绘尦濮婃椽鎮烽柇锕�娈堕梺绋款儐缁嬫挸鈻庨姀銈嗗�锋繛鏉戭儐閺傦拷闂備胶绮摫鐟滄澘鍟撮、鏃堝Χ婢跺鍘搁梺璺ㄥ枍缁瑩骞冮悜鑺ユ櫢缂佽尙灏峚l()
				role.setCruiseid2(0);
				role.setCruiseid3(0);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}
		} else if (changetype == 5) {
				//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐎涙繄绱撻崒姘毙㈤柨鏇ㄤ簻椤曪絿鎷犲顔兼倯婵犮垼娉涢敃锝囨閸洘鈷戦柛娑橈攻婢跺嫰鏌涢幘瀵告噧闁宠绉归弫鎰緞鐎Ｑ勫婵犵數鍋犵亸顏堫敋瑜旈悰顔嘉旀担鍏哥盎闂侀潧顭堥崕濠氱叕椤掑偊鎷峰▓鍨灈妞ゎ參鏀辨穱濠囧箹娴ｅ摜鍘搁梺绋挎湰閻喚鑺辨禒瀣拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炲鏁傜紒妯绘珕闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝栭梻浣芥硶閸犳捇寮查銈呭灊闁挎繂鎲橀弮锟介幏鍛存惞鐠団�虫櫗闂傚倷鑳堕幊鎾绘偤閵娾晜鍋￠柕澶嗘櫆閸婂爼鏌嶉崫鍕殶缁炬儳銈搁弻锝呪枎濞嗘劕顏堕梻浣规偠閸斿繐鈻斿☉顫稏闊洦鎷嬪ú顏嶆晜闁告洦鍋嗛敓绛嬪幖椤啴濡堕崱妯碱槬闂佺懓鍟块柊锝呯暦濠婂啰鏆﹂柛銉㈡櫇閿涙繃绻涙潏鍓у埌闁圭⒈鍋婇崺銏ゅ醇閵忋垻锛滈梺缁樏壕顓熸櫠閻㈢鎷峰▓鍨灈妞ゎ厾鍏橀獮鍐閵堝棙鍎梺闈╁瘜閸欏繒妲愰崣澶岀瘈缁剧増蓱椤﹪鏌涢妸鈺傛锭闁宠绉归弫鎰緞鐎ｎ亙鐢婚梻浣告惈鐞氼偊宕曢弻銉ョ厱闁瑰濮风壕濂告倵閿濆骸浜介柛搴涘劦閺屾稒鎯旈敍鍕懷囨煛鐏炲墽鈾侀柟顖涙婵拷闁绘﹩鍋呴悘鍡涙⒒娴ｈ姤銆冮柣鎺炵畵楠炴垿宕堕锟界粻鐘绘煟閹邦剚鎯堥崬顖氼渻閵堝棙鐓ラ柛姘儏閳诲秴鈽夐姀鈾�鎷绘繛鎾寸啲閹烽攱绻涢懝鏉垮惞缂佽京鍋ゅ畷鍗炩槈濡櫣锟筋參姊洪崜鎻掍簼婵炲弶绮岄悾鍨瑹閿熶粙鎮￠锕�鐐婇柕濞э拷濡俱劑姊洪崫鍕櫤闁诡喖鍊垮濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�? by changhao
				role.setCruiseid(shape);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姵濞婇弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁绘娲滈崣鍛存⒑闂堟单鍫ュ疾濠婂牆纾挎俊銈呮噺閻撴洟鏌嶉埡浣告灓婵☆垰鎳愰幉鎼佹偋閸繄鐟查梺鍝勬噺閻擄繝寮诲☉銏╂晝妞ゆ劦婢�缁ㄨ偐绱撻崒姘毙㈤柣妤�妫濋崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆЦ婵炲憞鍕瘈婵炲牆鐏濋弸鐔兼煙缁嬪灝鏆遍柨鏇樺灪缁楃喖鏁撻挊澶樻綎闁惧繐婀辩壕鍏间繆椤栨碍绂嬪ù婊勭矎閻忔帗绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厽闁规儳鐡ㄧ粈瀣煙椤旂瓔娈滈柡浣瑰姍瀹曘劑顢橀悢鍑ゆ嫹鎼淬劍鈷掑〒姘搐瀵箖鏌涢妸銉у煟鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梻浣告啞閹稿棝宕熼銏画闂傚倸鍊烽懗鍓佹兜閸洖鐤炬繛鎴炵啲閹峰嘲顫濋鐔哄嚒闂佷紮绲介崲鏌ワ綖濠婂牊鏅稿ù鐘差儏缁犳牗绻涢崱妯绘儎闁轰礁妫楅…璺ㄦ崉閻氬瓨鏁鹃梺绋匡攻濞茬喎顫忔繝姘＜婵﹩鍓ㄩ幏閿嬵槹鎼达絿鐒兼繛鎾寸啲閹烽攱顨ラ悙鎼當妞ゎ厹鍔戝畷鐓庘攽閸垹鐐婇梻浣烘嚀閸氬鎮鹃鍫濈鐎癸拷閿熺晫鍒掓繝姘亹闁惧浚鍋勫鍨攽鎺抽崐鏇㈩敄閸℃瑱鎷峰顒傜Ш闁诡喗顨呴埢鎾诲垂椤旂晫浠屾俊鐐�栧▔锕傚炊閼稿灚娅嶉梻浣侯焾缁绘帡宕㈣濞嗐垽鎮欏ù瀣杸闂佺粯蓱瑜板啴顢旈埡鍌ゆ闁绘劖娼欐慨鍥煃鐟欏嫬鐏撮柟顔界懇閹虫粓妫冨☉娆撴暘缂傚倸鍊峰ù鍥ь嚕閹捐泛鍨濇繛鍡樻尵瀹撲礁顭块懜闈涘闁诲繑濞婇弻锟犲磼濡搫濮曢梺璇茬箣缁舵艾顫忓ú顏勭闁圭粯甯婄花鐓庘攽閻愭彃绾ч柨鏇樺灲瀹曞搫鈽夐姀鐘殿吅闂佺粯顭囬弫鎼佹晬濠婂喚娓婚柕鍫濇婢ь剛绱掔�ｎ偄绗х紒顔肩墦瀹曟﹢鍩￠崘顏嶅晭闂備礁鎲℃笟妤呭储娴犲瑤澶愭倷閻戞鍘梺鎼炲劀閸愬彞绱斿┑鐘殿暯閸撴繈骞冮崒娑楃箚闁绘垹鐡旈弫宥嗙節闂堟稒顥為柛搴㈡崌濮婅櫣鎷犻幓鎺濆妷濡炪倖姊归悧鐘茬暦娴兼潙鍐�妞ゆ挻鍐婚幏鐑芥晝閸屾稑锟藉鏌﹀Ο渚Ч闁诲寒鍓熷娲捶椤撶儐鏆┑鐘灪閿氭い鏂跨箰閳规垹锟斤綆鍋嗛崢閬嶆煟韫囨洖浠滃褌绮欓幆灞剧節閸ャ劎鍘搁柣搴秵閸嬪棝濡撮幒妤佺叆闁绘柨鍤栭幏鐑芥偆娴ｅ湱绉锋繝鐢靛仜瀵爼鎮у鍛潟闁绘劕顕弧锟介梺鎼炲劘閸庡骞忛柨瀣缂侇垱娲橀悗濠氭⒑鐟欏嫬鍔ょ痪缁㈠弮閹偓銈ｉ崘鈺佷画濠电姴锕ら崯鎷屽�寸紓鍌欐祰妞存悂骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾剁磽娴ｅ搫校婵犮垺锕㈤崺鐐哄箣閿旇棄浜归悗瑙勬礀濞村倿寮抽敓鐘斥拺闁硅偐鍋涢敓鑺ユ礋閹崇喖顢涘┑鍫滅胺闂傚倷鐒︾�笛呮崲閸岀偛绠犻幖娣妼濮规煡鏌ｉ幇顔煎妺闁绘挻鐩弻娑樷槈閸楃偞鐏撶紓浣哄Х閸嬨倝寮婚敍鍕勃閻犲洦褰冮～鍥倵濞堝灝娅橀柛鎾跺枎閻ｇ柉銇愰幒婵囨櫓闁荤喐鐟ョ�氼剟鎯侀柆宥嗏拻闁稿本鐟ч崝宥嗕繆閻愬弶鍋ョ�规洏鍨介幃锟犵嵁椤掍胶鈽夐摶鏍煕濞戝崬骞橀柛妯绘尦濮婃椽鎮烽柇锕�娈堕梺绋款儐缁嬫挸鈻庨姀銈嗗�锋繛鏉戭儐閺傦拷闂備胶绮摫鐟滄澘鍟撮、鏃堝Χ婢跺鍘搁梺璺ㄥ枍缁瑩骞冮悜鑺ユ櫢缂佽尙灏峚l()
				role.setCruiseid2(shape2);
				role.setCruiseid3(shape3);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739900;

	public int getType() {
		return 739900;
	}

	public long playerid; // 玩家id
	public int shape;
	public int shape2;
	public int shape3;
	public int changetype; // 0是变身，1是npc跟随，2有座骑时，3巡游，4取消巡游

	public GChangeShape() {
	}

	public GChangeShape(long _playerid_, int _shape_, int _shape2_, int _shape3_, int _changetype_) {
		this.playerid = _playerid_;
		this.shape = _shape_;
		this.shape2 = _shape2_;
		this.shape3 = _shape3_;
		this.changetype = _changetype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(playerid);
		_os_.marshal(shape);
		_os_.marshal(shape2);
		_os_.marshal(shape3);
		_os_.marshal(changetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		playerid = _os_.unmarshal_long();
		shape = _os_.unmarshal_int();
		shape2 = _os_.unmarshal_int();
		shape3 = _os_.unmarshal_int();
		changetype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GChangeShape) {
			GChangeShape _o_ = (GChangeShape)_o1_;
			if (playerid != _o_.playerid) return false;
			if (shape != _o_.shape) return false;
			if (shape2 != _o_.shape2) return false;
			if (shape3 != _o_.shape3) return false;
			if (changetype != _o_.changetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)playerid;
		_h_ += shape;
		_h_ += shape2;
		_h_ += shape3;
		_h_ += changetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(playerid).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(shape2).append(",");
		_sb_.append(shape3).append(",");
		_sb_.append(changetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GChangeShape _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(playerid - _o_.playerid);
		if (0 != _c_) return _c_;
		_c_ = shape - _o_.shape;
		if (0 != _c_) return _c_;
		_c_ = shape2 - _o_.shape2;
		if (0 != _c_) return _c_;
		_c_ = shape3 - _o_.shape3;
		if (0 != _c_) return _c_;
		_c_ = changetype - _o_.changetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


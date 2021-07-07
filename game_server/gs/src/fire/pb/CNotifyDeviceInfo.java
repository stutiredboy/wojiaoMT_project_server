
package fire.pb;

import java.util.HashMap;
import java.util.Map;

import xbean.BattleInfo;
import fire.log.LogManager;
import fire.pb.battle.PEnterBattleAfterEnterWorld;
import fire.pb.battle.SSendBattleStart;
import fire.pb.util.InetAddressUtil;
import gnet.link.Dispatch;
import gnet.link.Kick;
import gnet.link.Onlines;





// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CNotifyDeviceInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CNotifyDeviceInfo extends __CNotifyDeviceInfo__ {

	@Override
	protected void process() {
		
		final int userid = ((Dispatch)this.getContext()).userid;
		if(userid == -1){
			kickUser(-1000);
			mkdb.Trace.info("CRoleList====userid = -1  闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽缂佺偓鍎抽鎰板船瑜版帗鈷戦悹鎭掑妼閺嬫垿鏌＄�ｎ厼鍚圭紒顔碱煼楠炴ê效閸ラ攱瀚瑰ù锝堝�介弮锟介幏鍛存偡闁讣鎷烽幘瀵哥闁圭偓娼欓崵顒勬煕閵娾晙鎲鹃柡灞诲姂婵″爼宕卞▎鎴犳闁诲骸鍚�閸楁娊寮ㄩ崡鐑嗙唵婵鎷烽柡浣规崌閹崇偤濡烽敂缁㈡Ч婵°倗濮烽崑娑㈡晝閵夆晛绠氶柡鍐ㄧ墕鎯熼梺闈涱槶閸庢娊鏁撶粵瀣籍婵﹨娅ｇ划娆戞崉閵娧傜礃闂備胶顭堥鍥磻閵堝绠栭柨鐔哄У閺呮彃顭跨捄楦垮鐟滄澘瀚板娲箹閻愭彃濮岄梺鍛婃煥閻倸鐣烽悽鍓叉晢濞达綀娅ｉ鏇㈡⒑缁嬭法绠抽柛妯犲嫭鍙忕�广儱顦伴悡娑氾拷鐧告嫹閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�鐎规洦鍓濋悘鎺楁⒑閸忚偐銈撮柡鍛箞瀹曘垹顭ㄩ崼鐔叉嫽婵炶揪绲介幉锟犲箚閸儲鍋犳慨妯煎帶娴滄壆锟借娲樼换鍫ョ嵁鐎ｎ喗鏅濋柨鐔烘櫕缁寮介鐔哄帾闂佸壊鍋呯换宥呂ｉ崫銉ф／闁诡垎鍐╁�紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛銉鏉╂柨鈹戦悙宸殶闁靛棗顑夐獮蹇涙晸閿燂拷  =============");
			return;
		}
		
/*		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {

//				Integer userid = xtable.Properties.selectUserid(roleid);
//				xbean.ActiveUserInfo activeUserInfo = xtable.Activeusertable.select(userid);
//				Integer lev = xtable.Properties.selectLevel(roleid);
				xbean.AUUserInfo userinfo = xtable.Auuserinfo.get(userid);
				
//				java.util.Map<String, Object> params = LogUtil.putRoleBasicParams(roleid, new HashMap<String, Object>());
				Map<String, String> machineInfos = new HashMap<String, String>();
				for (UserInfoUnit uiu : info) {
					machineInfos.put(uiu.key, uiu.value);
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鏉戭潩鏉堚敩銏ゆ⒒娴ｈ鍋犻柛搴㈡そ瀹曟粓鏁冮崒姘�梺鍛婂姦閸犳鎮￠妷鈺傜厸闁搞儲婀圭花濂告倵濮橆剛绉烘慨濠傛惈鏁堥柛銉戝秵瀚规俊銈呮噹绾惧鏌熼幑鎰厫鐎规洖寮剁换婵嬫濞戞瑥绐涚紓浣叉閹风兘姊绘担渚劸闁哄牜鍓涢崚鎺戠暆閸旇偐鍏橀弫鎾寸鐎ｎ偀鎷绘繛杈剧导鐠�锕傛倿閻愵兙浜滈柟瀵稿仜閻忊晠鏌熼獮鍨仼闁宠鍨归敓鏂ょ秵娴滐綁骞楅弴銏″�垫鐐茬仢閸旀碍銇勯敂璇茬仭閻庨潧銈搁幃鈺冪磼濡厧骞堥梻浣告惈濞层垽宕濈仦鐐珷妞ゆ梻鏅粻楣冩煕濠婂啫鏆熺紒澶樺枟閹便劍绻濋崒銈囧悑閻庤娲樼敮鎺楋綖濠靛鏁勯悹鎭掑妽閺呭ジ姊婚崒娆戝妽闁诡喖鐖煎畷婵婄疀閹绢垱鐏冨┑鐐村焾濠胶绱為弽顓犲彄闁搞儯鍔嶆刊鍏肩箾瀹割喕鎲鹃柡浣稿�块弻娑㈠即閵娿儰绨介梺璺ㄥ枔閻℃棃宕㈡總绯曪拷鏃堝礃椤斿槈褔鏌涢埄鍐剧劷妞わ负鍎靛娲偡閺夋寧姣愰梻浣稿簻缁蹭粙鎮惧畡閭︾叆闁割偅绻勯鐓庮渻閵堝棙鐓ュ褌绮欓弫宥呪攽閸モ晝顔曢柡澶婄墕婢т粙骞冮崗绗轰簻妞ゆ挾鍋熸晶锕傛煏閸℃锟藉潡鐛惔銊﹀殟闁靛／鍐ㄧ疄闂備浇顕ч崙鐣屽緤婵犳艾绀夌�癸拷閸曨剚娅㈤梺鍏间航閸庡磭绮婚幘娣簻闁哄浂浜為幃濂告煙妞嬪骸孝闂囧鎮楅敐搴′航婵炲吋妫冨缁樼瑹閿熻棄顭囪閹广垽骞掗幘鏉戝伎闂佸搫顦伴崹褰掑汲閵堝鐓曢柍鈺佸暟閳句線鏌嶉柨瀣伌婵﹤顭峰畷濂告偄閸撲胶绠掗梻浣虹帛鐢紕绮婚弽顓炶摕婵炴垶鐟﹂崕鐔兼煏閸繂顏╅柟顖氱墢缁辨挻绗熼崶褎鐏曞銈嗘肠閸涱厼鐤惧┑锛勫亼閸婃洜鎹㈤幇鏉跨疇濠㈣埖鍔曠粻顖炴煣韫囨挻璐＄痪鎹愭闇夐柨婵嗘噹椤ュ繘鏌涙惔锛勭闁诡喗顭堢粻娑㈠箻閺夋垶鐣婚柣搴ゎ潐濞叉鎹㈤崼銉ョ畺闁靛繈鍊曠粈鍌炴煠濞村娅呮鐐茬墦濮婅櫣鎷犻幓鎺戞瘣缂傚倸绉村Λ婵嗙暦閹达箑骞㈡俊鐐存礃濡炰粙鐛锟介、娆撴偩鐏炶棄绠為梻鍌欑绾绢參骞婇幘缁樺�舵繝闈涱儏缁�澶嬬節婵犲倹瀚呴柟椋庡厴瀹曞綊顢曢敐鍥у殥闂佽瀛╅惌顕�宕￠幎鑺ュ仒妞ゆ洩鎷风�规洖鐖奸、妤佸緞鐎ｎ偅鐝濋梻鍌欒兌缁垶寮婚妸锔剧彾濠电姴鍟伴々椋庢喐閺傛娼栧┑鐘宠壘绾惧吋绻涢崱妯哄闁靛牊婢橀埞鎴︽倷瀹割喗效濠电偠灏欓崰搴ㄦ偩閻戣棄绠柤鎭掑劜濞呭洭姊虹粙鎸庢拱婵ǜ鍔戦、娆撳幢濞戞瑢鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝嗙節濮橆厼浜滈梺绋跨箰閻ㄧ兘骞忔繝姘厽閹艰揪绱曟禒娑㈡煟閳╁啯绀堢紒顕嗙到铻栭柛娑卞枓閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归崐鍨叏濮楀棗浜滅�规挸妫涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勯幇顒夋綂闂佺粯锕㈠褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺傜偛鎳愮壕鑺ユ叏濡法绨垮┑顔藉▕濮婂宕奸悢琛℃灁闂佺尨鎷峰ù鐘差儐閻撶喖鏌熼柇锕�骞楃紓宥嗗灴閺岋綀绠涢弴鐐寸亪闂佸搫鏈惄顖涗繆閹间礁唯鐟滃繑顨欓梻鍌欐祰椤曟牠宕伴幒妤佹櫢闁兼亽鍎查悘杈ㄤ繆閹绘帞澧﹂柡灞炬礉缁犳盯濡疯閿涚喖姊洪崨濠忚�垮ù婊嗘硾椤繐煤椤忓嫪绱堕梺鍛婃处閸撴瑩宕戝澶嬧拺闁告稑锕ラ悡銉╂煟椤撶偛锟藉潡骞冩导鎼晩缁炬媽椴稿娲⒑鐠恒劌鏋嶇紒顔界懃椤曪絾绻濆顒傚姶闂佸憡鍔戦崝搴ｇ玻閻愮儤鍊甸柣褍鎲＄�氳绻濋悽闈浶㈤悗姘煎墯閹便劍绺介崨濞炬嫽婵炶揪绲介幗婊堝几閸愨斂浜滄い鎰╁焺濡拷閻庤娲栫紞濠傜暦婵傜鍗抽柣妯垮皺閵堬箑鈹戦悩鍨毄濠殿喗娼欑叅闁挎洖鍊归崑鍌炴煛閸モ晛浜归柡锟芥禒瀣厽婵☆垵顕х徊濠氭煛閸℃瑥浠х紒杈ㄥ浮閺佹捇鎮惧畝瀣闁挎繂楠告晶楣冩煙閻戠瓔妫戦柟鍙夋尦瀹曠喖顢楅敓浠嬎囬埡鍛拺闁硅偐鍋涙俊濂告煟閺嵮佸仮濠碘�崇摠閹峰懐鍖栭弴鐕佹綌婵犳鍠楅〃鍛涘☉銏犵煑闁糕剝绋掗埛鎴︽煕濞戞﹫姊楃紒鍫曚憾閺屾盯濡搁敃锟介埢鏇狅拷瑙勬礃缁诲牓鐛弽銊﹀闁稿繐顦扮�氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鐣鹃梺鍓插亖閸庢煡宕戦悩铏弿婵☆垳鍘х敮璺好瑰鍕棆闁跨喎锟界噥娼愭繛鍙壝叅闁绘柨顨庨崵鏇炩攽閻樺疇澹橀崬顖炴⒑閹稿孩绌块柟宄板槻闇夋繝濠傚濞堟粍鎱ㄦ繝鍐┿仢鐎规洦鍋婂畷鐔碱敆閿熶粙宕戝澶嬧拺闁硅偐鍋涙俊鍏笺亜椤撶偛妲婚柣锝囧厴閺佹劖寰勬繝鍕靛晪缂傚倸鍊烽悞锕傗�﹂崶顒�鍌ㄩ梺顒�绉甸埛鎴︽⒒閸喍绶辨俊鐙欏懐纾奸柤鑹版硾琚氭繛锝呮搐閿曘儳绮嬮幒鏃撴嫹閿濆骸浜滈柨鐔绘閻栧ジ鎮￠锕�鐐婇柕濠忓椤︺劑姊洪崫鍕紞闁告挾鍠栧濠氭晬閸曨亝鍕冮柣鐘叉处瑜板啴鈥栭崼銉︹拺閻庡湱濮甸ˉ澶嬨亜閿旇鐏ラ柣蹇斿笚缁绘繈濮�閻樺樊鏆㈠┑鐐叉噷閸ㄨ顕ユ繝鍕磯闁靛瀵屽鐔兼⒑閸︻厼鍔嬫慨濠呭吹婢规洟宕楅梻瀵哥畾濡炪倖鐗楅懝楣冨箖閹达附鐓曢柟鐑樻尵濞叉挳鏌熼绛嬫畼闁瑰弶鎸冲畷鐔碱敆閸屻倖袣闂傚倷绶氬褔鎮ф繝鍥х畺闁稿瞼鍋熷畵渚�鏌涢幇闈涙灈妞ゎ偄鎳橀弻宥夋寠婢跺妫￠柡浣哥墦濮婃椽宕烽鐐蹭粯闂佸鏉垮闁瑰箍鍨藉畷鐔碱敇閻樼數鍔跺┑鐘灱閸╂牠宕濋弽顓炵厱闁圭儤顨嗛悡鏇㈡倶閻愭彃鈷旈柟鍐叉噺閵囧嫰鏁傞懖鈺冩殼闂佸搫鐬奸崰鎾诲窗婵犲洤纭�闁绘劖婢橀弸鍫ユ⒒娴ｇ儤鍤�缁剧虎鍙冨畷浼村冀椤撴粣鎷锋担绯曟闁靛繆锟界鎷烽悜鑺ョ厾缁炬澘宕晶浼存煛鐎ｎ亜鏆炵紒缁樼箘閸犲﹤螣濞茬粯缍夐梻浣稿閻撳牓宕归幎钘夌闁告劦鍠楅弲婵嬫煕鐏炴崘澹橀柟顖滃仱濮婃椽宕崟顒�鍋嶉梺鎼炲妽濡炰粙骞冮垾鏂ユ瀻闁规惌鍨辩�氬綊鏌ｉ悢鍛婄凡妞ゅ浚浜滈…鍧楁偡閻楀牜妫﹂梺璇″枟閿曘垽寮婚崱妤婂悑闁糕剝鐟ラ獮妤呮⒒娓氾拷濞佳囨偋閸℃瑦宕查柟瀵稿閹峰嘲顫濋鍌溞ㄥ┑顔硷工椤嘲鐣烽幒鎴旀瀻闁规惌鍘借ⅵ闂傚倷绀佸﹢閬嶅煕閸儱纾婚柛鏇ㄥ幖瀵煡姊绘笟锟藉褑澧濋梺鍝勬噺缁嬫挻绔熼弴鐔虹瘈婵﹩鍘鹃崢浠嬫⒑閸濆嫬鏆欓柛濠勬暬楠炲繘鏁撻悩宕囧幐婵炶揪绲块…鍫ユ晸閽樺鍋ョ�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�
				xbean.UserDeviceInfo userDeviceInfo=xtable.Userdeviceinfotab.get(userid);
				boolean isfirst=false;
				int first=1;
				if(userDeviceInfo==null){
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柣妯荤垹閸モ晛褰勯梺鎼炲劘閸斿秹鎮￠妷锔轰簻闊洦纰嶇涵楣冩煃鐟欏嫬鐏存い銏＄懇閹矂顢曢锛勭泿闂佷紮绲块崗姗�銆佸Δ鍛妞ゆ劑鍨规禍鍫曟⒑鐠囧弶鎹ｉ柡浣筋嚙椤洦绻濆顒傤唵婵＄偛顑呯�涒晠宕伴崱娑欑厱闁哄洢鍔屾晶鐗堛亜閿斿搫鍔ょ紒杈ㄦ崌瀹曟帒顫濆В娆嶅灲閺屻劑寮撮妸銈夊仐闂佽鍠曢崡鎶姐�佸▎鎾村殟闁靛鍎辨俊鎶芥⒒娴ｇ懓顕滅紒璇插�哥叅妞ゆ挶鍨归悡姗�鐓崶銊р檨闁绘挾鍠栭獮鏍箹椤撶偟浠紓浣割槺閺佸寮诲☉姘炬嫹閿濆簼绨奸柛锝呯秺閺屽秶鎷犻懠顑咃拷瑙勬礀閵堝憡淇婇悜鑺ユ櫆閻熸瑥瀚鐑樼節閻㈤潧浠╅柟娲讳簽缁辩偤鏁撻懞銉ｄ簻妞ゆ劑鍩勫Ο锟介悗瑙勬礃閸ㄥ潡骞冮埡鍐＜婵☆垳鍘ч獮鍫ユ⒑閻熸澘鎮戦柟顖氱焸瀹曚即寮介鐔凤拷鍫曟煥閺冿拷閹锋繈骞忔搴㈠枂闁告洦鍓涢ˇ銊х磽娴ｇ瓔鍤欓柛鐔告尦閻涱噣宕卞☉妯肩潉闂佸壊鍋呴幆濠囧煛閸涱喚鍘繝銏ｎ嚃閸ㄤ即宕銈囦笉闁规儼濮ら埛鎺楁煕鐏炲墽鎳勭紒浣哄缁绘稒寰勭�ｎ偆顦伴悗瑙勬礃婵炲﹪寮崘顔肩＜婵﹢纭搁崬鐢告⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯虹仴婵☆偅鐩畷婵嬵敍濮橈絾鏂�闂佺粯鍔栧娆撴倶閿斿浜滄い鎾跺仦閸犳锟芥鍠楁繛濠傜暦閸楃偐妲堟繛鍡樺灥楠炲牓姊绘担鍛婃儓婵炲眰鍨藉畷婵堜沪閸撗屾锤闂佺粯鍔栭悾顏呯濠婂牊鐓ラ柡鍐ㄦ祩閸ゆ瑦顨ラ悙瀵稿⒌闁哄苯绉堕幉鎾礋椤愩倓绱濋梻浣筋嚃閸犳帡寮插┑鍫燁潟闁圭儤鍤﹂悢鍝ョ瘈婵﹩鍘藉▓顒佺節绾板纾块柛瀣灴瀹曟劙寮介鐐茬�梺姹囧灮椤牏绮婚悩鍏呯箚妞ゆ牗鐟ㄩ鐔兼煕閵堝棙绀嬮柡灞剧☉閳藉顫滈崼婵嗩潬闂備浇宕甸崰搴ｇ礊婵犲洤钃熼柕濞炬櫆閸嬪嫰鏌涢幘鑼跺厡闁绘挻鎹囬幃妤�鈻撻崹顔界亪濡炪値鍘鹃崗妯侯嚕椤愶箑绠涙い鎾跺仧缁愮偞绻濋悽闈浶㈤悗姘煎櫍瀵爼宕ㄦ繝浣虹畾闂佺粯鍔︽禍婊堟晸閼恒儳澧遍柡渚囧枟缁绘繈宕堕妸銉嫹閸ф鐓ラ柡鍥╁仜閿熻棄鎽滄竟鏇㈠锤濡や胶鍘甸梺璇″瀻閸愮偓娈虹紓浣哄亾瀹曟ê螞閸曨垰违闁圭儤鍩堝鈺傘亜閹烘埊鏀婚柡渚�绠栭弻锝嗘償閵忥絽顥濈紓鍌氱Т閿曘倝锝炶箛娑欐優閻熸瑥瀚壕顖炴⒑闂堟侗鐒鹃柛搴㈢叀閹敻濮�閵堝棌鎷洪梺鑽ゅ枑濠㈡ê鈻撻埡鍛厵闁告垯鍊栫�氾拷?
					first=0;
					isfirst=true;
					userDeviceInfo=xbean.Pod.newUserDeviceInfo();
					xtable.Userdeviceinfotab.insert(userid, userDeviceInfo);
				}
				userDeviceInfo.setIp(userinfo!=null?InetAddressUtil.ipInt2String(userinfo.getLoginip()):"auuserinfonull"); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹闂備線娼ц噹濞撴艾锕ョ�氬綊鏌熼悜姗嗘畷闁绘挾鍠愮换婵嬫濞戞瑯妫ら梺绯曟櫔缂嶄線寮婚垾宕囨殕閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�闁绘牕鍚嬫穱濠囨倻閽樺）銊ф喐瀹�鍕畺闁挎繂顦伴埛鎺懨归敐鍛础婵狅拷娴犲鐓曞┑鐘插枤濞堟粎锟借娲橀崹鍧楃嵁濮楋拷閹虫粓妫冨☉妯煎搸濠电姷鏁搁崑鐐哄垂椤栫偛鍨傞柛锔诲幘娑撳秹鏌ㄥ┑鍡橆棤缂佺娀绠栭弻娑㈠焺閸愮偓鐣肩紓浣哄У婵炲﹪寮诲☉銏犵睄闁跨喍绮欓獮鎰板礃瀹割喗缍庨梺缁樺灦钃卞┑顔界矒閺岀喎鈻撻崹顔界彯濠碘�虫▕閸ｏ絽顫忓ú顏勭閹兼番鍨婚埞娑氱磽娴ｅ搫校闁圭懓娲ら锝夘敃閿曪拷缁犺崵绱撴担濮戭亪鎯傞崟顒傜瘈闁靛骏绲剧涵楣冩煟椤掞拷閵堢顕ｉ崘娴嬫闁靛繆妾ч幏铏圭磽娴ｅ壊鍎忔繛纭风節椤㈡挸螖閸愭寧瀚归悷娆忓婢跺嫰鏌涢幘瀵告创鐎规洩缍佸畷銊э拷娑櫱氶幏娲⒑閸︻収鐒鹃悗娑掓櫊钘熼柛鈩兠肩换鍡樸亜閹扳晛鐏╂い蹇ｅ幘閿熷�燁潐濞叉牜绱炴繝鍌ゅ殨妞ゆ帊鐒﹂崕鐔兼煙閹呮憼闁哄鎮傚缁樻媴娓氼垳鍔搁梺鍝勭墱閸撴盯宕版繝鍌ゅ悑濠㈣泛锕﹂弻鍫ユ⒑缂佹ê濮夐柛搴涘�濋幃锟犳偄閸忚偐鍘甸梺璇″瀻鐏炶姤顔嶉梻浣烘嚀閸熻法锟芥矮鍗冲濠氬即閵忕姷鍊為悷婊冪Ч椤㈡棃顢橀悪鍛婵炲牆鐏濋弸娑㈡煥閻旂儤娅曢柛锝冨劚鍗遍柣鎾冲瘨濞撳鏌曢崼婵嗘殭闁告梹绮庣槐鎺楊敊閼恒儱纾抽悗娈垮枛椤兘寮幘缁樺亹闁哄被鍎遍弫瑙勪繆閻愵亜锟芥牠宕濋幋锕�鍨傜憸鐗堝釜缂嶆牗銇勮箛鎾跺闁抽攱鍨圭槐鎾存媴閻ч晲绶靛┑鐐茬墛閺屻劑鍩ユ径鎰闁告劏鏅滃В锟�
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姵濞婇弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁绘娲滈崣鍛存⒑闂堟单鍫ュ疾濠婂牆纾挎俊銈呮噺閻撴洟鏌嶉埡浣告灓婵☆垰鎳愰幉鎼佹偋閸繄鐟查梺鍝勬噺閻擄繝寮诲☉銏╂晝妞ゆ劦婢�缁ㄨ偐绱撻崒姘毙㈤柣妤�妫濋崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆЦ婵炲憞鍕瘈婵炲牆鐏濋弸鐔兼煙缁嬪灝鏆遍柨鏇樺灪缁楃喖鏁撻挊澶樻綎闁惧繐婀辩壕鍏间繆椤栨碍绂嬪ù婊勭矎閻忔帗绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厽闁规儳鐡ㄧ粈瀣煙椤旂瓔娈滈柡浣瑰姍瀹曘劑顢橀悢鍑ゆ嫹鎼淬劍鈷掑〒姘搐瀵箖鏌涢妸銉у煟鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梻浣告啞閹稿棝宕熼銏画闂傚倸鍊烽懗鍓佹兜閸洖鐤炬繛鎴炵啲閹峰嘲顫濋鐔哄嚒闂佷紮绲介崲鏌ワ綖濠婂牊鏅稿ù鐘差儍閿熸垝绶氬顕�鏁撴禒瀣闁告侗鍨辩�氭岸鏌嶉挊澶嬪櫤閻庢艾缍婇弻娑㈠Ψ椤旂厧顫梺鎶芥敱鐢帡婀侀梺鎸庣箓鐎氼垶顢楅悢鍏肩厽闁圭儤鎸搁崝銈夋懚閺嶎厽鐓熸俊顖涙た閸熷繘鏌ｉ幒妤冪暫婵☆偂鐒﹀鍕節鎼淬垹鐦滈梺璇插嚱缂嶅棙绂嶅鍫晢闁靛緵棰佺盎濡炪倖鍔х徊鍓х矆鐎ｎ喗鐓涚�癸拷閿熶粙宕伴弽顓炵畺婵犲﹤鍚橀悢璁胯櫣绱掑鍡橆棦闂傚倸鍊风粈浣虹礊婵犲泚澶愬箻鐠囪尙顦у┑顔筋殣閹烽锟芥鍣崑濠囩嵁閸ヮ剦鏁囬柣鏂垮槻婵¤櫕绻濋悽闈涒枅婵炰匠鍥ㄥ亱濠电姴娲ら悿楣冩煟閹惧磭宀搁柡锟芥禒瀣厽闁归偊鍓氶埢鏇㈡煕閵堝洤鏋庨柍瑙勫灴椤㈡瑧鎷犻幓鎺斻偖闁诲氦顫夊ú婵嬶綖婢跺本宕叉繝闈涙－濞尖晜銇勯幒鎴濓拷濠氬几閿熶粙姊婚崒娆戭槮缂傚秴锕よ灋閻犳亽鍔庨惌鍡椕归敐鍫燁仩濞戞挸绉归弻鏇熷緞濞戞粎顦版繛瀛樼矋缁捇寮婚敓鐘茬＜婵犻潧娲ㄩ妴濠傗攽椤曞棛鎮奸柛瀣ㄥ�濆濠氭晬閸曡埖瀚归柨婵嗙凹缁ㄥジ鏌涢妶鍛闁逛究鍔嶇换婵嬪礃閳瑰じ铏庨柣搴ゎ潐濞诧箓宕戞繝鍌滄殾闁绘梻鈷堥弫鍥煟濡绲婚摝搴ｇ磽閸屾艾锟芥悂宕愰幖浣哥９闁告縿鍎抽惌鎾绘煙閹澘袚闁稿﹤娼￠弻銊╁籍閸屾稒鐝梺宕囨嚀缁夋挳鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫啸闁硅櫕鎹囧﹢渚�姊洪幐搴ｇ畵闁绘妫濋弫鎾诲箣閹烘梻鐓撴繝纰樺墲閹倿宕洪敓鐘茬＜婵犲﹤鍟俊鍥ㄧ節閻㈤潧袨闁搞劌銈稿畷娲冀椤撶喐娅旈梻鍌欑閹碱偊顢栭崱娑欏仭闁冲搫鎳庨拑鐔兼煟閺冨倵鎷￠柡浣割儔閺屾盯鍩勯崘顏呭櫘闁藉啫宕埞鎴︽倻閸モ晛鍩屽┑鐐茬湴閸婃繈寮崘顕呮晜闁割偅绻勯悾鍝勨攽閻愬弶顥為柟灏栨櫊瀵偊宕掗悙瀵稿幈闂佸搫娲犻敓钘夌－閸橆偊鏌ｆ惔銏ｅ缂傚秴锕濠氬灳閹颁礁鎮戦柟鑲╄ˉ閿熻棄纾鎰磽閸屾瑨鍏屽┑顔藉▕瀹曪繝骞庨挊澶庢憰濠电偞鍨惰彜闁猴拷娴犲鐓曢柡鍥ュ妼娴滄粌鈹戦鍝勭伄缂佽鲸鎸荤粭鐔哥節閸愵煈浼撴繝鐢靛Х閺佸憡鎱ㄩ幘顔肩９闁汇垻顭堢紒鈺伱归悩宸剱闁绘挾鍠愭穱濠囶敍濮橆厽鍎撶紓浣哄珡閸滃啯瀚归柣鐔哄閸熺偟绱掔拠鎻掝伃闁轰焦鎹囧畷鎰版偆娴ｅ湱绉烽梻浣筋潐閹倿藟閹炬枼鏋庨柕蹇曞濞尖晠鎮规ウ鎸庮仩闁伙絽鎼埞鎴炲箠闁稿﹥娲熼獮濠呯疀濞戞鏌ч梺鍝勮閸庤京绮婚崷顓犵＜妞ゆ梻鍋撻鐔兼煙妞嬪骸鍘撮柟宕囧Х閹瑰嫰鎼归悷鏉啃ユ繝鐢靛Х閺佸憡鎱ㄩ悜濮愶拷鍌涚鐎ｎ亞顦┑鐘绘涧椤牊绂嶈ぐ鎺撶厱闁规澘鍚�缁ㄧ晫绱掗敓鑺ョ節閸屾鏂�闂佺粯锚瀵泛顔忓┑鍫嫹鐟欏嫭灏紒鑸靛哺瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劗绱撻崒娆掑厡濠殿噣绠栭敐鐐村緞閹邦儵锕傛煕閺囥劌鐏犵紒鐘差煼閹銈﹂幐搴涳拷鍐╃箾瀹�濠侀偗婵﹨娅ｉ幏鐘绘嚑椤掑偆鍞舵繝纰樻閸嬪懐绮欓幘婢勶綁骞囬弶璺啋闁诲孩绋掗敋妞ゅ孩鎸荤换娑氾拷鐢殿焾瀛濆銈嗗灥閹虫﹢鐛Δ鍛仺闁告稑艌閹锋椽姊洪棃鈺佺槣闁告ü绮欏畷鐢告晸閽樺鏀介柣鎰皺濠�鎾煕婵犲啰绠為柡浣瑰姍閹瑩宕滄担鐑樻緫闂備胶鎳撹ぐ鐐烘倿閿曪拷椤啯绂掔�ｎ煉鎷锋笟锟藉顕�宕煎┑鍫Ч婵＄偑鍊曠换鎰涘☉銏犵９闁绘劗鍎ら埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岀喎霉鐎ｈ埖瀚归悺鎺嶇劍濡炰粙寮崘顔肩＜婵﹩鍓欐禍璺衡攽閻樼粯娑ч柛濠傜秺楠炲啴宕奸弴鐔告闂佽姤锚椤︻垶鏁撻挊澶嬫喐闁告瑥鎳庨—鍐Χ閸涱垳顔囬梺鐟板暱椤︾敻鐛箛鎾佹椽顢旈崨顏呭闂傚倸鍊搁悧鍐疾濞戙垺鍎婃繝濠傜墛閻撴洘淇婇婊呭笡闁稿﹥鍔栭〃銉╂倷閼碱剛顔掗梺杞扮劍閹瑰洭骞冮埡浣烘殾闁搞儜鍐杽闂傚倷娴囬褔宕欓悾宀�绀婇柛鈩冾焽椤╁弶绻濇繝鍌滃⒈闁轰礁鍊归妵鍕箻閸楃偟浠鹃梺缁樻尰濞茬喖寮诲澶嬪仭闁规鍠曢搹搴ㄦ⒑鐠囪尙绠氶柡鍛矒婵＄敻宕熼姘鳖啋闂佸憡鍔曞鍫曞磹椤栫偞鍊甸柛顭戝亝缁舵煡鎮楀鐓庡箻闁瑰箍鍨归埞鎴狅拷锝庝簽椤︿即姊婚崒姘卞缂佸甯″鎶筋敍閻愮补鎷婚梺绋挎湰閼归箖鏁撻挊澶婃Щ闂囧鏌涢妷顔煎⒕缂傚秵鐗曢…鍧楁嚋闂堟稑顫岀紒鐐劤濞硷繝寮婚悢鐓庣畾闁哄鏅濋幘缁樼厱濠电姴鍊婚崺锝夋煛鐏炲墽娲存い銏℃礋閹晠骞撻幒鎴經缂傚倸鍊搁崐椋庢媼閺屻儱鐤鹃柣妯款嚙閽冪喖鏌ｉ弮鍌氬付缂佺姵宀搁弻鈩冨緞婵犲啯鐝栭梺鐟板⒔缁垶鎮￠崘顔解拺闁割煈鍣崕蹇涙煟韫囨梹灏﹂柡灞革拷宕囨殕閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀冮悽顖涘笩閻忔帡姊洪崨濠勭畵閻庢凹鍓熼敐鐐差潩椤撶姷鐦堥梺姹囧灲濞佳勭濠婂牊鐓欓柛鎰叀閸欏嫭顨ラ悙璇у伐妞ゎ偅绮撻弫鎾绘寠婢舵ê娈ㄩ柣鐘叉处缁佹潙危閸儲鐓忛煫鍥ь煭閹风兘宕楅崨顖滄晨闂傚倸鍊风粈渚�骞夐敓鐘冲仭闁靛鏁￠崶銊ヮ嚤閻庢稒锚娴犙囨⒑閸濆嫯鐧侀柨鐔剁矙瀵劍绂掔�ｎ偆鍘撻梺闈涱槶閸庨亶寮虫潏鈺冪＜闁绘瑦鐟ュú锕傛偂閺囥垺鐓涢柛鎰鐎氬綊姊洪懡銈呮毐闁哄懏鐩、姘舵晲婢舵ɑ鏅濋梺鎸庢穿閹烽绱掗悩鍝勫惞缂佽鲸鎸婚幏鍛存嚃閳╁啫鐏ラ柍璇茬Ч婵拷闁靛牆妫岄幏娲煟閻樺厖鑸柛鏂胯嫰閳诲秹骞囬悧鍫㈠幍闂佸憡鍨崐鏍拷姘炬嫹
				userDeviceInfo.setTelcooper(machineInfos.get("TelcoOper")==null?"":machineInfos.get("TelcoOper")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氱紓鍌欒兌閸嬫捇宕曢崘宸劷闁跨喓濮撮拑鐔兼煥濠靛棭妲告い顐㈡嚇閺屾洝绠涙繝鍐╃彇闂佸憡鏌ㄩ幗婊呮閹烘鍊锋い鎺炴嫹闁告柣鍊栭妵鍕敇閻樻彃骞嬮悗娈垮枛椤兘骞冮姀銈嗗亗閹艰揪缍嗛崬褰掓⒒娓氾拷閿熻姤绋戝畵鍡樼箾娴ｅ啿鍟犻弸鏃�銇勯幘璺盒ョ痪鎹愭閵嗘帒顫濋濠冩暰闁诲孩淇洪～澶屾崲濠靛顫呴柨婵嗘閵嗘劙姊哄ú璇插箹妞わ妇鏁婚悰顔跨疀濞戞瑥锟藉鏌ｉ敐鍛板缂佷緤绠撳娲礈閼碱剙甯ラ梺鍝ュУ閻楁骞堥妸锔藉劅闁宠棄妫欑�靛矂姊洪棃娑氬缂佺粯鍔欓幆浣割煥閸喓鍘遍梺闈涱焾閸斿秶娑甸悙顑句簻闁哄浂浜炵粙濠氭倵闂堟稏鍋㈢�殿喖鐖奸獮濠囨倷閽樺顫囬梺鍝勮閸旀垵顕ｉ鍕瀭妞ゆ棁顫夌�垫牗淇婇悙顏勶拷鏍ь潖閻熸噴娲偄婵傚缍庡┑鐐叉▕娴滄繈宕戦敓鐘斥拺妞ゆ挶鍔庨悾杈ㄧ箾閸繄鍩ｆ慨濠呮缁瑥鈻庨幆褍澹嬮梻浣侯焾椤戝啴宕愬┑瀣祦闁糕剝绋戠粈鍐┿亜閺冨洤浜规い鎾存そ濮婅櫣绱掑Ο蹇ｄ邯閹ê顫濋懜鍨珫闂婎偄娲﹂弻褏鎹㈤崱娑欑厪闁割偅绻勭粻鎶芥煕閹哄秴宓嗛柡灞剧洴閹垻鎹勯崫鍕偖闂備浇顕栭崰妤呭磿瀹曞洤寮叉俊鐐�曠换鎰板箠閹版澘鍌ㄩ柟闂寸劍閸婄敻鏌ｈ閹诧紕锟芥艾缍婂铏规崉閵娿儲鐎虹紓渚囧枟閻熴儵鎮鹃柨瀣嚤闁哄鍨归鎺旂磽閸屾瑧鍔嶉拑杈ㄧ箾閸涱偄鐏叉慨濠勫劋鐎电厧鈻庨幋婵嗙厒闂備礁鎼悧婊堝礈閻斿鍤曢柟鎯版閻撴盯鏌涚仦涔呰偐鑺辩拠宸富闁靛牆妫欑亸鐢告煕鐎ｎ剙鏋戦柡鍛埣瀵挳濮�閿涘嫬骞愰梻浣虹《閿熻棄纾粻鍙夌箾閸涱叏鏀婚柟渚垮妽缁绘繈宕熼鐐殿偧闂備胶鎳撻崲鏌ュ箠韫囨洜绠旈柣鏃傗拡閺佸秵绻涢幋鐐垫噭婵炲牊褰冮埞鎴︽晬閸曨偂鏉梺绋款焾閸婃繂鐣烽幋锕�绀嬫い鏍垫嫹闁搞儺鍓﹂弫宥嗙節婵犲倸鏆欓柣銈夌畺濮婂宕掑▎鎺戝帯缂備緡鍣崹璺侯嚕婵犳艾惟闁崇懓灏呴幏鐑藉礃閳哄倸鍔呴梺闈涱焾閸庨亶骞嗛悙鐑樷拺闁告繂瀚崒銊╂煕閵婏附銇濋柟顕嗙節瀵挳鎮㈢紙鐘电泿闂備浇顫夊妯绘櫠鎼达絿鐭欓柤濮愬�楃壕濂告煥閻斿墎鐭欓柡浣规尰缁傛帞锟斤綆鍋�閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛搴″祮闁哄矉缍侀崺鈩冪節閸屾粈妗撻柣搴㈩問閸犳盯顢氳閸┿儲寰勬繝搴㈠兊濡炪倖鍔х徊鑺ュ垔娴煎瓨鈷掑ù锝勮閺�鐗堛亜椤愩埄妯�鐎规洘绻堝鎾煑閸濆嫷妲搁柍瑙勫灴瀹曢亶鍩￠崒姘辨В闂傚倷绶氬褔鎮ч崱姗嗘闁告稑锕﹂々鍙夌節闂堟侗鍎愰柣鎾存礋閺屾洘绻涢崹顔煎Б婵炲濮伴崹娲Φ閸曨垼鏁冮柕蹇嬪灮椤旀帡姊洪崷顓炲付婵狅拷闁秴绠熼柟缁㈠枛缁�瀣亜閹扳晛锟芥洟鏌婇柆宥嗏拻闁稿本鐟ㄩ崗宀勬煕鐎ｃ劌濮傜�规洘娲樺蹇涘煛娓氬洦顥℃俊鐐�栭幐楣冨窗鎼搭煈鏁嬮梺顒�绉甸悡鏇熴亜閹邦喖孝闁告梹绮撻弻宥夋煥鐎ｎ亞浠奸梺鐟板级閹倿骞冭瀹曠厧鈹戦崨顓炵亖濠电姷顣藉Σ鍛村磻閸涙潙鍨傞柛褎顨呴拑鐔哥箾閹寸偟鐭岄柣銈忔嫹闂備礁鎼崐绋课涢鐔侯洸妞ゅ繐鐗婇弲鏌ユ煟閹邦剙顣抽柣銈忔嫹闂備胶鎳撹ぐ鐐烘倿閿曪拷椤啯绂掔�ｎ煉鎷锋笟锟藉顕�宕煎┑鍥ヤ虎濠电偠鎻紞锟芥い鏇熺墪铻為柛鎰靛枟閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻娑㈡偄闁垮浠村Δ鐘靛仦閻楃娀銆侀弴銏℃櫇闁跨喓鏅竟鏇°亹閹烘挾鍘甸梻鍌氬�搁顓犳嫻娴煎瓨鐓涘ù锝囶焾閿熻棄娼″濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?
				userDeviceInfo.setChid(machineInfos.get("ChId")==null?"":machineInfos.get("ChId")); // 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠囨倿閿曞倸纾块柟鎯у绾捐棄霉閿濆懏鎯堢亸蹇涙⒑閸涘娈曞┑鐐诧工椤曪絾绻濆顓熸珳婵犮垼娉涢敃锕傛偪閿熶粙姊婚崒姘拷鎼佹偋婵犲嫮鐭欓柟杈捐缂嶆牗銇勯幇鈺侊拷妤冨閽樺褰掓晲閸涱喗鍎撻梺瀹狀嚙閻楀繒妲愰幒妤佸亹鐎规洖娲ら埛宀勬倵濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳閼姐倗纾介柛灞捐壘閿熺晫鍏橀幃鐐烘晝閸屾稒娅囬梺瀹犳〃缁茬厧鈽夐姀鐘殿槹濡炪倖鐗楃粙鍫ュ箯婵犳碍鈷戦柟鑲╁仜閸旓拷闁诲繒鍋炵�氬氦顦寸紒杈ㄦ尰閹峰懘鎼归悷鎵偧缂傚倷娴囬褔宕导鏉戠闁靛繒濮弨浠嬫倵閿濆簼绨介柨娑欑矊閳规垿鎮欓弶鎴犱桓闁藉啳椴搁妵鍕疀鐎ｎ亷鎷烽弽顐ｅ床婵犻潧顑嗛崑銊╂⒒閸喓鈼ラ柛婵囶殜閺岋綀绠涢幘鍓侇唹闂佽崵鍟块弲鐘充繆閹绢喖纾奸柣鎰摠濞呫垽姊虹捄銊ユ珢闁瑰嚖鎷�
				userDeviceInfo.setPlattype(machineInfos.get("PlatType")==null?"":machineInfos.get("PlatType")); // 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨妯诲墯濞兼劕菐閸パ嶈含濠碘�崇埣瀹曠喖顢橀悙宸�撮梻鍌欑閹诧繝鎮烽妷褎宕叉慨妤嬫嫹鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛滈梺璇″瀻閸愶絾瀵栫紓鍌欑贰閸ｎ噣宕归幎钘夌闁靛繒濮Σ鍫ユ煏韫囨洖啸妞ゆ挸鎼埞鎴︽倷閸欏妫炵紓浣虹帛鐢绮嬮幒鎾堕檮闁告稑艌閹峰搫鈹戦鐐殌婵炲眰鍊濋弫鎾存叏閹邦剨鎷峰┑鍡欐殾闁规儼濮ら弲鎻掝熆鐠虹尨榫氶柟鑺ユ礋濮婃椽妫冨☉姘暫濡炪倧瀵岄崹宕囧垝鐠囨祴妲堟俊顖氱箰缂嶅﹪寮幇鏉垮窛妞ゆ棁妫勯弸鎴濃攽閻愬樊鍤熷┑顔炬暩閸掓帒顓奸崶銊ュ簥濠电偞鍨堕悢顒勫箯瀹勬壋妲堟繛鍡橆焽閸旂兘姊哄ú璇插箹闁挎洏鍎抽幑銏犫攽鐎ｎ偅娅㈡繛瀵稿Т椤戝棝鎮為懖鈺嬫嫹楠炲灝鍔氭俊顐ｎ殜瀹曟粓鏁冮敓浠嬧�旈崘顔嘉ч柛娑卞灣椤斿洭姊虹紒姗嗘當闁挎洦浜滈悾鐑藉箣閻欏懏瀚归柨婵嗛閺嬬喖鏌ｉ幘瀛樼闁靛洤瀚伴獮鍥煛娓氬﹥瀚归柡鍥ュ灩閸戠娀鏌熸潏楣冩闁绘挻娲熼弻锝夊即閻愯鎷烽崷顓ㄦ嫹濮樼偓瀚�(IOS,android,wp)
				userDeviceInfo.setDeviid(machineInfos.get("DeviId")==null?"":machineInfos.get("DeviId")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹闂備線娼ц噹濞撴艾锕ョ�氬綊鏌熼悜姗嗘畷闁绘挾鍠愮换婵嬫濞戞瑯妫ら梺绯曟櫔缂嶄線寮婚垾宕囨殕閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�闁绘牕鍚嬫穱濠囨倻閽樺）銊ф喐瀹�鍕畺闁挎繂顦伴埛鎺懨归敐鍛础婵狅拷娴犲鐓曞┑鐘插枤濞堟粎锟借娲橀崹鍧楃嵁濮楋拷閹虫粓妫冨☉妯煎搸濠电姷鏁搁崑鐐哄垂椤栫偛鍨傞柛锔诲幘娑撳秹鏌ㄥ┑鍡橆棤缂佺娀绠栭弻娑㈠焺閸愮偓鐣肩紓浣哄У婵炲﹪寮诲☉銏犵睄闁跨喍绮欓獮鎰板礃瀹割喗缍庨梺缁樺灦钃卞┑顔界矒閺岀喎鈻撻崹顔界彯濠碘�虫▕閸ｏ絽顫忓ú顏勭閹兼番鍨婚埞娑氱磽娴ｅ搫校闁圭懓娲ら锝夘敃閿曪拷缁犺崵绱撴担濮戭亪鎯傞崟顒傜瘈闁靛骏绲剧涵楣冩煟椤掞拷閵堢顕ｉ崘娴嬫闁靛繆妾ч幏铏圭磽娴ｅ壊鍎忔繛纭风節椤㈡挸螖閸愭寧瀚归悷娆忓婢跺嫰鏌涢幘瀵告创鐎规洩缍佸畷銊э拷娑櫱氶幏娲⒑閸︻収鐒鹃悗娑掓櫊钘熼柛鈩兠肩换鍡樸亜閹扳晛鐏╂い蹇ｅ幘閿熷�燁潐濞叉牜绱炴繝鍌ゅ殨妞ゆ帊鐒﹂崕鐔兼煙閹呮憼闁哄鎮傚缁樻媴娓氼垳鍔搁梺鍝勭墱閸撴盯宕版繝鍌ゅ悑濠㈣泛锕﹂弻鍫ユ⒑缂佹ê濮夐柛搴涘�濋幃锟犳偄閸忚偐鍘甸梺璇″瀻鐏炶姤顔嶉梻浣烘嚀閸熻法锟芥矮鍗冲濠氬即閵忕姷鍊為悷婊冪Ч椤㈡棃顢橀悪鍛婵炲牆鐏濋弸娑㈡煥閻旂儤娅曢柛锝冨劚鍗遍柣鎾冲瘨濞撳鏌曢崼婵嗘殭闁告梹绮庣槐鎺楊敊閼恒儱纾抽悗娈垮枛椤兘寮幘缁樺亹闁哄被鍎遍弫瑙勪繆閻愵亜锟芥牠宕濋幋锕�鍨傜憸鐗堝釜缂嶆牗銇勮箛鎾跺闁抽攱鍨圭槐鎾存媴閻ч晲绶靛┑鐐茬墳缂嶄線寮婚悢鐓庣闁靛牆妫楅锟�(mac/idfv)闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻鈥崇暆閿熶粙宕伴弽顓犲祦闁糕剝绋戠痪褔鏌涢悢宄版殲闁圭懓娲璇测槈濞嗘垹鐦堥梺绋挎湰缁嬫垶绂掗幘顔解拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶婄妞ゆ棁妫勯敓鐣屽厴閹綊宕堕崶褍顏╂い蹇撶埣濮婃椽宕ㄦ繝鍕窗闂佺閰ｆ禍鎯版＂濠殿喗顭堥崺鏍偂閺囩姵鍠愰幖娣妸閿熻棄鍟村畷鍗炩槈濞嗗繋绨垫繝鐢靛仜濡瑩骞愭繝姘；闁挎繂顦伴悡鏇熺節闂堟稒顥滄い蹇ｄ邯閺岀喖顢涘鍗烆杸闂侀潧娲ょ�氱増淇婇悿顖ｆЩ婵炲濞�娴滃爼寮婚敍鍕勃闁告挆鍕灡濠电姷顣槐鏇㈠礂濮楋拷閵嗕礁鈻庨幘鏉戜簵闁圭厧鐡ㄨ摫閻庢矮绮欏濠氬磼濞嗘劗銈板┑鈩冦仠閸斿海鍒掗崼鐔稿闁煎弶绻冪粙鎴﹀煘閹寸媴鎷烽敐搴濇捣闁硅姤娲栭埞鎴︽倷閺夋垹浠ч梺鎼炲妼缂嶅﹤鐣烽敓鐘茬闁兼亽鍎抽崢顏呯節閻㈤潧浠滈柣蹇旂箞瀹曟繂鈻庨幘瀵稿幈闂佺懓鐡ㄧ划搴ㄦ儗濞嗘劖鍙忓┑鐘叉噺椤忕娀鏌涢弽銊у⒌鐎殿喗鎸抽幃銏ゅ传閵夈儳鎮奸梻鍌氬�烽懗鍫曗�﹂崼銉晞闁糕剝绋掗崕搴€亜閺嶎偄浠滈柣蹇斿▕閺岋繝宕橀妸褍顣虹紓渚婃嫹闁告劏鏂傛禍婊堟煛閸屾稑顕滄い顐㈢Ф閹叉悂寮崼婵婃憰濠电偞鍨崹褰掓倿濞差亝鐓曢柟鏉垮悁缁ㄥジ鏌涢敍鍗炲枤濞撳鏌曢崼婵嬵�楅柨鐔奉潟閸婃繂鐣烽崼鏇炍╅柕蹇婏拷鎰佷紪闂傚倸鍊烽懗鍫曞储瑜旈敐鐐哄即閵忕姷锛欓梺鍝勬储閸ㄧ懓效閺屻儲鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍐┿仢妤犵偞鐗犻幃娆撳箵閹烘嚩鎾绘⒒娴ｈ櫣銆婇柡鍛矒閹囨偐瀹割喖娈ㄩ梺鍦帛鐢晠鎮￠妷鈺傜厱妞ゆ劑鍊曢弳閬嶆煙妞嬪海甯涚紒缁樼洴楠炴澹曠�ｎ亶妫熸繝鐢靛仜閻即宕愰弽顓炵柧闁割偅娲﹂弫濠囨煕閹炬鎷戠槐鎻掆攽閻橆喖鐏辨繛澶嬬洴瀵敻顢楅崟顐ｈ緢濡炪倖甯掔�氼參鎮″▎鎰╀簻闁哄啫鍊归鐔兼煙妞嬪骸鍘寸�殿噮鍓熸俊鐑芥晜缂佹绉炬繝鐢靛У椤旀牠宕板Δ鍛拷锕傚炊椤掞拷绾惧鏌熼幑鎰靛晣闁瑰嘲鍢查～婵嬪箛娴ｅ湱绉锋俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尰閸ゆ垶銇勯幋锝呭姷婵＄偓鎮傚缁樻媴閸涘﹤鏆堝┑顔硷功閹虫捇鎮惧┑瀣濞达絾鐡曢幗鏇㈡⒑缂佹ɑ鈷掗柛妯犲懐鐭嗛柛鎰靛枟閻撶姷鐥弶鍨埞濠⒀呭閵囧嫰寮崠鈥冲缂備浇椴搁幐鑽ょ箔閻旂厧鐐婄憸搴ㄦ倶瀹ュ鍊甸柣褍鎲＄�氬湱绱撴担鍓插創婵炲娲熷鎶芥晜閸撗咃紲闁诲函缍嗛崣搴ㄥ吹閿曞倹鐓涢柛鎰鐎氬綊姊洪悷鏉挎Щ闁硅櫕锚閻ｇ兘顢曢敃锟界粈瀣亜閹扳晛锟姐倝宕崼銉︹拻闁稿本鑹鹃敓鑺ユ倐瀹曟劙鎮滈懞銉ワ拷鍧楁煥閺冿拷閹锋繈骞忔搴ｇ當婵炴垶蓱閹兼劙鏌﹂崘顏勬灈闁哄本娲樼换娑㈡倷椤掍胶褰呴梺鑽ゅ枑閻熻京绮婚幘璇茬畺婵°倕鎳忛弲鏌ュ箹缁櫢鎷烽弬銉﹀瘲闂傚倷鑳堕幊鎾诲床閺屻儱搴婇柡灞诲劵缂嶆牗绻濋棃娑卞剱闁稿﹪鏀遍妵鍕箳閻愭潙顏舵俊鐐�曟蹇涘箯閿燂拷
				userDeviceInfo.setImei(machineInfos.get("IMEI")==null?"":machineInfos.get("IMEI")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠戦埞鎴﹀磼濠婂海鍔稿銈庡亜閹虫﹢寮诲澶娢ㄩ柕澶堝劜濮ｆ劗绱撴担闈涘Ω闁稿酣娼ч～蹇曠磼濡顎撶紓浣割儐椤戞瑥螞瀹�鍕拺缂佸顑欓崕搴ｇ磼閼镐絻澹橀柣锝囧厴瀵挳鎮㈤崫銉ら梻浣哥枃濡椼劎娆㈤垾婢勬稑顭ㄩ崼鐔哄幗闂佺粯顭堢划楣冾敆閻斿吋鐓熼柟鐐墯濡拷濡ょ姷鍋涚换鎴λ囬悧鍫熷劅闁靛繒濮甸悗顓㈡⒒娴ｅ憡鍟炴繛璇х畵瀹曟粌鈽夐埗鍝勬喘婵＄兘濡烽姀鈩冩澑闂備胶绮崝妯间焊濞嗗骏鑰块柟缁㈠枟閻撴洟鏌￠崒娑橆嚋闁圭櫢缍侀弻娑㈠箳閹捐櫕璇為悗瑙勬礀閵堟悂骞冮姀銈嗘優闁革富鍘介～宀勬⒒閸屾瑨鍏屾い顓炵墢閹噣顢曢敃锟界壕瑙勪繆閵堝懏鍣归柤绋跨秺閺岋綁濮�閻樺啿鏆堥梺鎶芥敱閸ㄥ潡寮诲☉婊呯杸闁规崘娅曢崐顖炴⒑缁嬪尅鏀婚柛鏃�鐗滈幑銏犫槈濞嗘劕顎撻梺鍛婂姈瑜板啴顢旈鍫熺厱婵炲棗绻掔粻濠氭煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳剁划顖炲箰鐠囪娲偄閻撳氦鎽曢梺缁樻⒒閸樠呯不椤栫偞鍊堕柣鎰仛濞呮洟鏌涘鍡椾喊闁哄矉绲鹃幆鏃堝閿濆拋妫熺紓鍌氬�哥粔鎾晝閵堝缍栭煫鍥ㄦ⒒缁★拷濠殿喗锕╅崜娑㈡晬濠婂啠鏀介柣鎰级椤ョ偤鏌涢妸銉т粵濞ｅ洤锕ョ粋鎺旓拷锝庡亐閹锋椽鏌ｉ悩鍙夌闁跨喎锟界喐鐝柣蹇撶墦濮婅櫣绱掑Ο鐓庘拡闂佸憡顭嗛崶銊ヤ患闂佺粯鍨煎Λ鍕础閹惰姤鐓忛煫鍥ь煭閹烽绮电憴鍕伓缂傚倷鐒︾湁缂佽妫欓妵鍕冀閵娿儺妫滈梺鐟扮殱閸撴繄鎹㈠☉銏犵煑濠㈣泛顑呴敓鑺ュ姈閹便劍绻濋崨顕呬哗缂備浇椴哥敮鎺曠亽闂佸憡绻傜�氬嘲顭囬幘缁樼厽閹兼番鍩勯崯蹇涙煕閿濆骸娅嶇�规洘绮撻幃銏ゆ偂鎼淬垻锟筋剟姊鸿ぐ鎺戜喊闁告鍋愬▎銏ゆ倷濞村鏂�闂佺粯蓱瑜板啴鏁撻挊澶嬫喐缂侇喖锕、姘舵晸閽樺娼栫紓浣股戞刊鎾煣韫囨洘鍤�缂佹せ锟芥剚娓婚柕鍫濋楠炴牗绻涘顔煎箹妞ゆ洩缍侀、鏇㈡晝閿熺晫绮婚悷鎳婂綊鏁愰崼顐ｇ秷濠电偛鎳忛悧鏇㈠煘閹达附鍋愰悹鍥囧啩绱ｉ梻浣虹帛椤ㄥ懘鏁冮鍫濇槬婵炴垯鍨圭粻锝夋煥閺冨洦顥夊ù鐙�鍨跺铏规嫚閳ュ啿绠洪柣銏╁灡鐢绌辨繝鍥х闁兼祴鏅濋鏇㈡⒑閸涘﹣绶遍柛鐘崇墬閹便劌顓兼径瀣幐閻庣櫢鎷烽柨鐔剁矙瀹曚即寮借閺嗭附绻涢崱妯诲碍閸ユ挳姊虹化鏇炲⒉妞ゃ劌绻戠�靛ジ鏁撻敓锟�?
				userDeviceInfo.setNetenvir(machineInfos.get("NetEnvir")==null?"":machineInfos.get("NetEnvir")); // 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽幃銏ゅ礂鐏忔牗瀚介梺璇查叄濞佳勭珶婵犲伣锝夘敋閿熻棄顫忛崫鍕懷囧炊瑜濋幏鐑藉Χ婢跺﹦鐛ュ┑掳鍊曢幊搴㈩攰闂備礁鎲″ú锕傚垂娴兼潙绀冮柨鐔绘椤啴濡堕崱妤�袝濠电媭婢侀幏椋庣磽娓氬洤鏋涢柣鏍帶椤繐煤椤忓嫮顔愰梺缁樺姈瑜板啴鈥栭崼銉︹拺缂佸灏呭銉︾箾鐏忔牭鎷烽幇浣告闁荤姴娲︾粊鏉懳ｉ崼銉︾厪闊洤锕ゆ晶鍙夌箾閸涱厽顥㈤柡宀嬬秮閹晠宕ｆ径濠庢П闁荤喐绮嶅姗�宕幍顔煎灊闁哄嫬绻堟禍褰掓煙閻戞ɑ灏ㄩ柟閿嬫そ濮婅櫣娑甸崨顓濇睏闂佺顑嗙粙鎺撶┍婵犲洦鍋╃�癸拷閿熺晫澹曟總鍛婂仯闁搞儺浜滈惃鍝勵熆瑜濇俊鍥晸閼恒儺鍟忛柛鐘崇洴椤㈡俺顦归柛鈹垮劜瀵板嫰骞囬澶嬬秱闂備礁鍟块幖顐﹀磹閻熸壋鏋嶉柛銉墯閳锋帒霉閿濆洦鍤�妞ゆ洘绮庣槐鎺旀嫚閹绘帪鎷峰宀�浜辨繝鐢靛仦閸ㄧ喖骞婇悙鍝勭倞妞ゆ帪鎷烽幆鐔兼⒑閸愬弶鎯堥柛濠勬暬楠炲繘鎼归崷顓狅紳婵炶揪绲芥竟濠囧磿閹邦厹浜滈柟瀵稿仧閹冲洨锟借娲樺ú鐔肩嵁閸ヮ剦鏁婇柛鎾楀秶搴婇梻浣藉吹婵潙煤閿曚降浜归柛鎰靛枛濮规煡鏌ㄥ┑鍡樺櫝闁猴拷娴犲鐓ユ繛鎴灻顏堟煛閸♀晛澧伴柨鐔凤拷鐕佹綈婵炲弶绮撳畷浼村冀椤撴粣鎷锋担绯曟婵妫欓崓闈涱渻閵堝棗閲滈柟椋庡厴閺屸剝鎷呴棃娑虫嫹濠靛棭娼栫紓浣诡焽閻熷綊鏌ㄩ悢缁橆棄妞ゎ厼娲╅ˇ褰掓煃閵夘垳鐣电�规洖銈告俊鐑藉Ψ瑜濈槐鐢告⒒娴ｅ憡鍟炴い銊ョ墦瀹曟劙顢曢敃锟界粻铏繆閵堝繑瀚归梻浣稿船濞差參寮婚弴鐔风窞婵炴垶绮岄幃鍛存⒑瑜版帗鏁辨俊鐐舵椤繐煤椤忓嫬绐涙繝鐢靛Т鐎氼噣鎮鹃悽鍛婄厽閹兼番鍨归崵顒勬煕濞嗗繐鏆ｇ�殿噮鍋勯鍏煎緞婵犲嫮娼夐梻浣稿閸嬪棝宕伴幘璇插偍闁汇垹鎲￠埛鎴︽煕濞戞﹫宸ラ柣蹇曞枛閺屾稒绻濋崘顏勨拡闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹(濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柣鎾存礃娣囧﹪濡堕崨顓熸缂備浇椴告繛濠囧蓟閿濆鍋勯柣鎾崇凹閸犲﹪姊虹紒妯诲蔼闁稿海鏁诲璇测槈閵忕姴宓嗛梺闈涱焾閸庝即鎳滈鍕ㄦ斀闁宠棄妫楁禍婊勪繆椤愶絿銆掓俊鍙夊姍楠炴锟芥稒锚椤庢挻绻涚�电孝妞ゆ垵鎳橀獮妤呮偨閸涘﹦鍘介梺闈涚箚閺呮盯鎮橀懠顒傜＜缂備焦顭囩粻鐐烘煙椤旇宓嗘い銏＄懇閹稿﹥寰勫畝锟介悰顕�鏌ｆ惔锝嗩仧闁归鍏橀幃妤呮晲鎼粹�茬盎濡炪倕绻愰悥鐓庮潖濞差亜绠伴幖杈剧悼閻ｅ灚淇婇妶鍥㈤柟璇х磿缁顓奸崪浣哄弳闂佸憡娲嶉弲娆戣姳婵犳碍顥婃い鎰╁灪閸屻劑鏌涙惔銈呯毢闁跨喕濮ら悢顒勫箯閿燂拷3G,4G,wifi)
				userDeviceInfo.setOsver(machineInfos.get("OsVer")==null?"":machineInfos.get("OsVer")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹闂備線娼ц噹濞撴艾锕ョ�氬綊鏌熼悜姗嗘畷闁绘挾鍠愮换婵嬫濞戞瑯妫ら梺绯曟櫔缂嶄線寮婚垾宕囨殕閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�闁绘牕鍚嬫穱濠囨倻閽樺）銊ф喐瀹�鍕畺闁挎繂顦伴埛鎺懨归敐鍛础婵狅拷娴犲鐓曞┑鐘插枤濞堟粎锟借娲橀崹鍧楃嵁濮楋拷閹虫粓妫冨☉妯煎搸濠电姷鏁搁崑鐐哄垂椤栫偛鍨傞柛锔诲幘娑撳秹鏌ㄥ┑鍡橆棤缂佺娀绠栭弻娑㈠焺閸愮偓鐣肩紓浣哄У婵炲﹪寮诲☉銏犵睄闁跨喍绮欓獮鎰板礃瀹割喗缍庨梺缁樺灦钃卞┑顔界矒閺岀喎鈻撻崹顔界彯濠碘�虫▕閸ｏ絽顫忓ú顏勭閹兼番鍨婚埞娑氱磽娴ｅ搫校闁圭懓娲ら锝夘敃閿曪拷缁犺崵绱撴担濮戭亪鎯傞崟顒傜瘈闁靛骏绲剧涵楣冩煟椤掞拷閵堢顕ｉ崘娴嬫闁靛繆妾ч幏铏圭磽娴ｅ壊鍎忔繛纭风節椤㈡挸螖閸愭寧瀚归悷娆忓婢跺嫰鏌涢幘瀵告创鐎规洩缍佸畷銊э拷娑櫱氶幏娲⒒閸屾氨澧涚紒瀣尰閺呭爼寮撮悢铏诡啎闂佸搫顦伴崹鐢割敂椤撶噥娈介柣鎰皺缁犲鏌熼鐣岀煉闁圭锕ュ鍕節閸曡埖瀚规い鎾跺剱濞撳鏌曢崼婵囶棞濠殿喖鍊块弻娑欑節閸愨晝顦ュ銈嗘穿缂嶄焦淇婇幖浣哥厸闁稿本顨嗙�氬ジ姊绘担鍛婂暈缂佽鍊婚敓鑺ュ嚬閸ㄥ爼鏁愰悙鐑樻櫇闁稿本绋撻崢杈ㄧ節閻㈤潧孝闁哥喓澧楅弲鍫曞垂椤愵偅顔旈梺缁樺姌鐏忔瑦鏅堕敃锟介埞鎴﹀焺閸愨晛锟芥劙鏌涢埞鎯у⒉闁瑰嘲鎳橀幖鍦喆閸曨剛甯嗗┑鐘殿暜缁辨洟宕戦幋锕�纾归柡宥庡亝閺嗘粓鏌熼悜姗嗘畷闁哄懏绻堥弻鏇熺珶椤栨氨校閻庢俺顫夐幈銊ノ熺拠鎻掝潽濠电偛鍚嬮崝鏇″絹闂佹悶鍎滃鍫濇儓濠电姷顣介敓钘夌－閸╋絿锟借娲忛崝鎴︺�佸▎鎾崇缁炬澘褰夐崫妤呮⒒閸屾艾锟介绮堟笟锟介獮鏍敃閵堝繑瀚规慨妯稿劚婵倻锟借娲樺ú鐔煎箖閻ｅ瞼鐭欓柤鎰佸灡閹蹭即姊绘担鐟邦嚋缂佽鍊块獮澶婎潨閿熶粙骞冮姀銈呯闁绘挸瀛╅悾浼存⒒娴ｅ摜鏋冩俊妞煎姂閹虫宕奸弴銊︽櫇婵犻潧鍊搁幉锟犲煕閹烘嚚褰掓晲閸噥浠╅柣銏╁灡閻╊垶寮婚悢鐓庣濞达綀娅ｉ弳顐︽倵鐟欏嫭纾婚柛妤佸▕閻涱噣宕堕澶嬫櫍闂佺粯锕╅崑鍛村极闂堟稈鏀介柣妯虹仛閺嗏晛鈹戦鑺ョ稇閻撱倝鏌曢崼婵囧櫤缂佺虎鍨跺濠氬磼濮樿偐鍙曢梺绋款儏鐎氼剛鍙呴梺鎸庢礀閸婃悂鎷戦悢鍏肩厪濠电偟鍋撳▍鎾绘煛娴ｇ锟藉潡寮诲☉銏╂晝闁挎繂妫涢ˇ銊╂⒑閹惰姤鏁遍悽顖涘浮濠�渚�姊洪幐搴ｇ畵闁绘锕、鏃堟偐缂佹ê浠哄銈嗙墬缁嬫捇鍩︽笟锟介弻鏇㈠炊瑜嶉顓炩攽閳╁啯鍊愬┑锛勫厴閺佸啴鏁撻挊澶嗘灁婵°倕鎳忛埛鎴﹀级閻愭潙顥嬫い锔肩畵閺屾盯鎮㈡搴㈡喖婵烇絽娲ら敃顏堝箠濠婂牊顥堟繛鎴炴皑閻涱噣姊虹拠鎻掑毐缂傚秴妫濆畷鎴﹀川鐎涙ê浠ч梺鍝勭▉閸樹粙鍩涢幒鎴欙拷鎺戭潩閻愵剙顏舵繝鐢靛仒閸栫娀宕ㄩ鐓庣哎闂備礁澹婇崑渚�宕曟潏鈺侇棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺厽闁靛牆顦遍悾娲煛瀹�锟介崰鏍ь潖閼姐倧鎷烽悽娈跨劸濠碘�茬矙濮婅櫣绱掑Ο璇茶敿闂佺娴烽弫璇差嚕婵犳碍鏅插璺猴工瀹撳棝姊虹紒妯哄妞ゆ洘绮撻獮蹇涙倻閽樺宓嶅銈嗘尪閸斿秶锟芥俺顫夐幈銊ノ熼悡搴濆闁诲孩鐔幏锟�(闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戠┛闂傚倷娴囧▔鏇㈠窗閹版澘鍑犻柤濮愬�楁稉宥夋煙閹咃紞闁哄棴绠戦埞鎴﹀磼濠婂海鍔稿銈庡亜閹虫﹢寮诲澶娢ㄩ柕澶堝劜濮ｆ劗绱撴担闈涘Ω闁稿氦灏欓幑銏犫攽閸♀晛娈梻浣哥仢椤戝棛娆㈤弻銉︾叆闁绘棁娅ｅ畷鐢告煕閵夋垵鎷嬮崬鐢告⒒娴ｈ櫣甯涢柛銊ュ悑閹便劑濡舵径瀣簵闂婎偄娲︾粙鎺楁偂閺囥垺鐓冮柍杞扮楠炴ɑ銇勮箛鎾斥枙鐟滅増甯╅弫濠囨煙閹勫櫤閻庢艾缍婇幃宄扳枎韫囨搩浠剧紓渚婃嫹闁割偁鍎查悡鏇㈢叓閸ャ劍顥栭柤鏉挎健閺屾洟宕遍弴鐙�妲銈庡亝缁捇寮幘瀵割浄閻庯綆浜為悾娲⒑鐎圭姵銆冮悹浣圭叀瀵悂寮崼鐔哄幍缂備礁顑呴悘婵嬫偟閹扮増鐓ラ柡鍥╁仜閿熻棄缍婇崺娑㈠箳閹炽劌缍婇弫鎰板炊閳哄倹鍟掗梻浣规偠閸婃牠鎮烽埡鍛摕婵炴垯鍨圭粻锝夋煟濡寧鐝柣婵愪簽缁辨挻鎷呴幋鎺戞儓闂佺顑冮崐鏇㈡偩閻戣棄纭�闁绘劏鏅滈～宥呪攽閳藉棗鐏ラ柛瀣姇閻ｇ兘鎳滈悽鐢电槇閻庡吀鍗抽弨鍗烆熆濮楋拷閺佹捇鎳為妷锔绢槹濡ょ姷鍋涢敃銉╁箚閺冨牊鏅查柛婊�鐒﹂ˉ鈥斥攽閻樺灚鏆╁┑顔炬暩閸犲﹤顓兼径濠勶紮闂佹眹鍨归幉锟犳偂閵夛妇绡�闂傚牊绋掗ˉ銏°亜鎼淬埄娈滈柡宀嬬磿閿熸枻缍嗛崜娆撳几濞戙垺鐓涚�癸拷鐎ｎ剛袦濡ょ姷鍋為…鍥晸閼恒儳鈾佹い顓炴喘钘濋柕濞炬櫆閳锋垿姊婚崼鐔衡檨闁瑰吋鍔欓幃妤�顫濋銏犵ギ闂佺粯渚楅崳锝呯暦閸洦鏁嗛柨鐔剁矙閹�斥槈濡潻鎷烽幒鎴僵妞ゆ帒锕ラ弫楣冩煟鎼淬垼澹樼紓宥咃躬瀵鏁撻悩鑼�為梺闈涱槶閸庤櫕绂掓總鍛娾拺闁告稑锕ら悘鈺佲攽閻戝洦瀚归梻浣告惈閻ジ宕伴幇顒夌劷闊洦鏌ｉ崑鍛存煕閹般劍娅撻柨鐔绘缁夌懓顫忛搹鍦＜婵☆垵顕ч棄宥夋⒑閼姐倕鏆�闁搞儯鍔嶅▍銏ゆ⒑娴兼瑧鍒伴柡鍫墴瀹曠敻鏁撴禒瀣厽閹兼番鍨归崵顒勬煕濡亽鍋㈤柍銉畵瀹曞綊顢氶崨顔肩紦闂備浇娉曢崰宥囧垝濞嗘挾宓佸┑鐘插亞閻撱儵鏌涢埄鍐ㄥ婵顨婂娲捶椤撶偛濡洪梺瑙勬倐缁犳牕鐣烽姀銈呯缂備焦顭囬崢浠嬫⒑缂佹ɑ鐓ラ柟鑺ョ矒楠炲﹪宕橀钘夛拷鍨叏濡厧甯跺褎鎸抽弻鐔碱敊閺傘倛锟芥寧顨ラ悙杈捐�挎い銏＄懇閹墽浠﹂挊澶岀杽闂傚倸鍊风欢姘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒璇茬墦楠炲啯銈ｉ崘鈺侊拷缁樻叏濡わ拷濡瑩顢欓弮鍫熲拺缂備焦锚婵洭鏌ｆ幊閸斿矂鎮炬搴濇勃缂備降鍨洪鏃堟⒑缂佹ê濮堟繛鍏肩懃闇夋い鏃�鎷濋幏宄扳枔閸喗鐝梺鍛婃尰閻熲晠宕洪姀鈩冨劅闁靛绠戦敓浠嬫敱閵囧嫰骞掑鍫濆帯闂侀潧鐗忓▓宸�9,android4.1)
				userDeviceInfo.setBrtype(machineInfos.get("BrType")==null?"":machineInfos.get("BrType")); // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹闂備線娼ц噹濞撴艾锕ョ�氬綊鏌熼悜姗嗘畷闁绘挾鍠愮换婵嬫濞戞瑯妫ら梺绯曟櫔缂嶄線寮婚垾宕囨殕閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�闁绘牕鍚嬫穱濠囨倻閽樺）銊ф喐瀹�鍕畺闁挎繂顦伴埛鎺懨归敐鍛础婵狅拷娴犲鐓曞┑鐘插枤濞堟粎锟借娲橀崹鍧楃嵁濮楋拷閹虫粓妫冨☉妯煎搸濠电姷鏁搁崑鐐哄垂椤栫偛鍨傞柛锔诲幘娑撳秹鏌ㄥ┑鍡橆棤缂佺娀绠栭弻娑㈠焺閸愮偓鐣肩紓浣哄У婵炲﹪寮诲☉銏犵睄闁跨喍绮欓獮鎰板礃瀹割喗缍庨梺缁樺灦钃卞┑顔界矒閺岀喎鈻撻崹顔界彯濠碘�虫▕閸ｏ絽顫忓ú顏勭閹兼番鍨婚埞娑氱磽娴ｅ搫校闁圭懓娲ら锝夘敃閿曪拷缁犺崵绱撴担濮戭亪鎯傞崟顒傜瘈闁靛骏绲剧涵楣冩煟椤掞拷閵堢顕ｉ崘娴嬫闁靛繆妾ч幏铏圭磽娴ｅ壊鍎忔繛纭风節瀹曪綁宕熼锟介悷閭︾叆闁告洦鍋勬慨绋库攽閳藉棗浜為柛鐘查叄閳ユ棃宕橀鍢壯囨煕閳╁啰鎳冩い顐庡懐纾藉〒姘搐閺嬫盯鎮楀☉鎺撴珖缂侇喗鐟﹀鍕節鎼粹剝鍊┑鐘灱濞夋盯顢栭崶顒�鍌ㄦい蹇撴噽缁★拷闂侀潧楠忕徊鍓ф兜閻愵兛绻嗘い鎰剁悼閹冲啴鏌嶇拠鑼х�规洖宕埥澶娾枎閹存繂绠炴繝鐢靛Х閺佸憡鎱ㄧ�甸潻鎷峰鐓庡籍鐎殿喗濞婇、妤呭礋椤掑倸骞愰梺璇茬箳閸嬬娀顢氳娣囧﹥绺介崨濠勫帗闁荤喐鐟ョ�氼剟鎮樼�甸潻鎷风憴鍕鐎规洦鍓熼崺銉﹀緞閹邦剛鐤呴柣搴秵閸嬪嫰顢旂捄琛℃斀閹烘娊宕愯楠炲繘鎮滈懞銉⒖婵犮垼娉涢鍥╁姬閿熻姤绻濋悽闈浶㈤柛濠冩倐椤㈡棃顢曢妶鍥╋紲闂佺粯蓱閸撴岸鎮為悾宀�纾奸弶鍫涘妼缁楁碍绻涢悡搴ｇ濠碘剝鎮傛俊鐑芥晝娴ｇ儤顎囧┑鐘垫暩婵兘銆傛禒瀣婵犻潧顑呯粻鏍煕瀹�锟介崑娑㈠几娓氾拷閺屾稑鐣濋敓浠嬪磻閻愬搫纾婚柍鍝勬噺閸婂爼鏌ｉ幇顏嗙シ婵＄偓鎮傞弻娑橆潩椤掍礁绐涚紓浣介哺閹瑰洤鐣烽幒鎴僵妞ゆ帒锕ョ�氬湱锟界懓瀚崳纾嬨亹閹烘垹鍊為梺闈涱煭缁茶偐鍒掗幘缁樷拺闁告稑锕︾紓姘舵煕鎼淬垻鍙�鐎殿喖鍟块…銊╁醇閻斿搫寮抽梻浣虹帛閺屻劑骞栭銉㈠徔闂傚倷娴囧▔鏇㈠窗閹版澘鍨傛繝闈涚墛椤愯姤鎱ㄥ鍡楀⒒闁搞倖娲熼弻鐔虹磼閵忕姵鐏堝銈庡亜閹虫﹢寮婚敐鍛傜喖鎳￠妶鍛徍闂備礁鎲￠弻銊х矓鐟欏嫪绻嗛柣銏㈩焾缁�瀣亜閺嶃劎顣叉い銉︾箞濮婃椽宕滈懠顒�甯ラ梺鍝ュУ椤ㄥ﹤鐣烽幇閭︽晬婵ê鍚嬬�靛矂姊洪棃娑氬婵☆偅鐟╅幃锟犲Ψ閳哄倸锟藉灚鎱ㄥ鍡楀箺缂佽泛寮堕妵鍕敃閵忋垻顔婄紓浣介哺鐢帟鐏掗柣鐘叉搐濡﹪鏁撻懞銉﹀暗缂佽鲸鎸婚幏鍛村捶椤撴稒顫嶆俊鐐�栭崹鐢稿箠鎼淬劌鐓濋柟鐐た閺佸洭鏌曡箛濠冾�嗛柟閿嬫そ濮婃椽宕ㄦ繝鍕ㄦ闂佹寧娲忛崐婵嬪箖濮楋拷閺佹劙宕堕埡鍐跨床婵＄偑鍊栧濠氬疾椤愶箑绠犻柛銉墯閻撶喐绻涢幋婵嗚埞闁哄濡囩槐鎺楁偐瀹曞洠妲堥梺瀹犳椤︻垶鍩㈡惔銊ョ疀妞ゆ挆鍌涘煕闂傚倸鍊搁崐宄懊归崶褉鏋栭柡鍥ュ灩闂傤垶鏌ㄩ弴鐐诧拷鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷(濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚敓鑺ユ倐閹ê鈹戦崱蹇旂亖闂佸啿鎼幊蹇涙偂濞嗗浚娓婚悗锝庝邯椤庢鏌涘Ο缁樺唉闁哄瞼鍠栭、娆撳传閸曨厺鎮ｉ梻浣哥枃椤斿﹦鍒掑▎蹇曟殾闁靛濡囩弧锟介梺鍛婂姂閸斿秴鈻撻銈囩＝闁稿本鐟︾粊鏉款渻閺夋垶鎲搁柡渚囧櫍閸ㄦ儳鐣烽崶銊︻啎闂備礁婀遍崕銈夊垂閻旇偤锝夊醇閻斿墎绠氬銈嗙墬缁嬫帡锝炲Δ鍛厽鐟滃瞼娆㈠璺鸿摕闁挎繂妫欓崕鐔兼煏閸繂顒㈢紓宥呯墕閳规垿鎮欓幓鎺旈獓闂佺粯顨堟慨鍨┍婵犲洤閱囬柡鍥╁仜缁愭稒绻濋悽闈浶￠柤鍐插缁顫濋懜纰樻嫼缂傚倷鐒﹂敋闁诲繗椴告穱濠囶敃閵忕媭浠奸梺杞扮贰閸ｏ綁寮婚敐澶嬪亜闁告縿鍎抽悡锟界紓鍌欒兌缁垶鏁嬪銈嗘穿缂嶄線鐛惔銊﹀癄濠㈣泛鐭堥崥瀣繆閻愵亜锟芥牠寮婚妸锔芥珷濞寸姴顑嗛弲顒佺節闂堟侗鍎愰柍閿嬪灩缁辨帞锟斤綆鍋勯婊勭節閿熻姤瀵肩�涙鍘介梺缁樻⒐缁诲倸煤閵堝洨鐭嗗璺虹焿閹风兘鐛崹顔煎濠电偛鐪伴崝搴㈢珶閺囩喓闄勯柛娑橈工閿熺晫鏁婚弻銊モ攽閸℃侗锟芥霉濠婂嫮鐭掗柡宀嬬秬缁犳稓锟斤綆浜滄慨锕傛⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊级閹冲磭鍠栭幖褰掓焻濞戞碍锛忔繝鐢靛Х閺佹悂宕戦悢鐓庡偍鐟滃繘骞戦姀鐙�娼ㄩ柨鐔绘閻ｅ嘲煤椤忓懏娅㈤梺缁橆焾鐏忔瑩藝閵娿儺娓婚柕鍫濇噽缁犵増淇婇锝庢畷闁逛究鍔戝畷銊︾節閸曨厾妲囬梻浣圭湽閸ㄨ棄顭囪閳兘姊绘担瑙勫仩闁告柨鐭傛俊鍓佺矙鐠恒劍娈惧┑鐐叉▕娴滄粓宕橀敓钘夘渻閵堝棙灏甸柛瀣枛钘濇い鏇嫹婵﹥妞藉畷顐﹀礋椤撴稒鐎遍梻浣告啞閿氶柕鍫熸倐楠炲啴鏁撻悩鎻掑祮闂侀潧楠忕槐鏇㈠储閻㈠憡鐓熼幖娣灮閳句焦銇勯鐐村窛闁瑰嘲缍婇崺锟犲礃閳轰焦鐎鹃梻浣虹帛椤ㄥ懘鎮ч崱娆戠當婵鍩栭悡鏇㈡倵閿濆簼绨婚柨鐔绘濞硷繝鎮伴锟藉浠嬪Ω閿斿墽肖闂備礁鎲￠幐鍡涘触闁垮鐏存慨濠呮閹叉挳宕熼銈囥偡闂備線娼ч悧蹇涒�﹂崼銉稏闊洦绋掗崐缁樹繆椤栨繍鍤欐い顐節濮婅櫣绱掑鍡樼暥闂佺粯顨呯换妯讳繆閸洘鍋嬮柛顐ｇ矌缁犳岸姊虹紒妯哄闁宦板妿缁辩偤骞嬮敂鐣屽幍闂佸吋浜介崕鎶芥儗閹烘搩娈介柣鎰綑閻忔潙鈹戦鍡樺闂備胶绮敃鈺呭磻閸涜揪缍栫�广儱顦伴埛鎴︽⒒閸喓銆掔紒鐘冲哺閺屾盯骞樼�靛摜鐣甸梺瀹狀嚙缁夋挳鈥﹂妸鈺侀唶闁绘洑鐒﹂ˉ濠冧繆閻愵亜锟芥牠宕濋幋锕�鍨傞柣鎴灻欢鐐烘煕閺囥劌鐏￠柣鎾寸洴閹﹢鎮欐０婵嗘婵犳鍠栭崐褰掑Φ閸曨垰顫呴柍鈺佸枤濡啴姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷)
				String username=xtable.Auuserinfo.selectUsername(userid);
				if(username!=null){
					userDeviceInfo.setUsername(username);
				}
				
				if(isfirst==true){
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊洪崫鍕灕闁归鍏橀弻娑㈠Χ閸涱垍褔鏌＄仦鍓ф创濠碉紕鍏橀、娆撴偂鎼存ɑ瀚介梻鍌欐祰濡椼劎绮堟担璇ユ椽顢橀姀鐘烘憰闂佸搫娴勭槐鏇㈡偪閿熶粙姊洪崫鍕窛闁稿鍋婃俊鐑芥晜鏉炴壆鐩庨梻浣瑰濡線顢氳閳诲秴顓兼径瀣幍濡炪倖姊婚悺鏂库枔濠婂牊鐓欐い鏍ㄨ壘閿熻棄鐏濋悾鐑藉Ω閿斿墽鐦堥梺绋胯閸婃挾妲愰敃鍌涒拻闁稿本鑹鹃敓浠嬵棑缁牊绗熼敓浠嬬嵁婢舵劕鐏抽悺鎺嶇劍濡炰粙寮崘顔肩＜婵ɑ鍞荤槐鍗炩攽閻橆喖鐏遍柛鈺傜墵瀹曟繈寮撮姀鐘插挤闂侀潧顦弲婊堟偂閻斿吋鐓欓梺顓ㄧ畱婢у鏌涢妶鍥ф灁缂佽鲸甯￠幃鈺呮嚒閵堝洦姣囬梻浣筋嚃閸犳銆冩繝鍥х畺闁芥ê顦弸鏃堟偣閹帒濡煎┑顔笺偢閺岋絾鎯旈姀鈶╂缂備浇顕ч崐鍧楀灳閺冨牆绀冩い鏂挎瑜旈弻娑㈠焺閸愮偓鐣兼繛瀵稿У濞兼瑩鍩為幋锕�鐓￠柛鈩冦仦缁ㄨ偐绱撴担绛嬪殭闁稿﹤娼￠獮鍐┿偅閸愨晛锟藉鏌﹀Ο渚Ц鐎规挸妫濆铏圭磼濡櫣浠村┑鈽嗗亝椤ㄥ﹪鐛崘顔肩闁绘劗鏁搁惁鍫ユ⒑闂堟盯鐛滅紒鎻掑⒔濞戠敻鎮欓鍙ョ盎闂佺懓鐡ㄧ换鍐窗濡》鎷风憴鍕８闁搞劋绮欏濠氬幢濡ゅ﹤鎮戦梺绯曪拷宕囩閻庢艾銈稿缁樻媴閸涘﹤鏆堢紓浣筋嚙閸婂鏁撻懞銉ュ毈闁告瑥鍟悾鐑藉箳濡わ拷鎯熼梺鍐叉惈閸婂宕㈤柆宥嗏拺闁告繂瀚敓鍊熸閳绘棃寮撮姀鈥筹拷鍧楁煕濠靛嫬鍔甸柟宄板槻閳绘捇宕归鐣屼憾闂備浇顕栭崰鏍磹鐟欏嫮鈹嶅┑鐘叉搐闁卞洭鏌￠崶鈺佷户闁稿﹦鍋ゅ娲礃閸欏鍎撻梺鍝ュУ缁嬫挸危閹版澘钃熼柕澶涜吂閹风粯绻涙潏鍓хК婵炲拑绲块弫顔尖槈閵忥紕鍙嗛梺鍝勬处椤ㄥ棗鈻嶆繝鍕舵嫹鐟欏嫭纾婚柛妤�鍟块锝嗙鐎ｅ灚鏅ｉ梺缁樺姈椤旀牕危閻戣姤鈷掑ù锝囨嚀椤曟粍绻涢崣澶屽⒌鐎规洘鍔橀妵鎰板箳閹惧厖绨垫繝鐢靛仦閸ㄥ爼鎮㈤鍕闁绘垼濮ら崕宀勬煕濞戞﹫宸ユい蹇撶埣濮婅櫣鎷犻幓鎺戞瘣缂傚倸绉村Λ婵嗙暦濠婂啠妲堥柕蹇曞У鏉堝牓姊洪棃娑氬妞わ缚鍗抽崺娑㈠箣閿曪拷缁狙囨煟閹邦厽缍戞い銉ヮ儔閺屾盯寮捄銊愌囨煛瀹�锟介崰搴綖閵忣澀娌柦妯侯槹閸庮亞绱撻崒娆戣窗闁哥姵鐗犻、鏍ㄥ緞閹邦喖绁﹂梺鍦劋椤ㄥ懐鐚惧澶嬬厵闁绘劦鍓氱紞鎴炪亜韫囨挾鍩ｆ慨濠冩そ楠炴劖鎯旈敐鍥╂殼闂備礁鎲￠崹宕囧垝濞嗘挾宓侀煫鍥ㄧ♁閸婅崵绱掑☉姗嗗剱闁哄拑绲介埞鎴︽偐鐠囇冧紣闂佸摜鍣ラ崑濠囨晲閻愬搫鐐婃い鎺嶈閹锋椽姊洪崨濠勭畵閻庢凹鍨堕敐鐐烘晝閸屾稓鍘遍梺鍝勫枦閹风兘鏌涢妸褎鏆い銏″哺閺佹劖寰勫Ο缁樻珨闂備浇娉曢崰宥囧垝濞嗗浚鍤曟い鎰剁畱缁犲鎮楅棃娑橆棌婵炴潙瀚伴弻锝嗘償椤栨粎校婵炲瓨绮嶇划鎾崇暦閻㈢绠ｉ柨鏃囆掗幏娲⒑缂佹ɑ灏悗鍨笒椤洭鎮㈤崗鑲╁幈婵犵數濮撮崯鐗堟櫠閻㈠憡鐓ユ繝闈涚墕娴犺京锟芥鍠楅幐鎶藉箖閵忋垻鐭欓柛顭戝枙缁辩喎鈹戦悩娈挎毌婵℃彃鎳樺畷瑙勫鐎涙ê锟借埖绻濋棃娑卞剱闁稿鍊块弻鐔兼焽閿曪拷楠炴垵霉濠婂嫮鐭掗柡灞炬礃瀵板嫰宕煎┑鍡椥ラ梻浣哄皑閹峰嘲鈹戦悩宕囶暡闁绘挸绻橀弻娑㈠Ψ閹存繂鏋ゅù鐓庡暙铻栭柣姗�娼ф禒婊勭箾瀹割喖骞栭摶鐐烘煕閹扳晛濡锋俊鎻掔墛閹便劌螖閿熻棄螞濞嗗緷褰掑炊椤掍讲鎷绘繛杈剧悼閻℃棃宕靛▎鎾村�垫繛鎴炲笚濞呭﹪鏌熼鍝勭伈妞ゃ垺顨婂畷鐔碱敃閵堝骸鏁搁梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?
					userDeviceInfo.setFirstdeviid(machineInfos.get("DeviId")==null?"":machineInfos.get("DeviId"));
					fire.log.YYLogger.OpRegLog(userid,0,0);
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢凹鍙冨畷宕囧鐎ｃ劋姹楅梺鍦劋閸ㄥ綊宕愰悙宸富闁靛牆妫楃粭鍌滅磼閿熻姤绗熼敓钘夌暦濠婂牜鏁囬柣鎴濇鐎靛矂姊洪棃娑氬婵☆偅顨嗛幈銊槾缂佽鲸甯￠幃鈺呭礃閼碱兛鎮ｇ紓鍌欑贰閸犳牠鎮ч幘宕囨殾婵鎷锋い銏＄懇閹墽浠﹂挊澶岀杽闂傚倸鍊风粈浣革耿闁秴纾婚柟鐐湽閿熻棄鍟村畷銊╁级閹寸姵鐒炬俊鐐�栭悧婊堝磻濞戞艾顥氶悷娆忓娴滄粓鏌″鍐ㄥ闁绘帒缍婇弻锟犳晸閼恒儳顩烽悗锝庡亞閸樿棄鈹戦埥鍡楃仭婵＄偛娼″畷顖濈疀濞戞瑧鍘搁梺绯曟閺呮盯鎮橀敃鍌涚厸閻忕偠顕ф慨鍌炴煙椤斿搫鐏紒杈ㄥ笒椤粓宕卞鍡橆棄闂傚倸鍊风粈渚�骞楀鍫濈獥闁哄洨鍋愰弸鏍煛閸モ晛校妞ゎ偅娲熼弻锝夊箛椤掍焦鍎撻梺鍛婂姧閹烽攱淇婇悙顏勶拷鏍箰妤ｅ啫绐楅柟鎹愵嚙閸屻劑鏌涘Δ鍐ㄤ汗闁猴拷娴犲绠抽柟鎯版绾惧湱鎲搁弮鍫㈠祦闊洦绋掗崐濠氭煠閹帒鍔ら柛姗�浜跺铏圭磼濡椿妫冮梺鐚存嫹闂侇剙绉寸壕濠氭煏婢舵稖绀嬪ù婊勭矒閺屾洝绠涙繝蹇斿闁告劕寮堕幊娆撴⒒娴ｈ姤銆冮柣鎺炵畵瀹曟繈寮借閸ゆ鏌涢弴銊ワ拷鐘绘偄閾忓湱锛滃┑鈽嗗灥瀹曚絻銇愰敐澶嬧拻闁稿本鑹鹃敓钘夊槻闇夐柛銉戯拷閺嬫牠鏌￠崶銉ョ仼缂佹劖顨婇弻锟犲炊閳轰焦鐎鹃梺鍛婄懃缁绘﹢寮婚弴銏犻唶婵犻潧娴傚Λ銈夋⒑瀹曞洦鍤�缂佸鎸抽崺鐐哄箣閿旇棄浜归梺鍛婄懃椤︻垶藝閳哄懏鈷戠紒瀣皡瀹搞儲銇勯鐘插幋鐎殿喖顭烽弫鍐晸閸婄喓浜介梻浣虹帛閼归箖顢氶鐘电焼闁糕剝绋掗埛鎴︽⒒閸喍鑵规繛鎴欏灩缁�瀣亜閹板墎鎮奸柨鐔剁矙缁犳牕顫忕紒妯肩瘈閹肩补锟借尙鐩庢繝鐢靛仩椤曟粓姊介崟顓犵當闁绘棁鍋ら弮鍫濆窛妞ゆ挾鍠撻敓绛嬪墯缁绘繈鎮介棃娴躲垺绻涚拠褏鐣甸柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�
				fire.log.YYLogger.OpLog(userid,0, "login",first,0,0,0);
				
				
				
		        if (userinfo != null){
		        	String appsrc = machineInfos.get("appsrc");
		        	String mac = machineInfos.get("mac");
//		        	String os = machineInfos.get("os");
					userinfo.setClientsource(appsrc!=null?appsrc:"");
					userinfo.setMac(mac!=null?mac.toUpperCase():"");
//					userinfo.setOs(osType);
		        	userinfo.setPlatform(appsrc!=null?appsrc:"");
		        	String idfa = machineInfos.get("idfa");
		        	userinfo.setIdfa(idfa!=null?idfa:"");
		        }else {
					LogManager.logger.error("userinfo is null when CNotifyDeviceInfo.userid:"+userid+" infos:"+machineInfos.toString());
				}
				try {
					
					String devicetype = machineInfos.get("devicetype");
					if (devicetype == null) devicetype = "";
					String os = machineInfos.get("os");
					if (os == null) os = ""; 
					String osversion = machineInfos.get("osversion");
					if (osversion == null) osversion = ""; 
					String width = machineInfos.get("width");
					if (width == null) width = ""; 
					String height = machineInfos.get("height");
					if (height == null) height = ""; 
					String mac = machineInfos.get("mac");
					if (mac == null) mac = ""; 
					mac = mac.toUpperCase();
					String appsrc = machineInfos.get("appsrc");
					if (appsrc == null) appsrc =""; 
					String phonenumber = machineInfos.get("phonenumber");
					if (phonenumber == null) phonenumber = ""; 
					String gprs = machineInfos.get("gprs");
					if (gprs == null) gprs = ""; 
					String accesspoint = machineInfos.get("accesspoint");
					if (accesspoint == null) accesspoint = ""; 
					String cpuname = machineInfos.get("cpuName");
					if (cpuname == null) cpuname = "";
					String cpuMaxFreq = machineInfos.get("cpuMaxFreq");
					if (cpuMaxFreq == null) cpuMaxFreq = ""; 
					String cpuCount = machineInfos.get("cpuCount");
					if (cpuCount == null) cpuCount = "";
					String totalMemSize = machineInfos.get("totalMemSize");
					if (totalMemSize == null) totalMemSize = ""; 
					String udid = machineInfos.get("udid");
					if (udid == null) udid = ""; 
					String idfa = machineInfos.get("idfa");
					if (idfa == null) idfa = ""; 
					
//					params.put(RemoteLogParam.MODEL, devicetype);
//					params.put(RemoteLogParam.SYSTEMTYPE, os);
//					params.put(RemoteLogParam.SYSTEMVERSION, osversion);
//					params.put(RemoteLogParam.RESOLUTION, width+height);
//					params.put(RemoteLogParam.MACADDRESS, mac);
//					params.put(RemoteLogParam.CLIENTSOURCE, appsrc);
//					params.put(RemoteLogParam.ACCOUNTSOURCE, userinfo!= null?userinfo.getUsername().substring(0, 4):"userinfo null");//getNickname --> getUsername
//					params.put(RemoteLogParam.PHONENUM, phonenumber);
//					params.put(RemoteLogParam.GPRSIMFO, gprs);
//					params.put(RemoteLogParam.ACCESSPOINT, accesspoint);
//					params.put(RemoteLogParam.CPUNAME, cpuname);
//					params.put(RemoteLogParam.CPUMAXFARQ, cpuMaxFreq);
//					params.put(RemoteLogParam.CPUCOUNT, cpuCount);
//					params.put(RemoteLogParam.TOTALMEMSIZE, totalMemSize);
//					
//					params.put(RemoteLogParam.PEER, InetAddressUtil.ipInt2String(userinfo!= null?userinfo.getLoginip():0));
//					params.put(RemoteLogParam.ACCOUNT,userinfo!= null?userinfo.getUsername():"userinfo null");
//					params.put(RemoteLogParam.UDID, udid);
//					params.put(RemoteLogParam.IDFA, idfa);
//					params.put(RemoteLogParam.SCORE, xtable.Properties.selectRolezonghemaxscore(roleid));
//					LogManager.getInstance().doLog(RemoteLogID.ROLEINFO, params);
//					params.put(RemoteLogParam.FROM, ConfigManager.getGsZoneId());
//					params.put(RemoteLogParam.PLATFORM, appsrc);
//					params.put(RemoteLogParam.USERID,userid);
//					params.put(RemoteLogParam.MAC,mac);
//					params.put(RemoteLogParam.OS,userinfo!=null?userinfo.getOs():"");
//					params.put(RemoteLogParam.ROLEID,roleid);
//					params.put(RemoteLogParam.LEV,lev);
//					params.put(RemoteLogParam.TOTALCASH,activeUserInfo==null?"":activeUserInfo.getChargetotalrmblong());
//					params.put(RemoteLogParam.HINT,"");
//					params.put(RemoteLogParam.CAMP, String.valueOf(new fire.pb.PropRole(roleid, true).getCamp()));
//					LogManager.getInstance().doLog(RemoteLogID.ROLELOGIN, params);
					
//					if (udid.length()>0){
//						sendDataToAuAny(userid,udid);					
//					}
//					if (mac.length() > 0) {
//						mac = mac.replaceAll(":", "");
//						mac = mac.toLowerCase();
//						sendDataToAuAny(userid, mac);
//					}
//					pexecute(new PForbidUserByMacOrIDFA(roleid, mac, idfa));
//					pexecute(new PFskAward(roleid,devicetype));//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢涘鍗烆槱闂備焦鐪归崹褰掆�﹀畡閭︽綎缂備焦蓱婵挳鏌ｉ悢鐓庝喊闁搞倕顑呴埞鎴︽倷閹绘帞楠囬梺缁橆殘婵挳鎮鹃悜钘夌疀闁哄娉曢鎰箾鏉堝墽鎮兼い顓炵墦閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�闁诡喓鍨藉畷妤呮嚃閳轰礁濡囬梻鍌氼煬閸嬪嫬煤閿曪拷鐓ら柡宥冨妿婢э繝姊婚崒娆戭槮闁硅姤绮撳畷浼村箻鐠囪尙锛涢梺闈涚墕椤︻垶鎷戦悢鍝ョ闁瑰鍋熼幊鍕煕鎼达絽鏋涢柡灞界Ч閹稿﹥寰勭�ｎ亝顏￠梻浣芥〃缁�浣规櫠閻ｅ本顫曢柟鎯х摠婵挳鏌ц箛鏇熷殌缂佹绱曠槐鎾存媴缁涘娈梺鍝ュ枍閸楁娊鐛幋锕�顫呴柣姗嗗亝閺傦拷闂佽鍑界紞鍡樼閻愮儤鏅繝濠傚暊閺�鑺ャ亜閺冿拷閺嬪鎳撻幐搴濈箚妞ゆ劑鍎茬涵鑸典繆閸欏濮嶆鐐差儔閺佸倻鎲撮敐鍡楊伜婵犵數鍋犻幓顏嗙礊閿熻姤绻涢崪鍐偧闁轰緡鍠栭埥澶婎潩鏉堚晪绱查梺鑽ゅТ濞层倕顕ｉ崼鏇�澶愬椤喗瀚归悷娆忓缁�鍐╀繆閻愯埖顥夋い鏇稻缁傛帞锟斤絽鐏氶弲锝夋⒑缂佹ê濮囩紒瀣缁骞樼拠鑼舵憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸斻倕霉閻橆偅娅囩紒杈ㄦ尰閹峰懘宕崟鎴秮閺岋綁鍩℃繝鍌滀桓閻庢鍠涢褔顢樻總绋垮耿婵☆垯璀﹀顖炴⒒娴ｇ儤鍤�闁搞垺鐓￠幊鐔碱敍閻愭彃鍋嶉梺鏂ユ櫅閸熸壆绮绘ィ鍐╁�甸柣銏☆問閻掗箖鏌嶇拠鑼ⅱ缂佽鲸甯￠幃鈺佺暦閸パ�鍚傛俊鐐�ら崑鍕崲濮楋拷楠炴牞銇愰幒鎴炲祶濡炪倖鎸炬慨鐑藉储椤栨稓绡�闁汇垽娼ф禒婊勪繆椤愶綆娈曢柡鍛板煐缁傛帞锟斤綆浜為悡鎴濃攽椤旂瓔鐒惧ù婊庡墰婢规洟鎸婃竟婵嗙秺閺佹劙宕奸悤浣诡棄闂備浇妫勭�氼剟宕ョ�ｎ剚宕叉繛鎴炵懃缁剁偤鎮楅敐搴′簽妞わ负鍎甸弻娑樜旈崨顒佸枤闂佸搫鐬奸崰鏍箖瑜斿畷濂告偄閸濆嫬娈ョ紓鍌氬�烽懗鑸垫叏閹�鏋嶉柡鍥╁枔閳瑰秴鈹戦悩鍙夋悙閸ユ挳姊洪崨濠冨闁告ê鍚嬫穱濠囨寠婢跺棙鏂�闂佺粯鍔曞鍫曞闯閻戣姤鐓曢柕濞垮妽椤忕娀鏌熼獮鍨仼闁宠棄顦～婵嬫倷椤掞拷椤忓爼姊哄Ч鍥х仾妞ゆ梹鐗犻幃鐐哄礈瑜濋幏宄扳槈濞嗘垹鐣靛銈庝簻閸熷瓨淇婇崼鏇炲耿婵°倕鍟╁ǎ顔界節绾版ɑ顫婇柛瀣噽閹广垽宕掗悙鏉戜患闂佺粯鍨煎Λ鍕不閿濆鐓ラ柡鍥朵簼鐎氬湱绱掗悙顒�鍔ら柕鍫熸倐瀵鏁愭径濠勭杸濡炪倖鐗楀銊バ掗姀鐙�娓婚柕鍫濇閳锋劙鏌涢弮锟介悷鈺侇嚕婵犳艾鐒洪柛鎰╁妿缁愮偞绻濋悽闈浶㈤悗姘煎墴閵嗗倿鎮滃Ο鑲╃槇闂佸啿鍤栭幏鐑芥煕濞戝崬鏋熼柣婵愪簼缁绘繈濮�閿濆孩缍堝┑鐐跺皺閸犳牠鎮伴锟介獮鍥敇閻斿嘲濡虫繝鐢靛█濞佳囨偋韫囨稒鍋╅柣鎰靛厸缁诲棝鏌ｉ幇鍏哥盎闁跨喕濮ら悧鐘诲箖瑜旈獮妯兼嫚閼碱剨绱梻浣告惈缁嬩線宕戦幘璇茬鐎瑰嫰鍋婂鈺呮煟閹伴潧澧い蹇ユ嫹
				} catch (Exception e) {
					LogManager.logger.error("notify device info error", e);
				}
				
				final SNotifyDeviceInfo msg = new SNotifyDeviceInfo();
				msg.ip = userDeviceInfo.getIp();
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		}.submit();*/
		
		new PNotifyDeviceInfo(userid,info,this).submit();
	}
	
	private void kickUser(int error) {
		Kick p1 = new Kick();
		p1.linksid = ((Dispatch)this.getContext()).linksid;
		p1.action = Kick.A_QUICK_CLOSE;
		p1.error = error;
		Onlines.sendProtocl(p1, this.getConnection());
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786514;

	public int getType() {
		return 786514;
	}

	public java.util.ArrayList<fire.pb.UserInfoUnit> info;

	public CNotifyDeviceInfo() {
		info = new java.util.ArrayList<fire.pb.UserInfoUnit>();
	}

	public CNotifyDeviceInfo(java.util.ArrayList<fire.pb.UserInfoUnit> _info_) {
		this.info = _info_;
	}

	public final boolean _validator_() {
		for (fire.pb.UserInfoUnit _v_ : info)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(info.size());
		for (fire.pb.UserInfoUnit _v_ : info) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.UserInfoUnit _v_ = new fire.pb.UserInfoUnit();
			_v_.unmarshal(_os_);
			info.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CNotifyDeviceInfo) {
			CNotifyDeviceInfo _o_ = (CNotifyDeviceInfo)_o1_;
			if (!info.equals(_o_.info)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += info.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(info).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


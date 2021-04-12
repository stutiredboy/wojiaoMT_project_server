
package fire.pb.move;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.scene.Scene;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqSeeEachOther__ extends mkio.Protocol { }

/** 主动请求跟某个在周围的角色互相看见，如果在周围，就推下来
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqSeeEachOther extends __CReqSeeEachOther__ {
	@Override
	protected void process() {
		// protocol handle
		final long reqroleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (reqroleId < 0)
			return;
		Role reqrole = RoleManager.getInstance().getRoleByID(reqroleId);
		Role seerole = RoleManager.getInstance().getRoleByID(roleid);
		
		if(reqrole == null || seerole == null)
			return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙閸戠晫绱為崱妯碱洸闁绘劕鎼崒銊╂煙閹殿喖顣奸柍閿嬪灴閺屻倕霉鐎ｎ偅鐝斿銈忕到閵堟悂骞冨Δ鍐當婵炴垶蓱閹兼劕顩奸崨瀛樷拺闁告稑锕ユ径鍕煕閻樺啿鍝洪柟顔兼健閺佹挻绂掔�ｎ偀鎷洪梺闈╁瘜閸樺吋绂嶆ィ鍐╃厵妞ゆ牗淇虹�氫即鎽堕悙鐑樼厪闁割偅绻冮崳鎶芥煛閿熻姤绂掔�ｎ偆鍘撻梺鑺ッˇ浼此夊鍏犵懓顭ㄩ崼銏㈡毇闂佸搫鐬奸崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
		
		if(reqrole.getScene() != seerole.getScene())
			return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙閸戠晫绱為崱妯碱洸闁绘劕鎼崒銊╂煙閹殿喖顣奸柍閿嬪灴閺屻倕霉鐎ｎ偅鐝斿銈忕到閵堟悂骞冨Δ鍐當婵炴垶蓱閹兼劕顩奸崨瀛樷拺闁告稑锕ユ径鍕煕閻樺啿鍝洪柟顔兼健閺佹挻绂掔�ｎ偀鎷洪柣鐔哥懃鐎氼剛绮堥崘鈺冪濠㈣泛顑囧ú鎾煏閸℃锟藉摜鍙呭銈呯箰閹虫劙宕㈡禒瀣拺缂備焦蓱閻撱儵鏌熼懞銉х煉妤犵偛锕鎾偐閻㈢绱查梻浣虹帛椤牆鈻嶉弴鐐垫殾閻忕偟铏庡▓浠嬫煟閹邦厼绲婚柡鍡樼懄閵囧嫰顢曢敐鍥╃厜闂佽桨鐒﹂幐鑽ょ矉閹烘棑鎷烽敐搴濈敖闁伙絽鎼埞鎴︽倷閸欏妫￠梺鎼炲姀濞夋盯鎮鹃柨瀣窞闁归偊鍓涙鍥⒑缂佹ê濮嶆繛浣冲洢锟藉倹绺介崨濠勫幗濡炪倖鍔戦崹鑽ょ不閹绘崨搴ㄥ炊瑜濋煬顒勬煙椤旂晫鎳囨い銏℃瀹曠喖鎳滈棃娑变紦闂備礁鎼ú銊︽叏闂堟稓鏆﹂柛娆忣槷缁诲棙銇勯弽銊х畵闁告俺顫夐妵鍕煛閸屾粌寮ㄩ梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁糕剝鐟Σ顒勬⒒娴ｈ姤顥夐柛鐔跺嵆瀹曚即骞囬钘夊簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犲啿霉閻樿崵鐣烘慨濠冩そ瀹曨偊宕熼锟藉▍銈囩磽娓氬洤鏋熼柟鐟版搐椤曪絾绻濆顓炰簻缂佺偓濯芥ご鎼佸疾椤掑嫭鈷戠紒顖涙礀婢у弶銇勯妸銉﹀殗鐎殿喖鍟块埢搴ㄥ箛閳猴拷缁ㄨ顪冮妶鍡楅嚋闁圭兘鏀辨穱濠囶敃閿濆洦鍣梺鐟扮畭閸ㄥ綊鍩為幋鐙呮嫹閿濆骸浜滃ù鐘虫そ濮婂宕掑鍗烆杸缂備礁顑嗛崝妤呭礆閹烘閱囬柡鍥╁暱閹锋椽鎮峰鍛暭閻㈩垱顨婂顐︽焼瀹ュ棛鍘遍梺闈涱焾閸庢煡宕戦妷鈺傜厽婵炴垵宕弸锔剧磼閻樺磭鈽夐柍钘夘槸閳诲酣骞囬褌鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�
		
		Scene s = reqrole.getScene();
		int reqscreenindex = s.getScreenIndex(reqrole.getPos());
		int seescreenindex = s.getScreenIndex(seerole.getPos());
		if(Math.abs(reqscreenindex - seescreenindex) > 1)
			return;//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙閸戠晫绱為崱妯碱洸闁绘劕鎼崒銊╂煙閹殿喖顣奸柍閿嬪灴閺屻倕霉鐎ｎ偅鐝斿銈忕到閵堟悂骞冨Δ鍐當婵炴垶蓱閹兼劕顩奸崨瀛樷拺闁告稑锕ユ径鍕煕閻樺啿鍝洪柟顔兼健閺佹挻绂掔�ｎ偀鎷洪柣鐔哥懃鐎氼剛绮堥崘鈺冪濠㈣泛顑囧ú瀵告崉椤栫偞鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍕笡闁瑰嘲鎳橀幃鐑藉箥閾忣偆浜為梻鍌欒兌鐏忋劑骞忛悜鑺ョ厱婵°倕鍟敓鏂ょ到閳藉濮�閻樻妲版俊鐐�栧Λ浣圭珶閸儱绠洪柡鍥╁亹閺�浠嬫煟閹邦厽缍戦柣蹇曞枛閺屾盯濡搁妷褏楔閻庤娲╃换婵嬬嵁鎼淬劍鍤嶉柕澹啫濡囨繝鐢靛Х閺佹悂宕戝☉銏″�舵繝闈涱儏缁�澶嬬節婵犲倻澧涢柣鎾跺枛閻擃偊宕堕妸锔规嫻闁诲繐绻掗弫鍝ユ閹烘挻缍囬柕濠忕畱闂夊秹姊洪悷鏉挎Щ闁硅櫕锚閻ｇ兘顢曢敃锟界粈瀣棯閺夋妲归悗姘贡閿熺晫娅㈤幏鐑芥煕閺囥劌澧伴柛姗�浜跺娲箰鎼达絿鐣电紓浣虹帛鐢偟鍒掗弮鍫晩缂佹稑顑嗛鏃堟⒑缂佹ê濮堢憸鏉垮暣瀵啿鈻庨幇鈺�绨诲銈嗗姧缁插潡鎯岄幒妤佺厸濞达綀顫夌亸鎵磼閸屾稑绗ч柨鐔告灮缂嶅棙绂嶉悙鐑樺仼闁告繂瀚ч弨浠嬫煟閹邦剙绾фい銉у仱閺岀喓绮欏▎鍓у悑閻庤娲滈弫濠氱嵁鐎ｎ喗鍊锋い蹇撳暟閻╁酣姊绘担鍛婅础闁稿簺鍊濆畷褰掑垂椤愩値娲搁梺缁樺姉閸庛倝鎮￠弴銏＄厽闁归偊鍨辩涵楣冩煟閹炬潙濮夌紒杈ㄥ笧缁辨帒螣閼测晝鏉介梻浣筋嚃閸犳洜鍒掑▎寰盯宕橀妸銏☆潔濠德板�曢崯顖氱暦閻斿吋鈷掗柛灞剧懅閸斿秹鏌ｉ鍕Ш鐎规洘绻冮幆鏃堝Ω閵壯屾Н婵犵妲呴崹闈涒枍閿濆姹查柨鏃傛櫕缁★拷婵犵數濮撮崐鎼佸汲婵犲洦鐓涢柨鐔诲Г缁傛帞锟斤綆鍋嗛崢鍗烆渻閵堝棗濮夊┑顔芥尦閹﹢顢氶敓浠嬪蓟閿濆绠婚悗娑櫭棄宥囩磽娴ｈ櫣甯涚紒璇茬墛閹便劑鏁撴禒瀣叆婵犻潧妫欓崳浠嬫煕濮楀棗浜版慨濠冩そ瀹曘劍绻濋崘鐐棝缂傚倷鑳舵慨鐢稿箰閹间緡鏁嬮柨婵嗩樈閺佸啴鏌ㄩ弴顏呭闂佺粯鍔曢敃銉╁Φ閸曨垰绠崇�广儱鐗嗛崢锟犳⒑閸涘渚涘ù婊勭箘閹广垹鈹戠�ｎ偄浠洪梻鍌氱墛閸愬骞忛悜绛嬫晬闁绘劘灏欓ˇ銊╂⒑鐎圭姵銆冪紒璁圭節閺佹捇鎳為妷褉妲堥梺瀹狀潐閸ㄥ潡宕洪崟顖氱闁靛ě鍛仭闂傚倷鐒﹂幃鍫曞垂濞差亝鍋傞柨鐔哄Т閺勩儵鏌ｉ幇顒佹儓缂佺媴缍侀弻銊╁籍閸ヮ煈妫勯梺璺ㄥ枔閺咁偊宕楀锟藉濠氬Χ閸パ勭�抽梺鍛婎殘閸嬫盯锝為鍫熲拺缁绢厼鎳庨拕濂告煕鐎ｎ偄濮夋俊鍙夊姍楠炴锟介潧鎽滈幊婵嬫⒑閹肩偛鍔�闁告洦鍘洪柇顖滅磽閸屾艾锟介绮堟笟锟借棟妞ゆ牜鍋為崑澶愭煟閹惧啿鐦ㄩ柛銈嗘礃閵囧嫰骞囩捄铏规В闂佽桨绀侀澶愬蓟閵娾晜鍋勯柛鎾茶兌閻撴挸螖閻橀潧浠滈柛鐕佸亰閸┿垺鎯旈妸銉ь吅闂佺粯鍔曞璺衡枍濠靛棌鏀介柣鎰煐瑜把呯磼閹绘帗鍋ラ柟顔芥そ瀵剙鈻庨崜褍濮洪梻浣哥秺閸嬪﹪宕抽鐐茬闁绘垼妫勯崹鍌涖亜閹板墎鎮奸柛鎴節閺岋絾鎯旈姀銏㈠彎闂佸憡顨嗘繛濠囧箖娴兼惌鏁嬮柨鐔绘閻ｇ兘宕奸弴銊︽櫌婵犮垼娉涢鍡椻枍瀹ュ鈷掑ù锝堟鐢盯鏌涢弮锟介悧鐐哄Φ閹版澘绀冩い鏂诲灩椤︾敻鐛崶顒佸亱闁割偅纰嶇�氳棄鈹戦悙鑸靛涧缂佹彃娼￠幃娲籍閸繂鎯炲┑鐐叉閹稿鎮￠弴銏＄厵閻庣數顭堟牎濠电偛鎳忓ú婊堟晸閽樺浠涙繝銏★耿閺佸啴濡堕崶褍鐤惧┑锛勫亼閸婃洜鎹㈤幇顕嗘嫹濮樼厧娅嶇�殿喗妲掗ˇ鏌ユ煃鐟欏嫬鐏撮柟顔规櫇缁辨帒螣婵犳碍鏆樺┑锛勫亼閸婃牠宕归棃娴虫稑鈹戦崱娆愭闂佺鎻粻鎴︽倿濞差亝鐓曢柟鏉垮悁缁ㄤ粙鏌ｉ敃锟介悧鎾愁潖婵犳艾纾兼慨妯哄船椤わ拷濠电偞鎸荤喊宥夈�冩繝鍌滄殾闁哄洢鍨圭粻娑㈡煟濡わ拷閻楀繘宕㈡禒瀣拺閻熸瑥瀚崝銈夋煟鎺抽崝搴ｅ垝閸澁鎷烽敐搴℃灍闁绘挻鐩幃姗�鎮欐０婵嗘婵犳鍠栭崐鍧楀蓟閻旂⒈鏁婇柛婵嗗閹峰嘲鈹戦崱娆愭闂佸湱鍎ら崹鐔肺ｉ崼鐔稿弿婵°倧鎷锋俊顐ｆ⒒濡叉劙鏁撻敓锟�?
		
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(s.getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熼柟闂寸缁秹鏌涢锝嗗剷闁靛鏅滈悡鏇㈡煙閼割剙濡芥繛鍛閺屾稒鎯旈敐鍛亪闂佸搫鏈ú婵堢不濞戞熬鎷烽敐搴濈敖闁告梹娼欓埞鎴︽倷鐠鸿櫣姣㈠銈庡幖閻楁捇宕洪悙鍝勭闁挎棁妫勬禍褰掓煟閻樺弶鍘傞柛鎰屽懐鐓戦梻鍌氬�烽懗鍫曞箠閹捐鐤悹鎭掑妽瀹曟煡鏌熼幍顔碱暭闁稿鏅犻弻锝夊箣閿濆棭妫勭紓浣哄Х閺佸寮婚悢鐓庝紶闁告洟娼ч崝锟介梻浣哥秺椤ユ捇宕楀锟介悰顕�骞掑Δ锟界粻锝嗐亜閹捐泛鏋庨柛蹇擄躬濮婄粯鎷呴搹鐟扮闂佸憡妫戠粻鎾崇暦濠婂啠鏋庨柟鍨暞閺呮粓姊洪崜鎻掍簼婵炲弶锕㈤幃锟犳偄閻撳海顔愬┑鐑囩秵閸撴瑩鏁撴慨鎰拷鏇⑩�﹂崶顒�绠涙い鎾跺Х椤旀洖鈹戦悙瀛樼稇妞ゆ垵妫楅埢宥夊炊閳哄啰锛滈柡澶婄墐閺呮稒绂掗敂鍓х＜婵°倕鍟弸娑㈡煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗛敓绛嬪幑閸庨亶婀侀梺鎸庣箓濞层劑濡存繝鍐х箚闁圭粯甯炴晶娑樓庨崶褝韬い銏＄洴閹瑧锟芥稒蓱濞堟悂姊绘担鍛婃儓闁稿锕獮蹇涙倻閼恒儮鎷婚梺绋挎湰閻熝囁囬敂鍓х＝鐎广儱鎷戦煬顒傦拷瑙勬礃閸ㄥ墎鎹㈠┑瀣倞鐟滃秹宕戝澶嬧拺闁告稑锕ョ�垫瑩鏌涘☉鍗炵仯闁告濞�濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻缁橆殽閻愭潙鐏村┑顕嗘嫹闂侀潧鐗嗛幊鎰版偪閿熻姤淇婇悙顏勶拷鏍涙担鑲濇盯宕熼浣稿妳婵犵數濮村ú锕傚煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垺鍋愰柟棰佺劍閻ｅ爼姊烘导娆戞偧闁稿繑锚閻ｇ兘鏁愰崱妤冪獮婵犮垼娉涢惉濂告偩閻愵兛绻嗛柣鎰典簻閿熻姤鐗犻幃褍螖閸涱喖浠悷婊冪箳閸掓帡寮崼婵嬫暅濠德板�撻懗鍫曞矗閸℃せ鏀介柣妯肩帛濞懷勪繆椤愵偄骞栭崡杈╂喐閻楀牆绗氶柣鎾寸洴閺屾稑鈽夐崡鐐寸亾缂備胶濮烽崑銈夊蓟閿涘嫪娌柛鎾椾緤鎷烽幒鎳ㄥ綊鎮崨顖滄殼闂佽鍠楅悷鈺呫�佸Δ鍛＜婵炴垵宕幃瀣⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋涚粻鏉库攽閻樺疇澹橀柛銊ュ�块弻锝夊閵忊偓锟藉﹪鏌ㄩ悢璇残撴俊顐㈠暙閻ｅ嘲顫滈敓浠嬨�佸▎鎾冲簥濠㈣鍨板ú锕傛偂閺囥垺鐓冮柍杞扮閺嗙喖鏌熼崘鎻掓殲闁靛洤瀚伴、鏇熸償閳╁啫娅х紒鐐礃濡嫰婀侀梺鎸庣箓濞层劑骞楅崒鐐寸厱闁靛牆妫涢幊鍛磼鏉堛劌绗氱�垫澘瀚敓鏂ょ秵閸嬪嫰宕径鎰拺闁绘劘妫勯崝鐢电磼閻樿櫕灏柣锝囧厴瀹曞ジ寮撮妸锔芥珜濠电偠鎻紞锟芥い顐㈩樀椤㈡棃鎮㈤崗灏栨嫽婵炶揪缍�婵倗娑甸崼鏇熺厱闁挎繂绻掗悾鍨殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�
		{
			final long reqteamid = reqrole.getTeamID();
			final long addteamid = seerole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		reqrole.seeSomeone(seerole);
		seerole.seeSomeone(reqrole);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790486;

	public int getType() {
		return 790486;
	}

	public long roleid;

	public CReqSeeEachOther() {
	}

	public CReqSeeEachOther(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqSeeEachOther) {
			CReqSeeEachOther _o_ = (CReqSeeEachOther)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqSeeEachOther _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


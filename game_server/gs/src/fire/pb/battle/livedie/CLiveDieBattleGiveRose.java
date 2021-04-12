
package fire.pb.battle.livedie;

import gnet.link.Onlines;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleGiveRose__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleGiveRose extends __CLiveDieBattleGiveRose__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘婵倗绮婃导瀛樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕奸弴妤嬫嫹閿曞倸閱囬柕澶涢檮濞呭洤顪冮妶鍛闁绘挾绮鍕箛椤掑偆鍟嬬紓鍌氬�烽悞锕傛晪闂佸憡鎼粻鎴︹�旈崘顔嘉ч柛娑卞灣椤斿洭姊虹紒姗嗘畷缂侇喗鎸搁锝夘敃閿曪拷閻愬﹥銇勯幒宥堝厡闁告ü绮欏楦裤亹閹烘垳鍠婇梺鍛婎焽閺咁偆妲愰悙鍝勭闁绘劗鏁搁鏇㈡⒑閸涘﹦鈽夋繛灞傚�濆畷鏉款潩椤戞拝鎷烽幒鎾剁瘈婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插�块弫鎾绘偩鐏炴儳娈岄梺瀹狀嚙缁夌懓鐣烽崼鏇ㄦ晢濞达絽鎼獮鎰攽閻愯埖褰х紒鑼跺Г缁旂喐绻濋崶銊ヤ簵闂佸吋绁撮弲顏堝箯瀹勬壋鏋旈柛顭戝枟閻忓牆顪冮妶搴″箻闁稿繑锚椤曪綁顢曢敃锟界粻娑欍亜閹捐泛浠х紒鎰仦缁绘繈鎮介棃娑楁睏闂佺懓鍟垮ú顓烆嚕閺屻儲鍋愰悹鍥蔼閹芥洟姊洪崫鍕窛闁哥姴娴峰▎銏ゆ倷閻戞鍘卞銈嗗姧缁茶法绮婚幘鏂ユ斀妞ゆ柨鐏濋悡鎰磼缂佹銆掗柨鐔烘櫕閺佹悂鈥﹂崼銉э拷鐑芥⒒娴ｄ警鐒炬い鎴濇瀹曟繂螖閿熻棄宓勯梺鍦濠㈡绮绘繝姘仯闁搞儺浜滈惃娲煥濞戞瑧鐭婇柍瑙勫灴椤㈡瑧绱撶�涙ê鐏撮柟顖欑窔閹粓鎸婃径妯荤秱闂備線娼х换鍫ュ垂婵犳碍鏅繝濠傚缁★拷闂侀潧楠忕徊鍓ф兜妤ｅ啯鐓涢柛顐亜婢у锟借娲滈弫濠氬极閹惧顩烽悗锝庡亐閹风儤绻涢弶鎴濇倯闁荤啙鍥х畺濠靛倸鎲￠悡鏇㈢叓閸ャ劍顥栭柤鏉挎健閺岋絽鈽夐崡鐐寸亪濡炪値鍋呯划鎾诲极閹剧粯瀵犲璺烘湰濞堥箖姊虹紒妯虹仼闁烩剝妫冨顐﹀炊椤掍胶鍘藉┑鈽嗗灡鐎笛囨偟椤忓棛纾煎Λ鐗堢箓娴滅増鎱ㄦ繝鍌ょ吋鐎规洘甯掗埢搴ㄥ箣椤撶啘婊堟⒒娴ｅ憡璐￠柍宄扮墦瀹曟垶绻濋崒婊勬闂佸搫顦花鍗炍ｉ崼銉︾厪闊洦娲栧暩濡炪倖鏌ㄥΛ娆愮┍婵犲洦鍊风�瑰壊鍠栭崜鏉库攽閻愬瓨灏︽い銉︽尵閸掓帗绻濆顒傜潉闂佸壊鍋嗛崰鎾诲储閻㈠憡鐓涘璺猴功婢э妇绱掗悩宕囧ⅹ妞ゎ剙锕、姘舵晸娴犲钃熺�广儱顦伴悡銉╂倵閿濆簼绨藉ù鐓庣焸濮婃椽宕崟顒佹嫳缂備礁顑嗛崹鍧楀春閵夛箑绶炲┑鐘插瀵ゆ椽姊洪崜鎻掍簼缂佽鍊块敐鐐烘偐缂佹ǚ鎷绘繛杈剧到閹诧繝骞夐幖浣圭厱闁绘娅曠粈鍫澝瑰鍜佺劸闁宠閰ｉ獮瀣倻閸℃绋愰梻鍌欑濠�閬嶅磿閵堝锟藉啴宕卞☉妯硷紱闂佽澹嗘晶妤呮偂閺囥垺鐓欓梺顓ㄧ畱閻忕娀鏌ｉ妸銉︽儓闂囧鏌ｉ幘铏崳闁绘帒鎲￠幈銊︾節閸涱噮浠╅梺褰掝棑婵烇拷闁搞劑绠栭幖褰掝敃閵堝嫭鍠氭繝鐢靛Х椤ｎ喚妲愰弴銏犵；闁绘娅曢崣蹇涙煏閸繃顥犻柍鐟扮Т閳规垿鎮╅崣澶嬫倷缂備胶濮烽幊鎾绘箒闂佹寧绻傞幊蹇涘箟閹间焦鐓曟俊顖滃劋閸熺偟绱掔紒妯尖檨婵炵厧绻樺畷婊嗩槼闁稿瑪鍥ㄢ拺缁绢厼鎳忛悵顏堟煙缁嬪灝鈷旈柛鎺撳笚缁绘繈宕堕妸锔筋仧闂備浇娉曢崳锕傚箯閿燂拷?
				xbean.LDVideoRoleInfoDes des = LiveDieMange.ldvideoroleinfodeslistall.get(vedioid);
				if(des==null){
					return false;
				}
				xbean.LDVideoRoleInfoDesList lDVideoRoleInfoDesList=xtable.Ldvideoroleinfodeslisttab.get(1);
				if(lDVideoRoleInfoDesList==null){
					return false;
				}
				xbean.LDVideoRoleRoseInfoList list = xtable.Ldvideoroleroseinfolisttab.get(roleid);
				if(list==null){
					list=xbean.Pod.newLDVideoRoleRoseInfoList();
					xtable.Ldvideoroleroseinfolisttab.insert(roleid, list);
				}
				xbean.LDVideoRoleRoseInfo lDVideoRoleRoseInfo=list.getLdvideoroleroseinfolist().get(vedioid);
				if(lDVideoRoleRoseInfo==null){
					lDVideoRoleRoseInfo=xbean.Pod.newLDVideoRoleRoseInfo();
					list.getLdvideoroleroseinfolist().put(vedioid, lDVideoRoleRoseInfo);
				}
				if(lDVideoRoleRoseInfo.getRosenum()>=LiveDieMange.GIVE_ROSE_NUM_MAX){
					return false;
				}else{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犳娊鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閻楁洜鍙呴梺闈浥堥弲婊堝磿濡ゅ懏鐓曢柍鈺佸枤濡懐鎲搁悧鍫濈瑲闁哄懏鐓￠弻娑㈩敃椤愵澀绨肩紓鍌氱Т閻楀棝鍩為幋锔藉�烽柛娆忣槸濞呇勭節濞堝灝鏋熼柟绋垮暱閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滄粏鐏掓繝鐢靛Т濞层倗澹曢崸妤佺厵闁规鍠栭。濂告煟閹惧瓨绀嬮柟顔筋殜閺佹劙宕ㄩ鐔凤拷搴ㄦ⒒娓氬洤寮鹃柛銊ョ埣瀵鏁嶉崟顏呭媰闂佸憡鎸嗛崟顐㈢仭闂傚倷鑳剁涵鍫曞疾濞戞熬鎷峰顓熺凡闁伙絽鍢查～婊堟晸娴犲锟戒線寮敓浠嬪箯閸涱垱瀚氶柍钘夋噺鐎氬綊鏌涢妷顔煎闁抽攱甯掗湁闁挎繂瀚鐔兼煟閹烘柨浜鹃柕鍥у楠炲鈹戦崶鑸碉骏闂備胶鎳撶粻宥夊垂閽樺鏆﹀┑鍌滎焾鍞梺闈涱槶閸斿秹骞夋导瀛樼厽閹艰揪绱曢悾顓㈡煕鎼粹�宠埞閾荤偞绻涢崱妯哄闁告瑥绻戠换婵囩節閸屾粌顤�闂佺粯鎸婚悷锔炬崲濞戙垹閱囨繝闈涚墔閾忓酣姊洪崫鍕靛劀濠碘�虫川濡叉劙骞掑Δ锟界粻娑欍亜閹炬瀚弶瑙勭節濞堝灝鏋涢柨鏇樺劚椤啴鎸婃径灞炬濡炪倖鍔х粻鎴濇暜闂備線娼ч¨锟藉┑鈥虫穿閵囨劕顫濋懜纰樻嫽婵炶揪绲介幗婊呯矓閻戞ǜ浜滈柕澶涢檮瀹曞瞼锟借娲橀〃鍛扮亽婵炴挻鍑归崹杈╃礊鎼达絿纾介柛灞剧懅閸斿秹鎷戦崡鐐╂斀妞ゆ牗绋掔亸锕傛煛鐏炲墽娲撮柡浣稿�婚幏鐘诲箵閹烘棏鍟堥梻鍌欒兌閸樠囨倶濠靛枹娲敇閻戝棙缍庡┑鐐叉▕娴滄粌顔忓┑鍡忔斀闁绘ɑ褰冮弳鐔兼煕濞嗗繑顥㈡慨濠傛惈鐓ら悹鍥ㄥ絻椤晠姊洪棃娑氬闁诡喖鍊搁锝夘敃閿曪拷缁犺崵绱撴担濮戭亜鈻撻悢鍏尖拺闂傚牊渚楀Σ鍫曟煕鎼粹�宠埞鐞氭瑩鏌涢鐘插姕闁抽攱鍨垮濠氬醇濮橆厽鐝栫紓浣割槸婢у海妲愰幒妤冨彄妞ゆ挾濮烽悡鎾绘⒑鐠団�虫珝缂佺姵鐗犻獮鍐煥閸喎鐧勬繝銏ｆ硾閻牓宕ラ崨瀛樷拻濞达絿鎳撻婊勪繆椤愶紕鍔嶉柟渚垮姂婵″爼宕ㄩ鍛拷鍝勨攽閻樿宸ラ柣妤�锕崺娑㈠箣閿旂晫鍘甸梺鍏肩ゴ閺呮稒绂掑鍫熺厱闁哄喛鎷烽柨鏇樺灲瀵鈽夐姀鐘愁棟闁荤姵浜介崝搴ㄥ礉椤栫偞鈷戦悹鍥ｏ拷宕囦哗闂佸摜鍠愰幐鎶藉Υ娓氾拷瀵挳濮�閳╁啯鐝曢梺鑽ゅ枑閻熻京寰婇崜褝鎷峰鍐蹭汗缂佽鲸鎹囧畷鎺戭潩椤掑﹥瀚归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑疾椤忓嫧鏀介柣妯诲墯閸熷繘鏌涢悩宕囧⒌闁诡啫鍥х閻犲洩灏幗鏇㈡⒑缂佹ɑ鈷掗柍宄扮墦瀵偄顓奸崱妯哄伎濠碘槅鍨伴妵姗�宕ラ锔界厱闁哄啯鍨甸悘锕傛煙椤旂瓔娈橀柟鍙夋尦瀹曠喖顢楅崒銈喰為梻鍌欑劍閹爼宕濆畝鍕ф慨婵嗘湰椤ャ倝鏌ｉ悢鍝ョ煂濠⒀勵殘閺侇喖螖閸涱喖浜楀┑鐐村灦閻旑剟骞忛悜鑺ュ剬闁告稑锕ら鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟粌鈽夐姀鈥冲墾闂佸壊鍋侀崕鏌ュ煕閹达箑绾ч柣鎰綑椤ュ鏌涢弬璺ㄐч柡宀�鍠栭幃鐑芥偋閸繃鐏庨柣搴㈩問閸ｎ噣宕戞繝鍥╁祦婵☆垵鍋愮壕鍏间繆椤栨粎甯涙い蹇曞枛濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
					lDVideoRoleRoseInfo.setRosenum(lDVideoRoleRoseInfo.getRosenum()+1);
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犳娊鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閻楁洜鍙呴梺闈浥堥弲婊堝磿濡ゅ懏鐓曢柍鈺佸枤濡懐鎲搁悧鍫濈瑲闁哄懏鐓￠弻娑㈩敃椤愵澀绨肩紓鍌氱Т閻楀棝鍩為幋锔藉�烽柛娆忣槸濞呇勭節濞堝灝鏋熼柟绋垮暱閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滄粏鐏掓繝鐢靛Т濞层倗澹曢崸妤佺厵闁规鍠栭。濂告煟閹惧瓨绀嬮柟顔筋殜閺佹劙宕ㄩ鐔凤拷搴ㄦ⒒娓氬洤寮鹃柛銊ョ埣瀵鏁嶉崟顏呭媰闂佸憡鎸嗛崟顐㈢仭闂傚倷鑳剁涵鍫曞疾濞戞熬鎷峰顓熺凡闁伙絽鍢查～婊堟晸閼恒儰绻嗛柟闂寸劍閺呮粓鏌﹀Ο渚Ц濠碘�崇仢閳规垿鎮╅崹顐ｆ瘎闂佺顑嗛惄顖炲箖濞差亜惟鐟滃秹宕瑰┑鍫嫹閻у憡瀚归梺璺ㄥ枔閺咁偄危閹扮増鍊烽悗闈涙憸閻﹀牓姊洪幖鐐插妧闁糕剝蓱閸熸椽姊婚崒娆掑厡缂侇噮鍨伴～蹇旂節濮橆剙鍋嶉悷婊冪箳閸掓帞鎷犲顔藉兊闁哄鐗勯崝宀勫几閹达附鍊垫鐐茬仢閸旀碍銇勯敂璇茬仩閺佸牓鏌＄仦璇插姎缂佺嫏鍥ㄧ厱妞ゆ劧绲块埥澶娾攽閿涘嫷鐒鹃棁澶嬬節婵犲倸顏柣顓熷浮閺岋紕浠﹂悙顒傤槹閻庤娲滈崢褔鍩為幋锕�鐐婄憸搴敂閿熺姵鈷掑〒姘炬嫹婵炶壈宕靛濠囨嚃閳轰礁鐏婂┑鐐叉閹告悂鎷戦悢鍏肩厽闁哄啫鍊哥敮鍫曟煟椤撶噥娈旀い顓℃硶閹瑰嫭绗熼姘闂備浇娉曢崰鏇熸叏閵堝绀夋繛鍡樻尭閽冪喖鏌ｉ弮鍌楁嫛闁轰礁锕弻鏇熺箾閸喖濮曢梺鐟板悑閸旀瑥顫忓ú顏勭闁绘劖娼欓弸鐘绘⒑閸濆嫮鐒跨紓宥勭椤曪綁顢楅崟顐ゎ唹闂侀�涘嵆濞佳勪繆閾忣偆绡�缁剧増锕幏鐑芥惞椤愮喐鐏嗛梻浣告啞閹搁箖宕版惔顭掔稏闊洦娲滅壕鍏间繆椤栨繍鍤欐い搴㈡尰缁绘盯骞橀弶鎴濇瘓闂佹悶鍔嶆繛濠傜暦濠靛绠瑰ù锝呮贡閸樹粙鏌熼崗鑲╂殬闁搞劌顭烽崺銏ゅ箻缂佹鍘搁梺鍛婁緱閸犳艾煤閹绢喗鐓欐い鏃囨閸斻倝鏌嶇憴鍕仼闁跨喐鏋荤紞鍡樼閻愪警鏁婇柟閭﹀幘缁犻箖寮堕崼婵嗏挃闁告帊鍗抽弻鐔兼嚍閵壯呯厜闂佽鍠氶崑鎾诲Χ閿濆绀冮柍鍦亾鐎氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐Χ閸℃ê寮块梺鎸庢礀閸婂綊鎮￠弴銏＄厽婵☆垵娅ｉ敍宥咁熆瑜戞禍顒傛閹烘鏁婇柤娴嬫櫅閳亶姊虹捄銊ユ瀾闁哄宕电槐鐐哄幢濞戞锛涙繛杈剧到濠�閬嶃�呴崣澶岀瘈濠电姴鍊绘晶娑㈡煟閹惧鎳囬柡宀�鍠撻幉鎾礋椤愩埄娼旂紓浣鸿檸閸樹粙宕曢幎鑺ョ畳闂備胶绮敋闁哥喎鐏濋湁妞ゆ洩鎷烽柡宀嬬磿娴狅箓宕滆閸掓盯鎮楀▓鍨灆缂侇喗鐟︽穱濠傤潰瀹�濠冃╅梻浣稿暱閸㈡煡鎯岄崒姘兼綎婵炲樊浜滄导鐘绘煕閺囥劌骞橀柛鏂挎贡缁辨捇宕掑姣欙紕绱掗懜闈涘摵闁绘侗鍣ｅ畷姗�顢欓懖鈺佸箰濠电偠鎻徊钘夘嚕閸洘鍊靛┑鐘崇椤ュ﹥銇勯幇鈺佺仾濠㈣泛瀚伴弻锛勪沪鐠囨彃顬堥梺瀹狀嚙缁夊綊寮幇鏉垮耿婵炲棙鍩堥崯搴ㄦ⒑鐠囧弶鎹ｉ柡浣规倐閳ワ箓宕奸妷顔芥櫅闂佺懓澧界划顖炲煕閹烘鐓曢柡鍥ュ妼娴滄粍銇勮箛锝呭箹闁宠鍨块弫宥夊礋椤掍焦鐦撻柣搴ゎ潐濞叉粓宕伴弽顓滐拷浣糕槈濮楀棙鍍甸柡澶婄墐閺呮粌顭块幋婵冩斀闁挎稑瀚禍濂告煕婵犲啰澧电�规洖缍婂畷濂稿即閻愮绱甸梻浣瑰劤濞存岸宕戦崱娑栵拷鍛存煥鐎ｃ劋绨婚梺鍝勬祩娴滄繄锟芥艾缍婂铏规嫚閳ヨ櫕鐏嶅銈冨妼閹虫﹢宕洪姀銈呯閻犲洦褰冮悗顓烆渻閵堝棙鈷掗柡鍜佸亯閵囨劙寮婚妷锔规嫽婵炶揪绲块崕銈夊吹閿熶粙姊洪幖鐐诧拷鏍偋閻樿崵宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?
				des.setRosenum(des.getRosenum()+1);
				for(xbean.LDVideoRoleInfoDes desdb:lDVideoRoleInfoDesList.getLdvideoroleinfodeslistall()){
					if(desdb.getVideoid().equals(vedioid)){
						desdb.setRosenum(des.getRosenum());
						break;
					}
				}
				SLiveDieBattleGiveRose sLiveDieBattleGiveRose=new SLiveDieBattleGiveRose();
				sLiveDieBattleGiveRose.vedioid = vedioid;
				sLiveDieBattleGiveRose.rosenum = des.getRosenum();
				sLiveDieBattleGiveRose.roseflag = lDVideoRoleRoseInfo.getRosenum();
				Onlines.getInstance().send(roleid, sLiveDieBattleGiveRose);
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793844;

	public int getType() {
		return 793844;
	}

	public java.lang.String vedioid; // 录像id

	public CLiveDieBattleGiveRose() {
		vedioid = "";
	}

	public CLiveDieBattleGiveRose(java.lang.String _vedioid_) {
		this.vedioid = _vedioid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(vedioid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		vedioid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleGiveRose) {
			CLiveDieBattleGiveRose _o_ = (CLiveDieBattleGiveRose)_o1_;
			if (!vedioid.equals(_o_.vedioid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += vedioid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(vedioid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


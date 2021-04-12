
package fire.pb.circletask.anye;
import fire.pb.HelpCountManage;
import fire.pb.item.ItemBase;
import fire.pb.item.Pack;
import fire.pb.npc.SubmitType;
import fire.pb.pet.PetColumnTypes;
import fire.pb.talk.MessageMgr;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSubmitThings__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSubmitThings extends __CSubmitThings__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.item.Pack submiterBag = new fire.pb.item.Pack(roleid, true);
		for (SubmitThing unit : things) {
			if (submittype == SubmitType.PET)
				continue;
			if (submittype == SubmitType.MONEY) {
				long money = unit.key;
				if (submiterBag.getMoney() < money)
					continue;
			} else {
				ItemBase bi = submiterBag.getItem(unit.key);
				if (bi == null) {
					continue;
				}
				if (bi.getNumber() < unit.num) {
					continue;
				}
			}
		}
		
		java.util.List<xbean.PetInfo> pis = null;
		if (submittype == SubmitType.PET) {
			pis = new java.util.ArrayList<xbean.PetInfo>();
			final fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(roleid, PetColumnTypes.PET, true);
			for (SubmitThing unit : things) {
				fire.pb.pet.Pet pet = petcol.getPet(unit.key);
				if (pet == null || pet.isLocked() != -1)
					return;
				if (petcol.petIsFightPet(unit.key) || petcol.petIsShowPet(unit.key)) {
					MessageMgr.sendMsgNotify(roleid, 144418, null);
					return;
				}
				pis.add(pet.getPetInfo().copy());
			}
		}
		
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitThing unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}
		
		if (taskid == 1080000 && roleid != taskrole) {
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘⒐閸ㄦ繂顫濋敂鍓х＝闁稿本鑹鹃敓鑺ユ倐瀹曟劙鎮滈懞銉ユ畱闂佸吋鎮傚褔宕归弮鍫熷�甸梻鍫熺♁閹插摜绱掗敓鑺ョ節閸屾﹫鎷烽幒鎴僵闁绘劦鍓欓鍫曟煟鎼淬埄鍟忛柛鐘崇墵閳ワ箓鎮滈挊澶岀暫闂侀潧绻堥崐鏍磻閺嶎厽鍊垫繛鎴烆仾椤忓牜鏁傞柛顐ｆ礃閳锋垶鎱ㄩ悷鐗堟悙闁诲浚浜濋妵鍕籍閿熶粙鎮ч悩璇茬畺闁绘劖鐣崑鍛存煕閹扳晛濡奸柛鐐姂濮婅櫣鎹勯妸銉︾亖婵犳鍠氶弫濠氬春濞戙垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛殐闁冲搫鍊稿▍妯肩磽閸屾瑧顦︽い锔跨矙瀹曚即寮介鐔虹暢濠电姷鏁告慨鎾晝閵堝鐤ù鍏兼綑閺勩儵鏌ㄥ┑鍡樼カ闁瑰嘲鍢查埢鎾诲垂椤旂晫浜俊鐐�ら崢楣冨礂濮楋拷閻涱噣宕橀纰辨綂闂侀潧鐗嗗Λ娆撳磿椤忓牊鈷戦梻鍫氭櫅閻︽粓鏌涘▎蹇曠婵″弶鍔欏畷锝嗗緞瀹�锟介惁鍫㈢磼閸撗冾暭閽冭鲸銇勯顫含闁哄本鐩俊鎼佸煛閸屾盯鏁梻浣风串缁插潡宕楀锟介獮鍐╃鐎ｎ偄浠洪梺姹囧灮閺佹悂宕㈤鐐粹拻濞达綀顫夐崑鐘绘煕鎼搭喖鐏︾�规洘绻冮幆鏃堟晲閸涱厜姘舵⒑鐠恒劌鏋欐俊顐㈠閸╃偤骞嬮敂钘夛拷鐑芥煠绾板崬澧い锝嗘そ濮婅櫣鎷犻懠顒傤唹缂備浇顕ч崐鍧楀春閵忕媭鍚嬮柛娑樺�婚崰鎰紦娴犲鍋╅悘鐐村劤濞堝苯顪冮妶搴″箲闁告梹鍨甸悾鐑芥偄绾拌鲸鏅ｉ梺缁橈耿濞佳呮暜閵娾晜鈷掗柛灞剧懆閸忓瞼鐥鐐靛煟鐎殿噮鍓熷畷鎺楁倷閹绘帞锟筋厼鈹戦悙鍙夆枙濞存粍绮庣划璇差潩閼哥數鍘搁梺鍛婂姂閸斿孩鏅堕弴銏犵畾闁绘柨鍚嬮埛鎴︽⒒閸喎鍠曠紒鎲嬬節閺屾盯骞囬埡浣割棊闂侀潧鐗嗛ˇ浼村煕閹烘鐓曢悘鐐插⒔閹冲懏銇勯敂鑲╃暤闁哄瞼鍠撻幏鐘侯槾缂佲槄鎷烽柣搴ゎ潐濞叉鎹㈤崱娆戜笉婵炴垶菤濡插牊淇婇姘倯闁绘搫绲剧换婵嬫偨闂堟刀銏ゆ煥閺囨ê锟芥繈骞冭椤劑宕煎┑鍥╋拷顒佺節閻㈤潧孝閻庢碍鎮傞獮蹇涙倻閻ｅ苯绁﹂梺鍓茬厛閸犳牗鎱ㄦ惔鈽嗘富闁靛牆绻掔槐浼存煕濡や礁鈻曠�规洖鎼埥澶愬閻樻鍚呴梻浣瑰濮婂寮查锕�鍌ㄩ柛妤冨亹閺�浠嬫煟濡偐甯涙繛鎳峰嫪绻嗘い鎰剁秵濞堟粍銇勯姀鈩冾棃闁糕晪绻濆畷鎺懳熼崷顓犳晨闂傚倸顭崑鍕洪敃锟介～蹇涘捶椤撴繄鍓ㄩ梺鎸庢礀閸婂綊鎮″☉銏″�堕柣鎰絻閳锋梹绻涢崣澶嬬稇闁宠鍨块崺鍕礃閳轰緤鎷烽幇顑芥斀闁炽儱纾崺锝囷拷瑙勬磸閸旀垿銆佸锟介幃鈺咁敊闂傚鐥呮繝鐢靛Т閻ュ寮堕崠鈩冨婵°倓鐒﹂崣蹇涙煟閹达絾顥夌痪鍓х帛缁绘盯骞嬮悜鍡欏姱濠电偞鍨惰彜闁哄閰ｉ弻鐔煎箚瑜忛敍宥嗐亜閺傛寧顥㈡慨濠冩そ瀹曘劍绻濋崟銊︻�囨繝鐢靛仜閸氬鎮疯閸掓帡宕奸妷銉╁敹闂侀潧顧�婵″洭宕㈤悽鐢电＝闁稿本鐟ч崝宥夋煥濮樿京纾兼俊銈勮兌椤ｈ尙绱掔紒妯兼创鐎规洏鍔戦、姗�濡搁妸銉﹀創濠电姵顔栭崰鏍晝閿旀儳鍨濇い鏍仜缁狀垶鏌涘☉娆愮稇鐎瑰憡绻傞埞鎴︽偐閹绘帪鎷烽悷鎵虫灁婵鎷锋慨濠勭帛閹峰懘鎸婃径濠冨劒闂備礁鎽滄慨鏉懳涘┑鍡欐殾闁哄洨鍠愭刊鎾煕閹般劍娅撴俊顐犲妼閳规垿鏁嶉崟顐℃澀闂佺锕ラ悧鐘诲箖瑜嶈灃闁告劦浜為悡鎾绘⒑閸︻厼鍔嬫い銊ユ嚇閹苯螖閸涱垰褰勯梺鎼炲劘閸斿酣鍩︽笟锟介弻锝夊箻閸楃偛濮﹂梺鍝勭焿缂嶄礁顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�
			//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤悮瀛樺闁汇垺顔栭悞楣冨疮閸濄儳纾藉〒姘攻鐎氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯垮煐閳锋垿姊婚崼鐔衡檨闁瑰吋鍔欓幃妤�顫濋鐔哄嚒濡炪倖娲╃紞渚�鐛锟介、娆撴偂鎼淬倧鎷烽崹顔规斀閹烘娊宕愯楠炲繘鏌ㄧ�ｃ劋绨婚棅顐㈡祫缁插ジ鏌囬鐐寸厸閻忕偛澧介埥澶愭煃鐠囧弶鍞夌紒鐘崇洴瀵挳鎮敓浠嬪疮鐎ｎ喗鈷掑ù锝呮啞閹牓鏌ｉ鐑嗘Ш缂佽京鍋炵粭鐔兼晸娴犲鍋樻い鏇嫹鐎规洖鐖奸、妤佸緞鐎ｎ偅鐝滄繝鐢靛仩閹活亞寰婇崸妤�绠犻柟鎹愵嚙缁�鍫ユ煟閵忋垺鏆╃痪鍙ョ矙閺屾稓浠﹂崜褎鍣梺绋跨箰閼活垶鍩為幋锔绘晩闁诡垎鍐ㄧ闁诲孩顔栭崳顕�宕戦崨顖涘床婵犻潧妫鈺傘亜閹烘垵鏆為柟韫嵆濮婄粯鎷呯憴鍕紘闂佸搫鎳忛惄顖氱暦椤栫儐鏁冮柕鍫濇－閸嬨劑姊虹紒妯哄闁稿簺鍊濆畷鎰版偨閸涘﹦鍙嗗┑鐘绘涧濡盯宕欓崷顓犵＜闁靛鍔嶉ˉ澶愭婢舵劖鐓熸俊顖涘閻濐亪鎮樿箛銉х暤闁哄瞼鍠栭、娆撳箰鎼达絻锟芥劕顪冮妶搴′簼缂佽鐗嗛悾鐑芥晸閻樺啿锟界兘鏌熼幍铏珔闁告柣鍊楃槐鎺撴綇閵娿儳鐟插┑鐐靛帶缁绘ɑ淇婇幖浣规櫇闁跨喍绮欏Λ鍕吋婢跺鎷洪梺鑽ゅ枑濠㈡ê危婵犳碍鐓欓柧蹇ｅ�嬮鍫熷仼闁绘垼濮ら崐鑽ょ磼濞戞﹩鍎愰柡鍜冪到閳规垿鎮欓弶鎴犱桓闂佽崵鍣ラ崹浼粹�﹂崶顒�妫橀幖瀛樻尰閺傦拷闂備焦瀵х粙鎴狅拷姘煎墯缁傚秵绺介崨濠勫幈婵犵數鍊崘鈺佹婵炴垶鎸哥粔褰掑蓟閻斿吋鍊绘俊顖濐嚙閽勫吋绻涚�电孝闁绘鎹囧濠氭偄閸忓皷鎷婚梺鍦檸閸犳顢撻弽顓熲拺閻犳亽鍔岄弸娆愪繆椤愩垹顏�规洦鍨抽敓鑺ョ♁鐪夌紒璇叉閺岋綁骞嬮敐鍡╂闂佺粯鎸荤粙鎴︽箒闂佹寧绻傞幊蹇涘箚閸儲鐓ラ柣鏃傚劋濞呮洟鏌涚�ｎ偆娲撮柍銉︽瀹曟﹢顢欓崲澹洦鐓曢柍鈺佸枤濞堟﹢鏌ｉ悢绋垮闁哄矉缍侀幃鈺傛綇閳轰礁顬夐梻浣虹帛閹碱偆鎹㈠┑瀣仒妞ゆ洩鎷锋鐐叉喘瀵墎鎹勯…鎴炐炲┑锛勫亼閸婃牕螞娴ｇ瓔鏆伴梻浣哥秺閺�鍗烆渻娴犲绠栫�瑰嫰鍋婇悡銉╂煕濞戝崬寮鹃柡鍡╁弮閺岋綁濮�閳轰胶浠柣銏╁灡椤ㄥ牏鍒掔�ｎ亶鍚嬮柛鈩冾殢閸ゃ倝鏌ｆ惔銏⑩檨妞ゎ厼娲畷銏ゆ焼瀹ュ棌鎷洪柣鐔哥懃鐎氼剟宕濋妶鍡愪簻闁哄洢鍔屽顔筋殽閻愯韬�规洖鐖奸、妤佹媴閸濆嫬绠ュ┑锛勫亼閸婃牕煤閺嶎灛娑樷槈濮橆剙袣闂佽法鍠嶇划娆忣潖閻戞ɑ濮滈柟娈垮枛婵′粙姊洪崷顓熷殌婵炲樊鍘奸锝夘敃閿曪拷缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
			int submiterLv = xtable.Properties.selectLevel(roleid);
			if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
				MessageMgr.sendMsgNotify(roleid, 145390, null);
	    		return;
			}
			
			xbean.helpcount helpcount = xtable.Helpcount.select(roleid);
	    	int max=HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
	    	if(helpcount!=null&&helpcount.getHelpgiveitemnum()>=max){
	    		MessageMgr.sendMsgNotify(roleid, 166088, null);
	    		return;
	    	}
	    	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘婵倗绮婃导瀛樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕奸弴妤嬫嫹閿曞倸閱囬柣鏇氱劍椤旀棃姊洪崨濠勭細闁稿骸顭烽獮蹇撶暋閹佃櫕顫嶉梺鍦劋閹稿鎮靛顓犵瘈缁炬澘顦辩壕鍧楁煛娴ｇ瓔鍤欓柣锝囧厴閹垻鍠婃潏銊︽珫婵犳鍠楅…鍫熺椤掞拷椤洦寰勯幇顓涙嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓涢柛顐亜婢ф壆绱掗鐣屾噰妤犵偞甯掕灃濞达綁鏅查幋閿嬩繆閻愵亜锟芥洜鎹㈤幇鐗堝亱濠电姴娲ら悡鏇㈡煙鏉堥箖妾柣鎾寸懇閺屻倕霉鐎ｎ偅鐝旀繛瀵稿У缁矂鍩為幋锕�鐏抽柣鎰娴狀噣姊洪崫鍕拱婵炶尙鍠庨悾閿嬬附閸涘﹤浜滅紓浣割儏鐏忓懘骞忛悜钘夌疀妞ゆ挆鍕靛晬闂備胶绮崝鏍亹閸愵喖姹查柕蹇嬪�栭悡蹇涙煕閵夛絽濡煎┑顔肩У椤ㄣ儵鎮欓弶鎴炶癁濡ょ姷鍋涢澶愬箖閳哄啯瀚氱憸搴ｏ拷姘秺閺岋綁骞囬浣叉灆濠电偞鎸搁…鐑藉蓟閺囥垹閱囨繝闈涙祩濡偟绱撴担璇℃當闁稿﹤娼″濠氭晲婢跺﹦顔婇梺缁樺姉閺佹悂寮抽妶澶嬪�垫繛鍫濈仢閺嬬喎鈹戦悙璇ц含妤犵偛鍟撮崺锟犲礃椤忓棴绱叉繝纰樻閸ㄥ爼寮ㄦ潏鈺嬫嫹濮橆剙鎮戠紒缁樼箞閹粙妫冨☉妤�鎽嬮梺璇茬箰濞存碍绂嶉鍫涳拷浣糕枎閹邦喚鐦堥梺鍛婃处閸犳牕鐨梻鍌欒兌椤牏鎹㈠Δ鍛；闁归偊鍠栨慨顒勬煥閻斿墎鐭欐慨濠冩そ濡啫鈽夊杈╂毎婵犵鍓濊ぐ鍐拷姘嵆楠炲﹪骞樼拠鏌ユ暅濠德板�撻懗鍫曞储闁秵鈷戠�规洖娲﹂崵锟介梺璇茬箲缁诲牓骞冨锟介、鏃堝醇閻斿搫骞嶆俊鐐�栭悧妤冪矙閹烘澶愬醇濠靛啯鏂�闂佹枼鏅涢崯顖炲磹閹邦兘鏀介柨娑樺閻掓寧銇勯敂钘夌祷闁宠鍨块、娆撴嚃閳轰胶鍘芥繝娈垮枛閿曪妇鍒掗鐐茬闁告稒娼欏婵嗏攽閻樻彃锟界懓鈻撳锟藉缁樻媴閸涘﹤鏆堥梺鍝勮閸斿酣骞戦姀鐘栫喐绗熼姘吙闂備礁婀辩划顖滄暜閳哄懏鍋傞柕澶嗘櫆閻撴洘銇勯幇闈涗簻濞存粍绻堥弻锟犲川椤忓懏鐝氶梺璇″枟椤ㄥ﹪鎮伴锟藉畷褰掝敊閻撳寒娼涘┑锛勫亼閸娧呯磽濮樿泛纭�闁规儼妫勯弰銉︾箾閹存瑥鐏╃紒鐙呯秮閺屻劑寮崒娑欑彧闂佸憡锚瀹曨剟鍩為幋锔藉亹缂備焦蓱闁款厼鈹戦埥鍡椾簼妞ゃ劌锕妴渚�寮崼婵堝幐闂佺鏈湁缂併劌顭峰Λ鍛搭敃閵忊�愁槱濠殿喖锕ゅ﹢杈ㄧ閹间焦鏅濋柛灞剧〒閸樻悂鏌ｈ箛鏇炰粶濠⒀嗘鐓ら柡澶嬪灍閺�浠嬫煃閳轰礁鏆為柛濠冨姇閳规垿鍨惧畷鍥х厽閻庤娲忛崝鎴︺�佸锟介幃鈺咁敊闂傚鐥呮繝鐢靛Т閻ュ寮堕崠鈩冨婵°倓鐒﹂崣蹇涙煟閹达絾顥夌痪鍓х帛缁绘盯骞嬮悜鍡欏姱濠电偞鍨惰彜闁哄閰ｉ弻鐔煎箚瑜忛敍宥嗐亜閺傛寧顥㈡慨濠冩そ瀹曘劍绻濋崟銊︻�囨繝鐢靛仜閸氬鎮疯閸掓帡宕奸妷銉╁敹闂侀潧顧�婵″洭宕㈤悽鐢电＝闁稿本鐟ч崝宥夋煥濮樿京纾兼俊銈勮兌椤ｈ尙绱掔紒妯兼创鐎规洏鍔戦、姗�濡搁妸銉﹀創濠电姵顔栭崰鏍晝閿旀儳鍨濇い鏍仜缁狀垶鏌涘☉娆愮稇鐎瑰憡绻傞埞鎴︽偐閹绘帪鎷烽悷鎵虫灁婵鎷锋慨濠勭帛閹峰懘鎸婃径濠冨劒闂備礁鎽滄慨鏉懳涘┑鍡欐殾闁哄洨鍠愭刊鎾煕閹般劍娅撴俊顐犲妼閳规垿鏁嶉崟顐℃澀闂佺锕ラ悧鐘诲箖瑜嶈灃闁告劦浜為悡鎾绘⒑閸︻厼鍔嬫い銊ユ嚇閹苯螖閸涱垰褰勯梺鎼炲劘閸斿酣鍩︽笟锟介弻锝夊箻閸楃偛濮﹂梺鍝勭焿缂嶄礁顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�
	    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select((long) taskrole);
	    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(taskrole);
	    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
	    		MessageMgr.sendMsgNotify(roleid, 166093, null);
	    		return;
	    	}
		}
		
		fire.pb.circletask.PSubmitThings proc= new fire.pb.circletask.PSubmitThings(roleid,taskrole,things,taskpos);
		mkdb.Procedure.execute(proc);
		return;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807455;

	public int getType() {
		return 807455;
	}

	public int taskpos; // 任务栏位
	public int taskid; // 任务id
	public long taskrole; // 任务所属角色id(帮别人提交物品时用到)
	public int submittype; // 提交的类型 1道具 2宠物 3金钱
	public java.util.ArrayList<fire.pb.circletask.anye.SubmitThing> things; // 提交的道具key 或者宠物的key

	public CSubmitThings() {
		things = new java.util.ArrayList<fire.pb.circletask.anye.SubmitThing>();
	}

	public CSubmitThings(int _taskpos_, int _taskid_, long _taskrole_, int _submittype_, java.util.ArrayList<fire.pb.circletask.anye.SubmitThing> _things_) {
		this.taskpos = _taskpos_;
		this.taskid = _taskid_;
		this.taskrole = _taskrole_;
		this.submittype = _submittype_;
		this.things = _things_;
	}

	public final boolean _validator_() {
		if (taskpos < 0) return false;
		if (taskid < 0) return false;
		if (taskrole < 0) return false;
		if (submittype < 0) return false;
		for (fire.pb.circletask.anye.SubmitThing _v_ : things)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		_os_.marshal(taskid);
		_os_.marshal(taskrole);
		_os_.marshal(submittype);
		_os_.compact_uint32(things.size());
		for (fire.pb.circletask.anye.SubmitThing _v_ : things) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		taskid = _os_.unmarshal_int();
		taskrole = _os_.unmarshal_long();
		submittype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.circletask.anye.SubmitThing _v_ = new fire.pb.circletask.anye.SubmitThing();
			_v_.unmarshal(_os_);
			things.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSubmitThings) {
			CSubmitThings _o_ = (CSubmitThings)_o1_;
			if (taskpos != _o_.taskpos) return false;
			if (taskid != _o_.taskid) return false;
			if (taskrole != _o_.taskrole) return false;
			if (submittype != _o_.submittype) return false;
			if (!things.equals(_o_.things)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		_h_ += taskid;
		_h_ += (int)taskrole;
		_h_ += submittype;
		_h_ += things.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(taskrole).append(",");
		_sb_.append(submittype).append(",");
		_sb_.append(things).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


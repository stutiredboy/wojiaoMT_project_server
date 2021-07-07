
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
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑呴—鍐Χ閸愩劎浠鹃梺鑽ゅ暱閺呯娀鐛崘顔肩労闁告劏鏅涢崝鍛渻閵堝棙鈷愰柛銊︾箓椤繈鏁傞崜褏锛濋梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔欓幃婊堟嚍閵夈儲鐣遍梻浣稿悑閹倸顭囪瀹曞綊寮崼鐔凤拷鐢告⒒閸喓鈾侀柟鎻掓憸缁辨帡鏁撻懞銉х瘈闁稿本锕幏鐑藉箳閹搭厽鍍甸梺缁樺姦閸撴瑩顢旈崼鏇熺厽閹兼番鍩勯崯蹇涙煕閻樺磭澧甸柍銉畵閹粓鎸婃径宀�鏆梻渚�娼х换鍫ュ磹閺嶎厼纾婚柡宥庡幗閸婂灚绻涢幋鐑嗕痪妞ゅ繐鐗滈弫鍌炴煕椤愶絾绀冮柍閿嬪灦閹便劑鎮烽悧鍫熸倷闂佽娴氭禍婵嬪Φ閸曨垰绫嶉柨鐔剁矙閹囨偐鐠囪尙鐣洪梺缁樺姈閻ｎ亪宕戦崨瀛樼厱闁规壋鏅涙俊濂告煕閻愵亜濮傛慨濠呮閹瑰嫰濡搁妷锔句簴濠电姵顔栭崰姘跺极婵犳艾鏄ユ繛鎴欏灩缁狅絾绻濋姀锛勭畵缂傚秴锕ら悾宄拔旈崨顔兼異闂佸啿鎼崐绋库枍濡偐纾介柛灞剧懅椤︼附銇勯敂璺ㄧ煓鐎规洑鍗冲浠嬵敇閻旇櫣鏆㈡繝鐢靛Х閺佸憡鎱ㄩ幘顔芥櫇闁靛牆顦悿顔济归崗鍏肩稇闁哄嫨鍎甸弻銊モ攽閸℃銈梺鐟板槻閸㈡煡鍩㈤幘璇插瀭妞ゆ梻鏅禍顏呬繆閻愵亜锟姐倝宕㈡ィ鍐ㄧ婵鎷烽柣娑卞櫍瀹曟﹢顢欑喊杈ㄧ秱闂備線娼ч悧鍡椢涘▎鎾崇？妞ゅ繐鐗婇埛鎴︽⒒閸碍娅呴柣锔界矒閺屾稑鈻庤箛鏇狀唺濠碘�冲级閸旀瑥鐣烽敐鍡楃窞鐎癸拷閿熶粙鎯侀崼銏㈢＜闁告挆鍐炬毉闁藉啳椴搁妵鍕敃椤喛鍚梺鍝勬湰閻╊垱淇婇幖浣哥厸闁稿本鐩弫顏堟⒒娴ｉ涓茬紒鎻掓健瀹曟顫滈敓浠嬬嵁閸愨晝顩烽悗锝庡亜娴犳椽姊哄Ч鍥х伄闁轰焦鎮傚畷銏ゎ敍閻愮补鎷绘繛杈剧秬椤宕戦悩缁樼厱閹兼惌鍠栭悘锔撅拷瑙勬礃缁诲啴骞嗛弮鍫熸櫜闁告侗鍘滃鑸碘拺閻犳亽鍔岄弸娆愪繆椤愩垹顏柛鈺冨仱楠炲鏁傞挊澶涙嫹閻戣姤鐓犵痪鏉垮船婢ь喗銇勯敐鍡樸仢婵﹨娅ｉ幏鐘绘嚑椤掑偆鍞圭紓鍌欐祰椤曆囧磹閸ф鏄ラ柕蹇曞閸氬鏌涘☉妯猴拷濠氬窗閹邦喚绱﹀ù鐘差儐閸嬧晠鎮橀悙鏉戝姢婵炲牆鑻—鍐Χ鎼粹�崇闂佸憡姊归崹鐢告偩閻戣姤鍋勭痪鎷岄哺閺咃綁姊虹紒姗堣�挎繛浣冲懏鏆滈柕濞炬櫆閳锋帡鏌涚仦鍓ф噯闁稿繐鐬奸惀顏堫敇閻愰潧鐓熼悗娈垮櫘閸撶喎鐣烽幒妤佸�烽柟缁樺笧閿熺瓔鍘奸埞鎴︽倷閸欏鏋欐繛瀛樼矋缁海鍒掔拠宸僵闁煎摜鏁搁崢鎼佹⒑閸涘﹤濮傞柛鏂垮閺呭爼寮撮姀鐘电暰闂佺粯鏌ㄩ崥瀣煕閹达附鈷掗柛顐ゅ枎閸犳洜绱掗幉瀣瘈闁哄本鐩獮鍥煛娴ｅ壊妫婇梻渚�娼ч悧鍡浰囨导鏉戠厱闁圭儤顨嗛悡鏇㈡倶閻愭彃鈷旈柟鍐叉噺閵囧嫰鏁傞懖鈺冩殼闂佸搫鐬奸崰鎾诲箯閻樹警妲剧紓浣叉閹风兘鏌ｆ惔銈庢綈婵炲弶顭囬幑銏ゅ幢濞嗘垳绗夊┑鐐村灦鑿ゆ俊鎻掔墛娣囧﹪顢涘顒佸�梺缁樻惈缁插墽鎹㈠┑瀣仺闂傚牊鍒�閵忋倖鐓ラ柡鍥敓鑺ョ箞楠炲啳顦叉い顓滃姂瀹曠厧鈹戦崶鈺嬫嫹椤掍胶绡�闁汇垽娼у瓭闁诲孩纰嶉幃鍌炵嵁韫囨稒鍊婚柣锝呰嫰缁侊箓姊洪崜鑼帥闁哥姵鐗楅幈銊︽償閳藉棙瀵岄梺闈涚墕缁绘帞妲愭导瀛樼厱婵°倓绀侀埢鏇狅拷瑙勬礀閹碱偊鍩ユ径鎰潊闁绘ɑ顔栭崥鍛存⒒娴ｇ懓顕滄慨濠傤煼瀵煡顢曢敃锟介崒銊╂煕濡ゅ啫浜归柡锟芥禒瀣厽婵☆垵鍋愮敮娑欑箾閹冲嘲瀚换鍡樸亜閹板墎绉垫繛鍫熺矋閵囧嫰濮�閳╁喚妫冮梺绯曟櫔缁绘繂鐣烽幒鎳崇喖宕烽鐘虫櫒闂傚倸鍊搁…顒勫磻閸曨個娲晝閿熶粙锝炶箛娑樻嵍妞ゆ挻绻勯崜銊╂⒑閹稿孩绀�闁稿﹤缍婇幃鈥斥槈閵忊�筹拷鍫曟煟閹邦厼绲婚柍閿嬫⒐缁绘盯宕ｆ径瀣▏闂佸疇顫夐崹鍧楀春閸曨垰绀冮柍杞扮筏閹风兘骞囬鑺ユ杸闂佺偨鍎辩壕顓㈠春閿濆浄鎷风憴鍕８闁告梹鍨块妴浣割潨閿熶粙骞冮埡鍜佹晩闂傚倸顕惀鍛節閻㈤潧孝闁汇儱顦靛鍫曞礌閳╁啫顏跺┑掳鍊撻悞锕傚矗韫囨稒鐓熼柟杈剧稻椤ュ鐥崜褏甯涚紒缁樼洴楠炲鎮滈崱娆忓П婵犵數鍋為崹鎯板綔闂佸搫顑呴柊锝夊蓟閻旂厧绠氱憸蹇涙晬瀹ュ棎浜滈柡鍌涘椤ャ垺鎱ㄦ繝鍐┿仢鐎规洏鍔嶇换婵嬪礋閵婏富锟藉洦绻濋悽闈涗粶闁告艾顑夐幃鐤槾闁告帗甯″畷濂稿Ψ閵夆晛鏁归梻渚�娼ч¨锟藉┑鈥虫喘瀹曘垽鎮介悽鐢碉紳闂佺鏈悷褔宕濆澶嬬叆婵浜壕鍏间繆閵堝嫯鍏屾い锝堝皺缁辨帞绱掑Ο鍏煎垱閻庤娲忛崝鎴︺�佸锟芥俊鎼佸Ω閵夛箑鍓垫繝鐢靛У椤旀牠宕伴弽顓熸櫇闁挎梹鍎抽崹婵囥亜閺嶎偄浠滅紒鐙�鍨堕弻娑樷槈濞嗘劗绋囬悗鐟版啞缁诲倿鍩為幋锔藉亹闁圭粯甯幏鐑芥偡閹佃櫕鐏佸┑顔筋殣閹烽攱鎱ㄦ繝鍕笡闁瑰嘲鎳橀幐濠冨緞婵犲啫鍔掗梻鍌欑閹芥粍鎱ㄩ弶鎳虫稑鈹戦崱娆愭闂佸搫娲ㄩ崰鎰垔閹绢喗鐓曢柟鑸妽濞呮挻淇婇鐘插闁宠鍨块弫宥夊礋椤愨剝婢�闂備胶顭堥敃銉╂偋閻樿绠栫憸宥堢亙闂佸憡鍔︽禍鐐烘偂閹剧粯鈷戦柛锔诲幖閸斿銇勯妸銉﹀殗闁诡垰鑻灃闁告侗鍨拌ぐ鍕⒑閹肩偛鍔橀柛鏂块叄閸╋附绗熼敓浠嬪蓟閿濆绠婚柛妤冨仜婵箓姊洪崫鍕効缂傚秳绀侀锝夊箻椤旇棄锟界兘鎮归崶鍥у椤忓爼姊洪棃鈺佺槣闁告瑥绻橀獮蹇撶暋闁附鍍甸梺缁樺姦閸撴瑩顢旈敓锟�
			//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗙箾绾绡�鐎殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灪椤旀牠鎮炴ィ鍐ㄧ柈闁告縿鍎崇壕钘夈�掑顒婃敾閻庢俺顫夌换婵嬫偨闂堟刀銏＄箾鐠囇呯暤闁诡噯绻濇俊鐑藉煛閸屾粌骞楅梻浣告惈閸燁偄霉閸岀偛鍚规繛鍡樺灦閸嬫牗鎱ㄥΟ鍨厫闁抽攱鍨垮濠氬醇閻旇　妾ㄩ梺鐟板悑閸旀瑩骞冨Δ锟介～婵嬵敇閻斿搫鍤掓俊鐐�栧ú鈺冪礊娓氾拷閻涱喖顫滈敓浠嬨�佸▎鎾村亗閹兼番鍊ч幏鐑藉垂椤旇鏂�闁圭儤濞婂畷鎰樄妤犵偛绻橀弻銊э拷锝冨妺缁ㄥ妫呴銏＄カ缂佹彃銈搁弻鍥敍閻愬鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓閻犲洤寮堕崬澶岀磼閻樺磭娲寸�殿喗鎸抽幃顏堟晸娴犲鐤悗锝庡枟閳锋帒霉閿濆懏鍟為柟顖氱墦閺岋綁顢橀悜鍡樞ㄧ紓浣戒含閸嬬偟绮悢鍏兼櫢濞寸姴顑嗛崑妯汇亜閺囶亝瀚归悗瑙勬礀閻栧ジ銆佸Δ浣哥窞閻庯綆鍋呴悵婊勭節閻㈤潧浠╅柟娲讳簽瀵板﹪宕稿Δ锟界粻鐘绘煙閹规劦鍤欑紒锟介崼銉︾厽闁靛繈鍨洪弳鈺冪棯閸欍儳鐭欓柡灞剧〒娴狅箓宕滆閸ｎ垶姊虹粙璺ㄧ闁兼椿鍨堕崺鐐哄箣閿旂粯鏅╅梺璇″瀻閸愩劎顓洪梺璇插椤旀牠宕抽锟藉畷鎴﹀川椤栨稑搴婂┑鐘绘涧濡厼顭囬埡鍌樹簻闁圭儤鍨甸弳鐐烘煙闊厼宓嗘慨濠勭帛閹峰懐鎲撮崟顓濈礃闂備礁鎼幊蹇涙儎椤栨氨鏆︽い鏍剱閺佸啴鏌曢崼婵囷紞闁稿鍔戝铏圭磼濡搫顫庨梺绋跨昂閸婃繂鐣烽幇鐗堝仺闁告稑锕﹂崣鍡椻攽閻樼粯娑ф俊顐ｇ洴瀹曟瑩宕烽鐘碉紲闂侀潧顭堥崝宥壦夋径鎰梿濠㈣埖鍔栭悡鐔镐繆椤栨稑顕滈柣婵愪邯閹绠涢妷褏鏆ら梺鍝勭灱閸犳牠銆佸▎鎾崇閹艰揪绲婚敓鑺ュ姇椤啴濡舵惔鈥茬凹缂備浇顕ч悧鍡涙偩閻戣姤鏅搁柣妯哄暱閿熺晫鍏橀弻鐔煎箥閾忣偅鐝旈梺鍛婃煟閸婃妲愰幒鎾寸秶闁靛鍎抽悷鎻掆攽閻愰潧甯剁紒缁樕戞穱濠囧箹娴ｈ娅囬梺璺ㄥ枍缁瑥螞閸曨偒鍚嬪璺侯儌閹锋椽姊洪懡銈呮瀾婵犮垺锚鍗卞┑鐘崇閻撴瑩鏌ц箛锝咃拷瀣敂閸喎浠奸梺缁樺灱婵倝宕愰懡銈囩＜婵炴垶锕╅崕鎰版煛閸滃啰鍒伴柍瑙勫灴閹瑩寮堕幋鐘辨闂備浇宕甸崳銉╁垂娴肩补锟斤箓宕堕锟藉Λ姗�骞栫�涙ɑ灏伴柡鍌︽嫹闂傚倷鐒︾�笛呯矙閹寸媴鎷峰鐓庡缂佸倸绉电缓浠嬪川婵犲嫬骞堝┑鐘垫暩閸婎垶宕橀埡浣诡仱濠电偞鍨堕幐鍝ョ矓瑜版帒钃熼柣鏂垮悑閸婄粯淇婇婵愬殭闁藉嫬鍚嬬换娑氾拷鐢殿焾瀛濋梺缁橆殕閹瑰洤顕ｆ繝姘亜闁稿繐鐨烽幏濠氭⒑閸︻叀妾搁柛鐘愁殜椤㈡捇寮介鐔叉嫼闁荤姵浜介崝宀勫几濞嗘劒绻嗘い鎰╁灩椤忣厾锟借娲﹂崹鎶芥晸閼恒儳鈾侀惇澶岀磼鐠囧弶顥㈤柡宀嬬秮楠炲鏁愰崱鈺傤棄闂備胶绮幐鑽ょ矙閹达附绠掗梻浣瑰缁诲倿骞婅箛娑樼畾闁割偁鍎查悡銉╂煟閺冨倸鍔嬫繛鍛礋閺屾稓锟斤綆鍋嗗ú鎾煃閵夛附顥堢�规洘锕㈤、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁鏋ゆ繛鍫燂耿閺岋綁鎮㈢粙鍨潚闂佸搫鐭夌紞渚�骞冮埡鍌涚秶闁宠桨绀侀‖澶愭⒒娴ｈ櫣甯涢柟纰卞亞閹广垹鈹戠�ｎ偄浠掑銈嗘穿閹烽攱顨ラ悙鍙夊枠鐎殿喖澧庨幑鍕�﹂幋鐐愮偛鈹戦敍鍕杭闁稿﹥鐗曡灋濞达絿鐡旈弳浼存⒒娴ｅ摜绉洪柡锟介崡鐑嗘富濞寸姴顑呯粻鏍拷鐟板閸嬪﹪鎮￠妷鈺傜厱婵炴垵宕楣冩煛閸♀晛寮柡宀嬬秮婵拷闁宠桨鑳舵禒顓㈡煟閵忊晛鐏℃い銊ョ墢閸掓帞锟斤綆浜堕崥瀣煕閳╁喚娈㈤柛銈冨�濋弻锝嗘償閵忊懇妾ㄥ銈庡幖濞差厼鐣烽姀銈嗙劶鐎广儱妫岄幏娲煟閻斿摜鎳冮悗姘煎墴瀹曟繈濡堕崱鎰盎闂佸搫娲㈤崝灞筋嚕椤旂瓔娈介柣鎰嚋闊剛锟借娲栭悥濂搞�佸Δ浣瑰闁告繂瀚粻銉モ攽閿涘嫬浜奸柛濠冪墪鐓ら柡宥庣仜濞戞ǚ妲堟慨姗嗗墮琚ｉ梻浣芥硶閸犲秶鍒掑▎蹇ｆ綎闁绘垶蓱婵粓鏌熷▓鍨灈濠碘�茬矙濮婃椽宕烽鐔锋畬濠电偛妯婇崢濂割敋閿濆鏁冮柨鏇嫹缂佺姾宕电槐鎾存媴閼测剝鍨甸埢宥夊閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷
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
	    	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑呴—鍐Χ閸愩劎浠鹃梺鑽ゅ暱閺呯娀鐛崘顔肩労闁告劏鏅涢崝鍛渻閵堝棙顥嗗┑顔哄�楃划濠冨鐎涙ǚ鎷婚梺绋挎湰閼归箖鏁撻悾灞藉幋闁硅櫕顨婂畷濂稿即濡ゅ瀚归柨鏇炲�搁柋鍥煟閺囨氨鍔嶆い鏃�妫冨娲川婵犲嫮绱伴梺绋块椤兘鐛箛鎾舵殝闁逛絻娅曢～宥夋⒑閸︻厼鍔嬮柟绋款煼閹潧顫濋鐘电槇缂佺偓婢橀ˇ杈╁閸ф鐓涘ù锝囩摂閸ゆ瑩鏌ｉ敐鍥у幋闁诡喓鍨婚崰濠冩綇閵婏附鐝┑鐘愁問閸犳鈥﹂崼鐔侯洸妞ゆ帪鎷锋い顓炴处瀵板嫰骞囬娑欏濠电偠鎻徊鑲╂媰閿曞倹鍊垮Δ锝呭暞閻撴盯鏌涢顐簻濠⒀勫缁辨帡顢欓悾灞惧櫚濡ょ姷鍋炵敮鎺曠亙婵炶揪缍侀弲鏌ュ箣闁垮绻嗛柣鎰典簻閿熻姤娲滈幑銏ゅ箛閻楀牆浜辨繝鐢靛Т濞层倝鎮￠弴銏＄厵閺夊牓绠栧顕�鏌ｉ幘瀵告噰闁哄被鍊曢湁閻庯綆鍋呴悵鏃�绻涚�电校缂侇喖鐭傞崺鐐哄箣閿曪拷閻忔娊鏌ｉ幇顖涱棄濞寸媭鍣ｅ娲传閸曨剚鎷卞┑鐐跺皺閸犲酣鎮鹃柨瀣檮闁告稑锕ゆ禍婊呯磽娴ｅ壊鍎忛悘蹇撴嚇楠炲繘鎮滈挊澶岀杸濡炪倖鎸嗛崟闈涙櫖闂傚倷鑳剁划顖炲礉閺嶎兙浜归柛鎰靛枛濮规煡鏌曡箛瀣拷鏍偂韫囨稒鐓曢柕澶涚到婵＄厧鈹戦鑲┬ｆい銊ｅ劦閹瑩寮堕幋鐐剁檨婵°倗濮烽崑娑㈩敄婢舵劕绠栭柍鍝勫暞鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡宀嬬秮楠炲洭顢楁担鍙夌亞婵犵數鍋為幐鎼佲�﹂悜钘夎摕闁哄洢鍨归柋鍥ㄧ節闂堟稒绁╂俊顐ゅ仧缁辨挻鎷呯拠鈩冪暥闂佺锕ゅ鈥愁嚕婵犳碍鏅插璺猴功椤斿﹪姊虹紒妯哄闁轰焦鎮傚鎶藉Χ婢跺锟藉灚绻涢崼婵堜虎闁哄鍠庨埞鎴︽倷鐠囇嗗惈濡ょ姷鍋涢崯鎾春閿熺姴绀冩い蹇撴４缁卞弶绻濈喊妯活潑闁搞劌鐖煎銊︽綇閳哄瀚规慨姗嗗墮閹垹绱掔紒妯肩疄闁诡喕绮欏Λ鍐ㄢ槈濡わ拷閹藉姊虹拠鑼婵炲瓨纰嶇粋宥夘敂閸冻鎷锋担绯曟瀻闁归偊鍠氶惁鍫ユ⒑閸涘﹥澶勯柛鐘崇墪閻剟姊婚崒娆掑厡妞ゎ厼鐗忛幑銏犖旈崨顓狅紱闂佸綊鍋婇崰鏍ㄦ叏椤掑嫭鐓ラ柣鏂垮閻瑦鎱ㄦ繝鍐┿仢婵☆偄鍟埥澶婎潩鏉堚晜姣庡┑鐘殿暯閸撴繆銇愰崘顏庢嫹濮橆偄宓嗘鐐诧躬楠炴鎷犻弻銉︽殔婵犲痉鏉匡拷鎾绘嚄閸洖鍌ㄩ梺顒�绉甸埛鎴狅拷瑙勬礀濞诧箓宕甸敓浠嬫⒑鐠囪尙绠茬紒璇茬墦楠炲啫顫滈敓浠嬨�侀弮鍫濋唶闁绘柨鎼獮宥嗕繆閻愵亜锟芥牠鎮уΔ鍐煓闁圭儤顧傛径鎰唶婵犻潧鍟弬锟介梻浣规灱閺呮盯宕鐐茬９闁归偊鍏橀弨浠嬫煥濞戞ê顏柣鎺撳閵囧嫰鏁傞挊澶岀シ闂佸疇顫夐崹鍧椼�佸▎鎾村殐闁宠桨鑳堕崢鑺ョ節濞堝灝鏋涢柨鏇閸掓帡顢涢悙鑼唵闂佸憡绋掑娆忣啅濠靛棌鏀介柣妯诲絻閿熺晫鎳撻埢鎾愁潨閿熻棄顫忕紒妯诲闁告稑锕ら弳鍫ユ⒑閸濆嫯顫﹂柛鏂块叄楠炴垿濮�閻樻牜鍠愮粭鐔碱敍濮橆収鍚欓梻鍌欑濠�杈╁垝椤栨粍鏆滈柍鍝勬噺閸嬪倿鏌曟径鍡樻珕闁绘挻娲橀妵鍕箛闂堟稐绨绘繛瀛樼矋缁诲牓寮婚敓鐘插窛妞ゅ繐鎳忛悵姘舵⒑鐠団�虫灍妞ゃ劌锕幃浼搭敋閿熻棄鐣疯ぐ鎺濇晩闁绘挸瀵掑娑樷攽閿涘嫬浜奸柛濞у懐纾芥慨妯挎硾绾拷闂佽鍎煎Λ鍕及閵夛妇绠鹃柟瀛樼懃閻忊晝绱掗悪鍛М闁哄被鍔戝顕�宕掑☉娆戝涧闂備礁鎲￠敋鐎规洦鍓熼崺鐐哄箣閿旇棄浜圭紓鍌欑劍钃遍梺娆惧幖閳规垿鍩ラ崱妞剧凹濡炪們鍔岄敃顏堝Υ娓氾拷瀵噣宕煎┑鍫濆箰闂備胶顭堥張顒傛箒缂備降鍔岄…宄拔涢崨鎼晝闁靛繆锟芥剚妲辨繝娈垮枛閿曘倕锕㈡潏銊ь洸闁归棿鐒﹂弲婵嬫煕鐏炲墽銆掗柛妯绘倐閺岋綀绠涢弴鐐扮捕婵犫拃鍡橆棄閻撱倝鏌℃径瀣亶闁猴拷娴犲鐓冮柍杞扮閺嗙偤鏌涙繝鍐ㄥ闁宠鍨块崹鎯х暦閸パ呭幗闁诲氦顫夊ú蹇涘礉閹达负锟戒礁顫滈敓浠嬪箖閳哄拋鏁婇梻鍌氼嚟閻ュ懏绻濋悽闈浶㈤柣銉ヮ樀瀵爼宕犻埄鍐伓濠德板�撻悞锕傚矗韫囨稒鐓熼柟杈剧稻椤ュ鐥崜褏甯涚紒缁樼洴楠炲鎮滈崱娆忓П婵犵數鍋為崹鎯板綔闂佸搫顑呴柊锝夊蓟閻旂厧绠氱憸蹇涙晬瀹ュ棎浜滈柡鍌涘椤ャ垺鎱ㄦ繝鍐┿仢鐎规洏鍔嶇换婵嬪礋閵婏富锟藉洦绻濋悽闈涗粶闁告艾顑夐幃鐤槾闁告帗甯″畷濂稿Ψ閵夆晛鏁归梻渚�娼ч¨锟藉┑鈥虫喘瀹曘垽鎮介悽鐢碉紳闂佺鏈悷褔宕濆澶嬬叆婵浜壕鍏间繆閵堝嫯鍏屾い锝堝皺缁辨帞绱掑Ο鍏煎垱閻庤娲忛崝鎴︺�佸锟芥俊鎼佸Ω閵夛箑鍓垫繝鐢靛У椤旀牠宕伴弽顓熸櫇闁挎梹鍎抽崹婵囥亜閺嶎偄浠滅紒鐙�鍨堕弻娑樷槈濞嗘劗绋囬悗鐟版啞缁诲倿鍩為幋锔藉亹闁圭粯甯幏鐑芥偡閹佃櫕鐏佸┑顔筋殣閹烽攱鎱ㄦ繝鍕笡闁瑰嘲鎳橀幐濠冨緞婵犲啫鍔掗梻鍌欑閹芥粍鎱ㄩ弶鎳虫稑鈹戦崱娆愭闂佸搫娲ㄩ崰鎰垔閹绢喗鐓曢柟鑸妽濞呮挻淇婇鐘插闁宠鍨块弫宥夊礋椤愨剝婢�闂備胶顭堥敃銉╂偋閻樿绠栫憸宥堢亙闂佸憡鍔︽禍鐐烘偂閹剧粯鈷戦柛锔诲幖閸斿銇勯妸銉﹀殗闁诡垰鑻灃闁告侗鍨拌ぐ鍕⒑閹肩偛鍔橀柛鏂块叄閸╋附绗熼敓浠嬪蓟閿濆绠婚柛妤冨仜婵箓姊洪崫鍕効缂傚秳绀侀锝夊箻椤旇棄锟界兘鎮归崶鍥у椤忓爼姊洪棃鈺佺槣闁告瑥绻橀獮蹇撶暋闁附鍍甸梺缁樺姦閸撴瑩顢旈敓锟�
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


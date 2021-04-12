package fire.pb.npc;

import java.util.HashMap;
import java.util.Map;

import fire.log.Logger;
import fire.pb.circletask.CircleTaskManager;
import fire.pb.item.ItemBase;
import fire.pb.item.Pack;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;
import fire.pb.mission.MissionColumn;
import fire.pb.mission.PCommitMajorMission;
import fire.pb.pet.PetColumnTypes;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSubmit2Npc__ extends mkio.Protocol { }

/** 客户端请求提交任务物品或者任务宠物
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSubmit2Npc extends __CSubmit2Npc__ {
	static fire.log.Logger logger = Logger.getLogger("MAPMAIN");

	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		if (!SceneNpcManager.checkDistance(npckey, roleid)) {
			if (submittype == SubmitType.GUILD_ZONE_ITEM) {
				fire.pb.talk.STransChatMessageNotify2Client msg = MessageMgr.getMsgNotify(
						160176, 0, null);
				gnet.link.Onlines.getInstance().send(roleid, msg);
			}
			return;
		}
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		int npcid = 0;
		if (npc != null)
			npcid = npc.getNpcID();
		fire.pb.item.Pack submiterBag = new fire.pb.item.Pack(roleid, true);
		for (SubmitUnit unit : things) {
			if (submittype == SubmitType.PET)
				continue;
			if (submittype == SubmitType.MONEY) {
				long money = unit.key;
				if (submiterBag.getMoney() < money)
					logger.error("submit money error.roleid:" + roleid
							+ "unit.key:" + unit.key + "unit.num:" + unit.num
							+ "money:" + money + "npcid:" + npcid);
				continue;
			} else {
				ItemBase bi = submiterBag.getItem(unit.key);
				if (bi == null) {
					logger.error("submit item is empty.roleid:" + roleid
							+ "unit.key:" + unit.key + "unit.num:" + unit.num
							+ "npcid:" + npcid);
					continue;
				}
				if (bi.getNumber() < unit.num) {
					logger.error("submit item num error.roleid:" + roleid
							+ "unit.key" + unit.key + "unit.num:" + unit.num
							+ "realnum:" + bi.getNumber() + "npcid:" + npcid);
					continue;
				}
			}
		}
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻濠氭煙瀹曞洤浠遍柡灞芥椤撳ジ宕卞Δ浣烘殶闂傚倷绀侀悿鍥ь浖閵娾晜鍤勯柛鎾茶兌妞规娊鐓崶銊︹拻缂佲槄鎷烽梻浣圭湽閸ㄨ棄顭囪閻楀酣姊绘担铏瑰笡婵☆偄绻樺畷婊冣槈濮橆収娼熼梺缁樺姇閹碱偊宕橀敓浠嬫偡濠婂嫮鐭掗柟顔哄灲瀹曞崬鈽夊▎蹇庡寲濠德板�ч梽鍕拷绗涘浂鏁傞柣妯肩帛閻撴盯鏌涢弴銊ヤ簻闁跨喕濮ら幃鍌氾耿娴ｇ硶鏀介柣妯款嚋瀹搞儵鏌熼崘鑼鐎规洜鏁婚弫鎾寸鐎ｎ偀鎷婚梺鎼炲劀鐏為敮鏋呴梻浣告惈鐞氼偊宕濆畝鍕厴闁硅揪绠戦獮銏′繆椤栨粌鍔嬫い蹇ョ節濮婃椽鎳￠妶鍛咃綁鏌涢弬璺ㄧ鐎规洘绮岄埞鎴狅拷锝庯拷顓ㄧ畵閺屾盯寮撮妸銉т哗闂佺粯鎸婚惄顖炲蓟濞戞矮娌柛鎾楀懐鍘愰柣搴㈩問閸犳捇宕濋幋婵愭綎婵炲樊浜滄导鐘绘煕閺囥劌澧柟宄板船閳规垿鎮欑捄铏规闂佸摜濮撮柊锝夊箖妤ｅ啯鍊婚柤鎭掑劚娴滄鏌熼悡搴ｆ憼閽冮亶鏌￠崒锔藉闂傚倸鍊烽悞锕傚箖閸洖纾挎繝濠傛噸濞岊亪鏌熼柨瀣电劷闁哥姵鐗曢～蹇旂節濮橆剛锛滃┑鐐叉閸旓箑螣閸屾粎纾藉〒姘炬嫹缁绢厽鎮傚畷鏉款潩鏉堫煈娼熼梺缁樺姇閻°劍鍒婇幘顔界厱闁挎棁顕у鐐箾閸欏鍊愭慨濠冩そ瀹曟粓骞撻幒宥囧嚬婵犵數鍋涘鍫曟偋濠婂懎鍨濆┑鐘宠壘閸愶拷闂侀潧顭堥崐妤冪不濮樿埖鈷戦梻鍫熺〒婢ф洟鏌熼崘鑼鐎规洖鐤囬妵鎰板箳閹捐泛骞嶇紓浣鸿檸閸樺ジ骞婃惔銊﹀亗闁规壆澧楅悡蹇涙煕閵夋垵鍠氭导鍐ㄎ旈悩闈涗沪妞ゎ厼娲獮鎴﹀礋椤栨稑浠忛柣搴㈢♁閿氭い蹇氭硾椤啴濡堕崱妤�衼缂備胶濮甸崹鐢稿极椤曪拷濮婄粯绗熼敓钘夘焽瑜旇棟濞寸姴顑呯粣妤佹叏濡寧纭鹃柤绋跨秺閺岋綁濮�閻樺啿鏆堥梺绋款儌閸撴繄鎹㈠┑鍥╃瘈闁稿本纰嶅▓鍫曟倵濞戞瑧绠撴い顏勫暣婵¤埖鎯旈垾宕囶啇婵犵數鍋涘Ο濠囧矗閸愵煈鍤曟い鎰剁畱缁犺崵绱撴担濮戭亝绂嶈ぐ鎺撯拺闁兼祴鏂侀幏锟犳煕閹惧娲寸�殿喛娅曠�佃偐锟芥稒菤閹风粯绻涙潏鍓у埌闁硅绻濆畷顖炴倷閻戞鍘遍梺鍝勫暞閹搁箖鎮鹃悽纰夋嫹鐟欏嫭纾婚柛妤�鍟块锝嗙鐎ｅ灚鏅濋梺闈涚墕濞层劑宕濋崼鏇熲拺閻犲洦褰冮崵杈╃磽瀹ュ懏顥㈢�规洘鍨堕幏鍛村捶椤撗勯敜婵犵數濮撮敃銈夋偋婵犲洦鍋傛繛鍡樻尰閻撴瑥霉閿濆懎鏆為柣婵愪簼缁绘盯宕ㄩ鐔锋畻闂佸搫鐭夌紞锟界紒鐘崇洴閺佹劙宕ㄩ鍙ラ偗闂傚倸鍊稿ú銈壦囬悽绋胯摕闁挎繂顦粻濠氭煣韫囷絽浜濈�规洝娅曠换婵嬪煕閿熻棄顓兼径瀣碉拷宥夋⒑闁稓鈹掗柛鏂跨Ф閹广垹鈹戠�ｎ亞顦ㄩ梺宕囨嚀閵囨﹢鎼规惔銊︾厽閹兼番鍊ゅ鎰箾鐠囇呯暤鐎规洘鍨剁换婵嬪磼濠婂嫭顔曢梻浣虹帛濮婂鍩涢崼銉ユ瀬闁告劦鍠楅悡銉︾箾閹寸伝顏堫敂椤忓牊鐓涢柛娑卞幑閸嬨垺鎱ㄦ繝鍌ょ吋鐎规洘甯掗埢搴ㄥ箣椤撶啘婊堟⒒娴ｄ警鏀版い鏇熺矌閹广垹鈹戠�ｎ亞鐣洪梺缁樺灱濡嫬鏁柣鐔哥矊妤犳悂鎮鹃悜钘夎摕闁靛濡囬崢鐢告⒑缂佹ê鐏﹂柨姘箾閸儳鐣洪柡灞诲妼閳规垿宕遍埡鍌傦妇绱撴担鍝勑ｇ紒瀣浮婵＄敻宕熼姘鳖吅闂佹寧绻傞幉娑㈠箻缂佹鍘搁梺绋跨焿闂勫嫮锟芥艾缍婂濠氬磼濮橆剨鎷烽悜鑺ュ�块柨鏇炲�哥粻鏍煕椤愶絾绀�缁剧偓瀵ч妵鍕即椤忓懎顏堕柣搴㈩問閸ｎ噣宕滃杈╃當闁绘柨鍚嬮弲鎼佹煢濡警妯堥柛銈嗘礋閺岀喖姊荤�靛壊妲梺鍛婂姧閹烽攱淇婇悙顏勶拷鏍箰妤ｅ啫绐楅幖娣妽閺呮悂鏌﹀Ο渚Ш濞寸姵绋掗妵鍕Ω閿濆懎濮﹂梺璇″枟閻熲晠骞婇悩娲绘晞闁兼剚鍨遍妤呮⒒閸屾瑧顦﹂柟娴嬶拷鎰佹綎闁荤喐澹嗛弳鍡涙煙闂傚顦﹂柦鍐枛閺屻劌鈹戦崱妯烘櫟闂佸搫鍟悧濠囧疾閹间焦鐓㈡俊顖滃皑缁辨碍绻涢幋鐐冩岸寮ㄦ禒瀣厱闁斥晛鍟伴幊鍕箾閸儳鐣烘慨濠冩そ濡啫鈽夊杈╂澖闂備胶顭堥敃銉ッ哄鍛灊闁煎鍊楃壕鍏间繆椤栫偞娅滅紒銊ヮ煼濮婃椽宕崟顐ｆ闂佺锕﹂幊鎾诲煝瀹ュ鍗抽柕蹇ョ磿閸樺崬鈹戦埥鍡楃仯缂侇噮鍨跺畷鎰板箛椤撶喎寮挎繝鐢靛Т閸燁垶濡靛┑鍫嫹鐟欏嫭纾搁柛鏂跨Ф閹广垹鈹戠�ｎ亞顦ㄥ銈呯箰缁夊灚鏅ュ┑鐘垫暩婵兘寮幖浣哥；婵鎷风�规洜濞�閹晝鎷犻懠顒�锟界偤姊洪棃娑辩劸闁稿骸顭烽獮蹇涙倻閽樺鍞堕梺鍝勬川閸犳捇宕㈤挊澶嗘斀闁宠棄妫楅悘锝夋煃瀹勬壆澧︾�殿喖鍟块…銊╁醇閻斿搫骞嶉柣搴ｆ嚀鐎氼厼顭垮Ο浣曪絾绻濆顓犲帗缂傚倷鐒﹁摫鐎规洖鐬奸敓鍊燁潐濞叉牜绱炴繝鍥ワ拷浣糕枎閹炬潙浠奸柣蹇曞仜閿熺晫鍠愮�氼剟姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦鍞跺┑掳鍊х徊浠嬪疮椤愩倗鐜绘俊銈呮噺閻撴稓锟藉箍鍎辨鎼佺嵁濡ゅ懏鐓曢悗锝庡�栭幋锕�桅闁告洦鍨扮猾宥夋煥閻斿墎鐭欐鐐茬箰閳规垹锟斤綆浜為鍡涙⒑缂佹ê鐏卞┑顔哄�濆鏌ュ蓟閵夈儳顔愰梺鍦拡閸樺ジ鎮橀敓鐘冲�垫慨妯诲墯濞兼劙鏌曢崶褍顏鐐搭焽閹瑰嫰鎯勯幒瀣伈闁哄矉绱曢敓鏂ょ秵閸嬪棗煤閹绢喗鐓涚�癸拷閿熶粙宕伴弽顓滐拷浣糕枎閹炬潙浠奸悗鐧告嫹闁跨喍绮欓幃锟犳晸娴犲鈷戦柛娆嶅劤娑撹尙绱掗煫顓犵煓濠碘剝鎸抽獮鎺楀箣椤撶喎鍏婇梻浣虹帛閹哥霉闁垮顩风憸蹇曟閹惧瓨濯村ù鐘差儏閹界敻姊虹紒姗嗘畼濠殿喗鎸抽敐鐐剁疀閺囩姷锛滃┑鈽嗗灥椤曆囶敁閹惧墎纾藉ù锝呮贡閳藉銇勯幋婵囧櫣闁崇粯鎹囬、姗�鎮╅悽纰夌闯濠电偠鎻紞锟芥繛鍜冪悼閺侇喖鈽夐姀鈥充缓濡炪倖鐗楅〃鎰板箯瀹勬壆鏆﹂柛銉ｅ妽椤旀洟姊绘担渚敯闁规椿浜浠嬪礋椤栨氨锛欓梺缁樺灱婵倝宕戦垾瓒佸綊鏁愭径妯活棖濡炪倧璁ｇ粻鎾诲蓟閻斿搫鏋堥柛妤冨仒閸犲﹪姊洪悙钘夊姷缂佺姵鎸绘穱濠囧箹娴ｅ摜鍘告繛鎾寸啲閹风兘鏌涢悙鑸电【闁宠鍨块幃鈺咁敊閼测晛濮跺┑鐐茬摠缁酣宕楀Ο渚綎濞寸姴顑呯粈瀣亜閺嶃劍鐨戦柣銈呭濮婃椽妫冨☉杈╁姼闂佺瀛╅悷鈺呭箖閵忋倖鍋傞幖杈剧磿閿熺瓔鍘奸—鍐Χ閸℃ǚ鎷归梺绋块绾绢參寮锟藉畷绋课旀担鍙夊濠电偠鎻徊鑲╂媰閿曞倹鍊块柟顖ｇ仜閺冨牊鍋愰柛娆忣槹閸犳劗绱撴笟鍥ф灍婵☆偂绶氭俊鐢稿箛閺夎法顔婇梺纭呮彧缁查箖骞夐悧鍫㈢瘈闁汇垽娼ф禒锕傛煕椤垵鐏︾�规洜顢婇妵鎰板箳閹寸媭鏀ㄩ梻浣筋潐閸庡吋鎱ㄩ妶澶嬪亗闊洦鎸撮弨浠嬫煟閹邦垰鐨哄ù鐘灲閺屾盯寮敓浠嬫偡瑜忓Σ鎰板箳濡わ拷鎯熼梺闈涚墕濞层劑鎮￠幘鏂ユ斀妞ゆ梻銆嬮弨缁樹繆閻愯埖顥夐柣锝囧厴椤㈡洟鏁冮敓鐣岀矆鐎ｎ喗鈷掗柛顐ゅ枔閳藉顭块悷鎵ⅵ婵﹦绮幏鍛村川婵犲啫鏋戦梻浣告憸婵敻宕濆▎鎾跺祦闁圭増婢樼粈鍐拷鐟板閸犳牕鈻撻妸锔剧瘈闁汇垽娼ф牎缂佺偓婢樼粔鐟邦嚕閺屻儱绠甸柟鐑樼箘閸炵敻鏌ｉ悩鐑樸�冮悹锟介敃鍌氱？闁归偊鍘剧粻楣冩煕濞戝崬浜滈柣蹇撳级閹便劍绻濋崨顕呬哗闂佸湱鎳撶�氱増淇婇幖浣肝ㄩ柨鏃�鍎崇紞鎺楁⒒閸屾瑨鍏岄柟铏崌瀹曠敻寮介鐐殿唵闂佽法鍣﹂幏锟�?
		java.util.List<xbean.PetInfo> pis = null;
		if (submittype == SubmitType.PET) {
			pis = new java.util.ArrayList<xbean.PetInfo>();
			final fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(
					roleid, PetColumnTypes.PET, true);
			for (SubmitUnit unit : things) {
				fire.pb.pet.Pet pet = petcol.getPet(unit.key);
				if (pet == null || pet.isLocked() != -1)
					return;
				if (petcol.petIsFightPet(unit.key)
						|| petcol.petIsShowPet(unit.key)) {
					MessageMgr.sendMsgNotify(roleid, 144418, null);
					return;
				}
				pis.add(pet.getPetInfo().copy());
			}
		}
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻濠氭煙瀹曞洤浠遍柡灞芥椤撳ジ宕卞Δ浣烘殶闂傚倷绀侀悿鍥ь浖閵娾晜鍤勯柛鎾茶兌妞规娊鐓崶銊︹拻缂佲槄鎷烽梻浣圭湽閸ㄨ棄顭囪閻楀酣姊绘担铏瑰笡婵☆偄绻樺畷婊冣槈濮橆収娼熼梺缁樺姇閹碱偊宕橀敓浠嬫偡濠婂嫮鐭掗柟顔哄灲瀹曞崬鈽夊▎蹇庡寲濠德板�ч梽鍕拷绗涘浂鏁傞柣妯肩帛閻撴盯鏌涢弴銊ヤ簻闁跨喕濮ら幃鍌氾耿娴ｇ硶鏀介柣妯款嚋瀹搞儵鏌熼崘鑼鐎规洜鏁婚弫鎾寸鐎ｎ偀鎷婚梺鎼炲劀鐏為敮鏋呴梻浣告惈鐞氼偊宕濆畝鍕厴闁硅揪绠戦獮銏′繆椤栨粌鍔嬫い蹇ョ節濮婃椽鎳￠妶鍛咃綁鏌涢弬璺ㄧ鐎规洘绮岄埞鎴狅拷锝庯拷顓ㄧ畵閺屾盯寮撮妸銉т哗闂佺粯鎸婚惄顖炲蓟濞戞矮娌柛鎾楀懐鍘愰柣搴㈩問閸犳捇宕濋幋婵愭綎婵炲樊浜滄导鐘绘煕閺囥劌澧柟宄板船閳规垿鎮欑捄铏规闂佸摜濮撮柊锝夊箖妤ｅ啯鍊婚柤鎭掑劚娴滄鏌熼悡搴ｆ憼閽冮亶鏌￠崒锔藉闂傚倸鍊烽悞锕傚箖閸洖纾挎い鏍仜缁�澶岋拷骞垮劚椤︻垳澹曡ぐ鎺撶厽闁硅揪绲借闂佹娊鏀辩敮鎺楁箒闂佹寧绻傚ú锕傚吹閿熶粙姊哄畷鍥╁笡婵炶尙鍠栧濠氭晸閻樿櫕娅㈡繛瀵稿Т椤戝棝鎮為懖鈺嬫嫹楠炲灝鍔氭俊顐ｎ殕缁傚秹鏌嗗鍡忔嫼缂傚倷鐒﹂敃鈺呮倿閻愵兙浜滈柡鍥ф濞诧妇锟芥艾鎳橀弻锝夊棘閹稿孩鍠愮紓浣哄█缁犳牠寮婚悢鐚存嫹閻㈡鐒鹃柨鐔诲Г閸ㄧ敻锝炲┑鍫熷磯闁惧繒鎳撻幗瀣攽閻愬樊鍤熷┑顔芥尦椤㈡牠宕卞☉娆忎簵闂佸搫娲ㄩ崰鎾剁不妤ｅ啯鐓欓悗鐢殿焾娴犙囨煙閸愭彃顏紒杈ㄥ浮閹虫粓鎮介棃娑樼哗闂備礁鎼張顒傜矙閹达絿浜介梻浣告啞閸垶宕愰弽顐嫹濮橆剛绉洪柡宀嬬節瀹曟帒螣閸濆嫬顫氶梻浣告惈閸嬪﹪骞忛悜鑺モ拻闁稿本鐟ㄩ崗宀�绱掗鍛仸鐎规洘绻傝灒闂傚倸顕崜銊モ攽閻愬弶顥為柛鏃�鐗曢埢宥夋偐瀹曞洨顔曢梺鐟扮摠閻熴儵鎮橀鍫熺厽闁规儳鐡ㄧ粈瀣煛鐏炵偓绀冪紒缁樼洴瀹曞綊顢欓悡骞垵鈹戦悙宸殶濠殿喕鍗冲畷瑙勭鐎ｎ亣鎽曢梺鎸庣箓椤︿即寮查弻銉︾厱婵炴垵宕獮妤佺濞戞瑤绻嗛柣鎰典簻閿熷鍊濆畷鎴﹀川椤栨稑搴婇梺鍛婃处閸ㄦ壆绮婚弻銉︾厱闁哄洢鍔屾晶顖氣攽椤栨稒灏﹂柡宀嬬節瀹曟儼顦虫い銉︾矋缁绘稓鎷犺閻ｇ敻鏌熼鍡欑瘈鐎殿喗鎸虫慨锟介柨娑樺鐢姊绘担鍝ユ瀮婵℃ぜ鍔庣划鍫熺瑹閿熻棄顕ｉ幖浣肝у璺侯儑閸樹粙姊洪悷鐗堟儓缂佸鐖奸幆灞解枎閹惧鍘搁柣蹇曞仜婢ц棄煤鐎甸潻鎷峰▓鍨珮闁革綇绲介悾鐑藉箳閹搭厽鍍靛銈嗗釜閹烽绱掗悪鍛ɑ缂佺粯绻傞埢鎾诲垂椤旂晫浜梻浣瑰濞插繘宕曢柆宥侊拷鏃堝礃閳哄喚娴勯柣搴秵閸撴瑧绮婇敃鍌涒拺鐟滅増甯掓禍浼存煕濡湱鐭欑�规洘娲熼幃銏ゅ礂閼测晛寮虫繝鐢靛█濞佳兾涘Δ鍛櫢闁芥ê顦辩粔娲煥濠靛牆浠滄い鎾炽偢瀹曘劑顢旈崨顔芥緫闂傚倷鑳剁划顖炩�﹂崶鈺佸灊妞ゆ牗鍩冨Σ鍫㈡喐閺冨牆钃熸繛鎴炵懅缁★拷闂佸憡娲﹂崜娆忊枔鐏炵瓔娓婚柕鍫濋娴滄粎绱掔紒姗堣�挎鐐诧躬閺佹捇鎮╅崣鍌冨洦鐓曟繛鎴濆船楠炴ê霉濠婂懎顣煎ǎ鍥э躬閹瑩顢旈崟鑸靛闁哄稁鍘肩粻鏉课旈敐鍛殭缂佹劖顨婇獮鏍ㄦ綇閸撗吷戝銈嗗姃缁瑩寮婚敐澶婄疀妞ゆ梻鍘ф俊娲⒑缂佹ɑ灏伴柣鐔叉櫅椤繐煤椤忓秵鏅ｉ梺闈浤涢崨顔筋啅濠德板�楁慨鐑藉磻閻愮儤鍋嬫俊銈呭暞瀹曞弶绻涢幋娆忕仼闂佸崬娲弻锝夊籍閸偅顥栨繛瀵稿帶閼活垶鍩為幋锔绘晩缁绢參鏀遍弫鎯р攽閿涘嫬浠╂俊顐㈠閹儳鐣￠幏鏃�妫冨畷銊╊敊鐟欏嫬顏虹紓鍌欒兌閸嬫捇宕曢幎绛嬫晞闁告稑鐡ㄩ崐鍨攽閻樺磭顣查柍閿嬪笒闇夐柨婵嗗椤掔喖鏌ｉ幒鏂夸壕闁逛究鍔岄～婊堝醇濠垫劖鍠樺┑鐐茬摠缁酣鈥﹂崼銉ョ厺閹兼番鍔岀粻锝嗙節闂堟稒顥犲ù婊勬緲閳规垿鎮╅崹顐ｆ瘎婵犳鍠氶弫濠氬箠濠靛绀堢憸蹇旂▔瀹ュ鐓ｉ煫鍥风到娴滄绱掔拠鍙夘棦闁哄本娲熷畷鐓庘攽閸♀晙绱撴俊鐐�栭弻銊┧囬悽绋胯摕闁绘柨鍚嬮悡銉╂倵閿濆骸浜栧ù鐘灩閳规垿顢欑涵鐑界反濠电偛鎷戠紞渚�鐛幋锕�绀嬫い鏍嚤閳哄懏鐓忓鑸电☉椤╊剛鎲搁悧鍫濆摵婵﹦绮幏鍛存倻濡儤鐣梻浣规偠閸婃牠鎮ч悩鑽ゅ祦闊洦绋掗弲鎼佹煥閻曞倹瀚�?
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitUnit unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}

		if (submittype == SubmitType.INSTANCE_ZONE_ITEM) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屻倗鍠婇崡鐐测拻闂佸摜鍠庡ú顓烆潖缂佹ɑ濯寸紒瀣濮ｆ劙姊洪崷顓涙嫛闁稿锕悰顔界節閸愨晛鍔呴梺闈涱焾閸庨亶鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節瀵挳鎮㈤崜浣虹暰闂備線娼ч悧鍡涘箠鎼淬劌姹叉繛鍡樻尰閻撴洟鏌熼悙顒佺稇闁崇粯娲熼弻锛勪沪鐠囪鎷峰┑鍡╁殨闁告挷鐒﹀畷澶愭煏婵炲灝锟芥稑顬婇幖浣光拻闁稿本纰嶉幖鎰亜閿旂偓鏆�殿喖顭烽弫鎰緞婵犲嫷鍟嬮梻浣瑰劤濞存岸宕戦崨顓犳殾闁规儼濮ら埛鎴︽煕閿旇骞楁繛鍛礀閳规垿鎮滈崶銊ヮ伓闂傚倷绀侀幖顐﹀嫉椤掑倻鐭欓柟鍓х帛閺呮悂鏌￠崒妯猴拷妤冪矓閻㈠憡鐓曢悗锝庝簼椤ョ姷绱掗纰辩吋闁诡喗鐟╅幃婊兾熼悡搴＄闂備浇顕х换鎺楀磻閻旂厧鐤炬い鎰剁稻濞呭繘姊虹拠鍙夊攭妞ゎ偄顦叅闁挎洖鍊哥壕璇测攽閻樻彃锟藉寮抽敃鍌涚厽闁哄啫鍊甸幏锟犳煛娴ｇ鏆為柕鍥у楠炴帒顓奸崶鑸敌滄俊鐐�曠换妤呭春閺嶎偅宕叉繝闈涱儐閸嬨劑姊婚崼鐔峰瀬闁挎繂顦伴悡鐘绘偡濞嗗繐顏╃紒锟介崘顏嗙＜缂備焦顭堟竟姗�鏌嶇憴鍕伌闁诡喒鏅犲畷褰掝敃閿濆棛妲戞繝鐢靛У椤旀牠宕板Δ锟介…鍥р枎閹存繂鐤鹃梻鍌欑劍鐎笛兠洪弽顓炵９闁告縿鍎遍ˉ姘攽閻樺磭顣查柣鎾崇箰閳规垿鎮╅懠顒傤啈缂備緤鎷烽悗锝庯拷銏㈡嚀椤劑宕熼鐘靛帨闂備礁鎼径鍥晸閼恒儱澧柛姘儔閺屾盯骞囬埡浣割瀳濡炪値鍓欓澶婎潖濞差亝顥堟繛鎴炵懐濡繝鏌ｉ姀鈺佺伈缂佺粯绻傞锝嗙節濮橆厼浜滈梺绋跨箳閸樠囨儌閸曨剛绡�闁靛骏绲剧涵楣冩煥閺囨ê鍔氶柍缁樻崌瀵濡烽敂瑙勫闂傚倸鍊搁悧濠勭矙閹烘绠归柟鎵閸婂灚鎱ㄥ鍡椾簻鐎规挸妫濋弻鏇㈠幢閺囩姷鐛㈤悗娈垮枟閹歌櫕鎱ㄩ敓浠嬫煟濞嗘瑦瀚瑰┑鐐靛帶閿曨亜顫忓ú顏勭闁告瑥顦伴崕鎾绘⒑缁嬪尅鍔熼柡浣筋嚙椤曪綁骞栨担绋跨獩濡炪倖妫佸畷鐢电不濮樿埖鈷戦梻鍫熺〒婢ф洘绻涚仦鍌氾拷鏇㈠汲閳哄懏鈷掑ù锝勮閻掔偓銇勯幋婵囧枠鐎规洘鍨挎俊鑸靛緞鐏炵晫銈﹂梻浣侯攰閹活亞绮婚幋锔藉�峰┑鐘插暔娴滄粓鏌熼悜妯虹仴闁跨喕妫勯幗婊呭垝婵犲洦鏅濋柛灞剧▓閹锋椽姊虹涵鍛汗闁稿鐩畷婵嬪箻椤旂晫鍘遍梺鐟扮仢鐎氼噣鎮鹃悽纰夋嫹濞堝灝娅橀柛瀣工閻ｇ兘骞掑Δ浣革拷鐑芥倵閻㈡鐒炬鐐茬墛缁绘繈鎮介棃娑楁勃闂佹悶鍔戝褔鎮鹃悜绛嬫晢闁告洦鍘肩粊锕�鈹戞幊閸婃洟骞婅箛娑欏亗婵炴垶菧閿熻姤甯掗～婵嬵敆娴ｈ櫣鍘梻鍌欑贰閸欏酣宕归柆宥呯疄闁靛濡囩弧锟介梺鍛婃处閸樿偐绮敓鐘斥拺闁荤喐婢樺Σ濠氭煙閾忣偓鑰挎鐐寸墳閵囨劙骞掗幘鍏呯敾闂備浇顫夐鏍闯椤曪拷瀹曟垼顦规慨濠傤煼瀹曟帒鈻庨幋鐘靛床婵犵數鍋橀崠鐘诲礂閻樿櫕銇濋柡浣稿暣瀹曟帒鈽夊Ο鍝勵棆濠碉紕鍋戦崐鏍偋濡ゅ懎绀勭憸鐗堝笒閸氬綊鏌￠崶銉ョ仾闁绘挻鐟х槐鎾存媴婵埈浜畷鍛婄節閸愌呯畾闂佸湱绮敮鐐存櫠閿曞倹鐓涢悘鐐靛亾缁�澶岀磼閻樺磭娲寸�殿喗鎸抽幃娆撳箛閳轰礁濮曢梺闈涙搐鐎氭澘顕ｉ锟介弫鎾寸鐎ｎ亞顦┑鐐叉濞存艾顭囬弽顓熺叄闊洦鍑瑰鎰拷瑙勬礀椤︾敻寮婚弴鐔虹闁割煈鍠栨慨鏇㈡⒑缂佹缂氶柛銊ㄦ椤繐煤椤忓懎浠梺鍝勵槹鐎笛囶敊閿熶粙姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}
		if (submittype == SubmitType.GUILD_ZONE_ITEM) {
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}

		// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛锛卞喚娓婚柕鍫濇缁岃法绱掗煫顓犵煓闁诡噣绠栭弫鎾绘偐瀹曞洤濮洪梻浣瑰濡礁螞閸曨垱鍎婃繝濠傜墛閳锋帒銆掑鐐濠电偘鍖犻崶銊ヤ罕闂佺硶鍓濋妵鍌氣槈濡攱顫嶅┑鐐叉閸旀牠鎮靛畡閭︽富闁靛牆妫楃粭鎺楁倵濮樼厧寮柟顕嗙節閹晠宕归銏＄�鹃梻浣虹帛椤ㄥ懘鎮ч崱娆戠當鐟滄棃寮婚敐澶嬫櫜闁糕剝菧娴犮垽姊洪崫鍕拱闁烩晩鍨跺畷娲晸閻樿尙锛滃┑鐘诧工鐎氼剟宕归柆宥嗙厽閹兼番鍩勯崯蹇涙煕閿濆骸娅嶇�规洘濞婇弫鎰板川椤栨稒顔曞┑鐘绘涧閸婃悂骞夐敓鐘茬；闁告洦鍨遍悡鏇熺節闂堟稒顥滄い蹇婃櫇缁辨帡鎮╅鐓庡闂佸疇顫夐崹鍧楀极瀹ュ绀嬫い鎰ㄥ墲濠拷闂傚倷鑳堕…鍫ユ晝閵夆晜鍋嬮柣妯款嚙缁犳牜鎲稿鍫簷闂備礁鎲￠崝鎴﹀礉瀹ュ鍊甸柟鎯板Г閸婂灚顨ラ悙鑼虎闁告梹纰嶉妵鍕晜鐠囪尙浠稿┑顔硷工椤兘銆佸☉銏″�烽悗鐢殿焾楠炲秹姊婚崒姘拷鎼佸磹閹间緡鏁嬫い鎾卞灩缁�澶岋拷骞垮劚椤︿即鎮￠悢鍏肩厵闁诡垎灞芥闂佺懓鍟跨�氼參濡甸崟顖毼╅柨婵嗘噹婵箓姊虹拠鈥虫灍闁荤啿鏅犻獮濠囨偐濞茬粯鏅為梺鍏煎墯閸ㄩ亶顢撳Δ鍛拻闁稿本鐟︾粊鐗堛亜閺囧棗鎳忓畷鍙変繆閵堝懎鏆曢柣鎺戯攻缁绘盯宕卞Ο璇查瀺闂佸搫鎳忛幃鍌炲蓟濞戞瑧绡�闁告洦鍋呴悵鈥斥攽閻愭彃鎮戦柛鏃�鐗滈幑銏犫槈濡繐婀遍敓鏂ょ秵閸嬪懘鎮靛顑╂棃鎮╅棃娑楃捕缂備胶绮敃銏狀嚕椤愶箑绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?
		if (fire.pb.mission.UtilHelper.isMajorScenarioMission(questid)
				|| fire.pb.mission.UtilHelper.isBranchScenarioMission(questid)) {
			// if ( things.size() != 1 )
			// return;

			if (submittype == SubmitType.ITEM) {
				final Map<Integer, Integer> items = new HashMap<Integer, Integer>();
				for (fire.pb.npc.SubmitUnit su : things) {
					Integer num = items.get(su.key);
					if (num == null) {
						items.put(su.key, su.num);
					} else {
						items.put(su.key, su.num + num);
					}
				}
				// fire.pb.team.Team team =
				// fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				// if (team == null || team.isAbsentMember(roleid))
				// new fire.pb.mission.PCommitMajorMission(roleid, questid, new
				// fire.pb.mission.ItemCommitParam(npckey, items),
				// true).submit();
				// else if (team.isTeamLeader(roleid)) {
				// for (long memid : team.getNormalMemberIds()) {
				// if (memid == roleid) {
				// new fire.pb.mission.PCommitMajorMission(memid, questid, new
				// fire.pb.mission.ItemCommitParam(npckey, items),
				// true).submit();
				// } else {
				// new fire.pb.mission.PCommitMajorMission(memid, questid, new
				// fire.pb.mission.AutoCommitItemParam(npckey),
				// false).submit();
				// }
				// }
				// }

				// new fire.pb.mission.PTaskProcedure() {
				// @Override
				// protected boolean taskProcess() {
				// return new fire.pb.mission.TaskScenarioColumn( roleid, this
				// ).commitMission(
				// questid, npckey, new fire.pb.mission.ItemCommitParam(
				// npckey, items ) );
				// }
				// }.submit();
			} else if (submittype == SubmitType.PET) {
				if (things.size() != 1)
					return;
				final fire.pb.npc.SubmitUnit su = things.get(0);
				final int petkey = su.key;
				fire.pb.team.Team team = fire.pb.team.TeamManager
						.selectTeamByRoleId(roleid);
				if (team == null || team.isAbsentMember(roleid))
					mkdb.Procedure.execute(new PCommitMajorMission(roleid,
							questid, new fire.pb.mission.util.PetCommitParam(
									npckey, petkey), true),
							new DoneWhileSubmitPet<PCommitMajorMission>(roleid,
									questid, pis));
				else if (team.isTeamLeader(roleid)) {
					int teamshare = new MissionColumn(roleid, true).getMission(
							questid).getConf().exeIndo.share;
					if (teamshare == 0) {
						// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉箖閵忋倖鎯為柛锔诲弿缁辨煡姊绘笟锟藉褏鎹㈤幒鎾村弿闁汇垹鎲￠崐鍫曟煕椤愮姴鍔滈柍閿嬪灦缁绘盯鎳犳０婵嗘濡ょ姷鍋為〃鍡涘Φ閸曨垰惟闁靛鍨甸崥顐︽倵濞堝灝鏋︽い鏇嗗浂鏁囬柛蹇曞帶缁剁偛鈹戦悩鎻掝仼妤犵偞鍔曢埞鎴︽倷閼搁潧娑х紓浣藉紦缁瑩鐛径鎰伋闁哄倶鍎查悘渚�鏌ｉ悩鐑樸�冮悹锟介敃锟介妴鎺撶節濮橆厾鍘梺鍓插亝缁诲倿鏁撻悾灞惧殌闁宠绉瑰顕�宕奸悢鍝勫箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐?
						mkdb.Procedure.execute(new PCommitMajorMission(roleid,
								questid, new fire.pb.mission.util.PetCommitParam(
										npckey, petkey), true),
								new DoneWhileSubmitPet<PCommitMajorMission>(
										roleid, questid, pis));
					} else {
						for (long memid : team.getNormalMemberIds()) {
							if (memid == roleid) {
								mkdb.Procedure
										.execute(
												new PCommitMajorMission(
														memid,
														questid,
														new fire.pb.mission.util.PetCommitParam(
																npckey, petkey),
														true),
												new DoneWhileSubmitPet<PCommitMajorMission>(
														memid, questid, pis));
							} else {
								mkdb.Procedure
										.execute(
												new PCommitMajorMission(
														memid,
														questid,
														new fire.pb.mission.util.PetCommitParam(
																npckey, petkey),
														false),
												new DoneWhileSubmitPet<PCommitMajorMission>(
														memid, questid, pis));
							}
						}
					}
				}
				// new fire.pb.mission.PTaskProcedure() {
				// @Override
				// protected boolean taskProcess() {
				// return new fire.pb.mission.TaskScenarioColumn( roleid, this
				// ).commitMission(
				// questid, npckey, new fire.pb.mission.PetCommitParam(petkey)
				// );
				// }
				// }.submit();
			} else if (submittype == SubmitType.MONEY) {
				if (things.size() != 1)
					return;
				final fire.pb.npc.SubmitUnit su = things.get(0);
				final long money = su.key;
				fire.pb.team.Team team = fire.pb.team.TeamManager
						.selectTeamByRoleId(roleid);
				if (team == null || team.isAbsentMember(roleid))
					new fire.pb.mission.PCommitMajorMission(
							roleid,
							questid,
							new fire.pb.mission.util.MoneyCommitParam(npckey, money),
							true).submit();
				else if (team.isTeamLeader(roleid)) {
					for (long memid : team.getNormalMemberIds()) {
						if (memid == roleid) {
							new fire.pb.mission.PCommitMajorMission(memid,
									questid,
									new fire.pb.mission.util.MoneyCommitParam(
											npckey, money), true).submit();
						} else {
							new fire.pb.mission.PCommitMajorMission(memid,
									questid,
									new fire.pb.mission.util.MoneyCommitParam(
											npckey, money), false).submit();
						}
					}
				}
			}
			return;
		}
		if (CircleTaskManager.getInstance().getCircTaskTypes()
				.contains(new Integer(questid))) {
			fire.pb.circletask.PSubmitItemPetQuest proc = new fire.pb.circletask.PSubmitItemPetQuest(
					roleid, questid, npckey, things);
			mkdb.Procedure
					.execute(
							proc,
							new DoneWhileSubmitPet<fire.pb.circletask.PSubmitItemPetQuest>(
									roleid, questid, pis));
			return;
		}
	}


	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795456;

	public int getType() {
		return 795456;
	}

	public int questid; // 提交物品相关的任务或者其他相关id
	public long npckey; // npckey
	public int submittype; // 提交的类型
	public java.util.ArrayList<fire.pb.npc.SubmitUnit> things; // 提交的道具key 或者宠物的key

	public CSubmit2Npc() {
		things = new java.util.ArrayList<fire.pb.npc.SubmitUnit>();
	}

	public CSubmit2Npc(int _questid_, long _npckey_, int _submittype_, java.util.ArrayList<fire.pb.npc.SubmitUnit> _things_) {
		this.questid = _questid_;
		this.npckey = _npckey_;
		this.submittype = _submittype_;
		this.things = _things_;
	}

	public final boolean _validator_() {
		if (questid < 0) return false;
		if (npckey < 0) return false;
		if (submittype < 0) return false;
		for (fire.pb.npc.SubmitUnit _v_ : things)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		_os_.marshal(npckey);
		_os_.marshal(submittype);
		_os_.compact_uint32(things.size());
		for (fire.pb.npc.SubmitUnit _v_ : things) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		submittype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.npc.SubmitUnit _v_ = new fire.pb.npc.SubmitUnit();
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
		if (_o1_ instanceof CSubmit2Npc) {
			CSubmit2Npc _o_ = (CSubmit2Npc)_o1_;
			if (questid != _o_.questid) return false;
			if (npckey != _o_.npckey) return false;
			if (submittype != _o_.submittype) return false;
			if (!things.equals(_o_.things)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		_h_ += (int)npckey;
		_h_ += submittype;
		_h_ += things.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(submittype).append(",");
		_sb_.append(things).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

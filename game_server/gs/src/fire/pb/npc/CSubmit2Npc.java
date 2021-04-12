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
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠婚柟宕囧仱閺屽棗顓奸崱妤佺暟闂備礁鐤囧銊╂嚄閸撲胶椹抽煫鍥ㄦ⒒缁★拷闂佹眹鍨藉褎鐗庨梻浣虹帛濡繘宕滃☉姘潟闁绘劕鎼崘锟介悷婊勭矒閹垽宕卞☉娆忎化婵°倧闄勭�笛囶敂閻樼粯鐓涢柛鏇ㄥ亜閿熻姤鎮傚﹢浣糕攽閻樿宸ラ柟鍐茬箻瀹曠敻鏁撴禒瀣拻闁搞儜灞锯枅闂佸搫琚崝宀勫煘閹达箑骞㈡俊顖滃劋椤忥繝姊洪懡銈呅ｉ柛鏂跨箻瀹曟粌鈹戠�ｎ�箓鏌涢弴銊ョ仩闁绘挻鐩弻娑氫沪閸撗呯厐閻庢鍠撻崝鎴濐潖濞差亜浼犻柛鏇ㄥ墯閹峰崬鈹戦悙璺虹毢闁哥姴閰ｉ幃楣冩倻閼恒儱浜楅柟鐓庣摠钃遍柡鍌︽嫹闂傚倷鐒﹂幃鍫曞磿濠婂懍娌柟閿嬵焽閸犳牕顫忔繝姘＜婵炲棙鍔﹀Ο鍌滅磽娓氾拷绾悂宕板杈潟闁绘劕鐡ㄦ刊鎾煕閿旇寮炬繛鍙夋倐濮婃椽宕滈幓鎺嶇凹濠电偛寮堕悧婊呭垝婵犳艾鍐�闁靛鍊楃粻姘舵⒑闂堟稓澧曢柟鍐茬箻瀹曞疇銇愰幒鎾跺幍缂佺虎鍘奸幊搴ㄦ偂閹扮増鐓忛柛銉戝喚浼冨Δ鐘靛仦椤洭骞戦崟顖涘仏閻庢稒锚椤忚泛顪冮妶鍡楀Ё缂佺姵鍨甸弫顕�姊绘笟锟藉褔藝娴犲绐楁慨妯挎硾閼稿綊鏌ｉ姀鐘冲暈闁稿鍓濈换婵囩節閸屾碍娈堕悗娑欑箓椤啴濡舵惔鈥崇濠电偛妯婇崣鍐嚕椤愶箑绠荤紓浣姑禍褰掓⒑閼测斁鎷￠柛鎾寸洴瀵櫕瀵肩�涙ǚ鎷绘繛杈剧到閹诧繝宕悙鐑樼厱闁哄啯鎸鹃悾鐢碉拷瑙勬磻閸楀啿顕ｆ禒瀣垫晝闁靛牆娲ㄩ崝鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟垶鎷呴崷顓ф锤濠电姴锕ら悧濠囨偂濞嗘挻鐓欏ù锝呭暞閻濐亝绻涢崨顓熷殗闁哄矉缍�缁犳盯鏁愰崨顔句邯闂傚倸娲らˇ鐢稿蓟閿濆绠婚柧蹇ｅ亝瀹曡櫕绻濋埛锟藉澶嬵�嶉梺閫涚┒閸斿秶鎹㈠┑瀣闁崇懓銇橀搹搴ㄦ煟鎼淬値娼愭繛璇х畵瀹曟垶绻濋崒婊勬闂佺粯姊婚埛鍫ュ极閸愵喗鐓ユ繛鎴灻顏堟煛閸涱厹鍋㈡慨濠傤煼瀹曟帒鈻庨幋顓熜滈梻浣侯攰椤曟粎鎹㈠┑瀣畺闁绘垼妫勫敮閻熸粌楠搁悾鐑藉蓟閵夛妇鍘甸梺缁樺灦閿氭繛鍫ョ畺閺屻劌鈹戦崱鈺傂︾紓浣哄У缁嬫帡濡甸崟顖氱闁挎繂鎲涢幘缁樼厸闁稿矉闄勭�氬綊姊婚崒姘拷鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧銇勯弴顏呭閻庢鍣崜姘辩箔閻斿吋鏅搁柦妯侯樈閸ゆ洟鏌熼梻瀵割槮闁告劧鎷锋俊鐐�栭幐楣冨窗鎼淬劍鏅搁柦妯侯槺娴犳稒銇勯妸锝呭姦闁诡喗鐟╅幊鐘活敄閼愁垱顎楅梻鍌欑閹测�愁潖閻熸壆鏆嗛柟闂寸閽冪喖鏌ㄥ┑鍡樺晵闁哄啫鐗婇弲鎼佹煢濡尨绱氭繛鎴炃氶弨浠嬫煕閳╁啰鎳勬繛鍫ョ畺濮婃椽妫冨☉姘辩杽闂佺锕ュú婊呭垝閼姐倗纾兼俊顖炴櫜缁ㄥ姊洪崫鍕殭闁稿﹦鎳撻埢宥夊即閵忥紕鍘卞┑鈽嗗灣缁垶宕愰幇顓熷弿濠电姴鍟妵婵堬拷瑙勬磸閸斿秶鎹㈠┑瀣妞ゅ繐绉垫晥婵犵數濮烽弫鎼佸磻濮楋拷瀹曠娀鎮╃拠鑼�為梺闈涱焾閸庡骞忛悜钘夐唶闁哄洨鍠撻崢钘夆攽閳藉棗鐏ｉ柍宄扮墦瀵啿顭ㄩ崼鐔哄幍閻庣懓瀚妯何ｆ繝姘厓缂備焦蓱瀹曞瞼锟借娲栫紞濠囥�佸▎鎾村仼閻忕偛锟界喐瀚梻鍌氬�搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼唶婵°倧绲介崯顐ょ玻濡ゅ懏鐓涚�广儱楠搁獮妤呮煕鐎ｎ倖鎴﹀Φ閸曨垰绫嶉柨鐔剁矙楠炲繐鈹戠�ｎ亞顔嗛梺缁樺灱婵倝寮查弻銉ョ闁圭⒈鍘奸悘锟犳倵濮樻剚娼愰柕鍥у楠炴鎹勯惄鎺嬪灲閺岋紕锟斤綆鍋嗗ú鎾煛瀹�锟介崰鏍�佸▎鎾村仼鐎癸拷閿熶粙鎮￠敓浠嬫⒑閸欍儳涓茬紒韫矙婵℃挳骞掗幋顓熷兊闂佺粯鎸稿ù閿嬬瑜忕槐鎾存媴娴犲鎽甸梺缁橆殘婵挳锝炶箛鏇犵＜婵☆垵顕ч鎾剁磽娴ｅ湱鈽夋い鎴濇噹閳绘捇顢橀悩鐢碉紳婵炶揪缍�濞咃絿鏁☉銏″仺妞ゆ牗顨愰幏宄扮暦閸ャ劍顔曢梻浣侯攰閹活亪姊介崟顖氱９闁绘垼濮ら崑鈥趁归敐澶樻妞わ讣绠撻弻鐔哄枈閸楃偘鍠婇梺鐐藉劵缁犳挻淇婇幖浣哥厸濞撴熬鎷烽柛鐐舵硾閳规垿鎮╅鑲╁姶婵炲瓨绮庨崗妯侯潖娴犲绀嬫い鏍ㄦ皑閻ゅ嫰姊洪棃娑辩劸闁稿孩鐟╅幃銏ゆ偂鎼达紕锟筋厼顪冮妶鍡樷拹闁稿骸纾弫顕�宕稿Δ浣叉嫽婵炶揪绲肩拃锕傛倿閹灛鏃堟偐閸欏鍠愮紓渚囧枟濡線濡甸幇鏉跨闁硅揪绲鹃幉鐗堢節閻㈤潧浠﹂柛顭戝灦瀹曠銇愰幒鎴狀攨闂佽鍎兼慨銈夋偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟介悷褏妲愰幒妤�惟闁靛牆娲ㄩ悡鎾斥攽椤旂》鏀绘俊鐐舵閻ｇ兘顢曢敃锟界粈瀣⒒閸喓鈽夊鐟扮墦濮婄粯鎷呴崨濠冨枑闂佸摜濮甸崝娆撶嵁閹版澘绀冪�瑰壊鍠栧▓銊︾節閻㈤潧校缁炬澘绉瑰鏌ュ箵閹烘繄鍞甸柣鐘烘〃鐠�锕傚磿閹邦厾绠鹃柛娑卞亜閻忓弶鎱ㄦ繝鍛仩闁圭懓瀚版俊鎼佸Ψ閿旀儳缍掗梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷�?
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
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠婚柟宕囧仱閺屽棗顓奸崱妤佺暟闂備礁鐤囧銊╂嚄閸撲胶椹抽煫鍥ㄦ⒒缁★拷闂佹眹鍨藉褎鐗庨梻浣虹帛濡繘宕滃☉姘潟闁绘劕鎼崘锟介悷婊勭矒閹垽宕卞☉娆忎化婵°倧闄勭�笛囶敂閻樼粯鐓涢柛鏇ㄥ亜閿熻姤鎮傚﹢浣糕攽閻樿宸ラ柟鍐茬箻瀹曠敻鏁撴禒瀣拻闁搞儜灞锯枅闂佸搫琚崝宀勫煘閹达箑骞㈡俊顖滃劋椤忥繝姊洪懡銈呅ｉ柛鏂跨箻瀹曟粌鈹戠�ｎ�箓鏌涢弴銊ョ仩闁绘挻鐩弻娑氫沪閸撗呯厐閻庢鍠撻崝鎴濐潖濞差亜浼犻柛鏇ㄥ墯閹峰崬鈹戦悙璺虹毢闁哥姴閰ｉ幃楣冩倻閼恒儱浜楅柟鐓庣摠钃遍柡鍌︽嫹闂傚倷鐒﹂幃鍫曞磿椤栫偛绀夌�广儱顦壕褰掓煟閹达絽袚闁抽攱甯掗湁闁挎繂娲﹂崵锟介梺宕囩帛濞茬喖寮婚敓鐘虫櫢濞寸姴顑嗛悞鑲╋拷骞垮劚濡绂嶉柆宥嗏拺缂備焦锕╅悞鐐亜閺囧棗娲︾�氬懘鏌ｉ弬鎸庢喐缂佺娀绠栭弻鐔猴拷鐢殿焾閿熻姤鍨甸～婵堟崉閾忕懓鎽嬪┑鐐差嚟婵挳顢栭崱娑欏亗闁哄洨鍠撶粻楣冩煙鐎电浠ч柟鍐插缁辨帡鎳滈悽闈涘绩闂佸搫鏈粙鎴ｇ亽闂佸憡鍨崐鏍拷姘秺閺岋繝宕掑Ο鍝勫闂佸搫鍋婇幏鐑芥⒒閸屾瑨鍏岀紒顕呭灦瀹曟繂螣闂傚鍓ㄥ┑鐐叉閸旀牕鈻嶉悩宕囩闁瑰瓨鐟ラ悘顏堟煟閹惧瓨绀嬮柡灞炬礃缁绘盯宕归鐓幮戝┑鐐差嚟婵即宕规禒瀣摕闁挎繂顦伴弲鏌ユ煕濞戝崬骞楁禍娑欎繆閻愵亜锟姐倝宕戦崨顖涘床闁告洦鍨扮粻鏌ユ煕閺囥劌澧┑顖涙尦閺岋繝宕惰椤ユ粍绻涚拠褏鐣甸柟顕嗙節瀵挳濮�閿涘嫬甯楅梻浣哥枃濡椼劎绮堟笟锟藉鎼佸Χ婢跺鍘介梺鐟版惈缁夊爼鎯屽▎鎾寸厸閻忕偛澧藉ú瀵革拷娈垮櫘閸ｏ絽鐣烽幒鎴僵妞ゆ帪鎷风紒鐙呯稻缁绘繂鈻撻崹顔界亪闂佹寧娲忛崕閬嶁�旈崘鈺冾浄閻庯綆鍓欑粊锕傛⒑瑜版帒浜伴柛妯圭矙瀹曟洟鎮㈤崗鑲╁弳濠电娀娼уΛ妤呮晸閽樺绉洪柨婵堝仜椤撳ジ宕ㄩ鍛澑闂備胶绮…鍥╁垝椤栨埃妲堢憸鏃堝蓟濞戞瑧绡�闁告洦鍓欏▓灞筋渻閵堝骸浜滅紒缁橈耿楠炲﹪鏁撻悩鍙傃囨煕濞戝崬骞樺ù婊呭娣囧﹪鎮欓鍕舵嫹閺嶎厼绠板Δ锝呭暙缁愭骞栨潏鍓хɑ妞ゆ劒绮欓弻锝夊箛椤旂厧濡洪梺缁樻尰閻熲晛顫忓ú顏嶆晣闁靛ě鍛婵°倗濮烽崑鐐烘偋濡ゅ啯宕叉繛鎴欏灩闁卞洭鏌ｉ弮鍫濞寸厧鑻埞鎴︻敊绾攱鏁惧┑锛勫仩濡嫰鎮惧畡鎷旀棃宕ㄩ瑙勫缂備胶鍋撻崕鎶筋敄閸涘瓨鍊垮┑鐘崇閳锋帒霉閿濆嫯顒熼柣鎺斿亾閹便劌顫滈崼婵愭喘婵炲瓨绮庨…鍫ュ煝鎼淬劌绠ｆ繝闈涙娴滄澘鈹戦悩鍨毄濠殿喚鏁婚幊婵嬪礈瑜忔稉宥夋煣韫囷絽浜楃紒璇叉閺屾洟宕煎┑鍡╀紓濡炪倖鏌ㄩˇ鐢稿蓟閻斿吋鐓ラ悗锝庡亖娴犮垹鈹戦纭烽練婵炲拑缍侀獮鎴﹀礋椤栨鈺呮煏婢舵稑顩憸鐗堝哺濮婄粯鎷呴悜妯烘畬闂佹悶鍊栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹?
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitUnit unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}

		if (submittype == SubmitType.INSTANCE_ZONE_ITEM) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒闁哥喎娲缁樻媴缁嬫寧姣愰梺鍦拡閸嬪﹪鐛繝鍐╁劅闁靛鍎遍悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝寮撮悢鍓佺畾闂侀潧鐗嗛幊搴ㄥ汲濞嗘挻鐓曢柟鐐綑閳绘洟鏌＄仦璇诧拷婵嗩嚕閸撲焦宕夐柕濞垮�涘鎼佹⒒閸屾碍鎼愭い锔炬暬瀵鏁愭径濠勵啋闂佹儳娴氶崑鍛暦閹惰姤鈷戦柛锔诲幗濞呮洖鈹戦悜鍥ㄥ闂備礁鎼張顒傜矙閹剧粯鏅搁柡鍌樺�楃粔鐢告煕鐎ｎ亝顥犵紒顔碱煼閹瑩鎮滃Ο鐓庡箰闂佽绻掗崑鐔煎疾椤愶絾娅忛梺璇叉唉椤煤閿曞倸纾诲┑鐘插�婚弳锕傛煟閺冨倵鎷￠柡浣稿暞閵囧嫰骞掑鍥舵М濡炪倕绻楅崺鏍崲濠靛鍋ㄩ梻鍫熷垁閿濆鐓犻悷娆忓缁�鍐磼缂佹澹橀柍瑙勫灴閹晠宕归锝嗙槑濠电姵顔栭崰妤�顭囧▎鎴濆疾闂備焦瀵уú鏍磹閸濄儱顥氬┑鐘崇閻撳繐鈹戦悩鑼缂侊拷鐎ｎ�㈢懓顭ㄩ崟顓犵厜闂佸搫澶囬敓鑺ュ墯閸氬鏌涢幇鈺佸妞ゎ剙顑夊娲濞戞瑯妫￠柣銏╁灲缁绘繂顕ｆ繝姘亜闁稿繒鍘ч惂鍕節閵忥絾纭鹃柨鏇樺劚閳绘捇寮婚妷锔规嫼闂傚倸鐗婄粙鎺楀箹閹扮増鍊垫慨姗嗗亜瀹撳棝鏌曢崱鏇犵獢鐎殿喗鎸虫慨锟介柣娆欐嫹婵炵厧锕娲礃閸欏鍎撻梺绋匡功閺佽顕ｉ幖浣稿窛妞ゆ棁宕电粻姘舵⒑闂堟稓澧曟繛灞傚�曢弳鈺呮⒒娴ｄ警鐒炬い鎴濇喘瀹曟垿濡舵径灞界ウ闂佺鎻粻鎴︽倷婵犲啨浜滈柟鐑樺灥閿熻棄鎽滅划濠囨晝閸屾稈鎷洪梺纭呭亹閸嬫盯宕濋幘顔界厱闁瑰灝瀚悾鐢碉拷娈垮櫘閸嬪﹤鐣烽幒妤佸�烽悗鐢殿焾楠炲牊绻濋悽闈涗沪闁搞劑娼ч悾鐑筋敆閸曨厼绁﹀┑掳鍊曢幊蹇涙偂濞戞ǜ锟芥帒顫濋浣虹厬闂備緡鍙庨崹閬嶅箞閵婏妇绡�闁告洦鍘肩粭锟犳⒑閻熸澘妲婚柟铏耿楠炴牞銇愰幒鎾充画闂佽顔栭崳顕�宕戣濮婂宕掑▎鎴犵崲濠电偘鍖犻崗鐘虫そ閺佸啴宕掑☉妯哄婵＄偑鍊栭悧妤呭礄瑜版帒鍚归柡鍥ュ灪閻撴瑧绱撴担濮戭亪宕告繝鍐х箚闁圭粯甯炴晶锕傛煛鐏炵偓绀夌紒鐘崇洴瀵挳鎮欓幇鈺佸姕闁靛洤瀚板顕�鏁撴禒瀣婵炲棗娴氬鏍煣韫囨凹娼愮�规洖顦甸弻鏇熺箾閸喖濮曢梺缁樼缚閸ㄨ棄顫忓ú顏呭仭闁哄瀵ч锟介梻浣烘嚀閸ゆ牠骞忛敓锟�
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}
		if (submittype == SubmitType.GUILD_ZONE_ITEM) {
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}

		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗悗姘煎弮閹繝鎮╅崹顐㈡瀾闂佺粯顨呴悧鍡欑箔瑜旈弻锝夋晲閸℃ǜ浠㈤梺鍝勬湰閻╊垶宕洪敓鐘茬＜婵犲﹤瀚崹閬嶆煟鎼淬埄鍟忛柛锝庡櫍瀹曟娊鏁愰崨顖涙婵犻潧鍊搁幉锟犲磻閸曨垱鐓曟繝闈涙椤忊晝绱掗悩顔煎姎闁宠鍨块弫宥夊礋椤愨剝婢�闂備胶顭堥敃銉╂偋閻樿绠栫憸宥堢亙闂佸憡鍔戦崝宥夋倵閹惰姤鍊垫鐐茬仢閸旀碍銇勯敂璇茬仸婵﹤顭烽、娑㈡倷鐎电骞嶉梻鍌氬�搁崐鎼侇敋椤撱垹绀夌�广儱顦伴悡鐔兼煙閹屽殶闁瑰啿瀚妵鍕Ω閿濆懎濮﹂梺璇″枟閻熲晠骞婇悩娲绘晞闁兼剚鍨遍妤呮⒒閸屾瑦绁版い鏇嗗懏宕叉俊銈呭暕閻掑﹥绻涢崱妯诲鞍闁哄懏鎮傞弻娑欑節閸曨偅鐝″┑鐐插悑閸旀牜鎹㈠☉妯忓湱锟斤綆鍋呴悵姘旈悩闈涗粶缂佺粯锕㈠顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?
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
						// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽幃銏ゆ惞閸︻叏绱查梻渚�娼х换鎺撴叏閻㈠憡鍊堕柛顐犲劜閳锋垶绻涢懠棰濆殭妤犵偞顨嗛妵鍕Ω閵夘垵鍚悗娈垮枦椤曆囶敇閸忕厧绶炲┑鐘插楠炴劕鈹戦悙鑸靛涧缂佽弓绮欓獮澶愬灳閺傘儲鐏侀柣鐘烘〃鐠�锕�銆掓繝姘厪闁割偅绻傞敓鐣屾嚀閳诲秹寮崼鐔哄幍闂佸憡鍨崐鏍拷姘炬嫹?
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

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
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐差渻閵堝棗绗掓い锔垮嵆瀵煡顢旈崼鐔蜂画濠电姴锕ら崯鎵不婵犳碍鐓欑�规洖娲ゆ禒閬嶆煛鐏炶姤顥滄い鎾炽偢瀹曞崬螖娴ｇ儤娈堕梻鍌氬�风粈渚�鎮块崶褜娴栭柕濞炬櫆閸ゅ嫰鏌涢幘鑼跺厡濡炶濞婇悡顐﹀炊閵婏腹鎷荤紓浣叉閹风兘姊绘担鍦菇闁搞劏妫勯…鍥槼闁绘閰ｅ缁樻媴閾忕懓绗″┑鈽嗗亜缁绘ê鐣峰鍐ｆ婵﹩鍙庡鐔兼⒑缂佹ê濮囬柟纰卞亰瀹曟﹢鏁撴禒瀣仭婵犲﹤瀚惌鎺楁煙椤斿搫鐏茬�规洖宕埥澶娾枎韫囧骸瀵叉繝寰锋澘锟窖囨⒔閸曨叏鎷风粭娑樻祩閺佸倿鏌ｅΟ鑲╁笡闁绘挻鐩弻娑㈠即閵娿儰绨婚梺璺ㄥ枙婵倝骞冮崒姘捐�垮ù锝囩《閺�浠嬫煟濡鍤嬬�规悶鍎甸弻鐔煎礃閼碱剛顔掗悗瑙勬礈閺佸寮幘瀵割浄閻庯綆鍋�閹峰姊洪幖鐐插妧閻忕偤鏁弸鍛存⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繂鐣濋崟顐ゅ幋闂佺鎻粻鎴︾嵁閵忊�茬箚妞ゆ牗绮岄崝瀣亜韫囥儳绡�婵﹥妞介幊锟犲Χ閸涘拑缍侀弻娑㈠棘鐠恒劎顔掗悗瑙勬礃缁矂鍩為幋鐙呮嫹閿濆函鎷烽銊х暤闁哄本鐩鎾Ω閵壯傚摋闂備胶绮幐濠氭儎椤栫偛钃熸繛鎴炵煯濞岊亪鏌涢幘妤�鎳愰崢鎰版煟鎼淬埄鍟忛柛鐘虫崌瀹曟繈骞嬪┑鎰稁濠电偛妯婃禍婊勫閻樼粯鐓曢柡鍥ュ妼婢ь垶鏌熷畡鏉胯埞闁宠鍨块幃娆戞崉閾忚顕楅梻浣告憸婵挳鏌婇敐澶婄畺濡わ絽鍟崐濠氭煠閹帒鍔氬ù婊勵殜閺岀喖鎮℃惔锝嗘喖闁藉啴浜堕弻锟犲磼閿旇棄顏堕梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧绻濇繝鍌涘櫢婵炲矈浜弻鐔兼煥鐎ｇ數鍔烽梺鍝ュУ閻楁洟锝炶箛鏃傜瘈婵﹩鍓涢敍婊冣攽閻愬弶顥為柛鏃撶畱铻ｉ柛灞剧矌绾捐棄銆掑鐐缂佺虎鍘介幃鍌氱暦閺夋娼╅弶鍫厛濞肩喖姊虹紒妯哄闁宦板妽閸掑﹪骞橀鐣屽幈闂佹寧妫侀褍顕ｉ悙顒傜闁告瑥顦伴崐鎰叏婵犲啯銇濈�规洘绮撻獮鎾诲箳瀹ュ洤鍤┑鐘垫暩閸嬫稑顕ｉ崼鏇熷亱婵犲﹤鎳庨崹婵嗏攽閻樺疇澹橀柛鎰舵嫹闂備線娼ч…鍫ュ磹濡ゅ啰涓嶆慨妯垮煐閳锋垿姊婚崼鐔恒�掑褎娲熼弻鐔煎礃閼碱剛顔掗悗瑙勬礀閻ゅ洭濡甸幇鏉跨闁规崘娉涢獮宥囩磽娴ｉ缚妾搁柛妯恒偢楠炲﹥鎯旈妸锕�浜楅梺瑙勫婢ф鎮¤箛娑欑厱闁靛鍨甸崰姘閸愩剮鏃堟偐闂堟稐娌銈庡幖濞差參鐛幋锕�绀嬫い鏍ㄧ☉娴犲繘鏌ｆ惔銏⑩檨闁挎碍銇勮箛姘【妞ゎ亜鍟存俊鍫曞幢濡わ拷琛肩紓鍌欒兌婵敻宕归悽绋挎瀬妞ゆ洩鎷锋慨濠勭帛缁楃喖鏁撻挊澶樼劷鐟滄棁妫熸繛瀵稿Т椤戝懐绮ｅΔ浣瑰弿婵☆垱瀵х涵楣冩煠缁嬭法绉洪柡宀嬬秮婵拷闁绘ê鍟块弳鍫ユ⒑缁嬫鍎岄柛鎾寸箘閹广垹鈹戦崶鈺冪槇闂佺鏈喊宥呪枔閸洘鍊垫繛鎴炵懅缁犳挻銇勯鍕殻濠德ゅ煐閹棃鍨惧畷鍥跺晣濠电姷鏁搁崑娑樜熸繝鍥х煑闁告劦鐓堥崵鏇熴亜閹板墎鐣辩紒鐘哄吹缁辨挻鎷呮慨鎴簼缁傚秷銇愰幒鎾嫼闂佸吋绁撮弬渚�骞忛敓鐘崇厱闁规儳顕ú瀵革拷娈垮枦濞呮洜锟戒絻鍋愰敓鑺ョ♁鑿ら柟椋庣帛缁绘稒娼忛崜褍鍩岄梺纭咁嚋缁绘繂鐣烽鐐村�烽柣鎴烆焽閸橀亶姊洪崫鍕殲闁规悂绠栭幃楣冩偨绾板瀚归悷娆忓绾惧鏌涘Δ锟介崯鍧楊敋閿濆棛顩烽悗锝呯仛閺呮繈姊洪棃娑氬婵炲眰鍔戝畷婵嬪醇閺囩啿鎷洪柣鐘叉处瑜板啴宕垫潏鈺冪＝鐎广儱鎳忛ˉ銏拷瑙勬礃閸ㄥ爼骞忛崨鏉戞嵍妞ゆ挆鍕暅濠电姷鏁告慨鎾晝閵堝鍋嬪┑鐘叉处閸嬪倹绻涢崱妯诲鞍闁绘挻鐟ラ湁闁挎繂鎳庨弳鐐烘煟濠垫劒绨肩紒缁樼洴瀹曘劑顢橀悢閿嬬暬闂備礁鎼惌澶岀礊閿熺晫绱掗悩宕囨创闁轰焦鍔欏畷銊╊敊閸欍儵鍋楅梻鍌氬�搁崐绋棵洪妶澹﹀洭鎮界粙鑳憰闂佹寧绻傞ˇ顖滅不婵犳碍鐓ｉ煫鍥风到娴滄繄锟借娲濆▍鏇犳崲濠靛鐓曢柨鐔绘椤撳吋寰勭�ｇ鎷峰澶嬧拺闂侇偅绋撻埞鎺楁煕閺傝法肖闁瑰箍鍨归埞鎴狅拷锝庝簽椤︺劑姊哄畷鍥ㄥ殌闁靛洦锕㈤幖瑙勬償閵婏妇鍘介柟鍏肩暘閸娿倕顭囬幇顓犵閻犲泧鍛殼閻庤娲橀崹鍓佹崲濠靛纾兼繝濠傚椤旀洟姊绘担铏瑰笡婵﹤顭烽崺娑㈠醇閵夈儲鐎梺鍛婂姦閸犳鎮￠妷锔剧闁瑰浼濋鍫晜妞ゅ繐鐗婇悡娑㈡煕濞戝崬骞戦柛瀣ㄥ灪閹便劍绻濋崒銈囧悑閻庤娲樼敮鎺楀煝鎼淬劌绠ｆい鎾跺晿濠婂牊鈷掑ù锝勮閺�鐗堛亜閺囩喓鐭岄柟骞垮灩閳规垹锟斤綆浜為悾娲⒑缂佹ê鐏辨俊顐㈠閺侇噣鏌ｉ悢鍝ョ煀濡ょ姵鎮傞幃楣冩倻閽樺鎽曢梺闈涱檧婵″洭宕㈤悽鍛娾拺缂備焦锚閻忥箓鏌ㄥ顓犵闁割偁鍎抽悾娲煛鐏炶濡奸柍瑙勫灴瀹曢亶鍩￠崒鍌﹀缁辨挻鎷呴崫鍕戯絿绱掔�ｎ偄娴┑锛勬暬瀹曠喖顢涘槌栧悈闂備焦瀵х换鍌炲箟濞戙垹绠荤紓浣诡焽閸樻悂姊虹粙璺ㄧ効闂傚嫬瀚敓鑺ヨ壘缂嶅﹤顫忔繝姘＜婵﹩鍓ㄩ幏鐑芥倻閼恒儱锟藉潡鏌ㄩ弴鐐诧拷鍝ョ不閺嶎厽鐓曟い鎰剁稻缁�锟界紒鍓у亾鐎笛囧Φ閸曨垰鍗虫い蹇撴噹椤忓爼鏌ｆ惔銏╁晱闁革綆鍣ｅ畷婊冾潩鏉堚晝鐣堕梺缁樻煥閸氬寮查幖浣圭參婵☆垯璀﹀Ο鍫ユ煕閵堝棙绀嬮柡宀�鍠栧鑽わ拷闈涘濡差噣姊洪崨濠傚Ё闁圭兘鏀辨穱濠囨倷椤忓嫸鎷烽弽顓炵濡わ絽鍟粣妤呭箹濞ｎ剙濡介柡鍛倐閺岋箑螣娓氼垱楔婵炲濮电粙鎺楀Φ閸曨垰惟闁挎繂鎳庢慨锕傛⒑鐠団�虫灍闁荤啿鏅犻獮濠囨偐濞茬粯鏅為梺鍏煎墯閸ㄩ亶顢撳Δ鍛拻闁稿本鐟чˇ锕傛煙濞村鎷烽幇浣圭稁闂佽崵鍠愭竟鍡涘汲閸℃稒鐓欓梻鍌氼嚟椤︼箓鏌﹂崘顏勬灈闁哄被鍔岄埞鎴﹀幢濡儤娅熼梻浣告惈閸燁偊鎮ф繝鍥х柧闁归棿鐒﹂悡銏′繆椤栨粌鐨戠紒杈ㄧ缁绘盯骞嬮悙鍐╁哺瀵劍绂掔�ｎ偆鍘遍梺鏂ユ櫅閸熶即骞婇崟顒傜闁割偁鍎抽悾鐑樻叏婵犲啯銇濇俊顐㈠暙閳藉顫濇潏鈺傛緰闂傚倷鑳堕…鍫ユ晝閵夈儍鍝勵煥閸涱厼鐏婇梺鐓庮潟閸婃澹曢崗闂寸箚妞ゆ牜鍋炲▍婊呯磼閵娿儺鐓兼慨濠冩そ瀹曨偊宕熼锝嗩唲闂備胶顭堥敃锕傚箠閹捐鐓濈�广儱顦崡鎶芥煏韫囥儳纾块柛妯哄船閳规垿鍩ラ崱妤冧化缂備緡鍣崹璺虹暦閹版澘绠涙い鎾跺枎瀵寧绻濋悽闈浶㈤柛鐕佸灦婵￠潧鈹戦崼顒佸閻熸瑥瀚壕鎼佹煕閺傝法肖闁瑰箍鍨归埞鎴狅拷锝庝簽椤︺劌顪冮妶鍛缂佸鐏氶弲銉モ攽閻樺灚鏆╁┑顔惧厴瀵偊骞栨担鍝ワ紱濠殿喗顨愰幏椋庯拷瑙勬礈婵烇拷闁诡喒鏅濋幏鐘绘嚑椤掞拷閿熺晫鍋ゅ娲濞戣京鍔搁梺绋块椤兘鐛箛娑欏�婚柦妯侯樀閸炲爼姊洪崫鍕窛闁哥姵鎹囧畷銏ゆ寠婢跺棙鏂�闂佸疇妫勫Λ妤呮倶閿濆鐓冪�瑰嫭澹嗘晶锔撅拷娈垮枛閸熷潡鈥﹂妸鈺侀唶闁绘柨鎼獮宥夋煟鎼达絾鍤�閻庢凹鍘奸…鍨熸担鏇稻缁绘繂顫濋鐘插笚缂傚倸鍊烽悞锕佹懌閻庤娲栭惉濂告晸閸婄噥娼愭繛鍙夌墱缁辩偞绻濋崶銉嫹娴ｇ硶鏋庨柟鐐綑娴犲ジ鏌ｈ箛鏇炰粶闁跨喓鏅崰鎰拷姘煎墴濮婂宕掑顒婃嫹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋涢ˇ鐢稿极閹剧粯鍋愰柤纰卞墻閸炶泛鈹戞幊閸娧呭緤娴犲鐤い鎰╁�楅悳缁樹繆閵堝懏鍣洪柣鎾寸〒閿熻棄绠嶉崕杈殽閹间胶宓佹俊銈呮噺閻撴洟鎮楅敐搴★拷鏍箣閿曪拷妗呴梺鍛婃处閸ㄦ壆鐚惧澶嬬叆闁绘柨澧庨惌娆愵殽閻愯尙绠伴柍瑙勫灩閿熸枻缍嗘禍鐐侯敊閸℃稒鈷戠紓浣姑悘鍗炩攽椤斿搫锟芥繂顕ｉ弻銉ヨ摕闁靛鍎抽鎰版⒑閸︻厸鎷￠柛妯恒偢閹﹢鏁撻悩鍐诧拷鍨叏濡澧繛鍏煎姍閺屾洟宕惰椤忣厽顨ラ悙鎼劷闁圭懓瀚伴幆鍕箳鐎ｎ亞浼堥梺鍝勭焿缁辨洟鏁撻弬銈囩У闁稿妫楃叅闁圭虎鍠楅悡娑氾拷鐧告嫹闁跨喍绮欏畷浼村冀椤撴粣鎷锋担绯曟瀻闁圭偓娼欐禒濂告倵閻у憡瀚归梺璺ㄥ枍缁瑩骞冮敓鐘虫櫢濞寸姴顑嗛埛鎴︽煕濞嗗秴鍔ゅ☉鎾瑰皺缁辨帡鐓鐘电厯婵犵鍓濋幐鎶界嵁閹烘绠ｆい鎾跺枎閸忓﹪姊绘担铏瑰笡闁瑰摜顭堥湁闂佸灝顑囬々椋庢喐韫囨洘顫曢柟鎯х摠婵潙霉閻樺樊鍎忛柟鐣屾暬濮婅櫣绱掑鍡樼暭婵犳鍠楅幐鎶芥晲閻愬墎鐤�闁哄洨濮烽敍婊冣攽閳藉棗鐏ユい鏇嗗浂鏁侀柟鎯у绾捐棄霉閿濆懏璐￠柍钘夘槹閵囧嫰骞嬪┑鍥ф闂佸磭绮幑鍥�佸锟介幃鈺呮偨绾板闂繝鐢靛仩閹活亞绱為敓鑺ョ箾閸滃啰鎮奸柡渚囧枛閳藉濮�閳ュ厖缂撴俊鐐�栭悧妤呫�冮幇鏉跨鐎瑰嫭澹嗛弳锕傛煕閵夛絽濡芥い鏃�娲熷缁樻媴娓氼垱鏁梺瑙勬た娴滎亜顫忔禒瀣妞ゆ牗姘ㄩ敍娆撴⒑缂佹ê鐏卞┑顔哄�濆畷鎴﹀灳鐡掍礁缍婇弫鎰緞濡椿妫栨俊鐐�х拋锝囩不閹捐钃熼柣鏂挎惈閺嬪牓鏌涘Δ鍐ㄤ粧闁哥姴锕娲倷閽樺濮风紓浣哄У閹哥粯绌辨繝鍥х濞达絽鎽滈崢鍛婄箾閹惧鍟查柟椋庡厴閺屾盯鎮欓懜鐢点�愰梺瀹狀潐閸ㄥ潡骞冮埡鍜佹晩闁兼祴鏅涙慨璺衡攽閻愯尙鎽犵紒顔奸叄瀹曟螣娓氼垱缍庢繛瀵稿Т椤戝懐绮堢�ｎ偁浜滈柡宥冨妽閻ㄦ垿鏌ｉ妶鍛伃婵﹥妞藉Λ鍐ㄢ槈鏉堚晛濮奸梻浣侯焾鐎涒晠鎮烽埡鍛畺闁靛繈鍊栭崑鍌炲箹鏉堝墽纾块柨鐔虹摂閸樺ジ鈥旈崘顔嘉ч柛鈩兦氶幏褰掓⒑缁嬪潡顎楃痪缁㈠弮瀵偊顢氶敓钘夌暦缁嬭鏃�鎷呴崣澶婎伜婵犵數鍋犻幓顏嗗緤閼测晜濯伴柨鏇炲�归崐鍧楁煙椤栵絿浠滈柡鍐ㄧ墛閸嬫劙鏌涘▎蹇ｆЧ闁哥姵鍔楃槐鎾寸瑹閸パ勭亶濠碘槅鍋傜欢姘繆閻㈢绠涢柡澶庢硶椤斿﹪姊虹涵鍛涧缂佹煡绠栭獮澶愭偋閸垻鐦堥梺姹囧灲濞佳勭閿曞倹鐓曟い顓熷灥閻忥妇锟借娲滈、濠囧Φ閹版澘绠抽柟瀵稿閺�銊╂⒒娴ｇ瓔娼愰柛搴″悑閹便劑濡舵径瀣簵闂婎偄娲﹂幐鎾绩娴犲鐓熼柟閭﹀灠閻ㄥ搫霉閻橆喖鐏查柡灞剧洴瀵噣鏁撴禒瀣仭鐟滃繐危閹版澘绠虫俊銈忔嫹閹喖姊洪棃娑氬婵炲眰鍔戦幃锟犲箻閺傘儲鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰煐椤ュ鏌ｉ敐鍥у幋妞ゃ垺娲熼弫鍐晸閻ｅ瞼鐭嗛悗锝庡枟閳锋帡鏌涢銈呮灁闁宠棄顦…鍧楁偡閹殿喖鈪靛┑顔硷功缁垶骞忛崨鏉戝窛濠电姴鍟弸鎴︽⒒娴ｅ憡鎲稿┑顔炬暬瀹曟繂鈻庨幘璺虹ウ闂佸湱澧楀妯肩矆閸愵亷鎷烽悷鏉款棌闁哥姵鐗曢埢鎾诲Ω閿斿墽鐦堥梺姹囧灲濞佳勭墡缂備胶鍋撳妯肩矓閻熼偊鍤曢柡灞诲劚缁犵敻鏌熼悜妯肩畼闁哥偟鏁婚弻锝夋偐閻戞ǜ锟藉啴鎮归敓浠嬫晝閸屾氨锛熼梺褰掑亰閸樺墽绮绘ィ鍐╃厱婵炴垵宕禍婊堟煟韫囨挸绾ч柟渚垮妽缁绘繈宕ㄩ鍛摋闂備礁婀遍幊鎾讹拷姘卞娣囧﹪骞栨担鑲濄劑鏌ㄩ弮锟介崕宕囩礊閹烘鈷掗柛灞剧懆閸忓矂鏌熼搹顐ｅ磳鐎规洜鏁诲浠嬵敇閻愭鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?
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
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐差渻閵堝棗绗掓い锔垮嵆瀵煡顢旈崼鐔蜂画濠电姴锕ら崯鎵不婵犳碍鐓欑�规洖娲ゆ禒閬嶆煛鐏炶姤顥滄い鎾炽偢瀹曞崬螖娴ｇ儤娈堕梻鍌氬�风粈渚�鎮块崶褜娴栭柕濞炬櫆閸ゅ嫰鏌涢幘鑼跺厡濡炶濞婇悡顐﹀炊閵婏腹鎷荤紓浣叉閹风兘姊绘担鍦菇闁搞劏妫勯…鍥槼闁绘閰ｅ缁樻媴閾忕懓绗″┑鈽嗗亜缁绘ê鐣峰鍐ｆ婵﹩鍙庡鐔兼⒑缂佹ê濮囬柟纰卞亰瀹曟﹢鏁撴禒瀣仭婵犲﹤瀚惌鎺楁煙椤斿搫鐏茬�规洖宕埥澶娾枎韫囧骸瀵叉繝寰锋澘锟窖囨⒔閸曨叏鎷风粭娑樻祩閺佸倿鏌ｅΟ鑲╁笡闁绘挻鐩弻娑㈠即閵娿儰绨婚梺璺ㄥ枙婵倝骞冮崒姘捐�垮ù锝囩《閺�浠嬫煟濡鍤嬬�规悶鍎甸弻鐔煎礃閼碱剛顔掗悗瑙勬礈閺佸寮幘瀵割浄閻庯綆鍋�閹峰姊洪幖鐐插妧閻忕偤鏁弸鍛存⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繂鐣濋崟顐ゅ幋闂佺鎻粻鎴︾嵁閵忊�茬箚妞ゆ牗绮岄崝瀣亜韫囥儳绡�婵﹥妞介幊锟犲Χ閸涘拑缍侀弻娑㈠棘鐠恒劎顔掗悗瑙勬礃缁矂鍩為幋鐙呮嫹閿濆函鎷烽銊х暤闁哄本鐩鎾Ω閵壯傚摋闂備胶绮幐濠氭儎椤栫偛钃熸繛鎴炵煯濞岊亪鏌涢幘妤�鎳愰崢鎰版煟鎼淬埄鍟忛柛鐘虫崌瀹曟繈骞嬪┑鎰稁濠电偛妯婃禍婊勫閻樼粯鐓曢柡鍥ュ妼婢ь垶鏌熷畡鏉胯埞闁宠鍨块幃娆戞崉閾忚顕楅梻浣告憸婵挳鏌婇敐澶婄畺濡わ絽鍟崐濠氭煠閹帒鍔氬ù婊勵殜閺岀喖鎮℃惔锝嗘喖闁藉啴浜堕弻锟犲磼閿旇棄顏堕梻鍌氬�搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾炬寧銇勯弽顐粶缂侊拷婢跺矉鎷烽獮鍨姎妞わ富鍨虫竟鏇°亹閹烘挾鍘介梺纭呮彧缁插�燁暱闂備焦濞婇弨杈╂暜閹烘绠掗梻浣瑰缁诲倸煤閿曞倸鍚归柨鐔剁矙濮婂搫鐣烽崶鈺佺濠电偠灏欓崰鏍ь嚕婵犳碍鏅搁柣妯挎珪濞呫垺绻涚�电孝妞ゆ垵妫濋幃鐐烘嚃閳哄瀚规鐐茬仢閸旀碍淇婇锝庢畷缂佸倸绉归弻鍡楊吋閸″繑瀚肩紓鍌氬�烽悞锕傛晝閳哄懏鍊块柣鎰靛厵娴滄粓鏌￠崶褎顥滄繛璇у閿熻姤鑹鹃幊姗�寮婚敐澶婃闁圭瀛╅崰鎰磽娴ｅ搫鈻堢紒鐘崇墵瀵鎮㈤悮瀛樺闁汇垺顔栭悞楣冩煥閻旇袚闁搞劎鏁婚敐鐐测攽閸喎纾梺鎯х箳閹虫捇骞楃�ｎ亖鏀介柣鎰▕閸ょ喎鈹戦鑺ュ唉妞ゃ垺鐗犲畷鍗炩槈濞嗗繋绨甸梻浣告惈濞层劑宕伴幘鍓佷笉濡わ絽鍟悡娆撴倵閻㈡鐒惧ù鐘欏洦鐓欓柛鎰絻椤忣偆绱掓潏銊ユ诞闁硅櫕绮撻幃浠嬫濞戞鍝楅梻鍌欑閹碱偊寮甸鍌滅煓闁硅揪绲挎禍浠嬫⒒娴ｅ憡鍟為柛顭戝灦瀹曟劙寮介顒佸婵﹩鍓涚粔娲煛瀹�瀣瘈鐎规洘甯掕灒闁告繂瀚～姘舵⒒娴ｅ憡鎯堥柛瀣躬楠炲繘鎮滈懞銉㈡嫽闂佺鏈悷銊╁礂瀹�锟界槐鎺楊敋閸涱厾浠搁悗瑙勬礃缁诲倽鐏掗梻鍌氬�搁顓㈠礈閵娿儮鏀介柣鎰级椤ョ偤鏌涢弮锟介悧鏇㈠煝瀹ュ鍋愮�规洖娲ㄩ鏇㈡⒑閻熸壆鎽犻柣鐔村劦閹﹢顢旈崼鐔哄幗闂佽鍎抽悺銊х矆鐎ｎ喗鐓涢悘鐐靛亾缁�鍐磼缂佹娲寸�规洖缍婇、娆撴偂楠烆喗鍨甸埞鎴︽倷瀹割喖娈舵繝娈垮枙閸楀啿鐣风憴鍕浄閻庯綆浜ｉ幗鏇㈡⒑閹稿海绠撴い锔垮嵆瀵煡寮婚妷锔惧幈濠电偞鍨靛畷顒勭嵁濡や胶顩叉繛鎴炵懁缁诲棝鏌ｉ幇鍏哥盎闁跨喎顫曢崐婵嗙暦閹达箑宸濇い鏍ㄧ☉鎼村﹪姊洪崨濠冨闁搞劍澹嗙划濠氬蓟閵夛妇鍘遍梺鍝勬储閸斿本鏅堕姘ｆ斀妞ゆ牗绋掔亸锕傛煛瀹�瀣瘈鐎规洘鍎奸ˇ铏亜閵夛妇鐭嬬紒缁樼〒閹风姾顦撮柣锝囨暬閺岀喖顢氶崱娆戠槇閻庢鍠楅幐铏叏閿熶粙鏌ㄥ☉妯侯仼閻㈩垱顨婂缁樻媴閸濄儲鐎┑鈩冦仠閸斿海鍒掗崼鐔虹懝闁跨喕妫勯锝夊箹娴ｈ倽褍顭跨捄渚剳闁告ü绮欏娲偡閻楀牊鍎撶紓浣割槸閻栧ジ骞嗙仦瑙ｆ瀻闁规儳顕崢鎼佹煟韫囨洖浠滃褑妫勭叅閻庣敻娼婚幏宄扳枔閸喗鐝梺闈╃秶缁蹭粙鎮鹃悜钘夌闁规惌鍘介崓闈涱渻閵堝棗閲滈柟鐑筋棑缁辨帡鎮崨顖溕戠紓浣虹帛缁诲倿鍩㈤幘璇插瀭妞ゆ梻鏅禍顏堟⒒娴ｇ懓顕滄繛鎻掔箻瀹曟洟鏌嗗渚婃嫹閺冨牆绀冮柍鍝勫枤濞村嫰鏌ｆ惔顖滅У闁告挻鐟х划濠囨晝閸屾稈鎷洪悷婊呭鐢帗绂嶆导瀛樼厱婵☆垰婀遍惌娆戯拷瑙勬礃濞茬喖骞冮姀銈呯闁兼祴鏅涘铏節閻㈤潧鈻堟繛浣冲吘娑樜旈崨顔芥闂佽姤锚椤﹁京绮斿ú顏呯叆婵犻潧鐗嗘禒婊勩亜閹剧偨鍋㈢�规洏鍔戦、鏃堝川椤旇姤绶梻鍌氬�烽懗鍓佸垝椤栫偐锟斤箓宕堕埡浣哥亰濡炪倖鐗楅崺鍐ㄎｉ崼銏″枑闁哄啫鐗嗛拑鐔哥箾閹寸偟鎳呯紒鈽呮嫹闂備礁鎲″ú锕傚礈濞嗗繆鏋旈悘鐐电摂濞撳鏌曢崼婵嬵�楀ù婊勭矌缁辨帞绱掑鍫ｏ拷鎸庮殽閻愯韬柡浣规崌閹晠宕ｉ崒鍐ㄦ处閻撴洘绻涢幋婵嗚埞妤犵偞锚闇夋繝濠傛噹椤ｇ厧菐閸パ嶈含闁诡喗鐟╅、鏃堝礋閼搁潧顏堕梺鍝勭▉閸樿偐绮婚弶璇炬棃鏁愰崨顓熸缂備焦鍔栭〃濠囩嵁閺嶃劍缍囬柛鎾楀惙鎴濐渻閵堝棗濮冪紒顔界懇瀵鏁愭径濠勭杸濡炪倖姊婚崢褎淇婂ú顏呪拺缂備焦蓱鐏忎即鏌ｉ悢鍙夋珔妞ゎ偄绻愮叅妞ゅ繐绉甸弲锝夋⒑闂堟丹娑㈠川椤旂瓔鍟呮繝寰锋澘锟芥鎱ㄩ悜钘夌；闁绘劗鍎ら崑瀣繆閵堝懎鏆炵�规洖寮剁换娑㈠箣濞嗗繒浠奸梻浣稿船濞差參寮婚敐澶婄睄闁割偒鍋呴ˉ鏍ㄧ箾鐎电甯堕柤娲诲灦閸╃偤骞嬮敂缁樻櫓缂佺虎鍙冮弨閬嶅极閹�鏀介柨娑樺娴犫晜淇婇銏狀伃闁诡喗鍎抽悾锟犲箯閺冿拷濡啫鐣烽妸鈺婃晩閻熸瑥瀚铏圭磽閸屾瑨鍏岄柛瀣崌瀹曟洟骞庣粵瀣櫈闂佸憡绋戦悺銊╁磹閸喒鏀介柣妯虹－椤ｆ煡鏌嶉柨瀣瑨闂囧鏌ㄥ┑鍡楊伂妞ゆ帞鍠栭弻锝夊箳閺傚じ澹曢梺閫涚┒閸斿矂锝炲鍫濋唶婵犲灚鍔栭崰妯衡攽閻愯尙鎽犵紒顔奸叄閳ワ箓宕奸妷銉у幒闁瑰吋鐣崝宀�绮婚敐鍡欑瘈闂傚牊绋掗ˉ鐘裁瑰鍕凡闁宠鍨块幃鈺呭垂椤愶絾鐦庡┑鐘愁問閸犳岸寮繝姘疇婵犻潧顑呯粈鍫㈡喐韫囨梻鈻旂�广儱顦伴悡锝夌叓閸ラ鍒板ù婊勵殘缁辨帞鎷犻崣澶樻＆闂佸搫鏈ú鐔风暦閻撳簶鏀介柛鈾�鏅欑槐鎾翠繆閻愵亜锟芥牠寮婚妸鈹у洭鎮界粙鑳憰闂佺粯鏌ㄩ崥瀣偂閵夆晜鍊甸柨婵嗛娴滄牕霉閻橆喖鐏╅柍瑙勫灴椤㈡瑧娑甸悜鐣屽弽婵犵數鍋涢幏鎴犵礊娓氾拷閻涱噣骞嬮敃锟界粈瀣亜閺嶎煈鍤ら柍鍝勬噺閻撳繐顭块懜鐢碘槈妞も晩鍓涢幉鎼佹偋閸繂鎽靛┑顔硷功缁垶骞忛崨瀛樺�绘俊顖滃劋閻ｎ剟姊绘担瑙勫仩闁稿﹥鐗犻幃褔鎮╅懡銈呯ウ闂婎偄娲︾粙鎺楀疾閹间焦鐓ラ柣鏇炲�圭�氾拷?
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitUnit unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}

		if (submittype == SubmitType.INSTANCE_ZONE_ITEM) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞诲�楅崰濠囧础閻愭祴鎷婚梻浣告憸閸犲骸煤椤撶儐娼栫紓浣股戞刊瀵哥磼鐎ｎ偄顕滄慨锝嗗姍濮婃椽宕烽娑欏珱闂佺顑呴敃顏堟偘椤旂晫绡�闁告劏鏅涢崝鍛存⒑闂堟侗鐒鹃柛搴ㄤ憾閹顢橀姀鈾�鎷虹紓浣割儓濞夋洟鎮橀柆宥嗙厱閻庯綆鍓欐禒閬嶆煙椤曞棛绡�鐎殿喗鎸抽幃銏ゅ礈娴ｈ櫣鏆伴梻鍌欑窔濞佳囨偋閸℃稑绠犻幖娣妼濮瑰弶绻涢崱妯诲鞍闁绘挻娲熼弻鐔兼倷椤掍胶绋囬梺宕囩帛濞茬喖寮婚敍鍕勃閻犲洩顕滈幏宄扳攽閸♀晛娈ㄩ梺鍛婃尫閻掞箑鐣锋径鎰厪濠电偛鐏濋敓鑺ョ☉椤﹪骞栨担鍏夋嫽闂佺鏈喊宥夊箹閹邦厹浜滈柨鏃傚亾閺嗩剛锟芥鍠栭…鐑藉极閹邦厼绶炲┑鐘插閸熷姊绘担鐟板姢婵炲瓨宀稿畷鎴﹀川椤撶姵娈鹃梺瑙勫劶婵倝鍩涢幋锔界厱闁挎棁顕ч獮妤佺箾閸涱喗绀�闁宠鍨块幃婊堝炊閵娿儺浼撻梻鍌氬�风粈渚�骞栭锕�瀚夋い鎺戝�婚惌娆撴煙閸撗呭笡闁哄懏鎮傞弻锟犲磼濡尨鎷峰Δ鍐煋闁汇垹鎲￠悡鏇㈡倵閿濆簼绨兼い銉уХ缁辨帡顢欑喊杈╁悑闂佽鍠楅悷鈺呭箖濠婂吘鐔兼偂鎼达紕顔囬梻鍌欐祰椤曆呮崲閹烘纾婚柣鏃傚帶閻ょ偓銇勯幇鍓佺ɑ婵炲懎绻樺铏规嫚閸欏鏀銈庡亜椤︻垳鍙呴梺鎸庢礀閸婂摜澹曠拠娴嬫斀闁绘ɑ褰冮敓钘夘煼瀵娊鏁冮崒娑氬幗闂佸搫鍟崐鐢稿箯閿熺姵鐓涘ù锝囶焾閺嗙偤鏌曢崶褍顏鐐村笒椤撳ジ宕堕懜鏁屾粍淇婇悙顏勶拷鏇犳崲濡ゅ懎鏄ラ柡宥庡亝瀹曞弶绻濋棃娑卞剱闁稿鍔戝濠氬醇閻斿嘲鐎梺鎸庣箓椤︿即鎮￠悩缁樺仭婵炲棗绻愰鈺冪磼閿熶粙宕橀鍡欙紲缂傚倷鐒﹂…鍫熺珶濮楋拷閺屽秶鎲撮崟顐や紝闂佽鍠掗弲鐘茬暦瑜版帩鏁冮柨婵嗘濡叉垶绻濋悽闈浶ｆい鏃�鐗犲畷鏉课旈敓浠嬧�﹂崶褉鏋庨柟瀛樼箓閻ら箖姊婚崒娆戝妽閻庣瑳鍏犳椽寮介鐐碉紮闂佸憡绺块崕閬嵥夊顑芥斀闁绘ê纾。鏌ユ煟閹惧磭绠伴柍瑙勫灴閹晠鎳犻鍌ゅ晥缂傚倷绶ら幏鐑芥倵閿濆函鎷烽姀銏″殌妞ゎ厹鍔戝畷鐔碱敇閻橀潧甯ㄩ梻鍌欑閹碱偅寰勯崶顒佹櫢闁兼亽鍎辨晶顖炴煕濮橆剦鍎旈柡灞剧洴楠炲洭鍩℃担鍓茬�虫俊鐐�ら崜娆擃敄婢跺娼栨繛宸簼椤ュ牊绻涢幋鐐垫噽婵☆偓绻濋弻锝夊閳轰胶浼堢紓浣虹帛缁诲倿顢氶敐鍡欑瘈婵﹩鍘兼禍婊堟⒑缁嬭法绠抽柛妯犲洦鍎岄柛鏇ㄥ墰缁★拷闂侀潧楠忕徊鍓ф兜妤ｅ啯鐓ラ柡鍥崝姘舵煃缂佹ɑ宕岀�殿喖顭锋俊鐑芥晜鐟欏嫬顏归梻鍌氬�搁崐鎼佹偋婵犲嫮鐭欓柟鐑橆殔缁犲綊鏌熼幍顔碱暭闁稿﹤鐏氶幈銊ヮ潨閸℃ぞ绨婚悗瑙勬尭濡繈寮婚弴銏犲耿闁哄洨濮烽悰銏ゆ倵濞堝灝鏋熼柟姝屾珪閹便劑鏁撴禒瀣厽婵炲棙鐟︾�氱懓鈹戦悙闈涘付闁挎洦浜滈～蹇撁洪鍕槰闂佸憡鐟ラˇ浼村磿閹剧粯鈷戠紒瀣皡閸旂喖鏌℃担绛嬪殭妞ゆ洩缍侀獮鏍ㄦ媴缁嬭法鐛╂俊鐐�栧Λ浣哥暦閻㈢數涓嶆慨妯垮煐閳锋垿姊婚崼鐔恒�掑褎娲樼换娑氫沪閸屾熬鎷烽弴銏犳辈闁冲搫鎳忛埛鎺懨归敐鍕劅闁绘帞鍋撻妵鍕箣濠靛洤鏋犻悗瑙勬礃閸ㄦ寧淇婇懜闈涚窞閻忕偟鏅妶锕傛⒒娴ｄ警鏀伴柟娲讳簽缁骞嬮敂钘夛拷宄扳攽閻樻彃鏆斿ù婊勭矒閺岀喖鎮滃Ο铏逛淮闂佽法鍠曞Λ鍕箺濠婂懎鍨濆┑鐘叉处閺呮繈鏌涚仦鍓р枔闁归攱妞藉铏规兜閸涱厺姹楅梺绋款儐閻╊垰鐣峰┑瀣妞ゆ梻鏅崢閬嶆⒑閻熸壆浠㈤悗姘煎櫍閹箖鎮界喊澶嬪婵炲牆鐏濆▍姗�鏌涚�ｎ亷宸ラ柣锝囧厴楠炴帒螖娴ｉ潻鎷烽悜鑺ュ�甸柣銏☆問閻掔偓顨ラ悙鑼缂佺粯绻堥幃浠嬫濞戞鍕冮梻浣规偠閸旀垵顭囪閹箖鎮滅粵瀣櫌闂佸憡娲﹂崢鑲╃矈閿曪拷閳规垶骞婇柛濠冩礋楠炲﹨绠涘☉娆忎簵濠电偞鍨惰彠闁跨喕濮ょ敮鎺楋綖濠靛鏁嗗ù锝堟閸橆剟姊婚崒娆戣窗闁告瑥閰ｅ畷褰掓焼瀹ュ懐鐤勯梺闈涱煭婵″洨寮ч敓浠嬫⒑閸涘﹥澶勯柛妯垮亹缁參鏁撻悩鏂ユ嫼闂佽崵鍠愬妯何ｆ繝姘厵闁惧浚鍋撻懓鎸庮殽閻愬澧抽柕鍥ㄥ姍楠炴帡骞橀崗鍛暰闂傚倷娴囬～澶愵敊閺嶎厼闂い鏇嫹鐎规洘鍨奸ˇ瑙勬叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣閻橀潧搴婂┑鐘垫暩閸嬫﹢宕犻悩璇茬闁绘娅曢妵婵嬫煛娴ｇ鏆ｇ�规洘甯掗埥澶娢熼崫鍕垫婵犵绱曢崑鎴﹀磹閺嶎厽鍋嬫俊銈呮噹缁�鍕喐閻楀牆绗掗柛姘秺閺岋繝宕堕妷銉т痪闂佺粯鎸婚悷褏妲愰幘瀛樺濠殿喗鍩堟禍顏勭暦閸涘﹦绡�闁告剬鍛暰闂備礁婀辩划顖滄暜閻愬瓨娅犻柨鏇炲�归悡娑㈡倶閻愰潧浜剧紒锟芥径宀�纾奸柣妯虹－濞插锟芥鍠楅幐鎶藉箖濞嗘挸绠涢柍杞扮婵洟姊洪棃娑欐悙閻庢碍婢橀锝夘敋閿熶粙寮幘瀵割浄閻庯綆浜為ˇ顔尖攽閻愬弶顥滄繛瀛樿壘椤洭寮介鐔哄弰闂婎偄娲﹂崙鐟邦焽閹邦噯鎷风憴鍕妞わ妇鏁诲濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牗鎱ㄩ弴銏♀拺缂備焦顭囩紓姘舵煕閵娿劍顥夋い顐㈢箰鐓ゆい蹇撴噹娴狀參姊洪崫鍕垫Ч閻庣瑳鍥舵晩闁跨喍绮欏缁樻媴閻戞ê娈岄梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}
		if (submittype == SubmitType.GUILD_ZONE_ITEM) {
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}

		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦悡鏇㈡煙鐎电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樺殮閻熼偊鐓ラ柨鐔剁矙瀹曪繝骞庨挊澶庢憰濠电偞鍨崹鍦不婵犳碍鍊甸梻鍫熺♁閸熺偤鏌涢敍鍗炲枤濞撳鏌曢崼婵囶棡缂佸矁娉曠槐鎺楃叓椤撶姷鐓撻梺璇″櫍缁犳牠寮幘缁樺亹鐎规洖娲ゆ慨娲⒒娴ｇ懓顕滄俊顐＄铻為柛鏇ㄥ灡閸庡﹥绻濇繝鍌滃闁抽攱甯掗妴鎺戭潩閻愵剙顏舵繝鐢靛仒閸栫娀宕堕妸銉ょ綍闂備胶纭堕崜婵嬪Φ閸屾埃妲堟俊顖炴敱椤秴鈹戦悙鍙夘棡闁告梹鐗犻幃闈涚暋闁附瀵岄梺闈涚墕濡绮幒妤佸�垫慨妯煎帶瀵噣鏌熼鍡欑瘈闁诡喒鏅犲畷褰掝敃閵忥紕锟介箖姊绘担铏瑰笡妞ゃ劌鎳橀幃褔宕卞▎鎴犵暥閻熸粍妫冨濠氭晲婢跺娅滈梺绯曞墲鑿уù鐘灲濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹璺虹暦濞差亝鏅搁柣妯垮皺閿涙粌鈹戦悩璇у伐閻庢凹鍓熷畷褰掓焼瀹ュ棛鍘介柟鍏肩暘閸╁嫰宕箛娑欑厱闁挎繂楠稿▍宥囷拷瑙勬礃婵炲﹪寮幇鏉垮窛妞ゆ牗绋掗鏇炩攽閻樼粯娑ч柛濠冩倐楠炲鏁撻悩鑼紱闂佸憡娲﹂崹閬嶆偂閺囩喓绡�闂傚牊绋掗ˉ婊勩亜韫囧﹥娅囩紒杈ㄥ浮閹晠顢欓悡搴☆潛闂備礁鐤囬～澶愬垂閸ф鏋佺�广儱顦粈瀣亜閹般劌澧叉繝顫嫹闂傚倸鍊烽懗鍫曗�﹂崼銉︽櫇闁靛鏅滈崑瀣煟濡鍤欑紒鐘崇墱閹茬顓奸崼顫胺闂傚倷绀侀幉锟犲礉閹达箑绀夌�广儱顦伴崐鐢告煙閹澘袚闁稿﹤鐏氶〃銉╂倷閼碱兛铏庨梺鍛婃⒐绾板秹濡甸崟顖涙櫆閻犲洩灏欐禒绋库攽椤旂》宸ユい顓犲厴閵嗕礁鈽夐姀鈥筹拷鐑芥倵閻㈡鐒炬鐐茬Ч濮婂宕掑顒婃嫹閹间礁纾归柟闂寸贰閺佸銇勯幘鍗炵仼缂侊拷婢跺矉鎷烽獮鍨姎妞わ缚鍗抽幃锟犳偄閸忚偐鍘甸梺璇″瀻鐏炶姤顔嶉梻浣烘嚀閸熻法锟芥凹鍙冩俊鐢稿礋椤栨鈺呮煥濠靛棙鍣瑰┑顕嗙畵濮婅櫣鎷犻垾铏亶闂佽崵鍟块弲鐘荤嵁婵犲洦鍋愭繛鑼帛閺呯偤姊洪崗鐓庡闁搞劑浜堕、鎾澄旈崨顔规嫽闂佺鏈悷锔剧矈閻楀牄浜滈柡鍥ф閹冲繐鐣烽崣澶夌箚闁靛牆鎳庨弳鏇㈡煟閹烘埊鏀荤紒缁樼洴瀹曞崬螣鐠囨煡鐎洪梻浣告惈閹冲繘骞冮崒鐐茶摕婵炴垶鐟х弧锟介梺鍛婃处閸嬪懘鎮甸垾鏂ユ斀闁绘劖褰冮幃鎴︽煕閺冿拷閻楁粓骞戦姀鐘婵☆垰绻愬﹢閬嶆晸閺傘倗绉甸柛瀣嚇閹潧顫濋鈺傛閹晠妫冨☉妤冩崟缂傚倷鑳剁划顖炴晝閵忕媭鍤曟い鎰剁畱缁犺崵绱撴担鑲℃垵鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?
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
						// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝囨嫚濞村顫嶅┑鈽嗗灦閺�閬嶅棘閿熶粙姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤掍礁寮块梺闈涚箞閸婃牠鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈滈柡宀�鍠栭幃鐑芥偋閸繃鐏庨柣搴㈩問閸犳牠鈥﹂悜钘夌畺闁靛繈鍊栭幆鐐烘煕閿旇寮跨紒杈ㄧ叀濮婄粯绗熼敓钘夘焽瑜忛幑銏ゅ箳閹炬潙寮块梺姹囧灩閹诧繝宕愰崼鏇熺厱妞ゆ劗濮撮崝婊堟煃闁垮鐏︾紒缁樼洴閹崇姵锛愬┑鍡橆唲婵°倗濮烽崑鐐恒�冮崱娑樜﹂柛鏇ㄥ灠鎯熼梺闈涱樈閸ㄧ敻宕ラ锔藉�垫繛鍫濈仢閺嬶附銇勯弴鍡楁祩閺佸洭鏌涜箛鏇炲付缂佸墎鍋涢埞鎴︽偐閹绘帩浠煎Δ鐘靛仦閸旀洟鍩為幋锔藉�烽柤鎼佹涧濞懷呯磽娴ｈ棄绱︾紒顔界懇閻涱喗寰勯幇顒備紜闂佸搫鍊堕崕鏌ユ倶娓氾拷閺岋綁鎮╅悜妯革拷鍐偣閿熶粙鏁冮敓浠嬪Υ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插�块弫鎾绘偩鐏炴儳娈岄梺瀹狀嚙缁夌懓顕ｉ锟藉畷濂告偄閸濆嫬绠ラ梻鍌欑閹诧繝宕归鐐茬９闁哄稁鍋撻幏宄邦潩閻愵剙顏�?
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

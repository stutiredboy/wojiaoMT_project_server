
package fire.pb.npc;

import fire.pb.PAddExpProc;
import fire.pb.activity.award.RewardMgr;
import fire.pb.activity.clanfight.ActivityClanFightManager;
import fire.pb.activity.timernpc.TimerNpcService;
import fire.pb.clan.ClanUtils;
import fire.pb.instancezone.InstanceZone;
import fire.pb.instancezone.InstanceZoneFactory;
import fire.pb.instancezone.conf.InstanceZoneConfig;
import fire.pb.instancezone.faction.FactionInstZone;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;
import fire.pb.talk.MessageMgr;
import fire.pb.util.DateValidate;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COpenChest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COpenChest extends __COpenChest__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		final fire.pb.map.Role role = fire.pb.map.RoleManager.getInstance().getRoleByID(roleId);
		if (null == role)
			return;
		
		InstanceZone instzone = InstanceZoneFactory.getRoleCurInstanceZone(roleId, true);
		if (instzone != null) {
			InstanceZoneConfig zoneconfig = fire.pb.instancezone.Module.getInstance().getInstanceZoneConfigs().get(instzone.getInstZoneId());
			if (zoneconfig != null) {
				long now = System.currentTimeMillis();
				if (zoneconfig.inEnterTime(now)) {
					new mkdb.Procedure() {
						protected boolean process() throws Exception {
							InstanceZone instzone = InstanceZoneFactory.getRoleCurInstanceZone(roleId, false);
							if (instzone instanceof FactionInstZone) {
								return ((FactionInstZone) instzone).openChest(roleId, chestnpckey);
							}

							return false;
						};
					}.submit();
					
					return;
				}
			}
			
			return;
		}

		if (!fire.pb.map.SceneNpcManager.checkDistance(chestnpckey, roleId))
			return;
		
		new mkdb.Procedure() {

			@Override
			protected boolean process() throws Exception {
				Npc npc = SceneNpcManager.getNpcByKey(chestnpckey);
				if (npc == null)
					return false;
				
				SBaoxiang chestcfg = ChestManager.getInstance().getChestConfig(npc.getNpcID());
				if (chestcfg == null)
					return false;
				
//////////////////////////////////////////////
				//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊閵娧呭骄闂佸壊鍋呯缓楣冨几瀹ュ鐓涢柛銉㈡櫅瀛濋梺鎼炲妽缁诲嫰鏁撻悾灞绢仧闁归鍏橀弻娑㈠即閵娿儰绨煎┑鈥虫▕閸撶喎顫忓ú顏勫窛濠电姴鍟ˇ鈺呮⒑閹肩偛濮傚ù婊嗘硾閻ｇ兘鎮介崨濠冩婵炲濮撮鍡涘煕閹达附鐓曟繛鎴烇公濮婃绱掗崼鏇氭喚闁哄本鐩幃鈺佺暦閸パ�鎷伴柣鐘辫閸ㄥ爼寮诲☉妯锋婵☆垰鍚嬮幉濂告⒑缂佹ɑ灏靛┑鐑囨嫹闂佽鍠楅〃濠傜暦閻戠瓔鏁囬柣鎰姂閸ㄥ骞冮纰辨僵闁煎摜鏁搁崢浠嬫煙閸忓吋鍎楅柛銊ョ－閿熶粙娼ч妶鎼佸蓟閿濆绠抽柣鎰▕濞差厾绱撻崒姘拷褰掑箰閼姐倗鐭夐柟鐑樻閹风兘鏁愭惔婵堢泿闂佸摜鍋戦崝鎴﹀箖瀹勯偊鐓ラ柛鎰碉拷顖樺灲閺岋綁鈥﹂幒鎾愁伓 by changhao
				Long clanfightid = xtable.Roleid2clanfightid.select(roleId);
				if (clanfightid != null && npc.getNpcID() == ActivityClanFightManager.VICTORY_BOX)
				{
					fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(clanfightid, true);
					if (bf != null)
					{
						if (!bf.getClanfightBean().getEnterroleids().containsKey(roleId))
						{
							return false;
						}
						
						boolean ok = bf.IsWinnerSide(roleId, true);
						if (ok == true)
						{
							mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightOpenChest(clanfightid, roleId, chestnpckey));
							return true;
						}
					}
					
					return false;
				}
				
				xbean.Properties prop = xtable.Properties.select(roleId);
				if (prop == null)
				{
					return false;
				}
				
				int mapid = role.getMapId();
				if (mapid == ClanUtils.MAPID && npc.getNpcID() == ActivityClanFightManager.CELEBRATE_BOX) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο鍝勬倯缂佸倹甯℃慨锟介柕鍫濇閹锋椽鏌ｆ惔鈩冭础濠殿喚鏁绘俊鎾礃椤忓棛锛滈柣鐘辩濠�杈╁姬閿熶粙鎮楃憴鍕闁搞劌鐖煎顐﹀箻鐎靛壊娴勯柣搴秵閸嬶拷闁归攱妞藉濠氬磼濮樺崬顣甸梺鍝勬噽閸嬬喓鍒掗崼顫嫹閿濆骸鏋熼柣鎾存礋閺岋繝宕掑┑鍥┿�婇梺缁樺笒閹芥粓鏁撻崐鐕佹綈婵炴祴鏅濈槐鐐存媴閸撴彃娈ㄩ梺鍦檸閸犳宕戦崟顐熸斀闁稿本鍑瑰Σ鍛婄箾閸繂鎮戠紒缁樼箓閳绘捇宕归鐣屼憾闂備焦瀵уú蹇涘垂閸婄喓鐔呴梻浣侯焾閻ジ宕戝☉妯炑囧矗婢跺瞼顔曢梺绯曞墲钃遍悘蹇庡嵆閺岋綁骞樼�涙顦伴梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�? by changhao
				{
					xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleId, true);
					if (clanInfo == null)
					{
						return false;
					}
						
					long clanid = clanInfo.getKey();
					xbean.EClanfightids ids = xtable.Clanid2clanfightids.select(clanid);
					for (Long i : ids.getIds())
					{
						fire.pb.clan.fight.ClanFightBattleField bf = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(i, true);
						if (bf != null)
						{
							long day1 = 24 * 60 * 60 * 1000;
							long cur = System.currentTimeMillis();
							long t = bf.getClanfightBean().getDatetime() + day1;
							
							if(DateValidate.inTheSameDay(t, cur))
							{
								if (!bf.getClanfightBean().getEnterroleids().containsKey(roleId))
								{
									MessageMgr.sendMsgNotify(roleId, 410050, null); //濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棞缂佽翰鍊濋弻鐔虹矙閸噮鍔夐梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê鍟块弳鍫ユ⒑缁嬪潡顎楁い锔炬暬瀵鈽夊Ο閿嬵潔濠电偛妫欓崝妤冪矙閸ヮ剚鐓熼幖娣灱婢规ɑ銇勯敂璇茬仸闁炽儻濡囬幑鍕Ω閿曪拷绾绢垶姊虹紒妯虹仸閽冭京锟借娲樻繛濠傤潖濞差亝顥堟繛鎴炶壘閳峰牓姊虹粙娆惧剰闁挎洦浜滈锝嗙節濮橆剛浼嬮梺褰掝暒缁�渚�骞冮幋锔解拺闁告稑锕ｇ欢閬嶆煕濡湱鐭欑�规洘鍔欓、娑㈡倷鐎电骞楅梺鐟板悑閹矂宕瑰畷鍥╃煋闁割偅娲橀悡娆忣渻鐎ｎ亪顎楅柛妯虹摠閹便劍绻濋崘鈹夸虎濠碘槅鍋勯崯鎾春閿熺姴纾兼慨姗�妫跨槐锟�? by changhao	
									return false;
								}
								
								boolean ok = bf.IsWinnerSide(roleId, true);
								if (ok == true)
								{
									mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightOpenChest(bf.getClanfightBean().getClanfightid(), roleId, chestnpckey));
									return true;
								}
								
								MessageMgr.sendMsgNotify(roleId, 410050, null); //濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棞缂佽翰鍊濋弻鐔虹矙閸噮鍔夐梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê鍟块弳鍫ユ⒑缁嬪潡顎楁い锔炬暬瀵鈽夊Ο閿嬵潔濠电偛妫欓崝妤冪矙閸ヮ剚鐓熼幖娣灱婢规ɑ銇勯敂璇茬仸闁炽儻濡囬幑鍕Ω閿曪拷绾绢垶姊虹紒妯虹仸閽冭京锟借娲樻繛濠傤潖濞差亝顥堟繛鎴炶壘閳峰牓姊虹粙娆惧剰闁挎洦浜滈锝嗙節濮橆剛浼嬮梺褰掝暒缁�渚�骞冮幋锔解拺闁告稑锕ｇ欢閬嶆煕濡湱鐭欑�规洘鍔欓、娑㈡倷鐎电骞楅梺鐟板悑閹矂宕瑰畷鍥╃煋闁割偅娲橀悡娆忣渻鐎ｎ亪顎楅柛妯虹摠閹便劍绻濋崘鈹夸虎濠碘槅鍋勯崯鎾春閿熺姴纾兼慨姗�妫跨槐锟�? by changhao	
								return false;
							}
						}
					}
					
					MessageMgr.sendMsgNotify(roleId, 410050, null); //濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棞缂佽翰鍊濋弻鐔虹矙閸噮鍔夐梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê鍟块弳鍫ユ⒑缁嬪潡顎楁い锔炬暬瀵鈽夊Ο閿嬵潔濠电偛妫欓崝妤冪矙閸ヮ剚鐓熼幖娣灱婢规ɑ銇勯敂璇茬仸闁炽儻濡囬幑鍕Ω閿曪拷绾绢垶姊虹紒妯虹仸閽冭京锟借娲樻繛濠傤潖濞差亝顥堟繛鎴炶壘閳峰牓姊虹粙娆惧剰闁挎洦浜滈锝嗙節濮橆剛浼嬮梺褰掝暒缁�渚�骞冮幋锔解拺闁告稑锕ｇ欢閬嶆煕濡湱鐭欑�规洘鍔欓、娑㈡倷鐎电骞楅梺鐟板悑閹矂宕瑰畷鍥╃煋闁割偅娲橀悡娆忣渻鐎ｎ亪顎楅柛妯虹摠閹便劍绻濋崘鈹夸虎濠碘槅鍋勯崯鎾春閿熺姴纾兼慨姗�妫跨槐锟�? by changhao	
					return false;
				}					
/////////////////////////////////////////////
				
				int biaoId = TimerNpcService.getInstance().getEventId(npc.getNpcID());
				
				int opentimes = chestcfg.getOpentimes();
				
				final long currentTime = System.currentTimeMillis();
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleId);
				if (null != team && team.isTeamLeader(roleId) && chestcfg.getOpenteam() == 1) {
					// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺冪焼濠㈣埖鍔栭悡娆撴倵濞戞鎴﹀磿閺囥垺鐓ユ繝闈涙－濡插綊鏌￠崨顔剧疄闁哄被鍔戦幃銏ゅ礈娴ｈ櫣鍘梻浣瑰缁诲嫰宕戦妶鍡樺弿闁跨喍绮欓弻鏇㈠醇濠靛浂妫″┑鐐叉噺缁挸顫忓ú顏勫窛濠电姳鑳剁换渚�姊洪幖鐐插闁告濞婇獮鍐晸閻樿尙顓洪梺鎸庢琚欓柟鐤缁辨捇宕掑▎鎴濆闂佹寧娲嶉弲鐘诲箖閻愭番鍋呴柛鎰ㄦ櫇閸橀亶姊洪崘鍙夋儓妞ゆ垵妫涢敓鑺ョ啲閹凤拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜椤ㄥ懐绮婚悩缁樼厵闁告挆鍛闂佺锕ら悥濂稿蓟濞戙垹唯妞ゆ梻鍘ч～顏堟⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛灲濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�
					final java.util.List<Long> members = team.getNormalMemberIds();
					this.lock(xtable.Locks.ROLELOCK, members);
					
					{
						xbean.BaoXiangInfo baoxiangInfo = xtable.Rolekaibaoxiang.select(roleId);
						if (baoxiangInfo != null) {
							if (DateValidate.inTheSameDay(baoxiangInfo.getLastopentime(), currentTime)) {
									if (baoxiangInfo.getOpentimes() >= opentimes) {
										MessageMgr.psendMsgNotifyWhileRollback(roleId, 166004, null);
										return false;
									}
							}	
						}
						int rolelevel = xtable.Properties.selectLevel(roleId);
						if (chestcfg.openlevel > rolelevel) {
							//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇㈩敍閻愯尙顦柟鍏肩暘閸斿矂鎮″┑瀣厸闁告劑鍔屾禍浼存煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經闂傚倷鑳剁划顖炪�冮崨顓囨稑鈹戦崱娆愭婵炴潙鍚嬪娆撳础閹惰姤鐓忛煫鍥ュ劤绾惧潡鏌涘Ο鍦煓婵﹥妞藉Λ鍐ㄢ槈鏉堚晛濮奸梻浣侯焾闁帮絾绂嶉崼鏇橈拷渚�寮崼顐ｆ櫆闂佺硶鍓濋敋闁哄鍨舵穱濠囶敃閿旂粯娈ュ┑鐐存綑濞差厼鐣峰Δ锟介悾婵嬫晸閻ｅ本顫曢柟鐑橆殢閺佸鏌涢埄鍏狀亪顢旈敓锟�?
							MessageMgr.sendMsgNotify(roleId, 166139, null);
							return false;
						}
					}
					
					for (Long rid : members) {
						xbean.BaoXiangInfo baoxiangInfo = xtable.Rolekaibaoxiang.get(rid);
						if (baoxiangInfo == null) {
							baoxiangInfo = xbean.Pod.newBaoXiangInfo();
							xtable.Rolekaibaoxiang.insert(rid, baoxiangInfo);
						}
						if (!DateValidate.inTheSameDay(baoxiangInfo.getLastopentime(), currentTime)) {
							baoxiangInfo.setOpentimes(0);
						}
						
						if (baoxiangInfo.getOpentimes() >= opentimes) {
							MessageMgr.psendMsgNotify(rid, 166003, null);
							continue;
						}
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柨鐔哄У閻撳繘鏌涢锝囩畺缂佸苯鐏濋埞鎴︻敊閽樺鏋欓梺鍝勮閸斿矂鍩為幋锕�骞㈡慨妤�妫欓敓銉╂⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹
						RewardMgr.getInstance().distributeAllAward(rid,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺绋款儏椤戝棛鎹㈠┑鍥╃瘈闁稿本绮岄。娲⒑濮瑰洤锟芥宕戦幘璇参﹂柛鏇ㄥ灠缁犳盯鏌嶆潪鎵瓘闁归鏌夐ˇ瑙勵殽閻愯尙绠叉い锔惧閹棃濮�閻樺磭锟筋參姊绘担鍛婂暈婵炶绠撳畷銏°偅閸愨晛浠奸梺缁樻尭鐎垫帒銆掓繝姘厪闁割偅绻冮ˉ鐐淬亜閵夛妇澧甸柡宀�鍠栧畷娆撳Χ閸℃浼�");
						
						baoxiangInfo.setOpentimes(baoxiangInfo.getOpentimes() + 1);
						baoxiangInfo.setLastopentime(currentTime);
					}
				}
				else {
					int rolelevel = xtable.Properties.selectLevel(roleId);
					if (chestcfg.openlevel > rolelevel) {
						//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇㈩敍閻愯尙顦柟鍏肩暘閸斿矂鎮″┑瀣厸闁告劑鍔屾禍浼存煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經闂傚倷鑳剁划顖炪�冮崨顓囨稑鈹戦崱娆愭婵炴潙鍚嬪娆撳础閹惰姤鐓忛煫鍥ュ劤绾惧潡鏌涘Ο鍦煓婵﹥妞藉Λ鍐ㄢ槈鏉堚晛濮奸梻浣侯焾闁帮絾绂嶉崼鏇橈拷渚�寮崼顐ｆ櫆闂佺硶鍓濋敋闁哄鍨舵穱濠囶敃閿旂粯娈ュ┑鐐存綑濞差厼鐣峰Δ锟介悾婵嬫晸閻ｅ本顫曢柟鐑橆殢閺佸鏌涢埄鍏狀亪顢旈敓锟�?
						MessageMgr.sendMsgNotify(roleId, 166139, null);
						return false;
					}
					
					if (npc.getNpcID() == 300002) {
						xbean.BestowNpcInfo npcInfo = xtable.Bestownpc.get(chestnpckey);
						if (npcInfo == null)
							return false;
						
						xbean.RoleBestowInfo bestowInfo = xtable.Rolebestow.get(roleId);
						if (bestowInfo == null) {
							bestowInfo = xbean.Pod.newRoleBestowInfo();
							xtable.Rolebestow.insert(roleId, bestowInfo);
						}
						
						long npcRoleId = npcInfo.getRoleid();
						xbean.RoleBestowCount bestowCount = bestowInfo.getRolebestowinfo().get(npcInfo.getRoleid());
						if (bestowCount == null) {
							bestowCount = xbean.Pod.newRoleBestowCount();
							bestowInfo.getRolebestowinfo().put(npcRoleId, bestowCount);
						}
						if (bestowCount.getOpentimes() >= opentimes) {
							MessageMgr.psendMsgNotifyWhileRollback(roleId, chestcfg.getOpenovermsg(), null);
							return false;
						}
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柨鐔哄У閻撳繘鏌涢锝囩畺缂佸苯鐏濋埞鎴︻敊閽樺鏋欓梺鍝勮閸斿矂鍩為幋锕�骞㈡慨妤�妫欓敓銉╂⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹
						RewardMgr.getInstance().distributeAllAward(roleId,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺绋款儏椤戝棛鎹㈠┑鍥╃瘈闁稿本绮岄。娲⒑濮瑰洤锟芥宕戦幘璇参﹂柛鏇ㄥ灠缁犳盯鏌嶆潪鎵瓘闁归鏌夐ˇ瑙勵殽閻愯尙绠叉い锔惧閹棃濮�閻樺磭锟筋參姊绘担鍛婂暈婵炶绠撳畷銏°偅閸愨晛浠奸梺缁樻尭鐎垫帒銆掓繝姘厪闁割偅绻冮ˉ鐐淬亜閵夛妇澧甸柡宀�鍠栧畷娆撳Χ閸℃浼�");
						
						bestowCount.setOpentimes(bestowCount.getOpentimes() + 1);
					
					}
					else {
						xbean.BaoXiangInfo baoxiangInfo = xtable.Rolekaibaoxiang.get(roleId);
						if (baoxiangInfo == null) {
							baoxiangInfo = xbean.Pod.newBaoXiangInfo();
							xtable.Rolekaibaoxiang.insert(roleId, baoxiangInfo);
						}
						
						if (!DateValidate.inTheSameDay(baoxiangInfo.getLastopentime(), currentTime)) {
							baoxiangInfo.setOpentimes(0);
						}
						
						if (baoxiangInfo.getOpentimes() >= opentimes) {
							MessageMgr.psendMsgNotifyWhileRollback(roleId, chestcfg.getOpenovermsg(), null);
							return false;
						}
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柨鐔哄У閻撳繘鏌涢锝囩畺缂佸苯鐏濋埞鎴︻敊閽樺鏋欓梺鍝勮閸斿矂鍩為幋锕�骞㈡慨妤�妫欓敓銉╂⒒閸屾艾锟藉摜锟芥凹鍓涢敓鑺ョ煯閸楀啿顕ｆ繝姘伋鐎规洖娲﹀▓鐓庮渻閵堝棙鈷掗柛妯犲洤鏋佹い蹇撶墛閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹
						RewardMgr.getInstance().distributeAllAward(roleId,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺绋款儏椤戝棛鎹㈠┑鍥╃瘈闁稿本绮岄。娲⒑濮瑰洤锟芥宕戦幘璇参﹂柛鏇ㄥ灠缁犳盯鏌嶆潪鎵瓘闁归鏌夐ˇ瑙勵殽閻愯尙绠叉い锔惧閹棃濮�閻樺磭锟筋參姊绘担鍛婂暈婵炶绠撳畷銏°偅閸愨晛浠奸梺缁樻尭鐎垫帒銆掓繝姘厪闁割偅绻冮ˉ鐐淬亜閵夛妇澧甸柡宀�鍠栧畷娆撳Χ閸℃浼�");
						
						baoxiangInfo.setOpentimes(baoxiangInfo.getOpentimes() + 1);
						baoxiangInfo.setLastopentime(currentTime);
					}
				}
				
				TimerNpcService.getInstance().removeEventNpc(biaoId, chestnpckey);
				return true;
			}
			
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795522;

	public int getType() {
		return 795522;
	}

	public long chestnpckey; // 宝箱的npckey

	public COpenChest() {
	}

	public COpenChest(long _chestnpckey_) {
		this.chestnpckey = _chestnpckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(chestnpckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		chestnpckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COpenChest) {
			COpenChest _o_ = (COpenChest)_o1_;
			if (chestnpckey != _o_.chestnpckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)chestnpckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(chestnpckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(COpenChest _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(chestnpckey - _o_.chestnpckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


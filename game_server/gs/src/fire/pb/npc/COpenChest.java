
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘⒑闂堟丹娑㈠川椤撱垻宕曢梻鍌氬�风粈浣圭珶婵犲洤纾婚柛娑卞灣缁憋箑螖閿濆懎鏆欓柛鎴犲Х閿熻棄绠嶉崕閬嵥囨导瀛樺亗婵炴垯鍨洪悡鏇㈡煏婢跺牆鐏繛鍛噽閿熻姤绋掔换鍫濐潖濞差亜绠归柣鎰絻椤绱撴担绛嬪殭閻庢矮鍗冲顐﹀箻缂佹ê浠奸柣蹇曞仧閾忓孩绂掕濮婇缚銇愰幒婵囶棖闂佺绻戦敃銏狀嚕鐠囨祴妲堥柕蹇曞Т瀹撳棝姊洪棃娑辩劸闁稿孩澹嗛懞閬嶆偂鎼存ɑ鏂�闂佺偨鍎村▍鏇㈠煝閺囥垺鐓曢柟鎹愭硾閺嬪孩銇勯銏㈢閻撱倖銇勮箛鎾愁仼缂佹劖绋掔换婵嬫偨闂堟刀銏ゆ煕閻曚礁浜伴挊婵嬫煃閸濆嫭鍣洪柍閿嬪灴閺岀喖鎳栭埡浣风捕婵犳鍠栭崐鎼佹箒濠电姴锕ゅΛ娆戞兜妤ｅ啯鐓熼柨婵嗘搐閸樻挳鏌熼鑽ょ煓鐎规洏鍔嶇换婵嬪礃閳哄﹣鎴峰┑鐘垫暩閸嬫盯顢氶鐔稿弿闁圭虎鍣弫鍕煕閳╁啰鈽夐柣鎾存礋閺岀喐娼忔ィ鍐╊�嶉梺缁樻尰濞叉鎹㈠☉銏犵闁绘垵娲ら崣鏇炩攽椤旂》鏀绘い銊ョ墢濡叉劙骞掑Δ锟介柋鍥煛閸ャ劎顣查柛鐘冲哺濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹鍫曠嵁閸愵喖鐓涘ù锝囧劋濞堥箖姊洪幖鐐插妧闁跨喍绮欓獮蹇斿鐎涙鍘介梺缁橆焾缁箖顢楅悢鍏肩厱闁靛鍎抽崺锝囷拷娈垮枦椤曆囧煡婢跺á鐔兼煥鐎ｅ灚缍屽┑鐘殿暯濡插懘宕规导鏉戣Е閻庯綆鍠栫粻鐔封攽閸屾碍鍟為柍閿嬪灩缁辨挻鎷呴懖鈩冨灩娴滄悂妫冨☉鎺撴杸闂佺粯鍨靛ú锔撅拷姘秺濮婄粯鎷呯粵瀣異闂佸摜濮甸〃濠囧Υ閸愨晝绡�闁稿本绮嶅▓楣冩⒑缂佹ê鐏╅柣鈩冩瀵偊宕堕浣哄幗闂佸綊鍋婇崢鍏兼叏閸岀偞鐓曢柕濞垮労閻撳吋顨ラ悙鎻掓殻妞ゃ垺鐟ч崰濠冩綇閵娿儱鍘為梻鍌欒兌閸樠囧箺濠婂牆鏋侀柟闂寸閸屻劌霉閻樺樊鍎愰柣鎾寸懇閺屾稖绠涢幘铏�梺绋垮椤ㄥ﹪寮诲☉銏犖╅柕澹秶绀婇梻浣芥硶閸犲秶鍒掑▎蹇ｇ劷鐟滄梹淇婇崼鏇炵濞达絾鐡曢幗鏇㈡⒑閹稿海绠撴い锔诲灣缁骞庨懞銉у幗闂佸綊鍋婇崜姘跺煝閺囩喓绠剧�瑰壊鍠栭獮妯肩磼鏉堛劍宕岀�规洘甯掗～婵嬵敆婵犲啫顏堕悷婊呭鐢帞绮绘导瀛樼厾濠殿喗鍔曢敓鑺ヮ殜閹本寰勯幇顓犲幍闂佺粯鍨惰摫妞ゃ儲鐗犻弻鐔割槹鎼粹�冲箣闂佽桨鐒﹂崝鏍箚閺傚簱鏀介柛顐犲灪閺呫劑姊婚崒娆戭槮闁硅姤绮撳畷鎴﹀箣閿曪拷缁�澶愭煙鏉堝墽鐣辩紒鐘崇墱閿熺晫鎳撶�氫即宕戞繝鍥ㄥ亗闁靛鏅滈悡鏇㈡煙閹殿噮鏆滈柟椋庡厴椤㈡稑螣閾忛�涚礄闂備礁鎼惌澶岀礊娓氾拷閸ㄩ箖鏁冮崒姘鳖唺闂佸湱鍋撻崜姘閿燂拷 by changhao
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
				if (mapid == ClanUtils.MAPID && npc.getNpcID() == ActivityClanFightManager.CELEBRATE_BOX) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垶顭傞悢鐓庝紶闁告洦鍓欓敓绛嬪灣缁辨挻鎷呯粙鍖℃嫹閸︻厽鏆滈柍鈺佸暞閸欏繘鏌ㄩ悢鍓佺煓闁哄本娲熷畷鐓庘攽閸ヨ埖顥旈梻浣哥秺閺�鍗烆渻娴犲钃熼柨婵嗘閸庣喖鏌嶉埡浣告殺缁绢叏鎷锋繝鐢靛У椤旀牠宕板璺烘瀬缂備焦眉缁诲棝鏌熺紒銏犳灈缂侊拷閸愨斂浜滈煫鍥ㄦ尰椤ョ娀鏌ㄥ☉娆戠煉闁哄矉缍侀幃鈺傛綇閳哄﹥袦婵犵數濯撮幏鐑藉级閸碍娅呭┑顕呭墴閺屻劑鎮㈤崜浣虹厯闂佽鍠楅〃鍫ュ箟閹绢喖绀嬫い鎺炴嫹妞わ腹鏅犲娲箹閻愭彃顬堥梺缁樼墱閸樠囶敋閿濆鏁冮柨鏇嫹缂佺姴顭烽幃妤呮濞戞﹩妫屽┑鐐存綑鐎氫即寮婚敐鍡樺劅妞ゆ牗绮庢牎闂備胶顭堥鎴﹀箯閻戣姤鈷戠憸鐗堝笚閺佽鲸淇婇悙鑸殿棄妞ゎ偄绻戠换婵嗩潩椤掑偊绱叉繝娈垮枟閿氱�规洦鍓熼妴鍌炴偨閸涘ň鎷洪梺鍛婄箓鐎氼參宕虫禒瀣厱閻庯綆鍓欓弸鏃堟煕閹烘挸娴�规洖銈搁敐鐐侯敊閽樺浼撻梻浣瑰缁诲倹顨ラ幖浣稿嚑闁绘柨鍚嬮悡鐔兼煙閹呮憼缂侊拷鐎ｎ喗鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礃鐢帡鍩為幋锕�鐐婇柍鐟板皡閹烽攱绻濋崶銊㈡嫼缂傚倷鐒﹂敋缂佹甯￠弻鐔兼嚍閵壯呯厜闂佽桨鐒﹂幑鍥х暦閹扮増鍋嗗ù锝呮贡缁夐攱绻濋悽闈涗沪缂佷焦鎸冲鎻掆攽閸噥娼熼梺缁樺姇閻°劍鍒婇幘顔界厱闁圭偓娼欑徊缁樼箾閸稑濮傛慨濠冩そ瀹曠兘顢橀埄鍐撅拷妤呮⒑閸濄儱校妞ゃ劌锕ら悾鐑藉箣閿曪拷缁�瀣亜閹邦喖鏋戦柡鍌︽嫹闂傚倷鑳堕…鍫ュ嫉椤掑嫬绀勯柣鐔稿珗閿濆宸濆┑鐘插椤旀洟姊洪崜鎻掍簼缂佽鍊块獮鍐箣閻樼數锛滅紓鍌欑劍椤洨绮婚幘缁樼厓缂備焦蓱瀹曞瞼锟借娲栫紞濠囥�佸▎鎾村仼閻忕偛鍚嬮崰姘舵⒒閸屾艾锟界兘鎮為敂鎾呮嫹缁楁稑鍘炬ウ璺ㄧ杸婵炴垶锚閻庮參姊虹粙鍖″姛闁哥姵鎹囬幃銏ゅ川鐎涙ǚ鎷绘繛杈剧导鐠�锕傛倿妤ｅ啯鐓熸い鎺炴嫹闁靛牏顭堥悾鐑藉箣濠靛啯顫嶅┑鈽嗗灣閸婎垶宕惰閻撴垶绻濋姀锝嗙【闁活剙銈搁、娆撳即閵忊檧鎷虹紓渚囧灡濞叉牗鏅堕弻銉﹀珔闂侇剙绉甸崐鍫曠叓閸パ囶�楃�规挸妫濋弻鈥崇暆鐎ｎ剛袦濡ょ姷鍋為…鍥晸閼恒儳鈾佹い顓炴喘钘濆ù鐓庣摠閳锋垿鏌涘┑鍡楊伂妞ゎ偓绠撻弻娑㈠籍閿熶粙宕归崸妤冨祦闁告劦鍠栧洿婵犮垼娉涢敃锕傛晬濠婂啠鏀介柣鎰綑閻忥箓鏌ㄩ弴妤佹珕閻庨潧銈搁弫鎾绘晸閿燂拷? by changhao
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
									MessageMgr.sendMsgNotify(roleId, 410050, null); //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啰绠炵�殿喖顭烽幃銏ゆ惞閸︻厾鍘梻浣稿閻撳牓宕抽锟藉畷婵囧緞閹邦厸鎷洪梺鍛婄☉閿曪箓骞婇崘顏嗙＜缂備焦锕懓璺拷娈垮枛椤兘寮幇顓炵窞濠电姴瀛╃紞鍌炴⒒娴ｈ櫣甯涢柨姘舵煕閻旈攱鍋ョ�殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝懎顭囬敓鐙�鏁佹俊銈勯檷娴滄粓鏌ㄩ弮鍌氫壕闁哄棭鍓涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勬繛銏㈠枛閺屻劎锟斤絽鐏氱紞灞解攽閻樺灚鏆╅柛瀣☉铻炴繛鍡樻尭缁�澶嬩繆閵堝懎鏆熼柣顓熺懇閺屾盯濡烽鐓庮潽闂佺粯鎸鹃崰鏍嵁閺嶎灔搴敆閿熶粙鎮橀崡鐑嗙唵閻熸瑥濯堕幋锕�桅闁告洦鍨遍弲婊堟偣閸ヮ亜鐨哄ù鐘虫倐濮婃椽鎮欓挊澶婂Х婵犵锟借櫕鍠樻鐐村灴瀹曠喖顢涘В灏栨櫊閺屻劑寮撮鍛伓缂備礁澧介搹搴ㄥ垂鐠轰警娼栭柧蹇撴贡绾惧吋淇婇婵囶仩濞寸姵鎮傞弻锕傚礃椤撴繂鎯堥梺璺ㄥ枎閿熺晫鍣ュ鎰箾閸欏＃鎴犳崲濞戞瑧绡�闁稿被鍊栫紞搴♀攽閻愬弶鈻曞ù婊勭箞钘熼柛顐ゅ枔缁犻箖鏌熺�电浠╁瑙勶耿閺屽秴鐣￠幍顔尖叺濠殿喖锕ㄥ▍锝囧垝濞嗗繆鏋庨柟顖嗗啫顥嶉梻鍌欑劍鐎笛兠洪敂鐣岊洸婵犲﹤鐗滈弫瀣煥濠靛棙顥犵紒鈽呮嫹婵犳鍠楅敃鈺呭礈濞戞瑥顕遍悗锝庡枟閳锋垹鎲搁悧鍫濅刊闁哄棙甯炵槐鎺楁晸閼恒儳鐟归柨鐔剁矙閻涱噣宕橀鑲╊吅闂佹寧妫佽闁归攱妞藉娲川婵犲嫧妲堥梺鎸庢穿缁插灝鈻庨姀銈嗙劶鐎广儱妫涢崢鍗炩攽閳藉棗鐏犳繝锟介柆宥嗗剹婵炲棙鍩婇幏椋庢喆閸曨剛顦ㄩ梺鍛婃⒐閻熲晠濡存担绯曟闁靛繆锟界鎷烽悜鑺ュ�甸柣銏☆問閻掔偓顨ラ悙鎼疁婵﹥妞介幃鐑藉级閹稿骸锟筋垶姊虹拠鈥崇仩闁活厼鍊搁悾鐑芥偡閹殿喗娈鹃梺鎼炲劗閺呮繈鎮＄�ｎ喗鈷戦柛鎾村絻娴滄繃绻涢崣澶涜�块柟顔癸拷鏂ユ瀻闊浄绲剧�靛矂鏌ｆ惔顖滅У濞存粠浜、鎾澄旈崨顔惧幈濠碘槅鍨靛▍锝夊箺閻樼粯鐓欏〒姘仢婵＄晫绱掔紒妯肩疄鐎规洘锕㈤崺鐐村緞濮濆本顎楁繝鐢靛Х椤ｈ棄危閸涙潙纾婚柛鏇ㄥ灠閻ゎ噣鏌熺紒銏犳灈闁哄嫨鍎甸弻銊╂偄閸濆嫅銏㈢棯閹冩倯闁逛究鍔岄～婊堟晸閽樺）娑氭崉閵婏富娼熼梺璺ㄥ櫐閹凤拷? by changhao	
									return false;
								}
								
								boolean ok = bf.IsWinnerSide(roleId, true);
								if (ok == true)
								{
									mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightOpenChest(bf.getClanfightBean().getClanfightid(), roleId, chestnpckey));
									return true;
								}
								
								MessageMgr.sendMsgNotify(roleId, 410050, null); //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啰绠炵�殿喖顭烽幃銏ゆ惞閸︻厾鍘梻浣稿閻撳牓宕抽锟藉畷婵囧緞閹邦厸鎷洪梺鍛婄☉閿曪箓骞婇崘顏嗙＜缂備焦锕懓璺拷娈垮枛椤兘寮幇顓炵窞濠电姴瀛╃紞鍌炴⒒娴ｈ櫣甯涢柨姘舵煕閻旈攱鍋ョ�殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝懎顭囬敓鐙�鏁佹俊銈勯檷娴滄粓鏌ㄩ弮鍌氫壕闁哄棭鍓涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勬繛銏㈠枛閺屻劎锟斤絽鐏氱紞灞解攽閻樺灚鏆╅柛瀣☉铻炴繛鍡樻尭缁�澶嬩繆閵堝懎鏆熼柣顓熺懇閺屾盯濡烽鐓庮潽闂佺粯鎸鹃崰鏍嵁閺嶎灔搴敆閿熶粙鎮橀崡鐑嗙唵閻熸瑥濯堕幋锕�桅闁告洦鍨遍弲婊堟偣閸ヮ亜鐨哄ù鐘虫倐濮婃椽鎮欓挊澶婂Х婵犵锟借櫕鍠樻鐐村灴瀹曠喖顢涘В灏栨櫊閺屻劑寮撮鍛伓缂備礁澧介搹搴ㄥ垂鐠轰警娼栭柧蹇撴贡绾惧吋淇婇婵囶仩濞寸姵鎮傞弻锕傚礃椤撴繂鎯堥梺璺ㄥ枎閿熺晫鍣ュ鎰箾閸欏＃鎴犳崲濞戞瑧绡�闁稿被鍊栫紞搴♀攽閻愬弶鈻曞ù婊勭箞钘熼柛顐ゅ枔缁犻箖鏌熺�电浠╁瑙勶耿閺屽秴鐣￠幍顔尖叺濠殿喖锕ㄥ▍锝囧垝濞嗗繆鏋庨柟顖嗗啫顥嶉梻鍌欑劍鐎笛兠洪敂鐣岊洸婵犲﹤鐗滈弫瀣煥濠靛棙顥犵紒鈽呮嫹婵犳鍠楅敃鈺呭礈濞戞瑥顕遍悗锝庡枟閳锋垹鎲搁悧鍫濅刊闁哄棙甯炵槐鎺楁晸閼恒儳鐟归柨鐔剁矙閻涱噣宕橀鑲╊吅闂佹寧妫佽闁归攱妞藉娲川婵犲嫧妲堥梺鎸庢穿缁插灝鈻庨姀銈嗙劶鐎广儱妫涢崢鍗炩攽閳藉棗鐏犳繝锟介柆宥嗗剹婵炲棙鍩婇幏椋庢喆閸曨剛顦ㄩ梺鍛婃⒐閻熲晠濡存担绯曟闁靛繆锟界鎷烽悜鑺ュ�甸柣銏☆問閻掔偓顨ラ悙鎼疁婵﹥妞介幃鐑藉级閹稿骸锟筋垶姊虹拠鈥崇仩闁活厼鍊搁悾鐑芥偡閹殿喗娈鹃梺鎼炲劗閺呮繈鎮＄�ｎ喗鈷戦柛鎾村絻娴滄繃绻涢崣澶涜�块柟顔癸拷鏂ユ瀻闊浄绲剧�靛矂鏌ｆ惔顖滅У濞存粠浜、鎾澄旈崨顔惧幈濠碘槅鍨靛▍锝夊箺閻樼粯鐓欏〒姘仢婵＄晫绱掔紒妯肩疄鐎规洘锕㈤崺鐐村緞濮濆本顎楁繝鐢靛Х椤ｈ棄危閸涙潙纾婚柛鏇ㄥ灠閻ゎ噣鏌熺紒銏犳灈闁哄嫨鍎甸弻銊╂偄閸濆嫅銏㈢棯閹冩倯闁逛究鍔岄～婊堟晸閽樺）娑氭崉閵婏富娼熼梺璺ㄥ櫐閹凤拷? by changhao	
								return false;
							}
						}
					}
					
					MessageMgr.sendMsgNotify(roleId, 410050, null); //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啰绠炵�殿喖顭烽幃銏ゆ惞閸︻厾鍘梻浣稿閻撳牓宕抽锟藉畷婵囧緞閹邦厸鎷洪梺鍛婄☉閿曪箓骞婇崘顏嗙＜缂備焦锕懓璺拷娈垮枛椤兘寮幇顓炵窞濠电姴瀛╃紞鍌炴⒒娴ｈ櫣甯涢柨姘舵煕閻旈攱鍋ョ�殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝懎顭囬敓鐙�鏁佹俊銈勯檷娴滄粓鏌ㄩ弮鍌氫壕闁哄棭鍓涢敓鑺ヮ問閸犳盯顢氳閸┿儲寰勬繛銏㈠枛閺屻劎锟斤絽鐏氱紞灞解攽閻樺灚鏆╅柛瀣☉铻炴繛鍡樻尭缁�澶嬩繆閵堝懎鏆熼柣顓熺懇閺屾盯濡烽鐓庮潽闂佺粯鎸鹃崰鏍嵁閺嶎灔搴敆閿熶粙鎮橀崡鐑嗙唵閻熸瑥濯堕幋锕�桅闁告洦鍨遍弲婊堟偣閸ヮ亜鐨哄ù鐘虫倐濮婃椽鎮欓挊澶婂Х婵犵锟借櫕鍠樻鐐村灴瀹曠喖顢涘В灏栨櫊閺屻劑寮撮鍛伓缂備礁澧介搹搴ㄥ垂鐠轰警娼栭柧蹇撴贡绾惧吋淇婇婵囶仩濞寸姵鎮傞弻锕傚礃椤撴繂鎯堥梺璺ㄥ枎閿熺晫鍣ュ鎰箾閸欏＃鎴犳崲濞戞瑧绡�闁稿被鍊栫紞搴♀攽閻愬弶鈻曞ù婊勭箞钘熼柛顐ゅ枔缁犻箖鏌熺�电浠╁瑙勶耿閺屽秴鐣￠幍顔尖叺濠殿喖锕ㄥ▍锝囧垝濞嗗繆鏋庨柟顖嗗啫顥嶉梻鍌欑劍鐎笛兠洪敂鐣岊洸婵犲﹤鐗滈弫瀣煥濠靛棙顥犵紒鈽呮嫹婵犳鍠楅敃鈺呭礈濞戞瑥顕遍悗锝庡枟閳锋垹鎲搁悧鍫濅刊闁哄棙甯炵槐鎺楁晸閼恒儳鐟归柨鐔剁矙閻涱噣宕橀鑲╊吅闂佹寧妫佽闁归攱妞藉娲川婵犲嫧妲堥梺鎸庢穿缁插灝鈻庨姀銈嗙劶鐎广儱妫涢崢鍗炩攽閳藉棗鐏犳繝锟介柆宥嗗剹婵炲棙鍩婇幏椋庢喆閸曨剛顦ㄩ梺鍛婃⒐閻熲晠濡存担绯曟闁靛繆锟界鎷烽悜鑺ュ�甸柣銏☆問閻掔偓顨ラ悙鎼疁婵﹥妞介幃鐑藉级閹稿骸锟筋垶姊虹拠鈥崇仩闁活厼鍊搁悾鐑芥偡閹殿喗娈鹃梺鎼炲劗閺呮繈鎮＄�ｎ喗鈷戦柛鎾村絻娴滄繃绻涢崣澶涜�块柟顔癸拷鏂ユ瀻闊浄绲剧�靛矂鏌ｆ惔顖滅У濞存粠浜、鎾澄旈崨顔惧幈濠碘槅鍨靛▍锝夊箺閻樼粯鐓欏〒姘仢婵＄晫绱掔紒妯肩疄鐎规洘锕㈤崺鐐村緞濮濆本顎楁繝鐢靛Х椤ｈ棄危閸涙潙纾婚柛鏇ㄥ灠閻ゎ噣鏌熺紒銏犳灈闁哄嫨鍎甸弻銊╂偄閸濆嫅銏㈢棯閹冩倯闁逛究鍔岄～婊堟晸閽樺）娑氭崉閵婏富娼熼梺璺ㄥ櫐閹凤拷? by changhao	
					return false;
				}					
/////////////////////////////////////////////
				
				int biaoId = TimerNpcService.getInstance().getEventId(npc.getNpcID());
				
				int opentimes = chestcfg.getOpentimes();
				
				final long currentTime = System.currentTimeMillis();
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleId);
				if (null != team && team.isTeamLeader(roleId) && chestcfg.getOpenteam() == 1) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸妞ゎ偄鎳橀弻宥夊Ψ閵夈儲姣愮紓浣靛妸閸庨潧顫忕紒妯诲缂佸顑欏Λ宀勬⒑缁嬫鍎庣紒鑸佃壘閻ｇ兘寮撮悢鍝ョФ闂佸啿鎼崯浼存倿閸忚偐绡�闁靛骏绲介悡鎰版煕閺冿拷閻楃娀骞冮垾鏂ユ瀻闁圭偓娼欓敓钘夌仛缁绘盯骞嬮悜鍡曠礂闂佺鎻粻鎴犲閸ф鐓涢柛銉ｅ劚閻忣亪鏌ｉ幘鍗炲姕缂佺粯绻堝Λ鍐ㄢ槈濞嗘瑧绀婃繝纰樺墲瑜板啰绱炴繝鍥ц摕闁跨喓濮村婵囥亜閺傚灝鈷旈柣銈呭濮婃椽宕崟顕呮蕉闂佸憡姊归崹鍧楃嵁閸愵喖顫呴柕鍫濇噽椤︻厽绻涙潏鍓хК婵炲拑缍佸畷銏ゎ敍閻愮补鎷绘繛杈剧悼閹虫捇顢氬鍛＜閻犲洦褰冮顓狅拷瑙勬礃閸ㄦ寧淇婇崼鏇炲耿婵☆垰鎼导搴ㄦ⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庨幘瀹犳憰闂佸搫娲㈤崹褰掓煁閸ャ劎绡�闂傚牊绋掔粊鈺備繆椤愮噦鎷烽弬銉︽杸闂佺粯鍔曞鍫曞闯閾忓湱纾兼い鏃囧Г鐏忣厽銇勯銏㈢閻撱倖銇勮箛鎾愁仼缂佹劖绋掔换婵嬫偨闂堟刀锟犳煠閸愭彃顣抽柟骞垮灪缁楃喖鏁撻挊澶樻綎婵炲樊浜滅粻褰掓煟閹邦厼绲绘い顒�妫濆娲川婵犲孩鐣锋繝鐢靛仜閿曨亪鎮伴锟藉畷姗�顢欓懞銉︻仧闂備胶绮…鍫焊濞嗘搩鏁囨繛宸簼閳锋垿鏌熺粙鍨劉妞ゃ儱妫涢幃顔尖枎閹惧鍘甸梺姹囧�ら崹閬嶎敂閻樼數纾奸弶鍫涘妽瀹曞瞼锟借娲樼敮鎺楀煝鎼淬劌绠ｆ繝闈涙－閻庢挳姊婚崒娆戝妽閻庣瑳鍏犲搫顓兼径濠勬煣闂佺粯顭堥褏绮婚弽顓熺厽闁归偊鍘鹃弳姗�鏌涚�ｎ亝鍤囬柡灞剧洴楠炲洭濡搁敂鐣屽絿闂備礁鎲￠敃銏＄鐠轰警娼栨繛宸簻缁�鍐煕濞嗗浚妲归柛搴㈡尭椤啴濡堕崱妤冧淮濠碘槅鍋呴惄顖炲极閹剧粯鍤嶉柕澹啯娈归梻浣烘嚀閸ゆ牠骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鈽夊搴⑿俊鐐�戦崝宀勫箠閹邦喖鍨濆┑鐘崇閸嬫劗绱撴担璇＄劷闁告鏁诲娲川婵犲啫鐦烽梺鍛婁緱閸橀箖顢曟總鍛娾拻濞达絼璀﹂悞楣冩煥閺囨ê锟芥繈骞冮妷锔鹃檮缂佸鍎婚幗鏇炩攽閻愭潙鐏熼柛銊ф嚀閺侇喗淇婇悙顏勶拷鏍ь潖婵犳艾鍌ㄧ憸鏃堟晲閻愪警鏁傞柛顐ゅ暱閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閸ㄥ倸螖閿濆懎鏆欑紒鐘崇☉闇夐柨婵嗘噺鐠愶紕绱掔�ｂ晞鍏岀紒杈ㄦ崌瀹曟帒顫濋濠冨闁绘垼濮ら崐鍧楁煥閺囩偛锟界敻鏁撻弬銈囩暤鐎规洖鐖奸崺锟犲礃瑜忛悷婵嗏攽鎺抽崐褏寰婃禒瀣柈妞ゆ牜鍋為崑鍌炴煏婢跺棙娅嗛柣鎾跺枛閺岋繝宕掑鍙樿檸濡炪倧绲炬繛濠囧蓟閿濆鏁囬柣鏃傚劋閸ｄ即姊洪崫鍕槵闁跨喕妫勭壕顓㈠汲閸℃稒鍊甸柨婵嗛婢т即鏌ｉ敃锟介悧鎾愁潖閻戞ɑ濮滈柟娈垮枛婵′粙姊虹憴鍕憙鐎规洜鏁搁崚鎺旓拷锝庡枛缁犳娊鏌￠崘鈺傚鞍閻庢艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂嫮绠栫紒缁樼洴瀹曘劑顢曢姀顫礄婵犳鍠栭敃銊モ枍閿濆绠查柛鏇ㄥ灠鎯熼梺闈涱檧婵″洩銇愬鑸碘拻濞达絿鍎ら崵锟介梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹
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
							//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈡禒瀣仭闁冲搫鎳庨拑鐔兼煟閺傝法娈遍柡瀣叄濮婁粙宕堕澶嬫櫔閻熸粌绉堕崣鍛存⒑閹稿孩绌块柟鐑芥敱閵囧嫰顢橀悙瀵糕敍缂備胶濮电粙鎴﹀煡婢舵劕绠抽柣鎰綑椤忓爼姊洪幐搴㈢闁稿﹤鎽滅划濠氭晲婢跺鍘介梺鐟扮摠缁诲啴藟濠婂牊鐓涢柛婊�绀佹晶瀛樻叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欐祰椤曟牠宕伴弽顓熷亯闁绘挸娴烽弳锕傛煛閸ャ儱鐒洪柡浣哥Ч閺岋綁骞囬姘辨濡炪倧瀵岄崳锝夊蓟閻旂厧绀傞柤娴嬫櫆濞堫剟姊洪崨濠冪叆闁活厼鍊块獮鍐灳閺傘儲鏂�闁诲函缍嗛崑鍡涘储閹间焦鈷戦柛娑橈工婵倿鏌涢弬鎸庢拱缂佸倸绉电�佃偐锟芥稒顭囬崢鍨繆閻愬樊鍎忓Δ鐘虫倐瀹曘垽骞橀鐣屽幗濠电偞鍨靛畷顒�鈻嶅鍥锋嫹鐟欏嫭绀�缂傚秴锕妴浣糕枎閹炬潙浜楅柟鍏兼儗閸犳绱為幘缁樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗滈崑鎴︽晸閽樺鏆ｇ�规洏鍔戦、姗�宕堕妸褉妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐╂瀻闁归偊鍙庨崯搴㈢節閻㈤潧浠︽繛鍏肩懇瀹曘儳锟斤綆浜堕悞鑺ョ箾閸℃ɑ灏痪顓ㄦ嫹闂備浇顫夐崕鍏兼叏閵堝鍋傞煫鍥ㄧ〒閸欐捇鏌涢妷锝呭姎闁告柣鍊楅惀顏堝箚瑜庨崑銉╂煛鐏炲墽鈽夐摶锝夋煕閿旇骞橀柣鎾存尭閳规垿顢欑涵閿嬫暰濠碉紕鍋犲Λ鍕亱闂佸憡鍔戦崝澶娢ｉ崼銉ョ骇闁割偅纰嶅▍鍛攽椤旂鍋㈡慨濠勭帛閹峰懏绗熼婊冨Ъ闂傚倷绀佹惔婊呭緤閸撗呯焿鐎广儱顦柋鍥煛閸ヮ煉鍏柟鐑芥敱缁楃喖鏁撻挊澶樺殨妞ゆ洩鎷风�规洖銈搁、鏇㈡晲閸℃褰嗛梻鍌氬�烽懗鍓佹兜閸洖绀堟繝闈涱儐閺咁亪姊绘担鍛婃儓妞ゆ垵妫濆畷褰掓嚋閻㈢鏀虫繝鐢靛Т濞村倿寮崘顔界叆闁哄啫鍊荤敮娑欑箾閸稑鍔氶柍瑙勫灴閹瑧锟芥稒顭囩粙鍥р攽閻愬弶鈻曢柛妯恒偢閹儳鐣￠幏鏃�妫冮弫鎾寸鐎ｎ偄浠煎┑鐘绘涧椤戝棝寮查幖浣圭厽闁挎繂鎳忓﹢鐗堛亜椤愶絾绀嬮柡宀�鍠栭幃婊冾潨閸℃﹩鍚傞梻浣芥〃缁�渚�顢栨径鎰摕婵炴垯鍨归悞娲煕韫囨洖顎屽ù婊庝邯閵嗕線寮崼鐔告闂佽法鍣﹂幏锟�?
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
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾婀遍幉鎼佹偋閸繄鐟ㄧ紒鐐劤椤兘寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳纾粻濠氭煛鐏炲墽娲存い銏℃礋閺佹劙宕堕埡鍐╂瘒缂傚倸鍊风粈渚�鎳熼鐐村�舵繝闈涱儏閻撴﹢鏌熸潏鎯х槣闁轰礁锕弻锕�螣娓氼垱孝闂佸搫顑嗛悷鈺侇潖濞差亜浼犻柛鏇ㄥ櫘濞煎爼姊洪崨濠冪叆闁活厼鍊垮畷娲倷閸濆嫮顓洪梺鎸庢穿閹烽攱顨ラ悙顏勭仾闁逛究鍔岃灃闁跨喕妫勮灋婵炲棙鎸婚弲鎼佹煏婢跺棙娅嗛柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠曞Λ鍕箺濠婂牊鏅搁柤鎭掑劚閸ゎ剟鏌涢幘瀵告创闁轰焦鎹囬幊鐐哄Ψ瑜忛崣婵嬫⒑閸涘娈旈柛鐔锋健椤㈡岸鏁愰崱娆戠槇濠殿喗锕╅崜娑欏鐎ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�
						RewardMgr.getInstance().distributeAllAward(rid,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈鏍″┑鐘灪閿曘垽宕洪悙鍝勭闁挎棁妫勬禍褰掓倵鐟欏嫭绀�婵炴潙鍊垮鎶芥晸閻樻枼鎷虹紓浣割儐椤戞瑩宕曡箛鏂讳簻闁瑰瓨绻冮ˉ鐘绘煙楠炲灝鐏╅柍瑙勫灴瀹曞爼鍩￠崘顏咁潓闂傚倷鑳堕…鍫ュ嫉椤掑倸鍨濈�癸拷閸曗晪鎷烽崒姣椽顢旈崨顏呭婵犳鍠氶幊鎾趁洪妶澶嬫櫢闁兼亽鍎哄▓婊咃拷瑙勬礃閸ㄥ潡鐛Ο鍏煎珰闁告瑥鍋婄粻鎾诲蓟濞戙垹鍗抽柕濞垮劤娴犫晝绱撴担鍝勑ｉ柣鈺婂灦瀵顓奸崱妯侯潯闂佽顔栭崰姘舵偤濮楋拷濮婇缚銇愰幒婵囶棖闂佸搫鑻ˇ浣冩闁荤喐鐟ョ�氬嘲鈻撴禒瀣厽闁归偊鍨伴惃铏圭磼閻樻彃绾ч柕鍥у閺佸倿骞嗚閺嗩參姊虹拠鈥崇仭婵☆偄鍟幈銊╂晸娴犲鐓熸俊顖濇閿涘秹鏌ㄩ悢铏规憘闁告瑥鍟～蹇曠磼濡顎撻梺鍛婄☉閿曘倝寮抽崼婵冩斀闁绘劙顤傞崵瀣磼閻樿櫕灏柣锝囧厴婵拷閹烘娊宕戦崨瀛樼厱闁硅埇鍔嶅▍鍛归悩灞傚仮婵﹨娅ｇ槐鎺懳熺拠鑼暡闂佽楠搁悘姘辨暜閹烘违闁圭儤鎸剧弧锟藉┑顔斤供閸橀箖宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃鏆ｉ挊鐔兼煟閹邦厾鏆樺ù婊勭矒閺屾洘寰勫☉姗嗘喘婵犫拃鍛毈闁哄备锟藉磭鏆嗛柨鐔剁矙瀹曚即寮借閺嗭附绻涢崱妯诲碍閸ユ挳姊虹化鏇炲⒉妞ゃ劌绻戠�靛ジ鏁撻敓锟�");
						
						baoxiangInfo.setOpentimes(baoxiangInfo.getOpentimes() + 1);
						baoxiangInfo.setLastopentime(currentTime);
					}
				}
				else {
					int rolelevel = xtable.Properties.selectLevel(roleId);
					if (chestcfg.openlevel > rolelevel) {
						//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈡禒瀣仭闁冲搫鎳庨拑鐔兼煟閺傝法娈遍柡瀣叄濮婁粙宕堕澶嬫櫔閻熸粌绉堕崣鍛存⒑閹稿孩绌块柟鐑芥敱閵囧嫰顢橀悙瀵糕敍缂備胶濮电粙鎴﹀煡婢舵劕绠抽柣鎰綑椤忓爼姊洪幐搴㈢闁稿﹤鎽滅划濠氭晲婢跺鍘介梺鐟扮摠缁诲啴藟濠婂牊鐓涢柛婊�绀佹晶瀛樻叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欐祰椤曟牠宕伴弽顓熷亯闁绘挸娴烽弳锕傛煛閸ャ儱鐒洪柡浣哥Ч閺岋綁骞囬姘辨濡炪倧瀵岄崳锝夊蓟閻旂厧绀傞柤娴嬫櫆濞堫剟姊洪崨濠冪叆闁活厼鍊块獮鍐灳閺傘儲鏂�闁诲函缍嗛崑鍡涘储閹间焦鈷戦柛娑橈工婵倿鏌涢弬鎸庢拱缂佸倸绉电�佃偐锟芥稒顭囬崢鍨繆閻愬樊鍎忓Δ鐘虫倐瀹曘垽骞橀鐣屽幗濠电偞鍨靛畷顒�鈻嶅鍥锋嫹鐟欏嫭绀�缂傚秴锕妴浣糕枎閹炬潙浜楅柟鍏兼儗閸犳绱為幘缁樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗滈崑鎴︽晸閽樺鏆ｇ�规洏鍔戦、姗�宕堕妸褉妲堥梺瀹狀潐閸ㄥ灝鐣烽崡鐐╂瀻闁归偊鍙庨崯搴㈢節閻㈤潧浠︽繛鍏肩懇瀹曘儳锟斤綆浜堕悞鑺ョ箾閸℃ɑ灏痪顓ㄦ嫹闂備浇顫夐崕鍏兼叏閵堝鍋傞煫鍥ㄧ〒閸欐捇鏌涢妷锝呭姎闁告柣鍊楅惀顏堝箚瑜庨崑銉╂煛鐏炲墽鈽夐摶锝夋煕閿旇骞橀柣鎾存尭閳规垿顢欑涵閿嬫暰濠碉紕鍋犲Λ鍕亱闂佸憡鍔戦崝澶娢ｉ崼銉ョ骇闁割偅纰嶅▍鍛攽椤旂鍋㈡慨濠勭帛閹峰懏绗熼婊冨Ъ闂傚倷绀佹惔婊呭緤閸撗呯焿鐎广儱顦柋鍥煛閸ヮ煉鍏柟鐑芥敱缁楃喖鏁撻挊澶樺殨妞ゆ洩鎷风�规洖銈搁、鏇㈡晲閸℃褰嗛梻鍌氬�烽懗鍓佹兜閸洖绀堟繝闈涱儐閺咁亪姊绘担鍛婃儓妞ゆ垵妫濆畷褰掓嚋閻㈢鏀虫繝鐢靛Т濞村倿寮崘顔界叆闁哄啫鍊荤敮娑欑箾閸稑鍔氶柍瑙勫灴閹瑧锟芥稒顭囩粙鍥р攽閻愬弶鈻曢柛妯恒偢閹儳鐣￠幏鏃�妫冮弫鎾寸鐎ｎ偄浠煎┑鐘绘涧椤戝棝寮查幖浣圭厽闁挎繂鎳忓﹢鐗堛亜椤愶絾绀嬮柡宀�鍠栭幃婊冾潨閸℃﹩鍚傞梻浣芥〃缁�渚�顢栨径鎰摕婵炴垯鍨归悞娲煕韫囨洖顎屽ù婊庝邯閵嗕線寮崼鐔告闂佽法鍣﹂幏锟�?
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
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾婀遍幉鎼佹偋閸繄鐟ㄧ紒鐐劤椤兘寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳纾粻濠氭煛鐏炲墽娲存い銏℃礋閺佹劙宕堕埡鍐╂瘒缂傚倸鍊风粈渚�鎳熼鐐村�舵繝闈涱儏閻撴﹢鏌熸潏鎯х槣闁轰礁锕弻锕�螣娓氼垱孝闂佸搫顑嗛悷鈺侇潖濞差亜浼犻柛鏇ㄥ櫘濞煎爼姊洪崨濠冪叆闁活厼鍊垮畷娲倷閸濆嫮顓洪梺鎸庢穿閹烽攱顨ラ悙顏勭仾闁逛究鍔岃灃闁跨喕妫勮灋婵炲棙鎸婚弲鎼佹煏婢跺棙娅嗛柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠曞Λ鍕箺濠婂牊鏅搁柤鎭掑劚閸ゎ剟鏌涢幘瀵告创闁轰焦鎹囬幊鐐哄Ψ瑜忛崣婵嬫⒑閸涘娈旈柛鐔锋健椤㈡岸鏁愰崱娆戠槇濠殿喗锕╅崜娑欏鐎ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�
						RewardMgr.getInstance().distributeAllAward(roleId,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈鏍″┑鐘灪閿曘垽宕洪悙鍝勭闁挎棁妫勬禍褰掓倵鐟欏嫭绀�婵炴潙鍊垮鎶芥晸閻樻枼鎷虹紓浣割儐椤戞瑩宕曡箛鏂讳簻闁瑰瓨绻冮ˉ鐘绘煙楠炲灝鐏╅柍瑙勫灴瀹曞爼鍩￠崘顏咁潓闂傚倷鑳堕…鍫ュ嫉椤掑倸鍨濈�癸拷閸曗晪鎷烽崒姣椽顢旈崨顏呭婵犳鍠氶幊鎾趁洪妶澶嬫櫢闁兼亽鍎哄▓婊咃拷瑙勬礃閸ㄥ潡鐛Ο鍏煎珰闁告瑥鍋婄粻鎾诲蓟濞戙垹鍗抽柕濞垮劤娴犫晝绱撴担鍝勑ｉ柣鈺婂灦瀵顓奸崱妯侯潯闂佽顔栭崰姘舵偤濮楋拷濮婇缚銇愰幒婵囶棖闂佸搫鑻ˇ浣冩闁荤喐鐟ョ�氬嘲鈻撴禒瀣厽闁归偊鍨伴惃铏圭磼閻樻彃绾ч柕鍥у閺佸倿骞嗚閺嗩參姊虹拠鈥崇仭婵☆偄鍟幈銊╂晸娴犲鐓熸俊顖濇閿涘秹鏌ㄩ悢铏规憘闁告瑥鍟～蹇曠磼濡顎撻梺鍛婄☉閿曘倝寮抽崼婵冩斀闁绘劙顤傞崵瀣磼閻樿櫕灏柣锝囧厴婵拷閹烘娊宕戦崨瀛樼厱闁硅埇鍔嶅▍鍛归悩灞傚仮婵﹨娅ｇ槐鎺懳熺拠鑼暡闂佽楠搁悘姘辨暜閹烘违闁圭儤鎸剧弧锟藉┑顔斤供閸橀箖宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃鏆ｉ挊鐔兼煟閹邦厾鏆樺ù婊勭矒閺屾洘寰勫☉姗嗘喘婵犫拃鍛毈闁哄备锟藉磭鏆嗛柨鐔剁矙瀹曚即寮借閺嗭附绻涢崱妯诲碍閸ユ挳姊虹化鏇炲⒉妞ゃ劌绻戠�靛ジ鏁撻敓锟�");
						
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
						
						// 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟閹告娊骞冨▎鎴炲珰鐟滃海锟芥艾婀遍幉鎼佹偋閸繄鐟ㄧ紒鐐劤椤兘寮婚妸鈺傚亜闁告繂瀚呴敐澶嬬厽闁规儳纾粻濠氭煛鐏炲墽娲存い銏℃礋閺佹劙宕堕埡鍐╂瘒缂傚倸鍊风粈渚�鎳熼鐐村�舵繝闈涱儏閻撴﹢鏌熸潏鎯х槣闁轰礁锕弻锕�螣娓氼垱孝闂佸搫顑嗛悷鈺侇潖濞差亜浼犻柛鏇ㄥ櫘濞煎爼姊洪崨濠冪叆闁活厼鍊垮畷娲倷閸濆嫮顓洪梺鎸庢穿閹烽攱顨ラ悙顏勭仾闁逛究鍔岃灃闁跨喕妫勮灋婵炲棙鎸婚弲鎼佹煏婢跺棙娅嗛柍閿嬪浮閺屾稓浠﹂幑鎰棟闂佽法鍠曞Λ鍕箺濠婂牊鏅搁柤鎭掑劚閸ゎ剟鏌涢幘瀵告创闁轰焦鎹囬幊鐐哄Ψ瑜忛崣婵嬫⒑閸涘娈旈柛鐔锋健椤㈡岸鏁愰崱娆戠槇濠殿喗锕╅崜娑欏鐎ｎ喗鍊甸悷娆忓缁�锟藉┑鐐额嚋缁犳垿鍩㈤幘缁樺亗閹兼惌鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙煤閵堝鍑犲ù锝呯畭娴滄粓鐓崶銊﹀暗濠⒀勭洴閺岋綁骞橀崡鐐插Е闂佸搫鐭夌紞浣割嚕閹绢喗鍊烽悹鍥囧嫬顏堕梺闈╁瘜閸欏繘骞忓畡閭︽僵闁绘劦鍓欓锟�
						RewardMgr.getInstance().distributeAllAward(roleId,
								chestcfg.rewardid, null,
								fire.log.enums.YYLoggerTuJingEnum.tujing_Value_baoxiang, 0,
								PAddExpProc.OTHER_QUEST, "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈鏍″┑鐘灪閿曘垽宕洪悙鍝勭闁挎棁妫勬禍褰掓倵鐟欏嫭绀�婵炴潙鍊垮鎶芥晸閻樻枼鎷虹紓浣割儐椤戞瑩宕曡箛鏂讳簻闁瑰瓨绻冮ˉ鐘绘煙楠炲灝鐏╅柍瑙勫灴瀹曞爼鍩￠崘顏咁潓闂傚倷鑳堕…鍫ュ嫉椤掑倸鍨濈�癸拷閸曗晪鎷烽崒姣椽顢旈崨顏呭婵犳鍠氶幊鎾趁洪妶澶嬫櫢闁兼亽鍎哄▓婊咃拷瑙勬礃閸ㄥ潡鐛Ο鍏煎珰闁告瑥鍋婄粻鎾诲蓟濞戙垹鍗抽柕濞垮劤娴犫晝绱撴担鍝勑ｉ柣鈺婂灦瀵顓奸崱妯侯潯闂佽顔栭崰姘舵偤濮楋拷濮婇缚銇愰幒婵囶棖闂佸搫鑻ˇ浣冩闁荤喐鐟ョ�氬嘲鈻撴禒瀣厽闁归偊鍨伴惃铏圭磼閻樻彃绾ч柕鍥у閺佸倿骞嗚閺嗩參姊虹拠鈥崇仭婵☆偄鍟幈銊╂晸娴犲鐓熸俊顖濇閿涘秹鏌ㄩ悢铏规憘闁告瑥鍟～蹇曠磼濡顎撻梺鍛婄☉閿曘倝寮抽崼婵冩斀闁绘劙顤傞崵瀣磼閻樿櫕灏柣锝囧厴婵拷閹烘娊宕戦崨瀛樼厱闁硅埇鍔嶅▍鍛归悩灞傚仮婵﹨娅ｇ槐鎺懳熺拠鑼暡闂佽楠搁悘姘辨暜閹烘违闁圭儤鎸剧弧锟藉┑顔斤供閸橀箖宕㈤鍫熲拺闁告挻褰冩禍婵堢磼鐠囨彃鏆ｉ挊鐔兼煟閹邦厾鏆樺ù婊勭矒閺屾洘寰勫☉姗嗘喘婵犫拃鍛毈闁哄备锟藉磭鏆嗛柨鐔剁矙瀹曚即寮借閺嗭附绻涢崱妯诲碍閸ユ挳姊虹化鏇炲⒉妞ゃ劌绻戠�靛ジ鏁撻敓锟�");
						
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


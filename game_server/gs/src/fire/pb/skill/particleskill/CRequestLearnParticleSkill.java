
package fire.pb.skill.particleskill;

import java.util.HashMap;
import java.util.Map;

import fire.log.beans.RoleSkillUpBean;
import fire.pb.attr.SRefreshRoleData;
import fire.pb.buff.BuffPetImpl;
import fire.pb.course.CourseType;
import fire.pb.item.GroceryItemShuXing;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.pet.Pet;
import fire.pb.pet.PetColumn;
import fire.pb.pet.PetColumnTypes;
import fire.pb.skill.BuffUnit;
import fire.pb.skill.Module;
import fire.pb.skill.Result;
import fire.pb.skill.SkillPet;
import fire.pb.skill.SkillRole;
import fire.pb.skill.SubSkillConfig;
import fire.pb.skill.fight.FightSkillConfig;
import fire.pb.skill.liveskill.LiveSkillManager;
import fire.pb.talk.MessageMgr;
import fire.script.FightJSEngine;
import fire.script.JavaScript;









// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestLearnParticleSkill__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠婚柡浣规崌閹崇偤濡疯閺嬫棃姊洪崫鍕櫧濠殿喗鎸抽幃鎯х暋闁附寤洪梺璺ㄥ枍缁瑩鐛繝鍥ㄦ櫢闁绘ê寮閺屾盯濡烽姀鈩冪彣缂備浇绮惧▍鏇犳崲濠靛棌鏋旈柛顭戝枟閻忓秹姊洪幐搴㈢殤闁跨喎锟界噥娼愭繛璇х畵瀹曟粌顫濈捄铏圭杽闂侀潧艌閺呪晠寮崱娑欑厱闁哄洢鍔屾晶浼存煕濮楋拷娴滆泛顫忓ú顏勪紶闁告洦鍓欓崑宥夋⒑閸涘﹥鐓ラ柡鍫墴瀵煡鎳滈棃娑卞殼闁诲孩绋掗…鍥储閹剧粯鈷戦柤濮愬�曢弸鎴濐熆閻熺増顥為柣妤�閰ｅ缁樼瑹閿熻棄顭囪鐓ら柕鍫濇祫閹峰嘲顫濋鐔哄嚒濡炪倖娲╃紞渚�銆佸鑸垫櫢濞寸姴顑呴弸渚�鏌熼幆褜鍤熸い鈺冨厴閹鏁愭惔婵堟晼闂佹寧绋撻崰鏍ь潖濞差亜绠氱憸搴ｇ矉鐎ｎ喗鐓曢悗锝庝簼椤ャ垽鏌曢崱妤佸櫤妞わ妇澧楅幆鏃堝閻樺磭锟介箖姊绘担铏瑰笡妞ゃ劌鎳橀幃褔宕卞▎鎴犵暥濠殿喗顭堥崺鏍偂閻斿吋鐓欓柟顖嗗苯娈堕梺鐟板暱濞差參寮婚敍鍕勃閻犲洦褰冮～鍥⒑鐠団�虫灁闁稿﹥绻傞悾鐑藉箳閹存梹顫嶅┑顔筋殔濡梻妲愰敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬閺夆晜绻堥弻锝嗘償椤栨粎校闂佸摜濮甸悧婊呭垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷?
 * @author changhao
 *
 */
public class CRequestLearnParticleSkill extends __CRequestLearnParticleSkill__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestlearnparticleskill = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				Long battleid = xtable.Roleid2battleid.select(roleid);
				if (battleid != null)
				{
					MessageMgr.psendMsgNotify(roleid, 131451, null);	
					return true;						
				}
				int factionlevel = 0;
				
				Long factionid = xtable.Roleidclan.select(roleid);
				if (factionid != null)
				{
					xbean.ClanInfo clanInfo = xtable.Clans.select(factionid);
					if (clanInfo != null)
					{
						factionlevel = clanInfo.getClanlevel();						
					}
				}
				
				fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(id);
				
				if (config == null)
				{
					return true;						
				}
												
				SkillRole skillrole = new SkillRole(roleid);
				xbean.PracticeSkill practiceskill = skillrole.getPracticeSkill(id);
				if (practiceskill == null)
				{
					return true;
				}
				
				int curskilllevel = practiceskill.getLevel(); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢鎾煛閿熶粙鏌嗗鍛傦箓鏌涢弴銊ョ仩妞ゎ偄鎳橀弻宥夋寠婢跺妫￠梺姹囧�撶欢姘潖閾忚瀚氶柍銉ㄦ珪閻忎線姊洪幖鐐插婵☆偄瀚伴幃楣冩倻缁涘鏅濋梺鎸庢穿閹风兘宕鐐粹拺闂傚牊鐩悰婊呯磼鏉堛劍绀冪紒鍌氱Ч閹瑩鎮滃Ο閿嬪闂備胶顭堥張顒勬偡閵娾晛绀傜�癸拷閿熺晫妲愰幒妤婃晪闁告侗鍘炬禒鎾⒑閸︻厾鎽傞柛瀣躬楠炲啫鐣￠柇锔惧弳闂佸憡娲﹂崜娑㈠礄閿熺姵鈷戦柛婵勫劚閺嬫垿鏌熼崨濠傗枙闁绘侗鍣ｅ畷姗�顢欓懞銉︻仧闂備胶绮…鍫焊濞嗘挻鏅繝濠傜墛閳锋垹绱撴担濮戭亝鎱ㄩ崶銊ｄ簻闁哄洢鍔屽顔撅拷瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸浜愰柟閿嬫そ濮婂宕掑鍗烆杸婵炴挻纰嶉〃濠囧箖閻愭番鍋呴柛鎰ㄦ櫇閸橀亶鏌熼崗鑲╂殬闁告柨顑夐獮澶愭倷椤戝彞绨婚梺闈涚箚閸撴繈藟閸喆浜滈柕蹇婂墲缁�瀣煛娴ｇ锟藉潡骞冮崜褌娌柦妯侯槺椤旀垿姊婚崒姘拷鐑芥倿閿曞倸鍑犲┑鍌滎焾閻ょ偓绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閸洘顎嶉梺绋匡工閻栧ジ寮诲澶婁紶闁告洦鍓欏▍銈夋⒑缂佹ɑ灏甸柛鐘崇墵瀵寮撮悢椋庣獮濠碘槅鍨靛▍锝嗙椤撱垺鐓熼幖娣灮閸熸煡鏌熼崙銈嗗? by changhao
				
				if (curskilllevel >= config.skillLevelMax) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閳哄懏鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃顏堝箠閻愬搫唯鐟滃繗銇愰悙顒傜瘈闁汇垽娼у瓭濠电偛鐪伴崐婵嬪箖閸ф鏁嬮柨鐔剁矙瀵鈽夊Ο閿嬵潔濠碘槅鍨伴崥瀣箟婵傚憡鈷戠紓浣股戠亸闈涒攽椤旀儳鍘撮柟顖ゆ嫹濡炪倕绻愰悧鍡欑棯瑜旈弻娑⑩�﹂幋婵囩仌闂佺硶鏅濋崑鐐垫崲濠靛鐓曢柨鐔剁矙瀹曟帒顫濋鍌樺仏闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝夛拷娑氱畾闂佺粯鍨煎Λ鍕暜闂備焦瀵уú鈺呭箯闁垮绠鹃柛顐ゅ櫏濞堟粓鏌熼绛嬫當闁崇粯鎹囧畷褰掝敊閻ｅ奔閭梻鍌欒兌缁垶鎮у鍫濆偍鐟滄棃骞冩ィ鍐╃叆閻庯綆鍓熷顕�姊洪崨濠勨槈闁挎洏鍊栫粋宥咁煥閸喎锟界敻鏌ｉ悢鍛婄凡妞ゅ浚浜濈换婵嬪閳藉棛鍔稿銈忕导缁瑥顫忔繝姘＜婵﹩鍓ㄩ幏鐑芥倻閼恒儱娈戦梺鍛婃尫閻掞箓宕楀鍫熺厱妞ゆ劧绲剧粈锟介梺姹囧�楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳娴犻箖姊虹粙鍨劉妞ゃ劌锕璇测槈濮橆偅鍕冮梺璇″瀻閸愨晝妲楅梻鍌欑劍閹爼宕愰弽顬℃椽鎮㈤悡搴ゆ憰闂侀潧艌閺呮粓宕戦崱娑欑厱閻忕偛澧介埥澶嬨亜韫囥儲瀚�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣鎴濇閺呯姴鈹戦悩缁樻锭婵炲眰鍨虹粋宥咁煥閸喓鍘搁悗骞垮劚閸燁偅淇婇崸妤佺厓闁告瑣鍎崇粣鏃堟煛鐏炲墽鈾侀柟顖涙椤㈡瑩鎳栭埡锟介崠鏍磽閸屾瑦绁板瀛樻倐楠炴垿宕惰閺嗭箓鏌熼悜妯虹亶闁哄閰ｉ弻鐔猴拷鐢殿焾鍟搁梺纭呮閻倸顫忕紒妯诲闁绘垶锚濞堝矂姊洪幖鐐诧拷鏍偋閻樿崵宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘? by changhao
				{
					MessageMgr.psendMsgNotify(roleid, 160107, null);	
					return true;						
				}
				
				xbean.Properties roleproperty = xtable.Properties.select(roleid);
				
				xbean.Properties prop = xtable.Properties.select(roleid);
				xbean.RoleClanPoint contribution = xtable.Roleclanpoint.select(roleid);
				
				
			
				int rolelevel = prop.getLevel();
				int contri = 0;
				if (contribution != null)
				{
					contri = contribution.getHistoryclanpoint();
				}

				//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫼闁荤姴娲ゅ鍫曞箲閿濆棛绠鹃柛娑卞亜閻忓弶顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ瑜嶉獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繄浠﹂悙顒佺彿濡炪倖姊婚弲顐ょ不妤ｅ啯鐓曟い鎰╁�曢弸搴ㄦ煟韫囨挾鎽犻柟渚垮妽缁绘繈宕橀埞澶歌檸闂備胶鎳撶壕顓㈠磻閵堝棔绻嗛柣鎴ｆ缁�鍐煕濞嗗秴鍔﹂柛瀣殜閺岋箑螣閼姐倗鐣甸梻鍥ь樀閺岋絽螣閻戞ǚ鏋欓梺绋块缁绘帞妲愰幒妤佹櫢闁兼亽鍎辩欢鐐烘煙闁箑骞橀柛妯哄船閳规垿鎮欓弶鎴犱桓濡炪値鍘煎ú顓㈢嵁濡ゅ懏鍋愮紓浣诡焽閸樹粙姊虹憴鍕婵炲鐩绋库槈閵忥紕鍘搁柣蹇曞仧閸嬫挾绮堥崘顏嗙＜缂備焦顭囧ú瀵革拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾寸節绾板纾块柛瀣灴瀹曟劙寮撮悘鑽ゆ嚀椤繈顢橀悪锟藉ú绋库攽閻樼粯娑ч柣妤�锕ら悾鐑藉矗婢跺瞼顔曢梺鐟扮摠閻熴儵鎮橀埡鍐＜闁绘ê妯婇悡濂告煛瀹�瀣М闁诡喓鍨荤划娆忊枎閻愵剦妫嗛梻鍌欑閹诧繝鏁冮埡鍛；濠电姴娲ょ粻鏍ㄤ繆閵堝懏鍣归柛銊ュ�归妵鍕箛閸撲焦鍋ч梺鍛婂煀缁绘繈寮婚敐鍡樺劅闁靛繒濮村В鍫ユ⒑閹肩偛濡介柛搴ｅ帶铻為柣鏂垮悑閳锋垿鏌涢敂璇插绩婵＄偓鎮傞弻娑㈡偐閹颁焦鐤侀梺璇″櫙缁绘繈骞冮姀銈呯闁兼祴鏅涚敮妤呮⒒娴ｅ摜鏋冩俊妞煎妿缁牊绗熼敓钘夘嚕閸愭祴鏋庨柟鎯ь嚟閸樹粙妫呴銏℃悙闁挎洏鍎遍埢宥嗙節閸ャ劎鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ濠电姷顣槐鏇㈠礂濮楋拷閵嗕礁鈽夊Ο閿嬵潔濠殿喗顨呭Λ鏃傛閿燂拷? by changhao
				int maxlevel = 0;
						
				java.util.Map<Integer, Integer> ret = LiveSkillManager.getInstance().GetPracticeSkillMaxLevel(rolelevel, factionlevel, contri, config.skillLevelMax);
				if (ret.size() == 0)
				{
					return false;
				}
				
				java.util.Iterator<java.util.Map.Entry<Integer, Integer>> it = ret.entrySet().iterator();
				java.util.Map.Entry<Integer, Integer> entry = it.next();
				maxlevel = entry.getValue();
								
				if (curskilllevel >= maxlevel)
				{
					int msgid = 160106;
					if (entry.getKey() == 1)
					{
						msgid = 160487;
					}
					else if (entry.getKey() == 2)
					{
						msgid = 160488;
					}
					else if (entry.getKey() == 3)
					{
						msgid = 160489;
					}
					
					MessageMgr.psendMsgNotify(roleid, msgid, null);	
					return true;
				}
				
				if (config.needGuild == 1 && roleproperty.getClankey() <= 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閿曞倹鐓欑紒瀣儥閻撳ジ鏌熼鍝勭伈妞ゃ垺顨婂畷鐔碱敃閵堝骸鏁搁梻鍌氬�风粈渚�鎮樺┑瀣垫晞闁告洦鍘藉畷鏌ユ煕閳╁叇婊勭濠婂牊鐓欏ù鐓庣摠濞懷冾熆瑜滈崹鍫曞箖濡わ拷椤繈鎮欓锟介锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢瀛樸亜閵夛附宕岄柡浣规崌瀹曟劙鎮ゆ担鍦Х婵犵數鍋炵粊鎾疾濠靛牊顫曢柣鎰摠婵挳鏌涢幘鏉戠祷婵炲牄鍔戝娲捶椤撯剝顎楅梺鍝ュУ椤ㄥ﹤鐣烽幋锕�绀嬫い鎰枑閺傦拷闂備胶顭堥張顒勫礄閻熸嫈锝夊川婵犲嫮顔曢梺鍓插亽閸撴氨锟芥熬鎷�? by changhao
				{
					return true;	
				}
				
				int addexp = 0;
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(
						roleid, fire.pb.item.BagTypes.BAG, false);
											
				int which = LiveSkillManager.getInstance().GetPracticleSkillPlayerOrPet(id); //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫽婵炶揪绲块悺鏃堝吹濞嗘垹纾肩紓浣姑ù顔撅拷瑙勬礃閸ㄥ潡骞冮姀銈嗗亗閹艰揪缍囩槐閬嶆⒒娴ｇ瓔娼愰柛搴㈠▕椤㈡岸顢橀埀顒婃嫹閸涙潙钃熼柕澶涘閸橆亪姊洪崜鎻掍簼缂佽鍟磋棢闁绘鏁哥壕濂告煟濡灝鍚归柣锝嗘そ閺岋紕浠﹂崜褎鍒涢梺绯曟櫅鐎氭澘鐣峰锟介幃娆擃敆閸屾稒绶梻鍌氬�风粈渚�骞夐敓鐘冲仭闁靛／宥嗗婵﹩鍋勫畵鍡欙拷娈垮枦椤曆囧煡婢舵劕顫呴柣妯荤垹閸ャ劎鍘卞┑鐘差煭閹烽绱掗敓鑺ョ瑹閿熻棄鐣峰鍕嚤閻庢稒顭囬崢楣冩⒑閸︻収鐒惧Δ鐘叉啞閹便劌顓兼径瀣幐闁诲繒鍋涙晶钘壝洪弶鎴旀斀闁挎稑瀚崢鏉戔攽閳╁啯鍊愰柡浣稿�圭粚閬嶅箟鐎ｎ偄顏堕梺瑙勫婢ф鍩涢幋锔界厱婵犻潧妫楅鎾煕鎼达紕效闁哄本绋掔换婵嬪礃椤忓棛鏉介柣搴㈩問閸犳盯顢氳閸┿儲寰勬繝搴㈠兊闂佺粯鍔﹂崜娆擃敂閸洘鈷戦柟绋挎捣缁犳挻淇婇锝囨噰闁诡噯绻濇俊鐑芥晜閸撗屽晭闂佽绻掗崑娑㈠磹閹间焦鏅搁柤鎭掑労濞堟﹢鏌涢幒鎾崇瑲缂佺粯绻傞～婵嬵敇閻斿壊浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｇ箘閻ｆ椽姊虹粔鍡楀濞堟棃鏌ｉ幇顒婃敾闁靛洤瀚伴、妤佸緞婵犲偆娼介梻浣哄劦閺呪晠宕规导瀛樺仼闁绘垼濮ら崑鍕棯閹峰矂鍝洪柡鍜佸墴濮婃椽骞愭惔锝囩暤濠碘槅鍋呴悷銉╁煝瀹ュ绫嶉柨鐔诲Г缁岃鲸绻濋崶銊ワ拷閿嬨亜韫囨挸顏甸柟椋庡厴瀵粙鈥栭浣衡檨闁瑰嘲鎳愰幉鎾礋椤愵澀绱熼梻鍌欑窔濞佳囨偋閸℃蛋鍥敍濠婂喚妫滈梺绉嗗嫷娈曢柣鎾跺枛閺岋繝宕掑鍙樿檸闂佽鍠楅崹鍧楀蓟閿濆绠婚悗闈涙啞閸掓盯姊洪崫鍕拱闁烩晩鍨堕悰顕�宕堕锟介悡娑樏归敐鍛棌闁诲孩濞婂缁樻媴閼恒儳銆婇梺鍝ュУ濞叉牞鐏嬮梺鍛婃处閸樺墽绮堟繝鍌楁斀闁绘ê寮堕幖鎰磼閻樺磭澧摶鏍煥濠靛棙鍣归柡鍡欏仱閺岋綁骞掗弴鐐版睏闂佽法鍠曞Λ鍕不瀹ュ纾块柛妤冨�ｅ☉妯滄棃宕ㄩ鑺ヮ仧闂備椒绱徊浠嬪嫉椤掑嫬姹叉い鎺戝閻撴稓锟界櫢鎷烽悗锝庡墰琚﹀┑鐘愁問閸ｎ垶骞忛悜鑺モ拺閻庡湱濮甸ˉ澶嬩繆椤愶綆娈滅�殿喗鐓￠弻鍡楊吋閸″繑瀚奸梻浣虹帛閼归箖鎮洪妸褝鎷峰鎰佹綈缂佺粯绋撻敓鐣屾暩椤牏鏁崼鏇熺厽閹烘娊宕濋幋锕�绠栭柨鐔哄Т椤懘鏌曢崼婵囶棤闁告ɑ鎮傞幃妤呯嵁閸喖濮庨梺纭呮珪閸旀牜绮嬮幒鎴旀闁靛繆锟界鎷烽崹顐ｅ弿婵☆垳鍘ф禍楣冩倵濮樼偓瀚� by changhao
			
				if (itemid != 0) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀嬬節瀹曞爼濡烽妷褌鎮ｇ紓鍌欒兌婵攱鎱ㄩ悜鑺ユ櫢闁芥ê顦遍悾顓㈡煕鎼粹�宠埞閾荤偞绻涢幋娆忕仾闁稿鍠栭弻娑㈩敃閿濆棛顦ㄩ梺缁樻尰閻╊垶寮诲☉銏犖ㄩ柨婵嗘噹婵酣姊虹拠鍙夌濞存粠浜濠氭晲婢跺﹦顔掗柣搴㈢♁椤洭藝娴煎瓨鈷戠紓浣股戦幆鍕煕鐎ｎ亷宸ラ柣锝囧厴瀹曞ジ寮撮悙宥佹櫊閺屻劑寮撮鍛伓缂備胶鍋撳妯肩矓閹绢喖鐓橀柟杈鹃檮椤庢劙鏌ｈ箛鎾寸濞存粍绮撻幃楣冩倻閼恒儱浠洪梺鍛婄☉閿曘儱鈻嶉姀銈嗏拺缂佸灏呴崝鐔兼煕閿濆啫鍔氭い顓炴喘楠炲洭顢橀悩娈垮晭闂備礁鎲￠悷銉┧囨潏銊︽珷闁汇垹鎲￠悡娆愩亜閺嶃劌鍤俊鎻掓贡缁辨帗娼幍顔剧厯閻庤娲忛崝宥囨崲濠靛纾兼慨姗嗗厴閹峰姊婚崒姘拷宄懊归崶褉鏋栭柡鍥ュ灩闂傤垶鏌ㄩ弴鐐诧拷鍝ョ不椤栫偞鐓ラ柣鏇炲�圭�氾拷? by changhao
				{
					GroceryItemShuXing grocery = (GroceryItemShuXing) fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
					if (grocery == null)
					{
						return true;
					}
										
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮婚幘缁樼厽闁哄诞浣镐划閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷 by changhao
					if (grocery.typeid == LiveSkillManager.ITEM_TYPE_PRACTICE_ROLE_ITEM && which == 2)
					{
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弮鍌滅＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃鈥斥槈閵忥紕鍘遍梺闈涱槶閸ㄥ搫鈻嶉崨瀛樼厸閻庯綆鍋勯悘鎾煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崬鍦磽閸屾瑨鍏岀紒顕呭灦閹嫰顢涢悙闈涚ウ闁诲函缍嗛崰妤呭磹閻戣姤鐓曢柟鑸妽濞呭牆顭跨憴鍕惰�跨�规洩绻濋弻鍡楊吋閸℃瑥骞堟俊鐐�栭崝妤佹叏閹绢喖绀夋繝濠傜墛閻撶喖鏌熼幆褏鎽犵紒锟介崘顔界厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炍涢崘銊㈡婵妫欏ù鍥⒒娴ｇ瓔鍤欓悗娑掓櫊閹垽顢楅崟顐ゎ唵闂佽法鍣﹂幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀嬬節瀹曞爼濡烽妷褌鎮ｇ紓鍌欒兌婵攱鎱ㄩ悜鑺ユ櫢闁芥ê顦遍悾顓㈡煕鎼粹�宠埞閾荤偞绻涢幋娆忕仾闁稿鍠栭弻娑㈩敃閿濆棛顦ㄩ梺缁樻尰閻╊垶寮诲☉銏犖ㄩ柨婵嗘噹婵酣姊虹拠鍙夌濞存粠浜濠氭晲婢跺﹦顔掗柣搴㈢♁椤洭藝娴煎瓨鈷戦柛婵嗗椤箓鏌涢弮锟介崹鍧楃嵁閸愵喖围濠㈣泛锕﹂敍婊冣攽閻愭潙鐏﹂柨鏇楁櫆鐎靛ジ鏁撻敓锟�? by changhao
						if(bag.removeItemById(itemid, times, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulian, 0, LiveSkillManager.Practice) != times)
						{
							MessageMgr.psendMsgNotify(roleid, 160105, null);
							return false;
						}
						
						fire.pb.skill.SPracticeItemExp itemexp = ConfigManager.getInstance().getConf(fire.pb.skill.SPracticeItemExp.class).get(itemid);
						addexp = itemexp.exp * times;
						
					}//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啴鍙勯柕鍡楀暣婵＄柉顦撮柣顓熺懇閺屾盯寮婚婊冿拷褔骞忛悜钘夐敜婵°倧鎷风紒鐙欏洦鐓曟い鎰剁悼閳藉鈹戦垾鑼煓闁哄本绋戦埢搴ょ疀閺囩媭鍟嬫繝娈垮枛閿曘儱顪冮挊澶屾殾鐟滅増甯╅弫瀣煕濞戝崬骞栧鐟邦槹缁绘繈鎮介棃娑楃捕闂佺娅曢崝鏍崲濞戙垺鏅稿ù鐘差儐閻撴盯鎮橀悙棰濆殭濠殿喖鍊块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟� by changhao
					else if (grocery.typeid == LiveSkillManager.ITEM_TYPE_PRACTICE_PET_ITEM && which == 1)
					{
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弮鍌滅＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃鈥斥槈閵忥紕鍘遍梺闈涱槶閸ㄥ搫鈻嶉崨瀛樼厸閻庯綆鍋勯悘鎾煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崬鍦磽閸屾瑨鍏岀紒顕呭灦閹嫰顢涢悙闈涚ウ闁诲函缍嗛崰妤呭磹閻戣姤鐓曢柟鑸妽濞呭牆顭跨憴鍕惰�跨�规洩绻濋弻鍡楊吋閸℃瑥骞堟俊鐐�栭崝妤佹叏閹绢喖绀夋繝濠傜墛閻撶喖鏌熼幆褏鎽犵紒锟介崘顔界厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炍涢崘銊㈡婵妫欏ù鍥⒒娴ｇ瓔鍤欓悗娑掓櫊閹垽顢楅崟顐ゎ唵闂佽法鍣﹂幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀嬬節瀹曞爼濡烽妷褌鎮ｇ紓鍌欒兌婵攱鎱ㄩ悜鑺ユ櫢闁芥ê顦遍悾顓㈡煕鎼粹�宠埞閾荤偞绻涢幋娆忕仾闁稿鍠栭弻娑㈩敃閿濆棛顦ㄩ梺缁樻尰閻╊垶寮诲☉銏犖ㄩ柨婵嗘噹婵酣姊虹拠鍙夌濞存粠浜濠氭晲婢跺﹦顔掗柣搴㈢♁椤洭藝娴煎瓨鈷戦柛婵嗗椤箓鏌涢弮锟介崹鍧楃嵁閸愵喖围濠㈣泛锕﹂敍婊冣攽閻愭潙鐏﹂柨鏇楁櫆鐎靛ジ鏁撻敓锟�? by changhao
						if(bag.removeItemById(itemid, times, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulian, 0, LiveSkillManager.Practice) != times)
						{
							MessageMgr.psendMsgNotify(roleid, 160104, null);
							return false;
						}
						
						fire.pb.skill.SPracticeItemExp itemexp = ConfigManager.getInstance().getConf(fire.pb.skill.SPracticeItemExp.class).get(itemid);
						addexp = itemexp.exp * times;
					}
					else
					{
						return true;
					}
				}
				else //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔闈浢瑰鍡樼【闁靛棙甯楃换婵嗩潩椤撶姴骞橀梻浣筋嚃閸樼晫鏁幒妤�绀夐柕鍫濇娴滄粓鏌嶉崫鍕拷濠氬矗閿熶粙姊洪崫鍕拱闁烩晩鍨堕妴渚�寮撮姀鈩冩珳闂佺硶鍓濋悷顖毼ｉ鍌滅＝闁稿本鐟ㄩ崗灞解攽椤旇棄鈻曠�规洩绻濋獮搴ㄦ寠婢跺孩鎲版繝鐢靛仦閸垶宕洪崟顖氭瀬闁告劦鍠楅悡銉︾節闂堟稒顥炴い銉уУ閵囧嫰鏁傞崫鍕Б缂備浇椴哥敮鐐垫閹烘顫呴柣妯垮紦缁辩喖姊绘担鍝ョШ妞ゃ儲鎹囧畷妤�螣娓氼垱缍庣紓鍌欑劍钃卞┑顖涙尦閹嘲鈻庤箛鎿冧患婵炲濮弲鐘差潖閾忓湱鐭欓柛顭戝枤濡蹭即姊洪棃鈺冪Ф缂佽弓绮欓、姘舵晲婢跺﹨鎽曢梺闈涱檧缁犳垶绂嶉崷顓犵＝闁稿本鐟ч崝宥夋煥濮橆優褰掓偐閸愬弶璇炲┑顔硷龚濞咃綁骞戦崟顖毼╅柕澶涘瑜版岸姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷 by changhao
				{
					fire.pb.common.SCommon costconfig = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(165);
					
					int costmoney = Integer.parseInt(costconfig.value) * times;
									
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					if(bag.subMoney(-costmoney, LiveSkillManager.Practice, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulian, 0) != -costmoney)
					{
						return false;	
					}					
					
					addexp = 10 * times;
				}
				
				AddExp(curskilllevel, practiceskill.getExp() + addexp, practiceskill, maxlevel); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟藉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟� by changhao
				
				SUpdateLearnParticleSkill msg = new SUpdateLearnParticleSkill();
				msg.skill.level = practiceskill.getLevel();
				msg.skill.id = id;
				msg.skill.exp = practiceskill.getExp();
				msg.skill.maxlevel = maxlevel;
				
				if (msg.skill.level > 0)
				{
					msg.skill.effects.putAll(CalcSkillEffect(config.skillId, msg.skill.level));
					msg.skill.nexteffect.putAll(CalcSkillEffect(config.skillId, msg.skill.level + 1));
					if (practiceskill.getLevel() > curskilllevel) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁橆焽閺佹悂宕濋崼鏇熲拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖閿熶粙鎮￠弴銏＄厵閺夊牓绠栧顕�鏌ｉ幘瀛樼闁靛洤瀚伴、姗�鎮㈡搴濇樊婵犵數鍋涢幊蹇涙晝閵忋倕钃熸繛鎴炵懄閸庣喖鏌曡箛鏇炐㈡い顐ｅ浮濮婃椽宕崟顓犲姽缂傚倸绉崇欢姘舵偘椤斿皷鏋庨柟鎯х－椤︽澘顪冮妶鍡楅嚋闁圭兘鏀遍妵鍕疀閹捐泛鐓熷┑顔硷工椤嘲鐣烽幒鎴旀瀻闁归偊鍠撻崑妯讳繆閻愵亜锟芥牕鈻旈敃鍌氬窛妞ゆ梻鍘х花銉╂⒒娴ｅ憡璐￠柛搴涘�濋妴鍐川椤栨凹妫滄繝鐢靛У绾板秹鎮￠悢鍏肩厸闁告劑鍔岄敓钘夋憸閺侇噣宕滄担鐑橈紡闂佽鍨庡畝锟介崥瀣⒑閸濆嫯顫﹂柛鏃�鍨块獮鍐Χ婢跺﹦锛滃┑鐐村灦閿曗晜瀵奸敓锟�?? by changhao
					{
						Result result = new Result(true);
						
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴懞銉с�婇梺鍝ュУ閹稿骞堥妸褝鎷烽棃娑欐喐缁炬儳銈搁弻宥夊传閸曨剙娅ら梺鎶芥敱閸ㄥ爼濡甸崟顖氱闁绘劖娼欓鍓佺磽閸屾瑧顦︽い锔垮嵆楠炴劙骞庨挊澶岊唵闂佺鎻梽鍕磻閸曨偀鏀介柛灞惧嚬濡叉椽鏌涢悙鍨毈婵﹥妞藉畷銊︾節閸愩劎鐓梻浣哄帶閸熷潡鎮ユ總绋跨畺闁绘垵澹欐径鎰仧闁跨噦鎷� by changhao
						Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě渚婃嫹閹烘鐓熸繝闈涙閸╋綁鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒娴ｅ湱婀介柛濠冾殜瀹曟垿骞橀懜闈涘簥濠电偞鍨崹鍦不閿濆棛绠鹃柛鈩冾殘缁犳娊鏌涢弮锟介幐鍐差潖閻戞ɑ濮滈柟娈垮櫘濡差噣姊洪幐搴㈠濞存粠浜滈锝嗙節濮橆儵鈺呮煃閸濆嫬锟藉憡绂嶉悙鐑樷拺缂佸瀵у﹢鎵磼鐎ｎ偄鐏存い銏℃閺佹捇鏁撻敓锟�:" + roleid + "濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳娼￠弻鐔猴拷鐢殿焾瀛濈紓浣界堪閸婃繈寮婚敃锟借灒濞撴凹鍨遍敍鍡涙偡濠婂懎顣奸悽顖涘笧婢规洘绺介崨濠勫幗闂佸綊鍋婇崹浼存儍濞差亝鐓熸繛鎴炵墪閸旀岸鏌嶇憴鍕伌妞ゃ垺鐟х划鐢碉拷锝庡墮婵吋绻濋悽闈涗粶妞わ附澹嗙划娆撳箻鐎靛摜褰鹃梺鍝勬储閸ㄦ椽宕甸幒妤佺厪闁割偅绻冮ˉ婊堟煛鐎ｎ偄鐏撮柡宀�鍠栭幊婵嬫偋閸繃閿紓鍌欑劍瑜板啫顭囬敓鐘茬畾閻忕偠袙閺嬪酣鐓崶椋庢偧闁哥偟鏁诲娲礂閸忕厧锟芥劖绻涙担鍐插閸欏繘鏌涢妷銏℃珖缁炬儳銈搁弻锝呂熼悜妯锋灆闂佺粯鎸搁妶鎼佸蓟閿涘嫪娌柛鎾楀嫬鍨辨俊銈囧Х閸嬬偤鏁冮姀銈呯疇闁绘ê鐏氬畷澶愭煕濠靛棗顏╅柤鍨姍濮婂宕掑▎鎴М闂佽绁撮敓鍊熺М閸濆嫷娼ㄩ柨鐔剁矙瀵偊宕橀纰辨綂闂佺粯鐟遍幏閿嬬箾閸忚偐澧紒缁樼☉椤斿繘顢欓懡銈呭毈闂備胶顭堟鎼佹儗閸岀偛钃熸繛鎴炃氬Σ鍫熸叏濡わ拷閻楀棙瀵奸幇顒夋富闁靛牆鎳橀悰婊堟煙閸戙倖瀚�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｇ箘閻ｆ椽姊虹粔鍡楀濞堟棃鏌ｉ幇顒婃敾闁靛洤瀚伴、妤佸緞婵犲偆娼介梻浣哄劦閺呪晠宕规导瀛樺仼闁绘垼濮ら崑鍕棯閹峰矂鍝洪柡鍜佸墮閳规垿顢欑粵瀣姼婵炲瓨绮犻崜鐔奉嚕閹剁瓔鏁冮柨婵嗘川閻﹀牓鎮楅崗绋垮祮闁猴拷閸楃儐鐔嗘慨妤嬫嫹闁轰焦鎹囬幊鐐哄Ψ閿旂虎妲规俊銈囧Х閸嬫盯鏁冮妷鈺佺畾闁哄啫鐗婇弲鏌ユ煕閵夈垺娅囬柛鏃囨硾閳规垿鎮╅鑲╀紘闂佺硶鏅滈悧鐘茬暦濠靛鍐�妞ゆ挾鍠庢禍妤呮⒑缂佹ɑ顥堥柡鍛板皺閹广垽宕卞Ο闀愮盎闂佸搫绉查崝搴ㄦ儗婵犲洦鍋ㄦい鏍ㄦ皑閸╋綁鏌＄仦鍓ф创鐎殿噮鍓欓埢搴ㄥ箚瑜嶆竟瀣磽閸屾瑦绁板鏉戞憸閺侇喖螖閸涱厾顔嗛梺鍛婄☉閻°劑宕愮紒妯圭箚妞ゆ牗绮岀敮鍓佺磼閼碱剙顦琣cticleSkill闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閹銈︾憗銈忔嫹閿熶粙鏌＄�ｎ亞效闁哄本娲濈粻娑氾拷锝庝悍閹风兘寮撮悩鍏哥瑝濡炪倖鐗滈崑鐐烘偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬閺夆晜绻堥弻锝嗘償椤栨粎校闂佸摜濮甸悧婊呭垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷?");
						if(which == 2)
							result.updateResult(skillrole.addPracticleSkillBuff());
						else if(which == 1)
						{
							PetColumn petColumn = new PetColumn(roleid, PetColumnTypes.PET, false);
							for(Pet pet : petColumn.getPets())
							{
								SkillPet spet = new SkillPet(pet.getPetInfo(), roleid);
								Result resultpet = spet.addSkillBuffWhileOnline(null);
								BuffPetImpl buffpet = new BuffPetImpl(roleid, pet.getPetInfo().getKey());
								buffpet.psendSBuffChangeResult(resultpet);
								spet.updateSkillBuffWhileOut(null);
							}							
						}
					
						if(!result.getChangedAttrs().isEmpty())//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄被鍔戦幃銏ゅ传閸曟垯鍨婚惀顏堝箚瑜滈悡濂告煛鐏炲墽鈽夐柍钘夘樀瀹曪繝鎮欓幓鎺濆妧濠电姷鏁搁崑娑㈡儍閻戣棄鐤鹃柣妯款嚙閽冪喖鏌￠崶鈺佹灁缂佺娀绠栭弻锝夊箛闂堟稑顫梺缁樼箖濞茬喎顫忛搹鍦煓婵炲棙鍎抽崜浼存⒑缁嬪尅宸ユ繛灏栵拷鎰佸殨濠电姵鑹炬儫闂侀潧顦崹娲綖瀹ュ應鏀介柍钘夋閻忕喖鎮归敓浠嬫晜閻ｅ矈娴勯梺鑽ゅ枑婢瑰寮ㄦ禒瀣厽闁归偊鍨伴惃娲煟閹烘挸鍔ら棁澶嬬節婵犲倻鍑归梺顓у灣閿熻姤顔栭崰鏍�﹂悜钘夋瀬闁归偊鍘肩欢鐐测攽閻樻彃顏柡澶嬫倐濮婄粯鎷呯粙鎸庡�梺璇″枛閸婃悂鈥﹂崶顏嶆▌濡炪們鍨哄Λ鍐极閹剧粯鏅搁柨鐕傛嫹?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鏋涢柛銊︾箘閿熺晫娅㈤幏鐑芥煕閺囥劌澧伴柛妯诲姍濮婃椽骞愭惔锝囩暤闂佺懓鍢查澶婄暦閻㈢鍗抽柣鏃傜節缁ㄥ姊虹憴鍕凡濠⒀冮叄楠炲啯绺介崨濞炬嫽闂佸憡娲﹂崑鍕敂椤愩倗纾奸弶鍫涘妼缁椦囨煥閻斿憡鐏紓宥呮瀹曘垽鎮剧仦鎯у幑闂佺厧鎽滈崑锝嗙濠婂牊鐓ラ柡鍌氱仢閹垿鎮楀鐐? by changhao
						{
							mkdb.Procedure.psendWhileCommit(roleid,new SRefreshRoleData((HashMap<Integer, Float>)result.getChangedAttrs()));
						}		
						fire.log.YYLogger.roleSkillUPLog(roleid, new RoleSkillUpBean(id, practiceskill.getLevel()));
					}					
				}
				else if (msg.skill.level == 0)
				{
					msg.skill.nexteffect.putAll(CalcSkillEffect(config.skillId, 1));
				}
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);				
				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleid));
				
				if (practiceskill.getLevel() > curskilllevel) {
					fire.pb.course.CourseManager.checkAchieveCourse(roleid, CourseType.XIULIAN_COURSE, practiceskill.getLevel());
				}
				
				return true;
			}
		};
		
		requestlearnparticleskill.submit();	
	}
	
	/***
	 * 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳娼￠弻鐔猴拷鐢殿焾瀛濈紓浣界堪閸婃繈寮婚敃锟借灒濞撴凹鍨遍敍鍡涙偡濠婂懎顣奸悽顖涘笧婢规洘绺介崨濠勫幗闂佸綊鍋婇崹浼存儍濞差亝鐓熸繛鎴炵墪閸旀岸鏌嶇憴鍕伌妞ゃ垺鐟х划鐢碉拷锝庡墮婵吋绻濋悽闈涗粶妞わ附澹嗙划娆撳箻鐎靛摜褰鹃梺鍝勬储閸ㄦ椽宕甸幒妤佺厪闁割偅绻冮ˉ婊堟煛鐎ｎ偄鐏存俊顐㈡嚇椤㈡洟濮�閳ユ剚妲辨繝鐢靛仜瀵爼鎮ч悩鑼殾闁荤喐澹嬮弨浠嬫倵閿濆骸浜為柛妯哄船椤啴濡舵惔鈥崇闂佹悶鍔岄悘姘辩矉瀹ュ拋鐓ラ柛娑卞灣閿涙粓姊洪崨濠冨矮缂侊拷娴ｅ湱顩风憸鏃堝蓟閵娾晜鍋勯柣鎴炆戦悵顏勨攽閻愬弶鍣烽柛銊ょ矙閻涱喛绠涘☉娆忥拷濠氭煠閹帒鍔ら柛姗�浜跺娲传閸曨剙鍋嶉梺鍛婃煥閻倿鎮伴锟藉浠嬵敃閵堝浄绱查梻浣芥硶閸犲秶鍒掑▎蹇曟殾濠靛倻顭堝敮闂佹寧妫侀～澶岋拷姘虫閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劖鏅搁柣妯垮皺閺屽牓姊虹紒妯哄闁宦板姂瀹曪綀绠涢幘顖涙杸闂佺粯蓱瑜板啴顢旈锔藉仺妞ゆ牗绋撳ú鎾煛瀹�锟介崰鎰箔閻旂厧鍨傛い鏃傗拡閻庡瓨淇婇悙顏勶拷褎淇婇崶銊︽珷婵°倕鎳庣粻姘舵煛閸愩劎澧曢柣蹇撶－閿熷�燁潐濞叉牕煤閿濆绐楀┑鐘叉处閳锋帡鏌涚仦鍓ф噮闁告柨绉归弻锛勶拷锝庝簵閸嬨垻锟芥鍠楄ぐ鍐煡婢舵劕顫呴柣妯兼暩瀹曡埖绻濆▓鍨灍闁挎洍鏅犲畷妤�顫滈敓钘夘嚕閹间礁绫嶉柛顐ゅ枔閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷? by changhao
	 * @param requirelevel
	 * @param curexp
	 * @param skill
	 */
	public void AddExp(int curskilllevel, int curexp, xbean.PracticeSkill skill, int curmaxlevel)
	{
		int maxexp = LiveSkillManager.getInstance().GetPracticleSkillNeedExp(id, curskilllevel); //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫼闁荤姴娲ゅ鍫曞箲閿濆棛绠鹃柛娑卞亜閻忓弶顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ瑜嶉獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繄浠﹂崜褜娲搁梺缁樺姈閻ｎ亝绂嶅鍫熺厪闊洦娲栨牎闂佹悶鍊曞ú锕傚箞閵婏妇绡�闁告劏鏂傛禒銏犖旈悩闈涗沪闁绘濞�楠炲啫鈻庨幘宕囶唽闂佸湱鍎ら崵鈺呭Χ閸涱亝鏂�闂佺粯鍔樼亸娆撳箺閻樼數纾兼い鏂裤偢閸欏嫮锟借娲橀崹鍧楀箖閵忋倕浼犻柛鏇ㄥ亞娴滄澘鈹戦悩鍨毄濠殿喚鏁婚幊婵囥偅閸愩劎顔夐梺鐓庢憸閸嬶絾绂嶅鍫熺厵闁硅鍔栫涵楣冨疮閹间焦鈷戦柟绋挎捣閳句胶绱掗鑺ュ碍妞ゎ偄绻橀幖褰掑捶椤撶媴绱叉繝纰樻閸ㄤ即宕ョ�ｎ喖闂い鎾卞灪閳锋垿鏌ゆ慨鎰拷鏇㈠几閸岀偞鐓曢幖娣�撻崥顐︽煕濞嗗繑鍤囨慨濠冩そ楠炴劖鎯旈埗鈺傚闂備礁鎼幏瀣磻婵犲洤违闁告稑鐡ㄩ悡銉╂倵閿濆骸浜滅�殿喖鐏濋埞鎴炲箠闁稿﹥娲熼、鏍幢濞嗘瑦瀚规慨姗嗗墰缁夌儤鎱ㄦ繝鍛仩闁归濞�閸ㄩ箖鎼归銈勫闂傚倷鑳堕…鍫㈡崲閹达附鏅俊鐐�栧ú鈺冪礊娴ｅ壊鍤曢柛顐ｆ礀缁狅絾銇勯幘璺烘瀻闁稿繐锕缁樻媴閸涘﹤鏆堥梺鍛婃⒐閻楃偤濡甸幇鏉跨妞ゅ繐鎳忓▓鏉款渻閵堝棛澧紒瀣尵瀵囨晸娴犲鈷戞慨鐟版搐閻忓弶绻涙担鍐插椤╅攱绻濇繝鍌滃闁绘挾鍠愭穱濠囧Χ韫囨柨顏堕梻浣瑰濞诧附绂嶅鍫熷仼闁汇値鍨禍褰掓煙閻戞ê鐏︾�规挸绉撮—鍐Χ閸℃ê鏆楅梺闈╃祷閸庨亶鈥﹂崶顒佸亜闁稿繐鐨烽幏娲⒑闂堚晛鐦滈柛妯恒偢瀹曟繄锟斤綆鍋嗙粻楣冩煕濞嗗浚妲洪柣顓熷浮閺岀喖顢欓崗鐓庝淮闂佽桨鐒﹂幑鍥箰婵犲啫绶為柛鈩兩戦弶鎼佹⒒娴ｈ櫣甯涢柛鏃�鐗曢…鍥р枎閹炬潙锟藉爼鏌ㄩ弴鐐诧拷褰掓偂閻樺灚鍠愰柣妤�鐗嗙粭褔鏌ｉ敐鍡樸仢闁哄瞼鍠栭、娑橆潩鏉堚晛濮遍梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
		int exp = curexp;
		while (exp >= maxexp)
		{
			exp -= maxexp;
			
			curskilllevel ++;
			maxexp = LiveSkillManager.getInstance().GetPracticleSkillNeedExp(id, curskilllevel);
			if (maxexp == -1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堥悗鐟版啞缁诲啴濡甸崟顖氱闁瑰瓨绻冮崐顖氣攽閿涘嫬浠╁┑顔哄�栫粚杈ㄧ節閸パ咁啇婵炶揪缍�椤鈻嶉崱娆戠＝闁稿本鐟ч崝宥夋煥閺囨娅婄�规洦鍨伴鍏煎緞鐎Ｑ勫濠电偠鎻紞锟芥い顐㈩樀瀹曟垿鎮╃紒妯煎幈闁瑰吋鐣崹娲Φ濠靛牞鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顓洪梺缁橆焽閺佹悂宕濋崼鏇熲拻濞达綀娅ｉ妴濠囨煕閹惧绠樼紒顔界懇楠炴帒螖娴ｉ晲绨甸梻浣虹帛濡啴寮查懠顒佸床闁糕剝绋掗悡蹇涙煕椤愶絿绠樼紒鐘崇叀閹顫濋鍌溞ㄥ┑顔硷龚濞咃絿妲愰幒鎴建闁糕剝顭囬弳銉╂⒒娴ｇ懓顕滄繛鎻掔箻瀹曟洖鐣烽崶褍鐏婇柣搴秵閸犳牜绮婚幎鑺ョ厵闁告劘灏欓敍宥夋煕閻樺啿濮夌紒顕呭弮閹垻鍠婃潏銊︽珫婵犵數濮撮敃銈夊疮椤栫偛姹查柍鍝勬噺閳锋帡鏌涚仦鍓ф噮妞わ讣绠戦…鍧楁偡鐢喛鍚悗瑙勬礃閸ㄥ灝鐣烽悢纰辨晝閻庯綆鍋嗛埥澶愭懚閺嶎厽鐓曟繛鎴濆船楠炴﹢鏌ㄥ☉娆戞噭缂佺粯绻堥幃浠嬫濞磋缍侀弻銈堛亹閹烘梻鏆梺璇″枛濞硷繝銆佸鑸垫櫢濞寸姴顑呴拑鐔兼煏婵炵偓娅嗛柛瀣閺屾稓浠﹂崜褉妲堝銈呴獜閹凤拷 by changhao
			{
				skill.setLevel(curskilllevel);
				skill.setExp(0);
				return;
			}
		}
		
		if (curskilllevel > curmaxlevel)
		{
			curskilllevel = curmaxlevel;
		}
		
		skill.setLevel(curskilllevel);
		skill.setExp(exp);
	}
	
	public java.util.HashMap<Integer,Float> CalcSkillEffect(int skillid, int level)
	{
		java.util.HashMap<Integer,Float> effect = new java.util.HashMap<Integer,Float>();
		
		FightSkillConfig sconf = fire.pb.skill.Module.getInstance().getFightSkillConfig(skillid);
		if (sconf != null)
		{
			FightJSEngine engine = new FightJSEngine();
			engine.setSkillLevel(level);
			
			for (SubSkillConfig subskill : sconf.getSubSkills())
			{
				for (BuffUnit buffarg : subskill.getBuffUnits())
				{
						if(buffarg==null)
						continue;
					for(Map.Entry<Integer, JavaScript> entry : buffarg.effectJavascriptMap.entrySet())
					{
						effect.put(entry.getKey(), entry.getValue().eval(engine,null,null).floatValue());
					}
				}
			}				
		}					
		
		return effect;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800505;

	public int getType() {
		return 800505;
	}

	public int id; // 技能ID by changhao
	public int times; // 学习次数 by changhao
	public int itemid; // 使用的道具 by changhao

	public CRequestLearnParticleSkill() {
	}

	public CRequestLearnParticleSkill(int _id_, int _times_, int _itemid_) {
		this.id = _id_;
		this.times = _times_;
		this.itemid = _itemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(times);
		_os_.marshal(itemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		times = _os_.unmarshal_int();
		itemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestLearnParticleSkill) {
			CRequestLearnParticleSkill _o_ = (CRequestLearnParticleSkill)_o1_;
			if (id != _o_.id) return false;
			if (times != _o_.times) return false;
			if (itemid != _o_.itemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		_h_ += times;
		_h_ += itemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(times).append(",");
		_sb_.append(itemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestLearnParticleSkill _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		_c_ = times - _o_.times;
		if (0 != _c_) return _c_;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


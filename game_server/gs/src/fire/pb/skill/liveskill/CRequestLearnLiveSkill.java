
package fire.pb.skill.liveskill;

import java.util.HashMap;

import fire.log.beans.RoleSkillUpBean;






import fire.pb.attr.SRefreshRoleData;
import fire.pb.buff.BuffConstant;
import fire.pb.clan.srv.ClanManage;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.skill.Result;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestLearnLiveSkill__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆鐓ラ柡鍐ㄥ�瑰▍鏇㈡煕濮楋拷濞佳囧煘閹达附鍊烽柤纰卞墮椤ｆ椽姊虹拠鑼缂佽鍊块崺銏狀吋閸涱亝鐎婚梺瑙勫劤椤曨參宕㈤悽鍛婂�甸柣鐔告緲椤忣亝绻濋姀鈭额亜宓勬繝鐢靛У绾板秹鎮￠崘顔界參婵☆垯璀﹀Ο鍫熶繆閸欏鍊愰柡宀嬬秮閺佹劙宕惰楠炲鎮楃憴鍕闁绘牕銈稿畷娲晸閻樿尙顦ㄥ銈呯箰鐎氼噣宕愰悙鐢电＝闁稿本鑹鹃敓鑺ユ倐瀹曟劙骞栨担鍝ワ紮婵＄偛顑呯�涒晜鍒婃總鍛婄厸閻忕偠顕ч崝婊堟煛閸涱喗鍊愰柡宀嬬畱铻ｅ〒姘煎灡绗戦梻浣告惈濡粍銇旈幖浣肝﹂柛鏇ㄥ枤閻わ拷闂佹寧绻傞幊搴ｇ尵瀹ュ鈷戦柛婵嗗閻忛亶鏌涢悩宕囧⒌闁靛棔绀侀埢搴ㄥ箻閺夋垶顓奸梻渚�娼ч悧鍡椕洪妸鈺佸偍妞ゆ牜鍋為埛鎺懨归敐鍥╂憘闁搞倕鍟撮弻娑㈡偐閾忣偄纾抽悗瑙勬礀缂嶅﹪骞愭繝鍐ㄧ窞閻忕偟鍋撻鏇㈡⒒娓氾拷濞佳団�﹂鐔剁箚闁搞儮鏅濇稉宥夋煙椤栧棗鐬奸崬鐢告煟閻樼儤顏犻柛搴涘�濆畷顖炴倷閻戞鍘遍梺鍐叉惈閸婅煤鐎涙ɑ鍙忓┑鐘插亞閻撹偐锟借娲樼敮鎺楀煝鎼淬劌绠抽柟瀛樼箓閼垫劕鈹戦悩鍨毄闁稿鐩獮濠傜暆閸曨偄鐎繛瀵稿Т椤戝洤鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬閺夆晜绻堥弻锝嗘償椤栨粎校闂佸摜濮甸悧婊呭垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷?
 * @author changhao
 *
 */
public class CRequestLearnLiveSkill extends __CRequestLearnLiveSkill__ {
	@Override
	/* 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�甸敓鏂ょ畵瀹曞爼鍩￠崘褏鐟濆┑掳鍊х徊浠嬪疮椤栫偞鍋傞柕澶嗘櫆閻撶喖鏌￠崒姘变虎妞わ絾濞婇弻锝夘敇閻旂儤鍣伴梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧伴柣锕�鐗撳鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ鍓х厜濠殿喖锕ㄥ▍锝夊礌閺嶎厼鍗抽柣鎰ゴ閹枫倝姊绘担鍛婂暈婵﹤婀遍弫顕�鎮欓悜妯烘疅闁哄鐗勯崝搴ｅ姬閿熻棄鈹戦鏂や緵闁告ɑ鎮傞獮蹇撁洪鍛嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥朵簻椤╊剛绱掗纰辩吋妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋呴崣蹇斾繆椤栨粌甯堕悽顖氱埣閺岋紕锟斤絻鍔岄敓鑺ョ箞瀵鈽夐姀鈥充汗闁荤姴娉ч崱妤佸創闂傚倷娴囧銊╂倿閿曞倸绠查柛銉墮閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓 roleid by changhao*/
	protected void process() {
		// protocol handlen 
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestlearnliveskill = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (fire.pb.buff.Module.existState(roleid, BuffConstant.StateType.STATE_BATTLE_FIGHTER))
				{
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 142383, null);
					return true;
				}
				
				fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(id);
				
				if (config == null)
				{
					LiveSkillManager.logger.error("CRequestLearnLiveSkill config error:" + id);
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
			
				fire.pb.skill.SkillRole skillrole = new fire.pb.skill.SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(id);
				
				int requireLevel = 1; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢鎾煛閿熶粙鏌嗗鍛傦箓鏌涢弴銊ョ仩妞ゎ偄鎳橀弻宥夋寠婢跺妫￠梺姹囧�撶欢姘潖閾忚瀚氶柍銉ㄦ珪閻忎線姊洪幖鐐插婵☆偄瀚伴幃楣冩倻缁涘鏅濋梺鎸庢穿閹风兘宕鐐粹拺闂傚牊鐩悰婊呯磼鏉堛劍绀冪紒鍌氱Ч閹瑩鎮滃Ο閿嬪闂備胶顭堥張顒勬偡閵娾晛绀傜�癸拷閿熺晫妲愰幒妤婃晪闁告侗鍘炬禒鎾⒑閸︻厾鎽傞柛瀣躬楠炲啫鐣￠柇锔惧弳闂佸憡娲﹂崜娑㈠礄閿熺姵鈷戦柛婵勫劚閺嬫垿鏌熼崨濠傗枙闁绘侗鍣ｅ畷姗�顢欓懞銉︻仧闂備胶绮…鍫焊濞嗘挻鏅繝濠傜墛閳锋垹绱撴担濮戭亝鎱ㄩ崶銊ｄ簻闁哄洢鍔屽顔撅拷瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸浜愰柟閿嬫そ濮婂宕掑鍗烆杸婵炴挻纰嶉〃濠囧箖閻愭番鍋呴柛鎰ㄦ櫇閸橀亶鏌熼崗鑲╂殬闁告柨顑夐獮澶愭倷椤戝彞绨婚梺闈涚箚閸撴繈藟閸喆浜滈柕蹇婂墲缁�瀣煛娴ｇ锟藉潡骞冮崜褌娌柦妯侯槺椤旀垿姊婚崒姘拷鐑芥倿閿曞倸鍑犲┑鍌滎焾閻ょ偓绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閸洘顎嶉梺绋匡工閻栧ジ寮诲澶婁紶闁告洦鍓欏▍銈夋⒑缂佹ɑ灏甸柛鐘崇墵瀵寮撮悢椋庣獮濠碘槅鍨靛▍锝嗙椤撱垺鐓熼幖娣灮閸熸煡鏌熼崙銈嗗? by changhao
				
				if (liveskill != null)
				{
					requireLevel = liveskill.getLevel() + 1;
				}
				
				if (requireLevel > config.skillLevelMax) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閳哄懏鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃顏堝箠閻愬搫唯鐟滃繗銇愰悙顒傜瘈闁汇垽娼у瓭濠电偛鐪伴崐婵嬪箖閸ф鏁嬮柨鐔剁矙瀵鈽夊Ο閿嬵潔濠碘槅鍨伴崥瀣箟婵傚憡鈷戠紓浣股戠亸闈涒攽椤旀儳鍘撮柟顖ゆ嫹濡炪倕绻愰悧鍡欑棯瑜旈弻娑⑩�﹂幋婵囩仌闂佺硶鏅濋崑鐐垫崲濠靛鐓曢柨鐔剁矙瀹曟帒顫濋鍌樺仏闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝夛拷娑氱畾闂佺粯鍨煎Λ鍕暜闂備焦瀵уú鈺呭箯闁垮绠鹃柛顐ゅ櫏濞堟粓鏌熼绛嬫當闁崇粯鎹囧畷褰掝敊閻ｅ奔閭梻鍌欒兌缁垶鎮у鍫濆偍鐟滄棃骞冩ィ鍐╃叆閻庯綆鍓熷顕�姊洪崨濠勨槈闁挎洏鍊栫粋宥咁煥閸喎锟界敻鏌ｉ悢鍛婄凡妞ゅ浚浜濈换婵嬪閳藉棛鍔稿銈忕导缁瑥顫忔繝姘＜婵﹩鍓ㄩ幏鐑芥倻閼恒儱娈戦梺鍛婃尫閻掞箓宕楀鍫熺厱妞ゆ劧绲剧粈锟介梺姹囧�楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳娴犻箖姊虹粙鍨劉妞ゃ劌锕璇测槈濮橆偅鍕冮梺璇″瀻閸愨晝妲楅梻鍌欑劍閹爼宕愰弽顬℃椽鎮㈤悡搴ゆ憰闂侀潧艌閺呮粓宕戦崱娑欑厱閻忕偛澧介埥澶嬨亜韫囥儲瀚�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬫鍎忔い锔炬暬瀵寮撮敍鍕澑闁诲函缍嗘禍鐑藉箯閻戣棄鍗抽柣鎴濇閺呯姴鈹戦悩缁樻锭婵炲眰鍨虹粋宥咁煥閸喓鍘搁悗骞垮劚閸燁偅淇婇崸妤佺厓闁告瑣鍎崇粣鏃堟煛鐏炲墽鈾侀柟顖涙椤㈡瑩鎳栭埡锟介崠鏍磽閸屾瑦绁板瀛樻倐楠炴垿宕惰閺嗭箓鏌熼悜妯虹亶闁哄閰ｉ弻鐔猴拷鐢殿焾鍟搁梺纭呮閻倸顫忕紒妯诲闁绘垶锚濞堝矂姊洪幖鐐诧拷鏍偋閻樿崵宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillMaxLimit));
					return false;						
				}
				 
				fire.pb.skill.SLifeSkillCost cost = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkillCost.class).get(requireLevel);
				if (cost == null)
				{
					LiveSkillManager.logger.error("CRequestLearnLiveSkill cost error:" + requireLevel);					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return false;					
				}
				
				xbean.Properties roleproperty = xtable.Properties.get(roleid);
				
				int roleidlevel = roleproperty.getLevel();
				
				if (config.studyLevelRule > 0)
				{
					int needLevelLimit = cost.needLevelList.get(config.studyLevelRule - 1);
					if (roleidlevel < needLevelLimit) //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥ュ焺閺佸秹鏌ｉ幇顖氱毢妞わ富鍣ｉ弻鐔煎礂閼测晜娈梺鍛婃煥閻倿骞冮垾鏂ユ斀閻庯綆鍋嗛崢鎼佹⒑閸涘﹤濮傞柛鏂挎湰缁傚秵瀵肩�涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾村亗閹兼惌鍠楃紞鎾绘⒒閸屾艾锟界兘鎳楅崼鏇炵疇闁规崘顕ф惔濠囨煛鐏炶鍔撮柡浣稿閺屾稑鈽夊涔樺鏌ㄩ悢璇残撻柣妤侇殘閹广垹鈹戠�ｎ亞鍊為梺闈涱煭闂勫嫰顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟� by changhao
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;						
					}					
				}
				
				if (config.needGuild == 1 && roleproperty.getClankey() <= 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閿曞倹鐓欑紒瀣儥閻撳ジ鏌熼鍝勭伈妞ゃ垺顨婂畷鐔碱敃閵堝骸鏁搁梻鍌氬�风粈渚�鎮樺┑瀣垫晞闁告洦鍘藉畷鏌ユ煕閳╁叇婊勭濠婂牊鐓欏ù鐓庣摠濞懷冾熆瑜滈崹鍫曞箖濡わ拷椤繈鎮欓锟介锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢瀛樸亜閵夛附宕岄柡浣规崌瀹曟劙鎮ゆ担鍦Х婵犵數鍋炵粊鎾疾濠靛牊顫曢柣鎰摠婵挳鏌涢幘鏉戠祷婵炲牄鍔戝娲捶椤撯剝顎楅梺鍝ュУ椤ㄥ﹤鐣烽幋锕�绀嬫い鎰枑閺傦拷闂備胶顭堥張顒勫礄閻熸嫈锝夊川婵犲嫮顔曢梺鍓插亽閸撴氨锟芥熬鎷�? by changhao
				{
					MessageMgr.psendMsgNotify(roleid, 150027, null);
					return false;	
				}
				
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋婵愭綗闁跨喕妫勯崐鍧楀箰婵犲啰鐝堕柍鍝勵儑缁夘喚锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫鎼佹⒒閸屾瑦绁版繛澶嬫礋瀹曟娊鏁冮崒姘鳖唵闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灣缁垶宕曟惔銊︹拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶娢熼柨瀣垫綌婵犵數鍋涘Λ娆撳礉閺囥垹绀堢憸鐗堝笚閳锋垿寮堕悙鏉戭棆妞わ讣闄勬穱濠囶敃閿濆洨鐤勯悗娈垮枛椤兘寮幇顓炵窞濠电姴鍠氬Λ鐔兼⒒娴ｅ憡璐℃い顓炵墢閿熻姤绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏娲倵鐟欏嫭绀�婵炲眰鍔庨弫顔尖槈濞嗘垹顔曢梺鑲┾拡閸撴瑩寮稿☉姘炬嫹濞堝灝鏋涙い顓犲厴瀵偊骞囬弶鍨獩闂佺鏈划宀勫几濞戙垺鐓欓柣鎾虫捣缁夋椽鏌熼姘拷鍨暦椤愶箑唯鐟滄粌危閹间焦鈷掗柛灞剧懅椤︼箓鏌熼懞銉х煉鐎规洑鍗抽獮鍥级鐠恒劎鏆梻浣侯焾閺堫剟宕欓悷閭︾劷闁哄稁鍘介悡锝夌叓閸ャ劌鍤繛鍏煎姍閺屾稖绠涢弮鍌滅厜濠殿喖锕ュ钘夌暦瑜版帩鏁嬮柛娑卞幖婢瑰牊淇婇悙顏勶拷鏇燁殽韫囨稑绠柨鐕傛嫹? by changhao
				
				if (config.studyCostRule > 0)
				{
					int silverCost = cost.silverCostList.get(config.studyCostRule - 1);
					
					Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(
							roleid, fire.pb.item.BagTypes.BAG, false);
					
					if (bag.getMoney() < silverCost)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					if(bag.subMoney(-silverCost, LiveSkillManager.LiveSkill, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuilianjin, 0) != -silverCost)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;	
					}
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡灞诲姂瀵噣宕堕…鎴烆棄婵犵數鍋涢悧濠囧垂閸ф钃熼柨婵嗩槹閸嬫劙鏌ゆ慨鎰拷妤冪玻濡ゅ懏鈷戦梻鍫熺♁閿涙棃鏌熸搴″幋婵﹥妞藉畷顐﹀礋闂堟稑澹夋繝纰樻閸嬪嫰宕弶鎴殨濠电姵纰嶉崑鍕煟濮橆剛鎽犻悗姘秺閺岋綁濮�閳藉棗鏅遍梺缁樺浮缁犳牕顕ｆ禒瀣櫢闁绘ɑ鏋奸幏娲⒑閸涘﹦绠撻悗姘煎弮钘熼柣鎰暩绾惧吋銇勯弮鍥т汗閺佸牊绻濈喊澶岀？闁轰浇顕ч悾鐑芥偄绾拌鲸鏅┑顔筋焾娴滎剙顭囨径鎰拻濞达綀顫夐崑鐘绘煕鎼搭喖鐏︾�规洘绻冮幆鏃堝Ω閵夊簺鍎遍埞鎴︽偐閹绘帊绨藉┑鐐存尭椤兘寮婚弴銏犻唶婵犻潧妫崝澶岀磽娴ｈ棄鐓愰柣鈺婂灦瀵鎮㈤悡搴ｎ槱闂侀潧鐗嗗Λ妤咁敂閿燂拷 by changhao
				if (config.studyCostRule > 0)
				{
					int needfactioncontr = cost.guildContributeCostList.get(config.studyCostRule - 1);
					if (needfactioncontr > 0)
					{
						boolean ok = ClanManage.delContribution(roleid, needfactioncontr, LiveSkillManager.StudyLiveSkill, false);
						if (ok == false) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑磿閹寸姵鍠愰柣妤�鐗嗙粭鎺楁煛閸曗晛鍔﹂柡灞剧洴瀵挳濡搁妷褌鍝楅梻浣规偠閸斿矂宕愰幖浣哥厴闁硅揪绠戠壕鍏肩節婵犲倹鎹ｉ柛鏂挎憸缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娑㈠箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄妞ゆ梹鐗犲鎶芥晸閻樻枼鎷虹紓浣割儓濞夋洜绮婚懠顒傜＜妞ゆ棁濮ゅ畷宀�锟芥鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄨ崵绱撻崒姘拷鐑芥倿閿曞倹鏅濋柍杞扮导濞戙垹绀嬫い鏍ㄧ▓閹锋椽鏌ｆ惔鈩冭础濠殿喚鏁昏棢濠㈣泛顑冩禍婊堟煥閺冨倸浜鹃柡鍡╁墴閺岋絽鈽夐崡鐐寸亪闁句紮缍侀弻褑绠涘鍏肩秷濠电偛鐗撶粻鏍ь潖濞差亜绠归柣鎰絻婵骸鈹戦埥鍡椾簻闂佸府绲介悾鐑芥偡閹冲﹥妞介、鏃堝礋鎼搭垳鐣甸柡灞剧洴瀵挳濡搁妷锔惧蒋婵犵绱曢搹搴㈢椤忓嫷娼栨繛宸簼閸嬶繝鏌℃径瀣嚋妞ゆ棑鎷烽梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷� by changhao
						{
							psend(roleid, new SSkillError(SkillConstant.SkillError.ContributeNotEnough));
							return false;						
						}					
					}						
				}			
				
				if (liveskill == null)
				{
					xbean.LiveSkill e = xbean.Pod.newLiveSkill();
					e.setLevel(requireLevel);
					skillrole.getLiveSkills().put(id, e);
					
					liveskill = e;
				}
				else
				{
					liveskill.setLevel(requireLevel);					
				}
				
				if (config.skillId != 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︺儳绱撻崒姘毙㈤柨鏇ㄤ邯閻涱噣宕橀埡鍐炬祫闁诲函缍嗛崑鎺懳涢崘顔解拺闁告劕寮堕幆鍫ユ煕閻旇泛宓嗛柛鈺嬬秮婵¤埖寰勭�Ｑ勫濠电偠鎻徊鍧楀箠閹炬椿鏁嬫繝濠傚缁犻箖鏌涘▎蹇ｆШ濠⒀呮暩閿熷�燁潐濞叉﹢宕濆▎蹇曟殾妞ゆ劧绠戝敮閻熸粌绻橀幃鐐哄礂閼测晝鐦堥梺闈涢獜缁蹭粙鎮￠幇鐗堢厱闁哄喛鎷烽柣妤冨█楠炲啴妾辩紒鐘崇洴楠炴﹢顢涘☉娆愭緫闂傚倷鑳剁划顖炩�﹂崼顫剨婵炲棙鍨规稉宥夋煙閹澘袚闁绘挾鍠栭弻銊モ攽閸♀晜啸闂佽鐓＄粻鏍蓟閻旂厧纾归柣鏂挎憸閵嗘劕顪冮妶搴′簼缂佽鐗撻獮濠傤煥閸涱厽鐎冲┑鈽嗗灥椤曆囶敂閸︻厾纾介柛灞剧懆閸忓矂鏌ц箛鎾诲弰鐎规洩缍佸畷姗�顢欓懖鈺佹憢闂佸搫顦悧鍐疾椤忓牆绠�瑰嫰鍋婂鈺呮煟閹伴潧澧い蹇ユ嫹? by changhao
				{
					Result result = new Result(true);
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴懞銉с�婇梺鍝ュУ閹稿骞堥妸褝鎷烽棃娑欐喐缁炬儳銈搁弻宥夊传閸曨剙娅ら梺鎶芥敱閸ㄥ爼濡甸崟顖氱闁绘劖娼欓鍓佺磽閸屾瑧顦︽い锔垮嵆楠炴劙骞庨挊澶岊唵闂佺鎻梽鍕磻閸曨偀鏀介柛灞惧嚬濡叉椽鏌涢悙鍨毈婵﹥妞藉畷銊︾節閸愩劎鐓梻浣哄帶閸熷潡鎮ユ總绋跨畺闁绘垵澹欐径鎰仧闁跨噦鎷� by changhao
					result.updateResult(skillrole.addLiveSkillBuff());	
				
					if(!result.getChangedAttrs().isEmpty())//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄被鍔戦幃銏ゅ传閸曟垯鍨婚惀顏堝箚瑜滈悡濂告煛鐏炲墽鈽夐柍钘夘樀瀹曪繝鎮欓幓鎺濆妧濠电姷鏁搁崑娑㈡儍閻戣棄鐤鹃柣妯款嚙閽冪喖鏌￠崶鈺佹灁缂佺娀绠栭弻锝夊箛闂堟稑顫梺缁樼箖濞茬喎顫忛搹鍦煓婵炲棙鍎抽崜浼存⒑缁嬪尅宸ユ繛灏栵拷鎰佸殨濠电姵鑹炬儫闂侀潧顦崹娲綖瀹ュ應鏀介柍钘夋閻忕喖鎮归敓浠嬫晜閻ｅ矈娴勯梺鑽ゅ枑婢瑰寮ㄦ禒瀣厽闁归偊鍨伴惃娲煟閹烘挸鍔ら棁澶嬬節婵犲倻鍑归梺顓у灣閿熻姤顔栭崰鏍�﹂悜钘夋瀬闁归偊鍘肩欢鐐测攽閻樻彃顏柡澶嬫倐濮婄粯鎷呯粙鎸庡�梺璇″枛閸婃悂鈥﹂崶顏嶆▌濡炪們鍨哄Λ鍐极閹剧粯鏅搁柨鐕傛嫹?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鏋涢柛銊︾箘閿熺晫娅㈤幏鐑芥煕閺囥劌澧伴柛妯诲姍濮婃椽骞愭惔锝囩暤闂佺懓鍢查澶婄暦閻㈢鍗抽柣鏃傜節缁ㄥ姊虹憴鍕凡濠⒀冮叄楠炲啯绺介崨濞炬嫽闂佸憡娲﹂崑鍕敂椤愩倗纾奸弶鍫涘妼缁椦囨煥閻斿憡鐏紓宥呮瀹曘垽鎮剧仦鎯у幑闂佺厧鎽滈崑锝嗙濠婂牊鐓ラ柡鍌氱仢閹垿鎮楀鐐? by changhao
					{
						mkdb.Procedure.psendWhileCommit(roleid,new SRefreshRoleData((HashMap<Integer, Float>)result.getChangedAttrs()));
					}
				}
				
				SUpdateLearnLiveSkill msg = new SUpdateLearnLiveSkill();
				msg.skill.level = liveskill.getLevel();
				msg.skill.id = id;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);

				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleid));
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ц箛锝呬簼闁绘縿鍔嶇换婵嬫偨闂堟刀銉︺亜閿濆牊顥夐崡閬嶆煕濞戞瑦缍戠痪鎯ь煼閺屾稑鈽夊Ο鍏兼喖闂佺楠哥�涒晠濡甸崟顖氬唨妞ゆ劦婢�缁爼姊洪崫鍕仴闁稿海鏁诲濠氬即閿涘嫮鏉搁梺闈涳紡閸滃啰鍚归梻鍌氬�搁崐鍝ワ拷姘煎墰閿熻姤鐭崡鍐差嚕鐠囨祴妲堟俊顖炴敱椤秴鈹戦绛嬫當闁绘妫欑�靛ジ骞囬鐘殿啎闁诲海鏁搁…鍫熺墡婵犵绱曢崑鐘参涢崟顖ょ稏闊洦绋掗幆鐐烘煕閿旇骞橀柨娑欑矊閳规垿鍩ラ崱妤冧淮閻庤娲滈弫璇茬暦閿濆骞㈡繛鎴炵憿閹疯櫣绱掔紒銏犲箹闁瑰嘲顑夊畷鐢碉拷锝庡墰绾捐偐绱撴担璇＄劷缂佺姵鐗曡彁闁搞儜宥堝惈闂佽鍠曠划娆忕暦閵婏妇绡�闁稿本鐟ч惄搴ㄦ⒒閸屾瑨鍏屾い顓炵墢閹广垹螖閸涱厾锛涢梺鍦濠㈡﹢宕掗妸鈺傜厽闁靛繒濮甸崯鐐烘煃闁垮鐏撮柟顔肩秺楠炰線骞掗幋婵愮�虫繝鐢靛仜閹冲繘宕濆▎鎾宠摕闁绘梻鍘х粈鍕煏閸繃顥滄い蹇ユ嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁妫橀悹鎭掑妽濞堟儳顪冮妶鍡欏⒈闁稿鐩弻銊╁Χ閸℃洜绠氶梺闈涚墕鐎氼噣宕濆鍡欑闁告侗鍋勯悘鍙夋叏婵犲嫬鍔嬮悗鐢靛帶閳诲酣骞嬪┑鍡欏帓闂傚倷绀侀崥瀣渻閸ф鍨傞悹杞拌閸ゆ洟鏌熼梻瀵割槮缂佺媴缍侀弻锝呂熼崫鍕瘣闂佸搫顑嗛崹鍨潖閾忚鍏滈柛娑卞枤閵嗘劙姊洪幐搴㈢８闁稿﹥娲滈崣鍛存⒑閹稿孩绀�闁稿﹤缍婂畷鎴﹀磼閻愬鍘搁梺鎼炲劘閸庨亶鎮橀鍫熺厽闁规儳顕幊鍥煛瀹�瀣М妤犵偛顑夐幃娆撳幢濡櫣浠兼繛瀛樼矋閹倿銆佸锟介幃銏㈢礄閻樼數娉块梻鍌欑窔濞佳囁囬銏犵？婵炲樊浜滅壕鍧楁煛閸愩劎澧涢柣鎾寸〒閿熺晫娅㈤幏鐑芥倵閿濆骸澧扮悮锕傛⒒娴ｈ櫣銆婇柡鍛〒閿熻姤纰嶅姗�鎮惧畡閭︽建闁跨喕濮ゆ穱濠傤潰瀹�濠冃ㄩ梻浣筋嚃閸ｎ垳绱炴担鍓叉綎缂備焦蓱婵挳鏌涢敂璇插箺闁煎灝娲铏圭矙閸ф锟芥銇勯鐘插幋闁绘侗鍠涚粻娑樷槈濞嗘劖顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
				fire.pb.course.CourseManager.checkAchieveCourse(roleid, fire.pb.course.CourseType.SHENG_HUO_JINENG, liveskill.getLevel());
				fire.log.YYLogger.roleSkillUPLog(roleid, new RoleSkillUpBean(id, liveskill.getLevel()));
				return true;
			}
		};
		
		requestlearnliveskill.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800515;

	public int getType() {
		return 800515;
	}

	public int id;

	public CRequestLearnLiveSkill() {
	}

	public CRequestLearnLiveSkill(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestLearnLiveSkill) {
			CRequestLearnLiveSkill _o_ = (CRequestLearnLiveSkill)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestLearnLiveSkill _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


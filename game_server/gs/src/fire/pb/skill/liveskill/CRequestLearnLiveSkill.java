
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
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｉ柨鏃傛櫕閸橀潧鈹戦悙鑼闁诲繑绻傞埢宥呪枎閹惧鍘甸悗鐟板濠㈡ê危婵犳碍鐓冮柦妯侯樈濡叉悂鏌ｉ敐鍥у幋鐎规洖鐖奸崺锟犲礃椤忓嫮鍊炵紓鍌氬�搁崐鎼佸磹妞嬪孩濯奸柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁哄棜椴搁妵鍕疀閿濆懎绫嶉梺鍝勭灱閸犳牠銆佸▎鎾村殥闁靛牆娲ㄩ崢顖炴⒒娴ｇ瓔鍤冮柛鐘虫崌瀹曞綊鎸婃径灞炬闂侀潧顭俊鍥╃不閹岀唵閻犺櫣鍎ら崯鐐烘煕閳哄倻娲存慨濠傤煼瀹曟帒鈻庨幒鎴濆腐婵犵數鍋涢幊宀勫垂娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀杩濋柣搴秵閸犳牜绮婚鐐寸叆闁绘洖鍊圭�氾拷?
 * @author changhao
 *
 */
public class CRequestLearnLiveSkill extends __CRequestLearnLiveSkill__ {
	@Override
	/* 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛矒濮婅櫣鍖栭弴鐐测拤闂佸憡姊圭敮鐐烘嚍鏉堛劎绡�婵﹩鍘搁幏娲⒑閸涘﹦鈽夐柨鏇缁骞樼紒妯猴拷鍨叏濡厧甯堕柡瀣ㄥ�濋弻娑㈡偐鐠囇嗗惈闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹 roleid by changhao*/
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
				
				int requireLevel = 1; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴閺�閬嶅Φ閸曨垰顫呴柍钘夋閻や線姊虹拠鈥虫灁闁搞劏妫勯悾鐑筋敃閿曪拷鍞梺闈涢獜缁辨洘绂嶉悙鐑樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仴闁圭瓔鍋婇幃宄邦煥閸曨剛鍑￠梺鍝ュ枑閹告娊鐛崘顔芥櫢闁绘灏欓敍婊堟⒑缂佹ê濮囨い鏇ㄥ弮瀹曘垺绂掔�ｎ偀鎷洪梻鍌氱墛娓氭鎮炴ィ鍐╃厱閹兼番鍔嬮幉鐐亜閵忊剝顥堟い銏℃礋閺佸倿鎮剧仦钘夌闂傚倷鐒﹂弸濂稿疾濞戙垹鐤い鎰堕檮閸婂爼鏌嶉崫鍕櫤闁绘挾鍠栭弻鏇熷緞濡櫣浠柣搴㈢啲閹凤拷? by changhao
				
				if (liveskill != null)
				{
					requireLevel = liveskill.getLevel() + 1;
				}
				
				if (requireLevel > config.skillLevelMax) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹪鎳為妷褏褰炬繝鐢靛Т濞层倝鎮块锟介弻娑樷槈濡吋鎲奸梺缁樻尵婵兘鎯�椤忓牆绾ч柛顭戝枦閸╃偞绻濋埛锟介崒姘ギ闂佸搫鐭夌紞浣逛繆閻戣棄唯闁挎洩鎷锋繛鍫燁殜閹鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃柨瀣檮闁告稑锕ゆ禍婊堟倵閻熸澘顏繝銏☆焾椤ｄ粙姊婚崒姘拷鐑芥嚄閸撲焦鍏滈柛顐ｆ礀閻ょ偓绻涢幋娆忕仾闁稿孩顨婇弻娑氫沪閹冩瘓闂佹悶鍊栧ú鐔煎蓟閵娾晜鍋嗛柛灞剧☉椤忥拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐑嗗晠婵犻潧娲㈡禍婊堟煛瀹ュ啫濡块柍鍙ョ窔閺屾稒鎯旈鑲╀化缂備浇椴搁幑鍥х暦閹烘垟鏋庨柟瀵稿Х閹藉矂姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷? by changhao
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
					if (roleidlevel < needLevelLimit) //缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇㈩敍閻愯尙顦柟鍏肩暘閸斿矂鎮″┑瀣厸闁告劑鍔屾禍浼存煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經闂傚倷鑳堕幊鎾诲床閺屻儺鏁勯柛娑氳ˉ閿熻姤鐗楃换婵嬪炊閵婏附顏熼梻浣芥硶閸ｏ箓骞忛敓锟� by changhao
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;						
					}					
				}
				
				if (config.needGuild == 1 && roleproperty.getClankey() <= 0) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵闂備礁鐏濋鍕崲閸℃ǜ浜滈柟浼存涧婢ь垶鎮楀鐐?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴椤ユ捇鏁撻崐鐕佹綈婵炴祴鏅濈槐鐐存媴閸撴彃娈ㄩ梺鍦檸閸犳宕戦崟顐熸斀闁稿本鍑瑰Σ鍛婄箾閸剚瀚�? by changhao
				{
					MessageMgr.psendMsgNotify(roleid, 150027, null);
					return false;	
				}
				
				//婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡粯鍎庨梺杞扮鐎氫即寮诲☉妯锋婵炲棙鍔曢崜褰掓⒑鏉炴壆顦︽俊顐ｇ箞瀵鏁愭径濠冾棟闂佸湱顭堢�涒晠宕伴幇鐗堚拺鐎规洖娲ㄧ敮娑欑箾閼碱剙鏋涚�殿喖顭烽弫鎰板川閸屾粌鏋涢柟鐓庣秺閹倿宕妷褜妲搁梻鍌欑閹芥粓宕伴幇鏉跨畺闁稿本鍑瑰鏍煣韫囨凹娼愰柛蹇旂矒濮婃椽宕归鍛壈濡炪倕楠忛幏锟�? by changhao
				
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
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					if(bag.subMoney(-silverCost, LiveSkillManager.LiveSkill, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuilianjin, 0) != -silverCost)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;	
					}
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ㄩ弮鍥棄婵炲牊鍨块弻锝夋偐閼姐倗绐楅梺闈涙４閹风兘姊洪崫鍕靛剱婵☆偄鍟村濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖寮介敓鐘斥拺闁告繂瀚ˉ鐐电磼椤旇偐效濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣规偠閸庮垶宕濇惔銊ノュ┑鐘插亞濞撳鏌曢崼婵嗩劉缂佽埖鐩弻鐔煎礄閵堝棗顏� by changhao
				if (config.studyCostRule > 0)
				{
					int needfactioncontr = cost.guildContributeCostList.get(config.studyCostRule - 1);
					if (needfactioncontr > 0)
					{
						boolean ok = ClanManage.delContribution(roleid, needfactioncontr, LiveSkillManager.StudyLiveSkill, false);
						if (ok == false) //闂傚倸鍊搁崐鐑芥倿閿曞倹鍎戠憸鐗堝笒閺勩儵鏌涢弴銊ョ仩闁搞劌鍊搁埞鎴﹀磼濠婂海鍔哥紓浣瑰姈椤ㄥ棛鎹㈠☉銏犵闁绘劖顔栭弳锟犳⒑缁嬭法绠茬紒顔芥崌瀵濡搁埡鍌氫簻缂傚倷鐒﹂敃鈺佄涢崟顖涒拺閻庡湱濮甸ˉ澶嬨亜閿旂偓鏆柣娑卞枛铻ｉ柧蹇氼潐濞堥箖姊洪幖鐐插姎婵☆偄閰ｅ畷鐟懊洪鍕庯箓鏌涢弴銊ユ珮婵＄虎浜娲偡閺夋寧顔�闂佺懓鍤栭幏锟� by changhao
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
				
				if (config.skillId != 0) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕缂傚秴锕獮鍐╃鐎ｎ偒妫冮梺鍐叉惈閸熶即鍩ｉ妶澶嬧拻濞达絿鎳撻婊勭箾閸欏澧电�规洘鍔欏畷顐﹀Ψ瑜忛悞鍏肩節閵忥絽鐓愰柛鏃�鐗犻幃陇绠涢幘顖涙杸闂佺粯顭堢亸娆戠不閹惰姤鐓熼柨婵嗩槷閹查箖鏌熼崐鐔哥【妞ゎ偅绻堥幊婊呭枈濡顏圭紓鍌欒兌閾忓酣宕ｉ崘顔肩哗閺夊牃鏅幏宄邦潩閻愵剙顏�? by changhao
				{
					Result result = new Result(true);
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣芥硶閸犳挻鎱ㄧ�靛摜纾奸柍鍝勬噺閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箯閹达附鍋勫┑鍌氼槺閸炵敻姊洪崨濠冨矮闁煎啿鐖奸幃鐑剿夐悵锟� by changhao
					result.updateResult(skillrole.addLiveSkillBuff());	
				
					if(!result.getChangedAttrs().isEmpty())//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閵夈垺顫嶅┑鈽嗗灟鐠�锔界閻熸壋鏀介柣鎰皺閻掓儳霉濠婂簼閭�殿喖顭烽弫鎰緞婵犲嫮鏉搁梻浣稿悑閹倸顭囪椤㈡棃鏁撻敓锟�?闂傚倷娴囧畷鐢稿窗閹邦喖鍨濈�癸拷閸曨剛鍘愰梺鎸庣箓閹峰宕甸弴鐔翠簻闁规澘澧庨幃濂告⒒閸曨偄顏紒杈ㄥ笧閿熸枻缍嗛崢鐣屾兜閼哥偣浜滈柨鏂垮悑鐎氾拷? by changhao
					{
						mkdb.Procedure.psendWhileCommit(roleid,new SRefreshRoleData((HashMap<Integer, Float>)result.getChangedAttrs()));
					}
				}
				
				SUpdateLearnLiveSkill msg = new SUpdateLearnLiveSkill();
				msg.skill.level = liveskill.getLevel();
				msg.skill.id = id;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);

				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleid));
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閾忣偅鐝ㄦ繝鐢靛Х椤ｈ棄危閸涙潙纾婚柛娑樼摠閸庡孩銇勯弽顐粶闁哄嫨鍎甸弻鏇＄疀閵壯咃紵闂傚倸瀚�氫即寮诲☉妯锋婵鐗嗘导鎰箾鐎电校婵＄偠妫勯～蹇涙惞閸︻厾锛滃┑鈽嗗灥瀹曠敻宕ｉ崱娑欌拺缁绢厼鎷嬮崵瀣磼缂佹绠栧ǎ鍥э躬閹粙宕ㄦ繝鍌欑盎闂備胶顭堢换妤呭磻閹版澘鍌ㄩ柣銏犳啞閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弬璺ㄦ殾妞ゆ牜鍋涢柨銈嗕繆閵堝嫮鍔嶆繛鍛灲濮婄儤瀵煎▎鎴濆煂闂佸吋妞块崹璺侯嚕閹间礁绠ｉ柣妯哄暱閺嬫垿姊虹涵鍛【闁挎洏鍊曠叅闁挎洖鍊归崑鍌炴煛閸ャ儱鐏柣鎾寸懇閺岋綁骞嬮悙鍡樺灩娴滄悂顢橀悢缈犵盎闂侀潧顦崕娲磿閺冨牊鐓涚�癸拷鐎ｎ剛袦闂佺硶鏅涚�氭澘鐣峰锟芥俊姝岊槺闁诡噯缍佸缁樻媴閸︻厽鑿囬梺绋块椤兘鐛箛娑欐櫢闁跨噦鎷�?
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


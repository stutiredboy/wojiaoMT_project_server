
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
 * 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鏁撻懞銉р枔闁哄懐濮撮悾宄邦潨閿熶粙骞婇敓鐘参ч柛銉㈡櫔缁辫櫕绻濆▓鍨灍闁挎氨锟借娲﹂崜姘跺箞閵娾晩鏁嗛柛鏇ㄥ墰閸橀亶姊洪崫鍕偍闁告柨鏈弲鑸靛鐎涙鍘撻梺鑽ゅ枑婢瑰棙鐗庨梻渚�娼уú銈囷拷姘緲椤曪綁顢氶敓浠嬪极閹惧顩烽悗锝庝簽閿涚喖姊洪幆褎绂嬮柛瀣閵嗗懏顦版惔銏犳瀾闂佺粯顨呴悧鍡欑箔濮樿埖鐓熼柟鎯ь嚟閹冲洭鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀杩濋柣搴秵閸犳牜绮婚鐐寸叆闁绘洖鍊圭�氾拷?
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
				
				int curskilllevel = practiceskill.getLevel(); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴閺�閬嶅Φ閸曨垰顫呴柍钘夋閻や線姊虹拠鈥虫灁闁搞劏妫勯悾鐑筋敃閿曪拷鍞梺闈涢獜缁辨洘绂嶉悙鐑樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仴闁圭瓔鍋婇幃宄邦煥閸曨剛鍑￠梺鍝ュ枑閹告娊鐛崘顔芥櫢闁绘灏欓敍婊堟⒑缂佹ê濮囨い鏇ㄥ弮瀹曘垺绂掔�ｎ偀鎷洪梻鍌氱墛娓氭鎮炴ィ鍐╃厱閹兼番鍔嬮幉鐐亜閵忊剝顥堟い銏℃礋閺佸倿鎮剧仦钘夌闂傚倷鐒﹂弸濂稿疾濞戙垹鐤い鎰堕檮閸婂爼鏌嶉崫鍕櫤闁绘挾鍠栭弻鏇熷緞濡櫣浠柣搴㈢啲閹凤拷? by changhao
				
				if (curskilllevel >= config.skillLevelMax) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹪鎳為妷褏褰炬繝鐢靛Т濞层倝鎮块锟介弻娑樷槈濡吋鎲奸梺缁樻尵婵兘鎯�椤忓牆绾ч柛顭戝枦閸╃偞绻濋埛锟介崒姘ギ闂佸搫鐭夌紞浣逛繆閻戣棄唯闁挎洩鎷锋繛鍫燁殜閹鈻撻崹顔界亪闂佺粯鐗滈崢褔鎮鹃柨瀣檮闁告稑锕ゆ禍婊堟倵閻熸澘顏繝銏☆焾椤ｄ粙姊婚崒姘拷鐑芥嚄閸撲焦鍏滈柛顐ｆ礀閻ょ偓绻涢幋娆忕仾闁稿孩顨婇弻娑氫沪閹冩瘓闂佹悶鍊栧ú鐔煎蓟閵娾晜鍋嗛柛灞剧☉椤忥拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿顦甸弻鏇＄疀鐎ｎ亷鎷烽弴鐑嗗晠婵犻潧娲㈡禍婊堟煛瀹ュ啫濡块柍鍙ョ窔閺屾稒鎯旈鑲╀化缂備浇椴搁幑鍥х暦閹烘垟鏋庨柟瀵稿Х閹藉矂姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷? by changhao
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

				//闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒑鐠囧弶鎹ｆ繛鍛灲楠炲繘鎮滈懞銉у幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛顐ゅ枎閻忓瓨鎱ㄦ繝鍐┿仢闁瑰磭鍋ゆ俊鐑藉礃閸欍儵鍋楅柦妯荤箓闇夐柣妯烘▕閸庡繒绱掗敓鑺ュ緞閹邦厾鍘卞┑鐐村灦椤洭骞楅悩缁樼厽闁规崘娉涢弸娑㈡煛鐏炵偓绀冪紒缁樼洴瀹曞綊顢欓悡搴經濠碉紕鍋戦崐鏇灻瑰顓狀洸婵犻潧鐗婂畷鍙夌箾閹存瑥鐏╃紒鐘差煼閺岋綁鎮㈢粙娆炬闂佸憡锕╅崑濠囧箖濡ゅ懎鍨傛い鎰剁悼閸戯繝鏌ｆ惔銏犲毈闁搞劍鍎煎Λ鐔兼⒑閸︻叀妾搁柛鐘愁殜閹繝鎮㈤崗鑲╁帗闂佸疇妗ㄧ粈渚�寮冲▎鎾寸厽闊洤锕ュ▍濠囨煛瀹�瀣М濠碉紕鍏橀、娑樷槈濮楀棔绱�? by changhao
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
				
				if (config.needGuild == 1 && roleproperty.getClankey() <= 0) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵闂備礁鐏濋鍕崲閸℃ǜ浜滈柟浼存涧婢ь垶鎮楀鐐?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴椤ユ捇鏁撻崐鐕佹綈婵炴祴鏅濈槐鐐存媴閸撴彃娈ㄩ梺鍦檸閸犳宕戦崟顐熸斀闁稿本鍑瑰Σ鍛婄箾閸剚瀚�? by changhao
				{
					return true;	
				}
				
				int addexp = 0;
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(
						roleid, fire.pb.item.BagTypes.BAG, false);
											
				int which = LiveSkillManager.getInstance().GetPracticleSkillPlayerOrPet(id); //闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒒娴ｇ瓔鍤欑紒缁樺浮瀹曟垿鎮㈤悡搴ｏ紱闂佽鍎抽顓€�呴弻銉︾厪闁割偅绻冮ˉ鐘电磼閻樿崵鐣洪柡灞剧洴閸╁嫰宕橀悙顒傛澒闂備礁鎲￠悷銉э拷姘嵆瀵鈽夐姀鐘栄囨煕濠婏拷缁�渚�宕滄导瀛樼厾闁圭楠告慨宥夋煛鐏炲墽娲村┑锛勫厴婵℃悂鏁傛穱鎲嬫嫹閹扮増鈷戦柛婵嗗閸庡秹鏌涙繝鍐疄鐎殿喛顕ч埥澶婎潩閻愵剙顏堕梺鎸庣箓濡瑩鎮￠妷锔剧閻忕偛鍊搁敓鑺ヮ殘閸掓帗绻濆顓熸闂佽法鍣﹂幏锟�?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫濈畺闁秆勵殔閻愬﹥銇勯澶婂闁烩晩鍨伴悾鐑芥偄绾拌鲸鏅梺鎸庣箓濡瑥鈻嶉弮锟芥穱濠囨倷椤忓嫸鎷烽弽顬稒鎷呯憴鍕伎闂侀潧鐗嗛ˇ顖滃閸ф鐓熼柡鍌氱仢閹垿鏌ｉ幘瀵告创闁哄本鐩獮鍥煛娴ｅ壊鐎抽梻浣芥硶閸犳洖螞閸曨厾绀婂┑鐘叉搐缁犳牕螖閿濆懎鏆為柣鎺曞亹閿熻棄绠嶉崕鍗炍涘Δ鍛櫢闁伙絽鏈弳顒勬煛瀹�瀣М濠殿噯鎷烽梺瀹犳濡寮查柆宥嗏拺闁绘艾鐡ㄧ�氳绻涚�电甯堕柣掳鍔戦幃锟犲閵堝棛鍘搁悗骞垮劚閹虫劖绂掑☉銏″�垫慨妯煎亾鐎氾拷 by changhao
			
				if (itemid != 0) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌￠崶銉ョ仼缂佺姷濮烽敓钘夌畭閸庡崬螞濞戙垺鍋熼柛顐ｆ礃閻撴盯鏌涢妷锝呭姎闁诲浚浜弻锝夊箻鐎涙顦伴梺缁樻惄閸嬪﹤鐣烽崼鏇炍╅柨鏇嫹缁炬澘绉撮埞鎴︽閻忓浚浜滈悾鐑芥偨閸涘﹥娅㈤梺绋匡功閸ｃ儱顭囬幇顓犵闁告瑥顦辨晶鐢告煙椤栨凹妲圭紒杞扮矙瀹曘劍绻濋崒姘拻闂傚倷娴囧▔鏇㈠闯閿曞倸绠柨鐕傛嫹? by changhao
				{
					GroceryItemShuXing grocery = (GroceryItemShuXing) fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
					if (grocery == null)
					{
						return true;
					}
										
					//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠撻柣鏍с偢瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷 by changhao
					if (grocery.typeid == LiveSkillManager.ITEM_TYPE_PRACTICE_ROLE_ITEM && which == 2)
					{
						//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝旂紓渚婃嫹濠㈣埖鍔栭悡娑㈡煕閵夈垺娅呴柡瀣灴閺屾稑鈻庤箛鏇狀唹缂備胶绮惄顖炵嵁鐎ｎ喗鍊烽柛鎰ㄦ櫈婢规﹢宕￠柆宥嗙厱妞ゆ劗濮撮崝婊堟煟閹惧瓨绀冮柕鍥у楠炲洭妫冨☉姗嗘浇闂佽瀛╅悢顒勫箯閿燂拷?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌￠崶銉ョ仼缂佺姷濮烽敓钘夌畭閸庡崬螞濞戙垺鍋熼柛顐ｆ礃閻撴盯鏌涢妷锝呭姎闁诲浚浜弻锝夊箻鐎涙顦伴梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�? by changhao
						if(bag.removeItemById(itemid, times, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulian, 0, LiveSkillManager.Practice) != times)
						{
							MessageMgr.psendMsgNotify(roleid, 160105, null);
							return false;
						}
						
						fire.pb.skill.SPracticeItemExp itemexp = ConfigManager.getInstance().getConf(fire.pb.skill.SPracticeItemExp.class).get(itemid);
						addexp = itemexp.exp * times;
						
					}//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃酣銆冮妷褏鐭欓柛鏌倧鎷烽崸妤�绾ч柛顐ｇ☉婵′粙鏌涘▎蹇曠婵﹥妞藉畷褰掝敋閸涱厼澹夋繝鐢靛仜閹虫劖绻涢敓浠嬫煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱� by changhao
					else if (grocery.typeid == LiveSkillManager.ITEM_TYPE_PRACTICE_PET_ITEM && which == 1)
					{
						//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝旂紓渚婃嫹濠㈣埖鍔栭悡娑㈡煕閵夈垺娅呴柡瀣灴閺屾稑鈻庤箛鏇狀唹缂備胶绮惄顖炵嵁鐎ｎ喗鍊烽柛鎰ㄦ櫈婢规﹢宕￠柆宥嗙厱妞ゆ劗濮撮崝婊堟煟閹惧瓨绀冮柕鍥у楠炲洭妫冨☉姗嗘浇闂佽瀛╅悢顒勫箯閿燂拷?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌￠崶銉ョ仼缂佺姷濮烽敓钘夌畭閸庡崬螞濞戙垺鍋熼柛顐ｆ礃閻撴盯鏌涢妷锝呭姎闁诲浚浜弻锝夊箻鐎涙顦伴梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�? by changhao
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
				else //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵娴滆泛銆掓繝姘厾闁诡厽甯掗崝銈嗐亜閳哄倻鍙�闁哄本鐩、鏇㈡晲閸℃瑯妲紓鍌欒兌婵娊宕￠幎钘夎摕婵炴垯鍩勯弫鍐煥濠靛棙顥犳い锔哄劤缁辨帞绱掗姀鐘蹭紟闂佸綊顥撻崗妯侯潖缂佹ɑ濯撮悷娆忓娴犫晠姊虹粙鍨槰闁革綇绲介锝夊蓟閵夛箑浜圭紓鍌欑劍閿氬ù鐘冲浮濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟� by changhao
				{
					fire.pb.common.SCommon costconfig = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(165);
					
					int costmoney = Integer.parseInt(costconfig.value) * times;
									
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					if(bag.subMoney(-costmoney, LiveSkillManager.Practice, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulian, 0) != -costmoney)
					{
						return false;	
					}					
					
					addexp = 10 * times;
				}
				
				AddExp(curskilllevel, practiceskill.getExp() + addexp, practiceskill, maxlevel); //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟� by changhao
				
				SUpdateLearnParticleSkill msg = new SUpdateLearnParticleSkill();
				msg.skill.level = practiceskill.getLevel();
				msg.skill.id = id;
				msg.skill.exp = practiceskill.getExp();
				msg.skill.maxlevel = maxlevel;
				
				if (msg.skill.level > 0)
				{
					msg.skill.effects.putAll(CalcSkillEffect(config.skillId, msg.skill.level));
					msg.skill.nexteffect.putAll(CalcSkillEffect(config.skillId, msg.skill.level + 1));
					if (practiceskill.getLevel() > curskilllevel) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻樼數鍔堕梻浣虹《閸撴繄绮欓幒妤�鐓曢柟杈鹃檮閻撴洘銇勯鐔风仴婵炲懏锕㈤弻娑欐償閵忕姴顫掗梺鍝勭焿缂嶄線鐛▎鎾崇妞ゆ帪鎷锋い蹇撶埣濮婂宕掑▎鎰偘濡炪倖娉﹂崨顔煎簥闂佸湱鍎ら〃鍛婵犳碍鐓熼柡鍐ㄥ�哥敮鍓佺棯閹岀吋闁哄被鍔戦幃銈夊磼濞戞﹩浼�?? by changhao
					{
						Result result = new Result(true);
						
						//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣芥硶閸犳挻鎱ㄧ�靛摜纾奸柍鍝勬噺閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箯閹达附鍋勫┑鍌氼槺閸炵敻姊洪崨濠冨矮闁煎啿鐖奸幃鐑剿夐悵锟� by changhao
						Module.logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洦浜濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�:" + roleid + "濠电姷鏁告慨鐑藉极閹间礁纾块柟瀵稿Т缁躲倝鏌﹀Ο渚＆鐟滅増甯掔壕濂告煟閹邦垰鐨洪柣娑栧劚閳规垿顢欑粵瀣姼濠电偛顦扮粙鎾寸珶閺囥垺鍤掗柕鍫濇閺嬫垿鏌熼懝鐗堝涧缂佹彃娼￠幆灞解枎韫囷絿鍞甸梺鍏兼倐濞佳勬叏閸モ晝纾奸柣妯烘▕閻撳ジ鏌＄仦鍓ф创妤犵偞锕㈤幊鐘垫崉閸濆嫬鑵愰梻鍌欑閹测�趁哄锟介弫鍐閻欙拷濞兼牗绻涘顔荤凹闁稿骸鐭傞弻娑樷槈濮楀牆浼愬銈呴獜閹凤拷?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弮鍫濈畺闁秆勵殔閻愬﹥銇勯澶婂闁烩晩鍨伴悾鐑芥偄绾拌鲸鏅┑顔筋焾娴滎剟寮抽锝囩瘈鐎典即鏀卞姗�鏁撻懞銉︾妤犵偛锕ラ幆鏃堟晲閸モ晝鍔跺┑鐘灱閸╂牠宕濋弽顓熷亗闁绘棃鏅茬换鍡樸亜閺嶃劎鐭婇悽顖氱埣閺屾盯寮▎鎯у壋缂備浇椴哥敮妤呭箯閸涘瓨鍊绘俊顖滃帶缁茬备acticleSkill闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯悹楦裤��閺嬪秹鏌曡箛瀣拷鏇犵不椤栫偞鐓ラ柣鏇炲�圭�氾拷?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀杩濋柣搴秵閸犳牜绮婚鐐寸叆闁绘洖鍊圭�氾拷?");
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
					
						if(!result.getChangedAttrs().isEmpty())//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閵夈垺顫嶅┑鈽嗗灟鐠�锔界閻熸壋鏀介柣鎰皺閻掓儳霉濠婂簼閭�殿喖顭烽弫鎰緞婵犲嫮鏉搁梻浣稿悑閹倸顭囪椤㈡棃鏁撻敓锟�?闂傚倷娴囧畷鐢稿窗閹邦喖鍨濈�癸拷閸曨剛鍘愰梺鎸庣箓閹峰宕甸弴鐔翠簻闁规澘澧庨幃濂告⒒閸曨偄顏紒杈ㄥ笧閿熸枻缍嗛崢鐣屾兜閼哥偣浜滈柨鏂垮悑鐎氾拷? by changhao
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
	 * 濠电姷鏁告慨鐑藉极閹间礁纾块柟瀵稿Т缁躲倝鏌﹀Ο渚＆鐟滅増甯掔壕濂告煟閹邦垰鐨洪柣娑栧劚閳规垿顢欑粵瀣姼濠电偛顦扮粙鎾寸珶閺囥垺鍤掗柕鍫濇閺嬫垿妫呴銏″婵炲弶鐗犲畷鐟扳攽鐎ｎ偆鍘卞銈庡幗閸ㄥ灚绂嶅鍛＜闁告挷绀佹禒褔鏌ㄩ悢鐑樻珪婵炲懌鍨介獮蹇涙倻閼恒儳鍘遍梺鍝勬储閸斿矂鐛弽顐ょ＜闁跨喍绮欏畷濂稿Ψ閿旇瀚藉┑鐐舵彧缁蹭粙骞夐敓鐘茬柈闁绘劕鐡ㄩ崣蹇撯攽閻樻彃顏悽顖涚洴閺岀喐绗熼崹顔碱瀴濡炪倧濡囨晶妤呭箚閺冨牆鐏崇�规洖娲ｉ崰濠囨⒒閸屾瑧鍔嶉柡瀣偢瀵彃鈽夐姀鐘电崶濠殿喗锕╅崗姗�寮搁弮鍫熺叆闁绘洖鍊圭�氾拷? by changhao
	 * @param requirelevel
	 * @param curexp
	 * @param skill
	 */
	public void AddExp(int curskilllevel, int curexp, xbean.PracticeSkill skill, int curmaxlevel)
	{
		int maxexp = LiveSkillManager.getInstance().GetPracticleSkillNeedExp(id, curskilllevel); //闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒑鐠囧弶鎹ｆ繛鍛灲楠炲繘鎮滈懞銉у幈闂佸搫娲㈤崝灞剧閻愭番浜滈柕蹇曞У閸ゅ洦鎱ㄦ繝鍐┿仢妤犵偞鐗犻幃娆撳箵閹烘嚩銈呪攽閻愯尙鎽犵紒顔奸叄瀹曟垿鎮㈤崫鍕亰婵犵數濮甸懝楣冨箲閼哥偣浜滈柟鎹愭硾鍟搁梺鎸庣♁缁挸顫忛搹鍦＜婵☆垰鍚嬮崳顓㈡⒑閼姐倕鏋傞柛搴や含閸欏懘姊洪幐搴⑩拻闁哄拋鍋婇妴鍛存煥鐎ｎ偄寮垮┑掳鍊曢鍡欙拷姘秺濮婅櫣鎷犻垾铏亾闂佺绻戦敋妞ゆ洩缍佸鍫曞箣椤撶喎鍏婇梻浣告啞閸旀牞銇愰崘顏呮殰妞ゆ牗绋撶弧锟介梺姹囧灲濞佳勭濠婂牊鐓熸俊銈忔嫹闁挎洦浜滈悾鐤亹閹烘垶宓嶅銈嗘尵閸ｃ儱顭囬悢鍏尖拺闁革富鍘奸崝瀣箾閸欏鐭掗柟顔兼健閺佹捇鎸婃径鍡樻杸闂佺粯鍔栧娆撴倶閿曞倹鐓犵憸鐗堝笧閻ｆ椽鏌熼姘辩劯闁轰焦鎹囬弫鎾绘晸閿燂拷 by changhao
		int exp = curexp;
		while (exp >= maxexp)
		{
			exp -= maxexp;
			
			curskilllevel ++;
			maxexp = LiveSkillManager.getInstance().GetPracticleSkillNeedExp(id, curskilllevel);
			if (maxexp == -1) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯幒鎴濇倯婵＄偠濮ゆ穱濠囧箹娴ｈ娅嗙紓鍌欑劍閿曗晠宕澶嬧拻濞达綀顫夐崑鐘绘煕鎼淬垺銇濈�规洘绮岄埢搴ㄥ箣閻樼數鍔堕梻浣虹《閸撴繄绮欓幒妤佸亗闁绘棃鏅茬换鍡涙煏閸繄绠查悗姘秺濮婅櫣绱掑鍡樼暥闂佹寧娲忛崕宕囧垝鐎ｎ喖绠抽柟鍐茬－閸犳劗绮悢纰辨晬婵犲﹤鍟弳鈺呮⒒閸屾瑧顦﹀鐟帮躬瀹曟垿宕熼瀣☉铻栭柛娑卞幘閿涙瑦绻濋悽闈浶ｉ柤褰掔畺閹潡顢氶敓浠嬪蓟閵娾晜鍋嗛柛灞剧☉椤忥拷 by changhao
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


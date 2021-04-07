
package fire.pb.skill.liveskill;





import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.AddItemResult;
import fire.pb.item.BagTypes;
import fire.pb.item.Pack;
import fire.pb.item.SFoodAndDrugEffect;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.skill.SkillRole;
import fire.pb.util.Misc;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeDrug__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿Ψ椤旇姤娅堥梻浣虹《閸撴繈鈥﹂崶顒�鐓樼�广儱顦伴悡鏇熺節闂堟稒顥滄い蹇ｅ亰閺岋繝宕遍幇顒婃嫹濠靛钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�
 * @author changhao
 *
 */
public class CLiveSkillMakeDrug extends __CLiveSkillMakeDrug__ {
	@Override
	protected void process() {
		// protocol handle

		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakedrug = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SkillRole skillrole = new SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(LiveSkillManager.LIVE_SKILL_TYPE_MAKE_DRUG);	//闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垼妫勯弸渚�鏌涘☉姗堟敾婵炲懐濮垫穱濠囧Χ閸涱喖娅￠梺璺ㄥ枙濡嫰宕弶鎴犳殾闁靛ň鏅涚痪褔鏌熺�电浠︾悮锝夋⒑鐠囧弶鎹ｆ繛鍛灲楠炲繘鎮滈懞銉у幈闂佸搫娲㈤崝灞炬櫠椤旀祹褰掓偐閾忣偁浠㈠┑顔硷龚濞咃絿妲愰幒鎳崇喖鎳￠妶鍛辈闂傚倷鑳堕、濠囶敋濠婂懏宕叉繝闈涙矗缁诲棝鏌ｉ姀鐘冲暈闁稿瀚伴弻娑滅疀濮橆兛姹楅梺鍛婎焽閺佽顫忛搹瑙勫磯闁靛鍎查悵銏ゆ⒑閻熸澘娈╅柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲歌箛鏃傜彾闁哄洢鍩勯弫鍥煏韫囨洖啸闁哄睙鍐炬富闁靛牆妫楁慨褔姊婚崟顐㈩伃鐎规洘鍨挎俊鑸靛緞鐎ｎ剙骞嶉梺璇叉捣閺佹悂鈥﹂崼婵囨瘎濠电姷顣藉Σ鍛村磻閹捐绠柨鐕傛嫹? by changhao			
				if (liveskill == null)
				{
					LiveSkillManager.logger.debug("CLiveSkillMakeDrug skilllevel error:" + roleid);
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
				
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(
						roleid, LiveSkillManager.LIVE_SKILL_TYPE_COOKING, skilllevel,"闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗘い鏍ㄧ箓閸氬綊鏌ｅ┑鍡欏煟闁哄本鐩、鏇㈡晲閸モ晝鏆梻浣告惈濡酣宕愬┑瀣摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹 ", 
						YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌熼崜褏甯涢柛濠傛健閺屻劑寮撮悙璇ф嫹閸涘鏀伴梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠楅崑鍌炴煛閸ャ儱鐏柣鎾卞劦閺岋綁寮撮悙璇ф嫹閸︻叏鎷峰鐐? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}							
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				int count = 0;
				
				int makingsweight = 0;
				
				if (makingslist.size() == 0) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟ラ锝嗗鐎涙ǚ鎷洪梺鐓庮潟閸婃洟鍩㈤崼銏㈢＝闁稿本绋栨竟姗�鏌嶇拠鑼ч柡浣瑰姈瀵板嫬螣缂佹ɑ鐝曢梻鍌欑閹碱偆鎮锕�纾块柡灞诲劜閸嬪倿鏌ｉ弬鍨倯闁绘挻鐟╁娲敇閵娧呮殸闂佽绻掓慨鐢稿Φ閸曨垰唯闁靛鐏濋妶澶嬬叆闁绘柨鍤栭幏鐑芥偆娴ｅ湱绉烽梻浣告贡閳峰牓宕戞繝鍥╁祦闊洦绋掗弲鎼佹煥閻曞倹瀚� by changhao
				{
					fire.pb.item.SFoodAndDrugEffect stuff = (SFoodAndDrugEffect) fire.pb.item.Module.getInstance().getItemManager().getAttr(LiveSkillManager.ITEM_TYPE_DRUG_MAKINGS_LOW);
					if (stuff == null)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.ItemNotExist));
						return true;						
					}
					
					makingsweight = stuff.lianyaoMaterialWeight * 4;
					count = 4;
					
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔鏌ユ晸閽樺锟藉潡銆佸▎鎾崇鐟滃繘藝椤栨稓绠鹃柟鎯ь嚟閸熸煡鏌熼悜鑺ユ暠妞ゃ劊鍎甸幃娆撳级閹存繍娼氶梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘 by changhao
					if(bag.subMoney(-6000, LiveSkillManager.MakeDrug, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuilianjin, 0) != -6000)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;	
					}
				}
				else if (makingslist.size() < 2) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堥梻鍌氱墛缁嬫帡鏁嶅澶嬬厽闁圭儤娲栬婵烇絽娲ら敃顏呬繆閸洖宸濇い鏂垮悑椤忕姵绻濈喊妯活潑闁稿鎳撻幗顐ょ磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘宕￠悙宥嗘⒐閹峰懘鎮锋导瀛橈紬闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枟瀹曟煡鏌涢鐘插姎闁藉啰鍠栭弻鏇㈠醇濠靛洤娅ч梺鍝勬４缁犳捇寮诲☉銏犖ㄩ柨婵嗘噹椤姊虹紒妯肩濞存粠浜滈～蹇涙惞閸︻厾鐓撻柣鐘充航閸斿秹宕抽幎鑺モ拺闁硅偐鍋涢崝姗�鏌涢弬鑳闁崇粯鎹囬弫鎾绘晸閿燂拷? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.OneStuffCannot));
					return true;
				}
				else
				{
					for (Integer makings : makingslist)
					{
						fire.pb.item.SFoodAndDrugEffect stuff = (SFoodAndDrugEffect) fire.pb.item.Module.getInstance().getItemManager().getAttr(makings);
						if (stuff != null)
						{
							fire.pb.item.ItemNameClassConfig classid = ConfigManager.getInstance().getConf(fire.pb.item.ItemNameClassConfig.class).get(stuff.getTypeid());
							if (classid != null)
							{
								boolean drugstufftype = classid.classname.equals(LiveSkillManager.DrugStuff);
								if (drugstufftype == true) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒鍊荤壕鍏笺亜閺傚灝鎮戞繝锟介幍顔剧＜闁稿本绋戠粭鈺呮煏閸ャ劌濮嶆鐐村浮楠炴鎹勯崫鍕啋缂傚倸鍊搁崐鐑芥倿閿斿墽鐭欓柟杈惧瘜閺佸嫰鏌涘☉妯兼憼闁稿﹤鐖奸弻宥夊煛娴ｅ憡娈剁紓浣哄█缁犳牠寮诲☉婊呯杸闁哄洦顨嗙�氭稑鈹戦悙鑼缂侇喖閰ｉ弫鎾绘嚍閵夘喖鏅遍梺闈╃秵閸ㄥ爼鐛箛娑欐櫢闁跨噦鎷�?  by changhao
								{
									makingsweight += stuff.lianyaoMaterialWeight;
									
									//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝旂紓渚婃嫹濠㈣埖鍔栭悡娑㈡煕閵夈垺娅呴柡瀣灴閺屾稑鈻庤箛鏇狀唹缂備胶绮惄顖炵嵁鐎ｎ喗鍊烽柛鎰ㄦ櫈婢规﹢宕￠柆宥嗙厱妞ゆ劗濮撮崝婊堟煟閹惧瓨绀冮柕鍥у楠炲洭妫冨☉姗嗘浇闂佽瀛╅悢顒勫箯閿燂拷?濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌￠崶銉ョ仼缂佺姷濮烽敓钘夌畭閸庡崬螞濞戙垺鍋熼柛顐ｆ礃閻撴盯鏌涢妷锝呭姎闁诲浚浜弻锝夊箻鐎涙顦伴梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�? by changhao
									if(bag.removeItemById(makings, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofanguse, 0, LiveSkillManager.MakeDrug) == 1)
									{
										count ++;
									}						
								}								
							}
						}
					}		
				}
								
				if (count < 2) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堥梻鍌氱墛缁嬫帡鏁嶅澶嬬厽闁圭儤娲栬婵烇絽娲ら敃顏呬繆閸洖宸濇い鏂垮悑椤忕姵绻濈喊妯活潑闁稿鎳撻幗顐ょ磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘宕￠悙宥嗘⒐閹峰懘鎮锋导瀛橈紬闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枟瀹曟煡鏌涢鐘插姎闁藉啰鍠栭弻鏇㈠醇濠靛洤娅ч梺鍝勬４缁犳捇寮诲☉銏犖ㄩ柨婵嗘噹椤姊虹紒妯肩濞存粠浜滈～蹇涙惞閸︻厾鐓撻柣鐘充航閸斿秹宕抽幎鑺モ拺闁硅偐鍋涢崝姗�鏌涢弬鑳闁崇粯鎹囬弫鎾绘晸閿燂拷? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.OneStuffCannot));
					return true;					
				}
				
				int prob = GetProbByNum(count);
				
				int index = Misc.getRandomBetween(1, 1000);
				
				SLiveSkillMakeDrug msg = new SLiveSkillMakeDrug();
				
				if (index <= prob) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟窖囧箯閻戣姤鐓ラ柡鍥悘鑼拷瑙勬礈閸忔﹢銆佸锟介幃鈺佲枔閹稿巩锕傛⒒閸屾瑧顦﹂柟纰卞亰瀹曟劘銇愰幒婵囨櫈濠电偛妫欓幐鎼佸触瑜版帗鐓ラ柣鏇炲�圭�氾拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘? by changhao
				{
					fire.pb.item.SFoodAndDrugEffect jinchuang = (SFoodAndDrugEffect) fire.pb.item.Module.getInstance().getItemManager().getAttr(LiveSkillManager.ITEM_TYPE_DRUG_JIN_CHUANG);
					int jinchuangweight = jinchuang.getLianyaoWeight() - skilllevel * 2 - makingsweight;
					int drugtotalweight = LiveSkillManager.getInstance().drugtotalweight;
					
					int randomValue = Misc.getRandomBetween(0, jinchuangweight + drugtotalweight - 1);
					
					int curWeight = 0;
					
					int drug = LiveSkillManager.ITEM_TYPE_DRUG_JIN_CHUANG; //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾叉閻掑﹪鏌曟繛鐐珔缂佺媭鍨堕弻銊╂偆閸屾稑顏�?缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕梻浣筋嚃閸燁偊宕惰缁愭稑顪冮妶鍡樼闁瑰啿绻橀、娆撳籍閸啿鎷洪梺纭呭亹閸嬫盯宕濋幘顔界厱闁规儳顕幊鍛磼椤旇偐澧︾�规洜鍠栭、娑樷槈濮橆剙绠炲┑鐘垫暩婵烇拷婵炰匠鍏炬稑螖閸滀焦鏅滃銈呯箰閹虫劗绮绘ィ鍐╃厱妞ゆ劦鍋勬晶鎵磼婢舵ê娅嶉柡宀嬬磿娴狅妇鎷犵拠褎瀚规繝闈涱儏閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓? by changhao
					if (randomValue < jinchuangweight) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹪鎸婃径娑滐拷鍧楁⒑椤掞拷缁夋煡鏁撻挊澶嬪殗闁瑰磭濞�椤㈡鎷呴崨濠勶拷楣冩⒒婵犲骸浜滄繛璇у缁瑩骞嬮敃锟介崙鐘层�掑鐐闂佸搫鐬奸崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮婚敐澶婄闁告劘顕滈幏鐑藉锤濡わ拷閽冪喖鏌ｉ弮鍌氱殤闁归鍏橀幃钘夆枔鐠恒劌濮奸梺鍝勭▌缁绘繂顫忛搹鍦＜婵☆垳鍎ょ拠鐐电磽娴ｅ搫校闁绘濮撮锝嗙節濮橆儵褍顭跨捄渚剱婵炲懌鍨藉铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷? by changhao
					{

					}
					else
					{
						//濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鎳庨弳妤呮⒑缁嬭法鐏遍柛瀣☉椤斿繐鈹戦崶銉ょ盎闂佸搫鍟ú銈堫暱婵＄偑鍊曠换鎺楀窗閺嵮屾綎濠电姵鑹剧壕鍏肩箾閸℃ê鐏辩紒鎰殜濮婃椽宕ㄦ繝鍕櫑缂備胶绮敮鎺楊敋閵夛妇绡�闁告劦浜顕�姊洪崨濠勨槈闁挎洩绠撳畷銏ゅ箳閹存梹鏂�闂佺粯顭堥婊冾啅閵夆晜鐓熸俊銈忔嫹闁挎洦浜滈悾鐑芥偨閸涘﹥娅㈤梺璺ㄥ櫐閹凤拷? by changhao
						curWeight = jinchuangweight;
						for (fire.pb.item.SFoodAndDrugEffect e : LiveSkillManager.getInstance().druglist)
						{
							curWeight += e.getLianyaoWeight();
							
							if (randomValue < curWeight)
							{
								drug = e.getId();
								break;
							}
						}						
					}
					
					fire.pb.item.drug.GeneralDrug drugitem = (fire.pb.item.drug.GeneralDrug)fire.pb.item.Module.getInstance().getItemManager().genItemBase(drug, 1);
					//drugitem.setFlag( fire.pb.Item.BIND);
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸モ晝鍘犻梻浣虹帛閸ㄥ爼寮搁懡銈囩闁哄诞宀�鍞甸柣鐘烘鐏忋劑宕濋悢鍏肩厸闁糕剝鍔曢敓鑺ユ礋婵℃挳骞掗幋顓熷兊闂佺粯鍔﹂崜娆擃敂閼稿吀绻嗛柕鍫濇搐鍟搁梺绋垮閸ㄥ潡鐛箛娑欐櫢闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲歌箛鏃傜彾闁哄洢鍩勯弫鍥煏韫囨洖啸闁哄睙鍐炬富闁靛牆妫楁慨褔姊婚崟顐㈩伃鐎规洘鍨挎俊鑸靛緞鐎ｎ剙骞嶉梺璇叉捣閺佹悂鈥﹂崼婵囨瘎濠电姷顣藉Σ鍛村磻閹烘鍨傞柟鎯版缁犵喖鏌熼梻瀵割槮婵☆偅锕㈤獮鏍拷娑櫳戠亸浼存煟韫囧海绐旀慨濠冩そ濡啫鈽夊杈╂澖闂備胶顭堥敃銉ッ哄鍫熸櫢闁兼亽鍎存竟妯汇亜閿旂偓鏆�殿喗妲掗ˇ鍓佺磼閻樺磭鈽夋い顐ｇ箞瀹曟鎳栭埡鍐冦儵姊婚崒娆戭槮闁圭⒈鍋婇獮濠呯疀濞戞鐣洪梺绋跨灱閸嬫盯鎷戦悢鍏肩厽闁哄啫鍊搁惃鎴︽煙瀹勬澘妲婚柍钘夘槸閳诲秹顢樿缁ㄥジ鏌熸笟鍨鐎规洖鐖奸、妤佹媴閸濆嫬绠ユ繝鐢靛仩閹活亞寰婃禒瀣柈闁秆勵殔缁犵娀鐓崶銊︾┛闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷? by changhao
					
					fire.pb.common.SCommon common = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(159);
					int delta = Integer.parseInt(common.value);					
					
					int quality = Misc.getRandomBetween(Math.max(skilllevel - delta, 1), skilllevel);
					drugitem.setQuality(quality);
					
					if (bag.isFull())
					{
						fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.TEMP, false);
						if (tempBag.doAddItem(drugitem, -1, LiveSkillManager.MakeDrug, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 2) != AddItemResult.SUCC)
						{
							return false;
						}
					}
					else
					{
						if(bag.doAddItem(drugitem, -1, LiveSkillManager.MakeDrug, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 2) != AddItemResult.SUCC)
						{
							return false;
						}						
					}
									
					msg.itemid = drug;
					msg.ret = 0;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
				}
				else //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟窖囧箯閻戣姤鐓ラ柡鍥悘鑼拷瑙勬礈閸忔﹢銆佸锟介幃鈺佲枔閹稿巩锕傛⒒閸屾瑧顦﹂柟纰卞亰瀹曟澘鈽夐姀鐘殿唵婵＄偛顑呴崙浠嬪箯閻戣棄鍨傛い鎰剁悼閸戯繝鏌ｆ惔銏犲毈闁告ê銈搁垾锕傚炊椤忓棛鏉稿┑鐐村灱妞存悂寮插┑瀣拺闂傚牊渚楀Σ褰掓煕閺傜偛娲ょ粻顖炴煥閻曞倹瀚� by changhao
				{
					msg.itemid = 0;
					msg.ret = 1;
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);				
				}
				
				return true;
			}
		};
		
		liveskillmakedrug.submit();	
		
	}
	
	//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸モ晝鍘犻梻浣虹帛閸ㄥ爼寮搁懡銈囩闁哄诞宀�鍞甸柣鐘烘鐏忋劑宕濋悢鍏肩厸闁糕剝鍔曢敓鑺ユ礋婵℃挳骞掗幋顓熷兊闂佺粯鍔﹂崜娆擃敂閸洘鈷掑ù锝呮啞閹牓鏌ゅú璇茬仩閾荤偞绻濋棃娑卞剳鐎规挷鐒﹂幈銊ノ旂�ｎ偄顏堕柣搴ゎ潐濞叉﹢鏁冮姀銈囧祦闁规崘顕х粻鎶芥煛閸愭寧瀚归梺宕囩帛濞茬喎顫忔繝姘＜婵炲棙鍔楅妶鏉库攽閳╁啨浠犻柛鏂跨焸閳ユ棃宕橀鑲╊唺濠德板�ч幏椋庣棯椤撱劍瀚归梻鍌欐祰椤宕曢悡骞盯宕熼娑掓嫽濡炪倖鐗滈崑鐐烘偂閺囩喓绡�闂傚牊绋掗ˉ婊勩亜韫囨梹灏﹂柡灞剧洴婵″爼宕遍埡鍌滄殾濠电儑绲藉ú銈夋晝椤忓懍绻嗛柟顖涘閻わ拷闂佸搫鍊归娆愬閹剧粯鈷掗柛灞剧懆閸忓瞼鐥鐐靛煟鐎殿喗褰冮埥澶愬閳ュ啿澹掗梻浣侯焾閻ジ宕戝☉姘变笉闁哄稁鐏愯ぐ鎺撳亹鐎瑰壊鍠栭崜閬嶆⒑缁嬫鍎忛悗姘煎枤濡叉劙骞掗弮鎾村闁挎繂楠搁獮妤冪棯椤撯剝纭鹃棁澶嬬節婵犲啫濮夌紒澶樺枟閹便劍绻濋崒娑欏創闁轰礁鐗撻弻娑㈠Ψ閹存繂鏋ら柣搴㈠▕濮婅櫣鎷犻幓鎺濆妷闂佸憡鍨电紞濠傜暦閿濆绀冩い鏂挎閵夆晜鐓曟繛鎴欏灩娴滅増淇婇姘伃婵﹨娅ｉ幏鐘诲灳閾忣偆褰查梻浣烘嚀閸ゆ牠骞忛敓锟�? by changhao
	public int GetProbByNum(int num)
	{
		if (num == 2)
		{
			return (int)(1000F * (2F / 3F));
		}
		else if (num == 3)
		{
			return (int)(1000F * (7F / 8F));
		}
		else if (num == 4)
		{
			return 1000;
		}
		
		return 0;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800519;

	public int getType() {
		return 800519;
	}

	public java.util.LinkedList<Integer> makingslist; // 材料链 by changhao

	public CLiveSkillMakeDrug() {
		makingslist = new java.util.LinkedList<Integer>();
	}

	public CLiveSkillMakeDrug(java.util.LinkedList<Integer> _makingslist_) {
		this.makingslist = _makingslist_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(makingslist.size());
		for (Integer _v_ : makingslist) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			makingslist.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeDrug) {
			CLiveSkillMakeDrug _o_ = (CLiveSkillMakeDrug)_o1_;
			if (!makingslist.equals(_o_.makingslist)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += makingslist.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(makingslist).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


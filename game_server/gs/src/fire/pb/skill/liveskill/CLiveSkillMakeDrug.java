
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾鍞銈嗘婵倕鈻嶉崼銉︹拻濞达綀娅ｉ妴濠囨煕閹惧绠為柍銉畵瀹曞爼顢楅敓浠嬫偂濡》鎷烽獮鍨姎妞わ缚鍗抽幃锟犲即閻旇櫣鐦堥梻鍌氱墛缁嬫帡藟濠婂嫨浜滈煫鍥风到娴滀即鏌″畝瀣瘈鐎规洟浜堕獮鍥敆婵犲啫顏跺┑鐘绘涧椤戝懘鎷戦悢鍏肩厪濠电偟鍋撳▍鍡涙煕鐎ｎ亝顥㈤柡灞剧〒娴狅箓宕滆濡插牆顪冮妶鍛寸崪闁瑰嚖鎷�
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
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(LiveSkillManager.LIVE_SKILL_TYPE_MAKE_DRUG);	//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫼闁荤姴娲ゅ鍫曞箲閿濆棛绠鹃柛娑卞亜閻忓弶顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ瑜嶉獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繄浠﹂悙顒佺彿濡炪倖姊圭粊纭呫亹閹烘挸浜归梺鎯ф禋閸嬩焦绂掗姀鐘斀妞ゆ梻銆嬫Λ姘箾閸滃啰鎮兼俊鍙夊姍楠炴帡骞婂畷鍥ф灈闁圭绻濇俊鍫曞川椤撶喕绶㈤梻鍌氬�搁崐鐑芥嚄閸洏锟戒焦绻濋崶鑸垫櫔濠电姴锕ら幊蹇撶暦閸欏绡�闂傚牊绋掗惌妤冪磼鐠囧弶顥㈤柡宀嬬秮婵拷闁绘ê鍟块弳鍫ユ⒑缁嬫鍎忛悗姘嵆瀵鈽夊鍛澑濠殿喗锕╅崗娑樞уΔ鍛拺闁告稑顭悞浠嬫煛娴ｇ瓔鍤欐い顐㈢箻閹煎湱鎲撮崟顐わ紡闂備線娼ч…鍫ュ磿閺屻儲鍋熼柕蹇嬪�栭埛鎴︽煟閻斿憡绶叉繛鍫氭櫊閺岀喖宕欓妶鍡楊伓?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟濮濆瞼鐤�闁哄啫鍊昏ぐ楣冩⒑閸濆嫭鍌ㄩ柛鈺佸瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎼惈娆撳礃閻愵剙鐦滈梻渚�娼ч悧鍡椢涘Δ浣瑰弿鐟滄柨顫忔繝姘妞ゆ劑鍩勬导鍐倵鐟欏嫭绀冮柛銊﹀娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崜娆撶嵁瀹ュ鈷戦悹鍥у级閹癸綁鏌℃担瑙勫�愰柍銉畵瀹曠厧鈹戦崶銊ф濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佽宕橀褏绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao			
				if (liveskill == null)
				{
					LiveSkillManager.logger.debug("CLiveSkillMakeDrug skilllevel error:" + roleid);
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
				
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(
						roleid, LiveSkillManager.LIVE_SKILL_TYPE_COOKING, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴笟濠冨婵犮垼娉涢鍕崲閸℃ǜ浜滈柡宥冨妿缁犳捇鏌涘顒傜Ш闁哄矉绲介埞鎴﹀幢濞嗗繒鍘介梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈩冩珳闂佹悶鍎弲婵嬪汲椤撱垺鈷掑ù锝呮啞閹牊淇婇銏ゅ弰鐎规洘鍔曢埞鎴狅拷锝庝海閹芥洟姊洪棃娴ュ牓寮插鍫濈；闁糕剝绋掗悡鏇㈡倶閻愭彃鈷旈柍钘夘槹閵囧嫯绠涢妷锕�顏� ", 
						YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鏁愭径濠庢綂闂佺粯锚閸熷潡寮抽崼銉︹拺缂佸顑欓崕蹇斻亜閹存繍妯�鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸屾稑浠撮梺鍝勮閸旀垵顕ｉ幘顔藉�烽悹鍥囧嫬顏堕梺鍛婄☉椤剟寮ㄦ导瀛樷拻闁稿本鐟ㄩ崗宀�绱掗鍛仸鐎殿喖顭锋俊鎼佸煛娴ｅ彨鏇㈡煟鎼搭垳绉甸柛鐘愁殜瀹曟垿宕掗悙瀵稿幐闂佹悶鍎崕閬嶆倶椤忓牊鐓熼柟鎯у船閸旓箓鏌″畝瀣М鐎殿喗鎸抽幃娆戞嫚瑜庣�氬綊鏌涢敂璇插伎闁瑰嘲鍢查～婵嬫倷椤掞拷椤忥拷? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}							
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				int count = 0;
				
				int makingsweight = 0;
				
				if (makingslist.size() == 0) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸涘﹥灏伴柣鐔村劦椤㈡岸鏁愰崱妤婂殼闁诲孩绋掕彜闁归攱妞藉娲偂鎼搭喗缍楅梺绋匡攻濞茬喖宕洪姀銈呴唶闁靛繈鍨婚敍婵嬫⒑缁嬫寧婀扮紒瀣墬缁旂喎顫滈敓浠嬪蓟瀹ュ洦瀚氶柤纰卞劮瑜旈弻鈩冩媴閻熸澘顫嶉悗鍨緲鐎氼剝鐏掔紓鍌欑劍钃遍柣婵囨礋濮婂宕掑▎鎴М闂佸湱鈷堥崑鍡涘箖椤曪拷椤㈡洟鏁冮敓鐣屽閸ф鐓涢悘鐐额嚙閸旀粓鏌涚�ｎ亜锟藉潡寮婚敐澶婃闁割煈鍠楅崐顖炴⒑缂佹ɑ灏伴柣鐔叉櫅椤繐煤椤忓秵鏅ｉ梺闈浤涢崨顔筋啅闂傚倷娴囬褏鎹㈤幒鎾村弿闁汇垻顭堟闂佸憡娲﹂崹鏉挎暜闂備線娼чˇ浠嬫倶濠靛围濠㈣泛顑囬崣鍡涙⒑缂佹ɑ鐓ラ柛銈嗙墵楠炲繘鎮滈懞銉ヤ簽婵炶揪绲藉﹢杈╃矓閻戣姤鈷掑ù锝呮啞鐠愶繝鏌嶅畡鎵ⅵ鐎规洘鍨剁换婵嬪炊閳轰胶銈﹂梻濠庡亜濞诧妇绮欓幒妤�鐤鹃柟闂寸劍閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹 by changhao
				{
					fire.pb.item.SFoodAndDrugEffect stuff = (SFoodAndDrugEffect) fire.pb.item.Module.getInstance().getItemManager().getAttr(LiveSkillManager.ITEM_TYPE_DRUG_MAKINGS_LOW);
					if (stuff == null)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.ItemNotExist));
						return true;						
					}
					
					makingsweight = stuff.lianyaoMaterialWeight * 4;
					count = 4;
					
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柡灞诲劜閺呮悂鏌﹀Ο渚Ц闁跨喕妫勫锟犲Υ娴ｇ硶鏋庨柟鎯х－椤︻參鎮峰鍐閽樻繃銇勯弽銊с�掔紒鐘荤畺閺岀喖骞嗚閸ょ喖鏌涢悢鍝ュ弨闁哄瞼鍠栭幃婊堟嚍閵夛附娈告俊鐐�戦崝濠囧磿閻㈢绠栨繛鍡樻尭缁狙囨煙鐎涙绠ユ繛鍏煎哺濮婄粯鎷呴懞銉ｏ拷鍐煟閹虹偟鐣垫鐐村灴瀹曞爼顢楅敓浠嬪几娓氾拷閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 by changhao
					if(bag.subMoney(-6000, LiveSkillManager.MakeDrug, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuilianjin, 0) != -6000)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;	
					}
				}
				else if (makingslist.size() < 2) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ鎯侀崼銉︹拻闁稿本姘ㄦ晶娑氱磼鐎ｎ偄娴柡浣哥Т椤撳吋寰勭�ｎ剙骞楅梻浣告贡閸庛倕煤閺嶎剦鏆辨繝鐢靛剳缁茶棄煤閵堝鏅濇い蹇撴噸缁诲棝鏌涢锝嗙鐎瑰憡绻冮妵鍕棘閸喗鍊銈呯箳婵數鎹㈠┑鍫濇瀳婵☆垱妞垮鎴︽⒑缁嬫鍎忛柟铏崌楠炴顢曢妶鍥╋紳婵炶揪缍�濞咃絿鏁☉銏＄厽闁冲搫锕ら悘鐘绘煟閿濆洤鍘寸�规洩绻濋幃娆忣吋閸℃ǚ鎷归梺鐟板槻閹虫﹢骞冮柨瀣嚤閻庢稒锕槐顒勬⒒閸屾艾锟芥悂宕愬畡鎳婂綊宕惰閺嗭箓鏌ｉ姀銏╃劸缂佹劖顨婇弻鐔兼焽閿曪拷閺嬬喓锟借娲橀悡锟犲蓟濞戙埄鏁冮柣妯诲絻婵酣姊洪挊澶婃殶闁哥姵鐗犲濠氬即閵忕娀鍞跺┑鐘绘涧濞层倕鈻嶈濮婃椽宕崟顒婄川缂備胶濮甸幑鍥ь嚕鐠囨祴妲堥柕蹇曞閵娾晜鐓ユ繝闈涙閸ｈ銇勯锟介ˇ闈涱潖閾忓湱纾兼俊顖濆亹椤撳吋绻涚�涙鐭ゅù婊勭矒閿濈偠绠涘☉娆愬劒闂侀潻瀵岄崢楣冩偂閹剧粯鐓熼柣妯哄帠閼割亪鏌涢弬璺ㄐх�规洘濞婇獮搴ㄦ嚍閵夈垺瀚奸梻浣侯攰閸嬫劙宕戝☉銏犵婵鎷烽柡灞剧洴瀵剟鎳楅姘间純闂備礁纾划顖炲箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘? by changhao
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
								if (drugstufftype == true) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夊煕閹寸姵鍠愰柣妤�鐗嗙粭鎺懨瑰锟介崡鎶藉蓟濞戙垹绠婚悗闈涙啞閸Ｑ冾渻閵堝棙绌跨紒韫矙閹箖鏁撻悩宕囧姺闂佹寧妫佸Λ鍕儊濠婂牊鈷掑〒姘炬嫹婵炰匠鍥ㄥ亱闁糕剝銇傚☉妯锋婵炲棙鍔栭悵宄邦渻閵堝棗绗掗柛濠呭吹婢规洟宕楃粭杞扮盎闂佸搫鍊搁悘婵嬪箖閹寸偟绡�闁跨喍绮欓獮宥夘敊閸撗嶇床闂備胶顭堥張顒傜矙閹寸姷绠旈柍鍝勬噺閻撳繘鏌涢妷锝呭濠殿喖绉甸〃銉╂倷閺夋垶璇炲Δ鐘靛仦椤洭骞戦崟顖氫紶闁告洦鍙庨崯瀣磽閸屾艾锟芥悂宕愰幖浣哥９闁绘垼濮ら崐鍧楁煥閺傚灝鈷旈柣顓熺懇閺岀喐娼忛幆褏妲ｉ梺杞扮鐎氫即寮诲☉妯锋婵☆垰鍚嬮幉濂告⒑缁嬪尅宸ラ柣鏍с偢瀵顓兼径濠勫幐婵炶揪绲介幉鈥斥枔閸撲胶纾藉ù锝呮惈閳诲牏绱掗悩宕囧⒌鐎殿喛顕ч埥澶婎煥閸涱垱婢戦梻浣告惈濞诧箓銆冮崱娆欐嫹濮橆厾鈽夐柍瑙勫灴閹瑩鎳犻锟介·锟界紓鍌欑贰閸犳牠鏌婇敐澶婃瀬闁瑰墽绮崵宥夋煏婢舵ê鏋涢柡鍛翠憾濮婃椽妫冮埡鍐ｉ梺鎼炲妼閻栧ジ鎮伴璺ㄧ杸婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?  by changhao
								{
									makingsweight += stuff.lianyaoMaterialWeight;
									
									//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弮鍌滅＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃鈥斥槈閵忥紕鍘遍梺闈涱槶閸ㄥ搫鈻嶉崨瀛樼厸閻庯綆鍋勯悘鎾煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崬鍦磽閸屾瑨鍏岀紒顕呭灦閹嫰顢涢悙闈涚ウ闁诲函缍嗛崰妤呭磹閻戣姤鐓曢柟鑸妽濞呭牆顭跨憴鍕惰�跨�规洩绻濋弻鍡楊吋閸℃瑥骞堟俊鐐�栭崝妤佹叏閹绢喖绀夋繝濠傜墛閻撶喖鏌熼幆褏鎽犵紒锟介崘顔界厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炍涢崘銊㈡婵妫欏ù鍥⒒娴ｇ瓔鍤欓悗娑掓櫊閹垽顢楅崟顐ゎ唵闂佽法鍣﹂幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡宀嬬節瀹曞爼濡烽妷褌鎮ｇ紓鍌欒兌婵攱鎱ㄩ悜鑺ユ櫢闁芥ê顦遍悾顓㈡煕鎼粹�宠埞閾荤偞绻涢幋娆忕仾闁稿鍠栭弻娑㈩敃閿濆棛顦ㄩ梺缁樻尰閻╊垶寮诲☉銏犖ㄩ柨婵嗘噹婵酣姊虹拠鍙夌濞存粠浜濠氭晲婢跺﹦顔掗柣搴㈢♁椤洭藝娴煎瓨鈷戦柛婵嗗椤箓鏌涢弮锟介崹鍧楃嵁閸愵喖围濠㈣泛锕﹂敍婊冣攽閻愭潙鐏﹂柨鏇楁櫆鐎靛ジ鏁撻敓锟�? by changhao
									if(bag.removeItemById(makings, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofanguse, 0, LiveSkillManager.MakeDrug) == 1)
									{
										count ++;
									}						
								}								
							}
						}
					}		
				}
								
				if (count < 2) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ鎯侀崼銉︹拻闁稿本姘ㄦ晶娑氱磼鐎ｎ偄娴柡浣哥Т椤撳吋寰勭�ｎ剙骞楅梻浣告贡閸庛倕煤閺嶎剦鏆辨繝鐢靛剳缁茶棄煤閵堝鏅濇い蹇撴噸缁诲棝鏌涢锝嗙鐎瑰憡绻冮妵鍕棘閸喗鍊銈呯箳婵數鎹㈠┑鍫濇瀳婵☆垱妞垮鎴︽⒑缁嬫鍎忛柟铏崌楠炴顢曢妶鍥╋紳婵炶揪缍�濞咃絿鏁☉銏＄厽闁冲搫锕ら悘鐘绘煟閿濆洤鍘寸�规洩绻濋幃娆忣吋閸℃ǚ鎷归梺鐟板槻閹虫﹢骞冮柨瀣嚤閻庢稒锕槐顒勬⒒閸屾艾锟芥悂宕愬畡鎳婂綊宕惰閺嗭箓鏌ｉ姀銏╃劸缂佹劖顨婇弻鐔兼焽閿曪拷閺嬬喓锟借娲橀悡锟犲蓟濞戙埄鏁冮柣妯诲絻婵酣姊洪挊澶婃殶闁哥姵鐗犲濠氬即閵忕娀鍞跺┑鐘绘涧濞层倕鈻嶈濮婃椽宕崟顒婄川缂備胶濮甸幑鍥ь嚕鐠囨祴妲堥柕蹇曞閵娾晜鐓ユ繝闈涙閸ｈ銇勯锟介ˇ闈涱潖閾忓湱纾兼俊顖濆亹椤撳吋绻涚�涙鐭ゅù婊勭矒閿濈偠绠涘☉娆愬劒闂侀潻瀵岄崢楣冩偂閹剧粯鐓熼柣妯哄帠閼割亪鏌涢弬璺ㄐх�规洘濞婇獮搴ㄦ嚍閵夈垺瀚奸梻浣侯攰閸嬫劙宕戝☉銏犵婵鎷烽柡灞剧洴瀵剟鎳楅姘间純闂備礁纾划顖炲箲閸ヮ剙鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.OneStuffCannot));
					return true;					
				}
				
				int prob = GetProbByNum(count);
				
				int index = Misc.getRandomBetween(1, 1000);
				
				SLiveSkillMakeDrug msg = new SLiveSkillMakeDrug();
				
				if (index <= prob) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崶褏顔嗛梺缁樺灱婵倝鎮￠妷鈺傜厸闁搞儺鐓侀鍫熷�堕柤纰卞墾閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩℃担鍙夌亖闂佸湱顭堝鈺呮晝閸屾稈鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鎵拷瑙勬礃閸旀﹢濡甸幇鏉跨婵犻潧娲﹀▍鍫熺節閻㈤潧浠滄俊顐ｇ懇楠炴劙骞栨担姝屝曢悷婊呭鐢鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崸妞硷拷浣割潩閼稿灚娅㈡繛瀵稿Т椤戝洤鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�? by changhao
				{
					fire.pb.item.SFoodAndDrugEffect jinchuang = (SFoodAndDrugEffect) fire.pb.item.Module.getInstance().getItemManager().getAttr(LiveSkillManager.ITEM_TYPE_DRUG_JIN_CHUANG);
					int jinchuangweight = jinchuang.getLianyaoWeight() - skilllevel * 2 - makingsweight;
					int drugtotalweight = LiveSkillManager.getInstance().drugtotalweight;
					
					int randomValue = Misc.getRandomBetween(0, jinchuangweight + drugtotalweight - 1);
					
					int curWeight = 0;
					
					int drug = LiveSkillManager.ITEM_TYPE_DRUG_JIN_CHUANG; //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀崣澶樻▊闂佺粯甯掗敃顏堝蓟閺囩喓绠鹃柣鎰靛墯閻濇梻绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繐鐖煎缁樻媴缁涘娈愰梺鍝ュ櫏閸嬪﹤鐣烽幆閭︽Щ缂備焦鍔栫粙鎴︹�旈崘顔嘉ч柛鈩冾焽椤︺儵姊洪悷鏉挎毐缂佺粯锕㈤妴浣糕枎閹惧磭鐫勯梺鍓插亞閸熷潡骞忓ú顏呪拺缁绢厼鎳庢禍褰掓煕鐎ｎ偆娲寸�规洘绻堥獮姗�顢欓悾灞藉箞闂備浇顫夐崕鎶筋敋椤撱垹绠犻柛娑卞灣绾惧吋銇勯弮鍥т汗濠⒀嶅閿熷�燁潐濞叉粓宕伴弽顓滐拷浣糕槈濡攱顫嶅┑顔斤供閸撴瑧绮婚悙娴嬫斀闁绘ê鐏氶弳鈺佲攽閻戝洦瀚规繝鐢靛仒閸栫娀宕楅悙顒傗槈閾绘牠鏌涘锟介悞锕傚疾濠婂喚娓婚柕鍫濇噽缁犱即鏌熼搹顐㈠缂侇喚绮妶锝夊礃閳哄啫骞堟俊鐐�栭崝锕傚磻閸曨剚娅犻柟娈垮枤绾剧厧顭块懜寰楊亜鈻嶅澶嬬厸鐎癸拷鐎ｎ剛锛熸繛瀵稿婵″洭骞忛悩鍨珰鐟滃海锟芥俺顫夌换婵嬫濞戝崬鍓伴梺鍝勵儎缁舵岸寮婚悢鐓庣鐟滃繒鏁☉銏＄厸闁告侗鍠楅崐鎰版煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�? by changhao
					if (randomValue < jinchuangweight) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囩叓閸ャ劍鐓ユい蹇氭硾閳规垿顢欓惌顐簻閻ｇ兘顢楅崟顐㈠亶闁诲海鏁诲濠氬箯妞嬪孩鍠嗛柛鏇ㄥ墰椤︻喖顪冮妶搴′簻妞わ箓浜堕弫鎾寸鐎ｎ偅閿梺闈涚墢椤牓顢氶敐澶婇唶闁哄洨鍋熼娲⒑缂佹◤顏堟倶濮橆儷鎺撴償閵忋垻鐦堥梺姹囧灲濞佳勭閳哄懏鐓欐繛鑼额唺缁ㄧ晫锟藉灚婢橀敃顏堝箰婵犲啫绶炴繛鎴炵玻閹风兘宕稿Δ浣叉嫼濡炪倖甯幏椋庣磼婢跺鍙�闁轰焦鎹囬幐濠冨緞鐎ｎ亝鐣婚梻浣烘嚀绾绢厽绻涢敓鑺ャ亜閵忊槅娈曢柟宄版嚇瀹曘劍绻濋崟鑸靛濡わ絽鍟埛鎺戔攽閻樻煡顎楀ù婊勭矋缁绘稓鎷犺椤╊剛绱掗鐣屾噰妤犵偛顑夐弫鍐晸娴犲绀勯柣妯虹湴閿熻姤甯掗～婵嬫倷椤掞拷椤忓爼姊绘担鍛婃儓闁活剙銈稿畷浼村冀瑜忛弳锔界節婵犲倹锛嶆俊鏌ョ畺閺岋綁濮�閳轰胶浠梺鐑╂櫓閸ㄨ泛顕ｆ繝姘櫜濠㈣泛锕﹂鎺楁⒑閸涘﹤濮屾い鏇熺矒楠炲繘鎮滈挊澶愭暅濠德板�ч幏鐑芥煢閸愵亜鏋涢柡宀嬬秮瀵噣宕掑杈吇闂備礁缍婇ˉ鎾诲礂濮楋拷楠炲啴鎸婃径鍡樼亖闁荤姵浜介崝灞炬叏婵傚憡鈷戦柛婵嗗閳诲瞼绱掔紒妯肩畵妞ゎ偄绻橀幖褰掑捶椤撶媴绱叉繝纰樻閸ㄦ娊宕曢妶鍥ㄥ珰闁绘劗鏁哥壕钘壝归敐鍛儓閺嶏繝姊虹紒姗嗘畼濠殿喗鎸抽、姘舵晲閸℃瑧鐦堝┑顔斤供閸庝絻顦叉い顓℃硶閹瑰嫭绗熼姘婵犵數鍋涢幊宀勫垂閽樺娼栭柧蹇氼潐瀹曞鏌曟繛鍨姕闁绘縿鍨藉娲偡閺夋寧顔�闂佺懓鍤栭幏锟�? by changhao
					{

					}
					else
					{
						//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秹骞婃惔銊ユ辈婵°倕鎳忛埛鎴犵磼鐎ｎ厽纭堕柣蹇涗憾閺屾稓锟斤綆鍋嗛埥澶嬨亜閺傝法绠伴柍瑙勫灴瀹曞爼濡烽妶鍥╂晨闂傚倷绀侀幖顐﹀疮椤愨挌娲Χ閸偅姣愭繝纰夌磿閸嬫垿宕愰弴鐘冲床闁圭儤顨呯粣妤呮煛瀹擃喖鏈紞搴㈢節閻㈤潧校闁肩懓澧芥竟鏇㈠礂閼测晝顔曢梺绯曞墲閿氶柣蹇氫含缁辨帡骞囬褎鐤佸┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告洦鍓欏▍鎴犵磽閸屾瑨鍏岀紒顕呭灣閺侇噣骞掑Δ濠冩櫔闂侀潧顧�婵″洨寮ч敓浠嬫⒑閸涘﹤濮﹀ù婊庝簻椤﹪顢氶敓钘夘潖濞差亜宸濆┑鐘插濡插牓姊洪幐搴㈢┛缂佺姵鎸搁悾鐑藉閵堝懐顔婇梺鐟扮摠濮婂綊寮敓浠嬫⒒娴ｈ櫣甯涙い顓炵墦椤㈡艾顭ㄩ崘鎯ф櫊闂侀潧顦弲婊堟偂閻旈晲绻嗛柕鍫濈箲鐎氬綊姊洪幐搴㈠濞存粍绮撻幃楣冩倻閼恒儱浠洪梺鍛婄☉閿曘儱鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�? by changhao
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
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閵夈垺娅囬柛妯煎█濮婄粯鎷呴搹鐟扮闂佹悶鍔岄悥鐓庮嚕閹间焦鍤掗柕鍫濇川椤︻垶姊洪崫鍕檨鐎癸拷閿熶粙宕悽鍛婄厽闁绘鍎ら鐘绘倶韫囧濮傜�规洘绻堥幃銏ゅ礂閼测晛骞愰梻浣虹《閸撴繈宕濋弴銏℃櫢闁兼亽鍎茬粈瀣攽閳╁啯灏︽鐐村浮楠炲顢橀悢宄板帪闂傚倷鑳剁划顖炲礉閿曞倸绀堟繛鍡樻惄閺佸倿鏌ょ粙鍨倎缂佽妫濋弻鏇㈠醇濠靛洦鎮欓柛鐔告倐濮婅櫣绮欓崹顕呭妷闂佹悶鍔屽锟犳偘椤旇法鐤�婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟濮濆瞼鐤�闁哄啫鍊昏ぐ楣冩⒑閸濆嫭鍌ㄩ柛鈺佸瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎼惈娆撳礃閻愵剙鐦滈梻渚�娼ч悧鍡椢涘Δ浣瑰弿鐟滄柨顫忔繝姘妞ゆ劑鍩勬导鍐倵鐟欏嫭绀冮柛銊﹀娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崜娆撶嵁瀹ュ鈷戦悹鍥у级閹癸綁鏌℃担瑙勫�愰柍銉畵瀹曠厧鈹戦崶銊ф濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佸湱鍎ら〃鍛村垂閸岀偞鐓欓柟顖滃椤ュ绱掗悩闈涙灈闁哄瞼鍠栧鑽わ拷闈涘濡差喖鈹戦埥鍡椾簼闁挎洏鍨介悰顕�寮介顒佸婵炴垶顏伴幋鐘辩剨濞寸厧鐡ㄩ悡鐔肩叓閸パ勬崳缂佹劖姊归幈銊︾節閸愨斂浠㈠┑鈽嗗亜閸燁偊鍩ユ径濠庢僵閺夊牃鏅滃鏍⒒閸屾瑨鍏屾い顓炵墦閺佸啴濡烽妷鍐ㄦ惈椤劑宕奸悢鍛婎仧闂備礁鍚嬫禍浠嬪磿鐎涙鐝舵俊顖涚湽娴滄粓鏌ㄩ弮鍌氫壕闁哄棭鍓涢敓鑺ヮ問閸犳危閹烘鍥礈娴ｈ櫣锛滈梺缁樏壕顓㈠煡婢跺浜滄い鎰剁悼缁犵偟锟借娲橀〃濠囧箠閺嶎厼鐓涢柛鎰暔閸庨潧顫忔繝姘＜婵炲棙鍩堝Σ顕�姊洪崷顓涙嫛闁稿锕悰顔界節閸涱垳鏉稿┑鐐村灦椤洭鎮惧ú顏呪拺缂佸娉曢悘閬嶆煕鐎ｎ偆娲撮柟閿嬪灴閹垽宕楅懖鈺佸箺闂備礁鎼崯顐﹀磹閹间焦鍎嶉柟杈鹃檮閻撴瑧锟界懓瀚妯何ｆ繝姘厓闁芥ê顦藉Σ鎼佹煃鐠囪尙效妞ゃ垺顭堥ˇ杈╃磼閵娿儯鍋㈤柡宀�鍠愮粭鐔煎垂椤旂⒈娼庨柣搴ゎ潐濞叉牠鎮ユ總鎼烇拷浣肝旀担鐟邦�撻梺鍛婄箓鐎氼剛绮婚妷锔剧瘈闁汇垽娼ф禒鈺呮煙濞茶绨界�垫澘锕ョ粋鎺旓拷锝庝簽閺屽牓姊虹粔鍡楀濞堟梻绱掗悩闈涒枅闁绘搩鍋婂畷鍫曞Ω閿旈敮鏁嶉梻浣烘嚀閸㈡煡宕查弻銉稏婵犻潧顑嗛崐閿嬨亜閹虹偞瀚瑰銈呴獜閹凤拷? by changhao
					
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
				else //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崶褏顔嗛梺缁樺灱婵倝鎮￠妷鈺傜厸闁搞儺鐓侀鍫熷�堕柤纰卞墾閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩℃担鍙夌亖闂佸湱顭堝鈺呮晝閸屾稈鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鎵拷瑙勬礃濠㈡﹢鍩ユ径鎰潊闁绘ɑ顔栭崬闈涒攽閿涘嫬浠滄い鎴濇嚇瀹曟瑦绂掔�ｎ亞顔嗛梺缁樺灱濡嫰宕归崒娑栦簻闁规澘澧庨幃濂告煕閹搭垳绡�闁哄矉绲鹃幆鏃堝閻樺弶鐦撻梻浣告啞閿氶柕鍫熸倐閸ㄩ箖鏁冮崒姘卞�炲銈呯箰濡盯寮剁粙搴撴斀闁绘劖娼欓悘鍗烆渻鐎涙ɑ鍊愮�殿喗褰冮埞鎴狅拷锝庡亐閹锋椽姊婚崒姘卞濞撴碍顨呭嵄鐟滅増甯楅悡鏇㈡煛閸屾粌浠滄繛灞傚�楃划濠氼敍閻愬鍙嗛梺缁樻礀閸婂湱锟芥熬鎷� by changhao
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
	
	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鐘栄囨煕閵夈垺娅囬柛妯煎█濮婄粯鎷呴搹鐟扮闂佹悶鍔岄悥鐓庮嚕閹间焦鍤掗柕鍫濇川椤︻垶姊洪崫鍕檨鐎癸拷閿熶粙宕悽鍛婄厽闁绘鍎ら鐘绘倶韫囧濮傜�规洘绻堥幃銏ゅ礂閼测晛骞愰梻浣虹《閸撴繈宕濋弴銏℃櫢闁兼亽鍎茬粈瀣攽閳╁啯灏︽鐐村浮楠炲顢橀悢宄板帪闂傚倷鑳剁划顖炲礉閿曞倸绀堟繛鍡樻惄閺佸倿鏌涢锝嗙闁抽攱甯掗湁闁挎繂鎳忛崯鐐烘煙椤栨氨澧﹂柡灞诲�曠叅閻犲洩灏欐禒鈺呮煣閼姐倕浠︾紒缁樼箞濡啫鈽夐崡鐐插闁诲氦顫夐幐鐑芥倿閿曞倸绠為柕濞垮剻閺冨偊鎷烽敐搴′簻妞ゅ繐鐖奸弻锝嗘償閵堝孩缍堝┑鐐插级閿曘垽寮崘顔碱潊闁靛牆娲ょ粊锕傛⒑鐟欏嫬绀冩い鏇嗗懐涓嶉柟鎯板Г閻撴盯鏌涢幇顓烆嚋閻庢艾缍婂鍝勭暦閸モ晛绗″┑鐐跺皺閸犲酣锝炶箛鏃傜瘈婵﹩鍓涢敍婊冣攽閻愬弶顥為柛鏃�顨婃俊鍫曞级鎼存挻鏂�闂佹枼鏅涢崯銊︾閻樼粯鐓曢柡鍌濇硶閻掓悂鏌嶉妷锔筋棃鐎规洘锕㈤、娆撴嚃閳哄﹤鏁藉┑鐘茬棄閺夊尅鎷疯楠炲繑顦版惔锝嗭紡濡炪倖鎸堕崝宥囷拷姘秺濮婂宕掑▎鎰偘濡炪値鍋勯ˇ闈涚暦閺囥垺鍋傛鐑嗗墯閻╊垰鐣烽悢纰辨晬婵炴垶甯楃�氳姤淇婇悙顏勶拷鏍偋濠婂牆纾婚柣鎰劋閸嬪倿鏌￠崶鈺佹灁缂佲槄鎷烽梻鍌氬�搁悧濠勭矙閹烘澶婎煥閸曗晙绨婚棅顐㈡处濮婂湱浜搁敃鍌涚厸閻忕偛澧藉ú鏉戔攽閳ュ磭鍩ｇ�规洟浜堕崺锟犲磼濠婂嫭顔曞┑鐘垫暩閸庢垹寰婇挊澹濇椽濡舵径瀣珖濡炪倕绻愰幊宥囨崲閸℃稒鐓欐い鏍ㄧ☉椤ュ鏌ｉ妶蹇斿闂傚倷绀侀幖顐﹀磹瑜版帩鏁勬繛鍡樺姇椤曢亶鏌熼崜褏甯涢柍閿嬪浮閺屾稓浠﹂崜褎鍣梺绋跨箰閻ジ鎯�椤忓牜鏁囬柣鎰版涧閻撶喖鎮楀▓鍨灍鐟滄澘鍟撮崺銉﹀緞閹邦剦娼婇梺鐐藉劚閸熸寧绔熼幒妤佲拻濞达絼璀﹂悞楣冩煟椤掞拷閵堢鐣烽幋婵冩婵ê褰夌粭澶愭⒑閸濆嫮鈻夐柣蹇斿姌閵囨劙骞掗幘鍏呮睏闁诲海鎳撴竟濠囧窗閺嶎厼绀堥梺顒�绉甸埛鎴犵磼鐎ｎ偒鍎ラ柛搴＄箻閹顫濋悡搴㈢亾濠碘�冲级閸旀瑩鐛幒妤�绫嶉柟鐐綑椤忓爼姊洪幐搴ｇ畵濡ょ姵鎮傞悰顔嘉旈崘顏咃紡濡炪倖鎸撮崜婵堟兜妤ｅ啯顥嗗璺侯儑缁★拷婵犵數濮撮崯顐ｆ叏婢跺瞼纾煎鑸得弸鐔兼煙娓氬灝濡界紒缁樼箞瀹曟帒鈽夊▎蹇撳闂備浇妗ㄧ粈渚�鎮ч幘璇茶摕婵炴垯鍨瑰敮闂佺懓鐡ㄧ换鍌炲几閵堝鐓熼幖娣灩閳绘洘鎱ㄦ繝鍛仩闁归濞�楠炴捇骞掑┑鍡椢ㄩ梻鍌欑閹诧繝宕归悽鐢电濠电姴鍊婚弳锕傛煥濠靛棭妲哥紒锟介崘鈹夸簻闁哄倹瀵ч～宥夋煏婢跺棙娅嗛柣鎾存礃缁绘盯骞嬪▎蹇曚患婵炲瓨绮庢晶妤佺┍婵犲浂鏁嶆慨姗嗗墻娴煎啫鈹戦纭烽練婵炲拑缍侀獮蹇涙偐鐠囪尙浼嬮梺鎯ф禋閸嬪棜銇愰弻銉︹拻濞达絿鍎ら崵锟介梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹? by changhao
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


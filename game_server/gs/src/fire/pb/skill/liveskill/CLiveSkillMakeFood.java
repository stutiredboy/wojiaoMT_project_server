
package fire.pb.skill.liveskill;





import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.AddItemResult;
import fire.pb.item.BagTypes;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.skill.SkillRole;
import fire.pb.util.Misc;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFood__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崶褏顔嗛梺缁樺灱婵倝鎮￠妷鈺傜厸闁搞儺鐓侀鍫熷�堕柤纰卞墾閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩℃担鍙夌亖闂佸湱顭堝鈺呮晝閸屾稈鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鎵拷瑙勬礃濠㈡﹢鍩ユ径鎰潊闁绘ɑ顔栭崬鐢告⒒閸屾瑧顦﹂柣蹇旂箞椤㈡牠宕橀埡鍐炬锤濠电姴锕ら悧濠囨偂閵夆晜鐓涢柛灞剧箖绾泛霉閻橆喖鐏柨鐔凤拷鐕佹綈闁瑰摜顭堣灋婵犻潧顑呴拑鐔兼煟閺冨倵鎷￠柡浣革躬閺屾稑鈹戦崱妤婁紑婵炲鍘ч悧鎾诲箖濡ゅ啯鍠嗛柛鏇ㄥ墮椤︹晠姊虹粙娆惧剰闁挎洏鍊濋幃楣冩倻閼恒儱浜滈梺缁樻尭鐎诡偊鍩￠崨顔惧弳闂佸搫娴傛禍婵堬拷姘秺濮婄儤瀵煎▎鎺濆悈闂佺懓鍤栭幏锟�
 * @author changhao
 *
 */
public class CLiveSkillMakeFood extends __CLiveSkillMakeFood__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefood = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SkillRole skillrole = new SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(LiveSkillManager.LIVE_SKILL_TYPE_COOKING);	//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫼闁荤姴娲ゅ鍫曞箲閿濆棛绠鹃柛娑卞亜閻忓弶顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ瑜嶉獮鍫ユ⒒娴ｅ憡鎯堟繛灞傚灲瀹曟繄浠﹂悙顒佺彿濡炪倖姊圭粊纭呫亹閹烘挸浜归梺鎯ф禋閸嬩焦绂掗姀鐘斀妞ゆ梻銆嬫Λ姘箾閸滃啰鎮兼俊鍙夊姍楠炴帡骞婂畷鍥ф灈闁圭绻濇俊鍫曞川椤撶喕绶㈤梻鍌氬�搁崐鐑芥嚄閸洏锟戒焦绻濋崶鑸垫櫔濠电姴锕ら幊蹇撶暦閸欏绡�闂傚牊绋掗惌妤冪磼鐠囧弶顥㈤柡宀嬬秮婵拷闁绘ê鍟块弳鍫ユ⒑缁嬫鍎忛悗姘嵆瀵鈽夊鍛澑濠殿喗锕╅崗娑樞уΔ鍛拺闁告稑顭悞浠嬫煛娴ｇ瓔鍤欐い顐㈢箻閹煎湱鎲撮崟顐わ紡闂備線娼ч…鍫ュ磿閺屻儲鍋熼柕蹇嬪�栭埛鎴︽煟閻斿憡绶叉繛鍫氭櫊閺岀喖宕欓妶鍡楊伓?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟濮濆瞼鐤�闁哄啫鍊昏ぐ楣冩⒑閸濆嫭鍌ㄩ柛鈺佸瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎼惈娆撳礃閻愵剙鐦滈梻渚�娼ч悧鍡椢涘Δ浣瑰弿鐟滄柨顫忔繝姘妞ゆ劑鍩勬导鍐倵鐟欏嫭绀冮柛銊﹀娣囧﹪鎳滈棃娑氱獮闁诲函缍嗛崜娆撶嵁瀹ュ鈷戦悹鍥у级閹癸綁鏌℃担瑙勫�愰柍銉畵瀹曠厧鈹戦崶銊ф濠电姷鏁告慨鐑姐�傞挊澹╋綁宕ㄩ弶鎴狅紱闂佽宕橀褏绮婚鐐寸叆闁绘洖鍊圭�氾拷? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
						
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						LiveSkillManager.LIVE_SKILL_TYPE_COOKING, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎处缁绘繂顕ラ柨瀣凡闁跨喓鐛ら崶褏顔嗛梺缁樺灱婵倝鎮￠妷鈺傜厸闁搞儺鐓侀鍫熷�堕柤纰卞墾閹烽鎲撮崟顒傤槶闂佺绻戦敃銏ゅΥ娴ｅ壊娼ㄩ柨鐔剁矙楠炲啴鍩℃担鍙夌亖闂佸湱顭堝鈺呮晝閸屾稈鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵缁炬澘宕禍鎵拷瑙勬礃濠㈡﹢鍩ユ径鎰潊闁绘ɑ顔栭崬鐢告⒒閸屾瑧顦﹂柣蹇旂箞椤㈡牠宕橀埡鍐炬锤濠电姴锕ら悧濠囨偂閵夆晜鐓涢柛灞剧箖绾泛霉閻橆喖鐏柨鐔凤拷鐕佹綈闁瑰摜顭堣灋婵犻潧顑呴拑鐔兼煟閺冨倵鎷￠柡浣革躬閺屾稑鈹戦崱妤婁紑婵炲鍘ч悧鎾诲箖濡ゅ啯鍠嗛柛鏇ㄥ墮椤︹晠姊虹粙娆惧剰闁挎洏鍊濋幃楣冩倻閼恒儱浜滈梺缁樻尭鐎诡偊鍩￠崨顔惧弳闂佸搫娴傛禍婵堬拷姘秺濮婄儤瀵煎▎鎺濆悈闂佺懓鍤栭幏锟�",
						YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				int totalweight = LiveSkillManager.getInstance().GetCookingWeightByLevel(skilllevel);
				int curweight = 0;
				int randomValue = Misc.getRandomBetween(0, totalweight - 1);
				int fooditem = 0;
				for (fire.pb.item.SFoodAndDrugEffect e : LiveSkillManager.getInstance().cookingfoodlist)
				{
					curweight += e.getPengrenWeight();
					if (randomValue < curweight)
					{
						fooditem = e.getId();
						break;
					}
				}	
				
				if (fooditem == 0)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.NoCookingFood));
					return true;					
				}
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				fire.pb.item.food.GeneralFood food = (fire.pb.item.food.GeneralFood)fire.pb.item.Module.getInstance().getItemManager().genItemBase(fooditem, 1);
				//food.setFlag( fire.pb.Item.BIND);
					
				fire.pb.common.SCommon common = ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(158);
	
				int delta = Integer.parseInt(common.value);
		
				int random = fire.pb.util.Misc.getRandomBetween(Math.max(liveskill.getLevel() - delta, 1), liveskill.getLevel());
				food.setQuality(random);
				
				//if(bag.addItem(food, -1, LiveSkillManager.CookingString, fire.log.YYLogger.COUNTER_TYPE, 2) != AddItemResult.SUCC)
				//{
				//	return false;
				//}
				
				if (bag.isFull())
				{
					fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.TEMP, false);
					if (tempBag.doAddItem(food, -1, LiveSkillManager.CookingString, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulianget, 2) != AddItemResult.SUCC)
					{
						return false;
					}
				}
				else
				{
					if(bag.doAddItem(food, -1, LiveSkillManager.CookingString, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuixiulianget, 2) != AddItemResult.SUCC)
					{
						return false;
					}						
				}				
					
				SLiveSkillMakeFood msg = new SLiveSkillMakeFood();
				msg.itemid = fooditem;
				msg.ret = 0;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
							
				return true;
			}
		};
		
		liveskillmakefood.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800521;

	public int getType() {
		return 800521;
	}


	public CLiveSkillMakeFood() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeFood) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveSkillMakeFood _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


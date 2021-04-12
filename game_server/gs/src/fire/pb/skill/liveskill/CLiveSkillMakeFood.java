
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枔閻涖倝宕惰椤斿棝姊虹紒妯虹伇濠殿喓鍊濋幃锟犲Ψ閳哄倻鍘搁梺鎼炲労閻撲線顢旈崼鐔凤拷鍫曟煠绾板崬澧鹃柟鐑筋棑閹叉挳宕熼鍌ゆФ闂備胶顭堢换鎴︽晝閵忋倕违濞达絽澹婂銊╂煥閻斿墎鐭欐鐐插暣閸┾剝鎷呴崣澶屼簴闂備礁婀遍…鍫濐啅閳哄懏鏅濋柛灞剧▓閹峰姊虹粙鎸庢拱闁荤啙鍥佸洭鏁冮崒娑氬幍缂佺偓婢樺畷顒佺閹殿噯鎷风憴鍕婵犮垺锕㈤崺銉﹀緞閹邦剦娼婇梺缁樕戦鏍船閻㈠憡鈷掗柛灞剧懅椤︼箓鏌ｈ箛鏃傜疄妞ゃ垺鐗犲畷姗�鍩￠崘鐐敜婵犵數濮撮敃銈夋偋婵犲洦鍋傞柕澶嗘櫆閻撴盯鏌涚仦鍓х畺缁绢叀娉涢湁闁绘﹩鍠栭悘顕�鏌ㄩ悢鍑ゆ嫹閻曚焦缍堥梺鐟版憸椤牐鐏嬪┑鐘绘涧椤戝懘鎷戦悢鍏肩厽闁哄啫鍊甸幏锟犳煛娴ｉ潻韬柡灞剧☉閳规垿宕卞Δ濠佺磻濠电偛顕崢褔鎮ч幘璇茬畺婵°倕鍟崰鍡涙煕閺囥劌澧い锔规櫊濮婅櫣绮欏▎鎯у壈闂佹寧娲忛崐婵嬪箖妤ｅ啯鍊婚柤鎭掑劚娴滄粓姊虹紒妯诲碍閻庤鍋婇崺锟犲川椤旀儳寮抽梻浣告惈濞村倹绂嶅┑鍫嫹濮橆剛绉烘慨濠勫劋鐎电厧鈻庨幒婵嗘倛闂備胶鎳撻崵鏍箯閿燂拷
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
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(LiveSkillManager.LIVE_SKILL_TYPE_COOKING);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氭澘顕ｉ崨濠勭懝闁跨喍绮欏璇测槈濡攱顫嶅┑顔筋殔閻楀﹪寮幆褉鏀介柣鎰级閸ｈ棄鈹戦鑲╀粵缂佸矁椴哥换婵嬪炊椤儸鍥ㄧ厱婵炴垵宕弸娑欑箾閸滃啰绡�婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥碍婢橀悾鐑筋敍閻愯尙楠囬梺鐟邦嚟婵潧鈻撴ィ鍐┾拺闂傚牊鍗曢崼銉ョ柧婵炴垶姘ㄥΛ顖滄喐閺冨牆钃熼柣鏃傚皑閹风兘鎮藉▓璺ㄥ姼婵炲濯存俊鍥箖椤曪拷閺佹劖寰勭�Ｑ勫闂佽崵濮村ú銈咁嚕閸洖绠查柨婵嗘缁犻箖鏌涘☉鍗炰簻闁诲繐寮堕〃銉╂倷閼碱剛顔掗梺璇″枟缁捇骞婇悙鍝勎ㄧ憸宥夌嵁閸儲鈷掑ù锝呮啞閹牊绻涚仦鍌氱伈鐎规洘绻勬禒锕傛倷椤掍胶褰挎俊鐐�栧鍦矈绾懌浜归柟鐑樻尭娴滃綊姊洪幆褎绂嬮柛瀣╃劍缁傛帡濮�閻橆偅鏂�濡炪倖姊婚妴瀣涘顓犵闁告粌鍟伴幃鍏间繆閸欏濮嶆鐐村浮楠炲﹤鐣烽崶褎鐏堥梺鍦劜缁绘繃淇婇崼鏇炲窛妞ゆ挾鍠曠欢銏ゆ⒒閸屾艾锟芥悂宕愰悜鑺ュ殑闁割偅娲忛敓鎴掔劍缁绘繈宕堕懜鍨珨婵犵數濮撮敃銈夊箠韫囨挾鏆﹂柛娆忣槺缁★拷闂傚倸鐗婄粙鎺楁儗濡ゅ啰纾奸悹鍥у级椤ャ垽鏌″畝瀣М濠殿噯鎷烽梺缁樏崯鍧楀汲閸儲鈷戠紒瀣儥閸庡繘鎮楀顐㈠祮鐎殿喛顕ч埥澶婎煥閸涱垱婢戞繝娈垮枟閿曗晠宕楀☉妯炑兾旈崨顔规嫼闂佸憡绋戦…顒勬倿娴犲鐓涘ù锝囩摂閸ゆ瑦銇勯銏㈢闁圭厧婀遍幉鎾礋椤愩倧绱￠梻鍌欑窔濞佳団�﹂崼銉ョ？闁哄被鍎查崑鐔兼煏韫囧锟芥牠鍩涢幋锔界厽闁绘柨鎲＄欢鍙夌箾閸碍娅婇柡宀�鍠栧畷娆撳Χ閸℃浼�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熸慨婵嗙灱閻わ拷闂佸搫鍟崐鏄忋亹妤ｅ啯鈷戦柛婵嗗閸屻劑鏌涢埡浣割伃鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幖顐︽儓濞嗘挸绀冮柣鎰靛墮閻︽粓姊绘笟锟藉褔鎮ч崱妞㈡稑螖娴ｇ懓寮块悷婊勬煥椤繑绻濆顒傤槹濡炪倖鍔戦崺鍕閸愵喗鍊甸悷娆忓缁�鍐煕閵婏箑顕滃ǎ鍥э躬閹虫粓妫冨☉姘辩嵁闂佽鍑界紞鍡涘礈濞嗘挾宓佺�广儱顦伴埛鎴︽偣閸パ冪骇闁圭櫢缍侀弻鈩冩媴鐟欏嫬锟芥劙鏌嶉妷顖滅暤鐎规洜鍘ч埞鎴﹀炊閵娧勵潠婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曘劑寮堕幋鐙呯幢闂備浇顫夊畷姗�顢氳缁顢涢悙瀵稿弳闂佺粯娲栭崐鍦拷姘炬嫹? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
						
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						LiveSkillManager.LIVE_SKILL_TYPE_COOKING, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枔閻涖倝宕惰椤斿棝姊虹紒妯虹伇濠殿喓鍊濋幃锟犲Ψ閳哄倻鍘搁梺鎼炲労閻撲線顢旈崼鐔凤拷鍫曟煠绾板崬澧鹃柟鐑筋棑閹叉挳宕熼鍌ゆФ闂備胶顭堢换鎴︽晝閵忋倕违濞达絽澹婂銊╂煥閻斿墎鐭欐鐐插暣閸┾剝鎷呴崣澶屼簴闂備礁婀遍…鍫濐啅閳哄懏鏅濋柛灞剧▓閹峰姊虹粙鎸庢拱闁荤啙鍥佸洭鏁冮崒娑氬幍缂佺偓婢樺畷顒佺閹殿噯鎷风憴鍕婵犮垺锕㈤崺銉﹀緞閹邦剦娼婇梺缁樕戦鏍船閻㈠憡鈷掗柛灞剧懅椤︼箓鏌ｈ箛鏃傜疄妞ゃ垺鐗犲畷姗�鍩￠崘鐐敜婵犵數濮撮敃銈夋偋婵犲洦鍋傞柕澶嗘櫆閻撴盯鏌涚仦鍓х畺缁绢叀娉涢湁闁绘﹩鍠栭悘顕�鏌ㄩ悢鍑ゆ嫹閻曚焦缍堥梺鐟版憸椤牐鐏嬪┑鐘绘涧椤戝懘鎷戦悢鍏肩厽闁哄啫鍊甸幏锟犳煛娴ｉ潻韬柡灞剧☉閳规垿宕卞Δ濠佺磻濠电偛顕崢褔鎮ч幘璇茬畺婵°倕鍟崰鍡涙煕閺囥劌澧い锔规櫊濮婅櫣绮欏▎鎯у壈闂佹寧娲忛崐婵嬪箖妤ｅ啯鍊婚柤鎭掑劚娴滄粓姊虹紒妯诲碍閻庤鍋婇崺锟犲川椤旀儳寮抽梻浣告惈濞村倹绂嶅┑鍫嫹濮橆剛绉烘慨濠勫劋鐎电厧鈻庨幒婵嗘倛闂備胶鎳撻崵鏍箯閿燂拷",
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



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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸顦╃紓浣虹帛缁诲倿顢氶妷鈺傜叆閻庯綆鍋嗛崙锟犳⒑鐠恒劌鏋旈柣娑栧�濆畷鎯邦槾妞ゆ柨妫濆铏圭磼濡櫣浼囨繝娈垮枔閸婃繈骞冮敓鐘参ㄩ柍鍝勫�婚崢鎼佹⒑閹肩偛鍔撮柣鎾茬窔椤㈡棃宕奸悢鍑ゆ嫹閸洘鐓犵痪鏉垮船婢ч箖鏌熼悜绛嬫闁瑰弶鎸冲畷鐔碱敆閸屻倖肖闂傚倷鑳堕…鍫㈡崲閹达附鏅濋柕蹇嬪�曡繚婵炶揪绲芥竟濠傤焽閵娾晜鐓ラ柣鏂垮閻瑦顨ラ悙鎻掓殻闁糕斁鍓濋幏鍛村矗婢跺奔绨撮梻鍌欑濠�閬嶁�﹂崼婵愬晠闁冲搫鎳忛弲婵嬫煕鐏炲墽鈻撻柟宄邦煼濮婅櫣绮欓幐搴㈡嫳闂佽崵鍟欓崶浣告喘閺佸啴宕掑☉姘箥缂備胶鍋撳妯虹暦椤掍胶顩查柟娈垮櫙閹烽鎲撮崟顒傤槰濠电姰鍨洪敃銏ゅ春閵夛箑绶為柟閭﹀墻濞煎﹪姊虹紒妯曟垿顢欓弽顓炶埞闁汇垹鎲￠埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岋綀绠涢弮鍌滅杽濡炪們鍨洪悧鐘茬暦濮楋拷閸╋繝宕橀悙顒勬暅濠电姷鏁告慨鎾晝閵堝鍋嬪┑鐘叉处閸嬪倿鏌曟径鍡樻珕闁绘挻鐩弻娑氫沪閸撗呯暫缂佺虎鍙�濞夋盯婀侀梺缁橈供閸犳牠鎮橀锟介弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牓姊洪悷鐗堟喐妞ゎ厼鐗愰悘瀣攽閻樼粯娑фい鎴濇嚇閹锋垿鎮㈤崗鑲╁幗闂佸搫鍟崐鐢稿箯閿熺姵鐓涘ù锝夋交闊剟鏌＄仦鍓р槈闁宠鍨垮畷鍗炍旀繝浣虹；婵犵數鍋涢顓㈠储瑜旈幃褔骞樼拠鑼暫濠德板�曢崯顖炲窗閸℃稒鐓曢柡鍥ュ妼婢ь喗銇勯敂瑙勬珚婵﹨娅ｇ划娆忊枎閹冨闂備焦瀵уú蹇涘磹濠靛绠栧Δ锝呭暞閸婂鏌ら幁鎺戝姎濞存粍绮撳铏圭磼濡纰嶉柣搴ゎ嚃閸嬪﹪宕洪敓鐘插窛妞ゆ梹鍎冲鎶芥⒒娴ｅ憡鎯堟繛鏉戝�圭粋宥呪攽閸剚瀚规慨姗嗗墰缁夌儤鎱ㄦ繝鍕妺閻庣數鍘ч埢搴ㄥ箳濠靛棙鍊涢梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷�
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
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(LiveSkillManager.LIVE_SKILL_TYPE_COOKING);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟版晥濠电媴鎷峰〒姘炬嫹婵﹨娅ｇ槐鎺懳熼搹閫涚礃婵犵妲呴崑鍕拷姘緲椤曪綁宕ㄦ繝鍕嚌闂佽法鍠嶇划娆忣嚕鐠囨祴妲堟俊顖炴敱椤秴鈹戦绛嬫當闁绘锕顐﹀箚瑜夐弨浠嬫煟閹邦剙绾ч柛锝堟閳规垿顢欓懖鈺�绮电紓浣哥焷妞村摜鎹㈠┑瀣倞妞ゎ剦鍎搁崶銊у幈濠电偞鍨靛畷顒勫几濞戞瑧绠鹃柛婊冨暟缁★拷濠殿喖锕ㄥ▍锝夊箲閸曨垰惟闁靛濡囨禍鐐寸節绾版ɑ顫婇柛瀣閿熻姤纰嶅姗�鎮鹃悜绛嬫晬闁绘劘灏欐鍥⒑閻熼偊鍤熷┑顕�娼ч埢鎾淬偅閸愨斁鎷洪梻鍌氱墛閸楁洟宕奸妷銉ф煣濠电偞鍨跺銊ノ涢婊勫枑闁哄啫鐗嗛拑鐔兼煟閺冨倸鐨戦柟椋庡厴閹棄鈻撶捄銊ュЪ濠电偛顕刊瀛樹繆閸ヮ剙绠栨い鏇嫹闁轰焦鍔栧鍕拷锛卞嫬顏归梻浣藉吹婵潙煤閵堝拋鍤曢柛顐ｆ礀缁犳煡鏌ㄥ┑鍡橆棤缂佺娀绠栭弻娑樷槈閸楃偘绨婚梺璇茬箰瀵爼銆冮妷鈺傚�烽柤纰卞墰椤旀帡姊虹拠鈥虫灍缂侇喗鎹囬獮濠囨倷閸濆嫀銊ф喐瀹ュ宓侀柛顐犲劜閳锋帒霉閿濆懏鍟為柟顖氱墛缁绘稓浠﹂崒姘变紙閻庤娲樼换鍕閿曞倹鍊锋い鎺嶈兌瑜版寧淇婇悙顏勶拷鏍ь潖閸︻厾鐭堢痪顓炴噷娴滃綊鏌熼悜妯诲碍濞存粌缍婂娲箚瑜庣粋瀣煕鐎ｂ晝鍔嶇紒鍌涘浮婵拷闁绘﹩鍋呴弬锟芥俊鐐�栧濠氬Υ鐎ｎ倠娑橆潩椤撶姷顔曢梺鍛婄矊閸熶即骞冮崗闂寸箚闁告瑥顦慨宥嗩殽閻愭潙娴鐐诧工閻ｇ兘宕惰閻忓牓姊洪崷顓у姕缂佺粯绻冩穱濠囧醇閺囩偛绐涘銈嗘尵閸犳洜娆㈤姀銈嗏拻闁稿本鑹鹃敓鑺ユ倐瀹曟劙鎮滈懞銉ユ畱闂佸壊鍋呭ú蹇涙晸閹存帞鍔嶇紒缁樼箞瀹曞爼鎳滈崹顐ｇ彣濠电姷鏁告慨鎾晝閵堝绠犻煫鍥ㄦ尵閺嗭箓鏌涘▎蹇ｆШ缂佲槄鎷烽梻鍌氬�搁悧濠勭矙閹烘鍎楁俊銈呭暟绾惧ジ鎮归崶褍绾фい銉ｅ灲閺屸�崇暆鐎ｎ剛袦婵犳鍣幏鐑芥⒑缂佹◤顏堝疮閸ф姹查柛顐犲劜閳锋垹绱掔�ｎ偒鍎ラ柛搴＄箻閹顫濋銏犵ギ閻庢鍠涢褔鍩ユ径濠庣叆闁告侗鍨卞鎴炵節濞堝灝鏋熼柨鏇楁櫊瀹曟鈽夊Ο鐐戝吘鏃堝川椤旇瀚奸梻浣告啞缁嬫垿鈥﹂鍕�垮ù鐘差儐閻撴稑霉閿濆洨鎽傞柛銈嗙懄閵囧嫰顢曢姀銏㈩啋闂佸湱鍘у﹢閬嶅箟閹绢喖绀嬫い鎰╁�х槐锟犳⒒閸屾瑧绐旀繛浣冲洠锟斤箓宕奸妷銉э紵闂佸搫琚崕鏌ュ磻閻斿吋鐓忛煫鍥ь儏閿熻姤鐗犻崺娑㈠箣閿旂晫鍘介梺缁樻煥閹诧紕娆㈤崣澶岀闁割偅纰嶅▍濠囨煛瀹�锟介崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍氶梻鍌欒兌椤牏鎮锕�绀夐幖娣妼缁犵喐鎱ㄥ┑鍡欑伇闁汇倧鎷烽梻浣告惈閸燁偊宕愰弰蹇嬩汗濡わ絽鍟埛鎴︽煕濠靛棗顏柛灞诲姂閺屾盯鍩℃担鍓蹭純閻庢鍣崑濠傜暦閸洦鏁嗗ù锝呮惈鐢箖姊绘繝搴′簻婵炶绠戠叅闁哄诞鍕槑闂傚倸鍊风粈渚�骞栭锔藉創婵炲棙鎸哥粈鍐煟閹伴潧澧柣锔界矒濮婄粯绗熼敓钘夘焽瑜旈幃褔宕卞銏＄☉铻栧ù锝囨嚀瀵潡鎮峰鍕叆妞ゎ偄绻戠换婵嗩潩椤掑偆妲规俊鐐�栭崝鎴﹀春閸曨剙顕遍柛鎰靛枟閸婄敻鎮峰▎蹇擃仾缂侊拷閸愵喗鐓曢柕濠忕畱椤曟粌菐閸パ嶈含闁硅櫕绮撳Λ鍐ㄢ槈濮樿京宓侀梻浣筋嚙閸戠晫绱為崱娑樼婵炲棙鎸惧畵浣猴拷骞垮劚椤︿即鍩涢幋锔藉仯闁搞儜鍐獓闂佸湱娅㈢紞渚�寮婚埄鍐╁閻熸瑥瀚敓鑺ュ姍閺屽秹濡烽婊呮殼閻庤娲滈崢褔鍩為幋锕�鐐婇柕濞у嫷娼犲┑鐘垫暩婵兘寮崨濠冨弿闁绘垵顫曢敓钘夊�块幐濠冪珶閳哄绉�规洏鍔戝鍫曞箣閻欏懐骞㈤梻鍌欐祰椤鐣峰锟介、姘愁槾缂侇喖顭烽、娑㈡倷鐎电寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
						
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						LiveSkillManager.LIVE_SKILL_TYPE_COOKING, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸顦╃紓浣虹帛缁诲倿顢氶妷鈺傜叆閻庯綆鍋嗛崙锟犳⒑鐠恒劌鏋旈柣娑栧�濆畷鎯邦槾妞ゆ柨妫濆铏圭磼濡櫣浼囨繝娈垮枔閸婃繈骞冮敓鐘参ㄩ柍鍝勫�婚崢鎼佹⒑閹肩偛鍔撮柣鎾茬窔椤㈡棃宕奸悢鍑ゆ嫹閸洘鐓犵痪鏉垮船婢ч箖鏌熼悜绛嬫闁瑰弶鎸冲畷鐔碱敆閸屻倖肖闂傚倷鑳堕…鍫㈡崲閹达附鏅濋柕蹇嬪�曡繚婵炶揪绲芥竟濠傤焽閵娾晜鐓ラ柣鏂垮閻瑦顨ラ悙鎻掓殻闁糕斁鍓濋幏鍛村矗婢跺奔绨撮梻鍌欑濠�閬嶁�﹂崼婵愬晠闁冲搫鎳忛弲婵嬫煕鐏炲墽鈻撻柟宄邦煼濮婅櫣绮欓幐搴㈡嫳闂佽崵鍟欓崶浣告喘閺佸啴宕掑☉姘箥缂備胶鍋撳妯虹暦椤掍胶顩查柟娈垮櫙閹烽鎲撮崟顒傤槰濠电姰鍨洪敃銏ゅ春閵夛箑绶為柟閭﹀墻濞煎﹪姊虹紒妯曟垿顢欓弽顓炶埞闁汇垹鎲￠埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岋綀绠涢弮鍌滅杽濡炪們鍨洪悧鐘茬暦濮楋拷閸╋繝宕橀悙顒勬暅濠电姷鏁告慨鎾晝閵堝鍋嬪┑鐘叉处閸嬪倿鏌曟径鍡樻珕闁绘挻鐩弻娑氫沪閸撗呯暫缂佺虎鍙�濞夋盯婀侀梺缁橈供閸犳牠鎮橀锟介弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牓姊洪悷鐗堟喐妞ゎ厼鐗愰悘瀣攽閻樼粯娑фい鎴濇嚇閹锋垿鎮㈤崗鑲╁幗闂佸搫鍟崐鐢稿箯閿熺姵鐓涘ù锝夋交闊剟鏌＄仦鍓р槈闁宠鍨垮畷鍗炍旀繝浣虹；婵犵數鍋涢顓㈠储瑜旈幃褔骞樼拠鑼暫濠德板�曢崯顖炲窗閸℃稒鐓曢柡鍥ュ妼婢ь喗銇勯敂瑙勬珚婵﹨娅ｇ划娆忊枎閹冨闂備焦瀵уú蹇涘磹濠靛绠栧Δ锝呭暞閸婂鏌ら幁鎺戝姎濞存粍绮撳铏圭磼濡纰嶉柣搴ゎ嚃閸嬪﹪宕洪敓鐘插窛妞ゆ梹鍎冲鎶芥⒒娴ｅ憡鎯堟繛鏉戝�圭粋宥呪攽閸剚瀚规慨姗嗗墰缁夌儤鎱ㄦ繝鍕妺閻庣數鍘ч埢搴ㄥ箳濠靛棙鍊涢梻鍌欒兌閹虫捇宕甸弽顓炵闁跨噦鎷�",
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


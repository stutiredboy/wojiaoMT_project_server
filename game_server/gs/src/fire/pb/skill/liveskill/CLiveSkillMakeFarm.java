
package fire.pb.skill.liveskill;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.DataInit;
import fire.pb.RoleConfigManager;
import fire.pb.common.SCommon;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFarm__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灥椤曆呭枈瀹ュ鐓熼柣鏂挎憸閹虫洜绱掗悩铏磳妤犵偛鍟灃闁告侗鍠楀▍婊堟煙閼测晞藟闁告挻绻堥幃姗�宕奸姀銏紳婵炴挻鑹鹃敃銉э拷姘愁潐缁绘繈濮�閿濆懐鍘梺鍛婃⒐閻楃娀骞冮垾鏂ユ婵鍋撶�氬綊鎮峰▎蹇擃仾闁诡垰瀚伴弻娑㈡偐瀹曞洤鈷堢紓渚囧枟濡啴骞冨鍫熷殟闁靛闄勯鐔兼⒒娴ｈ棄袚闁挎碍銇勯敂鍨祮鐎规洘鍨挎俊鐑藉煛閸屾粌骞愰梺璇茬箳閸嬬娀顢氳閹便劑宕掗悙瀵稿幍濡炪倖鏌ㄩ幖顐︽晸閼恒儳绠撻柣锝囧厴楠炴帡骞嬮弮锟介～宥呪攽椤旂瓔娈旀俊顐ｆ⒒濡叉劙鏁撻敓锟�
 * @author changhao
 *
 */
public class CLiveSkillMakeFarm extends __CLiveSkillMakeFarm__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);	
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefarm = new mkdb.Procedure()
		{			
			@Override
			protected boolean process()
			{
				int skilllevel = 1;
				int money = 100;
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FARM, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁告侗鍘鹃崢顐︽⒑闁稓鈹掗柛鏂跨焷閻忔帡姊洪崷顓х劸婵炲鍏樻俊鎾箛椤斿墽锛濇繛杈剧到閹碱偄鐨梻浣告啞椤ㄥ棙绻涙繝鍌ゅ殨閻犲洦绁村Σ鍫熶繆椤栫偞鏁辨い顐㈢Т閳规垿顢欑粵瀣暥闂佺粯顨呭Λ娆戯拷闈涖偢楠炲洭顢楁径瀣槣闂備線娼ч悧鍡椢涘▎鎴犵焼閻庯綆锟姐垻鎳撻…銊╁礃椤忓嫮鍘介柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�",
						YYLoggerTuJingEnum.tujing_Value_dagong, false);
				
				if (energyenough == false) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑嗛娆撳磿韫囨柣浜滈柟瀛樼箥濡拷閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁稿本绋戞禒鎾⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊箻椤旇棄锟界兘鎮归崶鍥у椤忓爼姊洪崨濠勨槈妞ゎ収鍓熷銊﹀鐎涙ǚ鎷婚梺绋挎湰閻熴劑宕楀畝锟界槐鎺楊敋閸涱厾浠搁悗娈垮枛椤攱淇婇幖浣哥厸濞达絽褰ㄩ弴銏＄厽閹兼惌鍨崇粔鐢告煕閻樻剚娈滅�规洘鍨垮畷鎺楁倷鐎电骞愰梻浣规偠閸庮垶宕曢柆宥嗗�舵い蹇撶墛閻撶喖鏌熼幆褍鑸归柛鏃撶畵閺屸�崇暆鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢鎳犻澶嬓滈梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸涱喛纭�缂備浇椴哥敮锟犲箖閳哄懏顥堟繛鎴炲笚閻庝即姊绘担鍛婃儓闁活剙銈稿畷浼村冀椤撶姴绁﹂梺绯曞墲閸戠懓危妤ｅ啯鈷戦柟绋挎捣閳藉绱掓径濠勭Ш鐎殿喖顭烽弫鎾绘偐閹绘帟锟藉灝顪冮妶鍡樺暗濠殿喚鍏樺鎶藉Χ閸涱亝鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰閻瑩鏌曢崱鏇狀槮閾绘牠鏌涘☉鍗炴灍婵炲懌鍨藉鐑樺濞嗘垵鍩岄梺娲诲墮閵堟悂骞嗗畝鍕缂備焦锚閿熺晫鏁婚弻锝夊閻樺啿鏆堟繛瀛樺殠閸婃繈寮婚悢椋庢殝闁哄瀵т簺婵＄偑鍊ら崑鍛崲閸儯锟戒礁螖娴ｅ摜绐為柣搴稻閹稿爼宕濋幋婵愭綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇撴閳规垿鍩ラ崱妞剧盎闁诲孩鍑归崰姘跺礆閹烘梹瀚氱�瑰壊鍠栭幃鎴炵節閵忥絾纭鹃柨鏇畵閺佸秹鎮㈤崗灏栨嫽婵炴挻鑹惧ú銈嗘櫠椤斿墽纾煎璺侯煬閸ょ喓绱掗纰辩吋闁诡喒鏅濋幏鐘绘嚑椤掑鏅ｉ梻鍌欑濠�閬嶅煕閸儱鍌ㄥΔ锝呭暙閸屻劍绻濇繝鍌涘櫧缁惧墽鏅敓钘夌畭閸庡崬螞濞戞瑦娅犻柣銏犳啞閻撴盯鎮橀悙闈涗壕缂侊拷鐎ｎ剨鎷风憴鍕闁告鍥х厴闁硅揪绠戠粻娑欍亜閹剧绱￠柛銉ｅ妷閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? by changhao
				{
					fire.pb.fushi.SCommonDayPay cost = ConfigManager.getInstance().getConf(fire.pb.fushi.SCommonDayPay.class).get(7);
					money = cost.getServerdata();
					
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘垿濡甸崟顖氱闁告鍋熸禒鑲╃磽娴ｅ搫顎岄柛銊ョ埣瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎺楁倶閸儲鍊甸柣鐔哄閸熺偟绱掔拠鎻掓殻濠碉紕鏁诲畷鐔碱敍濮橀硸鍟嬮梺璇查叄濞佳囧箺濠婂牊鍋╁┑鍌氭啞閳锋垹鐥鐐村婵炲吋鍔栫换娑㈠矗婢跺苯鈷岄梺绯曟櫇閸嬨倝鐛�ｎ喗鏅滈柦妯侯槷濮规姊绘担鍝ョШ妞わ綇濡囩划鍫熺瑹閿熻棄顕ｉ弻銉︾劶鐎广儱妫岄幏娲⒑閸涘﹦缂氶柛搴ら哺閻楀酣鏌ｆ惔锝嗩仧闁圭兘顥撶槐鎺旓拷锝庡幗绾爼鏌￠崱顓犵暤闁哄瞼鍠愬蹇涘礈瑜忛弳鐘绘煕閵夈儳鎽犵紒缁樼箞婵拷闁挎繂妫涢妴鎰版⒑閹稿孩纾搁柛鏃�鍨块悰顔嘉旈崨顓炲祮闂侀潧绻嗛敓钘夊帠閻㈢粯绻濋悽闈浶㈤柨鏇樺�濆畷顖炲箥椤斿彞绗夌紓鍌欑劍閿曗晛鈻撴禒瀣厽闁归偊鍘界紞鎴︽煟韫囨搩鍤熼柨鐔凤拷鐕佹綈婵炲弶绮撳畷浼村冀椤撴粣鎷锋担绯曟婵☆垶鏀遍～宥呪攽閻愬弶顥滅紒缁樺姈閹便劑宕橀瑙ｆ嫽婵炶揪缍�濡嫰宕ラ悷鎵虫斀妞ゆ棁濮ょ紞鎴︽偂閵堝鐓熸俊顖濆亹鐢盯鏌￠崨顔藉�愰柡灞剧♁缁绘繈宕熼锝囷拷濠氭⒑濮瑰洤濮�婵炲拑绲垮Σ鎰板箳濡や焦娅㈡繛瀵稿Т椤戝棝寮查幖浣圭叆闁绘洖鍊圭�氾拷 by changhao
					if(bag.addSysMoney(money, LiveSkillManager.MakeFarm, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 0) != money)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}		
				}
				else
				{
					final fire.pb.common.SCommon cc = fire.pb.RoleConfigManager.getRoleCommonConfig(109);
					money = Integer.parseInt(cc.getValue());
					
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘垿濡甸崟顖氱闁告鍋熸禒鑲╃磽娴ｅ搫顎岄柛銊ョ埣瀵鈽夐姀鐘电杸闂傚倸鐗婄粙鎺楁倶閸儲鍊甸柣鐔哄閸熺偟绱掔拠鎻掓殻濠碉紕鏁诲畷鐔碱敍濮橀硸鍟嬮梺璇查叄濞佳囧箺濠婂牊鍋╁┑鍌氭啞閳锋垹鐥鐐村婵炲吋鍔栫换娑㈠矗婢跺苯鈷岄梺绯曟櫇閸嬨倝鐛�ｎ喗鏅滈柦妯侯槷濮规姊绘担鍝ョШ妞わ綇濡囩划鍫熺瑹閿熻棄顕ｉ弻銉︾劶鐎广儱妫岄幏娲⒑閸涘﹦缂氶柛搴ら哺閻楀酣鏌ｆ惔锝嗩仧闁圭兘顥撶槐鎺旓拷锝庡幗绾爼鏌￠崱顓犵暤闁哄瞼鍠愬蹇涘礈瑜忛弳鐘绘煕閵夈儳鎽犵紒缁樼箞婵拷闁挎繂妫涢妴鎰版⒑閹稿孩纾搁柛鏃�鍨块悰顔嘉旈崨顓炲祮闂侀潧绻嗛敓鐣岊劜閹风兘鎮介崨濠勫幗閻熸粌绉归獮澶愭晬閸曡埖瀚规慨姗嗗墰缁夌儤鎱ㄦ繝鍐┿仢鐎规洏鍔嶇换婵嬪礃椤垶袩闂傚倷鑳堕…鍫ヮ敄閸涱厙娑樷攽鐎ｎ煉鎷锋担鍓叉建闁跨喕妫勯悾鐑筋敃閿曪拷缁�瀣煏婵犲繘妾柡澶嬫倐濮婄粯鎷呴搹鐟扮濡炪値鍘煎ú銊╁礆閹烘鏁嶆慨姗堢稻椤秹鎮峰鍕棃鐎殿喖顭烽弫鎰板川閸屾稒鈷愰柟宄版嚇閹煎綊宕烽鐐茬瑨闂傚倷娴囬褔鏌婇敐鍜佺劷鐟滄梹淇婇崼鏇炵濞达絽鎲￠悗顒勬⒑閻熸澘鈷旂紒顕呭灦瀵煡骞栨担鍦弳闂佺粯娲栭崐鍦拷姘炬嫹 by changhao
					if(bag.subGold(money, LiveSkillManager.MakeFarm, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuiyaofang, 0) != money)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}					
				}
				
				SLiveSkillMakeFarm msg = new SLiveSkillMakeFarm();
				msg.addgold = money;
				mkdb.Procedure.psendWhileCommit(roleid, msg);					
		
				return true;
			}
		};
		
		liveskillmakefarm.submit();
		
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800527;

	public int getType() {
		return 800527;
	}


	public CLiveSkillMakeFarm() {
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
		if (_o1_ instanceof CLiveSkillMakeFarm) {
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

	public int compareTo(CLiveSkillMakeFarm _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


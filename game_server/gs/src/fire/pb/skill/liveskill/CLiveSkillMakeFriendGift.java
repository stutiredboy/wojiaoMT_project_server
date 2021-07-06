
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.util.BagUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFriendGift__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢楅敓鐣岀棯瑜旈弻锝夊Χ閸涱収浠奸梺瀹狀潐閸ㄥ爼鐛繝鍥ㄧ厱濠电倯鍐╁櫣缂佽翰鍊曢湁闁绘ê妯婇崕蹇涙煟閵堝骸鏋熼柕鍥у瀵粙顢曢～顓犳崟闂備礁鎲￠懝鍓х礊婵犲洤钃熼柣鏂垮悑閻掍粙鏌ㄩ弴顏呭濡ょ姷鍋為崹鐢告箒濠电姴锕ょ�氼噣鎯岄幒妤佺厸閻忕偤娼婚幏鐑藉箛娴ｅ憡鍊梻浣告啞閸旀垿宕濆畝鍕拷鏍拷锝庡枟閳锋垶绻涢懠棰濆殭妤犵偞鐗犻弻锝夘敆閸愩劋姹楀┑鈥冲级閸旀瑩鐛幒鎳虫棃鏁撻悾宀�涓嶉柣鏂垮悑閸婄敻鏌ㄥ┑鍡涱�楀褌鍗抽弻锟犲幢濞嗗繆鏋呴梺鍝勭潤閸涱垳锛滃┑鈽嗗灣閸樠囧煕瀹�鍕拺闁告繂瀚～锕傛煕閺傝法鐒搁柛鈺冨仱楠炲鏁冮敓浠嬬嵁閵忊�茬箚妞ゆ牗绮岄崝瀣亜韫囨洖鈻堟慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍婵犵妲呴崑鍛存偡閳哄懎绠栭柣鎴ｆ閻撴盯鏌涘☉鍗炲绩闁硅姤娲熷铏圭磼濡崵鍙嗛梺鍛婅壘椤戝鐣烽弴鐐垫殕闁告洦鍓涢崢鍗炩攽閻愭潙鐏﹂柨鏇ㄥ亜椤斿繘濡烽敂杞扮盎闂婎偄娲㈤崕鑼拷姘炬嫹?
 * @author changhao
 *
 */
public class CLiveSkillMakeFriendGift extends __CLiveSkillMakeFriendGift__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefriendgift = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				int skilllevel = 1;
				
				fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT);
				
				if (config == null)
				{
					LiveSkillManager.logger.error("CLiveSkillMakeFriendGift config error:" + LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT);
					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				fire.pb.skill.SLifeSkillCost cost = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkillCost.class).get(skilllevel);
				if (cost == null)
				{
					LiveSkillManager.logger.error("CLiveSkillMakeFriendGift skill level error:" + skilllevel);
					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;					
				}
				
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT, 
						skilllevel,"濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗嗘慨娑氱磽娴ｅ搫鈻堢紒鐘崇墵瀵濡搁埡鍌氫簻闁荤姴娲﹂悾顐﹀箻閸撲胶锛滅紓鍌欑劍椤洭鍩︽笟锟介弻鐔风暋閻楀牆娈楅悗瑙勬礃閿曘垹鐣烽敐鍡楃窞閻庯綆鍋勯敓浠嬵棑缁辨挻鎷呴崫鍕闂佺楠哥壕顓犳閻愬绡�闁搞儜鍡樻啺闂備焦瀵уú鈺呭箯閻戣姤鎳氶柨婵嗩槹閻撶喐鎱ㄥ鍡楀⒒闁搞倗鍠撶槐鎺楁晸娴犲骞㈡俊鐐电帛閺傦拷闂備胶绮崝鏍ь焽濞嗘挻鍊堕柣鏂垮悑閻撴洟鏌曟繛鍨姕閻犳劧绱曠槐鎺楊敊閼测晛鈪遍梺璺ㄥ枑閺嬭崵绱為崱娑樼；濞达絽婀遍々鍙夌節婵犲倻澧涢柣鎾寸懃闇夐柣鎾虫捣閹界姵绻涢幊宄板幘閻熼偊鐓ラ柛鏇ㄥ幘閻撲胶绱撴担铏瑰笡闁烩晩鍨伴悾鐑芥偂鎼存ɑ顫嶅┑鈽嗗灟鐠�锕�顭囨惔銏㈢瘈婵炲牆鐏濋弸娑㈡煥閺囨ê鍔氭い顏勫暣閹稿﹥寰勭仦鐐啎闂備線娼ч…顓熶繆閸モ晛濮柨鐔剁矙濮婃椽宕ㄦ繝鍐槱闂佸憡锚婢х晫鍒掗敐鍛傛棃宕ㄩ瑙勫濠电偠鎻徊鑲╂媰閿曞倹鍊垮Δ锝呭暞閸婂灚绻涢幋鐐茬瑲婵炲懎妫涚槐鎺旂磼濡皷妾ㄧ紓浣虹帛缁诲牆鐣烽幆閭︽Ь闂佷紮缍佺粻鏍箖濡ゅ懏鍎岄柛娑橈工椤忓爼姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤栨稑娈岄梺鍓茬厛閸犳帡寮ㄦ禒瀣厽闁归偊鍘界紞鎴︽煟韫囥儳鐣甸柡宀嬬秮閹垹鈹戦崱妯绘倷闂佺琚崝鎴﹀蓟閻旂⒈鏁嶉柛鈽嗗幗鐎氬綊姊洪悮瀛樺婵炲濮撮鍡涙偂閻斿吋鐓欓梺顓ㄧ畱婢т即鏌熼悾灞叫ョ紒杈ㄦ尭椤撳ジ宕卞Δ鍐ф闂備線娼уú銈囷拷姘嵆閻涱喚锟斤綆浜栭弨浠嬫煕閵夈劌鐓愭い銉秮濮婄粯鎷呴崫銉︾�銈嗘肠閸涱垳鐓嬮梺鑽ゅ枑婢瑰棝寮抽敃鍌涚厪濠电倯鍐ｉ悗姘愁潐缁绘盯骞嬮悙鍨櫧闂佺粯甯婄划娆撳蓟濞戞鐔虹磼濡櫣锛撴繝娈垮枛閿曘儱顪冮挊澶屾殾闁靛濡囩弧锟介梺绋挎湰缁牓骞嬮悜鑺モ拻濞达絼璀﹂悞楣冩煥閺囨ê鍔﹂柟顔ㄥ喚鐓ラ柛顐ゅ枑濞呫垽姊洪崗闂磋埅闁稿孩濞婂畷顖炲蓟閵夛妇鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�", YYLoggerTuJingEnum.tujing_Value_friendgive, false);
				
				if (energyenough == false) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈嗐亜椤撶姴鍘寸�殿喖顭烽弫鎰緞婵犲嫮鏉告俊鐐�栫敮濠囨倿閿曞倸纾块柟鍓х帛閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒娑樹淮閻庢鍠栭…鐑藉极閹邦厼绶炲┑鐘插缂嶅倿姊绘担铏瑰笡闁挎岸鏌涢悢閿嬪仴鐎殿喗濞婂畷濂稿Ψ閿旇瀚肩紓鍌欑椤戝棝顢栧▎鎾崇？闊洦鏌ｆ禍婊堟煙鐎涙绠ユ俊顖ゆ嫹闁诲孩顔栭崰鏍�﹂柨瀣╃箚闁归棿绀侀悡娑㈡煕鐏炲墽鐓紒銊ょ矙濮婄粯鎷呮笟顖滃姼闂佸搫鐗滈崜娑氬垝濞嗘挸绠ｉ柨鏃傜帛閺呮粓姊虹捄銊ユ珢闁瑰嚖鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋块椤︻垶鈥﹂崸妤佸殝闂傚牊绋戦～宀�绱撴担鍝勭彙闁搞儯鍔庨崢閬嶆⒑閸濆嫮袪闁稿﹥娲橀弲鍫曞蓟閵夛箑锟藉灚鎱ㄥ鍡楀缂佸妞介弻鈥崇暆閿熶粙宕伴弽褏鏆︽繝濠傛－濡查箖鏌ｉ姀鈺佺仭闁烩晩鍨跺璇测槈濞嗘垹鐦堥梺绋挎湰缁嬫垶绂掗幘顔解拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶婄妞ゆ棁妫勯敓鐣屽厴閹綊宕堕崶褍顏╂い蹇撶埣濮婃椽宕ㄦ繝鍕ㄦ濡炪値鍙庨崜鐔奉嚕閵婏箑顕遍悗娑櫱氶幏濠氭⒑缁嬫寧婀伴柣鐔村姂瀹曟鐣濋敓鐣屾閹烘鏁嬮柛娑卞幘娴犳悂鎮楀▓鍨灈妞ゎ參鏀辨穱濠囧箹娴ｅ摜鍘告繛杈剧到瑜般劑寮撮姀锛勫幗闁瑰吋鎯岄崹宕囩矓閻㈠憡鐓曢柣妯诲墯濞堟粎锟借娲橀崹鍨暦閹烘鍊烽悗鐢殿焾楠炴劙姊绘担瑙勫仩闁稿寒鍨跺畷鏇㈡焼瀹ュ棗锟借埖銇勮箛鎾跺闁绘挾鍠栭弻鐔煎箚瑜嶉懜褰掓煕閺冩挾鐣甸柡灞革拷宕囨殕閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}				
				
				int added = BagUtil.addItem(roleid, LiveSkillManager.ITEM_TYPE_FRIEND_GIFT, 1, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_tongxinjie, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeFriendGift msg = new SLiveSkillMakeFriendGift();
				msg.itemid = LiveSkillManager.ITEM_TYPE_FRIEND_GIFT;
				mkdb.Procedure.psendWhileCommit(roleid, msg);	
				
				return true;
			}
		};
		
		liveskillmakefriendgift.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800523;

	public int getType() {
		return 800523;
	}


	public CLiveSkillMakeFriendGift() {
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
		if (_o1_ instanceof CLiveSkillMakeFriendGift) {
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

	public int compareTo(CLiveSkillMakeFriendGift _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


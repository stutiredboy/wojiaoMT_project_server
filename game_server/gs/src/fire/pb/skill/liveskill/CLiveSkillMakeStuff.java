
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.GroceryItemShuXing;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.skill.SkillRole;
import fire.pb.util.BagUtil;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeStuff__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枔閻涖倝宕惰椤斿棝姊虹紒妯虹伇濠殿喓鍊濋幃锟犲Ψ閳哄倻鍘搁梺鎼炲労閻撲線顢旈崼鐔凤拷鍫曟煠绾板崬澧鹃柟鐑筋棑閹叉挳宕熼鍌ゆФ闂備胶顭堢换鎴︽晝閵忋倕违濞达絽澹婂銊╂煥閻斿墎鐭欐鐐插暣閸┾剝鎷呴崣澶屼簴闂備礁婀遍…鍫濐啅閳哄懏鏅濋柛灞剧▓閹峰姊虹粙鎸庢拱闁荤啙鍥佸洭鏁冮崒娑氬幍缂佺偓婢樺畷顒佺閹殿噯鎷风憴鍕闁搞劌鐖奸妴渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ｇ珶閺嚶颁汗闁圭儤鎸鹃崢鐐節濞堝灝鏋熼柛鏃�娲熼弫鎾绘嚍閵夘喗鐣风紓浣割儏椤︻垶顢橀崗鐓庣窞閻庯綆鍓欏鎶芥⒒娴ｈ櫣甯涙繛鍙夌墵瀹曟劙宕烽銊﹀婵鍋撶�氾拷?
 * @author changhao
 *
 */
public class CLiveSkillMakeStuff extends __CLiveSkillMakeStuff__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure livemakstuff = new mkdb.Procedure()
		{
			@Override
			/*闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閸ㄥ倸螖閿濆懎鏆欑紒鐘崇☉闇夐柨婵嗘噺鐠愶紕绱掔�ｂ晞鍏岀紒杈ㄦ崌瀹曟帒顫濋濠冨闁绘垼濮ら崐鍧楁煥閺囩偛锟界敻鏁撻弬銈囩暤鐎规洖鐖奸崺锟犲礃瑜忛悷婵嗏攽鎺抽崐褏寰婃禒瀣柈妞ゆ牜鍋為崑鍌炴煏婢跺棙娅嗛柣鎾跺枛閺岋繝宕掑鍙樿檸濡炪倧绲炬繛濠囧蓟閿濆鏁囬柣鏃傚劋閸ｄ即姊洪崫鍕槵闁跨喕妫勭壕顓㈠汲閸℃稒鍊甸柨婵嗛婢т即鏌ｉ敃锟介悧鎾愁潖閻戞ɑ濮滈柟娈垮枛婵′粙姊虹憴鍕憙鐎规洜鏁搁崚鎺旓拷锝庡枛缁犳娊鏌￠崘鈺傚鞍閻庢艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂嫮绠栫紒缁樼洴瀹曘劑顢欓崜褏鍘滄繝娈垮枛閿曘劌鈻嶉敐澶婄闁哄稁鍘奸崡鎶芥煟閹邦厾銈撮柟鏋�濆缁樻媴閸涘﹤鏆堝┑顔硷工濠�閬嶅极椤曪拷閹瑩鎮滃Ο鐑樼枀闂佸搫顦悧鍕礉鎼达絽濮柨鐔绘閳规垿顢欓弬銈勭返闂佸憡蓱閹倿鐛箛鎾佹椽顢旈崨顏呭闂備礁鎲＄粙鎴︽晝閿曞倸鐓″鑸靛姈閻撱儵鏌￠崶鏈电盎妞も晩鍓涚槐鎺楊敊绾拌京鍚嬪Δ鐘靛仦椤洨妲愰幒鎳崇喖鎮�涙ê顏堕梺鍓茬厛閸嬪懘宕ｈ箛鏂剧箚妞ゆ牗绮岀敮鍫曟偨椤栨氨鍩ｉ柡宀嬬磿閿熸枻绲婚崝宀勬晸閼恒儳绠炵�殿喛顕ч埥澶愬閳ュ厖姹楅梺鑽ゅТ濞壯囧幢濡や礁鍓甸梻鍌氬�峰ù鍥ь浖閵娾晜鍊块柨鏇炲�哥粻鏌ユ煕閵夘喖澧柡瀣╃窔閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦 team->roleid->match by changhao*/
			protected boolean process()
			{	
				fire.pb.item.GroceryItemShuXing config = (GroceryItemShuXing) fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
				if (config == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				int skillid = LiveSkillManager.getInstance().GetMakeStuffSkillIdByItemId(config);
				if (skillid == 0)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				SkillRole skillrole = new SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(skillid);	//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛紘濠碘槅鍋勭�氭澘顕ｉ崨濠勭懝闁跨喍绮欏璇测槈濡攱顫嶅┑顔筋殔閻楀﹪寮幆褉鏀介柣鎰级閸ｈ棄鈹戦鑲╀粵缂佸矁椴哥换婵嬪炊椤儸鍥ㄧ厱婵炴垵宕弸娑欑箾閸滃啰绡�婵﹨娅ｉ幑鍕Ω閵夛妇浜炴繝纰樻閸嬪嫮锟芥碍婢橀悾鐑筋敍閻愯尙楠囬梺鐟邦嚟婵潧鈻撴ィ鍐┾拺闂傚牊鍗曢崼銉ョ柧婵炴垶姘ㄥΛ顖滄喐閺冨牆钃熼柣鏃傚皑閹风兘鎮藉▓璺ㄥ姼婵炲濯存俊鍥箖椤曪拷閺佹劖寰勭�Ｑ勫闂佽崵濮村ú銈咁嚕閸洖绠查柨婵嗘缁犻箖鏌涘☉鍗炰簻闁诲繐寮堕〃銉╂倷閼碱剛顔掗梺璇″枟缁捇骞婇悙鍝勎ㄧ憸宥夌嵁閸儲鈷掑ù锝呮啞閹牊绻涚仦鍌氱伈鐎规洘绻勬禒锕傛倷椤掍胶褰挎俊鐐�栧鍦矈绾懌浜归柟鐑樻尭娴滃綊姊洪幆褎绂嬮柛瀣╃劍缁傛帡濮�閻橆偅鏂�濡炪倖姊婚妴瀣涘顓犵闁告粌鍟伴幃鍏间繆閸欏濮嶆鐐村浮楠炲﹤鐣烽崶褎鐏堥梺鍦劜缁绘繃淇婇崼鏇炲窛妞ゆ挾鍠曠欢銏ゆ⒒閸屾艾锟芥悂宕愰悜鑺ュ殑闁割偅娲忛敓鎴掔劍缁绘繈宕堕懜鍨珨婵犵數濮撮敃銈夊箠韫囨挾鏆﹂柛娆忣槺缁★拷闂傚倸鐗婄粙鎺楁儗濡ゅ啰纾奸悹鍥у级椤ャ垽鏌″畝瀣М濠殿噯鎷烽梺缁樏崯鍧楀汲閸儲鈷戠紒瀣儥閸庡繘鎮楀顐㈠祮鐎殿喛顕ч埥澶婎煥閸涱垱婢戞繝娈垮枟閿曗晠宕楀☉妯炑兾旈崨顔规嫼闂佸憡绋戦…顒勬倿娴犲鐓涘ù锝囩摂閸ゆ瑦銇勯銏㈢闁圭厧婀遍幉鎾礋椤愩倧绱￠梻鍌欑窔濞佳団�﹂崼銉ョ？闁哄被鍎查崑鐔兼煏韫囧锟芥牠鍩涢幋锔界厽闁绘柨鎲＄欢鍙夌箾閸碍娅婇柡宀�鍠栧畷娆撳Χ閸℃浼�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熸慨婵嗙灱閻わ拷闂佸搫鍟崐鏄忋亹妤ｅ啯鈷戦柛婵嗗閸屻劑鏌涢埡浣割伃鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幖顐︽儓濞嗘挸绀冮柣鎰靛墮閻︽粓姊绘笟锟藉褔鎮ч崱妞㈡稑螖娴ｇ懓寮块悷婊勬煥椤繑绻濆顒傤槹濡炪倖鍔戦崺鍕閸愵喗鍊甸悷娆忓缁�鍐煕閵婏箑顕滃ǎ鍥э躬閹虫粓妫冨☉姘辩嵁闂佽鍑界紞鍡涘礈濞嗘挾宓佺�广儱顦伴埛鎴︽偣閸パ冪骇闁圭櫢缍侀弻鈩冩媴鐟欏嫬锟芥劙鏌嶉妷顖滅暤鐎规洜鍘ч埞鎴﹀炊閵娧勵潠婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曘劑寮堕幋鐙呯幢闂備浇顫夊畷姗�顢氳缁顢涢悙瀵稿弳闂佺粯娲栭崐鍦拷姘炬嫹? by changhao			
				if (liveskill == null)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;					
				}
				
				int skilllevel = liveskill.getLevel();
				
				int needlevel = LiveSkillManager.getInstance().GetMakeStuffNeedLevelByItemId(config);
				
				if (skilllevel < needlevel)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillLevelNotEnough));
					return true;						
				}
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, skillid, 
						needlevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂傚倷鑳舵慨閿嬬箾閿熶粙鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁告侗鍘鹃崢顐︽⒑闁稓鈹掗柛鏂跨焷閻忔帡姊洪崷顓х劸婵炲鍏樻俊鎾箛椤斿墽锛濇繛杈剧到閹碱偅鐗庢繝鐢靛О閸ㄦ椽鈥﹂崼銉﹀�堕柛鎰靛枟閳锋垿鏌熺粙鎸庢崳缂佺姵鎹囬弻鐔煎礃閺屻儱寮伴悗娈垮枟閹倹淇婇懜闈涚窞閻庯綆鍓欓獮鎰攽閻愯埖褰х紒鎻掓健閳ワ箓宕奸妷顔芥櫆濡炪倖鎸堕崹娲偂濞戙垺鍊堕柣鎰邦杺閸ゆ瑥鈹戦鐓庯拷鍧楀蓟閻旂⒈鏁婇柛婵嗗閹峰嘲鈹戦崱娆愭闂佸湱鍎ら崹鐔肺ｉ崼鐔稿弿婵°倧鎷锋俊顐ｆ⒒濡叉劙鏁撻敓锟�", YYLoggerTuJingEnum.tujing_Value_liveskillcost, false);
				
				if (energyenough == false) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑嗛娆撳磿韫囨柣浜滈柟瀛樼箥濡拷閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁稿本绋戞禒鎾⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊箻椤旇棄锟界兘鎮归崶鍥у椤忓爼姊洪崨濠勨槈妞ゎ収鍓熷銊﹀鐎涙ǚ鎷婚梺绋挎湰閻熴劑宕楀畝锟界槐鎺楊敋閸涱厾浠搁悗娈垮枛椤攱淇婇幖浣哥厸濞达絽褰ㄩ弴銏＄厽閹兼惌鍨崇粔鐢告煕閻樻剚娈滅�规洘鍨垮畷鎺楁倷鐎电骞愰梻浣规偠閸庮垶宕曢柆宥嗗�舵い蹇撶墛閻撶喖鏌熼幆褍鑸归柛鏃撶畵閺屸�崇暆鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}
				
				int added = BagUtil.addItem(roleid, itemid, itemnum, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhizuofu, 1, true);
				
				if (itemnum != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeStuff msg = new SLiveSkillMakeStuff();
				msg.ret = 0;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
			
		};
		livemakstuff.submit();	
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800517;

	public int getType() {
		return 800517;
	}

	public int itemid; // 物品的ID by changhao
	public int itemnum; // 物品数量 by changhao

	public CLiveSkillMakeStuff() {
	}

	public CLiveSkillMakeStuff(int _itemid_, int _itemnum_) {
		this.itemid = _itemid_;
		this.itemnum = _itemnum_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(itemid);
		_os_.marshal(itemnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		itemid = _os_.unmarshal_int();
		itemnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveSkillMakeStuff) {
			CLiveSkillMakeStuff _o_ = (CLiveSkillMakeStuff)_o1_;
			if (itemid != _o_.itemid) return false;
			if (itemnum != _o_.itemnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += itemid;
		_h_ += itemnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(itemid).append(",");
		_sb_.append(itemnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveSkillMakeStuff _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = itemnum - _o_.itemnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


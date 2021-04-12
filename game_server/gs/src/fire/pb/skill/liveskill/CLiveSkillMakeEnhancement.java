
package fire.pb.skill.liveskill;
import java.util.ArrayList;
import java.util.List;

import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.AddItemResult;
import fire.pb.item.BagTypes;
import fire.pb.item.Pack;
import fire.pb.talk.MessageMgr;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeEnhancement__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鈽夊Ο閿嬫杸闂佸憡娲﹂崑鍕叏閻戣姤鈷戦柣鐔告緲濡插鏌涢姀锛勫弨闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼懖鈺勊夋俊鎻掓噹椤洦銈ｉ崘鈹炬嫽婵炶揪缍�婵倗娑甸崼鏇熺厱闁绘娅曠粈鍐煙娓氬灝濮傚┑陇鍩栧鍕拷锝庝簻婢规帗淇婇悙顏勶拷鏍洪埡鍛濡炲鍑介幏椋庢喆閸曨剛鈹涚紓浣虹帛缁诲牓鎮伴鑺ュ劅闁靛绠戦惂鍕節閵忥絾纭鹃柣顒�銈稿鎶筋敃閿濆洨鐦堥梺姹囧灲濞佳勭濠婂嫪绻嗘い鏍ㄧ啲閺�鑽ょ磼閸屾氨孝闁宠鍨归敓鏂ょ秵娴滅偤鏁嶅☉銏♀拺闁告稑锕ユ径鍕煕閵娾晙鎲鹃柟顕嗙節閹垽宕楅懖鈺佸箥闂備胶顢婇～澶愬礉閺嶎厽鍋熸い蹇撶墛閻撴瑩鏌ｈ閹芥粎绮欐繝姘厪闁搞儜鍐句純闂佽桨绀侀崐濠氬箯閻樿崵鍙撴い鎾跺仦閻庡啿鈹戦悩鎰佸晱闁哥姵鐗犻弫鍐Ψ閵夘喗瀵岄梺鑺ッˇ閬嶅汲閿斿浜滈柟鏉垮閻ｈ京绱掗敓鐣岋拷锝庡亖娴滄粓鏌熼幑鎰【濞存粌缍婇弻娑樷枎濞嗘垹鐦堝┑顔硷功缁垶骞忛崨瀛樺殟闁靛缍囬幏鐑藉礃椤忓棛锛滈梺璺ㄥ枙婵倗绮悢鍏兼櫢濞寸姴顑囧畵浣逛繆閵堝繑瀚瑰銈庡幑閸旀垵鐣烽妸鈺婃晣闁绘劕鍚�閸犲﹤鈹戦悩鍨毄闁稿绋戣灋婵炲棙鎸哥粻鏉库攽閻樺疇澹橀柣銈夌畺閺岀喖姊荤�电濡介梺缁樻尪閸庣敻寮婚敐澶婂嵆闁绘劘顕滈幏鐑藉捶椤撱劍瀚规慨妯煎亾鐎氾拷
 * @author changhao
 *
 */
public class CLiveSkillMakeEnhancement extends __CLiveSkillMakeEnhancement__ {
	@Override
	protected void process() {
		// protocol handle

		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakeenhancement = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				xbean.Properties prop = xtable.Properties.select(roleid);
				int school = prop.getSchool();
				
				int skilllevel = LiveSkillManager.getInstance().GetEnhanceLevelBySchool(roleid, school);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛椤栨ü姹楅梺鍦劋閸ㄥ綊鏁嶅☉銏＄厽閹兼惌鍨崇粔鐢告煕閻樻剚娈滈柟顔癸拷鏂ユ闁靛骏绱曢崢閬嶆⒑闂堟侗妲堕柛銊ユ惈閳诲秹宕ㄩ弶鎴濆敤闂佺偨鍎查崜姘�掓繝姘厪闁割偅绻冮ˉ婊冣攽椤旂厧鏆熺紒杈ㄥ浮椤㈡瑩鎮剧仦鎯ф珣婵＄偑鍊ら崑鍕崲閹邦喖寮叉俊鐐�曠换鎰矓閻㈢鐤鹃柕蹇嬪�栭埛鎴︽偣閹帒濡奸柡瀣閺岋繝宕担闀愮敖闂佸憡甯楃敮鈥愁嚕椤曪拷瀹曞ジ鎮㈤摎鍌滅处缂傚倸鍊风粈渚�顢栭崨瀛樺�舵繝闈涱儏缁犳岸鏌ｉ幇顔煎妺闁抽攱鍨圭槐鎺旓拷锝庡幗绾爼鏌ｈ箛娑楁喚闁哄本绋撻敓鏂ょ秵閸撴瑦绂掓潏鈺嬫嫹鐟欏嫭绀冮柛鏃�鐟ラ悾閿嬬附缁嬪灝宓嗛梺缁樻煥閹碱偊鐛Δ鍛拻濞达絽鎽滅粔娲煕鐎ｎ亷韬�规洝顫夊蹇涘煛閸屾艾骞戦梻浣筋嚃閸ㄥジ鎮橀幇鐗堝仭闂侇叏濡囬崣鍡涙⒑閸涘﹤濮﹀ù婊呭仦椤ㄦ瑩姊婚崒娆戭槮闁圭⒈鍋婇幆灞惧緞瀹�锟界粈濠傘�掑鐐濡ょ姷鍋涢崯瀛樻叏閿熶粙鏌嶉挊澶嬵棡閺佸牓姊虹涵鍛棈闁规椿浜畷锝嗙節閸ヮ灛鈺呮煃閸濆嫬锟界敻骞忓ú顏呪拺闁告稑锕︾粻鎾绘倵濮樼厧娅嶉柟顔斤耿閺屽棗顓奸崱娆忓箞闂備胶绮敋缁剧虎鍘介弲鍫曟偨绾板瀚规繛鍫濈仢濞呮﹢鏌涚�ｎ亷韬柣娑卞枛铻ｉ柤娴嬫櫇閿涙粌鈹戦埥鍡楃仯缂侇噮鍨堕、鏃堟偄閸忓皷鎷绘繛杈剧秬婵倗娑甸崼鏇熺厱闁挎繂绻掗悾鍨殽閻愯尙绠婚柡浣规崌閺佹捇鏁撻敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К闂備胶顭堢悮顐﹀礉鎼淬劌绠熸慨婵嗙灱閻わ拷闂佸搫鍟崐鏄忋亹妤ｅ啯鈷戦柛婵嗗閸屻劑鏌涢埡浣割伃鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幖顐︽儓濞嗘挸绀冮柣鎰靛墮閻︽粓姊绘笟锟藉褔鎮ч崱妞㈡稑螖娴ｇ懓寮块悷婊勬煥椤繑绻濆顒傤槹濡炪倖鍔戦崺鍕閸愵喗鍊甸悷娆忓缁�鍐煕閵婏箑顕滃ǎ鍥э躬閹虫粓妫冨☉姘辩嵁闂佽鍑界紞鍡涘礈濞嗘挾宓佺�广儱顦伴埛鎴︽偣閸パ冪骇闁圭櫢缍侀弻鈩冩媴鐟欏嫬锟芥劙鏌嶉妷顖滅暤鐎规洜鍘ч埞鎴﹀炊閵娧勵潠婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曘劑寮堕幋鐙呯幢闂備浇顫夊畷姗�顢氳缁顢涢悙瀵稿弳闂佺粯娲栭崐鍦拷姘炬嫹?  by changhao
				if (skilllevel == 0)
				{
					LiveSkillManager.logger.debug("CLiveSkillMakeEnhancement skilllevel error:" + roleid);
					return true;
				}
				
				int liveskillid = LiveSkillManager.getInstance().GetEnhanceLiveSkillBySchool(school);
				int itemid = LiveSkillManager.getInstance().GetEnhanceItemIdBySchool(school);
							
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, 
						liveskillid, skilllevel,"闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鈽夊Ο閿嬫杸闂佸憡娲﹂崑鍕叏閻戣姤鈷戦柣鐔告緲濡插鏌涢姀锛勫弨闁挎繄鍋涢埞鎴狅拷锝庡亜娴滄鏌熼懖鈺勊夋俊鎻掓噹椤洦銈ｉ崘鈹炬嫽婵炶揪缍�婵倗娑甸崼鏇熺厱闁绘娅曠粈鍐煙娓氬灝濮傚┑陇鍩栧鍕拷锝庝簻婢规帗淇婇悙顏勶拷鏍洪埡鍛濡炲鍑介幏椋庢喆閸曨剛鈹涚紓浣虹帛缁诲牓鎮伴鑺ュ劅闁靛绠戦惂鍕節閵忥絾纭鹃柣顒�銈稿鎶筋敃閿濆洨鐦堥梺姹囧灲濞佳勭濠婂嫪绻嗘い鏍ㄧ啲閺�鑽ょ磼閸屾氨孝闁宠鍨归敓鏂ょ秵娴滅偤寮昏濮婇缚銇愰幒鎿勭吹闂佺粯甯粻鎾诲箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫭宸濋柛瀣洴閺佹捇鎸婃径瀣闂佽法鍠曟慨銈夋偄椤掑嫬绠柨鐕傛嫹", YYLoggerTuJingEnum.tujing_Value_fumo, false);
				
				if (energyenough == false) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑嗛娆撳磿韫囨柣浜滈柟瀛樼箥濡拷閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁稿本绋戞禒鎾⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊箻椤旇棄锟界兘鎮归崶鍥у椤忓爼姊洪崨濠勨槈妞ゎ収鍓熷銊﹀鐎涙ǚ鎷婚梺绋挎湰閻熴劑宕楀畝锟界槐鎺楊敋閸涱厾浠搁悗娈垮枛椤攱淇婇幖浣哥厸濞达絽褰ㄩ弴銏＄厽閹兼惌鍨崇粔鐢告煕閻樻剚娈滅�规洘鍨垮畷鎺楁倷鐎电骞愰梻浣规偠閸庮垶宕曢柆宥嗗�舵い蹇撶墛閻撶喖鏌熼幆褍鑸归柛鏃撶畵閺屸�崇暆鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�? by changhao
				{
					java.util.List<String> parameters = new java.util.ArrayList<String>();
					String s = Integer.toString(LiveSkillManager.getInstance().NeedEnergy(liveskillid, skilllevel));
					parameters.add(s);
					MessageMgr.psendMsgNotify(roleid, 143432, parameters);
					return true;						
				}							
				
				Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
								
				SLiveSkillMakeEnhancement msg = new SLiveSkillMakeEnhancement();
				
				fire.pb.item.groceries.AttrUpItem item = (fire.pb.item.groceries.AttrUpItem)fire.pb.item.Module.getInstance().getItemManager().genItemBase(itemid, 1);
				item.GenAttr(skilllevel);
				
				if (bag.isFull())
				{
					fire.pb.item.ItemMaps tempBag = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.TEMP, false);
					if (tempBag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}
				}
				else
				{
					if(bag.doAddItem(item, -1, LiveSkillManager.Enhancement, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_fumoget, 2) != AddItemResult.SUCC)
					{
						return false;
					}						
				}
				
				List<String> param = new ArrayList<String>();
				param.add(item.getName());
				param.add("ffffff00");
				MessageMgr.psendMsgNotify(roleid, 150107, param);				
				mkdb.Procedure.psendWhileCommit(roleid, msg);
				
				return true;
			}
		};
		
		liveskillmakeenhancement.submit();			
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800525;

	public int getType() {
		return 800525;
	}


	public CLiveSkillMakeEnhancement() {
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
		if (_o1_ instanceof CLiveSkillMakeEnhancement) {
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

	public int compareTo(CLiveSkillMakeEnhancement _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


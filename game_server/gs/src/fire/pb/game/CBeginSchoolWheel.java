
package fire.pb.game;
import java.util.ArrayList;
import java.util.List;

import fire.pb.team.TeamManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBeginSchoolWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CBeginSchoolWheel extends __CBeginSchoolWheel__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid <= 0) return;
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				TeamManager.getTeamByRoleId(roleid);//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂備線娼уΛ娆戞暜閹烘缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕绻楀▔娑㈠煘閹达附鍋愭繛鍫熷濞堟壆绱撴担铏瑰笡缂佽鍊块垾锕傚炊椤忓秵鈻夐梻浣筋嚙缁绘垹鏁垾鎰佹綎闁惧繐婀遍惌娆撴偣閹帒濡挎い鏂匡躬濮婃椽宕橀幓鎺撔╅梺缁橆殕閹告悂鎮鹃悜钘夌闁挎洩鎷烽幆鐔兼⒑闂堟侗妲堕柛銊︽そ瀵剟鏁撻懞銉ょ箚闁绘劦浜滈敓鑺ョ墪椤繗銇愰幒鎴濆殤缂傚倷鐒﹂…鍥偡鐟欏嫮绠鹃柟瀛樼懃閻忣亪鏌ｉ幘瀛樼妤犵偞鐗楀蹇涘礈瑜忚摫闂備礁鎼Λ顓㈠礈閻旂厧钃熼柍鈺佸暞婵挳鏌ｉ悢鍛婄凡妞ゎ偄绉归幃妤呭垂椤愶絿鍑￠柣搴㈠嚬閸ｏ綁寮幘璇叉闁靛牆娲ㄦ牎闂備胶顭堥鍛村箠濮楋拷楠炲啴鎮界粙鍨祮闂侀潧绻嗗褔骞忕紒妯肩閺夊牆澧界粔顒佷繆椤愩垹顏い锝呮健濮婄粯鎷呴悷閭﹀殝缂佺偓婢樼粔瑙勪繆閻㈢绀嬫い鏍ㄧ♁濞呭棝鏌ｉ悩鍏呰埅闁告柨閰ｉ幃锟犲箻缂佹ê锟界敻鎮峰▎蹇擃仾缂侊拷閸儲鐓涘ù锝呭閻撹偐锟芥鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?
				List<Long> list = new ArrayList<Long>();
				list.add(roleid);
				lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂備線娼уΛ娆戞暜閹烘缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕绻楀▔娑㈠煘閹达附鍋愭繛鍫熷濞堟壆绱撴担铏瑰笡缂佽鍊块垾锕傚炊椤忓秵鈻夐梻浣筋嚙缁绘垹鏁垾鎰佹綎婵炲樊浜滅粈鍌炴煠濞村鏉洪柛瀣仱濮婃椽宕崟顒�娅ょ紓浣筋嚙閻楁捇鐛崘顔藉�烽柛婵嗗椤ρ囨⒑閸忚偐銈撮柡鍛箞椤㈡瑩寮撮姀锛勫幐婵犮垼娉涢敃锔芥櫠閺囩儐鐔嗙憸蹇涘疾椤愩倕鍨濋柡鍐ㄧ墱閺佸棗霉閿濆牊顏犳い鏃�娲熷娲川婵犲嫮鐓�闂佸摜鍠嶉崡鎶界嵁閸愵喗鍤冮柍鍝勫暟閿涙粌顪冮妶鍡橆梿闁稿鍔栭弲璺衡槈濮樿京锛滅紓鍌欑劍椤洨绮婚悙纰夋嫹鐟欏嫭绀�闁绘牕鍚嬫穱濠囧箹娴ｈ倽銊︺亜閺嶃劎鈽夋い蹇撶埣濮婂搫效閸パ呬患闂佺顕滅换婵嬪箖閿熺姴唯闁挎柨澧介惁鍫ユ⒒閸屾氨澧涚紒瀣浮钘熼柕寰涢绨婚柟鍏肩暘閸╁嫬鈻撳鍫熺厸鐎癸拷鐎ｎ剛锛熼梺璺ㄥ枑閺嬭崵绱為崱娑樼；闁糕剝绋戣繚闂佸湱鍎ゅ鑽ゅ婵傜绾ч柛顐ｇ☉婵″吋绻涢幖顓炴珝闁哄备鍓濋幏鍛喆閸曨偊鐎虹紓鍌欑閸婂湱鏁悙鐑樻櫢闁哄倶鍊楃粔闈浢瑰搴濋偗鐎规洦鍓涢幑鍕瑹椤栨稑鐦滈梻渚�娼ч悧鍡橆殽閸涘﹦顩插ù鐘差儐閻撴洟鏌ｅΟ璇插婵炲牊锕㈤弻銊╂偄鐠囨畫鎾城庨崶銊︺仢闁挎繄鍋炲鍕箛閳哄瀚归柛鎰靛枛鍞梺鍐叉惈閸婃悂鏁撻悾灞藉幋闁哄被鍊楅崰濠囧础閻愭彃绠伴梻浣瑰劤缁绘劙鏌婇敐鍜佹綎婵炲樊浜滃婵嗏攽閻樻彃鏆婇柟宄扮秺閹鎯傞崨濠傤伓闂備礁缍婂Λ璺ㄧ矆娓氾拷閹锋垿鎮㈤崗鑲╁弳濠电娀娼уΛ娆撳疮閹烘鐓涢柛鎰鐎氬綊姊洪悷鏉挎Щ闁硅櫕锕㈤獮鏍亹閹烘垶宓嶅銈嗘尵閸嬫稓绮仦鍓х瘈缁炬澘顦辩壕鍧楁煕鐎ｎ偄鐏寸�规洘鍔欐俊鑸靛緞婵犲倸浜堕梻浣虹帛閹稿摜寮ч崘顭嬫椽顢斿鍡樻珝闂備線娼х换鎺撴叏閻㈠憡鍊垫い鎺戝閳锋垿鏌ｉ悢鍛婄凡闁抽攱姊荤槐鎺楊敋閸涱厾浠搁悗瑙勬礃閸ㄥ潡鐛崶顒夋晪闁糕剝锚椤忓爼鏌ｉ悢鍝ユ噧閻庢凹鍘剧划鍫ユ晸閽樺鏀介柣鎰皺濠�鎾煕婵犲啰绠為柟顔诲嵆椤㈡瑧鍠婃潏銊ョ紦闂備浇娉曢崰鏇炍涢崟顖ょ稏闊洦娲滅壕鍏间繆椤栨繍鍤欐い搴㈡崌濮婃椽宕楅梻纾嬪焻闂佺瀛╂繛濠冧繆鐎涙绡�闁搞儯鍔夐幏娲⒒閸屾氨澧愰柡鍛箘缁棃宕滄担铏癸紲闂佺粯顭堝▍鏇炵暦瀹�鍕厽婵炴垵宕弸锔剧磼閻樺磭鈽夐柍钘夘槸閳诲酣骞囬褌鎴烽梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�?
				xbean.SchoolWheel schoolWheel = xtable.Openschoolwheeltable.get(roleid);
				if (schoolWheel == null) {
					schoolWheel = xbean.Pod.newSchoolWheel();
					xtable.Openschoolwheeltable.insert(roleid, schoolWheel);
				}
				
				int itemIndex = GameManager.getInstance().getAwardItemIndex(GameManager.SCHOOLWHEEL);
				if (itemIndex == -1) {
					return false;
				}
				
				schoolWheel.setItemindex(itemIndex);
				schoolWheel.setAwardid(GameManager.SCHOOLWHEEL);
				
				//TODO 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸♀晜效婵炲瓨鍤庨崐婵嬪蓟閵堝绾ч柟绋块娴犳潙鈹戦纭锋敾婵＄偘绮欓妴浣肝旈崨顔芥闂佷紮绲介惉濂告儗閹剧粯鐓涢悘鐐额嚙閸旀粓鏌￠崨顔藉�愰柡宀嬬畱铻ｅ〒姘煎灡绗戦梻浣芥硶閸犳洖螞閸曨偒鐒介柨鐔哄Т杩濇繛杈剧悼绾爼寮告惔銊︾厵闁诡垎鍜冪礊濡炪倧瀵岄崣鍐箖瀹勯偊鐓ラ柛鎰典簽椤旀帡鏌﹀Ο鑽ょ畺闁靛洤瀚板浠嬪Ω瑜嬮敓鑺ュ笧缁辨帡鎮╅懡銈囨毇閻庢鍠栭悥鐓庣暦閻撳簶鏀介柛鈥崇箲鐎垫牠姊绘担绛嬪殐闁哥姵鐩畷鎴﹀箛閻楀牆鍓﹀銈呯箰閻楁粓寮崶顒佺厽闁规壆澧楀☉褔鏌ｉ幘璺烘灈闁诡喗顨呴埢鎾诲垂椤旂晫浜炬俊鐐�ら崢濂告偋閹炬眹锟戒礁顫滈敓钘夌暦濡ゅ懏鍋傞幖杈剧悼閻涱喖鈹戦悩鍨毄濠殿喖顕敓鑺ユ皑閸忔ê鐣烽鐐茬倞闁靛ě鍛闂備焦鐪归崹钘夘焽瑜斿畷婊冪暦閸モ晝锛濋悗骞垮劚閹冲繘藟閵忣澁鎷风憴鍕缂侇喖鐭傞崺銏℃償閵娿儳顔掗梺鍝勵槹閸╁﹪骞忛悜鑺ュ殝闁绘劙锟芥稓鐩庨梻濠庡亜濞诧箓骞愰幖渚囨晜闁靛牆顦伴悡娑㈡煥閻斿墎鐭欓柟宕囧仱婵＄兘鏁愰崟顓犳晨闂傚倷绀侀幖顐﹀疮椤愶箑纾归柣鐔稿閺嬪秹鏌￠崶銉ョ仾闁绘挾鍠愰妵鍕箻鐠哄搫澹夐梺绋垮濡啴寮婚敍鍕勃闁绘劦鍓涢ˇ浼存倵鐟欏嫭绀冮柛搴°偢钘濋柛娆忣槶娴滄粓鐓崶椋庡埌妤犵偞顨嗛妵鍕Ω閿濆懎濮﹂梺璇″枟閻熲晛顕ｉ崼鏇炵闁绘劕澧庡銊モ攽鎺抽崐妤佹叏閻戣棄纾绘繛鎴欏焺閺佸嫰鏌涘☉娆愮稇闁绘挻锕㈤弻鐔告綇閸撗呮殸缂備胶濮撮…鐑藉蓟閳╁啫绶為悗锝庝簽閸斿憡绻涢弶鎴濇倯闁圭懓娲ら～蹇曠磼濡偐鎳濋梺璺ㄥ枙濡嫰鈥﹂崶顒佸殥闁靛牆绻戠�氬綊姊婚崼鐔恒�掗柣鎺戞憸閿熷�燁潐濞插繘宕归搹鍦处濞寸姴顑呯痪褔鏌涢埄鍐炬婵℃彃鎲￠妵鍕敃閿濆洨鐤勯梺纭呮珪缁捇骞冩禒瀣棃婵炴垶顭囬濂告⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煙闂傚璐伴柡浣割儐閵囧嫰骞橀崡鐐典患缂備緤鎷峰璺虹焿閹风兘鐛崹顔煎濡炪倧缂氶崡鎶藉箖閿熺姵鍋勯柛蹇氬亹閸樼敻姊虹涵鍜佹綈闁告梹鐗滃☉鐢稿礈瑜濋幏宄扳槈濞嗘垹鐤勯梺鍝勭潤閸涱垳锛滃┑鈽嗗灣閸樠囧煕瀹�鍕拺闁告繂瀚～锕傛煕閺冿拷閸ㄧ敻顢氶敐澶婄骇闁规惌鍘介崓鐢告⒑閸涘娈橀柛瀣洴閳ユ牗寰勫畝锟界壕钘壝归敐澶岀窗婵＄偓鎮傞弻娑樜熼崫鍕�梺鍝勬嚀閸╂牠骞嗛弮鍫熸櫜闁糕檧鏅滅紞妤呮⒒娴ｅ憡璐￠柛搴涘�濋妴鍐川椤旂厧濮呴梻鍌氬�风欢姘焽瑜旂瘬闁跨喓鏅槐鎺楁偐閸愯尙浠哥紓浣稿�圭敮锟犵嵁濮楋拷椤㈡瑧鎲撮敐鍡楊伖闂傚倷绀侀幉锛勬崲閸屾粣鎷峰鐓庡箹闁挎洏鍨虹�佃偐锟芥稒顭囬崢浠嬫⒑閸愬弶鎯堥柨鏇樺�濋幃姗�鏁冮崒娑氬幈闂侀潧艌閺呮繈鎮惧ú顏呯厸濞达絿顭堥弳锝囷拷瑙勬礃鐢帡锝炲┑鍥舵綑闁哄诞鍕瘜闂傚倸鍊搁崐椋庣矆娴ｉ潻鑰块梺顒�绉寸壕濠氭煙閹规劦鍤欑紒锟介崼鐔稿弿婵妫楅獮鏍ㄣ亜閺囶澀鎲鹃柡灞诲姂閹倝宕掑☉姗嗕紦
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleid, false);
				long ret = bag.subCurrency(-60, MoneyType.MoneyType_ProfContribute, "schoolwheel", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_zhuanpan, 0);
				if (ret == 0)
					return false;
				
				SBeginSchoolWheel beginWheel = new SBeginSchoolWheel();
				beginWheel.wheelindex = itemIndex;
				
				mkdb.Procedure.psendWhileCommit(roleid, beginWheel);
				
				return true;
			}
			
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810363;

	public int getType() {
		return 810363;
	}


	public CBeginSchoolWheel() {
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
		if (_o1_ instanceof CBeginSchoolWheel) {
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

	public int compareTo(CBeginSchoolWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


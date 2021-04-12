
package fire.pb.mission.activelist;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CShareActivity__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CShareActivity extends __CShareActivity__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
				if (actrole != null){
					if(activityid == RoleLiveness.SHARE)
						actrole.handleActiveLivenessData(RoleLiveness.SHARE);
					else if(activityid == RoleLiveness.SHARE2)
						actrole.handleActiveLivenessData(RoleLiveness.SHARE2);
					else {
						RoleLivenessManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌熺紒妯虹闁跨喓鐡旈崣鍐潖婵犳艾纾兼慨妯哄船椤わ拷闂備胶顭堢换鎴︽嚌妤ｅ啫鐓″璺好￠悢濂夌叆闁告洦鍓﹀Λ鍐倵鐟欏嫭纾搁柛搴ｆ暬楠炴劖绻濋崘銊х獮闁诲函缍嗘禍婵嬫倶鎼搭澀绻嗛柣鎰典簻閿熻姤鍨垮畷鐟懊洪鍌︽嫹閸愵喖骞㈡繛鎴烆焽椤斿棝姊洪崨濠勨檨婵炲吋鐟︾�靛ジ鎮╃紒妯煎帾婵犮垼顕栭崹浼村箠鎼达絿鐭堥柨鏇炲�归埛鎺楁煕鐏炴崘澹橀柨鐔剁矙椤ユ挾鍒掗崼鐔虹懝闁跨喍绮欓悰顔藉緞閹邦剛浼嬮柣鈩冨笂閻掞箑顪冩禒瀣瀬闁告劦鍠栫壕鍏兼叏濮楀棗澧ù婊嗘硾閳规垿鎮欏顔兼婵犳鍠楅幐鎶姐�侀弽顓炲窛妞ゆ牗鍑瑰Λ婊堟偡濠婂懎顣奸悽顖涱殜閹繝鎮㈤崗鑲╁幍闂備緡鍙忕粻鎴﹀几濞戙垺鐓曢柡鍌涱儥閸庢棃鏌″畝瀣М妤犵偞顭囬敓鑺ョ♁椤洭藝娴煎瓨鈷戦柛婵嗗閻忛亶鏌涢悩宕囧⒌妤犵偛鍟…銊╁礂閸撗冩灈闁圭厧缍婇弻鍛槈濞嗘ɑ鏅ｅ┑鐘殿暜缁辨洟宕戦幋锕�纾归柟杈剧畱绾惧潡鏌＄仦璇插姕闁稿绻濋弻宥嗘姜閹殿喛绐楀┑鐐插悑閻楁粎妲愰幘瀛樺閻犲浄绱曢崝椋庣磽娴ｅ搫鈻堢紒鐘崇墵瀵鏁愭径濠勭杸闂傚倸鐗婄粙鎴︼綖椤忓牊鈷戠紓浣诡焽缁犳牗淇婇銏犳殻鐎殿喖顭烽弫鎰緞婵犲嫷鍟嬮梻浣告啞椤ㄥ牓宕曢幋锕�绠�瑰嫭澹嬮弨浠嬫倵閿濆簼绨介柣锝嗘そ閹嘲顭ㄩ崨顓ф毉闁汇埄鍨辩敮锟犲箖濞嗘劗绡�闁搞儯鍔庨崢顏呯節閻㈤潧浠滈柣蹇旂箞瀹曟繈濡堕崶鈺冿紲婵炶揪绲介幖顐﹀储閹绢喗鐓欐い鏃�瀵х涵鐐亜椤愶絿绠炵�规洩绻濋幃娆徝圭�ｎ偄顏�" + activityid + "]婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煕椤愶絾绀冮柍閿嬪笒闇夐柨婵嗘噺閸熺偤鏌熼姘卞ⅵ闁哄被鍊曠叅閻犲洩灏欐禒鎼佹⒑鏉炴壆顦﹂柛鐔风摠娣囧﹪鎳滈棃娑氱獮濠碘槅鍨崇划顖氣枍瀹ュ應鏀介柣妯肩帛濞懷囨煕婵犲偆鐓奸柍銉畵瀹曞ジ濡烽敃锟介敓钘夊槻閳规垿鎮╅崣澶婎槱闂佺粯鎸搁崯鎾蓟濞戞ǚ鏀介柛鈩冾殢娴犲ジ姊虹捄銊ユ灆婵☆偄瀚伴垾锕傛倻閽樺鐎梺瑙勫劤婢у孩銇欓幎鑺ュ�甸柨婵嗙凹缁ㄨ崵绱掗銏⑿㈤柍瑙勫灴椤㈡瑧娑甸柨瀣毎婵犵绱曢崑妯煎垝濞嗘挻鍋樻い鏇嫹妤犵偛娲、姗�鎮㈠畡鏉课ら梻鍌欑劍鐎笛呮崲閸岀偛纾圭憸鐗堝笚閺咁剙顭跨捄铏圭伇缁惧彞绮欓弻娑氫沪閸撗勫櫘缂備焦绋戠换姗�寮婚悢椋庢殝闁哄瀵т簺闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈩冪懃椤わ拷婵＄偑鍊曠换鎺撴叏妞嬪孩顫曢柟鐑橆殕閺呮悂鏌ら幁鎺戝姢缂佲槄鎷烽梻浣规偠閸庮垶宕濆畝鍕櫢闁伙絽鏈弳顒勬煛鐏炶濡奸柍瑙勫灴瀹曞崬鈽夐幉瀣婵°倕鎳忛悡娑㈡倵閿濆骸浜為柕鍡樺笧缁辨帗娼忛妸銉﹁癁闂佽桨鐒﹂幐鑽ょ矉閹烘棑鎷烽敐搴濈盎闁兼澘鐏濋埞鎴︽倷閺夋垹浠搁梺鑽ゅ暀閸パ冨亶闂備緡鍓欑粔鐢稿煕閹达附鐓涢柛灞久崝婊勭箾閸涱厽鍤囬柡灞剧洴閹倖鎷呴崫銉ゅ寲缂傚倷绶￠崰鏍偋韫囨稒鏅搁柡鍌樺�楃粔鐢告煕閻樻剚娈滈柟顕嗙節閹垽宕楅懖鈺佸箥闂備礁澹婇悡鍫ュ窗閺嶎収鏁傛い蹇撶墛閸婂灚鎱ㄥΟ鐓庝壕閻庢熬鎷�1婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喖宕崟顒�锟藉酣姊虹紒妯虹瑨闁挎洏鍎垫俊鐢稿礋椤斿墽鏉搁梺瑙勫礃濞夋盯鍩涢崼銉︹拺閺夌偞澹嗛ˇ锔姐亜閹存繃鍠樻鐐差樀瀹曘劍绻濋崘銊ュΤ闂備線娼ч…鍫ュ磿閹惰姤鍋柛鏇ㄥ灡閳锋垿姊婚崼鐔峰礋闁割偁鍎遍悿鐐箾閹存瑥鐏柛瀣�圭换娑㈠箣濞嗗繒浠鹃梺缁樻尰濞茬喖骞冨锟介幃娆撴濞戞顥氶梻浣圭湽閸斿秹宕归崷顓燁潟闁圭儤顨呯粻娑欍亜閺冨牊锛熸俊鍙夊姇閳规垿顢欑涵閿嬫暰濠碉紕鍋犲Λ鍕偩閻戣棄惟闁挎柨澧介惁鍫ユ⒑閸涘﹤濮﹂柣鎾崇墕鍗遍梺顒�绉甸埛鎺懨归敐鍛暈闁哥喓鍋ら幆鍥ㄥ緞瀹�锟界壕鍏笺亜閺冨倹娅曢柟鍐插暣閺岋綁鏁愰崶褍骞嬪Δ鐘靛仜濞差參骞冭瀹曞ジ鎮㈤崜韫埛闂傚倸鍊峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�.");
						if(activityid > 0)
							actrole.handleActiveLivenessData(activityid);
					}
				}
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805489;

	public int getType() {
		return 805489;
	}

	public int activityid;

	public CShareActivity() {
	}

	public CShareActivity(int _activityid_) {
		this.activityid = _activityid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(activityid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		activityid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CShareActivity) {
			CShareActivity _o_ = (CShareActivity)_o1_;
			if (activityid != _o_.activityid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += activityid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(activityid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CShareActivity _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = activityid - _o_.activityid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


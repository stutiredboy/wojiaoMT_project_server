
package fire.pb;


import fire.pb.buff.BuffConstant;
import fire.pb.common.SCommon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAddPointToAttr__ extends mkio.Protocol { }

/** 客户端请求属性加点
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAddPointToAttr extends __CAddPointToAttr__ {
	@Override
	protected void process() {
		// protocol handle
		
		// TODO: 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倸螞椤撶倣娑㈠礋椤撶姷锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏圭矙閹稿孩鎷辩紓浣割儐鐢�崇暦閿濆牏鐤�闁哄倸澧界粻姘舵⒑闂堟稓澧曢柟宄邦儔瀹曟洟骞囬悧鍫濓拷鍨叏濮楀棗澧扮紒澶嬫そ閺岀喖顢欑粵瀣暭闂佺懓寮堕幐鍐茬暦閻旂⒈鏁嗛柛灞诲�栬ⅷ缂傚倸鍊搁崐宄懊归崶顒夋晪鐟滄棃骞冭楠炴﹢鎳￠妶鍛偊闂備礁鎲￠崝锕傚窗閺嶎厽鍋傛繛鎴欏灪閻撴洘绻涢幋婵嗚埞婵炲懏蓱娣囧﹪顢曢姀鐘虫闂佸疇顫夐崹鍧楀箖濞嗘挸绾ч柟瀵稿С濡楁挻淇婇悙顏勶拷鎴﹀礉瀹�鍕疇闁规壆澧楅弲鎼佹煢濡警妲哄ù鐘崇洴閺岋綁骞橀銈嗗闁归鐒︾紞搴ｇ磽閸屾瑧鍔嶉拑鍗炩攽椤栨稒灏﹂柡灞剧洴閺佸倻鎷犻幓鎺旑啈闂備胶鍘ч悘婵喢洪鐑嗘綎婵炲樊浜滃婵嗏攽閻樻彃鏆熼柛娆忔濮婂搫煤鐠囨彃顫╅梺闈涚墛閹倸顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐犲劜閳锋垿鏌涘┑鍕姎閺嶁�愁渻閵堝啫濡奸柨鏇ㄤ邯閹即顢氶敓钘夌暦婵傜唯闁靛绨堕弲鐘诲蓟瀹ュ棙濮滈柟宄拌嫰閸樷�愁渻閵堝棙鈷愰柛鏃�鐗滈幑銏犫槈濞嗘劗绉堕梺鍛婃寙閸愩劎鍘掗梻鍌欒兌椤㈠﹥鎱ㄩ妶鍥у灊闁规崘顕х粻鏍煟閹伴潧澧紓宥呮喘閺屾洘绻涜閹峰宕惔銊︹拺闁告繂瀚峰Σ鎼佹煟濡わ拷濡瑩寮查崼鏇熷仼鐎癸拷閿熶粙鎯岄幘娣簻闁瑰搫绉瑰宄懊瑰鍕煁闁靛洤瀚伴獮鍥煛娴ｅ搫濮舵繝纰樻閸ㄤ粙骞忛悜鑺モ拻濞达絿鍎ら崵锟介梺鎼炲灱鐏忔瑩骞戦姀銈呯婵°倓鐒﹀▍銏ゆ⒑閸濆嫬锟藉爼宕愬Δ鍐煋闁汇垹鎲￠悡銉╂煟閺傛娈犳繛鑲╁枛閺屾盯濡搁妷锕佺缂備浇浜崑鐐垫崲濠靛鐐婄憸蹇涙偩濞差亝鈷戦柛鎰级閹牓鏌熼崘鑼鐎规洘鍔楃槐鎺懳熼崷顓犵暰婵＄偑鍊栭悧妤冨垝閻樿纾块柣妯肩帛閻撱儵鏌ｉ弮鍥跺殭鐞氭岸姊洪崨濠冣拹闁荤喆鍎甸敐鐐剁疀閹句焦妞介、鏃堝礋椤撗冩櫍闂傚倷鑳剁划顖炲礉閺嶎兙浜归柛鎰靛枓閿熻姤鐗犲畷鍗炩枎閹寸媴绱冲┑鐐存尰閼规儳煤閵堝鍑犻柣鏂垮悑閻撶喖鏌ｉ弮锟藉娆撳礉閿斿浜滈柕蹇婏拷鍐叉懙闂佽桨鐒﹂崝鏍ь嚗閸曨叏鎷烽敐搴′簼妞ゅ繒鍠栧缁樻媴閼恒儳銆婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?:濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崸妞硷拷浣割潩閼稿灚娅㈡繛瀵稿Т椤戝洤鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑氾拷锝冨妼閿熻姤绻堝濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牠鈥栨径鎰拺闁荤喐婢橀弳閬嶆煟椤撶偛锟芥悂锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦鈽夐柨鏇樺劦瀹曟洟骞橀幇浣瑰瘜闂侀潧鐗嗗Λ妤呮倶閵夛妇绠剧�瑰壊鍠栭獮鏍煟閿濆鏁遍悗闈涖偢瀵爼骞嬮悩鍨緫濠碉紕鍋戦崐鏍蓟閵婏附娅犲ù鐘差儐閸嬪倿鏌熼崜褏甯涢柍閿嬪灴閹綊骞侀幒鎴濐瀳濠电偛鎳忛崝娆撳蓟閻旂厧绀勯柕鍫濇椤忥拷?
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊勭矊闇夐柡宥庡幗閻撳繐鈹戦悙闈涗壕婵炲懎妫濋弻娑㈠Χ閸涱収浼冮梺鍝勮閸婃鍒掑▎鎴炲磯闁靛鍊楁す铏節閻㈤潧浠滈柟铏姈閹便劑宕归銈傛敵婵犵數濮村ú銈呮纯闂傚鍋勫ú锕傚蓟閵娾晩鏁傞柛顐ｆ礃閳锋帒霉閿濆妫戝☉鎾瑰皺缁辨帡鐓鐘电厯闂佽鍠楅敋妞ゎ偅绻冨蹇涘煛閸愵亝娈介梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠栭悿楣冩煙闂傚鍔嶉柣鎾卞灪娣囧﹪顢涘▎鎺濆妳濠碘�冲级濡炰粙寮婚敓鐘插耿妞ゆ挾濮烽弳銈夋⒑閸濆嫭婀版繛鍙壝銉╁礋椤栨艾鑰垮┑鈽嗗灥瀹曚絻銇愰崨瀛樷拻闁稿本鐟чˇ锔撅拷瑙勬处閸撴瑧鍙呭銈嗘尪閸ㄥ綊鎷戦悢鍏肩叆婵犻潧妫Σ鍝ョ磼椤愩垻效闁哄被鍔戦幃銏㈡嫚濞堝鎸剧槐鎺楀磼濮樻瘷锝囩磼閸屾稑绗ч柨鐔告灮缂嶅棝宕戦崨顓涙瀺闁靛繈鍊栭埛鎴︽煠閹帒鍓い蹇撶叒閵娾晜鏅稿ù鐘差儐椤ュ﹥銇勯幒鎴Ц濠⒀勬尦閺岋紕浠﹂棃鈺傚鐎规洖娲﹀▓鏇㈡⒑鐠恒劌鏋嶇紒顔界懃閻ｉ攱瀵奸弶鎴濆敤濡炪倖鎸荤划锝夊箯闁垮鐟归柨鐔绘椤曪絾绂掔�ｅ灚鏅ｉ悷婊冮叄瀵煡濮�閵堝棌鎷洪柣鐘充航閸斿矂寮搁弮鍫熺厸闁告粈绀佹禍浼存煛娴ｈ宕岄柟宕囧仱婵＄兘濡搁妷顔筋棨闂傚倷鐒﹂幃鍫曞垂濞差亝鍋傞柨鐔哄У閺呮煡鏌ｉ幇顒�顣抽柣銈忔嫹闂備礁鎼崐浠嬵敋瑜庣粋宥呪攽鐎ｎ偀鎷洪梺鍛婄☉閿曘倖鎱ㄩ敓浠嬫⒑閸濆嫭鍣虹紒璇茬墕閻ｇ兘濮�閵堝懐顔愭繛杈剧到閸樻粓骞忓ú顏呯厽闁绘ê鍘栭懜顏堟煕閺傝儻瀚伴柍璇茬Ч楠炲洭鎮ч崼銏犲箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐?
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		if(fire.pb.buff.Module.existState(roleId, BuffConstant.StateType.STATE_BATTLE_FIGHTER))
			return;

		if (cons < 0 || iq < 0 
				|| str < 0 || agi < 0
				|| endu < 0){
			return;
		}
		if (cons == 0 && iq == 0 && str ==0
				&& agi == 0 && endu == 0)
			return;
		final xbean.Properties prop = xtable.Properties.select(roleId);
		if (null == prop)
			return;
		
		final SCommon cc = RoleConfigManager.getRoleCommonConfig(DataInit.COMMEN_ROLE_ADDPOINT);
		if (prop.getLevel() < Integer.parseInt(cc.getValue()))
			return;
		
		final long sum = cons + str + agi + endu + iq;
		if (sum > prop.getPoint().get(prop.getScheme()))
			return;
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇氱劍閹冲矂姊绘担鍛婂暈闁荤喆鍎抽幑銏狀潨閿熻棄顕ｆ繝姘櫜濠㈣泛锕﹂娲⒑閹稿海绠撴俊顐幖铻為柛鏇ㄥ幘绾惧ジ鏌ｉ幇闈涘闁告柣鍊栭妵鍕敇閻樻彃骞嬮悗娈垮枛椤攱淇婇幖浣肝ㄩ柕蹇婂墲閺夋悂姊绘担铏广�婃俊鐙欏洤鐤炬繝濠傛噽閹冲懐绱撻崒姘拷鎼佸磹閻戣姤鍤勯柤绋跨仛閸欏繐螖閿濆懎鏆欑痪鎯ь煼閺岀喖骞嶉纰辨毉闂佸搫鎳忛幃鍌炲蓟閿曪拷铻ｅ〒姘煎灡妤旈梻浣风串缂嶅棝宕ｉ崘顔艰摕婵炴垶鐟﹂崕鐔兼煏閸繂顏╅柟顖氱墦濮婅櫣鎹勯妸銉︾亞婵犳鍠撻崐婵嗙暦濞嗘帇浜归柟鐑樺灩閻涖儱鈹戦鐭亜鐣烽鍕瀭婵犻潧娲ㄧ粻楣冩煕閳╁叐鎴犱焊娴煎瓨鐓涢柛娑卞枟閸婃劙鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�
		final PAddPointProc addpoint = new PAddPointProc(roleId, this);
		addpoint.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786444;

	public int getType() {
		return 786444;
	}

	public int cons; // 体质
	public int iq; // 智力
	public int str; // 力量
	public int agi; // 敏捷
	public int endu; // 耐力

	public CAddPointToAttr() {
	}

	public CAddPointToAttr(int _cons_, int _iq_, int _str_, int _agi_, int _endu_) {
		this.cons = _cons_;
		this.iq = _iq_;
		this.str = _str_;
		this.agi = _agi_;
		this.endu = _endu_;
	}

	public final boolean _validator_() {
		if (cons < 0) return false;
		if (iq < 0) return false;
		if (str < 0) return false;
		if (agi < 0) return false;
		if (endu < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(cons);
		_os_.marshal(iq);
		_os_.marshal(str);
		_os_.marshal(agi);
		_os_.marshal(endu);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		cons = _os_.unmarshal_int();
		iq = _os_.unmarshal_int();
		str = _os_.unmarshal_int();
		agi = _os_.unmarshal_int();
		endu = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAddPointToAttr) {
			CAddPointToAttr _o_ = (CAddPointToAttr)_o1_;
			if (cons != _o_.cons) return false;
			if (iq != _o_.iq) return false;
			if (str != _o_.str) return false;
			if (agi != _o_.agi) return false;
			if (endu != _o_.endu) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += cons;
		_h_ += iq;
		_h_ += str;
		_h_ += agi;
		_h_ += endu;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(cons).append(",");
		_sb_.append(iq).append(",");
		_sb_.append(str).append(",");
		_sb_.append(agi).append(",");
		_sb_.append(endu).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAddPointToAttr _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = cons - _o_.cons;
		if (0 != _c_) return _c_;
		_c_ = iq - _o_.iq;
		if (0 != _c_) return _c_;
		_c_ = str - _o_.str;
		if (0 != _c_) return _c_;
		_c_ = agi - _o_.agi;
		if (0 != _c_) return _c_;
		_c_ = endu - _o_.endu;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


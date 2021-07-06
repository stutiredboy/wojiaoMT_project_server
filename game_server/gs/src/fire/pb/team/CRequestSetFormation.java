
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSetFormation__ extends mkio.Protocol { }

/** - 光环相关   start
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姵濞婇弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁绘娲滈崣鍛存⒑闂堟单鍫ュ疾濠婂牆纾挎俊銈呮噺閻撴洟鏌嶉埡浣告灓婵☆垰鎳愰幉鎼佹偋閸繄鐟查梺鍝勬噺閻擄繝寮诲☉銏╂晝妞ゆ劦婢�缁ㄨ偐绱撻崒姘毙㈤柣妤�妫濋崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆЦ婵炲憞鍕瘈婵炲牆鐏濋弸鐔兼煙缁嬪灝鏆遍柨鏇樺灪缁楃喖鏁撻挊澶樻綎闁惧繐婀辩壕鍏间繆椤栨碍绂嬪ù婊勭矎閻忔帗绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厽闁规儳鐡ㄧ粈瀣煙椤旂瓔娈滈柡浣瑰姍瀹曘劑顢橀悢鍑ゆ嫹鎼淬劍鈷掑〒姘搐瀵箖鏌涢妸銉у煟鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梻浣告啞閹稿棝宕熼銏画闂傚倸鍊烽懗鍓佹兜閸洖鐤炬繛鎴炵啲閹峰嘲顫濋鐔哄嚒闂佷紮绲介崲鏌ワ綖濠婂牊鏅稿ù鐘差儍閿熸垝绶氬顕�鏁撴禒瀣闁告侗鍨辩�氭岸鏌嶉埡浣告殶缂佸澧界槐鎾诲磼濮橆剨鎷烽幖浣哥９闁归棿绀佺壕鐟邦渻鐎ｎ亜顒㈡い鎰矙閺屾洟宕煎┑鎰︾紓浣哄閸ㄥ爼寮婚敐澶婄闁挎繂鎲涢幘缁樼厽闁规儳鐡ㄧ粈瀣煙椤旀枻鑰块柟顔界懇瀵爼骞嬪┑鍠版垿姊绘担瑙勫仩闁稿鍊濆畷婊堟偄閻撳氦鎽曢梺鎸庣箓椤︻垰螞濮楋拷閺岀喓绮欓崹顔炬О濠碘槅鍋撶粻鎾愁潖閾忚瀚氶柍銉ㄦ珪閻忔捇姊虹涵鍛彧闁规悂绠栧畷锝夊川椤撗勫瘜闂侀潧鐗嗛幊鎰不閻楀牅绻嗘い鎰剁悼閵嗘帞绱掗鍡欏埌閾绘牠鏌涘☉鍗炴灓闁告ü绮欓弻鐔煎礂閼测晜娈梺鎼炲妼椤兘濡撮崒鐐茬闁圭儤绻勯崬鐢告⒑閼姐倕鏋斿褎顨婅棢闁绘ê鍘栫换鍡涙煕濞嗗浚妲稿┑顔肩У椤ㄣ儵鎮欓弶鎴犵懆闁剧粯鐗曢湁闁挎繂顦板▍婊堟煛婢舵ê寮慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼濠电偞鎸荤喊宥夈�冩繝鍌滄殾濞村吋娼欓崘锟藉銈嗘寙閸曨剚鐝曢梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�
 * @author changhao
 *
 */
public class CRequestSetFormation extends __CRequestSetFormation__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleId > 0){
			new PSetFormationProc(roleId, formation).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794464;

	public int getType() {
		return 794464;
	}

	public int formation;

	public CRequestSetFormation() {
	}

	public CRequestSetFormation(int _formation_) {
		this.formation = _formation_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(formation);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		formation = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSetFormation) {
			CRequestSetFormation _o_ = (CRequestSetFormation)_o1_;
			if (formation != _o_.formation) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += formation;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(formation).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSetFormation _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = formation - _o_.formation;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


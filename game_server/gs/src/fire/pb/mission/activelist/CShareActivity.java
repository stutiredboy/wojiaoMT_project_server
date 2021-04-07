
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
						RoleLivenessManager.logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閹绘帞锟筋參姊婚崒姘卞闁稿繑鑹鹃埥澶娢熷鍕棃鐎规洏鍎甸幐濠冨緞鐎ｎ亝鐏庢俊鐐�戦崹娲�冮崱娑樼闁告稒娼欐导鐘绘煏婢诡垰鎳庣粊锕傛⒒閸屾艾锟介绮堟笟锟介獮澶愬灳鐡掍焦妞介弫鍐磼濮橆剙浜跺┑鐐差嚟婵挳顢栭崨顖氼棜鐟滅増甯楅悡鐔兼煙闁箑鏋涢柛鏂款儔閺岋綁骞樼�涙顦伴梺鍝勭灱閸犳牠骞冨鍏剧喖鎼归柅娑欘敇濠碉紕鍋戦崐鎴﹀磿閺屻儲鍋￠柍杞扮贰濞兼牜绱撴担璇＄劷缂佺娀绠栭弻锝夊箛闂堟稑顫梺缁樼箖濡啴寮婚敐澶婄闁告鍎戦幏宄扳攽鐎ｎ亞鐣洪悷婊呭鐢帡鎮欐繝鍥ㄧ厪濠电偛鐏濋崝銈囩磼娴ｅ搫鍘撮柟顔挎硾椤繈宕￠悙娴嬫嫬" + activityid + "]婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閸洘鈷掑ù锝呮啞閹牓鏌ゅú璇茬仸闁轰礁鍟存俊鑸靛緞濡粯娅嶅┑鐘绘涧閸婂鈥﹂崼銉﹀�峰┑鐘叉处閻撳啴鏌涘┑鍡楊仼闁跨喕妫勯…鐑藉极閹惧墎椹抽悗锝庝簻缁秴鈹戦纭锋敾婵＄偘绮欓悰顕�骞囬鐔峰妳闂佹寧绻傞崐褰掓晬婢跺瞼纾介柛灞剧懅缁涘繘鏌熷畡鏉挎Щ闂囧鏌ㄥ┑鍡欏妞ゅ繒濮风槐鎺楁晸閼恒儳绡�闁搞儯鍔岄敓鐣屾暬閺屻劌鈹戦崱娑憋拷妤呮煛鐎ｎ偆銆掔紒杈ㄥ浮閺佹挻绂掔�ｎ亜鑰垮┑鐐村灦閻熝囧储闁秵鈷戦柡鍌樺劜濞呭懘鏌涢悤浣哥仯缂侇喖鐗忛敓鏂ょ秵閸犳鎮￠悢鍏肩厵闁割煈鍠栭顏堟倵濮樼偓瀚�1婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ鍝勬倎闁绘帒锕ラ妵鍕疀閹捐泛鈷堥梺杞扮椤戝洭骞夐崨濠冨劅闁靛鍎抽悿鍕⒑闂堟单鍫ュ疾濞戙垺鍋傛繛鎴欏灪閻撴洟鎮橀悙闈涗壕闁汇劍鍨圭槐鎺楀箛椤旈棿妲愬┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告劦鐓堝Σ閬嶆⒒娴ｅ憡鍟為惇澶岀磼椤旂晫鎳冮柣锝囧厴楠炲洭鎮ч崼鐔割仧闂備浇娉曢崳锕傚箯閿燂拷.");
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


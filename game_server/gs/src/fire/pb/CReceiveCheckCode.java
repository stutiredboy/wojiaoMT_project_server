package fire.pb;
import fire.pb.tel.utils.CheckCodeUtils;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReceiveCheckCode__ extends mkio.Protocol { }

/** 发送短信验证
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
public class CReceiveCheckCode extends __CReceiveCheckCode__ {

	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0) {
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣藉┑顔肩仛缁岃鲸绻濋崶顬囨煕濞戝崬鏋涙繛鍜冪節濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐茬骇闁瑰濮靛▓楣冩⒑闂堟单鍫ュ疾濞戞氨妫憸鏃堝蓟閻旂尨鎷烽悽娈跨劸濞寸媴濡囬幃顕�鏁愭径瀣ф嫽婵炶揪绲块悺鏃堝吹濞嗘垹纾肩紓浣姑ù顔撅拷瑙勬礃閸ㄥ潡骞冮姀銈呯闁稿繒鍘ч崝鎺楁⒑绾懎浜归悶娑栧劚椤﹨顦圭�殿喗鎮傚顕�宕奸悢鍝勫箺闂備焦瀵х换鍌炲箠閹扮増鍊块柛褎顨嗛悡娆忣渻鐎ｎ亪顎楅柛妯绘尦閺岀喖顢涘顒婃嫹閸喚鏆﹂柕濠忓缁★拷闂佺琚崐鎾舵閿曞倹鈷掗柛灞捐壘閿熶粙顥撶划鍫熺瑹閿熶粙鐛径鎰櫢闁绘灏欓ˇ顕�姊洪幐搴⑩拻闁哄拋鍋婇妴鍛村矗婢跺瞼鐦堥梻鍌氱墛娓氭宕曞鍛＝鐎广儱妫涙晶閬嶆煥閻旂粯顥夌紒鐘茬Ч瀹曟洟鏌嗗畵銉ユ处鐎靛ジ寮堕幋鐘插箞闂備胶鎳撻悺銊ф閻ゎ垬浜归柟鐑樺灩椤ρ囨⒑閸忚偐銈撮柡鍛矒瀹曟娊顢橀姀锛勫幗闁瑰吋鐣崹濠氬疮閺屻儲鐓欓柛鎴欏�栫�氾拷?
		CheckCodeUtils.getCheckCode(roleid, checkcodetype);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786570;

	public int getType() {
		return 786570;
	}

	public byte checkcodetype; // 2 道具安全锁 3藏宝阁

	public CReceiveCheckCode() {
	}

	public CReceiveCheckCode(byte _checkcodetype_) {
		this.checkcodetype = _checkcodetype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(checkcodetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		checkcodetype = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReceiveCheckCode) {
			CReceiveCheckCode _o_ = (CReceiveCheckCode)_o1_;
			if (checkcodetype != _o_.checkcodetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)checkcodetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(checkcodetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReceiveCheckCode _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = checkcodetype - _o_.checkcodetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}
}

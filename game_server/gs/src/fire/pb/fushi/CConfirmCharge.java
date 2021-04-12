
package fire.pb.fushi;
import gnet.link.Role;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CConfirmCharge__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/***
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻О闂備浇顕栭崹鎶藉磻閵堝宓侀柡宥庣仈鎼搭煈鏁嗛柨鐔诲Г娣囧﹥绺介崨濠勫幗濡炪倖鎸鹃崳銉モ枔濠婂嫷娈介柣鎰嚟婢ь亪鎳ｉ幇顓滀簻闁硅櫣鍋炵�氳绻濆鏋�曟禍鍦磼鏉堛劌娴鐐叉喘椤㈡顦抽柣锝夘棑缁辨挻鎷呴搹鐟扮闂佺儵鏅╅崹鍫曟偘椤旀拝鎷烽敐搴濈按闁哄閰ｉ悡顐﹀炊閵婏妇顦ユ繝娈垮枛閻栫厧顫忕紒妯诲闁兼亽鍎敓钘夊暟缁辨帡鏁撻懞銉﹀閻犲洢鍎插鑺ヤ繆閼搁潧绶炲┑鐘插楠炲姊绘担渚敯闁规椿浜浠嬪礋椤栨氨锛涢梺瑙勫婢ф宕愰悽鍛婄厱闁挎棁顕ч獮鏍拷娑欑箓椤啴濡堕崘銊ュ缂備浇顕х�氼喖危閹版澘绠婚悗闈涙憸閹虫繃绻濋悽闈浶㈤柛鐕佸亰椤㈡棃宕奸弴鐔叉嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓熸い鎺炴嫹闁靛牏顭堥悾鐑藉箣閿旇棄锟界兘鏌ｉ幋鐏活亝绂嶅Δ鍛拺闁告繂瀚婵嬫煕閻樿櫕灏电紒顔剧帛閵堬綁宕橀埡鍐ㄥ箥闂佸搫顦悧鍡樻櫠閻ｅ瞼鐭欏┑鐘崇閻撶喐绻濋崹顐㈠闂侇収鍨堕弻鐔碱敊缁涘鐣跺銈庡亝缁诲牓骞冨▎鎿冩晢闁跨喍绮欓、鏃堟晸閿燂拷??
 * @author changhao
 *
 */
public class CConfirmCharge extends __CConfirmCharge__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		new PPayConfirm(roleid, role.getUserid(), this).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812456;

	public int getType() {
		return 812456;
	}

	public int goodid;
	public int goodnum;
	public java.lang.String extra;

	public CConfirmCharge() {
		extra = "";
	}

	public CConfirmCharge(int _goodid_, int _goodnum_, java.lang.String _extra_) {
		this.goodid = _goodid_;
		this.goodnum = _goodnum_;
		this.extra = _extra_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(goodid);
		_os_.marshal(goodnum);
		_os_.marshal(extra, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		goodid = _os_.unmarshal_int();
		goodnum = _os_.unmarshal_int();
		extra = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CConfirmCharge) {
			CConfirmCharge _o_ = (CConfirmCharge)_o1_;
			if (goodid != _o_.goodid) return false;
			if (goodnum != _o_.goodnum) return false;
			if (!extra.equals(_o_.extra)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += goodid;
		_h_ += goodnum;
		_h_ += extra.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(goodid).append(",");
		_sb_.append(goodnum).append(",");
		_sb_.append("T").append(extra.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


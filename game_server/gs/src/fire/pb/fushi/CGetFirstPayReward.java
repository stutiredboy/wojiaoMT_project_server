
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetFirstPayReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮濡炪倖姊归崕宕囨暜閵娧呯＝濞达絼绮欓崫鐑樹繆椤愩垹鏆ｇ�殿喖顭烽崹鎯х暦閸ャ劍顔撴俊鐐�栧濠氬储瑜斿鎶芥倷鐎涙ê寮块梺鎸庣箓濡鎱ㄩ崼銏㈢＜缂備焦顭囩粻鐐翠繆椤愩垹鏆欓柍钘夘槸椤粓宕奸悢濂変紦闁荤喐绮庢晶妤冩暜濡ゅ懎纾婚悗锝庡枟閻撴盯鏌涢妷銏℃珔闁哄鍨块弻娑樷枎韫囨洜顔掗梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�
 * @author changhao
 *
 */
public class CGetFirstPayReward extends __CGetFirstPayReward__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new PGrabFirstPayAward(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812462;

	public int getType() {
		return 812462;
	}


	public CGetFirstPayReward() {
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
		if (_o1_ instanceof CGetFirstPayReward) {
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

	public int compareTo(CGetFirstPayReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


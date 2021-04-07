
package fire.pb.mission;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqMissionCanAccept__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqMissionCanAccept extends __CReqMissionCanAccept__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid( this );
		if ( roleid < 0 )
			return;
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜閵囨盯鏁撻弬銈囩暤鐎规洖銈告慨锟介柍銉﹀墯閿熻姤鐩娲传閸曨噮娼堕梺绋垮閻擄繝骞冮垾鏂ユ瀻闁规儳顕崢闈涱渻閵堝棙灏甸柛鐘叉捣缁參骞掑Δ浣哄幈闂佸搫鍠涢幏鐑芥煟閻斿弶娅婄�殿喖顭烽幃銏ゆ嚃閳轰胶銈﹂梻浣稿閻撳牓宕板顓烆嚤闁割偁鍎查崐鐢告偡濞嗗繐顏紒灞芥健閺岀喖宕欓妶鍡楊伓?
		SReqMissionCanAccept send = new SReqMissionCanAccept();
		Module.getInstance().getCanAcceptMission( roleid, send.missions );
		gnet.link.Onlines.getInstance().send( roleid, send );
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805456;

	public int getType() {
		return 805456;
	}


	public CReqMissionCanAccept() {
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
		if (_o1_ instanceof CReqMissionCanAccept) {
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

	public int compareTo(CReqMissionCanAccept _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


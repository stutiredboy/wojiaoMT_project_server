
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQuitTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐閻庤娲橀崝鏍矉閹烘棑鎷烽敐鍛粵闁哄拋浜幃宄邦煥閸愵亞顔囬柛妤呬憾閺岀喖鎮ч崼鐔哄嚒缂備胶濯寸紞渚�寮婚妸鈺佺睄闁搞儱妫欑敮锟犵嵁閹扮増鏅稿ù鐘差儐閳锋帒霉閿濆牊顏犻悽顖涚洴閺岋紕浠︾拠鎻掝瀴闂佸搫鎳撻崺鏍箚閺冨牊鏅查柛銉㈡櫇閸斿爼姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
 * @author changhao
 *
 */
public class CQuitTeam extends __CQuitTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long leverRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(leverRoleId >0){
			new PQuitTeamProc(leverRoleId).submit();
		}
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794440;

	public int getType() {
		return 794440;
	}


	public CQuitTeam() {
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
		if (_o1_ instanceof CQuitTeam) {
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

	public int compareTo(CQuitTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDismissTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濆鍫曞醇濮橆厽鐝旂紓浣界堪閸婃洝鐏冮梺鎸庣箓閹冲酣寮冲▎鎰弿閻熸瑥瀚崣锟藉Δ鐘靛仦閻楁洝褰佸銈嗗釜閹峰嘲鈹戦垾鑼煓闁哄苯绉归弻銊э拷锝庡亜绾炬娊姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘礀閹冲繐鈻撻搹鍦＝闁稿本鐟х粵蹇涙煙妞嬪骸鍘撮柡灞诲姂閹倝宕掑☉姗嗕紦
 * @author changhao
 *
 */
public class CDismissTeam extends __CDismissTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		Team team = TeamManager.selectTeamByRoleId(roleid);
		if(team == null)
			return;
		if(!team.isTeamLeader(roleid))
			return;
		new PDisMissTeam(team.teamId,PDisMissTeam.REASON_LEADER).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794487;

	public int getType() {
		return 794487;
	}


	public CDismissTeam() {
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
		if (_o1_ instanceof CDismissTeam) {
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

	public int compareTo(CDismissTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


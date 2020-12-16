
package fire.pb.battle.pvp3;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SPvP3MatchResult__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SPvP3MatchResult extends __SPvP3MatchResult__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793645;

	public int getType() {
		return 793645;
	}

	public java.util.LinkedList<fire.pb.battle.pvp3.PvP3RoleSingleMatch> targets; // 目标

	public SPvP3MatchResult() {
		targets = new java.util.LinkedList<fire.pb.battle.pvp3.PvP3RoleSingleMatch>();
	}

	public SPvP3MatchResult(java.util.LinkedList<fire.pb.battle.pvp3.PvP3RoleSingleMatch> _targets_) {
		this.targets = _targets_;
	}

	public final boolean _validator_() {
		for (fire.pb.battle.pvp3.PvP3RoleSingleMatch _v_ : targets)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(targets.size());
		for (fire.pb.battle.pvp3.PvP3RoleSingleMatch _v_ : targets) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.battle.pvp3.PvP3RoleSingleMatch _v_ = new fire.pb.battle.pvp3.PvP3RoleSingleMatch();
			_v_.unmarshal(_os_);
			targets.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SPvP3MatchResult) {
			SPvP3MatchResult _o_ = (SPvP3MatchResult)_o1_;
			if (!targets.equals(_o_.targets)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += targets.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(targets).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SSetTeamState__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SSetTeamState extends __SSetTeamState__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794484;

	public int getType() {
		return 794484;
	}

	public int state; // ����״̬���ο�TeamState��1=��ͨ���飻2=�ȴ��еĶ��飻3=�ټ������
	public int smapid; // ��ͼ�淨ID����������ͨ����״̬ʱ��smapIdΪ0

	public SSetTeamState() {
	}

	public SSetTeamState(int _state_, int _smapid_) {
		this.state = _state_;
		this.smapid = _smapid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(state);
		_os_.marshal(smapid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		state = _os_.unmarshal_int();
		smapid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SSetTeamState) {
			SSetTeamState _o_ = (SSetTeamState)_o1_;
			if (state != _o_.state) return false;
			if (smapid != _o_.smapid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += state;
		_h_ += smapid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(state).append(",");
		_sb_.append(smapid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SSetTeamState _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = state - _o_.state;
		if (0 != _c_) return _c_;
		_c_ = smapid - _o_.smapid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


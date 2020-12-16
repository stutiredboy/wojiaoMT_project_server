
package fire.pb;


import fire.pb.buff.BuffConstant;
import fire.pb.common.SCommon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAddPointToAttr__ extends mkio.Protocol { }

/** �ͻ����������Լӵ�
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAddPointToAttr extends __CAddPointToAttr__ {
	@Override
	protected void process() {
		// protocol handle
		
		// TODO: 不能加点的状态条件判�?:�? 战斗�?
		
		// 数据合法性检�?
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		if(fire.pb.buff.Module.existState(roleId, BuffConstant.StateType.STATE_BATTLE_FIGHTER))
			return;

		if (cons < 0 || iq < 0 
				|| str < 0 || agi < 0
				|| endu < 0){
			return;
		}
		if (cons == 0 && iq == 0 && str ==0
				&& agi == 0 && endu == 0)
			return;
		final xbean.Properties prop = xtable.Properties.select(roleId);
		if (null == prop)
			return;
		
		final SCommon cc = RoleConfigManager.getRoleCommonConfig(DataInit.COMMEN_ROLE_ADDPOINT);
		if (prop.getLevel() < Integer.parseInt(cc.getValue()))
			return;
		
		final long sum = cons + str + agi + endu + iq;
		if (sum > prop.getPoint().get(prop.getScheme()))
			return;
		
		// 加点操作
		final PAddPointProc addpoint = new PAddPointProc(roleId, this);
		addpoint.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786444;

	public int getType() {
		return 786444;
	}

	public int cons; // ����
	public int iq; // ����
	public int str; // ����
	public int agi; // ����
	public int endu; // ����

	public CAddPointToAttr() {
	}

	public CAddPointToAttr(int _cons_, int _iq_, int _str_, int _agi_, int _endu_) {
		this.cons = _cons_;
		this.iq = _iq_;
		this.str = _str_;
		this.agi = _agi_;
		this.endu = _endu_;
	}

	public final boolean _validator_() {
		if (cons < 0) return false;
		if (iq < 0) return false;
		if (str < 0) return false;
		if (agi < 0) return false;
		if (endu < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(cons);
		_os_.marshal(iq);
		_os_.marshal(str);
		_os_.marshal(agi);
		_os_.marshal(endu);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		cons = _os_.unmarshal_int();
		iq = _os_.unmarshal_int();
		str = _os_.unmarshal_int();
		agi = _os_.unmarshal_int();
		endu = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAddPointToAttr) {
			CAddPointToAttr _o_ = (CAddPointToAttr)_o1_;
			if (cons != _o_.cons) return false;
			if (iq != _o_.iq) return false;
			if (str != _o_.str) return false;
			if (agi != _o_.agi) return false;
			if (endu != _o_.endu) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += cons;
		_h_ += iq;
		_h_ += str;
		_h_ += agi;
		_h_ += endu;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(cons).append(",");
		_sb_.append(iq).append(",");
		_sb_.append(str).append(",");
		_sb_.append(agi).append(",");
		_sb_.append(endu).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAddPointToAttr _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = cons - _o_.cons;
		if (0 != _c_) return _c_;
		_c_ = iq - _o_.iq;
		if (0 != _c_) return _c_;
		_c_ = str - _o_.str;
		if (0 != _c_) return _c_;
		_c_ = agi - _o_.agi;
		if (0 != _c_) return _c_;
		_c_ = endu - _o_.endu;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


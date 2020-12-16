
package fire.pb;

import fire.pb.state.DRoleOnlineFail;
import fire.pb.state.PRoleOnline;
import fire.pb.state.StateManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CEnterWorld__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CEnterWorld extends __CEnterWorld__ {
	@Override
	protected void process() {
		//XXX:仔细考虑下，如果这中间有时差怎么�?
		//TODO:10秒内只让登录�?次�?�防攻击�?
		final int userId=((gnet.link.Dispatch)this.getContext()).userid;
		final xbean.User usr = xtable.User.select(userId);
		if(null == usr || !usr.getIdlist().contains(roleid))
		{
			StateManager.logger.error(new StringBuilder("CEnterWorld: 账号Id = ").append(userId).append("没有这个角色�?").append(roleid).append(", 登录失败�?"));
			return;
		}
		StateManager.logger.info(new StringBuilder("roleid=").append(roleid).append(" �?始进入世�?"));
		//加入新的角色,这一句必须放在角色进入场景前
		gnet.link.Onlines.getInstance().insert(this, roleid);
		StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" CEnterWorld: 已经加入�?"));
		
		PRoleOnline pRoleOnline = new PRoleOnline(userId,roleid);
		try
		{
			if (rolesnum > 0) 
				new mkdb.Procedure()
				{
					protected boolean process() throws Exception {
						final xbean.Properties roleProp = xtable.Properties.get(roleid);
						if (null == roleProp)
							return false;
						if(roleProp.getSysconfigmap().size() == 0){
							GameSystemConfig.resetSysConfig(roleProp);
						}
						
						Integer oldMaxScreenShowNum = roleProp.getSysconfigmap().get(SysConfigType.MaxScreenShowNum);
						if(oldMaxScreenShowNum == null)
							oldMaxScreenShowNum = 0;
						if(rolesnum == oldMaxScreenShowNum)
							return true;
						roleProp.getSysconfigmap().put(SysConfigType.MaxScreenShowNum, rolesnum);
						return true;
					};
				}.submit().get();
			pRoleOnline.submit().get();
		} catch (Exception e)
		{
			StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" 登入出错�?").append(e));
		}
		new DRoleOnlineFail().doDone(pRoleOnline);
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786437;

	public int getType() {
		return 786437;
	}

	public long roleid;
	public int rolesnum; // ͬ���ܿ���������

	public CEnterWorld() {
	}

	public CEnterWorld(long _roleid_, int _rolesnum_) {
		this.roleid = _roleid_;
		this.rolesnum = _rolesnum_;
	}

	public final boolean _validator_() {
		if (roleid < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(rolesnum);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		rolesnum = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CEnterWorld) {
			CEnterWorld _o_ = (CEnterWorld)_o1_;
			if (roleid != _o_.roleid) return false;
			if (rolesnum != _o_.rolesnum) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += rolesnum;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(rolesnum).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CEnterWorld _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = rolesnum - _o_.rolesnum;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
		//XXX:浠旂粏鑰冭檻涓嬶紝濡傛灉杩欎腑闂存湁鏃跺樊鎬庝箞鍔?
		//TODO:10绉掑唴鍙鐧诲綍涓?娆°?傞槻鏀诲嚮銆?
		final int userId=((gnet.link.Dispatch)this.getContext()).userid;
		final xbean.User usr = xtable.User.select(userId);
		if(null == usr || !usr.getIdlist().contains(roleid))
		{
			StateManager.logger.error(new StringBuilder("CEnterWorld: 璐﹀彿Id = ").append(userId).append("娌℃湁杩欎釜瑙掕壊锛?").append(roleid).append(", 鐧诲綍澶辫触銆?"));
			return;
		}
		StateManager.logger.info(new StringBuilder("roleid=").append(roleid).append(" 寮?濮嬭繘鍏ヤ笘鐣?"));
		//鍔犲叆鏂扮殑瑙掕壊,杩欎竴鍙ュ繀椤绘斁鍦ㄨ鑹茶繘鍏ュ満鏅墠
		gnet.link.Onlines.getInstance().insert(this, roleid);
		StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" CEnterWorld: 宸茬粡鍔犲叆銆?"));
		
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
			StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" 鐧诲叆鍑洪敊銆?").append(e));
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
	public int rolesnum; // 同屏能看见的人数

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



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
		//XXX:娴犳梻绮忛懓鍐娑撳绱濇俊鍌涚亯鏉╂瑤鑵戦梻瀛樻箒閺冭泛妯婇幀搴濈疄閸�?
		//TODO:10缁夋帒鍞撮崣顏囶唨閻ц缍嶆稉?濞喡�?鍌炴Щ閺�璇插毊閵�?
		final int userId=((gnet.link.Dispatch)this.getContext()).userid;
		final xbean.User usr = xtable.User.select(userId);
		if(null == usr || !usr.getIdlist().contains(roleid))
		{
			StateManager.logger.error(new StringBuilder("CEnterWorld: 鐠愶箑褰縄d = ").append(userId).append("濞屸剝婀佹潻娆庨嚋鐟欐帟澹婇敍?").append(roleid).append(", 閻ц缍嶆径杈Е閵�?"));
			return;
		}
		StateManager.logger.info(new StringBuilder("roleid=").append(roleid).append(" 瀵�?婵绻橀崗銉ょ瑯閻�?"));
		//閸旂姴鍙嗛弬鎵畱鐟欐帟澹�,鏉╂瑤绔撮崣銉ョ箑妞ょ粯鏂侀崷銊潡閼硅尪绻橀崗銉ユ簚閺咁垰澧�
		gnet.link.Onlines.getInstance().insert(this, roleid);
		StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" CEnterWorld: 瀹歌尙绮￠崝鐘插弳閵�?"));
		
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
			StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" 閻ц鍙嗛崙娲晩閵�?").append(e));
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


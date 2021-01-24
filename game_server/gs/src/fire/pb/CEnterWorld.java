
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
		//XXX:濞寸姵姊荤划蹇涙嚀閸愵厽顎氬☉鎾愁儜缁辨繃淇婇崒娑氫函閺夆晜鐟ら懙鎴︽⒒鐎涙ɑ绠掗柡鍐硾濡﹪骞�鎼存繄鐤勯柛锟�?
		//TODO:10缂佸甯掗崬鎾矗椤忓浂鍞ㄩ柣褑顕х紞宥嗙▔?婵炲枴锟�?閸岀偞些闁猴拷鐠囨彃姣婇柕锟�?
		final int userId=((gnet.link.Dispatch)this.getContext()).userid;
		final xbean.User usr = xtable.User.select(userId);
		if(null == usr || !usr.getIdlist().contains(roleid))
		{
			StateManager.logger.error(new StringBuilder("CEnterWorld: 閻犳劧绠戣ぐ绺刣 = ").append(userId).append("婵炲备鍓濆﹢浣规交濞嗗酣鍤嬮悷娆愬笩婢瑰﹪鏁�?").append(roleid).append(", 闁谎嗩嚙缂嶅秵寰勬潏顐バ曢柕锟�?"));
			return;
		}
		StateManager.logger.info(new StringBuilder("roleid=").append(roleid).append(" 鐎碉拷?濠殿喖顑堢换姗�宕楅妷銈囩懐闁伙拷?"));
		//闁告梻濮撮崣鍡涘棘閹殿喗鐣遍悷娆愬笩婢癸拷,閺夆晜鐟ょ粩鎾矗閵夈儳绠戝銈囩帛閺備線宕烽妸顭戞健闁肩灏换姗�宕楅妷銉︾皻闁哄拋鍨版晶锟�
		gnet.link.Onlines.getInstance().insert(this, roleid);
		StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" CEnterWorld: 鐎规瓕灏欑划锟犲礉閻樻彃寮抽柕锟�?"));
		
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
			StateManager.logger.error(new StringBuilder("roleid=").append(roleid).append(" 闁谎嗩嚙閸欏棝宕欏ú顏呮櫓闁碉拷?").append(e));
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


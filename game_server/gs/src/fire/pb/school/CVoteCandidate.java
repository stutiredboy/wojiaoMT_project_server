
package fire.pb.school;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVoteCandidate__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 职业领袖�?始投�?
 * @author changhao
 *
 */
public class CVoteCandidate extends __CVoteCandidate__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole prop=new fire.pb.PropRole(roleid,true);
		
		//时间不对 by changhao
		if(!fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkCanVote(System.currentTimeMillis()))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190072, null);
			return;
		}
		
		//玩家等级大于�?50�? by changhao
		if(prop.getLevel() < SchoolConst.TOUPIAO_MINLEVEL)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190080, null);
			return;
		}
		
		long value = prop.getProperties().getHistorymaxprofessioncontribute();
		
		if (value < 100) //历史职业贡献度要达到100才能投票 by changhao
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190076, null);
			return;
		}
				
		//是否已经投票 by changhao
		if(fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkAlreadyVote(roleid))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170014, null);
			return;
		}

		new fire.pb.school.shouxi.PVoteCandidate(roleid,candidateid,shouxikey).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810436;

	public int getType() {
		return 810436;
	}

	public long candidateid;
	public long shouxikey;

	public CVoteCandidate() {
	}

	public CVoteCandidate(long _candidateid_, long _shouxikey_) {
		this.candidateid = _candidateid_;
		this.shouxikey = _shouxikey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(candidateid);
		_os_.marshal(shouxikey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		candidateid = _os_.unmarshal_long();
		shouxikey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CVoteCandidate) {
			CVoteCandidate _o_ = (CVoteCandidate)_o1_;
			if (candidateid != _o_.candidateid) return false;
			if (shouxikey != _o_.shouxikey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)candidateid;
		_h_ += (int)shouxikey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(candidateid).append(",");
		_sb_.append(shouxikey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CVoteCandidate _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(candidateid - _o_.candidateid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(shouxikey - _o_.shouxikey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


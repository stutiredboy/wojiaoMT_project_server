
package fire.pb.school;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVoteCandidate__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闁煎崬濂旂粭鐔革紣閸℃凹鏆�碉拷?濠殿喖顑嗘慨鍥╃矈?
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
		
		//闁哄啫鐖煎Λ鎸庣▔瀹ュ拋鍤� by changhao
		if(!fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().checkCanVote(System.currentTimeMillis()))
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190072, null);
			return;
		}
		
		//闁绘壕鏅涢宥囩驳婢跺矂鐛撳鍫嗗倻鑹剧紒锟�?50缂侊拷? by changhao
		if(prop.getLevel() < SchoolConst.TOUPIAO_MINLEVEL)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190080, null);
			return;
		}
		
		long value = prop.getProperties().getHistorymaxprofessioncontribute();
		
		if (value < 100) //闁告ê妫楄ぐ鍫曟嚂鐏炶偐鐟归悹鎰剁磿鐏忕偞鎯旈敃渚囨矗閺夊牊鍎抽崺锟�100闁归潧绉烽崗姗�骞庨弴鐘亶 by changhao
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190076, null);
			return;
		}
				
		//闁哄嫷鍨伴幆浣割啅閼碱剛鐥呴柟鑸垫礈閵堬拷 by changhao
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


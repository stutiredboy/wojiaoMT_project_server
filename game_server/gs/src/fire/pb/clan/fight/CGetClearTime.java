
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetClearTime__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/**
 * 得到下次清除数据时间 by changhao
 *
 */
public class CGetClearTime extends __CGetClearTime__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure getcleartime = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{	
				int curweek = fire.pb.activity.clanfight.ActivityClanFightManager.getInstance().curweek.get();
				if (curweek == -1)
				{
					return false;
				}
				
				long cur = System.currentTimeMillis();
				
				long monday0000 = fire.pb.activity.clanfight.ActivityClanFightManager.GetMonday0000ByTime(cur);
				curweek = curweek % 24;;
				int r = 24 - curweek;
				
				long day1 = 24 * 3600 * 1000;
				
				long end = monday0000 + day1 * 7 * r;
				
				SGetClearTime msg = new SGetClearTime();
				msg.cleartime = end;
								
				mkdb.Procedure.psendWhileCommit(roleid, msg);

				return true;
			}
		
		};
		
		getcleartime.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808545;

	public int getType() {
		return 808545;
	}


	public CGetClearTime() {
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
		if (_o1_ instanceof CGetClearTime) {
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

	public int compareTo(CGetClearTime _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


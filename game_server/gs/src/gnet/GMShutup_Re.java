
package gnet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GMShutup_Re__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GMShutup_Re extends __GMShutup_Re__ {
	@Override
	protected void process() {
		// protocol handle
		if (retcode == 0){
			new mkdb.Procedure(){
				public boolean process(){
					final long now = System.currentTimeMillis();
					xtable.Userid2forbidtime.remove(dstuserid);
					if(forbid_time <= 0)
						return true;//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濆鍫曞醇濮橆厽鐝栫紓渚婃嫹濠电姴浼呰ぐ鎺撴櫜闁搞儮鏂傞敓钘夛躬閺岋紕锟斤綆浜炴晥濡ょ姷鍋為悧妤�顭囪箛娑樼鐟滃酣宕戣濮婂搫煤鐠囨彃绠瑰銈忓瘜閸ㄨ泛锕㈡笟锟藉娲箰鎼达絿鐣甸梺缁樻煥濡繈鐛幒鎳虫棃鏁撴禒瀣闁绘绮悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
					xbean.forbidinfo forbid = xbean.Pod.newforbidinfo();
					forbid.setForbidtime(forbid_time*1000 + now);
					xtable.Userid2forbidtime.add(dstuserid, forbid);
					return true;
				}
			}.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 357;

	public int getType() {
		return 357;
	}

	public int retcode;
	public int dstuserid;
	public int forbid_time;

	public GMShutup_Re() {
	}

	public GMShutup_Re(int _retcode_, int _dstuserid_, int _forbid_time_) {
		this.retcode = _retcode_;
		this.dstuserid = _dstuserid_;
		this.forbid_time = _forbid_time_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(retcode);
		_os_.marshal(dstuserid);
		_os_.marshal(forbid_time);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		retcode = _os_.unmarshal_int();
		dstuserid = _os_.unmarshal_int();
		forbid_time = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GMShutup_Re) {
			GMShutup_Re _o_ = (GMShutup_Re)_o1_;
			if (retcode != _o_.retcode) return false;
			if (dstuserid != _o_.dstuserid) return false;
			if (forbid_time != _o_.forbid_time) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += retcode;
		_h_ += dstuserid;
		_h_ += forbid_time;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(retcode).append(",");
		_sb_.append(dstuserid).append(",");
		_sb_.append(forbid_time).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GMShutup_Re _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = retcode - _o_.retcode;
		if (0 != _c_) return _c_;
		_c_ = dstuserid - _o_.dstuserid;
		if (0 != _c_) return _c_;
		_c_ = forbid_time - _o_.forbid_time;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


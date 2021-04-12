
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
						return true;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽閸♀晛娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊﹀弿婵妫楅獮妤呮煟濠靛洨澧辩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦婵犵數濮烽弫鍛婃叏鐎涙ê顕遍柛娑滃焽娴滃綊鏌熼悜妯诲鞍婵炲懏绮撳娲箹閻愭彃濮夐梺鍝勫�搁崐鍧楀极閹剧粯瀵犲鑸电閸氼偊姊洪崫鍕効缂佽鲸娲熼弫鎾诲棘閵堝洨校婵炲瓨绮庨崑鐐哄疾閵夛缚绻嗛柕鍫濇搐鍟搁梺绋款儑閸嬨倝骞冭铻栭柨鐔剁矙閳ワ箓宕堕鍡欐澑濠电偞鍨堕…鍥囬銏″仭婵犲﹤鍟撮崣鍕拷瑙勬礃閸ㄥジ藝鐟欏嫭鍙忓┑鐘插�归幆鍫ユ偂閵堝鍋ｉ柛銉ｅ妼缁茶崵绱掗悩鍨殌妞ゎ亜鍟存俊鎯扮疀閹捐埖袙闂備焦鎮堕崝蹇撯枖濞戙垺鏅濋柕蹇ョ磿閻熷綊鏌ㄩ悢缁橆棄妞ゎ偄绻愮叅妞ゅ繐瀚鍥煙閼圭増褰х紒鎻掓健閹箖鎮介崨濞炬嫼缂傚倷鐒﹁摫闁绘挶鍎叉穱濠囶敃閿濆洨鐤勯梺缁樹緱閸ｏ綁鐛幒妤�绠犻柧蹇ｅ亝椤ュ牓鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵娴滅偤藝閳哄懏鈷戠紓浣癸供閻掔晫绱掗鍛仸闁诡噯绻濇俊鐑藉煛閸屾粌骞楅梻浣告惈濞层劑宕戝☉銏℃櫢闁芥ê顦扮拹锟犳煥閻旇袚闁绘棏鍓熼獮蹇涙晸閿燂拷
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


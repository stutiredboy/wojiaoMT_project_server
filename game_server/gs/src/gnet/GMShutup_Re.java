
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
						return true;//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑鍡╁殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囩墱缁辨挻绗熸繝鍐伓濠电姷鏁告慨瀛樺閸涜埇浜归柟鐑樻尰濞呮粓姊洪幖鐐插姉闁哄倸鍊块弫鎾绘寠婢舵稖鍚梺鍝勭焿缁辨洟鏁撻弬銈囩У濞存粎鍋為弲銉︿繆閵堝洤啸闁稿鍋ら幃褍螖閿熶粙鈥﹂崶顏嗙杸婵炴垶顭囬ˇ顓㈡偡濠婂啴鍙勭�规洘鍨奸ˇ瑙勬叏婵犲倹鎯堥悡銈夋偣閸ャ劌绲荤紒鐘垫嚀椤啴濡惰箛鎾舵В闂佹悶鍔忓▔娑㈡晝閵忥紕鐟归柨鐔绘椤繐煤椤忓嫮顔囬柟鑹版彧缁插潡鎮鹃悽鍛娾拺缂備焦蓱閻撱儲淇婇锝囩疄闁绘侗鍣ｉ獮鎺楀箠閾忣偅顥堥柡浣规尰缁傛帞锟斤綆浜為ˇ鈺呮⒑缂佹﹩鐒界紒顕呭灦閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�
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


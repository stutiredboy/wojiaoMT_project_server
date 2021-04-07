
package fire.pb.fushi;

import gnet.link.Onlines;
import fire.pb.main.ConfigManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqServerId__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇涙⒑鐠囨彃顒㈤柤褰掔畺钘濋梺顒�绉甸弲鎼佹煢濡警妲洪柣锝庡弮閺屾稒鎯旈妸銈嗗枤濡ょ姷鍋涢敃銉╁箚閺冨牃锟斤箓骞掗弮鍌楁（闂傚倷绶氬褔鎮ч崱娴板洦瀵肩�涙ê浜楅梺鍝勬储閸ㄦ椽鎮￠妷锔剧瘈闂傚牊绋掗ˉ婊堟煥閻旇袚闁诡喖鍊搁锝夊蓟閵夛箑鍓梺璺ㄥ櫐閹凤拷
 * @author changhao
 *
 */
public class CReqServerId extends __CReqServerId__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid > 0){
			SRspServerId send = new SRspServerId();
			send.serverid = ConfigManager.getGsZoneId();
			send.flag = flag;
			Onlines.getInstance().send(roleid, send);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812472;

	public int getType() {
		return 812472;
	}

	public int flag;

	public CReqServerId() {
	}

	public CReqServerId(int _flag_) {
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		flag = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqServerId) {
			CReqServerId _o_ = (CReqServerId)_o1_;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqServerId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


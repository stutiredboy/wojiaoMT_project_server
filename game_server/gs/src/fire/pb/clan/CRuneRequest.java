
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRuneRequest__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRuneRequest extends __CRuneRequest__ {
	@Override
	protected void process() {
		// protocol handle
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆鐓ラ柡鍐ㄥ�瑰▍鏇㈡煕濮楋拷濞佳囧煘閹达附鍊烽柤纰卞墮椤ｆ椽姊虹拠鑼缂佽鐗嗛锝夊箹娴ｈ倽褔鏌涢妷銏℃珖闁挎稒绮撳铏圭磼濮楀棛鍔稿┑鐐叉噺濞茬喕妫㈤梺鍓插亖閸庢煡鎮″☉銏″�堕柣鎰邦杺閸ゆ瑥鈹戦鐓庯拷濠氭晸閼恒儺鍟忛柛锝庡櫍瀹曟娊鏁愰崨顖涙闂佸壊鍋呭ú宥夋晸閼恒儳澧垫い銏＄懇閹崇偤濡烽妷褝绱﹂梻鍌欑閹碱偊鎯屾径灞界筏濡わ絽鍟粻姘舵煛閸愩劎澧遍柡浣哥У缁绘盯骞嬮悜鍥︾返婵炲銆嬮幏锟�
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				return fire.pb.clan.srv.ClanManage.sendCRuneRequest(roleid,runerequestinfolist);
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808511;

	public int getType() {
		return 808511;
	}

	public java.util.ArrayList<fire.pb.clan.RuneRequestInfo> runerequestinfolist;

	public CRuneRequest() {
		runerequestinfolist = new java.util.ArrayList<fire.pb.clan.RuneRequestInfo>();
	}

	public CRuneRequest(java.util.ArrayList<fire.pb.clan.RuneRequestInfo> _runerequestinfolist_) {
		this.runerequestinfolist = _runerequestinfolist_;
	}

	public final boolean _validator_() {
		for (fire.pb.clan.RuneRequestInfo _v_ : runerequestinfolist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(runerequestinfolist.size());
		for (fire.pb.clan.RuneRequestInfo _v_ : runerequestinfolist) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.clan.RuneRequestInfo _v_ = new fire.pb.clan.RuneRequestInfo();
			_v_.unmarshal(_os_);
			runerequestinfolist.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRuneRequest) {
			CRuneRequest _o_ = (CRuneRequest)_o1_;
			if (!runerequestinfolist.equals(_o_.runerequestinfolist)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += runerequestinfolist.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(runerequestinfolist).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


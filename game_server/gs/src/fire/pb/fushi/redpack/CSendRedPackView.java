
package fire.pb.fushi.redpack;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendRedPackView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendRedPackView extends __CSendRedPackView__ {
	@Override
	protected void process() {
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫰鍋婂〒濠氭煙閻戞﹩娈旂紒锟界�ｎ偅鍙忔俊銈咁儐鐎氬綊鎮楃憴鍕缂傚秴锕ら悾鐑芥倻缁涘鏅ｉ梺闈涱煭缁犳垿顢旈崼鏇熲拺闁告捁灏欓崢娑㈡煕鐎ｎ偅宕岄柟铏崌瀹曠螖娴ｅ搫骞嶆俊鐐�栧Λ浣肝涢崟顖氱闁靛牆顦伴悡鐔兼煥濠靛棙顥犵紒鐘靛仧閿熷�燁潐濞叉粓宕伴弽顓滐拷浣肝旀担鐟邦�撶紒鐐緲椤︽壆锟芥艾缍婇弻銊╂偆閸屾稑顏�
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new PSendRedPackView(roleid,modeltype,redpackid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812532;

	public int getType() {
		return 812532;
	}

	public int modeltype; // 红包类型
	public java.lang.String redpackid; // 红包Id  用来处理分页

	public CSendRedPackView() {
		redpackid = "";
	}

	public CSendRedPackView(int _modeltype_, java.lang.String _redpackid_) {
		this.modeltype = _modeltype_;
		this.redpackid = _redpackid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(modeltype);
		_os_.marshal(redpackid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modeltype = _os_.unmarshal_int();
		redpackid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendRedPackView) {
			CSendRedPackView _o_ = (CSendRedPackView)_o1_;
			if (modeltype != _o_.modeltype) return false;
			if (!redpackid.equals(_o_.redpackid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modeltype;
		_h_ += redpackid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modeltype).append(",");
		_sb_.append("T").append(redpackid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


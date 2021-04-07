
package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetPetcolumnInfo__ extends mkio.Protocol { }

/** 客户端请求宠物栏信息
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetPetcolumnInfo extends __CGetPetcolumnInfo__ {
	@Override
	protected void process() {

		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		switch (columnid) {
		case PetColumnTypes.DEPOT:
			if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, roleid))
				return;
		case PetColumnTypes.MARKETPET: // 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磸閿熸垝鐒︾换婵嬪磻閼恒儳娲寸�规洜鍠栭、鏇狅拷锝庡亞閳藉鏌嶇拠鏌ュ弰妤犵偞锚閻ｇ兘宕堕埡鍌滐拷顐︽⒒閸屾瑧鍔嶉悗绗涘懐鐭欓柟瀵稿閹峰嘲顫濋鐔凤拷鎰殽閻愯尙绠婚柟顔界矒閹稿﹥寰勭�ｎ亞銈跺┑锛勫亼閸婃牠骞愭ィ鍐ㄧ９妞ゆ劧绠戝敮闂侀潧顦介崰姘跺船閻㈠憡鍋℃繝濠傚暟瀛濆銈庡幖濞差參宕规ィ鍐ㄧ疀濞达絽鎲￠鍧楁⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? add by liangyanpeng
		case PetColumnTypes.PET:
			final PetColumn petCol = new PetColumn(roleid, columnid, true);
			final SGetPetcolumnInfo send = new SGetPetcolumnInfo();
			send.columnid = columnid;
			send.pets = petCol.getAllProtocolPets();
			send.colunmsize = petCol.getCapacity();
			gnet.link.Onlines.getInstance().send(roleid, send);
			break;
		default:
			break;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788446;

	public int getType() {
		return 788446;
	}

	public int columnid; // 宠物栏id
	public long npckey; // 仓库老板的npckey.

	public CGetPetcolumnInfo() {
	}

	public CGetPetcolumnInfo(int _columnid_, long _npckey_) {
		this.columnid = _columnid_;
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (columnid < 1 || columnid > 2) return false;
		if (npckey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(columnid);
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		columnid = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetPetcolumnInfo) {
			CGetPetcolumnInfo _o_ = (CGetPetcolumnInfo)_o1_;
			if (columnid != _o_.columnid) return false;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += columnid;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(columnid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetPetcolumnInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = columnid - _o_.columnid;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


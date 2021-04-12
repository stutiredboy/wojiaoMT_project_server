
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
		case PetColumnTypes.MARKETPET: // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紭闂佽法鍠愰崹婵嬫倿閿旂偓宕叉繝闈涱儏绾惧鏌ら幁鎺戝姢婵炴彃顕敓鍊燁潐濞叉粓宕伴弽顓滐拷渚�寮撮悪鍛闁挎繂楠告禍鐐烘煃閽樺妯�闁哄苯绉堕幏鐘诲蓟閵夈儱鍙婃俊銈囧Х閸嬬偤鏁嬮梺浼欑悼閸忔ê鐣烽崼鏇炵厸闁稿本绮ｉ幏鐑筋敃閿旇В鎷婚梺绋挎湰閻熝囧礉瀹ュ鍊电紒妤佺☉閹虫劙鎯屽▎鎾寸厵閻庣數顭堥鎾绘煙瀹勬澘妲绘い顐ｇ箞椤㈡﹢鎮㈤崙銈嗗闁归偊鍙庡▓浠嬫煟閹邦垰鐨虹紒鐘差煼閺岀喖顢欓悾宀�鐓夐梺鍦焾閿曘儱顕ラ崟顓ㄦ嫹閿濆簼绨介柕鍫ｆ硾閳规垿鏁嶉崟顐℃澀闂佺锕ラ悧鐘荤嵁閹邦厹鍋呴柛鎰╁妿閿涙瑥顪冮妶鍡楀Ё缂佺姵鍨甸弫顕�姊绘笟锟藉褔藝娴犲绐楁慨妯挎硾閼稿綊鏌ｉ姀鐘冲暈闁稿鍓濈换婵囩節閸屾碍娈堕悗娑欑箓椤啴濡舵惔鈥崇濠电偛妯婇崣鍐ㄧ暦鐟欏嫨鍋呴柛鎰╁妿閻わ拷濠电偠鎻徊浠嬪箟閿熺媭鏁囬柛褎顨嗛埛鎺懨归敐鍫澬撶痪顓炵埣閺屾盯鏁愯箛鏇犳殼濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�? add by liangyanpeng
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


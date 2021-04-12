
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
		case PetColumnTypes.MARKETPET: // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑喘闂備浇娉曢崰鎰板垂濠靛鍊块柨鏃傚亾瀹曞弶绻濋棃娑卞剰缁炬儳顭烽弻銈夊箒閹烘垵濮㈠┑鐐村絻椤曨參鏁撻崐鐕佹綈婵炲弶绮撳畷浼村冀椤撴粣鎷锋笟锟藉鎾偑閸涱喖顏堕梺鎸庣箓妤犲憡绂嶉悙鐑樼厓闁芥ê顦藉Ο锟介梺鍝勮嫰缁夊爼骞忛悩璇茶摕闁靛鍎遍崣濠冧繆閵堝洤啸闁稿鍋ら弫瀣⒑娴兼瑧鎮奸柛蹇斆悾鐑藉醇閺囩偟鍘搁梺绋挎湰缁綁骞忛悜绛嬫晝闁挎棁袙閹峰姊虹粙鎸庢拱闁荤啙鍥х鐎广儱顦伴崐鐢电磼濡や胶鈽夐柟铏姍閹苯鈻庨幘瀵稿幍闁诲海鏁搁…鍫ヮ敁閹剧粯鐓欑�瑰嫭婢樺Σ缁樸亜椤愶絿绠炴い銏★耿閹垽宕欓妶鍡楊伓闂佸綊鍋婇崣搴♀枔娴犲鐓熼柟閭﹀灠閻ㄨ櫣绱掗悩宸吋闁哄瞼鍠栭、娆撴偩瀹�锟介悡澶愭⒑閸︻収鐒鹃柨鏇樺劚椤曘儵宕熼銊﹀闁挎繂绨肩花浠嬫煏閸絾纭鹃柍瑙勫灴閺佸秹宕熼鈩冩線闂備胶顭堥敃銉╂偋閻樿崵宓侀柟閭﹀幑閸嬪懘鏌涢幇鈺佸闁挎稒鐟ラ—鍐Χ閸℃衼缂備胶濮甸崹鐢稿极椤曪拷濮婄粯绗熼敓钘夘焽瑜旇棟濞寸姴顑呯粣妤佹叏濡寧纭鹃柤绋跨秺閺岋綁濮�閻樺啿鏆堥梺绋款儌閸撴繄鎹㈠┑鍥╃瘈闁稿本纰嶅▓鍫曟倵濞戞瑧绠撴い顏勫暣婵¤埖鎯旈垾宕囶啇婵犵數鍋涘Ο濠囧矗閸愩劎鏆﹂悷娆忓閸嬪懘鏌涢幇鈺佸闁汇倧鎷锋繝鐢靛仩閹活亞寰婃禒瀣疅闁跨喓濯弫鍥煕瑜庨〃鍡涘煕閹烘嚚褰掓晲閸粳鎾剁棯椤撶偟鍩ｉ柡灞剧洴閺佹劘绠涢弴鐘虫婵°倗濮烽崑娑氭崲濮楋拷瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�? add by liangyanpeng
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


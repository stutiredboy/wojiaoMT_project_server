
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
		case PetColumnTypes.MARKETPET: // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎娆戝枠闂傚倷娴囧▔鏇㈠窗閹版澘鍨傛繝闈涱儐閸婂潡鏌ㄩ弮鍌氫壕鐎规洖寮剁换婵嬫濞戝崬鍓扮紒鐐劤椤兘寮婚妶澶婄畳闁圭儤鍨垫慨銏犫攽閻愭潙绲绘い鏇ㄥ弮閺佹捇宕愰悤浣圭秷濠电偛寮剁划鎾崇暦娴兼潙鍐�妞ゆ挻绮ｉ幏閿嬬瑹閿熻棄顕ｉ幘顔藉亼闁告侗鍠栭鍫曟⒑閹稿海绠撳Δ鐘叉啞缁傚秹鎮欓悜妯煎帗闂佽姤锚椤﹁棄螣閿熶粙姊洪崫鍕缂佸鐖奸獮蹇涙偐鐠囪尪鎽曢梺闈涱槶閸庨亶宕ｆ繝鍐х箚闁靛牆娲ゅ暩闂佺顑囬崑銈夊极鐎ｎ喗鈷戝ù鍏肩懅閹ジ鏌涜箛鏂嗩亪鎮鹃悜钘夐唶闁哄洨鍋熼崢鎼佹⒑缁嬫寧婀扮紒顕嗙秮楠炲繘鎮滅粵瀣櫇闂佹寧妫佽闁瑰嘲顭峰铏圭矙閹稿孩鎷遍梺鑽ゅ暀閸パ咁槷閻庡箍鍎遍ˇ浼村磹閻㈢數纾兼俊銈勮兌閳藉鏌熼搹顐㈠闁诡垰鑻埢搴ㄥ箻鐎电骞嶉梺璇叉捣閺佹悂鈥﹂崼銉晛闁瑰墽绮悡娆戯拷鐟板濠㈡ê危缂佹ǜ浜滄い鎰剁悼缁犵偞銇勯姀鈽呰�块柟顔哄灲瀹曟瑩濡堕崱妤婁紦闂備礁缍婇崑濠囧矗鎼粹檧鏋斿ù鐘差儐閻撶喖鏌熼柇锕�鐏犻柣銊ㄦ缁辨帡鎮╁顔惧悑闂佸搫鐬奸崰鏍�佸▎鎾村仼鐎癸拷閿熶粙鎮℃径鎰拺闁革富鍙庨悞楣冩煥閺囨ê鍔氭い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓缁ㄨ偐鑺辨禒瀣厪闁割偓绲剧涵楣冩煃鐟欏嫬鐏撮柡浣哥Ч瀹曠喖顢曢埄鍐╃窔闂傚倷鑳堕…鍫ユ晝閵夆晜鍋嬮柣妯垮吹瀹撲線鏌熼柇锕�骞戦柛瀣嚇閺屾盯骞囬埡浣割瀷闂佹寧绋掗悷銉┾�旈崘顔嘉ч柛鈩冾殔琛肩紓鍌欒兌婵敻宕归悽绋挎瀬妞ゆ洩鎷锋慨濠勭帛缁楃喖鏁撻挊澶樼劷鐟滄棁妫熸繛瀵稿Т椤戝懐绮ｅΔ浣瑰弿婵☆垱瀵х涵楣冩煠缁嬭法绉洪柡宀嬬秮婵拷闁绘ê鍟块弳鍫ユ⒑缁嬫鍎岄柛鎾寸箘閹广垹鈹戦崶鈺冪槇闂佺鏈喊宥呪枔閸洘鍊垫繛鎴炵懅缁犳挻銇勯鍕殻濠德ゅ煐閹棃鍨惧畷鍥跺晣濠电姷鏁搁崑娑樜熸繝鍥х煑闁告劑鍔庨弳锕傛偡濞嗗繐顏ラ柛瀣嚇閺屾盯骞囬埡浣割瀷闂佹眹鍊ч幏閿嬬節閻㈤潧浠╅柟娲讳簽瀵板﹥绂掔�ｎ亞鐤呴梺璺ㄥ枔婵參寮崶顒佺厱鐟滃酣銆冮崱娑樼厱闁圭儤鍤氳ぐ鎺撴櫜闁割偅绮抽幘鍓佹／妞ゆ挾鍋熼崺锝夋煛鐏炲墽娲撮柡浣瑰姌缁犳盯寮撮悩铏啌濠德板�楁慨鐑藉磻濞戞碍宕叉慨妤嬫嫹鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�? add by liangyanpeng
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


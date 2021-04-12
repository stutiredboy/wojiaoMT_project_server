
package fire.pb.battle.livedie;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleRankView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleRankView extends __CLiveDieBattleRankView__ {
	@Override
	protected void process() {
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑韬鐐插暣閸╁嫰宕橀埡浣稿Τ闂備焦瀵х换鍌毼涘▎鎾崇獥闁哄稁鍘介埛鎺懨归敐鍕劅闁绘帞鍋撻妵鍕箣濠靛棙娈婚悗瑙勬礃缁诲牓鐛�ｎ喗鏅濋柨鐔剁矙閹锋垿鎮㈤崗鑲╁弳濠电娀娼уΛ顓炍ｉ崨濠佺箚妞ゆ劧缍囬懓鍧楁煛鐏炲墽娲撮柍銉畵楠炲鈹戦崶鈺佽拫濠电姷顣藉Σ鍛村磻閸曨垱鍎楅柛灞惧嚬濞兼牗绻涘顔荤盎鐎瑰憡绻傞埞鎴︽偐閹绘帗娈堕梺鍛娒肩划娆忣潖閾忓湱鐭欓柟绋垮瀹曟娊姊烘潪鐗堢グ妞ゆ泦鍥舵晪闁挎繂妫涚弧锟藉┑顔斤供閸樺吋绂嶅鍫熲拺缂備焦顭堟竟姗�鏌ｆ幊閸斿酣鏁撻懞銉や孩妞ゎ偄顦遍幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕抽敐澶嬧拺閻犳亽鍔岄弸鏃堟煛閸滀礁浜扮�规洘鍨挎俊鑸靛緞鐏炵晫銈﹂梺璇插嚱缂嶅棝宕板Δ鍛；闁规壆澧楅悡锝夌叓閸ラ鍒板ù婊勭箖閵囧嫰寮幐搴℃灎濠殿喖锕︾划顖炲箯閸涱垳椹抽悗锝庡亞缁夌兘鏌ｆ惔銈庢綈婵炲弶锕㈤弫鍐閻樺灚娈惧┑鐐叉▕娴滄粓宕橀敓钘夘渻閵堝棙灏甸柛瀣枛閺佸秴鈽夊Ο閿嬫杸闂佸疇妫勫Λ妤呮倶閿濆鐓忛柛鈩冾殢閸庢梹顨ラ悙鑼闁诡喗绮撻幊鐐哄Ψ閵夈儱顥堥梻鍌欑閹诧紕绮欓幋锔芥櫇闁靛牆顦介弫鍌炴煕椤愶絾绀冮柍閿嬪笒闇夐柨婵嗙墕琚氱紒缁㈠幖閻栧ジ寮诲☉銏″亹闁肩⒈鍎烽妶澶嬬厱闁圭儤鎸哥粭鎺楁煃鐠囧弶鍞夌紒鐘崇洴閺佹劙宕ㄩ鍛偑闂傚倸鍊风粈渚�骞栭銈嗗仏妞ゆ劧绠戠壕鎸庣箾瀹割喕绨婚柡瀣╃窔閺屾盯骞囬棃娑欑亶闂佺粯鎸堕崕鐢稿蓟閿熺姴绀冮柕濞垮劵閹烽攱绻濆顒傤啈闂佺鏈粙鎰崲閸℃ǜ浜滈柟浼存涧婢ь垶鎮楀鐐?
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new PLiveDieBattleRankView(roleid, modeltype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793842;

	public int getType() {
		return 793842;
	}

	public int modeltype; // 类型

	public CLiveDieBattleRankView() {
	}

	public CLiveDieBattleRankView(int _modeltype_) {
		this.modeltype = _modeltype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(modeltype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modeltype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleRankView) {
			CLiveDieBattleRankView _o_ = (CLiveDieBattleRankView)_o1_;
			if (modeltype != _o_.modeltype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modeltype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modeltype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveDieBattleRankView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = modeltype - _o_.modeltype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


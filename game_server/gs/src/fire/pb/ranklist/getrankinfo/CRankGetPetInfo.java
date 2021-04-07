
package fire.pb.ranklist.getrankinfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRankGetPetInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚娼栨繛宸憾閺佸棝鏌ㄩ悢鐑樻珪缂侇喗姊婚敓浠嬫涧閹芥粍绋夊澶嬬厵闁诡垱婢樿闂佺粯鎸婚悷鈺呭蓟閿濆绠ｉ柣鎰閸ㄨ泛顕ラ崟顖氱妞ゆ牗绋撻崢鎼佹⒑鐠恒劌鏋嶇紒顔界懇楠炲﹪鎮欓崫鍕庛劑鏌ㄩ弴顏呭閻庢鍠栧鈥愁潖濞差亜鎹舵い鎾跺仜婵℃椽姊虹憴鍕�愮紒鐘崇墵楠炲棛浠﹂崜褏鐦堥梺鎼炲劘閸斿酣宕㈡禒瀣拺闂傚牊绋撴晶鏇㈡煙閸愯尙绠荤�规洘婢橀～婊堟晸娴犲钃熼柣鏃傗拡閺佸﹪鏌曟繛鍨姕闁瑰吋鍔欓弻锝夊箻鐎靛憡鍒涢梺鍝勬湰缁嬫挻绂掗敃鍌氱鐟滃顬婇妸銉富闁靛牆妫欓悡銉х磼婢跺本鍤�妞ゎ偄绻愮叅妞ゅ繐鎳庨崜顒勬⒑閸涘﹦鈽夐柨鏇樺�濋、鏃堟晸閿燂拷?
 * @author changhao
 *
 */
public class CRankGetPetInfo extends __CRankGetPetInfo__ {
	@Override
	protected void process() {
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if(infotype == 1){
			new PGetPetData(-1,roleId,roleid, 0).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810258;

	public int getType() {
		return 810258;
	}

	public int roleid; // 角色Id
	public int infotype; // 1=宠物

	public CRankGetPetInfo() {
	}

	public CRankGetPetInfo(int _roleid_, int _infotype_) {
		this.roleid = _roleid_;
		this.infotype = _infotype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(infotype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_int();
		infotype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRankGetPetInfo) {
			CRankGetPetInfo _o_ = (CRankGetPetInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (infotype != _o_.infotype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += roleid;
		_h_ += infotype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(infotype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRankGetPetInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = roleid - _o_.roleid;
		if (0 != _c_) return _c_;
		_c_ = infotype - _o_.infotype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSetFormation__ extends mkio.Protocol { }

/** - 光环相关   start
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠抽柨鐔凤拷鐕佹綈婵炲弶鐗曠叅闁靛ň鏅滈崕妤呮煕閳╁喚妯呯憸鐗堝笚閺呮煡鏌涢顐簼缂傚秴鐗嗛埞鎴︽倷閸欏娅ф繝娈垮枟閹稿啿锕㈡笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楁煙閹殿喖顣奸柣鎾存礋閹鏁愰崨顓熷�庨梻渚囧弾閸ㄥ爼寮婚敍鍕勃闁告挆鍕灡闂備胶纭堕弲娑氾拷姘緲閻ｅ嘲顫滈敓浠嬨�侀弮锟介幏鍛嫚閳╁啰绉剧紓鍌氬�搁崐鎼佸磹妞嬪孩顐介柕鍫濐槸缁狀垶鏌ｉ幋锝呅撻柣鎾存礋閹﹢鎮欓弶鎴濆Б闂佹悶鍊ら崜鐔煎蓟閿濆妫橀柟绋垮瘨濡箓姊虹拠鈥虫灓闁硅櫕鎸鹃崣鍛渻閵堝懐绠版俊顐ｇ〒缁絽螖閸涱喚鍘介柟鍏肩暘閸ㄥ銆傞幓鎺濈唵闁荤喓澧楅ˉ鐘充繆閸欏濮嶆鐐村笒铻栧ù锝夋櫜閺夘參姊绘担鍛婂暈濞撴碍顨婂畷浼村冀椤撗勬櫆闂佽法鍣﹂幏锟�
 * @author changhao
 *
 */
public class CRequestSetFormation extends __CRequestSetFormation__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleId > 0){
			new PSetFormationProc(roleId, formation).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794464;

	public int getType() {
		return 794464;
	}

	public int formation;

	public CRequestSetFormation() {
	}

	public CRequestSetFormation(int _formation_) {
		this.formation = _formation_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(formation);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		formation = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSetFormation) {
			CRequestSetFormation _o_ = (CRequestSetFormation)_o1_;
			if (formation != _o_.formation) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += formation;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(formation).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSetFormation _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = formation - _o_.formation;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


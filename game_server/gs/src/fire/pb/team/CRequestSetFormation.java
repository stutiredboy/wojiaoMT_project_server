
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犳娊鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閻楁洜鍙呴梺闈浥堥弲婊堝磿濡ゅ懏鐓曢柍鈺佸枤濡懐鎲搁悧鍫濈瑲闁哄懏鐓￠弻娑㈩敃椤愵澀绨肩紓鍌氱Т閻楀棝鍩為幋锔藉�烽柛娆忣槸濞呇勭節濞堝灝鏋熼柟绋垮暱閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滄粏鐏掓繝鐢靛Т濞层倗澹曢崸妤佺厵闁规鍠栭。濂告煟閹惧瓨绀嬮柟顔筋殜閺佹劙宕ㄩ鐔凤拷搴ㄦ⒒娓氬洤寮鹃柛銊ョ埣瀵鏁嶉崟顏呭媰闂佸憡鎸嗛崟顐㈢仭闂傚倷鑳剁涵鍫曞疾濞戞熬鎷峰顓熺凡闁伙絽鍢查～婊堟晸娴犲锟戒線寮敓浠嬪箯閸涱垱瀚氶柍鈺佸暟缁夊墽绱撻崒姘拷鎼佸磹閹间礁纾瑰瀣椤愪粙鏌曢崼婵愭Ц缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煟閹惧瓨绀嬮柟顔斤耿閹瑩寮堕幋婵喰戦梻浣规偠閸娿倝宕滈悢鐓庤摕闁挎繂顦Λ姗�鏌熺粙鍨槰婵☆偓绠撳铏规嫚閳ヨ櫕鐏撻梺纭呮珪閹搁箖宕ｉ崨顓ф富闁靛牆鎳愮粻鐗堜繆椤愶絿銆掔紒顕嗙到铻栭柛娑卞枤閸樹粙鏌熼崗鑲╂殬闁搞劌顭烽妴鍌炲箵閹烘繄鍞甸梺鑽ゅ枔婢ф藟閻樺厖绻嗛柛娆忣槸婵秵顨ラ悙鏉戠瑨閾绘牕霉閿濆娅滈柡澶樺弮濮婄粯鎷呴崨濠傛殘婵炴挻纰嶉〃濠傜暦娴兼潙鍐�妞ゆ挆鍕珕闂備浇娉曢崳锕傚箯閿燂拷
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


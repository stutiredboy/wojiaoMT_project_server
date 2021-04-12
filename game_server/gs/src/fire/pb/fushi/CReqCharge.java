
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqCharge__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂妫涚弧锟介梺闈涢獜缁辨洜绮婚幘鍓佺＝鐎广儱鎷戝銉╂煟閿濆懎妲婚摶鏍煕濞戝崬骞樻い蟻鍥ㄢ拺闁稿繗鍋愰妶鎾煛閸涱喚绠為柛鈹垮灱缁犳盯寮撮悩纰夌闯闂備胶顭堥張顒勬偡瑜忕划浣冪疀濞戞瑧鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厸閻忕偛澧介埥澶愭煟閿濆棛绠為柡浣规尰缁傛帞锟斤綆浜為敍娑㈡⒑缂佹ê濮夐柛搴涘�濆畷鎴﹀磼閻愬鍘搁梺鎼炲劗閺呮盯寮搁弮鍌滅＜闁绘宕甸悾娲煛瀹�锟介崰鎰焽韫囨稑绀堢憸蹇氭懌闂傚倷鑳剁划顖滄崲瀹ュ棛顩叉い蹇撶墕缁犳牗淇婇妶蹇斿濡炪値鍋呯换鍫ュ箖濞嗘搩鏁嗛柨鐔剁矙椤㈡棃鏁撻敓锟�??
 * @author changhao
 *
 */
public class CReqCharge extends __CReqCharge__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new PReqPay(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812454;

	public int getType() {
		return 812454;
	}


	public CReqCharge() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqCharge) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqCharge _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


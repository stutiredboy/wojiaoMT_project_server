
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestStopTeamMatch__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂妫涚弧锟介梺闈涢獜缁辨洜绮婚幘鍓佺＝鐎广儱鎷戝銉╂煟閿濆懎妲婚摶鏍煕濞戝崬骞樻い蟻鍥ㄢ拺闁稿繗鍋愰妶鎾煛閸涱喚绠為柛鈹垮灱缁犳盯寮撮悩纰夌闯濠电偠鎻徊鍧楀箠閹捐绀夐柕鍫濇媼閻斿棛鎲歌箛娑樼柧妞ゆ劧绠戠粈鍡涙煙閻戞﹩娈㈤柡浣哥У缁绘繃绻濋崒姘间患闁瑰吋娼欓敃銈夊煘閹达附鍋愮紓浣股戦柨顓炩攽閻愯尙婀撮柛鏂块椤曪綀顦归柡浣规尰缁傛帞锟斤綆鍋�閹疯櫣绱撴担鍓插剱閻庣瑳鍐胯�垮ù鐓庣摠閻撴洟鏌熸潏鍓хУ婵炲吋鍔欓幃妤呮偨闂堟稑浠橀梺浼欑稻缁诲牆鐣烽悢纰辨晞闁兼亽鍎遍褰掓⒒閸屾瑧顦﹂柟璇х磿缁瑩骞嬮敂鑺ユ珖闂侀潧顦崕鎶藉汲閿旀拝鎷烽惂鍛婂闂佽法鍠撻弲顐⑽ｉ幇鏉跨婵°倓绀佹禍褰掓倵鐟欏嫭绀�婵炲眰鍊濋崺娑樼暆閸曨剙锟藉灚绻涢崼婵堜虎闁哄闄勯妵鍕即閸℃鎼愰柣鎾拷鎰佺唵闁兼悂娼ф慨鍥ㄣ亜椤愩垺鍤囬柡宀嬬到铻ｉ悹鍥皺缁佺兘姊烘潪浼存闁稿﹥绻堝濠氭晲婢跺浜滈梺鍛婄缚閸庢娊鎮￠敓鐣岀磽閸屾瑨鍏岀紒顕呭灣閺侇噣鎮欓崫鍕槴闂佸湱鍎ら〃鍛涘Ο璁崇箚妞ゆ劑鍨绘禒娑欎繆閻愭壆鐭欓柕鍡曠窔瀵噣宕煎┑鍡欑崺婵＄偑鍊栭悧妤呮嚌閸撗呬笉闁绘劖绁撮弨浠嬫煟濡澧柛鐔风箻閺屾盯鎮╅幇浣圭杹闂侀潧妫楅崯鏉戠暦閵娧嶆嫹濞戞顏呯鏉堛劎绡�闁汇垽娼у瓭闁诲孩纰嶉幃鍌炵嵁韫囨挾鏆嬮梺顓ㄩ檮閸嶇敻姊虹紒妯哄Е闁告挻鐟╅、鏃堟晸閿燂拷
 * @author changhao
 *
 */
public class CRequestStopTeamMatch extends __CRequestStopTeamMatch__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requeststopteammatch = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{								
				TeamManager.getInstance().delTeamMatchAsyn(roleid);
			
				return true;
			}		
		};
		requeststopteammatch.submit();			
	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794496;

	public int getType() {
		return 794496;
	}


	public CRequestStopTeamMatch() {
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
		if (_o1_ instanceof CRequestStopTeamMatch) {
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

	public int compareTo(CRequestStopTeamMatch _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


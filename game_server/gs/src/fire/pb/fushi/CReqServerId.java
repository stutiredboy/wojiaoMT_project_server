
package fire.pb.fushi;

import gnet.link.Onlines;
import fire.pb.main.ConfigManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqServerId__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂妫涚弧锟介梺闈涢獜缁辨洜绮婚幘鍓佺＝鐎广儱鎷戝銉╂煟閿濆懎妲婚摶鏍煕濞戝崬骞樻い蟻鍥ㄢ拺闁稿繗鍋愰妶鎾煛閸涱喚绠為柛鈹垮灱缁犳稑鈽夊▎灞惧闂佽崵濮村ú锕併亹閸愵噮鏁嗛柕蹇嬪�栭悡鐘垫喐閻楀牆绗ч柣锝嗘そ閹稿﹤鈹戠�ｎ偀鎷哄銈嗗釜閹烽绱掓径灞炬毈鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮繝纰樻閸垳鎷冮敃锟藉嵄婵炲樊浜濋悡鐔兼煥濠靛棝顎楃�殿噮鍣ｉ弻锛勪沪閸撗�妾ㄩ梺璇″灡濡啯淇婇幖浣肝ч柛鈩冾殕閻忔挸鈹戞幊閸婃鎱ㄩ悜钘夌；婵炴垯鍨洪弲婵嬫煏婢跺棙娅呯紒鐘冲哺閺岋繝宕橀妸褍顣甸梺璺ㄥ枑閺嬭崵绮婚幘鑽ゅ祦闁圭儤顨呯猾宥夋煕鐏炵虎娈曢柨娑樼墦濮婂宕掑顒婃嫹妞嬪孩顐芥慨姗嗗墻閻掔晫鎲搁弮鍫濈畺鐟滄柨鐣烽崡鐏诲綊寮堕幐搴☆槱闁诲簼绲婚崑鎰版晸閼恒儳鈾侀柨姘瑰鍕垫疁婵﹥妞藉畷顐﹀礋椤掞拷閸嬪秹姊洪幖鐐插婵＄偘绮欓獮鍐晸閻樺弬銊╂煥閺傚灝鈷旈柣锕�鐗撳濠氬磼濮樺崬顤�缂備礁顑嗙敮陇妫㈠┑鐘诧工閻楀﹪鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦悹鍥ｏ拷铏亪闂佺锕ラ幃鍌炪�佸鑸垫櫜濠㈣泛锕ㄩ幗鏇㈡⒑闂堟侗妾х紒鐘冲灴瀹曟粓顢氶敓钘夘潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�
 * @author changhao
 *
 */
public class CReqServerId extends __CReqServerId__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid > 0){
			SRspServerId send = new SRspServerId();
			send.serverid = ConfigManager.getGsZoneId();
			send.flag = flag;
			Onlines.getInstance().send(roleid, send);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812472;

	public int getType() {
		return 812472;
	}

	public int flag;

	public CReqServerId() {
	}

	public CReqServerId(int _flag_) {
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		flag = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqServerId) {
			CReqServerId _o_ = (CReqServerId)_o1_;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqServerId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.msp.move;

import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddPowerRestore__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddPowerRestore extends __GAddPowerRestore__ {
	@Override
	protected void process() {
		// protocol handle
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role == null)
		{
			fire.pb.scene.SceneManager.logger.error("GAddPowerRestore闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柍鈺佸暞閻濇牠姊绘担鑺ョ《闁哥姴绉堕崚鎺戔枎閹惧磭鐣洪梺绉嗗嫷娈㈤柡浣割儔閺屻劑鎮㈤崜浣虹厯閻庢鍠栭…鐑藉箖閵忋倖鍋傞幖杈剧秵濡茶泛鈹戦悙鑸靛涧缂佹彃娼″畷鏇㈠Χ婢跺﹦鐤呭┑顔筋殣閹烽攱鎱ㄦ繝鍕妺婵炵⒈浜獮宥夘敋閸涱啩婊堟⒒娴ｇ懓顕滄繛璇ч檮缁傚秹顢旈崟闈涙婵犵數濮电喊宥夊磻閸曨垱鐓曢煫鍥ㄨ壘娴滃綊鏌涢弮鍌氬幋婵﹥妞介獮鎰償閵忊懇鏁嶉梻浣哥秺椤ユ捇宕楀锟藉濠氭晬閸曡埖瀚归柨婵嗛婢ь噣鏌＄�ｎ偄鐏撮柡灞炬礋瀹曟儼顦叉い蹇ｅ幗閵囧嫰濮�閳╁啰顦伴梺杞扮劍閸旀瑥鐣烽崡鐐╂瀻婵☆垱浜堕悙鐢电＝闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗楃划宥呯暦閺屻儲鐓曟い鎰剁悼缁犮儵鏌涢妶鍡樼闁哄瞼鍠撶槐鎺楀閻樺磭浜堕梻浣侯焾椤戝棝宕归崸妤�钃熼柕濞炬櫆閸嬪嫮绱撴担鐧镐緵婵☆偄瀚伴弻褔鎳￠妶鍛闂佸搫澶囬崜婵嗩嚗閸曨叏鎷烽敐搴′簼闁哄棗绻愰埞鎴︽偐閸偅姣勬繝娈垮枤閸忔ê顕ｉ锕�宸濆┑鐘插暙瀵潡姊虹紒妯虹伇婵☆偄瀚板鍛婄瑹閿熶粙寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓閺嶁�斥攽閻橆喖鐏い顓炵墦閹﹢宕橀瑙ｆ嫼闂佸湱顭堝ù椋庣不閹剧粯鐓欓柛鎰叀閸欏嫮锟芥鍠楁繛濠囧箖濞嗘挻鍊绘俊顖滃帶楠炲牓姊虹涵鍛棈闁规椿浜炲Σ鎰板即閻斿憡鐝￠梻鍌氬�风粈渚�骞栭锔藉剹濠㈣泛鐬肩粈濠偯归敐鍛棌闁搞倖娲栭湁闁绘ê妯婇崕蹇涘箚閻斿吋鈷戦梻鍫熶緱濡狙囨⒒閸曨偄顏╅柍缁樻崌閵嗗倿骞掑Δ浣叉嫽闂佺鏈懝楣冩晸閼恒儲鍊愮�规洘鍔欓獮鏍ㄦ媴閸濄儻绱梻浣哥秺濡法绮堟担鍝勵棜鐟滅増甯楅悡鐔兼煙鏉堝墽鍒扮悮姘舵⒑缁嬪尅宸ユ繛纭风節瀵濡搁埡浣虹潉闂佽法鍠嶇划娆撶嵁韫囨挴鏀介悗锝庝簽椤斿棙淇婇悙宸剰婵炴挳顥撶划濠氬籍閿熺晫鎹㈠☉銏犵闁绘劕妫欓崹鍨暦閾忣偆顩烽悗锝庡亞閸樿棄顪冮妶鍡樺暗闁哥姵鎹囬獮濠囧炊椤掍胶鍘搁悗鐧告嫹闁跨喍绮欏畷浼村箛椤掑鍔烽棅顐㈡处缁嬫垹绮诲杈ㄥ枑闊洦鎷归敐澶嬫櫜濠㈣泛顑傞幏娲煛婢跺苯浠﹀鐟版钘濋柨鏇炲�归悡銉╂煛閸ャ儱濡洪梺顓у灣閿熻姤顔栭崰鏍�﹂悜钘夌畺闁靛繈鍊栭崑鍌炲箹鏉堝墽绉甸柛鐐扮矙濮婄粯鎷呴崨濠呯闂佺绨洪崐婵嗙暦瑜版帒鍨傛い鎰剁到瀵法绱撴笟濠勭？妞ゆ帇鍏�=" + roleid);
			return;
		}
		if(role.getJumpRole() == null)
			return;
		if(powerrestore > 0)
			role.getJumpRole().setPowerRestore(powerrestore);
		else
			role.getJumpRole().setPowerRestore(0);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724930;

	public int getType() {
		return 724930;
	}

	public long roleid;
	public int powerrestore; // 如果为-1，则为直接清除气力储备

	public GAddPowerRestore() {
	}

	public GAddPowerRestore(long _roleid_, int _powerrestore_) {
		this.roleid = _roleid_;
		this.powerrestore = _powerrestore_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(powerrestore);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		powerrestore = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddPowerRestore) {
			GAddPowerRestore _o_ = (GAddPowerRestore)_o1_;
			if (roleid != _o_.roleid) return false;
			if (powerrestore != _o_.powerrestore) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += powerrestore;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(powerrestore).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddPowerRestore _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = powerrestore - _o_.powerrestore;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


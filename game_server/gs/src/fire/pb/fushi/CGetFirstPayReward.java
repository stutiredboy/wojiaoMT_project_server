
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetFirstPayReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤绻堥獮濠傗攽鐎ｎ亞顓煎銈嗘閸嬫劖鏅堕姘ｆ斀闁绘劘灏欓幗鐘电磼椤旇偐鐏辩紒杈╁仦缁绘繈宕惰閹芥洖鈹戦悙鏉戠仧闁搞劎鎳撻弫顔戒繆閻愵亜锟芥牕顫忚ぐ鎺戠？鐎规洖娲﹂弳婊堟煏婵炑冩噽閿涙繃绻涙潏鍓у缂侇喗鐟╁畷顐︽倻濡湱绠氬銈嗗姂閸ㄥ綊寮抽敐鍥锋嫹濞堝灝鏋涙い顓犲厴瀹曞綊骞嗚閺嗭箓鏌涢妷锝呭妞ゆ梹鎸绘穱濠囨倷椤忓嫸鎷烽弽褜娼栧┑鐘宠壘閸屻劎鎲搁弬娆惧殨闁规儼濮ら崐鐑芥倵濞戞顏勵嚕閸ф鈷戦柟绋挎捣缁犳挻淇婇锝庢畷闁逛究鍔戝畷濂稿閵忣澁绱茬紓鍌氬�烽悞锕傗�﹂崶鈺冧笉闁绘劗绻濈换鍡樸亜閹扳晛鐏╅柡鍡樼懇閺屽秹鎸婃径妯恍﹀銈庡亝缁挸鐣锋總鍛婂亜濠靛倸顦槐锕傛⒑閼姐倕鏋戠紒顔煎閺呰泛螖閸愨晜娈板┑掳鍊曢幊搴ｅ婵犳碍鍊甸柨婵嗛閺嬬喖鏌ｉ幘瀵告创闁哄本鐩俊鐑藉閳╁啰褰呴梻浣告惈椤戝棝宕归崸妤�钃熸繛鎴炃氶弸搴ㄧ叓閸ャ劍绀堟い鏃�甯″娲传閸曨噮娼堕梺鍛婃⒐閸ㄥ潡鐛崘顔嘉у璺猴功閿涙粌鈹戦悙鏉戠仸闁挎洍鏅滅�靛ジ鏁撻敓锟�
 * @author changhao
 *
 */
public class CGetFirstPayReward extends __CGetFirstPayReward__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new PGrabFirstPayAward(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812462;

	public int getType() {
		return 812462;
	}


	public CGetFirstPayReward() {
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
		if (_o1_ instanceof CGetFirstPayReward) {
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

	public int compareTo(CGetFirstPayReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


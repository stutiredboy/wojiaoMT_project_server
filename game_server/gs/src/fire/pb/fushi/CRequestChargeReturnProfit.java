
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestChargeReturnProfit__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涢弴鐘碉紳闂佺鏈悷褏绮佃箛娑欑厵濡炲楠搁崢鎾煛鐏炲墽鈽夐柣锝嗙箞閺佹挻绂掔�ｎ亞锛涢梺缁樺姉閸庛倝宕戦崒鐐寸厸闁搞儮鏅涢弸鏃傜磼閻樿崵鐣洪柡宀�鍠愬蹇涘礈瑜忚摫闂備胶绮换宥嗙椤忓牆绠栨俊銈忔嫹妞ゎ偅绻堥幃娆擃敆閿熶粙顢旈敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞闁靛ě鍛獎闂備礁澹婇崑渚�宕曢懡銈囩闁哄诞宀�鍞甸柣鐘烘〃鐠�锕傚磿閹达附鐓熸繝闈涙閸╋綁鏌＄仦鍓ф创闁糕晛瀚板畷姗�顢旈崨顓熺彯婵犵數鍋為崹鍫曞箰閸濄儳鐭撶憸鐗堝笒閽冪喖鏌ㄥ☉妯侯仹婵炲矈浜幃褰掑炊閵娿儳绁锋繝娈垮枟濞茬喎顫忛搹鍦＜婵☆垵顕ч棄宥呪攽閻愯泛鐨洪柛鐘崇墪椤曪絾绻濆顑┾晠鏌嶉崫鍕拷鍛婄閻愮儤鈷戠紒瀣濠�鎵磼鐎ｎ偄鐏存い銏℃閺佹捇鏁撻敓锟�?
 * @author changhao
 *
 */
public class CRequestChargeReturnProfit extends __CRequestChargeReturnProfit__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);		
		if (roleid < 0)
			return;
		new PChargeReturnProfit(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812479;

	public int getType() {
		return 812479;
	}


	public CRequestChargeReturnProfit() {
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
		if (_o1_ instanceof CRequestChargeReturnProfit) {
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

	public int compareTo(CRequestChargeReturnProfit _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.item;
import com.locojoy.base.Octets;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetItemTips extends __CGetItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		ItemMaps bag = Module.getInstance().getItemMaps(roleId, packid, true);
		if (bag == null)
			return;
		final ItemBase item = bag.getItem(keyinpack);
		if (item == null) {
			return;
		}		

		Octets tips = item.getTips();
		if (tips == null) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵噣鏁撴禒瀣婵犻潧顑呯粻顖氼渻鐎ｎ亝鎹ｇ紒鐘虫⒐缁绘盯骞嬮悙鍡樺灦瀵板嫰宕熼娑氬幈闁诲函绲芥晶搴ｅ姬閿熶粙姊洪崫鍕拱婵炲弶顭囬幑銏犫槈閵忊�筹拷閿嬨亜閹哄秷鍏岀憸鎵枛濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤绗熼敓浠嬨�侀弽銊ョ窞闁归偊鍓濋幗鏇㈡⒑閸濆嫭鍌ㄩ柛銊ョ秺閺屽宕堕妸褏鐦堥梺鍓茬厛閸嬪嫭鎱ㄩ崼銉ユ瀬闁割偁鍎查埛鎺懨归敐鍕劅闁绘帗鍎宠灃闁绘ê寮堕幉鍝ョ磼椤旇姤顥嗛柕鍥ㄥ姍楠炴帡骞嬮敐鍡樺暫濠电姷鏁搁崑鐐哄垂椤栫偛鍨傞柛锔诲幘娑撳秴鈹戦悩宕囶暡闁绘搫缍侀悡顐﹀炊妞嬪骸鍩屾繛瀛樼矆缁瑩寮婚妸鈺傚亜缂備焦锕╁Λ鍕攽閻愯泛浜归柡鍜冪秮濮婂宕掑顒婃嫹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆鐓ラ柡鍐ㄥ�瑰▍鏇㈡煕濞嗗繑顥㈡慨濠呮缁辨帒螣閼姐値妲梻浣侯焾閿曘倕锕㈤柆宥嗘櫢闁兼亽鍎抽崯鏌ユ煙閸戙倖瀚�,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�缁埖淇婂Δ锟介幊搴ㄥ煘閹达附鍊烽柡澶嬪灩娴犙囨⒑閹肩偛濡肩紓宥咃躬楠炲啴宕稿Δ浣革拷閿嬨亜閹烘垵锟藉顢欓弴銏♀拺闁荤喐澹嗛幗鐘绘煟閻旀潙鍔﹂柟顔斤耿閸╋繝宕橀鍡床闂備胶绮敋鐎殿喖澧庨幏褰掓晸閻樺磭鍘甸梺鍛婄懃椤︿即宕愰幇顕嗘嫹濞堝灝娅橀柛鎾寸洴楠炴垿宕熼姣尖晠鏌ㄩ弮鍌滄憘闁哥喎閰ｅ濠氬磼濞嗘劗銈板┑鐐差槹濞茬喎鐣烽幎鑺ユ櫇闁稿本姘ㄩ鍡涙⒑鐠恒劌娅愰柟鍑ゆ嫹?:" + item.getName());
			return;
		}
				
		SGetItemTips send = new SGetItemTips(packid, keyinpack, tips);
		gnet.link.Onlines.getInstance().sendResponse(this, send);
		
		if(item instanceof EquipItem)
		{
			PEnhancementTimeout p = new PEnhancementTimeout(roleId);
			p.submit();				
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787453;

	public int getType() {
		return 787453;
	}

	public int packid;
	public int keyinpack;

	public CGetItemTips() {
	}

	public CGetItemTips(int _packid_, int _keyinpack_) {
		this.packid = _packid_;
		this.keyinpack = _keyinpack_;
	}

	public final boolean _validator_() {
		if (packid < 1) return false;
		if (keyinpack < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(packid);
		_os_.marshal(keyinpack);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		packid = _os_.unmarshal_int();
		keyinpack = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetItemTips) {
			CGetItemTips _o_ = (CGetItemTips)_o1_;
			if (packid != _o_.packid) return false;
			if (keyinpack != _o_.keyinpack) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += packid;
		_h_ += keyinpack;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(packid).append(",");
		_sb_.append(keyinpack).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = packid - _o_.packid;
		if (0 != _c_) return _c_;
		_c_ = keyinpack - _o_.keyinpack;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


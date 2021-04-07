
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COpenItemBag__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛濠呭煐閹便劌螣閹稿海銆愮紓浣哄С閸楁娊寮诲☉妯锋斀闁告洦鍋勬慨鏇烆渻閵堝骸浜濇繛鑼枛瀵鎮㈤崨濠勭Ф婵°倧绲介崯顖烆敁瀹ュ鈷戠紓浣姑粭鎺楁煏閸喐鍊愮�殿喖顭烽幃銏ゆ偂鎼达絿鏆伴柣鐔哥矊缁夌懓顕ｉ搹顐ｇ秶闁冲搫顑嗙�氬綊鏌ｉ姀銈嗘锭妞わ絽鍚嬫穱濠囶敃閵忕姵娈婚悗娈垮枛椤攱淇婇懜闈涚窞濠电姴瀚峰Σ浼存⒒娴ｈ棄顥嶅鐟扮墕閳绘柨鈽夐姀鈺傛櫆濡炪倖鎸堕崹娲偂閻旂厧绠归弶鍫濆⒔缁夌敻鏌￠崱妯肩煉闁哄瞼鍠栧畷娆撳Χ閸℃浼� by changhao
public class COpenItemBag extends __COpenItemBag__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		PEnhancementTimeout p = new PEnhancementTimeout(roleId);
		p.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787655;

	public int getType() {
		return 787655;
	}


	public COpenItemBag() {
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
		if (_o1_ instanceof COpenItemBag) {
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

	public int compareTo(COpenItemBag _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


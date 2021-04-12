
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestStopTeamMatch__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涢弴鐘碉紳婵炶揪绲块幊鎾诲礉閵堝拋鐔嗙憸蹇涘疾椤愶箑绀嗛柟鐑橆殢閺佸秵绻濇繝鍌氼仼閹兼潙锕ら埞鎴︽偐缂佹ɑ閿┑鐐茬湴閸斿骸顕ｈ閺佹挻绂掔�ｎ偀鎷虹紓浣割儐鐎笛冿耿娴煎瓨鐓曢柟杈剧秵濞兼劙鎮楅悽闈涘付闁伙絾绻堝畷鐔碱敄閼恒儱顏归梻鍌欑閹诧紕绮欓幋锔芥櫇闁靛鍎抽弳锔撅拷鐧告嫹闁跨喓鏅Σ鎰板箳濡や礁浜归悗瑙勬礀濞层倝鍩涘畝鍕�垫繛鍫濈仢閺嬶附銇勯弴鍡楁搐閻撯�愁熆閼搁潧濮囨い顐㈡嚇閺岋絽螣鐠囪尙绁烽梺杞伴檷閸婃繈寮婚敐澶嬪亜闁告縿鍎抽悡锟界紓鍌欒兌缁垳鏁悙鍝勭闁圭儤顨呭Λ妯讳繆椤愩垻浠涙俊鐐扮矙閵嗕線寮崼婵嗙獩濡炪倖鐗楅懝鍓х不閻愭祴鏀介柣妯诲墯閸熷繘鏌涢悩鎰佹疁闁靛棗鍟村畷銊э拷娑櫭禍杈ㄧ節閻㈤潧孝閻庢碍鎮傞獮蹇撶暋闁附鍍甸梺缁樺姦閸撴瑩顢旈敓锟�
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


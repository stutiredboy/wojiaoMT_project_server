
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendHelpSW__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendHelpSW extends __CSendHelpSW__ {
	@Override
	protected void process() {
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SSendHelpSW sSendHelpSW=new SSendHelpSW();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sSendHelpSW.helpsw=helpcount.getShengwangvalue();//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉潡寮婚敐澶嬪亜鐎瑰嫭澹嗛惄搴ㄦ⒑閸忓吋绶叉繛灏栵拷鎰佸殨闁割偅娲栭柋鍥ㄧ箾閹寸伝顏堚�栨径濞炬斀闁绘劕寮堕崳钘夆攽椤旇偐浠涚紒宀冮哺缁绘繈宕堕‖顑洨鍙撻柛銉ｅ妽閻撱儲銇勮箛鎾跺煟婵﹦绮幏鍛存偡闁箑娈濇繝鐢靛仦瑜板啰鎹㈠Ο铏规殾閻熸瑥瀚々鐑芥倵閿濆簼绨奸柣搴墴濮婃椽鎮烽弶搴撴寖缂備緡鍣崹璺侯嚕閺屻儱绠瑰ù锝呮贡閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷
		}
		gnet.link.Onlines.getInstance().send(roleid, sSendHelpSW);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786547;

	public int getType() {
		return 786547;
	}


	public CSendHelpSW() {
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
		if (_o1_ instanceof CSendHelpSW) {
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

	public int compareTo(CSendHelpSW _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


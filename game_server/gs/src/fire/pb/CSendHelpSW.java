
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
			sSendHelpSW.helpsw=helpcount.getShengwangvalue();//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁樺姍濠�渚�姊虹粙璺ㄧ闁告艾顑囩槐鐐哄箣閿旂晫鍘遍梺闈涱焾閸庨亶鏁撻挊澶嬪仴鐎殿喖顭烽弫鎰緞鐎ｎ亙绨婚柣搴ｆ嚀鐎氼厽绔熼崱娑欏剮閹兼番鍔嶉埛鎴︽煕韫囨挸鎮戠紒璺哄级缁绘稓浜搁弽鍨闁归绀佸▓銊╂⒑閸撴彃浜濇繛鍙夌墵閺屽宕堕妸褏顔曢梺鐟邦嚟娴兼繈顢旈崼姘炬嫹閺嶃劌绶炲┑鐐靛亾閺傦拷闂備胶绮崝鏇烆嚕閸洖闂柦妯侯槴閺�鑺ャ亜閺冨洤浜瑰ù鐘崇〒缁辨帒鐣濋崘顔兼懙缂備胶绮换鍫濈暦閸洍锟芥牠顢栭锟藉ú銊╁矗閹剧粯鐓曢柕澶涚到婵′粙鏌ｉ幘鍗炲姕闁靛洤瀚粻娑㈠箻鐠鸿櫣鍘芥繝娈垮枛閿曪妇鍒掗鐐茬闁告稑鐡ㄩ崑锟犳⒑椤撱劎鐣辨繛鍫熺箖缁绘繈鎮介棃娑楁勃閻熸粍婢橀崯浼村箲閵忕姈鐔兼惞鐟欏嫭顔曢梺鑽ゅ枑閻熴儳锟芥凹鍣ｉ妴鍛存倻閼恒儱锟界敻鏌ㄥ┑鍡欏嚬缂併劌銈搁弻锝嗘償椤旂厧鈷嬪┑顔硷攻濡炰粙骞冮悜钘夌骇閹煎瓨鎸荤�垫牜绱撻崒娆戣窗闁革綆鍣ｅ畷鍦崉娓氼垰娈ㄩ梺鍝勮閸庤京绮婚悷鎳婂綊鏁愰崨顔跨闂佸憡鐟ュΛ婵嗩潖閾忓湱纾兼俊顖濆吹椤︺儵姊虹粙鍖″伐婵狅拷闁秵鏅搁柤鎭掑劤閸熸煡鏌熼崙銈嗗
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


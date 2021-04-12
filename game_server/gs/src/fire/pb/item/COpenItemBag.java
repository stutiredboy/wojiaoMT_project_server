
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COpenItemBag__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸涱厾鍘梺閫涚┒閸斿矁鐏掗梺鍦焾濞寸兘濡撮幇顔剧＝濞达絽鎼皬闂佸憡顨嗘繛濠傤嚕鐠囨祴妲堟俊顖炴敱閺傦拷闂備礁鎲″ú锕傚磻閸曨剚鍙忛柡鍥╁剱濞撳鏌曢崼婵嬵�楀ù婊勭箖缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤兘骞冮姀銈呭窛濠电姴瀚倴婵犲痉鏉匡拷褏寰婃禒瀣柈妞ゆ牜鍎愰弫浣猴拷骞垮劚椤︿即鍩涢幋鐘电＝濞达絽顫栭鍡欑當闁圭儤顨嗛悡蹇涙煕椤愩倕鏋戦柛濠冨姉閿熻姤顔栭崰鏍�﹂悜钘夌畺闁靛繈鍊栭崑鍌炲箹鏉堝墽鎮奸柡鍡曞嵆閺岋綁鎮㈤崫銉х厐缂備礁顦遍幊鎾活敋閿濆鎯炴い鎰剁悼缁夊爼姊洪崘鍙夋儓妞ゆ垵妫涢敓鑺ヨ壘缂嶅﹪寮婚敐澶婎潊闁靛牆妫欓柨顓烆渻閵堝繒鍒伴柛姘儐缁岃鲸绻濋崶鑸垫櫇闂侀潧绻掓慨闈涒枔婵犳碍鍊垫繛鍫濈仢閺嬫稒銇勯銏℃暠濞ｅ洤锕幊婊堟濞戞氨鐛┑鐘垫暩婵锟芥艾鍢插嵄濞寸厧鐡ㄩ埛鎺懨归敐鍫燁棄妞ゃ儱绉撮…鍧楁偡閹殿喖顣洪梺宕囩帛閺屻劑鍩ユ径鎰潊闁冲搫鍊瑰▍鍡樹繆閻愵亜锟芥牠骞愰崼鏇炲瀭婵炲樊浜濋崑鍌炴煟閺冨倸甯剁紒鐘茬秺瀵爼宕煎┑鍡忔寖缂備礁顦遍弫濠氬蓟閿熺姴骞㈡俊顖濆亹閻撳姊洪崫鍕伇闁哥姵鐗曢悾宄扳枎閹炬緞褔鏌涢埄鍐炬濞寸》鎷� by changhao
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


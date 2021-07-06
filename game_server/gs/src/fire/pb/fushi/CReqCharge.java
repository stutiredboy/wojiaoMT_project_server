
package fire.pb.fushi;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqCharge__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻锛勪沪缁嬪灝鈷夐悗鍨緲鐎氼噣鏁撻弬銈囩У濞存粍绻堥、娆撳川椤撴稒鏂�闂佺粯鍔曞鍫曞煝閺囩伝鐟邦煥閸愵亜鐓熼悗娈垮櫘閸嬪﹤鐣烽崼鏇ㄦ晢濞达絽鎼敮楣冩⒒婵犲骸浜滄繛璇х畱鐓ら柡宓嫭鐦庨梻鍌氬�风粈渚�骞夐敍鍕床闁告劦鍠撻敓钘夊暞缁绘繈宕掗妶鍡欑▉缂傚倸鍊烽悞锕傗�﹂崶顒佸仭鐟滅増甯楅悡鏇㈡煏婢跺鐏ラ柛鐘宠壘椤洭鎳￠妶鍥╋紳闂佺鏈悷褔藝閿斿浜滈柨鏇炲�烽幉鍓э拷娈垮櫘閸嬪棝骞忛悩缁樺殤妞ゆ帊鐒﹂鏇㈡⒒娴ｅ憡鎯堟繛灞傚灲瀹曞綊宕烽鐘辩瑝闂佹寧绻傚Λ娑氬姬閿熶粙姊洪棃娑㈢崪缂佽鲸娲滅划濠氬箻閸撲胶锛濋悗骞垮劚閹锋垵顔忛妷鈺傜厽闁挎繂鎳庡Σ濠氭懚閺嶎厽鐓曟繛鎴濆船楠炴ɑ銇勮熁閸ャ劉鎷洪梺绋跨箺閸嬫劙濡堕幘顔界厸闁告侗鍠氱粻鐐烘煕閳瑰灝鐏辩紒鐘崇洴瀵挳鎮╃喊澶岄棷闂傚倷鑳堕…鍫ュ嫉椤掑嫭鍋＄憸蹇曞垝娴ｅ啰鐤�婵炴垶鐟ч崢鍨繆閻愬樊鍎忓Δ鐘虫倐瀹曘垽骞橀鐣屽幐闁诲繒鍋涙晶浠嬪煡婢舵劖鐓熼柨婵嗘缁犵偤鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵娴滅偤鏁嶅☉銏♀拺缂備焦锚婵鏌涙惔娑橈拷婵嗙暦閹达箑纾奸柣鎰嚟閸樻悂姊洪幖鐐插姉闁哄懏鐩鎼佸籍閸屾粎锛滈梺缁橆焾瀹曠敻鎮惧ú顏呯厸鐎癸拷閿熶粙宕伴幇顒夌劷闊洦绋戠粈鍫㈡喐韫囨碍鎳岄梻鍌氬�烽懗鍓佸垝椤栨粍宕茬�广儱妫涢々鍙夈亜韫囨挾澧曠紒鐘崇墬娣囧﹪濡惰箛鏂款伓婵＄偑鍊ら崑鍛崲閸儱绠栨繛鍡樻惄閺佸棝鏌ㄩ悢鍓佺煓妞ゃ垺妫冮弫鎾绘晸閿燂拷??
 * @author changhao
 *
 */
public class CReqCharge extends __CReqCharge__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		new PReqPay(roleid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812454;

	public int getType() {
		return 812454;
	}


	public CReqCharge() {
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
		if (_o1_ instanceof CReqCharge) {
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

	public int compareTo(CReqCharge _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


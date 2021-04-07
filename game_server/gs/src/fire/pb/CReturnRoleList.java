
package fire.pb;

import fire.pb.state.PRoleOffline;
import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReturnRoleList__ extends mkio.Protocol { }

/** 客户端请求返回角色选择界面
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReturnRoleList extends __CReturnRoleList__ {
	@Override
	protected void process() {
		// protocol handle
		
		gnet.link.Role role = Onlines.getInstance().find(this);
		if(role == null)
			return;
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺屾洟宕煎┑鎰ч梺璇″灣閸嬬偤濡甸崟顖氱疀闁宠桨鑳舵导鍕箾鐎涙鐭嬪鐟版濡叉劙骞樼�涙ê顎撻柣鐘叉礌閸撴繈鎮鹃崼鏇熲拺缁绢厼鎳忛悵顏堟煕閺冿拷閻熲晠鐛崱娑欐櫢闁兼亽鍎禍婊堢叓閸ャ劍灏靛褎娲滅槐鎺楁晸閽樺鏆嗛柛鏇ㄥ墰閸欏棗鈹戦悙鏉戠仸闁挎碍銇勮箛锝呬簼闁靛洤瀚伴弫鍌滄嫚閸欏浜梺鍓х帛閻楃娀寮婚敐鍜佹建闁跨喕妫勯…鍥槼缂佸倹甯￠崺锟犲川椤旀儳骞堥梻浣稿暱閹碱偊宕愮紒妯绘珷闁割煈鍋佹禍婊堟煏韫囧﹥顫婃繛鍫熸⒐閵囧嫰顢樺鍐潎閻庤娲忛崝鎴︺�佸▎鎾村殟闁靛鍠栭弫褰掓⒒閸屾艾锟芥悂宕愰幖浣哥；濠电姴娲ょ粻顖炴煟閹达絽袚闁绘挻鐟╁娲敇閵娧呮殸闂佸搫顑冮崐婵嬪蓟閻斿鍟呮い鏂垮悑閻忔挾绱撴担浠嬪摵闁圭顭烽獮蹇涘川鐎涙ê浠梺瑙勵問閸ｎ喖危娴煎瓨鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷?闂傚倸鍊搁崐鐑芥嚄閸洍锟斤箓宕奸妷銉ョ彉濡炪倖甯掔�氼參宕戦敍鍕枑闁哄啫鐗嗙粻鏍煟閹达絾顥夌紒鐘差煼閺屾盯骞橀懠璺哄帯闂佹寧绋掔划鎾愁潖閾忚瀚氶柍銉ョ－閿熻棄顭烽弻娑樷槈閸楃偛鈷夊┑锛勫亾閹倸顫忕紒妯诲濡炲绨肩憰鍡欑磽閸屾氨孝婵☆偅绻傞悾宄邦煥閸愶絾鐎婚梺鍦劋缁诲啫袙鎼淬劍鈷掗柛灞剧懅椤︼箓鏌熺喊鍗炰簻閻撱倝鏌曟繛鐐珔缁炬儳顭烽弻锝夊箛椤掍焦鍎撶紒鐐劤缂嶅﹪寮婚敐澶婎潊闁绘ê鍟块弳鍫ユ⒑缂佹ɑ灏柛搴ゅ皺閹广垹鈽夐姀鐘殿吅闂佺粯鍨靛Λ娑㈠礉閹间焦鐓熼幖娣灮閻擃垶鏌涘Δ浣糕枙鐎殿喛顕ч埥澶愬閳ュ厖绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁割偅娲橀埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岀喓鎷犺缁★拷闂佽鍠氶崗姗�寮崘顔肩＜婵浜崢顒勬⒒娴ｈ姤纭堕柛鐘虫尵缁﹪鎯夐弶顣況nRoleList婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓闁搞劌鍊块弻锝夊閻樺啿鏆堥梺绋款儏椤戝懘鍩為幋锔藉亹闁圭粯甯楀▓顓烆渻閵堝棙绀嬪ù婊冪埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
		new fire.pb.state.PRoleOffline(role.getRoleid(),PRoleOffline.TYPE_CHOSEE_ROLE).submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786477;

	public int getType() {
		return 786477;
	}


	public CReturnRoleList() {
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
		if (_o1_ instanceof CReturnRoleList) {
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

	public int compareTo(CReturnRoleList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


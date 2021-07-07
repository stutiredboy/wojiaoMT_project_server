
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQuitTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄥジ鏌熼惂鍝ョМ闁哄矉缍侀、姗�鎮欓幖顓燁棧闂備線娼уΛ娆戞暜閹烘缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕绻愰悥濂稿蓟閿濆棙鍎熼柕鍫濆缂嶅牆鈹戦悙鎻掔骇闁挎洏鍨归悾宄扳攽鐎ｎ亜鍞ㄥ銈嗗姂閸婃鎮為崸妤佲拺闁革富鍘奸崝瀣繆椤愶絽鐏存鐐茬箻閹粓鎳為妷锔界彸闂備礁鎲℃笟妤呭垂椤栨粌鍨濋柣銏犳啞閳锋垿鏌涘┑鍡楊仾濠殿垳鍘ч湁婵犲﹤绨奸柇顖涱殽閻愭彃鏆欓柣锝忕節閺屽洭鏁傞幆褍姹查梻鍌欑閹诧繝宕濋敂鐣岊洸闁绘劒璀﹂弫濠囨煕閵夘喖澧柣鎾存礃娣囧﹪濡堕崨顔兼闂佽鐓＄粻鏍蓟閳ュ磭鏆嗛柨鐔剁矙瀹曚即寮介鐐电暫閻熸粍鏌ㄩ悾閿嬬附閸涘﹤浜滈梺鍛婄箓鐎氼剙鈻撻妷褏纾介柛灞捐壘閿熺晫鍏橀幊妤呮嚋闂堟稑鐏侀柣搴ㄦ涧閹芥粎绮堟繝鍌橈拷鎺戭潩閻愵剙顏堕柣搴㈩問閸犳牠鈥﹂柨瀣╃箚闁归棿绀侀悡娑樏归敐鍫燁仩婵炵厧顦靛缁樻媴鐟欏嫬浠╅梺绋块瀹曨剝鐏嬪┑鐐叉閸ㄥ爼寮冲鍫熺叆闁绘柨鎼暩閻庤鎸风欢姘跺蓟閻旂厧绠ユい鏃傗拡閺嗩參姊洪崫鍕櫧妞ゎ厼鐗撳﹢渚�姊虹紒妯忣亜螣婵犲洤纾块柟鎵閻撳啴姊洪崹顕呭剰缂佹甯″Λ浣瑰緞閹邦厾鍙嗗┑鐘绘涧濡稒鏅跺☉娆嶄簻闊洦娲栭埢鍫ユ煙椤旇崵鐭欐い銏＄☉閳藉顫濋鐐茬仭闂傚倷绀侀幖顐︽儗婢跺本顫曢柡鍥╁枔椤╃兘鏌ㄩ弮鍌氫壕閻庢碍宀搁弻鐔虹磼濡桨鍒婇梺璇插閹稿啿顫忕紒妯诲闁告稑锕ラ崕鎾绘⒑绾懏鐝柟鐟版搐閻ｅ嘲煤椤忓嫬鍞ㄥ銈嗘尵閸嬬喖鎮炬ィ鍐┾拺闁告繂瀚弳娆撴煟濡わ拷閿曨亜顕ｉ弻銉ヨ摕闁靛濡囬崢閬嶆⒑闂堟侗妲堕柛銊ユ惈閳诲秹宕堕浣哄幈闂佸搫鍊藉▔鏇㈠春閿濆棙鍙忓┑鐘插鐢盯鏌熷畡鐗堝殗闁瑰磭鍋ゆ俊鐤槹闁跨喕妫勯敃顏勵潖濞差亝顥堥柍鍝勫暟鑲栫紓鍌欒兌婵敻骞戦崶顒佸仒妞ゆ棁娉曢悿锟藉┑鐐村灦閻燂箑鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
 * @author changhao
 *
 */
public class CQuitTeam extends __CQuitTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long leverRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if(leverRoleId >0){
			new PQuitTeamProc(leverRoleId).submit();
		}
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794440;

	public int getType() {
		return 794440;
	}


	public CQuitTeam() {
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
		if (_o1_ instanceof CQuitTeam) {
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

	public int compareTo(CQuitTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


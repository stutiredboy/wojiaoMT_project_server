
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDismissTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介柛鈾�鏅涘▓銊╂⒑閸撴彃浜濇繛鍙夌墵閺屽宕堕妸锕�寮垮┑顔筋殔濡鐛Δ鍛厽婵犻潧娲﹂埛鎺旂磼鏉堛劍灏伴柟宄版嚇閹墽浠﹂悾灞筋潽闂傚倷鑳堕…鍫ユ晝閵夈儍鍝勨攽鐎ｎ偄锟藉爼鏌涢幇闈涙灍闁抽攱鍨块弻鐔虹矙閹稿孩宕崇紓浣哄У閹瑰洭寮婚悢鐓庣闁哄被鍎卞浼存倵濞堝灝鏋涢柛鐔锋健閸┿垺鎯旈妸銉х杸濡炪倖鎸鹃崑娑欏鎼淬劍鈷戦柤濮愬�曢弸鎴︽煟閻旀潙鍔ら柨鐔诲Г閸戝綊宕抽敐鍛殾闁挎繂顦伴弲鎼佹煢濡尨绱氶柡鍐ㄧ墛閸嬫劙姊婚崼鐔衡棩婵炲矈浜铏圭磼濮楀棙鐣峰┑鐐插级缁诲棝濡甸幇顓熷闁告挸寮剁�靛矂姊洪棃娑氬婵☆偅顨婇弻灞筋煥閸喓鍘甸悗鐟板濠㈡ê危婵犳碍鐓冮悷娆忓閻忔挳鏌涢妸鈺冪暫闁瑰磭濞�椤㈡宕掑鍐ㄧ畾闂傚倸鍊风粈渚�骞栭锔藉殣妞ゆ牗绮庨惌鎾舵喐閻楀牆绗掗柦鍐枛閺屾洘绻涜缁夌數锟芥艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂嫮鐭岄柣銉邯閹瑩顢楅敓浠嬪煝閺囩喐鍙忓┑鐘插暞閵囨繄锟借娲﹂崑濠傜暦閻旂⒈鏁囬柣妯诲絻铦庣紓鍌氬�搁崐鎼佸磹閸濄儳鐭撶�规洖娲ㄩ惌鍡椼�掑鐐濡炪們鍨哄畝鎼佸极閹邦厼绶炴俊顖滅帛濞呭矂姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤栨稑锟藉灚銇勯幘璺哄壉婵炴挸顭烽弻鏇㈠醇濠靛浂妫＄紓渚婃嫹闁跨喍绮欏娲偡閺夋寧姣愮紓浣虹帛閸旀瑩宕洪姀銈呯缂備焦蓱閸庮亪姊洪棃鈺佺槣闁告﹢绠栭弫宥呪攽鐎ｎ偀鎷虹紓浣割儐鐎笛冿耿娴煎瓨鐓熼柣鏃�绻傞幊鎰仚閹剁晫鍙撻柛銉ｅ妿閳句線鏌ｉ幘瀵告噧妞ゎ亜鍟伴敓鏂ょ秵娴滎亪顢撳Δ鍛厱婵☆垳绮亸锕傛煛瀹�瀣？濞寸媴濡囬幏鐘诲箵閹烘繃缍嗛梻鍌欐祰椤曟牠宕伴幘璇茬９婵犻潧妫涢弳锕傛煙閻戞ê鐏嶆俊鎻掔墛閹便劌螖閿熻棄螞閺冨倹顫曢柨鐕傛嫹
 * @author changhao
 *
 */
public class CDismissTeam extends __CDismissTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		Team team = TeamManager.selectTeamByRoleId(roleid);
		if(team == null)
			return;
		if(!team.isTeamLeader(roleid))
			return;
		new PDisMissTeam(team.teamId,PDisMissTeam.REASON_LEADER).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794487;

	public int getType() {
		return 794487;
	}


	public CDismissTeam() {
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
		if (_o1_ instanceof CDismissTeam) {
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

	public int compareTo(CDismissTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


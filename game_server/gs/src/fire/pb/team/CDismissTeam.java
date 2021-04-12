
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDismissTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑鍡╁殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囨⒒缁辨挻鎷呴悾灞界墯闂佺锕ュú婵嬫倶閸愵喗鈷戦柟绋挎捣缁犳捇鏌熼崘鏌ュ弰鐎殿喖鍟块埢搴ㄥ箛椤撶偛浼庨梺鑽ゅ枑閻熴儳锟芥凹鍣ｅ畷锝夋晸閽樺）鏃堟偐闂堟稐娌梺缁橆殕濞叉繆銇愭担鍓叉富闁靛牆妫楅柌婊堟煙瀹勬澘妲婚柍瑙勫灴閸ㄩ箖鎳犻鍌滃幆闂備礁鎼懟顖滅矓瑜版帒钃熼柕濞у秵瀚归柨婵嗛娴滄粎鐥悙顒�鈻曟慨濠冩そ瀹曨偊宕熼鐘插Ы缂傚倸鍊哥粔宕囩矆娓氾拷椤㈡岸鏁愭径妯绘櫌闂佸憡娲﹂崑鍕倵椤撶儐娓婚柕鍫濇缁�锟介梺鐟板暱缁绘劙鍩㈤幘缁樻優闁革富鍘鹃敍婵嬫⒑缁嬫寧婀伴柣鐔濆懐椹抽煫鍥ㄧ♁閻撴瑥顪冪�ｎ亪顎楅柛妯绘尦閺岋紕浠︾拠鎻掝潎闂佽鍠撻崐婵嗙暦閹烘垟妲堟慨妤�妫旂槐锟�
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


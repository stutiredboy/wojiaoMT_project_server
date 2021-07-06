
package fire.msp.task;



import fire.pb.mission.MissionColumn;
import fire.pb.mission.RoleMission;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MScenarioQuestVerifyPosSucc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MScenarioQuestVerifyPosSucc extends __MScenarioQuestVerifyPosSucc__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId( roleid );
		if ( team == null || team.isAbsentMember(roleid) ) {
			new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true).submit();
			return;
		}
		if (team.isTeamLeader(roleid)) {
//			final int exetype = Helper.getTaskExeType( conf.activeInfo.missionType );
//			final int finishtype = Helper.getTaskFinishRequireType( conf.activeInfo.missionType );
//			if ( exetype == TaskExecuteTypes.NUL && ( finishtype == TaskFinishRequire.AREA || finishtype == TaskFinishRequire.NUL )||  
//					exetype == TaskExecuteTypes.NPC && (finishtype == TaskFinishRequire.NUL || finishtype == TaskFinishRequire.QUESTION ) ) {
			RoleMission task = new MissionColumn(roleid, true).getMission(scenarioquestid);
			if(task != null) {
				int teamshare = task.getConf().exeIndo.share;
				if (teamshare == 0) {
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕ら锝囨嫚濞村顫嶅┑鈽嗗灦閺�閬嶅棘閿熶粙姊绘担鍛婂暈婵炶绠撳畷鎴﹀礋椤掍礁寮块梺闈涚箞閸婃牠鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈滈柡宀�鍠栭幃鐑芥偋閸繃鐏庨柣搴㈩問閸犳牠鈥﹂悜钘夌畺闁靛繈鍊栭幆鐐烘煕閿旇寮跨紒杈ㄧ叀濮婄粯绗熼敓钘夘焽瑜忛幑銏ゅ箳閹炬潙寮块梺姹囧灩閹诧繝宕愰崼鏇熺厱妞ゆ劗濮撮崝婊堟煃闁垮鐏︾紒缁樼洴閹崇姵锛愬┑鍡橆唲婵°倗濮烽崑鐐恒�冮崱娑樜﹂柛鏇ㄥ灠鎯熼梺闈涱樈閸ㄧ敻宕ラ锔藉�垫繛鍫濈仢閺嬶附銇勯弴鍡楁祩閺佸洭鏌涜箛鏇炲付缂佸墎鍋涢埞鎴︽偐閹绘帩浠煎Δ鐘靛仦閸旀洟鍩為幋锔藉�烽柤鎼佹涧濞懷呯磽娴ｈ棄绱︾紒顔界懇閻涱喗寰勯幇顒備紜闂佸搫鍊堕崕鏌ユ倶娓氾拷閺岋綁鎮╅悜妯革拷鍐偣閿熶粙鏁冮敓浠嬪Υ閹烘挾绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插�块弫鎾绘偩鐏炴儳娈岄梺瀹狀嚙缁夌懓顕ｉ锟藉畷濂告偄閸濆嫬绠ラ梻鍌欑閹诧繝宕归鐐茬９闁哄稁鍋撻幏宄邦潩閻愵剙顏�?
					new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true).submit();
				} else {
					for (long memid : team.getNormalMemberIds()) {
						fire.pb.mission.PCommitMajorMission proc = new fire.pb.mission.PCommitMajorMission(memid, scenarioquestid, memid == roleid);
						proc.submit();
					}
				}
			}
//				return;
//			}
//			new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true).submit();
		}
	}
	
//	private final class PCommitMajorMission extends fire.pb.mission.PTaskProcedure {
//		private final long playerid;
//		public PCommitMajorMission( final long playerid ) {
//			this.playerid = playerid;
//		}
//		@Override
//		protected boolean taskProcess() {
//			fire.pb.mission.TaskScenarioColumn sml =
//				new fire.pb.mission.TaskScenarioColumn( playerid, this );
//			return sml.commitMission(scenarioquestid);
//		}
//	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739907;

	public int getType() {
		return 739907;
	}

	public long roleid;
	public int scenarioquestid;

	public MScenarioQuestVerifyPosSucc() {
	}

	public MScenarioQuestVerifyPosSucc(long _roleid_, int _scenarioquestid_) {
		this.roleid = _roleid_;
		this.scenarioquestid = _scenarioquestid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(scenarioquestid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		scenarioquestid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MScenarioQuestVerifyPosSucc) {
			MScenarioQuestVerifyPosSucc _o_ = (MScenarioQuestVerifyPosSucc)_o1_;
			if (roleid != _o_.roleid) return false;
			if (scenarioquestid != _o_.scenarioquestid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += scenarioquestid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(scenarioquestid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MScenarioQuestVerifyPosSucc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = scenarioquestid - _o_.scenarioquestid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


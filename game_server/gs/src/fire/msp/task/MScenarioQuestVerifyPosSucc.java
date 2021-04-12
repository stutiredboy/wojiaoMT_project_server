
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
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉箖閵忋倖鎯為柛锔诲弿缁辨煡姊绘笟锟藉褏鎹㈤幒鎾村弿闁汇垹鎲￠崐鍫曟煕椤愮姴鍔滈柍閿嬪灦缁绘盯鎳犳０婵嗘濡ょ姷鍋為〃鍡涘Φ閸曨垰惟闁靛鍨甸崥顐︽倵濞堝灝鏋︽い鏇嗗浂鏁囬柛蹇曞帶缁剁偛鈹戦悩鎻掝仼妤犵偞鍔曢埞鎴︽倷閼搁潧娑х紓浣藉紦缁瑩鐛径鎰伋闁哄倶鍎查悘渚�鏌ｉ悩鐑樸�冮悹锟介敃锟介妴鎺撶節濮橆厾鍘梺鍓插亝缁诲倿鏁撻悾灞惧殌闁宠绉瑰顕�宕奸悢鍝勫箥闂備礁鎲￠崹顖炲磹閺嶎偓鎷峰鐐?
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


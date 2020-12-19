
package fire.pb.npc;

import java.util.Arrays;
import java.util.List;

import fire.pb.activity.winner.WinnerManager;
import fire.pb.activity.winner.WinnerRecord;
import fire.pb.circletask.SpecialQuestState;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.TaskDlgUtil;








// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CWinnerChangeTask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CWinnerChangeTask extends __CWinnerChangeTask__ {
	@Override
	protected void process() {
		// protocol handle
		//鍐犲啗璇曠偧缁熶竴闃熼暱浠诲姟
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid<=0){
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				Team team = TeamManager.selectTeamByRoleId(roleid);
				if (team == null){
					MessageMgr.sendMsgNotify(roleid, 140498, null);
					return false;
				}
				//鍒ゆ柇娲诲姩鏄惁寮?鍚?
				long currentTime = System.currentTimeMillis();
				if (!WinnerManager.getInstance().isInWinnerActiveTime(currentTime)) {
					return false;
				}
				if(acceptflag==1){
					//鍚屾剰缁熶竴浠诲姟
					//鑾峰彇闃熼暱鐨勪换鍔d
					long teamleadid=team.getTeamLeaderId();
					//鑾峰緱浠诲姟淇℃伅
					xbean.TaskDlgInfo task=TaskDlgUtil.getTaskDlgInfo(teamleadid, WinnerManager.WINNER_TASK_ID);
					if(task==null){
						WinnerManager.logger.info("瑙掕壊id "+roleid+"\t鍚屾鍐犲啗璇曠偧浠诲姟锛屾暟鎹敊璇紝闃熼暱娌℃湁浠诲姟");
						return false;
					}
					Npc npc = SceneNpcManager.selectNpcByKey(task.getDstnpckey());
					if(npc==null){
						return false;
					}
					//鍒犻櫎鐜╁褰撳墠浠诲姟
					if (TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID)||TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID_ACCEPT)){
						WinnerManager.getInstance().abandonWinnerTask(roleid);
					}
					//鍚屾鐜╁褰撳墠浠诲姟
					WinnerManager.getInstance().createWinnerTask(WinnerManager.WINNER_TASK_ID,roleid,npc,SpecialQuestState.UNDONE,0,task.getSumnum());//鍒涘缓浠诲姟
					WinnerManager.getInstance().addWinnerRole(roleid);//娣诲姞鍐犲啗璇曠偧鐨勭帺瀹?
					MessageMgr.psendMsgNotifyWhileCommit(roleid, 140666, npc.getNpcID(), Arrays.asList(task.getSumnum()+"",npc.getName()));
					
					//娓呴櫎闃熶紞绉垎浠ュ強鐜暟淇℃伅
					WinnerRecord record = WinnerManager.getInstance().teams.get(team.getTeamId());
					if(record!=null){
						record.setTeamScore(0);
						record.setRound(0);
						//閲嶆柊鍚屾涓?涓嬮槦浼嶆垚鍛橈紝骞朵笖娓呴櫎璇ョ帺瀹朵笂娆＄殑闃熶紞淇℃伅
						WinnerManager.getInstance().removeLastTeamidAddNew(record,roleid);
					}
					//閫氱煡闃熷憳
					xbean.Properties prop=xtable.Properties.select(roleid); 
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						WinnerManager.clearActiveTeamWinnerScore(mem);//娓呴櫎娲诲姩闈㈡澘鐨勯槦浼嶆垚缁?
						MessageMgr.sendMsgNotify(mem, 170019, Arrays.asList(prop.getRolename()));
					}
					WinnerManager.logger.info("瑙掕壊id "+roleid+"\t鍚屾鍐犲啗璇曠偧浠诲姟锛屾垚鍔?");
				}else{
					//鍙栨秷缁熶竴浠诲姟
					//閫氱煡闃熼暱
					xbean.Properties prop=xtable.Properties.select(roleid); 
//					long teamleadid=team.getTeamLeaderId();
//					MessageMgr.sendMsgNotify(teamleadid, 160449, Arrays.asList(prop.getRolename()));
					//閫氱煡闃熷憳
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						MessageMgr.sendMsgNotify(mem, 160449, Arrays.asList(prop.getRolename()));
					}
					
				}
				return true;
			}
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795484;

	public int getType() {
		return 795484;
	}

	public int acceptflag; // 0表示取消    1表示接受

	public CWinnerChangeTask() {
	}

	public CWinnerChangeTask(int _acceptflag_) {
		this.acceptflag = _acceptflag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(acceptflag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		acceptflag = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CWinnerChangeTask) {
			CWinnerChangeTask _o_ = (CWinnerChangeTask)_o1_;
			if (acceptflag != _o_.acceptflag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += acceptflag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(acceptflag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CWinnerChangeTask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = acceptflag - _o_.acceptflag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


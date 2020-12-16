
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
		//冠军试炼统一队长任务
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
				//判断活动是否�?�?
				long currentTime = System.currentTimeMillis();
				if (!WinnerManager.getInstance().isInWinnerActiveTime(currentTime)) {
					return false;
				}
				if(acceptflag==1){
					//同意统一任务
					//获取队长的任务id
					long teamleadid=team.getTeamLeaderId();
					//获得任务信息
					xbean.TaskDlgInfo task=TaskDlgUtil.getTaskDlgInfo(teamleadid, WinnerManager.WINNER_TASK_ID);
					if(task==null){
						WinnerManager.logger.info("角色id "+roleid+"\t同步冠军试炼任务，数据错误，队长没有任务");
						return false;
					}
					Npc npc = SceneNpcManager.selectNpcByKey(task.getDstnpckey());
					if(npc==null){
						return false;
					}
					//删除玩家当前任务
					if (TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID)||TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID_ACCEPT)){
						WinnerManager.getInstance().abandonWinnerTask(roleid);
					}
					//同步玩家当前任务
					WinnerManager.getInstance().createWinnerTask(WinnerManager.WINNER_TASK_ID,roleid,npc,SpecialQuestState.UNDONE,0,task.getSumnum());//创建任务
					WinnerManager.getInstance().addWinnerRole(roleid);//添加冠军试炼的玩�?
					MessageMgr.psendMsgNotifyWhileCommit(roleid, 140666, npc.getNpcID(), Arrays.asList(task.getSumnum()+"",npc.getName()));
					
					//清除队伍积分以及环数信息
					WinnerRecord record = WinnerManager.getInstance().teams.get(team.getTeamId());
					if(record!=null){
						record.setTeamScore(0);
						record.setRound(0);
						//重新同步�?下队伍成员，并且清除该玩家上次的队伍信息
						WinnerManager.getInstance().removeLastTeamidAddNew(record,roleid);
					}
					//通知队员
					xbean.Properties prop=xtable.Properties.select(roleid); 
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						WinnerManager.clearActiveTeamWinnerScore(mem);//清除活动面板的队伍成�?
						MessageMgr.sendMsgNotify(mem, 170019, Arrays.asList(prop.getRolename()));
					}
					WinnerManager.logger.info("角色id "+roleid+"\t同步冠军试炼任务，成�?");
				}else{
					//取消统一任务
					//通知队长
					xbean.Properties prop=xtable.Properties.select(roleid); 
//					long teamleadid=team.getTeamLeaderId();
//					MessageMgr.sendMsgNotify(teamleadid, 160449, Arrays.asList(prop.getRolename()));
					//通知队员
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

	public int acceptflag; // 0��ʾȡ��    1��ʾ����

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


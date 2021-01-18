
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
		//閸愮姴鍟楃拠鏇犲仹缂佺喍绔撮梼鐔兼毐娴犺濮�
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
				//閸掋倖鏌囧ú璇插З閺勵垰鎯佸?閸�?
				long currentTime = System.currentTimeMillis();
				if (!WinnerManager.getInstance().isInWinnerActiveTime(currentTime)) {
					return false;
				}
				if(acceptflag==1){
					//閸氬本鍓扮紒鐔剁娴犺濮�
					//閼惧嘲褰囬梼鐔兼毐閻ㄥ嫪鎹㈤崝顡痙
					long teamleadid=team.getTeamLeaderId();
					//閼惧嘲绶辨禒璇插娣団剝浼�
					xbean.TaskDlgInfo task=TaskDlgUtil.getTaskDlgInfo(teamleadid, WinnerManager.WINNER_TASK_ID);
					if(task==null){
						WinnerManager.logger.info("鐟欐帟澹奿d "+roleid+"\t閸氬本顒為崘鐘插晽鐠囨洜鍋ф禒璇插閿涘本鏆熼幑顕�鏁婄拠顖ょ礉闂冪喖鏆卞▽鈩冩箒娴犺濮�");
						return false;
					}
					Npc npc = SceneNpcManager.selectNpcByKey(task.getDstnpckey());
					if(npc==null){
						return false;
					}
					//閸掔娀娅庨悳鈺侇啀瑜版挸澧犳禒璇插
					if (TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID)||TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID_ACCEPT)){
						WinnerManager.getInstance().abandonWinnerTask(roleid);
					}
					//閸氬本顒為悳鈺侇啀瑜版挸澧犳禒璇插
					WinnerManager.getInstance().createWinnerTask(WinnerManager.WINNER_TASK_ID,roleid,npc,SpecialQuestState.UNDONE,0,task.getSumnum());//閸掓稑缂撴禒璇插
					WinnerManager.getInstance().addWinnerRole(roleid);//濞ｈ濮為崘鐘插晽鐠囨洜鍋ч惃鍕负鐎�?
					MessageMgr.psendMsgNotifyWhileCommit(roleid, 140666, npc.getNpcID(), Arrays.asList(task.getSumnum()+"",npc.getName()));
					
					//濞撳懘娅庨梼鐔剁礊缁夘垰鍨庢禒銉ュ挤閻滎垱鏆熸穱鈩冧紖
					WinnerRecord record = WinnerManager.getInstance().teams.get(team.getTeamId());
					if(record!=null){
						record.setTeamScore(0);
						record.setRound(0);
						//闁插秵鏌婇崥灞绢劄娑�?娑撳妲︽导宥嗗灇閸涙﹫绱濋獮鏈电瑬濞撳懘娅庣拠銉у负鐎规湹绗傚▎锛勬畱闂冪喍绱炴穱鈩冧紖
						WinnerManager.getInstance().removeLastTeamidAddNew(record,roleid);
					}
					//闁氨鐓￠梼鐔锋喅
					xbean.Properties prop=xtable.Properties.select(roleid); 
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						WinnerManager.clearActiveTeamWinnerScore(mem);//濞撳懘娅庡ú璇插З闂堛垺婢橀惃鍕Е娴煎秵鍨氱紒?
						MessageMgr.sendMsgNotify(mem, 170019, Arrays.asList(prop.getRolename()));
					}
					WinnerManager.logger.info("鐟欐帟澹奿d "+roleid+"\t閸氬本顒為崘鐘插晽鐠囨洜鍋ф禒璇插閿涘本鍨氶崝?");
				}else{
					//閸欐牗绉风紒鐔剁娴犺濮�
					//闁氨鐓￠梼鐔兼毐
					xbean.Properties prop=xtable.Properties.select(roleid); 
//					long teamleadid=team.getTeamLeaderId();
//					MessageMgr.sendMsgNotify(teamleadid, 160449, Arrays.asList(prop.getRolename()));
					//闁氨鐓￠梼鐔锋喅
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


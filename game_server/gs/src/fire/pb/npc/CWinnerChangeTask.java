
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
		//闁告劗濮撮崯妤冩嫚閺囩姴浠圭紓浣哄枍缁旀挳姊奸悢鍏兼瘣濞寸姾顕ф慨锟�
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
				//闁告帇鍊栭弻鍥虹拠鎻捫楅柡鍕靛灠閹礁顕�?闁革拷?
				long currentTime = System.currentTimeMillis();
				if (!WinnerManager.getInstance().isInWinnerActiveTime(currentTime)) {
					return false;
				}
				if(acceptflag==1){
					//闁告艾鏈崜鎵磼閻斿墎顏卞ù鐘侯嚙婵拷
					//闁兼儳鍢茶ぐ鍥⒓閻斿吋姣愰柣銊ュ閹广垽宕濋　鐥�
					long teamleadid=team.getTeamLeaderId();
					//闁兼儳鍢茬欢杈ㄧ鐠囨彃顫ゅǎ鍥ｅ墲娴硷拷
					xbean.TaskDlgInfo task=TaskDlgUtil.getTaskDlgInfo(teamleadid, WinnerManager.WINNER_TASK_ID);
					if(task==null){
						WinnerManager.logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"\t闁告艾鏈鐐哄礃閻樻彃鏅介悹鍥ㄦ礈閸嬔勭鐠囨彃顫ら柨娑樻湰閺嗙喖骞戦锟介弫濠勬嫚椤栥倗绀夐梻鍐枛閺嗗崬鈻介埄鍐╃畳濞寸姾顕ф慨锟�");
						return false;
					}
					Npc npc = SceneNpcManager.selectNpcByKey(task.getDstnpckey());
					if(npc==null){
						return false;
					}
					//闁告帞濞�濞呭酣鎮抽埡渚囧晙鐟滅増鎸告晶鐘崇鐠囨彃顫�
					if (TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID)||TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID_ACCEPT)){
						WinnerManager.getInstance().abandonWinnerTask(roleid);
					}
					//闁告艾鏈鐐烘偝閳轰緡鍟�鐟滅増鎸告晶鐘崇鐠囨彃顫�
					WinnerManager.getInstance().createWinnerTask(WinnerManager.WINNER_TASK_ID,roleid,npc,SpecialQuestState.UNDONE,0,task.getSumnum());//闁告帗绋戠紓鎾寸鐠囨彃顫�
					WinnerManager.getInstance().addWinnerRole(roleid);//婵烇綀顕ф慨鐐哄礃閻樻彃鏅介悹鍥ㄦ礈閸嬔囨儍閸曨厼璐熼悗锟�?
					MessageMgr.psendMsgNotifyWhileCommit(roleid, 140666, npc.getNpcID(), Arrays.asList(task.getSumnum()+"",npc.getName()));
					
					//婵炴挸鎳樺▍搴ㄦ⒓閻斿墎绀婄紒澶樺灠閸ㄥ孩绂掗妷銉ユ尋闁绘粠鍨遍弳鐔哥┍閳╁啩绱�
					WinnerRecord record = WinnerManager.getInstance().teams.get(team.getTeamId());
					if(record!=null){
						record.setTeamScore(0);
						record.setRound(0);
						//闂佹彃绉甸弻濠囧触鐏炵虎鍔勫☉锟�?濞戞挸顑夊Σ锔藉瀹ュ棗鐏囬柛娑欙公缁辨繈鐛張鐢电懍婵炴挸鎳樺▍搴ｆ嫚閵壯冭礋閻庤婀圭粭鍌氣枎閿涘嫭鐣遍梻鍐枍缁辩偞绌遍埄鍐х礀
						WinnerManager.getInstance().removeLastTeamidAddNew(record,roleid);
					}
					//闂侇偅姘ㄩ悡锟犳⒓閻旈攱鍠�
					xbean.Properties prop=xtable.Properties.select(roleid); 
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						WinnerManager.clearActiveTeamWinnerScore(mem);//婵炴挸鎳樺▍搴∶虹拠鎻捫楅梻鍫涘灪濠㈡﹢鎯冮崟顖浶曞ù鐓庣У閸ㄦ氨绱�?
						MessageMgr.sendMsgNotify(mem, 170019, Arrays.asList(prop.getRolename()));
					}
					WinnerManager.logger.info("閻熸瑦甯熸竟濂縟 "+roleid+"\t闁告艾鏈鐐哄礃閻樻彃鏅介悹鍥ㄦ礈閸嬔勭鐠囨彃顫ら柨娑樻湰閸ㄦ岸宕�?");
				}else{
					//闁告瑦鐗楃粔椋庣磼閻斿墎顏卞ù鐘侯嚙婵拷
					//闂侇偅姘ㄩ悡锟犳⒓閻斿吋姣�
					xbean.Properties prop=xtable.Properties.select(roleid); 
//					long teamleadid=team.getTeamLeaderId();
//					MessageMgr.sendMsgNotify(teamleadid, 160449, Arrays.asList(prop.getRolename()));
					//闂侇偅姘ㄩ悡锟犳⒓閻旈攱鍠�
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


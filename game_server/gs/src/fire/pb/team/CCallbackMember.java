
package fire.pb.team;



import fire.pb.PropRole;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.buff.OperateType;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCallbackMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 閸欘剙娲�
 * @author changhao
 *
 */
public class CCallbackMember extends __CCallbackMember__ {
	
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure callbackMemberP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//妤犲矁鐦夌拠銉潡閼瑰弶妲搁崥锕佺箷閺勵垶妲︽导宥夋Е闂�?
//				Long[] roleids = new Long[team.getAllMemberIds().size()];
//				roleids[0] = leaderRoleId;
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,team.getAllMemberIds()));
				//Lock end
				
				if(!checkTeamStatusValid(leaderRoleId))
				{
					//闂冪喍绱為敍鍫ユЕ闂�鍖＄礆閻ㄥ嫮濮搁幀浣诡劃閺冩湹绗夐懗钘夊将閸ョ偞娈忕粋鑽ゆ畱闂冪喎鎲抽敍鍫滅伐婵″倸婀幋妯绘灍妞嬬偠顢戞稉顓ㄧ礆(illegal)
					TeamManager.logger.debug("闂冪喍绱為敍鍫ユЕ闂�鍖＄礆閻ㄥ嫮濮搁幀浣诡劃閺冩湹绗夐懗钘夊将閸ョ偞娈忕粋濠氭Е閸�?,teamId: " + teamId);
					return true;
				}
				
				PropRole leaderprole = new PropRole(leaderRoleId, true);
				if(leaderprole.getProperties().getCruise() > 0) {
					TeamManager.logger.debug("闂冪喍绱為敍鍫ユЕ闂�鍖＄礆閻ㄥ嫬璐板〒鍝ュЦ閹�?,濮濄倖妞傛稉宥堝厴閸欘剙娲栭弳鍌滎瀲闂冪喎鎲�,teamId: " + teamId);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 160434, null);
					return true;
				}
				
				PropRole callbackprole = new PropRole(memberid, true);
				if(callbackprole.getProperties().getCruise() > 0) {
					TeamManager.logger.debug("閸欘剙娲栭梼鐔锋喅閻ㄥ嫬璐板〒鍝ュЦ閹�?,濮濄倖妞傛稉宥堝厴閸欘剙娲栭弳鍌滎瀲闂冪喎鎲�,teamId: " + teamId);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 160434, null);
					return true;
				}
				
				Long battleid = xtable.Roleid2battleid.select(memberid);
				if (battleid != null)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162134, null);
					return true;
				}
				
				java.util.List<Long> absentList = new java.util.LinkedList<Long>();
				absentList.addAll(team.getAbsentMemberIds());
				java.util.List<Long> callbacklist = new java.util.LinkedList<Long>();
				
				for(long roleId : absentList)
				{
					BuffAgent buffagent = new BuffRoleImpl(roleId);
					if(roleId == memberid && buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM_MEMBER_NORMAL))
					{
						//閼冲�熺箻閸忋儲顒滅敮鍝ュЦ閹胶娈戦梼鐔锋喅閹靛秴褰崬?
						callbacklist.add(roleId);
					}
				}
				//TODO 閸欐垿?浣虹舶閺嗗倻顬囬梼鐔锋喅閸滃苯缍婇梼鐔惰厬闂冪喎鎲抽敍姘舵Е闂�鎸庮劀閸︺劌褰崬?
				if(callbacklist.size() == 0)
				{
					//闂冪喍绱炲▽鈩冩箒閸欘垰褰崬銈囨畱閺嗗倻顬囬梼鐔锋喅
					//psend(leaderRoleId,new STeamError(TeamError.NoAbsentMember));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 150117, null);
					TeamManager.logger.debug("闂冪喎鎲虫稉宥堝厴鐞氼偄褰崶鐐插讲閼宠棄婀幋妯绘灍,teamId: " + teamId);
					return true;
				}
				else
				{
					SAskforCallBack sAskforCallBack = new SAskforCallBack();
					sAskforCallBack.leaderid = leaderRoleId;
					psendWhileCommit(callbacklist, sAskforCallBack);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 140880, null);
				}
				
				
				return true;
			}
		};
		callbackMemberP.submit();
	}
	

	private boolean checkTeamStatusValid(long leaderRoleId)
	{
		BuffAgent agent = new BuffRoleImpl(leaderRoleId);
		return agent.canAddBuff(OperateType.TEAM_CALL_BACK_MEMBER);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794443;

	public int getType() {
		return 794443;
	}

	public long memberid; // 召唤的队员id by changhao

	public CCallbackMember() {
	}

	public CCallbackMember(long _memberid_) {
		this.memberid = _memberid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(memberid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		memberid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCallbackMember) {
			CCallbackMember _o_ = (CCallbackMember)_o1_;
			if (memberid != _o_.memberid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)memberid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(memberid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CCallbackMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(memberid - _o_.memberid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


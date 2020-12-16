
package fire.pb.team;

import java.util.ArrayList;
import java.util.List;

import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAnswerforCallBack__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 恢复召回
 * @author changhao
 *
 */
public class CAnswerforCallBack extends __CAnswerforCallBack__ {
	
	Team team;
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long memberRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (memberRoleId < 0)
			return;
		mkdb.Procedure answerCallbackP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(memberRoleId);
				//先验证队伍是否为�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isInTeam(memberRoleId))
					return true;//验证该角色是否还在队伍中
				long leaderRoleId = team.getTeamInfo().getTeamleaderid();
				Long[] roleids = new Long[2];
				if(leaderRoleId < memberRoleId)
				{
					roleids[0] = leaderRoleId;
					roleids[1] = memberRoleId;
				}
				else
				{
					roleids[0] = memberRoleId;
					roleids[1] = leaderRoleId;
				}
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end
				
				if(agree == 1)
				{
					// 请求回归
					if (team.getTeamMemberState(memberRoleId) != TeamMemberState.eTeamAbsent)
					{
						// 队员不处于暂离中(illegal)
						TeamManager.logger.debug("FAIL:队员不处于暂离中 , memberRoleId" + memberRoleId);
					} else if (!checkMemberReturnStatusValid(memberRoleId))
					{
						// 成员处在不可归队的状态（战斗等）(illegal)
						TeamManager.logger.debug("FAIL:成员处在不可归队的状�? , memberRoleId" + memberRoleId);
					} else
					{
						if (team.isMemberInReturnScale(memberRoleId))
						{
							// 在回归范围之�?
							if (checkTeamReturnStatusValid(team))
							{
								// 队伍处在可以归队的状�?
								// 改变队员为正常状态，并群发更新状态协�?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamNormal);
								// 排序并广播队员新顺序
//								team.updateMemberSequenceWithSendProtocol();
								TeamManager.logger.debugWhileCommit("SUCC:队伍处在可以归队的状态，改变队员为正常状�? , memberRoleId" + memberRoleId);
							} else
							{
								// 队伍处在不可以归队的状�??
								// 改变队员为归队中状�?�，并群发更新状态协�?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamReturn);
								TeamManager.logger.debugWhileCommit("SUCC:成员回归队伍,进入归队中状�? , memberRoleId" + memberRoleId);
							}

						} else
						{
							// 在回归范围之�?
							// TODO 自动寻路找队�? OR 返回不能回归的消�?
							psend(memberRoleId, new STeamError(TeamError.TooFar));
							TeamManager.logger.debug("FAIL:在回归范围之�? , memberRoleId" + memberRoleId);
						}
					}
				}
				else
				{
					List<String> paras = new ArrayList<String>();
					
					xbean.Properties newProperty = xtable.Properties.select(memberRoleId);
					paras.add(newProperty.getRolename());
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 150116, paras);
				}
				return true;
			}
		};
		answerCallbackP.submit();
	}

	//成员处在可以归队的状�??（不是战斗等状�?�）
	private boolean checkMemberReturnStatusValid(long memberRoleId)
	{
		//TODO
		BuffAgent agent = new BuffRoleImpl(memberRoleId);
		if(agent.canAddBuff(BuffConstant.StateType.STATE_TEAM_MEMBER_NORMAL))
			return true;
		else
		{
			MessageMgr.sendMsgNotify(memberRoleId, 141618 , null);
			return false;
		}
	}	
	//队伍处在可以归队的状�??（不是战斗等状�?�）
	private boolean checkTeamReturnStatusValid(Team team)
	{
		//TODO
		return true;
	}
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794457;

	public int getType() {
		return 794457;
	}

	public byte agree; // 0 �ܾ� 1ͬ��

	public CAnswerforCallBack() {
	}

	public CAnswerforCallBack(byte _agree_) {
		this.agree = _agree_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(agree);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		agree = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAnswerforCallBack) {
			CAnswerforCallBack _o_ = (CAnswerforCallBack)_o1_;
			if (agree != _o_.agree) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)agree;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(agree).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAnswerforCallBack _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


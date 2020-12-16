
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSwapMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 交换队员
 * @author changhao
 *
 */
public class CSwapMember extends __CSwapMember__ {
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure swapMemberP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				//先验证队伍是否为�?
				Team team = null;
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				
				if(!checkleaderInTeam(leaderRoleId, team))
				{
					//申请交换的人不是队长（illigal�?
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141192, null);
					TeamManager.logger.debug("FAIL:申请交换的人不是队长,  leaderRoleId:" + leaderRoleId);
				}
				else if(!checkIndexValid(team , index1, index2))
				{
					//申请交换的两队员index不合法（illigal�?
					TeamManager.logger.debug("FAIL:申请交换的两队员index不合�?,  index1: " + index1 + " ;index2: "+ index2);
				}
				else if(!checkMemsberStateValid(team, index1, index2))
				{
					//要交换的两队员必须都处于正常状�??
					psend(leaderRoleId, new STeamError(TeamError.MembersNotNormal));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141193, null);
					TeamManager.logger.debug("FAIL:要交换的两队员必须都处于正常状�??,  index1: " + index1 + " ;index2: "+ index2);
				}
				else
				{
					TeamManager.logger.debug("SUCC:可以交换队员,  index1: " + index1 + " ;index2: "+ index2);
					team.switchTeamMemberWithSP(index1, index2);
//					long roleId1 = team.getTeamInfo().getMembers().get(index1-1).getRoleid();
//					long roleId2 = team.getTeamInfo().getMembers().get(index2-1).getRoleid();
//					team.getTeamInfo().getMembers().get(index2-1).setRoleid(roleId1);
//					team.getTeamInfo().getMembers().get(index1-1).setRoleid(roleId2);
//					
//					//将新顺序广播到所有队�?
//					Set<Long> roleids = new HashSet<Long>();
//					SMemberSequence sMemberSequence = new SMemberSequence();
//					sMemberSequence.teammemeberlist.add(team.getTeamInfo().getTeamleaderid());
//					roleids.add(team.getTeamInfo().getTeamleaderid());
//					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
//					{
//						sMemberSequence.teammemeberlist.add(member.getRoleid());
//						roleids.add(member.getRoleid());
//					}
//					// 将队伍成员顺序发送到�?有成�?
//					xdb.Procedure.psendWhileCommit(roleids, sMemberSequence);
				}
				return true;
			}
			
		};
		swapMemberP.submit();
	}

	

	// 申请者是�?个队伍的队长？只能在Procedure中被调用
	private boolean checkleaderInTeam(long leaderRoleId,Team team)
	{
		if (team != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;
	}
	//index合法�?
	private boolean checkIndexValid(Team team, long index_1, long index_2)
	{
		if(index_1 >= 1 && index_1 <= team.getTeamInfo().getMembers().size() && index_2 >=1 && index_2 <=team.getTeamInfo().getMembers().size() && index_1 != index_2)
			return true;
		else 
			return false;
	}
	//要交换的两队员处于正常状态？
	private boolean checkMemsberStateValid(Team team,  int index_1, int index_2)
	{
		if(team.getTeamInfo().getMembers().get(index_1 - 1).getState() == TeamMemberState.eTeamNormal &&
				team.getTeamInfo().getMembers().get(index_2 - 1).getState() == TeamMemberState.eTeamNormal)
			return true;
		else 
			return false;
	}
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794452;

	public int getType() {
		return 794452;
	}

	public int index1; // index�Ƕ�Ա����ţ�5�˶���Ļ�������0~4
	public int index2;

	public CSwapMember() {
	}

	public CSwapMember(int _index1_, int _index2_) {
		this.index1 = _index1_;
		this.index2 = _index2_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(index1);
		_os_.marshal(index2);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		index1 = _os_.unmarshal_int();
		index2 = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSwapMember) {
			CSwapMember _o_ = (CSwapMember)_o1_;
			if (index1 != _o_.index1) return false;
			if (index2 != _o_.index2) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += index1;
		_h_ += index2;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(index1).append(",");
		_sb_.append(index2).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSwapMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = index1 - _o_.index1;
		if (0 != _c_) return _c_;
		_c_ = index2 - _o_.index2;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


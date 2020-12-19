
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSwapMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 浜ゆ崲闃熷憳
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
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?
				Team team = null;
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				
				if(!checkleaderInTeam(leaderRoleId, team))
				{
					//鐢宠浜ゆ崲鐨勪汉涓嶆槸闃熼暱锛坕lligal锛?
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141192, null);
					TeamManager.logger.debug("FAIL:鐢宠浜ゆ崲鐨勪汉涓嶆槸闃熼暱,  leaderRoleId:" + leaderRoleId);
				}
				else if(!checkIndexValid(team , index1, index2))
				{
					//鐢宠浜ゆ崲鐨勪袱闃熷憳index涓嶅悎娉曪紙illigal锛?
					TeamManager.logger.debug("FAIL:鐢宠浜ゆ崲鐨勪袱闃熷憳index涓嶅悎娉?,  index1: " + index1 + " ;index2: "+ index2);
				}
				else if(!checkMemsberStateValid(team, index1, index2))
				{
					//瑕佷氦鎹㈢殑涓ら槦鍛樺繀椤婚兘澶勪簬姝ｅ父鐘舵??
					psend(leaderRoleId, new STeamError(TeamError.MembersNotNormal));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141193, null);
					TeamManager.logger.debug("FAIL:瑕佷氦鎹㈢殑涓ら槦鍛樺繀椤婚兘澶勪簬姝ｅ父鐘舵??,  index1: " + index1 + " ;index2: "+ index2);
				}
				else
				{
					TeamManager.logger.debug("SUCC:鍙互浜ゆ崲闃熷憳,  index1: " + index1 + " ;index2: "+ index2);
					team.switchTeamMemberWithSP(index1, index2);
//					long roleId1 = team.getTeamInfo().getMembers().get(index1-1).getRoleid();
//					long roleId2 = team.getTeamInfo().getMembers().get(index2-1).getRoleid();
//					team.getTeamInfo().getMembers().get(index2-1).setRoleid(roleId1);
//					team.getTeamInfo().getMembers().get(index1-1).setRoleid(roleId2);
//					
//					//灏嗘柊椤哄簭骞挎挱鍒版墍鏈夐槦鍛?
//					Set<Long> roleids = new HashSet<Long>();
//					SMemberSequence sMemberSequence = new SMemberSequence();
//					sMemberSequence.teammemeberlist.add(team.getTeamInfo().getTeamleaderid());
//					roleids.add(team.getTeamInfo().getTeamleaderid());
//					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
//					{
//						sMemberSequence.teammemeberlist.add(member.getRoleid());
//						roleids.add(member.getRoleid());
//					}
//					// 灏嗛槦浼嶆垚鍛橀『搴忓彂閫佸埌鎵?鏈夋垚鍛?
//					xdb.Procedure.psendWhileCommit(roleids, sMemberSequence);
				}
				return true;
			}
			
		};
		swapMemberP.submit();
	}

	

	// 鐢宠鑰呮槸涓?涓槦浼嶇殑闃熼暱锛熷彧鑳藉湪Procedure涓璋冪敤
	private boolean checkleaderInTeam(long leaderRoleId,Team team)
	{
		if (team != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;
	}
	//index鍚堟硶锛?
	private boolean checkIndexValid(Team team, long index_1, long index_2)
	{
		if(index_1 >= 1 && index_1 <= team.getTeamInfo().getMembers().size() && index_2 >=1 && index_2 <=team.getTeamInfo().getMembers().size() && index_1 != index_2)
			return true;
		else 
			return false;
	}
	//瑕佷氦鎹㈢殑涓ら槦鍛樺浜庢甯哥姸鎬侊紵
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

	public int index1; // index是队员的序号，5人队伍的话，就是0~4
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


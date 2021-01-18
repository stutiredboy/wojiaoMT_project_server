
package fire.pb.team;
import fire.pb.StateCommon;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAnswerforSetLeader__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAnswerforSetLeader extends __CAnswerforSetLeader__ {
	
	private long now = 0L;//procedure瀵�?婵妞傛穱婵嗙摠娑�?娑擃亜缍嬮崜宥嗘闂傝揪绱濇穱婵婄槈濮濐槚rocedure娑擃厽妞傞梻瀵告畱缂佺喍绔撮幀?
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long newLeaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (newLeaderRoleId < 0)
			return;
		mkdb.Procedure setTeamLeaderP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start
				Long teamId = xtable.Roleid2teamid.select(newLeaderRoleId);
				now = System.currentTimeMillis();
				
				//閸忓牓鐛欑拠渚�妲︽导宥嗘Ц閸氾缚璐熺粚?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;

				long oldLeaderRoleId = team.getTeamInfo().getTeamleaderid();
				if(!team.isInTeam(newLeaderRoleId))
				{
					TeamManager.logger.debug("閸ョ偛绨查懓鍛瑝閺勵垯绔存稉顏堟Е娴煎秶娈戦梼鐔锋喅, newLeaderRoleId: " + newLeaderRoleId);
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141056, null);
					psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
					return true;
				}
				if(team.isTeamLeader(newLeaderRoleId))
				{
					TeamManager.logger.debug("閸ョ偛绨查懓鍛嚒缂佸繑妲搁梼鐔兼毐, newLeaderRoleId: " + newLeaderRoleId);
					return true;
				}
				
				Long[] roleids = new Long[2];
				if(oldLeaderRoleId < newLeaderRoleId)
				{
					roleids[0] = oldLeaderRoleId;
					roleids[1] = newLeaderRoleId;
				}
				else
				{
					roleids[0] = newLeaderRoleId;
					roleids[1] = oldLeaderRoleId;
				}
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end

				if(agree == 0)
				{//閹锋帞绮烽幋鎰礋闂冪喖鏆�
					if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
					{
						//閸ョ偛绨查懓鍛瑝閺勵垵顩︽禒璇叉嚒閻ㄥ嫭鏌婇梼鐔兼毐(illegal)
						TeamManager.logger.debug("FAIL:閸ョ偛绨查懓鍛瑝閺勵垵顩︽禒璇叉嚒閻ㄥ嫭鏌婇梼鐔兼毐, teamId: " + teamId);
						psend(oldLeaderRoleId, new STeamError(TeamError.AbsentCantBeLeader));
						return true;
					}
					team.getTeamInfo().setSwitchleaderid(-1);
					team.getTeamInfo().setSwitchleadertime(-1);
					psend(oldLeaderRoleId, new STeamError(TeamError.RefuseChangeLeader));
					TeamManager.logger.debug("SUCC:閹锋帞绮烽幋鎰礋闂冪喖鏆�, roleid: " + newLeaderRoleId);
					return true;
				}

				if (checkPvP(oldLeaderRoleId, newLeaderRoleId) != 0) {
					return true;
				}

				if(!checkLeaderOnline(newLeaderRoleId))
				{
					//閸ョ偛绨查懓鍛瑝閸︺劎鍤�(illegal)
					TeamManager.logger.debug("FAIL:閸ョ偛绨查懓鍛瑝閸︺劎鍤�, roleid: " + newLeaderRoleId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//閸ョ偛绨查懓鍛槱娴滃酣娼锝呯埗閻樿埖?渚婄礄閺嗗倻顬囬妴浣风瑓缁捐法鐡戦敍?(illegal)
					TeamManager.logger.debug("FAIL:閸ョ偛绨查懓鍛槱娴滃酣娼锝呯埗閻樿埖?渚婄礄閺嗗倻顬囬妴浣风瑓缁捐法鐡戦敍?, roleid: " + newLeaderRoleId);
					MessageMgr.psendMsgNotifyWhileCommit(team.getTeamLeaderId(), 141671, null);
					MessageMgr.psendMsgNotifyWhileCommit(newLeaderRoleId, 141671, null);
				}
				else if(!checkTeamStatusValid(team))
				{
					//闂冪喍绱炴径鍕艾娑撳秴褰查幑銏ゆЕ闂�璺ㄥЦ閹緤绱欐鐐额攽閹存牗鍨弬妞剧瑝閼虫枻绱�(illegal)
					TeamManager.logger.debug("FAIL:闂冪喍绱炴径鍕艾娑撳秴褰查幑銏ゆЕ闂�璺ㄥЦ閹緤绱欐鐐额攽閹存牗鍨弬妞剧瑝閼虫枻绱�, teamId: " + teamId);
				}
				else if(!checkTeamInSwitchStatus(team))
				{
					//闂冪喍绱炴稉宥咁槱娴滃孩娲块幑銏ゆЕ闂�璺ㄦ暤鐠囬濮搁幀浣瑰灗閼板懓绉撮弮?(illegal)
					TeamManager.logger.debug("FAIL:闂冪喍绱炴稉宥咁槱娴滃孩娲块幑銏ゆЕ闂�璺ㄦ暤鐠囬濮搁幀浣瑰灗閼板懓绉撮弮?, teamId: " + teamId);
				}
				else if(!checkAnwserIsNewLeader(team, newLeaderRoleId))
				{
					//閸ョ偛绨查懓鍛瑝閺勵垵顩︽禒璇叉嚒閻ㄥ嫭鏌婇梼鐔兼毐(illegal)
					TeamManager.logger.debug("FAIL:閸ョ偛绨查懓鍛瑝閺勵垵顩︽禒璇叉嚒閻ㄥ嫭鏌婇梼鐔兼毐, teamId: " + teamId);
				}
				/*else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//闂冪喍绱�2閸掑棝鎸撻崣顏囧厴閺囧瓨宕查梼鐔兼毐娑�?濞�?
					psend(newLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					TeamManager.logger.debug("FAIL:闂冪喍绱�2閸掑棝鎸撻崣顏囧厴閺囧瓨宕查梼鐔兼毐娑�?濞�?, teamId: " + teamId);
				}*/
				else
				{
					
					//xbean.TeamInfo team = xtable.Team.get(team);
					if(team.switchTeamLeaderWithSP(newLeaderRoleId))
					{
						team.getTeamInfo().setSuccessswitchtime(now);
						TeamManager.logger.debugWhileCommit("SUCC:闂冪喍绱為弴瀛樺床闂冪喖鏆�, teamId: " + teamId);
					}
					else
						TeamManager.logger.debug("FAIL:闂冪喍绱為弴瀛樺床闂冪喖鏆辨径杈Е, teamId: " + teamId);
				}
					 
				return true;
			}
		};
		setTeamLeaderP.submit();
	}

	// 濡�?濞村└VP
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 閸ョ偟鐡熼弰顖氭儊閹恒儱褰堥梼鐔兼毐娴犺鎳�
		return fire.pb.battle.pvp.PvPTeamHandle.onAnswerforSetLeader(oldLeaderRoleId, newLeaderRoleId);
	}

	// 閸ョ偛绨查懓鍛躬缁�??閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏閿涘矂鏀eaderRoleId閻ㄥ墔olelock
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//閸ョ偛绨查懓鍛槱娴滃孩顒滅敮鍝ュЦ閹緤绱甸崣顏囧厴閸︹墥rocedure娑擃叀顫︾拫鍐暏
	private boolean checkNewLeaderNormal(Team team, long memberRoleId)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		for(xbean.TeamMember member: team.getTeamInfo().getMembers())
		{
			if(member.getRoleid() == memberRoleId && member.getState() == fire.pb.team.TeamMemberState.eTeamNormal)
				return true;
		}
		return false;
	}
	
	
	//闂冪喍绱炴径鍕艾閸欘垯浜掗幑銏ゆЕ闂�璺ㄦ畱閻樿埖?渚婄吹閿涘牓顥ｇ悰宀嬬礉閹存ɑ鏋熸稉顓濈瑝閼宠姤宕查梼鐔兼毐閿涘矁绻曢張澶婂従娴犳牜濮搁幀浣告偋閿涚噦绱�
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent agent = new BuffRoleImpl(team.getTeamLeaderId(),true);
		int conflictId = agent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//闂冪喍绱炴径鍕艾閺囧瓨宕查梼鐔兼毐閻㈠疇顕悩鑸�?浣歌嫙娑撴梹婀搾鍛閿�?
	private boolean checkTeamInSwitchStatus(Team team)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		if(team.getTeamInfo().getSwitchleaderid() == -1)
			return false;
		else if((now - team.getTeamInfo().getSwitchleadertime()) > TeamManager.MAX_INVITE_TIMEOUT )
		{
			team.getTeamInfo().setSwitchleaderid(-1);
			return false;
		}
		else
			return true;
	}
	
	//閸ョ偛绨查懓鍛皑閺勵垱鏌婇梼鐔兼毐閿�?
	private boolean checkAnwserIsNewLeader(Team team , long newLeaderId)
	{
		if(team.getTeamInfo().getSwitchleaderid() == newLeaderId)
			return true;
		else
			return false;
	}
	
	//闂冪喍绱�2閸掑棝鎸撻崘鍛弓閹存劕濮涢弴瀛樺床鏉╁洭妲﹂梹鍖＄吹
	private boolean checkTeamNoSuccSwitchIn2min(Team team)
	{
		if((now - team.getTeamInfo().getSuccessswitchtime()) > TeamManager.MIN_SUCCESS_SWITCH_LEADER_PERIOD )
			return true;
		else
			return false;
	}
	
	
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794455;

	public int getType() {
		return 794455;
	}

	public byte agree; // 0 拒绝 1同意

	public CAnswerforSetLeader() {
	}

	public CAnswerforSetLeader(byte _agree_) {
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
		if (_o1_ instanceof CAnswerforSetLeader) {
			CAnswerforSetLeader _o_ = (CAnswerforSetLeader)_o1_;
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

	public int compareTo(CAnswerforSetLeader _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


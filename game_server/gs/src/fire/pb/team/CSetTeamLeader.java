
package fire.pb.team;
import fire.pb.StateCommon;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetTeamLeader__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 鐠佸墽鐤嗛梼鐔兼毐
 * @author changhao
 *
 */
public class CSetTeamLeader extends __CSetTeamLeader__ {
	private long now = 0L;//procedure瀵�?婵妞傛穱婵嗙摠娑�?娑擃亜缍嬮崜宥嗘闂傝揪绱濇穱婵婄槈濮濐槚rocedure娑擃厽妞傞梻瀵告畱缂佺喍绔撮幀?
	
	Team team;
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long oldLeaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (oldLeaderRoleId < 0)
			return;
		final long newLeaderRoleId = roleid;
		mkdb.Procedure setTeamLeaderP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(oldLeaderRoleId);
				//閸忓牓鐛欑拠渚�妲︽导宥嗘Ц閸氾缚璐熺粚?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(oldLeaderRoleId))
					return true;//妤犲矁鐦夐崢鐔兼Е闂�鎸庢Ц閸氾箒绻曢弰顖炴Е娴煎秶娈戦梼鐔兼毐
				if(!team.isInTeam(newLeaderRoleId))
					return true;//妤犲矁鐦夐弬浼存Е闂�鎸庢Ц閸氾箑婀梼鐔剁礊娑�?
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

				now = System.currentTimeMillis();

				if (checkPvP(oldLeaderRoleId, newLeaderRoleId) != 0) {
					return true;
				}

				if(!checkLeaderOnline(oldLeaderRoleId))
				{
					//閻㈠疇顕懓鍛瑝閸︺劎鍤庨敍鍧昹legal閿�?
					TeamManager.logger.debug("FAIL:閻㈠疇顕懓鍛瑝閸︺劎鍤�,LeaderID: " +oldLeaderRoleId);
				}
				else if(!checkTeamStatusValid(team))
				{
					//闂冪喍绱炴径鍕艾娑撳秴褰叉禒銉﹀床闂冪喖鏆遍惃鍕Ц閹緤绱欓幋妯绘灍娑擃厺绗夐懗鑺ュ床闂冪喖鏆遍敍?(illegal)
					TeamManager.logger.debug("FAIL:闂冪喍绱炴径鍕艾娑撳秴褰叉禒銉﹀床闂冪喖鏆遍惃鍕Ц閹緤绱欐笟瀣洤妞嬬偠顢戦妴浣瑰灛閺傛绱�,teamId: " +teamId);
				}
				else if(!checkTeamNotInSwitchStatus(team))
				{
					//闂冪喍绱炴径鍕艾閺囧瓨宕查梼鐔兼毐閻㈠疇顕悩鑸�??
					//psend(oldLeaderRoleId, new STeamError(TeamError.InChangeLeaderStatus));
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 141210, null);
					TeamManager.logger.debug("FAIL:闂冪喍绱炴径鍕艾閺囧瓨宕查梼鐔兼毐閻㈠疇顕悩鑸�??,teamId: " +teamId);
				}
				else if(!checkTeamNoSuccSwitchIn2min(team))
				{
					//闂冪喍绱�2閸掑棝鎸撻崘鍛灇閸旂喐娲块幑銏ｇ箖闂冪喖鏆�
					//psend(oldLeaderRoleId, new STeamError(TeamError.ChangeLeaderInCD));
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 141209, null);
					TeamManager.logger.debug("FAIL:闂冪喍绱�2閸掑棝鎸撻崘鍛灇閸旂喐娲块幑銏ｇ箖闂冪喖鏆�,teamId: " +teamId);
				}
				else if(!checkNewLeaderNormal(team, newLeaderRoleId))
				{
					//閺備即妲﹂梹澶哥瑝婢跺嫪绨锝呯埗閻樿埖??(閺嗗倻顬囬妴浣侯瀲缁捐法鐡戦悩鑸�??)閿涘潟llgal閿�?
					psend(newLeaderRoleId, new STeamError(TeamError.MembersNotNormal));
					TeamManager.logger.debug("FAIL:閺備即妲﹂梹澶哥瑝婢跺嫪绨锝呯埗閻樿埖??,newLeaderRoleId: " +newLeaderRoleId);
				}
				else if(StateCommon.isTrusteeshipState(newLeaderRoleId)) //婵″倹鐏夐崷銊︽煀闂冪喖鏆遍崷銊﹀缁狅紕濮搁幀浣疯厬 by changhao
				{
					fire.pb.talk.MessageMgr.psendMsgNotify(oldLeaderRoleId, 160408, null);
				}
				else
				{
					BuffAgent buffagent = new BuffRoleImpl(newLeaderRoleId);
					if (!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER))
					{
						// 閺備即妲﹂梹鍨槱娴滃簼绗夐懗钘夌秼闂冪喖鏆遍惃鍕Ц閹�?
						TeamManager.logger.debug("FAIL:閺備即妲﹂梹鍨槱娴滃簼绗夐懗钘夌秼闂冪喖鏆遍惃鍕Ц閹�?,newLeaderRoleId: " + newLeaderRoleId);
					} else
					{
						TeamManager.logger.debug("SUCC:閸欘垯浜掗崣鎴濆毉閺囧瓨宕查梼鐔兼毐闁�?鐠�?,teamId: " + teamId);
						team.getTeamInfo().setSwitchleaderid(newLeaderRoleId);
						team.getTeamInfo().setSwitchleadertime(now);
						SAskforSetLeader sAskforSetLeader = new SAskforSetLeader();
						sAskforSetLeader.leaderid = oldLeaderRoleId;
						
						TeamManager.getInstance().delTeamMatch(oldLeaderRoleId); //娴溿倖宕查梼鐔兼毐缁傝绱戦崠褰掑帳 by changhao
						
						psendWhileCommit(oldLeaderRoleId, new SRequestSetLeaderSucc(newLeaderRoleId));
						psendWhileCommit(newLeaderRoleId, sAskforSetLeader);
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(oldLeaderRoleId, 141251, null);
					}
				}

				return true;
			}
		};
		setTeamLeaderP.submit();
		
	}

	// 濡�?濞村└VP
	private static int checkPvP(long oldLeaderRoleId, long newLeaderRoleId) {
		// 闁插秵鏌婄拋鍓х枂闂冪喖鏆�
		return fire.pb.battle.pvp.PvPTeamHandle.onSetTeamLeader(oldLeaderRoleId, newLeaderRoleId);
	}

//	// 閻㈠疇顕懓鍛Ц娑�?娑擃亪妲︽导宥囨畱闂冪喖鏆遍敍鐔峰涧閼宠棄婀狿rocedure娑擃叀顫︾拫鍐暏
//	private boolean checkOldLeaderInTeam(long leaderRoleId,Team team)
//	{
//		if(team.getTeamInfo().getTeamleaderid() == leaderRoleId)
//			return true;
//		else
//			return false;
//	}
	
	// 閻㈠疇顕懓鍛躬缁�??閸欘亣鍏橀崷鈮抮ocedure娑擃叀顫︾拫鍐暏
	private boolean checkLeaderOnline(long leaderRoleId)
	{
		if(StateCommon.isOnline(leaderRoleId))
			return true;
		else
			return false;
	}
	
	//闂冪喍绱炴径鍕艾閸欘垯浜掗幑銏ゆЕ闂�璺ㄦ畱閻樿埖?渚婄吹閿涘牓顥ｇ悰宀嬬礉閹存ɑ鏋熸稉顓濈瑝閼宠姤宕查梼鐔兼毐閿涘矁绻曢張澶婂従娴犳牜濮搁幀浣告偋閿涚噦绱�
	private boolean checkTeamStatusValid(Team team)
	{
		BuffAgent buffagent = new BuffRoleImpl(team.getTeamLeaderId());
		int conflictId = buffagent.checkCanAddBuff(BuffConstant.StateType.STATE_TEAM_LEADER);
		return conflictId == 0;
	}
	
	//闂冪喍绱炴稉宥咁槱娴滃孩娲块幑銏ゆЕ闂�璺ㄦ暤鐠囬濮搁幀渚婄吹
	private boolean checkTeamNotInSwitchStatus(Team team)
	{
		if(team.getTeamInfo().getSwitchleaderid() == -1)
			return true;
		else if((now - team.getTeamInfo().getSwitchleadertime()) > TeamManager.MAX_INVITE_TIMEOUT )
		{
			team.getTeamInfo().setSwitchleaderid(-1);
			return true;
		}
		else
			return false;
	}
	
	//闂冪喍绱�2閸掑棝鎸撻崘鍛弓閺囧瓨宕叉潻鍥Е闂�鍖＄吹
	private boolean checkTeamNoSuccSwitchIn2min(Team team)
	{
		if((now - team.getTeamInfo().getSuccessswitchtime()) > TeamManager.MIN_SUCCESS_SWITCH_LEADER_PERIOD )
			return true;
		else
			return false;
	}
	
	//閺備即妲﹂梹鍨槱娴滃孩顒滅敮鍝ュЦ閹緤绱甸崣顏囧厴閸︹墥rocedure娑擃叀顫︾拫鍐暏
	private boolean checkNewLeaderNormal(Team team, long memberRoleId)
	{
		for(xbean.TeamMember member: team.getTeamInfo().getMembers())
		{
			if(member.getRoleid() == memberRoleId)
			{
				if(member.getState() == TeamMemberState.eTeamAbsent)
					return false;
				else
					return true;
			}
		}
		return false;
	}
	
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794444;

	public int getType() {
		return 794444;
	}

	public long roleid;

	public CSetTeamLeader() {
	}

	public CSetTeamLeader(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetTeamLeader) {
			CSetTeamLeader _o_ = (CSetTeamLeader)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetTeamLeader _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


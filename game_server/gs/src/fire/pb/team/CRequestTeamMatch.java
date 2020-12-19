
package fire.pb.team;
import fire.pb.main.ConfigManager;
import fire.pb.talk.MessageMgr;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestTeamMatch__ extends mkio.Protocol { }

/** 最新加入功能 by changhao
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 鍔犲叆鍖归厤
 * @author changhao
 *
 */
public class CRequestTeamMatch extends __CRequestTeamMatch__ {
	@Override
	protected void process() {
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestteammatch = new mkdb.Procedure()
		{
			@Override
			/*鍔犻攣椤哄簭 team->roleid->match by changhao*/
			protected boolean process()
			{	
				if (!checkLevel()) //妫?鏌ョ瓑绾? by changhao
				{
					psend(roleid, new STeamError(TeamError.LevelError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch鍖归厤绛夌骇璁剧疆閿欒 "+roleid);
					return true;					
				}
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //鐐瑰崱鏈嶅姟鍣? by changhao
				{
					DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(targetid);
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:鐩爣ID閿欒 "+roleid);
						return true;					
					}						
				}
				else
				{
					STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(targetid);
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:鐩爣ID閿欒 "+roleid);
						return true;					
					}					
				}
				
				Long clanfightid = xtable.Roleid2clanfightid.select(roleid);
				if (clanfightid != null)//鍏細鎴樺満涓笉鑳借嚜鍔ㄥ尮閰? by changhao
				{ 
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410040, null);
					return true;
				}
								
				Long teamid = xtable.Roleid2teamid.select(roleid);
				
				Team team = null;
				
				final java.util.ArrayList<Long> roleids = new java.util.ArrayList<Long>();
				if(teamid != null)
				{
					team = TeamManager.getTeamByTeamID(teamid);	//鏈夐槦鍏堟妸闃熶紞閿佷綇 by changhao
					
					if (!team.isTeamLeader(roleid))
					{
						psend(roleid, new STeamError(TeamError.SelfNOtLeader));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:涓嶆槸闃熼暱涓嶈兘鑷姩鍖归厤 "+roleid);
						return true;						
					}
					else if (team.getTeamInfo().getMembers().size() >= TeamManager.MAX_MEMBER_COUNT)
					{
						psend(roleid, new STeamError(TeamError.TeamFull));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闃熶紞婊′簡 "+roleid);
						return true;						
					}
					
					team.getTeamInfo().setTargetid(targetid);
					team.getTeamInfo().setMinlevel(levelmin);
					team.getTeamInfo().setMaxlevel(levelmax);
					
					//閿佹墍鏈変汉  by changhao
					roleids.addAll(team.getAllMemberIds());
					this.lock(xtable.Locks.ROLELOCK, roleids);
				}
				else
				{
					roleids.add(roleid);
				}
				
				Long roleidteamId = xtable.Roleid2teamid.get(roleid);
				if (teamid != roleidteamId)
				{
					psend(roleid, new STeamError(TeamError.UnkownError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch:闃熶紞ID鏈夊彉鍖? "+roleid);
					return true;
				}
				
				if (!checkTeamState(team, roleid)) //妫?鏌ラ槦浼嶇姸鎬? by changhao
				{
					psend(roleid, new STeamError(TeamError.TeamStateError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch缁勯槦鍖归厤瀹㈡埛绔湇鍔″櫒涓嶅悓姝? "+roleid);
					return true;
				}
				
				if (!checkTeamMemberNum(team)) //妫?鏌ラ槦浼嶄汉鏁? by changhao
				{
					psend(roleid, new STeamError(TeamError.TeamEnoughFull));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch闃熶紞宸茬粡缁勬弧 "+roleid);
					return true;												
				}
				
				if (!checkFaction(roleid)) //妫?鏌ラ棬娲? by changhao
				{
					psend(roleid, new STeamError(TeamError.NoFaction));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch娌℃湁宸ヤ細 "+roleid);
					return true;					
				}
				
				if (!checkActiveTime()) //妫?鏌ユ椿鍔ㄥ紑鏀炬椂闂? by changhao
				{
					psend(roleid, new STeamError(TeamError.ActiveNotOpen));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch娲诲姩鏈紑鏀? "+roleid);
					return true;						
				}
				
				/*if (fire.pb.buff.Module.existState(roleid,
						BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
					psend(roleid, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:鍦ㄥ壇鏈腑鍟? "+roleid);
					return true;
				}*/

				if (checkPvP(roleid) != 0) {
					return true;
				}

				addTeamMatch(roleid, roleidteamId); //鍔犱竴涓尮閰嶅埌琛? by changhao
								
				SRequestTeamMatch msg = new SRequestTeamMatch();
				msg.levelmin = levelmin;
				msg.levelmax = levelmax;
				msg.targetid = targetid;
				msg.typematch = typematch;
				
				for (Long roleid : roleids)
				{
					mkdb.Procedure.psendWhileCommit(roleid, msg);					
				}
				
				return true;
			}
			
		};
		requestteammatch.submit();	
	}
	
	private void addTeamMatch(long roleid, Long teamid)
	{
		xbean.TeamMatch teammatch = xbean.Pod.newTeamMatch();
		
		teammatch.setRoleid(roleid);
		teammatch.setLevelmin(this.levelmin);
		teammatch.setLevelmax(this.levelmax);
		teammatch.setTargetid(this.targetid);
		teammatch.setMatchtype(typematch);
		teammatch.setOnekeytimestamp(0);
		teammatch.setTimestamp(0);
		
		TeamManager.getInstance().addTeamMatch(teammatch, teamid);			
	}
	
	private boolean checkTeamState(Team team, long roleid) //妫?鏌ョ粍闃熺姸鎬佸拰瀹㈡埛绔槸鍚﹀尮閰? by changhao
	{
		if (this.typematch == 0 && team == null)
		{			
			return true;
		}
		
		if (this.typematch == 1 && team != null)
		{
			return team.isTeamLeader(roleid);
			
		}
		
		return false;
	}
	
	private boolean checkLevel() //妫?鏌ョ瓑绾х浉鍏抽敊璇? by changhao
	{
		if (this.levelmin > this.levelmax)
		{
			return false;
		}
		
		if (this.levelmin <= 0 || this.levelmax <= 0)
		{
			return false;
		}
		
		//鍙栬〃鏁版嵁妫?鏌ユ槸鍚﹁寖鍥村唴 by changhao
		
		return true;
	}
	
	private boolean checkTeamMemberNum(Team team) //妫?鏌ヤ汉鏁? by changhao
	{
		return true;	
	}
	
	private boolean checkFaction(long roleid) //妫?鏌ュ叕浼氱浉鍏? by changhao
	{
		return true;
	}
	
	private boolean checkActiveTime() //妫?鏌ユ椿鍔ㄦ椂闂? by changhao
	{
		
		return true;
	}

	// 妫?娴婸VP
	private static int checkPvP(long roleId) {
		// 璇锋眰鑷姩鍖归厤
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestTeamMatch(roleId);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794494;

	public int getType() {
		return 794494;
	}

	public int typematch; // 类型为0是个人组队匹配1是队伍匹配 by changhao
	public int targetid; // 目标id by changhao
	public int levelmin; // 等级下限 如果是个人匹配这个忽略 by changhao
	public int levelmax; // 等级上限 如果是个人匹配这个忽略 by changhao

	public CRequestTeamMatch() {
	}

	public CRequestTeamMatch(int _typematch_, int _targetid_, int _levelmin_, int _levelmax_) {
		this.typematch = _typematch_;
		this.targetid = _targetid_;
		this.levelmin = _levelmin_;
		this.levelmax = _levelmax_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(typematch);
		_os_.marshal(targetid);
		_os_.marshal(levelmin);
		_os_.marshal(levelmax);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		typematch = _os_.unmarshal_int();
		targetid = _os_.unmarshal_int();
		levelmin = _os_.unmarshal_int();
		levelmax = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestTeamMatch) {
			CRequestTeamMatch _o_ = (CRequestTeamMatch)_o1_;
			if (typematch != _o_.typematch) return false;
			if (targetid != _o_.targetid) return false;
			if (levelmin != _o_.levelmin) return false;
			if (levelmax != _o_.levelmax) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += typematch;
		_h_ += targetid;
		_h_ += levelmin;
		_h_ += levelmax;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(typematch).append(",");
		_sb_.append(targetid).append(",");
		_sb_.append(levelmin).append(",");
		_sb_.append(levelmax).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestTeamMatch _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = typematch - _o_.typematch;
		if (0 != _c_) return _c_;
		_c_ = targetid - _o_.targetid;
		if (0 != _c_) return _c_;
		_c_ = levelmin - _o_.levelmin;
		if (0 != _c_) return _c_;
		_c_ = levelmax - _o_.levelmax;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


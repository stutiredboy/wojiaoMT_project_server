
package fire.pb.team;
import fire.pb.StateCommon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestSetTeamLevel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 閻犱礁澧介悿鍡涙⒓閻斿墎绀婄紒娑橆槺妤狅拷
 * @author changhao
 *
 */
public class CRequestSetTeamLevel extends __CRequestSetTeamLevel__ {

	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure setTeamLevelP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//濡ょ姴鐭侀惁澶屾嫚閵夘煈娼￠柤鐟板级濡叉悂宕ラ敃浣虹闁哄嫷鍨跺Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗭拷
				Long[] roleids = new Long[1];
				roleids[0] = leaderRoleId;
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end
				
				if(!checkOnline(leaderRoleId))
				{
					//閻犱礁澧介悿鍡涙嚀閸涱剛鐟濋柛锔哄妿閸ゅ酣鏁嶉崸鏄筶egal闁匡拷?
					TeamManager.logger.debug("FAIL:閻犱礁澧介悿鍡涙嚀閸涱剛鐟濋柛锔哄妿閸わ拷,roleid: " + leaderRoleId);
				}
				else if(!checkSetedLevelValid(minlevel, maxlevel))
				{
					//閻犱礁澧介悿鍡涙儍閸曨厾鎼肩紒鐙欏倻鐟濋柛姘墛绾爼鏁嶉崸鏄筶egal闁匡拷?
					TeamManager.logger.debug("FAIL:閻犱礁澧介悿鍡涙儍閸曨厾鎼肩紒鐙欏倻鐟濋柛姘墛绾拷,minlevel: " + minlevel + " ;maxlevel: "+maxlevel);
				}
				else
				{
					TeamManager.logger.debug("SUCC:闁告瑯鍨禍鎺旀媼閸撗呮瀭闂傚啰鍠嶇槐鐐电驳婢跺矂鐛撻悷鏇氱劍閻拷, minlevel: " + minlevel + " ;maxlevel: "+maxlevel);
					team.getTeamInfo().setMinlevel(minlevel);
					team.getTeamInfo().setMaxlevel(maxlevel);
					SSetTeamLevel sSetTeamLevel = new SSetTeamLevel();
					sSetTeamLevel.minlevel = minlevel;
					sSetTeamLevel.maxlevel = maxlevel;					
					mkdb.Procedure.psendWhileCommit(team.getTeamBroadcastSet(), sSetTeamLevel);//缂傚洢鍊曡ぐ鍌炴⒓閻斿墎绀婄紒娑橆槺妤犲洭妫�?婵懓鍊歌ぐ澶愬即?
				}
				return true;
			}
		};
		setTeamLevelP.submit();
	}

	//閻犱礁澧介悿鍡涙嚀閸涱厽韬紒鎯у皡缁辩敻宕ｉ鍥у幋闁革腹澧ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkOnline(long roleId)
	{
		if(StateCommon.isOnline(roleId))
			return true;
		else
			return false;
	}	
	
	// 閻犱礁澧介悿鍡涙嚀閸涱喗笑濞戯拷?濞戞搩浜Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗛亶鏁嶉悢宄版锭闁煎疇妫勫﹢鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	@SuppressWarnings("unused")
	private boolean checkLeaderInTeam(long leaderRoleId,Team team)
	{
		if(team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;
	}
	
	//閻犱礁澧介悿鍡涙儍閸曨厾鎼肩紒鐙欏啯鍊ゆ繛澶嬫穿缁辩敻宕ｉ鍥у幋闁革腹澧ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkSetedLevelValid(int minLevel,int maxLevel)
	{
		if(minLevel > maxLevel)
			return false;
		else if( minLevel < TeamManager.LEVEL_REQUST_MIN || minLevel > TeamManager.LEVEL_REQUST_MAX )
			return false;
		else if( maxLevel < TeamManager.LEVEL_REQUST_MIN || maxLevel > TeamManager.LEVEL_REQUST_MAX)
			return false;
		else 
			return true;
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794462;

	public int getType() {
		return 794462;
	}

	public int minlevel;
	public int maxlevel;

	public CRequestSetTeamLevel() {
	}

	public CRequestSetTeamLevel(int _minlevel_, int _maxlevel_) {
		this.minlevel = _minlevel_;
		this.maxlevel = _maxlevel_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(minlevel);
		_os_.marshal(maxlevel);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		minlevel = _os_.unmarshal_int();
		maxlevel = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestSetTeamLevel) {
			CRequestSetTeamLevel _o_ = (CRequestSetTeamLevel)_o1_;
			if (minlevel != _o_.minlevel) return false;
			if (maxlevel != _o_.maxlevel) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += minlevel;
		_h_ += maxlevel;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(minlevel).append(",");
		_sb_.append(maxlevel).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestSetTeamLevel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = minlevel - _o_.minlevel;
		if (0 != _c_) return _c_;
		_c_ = maxlevel - _o_.maxlevel;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


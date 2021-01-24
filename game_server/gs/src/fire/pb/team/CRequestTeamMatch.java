
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
 * 闁告梻濮撮崣鍡涘礌瑜版帒甯�
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
			/*闁告梻濞�閺�锝嗐亜閸濆嫮纰� team->roleid->match by changhao*/
			protected boolean process()
			{	
				if (!checkLevel()) //婵★拷?闁哄被鍎抽悺鎴犵棯? by changhao
				{
					psend(roleid, new STeamError(TeamError.LevelError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch闁告牕缍婇崢銈囩驳婢跺矂鐛撻悹浣稿⒔閻ゅ棝鏌ㄥ▎鎺濆殩 "+roleid);
					return true;					
				}
				
				if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闁绘劗鎳撳畷閬嶅嫉瀹ュ懎顫ら柛锟�? by changhao
				{
					DSTeamMatchInfo config = ConfigManager.getInstance().getConf(DSTeamMatchInfo.class).get(targetid);
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闁烩晩鍠楅悥顤廌闂佹寧鐟ㄩ锟� "+roleid);
						return true;					
					}						
				}
				else
				{
					STeamMatchInfo config = ConfigManager.getInstance().getConf(STeamMatchInfo.class).get(targetid);
					if (config == null)
					{
						psend(roleid, new STeamError(TeamError.NoTarget));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闁烩晩鍠楅悥顤廌闂佹寧鐟ㄩ锟� "+roleid);
						return true;					
					}					
				}
				
				Long clanfightid = xtable.Roleid2clanfightid.select(roleid);
				if (clanfightid != null)//闁稿浚鍏涚槐浼村箣濡儤绨氬☉鎿冨幒缁楀鎳楅崐鐔锋闁告柣鍔岀亸顕�鏌�? by changhao
				{ 
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410040, null);
					return true;
				}
								
				Long teamid = xtable.Roleid2teamid.select(roleid);
				
				Team team = null;
				
				final java.util.ArrayList<Long> roleids = new java.util.ArrayList<Long>();
				if(teamid != null)
				{
					team = TeamManager.getTeamByTeamID(teamid);	//闁哄牆顦靛Σ锕傚礂閸喎惟闂傚啰鍠嶇槐鐐烘煥娴ｉ绉� by changhao
					
					if (!team.isTeamLeader(roleid))
					{
						psend(roleid, new STeamError(TeamError.SelfNOtLeader));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:濞戞挸绉靛Σ鎼佹⒓閻斿吋姣愬☉鎾崇Х閸忔﹢鎳涢鍕楅柛鏍х秺閸橈拷 "+roleid);
						return true;						
					}
					else if (team.getTeamInfo().getMembers().size() >= TeamManager.MAX_MEMBER_COUNT)
					{
						psend(roleid, new STeamError(TeamError.TeamFull));
						TeamManager.logger.debug("FAIL:CRequestTeamMatch:闂傚啰鍠嶇槐鐐差煥閳ヨ尙鍟� "+roleid);
						return true;						
					}
					
					team.getTeamInfo().setTargetid(targetid);
					team.getTeamInfo().setMinlevel(levelmin);
					team.getTeamInfo().setMaxlevel(levelmax);
					
					//闂佸じ鐒︽晶宥夊嫉婢跺鐪�  by changhao
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
					TeamManager.logger.debug("FAIL:CRequestTeamMatch:闂傚啰鍠嶇槐婵盌闁哄牆顦ぐ澶愬礌? "+roleid);
					return true;
				}
				
				if (!checkTeamState(team, roleid)) //婵★拷?闁哄被鍎靛Σ锔藉瀹ュ洤笑闁癸拷? by changhao
				{
					psend(roleid, new STeamError(TeamError.TeamStateError));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch缂備礁瀚板Σ锕傚礌瑜版帒甯抽悗骞垮灪閸╂稓绮╅娑欑疀闁告柡锟借櫕鐝ゅ☉鎾崇Т閹挸顫�? "+roleid);
					return true;
				}
				
				if (!checkTeamMemberNum(team)) //婵★拷?闁哄被鍎靛Σ锔藉瀹ュ嫭鐪介柡锟�? by changhao
				{
					psend(roleid, new STeamError(TeamError.TeamEnoughFull));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch闂傚啰鍠嶇槐鐐差啅閼碱剛鐥呯紓浣稿瀵拷 "+roleid);
					return true;												
				}
				
				if (!checkFaction(roleid)) //婵★拷?闁哄被鍎靛Λ顒�煤? by changhao
				{
					psend(roleid, new STeamError(TeamError.NoFaction));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch婵炲备鍓濆﹢浣割啅閵夈倗绐� "+roleid);
					return true;					
				}
				
				if (!checkActiveTime()) //婵★拷?闁哄被鍎插鍧楀礉閵娿儳纾婚柡锟介悙顒侇槯闂傦拷? by changhao
				{
					psend(roleid, new STeamError(TeamError.ActiveNotOpen));
					TeamManager.logger.debug("FAIL:CRequestTeamMatch婵炶尪顕ф慨鈺呭嫉椤忓嫮纾婚柡锟�? "+roleid);
					return true;						
				}
				
				/*if (fire.pb.buff.Module.existState(roleid,
						BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
					psend(roleid, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:闁革负鍔屾竟鍥嫉椤戣儻鍘柛锟�? "+roleid);
					return true;
				}*/

				if (checkPvP(roleid) != 0) {
					return true;
				}

				addTeamMatch(roleid, roleidteamId); //闁告梻濮崇粩瀛樼▔椤忓嫬鐖遍梺鏉跨Т閸╁瞼鎮�? by changhao
								
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
	
	private boolean checkTeamState(Team team, long roleid) //婵★拷?闁哄被鍎崇划宥夋⒓閻斿搫笑闁诡兛绀侀幏鎵拷骞垮灪閸╂稓绮╅娑櫺﹂柛姘剧畱鐏忣噣鏌�? by changhao
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
	
	private boolean checkLevel() //婵★拷?闁哄被鍎抽悺鎴犵棯瑜忓ù澶愬礂閹惰姤鏅╅悹锟�? by changhao
	{
		if (this.levelmin > this.levelmax)
		{
			return false;
		}
		
		if (this.levelmin <= 0 || this.levelmax <= 0)
		{
			return false;
		}
		
		//闁告瑦鐗為妴鍐极閻楀牆绁︽俊锟�?闁哄被鍎插Σ鎼佸触閿曚礁鐦遍柛銉︽綑閸烇拷 by changhao
		
		return true;
	}
	
	private boolean checkTeamMemberNum(Team team) //婵★拷?闁哄被鍎板Ч澶愬极? by changhao
	{
		return true;	
	}
	
	private boolean checkFaction(long roleid) //婵★拷?闁哄被鍎遍崣鏇熷濮樿鲸绁查柛锟�? by changhao
	{
		return true;
	}
	
	private boolean checkActiveTime() //婵★拷?闁哄被鍎插鍧楀礉閵婏附顦ч梻锟�? by changhao
	{
		
		return true;
	}

	// 婵★拷?婵炴潙鈹擵P
	private static int checkPvP(long roleId) {
		// 閻犲洭鏀遍惇浼存嚊椤忓嫬袟闁告牕缍婇崢锟�
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


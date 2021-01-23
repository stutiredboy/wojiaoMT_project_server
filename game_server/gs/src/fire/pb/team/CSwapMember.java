
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSwapMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 濞存嚎鍊栧畷鏌ユ⒓閻旈攱鍠�
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
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				Team team = null;
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				
				if(!checkleaderInTeam(leaderRoleId, team))
				{
					//闁汇垹鐤囬顒佺閵堝棗搴婇柣銊ュ濮瑰绋夊鍡樞﹂梻鍐枛閺嗛亶鏁嶉崸鏄筶igal闁匡拷?
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141192, null);
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒佺閵堝棗搴婇柣銊ュ濮瑰绋夊鍡樞﹂梻鍐枛閺嗭拷,  leaderRoleId:" + leaderRoleId);
				}
				else if(!checkIndexValid(team , index1, index2))
				{
					//闁汇垹鐤囬顒佺閵堝棗搴婇柣銊ュ鐞氶亶姊奸悢閿嬪枀index濞戞挸绉撮幃搴♀枖閺囶亞绀刬lligal闁匡拷?
					TeamManager.logger.debug("FAIL:闁汇垹鐤囬顒佺閵堝棗搴婇柣銊ュ鐞氶亶姊奸悢閿嬪枀index濞戞挸绉撮幃搴♀枖?,  index1: " + index1 + " ;index2: "+ index2);
				}
				else if(!checkMemsberStateValid(team, index1, index2))
				{
					//閻熸洑妞掑锕傚箲閵忋垺鐣卞☉鎾卞�濆Σ锕傚川濡櫣绠戝銈咁煼閸忔ɑ寰勯崟顏嗚壘婵繐绲介悥鍫曟偐閼革拷??
					psend(leaderRoleId, new STeamError(TeamError.MembersNotNormal));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 141193, null);
					TeamManager.logger.debug("FAIL:閻熸洑妞掑锕傚箲閵忋垺鐣卞☉鎾卞�濆Σ锕傚川濡櫣绠戝銈咁煼閸忔ɑ寰勯崟顏嗚壘婵繐绲介悥鍫曟偐閼革拷??,  index1: " + index1 + " ;index2: "+ index2);
				}
				else
				{
					TeamManager.logger.debug("SUCC:闁告瑯鍨禍鎺撶閵堝棗搴婇梻鍐枎閹诧拷,  index1: " + index1 + " ;index2: "+ index2);
					team.switchTeamMemberWithSP(index1, index2);
//					long roleId1 = team.getTeamInfo().getMembers().get(index1-1).getRoleid();
//					long roleId2 = team.getTeamInfo().getMembers().get(index2-1).getRoleid();
//					team.getTeamInfo().getMembers().get(index2-1).setRoleid(roleId1);
//					team.getTeamInfo().getMembers().get(index1-1).setRoleid(roleId2);
//					
//					//閻忓繐妫欓弻濠冦亜閸濆嫮纰嶆鐐村閹搁亶宕氶悧鍫濐暡闁哄牆顦靛Σ锕傚川?
//					Set<Long> roleids = new HashSet<Long>();
//					SMemberSequence sMemberSequence = new SMemberSequence();
//					sMemberSequence.teammemeberlist.add(team.getTeamInfo().getTeamleaderid());
//					roleids.add(team.getTeamInfo().getTeamleaderid());
//					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
//					{
//						sMemberSequence.teammemeberlist.add(member.getRoleid());
//						roleids.add(member.getRoleid());
//					}
//					// 閻忓繐妫濆Σ锔藉瀹ュ棗鐏囬柛娑欙耿閵嗗孩鎯旇箛鎾崇岛闂侇偂绀侀崺宀勫箥?闁哄牆顦伴崹姘跺川?
//					xdb.Procedure.psendWhileCommit(roleids, sMemberSequence);
				}
				return true;
			}
			
		};
		swapMemberP.submit();
	}

	

	// 闁汇垹鐤囬顒勬嚀閸涱喗笑濞戯拷?濞戞搩浜Σ锔藉瀹ュ洦鐣遍梻鍐枛閺嗛亶鏁嶉悢宄版锭闁煎疇妫勫﹢鐙縭ocedure濞戞搩鍙�椤妇鎷崘顏呮殢
	private boolean checkleaderInTeam(long leaderRoleId,Team team)
	{
		if (team != null && team.getTeamInfo().getTeamleaderid() == leaderRoleId)
			return true;
		else
			return false;
	}
	//index闁告艾鐗婄涵鍫曟晬?
	private boolean checkIndexValid(Team team, long index_1, long index_2)
	{
		if(index_1 >= 1 && index_1 <= team.getTeamInfo().getMembers().size() && index_2 >=1 && index_2 <=team.getTeamInfo().getMembers().size() && index_1 != index_2)
			return true;
		else 
			return false;
	}
	//閻熸洑妞掑锕傚箲閵忋垺鐣卞☉鎾卞�濆Σ锕傚川濡警妲卞ù婊冨椤掓粎鏁崫銉バ﹂柟顑跨筏缁憋拷
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


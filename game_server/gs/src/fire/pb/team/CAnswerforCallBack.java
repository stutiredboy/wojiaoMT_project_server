
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
 * 鎭㈠鍙洖
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
				//鍏堥獙璇侀槦浼嶆槸鍚︿负绌?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isInTeam(memberRoleId))
					return true;//楠岃瘉璇ヨ鑹叉槸鍚﹁繕鍦ㄩ槦浼嶄腑
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
					// 璇锋眰鍥炲綊
					if (team.getTeamMemberState(memberRoleId) != TeamMemberState.eTeamAbsent)
					{
						// 闃熷憳涓嶅浜庢殏绂讳腑(illegal)
						TeamManager.logger.debug("FAIL:闃熷憳涓嶅浜庢殏绂讳腑 , memberRoleId" + memberRoleId);
					} else if (!checkMemberReturnStatusValid(memberRoleId))
					{
						// 鎴愬憳澶勫湪涓嶅彲褰掗槦鐨勭姸鎬侊紙鎴樻枟绛夛級(illegal)
						TeamManager.logger.debug("FAIL:鎴愬憳澶勫湪涓嶅彲褰掗槦鐨勭姸鎬? , memberRoleId" + memberRoleId);
					} else
					{
						if (team.isMemberInReturnScale(memberRoleId))
						{
							// 鍦ㄥ洖褰掕寖鍥翠箣鍐?
							if (checkTeamReturnStatusValid(team))
							{
								// 闃熶紞澶勫湪鍙互褰掗槦鐨勭姸鎬?
								// 鏀瑰彉闃熷憳涓烘甯哥姸鎬侊紝骞剁兢鍙戞洿鏂扮姸鎬佸崗璁?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamNormal);
								// 鎺掑簭骞跺箍鎾槦鍛樻柊椤哄簭
//								team.updateMemberSequenceWithSendProtocol();
								TeamManager.logger.debugWhileCommit("SUCC:闃熶紞澶勫湪鍙互褰掗槦鐨勭姸鎬侊紝鏀瑰彉闃熷憳涓烘甯哥姸鎬? , memberRoleId" + memberRoleId);
							} else
							{
								// 闃熶紞澶勫湪涓嶅彲浠ュ綊闃熺殑鐘舵??
								// 鏀瑰彉闃熷憳涓哄綊闃熶腑鐘舵?侊紝骞剁兢鍙戞洿鏂扮姸鎬佸崗璁?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamReturn);
								TeamManager.logger.debugWhileCommit("SUCC:鎴愬憳鍥炲綊闃熶紞,杩涘叆褰掗槦涓姸鎬? , memberRoleId" + memberRoleId);
							}

						} else
						{
							// 鍦ㄥ洖褰掕寖鍥翠箣澶?
							// TODO 鑷姩瀵昏矾鎵鹃槦闀? OR 杩斿洖涓嶈兘鍥炲綊鐨勬秷鎭?
							psend(memberRoleId, new STeamError(TeamError.TooFar));
							TeamManager.logger.debug("FAIL:鍦ㄥ洖褰掕寖鍥翠箣澶? , memberRoleId" + memberRoleId);
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

	//鎴愬憳澶勫湪鍙互褰掗槦鐨勭姸鎬??锛堜笉鏄垬鏂楃瓑鐘舵?侊級
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
	//闃熶紞澶勫湪鍙互褰掗槦鐨勭姸鎬??锛堜笉鏄垬鏂楃瓑鐘舵?侊級
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

	public byte agree; // 0 拒绝 1同意

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


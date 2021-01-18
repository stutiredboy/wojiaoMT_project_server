
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
 * 閹垹顦查崣顒�娲�
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
				//閸忓牓鐛欑拠渚�妲︽导宥嗘Ц閸氾缚璐熺粚?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isInTeam(memberRoleId))
					return true;//妤犲矁鐦夌拠銉潡閼瑰弶妲搁崥锕佺箷閸︺劑妲︽导宥勮厬
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
					// 鐠囬攱鐪伴崶鐐茬秺
					if (team.getTeamMemberState(memberRoleId) != TeamMemberState.eTeamAbsent)
					{
						// 闂冪喎鎲虫稉宥咁槱娴滃孩娈忕粋璁宠厬(illegal)
						TeamManager.logger.debug("FAIL:闂冪喎鎲虫稉宥咁槱娴滃孩娈忕粋璁宠厬 , memberRoleId" + memberRoleId);
					} else if (!checkMemberReturnStatusValid(memberRoleId))
					{
						// 閹存劕鎲虫径鍕躬娑撳秴褰茶ぐ鎺楁Е閻ㄥ嫮濮搁幀渚婄礄閹存ɑ鏋熺粵澶涚礆(illegal)
						TeamManager.logger.debug("FAIL:閹存劕鎲虫径鍕躬娑撳秴褰茶ぐ鎺楁Е閻ㄥ嫮濮搁幀? , memberRoleId" + memberRoleId);
					} else
					{
						if (team.isMemberInReturnScale(memberRoleId))
						{
							// 閸︺劌娲栬ぐ鎺曞瘱閸ョ繝绠ｉ崘?
							if (checkTeamReturnStatusValid(team))
							{
								// 闂冪喍绱炴径鍕躬閸欘垯浜掕ぐ鎺楁Е閻ㄥ嫮濮搁幀?
								// 閺�鐟板綁闂冪喎鎲虫稉鐑橆劀鐢摜濮搁幀渚婄礉楠炲墎鍏㈤崣鎴炴纯閺傛壆濮搁幀浣稿礂鐠�?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamNormal);
								// 閹烘帒绨獮璺虹畭閹绢參妲﹂崨妯绘煀妞ゅ搫绨�
//								team.updateMemberSequenceWithSendProtocol();
								TeamManager.logger.debugWhileCommit("SUCC:闂冪喍绱炴径鍕躬閸欘垯浜掕ぐ鎺楁Е閻ㄥ嫮濮搁幀渚婄礉閺�鐟板綁闂冪喎鎲虫稉鐑橆劀鐢摜濮搁幀? , memberRoleId" + memberRoleId);
							} else
							{
								// 闂冪喍绱炴径鍕躬娑撳秴褰叉禒銉ョ秺闂冪喓娈戦悩鑸�??
								// 閺�鐟板綁闂冪喎鎲虫稉鍝勭秺闂冪喍鑵戦悩鑸�?渚婄礉楠炲墎鍏㈤崣鎴炴纯閺傛壆濮搁幀浣稿礂鐠�?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamReturn);
								TeamManager.logger.debugWhileCommit("SUCC:閹存劕鎲抽崶鐐茬秺闂冪喍绱�,鏉╂稑鍙嗚ぐ鎺楁Е娑擃厾濮搁幀? , memberRoleId" + memberRoleId);
							}

						} else
						{
							// 閸︺劌娲栬ぐ鎺曞瘱閸ョ繝绠ｆ径?
							// TODO 閼奉亜濮╃�垫槒鐭鹃幍楣冩Е闂�? OR 鏉╂柨娲栨稉宥堝厴閸ョ偛缍婇惃鍕Х閹�?
							psend(memberRoleId, new STeamError(TeamError.TooFar));
							TeamManager.logger.debug("FAIL:閸︺劌娲栬ぐ鎺曞瘱閸ョ繝绠ｆ径? , memberRoleId" + memberRoleId);
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

	//閹存劕鎲虫径鍕躬閸欘垯浜掕ぐ鎺楁Е閻ㄥ嫮濮搁幀??閿涘牅绗夐弰顖涘灛閺傛鐡戦悩鑸�?渚婄礆
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
	//闂冪喍绱炴径鍕躬閸欘垯浜掕ぐ鎺楁Е閻ㄥ嫮濮搁幀??閿涘牅绗夐弰顖涘灛閺傛鐡戦悩鑸�?渚婄礆
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


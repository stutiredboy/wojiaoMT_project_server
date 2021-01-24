
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
 * 闁诡厹鍨归ˇ鏌ュ矗椤掞拷濞诧拷
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
				//闁稿繐鐗撻悰娆戞嫚娓氾拷濡诧附瀵煎鍡樞﹂柛姘剧細鐠愮喓绮�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isInTeam(memberRoleId))
					return true;//濡ょ姴鐭侀惁澶屾嫚閵夘煈娼￠柤鐟板级濡叉悂宕ラ敃浣虹闁革负鍔戝Σ锔藉瀹ュ嫯鍘�
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
					// 閻犲洭鏀遍惇浼村炊閻愯尙绉�
					if (team.getTeamMemberState(memberRoleId) != TeamMemberState.eTeamAbsent)
					{
						// 闂傚啰鍠庨幉铏▔瀹ュ拋妲卞ù婊冨濞堝繒绮嬬拋瀹犲幀(illegal)
						TeamManager.logger.debug("FAIL:闂傚啰鍠庨幉铏▔瀹ュ拋妲卞ù婊冨濞堝繒绮嬬拋瀹犲幀 , memberRoleId" + memberRoleId);
					} else if (!checkMemberReturnStatusValid(memberRoleId))
					{
						// 闁瑰瓨鍔曢幉铏緞閸曨偅韬☉鎾崇Т瑜拌尪銇愰幒妤佇曢柣銊ュ婵悂骞�娓氬﹦绀勯柟瀛樕戦弸鐔虹驳婢舵稓绀�(illegal)
						TeamManager.logger.debug("FAIL:闁瑰瓨鍔曢幉铏緞閸曨偅韬☉鎾崇Т瑜拌尪銇愰幒妤佇曢柣銊ュ婵悂骞�? , memberRoleId" + memberRoleId);
					} else
					{
						if (team.isMemberInReturnScale(memberRoleId))
						{
							// 闁革负鍔屽ú鏍亹閹烘洖鐦遍柛銉х節缁狅綁宕�?
							if (checkTeamReturnStatusValid(team))
							{
								// 闂傚啰鍠嶇槐鐐村緞閸曨偅韬柛娆樺灟娴滄帟銇愰幒妤佇曢柣銊ュ婵悂骞�?
								// 闁猴拷閻熸澘缍侀梻鍐枎閹茶櫕绋夐悜姗嗗妧閻㈩垰鎽滄慨鎼佸箑娓氬﹦绀夋鐐插閸忋垽宕ｉ幋鐐寸函闁哄倹澹嗘慨鎼佸箑娴ｇ绀傞悹锟�?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamNormal);
								// 闁圭儤甯掔花顓㈢嵁鐠鸿櫣鐣柟缁㈠弮濡诧箓宕ㄥΟ缁樼厐濡炪倕鎼花锟�
//								team.updateMemberSequenceWithSendProtocol();
								TeamManager.logger.debugWhileCommit("SUCC:闂傚啰鍠嶇槐鐐村緞閸曨偅韬柛娆樺灟娴滄帟銇愰幒妤佇曢柣銊ュ婵悂骞�娓氬﹦绀夐柡锟介悷鏉跨秮闂傚啰鍠庨幉铏▔閻戞﹩鍔�閻㈩垰鎽滄慨鎼佸箑? , memberRoleId" + memberRoleId);
							} else
							{
								// 闂傚啰鍠嶇槐鐐村緞閸曨偅韬☉鎾崇Т瑜板弶绂掗妷銉хШ闂傚啰鍠撳▓鎴︽偐閼革拷??
								// 闁猴拷閻熸澘缍侀梻鍐枎閹茶櫕绋夐崫鍕Ш闂傚啰鍠嶉懙鎴︽偐閼革拷?娓氬﹦绀夋鐐插閸忋垽宕ｉ幋鐐寸函闁哄倹澹嗘慨鎼佸箑娴ｇ绀傞悹锟�?
								team.setTeamMemberStateWithSP(memberRoleId, TeamMemberState.eTeamReturn);
								TeamManager.logger.debugWhileCommit("SUCC:闁瑰瓨鍔曢幉鎶藉炊閻愯尙绉洪梻鍐枍缁憋拷,閺夆晜绋戦崣鍡氥亹閹烘袝濞戞搩鍘炬慨鎼佸箑? , memberRoleId" + memberRoleId);
							}

						} else
						{
							// 闁革负鍔屽ú鏍亹閹烘洖鐦遍柛銉х節缁狅絾寰�?
							// TODO 闁煎浜滄慨鈺冿拷鍨閻箖骞嶆ィ鍐┬曢梻锟�? OR 閺夆晜鏌ㄥú鏍ㄧ▔瀹ュ牆鍘撮柛銉у仜缂嶅﹪鎯冮崟顒傂ラ柟锟�?
							psend(memberRoleId, new STeamError(TeamError.TooFar));
							TeamManager.logger.debug("FAIL:闁革负鍔屽ú鏍亹閹烘洖鐦遍柛銉х節缁狅絾寰�? , memberRoleId" + memberRoleId);
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

	//闁瑰瓨鍔曢幉铏緞閸曨偅韬柛娆樺灟娴滄帟銇愰幒妤佇曢柣銊ュ婵悂骞�??闁挎稑鐗呯粭澶愬及椤栨稑鐏涢柡鍌涱殘閻℃垿鎮╅懜锟�?娓氬﹦绀�
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
	//闂傚啰鍠嶇槐鐐村緞閸曨偅韬柛娆樺灟娴滄帟銇愰幒妤佇曢柣銊ュ婵悂骞�??闁挎稑鐗呯粭澶愬及椤栨稑鐏涢柡鍌涱殘閻℃垿鎮╅懜锟�?娓氬﹦绀�
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



package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COneKeyApplyTeamInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COneKeyApplyTeamInfo extends __COneKeyApplyTeamInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure onekeyteammatch = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{					
				Team team = null;
								
				team = TeamManager.getTeamByTeamID(teamid);	//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�绀冩い鏃囧亹閿涙粌鈹戦鏂よ�跨痪顓狀焾鍗辨い鏍仦閳锋帒霉閿濆浂鐒炬い銉ョ箻閺屾稓锟斤綆浜濋ˉ銏拷瑙勬礈婢ф骞嗛弮鍫濐潊闁绘ɑ褰冮～濠囨⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煙闂傚顦﹂柣銈庡枛闇夐柛蹇撳悑缂嶆垹绱掗幇顓ф畼闁跨喕妫勭粻宥夊磿閸楃伝娲晝閸岋妇绋忛梺鍝勬储閸ㄦ椽鎮￠悢鍏肩厵闂侇叏绠戦弸娑㈡煕閺傛鍎旈柡宀嬬秮楠炴﹢宕￠悙鎻掝潛闂傚倸娲らˇ鐢稿蓟閵娿儮鏀介柛鈾�鏅滈埢鎾斥攽閳藉棗浜濋柛銊ユ贡濡叉劙骞掗幘宕囩獮濠电偞鍨堕悷銉╊敂閿燂拷 by changhao	
				if (team != null)
				{
					SOneKeyApplyTeamInfo msg = new SOneKeyApplyTeamInfo();
					
					msg.teamid = teamid;
					
					msg.memberlist.add(team.getTeamMemeberSimple(team.getTeamLeaderId()));
					
					for (xbean.TeamMember member : team.getTeamInfo().getMembers())
					{
						long memberid = member.getRoleid();
						
						msg.memberlist.add(team.getTeamMemeberSimple(memberid));
					}
					
					mkdb.Procedure.psendWhileCommit(roleid, msg);
				}
						
				return true;
			}
			
		};
		
		onekeyteammatch.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794517;

	public int getType() {
		return 794517;
	}

	public long teamid; // 队伍的ID by changhao

	public COneKeyApplyTeamInfo() {
	}

	public COneKeyApplyTeamInfo(long _teamid_) {
		this.teamid = _teamid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(teamid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		teamid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof COneKeyApplyTeamInfo) {
			COneKeyApplyTeamInfo _o_ = (COneKeyApplyTeamInfo)_o1_;
			if (teamid != _o_.teamid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)teamid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(teamid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(COneKeyApplyTeamInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(teamid - _o_.teamid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


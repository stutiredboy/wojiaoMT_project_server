
package fire.pb.skill;

import fire.pb.skill.scene.PSceneSkill;
import fire.pb.skill.scene.SceneSkillConfig;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CUseSceneSkill__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CUseSceneSkill extends __CUseSceneSkill__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌曢崼婵愭Ц缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛楠炪垺淇婇悙瀛樼婵＄偘绮欓獮鍐閵堝懐顦ч梺缁樻尭缁ㄨ偐鍒掕缁绘繈鎮介棃娑楃捕濠碘槅鍋呴悷鈺佺暦瑜版帒绀堝〒姘攻鐎氳鎱ㄥΟ鐓庝壕閻庢熬鎷�?
		if(aimtype == PSceneSkill.GOAL_SELF_PET)
		{
			aimid = xtable.Properties.selectFightpetkey(roleId);
			if(aimid == -1)
				return;
		}
		else if(aimtype == PSceneSkill.GOAL_TEAM_ROLE)
		{
			Team team = TeamManager.selectTeamByRoleId(roleId);
			if(team == null)
				return;
			if(!team.getNormalMemberIds().contains(roleId))
				return;
			if(!team.getNormalMemberIds().contains(aimid))
				return;
		}
		SceneSkillConfig skillconfig = fire.pb.skill.Module.getInstance().getSceneSkillConfig(skillid);
		if(skillconfig == null)
		{
			Module.logger.error("ERROR: 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯悹楦裤��閺嬪秹鏌曡箛瀣拷鏇犵不椤栫偞鐓ラ柣鏇炲�圭�氾拷?闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊閵娧呭骄闂佸壊鍋呯缓楣冨几瀹ュ鐓涢柛銉ｅ劚閻忊晠鏌涢妸銉ワ拷鍦崲濠靛顥堟繛鎴炶壘閳京绱撴担鍝勑ｉ柡灞诲姂閳ワ妇鎹勯妸锕�纾梺鎯х箰濠�閬嶅礉瑜版帗鈷戦柣鐔告緲濡插鏌涢姀锛勫弨闁糕斂鍎插鍕箾閻愵剛锟藉搫顪冮妶鍡樺瘷闁稿本绮庡▔鍧楁⒒娴ｇ懓顕滄繛鎻掔箻瀹曡绂掔�ｎ亝鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷. roleId = "+roleId+", skillId = " + skillid);
			return;
		}
		new PSceneSkill(roleId, skillid, aimid, aimtype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800452;

	public int getType() {
		return 800452;
	}

	public int skillid; // 技能ID
	public int aimtype; // 技能使用目标类型 对自己角色使用==1，对自己战斗宠物使用==2，对正常队友角色使用==3
	public long aimid; // 技能使用目标ID，为队友角色ID

	public CUseSceneSkill() {
	}

	public CUseSceneSkill(int _skillid_, int _aimtype_, long _aimid_) {
		this.skillid = _skillid_;
		this.aimtype = _aimtype_;
		this.aimid = _aimid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(skillid);
		_os_.marshal(aimtype);
		_os_.marshal(aimid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		skillid = _os_.unmarshal_int();
		aimtype = _os_.unmarshal_int();
		aimid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CUseSceneSkill) {
			CUseSceneSkill _o_ = (CUseSceneSkill)_o1_;
			if (skillid != _o_.skillid) return false;
			if (aimtype != _o_.aimtype) return false;
			if (aimid != _o_.aimid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += skillid;
		_h_ += aimtype;
		_h_ += (int)aimid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(skillid).append(",");
		_sb_.append(aimtype).append(",");
		_sb_.append(aimid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CUseSceneSkill _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = skillid - _o_.skillid;
		if (0 != _c_) return _c_;
		_c_ = aimtype - _o_.aimtype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(aimid - _o_.aimid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


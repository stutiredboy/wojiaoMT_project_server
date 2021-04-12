
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
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄本娲熷畷鐓庘攽閹邦厜锔剧磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛闂堟稒鐏堝Δ鐘靛亼閸ㄧ儤绌辨繝鍥ㄥ�烽悗娑欘焽椤︺劌鈹戦敍鍕粧缂侇喗鐟╅悰顕�宕橀纰辨綂闂侀潧鐗嗛幊鎰八囪濮婅櫣绱掑Ο璇茬缂備降鍔忛崑鎰板礆閹烘洦妲肩紓浣虹帛缁诲牓骞冩禒瀣棃婵炴垶顨堥幑鏇熺節绾版ɑ顫婇柛瀣嚇閹兘鍩℃担鐑樻閻熸粎澧楃敮鎺旂矆閸縿锟芥帒顫濋濠冩暰闁诲孩淇洪～澶愬箞閵娿儙鐔兼偂鎼存繂顥氶梺璇插閻旑剟骞忛敓锟�?
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
			Module.logger.error("ERROR: 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閹銈︾憗銈忔嫹閿熶粙鏌＄�ｎ亞效闁哄本娲濈粻娑氾拷锝庝悍閹风兘寮撮悩鍏哥瑝濡炪倖鐗滈崑鐐烘偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為梺闈浤涢崨顓㈢崕闂傚倷绀佹竟濠囧磻閸涱垳绱﹀Δ锝呭暙閸戠姷锟藉箍鍎遍ˇ浼存偂濞戙垺鐓曢柕澶涚到閸旀岸鏌ｈ箛濠冩珚闁哄本鐩俊鎼佸Ψ閵夘垱瀚归柛锔诲幗瀹曞弶绻濋棃娑卞剱妞ゃ儱鐗婄换娑㈠箣閻愯泛顥濋梺鎰佷海娴滎剛妲愰幘瀛樺闁告繂瀚呴敐澶嬬厸閻忕偠顕ф慨鍌炴煃閵夘垰顩柟鐟板婵℃悂鏁冮敓鐣屽椤栫偞鈷戦柟顖嗗懐顔囧┑鐙呮嫹闂侇剙绉寸粈澶屾喐閻楀牆绗氶柍閿嬪灴閺岋綁鎮㈤崨濠勫嚒濠碘剝褰冮…鐑藉蓟濞戙垹顫呴柨娑樺瀵劑姊虹化鏇熸澓闁稿孩褰冮銉╁礋椤掑倻顔曢梺缁樺姦閸撴盯鏁撻挊澶嬫儓妞ゎ亜鍟存俊鍫曞幢濡櫣妯傞梻浣侯焾閺堫剛鍒掓惔鈾�鏋栭柛褎顨嗛埛鎺懨归敐鍥ㄥ殌妞ゆ洘绮嶇换娑㈠箵閹烘梻顔掗悗瑙勬礉椤绮嬮幒鏃撴嫹閿濆簼绨奸柣搴墴濮婃椽鎮烽弶搴撴寖缂備緡鍣崹璺侯嚕閺屻儱绠瑰ù锝呮贡閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷. roleId = "+roleId+", skillId = " + skillid);
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


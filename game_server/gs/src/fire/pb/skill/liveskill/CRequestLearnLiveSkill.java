
package fire.pb.skill.liveskill;

import java.util.HashMap;

import fire.log.beans.RoleSkillUpBean;






import fire.pb.attr.SRefreshRoleData;
import fire.pb.buff.BuffConstant;
import fire.pb.clan.srv.ClanManage;
import fire.pb.item.Pack;
import fire.pb.main.ConfigManager;
import fire.pb.skill.Result;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestLearnLiveSkill__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 閻犲洭鏀遍惇鎵拷娑崇細缁″嫰鎮介悢鍛娿仧闁癸拷?闁硷拷?
 * @author changhao
 *
 */
public class CRequestLearnLiveSkill extends __CRequestLearnLiveSkill__ {
	@Override
	/* 闁告梻濞�閺�锝嗐亜閸濆嫮纰� roleid by changhao*/
	protected void process() {
		// protocol handlen 
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestlearnliveskill = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (fire.pb.buff.Module.existState(roleid, BuffConstant.StateType.STATE_BATTLE_FIGHTER))
				{
					fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 142383, null);
					return true;
				}
				
				fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(id);
				
				if (config == null)
				{
					LiveSkillManager.logger.error("CRequestLearnLiveSkill config error:" + id);
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
			
				fire.pb.skill.SkillRole skillrole = new fire.pb.skill.SkillRole(roleid);
				
				xbean.LiveSkill liveskill = skillrole.getLiveSkills().get(id);
				
				int requireLevel = 1; //闂傦拷?閻熸洑绀侀鐔哥▕閻樻彃鐓傞柣銊ュ閻℃垹鐥�? by changhao
				
				if (liveskill != null)
				{
					requireLevel = liveskill.getLevel() + 1;
				}
				
				if (requireLevel > config.skillLevelMax) //闁哄嫷鍨伴幆浣割啅閼碱剛鐥呴弶鍫熷劤閸╁矂寮�?濠㈠爢鍛惣缂侊拷? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.SkillMaxLimit));
					return false;						
				}
				 
				fire.pb.skill.SLifeSkillCost cost = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkillCost.class).get(requireLevel);
				if (cost == null)
				{
					LiveSkillManager.logger.error("CRequestLearnLiveSkill cost error:" + requireLevel);					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return false;					
				}
				
				xbean.Properties roleproperty = xtable.Properties.get(roleid);
				
				int roleidlevel = roleproperty.getLevel();
				
				if (config.studyLevelRule > 0)
				{
					int needLevelLimit = cost.needLevelList.get(config.studyLevelRule - 1);
					if (roleidlevel < needLevelLimit) //缂佹稑顦辨鍥ㄧ▔瀹ュ拋妾� by changhao
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;						
					}					
				}
				
				if (config.needGuild == 1 && roleproperty.getClankey() <= 0) //闁哄嫷鍨伴幆渚�妫�?閻熸洑绀侀崣鏇熷? by changhao
				{
					MessageMgr.psendMsgNotify(roleid, 150027, null);
					return false;	
				}
				
				//婵★拷?婵炴潙顑呴鐔哥▕閻樺磭啸闁硷拷? by changhao
				
				if (config.studyCostRule > 0)
				{
					int silverCost = cost.silverCostList.get(config.studyCostRule - 1);
					
					Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(
							roleid, fire.pb.item.BagTypes.BAG, false);
					
					if (bag.getMoney() < silverCost)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;					
					}
					
					//闁圭缍侀幐锟� by changhao
					if(bag.subMoney(-silverCost, LiveSkillManager.LiveSkill, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuilianjin, 0) != -silverCost)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;	
					}
				}
				
				//闂傦拷?閻熸洑鑳跺▓鎴犳暜椤旇法顢� by changhao
				if (config.studyCostRule > 0)
				{
					int needfactioncontr = cost.guildContributeCostList.get(config.studyCostRule - 1);
					if (needfactioncontr > 0)
					{
						boolean ok = ClanManage.delContribution(roleid, needfactioncontr, LiveSkillManager.StudyLiveSkill, false);
						if (ok == false) //閻㈩垼鍠涚涵锟藉☉鎾崇Т椤э拷 by changhao
						{
							psend(roleid, new SSkillError(SkillConstant.SkillError.ContributeNotEnough));
							return false;						
						}					
					}						
				}			
				
				if (liveskill == null)
				{
					xbean.LiveSkill e = xbean.Pod.newLiveSkill();
					e.setLevel(requireLevel);
					skillrole.getLiveSkills().put(id, e);
					
					liveskill = e;
				}
				else
				{
					liveskill.setLevel(requireLevel);					
				}
				
				if (config.skillId != 0) //闁哄嫷鍨甸～锕傚礉閵婏箑螚闁硷拷? by changhao
				{
					Result result = new Result(true);
					
					//闁告帡鏀遍弻澶縐FF by changhao
					result.updateResult(skillrole.addLiveSkillBuff());	
				
					if(!result.getChangedAttrs().isEmpty())//闂侇偅姘ㄩ悡锛勪沪閻愶拷?瑜庨弫濂稿礉? by changhao
					{
						mkdb.Procedure.psendWhileCommit(roleid,new SRefreshRoleData((HashMap<Integer, Float>)result.getChangedAttrs()));
					}
				}
				
				SUpdateLearnLiveSkill msg = new SUpdateLearnLiveSkill();
				msg.skill.level = liveskill.getLevel();
				msg.skill.id = id;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);

				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleid));
				
				//闁告ê妫涢埢濂告偨閻斿憡銇熼柟锟�?闁煎啿锟界喐褰ч柛鎺撳閻℃垹鐥�?
				fire.pb.course.CourseManager.checkAchieveCourse(roleid, fire.pb.course.CourseType.SHENG_HUO_JINENG, liveskill.getLevel());
				fire.log.YYLogger.roleSkillUPLog(roleid, new RoleSkillUpBean(id, liveskill.getLevel()));
				return true;
			}
		};
		
		requestlearnliveskill.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800515;

	public int getType() {
		return 800515;
	}

	public int id;

	public CRequestLearnLiveSkill() {
	}

	public CRequestLearnLiveSkill(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestLearnLiveSkill) {
			CRequestLearnLiveSkill _o_ = (CRequestLearnLiveSkill)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestLearnLiveSkill _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


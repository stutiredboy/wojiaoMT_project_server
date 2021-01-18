
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
 * 鐠囬攱鐪扮�涳缚绡勯悽鐔告た閹�?閼�?
 * @author changhao
 *
 */
public class CRequestLearnLiveSkill extends __CRequestLearnLiveSkill__ {
	@Override
	/* 閸旂娀鏀ｆい鍝勭碍 roleid by changhao*/
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
				
				int requireLevel = 1; //闂�?鐟曚礁顒熸稊鐘插煂閻ㄥ嫮鐡戠痪? by changhao
				
				if (liveskill != null)
				{
					requireLevel = liveskill.getLevel() + 1;
				}
				
				if (requireLevel > config.skillLevelMax) //閺勵垰鎯佸鑼病鏉堟儳鍩岄張?婢堆呯搼缁�? by changhao
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
					if (roleidlevel < needLevelLimit) //缁涘楠囨稉宥咁檮 by changhao
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;						
					}					
				}
				
				if (config.needGuild == 1 && roleproperty.getClankey() <= 0) //閺勵垰鎯侀棁?鐟曚礁鍙曟导? by changhao
				{
					MessageMgr.psendMsgNotify(roleid, 150027, null);
					return false;	
				}
				
				//濡�?濞村顒熸稊鐘崇Х閼�? by changhao
				
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
					
					//閹碉綁鎸� by changhao
					if(bag.subMoney(-silverCost, LiveSkillManager.LiveSkill, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_gonghuilianjin, 0) != -silverCost)
					{
						psend(roleid, new SSkillError(SkillConstant.SkillError.MoneyNotEnough));
						return false;	
					}
				}
				
				//闂�?鐟曚胶娈戠敮顔跨 by changhao
				if (config.studyCostRule > 0)
				{
					int needfactioncontr = cost.guildContributeCostList.get(config.studyCostRule - 1);
					if (needfactioncontr > 0)
					{
						boolean ok = ClanManage.delContribution(roleid, needfactioncontr, LiveSkillManager.StudyLiveSkill, false);
						if (ok == false) //鐢喛纭�娑撳秴顧� by changhao
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
				
				if (config.skillId != 0) //閺勵垵顫﹂崝銊﹀Η閼�? by changhao
				{
					Result result = new Result(true);
					
					//閸掗攱鏌夿UFF by changhao
					result.updateResult(skillrole.addLiveSkillBuff());	
				
					if(!result.getChangedAttrs().isEmpty())//闁氨鐓＄仦鐐�?褎鏁奸崝? by changhao
					{
						mkdb.Procedure.psendWhileCommit(roleid,new SRefreshRoleData((HashMap<Integer, Float>)result.getChangedAttrs()));
					}
				}
				
				SUpdateLearnLiveSkill msg = new SUpdateLearnLiveSkill();
				msg.skill.level = liveskill.getLevel();
				msg.skill.id = id;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);

				mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleid));
				
				//閸樺棛鈻奸悽鐔告た閹�?閼冲�熸彧閸掓壆鐡戠痪?
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


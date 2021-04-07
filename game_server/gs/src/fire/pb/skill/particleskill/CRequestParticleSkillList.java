
package fire.pb.skill.particleskill;

import java.util.Map;

import fire.pb.main.ConfigManager;
import fire.pb.skill.BuffUnit;
import fire.pb.skill.SkillRole;
import fire.pb.skill.SubSkillConfig;
import fire.pb.skill.fight.FightSkillConfig;
import fire.pb.skill.liveskill.LiveSkillManager;
import fire.script.FightJSEngine;
import fire.script.JavaScript;





// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestParticleSkillList__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｉ柨鏃傛櫕閸樿棄鈹戞幊閸娧囧箯閻戣姤鐓熸俊銈忔嫹缂佺粯锕㈠畷娲倷瀹割喖鎮戦梺绯曞墲閸旀帞鑺辨繝姘拺闁告繂瀚弸锕傛煙妞嬪骸鍘撮柡灞剧♁閹棃濡堕崱娆忔锭缂傚倷绀侀崐鍦暜閻旂厧桅闁圭増婢樼粻鎶芥煙閹规劖纭炬鐐茬Ч濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊閵娧呭骄闂佸壊鍋呯缓楣冨几瀹ュ鐓涢柛銉ｅ劚閻忊晠鏌涢妸銉ワ拷鍦崲濠靛顥堟繛鎴炵懃缁愭盯姊哄畷鍥ㄥ殌缂佸鎸抽崺鐐哄箣閿旇棄浜归梺鍛婄懃椤︿即骞冨▎鎴犵＝濞达絽鎼鎾绘煙閸戙倖瀚�? by changhao
 *
 */

public class CRequestParticleSkillList extends __CRequestParticleSkillList__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestparticleskilllist = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{		
				SRequestParticleSkillList msg = new SRequestParticleSkillList();
				
				xbean.Properties prop = xtable.Properties.select(roleid);
				xbean.RoleClanPoint clanpoint = xtable.Roleclanpoint.select(roleid);
				int factionlevel = 0;
				
				Long factionid = xtable.Roleidclan.select(roleid);
				if (factionid != null)
				{
					xbean.ClanInfo clanInfo = xtable.Clans.select(factionid);
					if (clanInfo != null)
					{
						factionlevel = clanInfo.getClanlevel();					
					}
				}
				
				msg.factionlevel = factionlevel;
				
				int rolelevel = prop.getLevel();
				int contri = 0;
				
				if (clanpoint != null)
				{
					contri = clanpoint.getHistoryclanpoint();					
				}
			
				SkillRole skillrole = new SkillRole(roleid);
				int size = skillrole.getPracticeSkills().size();
							
				if (size == 0) //闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垵顫曢敓钘夊�块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉妯锋婵炲棙鍔楃粙鍥⒑閹肩偛濡奸柛濠傛健瀵鈽夐埗鈺嬫嫹閿曞倸绠ｆ繝闈涙噽閸戝綊姊绘担鍛婂暈闁荤喆鍎抽幑銏狀潨閿熶粙鐛崘銊庢棃宕ㄩ鑺ョ彸闂佸湱鍘ч悺銊ф崲閸曨垱鍎庨幖绮规濞撳鏌曢崼婵囶棡缂佸苯娼￠弻鐔煎礄閵堝棗顏� by changhao
				{										
					java.util.Map<Integer, fire.pb.skill.SLifeSkill> config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class);
					
					for (java.util.Map.Entry<Integer, fire.pb.skill.SLifeSkill> e1 : config.entrySet())
					{
						if (e1.getValue().skillType == 3)
						{
							xbean.PracticeSkill practiceskill = xbean.Pod.newPracticeSkill();
							practiceskill.setExp(0);
							practiceskill.setLevel(0);		
						
							skillrole.getPracticeSkills().put(e1.getKey(), practiceskill);							
						}
					}
				}
				
				for(java.util.Map.Entry<Integer, xbean.PracticeSkill> e : skillrole.getPracticeSkills().entrySet())
				{
					fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(e.getKey());

					fire.pb.skill.particleskill.ParticleSkill skill = new fire.pb.skill.particleskill.ParticleSkill();
					skill.level = e.getValue().getLevel();
					skill.id = e.getKey();
					skill.exp = e.getValue().getExp();
					//skill.maxlevel = LiveSkillManager.getInstance().GetPracticeSkillMaxLevel(rolelevel, factionlevel, contri, config.skillLevelMax);
					
					java.util.Map<Integer, Integer> ret = LiveSkillManager.getInstance().GetPracticeSkillMaxLevel(rolelevel, factionlevel, contri, config.skillLevelMax);
					if (ret.size() == 0)
					{
						return false;
					}
					
					java.util.Iterator<java.util.Map.Entry<Integer, Integer>> it = ret.entrySet().iterator();
					java.util.Map.Entry<Integer, Integer> entry = it.next();
					skill.maxlevel = entry.getValue();					
					
					if (skill.level > 0)
					{
						skill.effects.putAll(CalcSkillEffect(config.skillId, skill.level));
						skill.nexteffect.putAll(CalcSkillEffect(config.skillId, skill.level + 1));
					}
					else if (skill.level == 0)
					{
						skill.nexteffect.putAll(CalcSkillEffect(config.skillId, 1));						
					}

					msg.skilllist.add(skill);
				}
				
				msg.curcontribution = contri;
				
				mkdb.Procedure.psendWhileCommit(roleid, msg);				
				
				return true;
			}
		};
		
		requestparticleskilllist.submit();	
	}
	
	public java.util.HashMap<Integer,Float> CalcSkillEffect(int skillid, int level)
	{
		java.util.HashMap<Integer,Float> effect = new java.util.HashMap<Integer,Float>();
		
		FightSkillConfig sconf = fire.pb.skill.Module.getInstance().getFightSkillConfig(skillid);
		if (sconf != null)
		{
			FightJSEngine engine = new FightJSEngine();
			engine.setSkillLevel(level);
			
			for (SubSkillConfig subskill : sconf.getSubSkills())
			{
				for (BuffUnit buffarg : subskill.getBuffUnits())
				{
					if(buffarg==null){
						continue;
					}
					for(Map.Entry<Integer, JavaScript> entry : buffarg.effectJavascriptMap.entrySet())
					{
						effect.put(entry.getKey(), entry.getValue().eval(engine,null,null).floatValue());
					}
				}
			}				
		}					
		
		return effect;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800503;

	public int getType() {
		return 800503;
	}


	public CRequestParticleSkillList() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestParticleSkillList) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestParticleSkillList _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


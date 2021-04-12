
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆鐓ラ柡鍐ㄥ�瑰▍鏇㈡煕濡寧顥夐柍瑙勫灦楠炲﹪鏌涙繛褍娲ょ粻顖炴煟閹达絽袚闁绘挾鍠愭穱濠囧Χ韫囨柨顏剁紓鍌欒兌缁垶鏁冮姀鐘垫殾婵炲樊浜濋崐椋庯拷鐟板閸犳牠骞冮幋锔解拺缂侇垱娲栨晶鏌ユ煕閺冿拷鐢偤鎳炴潏銊х瘈婵﹩鍘搁幏娲⒑閸涘﹦绠撻悗姘煎墴瀵悂鏁冮崒娑氬幍婵＄偛顑呮鎼佸储閹绢喗鐓涢悘鐐插⒔閳句線鏌熼娑欘棃濠碘�崇埣瀹曞崬鈻庤箛鏃堟暘缂傚倸鍊搁崐椋庣矆娓氾拷瀹曟劙宕烽鐔告闂佺粯姊婚崢褎顢婇梻浣告贡婢ф顭垮Ο鑲╀笉闁规儼濮ら悡娆撴煙鐟欏嫬濮堢痪顓犲亾椤ㄣ儵鎮欓懠顑勬叏婵犲嫮甯涢柟宄版嚇閹崇偤濡疯閿熻棄锕娲閳哄啰肖缂備胶濮甸幑鍥偘椤旇法鐤�婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為梺闈浤涢崨顓㈢崕闂傚倷绀佹竟濠囧磻閸涱垳绱﹀Δ锝呭暙閸戠姷锟藉箍鍎遍ˇ浼存偂濞戙垺鐓曢柕澶涚到閸旀岸鏌ｈ箛濠冩珚闁哄本鐩俊鎼佸Ψ閵夘垱瀚归柛锔诲幗瀹曞弶绻濋棃娑卞剱妞ゃ儱鐗婄换娑㈠箣閻愬灚鍣х紓浣瑰姈閻╊垰顫忛崫鍕殾闁搞儯鍔屽▓宀�绱撴担鍓叉Ч闁瑰憡濞婂畷娲倷閸濆嫮顓洪梺鎸庢濡嫭绂嶈ぐ鎺撯拺闁告稑锕﹂幊鍐┿亜閿斿灝宓嗘鐐插暙閳诲酣骞嬮悩纰夌闯濠电偠鎻徊浠嬪箹椤愶富鏁侀柟鍓х帛閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹? by changhao
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
							
				if (size == 0) //闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹仴妞ゎ偅娲熼弫鎾绘寠婢跺鎷烽崸妞硷拷浣割潩閼稿灚娅㈡繛瀵稿Т椤戝洤鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愮紓鍌欑劍閸旀牠銆冩繝鍥ц摕闁炽儲鍓氶崥瀣箹缁櫢鎷烽崘宸妧闂傚倷娴囧銊х矆娴ｇ尨鎷峰顐㈠祮鐎殿喛顕ч埥澶娢熼柨瀣垫綌婵犵數鍋涘Λ娆撳礉濡ゅ啰鐭欓柛銉墯閳锋垿鏌熼懖鈺佷粶濠碘�炽偢閺屾稒绻濋崒娑樹淮閻庢鍠涢褔鍩ユ径鎰厬闁冲搫顑嗙�氬綊鏌ㄩ弴鐐诧拷鍝ョ不閿濆棛绡�闂傚牊绋掗崳浠嬫煕閹存繄绉烘慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼闂備浇宕甸崰鍡涘磿閹惰棄绠查柕蹇曞濞笺劑鏌ㄩ悢鍓佺煓闁绘侗鍣ｅ畷姗�濡告惔銏☆棃鐎规洏鍔戦、娆撴嚍閵壯冪闂傚倷绀佸﹢閬嶅储瑜旈幃娲Ω瑜庡畷鏌ユ煕閺囥劌鐏￠柛搴￠叄楠炴牜鍒掔憴鍕垫綉濠电偞鎸搁…鐑藉蓟閺囥垹閱囨繝闈涙祩濡紕绱撴担姝屽婵炵》绻濆濠氭偄閻撳海顦╅梺闈涚墕濡顢旈敓锟� by changhao
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


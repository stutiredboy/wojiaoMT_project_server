
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍐煟鐎殿噮鍋婂畷鍫曨敆娴ｅ搫甯鹃梻濠庡亜濞诧箑煤閺嵮勬瘎闂傚倷绀侀幉锛勬崲閸愵喓锟藉啯绻濋崒銈嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓曢柕澶嬪灥閸犳艾顭囬懡銈囩＝闁稿本鐟чˇ锔姐亜閿曞倷鎲剧�殿噮鍋嗛幏鐘绘嚑椤掍焦顔曢梻浣告惈濞层垽宕归崷顓犱笉闁挎繂顦伴悡銉╂煛閸愩劌锟界懓鈻嶉弴銏＄厱婵☆垱瀵чˉ澶愭煃鐟欏嫬鐏︽鐐诧躬閺屾稒绻涜濞层倗绮婚鐐寸厽闁硅揪绲借闂佺粯鎸鹃崰鎰┍婵犲洤围闊洦鏌ㄩ鍓佺磽閸屾瑨鍏岀紒顕呭灦閺佸啴濮�閻樺灚娈惧┑鐐叉▕娴滄繈宕愭搴嫹閻熸澘顥忛柛鐘崇墵楠炲啴骞嬮敂瑙ｆ嫼缂備緡鍨卞ú鏍ㄦ櫠閺屻儲鐓曢柡鍐挎嫹閻㈩垳鍋ら幊鐐存綇閵娧呯槇濠殿喗锕╅崢鎼佸箯濞差亝鈷戦柛娑橈功缁犳捇鎮楀鐓庡⒋鐎殿喗鎮傞弫鍐磼濞戞艾骞嶅┑锛勫仜椤戝懏顨ラ幖浣稿偍闁圭虎鍠楅悡娑㈡倶閻愭彃鈷旈柍鍙ョ窔閺岀喖顢涘☉娆樻婵犵锟藉磭鍩ｇ�规洖宕埢搴ょ疀閺冨牊鏆樼紓鍌氬�搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洘鍔欏畷鐑筋敇閻斿憡顔囬梻浣虹帛濮婂宕㈣椤㈠﹪姊绘担鍛婅础濠⒀勵殔椤灝螣閼测晙绗夐梺瑙勫劶婵倝鎮″▎鎾寸厵閻熸瑥瀚慨鍫㈢棯椤撶姴浜炬い銊ｅ劦閹瑩鎳犻顐庡嫭鍙忓┑鐘插鐢盯鏌熷畡鐗堝殗闁瑰磭鍋ゆ俊鐤槹闁跨喕妫勯敃顏勵潖濞差亝顥堥柍鍝勫暟鑲栫紓鍌欒兌婵敻骞戦崶顒佸仒妞ゆ棁娉曢悿锟藉┑鐐村灦閻燂箑鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘⒑闂堟丹娑㈠川椤撱垻宕曢梻鍌氬�风粈浣圭珶婵犲洤纾婚柛娑卞灣缁憋箑螖閿濆懎鏆欓柛鎴犲Х閿熻棄绠嶉崕閬嵥囨导瀛樺亗婵炴垯鍨洪悡鏇㈡煏婢舵稓鍒伴柛鏃�宀搁弻锝堢疀婵犲啯鐝氶梺鍝勬湰閻╊垱淇婇幖浣肝ㄩ柕澶樺灡鐎氬綊鏌涢敂璇插箺鐎规洖寮剁换婵嬫濞戝崬鍓卞銈冨劚閻楀﹦鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担鐟板闁烩晩鍨伴～蹇涘传閸曨厽娈鹃梺鎼炲劘閸斿苯鈻撳畝锟界槐鎾存媴閸撳弶效闂佺懓鎲℃繛濠傜暦濞差亝鍊烽柛婵嗗椤撴椽姊洪幐搴㈩梿婵☆偄瀚粋宥堛亹閹烘挴鎷洪梺鍛婄☉閿曪箓骞婇崘鈹夸簻闁挎柨鐏濆畵鍡橆殽閻愭彃鏆欓柍璇查叄楠炲鎮╃喊澶岄棷婵犵數鍋犻幓顏嗗緤娴犲绠规い鎰跺瘜閺佷線鏌熼崜褏甯涢柣鎾寸懇閺屾盯骞嬪▎蹇ユ嫹閺嶎偓鎷峰鐐? by changhao
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
							
				if (size == 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛淮濡炪値鍋呭ú鐔煎极閹剧粯瀵犲璺侯煭閹风兘宕稿纭锋嫹娴ｅ壊娼╅柤绋跨仛濞呫垺绻涚�电孝妞ゆ垵娲ら悾鍨瑹閿熶粙鎮￠锕�鐐婇柕濞э拷濡俱劑姊洪崫鍕櫤闁诡喖鍊垮濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê妯婂Λ宀勬⒑鏉炴壆顦﹂柨鏇ㄤ邯瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劗绱撻崒娆戝妽闁告梹鐗犻妴鍐╃節閸パ嗘憰闂佺偨鍎查崜姘跺触鐎ｎ喖绠圭紒顔炬閹风兘宕樺顔煎Η闂傚倸鍊峰ù鍥ь浖閵娧呯焼濞达絿灏ㄩ幏宄邦潩椤愩垹绁悗娈垮枦椤曆囧煡婢跺á鐔兼煥鐎ｅ灚缍屽┑鐘垫暩閸嬫稑螞濞嗘挸绀夋俊銈呭暟閻瑩鏌涢妷顔煎闁抽攱鍨块弻鐔兼嚃閳轰椒绮舵繝纰橈拷鐐藉仮闁哄本绋掔换婵嬪磼濞戞ü娣柣搴㈩問閸犳盯顢氳閸┿儲寰勯幇顒傚幀闂佸啿鎼鍡欙拷姘秺閺屻劑寮撮悙璇ф嫹閸濄儳涓嶉柨婵嗘缁★拷闂傚倸鐗婄粙鎺楀闯娴犲鐓曢柟瀛樼箘缁夌儤鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸屾稒鐣奸梻鍌欐祰瀹曠敻宕伴崱娑樼？闁规儼妫勭粻鏌ユ煏韫囨洖顎屾繛绗哄姂閺屻劑鎮㈤崜浣虹厯闂佺粯渚楅崳锝呯暦濮楋拷婵″憡鎯旈姀鈽嗘閻庤娲忛崝鎴︺�佸▎鎾村殟闁靛／鍐槮闂傚倸鍊风粈浣革耿闁秴鍌ㄧ憸鏃堝箖濞差亜惟鐟滃骸鐣烽弻銉︾厱闁哄洢鍔岄悘锟犳煕鎼达繝鍙勬鐐寸墱閸掓帞鎲撮崟鍨秹婵犵數鍋為幐鎼佲�﹂悜钘夎摕闁哄洢鍨归柋鍥ㄧ節闂堟稒绁╂俊顐磿缁辨挻鎷呭灞筋伃濠电偟銆嬬换婵嗩嚕婵犳碍鍋勯柣鎾虫捣椤︹晠姊洪棃娑氬婵☆偅顨婇、鏃堟晸閿燂拷 by changhao
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


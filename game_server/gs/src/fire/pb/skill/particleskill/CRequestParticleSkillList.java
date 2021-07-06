
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
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻锛勪沪缁嬪灝鈷夐悗鍨緲鐎氼噣鏁撻弬銈囩У濞存粍绻堥、娆撳川椤撴稒鏂�闂佺粯鍔曞鍫曞煝閺囩伝鐟邦煥閸愵亜鐓熼悗娈垮櫘閸嬪﹤鐣烽崼鏇ㄦ晢濞达絽鎼敮楣冩⒒婵犲骸浜滄繛璇х畱鐓ら柡宓嫭鐦庨梻鍌氬�风粈渚�骞夐敍鍕床闁告劦鍠撻敓钘夊暞缁绘繈宕掗妶鍡欑▉缂傚倸鍊烽悞锕傗�﹂崶顒佸仭鐟滅増甯楅悡鏇㈡煏婢跺鐏ラ柛鐘宠壘椤洭鎳￠妶鍥╋紳闂佺鏈悷褔藝閿斿浜滈柨鏇炲�烽幉鍓э拷娈垮櫘閸嬪棝骞忛悩缁樺殤妞ゆ帊鐒﹂鏇㈡⒒娴ｅ憡鎯堟繛灞傚灲瀹曞綊宕烽鐘辩瑝闂佹寧绻傞ˇ浼存偂閵夆晜鐓涢柛鎰╁妼閿熺晫鎳撻埢宥夊即閵忥紕鍘卞┑鈽嗗灡鐎笛囁夋径鎰厓閻熸瑥瀚悘锔筋殽閻愯韬柡灞剧♁缁绘稖顦叉繛灞傚�楃划濠氼敍閻愬鍘介梺纭呮彧缁插�燁暱闂備胶绮幐楣冨窗閹邦厾鈹嶅┑鐘叉搐鍥撮棅顐㈡处閺屻劑顢旈崜浣虹＝闁稿本鐟ㄩ崗宀�绱掗鍛仸闁轰礁鍟存慨锟介柣妯虹仛濞堟儳鈹戦悙鍙夆枙濞存粍绻堝畷鎰槹鎼搭垱瀚归柣鐔告緲椤ュ繘鏌涢悩宕囧⒌妤犵偛鍟撮獮瀣晜鐟欙絾瀚肩紓鍌欑贰閸ㄥ崬煤閺嶃劍娅犻柡灞诲劜閻撴洟鏌￠崘鎸庡闁汇埄鍨抽崑銈夊箠閻愬瓨缍囬柕濞у懐妲囨繝娈垮枟閿曗晠宕㈤幖浣哥婵炲樊浜濋埛鎴︽煕濞戞﹫鍔熺紒鐘虫崌閹顫濋悡搴♀拫閻庢鍠楅幃鍌炲极閸愵喖纾兼繛鎴炶壘楠炲秴鈹戦敍鍕粶妞ゆ垵鎳忛〃銉╁箹娴ｇ鍋嶉梺鍦檸閸犳鎮″☉銏″�堕柣鎰絻閳锋棃鏌嶉崣銉х獢闁哄瞼鍠栭、娑樷槈濞嗘ɑ顥堝┑鐘殿暯閿熻棄纾崺锝囷拷瑙勬礀瀹曨剟鍩㈡惔銈囩杸闁哄啫鐗婇弳妯肩磽閸屾艾锟芥悂宕愰幖浣哥９濡炲娴烽惌鍡椼�掑鐐閻庤娲橀崝娆忕暦閻戠瓔鏁囬柣鏂挎啞椤斿洭姊绘担铏瑰笡婵﹤顭峰畷銏ｎ槼妞ゃ垹锕缁樻媴閸涘﹨纭�婵犫拃鍕垫當妞ゎ厼鐏濊灒闁兼祴鏅欑粭澶愭⒑鐟欏嫬鍔跺┑顔哄�濋幃鈥斥枎閹惧鍘甸柣鐔哥懃鐎氼剚鎱ㄩ崼銏㈡／妞ゆ挾濮存禍鐐亜閵婏絽鍔﹂柟顔界懇閹崇娀顢栭搴″閸欏繐鈹戦悩鎻掝伀閻㈩垱鐩弻鐔风暋閻楀牆娈楅梺鐟扮－閸嬨倖淇婇悿顖ｆЧ闂佽法鍠曞Λ鍕晝椤忓嫷娼栨繛宸簼椤ュ牓鏌嶉崫鍕殶閼叉牜绱撻崒娆掑厡濠殿喚鏁婚獮鎴﹀炊椤掍礁浠掑銈嗘濞夋洟鎮块敓钘夆攽閻愭潙鐏﹂柣鐕傜畱閳诲秹濮�閵堝棌鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢凹鍙冨畷宕囧鐎ｃ劋姹楅梺鍦劋閸ㄥ綊宕愰悙鐑樷拺闂傚牊涓瑰☉銏犲窛妞ゆ挶鍨诲畷鏇㈡⒒閸屾艾锟介绮堟担鍦彾濠电姴娲ょ壕濠氭煕濞戝崬鐏ｇ紒鎲嬬畱铻栭柨婵嗘噹閺嗘瑩鏌涢幋鐘残ラ柨鐔绘缁犲秹宕曢柆宓ュ洦瀵肩�涙ê浜楀┑鐐村灟閸ㄦ椽鎮￠弴銏＄厪濠㈣埖绋撻崚浼存煕閺冿拷瀹�鎼佸蓟閿濆牏鐤�濠电姴鍟悵姘舵⒑閸濆嫭婀伴柣鈺婂灡娣囧﹪骞栨担鑲濄劑鏌曟径妯虹仭閻庢艾缍婇弻娑㈡晜鐠囨彃绠洪悗瑙勬礀瀵墎鎹㈠┑瀣棃婵炴垵宕崜鍗烆渻閵堝啫鍔氶柣妤�锕﹂幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呴悷鏉款潔闂佺儵鏅╅崹浼达綖韫囨稑浼犻柛鏇ㄥ幗濞堥箖姊洪幖鐐插姌闁告柨鑻埢鎾崇暆閿熺晫妲愰幘瀛樺闁告挸寮舵晥闂備胶鎳撻幉鈩冪箾婵犲倻鏆︽繛宸簼閸婄兘鏌涘┑鍡楊伀妞ゆ挻妞藉娲箰鎼淬埄姊垮┑鈽嗗亜鐎氼厾绮嬪鍫涗汗闁圭儤鎸撮幏娲⒑閸涘﹦鈽夐柨鏇畵楠炲﹪宕橀埞澶哥盎闂佹寧鏌ㄩ悘婵嗙暤閸℃﹩娈介柣鎰絻閺嗘瑩鏌嶇拠鏌ュ弰妤犵偛顑夐幃鈺冨枈婢跺矂妫峰┑鐘垫暩閸嬬娀骞撻鍡楃筏濞寸姴顑呯粻瑙勩亜閹拌泛鐦滈柡浣风窔閺岀喖宕滆鐢盯鏌ｉ幘瀵告噰闁哄本鐩獮瀣枎韫囥儲瀚归柡宥庡亾閹峰嘲顫濋悙顒�顏�? by changhao
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
							
				if (size == 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟版晥濠电媴鎷峰〒姘炬嫹婵﹨娅ｇ槐鎺懳熼搹閫涙樊婵＄偑鍊ら崑鍛洪悢鐓庢瀬闁瑰墽绮�电姴顭跨捄渚叚闁归鍏樺畷绋款渻绾攱瀚瑰ù锝呭濞尖晠鏌ょ粙璺ㄤ粵婵炲懌鍨虹换娑氾拷鐢殿焾瀛濆銈嗗灥濞层倝鎮鹃崹顐ょ懝闁跨喍绮欓幃锟狀敃閿曪拷閻愬﹪鏌曟繛褝鎷锋俊淇卞姂濮婃椽宕崟顒�娅ら梺璇″枛閸婂灝顕ｆ繝姘╅柍鍝勫�告禍鐐烘⒑缁嬫寧婀扮紒瀣灴椤㈡棃鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠庢綂闂佺粯锚濡﹤螞瀹�鍕拺閺夌偞澹嗛ˇ锕傛煥閺囥劋閭�殿喖顭烽崹楣冨箛娴ｅ憡鍊梺纭呭亹鐞涖儵鏁撻挊澶岋紞妞ゆ梹鍔楃槐鎾诲磼濞嗘垵濡介梺鍛婃⒐閻楃娀濡撮崘鈺冪瘈闁搞儜鍡樻啺闂備胶鍋ㄩ崕鏌ュ礈濮樿泛瑙﹂悗锝庡枛缁犲湱绱掗鐐仧闁归鍏樺畷妯侯啅椤旂厧螚闂傚倸鍊搁崐宄懊归崶褜娴栭柕濞у懐鐒兼繛杈剧悼鐏忋劑骞忓畡閭︽僵妞ゆ劑鍨圭粊顕�鎮楀▓鍨灕妞ゆ泦鍥х叀濠㈣泛谩閻斿吋鐓ラ悗锝呯仛缂嶅苯鈹戦悩鍨毄闁稿绋戣灋婵炲棙鎸哥粈澶嬩繆閵堝懎鏆熼柣顓熺懇閺屾盯濡烽鐓庮潽闂佹娊鏀遍崹鍧楀蓟閻斿吋鍤冮柍杞版缁埖绻濈喊姗堟嫹閻愯棄浠梺鍝勬湰缁嬫帞鎹㈠┑瀣＜婵炴垶眉濞ｎ噣鏌ｆ惔銏╁晱闁哥姵鐩、姘愁樄闁糕斂鍎插鍕箛椤掑倸骞�闂備礁鍟块幖顐︻敄閸℃瑱鎷峰顒傜Ш闁哄被鍔戝鎾倷鐠囇勫闁告縿鍎虫稉宥夋煥濠靛棙顥犵紒鈽呮嫹闂傚倸鍊搁悧濠勭矙閹烘闂ù鐘差儐閻撴洟鏌熺�涙绠樼紒澶屽劋閹便劍绻濋崟顓炵闂佺懓鍢查幊妯虹暦閵婏妇绡�闁稿本绋掗悾濂告⒒閸屾瑦绁扮�规洜鏁诲畷浼村幢濞戞锛熼梺瑙勫劶濡嫮绮婚弻銉︾厪闊洦娲栭灞剧箾缁楀搫濮傞柡灞诲姂閹垽宕滄担铏瑰幆闂備胶绮笟妤呭闯閿濆懐鏆︽慨妤嬫嫹濠碘�虫啞閹棃濮�閳藉棙顥堥柣搴ゎ潐濞插繘宕濋幋锔猴拷浣糕枎閹炬潙娈熼梺闈涳紡閸愵亶妲梻鍌氬�搁崐椋庣矆娴ｉ潻鑰块梺顒�绉撮崒銊ф喐閺冨牆绠栨繛宸簻鎯熼悷婊冮閻ｇ兘寮婚妷锔惧幈闂佸搫娲㈤崝宀勬倶閿熺姵鐓曢幖杈剧節閸欏嫭顨ラ悙瀵稿⒈闁告帗甯為幉鎾礋閸偆绉瑰┑鐘垫暩閸嬬偤骞愰幖浣诧拷锕傛倻閽樺鎽曢梺鍝勬储閸ㄥ綊鏌嬮崶銊х瘈闂傚牊绋掔粊鈺備繆椤愵剛纾跨紒杈ㄦ尰閹峰懎顫㈢仦绛嬩純婵犵數鍋熼妴瀣崲濠靛棭鍤曞┑鐘崇閸嬪嫰鏌ｉ幘铏崳妞わ腹鏅犲娲濞戞艾顣哄┑鈽嗗亝椤ㄥ﹪銆侀弮鍫熸櫢闁跨噦鎷� by changhao
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


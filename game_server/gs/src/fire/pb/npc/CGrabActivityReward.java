
package fire.pb.npc;

import fire.pb.activity.award.RewardMgr;

import java.util.HashMap;
import java.util.Map;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGrabActivityReward__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGrabActivityReward extends __CGrabActivityReward__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure grabactivityreward = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				fire.pb.mission.activelist.RoleLiveness actrole = fire.pb.mission.activelist.RoleLiveness.getRoleLiveness(roleid, false);
				if (actrole != null)
				{
					xbean.ActivityQuestion activityquestion = xtable.Roleid2activityquestion.get(roleid);
					
					final long now = java.util.Calendar.getInstance().getTimeInMillis();
					if (activityquestion == null)
					{
						return true;
					}	
					else
					{
						long lasttime = activityquestion.getActivityquestionstarttime();
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夋偂閻旂厧绠归柟纰卞幖閻忥絿绱掓径灞炬毈闁哄本绋栫粻娑㈠籍閹剧櫢鎷风捄顭掓嫹濞堝灝鏋熼柟顔煎�搁锝嗙鐎ｅ灚鏅ｉ梺缁樻煥閸ゆ牠骞忛悜钘夊瀭妞ゆ劦鍋呴鏃堟⒑缂佹ê濮岄悘蹇旂懄缁傛帡濮�閵堝棛鍘遍梺鍝勫枦閹烽鐥弶璺ㄐｇ紒宀冮哺缁绘繈宕堕懜鍨珖闂備焦瀵х换鍌毭洪敃鍌氶棷妞ゆ洩鎷锋慨濠冩そ閹筹繝濡堕崨顔界暚闂備焦鎮堕崕顖炲礉婢舵劕绠紓浣诡焽缁犻箖寮堕崼婵嗏挃闁告帊鍗抽弻鐔烘嫚瑜忕弧锟介悗瑙勬处閸ㄥ爼骞冨▎鎾村�绘俊顖滃帶楠炴﹢姊绘笟锟藉鑽わ拷闈涚焸瀹曘垽宕楅懖鈺婃锤闂佸憡鎸嗛崨顖ょ床闂佸搫顦遍崑鐐寸珶閸℃稒鍎楁繛鍡樺煀閹峰嘲鈻撻崹顔界彯闂侀潻缍囩徊浠嬫偩閻戣棄绠抽柟鎼幘閸欏棝姊洪崨濠傚闁告柨绻楅·鍌炴⒒閸屾艾锟藉嘲霉閸ヮ剦鏁嬬憸蹇涙晸閼恒儳鈻撻柡鍛箘閸掓帒鈻庨幘宕囶唺濠德板�撻悞锕�鈻嶉弮鍌滅＝闁稿本鑹鹃敓浠嬵棑缁牊鎷呯憴鍕彿闁瑰吋鐣崝宀�澹曟繝姘厪闁割偅绻嶅Σ鎼佹煢閸愵亜鏋旈柨鐔绘缁犲秹宕曢柆宓ュ洭顢涘☉姗嗗殼闂佺粯顭囩划顖炴偂閺囥垺鐓涢柛銉ｅ劚婵＄厧霉濠婂棙顥夐棁澶愭煟閹炬娊顎楅柨鐔诲Г閹倿宕洪悙鍝勭闁挎棁妫勯敓浠嬵棑閿熺晫鎳撴竟濠囧窗濡や焦娅忛梻浣藉吹閸犳劗鍒掑鍜佺唵婵鎷风�规洦鍨跺鍫曞箣椤栨繐鎷烽崹顔氬綊鏁愰崶鈹匡拷濠囨煛閿熻姤绂掔�ｎ偆鍘藉┑鈽嗗灡椤戞瑩宕电�ｎ剨鎷风憴鍕仩闁稿海鏁诲濠氭偄妞嬪孩娈濋梻渚囧弿缁犳垿宕滈崼鏇熷�甸悷娆忓缁�瀣箾娴ｅ啿娲よ繚闂佸湱鍎ら〃鍡涘疾閹间焦鐓ラ柣鏇炲�圭�氾拷 changhao
						{
							return true;
						}
						
						if (activityquestion.getGrabreward() == 1)
						{
							fire.pb.common.SCommon c = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(236);
							int rewardid = Integer.parseInt(c.getValue());
							
							//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒鹃崯鍝ョ磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦梻鍫熺♁閹兼劙鎮楀顓熺凡妞ゆ洩缍侀獮姗�顢欓悡搴わ拷鍨攽鎺抽崐褔骞忛柨瀣ㄤ簻闊浄绲奸柇顖炴煛鐏炲墽鈽夐柍璇叉唉缁犳盯寮撮悪锟介崯瀣⒒娴ｅ憡鎯堥柣顓烆槺缁辩偞绗熼敓浠嬫偘椤曪拷瀹曞爼顢楁径瀣珜濠电偠鎻徊鍧楀箠閹捐绀堥柣銏犳啞閳锋帒霉閿濆牊顏犻悽顖涚洴閺屾盯寮敓钘壝洪悢鐓庢瀬闁告劦鍣弫鍌炴煕椤愶絿绠氶柟鑺ユ礋濮婃椽骞愭惔锝囩暤濡炪倧瀵岄崹宕囧垝鐠囨祴妲堟繛鍡楃С缁ㄥ姊洪崫鍕殭婵炲眰鍊涢。鎸庣節濞堝灝娅欑紒鑼櫕閿熻姤纰嶅姗�锝炶箛娑欐優閻熸瑥瀚崢褰掓⒑閸涘﹣绶遍柛妯荤矒楠炴锟介潧鎽滈鏇㈡⒑閸涘﹦鎳冩い褝鎷烽梺鑲╁鐎笛囥�冮妷鈺傚�烽柤纰卞墮閳灚绻濈喊妯哄⒉闁诡喖鍊规穱濠囨倻閽樺娼婇梺鏂ユ櫅閸燁垰顭块幋锔解拻闁稿本鐟︾粊鐗堛亜椤愩埄妲搁柣锝呭槻椤粓鏁撻挊澶屾殾婵炲樊浜滈崘锟藉銈嗘尵閸嬬喖鏁嶅☉銏″仭婵犲﹤瀚悡銉︺亜椤愩垻绠伴悡銈嗐亜韫囨挻鍣归柨鐔烘櫕閸忔﹢寮婚敃锟借灒濞撴凹鍨辩瑧濠电姵顔栭崰妤�煤閻斿娼栨繛宸簻缁犱即骞栧ǎ顒�鐏柨娑欙耿濮婃椽骞栭悙鎻掝瀱缂備緡鍠楅悷鈺呭箖娴兼惌鏁嬮柨鐔绘閻ｇ兘宕￠悙鈺傤潔濠碘槅鍨抽埛鍫澪ｉ悧鍫滅箚闁绘劦浜滈敓鑺ョ墪铻炲〒姘炬嫹鐎规洘鍨块獮鍥礂椤愩垺鍠樼�殿喛娉涢埢搴ㄦ倷椤掞拷閻︽粓姊绘笟锟藉褔鎮ч崱妞㈡稑螖娴ｇ懓寮块梺绋跨灱閸嬬偤鎮￠弴銏＄厪濠电姴绻樺顕�鏌曢崶銊х疄闁圭锕幃銏ゅ传閵壯呮闂傚倸鍊搁悧濠冪瑹濡ゅ懎纾块柟鎵閻撳啴姊洪崹顕呭剰闁诲繑鎸抽弻鈥崇暆鐎ｎ剙鍩屽銈庡亝缁诲牓銆佸Δ鍛＜婵炴垶鐟ラ弸娑㈡⒒娴ｇ瓔鍤欓悗娑掓櫊閹垽顢楅崟顐ゎ唵闂佽法鍣﹂幏锟�?
							Map<String, Object> paras = new HashMap<String, Object>(10);
							paras.put(RewardMgr.ANSWER_RIGHT_TIMES, activityquestion.getAnswerrighttimes());
							fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, rewardid, paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_grab, 0,fire.pb.PAddExpProc.OTHER_QUEST, "缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂垮悑閸婄粯淇婇婊冨妺妞ゆ梹娲栭埞鎴︽倷閺夋垹浠ч梺鎼炲妼濠�杈╁垝閸儱绀冮柍鐟般仒缁ㄥ姊洪崫鍕殭闁稿﹥鎮傞幆鍐箣閿旂晫鍘垫俊鐐差儏妤犳悂宕㈢�甸潻鎷风憴鍕閻㈩垽绻濋獮鍐ㄢ枎閹搭垱瀚规繛鎴烆伆閹达富鏁傞柣鏂垮悑閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡晲韫囨洜鏆ゅΔ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�");
							activityquestion.setGrabreward(2);
							
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160417, null);
														
							SGrabActivityReward msg = new SGrabActivityReward();
							mkdb.Procedure.psendWhileCommit(roleid, msg);						
						}
						else if (activityquestion.getGrabreward() == 2)
						{
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160418, null);	
						}
						else if (activityquestion.getGrabreward() == 3)
						{
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160416, null);								
						}
					}
				}
				
				return true;
			}
		};
		
		grabactivityreward.submit();		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795531;

	public int getType() {
		return 795531;
	}


	public CGrabActivityReward() {
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
		if (_o1_ instanceof CGrabActivityReward) {
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

	public int compareTo(CGrabActivityReward _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.npc;
import fire.pb.mission.activelist.RoleLiveness;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestActivityAnswerQuestion__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestActivityAnswerQuestion extends __CRequestActivityAnswerQuestion__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure requestteammatchlist = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				fire.pb.mission.activelist.RoleLiveness actrole = fire.pb.mission.activelist.RoleLiveness.getRoleLiveness(roleid, false);
				if (actrole != null)
				{
					int count = actrole.getActiveNum(fire.pb.mission.activelist.RoleLiveness.ANSWER_QUESTION);
				
					fire.pb.activity.ActivityConfNew activity = RoleLiveness.getConfigActivity(fire.pb.mission.activelist.RoleLiveness.ANSWER_QUESTION);
					
					boolean start = fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().IsStart();
					if (count < activity.maxnum && start == true) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻愰湁闁稿繐鍚嬬紞鎴︽煕閵娿儱锟藉骞夐幖浣瑰亱闁割偅绻勯悷鏌ユ⒑缁嬪尅宸ラ柣鏍с偢瀵鈽夐姀鈺傛櫇闂佺粯蓱瑜板啯鎱ㄦ惔銊︹拺婵懓娲ら敓鑺ヮ殜瀹曟垿骞橀懜闈涘簥濠电娀娼уú銊у姬閿熶粙姊虹粙鎸庢拱缂侇喖鐭傞崺娑㈠醇閵夛腹鎷洪柡澶屽仦婢瑰棝藝閿曞倹鐓曢柣鏇氱娴滀即鏌涢埡鍐ㄤ槐妤犵偛顑夐弫鍐晸閻ｅ苯顥氶柛蹇氬亹缁★拷婵犵數濮撮崐褰掑箲閿濆鐓曢柡鍐挎嫹闁诡喖鍊搁～蹇撁洪鍕炊闂佸憡娲熷褔宕滈鍓х＝濞撴艾锕ョ�氳绻涙潏鍓ф偧闁哄拋鍋呯粋宥夊础閻愨晜鏂�闂佸疇妫勫Λ妤佺閻楀牄浜滈柨婵嗙箳閻ｉ亶妫佹径鎰厱闁靛鍠栨晶顔剧磼閿熶粙宕掑鎰闁谎冩啞鐎氬綊姊洪崨濠冨闁告挻鐩畷銏＄鐎ｎ偀鎷虹紓鍌欑劍钃遍柍閿嬪笚閵囧嫰顢橀悙闈涱杸闂侀�涚┒閸斿矂顢樻總绋垮耿婵☆垰鎼导搴♀攽閻樺灚鏆╁┑顔芥尦瀹曟垿宕卞☉娆忎簵婵犻潧鍊搁幉锟犳偂濞戞◤褰掓晲閸偅缍堥悗瑙勬礀閻倿寮婚埄鍐╁閻熸瑥瀚壕鎶芥⒑鏉炴壆鍔嶉柟鐟版喘瀵偊骞樼紒妯绘闂佽法鍣﹂幏锟�? by changhao
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop == null)
						{
							return false;
						}
						
						if (prop.getLevel() < activity.level)
						{
							return false;
						}
						
						xbean.ActivityQuestion activityquestion = xtable.Roleid2activityquestion.get(roleid);
						
						final long now = java.util.Calendar.getInstance().getTimeInMillis();
						if (activityquestion == null) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇氱劍閹冲矂姊绘担鍛婂暈闁荤喆鍎抽幑銏狀潨閿熻棄顕ｆ繝姘亜闁惧繐婀遍敍婊堟⒑闂堟稓绠冲┑顔炬暬閹﹢宕奸妷锔规嫼濠电偠灏褔鐛Δ浣典簻闁靛鍎婚煬顒傦拷娈垮枦椤曆囧煡婢舵劕顫呴柣姗�娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃�娲橀弲鑸电鐎ｎ亞顦梺缁樺灱婵倝鍩涢幋锔界厱闊洦鎸婚崳钘夆槈閹惧鍙�闁哄瞼鍠栧畷娆撳Χ閸℃浼�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫孝缂傚秴锕璇差吋婢跺﹣绱堕梺鍛婃处閸嬫捇骞忛柨瀣瘈婵ǜ鍎婚幏鐑藉川閺夋垹鐓戞繝銏ｆ硾閻ジ鎯侀崼銉︹拻闁稿本姘ㄦ晶娑樸�掑顓ф疁鐎规洘娲濈粻娑樷槈濞嗘垵寮梻浣告啞閸旓附绂嶅鍫濆嚑閹兼番鍔嶉悡鍐偡濞嗗繐顏╅柣蹇旀尦閺岀喖顢欑憴鍕彋閻庤娲╃徊鎯ь嚗閸曨剛绡�閹肩补鎳ｉ悢鍏尖拻闁稿本鐟ㄩ崗灞俱亜椤撶偟澧︾�规洘鐟︾粋鎺旓拷锝庝簽椤斿棝姊虹捄銊ユ珢闁瑰嚖鎷�? by changhao
						{
							activityquestion = xbean.Pod.newActivityQuestion();
							xtable.Roleid2activityquestion.insert(roleid, activityquestion);
							
							fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);
						}	
						else
						{
							long lasttime = activityquestion.getActivityquestionstarttime();
							
							if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夋偂閻旂厧绠归柟纰卞幖閻忥絿绱掓径灞炬毈闁哄本绋栫粻娑㈠籍閹剧櫢鎷风捄顭掓嫹濞堝灝鏋熼柟顔煎�搁锝嗙鐎ｅ灚鏅ｉ梺缁樻煥閸ゆ牠骞忛悜钘夊瀭妞ゆ劦鍋呴鏃堟⒑缂佹ê濮岄悘蹇旂懄缁傛帡濮�閵堝棛鍘遍梺鍝勫枦閹烽鐥弶璺ㄐｇ紒宀冮哺缁绘繈宕堕懜鍨珖闂備焦瀵х换鍌毭洪敃鍌氶棷妞ゆ洩鎷锋慨濠冩そ閹筹繝濡堕崨顔界暚闂備焦鎮堕崕顖炲礉婢舵劕绠紓浣诡焽缁犻箖寮堕崼婵嗏挃闁告帊鍗抽弻鐔烘嫚瑜忕弧锟介悗瑙勬处閸ㄥ爼骞冨▎鎾村�绘俊顖滃帶楠炴﹢姊绘笟锟藉鑽わ拷闈涚焸瀹曘垽宕楅懖鈺婃锤闂佸憡鎸嗛崨顖ょ床闂佸搫顦遍崑鐐寸珶閸℃稒鍎楁繛鍡樺煀閹峰嘲鈻撻崹顔界彯闂侀潻缍囩徊浠嬫偩閻戣棄绠抽柟鎼幘閸欏棝姊洪崨濠傚闁告柨绻楅·鍌炴⒒閸屾艾锟藉嘲霉閸ヮ剦鏁嬬憸蹇涙晸閼恒儳鈻撻柡鍛箘閸掓帒鈻庨幘宕囶唺濠德板�撻悞锕�鈻嶉弮鍌滅＝闁稿本鑹鹃敓浠嬵棑缁牊鎷呯憴鍕彿闁瑰吋鐣崝宀�澹曟繝姘厪闁割偅绻嶅Σ鎼佹煢閸愵亜鏋旈柨鐔绘缁犲秹宕曢柆宓ュ洭顢涘☉姗嗗殼闂佺粯顭囩划顖炴偂閺囥垺鐓涢柛銉ｅ劚婵＄厧霉濠婂棙顥夐棁澶愭煟閹捐櫕鍞夐悗姘嵆閺屽秶鎲撮崟顐や紝闂佽鍠楅悷锕傛晬閹邦兘鏀介柛鈩冾焽閺夎櫣绱撻崒姘拷鐑芥倿閿曚降浜归柛鎰ㄦ櫆濞呯姴霉閻樺樊鍎忕紒鐘崇叀閺屾洝绠涢弴鐐愭稒淇婇幓鎺斿ⅵ闁哄本娲濈粻娑㈠即閻愭劑鍎查妵鍕籍閿熺晫鏁垾鎰佹綎婵炲樊浜滅粻姘辨喐鎼达絿鐭夐悗锝庡枟閻撴洟鎮楅敐搴濈盎妞ゅ繆鏅犻弻宥囨嫚閼碱儷銉︺亜閿曚緡娼愰柟渚垮妽缁绘繈宕掑☉娆忓壍闂備椒绱徊鍧楀礂濡櫣鏆﹂柛顐ｆ磵閿熸枻绠撻獮瀣煥閸曨偆鍘遍梻鍌氬�搁崐鐑芥嚄閸洖绠犻柟鎹愵嚙閸氬綊鏌″搴″箹缂佺媭鍨堕弻銊╂偆閸屾稑顏� by changhao
							{
								fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);	
							}
						}
						
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姵婢橀埞鎴︽偐瀹曞浂鏆￠梺绋款儏鐎氼參濡甸崟顖氱闁瑰瓨绻嶆禒鑲╃磽娴ｅ搫顎岄柛銊ㄦ硾椤繐煤椤忓嫬鐎銈嗘礀閹冲酣宕滈鐔虹閻庢稒顭囬惌瀣磼椤旇姤宕岀�殿喖顭锋俊鎼佸Ψ閵忊剝鏉搁梻浣虹《閸撴繈銆冭箛鏂款嚤闁跨喍绮欏缁樻媴鐟欏嫨浠ч梺鍛娒肩划娆撳箖閻戣棄鐓涢柛娑卞弨閹芥洟姊虹紒妯烩拻闁冲嘲鐗撳顐㈩吋婢跺鍘梺鍓插亝缁诲啴藟濠婂嫨浜滈煫鍥ュ劜鐎氾拷? by changhao
						fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().sendQuestion(roleid, activityquestion, (byte)0);
					}
				}
				
				return true;
			}
		};
		
		requestteammatchlist.submit();		
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795527;

	public int getType() {
		return 795527;
	}


	public CRequestActivityAnswerQuestion() {
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
		if (_o1_ instanceof CRequestActivityAnswerQuestion) {
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

	public int compareTo(CRequestActivityAnswerQuestion _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CActivityAnswerQuestionHelp__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}


public class CActivityAnswerQuestionHelp extends __CActivityAnswerQuestionHelp__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure activityanswerquestionhelp = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				final xbean.ClanInfo factionInfo = fire.pb.clan.ClanUtils.getClanInfoById(roleid, true);
				if (null == factionInfo)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160420, null);
					return true;
				}	
				
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
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣濠垫劖缍楅梺璺ㄥ枙濡嫰宕愰崷顓犵焿闁圭儤妫戦幏鐑芥晲鎼粹�茬凹濠电偛鎳岄崹钘夘潖濞差亝鍤嶉柕澶婂枤娴滎亣妫熷銈嗙墱閸嬫稑效閺屻儲鈷戞い鎺炴嫹缂佸鏁婚幃锟犲Ψ閳哄倻鍘介梺鍝勫暙閸婅崵鏁☉娆嶄簻闁靛鍎哄Σ铏圭磼鏉堛劍灏い鎾炽偢瀹曨亪宕橀鐐村創濠德板�楁慨鐑藉磻濞戙垹鐤い鎰╁劤娴滀粙姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幋鐘靛箵闂佺粯鍔楅崕銈夋偂閻旂厧绠归柟纰卞幖閻忥絿绱掓径灞炬毈闁哄本绋栫粻娑㈠籍閹剧櫢鎷风捄顭掓嫹濞堝灝鏋熼柟顔煎�搁锝嗙鐎ｅ灚鏅ｉ梺缁樻煥閸ゆ牠骞忛悜钘夊瀭妞ゆ劦鍋呴鏃堟⒑缂佹ê濮岄悘蹇旂懄缁傛帡濮�閵堝棛鍘遍梺鍝勫枦閹烽鐥弶璺ㄐｇ紒宀冮哺缁绘繈宕堕懜鍨珖闂備焦瀵х换鍌毭洪敃鍌氶棷妞ゆ洩鎷锋慨濠冩そ閹筹繝濡堕崨顔界暚闂備焦鎮堕崕顖炲礉婢舵劕绠紓浣诡焽缁犻箖寮堕崼婵嗏挃闁告帊鍗抽弻鐔烘嫚瑜忕弧锟介悗瑙勬处閸ㄥ爼骞冨▎鎾村�绘俊顖滃帶楠炴﹢姊绘笟锟藉鑽わ拷闈涚焸瀹曘垽宕楅懖鈺婃锤闂佸憡鎸嗛崨顖ょ床闂佸搫顦遍崑鐐寸珶閸℃稒鍎楁繛鍡樺煀閹峰嘲鈻撻崹顔界彯闂侀潻缍囩徊浠嬫偩閻戣棄绠抽柟鎼幘閸欏棝姊洪崨濠傚闁告柨绻楅·鍌炴⒒閸屾艾锟藉嘲霉閸ヮ剦鏁嬬憸蹇涙晸閼恒儳鈻撻柡鍛箘閸掓帒鈻庨幘宕囶唺濠德板�撻悞锕�鈻嶉弮鍌滅＝闁稿本鑹鹃敓浠嬵棑缁牊鎷呯憴鍕彿闁瑰吋鐣崝宀�澹曟繝姘厪闁割偅绻嶅Σ鎼佹煢閸愵亜鏋涢柡宀嬬節瀹曞爼濡烽妷褌鎮ｉ梻鍌欑瀹曨剙煤椤撱垹钃熼柨婵嗩槸缁秹鏌涢妷銊︾【婵炲牜鍘界换婵嗏枔閸喗鐝梺鐟板殩閹凤拷 changhao
						{
							return true;
						}
						
						if (activityquestion.getHelptimes() < 3)
						{
							activityquestion.setHelptimes(activityquestion.getHelptimes() + 1);
							
							mkdb.Procedure.pexecuteWhileCommit(new PSendActivityAnswerQuestionHelp(roleid, questionid));
							
							SActivityAnswerQuestionHelp msg = new SActivityAnswerQuestionHelp();
							msg.helpnum = activityquestion.getHelptimes();
							mkdb.Procedure.psendWhileCommit(roleid, msg);
						}
						else
						{
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160421, null);	
						}
					}
				}
				
				return true;
			}
		};
		
		activityanswerquestionhelp.submit();		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795532;

	public int getType() {
		return 795532;
	}

	public int questionid;

	public CActivityAnswerQuestionHelp() {
	}

	public CActivityAnswerQuestionHelp(int _questionid_) {
		this.questionid = _questionid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questionid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questionid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CActivityAnswerQuestionHelp) {
			CActivityAnswerQuestionHelp _o_ = (CActivityAnswerQuestionHelp)_o1_;
			if (questionid != _o_.questionid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questionid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questionid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CActivityAnswerQuestionHelp _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questionid - _o_.questionid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


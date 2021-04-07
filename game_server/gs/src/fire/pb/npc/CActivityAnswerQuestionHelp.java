
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
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鐓熼幖鎼灣缁夌敻鏌涜箛鏃撹�跨�殿喗鎮傚浠嬵敇閻斿嚖鎷烽崹顐闁绘劘灏欐禒銏ゆ煕閺冿拷绾板秵绌辨繝鍥舵晝闁挎繂娲﹂崳顕�姊洪懡銈呮殌闁搞儯鍔夐幏缁樼箾鏉堝墽鍒伴柟璇х節瀹曨垶鎮欓悜妯煎幘闂侀潻瀵岄崢鍏肩閸撗呯＜閺夌偞澹嗛惌娆戯拷娈垮櫘閸ｏ絽鐣烽幒鎴叆闁告劑鍔忚闂傚倷娴囬褏锟芥稈鏅濈划娆撳箳濡や焦娅旂紓鍌氬�风粈浣规櫠鎼淬劌纾婚柕鍫濐槸閽冪喖鏌￠崶銉ョ仼闂佸崬娲弻锝夊籍閸ヨ泛娈繝娈垮櫙閹凤拷 changhao
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


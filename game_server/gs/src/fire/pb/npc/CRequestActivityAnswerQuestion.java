
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
					if (count < activity.maxnum && start == true) //濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倻鎲搁悧鍫濈瑲闁稿﹤鐖奸弻娑㈩敃閻樻彃濮庨梺姹囧�楅崑鎾舵崲濠靛洨绡�闁稿本绮岄埛鍫ユ⒑鏉炴壆顦﹂柛鐕佸亰閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹鎹ｉ柛鏃�鎮傚娲传閸曢潧鍓紓渚婃嫹濞达絿鏅禍鍗炩攽閳藉棗浜版い锝忕畱闇夐柛銉墮缁�鍌滐拷鐧告嫹闁告洦鍓涢崢浠嬫⒑缂佹ɑ鈷掓い顓炵墛閹便劌顓奸崱妯哄伎婵犵數濮撮崑鍡涙偂婵傚憡鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷? by changhao
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
						if (activityquestion == null) //闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕佹懌闂佸憡鐟ョ换姗�寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑濞茶骞楁い銊ワ躬瀵鈽夐姀鐘靛姶闂佸憡鍔曟晶浠嬪礉閻戣姤鈷戦柛蹇撴噽娑撴煡鏌熼崙銈嗗?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堥梻鍌氱墛娓氭宕曡箛娑欑參闁告劦浜滈弸搴ㄦ煃鐟欏嫬鐏撮柟顔规櫊瀹曪絾寰勬繝搴⑿熼梻鍌欒兌椤牓宕欐禒瀣闁跨噦鎷�? by changhao
						{
							activityquestion = xbean.Pod.newActivityQuestion();
							xtable.Roleid2activityquestion.insert(roleid, activityquestion);
							
							fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);
						}	
						else
						{
							long lasttime = activityquestion.getActivityquestionstarttime();
							
							if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鐓熼幖鎼灣缁夌敻鏌涜箛鏃撹�跨�殿喗鎮傚浠嬵敇閻斿嚖鎷烽崹顐闁绘劘灏欐禒銏ゆ煕閺冿拷绾板秵绌辨繝鍥舵晝闁挎繂娲﹂崳顕�姊洪懡銈呮殌闁搞儯鍔夐幏缁樼箾鏉堝墽鍒伴柟璇х節瀹曨垶鎮欓悜妯煎幘闂侀潻瀵岄崢鍏肩閸撗呯＜閺夌偞澹嗛惌娆戯拷娈垮櫘閸ｏ絽鐣烽幒鎴叆闁告劑鍔忚闂傚倷娴囬褏锟芥稈鏅濈划娆撳箳濡や焦娅旂紓鍌氬�风粈浣规櫠鎼淬劌纾婚柕鍫濐槸閽冪喓锟藉箍鍎遍ˇ顖涘閻樼粯鐓曢柡鍥ュ妼娴滆棄霉閻撳氦瀚伴柍瑙勫灴閹瑦锛愬┑鍡樼杺缂傚倷鐒﹁ぐ鍐╂櫠娴犲绠查柕蹇曞Л濡插牓鏌曡箛鏇炐ユい鏃�甯″娲箚瑜庣粋瀣煕鐎ｎ亜顏╅柍璇茬Х椤﹁鎱ㄦ繝鍌涙儓闁伙絿鍏樺畷鍫曗�﹂幋婊勫煕闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹 by changhao
							{
								fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);	
							}
						}
						
						//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸嬪嫭銇勯幒鎴濐仼缂佺媭鍨跺娲垂椤曞懎鍓繛瀛樼矋缁捇寮婚妸銉㈡斀闁糕剝顨忔导锟介梻浣规た閸樹粙鎮烽埡鍛摕闁绘梻鈷堥弫宥夋煏閸繃顥滄い蹇ユ嫹? by changhao
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


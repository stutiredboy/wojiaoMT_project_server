
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
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鐓熼幖鎼灣缁夌敻鏌涜箛鏃撹�跨�殿喗鎮傚浠嬵敇閻斿嚖鎷烽崹顐闁绘劘灏欐禒銏ゆ煕閺冿拷绾板秵绌辨繝鍥舵晝闁挎繂娲﹂崳顕�姊洪懡銈呮殌闁搞儯鍔夐幏缁樼箾鏉堝墽鍒伴柟璇х節瀹曨垶鎮欓悜妯煎幘闂侀潻瀵岄崢鍏肩閸撗呯＜閺夌偞澹嗛惌娆戯拷娈垮櫘閸ｏ絽鐣烽幒鎴叆闁告劑鍔忚闂傚倷娴囬褏锟芥稈鏅濈划娆撳箳濡や焦娅旂紓鍌氬�风粈浣规櫠鎼淬劌纾婚柕鍫濐槸閽冪喓锟藉箍鍎遍ˇ顖涘閻樼粯鐓曢柡鍥ュ妼娴滆棄霉閻撳骸锟芥悂鍩為幋锔藉�风�瑰壊鍠楁晥闁荤喐绮嶅姗�宕弶鎴�垮ù锝囩《閺�浠嬫煟濡鍤嬬�规悶鍎甸弻鐔风暋闁箑鍓堕悗瑙勬礋濞佳囧Υ閹烘鏅搁柨鐕傛嫹 changhao
						{
							return true;
						}
						
						if (activityquestion.getGrabreward() == 1)
						{
							fire.pb.common.SCommon c = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(236);
							int rewardid = Integer.parseInt(c.getValue());
							
							//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晢濞达絿鎳撻崜鐢告⒒娴ｈ櫣甯涢柛鏃�娲熼弫鍐敂閸繆鎽曢梺鎸庣箓椤︻垳绮诲☉娆嶄簻闁哄啫娲よ濠殿噯绲界�氭澘顫忛搹瑙勫厹闁告侗鍘滈幘瀵哥闁告瑥顧�閼版寧顨ラ悙鑼ⅵ濠碘剝鎮傛俊鐑藉閳╁啯婢戦梻鍌欐祰椤鐣峰锟藉畷娲冀椤撶偟锛涢悷婊勬煥椤繐煤椤忓懎锟界兘鏌﹀Ο渚Ц濠殿喗娲熷娲箰鎼淬垻锛橀梺鎼炲妺缁瑩鎮伴锟藉畷鍗炩槈濡⒈妲版俊鐐�栧Λ渚�宕戦幇鍏洭寮跺▎鐐瘜闂侀潧鐗嗗Λ妤佹叏閸岀偞鐓曢柕濠忛檮閵囨繈鎸婇悢鍝ョ瘈闂傚牊渚楅崕鎰版煃闁垮鐏撮柡宀嬬到椤繈顢楅崒娑欏枛闂佽瀛╅悢顒勫箯閿燂拷?
							Map<String, Object> paras = new HashMap<String, Object>(10);
							paras.put(RewardMgr.ANSWER_RIGHT_TIMES, activityquestion.getAnswerrighttimes());
							fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, rewardid, paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_grab, 0,fire.pb.PAddExpProc.OTHER_QUEST, "缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔兼倻濡儤顔曞┑鐐村灟閸ㄥ湱绮堥崘鈹夸簻闁哄啫鍊搁惃鎴︽煙妞嬪骸鍘寸�规洘甯￠幃娆戯拷娑櫳戦鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�");
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


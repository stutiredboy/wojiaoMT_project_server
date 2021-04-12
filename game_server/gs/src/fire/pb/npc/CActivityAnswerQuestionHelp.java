
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
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鍋傞柣鏃傚帶缁犲綊鏌熺喊鍗炲箹闁诲骏绲跨槐鎺撳緞鐏炵偓姣堥梺鍝勬湰缁嬫牜绮诲☉銏犵睄闁瑰墽娅㈤幏椋庢崉椤帗瀚规繛鍫濈仢閺嬬喖鏌熼鐓庯拷鎼侇敋閿濆棛顩烽悗锝呯仛閺咃綁姊虹紒妯荤叆闁搞倖鐗犻獮蹇涙倻閽樺鐎銈嗗姦閸嬪懘顢欓弮鍫熲拺缂備焦锚婵矂鎮樿箛鏃傛噭缂佸倹甯℃慨锟介柕鍫濇閸橀亶姊洪崫鍕灕闁圭兘顥撻惀顏堝级鐠恒剱锝囩磼瀹�鍐摵缂佺粯绻堝畷鍫曟嚋閸偅鐝栭梻鍌欑劍鐎笛呮崲閸屾娲晝閸屾岸妫峰銈嗘穿閹烽攱鎱ㄦ繝鍐┿仢闁圭绻濇俊鍫曞川椤旂晫鏆氶梻鍌欑劍閹爼宕曢鐐茬濠㈣埖鍔曠粻顖滅磽娴ｈ鐒界紒鐘荤畺瀵爼宕煎┑鍡忔寖闂佸憡甯婇崡鎶藉蓟閻旂儤瀚氱憸蹇曞姬閿熶粙鎮楃憴鍕闁搞劌鐖奸獮鍐ㄢ枎閹炬潙锟界粯淇婇婊冨付妤犵偞锕㈠缁樼瑹閿熻棄顭囬懡銈忔嫹闂堟稓鐒哥�规洏鍨藉畷妤呮嚃閳哄﹥閿ら梻浣告啞閹稿棝宕ㄩ銈囧簥闂備礁鎼ˇ閬嶅磻閻愬鐝堕柛鈩冪♁閸庢绻涢崱妯虹厐闁瑰嘲鍢查埢鎾诲垂椤旂晫褰梻渚�娼荤紞鍥╁緤娴犲鍋╅柣鎴ｆ缁犳娊鏌熼幖顓炲箻闁告瑥妫濆娲川婵犲倸顫囬梺鍛婃煥缁绘路閸岀偞鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儺鍓﹂弫瀣喐韫囨稒鏅搁柤鎭掑劤閳绘捇鏌￠崨顔剧畼闁告帗甯掗埢搴ㄥ箻瀹曞浂鍞烘繝寰锋澘锟芥捇鎮為敃锟介埢宥夊籍閸屾粎锛濋梺绋挎湰閼归箖鏁撴禒瀣垫缂侇喖鐗婇幏鍛喆閸曨剛褰块梺鐟板悑閻ｎ亪宕濆畝锟芥竟鏇熺節濮橆厾鍘梺鍓插亝缁诲秴危閹间焦鐓㈤柛鎰典簻閺嬫盯鏌″畝瀣瘈鐎规洖鐖兼俊鐑藉Ψ瑜岄幃锝夋⒒閸屾瑧顦︾�规洦鍓欑叅妞ゆ挶鍨归拑鐔兼煥濠靛棭妲哥紒顐㈢Ч閺屾盯濡烽妸锔俱�愬┑鐐茬墱閸樼晫鎹㈠┑鍡忔灁闁割煈鍠楅悵顖炴⒑閻熸澘娈╅柟鍑ゆ嫹 changhao
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


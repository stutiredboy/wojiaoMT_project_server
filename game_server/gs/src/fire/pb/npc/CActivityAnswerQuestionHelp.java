
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
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦伴崑鍌炴煟閺冨倸甯剁紒鐘茬秺閺岀喓鍠婇崡鐐茬闂佽楠忕徊璺ㄦ閹烘挸绶為悘鐐靛亾濮ｅ牓姊洪崫鍕拱缂佸鐗滅划璇测槈閵忕姷鐫勯梺鐟板⒔濞呫垽骞忔搴㈠磯妞ゎ厽甯楃�氳绻涢崼婵堜虎闁哄鍠栭弻鐔碱敊閻撳函鎷烽幖渚囨晪闁挎繂妫涢々鐑芥倵閿濆懐浠涢柡鍜冪秮濮婅櫣绱掑Ο鑽ゅ弳闂佹悶鍊栭悧鐘荤嵁韫囨稒鍊婚柦妯侯槸閻庮厼顪冮妶鍡楀Е闁稿鎳橀、娆撳籍閸啿鎷虹紓鍌欑劍閿氬┑顔肩焸閹绠涢弮鍌涘櫗缂備礁鍊圭敮鈩冩叏閿熶粙鏌曢崼婵囶棤闁告﹢浜跺娲传閸曨偅鐏曢梺鍦厴椤ユ捇鎯�椤忓牆绾ч悹鎭掑壉閿濆洨纾肩�癸拷閸愵喖鎽电紓浣虹帛缁诲牆鐣烽崼鏇熷殝闁割煈鍋呴悵鏍⒒閸屾瑧鍔嶉悗绗涘懏宕查柛灞绢嚔濞差亝鏅濋柛灞惧哺濡嘲顪冮妶鍡樼┛闁圭兘鏀遍幈銊︾節閸愨斂浠㈤梺鍦劜缁绘繃淇婇崼鏇炲窛妞ゆ梻鏅弳姘舵⒒閸屾瑧鍔嶉柟顔肩埣瀹曟洟顢涢悙鑼槷婵犮垼鍩栭崝鏇犵不椤栨粎纾藉ù锝堫嚃閻掔晫绱掗悩鑽ょ暫鐎殿喖鐖煎畷鐓庘攽閸″繑瀵栭梻浣告啞鐢﹪宕￠幎钘夎摕闁绘梻鍎ょ�氭氨鎲歌箛鏇炲К闁跨喍绮欓幃妤冩喆閸曨剙顦╅梺鎼炲妼閻栧ジ鐛崘銊㈡瀻闁圭偓娼欓敓鐣岀帛娣囧﹪顢涘鍐ㄤ粯濡ょ姷鍋為敃銏狀潖缂佹鐟归柨鐔绘椤洭鎳￠妶蹇斿闂傚牊绋撻悞鍝ワ拷瑙勬磸閸ㄨ棄鐣峰Δ鍛殐闁冲搫锕ラ柨銈夋⒒娴ｅ憡鍟為柟绋挎瀹曘劑顢涢妶鍥х哎闂傚倷绀侀幖顐λ囬柆宥呯；闁绘劕顕悵鍫曟煕閳╁啰鈾侀柛搴㈩殕缁绘盯宕卞Ο铏瑰帎闂佺懓鍢查崲鏌ュ煝閹捐鍨傛い鏃傛櫕瑜邦垶姊绘笟锟藉鑽ょ礊閸モ晛绶ゅù鐘差儐閸嬧晠鏌ｉ幋锝嗩棄缂佺姵濞婇弻鐔煎箹椤撶偛绠婚梺鍛婄懃濡繂顫忓ú顏勫窛濠电姴鍊搁～鍥⒑閸涘﹥鐓ョ紒缁橆殜璺柛宀�鍋為埛鎺楁煕鐏炴崘澹橀柨鐔绘閸㈡煡婀侀梺鎼炲労閸擄箓寮�ｎ剚鍠愰煫鍥ㄧ♁閺呮悂鏌ら幁鎺戝姢闁崇粯鎹囬弻锟犲川椤斿墽鐣奸梺鍛婂笚鐢帡鍩㈡惔銊ョ鐎规洖娴傞崬鐑樼節瀵伴攱婢橀敓鑺ユ崌閹偤鏁冮敓浠嬪煝瀹ュ绫嶉柛灞剧矌閿涙繈姊虹粙鎸庢拱闁煎綊绠栭弫鎾寸鐎ｅ灚顥栫紓渚囧枛閻楀﹪骞忛崨顖涘枂闁告洦鍓涜ぐ鍧楁⒑閻熸澘鎮戦柣锝庝邯瀹曟繂鐣濋敓鑺ョ珶閺囩喓绡�婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇茬Т鍗遍柟闂寸劍閻撱垽鏌涢幇鍏哥盎闁哄鐩弻鈥崇暆鐎ｎ剛鐦堥悗瑙勬礀閻栧吋淇婇悜钘壩ㄧ憸宀勫箖閿濆鈷掗柛灞剧懅椤︼妇锟借娲﹂崜娆戝弲濡炪倖鎸堕崹褰掓嫅閻斿吋鐓ユ繝闈涙－濡插摜绱掗銏⑿ч柡灞剧洴婵＄兘濡搁敂淇憋拷鎰攽閻愯尙澧遍柛妯兼櫕閹广垹鈹戦崱蹇旂亖闂佸壊鐓堥崰妤呮偟椤栫偞鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗 changhao
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


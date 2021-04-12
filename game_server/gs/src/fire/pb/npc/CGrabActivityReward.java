
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
						
						if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鍋傞柣鏃傚帶缁犲綊鏌熺喊鍗炲箹闁诲骏绲跨槐鎺撳緞鐏炵偓姣堥梺鍝勬湰缁嬫牜绮诲☉銏犵睄闁瑰墽娅㈤幏椋庢崉椤帗瀚规繛鍫濈仢閺嬬喖鏌熼鐓庯拷鎼侇敋閿濆棛顩烽悗锝呯仛閺咃綁姊虹紒妯荤叆闁搞倖鐗犻獮蹇涙倻閽樺鐎銈嗗姦閸嬪懘顢欓弮鍫熲拺缂備焦锚婵矂鎮樿箛鏃傛噭缂佸倹甯℃慨锟介柕鍫濇閸橀亶姊洪崫鍕灕闁圭兘顥撻惀顏堝级鐠恒剱锝囩磼瀹�鍐摵缂佺粯绻堝畷鍫曟嚋閸偅鐝栭梻鍌欑劍鐎笛呮崲閸屾娲晝閸屾岸妫峰銈嗘穿閹烽攱鎱ㄦ繝鍐┿仢闁圭绻濇俊鍫曞川椤旂晫鏆氶梻鍌欑劍閹爼宕曢鐐茬濠㈣埖鍔曠粻顖滅磽娴ｈ鐒界紒鐘荤畺瀵爼宕煎┑鍡忔寖闂佸憡甯婇崡鎶藉蓟閻旂儤瀚氱憸蹇曞姬閿熶粙鎮楃憴鍕闁搞劌鐖奸獮鍐ㄢ枎閹炬潙锟界粯淇婇婊冨付妤犵偞锕㈠缁樼瑹閿熻棄顭囬懡銈忔嫹闂堟稓鐒哥�规洏鍨藉畷妤呮嚃閳哄﹥閿ら梻浣告啞閹稿棝宕ㄩ銈囧簥闂備礁鎼ˇ閬嶅磻閻愬鐝堕柛鈩冪♁閸庢绻涢崱妯虹厐闁瑰嘲鍢查埢鎾诲垂椤旂晫褰梻渚�娼荤紞鍥╁緤娴犲鍋╅柣鎴ｆ缁犳娊鏌熼幖顓炲箻闁告瑥妫濆娲川婵犲倸顫囬梺鍛婃煥缁绘路閸岀偞鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儺鍓﹂弫瀣喐韫囨稒鏅搁柤鎭掑劤閳绘捇鏌￠崨顔剧畼闁告帗甯掗埢搴ㄥ箻瀹曞浂鍞烘繝寰锋澘锟芥捇鎮為敃锟介埢宥夊籍閸屾粎锛濋梺绋挎湰閼归箖鏁撴禒瀣垫缂侇喖鐗婇幏鍛喆閸曨剛褰块梺鐟板悑閻ｎ亪宕濆畝锟芥竟鏇熺節濮橆厾鍘梺鍓插亝缁诲秴危閹间焦鐓㈤柛鎰典簻閺嬫棃鏌ㄩ悢缁橆棄缂佺姴绉瑰畷鏇㈡焼瀹撱儱娲、娑樷槈濮楀棗娈奸梻浣虹帛椤洨鍒掗鐐村亗闁哄洢鍨洪悡娑㈡煕閵夛絽鍔氬┑锛勫帶闇夋繝濠傛椤ュ妫佹径鎰厽闁圭偓濞婇妤呮煥閻旇袚闁诡喖鍊垮畷娲倷閸濆嫮顓洪梺鎸庢濡嫰鏁撴禒瀣垫闁跨喓鏅幊鎾寸珶婵犲洤绐楁俊銈勭劍濞呭繘姊绘担钘夊惞闁哥姵鍔楅崚鎺戭吋閸滀胶鍞靛┑顔筋殣閹烽锟借娲﹂崹璺侯嚕閸洖绠ｆい鏍ㄧ箰閹风兘宕归姘秺閺佹劙宕堕埞鍖℃嫹婵犲洦鐓涢柨鐔诲Г缁傛帞锟斤綆鍋嗛崢钘夆攽閳藉棗鐏℃い鎴炵懇瀹曠數锟斤綆鍓ㄩ幏椋庢喆閸曨剙浠╅梺绋挎捣閺佽顕ｆ繝姘亜濡炲瀛╁▓婵嬫⒒娓氬洤寮跨紒鐘冲灴瀹曟粓宕奸弴鐔凤拷鐢告偡濞嗗繐顏紒锟界�ｎ偆绠惧ù锝呭暱濞层倛绻氶梻浣告贡閸庛倝銆冮崱娑樼柧闁归棿鐒﹂悡銉╂煟閺囩偛锟藉湱锟芥熬鎷� changhao
						{
							return true;
						}
						
						if (activityquestion.getGrabreward() == 1)
						{
							fire.pb.common.SCommon c = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.common.SCommon.class).get(236);
							int rewardid = Integer.parseInt(c.getValue());
							
							//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤悮瀛樺闁汇垺顔栭悞楣冨疮閸濄儳纾藉〒姘攻鐎氳绻濋悽闈浶㈡繛璇х畵閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯垮煐閳锋垿姊婚崼鐔衡檨闁瑰吋鍔欓幃妤�顫濋鐔哄嚒濡炪倖娲╃紞渚�鐛锟介、娆撴偂鎼淬倧鎷烽崹顔规斀閹烘娊宕愯楠炲繘鏌ㄧ�ｃ劋绨婚棅顐㈡祫缁插ジ鏌囬鐐寸厸閻忕偛澧介埥澶愭煃鐠囧弶鍞夌紒鐘崇洴瀵挳鎮敓浠嬪疮鐎ｎ喗鈷掑ù锝呮啞閹牓鏌ｉ鐑嗘Ш缂佽京鍋炵粭鐔兼晸娴犲鍋樻い鏇嫹鐎规洖鐖奸、妤佸緞鐎ｎ偅鐝滄繝鐢靛仩閹活亞寰婇崸妤�绠犻柟鎹愵嚙缁�鍫ユ煟閵忕姵鍟為柍閿嬪笒闇夐柨婵嗙墛椤忕娀鎮介娑氭创闁哄本鐩顕�鏁撻挊澹濇椽鎮㈤悡搴㈢�梺鍛婂姦閸ｎ噣寮崒鐐寸厱妞ゆ劧绲跨粻姘舵煙閼恒儲绀嬫慨濠冩そ楠炴劖鎯旈敐鍥╂殼婵＄偑鍊х�靛矂宕瑰畷鍥у灊閻犲洦绁村Σ鍫熺箾閸℃小缂併劌顭峰娲传閸曨偅娈┑鐐茬湴閸婃盯銆傞幐搴ｇ瘈婵炲牆鐏濆▍娆戠磼閼碱剚娅曢柨鐔诲Г绾板秴顭垮锟介敐鐐剁疀濞戞瑦鍎柣鐔哥懃鐎氼剟宕㈣ぐ鎺撯拺闁告稑锕ｇ欢閬嶆煕濡崵鐭掓鐐搭焽閿熶粙娼ч幗婊堫敊閺囥垺鈷戦柛娑橈功閹冲啯銇勮閹风兘姊洪懖鈺侇暭閻庣瑳鍥ワ拷鍐Ψ閳哄倸锟界兘鏌ょ喊鍗炲闁愁亜鐏氱换婵堝枈濡搫鈷夐梺璇″枛閸婅绌辨繝鍥ㄥ�婚柦妯侯樈濞煎﹪姊洪弬銉︽珔闁哥噥鍨伴…鍧楀箣閿旇В鎷婚梺绋挎湰閻燂妇绮婇悧鍫涗簻妞ゆ劑鍩勫Σ鎼佹煟閿濆懎妲绘い顐ｇ矒閺佹捇鎸婃径灞炬濠电偛妯婃禍婊堝礃閿熻棄顪冮妶鍡樺暗闁稿鍠栭弫宥呪槈閵忊�充画濠电姴锕ょ�氼參鎮￠妷锔轰簻妞ゆ劑鍨荤粻浼存偂閵堝棎浜滈煫鍥ㄦ尰閸ｅ綊鏌ㄩ悢鐑樻珪闁稿繑锕㈠濠氭晝閿熷�熺亽婵炴挻鍑归崹杈╃懅婵犵數濮甸鏍窗濡わ拷鐓ら柣鏂款殠濞兼牗绻涘顔荤盎缂佺姳鍗抽獮鏍庨锟介悘顕�鏌ㄥ☉娆欒�挎慨濠冩そ楠炴牠鎮欓幓鎺濈�辩紓鍌欑贰閸犳鎮烽埡鍛畺濞村吋鎯岄弫瀣煥閻旂粯顥夐柣锝囧厴瀹曪繝鎮欓埡鍌ゆ綌婵犵妲呴崹鎶藉煕閸惊锝夋偋閸粎绠氶梺缁樺姦娴滄粓鏁撻懞銉уⅹ閾荤偛銆掑鐐閻庤娲橀崹鍧楃嵁閸ヮ剙绀傛い鎰╁灪閸犳锟芥鍠涘▔娑㈠煝鎼淬劍鍊锋い鎺炴嫹闁伙附绮撳缁樼瑹閿熻棄顭囪閹囧幢濡炪垺绋戣灃濞达絿鎳撳鍧楁⒑缁嬭法鐏遍柛瀣仱閹繝寮撮姀锛勫帾婵犵數濮寸换妯侯瀶椤曪拷閺屾洟宕堕妸褏鐤勯梺鍦焾閿曨亪骞冮姀銈呬紶闁靛／鍛潓闂傚倸鍊搁崐鎼佹偋婵犲啰鐟规俊銈呮噹绾惧潡鏌熼幍顔碱暭闁绘挸鍟村娲垂椤曞懎鍓伴梺璇茬箲閹告娊寮婚垾宕囨殕閻庯綆鍓欓崺灞筋渻閵堝骸浜濈紒璇茬墦閵嗕礁螖閸涱厾锛滃┑鐐村灦閻熴儵寮稿☉銏♀拻濞达絿鐡旈崵娆撴倵濞戞帗娅婇柟顔哄灲椤㈡宕熼銈庡數闂備浇娉曢崳锕傚箯閿燂拷?
							Map<String, Object> paras = new HashMap<String, Object>(10);
							paras.put(RewardMgr.ANSWER_RIGHT_TIMES, activityquestion.getAnswerrighttimes());
							fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, rewardid, paras, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_grab, 0,fire.pb.PAddExpProc.OTHER_QUEST, "缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿噮鍓熷畷褰掝敊鐟欏嫬鐦遍梻鍌欑劍濡炲潡宕㈡禒瀣仭闁冲搫鎳庨拑鐔兼煟閺傚灝鎮戦柛濠勭帛娣囧﹪顢涘鍐ㄥ濡炪倖姊瑰ú鏍煘閹达附鍊烽柡澶嬪灩娴犙囨⒑閹肩偛濡兼繝锟芥潏鈺佸灊闁割偁鍎辩粈鍐煃閻熻埇浠掔紒銊ヮ煼濮婃椽宕崟顐ｆ闂佺锕ラ幃鍌炲箚閸愵喖绠ｉ柨鏃傛櫕閸樺灚淇婇悙宸剰濡ょ姵鎮傚畷銏拷鐢告交閹烽鎲撮崟顒傤槰闁汇埄鍨界换婵嬬嵁閸愩劉鏋庨柟鎼灡鐎氳绻涢幋鐑嗕紗闁硅揪瀵岄弫鍌炴煟閺傚灝鎮戦柍閿嬪笒闇夐柨婵嗙墕琚氱紒缁㈠幖閻栧ジ寮诲☉銏℃櫜闊洦娲滈弳銈呂旈悩闈涗粶缂佺粯锕㈠顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷");
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


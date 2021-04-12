
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
					if (count < activity.maxnum && start == true) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閸濆嫬顏ラ柛搴ㄤ憾閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘垹纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夘煼楠炲骞栨担鐟颁罕闂佸壊鍋呯换鍕偡閺屻儲鈷戠紒瀣皡瀹搞儵鏌ｉ弽褋鍋㈢�殿喛顕ч埥澶愬閳哄倹娅囬梻浣虹帛钃辩憸鏉垮暞閹便劍鎯旈妸锔规嫼濠殿喚鎳撳ú銈夋晸閼恒儺娈滅�规洘鍨块獮姗�鎳滈棃娑樼哎婵犵數濞�濞佳兠洪妸褍濮柨鐔剁矙濮婅櫣绮欓幐搴㈡嫳缂備緡鍠栭惌鍌炲春濞戙垹閱囬柕澶涜吂閹锋椽鏌℃径灞戒沪濠㈢懓妫濊棟闁挎洖鍊归悡鏇㈡煟閺囨氨顦﹀ù婊�鍗抽弻娑㈠煛閸愩劋妲愬Δ鐘靛仜椤戝寮崘顔芥櫢闁伙絽鑻ˉ姘舵煕韫囨艾浜圭紒鈽呮嫹濠电姷鏁告慨鎾磹瑜版帒绠查柨婵嗩槹閻撴洟鏌￠崘鎸庡闂佽鍠栭崐鎼侊綖韫囨拋娲敂閸曨亞鐐婇梻浣告啞濞茬喎顭囪瀹曟粓顢欓崜褏锛濇繛鎾磋壘閿曘儳锟芥俺顫夌换娑欐綇閸撗勫仹闂佸搫鎷嬮崑鍛矉瀹ュ纭�闁绘劏鏅滈弬锟介梻浣哥枃濡嫬螞濡や胶顩查柣妤�鐗勬禍婊堟煥濠靛棛绠抽柣锝変憾濡焦寰勯幇顓犲幈闂侀潧顦介崰鏍ㄦ櫠椤斿墽纾奸柨鐔剁矙瀹曟帒顭ㄩ幇顓烆伓闂佽皫鍐╁暈閻庢艾缍婂娲川婵犲啫顦╅梺鍛婃尰閻╊垰鐣烽姀锛勵浄閻庯綆鍋�閹疯櫣绱撻崒娆戝妽閽冮亶鏌嶉柨瀣瑲闁靛洤瀚伴、姗�鎮欓棃娑辨澑闂備線锟芥稓鈹掗柛鏂跨焸椤㈡ɑ绺界粙鍨�垮┑鈽嗗灠閹碱偅瀵兼惔鈾�鏀介柣妯虹仛閺嗏晛鈹戦鑺ュ唉鐎规洘鍨垮畷鍗炩槈濞嗗繋绨靛┑鐘绘涧閸婃悂骞夐敓鐘冲亗婵炴垶鈼よぐ鎺撴櫜闁割偒鍋呯紞鍫ユ倵鐟欏嫭绀�闁活厼鍊垮濠氬焺閸愨晛顎撻柣鐔哥懃鐎氼剛澹曢幎鑺モ拺閺夌偞澹嗛崝宥夋煙閻熺増鍠樼�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�? by changhao
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
						if (activityquestion == null) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閸ㄥ倸螖閿濆懎鏆欑紒鐘崇☉闇夐柨婵嗘噺鐠愶紕绱掔�ｂ晞鍏岀紒杈ㄦ崌瀹曟帒顫濋濠冨闁绘垼濮ら崐鍧楁煥閺囨氨鍔嶉柟鍐茬焸濮婄粯鎷呴崨濠傛殘闂佽崵鍠嗛崕鎶藉箲閵忕媭娼ㄩ柨鐔绘椤曪絾绻濆顓炰簻闂佹儳绻愬﹢閬嶆晬濠婂牊鈷戦梻鍫熺〒缁犲啿鈹戦鐐毈闁诡喗锕㈠畷濂稿Ψ閿旇瀚兼繝鐢靛仩鐏忣亪顢氳閻涱喖螖娴ｅ吀绨婚梺闈涱焾閸庡鐓鍌︽嫹濞堝灝鏋︽い鏇嗗洤鐓″鑸靛姇椤懘鏌ｅ锟藉褎鎱ㄩ崼鏇熲拻濞达絽鎲￠崯鐐烘煕閺冿拷濞叉﹢寮查懜鐢殿浄閻庯綆浜為ˇ顕�姊虹紒妯虹伇濠殿喓鍊濋崺娑㈠箣閿旂晫鍘遍棅顐㈡处閹稿宕抽挊澶嗘闁规儳顕崣锟介梺鍝勭灱閸犳牕鐣峰▎鎾澄ч柛鈩冾殢娴硷拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈瀛濈紓鍌氱Т閿曨亜顕ｇ拠宸悑濠㈣泛锕ｇ槐鍫曟⒑閸涘﹥澶勯柛瀣崌楠炲繘鏌ㄧ�ｎ剛鐦堝┑顔角滈崕濠氬箯閻戣棄宸濋柡澶嬪灩閻撴垶绻濋姀锝嗙【闁活剙銈搁幆渚�宕奸妷锔规嫽闂佺鏈銊︽櫠濞戞ǜ锟芥帒顫濋褎鐤侀悗瑙勬礃濞叉繄绮诲☉妯锋婵炲棙鍨靛顕�姊绘担鍛婂暈闁告棑闄勭粋宥咁煥閸繂鍤戦柟鍏肩暘閸斿秹鎮￠崘顔藉仭婵炲棗绻愰鈺呮煟韫囨梹灏﹂柡宀�鍠栭、娆戞喆閸曨剛褰嬮柣搴ゎ潐濞测晝寰婇幆褜鍤楅柛鏇ㄥ墰缁★拷闁硅偐琛ラ幊锝夋偄閸忓皷鎷婚梺绋挎湰閻熴劑宕楃仦淇变簻妞ゆ挾鍋熸晶锔撅拷瑙勬礃閻燂妇绮嬮幒鏃撴嫹閿濆簼绨芥い鏂挎濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�? by changhao
						{
							activityquestion = xbean.Pod.newActivityQuestion();
							xtable.Roleid2activityquestion.insert(roleid, activityquestion);
							
							fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);
						}	
						else
						{
							long lasttime = activityquestion.getActivityquestionstarttime();
							
							if (!fire.pb.util.DateValidate.inTheSameDay(lasttime, now)) //婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鍋傞柣鏃傚帶缁犲綊鏌熺喊鍗炲箹闁诲骏绲跨槐鎺撳緞鐏炵偓姣堥梺鍝勬湰缁嬫牜绮诲☉銏犵睄闁瑰墽娅㈤幏椋庢崉椤帗瀚规繛鍫濈仢閺嬬喖鏌熼鐓庯拷鎼侇敋閿濆棛顩烽悗锝呯仛閺咃綁姊虹紒妯荤叆闁搞倖鐗犻獮蹇涙倻閽樺鐎銈嗗姦閸嬪懘顢欓弮鍫熲拺缂備焦锚婵矂鎮樿箛鏃傛噭缂佸倹甯℃慨锟介柕鍫濇閸橀亶姊洪崫鍕灕闁圭兘顥撻惀顏堝级鐠恒剱锝囩磼瀹�鍐摵缂佺粯绻堝畷鍫曟嚋閸偅鐝栭梻鍌欑劍鐎笛呮崲閸屾娲晝閸屾岸妫峰銈嗘穿閹烽攱鎱ㄦ繝鍐┿仢闁圭绻濇俊鍫曞川椤旂晫鏆氶梻鍌欑劍閹爼宕曢鐐茬濠㈣埖鍔曠粻顖滅磽娴ｈ鐒界紒鐘荤畺瀵爼宕煎┑鍡忔寖闂佸憡甯婇崡鎶藉蓟閻旂儤瀚氱憸蹇曞姬閿熶粙鎮楃憴鍕闁搞劌鐖奸獮鍐ㄢ枎閹炬潙锟界粯淇婇婊冨付妤犵偞锕㈠缁樼瑹閿熻棄顭囬懡銈忔嫹闂堟稓鐒哥�规洏鍨藉畷妤呮嚃閳哄﹥閿ら梻浣告啞閹稿棝宕ㄩ銈囧簥闂備礁鎼ˇ閬嶅磻閻愬鐝堕柛鈩冪♁閸庢绻涢崱妯虹厐闁瑰嘲鍢查埢鎾诲垂椤旂晫褰梻渚�娼荤紞鍥╁緤娴犲鍋╅柣鎴ｆ缁犳娊鏌熼幖顓炲箻闁告瑥妫濆娲川婵犲倸顫囬梺鍛婃煥缁绘路閸岀偞鈷掗柛灞捐壘閿熻棄鍢查湁闁搞儺鍓﹂弫瀣喐韫囨稒鏅搁柤鎭掑劤閳绘捇鏌￠崨顔剧畼闁告帗甯掗埢搴ㄥ箻瀹曞浂鍞烘繝寰锋澘锟芥捇鎮為敃锟介埢宥夊籍閸屾粎锛濋梺绋挎湰閼归箖鏁撴禒瀣垫缂侇喖鐗婇幏鍛喆閸曨剛褰块梺鐟板悑閻ｎ亪宕濆畝锟芥竟鏇熺節濮橆厾鍘梺鍓插亝缁诲秴危閹间焦鐓㈤柛鎰典簻閺嬫棃鏌ㄩ悢缁橆棄缂佺姴绉瑰畷鏇㈡焼瀹撱儱娲、娑樷槈濮楀棗娈奸梻浣虹帛椤洨鍒掗鐐村亗闁哄洢鍨洪悡娑㈡煕閵夛絽鍔氬┑锛勫帶闇夋繝濠傛椤ュ妫佹径鎰厽闁规崘娅曢崬澶愭倵濮橆偄宓嗛柡灞界Ф閹叉挳宕熼銈勭礉闂備浇顕栭崰妤呮偡閿曞倹鏅柟閭﹀厴閺�浠嬫煕閳╁喚鐒介柡澶庢缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇氶檷娴滃綊鏌涢幇銊︽珕婵炲懐濮撮湁闁绘ê妯婇崕蹇曠磼閻樺磭鍙�闁哄本娲濈粻娑㈠即閻愭劖绋掓穱濠囧箵閹烘柨鈪甸梺鍝勬湰濞叉繄绮诲☉銏犲嵆闁绘劖鍔戦崕鏌ュΦ閸曨垰绫嶉柨鐔烘櫕閺侇噣鍨鹃幇浣圭稁濠电偛妯婃禍婊呯不濮樿鲸鍠愰幖杈剧悼閻鎮楅敐搴℃灍闁绘挻娲熼幃妤呮晲鎼存繄鐩庡銈呯箚閺呯娀寮诲鍥ㄥ珰闁肩⒈鍎烽妷锔轰簻闁挎洑绶″鎰版煙娓氬灝濡界紒缁樼箞瀹曟帒鈽夊▎蹇撳闂傚倷妞掔槐顔惧緤閸ф绀傛俊顖濇閺嗭箓鏌涢锝嗙５闁跨喐鏋荤粻鎾荤嵁鐎ｎ亶鐓ラ柛鏇ㄥ亞閸橀亶姊婚崒姘拷鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼幑鎰靛殭闁告艾缍婇弻鈥愁吋鎼粹�崇缂備胶濯崹鍫曞蓟閵娾晜鍋嗛柛灞剧☉椤忥拷 by changhao
							{
								fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().ResetActivityQuestionData(activityquestion, now, true);	
							}
						}
						
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撶紓浣哄У濠㈡﹢鍩為幋锔藉亹鐎规洖娴傞弳锟犳⒑缁嬫鍎忛悗姘煎弮婵＄敻宕熼姘鳖唺闂佺懓鐡ㄧ换宥嗙閼测晝纾藉ù锝呮惈椤庡矂鏌涢妸銊︾【妞ゎ偄绻愮叅妞ゅ繐瀚悗顓烆渻閵堝棙绀�闁瑰啿閰ｅ畷婊堫敇閻旇櫣顔曢柣搴㈢♁椤洭鎯岀�ｎ剛纾兼い鏃囧Г瀹曞瞼锟芥鍠栭…閿嬩繆閹间礁唯闁靛繆鍓濋弶鎼佹⒒娴ｈ櫣銆婇柛鎾寸箞閵嗗啳绠涢弬娆惧殼闂佽法鍠嶇划娆忣潖缂佹ɑ濯撮悷娆忓娴犙囨⒑閸涘♁鑲╁垝濞嗘挸绠栭柣鎴ｆ閻撴盯鏌涘☉鍗炲绩闁硅姤娲熷铏圭磼濡儵鎷婚梺鍐插槻閻楁挸顕ｉ銏╁悑濠㈣泛顑囬崢顏堟⒑閸撴彃浜濈紒璇插暣钘熸繝濠傚娴滄粓鐓崶銉ュ姕閻庢熬鎷�? by changhao
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


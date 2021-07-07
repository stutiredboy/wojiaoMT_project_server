
package fire.pb.mission;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

import fire.pb.mission.instance.PEnterInstanceMap;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAskIntoInstance__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAskIntoInstance extends __CAskIntoInstance__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure askIntoInst = new mkdb.Procedure() {
			@Override
			protected boolean process()	{
				Long teamid = xtable.Roleid2teamid.select(roleid);
				if (teamid == null)
					return false;
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.getTeamByTeamID(teamid);
				if (team == null)
					return false;
				
				final java.util.ArrayList<Long> roleids = new java.util.ArrayList<Long>();
				roleids.addAll(team.getNormalMemberIds());
				this.lock(xtable.Locks.ROLELOCK, roleids);
				
				xbean.InstanceAskInfo askInst = xtable.Instanceaskinfos.get(teamid);
				if (askInst == null)
					return false;
				
				if (!askInst.getAnswerinfo().containsKey(roleid)) {
					return false;
				}
				
				if (answer == 0) {
					askInst.getAnswerinfo().put(roleid, 0);
					String roleName = xtable.Properties.selectRolename(roleid);
					if (roleName == null)
						return false;
					List<String> para = new ArrayList<String>(1);
					para.add(roleName);
					for (Long rid : roleids) {
						if (rid != roleid) {
							MessageMgr.psendMsgNotifyWhileCommit(rid, 160211, para);
						}
					}
					
					/*if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						}
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						}
					}
					
					xtable.Instanceaskinfos.remove(teamid);*/
					
					SAnswerInstance answerInst = new SAnswerInstance();
					answerInst.roleid = roleid;
					answerInst.answer = 0;
					mkdb.Procedure.psendWhileCommit(roleids, answerInst);
					
					return true;
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘璺侯焽濞嗘挸鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簻妤犵偛顑呴—鍐Χ閸愩劎浠鹃梺鑽ゅ暱閺呯娀鐛崘顔肩労闁告劏鏅涢崝鍛渻閵堝棙顥嗗┑顔哄�楃划濠冨鐎涙ǚ鎷婚梺绋挎湰閼归箖鏁撻悾灞藉幋闁诡喚鍋ら弫鍌炴偩瀹�锟介鏇熺節閻㈤潧孝婵炲眰鍊楃槐鎺楀煛閸涱喒鎷哄銈嗗釜閹烽绱掓径濠庡殶缂侇喖顭峰濠氬Ψ閿旀儳骞堥梻渚�娼чˇ浠嬪窗閺嶃劍娅犳い鏇嫹闁哄矉绠撳畷姗�顢旈崟顒備邯闂備礁鎼悮顐﹀礉瀹�鍕厴闁硅揪绠戦獮銏ゆ煃閸濆嫬锟芥劙鏁冮敓浠嬪煘閹达箑鐓￠柛鈩冦仦缁ㄥジ姊洪幐搴㈢８闁搞劏妫勯锝囨嫚濞村顫嶉梺鍐茬亪閺咁亪骞忛悜鑺ユ櫇闁稿本姘ㄩ鍝勨攽閻樼粯娑ф繛灞傚姀閵囨劙顢涢悙绮规嫽婵炶揪绲介幉锟犲箚閸喍绻嗘い鎰╁灲閸欏嫮锟借娲栫紞濠囧箠閿熺姴围闁糕檧鏅滅紞妤呮⒒娴ｇ瓔娼愰柛搴㈠▕椤㈡岸顢橀姀鈥充画闂佽崵鍠愭竟瀣绩娴犲鐓熸俊顖濐嚙缁插鏌￠崱妯兼噭闁靛洤瀚粻娑橆潩椤撶姰锟芥劙姊虹�圭媭娼愰柛銊ユ健楠炲啴鍩￠崨顓炵�銈嗗姧缁查箖鎯佹惔鈾�鏀介柣妯诲墯閸熷繘鏌涢悩宕囧⒌闁诡喗妞芥俊姝岊檪闁归鍏樺Λ鍐ㄢ槈閺嵮傚垝闁诲氦顫夊ú蹇涘礉鎼淬劍鏅搁柤鎭掑劤閳句線鏌ㄥ顑炲綊鎮敓浠嬪矗閸愵煈娼栫紓浣诡焽閻熷綊鏌涢妷鎴濆暕缁辩喎鈹戦悩娈挎毌闁跨喎锟界喐鐝柛鐘愁焽閿熷�燁潐濞测晝绱炴担鍝ユ殾闁告鍋愬Σ鍫熺箾閸℃婀伴悗姘偢濮婄粯鎷呴崨濠傛殘缂備礁顑嗛崹鍧楀极閸愵喗鏅查柛銉厛閸嬨劑姊绘笟鍥у缂佸鏁婚幃锟犲即閻斿墎绠氬銈嗙墬绾板秹骞嗛崼銉︾厵妞ゆ棁妫勯悘銉╂嚕閹扮増鐓曢柕澶嬪灥缁夊瓨瀵奸幇鐗堢厽闁规儳宕敓鑺ョ墵婵＄敻宕熼鍓ф澑闂佸湱鍋撳娆忊枍濠靛鈷戠憸鐗堝笚閺佽鲸淇婇悙鑸殿棄妞ゎ偄绻愮叅妞ゅ繐瀚粣娑欑節閻㈤潧孝閻庢凹鍣ｉ幃楣冩偨閸涘﹦鍘介柟鍏肩暘閸ㄥ綊宕甸鍕厱婵炲棗绻愰弳銏′繆椤愮姴鐏叉慨濠呮缁辨帒顫滈崱娆忓Ш缂傚倷绶￠崳顕�宕归崼鏇炵畺闁跨喓濮撮崡鎶芥煏韫囥儳纾块柛妯挎閳规垿鍩ラ崱妤冧淮濠电偛鎷戠紞渚�寮鍜佸悑闁告粈鑳堕崬鐢告偡濠婂嫮鐭嬬紒鍌氱Т閳规垹锟斤綆锟筋叏绠撻弻娑㈠即閵娿儳浠╅梺鍛婎殙濞呮洟濡甸崟顔剧杸闁圭偓鎯屽Λ銈夋偠濮樺墽鐣甸柡宀嬬稻閹棃濡舵惔銏㈢Х婵犵數鍋涘鍫曟偋濠婂懏顫曢柣鎰嚟缁★拷闂佹悶鍎崕濠氬箯闁垮鐟归柨鐔绘椤曪綁骞橀纰辨綂闂佺粯鐟遍幏閿嬬箾閻撳函韬慨濠冩そ濡啫鈽夊杈╂澖闂備焦鎮堕崝蹇涱敋瑜旈幃楣冨垂椤愩倗鎳濋梺璺ㄥ枙濡嫰锝炶箛鏇犵＜婵☆垵顕ч鎾剁磽娴ｅ湱鈽夋い鎴濇噹閳绘捇顢橀姀鈾�鎷洪梺鍛婄☉閿曘倝鎮橀埡鍛厸闁告粈绀佹禍鐐翠繆閸欏濮嶉柟顔界懇瀹曨偊宕熼銉嫹閸喒鏀介柣鎰綑閻忥附銇勯鐐村枠闁轰礁绉撮埥澶愬閳撅拷閹锋椽姊洪棃鈺佺槣闁告ê鍚嬬粋宥嗐偅閸愨晝鍘靛銈嗙墬娣囪櫣锟芥矮鍗抽弻宥囩磼濡闉嶇紓浣稿�圭敮鐐烘晸閺傘倗绉甸柛鎾寸懆閵囨劙宕熼娑掓嫼闂佺鍋愰崑娑㈠礉濮楋拷閺屾盯寮崸妤�寮伴梺绯曟櫔闂勫嫮绮悢鍏兼櫢濞寸姴顑呴拑鐔猴拷骞垮劚椤︿即鎮￠妷鈺傚�甸柨婵嗙凹缁ㄨ棄霉閻撳海鐒告慨濠冩そ瀹曨偊宕熼浣瑰缂傚倷绀侀鍡涘垂閸ф鏄ラ柕澶涚畱缁剁偛鈹戦悩鎻掝劉鐎点倖妞藉娲礈閹绘帊绨肩紓浣筋嚙閸婂潡鏁愰悙鐑樺亹缂備焦菤閹风粯绻涙潏鍓ф偧闁稿簺鍊濆畷鐢告晸娴犲鈷戦柛婵勫劚閺嬫瑦绻涙径瀣闁轰焦鎹囬幊鐐哄Ψ瑜忛崣婵嬫⒑閸涘娈旈柛鐔锋健椤㈡岸鏁愰崱娆戠槇濠殿喗锕╅崕鐢稿煛閸涱喚鍘繝銏ｅ煐閿氶柡瀣枛閺屾稑顓奸崶銊︽瘓濠殿喖锕ュ钘夌暦濡ゅ懎绀傞柣鎾冲嚱閹风兘骞囬鐘殿啎婵炶揪绲介崯鍨洪敃鍌氱柧闁归棿鐒﹂悡鐔兼煥濠靛棙鍣烘繝锟芥导瀛樼厸闁糕�崇箲濞呭﹪鏌″畝瀣М濠碉紕鍏橀、娆愮節濮橆兛绮ｉ梺璇插椤旀牠宕板☉妯锋灃婵炴垯鍨归悡婵嬪箹濞ｎ剙濡介柛濠囨敱閵囧嫰骞嬮鐑囨嫹閵堝鐐婇柕濞у啫绠洪梻浣烘嚀閸氬鎮鹃鍫濆瀭濠电姵鑹鹃悿顕�鏌＄仦璇插姕闁绘挻鐟╅弻娑㈠箣濞嗗骏鎷烽弽顐嫹濮樼偓瀚�
				if (askInst.getAnswerinfo().size() != roleids.size()) {
					for (Long rid : roleids) {
						MessageMgr.psendMsgNotifyWhileCommit(rid, 166057, null);
					}

					if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						}
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future != null) {
							future.cancel(true);
							fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						}
					}
					
					xtable.Instanceaskinfos.remove(teamid);
					return true;
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姵濞婇弻銊╂偄閸戙倖瀚归柣鏇氱劍缂嶅牆鈹戦悙鎻掔骇闁绘娲滈崣鍛存⒑闂堟单鍫ュ疾濠婂牆纾挎俊銈呮噺閻撴洟鏌嶉埡浣告灓婵☆垰鎳愰幉鎼佹偋閸繄鐟查梺鍝勬噺閻擄繝寮诲☉銏╂晝妞ゆ劦婢�缁ㄨ偐绱撻崒姘毙㈤柣妤�妫濋崺鐐哄箣閿旇棄锟界兘鏌涘▎蹇ｆЦ婵炲憞鍕瘈婵炲牆鐏濋弸鐔兼煙缁嬪灝鏆遍柨鏇樺灪缁楃喖鏁撻挊澶樻綎闁惧繐婀辩壕鍏间繆椤栨碍绂嬪ù婊勭矎閻忔帗绻濋悽闈浶㈡繛灞傚�楁竟鏇㈠锤濡や胶鍘甸梺瑙勵問閸犳牠銆傛總鍛婄厽闁规儳鐡ㄧ粈瀣煙椤旂瓔娈滈柡浣瑰姍瀹曘劑顢橀悢鍑ゆ嫹鎼淬劍鈷掑〒姘搐瀵箖鏌涢妸銉у煟鐎殿喖顭烽弫宥夊礋椤忓懎濯伴梻浣告啞閹稿棝宕熼銏画闂傚倸鍊烽懗鍓佹兜閸洖鐤炬繛鎴炵啲閹峰嘲顫濋鐔哄嚒闂佷紮绲介崲鏌ワ綖濠婂牊鏅搁柦妯侯槺閺嗭附绻濇繝鍌涳紞婵¤尙绮换婵嗏枔閸喗鐏嶅┑锛勫仩濡嫰锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦缂氶柛搴ゅ吹濡叉劙鎮欓悽鐢碉紳婵炴挻鑹惧ú銈呪枍濮楋拷閺屾盯濡搁敃锟介婊堟煟韫囨搩鍎旀慨濠冩そ瀹曘劍绻濋崒姣挎洟姊洪崫銉バｉ柣妤冨█楠炲繘骞嬮敂钘変簻闂佸憡绺块崕鎶筋敊閺囥垺鈷戦柣鐔煎亰閸ょ喖鏌涙繝鍐ㄧ仴妞ゎ偅绻勯幑鍕惞閻熺増鎲㈡繝鐢靛仜椤曨厽鎱ㄩ幘顕呮晞闁糕剝绋掗崑鍌炴煛閸ャ儱鐏柣鎾冲暣閺屽秵娼幍顕呮М闂佸搫顑冮崐鏍崲濞戙垹閱囨繛鎴烆焽娴犲ジ姊婚崶褜妯�闁哄矉绲借灒闁割煈鍠栭幆鐐烘⒑娴兼瑧鎮奸柛搴涘�濋獮鍫ュΩ閿斿墽鐦堥梺鍛婁緱閸ｎ喗绂掗埡鍐＝濞撴艾娲ら弸鐔兼煟閻斿弶娅呴柣锝囧厴閹晝绱掑鍡嫹閹扮増鈷戦柛娑橈工閸ゎ剟鏌涚�ｎ亝鍣介柟骞垮灩閳藉顫濋悙顒�顏跺┑鐐村灦閻燁垶鎮炴禒瀣厽妞ゆ挾鍎戦煬顒勬煛瀹�瀣М鐎殿喕绮欓、鏇㈠閻樿京甯涘┑锛勫亼閸婃牕煤閳哄啫绶ら柛鎾楀嫬搴婂┑鐘绘涧濡厼顭囬埡鍌樹簻闁规崘娉涙禒鎺旂磼閵娿儺鐓兼慨濠勭帛閹峰懏绗熼婊冨Ъ缂傚倷鑳剁划顖炲礉濞嗗繒鏆﹂柕澹秵瀚归柨婵嗙凹缁ㄦ挳鏌＄�ｎ亞效闁哄本娲濈粻娑氾拷锝庝悍閹风兘寮介鐐靛幈闂佺鎻梽鍕磻閿濆鐓欐い鎾跺枎缁楁帒鈹戦垾鍐叉倯缂佺粯鐩畷銊╊敊閻撳寒娼氶梻浣告惈閻ジ宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�?
				SAnswerInstance answerInst = new SAnswerInstance();
				answerInst.roleid = roleid;
				answerInst.answer = 1;
				mkdb.Procedure.psendWhileCommit(roleids, answerInst);
				
				int nNum = 0;
				askInst.getAnswerinfo().put(roleid, 1);
				for (Integer ret : askInst.getAnswerinfo().values()) {
					if (ret == 1) nNum ++;
				}
				
				if (nNum == askInst.getAnswerinfo().size()) {
					xbean.InstanceInfoCol teamLeadreInfoCol = xtable.Roleinstancetask.get(team.getTeamLeaderId());
					if (teamLeadreInfoCol == null) {
						return false;
					}					
					int instanceZoneId = teamLeadreInfoCol.getLastinstanceid();
					
					if (insttype == 0) {
						ScheduledFuture<?> future = fire.pb.mission.instance.InstanceManager.askInstFuture.get(teamid);
						if (future == null)
							return false;
						future.cancel(true);
						
						fire.pb.mission.instance.InstanceManager.askInstFuture.remove(teamid);
						
						new PEnterInstanceMap(team.getTeamId(), instanceZoneId).call();
					}
					else if (insttype == 1) {
						ScheduledFuture<?> future = fire.pb.mission.instance.line.LineInstManager.askInstFuture.get(teamid);
						if (future == null)
							return false;
						future.cancel(true);
						
						fire.pb.mission.instance.line.LineInstManager.askInstFuture.remove(teamid);
						
						new fire.pb.mission.instance.line.PEnterLineMap(team.getTeamId(), instanceZoneId).call();
					}
					xtable.Instanceaskinfos.remove(teamid);
				}
				
				return true;
			}
		};
		
		askIntoInst.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805539;

	public int getType() {
		return 805539;
	}

	public short answer; // 1表示同意, 0表示不同意
	public int insttype; // 0 日常副本; 1时光之穴

	public CAskIntoInstance() {
	}

	public CAskIntoInstance(short _answer_, int _insttype_) {
		this.answer = _answer_;
		this.insttype = _insttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(answer);
		_os_.marshal(insttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		answer = _os_.unmarshal_short();
		insttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAskIntoInstance) {
			CAskIntoInstance _o_ = (CAskIntoInstance)_o1_;
			if (answer != _o_.answer) return false;
			if (insttype != _o_.insttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += answer;
		_h_ += insttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(answer).append(",");
		_sb_.append(insttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAskIntoInstance _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = answer - _o_.answer;
		if (0 != _c_) return _c_;
		_c_ = insttype - _o_.insttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘婵倗绮婃导瀛樷拻闁稿本鑹鹃敓鐣屽厴閹偤鏁傞悾宀�顔曟繝鐢靛Т濞层倗绱掗埡鍛拺妞ゆ帪鎷风紒澶婎嚟缁寮婚妷锔惧幈闂侀潧顦介崰鏍ㄦ櫠椤曪拷閺岋箓宕橀鍕亪闂佸搫琚崝宀勫煘閹达箑骞㈤柍鍝勫�愰敃锟介埞鎴﹀煡閸℃ぞ绨奸梺鎸庢磸閸ㄨ棄顕ｇ拠娴嬫闁冲灈鏅幏鐑芥晝閸屾氨顓哄┑鐘绘涧濞层劏銇愰鐐粹拻濞达絽鎲￠幆鍫熶繆椤愩垽鍙勭�规洖缍婇幊锟犲Χ閸♀晜缍楅梻浣筋潐閸庢娊顢氶銏″仭闁荤喐澹嬮弨浠嬫煟濡绲婚柡鍡樼懄閵囧嫯绠涘顓犮�愰梺瀹狀潐閸ㄥ潡骞冮埡鍛瀭妞ゆ劧绲鹃惁搴♀攽閻樻剚鍟忛柛鐘崇墵閹椽濡歌閹风兘妫冨☉鏍т划閻庤娲忛崝搴ㄦ晸閼恒儳鈾侀柨姘归悪锟介崣鍐潖缂佹鐟归柛銉戝啩绱熷┑鐘殿暯閿熷�熸珪閸犳锟借娲╃紞浣哥暦閸楃偐妲堟繛鍡楁湰鐎氬ジ姊绘担鍛婂暈缂佸鍨块弫鍐晲閸ヮ煈鍋ㄩ梻渚囧墮缁夌敻鎮￠弴鐔剁箚妞ゆ牗纰嶉幆鍫ユ煙椤旇棄鐏ラ懣鎰版煕閵夋垵绉存导鎰版煟閹惧崬锟芥牠濡甸崟顔剧杸闁圭偓娼欏▍婵嬫⒑瑜版帗鏁辨俊鐐舵椤繐煤椤忓嫬绐涙繝鐢靛Т鐎氼噣鎮鹃悽鍛婄厽閹兼番鍨归崵顒勬煕濞嗗繐鏆㈡俊顐犲灲濮婅櫣绱掑鍡欏姺缂備緡鍣崹鍫曞箖閿熺姴鍗抽柕蹇ョ磿閸樿棄鈹戦埥鍡楃仴婵炲拑缍侀弫宥咁吋閸滀胶鍞甸悷婊勭矋缁傚秴鈹戠�ｎ�箓鏌涢弴銊ョ仩闁告娅曢妵鍕疀閹炬惌妫ら悶姘剧畵閺岋絾鎯旈妶搴㈢秷濠电偛寮堕悧婊呮閻愬绡�闁搞儯鍎婚幏閿嬬瑹閿熻棄顕ｉ幘顔碱潊闁绘瑱鎷锋繛鐓庯躬濮婃椽妫冨☉姘辩杽闂佹悶鍔忛褔鎮鹃崹顐ょ懝闁跨喕妫勯～蹇曠磼濡顎撶紓浣圭☉椤戝懎鈻撻銏♀拺闁告稑锕ら悘鈺呮煛閸滀礁浜炴俊鍙夊姍閹瑩宕崟顐ワ拷鍨攽閻愭潙鐏︽い顓炴喘閺佸秴鈽夐姀鈾�鎷洪梺闈╁瘜閸樺吋绂嶆ィ鍐╃厵妞ゆ牗淇虹�氫即鏌嶇紒妯诲鞍缂佸倹甯為敓鏂ょ秵閸撴瑨銇愰崟顖涒拺闁硅偐鍋涢崝姗�鏌涢弬鍧楀弰闁糕晪闄勭粭鐔兼晸娴犲钃熺�广儱顦伴悡銉╂倵閿濆簼绨藉ù鐓庣焸濮婃椽宕崟顒佹嫳缂備礁顑嗛崹鍧楀春閵夛箑绶炲┑鐘插瀵ゆ椽姊洪崜鎻掍簼缂佽鍊块敐鐐烘偐缂佹ǚ鎷绘繛杈剧悼閸庛倝宕甸敓浠嬫⒑閸濄儱鏋欐繛澶嬫礋閺佹捇鎳為妷褏鍙濋梺鍛婎殔閸熷潡顢氶敐鍡欑瘈婵﹩鍎甸埡鍛厪濠㈣埖锚閺嬬喖鏌涘鍥ㄦ毈婵﹥妞藉畷妤呭礂閻撳函鎷烽幇顓犵濞达絽鍟垮ú锕傚疾閹间焦鐓熼柨婵嗘噺濠�浼存煛閸″繑娅婇柡宀嬬秮婵＄兘顢欐繝姘粣闁诲孩顔栭崰娑樷枖濞戙垹鐓濋幖娣妽閸婇攱銇勯幋顓烇拷銈夊炊閵娧冨箺闂佺懓鍚嬮悾顏堝垂婵犳艾鐤柡灞诲劜閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹
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
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犳娊鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閻楁洜鍙呴梺闈浥堥弲婊堝磿濡ゅ懏鐓曢柍鈺佸枤濡懐鎲搁悧鍫濈瑲闁哄懏鐓￠弻娑㈩敃椤愵澀绨肩紓鍌氱Т閻楀棝鍩為幋锔藉�烽柛娆忣槸濞呇勭節濞堝灝鏋熼柟绋垮暱閿曘垺绗熼敓钘夘潖閾忓湱纾兼俊顖氭禋娴滄粏鐏掓繝鐢靛Т濞层倗澹曢崸妤佺厵闁规鍠栭。濂告煟閹惧瓨绀嬮柟顔筋殜閺佹劙宕ㄩ鐔凤拷搴ㄦ⒒娓氬洤寮鹃柛銊ョ埣瀵鏁嶉崟顏呭媰闂佸憡鎸嗛崟顐㈢仭闂傚倷鑳剁涵鍫曞疾濞戞熬鎷峰顓熺凡闁伙絽鍢查～婊堟晸閽樺鏆︽繝濠傛－濡茬粯绻濆▓鍨灍婵＄偠妫勯～蹇曠磼濡顎撻梺鍛婄缚閸庤崵妲愰悙鐢电＝濞撴艾娲ゅ▍姗�鏌涢妸锕�顎滈柣蹇擃儔濮婃椽宕ㄦ繝鍌毿曢梺鍝ュУ閻楃娀骞忛幋锔藉亜闁告縿鍎抽鏇㈡⒑閻熼偊鍤熼柛濠冨灥椤繄鎹勯搹鐟版憢濠电偛顕慨鎾敄閸℃稒鍋傞柡鍥ュ灪閻撳啴鏌嶆潪鎵槮闁哄鍊栫换娑㈠醇濞戞浠奸梻鍥ь樀閺岋絽螣閸喖鎯為梺浼欑悼閸庛倝骞堥妸锔剧瘈闁告侗鍣禒鈺冪磽娓氬洤鏋熼柣鐔叉櫅閻ｇ兘鎮╃紒姗嗭拷鎰版⒑閸涘﹤鍤柛瀣噽閹广垹鈽夊鐐婵炴垶鐟悞浠嬫煟椤撶儑韬柡宀嬬秮瀵粙顢曢姀鐘辩帛婵＄偑鍊栧ú鈺冨緤閸撗勫床婵犻潧妫鈺傘亜閹捐泛浠掔紒銊ヮ煼濮婄粯鎷呮笟顖滃姼缂備胶绮崝娆忕暦閵壯嶆嫹閿濆簼绨撮柡瀣Ч閺屾洝绠涚�ｎ亷鎷烽弽顓炵厱闁硅揪闄勯崑锝夋煙椤撶喎绗掑┑鈥冲悑缁绘盯宕ㄩ鐓庮潚闂佸搫鐬奸崰鏍х暦濞嗘挸围闁糕剝顨忔导锟�?
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


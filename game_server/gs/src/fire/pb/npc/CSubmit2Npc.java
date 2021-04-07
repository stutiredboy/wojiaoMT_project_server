package fire.pb.npc;

import java.util.HashMap;
import java.util.Map;

import fire.log.Logger;
import fire.pb.circletask.CircleTaskManager;
import fire.pb.item.ItemBase;
import fire.pb.item.Pack;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;
import fire.pb.mission.MissionColumn;
import fire.pb.mission.PCommitMajorMission;
import fire.pb.pet.PetColumnTypes;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSubmit2Npc__ extends mkio.Protocol { }

/** 客户端请求提交任务物品或者任务宠物
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSubmit2Npc extends __CSubmit2Npc__ {
	static fire.log.Logger logger = Logger.getLogger("MAPMAIN");

	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		if (!SceneNpcManager.checkDistance(npckey, roleid)) {
			if (submittype == SubmitType.GUILD_ZONE_ITEM) {
				fire.pb.talk.STransChatMessageNotify2Client msg = MessageMgr.getMsgNotify(
						160176, 0, null);
				gnet.link.Onlines.getInstance().send(roleid, msg);
			}
			return;
		}
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		int npcid = 0;
		if (npc != null)
			npcid = npc.getNpcID();
		fire.pb.item.Pack submiterBag = new fire.pb.item.Pack(roleid, true);
		for (SubmitUnit unit : things) {
			if (submittype == SubmitType.PET)
				continue;
			if (submittype == SubmitType.MONEY) {
				long money = unit.key;
				if (submiterBag.getMoney() < money)
					logger.error("submit money error.roleid:" + roleid
							+ "unit.key:" + unit.key + "unit.num:" + unit.num
							+ "money:" + money + "npcid:" + npcid);
				continue;
			} else {
				ItemBase bi = submiterBag.getItem(unit.key);
				if (bi == null) {
					logger.error("submit item is empty.roleid:" + roleid
							+ "unit.key:" + unit.key + "unit.num:" + unit.num
							+ "npcid:" + npcid);
					continue;
				}
				if (bi.getNumber() < unit.num) {
					logger.error("submit item num error.roleid:" + roleid
							+ "unit.key" + unit.key + "unit.num:" + unit.num
							+ "realnum:" + bi.getNumber() + "npcid:" + npcid);
					continue;
				}
			}
		}
		// 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鎳為柆宥嗗殐闁宠桨鑳剁粵蹇旂節閻㈤潧校闁绘棏鍓涚槐鐐哄冀瑜滈悢鍡涙偣妤︽寧顏犻柡鍕�搁湁婵犲﹤鎳忛崵锟介梻鍥ь樀閺屻劌鈹戦崱妯烘闁荤姵鍔忛崜婵嬪Φ閸曨垰鐓涢柛灞剧矊瀵劑姊洪崫鍕拱婵炶尙鍠庨悾鐑芥偂鎼存ɑ鏂�闂佹悶鍎滅仦鎷樼喖姊婚崒娆愵樂缂侀硸鍠氱槐鐐存媴閸︻収娲搁梺鍓插亝濞叉牜绮婚弽銊ょ箚闁靛牆鎳忛崳褰掓煙绾懎鐓愰柕鍥у楠炴鎹勯悮瀛樺妞ゆ劧绠戝敮闂侀潧顦介崰姘跺船閻㈠憡鍋℃繝濠傚暟瀛濆銈庡幖濞差參寮幘缁樺亹闁肩⒈鍓涢弳浼存⒒娴ｅ憡鍟為柛鏃撶畵瀹曚即寮介銈囩劶闁诲函缍嗛崑浣圭濠婂牊鐓欓柟浣冩珪濞呭懘鏌ｈ箛锝呮灈闂囧鏌ｉ幘铏崳濠⒀嶉檮閹便劍绻濋崘鈹夸虎閻庤娲﹂崑濠傜暦閻旂⒈鏁冮柨娑樺閺呭ジ姊婚崒娆戭槮闁硅绻濋幃鐑藉Ψ瑜庡畷鏌ユ煙閻戞ê娈鹃柨婵嗩槸缁犳稒銇勯幋锝呅撻柡鍌︽嫹闂傚倷鐒﹂幃鍫曞磿椤曪拷瀵剚绗熼敓钘夘嚕閹间礁鍐�妞ゆ挾鍠庨敓钘夌仛椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊瑰畝鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡粯鍊愭慨濠冩そ瀹曘劍绻濋崘顏嶆Ч婵犵數鍋橀崠鐘诲炊閵娿儻鎷烽崼鏇熺厽婵☆垳鈷堥弳婊堟煙瀹勬澘妲婚柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷绀侀幉锟犲箰妤ｅ啫绐楅柡宥庡幗閸嬫ɑ銇勯弮锟介幏婵嬪箯閻戣姤鏅查幖鎼灡鐎氳銇勯幘璺盒㈤柡瀣洴閺岀喖顢欓悾宀�鐓�闁句紮绲介妴鎺戭潩閻撳海浠х紓浣介哺閻楃姴顫忕紒妯诲缂佹稑顑呭▓顓犵磽娴ｈ櫣甯涢悽顖楋拷宕囨殾闁硅揪闄勯崐鐑芥偡娴ｉ顦﹂柟纰卞亰閳ワ箓濡搁埡渚�鍞跺┑鐘焺娴滅兘姊介崟顖氱疄闁靛鍎欓悢鐓庡瀭妞ゆ梹鍎崇敮鍧楁⒒娴ｄ警鐒惧Δ鐘叉憸缁棁銇愰幒鎴ｆ憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸旀瑧绱掗妸銈囩煓婵﹥妞藉畷顐﹀礋闂堟稑澹堥梻浣告憸閸犳劙骞愰崘宸殨濠电姵纰嶉弲鎻掝熆鐠轰警鍎愭繛鍛灲濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�?
		java.util.List<xbean.PetInfo> pis = null;
		if (submittype == SubmitType.PET) {
			pis = new java.util.ArrayList<xbean.PetInfo>();
			final fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(
					roleid, PetColumnTypes.PET, true);
			for (SubmitUnit unit : things) {
				fire.pb.pet.Pet pet = petcol.getPet(unit.key);
				if (pet == null || pet.isLocked() != -1)
					return;
				if (petcol.petIsFightPet(unit.key)
						|| petcol.petIsShowPet(unit.key)) {
					MessageMgr.sendMsgNotify(roleid, 144418, null);
					return;
				}
				pis.add(pet.getPetInfo().copy());
			}
		}
		// 闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鎳為柆宥嗗殐闁宠桨鑳剁粵蹇旂節閻㈤潧校闁绘棏鍓涚槐鐐哄冀瑜滈悢鍡涙偣妤︽寧顏犻柡鍕�搁湁婵犲﹤鎳忛崵锟介梻鍥ь樀閺屻劌鈹戦崱妯烘闁荤姵鍔忛崜婵嬪Φ閸曨垰鐓涢柛灞剧矊瀵劑姊洪崫鍕拱婵炶尙鍠庨悾鐑芥偂鎼存ɑ鏂�闂佹悶鍎崝宥夊磹閻戣姤鈷掑ù锝囨嚀閳绘洟鏌￠敓浠嬫焼瀹ュ棗浜遍梺缁橆焾椤曆囨嫅閻斿摜绠鹃柟瀵稿�戝璺虹哗濞寸姴顑嗛悡鏇熺箾閹寸偟鎳勭紒鑸电叀閺屾稑螣閸戙倖瀚归柡鍌樺劜閺傦拷闂備胶绮崝妯间焊濞嗘劖娅犳繛鎴欏灪閻撴洟鏌曟繛鍨姢濞寸姰鍨介弻锝夋晲閸涱厽些濡炪値鍋呯换鍕箲閸曨剚濯撮柡鍥ф濞诧箓鎮￠弴銏＄厓闁宠桨绀侀弸銈夋煟閹哄秶鐭欓柡灞剧洴瀵噣宕掑顒�绠ｆ繝娈垮枛閿曘儱顪冩禒瀣祦闁归偊鍘介崕鐔兼煥濠靛棗锟藉綊锝炲鍛斀闁绘绮☉褔鏌涙繝鍕殌妞ゎ偄绻橀幊锟犲Χ閸涱厾浜版俊鐐�栭幐楣冨窗鎼达絾顐介柣鎰劋閻撴瑩姊洪銊х暠妤犵偞鐗楃换娑㈠醇閻旈浼屽┑顔硷攻濡炶棄鐣峰Δ鍛拻缁炬儳顑呴悞濠氭⒒娴ｄ警鐒炬慨姗堝娴滅鈻庨幋婵嗙亰婵犵數濮甸懝鍓х不閾忣偂绻嗛柕鍫濆椤斿鏌熼柨瀣仢婵﹨娅ｉ幑鍕Ω閵夛妇褰氶梻浣烘嚀閸ゆ牠骞忛敓锟�?
		if (submittype == SubmitType.ITEM) {
			Pack bag = new Pack(roleid, true);
			for (SubmitUnit unit : things) {
				ItemBase item = bag.getItem(unit.key);
				if (item == null)
					return;
			}
		}

		if (submittype == SubmitType.INSTANCE_ZONE_ITEM) {// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦鍟囬梻浣稿暱閹碱偊骞婃惔銊ュ瀭闁稿瞼鍋為悡鏇熶繆閵堝懎鏆欓柛鎾村▕閺屻倝寮剁捄銊よ檸闂傚洤顦甸弻锝夊箻閾忣偅宕抽梺鍦櫕婵烇拷闁哄本绋撻敓鏂ょ秵閸嬪棛绮婚悙鐑樼厸閻忕偟鏅晥閻庤娲﹂崑濠傜暦閻旂⒈鏁冩い鎺嶇椤忚埖绻濋悽闈浶ｉ柤瑙勫礃缁绘艾鈹戦悩鍨毄濠殿喗娼欑叅闁挎洖鍊哥壕濠氭煏婵犲繗绀嬪ù婊勭矒閺屸�愁吋閸愩劌顬嬮梺闈涙鐢繝寮婚悢鍏煎癄濠㈣泛锕ュ▓鏌ユ⒑闂堟稒鎼愰悗姘嵆閵嗕線寮撮姀鐙�娼婇梺鍐叉惈閸婄敻寮搁崨顔荤箚闁靛牆娲ゅ暩闂佺顑囬崑銈夌嵁閹达箑鐐婃い鎺戝�哥粊锕傛⒑閹肩偛鍔撮柛鎿勭畵瀵偊宕掗悙瀵稿幈濠电偞鍨靛畷顒勭嵁濡ゅ懏鐓涘〒姘矗闁垱鎱ㄦ繝鍕笡闁瑰嘲鎳橀幖褰掓偡閹殿噮鍋ч梻鍌欑窔濞佳兠洪敃鍌涘剮妞ゆ牗鍑归崵鏇㈡煙缂佹ê鍧婃俊鎻掔墦閺屾洝绠涢弴鐐愩儲銇勯弮锟介崝娆忣潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}
		if (submittype == SubmitType.GUILD_ZONE_ITEM) {
			new fire.pb.instancezone.PSubmit2Npc(roleid, this).submit();
		}

		// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒瀚悡鐘垫喐閻楀牆绗ч柣锝嗘そ閺屾盯鍩￠崒婊勫垱閻庢鍣崳锝呯暦婵傚憡鍋勯柛婵嗗缁犮儱鈹戦敍鍕杭闁稿﹥鐗犻幃褍螖閸愩劍鐎抽悗骞垮劚椤︻垶姊婚鐐寸厵闂傚倸顕崝宥夋煟閹惧鎳勬い銊ｅ劦閹瑩鎳犻鑳闂備浇顕х换妤冧焊濞嗘挻鏅搁柛濠勫櫏濞兼劖绻涘ù瀣珚妤犵偛绻橀弫鎾绘晸閿燂拷?
		if (fire.pb.mission.UtilHelper.isMajorScenarioMission(questid)
				|| fire.pb.mission.UtilHelper.isBranchScenarioMission(questid)) {
			// if ( things.size() != 1 )
			// return;

			if (submittype == SubmitType.ITEM) {
				final Map<Integer, Integer> items = new HashMap<Integer, Integer>();
				for (fire.pb.npc.SubmitUnit su : things) {
					Integer num = items.get(su.key);
					if (num == null) {
						items.put(su.key, su.num);
					} else {
						items.put(su.key, su.num + num);
					}
				}
				// fire.pb.team.Team team =
				// fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
				// if (team == null || team.isAbsentMember(roleid))
				// new fire.pb.mission.PCommitMajorMission(roleid, questid, new
				// fire.pb.mission.ItemCommitParam(npckey, items),
				// true).submit();
				// else if (team.isTeamLeader(roleid)) {
				// for (long memid : team.getNormalMemberIds()) {
				// if (memid == roleid) {
				// new fire.pb.mission.PCommitMajorMission(memid, questid, new
				// fire.pb.mission.ItemCommitParam(npckey, items),
				// true).submit();
				// } else {
				// new fire.pb.mission.PCommitMajorMission(memid, questid, new
				// fire.pb.mission.AutoCommitItemParam(npckey),
				// false).submit();
				// }
				// }
				// }

				// new fire.pb.mission.PTaskProcedure() {
				// @Override
				// protected boolean taskProcess() {
				// return new fire.pb.mission.TaskScenarioColumn( roleid, this
				// ).commitMission(
				// questid, npckey, new fire.pb.mission.ItemCommitParam(
				// npckey, items ) );
				// }
				// }.submit();
			} else if (submittype == SubmitType.PET) {
				if (things.size() != 1)
					return;
				final fire.pb.npc.SubmitUnit su = things.get(0);
				final int petkey = su.key;
				fire.pb.team.Team team = fire.pb.team.TeamManager
						.selectTeamByRoleId(roleid);
				if (team == null || team.isAbsentMember(roleid))
					mkdb.Procedure.execute(new PCommitMajorMission(roleid,
							questid, new fire.pb.mission.util.PetCommitParam(
									npckey, petkey), true),
							new DoneWhileSubmitPet<PCommitMajorMission>(roleid,
									questid, pis));
				else if (team.isTeamLeader(roleid)) {
					int teamshare = new MissionColumn(roleid, true).getMission(
							questid).getConf().exeIndo.share;
					if (teamshare == 0) {
						// 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑濞茶骞楁い銊ワ躬瀵顓兼径濠勫幐婵炶揪绲介幉鈥斥枔鐠轰警娓婚柕鍫濆�瑰▍鏃堟煙閸戙倖瀚�?
						mkdb.Procedure.execute(new PCommitMajorMission(roleid,
								questid, new fire.pb.mission.util.PetCommitParam(
										npckey, petkey), true),
								new DoneWhileSubmitPet<PCommitMajorMission>(
										roleid, questid, pis));
					} else {
						for (long memid : team.getNormalMemberIds()) {
							if (memid == roleid) {
								mkdb.Procedure
										.execute(
												new PCommitMajorMission(
														memid,
														questid,
														new fire.pb.mission.util.PetCommitParam(
																npckey, petkey),
														true),
												new DoneWhileSubmitPet<PCommitMajorMission>(
														memid, questid, pis));
							} else {
								mkdb.Procedure
										.execute(
												new PCommitMajorMission(
														memid,
														questid,
														new fire.pb.mission.util.PetCommitParam(
																npckey, petkey),
														false),
												new DoneWhileSubmitPet<PCommitMajorMission>(
														memid, questid, pis));
							}
						}
					}
				}
				// new fire.pb.mission.PTaskProcedure() {
				// @Override
				// protected boolean taskProcess() {
				// return new fire.pb.mission.TaskScenarioColumn( roleid, this
				// ).commitMission(
				// questid, npckey, new fire.pb.mission.PetCommitParam(petkey)
				// );
				// }
				// }.submit();
			} else if (submittype == SubmitType.MONEY) {
				if (things.size() != 1)
					return;
				final fire.pb.npc.SubmitUnit su = things.get(0);
				final long money = su.key;
				fire.pb.team.Team team = fire.pb.team.TeamManager
						.selectTeamByRoleId(roleid);
				if (team == null || team.isAbsentMember(roleid))
					new fire.pb.mission.PCommitMajorMission(
							roleid,
							questid,
							new fire.pb.mission.util.MoneyCommitParam(npckey, money),
							true).submit();
				else if (team.isTeamLeader(roleid)) {
					for (long memid : team.getNormalMemberIds()) {
						if (memid == roleid) {
							new fire.pb.mission.PCommitMajorMission(memid,
									questid,
									new fire.pb.mission.util.MoneyCommitParam(
											npckey, money), true).submit();
						} else {
							new fire.pb.mission.PCommitMajorMission(memid,
									questid,
									new fire.pb.mission.util.MoneyCommitParam(
											npckey, money), false).submit();
						}
					}
				}
			}
			return;
		}
		if (CircleTaskManager.getInstance().getCircTaskTypes()
				.contains(new Integer(questid))) {
			fire.pb.circletask.PSubmitItemPetQuest proc = new fire.pb.circletask.PSubmitItemPetQuest(
					roleid, questid, npckey, things);
			mkdb.Procedure
					.execute(
							proc,
							new DoneWhileSubmitPet<fire.pb.circletask.PSubmitItemPetQuest>(
									roleid, questid, pis));
			return;
		}
	}


	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795456;

	public int getType() {
		return 795456;
	}

	public int questid; // 提交物品相关的任务或者其他相关id
	public long npckey; // npckey
	public int submittype; // 提交的类型
	public java.util.ArrayList<fire.pb.npc.SubmitUnit> things; // 提交的道具key 或者宠物的key

	public CSubmit2Npc() {
		things = new java.util.ArrayList<fire.pb.npc.SubmitUnit>();
	}

	public CSubmit2Npc(int _questid_, long _npckey_, int _submittype_, java.util.ArrayList<fire.pb.npc.SubmitUnit> _things_) {
		this.questid = _questid_;
		this.npckey = _npckey_;
		this.submittype = _submittype_;
		this.things = _things_;
	}

	public final boolean _validator_() {
		if (questid < 0) return false;
		if (npckey < 0) return false;
		if (submittype < 0) return false;
		for (fire.pb.npc.SubmitUnit _v_ : things)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		_os_.marshal(npckey);
		_os_.marshal(submittype);
		_os_.compact_uint32(things.size());
		for (fire.pb.npc.SubmitUnit _v_ : things) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		submittype = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.npc.SubmitUnit _v_ = new fire.pb.npc.SubmitUnit();
			_v_.unmarshal(_os_);
			things.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSubmit2Npc) {
			CSubmit2Npc _o_ = (CSubmit2Npc)_o1_;
			if (questid != _o_.questid) return false;
			if (npckey != _o_.npckey) return false;
			if (submittype != _o_.submittype) return false;
			if (!things.equals(_o_.things)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		_h_ += (int)npckey;
		_h_ += submittype;
		_h_ += things.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(submittype).append(",");
		_sb_.append(things).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


package fire.msp.circletask;

import java.util.Calendar;
import fire.pb.circletask.CircTask;
import fire.pb.circletask.CircTaskClass;
import fire.pb.circletask.CircleTaskManager;
import fire.pb.circletask.SpecialQuestState;
import fire.pb.circletask.SpecialQuestType;
import fire.pb.circletask.catchit.CatchItQuest;
import fire.pb.map.SceneManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MCreateNpcForCatchIt__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MCreateNpcForCatchIt extends __MCreateNpcForCatchIt__ {
	@Override
	protected void process() {
		// protocol handle
		new mkdb.Procedure() {

			public boolean process() {
				//闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鐛崹顔煎濡炪倧缂氱划娆忣嚕椤愶箑骞㈡俊顖濆亹閻﹀牓姊婚崒姘卞缂佸甯￠獮鏍箛椤斿墽锛滈梺鍛婃尫缁�浣圭闁秵鐓涢悘鐐插⒔濞插锟芥鍠楅幐铏繆閹间礁唯闁挎梹鍎抽拏瀣⒒閸屾瑧顦﹂柟鑺ョ矒瀹曠増鎯旈埈鎯邦潐椤︾増鎯旈姀鈺傜稐闂備浇顫夊畷姗�顢氳缁牓宕橀鐣屽幍濡炪倖鐗曞Λ妤冿拷姘煎枟缁傚秹鎳滈悽鐢电槇缂佸墽澧楅敃顐﹀箯閻戣棄绀冮柤纰卞墴閻涙捇姊绘担瑙勫仩闁告柨鐭傞幃妯衡攽鐎ｅ墎绋忛棅顐㈡处缁嬫垿鏌ㄩ妶鍡曠箚闁靛牆瀚崗宀勬煕濞嗗繑顥㈡慨濠呮閹瑰嫰濡搁妷锔惧綒闂備胶鎳撻崵鏍箯閿燂拷?闂傚倸鍊搁崐鐑芥嚄閸撲礁鍨濇い鏍仦閸嬶紕鎲歌箛鏇炲灊濠电姴娲﹂崕宀勬煕椤愮姴鍔滈柍閿嬪笒闇夐柨婵嗘噺鐠愨剝绻濋敓鑺ョ鐎ｎ偆鍘遍梺鍝勫�藉▔鏇㈡倶闁秵鐓ラ柣鏃囶嚙琚氶梺鍛婂灥缂嶅﹤鐣峰鍐ｆ瀻闁圭虎鍨介幏鐑芥晝閸屾氨鍊炲銈庡墻閸撴艾螞閸愩劎鏆﹂柕濞炬櫓閺佸洭鏌ｉ幇顒�绾ч柡鍡楃箻濮婂宕掑▎鎴濆闂佽鍠栭悥鐓庣暦閺囩姷纾兼俊顖氭贡缁犳岸姊洪幖鐐插姉闁哄懏绻堥幆宀勫箻缂佹ê锟界敻姊婚崼鐔衡檨闁规彃鎽滈惀顏堝矗閵壯呯厯闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷?
				if (teamnum > 0) {
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ㄩ弮鍥棄婵炲牊鍨垮娲川婵犲啫鐭紓渚婃嫹濞撴熬鎷风�规洜鎳撻埞鎴﹀醇椤掍礁顏跺Δ鐘靛仜閻忔繈宕濆顓滀簻闁挎柨鐏濆畵鍡涙煕閳哄倻娲撮柡浣规崌閺佹捇鏁撻敓锟�?
					fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
					if (null == team || !team.isTeamLeader(roleid)) {
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(roleid, 140273, npcid, null);
						return false;
					}
					// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺冪焼濠㈣埖鍔栭悡娆撴倵濞戞鎴﹀磿閺囥垺鐓ユ繝闈涙－濡插綊鏌￠崨顔剧疄闁哄被鍔戦幃銏ゅ礈娴ｈ櫣鍘梻浣瑰缁诲嫰宕戦妶鍡樺弿闁跨喍绮欓弻鏇㈠醇濠靛浂妫″┑鐐叉噺缁挸顫忓ú顏勫窛濠电姳鑳剁换渚�姊洪幖鐐插闁告濞婇獮鍐晸閻樿尙顓洪梺鎸庢琚欓柟鐤缁辨捇宕掑▎鎴濆闂佹寧娲嶉弲鐘诲箖閻愭番鍋呴柛鎰ㄦ櫇閸橀亶姊洪崘鍙夋儓妞ゆ垵妫涢敓鑺ョ啲閹凤拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜椤ㄥ懐绮婚悩缁樼厵闁告挆鍛闂佺锕ら悥濂稿蓟濞戙垹唯妞ゆ梻鍘ч～顏堟⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕傗�﹂崶鈺冧笉濡わ絽鍟悡銉╂煟閺傚灝顣抽柣顓熺懇閺屸�崇暆鐎ｎ剛鐦堥梺杞扮劍閹歌崵绮嬮幒鏃撴嫹閿濆骸浜濇繛鍛灲濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�
					final java.util.List<Long> members = team.getNormalMemberIds();
					this.lock(xtable.Locks.ROLELOCK, members);

					java.util.ArrayList<String> args = new java.util.ArrayList<String>();
					args.add(SceneManager.getMapNameByMapID(mapid));
					
					int teamLeaderRound = 0;
					xbean.CircleTaskMap quest_map = xtable.Rolecircletask.get(roleid);
					if (null == quest_map) {
						return false;
					}
					xbean.CircleTaskInfo questinfo = quest_map.getTaskmap().get(questid);
					if (null == questinfo) {
						return false;
					}
					
					final CircTask circTask = CircleTaskManager.getInstance().getCircTask(questinfo.getId());
					
					teamLeaderRound = questinfo.getRound();
					final long now = Calendar.getInstance().getTimeInMillis();
					for (Long rid : members) {
						xbean.CircleTaskMap questMap = xtable.Rolecircletask.get(rid);
						if (null == questMap) {
							return false;
						}
						xbean.CircleTaskInfo sqinfo = questMap.getTaskmap().get(questid);
						if (null == sqinfo) {
							return false;
						}
						
						sqinfo.setDstitemid(battleid);
						sqinfo.setDstmapid(mapid);
						sqinfo.setDstnpcid(npcid);
						sqinfo.setDstnpckey(npckey);
						sqinfo.setDstx(posx);
						sqinfo.setDsty(posy);
						sqinfo.setBigaward(posx1); //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿Ψ椤旇姤娅堥梻浣告啞娓氭宕濈捄濂芥椽顢旈崟骞洦鐓曟繝濠忔嫹闁煎啿鐖煎畷婵嗙暋閹佃櫕鏂�闁圭儤濞婂畷鎰板即閵忕姷鐤囬柟鍏肩暘閸斿瞼绮堥崘顔界叆闁绘洖鍊圭�氾拷?
						sqinfo.setSmallaward(posy1);
						sqinfo.setLastgiveuptime(0);
						sqinfo.setQuestid(questid);
						sqinfo.setNpcname(name);
						sqinfo.setQueststate(SpecialQuestState.UNDONE);
						sqinfo.setQuesttype(questtype);
						sqinfo.setQuestclass(CircTaskClass.CircTask_CatchIt);
						
						if (questtype == circTask.specialtask) {
							//濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌″搴′簼鐎规洘鐓￠弻娑㈠焺閸愵亖妲堢紒鐐劤椤兘寮婚悢鍏肩劷闁挎洩鎷烽柡瀣枛閺岋繝宕卞Ο鑲╃厜闂佸搫鏈惄顖涗繆閻戣姤鏅查柛娑卞弾閻庨攱淇婇悙顏勶拷鎰板疾濠靛绀傛慨妤嬫嫹妤犵偛鍟抽妵鎰板箳閹寸姴锟界偤姊洪棃娑辩劸闁稿骸纾划濠傜暋闁附瀵岄梺闈涚墕妤犲憡绂嶉弽顓熺厱濠电姴鍟扮粻鐐碉拷娈垮枛椤兘寮幇顓炵窞濠电姴瀚獮鎰攽閻愯埖褰х紒鎻掓健瀹曟洟濡舵径濠勭枀婵犻潧鍊搁幉锟犳偂閻斿吋鐓忛煫鍥э攻濞呭懘鏌ｈ箛鏇炐ｉ柕鍥у瀵挳濡搁妷銉х潉婵°倗濮烽崑娑氭崲閹烘鏅搁柡鍌樺�楃粔鐢告煕閻樺磭澧辩紒顔肩墦瀹曞ジ濮�閳ヨ櫕鐎鹃梻濠庡亜濞诧妇绮欓幋锕�绀勯柣妯肩帛閻撴洟鎮橀悙鏉戝姢闁绘帟顫夋穱濠囧箵閹烘柨鈪甸梺鍝勭灱閸犳牠鐛幋锕�绠涙い鎾跺О閿熻姤鍔欏娲川婵犲啰鍙嗗銈嗗灥濡盯骞戦姀鐘闁靛繒濮烽鎺楁倵鐟欏嫭绀�婵炲眰鍊濋幃锟犳偄閸忕厧锟界敻鎮峰▎蹇擃仾缁剧偓鎮傞弻娑欐償閵忋垹寮ㄥΔ鐘靛仜濡繂顕ｉ浣瑰劅闁规儳鐡ㄩ弶鎼佹⒒娴ｇ顥忛柛瀣浮瀹曟垿宕掑鍕垫綗濠殿喗顨愰幏閿嬫叏婵犲啯銇濈�规洦鍋婂畷鐔煎垂椤愵偓鎷烽崱娑欌拺闁荤喐婢樺▓鈺呮煙閸戙倖瀚�?
							sqinfo.setRound(circTask.getRing() + 1);
						}
						else {
							sqinfo.setRound((teamLeaderRound % circTask.getRing()) + 1);
						}					
						
						if (sqinfo.getRound()%circTask.getRing()==1) {
							sqinfo.setFirsttasktime(now);
						}
						sqinfo.setTakequesttime(now);
						sqinfo.setAcceptquesttime(now);
						
						if (firsttime == 1)
							CircleTaskManager.getInstance().refresh2role(sqinfo, rid, true);
						else
							CircleTaskManager.getInstance().refresh2role(sqinfo, rid, false);
					}
					// 闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垵顫曢敓钘夊�块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲遍柣鐔哥矌婢ф鏁幒妤�鍨傞柛灞绢嚔瑜版帗鍋傞幖杈剧稻閹插ジ姊虹粙娆惧剬闁哄懏绋栭悘鍐⒑閹稿海绠撻柟鍐查叄瀵啿鈻庨幋鐘碉紲濡炪倖鍔戦崹缁樻櫏闂備浇顕栭崰鏍礊婵犲洤绠圭憸鐗堝笚閸嬶繝鏌℃径濠勪虎妞ゎ剙妫濆缁樻媴閾忕懓绗＄紓浣虹帛閸旀瑩鐛箛娑欐櫢闁跨噦鎷�
					CatchItQuest.addCatchItQuestTimer(roleid, questid, questinfo.getId());
				}
				else {
					//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶嬪亜閻犲洩灏欓崝鐑芥⒑鐠恒劌鏋欏┑顔哄�楅弫顕�鍨惧畷鍥ㄦ濠电姴锕ょ�氼厽鍒婇幘顔界厽闁绘柨鎼。鍏兼叏閿濆懏鎼愰柍瑙勫灴閹瑩鎳滈棃娑欓敪缂傚倸鍊哥粙鍕箯瀹勬壋鏀介柣鎰级鐎氬懐绱撳鍕獢妤犵偛妫楅悾婵嬫晸娴犲鏅搁柡鍌樺�楃粔鐢告煕閻樻剚娈滈柛鈺傜洴楠炴帒螖娴ｅ搫寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�?
					final long now = Calendar.getInstance().getTimeInMillis();
					xbean.CircleTaskMap questMap = xtable.Rolecircletask.get(roleid);
					if (null == questMap) {
						return false;
					}
					xbean.CircleTaskInfo sqinfo = questMap.getTaskmap().get(questid);
					if (null == sqinfo) {
						return false;
					}
					
					final CircTask circTask = CircleTaskManager.getInstance().getCircTask(sqinfo.getId());
					
					sqinfo.setDstitemid(battleid);
					sqinfo.setDstmapid(mapid);
					sqinfo.setDstnpcid(npcid);
					sqinfo.setDstnpckey(npckey);
					sqinfo.setDstx(posx);
					sqinfo.setDsty(posy);
					sqinfo.setBigaward(posx1); //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿Ψ椤旇姤娅堥梻浣告啞娓氭宕濈捄濂芥椽顢旈崟骞洦鐓曟繝濠忔嫹闁煎啿鐖煎畷婵嗙暋閹佃櫕鏂�闁圭儤濞婂畷鎰板即閵忕姷鐤囬柟鍏肩暘閸斿瞼绮堥崘顔界叆闁绘洖鍊圭�氾拷?
					sqinfo.setSmallaward(posy1);
					sqinfo.setLastgiveuptime(0);
					sqinfo.setQuestid(questid);
					sqinfo.setNpcname(name);
					sqinfo.setQueststate(SpecialQuestState.UNDONE);
					sqinfo.setQuesttype(questtype);
					sqinfo.setQuestclass(CircTaskClass.CircTask_CatchIt);
					
					if (circTask.getRing() == 0) {
						sqinfo.setRound(sqinfo.getRound() + 1);
						
						if (sqinfo.getRound() == 1) {
							sqinfo.setFirsttasktime(now);
						}
					}
					else {
						if (questtype == SpecialQuestType.CatchIt_Increase) {
							//濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氬綊鏌″搴′簼鐎规洘鐓￠弻娑㈠焺閸愵亖妲堢紒鐐劤椤兘寮婚悢鍏肩劷闁挎洩鎷烽柡瀣枛閺岋繝宕卞Ο鑲╃厜闂佸搫鏈惄顖涗繆閻戣姤鏅查柛娑卞弾閻庨攱淇婇悙顏勶拷鎰板疾濠靛绀傛慨妤嬫嫹妤犵偛鍟抽妵鎰板箳閹寸姴锟界偤姊洪棃娑辩劸闁稿骸纾划濠傜暋闁附瀵岄梺闈涚墕妤犲憡绂嶉弽顓熺厱濠电姴鍟扮粻鐐碉拷娈垮枛椤兘寮幇顓炵窞濠电姴瀚獮鎰攽閻愯埖褰х紒鎻掓健瀹曟洟濡舵径濠勭枀婵犻潧鍊搁幉锟犳偂閻斿吋鐓忛煫鍥э攻濞呭懘鏌ｈ箛鏇炐ｉ柕鍥у瀵挳濡搁妷銉х潉婵°倗濮烽崑娑氭崲閹烘鏅搁柡鍌樺�楃粔鐢告煕閻樺磭澧辩紒顔肩墦瀹曞ジ濮�閳ヨ櫕鐎鹃梻濠庡亜濞诧妇绮欓幋锕�绀勯柣妯肩帛閻撴洟鎮橀悙鏉戝姢闁绘帟顫夋穱濠囧箵閹烘柨鈪甸梺鍝勭灱閸犳牠鐛幋锕�绠涙い鎾跺О閿熻姤鍔欏娲川婵犲啰鍙嗗銈嗗灥濡盯骞戦姀鐘闁靛繒濮烽鎺楁倵鐟欏嫭绀�婵炲眰鍊濋幃锟犳偄閸忕厧锟界敻鎮峰▎蹇擃仾缁剧偓鎮傞弻娑欐償閵忋垹寮ㄥΔ鐘靛仜濡繂顕ｉ浣瑰劅闁规儳鐡ㄩ弶鎼佹⒒娴ｇ顥忛柛瀣浮瀹曟垿宕掑鍕垫綗濠殿喗顨愰幏閿嬫叏婵犲啯銇濈�规洦鍋婂畷鐔煎垂椤愵偓鎷烽崱娑欌拺闁荤喐婢樺▓鈺呮煙閸戙倖瀚�?
							sqinfo.setRound(circTask.getRing() + 1);
						}
						else {
							sqinfo.setRound((sqinfo.getRound() % circTask.getRing()) + 1);
						}
						
						if (sqinfo.getRound()%circTask.getRing()==1) {
							sqinfo.setFirsttasktime(now);
						}
					}
					
					sqinfo.setTakequesttime(now);
					sqinfo.setAcceptquesttime(now);
					// 闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垵顫曢敓钘夊�块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲遍柣鐔哥矌婢ф鏁幒妤�鍨傞柛灞绢嚔瑜版帗鍋傞幖杈剧稻閹插ジ姊虹粙娆惧剬闁哄懏绋栭悘鍐⒑閹稿海绠撻柟鍐查叄瀵啿鈻庨幋鐘碉紲濡炪倖鍔戦崹缁樻櫏闂備浇顕栭崰鏍礊婵犲洤绠圭憸鐗堝笚閸嬶繝鏌℃径濠勪虎妞ゎ剙妫濆缁樻媴閾忕懓绗＄紓浣虹帛閸旀瑩鐛箛娑欐櫢闁跨噦鎷�
					CatchItQuest.addCatchItQuestTimer(roleid, questid, sqinfo.getId());
					if (firsttime == 1)
						CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, true);
					else
						CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, false);
				}
				
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 741906;

	public int getType() {
		return 741906;
	}

	public long roleid;
	public long npckey;
	public int npcid;
	public int mapid;
	public int battleid; // 战斗信息
	public int posx;
	public int posy;
	public int posx1;
	public int posy1;
	public java.lang.String name;
	public int givetasknpcid; // 给予任务的npcid
	public int questtype; // 子任务类型
	public int questid; // 子任务ID
	public int teamnum; // 队伍人数,0表示不需要组队
	public byte firsttime; // 1 表示从NPC处接取任务, 0 表示自动接取的

	public MCreateNpcForCatchIt() {
		name = "";
	}

	public MCreateNpcForCatchIt(long _roleid_, long _npckey_, int _npcid_, int _mapid_, int _battleid_, int _posx_, int _posy_, int _posx1_, int _posy1_, java.lang.String _name_, int _givetasknpcid_, int _questtype_, int _questid_, int _teamnum_, byte _firsttime_) {
		this.roleid = _roleid_;
		this.npckey = _npckey_;
		this.npcid = _npcid_;
		this.mapid = _mapid_;
		this.battleid = _battleid_;
		this.posx = _posx_;
		this.posy = _posy_;
		this.posx1 = _posx1_;
		this.posy1 = _posy1_;
		this.name = _name_;
		this.givetasknpcid = _givetasknpcid_;
		this.questtype = _questtype_;
		this.questid = _questid_;
		this.teamnum = _teamnum_;
		this.firsttime = _firsttime_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npckey);
		_os_.marshal(npcid);
		_os_.marshal(mapid);
		_os_.marshal(battleid);
		_os_.marshal(posx);
		_os_.marshal(posy);
		_os_.marshal(posx1);
		_os_.marshal(posy1);
		_os_.marshal(name, "UTF-16LE");
		_os_.marshal(givetasknpcid);
		_os_.marshal(questtype);
		_os_.marshal(questid);
		_os_.marshal(teamnum);
		_os_.marshal(firsttime);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npckey = _os_.unmarshal_long();
		npcid = _os_.unmarshal_int();
		mapid = _os_.unmarshal_int();
		battleid = _os_.unmarshal_int();
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		posx1 = _os_.unmarshal_int();
		posy1 = _os_.unmarshal_int();
		name = _os_.unmarshal_String("UTF-16LE");
		givetasknpcid = _os_.unmarshal_int();
		questtype = _os_.unmarshal_int();
		questid = _os_.unmarshal_int();
		teamnum = _os_.unmarshal_int();
		firsttime = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MCreateNpcForCatchIt) {
			MCreateNpcForCatchIt _o_ = (MCreateNpcForCatchIt)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npckey != _o_.npckey) return false;
			if (npcid != _o_.npcid) return false;
			if (mapid != _o_.mapid) return false;
			if (battleid != _o_.battleid) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			if (posx1 != _o_.posx1) return false;
			if (posy1 != _o_.posy1) return false;
			if (!name.equals(_o_.name)) return false;
			if (givetasknpcid != _o_.givetasknpcid) return false;
			if (questtype != _o_.questtype) return false;
			if (questid != _o_.questid) return false;
			if (teamnum != _o_.teamnum) return false;
			if (firsttime != _o_.firsttime) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)npckey;
		_h_ += npcid;
		_h_ += mapid;
		_h_ += battleid;
		_h_ += posx;
		_h_ += posy;
		_h_ += posx1;
		_h_ += posy1;
		_h_ += name.hashCode();
		_h_ += givetasknpcid;
		_h_ += questtype;
		_h_ += questid;
		_h_ += teamnum;
		_h_ += (int)firsttime;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(mapid).append(",");
		_sb_.append(battleid).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(posx1).append(",");
		_sb_.append(posy1).append(",");
		_sb_.append("T").append(name.length()).append(",");
		_sb_.append(givetasknpcid).append(",");
		_sb_.append(questtype).append(",");
		_sb_.append(questid).append(",");
		_sb_.append(teamnum).append(",");
		_sb_.append(firsttime).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


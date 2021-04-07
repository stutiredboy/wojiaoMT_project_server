
package fire.msp.task;

import fire.pb.battle.PNewBattle;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.mission.MissionBattleEndHandler;
import fire.pb.mission.MissionColumn;
import fire.pb.mission.Module;
import fire.pb.mission.RoleMission;
import fire.pb.mission.SUseMissionItemFail;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MScenarioQuestUseItemVerifyPosSucc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MScenarioQuestUseItemVerifyPosSucc extends __MScenarioQuestUseItemVerifyPosSucc__ {
	@Override
	protected void process() {
		// protocol handle
		dealUseItem(roleid, scenarioquestid, useitemid);
	}
	private static void onFail(final long roleid) {
		if (mkdb.Transaction.current() == null)
			gnet.link.Onlines.getInstance().send(roleid, new SUseMissionItemFail());
		else
			mkdb.Procedure.psend(roleid, new SUseMissionItemFail());
	}
	public static boolean dealUseItem(final long roleid, final int scenarioquestid, final int useitemid) {
		RoleMission task = new MissionColumn(roleid, true).getMission(scenarioquestid);
		if (task == null) {
			return false;
		}
		Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟﹂幈銊╁箹娴ｅ厜鎷绘繛杈剧悼閻℃柨顭囬幇鐗堢厱閹兼番鍨归埢鏇狅拷瑙勬处閸ㄨ泛鐣疯ぐ鎺濇晪闁告侗鍘介鍌炴⒒娴ｇ儤鍤�閻忓繐鎳橀獮蹇涙晸閿燂拷" + useitemid + "],濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳畷鎰板锤濡や胶鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�" + scenarioquestid + "]!");
		if (task.getConf().aiInfo.aIID != 0) {
			PNewBattle battle = new PNewBattle(roleid, task.getConf().aiInfo.aIID, 
					new MissionBattleEndHandler(scenarioquestid, task.getConf().aiInfo.battleResult
							, roleid));
			if (mkdb.Transaction.current() == null)
				battle.submit();
			else
				battle.call();
			return true;
		//	gnet.link.Onlines.getInstance().send(roleid, new SUseTaskItemFail());
		} else {
			BuffAgent buffagent = new BuffRoleImpl(roleid,true);
			if (buffagent.existBuff(BuffConstant.StateType.STATE_TEAM) && buffagent.existBuff(BuffConstant.StateType.STATE_TEAM_LEADER)) {
				if (task.getConf().exeIndo.teamState == 0) {
				//	onFail(roleid);
					Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟﹂幈銊╁箹娴ｅ厜鎷绘繛杈剧悼閻℃柨顭囬幇鐗堢厱閹兼番鍨归埢鏇狅拷瑙勬处閸ㄨ泛鐣疯ぐ鎺濇晪闁告侗鍘介鍌炴⒒娴ｇ儤鍤�閻忓繐鎳橀獮蹇涙晸閿燂拷" + useitemid + "],濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳畷鎰板锤濡や胶鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�" + scenarioquestid + "],闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�纾奸柣鎰綑閻у嫭绻濋姀锝呯厫闁挎碍绻涢崼婵勫仮闁哄矉绲鹃幆鏃堟晬閸曨厽娈梻浣侯焾濮橈附绂嶉鍕櫢闁兼亽鍎遍崵顒勬煕閿濆繒绉鐐插暣閹粎绮电�ｎ偅娅岄梻浣芥硶閸犲秶鍒掑▎鎾虫槬闁靛绠戠欢鐐烘煙闁箑澧版い鏃�甯￠弻锝嗘償閵忊懇妾ㄩ柤鍨﹀厾褰掓偐椤旇偐浠奸梺瀹狀潐閸ㄥ灝顬婃潏銊ｄ簻闁哄洨鍠撻惌宀�绱掗纰辩吋妤犵偞锕㈤獮鍥ㄦ媴閸︻厾鈻夐梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?,濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棞缂佽翰鍊濋弻锕�螣閻氬绀嗗┑鐐村灦鑿ら柡锟芥禒瀣�甸柨婵嗙凹缁ㄥ鏌涚�ｎ亞效婵﹥妞藉Λ鍐ㄢ槈濮橆剦鏆繝鐢靛仜閻即宕濇惔銏㈢彾闁哄洨鍠嗛崑鍛存煕閹般劍娅囬柛妯圭矙濮婃椽骞愭惔锝囩暤闂佺懓鍟块ˇ鐢稿极閹惧墎椹抽悗锝庡亜瀹哥State==0.");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141711, null);
					return false;
				}
				if (task.getConf().exeIndo.share == 0) {
					//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑濞茶骞楁い銊ワ躬瀵顓兼径濠勫幐婵炶揪绲介幉鈥斥枔鐠轰警娓婚柕鍫濆�瑰▍鏃堟煙閸戙倖瀚�?
					fire.pb.mission.PCommitMajorMission taskproc=
							new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
					if (mkdb.Transaction.current() == null)
						taskproc.submit();
					else
						taskproc.call();
				} else {
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣哥秺閸嬪﹪宕归浣侯洸闁荤喖鍋婇悢鍡涙煠閹间焦娑у┑顔肩墛閵囧嫰濡烽妷顖濆惈闂佸搫鑻粔鐟扮暦椤愶箑绀嬫い鎰靛墯鐎氱懓鈹戦悩瀹犲闁绘挻绻堥弻锟犲炊閵夈儳浠鹃梺缁樻尵閸犳牠寮婚敓鐘茬＜婵炴垶锕╅崵瀣⒑鐟欏嫬绲婚柟璇х節楠炲牓濡搁敂鍓х槇闂佹悶鍎弲婵嬪汲椤愶附鈷戦柛婵嗗閻掕法绱撳鍕獢鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
					fire.pb.mission.PCommitMajorMission taskproc=
							new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
					if (mkdb.Transaction.current() == null)
						taskproc.submit();
					else
						taskproc.call();
				}
			} else if(buffagent.existBuff(BuffConstant.StateType.STATE_TEAM) && !buffagent.existBuff(BuffConstant.StateType.STATE_TEAM_LEADER)) {
				Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟﹂幈銊╁箹娴ｅ厜鎷绘繛杈剧悼閻℃柨顭囬幇鐗堢厱閹兼番鍨归埢鏇狅拷瑙勬处閸ㄨ泛鐣疯ぐ鎺濇晪闁告侗鍘介鍌炴⒒娴ｇ儤鍤�閻忓繐鎳橀獮蹇涙晸閿燂拷" + useitemid + "],濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳畷鎰板锤濡や胶鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�" + scenarioquestid + "],闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇贰濡啫鈹戦悙宸殶妞ゆ帟灏欑槐鐐寸瑹閿熻棄顕ｉ锕�纾奸柣鎰綑閻у嫭绻濋姀锝呯厫闁挎碍绻涢崼婵勫仮闁哄矉绲鹃幆鏃堟晬閸曨厽娈梻浣侯焾濮橈附绂嶉鍕櫢闁兼亽鍎遍崵顒勬煕閿濆繒绉鐐插暣閹粎绮电�ｎ偅娅岄梻浣芥硶閸犲秶鍒掑▎鎾虫槬闁靛绠戠欢鐐烘煙闁箑澧版い鏃�甯￠幃妤冩喆閸曨剛顦ュ┑鐐差檧缁犳捇寮幘缁樺亹闁告劘寮撻崠鏍⒒娴ｅ摜绉洪柛瀣躬瀹曚即寮介鐐插殤濠电偞鍨堕悷锕傚矗韫囨挴鏀介柣妯诲絻閿熻棄鐖煎畷鎴﹀閵堝棛鍘靛銈嗘煥閹碱偊鎮橀懠顒婃嫹鐟欏嫭绀冩い銊ワ工閻ｅ嘲螖閸涱喖娈愰梺鍐叉惈閸婃劙鏁撻敓锟�.");
				fire.pb.mission.PCommitMajorMission taskproc=
						new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
				if (mkdb.Transaction.current() == null)
					taskproc.submit();
				else
					taskproc.call();
			} else {
				if (task.getConf().exeIndo.teamState == 2) {
					Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟﹂幈銊╁箹娴ｅ厜鎷绘繛杈剧悼閻℃柨顭囬幇鐗堢厱閹兼番鍨归埢鏇狅拷瑙勬处閸ㄨ泛鐣疯ぐ鎺濇晪闁告侗鍘介鍌炴⒒娴ｇ儤鍤�閻忓繐鎳橀獮蹇涙晸閿燂拷" + useitemid + "],濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳畷鎰板锤濡や胶鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�" + scenarioquestid + "],婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼哥數绡�婵炲牆鐏濋弸娑㈡煥閺囨ê锟芥繃淇婇崼鏇炵濞达絽鎽滈悾娲⒑闂堟稓绠為柛濠冩礈缁牓宕煎婵嗙秺閺佹劙宕熼鍛Τ婵犲痉銈庡殝闁瑰嚖鎷�,濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棞缂佽翰鍊曢湁闁绘ê妯婇崕蹇涙煛鐎ｂ晝绐旈柡灞剧洴閹粓宕堕妸銉紦amState==2.");
					onFail(roleid);
					return false;
				}
				Module.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕濂告煥閺冨洦顥夋い蹇ユ嫹" + roleid + "]濠电姷鏁告慨鐑藉极閹间礁纾婚柣妯款嚙缁犲灚銇勮箛鎾搭棤缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氱紓浣虹帛缁嬫帒顕ラ崟顓ㄦ嫹閿濆骸浜炴い锔垮嵆閹鈻撻崹顔界彯闂佺顑呴敃銉︾┍婵犲洦鍤嬮梻鍫熺〒缁愮偤鏌ｆ惔顖滅У闁告挻鐟﹂幈銊╁箹娴ｅ厜鎷绘繛杈剧悼閻℃柨顭囬幇鐗堢厱閹兼番鍨归埢鏇狅拷瑙勬处閸ㄨ泛鐣疯ぐ鎺濇晪闁告侗鍘介鍌炴⒒娴ｇ儤鍤�閻忓繐鎳橀獮蹇涙晸閿燂拷" + useitemid + "],濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏焺閺佸銇勯幘璺烘瀾闁告瑥绻愯灃闁挎繂鎳庨弸銈夋煛娴ｅ壊鍎戦柟鎻掓啞閹棃濡搁妷褏鏉介梻渚�娼ц墝闁哄懏绮撳畷鎰板锤濡や胶鍙嗛梺缁樻礀閸婂湱锟芥熬鎷�" + scenarioquestid + "],婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ煏閸℃ê绗掓い顐ｇ箞閹瑩顢楅敓浠嬵敂閼哥數绡�婵炲牆鐏濋弸娑㈡煥閺囨ê锟芥繃淇婇崼鏇炵濞达絽鎽滈悾娲⒑闂堟稓绠為柛濠冩礈缁牓宕煎婵嗙秺閺佹劙宕熼鍛Τ婵犲痉銈庡殝闁瑰嚖鎷�.");
				fire.pb.mission.PCommitMajorMission taskproc=
						new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
				if (mkdb.Transaction.current() == null)
					taskproc.submit();
				else
					taskproc.call();
			}
			mkdb.Procedure p = new mkdb.Procedure() {
				@Override
				protected boolean process() {
					return fire.pb.item.Module.getInstance().unlockAndDelItem(roleid, useitemid);
				}
			};
			if (mkdb.Transaction.current() == null) {
				p.submit();
			} else {
				p.call();
			}
			return true;
		}
	}
//	private boolean checkAIBattle() {
//		MissionConfig conf = MissionManager.getInstance().getTaskConfig( scenarioquestid );
//		if ( conf == null ) {
//			return false;
//		}
//		if ( Helper.getTaskFinishRequireType( conf.activeInfo.missionType ) == TaskFinishRequire.AREA || 
//				Helper.getTaskExeType( conf.activeInfo.missionType ) == TaskExecuteTypes.USE ) {
//			if ( conf.aiInfo.aIID != 0 ) {
//				new TaskBattle( roleid, conf.aiInfo.aIID, 
//					new TaskAIBattleEndHandler( scenarioquestid, conf.aiInfo.battleResult ),
//					conf.scenarioInfo.animationID ).submit();
//				gnet.link.Onlines.getInstance().send(roleid, new SUseTaskItemFail());
//				return true;
//			}
//		}
//		return false;
//	}
//	private final class PCommitMajorMission extends fire.pb.mission.PCommitMajorMission {
//		private final long memid;
//		PCommitMajorMission( final long memid ) {
//			super(memid, scenarioquestid, new fire.pb.mission.NullCommitParam() );
//			this.memid = memid;
//		}
//		@Override
//		protected boolean taskProcess() {
////			fire.pb.mission.TaskScenarioColumn sml =
////				new fire.pb.mission.TaskScenarioColumn( memid, false );
//			if (roleid == memid) {
//				fire.pb.item.Module.getInstance().unlockAndDelItem( memid );
//			}
//			return super.taskProcess();
////			fire.pb.mission.TaskScenario task = sml.getTask( scenarioquestid );
////			
////			return sml.(scenarioquestid);
//				
//		}
//		
//	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739904;

	public int getType() {
		return 739904;
	}

	public long roleid;
	public int scenarioquestid;
	public int useitemid;

	public MScenarioQuestUseItemVerifyPosSucc() {
	}

	public MScenarioQuestUseItemVerifyPosSucc(long _roleid_, int _scenarioquestid_, int _useitemid_) {
		this.roleid = _roleid_;
		this.scenarioquestid = _scenarioquestid_;
		this.useitemid = _useitemid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(scenarioquestid);
		_os_.marshal(useitemid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		scenarioquestid = _os_.unmarshal_int();
		useitemid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MScenarioQuestUseItemVerifyPosSucc) {
			MScenarioQuestUseItemVerifyPosSucc _o_ = (MScenarioQuestUseItemVerifyPosSucc)_o1_;
			if (roleid != _o_.roleid) return false;
			if (scenarioquestid != _o_.scenarioquestid) return false;
			if (useitemid != _o_.useitemid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += scenarioquestid;
		_h_ += useitemid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(scenarioquestid).append(",");
		_sb_.append(useitemid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MScenarioQuestUseItemVerifyPosSucc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = scenarioquestid - _o_.scenarioquestid;
		if (0 != _c_) return _c_;
		_c_ = useitemid - _o_.useitemid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


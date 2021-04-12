
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
		Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸涘﹥灏伴柣鐕傜畵楠炲牓濡搁埡浣侯啇婵炶揪绲介崢婊堝箯缂佹绠鹃弶鍫濆⒔閹ジ鏌ｉ埄鍐╃叆妞ゎ厼娲獮鍥偋閸垹骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺戠厺闁哄洨濯撮幏椋庢喆閸曨剙顦╅梺鎼炲姀濞夋盯鎮鹃悿顖樹汗闁圭儤绻冮弲顏堟⒑閸涘﹣绶遍柛妯圭矙椤㈡瑩宕掗悙绮规嫽婵炶揪绲块崕銈夊吹閿熶粙鏌ｈ箛鎾剁闁硅櫕锕㈤悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷" + useitemid + "],濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭閻ｇ兘骞囬弶鍧楁暅濠德板�撻懗鍫曞矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹" + scenarioquestid + "]!");
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
					Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸涘﹥灏伴柣鐕傜畵楠炲牓濡搁埡浣侯啇婵炶揪绲介崢婊堝箯缂佹绠鹃弶鍫濆⒔閹ジ鏌ｉ埄鍐╃叆妞ゎ厼娲獮鍥偋閸垹骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺戠厺闁哄洨濯撮幏椋庢喆閸曨剙顦╅梺鎼炲姀濞夋盯鎮鹃悿顖樹汗闁圭儤绻冮弲顏堟⒑閸涘﹣绶遍柛妯圭矙椤㈡瑩宕掗悙绮规嫽婵炶揪绲块崕銈夊吹閿熶粙鏌ｈ箛鎾剁闁硅櫕锕㈤悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷" + useitemid + "],濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭閻ｇ兘骞囬弶鍧楁暅濠德板�撻懗鍫曞矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹" + scenarioquestid + "],闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉剁拹鐗堜繆椤愩垹鏆欓柍瑙勫灴閹瑥顔忛鍏碱啀婵＄偑鍊栫敮鐔轰焊濞嗘垶顫曢柣鎰嚟閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩缍侀、鏇㈡晝閿熺晫澹曟總鍛婄厽闁归偊鍘界紞鎴︽煟瑜嶇�氼厾鎹㈠┑瀣潊闁挎繂鎳愰崢顐︽⒑閹稿海顣茬紒缁樼洴瀹曠厧鈹戦崟顐″垝闂備礁鎼惌澶屽緤妤ｅ啫绠氶柡鍐ㄧ墛閺咁剟鏌涢弴銊ュ箺婵炲牜鍨跺缁樻媴娓氼垳鍔稿┑顔斤公闂勫嫮绮嬪澶樻晢闁告洦鍓氬▍銏ゆ⒑閸忛棿鑸柛搴ㄤ憾瀹曠敻顢楅崟顒傚幈闂佹寧绻傜换鎺旂矓椤旂瓔娈介柣鎰絻閺嗭綁鏌熼鐣岀煂缂侇喚鏁搁敓鏂ょ秵閸嬪懎鈻嶅畝鍕拻濞达綀濮ょ涵鍫曟煕閻樿尙肖闁告帗甯掗埢搴ㄥ箻閾忣偅袣闂備線娼ч¨锟界紒鐘冲灩濞嗐垽鎮欓悜妯煎幍闂備緡鍙忕粻鎴炴櫠閻楀牄浜滈柡鍐挎嫹閻㈩垽绻濆濠氭晲閸℃ê鍔呴梺闈涚箚閹冲洤顬婇妸鈺傜厾闁割煉绠戦崢鎹愩亹閹烘挸浜瑰銈嗘閸嬫劖绂掓總鍛娾拺閻庡湱濯鎰版煕閵娿儳浠㈡い顒�锕ュ蹇涘Ω閿濆嫮鐩庨梻浣告惈濞层劑宕伴幘缁樺剹鐎癸拷閿熺晫妲愰幒妤婃晩缁炬媽浜崥瀣旈悩闈涗沪闁挎洏鍨介悰顕�宕堕妸锕�顎撻梺闈╁瘜閸橀箖鍩㈡径鎰拻闁稿本鐟︾粊鐗堢箾婢跺绀嬬�规洘濞婇弫鍐磼濮橀硸鍞甸梻浣芥硶閸ｏ箓骞忛敓锟�?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鏁冮敓鍊熺亽闂佺粯鑹鹃顓犵矆閸℃せ鏀介柣鎰綑閻忥箓鎳ｉ妶澶嬬厸闁跨喕濮ょ粋鎺旓拷锝庡亜閿熺晫鏁婚弻銊モ攽閸℃瑥鍤紓浣靛妼椤兘寮诲☉姘炬嫹閿濆簼绨介弫鍫濃攽椤旂》鏀绘俊鐐舵铻為柛鎰╁妷濡插牊鎱ㄥ鍡楀⒒闁哄棭鍋呯换婵嬫偨闂堟稐绮堕梺娲讳簷閸楀啿鐣峰┑鍥ㄥ劅闁靛繈鍨昏ぐ楣冩⒑閸濆嫭宸濋柛鐘叉瀹曟垿宕ㄧ�涙鍘遍梺纭呭焽閸斿秴鈻嶉崶顒佺厱婵☆垰婀遍惌娆愭叏婵犲啯銇濇鐐村姈閹棃鏁愰崶鈺傛闂傚倷鑳堕幊鎾诲疮閸ф鍥偨缁嬫寧鐎梺瑙勫劤婢у孩銇欓幎鑺ュ�甸柨婵嗛娴滄粎锟界懓鎽滈～鎿瞭ate==0.");
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141711, null);
					return false;
				}
				if (task.getConf().exeIndo.share == 0) {
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽幃銏ゆ惞閸︻叏绱查梻渚�娼х换鎺撴叏閻㈠憡鍊堕柛顐犲劜閳锋垶绻涢懠棰濆殭妤犵偞顨嗛妵鍕Ω閵夘垵鍚悗娈垮枦椤曆囶敇閸忕厧绶炲┑鐘插楠炴劕鈹戦悙鑸靛涧缂佽弓绮欓獮澶愬灳閺傘儲鐏侀柣鐘烘〃鐠�锕�銆掓繝姘厪闁割偅绻傞敓鐣屾嚀閳诲秹寮崼鐔哄幍闂佸憡鍨崐鏍拷姘炬嫹?
					fire.pb.mission.PCommitMajorMission taskproc=
							new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
					if (mkdb.Transaction.current() == null)
						taskproc.submit();
					else
						taskproc.call();
				} else {
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴閸濄儳楔闂佺顑呴敃顏勭暦瑜版帩鏁嗗ù锝勮濞叉悂姊洪懡銈呮灈闁稿锕幃銏ゅ幢濞戞瑧鍘鹃梺褰掓？閻掞箑鈽夎閳规垿顢欓懖鈺侇杸闂侀潧娲ょ�氱増淇婇悜钘壩ㄦい鏍ㄧ箓閹牓姊绘担鍛婃儓闁兼椿鍨崇划鏃堟偡閹殿喗娈惧銈嗗姧缁犳垹绮堢�ｎ偁浜滈柟浼存涧婢ь垶鎮楀杈ㄥ殌闁宠鍨块幃鈺冿拷鍦Т椤ユ繈姊虹紒妯诲鞍缂佽鐗撳濠氭晸閻樿尙鍊為梺闈涱槶閸庤櫕绂掓ィ鍐┾拺缂備焦蓱鐏忕敻鏌涢悩宕囧⒌鐎殿喖顭烽弫鎾绘偐閼碱剨绱叉繝鐢靛仦閸ㄥ爼鏁冮埡鍛惞閻庯綆鍠楅埛鎴︽偡濞嗗繐顏╃紒鎻掝煼閺岀喓鎷犺缁★拷濡ょ姷鍋涢悧鎾翠繆閹间焦鏅滈柛鎾楀懏顫岄梻鍌欑劍閹爼宕曢锟藉鎻掆攽鐎ｎ亝杈堝銈嗗姧闂勫嫰鍩涢幋锔界厱婵犻潧妫楅顐︽煟閹烘洘纭剁紒杈ㄦ尭椤撳ジ宕熼鐘靛床闁诲孩顔栭崳顕�宕戞繝鍥╁祦婵☆垵鍋愮壕鍏间繆椤栨粎甯涙い蹇曞枛濮婄粯鎷呴懞銉с�婇梺闈╃秶缁犳捇鐛箛娑欐櫢闁跨噦鎷�?
					fire.pb.mission.PCommitMajorMission taskproc=
							new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
					if (mkdb.Transaction.current() == null)
						taskproc.submit();
					else
						taskproc.call();
				}
			} else if(buffagent.existBuff(BuffConstant.StateType.STATE_TEAM) && !buffagent.existBuff(BuffConstant.StateType.STATE_TEAM_LEADER)) {
				Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸涘﹥灏伴柣鐕傜畵楠炲牓濡搁埡浣侯啇婵炶揪绲介崢婊堝箯缂佹绠鹃弶鍫濆⒔閹ジ鏌ｉ埄鍐╃叆妞ゎ厼娲獮鍥偋閸垹骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺戠厺闁哄洨濯撮幏椋庢喆閸曨剙顦╅梺鎼炲姀濞夋盯鎮鹃悿顖樹汗闁圭儤绻冮弲顏堟⒑閸涘﹣绶遍柛妯圭矙椤㈡瑩宕掗悙绮规嫽婵炶揪绲块崕銈夊吹閿熶粙鏌ｈ箛鎾剁闁硅櫕锕㈤悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷" + useitemid + "],濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭閻ｇ兘骞囬弶鍧楁暅濠德板�撻懗鍫曞矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹" + scenarioquestid + "],闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟钘夊�婚敓鏂ょ秵閸犳牠鎮欐繝鍐︿簻闁瑰搫绉剁拹鐗堜繆椤愩垹鏆欓柍瑙勫灴閹瑥顔忛鍏碱啀婵＄偑鍊栫敮鐔轰焊濞嗘垶顫曢柣鎰嚟閻熷綊鏌ㄩ悢缁橆棄妞ゆ洩缍侀、鏇㈡晝閿熺晫澹曟總鍛婄厽闁归偊鍘界紞鎴︽煟瑜嶇�氼厾鎹㈠┑瀣潊闁挎繂鎳愰崢顐︽⒑閹稿海顣茬紒缁樼洴瀹曠厧鈹戦崟顐″垝闂備礁鎼惌澶屽緤妤ｅ啫绠氶柡鍐ㄧ墛閺咁剟鏌涢弴銊ュ箺婵炲牜鍨跺缁樻媴娓氼垳鍔稿┑顔斤公闂勫嫮绮嬪澶樻晢闁告洦鍓氬▍銏ゆ⒑閸忛棿鑸柛搴ㄤ憾瀹曠敻顢楅崟顒傚幈闂佹寧绻傜换鎺旂矓椤旂瓔娈介柣鎰絻閺嗭綁鏌熼鐣岀煂缂侇喚鏁搁敓鏂ょ秵閸嬪懎鈻嶅畝鍕拻濞达綀濮ょ涵鍫曟煕閻樿尙肖闁告帗甯掗埢搴ㄥ箻閾忣偅袣闂備線娼ч¨锟界紒鐘冲灩濞嗐垽鎮欓悜妯煎幍闂備緡鍙忕粻鎴炴櫠閻楀牄浜滈柡鍐挎嫹閻㈩垽绻濋獮鍐ㄎ旈崘鈺佹瀭闂佸憡娲﹂崜娑⑺囬妷銉㈡斀闁绘劕妯婂褏绱掗悩铏磳鐎殿噮鍋婇獮妯肩磼濡桨姹楅梻浣告啞閸旀ê顕ｉ幘璇茬闁哄稁鍘介埛鎺懨归敐鍛喐缂佸妞介弻娑氾拷锝庝悍闊剛锟借娲戦崡鍐差嚕娴犲鏁囬柣鎰絻濞堛倖绻濋悽闈涗沪闁搞劌鐖奸幃鐑芥晝閸屾氨鐓戦棅顐㈡处閹告挳寮ㄦ禒瀣厽婵☆垵顕х徊濠氭煥閻旂粯顥夐柣鏍帶閻ｇ兘骞嬮敃锟介～鍛存煏閸繃顥犻柛姗�娼ч—鍐Χ閸℃鍙嗛梺鍦拡閸嬪﹪骞冨锟介幊鐘活敆婵犲啫顏堕柣鐔哥懃鐎氼厾绮堥崘鈹夸簻闁靛鍎诲銉╂煟閿濆懎妲婚摶鏍煕濞戝崬鏋涙繛鍫熷姍濮婃椽宕橀崣澶嬪創闂佺锕ラ崝娆撳极閹剧粯鏅搁柨鐕傛嫹.");
				fire.pb.mission.PCommitMajorMission taskproc=
						new fire.pb.mission.PCommitMajorMission(roleid, scenarioquestid, true, true);
				if (mkdb.Transaction.current() == null)
					taskproc.submit();
				else
					taskproc.call();
			} else {
				if (task.getConf().exeIndo.teamState == 2) {
					Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸涘﹥灏伴柣鐕傜畵楠炲牓濡搁埡浣侯啇婵炶揪绲介崢婊堝箯缂佹绠鹃弶鍫濆⒔閹ジ鏌ｉ埄鍐╃叆妞ゎ厼娲獮鍥偋閸垹骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺戠厺闁哄洨濯撮幏椋庢喆閸曨剙顦╅梺鎼炲姀濞夋盯鎮鹃悿顖樹汗闁圭儤绻冮弲顏堟⒑閸涘﹣绶遍柛妯圭矙椤㈡瑩宕掗悙绮规嫽婵炶揪绲块崕銈夊吹閿熶粙鏌ｈ箛鎾剁闁硅櫕锕㈤悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷" + useitemid + "],濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭閻ｇ兘骞囬弶鍧楁暅濠德板�撻懗鍫曞矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹" + scenarioquestid + "],婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煠閸濄儲鏆╃紒鈽呮嫹婵犵數鍋涢悧鍡涙倶濠靛鍑犳繛鎴欏灪閻撱儵鏌￠崶顭嬵亪鏁撻懞銉х畺濞ｅ洤锕畷濂稿即閻愭鍟囧┑鐐舵彧缁蹭粙骞楀鍫熷仼婵炲樊浜濋埛鎴︽⒒閸喓銆掔紒鐘靛仱閺屾稒绻濋崘鈺冾槶缂備緡鍠栭悧鎾崇暦閻撳寒鐔嗘繝闈涙缁夋椽鏌℃担鐟板鐎规洜鍠栭、姘跺川椤撶倣銈呪攽閻樿尙妫勯柕鍫濋濞堟繈姊洪悷鏉挎闁瑰嚖鎷�,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冩礋濠�渚�姊虹紒妯忣亜螣婵犲洤纾块煫鍥ㄧ♁閻撴盯鎮楅敐鍌涙珖缂佹劖妫冮弻锛勪沪閸撗勫垱闂佽鍠楃划鎾崇暦閸洖惟闁靛鍠曠槐顩噈State==2.");
					onFail(roleid);
					return false;
				}
				Module.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭獮宥夘敊绾拌鲸姣夐梻浣侯焾椤戞垹鎹㈠┑瀣摕闁靛ň鏅涚猾宥夋煕鐏炲墽鐓瑙勬礋濮婃椽宕崟顒夋！缂備緡鍠楅幑鍥ь嚕婵犳碍鏅插璺猴攻椤ユ繈姊洪崷顓х劸閻庢稈鏅犲畷浼村箛閻楀牃鎷虹紓鍌欑劍椤洨绮诲顓犵濠㈣泛顑囧ú鎾煕閳哄啫浠辨鐐差儔閺佸啴鏁撻悾灞筋棜濠靛倸鎲￠悡銉╂煛閸愩劍澶勬い銉ヮ槹閵囧嫯绠涢妷锕�顏�" + roleid + "]濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢稓绱掔�ｎ偄绗掓い鏇樺劦瀹曠喖顢橀妸锕�顏堕梺鎸庣箓妤犲憡绂嶉悙娣簻闁挎柨鐏濆畵鍡涙煙椤旂瓔娈旈柍缁樻崌瀹曞綊顢欓悾灞借拫闂傚倷鑳堕…鍫ヮ敄閸涘瓨鏅濋柕澶涘閳瑰秴鈹戦悩鍙夊闁搞倕顑夊濠氬醇閻旀亽锟芥帞绱掗幇顔间槐闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑閸涘﹥灏伴柣鐕傜畵楠炲牓濡搁埡浣侯啇婵炶揪绲介崢婊堝箯缂佹绠鹃弶鍫濆⒔閹ジ鏌ｉ埄鍐╃叆妞ゎ厼娲獮鍥偋閸垹骞堥梺鐟板悑閻ｎ亪宕硅ぐ鎺戠厺闁哄洨濯撮幏椋庢喆閸曨剙顦╅梺鎼炲姀濞夋盯鎮鹃悿顖樹汗闁圭儤绻冮弲顏堟⒑閸涘﹣绶遍柛妯圭矙椤㈡瑩宕掗悙绮规嫽婵炶揪绲块崕銈夊吹閿熶粙鏌ｈ箛鎾剁闁硅櫕锕㈤悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷" + useitemid + "],濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒鍔撮梺杞扮椤戝棝濡甸崟顖氱閻犺櫣鍎ら悗楣冩⒑閸涘﹦鎳冪紒缁樺姌閻忓啴姊洪幐搴ｇ畵闁瑰啿閰ｅ鎼佸Χ婢跺鍘告繛杈剧到婢瑰﹪宕曢幋锔界厵闁圭粯甯楅崯鐐烘煙椤栨稒顥堝┑鈩冩倐婵＄柉顦撮柡澶夌矙濮婄粯绗熼敓钘夘焽瑜戞晶婵嬫⒑閸濆嫭鍣虹紒顔芥尭閻ｇ兘骞囬弶鍧楁暅濠德板�撻懗鍫曞矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹" + scenarioquestid + "],婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸缂備礁顑嗙敮锟犲极瀹ュ绫嶉柛顐ゅ枔閸橀箖姊洪崫鍕垫Ъ婵炲娲樼粋鎺楀閵堝棛鍘梺绯曞墲閿氱紒妤佸笚閵囧嫰顢曢敐鍥╃杽闂佽鍠楅悷鈺呫�佸Δ鍛櫢濞寸姴顑愰弫鍌炴煠閸濄儲鏆╃紒鈽呮嫹婵犵數鍋涢悧鍡涙倶濠靛鍑犳繛鎴欏灪閻撱儵鏌￠崶顭嬵亪鏁撻懞銉х畺濞ｅ洤锕畷濂稿即閻愭鍟囧┑鐐舵彧缁蹭粙骞楀鍫熷仼婵炲樊浜濋埛鎴︽⒒閸喓銆掔紒鐘靛仱閺屾稒绻濋崘鈺冾槶缂備緡鍠栭悧鎾崇暦閻撳寒鐔嗘繝闈涙缁夋椽鏌℃担鐟板鐎规洜鍠栭、姘跺川椤撶倣銈呪攽閻樿尙妫勯柕鍫濋濞堟繈姊洪悷鏉挎闁瑰嚖鎷�.");
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



package fire.pb.npc;

import java.util.Collections;

import fire.pb.PropRole;
import fire.pb.main.ConfigManager;
import fire.pb.map.Npc;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.SceneNpcManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CVisitNpc__ extends mkio.Protocol { }

/** 客户端请求访问 NPC
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CVisitNpc extends __CVisitNpc__ {
	private boolean checkGatherTask( long roleid, final SGatherConfig conf ) {
		if ( conf.tasks == null || conf.tasks.isEmpty() ) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛閻㈤潧甯掑┑鐐叉▕娴滃爼寮崶顒佺厽闁硅埇鍔嶅▍鍡涙煟韫囨挸鏆ｆ慨濠冩そ楠炴劖鎯旈姀銏╂К闂備胶顭堥敃銈囩礊婵犲倻鏆﹂柟瀵稿閹风兘鏁愭惔鈩冪亶闂佺粯鎸搁崯鎾蓟濞戞ǚ鏀介柛鈩冾殢娴犲ジ姊洪崫鍕棤闁稿鍊濆濠氭晲婢跺娅滈梺鎼炲劘閸斿酣顢欓張绱刱s闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鏁撻懞銉р枔闁哄懏绻勯崚鎺戔枎閹惧磭顔婂┑锛勫仧閵嗗骞忛悜钘夌妞ゆ梻鍘ч懓鍨攽閻愭潙鐏卞瀛樻倐瀵煡鍩￠崨顔惧幗闂婎偄娲﹀ú鏍ㄧ濠婂喚鐔嗙憸宀�鍒掑▎鎾虫槬闁靛繈鍊曠猾宥夋煕椤愩倕鏋旈柛娆忓濡懘顢曢姀鈥愁槱闂佸湱顭堥幗婊堝极椤曪拷婵℃悂鍩￠崒婊冨箰濠电偞鎸婚懝楣冩晝閵壯嶆嫹濮樼偓瀚�");
			return true;
		}
		if ( fire.pb.mission.Module.getInstance().checkGather(roleid, conf) ) {
			return true;
		}
		return false;
	}
	private void gatherProcess( long roleid, int gatherid ) {
		// 
		SGatherConfig conf = ConfigManager.getInstance().getConf(fire.pb.npc.SGatherConfig.class).get(gatherid );
		if ( conf == null ) {
			Module.logger.error( "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐐垫噧缂佸墎鍋ら弻娑㈠Ψ椤旂厧顫╃紓渚婃嫹闁割偆鍠撶弧锟介梻鍌氱墛缁嬫帡鏁嶉弮鍫熺厾闁哄娉曟禒銏ゆ婢舵劖鐓ユ繝闈涙閹兼劙鏌涢弬娆惧剶闁诡喗顨呴～婵嬵敇閻愬弶鎳欓梻浣告惈閺堫剙煤濡警鍤楅柛鏇ㄥ灠楠炪垺淇婇婵嗗惞鐟滄澘鎳忕换婵嬫偨闂堟稐绮堕梺鐟板暱缁绘劙鎮惧┑鍫㈢煓婵炲棛鍋撶紞搴㈢節閻㈤潧校闁煎綊绠栭悰顕�濮�閳ヨ尙绠氶梺闈涚墕鐎氼喚鎷归悧鍫滅箚妞ゆ劗濮撮敓鑺ョ墱閹广垹鈹戠�ｎ亞鍘遍梺璺ㄥ枍缁瑥鐣峰锟介崺鈩冩媴闁垮鈻曢梻鍌氬�峰ù鍥敋閺嶎厼鍨傚ù鍏兼綑閻ゎ噣鏌℃径瀣仼闁哄棴绠撻弻锝夊籍閸屾瀚涢梺杞扮缁夌敻骞堥妸銉建闁糕剝顨呴埛澶岀磽娴ｉ顦︽い鏇ㄥ幘濡叉劙骞樼拠鑼紲濠殿喗锕╅崗娑㈠窗婵犲洦鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗?" + gatherid );
			return;
		}

		if ( !checkGatherTask( roleid, conf ) )
			return;

		fire.msp.npc.GCheckGathering send = new fire.msp.npc.GCheckGathering();
		send.gatherkey = npckey;
		send.roleid = roleid;
		fire.pb.GsClient.sendToScene( send );
	}
	
	public static void getScenarioQuests( 
			final long roleid,
			final int npcid, 
			SVisitNpc svisitNpc ) {
		try {
			svisitNpc.scenarioquests.clear();
			svisitNpc.scenarioquests = new fire.pb.mission.MissionColumn(roleid, true).getMissionsByNpcid(npcid, svisitNpc);
			Collections.sort(svisitNpc.scenarioquests);

		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	private void onVisitNpc( final long roleid, final SNpcShare share ) {
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒瀚悡鐘垫喐閻楀牆绗ч柣锝嗘そ閹稿﹪鎮㈤悮瀛樺闁谎冩啞鐎氬綊姊洪崨濠冨闁告挻鐩畷銏ゅ箹娴ｅ厜鎷洪梺鍛婃尰瑜板啯绂嶆禒瀣厱閻庯綆浜滈顏堟煛閸涙澘鐓愰悗浣冨亹閿熻姤绋掗敋濞寸姴鎼—鍐Χ閸℃瑥顫х紒鐐緲缁夊綊鐛崱娑橀唶闁靛濡囬崢鎾剁磽閸屾瑧鍔嶉拑杈ㄣ亜閵夈儳澧㈤柨鐔诲Г椤旀牠宕板Δ鍛闁规儼妫勭粻鏍ㄧ箾閸℃ɑ灏柣顓燁殔椤法鎹勬笟顖氬壉濡炪倖姊瑰Λ鍐潖婵犳艾纾兼繛鍡樺灥婵′粙姊哄ú璁崇盎缂傚秴锕ら悾宄扳攽閸℃瑦娈曢梺鍛婃处閸嬪懎危椤掑嫭鈷戦柛婵嗗濡插綊鏌ｅ☉娆忕伌婵﹤顭峰畷鎺戔枎閹存繂顬夐梺璇叉捣閻熸娊宕ㄩ婊呭幆闂備胶顢婇幓顏嗙不閹寸媴鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒鎮ｉ梻浣告惈鐎氥劑宕曢悽绋胯摕婵炴垶菤濡插牓鏌涘Δ鍐ㄤ户濞寸媭鍙冮弻锝堢疀閹捐崵宕梺鐟板殩閹凤拷?
		if (share.npctype == 16) {
			fire.pb.instancezone.Module.visitNpc(roleid, npckey, share);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熶粙鎮块锟介弻鏇熺箾閻愵剚鐝旂紒鐐劤濞尖�愁潖濞差亶鏁嗛柨鐔烘櫕缁棃鎮界粙璺紱婵犮垼鍩栭崝鏍偂閺囩喆浜滈柟鏉垮缁嬭崵绱掗敓浠嬫晸閻ｅ瞼纾藉〒姘攻鐎氬綊姊洪崜鎻掍簽闁哥姴妫欑粋宥咁煥閸喓鍘搁悗骞垮劚閸燁偅淇婇崸妤佺厓闁告瑣鍎崇粣鏃堟煛瀹�锟介崰鏍箖濠婂牆绠ｉ柟鐑樻尭閺嬨倝姊绘担鍛婃儓闁活厼顦卞濠冪鐎ｎ亞鍘撮梺鍛婂姦閸犳宕愰柨瀣ㄤ簻闁瑰搫绉烽崗宀�鎲搁弶鎸庮棤缂佽鲸鎸婚幏鍛偊閹稿寒锟芥姊洪崨濞掝亪濡堕幖浣哥畺闁靛鏅滈崑鍌炲箹鏉堝墽绋绘繛鍫熷劤閳规垿顢欑粵瀣吅闂佸湱鍏橀ˉ鎾绘晸閸婄噥娼愭繛鎻掔箻瀹曟繈骞嬮敂鐚存嫹娴ｇ硶妲堟俊顖炴敱椤秴鈹戦鏂や緵闁告ü绮欓、娆忣嚕婵夌珟
		if (share.npctype == 17) {
			fire.pb.mission.instance.InstanceManager.visitNpc(roleid, npckey, share);
			return;
		}
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝夋交閼板潡姊洪锟界粔瀵哥不閻樼粯鐓欓柟顖嗗啯顔戦梺鎼炲労閸撴岸宕戦妸鈺傜厱闁规儳鍟跨痪褔鏌￠崨顖氫粶闁宠鍨堕獮濠囨煕婵犲啯宕岄柟铏殜瀹曞ジ寮村鍫熷闁告稑鐡ㄩ崐濠氭煠閹帒鍔氬ù鐙�鍨跺娲箹閻愭彃濮岄梺鍛婃煥閻厧顕ユ繝鍕＜婵☆垶鏅茬花璇差渻閵堝棗濮夊┑顔芥尦閺佹捇鎳為妷褏鐤勯悗娈垮枛椤兘寮幇鏉垮窛妞ゅ繐鎳忛弳濠囨⒒娴ｈ櫣甯涢柛鏃撶畵瀹曟粌顫濋懜闈涗户闂佸搫娲ㄦ慨椋庡閼测晝纾藉ù锝夋涧閻忊晜顨ラ悙瀵稿⒌闁哄矉缍佸浠嬵敃閵忕姳绮梻浣风串缁蹭粙宕查弻銉稏婵犲﹤鐗婇弲鎼佹煢濡警妲洪柡鍡畵閺屾洘绻涢悙顒佺彟闂佽桨绀佺粔鐢垫崲濞戙垹绠ｉ柣鎰問閺嗏�斥攽閻愯尙澧㈤柣婵堟箲c
		if (share.npctype == 28) {
			if (mkdb.Transaction.current() != null) {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).call();
			}
			else {
				new fire.pb.circletask.catchit.PSendCatchItNpcService(share.getId(), npckey, roleid).submit();
			}
			return;
		}
		
		//濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閺勩儱鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鐑嗙劯婵炴垶顭囬弳鍡涙煕閺囥劌浜炴い锔诲弮濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�?闂傚倷娴囧畷鐢稿窗閹邦喖鍨濈�癸拷閿熺晫鍒掗弮鍫熷仺闁汇垽娼у畷銉╂⒑缂佹ɑ鈷掗柛妯犲洦鍊峰┑鐘插暔娴滄粓鏌熼搹鐟颁沪閻庢艾缍婇弻锝嗘償閵忥絽顥濆銈忕細閸楄櫕淇婇悽绋跨妞ゆ牗姘ㄩ濠囨⒑閻熸壆鎽犵紒缁樺姍楠炲繘鎮滈挊澶夌炊闂侀潧顧�缁犳垿顢旈幖浣光拺缂備焦蓱閻撱儵鏌熼懞銉х煂缂侇喖顭烽獮鍡氼檨闁绘柨妫濋幃瑙勬姜閹峰矈鍔呴梺绋垮閸旀妲愰幒妤佹櫢濞寸姴顑嗛弲绋棵归悩宸剱闁抽攱鍨块弻娑樷攽閸曨偄濮庢繛瀵稿缁犳捇寮婚悢鐓庡窛濠电姴鍊甸弸娆徫旈悩闈涗粶婵☆偅绻傞悾宄邦潨閿熶粙銆佸▎鎾村殐闁冲搫锕ュ瓭缂傚倸鍊搁崐宄邦渻閹烘梻鐭嗗〒姘炬嫹濠碘�崇埣閺佹捇鏁撻敓锟�
		if (fire.pb.mission.instance.line.LineInstManager.getInstance().checkLineNpc(share.getId())) {
			fire.pb.mission.instance.line.LineInstManager.visitNpc(roleid, npckey, share);
			return;
		}
		// added by cn
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺炴嫹缁绢叏鎷烽梻浣虹帛閸斿繘寮插鍫熷�跺〒姘炬嫹婵﹥妞介幃鐑芥焽閿曪拷濞堝爼姊虹粙娆惧剳闁哥姵鐗犳俊鎾川鐎涙ê锟藉鏌ら幁鎺戝姎濞寸媭鍨跺娲箹閻愭彃濮岄梺鍛婃煥閻厧顕ユ繝鍕＜婵☆垶鏅茬花璇差渻閵堝棗濮夊┑顔芥尦閺佹捇鎳為妷锔绢槹闂佺硶鏂傞崕鎻掝嚗閸曨垰绠涙い鎾跺枑椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块叄娴滄儼妫熷銈嗙墱閸嬬偤宕曞Δ浣风箚闁靛牆瀚板宄懊瑰鍕煉闁哄备锟芥剚鍚嬮柛鎰╁妼椤绱撴担鍝勑ｉ柟鐟版喘瀵鈽夊Ο婊呭枔缁辨帒螣閸濆嫭鏁梻鍌欑閹碱偅寰勯崶顒佹櫢闁兼亽鍎辨晶顖炴煕濮橆剦鍎旈柡灞剧洴椤㈡洟顢曢～顓犲嚬缂傚倸鍊哥粔鎾偋閸℃稑鐓橀柟杈鹃檮閸嬫垿鏌涘☉鍗炴灈妞ゅ繐鐖煎缁樻媴閸涘﹥鍎撳銈忓瘜閸ㄦ娊鎳為柆宥嗙劶鐎广儱鎳撻幗鏇㈡⒑閹稿孩绀�闁稿﹤缍婇幃锟犲礃椤旂晫鍘撻柡澶屽仦婢瑰棝藝閿曞倹鐓涢柛鈩冪懃娴犙呯磼鏉堛劌娴柟顔规櫊瀹曟﹢宕ｆ径搴ｆ闂傚倷娴囬鏍窗濞戭澁缍栧鑸靛姇缁狀垶鏌涘☉娆愮稇鐎瑰憡绻傞埞鎴︽偐閹绘帪鎷峰畡鎵掑酣顢欓悾宀�鐦堢紒鍓у钃辨い顐躬閺屾稓锟斤綆浜濋ˉ銏ゆ煥濠靛牆浠辩�殿喗澹嗙紓鎾绘倷閻戞ǚ鎷婚梺绋挎湰閻熝囧礉瀹ュ鐓熸い蹇撳缁夎櫣锟借娲樼换鍌炴偩濠靛鏅稿ù鐘差儐閺呮悂鏌ら幁鎺戝姎闁搞値鍓熼弻娑㈠Ω閵壯嶇礊闂佸憡甯楃敮妤冩崲濠靛鐐婇柤绋跨仛濞呭洭姊绘担鐟邦嚋婵炴祴鏅犻獮蹇涙倻閼恒儳鍘遍梺瑙勫閸╂牜锟芥熬鎷�?,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倗鍋撶换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秶锟芥凹鍘奸埢鎾村鐎涙鍘介柟鍏肩暘閸ㄥ鍩︽笟锟介幏鎴﹀础閻忚崵鎳撻埞鍐垂椤曞棙瀚规繝闈涱儏閽冪喖鏌ㄩ悢鍝勑㈢痪鎯у悑缁绘盯骞嬮悜鍥︾返闂佹悶鍊曢鍥╂閹惧鐟瑰┑鐘插暙椤忓爼姊绘担鑺ョ《闁哥姴绉堕崚鎺戔枎韫囷絾缍庡┑鐐叉▕娴滄粓骞戦懜鐐逛簻闁规崘娉涘瓭缂備焦顨愮换婵嗩潖濞差亜宸濆┑鐘插暊閹风懓顪冮妶鍐ㄥ闁挎洏鍎茬粚杈ㄧ節閸ヮ煈妫冨┑鐐村灱妞存悂宕撻棃娑辨富闁靛牆妫欑亸闈涒攽椤曞懎寮�殿喓鍔戦獮搴ㄦ嚍閵夈垺瀚奸梻浣告惈閸婂爼宕曢幓鎺嗘瀺闁告稑鐡ㄩ悡鏇㈡煟閺傚灝绾ф繛鍛处娣囧﹪宕ｆ径濠傤潚闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶嬪亜閻犲洩灏欓崝鐑芥⒑鐠恒劌鏋欏┑顔哄�楅弫顕�鍨惧畷鍥ㄦ濠电姴锕ょ�氼厽鍒婇幘顔界厽闁绘柨鎼。鍏兼叏閿濆懏鎼愰柍瑙勫灴閹瑩鎳滈棃娑欓敪缂傚倷鐒﹂悡锛勭不閺嶎厼绠栨繛宸簻閸楁娊鏌曡箛鏇炐ユい锔诲弮濮婃椽妫冨ù銉ョ墦瀵彃顭ㄩ崼鐔蜂簵闂佸搫娲㈤崹娲偂濞嗘挻鍊甸柣銏☆問閻掑墽锟芥稒绻堝娲川婵犲啰鍙嗗銈嗗灥濡盯骞戦姀鐘斀閻庯綆鍋呭▍銏＄箾鐎电孝妞ゆ垵鎳橀幃娆愮節閸愶缚绨婚梺纭呮閸嬬偟锟芥艾婀辩槐鎾寸瑹婵犲啫顏跺┑鐘灱閸╂牠宕濋弽顓熷亗闁告劦鍠楅悡蹇擃熆鐠鸿櫣澧曢柛鏃�宀搁弻锟犲幢濞戞鍠氶梺鍝勭焿缂嶏拷缂佺姵鐩顕�宕掑☉妯荤彴闂傚倷娴囬鏍窗閺嶎厽鍋夊┑鍌滎焾閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噰闁诡噣娼ц灒闁煎鍊楅惁鍫ユ⒑闂堟盯鐛滅紒鎻掑⒔濞戠敻鎮欓鍌滎啎闂佸湱铏庨崳顔嘉涢幋鐘电＜妞ゆ梻鈷堥悡鑲╋拷瑙勬礈閸忔﹢銆佸锟介幃鈺冨枈婢跺苯绨ュ┑鐘垫暩婵即宕归悡搴樻灃婵炴垯鍨洪弲婵嬫煥閺冨倹娅曞褝绻濆濠氬磼濞嗘帒鍘″銈庡幖閻楀﹪銆冮妷鈺佷紶闁靛绠戞惔濠傗攽閳藉棗鐏ユ繛鍜冪秮瀵娊鏁冮崒娑氬弳闂佺粯娲栭崐鍦拷姘炬嫹?,缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備焦鍔栭〃鍫ユ晸閽樺鐣柛搴″船鐓ら柕濞炬櫅绾拷濠殿喗顭堥崺鏍偂濞嗘垹纾藉ù锝夋涧閻忊晠鏌＄�ｎ偆銆掔紒杈ㄥ浮閺佹挻绂掔�ｎ亞顦ㄩ梺鍐叉惈閸熶即顢欓弴銏♀拺缂侇垱娲栨晶鍙夈亜閵娿儳澧㈢紒顔碱煼瀵濡烽敂缁橆棅婵＄偑鍊栫敮鎺椝囬娑欐珷閻庣敻娼婚幏宄扳枔閸喗鐏堥梺缁樼墪閵堢鐣峰ú顏呮櫢闁绘灏欓敍婊冣攽閻樿宸ラ悗姘煎墮閳诲秷绠涘☉娆屾嫽闂佺鏈悷锔剧矈閻楀牄浜滈柡鍥╁枔閻帗顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫澹曢悷鎳婂綊鎮╁顔煎妧缂傚倸绉甸悧鏇⑩�︾捄銊﹀磯闁绘垶蓱閹烽亶姊虹粙璺ㄧ缂侇喗鎹囧璇测槈閵忊晜鏅濋梺鎸庣箓濡盯藝閵娾晜鈷戠紓浣股戦幆鍫ユ煙閸戙倖瀚�?
		if (!checkNpcVisitable(roleid)){
			Module.logger.info("npc is unvisitable");
			return;
		}
		
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告噧妞ゆ洩绲介悾锟犳焽閿旇棄鐦滈梻渚�娼ч悧鍡椢涘☉娆愭珷妞ゆ帒鍊荤壕鍏笺亜閺冨洤浜归柣鎺撴倐閹稿﹪鎮㈤梹鎰畾闂侀潧鐗嗙�氼垶宕楀畝锟界槐鎺楁偐閼姐倗鏆梺鍝勬湰閻╊垶銆侀弴銏℃櫜闁搞儮鏅╅崬鍫曟⒒娴ｅ憡鍟炴慨濠傤煼瀹曚即骞囬钘夊簥濠电偞鍨崹褰掓煁閸ヮ剚鐓熼柡鍐ㄧ墛閺侀亶鏌￠崱妯绘杸c闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸涱収妫岄梺缁樺笂缁瑩寮诲澶娢ㄩ柨鏂垮⒔閻涱喖鈹戦悙鏉戠仧闁搞劍妞藉畷鐢碉拷锝庡枟閳锋帡鏌涢銈呮灁闁靛棙甯炵槐鎺楀箛椤旈棿妲愬┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告劦鐓堝Σ閬嶆⒒娴ｅ憡鍟為惇澶岀磼椤旂晫鎳冮柣锝囧厴楠炲洭鎮ч崼婵撴嫹妞嬪海纾介柛顐犲灩鍟哥紓浣哄У瀹�绋款潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�?
		SpecialNpcDialogProcessor processor = SpecialVisitProcessCreator.getInstance().createNpcDialogProcessor(roleid, npckey);
		if(null != processor){
			Module.logger.info("specialNpcDialog. npcid:"+share.id);
			processor.onVisitNpc();
			return;
		}
		
		final SVisitNpc svisitNpc = new SVisitNpc();
		svisitNpc.npckey = npckey;
		final java.util.List<Integer> services = NpcServiceManager.getInstance().getShowServicesIDSByNpcKey(roleid, npckey);
		if (null != services) {
			svisitNpc.services.addAll(services);
		}
		getScenarioQuests(roleid, share.id, svisitNpc);
		
		gnet.link.Onlines.getInstance().send(roleid, svisitNpc);
		Module.logger.info("SVisitNpc闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐椤曞棙瀚归柛鎰靛枛瀹告繃銇勯弽銊р槈閹兼潙锕ら埞鎴炲箠闁稿﹥娲熼獮蹇曪拷锝庡枛閺嬩礁鈹戦悩鍙夊闁绘挻娲樼换娑㈠箣閻愬灚鍣紓鍌氱У閸ㄥ湱妲愰幒妤佹櫢濞寸姴顑呯粈鍐┿亜閺冨倹娅曢柛妯哄船閳规垿鎮欓弶鎴犱淮閻庤娲﹂崜娆擃敋閿濆棎鍋呴柛鎰ㄦ櫇閸橀亶姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷-" + getString(svisitNpc,share.id));
	}
	

	private String getString(SVisitNpc svisitNpc,int npcid) {
		StringBuffer sb = new StringBuffer();
		sb.append("NPC:[" + npcid + "],");
		sb.append("Services:[");
		for(Integer serviceid : svisitNpc.services){
			sb.append(serviceid +";");
		}
		sb.append("],");
		sb.append("ScenarioQuests:[");
		for(Integer serviceid : svisitNpc.scenarioquests){
			sb.append(serviceid +";");
		}
		sb.append("].");
		return sb.toString();
	}
	@Override
	protected void process() {

		//Module.logger.info("闂傚倸鍊峰ù鍥х暦閻㈢绐楅柟閭﹀枛閸ㄦ繈骞栧ǎ顒�鐏繛鍛У娣囧﹪濡堕崨顔兼缂備胶濮抽崡鎶藉蓟濞戞ǚ妲堟慨妤�鐗婇弫鎯р攽閻愬弶鍣藉┑鐑囨嫹闂佸搫鐭夌徊鍊熺亽闂佹儳绻橀敓鑺ョ〒妞瑰啿鈹戦悩鎰佸晱闁搞劋鍗虫俊鍫曞箹娴ｆ瓕鎽曞┑鐐村灦缁姴危閻撳寒娓婚柕鍫濆暙婵″吋淇婇锝囩疄鐎殿噮鍋勯鍏煎緞婵犲嫰鐛撴繝娈垮枛椤剟骞楅敓锟� id + " + NpcServiceManager.getNpcIDByKey(npckey));
		
		// protocol handle
		// TODO:濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨⒑鐟欏嫬鍔ゅ褍娴锋竟鏇㈡嚍閵夛箑寮垮┑鈽嗗灡鐎笛呮兜閸撗呯＜闁跨喍绮欏畷鎺戔槈濞嗗繐浼庢繝寰锋澘锟芥洟顢栭崱娆欐嫹濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌︾喘闂備胶顭堝ù鐑藉极鐠囧樊鍤曟い鎰剁畱缁�鍐煃閸濆嫬鏆熼柟铏箞濮婃椽骞栭悙鎻掑Η闂佸憡娲﹂崜娑溿亹閻㈠憡鈷掗柛灞捐壘閿熻姤鎮傚畷鎰板箹娴ｅ摜锛欓梺褰掓？缁�浣哄閻熸壋鏀介柣妯虹枃婢规绱撴担鍙夋珚闁哄本娲熷鍊燁槻婵炲牞鎷�,濠电姷鏁告慨鐑藉极閹间礁纾绘繛鎴欏灪閸嬨倝鏌曟繛褍鍟悘濠囨椤愩垺澶勯柟鍛婃尦瀵顓兼径瀣弳濠电娀娼уΛ娆撍夐悙瀵哥闁告侗鍨伴埢鍫ユ煛鐏炲墽顬兼い锕佹珪閵囧嫰濡搁妷锔绘＆閻庤娲橀崹鍧楃嵁閸ヮ剚鍋嬮柛顐犲灩楠炴﹢姊婚崒姘拷鎼佹偋閸愵喖鐤炬繝濠傛嫅閹峰嘲顫濋悙顒�顏�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁躲倝鏌涜椤ㄥ懐澹曢崸妤佺厪闁割偅绻嶅Σ褰掓煕鐎Ｑ勬珚婵﹥妞介、妤呮晸閻ｅ瞼鐭撻柣銏犳啞閸嬪倿鏌￠崶銉ョ仾闁绘挻鐟╅弻娑樷攽閸℃浼岄梺绋块缁绘﹢寮婚妸鈺傚亜閻犲洦鐣幘缁樼厽婵°倕鍟瓭濡炪倖娲╃徊鍓ф崲濠靛棭娼╂い鎺戝�搁敓鐣屽仜椤啴濡堕崱妤冪憪闂佺粯甯粻鎴﹀煝瀹ュ鍐�妞ゆ挾鍠撻崢浠嬫椤愩垺澶勬繛鍙夌墬缁傛帡鍩￠崨顔惧幈闁诲函缍嗛崑鍕叏閸儲鍊甸梻鍫熺◤閸嬨垺顨ラ悙鍙夊枠妞ゃ垺鐗犻幊鐐哄Ψ閿旇姤绶梻鍌氬�烽懗鍫曞磻閵娾晛纾块梺顒�绉撮悿顕�鏌涜椤ㄥ棝寮查幖浣圭參婵☆垯璀﹀Σ鍛婁繆閼碱剛甯涢柕鍥у椤㈡洟鏁愰崶鈺冩澖闂備浇妗ㄧ粈渚�宕弶鎴犳殾闁圭儤鍩堝鈺傘亜閹虹偞瀚归梺瑙勬偠閸婃繂顫忕紒妯诲闁绘垶锚濞堝矂姊虹拠鑼缂佽瀚伴弫鎾绘嚍閵夈儱姣堥梺鍝ュУ濮樸劑宕氶幒妤�閱囬柣鏃堫棑缁愮偤姊鸿ぐ鎺戜喊闁告﹢绠栧畷銏ゆ偨閸涘﹦鍘介柟鍏肩暘閸ㄥ鍩︽笟锟介弻鏇㈠幢濞嗗繋妲愬Δ鐘靛仜椤戝寮崘顔芥櫢濞寸姴顑呯粈鍕煟濡偐甯涢柣鎾跺枛閺岋繝宕掑☉姗嗗殝闂佺懓寮堕幃鍌炲蓟瀹ュ棗顕辨繛鍡樺姇椤忥拷?...
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0){
			Module.logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸涱収妫岄梺缁樺笂缁瑩寮诲澶娢ㄩ柨鏂垮⒔閻涱喖鈹戦悙鏉戠仸婵ǜ鍔戦幆宀勫箻缂佹鍘靛銈嗘尵閸犳捇顢旈幘顔解拻闁稿本鑹鹃敓鐣屽厴閹偤鏁冮崒娑樺壋閻熸粎澧楃敮鎺旂矆婢跺矉鎷烽惂鍛婂闂佽法鍠嶇划娆撳极閹剧粯鍤嶉柕澶堝劚濮ｅ牓姊洪幖鐐插闁绘牕銈稿顐﹀箛閻楀牆锟界兘鏌涘▎蹇擄拷鐟拔涢崘銊ф殾闁靛ň鏅╅弫濠囨煕韫囨艾浜归柡澶涙嫹? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + roleid + "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇娴犺櫣绱撴担鍓插剱閻庣瑳鍥ㄥ�垫い鎺戝閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�");
			return;
		}
		
		PropRole prole = new PropRole(roleid, true);	
		if(prole.getProperties().getCruise() > 0) {
			Module.logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸涱収妫岄梺缁樺笂缁瑩寮诲澶娢ㄩ柨鏂垮⒔閻涱喖鈹戦悙鏉戠仸婵ǜ鍔戦幆宀勫箻缂佹鍘靛銈嗘尵閸犳捇顢旈幘顔解拻闁稿本鑹鹃敓鐣屽厴閹偤鏁冮崒娑樺壋閻熸粎澧楃敮鎺旂矆婢跺矉鎷烽惂鍛婂闂佽法鍠嶇划娆撳极閹剧粯鍤嶉柕澶堝劚濮ｅ牓姊洪幖鐐插闁绘牕銈稿顐﹀箛閻楀牆锟界兘鏌涘▎蹇擄拷鐟拔涢崘銊ф殾闁靛ň鏅╅弫濠囨煕韫囨艾浜归柡澶涙嫹? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + roleid + "闂傚倸鍊峰ù鍥敋瑜庨〃銉х矙閸柭わ拷鍧楀级閸碍娅嗛柛蹇旂矒閺屾盯顢曢敐鍡欘槬缂備緤鎷烽柛顐ゅ枔缁★拷闂傚倸鐗婃笟妤呭磿閹扮増鐓曢悗锝庝憾濡拷闂佸搫鏈惄顖炪�侀弴銏℃櫜闁糕剝鐟Σ浼存⒒娴ｄ警鐒炬い鎴濇瀹曟繂鈻庨幘瀹犳憰闂侀潧鐗嗛ˇ浼此夐崼銉︾厓闁告繂瀚敓鑺ユ倐椤㈡棃鏁撻敓锟�?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸ゅ苯螖閿濆懎鏆為柡鍛箞閺屻劑寮崹顔规寖闂佹椿鍘煎Λ妤呪�︾捄銊﹀磯闁惧繐婀辨导鍥╃磼閻愵剙鍔ら柕鍫熸倐瀵鈽夊顐ｅ媰闂佸憡鎸嗛崟顐ｇ彯闂傚倷绀侀幉锟犲蓟閵娧呯煋闁汇垻顭堟闂佸憡娲﹂崹鎵不閹惰姤鐓欓柟瑙勫姉閸亪鏌ㄩ悢璇残撻悽顖ょ節瀵鎮㈡搴㈡疂闂備緡鍙忕粻鎴﹀礈閸洘鍊甸悷娆忓缁�鍫熴亜椤撶偟澧ｉ柣蹇撳暞缁绘盯骞樼壕瀣棟闂佹寧娲╃粻鎴︹�旈崘顔芥櫢闁跨噦鎷�.");
			return;
		}

		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戙垹鍨傞柛灞绢嚔瑜版帒绀傞柛蹇氬亹缁嬪洭姊洪幖鐐插闁稿﹤娼￠悰顕�寮介‖銉ラ叄椤㈡鏁撴禒瀣�舵い鏂款潟娴滄粓鏌嶆潪鎵槮缂佺嫏鍥ㄧ厪闁搞儜鍐句純濡ょ姷鍋涘ú顓㈠春閳╁啰鐟瑰┑鐘插暙椤忓爼姊洪崫鍕枆闁告ü绮欏畷鎴﹀煛閸涱喚鍘藉銈呯箰閹冲繘宕愰惍顏堟⒒閸屾艾锟芥悂宕愭搴ｇ焼濞达綀妗ㄩ悞濠囨煕濞戞瑦缍戠紒鐙�鍨堕弻銊╂偆閸屾稑顏�?
		Npc npc = SceneNpcManager.selectNpcByKey(npckey);
		if (npc == null){
			Module.logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸涱収妫岄梺缁樺笂缁瑩寮诲澶娢ㄩ柨鏂垮⒔閻涱喖鈹戦悙鏉戠仸婵ǜ鍔戦幆宀勫箻缂佹鍘靛銈嗘尵閸犳捇顢旈弶鎴旀斀闁绘ê鐏氶弳鈺呮煕鐎ｎ剙浠辩�规洖缍婂畷濂稿即閻愭鍞堕梻浣告啞缁哄潡宕曢幎鑺ュ剹闁瑰墽绮悡娆戠磽娴ｉ潧鐏╅柡瀣枛閺屾稓锟斤絻鍔岄敓鑺ョ箞瀵寮撮悢铏诡啎闂佺粯鍔﹂崜姘舵偟閺冨牊鈷戦柛锔诲幗椤忕喖鏌熼崙銈嗗? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + npckey);
			return;
		}
		final SNpcShare share = NpcManager.getInstance().getNpcShareByID( npc.getNpcID() );
		if ( share == null ){
			Module.logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸涱収妫岄梺缁樺笂缁瑩寮诲澶娢ㄩ柨鏂垮⒔閻涱喖鈹戦悙鏉戠仸婵ǜ鍔戦幆宀勫箻缂佹鍘靛銈嗘尵閸犳捇顢旈幘顔解拻闁稿本鑹鹃敓鐣屽厴閹偤鏁冮崒娑樺壋閻熸粎澧楃敮鎺旂矆婢跺矉鎷烽惂鍛婂闂佸憡娲﹂崑鍛ｉ鍕拺闁告挸寮剁欢娑㈡煙閸戙倖瀚� 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + npc.getNpcID() + "闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晜閽樺缃曢梻浣虹《閸撴繈鎽傜�ｎ喖鐐婃い鎺嶇娴犺櫣绱撴担鍓插剱閻庣瑳鍥ㄥ�垫い鎺戝閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏� share濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姵婢樿灃闁挎繂鎳庨弳鐐烘煕鎼达紕效闁哄矉缍佸浠嬪Ω閵夛附娈");
			return;
		}
		if ( share.npctype == 5 ) {
			Role role = RoleManager.getInstance().getRoleByID(roleid);
			if(!role.checkDistance(npc,400)){
				Module.logger.error("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繒锟借娲栧ú銊╂儗閸℃褰掓晲閸涱収妫岄梺缁樺笂缁瑩寮诲澶娢ㄩ柨鏂垮⒔閻涱喖鈹戦悙鏉戠仸婵ǜ鍔戦幆宀勫箻缂佹鍘靛銈嗘尵閸犳捇顢旈幘顔解拻闁稿本鑹鹃敓鐣屽厴閹偤鏁冮崒娑樺壋閻熸粎澧楃敮鎺旂矆婢跺矉鎷烽惂鍛婂闂佽法鍠嶇划娆撳极閹剧粯鍤嶉柕澶堝劚濮ｅ牓姊洪幖鐐插缁剧虎鍙冨畷姘跺箳濡や焦娅滈梺鍛婁緱娴滄繈锝炲鍛斀妞ゆ梻鐡旈悞鎯瑰搴″⒋闁诡喚鍋ゅ畷绋课旀担鍙夊闂備礁鎲＄换鍌滐拷姘煎墴椤㈡棃鍩￠崘顏嗭紲缂傚倷鐒﹂敋缂佹う鍛＜妞ゆ梻鈷堥悡鑲╋拷娈垮枙缁瑩銆佸锟介幃娆撴偨閸濄儱绀堥梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + npc.getNpcID());
				return;
			}
			gatherProcess( roleid, share.id );
			return;
		}
		if (!fire.pb.map.SceneNpcManager.checkDistance(npckey, roleid)){
			Module.logger.error("npc闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閹肩偛濡肩痪缁㈠弮瀹曟岸骞掑Δ浣规珳闂佸憡渚楁禍婵嬶綖瀹ュ應鏀芥い鏃傜摂閻掓儳霉濠婂骸澧撮柟顔惧仱瀹曠螖娴ｅ弶瀚奸梻浣告啞缁诲倻锟芥凹鍓熼、鏃堝煛閸愵亞锛滅紓鍌欑劍閿氱紒妞﹀懐纾兼い鏃傗拡閻撹偐锟芥鍠曠划娆撱�佸锟介幃娆撴偨閸濄儱绀堥梻鍌氬�峰ù鍥р枖閺囥垹闂柨鏇炲�哥粻顖炴煥閻曞倹瀚�? 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�? " + npc.getNpcID());
			return;
		}
		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
		if (team != null) {
			if (team.isTeamLeader(roleid)) {
				if (share.share==1) {
					for (Long member : team.getNormalMemberIds()) {
						onVisitNpc( member, share );
					}
				} else {
					onVisitNpc( roleid, share );
				}
			} else {
				if ( team.isAbsentMember( roleid ) ) {
					onVisitNpc( roleid, share );
				}
			}
		} else {
			onVisitNpc( roleid, share );
		}
	}

	

	private boolean checkNpcVisitable(long roleid) {

		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫绮婚悩璇茬婵烇綆鍓欐俊鑲╃磼閻樹警娼愰柕鍥у楠炲洭宕滄担鑽锋垿姊洪崨濠勬噧缂佺粯锕㈤幃锟狀敃閿曪拷閻愬﹪鏌曟繝蹇擃洭妞わ负鍔戦弻锝嗘償閵忋埄鏆￠悗鐧告嫹闁归棿绀侀拑鐔兼煥閻斿搫孝闁绘劕锕弻宥嗘姜閹殿喗鍋ч梺闈涱槴閺呮粓鎮￠悢鎼炰簻闁规崘娉涢崜鎶芥椤掑澧撮柡灞革拷宕囨殕閻庯綆鍓涜ⅵ濠电姷顣介崜婵嬪箖閸屾稐绻嗛柣鎴ｆ鍞銈嗘瀹曠數澹曠紒妯肩瘈闁汇垽娼цⅷ闂佹悶鍔岄妶鎼佹晲閻愭潙绶為悘鐐靛亾濞堜即姊洪崷顓炲妺妞ゃ劌鎳橀幃鈥斥攽鐎ｎ偆鍘甸梺璇″瀻鐏炶姤顔嶇紓鍌欒濡插嫰骞忛悜鑺モ拻濞达絼璀﹂悞楣冩偠濮樼厧浜扮�规洘鍔欏浠嬵敄閽樺鍊庨梻鍌氬�搁崐鎼佸磹瀹勯偊娓婚柟鐑樻⒐椤洘銇勯弴顏呭濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�?
//		if(!fire.pb.activity.keju.KejuManager.getInstance().checkNpcVisitable(roleid,npckey)){
//			Module.logger.info("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫绮婚悩璇茬婵烇綆鍓欐俊鑲╃磼閻樹警娼愰柕鍥у楠炲洭宕滄担鑽锋垿姊洪崨濠勬噧缂佺粯锕㈤幃锟狀敃閿曪拷閻愬﹪鏌曟繝蹇擃洭妞わ负鍔戦弻锝嗘償閵忋埄鏆￠悗鐧告嫹闁归棿绀侀拑鐔兼煥閻斿搫孝闁绘劕锕弻宥嗘姜閹殿喗鍋ч梺闈涱槴閺呮粓鎮￠悢鎼炰簻闁规崘娉涢崜杈ㄧ箾閼碱剦鐓糲,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洩绠撻弫鎾绘寠婢跺瞼鏆涢梺绋块瀹曨剝鐏嬪┑鐐村灟閸ㄥ綊鎮″┑瀣厸闁告劑鍔屾禍浼存煙妞嬪骸鍘撮柣娑卞櫍瀹曞綊顢欓悡搴經闂傚倷鑳剁划顖炪�冮崨顓囨稑鈹戦崱娆愭闂侀潧绻堥崐鏇犵不缂佹ǜ浜滈柡鍐ㄦ处椤ュ霉閻欙拷閸ㄨ京鎹㈠☉娆愮秶闁告挆鍐ㄧ厒闂備胶顢婇婊呮崲濠靛棛鏆﹂柟杈剧畱鍞梺鎸庢濞夋洜绮诲顒夋富闁靛牆妫楁慨锕傛煕閹惧瓨鐨戦柨鐔诲Г閻旑剟骞忛敓锟�:"+roleid);
//			return false;
//		}
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈡晝閿熺晫绮婚悩璇茬婵烇綆鍓欐俊鑲╃磼閻樹警娼愰柕鍥у楠炲洭宕滄担鑽锋垿姊洪崨濠勬噧缂佺粯锕㈤幃锟狀敃閿曪拷閻愬﹪鏌曟繝蹇擃洭妞わ负鍔戦弻锝嗘償閵忋埄鏆￠悗鐧告嫹闁归棿绀侀拑鐔兼煥閻斿搫孝闁绘劕锕弻宥嗘姜閹殿喗鍋ч梺闈涱槴閺呮粓鎮￠悢鎼炰簻闁规崘娉涢崜鎶芥椤掑澧撮柡灞革拷宕囨殕閻庯綆鍓涜ⅵ濠电姷顣介崜婵嬪箖閸屾稐绻嗛柣鎴ｆ鍞銈嗘瀹曠數澹曠紒妯肩瘈闁汇垽娼цⅷ闂佹悶鍔岄妶鎼佹晲閻愭潙绶為悘鐐靛亾濞堜即姊洪崷顓炲妺妞ゃ劌鎳橀幃鈥斥攽鐎ｎ偆鍘甸梺璇″瀻鐏炶姤顔嶇紓鍌欒濡插嫰骞忛悜鑺モ拻濞达絼璀﹂悞楣冩偠濮樼厧浜扮�规洘鍔欏浠嬵敄閽樺鍊庨梻鍌氬�搁崐鎼佸磹瀹勯偊娓婚柟鐑樻⒐椤洘銇勯弴顏呭濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�? end
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795433;

	public int getType() {
		return 795433;
	}

	public long npckey; // npckey为npc的唯一ID

	public CVisitNpc() {
	}

	public CVisitNpc(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CVisitNpc) {
			CVisitNpc _o_ = (CVisitNpc)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CVisitNpc _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

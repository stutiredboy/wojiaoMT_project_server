
package fire.pb.npc;

import java.util.Arrays;
import java.util.List;

import fire.pb.activity.winner.WinnerManager;
import fire.pb.activity.winner.WinnerRecord;
import fire.pb.circletask.SpecialQuestState;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.TaskDlgUtil;








// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CWinnerChangeTask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CWinnerChangeTask extends __CWinnerChangeTask__ {
	@Override
	protected void process() {
		// protocol handle
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閼碱剦妲锋繝寰锋澘锟芥捇鎮為敃鍌氱煑闊洦绋掗悡娆戠磽娴ｉ潧鐏╅柡瀣洴閺岋綁濡舵惔鈩冪亶婵烇絽娲ら敃顏呬繆閸洖宸濇い鎾跺枑椤斿姊虹拠鎻掝劉缁炬澘绉撮悾婵嬪箹娴ｆ瓕鎽曢梺璺ㄥ枔婵挳鎮欐繝鍥ㄧ厓閺夌偞澹嗛幃濂告煏韫囨洖违鐟滅増甯楅崑鎰版煕濞嗗浚妲肩痪顓ㄦ嫹缂傚倸鍊峰ù鍥ㄣ仈閹间礁绠板┑鐘宠壘缁狀垶鏌涘☉娆愮稇濞磋偐濞�閺屾盯寮撮妸銉ヮ潾闂佽法鍠庨敓鐣屽枑椤忕姷绱掓潏銊﹀鞍闁瑰嘲鎳愰幉鎾礋閵婏箑顏搁梻鍌欑濠�閬嶁�﹂崼銉ョ柈闁秆勵殣缂嶆牠鐓崶銊︹拻闂傚嫬瀚伴弻娑樷槈濮楀牆浼愭繛瀛樼矋缁挸顫忛搹鍦煓閻犳亽鍔庨鍥⒑閸涘﹨澹樻い鎴濐樀楠炲棙绗熼敓浠嬪极閹版澘骞㈡繛鍡樺焾閸熷酣姊虹拠鍙夋崳闁轰焦鎮傞垾锕傚醇閵壯嶆嫹闁垮绻嗛柣鎰典簻閿熻姤鐗曢埢鏃堟晝閸屾氨顦板銈嗗釜閹烽锟芥鍠栧鈥愁潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid<=0){
			return;
		}
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				Team team = TeamManager.selectTeamByRoleId(roleid);
				if (team == null){
					MessageMgr.sendMsgNotify(roleid, 140498, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩宕ｉ妷锔炬綎闂傚倷鐒﹂崕宕囨崲濡ゅ拑缍栧璺虹焿閹峰嘲顫濋鐐叉懙闂佸搫鐬奸崰鎾舵閹烘嚦鐔访洪鍕毆濠电姴鐥夐弶鍖℃嫹閺囥垹绠犻煫鍥ㄧ♁閸嬪倹绻涢幋娆忕仾闁绘挻娲熼弻锟犲炊閵夈儳浠惧┑鐐村毆閸ャ劎鍘介棅顐㈡处濞叉牠鍩㈤崼銉︾厸鐎癸拷閿熶粙宕伴弽顓滐拷浣糕槈濡攱鐎婚梺瑙勬儗閸樺�熲叺婵犵绱曢崑鎴﹀磹閺嶎灐娲煛閸涱厾顔嗛梺璺ㄥ櫐閹凤拷?闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掕棄鈹戦悩瀹犲缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
				long currentTime = System.currentTimeMillis();
				if (!WinnerManager.getInstance().isInWinnerActiveTime(currentTime)) {
					return false;
				}
				if(acceptflag==1){
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒鎮ｇ紓鍌欑筏閹风兘鏌涢鐘插姕闁绘挻鐟︾换娑㈠醇濠靛牅铏庨梺鍝勵儍閸婃鎯�椤忓牆绠氱憸瀣磻閵忋倖鐓涚�癸拷鐎ｎ剛袦閻庢鍣崜鐔风暦瑜版帩鏁嬮柛娑卞枟椤旀垵鈹戦敍鍕杭闁稿﹥娲滈幑銏ゅ箛椤掑倹娈惧銈嗗笒鐎氼厾绮婚幒妤佲拻濞达綀娅ｇ敮娑㈡儑婢舵劖鍋ｉ柨鐔剁矙閺佸啴宕掑顒佸劒婵犵數鍋涘Λ妤冩崲閸℃稑缁╅柤鎭掑劘娴滄粓鏌￠崶鈺佷沪妞ゃ儳鍋ら幃妤�顫濋悙顒�顏�
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�濋幊婵嬪箥椤旇偐澧┑鐐茬摠缁瞼绱炴繝鍥ц摕婵炴垯鍨瑰敮濡炪倖姊婚崢褔锝為鍫熲拺闁规儼濮ら弫閬嶆煙閻熺増鍠樼�殿喖顭烽弫鎰緞婵犲喚妫熼梻浣稿閻撳牓宕板Δ鍛９妞ゆ牗鍩冮弨鑺ャ亜閺囩偞顥犵紒瀣煼閺屾盯寮敓浠嬫偡閳轰緡鍤曞┑鐘崇閺呮彃顭跨捄濂斤繝鍩￠崨顔惧帾婵犮垼娉涢悧鍡涘礉閺夋嚚褰掓偐閼碱剛楔濠殿喖锕ュ浠嬪箖閻戣棄绠ユい鏃傚亾濞堫垶姊绘担瑙勫仩闁告柨绻愯灋闁告洦鍨遍崑鈺冿拷鐟板婢瑰寮ㄦ禒瀣�甸柨婵嗘捣閸樻粓鏌熸搴″幋闁轰焦鎸荤粋鎺旓拷锝庡亞閸樹粙姊洪棃娑辨▓闁搞劏浜敓鑺ョ啲閹凤拷
					long teamleadid=team.getTeamLeaderId();
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚鍤曢柛顐ｆ礀闁卞洦绻涢幋鐏活亪鈥栫�ｎ亶娓婚柕鍫濆�瑰▍鍥煕韫囨棑鑰挎鐐插暢閵囨劙骞掗幋鐘诧拷鐐烘⒑闂堟侗鐒鹃柛搴＄－缁﹤鐣￠柇锔藉瘜闂侀潧鐗嗘鍛婄閺嶎厽鐓曞┑鐘插暞缁�澶屾喐妫颁胶绐旀慨濠冩そ楠炴牠鎮欓幓鎺懶ョ紓鍌欐祰鐏忣亝鎱ㄩ妶澶婄柧闁割偅娲栫粻鐢告煙鐟欏嫷娈旀繝锟介崡鐐╂闁汇垹鎲￠悡銉╂倵閿濆簼鎲惧ù纭锋嫹
					xbean.TaskDlgInfo task=TaskDlgUtil.getTaskDlgInfo(teamleadid, WinnerManager.WINNER_TASK_ID);
					if(task==null){
						WinnerManager.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"\t闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒绱濋梻浣芥〃缁�浣肝涘┑瀣摕闁挎繂顦粻娑欍亜閹哄秶鍔嶉柛搴㈡尵缁辨挻绗熸繝鍐伓闂備礁鎲￠崝锕傚窗濡ゅ懏鍋傞柣鏃堟櫜缁诲棙銇勯弽銊х闁搞倖鐟х槐鎺楀箵閹烘繄鍚嬮梺鍝勭焿缁绘繂鐣烽妸鈺婃晢闁稿本绮庨崢顖炴⒒娴ｇ瓔鍤冮柛鐘崇墱缁辩偞绻濋崒婊勬闂佸壊鍋呭ú鏍ㄥ劔闂備焦瀵у濠氭惞鎼粹垾锝夊醇閺囩啿鎷绘繛杈剧导鐠�锕傛倿妤ｅ啯鐓熼柣鏇氭闁垳锟借娲滈崰鏍�佸Ο娆炬Ъ缂備椒绶￠崑濠傤潖濞差亝鍤掗柕鍫濇啗閵忥紕绠鹃悹鍥囧懐鏆㈤梺闈涙处閸旀瑥鐣峰锟介、姘跺幢濞嗘垟妫ㄩ梻鍌欑窔濞佳囨偋閸℃蛋鍥ㄥ鐎涙ê浜楅梺闈涱檧婵″洨绮绘ィ鍐╃厵閻庣數顭堥敓鑺ョ墵楠炲鈹戦幘鐧告嫹閸啔褰掓偂鎼达絾鎲奸梺缁樻尰閻╊垶寮诲☉銏犵労闁告劦浜濋崳褔姊洪崫鍕靛剱缂佸甯￠妴鍐Ψ閳哄倸锟界兘鏌℃径瀣仼濞寸厧鑻—鍐Χ閸愩劎浠鹃悗鐧告嫹闁归棿绀侀弸渚�鏌熼幆褜鍤熸い鈺冨厴閹鏁愭惔婵堝嚬闂佽瀵掗崜姘辨崲濠靛鍋ㄩ梻鍫熷垁閵忋倖鍊垫慨妯煎帶楠炴﹢鏌ㄩ悢璇残撶痪鏉跨Ф閸犲﹤顓兼径濞箓鏌涢弴銊ョ仩闁告劧鎷烽梻渚�娼чˇ顓㈠磿婵犳艾绠�瑰嫭瀚堥弮鍫濈妞ゅ繐妫涢崝璺衡攽閻橆喖鐏遍柛鈺傜墵瀹曟繈寮介鐐靛幈闂佸湱鍎ら〃鍡涙偂閺囥垺鐓欓柡澶婄仢閹胶绱掗妸銉吋闁哄矉绱曢敓鏂ょ秵閸嬪棗煤閹绢喗鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剝鐏冮梺璺ㄥ枍缁瑩骞婂鍡愪汗闁圭儤鎸鹃崢鎾绘煟閻樿京顦︾痪缁㈠弮閹苯鈻庨幘瀵稿幈闂佸疇妗ㄧ粈渚�顢旈鐙呮嫹鐟欏嫭绀冮柨鏇樺灲瀹曟椽鏁撻悩鑼槰濡炪倕绻愰幊蹇涱敊閹存績鏀介柣妯虹仛閺嗏晠鏌涚�ｎ偆娲存い銏″哺椤㈡﹢鎮㈢粙鍨紟濠德板�х徊浠嬪窗濮樿泛鏋侀悗锝庡墯閸犳劙骞栧ǎ顒�濡肩紒鐘靛仱閺屾洘绻涢悙顒佺彆闂佸搫鎳忛幃鍌炲蓟閵娾晜鍋嗛柛灞剧☉椤忥拷");
						return false;
					}
					Npc npc = SceneNpcManager.selectNpcByKey(task.getDstnpckey());
					if(npc==null){
						return false;
					}
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣虹帛閸旀洟顢氶鐘典笉濡わ絽鍟悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘濡搁埡濠冩櫍闂侀潧绻掓慨鎾矗婵犲洦鈷掑ù锝囩摂閸ゅ啴鏌涢悩鎰佹畷缂佺粯绋掔换婵嬪炊瑜庡Σ顒勬⒑閺傘儲娅呴柛鐔跺嵆閹柉銇愰幒鎾跺幈闂侀潧顦伴崹鐢碉拷姘煎弮閹敻骞掑Δ浣叉嫼闂佺厧顫曢崐鏇㈠几閹寸姷纾兼い鏃傚帶椤掋垽鏌￠崨鐗堢【閾绘牠鏌涘☉鍗炲箻妞ゆ柨娲娲川婵犲嫧妲堥梺鎸庢磸閸庨亶鍩㈠澶嬪亹缂備焦顭囬崢钘夆攽閳藉棗鐏ユ繛鍜冪秮閺佸秴顓奸崱鎰盎闂佸啿鎼崯顐﹀储閹绢喗鐓欐い鏃囧亹缁夎櫣锟借娲栭悥鍏间繆閹间礁唯鐟滃繘濡堕柨瀣╃箚闁绘劦浜滈敓濮愬�濆畷鎴﹀箻鐠囪尙顔嗛梺璺ㄥ櫐閹凤拷
					if (TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID)||TaskDlgUtil.existTask(roleid, WinnerManager.WINNER_TASK_ID_ACCEPT)){
						WinnerManager.getInstance().abandonWinnerTask(roleid);
					}
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒绱濋梻浣芥〃缁�浣肝涘┑瀣摕闁挎繂顦粻娑欍亜閺冨倸甯跺┑鈩冩そ濮婅櫣绮欏▎鎯у壉缂備浇顕ч悧鎾愁嚕鐠囧樊鍚嬮柛鈩兠～锟犳⒑鐟欏嫷鍟忛柛鐘崇〒缁絽螖閸涱喒鎷洪梺鍛婄缚閸庡崬鈻嶉幇鐗堢厵濡炲楠搁崢鎾煛瀹�瀣М闁诡喓鍨藉畷顐﹀Ψ瑜忛崢鎺戔攽閻橆偅濯伴柛鏇炵仛閻や礁螖閻橀潧浠﹂柛鏃�鐟ラ悾鐑藉Ω閿斿墽鐦堥梺鍛婂姀閺呮繆銇愰崸妤佲拻濞达綀娅ｇ敮娑㈡煥濮樿京妫紓浣靛灩瀵噣鏌曢崱妤佸殗闁诡喗绮撻幊鐐哄Ψ閵夈倕瀵查梻鍌欑劍閹爼宕曢鐐茬鐎癸拷閿熻棄顕ユ繝鍕＜婵☆垶鏅茬花璇差渻閵堝棗濮﹂柛鎾存皑閿熻姤鐔幏锟�
					WinnerManager.getInstance().createWinnerTask(WinnerManager.WINNER_TASK_ID,roleid,npc,SpecialQuestState.UNDONE,0,task.getSumnum());//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟宕导瀛樺剹婵炲棙鎸婚悡娆撴倵閻㈡鐒鹃崯鍝ョ磼閹冪稏缂侇喗鐟╁濠氭偄閻撳海鐣鹃悷婊勭矒瀹曠敻鎮㈤幖鐐扮盎闂佸啿鎼崯顐﹀储閹绢喗鐓欐い鏃囧亹缁夎櫣锟借娲栭悥鍏间繆閹间礁唯鐟滃繘濡堕柨瀣╃箚闁绘劦浜滈敓濮愬�濆畷鎴﹀箻鐠囪尙顔嗛梺璺ㄥ櫐閹凤拷
					WinnerManager.getInstance().addWinnerRole(roleid);//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晢濞达絿鎳撻崜鐢电磽閸屾瑧绛忛柟椋庡厴閺屾盯骞囬棃娑欑亶闂佺粯鎸鹃崰鎰┍婵犲浂鏁嶆繝鍨姇濞堫厾绱撴担鐟扮祷妞ゎ厾鍏樺濠氭晸閻樻彃绐涘銈嗗笒閸婂鎮￠幘缁樷拺閻犲洠锟借櫕鐏堢紓鍌氱Т閿曘倝鎮鹃悜钘夐唶闁哄洨鍊ｉ埡鍛叆闁哄啫鍊藉鍛婁繆閹绘帞鍩ｆ慨濠勭帛閹峰懏绗熼婊冨Ъ闂備浇宕甸崳銉︾椤忓嫮鏆﹂柛顐ｆ礀鎯熼梺闈涱槶閸庨亶藟婢舵劖鈷掗柛灞剧懅椤︼箓鏌熷ù瀣舵嫹鐡掍焦妞介弫鍐磼濮橆剙浜堕梻浣稿悑缁佹挳寮插鍜冩嫹濮橆剦鐓奸柡宀嬬秮瀵剟宕归钘夛拷顖炴⒑缁嬪尅鍔熼柡浣割煼瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
					MessageMgr.psendMsgNotifyWhileCommit(roleid, 140666, npc.getNpcID(), Arrays.asList(task.getSumnum()+"",npc.getName()));
					
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姳鍗抽弻鐔兼⒒鐎靛壊妲紓浣哄Х婵灚绌辨繝鍥舵晬婵犻潧瀚搁幏鐑芥晸娴犲鐓涢悗锝庝簽鏁堝Δ鐘靛仦閻楁洝褰佸銈嗗釜閹峰嘲鈹戦垾鑼煓闁哄苯绉归弻銊э拷锝庡亜绾炬娊姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘礀閹冲繐鈻撻搹鍦＝闁稿本鐟х粵蹇涙煙瀹勬澘妲婚柍瑙勫灴閹晠骞撻幒婵呯磻缂備焦鍎虫晶浠嬪储瑜旈垾锕傚锤濡や礁娈濋悗鐢靛椤ㄥ繑绂嶉鍫濈畺婵鎷烽柟顔规櫇缁辨帒螣閻撳骸绠為梻鍌欑窔濞佳団�﹂崼銉ョ？闂侇剙绋侀弫鍡涙煏韫囧鐏痪鎯с偢閺屾稓浠﹂崜褉妲堝┑鐐存儗閸犳牠鍩為幋锔芥櫖闁告洦鍋勯獮瀣節绾板纾块柛蹇斏戞穱濠囨倻閼恒儲娅囬梺璺ㄥ枍缁瑩骞嗛崘顔嘉╅柍鍝勫�甸幏缁樼箾鏉堝墽绉繛鍜冪悼閺侇喖鈽夊杈╋紲濡炪倖姊归崕鎶藉煝閸澁鎷风憴鍕缂傚秴锕濠氬幢濡ゅ﹤鎮戦梺鍛婁緱閸犳稓娆㈤姀銈嗏拻濞达綀娅ｇ敮娑㈡煛鐏炶濮傛鐐搭殔椤劑宕煎┑鍫濆箣闁诲骸绠嶉崕閬嵥囨导瀛樺亗闁告劦鍠楅悡鍐级閻愭潙顥嬫い锔肩畵閺岋繝宕卞Ο鑽ゎ槶缂備浇椴哥敮锟犵嵁婢跺矉鎷烽敐搴′簻妞ゅ骏鎷�
					WinnerRecord record = WinnerManager.getInstance().teams.get(team.getTeamId());
					if(record!=null){
						record.setTeamScore(0);
						record.setRound(0);
						//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴姘舵濞存粌缍婇弻娑㈠箛閸忓摜鏁栭梺娲诲幗閹瑰洭寮婚敐澶婎潊闁靛繆鏅濋崝鎼佹⒑閽樺鏆熼柛鐘查叄閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘挻鐓熼柣鏂挎憸閹虫洜绱掗悩铏磳妤犵偛鍟～婊堟晸娴犲绠栨繛鍡樺姈婵挳鏌涢幇銊︽珦闁跨喕濮ら〃濠傤潖濞差亜宸濆┑鐘插暟閸欏棝鏌ｆ惔銏犲毈闁告挾鍠栧畷娲Ψ閿曪拷缁剁偤鏌熼柇锕�骞楁繛鍛灲濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻鐔兼⒒鐎垫瓕绐楅梺杞扮鐎氼剟鈥︾捄銊﹀磯濠靛倹鏋荤换婵嬪极閹邦厼绶為悗锝庡亝閻濇洟姊绘担钘壭撻柨姘亜閿旇法鐭欑�规洜鏁绘俊鑸靛緞鐎ｎ亷鎷烽崹顐闁绘劘灏欐禒銏ゆ煕閺冿拷绾板秵绌辨繝鍥舵晝闁挎繂瀛╅悿渚�姊虹拠鈥虫灍闁挎洏鍨归悾鐑藉醇閺囥劍鏅㈡繛杈剧到閹碱偊鐛崼鐔虹瘈闁汇垽娼ф禒锕傛煕閵娿儳鍩ｉ柟顔惧厴閺屽棗顓奸崨顖ｆН婵＄偑鍊栫敮鎺楀磹閼姐倕顥氬┑鍌滎焾缁狙囨煕椤愶絿鈽夊┑陇娉曠槐鎺楁偐闂堟稐妲愰梺鍝勭焿缁蹭粙鍩ユ径鎰闁绘劕顕ぐ搴ㄦ煟鎼淬埄鍟忛柛鐘冲哺瀵偅绻濆顒傜暫婵炲濮撮鍡涘磻閵娾晜鐓曟い顓熷灥娴滄粍绻涢崨顐㈢仼闁宠鍨块幃鈺呭垂椤愶絾鐦庨梻浣侯焾椤戝洭宕戦妶澶屽祦闁圭増婢樼粻鐟懊归敐鍛喐闁汇倕娲ら埞鎴﹀煡閸℃浠撮梺闈涙４閹风兘姊洪崫鍕靛剰缂佸缍婇悰顕�寮介妸锔剧Ф闂佸憡鎸嗛崥閿嬪灴閺岋絾鎯旈姀銏╂殹閻庣櫢鎷烽柟闂寸閽冪喖鏌￠崶鈺佹灁闁绘繆鍩栭妵鍕冀閵娿劌顥濋梺鍝勬閸ㄨ崵妲愰幒妤佹櫢闁伙絽鐭夐幏鐑芥晲鎼粹剝鐏嶉梺缁樻尵閸犳牠鐛弽顬ュ酣顢楅敓浠嬫晸婵劕锟芥洟鈥﹂崶顒�绠涙い鎾跺Х閻﹀牓姊虹捄銊ユ瀺缂侇喗鐟ラ悾鐑芥倻缁涘鏅ｉ梺缁橆焽閺佹悂寮抽妷鈺傗拻濞达絼璀﹂悞楣冩煛閸偄澧寸�规洘妞藉畷姗�顢欓悡搴℃闂佺懓鍚嬮悾顏堝礉瀹ュ鍋傞柕澶涘缁犻箖鏌熺�甸晲绱虫い蹇撶墱閺佸倹銇勮箛鎾跺闁绘挾鍠栭弻銊モ攽閸♀晜啸闂佺灏欓崑鎾诲箞閵婏妇绡�闁稿被鍊楅崥瀣倵鐟欏嫭绀冮柨鏇樺灲閵嗕線寮崼婵堫槹濡炪倖甯掗崑濠囧箯閻戣姤鎯為柛锔诲幘閿涙繃绻涙潏鍓хɑ闁搞劍绻堝畷銉╊敃閿旂晫鍘遍柣搴秵閸撴瑦绂掕缁辨帡顢欓挊澶婃懙闂佸搫鑻Λ妤咁敇婵傜宸濇い鏍ㄨ壘鑲栭梻鍌氬�风粈渚�骞夐敓鐘茬妞ゆ帒瀚婵囥亜閺嶇數绋荤悮锟�
						WinnerManager.getInstance().removeLastTeamidAddNew(record,roleid);
					}
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閳哄倸浜滈梺鍛婄箓鐎氬懘鏁愭径瀣帗闂備礁鐏濋鍡楃暦瀹�鍕厸鐎癸拷鐎ｎ剛袦閻庢鍣崳锝呯暦婵傚憡鍋勯柛娑橈攻椤斿繘姊婚崒娆戭槮闁硅姤绮嶉崚濠囧箻椤旇偐顔嗛梺璺ㄥ櫐閹凤拷
					xbean.Properties prop=xtable.Properties.select(roleid); 
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						WinnerManager.clearActiveTeamWinnerScore(mem);//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佹儓缂佺姳鍗抽弻鐔兼⒒鐎靛壊妲紓浣哄Х婵灚绌辨繝鍥舵晬婵犻潧瀚搁幏鐑芥晸娴犲鐓涢悗锝庝簽鏁堝Δ鐘靛仦閻楁粓宕氶幒妤佸仭闁规鍠栭獮锟介梻鍌欑劍閸庡磭鎹㈠Δ鍜冪稏濠㈣泛鐭夐幏宄邦潩椤撶偛鎽甸梺鍝勭灱閸犳挾妲愰幒鎳崇喎煤椤忓嫭鏆┑鐘茬棄閺夊尅鎷烽弴銏犵疇闊洦绋戦悡鏇㈡煙閻戞﹩娈曢柣鎾存礃閵囧嫰骞囬崜浣瑰仹闂佸疇妫勯ˇ鐢稿蓟閿濆牏鐤�闁挎繂瀚崙鍦磽娴ｈ櫣甯涚紒璇茬墛閹便劑鏁撴禒瀣厓闁芥ê顦伴崵锟介梺璺ㄥ枙濡嫬顭囬敓鐘茶摕闁绘梻鈷堥弫宥嗘叏濮楀棗澧繛鍫濐煼閹鎲撮崟顒傤槶闂佸摜濮甸悧鐘诲Υ娴ｇ硶妲堟俊顖氱箰缂嶅﹪骞婂鍫濆瀭妞ゆ劑鍊ゅΣ顒勬⒒閸屾碍鎼愭い锔炬暬瀵鏁愭径濠勵啋闂佹儳娴氶崑鍛暦閹惰姤鐓涚�广儱绻掔弧锟藉┑顔硷攻濡炰粙鐛弽顓熷�烽柟缁樺俯閻庡瓨绻濆▓鍨灍閼垦囨煕閺傚潡顎楅崡閬嶆煙閹殿喖顣奸柡鍛倐閺屻劑鎮ら崒娑橆伓?
						MessageMgr.sendMsgNotify(mem, 170019, Arrays.asList(prop.getRolename()));
					}
					WinnerManager.logger.info("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹 "+roleid+"\t闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒绱濋梻浣芥〃缁�浣肝涘┑瀣摕闁挎繂顦粻娑欍亜閹哄秶鍔嶉柛搴㈡尵缁辨挻绗熸繝鍐伓闂備礁鎲￠崝锕傚窗濡ゅ懏鍋傞柣鏃堟櫜缁诲棙銇勯弽銊х闁搞倖鐟х槐鎺楀箵閹烘繄鍚嬮梺鍝勭焿缁绘繂鐣烽妸鈺婃晢闁稿本绮庨崢顖炴⒒娴ｇ瓔鍤冮柛鐘崇墱缁辩偞绻濋崒婊勬闂佸壊鍋呭ú鏍ㄥ劔闂備焦瀵у濠氭惞鎼粹垾锝夊醇閺囩啿鎷绘繛杈剧导鐠�锕傛倿妤ｅ啯鐓熼柣鏇氭闁垳锟借娲滈崰鏍�佸Ο娆炬Ъ缂備椒绶￠崑濠傤潖濞差亝鍤掗柕鍫濇啗閵忥紕绠鹃悹鍥囧懐鏆㈤梺闈涙处閸旀瑥鐣峰锟介、姘跺幢濞嗘垟妫ㄩ梻鍌欑窔濞佳囨偋閸℃蛋鍥ㄥ鐎涙ê浜楅梺闈涱檧婵″洨绮绘ィ鍐╃厵閻庣數顭堥敓鑺ョ墵楠炲鈹戦幘鐧告嫹閸啔褰掓偂鎼达絾鎲奸梺缁樻尰濞茬喖寮婚弴鐔虹瘈闊洦娲滈弳鐘绘⒑閸涘﹦绠氭繛鍜冪秮閺佹捇宕愰悤浣圭秷濠电偞绁撮弲鐘荤嵁韫囨稒鏅搁柨鐕傛嫹?");
				}else{
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愯ぐ鎺戠；閻庯綆鍋傜换鍡涙煏閸繃鍣归柡鍡欏枛閺岋綁顢橀悢绋跨濡炪値浜滈崯浼存晸閺傘倗绉靛ù婊勭箞楠炴垿鏁愰崶鈺傦紡闂佽鍨庢担闀愬垝闂備礁鎼惌澶岀礊娴ｅ壊鍤曟い鎺戝閸ㄥ倹銇勯弴鐐村櫤婵炲牏鍎ゆ穱濠囨倷椤忓嫸鎷烽弴鐘冲床闁归偊鍓涢弳锔姐亜閹烘垵顏紒鐘冲浮濮婄粯鎷呴搹鐟扮闁活亜顦甸幃褰掓晸娴犲鏅濋柛灞捐壘閹偛鈹戦悙鍙夘棞缂佽妫濆銊╂嚍閵夛絼绨婚梺鍝勬川閸嬬偤藟閻愮儤鍊垫慨妯煎亾鐎氾拷
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閳哄倸浜滈梺鍛婄箓鐎氬懘鏁愭径瀣帗闂備礁鐏濋鍡楃暦瀹�鍕厸鐎癸拷鐎ｎ剛袦閻庢鍣崜鐔风暦瑜版帩鏁婇柦妯侯檧閹风兘顢涘锝嗘杸濡炪倖娲栧Λ娑氱矓閸洘鐓欓柛鎴欏�栫�氾拷
					xbean.Properties prop=xtable.Properties.select(roleid); 
//					long teamleadid=team.getTeamLeaderId();
//					MessageMgr.sendMsgNotify(teamleadid, 160449, Arrays.asList(prop.getRolename()));
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣椤愪粙鏌ㄩ悢鍝勑㈢痪鎯ь煼閺屾稑鈽夐崡鐐插濠电偛鐨烽弲鐘诲蓟閺囩喓绠鹃柣鎰靛墯閻濇洟姊虹粙娆惧剰闁稿﹤娼″濠氬Ω閳哄倸浜滈梺鍛婄箓鐎氬懘鏁愭径瀣帗闂備礁鐏濋鍡楃暦瀹�鍕厸鐎癸拷鐎ｎ剛袦閻庢鍣崳锝呯暦婵傚憡鍋勯柛娑橈攻椤斿繘姊婚崒娆戭槮闁硅姤绮嶉崚濠囧箻椤旇偐顔嗛梺璺ㄥ櫐閹凤拷
					List<Long> teamMembers = team.getNormalMemberIds();
					for (Long mem : teamMembers) {
						MessageMgr.sendMsgNotify(mem, 160449, Arrays.asList(prop.getRolename()));
					}
					
				}
				return true;
			}
			
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795484;

	public int getType() {
		return 795484;
	}

	public int acceptflag; // 0表示取消    1表示接受

	public CWinnerChangeTask() {
	}

	public CWinnerChangeTask(int _acceptflag_) {
		this.acceptflag = _acceptflag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(acceptflag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		acceptflag = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CWinnerChangeTask) {
			CWinnerChangeTask _o_ = (CWinnerChangeTask)_o1_;
			if (acceptflag != _o_.acceptflag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += acceptflag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(acceptflag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CWinnerChangeTask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = acceptflag - _o_.acceptflag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


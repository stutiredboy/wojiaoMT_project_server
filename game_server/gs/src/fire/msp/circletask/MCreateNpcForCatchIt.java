
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亜顒㈡い鎰Г閹便劌顫滈崱妤�鈷掗梺缁樺笂缁瑩寮婚妶鍡樺弿闁归偊鍓ㄩ幏鐑藉冀椤愵剚瀚规慨姗嗗墻閻撳ジ鏌″畝瀣М鐎殿噮鍣ｅ畷鎺戭潩椤戣法甯涚紓鍌氬�风欢銈夊箯瀹勯偊鐔嗛悹楦挎閻掑潡鏌熸搴″幋闁绘侗鍣ｅ畷褰掝敊閻撳寒娼涘┑锛勫亼閸娧呯磽濮樺崬鍨濇繛鍡楁禋閸ゆ洘銇勯幇鍓佺暠妤犵偑鍨烘穱濠囶敍濠靛棔姹楅梺浼欑畱閻楁挸顫忔繝姘＜婵ê宕·锟界紓鍌欑椤戝棛鏁敓鐘靛祦闁哄稁鍘肩粻娑欍亜閺傚灝鈷旈柨娑欑矒濮婃椽宕ㄦ繝鍐ㄧ煯缂備緤鎷峰ù锝呮贡椤╃兘姊洪锟界粔鐢告偂濞戙垺鍊堕柣鎰絻閳锋梹绻涢幓鎺濆殶闁跨喕濮ら鏍窗濡ゅ懎绠伴柧蹇ｅ亗缁诲棝鏌熼梻瀵割槮閸烆垶姊洪幐搴⑩拹闁稿孩濞婇幏蹇曪拷锝庡枟閳锋帡鏌涚仦鍓ф噮妞わ讣绠撻弻鐔兼嚍閵壯呯厜閻庤娲滄晶妤呭箚閺冨牆鐒鹃柟顖炲亰濞兼劖銇勯敂鎯ь暭闁诡垱妫冩慨锟介柍鍝勫�荤粙鎰版⒒閸屾瑦绁版い顐㈩槸閻ｅ嘲顫滈敓浠嬨�佸鎰佹Ь缂備緡鍠栭悧鎾崇暦濮楋拷椤㈡瑩鎮剧仦钘夌濠碉紕鍋戦崐鏍偋閺囩倣娑樜旈崘鎸庡婵鍘ч弸鐔虹磼閸屾氨效闁硅櫕绮撻幃浠嬫偨閻㈠灚顫岀紓鍌欑婢ц姤鏅跺Δ鍛櫇妞ゆ劧绠戠粻顖炴煟閹达絾顥夌紒锟介崘顔界厾缁炬澘宕晶鎾煟濞戞瑦宕屾慨濠勭帛閹峰懐鎲撮崟顐″摋闂備礁鎲￠弻銊╂儗閸岀偛绠栨俊顖濄��閺�浠嬫倵閿濆懎顣崇紒瀣箻濡懘顢曢姀鈥愁槱缂備礁顑嗛崹鍧楀蓟閵娾晛围闁糕剝娲滅粻姘舵⒑闂堟稓澧曢悗姘煎灦瀹曟鐣濋崟顒傚幈濠电偛妫楃换鎴λ夐姀鈩冨弿濠电姴鎳忛鐘绘煙閻熸澘顏┑鈩冩倐婵＄兘鏁傞幆褏绋堥梻鍌氬�烽懗鍫曞箠閹捐鍚归柡宥庡幖缁狀垶鏌ㄩ悤鍌涘?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢幘鑼槮闁搞劍绻冮妵鍕冀椤愵澀娌梺绋款儜缁辨洟骞夊宀�鐤�闁哄洨鍋涢悘濠冪節閻㈤潧孝婵炶绠撳畷鏇炵暆閸曨剛鍘卞銈嗗姉婵挳宕濆鍫熺厓闂佸灝顑呯粭鎺楁婢舵劖鐓ユ繝闈涙閸ｆ椽鎮归幇銊ュ⒉缂佺粯绻堥弫鎾绘嚍閵壯屾祫闁诲函缍嗛崑鍡涘储闁秵鈷戦柛婵嗗閿熷�熸閳绘棃寮撮姀鈥筹拷鍫曟⒑椤掞拷缁夌敻鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦柛娑橈工閻忋儳绱撳鍜冨伐闁伙絽鍢查…銊╁礃閿濆棛锟藉姊洪崷顓℃闁搞劋绮欓獮蹇涙倻閼恒儲娅囬梺绋挎湰濮樸劑宕愰悙宸富闁靛牆楠告晶濠氭煕閹剧澹橀摶鐐烘煕閹扳晛濡块柡鍡畵閺屾洘绻涢悙顒佺彟闂佽桨绀佸ú顓㈠蓟閿濆绠涙い鎺炴嫹缂佺嫏鍥ㄧ厸闁糕剝顨堢粻缁樻叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欐祰椤曟牠宕伴弽顓熷亯闁绘挸娴烽弳锕傛煛閸モ晛啸缁炬儳鍚嬫穱濠囶敍濮橆叀纭�缂備胶濮靛畝绋款潖濞差亜绠归柣鎰絻婵姊洪崫鍕櫤缂佽鐗撻獮鍡楃暆閸曨偆顔掔紓鍌欑劍閿氶柨鐔烘櫕閺佽顫忔繝姘唶闁绘棁銆�濡俱劑姊虹憴鍕祷闁硅姤绮撻幆锟芥い蹇撶墕閻鏌曟竟顖氭噽閸橆垶姊绘担鍛婃儓閻炴凹鍋婂畷婵嬪箣閿曪拷缁犳牠鏌曢崼婵愭Ц缁炬儳鍚嬬换娑㈠箣閻戝洣绶垫繛瀵搞�嬮幏锟�?
				if (teamnum > 0) {
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐礃椤曆囧煘閹达附鍋愰柛娆忣槹閹瑧绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡灞诲姂瀵噣宕堕…鎴烆棄婵犵數鍋涢悧濠囧垂閸噮娼栨繛宸簻瀹告繂鈹戦悩鎻掓殭闁活収鍠氱槐鎾寸瑹婵犲啫顏跺┑鐐存尰閻旑剟骞忔搴嫹鐟欏嫭绀堥柟铏崌閸╃偤骞嬮敃锟介柋鍥ㄣ亜閹哄秶顦︽い蹇氭硾铻栭柣姗�娼ф禒婊堟煟韫囨梻绠炵�规洘绻傞～婵嬵敇濠婏拷缁ㄥ姊洪幐搴㈢叆闁诲繑绻傞悾鐢稿幢濞戞瑧鍘遍梺鍐叉惈閸婅煤閹绢喗鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?
					fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
					if (null == team || !team.isTeamLeader(roleid)) {
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(roleid, 140273, npcid, null);
						return false;
					}
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾椤懘鏌嶉妷銉ユ毐缂併劊鍎靛缁樻媴缁嬫妫岄梺绋款儎缁舵艾鐣烽弴鐔哥秶闁冲搫鍟伴悞鍏肩節閵忥絽鐓愰柛鏃�鐗犻幃鈥斥枎閹炬潙锟藉灚绻涢幋鐑嗕紗闁硅揪绠戠壕鍧楁煛閸ャ儱鐏柣鎾卞劜缁绘繈妫冨☉娆欑礊濠碘剝褰冪紞濠囧蓟閿熺姴宸濇い鏂垮⒔閻ゅ嫰姊洪崫鍕潶闁告梹鍨块獮鍐閵堝懐顦繛杈剧秬濞咃綁宕㈤鐐粹拻濞达絿鎳撻婊呯磼鐠囨彃顏�规洘鍨挎俊鍫曞幢濡搫浼庨梻浣芥硶閸犲秶鍒掑▎鎾宠摕闁哄洢鍨归柋鍥ㄧ節闂堟稒绁╂俊顐燂拷鏂ユ斀闁绘劕寮堕崳铏圭磼椤旇姤灏い顐㈢箰鐓ゆい蹇撳缁愭稒绻濋悽闈浶￠柤鍐插閹广垺绗熼敓钘夘潖濞差亜绠归柣鎰絻椤棝姊洪崨濠庢畷濠电偛锕悰顕�宕橀鑺ユ闂佺粯顭堢亸娆擃敇濞差亝鈷戦柟绋垮椤ュ棛鎮▎鎾寸厵闁汇値鍨遍鐘电磼鏉堛劍宕岀�规洘甯掗埢搴ㄥ箣濠靛棭鐎撮梻鍌欑劍鐎笛兠哄澶婄柧闁绘顕х粻鏍煟閹邦厾鏆橀柛瀣嚇閺屾盯骞囬妸锔界彇闂佸憡锕㈡禍璺侯潖濞差亜绀冮柛娆忣槹閸庢挸顪冮妶鍡楃仴婵☆偅鐩弫鎾绘嚍閵壯冩殹闂佺懓鍤栭幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫炵紓浣界堪閸婃繈寮诲☉婊庢Ъ濡炪們鍔岄幊鎰垝婵犳碍鍋愮紓浣诡焽閸樼敻姊洪崨濠冨瘷闁告侗鍘鹃濂告⒒娴ｄ警鐒鹃柨鏇樺�濋幃銉︾附缁嬭儻鎽曞┑鐐村灟閸ㄧ懓鏁俊鐐�栧濠氬储瑜旈敐鐐侯敂閸啿鎷虹紓鍌欑劍钃遍悘蹇曞缁绘盯鎳犻锟介弸娑氾拷娈垮枛椤攱淇婇幖浣哥厸闁稿本鐭花浠嬫⒒娴ｄ警鐒鹃柡鍫墰缁瑩骞嬮敂缁樻櫆闂佽法鍣﹂幏锟�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鍨傚Δ锝呭暙缁犳稑霉閿濆懏璐＄紒瀣╄兌缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�甸敓鏂ょ畵瀹曞爼鍩￠崘褏鐟濆┑掳鍊х徊浠嬪疮椤栫偞鍋傞柕澶嗘櫆閻撶喖鏌￠崒姘变虎妞わ絾濞婇弻锝夘敇閻旂儤鍣伴梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧伴柣锕�鐗撳鐑樻姜閹殿喖濡介梺瑙勭摃瀹曠數鍒掔�ｎ喖绠抽柡鍐╂尰鐎氬綊鏌ㄥ┑鍡涱�楀ù婊勭箖缁绘盯宕ㄩ銏紙濠殿喖锕ㄥ▍锝夊箲閸曨垰惟闁靛濡囪ぐ姘舵⒒娴ｇ儤鍤�闁搞倖鐗犻獮蹇涙晸閿燂拷
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
						sqinfo.setBigaward(posx1); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾鍞銈嗘婵倕鈻嶉崼銉︹拻濞达絽鎲￠崯鐐层�掑顓ф疁鐎规洘绻勯幑鍕附閼恒儲銇濇い銏℃瀹曠喖鐛姘闁绘挻娲樼换婵囩節韫囨柨顏堕梻浣哄帶閸熷潡鎮ラ悡搴ｆ殾婵犻潧妫涢弳瀣煙娴ｅ啯鐝柡鍌︽嫹闂備礁婀遍崕銈嗙箾婵犲倻鏆﹂柟鐗堟緲閸楁娊鏌曡箛鏇炐ラ柣銈呮喘閺岀喖宕楅懖鈺傛闂佸憡鏌ㄩ惉鑲╁垝閸儱绀冩い鏃傛櫕閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷?
						sqinfo.setSmallaward(posy1);
						sqinfo.setLastgiveuptime(0);
						sqinfo.setQuestid(questid);
						sqinfo.setNpcname(name);
						sqinfo.setQueststate(SpecialQuestState.UNDONE);
						sqinfo.setQuesttype(questtype);
						sqinfo.setQuestclass(CircTaskClass.CircTask_CatchIt);
						
						if (questtype == circTask.specialtask) {
							//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡灞革拷鎰佸悑閹肩补锟借尙鍑归柣搴ゎ潐濞叉﹢鎮￠敓鐘茶摕婵炴垯鍨归悞娲煕閹板吀绨存俊鎻掔墢缁辨帡鎮欓锟介崝銈嗐亜椤撶姴鍘寸�殿喖顭烽幃銏ゅ礂閼测晛濮洪梻浣瑰濞测晠骞忛悜鑺ョ厸閻庯綆鍓欓弸娑㈡煛瀹�瀣瘈鐎规洖宕灒闁兼祴鏅濋崢婊堟⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涘☉妤冪畾闂佺粯鍨兼慨銈夊疾閺屻儲鐓曟繛鎴濆船瀵箖鏌ｆ惔銊︽暠濞ｅ洤锕幃娆擃敂閸曡埖瀚归柟鐗堟緲閻ょ偓绻濋棃娑卞剰缂侊拷閸屾稒鍙忔俊銈咁儐鐎氱懓螖閻橀潧浠滈柛鐔稿▕婵＄敻骞囬弶璺唺闂佺懓顕慨鎾晸閻ｅ苯浠辨慨濠冩そ濡啫鈽夋潏鈺佸Ъ闂備胶顭堟鍝ュ椤撶姴鍨濆┑鐘插�婚弳瀣⒑椤撱劑妾悗闈涚焸濮婃椽妫冨☉姘暫婵°倗濮撮幉锛勭矉瀹ュ鍐�妞ゆ挾鍠撻崢杈ㄧ節閻㈤潧孝闁哥喐澹嗙划濠氭倷绾板瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋鐎殿噮鍋婇獮鍥敇閻愮數鐛┑鐘垫暩婵锟芥凹鍓熼悰顕�骞囬鑺ユ杸闂佺粯鍔橀崺鏍亹瑜忕槐鎺楀箵閹烘挸浠撮悗瑙勬礃濞茬喐淇婇懜闈涚窞濠电姴瀚弸锟芥繝鐢靛█濞佳囧磹閹间礁绠熼柨鐔哄У閸嬪倿鏌ｉ弬鍨倯闁绘挸绻橀悡顐﹀炊瑜濋弨缁樼箾閸涱厽鍤囬柡宀嬬秬缁犳盯寮撮悙鎰剁秮閺屾洟宕惰椤忣厾锟芥鍠楅幐铏繆閹间礁唯闁靛／鍛秮婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴炵瀹曟煡鏌熼悜姗嗘畷闁哄懏鎮傞弻锟犲磼濡尨鎷峰Δ鍐煋闁汇垹鎲￠悡鏇㈡煟濡櫣锛嶅褑浜槐鎺楊敊閼测晛鈪甸悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煃閵夈劍鐝柣搴ㄧ畺濮婄粯绻濇惔鈥茬盎濠电偠顕滄俊鍥╁垝濞嗘挸绠ｉ柨鏇嫹缂侊拷閸曨垱鐓熸俊顖濆亹鐢盯鏌ｉ幘瀛樼闁诡喗锕㈤幃娆撳级閹存繂袘闂備胶绮敮鐔硷綖婢跺鈹嶅┑鐘叉搐缁犵敻鏌熼悜妯荤叆闁愁亞鏁诲娲传閸曨厾浼囬梺鍝ュУ閻楃娀鎮伴锟介獮瀣晝閿熺晫绮诲☉娆嶄簻闁规崘娉涜ⅷ闂佽法鍠曟慨銈夊礉濞嗗浚娼栨繛宸簻瀹告繂鈹戦悩鎻掓殶闁告瑥妫楅—鍐Χ閸℃浠村┑鈽嗗亝閻╊垶鐛幋锕�顫呴柣姗嗗亝椤秹姊洪棃娑氱濠殿喚鍏橀、娆撳箳濡や礁锟界敻鎮峰▎蹇擃仾缂侊拷閿熻棄鈹戦悙鑼勾闁稿﹥绻堥獮鍐晸閻樺啿浜滈梺绋跨箳閸樠囨晸閻ｅ本鏆柟顔煎槻閳诲氦绠涢幙鍐х棯缂備礁澧介崑鎾诲箖閸岀偛钃熸繛鎴炵懄閸庣喖鏌曡箛瀣仼鐎殿喓鍔岃灃闁绘﹢娼ф禒婊勪繆椤愶絿绠撴い鏇秮椤㈡鎷呴悷鏉垮Τ闂備浇顫夐崕鎶芥偤閵娾晛绾ч柟闂寸劍閳锋帒霉閿濆浂鐒炬い銉ョ箻閺屾稓锟斤綆鍋勫ù顔撅拷瑙勬礃閸ㄥ灝鐣烽幒鎴叆闁告洖鐏氱紞妤佺節濞堝灝鏋熸い銊﹀姍楠炲繘鏌ㄧ�ｎ偄寮挎繝鐢靛Т閸燁垶濡靛┑鍫嫹鐟欏嫭澶勯柛瀣工閻ｇ兘鎮㈤悡搴＄�銈嗗姦閸嬫捇骞忛悜钘夊耿婵炴垶鐟㈤幏娲⒑閼姐倕鏋戞繝銏∶埢鎾诲煛閸涱喚鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�?
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
					// 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹仴妞ゎ偅娲熼弫鎾绘寠婢跺鎷烽崸妞硷拷浣割潩閼稿灚娅㈡繛瀵稿Т椤戝洤鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒婵℃煡浜堕弻锝夋偄閸濄儳鐓傛繝鈷�鍕垫畼闁轰緡鍣ｉ獮鎺懳旈敓浠嬪垂閸岀偞鐓曢悘鐐佃檸閸ゆ梻鎲搁悧鍫濈瑲闁稿鍊块獮鏍ㄦ綇閸撗吷戦梺瑙勫絻閵堢顫忛搹鍦煓婵炲棙鍎抽崜顒勬⒑閸濆嫭鍣虹紒瀣墵閹﹢宕橀瑙ｆ嫼闂佸湱顭堝ù椋庣不閹剧粯鐓欓柛鎰叀閸欏嫮锟芥鍠栭崯鍧楀煝鎼淬劌绠ｉ柣妯碱暜缁卞弶淇婇悙顏勶拷鏍礉閹达箑鍨傜紓浣股戝▍蹇涙⒒閸屾瑦绁版い鏇熺墵瀹曚即寮介銈囶槸婵犵數濮村ú銈囩不閸︻厽鍠愰柣妤�鐗嗙粭姘舵煕鐎ｅ墎绡�闁哄备鍓濆鍕節閸曨亣妾告俊鐐�ら崜娆徫涘┑鍡╂綎缂備焦蓱婵挳鏌ц箛鏇熷殌缂佹绱曠槐鎾存媴閾忕懓绗￠梺鍛婃⒐閻熲晠鎮伴璺ㄧ杸婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
					CatchItQuest.addCatchItQuestTimer(roleid, questid, questinfo.getId());
				}
				else {
					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽弫鎰緞鐎ｎ亙绨婚梺鑽ゅТ濞测晝浜稿▎鎾崇闁绘垼濮ら埛鎴︽偣閹帒濡奸柡瀣懃閳规垿顢欓崫鍕舵嫹濡ゅ懎鏋佹い鏇嫹闁搞劍鍎抽悾鐑藉炊閵婏富鍟庡┑鐘垫暩婵挳鏁冮妶鍥锋嫹濮樼厧骞楅柛鎺戯躬楠炴﹢顢欓悾灞藉箺闂備胶绮弻銊╁箹椤愶负锟藉倿宕楅崗鐓庡伎闂佹寧绻傞幊蹇涘箹閹扮増鐓冮悷娆忓閻忔挳鏌熼鐣屾噰闁硅櫕绮撳Λ鍐ㄢ槈濞嗘挻鏆樼紓鍌氬�搁崐鎼佸磹閸濄儳鐭欓柛鏇ㄥ灠缁狀垳锟界懓瀚竟瀣绩娴犲鐓熼柟閭﹀墮缁狙囨倵濮橆剚鍣界紒杈ㄦ尭椤撳ジ宕熼鐘靛床婵°倗濮烽崑娑樜涘Δ鍛仼婵犻潧顑嗛弲绋棵归悩宸剱闁哄懏鎮傞弻锟犲磼濡尨鎷峰Δ鍐煋闁汇垹鎲￠悡鏇㈡煟濡澧繛鍫熺矒閺屾盯鍩￠崒婊勫垱濡ょ姷鍋炵敮鎺曠亙婵炶揪绲介幖顐㈩嚕閹惰姤鈷掑ù锝堟鐢稒绻涢崣澶屽⒌鐎规洘鍔欏畷鐑筋敇閵婏箑顏跺┑顔筋焽閸嬫挾锟芥熬鎷�?
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
					sqinfo.setBigaward(posx1); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紩闂佽法鍠愰弸鑽ょ不閹惧磭鏆﹀┑鍌滎焾鍞銈嗘婵倕鈻嶉崼銉︹拻濞达絽鎲￠崯鐐层�掑顓ф疁鐎规洘绻勯幑鍕附閼恒儲銇濇い銏℃瀹曠喖鐛姘闁绘挻娲樼换婵囩節韫囨柨顏堕梻浣哄帶閸熷潡鎮ラ悡搴ｆ殾婵犻潧妫涢弳瀣煙娴ｅ啯鐝柡鍌︽嫹闂備礁婀遍崕銈嗙箾婵犲倻鏆﹂柟鐗堟緲閸楁娊鏌曡箛鏇炐ラ柣銈呮喘閺岀喖宕楅懖鈺傛闂佸憡鏌ㄩ惉鑲╁垝閸儱绀冩い鏃傛櫕閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷?
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
							//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柟缁㈠枟閸庡顭块懜闈涘缂佺嫏鍥ㄧ厱闁哄秲鍊曟晶鏌ユ倵濮橆剛绉洪柡灞革拷鎰佸悑閹肩补锟借尙鍑归柣搴ゎ潐濞叉﹢鎮￠敓鐘茶摕婵炴垯鍨归悞娲煕閹板吀绨存俊鎻掔墢缁辨帡鎮欓锟介崝銈嗐亜椤撶姴鍘寸�殿喖顭烽幃銏ゅ礂閼测晛濮洪梻浣瑰濞测晠骞忛悜鑺ョ厸閻庯綆鍓欓弸娑㈡煛瀹�瀣瘈鐎规洖宕灒闁兼祴鏅濋崢婊堟⒒娴ｅ憡鎯堥柡鍫墴閹嫰顢涘☉妤冪畾闂佺粯鍨兼慨銈夊疾閺屻儲鐓曟繛鎴濆船瀵箖鏌ｆ惔銊︽暠濞ｅ洤锕幃娆擃敂閸曡埖瀚归柟鐗堟緲閻ょ偓绻濋棃娑卞剰缂侊拷閸屾稒鍙忔俊銈咁儐鐎氱懓螖閻橀潧浠滈柛鐔稿▕婵＄敻骞囬弶璺唺闂佺懓顕慨鎾晸閻ｅ苯浠辨慨濠冩そ濡啫鈽夋潏鈺佸Ъ闂備胶顭堟鍝ュ椤撶姴鍨濆┑鐘插�婚弳瀣⒑椤撱劑妾悗闈涚焸濮婃椽妫冨☉姘暫婵°倗濮撮幉锛勭矉瀹ュ鍐�妞ゆ挾鍠撻崢杈ㄧ節閻㈤潧孝闁哥喐澹嗙划濠氭倷绾板瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋鐎殿噮鍋婇獮鍥敇閻愮數鐛┑鐘垫暩婵锟芥凹鍓熼悰顕�骞囬鑺ユ杸闂佺粯鍔橀崺鏍亹瑜忕槐鎺楀箵閹烘挸浠撮悗瑙勬礃濞茬喐淇婇懜闈涚窞濠电姴瀚弸锟芥繝鐢靛█濞佳囧磹閹间礁绠熼柨鐔哄У閸嬪倿鏌ｉ弬鍨倯闁绘挸绻橀悡顐﹀炊瑜濋弨缁樼箾閸涱厽鍤囬柡宀嬬秬缁犳盯寮撮悙鎰剁秮閺屾洟宕惰椤忣厾锟芥鍠楅幐铏繆閹间礁唯闁靛／鍛秮婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴炵瀹曟煡鏌熼悜姗嗘畷闁哄懏鎮傞弻锟犲磼濡尨鎷峰Δ鍐煋闁汇垹鎲￠悡鏇㈡煟濡櫣锛嶅褑浜槐鎺楊敊閼测晛鈪甸悗瑙勬礀閵堝憡鎱ㄩ敓浠嬫煃閵夈劍鐝柣搴ㄧ畺濮婄粯绻濇惔鈥茬盎濠电偠顕滄俊鍥╁垝濞嗘挸绠ｉ柨鏇嫹缂侊拷閸曨垱鐓熸俊顖濆亹鐢盯鏌ｉ幘瀛樼闁诡喗锕㈤幃娆撳级閹存繂袘闂備胶绮敮鐔硷綖婢跺鈹嶅┑鐘叉搐缁犵敻鏌熼悜妯荤叆闁愁亞鏁诲娲传閸曨厾浼囬梺鍝ュУ閻楃娀鎮伴锟介獮瀣晝閿熺晫绮诲☉娆嶄簻闁规崘娉涜ⅷ闂佽法鍠曟慨銈夊礉濞嗗浚娼栨繛宸簻瀹告繂鈹戦悩鎻掓殶闁告瑥妫楅—鍐Χ閸℃浠村┑鈽嗗亝閻╊垶鐛幋锕�顫呴柣姗嗗亝椤秹姊洪棃娑氱濠殿喚鍏橀、娆撳箳濡や礁锟界敻鎮峰▎蹇擃仾缂侊拷閿熻棄鈹戦悙鑼勾闁稿﹥绻堥獮鍐晸閻樺啿浜滈梺绋跨箳閸樠囨晸閻ｅ本鏆柟顔煎槻閳诲氦绠涢幙鍐х棯缂備礁澧介崑鎾诲箖閸岀偛钃熸繛鎴炵懄閸庣喖鏌曡箛瀣仼鐎殿喓鍔岃灃闁绘﹢娼ф禒婊勪繆椤愶絿绠撴い鏇秮椤㈡鎷呴悷鏉垮Τ闂備浇顫夐崕鎶芥偤閵娾晛绾ч柟闂寸劍閳锋帒霉閿濆浂鐒炬い銉ョ箻閺屾稓锟斤綆鍋勫ù顔撅拷瑙勬礃閸ㄥ灝鐣烽幒鎴叆闁告洖鐏氱紞妤佺節濞堝灝鏋熸い銊﹀姍楠炲繘鏌ㄧ�ｎ偄寮挎繝鐢靛Т閸燁垶濡靛┑鍫嫹鐟欏嫭澶勯柛瀣工閻ｇ兘鎮㈤悡搴＄�銈嗗姦閸嬫捇骞忛悜钘夊耿婵炴垶鐟㈤幏娲⒑閼姐倕鏋戞繝銏∶埢鎾诲煛閸涱喚鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�?
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
					// 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑鏅悷婊冪Ч濠�渚�姊虹紒妯虹仴妞ゎ偅娲熼弫鎾绘寠婢跺鎷烽崸妞硷拷浣割潩閼稿灚娅㈡繛瀵稿Т椤戝洤鐣垫笟锟介悡顐﹀炊閵娧�妾ㄩ梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒婵℃煡浜堕弻锝夋偄閸濄儳鐓傛繝鈷�鍕垫畼闁轰緡鍣ｉ獮鎺懳旈敓浠嬪垂閸岀偞鐓曢悘鐐佃檸閸ゆ梻鎲搁悧鍫濈瑲闁稿鍊块獮鏍ㄦ綇閸撗吷戦梺瑙勫絻閵堢顫忛搹鍦煓婵炲棙鍎抽崜顒勬⒑閸濆嫭鍣虹紒瀣墵閹﹢宕橀瑙ｆ嫼闂佸湱顭堝ù椋庣不閹剧粯鐓欓柛鎰叀閸欏嫮锟芥鍠栭崯鍧楀煝鎼淬劌绠ｉ柣妯碱暜缁卞弶淇婇悙顏勶拷鏍礉閹达箑鍨傜紓浣股戝▍蹇涙⒒閸屾瑦绁版い鏇熺墵瀹曚即寮介銈囶槸婵犵數濮村ú銈囩不閸︻厽鍠愰柣妤�鐗嗙粭姘舵煕鐎ｅ墎绡�闁哄备鍓濆鍕節閸曨亣妾告俊鐐�ら崜娆徫涘┑鍡╂綎缂備焦蓱婵挳鏌ц箛鏇熷殌缂佹绱曠槐鎾存媴閾忕懓绗￠梺鍛婃⒐閻熲晠鎮伴璺ㄧ杸婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
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


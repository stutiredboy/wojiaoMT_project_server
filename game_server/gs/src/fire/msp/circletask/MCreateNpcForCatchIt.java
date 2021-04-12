
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顖毿撻柟渚垮妼椤粓宕卞Δ锟介埛鎺楁⒑缂佹ê绗傜紒顔界懇瀵濡堕崱妯哄伎闂佸綊鍋婇崜銊╁箯閻戣棄鍐�妞ゆ劦鍓氱�氳鎱ㄥ鍡楀⒒闁绘挸銈搁弻鈥崇暆鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘埈娼╂い鎴ｆ硶鐢稓绱撻崒姘拷椋庢閵堝绠�瑰嫰鍋婇悢鍡涙偣妤︽寧顏犻柣鎺戞健閺岀喐顦版惔鈥冲箣闂佺粯渚楅崳锝呯暦瑜版帩鏁婇柣鎾冲瘨濞兼稑鈹戦敍鍕杭闁稿ě鍛＝婵ê宕崹婵囩箾閸℃绂嬮柛銈嗘礃閵囧嫰骞囬崜浣烘殸濡ょ姷鍋戦崹鐑樼┍婵犲浂鏁嶆繝闈涙濮规姊烘导娆戠暠闁绘鎸搁～蹇旂節濮橆剛锛滃┑顔矫畷顒劼烽敓鐣岀磽閸屾瑧顦︽い鎴濇閺侇噣鏁撻悩闈涚ウ闂佸搫绋侀崢鑲╃不濞戞瑣浜滈柡鍌氱仢閳锋棃鏌ㄥ☉娆戠煉婵﹥妞藉畷銊︾節閸愩劎鐓紓鍌欑筏閹峰嘲霉閿濆懏璐℃い鈺冨厴濮婃椽顢楅敓鐣岀矓閻㈠憡鍋傛繛鎴欏灪閸婂爼鏌ｉ幇顓炵祷闁抽攱姊圭换娑㈠箵閹烘繂娈堕梺璺ㄥ枙婵倝顢欓弽顓炵獥婵°倕鎳庣粻浼存煣韫囷絽浜楃紒璇叉閺岀喖姊荤�靛壊妲柛鐑嗗灦濮婃椽骞愭惔鈶╂嫻闂佺瀛╂繛濠囧箯韫囨洩鎷烽敐搴℃灍闁抽攱甯￠弻娑氫沪閸撗勫櫘濡炪倧璁ｇ粻鎾诲蓟閻斿吋鍤嶉柕澹懐鍘滈柣搴ゎ潐濞叉粍鏅跺Δ鍛畾闁哄啫鐗嗛悞楣冩煙椤栫偛浜版繛鍏煎姈閵囧嫰鏁傞幆褜鏆梺璇″灡濡啯鎱ㄩ敓浠嬫煃閸濆嫬锟借崵绮欓幇鐗堚拻闁稿本鐟︾粊鐗堛亜椤愩埄妲搁柣锝呭槻椤粓鏁撴禒瀣拷浣割潩閹颁焦鞋缂傚倷绶￠崰鏍偋閹惧磭鏆︽慨妤嬫嫹妞ゃ垺鐟╅幃鍓т沪閽樺顓兼繝纰夌磿閸嬫垿宕愰弽顓熷亱闁哄洨鍊ｅ☉妯滄棃宕橀幐搴☆伓濠殿喗顭囬崢褔寮搁悢铏圭＜闁稿本姘ㄦ晥闂佺娅曠划鎾诲箖娴犲鍋ㄩ柣銏犵仛椤瞼绱撻崒娆戭槮濠⒀嗗Г閺呰泛螖閸涱喗娅囧銈嗗姧缁犳垹绮婚鐐寸厽闁硅揪绲鹃ˉ澶岀磼閿熶粙宕橀鐣屽幘缂佺偓婢樺畷顒佹櫠閹绢喗鐓熸繛鎴炵懄瀹曞本鎱ㄦ繝鍕笡闁瑰嘲鎳愰幉鎾礋椤愨�虫憢闂傚倷绀侀幉锟犲蓟閵娾晜鍎楅柛宀�鍋涚粻鏍ㄤ繆椤栨縿锟斤拷闁猴拷娴犲鍊甸柨婵嗘噹椤ｅ磭绱掔�ｎ亞绠绘俊顐㈡嚇椤㈡洟濮�閳ユ剚妲辩紓鍌欑椤戝棝宕归崸妤�钃熼柕濞炬櫅鍥撮梺绯曞墲濞叉粎绮诲鑸碘拺闂傚牊绋撴晶鏇㈡倵濮樼厧鐏︾�规洘顨呴悾婵嬪礋椤掑倸骞堟繝鐢靛仜濡鎹㈤幋位澶愬閳╁啫寮挎繝鐢靛Т閹冲繘顢旈悩缁樼厵闁荤喐婢橀顓炩攽閳╁啯鍊愬┑锛勫厴閺佸倿骞嗚缁嬪牓姊婚崒姘拷鐑芥嚄閸洖绠犻柟鎹愵嚙閸氬綊鏌″搴″箹缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�妞ゆ劦婢�濞岊亪姊虹粙娆惧劀缂佽鲸娲熼獮澶婎潰瀹�锟介悿锟介梺鍝勬川閸嬫盯鎮樻繝鍐瘈闁汇垽娼у瓭濠电偠顕滅粻鎾崇暦閺囩偟鏆嗛柛鏇ㄥ墰閸樺崬顪冮妶鍡楀濠殿喗鎸冲畷婵嗩煥閸喓鍘撻梻浣哥仢椤戝懐绮幒妤侇梿濠㈣埖鍔栭悡銉︾節闂堟稒顥為柛锝嗘そ閹綊骞囬妸銉モ拤缂備胶绮换鍫ュ极閹剧粯鍤嶉柕澹本绁梺璇插嚱缂嶅棝宕戦崱娑樺偍闂侇剙绉甸埛鎴︽煕濠靛棗顏╅柨鐔凤拷鐔割棄闁崇粯妫冨鎾閳ョ鎷烽崼鏇熲拺妞ゆ帪鎷风紒澶屾暬閹繝濡烽埡鍌滃幗闂佸搫鍟ù鍌炲吹濞嗘垶鍋栨慨妯垮煐閳锋垿鏌涘☉姗堝伐闁诲繈鍎崇槐鎾愁吋閸滃啫浼愰梺浼欑到閸㈡煡鈥﹂妸鈺佺闁挎繂妫涢敓钘夘煼濮婃椽宕烽鈩冾�楅梺鎼炲妺缁瑩鐛箛娑欏�婚柤鎭掑劜濞呭洭姊虹粙鎸庢拱婵ǜ鍔戝畷鎰版倷瀹割喗瀵岄梺闈涚墕妤犲憡鏅舵繝姘厱闁瑰墽顥愭竟姗�鎽堕悙鐑樼厱闁规壋鏅涙俊鍧楁煛閸☆厾鐣甸柡灞炬礃缁绘盯鎮欓浣哄綗闂備浇妗ㄧ粈浣该洪銏犺摕闁挎繂顦粻娑欍亜閹虹偞瀚圭紓浣哄珡閸ャ劎鍘搁梺绯曞墲椤ㄥ牏绮荤紒妯诲弿濠电姴鍋嗛悡鑲╋拷瑙勬礃鐢帡鍩㈡惔銊ョ婵犻潧妫悗鎾⒒閸屾瑦绁版い鏇熺墵瀹曚即寮介鐔蜂函闂佺粯鎸稿ù鐑藉汲閿曞倹鐓涢柛銉㈡櫅鍟哥紒鐐劤閸氬绌辨繝鍥舵晬婵﹩鍙�绾拷缂傚倷鑳舵慨闈涚暆缁嬫娼栨繛宸簻缁犲綊鏌ｉ幇顓炵祷濠殿喖顦靛娲传閸曨剙娅ょ紓浣筋嚙閻楁捇鐛崱妤冩殕闁告洦鍋嗛鎺旂磽閸屾瑧鍔嶉柨姘舵煥閻旂儤娅曢柡浣筋嚙椤繑绻濆顒勫敹闂佺粯妫侀妴锟芥俊淇卞姂濮婅櫣鎲撮崟顐ょシ闂佺濮ょ划鎾诲箚閿熻姤銇勮箛鎾跺闁活厽顨婇弻鏇熺珶椤栨碍鍣介柛姗嗗灦濮婄粯鎷呴崨濠冨創闁荤偞鍑归崑濠傜暦濠靛绠ｉ柨鏇嫹缂佺姵鐗犻弻鏇㈠醇濠垫劖笑缂佺偓鍎抽崥瀣崲濞戙垹绠ｉ柣鎴濇矗缁跺灚绻涚�垫悶锟藉骞忛敓锟�?
				if (teamnum > 0) {
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙绀冩い鏇嗗洤鐓橀柟杈鹃檮閸嬫劙鏌涘▎蹇ｆЧ闁诡喗鐟х槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌＄仦璇插鐎殿噮鍣ｅ畷鍫曗�﹂幋鐑嗘濠电姷鏁搁崑娑㈡偋婵犲洤鍨傞柛顭戝櫘濞兼牗绻涘顔荤盎鐎瑰憡绻傞埞鎴︽偐閹绘帗娈梺娲诲弾閸犳氨妲愰幘瀵哥懝濠电姴鍟璺衡攽閻愬瓨灏伴柣鏃戝墴楠炲繑顦版惔顖涘閻熸瑥瀚粈鍫ユ煙閾忣偅宕岄柛鈺冨仱楠炲鏁冮敓浠嬫煁閸ャ劊浜滈柟鍝勭Ф椤︼附銇勮箛姘【閾绘牠鏌ｅ锟藉褎绂掑鍫熺厽闊洦姊荤粻鐐碉拷瑙勬礃缁诲倿锝炲┑瀣垫晣婵犲鎷风紒銊ヮ煼濮婃椽骞愭惔銏㈠弳闂佽绻戠换鍌炴偩閻㈢骞㈡繛鎴炵懅閸橀亶姊洪崘鍙夋儓闁稿﹨顕х叅闁圭虎鍠楅悡娑樏归敐鍫綈鐎规洖鐭傞弻鈩冩媴鐟欏嫬纾抽梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�?
					fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
					if (null == team || !team.isTeamLeader(roleid)) {
						fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(roleid, 140273, npcid, null);
						return false;
					}
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸妞ゎ偄鎳橀弻宥夊Ψ閵夈儲姣愮紓浣靛妸閸庨潧顫忕紒妯诲缂佸顑欏Λ宀勬⒑缁嬫鍎庣紒鑸佃壘閻ｇ兘寮撮悢鍝ョФ闂佸啿鎼崯浼存倿閸忚偐绡�闁靛骏绲介悡鎰版煕閺冿拷閻楃娀骞冮垾鏂ユ瀻闁圭偓娼欓敓钘夌仛缁绘盯骞嬮悜鍡曠礂闂佺鎻粻鎴犲閸ф鐓涢柛銉ｅ劚閻忣亪鏌ｉ幘鍗炲姕缂佺粯绻堝Λ鍐ㄢ槈濞嗘瑧绀婃繝纰樺墲瑜板啰绱炴繝鍥ц摕闁跨喓濮村婵囥亜閺傚灝鈷旈柣銈呭濮婃椽宕崟顕呮蕉闂佸憡姊归崹鍧楃嵁閸愵喖顫呴柕鍫濇噽椤︻厽绻涙潏鍓хК婵炲拑缍佸畷銏ゎ敍閻愮补鎷绘繛杈剧悼閹虫捇顢氬鍛＜閻犲洦褰冮顓狅拷瑙勬礃閸ㄦ寧淇婇崼鏇炲耿婵☆垰鎼导搴ㄦ⒒娴ｈ姤纭堕柛鐘茬Ф閸掓帒鈻庨幘瀹犳憰闂佸搫娲㈤崹褰掓煁閸ャ劎绡�闂傚牊绋掔粊鈺備繆椤愮噦鎷烽弬銉︽杸闂佺粯鍔曞鍫曞闯閾忓湱纾兼い鏃囧Г鐏忣厽銇勯銏㈢閻撱倖銇勮箛鎾愁仼缂佹劖绋掔换婵嬫偨闂堟刀锟犳煠閸愭彃顣抽柟骞垮灪缁楃喖鏁撻挊澶樻綎婵炲樊浜滅粻褰掓煟閹邦厼绲绘い顒�妫濆娲川婵犲孩鐣锋繝鐢靛仜閿曨亪鎮伴锟藉畷姗�顢欓懞銉︻仧闂備胶绮…鍫焊濞嗘搩鏁囨繛宸簼閳锋垿鏌熺粙鍨劉妞ゃ儱妫涢幃顔尖枎閹惧鍘甸梺姹囧�ら崹閬嶎敂閻樼數纾奸弶鍫涘妽瀹曞瞼锟借娲樼敮鎺楀煝鎼淬劌绠ｆ繝闈涙－閻庢挳姊婚崒娆戝妽閻庣瑳鍏犲搫顓兼径濠勬煣闂佺粯顭堥褏绮婚弽顓熺厽闁归偊鍘鹃弳姗�鏌涚�ｎ亝鍤囬柡灞剧洴楠炲洭濡搁敂鐣屽絿闂備礁鎲￠敃銏＄鐠轰警娼栨繛宸簻缁�鍐煕濞嗗浚妲归柛搴㈡尭椤啴濡堕崱妤冧淮濠碘槅鍋呴惄顖炲极閹剧粯鍤嶉柕澹啯娈归梻浣烘嚀閸ゆ牠骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鈽夊搴⑿俊鐐�戦崝宀勫箠閹邦喖鍨濆┑鐘崇閸嬫劗绱撴担璇＄劷闁告鏁诲娲川婵犲啫鐦烽梺鍛婁緱閸橀箖顢曟總鍛娾拻濞达絼璀﹂悞楣冩煥閺囨ê锟芥繈骞冮妷锔鹃檮缂佸鍎婚幗鏇炩攽閻愭潙鐏熼柛銊ф嚀閺侇喗淇婇悙顏勶拷鏍ь潖婵犳艾鍌ㄧ憸鏃堟晲閻愪警鏁傞柛顐ゅ暱閹疯櫣绱撻崒娆戝妽閽冮亶鎮樿箛鏇烆暭缂佺粯鐩幊鐘活敆閿熶粙寮稿☉姘炬嫹濞堝灝鏋涙い顓㈡敱娣囧﹪骞栨担鍝ュ幐闂佺鏈惌顔捐姳娴犲鈷掑ù锝勮閻掗箖鏌￠崼顐㈠缂侇喗鐟╅獮瀣晜缂佹ɑ娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�? 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閸ㄥ倸螖閿濆懎鏆欑紒鐘崇☉闇夐柨婵嗘噺鐠愶紕绱掔�ｂ晞鍏岀紒杈ㄦ崌瀹曟帒顫濋濠冨闁绘垼濮ら崐鍧楁煥閺囩偛锟界敻鏁撻弬銈囩暤鐎规洖鐖奸崺锟犲礃瑜忛悷婵嗏攽鎺抽崐褏寰婃禒瀣柈妞ゆ牜鍋為崑鍌炴煏婢跺棙娅嗛柣鎾跺枛閺岋繝宕掑鍙樿檸濡炪倧绲炬繛濠囧蓟閿濆鏁囬柣鏃傚劋閸ｄ即姊洪崫鍕槵闁跨喕妫勭壕顓㈠汲閸℃稒鍊甸柨婵嗛婢т即鏌ｉ敃锟介悧鎾愁潖閻戞ɑ濮滈柟娈垮枛婵′粙姊虹憴鍕憙鐎规洜鏁搁崚鎺旓拷锝庡枛缁犳娊鏌￠崘鈺傚鞍閻庢艾缍婇弻銊モ攽閸℃侗锟芥霉濠婂嫮绠栫紒缁樼洴瀹曘劑顢曢姀顫礄婵犳鍠栭敃銊モ枍閿濆绠查柛鏇ㄥ灠鎯熼梺闈涱檧婵″洩銇愬鑸碘拻濞达絿鍎ら崵锟介梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹
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
						sqinfo.setBigaward(posx1); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸閸烆垰顪冮妶鍡橆梿濠殿喓鍊曢埢宥夊醇閵夛腹鎷绘繛杈剧到閹诧繝宕悙灞傦拷鎺戭潩椤撗勭杹閻庤娲樼换鍕箲閸曨剛闄勯柤鎭掑劜閵囨繃銇勯姀鈩冾棃鐎规洜鍠栭悰顕�顢涘顓烆槱闂佺粯鎸诲ú妯兼崲濠靛洨绡�闊洦鏌ㄩ鍫曟⒒娴ｅ搫甯堕柛鐔锋健閹儵鎮℃惔锝嗘濠电娀娼уΛ娑㈠汲鐎ｎ喗鐓欏ù锝呭暞閻濐亪鏌￠崒锔藉闂傚倷绀佸﹢閬嶅磿閵堝棛绠惧┑鐘插�婚弳锕傛煙閻楀牊绶查柛妤佸▕閺屾洝绠涢弴鐐愩儵鏌ｉ妶鍛枠闁哄瞼鍠栧畷妤呮嚃閳哄倹顔冮梻浣告啞閺屻劑鎯夐懖鈺佸灊闁割偁鍎辩粈鍐┿亜閺冨倹娅曢柛娆忔濮婅櫣绱掑Ο鑽ゎ槬闂佺锕ゅ﹢閬嶆晸閼恒儳鍟查柟鍑ゆ嫹?
						sqinfo.setSmallaward(posy1);
						sqinfo.setLastgiveuptime(0);
						sqinfo.setQuestid(questid);
						sqinfo.setNpcname(name);
						sqinfo.setQueststate(SpecialQuestState.UNDONE);
						sqinfo.setQuesttype(questtype);
						sqinfo.setQuestclass(CircTaskClass.CircTask_CatchIt);
						
						if (questtype == circTask.specialtask) {
							//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌＄仦闈╂嫹閹颁礁鎮戦柟鑲╄ˉ閿熷�熷皺閸戝綊鏌ｆ惔銈庢綈婵炲弶锕㈤幃锟犳晸閻樿尪鎽曞┑鐐村灟閸ㄥ綊鎮炲ú顏呯厱闁规澘鍚�缁ㄥ瓨淇婇幓鎺斿ⅱ缂佽鲸甯￠幃娆擃敆閿熶粙宕濋妶鍡愪簻妞ゆ挾濮撮崢瀵革拷娈垮枛椤兘骞冮姀銈呯闁兼祴鏅涙慨娲⒒娴ｇ懓顕滄繛娴嬫櫊楠炲繘鎮滈懞銉у幐闁诲函缍嗛崜娆撳几濞戙垺鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剝鐏掗梺鍏肩ゴ閺呮繈宕㈠鍫熲拻濞达絽鎲￠幆鍫ユ煛閸偄澧撮柟顖氬椤㈡稑鈽夊Δ鍐暰闂備胶绮崹鍏兼叏閵堝鐤鹃柡灞诲劜閻撴洘绻涢幋婵嗚埞鐎殿噣绠栭弻锝嗘償閵婏附鏆犳繛锝呮搐閿曨亪骞冨▎鎿冩晜闁告洝鍩栫�氬綊鏌熼悧鍫熺凡闁汇倗鍋撶换婵嬫濞戝崬鍓扮紓渚婃嫹闁稿本绋掗崣蹇斾繆閵堝拋鍎愰悗姘辨嚀铻栭柣姗�娼ф禒婊堟煕閻旂鈻曞┑锛勬暬楠炲洭寮剁捄顭戝敽闂備胶鎳撻顓熸叏閹绢喗鏅搁柣锝呰嫰娴犺鲸鎱ㄦ繝鍐┿仢婵☆偄鍟埥澶嬫綇閳轰礁歇闂傚倷鑳堕…鍫燁殽閸濄儱顥氭い鎾跺Т閸ㄦ繂鈹戦悩鎻掞拷濠氬汲鐎ｎ喗鈷戞い鎾卞姂濡绢噣鎮楅棃娑氱劯婵﹥妞藉Λ鍐ㄢ槈濮橆剦鏆┑掳鍊楁慨鎾箟閿涘嫮鐭夌�广儱顦崘锟藉銈嗘尵閸犳捇宕㈡潏銊х瘈闁汇垽娼у瓭闂佸摜鍠愭竟鍡欏垝婵犳碍鍊风痪鏉款槹鐎氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻樻彃骞嬮悗娈垮櫘閸嬪﹪鐛崶顒夋晣闁绘劗鏁搁悰顔尖攽閻樺灚鏆╁┑顔碱嚟閿熻姤鍑归崜鐔兼偘椤曪拷楠炲洭顢栭懞銉︽澑闂備胶绮崝姗�宕洪弽顑句汗鐟滃繒妲愰幒妤�绠甸柟鐑樻尭娴犳挳鎮楃憴鍕婵炶尙鍠愭穱濠囨嚋闂堟稓绐炴繝鐢靛Т鐎氼噣寮搁敓鑺ョ節閻㈤潧鈻堟繛浣冲洤纾归柟闂寸缁犵喖鏌ㄩ悢鍝勑ｉ柛瀣�块弻锝夊棘閸喗鍊梺缁樻尭缁绘﹢鎮￠锕�鐐婄憸婵嬪绩缂佹绠鹃柛娑卞幗閸ゅ洭鏌″畝瀣К缂佺姵鐩鎾倷閹板墎绉柡灞炬礋瀹曟儼顦叉い蹇ｅ幘閿熻姤顔栭崰妤呭箰閾忣偂绻嗛柟闂寸鍞梺闈涳紡閸涱喚绉┑鐘茬棄閺夊尅鎷峰Δ浣瑰弿闁绘垼妫勭壕缁樼箾閹寸偟顣茬�规洘鐓￠弻鐔兼倻濮楀棙鐣烽梺鍝勬噺閹倿寮婚敓鐘茬＜婵☆垳灏ㄩ幏宄拔旈崘顏嗙厠闂佹眹鍨归幉锟犳偂閺囥垺鐓熸俊顖濇閿涘秴顭胯娴滎剛妲愰幒妤婃晩闁兼祴鏅涢埅鐢告倵鐟欏嫭绀�闁靛牆鎲￠幈銊╂晸娴犲鐓冮柕澶堝妽閻濐亪鏌ｆ惔銊х暫婵﹦绮换婵囨償閳ヨ尙鐩庢繝鐢靛仩椤曟粍淇婇崶鈺佸灊婵炲棙鎸哥粻锝夋煥閺囶亝瀚圭紓渚婃嫹闁告洦鍨遍悡鐔镐繆椤栨繂浜归悽顖涚洴閺岋綁骞樼�涙顦伴梺璇″枟閿曘垽骞冨▎鎾崇骇闁瑰瓨绻傝闂傚倷鑳剁划顖滄暜閻旂》缍栧璺侯儑閳瑰秴鈹戦悩鍙夋悙缂佺姷鏁婚弻鐔兼倻濡崵鍙嗛梺鎰佷簽閺佽顫忓ú顏勪紶闁告洦鍘炬导鍥⒑閸濄儱校闁绘濞�閹即顢氶敓浠嬬嵁鐎ｎ喗鏅濋柨鐔烘櫕缁鈽夊▎宥勭盎闂佽宕樺▔娑溾叿闂備浇娉曢崰鏇熸叏閵堝绀夋繛鍡楁禋濞兼牗绻涘顔荤盎鐎瑰憡绻傞埞鎴︽偐閹绘帗娈堕梺鍛婄懃濡鈥旈崘顔嘉ч柛鈩冾殘娴犳潙鈹戦埥鍡椾簼闁烩晩鍨堕悰顕�骞嬮敃锟介～鍛存煟濮楀棗浜濇い顐㈢Ч濮婃椽妫冨☉姘鳖唺婵犳鍠氶崗姗�銆佸▎鎾崇婵°倓绀侀敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柨鐔绘閳规垿鎮欓懠顒佸嬀闂佺锕ョ换鍫ョ嵁閸愵喗鏅搁柣妯哄暱娴滄粓姊虹粙璺ㄧ闁告鍥ㄦ櫢闁伙絽鏈弳顒勬煙椤旂厧妲婚柍璇叉唉缁犳盯骞欓崘褏妫紓鍌欑婢т粙宕戦幘璇茬畺闁稿瞼鍋涢拑鐔哥箾閹寸偟鎳勯柛搴ｅ枛閺屾洝绠涚�ｎ亞浠奸悗娈垮枔閸斿矁鐏冮梺缁橈耿濞佳勭濠婂嫪绻嗘い鎰剁悼缁犳挻銇勯弴顏嗙М妞ゃ垺顨嗛幏鍛存偡閺夊灝韦闂傚倷娴囬～澶愬磿閹惰姤鍋ら柕濞炬櫅缁狙囨煙闂傚鍔嶉柍閿嬪笒闇夐柨婵嗘祩閻掔偓銇勯妷銉х闁哄本绋撻敓鏂ょ秵閸嬪嫬霉椤旀拝鎷风憴鍕闁搞劌鐏濋悾鐑藉箳閹搭厾鍙嗛梺鍛婃礀閻忔氨绱炲Δ浣虹瘈婵炲牆鐏濋弸鐔搞亜閵婏箑濮嶆鐐茬箻閺屻劎锟斤綆鍋勫鎸庣節閻㈤潧孝闁哥噥鍨舵俊闈涒攽閸剚瀚归悷娆忓婢跺嫰鏌涚�ｎ亷宸ラ柣锝囧厴閹垽鎮℃惔锛勶拷顓烆渻閵堝棗濮﹂柛瀣崌楠炲繘鎮滈挊澶婅�垮┑鐐村灦閻熴垽骞忓ú顏呪拺闁煎鍊曢弸鎴炵節閵忊埗顏堝煝閹捐鐓涢柛娑卞枤閸樼敻姊洪崨濠傜仧闁稿﹥鐗滈敓鑺ョ啲閹凤拷?
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
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛淮濡炪値鍋呭ú鐔煎极閹剧粯瀵犲璺侯煭閹风兘宕稿纭锋嫹娴ｅ壊娼╅柤绋跨仛濞呫垺绻涚�电孝妞ゆ垵娲ら悾鍨瑹閿熶粙鎮￠锕�鐐婇柕濞э拷濡俱劑姊洪崫鍕櫤闁诡喖鍊垮濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屻倗鍠婇崡鐐测拻濠碘剝鐓℃禍鍫曞蓟閿濆鍋勯柛婵勫劤閻撳倹绻濋埛锟介崟鍨暭闂佽桨绶￠崳锝夌嵁閹烘嚦鏃堟晸娴犲鍨傞柛宀�鍋為悡鏇㈡倶閻愪絻妾搁柛銈嗘⒒閹叉悂鎮ч崼婵堢懖闂佺顑呴崐鍧楃嵁閺嶃劍缍囬柛鎾楀惙鎴︽⒑鐟欏嫬绲婚柕鍫㈩焾椤繘鎼归崷顓犵厯濠电偛妫欓崕鎶藉礈椤掑嫭鈷戦柛婵嗗閸ｈ櫣绱掔�ｎ偆澧甸柟顔斤耿瀹曟﹢顢欑憴锝嗗闂備礁婀遍…鍫澝规搴ｄ笉闁瑰墽绮悡娆撴煕閹邦厾鍙�闁告瑥瀚敓鑺ヮ問閸犳牠宕崸妤�鐓濋幖娣妼缁狅綁鏌ｅΟ纰辨殰缂佸崬寮舵穱濠囨倷椤忓嫸鎷烽弽顓炵闁硅揪绠戦崹鍌滅磽娴ｈ偂鎴濃枍韫囨稒鈷掗柛灞剧懄缁佺増銇勯弴鐔哄⒌鐎规洑鍗冲浠嬵敃閵堝浂妲稿┑鐘垫暩婵潙煤閵堝洨涓嶉柛锔诲幗閸犳劙鏌ｅΔ锟介悧鍡欑箔濮樿埖鐓曢悗锝呭缁★拷闂佸搫澶囬崜婵嗩嚗閸曨剛绡�闁告洦浜ｅ鍛婁繆閻愵亜锟姐倝宕滃▎寰稑鈹戦崱鈺傜稁缂傚倷鐒﹁摫濠殿垱鎸抽弻褑绠涢弴鐔锋畬缂備焦顨愮槐鏇犳閹惧瓨濯撮柧蹇曟嚀缁楋繝姊洪崨濠冣拹闁荤啿鏅犻幃浼搭敊鐠恒劎鏉稿┑鐐村灦閻燂箑鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
					CatchItQuest.addCatchItQuestTimer(roleid, questid, questinfo.getId());
				}
				else {
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎閻庢鍠栭…鐑藉极閹邦厼绶為悗锝庝簷缁ㄥ姊洪懡銈呅㈡繛娴嬫櫇娴滅鈻庨幘宕囶槷闂佺粯鍨兼慨銈夊煕閹达附鍋ｉ柟顓熷笒婵″ジ鏌＄�ｎ偆鎳冮柍瑙勫灴椤㈡瑩宕崟鑸靛婵°倕鎳庨弸浣广亜閺囶亝瀚归梺鎼炲妽閸庢娊鎮鹃悜钘夌倞闁靛瀵岄崯搴♀攽閻樺灚鏆╁┑顔芥尦閺佸啴濡堕崶閿嬪婵鍘ч獮妤呮煕閹烘埊韬鐐达耿椤㈡瑩鎮剧仦钘夌闂傚倷鑳剁划顖炲蓟閵娾晛绠规い鎰惰礋閿熻棄鍊垮畷妤呭礂閻撳骸浼庨梻浣瑰缁诲倿骞婅箛娑樼闁规壆澧楅悡鍐偡濞嗗繐顏╅柣蹇旀尦閺岀喖顢欓悾灞惧櫚闂佺娅曠划鎾澄涢崘銊㈡婵炲棙鎸婚弳妯肩磽閸屾艾锟芥悂宕愰幖浣哥９闁告縿鍎抽惌娆撴煕閺囥劌鐏犵紒鐙�鍨抽敓鐣屾嚀鐎氼厽绔熺�ｎ喖缁╁ù鐘差儐閻撶喖鏌熼柇锕�澧紒鐙欏洦鍊垫慨姗嗗墯閸ｇ晫绱掓潏銊﹀碍妞ゆ挸銈稿畷鐔碱敇閻橀潧搴婂┑掳鍊楁慨鐑藉磻濞戞娑樜旈崨顔间患濠电娀娼ч鍡涘疾缁嬫５褰掓偐瀹割喖鍓遍梺鍝勬噺閹倿寮婚敓鐘茬＜婵☆垳灏ㄩ幏宄拔旈崘顏嗙厠闂佹眹鍨归幉锟犳偂閺囥垺鐓熸俊顖濐嚙婢ь垱绻涢崼鐔虹煉闁哄本鐩崺锟犲磼濠婂嫬鍨辨俊銈囧Х閸嬬偟鏁幒鏇犱簷濠电偠鎻徊浠嬪箹椤愩埄鍤曢柟鎯板Г閳锋帒霉閿濆牊顏犻悽顖涚♁缁绘盯宕ｆ径灞解拰閻庤娲橀崝娆忕暦閻戠瓔鏁囬柕濠忕畱椤忚泛鈹戦绛嬬劷闁稿鎸鹃敓鑺ョ啲閹凤拷?
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
					sqinfo.setBigaward(posx1); //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑穿闂備浇娉曢崰鎰板几閼姐倗涓嶉柟鎯х－閺嗭箑鈹戦崒婊庣劸閸烆垰顪冮妶鍡橆梿濠殿喓鍊曢埢宥夊醇閵夛腹鎷绘繛杈剧到閹诧繝宕悙灞傦拷鎺戭潩椤撗勭杹閻庤娲樼换鍕箲閸曨剛闄勯柤鎭掑劜閵囨繃銇勯姀鈩冾棃鐎规洜鍠栭悰顕�顢涘顓烆槱闂佺粯鎸诲ú妯兼崲濠靛洨绡�闊洦鏌ㄩ鍫曟⒒娴ｅ搫甯堕柛鐔锋健閹儵鎮℃惔锝嗘濠电娀娼уΛ娑㈠汲鐎ｎ喗鐓欏ù锝呭暞閻濐亪鏌￠崒锔藉闂傚倷绀佸﹢閬嶅磿閵堝棛绠惧┑鐘插�婚弳锕傛煙閻楀牊绶查柛妤佸▕閺屾洝绠涢弴鐐愩儵鏌ｉ妶鍛枠闁哄瞼鍠栧畷妤呮嚃閳哄倹顔冮梻浣告啞閺屻劑鎯夐懖鈺佸灊闁割偁鍎辩粈鍐┿亜閺冨倹娅曢柛娆忔濮婅櫣绱掑Ο鑽ゎ槬闂佺锕ゅ﹢閬嶆晸閼恒儳鍟查柟鍑ゆ嫹?
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
							//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌＄仦闈╂嫹閹颁礁鎮戦柟鑲╄ˉ閿熷�熷皺閸戝綊鏌ｆ惔銈庢綈婵炲弶锕㈤幃锟犳晸閻樿尪鎽曞┑鐐村灟閸ㄥ綊鎮炲ú顏呯厱闁规澘鍚�缁ㄥ瓨淇婇幓鎺斿ⅱ缂佽鲸甯￠幃娆擃敆閿熶粙宕濋妶鍡愪簻妞ゆ挾濮撮崢瀵革拷娈垮枛椤兘骞冮姀銈呯闁兼祴鏅涙慨娲⒒娴ｇ懓顕滄繛娴嬫櫊楠炲繘鎮滈懞銉у幐闁诲函缍嗛崜娆撳几濞戙垺鐓涚�癸拷鐎ｎ剛鐦堥悗瑙勬礀瀹曨剝鐏掗梺鍏肩ゴ閺呮繈宕㈠鍫熲拻濞达絽鎲￠幆鍫ユ煛閸偄澧撮柟顖氬椤㈡稑鈽夊Δ鍐暰闂備胶绮崹鍏兼叏閵堝鐤鹃柡灞诲劜閻撴洘绻涢幋婵嗚埞鐎殿噣绠栭弻锝嗘償閵婏附鏆犳繛锝呮搐閿曨亪骞冨▎鎿冩晜闁告洝鍩栫�氬綊鏌熼悧鍫熺凡闁汇倗鍋撶换婵嬫濞戝崬鍓扮紓渚婃嫹闁稿本绋掗崣蹇斾繆閵堝拋鍎愰悗姘辨嚀铻栭柣姗�娼ф禒婊堟煕閻旂鈻曞┑锛勬暬楠炲洭寮剁捄顭戝敽闂備胶鎳撻顓熸叏閹绢喗鏅搁柣锝呰嫰娴犺鲸鎱ㄦ繝鍐┿仢婵☆偄鍟埥澶嬫綇閳轰礁歇闂傚倷鑳堕…鍫燁殽閸濄儱顥氭い鎾跺Т閸ㄦ繂鈹戦悩鎻掞拷濠氬汲鐎ｎ喗鈷戞い鎾卞姂濡绢噣鎮楅棃娑氱劯婵﹥妞藉Λ鍐ㄢ槈濮橆剦鏆┑掳鍊楁慨鎾箟閿涘嫮鐭夌�广儱顦崘锟藉銈嗘尵閸犳捇宕㈡潏銊х瘈闁汇垽娼у瓭闂佸摜鍠愭竟鍡欏垝婵犳碍鍊风痪鏉款槹鐎氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻樻彃骞嬮悗娈垮櫘閸嬪﹪鐛崶顒夋晣闁绘劗鏁搁悰顔尖攽閻樺灚鏆╁┑顔碱嚟閿熻姤鍑归崜鐔兼偘椤曪拷楠炲洭顢栭懞銉︽澑闂備胶绮崝姗�宕洪弽顑句汗鐟滃繒妲愰幒妤�绠甸柟鐑樻尭娴犳挳鎮楃憴鍕婵炶尙鍠愭穱濠囨嚋闂堟稓绐炴繝鐢靛Т鐎氼噣寮搁敓鑺ョ節閻㈤潧鈻堟繛浣冲洤纾归柟闂寸缁犵喖鏌ㄩ悢鍝勑ｉ柛瀣�块弻锝夊棘閸喗鍊梺缁樻尭缁绘﹢鎮￠锕�鐐婄憸婵嬪绩缂佹绠鹃柛娑卞幗閸ゅ洭鏌″畝瀣К缂佺姵鐩鎾倷閹板墎绉柡灞炬礋瀹曟儼顦叉い蹇ｅ幘閿熻姤顔栭崰妤呭箰閾忣偂绻嗛柟闂寸鍞梺闈涳紡閸涱喚绉┑鐘茬棄閺夊尅鎷峰Δ浣瑰弿闁绘垼妫勭壕缁樼箾閹寸偟顣茬�规洘鐓￠弻鐔兼倻濮楀棙鐣烽梺鍝勬噺閹倿寮婚敓鐘茬＜婵☆垳灏ㄩ幏宄拔旈崘顏嗙厠闂佹眹鍨归幉锟犳偂閺囥垺鐓熸俊顖濇閿涘秴顭胯娴滎剛妲愰幒妤婃晩闁兼祴鏅涢埅鐢告倵鐟欏嫭绀�闁靛牆鎲￠幈銊╂晸娴犲鐓冮柕澶堝妽閻濐亪鏌ｆ惔銊х暫婵﹦绮换婵囨償閳ヨ尙鐩庢繝鐢靛仩椤曟粍淇婇崶鈺佸灊婵炲棙鎸哥粻锝夋煥閺囶亝瀚圭紓渚婃嫹闁告洦鍨遍悡鐔镐繆椤栨繂浜归悽顖涚洴閺岋綁骞樼�涙顦伴梺璇″枟閿曘垽骞冨▎鎾崇骇闁瑰瓨绻傝闂傚倷鑳剁划顖滄暜閻旂》缍栧璺侯儑閳瑰秴鈹戦悩鍙夋悙缂佺姷鏁婚弻鐔兼倻濡崵鍙嗛梺鎰佷簽閺佽顫忓ú顏勪紶闁告洦鍘炬导鍥⒑閸濄儱校闁绘濞�閹即顢氶敓浠嬬嵁鐎ｎ喗鏅濋柨鐔烘櫕缁鈽夊▎宥勭盎闂佽宕樺▔娑溾叿闂備浇娉曢崰鏇熸叏閵堝绀夋繛鍡楁禋濞兼牗绻涘顔荤盎鐎瑰憡绻傞埞鎴︽偐閹绘帗娈堕梺鍛婄懃濡鈥旈崘顔嘉ч柛鈩冾殘娴犳潙鈹戦埥鍡椾簼闁烩晩鍨堕悰顕�骞嬮敃锟介～鍛存煟濮楀棗浜濇い顐㈢Ч濮婃椽妫冨☉姘鳖唺婵犳鍠氶崗姗�銆佸▎鎾崇婵°倓绀侀敓鐣屾暬閹嘲鈻庤箛鎿冧痪缂備緤鎷烽柨鐔绘閳规垿鎮欓懠顒佸嬀闂佺锕ョ换鍫ョ嵁閸愵喗鏅搁柣妯哄暱娴滄粓姊虹粙璺ㄧ闁告鍥ㄦ櫢闁伙絽鏈弳顒勬煙椤旂厧妲婚柍璇叉唉缁犳盯骞欓崘褏妫紓鍌欑婢т粙宕戦幘璇茬畺闁稿瞼鍋涢拑鐔哥箾閹寸偟鎳勯柛搴ｅ枛閺屾洝绠涚�ｎ亞浠奸悗娈垮枔閸斿矁鐏冮梺缁橈耿濞佳勭濠婂嫪绻嗘い鎰剁悼缁犳挻銇勯弴顏嗙М妞ゃ垺顨嗛幏鍛存偡閺夊灝韦闂傚倷娴囬～澶愬磿閹惰姤鍋ら柕濞炬櫅缁狙囨煙闂傚鍔嶉柍閿嬪笒闇夐柨婵嗘祩閻掔偓銇勯妷銉х闁哄本绋撻敓鏂ょ秵閸嬪嫬霉椤旀拝鎷风憴鍕闁搞劌鐏濋悾鐑藉箳閹搭厾鍙嗛梺鍛婃礀閻忔氨绱炲Δ浣虹瘈婵炲牆鐏濋弸鐔搞亜閵婏箑濮嶆鐐茬箻閺屻劎锟斤綆鍋勫鎸庣節閻㈤潧孝闁哥噥鍨舵俊闈涒攽閸剚瀚归悷娆忓婢跺嫰鏌涚�ｎ亷宸ラ柣锝囧厴閹垽鎮℃惔锛勶拷顓烆渻閵堝棗濮﹂柛瀣崌楠炲繘鎮滈挊澶婅�垮┑鐐村灦閻熴垽骞忓ú顏呪拺闁煎鍊曢弸鎴炵節閵忊埗顏堝煝閹捐鐓涢柛娑卞枤閸樼敻姊洪崨濠傜仧闁稿﹥鐗滈敓鑺ョ啲閹凤拷?
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
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰效婵狅拷娓氾拷濮婅櫣绱掑Ο铏逛淮濡炪値鍋呭ú鐔煎极閹剧粯瀵犲璺侯煭閹风兘宕稿纭锋嫹娴ｅ壊娼╅柤绋跨仛濞呫垺绻涚�电孝妞ゆ垵娲ら悾鍨瑹閿熶粙鎮￠锕�鐐婇柕濞э拷濡俱劑姊洪崫鍕櫤闁诡喖鍊垮濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屻倗鍠婇崡鐐测拻濠碘剝鐓℃禍鍫曞蓟閿濆鍋勯柛婵勫劤閻撳倹绻濋埛锟介崟鍨暭闂佽桨绶￠崳锝夌嵁閹烘嚦鏃堟晸娴犲鍨傞柛宀�鍋為悡鏇㈡倶閻愪絻妾搁柛銈嗘⒒閹叉悂鎮ч崼婵堢懖闂佺顑呴崐鍧楃嵁閺嶃劍缍囬柛鎾楀惙鎴︽⒑鐟欏嫬绲婚柕鍫㈩焾椤繘鎼归崷顓犵厯濠电偛妫欓崕鎶藉礈椤掑嫭鈷戦柛婵嗗閸ｈ櫣绱掔�ｎ偆澧甸柟顔斤耿瀹曟﹢顢欑憴锝嗗闂備礁婀遍…鍫澝规搴ｄ笉闁瑰墽绮悡娆撴煕閹邦厾鍙�闁告瑥瀚敓鑺ヮ問閸犳牠宕崸妤�鐓濋幖娣妼缁狅綁鏌ｅΟ纰辨殰缂佸崬寮舵穱濠囨倷椤忓嫸鎷烽弽顓炵闁硅揪绠戦崹鍌滅磽娴ｈ偂鎴濃枍韫囨稒鈷掗柛灞剧懄缁佺増銇勯弴鐔哄⒌鐎规洑鍗冲浠嬵敃閵堝浂妲稿┑鐘垫暩婵潙煤閵堝洨涓嶉柛锔诲幗閸犳劙鏌ｅΔ锟介悧鍡欑箔濮樿埖鐓曢悗锝呭缁★拷闂佸搫澶囬崜婵嗩嚗閸曨剛绡�闁告洦浜ｅ鍛婁繆閻愵亜锟姐倝宕滃▎寰稑鈹戦崱鈺傜稁缂傚倷鐒﹁摫濠殿垱鎸抽弻褑绠涢弴鐔锋畬缂備焦顨愮槐鏇犳閹惧瓨濯撮柧蹇曟嚀缁楋繝姊洪崨濠冣拹闁荤啿鏅犻幃浼搭敊鐠恒劎鏉稿┑鐐村灦閻燂箑鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
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


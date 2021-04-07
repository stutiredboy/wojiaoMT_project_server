
package fire.pb.battle.livedie;

import org.apache.log4j.Logger;

import fire.pb.PropRole;
import fire.pb.talk.MessageMgr;
import gnet.link.Onlines;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptInvitationLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptInvitationLiveDieBattle extends __CAcceptInvitationLiveDieBattle__ {
	@Override
	protected void process() {
		//缂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礃閹偤骞栧ǎ顒�濡奸柣顓燁殜楠炴牕菐椤掞拷婵¤偐绱掗幇顓ф疁闁哄备锟芥剚鍚嬮幖绮癸拷宕囶啈闂備胶顭堥鍌炲疾濞戞粎浜欓梻浣瑰缁诲倿骞婃惔銊ユ辈婵炲棙鎸婚悡鏇熺箾閸℃鐛滈柡锟芥繝姘厪闁搞儜鍐句純閻庢鍠曠划娆愪繆濮濆矈妾ㄩ梺鍝勬４缁绘繂顫忛搹鍦煓闁秆勵殢閿熻姤顨婇弻銊╁即閵娿倝鍋楅悗娈垮枛椤兘骞冮姀銈嗗亗閹艰揪绲块弳銏ゆ⒒娴ｅ憡璐￠柛搴涘�濆畷褰掑垂椤愶絽寮块柟鍏肩暘閸斿秹宕戦埄鍐瘈濠电姴鍊搁顏嗙磼閼哥數鍙�闁哄矉绲借灃濞达絿鎳撶壕鎶芥⒑缂佹ü绶遍柛鐘冲哺閺佹捇寮妶鍥┬ｉ梺璺ㄥ枔閻℃棃宕㈡ィ鍐ㄧ獥闁哄稁鍘肩粻鏍煟閹达絾顥夌紒鐙欏嫮绠鹃柛鈩冪懃娴滅偓绻涙潏鐐
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				Long hostid=xtable.Livedie2key.select(guestid);
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔戒氦闂傚倷绀侀幉锟犳偡閵夆晜鏅濋柕澶嗘櫅妗呴梺鍛婃处閸ㄤ即宕橀敓浠嬫⒑闂堟丹娑氫沪閻愵剦鍟囬梻鍌氬�烽懗鍫曗�﹂崼鐕佹闁归棿鐒﹂弲婵囥亜韫囨挾澧曢柦鍐枛閺屻劑鎮㈤崫鍕戙垽姊洪崡鐐村缂佺粯绻堝畷褰掝敃閵忕媭娼旈梺鍝ュ枎閹芥粎妲愰幘璇茬＜婵炲棙鍨垫俊钘夘渻閵堝啫濡奸柟铏耿閻涱喗绻濋崒銈嗗缓闂佽法鍠嶇划娆撳箖娴兼惌鏁婇柟鎯ф噺鐎氬綊鏌ㄥ┑鍡楀毐闁归鍏橀、姗�鎮╅崣澶屼邯闂備浇顕栭崰姘跺礂濡警鍤曢悹楦裤��閺嬪酣鏌ｉ幇闈涘缂佷緡鍣ｅ濠氬磼濮橆剨鎷烽悜鑺ュ�块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫熺箾鐎涙鐭嬬紒顔肩Ч瀵煡濡烽埡鍌楁嫼闁荤姵浜介崝灞解枍閹扮増鐓欓柛鎴欏�栫�氾拷
				if(hostid==null){
					return false;
				}
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(guestid,true).getName();
				if(hostname==null||guestname==null){
					return false;
				}
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(guestid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				
				//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚鍤曢柛顐ｆ礀闁卞洦绻涢幋鐏活亪鈥栫�ｎ喗鈷戠�规洖娲ㄧ敮娑欎繆椤愩垹鏆ｆ鐐插暙铻栭柛娑卞枟濞呮粓鏌熼懖鈺勊夐柨鐔凤拷鐔风毢闁烩晛閰ｅ缁樻媴缁涘娈紓浣虹帛閸ㄥ湱鍒掑▎鎾崇闁挎洩鎷烽柣鎾拷鎰佺唵闁兼悂娼ф慨鍥╃磼椤愩垻效闁哄瞼鍠栭獮鍡氼槻妞わ絽纾槐鎺楀箛椤撗勭暦缂備胶绮惄顖炲极閹版澘宸濇い鏃囧Г閸婄兘姊绘担鐟邦嚋婵炶闄勭粋宥夘敂閸喎浠掑銈嗘⒒閺咁偊鎮疯ぐ鎺撶叆闁绘柨澧庨惌娆撴煏閸℃洜顦﹂柍钘夘樀婵拷闁绘ɑ鐖犻崶銊у幈闂侀潧顦崹鍝勨枍閹剧繝绻嗛柤纰卞墮閸樺瓨鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸屾稒鐣奸梻浣圭湽閸╁嫰宕归弶妫垫椽顢橀悙鍨闂佸湱澧楀姗�宕橀敓钘夘渻閵堝棙灏甸柛瀣█楠炴寮撮姀鈾�鎷洪梺纭呭亹閸嬫盯宕濋幘顔界厱闁规儳顕幊鍥╋拷瑙勬穿缁插墽鎹㈠┑瀣闁挎棁娉曢惄搴ㄦ⒒娴ｅ憡鎯堢紒澶嬬叀瀹曟繃鎯旈妸锝忔嫹閸岀偛钃熼柕澶涘閸橀亶鏌熼懖鈺勊夋俊鎻掑閻擃剟顢楅崒锔藉婵炲牆鐏濋弸娑㈡煟閺嵮佸仮鐎规洘妞介崺鍕礃閳轰緡锟芥捇姊洪懡銈呮灈闁稿锕ゅ嵄閺夊牄鍔庣弧锟介梺姹囧灲濞佳囶敁閹剧粯鐓欏瀣閸樻挳鏌＄仦璇插闁诡喓鍊濆畷鎺戔槈濮楀棔绱�
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				if(hostliveDieRoleInfo==null){
					return false;
				}
				if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
					logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾瑜嶇�氼噣鎮鹃幎鑺モ拻闁稿本鐟чˇ锕傛煙濞村鎷烽幇浣圭稁婵犵數濮甸懝鍓х玻濡ゅ懎绠归柟纰卞幘閸樻盯鏌℃担闈╄含闁绘搩鍋婂畷鍫曞Ω瑜夊銊╂⒑閹肩偛锟芥牠宕归崼鏇炍﹂柛鏇ㄥ灠缁犳娊鏌熺�涙绠伴柟鐑筋棑閹风姴顔忛鐣岀▉濠德板�х徊浠嬪疮椤栫偞鍋傛繛鎴烇供閻斿棝鎮归搹鐟板妺妞ゃ儳鍋炵换娑㈠川椤撶喎娅ょ紓浣虹帛缁嬫捇骞忛悩渚Ь闂佷紮缍佹禍鍫曞蓟閵娾晛鍗虫俊顖濇娴煎牓姊虹化鏇熸珔閻庢碍婢橀悾宄邦潨閿熶粙銆侀弬娆惧悑闁糕剝绋掗弳锟�?");
					return false;
				}
				//闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾绾惧鏌ｉ幇顒佹儓缂侊拷閸曨厽鍠愰柣妤�鐗嗙粭鎺旂棯閹岀吋闁哄本绋戦埥澶愬础閻愬吀绱欓梻浣烘嚀閸㈡煡宕查弻銉ョ厺闁规崘顕ч崹鍌涖亜閺冨浂鍤欓柡瀣墛娣囧﹪濡堕崶顬儵鏌涚�ｎ偆娲存い銏＄墵瀹曘劑骞嶉鏄忓焻闂傚倸鍊烽懗鍓佸垝椤栫偛绠扮紒瀣儥濞尖晠鏌ㄩ弬鍨挃闁活厼妫濋幃妤呮晲鎼粹剝鐏嶉梺缁樻尵閸犳牠鐛弽銊︾秶闁告挆鍛咃綁姊洪悮瀛樺闂佺粯顨呴悧蹇曠不閹岀唵閻犺桨璀﹂崕鎴炵箾閸欏灏﹂柡灞炬礋瀹曞崬螖娴ｅ憡鐣俊鐐�х粻鎴濓耿闁秵鏅搁柤鎭掑労閸熷繘鏌涢悩鍐插摵闁炽儻绠撳畷濂稿Ψ椤喗瀚归柨鏇炲�告儫闂佸疇妗ㄩ懗鍫曀囬弶娆炬富闁靛牆妫楁慨鍌炴煕婵犲啯绀堢�垫澘锕畷婊嗩槾缁惧彞绮欓弻娑氫沪閹规劕顥濋梺璺ㄥ枔閺咁偊宕楀锟介獮鍐倷閻戞ɑ娅嗛梺缁樺姦閸撴瑦鎯旀繝鍥ㄢ拺闁告稑锕ゆ慨锕�霉濠婂懎鍘存鐐茬箰閻ｏ繝骞嶉搹顐や簴闂備礁澹婇悡鍫ュ窗閺囥垹绐楀┑鐘蹭迹閺冨牊鍋愰梻鍫熺◥缁泛顪冮妶鍡楃仴闁硅櫕锕㈤弫鎰版倷瀹割喚鍙嗛梺鍓插亝缁诲牓宕崼鏇熲拺闂傚牊绋撶粻鐐烘煕閳轰礁顏╅崡杈╋拷鐟板婢瑰寮ㄦ禒瀣厽闁归偊鍓涢幗鐘电磽瀹ュ棗鐏撮柡灞剧☉椤繈顢楁径濠傚闂備胶顢婂▍鏇犳崲閸愵喖围闁挎繂顦粈鍐煃鏉炴壆鍔嶉柣锝堫嚙閳规垿鎮╅崹顐ｆ瘎婵犳鍠楀娆戝弲闂侀潧鐗嗗ú銊╂儗閸℃稒鐓曢柡鍥ュ妼閻忥繝鏌ｉ幙鍕М闁绘搩鍋婂畷鍫曞Ω閿曪拷閺嗘绱撴担鍓叉Ч婵＄偘绮欏璇测槈濠婂懐鏉搁梺鍦亾濞兼瑧绮ｅ☉姘辩＝濞达絼绮欓崫娲煙缁嬫鐓兼鐐茬箻瀹曘劑寮堕幋婊呯倞闂備礁鎲″ú锕傚礈濞戞瑧顩叉い蹇撴噸缁诲棝鏌ｉ幇鍏哥盎闁跨喓鐛ら崨顓犵瓘婵炲濮撮鍡涘磻婢跺ň鏀介柛灞剧矤閻掗箖鏌﹂崘顏勬灈闁哄本鐩崺鍕礃椤忎焦顫嶇紓鍌欒兌婵挳鈥﹂悜钘夎摕闁斥晛鍟欢鐐烘倵閿濆簼绨藉ù鐘层偢濮婅櫣绮欓崠鈩冩暰闁汇埄鍨抽崑鐔肺ｉ幇鏉跨閻庨潧鎽滈幊婵囩節閻㈤潧孝闁哥噥鍋婇、鏃堝礈娴ｈ櫣锛濋梺绋挎湰閻熴劑顢欐径瀣╃箚闁绘瑦鐟ュú銈夋偪閸撗呯＜婵炴垶鐟ч幊鍥ㄦ叏婵犲嫮甯涢柟宄版嚇瀹曨偊宕熼锛勫笡闂傚倷绀侀幗婊堝窗鎼淬劍鍊舵繝闈涳功娴滈亶姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷?濠电姷顣槐鏇㈠磻閹达箑纾归柡宥庡幗閸嬪淇婇妶鍛櫤闁稿绱曢幉鎼佸棘鐠恒劍娈惧銈嗙墬缁嬫挾寮ч敓浠嬫⒑缁嬫寧婀版い銊ユ閿濈偛顓兼径瀣ф嫼闁荤喐鐟ョ�氼剟宕濋妶鍥╂／缂備降鍨归獮妤呮煟濡わ拷闁帮絽顫忕紒妯诲闁告稑锕ラ崕鎾斥攽閳藉棗浜濇い銊ョ墢閸掓帡寮崼鐔蜂缓闂佹眹鍨婚弫鎼佹偂閹惧绡�闁靛骏绲剧涵鐐亜椤撗冨⒋鐎规洏鍎抽敓鏂ょ秵閸撴稓澹曢崗绗轰簻闁规澘澧庨幃鑲╃磼閿熺晫锟斤綆鍋嗙弧锟介梺姹囧灲濞佳勭閿曞倹鐓曢柍杞扮筏闊剚顨ラ悙鑼闁轰焦鎹囬弫鎾绘晸閿燂拷?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝曢梺鍝勬噺缁诲啴濡甸崟顖氱疀闁宠桨绶ら幏鐑藉冀椤撱劎绋忛梺鍝勬川閸犳挾寮ч敓浠嬫⒒閸屾氨澧涚紒瀣浮閹苯螖閸愵亞锛滈柣鐘叉搐瀵爼藟閵忋倖鐓涢悘鐐插⒔閵嗘帒霉閻欏懐鐣电�规洘绮忛ˇ浼存煥閻旇袚閻㈩垱甯″﹢浣糕攽閻樿宸ュΔ鐘虫倐閹﹢鏁冮崒娑氬幐閻庣櫢鎷烽柨鐔剁矙瀹曚即寮介鐘茬ウ婵炴挻鐔幏閿嬵殽閻愭潙娴鐐差儏閳规垿宕遍埡鍌滅▔闂傚倷娴囧畷鐢稿窗閹邦喖鍨濈�广儱鎷嬮悢鍡樻叏濡ゅ瀚归梺璇″暙閸パ咁啋闂佺厧顫曢崐鏇犵矈閿曞倹鈷戦柛锔诲幖椤ｅ吋绻濋姀鈽嗙劷缂侇喖顭烽弫鎰緞鐎ｎ剙骞楅梻浣哥秺閸嬪﹪宕规导瀛樺剭闁告繂濞婅ぐ鎺撳亹鐎规洖娲ㄩ悡澶娾攽椤旂》鏀绘俊鐐扮矙閻涱噣骞囬鐔峰妳闂佹寧绻傞崐褰掞綖瀹ュ鈷掑ù锝囶焾閹垶淇婇悙鍙夊仴鐎规洖婀遍幑鍕惞鐟欏嫭顔曢柣鐔哥矌婢ф鏁埡鍛瀬鐎广儱妫欓崣蹇斾繆椤栨粌甯堕悽顖濆煐缁绘盯宕煎☉妯侯潎濠殿喖锕ュ浠嬪箠閿熺姴围闁告侗鍠氶敓鑺ュ劤閳规垿鎮╅鑲╀痪闂佹寧姘ㄩ幃顔尖枎韫囷絿鍞甸柣鐘荤細濞咃綁鎮樻潏鈺冩／闁诡垎鍐╁�梺闈涙搐鐎氭澘顕ｆ禒瀣╃憸蹇涙偩閻㈠憡鈷戦柛娑橈龚婢规ɑ绻濋敓鑺ユ綇閳哄偆娼熼梺鍦劋椤ㄥ繘寮繝鍥ㄧ厵妞ゆ牕妫楅崯顐︹�栭崱娑欌拻濞达絿鎳撻婊呯磼鐎ｎ偄娴�规洘绻傞埢搴ㄥ箻鐠鸿櫣銈﹂梺璇插嚱缂嶅棝宕板Δ鍛柧婵犲﹤鐗婇悡鏇熴亜椤撶喎鐏ユ繛鍛戞穱濠囶敃閿濆洨鐓夊┑顔硷功缁垶骞忛崨鏉戝窛濠电姴鎳愰、鍛磽閸屾瑧璐伴柛锝庡櫍瀹曞湱鎹勯搹瑙勬濠电娀娼ч弻鍫ュ籍閸繂绐涘銈嗘尭濞村嫰姊介崟顖氱疄闁靛鍎弨浠嬫煕閵夋垵鍟伴崐鎵婚梻鍌氬�搁崐鎼佸磹瀹勬噴褰掑炊椤掑﹦绋忔繝銏ｆ硾椤戝洭銆呴幓鎹楀綊鎮╁顔煎壈缂佺偓鍎冲鈥愁嚕閸洖閱囨い鎰垫線缁ㄥ瓨绻涚�涙鐭婄紓宥咃躬瀵鈽夐姀鈺傛櫇闂侀潧鐗嗛幊蹇涙倶娴ｅ壊娓婚柕鍫濆�瑰▍鍡涙煟閹垮嫮绡�鐎殿喛顕ч埥澶娢熼柨瀣澑闂備礁澹婇崑鍡涘窗鎼淬垻顩茬紒娑欑矒濮婂宕掑顒婃嫹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸涘鑰跨紒鐘崇墵瀵偊骞樼紒妯烘疅闂侀潧顦介崰鏍疾闁秵鈷戠紒瀣儥閸庡繘鏌ㄩ弴銊ら偗闁诡喕鍗抽、娆撳箻閸涱喖顏堕梺鎸庣箓缁ㄥジ骞夐悙顒傜缂佹鎼慨鍌炴煛鐏炲墽娲存い銏℃礋閹晠鎳犻璺ㄧ？濠碉紕鍋戦崐褏锟介潧鐭傚畷鏉课旈崘鈺佸簥濠电偞鍨崹鍦不閿濆鐓熼柟閭﹀幗缂嶆垹鐥弶璺ㄐょ紒杈ㄦ尰閹峰懘妫冨☉姗嗘綂闂備胶顭堥鍡涘礉濞嗗繒鏆︽慨妯挎硾缁犺櫕淇婇妶鍜冩敾闁哄懌鍨虹换娑欐綇閸撗呅氶梺闈涙４閹风兘姊洪崫鍕靛劀闁瑰嚖鎷�?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯悹楦裤��閺嬪秹鏌曡箛瀣拷鏇犵不椤栫偞鐓ラ柣鏇炲�圭�氾拷?
				if(acceptresult==1){//闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掑﹦绋忔繝銏ｆ硾椤戝洭銆呴幓鎹楀綊鎮╁顔煎壈缂佺偓鍎冲鈥愁嚕閸洖閱囨い鎰垫線缁ㄥ瓨绻涚�涙鐭婄紓宥咃躬瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷
					hostliveDieRoleInfo.setAcceptflag(1);
					MessageMgr.sendSystemMsg(162067,Arrays.asList(guestname,hostname));
					SAcceptInvitationLiveDieBattle sAcceptInvitationLiveDieBattle=new SAcceptInvitationLiveDieBattle();
					Onlines.getInstance().send(guestid, sAcceptInvitationLiveDieBattle);
					//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柨鐔哄У閻撳繐顭跨捄鐑橆棡婵炲懎鎳樺畷鍓侊拷娑欘焽缁犻箖鎮楅悽娈跨劸鐎涙繂顪冮妶鍡楃仴闁硅櫕锕㈤獮鍡欎沪鏉炴寧妫冨畷銊╊敊绾攱瀚归柣銏犳啞閻撱儲绻濋棃娑欘棦妞ゅ孩顨呴湁婵犲﹤瀚惌宀�绱掓潏銊ユ诞妤犵偞鎹囬獮鎺楀箻閸︻収鏀ㄧ紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柨鐔哄Т閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?
					MessageMgr.psendSystemMessageToRole(hostid,162115, Arrays.asList(guestname));
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162114, Arrays.asList(guestname));
					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧潡鏌熺�电啸缂侊拷婵犲洦鐓ラ柣鏃囶嚙琚氶梺闈涙搐鐎氭澘顕ｉ幘顔煎耿婵°倧鎷锋い蹇ｄ邯閺屾稑鈻庤箛鏇狀啋闂佸搫鐭夌紞渚�鐛崶顒夋晢濞达絿鎳撻崜鐢电磽閸屾瑨鍏屽┑顖氼嚟瀵板﹪鎮欓鍌楁敵婵犵數濮村ù鍌炲极瀹ュ棛绡�濠电姴鍊归崳鍦磼濡ゅ绡�婵﹨娅ｉ幏鐘诲蓟閵壯冩そ闂備胶鎳撻崵鏍箯閿燂拷
					LiveDieMange.liveDieRoleids.put(hostid, guestid);
				}else{
					xtable.Livedie2key.remove(guestid);
					xtable.Livedieroleinfotab.remove(hostid);
					//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鎳為柆宥嗗殐闁宠桨鑳剁粵蹇旂節閻㈤潧校闁绘棏鍓涚槐鐐哄冀瑜滈悢鍡涙煠閹间焦娑у┑顔兼喘閺岋箓宕橀鍕亪闂佸搫鐭夌紞浣割嚕椤掑嫬绠伴幖娣灩閺嬫垿姊绘担鍝ワ紞缂侇噮鍨伴～蹇旂節濮橆厽娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖绮癸拷瀹犲煘闁捐崵鍋炵换娑㈠幢濡ゅ啰鐣鹃梺鍝勵儐濡啴寮婚敐澶婄睄闁稿本鑹炬禒妯肩磽娴ｅ搫鐝￠柛銉ｅ妿閸樻捇鏌℃径灞戒沪濠㈢懓妫濊棟闁挎柨顫曟禍婊堟煙閸濆嫷鍎忛柣蹇旂叀閺岋紕浠﹂崜褎鍒涢梺鐐藉劵缁犳捇鐛�ｎ亖鏀介柛鈥崇箲鐎氼剟姊虹拠鍙夊攭妞ゎ偄顦叅婵鎷烽柟铏箖閵堬綁宕橀妸褍骞掗梺鐟板悑閻ｎ亪宕濆畝锟界划璇测槈濞嗗秳绨婚梺鐟扮摠濮婂綊寮惰ぐ鎺撶厸闁告侗鍨板瓭濡炪値鍋勭换鎰弲濡炪倕绻愮�氼噣鏁嶅▎鎾粹拺缂備焦蓱椤ュ棙绻涢崪鍐偧缂佽鲸鐟﹀蹇涘煛閸愵亷绱冲┑鐐舵彧缂嶏拷婵炲拑绲块弫顔尖槈濞嗘垹顔曢梺鍛婄懃椤﹂亶鎯岀仦鍙ョ箚闁告瑥顦慨宥嗩殽閻愭潙娴鐐差儔瀵噣鏁撴禒瀣�靛┑鐘崇椤ュ﹥銇勯幇鈺佺仾闁瑰吋鍔栭妵鍕箣濠靛洤娅ょ紓浣稿�圭敮锟犲极閹剧粯鏅搁柨鐕傛嫹
					fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
					int cost=LiveDieMange.getLiveDieCostMoney();
					bag.addSysMoney(cost, "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�搁埞鎴︽偐鐎圭姴顥濈紓浣瑰姈椤ㄥ﹪寮婚悢绋款嚤闁哄鍨抽崰濠囨⒑鏉炴壆顦︽俊顐ｇ箞瀵鎮㈤搹鍦紲闂侀潧绻掓慨鐢告倶閸垻纾藉ù锝呮惈椤庢挾绱掗弻銉х暫妤犵偛鐗撴俊鎼佸Ψ鎼淬垺鈷掗柨鐔告灮缂嶅棝宕戦崟顖ｆ晜闁跨噦鎷�??闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻鐔煎箚閻楀牜妫勭紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帒顦▓鍓佺磽娴ｅ搫鈻堢紒鐘崇墵瀵鈽夊Ο鍏兼畷闂佽法鍠嶇划娆忕暦閹达附鍊烽柣鎴灻禍妤呮⒑鐠恒劌娅愰柟鍑ゆ嫹?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shengsizhanyajin, 0);
					//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛濠傛健閺屻劑寮撮悙璇ф嫹瑜版帒纾婚柨鐔哄У閻撳繐顭跨捄鐑橆棡婵炲懎鎳樺畷鍓侊拷娑欘焽缁犻箖鎮楅悽娈跨劸鐎涙繂顪冮妶鍡楃仴闁硅櫕锕㈤獮鍡欎沪鏉炴寧妫冨畷銊╊敊绾攱瀚归柣銏犳啞閻撱儲绻濋棃娑欘棦妞ゅ孩顨呴湁婵犲﹤瀚惌宀�绱掓潏銊ユ诞妤犵偞鎹囬獮鎺楀箻閸︻収鏀ㄧ紓鍌氬�峰ù鍥ㄣ仈閸濄儲鏆滈柨鐔哄Т閺嬩線鏌熼崜褏甯涢柡鍛倐閺屻劑鎮ら崒娑橆伓?
					MessageMgr.psendSystemMessageToRole(hostid, 162087, Arrays.asList(guestname));
					MessageMgr.sendSystemMsg(162068,Arrays.asList(guestname,hostname));
					logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�搁埞鎴︽偐鐎圭姴顥濈紓浣瑰姈椤ㄥ﹪寮婚悢绋款嚤闁哄鍨抽崰濠囨⒑鏉炴壆顦︽俊顐ｇ箞瀵鎮㈤搹鍦紲闂侀潧绻掓慨鐢告倶閸垻纾藉ù锝呮惈椤庢挾绱掗弻銉х暫妤犵偛鐗撴俊鎼佸Ψ鎼淬垺顥堥柡浣规尰缁傛帞锟斤綆鍋勬禍閬嶆椤愩垺澶勬繛鍙夌矒閹矂宕卞Δ濠勫數闂佸吋鎮傚褎鎱ㄩ崼銉︾厱濠电姴娲﹀☉褔妫佹径鎰叆婵犻潧妫欓崳褰掓煛鐎ｃ劌锟芥牜鎹㈠☉銏犵闁绘挸楠搁～灞筋渻閵堝骸寮ㄩ柛搴☆煼钘濈�规洖娲ㄧ壕鍏笺亜閺冨洤袚鐎规洖鐭傞弻锝呪槈閸楃偞鐏曠紓浣哄У缁嬫垿鍩ユ径濞㈢喓鍠婇崡鐐存毌闂傚倸鍊风粈渚�骞栭锕�鐤い鎰剁畱绾惧湱绱掔�ｎ厽纭堕柡鍡檮閵囧嫯绠涢幘璺侯杸闂佹娊鏀遍崹鍧楀蓟閿濆鍋勯柛婵嗗閺嗩參姊洪崫銉ユ灁闁稿鍊濆璇测槈閵忕姈鈺呮煏婢诡垰鍟伴崢浠嬫煟鎼淬値娼愭繛鍙夌墱缁辩偞绻濋崶銉嫹娴ｈ倽鏃堝川椤撶媭妲规俊鐐�栫敮濠囨倿閿曞倹鍋熸い鎰堕檮閻撶喖骞栨潏鍓хɑ妞ゅ繒鍠栭弻鐔割槹鎼粹�冲箣闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷??闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳娼￠弻鐔煎箚閻楀牜妫勭紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帒顦▓鍓佺磽娴ｅ搫鈻堢紒鐘崇墵瀵鈽夊Ο鍏兼畷闂佽法鍠嶇划娆忕暦閹达附鍊烽柣鎴灻禍妤呮⒑鐠恒劌娅愰柟鍑ゆ嫹?,闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟界壕鍏肩節婵犲倹濯奸柛搴嫹"+hostid+"闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗霉閿濆懎顥忛柛銈嗘礋閺屾盯顢曢敐鍡欘槬闂佹悶鍔岄崐鍧楀蓟濞戞粠妲煎銈冨妼閹虫劗鍒掔紒妯侯嚤閻庢稒顭囬崢鍗烆渻閵堝棗濮х紒鎻掑⒔缁牓鏁撴禒瀣拺闁告繂瀚烽崕搴ｇ磼閿熻姤绗熼敓钘夛耿娓氾拷濮婅櫣绮欑捄銊ь唶闂佸憡鑹鹃鍥╂閻愬搫绠ｉ柣鎰暩椤旀洟姊洪崨濠勭煀闁哥噥鍨抽敓鑺ョ啲閹凤拷"+cost);
				}
				return true;
			};
		}.submit();
	}
	public static final Logger logger = Logger.getLogger("BATTLE");
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793837;

	public int getType() {
		return 793837;
	}

	public long sourceid; // 目标玩家id
	public int acceptresult; // 0拒绝  1接受

	public CAcceptInvitationLiveDieBattle() {
	}

	public CAcceptInvitationLiveDieBattle(long _sourceid_, int _acceptresult_) {
		this.sourceid = _sourceid_;
		this.acceptresult = _acceptresult_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sourceid);
		_os_.marshal(acceptresult);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sourceid = _os_.unmarshal_long();
		acceptresult = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptInvitationLiveDieBattle) {
			CAcceptInvitationLiveDieBattle _o_ = (CAcceptInvitationLiveDieBattle)_o1_;
			if (sourceid != _o_.sourceid) return false;
			if (acceptresult != _o_.acceptresult) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sourceid;
		_h_ += acceptresult;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sourceid).append(",");
		_sb_.append(acceptresult).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptInvitationLiveDieBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(sourceid - _o_.sourceid);
		if (0 != _c_) return _c_;
		_c_ = acceptresult - _o_.acceptresult;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


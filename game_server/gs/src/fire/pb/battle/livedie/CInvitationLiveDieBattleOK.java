
package fire.pb.battle.livedie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import fire.pb.PropRole;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.talk.MessageMgr;
import fire.pb.title.COffTitle;
import gnet.link.Onlines;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationLiveDieBattleOK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationLiveDieBattleOK extends __CInvitationLiveDieBattleOK__ {
	public static final Logger logger = Logger.getLogger("BATTLE");
	@Override
	protected void process() {
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻О闂備浇顕栭崹鎶藉磻閵堝宓侀柡宥庣仈鎼搭煈鏁嗛柨鐔诲Г娣囧﹥绺介崨濠勫幗濡炪倖鎸鹃崳銉モ枔濠婂嫷娈介柣鎰嚟婢ь亪鎳ｉ幇顓滀簻闁硅櫣鍋炵�氳绻濆鏋�曟禍鍦磼鏉堛劌娴鐐叉喘椤㈡顦抽柣銈勭窔濮婃椽宕崟顐У闂佽法鍠曟慨銈夊礈濮樿泛瑙﹂悗锝庡枛缁犲湱绱掗鐐仧闁瑰嘲鍢查悾鐑藉炊鐠虹儤娅忛梻鍌氬�搁崐鐑芥嚄閸洍锟斤箓宕奸妷顔芥櫈闂佺鐬奸崑娑㈡偪閻愵剛绠鹃柟瀵稿仧閻苯霉濠婂嫮鎳囨慨濠勭帛閹峰懘鎮烽柇锕�娈濈紓鍌欐祰椤曆囧磹閸ф宓佸┑鐘插暞閸庣喖鏌曟繛鍨姕閺夊牆鐗嗛埞鎴︽倷閸欏妫￠梺鍦焾椤兘骞冮敓鐘插嵆闁绘棁娅ｉ鏇㈡⒑缁洖澧叉い銊ワ躬閹澘顭ㄩ崼鐔哄幐闂佽法鍠曟慨銈囨崲濠靛棭娼╂い鎾跺Т鐢箖姊绘担瑙勫仩闁稿孩绮撳畷姗�宕ｉ妷褏锛為梻浣筋嚙鐎涒晠顢欓弽顓炵獥闁哄洨濮撮崹婵囩箾閸℃ê濮冪紒璇叉閹便劌鈹戦崱娆戝姼濠碘�插嫎閸旀垵顫忓ú顏勪紶闁告洦鍓ㄧ槐銊х磽娴ｈ櫣甯涚紒璇插�块敐鐐剁疀濞戞瑦鍎梺闈╁瘜閸橀箖鎮￠幘缁樷拺缂佸妫楃�氬嘲鈻撻姀銈嗙叆闁绘棁顕ц濡炪們鍔岄敃顏勵嚕婵犳艾惟闁宠桨绀佸畵鍡椻攽閳藉棗鐏ｉ悘蹇嬪姂楠炲繐鐣￠幍铏杸闁诲函缍嗘禍婵單ｉ鍕拺闂傚牊渚楀褏绱掗悩鍐茬仼婵炲棎鍨介幃娆撴倻濡厧骞嶉梻鍌欑贰閸欏繒绮婚幋鐐存珷闁绘鐗勬禍婊堟煛閸愭寧瀚归柣銏╁灙閿熻姤鍓氬鏍旈敃渚婇獜濞存粌缍婇弻鐔兼倻濡偐鐣哄┑鐐茬墑閸庡磭妲愰幘瀵哥懝濠电姴鍟璺衡攽閻愬瓨灏伴柣鏃戝墴楠炲繑顦版惔顖涘閻熸瑥瀚粈鍐磼椤旇姤宕岀�殿喖顭峰畷鍗炍旀繝鍌涘�梻浣虹《閿熻棄纾粻鏌ユ倵濮橆兙鍋㈡慨濠勭帛閹峰懘宕ㄦ繝鍌涙畼闂備礁缍婇敓鑺ョ閸忓苯霉濠婂拋鐒鹃柍璇查叄楠炴﹢宕橀幓鎺嶆喚濠电姷鏁搁崑鐐哄垂椤栫偛鍨傛繛宸簼閸嬪倿鏌￠崶銉ョ仾闁绘挻鐟╅弻鐔碱敍閸℃鍣洪柟鎻掋偢濮婂搫效閸パ冾瀴闂佹悶鍔屽﹢鍗炍ｉ幇鏉跨婵°倕锕ラ弲鈺呮⒑娴兼瑧鍒伴柡鍫墴瀹曡櫕瀵肩�涙ǚ鎷洪柡澶屽仦婢瑰棝宕濆澶嬬厵闁荤喓澧楅崰妯硷拷娈垮櫘閸嬪﹪鐛Ο鑲╃＜婵☆垳绮鐔兼⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘婵倗绮婃导瀛樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕奸弴妤嬫嫹閿曞倸閱囬柣鏇氱劍椤旀棃姊洪崨濠勭細闁稿骸顭烽獮蹇撶暋閹佃櫕顫嶉梺鍦劋閹稿鎮靛顓犵瘈缁炬澘顦辩壕鍧楁煛娴ｇ瓔鍤欓柣锝囧厴閹垻鍠婃潏銊︽珫婵犳鍠楅…鍫熺椤掞拷椤洦寰勯幇顓涙嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓涢柛顐亜婢ф壆绱掗鐣屾噰妤犵偞甯掕灃濞达綁鏅查幋閿嬩繆閻愵亜锟芥洜鎹㈤幇鐗堝亱濠电姴娲ら悡鏇㈡煙鏉堥箖妾柣鎾寸懇閺屻倕霉鐎ｎ偅鐝旀繛瀵稿У缁矂鍩為幋锕�鐏抽柣鎰娴狀噣姊洪崫鍕拱婵炶尙鍠庨悾閿嬬附閸涘﹤浜滅紓浣割儏鐏忓懘骞忛悜钘夌疀妞ゆ洖妫欑�氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻樻彃骞嬮悗娈垮櫘閸嬪﹪鐛崶顒�绾ч柛顭戝枤閻涒晜淇婇悙顏勶拷鏇犳崲閹版澘绠犻煫鍥ㄧ☉濮规彃鈹戦悩鍙夊闁抽攱甯掗湁闁挎繂鐗婇鐘绘偨椤栨稓娲撮柡灞剧洴瀵噣骞橀崜浣规闁诲氦顫夊ú妯煎垝瀹�鍕剁稏婵犻潧顑嗛崵瀣⒒閸喓鈼ラ柟瀵稿厴濮婄粯鎷呴崨濠冨創闂佺锕ょ紞濠囥�侀弽褉鏋庨煫鍥ь儜閹风兘骞掗幘鍓佺槇濠殿喗锕╅崢楣冨储椤忓牊鈷戦柛鎾村絻娴滄繄绱掔拠鎻掓殻閽樼喖鏌ｉ幇顔煎妺闁绘挾鍠栭弻鐔煎箚瑜嶉懜褰掓煕閺傝锟芥妲愰幒鎾寸秶闁靛鍎抽悷鏌ユ倵閸偅绶查悗姘煎枟缁傛帡鏁冮崒姘辩暰閻熸粌閰ｉ幃楣冾敆娴ｉ绠氶梺缁樺姦娴滄粓鏁撻懞銉уⅹ閻撱倝鏌嶉崫鍕殭缂佽翰鍊濋弻娑㈠箻濡わ拷缁夌數锟芥艾缍婂濠氬醇閻旇　妫ㄩ梺绋款儍閸ㄦ椽銆冮妷鈺傚�烽悗鐢殿焾閳峰苯顪冮妶鍐ㄧ仾闁挎洏鍨介獮鍐閵堝懎绐涙繝鐢靛Т鐎氼剙顕欓崫鍕ㄦ斀闁绘ê鐏氶弳鈺佲攽椤旂偓鏆い銏＄懇瀵粙顢橀悙鐢靛炊婵犲痉鏉匡拷鏇㈠箠韫囨稑鐤炬繝闈涱儐閻撳啴鏌涘┑鍡楊仾闁革絽缍婇弻娑氫沪鐠囨彃顬堥梺瀹狀潐閸ㄥ灝鐣烽幒鎴叆閹艰揪绲芥慨鑲╃磽閸屾瑧绛忛柟椋庡厴閺屾盯顢曢悩鎻掑闂佺粯鎸哥换鎰板煘閹达附鍊烽梻鍫熺◥婢规洖鈹戦悙鍙夊櫣婵☆偅绻堝璇差吋婢跺鍙嗛柣搴秵娴滅偞瀵肩仦瑙ｆ斀妞ゆ梻銆嬪銉︺亜椤撶偛妲婚柣锝囧厴閹剝鎯旈钘夊厞婵＄偑鍊栭幐楣冨窗閹惧箍浜归柛顐犲灮绾句粙鏌涚仦鍓ф噮缂佹稑绻橀弻鐔割槹鎼粹�冲箣闂佽鍠楅〃濠囧极閹邦厽鍎熼柍鈺佸暟娴滃爼姊绘担铏瑰笡闁规瓕顕х叅闁绘梻鍘ч拑鐔兼煥閻斿搫孝缁炬儳鍚嬮幈銊ヮ潨閸℃绠规繛瀵稿У閹稿啿顫忓ú顏勫窛濠电姴瀚崳褔鏌ｆ惔銏犲毈闁革綇缍佸顐﹀箻鐠囪尙锛欓梺缁樻磻閻掞妇绱為崼婵冩斀闁绘劖褰冪痪褏绱掗鑺ュ碍妞ゆ洩缍侀、鏇㈡晲閸モ晝妲囨繝娈垮枟閿曗晠宕滃鑸靛�垫い鎺戝閳锋垿鏌ｉ悢鍛婄凡闁抽攱姊荤槐鎺楊敋閸涱厾浠搁悗娈垮枟閻擄繝鐛弽銊﹀闁革富鍘煎鎶芥⒒娴ｈ櫣甯涙繛鍙夌墵瀹曟劙宕烽銊﹀婵鍋撶�氾拷
				Role gRole = RoleManager.getInstance().getRoleByID(objectid);
				if (gRole == null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				xbean.Properties guestprop=xtable.Properties.select(objectid);
				if(guestprop==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垶顭傞悢鍏煎亗閹肩补锟借尙甯涢梻鍌欑绾绢厾鍒掗鐐茬闁归棿璁查敓鏂ょ畵婵℃悂鍩℃担渚О闂備胶绮崝锕傚礈濞嗘挻鍎婃繝濠傜墛閳锋帒銆掑鐐濠电偘鍖犻崶銊ヤ罕闂佺硶鍓濈粙鎴犵不閻樼粯鐓欓梺顓ㄧ畱閺嬨倕鈽夐幘宕囆㈤棁澶愭煟閹捐櫕鎹ｉ柟鐣屽█閺屾稒绻濋崒婊�绮甸梺閫涚┒閸斿矁鐏掗梺缁樻尭妤犲憡绂掑锟藉娲传閸曢潧鍓梺绋匡攻椤ㄥ牆危閹版澘绠虫俊銈咃攻閺呪晝绱掗悙顒�顎滃ù婊庡墴瀹曘儳锟斤綆锟筋厽妫冮幃鈺呮濞戞鍕冮梺姹囧焺閸ㄨ京鏁悢鍏煎�堕柛鎰ㄦ櫇缁犻箖鏌熼崜褜妫庡瑙勆戠换娑氭嫚瑜忛悾鐢告寠閻斿皝鏀介柣妯诲絻閺嗘洜绱掔拠鍙夘棦闁哄矉缍侀獮鍥礂閸濄儳娉块梻浣芥硶閸犳洘鎱ㄩ妶澶嬪亱婵犲﹤鐗嗛弸浣广亜閺囶亝瀚瑰Δ鐘靛仦鐢帡鈥旈崘銊㈡斀闁糕剝锚閺嬬姴顪冮妶鍐ㄧ仾缂佸鍨块崺銉﹀緞婵犲孩鍍甸梺绋跨箰閵堟悂寮鍐ｆ斀闁绘灏欏Λ鍕煛婢跺﹤鐨￠柟椋庡厴瀵挳濮�閻樺灚鐒鹃梻浣筋潐椤旀牠宕伴弽顓勫顫濋懜鐢靛幈闂婎偄娲︾粙鎺楁晬閻旇櫣纾奸悹鍥у级椤ャ垽鏌＄仦鐐鐎规洜鍘ч埞鎴﹀醇閵忊晛鏁奸梻浣筋嚙鐎涒晠鎳濋崜褏绀婂┑鐘插亞濞兼牠鏌ц箛鎾磋础闁活厽鐟╅弻娑㈠冀閵堝繑瀚归柛蹇撴噽閻姊婚崒娆愮グ妞ゆ泦鍛床闁瑰濮靛畷鏌ユ煕椤愮姴鍔橀柨鐔稿灊缁�渚�锝炲┑瀣殝闁割煈鍋呴悵鍐测攽閻橆喖鐏辨繛澶嬬洴閺佸啴濡舵径瀣拷鍨亜閹捐泛鍓辨繛鎾愁煼閺屾洟宕煎┑鍥舵婵犳鍠栭崐鍧楀蓟濞戙垹惟闁靛鍎遍幆鐐电磽娓氬洤娅欑紓宥勭窔楠炲啫鈻庨幘鏉戯拷缁樹繆椤栨粌甯舵鐐搭殜濮婄粯绻濇惔鈥茬盎濠电偠顕滅粻鎴犲弲闂佸搫绉查崝搴ㄣ�呮搴㈠枑闁哄啫鐗嗛拑鐔哥箾閹寸偟鍟查柟椋庡厴閺佹劖鎯旈垾鑼嚬闂佽绻愬ù姘跺矗閸愵喖钃熺�广儱娲︾�氭岸鏌ょ喊鍗炲姰鐟滃秹鍩為幋锔绘晪闁糕剝锚椤忓爼姊婚崒娆掑厡缂侇噮鍨堕弫鍐煛閸涱厾锛涢梺鍛婄♁濞兼瑥螞濮楋拷閺屻劑鎮㈢拠娈嬫挸菐閸パ嶈含闁诡喗鐟╅、鏃堝礋閼搁潧顏堕梺鍝勮癁鐏炲墽绋佸┑鐘垫暩婵敻鎳濇ィ鍐╁仾闁绘劦鍏欐禍婊堟煙閹佃櫕娅呴柨鐔诲Г椤ㄥ棛绮欐径濠庡悑闁糕剝娲滅粻姘渻閵堝棛澧紒璇插�圭粋宥夊捶椤撶姵锛忛梺璇″瀻閸愨晛锟筋垶姊洪棃娑欐悙閻庢碍婢橀锝夊箻椤旇棄锟界兘鏌℃径瀣仸妞ゅ繒濞�濮婄粯鎷呯粵瀣婵°倗濮寸换鎴炵┍婵犲洤鐐婃い鎺嶇劍濞呫垽姊虹粙鍖″姛闁革絻鍎遍…鍥箛椤撶姷顔曢梺鍛婄懃椤﹁鲸鏅舵潏鈺冪＜閺夊牃鏅涙禒锔剧磼缂佹绠炵�规洖鐖兼俊鐑筋敍濞戞﹩浼撳┑鐐舵彧缂嶏拷闁稿﹣绮欏顕�宕煎┑鍡欑崺婵＄偑鍊栭幐鐐垔鐎靛憡顫曢柛娆忣槺缁★拷闂佹眹鍨藉褍鐡梻浣瑰濞插繘宕愬┑瀣祦濠电姴娲ょ粻娑㈡煛婢跺﹦浠㈤柛瀣Ч濮婅櫣绱掑鍡欏姺缂備緡鍣崹鍫曞春濞戙垹绠抽柟鐐藉妼缂嶅﹪寮幇鏉垮窛妞ゆ柨鍚嬪▓姗�姊绘担绛嬪殐闁搞劋鍗抽幃褎绻濋崶顬箓鏌涢弴銊ョ仭闁哄懏绮撻幃褰掑炊椤忓嫮姣㈡繛瀵稿У閹倸顫忛搹瑙勫珰闁炽儴娅曢悘宥夋⒑閹稿骸鍝洪柡灞界Ф閹叉挳宕熼銈勭礉闁诲氦顫夊ú鏍偉婵傜鏄ラ柨鐔哄Т缁�鍐煙椤栧棗瀚悵顒勬⒒閸屾艾锟芥悂宕愰悜鑺ュ�块柨鏇炲�哥粻鏍煕椤愶絾绀�缁剧偓瀵х换娑橆啅椤旇崵鐩庣紓渚婃嫹闁割偆鍠愰崣蹇斾繆椤栨氨浠㈤柣鎾村姍閺屾稓锟斤綆浜滈敓钘夋健瀵寮撮悢椋庣獮濠电偞鍨堕敃鈺伱洪鐘电＝濞达絽鎼埢鍫㈢磼閻樺磭澧电�殿喖顭烽幃銏ゆ偖鐎涙ê顏堕梺姹囧灩閹测�斥枍濠婂懐纾奸弶鍫亝閻濐亪鏌曢崶褍顏紒鐘崇洴楠炴鎹勬笟顖涙闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤栨氨鏌堝銈嗗姧缁犳垿鎮″┑瀣婵烇綆鍓欐俊鑲╃磼閻欏懐绉柡宀嬬到铻ｇ痪鎷岄哺濞堟壆绱撴担绋胯埞鐎殿喖澧庨幑銏犫攽閸♀晛娈梻浣哥仢椤戝棛娆㈤弻銉︾叆闁绘棁娅ｅ畷鐢告煕閵夋垵鎷嬮崬鐢告⒒閸屾瑧顦﹂柣蹇旂箞椤㈡牠宕橀埡鍐炬锤濠电姴锕ら悧濠囨偂閵夆晜鐓涢柛鎰╁妼閿熻棄鎲＄粋宥嗐偅閸愨晝鍘搁梺绯曟閺呮稒鏅堕娑栦簻闁靛绲介崝锕傛煙椤旂晫鎳呴柟椋庡Ь椤︽彃霉閸忕厧濮嶉柡灞熷懐纾兼俊顖滃帶閳峰矂姊洪崫鍕拱缂佸鍨块崺銉﹀緞閹邦剛顢呴梺缁樺姌鐏忔瑩顢欓幒鎾茬箚闁绘劦浜滈敓鑺ョ墵楠炴劗鎷犲顔藉瘜闂佽姤锚椤﹁棄顭囬弽銊х鐎瑰壊鍠曠花濠氭煙绾懎鐓愰柕鍥у楠炴鎹勬潪鎵崟濠电姷顣介敓鍊熸珪閹牓鏌嶇憴鍕伌妞ゃ垺鐟у☉闈涚暋妫颁胶鐭楀┑锛勫亼閸娿倝宕㈡ィ鍐ㄧ婵鎷烽柟顔诲嵆椤㈡瑩鎸婃径宀�鐛梻浣筋潐濠㈡﹢鎮樺璺虹柧妞ゅ繐鐗婇埛鎴︽偣閹帒濡奸柡瀣懄娣囧﹪顢曢姀鐙�浼冮梺鎸庣箘閸嬬姷绮诲☉銏犵濞达綀顫夐妵婵囥亜閵忊剝顥堢�规洏鍔戦、妯衡攽閸喐姣庨梻鍌氬�搁崐宄懊归崶顒婄稏濠㈣埖鍔﹂弫濠囨煛瀹ュ骸骞栫紒鎰殕娣囧﹪濡堕崨顔兼缂備胶濮烽崰搴ㄥ煘閹达箑纾兼慨姗嗗幖閺嗗牓姊虹紒妯诲暗闁哥姵鍔欐俊鐢稿礋椤斿墽鏉搁梺鍦亾閸撴碍瀵肩仦瑙ｆ斀闁宠棄妫楅悘鏌ユ煙妞嬪骸鍘存慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍闂備礁鎼悧婊堝礈閻旂厧绠氶柛鏇ㄥ灱閺佸秵鎱ㄥΟ鐓庡付婵炲牄鍔岄—鍐Χ閸℃鈹涢梺鍦厴閺�閬嶃�冮妷鈺傚�烽弶鍫熷礃閿熷�熸硶閿熻姤顔栭崰鏍偉婵傚摜宓侀悗锝庡櫘閺佸洦绻濋棃娑氬妞わ讣鎷�
				fire.pb.PropRole hostprole = new fire.pb.PropRole(hostid, true);
				Role hostrole = RoleManager.getInstance().getRoleByID(hostid);
				if(hostrole != null){
					if(COffTitle.isLiveDieTitle(hostprole)){
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162088, null);
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍔肩兘鏁撴禒瀣拻濞达絼璀﹂悞鐐亜閹寸偛鐏╅柟骞垮灩閳规垹锟斤綆浜ｉ幗鏇㈡倵楠炲灝鍔氭い锔诲灡鐎靛ジ鎮╃紒妯煎幈闂佸搫娲㈤崝灞炬櫠椤旂晫绠鹃柛婊冨暟缁夘喗鎱ㄦ繝鍌ょ吋鐎规洘甯掗～婵嬵敄鐠恒劍鏅奸梻鍌欑劍閹爼宕濆畝鍕亯闁绘挸瀵掗崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮鏉戝濡炪倖鎸诲钘夘潖濞差亜绠伴幖杈剧悼閻ｇ敻姊洪悷鏉跨骇闁烩晩鍨堕悰顔嘉熼崨闈涢叄椤㈡牜鎹勯妸褎鏅ㄩ梻鍌氬�风欢姘焽瑜旇棟濞寸姴顑呴崹鍌炲级閸碍娅旈柟宄板槻椤繈鎮欓锟介锟�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鏌涜箛鎾虫倯婵絽瀚板铏圭磼濡櫣鐟ㄩ梺鍛婅壘椤戝洭骞戦姀鐘闁靛繒濮烽鎺楁煟鎼达絾鏆╂い顓炵墦瀵娊鏁撻悩鏂ユ嫼闂侀潻瀵岄崢濂稿储鐎涙ǜ浜滈柕澶涢檮瀹曞矂鏌℃担瑙勫磳鐎规洘鍔欓幃銈嗘媴閸︻厾啸濠电姷鏁搁崑娑橆嚕閸撲焦宕查柛顐犲劜閺呮煡鏌ｉ幇顓熺稇缂佸墎鍋熼敓鐣屾閹风兘鏌ㄩ悢鍓佺煓闁诡垰鏈鍕箛椤撶姴骞嶉梻浣虹帛閸ㄦ儼鎽銈冨劜閻楃娀寮婚悢鍓叉Ч閹肩补锟藉啿绠ｉ梻浣芥〃閻掞箓宕濋弽顓炵畾闁哄倸绨遍弨浠嬫煕椤愶絿绠撴慨锝呯墕閳规垿鏁嶉崟顐℃澀闂佺锕ラ崹鍨暦閺囥垺鍤戞い鎺嶇鎼村﹪姊虹粙璺ㄧ伇闁稿鍔欓弫鎾绘嚍閵夛富妫冮悗瑙勬礃閿曘垽銆佸▎鎾冲簥濠㈣鍨板ú锕傛偂閺囥垺鐓冮柍杞扮楠炴ɑ銇勮箛鎾跺婵懓寮舵穱濠囧Χ閸涱喖娅ら梺鎶芥敱閸ㄥ潡寮诲☉妯锋斀闁告洦鍋勬慨搴ㄦ倵濞戞瑧绠炴慨濠勭帛閹峰懐绮欑捄銊ф晨缂傚倸鍊哥粔宕囨濮樿埖鍋樻い鏇嫹鐎规洘锕㈡俊鍛婃償閿濆懏鐏侀梺褰掝棑婵烇拷闁瑰磭濞�椤㈡宕掑鍐偊闂傚倸鍊搁崐椋庣矆娴ｈ櫣绀婂┑鐘叉搐绾捐鈹戦悩鍙夋悙闁稿被鍔岃灃闁挎繂鎳庨弳娆撴煕鐏炶濮傞柡宀�鍠栧鑽わ拷鐢殿焾婵′粙姊洪幎鑺ユ暠闁搞劌娼″璇测槈濡攱顫嶅┑顔筋殔閻楀﹪寮崜褏纾藉〒姘攻鐎氬綊鏌ｆ惔顖滅У闁稿妫涚划濠氬箚椤�崇秺閺佹劙宕ㄩ鐔哥槪婵犵數鍋犻婊呯不閹惧磭鏆﹂柟鐗堟緲闁卞洭鏌￠崶鈺佹灁闁告妫勯埞鎴﹀煡閸℃浠撮梺绋款儐閸旀寮灏栨闁靛骏绱曢崢浠嬫⒑鐟欏嫬鍔ゆい鏇ㄥ弮楠炲﹪宕熼娑氬帾闂佹悶鍎滈崘鍙ョ磾闁诲孩顔栭崰鏇犲垝濞嗘劒绻嗘慨婵嗙焾濡插ジ姊洪棃鈺冪У闁哥姵鐗犻垾鏃堝礃椤斿槈褔鐓崶銊ュ毈闁告艾鎳樺濠氬磼濮橆剦浠奸柣搴㈡皑婢ф绌辨繝鍥ㄥ仺缂佸娉曢ˇ鏉款渻閵堝棛澧痪鏉跨Ч钘熸繝闈涱儐閻撶喖鏌ｅΟ鍝勫笭闁煎壊浜弻娑㈠棘閸ф寮板銈冨灪閻熲晠鐛幒鎳虫梹鎷呴崣澶婎伖闂傚倷娴囧畷鐢稿窗閹邦厾鐝堕柛鈩冪♁閺咁剛锟藉箍鍎遍幊澶愬绩娴犲鐓熼柟瀛樼箖婢跺嫰鎮楀鎰佹綈濞ｅ洤锕幃娆擃敂閸曡埖瀚归柟杈剧畱閸ㄥ倹绻涘顔荤暗闁跨喕妫勯崯顖滄崲濠靛纾兼繝濠傚椤旀洟姊绘担鍛婅础闁稿簺鍊濆畷娲醇閵夛箑浜楅梺闈涱槴閺呮粓鎮￠弴銏＄厸闁搞儺鐓侀鍛箚濞寸姴顑嗛崐鐢告煕椤垵浜芥繛鍫熸閺屽秶鎲撮崟顐や紝闂佽鍠掗弲鐘茬暦瑜版帩鏁冮柨婵嗘濡叉垿姊婚崒娆掑厡妞ゎ厼鐗撻、鏍炊椤掞拷绾惧鏌曢崼婵囧櫧闁哄棴濡囬幉鎼佹偋閸繄鐟ㄩ梻浣稿船濞差參寮婚敓鐘茬倞闁宠桨妞掗幋宄邦渻閵堝棙鐓ユ繛宸幖椤繑銈︾憗銈勬睏闂佸湱鍎ら幖顐ゆ閻㈢數纾藉ù锝囩摂閸熷洨绱掔紒妯肩畵妞ゆ洩缍侀、鏇㈡晝閿熺晫绮堢�ｎ偁浜滈柡宥冨妿閵嗘帡鏌涘Ο鍝勮埞妞ゎ亜鍟存俊鍫曞幢濡わ拷椤孩绻濆▓鍨灍闁瑰憡濞婇獮鍐潨閿熶粙銆侀弮鍫濆耿妞ゆ挾鍠庨鍫曟煟閻斿摜鎳冮悗姘煎幘缁牓宕橀鐣屽幗闂佺懓鐏濈�氼喚寮ч敓浠嬫倵濞堝灝鏋︽い鏇嗗洤鐓″鑸靛姇椤懘鏌ｅΟ鍏兼毄闁哄鎮傚濠氬磼濮橆剨鎷烽幖浣瑰亱濠电姴瀚惌娆撴煙閻戞﹩娈曢柛濠傜埣閺屾盯顢曢悩鑼紕缂佺偓宕樺Λ鍕箒闂佹寧绻傞幊蹇涘箚閸喆浜滈幖娣灪鐏忕數绱掓潏銊ユ诞闁瑰磭濞�椤㈡鏁撻懞銉ь洸闁告挆鍛紲閻庣櫢鎷烽柛鎰靛枛閹界數绱撴担铏瑰笡缂佽鐗嗛悾鐑藉醇閺囩喎娈濋梺鍓茬厛閸嬪懘鎮甸鈶╂斀闁绘ê鐏氶弳鈺佲攽椤旇姤灏﹂柡浣稿暣婵″爼宕堕柨瀣伓濠殿喗顭囬崢褎鏅堕锟介弻宥囩磼濡鏆楁繛瀵稿缁犳挸鐣峰鍡╂Ь闂佷紮绠戦悧鍡涘煘閹达附鍊烽柤纰卞墮椤ｆ椽姊虹拠鑼缂佽鍊块崺銏狀吋閸涱亝鐎婚梺瑙勫劤椤曨參宕㈤悽鍛娾拺闁告稑锕ら悘鐔兼煕婵犲啰澧遍柨鐔诲Г閻旑剟骞忛敓锟�
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
				if(hostliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(hostliveDieRoleInfo.getObjectid(),true).getName();
						if(objectid==hostliveDieRoleInfo.getObjectid()){
							//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠撮悗娈垮枛閻栫厧鐣烽悡搴僵妞ゆ挾鍠撹ぐ鍛存⒒娴ｈ鍋犻柛鏂跨Ф閹广垽宕橀鍢夛箓鏌涢弴銊ョ仩闁告劧鎷锋俊鐐�栭崝锕�顭块敓鐣岀磼椤旂厧顣崇紒杈ㄦ尰缁楃喐绻濋崘顭戜紦婵犵數濮伴崹鐓庘枖濞戙埄鏁勯柛鏇ㄥ幗瀹曟煡鏌涢埄鍐檨闁绘挸绻橀弻娑㈩敃閿濆洨鐣洪梺闈╃稻濡炰粙寮诲☉銏℃櫜闁搞儯鍔屽▓灞筋渻閵堝倹娅呴柕鍫㈩焾閻ｇ兘濡搁埡濠冩櫍濠电偞鍨堕悷锕傚级閸涘﹣绻嗛柣鎰典簻閿熻姤鐗曢～蹇氥亹閹烘垵鍤戠紓鍌欑劍椤洭鎮风憴鍕闁瑰瓨鐟ラ悘顏堟煟閹惧瓨绀嬮柡宀�鍠栧畷褰掝敊绾板彉绱戦梻浣风串缁插潡寮幖浣规櫢闁稿﹦鍣ュ鎰箾鐠囇呯暤鐎规洖婀遍幑鍕惞鐟欏嫭顔曢梻渚�娼ц噹鐎广儱妫楅璺衡攽閻愭潙鐏﹂柣鐕佸灦閹偞绂掔�ｎ偆鍘卞┑鈽嗗灠閹碱偊鍩涢弮鍌滅＜閺夊牄鍔屽ù顕�鏌熼鐣屾噰妞ゃ垺顨嗛幏鍛村传閸曨偅顓奸梻浣筋嚙濮橈箓锝炴径濞掓椽鏁冮崒姘鳖槶濠殿喗顭堝▔娑㈡偪妤ｅ啯鐓犻柟闂寸劍濞懷勩亜閺囶澀鎲鹃柟顔筋殔閳藉鈻庡Ο鐓庡Ш闂備礁鎲＄湁缂侇喗鐟ラ～蹇撁洪鍜佹濠电偞鍨兼ご姝屽�撮梻鍌欒兌椤牏锟芥稈鏅犻幃锟犲灳瀹曞洦娈鹃梺姹囧灮椤牓鎮欐繝鍐︿簻闁瑰搫绉烽崗宀勬煕濡粯鍊愰柡宀嬬秬缁犳盯寮撮悙鎵崟濠电姭鎷冮崒婊呯厯闂佺硶鏂傞崕鎻掝嚗閸曨垰绠涙い鎾跺Т鐢姊洪懡銈呅㈡繛璇х畵閹繝鏁撻悩鑼厬闂佸憡娲﹂崜锕�鈻撴禒瀣厽闁归偊鍓欑痪褔鏌涢悩鎴愭垿濡甸崟顖氼潊闁宠棄妫欓悿渚�鎮楃憴鍕閻㈩垱甯￠崺銏℃償閵娿儳顓洪梺缁樼懕閹烽攱淇婄拠褎瀚�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鈽夊搴⑿俊鐐�戦崝宀勫箠濮楋拷楠炲啴宕稿Δ浣革拷閿嬨亜閹存繂缍栫紒銊ヮ煼濮婅櫣鎲撮崟顐闂佸搫鎳忛惄顖炲极閹剧粯鍤嶉柕澶樺枟閻ｉ绱撴担鍓插剰妞わ富鍨堕、姗�宕楅悡搴ｇ獮闁诲函缍嗛崜娆忣嚕閹惰姤鈷掑ù锝堟鐢稒绻涢崣澶屽⒌鐎规洘鍔欏畷鐑筋敇閵婏箑顏跺┑顔筋焽閸嬫挾锟芥熬鎷�162073
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162073, Arrays.asList(name));
						}else{
							//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠撮悗娈垮枛閻栫厧鐣烽悡搴僵妞ゆ挾鍠撹ぐ鍛存⒒娴ｈ鍋犻柛鏂跨Ф閹广垽宕橀鍢夛箓鏌涢弴銊ョ仩闁告劧鎷锋俊鐐�栭崝锕�顭块敓鐣岀磼椤旂厧顣崇紒杈ㄦ尰缁楃喐绻濋崘顭戜紦婵犵數濮伴崹鐓庘枖濞戙埄鏁勯柛鏇ㄥ幗瀹曟煡鏌涢埄鍐檨闁绘挸绻橀弻娑㈩敃閿濆洨鐣洪梺闈╃稻濡炰粙寮诲☉銏℃櫜闁搞儯鍔屽▓灞筋渻閵堝倹娅呴柕鍫㈩焾閻ｇ兘濡搁埡濠冩櫍濠电偞鍨堕悷锕傚级閸涘﹣绻嗛柣鎰典簻閿熻姤鐗曢～蹇氥亹閹烘垵鍤戠紓鍌欑劍椤洭鎮风憴鍕闁瑰瓨鐟ラ悘顏堟煟閹惧瓨绀嬮柡宀�鍠栧畷褰掝敊绾板彉绱戦梻浣风串缁插潡寮幖浣规櫢闁稿﹦鍣ュ鎰箾鐠囇呯暤鐎规洖婀遍幑鍕惞鐟欏嫭顔曢梻渚�娼ц噹鐎广儱妫楅璺衡攽閻愭潙鐏﹂柣鐕佸灦閹偞绂掔�ｎ偆鍘卞┑鈽嗗灠閹碱偊鍩涢弮鍌滅＜閺夊牄鍔屽ù顕�鏌熼鐣屾噰妞ゃ垺顨嗛幏鍛村传閸曨偅顓奸梻浣筋嚙濮橈箓锝炴径濞掓椽鏁冮崒姘鳖槶濠殿喗顭堝▔娑㈡偪妤ｅ啯鐓犻柟闂寸劍濞懷勩亜閺囶澀鎲鹃柟顔筋殔閳藉鈻庡Ο鐓庡Ш闂備礁鎲＄湁缂侇喗鐟ラ～蹇撁洪鍜佹濠电偞鍨兼ご姝屽�撮梻鍌欒兌椤牏锟芥稈鏅犻幃锟犲灳瀹曞洦娈鹃梺姹囧灮椤牓鎮欐繝鍐︿簻闁瑰搫绉烽崗宀勬煕濡粯鍊愰柡宀嬬秬缁犳盯寮撮悙鎵崟濠电姭鎷冮崒婊呯厯闂佺硶鏂傞崕鎻掝嚗閸曨垰绠涙い鎾跺Т鐢姊洪懡銈呅㈡繛璇х畵閹繝鏁撻悩鑼厬闂佸憡娲﹂崜锕�鈻撴禒瀣厽闁归偊鍓欑痪褔鏌涢悩鎴愭垿濡甸崟顖氼潊闁宠棄妫欓悿渚�鎮楃憴鍕閻㈩垱甯￠崺銏℃償閵娿儳顓洪梺缁樼懕閹烽攱淇婄拠褎瀚�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鈽夊搴⑿俊鐐�戦崝宀勫箠濮楋拷楠炲啴宕稿Δ浣革拷閿嬨亜閹存繂缍栫紒銊ヮ煼濮婅櫣鎲撮崟顐闂佸搫鎳忛惄顖炲极閹剧粯鍤嶉柕澶樺枟閻ｉ绱撴担鍓插剰妞わ富鍨堕、姗�宕楅悡搴ｇ獮闁诲函缍嗛崜娆忣嚕閹惰姤鈷掑ù锝堟鐢稒绻涢崣澶屽⒌鐎规洘鍔欏畷鐑筋敇閵婏箑顏跺┑顔筋焽閸嬫挾锟芥熬鎷�162074
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162074, Arrays.asList(name));
						}
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘⒐閸ㄦ繂顫濋敂鍓х＝闁稿本鑹鹃敓鑺ユ倐瀹曟劙鎮滈懞銉ユ畱闂佸吋鎮傚褔宕归弮鍫熷�甸梻鍫熺♁閹插摜绱掗敓鑺ョ節閸屾﹫鎷烽幒鎴僵闁绘劦鍓欓鍫曟煟鎼淬埄鍟忛柛鐘崇墵閳ワ箓鎮滈挊澶岀暫闂侀潧绻堥崐鏍磻閺嶎厽鍊垫繛鎴烆仾椤忓牜鏁傞柛顐ｆ礃閳锋垶鎱ㄩ悷鐗堟悙闁诲浚浜濋妵鍕籍閿熶粙鎮ч悩璇茬畺闁绘劕鎼粻姘亜椤戞枻鎷峰畷鍥┬ㄩ梺璇″櫘娴滎亜鐣烽妸鈺婃晣鐟滃酣宕板Ο鑲╃＝闁稿本鐟х拹浼存煕閿濆骸娅嶇�规洩缍佸畷姗�顢欓幆褏銈﹂梺璇插嚱缂嶅棝宕板Δ鍛柧婵犲﹤鐗婇崑鈩冪箾閸℃鎳呯紒瀣煼閹顫濋鎯т划濠殿喖锕︾划顖炲箯閸涙潙宸濆┑鐘插�瑰▓妯肩磽閸屾瑧顦︽い鎴濇瀹曞綊宕稿Δ锟介弸渚�鏌涢幇闈涙灍闁哄懏绻堥弻娑氫沪閻愵剛娈ら梺鍝勮嫰閻楁挸顫忓ú顏呭殐闁冲湱鍋撶�氭盯姊洪崨濠冨鞍缂佸鎸荤粩鐔煎即閻旀椽妾梺鍛婄☉閿曪箓宕㈤挊澶嗘斀闁宠棄妫楅悘鐘绘煙绾板崬浜扮�殿喗濞婇弻鍡楊吋閸℃瑥骞楅梻濠庡亜濞诧箓骞栭埡鍛惞闁绘柨鍚嬮悡銉╂煟閺傚灝娈╅柟椋庡厴閹倖鎷呴崷顓犘ュ┑鐘垫暩閸嬫稑顕ｉ崼鏇熸櫇闁靛繈鍊曠粻鏍煟閹达絾顥夐柣鎾寸洴閺屾稑鈽夐崡鐐茬闂佽瀵掗崜鐔煎箖濡ゅ懐宓侀柛顭戝枛婵骸顪冮妶蹇撶槣闁搞劌纾崚鎺楀醇椤喗瀚归柨婵嗛娴滄牕霉濠婂嫮鐭掗柡宀�鍠栭獮鎴﹀箛椤撶姰锟芥劕顪冮妶鍛劉闁圭澧藉Σ鎰板箳閹惧绉堕梺闈浤涢崘銊у摋濠电姵顔栭崰鏍晝閿旀儳鍨濇い鏍ㄧ矋瀹曞弶绻濋棃娑欏闁稿海鍠栭弻宥夊Ψ閵娿儳姣㈤梺鐑╂櫅鐎涒晝鎹㈠┑瀣仺闂傚牊绋愰崫妤�顪冮妶鍡樼缂侇喖娴烽崚鎺撶節濮橆剛顔掗梺褰掝暒缁�浣糕枔閵婏妇绡�闁汇垽娼ф牎闂佺厧婀遍崑鎾诲磿椤愶附鈷掑ù锝囨嚀椤曟粍绻涘ù瀣珚妤犵偛绻戦ˇ鐗堟償閿濆浄绱查梻浣告啞閹搁绮堟担鍦浄鐟滄棃寮婚妸鈺傚亜缂備焦锕╁Λ鍕磽娴ｅ搫孝缂佸鎳撻悾鐑藉即閵忥紕鍔堕悗瑙勬尪閸庡崬煤閿旀拝鎷锋担鍐ㄤ汗闁跨喕濮ょ粙鎺楁晪婵炲瓨绮嶉〃濠傤潖濞差亜浼犻柛鏇ㄥ墮缁愭盯姊洪崫銉バｉ柟绋垮⒔閸掓帞绱掑Ο绋夸簼闂佸憡鍔忛弲婵嬪储闁秵鈷戦柡鍌樺劜濞呭懘鏌涘锟界粻鏍�侀弮鍫濆窛妞ゆ梻鍘ф导搴ㄦ⒒娴ｇ懓顕滄慨濠傤煼瀵煡顢曢妶鍥︾瑝婵°倧绲介崯顖炴偂閺囩喆浜滈柟鎵虫櫅閿熻姤娲熷鎼佸籍閸喓鍘甸梺鍛婂姇瀵爼宕抽悾宀�纾奸弶鍫涘妼缁楁碍绻涢悡搴ｇ濠碘剝鎮傛俊鐤檨闁稿骸鐭傚缁樻媴閸濄儳楔濡炪們鍎查幐鑽ゆ崲濞戙垺鏅搁柤鎭掑労濞堜粙鏌ｉ幇顒傛憼鐎规洖鏈〃銉╂倷閺夋垶璇炲Δ鐘靛仦閿曘垽鐛弽顓ф晣闁绘劕鐡ㄩ悵銊╂⒒閸屾艾锟藉嘲霉閸ヮ剦鏁嬬憸宥夛綖濠靛鏅濋柛宀嬪缁嬪繑绻濋姀锝嗙【闁冲彞绶氬畷顐﹀礋鎼达絽鏋涢柟鐓庢贡閹叉挳宕熼鍌涙闂傚倸鍊风粈浣虹礊婵犲伣娑㈠锤濡や讲鎸冮悗骞垮劚椤︿即寮查幖浣圭厵閻庢稒锚缁椦呯磼閹邦厽鈷掗柨鐔诲Г椤旀牠宕板Δ鍛闁惧浚鍋呴崣蹇涙煥閻斿墎鐭欓柡宀嬬到椤粓鏁撻挊澶樼劷鐟滃酣骞堥妸鈺侀唶闁哄洨鍟块幏缁樼箾鏉堝墽鍒伴柟璇х節瀹曨垶鎮欓悜妯煎幈闂佸搫鍟幑鍥ь瀶椤斿墽纾奸柛灞炬皑瀛濋梺瀹狀潐閸ㄥ灝鐣锋總鍛婃櫜闁告稑鎷戠换婵嗩潖閾忓湱纾兼俊顖氭惈椤酣姊虹粙璺ㄦ槀闁稿﹥绻堝畷鍝勨槈閵忕姷顔婇梺鍦仺閸斿瞼绱炴繝鍥ф瀬闁圭増婢樺婵囥亜閺冨洦纭舵い銏犳噺缁绘繈鎮介棃娑憋拷鎾绘煙瀹勬澘妲婚棁澶愭煟濡儤鈻曢柛搴㈠姍閺岋綁骞樼�涙顦伴梺鍝勭焿缁绘繂鐣烽幒鎴旀斀闁搞儮鏂傞敓钘夛躬濮婅櫣鎷犻懠顒傤啋婵炲瓨绮岄悥鐓庮嚕婵犳艾惟闁冲搫鍊告禍婊堟煟閻樺弶澶勯柣锝庡亰楠炴绱掑Ο鐓庡箞闂備胶鎳撻悺銊ф崲閸曨厾鐭撻柧蹇曟閹烽鎲撮崟顒傗敍缂傚倸绉崇粈渚�鎮惧畡閭︽建闁跨喕濮ゆ穱濠傤潰瀹�濠冃繝鐢靛仜閻楁挾绮婚弽顓炵畺鐎瑰嫰鍋婇悡銉╂煕濞戝崬寮鹃柡鍡╁弮閺岋綁濮�閳轰胶浠氶梺鍝勬噽婵挳顢氶敐澶樻晝闁挎洩鎷锋鐐灪娣囧﹪鎮欑�涙顦ョ紓鍌氱Т閿曨亜顕ｉ锕�绠涢柡澶婃健閸炶泛鈹戦悙鏉戠伇婵炲懏娲滈敓鑺ヨ壘缂嶅﹪寮婚妸鈺傚亜闁告挷鑳堕悡鎾绘⒑閸濆嫮鐒跨紒杈ㄦ礋閺佹捇寮妶鍥┬氶梺绯曟櫆閻楁粓鏁撻懞銉у暡闁瑰嚖鎷�?
				Long selfid=xtable.Livedie2key.select(hostid);
				if(selfid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(selfid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(selfid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162076, Arrays.asList(name));
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告梹鎮傚鍝勑ч崶褝鎷峰┑鍫笉闁哄稁鍘奸拑鐔猴拷骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰鎮肩紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘▎鎴犵煔閺夊牄鍔庣弧锟介梺鎼炲労閻忔稖顦归柡灞剧☉閳藉宕￠悙瀵镐邯婵犵數鍋涢幊宀勫磹濠靛棭娼栭柧蹇撴贡閻瑦绻涢崱妯哄姢闁告挻婢橀—鍐Χ韫囨搩娲梺杞版祰椤曆囶敋閿濆棛绡�婵﹩鍎甸埡鍛厪濠㈣泛鐗嗛悘顏堟煛閸岋附瀚归梻鍌氬�烽懗鍓佹兜鐠轰警鐎剁憸鏂款嚕閹绘帩鐓ラ柛鏇炵仛椤斿嫰姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞测晠骞忛悜鑺ュ亗闁靛牆妫欓崣蹇斾繆閵堝拋鍎愰悗姘愁潐缁绘繄鍠婃径宀�锛熼梺杞版祰椤曆囨偩閻戣姤鍋勭痪鎷岄哺閺咁剙鈹戦绛嬬劸濞存粠鍓熷鍫曞箹娴ｅ厜鎷绘繛杈剧到閹诧繝宕悙鐑樼厵闁告縿鍎遍崢鎾煙閾忣偒娈滅�规洖銈稿鎾偄閸涘﹦褰ㄩ梻鍌欒兌缁垶寮婚妸鈺佽Е閻庯綆鍠栭悡鏇㈡煙鏉堥箖妾柣鎾跺Т閳规垿顢欓挊澶婎潓闂佽法鍠曟慨銈吤洪悢濂夊殨闁归棿绀佺粻锝夋煥閺冨倹娅曢柛姗�浜跺娲传閸曨偅鐏曢梺褰掝棑閸忔﹢寮婚敐澶嬪亜闁告瑥顦伴悵鏂款渻閵堝棙绌跨紒鎻掑⒔閹广垹鈹戦崱鈺傚兊濡炪倖鎸鹃崰鎰邦敂閻斿吋鈷掑ù锝堟鐢盯鎷戦柆宥嗙厽闁瑰灝瀚弧锟介悗瑙勬处閸撴盯骞戦崟顓熷仒闁斥晛鍟弶鎼佹⒒娴ｈ櫣甯涙い顓炵墢娴滅鈻庨幇顕呮祫濠电偞鍨崹娲偂閺囥垺鐓涢柛鎰鐎氬綊姊虹紒姗嗘畷妞ゃ劌锕俊鎾礃閵娿垺鐎婚梺鐟板⒔鐞涖儵骞忔繝姘拺缂佸瀵у﹢浼存煟閻曞倸顩紒顔硷躬閹囧醇濠婂懐鐣炬繝纰夌磿閸嬬喖宕㈣閹便劑宕掗悙瀵稿幍濡炪倖姊归崕铏闁秵鐓涘ù锝囶焾閺嗭絿锟借娲樼敮鎺楋綖濠靛浂娼欓柡宓嫭姣嗛梻鍌氬�搁崐椋庣矆娴ｈ櫣绀婂┑鐘蹭迹濞戞碍宕夐柕濠忓瘜閸嬨劑姊洪棃娑氬婵炲眰鍔庣划鍫熺節閸ャ劎鍘搁悗骞垮劚妤犳悂鐛Δ鍛厽闁规儳纾粻濠氭煟閹垮啫浜扮�规洘鍎奸¨渚�鏌涙惔锛勭闁哄矉缍�缁犳盯鏁愰崨顔句壕闂備焦鐪归崕鐑樼椤忓牏宓侀柛鈩冨嚬濡插姊虹拠鈥虫灍闁搞劋绲昏ぐ渚�姊洪幖鐐插妧鐎广儱鐗嗛幆鍫熶繆閻愵亜锟芥垿宕归搹鍦煓闁硅揪绠戦悡姗�鏌熸潏鍓х暠闁绘劕锕弻锟犲醇閵夛附閿梺纭呮椤戝棛鎹㈠┑瀣仺闂傚牊绋愮划璺侯渻閵堝棙澶勯柛妯圭矙楠炲牓濡搁埡鍌氫缓闂傚倸鐗婄粙鎴︽倶婵犲洦鐓欓柤鍦瑜把呯磼閺屻儳鐣洪柨婵堝仱瀵挳濮�閿涘嫬骞嶉梻浣筋嚃閸ㄥ酣宕ㄩ钘夋灈婵犵數濮甸鏍垂闁秴绠伴柟鎯版閽冪喐绻涢幋娆忕仼缂佺姴顭烽弻娑㈠箛椤栨氨姣㈡俊銈囧Т濞差參寮婚埄鍐╁闁告縿鍎遍·锟界紓鍌欒兌缁垳鎹㈤崼銉ョ畺濞寸姴顑嗛ˉ鍫熺箾閺夋垵顣抽柛瀣ㄥ�濆璇测槈閵忕姈鈺呮煥閺傛娼熷ù鐘灲濮婃椽鎮欓挊澶婂Х缂備胶濮甸幐鎼佹偩闁垮闄勭紒瀣嚦閵娾晜鐓忓璺猴工閸よ京绱掗悩铏磳鐎殿喖顭烽幃銏ゅ礂閻撳簼缃曢梻浣稿閸嬪棝宕伴幘璇茬闁跨喓濮甸埛鎺懨归敐鍡樼伄濡ょ姴绻橀弻娑欑節閸愵亜顫х紓浣哥焷妞村摜鎹㈠┑瀣倞妞ゎ剦鍎搁崶銊у幈闂佸搫娲㈤崝宀勭嵁閺嵮�鏀介梽鍥涢崟顖氱厴闁硅揪闄勯崐鐑芥煕濞嗗浚妲告繛鍛�濆铏圭磼濮楀棙鐣兼繝鐢靛剳閹风兘鎮楀▓鍨灈妞ゎ厾鍏樺顐﹀箛閺夊潡鍞堕梺闈涚箞閸ㄥ搫顭块幋锔解拻濞达絽鎲￠幆鍫熺箾鐏炲倸濮傜�规洘鍨甸～婊堟晸閽樺鏆︽い鎰ㄦ嚒閺冨牆宸濇い鏃囶潐鐎氳偐绱撻崒娆戭槮妞ゆ垵妫濋、鏍р枎閹惧磭锛熼梺瑙勫婢ф鎮￠弴銏＄厸闁告劖瀵х�氬綊姊洪懡銈呮毐闁哄懐濞�閹即顢氶敓钘夌暦濮楋拷婵℃瓕顦虫繛鍫熺箞濮婃椽鏌呭☉姘便偡濠电偛鎳忓ú鐔奉嚕椤掑嫭鏅稿ù鐘差儐閳锋垿鎮归崶銊ョ祷闁搞倛浜槐鎾愁吋閸涱噮妫﹂悗瑙勬礃閸ㄥ灝鐣烽崡鐐╂婵☆垰鎼禍璺衡攽鎺抽崐褏寰婃禒瀣柈妞ゆ牜鍋涢悡鏇㈡煙鏉堥箖妾柣鎾寸懄閵囧嫰寮借椤ユ粓鎮楀鐓庢珝闁靛棗鎳忕�佃偐锟芥稒菤閹疯櫣绱撴担鍓插剱妞ゆ垶鐟╁畷鏇＄疀濞戞瑥锟藉灚鎱ㄥ鍡椾簻鐎规挸妫欓〃銉╂倷閹绘帗娈柧浼欑秮閺屻倖鎱ㄩ幇顒婃嫹濡ゅ懏鍎婇柛顐犲劜閳锋垿鏌涘☉姗堟敾濠㈣泛瀚伴弻娑橆潨閿熺晫绮婚弽顓炴瀬鐎广儱鎷嬮悡銉╂煕閹板墎绋婚柡鍌︽嫹闂備礁婀遍崕銈嗙箾婵犲倻鏆﹂柟閭﹀灱濡嫬螖閻橀潧浠滅紒缁橈耿楠炲啫顭ㄩ崼鐔锋疅闂侀潧锛忛崘銊ь吋闂傚倸鍊烽悞锕傚磿閸愯鐟邦潩鐠鸿櫣锛涢梺鐟板⒔缁垶宕甸敓浠嬫⒑缁夊棗瀚峰▓鏇㈡煟閹捐泛鏋戠紒缁樼洴楠炲鈹戦崱姘厴闂備礁鎼鍐磹濠靛钃熼柕濞炬櫆閸嬪嫰鏌涘☉姗堝姛濞寸厧瀚槐鎾诲磼濮樻瘷銏′繆椤愶絿绠炵�殿噮鍋婇獮姗�宕滄笟锟介埞蹇涙煟鎼搭垳绉靛ù婊勭矌缁粯绻濆顓涙嫼闂佸憡绺块崕杈ㄧ墡闂備胶绮〃鍫熺箾閿熶粙鏌ｅ☉鍗炴珝鐎规洘锕㈤、娆撴寠婢舵稒瀚瑰┑鐘崇閻撱垺淇婇娆掝劅婵℃彃鎼灃闁绘ê寮堕幖鎰版煃鐟欏嫬鐏撮柟顔界懇瀹曪絾寰勫Ο浼欓獜闂傚倷鑳堕…鍫ヮ敄閸℃稑绠伴柟闂寸劍缁犳帡姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
				fire.pb.PropRole guestprole = new fire.pb.PropRole(objectid, true);
				if(COffTitle.isLiveDieTitle(guestprole)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162089, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮跺娆撳煘閹达附鏅柛鏇ㄥ亜楠炲顪冮妶鍐ㄧ仾闁荤啿鏅犻獮鍐焺閸愨晛鍔呭銈嗘婵倗绮婃导瀛樷拻闁稿本鑹鹃敓鐣屽厴閹虫宕奸弴妤嬫嫹閿曞倸閱囬柣鏇氱劍椤旀棃姊洪崨濠勭細闁稿骸顭烽獮蹇撶暋閹佃櫕顫嶉梺鍦劋閹稿鎮靛顓犵瘈缁炬澘顦辩壕鍧楁煛娴ｇ瓔鍤欓柣锝囧厴閹垻鍠婃潏銊︽珫婵犳鍠楅…鍫熺椤掞拷椤洦寰勯幇顓涙嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鐓涢柛顐亜婢ф壆绱掗鐣屾噰妤犵偞甯掕灃濞达綁鏅查幋閿嬩繆閻愵亜锟芥洜鎹㈤幇鐗堝亱濠电姴娲ら悡鏇㈡煙鏉堥箖妾柣鎾寸懇閺屻倕霉鐎ｎ偅鐝旀繛瀵稿У缁矂鍩為幋锕�鐏抽柣鎰娴狀噣姊洪崫鍕拱婵炶尙鍠庨悾閿嬬附閸涘﹤浜滅紓浣割儏鐏忓懘骞忛悜钘夌疀妞ゆ洖妫欑�氳绻涢崼婵堜虎闁哄绋掗妵鍕敇閻樻彃骞嬮悗娈垮櫘閸嬪﹪鐛Ο鑲╃＜婵☆垵妗ㄥЧ妤呮⒒娴ｈ棄浜归柍宄扮墦瀹曟粓鏁冮敓钘夊祫閻熸粎澧楃敮妤呭煕閹烘鐓曢悘鐐村礃婢规﹢鏌ㄩ悢璇残撻柟顔煎�块獮鍐槼缂佺粯绻堝畷鐔碱敇閻橀潧骞嗛梻鍌欐祰椤宕曢幎绛嬫晪妞ゆ挴鍋撻敓钘夋嚇閹粓鎳為妷褍甯楅梻浣告啞缁诲倻锟芥凹鍙冨畷鍐裁洪鍛帗闂備礁鐏濋鍛存倶閹绢喗鐓欐い鏃囧亹缁夎櫣锟借娲栭悥濂稿极閹邦垳鐤�闁哄倹顑欐导鎾绘煟鎼淬値娼愭繛鍙夌墪鐓ら柨婵嗩槸缁狅綁鏌ｉ幋锝呅撻柍閿嬪笒闇夐柨婵嗙墛椤忕娀鎮介娑氭创闁诡喕绮欓、娑㈡晲閸曨厼鍤┑鐑囩到濞层倝鏁冮鍕殾闁割偅娲栭悡娑樏归敐鍛喐濞存粎澧楃换婵嬫偨闂堟稐绮跺┑鈽嗗亝閻熲晛鐣峰┑瀣嵆闁绘ɑ鍓氶崑銊╂⒑缂佹ê濮夋い锝庡櫍楠炲繘鎮滈懞銉ュ壃闂佸憡绋戦敃銈夘敂閸洘鈷戦悹鍥ㄥ絻閸よ京绱撳鍛棦鐎规洘鍨垮畷鐔碱敍閿濆棙娅嗛梻浣稿閸嬪懎煤濮楋拷閸╂盯骞嬮敂鐣屽幍缂備礁顑嗙�笛囧箲閿濆洨纾奸柣妯挎珪鐏忣參鎽堕弽顓熺厽婵☆垱瀵ч悵顏堟煕婵犲啫濮嶉柡宀嬬到閳藉宕￠悙瀵镐邯闂佸彞绱紞渚�寮婚妶鍚ゅ湱锟斤綆鍋呴悵鏍⒑閹稿海鈾佺紒顔芥尭椤繘鎼归崷顓狅紲濠碘槅鍨板ù姘閻愬鐝堕柡鍥ュ焺閺佸洭鏌ｉ弬鎸庡暈闁绘繄鍏樺鍝勑ч崶褏浠奸梺纭咁嚋缁绘繈骞冮垾鏂ユ婵鍋撶�氬綊鏌ｈ閹诧紕锟芥艾缍婂铏规崉閵娿儲鐎虹紓渚囧枟閻熴儵鎮鹃柨瀣嚤闁哄鍨归鎺旂磽閸屾瑧鍔嶉拑杈ㄧ箾閸涱偄鐏叉慨濠冩そ瀹曟姊荤壕瀣劵闂備胶顭堢�涒晜绻涙繝鍥ф槬闁挎梻鏅悷褰掓煥閻斿墎鐭欑�殿喛顕ч濂稿炊閳哄啰鏆ラ梻浣告啞缁诲倻锟芥碍鎮傞獮蹇涙倻閽樺鍞ㄥ銈嗗姂閸婃寰勯崟顖涒拺濞村吋鐟ч崚浼存煟椤掞拷閵堟悂骞嗙仦瑙ｆ瀻闁圭偓娼欐禒顖涚箾閹炬潙鍤柛銊﹀▕瀹曘垹鈽夊▎搴ｇ畾闂佽偐鈷堥崜娆撳储鐎涙ɑ鍙忓┑鐘插鐢盯鏌熷畡鐗堝殗闁瑰磭鍋ゆ俊鐤槹闁跨喕妫勯敃顏勵潖濞差亝顥堥柍鍝勫暟鑲栫紓鍌欒兌婵敻骞戦崶顒佸仒妞ゆ棁娉曢悿锟藉┑鐐村灦閻燂箑鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�
				xbean.LiveDieRoleInfo geustliveDieRoleInfo=xtable.Livedieroleinfotab.select(objectid);
				if(geustliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-geustliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(objectid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
						return false;
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆樻К缂備胶鍋撻崕鍐差焽閿熺姴钃熼柨婵嗩槸椤懘鏌曡箛濠冩珖闁告梹鎮傚鍝勑ч崶褝鎷峰┑鍫笉闁哄稁鍘奸拑鐔猴拷骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰鎮肩紒杈ㄦ尰閹峰懘鎮烽弶娆炬綌婵＄偑鍊戦崝灞轿涘▎鎴犵煔閺夊牄鍔庣弧锟介梺鎼炲労閻忔稖顦归柡灞剧☉閳藉宕￠悙瀵镐邯婵犵數鍋涢幊宀勫磹濠靛棭娼栭柧蹇撴贡閻瑦绻涢崱妯哄姢闁告挻婢橀—鍐Χ韫囨搩娲梺杞版祰椤曆囶敋閿濆棛绡�婵﹩鍎甸埡鍛厪濠㈣泛鐗嗛悘顏堟煛閸岋附瀚归梻鍌氬�烽懗鍓佹兜鐠轰警鐎剁憸鏂款嚕閹绘帩鐓ラ柛娑卞灡閸ｎ噣姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻渚�娼чˇ顐﹀疾濠婂牆鐤炬繝闈涱儐閻撳繐顭跨捄鐑橆棡婵炲懎鎳庨々濂稿川鐎涙ǚ鎷洪梺鍛婄☉閿曘儲寰勯崟顖涚厱闁靛鍊曞畵鍡欙拷瑙勬礃閿曘垽寮幘瀵割浄閻庯綆鍋�閹锋椽姊婚崒姘卞濞戞挾鎳撻埥澶婎潩椤愶絽濯伴梻浣虹帛閸旓箓宕滈敃鍌氱柈闁搞儺鍓氶埛鎺楁煕鐏炴崘澹橀柨鐔烘櫕閸忔﹢骞婂Δ鍛唶闁哄洦顨愰幏鐑芥晝閸屾岸鍞堕梺缁樻磻閻掞箓顢欓弮鍫熲拺鐟滅増甯楅敍鐔兼煟閹虹偟鐣电�殿喗褰冮埞鎴﹀炊閵夈倗鐩庨梻濠庡亜濞诧箓骞愰悙顒佹珷闁哄洢鍨洪悡銏ゆ煕閹板吀绨婚柡瀣洴閺屸�崇暆鐎ｎ剛袦閻庢鍣崳锝呯暦閹烘埈娼╂い鎴ｆ硶鐢稓绱撻崒姘拷鐑芥嚄閼稿灚鍙忛柣銏犵仛閺嗘粓鏌ㄩ悢鍝勑㈤柦鍐枛閺岋綁寮崹顔藉�梺绋匡功缁垱绌辨繝鍥舵晬婵犻潧娴傛禒鈺傜箾鐎电孝闁宦板妿閹广垹鈹戦崱蹇旂亖闂佸壊鐓堥崰妤呮倶閸儲鈷掑ù锝囶焾缁ㄨ崵绱撳鍕獢闁绘侗鍣ｅ畷姗�濡歌濞堟繈姊绘笟鍥у伎濠碘�虫喘瀹曪綁宕卞☉娆屾嫼闂佸憡绋戦敃銉﹀緞閸曨垱鐓曢柟鎯ь嚟濞插锟借娲橀悷鈺呭极閹剧粯鍋愰柡鍌樺劜鐎氳偐绱撻崒姘拷鐑芥倿閿曞倹鏅濋柍杞拌閺嬫棃鏌￠崘銊у闁绘挶鍎甸弻锟犲炊閺堢數鐩庡銈傛櫓閸撶喖寮诲☉銏犵闁规儳纾鍌炴⒑鐠恒劌鏋戦柡瀣吹缁辩偤宕卞Ο纰辨锤闂佸壊鍋呭ú鏍喆閿曞倹鍊甸柨婵嗙凹閹查箖鏌ｉ弬鎸庮棦闁诡喖缍婇幖褰掓偡閹殿喗顓婚柣搴ゎ潐閹爼宕曢悽绋胯摕闁靛牆顦痪褔鎮归幁鎺戝闁惧繐閰ｅ铏癸拷鍦濞兼劙鏌涢妸銉у煟闁绘侗鍠楃换婵嬪炊閵娧冨箞濠电姷鏁搁崐顖炲礃閳哄倹鍊风紓鍌欒兌婵參宕归崼鏇炶摕闁挎繂顦粻锝夋煥濠靛棙鍟楅柟鍓х帛閻撶喖鏌熼幑鎰【闁哄鐩弻鈥崇暆閿熶粙宕伴弽顓炵畺婵犲﹤鍚橀悢鍏煎殥闁靛牆鎳庡Ч鏌ユ⒒娴ｅ湱婀介柛鈺佸瀹曡瀵肩�涙ê浜梺缁樻尭鐎诡偄鈽夊▎鎰�撻梺鑽ゅ枑婢瑰棛绮ｉ悙鐑樼厽閹兼惌鍨崇粔鐢告煕閹惧娲撮柟顖欑窔瀹曞ジ鎮㈤搹鍦闂備焦鐪归崹钘夘焽瑜嶉悺顓㈡⒒娴ｄ警鐒鹃柨鏇樺�楃槐鐐寸節閸涱噯绱撻梻鍌欒兌缁垶宕濋弽顓熷仼妞ゅ繐鎳愰々鍙夌節婵犲倻澧㈤柛娆愭崌閺屾盯濡烽敐鍛瀴缂備緤鎷烽柨鐔剁矙閺屸�愁吋韫囨洜锛熺紓浣介哺閹稿骞忛崨瀛樻優闁荤喐澹嗛濂告⒒娴ｅ搫鍔﹂柡鍛櫊瀹曡瀵肩�涙ê浠奸梻浣哥仢椤戝洭姊介崟顖涚厱婵炴垶锕銉ッ瑰鍕煁濞ｅ洤锕幃娆忣啅椤旂厧澹堢紓鍌欓檷閸斿繘宕戦幇顑╋綁骞囬鑺ユ杸闂佹悶鍎绘俊鍥╃不濮樿埖鈷戦梻鍫熺〒婢ф洘绻涚仦鍌氾拷鏇㈠汲閳哄懏鈷掑ù锝勮閻掔偓銇勯幋婵囶棦闁诡垰瀚伴、娑㈡倷椤忓孩瀚瑰〒姘炬嫹鐎殿喕绮欓、姗�鎮欓懠顒傚春闂傚倷娴囬～澶愵敊閺嶎厼绐楅柡鍥ュ灪閸ゅ銇勮箛鎾跺闁抽攱甯￠弻娑氫沪閸撗勫櫗缂備椒鐒︽竟鍡涙晸閸婄噥娼愭繛鍙夌矒瀵偆鎷犻懠顒佹婵炴潙鍚嬪娆戠不濞戞瑣浜滈柟鐑樺焾濡叉椽鏌涢悙鐑樻锭闁宠鍨块、娆戠驳鐎ｎ偒鍚呴梻浣哥秺椤ユ捇宕楀锟藉濠氬Ω閵夈垺鏂�闂佸壊鍋呯换锟芥俊鍙夊姍濮婄儤娼幍顔煎闂佸湱鎳撳ú顓烆嚕椤愶箑绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
				Long otherid=xtable.Livedie2key.select(objectid);
				if(otherid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(otherid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						if(otherLiveDieRoleInfo.getObjectid()==hostid){
							String name=new PropRole(objectid,true).getName();
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162075, Arrays.asList(name));
							return false;
						}else{
							String name=new PropRole(objectid,true).getName();
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
							return false;
						}
					}
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙绀冩い鏇嗗洤鐓橀柟杈鹃檮閸嬫劙鏌涘▎蹇ｆЧ闁诡喗鐟х槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鎮归崶銊ョ祷妞ゎ偒浜铏圭矙濞嗘儳鍓梺鍛婃煥閻倿宕洪悙鍝勭闁挎梻绮弲鈺冪磽娴ｅ湱鈽夋い鎴濇喘瀹曟繄绮欐惔鎾存杸闂佺粯鍔曞Ο濠偽ｉ崷顓犵＜閻庯綆鍋呯亸鍨繆閸欏濮嶆鐐村笒铻栭柨鐔剁矙閹�斥槈閵忥紕鍘卞┑鐐村灥瀹曨剟寮搁妶澶嬬厱婵炲棗绻戦ˉ銏℃叏婵犲懏顏犵紒杈ㄥ笒铻ｉ柤濮愬�ゅΣ顒勬⒒娴ｄ警鐒鹃柨鏇樺�曢敃銏ゆ焼瀹ュ棙娅㈤梺鍏间航閸庢娊宕弻銉︾厵闁告垯鍊栫�氾拷
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(objectid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠村┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘煛鐏炶鍔滈柡鍛倐閺岋箑螣娓氼垱笑闂佽法鍠曞Λ鍕焽閿熺姴违濞达絿纭堕弸搴ㄦ煙閹咃紞妞わ富鍙冮幃宄邦煥閸愵亞顔掗柦妯荤箖閵囧嫰寮介妸褋锟芥帞绱掗悩鑽ょ暫鐎殿喖鐖煎畷鐓庘攽閸″繑瀵栭梻浣筋嚃閸犳盯宕戦幇鐗堝剦妞ゅ繐鐗滈弫鍥煟閹扮増娑ч柣鎾跺枛閹鈻撻崹顔界亾濡炪値鍘奸悧鎾汇�佸锟藉畷妤呮偂鎼达絿鐛┑鐘垫暩婵锟芥氨鍏樺畷顖炲炊閵娧呯槇闂佹眹鍨藉褔宕滃畷鍥╃＝鐎广儱鎳忛ˉ銏拷瑙勬礃缁矂鍩㈡惔銊ョ疀妞ゅ繐妫涢悾鎯р攽閻愬樊鍤熷┑顔芥尦椤㈡牠宕卞☉娆忎簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鐓曟い顓熷灥閺嬫稒銇勮箛锝呬簽缂佽鲸甯楀鍕熼悜妯煎綆闂備礁鎼惉濂稿窗閺嶎厹锟戒礁鈻庤箛濠冪�婚梺缁樺姦閸撴稓绮旈悜鑺モ拻濞撴熬鎷锋繛浣冲洦鍋嬮柣鎰暩娑撳秹鏌熼幑鎰惞鐎规挷绶氶弻鐔兼焽閿曪拷楠炴鏌涙惔锝呮瀾闁靛洤瀚板顕�宕剁捄鐑橆唲闂備胶顢婂Λ鍕敄閸涙潙鐓橀柟杈鹃檮閺咁剟鏌涢弴銊ヤ簵闁哄鍙冨铏圭矙閸栤剝鏁惧┑鐐插级閿曘垽濡撮崘顔嘉ㄩ柕濞у懏婢戞繝鐢靛仦閸ㄥ爼鈥﹂崶顒夋晩闁糕剝绋掗埛鎴︽偣閹帒濡兼繛鍛姍閺岀喖宕欓妶鍡楊伓
				fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
				int cost=LiveDieMange.getLiveDieCostMoney();
				if(bag.getMoney()<cost){
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				if (bag.subMoney(-cost, "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｆ繝姘亜闁稿繐鐨烽幏濠氭煟鎼达紕浠涢柣鈩冩礈缁絽螖閸涱喒鎷洪柡澶屽仦婢瑰棝藝閿曞倹鍊垫慨姗嗗亜瀹撳棛锟芥鍠涢褔鍩ユ径鎰潊闁绘﹢娼ф慨鍫曟⒒娴ｅ憡鍟為柛鏃撻檮缁傚秹寮介‖顒婄秮瀹曞ジ濡烽敂瑙勫闂備胶顢婇崑鎰板磻濞戞瑤绻嗗┑鍌氭啞閻撴洖鈹戦悩鎻掞拷鑽ょ矓閸濆嫧鏀介柨娑樺閺嗩剛锟借娲滈崰鏍�佸☉姗嗘僵濡插本鐗曢弫浠嬫⒑鐠囨煡顎楃紒鐘茬Ч瀹曟洟鏌嗗鍡椾罕闂佺硶鍓濈粙鎴﹀磼閵娾晜鐓ラ柣鏂挎惈鏍￠梺鎶芥敱閸ㄥ綊鏁撻崐鐕佹綈婵炲弶鐗曠叅闁靛ě鍕濠电偞鍨堕悷褏绮绘ィ鍐╃厾缁炬澘宕晶顕�鏌＄�ｎ偆銆掗柨鐔诲Г椤旀牠宕伴弽顓涳拷锕傛煥鐎ｂ晝绠氶梺褰掓？缁�渚�鎮″☉妯忓綊鏁愰崼鐕佷哗濠电偟鍘чˇ闈涱潖缂佹ɑ濯撮悷娆忓娴犫晠姊虹粙鍨劉婵＄偘绮欓獮鍐晸閻樻煡鍞跺┑鐘焺娴滄繈鎯勯姘辨殾闁绘梻鈷堥弫宥嗙箾閹寸偛绗氶悗姘偢濮婄粯鎷呴崨濠傛殘闂佸憡姊归悧鐐哄Φ閹版澘绀冮柕濠傚嚱缂嶄線骞婇敓鐘参ч柛銉㈡櫔缁辫尙绱撻崒姘拷鐑芥倿閿曞倸鐓熼柕鍫濐樈閺佸倿鏌涢顐㈠缂佸绻樺Λ鍛搭敃閵忊�愁槱濠殿喖锕ㄥ畷闈涱嚕瑜旈弫鎾绘寠婢跺棙鏂�濡炪倖姊归弸缁樼瑹濞戙垺鐓曢柟鎯ь嚟濞叉挳鎸婂┑鍠㈠綊鎮℃惔锝嗘喖闂佹娊鏀遍崹鍧楀箖濡ゅ懎鎹舵い鎾跺�敐澶嬬厪闁糕剝顨呴弳鐔虹磼鏉堛劌娴柣鎿冨墴楠炴捇骞掗悙鏉戭伓濠电娀娼ч鍥х暤娓氾拷閻擃偊宕堕妸锕�鏆楅梺鍝勬椤戝寮婚悢鍛婂闁告劏鏅濊ぐ褔姊洪崫鍕喊闁归鍏樺缁樻媴缁涘娈梺鍛婂灩閺咁偆妲愰悙鍝勫耿婵☆垳鈷堝ú鎼佹⒑缂佹ê濮冮悹锟介敃鍌氭瀬濠电姴娲﹂悡娆撳级閸儳鐣烘俊缁㈠櫍閺岋綁骞樼�电硶妲堝銈庡弨濞夋洟骞戦崟顖涘仏闁哄鍨甸～鐘测攽閻橆偅濯伴柛鏇ㄥ亜椤帡姊洪崫鍕効缂佺粯绻傞悾鐑藉Ω閳哄﹥鏅╅梺鍛婃寙閸涱厼杈呴梻浣筋嚙鐎涒晠顢欓弽顓炵獥婵°倓鑳剁粻鎯р攽閻樺弶鎼愰柡瀣╃窔閺岀喖宕滆鐢盯鏌￠崨顔藉�愰柡灞诲姂閹倝宕掑☉姗嗕紦?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_xiazhanshu, 0) != -cost) {
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鐚存嫹閻㈡鐒剧�涙繄绱撴担鐣屽牚闁稿﹥绻堝濠氭晝閿熷�熺亽婵炴挻鍑归崹閬嶆晬閸℃せ鏀介柣鎰级閳绘洖霉濠婂嫮绠炵�殿喗褰冮…銊╁醇閻斿搫骞楅梻渚�锟芥稑宓嗘繛浣冲嫭娅犳い鏇嫹妤犵偞鐗犲鍫曞箣椤栨繂鎯堟繝娈垮枛閿曘劌鈻嶉敐鍥у灊婵炲棙鍨跺畷澶愭煏婵炑冨�荤粈鍐⒒閸屾瑨鍏屾い顓炵墦椤㈡牠宕堕锟界壕濠氭煏閸繃鍣介柡鍡畵閺岀喐娼忛崜褏鏆犻柛銉ョ摠缁绘繈濮�閿濆棛銆愬銈嗗灥濞差厼鐣烽姀銈庢晜闁告侗鍨抽惁鍫ユ⒑濮瑰洤鐏叉繛浣冲嫮顩风憸鏃堝蓟濞戞熬鎷烽敐搴′簼閻忓浚鍙冮弻宥囨嫚閼碱儷褏锟借娲忛崝搴ㄦ晸閼恒儳鈾佹い顓炴喘瀹曘垽骞栨担鍦幗闁瑰吋鎯岄崹鍐茬暆濞戙垺鐓涢柛娑卞枤缁犳绱掗鍡欑М鐎殿噮鍣ｅ畷濂告偄閸濆嫬绠伴梺璇叉捣濞呫垽骞忛悜鑺ュ�甸柨婵嗛婢ь噣鏌涢埡浣虹劯闁哄睙鍛＜婵☆垳鍘ч埛宀勬⒑閸濆嫯顫﹂柛鏃�鍨块獮鍐閵堝懐顦繛杈剧秬濞咃綁宕㈤鐐粹拻濞达絿鐡旈崵鍐煕閻曚礁浜扮�规洘鍎奸ˇ鏌ユ煠閺夎法浠㈤柍瑙勫灴閹瑩宕ｆ径妯伙紒闂備焦鎮堕崝宀�绱炴繝鍥х畺闁绘劖鐣崑鍛存煕閹般劍鏉归柟閿嬫そ濮婃椽宕烽褏鍔搁柣搴㈢▓閺呮繄鍒掗崼銉︽櫢濞寸姴顑嗛埛鎴犵磼鐎ｎ亜鐨＄�规悶鍎甸弻鐔兼嚍閵壯呯厒闂佸憡甯楃敮鈥愁嚕閹峰瞼鐤�閻庯絺鏅滈惈蹇涙⒒娴ｅ憡璐￠柛搴涘�濋獮鎰偅閸愩劎鐓戦梺绯曞墲缁嬫帡鍩涢幋鐘电＝濞达綀鍋傞幋鐘电焼闁跨喍绮欏铏圭矙閸栤�充紣濠电媴鎷烽梺顒�绉甸弲鎼佹煠閹帒鍔ら柛鐔哥叀閺岀喖宕欓妶鍡楊伓?
				if(hostliveDieRoleInfo==null){
					hostliveDieRoleInfo=xbean.Pod.newLiveDieRoleInfo();
					xtable.Livedieroleinfotab.insert(hostid, hostliveDieRoleInfo);
				}
				hostliveDieRoleInfo.setObjectid(objectid);
				hostliveDieRoleInfo.setSelecttype(selecttype);
				hostliveDieRoleInfo.setInvitationtime(System.currentTimeMillis());
				hostliveDieRoleInfo.setAcceptflag(0);
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闂囧鏌ㄥ┑鍡╂Ч濞存嚎鍊濋弻銈夊级閹稿骸浠撮悗娈垮枛閻栫厧鐣烽悡搴僵妞ゆ挾鍠撹ぐ鍛存⒒娴ｈ鍋犻柛鏂跨Ф閹广垽宕橀鍢夛箓鏌涢弴銊ョ仩闁告劧鎷烽梻渚�娼ц噹闁告侗鍨扮敮鎺楁⒒閸屾瑧顦﹂柟纰卞亜铻炴繛鍡樺灥閸ㄦ繈鏌熼幑鎰靛殭闁藉啰鍠栭弻锝夊棘閸喗鍊梺绋匡功缁垶骞堥妸銉庢棃鏁撻挊澹╂稑鈻庨幘鏉戜患闂佸壊鍋呭ú姗�鍩涢幋鐐电闁煎ジ顤傞崵娆愵殽閻愭惌娈曢柕鍥у婵℃悂濡烽婵嗘儓闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺缁橈耿濞佳勬叏閸洘鈷掑ù锝呮啞閸熺偤鏌涢弮鎾绘缂佸倸绉瑰浠嬧�栭濠勭М鐎规洖銈告慨锟介柕蹇ｆ緛缁卞啿鈹戦悙瀛樺鞍闁煎綊绠栭弫鍐Ψ瑜濋幏宄邦潩椤掑倻楔濠殿喖锕ㄥ▍锝囧垝濞嗘垶宕夐柕濞у倻绀冮梻鍌欒兌椤牓顢栭崶顒�纾婚柕鍫濇噽閺嗭箓鏌熼幍顔碱暭闁稿鍔戦弻娑樷槈濮楀牆濮涢梺鍛婏耿娴滆泛顫忓ú顏勭閹兼番鍩勫鍨渻閵堝棙鑲犻柛銉㈡櫅缁侊箓姊洪崫鍕枆闁稿鍊块幃鐐寸節閸モ晛褰勯梺鎼炲劘閸斿秶绮堥崼銏㈡／闁硅鍔栭ˉ澶愭煏閸℃ê绗掓い顐ｇ箞椤㈡鎷呯憴鍕拷鐑芥⒒娴ｅ憡鎯堟い鎴濇喘瀹曚即寮介鐐舵憰闂佺粯鏌ㄩ崥瀣磻閿熺姵鐓熸俊銈忔嫹闁绘妫濆鎼佹偐閸欏倹妫冮幃鈺呮濞戞鎹曢梻浣告憸閸犳劕顭囧▎鎾村仼闂佸灝顑囬梽鍕磼鐎ｎ亞浠㈢�规挸妫濆铏圭磼濡崵鍙嗛梺纭咁嚋缁绘繈銆侀弮鍫熷亜闁稿繐鐨烽幏缁樼箾鏉堝墽绉┑顔哄�楀☉鐢稿醇閺囩喓鍘遍梺鎸庣箓缁绘帡鎮鹃崹顐闁绘劘灏欑粻濠氭煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?
				Long object=xtable.Livedie2key.get(objectid);
				if(object==null){
					xtable.Livedie2key.insert(objectid, hostid);
				}else{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝栭梻浣芥硶閸犲秶鍒掑▎鎾崇畺闁秆勵殢閺佸﹤鈹戦钘夊缂併劌顭峰铏规喆閸曨剛鍑￠梺缁樼墱閸樠団�栨繝鍥舵晪闁跨喍绮欏璇测槈濮樼偓瀚归柨婵嗙凹閹茬偓淇婇銈嗗闂傚倷绀侀幖顐︽儗婢跺瞼绀婂〒姘炬嫹闁绘侗鍠栭～婊堟晸閽樺鏆︽俊顖欒閸熷懏銇勯弬鍨倯闁哄棙鏌ㄩ埞鎴︽偐閸偅姣勯梺绋款儑閸嬨倕鐣疯ぐ鎺濇晬闁绘劖褰冮悗顓㈡⒑闂堚晛鐦滈柛妯煎亾缁嬪顓奸崥銈呯秺瀹曟宕楅懖鈺冣枏缂傚倷鑳舵慨瀵哥礊婵犲洤钃熼柣鏂挎惈閺嬪牓鏌涘Δ鍐ㄤ粶缂佺姾娅ｇ槐鎾存媴閽樺鍘紒鐐緲缁夊綊鐛崼銉ノ╅柕澶樺枟瀵ゆ椽姊洪崜鎻掍簴闁搞劌顭峰鎶藉Χ閸涱亝鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰閻瑩鏌ｅ☉鍗炴珝鐎殿喕绮欓、姗�鎮㈤崙銈嗗闁绘垼濮ら悡娆戠磽娴ｅ顏嗙箔閹烘挶浜滄い鎰剁到閻忓瓨鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸屾稒鐣奸梻鍌欑閹碱偆鎮锕�绀夐幖杈剧到閸ㄦ繈鏌￠崘銊у闁稿绻濋弻鐔封枔閸喗鐏嶅┑鐐茬墛閸庢娊鍩為幋锔藉�烽柛娆忣槴閺嬫瑦绻涚�涙鐭嬬紒顔煎缁旂喖寮撮姀鐘殿槯闂佺绻掗崢褍顕ｉ崸妤佲拺闁圭娴风粻鎾澄旈悩铏�愰柣娑卞枛椤粓鏁撴禒瀣摕闁绘柨鍚嬮幆鐐淬亜閹板墎鍒扮痪鐐▕濮婃椽鎮欓挊澶婂Х缂備胶濮甸幐缁樼┍婵犲洤绠瑰ù锝呮憸閸樺憡绻涙潏鍓у閻狅拷閿曪拷鍗卞ù鐓庣摠閳锋帒霉閿濆浂鐒鹃柡鍡涗憾閺岀喓鍠婇崡鐐板枈濡炪們鍨洪悧鐘茬暦閹偊妾ㄩ梺鍝ュ枎閹冲繒鎹㈠┑瀣棃婵炴垶鑹鹃埅杈╃磼閹冪稏缂侇喗鐟╁璇测槈濮橆偅鍕冮梺鍛婃寙閸曨偅鐝紓鍌氬�峰鎺楁倿閿曪拷椤灝顫滈敓浠嬪灳閺冨牆绀冩い鏃囧亹妤犲洭姊洪悷閭﹀殶闁稿鍋ゅ畷浼村箛閻楀牃鎷洪梺鑽ゅ枑婢瑰棝鎮鹃銏＄厱闁靛鍔嶉ˉ澶愭煟閿濆鏁辩紒铏规櫕缁瑧鎷犳穱鍗炲闁哄本娲樺鍕醇濠靛棭鐎撮梻浣侯攰瀵捇宕￠崘宸綎闁惧繗顫夌�氭岸鏌ょ喊鍗炲妞ゆ柨锕铏圭矙濞嗘儳鍓抽梺鍝ュУ閻楃娀鐛崘顭嬫椽顢旈崟顓犳綁闂備礁澹婇崑鍛崲閸℃凹鏉洪梻鍌欐祰椤曆囧礄閻ｅ瞼绀婇柛鈩冪☉缁愭淇婇妶鍛櫤闁稿鍊块弻锟犲炊閵夈儳浠鹃梺缁樻尭閸熸挳寮诲鍡樺闁规鍣Σ顕�姊洪崫鍕靛剭闁稿﹥绻堝濠氭晲婢跺﹦顔婇悗骞垮劚濞层劑鎮￠幘缁樷拺闁告繂瀚﹢鎵磼鐎ｎ偄鐏遍柣蹇斿浮閺岋綁鎮╅崣澶婎槱閻熸粍婢橀崯鎾晲閻愬搫绠虫俊銈勮閹锋椽姊洪崨濠勭畵閻庢凹鍣ｉ幃鐐垫崉閵娧咃紳閻庡箍鍎辩�氼喚绮ｉ弮锟介〃銉╂倷閹绘帗娈婚梺绯曟櫔缁绘繂鐣烽幒鎴旀婵ɑ鐦烽妶澶嬧拻濞达絿顭堥弳閬嶆煙绾板崬浜伴柡浣稿暣婵＄兘濡搁姀鐘茬阀婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繑銇勯幘鍗炵仼缂佺媭鍨堕弻娑㈠箛闂堟稒鐏堢紒鐐劤閸氬鎹㈠┑鍥╃瘈闁稿本绋戝▍褔姊洪崨濠忎緵闁搞劏娉涢～蹇曠磼濡顎撶紓浣圭☉椤戝懎鈻撻幇鐗堚拺闁告縿鍎辨牎闂佺粯顨嗗ú鐔煎灳閿曞倸鐐婃い鎺炴嫹闁诲繐纾敓鍊燁潐濞叉牕煤閿曪拷閳绘挻銈ｉ崘鈹炬嫼闂佸憡绋戦…顒�鈻撳锟介弻娑氾拷锝庡亜婵洭宕￠柆宥嗙厱妞ゆ劑鍊曢弸宥囩磼鐠囧弶顥為柕鍥у瀵粙濡搁妷锔炬瀮闂備浇娉曢崰鏇炍涢崟顖ｆ晞闁搞儺鐏涢敐澶婄疀闁绘鐗婂▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?
					xtable.Livedie2key.remove(objectid);
					xtable.Livedie2key.insert(objectid, hostid);
				}
				SInvitationLiveDieBattleOK sInvitationLiveDieBattleOK =new SInvitationLiveDieBattleOK();
				sInvitationLiveDieBattleOK.sourceid=hostid;
				sInvitationLiveDieBattleOK.sourcename=hostprole.getName();
				sInvitationLiveDieBattleOK.selecttype=selecttype;
				Onlines.getInstance().send(objectid, sInvitationLiveDieBattleOK);
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ鐐电磽娴ｇ晫鍫柛濠冪箞瀵鎮㈢喊杈ㄦ櫖闂佺硶鍓濋〃鍡楋耿娴煎瓨鍊甸梻鍫熺♁濠�鎵磼缂佹銆掗柨鐔烘櫕閺佹悂鈥﹂崼婵堟懃濠碉紕鍋戦崐鏍垂閻㈢绠犻柟閭﹀枛閸ㄦ繈鏌涢鐘插姎缁炬儳銈搁弻锝夊箛椤掑娈堕梺鍛婏耿娴滆泛顫忓ú顏咁棃婵炴垼椴歌倴闂備焦鎮堕崝宀勫箹椤愶箑鐓濈�广儱顦悙濠囨煃閸濆嫬鏆為柨娑樼箻濮婅櫣娑甸崪浣圭秷闂佸憡姊归悧鐘烘＂婵犮垼鍩栭崝鏍夐崱妤婄唵闁兼悂娼ф慨鍫ユ煟閹惧崬鍔滅紒缁樼箞濡啫鈽夊▎妯伙紒闂備線娼荤徊鎯ь渻娴犲钃熼柣鏃傗拡閺佸秵鎱ㄥΟ鍝勮埞闁愁亞鏁诲娲传閸曨厾鍔圭紓浣介哺濞茬喖寮幘璇叉闁靛牆娲ㄦ牎濠电偛鐡ㄧ划鐘崇椤忓嫮鏆﹂柨婵嗩槸缁�瀣亜閺嶃劎銆掗柛妯绘倐閺岋綀绠涢弴鐐扮捕婵犫拃鍌滅煓闁糕斂鍎插鍕箛椤撶姴甯楅梺鑽ゅТ濞诧箓鎮￠敓鐘茬煑闁告洦鍓﹀▓浠嬫煟閹邦剙绾ч柛鐘成戦妵鍕閳藉懓锟藉潡鏌熼鍛偗闁轰焦鎹囬幐濠冪珶閳哄绉柕鍥ㄥ姍楠炴帡骞樼捄鍝勭闂備胶鎳撻崥瀣偩椤忓牆纾归柕鍫濇媼閻掍粙鏌熼柇锕�骞樼紒鐘靛亾缁绘盯寮堕幋顓炲壉濠电偛鎳庨敃銉┿�冮妷鈺傚�烽柤纰卞墰椤旀帡姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(objectid,true).getName();
				MessageMgr.sendSystemMsg(162066,Arrays.asList(hostname,guestname));
				
				logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑橆殕閻撴洟鏌曟繛鍨姎闁跨喕濮ら幃鍌炲春閻愬搫绠ｉ柨鏃囨娴滃綊鏌ｆ惔鈩冭础濠殿喗鎸宠棢婵犻潧鐗忕壕钘壝归敐鍥ㄥ殌濠殿喖鐗婇妵鍕Ω閵夘垵鍚悗娈垮枛椤兘骞冮姀銏㈢煓婵炲棙鍎冲▓濂告⒒娴ｅ憡鎯堟い锔垮嵆瀹曞綊骞庨挊澶岀崶婵犵數濮村ú锕傚煕閹达箑绾ч柣鎰綑椤ュ銇勯敂濂告濞ｅ洤锕、鏇㈡晲閸モ晝鏉介柣搴㈩問閸犳牠鈥﹂悜钘夌畺闁靛繈鍊栭幆鐐烘煕閿旇寮跨紒杈ㄧ叀濮婄粯绗熼敓钘夘焽瑜忛幑銏ゅ箳閹炬潙寮块梺姹囧灩閹诧繝宕愰崼鏇熺厱妞ゆ劗濮撮悘顔剧棯閹规劖顥夐棁澶愭煥濠靛棙鍣洪柟顖氱墛閵囧嫭鎯旈姀鈥虫殫缂備浇椴哥敮鈥愁嚕婵犳艾唯鐟滃繘寮抽鈶芥棃鎮╅棃娑楃捕闂佺粯顨嗛幐缁樼┍婵犲洤绠瑰ù锝堝�介妸鈺佺婵烇綆鍓欓悘顏呫亜閵夈儳澧﹂柡灞稿墲閹峰懐鎲撮崟顐︾�虹紓鍌欑閸婂湱鏁悙鐑樻櫢闁哄倶鍊楃粔鐢告煕鐎ｎ亜顏紒鍌氱Ч閺屽棗顓奸崱鈺傤棅婵＄偑鍊栭崝鎴﹀垂閻戞ê绶為柛鏇ㄥ墰缁犻箖鏌涘▎蹇ｆШ闁活厽甯￠弻鐔碱敍濮樿京鍔悗瑙勬礀瀹曨剝鐏冩繝鐢靛Т鐎氼剟寮幖浣光拺闁煎鍊曞瓭闂佸湱鈷堥崑澶愬Φ閹版澘閿ゆ俊銈忔嫹闂佸崬娲︾换婵嬪閳猴拷閹秶绱撳鍕槮闁伙綁鏀辩缓鐣岀矙鐠囦勘鍔戦弻銊╁籍閿熶粙宕曢幎鐣屽祦鐎广儱顦伴埛鎺懨归敐鍫燁仩閻㈩垱鐩弻娑㈠籍閹惧墎鏆ら悗瑙勬礃缁矂鍩㈡惔銊ョ疀妞ゆ挾鍠撹ぐ鎸庝繆閻愵亜锟芥牠鎮у鍫濈；闁绘劗鍎ら崑鍌炴煛閸ャ儱鐏╃紒鐘侯潐缁绘盯鏁愭惔鈥愁潻闂佽绻嗛弲娑㈠煘閹达富鏁婇柤娴嬫暕瑜旈弻鈥崇暆鐎ｎ剛锛熸繛瀵稿缁犳挸鐣峰鍡╂Ъ闂佸憡甯楅惄顖氼潖濞差亝鍊烽柦妯侯槸婵绱撴担鍝勑ｉ柟鐟版喘閹即顢欓幘鍛闁挎繂绨肩花鎾煛閿熻姤绂掔�ｎ偆鍘遍梺铏嫕閹风兘鏌￠崨顔剧煀闂囧鏌涢妷銏℃珖缁惧彞绮欓弻娑氫沪閹规劕顥濋梺璺ㄥ枍缁瑩藟閹捐泛鍨濋柛顐ゅ枔閻熷綊鏌ㄩ悢鍓佺煓闁靛棔绶氬浠嬵敇閻愭鍚呴梻浣瑰濞测晠骞忔搴ｇ＜闁绘瑱鎷烽柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫闂佺绻楅崑鎰姬閿熻姤绻濋悽闈浶㈤柛濠咁潐閸掑﹥绺介崨濠勫幈闁瑰吋鎯岄崹杈╋拷姘炬嫹"+hostid+"\t闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻濠氭煙瀹曞洤浠遍柡灞芥椤撳ジ宕卞Δ浣烘殶闂傚倷绀侀悿鍥ь浖閵娾晜鍤勯柛鎾茶兌妞规娊鐓崶銊︹拻缂佲槄鎷烽梻浣圭湽閸ㄨ棄顭囪閻楀酣姊绘担铏瑰笡婵☆偄绻樺畷婊冣槈濮橆収娼熼梺缁樺姇閹碱偊宕橀敓浠嬫偡濠婂嫮鐭掗柟顔哄灲瀹曞崬鈽夊▎蹇庡寲闂佸搫顦遍崑鐐村垔娴犲鏁嗛柣鏂垮悑閻撴洟骞栧ǎ顒�鐏╁┑顔肩墢缁辨帞绱掑Ο鍏煎垱閻庤娲忛崝鎴︺�佸☉妯炴帡宕犻敍鍕仹缂備浇椴哥敮鐐垫閹烘嚦鐔煎礂閻撳骸鐏″┑掳鍊楁慨鐑藉磻閻愮儤鏅梻浣风串缁插潡宕楀Ο铏规殾闁诡垶鍋婂Σ鑽ょ磽娴ｇ懓濮ч柟鍑ゆ嫹"+objectid+"\t闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂傚洤顦甸弻銊モ攽閸℃ê娅ｅ銈冨劚缁绘﹢寮诲☉銏犖ч柛鈩冾焽椤︿即姊洪崫鍕拱闁烩晩鍨堕妴渚�寮撮姀鈩冩珳闂佺硶鍓濋悷顖毼ｉ鍕拻濞达綀顫夐崑鐘绘煕閺傝法鐒哥�规洘鍔欏畷绋课旈敓浠嬫嫅閻斿摜绠鹃柟瀵稿仧閻倖淇婇懠顒�甯舵い顏勫暣婵″爼宕橀妸銉�抽梻浣侯攰濞呮洟宕濆Δ鍛闁圭儤姊荤壕鍏间繆椤栨瑨顒熼柛銈冨�濋弻锝嗘償閵忊懇妾ㄥ銈庡幖濞差厼鐣烽姀銈呯闁绘垵妫欑�靛矂姊洪棃娑氬婵☆偅顨嗛幈銊槾缂佽鲸甯￠獮鎾诲箳閹存梹瀵栫紓鍌欑贰閸犳牠鎮ч幘璇叉瀬闁规儳顕々鐑芥倵閿濆骸浜愰柟閿嬫そ濮婃椽宕ㄦ繝鍕暤闁诲孩姘ㄩ崗妯虹暦閺囩喐鍎熼柨婵嗘川閿涙粓姊虹捄銊ユ灆濠殿喓鍊楃划顓㈡偄閸忓吋娅㈤梺鑺ッ¨锟介柤鏉跨仢閵嗘帒顫濋悙顒�顏舵繝娈垮枛閿曘劌鈻嶉敐鍥у灊婵炲棙鍨跺畷澶愭煏婵炑冭嫰閺佸綊姊婚崒娆戭槮闁硅绻濋幊婵囥偅閸愮偓鏅為梺鎼炲劗閺呮粓锝為弴銏＄厽闁归偊鍓氶幆鍫㈢磼閻欏懐绉柡宀嬬秮楠炲洭顢欓懞銉︾槑婵＄偑鍊栧鐟懊洪悢濂夋綎婵炲樊浜滃婵嗏攽閻樻彃顏柣鎿勬嫹闂傚倷绀侀幗婊堝闯閵夆晛鍨傞柟鎯板Г閺呮悂鏌ら幁鎺戝姢闁哥喐鐓￠弻鐔煎礄閵堝棗顏�"+cost);
				return true;
			};
		}.submit();
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793835;

	public int getType() {
		return 793835;
	}

	public long objectid; // 目标玩家id
	public int selecttype; // 0单人   1组队

	public CInvitationLiveDieBattleOK() {
	}

	public CInvitationLiveDieBattleOK(long _objectid_, int _selecttype_) {
		this.objectid = _objectid_;
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(objectid);
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		objectid = _os_.unmarshal_long();
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationLiveDieBattleOK) {
			CInvitationLiveDieBattleOK _o_ = (CInvitationLiveDieBattleOK)_o1_;
			if (objectid != _o_.objectid) return false;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)objectid;
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(objectid).append(",");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInvitationLiveDieBattleOK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(objectid - _o_.objectid);
		if (0 != _c_) return _c_;
		_c_ = selecttype - _o_.selecttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


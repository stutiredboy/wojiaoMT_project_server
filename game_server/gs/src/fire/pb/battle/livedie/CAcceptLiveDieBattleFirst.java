
package fire.pb.battle.livedie;

import fire.pb.PropRole;
import gnet.link.Onlines;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptLiveDieBattleFirst__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptLiveDieBattleFirst extends __CAcceptLiveDieBattleFirst__ {
	@Override
	protected void process() {
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬮梺杞扮劍閸旀瑥鐣烽妸鈺婃晣鐟滃繘鏁撻悾灞藉幋婵﹦绮幏鍛村传閵夘垳绀婄紓鍌欑贰閸ｎ噣宕归幏宀�浜遍梻浣告啞閸旓箓宕伴弽顐や笉闁哄秲鍔嬬换鍡涙煏閸繃鍣洪柛锝嗘そ閺岋繝宕ㄩ鎯у绩濡ょ姷鍋為悧婊堝礆閹烘鍎岄柛娑橈工椤忓爼姊洪懖鈹炬嫛闁告挻绋戦埢鏃堝锤濡や讲鎷婚梺绋挎湰閻燂妇绮婇悧鍫涗簻闁哄洤妫楅幊蹇撶暦閺屻儲鐓欓悗鐢殿焾鍟搁梺娲诲幗閻熲晠寮婚悢鍛婄秶闁告挆鍛闂備胶绮幐鎾晸閼恒儱澧柣鏂挎閺屻倝骞栨担瑙勯敪婵犳鍠栧ú銊ф閹烘鏁冮柕蹇婃嚕瑜旈弻鈥崇暆閿熶粙宕伴弽顓炵畺婵炲棙鎼╅弫鍡涙煥閻旇袚闁哄懎鐖奸、娑樷槈濮橀硸鍟庨柣搴ｆ嚀婢瑰﹪宕伴弽顓犲祦闁哄稁鍘介悡鍐偡濞嗗繐顏╅柣蹇旀尦閺岀喖顢欓悾灞惧櫚闂佺懓纾繛锟芥い銏☆殜閺佹挻绂掔�ｅ嫮鍏橀弫鎾寸鐎ｎ偀鎷绘繛杈剧秬椤宕戦悩缁樼厱闁哄倹瀵у﹢浼存煛閸涙澘鐓愰柟顖涙閺佹劙宕ㄩ鐘卞枈闂備浇顕ч崙鐣岀礊閸℃顩查柛顐ｆ礀鐟欙箓鎮楅敐搴濇喚闁绘柨妫濋幃瑙勬姜閹峰矈鍔呴梺绋块缁绘﹢寮婚妸鈺傚亜闁绘垶蓱閻濐亞绱撴笟鍥ф珮闁搞劏浜划姘綇閵娧呯槇闂佹悶鍎撮崺鏍疾椤掞拷閳规垿鎮欓弶鎴犱桓濡炪們鍔屽Λ婵嗙暦閺夋娼╅柤鍝ヮ暯閹锋椽姊洪崷顓х劸閻庢稈鏅濈划鍫ユ晸娴犲鈷戠紒瀣皡瀹搞儳绱撳鍜冭含妤犵偛鍟撮弫鎾绘偐閹绘帒绁梻浣虹帛濮婂鈥﹂崼婵愬殨闁割煈鍠掗弨浠嬫煃閽樺顥滈柣蹇曞█閺岀喓鍠婇崡鐐板枈闂佺硶鏅滈惄顖氼嚕椤曪拷瀹曞ジ鎮㈤崫鍕闂傚倷鐒︾�笛呮崲閸岀倛鍥敋閿熶粙鐛径瀣ㄥ亝闁告劏鏅濋崢鎼佹倵閻у憡瀚归柣搴秵閸撴稖鎽┑掳鍊楁慨鐑藉磻濞戙垺鏅濇い蹇撶墕閽冪喐绻涢幋娆忕仼缂侇偄绉归弻銊╂偄閸撲胶鐓撻悗瑙勬礀缂嶅﹪骞冩禒瀣窛濠电姴鍊烽幃锝夋⒒娴ｈ櫣甯涢柛銊ュ悑閹便劑濡舵径濠勬煣闂佸綊妫块悞锕傛偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?
		Long hostid=xtable.Livedie2key.select(guestid);
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ梹鍨濆锕傛⒒閸屾艾锟介绮堟笟锟介獮澶愭晸閻樺啿浠梺闈涱槴閺呮粓寮插┑瀣厪濠㈣泛妫欏▍鍛浖閸涘瓨鈷戦柛娑橈攻婢跺嫰鏌涢妸銈呭祮鐎规洘锕㈤弫鎾寸鐎ｎ偀鎷洪梻鍌氱墛娑撶懓鈽夊顐ｅ媰闂佺粯鍔﹂崜锕傚疮閸ヮ剚鈷掗柛灞捐壘閿熺晫鍏橀幊妤呭醇閺囨鎷烽敃鍌氶唶闁绘洑鐒﹂鏃堟⒑瑜版帗锛熼柣鎺炵畵瀵彃鈹戦崶銉ょ盎闂婎偄娲﹂幐鐐櫠閺囥垺鐓㈤柛鎰典簻閺嬫盯鏌＄仦璇插闁诡喓鍨藉畷顐﹀礋閹存瑥鐏叉慨濠冩そ瀹曪繝鎮欓弶鎴П缂傚倷鑳剁划顖滄崲閸繄鏆︾憸鐗堝俯閺佸啴鏌曡箛鏇烆�屾繛鍏兼濮婃椽宕妷銉︾�婚梺纭呭Г缁骸危閹版澘绠婚悹鍥皺閿涙粌鈹戦悙鍙夘棡闁搞劌鐏氭穱濠囨寠婢舵ɑ瀵岄梺闈涚墕閸燁偅淇婃總鍛婄厵闁惧浚鍋撻懓鍧楁煟濞戝崬鏋熺紒缁樼箞瀹曟帡濡堕崱妤冪处闂傚倷娴囧▔鏇㈠窗瀹ュ洤鍨濇繛鍡樻尭缁犳牕霉閸忓吋鍎楅柡浣革躬閺岀喖骞嗚閸ｆ椽鎮楀顒傜Ш闁哄被鍔岄埞鎴﹀幢濡わ拷濮ｆ劙姊鸿ぐ鎺濇闁稿繑锕㈤妴浣割潨閿熶粙骞冮埡鍛煑濠㈣泛濂旈柇顖炴⒒閸屾瑦绁版い鏇熺墵瀹曟澘顫濈捄铏诡槯濠碘槅鍨拃锕傚吹閺囥垺鍋ｅΔ锕侊骏閿熸枻鎷烽梺鍝勵儏闁帮綁寮婚敐澶婄疀闂傚牊绋戦～顏嗙磽娴ｉ璐伴柛锝忕到椤繑绻濆顒傦紲濠殿喗锕╅崜銊╁箯閻戣姤鍊婚柤鎭掑劚閿熻棄娼￠弻銊╁即閻愯鎷疯ぐ鎺戠？闁瑰濮甸崰鎰版煟濡わ拷閻楀棛绮幒鏃傜＜闁跨喕濮ゅ鍕暆鐎ｎ偄顏堕梺璋庡啯鍟為悗姘秺濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ锕�绠荤紓浣姑▓鐔兼⒑闂堟侗妲堕柛搴″船琚欓柛顐ゅ枔缁犻箖鎮楀☉娆樼劷闁活厼顑囩槐鎺楊敊閼测敩褏锟芥鍠楅悡鈩冧繆閻戣棄鐓涢柛灞绢殕鐎氬ジ姊洪懡銈呅ｅù婊�绮欏畷婵堜沪鐟欙絾鐎洪梺瑙勫婢ф鎮″▎鎾寸厱闁瑰瓨鐟ラ敓鑺ョ墱閿熻姤鐔幏锟�
		if(hostid==null){
			//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴闇夐柨婵嗩槹娴溿倝鏌ら弶鎸庡仴鐎殿喖鐖煎畷鐓庮潩椤撶喓褰呴梻浣规偠閸斿秶鎹㈤崘顔嘉﹂柛鏇ㄥ灠閸愶拷濡炪倖鍔﹀锟界紒顔煎缁辨挻绗熸繝鍐伓濠电姰鍨煎▔娑㈩敄閸曨厽宕查柛鈩冪♁閻撳繘鏌涢锝囩畺闁革絾妞介弻娑㈡晲閸ャ劌娈屽銈傛櫅閵堢鐣烽妸鈺婃晣婵炴垶鐟﹂弶鍛婁繆閻愵亜锟芥牕顫忚ぐ鎺戝嚑缂備焦顭囬悷瑙勭箾閹存瑥鐏柣鎾存礋閻擃偊宕堕妸锔绘闂佸吋濯藉▔鏇㈡晸閼恒儺鍟忛柛鐘崇墵閳ワ箓鎮滈挊澶嬬�梺鍛婂姦閸犳牜澹曢崗鑲╃闁瑰鍋犳竟姗�鎮介娑辨疁婵﹦绮幏鍛村传閵夛妇锟筋喖鈹戦埄鍐︿粻闁告柨娴烽崚鎺楀醇閻旇櫣鎳濋梺璺ㄥ枙濡嫰顢氶敐澶婄闁兼亽鍎遍敓鐣屽厴閺岋綁濮�閵忊剝姣勯梺鎸庣♁缁挸顫忛搹鍦＜婵☆垰娴氭禍顏勭暦椤栨粍宕夐柕濞у懐鏆ラ柣鐔哥矊缁绘帒危閹版澘绠抽柟鎯ь嚟缁夊爼姊洪棃娑辩叚缂佺姵鍨垮Λ鍕吋婢跺鎷洪梺鑽ゅ枑濠㈡ê危婵犳碍鐓欓柧蹇ｅ�嬮鍫熷仼闁绘垼濮ら崐鑽ょ磼濞戞﹩鍎愰柡鍜冪秮濮婅櫣绱掑Ο娲绘闂佺尨鎷烽梺顒�绉甸崑鐔兼煥濞戞ê顏痪鍙ョ矙閺屾稓浠﹂幑鎰棟闂佽法鍠曟慨銈夊箖閸屾氨鏆﹂柟鐗堟緲娴肩娀鏌曟竟顖氭噽閸樼姴鈹戦悙鑸靛涧缂佽弓绮欏畷顖烆敍閻愯尙鐤囬悗鐧告嫹闁跨喓鏅Σ鎰板箻鐠囪尙锛滃┑鐐叉閸╁牆危椤旂⒈娓婚柕鍫濇閻忋儵鏌熼搹顐劸婵☆偆鍠栧缁樼瑹閸パ冾潻缂備礁顦遍弫璇差嚕閺屻儱绠瑰ù锝呮贡閸樻悂姊虹粙鎸庢拱闁挎岸鏌ㄩ悢璇残撴い銊ョ墢閸掓帡寮崼鐔蜂缓闂佸憡绋戦敃锕傚储闁秵鐓熼幖鎼灣缁夐潧霉濠婂嫮鐭掓い銏℃椤㈡﹢濮�閿涘嫬骞嶆俊鐐�栧濠氭偂椤愶富鏁傞柛顐ｇ箘閸欙拷濠电姰鍨煎▔娑滅檶闂佺粯鏌ㄩ崥瀣偂閵夆晜鍊甸柨婵嗘噽娴犳稓绱撳鍛劯婵﹤顭峰畷鎺戔枎閹搭厽袦闂備礁婀遍埛鍫ュ磻婵犲倻鏆︽い鏍剱閺佸秹鏌ｉ幇顖氱毢妞ゆ柨娲楦裤亹閹烘搫绱甸梻鍌氬缁夊綊寮幘缁樺癄濠㈣泛顑呭▓妤�顪冮妶鍐ㄧ仾妞ゃ劌妫濋獮蹇涘川鐎涙ɑ鍎柣鐘叉礌閿熷�熸珪濞呮姊婚崒姘拷椋庣矆娴ｅ湱鐝跺┑鐘叉搐绾惧鏌涢埄鍐槈缂佹劖顨婇獮鏍庨锟芥俊浠嬫煕婵犲倻鍩ｉ柡灞诲姂瀵剟宕归瑙勫瘱缂備胶鍋撻崕鎶藉Χ閹间礁钃熸繛鎴烆焽閺嗗棝鎮楅敐搴℃灍妞ゅ骸绉归弻锝嗘償閵忋垹鏆￠梺鐟板殩閹凤拷?162129
//			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162129, null);
			sendNoFightPlayer(guestid);
			return ;
		}
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤顨婂畷鐗堢節閸パ咁攨闂佺粯鍔曞Ο濠傤焽閼恒儰绻嗛柣鎰典簻閿熻姤鐗犲畷婵嬪箳閺傚灝鐏婂┑鐐叉濞存岸宕甸弴銏＄厱妞ゆ劧绲剧粈锟介梻浣稿船濞诧妇鎹㈠☉銏犵闁诲繑妞挎禍顏堝灳閺嶎偓鎷烽敐搴℃灍闁抽攱鍨归敓鍊燁潐濞叉牕煤閵娧勬殰婵炴垶鐟ょ换鍡樸亜閹扳晛鐏╅柡鍡稻椤ㄣ儵鎮欓幓鎺撴闁剧粯鐗犻弻娑樷槈閸楃偞鐏嶅┑鐐叉噺缁捇寮婚悢鍏煎殐闁冲搫濯绘径鎰叆闁绘柨鍤栭幏鐑芥偄妞嬪孩顕楅梻浣哄劦閺呮盯鏌婇敐鍜佹綎缂備焦蓱婵绱掑☉姗嗗剰婵炲牜鍘剧槐鎾存媴閾忕懓绗￠梺鎼炲妼濠�閬嶅礆閹烘垟鏋庨柟鎯х－椤撴椽姊洪幐搴㈢┛闁归鍏橀弻锝夊箻椤栥倖瀚归柟棰佽兌閸炵敻姊洪崗鍏煎�愭繛浣冲嫭鍙忛柛銉㈡櫇绾惧吋銇勯幇鈺佺伄閺佸牓姊洪崫鍕伇闁哥姵鐗犻悰顕�宕卞鍏夹╂俊鐐�х徊鐣屽椤撶姵顫曢柟鐑橆殔缁犳稒銇勯幘妤�瀚弳锔剧磽閸屾瑨鍏岀紒顕呭灦閹嫰顢涢悙鍙夌�梺鍦濠㈡ê顔忓┑鍥ヤ簻闁哄啫娲よ闂佺锕﹂崗妯侯潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙棰濆殝闂傚嫬瀚划瀣吋婢舵ɑ鏅滈梺鍓插亞閸犲孩绂掗幒鎴富闁靛牆妫欓埛鎺楁煛閸滀礁浜伴柟顔炬焿閵囨劙骞掗幘璺哄汲闂備胶绮弻銊︽櫠鎼淬劍鍎楁繛鍡樻尰閻撳繘鏌涢埄鍐╃妞わ讣绠撻弻宥夋寠婢舵ɑ鈻堟繝娈垮櫙閹风兘姊虹紒妯曟垿鎮ラ悩璇茬倞闁靛ě鍐ㄧ疄闂傚倷绶氬褔藝椤撱垹鍨傞柛婵嗗閺嬪秹鏌熼崜褏绡�缂佽妫濋弻銈囧枈閸楃偛顫╅梺鍛娒悺銊╁箞閵婏妇绡�闁告洦鍘肩粭锟犳⒑閻熸澘妲婚柟铏悾鐑藉Ω閿斿墽鐦堥梺绋挎湰缁嬫帡鎮炬總鍛娾拻濞达絽婀卞﹢浠嬫煕閳轰礁顏�规洖缍婂璺何涢崹顐ｃ仢妞ゃ垺锕㈤幃娆撳垂椤愶綆鍟庨梻鍌欑濠�杈ㄦ櫠濡わ拷椤灝顫滈敓钘夌暦濮楋拷閺佹捇鎸婃径妯诲瘜闂侀潧鐗嗗Λ娆戜焊閻㈠憡鐓曢悗锝庡墮閳诲牊顨ラ悙鎼疁鐎殿喗鎸虫慨锟介柍鎾呮嫹闁归攱妞藉铏规兜閸涱厺姹楅梺绋款儐閻╊垰鐣峰┑瀣妞ゆ梻鏅崢閬嶆⒑鐟欏嫬鍔ゆい鏇ㄥ弮楠炲﹪宕堕埡瀣閻熸瑥瀚粚璺ㄧ磼閹绘帒鈷旈柟骞垮灩閳规垹锟斤綆浜為ˇ銊╂⒑閹稿孩顥嗘繛澶嬫礋閹嫭鎯旈妸锔规嫽婵炶揪绲介幉锟犲箚閸垻纾煎璺侯儑閸欙拷閻庤娲樼换鍐箚閺冨牆惟闁挎繂绻戠�氬綊鏌涘畝锟介崑娑㈡嫅閻斿吋鐓忓鑸电☉椤╊剟鏌涘锟芥禍鍫曞蓟閻斿吋鍤冮柍鍝勫婢跺绻嗛柟缁樺笒椤忣參鏌ｉ幙鍐ㄥ⒋妞ゃ垺顨婂畷鎺楁晜閽樺浼撴繝鐢靛仜閻楀棝鎮樺┑瀣嚑婵炴垯鍨洪悡鐔兼煛瀹擃喕绀佹禒顕�鎮楃憴鍕婵＄偘绮欏畷娲礋椤栨氨顦ㄩ梺瀹犳〃缁讹繝鏁撻懞銉﹀磳婵﹥妞介幊锟犲Χ閸涱喚浜梻浣侯焾椤戝懘鏁冮妶鍛カ闂佸搫顦悧鍕礉鎼达絽濮柨鐔剁矙濮婂搫效閸パ呬紙濠电偘鍖犻崶鑸垫櫅闂佺懓澧界划顖炴偂濞嗗浚娓婚悗锝庝邯椤庢鏌涘Ο缁樺唉闁哄矉绱曟禒锔炬嫚閹绘帩娼庨梻浣筋嚃閸犳捇宕愬┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			sendNoFightPlayer(guestid);
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			sendNoFightPlayer(guestid);
			return ;
		}
		SAcceptLiveDieBattleFirst sAcceptLiveDieBattleFirst=new SAcceptLiveDieBattleFirst();
		sAcceptLiveDieBattleFirst.hostroleid=hostid;
		sAcceptLiveDieBattleFirst.hostrolename=new PropRole(hostid,true).getName();;
		Onlines.getInstance().send(guestid, sAcceptLiveDieBattleFirst);
	}
	
	public void sendNoFightPlayer(long guestid){
		SAcceptLiveDieBattleFirst sAcceptLiveDieBattleFirst=new SAcceptLiveDieBattleFirst();
		sAcceptLiveDieBattleFirst.hostroleid=0;
		sAcceptLiveDieBattleFirst.hostrolename="";
		Onlines.getInstance().send(guestid, sAcceptLiveDieBattleFirst);
	}
	
	
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793848;

	public int getType() {
		return 793848;
	}


	public CAcceptLiveDieBattleFirst() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptLiveDieBattleFirst) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptLiveDieBattleFirst _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.school;

import fire.pb.school.shouxi.ProfessionLeaderManager;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendElectorWords__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨归…宄邦潖缂佹ɑ濯撮柣鐔煎亰閸ゅ鈹戦悙鎻掔骇闁绘濮撮悾鐑藉箛閺夎法顔愭繛杈剧悼椤牓鎮楅銏♀拺缂佸娉曢悘閬嶆煕鐎ｎ剙浠遍柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝呂熷▎鎯ф缂備胶濮撮悘姘跺Φ閸曨喚鐤�闁圭偓鎯屽Λ銈囩磽娓氬﹥瀚规繝鐢靛Т濞诧箓鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿京纾藉ù锝堟鐢盯鏌ｉ埡濠傜仩闁伙絿鍏橀、鏃堝醇濠靛牜妲版俊鐐�曠换鎰板蓟婵犲偆娼╅柤鍝ヮ暯閹锋椽姊婚崒姘卞缂佸甯楀鍕礋椤栨稓鍘遍梺鍝勫枦閹风兘鏌ｅΔ浣虹煂闁告帗甯為敓鏂ょ秵閸犳牜绮婚幎鑺ョ厸闁告劏鏅滅亸浼存倵濮橆剛绉洪柡灞诲妼閳规垿宕卞☉鎲嬫嫹濡わ拷闇夋繝濠傚婵秹鏌″畝锟介崰搴ㄦ偩閿熺姵鍋嬮柛顐ゅ枎閸撳灚淇婇悙顏勶拷銈嗙濠婂牆鐤悗娑櫭肩换鍡涙煕椤愶絾绀�妤犵偑鍨烘穱濠囧Χ韫囨柨顏舵俊鐐�ら崑鍕洪鐑嗘綎闁惧繒鎳撶�垫煡鏌￠崶鈺佹瀾闁绘繃妫冮弻锝嗘償閵忕姴姣堥梺鍛婃尰閻熴儵鎮鹃悽绋跨妞ゆ牗绋堥幏娲⒑閸涘﹦鈽夐柨鏇畵閸┿儲寰勭�ｃ劋绨诲銈嗘尵閸嬬喐鏅跺☉姘辩＜闁稿本姘ㄥ瓭濡炪値鍘归崝鎴濈暦婵傚憡鍋勯柛婵嗗缁犮儵姊婚崒娆掑厡妞ゃ垹锕敐鐐村緞閹邦剛顦梺鎸庢穿閹烽攱銇勯鐐村枠妤犵偛娲、妯侯煥閿熺晫鑺辨繝姘棅妞ゆ劑鍨烘径鍕箾閸欏澧甸柛鈹垮灲瀹曞ジ濡烽敂鎯у箰闁诲海娅㈤幏鐑芥煥閻斿墎鐭欑�规洑鍗抽獮妯兼崉閸濆嫮浜伴梻浣圭湽閸ㄥ綊鎮樺璺虹獥闁糕剝绋掗悡鏇㈡煛閸ャ儱濡煎ù婊嗘闇夌痪顓㈡敱鐎氾拷? by changhao
 *
 */
public class CSendElectorWords extends __CSendElectorWords__ {
	@Override
	protected void process()
	{
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.PropRole propRole=new fire.pb.PropRole(roleid,true);
		final int school=propRole.getSchool();
		xbean.ProfessionLeaderVoteInfo voteInfo=xtable.Professionleadervotechallenge.select(roleid);
		
		boolean b = false;
		
		if (voteInfo != null)
		{
			b = ProfessionLeaderManager.getInstance().isInChallengePeriod(voteInfo.getChallengetime());
		}
		
		xbean.ProfessionLeaderInfo shouxiInfo=xtable.Professionleader.select(school);
		if(shouxiInfo != null && shouxiInfo.getRoleid() == roleid)
		{
			b = true;
		}		
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剚绗熷Δ锟借灋闁跨喓濮甸埛鎴︽煟閻斿憡绶查柡鍡涗憾閺岋綁顢橀悙璇ф嫹閹间緤缍栭煫鍥ㄦ礈绾惧吋淇婇婵愬殭妞ゅ孩鎹囧娲閳轰胶妲ｉ梺鍛娒肩划娆撳箠閿濆鐐婃い鎺嶈閹疯櫣绱撴担鍓插剰婵炵》绻濆畷锝夊礋椤愶拷閻熼偊鐓ラ柛鎰典簻閻撶喖姊虹紒妯圭繁闁哥姵顨堥幑銏犫攽鐎ｎ亞锛滈梺闈涚墕濡绱撻幘缁樷拻濞达綀濮ょ涵鍫曟煕閻樿尙肖闁告帗甯掗埢搴ㄥ箻瀹曞洨鏆┑鐐存綑閸氬骞嗗畝鍕瀬閻庯綆鍠楅悡銉╂煟閺傚灝顣抽柣顓熺懇閺岋絽鈽夐崡鐐寸彎閻庤娲栭悥濂搞�佸Δ鍛櫢闁伙絽鐬煎Λ顖滄喐閺冨牆绠栭悷娆忓閻熻銇勯弽銊х煀閻㈩垬鍎靛娲川婵犲懎顥濋梺纭呮珪閿氭い顐㈢箳缁辨帒螣鐠囧樊锟芥捇姊洪幆褏绠抽柟铏尵缁參鏁撻悩鏂ユ嫼闂佸憡绋戦敃銉╁煕閹邦厹浜滄い鎾跺仦婢跺嫮绱掗崒姘毙ょ紒顔界懄閹棃骞樼�甸潻鎷锋繝姘拺鐟滅増甯掓禍浼存煕閿濆骸鏋涢棁澶愭煕閺囥劌浜愰柡锟芥禒瀣厽婵☆垱顑欓崵瀣拷瑙勬偠閸庣敻寮婚敐鍛傛棃鏁撴禒瀣櫇妞ゅ繐鐗嗛弰銉︾箾閹存瑥鐏╃紒鐙呯秮閺屻劑寮崒娑欑彧闂佸憡眉缁瑥顫忛搹鍦＜婵☆垳鍎甸幏璇差渻閵堝骸骞栭柣妤佹崄濡垽鏌ｆ惔顖滅У闁哥姵顨婇幃鈥斥枎閹惧鍘介梺鎸庣箓閹虫挾锟芥矮鍗抽弻宥囨嫚閼碱剙鈪甸梺鍝勭焿缁辨洘绂掗敃鍌氱鐟滃酣宕氬☉銏″�垫繛鍫濈仢濞呮﹢鏌涢敐蹇曠М鐎殿噮鍋婇獮妯肩磼濡櫣妾┑鐘灱椤鎹㈤崒鐐茬妞ゆ劧璁ｇ紞鏍ㄧ節婵犲倻澧涢柡鍛焾闇夐柣妯烘▕閸庢垹锟借鎸风欢姘跺蓟濞戙埄鏁冮柣妯诲絻婵酣鏌熼婊冩灈婵﹥妞藉畷姗�宕ｆ径瀣壍闂備胶顭堥敃锕傚箠閹捐鐓濈�广儱顦～鍛存煏閸繃顥戦柟閿嬫そ閺岋綁鎮╅崗鍛板焻闂佸憡鏌ㄩ懟顖炲煝瀹ュ绠涢柣妤�鐗忛崢鐢告⒑閸涘﹤鐏熼柛濠冪墱閿熻姤鐔幏锟�  by changhao
		if(b == false)
		{
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 170009, null);	
			return ;
		}
		
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝鏇㈩敋椤撶姴濮柨鐔剁矙濮婂搫效閸パ呬紙濠电偘鍖犻崘顏呮噧濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣銏㈩焾缁犳牠鏌涚仦鎯у毈闁搞倖娲熼弻锛勪沪鐠囨彃濮曢梺绋款儐閸旀妲愰幘瀛樺濡ょ姰鍔嶅畝鎼佺嵁韫囨拋娲敂閸涱亝瀚奸梻鍌氬�搁悧鍐疾濞戙垺鍎婃繝濠傜墛閻撴洘淇婇姘儓闁抽攱妫冮弻鈩冪瑹閸パ勭亪闂佸疇妫勯ˇ鍨叏閿熶粙鏌嶉妷銉ュ笭缂傚倹鎸绘穱濠囨倷椤忓嫸鎷烽弽顓熷亱婵°倕鍟伴惌娆撴煙鐎电啸缂佺姵妫冮弻鐔兼倻濮楀棙鐣烽梺纭呮珪瀹�鎼佸蓟閿濆绠涙い鎺戝�归幉濂告⒑閸涘﹦鎳冪紒缁樺灦缁岃鲸绻濋崶顬囨煕濠婏拷缁�渚�宕滈柆宥嗙厽閹兼番鍨兼竟妯肩磽瀹ュ拑宸ユい顐㈢箰鐓ゆい蹇撳缁卞爼姊洪崨濠冨闁告挻宀搁獮蹇涙焼瀹ュ棌鎷洪梺缁樺灍閺呮粌鈻嶉幘缁樼厱闁靛鍊曞畵鍡樸亜閵忊�冲摵闁轰焦鍔栧鍕熺紒妯荤彣闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤栨稑浠奸梺缁樺灱濡嫮绮婚幎鑺ョ厵閻庡湱濮撮悡鎰版偨椤栨粌浠辨鐐差槸铻栭柛娑卞帣瑜旈弻娑樷槈閸楃偛绠归悶姘箞濮婂宕掑▎鎴М闂佸湱鈷堥崑濠囧箚鐏炴儳绶為悘鐐垫櫕缁涘繑绻涚�电孝妞ゆ垵鎳橀幃鈥愁潨閿熶粙寮婚悢鍛婄秶闁告挆鍛闂傚倷绀佸畷顒�煤椤撱垹钃熼柨婵嗩槸濡﹢鏌熺粙鍧楊�楅柡鍡楃墦濮婄儤瀵煎▎鎾搭�嶉梺鍦嚀濞层倝锝炶箛鏇犵＜婵☆垵顕ч鎾绘⒑閸涘﹦鈽夐柨鏇樺劦瀹曟洟骞樼紒妯锋嫼闂佺绻愰崥瀣Φ閻斿吋鐓曢柕濞垮劤閸╋綁鏌ｅ☉鍗炴灍缂佺粯绻堝畷銊╊敍濠婂嫭绶梻鍌欒兌閹虫捇鎮樺┑瀣柈妞ゆ劏鎳囬弸鏃�銇勯幇鍫曟闁抽攱鍨块弻娑樷槈濮楀牊鏁炬繝銏ｆ硾鐎氫即寮诲☉銏犖╅柨鏇嫹妞ゃ儱顑囩槐鎺楊敊濞嗘儳娈梺瀹犳椤︻垶鍩㈡惔鈽嗗悑闁告洦鍘惧▔鍧楁⒒閸屾瑨鍏屾い銏狅躬楠炴捇顢旈崱妤冪瓘闂佸憡鎸嗛崟顐㈠箲闂備礁澹婇崑鍛哄锟介幃锟犲即閵忥紕鍘甸柣搴ｆ暩椤牊鐗庨梻浣规偠閸娧囧箯閻戣姤鈷掑ù锝呮憸閺嬪啯銇勯銏╂█鐎规洖缍婂畷绋课旈敓鐣岀不閺嶃劎绠鹃柛鈩兩戠亸顓犵磼閻欐瑥娲﹂悡娆撴倵閻㈡鐒剧亸蹇撯攽閳╁喚娈曢柟鐟版搐椤繒绱掑Ο璇差�撻梺鍛婄☉閿曘儵宕曢幘缁樼厽闁绘劖娼欓崵顒勬煕鐎ｎ亷宸ラ柣锝呭槻閳规垹锟斤綆浜為娲⒑閹稿孩绌块柟鐑筋棑缁辨帡鎮╁畷鍥р拡闂佺懓寮堕幃鍌氼嚕椤掑倹宕夐柕濠忛檮椤旀洟姊绘笟锟藉褑澧濋梺鍝勬噺缁嬫捇鎯�椤忓浂妯勯梺鍝勭灱閸犳捇鏁撻悾灞炬毄妞ゎ厼鐗嗛弳鈺呮⒒娴ｅ憡鎯堟い锔诲枤閸掓帒鈻庤箛锝嗙稁缂傚倷鐒﹂…鍥偡瑜版帗鐓ラ柣鏃傜帛椤ュ銇勯鐐寸┛妞わ箒娉涢…鑳槼缂佽鐗嗛～蹇撁洪鍕炊闂佸憡娲﹂崜娆忊枍閵堝洨纾藉ù锝呭閸庢劙鏌熼崨濠傚姢閸楅亶鏌熼悧鍫熺凡缂佺姾娅曟穱濠囧Χ韫囨柨顏堕梻浣虹帛閹稿鎯勯鐐茶摕婵炴垶菤濡插牓鏌涘Δ鍐ㄤ沪闁诲繑鎹囧娲川婵犲繗锟藉灝霉濠婂棙纭炬い顐㈢箰鐓ゆい蹇撳椤斿洭鏌熼崗鑲╂殬闁糕晛瀚～蹇涘垂椤曞懏瀵岄梺闈涚墕濡瑩鎳栭悩缁樼厱闁靛鍨哄▍鍛磼娓氬﹦鐣遍柍瑙勫灴閸┿儵宕卞Δ鍐у摋闂備礁鎲￠懝楣冾敄婢跺﹦鏆﹀ù鍏兼綑缁犳稒銇勯幋鏃�娅嗙紒瀣浮閺佸秹骞囬鐔奉�撻梺鑺ッˇ顖滄暜椤栫偞鈷掑ù锝堫潐閵囩喖鏌涘Ο鍦煓闁诡喚鍏橀弫鍐磼濮樿京鏉介梻渚�娼ч…顓熶繆閸モ晛濮柨鐔剁矙濮婃椽宕ㄦ繝鍌氼潊闂佸搫鍊搁崐鍦矉閹烘顫呴柣娆欐嫹婵炴挸顭烽弻鏇㈠醇濠靛棙娈梺璇叉禋娴滄繄鎹㈠☉銏″殤妞ゆ帪鎷烽柡瀣灴閺岀喐绗熼崹顔碱潎闂佽桨鐒﹂幐鑽ょ矉閹烘棑鎷烽敐搴′簽闁告ɑ鎹囧娲川婵犲嫮鐣甸柣搴㈠嚬閸撶喖寮幘缁樺殟闁靛鍎遍～鎺戭渻閵堝啫鐏俊顐㈠暙閻ｉ攱绺介崨濠備簻闂佸憡鐟ラˇ顖烆敂鐟欏嫮绡�闁汇垽娼ф禒锔界箾閸忚偐鎳囩�规洏鍎抽敓鏂ょ秵閸犳宕戦敓鐘崇厪濠电偟鍋撳▍鎾绘煛娴ｅ憡澶勭紒缁樼☉椤斿繘顢欓懡銈呭毈闂備胶绮幐濠氭偡閳哄懎钃熸繛鎴欏灩缁狅絾绻涢崱妤呯崪闁归鍏樺浠嬵敃椤掍礁顏跺┑顔筋焽閸嬫挾锟芥熬鎷� by changhao
		boolean modify = false;
        xbean.ProfessionLeaderTicketInfo candInfo=fire.pb.school.shouxi.ProfessionLeaderManager.getInstance().getCandInfoFromRoleid(roleid, school);
        if(candInfo!=null)
        {
        	modify = true;
        }
        
        if (modify == false)
        {
    		if (!ProfessionLeaderManager.getInstance().isInChallengePeriod(System.currentTimeMillis()))
    		{//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑喘闂備浇娉曢崰鎰板垂濠靛鍊块柨鏃傚亾瀹曞弶绻濋棃娑卞剰闁绘劕锕﹂幉鍛婃償閳儻缍侀、妤呭礋椤戣姤瀚奸梻浣告啞缁诲倻锟芥凹鍣ｉ崺銏″緞閹邦厾鍘介棅顐㈡处閺屻劍鎱ㄥ鍥锋嫹鐟欏嫭澶勯柛瀣工閻ｇ兘鎮㈤崗鐓庝缓闂傚倸鐗婄粙鎴澬ч弻銉︹拻闁稿本鐟чˇ锕�顭块悷甯含鐎规洘鍨垮畷銊╁级閹寸姷鏆板┑鐘垫暩婵挳骞忕�ｎ�喖宕熼娑掓嫼闂佸憡绻傜�氼厼锕㈤悧鍫㈢闁告瑥顦介悞浠嬫煙楠炲灝鐏╅柍钘夘槸椤劍鎯旈埗搴撴櫊濮婅櫣鎷犻幓鎺濆妷闂佸憡鍨电紞濠傜暦濠婂啠妲堟繛鍡樺灩瑜伴箖姊洪崫鍕偍闁糕晛瀚板顐㈩吋婢跺鍘介梺褰掑亰閸犳稖妫㈤梻浣告贡閺屽鈻嶉敐鍥潟闁规崘顕х壕鍏肩箾閸℃ê鐏ュ┑鈥茬矙閺岋箓宕橀銏犳懙闂侀潧娲ょ�氱増淇婇悜钘壩ㄩ柨鏃傜帛閿涗胶绱撻崒娆掑厡缂侇噮鍨堕幆鍕敍濮樿鲸娈惧銈呯箰閻楀棛绮堥崘鈹夸簻闊洦鎸婚悡锟藉┑顔筋焾閸╂牠鍩涢幋锔解拻闁割偆鍠撻埦浣割熆鐠哄搫顏柡灞剧洴瀵噣鏁撴禒瀣亱婵犲﹤鎳庨崹婵嬫倵閿濆骸鏋涚紒鐘冲▕閺岋繝宕橀埡鍌氶瀺闁诲孩鑹剧紞濠囧蓟閵娿儮鏀介柛鈩冧緱閿熻姤顨呴湁婵犲﹤瀚慨宥夋煛瀹�锟介崰搴ㄦ偩閿熺姵鍋嬮柛顐ゅ枎閸撳灚淇婇悙顏勶拷銈嗙濠婂牆鐤悗娑櫭肩换鍡涙煕椤愶絾绀�妤犵偑鍨烘穱濠囧Χ韫囨柨顏舵俊鐐�ら崑鍕洪鐑嗘綎闁惧繒鎳撶�垫煡鏌￠崶鈺佹瀾闁绘繃妫冮弻锝嗘償閵忕姴姣堥梺鍛婃尰閻熴儵鎮鹃悽绋跨妞ゆ牗绋撻崢浠嬫⒑缂佹ɑ鐓ラ柟鑺ョ矒楠炲﹪宕橀钘夛拷鍨叏濮楋拷濡法鑺辨禒瀣厵妤犵偛鐏濋悘鑼拷瑙勬礀瀹曨剟鍩ユ径濞炬瀻闁瑰瓨绻傜粻娲⒒閸屾瑧顦︾紓宥咃躬瀹曟垶绻濋崶褍鍋嶉梺鍏肩ゴ閺呮稓娆㈤妶鍛斀闁绘ê纾。鏌ユ煟閹惧崬鍔﹂柡宀嬬秮瀵噣宕掑鍐偧婵＄偑鍊戦崕閬嵥囬幍顔藉床婵犻潧顑嗛弲鎼佹煠閹帒鍔滅紓宥呮喘閺屽秵娼幍顕呮М闂佽绻愰敃銈夊煘閹达附鍊烽柛娆忣樈濡繝姊洪崷顓х劸妞ゎ厼鍢查锝夊蓟閵夈儳顔愭繛杈剧到濠�閬嶅矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈瀛濈紓鍌氱Т閿曨亜顕ｇ拠宸悑濠㈣泛锕ｇ槐鍫曟⒑閸涘﹥澶勯柛瀣崌楠炲繘鏌ㄧ�ｎ剛鐦堝┑顔角滈崕濠氬箯閻戣棄宸濋柡澶嬪灩閻撴垶绻濋姀锝嗙【闁活剙銈搁幆渚�宕奸妷锔规嫽闂佺鏈銊︽櫠濞戞氨纾奸悗锝庡亜濞搭噣鏌℃担鍝バ㈡い鎾炽偢瀹曞崬鈻庨幋顓炴櫗闂傚倷绀佸﹢閬嶅磻閹捐绀堟慨妯垮煐閸嬪倸鈹戦崒姘暈闁绘挻鐩幃姗�鎮欓幓鎺嗘寖闂佸疇妫勯ˇ鐢稿蓟閿濆鏅查柛鈩冪懅閻ゅ嫰姊烘潪鎵妽闁规瓕宕电划瀣箳閺冩挻瀚归柨婵嗙凹缁ㄤ粙鏌ㄥ☉娆戞创婵﹨娅ｇ槐鎺懳熼崫鍕垫綋闂備礁婀遍埛鍫ュ磻婵犲洤绠栭柨鐔哄Т閸楁娊鏌曡箛銉х？闁告鏁诲铏圭磼濡櫣浠搁梺鎸庢磵閺呮盯鍩㈤幘璇插嵆闁靛骏绱曢崢杈ㄧ節閻㈤潧孝闁稿﹦绮粋鎺戔槈濮樿京锛滅紓鍌欑劍椤洤煤鐎涙﹩娈介柣鎰▕閸庢棃鏌熼鐣屾噰鐎规洖缍婇、鏇㈠閿涘嫭娈叉繝鐢靛Х閺佹悂宕戦悙鍝勭闁煎鍊曢弸鍫拷骞垮劚椤︿即宕曟惔鈧簻闁哄稁鍋勬禒婊堟煢閸愵亜鏋戠紒缁樼洴楠炲鈻庤箛鏇氱棯闂備胶顭堥敃銈夆�﹂悜钘夎摕婵炴垯鍨瑰敮闂佹寧绻傞幊搴ㄢ�栭崼婵愭富闁靛牆鎳橀悰婊堟煙閸戙倖瀚�
    			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141983, null);
    			return;
    		}        	
        }
        
        if (electorwords.length()>25)
        {
			return;
		}
        
		new fire.pb.school.shouxi.PSendElectorWords(roleid,electorwords, modify).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810435;

	public int getType() {
		return 810435;
	}

	public java.lang.String electorwords;

	public CSendElectorWords() {
		electorwords = "";
	}

	public CSendElectorWords(java.lang.String _electorwords_) {
		this.electorwords = _electorwords_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(electorwords, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		electorwords = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendElectorWords) {
			CSendElectorWords _o_ = (CSendElectorWords)_o1_;
			if (!electorwords.equals(_o_.electorwords)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += electorwords.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(electorwords.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


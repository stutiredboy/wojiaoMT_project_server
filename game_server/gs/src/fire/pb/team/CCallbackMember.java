
package fire.pb.team;



import fire.pb.PropRole;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.buff.OperateType;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCallbackMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戞氨鐭嗛柛顐ゅ枔缁犻箖鏌涢埄鍐炬畼閻犳劏鏅滅换娑橆啅椤旇崵鍑归梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�
 * @author changhao
 *
 */
public class CCallbackMember extends __CCallbackMember__ {
	
	Team team;
	
	@Override
	protected void process() {
		// protocol handle
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		mkdb.Procedure callbackMemberP = new mkdb.Procedure()
		{

			@Override
			protected boolean process()
			{
				//lock start
				Long teamId = xtable.Roleid2teamid.select(leaderRoleId);
				if(teamId != null)
					team = new Team(teamId,false);
				else
					return true;
				if(!team.isTeamLeader(leaderRoleId))
					return true;//濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氳淇婇妶鍕妽闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋垮椤ㄥ懘濡撮幒鎴僵闁绘劦鍓欓鍫曟⒒娴ｇ瓔鍤冮柛顭戝灦閹偤鏁冮敓浠嬵敋閵夆晛绀嬫い鎾寸箖閸曞啴姊虹拠鈥崇�婚柛娑卞弮閸欙繝姊婚崒姘拷椋庢濮橆剦鐒界憸鏃囨婵炲濮撮鍡涘磻閸岀偞鐓曟い鎰剁悼缁犮儵鏌ｉ幒宥囩煓闁哄被鍔戦幃銏ゅ传閸曟埊缍侀弻锝夊箻鐠鸿　鏋呴梺鍝勭焿缂嶄線骞冮姀銈呭窛濠电姴瀚崵鎺旂磽閸屾瑨鍏岄悗姘箻瀹曠喖顢旈崱娆戞毎闂傚倷绀侀幉锟犳偡閵夆敡鍥ㄥ閺夋垹锛欓梺褰掑亰閸ｎ垶骞忔搴㈠枂闁告洦鍓涢敍姗�姊虹粙鎸庢崳闁轰浇顕ч锝夘敃閿曪拷缁�鍐煃閸濆嫬锟芥悂顢撻幘缁樷拺闁诡垎鍛啈濡炪倖娲橀悧鐘茬暦椤栫偛纾奸柣鎰ˉ閹风粯绻涙潏鍓у埌闁硅绻濋獮鍡涘醇閵夛箑锟藉灚鎱ㄥΟ鍝勮埞闁告ê顕敓鍊燁潐濞叉牕锕㈤柆宥呯闁告洦鍓氭刊鎾煛閸ユ湹绨界紒澶樺櫍閺屸剝鎷呯粙鍖℃嫹閸ф绠板┑鐘插暙缁剁偞淇婇婊冨妺妞ゆ梹鎹囧铏规嫚閺屻儺锟芥绱掗悩鑼х�规洘娲熼弻鍡楃暤閵夈儲鍠樻鐐茬箰閻ｆ繃绻濋崘鈺冪炕闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
//				Long[] roleids = new Long[team.getAllMemberIds().size()];
//				roleids[0] = leaderRoleId;
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,team.getAllMemberIds()));
				//Lock end
				
				if(!checkTeamStatusValid(leaderRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷顏呮媴缁嬪簱鎷梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈥充汗闂佸湱绮敮鎺楋綖濮樿埖鐓熼柣鎰嚟椤ｈ尙绱掔拠鑼妞ゎ偄绻戠换婵嗩潩椤掑偊绱查梻浣瑰濡礁螞閸曨垼鏁傞柛顐ｆ礃閳锋帒霉閿濆懏鍟為柛鐔哄仱閺岋絽螖婵犲倸绠诲┑鈥冲级閸旀瑥顕ｉ幘顔藉亹闁汇垻鏁搁崝鍫曟⒒娴ｈ櫣銆婇柛鎾寸箘缁瑩骞掑Δ浣镐簵闂佺粯鏌ㄩ崥瀣偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟界喊宥夊Φ閸曨喚鐤�闁挎繂鎳嶇花濠氭⒑鐎圭媭娼愰柛銊ユ健閵嗕礁鈻庨幘鏉戞疅闂侀潧顦崕濠氬箯閻戣棄绠涙い鎾楀嫷鍟嶉梻浣虹帛閸ㄩ潧煤閿旀拝鎷峰杈ㄥ殌闁宠鍨块幃娆撴嚋闂堟稒閿紓鍌氬�哥粙鍕箯瀹勯偊娓婚柕鍫濇缁�鍐煟濡ゅ啫孝闁伙絽鍢查埞鎴狅拷锝庝簽椤︺劌顪冮妶鍡樷拻闁哄拋鍋婂畷銏ゅ箹娴ｅ厜鎷洪梺鍛婄☉閿曘倖鎱ㄩ敓浠嬫⒑閸濆嫭鍣虹紒顔芥尭椤曪綁骞栨担鍝ヮ槹濡炪倖鎸炬慨鐑芥晬濠婂啠鏀介幒鎶藉磹瑜旈獮蹇涙煥鐎ｃ劋绨婚梺鎸庢⒒閸嬫捇寮抽渚囨闁绘劘顕滃銉╂懚閺嶎厽鐓曟繛鎴濆船閺嬫盯鏌ｈ鐎氼厾鎹㈠┑瀣潊闁挎繂妫涢妴鎰版⒑閹稿孩纾搁柛濠冪箞楠炲棝宕橀纰辨綂闂侀潧鐗嗗Λ宀勫箯濞差亝鈷戠痪顓炴噹娴滃綊鏌涚�ｎ偆娲寸�规洘绻堟俊鑸靛緞鐎ｎ剙骞堥梺璇插嚱缂嶅棝宕滃▎鎰浄婵犲﹤鐗婇悡鍐磽娴ｈ偂鎴濈暦閸曨厾纾奸柣妯虹－濞插锟芥鍠楅幐鎶藉箖閳哄懏鍋ㄩ梻鍫熺☉铦庨梻鍌氬�搁崐鐑芥嚄閸洖鍌ㄧ憸鏃堟晲閻愬搫鍗抽柕蹇曞Х閿涙瑩姊洪崫鍕枆闁告ü绮欏畷鎴﹀煛閸涱喒鎷哄銈嗗釜閹烽绱掓径灞炬毈闁糕晜鐩獮鎺懳旀担鍝勫箞闂備浇顫夊姗�宕ラ敓鐣岀磼閵娿儺鐓奸柡宀嬬磿閿熸枻缍嗘禍顏堝矗閸曨垱鐓涚�癸拷閿熶粙宕伴弽褏鏆﹂柨婵嗘缁剁偛鈹戦悙闈涗壕闁诲繐妫濆缁樻媴閼恒儯锟藉啰绱掗敓鑺ユ媴閾忓湱鐓嬮梺鑽ゅ枑婢瑰棝寮抽敃鍌涚厽闁规儳鍟块惁銊╂煟閹惧崬鍔﹂柡灞剧☉閳藉宕￠悙宸骄闂備焦妞块崢浠嬨�冮崨鏉戠厴闁硅揪闄勯崑鎰箾閸喎顕滄慨锝呯焸濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氭澘鐣烽鐐查敜婵°倓鐒﹀▍銏ゆ⒑娴兼瑧鍒伴柣顓炵墦閹偞銈ｉ崘鈺冨弳闂佸搫娲﹂敋闁诲繐寮堕妵鍕閳╁喚妫冮悗瑙勬礈閸樠囧煘閹达箑閱囨い鎰╁灪閸婃稒绻濋悽闈浶ユい锝堟鍗遍柛娑欐綑閸ㄥ倻锟借娲栧ú銈夊垂濠靛洢浜滈柡宥庡亜娴狅箓鏌涙繝鍌氼暢闁跨喕妫勭粻宥夊磿闁秴绠悗锝庝簵閿熻姤甯楃换婵嗩潩椤撶儑鎷烽悽鍛婄叆婵犻潧妫濋妤�顭胯閸犳牠婀侀梺缁橈供閸嬪懎鈻嶉崱娑欑厪闁搞儜鍐句純婵犳鍣幏鐑芥⒑閻愯棄鍔氱痪缁㈠幗缁傛帡宕妷褏锛濇繛杈剧到婢瑰﹪宕曡箛鏂讳簻闁挎梻鍋撻弳顒勬煏閸℃洜顦︽い顐ｇ矒閺佹捇鎳為妷銈囩畾濠殿喗绻傞惌鍫澪ｉ幆褜娓婚柕鍫濈箺椤撴椽鏌熼崙銈嗗(illegal)
					TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷顏呮媴缁嬪簱鎷梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈥充汗闂佸湱绮敮鎺楋綖濮樿埖鐓熼柣鎰嚟椤ｈ尙绱掔拠鑼妞ゎ偄绻戠换婵嗩潩椤掑偊绱查梻浣瑰濡礁螞閸曨垼鏁傞柛顐ｆ礃閳锋帒霉閿濆懏鍟為柛鐔哄仱閺岋絽螖婵犲倸绠诲┑鈥冲级閸旀瑥顕ｉ幘顔藉亹闁汇垻鏁搁崝鍫曟⒒娴ｈ櫣銆婇柛鎾寸箘缁瑩骞掑Δ浣镐簵闂佺粯鏌ㄩ崥瀣偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟界喊宥夊Φ閸曨喚鐤�闁挎繂鎳嶇花濠氭⒑鐎圭媭娼愰柛銊ユ健閵嗕礁鈻庨幘鏉戞疅闂侀潧顦崕濠氬箯閻戣棄绠涙い鎾楀嫷鍟嶉梻浣虹帛閸ㄩ潧煤閿旀拝鎷峰杈ㄥ殌闁宠鍨块幃娆撴嚋闂堟稒閿紓鍌氬�哥粙鍕箯瀹勯偊娓婚柕鍫濇缁�鍐煟濡ゅ啫孝闁伙絽鍢查埞鎴狅拷锝庝簽椤︺劌顪冮妶鍡樷拻闁哄拋鍋婂畷銏ゅ箹娴ｅ厜鎷洪梺鍛婄☉閿曘倖鎱ㄩ敓浠嬫⒑閸濆嫭鍣虹紒顔芥尭椤曪綁骞栨担鍝ヮ槹濡炪倖鎸炬慨鐑芥晬濠婂啠鏀介幒鎶藉磹瑜旈獮蹇涙煥鐎ｃ劋绨婚梺鎸庢⒒閸嬫捇寮抽渚囨闁绘劘顕滃銉╂懚閺嶎厽鐓曟繛鎴濆船閺嬫盯鏌ｈ鐎氼厾鎹㈠┑瀣潊闁挎繂妫涢妴鎰版⒑閹稿孩纾搁柛濠冪箞楠炲棝宕橀纰辨綂闂侀潧鐗嗗Λ宀勫箯濞差亝鈷戠痪顓炴噹娴滃綊鏌涚�ｎ偆娲寸�规洘绻堟俊鑸靛緞鐎ｎ剙骞堥梺璇插嚱缂嶅棝宕滃▎鎰浄婵犲﹤鐗婇悡鍐磽娴ｈ偂鎴濈暦閸曨厾纾奸柣妯虹－濞插锟芥鍠楅幐鎶藉箖閳哄懏鍋ㄩ梻鍫熺☉铦庢繝鐢靛Х閺佸憡鎱ㄩ悜钘夋瀬闁告稑锕ラ崣蹇涙煟閵忋倖娑ч柡瀣墢閿熻棄绠嶉崕閬嶆偋濠婂牆绾ф繛宸簼閳锋帡鏌涚仦鍓ф噮缂佹劖姊圭换娑㈡偂鎼搭喚鍚嬪Δ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�?,teamId: " + teamId);
					return true;
				}
				
				PropRole leaderprole = new PropRole(leaderRoleId, true);
				if(leaderprole.getProperties().getCruise() > 0) {
					TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄矉绻濆畷顏呮媴缁嬪簱鎷梻浣告惈閺堫剟鎯勯鐐拷渚�寮撮姀鈥充汗闂佸湱绮敮鎺楋綖濮樿埖鐓熼柣鎰嚟椤ｈ尙绱掔拠鑼妞ゎ偄绻戠换婵嗩潩椤掑偊绱查梻浣瑰濡礁螞閸曨垼鏁傞柛顐ｆ礃閳锋帒霉閿濆懏鍟為柛鐔哄仱閺岋絽螖婵犲倸绠诲┑鈥冲级閸旀瑥顕ｉ幘顔藉亹闁汇垻鏁搁崝鍫曟⒒娴ｈ櫣銆婇柛鎾寸箘缁瑩骞掑Δ浣镐簵闂佺粯鏌ㄩ崥瀣偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟界喊宥夊Φ閸曨喚鐤�濠电姴鍟悵姘舵⒑鐠団�虫灈缂傚秴锕悰顕�宕堕澶嬫櫍闂佺粯鏌ㄩ幖顐﹀吹閹烘鈷掑〒姘炬嫹婵炰匠鍏炬稑鈻庨幋鐐存闂佺偨鍎辩壕顓㈠汲閿斿浜滈柟鏉垮閻ｉ亶宕鐐粹拺闂傚牊渚楀Σ褰掓煕閺傜偛鎳愭稉宥夋煙閹规劦鍤欓柦鍐枛閺岋綁寮崹顔藉�梺鍝勬噺閹倿寮婚妸鈺傚亞闁稿本绋戦锟�?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡搫鑸归柍瑙勫灴閹瑩宕ｆ径妯伙紒闂備焦瀵ч懝楣冣�﹂懗顖ｆ闂佸摜濮甸〃鍫ュ箲閵忕姭妲堥柕蹇曞Х閻撴垶绻濋姀锝嗙【闁兼椿鍨堕崺娑樼暆閸曨剙锟藉灚绻涢崼婵堜虎闁哄鍠庨埞鎴︽倷鐠囇冧紣闂佷紮绲块崗姗�鐛幒妤�绠ｆい鎾跺Т瀵娊姊虹涵鍛棈闁规椿浜炵槐鐐哄炊椤掞拷缁狀垶鏌ｉ幋锝嗩棄闁藉啰鍠栭弻鏇熷緞濞戞粌鎮呴梺鐟板槻椤嘲顫忓ú顏勫窛濠电姴鍊歌濠电偛鐡ㄧ划宥囧垝閹炬剚鍤曢柛娑橈攻閸庣喖鏌曟繝蹇擃洭闁告鏁婚弻锝夋偐閸欏宸堕梺鍛婃处閸嬫帗瀵奸敓锟�,teamId: " + teamId);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 160434, null);
					return true;
				}
				
				PropRole callbackprole = new PropRole(memberid, true);
				if(callbackprole.getProperties().getCruise() > 0) {
					TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢绘俊鐐�栭悧婊堝磻濞戞氨鐭嗛柛顐ゅ枔缁犻箖鏌涢埄鍐炬畼閻犳劏鏅滅换娑橆啅椤旇崵鐩庨梺鍛婂姧閹烽攱淇婇悙顏勶拷鏍箰妤ｅ啫鐤柛褎顨呯粻浼存煥閻斿墎鐭欐慨濠勭帛閹峰懘鎼归悷鎵偧婵犵妲呴崑鍕疮閺夋埈鍤曢柕濞炬櫆閻掕偐锟藉箍鍎遍幊鎰版偘閵夆晜鈷戦柛娑橈功閳藉鏌ｆ幊閸旀垿骞冮敓鐘冲亜闁稿繗鍋愰崢顏呯節閻㈤潧浠滈柣蹇旂箞瀹曟繂顫濋婊�绨婚棅顐㈡搐閿曘儱鈻嶆繝鍥ㄧ厵妞ゆ棁鍋愮粔鐑橆殽閻愬弶鍠樻い銏★耿閹垽宕崟顐ｎ吋闂傚倸鍊风欢姘焽瑜嶈灋婵炲棙鍨堕弳婊堟煃閵夈儳锛嶉柡鍡檮閵囧嫰骞囬崜浣烘殸闁哥儐鍨跺娲濞戣鲸效闂佸憡鏋崨顖欑瑝闂佽宕橀褔鎷戦悢鍏肩厽闁哄倸鐏濋幃鎴︽煛閸涱喗鍊愰柡灞诲姂閹倝宕掑☉姗嗕紦?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡搫鑸归柍瑙勫灴閹瑩宕ｆ径妯伙紒闂備焦瀵ч懝楣冣�﹂懗顖ｆ闂佸摜濮甸〃鍫ュ箲閵忕姭妲堥柕蹇曞Х閻撴垶绻濋姀锝嗙【闁兼椿鍨堕崺娑樼暆閸曨剙锟藉灚绻涢崼婵堜虎闁哄鍠庨埞鎴︽倷鐠囇冧紣闂佷紮绲块崗姗�鐛幒妤�绠ｆい鎾跺Т瀵娊姊虹涵鍛棈闁规椿浜炵槐鐐哄炊椤掞拷缁狀垶鏌ｉ幋锝嗩棄闁藉啰鍠栭弻鏇熷緞濞戞粌鎮呴梺鐟板槻椤嘲顫忓ú顏勫窛濠电姴鍊歌濠电偛鐡ㄧ划宥囧垝閹炬剚鍤曢柛娑橈攻閸庣喖鏌曟繝蹇擃洭闁告鏁婚弻锝夋偐閸欏宸堕梺鍛婃处閸嬫帗瀵奸敓锟�,teamId: " + teamId);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 160434, null);
					return true;
				}
				
				Long battleid = xtable.Roleid2battleid.select(memberid);
				if (battleid != null)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 162134, null);
					return true;
				}
				
				java.util.List<Long> absentList = new java.util.LinkedList<Long>();
				absentList.addAll(team.getAbsentMemberIds());
				java.util.List<Long> callbacklist = new java.util.LinkedList<Long>();
				
				for(long roleId : absentList)
				{
					BuffAgent buffagent = new BuffRoleImpl(roleId);
					if(roleId == memberid && buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM_MEMBER_NORMAL))
					{
						//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀閸屻劎鎲搁弬璺ㄦ殾妞ゆ牜鍋涢柨銈嗕繆閵堝嫮鍔嶆繛鍛灲濮婄儤瀵煎▎鎴濆煂闂佸吋妞块崹璺侯嚕閹间礁绫嶉柛灞剧矌閿涙粓姊虹紒妯忣亜螣婵犲洦鍋傚┑鍌氭啞閻撴盯鎮橀悙鎻掆挃妞ゎ剝鍋愮槐鎺楁偐瀹曞洢锟芥帡鏌ㄩ悢鍛婄伄缂傚秴妫欑粋宥咁煥閸曨剙寮块梺鍝勬川閸庢劕銆掓繝姘厪闁割偅绻冮ˉ婊呯磼濡や焦鐨戠紒杈ㄥ浮椤㈡瑦绺界粙鍨強闁诲孩顔栭崳顕�宕戞繝鍥ワ拷浣割潩閼稿灚娅㈤梺鑺ッˇ閬嶅汲閿斿浜滈柟鏉垮閻ｉ亶宕鐐粹拺闂傚牊渚楀Σ褰掓煕閺傜偛鎳愭稉宥夋煙閹规劦鍤欓柦鍐枛閺岋綁寮崒妤佸珱闂佽桨绀佺�氫即寮婚妶澶婄疀濞达絽鎽滄禒鈺呮⒑閸涘姘舵晸閼恒儲鐏遍柡锟芥禒瀣厽闁归偊鍨伴惃鍝勵熆瑜庨惄顖炲蓟濞戙垹惟闁靛／鍌濇婵＄偑鍊ら崑鍕崲閹寸姷绱﹀ù鐘差儏瀹告繂鈹戦悩鎻掞拷椋庤姳婵犳碍鈷掗柛灞剧懅椤︼箓鏌ｈ箛鏃傜疄妞ゃ垺鐗犲畷銊╁级閹存繂娈ら梻浣芥硶閸犲秶鍒掑▎蹇ｆ綎缂備焦蓱婵挳鏌涘┑鍕姢濡ゆ梹绻濋悽闈涗粧闁告牜濞�瀹曘劑顢涘鍛脯缂傚倷鑳堕崑鎾诲磿閹剁瓔鏁勯柛鎰ㄦ櫇椤╂煡鎮峰▎蹇擃仴濞存粍绮撻弻鐔煎级閸噮鏆㈤梺浼欑秮娴滃爼寮婚妶澶嬵棃闁冲搫鍊搁锟�?
						callbacklist.add(roleId);
					}
				}
				//TODO 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔芥尭閻ｉ攱绺界粙鍨祮闂佺粯鏌ㄩ幖顐︾嵁閹扮増鈷掑ù锝堟閵嗗﹪鏌涢幘瀵哥疄闁靛棗鍟村畷銊э拷娑櫳戝▍銏ゆ⒑閼恒儍顏埶囨禒瀣亗濠靛倸鎲￠悡鍐煏婢舵稑顩褏鏁搁敓鍊燁潐濞叉牠鎮ユ總鎼烇拷浣肝旀担鐟邦�撻梺鍛婄懃椤︻垶鎯佽濮婂宕掑▎鎺戝帯缂備緡鍣崹鎷岀亱闂佸憡鍔﹂崰鏍磼閳哄懏鈷戞い鎺炴嫹缂佸顕划锝呂旈崨顔惧幈濠电偞鍨堕…鍥箺閻樼粯鐓熼柟鎯х摠缁�鍐磼缂佹绠栫紒缁樼箞瀹曟帒顫濋鐕佸晥闂備浇顕х�涒晝鍠婂鍡欑彾闁糕剝鐟﹂～鏇㈡煙閻愵剙澧柛姘儔閺屾稑顭ㄩ崘銊︽闂佸憡鍑归崑鍕煘閹达富鏁婄痪顓炲槻娴兼劙姊洪棃娑氬闁诡喖鍊块悰顕�宕橀纰辨綂闂侀潧鐗嗛幊鎰版偩妤ｅ啯鈷戦柛婵嗗濡叉悂鏌ｈ箛鏃傜畼缂侇喖顭烽獮瀣晜鐟欙絾瀚介梻浣侯焾閺堫剟鎳濇ィ鍐╂櫢闁兼亽鍎查崐鎰拷瑙勬处閸ㄨ京锟介潧銈稿鍫曞箣閻橀潧鐐婇梻浣烘嚀閸氬鎮鹃鍫濈鐎癸拷閿熺晫鍒掓繝姘亜闁稿繗鍋愰崢鐢告⒑鐠団�崇仭婵犮垺顭堥。鍧楁⒒娴ｅ憡鎯堥柟宄邦儔瀹曟粌顫濈捄铏圭杽闂侀潧顭堥崕娆撴偄閻撳骸鐎銈嗘⒐閸庡磭鏁崸妤佺厽闁绘劕顕。鑼磼鐠囪尙澧曟い顐㈢箲缁绘繂顫濋鍌︾床闂備焦瀵уΛ浣肝涢崟顖ｆ晜闁割偅娲橀埛鎺懨归敐鍛暈閻犳劏鍓濋妵鍕敇閻愰潧鈪遍梺璺ㄥ枙濡嫰鎮樺杈ㄦ殰闁炽儱纾弳锔界節闂堟侗鍎愰柡鍛焾闇夐柣妯烘▕閸庢劙鏌嶉柨瀣伌婵﹤顭峰畷鐓庮潩椤撶喓褰堢紓鍌欑筏閹风兘鎮楅敐搴℃灍闁绘挻娲熼弻锟犲磼濠靛洨銆婇梺缁樺笧閸忔﹢寮婚弴銏犵倞闁靛鍎遍～鎺戭渻閵堝啫鐏繛鑼枛瀵偊宕橀鑺ユ婵炲濮撮鍡涘吹鐎ｎ喗鐓ラ柣鏇炲�圭�氾拷?
				if(callbacklist.size() == 0)
				{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱楠炴﹢鏌曢崼鐔稿唉闁哄备锟藉磭鏆嗛悗锝庡墰閺嗐倝姊洪崫鍕缂佸缍婂畷娲焺閸愨晛顎撻梺鍛婄☉閿曘儵顢欐径宀�纾介柛灞剧懆閸忓苯鈹戦鐐毄闁轰緡鍣ｉ弫鎾绘偐閼艰埖鎲版繝鐢靛仦閸ㄦ儼褰滈梺鍝勵儏鐎涒晜绌辨繝鍥舵晬婵犻潧娴傛禒鈺傜箾鐎电袥闁哄懐濞�楠炲啫鐣￠柇锔惧弳闂佸壊鍋呯换锟介柛鐘诧躬濮婅櫣绮欏▎鎯у壈闂佹寧娲忛崐婵嬪箖妤ｅ啯鍊荤紒娑橆儐閺呫垽姊洪崨濠冨闁稿﹦濮鹃ˇ褰掓煛鐏炲墽娲村┑锛勫厴閺佹劙宕ㄩ褏锟界兘姊绘担鍛婃儓婵☆偅绋掔换娑㈡晸閼恒儲鍙忓┑鐘插暞閵囨繄锟借娲﹂崑濠傜暦閻旂⒈鏁嗗璺侯儛濡囨⒒閸屾瑨鍏屾い顓炵墦閺佸啴濡舵径鍡嫹閿曞倹鍊婚柦妯侯槺娴煎姊洪崫鍕枆闁告ê銈搁幃娆愮節閸愶缚绨婚梺鐟版惈缁夌兘顢欐径鎰厵闂傚牃鏅滅�氬綊姊婚崒姘拷鐑芥嚄閸撲礁鍨濇い鏍嚤濞戙垹绀冩い鏃囧亹閸濇姊绘笟鍥у缂佸顕划锝呂旈崨顔惧弳闂佺粯娲栭崐鍦拷姘炬嫹
					//psend(leaderRoleId,new STeamError(TeamError.NoAbsentMember));
					fire.pb.talk.MessageMgr.psendMsgNotify(leaderRoleId, 150117, null);
					TeamManager.logger.debug("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滄鐐寸墪鑿愭い鎺炴嫹濠德ゅ亹缁辨帡鎮╅棃娑欑亪闂佸搫鐫欓崱娆戞澑闂佹寧绻傞幊宥囪姳娴犲鈷戠�规洖娲ㄧ敮娑欐叏婵犲偆鐓奸柡浣规崌閹稿﹥寰勫畝锟介弳娑㈡⒑缁嬪潡鍙勫ù婊冪埣楠炲啳顦圭�规洖宕埥澶娢熼崫鍕喚闂傚倷绀佸﹢閬嶆惞鎼淬劌绐楁俊銈呮噹绾惧鏌ｅΟ鎸庣彧闁告瑥绻戞穱濠囶敍濠婂啫浠橀柣銏╁灥濞夋盯婀佸┑鐘诧工鐎氼噣鎯屽畝鍕厵闁告瑥顦伴崐鎰版煛鐏炶姤鍠橀柡浣稿暣閺佹捇鎳為妷褜娲搁梺瑙勵問閸ｎ垶骞忔搴㈠枂闁告洦鍓涢ˇ銉╂⒑缂佹澧柕鍫熸倐閻涱噣宕橀妸銏＄�婚梺瑙勫劤绾绢參顢欏畝鍕拺闁革富鍘奸崝瀣箾鐠囇呯暤鐎规洦鍓濋妵鎰板箳閹绢垱瀚藉┑鐐舵彧缁蹭粙骞栭銈嗘殰闁割偅娲橀悡鐔兼煏閸繃鍣洪柟鍏煎姍閹藉爼鎮欓悜妯煎幈闂佸搫娲㈤崝灞剧妤ｅ啯鐓犻柣妤�鐗嗛婊堟煏閸パ冾伂缂佺姵鐩獮妯兼崉娓氼垱姣囩紓鍌氬�烽懗鑸靛垔鐎电绶ら柣鎰靛墰閳瑰秴鈹戦悩鍙夌ォ闁轰礁绉电换婵囩節閸屾稑娅ｇ紓浣诡殣缁绘繂顫忛搹瑙勫珰闁哄被鍎冲畷顏堟⒑閻熸澘娈╅柟鍑ゆ嫹,teamId: " + teamId);
					return true;
				}
				else
				{
					SAskforCallBack sAskforCallBack = new SAskforCallBack();
					sAskforCallBack.leaderid = leaderRoleId;
					psendWhileCommit(callbacklist, sAskforCallBack);
					fire.pb.talk.MessageMgr.sendMsgNotify(leaderRoleId, 140880, null);
				}
				
				
				return true;
			}
		};
		callbackMemberP.submit();
	}
	

	private boolean checkTeamStatusValid(long leaderRoleId)
	{
		BuffAgent agent = new BuffRoleImpl(leaderRoleId);
		return agent.canAddBuff(OperateType.TEAM_CALL_BACK_MEMBER);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794443;

	public int getType() {
		return 794443;
	}

	public long memberid; // 召唤的队员id by changhao

	public CCallbackMember() {
	}

	public CCallbackMember(long _memberid_) {
		this.memberid = _memberid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(memberid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		memberid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCallbackMember) {
			CCallbackMember _o_ = (CCallbackMember)_o1_;
			if (memberid != _o_.memberid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)memberid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(memberid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CCallbackMember _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(memberid - _o_.memberid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


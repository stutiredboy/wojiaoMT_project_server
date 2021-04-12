
package fire.pb.battle.livedie;

import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import gnet.link.Onlines;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationLiveDieBattle extends __CInvitationLiveDieBattle__ {
	@Override
	protected void process() {
		//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂濠氭偄閸忓皷鎷婚柣搴＄仛閻℃洜绮ｅΔ鍛拺閺夌偞澹嗛ˇ锕傛倵濮橆偄宓嗙�殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旓附绂嶉弽顬綁宕奸妷锔规嫼闂佺鍋愰崑娑欎繆婵傚憡鐓曞┑鐘插�荤粔鍝勨攽閿涘嫭鏆�规洜鍠栭、娑橆潩妲屾牕鏁介梺璇查缁犲秹宕曢柆宥嗗亱闁糕剝绋戦崒銊╂煥閻斿搫校闁抽攱鍨块弻娑滅疀閹炬潙娅ф繛鎴炴尰閻擄繝寮婚悢鐓庣闁靛牆妫楅锟�?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬫繝娈垮櫙閹风兘姊洪弬銉︽珔闁哥喐濯介妵鎰板炊瑜夐弨浠嬫煥濞戞ê顏╁ù鐘欏洦鐓欓柧蹇ｅ亝瀹曞瞼锟借娲﹂崹璺虹暦缁嬫娓诲ù鍏肩懄鐎氬綊鏌ㄩ弮鍌氫壕鐎规洖顦甸弻鏇熺節韫囨洜鏆犵紒鍓ц檸閸ㄨ泛顫忓ú顏勭畾鐟滃繒绮婚悧鍫㈢瘈闁跨喍绮欓弻鍡楊吋閸涱垼妲锋俊鐐�栭悧婊堝磻閻愬搫鐓曢柟瀵稿Х绾捐棄霉閿濆牜鍤冮柣鎺嶇矙閺屽秹宕ｉ妷褏鐛㈤梺鍝勭灱閸犳牠骞冮悜鑺ュ亱闁割偆鍠愰崐閿嬩繆閻愵亜锟姐倝宕戦崟顓熷床闁瑰濮靛畷鍙夌節闂堟稒锛嶆繛灏栨櫆閵囧嫰骞樼捄鐑樼�惧銈呯箳閸犳牕顫忕紒妯诲闁兼亽鍎抽妴濠囨⒑闂堚晝绉剁紒鐘虫崌閻涱喛绠涘☉娆愭闂佽法鍣﹂幏锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇闂傚倸鍋嗛崹閬嶅Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
				xbean.Properties hostprop=xtable.Properties.select(hostid);
				if(hostprop==null){
					return false;
				}
				if(hostprop.getLevel()<LiveDieMange.getLiveDieLevel()){
					return false;
				}
				
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閻曚焦顔旈梺鍛婄缚閸庡骞忓畡鎵虫闁圭儤鎸婚悵姘節绾板纾块柡浣筋嚙閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒�顭囨径鎰拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炴帒螖娴ｉ晲鎴锋俊鐐�曠换鎰版偋婵犲洤鐓曢柟杈鹃檮閻撴瑩鏌ゅù瀣珔濞寸姵绮岄埞鎴﹀灳閻愯棄浠梺鍝勬湰濞茬喎鐣锋總鍛婂亜缂佸灏呴幏鐑藉箛椤曞棙瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋鐎殿噮鍋婇獮鍥级閸喚鐛╂俊鐐�曠换鎰板箠韫囨稑姹插┑鐘叉处閳锋帒霉閿濆牊顏犻悽顖涚洴閺屾盯寮幘鍓佹殼閻庤娲樼划宀勶綖濠靛鍤嬮梻鍫熺◥閹寸兘姊绘担鍛婃儓闁稿﹤缍婇、鏍р枎韫囧鎷烽幒鎾剁瘈婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柣鎰劋閻撶喖鏌熼幆褍鑸归柛鏂诲�楃槐鎺撴綇閵娿儳鐟查悗鍨緲鐎氼喗绂掗敃鍌氱畾鐟滃酣鎮鹃浣风箚闁绘劦浜滈敓鑺ョ墪鐓ら柍鍝勫暙缁躲倝鏌涢幘妤�绉电�氬綊姊婚崼鐔衡棨闁稿鍨洪〃銉╂倷鐎电鈷屽銈冨灪閿曘垽骞冮姀銈呭窛濠电姴瀚鍝勨攽閻樺灚鏆╁┑顔炬暬椤㈡瑩寮介鐐电崶濠德板�曢幊蹇涘疾濠靛鐓冮柛婵嗗閸ｅ綊鏌涚仦璇插闁宠鍨垮畷鎺戭煥鎼达絽濮肩紓鍌欑筏閹风兘鏌涢鐘插姕闁绘挸绻愰埞鎴︽倷闂堟稐澹曞┑鐐叉噹濡繈寮婚敐澶婄閻犺櫣鍎ら悘鍫澪旈悩闈涗沪闁绘娲濊ぐ浣割渻閵堝棗閲滈柟椋庡厴閺岋綀绠涢敐鍛彎闂佸搫鑻粔鐟扮暦閿濆唯鐟滃繘鎮伴姀銈嗏拺闁告繂瀚～锕傛煕閺傝法鐒搁柨婵堝仜閳规垹锟斤絽鐏氶弲锝夋⒑缂佹﹩鐒介柡浣侯焾鍗遍柛銉墯閳锋帒霉閿濆牆袚缁绢厼鐖奸弻娑㈡偐閼碱儷銈夋煕閹烘挸绗掗柍璇查叄楠炴﹢鎼归銈忔嫹椤掑嫭鈷戦柣鐔告緲閳锋梻绱掗鍛仸鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�
				Long objectid;
				try {
					objectid=Long.parseLong(idorname);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					objectid=xtable.Rolename2key.select(idorname);
				}
				if(objectid==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙璺虹毢妞ゎ厼鐗撻崺鐐哄箣閿旇棄浜归柣鐘叉厂閸愌呯煑闂傚倷鑳堕幊鎾诲疮鐠恒劍宕查柟鎵閸嬧晠鏌ｉ幋锝嗩棄缂佺姷鏁婚弻鐔烘喆閸曞灚鐣剁紓鍌氱Т閿曨亜顕ｉ锕�绠涢柡澶婄仢缁愭稑顪冮妶鍡橆梿婵炲娲熼妴渚�宕ㄧ�涙ǚ鎷绘繛杈剧到閹芥粓鏁嶅鍥╃＜妞ゆ洖鎳庨悘鐘炽亜椤愩垻绠茬紒缁樼箓椤繈顢橀悢鍓蹭户闂傚倷娴囨慨銈夋晪濡炪倧绠撴禍鍫曞箖妤ｅ喚鏁囬柕蹇ョ磿閸橀亶鏌熼崗鑲╂殬闁告柨顑夐獮澶嬨偅閸愨晝鍘靛銈嗘煟閸斿苯煤閵堝宓侀柕蹇ョ磿缁犻箖鏌熺�甸晲绱虫い蹇撶墕绾捐崵锟藉箍鍎遍ˇ浼村煕閹达附鐓曢柨鏃囶嚙瀵劍淇婇悙顒佸�愰柡灞剧洴閹晠骞囨担鍦澒闂備胶纭堕弲婊堟儎椤栫偟宓侀悗锝庡枟閺呮粓鏌ｉ敐鍛板鐎殿喗濞婂缁樻媴閾忕懓绗″┑鐐插级閻楃姴鐣烽幇鏉挎嵍妞ゆ挶鍔嶇�氳鎱ㄥΟ鐓庝壕閻庢熬鎷�?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊勭矋閸庮偊姊绘担鍝ユ瀮婵℃ぜ鍔岄湁闁搞儺鍓欑粻娲煛閸モ晛鏋旂紒鈽呮嫹闂備線娼ф蹇曞緤娴犲鍋傞柟鎵閻撴洟鏌￠崘鎸庡濠电偠灏欓崰搴ㄦ偩閻戣棄唯鐟滃酣宕伴崱娑欑厱闁哄洢鍔岄獮姗�鏌ｉ敃锟介悧濠勬崲濠靛鍋ㄩ梻鍫熷垁閵忋倖鐓曞┑鐘插暞閸婃劗锟芥鍠楅幃鍌涗繆閼搁潧绶為悗锝庡墮楠炲牓姊绘担铏瑰笡婵炲弶鐗犲畷鎰板捶椤撱劍瀚规慨妯煎亾鐎氾拷?
				if(hostid==objectid){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
					return false;
				}
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閻曚焦顔旈梺鍛婄缚閸庡骞忓畡鎵虫闁圭儤鎸婚悵姘節绾板纾块柡浣筋嚙閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒�顭囨径鎰拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炴帒螖娴ｉ晲鎴锋俊鐐�曠换鎰版偋婵犲洤鐓曢柟杈鹃檮閻撴瑩鏌ゅù瀣珔濞寸姵绮岄埞鎴﹀灳閻愯棄浠梺鍝勬湰濞茬喎鐣锋總鍛婂亜缂佸灏呴幏鐑藉箛椤曞棙瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋鐎殿噮鍋婇獮鍥级閸喚鐛╂俊鐐�曠换鎰板箠韫囨稑姹插┑鐘叉处閳锋帒霉閿濆牊顏犻悽顖涚洴閺屾盯寮幘鍓佹殼閻庤娲樼划宀勶綖濠靛鍤嬮梻鍫熺◥閹寸兘姊绘担鍛婃儓闁稿﹤缍婇、鏍р枎韫囧鎷烽幒鎾剁瘈婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣钘熼柣鎰劋閻撶喖鏌熼幆褍鑸归柛鏂诲�楃槐鎺撴綇閵娿儳鐟查悗鍨緲鐎氼喗绂掗敃鍌氱畾鐟滃酣鎮鹃浣风箚闁绘劦浜滈敓鑺ョ墪鐓ら柍鍝勫暙缁躲倝鏌涢幘妤�绉电�氬綊姊婚崼鐔衡棨闁稿鍨洪〃銉╂倷鐎电鈷屽銈冨灪閿曘垽骞冮姀銈呭窛濠电姴瀚鍝勨攽閻樺灚鏆╁┑顔炬暬椤㈡瑩寮介鐐电崶濠德板�曢幊蹇涘疾濠靛鐓冮柛婵嗗閸ｅ綊鏌涚仦璇插闁宠鍨垮畷鎺戭煥鎼达絽濮肩紓鍌欑筏閹风兘鏌涢鐘插姕闁绘挸绻愰埞鎴︽倷闂堟稐澹曞┑鐐叉噹濡繈寮诲澶嬬叆閻庯綆浜炴导灞解攽椤旂》宸ユい顓炲槻閻ｇ兘鎮℃惔顔藉兊濡炪倖鎸鹃崰鎾广亹閸垻纾介柛灞剧懅缁涘繘鏌熸搴″幋闁诡喗顨婇弫鎰償閳╁啰浜堕梻浣虹帛閹歌煤閻旂厧钃熼柨鐔哄Т绾惧吋鎱ㄥ鍡楀箹濞寸姵鎸冲娲川婵犲嫭鍣ч柣搴㈠嚬閸ｏ綁寮幘璇茬９闁绘洑鐒︾紞鍫濃攽閻愭彃绾х紒顔芥尭椤曪綁顢曢敐鍥╃槇濠殿喗锕╅崜姘舵倵椤掑嫭鈷戦柣鐔告緲閳锋梻绱掗鍛仸鐎殿喗鐓￠獮鏍ㄦ媴閸︻厼寮抽梻浣虹帛濞叉牠宕愰崷顓ㄦ嫹濮樼偓瀚�
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬫繝娈垮櫙閹风兘姊洪弬銉︽珔闁哥喐濯介妵鎰版晲婢跺鎷绘繛杈剧到閹诧紕鎷归敓鐘崇厱闊洦妫戦懓璺拷娈垮枔閸旀垿寮婚崱妤婂悑闁告侗鍨奸崬鐢告⒒娴ｅ憡鍟炵紒瀣笒椤洤鈻庨幋鐘电劶闂佸憡鍔﹂崰妤呮偂閻斿吋鐓欏ù鐓庣摠濞懷冾熆瑜庢竟鍡欐閹烘挸绶為悘鐐舵楠炲鈹戦纭峰姛缂侇噮鍨堕獮蹇涘川閺夋垵绐涙繝鐢靛Т閸燁偊宕滈悽鍛娾拻濞达綀顫夐妵鐔兼煕閹惧鎳囧┑鈥冲缁瑧鎹勯妸锔筋啎濠电偞娼欓崥瀣焽濞嗘垹涓嶅┑鐘崇閸嬶綁鏌涘┑鍡楊仾闁诡垰鐗撻弻锝堢疀閹垮嫯鍚┑顔硷攻濡炶棄鐣峰鍫熷殤妞ゆ帪鎷烽悽顖樺劦濮婅櫣绮欏▎鎯у壈闁诲孩鍑归崰鏍煝鎼淬劌顫呴柕鍫濇閿熶粙顥撻惀顏堝级濞嗙偓效闁诲孩鑹剧紞濠囧蓟閿濆牜妲婚梺纭咁嚋缁辨洟鏁撻懞銉ㄥ缂傚秴锕ら～蹇撁洪鍕獩婵犵數濮撮崯顐λ囬埡鍛拺闁告稑顭悞楣冩煕鐎ｎ偄濮夐柛鎺撳浮瀹曞ジ濡烽妷鈺佹暪闂備線娼ч¨锟介柤闈涚秺楠炲繒绱掑Ο鑲╊啎闁哄鐗嗘晶浠嬪礆娴煎瓨鐓欓悹鍥囧懐鐦堝Δ鐘靛仜濡繂鐣锋總绋课ㄩ柨鏇嫹闁跨喕妫勯悘姘跺箞閵娿儙鐔煎传閸曨喖鐓橀梻浣告啞閿氭い鏇ㄥ弮閺佹捇宕愰悤浣圭秷濠电偛寮剁换鍫ユ晲閻愭潙绶炵�癸拷鐎ｎ偄顏堕梻鍌氱墛缁嬪繘宕戦姀顫嫹濞堝灝鏋涢柣鏍с偢閻涱喚锟斤綆鍠楅崑鎰版煕椤垵浜濋柣锔惧仜閳规垿鎮╅崹顐ｆ瘎闂佺顑囨繛锟芥鐐存崌椤㈡棃宕卞▎鎴Ц闂備浇娉曢崰鏇熸叏閵堝洦宕叉繛鎴欏灩濡炰粙鏌涢幇鍏哥凹闁稿瑪鍛＝濞撴艾娲ら弸娑欍亜椤撶偛妲绘い鏇秮椤㈡岸鏁撻挊澶屾殾濠靛倸鎲￠崑鍕煕濠靛棗顏╂慨瑙勭叀濮婂宕掑▎鎴М闂佸湱鈷堥崑鍕箒闂佺鏈粙鎾汇�呴崣澶岀瘈闂傚牊绋撴晶鎶芥煙瀹勬澘妲绘い顐ｇ箞椤㈡宕掑┃鐐妼閳规垿顢欑涵鐑界反濠电偛鎷戠紞渚�鐛箛娑欏亹閻犲洩灏欐导瀣⒑閹勭闁稿妫欑粋宥夘敂閸涱垳鐦堥梺姹囧灲濞佳勭濠婂嫨浜滈柡鍥ュ妼瀵喚锟借娲橀〃鍛达綖濠婂牊鏅稿ù鐘差儐閸嬫ɑ銇勯弮鍥棄缂佸墎鍋ら弻鐔兼焽閿曪拷楠炴牕霉濠婂牅鎲炬慨濠冩そ瀹曟粓骞撻幒宥囨晼闂備礁鎽滄慨鎾煀閿濆锟戒線骞樼拠鑼啋缂傚倷鐒﹁彜闁归攱妞藉濠氬磼濮樺崬顣甸梺鍝勬噺閻╊垶骞嗘担鍓茬叆闁割偆鍠撻崢鍗炩攽閳藉棗鐏犳繝锟介柆宥嗗剹婵炲棙鍩婇幏椋庢喆閸曨剛顦梺鍝ュУ閻楃姴顕ｉ锕�绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
				if(guestprop.getLevel()<LiveDieMange.getLiveDieLevel()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162078 , null);
					return false;
				}
				SInvitationLiveDieBattle sInvitationLiveDieBattle=new SInvitationLiveDieBattle();
				sInvitationLiveDieBattle.objectid=objectid;
				sInvitationLiveDieBattle.objectname=guestprop.getRolename();
				sInvitationLiveDieBattle.selecttype=selecttype;
				sInvitationLiveDieBattle.costmoney=LiveDieMange.getLiveDieCostMoney();
				Onlines.getInstance().send(hostid, sInvitationLiveDieBattle);
				
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793833;

	public int getType() {
		return 793833;
	}

	public java.lang.String idorname;
	public int selecttype; // 0单人   1组队

	public CInvitationLiveDieBattle() {
		idorname = "";
	}

	public CInvitationLiveDieBattle(java.lang.String _idorname_, int _selecttype_) {
		this.idorname = _idorname_;
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(idorname, "UTF-16LE");
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		idorname = _os_.unmarshal_String("UTF-16LE");
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationLiveDieBattle) {
			CInvitationLiveDieBattle _o_ = (CInvitationLiveDieBattle)_o1_;
			if (!idorname.equals(_o_.idorname)) return false;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += idorname.hashCode();
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(idorname.length()).append(",");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


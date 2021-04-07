
package fire.pb.team;

import fire.pb.PropRole;
import fire.pb.battle.PlayPKManage;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.clan.ClanUtils;
import fire.pb.talk.MessageMgr;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestJoinTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹤鐣峰Δ鍛闁兼祴鏅濋埢蹇曠磽閸屾瑧绛忛柟宄板槻椤潡鎳滈棃娑橆潔闂佺粯鎸鹃崰鎰┍婵犲浂鏁嶆繝鍨姇濞堫厾绱撴担钘夎敿鐎规洜鏁婚弫鎾绘嚍閵夘喖鏅遍梺鍝ュУ椤ㄥ棛鎹㈠☉娆戠瘈闁稿被鍊栫紞搴㈢節閻㈤潧校闁肩懓澧界划鍫ュ礃閳瑰じ绨婚棅顐㈡处閹告悂顢旈鍫熺厽閹兼番鍊栭鐘电磼鏉堛劍灏伴柟宄版嚇閹兘鎮ч崼鐔哥槥闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹
 * @author changhao
 *
 */
public class CRequestJoinTeam extends __CRequestJoinTeam__ {
	private long now = 0L;//procedure闂傚倸鍊峰ù鍥敋瑜嶉湁闁绘垵顫曢敓钘夊�块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨婇弻鈥愁吋鎼粹�冲闂佽桨绀佺�氫即寮诲☉銏犵労闁告劗鍋撻鐟扳攽閻愬瓨灏い顓犲厴瀵鈽夊顐ｅ媰闂佸憡鎸嗘笟濠冨闁圭儤顨嗛悡鍐煟閻旂顥嬮弽锛勭磽娴ｈ櫣甯涚紒璇茬墕铻為柛鎰╁妷濡插牊绻涢崱妯曟垿鏁撻妷鈺傗拻濞达絽鎲＄拹锟犳煛閸滀礁浜濋柟渚垮姂楠炴﹢顢欓懖鈺佸绩濠电姰鍨奸崺鏍礉閺嶎厼鐤鹃柟闂寸劍閻撱儵鏌ｉ弴鐐诧拷鍦拷姘炬嫹?濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村矗婢跺瞼鐦堟繝鐢靛Т閸婂綊宕抽悾宀�纾奸柨鐔诲Г缁绘繈宕堕妸銉嫹閻㈠憡鐓ユ繝闈涙椤庢鏌＄�ｎ偆銆掔紒杈ㄥ浮閺佹挻绂掔�ｎ亪鍞跺銈庡亽閸犳锟芥俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐绾板秵绌辨繝鍥舵晝闁挎繂娲﹂崳浼存煢濡崵绠橀柟鍙夋倐瀵剙鈻庨悙顒傜▉濠电姷鏁告慨鐢告嚌閸撗冾棜闁稿繗鍋愮弧锟介梻鍌氱墛缁嬫帡骞栭幇顓犵闁瑰啿鍢查幊鎰閽樺褰掓晲閸曨厾鐓撻梺鍛婄箚濞咃絿妲愰幒鏃�瀚氶柟缁樺笚濞堝墎绱撴笟鍥ф灍鐎癸拷缁嬭法鏆﹂柨鐔哄У閸婄兘鏌嶉崫鍕拷褰掑级缁嬪簱鏀介柣妯虹仛閺嗏晛鈹戦纰卞殶闁跨喕濮ら崙褰掑矗閸愵喗鏅查柣鎰▕閸氬鏌涘☉鍙樼凹闁哄偊鎷峰┑锛勫亼閸婃牕顫忔繝姘柧妞ゆ劑鍊楁稉宥夋煏婢舵稓绱扮紒璇叉閺屾稑鈻庤箛锝嗏枔闂佸憡姊瑰Ο鍧坋dure濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨剙娅ｉ梺绋胯閸旀垿寮婚敃锟借灒濞撴凹鍨遍埢鎾斥攽閻愬瓨灏い顓犲厴瀵鈽夊Ο鍏兼畷闂佽法鍠嶇划娆忕暦閹达附鍊烽柛婵嗗閸橀亶姊洪崷顓炲妺妞ゃ劌妫濆畷鎰版偨閸涘ň鎷婚梺鍓插亞閸犳捇鍩︽笟锟介弻娑㈡偄閸濆嫪妲愰梺鍝勭焿缂嶄線寮幇鏉块唶婵犲﹤鍟崕鎾剁磽閸屾瑦绁板瀛樻倐楠炴劖绻濆顒傤唵闂佸憡绋掑娆愬閻樼粯鐓曢柡鍥ュ妼婢т即鏌ㄩ悢鍑ゆ嫹閻斿壊浠╃紓浣介哺閹稿骞忛崨顖涘枂闁告洏鍔嶇�氬姊绘担鐑樺殌闁规祴鍓濈换娑欑節閸ャ劌浠掑銈嗘穿閹风兘鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷?
	Team team;
	@Override
	protected void process() {
		// protocol handle
		final long applierRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (applierRoleId < 0)
			return;
		xbean.Properties prop = xtable.Properties.select(roleid);
		if (prop == null)
		{
			return;
		}
		
		Long appliedclanfightid = xtable.Roleid2clanfightid.select(roleid);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο鍝勬倯缂佸倹甯掔叅妞ゅ繐鎳愰崢浠嬫煙閼测晞藟闁告挻绻勯幏褰掑灳閺傘儲鏂�濡炪倖鐗徊钘夘嚕椤旀拝鎷风憴鍕闁轰礁顭烽獮鍐ㄢ枎閹炬潙锟界粯淇婇婊冨付妤犵偞顨婂缁樼瑹閿熻棄顭囪閳ワ箓宕奸妷銉э紵闂備緡鍓欑粙渚�寮崒娑栦簻闁规崘娉涢弸宥囩磼鐠囧弶顥㈤柟顔肩秺瀹曞爼宕惰婢跺嫭銇勬惔锛勑ч柡宀嬬稻閹棃鏁愰崱妯荤槑闂備礁鎲￠…鍡涘炊閼稿灚娅嶅┑鐘绘涧閸婂鈥﹂崼婵愬晠婵犻潧娲㈡禍婊堟煛閸屾繃纭跺ù鐘灲閺岀喖顢涘鍗炩叺濠殿喖锕︾划顖炲箯閸涱喚鐟规い鏍ㄧ矊婵吋绻濋悽闈涗粶闁宦板妼閻ｆ繄绮欑捄銊︽濠德板�ч幏鐑芥煃閽樺妲告い顐ｇ箞椤㈡顦崇紓宥嗩殔閳规垿鎮欑�涙绋囬梺鍛婅壘椤戝懘鈥﹂崶褉鏋庨柟瀵稿С缁楀姊洪幐搴ｇ畵婵☆偅姊婚幑銏ゅ幢濡晲绨婚梺鍝勭Р閸斿酣鎯屾繝鍥ㄧ厱闁哄倹顑欓崕鎴犵磼鏉堛劌娴┑鈩冩倐閺佸啯鎷呴崜鍙夘棨闂傚倷绀侀悿鍥涢崟顖�鍥偨缁嬫寧鐎梺鐟板⒔缁垶寮查幖浣圭叆闁绘洖鍊圭�氾拷? by changhao
		if (appliedclanfightid != null)
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涘Ο鍝勬倯缂佸倹甯掔叅妞ゅ繐鎳愰崢浠嬫煙閼测晞藟闁告挻绻勯幏褰掑灳閺傘儲鏂�濡炪倖鐗徊钘夘嚕椤旀拝鎷风憴鍕闁轰礁顭烽獮鍐ㄢ枎閹炬潙锟界粯淇婇婊冨付妤犵偞锕㈠缁樻媴閸涘﹥鍎撳銈忛檮婢瑰棝鏁撻悾宀�鎳楅柛銉戝洦锛楅梺鑽ゅ枑閻熴儳锟芥凹鍠氬褔鏁撴禒瀣拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳囬柕鍡曠窔瀵噣宕煎┑瀣暪婵犵數濞�濞佳囨偋濠婂吘锝夘敍濞戞绠氶梺缁樺姦娴滄粓鏁撻懞銉у⒌鐎规洖缍婇幃鈩冩償濡崵浜欓梻浣告惈濞层劍鎱ㄩ悜鑺ュ仢缂備焦眉缁诲棝鏌曢崼婵囧櫤闁革絾妞介弻锝夊箻鐎靛憡鍣伴梺璇″枟椤ㄥ懘鍩ユ径濞炬瀻閻忕偞鎷濈槐娆愪繆閻愵亜锟芥洜鎹㈤幇顕嗘嫹濮橈拷閸パ呭摋闂佹寧娲栭崐褰掓偂閵夆晜鐓熼柡鍐ㄥ�荤敮娑欍亜閵夈儺妯�闁哄苯绉归幐濠冨緞濡儵鏋呴梻浣芥〃閻掞箓骞戦崶顒�鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘? by changhao
			if (!appliedclanfightid.equals(applierclanfightid))
			{
 			    MessageMgr.sendMsgNotify(applierRoleId, 410025,  null);
 			    return;
			}
			else
			{
				xbean.ClanInfo claninfo = ClanUtils.getClanInfoById(roleid, true);
				if (claninfo == null)
				{
					return;
				}
				
				xbean.ClanMemberInfo memberinfo = claninfo.getMembers().get(applierRoleId);
				if (memberinfo == null)
				{
	 			    MessageMgr.sendMsgNotify(applierRoleId, 410026,  null);
					return;
				}
			}
		}
		else
		{
			Long applierclanfightid = xtable.Roleid2clanfightid.select(applierRoleId);//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸澧憸鏉挎椤啴濡堕崱妤冪懆闁诲孩鍑归崣鍐箖閿熺姴鍗抽柕蹇嬪灩瑜板嫰姊洪幖鐐插姦妞ゃ儲鎹囧畷姘鐎涙鍘卞┑鈽嗗灣閸庛倝骞夐崫銉х＜閺夊牄鍔屽ù顔撅拷瑙勬穿缁插�熺亽闂佸憡绻傜�氼噣濡堕鎴掔箚闁靛牆娲ゅ暩闂佺顑嗛惄顖炪�侀弽顓炲窛闁规鍠曢懜顏堟⒒閸屾瑨鍏岀紒顕呭灦瀹曞綊宕奸弴妤嬫嫹閿曞倸鐐婃い鎺嶇閸擃厾绱撻崒娆戝妽妞ゎ厼娲ㄧ划缁樸偅閸愨晝鍘甸梺鍦拡閸樺ジ鎮橀敓鐘冲�垫慨妯煎亾鐎氾拷? by changhao
			if (applierclanfightid != null)
			{
				if (!applierclanfightid.equals(appliedclanfightid))
				{
	 			    MessageMgr.sendMsgNotify(applierclanfightid, 410027,  null);	
	 			    return;
				}				
			}
		}
		
		TeamManager.logger.debug("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ顖炈囬埡鍛拺闁告繂瀚刊濂告煕閹捐泛鏋涚�殿喛顕ч埥澶愬閳╁啯鐝曢梻浣风串缁蹭粙鎯夋總绋垮偍闁跨噦鎷� = " +applierRoleId+"闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鍣介柣顓熺懇閺岀喎鈻庨檱椤曆兠洪銏犺摕闁糕剝顨忛崥瀣煕濞戝崬鏋ら柨鐔虹摂閸撶喎顫忛崫鍕懷囧炊瑜忔禒濂告⒑鐠囪尙绠叉慨妯稿姂閺佹捇鎳為妷褍鏆￠梺鐟板殩閹凤拷? 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺侇棜闁秆勵殕閳锋帡鏌涢銈呮瀻闁告鍏橀弻銊モ攽閸♀晜效闂佸搫鎳忛幃鍌炲蓟閵娾晜鍋嗛柛灞剧☉椤忥拷");
		//add by cn 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘纾嬪闁伙綁娼ч鍏煎緞鐎Ｑ勫闂傚倸鍊搁悧濠冪瑹濡ゅ懏鍊垮Δ锝呭暞閻撴洟骞栧ǎ顒�锟芥捇宕ラ銈囩＜妞ゆ棁鍋愭晶銏ゆ煥閻斿憡鐏紓宥呮瀹曟澘螖閸涱喖浜楀┑鐐叉閹稿鎮￠弴鐔虹闁瑰鍎戦崗顒傦拷瑙勬偠閸庣敻寮婚敐鍫㈢杸閻庯綆浜滄慨锕傛⒑閸濆嫭婀伴柣鈺婂灦楠炲啴鍩￠崨顓犵厬婵犮垼娉涢敃銉╂偩婵犳碍鐓熼幖娣焺閸熷繘鏌涢敐搴℃珝鐎规洘绮岄埢搴ㄥ箳閺傚墽鑳洪梻鍌氬�风粈渚�骞夐敓鐘茬闁硅揪绠戠粈鍫ユ⒑椤掞拷缁夌敻寮插┑瀣厱閻忕偛澧介妴鎺楁煕濡吋鏆慨濠呮閹瑰嫰濡搁妷锔惧綒闂備胶鎳撻崵鏍箯閿燂拷?,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚悢铏圭＜闁靛繒濮甸悘鍫ユ⒑缁嬭儻顫﹂柛鏃�鍨垮濠氭偄閻氬瓨瀚归柣銏☆問閻掗箖寮介埄鍐瘈婵炲牆鐏濋悘銉╂煕鐎ｎ偄濮夋俊鍙夊姍楠炴帡寮幘鏉戭伓闂佹寧绻傜花鑲╄姳閽樺褰掓偐椤旇偐浠鹃梺闈涙搐鐎氫即銆侀弴銏╂晢闁稿本绨藉鍫熲拺闁告繂瀚﹢鎵磼鐎ｎ偆澧辩紒顔款嚙閳藉顫濋悙顒�顏堕梺鎸庣箓缁ㄨ偐鑺辩拠娴嬫斀妞ゆ棁鍋愭晥濠殿喖锕ュ浠嬪箖閻戣棄绠ユい鏃傚亾濞堫垶姊绘担瑙勫仩闁告柨绉撮—鍐╃鐎ｎ剙绁﹂棅顐㈡处缁嬫垵顔忓┑瀣厸濠㈣泛顑呴悘銉э拷瑙勬尭濡繂顫忓ú顏咁棃婵炴垶姘ㄩ悾楣冩煟鎼淬埄鍟忛柛鎾跺枎椤曪綁骞橀钘夛拷鍫曟偣閸ヮ亜鐨虹紒澶嬫そ閺屸剝鎷呯憴鍕３闂佽桨鐒﹂幑鍥极閹剧粯鏅搁柨鐕傛嫹?
		BuffAgent agent = new BuffRoleImpl(applierRoleId, true);
		if (agent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141133,  null);
			return;
		}

		PropRole applierprop = new PropRole(applierRoleId, true);
		if(applierprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掗懖鈺冪＝濞撴艾锕ョ�氬綊姊虹粙璺ㄧ伇闁稿鍋ら幃陇绠涢幙鍐數闁荤姾娅ｉ崕銈壦夐悙瀵哥闁告侗鍘介ˉ鐘绘煙椤曞懎鏋涢柍瑙勫灩閿熸枻缍嗛崑锟介柟鐤缁辨帞绱掗姀鐘茬睄闂佺尨鎷烽弶鍫氭櫔閹峰嘲顫濋悙顒�顏�?" + applierRoleId + "闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鎯傞崨濠傤伓闂備浇娉曢崰宥囧垝濞嗘挾宓侀煫鍥ㄥ搸娴滃綊鏌熼悜妯虹仼濡ょ姴娲弻锝夋偄閸洘顎栭梺绋磕涢崶褏顔嗛梺缁樺灱濡嫮绮婚搹顐＄箚闁靛牆绻戠�氳绻涚壕瀣汗濠电儑鎷烽梺鍝勬湰濞叉ê顕ラ崟顖氶唶婵犻潧妫楅ˉ婵嬫⒒娴ｇ懓顕滄繛鍙夌墵瀹曟劘銇愰幒鎾充簵濠电偛妫欓幐濠氭偂閵夆晜鐓熼柡鍥╁仜閿熻棄婀遍敓鑺ョ啲閹凤拷?,婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭淇婇妶鍛殶缂佹唻绠撻弻娑滎槼妞ゃ劌鎳愭竟鏇°亹閹烘挾鍘搁悗瑙勬惄閸犳牠寮甸鍌︽嫹闂堟稓鐒告慨濠呮缁瑩骞愭惔銏″缂傚倷绀侀鍡涘箲閸ヮ剙鏄ラ柕蹇嬪�曠猾宥夋煕瀹�瀣閻庢俺顫夐〃銉╂倷閼碱兛铏庨梺鍛婃⒐瀹�鎼佸蓟閿濆憘鏃堟晸閽樺）娑樷攽閸℃瑦娈鹃梺闈涚箞閸婃洜绮荤紒妯镐簻闁哄啫鍊瑰▍鏇㈡煕濡湱鐭欐慨濠冩そ濡啫鈽夊槌栧敽濠电姵顔栭崰姘跺礂濡警鍤曢柟闂寸缁�鍐煃閻熻埇浠掔紒銊ヮ煼濮婃椽宕崟顒�鍋嶉梺鍛婃煥閺堫剟寮查崜渚婃嫹閻㈠憡浜ら柟鐑筋棑閹叉挳宕熼鍌ゆО婵＄偑鍊戦崝宀勬晝閵夛妇鈹嶅┑鐘叉处閸婂鏌﹀Ο渚Ш闁告ɑ鎮傚铏圭矙閼愁垰顏梺绋款儏閿曨亪鐛箛娑欐櫢闁跨噦鎷�");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162027, null);
			return;
		}
		
		PropRole leaderprop = new PropRole(roleid, true);
		if(leaderprop.getProperties().getCruise() > 0) {
			TeamManager.logger.info("CRequestJoinTeam:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄苯绉归弻銊э拷锝庡亜绾炬娊姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘濡嫰鏁撶粵瀣仩闁宠鍨块、姘跺幢濞嗘嚩銈夋⒑閻熸澘娈╅柟鍑ゆ嫹" + roleid + "闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚閻楀棝宕㈤垾鎰佹富闁靛牆鍊瑰▍鏃堟煙閸戙倖瀚�?" + applierRoleId + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄苯绉归弻銊э拷锝庡亜绾炬娊姊洪崫鍕効缂傚秳绀侀锝夘敆閸曨偄鐎銈嗘濡嫰鏁撶粵瀣仩闁宠鍨块、姘跺幢濞嗘嚠鎴︽⒑閸涘﹥鈷愰柣妤冨█閻涱噣宕奸妷銉庘晠鏌曟径鍫濈仾闁哄偊鎷烽梻鍌欐祰椤鐣峰Ο琛℃灃婵炴垯鍨归弰銉╂倶閻愮紟鎺楀绩娴犲鐓熸繛鍡楃箲閸ｆ椽鎮楀杈ㄥ殌妞ゎ亜鍟存俊鍫曞川椤栨粠鍞堕梺璇插濮樸劑宕楀Ο铏规殾妞ゆ牜鍋涘婵嬫倵濞戞瑯鐒介柛妯绘崌濮婅櫣锟藉湱濮甸妴鍐磼閿熻姤绗熼敓钘夘嚕閹惰姤鍋勯柛蹇氬亹閸橀亶姊洪崘鍙夋儓闁稿妫楅埢鎾愁煥閸喓鍘搁悗鐧告嫹閻庯綆鍓欓崺宀勬煣娴兼瑧绉柡灞剧洴閳ワ箓骞嬪┑鍥╀壕闂備礁鎲￠敃顐﹀箯閿燂拷??,濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉烘慨濠呮閹风娀鍨鹃搹顐や壕闂備礁鎼幏瀣磻婵犲洤鏋侀柟鍓х帛鐎电姴顭跨捄渚創缁绢叏鎷锋繝鐢靛У椤旀牠宕规總绋跨煑闁告劑鍔庨弳锕傛煟閵忕姵鍟為柛濠勫厴閺岋綁骞嬮悜鍡欏姺闂佸憡锕㈡禍璺何涢崨鎼晝闁靛繆鍓濋幃娆忣渻閵堝棗鐏ラ柟铏悾宄扳攽鐎ｎ偅娅嗛梺鐟扮摠鐢偟绮诲鑸电厽闁绘ê寮堕崢鍌炴煕閺囥劌浜藉ù纭锋嫹");
			fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 162026, null);
			return;
		}
		
		if (checkPvP(roleid, applierRoleId) != 0) {
			return;
		}

		BuffAgent leaderAgent = new BuffRoleImpl(roleid, true);
		if (leaderAgent.existBuff(PlayPKManage.BuffDuelID)) {
			MessageMgr.sendMsgNotify(applierRoleId, 141867,  null);
			return;
		}
		mkdb.Procedure requestJoinTeamP = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				//lock start 
				Long teamId = xtable.Roleid2teamid.select(roleid);
				//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣筋潐婢瑰棙鏅跺Δ鍛；閻庯綆鍠楅悡娆撴煕閹炬鎳庣粭锟犳⒑缁嬫鍎愰拑杈╃磼缂佹娲寸�规洖宕灒闁惧繘锟芥稒顢橀梻浣筋嚙鐎涒晝鍠婂澶嬪殞濡わ絽鍟繚闂佸湱鍎ら崺鍫濐焽閳哄懏鐓熼柟浼存涧婢ь喗銇勮箛姘厫缂佺粯绻傞銉╁几椤愵澁鎷烽妶澶婂惞閻庯綆鍠楅埛鎺楁煕閺囥劌浜滄い蹇ｅ亰閺屻劑鎮㈤悜妯荤彧闂佽桨鐒﹂幃鍌氱暦閵忥綆妯勫銈冨灪钃辩紒铏规櫕缁瑩宕归鍖℃嫹閸喒鏀介柍钘夋閻忥綁鏌涙惔銏犵仼缂侇喖顭烽獮妯兼嫚閼艰埖鎲版繝鐢靛仦閸ㄥ爼鏁冮埡渚囩劷闁冲搫鎳忛悡鏇㈡煙閻愵剦娈旈柟铏姍閹即濡烽埡鍌楁嫼闂佺厧顫曢崐鏇熺墡闂備礁鎲″褰掋�冩繝鍌滄殾濞村吋娼欑粻濠氭偣閸濆嫭鎯堥柣蹇擄躬濮婅櫣鎹勯妸銉︾彚闂佺懓鍤栭幏锟�?
				if(teamId != null)
					team = new Team(teamId,false);
				else
				{
					//闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘鎳為柆宥嗗殐闁宠桨鑳剁粵蹇旂節閻㈤潧校闁绘棏鍓涚槐鐐哄冀瑜滈悢鍡涙煠閹间焦娑у┑顔兼喘閺岋箓宕橀鍕亪闂佸搫鐭夌紞浣割嚕椤掑嫬绠伴幖娣灩閺嬫垿姊绘担鍝ワ紞缂侇噮鍨伴～蹇旂節濮橆厽娅㈤梺鑺ッˇ閬嶆偩椤撱垺鐓曢幖娣妺閹茬偓顨ラ悙璇ч練缂佺姵绋戦埥澶婎潩椤掞拷缁茬偓淇婇悙顏勶拷鏍暜閹烘棑鎷峰鐓庡籍闁糕晜鐩獮鎺懳旀担鍝勫箞闂備浇顫夊姗�宕ラ敓鐣岀磼閵娿儺鐓奸柡宀嬬磿閿熸枻缍嗘禍鐐跺�寸紓鍌欐祰妞村摜鏁Δ锟介…鍥疀濞戞鍘告繛杈剧秮閺�閬嶅礋閸愵亞纾介柛灞剧懅椤︼附銇勯幋鐐茬伌妤犵偛绻橀弫鎾绘晸閿燂拷?
					//psend(applierRoleId, new STeamError(TeamError.ObjectNotInTeam));
					//TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇悗骞垮劚濞村倸危椤斿墽纾藉ù锝囶焾椤ｆ娊鏌涚�ｃ劌锟芥洟顢氶敐澶婇唶闁哄洨鍋ら崬璺侯渻閵堝棗濮︽繝顫嫹闂佸憡鍨崇划娆撳箖鐠轰警娼╂い鎾跺Х閻ゅ嫬鈹戦纭锋敾婵＄偘绮欓悰顕�骞囬鐔峰妳闂佹寧绻傞崐褰掞綖瀹ュ鈷掑ù锝囶焾閹垶淇婇悙鍙夊仴鐎规洖缍婂畷濂稿即濮楀牊瀚瑰ù锝呭濞尖晛螞閻楀牏绠栭柡鍜佷邯濮婅櫣鎹勯妸銉︾亞濠碘槅鍋勭�氫即銆佸鑸垫櫜濠㈣埖蓱閺呫垽姊洪崨濠冨闁告挻鐩畷婵嬫濞戞帗鏂�闂佺粯鍔栧娆撴倶閿旇姤鍙忔俊顖滎焾婵倹顨ラ悙宸Ъ闁靛洦鍔欓獮鎺楀箻椤栨稑顏归梻鍌氬�搁崐鎼佹偋閸愵喖鐤鹃柣鎰暩閻棝鎮楅敐搴℃灍闁绘挻娲熼弻锟犲礃閹稿骸顏堕梻浣规偠閸旀垵顭囪閻ｇ敻宕熼娑掓嫼闂佸湱顭堢�涒晠藟閸℃ü绻嗘い鎰╁灩椤忣厽銇勯姀锛勵暡婵炵厧绻橀崺锛勶拷锝庡亜椤忚泛螖閻橀潧浠滈柣蹇旂箞瀹曟繂顫濋懜闈涳拷鍨叏濡厧甯堕柣蹇ュ閿熷�燁潐濞插繘宕规禒瀣瀬闁瑰墽绮弲鎼佹煥閻曞倹瀚�,roleid"+ roleid);
										
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150035, null);					
					return true;
				}
				if(!team.isInTeam(roleid))
					return true;//濠电姷鏁告慨鎾儉婢舵劕绾ч柛鏍ゅ墲鐎氳淇婇妶鍕妽闁告瑥绻橀弻鐔虹磼閵忕姵鐏嶉梺绋垮椤ㄥ懘濡撮幒鎴僵闁绘劦鍓欓鍫曟⒒娴ｇ瓔鍤冮柛顭戝灦閹偤鏁冮敓浠嬵敋閵夆晛绀嬫い鎾寸箖閸曞啴姊虹拠鈥崇�婚柛娑卞弮閸欙繝姊婚崒姘拷椋庢濮橆剦鐒界憸鏃囨婵炲濮撮鍡涘磻閸岀偞鐓曟い鎰剁悼缁犮儵鏌ｉ幒宥囩煓闁哄被鍔戦幃銏ゅ传閸曟埊缍侀弻锝夊箻鐠鸿　鏋呴梺鍝勭焿缂嶄線骞冮姀銈呭窛濠电姴瀚崵鎺旂磽閸屾瑨鍏岄悗姘箻瀹曠喖顢旈崱娆戞毎闂傚倷绀侀幉锟犳偡閵夆敡鍥ㄥ閺夋垹锛欓梺褰掑亰閸ｎ垶骞忔搴㈠枂闁告洦鍓涢敍姗�姊虹粙鎸庢崳闁轰浇顕ч锝夘敃閿曪拷缁�鍐煃閸濆嫬锟芥悂顢撻幘缁樷拺闁诡垎鍛啈濡炪倖娲橀悧鐘茬暦椤栫偛纾奸柣鎰ˉ閹风粯绻涢幘瀵稿暡闁圭兘鏀辩换娑㈡嚌閺夊灝鎯為梺鐟板槻缂嶅﹪骞冮姀銈嗗亗閹艰揪缍嗗Σ鐑芥⒒娴ｇ儤鍤�闁宦板姂楠炲棙绻濋崶銊︽珳婵犮垼娉涢鍡椻枍閸℃稒鈷戦柤鎭掑剭椤忓煻鍥ㄧ鐎ｎ亜鎯為梺闈涚墕椤︿即宕愰崹顐闁绘劘灏欐禒銏ゆ煕閺冿拷瀹�鎼佸箖濡わ拷椤繈鎮℃惔锝勬闁诲氦顫夊ú蹇涘垂娴犲鏋侀柟鍓х帛閺呮悂鏌ㄩ悤鍌涘
				final long leaderRoleId = team.getTeamInfo().getTeamleaderid();
				Long[] roleids = new Long[2];
				if(leaderRoleId < applierRoleId)
				{
					roleids[0] = leaderRoleId;
					roleids[1] = applierRoleId;
				}
				else
				{
					roleids[0] = applierRoleId;
					roleids[1] = leaderRoleId;
				}
				this.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK,(Object[])roleids));
				//lock end

				now = System.currentTimeMillis();
				
				if(!checkOnline(applierRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃缁矂鍩ユ径鎰潊闁炽儱鍘栭悽缁樼節閻㈤潧鈻堟繛浣冲浂鏁勯柛鈩冪♁閸嬪倿鏌￠崶銉ョ仾闁绘挶鍎甸弻锟犲磼濞戞﹩鍤嬮梺璇″灠閻楀棝鍩為幋锕�鐏抽柧蹇ｅ亜娴犳挳姊洪崫鍕拱闁烩晩鍨辨穱濠囧箚閹殿喚鏉搁梺鍝勫�归娆愬閿燂拷(illegal)
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃缁矂鍩ユ径鎰潊闁炽儱鍘栭悽缁樼節閻㈤潧鈻堟繛浣冲浂鏁勯柛鈩冪♁閸嬪倿鏌￠崶銉ョ仾闁绘挶鍎甸弻锟犲磼濞戞﹩鍤嬮梺璇″灠閻楀棝鍩為幋锕�鐏抽柧蹇ｅ亜娴犳挳姊洪崫鍕拱闁烩晩鍨辨穱濠囧箚閹殿喚鏉搁梺鍝勫�归娆愬閿燂拷,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierNotInTeam(applierRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸澧憸鏉挎椤啴濡堕崱妤冪懆闁诲孩鍑归崣鍐春濞戙垹绠虫俊銈勮兌閸橀亶姊虹憴鍕凡闁告熬鎷风紓浣靛妼椤兘寮婚敍鍕舵嫹閿濆簼绨介懖鏍磽娴ｄ粙鍝洪悽顖涱殔椤洩绠涘☉妯煎幐婵炶揪缍侀弨閬嶅礋閸愵亞纾介柛灞剧懅椤︼附銇勯幋鐐茬伌妤犵偛绻橀弫鎾绘晸閿燂拷?(illegal)
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 140855, null);
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸澧憸鏉挎椤啴濡堕崱妤冪懆闁诲孩鍑归崣鍐春濞戙垹绠虫俊銈勮兌閸橀亶姊虹憴鍕凡闁告熬鎷风紓浣靛妼椤兘寮婚敍鍕舵嫹閿濆簼绨介懖鏍磽娴ｄ粙鍝洪悽顖涱殔椤洩绠涘☉妯煎幐婵炶揪缍侀弨閬嶅礋閸愵亞纾介柛灞剧懅椤︼附銇勯幋鐐茬伌妤犵偛绻橀弫鎾绘晸閿燂拷?,applierRoleId"+ applierRoleId);
				}
				else if(!checkApplierStatusValid(applierRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬穿缁查箖骞嗛弮鍫濈劸闁靛鍨崇粔顔撅拷瑙勬穿缁绘繈骞冨锟介幊锟犲Χ閸℃鐣俊鐐�ら崢褰掑礉閹存繄鏆︽慨妤嬫嫹妞ゃ垺妫冨畷鐔碱敃閿濆洦顫滅紓鍌氬�搁崐鎼佸磹閻戣姤鍊块柨鏇炲�堕敓钘夊暣瀹曘劌顫㈤妶鍛枠闁诡喚鏅划娆戞崉閵娧勭�┑鐘茬棄閺夊尅鎷烽弴銏犵疇闊洦绋戠壕濠氭煃閸濆嫭鍣洪柛濠傜埣閺岋綁骞囬悧鍫熼敪婵炲瓨绮庨崑鎾舵崲濞戙垹閱囨繝闈涘娴狀噣姊洪崫鍕効缂傚秳绶氶獮鍐煛閸涱厾鐓戞繝銏ｆ硾閿曘儵鎮樻惔顫箚闁绘劦浜滈敓鑺ュ灴瀹曟洟寮婚妷銉ь唶婵°倧绲介崯顐ょ矆閸℃稒鐓欓柣鎴灻悞楣冩煕濮橆剦鍎忔い顓℃硶閹瑰嫭绗熼姘闂備礁缍婂濠氬箯閻戣姤鈷掗柛灞剧懆閸忓瞼绱掗鍛仩妞ゎ偄绻戠换婵嗩潩椤掑偊绱甸梻渚�娼ч悧鍡浰囨导鏉戠；闁冲搫鎳忛埛鎴炪亜閹虹偞瀚圭紓浣割槺閺佸骞冮敓鐘冲亜闂傦拷閹邦喚鐣炬俊鐐�栭悧妤�顫濋妸锔绢浄闁靛繈鍊栭悡鐔兼煙閸喖顏悗姘炬嫹?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸ゅ苯螖閿濆懎鏆為柡鍛箞閺屻劑寮撮悙璇ф嫹閸濄儲鍠嗛柨鏃傚亾閸犳劙鏌ｅΔ锟介悧鍡欑箔濮樿埖鐓熼柟鎯у船閸旀粎绱掔紒妯兼创妤犵偛顑夐幃婊堝幢濞嗗繐楔婵犵數濮幏鍐吋婢跺锟藉秹姊洪棃娑欐悙閻庢氨澧楁穱濠囨倻缁涘鏅┑鐘诧工鐎氼剚绂掕ぐ鎺撯拻濞达絿鐡旈崵鍐煕閻樻剚娈旀い顓炵仢椤粓鏁撴禒瀣畺闁诡垎锟介弨浠嬫煕椤愵偄澧悗姘秺閺屻劌鈹戦崱娑憋拷妤�顭胯婢ф濡甸崟顖涙櫆閻犲洤寮堕悵婵嬫⒑閸濆嫮鐒跨紓宥勭窔楠炲啴鍩￠崨顕呮濠电偞鍨堕敋妞ゎ剙妫濆缁樻媴鐟欏嫬浠╅梺鍛婃煥闁帮絽顕ｉ銈嗗珰鐎瑰壊鍠栧▓銊╂⒑閸濆嫯顫﹂柛搴ㄤ憾閿濈偤宕ㄧ�涙鍘梺鍓插亝缁诲啴藟閻愬绠鹃柛娑卞枤婢х敻鏌″畝瀣К缂佺姵鐩鎾倷閻楀牆鐓曢梻鍌欒兌椤牓顢栭崱娑樼闁搞儜鍛濡炪倖鐗楅崙鐟邦焽閵娾晜鐓ラ柣鏂垮閻瑧锟芥鍠栭…鐑藉箖閵忋倕绀傞柣鎾虫捣濡绢喖鈹戦悩顔肩伇闁糕晜鐗犻垾锕傚炊椤掞拷閻鎱ㄥΟ澶稿惈缁炬崘妫勯湁闁挎繂瀚惌娆撴煕濠靛﹥顏犵紒杈ㄥ笧閹风娀鎳犻锟介埅鐢告⒑缂佹ü绶遍柛鐘愁殜楠炲棝寮崼婢晠鏌曟径濠冪潣闁搞儯鍔庨崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊兾旈悩闈涗沪闁绘顨堢紓鎾寸鐎ｎ亜绐涙繝鐢靛Т鐎氼剙顕ｉ幎鑺モ拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?
					psend(applierRoleId, new STeamError(TeamError.SelfInUnteamState));
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬穿缁查箖骞嗛弮鍫濈劸闁靛鍨崇粔顔撅拷瑙勬穿缁绘繈骞冨锟介幊锟犲Χ閸℃鐣俊鐐�ら崢褰掑礉閹存繄鏆︽慨妤嬫嫹妞ゃ垺妫冨畷鐔碱敃閿濆洦顫滅紓鍌氬�搁崐鎼佸磹閻戣姤鍊块柨鏇炲�堕敓钘夊暣瀹曘劌顫㈤妶鍛枠闁诡喚鏅划娆戞崉閵娧勭�┑鐘茬棄閺夊尅鎷烽弴銏犵疇闊洦绋戠壕濠氭煃閸濆嫭鍣洪柛濠傜埣閺岋綁骞囬悧鍫熼敪婵炲瓨绮庨崑鎾舵崲濞戙垹閱囨繝闈涘娴狀噣姊洪崫鍕効缂傚秳绶氶獮鍐煛閸涱厾鐓戞繝銏ｆ硾閿曘儵鎮樻惔顫箚闁绘劦浜滈敓鑺ュ灴瀹曟洟寮婚妷銉ь唶婵°倧绲介崯顐ょ矆閸℃稒鐓欓柣鎴灻悞楣冩煕濮橆剦鍎忔い顓℃硶閹瑰嫭绗熼姘闂備礁缍婂濠氬箯閻戣姤鈷掗柛灞剧懆閸忓瞼绱掗鍛仩妞ゎ偄绻戠换婵嗩潩椤掑偊绱甸梻渚�娼ч悧鍡浰囨导鏉戠；闁冲搫鎳忛埛鎴炪亜閹虹偞瀚圭紓浣割槺閺佸骞冮敓鐘冲亜闂傦拷閹邦喚鐣炬俊鐐�栭悧妤�顫濋妸锔绢浄闁靛繈鍊栭悡鐔兼煙閸喖顏悗姘炬嫹?婵犵數濮烽弫鎼佸磻閻愬搫绠板┑鐘崇閸ゅ苯螖閿濆懎鏆為柡鍛箞閺屻劑寮撮悙璇ф嫹閸濄儲鍠嗛柨鏃傚亾閸犳劙鏌ｅΔ锟介悧鍡欑箔濮樿埖鐓熼柟鎯у船閸旀粎绱掔紒妯兼创妤犵偛顑夐幃婊堝幢濞嗗繐楔婵犵數濮幏鍐吋婢跺锟藉秹姊洪棃娑欐悙閻庢氨澧楁穱濠囨倻缁涘鏅┑鐘诧工鐎氼剚绂掕ぐ鎺撯拻濞达絿鐡旈崵鍐煕閻樻剚娈旀い顓炵仢椤粓鏁撴禒瀣畺闁诡垎锟介弨浠嬫煕椤愵偄澧悗姘秺閺屻劌鈹戦崱娑憋拷妤�顭胯婢ф濡甸崟顖涙櫆閻犲洤寮堕悵婵嬫⒑閸濆嫮鐒跨紓宥勭窔楠炲啴鍩￠崨顕呮濠电偞鍨堕敋妞ゎ剙妫濆缁樻媴鐟欏嫬浠╅梺鍛婃煥闁帮絽顕ｉ銈嗗珰鐎瑰壊鍠栧▓銊╂⒑閸濆嫯顫﹂柛搴ㄤ憾閿濈偤宕ㄧ�涙鍘梺鍓插亝缁诲啴藟閻愬绠鹃柛娑卞枤婢х敻鏌″畝瀣К缂佺姵鐩鎾倷閻楀牆鐓曢梻鍌欒兌椤牓顢栭崱娑樼闁搞儜鍛濡炪倖鐗楅崙鐟邦焽閵娾晜鐓ラ柣鏂垮閻瑧锟芥鍠栭…鐑藉箖閵忋倕绀傞柣鎾虫捣濡绢喖鈹戦悩顔肩伇闁糕晜鐗犻垾锕傚炊椤掞拷閻鎱ㄥΟ澶稿惈缁炬崘妫勯湁闁挎繂瀚惌娆撴煕濠靛﹥顏犵紒杈ㄥ笧閹风娀鎳犻锟介埅鐢告⒑缂佹ü绶遍柛鐘愁殜楠炲棝寮崼婢晠鏌曟径濠冪潣闁搞儯鍔庨崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊兾旈悩闈涗沪闁绘顨堢紓鎾寸鐎ｎ亜绐涙繝鐢靛Т鐎氼剙顕ｉ幎鑺モ拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�?,applierRoleId"+ applierRoleId);
				}
				else if(!checkLeaderTeamFuncEnable(leaderRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滈柡灞革拷鎰佸悑閹肩补锟藉磭顔愭繝娈垮枦椤鎮￠垾鎰佸殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囩墱缁辨帡鎮欓锟介崝銈夋煏閸喐鍊愮�殿喛顕ч埥澶愬閻樻彃绁梻渚�娼ч…鍫ュ磿閾忣偆顩锋い鎾卞灪閸嬬姵鎱ㄥ鍡楀箻缂佺姷鍋ら弻鐔碱敊缁涘鐣奸梺鍝ュТ閿曘儱顕ラ崟顓ㄦ嫹閿濆簼鎲惧ù纭锋嫹?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ユ繝寰锋澘锟窖囧箯閻戣姤鐓冮悹鍥皺鏁堥悗娈垮枟閹告娊骞冨鍫濈倞妞ゅ繐瀛╃�氬綊鏌熺粙璺ㄦ槀濞存粍绮撻弻鐔煎箚瑜嶉懜褰掓煟韫囧﹥娅囩紒杈ㄥ浮閹晠顢欓悡搴⌒曢梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄埣閹拷妞ゅ繐鐗嗙粻濠氭煕濞戝崬鏋涙い蹇ユ嫹
					//psend(applierRoleId, new STeamError(TeamError.ObjectTeamFunctionClose));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141201, null);
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滈柡灞革拷鎰佸悑閹肩补锟藉磭顔愭繝娈垮枦椤鎮￠垾鎰佸殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囩墱缁辨帡鎮欓锟介崝銈夋煏閸喐鍊愮�殿喛顕ч埥澶愬閻樻彃绁梻渚�娼ч…鍫ュ磿閾忣偆顩锋い鎾卞灪閸嬬姵鎱ㄥ鍡楀箻缂佺姷鍋ら弻鐔碱敊缁涘鐣奸梺鍝ュТ閿曘儱顕ラ崟顓ㄦ嫹閿濆簼鎲惧ù纭锋嫹?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ユ繝寰锋澘锟窖囧箯閻戣姤鐓冮悹鍥皺鏁堥悗娈垮枟閹告娊骞冨鍫濈倞妞ゅ繐瀛╃�氬綊鏌熺粙璺ㄦ槀濞存粍绮撻弻鐔煎箚瑜嶉懜褰掓煟韫囧﹥娅囩紒杈ㄥ浮閹晠顢欓悡搴⌒曢梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰Σ楣冩⒑閹稿海鈽夌紒澶婄埣閹拷妞ゅ繐鐗嗙粻濠氭煕濞戝崬鏋涙い蹇ユ嫹,leaderRoleId"+ leaderRoleId);
				}
				else if(!checkTeamNotFull(team))
				{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢у鏌涢妶鍥ф瀾闁靛洤瀚伴崺锟犲磼濠婂啫缁╅梻浣告惈閻绱炴笟锟介悰顔撅拷锝庡枟閸婄兘鏌涢埄鍏狀亪鎮橀妷鈺傜厓缂備焦蓱瀹曞瞼锟借娲樼划宥囩箔閻斿摜绡�闁告劦鐓堟导鎾绘⒒娓氾拷濞艰崵锟介潧鐭傚畷锝嗘償閵婏箑锟藉潡鏌涢幘妤�绉电�氳绻涢崼婵堜虎闁哄闄勭换娑欏緞鐎ｎ剚鍒涘銈冨灪瀹�鎼佸极閹邦厼绶為悗锝庡亝椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
					fire.pb.talk.MessageMgr.sendMsgNotify(applierRoleId, 145045, 0, null);
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢у鏌涢妶鍥ф瀾闁靛洤瀚伴崺锟犲磼濠婂啫缁╅梻浣告惈閻绱炴笟锟介悰顔撅拷锝庡枟閸婄兘鏌涢埄鍏狀亪鎮橀妷鈺傜厓缂備焦蓱瀹曞瞼锟借娲樼划宥囩箔閻斿摜绡�闁告劦鐓堟导鎾绘⒒娓氾拷濞艰崵锟介潧鐭傚畷锝嗘償閵婏箑锟藉潡鏌涢幘妤�绉电�氳绻涢崼婵堜虎闁哄闄勭换娑欏緞鐎ｎ剚鍒涘銈冨灪瀹�鎼佸极閹邦厼绶為悗锝庡亝椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷,teamId"+ teamId);
				}
				else if(!checkTeamFilter(team,applierRoleId))
				{
					TeamManager.logger.debug("FAIL:TeamFilter闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓绨绘俊鐐�栫敮鎺楀磹缂佹鈻旂�广儱顦伴悡娆撳级閸繂鈷旈柣锝堜含缁辨帡骞囬褎鐤侀梺鍝勮閸旀垿骞冮妶澶婄＜婵炴垶锕╂导锟�,TeamId: "+teamId);
				}
				else if(team.isApplyListFull())
				{
					//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄本绋撻敓鏂ょ祷閸斿本鎱ㄩ崒鐐寸厵妞ゆ梻鐡斿▓婊咃拷瑙勬礈閸忔﹢銆佸锟介幃婊堝幢椤撶喎顏堕悗鐧告嫹闁告洦鍓涢崢閬嶆⒑闂堟稓澧曟繛灞傚�栫粋鎺楁焼瀹ュ棛鍘搁柣蹇曞仜婢ц棄煤鐎涙﹩娈介柣鎰綑濞搭喗顨ラ悙瀵告噰鐎规洘锕㈤崺锟犲礃閳哄倻妲ｉ梻鍌氬�搁崐椋庢濮橆剦鐒界憸宥堢亱濠德板�曢幊搴ㄦ偪椤斿浜滈柟鎷屾硾閻︽粓鏌℃担闈╄含闁绘搩鍋婂畷鍫曞Ω瑜夊Σ鍫ユ⒑濞茶骞楁い銊ユ嚇閳ワ妇鎹勯妸锕�纾梺缁樼濞兼瑦瀵奸幇鐗堝仩婵ê澧界粔顔芥叏婵犲嫮甯涢柟宄版噽缁瑧鎹勯妸锔诲晣闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹?15濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村箵閹烘繃瀵岄柣搴秵娴滄粓顢楅姀掳浜滄い鎰剁稻缁�瀣煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�
					psend(applierRoleId, new STeamError(TeamError.ApplyListFull));
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱閺嬫盯鏌涢弬娆惧剶闁哄本绋撻敓鏂ょ祷閸斿本鎱ㄩ崒鐐寸厵妞ゆ梻鐡斿▓婊咃拷瑙勬礈閸忔﹢銆佸锟介幃婊堝幢椤撶喎顏堕悗鐧告嫹闁告洦鍓涢崢閬嶆⒑闂堟稓澧曟繛灞傚�栫粋鎺楁焼瀹ュ棛鍘搁柣蹇曞仜婢ц棄煤鐎涙﹩娈介柣鎰綑濞搭喗顨ラ悙瀵告噰鐎规洘锕㈤崺锟犲礃閳哄倻妲ｉ梻鍌氬�搁崐椋庢濮橆剦鐒界憸宥堢亱濠德板�曢幊搴ㄦ偪椤斿浜滈柟鎷屾硾閻︽粓鏌℃担闈╄含闁绘搩鍋婂畷鍫曞Ω瑜夊Σ鍫ユ⒑濞茶骞楁い銊ユ嚇閳ワ妇鎹勯妸锕�纾梺缁樼濞兼瑦瀵奸幇鐗堝仩婵ê澧界粔顔芥叏婵犲嫮甯涢柟宄版噽缁瑧鎹勯妸锔诲晣闂傚倷鑳堕幊鎾诲吹閺嶎厼绠柨鐕傛嫹?15濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姴缍婇弻宥夊传閸曨偓鎷锋繝姘ワ拷鍛村箵閹烘繃瀵岄柣搴秵娴滄粓顢楅姀掳浜滄い鎰剁稻缁�瀣煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�,teamId"+ teamId);
				}
				else if(team.getTeamInfo().getApplierids().containsKey(applierRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃婵炲﹪銆佸鑸垫櫢闁芥ê顦遍弳锔界節闂堟侗鍎愰柡鍛焾闇夐柣妯烘▕閸庢劙鏌嶉柨瀣伌婵﹤顭峰畷鐓庮潩椤撶喓褰堢紓鍌欑筏閹风兘鎮楅敐搴℃灍闁绘挻娲熼弻锟犲磼濠靛洨銆婄紓浣哄Х缁垶濡甸崟顖氼潊闂勫洦绔熷Ο姹囦簻妞ゆ劧绲跨粻鐐烘煙閾忣偆鐭岄柛鐘诧工铻ｉ悹鍥皺濡差垶姊婚崒姘拷鐑芥嚄閸撲礁鍨濇い鏍仜閽冪喖鏌曟繝蹇涙婵炲懐濞�楠炴牗娼忛崜褎鍋ч梺娲诲幖濡鍩為幋锔藉亹闁告瑥顦ˇ鈺呮⒑缂佹ɑ灏甸柛鐘崇墵瀵寮撮敍鍕澑闂佸搫娲ㄩ崐顐﹀Ψ閳哄倻鍘搁柣搴秵娴滄粓寮抽悙鐑樼厪闁搞儜鍐句純閻庢鍠楅幐铏繆閹间礁唯闁靛鍨虹�氼剟姊虹拠鍙夊攭妞ゎ偄顦叅婵鎷烽柟铏箞楠炴垿骞囬鑽よ兒闂傚倸鍊风粈渚�骞夐垾瓒佸搫顓兼径濠勬煣濡炪倕绻愰悧鍡欑不椤栫偞鐓熼柟杈剧稻椤ュ绱掗敓浠嬪礃椤旂晫鍘撻梺鍛婄箓鐎氼剟寮虫繝鍥ㄧ厸閻庯綀鍩栫�氾拷?
					psend(applierRoleId, new STeamError(TeamError.AlreadyApply));
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃婵炲﹪銆佸鑸垫櫢闁芥ê顦遍弳锔界節闂堟侗鍎愰柡鍛焾闇夐柣妯烘▕閸庢劙鏌嶉柨瀣伌婵﹤顭峰畷鐓庮潩椤撶喓褰堢紓鍌欑筏閹风兘鎮楅敐搴℃灍闁绘挻娲熼弻锟犲磼濠靛洨銆婄紓浣哄Х缁垶濡甸崟顖氼潊闂勫洦绔熷Ο姹囦簻妞ゆ劧绲跨粻鐐烘煙閾忣偆鐭岄柛鐘诧工铻ｉ悹鍥皺濡差垶姊婚崒姘拷鐑芥嚄閸撲礁鍨濇い鏍仜閽冪喖鏌曟繝蹇涙婵炲懐濞�楠炴牗娼忛崜褎鍋ч梺娲诲幖濡鍩為幋锔藉亹闁告瑥顦ˇ鈺呮⒑缂佹ɑ灏甸柛鐘崇墵瀵寮撮敍鍕澑闂佸搫娲ㄩ崐顐﹀Ψ閳哄倻鍘搁柣搴秵娴滄粓寮抽悙鐑樼厪闁搞儜鍐句純閻庢鍠楅幐铏繆閹间礁唯闁靛鍨虹�氼剟姊虹拠鍙夊攭妞ゎ偄顦叅婵鎷烽柟铏箞楠炴垿骞囬鑽よ兒闂傚倸鍊风粈渚�骞夐垾瓒佸搫顓兼径濠勬煣濡炪倕绻愰悧鍡欑不椤栫偞鐓熼柟杈剧稻椤ュ绱掗敓浠嬪礃椤旂晫鍘撻梺鍛婄箓鐎氼剟寮虫繝鍥ㄧ厸閻庯綀鍩栫�氾拷?,teamId"+ teamId);
				}
				else if(!checkLevelRequirementValid(team, applierRoleId))
				{
					//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃濠㈡鐏冮梺璺ㄥ枍缁瑩銆佸鑸垫櫜濠㈣泛锕﹂鎺楁煟閻樺弶绌块悘蹇旂懄椤ㄣ儵宕堕浣叉嫼闂佸憡鎸昏ぐ鍐╃閻愮儤鐓曢柣妯荤叀閸欏嫮锟借娲樼换鍫熶繆閼搁潧绶為悗锝庡墮楠炲牓姊绘担鍝ユ瀮婵℃ぜ鍔戦幊妤呭醇閺囩喎锟藉潡鏌涘☉姗堟敾闁告瑥绻愰埞鎴︽偐閹绘帪鎷烽崼鏇炵；闁靛繈鍊栭悡娆愩亜閺傛寧鎯堥柣蹇氬皺閿熷�燁潐濞叉鍒掑澶婄闁告侗鍠氶悷瑙勩亜閺嶃劌鍨侀柨鏂垮⒔绾句粙鏌涚仦鎹愬闁跨喓鏅崗姗�骞婂Δ鍛濞撴艾锕ョ�氳鎱ㄥ鍡楀缂佺姾宕甸敓鍊燁潐濞叉﹢鏁冮姀鈥茬箚婵繂鐭堝Σ缁樼節濞堝灝鏋熼柟顔煎�搁～蹇撁洪鍛闂侀潧鐗嗛幊蹇涙倵閹�鏀介柣鎰絻缁狙囨煕閵娿儲鍋ユ鐐插暣閹瑩鎮滃Ο缁樼彇闂備胶顭堥張顒傜矙閹达箑绀堥柟鎯板Г閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�
					//psend(applierRoleId, new STeamError(TeamError.ApplierLevelValid));
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 141207, null);
					TeamManager.logger.debug("FAIL:闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃濠㈡鐏冮梺璺ㄥ枍缁瑩銆佸鑸垫櫜濠㈣泛锕﹂鎺楁煟閻樺弶绌块悘蹇旂懄椤ㄣ儵宕堕浣叉嫼闂佸憡鎸昏ぐ鍐╃閻愮儤鐓曢柣妯荤叀閸欏嫮锟借娲樼换鍫熶繆閼搁潧绶為悗锝庡墮楠炲牓姊绘担鍝ユ瀮婵℃ぜ鍔戦幊妤呭醇閺囩喎锟藉潡鏌涘☉姗堟敾闁告瑥绻愰埞鎴︽偐閹绘帪鎷烽崼鏇炵；闁靛繈鍊栭悡娆愩亜閺傛寧鎯堥柣蹇氬皺閿熷�燁潐濞叉鍒掑澶婄闁告侗鍠氶悷瑙勩亜閺嶃劌鍨侀柨鏂垮⒔绾句粙鏌涚仦鎹愬闁跨喓鏅崗姗�骞婂Δ鍛濞撴艾锕ョ�氳鎱ㄥ鍡楀缂佺姾宕甸敓鍊燁潐濞叉﹢鏁冮姀鈥茬箚婵繂鐭堝Σ缁樼節濞堝灝鏋熼柟顔煎�搁～蹇撁洪鍛闂侀潧鐗嗛幊蹇涙倵閹�鏀介柣鎰絻缁狙囨煕閵娿儲鍋ユ鐐插暣閹瑩鎮滃Ο缁樼彇闂備胶顭堥張顒傜矙閹达箑绀堥柟鎯板Г閳锋垿鎮归幁鎺戝婵炲懏鍔欓弻鐔煎礄閵堝棗顏�,applierRoleId"+ applierRoleId);
				}
				else{
					
					boolean inWaiting1 = false;
					boolean inWaiting = false;
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿本鍩冮弨浠嬫煕鐏炲墽鐭ら柣鎺戝⒔缁辨帡鎮╁畷鍥у绩闂佸搫琚崝宀勫煘閹达箑骞㈡慨妤�妫欓敓銉︿繆閻愵亜锟芥劙寮查鍫濈闁跨噦鎷�?
					final fire.pb.map.Role  invitMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(applierRoleId);
					final fire.pb.map.Role  desMaprole = fire.pb.map.RoleManager.getInstance().getRoleByID(leaderRoleId);
					if(invitMaprole == null || desMaprole == null){
						return true;
					}
//					int srcMapId = invitMaprole.getMapId();
//					int desMapId = desMaprole.getMapId();
					
//					if (srcMapId != desMapId) {
//						if (fire.pb.buff.Module.existState(leaderRoleId,
//								BuffConstant.StateType.STATE_INSTANCE_ZONE)) {
//							MessageMgr.sendMsgNotify(applierRoleId, 160201, null);
//							return false;
//						}
//					} else {
						if (inWaiting || inWaiting1) {
							fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(
									applierRoleId, 145250, null);
							return false;
						}
//					}
						
					xbean.Properties applierProperty = xtable.Properties.get(applierRoleId);
						
					//婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑩鏌熼婊冾暭妞ゃ儱顦甸弻锛勶拷锝傛櫇缁愭棃鏌″畝瀣М濠殿噯鎷烽梺缁樏崥锟界紒顔炬暬閺岋絾鎯旈姀銏╂殹閻庣櫢鎷烽柟闂寸閽冪喖鏌ㄥ┑鍡╂Ц閸ユ挳妫呴銏″闁哄被鍔戦、鏃堟晸閿燂拷?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鍩勯崘顏嗘嚌濠德板�曢幊搴ｇ玻濡や椒绻嗛柕鍫濇噹閺嗙喖鏌熼崘鍙夊殗婵﹤顭峰畷鎺戔枎閹搭厽袦闂備胶顢婇婊呮崲濠靛绠栭柕蹇嬪�ら弫鍡涙煕閺囥劌鍘撮柟绋垮暣濮婃椽宕ㄦ繝鍐槱闂佺顑嗙敮鈥崇暦閻㈢鍗抽柣妯哄暱閺嬫垿妫呴銏″缂佸鍨圭划鏄忋亹閹烘挾鍘遍梺鍦亾椤ㄥ懐绮旈悽纰夋嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺旑啇闂佸摜鍠庨幗婊呮閹惧瓨濯撮柛婵嗗珔閵夆晜鐓欓柧蹇ｅ亝瀹曞矂鏌涢埞鍨姕鐎垫澘瀚伴獮鍥敆閸屻倕鏅梻鍌欑閹诧繝宕滈鍕倞鐟滃瞼鍒掗敐鍛斀闁绘灏欏Λ鍕煏閸繈顎楁繛鍫熺箞濮婂宕掑顒変患闁诲孩鍑归崳锝夊极閹剧粯鍋╅悘鐐靛亾濮ｅ嫰姊洪崨濠庣劶闁搞儴鍩栭弲锝嗙節闂堟稑锟藉鈥﹂崼銉︾厑闁搞儯鍔庣弧锟介梻鍌氱墛缁嬫帞绮婇埡鍛厱闁绘劘灏欓崺锝嗘叏婵犲嫮甯涢柟宄版嚇瀹曘劍绻濋崒娑欑暭闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝呮憸閺嗭附绻濋棃娑欘棤闁哄棗妫濋弻銊╂偄鐠囨畫鎾剁磼閸屾氨效妤犵偞鐗楃粭鐔煎炊閵婏附鐝ㄩ梻鍌欐祰濞夋洟宕板鍥у灊婵炲棗娴氶崵鏇犵磽娴ｈ鐒界紒鈽呮嫹闂備胶顭堢悮顐﹀磹閺囥垹绠栭柟杈鹃檮閳锋垿鏌熼懖鈺佷粶闁告梹锕㈤弻娑㈠棘閸ф寮伴悗娈垮枟婵炲﹪骞冮埡鍐＜婵☆垶鏀辩�氫粙姊绘担渚劸闁活厼顦靛浠嬪礋椤撱劍瀚规慨妯煎亾鐎氾拷?婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽顐粶缂佺媭鍨堕弻銊╂偆閸屾稑顏�? by changhao
					xbean.TeamMatch teammatch = TeamManager.getInstance().getTeamMatchByTeamid(teamId);
					if (teammatch != null && applierProperty != null)
					{
						int applierlevel = applierProperty.getLevel();
						if (applierlevel >= teammatch.getLevelmin() && applierlevel <= teammatch.getLevelmax())
						{		
							mkdb.Procedure.pexecuteWhileCommit(new PAcceptToTeam(leaderRoleId, applierRoleId, 1, false));
							return true;
						}
					}
					
					team.getTeamInfo().getApplierids().put(applierRoleId, now);

					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤愶絿锟芥娊鎮楅獮鍨姎妞わ富鍨跺畷褰掑磼閻愬鍘卞銈庡幗閸ㄧ敻寮虫惔銊︾叆婵犻潧妫Σ褰掓煛閸涱喚绠為柡灞剧〒娴狅箓宕滆閺嬫棃姊洪悷鏉挎Щ缂傚秴锕ら～蹇撁洪鍕祶濡炪倖鎸嗛崨顓炐梻浣筋嚙鐎涒晝绮欓崼銉ョ柧婵犻潧顑嗛崕澶嬨亜韫囨挾澧遍柡浣哥Ч閺岋綁骞囬澶婃闂佸憡蓱閹倸顫忛搹鍦煓闁圭瀛╅幏杈╃磽娴ｅ壊鍎愰柛銊ㄥ劵濡垽鏌ｆ惔顖滅У闁哥姵顨婇幃鈥斥槈濡繐缍婇弫鎰板炊瑜嶆俊娲⒑閸濆嫭顥戦柡鍛█瀵鎮㈤崜鍙壭ч柟鑲╄ˉ鐎殿剟濮�閵堝棛鍘介梺鎸庣箓缁绘帞寮ч敓浠嬫倵濞堝灝鏋涘褍閰ｉ獮鎴﹀礋椤栨鈺呮煏閸繃澶勭痪顓ㄧ畵濮婂宕掑▎鎰偘閻庤娲滈弫璇茬暦閺囥垹绠ｉ柨鏇嫹缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
					SAddTeamApply sAddTeamApply = new SAddTeamApply();
					fire.pb.team.TeamApplyBasic  teamApplyBasic = new fire.pb.team.TeamApplyBasic();
					//teamApplyBasic.face = applierProperty.getFaction();
					teamApplyBasic.level = applierProperty.getLevel();
					teamApplyBasic.roleid = applierRoleId;
					teamApplyBasic.rolename = applierProperty.getRolename();
					teamApplyBasic.school = applierProperty.getSchool();
					//teamApplyBasic.title = applierProperty.getTitle();
					teamApplyBasic.shape = applierProperty.getShape();
					fire.pb.map.Role.getPlayerComponents(applierRoleId, teamApplyBasic.components);
					sAddTeamApply.applylist.add(teamApplyBasic);
					psendWhileCommit(leaderRoleId, sAddTeamApply);
					//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤愶絿锟芥娊鎮楅獮鍨姎妞わ富鍨跺畷褰掑磼濠婂嫬鏋戦梺缁橆殔閻楀棛绮幒妤佺厸閻庯絺鏅濈粣鏃堟煛瀹�瀣М濠殿噯鎷烽梺缁樏崥锟界紒顔炬暬閺岋絾鎯旈姀銏╂殹閻庣櫢鎷烽柟闂寸閽冪喖鏌ㄥ┑鍡╂Ц閸ユ挳妫呴銏″闁哄被鍔戦、鏃堟晸閿燂拷?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁嶉崟顓犵厯闂佸湱鍎ら幐楣冩偟閸洘鐓曢柍鈺佸暟閹冲懎鈽夐幘宕囆ч柡宀嬬磿娴狅妇鎷犻幓鎺戭潥闂備胶绮幐璇裁洪悢鐓庤摕闁哄洨鍠撻悵鑸点亜閺嶃劏澹橀柡鍡樻礃缁绘稑鐣濇繝渚�鍋楀┑顔硷攻濡炰粙鐛弽顓熷�烽柟缁樺俯閻庢挳鏌ｆ惔锝嗩仧闁圭兘顥撶槐鎺旓拷锝庡幗绾爼鏌￠崱顓㈡缂佺粯绻堝Λ鍐ㄢ槈閸楃偛澹夐梻浣侯焾椤戝懐锟芥矮鍗冲濠氭晸閻樻煡鍞堕梺闈涚箚閸撴繂袙閸曨厾纾藉ù锝呮惈鏍￠悗鐧告嫹缂佸顑欏鏍ㄧ箾瀹割喕绨奸柛搴＄焸閺屾稑鈽夊鍫濅紣濡炪倕楠忛幏锟�?
					SRequestJoinSucc sRequestJoinSucc = new SRequestJoinSucc();
					xbean.Properties leaderProperty = xtable.Properties.get(leaderRoleId);
					sRequestJoinSucc.rolename = leaderProperty.getRolename();
					psendWhileCommit(applierRoleId, sRequestJoinSucc);

					java.util.ArrayList<String> param = new java.util.ArrayList<String>();
					param.add(sRequestJoinSucc.rolename);
					
					fire.pb.talk.MessageMgr.psendMsgNotify(applierRoleId, 150041, param);
					
					TeamManager.logger.debug("SUCC:婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灈闁绘挾鍠栭弻鏇熷緞閸℃ɑ鐝旈柛銉︽尦濮婃椽宕ㄦ繝浣虹箒闂佸憡眉缁瑩骞冨锟藉畷鍗炩槈濞嗗本瀚藉┑鐐舵彧缁蹭粙骞夐敓鐘茬畾闁割偆鍠嗘禍婊堟煥閺冨浂鍤欏ù婊�鍗抽弻鈩冩媴鐟欏嫬纾抽梺鍦焾閿曘儱顕ラ崟顒傜瘈闁告洦鍨冲畷婊冣攽閿涘嫬浜奸柛濠冪墵瀹曟繈骞掗弬鍨亰濠电偛妫欓幐鎼佹嫅閻斿吋鐓忓┑鐐茬仢閸旀淇婇幓鎺斿濞ｅ洤锕、娑樷攽閸℃洘鐫忛梻浣告啞濡繘宕规导鏉戠厴闁硅揪闄勯鎰渻閵堝棙绀冪紒顔芥尭椤繑绂掔�ｎ亞顦板銈嗘尪閸斿秶锟芥艾缍婇弻锝夊閵堝棙閿柣銏╁灥閸╂牠濡甸崟顖氱闁绘劘妫勬禒顕�鎮楃憴鍕８闁告梹鍨块妴浣割潨閿熶粙宕洪妷鈺佸耿婵°倓鐒﹀В澶嬬節閻㈤潧啸闁轰焦鎮傚畷鎴濃槈閵忊晜鏅銈嗘尵閸犳劙宕ｈ箛鎾佸綊宕楅崗鑲╃▏缂佺偓鍎冲锟犲蓟閵堝洤鏋堥柛妤冨仜椤亪姊洪崫鍕棡缂侇喗鎹囧濠氭偄閾忓湱锛滈梺闈涚箳婵敻鎮橀崼銉︹拺婵炶尪顕ч獮妤併亜閵娿儲顥炵紒宀冮哺缁绘繈宕堕‖顑洦鐓曟繛鎴濆船楠炴绻涢崼鐔哄弨婵﹥妞藉畷顐﹀礋椤掑顥栭梻浣侯焾閿曘儳鎹㈤崼銉у祦闁告劦鍘规禍褰掓煙閻戞ê鐏╅柛濠勫仱濮婃椽宕橀崣澶嬪創闂佺锕ら…宄扮暦濠靛鏅搁柨鐕傛嫹??,teamId"+ teamId);
				}
				return true;
			}
		};
		requestJoinTeamP.submit();
	}

	// 婵犵數濮烽弫鍛婃叏閻戝锟藉倿鎸婃竟鈺嬬秮瀹曠喖顢涘槌栧數闂備浇娉曢崳锕傚箯閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡纰嶉梺缁樻尰閿曘垽寮婚悢鐑樺磯妞ゎ厽鍨堕锟�
	private static int checkPvP(long targetRoleId, long selfRoleId) {
		// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掗懖鈺冪＝濞撴艾锕ョ�氳绻濋姀锝呯厫闁告梹鐗犻幃锟犳偄闂�鎰畾濡炪倖鐗楃换宥夊吹濞嗘垹纾奸柤鑹版硾閸氬綊鏌ㄩ悢璇残撴い鏃�鐗犲畷鏉课旀担铏诡啎婵犵數濮村ú銈夋嫅閻斿摜绠鹃柟瀛樼懃閻忊晝绱掗悩鐑樼彧缂佺粯绻堝Λ鍐ㄢ槈濞嗘ɑ顥犵紓鍌欓檷閸旀垵顭囪閸╃偤骞嬮敂缁樻櫓闂佺粯鍔﹂崜娆忊枔鐏炵瓔娓婚柕鍫濈箳閻ｅ灚绻涙担鍐叉祫缂嶆牠鐓崶銊︹拻闂傚嫬瀚伴弻娑樷槈濮楀牆浼愭繛瀛樼矋缁挸顫忓ú顏勫窛濠电姴鍟惌顕�姊洪悡搴℃毐闁绘牞澹堝Λ鐔兼⒑鐠恒劌娅愰柟鍑ゆ嫹
		return fire.pb.battle.pvp.PvPTeamHandle.onRequestJoinTeam(targetRoleId, selfRoleId);
	}

	//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬磸閸ㄨ櫣绮嬮幒鏃撴嫹閿濆骸澧憸鏉挎椤啴濡堕崱妤冪懆闂佺锕ㄥ畷鍨珶閺囩喓闄勯柛娑橈功閸橀潧顪冮妶鍡欏ⅹ婵☆偅顨婂畷顖炲级鎼存挻鐏侀梺闈╁瘜閸樺墽澹曢挊澹濆綊鏁愰崶銊ユ畬闂佽桨绶氱粻鏍蓟閻旂厧绀勯柕鍫濇椤忥拷
	private boolean checkOnline(long roleId)
	{
		if(xtable.Roleonoffstate.get(roleId) == fire.pb.state.State.ENTRY_STATE)
			return true;
		else
			return false;
	}
	
	//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬礃缁矂鍩ユ径鎰潊闁炽儱鍘栭悽缁樼節閻㈤潧鈻堟繛浣冲浂鏁勯柛鈩冪♁閸嬪倿鏌￠崶銉ョ仾闁绘挶鍎甸弻锟犲磼濞戞﹩鍤嬮梺璇″灠閻楀棝鍩為幋锔绘晩闁绘挸鍑介幏椋庢喆閸曨厸鏀虫繝鐢靛Т鐎氼厾锟芥碍姘ㄩ幉鎼佸棘濞嗗墽锟借埖銇勯弴顏呭闂佽鍠楅〃濠囧箖娴犲顥堟繛鎴灻肩划顖涗繆閻愵亜锟芥牠骞愰幖浣肝х紒瀣硶閺嗭箓鏌ｉ弮鍌楁嫛闁轰礁锕弻锝夊箻閾忣偅宕抽梺浼欑秮娴滆泛顫忔繝姘＜婵炲棙鍩堝Σ顕�鏌ｈ箛鎾剁闁硅櫕锕㈤悰顔跨疀濞戞瑦娅㈤梺璺ㄥ櫐閹凤拷?
	private boolean checkApplierNotInTeam(long applierRoleId)
	{
		if(xtable.Roleid2teamid.get(applierRoleId) == null)
			return true;
		else
			return false;
	}
	
	//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仜閵嗘帒顫濋褎鐤侀悗瑙勬穿缁查箖骞嗛弮鍫濈劸闁靛鍨崇粔顔撅拷瑙勬穿缁绘繈骞冨锟介幊锟犲Χ閸℃鐣俊鐐�ら崢褰掑礉閹存繄鏆︽慨妤嬫嫹闁糕斁鍓濋幏鍛喆閸曨剚顔冮梻鍌氬�搁崐鐑芥嚄閸洍锟斤箓宕奸姀鈥冲簥闂佺鎻梽鍕疾濠靛鐓忛煫鍥ь儏閿熻姤娲滅划濠氬冀椤撶喓鍘介梺鎸庣箓閹虫劙鎮為崸妤佺厵濡炲楠搁崢瀵革拷瑙勬礈閸忔﹢銆佸锟介幃婊堝幢椤撶喎顏堕悗鐧告嫹闁告洦鍓涢崢閬嶆⒑闂堟稓澧曟繛灞傚�栫粋鎺曨槾缂佽鲸甯楀蹇涘Ω閿曪拷闂夊秹姊洪悷鏉挎Щ闁硅櫕鍔楅崚鎺戔枎韫囧﹥鐎婚梺鍛婄懀閸庡磭澹曢幆褉鏀介柣妯垮皺濡嫰鏌曢崼婵嬵�楁繛鍫熺箘缁辨挻鎷呴崫鍕戯綁鏌熼悷鐗堝枠闁绘侗鍣ｅ畷鍗炩槈濡⒈妲版俊鐐�栧Λ渚�宕戦幇鍏洭寮跺▎鐐瘜闂侀潧鐗嗗Λ娆戜焊閻㈠憡鐓曞┑鐘查娴滀即鏌℃担绋挎殻鐎规洘甯掗埥澶婎潩椤掞拷缁犮儱鈹戦敍鍕杭闁稿﹥鐗犲畷褰掓偂鎼存ɑ鐏冮梺鍝勬川婵攱銇欓幎鐣屽彄闁搞儯鍔嶇粈鍫㈢棯閹佸仮鐎殿喖鐖煎畷鐓庮潩椤撶喓褰嗛梻浣告惈濡參宕滈悢鐓庤摕闁斥晛鍟刊鎾煕濠靛嫬鍓剧憸蹇涙晸閸婄噥娼愭繛鍙夌墵婵″爼宕ㄦ繝浣虹畾闂佺粯鍨归悺鏃堝极婵犲洦鐓涢柛灞久敓鑺ヮ殘缁牓宕橀瑙ｆ嫽婵炶揪缍�濡嫰宕ヨぐ鎺撶厱閻庯綆鍓欐禒褏绱掗鐣屾噰妤犵偛顑夐弫鍌炴寠婢跺﹤顥楁繝鐢靛О閸ㄧ厧鈻斿☉銏犲珘妞ゆ帒瀚哥紞鏍煛閸モ晛鏋旂紒鈽呮嫹闂傚倸鍊搁悧濠勭矙閹惧瓨娅犳繛鎴炵啲閹烽鎲撮崟顒傤槬濡炪倧濡囬弫璇差嚕婵犳碍鍋勯柣姘摠鐎氳绻涢幋鐐垫噽闁绘帞鏅槐鎺楁偐瀹曞洤顫х紓浣虹帛閻╊垰鐣烽妸鈺婃晣闁绘﹢娼ф慨閬嶆⒒娴ｅ憡鎯堥悶姘煎亰瀹曟繂鐣濋崟顐ゅ弨婵犮垼娉涜癌闁绘棁娅ｇ壕鍏间繆椤栨繍鍤欐い蹇庡嵆濮婂宕掑▎鎺戝帯闂佺娅曢幐鎼侇敋閿濆绀堝ù锝囶焾閻忓﹪姊虹憴鍕鐎规洟娼ч悾鍨媴闁稓绠氶梺闈涚墕鐎氼垶宕楀畝锟界槐鎺楀煡閸涱喖顏堕梻鍌氬�搁…顒勫磻閸曨個娲晝閿熺晫鍙呭┑鐘诧工閻撳宕堕澶嬫櫔闂佽法鍠曞Λ鍕綖韫囨稒鎯為悷娆忓閸樺綊姊洪崨濠佺繁闁搞劋鍗抽幃褍顫濋懜纰樻嫼缂備礁顑嗛娆撴偂椤撱垺鐓欓柛鎴欏�栫�氾拷?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊兾旈悩闈涗沪闁绘濞�楠炲啴鍩勯崘鈺佸妳濠碘槅鍨卞鍨焽閺冨牊鈷掑ù锝囩摂濞兼劙鏌涙惔锛勶紞濠㈣娲熼、姗�鎮欑�涙妲戦梻鍌氬�搁崐鐑芥嚄閸洍锟斤箓宕奸姀鈥冲簥闂佺鎻懙褰掓晸閺傘倗鐣电�规洖鐖奸崺锟犲磼閵堝棛绋愰梻鍌欑濠�閬嶅磿閵堝锟藉啴宕ㄩ婊呯劶闁诲函缍嗛崑浣圭濠婂牊鐓涚�广儱鍟俊濂告煕閵娿倗绐旈柡宀嬬節瀹曞爼濡烽妷褌鐥梻浣虹帛閹稿爼宕曢悽绋胯摕闁靛ň鏅滈崑鍡涙煕鐏炲墽鈽夋い蹇ユ嫹?
	private boolean checkApplierStatusValid(long applierRoleId)
	{
		BuffAgent buffagent = new BuffRoleImpl(applierRoleId,true);
		if(!buffagent.canAddBuff(BuffConstant.StateType.STATE_TEAM))
		{
			TeamManager.logger.info("闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽銊с�掗柣婵嗙埣閺岋繝宕堕妷銉т患闂佹眹鍊楅崑鎾舵崲濞戙垹绠ｆ繛鍡楃箳閸旀挳姊烘潪鎵槮闁挎洦浜濠氬Ω閳哄倸浜為梺绋挎湰缁嬫垿顢旈敓锟�(roleId=" + applierRoleId+")濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愰潧鏆￠梺鐟板槻閸㈡煡锝炲┑瀣拻閻庨潧鎲￠弲濂告⒒娴ｇ鎮戞俊鐐跺Г缁傚秹宕奸弴姗堟嫹娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘煟閻愬鈻撻柛鎾寸箞閹﹢宕橀鐣屽幗闁硅壈鎻槐鏇㈡偩椤撱垺鐓曢幖娣妺閹查箖鏌熼銊ユ搐楠炪垺绻涢幋鐏活亪宕戝澶嬬厽閹兼番鍔嶅☉褔鏌熼懞銉х煂濠㈣娲熼幐濠冪珶濠靛棛绉洪柡浣瑰姍瀹曞爼宕滄担绋啃┑锛勫亼閸婃洖霉濮樿泛鍌ㄩ柤鎭掑劤閳瑰秴鈹戦悩鎻掝仾閻庢碍姘ㄩ幉姝岀疀濞戞瑥浠奸梺姹囧灩閹诧繝鎮″▎鎰╀簻闁哄秲鍔忔竟姗�鏌￠崱顓犳偧闁跨喎锟界噥娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娴ｅ壊娼ㄩ柨鐔剁矙楠炲啫鈻庨幘宕囩杸闂佸憡鎸烽懗鍫曞汲閵堝鈷戦柛婵嗗閻忛亶鏌涢悩宕囧⒌鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?");
			return true;
		}
		return true;
	}
	
	
	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈滈柡灞革拷鎰佸悑閹肩补锟藉磭顔愭繝娈垮枦椤鎮￠垾鎰佸殨闁割偅娲栭柋鍥ㄦ叏濮楀棗骞楅柣婵囩墱缁辨帡鎮欓锟介崝銈夋煏閸喐鍊愮�殿喛顕ч埥澶愬閻樻彃绁梻渚�娼ч…鍫ュ磿閾忣偆顩锋い鎾卞灪閸嬬姵鎱ㄥ鍡楀箻缂佺姷鍋ら弻鐔碱敊缁涘鐣奸梺鍝ュТ閿曘儱顕ラ崟顓ㄦ嫹閿濆簼鎲惧ù纭锋嫹?闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ユ繝寰锋澘锟窖囧箯閻戣姤鐓冮悹鍥皺鏁堥悗娈垮枟閹告娊骞冮姀銈呭窛濠电姴瀚繛鍥⒒閸屾瑧鍔嶉悗绗涘厾娲煛閸涱厾顔嗛梻浣哥仢椤戝啯绂嶅鍫熺厸闁搞儲婀圭花濂告倵濮樼偓瀚�?闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗ù锝堟〃閻掑﹪鏌涘☉娆愮稇缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
	private boolean checkLeaderTeamFuncEnable(long leaderRoleId)
	{
//		if(fire.pb.SystemSettingConfig.checkRoleSetting(leaderRoleId, fire.pb.SysSetType.AcceptTeam)<=0)
//			return false;
//		else
			return true;
	}
	
	private boolean checkTeamFilter(Team team, long roleId)
	{
		TeamFilter filter = team.getFilter();
		if(filter == null)
			return true;
		return filter.checkRequestJoin(team.getTeamLeaderId(), roleId);
	}
	
	//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮闁汇値鍠栭湁闁稿繐鍚嬬紞鎴犵磼閹邦収娈橀柨鐔绘缁犲秹宕曢崡鐏绘椽鏁冮崒锔剧◤闂佸搫娲㈤崹娲偂閻斿吋鐓欓梺顓ㄧ畱婢у鏌涢妶鍥ф瀾闁靛洤瀚伴崺锟犲磼濠婂啫缁╅梻浣告惈閻绱炴笟锟介悰顔撅拷锝庡枟閸婄兘鏌涢埄鍏狀亪鎮橀妷鈺傜厓缂備焦蓱瀹曞瞼锟借娲栭妶绋款嚕閹绢喗鍋勯柛婵嗗缁犱即姊婚崒娆戭槮濠㈢懓锕畷鎴﹀箳濡わ拷绾惧鏌涚仦鍓х煄濠殿喗濞婇弻銈吤圭�ｎ偅鐝ㄩ梺鐟板槻閸㈡煡鍩㈤幘璇插瀭妞ゆ棁濮ら鍕⒒娴ｈ鍋犻柛搴灦瀹曟繂顓奸崨顏呯�洪梺璺ㄥ櫐閹凤拷?
	private boolean checkTeamNotFull(Team team)
	{
		if(team.getTeamInfo().getMembers().size() < TeamManager.MAX_MEMBER_COUNT)
			return true;
		else
			return false;
	}
	
	//闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掗柛銊ュ�婚幉鎼佹偋閸繄鐟查梺绋款儛娴滎亪寮诲☉銏犖ㄦい鏃傚帶閳锋帡姊烘潪鎵槮妞ゆ垵妫濇俊鐢稿礋椤栨氨顔婇梺鐟扮摠缁诲秵绂掓ィ鍐┾拺闁硅偐鍋涢敓绐栧洤绠柣鎴ｅГ閳锋帒霉閿濆懏鍟為柛鐔哄仧缁辨帞锟斤綆鍋呯亸浼存煛閸涚増纭鹃摶鏍煕閺囨娅冩慨瑙勵殜閹嘲顭ㄩ崟顒夋閻庢鍠涢褔鍩ユ径鎰潊闁绘ɑ顔栭崬娲煟鎼达紕鐣柛搴ㄤ憾楠炲﹥鎯旈敐鍥╃劸濡炪倖鏌ㄩ惃鐑藉绩娴犲鈷旈柛銉墻閺佸绻濇繝鍌滃闁抽攱妫冮弻娑㈠即閵娿儱浼庨梺褰掝棑閸忔﹢骞冩禒瀣棃婵炴垶眉缁垱淇婇悙顏勶拷鏍箰閹间礁围缂佸娉曢弳锕傛煕椤愶絾澶勯柡浣告閺屾稓浠﹂悙顒傛濡炪倧瀵岄崣鍐潖婵犳艾纾兼繛鍡樺焾濡差噣姊虹涵鍜佸殝缂佽鲸娲熷顐︻敋閿熶粙宕洪敓鐘插窛妞ゆ挾濯寸槐鍗炩攽閻橆喖鐏遍柛鈺傜墵瀹曟繈骞嬮敂鑺ユ闂佽姤锚椤︿即宕甸崶顒佺厸濞达絿顭堥弳锝夋煛娴ｈ宕岄柟宕囧仱婵＄兘鏁傞悾灞界稇闂傚倸鍊搁崐鐑芥嚄閸洍锟斤箓宕奸妷锕�鍓规繝銏ｆ硾椤戝嫮鎹㈤崱娑欑厱闁靛鍠栨晶顕�鎮峰▎娆戠暤闁哄被鍔戦幃銈夊磼濞戞﹩浼�
	private boolean checkLevelRequirementValid(Team team, long applierRoleId)
	{
		//xbean.TeamInfo team = xtable.Team.get(teamId);
		int applierLevel = xtable.Properties.get(applierRoleId).getLevel();
		if(applierLevel >= team.getTeamInfo().getMinlevel() && applierLevel <= team.getTeamInfo().getMaxlevel())
			return true;
		else
			return false;
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794449;

	public int getType() {
		return 794449;
	}

	public long roleid; // 别人队伍的队长ID

	public CRequestJoinTeam() {
	}

	public CRequestJoinTeam(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestJoinTeam) {
			CRequestJoinTeam _o_ = (CRequestJoinTeam)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestJoinTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


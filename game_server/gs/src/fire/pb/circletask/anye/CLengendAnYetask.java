
package fire.pb.circletask.anye;

import fire.pb.circletask.CircleTaskManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLengendAnYetask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLengendAnYetask extends __CLengendAnYetask__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;	
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢宕ｆ径妯烩枈闂備胶绮敮鎺楁晝椤忓牆钃熼柡鍥╁枔缁犻箖鏌ｉ幇闈涘闁绘繃姊荤槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢閬嶆煟鎼搭垳鍒板褍娴风划鏃堫敋閿熶粙寮婚敍鍕勃闁告挆锟藉Σ鍫ユ⒑鐎圭媭娼愰柛銊ョ仢閻ｇ兘宕￠悙宥嗘⒐缁绘繃鎷呴悜姗堢础闂傚倸鍊搁崐宄懊归崶顒夋晪闁哄稁鍘奸崹鍌毭归悡搴ｆ憼闁稿顑夐弻鐔煎箲閹伴潧娈梺钘夊暟閸犳牠寮婚妸銉㈡斀闁糕檧鏅滅瑧缂傚倷鑳舵慨鎾�﹂悜钘夎摕婵炴垯鍨圭粻娑欍亜閺嶇數鍒版繛鍫熺箞濮婇缚銇愰幒婵囶棖闂佺绻戦敃銏ゆ偘椤曪拷瀵粙濡搁敃锟介鎾绘⒑闂堚晛鐦滈柛姗�绠栧鎶藉閵堝棌鎷婚梺绋挎湰閼归箖鏁撴禒瀣垫缂侇喖鐗婄粭鐔兼晸閽樺鏆﹂柕澹秵瀚归柨婵嗛婢т即鏌ｉ鐐靛ⅵ闁哄瞼鍠撶槐鎺楀閻樺磭浜梻浣圭湽閸婃宕戦幘鑸靛床婵炴垯鍨圭粻锝嗙箾閸℃绠冲ù鐓庡濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熲晛顕ｉ妸锔界秶闁靛ě锟介弨铏節閻㈤潧孝婵炶绠撳畷鎰版煥鐎ｃ劋绨婚棅顐㈡处閹告悂顢旈悽鍛婄厵濡炲楠搁崢瀵革拷娈垮枙缁瑩鍨鹃弽顓炵伋闁惧浚鍋呴崕鎾愁渻閵堝棙灏柛姘儏椤曘儵宕熼鍌滅槇闂佸憡娲﹂崜娑㈠矗閸曨偀鏀介柣妯虹仛閺嗏晛鈹戦鑺ュ唉闁轰礁鍟存俊鑸靛緞婵犲嫮鏋冮梻浣筋潐婢瑰棙鏅跺Δ鍛？婵°倧鎷锋い顓炴健閹虫粓妫冨☉姗嗘綌闂備胶绮幐濠氭偡閳哄懎钃熼柨婵嗩槸缁狅綁鏌ｉ幇顒侇棡闁搞劌娼″畷鍝勨槈閵忕姷鐤�闂佺粯顨呴悧鍡涙晸閽樺浠涢柟渚垮妼椤粓宕卞Δ锟界粻褰掓⒑閸涘﹦绠栨俊鐐扮矙瀵鍨惧畷鍥ㄦ畷闂佽法鍠嶇划娆忕暦娴兼潙绠婚柤鍛婎問濞肩喖姊洪崷顓炲妺闁搞倧绠撻幃銏ゅ川婵犲偆娼梻浣告惈椤︻垶鎮樺┑瀣�跺ù锝囩《閺�浠嬫煟濡櫣浠涢柡鍡忔櫊閺屾稓锟斤綆鍓欓弸娑氾拷瑙勬磸閸ㄥジ藝閸︻叏鎷风憴鍕闁搞劏娉涢悾椋庣矙鐠囩偓妫冮弫鎾寸鐎ｎ偄浜楀┑顔筋殣閹风兘鏌″畝锟介崰鎰焽韫囨柣鍋呴柛鎰ㄦ櫓閿熻棄绉瑰铏圭矙閸栤�冲闂佺绻戦敃銏狀嚕婵犳艾鐒洪柛鎰╁妿缁愮偤鏌ｆ惔顖滅У濞存粎鍋炵粋鎺楀礂閼测晝顔曢柣搴ｆ暩椤牊鐗庨梻浣告贡椤牓宕崸妤嬬稏闊洦绋掗幆鐐烘煕閿旇骞橀柨娑欑矊閳规垿顢欑粵瀣暥濠碘槅鍋呴悷鈺呭箖妤ｅ啫閱囬柡鍥╁暱閹锋椽姊洪崷顓х劸閻庢稈鏅濇竟鏇㈠箹娴ｅ湱鍘遍柟鍏肩暘閸ㄥ綊鍩㈤弴銏＄厸濞达綀顫夌亸鎵磼閸屾稑绗ч柨鐔告灮缂嶅棝宕戦崨瀛樼叆妞ゆ挶鍨洪埛鎴︽⒒閸喓銆掑褎鐩弻鐔碱敊閻撳函鎷烽幖渚囨晪闁挎繂顦介弫鍐煥閺囶亝瀚圭紓浣哄Ь瀹曠數妲愰幘瀛樺闁兼祴鍓濋崹鐢稿煝瀹ュ顫呴柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫婵犻潧鍊搁幉锟犳偂閵夆晜鐓涢柛鎰╁妽婢跺嫭銇勯妷銉Ч闁靛洤瀚粻娑㈠Ψ閿曪拷椤忥拷" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁嬭崵绱掔紒妯肩疄鐎规洖缍婇、鏇㈠閻欙拷濞兼棃姊虹拠鏌ュ弰婵炰匠鍥ㄥ剹闁稿本鍑瑰鏍ㄧ箾瀹割喕绨婚柟纭呭煐閵囧嫰骞樼捄杞扮捕婵犵锟借櫕鎯堥柍瑙勫灴椤㈡瑧娑靛畡棰佺矗缂傚倸鍊哥粔鎾晝椤忓牆鏋侀柟鎵閸婄兘鏌涘┑鍡楊仼鐎规挸妫濆娲濞戙垻宕紓浣介哺濞茬喎鐣烽姀銈嗙劶鐎广儱妫岄幏娲煟閻斿摜鎳冮悗姘煎墰缁牓宕橀钘夛拷鍫曠叓閸ャ劍鈷掗柟鍐叉川閿熷�燁潐濞叉鎹㈤崒鐑嗘晣闁稿繒鍘х欢鐐烘倵閿濆簼鎮嶉柟椋庡厴瀹曞綊顢曢敐鍛紟婵犳鍠楅〃鍛涘Δ鍛祦婵°倕鎳忛悡鐔兼煏婵犲繒鐣遍柣蹇婃櫇缁辨帗娼忛妸銉х懖濠电偟鍘х换妯讳繆閹间焦鏅濋柨鐔烘櫕婢规洟骞庨懞銉ワ拷鐢告偡濞嗗繐顏紒锟介敓浠嬫⒑闂堟稓澧曢柟璇х節楠炲牓濡搁埡鍌涙婵炲濮撮鍡涙偂閻旈晲绻嗘い鏍ㄧ玻缁辩増绻濇繝鍌滃缁炬崘娉曢敓鍊燁潐濞叉牕煤閿曞偊缍栭柡鍥ュ灪閻撴瑩鏌ｉ幋鐐嗘垹浜搁鐘电＜闁告挷绀佹禒婊堟煃鐟欏嫬鐏撮柟顔规櫊瀵濡烽鍡樺婵°倓鑳剁粻楣冩煕椤愶絿绠撴い锝呯－缁辨帗娼忛妸锕�闉嶉梺鐟板槻閹冲繒绮嬮幒鏃撴嫹閿濆簼绨奸柟铏懇濮婄粯鎷呴崨濠呯闂佺娅曢幐鍝ュ弲濡炪倖鎸鹃崕鎰板吹閺囩喆浜滈柟鏉垮閻ｈ京绱掗悩鍝勫惞缂佽鲸鎸婚幏鍛存嚃閳╁啫鐏ラ柍璇茬Ч婵拷闁靛牆妫岄幏娲煟閻樺厖鑸柛鏂胯嫰閳诲秹骞囬悧鍫㈠幍闂佸憡鍨崐鏍拷姘炬嫹?" + taskpos + "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樻⒒绾惧ジ鏌ㄩ悢璇残撶�垫澘瀚悾婵堬拷锝庡亜椤忓爼姊虹拫搴″暞閸熺偤鎮楀顒傜Ш婵﹨娅ｉ幑鍕Ω閵夛妇锟借櫣绱撴笟鍥ф灍闁荤啿鏅涢锝夘敃閿曪拷缁犺崵绱撴担濮戭亜鈻撻悢鍏尖拺闂傚牊鍐荤槐锟犳煕濞戝崬骞栫紓宥呮濮婂宕掑▎鎴М闂佺顕滅换婵嬪Υ閸愵喖骞㈡俊顖濆亹椤旀洘绻濋悽闈浶㈤柛濠傤煼瀵娊鏁傞悾宀�顔曢悗鐟板閸犳洜鑺辨總鍛婄厱濠电姴瀚崢鎾煛鐏炲墽鈽夐柍瑙勫灴瀹曞崬螖婵犱胶纾鹃梻鍌欑閹芥粓宕戝☉銏″亯闁绘挸瀵掑鏍ㄧ箾瀹割喕绨兼い銉ョ墛缁绘盯骞嬮敐澶婃懙闁煎弶鐗犲缁樻媴娓氼垳鍔搁柣搴㈢▓閺呮粎鎹㈠☉娆戠瘈闁搞儯鍎婚幏閿嬫媴閼叉繄鍠愮缓浠嬫嚍閵夛负浠㈠銈冨灪濡啫鐣烽鍛閻犲洠鍓濋ˉ濠冪節绾板纾块柛瀣灴瀹曟劙寮介鐐殿槷闂佺鎻粻鎴﹀垂閸岀偞鐓熼柟瀵镐紳椤忓棙顐介柣鎰劋閻撴洟鏌￠崶銉ュ闁诲骏绻濋弻锝夊箻鐎靛憡鍣梺閫涚┒閸斿矂鍩為幋锕�骞㈡慨姗嗗墻娴煎啴姊绘担鍛婂暈闁艰鍎抽敃銏℃綇閳哄偆娼熼梺鍦劋椤ㄥ繘寮繝鍥ㄧ厾婵炴潙顑嗗▍鍛存煃椤忓牅鎲炬慨濠呮閹瑰嫰濡搁妷锔撅拷楣冩⒑閸濆嫷鍎撶�规洜鏁稿Σ鎰版倷閸濆嫬鑰垮┑鐐村灦閻燂箑鈻嶉姀锛勭瘈婵炲牆鐏濋弸鐔兼煕閺冿拷濞茬喖骞冨锟介崺锟犲礃椤忓棴绱抽柣搴＄畭閸庨亶骞忛幋锔惧彆妞ゆ帊绶″▓浠嬫煟閹邦厼绲婚柡鍡秮閺屾盯鍩＄�ｎ剛鐦堥悗瑙勬礃鐢帡鈥﹂妸鈺佸窛妞ゆ柨鍚嬮悿鍕節绾板纾块柛瀣灴瀹曟劙寮介鐔蜂罕濠德板�曢崯顐﹀几閸澁鎷烽獮鍨姎妞わ缚绮欏顐ｇ節閸ャ劎鍘遍梺鍝勬储閸斿本绂嶉幇鐗堢厸闁跨喕濮ょ粋鎺旓拷锝庡亞閸樿棄鈹戦埥鍡楃仴妞ゆ泦鍕珷妞ゆ牜鍋為悡鏇㈡煟閺冨牜妫戠紒鐘差煼閺岋紕浠﹂崜褎鍒涢梺杞扮劍閸旀牠骞嗛弮鍫熸櫖闁告洦浜濋、妯衡攽鎺抽崐妤佹叏閻戣棄纾绘繛鎴炵瀹曞弶鎱ㄥΔ瀣閻庢鍣崑濠囩嵁濡偐纾兼俊顖滅帛椤忕喖姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷!");
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.startLegendAnYeTask(taskpos);
				rayt.refreshAnYeTasks(taskpos);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807458;

	public int getType() {
		return 807458;
	}

	public int taskpos; // 任务栏位

	public CLengendAnYetask() {
	}

	public CLengendAnYetask(int _taskpos_) {
		this.taskpos = _taskpos_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(taskpos);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		taskpos = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLengendAnYetask) {
			CLengendAnYetask _o_ = (CLengendAnYetask)_o1_;
			if (taskpos != _o_.taskpos) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += taskpos;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(taskpos).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLengendAnYetask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = taskpos - _o_.taskpos;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.circletask.anye;
import fire.pb.circletask.CircleTaskManager;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAbandonAnYe__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAbandonAnYe extends __CAbandonAnYe__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		CircleTaskManager.logger.info("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴楠炴﹢宕ｆ径妯烩枈闂備胶绮敮鎺楁晝椤忓牆钃熼柡鍥╁枔缁犻箖鏌ｉ幇闈涘闁绘繃姊荤槐鎾存媴閸濆嫷锟藉矂鏌涢妸銉у煟鐎殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢閬嶆煟鎼搭垳鍒板褍娴风划鏃堫敋閿熶粙寮婚敍鍕勃闁告挆锟藉Σ鍫ユ⒑鐎圭媭娼愰柛銊ョ仢閻ｇ兘宕￠悙宥嗘⒐缁绘繃鎷呴悜姗堢础闂傚倸鍊搁崐宄懊归崶顒夋晪闁哄稁鍘奸崹鍌毭归悡搴ｆ憼闁稿顑夐弻鐔煎箲閹伴潧娈梺钘夊暟閸犳牠寮婚妸銉㈡斀闁糕檧鏅滅瑧缂傚倷鑳舵慨鎾�﹂悜钘夎摕婵炴垯鍨圭粻娑欍亜閺嶇數鍒版繛鍫熺箞濮婇缚銇愰幒婵囶棖闂佺绻戦敋闁伙綁顥撶划娆戞嫚閻愵剚顥堥柡浣规尰缁傛帞锟斤綆鍋勯悵鏃堟⒑缂佹ɑ鐓ラ柛姘儔閹繝濡烽埡鍌滃幗闂佸搫鍊圭�笛囧箚閸儱鍐�闁跨喓濮甸埛鎴︽煕濠靛棗顏柛锝堝Г閵囧嫰顢橀悙闈涒叺濠电媴鎷峰〒姘炬嫹婵﹨娅ｇ槐鎺懳熻箛锝勭盎閾伙絽鈹戦悩鍙夋悙缁炬儳娼￠悡顐﹀炊閵婏妇顦紒鐐劤閵堟悂寮婚敐鍛傜喖骞愭惔锝呮锭闂備焦鐪归崝宥夊垂閸ф钃熼柣鏃傚帶閻顭跨捄鐑樻拱闁瑰弶鐟х槐鎾存媴閸濆嫅锝夋煟閳哄﹤鐏犳い鏇秮楠炴﹢顢欓挊澶涙嫹婵犳碍鐓曢柍鈺佸枦娓氭稒淇婇鐘插姕缂佺粯绻傞銉╂煥鐎ｎ偆鍑￠梺璺ㄥ枔閻涖倝宕ㄩ鐘电摌濠电偛顕慨鎾敄閸涘瓨鍋い鏂款潟娴滄粓鏌″搴′簻濞寸媴绠撻弻娑氾拷锝庝簻閿熻棄婀遍幑銏犫槈閵忕姷顓哄┑鐐叉缁绘帗绂掓ィ鍐┾拺缂備焦蓱鐏忕増绻涢懠顒�鏋涚�殿喛顕ч鍏煎緞婵犲嫬骞愬┑鐐舵彧缁蹭粙骞夐敓鐘冲�堕柡鍥╁枔缁犻箖鏌熼幆褜鍤熸い锝堝皺缁辨帞锟斤綆鍋勭粭褔鏌熼獮鍨仼闁宠棄顦垫慨锟介柣妯款嚙閺佸綊姊绘担铏瑰笡婵﹨宕靛☉鐢稿醇閺囩偟顔嗛悷婊呭鐢鍩涢幋锔解拻闁割偆鍠撻埦渚�鏌熼崗鐓庡闁诡喗顨呴～婵嬫偂鎼达絼妗撻梺鑺ド戠换鍫濐潖濞差亶鏁嗛柨鐔烘櫕缁棃鎮介崨濠備簵闂佺粯鏌ㄩ崥瀣偂濞嗘挻鐓ｉ煫鍥ㄦ礃閸わ拷婵炲濮电划宥夊Φ閸曨垰鐓涘┑鐘插�搁～顐ょ磽娴ｄ粙鍝洪悽顖ょ節閵嗕礁鈻庨幋婵囩�抽梺鍛婎殘閸嬫稒绔熸惔顫箚闁靛牆娲ゅ暩闂佺顑囬崑鐔煎极椤曪拷閸ㄩ箖骞囨担鍛婎吙婵＄偑鍊栧ú鈺呭箯閻戣姤鐓涘ù锝堫潐瀹曞矂鏌熼钘夊姢闁伙絾绻勯敓鏂ょ秵閸嬪嫰顢旂捄琛℃斀妞ゆ梹鏋绘笟娑㈡煕濡亽鍋㈢�规洦鍋勭叅妞ゅ繐鎳愰崢鎼佹倵閻у憡瀚归梺璺ㄥ枍缁瑥鐣锋导鏉戠闁煎憡顔栧鐔兼⒑閸︻厼鍔嬮柛銈忕畵閹垽宕ㄦ繝鍌ゆ蒋闂備礁鎼ˇ顖炴倶濠靛鍊跺ù锝囩《閺�浠嬫煟濡櫣浠涢柡鍡忔櫊閺屾稓锟斤綆鍓欓弸娑氾拷瑙勬磸閸ㄥジ藝閸︻叏鎷风憴鍕闁搞劏娉涢悾椋庣矙鐠囩偓妫冮弫鎾寸鐎ｎ偄浜楀┑顔筋殣閹风兘鏌″畝锟介崰鎰焽韫囨柣鍋呴柛鎰ㄦ櫓閿熻棄绉瑰铏圭矙閸栤�冲闂佺绻戦敃銏狀嚕婵犳艾鐒洪柛鎰╁妿缁愮偤鏌ｆ惔顖滅У濞存粎鍋炵粋鎺楀礂閼测晝顔曢柣搴ｆ暩椤牊鐗庨梻浣告贡椤牓宕崸妤嬬稏闊洦绋掗幆鐐烘煕閿旇骞橀柨娑欑矊閳规垿顢欑粵瀣暥濠碘槅鍋呴悷鈺呭箖妤ｅ啫閱囬柡鍥╁暱閹锋椽姊洪崷顓х劸閻庢稈鏅濇竟鏇㈠箹娴ｅ湱鍘遍柟鍏肩暘閸ㄥ綊鍩㈤弴銏＄厸濞达綀顫夌亸鎵磼閸屾稑绗ч柨鐔告灮缂嶅棝宕戦崨瀛樼叆妞ゆ挶鍨洪埛鎴︽⒒閸喓銆掑褎鐩弻鐔碱敊閻撳函鎷烽幖渚囨晪闁挎繂顦介弫鍐煥閺囶亝瀚圭紓浣哄Ь瀹曠數妲愰幘瀛樺闁兼祴鍓濋崹鐢稿煝瀹ュ顫呴柕鍫濇閹锋椽鏌ｉ悩鍏呰埅闁告柨鑻埢宥夊箛閻楀牏鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�.闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽鐎ｎ亣鎽曢梺闈浥堥弲娑氱尵瀹ュ鐓曢悘鐐插⒔閻擃垰顭跨憴鍕婵﹥妞藉畷顐﹀礋椤掑锛佺紓鍌欑贰閸犳骞戦崶褜鍤曞┑鐘崇閺呮彃顭跨捄鐚存敾妞ゃ儲绻堝娲捶椤撗呭姼闁诲孩绋堥弲鐘茬暦娴兼潙绠涢柣妤�鐗冮幏铏圭磽閸屾瑧鍔嶆い顓炴川缁顫濋鐘殿啎婵犮垼娉涢鍥洪幘顔界厱闁冲搫鍟禒杈殽閻愬樊鍎旈柡浣稿暣閺佹捇鎮剧仦绛嬫婵犻潧鍊搁幉锟犳偂閵夆晜鐓涢柛鎰╁妽婢跺嫭銇勯妷銉Ч闁靛洤瀚粻娑㈠Ψ閿曪拷椤忥拷" + roleid + "]闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌＄仦璇插鐎殿噮鍣ｅ畷鍫曗�﹂幋鐑嗘闂傚倷娴囧▔鏇㈠窗閺囩倣娑㈠礋椤愵偆鍔烽梺璺ㄥ枔婵挳鎷戦悢鍏肩厪濠电偟鍋撳▍鍛存煕濡や礁鈻曢柡宀嬬秮楠炲洭顢涢敐鍛杺闂備礁婀遍崗姗�藟閹捐泛鍨濇繛鍡樺灦鐎氭岸鏌ｉ幇闈涘闁宠棄顦甸幗鍫曟晲閸涱亝鏂�闂佺鏈换鍐夋径宀�纾界�广儱鎷戦煬顒傦拷娈垮櫘閸嬪﹪鐛崶顒�绾ч柛顭戝枤閻涒晜淇婇悙顏勶拷鏍箰閸℃稑绀嬮柛顭戝亽濡捇姊婚崒姘拷鎼佸磹閻戣姤鍊块柨鏇炲�哥粻鏍煕椤愶絾绀�缁炬儳缍婇弻鈥愁吋鎼达絼姹楀┑鐐叉▕娴滄繈宕戦崟顖涚厽闁规崘娅曢崬澶愭煙閼恒儲绀�闁宠鍨块幃娆撳级閹寸姳鎴烽梻浣规偠閸斿苯锕㈡潏鈺佸灊閻犲洦绁村Σ鍫ユ煏韫囥儳纾块柛姗嗕簼缁绘繈鎮介棃娴躲垻绱掔紒妯忣亪鈥栨繝鍥舵晪闁跨喍绮欏濠氭晲閸涱亝鏂�闂佹悶鍎崝搴ㄋ囬妷銉富闁靛牆绨肩花濠氭煕閻旈鎽犲ǎ鍥э躬瀹曞ジ寮撮悙鑼讹拷鍨攽閳藉棗鐏ｉ柛妯犲喚鍤曢柟鎯板Г閳锋帒霉閿濆嫯顒熼柣鎺楃畺閺屻劑寮村Ο鍝勫Е濡ょ姷鍋涢崯鏉戠暦閹烘鍊烽柤纰卞厸缁辨粓姊绘担鐟邦嚋婵炲弶鐗犲畷鎰板箹娴ｅ湱鍙嗛梺闈涚墕濡梻鎹㈤崱娑欑厪闁割偅绻傞顐ｃ亜閿斿ジ妾紒缁樼洴瀹曞ジ鎮㈤搹鍦澖婵犳鍠栭敃銈夊箹椤愶絾娅忛梻浣规偠閸庢粓宕ㄩ鍌滐紵闂傚倸鍊峰ù鍥ь浖閵娾晜鍊块柨鏇炲�哥粻鏍煕瀹�锟介崑娑氱不閺嶎厽鐓熼柟閭﹀墻閸ょ喖姊婚崟顐㈩伃闁哄本绋戦埥澶娢熼幋婵堝ⅵ妤犵偛绻愮叅妞ゅ繐鎳夐幏娲⒑閻撳寒娼熼柛濠冩礋瀵悂骞嬪┑鎰數闂佽崵鍠撴晶妤吽夐姀銈嗙厵妞ゆ洩鎷风紒鐘崇墵閵嗕礁顫滈敓鑺ユ叏閿熶粙鏌ㄥ☉妯侯仼妤犵偛鐗撳缁樼瑹閿熻棄顭囪閳ワ箓宕奸妷銉ь槷閻庡箍鍎遍敍鍡樺緞鐎ｎ亞绐為梺褰掑亰閸橀箖宕㈡禒瀣拺闁圭娴风粻鎾寸箾鐏炲倸锟芥繂鐣烽姀銈呯妞ゆ梻鏅崢鍛婄箾鏉堝墽绉い顐㈩槸閻ｅ嘲鐣濋崟顒傚幐婵炶揪缍�椤鐣峰畝鍕厸濞达綀顫夊畷宀勬煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?:" + questid);
		new mkdb.Procedure() {
			@Override
			protected boolean process() {
				RoleAnYeTask rayt = new RoleAnYeTask(roleid);
				rayt.abandonTask();
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807460;

	public int getType() {
		return 807460;
	}

	public int questid; // 放弃的任务id(暗夜马戏团1080000)

	public CAbandonAnYe() {
	}

	public CAbandonAnYe(int _questid_) {
		this.questid = _questid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(questid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		questid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAbandonAnYe) {
			CAbandonAnYe _o_ = (CAbandonAnYe)_o1_;
			if (questid != _o_.questid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += questid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(questid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAbandonAnYe _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = questid - _o_.questid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


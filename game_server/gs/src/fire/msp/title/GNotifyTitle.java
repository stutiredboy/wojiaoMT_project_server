
package fire.msp.title;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyTitle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyTitle extends __GNotifyTitle__ {
	@Override
	protected void process() {
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		if(null == role.getScene()) return;
		role.setMyTitleInfo(title);
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈笟妤�螞閿熺姵鈷戦柣鐔告緲閺嗛亶鏌ｉ鐐诧拷鎼侊綖韫囨稒鎯為悷娆忓閻濅即姊洪崫鍕潶闁稿孩妞介弫鎾绘嚍閵夘喗鐤侀梺鍝勭焿缂嶏拷缂佺姵鐩顕�鏁撴禒瀣剭闁硅揪闄勯悡鏇㈡煙閻戞ɑ灏繛鎼枟椤ㄣ儵鎮欓悿娈夸邯閹箖鎮滈挊澶屽�為梺闈涱煭鐎靛矂宕惔銊︹拻闁稿本鐟х粣鏃�绻涙担鍐叉噺瀹曟煡鏌涢鐘插姎缁炬儳缍婇弻鈥愁吋鎼粹�崇缂佺偓鍎抽…鐑藉蓟濞戙垹鍗抽柕濞垮劤娴狀參姊虹紒妯诲鞍婵炲弶顭囬幑銏犫槈閵忕姷顓洪梺缁樺灥濞层倝宕ｉ弴銏♀拻濠电姴楠告晶濠氭煕閹惧顣茬紒宀冮哺缁绘繈宕惰椤︻參鎮峰鍐х�规洏鍨婚敓鑺ョ♁钃遍柛娆忕箰閳规垿鎮╅幓鎺炴嫹瑜版帒绠氶柛顐犲劚閺嬩線鏌涢鐘插姕闁绘挻娲熼弻鏇熷緞鐎ｎ亞浠撮梺鍝ュУ瀹�鎼佸箖濡ゅ懎绠柤鎭掑劗閹锋椽鏌ｉ悩鍙夊鐟滄澘鍟撮、妤呭閵堝棛鍘遍梺鐟扮摠缁诲嫮绮旈搹鐧告嫹鐟欏嫭纾搁柛銊ㄦ閻ｅ嘲顭ㄩ崱鈺傂╅梻浣规偠閸斿秶鎹㈤崒鐐茬厴闁硅揪闄勯崑鎰版煕濞嗗浚妲告い锔规櫊濮婃椽宕崟顒�娅ょ紓渚囧枟閹瑰洤顕ｇ拠娴嬫闁靛繒濮烽鎺戔攽鎺抽崐褔骞忛悜鑺ョ厵闁惧浚鍋勬慨宥囷拷瑙勬磸閸ㄤ粙銆佸☉銏″�风紒顔款潐鐎氬ジ姊洪懡銈呅㈡繛璇х畳閵囨劙宕橀鐓庢優闁哄鐗冮弲婵堝閻ｅ矉鎷烽獮鍨姎闁瑰啿绻樿棢闁绘劗鏁哥壕濂告煕鐏炵偓鐨戠�涙繂顪冮妶搴″箲闁告梹鍨甸悾閿嬬附閸涘﹤浜滈梺鍛婂灟閸婃牜锟芥艾缍婇弻锝夊閻樺啿鏆堥梺绋款儜缂嶄線寮诲☉銏犖ㄩ柨婵嗘噹椤姊洪棃娑氬闁宦板妽缁岃鲸绻濋崶褏顔岄梺鍦劋閺屻劑鍩呴悽鍛娾拺闁告繂瀚悘閬嶆煕閻樺磭澧甸柣娑卞櫍瀹曞崬顫濋崗澶光晠姊绘担钘変汗妞ゎ厼鐗忕槐鐐寸節閸パ嗘憰闂侀潧艌閺呮粓宕戦崟顖涘仯闁搞儯鍔庨弳娆撴煙閸撗呭笡闁绘挾鍠愭穱濠囧Χ閸曨厼濡界紓渚婃嫹閻庯綆鍠楅悡鍐煏婢舵ê鐏ｉ柣锝囨暩閿熷�燁潐濞叉牠鎮ユ總鎼烇拷浣肝旀担鍝ョ獮闁诲函缍嗛崑鍛存偟椤愨懇鏀介柣妯诲墯閸熷繘鏌涢悩鎰佹疁闁轰礁鍟撮、鏇㈠Χ閸涱垳鐡樺┑掳鍊х徊浠嬪窗濞戞氨绀婇柡宥庡亾閹风兘鐛崹顔煎濡炪倧缂氶崡鎶藉春濞戙垹绠ｉ柨鏃傛櫕閸橀亶姊洪崷顓炰壕婵炲吋鐟у濠勬嫚鐟佷胶鎳撻…銊╁川椤撴繃顫曢梻浣告惈閺堫剟鎯勯鐐茬畺闁冲搫鎳忛崵鎴炪亜閹搭厼浜栭柛濠冪墬缁岃鲸绻濋崶褏鐓戞繝銏ｆ硾閿曘倝锝為幒妤佸�垫繛鍫濈仢閺嬫瑧绱掗鐣屾噰闁靛棔绀侀～婊堟晸娴犲绠栭柕蹇嬪�栭幉銉╂煕鐏炴崘澹樻い鏇嗗洦鈷掑ù锝堟閸氬綊鏌涢悩鍐插闁告帗甯掗悾婵嬫晸閻ｅ苯鍨濋柡鍐ㄧ墛閸嬨劎绱掔�ｎ厽纭堕柣锝夌畺濮婃椽宕崟顐嫹瑜版帩鏁勬繛鍡樻尰閸嬪倿鏌曟径鍡樻珕闁绘挻娲樼换娑㈠箣濠靛棜鍩炲┑鐐叉噺钃辩紒缁樼洴閹虫牠鍩℃担鍦拷濠氭⒑鐎圭媭娼愰柛銊ユ健楠炲啴鍩￠崘顏嗭紲濠碘槅鍨伴…鐑藉极椤忓懐绡�闁汇垽娼ф禒婊堟煟椤忓啫宓嗙�规洘绻堥獮瀣晝閿熷�熺箽闂備礁鎲＄粙鎴︽偤閵娾晛纾瑰┑鐘崇閻撶娀鏌熼鐔风瑨闁告柣鍊濋弻娑橆潨閸℃洜鍑圭紓浣虹帛缁诲牊鎱ㄩ敓浠嬫煥濠靛棙顥犻柕鍡樺姍濮婅櫣绱掑鍡樼暥濠碘槅鍋呯换鍌炴偩瀹勬壋鏀介柛鈾�鏅濋崣鍡涙⒑閸撴彃浜為柛鐘虫崌瀹曘垺娼忛妸褏鐦堥梺姹囧灲濞佳冪摥闂佽瀛╅崙褰掑矗閸愵煈鍤曢柟鍓佺摂閺佸棝鏌涢弴銊ュ闁告ɑ鎮傞弻锝堢疀閺囩偘绮舵繝鈷�鍌滅煓闁糕斂鍎插鍕箛椤撶姴甯楅梺鑽ゅТ濞诧箓鎮￠敓鐙�鏁佹俊銈呮噺閹虫岸鏌ㄥ┑鍡╂Ч闁绘搫缍侀悡顐﹀炊閵娿儱鏋欓梺鐟板槻閸㈡煡鍩ユ径濞炬瀻闁硅埇鍔嶉悘鍡涙⒒閸屾艾锟芥悂宕愰幖浣哥９闁绘垼濮ら崵鍕煕椤愶絾纾甸柨鐔告灮缁犳挸鐣锋總绋款潊闁炽儱鍟跨花銉╂⒒娴ｄ警鏀伴柟娲讳簽瀵板﹥銈ｉ崘銊х枃閻庣櫢鎷烽柛鏇ㄥ厴閹锋椽鏌ｉ悩鍙夋悙鐎殿喖鐖奸獮鎴︽晲婢跺鍘告繛杈剧秬椤宕愰幇顕嗘嫹鐟欏嫭纾搁柛銊ャ偢钘濋柛顐ｆ礃閻撶喖鐓崶銊︾叆婵炴惌鍠楅幈銊︾節閸愨斂浠㈤悗瑙勬磸閸斿秶鎹㈠┑瀣妞ゆ挾濮靛▓濂告⒒娴ｇ瓔鍤欓悗娑掓櫅椤繈濡搁埡浣侯槯濠碘槅鍨靛▍锝夊汲閿曞倹鈷掗柛顐ゅ枔閳绘捇鏌＄�ｎ亪鍙勯柡宀�鍠栧畷婊嗩樁閽樼喖姊鸿ぐ鎺撴暠婵＄偠妫勯～蹇撁洪鍛闂侀潧鐗嗛幊蹇涙倵閻愵剛绡�闁靛繈鍨洪崵锟藉┑鈽嗗亝缁诲牓鎮伴鍢夋棃宕ㄩ闂存睏缂傚倸鍊烽悞锕傗�﹂崶顒�鍌ㄩ梺顒�绉甸埛鎴︽煕濠靛棗顏╅柡瀣剁畵閺岀喐顦版惔鈥冲箣闂佽鍠曠划娆撱�佸☉姗嗙叆闁告剬鍕厱闂傚倷绀侀幉锛勬暜濡ゅ啯鏆滈柨鐔哄Т閺勩儵鏌ㄩ悢鍝勑㈢�瑰憡绻冮妵鍕箻鐠轰警锟藉矂鏌涢悢濂夊剱濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡宥庣仜濞戞瑧鐟归柨鐔绘閻ｇ兘骞嬮敃锟界粻娑欍亜閹炬瀚烽崯宥夋⒒娴ｈ鍋犻柛搴㈡そ瀹曟粌顫濈捄铏瑰幈闂佺鎻梽鍕偂濞戙垺鐓曢悘鐐扮畽椤忓牆绀夋繝濠傚缁犻箖鏌涘☉鍗炲箺闁搞倕娲弻锛勪沪閸撗勫垱闂佽鍠撻崹钘夌暦閵婏妇绡�闁告洦鍋勫▓銉╂⒒閸屾瑧顦﹂柟纰卞亜铻炵�癸拷閸曨偆鏌ч梺缁樏Ο濠傤焽閺嶎偆纾藉ù锝堝亗閹寸偛鍨旈悗闈涙憸绾惧吋绻涢幋鐑囦緵闁稿骸绻戠换娑㈠醇閻斿嘲顫掑┑顔硷攻濡炶棄鐣烽妸锔剧瘈闁告洦鍓欏▍鎴︽⒒閸屾瑧顦﹂幖瀛樼矌瀵板﹥绂掔�ｎ偄浠奸梺姹囧�ら崹顒佺瑜版帗鐓欓柣鎴炆戠亸顓灻归悩灞傚仮闁哄矉缍�缁犳盯寮撮悙鐗堝煕闂備焦鍎崇换鎰殽閹间讲锟斤箓宕堕浣镐簻闁诲繐绻嬮悞锕傚棘閿熶粙姊绘担铏瑰笡妞ゎ厼娲ㄩ崚鎺楊敍濮橈絾顫嶉悷婊冩捣閹广垹鈽夊顐ｅ媰闂佺鏈懝楣冿綖閸ヮ剚鈷戠紒顖涙礃閺夋椽鏌涢妸銊︻棄妞ゆ洩缍侀、姘舵晸閽樺鏆﹂柟鐑橆殕閺呮粓鏌﹀Ο渚▓濞村吋鎸绘穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮柟顔矫埞鎴狅拷锝庝簽椤︻喖鈹戦绛嬬劸闁糕晜鐗犻幃锟犳偄闂�鎰畾闂侀潧鐗嗙换鎴狅拷姘贡缁辨挻鎷呴搹鐟扮闁汇埄鍨抽崑銈呯暦濮樿泛绠抽柟鎯у閻﹀牆鈹戦鏂や緵闁告挻鐟╁畷顒勫Ω閵夘喗瀵岄梺闈涚墕濡瑧浜搁悽鍛婄厱闁绘棃鏀遍崑銉︻殽閻愯尙绠茬紒缁樼箓椤繈顢樺☉娆忣伖闂備浇宕垫慨鍨娴犲绀夐悘鐐缎掗弸宥夋煙閹殿喖顣奸柣鎾寸懇閺屾盯骞嬪▎蹇ユ嫹閺嶎偓鎷峰鐐?闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厽闁靛繈鍩勯悞鍓х磼閹邦収娈滈柡宀�鍠栭弻鍥晝閿熶粙宕濋幒鎾剁鐎瑰壊鍠曠花鑽ょ磼閻欏懐绉柡宀嬬到铻ｉ柛蹇撳悑濮ｅ嫰姊虹紒妯虹瑨闁告艾顑囬幑銏犫槈閵忕姷顔掗柣搴ｆ暩椤牓寮抽敓鐘斥拺闁革富鍘奸崢鎾煛閿熶粙鏌嗗鍛傦箓鏌涢弴銊ョ仩妞ゎ偄鎳橀弻宥夋寠婢跺妫ら梺鍛婃⒐閹倸顫忓ú顏咁棃婵炴垶鐟ラˇ鈺呮⒑閸涘﹥鈷愰柣鐔叉櫊閹即顢氶敓浠嬬嵁閹烘嚦鏃堟晸閻ｅ瞼涓嶉柨婵嗩槹閻撶喐绻涢崱妯兼噭閻庢艾缍婂娲川婵犲懎顥濋梺鐟板暱闁帮綁宕洪悙鍝勭闁挎棁濮ゅ▍鏍⒑閸涘﹥澶勯柛瀣�婚崚鎺旀崉娓氼垱瀵岄梺闈涚墕濡鎮橀妷鈺傜厵闁惧浚鍋勬慨宥夋煛娴ｈ宕岄柟绋匡攻瀵板嫮浠﹂懖鈺呪攺闂備焦鐪归崺鍕垂闁秲锟藉啴宕奸妷锔芥婵炲濮撮鍡椻槈瑜旈弻鏇㈠醇閵忊晝鍔搁梺浼欑悼閸忔﹢鐛幒鎳虫梹鎷呴棃鈺傚濡炲娴风壕鍏笺亜閺冿拷椤戞瑥顭囬幇鐗堝�垫慨姗嗗厵閸嬨垺鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶅┑锛勫亼閸娧呯不閹达箑鐤柛褎顨呴悡婵嬫煛閸愩劎澧曢柛妤佸▕閺岋綁骞囬鍌欑驳闂佺懓鍟块崯鏉戭潖婵犳艾纾兼慨姗嗗墾閹峰嘲鐣￠幊濠傜秺瀹曞爼顢楁径瀣珨闂備礁鎼粙渚�宕㈤懖鈺冪幓婵°倕鎳忛悡娑氾拷骞垮劚妤犲憡绂嶆ィ鍐╃厵鐎瑰嫭婢樺Σ濠氭煃閽樺妯�妤犵偞甯￠獮妯硷拷鐢殿焾缁茶棄鈹戦敍鍕杭闁稿﹥鐗曠叅闊洦绋戠壕鍧楁⒒閸喓銆掗柡鍡畵閺岋綁寮崒妤佸珱闂佽桨绀佺粔鐢稿箞閵娿儺娼ㄩ柨鐔烘櫕濞戠數绮欑拠鎾呯悼閹叉挳宕熼鍡欑暰闂備胶绮崝锔界濠婂牊鏅搁柤鎭掑劤婢у灚顨ラ悙鏉戝闁靛牞缍佸畷姗�濡歌瀹曞爼姊洪悷鏉挎倯闁伙綆浜畷婵嗩吋婢跺﹦鏌ч梺褰掓？閻掞箓鎮″☉銏＄厱閻忕偘绠欓鍫熸櫢闁兼亽鍎虫晶閬嶆煥閻旇袚闁绘棏鍓熼獮蹇涙晸閿燂拷
		if (title.titleid > 0){
			final fire.pb.title.SOnTitle onTitle = new fire.pb.title.SOnTitle();
			onTitle.roleid = roleid;
			onTitle.titleid = title.titleid;
			onTitle.titlename = title.titlename;
			role.sendAround(onTitle);
		}
		else{
			final fire.pb.title.SOffTitle offTitle = new fire.pb.title.SOffTitle();
			offTitle.roleid = roleid;
			role.sendAround(offTitle);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 732897;

	public int getType() {
		return 732897;
	}

	public long roleid;
	public fire.msp.showtitleinfo title;

	public GNotifyTitle() {
		title = new fire.msp.showtitleinfo();
	}

	public GNotifyTitle(long _roleid_, fire.msp.showtitleinfo _title_) {
		this.roleid = _roleid_;
		this.title = _title_;
	}

	public final boolean _validator_() {
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(title);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		title.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyTitle) {
			GNotifyTitle _o_ = (GNotifyTitle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!title.equals(_o_.title)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += title.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(title).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


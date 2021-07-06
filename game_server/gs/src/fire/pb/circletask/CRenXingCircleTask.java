
package fire.pb.circletask;



import fire.pb.circletask.SpecialQuestState;
import fire.pb.fushi.FushiManager;
import fire.pb.npc.NpcServiceManager;
import fire.pb.npc.SNpcServiceMapping;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRenXingCircleTask__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRenXingCircleTask extends __CRenXingCircleTask__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		/*
		if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹婵＄偑鍊栭崝锕�顭块敓鐣岀磼椤旂厧顣崇紒杈ㄦ尰缁楃喐绻濋崘顭戜紦婵犵數濮伴崹鐓庘枖濞戙埄鏁勯柛鏇ㄥ幗瀹曟煡鏌涢埄鍐檨闁绘挸绻橀弻娑㈩敃閿濆洨鐣洪梺闈╃稻濡炰粙寮诲☉銏℃櫜闁告侗鍠涚涵锟界紓鍌欐祰妞村摜鏁敓鐘茬畺闁冲搫鎳忛ˉ鍫熺箾閹寸偛绗氶柣搴濆嵆濮婄粯鎷呴崨濠冨創闂佹椿鍓欓妶绋跨暦娴兼潙鍐�妞ゆ挾濮寸粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞Δ锝呭暞閳锋垿鏌熺粙鎸庢崳闁宠棄顦辩槐鎺撳緞婵犲嫮楔閻庢鍠栭…鐑藉极閹剧粯鍋愰柟缁樺笩閿熻棄鐏濋—鍐Χ閸℃ê鏆楁繝娈垮枤閸忔ê顕ｉ幎钘壩ч柛娑变簼閺傦拷婵＄偑鍊栧濠氬Υ鐎ｎ喖缁╃紓浣姑肩换鍡涙煟閹邦厼顥嬮柣顓熺懇閺屾洟宕遍弴鐙�妲柧缁樼墵閺屾稑鈽夐崡鐐寸亶濠电偛鎳岄崹钘夘潖閻戞ê顕辨繛鍡樺灥閸╁矂姊哄ú璇插闁靛牊鎮傞獮鍡楃暆閸曨偆顔掔紓鍌欑劍閿氶柨鐔烘櫕閺佸寮婚敐澶婎潊闁绘ê鍟块弳鍫熺箾鐎涙ê娈犻柛濠冪箞瀵鎮㈡搴㈡疂闂佸搫顦扮�笛傜昂濠碉紕鍋戦崐銈夊磻閸涱垱宕查柛顐犲劘閿熸垝绀佽灃濞达絽鎽滅粣鐐烘煟鎼搭垳绋婚柟绋跨埣瀹曟繈骞嬪┑鎰稁闂佹儳绻楅～澶婄暦婢舵劖鐓忓┑鐐茬仢閸旀粓鏌ｈ箛鎾搭棞闁宠鍨块崺銉╁幢濡炲墽鐩庨梺璇插閸戝綊宕板璺虹闁圭儤姊圭�氭氨锟界懓澹婇崰鏍箖閹寸偟绡�闁靛骏绲剧涵楣冩煥閺囶亞鐣甸柡浣哥Ч閹垽宕楃亸鏍ㄥ濠电偞鎸婚懝鎯洪妶鍡樻珷妞ゆ柨澧界壕鐓庮熆鐠轰警鐓柛銈囧枔缁辨帡顢欑喊杈╁悑闂佽鍠掗弲婵嬪箯閻樼粯鍤戞い鎺戭槸閺咃綁姊婚崒娆戭槮婵狅拷闁秴鐓曢柛顐犲劚閸屻劌螖閿濆懎鏆欓柛灞诲妽缁绘繃绻濋崒娑樻缂佹儳澧介弲顐︽晸閽樺鐣柛搴″船铻炴繛鎴炵懄濞呯娀鏌ｉ姀鐘冲暈闁绘挻鐩幃姗�鎮欓棃娑楀缂備緤鎷烽悗锝庡墾閹烽鎲撮崟顒傤槶闂佸憡顭嗛崶褏鍘撮梺纭呮彧缁犳垹绮诲☉娆嶄簻闁瑰墽顒茬槐锟犳煕閵夛絽濡烽柟鐤缁辨捇宕掑▎鎴濆闁藉啴浜堕幃妯跨疀閺囩儐鏆紓浣虹帛閻╊垶骞婇悩娲绘晢闁跨喍绮欏绋库槈濮樼偓瀚规繛鍫濈仢閺嬫稒銇勯銏℃暠濞ｅ洤锕獮鏍ㄦ媴閸濄儱骞愰梻浣侯焾閺堫剟鎯岄鎹愬С濞寸姴顑嗛埛鎺懨归敐鍕劅闁绘帡绠栭弻锟犲醇椤愩垹顫紓渚囧枟閻熲晠鐛�ｎ喗鏅滅紓浣股戝▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? by changhao
		{
			boolean ok = fire.pb.fushi.DayPayManager.getInstance().CheckDayPayWithLevel(roleid);
			if (ok == false)
			{
				FushiManager.logger.error("CRenXingCircleTask: 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊虹紒妯哄闁诲繑宀稿畷瀹狀槾缂佽鲸鎸婚幏鍛矙濞嗙偓娈洪梻浣侯焾椤戝啴宕愬┑鍡╁殨閻犲洦绁村Σ鍫ユ煏韫囨洖顫嶉柕濠忚礋娴滄粓鏌￠崘銊ワ拷鍝ユ暜閼哥偣浜滄い鎰枑濞呭洨绱掓潏銊﹀鞍缂佹鍠愮换婵嬪礃椤垳绱﹂梻鍌氬�风粈浣圭珶婵犲洤纾婚柛鈩冪☉缁愭鏌熼幑鎰【濠殿噮鍓熼弻銊╂偄閸撲胶鐓撳┑顔硷工椤嘲鐣烽幒鎴僵闁告鍎愰弶鍝ョ磽閸屾瑧顦︽い鎴濇閺侇噣鏁撻悩鍙夌�悗骞垮劚椤︻垳鐚惧澶嬬厱妞ゆ劑鍊曢弸鏃堟煕濮楋拷缁犳牕顫忓ú顏勪紶闁告洖鐏氭瓏婵犵數鍋涢ˇ鏉棵哄Ο鑲╃焿闁圭儤顨呴～鍛存煏閸繃顥犻柛姗嗕邯濮婅櫣鍖栭弴鐐测拤闂佹寧姘ㄧ槐鎺懳旀担鍝ョ懖闂侀潧娲ょ�氫即銆侀弴銏℃櫜闁搞儮鏅濋弶浠嬫⒒娴ｇ瓔鍤冮柛鐘愁殜閹兘鍩￠崨顐嫹娴ｈ倽鏃堝川椤旇姤顏熷┑鐐差嚟婵挳顢栭幇鏉挎瀬闁稿瞼鍋為悡鏇熴亜閹板墎绋荤紒锟介崘顔界厓闂佸灝顑呯粭鎺楁婢舵劖鐓ユ繝闈涙瀹告繈鏌熼挊澶婏拷鍧楀蓟濞戙垹围闁告侗鍘藉▓濠氭⒑閸濆嫭婀伴柣鈺婂灦楠炲啴鍩￠崨顓犵杸婵炶揪绲藉﹢閬嶅级瑜版帗鈷掑ù锝囩摂閸ゅ啴鏌涢悩鍐插摵鐎规洘顨呴～婊堟晸閽樺鏆︽繛宸簼閺呮悂鏌ｅΟ璇茬祷缂佹劖绋戦—鍐Χ閸℃ê鏆楁繝娈垮枤閸忔ê顕ｉ幎绛嬫晝闁挎棁袙閹风粯绻涙潏鍓хК婵炲拑绲块弫顔尖槈閵忥紕鍘遍梺闈浤涢崘銊ょ帛闂佹崘宕甸崑銈夊蓟濞戙垹鍗抽柕濞垮劚缁犺鈹戦埥鍡椾航闁搞劍濞婇獮澶愬箹娴ｅ摜鐫勯梺鍓插亝缁诲棝骞楅弴鐐╂斀闁绘劖娼欓悘宥夋煙閸愬弶鍠橀柡浣规崌瀵剟濡堕崶鈺傛婵°倗濮烽崑娑㈩敄閸涙潙鐓橀柟杈剧畱閻愬﹪鏌嶉悮瀛樺缂備緡鍠楀畝绋款潖婵犳艾纾兼繛鍡樺姉閵堟澘鈹戦悙宸Ч婵炶尙鍠庨悾閿嬪閺夋垹鐤�闂佸搫顦悘婵嬪吹閹寸偟绡�闁汇垽娼ф牎闂佽偐鎳撴晶鐣屽垝婵犳凹鏁嶉柣鎰嚟閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷");
				return;
			}
		}
		*/			
		
		SNpcServiceMapping conf = NpcServiceManager.getInstance().getServiceMappingByServiceID(serviceid);
		if(null == conf)
			return;
		final int userid = ((gnet.link.Dispatch) this.getContext()).userid;
		new RenXingCircleTaskProc(userid, roleid, conf.getParam1(), SpecialQuestState.DONE, moneytype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 807451;

	public int getType() {
		return 807451;
	}

	public int serviceid; // 该服务id
	public int moneytype; // 货币类型

	public CRenXingCircleTask() {
	}

	public CRenXingCircleTask(int _serviceid_, int _moneytype_) {
		this.serviceid = _serviceid_;
		this.moneytype = _moneytype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(serviceid);
		_os_.marshal(moneytype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		serviceid = _os_.unmarshal_int();
		moneytype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRenXingCircleTask) {
			CRenXingCircleTask _o_ = (CRenXingCircleTask)_o1_;
			if (serviceid != _o_.serviceid) return false;
			if (moneytype != _o_.moneytype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += serviceid;
		_h_ += moneytype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(serviceid).append(",");
		_sb_.append(moneytype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRenXingCircleTask _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = serviceid - _o_.serviceid;
		if (0 != _c_) return _c_;
		_c_ = moneytype - _o_.moneytype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


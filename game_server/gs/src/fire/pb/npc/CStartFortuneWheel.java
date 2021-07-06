
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CStartFortuneWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CStartFortuneWheel extends __CStartFortuneWheel__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.map.Npc npc = fire.pb.map.SceneNpcManager.selectNpcByKey(npckey);
		if (npc ==null){
			fire.log.LogManager.logger.info("npc is null.npckey:"+npckey);
			return;
		}
		// protocol handle
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄闁挎繂妫Λ鍕⒑閸濆嫷鍎庣紒鑸靛哺瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁诡垎鍐ｆ寖缂備緡鍣崹鎶藉箲閵忕姭妲堥柕蹇曞Х椤撴椽姊洪崫鍕灕闁归鍏橀弻娑㈠Χ閸涱垍褔鏌＄仦鍓ф创濠碉紕鍏橀、娆撴偂鎼存ɑ瀚介梻鍌欐祰濡椼劎绮堟担璇ユ椽顢橀姀鐘烘憰闂佸搫娴勭槐鏇㈡偪閿熶粙姊洪崫鍕窛闁稿鍋婃慨锟介柕鍫濇閸樹粙鏌熼崗鍏煎剹闁哥姵鐗犻悰顕�寮介鐔哄帗闁荤喐鐟ョ�氼剟鎮橀幘顔界厵妞ゆ梻鏅幊鍥╋拷瑙勬穿缁叉儳顕ラ崟顖氬耿婵☆垶妫跨花钘夆攽閻樺灚鏆╅柛瀣洴閹椽濡歌閸ㄦ繄锟藉箍鍎卞ú銈夊垂濠靛鐓欓柟瑙勫姦閸ゆ瑧绱掗悪锟介崹鍫曞蓟閻斿憡缍囧Δ锝呭暞椤庡秹姊虹粙娆惧剰閻庢凹鍓熼崺鐐哄箣閿曪拷绾惧吋鎱ㄥΟ鍝勬倯濡ゆ棃姊绘担鍛婃喐闁稿鍠栧顐ゆ嫚瀹割喗缍庡┑鐐叉▕娴滄粎绮堥崒鐐寸厱闊洦娲栫敮鍫曟煥閻旇袚闁告梹鐗滈幑銏犫槈濞嗘劕顎撻梺鍛婂姈瑜板啴顢旈鍫熺厱婵炲棗绻掔粻濠氭煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳剁划顖炲箰妤ｅ啫绐楅柡宥庡幖閽冪喖鏌￠崶銉ョ仼闂佸崬娲︾换婵嬫濞戝崬鍓鹃梺璺ㄥ枙婵倝銆冮崱娆愬床婵炴垯鍨瑰婵囥亜閹捐泛顫戠憸鏃堝蓟閳ュ磭鏆嗛悗锝庡墰閿涚喐绻涚�电顎撶紒鐘虫尭閻ｅ嘲顭ㄩ崱鈺傂梻浣告啞鐢鎯勯姘兼綎闁惧繒鎳撶�垫煡鏌￠崶鈺佹瀾闁绘繃妫冮弻锝嗘償閵忋埄鏆″┑鐘灪閿曘垽骞冮幆褏鏆嬮梺顓ㄩ檮瀵ゆ椽姊虹捄銊ユ瀺缂侇喗鐟ラ悾宄懊洪鍛闂佺粯顭堢亸娆撍囬妸鈺傗拺缂備焦锚婵箓鏌涙惔锝呭幋闁诡喗鐟╅幃婊兾熼柨瀣伜闂傚倷鑳堕…鍫ュ嫉椤掑嫭鍋＄憸鏂跨暦濠靛棭鍚嬮柛鈩冩礈缁犳岸姊虹紒妯哄婵炲吋鐟╅、姘煥閸涱垳锛滈梺绋挎湰濮樸劌鐡梻浣哥枃椤曆囨煀閿濆宓侀悗锝庝簴閺�浠嬫煕閳╁啰鎳侀柛鐘诧工閳规垿鎮╅崹顐ｆ瘎闂佺顑嗙粙鎴ｇ亱濠电偛妫欓幐鍝ョ不娴煎瓨鐓欓梻鍌氼嚟閸斿秹鎮楀顒佸殗闁哄矉缍佸顒勫垂椤旇棄锟筋垶姊虹紒妯诲蔼闁稿氦灏欓幑銏犫攽鐎ｎ偒妫冨┑鐐村灦閻熻京妲愰悙娴嬫斀闁炽儱鍟跨痪褔鏌熼鐓庯拷鍧楁偘椤曪拷瀹曞崬鈽夊▎蹇庣盎闂備胶顭堢换鎰版儍閻戣棄绠繛宸簼閳锋帡鏌涚仦鐐殤濠⒀勭☉閵嗘帒顫濋褎鐣堕柛妤呬憾閺屾盯顢曢敐鍡欘槰闂佺粯鎸诲ú鐔肩嵁閺嶃劍缍囬柛鎾楀啫鐓傞梻浣告啞閺屻劑顢栭崶鈺傤潟闁圭儤顨呯壕鍏肩箾閹寸儐鐒介柣鐔诲皺缁辨挻鎷呴懞銉ｏ拷鍐磼椤旂晫鎳冮柣锝囧厴婵℃悂鏁傞崜褜鍟庨梻浣虹帛閸旓箓宕滃▎鎿冩晜鐟滅増甯楅埛鎺楁煕鐏炴崘澹橀柨鐔诲Г閹倸鐣烽幇鏉跨濞达絿鎳撴禍杈ㄧ節閻㈤潧孝閻庢凹鍣ｉ幆灞解枎閹惧鍘甸梺缁樺灦閿曗晛鈻撻弮鍌滅＜闁绘灏欑粔娲煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙閻涱喖螣閼测晝锛滈梺缁橆焾瀹曠敻鎮惧ú顏呯厵妞ゆ棁鍋愮粔铏癸拷瑙勬礀閻栫厧鐣烽幆閭︽Ъ闂侀潻绲肩划娆撳蓟閿熺姴骞㈡繛鍡楄閵徛颁簻妞ゅ繐瀚弳锝呪攽闄囬崺鏍箚閺冨牆鐏崇�规洖娴傞崯鍥р攽閻樺灚鏆╅柛瀣☉铻ｅ┑鐘叉搐閻鏌涢幇闈涙灈鏉╂繃绻涢幘瀵稿暡闁圭兘顥撻敓鑺ヮ問閸ｎ噣宕抽敐鍛殾闁绘挸绨堕弨浠嬫倵閿濆簼绨奸柡鍡╀簻閳规垿鏁嶉崟顐℃澀闂佺锕ラ悧鐘茬暦濠靛妲鹃悗鍨緲閿曨亪鐛崱姘兼Х闂佸搫顑呯粔鍫曟晸閻ｅ本顏熼柟椋庡厴閺屾盯寮撮妸銉ュ箣闂佸綊顥撶划顖滄崲濞戞瑦缍囬柛鎾楀喚鍤ら梺鑽ゅ閹风兘鏌ㄩ弴鐐诧拷褰掑磹閸啣鏃堟晲閸涱厽娈查梺缁樻尰閻╊垶寮诲☉銏╂晝妞ゆ劦婢�缁ㄧ粯绻濋埛锟介崟顐缂備浇椴哥敮锟犮�佸▎鎾村仼閻忕偞鍎冲▍姘繆閵堝洤啸闁稿鍋ら垾锕傚炊閳哄偆娼熼梺鍦劋閸わ箓鎮㈤搹鍦紲濠碘槅鍨抽崢褍顕欏ú顏呪拻闁稿本鑹鹃敓钘夊槻闇夐柛銉戯拷閺嬫牠鏌￠崶銉ョ仼闂傚偆鍨堕弻銊╁即閻愯鎷烽崫銉т笉妞ゆ牜鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
		new PReqFortuneWheel(roleid, npckey,npc.getNpcID(),true,fire.pb.npc.NpcServices.FORTUNE_WHEEL).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795494;

	public int getType() {
		return 795494;
	}

	public long npckey; // 正在交互的Npckey

	public CStartFortuneWheel() {
	}

	public CStartFortuneWheel(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CStartFortuneWheel) {
			CStartFortuneWheel _o_ = (CStartFortuneWheel)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CStartFortuneWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


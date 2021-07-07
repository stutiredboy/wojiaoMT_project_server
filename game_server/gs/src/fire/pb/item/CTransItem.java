package fire.pb.item;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTransItem__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTransItem extends __CTransItem__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (srcpackid == BagTypes.DEPOT || dstpackid == BagTypes.DEPOT) {
			if (!Depot.useDepotCheck(roleId, npcid))
				return;
		}

		if (!checkMove(roleId))
			return;

		if (dstpackid == BagTypes.BAG)
			page = -1; // 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹闂備線娼ц噹闁告侗鍨扮敮搴ㄦ⒒閸屾瑧鍔嶉柟顔肩埣瀹曟繂顓奸崶銊ュ簥闂佸憡娲﹂崹閬嶅疾閹间焦鐓㈡俊顖欒濡叉椽鏌ｉ敐搴″籍闁哄本绋掗幆鏃堝Ω閵堝棗鏋ゆ俊銈囧Х閸嬫稓鎹㈤幒妤佹櫢闁哄倶鍊楃粔鐢告煕閻樻剚娈滅�规洘鍨垮畷鐔碱敍濞戞艾骞堥梻浣规灱閺呮盯宕㈡ィ鍐╁殐闁冲搫鍊告惔濠囨⒑缁洖澧查懣褍霉濠婂嫮鐭掗柡灞革拷鎰佸悑闁告劑鍔岄‖瀣⒑濞茶骞栭柨鏇ㄤ邯瀵鏁愭径濞⑩晠鏌ㄩ弴顏呭闂佽绻戦幐鎶藉蓟閿涘嫪娌悹鍥嚋閹峰嘲鈹戠�ｎ亞鐣洪悷婊勬煥閻ｇ兘鎮℃惔妯绘杸闂佸綊鍋婇崜姘舵偪閸岀偞鈷掗柛灞剧懅缁愭梹绻涙担鍐插幘濞差亜围闁搞儵鏀辩�氳鎱ㄥΟ鐓庡付闁诲骏绲跨槐鎺楊敊濞嗘儳娈梺瀹犳椤﹀灚鎱ㄩ敓浠嬫煟濡椿鍟忛柛鐔奉儔濮婃椽鎳￠妶鍛咁剚淇婂鐓庡闁瑰嘲鍟撮弫鍐磼濮橀亶鐛撻梻浣哥秺濡潡鎮為敃鍌氱厱闁圭儤鍤氳ぐ鎺撴櫜闁割偒鍋呯紞鍫ユ⒑缁嬫鍎戝┑鐑囨嫹闂佸搫鏈粙鎺旀崲濠靛绀冮柍鍝勫枤濡插爼姊绘担鑺ョ《闁哥姵娲橀幈銊╁Χ婢跺鍓瑰銈嗘穿閹烽锟借娲╃换婵嬬嵁鎼淬劍鍋╅悘鐐垫櫕閵堬箓姊绘担鍛婂暈闁告棑绠撻幃锟犲醇濠垫劗鍔烽梺闈浥堥弲婊堟偂閵夆晜鐓熼柡鍌氱仢椤ｆ娊鏌ｉ鐔烘噭妞ゃ劊鍎甸幃娆撳箵閹烘挻顔勯梻浣哥枃椤曆囨煀閿濆宓佹慨妤嬫嫹鐎殿喖鐖奸獮瀣倷閸偅绶┑鐘垫暩婵兘寮幖浣哥；婵炴垯鍨洪崑瀣攽閻樻彃顏甸柟鐑筋棑缁厼鈽夊Ο鑽ゃ�楁繝銏ｆ硾椤戝懐娆㈤悙鐑樼厵闂侇叏绠戦獮鎰版煙妞嬪海甯涚紒缁樼♁濞煎繘宕滆琚︽俊鐐�戦崕鏌ュ箰閼姐倗鐭欏鑸靛姈閸ゆ垶銇勯幒鎴濓拷濠氭晬濠婂牊鈷戠紓浣光棨椤忓牆鐤柛顭戝晹瑜版帩鏁婇柟鎯ф噺鐎氬綊鎮峰▎蹇擃仾缂侊拷閸愨晙绻嗛柣鎰煐椤ュ銇勯弴顏嗙ɑ缂佸倹甯為敓鏂ょ到閻忔岸寮插┑瀣拺闁圭娴风粻鎾绘煙閸愬弶鎹ｉ柤娲憾婵＄兘鏁傞崜褏妲囬梻浣圭湽閸ㄨ棄顭囪缁傛帡鏁冮崒娑氬幈闂侀潧顭堥崕鎶藉春閿濆鐓欐い鏍ㄦ皑閻掑憡銇勯姀锛勬噮濞存粍鎮傚浠嬪Ω瑜嶅顔尖攽閿涘嫬浜奸柛濠冩礈閹广垽骞囬鈺傜☉閳藉顫濋澶嬵棥濠电娀娼ч崐鎼佸箟閿熺姴纾归柣銏犳啞閻撱儲绻濋棃娑欘棤闁告垵婀辩槐鎺楀Ω閵婏富妫勯梻鍥ь樀閺岋絽顫滈崱妤佺亪闂佽绻戦悡锟犲蓟閿涘嫪娌柣锝呯潡閵忋倖鐓熼柨婵嗙箳缁★拷闂佸搫鑻ú顓㈠极閸岀偛鐭楁い鎰靛墰閻ｅ灚鎱ㄦ繝鍛仩闁跨喕妫勫﹢杈ㄥ垔椤撶儐鐒介柟鎵閻撴洟鏌曟繛鍨姕闁稿鍎查〃銉╂倷閹绘帗娈诲銈冨灪濡啫鐣烽悡搴樻斀闁糕剝鐟у畷鍝勨攽閿涘嫬浜奸柛濠冪墪椤繑绻濆顒傚幈闂佸壊鍋嗛崰搴敋闁秵鐓欓柟顖嗗苯娈剁紓浣叉閹风兘姊绘担鍦菇闁搞劏妫勯…鍥槼缂佸倹甯￠弫鍐磼濞戞艾骞堥梻渚�娼ч…鍫ュ礉瀹ュ洦鍏滈柣鎰靛厵娴滄粍銇勯幇鈺佺伄缂佺姾灏欑槐鎺旂磼濡偐鐣靛銈庡亝缁诲牓銆佸锟介幃娆撴偋閸繄鍘卞┑鐘垫暩婵兘寮幖浣哥；闁绘劕鎼粻鎵磼鐎ｎ偒鍎ラ柣鎺嶇矙閺岀喖鎮滃鍡樼暦闂佹娊鏀辩敮锟犲蓟濞戞矮娌柟瑙勫姇椤ユ繈姊虹捄銊ユ灆濠殿喓鍊濋獮鍐磼濮樿鲸娈鹃梺瑙勫婢ф宕愭繝姘厾闁诡厽甯掗崝姘舵煥閻旂粯顥夋繛纭风節瀵濡搁埡浣稿祮闂佺粯鍔橀婊堝箯閻ゎ垬浜归柟鐑樺灩閿涚喖姊洪悷閭﹀殶濠殿喚鏁诲畷浼村箛閻楀牏鍘藉┑掳鍊ч幏鐑芥煟濡わ拷濡稓鍒掗銏犵闁哄啫鍊婚敍婊堟⒑鐠恒劌鏋欏┑顔哄�曢銉╁礋椤愩倖娈曢柣搴秵閸嬪嫰顢旈崼鏇熲拺閻犲楠搁崯顖炲疮閻愮儤鍊垫慨姗嗗墰缁夌儤鎱ㄦ繝鍛仩闁圭懓瀚版俊鎼佸Ψ閿旀拝鎷烽搹鍦＝濞撴艾娲ら弸鐔兼煟閻斿弶娅呮い鏇秮椤㈡洟鏁冮敓鐣岀不閼姐倗纾藉ù锝咁潠椤忓嫧鏋旈柣鏂垮悑閳锋垿姊婚崼鐔剁繁婵℃彃鐖奸弻娑欐償閳ュ疇鍩為悶姘懇閺屾盯顢曢悩鎻掑闂佹娊鏀遍崹鍧楀蓟濞戞ǚ妲堟慨妤�鐗嗘慨娑㈡⒑閻熸澘鏆遍柛鐔告尦瀵鈽夐姀鈥充簻婵＄偛顑呯�涒晠骞夐崗鑲╃闁挎繂鎳忛幖鎰版煥閺囥劋閭柣娑卞枛椤粓鏁撴禒瀣拷浣糕枎閹炬潙浜楅柟鑹版彧缁插灝鐣峰ú顏呪拻闁稿本鑹鹃敓浠嬵棑濞嗐垽鏁撻悩鑼厬闂婎偄娲︾粙鎺楀煕閺冨牊鐓曢柡鍥ュ妼閻忕娀鏌ｉ幘瀵哥畵妞ゎ叀娉曢幑鍕惞閸︻厺绱樼紓浣瑰劤瑜扮偟鍒掑▎鎾宠摕婵炴垶鐭▽顏堟煕閹炬瀚▍娆撴⒒娴ｄ警鐒剧紒缁樺姍閹崇喖顢涢悙鑼幋闂佺鎻�靛矂寮繝鍥ㄧ厽闁逛即娼ф晶顖涙叏閿濆懐澧︽慨濠呮閹风娀鍨惧畷鍥﹀摋闂佽瀛╅惌顕�宕￠幎钘壩ュù锝囩《濡插牊鎱ㄥΔ锟藉Λ娆撳磽閻㈠憡鐓涘璺猴功婢ф垿鏌涢弬璺ㄐфい銏＄懇瀵挳鎮㈤搹鍦闁诲骸鍚�閸楁娊寮ㄩ崡鐑嗙唵婵鎷烽柡浣规崌閹崇偤濡烽敂缁㈡Ч婵°倗濮烽崑娑㈡晝閵夆晛绠氶柡鍐ㄧ墕椤懘鏌ｅ▎娆愬闂佹悶鍊戦崐婵嗩潖閾忓湱纾兼慨妤�妫涢崝椋庣磽娓氬洤娅橀柛銊ョ埣楠炲啴妾辩紒鐘崇洴楠炴瑩宕橀鍕毄闂備浇宕垫繛锟界紓鍌涜壘閳诲秹鏁愰崱妯荤彿闂佸搫娲㈤崹娲偂閺囥垺鐓涢柛鎰鐎氬湱绱撴笟鍥ф灈缂佸鐖奸獮鎴﹀閻橆偅顫嶉梺闈涚箳婵敻濡靛┑瀣拺闁告稑锕ゆ慨锟介梺鍝勬噺閻╊垶銆侀弮鍫熸櫢闁跨噦鎷�
		new PMoveItemProc(roleId, srckey, number, srcpackid, dstpackid, dstpos,
				page).submit();
	}

	private boolean checkMove(final long roleId) {
		if (srcpackid == BagTypes.QUEST) {
			if (dstpackid != BagTypes.QUEST)
				return false;
		} else {
			if (srcpackid != BagTypes.BAG && srcpackid != BagTypes.DEPOT
					&& srcpackid != BagTypes.TEMP) {
				return false;
			}
			if (dstpackid != BagTypes.BAG && dstpackid != BagTypes.DEPOT) {
				return false;
			}
		}
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787447;

	public int getType() {
		return 787447;
	}

	public int srcpackid;
	public int srckey;
	public int number;
	public int dstpackid;
	public int dstpos;
	public int page;
	public long npcid;

	public CTransItem() {
		npcid = -1;
	}

	public CTransItem(int _srcpackid_, int _srckey_, int _number_, int _dstpackid_, int _dstpos_, int _page_, long _npcid_) {
		this.srcpackid = _srcpackid_;
		this.srckey = _srckey_;
		this.number = _number_;
		this.dstpackid = _dstpackid_;
		this.dstpos = _dstpos_;
		this.page = _page_;
		this.npcid = _npcid_;
	}

	public final boolean _validator_() {
		if (srcpackid < 1) return false;
		if (srckey < 1) return false;
		if (number < -1) return false;
		if (dstpackid < 1) return false;
		if (dstpos < -1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(srcpackid);
		_os_.marshal(srckey);
		_os_.marshal(number);
		_os_.marshal(dstpackid);
		_os_.marshal(dstpos);
		_os_.marshal(page);
		_os_.marshal(npcid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		srcpackid = _os_.unmarshal_int();
		srckey = _os_.unmarshal_int();
		number = _os_.unmarshal_int();
		dstpackid = _os_.unmarshal_int();
		dstpos = _os_.unmarshal_int();
		page = _os_.unmarshal_int();
		npcid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTransItem) {
			CTransItem _o_ = (CTransItem)_o1_;
			if (srcpackid != _o_.srcpackid) return false;
			if (srckey != _o_.srckey) return false;
			if (number != _o_.number) return false;
			if (dstpackid != _o_.dstpackid) return false;
			if (dstpos != _o_.dstpos) return false;
			if (page != _o_.page) return false;
			if (npcid != _o_.npcid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += srcpackid;
		_h_ += srckey;
		_h_ += number;
		_h_ += dstpackid;
		_h_ += dstpos;
		_h_ += page;
		_h_ += (int)npcid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(srcpackid).append(",");
		_sb_.append(srckey).append(",");
		_sb_.append(number).append(",");
		_sb_.append(dstpackid).append(",");
		_sb_.append(dstpos).append(",");
		_sb_.append(page).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTransItem _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = srcpackid - _o_.srcpackid;
		if (0 != _c_) return _c_;
		_c_ = srckey - _o_.srckey;
		if (0 != _c_) return _c_;
		_c_ = number - _o_.number;
		if (0 != _c_) return _c_;
		_c_ = dstpackid - _o_.dstpackid;
		if (0 != _c_) return _c_;
		_c_ = dstpos - _o_.dstpos;
		if (0 != _c_) return _c_;
		_c_ = page - _o_.page;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npcid - _o_.npcid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

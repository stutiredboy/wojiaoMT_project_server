
package fire.msp.npc;
import java.util.Map;

import fire.pb.scene.DynamicScene;
import fire.pb.scene.SceneManager;

import fire.pb.scene.movable.NPC;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCountNpcSize__ extends mkio.Protocol { }

/** 统计动态场景里npc的数量
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCountNpcSize extends __GCountNpcSize__ {
	@Override
	protected void process() {
		// protocol handle
		DynamicScene ds = SceneManager.getInstance().getSceneByMapAndOwner(mapid, ownerid);
		if (ds == null) {
			SceneManager.logger.error(new StringBuilder().append("缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欓崝銈囩磽瀹ュ拑韬�殿喖顭烽弫鎰緞婵犲嫷鍚呴梻浣瑰缁诲倿骞夊☉銏犵缂備焦顭囬崢閬嶆⒑闂堟稓澧曢柟鍐查叄椤㈡棃顢橀姀锛勫幐闁诲繒鍋涙晶钘壝虹�涙ǜ浜滈柕蹇婂墲缁�瀣煛娴ｇ懓濮嶇�规洖宕埢搴∥熼幁宥嗘皑缁辨捇宕掑顒婃嫹閻戣姤鍊块柨鏇炲�哥粈澶愭煛瀹ュ骸骞戦柨鐔绘閸燁垳鎹㈠┑瀣倞鐟滄垿骞楅弴銏♀拺閻犳亽鍔岄弸鏂库攽椤旇姤灏﹂柟顔界懄缁绘繈宕堕妸褍甯惧┑鐘灱濞夋盯鎮ч崱娑樼闁靛牆顦伴悡鏇㈡煛閸愭寧瀚归梺鍦焾閸熷潡锝炶箛娑欏�绘俊顖濐嚙椤繝姊虹憴鍕靛晱闁革綆鍠栧嵄妞ゆ柨鐨烽弨浠嬫煟閹邦剙绾ч柍缁樻礋閺屾稑鈻庤箛鎾存濡炪倖娲╃徊鍓ф崲濠靛棭娼╂い鎾跺仒缁ㄥ姊绘担渚劸缂佺粯鍔欓幆鍐倻閽樺顔嗘繝鐢靛У绾板秹鎮￠悢鐓庣婵烇綆鍓欐俊鑺ョ箾閹冲嘲鍠氶悢鍡涙煟閻斿嘲绨荤�规悶鍎靛畷鈩冩綇閵婏絼绨婚梺鍝勫�搁悘婵嬪煕閺冨倻妫柟瑙勫姈椤ュ鏌曢崱妯虹瑨妞ゎ偅绻堥、妤佺節閸愨晜姣庨梻浣筋嚙鐎涒晜绌卞ú顏庣稏濠㈣泛鏈畷鍙夌節闂堟侗鍎忔い顐㈡嚇閺屻劌鈹戦崱妯烘闂佸憡锕╅崑濠傤潖濞差亜宸濆┑鐘插暊閹峰綊姊虹紒姗嗘畼濠电儑鎷峰Δ鐘靛仜閸熸潙顬婃潏鈺冪＜闁绘ê纾ú瀛橆殽閻愯揪鑰挎い銏＄☉閳藉鈻庨幇顓犲竼闂傚倸鍊搁崐鐑芥嚄閸撲礁鍨濇い鏍亹閿熸枻绠撳畷濂革綖椤撶姴澧炬繝鐢靛仜濡瑩宕圭憴鍕枖鐎广儱顦伴悡娑㈡倶閻愰鍤欓柛鏃�绮撻弻娑欑節閸屾粈绮甸梺閫涚┒閸斿矁鐏掗梺缁樻尭缁ㄥ吋绔熼弴銏＄厽閹兼番鍨婚崯鏌ユ煙閸戙倖瀚�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐鍛傜喎鈻庨幆褎顔勭紓鍌欒兌婵挳鎮樺璺何﹂柛鏇ㄥ枤閻わ拷闂佸湱鍋撻幆灞轿涢悙鐢电＝濞达絿鏅崼顏堟煕婵犲啯绀嬫繝锟芥笟锟藉铏圭磼濡浚浜滆灒濠电姴娲ょ壕鍧楃叓閸ャ劍绀堢痪鎯с偢閺岋絽顫滈敓钘夘焽瑜斿绋库槈閵忥紕鍘搁柣蹇曞仩椤曆勪繆婵傚憡鐓冮柦妯侯樈濡叉悂鎽堕敐鍛拷鎺戭潩閻撳海浠х紓浣介哺閹告悂鍩為幋锔藉亹闁归绀侀弲閬嶆⒑閸濄儱校缂佸鍨块崺銏狀吋婢跺﹤宓嗛梺闈涚箳婵兘鎮块崟顖涒拺闂傚牊渚楅悞楣冩煕鎼淬垻鎳囬柟顔哄灲閹剝鎯旈敍鍕舵嫹椤撶儐娓婚柕鍫濇閳锋劙鏌涙惔锛勶紞闁轰緡鍣ｅ畷绋课旀担鍙夊濠电偠鎻紞锟芥繛鍜冪悼閺侇喖鈽夐姀锛勫幍缂備礁顑嗛娆撴偂婵傚憡鐓欐い鏍ㄨ壘椤忣厽銇勯姀锛勬创闁诡喗鐟╅幊鐘绘嚋閸偄鏆繝鐢靛Х閺佹悂宕戦悙鍝勫瀭闁诡垱婢樼紞鏃�绻濈喊妯哄⒉鐟滄澘鍟撮幃褔骞樼拠鑼舵憰濠电偞鍨堕…鍌炲籍閸繄顦ㄩ梺闈涱焾閸婃牠宕哄☉妯锋斀闁绘劕妯婇崵鐔封攽椤栵絽寮�规洩缍佸畷姗�鈥﹂幋鐐电▉婵犵數鍋涘Ο濠冪濠婂懐涓嶅ù鍏兼綑缁犲綊寮堕崼婵嗏挃鐎癸拷濞戞瑤绻嗗ǎ鍥у船婵倹鎱ㄦ繝鍐┿仢闁诡噮鍠氶敓鑺ョ♁閿氭い蹇撳缁辨捇宕掑▎鎴М閻庢鍠涘▔娑㈡偩濠靛牏鐭欐繛鍡欏亾缂嶅孩绻濋悽闈浶ｉ柤鐟板⒔婢规洟宕楅崗鐓庡伎濠殿喗顨呭Λ妤佹櫠妤ｅ啯鐓欑�瑰嫭婢樺Σ濠氭煟閿濆繒绡�妤犵偛锕ョ换婵嬪磼濠婂憛銊╂倵鐟欏嫭绀冮柛搴°偢绡撳ù锝呮贡缁犻箖鎮楀☉娆樼劷濠⒀呮暬閺岋紕浠﹂悙顒傤槰缂備胶绮惄顖氱暦瑜版帩鏁婇柣鎾冲珐閵堝棛绡�闁汇垽娼ф禒锕傛煙閸涘﹥鍊愰柍銉畵閹粓鎸婃径搴㈡啺闂備胶绮弻銊╁触鐎ｎ喖纾圭紓浣股戦崣蹇斾繆閵堝繑瀚瑰┑鈽嗗亝閻熲晠骞冩ィ鍐ㄧ濞达綀娅ｉ敍婊呯磽閸屾瑩妾烽柛銊ф嚀椤曪綁宕稿Δ浣哄幍婵＄偛顑呮鎼佸储鐎涙ɑ鍙忓┑鐘插鐢盯鏌熷畡鐗堝櫧缂侇喚鏁搁敓鏂ょ秵閸嬪棛绮旈悜鑺モ拻濞达絼璀﹂悞鐐箾鐎电鍘寸�规洏鍨奸ˇ鍫曟煟韫囨搩鍎旀慨濠冩そ瀹曘劍绻濋崘顭戞П闂備焦鎮堕崝鎴炵閸洖鏄ユ繛鎴欏灩缁犳娊鏌熼幆褍缍佺紒銊ヮ煼濮婃椽宕崟顓涙瀱闂佺顑呯�氼厾绮嬮幒妤佹櫇闁稿本绋撻崢浠嬫⒑鐟欏嫬鍔ょ�规洦鍓熷畷婵嬫晝閸屾稓鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ闁诲孩顔栭崰妤呭箰閹惰棄绠栨繛鍡樺灦鐎氭氨鎲告惔锝忔嫹濮橆剛绉洪柡灞剧洴閺佸倻鎷犻幓鎺嶇礋闂備胶鎳撻崲鏌ュ床閺屻儻缍栨繝闈涱儐閸婇攱銇勯幒鐐村濡炪倕楠忛幏锟�:")
					.append(",ownerid:").append(ownerid)
					.append(",mapid:").append(mapid));
			return;
		}
		
		Map<Long, NPC> npcs = ds.getSceneNpcs();
		final int npcsize = npcs.size();
		if (npcsize == 0) {
			MCountNpcSize countnpcsize = new MCountNpcSize();
			countnpcsize.ownerid = ownerid;
			countnpcsize.saveid = saveid;
			countnpcsize.npcnum = npcsize;
			
			fire.pb.scene.SceneClient.pSend(countnpcsize);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730441;

	public int getType() {
		return 730441;
	}

	public long ownerid;
	public int mapid;
	public int saveid;

	public GCountNpcSize() {
	}

	public GCountNpcSize(long _ownerid_, int _mapid_, int _saveid_) {
		this.ownerid = _ownerid_;
		this.mapid = _mapid_;
		this.saveid = _saveid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(ownerid);
		_os_.marshal(mapid);
		_os_.marshal(saveid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		ownerid = _os_.unmarshal_long();
		mapid = _os_.unmarshal_int();
		saveid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCountNpcSize) {
			GCountNpcSize _o_ = (GCountNpcSize)_o1_;
			if (ownerid != _o_.ownerid) return false;
			if (mapid != _o_.mapid) return false;
			if (saveid != _o_.saveid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)ownerid;
		_h_ += mapid;
		_h_ += saveid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(ownerid).append(",");
		_sb_.append(mapid).append(",");
		_sb_.append(saveid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GCountNpcSize _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(ownerid - _o_.ownerid);
		if (0 != _c_) return _c_;
		_c_ = mapid - _o_.mapid;
		if (0 != _c_) return _c_;
		_c_ = saveid - _o_.saveid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


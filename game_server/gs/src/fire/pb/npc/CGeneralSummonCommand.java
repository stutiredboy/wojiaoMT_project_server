
package fire.pb.npc;
import fire.pb.activity.winner.PWinnerCallPlayer;
import fire.pb.move.SRoleEnterScene;
import fire.pb.npc.TransmitTypes;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGeneralSummonCommand__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGeneralSummonCommand extends __CGeneralSummonCommand__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柍鈺佸暞閻濇牠姊绘担鑺ョ《闁哥姵鎹囧鏌ヮ敃閵堝懎鐏婃繝鐢靛У绾板秹宕戦幇鐗堝仯闁搞儺浜滈惃鐑樸亜閺冿拷閸旀洟鍩為幋锔藉�婚柛銉㈡櫇鏍￠梻浣告啞閹稿鎮烽敂鐣屸攳濠电姴娲﹂崵鍐煃閸濆嫬鏆熼柨娑欑矒濮婅櫣绱掑Ο蹇氬亹閹峰啴鏁冮敓浠嬧�﹂崶顒�绠涢柣妤�鐗忛崢顏堟⒑閹肩偛鍔�闁告劕褰炵槐鏃�淇婇妶鍥ラ柛瀣☉鐓ゆい鎾跺仧閺嗭附绻濇繝鍌氼仾濠殿垱鎸抽弻銈嗙鐎ｎ偅鏆犻梺鎼炲妼閻忔繈锝炶箛鎾佹椽顢旈崟顐ょ崺濠电姷鏁告慨瀵革拷姘煎弮瀹曞疇顦寸紒杈ㄦ尰閹峰懘鎼归悷鎵偧闂備焦瀵уú蹇涘垂娴犲宓侀柛鎰靛枟閺呮悂鏌ｅ▎娆愬闂佽桨绀侀崯鎾蓟閵娾晛鍗虫い蹇撴噹椤忓爼姊绘担铏瑰笡闁告梹娲熼弫鍐敂閸繆鎽曢梺鍝勬川閸犳挾寮ч敓浠嬫椤愩垺澶勯柟灏栨櫅鐓ゆい鎾跺剱濞撳鏌曢崼婵堢缂侊拷鐎ｎ喗鐓曢柡鍐挎嫹闁搞劌鐏濋锝嗙節濮橆厽娅滈梺绯曞墲閿氶柛鏂挎嚇濮婃椽妫冨☉姘辩杽闂佺硶鏅涚�氭澘顕ｉ幎鑺ユ櫢闁绘ê鍟块敓鐣屾暬閺岋綀顦查柟璇х磿閿熻姤鑹剧紞濠傤潖妤﹁￥浜归柟鐑樻惈缁辩數绱撴笟濠冨婵炴挻鐔幏鐑芥煙闁垮鐏撮柟顔哄灲瀹曟鎳栭埡浣告辈闂傚倷鑳剁划顖炲蓟閵娾晛绠规い鎰╁灮閹姐儵姊婚崒娆掑厡缂侇噮鍨跺畷婵嬪即閵忊剝娅囧銈呯箰閻楀棝鎷戦悢鐚存嫹楠炲灝鍔氭俊顐ｇ懄閹便劌顭ㄩ崼鐔哄幍濠电偛鐗嗛悘婵嬪几閻斿吋鐓曢悗锝嗘煥濞诧箓鍩涢幋锔解拻闁割偆鍠嶇欢杈ㄤ繆閸欏灏﹂柡宀嬬節瀹曘劑顢欓崜褏鍘滈梻浣筋嚃閸ｎ垳鎹㈠┑瀣畺闁靛繈鍊曠粻褰掓煟閹邦厼顥嬮柣鈺侀叄濮婄粯鎷呯粵瀣秷閻庤娲橀敋闁崇粯鏌ㄩ埥澶愬閻樻妲堕梻浣筋潐閸庡吋鎱ㄩ妶澹﹀绻濋崘锔跨盎闂佸湱鍎ら崺鍫澪ｇ粙娆剧唵鐟滃酣骞愰幎钘夎摕闁挎稑瀚▽顏堟⒒閸碍娅嗛悗姘贡閿熷�燁潐濞叉牕煤閿曪拷閳绘捇寮撮姀鈾�鎷洪柣鐘充航閸斿矂寮稿鍥╃＜妞ゆ梻鏅幊鍐煟閿濆洤鍘撮柟顔ㄥ洤閱囬柣鏂垮槻婵℃娊姊绘笟锟藉褔鈥﹂鐘典笉闁瑰鍋熼々宄扳攽閸屾碍鍟為柍閿嬪灴閹綊骞侀幒鎴濐瀳闂佸搫顑嗛弻銊╁煘閹达富鏁婇柣鎰靛墯濮ｅ牓姊虹拠鈥虫灓闁稿鍋熺划瀣箳閺冩挻瀚归柨婵嗛娴滅偤鏌涘▎蹇旑棦婵﹥妞藉畷顐﹀礋椤愵剚瀚归柟闂寸劍閸婅埖绻濋棃娑欙紞闁搞倕鐗婄换娑橆啅椤旇崵鍑归梺缁樻尭缁绘劙鈥︾捄銊﹀磯闁惧繒鎳撻。娲⒑閸涘﹥鈷愭い銊ワ躬瀵鏁撻悩铏婵炲濮撮鍡涘吹瀹ュ鐓忓鑸电〒鐎佃偐绱掗妸銉吋婵﹥妞藉畷顐﹀礋椤愶絾顔勯梻浣侯焾閿曘倝骞夐敍鍕焿鐎广儱顦伴崐閿嬨亜閹存繂缍栫紒銊ヮ煼濡懘顢曢姀鈥愁槱濠电偛寮堕悧鐘差嚕缁嬪簱妲堥柕蹇ョ磿閸樻悂鎮楅惂鍛婂闂佽法鍠嶇划娆忕暦娴兼潙鍐�鐟滃繘寮抽敂鐣岀闁糕剝蓱鐏忣參宕堕幘顔解拺缂侇垱娲栨晶鍙夈亜閵娿儳绠查悗闈涖偢閺佹捇鏁撻敓锟�
		if (summontype == TransmitTypes.impexamsystem)
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞诲�楅崰濠囧础閻愭祴鎷绘繝纰樺墲閻擄繝寮ㄦ潏鈺傚床婵犻潧妫崵妤呮⒑閸噮鍎愮紒鑸电叀閺屻劑鎮㈢拠娈嬫捇鏌熼悷鐗堝枠妤犵偛鍟撮幃娆撴倻濡粯鐝栭梻浣侯焾閺堫剙顫濋妸鈺傚亗闁硅揪闄勯ˉ濠冦亜閹扳晛鐏璺哄缁辨帞锟斤綆鍋勫ù顕�鏌熼鐧告嫹閺傘儲鐎婚梺鐟邦嚟婵兘鏁嶅┑鍥╃閺夊牆澧界粔顔界箾娴ｅ啿娲﹂崐鍫曟煃閸濆嫭鍣洪柣鎾寸洴閹鏁愭惔鈥茬敖濠电偛寮堕幐鎶藉蓟閳ュ磭鏆嗛悗锝庡墰琚﹀┑鐘茬棄閵堝懐鍘梺璇″灡濡啴宕洪崟顖氱妞ゅ繐鍟崰姘攽閻樺灚鏆╅柛搴㈠灩瀵板﹪鎸婃竟婵囨そ婵¤埖寰勭�ｎ偅鐝栨俊鐐�曠换鎰板箠瀹ュ洦宕查柛鈩冪♁閻撴洘銇勯幇鍓佺ɑ缂侊拷閿熶粙鎮楅悷鐗堝暈缂佽鍟存俊鐢稿礋椤栨氨顔掗柣鐘烘閸庛倝鎮楅幆褜娓婚柕鍫濇閻撱儲銇勯敃鍌涙锭妞ゎ偄绻橀幖鍦喆閸曨偆褰撮梻浣告贡缁垳鏁埡鍛濠㈣泛鐬肩壕濂告煟閹伴潧澧紒鎯板皺缁辨帗寰勭�ｎ偄鍞夐梺璇″枟閸庢娊鍩為幋鐙呮嫹閿濆簼绨芥い鏃�鍔栫换娑欐綇閸撗吷戦梺鐑╁墲濞茬喖鐛Δ鍛嵆闁靛繆妾ч幏娲煟閻樺厖鑸柛鏂跨焸瀵悂寮惔鎾存杸濡炪倖妫佹慨銈囦焊閿曞倹鐓欐い鏃傛櫕閹冲嫮绱掔紒妯肩疄鐎规洖鐖兼俊姝岊槻閻㈩垱顨婂娲传閸曞灚楔闂佺顑囬崑鐐电博閻旂厧骞㈡繛鎴烆焽閻ｇ儤绻濋棃娑橈拷鎼佸箟閿熺姵鍋傞煫鍥ㄧ〒閸欐捇鏌涢妷锝呭缂侊拷閿熶粙寮堕埡鍌滅疄闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍌滄殾闁硅揪绠戠粻娑㈡煟濡わ拷閻楀繘宕㈤崜褏纾奸柣鎰靛墯缁惰尙锟借娲﹂崜姘跺疾閸洖绾ч悹鍥╁亾濡啫顕ｉ锟藉畷濂告偄閸欏顏烘繝鐢靛仩閹活亞寰婃禒瀣疅闁跨喓濮寸粻姘舵煕椤愮姴鍔滈柣鎾跺枑閵囧嫰骞掗悙鏉戭伓闂備線娼ч悧蹇涒�﹂崼銉﹀仼闁绘垼濮ら崑瀣煕椤愩倕鏋庨柛鏂挎嚇濮婃椽妫冨☉杈╁彋缂備胶濮甸崹鍓佺矉閹烘挾闄勯柛娑樑堥幏娲煟閻樺厖鑸柛鏂跨焸瀵悂寮惔鎾存杸濡炪倖姊婚崑鎾诲汲椤掑嫭鐓欐い鏃�鍎虫禒锔剧磼閸屾稑绗ч柨鐔告灮缂嶅棝宕戦崱娑樼煑闁糕剝绋掗埛鎴︽煕濠靛棗顏╅柨鐔诲Г閹倿骞冨Ο琛℃斀闁糕檧鏅涘▓妯衡攽閻愬弶鈻曞ù婊勭箞閹ょ疀閹垮啰鍞甸柣鐘荤細濞咃絾鏅堕弴銏＄厱闁哄喛鎷锋い銊ワ躬瀵鏁撻悩铏婵炲濮撮鍡涘吹瀹ュ鐓忓鑸电〒鐎佃偐绱掗妸銉吋婵﹥妞藉畷顐﹀礋椤愶絾顔勯梻浣侯焾閿曘倝骞夐敍鍕焿鐎广儱顦伴崐閿嬨亜閹存繂缍栫紒銊ヮ煼濡懘顢曢姀鈥愁槱濠电偛寮堕悧鐘差嚕缁嬪簱妲堥柕蹇ョ磿閸樻悂鎮楅惂鍛婂闂佽法鍠嶇划娆忕暦娴兼潙鍐�鐟滃繘寮抽敂鐣岀闁糕剝蓱鐏忣參宕堕幘顔解拺缂侇垱娲栨晶鍙夈亜閵娿儳绠查悗闈涖偢閺佹捇鏁撻敓锟�
		if (summontype == TransmitTypes.winnercall && agree == 1) {
			new PWinnerCallPlayer(roleid).submit();
			return;
		}
		if (summontype == TransmitTypes.singlepvp && agree == 1) {
			fire.pb.battle.pvp1.PvP1Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
		if (summontype == TransmitTypes.pvp3 && agree == 1) {
			fire.pb.battle.pvp3.PvP3Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
		if (summontype == TransmitTypes.pvp5 && agree == 1) {
			fire.pb.battle.pvp5.PvP5Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795506;

	public int getType() {
		return 795506;
	}

	public int summontype; // 拉人类型 见TransmitTypes
	public long npckey; // npckey
	public int agree; // 1为同意，0为拒绝

	public CGeneralSummonCommand() {
	}

	public CGeneralSummonCommand(int _summontype_, long _npckey_, int _agree_) {
		this.summontype = _summontype_;
		this.npckey = _npckey_;
		this.agree = _agree_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(summontype);
		_os_.marshal(npckey);
		_os_.marshal(agree);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		summontype = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		agree = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGeneralSummonCommand) {
			CGeneralSummonCommand _o_ = (CGeneralSummonCommand)_o1_;
			if (summontype != _o_.summontype) return false;
			if (npckey != _o_.npckey) return false;
			if (agree != _o_.agree) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += summontype;
		_h_ += (int)npckey;
		_h_ += agree;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(summontype).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(agree).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGeneralSummonCommand _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = summontype - _o_.summontype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


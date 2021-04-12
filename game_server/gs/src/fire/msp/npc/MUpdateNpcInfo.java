
package fire.msp.npc;

import fire.pb.map.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MUpdateNpcInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class MUpdateNpcInfo extends __MUpdateNpcInfo__ {
	@Override
	protected void process() {
		// protocol handle

		new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				for (NpcInfo createinfo : npcs)
				{
					SceneNpcManager.getInstance().createAddNewNpc(createinfo);

				}

				// 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垶菤閺嬪酣鐓崶銊ょ繁闁跨喕濮ら〃鍡涘Φ閸曨垼鏁冮柕蹇嬪灮椤旀帡姊烘潪鎵妽闁圭懓娲顐﹀箻缂佹ɑ娅㈤梺璺ㄥ櫐閹凤拷?闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍蓟閸ヮ剚鏅濋柨鐔剁矙瀹曟繈骞掗幘鍓侇啎閻庣懓澹婇崰鏇犺姳閼姐倗纾奸柣娆忔噽缁夘噣鏌″畝瀣埌閾伙綁鏌涜箛鎾虫倯婵絽瀚板铏圭磼濡櫣鐟ㄩ梺鍛婅壘椤戝洭骞戦姀鐘婵炲棙鍔楃粔鍫曟⒑閸涘﹥瀵欓柛娑樻噺缁矂鍩為幋锔藉�烽梻鍫熺☉娴犳ê顪冮妶搴″箻闁稿繑锕㈤悰顔界節閸パ咁啋闁荤姴娲﹂悡锟犲极濠婂啠鏀介幒鎶藉磹閹剧粯鍤勯柛顐ｆ礀閸屻劑鏌﹀Ο渚Т闁猴拷閼恒儯浜滈柡鍐ㄥ�婚幗鍌炴煟閹烘挸鍔ら棁澶嬬節婵犲倿顎楀褜鍨崇槐鎺楀磼濮樻瘷銈囩磼鏉堚晛浠﹂柕鍫秮瀹曟﹢鍩為悙顒�顏洪梻鍌欒兌椤牓寮甸鍕殞濡わ絽鍟弲绋棵归悩宸剾婵☆偅鍨圭槐鎺楊敊閼测晛顤�缂備焦顨堥崰鏍极閹惧顩烽悗锝庡墮缁侊附绻濋姀锝呯厫闁告梹鐗犲鏌ヮ敆閸曨剛鍘遍梺鍝勬储閸斿本鏅堕娑氱闁割偆鍠愮欢鏌ユ煃鐟欏嫬鐏︽鐐诧躬閺屾稒绻濋崘鈺冾槹閻庤娲﹂崹杈╋拷浣冨亹閿熻姤绋掗敋闁告挾鎳撻埞鎴︽倷閸欏妫￠梺鍦焾椤兘骞冮垾鏂ユ瀻闁圭偓娼欓敓鐣屾暬閺岋綁濮�閳藉棗鏅遍梺缁樺浮缁犳牕鐣烽鐐蹭紶闁靛／鍜冪床闂備浇顕栭崹搴ㄥ礃椤忓棌妫ㄧ紓鍌氬�风欢锟犲窗濡ゅ懏鍋￠柍杞扮贰閸ゆ洖鈹戦悩宕囶暡闁稿瀚伴弻锝夊箻閾忣偅宕冲銈嗘煥椤﹂潧顫忓ú顏呯劵婵炴垶锚缁侇喖鈹戦悙鏉垮皟闁告劧绲鹃悘浣割渻閵堝棙灏柛銊︽そ閹繝鎮㈤崗鑲╁幗闂佸搫鍊圭�笛囧箟閹间焦鐓欓柧蹇ｅ亝缁�鍫㈢磼鏉堛劌娴柟顔规櫊閹煎綊顢曢姀顫处闂傚倷鑳剁划顖涚瑹濡ゅ懎闂柨婵嗘媼閸ゆ洖霉閻樺樊鍎岄柨鐔诲Г閻楃姵淇婇悜钘壩ㄩ柍杞扮閸欏﹥淇婇悙顏勶拷鎴﹀垂濞差亝鍋嬫繝濠傜墕缁犳煡鏌涢弴銊ョ仩閹喖鎮峰鍕煀閸楄鲸銇勯弽顐沪闁抽攱甯￠弻娑氫沪閸撗勫櫘濡炪倧璁ｇ粻鎾诲蓟閻斿搫鏋堥柛妤冨仒缁ㄥ鏌ｉ幘鍗烇拷婵嬪蓟閺囷紕鐤�閻庯綆浜烽幏鐑藉即閵忕姴鐎梺绋挎湰缁秹宕伴幇鐗堢厽婵°倧鎷烽柣妤�妫涚划顓烆潩閼哥數鍘遍柟鍏肩暘閸╁嫬鈻撻弴鐐冨酣宕惰闊剙鈹戦垾宕囧煟鐎规洏鍔戦、娆撳礂绾板彉鐢婚梻鍌氬�烽懗鍓佸垝椤栫偛绠板┑鐘崇閸嬶繝鏌嶉崫鍕櫣缂佺姵鐗楁穱濠囧Χ韫囨柨顏堕梻浣哥枃濡嫰藝椤栫偛鐓濋幖绮瑰灳閻斿吋鍋傞幖绮瑰閵娾晜鈷掗柛灞剧懅閸斿秵淇婇悙鍙夊仴鐎规洏鍨虹缓鐣岀矙閸喚褰夋俊鐐�栫敮鎺旓拷姘煎墯椤㈠﹪姊绘担鍛婂暈婵炶绠撳畷鏉款潩閼搁潧浠鹃梺璺ㄥ枍缁瑥顫忛搹瑙勫枂闁告洦鍋勬慨銏ゆ⒑濮瑰洤锟芥洖煤椤撶偟鏆︽繛宸簼閸婄兘鏌ｉ幋鐐冩岸骞忔繝姘拺闁硅偐鍋涢崝锟介柣蹇曞仦鐎氬氦顦寸紒杈ㄦ尰閹峰懘鎼归悷鎵偧缂傚倷娴囬褔宕导鏉戠闁靛繒濮弨浠嬫倵閿濆簼绨介柨娑欑矊閳规垿顢欓弬銈堬拷鎸庝繆椤愩儲纭舵俊鍙夊姍楠炲鏁傜憴锝嗗濠电偠鎻徊浠嬪箺濠婂牊鏅�广儱妫庢禍婊堟煙鐎电浠︾紒锟界�ｎ剨鎷风憴鍕婵炲弶鐗犻幃楣冩倻閽樺鍊炲銈庡幗閸ㄥ墎绱炲Δ鍛拻濞达絽鎲＄拹锟犳煕鎼存稑锟芥繈濡撮崘顔煎窛妞ゆ梻鍘ф慨鍛存⒒閸屾艾锟界兘鎮為敂鎾呮嫹缁楁稑鎳忓畷鏌ユ煕瀹�锟介崑娑氱不閻樿绠规繛锝庡墮婵＄兘鏌ㄩ悢璇残撻柣妤侇殔椤曘儵宕熼銈嗘畷闂佽法鍠撻弲顐ｇ珶閺囥垺瀵犲瑙勭箓缂嶅﹪寮幇鏉跨倞闁告挷绀佹慨鐓庘攽閻愯尙鎽犵紒顔肩墦瀹曪繝骞庨挊澶庢憰闂佺粯姊婚崢褏绮堥崟顖涚厪闁割偅绻冮ˉ婊勩亜韫囥儲瀚�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬姘卞闂佹眹鍨荤划顖涚┍婵犲洦鍊锋い蹇撳閹风兘寮介鐔蜂罕濠电姴锕ら悧鍡欏缂佹绠鹃柟瀛樼懃閻忊晠鏌涢妸銉ワ拷鍧楀蓟濞戞矮娌柛鎾楋拷濡劍绻涚�涙鐭嬬紒顔芥崌瀵鍨鹃幇浣告倯闂佸憡鍔戦崝宀勨�栫�ｎ喗鈷戦梻鍫熺♁椤ョ偤鎮介娑辨疁濠碉紕鏁诲畷鐔碱敍濮樺崬骞愰梻浣侯焾閺堫剛鍒掔仦绛嬪殨闁靛ň鏅滈埛鎴︽煕濠靛棗顏柣蹇涗憾閺屾盯鎮╁畷鍥р拰濡ょ姷鍋涢崯顐︹�﹂妸鈺佺闁绘劦鍓欑紓鎾绘⒒娴ｈ櫣銆婇柛鎾寸箞閳ワ箓宕堕锟藉Ч鏌ユ煏婢跺棙娅嗛柍閿嬪笒闇夐柨婵嗘噺閸熺偤鎮归幇鍓佺瘈闁哄瞼鍠栭幖褰掝敃閿濆懐锛撻梻浣筋嚃閸犳捇宕曢懠顒傜处闁伙絽鐬奸惌娆撴煠閹颁礁鐏￠柟韫嵆濮婄粯鎷呴崨濠冨創濠电偛鐪伴崝鎴濈暦娴兼潙绠婚柛鎾叉缁楀淇婇妶蹇曞埌闁哥噥鍨堕幃锟犲即閻旂繝绨诲銈嗘尵閸犲酣鎮橀妷鈺傜厸閻庯綆鍋嗛埦渚�鏌曢崶褍顏い銏☆殜閺佹挻绂掔�ｅ灚鏅為梺鎼炲劗閺呮粓锝為弴銏＄厵闁诡垎鍛喖婵犳鍨遍幐鎶藉蓟濞戞ǚ鏀介柛鈩冾殘瑜板懘姊洪棃娑辨Т闁哄懏绮撻幃鈥斥枎閹惧鍙勯棅顐㈡祫缁茶姤绂嶅┑鍫嫹鐟欏嫭绀�闁活厼鍊垮璇测槈閵忕姷鍘撮梺鍓茬厛閸犳牗鎱ㄩ弴銏″�甸柛顭戝亝缁舵煡鎮楀顐㈠祮闁绘侗鍣ｅ畷鍫曨敆婢跺娅岄梻浣侯焾鐞氼偊宕愰弴銏犵柧妞ゅ繐鐗婇埛鎺懨归敐鍫燁棄闁告氨鎳撻埞鎴︽倻閸ャ劌顏剁紓鍌氬�搁崐鎼佸磹瑜版帗鍤屽Δ锝呭暙閻撴繄锟藉箍鍎遍ˇ浼村疾閺屻儲鐓曟繝濠忔嫹闁煎啿鐖奸弫鎾绘寠婢跺鏆㈢紓浣介哺鐢顕ラ崟顓ㄦ嫹閿濆懐浠涢柣搴ｅ釜edure闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗娼欓～婵嬫嚋濞堝尅鎷烽弽銊х閻庢稒顭囬惌濠勭磽瀹ュ拑韬�殿喛顕ч埥澶愬閻樼數鏉搁梻鍌氬�搁悧濠勭矙閹烘鍊剁�广儱顦伴埛鎴犵磼鐎ｎ亞浠㈡い鎺嬪灪閵囧嫰濡搁妷顖濆惈閻庢鍠涢褔鍩ユ径濠庢僵妞ゆ劧绲芥刊浼存⒒娴ｇ瓔鍤冮柛銊ラ叄瀹曟﹢鍩￠崘鈺婃建闂傚倸鍊搁崐鐑芥嚄閸撲礁鍨濇い鏍ㄧ矋閺嗘粓鏌ｉ弮鍥т槐婵炴垯鍨圭粈瀣亜閺嶃劎銆掗柣锝嗗▕濮婂宕掑▎鎺戝帯濡炪値鍘奸悧蹇涘箲閵忋倕绠涢柡澶庡劵琚濋梺璇插嚱缂嶅棝宕滃☉姘辩焼濠电姴娲﹂悡娆撴倵閻㈡鐒鹃崯鍝ョ磼閻愵剙鍔ら柕鍫熸倐瀵濡搁埡鍌氫簻闂佸憡鎸烽懗鍫曟偂閹剧粯鈷戦弶鐐村閸斿秹鏌熼悷鐗堝枠鐎殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?
				pexecuteWhileCommit(new PExecuteAfterNpcCreate(npcs));
				return true;
			}
		}.submit();

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730397;

	public int getType() {
		return 730397;
	}

	public java.util.LinkedList<fire.msp.npc.NpcInfo> npcs;

	public MUpdateNpcInfo() {
		npcs = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
	}

	public MUpdateNpcInfo(java.util.LinkedList<fire.msp.npc.NpcInfo> _npcs_) {
		this.npcs = _npcs_;
	}

	public final boolean _validator_() {
		for (fire.msp.npc.NpcInfo _v_ : npcs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(npcs.size());
		for (fire.msp.npc.NpcInfo _v_ : npcs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.npc.NpcInfo _v_ = new fire.msp.npc.NpcInfo();
			_v_.unmarshal(_os_);
			npcs.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MUpdateNpcInfo) {
			MUpdateNpcInfo _o_ = (MUpdateNpcInfo)_o1_;
			if (!npcs.equals(_o_.npcs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npcs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npcs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


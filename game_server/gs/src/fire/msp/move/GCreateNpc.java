
package fire.msp.move;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNpc__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNpc extends __GCreateNpc__ {
	@Override
	protected void process() {
		// protocol handle
		for ( CreateNpcInfo npc : npcs ) {
			fire.pb.scene.movable.NPC ezei = 
				fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(
				npc.npcid, npc.npcname, npc.dir);
			fire.pb.scene.Scene dstscene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			if (dstscene == null){
				SceneManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑橆殕閻撴盯鏌涢弴妤佹珔闁告棑绠撻弻锛勪沪閸撗勫垱閻庢鍠楅幐铏繆閹间礁唯鐟滃矂宕Δ鍛拻濞达綀顫夐崑鐘绘煕閺傝法鐒哥�规洘鍔欓獮鏍ㄦ媴閸濄儱骞嬮梻浣侯攰閹活亞绮婚幋鐘差棜闁稿繗鍋愮弧锟芥繝鐢靛Т閸婂綊骞戦敐澶嬬厱闁哄倹瀵ч幉鍝ョ磼鏉堛劍灏伴柟宄版嚇閹兘寮跺▎鐐秾濠碉紕鍋戦崐鎴﹀礉鐏炶娇娑樷枎閹寸姷鐓旈柡澶婄墑閸斿海寮ч敓浠嬫⒑閹肩偛鍔撮柣蹇旂椤﹀綊鏌ｉ幙鍐ㄤ喊鐎规洖鐖兼俊鎼佹晜閹冩辈濠碉紕鍋戦崐鏇犳崲閹扮増鍋夐柣鎾冲瘨濞兼牗绻涘顔荤盎缂侊拷閸岀偞鐓熼柟鎯у暱閻︺劑鏌涢妶鍜佸剶婵﹥妞藉畷銊︾節閸愶絾瀚婚梻浣藉吹閸熷潡寮插☉銏╂晪闁挎繂妫涚弧锟藉┑顔斤供閸樺吋绂嶅鍫熲拺缂備焦蓱鐏忣厽绻涚�电鍘撮柟顔惧亾閵堬綁宕橀埞鐐缂傚倸鍊烽悞锕傛晝閳轰讲鏋旈柡鍐ㄧ墛閻撶喐淇婇妶鍕厡闁活厼锕幗鍫曟倷閻戞鍘遍梺鍝勬储閸斿矂鐛Ο鑲╂／闁硅鍔栭ˉ澶愭煏閸℃ê绗掓い顐ｇ箞椤㈡鎷呯憴鍕拷宄扳攽閻愯尙鎽犵紒顔肩Ф閸掓帗鎯旈敐鍡╂綗闂佸湱鍎ら幐鍝ユ閻愭祴鏀介柣妯诲絻椤忣偄螖閺冨牊鐓熼幖娣焺閸熷繘鏌涢悩宕囧⒌闁炽儻绠戦悾锟犳焽閿曪拷濞堛劑姊洪崷顓℃闁哥姵顨婂畷鎴﹀礋椤愵偅瀵岄柣搴秵娴滄繈骞戦敐澶嬬厽婵炴垵宕▍宥嗘叏婵犲嫮甯涢柟宄版噽缁瑥鈻庨悙顒夋闂傚倷鑳堕…鍫ヮ敄閸涙潙绠犻柟鐗堟緲缁犳煡鏌曡箛瀣拷鏇犲閸忚偐绠鹃柟瀵稿仧閹冲啰锟芥鍠栧鈥愁潖濞差亝顥堟繛鎴炴皑閻ゅ嫰姊虹粙鍖℃敾闁绘濞�瀹曞搫鈽夐姀鐘殿吅闂佺粯顭囬弫鎼佹晬濠婂喚娓婚柕鍫濇婢ь剛绱掔�ｎ偄绗х紒顔肩墦瀹曟﹢鍩￠崘顏嶅晭闂備礁鎲℃笟妤呭储娴犲瑤澶愭倷閻戞鍘梺鎼炲劀閸愬彞绱斿┑鐘殿暯閸撴繈骞冮崒娑楃箚闁绘垼濮ら弲婵嬫煥閻旂粯顥夐柍缁樻尭铻栭柨鐔剁矙閸╃偤骞嬮敂钘変杭闂佸憡渚楅崰鏍敂鐠鸿　鏀介柣鎰摠鐏忎即鏌ｉ弮鎴濆⒋妤犵偛绻橀弻銊э拷锝庡亜瀵寧绻濋悽闈浶㈤柟鍐茬箻椤㈡棃鎮╅悽鐢碉紲闁哄鐗勯崝宀�绮幒妤佹嚉闁挎繂顦遍崣鎾绘煕閵夛絽濮�濠㈣锚闇夋繝濠傚暟缁夋椽鏌″畝锟介崰搴ㄦ偩閿熺姴绾ч柟绋垮椤旀帡姊绘担鑺ャ�冪紒锟芥笟锟藉畷顖炲级閹寸姵娈鹃梺鍦劋閸╁牆顭囬埡鍌樹簻闁瑰搫绉堕ˇ锕傛煕閺冿拷鐢帡鍩為幋锔藉亹闁割煈鍋呭В鍕⒑缁嬫鍎愮紒瀣灱閻忓鈹戞幊閸婃洟宕姘辨殾闁哄被鍎查悡鏇㈡煃閳轰礁鏆熼柍钘夘槺缁辨挻鎷呴崣澶嬬彋闂佸搫琚崐婵嬬嵁娓氾拷楠炴帡骞嬪┑鍡╂綑婵犵數鍋涢悺銊у垝瀹ュ洤鍨濋柟鎹愵嚙閽冪喖鏌ㄩ悢鍝勑㈤柣鎰躬閺屽秵娼悧鍫▊濠电偛鐭堟禍婊堚�旈崘顔嘉ч柛鎰╁妼婵垽姊虹粙娆惧剭闁稿﹥绻堥悰顕�宕橀妸搴㈡閺佹挻绂掔�ｅ墎绋忓┑鐘绘涧椤戝棝宕愰柨瀣ㄤ簻闁硅櫣鍋炵�氱懓顪冮妶鍛寸崪闁瑰嚖鎷�--婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê妯婂Λ宀勬⒑鏉炴壆顦﹂柨鏇ㄤ邯瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劗绱撻崒娆戝妽闁告梹鐗犻妴鍐╃節閸パ嗘憰闂佺偨鍎辩壕顓㈠汲閵堝棎浜滈柡鍐ㄦ搐娴滃綊宕幖浣光拺閻犳亽鍔岄弸娆愪繆椤愩垹顏╂い顓炴喘閸ㄩ箖骞囨担鍦▉婵犵數鍋涘Ο濠冪閸洖鏋侀柛鈩冪♁閻撱儵鏌ｉ弮鍌氬妺婵炲懏娲滅槐鎺楊敊閼恒儮鎷婚梺璺ㄥ枍缁瑥顭囪楠炴顭ㄩ崼鐔蜂虎缂傚倷鐒︾湁缂佽妫濋弻鏇㈠醇濠靛洤娅ら梺闈╃稻濡炰粙寮婚敐澶婄閻庨潧鎲￠崳鏉库攽椤旂》鏀绘俊鐐扮矙閵嗕礁顫滈敓鑺ヤ繆濮濆矈妲鹃梺鍝勬婵烇拷婵﹥妞藉畷顐﹀礋闂堟稑澹勯梻浣侯焾閿曘儱煤閻旂厧鏄ラ柕澶涚畱缁剁偤鏌熼柇锕�澧版い鏃�甯￠幃妤冩喆閸曨剛顦ュ┑鐐差檧缁犳挻淇婇懜闈涚窞閻庯綆鍓欓獮宥夋⒒娴ｅ憡鍟為柣鐔村劦钘濆ù鍏兼綑绾惧綊鏌熼幍顔碱暭闁绘挻鐟﹂妵鍕棘鐠囨彃顬堝┑鐐茬湴閸婃繈寮荤�ｎ喖鐐婇柕濞у懐妲囬梻鍌氬�搁悧濠勭矙閹惧瓨娅犻柕蹇嬪�栭悡娆撴煕閹邦剙绾фい銉уХ缁辨帗娼忛妸锕�纾抽悗瑙勬礃鐢帡鍩㈡惔銊ョ闁瑰瓨绻傞懙鎰節閻㈤潧校妞ゆ梹鐗犲畷鏉款潩鐠虹儤鐎梺褰掓？缁�渚�寮告担骞夸簻闁哄浂浜濈�氬綊姊烘潪鎵妽闁圭懓娲獮鍐煛閸涱喖娈ら梺鑲╊焾閻忔岸宕ú顏呪拻闁稿本鐟ㄩ崗宀�绱掗鍛仩妞ゎ偄绻戠换婵嗩潩椤掑倸骞堥梻浣稿閸嬩線宕曢柆宥呭嚑濞达絿灏ㄩ幏鐑界嵁閸喖濮庡┑鈽嗗亝缁嬫挾鍒掔紒妯稿亝闁告劏鏅濋崢閬嶆⒑閺傘儲娅呴柛鐘宠壘閳绘挸螣閼测晝锛滈梺缁樏崯鍧椝夌�ｎ剛纾奸弶鍫涘妼缁楁氨绱掑Δ鍐ㄦ灈鐎规洘鍎奸ˇ鎶芥煟濠靛洨绠撻柍瑙勫灴椤㈡瑧娑甸柨瀣毎婵犵绱曢崑鐘参涢崟顖涘仼闁绘垹鐡旈弫鍐煥閺囶亝瀚归柛鐑嗗灦濮婃椽妫冨☉杈ㄐら梺绋匡攻椤ㄥ﹪鐛幋锕�鍗抽柕蹇婃閹风粯绻涙潏鍓хК婵炲拑绲块弫顔尖槈閵忥紕鍘藉┑掳鍊撻悞锔剧矆鐎ｎ亖鏀介柍銉ュ暱椤ｅ磭绱掗鐣屾噧闁宠閰ｉ獮鍡氼槼妞ゆ挸鐏濋埞鎴︽偐閸偅姣勬繝娈垮枤閺佹悂宕版繝鍌ゅ悑濠㈣泛锕﹂敍娑㈡⒑閸涘﹥澶勯柛銊╀憾閹繝鎮㈤崗鑲╁幍闂佺粯鍔﹂崜娆撳煝閺囩喆浜滈幖娣焺濞堟粓鏌″畝瀣ɑ闁诡垱妫冮、娆撴偂鎼达綆鍟囧┑锛勫亼閸娿倖绂嶅鍫濈柈閻庢稒眉缁诲棝鏌涢锝嗙妤犵偑鍨烘穱濠囧Χ韫囨柨顏舵俊鐐�ら崑鍕洪鐑嗘綎婵炲樊浜滅粻褰掓煟閹邦厼绲绘い顐㈡噹椤啴濡舵惔鈥茬盎濡炪倧濡囬弫濠氭偘椤曪拷瀹曞ジ濡烽妷搴樻櫊閺屽秵娼幍顔跨獥濠电偟鍘ч敃顏勵潖濞差亝顥堟繛鎴炶壘椤ｅ搫鈹戦埥鍡椾簻闁活厼鍊块悰顔跨疀濞戞瑦鍎梺闈╁瘜閸橀箖鏁嶅┑鍥╃闁瑰墽顥愭竟妯荤箾鐏炲倸锟芥繈骞冨锟介崺鍕礃椤忓棭鍟庨梻浣告啞閻熴儵藟閵忋値鏁傞柛顐ｇ箘閸樻椽鎮楅獮鍨姎妞わ富鍨伴蹇撯攽鐎ｎ偄锟藉灚绻涢幋鐐垫噽闁绘帊绮欓弻娑樜熺紒妯猴拷鎰叏婵犲啯銇濈�规洘绮撻獮鎾诲箳瀹ュ牆鐒婚梻鍌欒兌椤牓顢栭崨顖ゆ嫹濮樼厧寮�殿喗鐓″畷濂稿即閻愭鍚嬫俊鐐�栭弻銊︽櫠娴犲鏅繝濠傚枤濞撳鏌曢崼婵囶棡闁抽攱甯￠弻锟犲椽娴ｉ晲鍠婂Δ鐘靛仜閿曨亜鐣烽悢纰辨晣闁靛绠戦鍫曟⒑閸撹尙鍘涢柛瀣噽濞嗐垽寮婚妷锕�锟藉灚鎱ㄥΟ鐓庡付妤犵偞锕㈤弻鐔肩嵁閸喚浠奸梺瀹狀潐閸ㄥ灝鐣烽崼鏇炍╅柕澶堝劚闊﹂梻鍌氬�烽悞锕傚几婵傜鐤炬繛鎴欏灩閻ゎ喗銇勯幇鍫曟闁哄懎鎽滅槐鎺戔槈濮楀棗鍓伴梺璇查獜闂勫嫰骞堥妸锔剧瘈闁告洦鍘肩粭锟犳⒑閻熸澘妲婚柟铏姍楠炲骞橀鑲╊槹濡炪倖鍔忛敓鍊熸珪閹层垽姊婚崒姘拷鐑芥嚄閸洍锟斤箓宕奸～顔藉闁割煈鍋勫ù顔撅拷瑙勬礀濠�閬嶅箲閸曨垱鎯為悷娆忓椤旀洘绻濋悽闈涒枅婵炰匠鍏犳椽鏁冮崒姘憋紵闂佺粯鏌ㄩ崥瀣偂韫囨挴鏀介柣妯垮皺缁犳娊鏌ｉ敐鍛埞闂囧鏌ｅΟ鍝勬毐婵炴惌鍠楅幈銊︾節閸愨斂浠㈠┑鈽嗗亜閸燁偊鍩ユ径瀣秶闁靛﹥鍔戦崹钘夘潖濞差亜浼犻柛鏇ㄥ墮濞呫倗绱撴笟鍥ф灍闁圭懓娲ら悾鐑藉传閸曘劍顫嶉梺闈涚箳婵兘顢樺ú顏呪拺缂備焦锚婵牊绻涢崗鑲╂噧妞ゆ洩缍佸畷绋课旀担鍙夊闂備胶鍘ч～鏇㈠磹閺囥垹鍑犻柡鍌涱儥閻斿棛鎲告惔銊ｏ拷鍐╃節閸モ晛绁﹂梺鍝勭▉閸樿偐绮诲☉娆嶄簻闁硅揪绲借闂佸搫鍋婇幏鐑芥⒒閸屾瑨鍏岄柛瀣ㄥ姂瀹曟洟骞庨挊澶岋紱闂侀潧艌閺呮稓澹曟繝姘厪闊洤顑呴敓鑺ョ墵閹�斥枎閹扳晙绨婚梺鍝勫暙閸婂骞楅崒娑氱闁割偆鍠愰埛鎰版煏閸パ冾伃妞ゃ垺娲熼弫鎰板炊閳哄啯婢栭梻鍌欐祰椤曟牠宕伴幒妤�绀堟繝闈涱儏缁犳岸鏌￠崘銊у闁绘搫绻濋弻娑㈠焺閸忕姷鍘ч～婵嬫晝閸屾稈鎷婚梺绋挎湰閼归箖鏁撻悾灞藉幋闁诡喚鍋ら弫鍌炲箻閸涱喖顏剁紓浣诡殕缁嬫垿宕㈤悙顑惧亰閻犳亽鍔庨弶绋库攽閻愭潙鐏﹂柨姘舵煟鎼搭喖骞楃紒缁樼〒閿熺晫鏁搁…鍫濈摥婵＄偑鍊栭崹闈浢洪妶澶嬪仼闁割煈鍋呮刊鎾偡濞嗗繐顏╃�殿喖鐏濋埞鎴炲箠闁稿﹥娲熼、鏍幢濞嗘瑦瀚规慨妯块哺閸わ拷濡炪値浜滈崯瀛樹繆閸洖绀冮柕濞у倻妫梻鍌欐祰瀹曠敻宕崸妤�鐤鹃柣妯垮吹瀹撲礁鈹戦悩鍙夋悙闁告劧鎷锋俊鐐�栭幐楣冨磻閻旂厧鍌ㄩ柛娑橈功缁犻箖鏌熼崜褜妫庡瑙勶耿閺屻劑寮村Ο鍝勫Б闂佽法鍠曟慨銈夋嚌閸撗呯濠电姴娲ら拑鐔兼煏婵炵偓娅嗛柛瀣閺屾稓浠﹂崜褉妲堝銈呴獜閹凤拷?");
				continue;
			}
			
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(dstscene, 
					new fire.pb.scene.sPos.GridPos( npc.xpos, npc.ypos ).toPosition()	, ezei,0);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724903;

	public int getType() {
		return 724903;
	}

	public java.util.LinkedList<fire.msp.move.CreateNpcInfo> npcs;

	public GCreateNpc() {
		npcs = new java.util.LinkedList<fire.msp.move.CreateNpcInfo>();
	}

	public GCreateNpc(java.util.LinkedList<fire.msp.move.CreateNpcInfo> _npcs_) {
		this.npcs = _npcs_;
	}

	public final boolean _validator_() {
		for (fire.msp.move.CreateNpcInfo _v_ : npcs)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(npcs.size());
		for (fire.msp.move.CreateNpcInfo _v_ : npcs) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.move.CreateNpcInfo _v_ = new fire.msp.move.CreateNpcInfo();
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
		if (_o1_ instanceof GCreateNpc) {
			GCreateNpc _o_ = (GCreateNpc)_o1_;
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


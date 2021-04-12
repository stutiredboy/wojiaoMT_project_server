
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
				SceneManager.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弴鐐诧拷褰掑磿閹寸姵鍠愰柣妤�鐗嗙粭鎺楁煛閸曗晛鍔﹂柡灞剧洴瀵挳濡搁妷褌鍝楅梻浣规偠閸斿矂宕愰幖浣哥厴闁硅揪绠戠壕鍏肩節婵犲倹鎹ｉ柛鏂挎憸缁辨挻鎷呴悷鏉款潔濡炪們鍔屽Λ娆戠矚鏉堛劎绡�闁搞儺鐏涜閻擃偊宕堕妸锔惧弳濡炪倕绻愰悥鐓庮潖濞差亜绀傞柣鎾冲瘨閸ゅ姊洪崨濠冣拹闁荤啿鏅涢锝嗙節濮橆厼浜滈梺缁樻尭濞寸兘鎮炬ィ鍐┾拺缂備焦锕╁▓鏃堟煟濡や胶鐭婇摶鐐烘煕閺囥劌骞樼痪鎹愭閵嗘帒顫濋浣规倷婵炲瓨绮嶇划搴ｆ閹烘挸绶炲┑鐘插妤旈柣搴㈩問閸犳牠鈥﹀畡閭﹀殨闁圭虎鍠楅崑鍕渻鐎ｎ亝鎹ｉ柣娑卞櫍濮婄粯鎷呯粙娆炬闂佺顑呴幊鎰板箲閵忋倕纾兼繛鎴炵懃瀵潡姊洪棃娑氱疄闁稿﹥鐗犻崺娑㈠箣閻樼數锛滃銈嗙墬缁嬫帞绮堥崘鈺冪闁告侗鍘介ˉ鐐烘煏閸パ冾伃濠碘剝鎮傛俊鐑芥晝閿熻棄鈻撳Δ锟介埞鎴︽偑閸涱喖顏跺┑鐐存尰閻旑剟骞忛柨瀣弿濠电姴鎳忛鐘电磼鏉堛劌绗掗摶锝夌叓閸ャ劏澹樺ù婊冪秺閺岀喎鐣￠弶鎸庢闂佽桨绀侀崯鏉戠暦閹烘埈娼╂い鎺嶇閸旀帒鈹戦悩鍨毄闁稿绋戣灋婵°倕鍟畷鏌ユ煕閳╁啰鈽夌紓浣叉櫊閺屻倝骞侀幒鎴濆婵炲瓨绮嶇划鎾诲蓟閿熺姴鐐婇柍杞版濞岊亜顪冮妶鍐ㄥ姢闁稿鍊濋獮鍐ㄎ旈敓浠嬶綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�--婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇缂備焦鍔栭〃濠囧蓟閳ュ磭鏆ゆい鏃囧亹鍟搁梺璺ㄥ枙濡嫬顭囬垾鎰佹綎婵炲樊浜堕弫鍡涙煥閻旂儤娅曠紒顔芥⒒閿熶粙娼ч幗婊堟偝缂佹ü绻嗛柕鍫濇噺閸ｆ椽鏌ｉ幘瀵告噰婵﹥妞介、姗�濡歌閺嗙娀姊洪崫鍕靛剭闁稿﹥娲熼崺銉﹀緞閹邦剛顔掗悗瑙勬礀濞夛箓濡舵径瀣幍闂佸憡鐟ラˇ浼村磹閹扮増鐓欐い鏂诲妼濞层倝鏌嬮崶銊х瘈闂傚牊绋撴晶銏ゆ煙閸愬弶顥犵紒杈ㄦ崌瀹曟帒鈻庨幒鎴濆腐濠电姵顔栭崰姘跺极閹间礁鏋佹い鏇嫹闁轰焦鎹囬幃鈺呮嚑閼稿灚鍟洪梻鍌欒兌缁垰顫忔繝姘厱闁割偁鍎遍弸浣猴拷骞垮劚濡稓绮绘ィ鍐╃厱闁斥晛鍠氬▓妯肩磼閻樺啿顥嬬紒杈ㄥ笚缁楃喖宕惰閻濇繂鈹戦纭锋敾婵＄偠妫勯悾鐑筋敃閿曪拷鍞梺闈涱槶閸婃骞戦弴銏♀拻濞达綀娅ｇ敮娑㈡煟濡や焦绀嬪┑鈥冲缁瑥鈻庨幆褎顓垮┑鐘垫暩婵數鍠婂澶婄；闁告洦鍨遍悡鐔兼煙閻愵剙鈻曟い搴㈩殜閺岋絾鎯旈鐓庣濡炪値浜滈崯瀛樹繆閸洖骞㈡俊銈忔嫹妞ゎ偄娲娲箹閻愭彃顫呭銈庡亜椤︾敻鐛崼銉ノ╅柍杞扮贰濞煎﹪姊洪棃娑氬婵☆偄鐭傞獮蹇涙惞閸︻厾锛濇繛鎾磋壘濞层倝鎮橀埄鍐闁告瑥顥㈤鍫濈厺鐎广儱顦婵嬫倵濞戞瑯鐒介柛妯绘倐濮婃椽宕滈幓鎺嶈埅闂佺顑呯�氼參寮查崼鏇炵妞ゆ柨澧介敍婊冾渻閵堝棙鈷掗柡鍜佸亰楠炲﹪宕熼銊﹀闁割煈鍋呯欢鏌ユ倵濮樼厧骞橀柟骞垮灩閳规垿宕堕妸銉ュΤ闂備焦鏋奸弲娑㈠疮椤愶附鏅哥紒娑橆儏閻忥附鎱ㄦ繝鍕笡闁瑰嘲鎳愰幉鎾礋椤愨�虫憢闂傚倷鑳堕…鍫拷鍨浮瀹曞湱鎹勯搹瑙勬濠电娀娼уú锕傚磿閻斿吋鐓忓┑鐘茬箳閻ｅ崬霉閻樺啿娴慨濠冩そ濡啫鈽夋潏銊愩垽姊洪崫鍕櫤缂侇喗鎹囧畷鍝勨槈閵忕姷顓洪梺缁樺姈濞兼瑥顕ｉ崸妤佲拺闁煎鍊曢弸鏂款熆瑜庨〃濠囩嵁閺嶎厼绠涙い鎴ｅГ閺傦拷闂備胶鍋ㄩ崕鎶藉磻閵娾晛纾婚柕蹇嬪�栭悡娆愩亜閺冨倻鎽傛繛鍫熸⒐閵囧嫰顢曢敐鍥╃杽闂佽鍠掗崜婵嬪箚閺冨牆鐓￠柛鈩兠煎锕傛⒒閸屾艾锟界兘鎮為敂鎾呮嫹缁楁稑鍘炬ウ璺ㄧ杸婵炴垶锚閻庮厽绻涚�电孝妞ゆ垵娲ら悾鍨媴鐟欏嫬寮垮┑掳鍊曢鍡欙拷姘辨嚀椤啴濡堕崘銊т痪闂佽崵鍟块弲鐘荤嵁婵犲洤鍐�妞ゆ挾鍋熼崢鍛婄箾閹剧澹橀柨鏇樺劤閿熻姤鑹剧紞濠囧蓟閵娾晜鍋嗛柛灞剧☉椤忥拷?");
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


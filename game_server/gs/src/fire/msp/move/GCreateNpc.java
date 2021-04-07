
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
				SceneManager.logger.error("闂傚倸鍊搁崐鐑芥倿閿曞倹鍎戠憸鐗堝笒閺勩儵鏌涢弴銊ョ仩闁搞劌鍊搁埞鎴﹀磼濠婂海鍔哥紓浣瑰姈椤ㄥ棙绌辨繝鍥ч煫鍥ㄦ煥椤忓爼姊洪崗鐓庮嚋闁告梹鐟╁濠氭偄閻撳海鐣鹃梺缁橆殔閻楁粌螞閸曨厾纾藉〒姘搐娴滄粎绱掓径濠勭Ш鐎殿喖顭峰鎾偄妞嬪海鐛梻浣稿閸嬪懐鎹㈤崒娑欏弿闁靛繈鍊栭埛鎴犵磼椤栨稒绀冩繛鍛閵囧嫰濡搁妷锕�娈楀┑鐙呮嫹濞撴熬鎷锋慨濠呮缁辨帒螣韫囨艾浜归柟宄板暣閺佸啴宕掑顒佸劒婵犵數鍋涘Λ妤冩崲閸℃稑缁╅柤鎭掑劘娴滄粓鏌￠崶鈺佷沪妞ゃ儳鍋ら幃妤�顫濋悙顒�顏�--婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖缁愭鏌″畵顔肩Х閿熻棄娼″娲敆閿熺晫绮旂�靛摜鐜绘俊銈呮噺閻撴瑩姊洪銊х暠闁哄鍊曢埥澶愬箻瀹曞泦銈夋煙閸欏鍊愰柟顔ㄥ洤閱囨繝闈涚墢閹冲棛绱撻崒娆掑厡濠殿喚鏁搁弫顕�鏁撻悩鑼舵憰闂佺粯姊婚埛鍫ュ极瀹ュ棛绠鹃柛鈩冾殘缁犳壆绱掓笟鍥ф珝婵﹥妞藉畷顐﹀Ψ閵夈倗鎹曢梻浣虹帛閻楁洟濡剁粙娆惧殨濠电姵纰嶉崑鍕煟閹炬娊顎楅柣搴幖椤啴濡堕崱妤�顫囬梺鎼炲姀椤骞堥妸鈺侇潊闁靛牆妫岄幏铏圭磽娓氬洤鐏℃繛鍙壝埢宥夊川鐎涙鍘搁梺鍓插亽閸嬪嫭鏅堕幍顔剧＜妞ゆ梻鏅幊鍕拷鍨緲鐎氼厾鎹㈠┑鍥ㄥ劅闁斥晛鍟敓绛嬪灦濮婄粯鎷呯憴鍕哗闂佺瀵掗崹璺虹暦濠靛洦鍎熼柕濠忕畱娴犳帡姊洪棃娑辨Т闁哄懏绮撻崺娑㈠箣閻愭潙寮块梺鑽ゅ枔婢ф骞栭幇顑芥斀闁炽儳鍋ㄩ崑銏ゆ煙椤旂瓔娈旀い顐ｇ箞閹剝鎯旈埥鍡樹氦闂傚倷鐒︾�笛兠鸿箛娑樺瀭濞寸姴顑囧畵浣规叏濡ゅ瀚瑰銈冨灪閻熲晠骞婇弽顓炵厸濞撴艾锕ョ�氬綊鏌ㄩ悤鍌涘?");
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


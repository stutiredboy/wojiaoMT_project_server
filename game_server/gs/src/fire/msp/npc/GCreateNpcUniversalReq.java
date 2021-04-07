
package fire.msp.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNpcUniversalReq__ extends mkio.Protocol { }

/** GS 发送地图模块 请求创建NPC
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNpcUniversalReq extends __GCreateNpcUniversalReq__ {
	@Override
	protected void process() {
		// protocol handle
		
		if (!npclist.isEmpty()){
			// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟宕导瀛樺剹婵炲棙鎸婚悡娆撴倵閻㈡鐒鹃崯鍝ョ磼閹冪稏缂侇喗鐟╁濠氭偄閾忓湱锛滃┑鈽嗗灣椤牊绂掗妴锟�
			java.util.List<fire.msp.npc.NpcInfo> resultlist = new java.util.LinkedList<fire.msp.npc.NpcInfo>();
			
			for (CreateNpcInfoUniverse info:npclist){
				java.util.List<fire.msp.npc.NpcInfo> rlist = fire.pb.scene.manager.SceneNpcManager.getInstance().createNpc(info);
				// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倹绻涘顔荤盎缁炬儳娼￠弻銈吤圭�ｎ偅鐝旈梺鎼炲妽缁诲牓寮诲☉銏犵婵°倧鎷烽悗姘煎墴瀵悂宕掗悙绮规嫼闂佸湱顭堢�涒晠藟閸℃せ鏀芥い鏂挎惈閿熻姤鐗滅划瀣吋婢跺á褍顭跨捄渚剳闁告ɑ鎮傚铏圭矙閹稿孩鎷辩紓浣割儐閸ㄥ潡銆佸顒夌叆闁告侗鍨抽敍婊堟⒑鐠恒劌鏋嶇紒顔界懇瀵偊骞橀懜娈挎綗缂傚倸绋勯幏锟�
				if (rlist == null || rlist.isEmpty() || rlist.size() < info.num){
					MCreateNpcUniversalRet mret = new MCreateNpcUniversalRet();
					mret.interfaceid = interfaceid;
					mret.result = 0;
					fire.pb.scene.SceneClient.pSend(mret);
					break;
				}
				// 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閻愵剚鐝旂紓渚婃嫹濠㈣埖鍔栭悡娑㈡煕閵夈垺娅呴柡瀣灴閺屾稑鈻庤箛鏇狀啋闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷
				resultlist.addAll(rlist);
			}
			//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勫┑掳鍊х徊浠嬪疮椤愩倧鎷峰顒夋Ч闁靛洤瀚伴獮鎺楀箣濠垫劒绱濋梻浣芥〃缁�浣肝涘┑瀣摕闁挎繂顦粻娑欍亜閹哄秶鍔嶉柛搴㈡尵缁辨挻绗熸繝鍐伓闂備胶纭堕崜婵堢矙閹烘鍋傞柣鏃傚劋閸犳劗锟藉箍鍎遍幃鍨洪鍛闂佽法鍣﹂幏锟� NPC闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫熺箾鐎涙鐭嬬紒璇插閸掓帒顫濋鐔虹Ф闂侀潧臎閸涱垱顫岄梻鍌欑劍閹爼宕曞鍫濆窛妞ゆ牗绋掗锟�?
			MUpdateNpcInfo mUpdateNpcInfo = new MUpdateNpcInfo();
			mUpdateNpcInfo.npcs.addAll(resultlist);
			fire.pb.scene.SceneClient.pSend(mUpdateNpcInfo);
			
			if (interfaceid > 0){
				MCreateNpcUniversalRet mret = new MCreateNpcUniversalRet();
				mret.interfaceid = interfaceid;
				mret.result = 1;
				mret.npclist.addAll(resultlist);
				fire.pb.scene.SceneClient.pSend(mret);
			}
		}
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730416;

	public int getType() {
		return 730416;
	}

	public long interfaceid; // 逻辑接口ID，不需要返回的，interfaceid = 0
	public java.util.LinkedList<fire.msp.npc.CreateNpcInfoUniverse> npclist; // GS召NPC的要求条件
	public int toufangareatype; // 0-普通的投放区域,1-新的投放区域,包含1级轻功

	public GCreateNpcUniversalReq() {
		npclist = new java.util.LinkedList<fire.msp.npc.CreateNpcInfoUniverse>();
	}

	public GCreateNpcUniversalReq(long _interfaceid_, java.util.LinkedList<fire.msp.npc.CreateNpcInfoUniverse> _npclist_, int _toufangareatype_) {
		this.interfaceid = _interfaceid_;
		this.npclist = _npclist_;
		this.toufangareatype = _toufangareatype_;
	}

	public final boolean _validator_() {
		if (interfaceid < 0) return false;
		for (fire.msp.npc.CreateNpcInfoUniverse _v_ : npclist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(interfaceid);
		_os_.compact_uint32(npclist.size());
		for (fire.msp.npc.CreateNpcInfoUniverse _v_ : npclist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(toufangareatype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		interfaceid = _os_.unmarshal_long();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.msp.npc.CreateNpcInfoUniverse _v_ = new fire.msp.npc.CreateNpcInfoUniverse();
			_v_.unmarshal(_os_);
			npclist.add(_v_);
		}
		toufangareatype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNpcUniversalReq) {
			GCreateNpcUniversalReq _o_ = (GCreateNpcUniversalReq)_o1_;
			if (interfaceid != _o_.interfaceid) return false;
			if (!npclist.equals(_o_.npclist)) return false;
			if (toufangareatype != _o_.toufangareatype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)interfaceid;
		_h_ += npclist.hashCode();
		_h_ += toufangareatype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(interfaceid).append(",");
		_sb_.append(npclist).append(",");
		_sb_.append(toufangareatype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


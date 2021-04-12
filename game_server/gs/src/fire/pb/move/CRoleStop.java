
package fire.pb.move;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleStop__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleStop extends __CRoleStop__ {
	@Override
	protected void process() {
		// protocol handle
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)
			return;
		if(sceneid != role.getScene().getSceneID())
			return;
		
		role.clearCurDestPos();
		
		if(! role.checkMoveUnit()) return;
		
		//checkmove婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閸濆嫬顏ラ柛搴ㄤ憾閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘垹纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤崨濠勭Ф闂佸憡鎸嗛崨顔筋啅缂傚倸鍊烽懗鑸靛垔椤撱垹鍨傞柛顐ｆ礀閽冪喖鏌曟繛鐐珕闁稿妫濋弻娑氫沪閸撗�妲堝銈呴獜閹凤拷?
		if(!CCheckMove.checkmove(role, role.getScene().getSceneID(), pos, poslist, System.currentTimeMillis()))
		{
			return;	
		}
		
		role.clearCurDestPos();

		/*婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎濡ょ姷鍋涢崯顐ョ亙闂佸憡渚楅崳顔嘉涢崘銊㈡斀闁绘劖娼欓悘锕傛煟閻曞倻鐣电�规洑鍗抽獮鍥敇閻樻鍟庨梻浣烘嚀椤曨參宕戦悙鍏哥剨妞ゆ挾濮风壕鐓庮熆鐠虹尨鍔熼柛鈺嬬秮閺屸剝鎷呯憴鍕３闂佸湱顭堥敃銉ヮ嚗閸曨偆鏆嗛柨鐔剁矙瀵啿鈽夐姀鈾�鎷虹紓浣割儏濞硷繝宕ｉ崟顐�鐟邦煥閸曨偄濮稿┑鈽嗗亞閸犲酣鈥旈崘顔嘉ч柛鈩冪懃椤呯磽娓氬洤鏋涢悗娑掓櫇缁瑦寰勬繝搴℃倯婵犮垼娉涢鍥矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹? final SRoleStop snd = new SRoleStop();
		snd.roleid = role.getRoleID();
		snd.pos = role.getPos().toProtocolPos();
		role.sendWhoSeeMe(snd);*/
		/*婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹤顕ｇ拠娴嬫婵☆垶鏀遍弬锟介梻浣告啞濞诧箓宕戦崟顒佸弿闁靛繈鍊栭埛鎴炵箾閼奸鍤欐鐐搭殜閺岀喖鎮烽悧鍫濇灎濡ょ姷鍋涢崯顐ョ亙闂佸憡渚楅崳顔嘉涢崘銊㈡斀闁绘劖娼欓悘锕傛煟閻曞倻鐣电�规洑鍗抽獮鍥敇閻樻鍟庨梻浣烘嚀椤曨參宕戦悙鍏哥剨妞ゆ挾濮风壕鐓庮熆鐠虹尨鍔熼柛鈺嬬秮閺屸剝鎷呯憴鍕３闂佸湱顭堥敃銉ヮ嚗閸曨偆鏆嗛柨鐔剁矙瀵啿鈽夐姀鈾�鎷虹紓浣割儏濞硷繝宕ｉ崟顐�鐟邦煥閸曨偄濮稿┑鈽嗗亞閸犲酣鈥旈崘顔嘉ч柛鈩冪懃椤呯磽娓氬洤鏋涢悗娑掓櫇缁瑦寰勬繝搴℃倯婵犮垼娉涢鍥矗閸℃稒鈷戠紓浣股戠粈锟介梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹?2 final SRoleMove snd = new SRoleMove();
		snd.roleid = role.getRoleID();
		snd.destpos = role.getPos().toProtocolPos();
		role.sendWhoSeeMe(snd);*/

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790442;

	public int getType() {
		return 790442;
	}

	public java.util.LinkedList<fire.pb.move.Pos> poslist; // 路径上的关键点
	public fire.pb.move.Pos pos; // 位置
	public long sceneid;

	public CRoleStop() {
		poslist = new java.util.LinkedList<fire.pb.move.Pos>();
		pos = new fire.pb.move.Pos();
	}

	public CRoleStop(java.util.LinkedList<fire.pb.move.Pos> _poslist_, fire.pb.move.Pos _pos_, long _sceneid_) {
		this.poslist = _poslist_;
		this.pos = _pos_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		for (fire.pb.move.Pos _v_ : poslist)
			if (!_v_._validator_()) return false;
		if (!pos._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(poslist.size());
		for (fire.pb.move.Pos _v_ : poslist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(pos);
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.move.Pos _v_ = new fire.pb.move.Pos();
			_v_.unmarshal(_os_);
			poslist.add(_v_);
		}
		pos.unmarshal(_os_);
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleStop) {
			CRoleStop _o_ = (CRoleStop)_o1_;
			if (!poslist.equals(_o_.poslist)) return false;
			if (!pos.equals(_o_.pos)) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += poslist.hashCode();
		_h_ += pos.hashCode();
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(poslist).append(",");
		_sb_.append(pos).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


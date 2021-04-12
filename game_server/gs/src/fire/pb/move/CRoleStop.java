
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
		
		//checkmove濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鍛婄秶闁告挆鍛缂傚倷鑳舵刊顓㈠垂閸洖钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�?
		if(!CCheckMove.checkmove(role, role.getScene().getSceneID(), pos, poslist, System.currentTimeMillis()))
		{
			return;	
		}
		
		role.clearCurDestPos();

		/*濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠妤犵偛鍟灃闁告侗鍣Λ鍐ㄢ攽閻愭潙鐏﹂柣鐕傜畵瀹曚即骞囬鐘殿啎闂佺懓顕崑鐐典焊椤撶姷纾煎璺猴功閸╋綁鏌℃担瑙勫磳闁圭锕ュ鍕暆閿熶粙寮冲☉銏♀拺缂佸娼￠崣鍕瑰鍕姸婵☆偆鍠庨—鍐Χ閸℃瑥顫х紓渚囧枛鐎涒晝绮欐径濠庡悑濠㈣泛顑囬崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷? final SRoleStop snd = new SRoleStop();
		snd.roleid = role.getRoleID();
		snd.pos = role.getPos().toProtocolPos();
		role.sendWhoSeeMe(snd);*/
		/*濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠妤犵偛鍟灃闁告侗鍣Λ鍐ㄢ攽閻愭潙鐏﹂柣鐕傜畵瀹曚即骞囬鐘殿啎闂佺懓顕崑鐐典焊椤撶姷纾煎璺猴功閸╋綁鏌℃担瑙勫磳闁圭锕ュ鍕暆閿熶粙寮冲☉銏♀拺缂佸娼￠崣鍕瑰鍕姸婵☆偆鍠庨—鍐Χ閸℃瑥顫х紓渚囧枛鐎涒晝绮欐径濠庡悑濠㈣泛顑囬崣鍡涙⒑缂佹ɑ绀�闁稿﹤婀遍敓鑺ョ啲閹凤拷?2 final SRoleMove snd = new SRoleMove();
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


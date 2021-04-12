
package fire.pb.move;

import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleJumpStop__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleJumpStop extends __CRoleJumpStop__ {
	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)
			return;
		
		if(! role.checkMoveUnit()) return;
		
		if(! role.isJumping()) return;
		
		//checkmove 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鍝勫閸庨亶鍩為幋锔藉亹闁告瑥顦伴幃娆戠磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤濞硷繝寮婚悢鍛婄秶闁告挆鍛缂傚倷鑳舵刊顓㈠垂閸洖钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�?
		/*final long curTick = System.currentTimeMillis();
		if(!CCheckMove.checkmove(role,sceneid, destpos, poslist,curTick))
		{
			return;//checkmove婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鎯у⒔缁垳鎹㈠☉銏犵闁绘劕鐏氶崳褏绱撴担绋款暢闁稿鍊濆璇测槈閵忕姈銊︺亜閺冨倸甯舵い顐熸櫇缁辨挻绗熸繝鍐伓闂備礁澹婇崑鍡涘窗閹捐泛濮柨鐔剁矙濮婂宕掑鍗烆杸婵炴挻纰嶉〃濠傜暦閺囷紕鐤�婵炴垶鐟ч崢閬嶆⒑闂堟侗鐒鹃柛搴ㄤ憾閺佹捇鎸婃径宀�楔濡ょ姷鍋涢悧鎾翠繆閹间礁唯閹艰揪绲介弸娑欘殽閻愭潙濮堥柟顖涙閺佹劙宕橀幐搴☆伓闂佸綊鍋婇崰姘卞閽樺锟芥帒顫濋濠冩暰闁诲孩鑹剧紞濠傤潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�?
		}*/
		Position stoppos = new Position(destpos.x, destpos.y, destz);
		role.stopJump(stoppos);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790479;

	public int getType() {
		return 790479;
	}

	public fire.pb.move.Pos destpos; // 飞越停止点
	public byte destz; // 飞越停止z坐标

	public CRoleJumpStop() {
		destpos = new fire.pb.move.Pos();
	}

	public CRoleJumpStop(fire.pb.move.Pos _destpos_, byte _destz_) {
		this.destpos = _destpos_;
		this.destz = _destz_;
	}

	public final boolean _validator_() {
		if (!destpos._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(destpos);
		_os_.marshal(destz);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		destpos.unmarshal(_os_);
		destz = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleJumpStop) {
			CRoleJumpStop _o_ = (CRoleJumpStop)_o1_;
			if (!destpos.equals(_o_.destpos)) return false;
			if (destz != _o_.destz) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += destpos.hashCode();
		_h_ += (int)destz;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(destpos).append(",");
		_sb_.append(destz).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRoleJumpStop _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = destpos.compareTo(_o_.destpos);
		if (0 != _c_) return _c_;
		_c_ = destz - _o_.destz;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


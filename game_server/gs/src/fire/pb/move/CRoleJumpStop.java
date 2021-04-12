
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
		
		//checkmove 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閸濆嫬顏ラ柛搴ㄤ憾閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘垹纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤崨濠勭Ф闂佸憡鎸嗛崨顔筋啅缂傚倸鍊烽懗鑸靛垔椤撱垹鍨傞柛顐ｆ礀閽冪喖鏌曟繛鐐珕闁稿妫濋弻娑氫沪閸撗�妲堝銈呴獜閹凤拷?
		/*final long curTick = System.currentTimeMillis();
		if(!CCheckMove.checkmove(role,sceneid, destpos, poslist,curTick))
		{
			return;//checkmove濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉稿┑鐐存尰绾板秹銆冩繝鍌滄殾闁哄浄绱曢悿锟藉┑鐐村灦閻熝囧储闁秵鈷戦梻鍫熶緱閻掗箖鏌涙惔銊ゆ喚闁轰焦鎹囬幐濠冨緞瀹�锟芥婵°倗濮烽崑娑㈡偋閹剧繝绻嗛柟闂寸鍞柟鑹版彧缁蹭粙寮稿☉娆樻闁绘劖娼欐慨鍫ユ煙椤栨稒顥堥柡浣瑰姍瀹曟﹢骞愭惔鈽嗕紦闂備礁缍婇崑濠囧窗濮樺崬顥氶柦妯侯槶閿熻姤甯掗～婵嬵敆婵犲啯鏆伴梺璇插閼瑰墽绱炴繝鍌ゆ綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣婵勫灲濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�?
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



package fire.pb.move;

import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.JumpRole;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRoleJump__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRoleJump extends __CRoleJump__ {
	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role)return;
		
		final fire.pb.scene.Scene rs = role.getScene();
		if(null == rs) return;
		
		if(rs.getMapConfig().qinggong == 0) return;
		
		//checkmove 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閸濆嫬顏ラ柛搴ㄤ憾閸╃偤骞嬮敂钘変汗闂佸憡鐟ラˇ浼村箖濞嗘垹纾藉ù锝呮惈椤庡矂鏌涢妸銉у煟鐎殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繛纭风節瀵鎮㈤崨濠勭Ф闂佸憡鎸嗛崨顔筋啅缂傚倸鍊烽懗鑸靛垔椤撱垹鍨傞柛顐ｆ礀閽冪喖鏌曟繛鐐珕闁稿妫濋弻娑氫沪閸撗�妲堝銈呴獜閹凤拷?
		final long curTick = System.currentTimeMillis();
		
		if(!role.isJumping() && !CCheckMove.checkmove(role,sceneid, srcpos, poslist,curTick))
		{
			if(role.isJumping())
				role.getJumpRole().confirmPositionToStart();
			else
				JumpRole.confirmPosition(role);
			return;//checkmove濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃缂侇噮鍨抽幑銏犫槈閵忕姷顓洪梺缁樺姇閻忔岸宕宠缁辨挻鎷呯粙娆炬殺闂佺顑冮崐婵嗩嚕鐠囨祴妲堥柕蹇曞閵婏负浜滈柡鍐ㄥ�哥敮鑸点亜椤愮喐娅囩紒杈ㄦ尰缁楃喐绻濋崘顭戜紦闂傚倷绀佹竟濠囧磻閸℃稑绐楅柟鎹愭硾婵剟鏌ㄩ悢鍓佺煓婵﹤顭峰畷鎺戭潩閸楃儐鏉稿┑鐐存尰绾板秹銆冩繝鍌滄殾闁哄浄绱曢悿锟藉┑鐐村灦閻熝囧储闁秵鈷戦梻鍫熶緱閻掗箖鏌涙惔銊ゆ喚闁轰焦鎹囬幐濠冨緞瀹�锟芥婵°倗濮烽崑娑㈡偋閹剧繝绻嗛柟闂寸鍞柟鑹版彧缁蹭粙寮稿☉娆樻闁绘劖娼欐慨鍫ユ煙椤栨稒顥堥柡浣瑰姍瀹曟﹢骞愭惔鈽嗕紦闂備礁缍婇崑濠囧窗濮樺崬顥氶柦妯侯槶閿熻姤甯掗～婵嬵敆婵犲啯鏆伴梺璇插閼瑰墽绱炴繝鍌ゆ綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣婵勫灲濮婃椽鎮烽弶鎸庮唨闂佺懓鍤栭幏锟�?
		}
		
		if(role.jump(new Position(srcpos.x, srcpos.y), new Position(destpos.x, destpos.y), jumptype == 0))
		{
			role.sendWhoSeeMe(new SRoleJump(role.getRoleID(), srcpos, destpos, jumptype));
		}
	}
  
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790477;

	public int getType() {
		return 790477;
	}

	public java.util.LinkedList<fire.pb.move.Pos> poslist; // 跳跃之前未check的关键点
	public fire.pb.move.Pos srcpos; // 出发点
	public fire.pb.move.Pos destpos; // 到达点
	public byte jumptype; // 0为普通跳，1为2段跳
	public long sceneid; // 场景id

	public CRoleJump() {
		poslist = new java.util.LinkedList<fire.pb.move.Pos>();
		srcpos = new fire.pb.move.Pos();
		destpos = new fire.pb.move.Pos();
	}

	public CRoleJump(java.util.LinkedList<fire.pb.move.Pos> _poslist_, fire.pb.move.Pos _srcpos_, fire.pb.move.Pos _destpos_, byte _jumptype_, long _sceneid_) {
		this.poslist = _poslist_;
		this.srcpos = _srcpos_;
		this.destpos = _destpos_;
		this.jumptype = _jumptype_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		for (fire.pb.move.Pos _v_ : poslist)
			if (!_v_._validator_()) return false;
		if (!srcpos._validator_()) return false;
		if (!destpos._validator_()) return false;
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
		_os_.marshal(srcpos);
		_os_.marshal(destpos);
		_os_.marshal(jumptype);
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.move.Pos _v_ = new fire.pb.move.Pos();
			_v_.unmarshal(_os_);
			poslist.add(_v_);
		}
		srcpos.unmarshal(_os_);
		destpos.unmarshal(_os_);
		jumptype = _os_.unmarshal_byte();
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRoleJump) {
			CRoleJump _o_ = (CRoleJump)_o1_;
			if (!poslist.equals(_o_.poslist)) return false;
			if (!srcpos.equals(_o_.srcpos)) return false;
			if (!destpos.equals(_o_.destpos)) return false;
			if (jumptype != _o_.jumptype) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += poslist.hashCode();
		_h_ += srcpos.hashCode();
		_h_ += destpos.hashCode();
		_h_ += (int)jumptype;
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(poslist).append(",");
		_sb_.append(srcpos).append(",");
		_sb_.append(destpos).append(",");
		_sb_.append(jumptype).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


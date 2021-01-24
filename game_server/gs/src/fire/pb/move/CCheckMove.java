
package fire.pb.move;
import java.util.List;


import fire.pb.move.Pos;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.Position;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCheckMove__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CCheckMove extends __CCheckMove__ {

	@Override
	protected void process() {
		final Role role = RoleManager.getInstance().getRoleByProtocol(this);
		if(null == role) return;
		if(null == role.getScene()) return;
		
		final long curTick = System.currentTimeMillis();
		if(! role.checkValidFrequency(curTick)){
			return;//闁告瑯浜滈幏鐑芥偩閵夘垳绀夊☉鎾崇Х濞戭亪骞�?
		}
		
		checkmove(role, sceneid, curpos, poslist,curTick);
		
	}
	
	public static boolean checkmove(Role role,long sceneid, fire.pb.move.Pos curpos,List<fire.pb.move.Pos> poslist, long curTick)
	{
		if(role.getScene().getSceneID() != sceneid) return false;
		
		if(! role.checkMoveUnit())
		{
			//Scene.logger.debug("闁哄牆顦抽～妤呮嚌閺屻儲袝濞寸厧绉抽懙锟�, 濞达絽妫濆顏堟⒓閻斿吋姣愰柛娆愬灦濞奸潧螞?婵炴潙顑嗙粔鐑藉箒閻ュ" + role.getName() + "\t" + role.getTeamIndex());
			return false;
		}
		
		if (!role.canMove())
		{
			role.confirmCurPosition();
			return false;
		}
		
		if(role.isJumping())
		{
			//role.getJumpRole().confirmPositionToStart();
			return false;
		}
		
		int z = role.getPos().getZ();
		final Position destPos = new Position(curpos.x, curpos.y, z);
		final java.util.List<Position> positions = new java.util.ArrayList<Position>();
		positions.add(role.getPos());// 閻忓繐妫欏﹢鍥礉閳ヨ櫕鐝ゅ☉鎾筹功濞堟垼銇愰幘鍐差枀闁伙拷? 闁告梻濮撮崣鍡涘礆娴煎宕ｉ悹鍥﹁兌閸嬶綁宕氬鎹愬幀
		for(final Pos p : poslist)
			positions.add(new Position(p.x, p.y, z));
		
		final int length = destPos.getDistance(role.getPos());
		if(role.isJumping())
		{
			//濠碘�冲�归悘澶婎潰閿濆懏韬悹鍝勭枃缁岋拷
			if(!role.getJumpRole().checkValidJump(positions, destPos))
			{
				role.getJumpRole().confirmPositionToStart();
				return false;
			}
		}
		else
		{
			// 闁哄秷顫夊畵浣烘崉椤栨粌娈犻梻锟介崹顔碱唺閺夆晜绋栭、鎴︽焻閻斿嘲顔婇柛鎺嬪�栭弻锟�
			int cruiseid = role.getCruiseid();
			if(! role.checkValidMove(cruiseid, positions, destPos, curTick, length))
			{
				role.confirmCurPosition();
				return false;
			}
		}
		role.move(destPos);
		if(!role.isJumping())
			SceneBattle.process(role, length, curTick);
		return true;
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790435;

	public int getType() {
		return 790435;
	}

	public fire.pb.move.Pos curpos; // 人物当前点
	public java.util.LinkedList<fire.pb.move.Pos> poslist; // 路径上的关键点
	public long sceneid; // 场景id

	public CCheckMove() {
		curpos = new fire.pb.move.Pos();
		poslist = new java.util.LinkedList<fire.pb.move.Pos>();
	}

	public CCheckMove(fire.pb.move.Pos _curpos_, java.util.LinkedList<fire.pb.move.Pos> _poslist_, long _sceneid_) {
		this.curpos = _curpos_;
		this.poslist = _poslist_;
		this.sceneid = _sceneid_;
	}

	public final boolean _validator_() {
		if (!curpos._validator_()) return false;
		for (fire.pb.move.Pos _v_ : poslist)
			if (!_v_._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(curpos);
		_os_.compact_uint32(poslist.size());
		for (fire.pb.move.Pos _v_ : poslist) {
			_os_.marshal(_v_);
		}
		_os_.marshal(sceneid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		curpos.unmarshal(_os_);
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			fire.pb.move.Pos _v_ = new fire.pb.move.Pos();
			_v_.unmarshal(_os_);
			poslist.add(_v_);
		}
		sceneid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCheckMove) {
			CCheckMove _o_ = (CCheckMove)_o1_;
			if (!curpos.equals(_o_.curpos)) return false;
			if (!poslist.equals(_o_.poslist)) return false;
			if (sceneid != _o_.sceneid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += curpos.hashCode();
		_h_ += poslist.hashCode();
		_h_ += (int)sceneid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(curpos).append(",");
		_sb_.append(poslist).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


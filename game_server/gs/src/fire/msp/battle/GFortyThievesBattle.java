
package fire.msp.battle;

import fire.pb.scene.MonsterInfo;
import fire.pb.scene.SceneClient;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.movable.SceneTeam;
import fire.pb.scene.sPos.GridPos;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFortyThievesBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFortyThievesBattle extends __GFortyThievesBattle__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		SceneTeam team = role.getTeam();
		NPC npc =SceneNpcManager.getInstance().getNpcByKey(npckey);
		if(team == null)
		{
			//没有队伍
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(), null);
			return;
		}
		//if(team.getNormalTeamMemebers().size()<2)
		if(team.size() < 2)
		{
			//队伍人数小于3人
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 141485, npc.getNpcID(),null);
			return;
		}
		
	
		
		MonsterInfo monsterInfo = npc.getScene().getMapInfo().getMonsterInfo();	
		if(monsterInfo == null)
			return;//区域暗雷怪信息为空
		
		GridPos pos = npc.getPos().toGridPos();
		int areaconf = monsterInfo.getMonsterConfig(pos.getX(), pos.getY());
		if(areaconf == 0)
			return;//没有暗雷区域配置
		
		
		SceneClient.pSend(new MFortyThievesBattle(roleid, npckey,areaconf));
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 727898;

	public int getType() {
		return 727898;
	}

	public long roleid;
	public long npckey; // 四十大盗的npckey

	public GFortyThievesBattle() {
	}

	public GFortyThievesBattle(long _roleid_, long _npckey_) {
		this.roleid = _roleid_;
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFortyThievesBattle) {
			GFortyThievesBattle _o_ = (GFortyThievesBattle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GFortyThievesBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.msp.task;




import fire.pb.item.PEquipRideProc;
import fire.pb.item.Pack;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GChangeShape__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GChangeShape extends __GChangeShape__ {
	@Override
	protected void process() {
		// protocol handle
		fire.pb.scene.movable.Role  role = 
			fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(playerid);
		if(role == null) return;
		if(null == role.getScene()) return;
		
		if(changetype == 0) {
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape){
				role.setTransformid(0);//å˜èº«å›åŸæ¥çš„æ ·å­ï¼Œæ¸…é™¤å˜èº?
			}
			else
				role.setTransformid(shape);
			role.sendWhoSeeMeAndMe(send);
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if(changetype == 1) {
			//å¤„ç†npcè·Ÿéš
			if(shape == 0) {
				fire.pb.mission.SNpcFollowEnd send = new fire.pb.mission.SNpcFollowEnd();
				send.npcid = shape;
				role.send(send);
			} else {
				fire.pb.mission.SNpcFollowStart send = new fire.pb.mission.SNpcFollowStart();
				send.npcid = shape;
				role.send(send);
			}
		} else if(changetype == 2) {
			//å¤„ç†æœ‰åéª‘çš„æ—¶å?™ï¼Ÿ
			xbean.TransfromInfo ti = xtable.Transfromroles.select(playerid);
			int rideid = 0;
			if (ti != null) {
				rideid = ti.getRide();
			}
			fire.pb.move.STransfromShape send = new fire.pb.move.STransfromShape();
			send.shape = shape;
			send.playerid = playerid;
			if(role.getModeid() == shape) {
				role.setTransformid(0);//å˜èº«å›åŸæ¥çš„æ ·å­ï¼Œæ¸…é™¤å˜èº?
			}
			else {
				role.setTransformid(shape);
			}
			role.sendWhoSeeMeAndMe(send);	
			if(rideid > 0){
				final Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(role.getRoleID(), fire.pb.item.BagTypes.BAG, true);
				if (bag.getItemNum(rideid, 0) > 0) 
					new PEquipRideProc(playerid, rideid, -1).submit();
			}
			Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
			SAddUserScreen sadduser = new SAddUserScreen();
			sadduser.rolelist.add(addRole.getRoleBasic());
			gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		} else if (changetype == 3) {
			//æ¥ä»»åŠ¡æ—¶å¼?å§‹å·¡æ¸?
		//	role.setCruiseid(shape);//è®¾ç½®å·¡æ¸¸çŠ¶æ?ï¼ŒMarshal()
		//	role.setCruiseid2(shape2);
			//role.setCruiseid3(shape3);
		//	Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
		//	SAddUserScreen sadduser = new SAddUserScreen();
		//	sadduser.rolelist.add(addRole.getRoleBasic());
		//	role.sendWhoSeeMeAndMe(sadduser);
			//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
		}
		else if (changetype == 4)
		{
			//å®Œæˆä»»åŠ¡æˆ–è?…ä¸‹çº¿æ—¶å–æ¶ˆå·¡æ¸¸
			if(role.getCruiseid() == shape || role.getCruiseid() == 0) {
				role.setCruiseid(0);//è®¾ç½®å·¡æ¸¸çŠ¶æ?ï¼ŒMarshal()
				role.setCruiseid2(0);
				role.setCruiseid3(0);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}
		} else if (changetype == 5) {
				//ä¸­é?”æ›´æ–? by changhao
				role.setCruiseid(shape);//è®¾ç½®å·¡æ¸¸çŠ¶æ?ï¼ŒMarshal()
				role.setCruiseid2(shape2);
				role.setCruiseid3(shape3);
				Role addRole = RoleManager.getInstance().getRoleByID(role.getRoleID());
				SAddUserScreen sadduser = new SAddUserScreen();
				sadduser.rolelist.add(addRole.getRoleBasic());
				role.sendWhoSeeMe(sadduser);
				//gnet.link.Onlines.getInstance().send(role.getRoleID(), sadduser);
			}

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 739900;

	public int getType() {
		return 739900;
	}

	public long playerid; // Íæ¼Òid
	public int shape;
	public int shape2;
	public int shape3;
	public int changetype; // 0ÊÇ±äÉí£¬1ÊÇnpc¸úËæ£¬2ÓĞ×ùÆïÊ±£¬3Ñ²ÓÎ£¬4È¡ÏûÑ²ÓÎ

	public GChangeShape() {
	}

	public GChangeShape(long _playerid_, int _shape_, int _shape2_, int _shape3_, int _changetype_) {
		this.playerid = _playerid_;
		this.shape = _shape_;
		this.shape2 = _shape2_;
		this.shape3 = _shape3_;
		this.changetype = _changetype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(playerid);
		_os_.marshal(shape);
		_os_.marshal(shape2);
		_os_.marshal(shape3);
		_os_.marshal(changetype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		playerid = _os_.unmarshal_long();
		shape = _os_.unmarshal_int();
		shape2 = _os_.unmarshal_int();
		shape3 = _os_.unmarshal_int();
		changetype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GChangeShape) {
			GChangeShape _o_ = (GChangeShape)_o1_;
			if (playerid != _o_.playerid) return false;
			if (shape != _o_.shape) return false;
			if (shape2 != _o_.shape2) return false;
			if (shape3 != _o_.shape3) return false;
			if (changetype != _o_.changetype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)playerid;
		_h_ += shape;
		_h_ += shape2;
		_h_ += shape3;
		_h_ += changetype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(playerid).append(",");
		_sb_.append(shape).append(",");
		_sb_.append(shape2).append(",");
		_sb_.append(shape3).append(",");
		_sb_.append(changetype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GChangeShape _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(playerid - _o_.playerid);
		if (0 != _c_) return _c_;
		_c_ = shape - _o_.shape;
		if (0 != _c_) return _c_;
		_c_ = shape2 - _o_.shape2;
		if (0 != _c_) return _c_;
		_c_ = shape3 - _o_.shape3;
		if (0 != _c_) return _c_;
		_c_ = changetype - _o_.changetype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.mission;


import fire.pb.map.MapConfig;
import fire.pb.mission.fairyland.FairylandMgr;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReturnFairyland__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReturnFairyland extends __CReturnFairyland__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		//閸忓牊鐗撮幑顔绘崲閸斺剝娼甸崚銈嗘焽閺勵垰鎯侀懗鍊熺箲閸ョ偞鈪垫晶?
		
		final fire.pb.map.Role role = fire.pb.map.RoleManager.getInstance().getRoleByID(roleid);
		if (role==null)
			return ;
		MapConfig mc = role.getCurMapConfig();
		if (!(mc.getDynamic()==0&&mc.getVisibletype()==0)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143366, null);
			return;
		}
		xbean.RolePos rolePos = xtable.Roleposes.select(roleid);
		//if (rolePos==null||rolePos.getDynamicmap()<1500) {
		//闁姤瀵滈悡褌鎹㈤崝鈩冩降閹垫崘鐑︽潪顒傛畱閸︽澘娴�,閸ョ姳璐熸稊瀣鐎涙娈戦崸鎰垼閸欘垵鍏橀崶鐘辫礋缂佸嫰妲﹂弳鍌滎瀲缁傚妲︾粵澶婂斧閸ョ姳绗夐崙?
			MissionMajorScenario majorTask = new MissionMajorScenario( roleid, true );
			MissionConfig conf = majorTask.getConf();
			if ( conf == null )
				return;
			
		//	MissionConfig.MissionRewardInfo rewardInfo = conf.rewardInfo;
			if ( FairylandMgr.isInDreamMap(conf.exeIndo.mapID ) ) {
				fire.pb.mission.fairyland.FairylandMgr.getInstance().enterIntoDreamLand(roleid, conf.exeIndo.mapID, rolePos.getDynamicposx(), rolePos.getDynamicposy(),false,true );
			}
			
			return;
		//}
//		else {
//			int mapid = rolePos.getDynamicmap();
//			int posx = rolePos.getDynamicposx();
//			int posy = rolePos.getDynamicposy();
//			fire.pb.mission.dreamland.DreamLandManager.getInstance().enterIntoDreamLand(roleid, mapid, posx, posy,false,true);
//		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 805455;

	public int getType() {
		return 805455;
	}


	public CReturnFairyland() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReturnFairyland) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReturnFairyland _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


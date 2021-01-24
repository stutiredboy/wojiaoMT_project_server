
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
		//闁稿繐鐗婇悧鎾箲椤旂粯宕查柛鏂哄墲濞肩敻宕氶妶鍡樼劷闁哄嫷鍨伴幆渚�鎳楅崐鐔虹闁搞儳鍋為埅鍨櫠?
		
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
		//闂侇喛濮ょ�垫粓鎮¤閹广垽宕濋埄鍐╅檷闁瑰灚宕橀悜锔芥姜椤掑倹鐣遍柛锔芥緲濞达拷,闁搞儳濮崇拹鐔哥▕鐎ｎ亜顤呴悗娑欘焽濞堟垿宕搁幇顓犲灱闁告瑯鍨甸崗姗�宕堕悩杈缂備礁瀚板Σ锕傚汲閸屾粠鐎茬紒鍌氼煼濡诧妇绮垫径濠傛枾闁搞儳濮崇粭澶愬礄?
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


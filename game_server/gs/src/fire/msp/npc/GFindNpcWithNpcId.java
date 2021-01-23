
package fire.msp.npc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import fire.pb.activity.timernpc.TimerNpcService;
import fire.pb.game.SUseXueYueKey;
import fire.pb.map.Npc;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GFindNpcWithNpcId__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GFindNpcWithNpcId extends __GFindNpcWithNpcId__ {
	@Override
	protected void process() {
		// protocol handle
		int actId = TimerNpcService.getInstance().getActId(npcid);
		//婵炶尪顕ф慨鈺呮煥濞嗘帩鍤�
		if (actId == -1) {
			return;
		}
		
		boolean findit = false;
		int findmapid = 0;
		int findposx = 0;
		int findposy = 0;
		long npckey = 0;
		
		Role sceneRole = RoleManager.getInstance().getRoleByID(roleid);
		int roleMapid = sceneRole.getMapId();
		
		//闁稿繐鐗嗗﹢顏囥亹閹惧啿顤呴悷娆忔閸ｅ綊鏌岀仦鎯ь棟缂佺姴宕悺锟�
		fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		Map<Long, NPC> allNpcInScreens = role.getAllNpcsInScreens();
		for (NPC npc : allNpcInScreens.values()) {
			if (npc.getNpcID() == npcid) {
				findit = true;
				findmapid = npc.getScene().getMapID();
				findposx = npc.getPos().toGridPos().getX();
				findposy = npc.getPos().toGridPos().getY();
				npckey = npc.getNpcKey();
				break;
			}
		}
		
		//鐟滅増鎸告晶鐘垫喆閸℃稑娅ｉ梺鎻掓湰閻ュ懘寮垫径瀣棟闁革拷?,闁告帗鐟ュ﹢顏囥亹閹惧啿顤呴柛锔芥緲濞存﹢骞�?
		if (!findit) {
			xbean.timerNpcInfoCol npcInfo = xtable.Timernpcinfotable.select(actId);
			if (npcInfo == null) {
				return;
			}
			
			List<Long> npcList = new ArrayList<Long>();
			for (Map.Entry<Long, xbean.timerNpcInfo> npcinfos : npcInfo.getNpcinfo().entrySet()) {
				//閻庣數鎳撶花鐬c闁汇劌瀚慨鎼佸箑? 0=缂佸本妞藉Λ锟� 1=闁瑰瓨蓱閺嬬喐绋�? 2=鐎规瓕灏欑划鈥斥槈閸縿浜�
				if (npcinfos.getValue().getNpcstatus() == 0) { //婵炲备鍓濆﹢浣糕槈閸縿浜�
					npcList.add(npcinfos.getKey());
				}
			}
			
			for (Long npckeyy : npcList) {
				Npc npc = SceneNpcManager.selectNpcByKey(npckeyy);
				if (npc == null)
					continue;
				
				if (roleMapid == npc.getMapId()) {
					findit = true;
					findmapid = roleMapid;
					findposx = npc.getPos().toGridPos().getX();
					findposy = npc.getPos().toGridPos().getY();
					npckey = npckeyy;
					break;
				}
			}
		}
		
		if (!findit) {
			xbean.timerNpcInfoCol npcInfo = xtable.Timernpcinfotable.select(actId);
			if (npcInfo == null) {
				return;
			}
			
			List<Long> npcList = new ArrayList<Long>();
			for (Map.Entry<Long, xbean.timerNpcInfo> npcinfos : npcInfo.getNpcinfo().entrySet()) {
				//閻庣數鎳撶花鐬c闁汇劌瀚慨鎼佸箑? 0=缂佸本妞藉Λ锟� 1=闁瑰瓨蓱閺嬬喐绋�? 2=鐎规瓕灏欑划鈥斥槈閸縿浜�
				if (npcinfos.getValue().getNpcstatus() == 0) { //婵炲备鍓濆﹢浣糕槈閸縿浜�
					npcList.add(npcinfos.getKey());
				}
			}
			
			int index = Misc.getRandomBetween(0, npcList.size() - 1);
			npckey = npcList.get(index);
			
			Npc npc = SceneNpcManager.selectNpcByKey(npckey);
			if (npc == null) {
				MessageMgr.psendMsgNotify(roleid, 170021, null);
				return;
			}
			findit = true;
			findmapid = npc.getMapId();
			findposx = npc.getPos().toGridPos().getX();
			findposy = npc.getPos().toGridPos().getY();
		}
		
		if (!findit)
			return;
		
		SUseXueYueKey useKey = new SUseXueYueKey(npcid, npckey, findmapid, findposx, findposy);
		gnet.link.Onlines.getInstance().send(roleid, useKey);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730436;

	public int getType() {
		return 730436;
	}

	public long roleid;
	public int npcid;

	public GFindNpcWithNpcId() {
	}

	public GFindNpcWithNpcId(long _roleid_, int _npcid_) {
		this.roleid = _roleid_;
		this.npcid = _npcid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(npcid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		npcid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GFindNpcWithNpcId) {
			GFindNpcWithNpcId _o_ = (GFindNpcWithNpcId)_o1_;
			if (roleid != _o_.roleid) return false;
			if (npcid != _o_.npcid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += npcid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(npcid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GFindNpcWithNpcId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = npcid - _o_.npcid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


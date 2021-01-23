package fire.msp.npc;

import fire.msp.move.DynamicSceneParams;
import fire.pb.move.DynamicSceneType;
import fire.pb.scene.MapUtil;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneFactory;
import fire.pb.scene.SceneManager;
import fire.pb.scene.manager.SceneNpcManager;
import fire.pb.scene.movable.NPC;
import fire.pb.scene.sPos.GridPos;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCreateNPCByMap__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCreateNPCByMap extends __GCreateNPCByMap__ {
	@Override
	protected void process() {

		Scene scene = null;
		GridPos gpos = null;
		try {
			NPC n = SceneNpcManager.getInstance().createNpcWithKey(npc.npckey,
					npc.npcbaseid, npc.name, npc.dir);
			if (n == null) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闁稿浚鍏涚槐浼村礈椤栨稒鎷遍柛鎺楁敱??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid));
				}
			}
			if (npc.ownerid > 0) {
				scene = SceneManager.getInstance().getSceneByMapAndOwner((int) npc.sceneid, npc.ownerid);
				if (scene == null) {
					DynamicSceneParams params = new DynamicSceneParams();
					scene = SceneFactory.createDynamicScene((int)npc.sceneid, npc.ownerid, "",
							-1, DynamicSceneType.NORMAL_SCENE, params.marshal(new OctetsStream()));
					
					SceneManager.logger.error(new StringBuilder().append("闁稿浚鍏涚槐浼村礈椤栨稒鎷遍柛鎺楁敱??:").append(npc.npcbaseid)
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID())
							.append(",npckey:").append(npc.npckey));
				}
			}
			else
				scene = SceneManager.getInstance().getSceneByID(npc.sceneid);
			gpos = MapUtil.getRandomArrivablePos(scene.getSceneID(), toufangareatype);
			int mapid = (int) npc.sceneid;
			if (mapid >= 1851 && mapid <= 1870) {
				if (SceneManager.logger.isInfoEnabled()) {
					SceneManager.logger.info(new StringBuilder().append("闁稿浚鍏涚槐浼村礈椤栨稒鎷遍柛鎺楁敱??:").append(npc.npcbaseid)
							.append(",闁秆勫姈閻栵綁寮伴悿锟�:").append(gpos.getX())
							.append(",闁秆勫姈閻栵綁寮伴惀锟�:").append(gpos.getY())
							.append(",sceneid:").append(npc.sceneid)
							.append(",ownerid:").append(npc.ownerid)
							.append(",sceneidlong:").append(scene.getSceneID())
							.append(",npckey:").append(npc.npckey));
				}
			}
				
			SceneNpcManager.getInstance().summonNpcAndUpdateGS(scene, gpos.toPosition(), n, npc.time);
		} catch (Exception e) {
			SceneManager.logger.error("create npc by map failed.npcid:"
					+ npc.npcbaseid + ",sceneid:" + npc.sceneid + ",ownerid:" + npc.ownerid + ",scene:" + scene
					+ ",pos:" + gpos, e);
			if (scene != null) {
				SceneManager.logger.error("sceneidlong:" + scene.getSceneID());
			}
		}
		// System.out.println("濠㈠爢鍡樼彧闁告帗绋戠紓鎾寸閸濆C 闁匡拷? " + n.getName() + "闁秆勫姈閻栵綁寮伴銈囩獥 X 闁炽儲鏌�??" +
		// gpos.getX() + "Y 闁炽儲鏌�??" + gpos.getY());

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730398;

	public int getType() {
		return 730398;
	}

	public fire.msp.npc.CreateNpcInfo npc;
	public int toufangareatype; // 0-普通的投放区域,1-新的投放区域,包含1级轻功

	public GCreateNPCByMap() {
		npc = new fire.msp.npc.CreateNpcInfo();
	}

	public GCreateNPCByMap(fire.msp.npc.CreateNpcInfo _npc_, int _toufangareatype_) {
		this.npc = _npc_;
		this.toufangareatype = _toufangareatype_;
	}

	public final boolean _validator_() {
		if (!npc._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npc);
		_os_.marshal(toufangareatype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npc.unmarshal(_os_);
		toufangareatype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCreateNPCByMap) {
			GCreateNPCByMap _o_ = (GCreateNPCByMap)_o1_;
			if (!npc.equals(_o_.npc)) return false;
			if (toufangareatype != _o_.toufangareatype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += npc.hashCode();
		_h_ += toufangareatype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npc).append(",");
		_sb_.append(toufangareatype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

package fire.pb.mission.instance.line;
import java.util.Map;

import fire.pb.map.SceneNpcManager;
import fire.pb.scene.DynamicScene;
import fire.pb.scene.SceneManager;
import fire.pb.scene.movable.NPC;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import mkdb.Lockeys;
import mkdb.Procedure;

public class PArriveLineMap extends Procedure {
	private final long roleid;
	private final long sceneid;
	
	public PArriveLineMap(long roleId, long sceneid) {
		this.roleid = roleId;
		this.sceneid = sceneid;
	}

	@Override
	protected boolean process() throws Exception {
		//为队长    或者没有任务的人
		Team team = TeamManager.selectTeamByRoleId(roleid);
		if (team.getTeamLeaderId() != roleid) {
			return false;
		}
		
		xbean.InstanceInfoCol infoCol = xtable.Roleinstancetask.select(roleid);
		if (infoCol == null)
			return false;
		int instanceId = infoCol.getLastinstanceid();
		if (instanceId == 0)
			return false;
		
		xbean.InstanceTaskInfo info = infoCol.getInstinfo().get(instanceId);
		if (info == null)
			return false;

		xbean.InstanceInfo instanceInfo = xtable.Instancetask.get(info.getInstanceonlyid());
		if (instanceInfo == null)
			return false;
		
		int currentStep = instanceInfo.getCurrentstep();
		// 刷出npc
		if (instanceInfo.getNpcs().isEmpty()) {
			LineInstManager.getInstance().createInstanceNpc(instanceInfo, instanceId, currentStep, info.getInstanceonlyid());
		}
		else {
			xbean.InstanceNpcInfo npcInfo = instanceInfo.getNpcs().get(0);
			if (npcInfo == null)
				return false;
			
			DynamicScene ds = (DynamicScene) SceneManager.getInstance().getSceneByID(sceneid);
			Map<Long, NPC> npcs = ds.getSceneNpcs();
			if (!npcs.containsKey(npcInfo.getNpckey())) {
				//在原有位置上新建一个npc
				long npcKey = SceneNpcManager.getInstance().getNextId();
				SceneNpcManager.createNpcByPos(npcKey, npcInfo.getNpcid(), "", sceneid, npcInfo.getPosx()*16, npcInfo.getPosy()*16, 3, 0);
			}
			
			for (xbean.InstanceNpcInfo asistNpcInfo : instanceInfo.getAsistnpcs()) {
				if (!npcs.containsKey(asistNpcInfo.getNpckey())) {
					//在原有位置上新建一个npc
					long npcKey = SceneNpcManager.getInstance().getNextId();
					SceneNpcManager.createNpcByPos(npcKey, asistNpcInfo.getNpcid(), "", sceneid, asistNpcInfo.getPosx()*16, asistNpcInfo.getPosy()*16, 3, 0);
				}
			}
		}
		
		lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, instanceInfo.getRoleids()));
		Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLEINSTANCETASK, instanceInfo.getRoleids()));
		//通知客户端刷新任务进度
		LineInstManager.getInstance().addStep1Task(instanceInfo);
		return true;
	}
}


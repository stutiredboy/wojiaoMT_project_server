package fire.pb.instancezone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;





import com.locojoy.base.Marshal.OctetsStream;

import fire.log.Logger;
import fire.msp.move.DynamicSceneParams;
import fire.pb.battle.BattleEndHandler;
import fire.pb.battle.BattleField;
import fire.pb.battle.PBattleEnd;
import fire.pb.clan.ClanUtils;
import fire.pb.instancezone.act.Act;
import fire.pb.instancezone.conf.ActionConfig;
import fire.pb.instancezone.conf.ConfigParamName;
import fire.pb.instancezone.conf.InstanceSaveConfig;
import fire.pb.instancezone.conf.InstanceZoneConfig;
import fire.pb.instancezone.conf.NpcConfig;
import fire.pb.instancezone.conf.NpcServiceConfig;
import fire.pb.instancezone.conf.SaveCondition;
import fire.pb.instancezone.conf.SubSaveConfig;
import fire.pb.instancezone.event.Event;
import fire.pb.instancezone.event.OtherEvent;
import fire.pb.instancezone.faction.FactionInstZone;
import fire.pb.instancezone.timer.InstMapTimer;
import fire.pb.instancezone.timer.InstanceTimer;
import fire.pb.item.ItemShuXing;
import fire.pb.map.DuplicateHelper;
import fire.pb.map.MapConfig;
import fire.pb.map.SceneNpcManager;
import fire.pb.map.Transfer;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.move.DynamicSceneType;
import fire.pb.move.SRoleEnterScene;
import fire.pb.npc.NpcServiceManager;
import fire.pb.npc.NpcServices;
import fire.pb.npc.SSendNpcService;
import fire.pb.npc.SSubmit2Npc;
import fire.pb.npc.SVisitNpc;
import fire.pb.npc.SubmitType;
import fire.pb.scene.movable.NPC;
import fire.pb.talk.MessageMgr;
import fire.pb.talk.STransChatMessageNotify2Client;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.CGPlayUtil;
import fire.pb.util.Misc;
import fire.pb.util.Parser;
import mkdb.Lockeys;
import mkdb.Procedure;
import mkdb.Transaction;

public class InstanceZone {
	final private long landkey;
	final private InstanceZoneConfig zoneconfig;
	final private xbean.InstanceZone xzone;
	final protected boolean readonly;

	public static final Logger logger = Logger.getLogger("INSTANCEZONE");

	public InstanceZone(long key, xbean.InstanceZone xzone,
			InstanceZoneConfig zoneconfig, boolean readonly) {
		this.landkey = key;
		this.xzone = xzone;
		this.readonly = readonly;
		this.zoneconfig = zoneconfig;
	}

	public xbean.InstanceZone getZoneBean() {
		return xzone;
	}

	public List<Long> getRoleIds() {
		return xzone.getRoleids();
	}

	public InstanceZoneConfig getZoneConfig() {
		return zoneconfig;
	}

	public long getLandkey() {
		return landkey;
	}

	public int getInstZoneId() {
		return zoneconfig.instZoneId;
	}

	public long getInstanceZoneExtId() {
		return xzone.getExtid();
	}

	public boolean isReadonly() {
		return readonly;
	}

	public boolean isCompleted() {
		return getCurActiveSave() == zoneconfig.cdsave;
	}

	/**
	 * ??????????????????????????????????????????????????????????????????????????????????????????
	 * @param saveid   ??????id
	 * @param roleid
	 * @param gm
	 * @return
	 */
	public boolean init(final int saveid, final long roleid, final boolean gm) {
		if (!gm) {
			if (!validCreate(roleid)) {
				return false;
			}
		}

		xzone.setZonestate(xbean.InstanceZone.STATE_INITING);
		initMap();
		onSaveActived(saveid);

		onCreated();
		xzone.setZonestate(xbean.InstanceZone.STATE_ACTIVE);
		logger.debug("init();" + getDebugInfo());

		return true;
	}

	/**
	 * ??????????????????????????????????????????
	 * @param initstates  ????????????????????????????????????
	 * @return
	 */
	boolean init(Map<Integer, Integer> initstates) {
		xzone.setZonestate(xbean.InstanceZone.STATE_INITING);
		initMap();
		for (NpcConfig npccfg : zoneconfig.npcs.values()) {
			xbean.InstanceNpc xnpc = xbean.Pod.newInstanceNpc();
			xnpc.setNpcbaseid(npccfg.npcbaseId);
			xnpc.setState(npccfg.initstate);
			xzone.getNpcs().put(npccfg.npcbaseId, xnpc);
		}

		// ?????????npc services
		for (NpcServiceConfig servcfg : zoneconfig.npcServices.values()) {
			xbean.InstanceNpcServ xserv = xbean.Pod.newInstanceNpcServ();
			xserv.setServiceid(servcfg.serviceId);
			xserv.setActid(servcfg.initact);
			xzone.getServices().put(servcfg.serviceId, xserv);
		}

		// ???????????????xbean
		for (Map.Entry<Integer, Integer> save : initstates.entrySet()) {
			xbean.InstanceSave xsave = xbean.Pod.newInstanceSave();
			xsave.setSaveid(save.getKey());
			xsave.setState(save.getValue());
			xzone.getSaves().put(save.getKey(), xsave);
		}

		// ????????????????????????????????????
		for (int saveId = 1; saveId <= zoneconfig.saves.size(); saveId++) {
			InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
			if (savecfg == null)
				continue;

			xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
			if (xsave == null)
				continue;

			if (xsave.getState() == InstanceText.INACTIVE)// ?????????
				continue;

			else if (xsave.getState() == InstanceText.ACTIVE)// ?????????
				onSaveActived(saveId);

			else if (xsave.getState() == InstanceText.COMPLETE)// ?????????
			{
				onSaveActived(saveId);
				onSaveCompleted(saveId);
			}
		}

		onCreated();
		xzone.setZonestate(xbean.InstanceZone.STATE_ACTIVE);
		logger.debug("init();" + getDebugInfo());
		return true;
	}

	private String getDebugInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("??????id:" + xzone.getInstzoneid());
		sb.append("????????????:" + xzone.getZonestate());
		sb.append("????????????:" + xzone.getRoleids().size());
		sb.append("????????????:");
		for (Map.Entry<Integer, xbean.InstanceSave> entry : xzone.getSaves()
				.entrySet()) {
			sb.append("\t[??????:" + entry.getValue().getSaveid() + ",??????:"
					+ entry.getValue().getState() + "]");
			sb.append("\t\t?????????:");
			for (Map.Entry<Integer, Integer> e : entry.getValue().getSubsaves()
					.entrySet()) {
				sb.append("(" + e.getKey() + "," + e.getValue() + ")");
			}
		}
		sb.append("????????????,??????!");
		return sb.toString();
	}

	/**
	 * ???????????????<h1>MAPMAIN??????</h1>????????????????????????
	 */
	private void initMap() {
		for (MapConfig mapcfg : zoneconfig.maps.values()) {
			int mapId = mapcfg.id;
			if (mapcfg.dynamic == 1) {// ??????????????????????????????????????????
				DynamicSceneParams params = new DynamicSceneParams();
				DuplicateHelper.createDynamicMap(mapId, getLandkey(), "",
						true, -1, DynamicSceneType.NORMAL_SCENE, params.marshal(new OctetsStream()));
			}
		}
	}

	/**
	 * ??????????????????Timer?????????????????????????????????????????????
	 */
	protected void onCreated() {
		// ??????????????????Timer?????????????????????????????????????????????
		xbean.InstanceTimer xtimer = xzone.getTimers().get(0);
		if (xtimer != null) {
			xtable.Timerfutures.remove(xtimer.getFuturekey());
		}

		long now = System.currentTimeMillis();
		long refreshperiod = (zoneconfig.getRefreshTime(now) - now);
		xtimer = xbean.Pod.newInstanceTimer();
		xzone.getTimers().put(0, xtimer);
		xtimer.setStarttime(System.currentTimeMillis());
		xtimer.setState(xbean.InstanceTimer.STATE_START);
		xbean.TimerFuture xfuture = xbean.Pod.newTimerFuture();
		xfuture.setFuture(mkdb.Executor.getInstance().schedule(
				new InstanceTimer(landkey, 0), refreshperiod,
				TimeUnit.MILLISECONDS));
		Long futurekey = xtable.Timerfutures.insert(xfuture);
		xtimer.setFuturekey(futurekey);
	}

	private void onSaveActived(final int saveId) {
		///////////////////////
		// ????????????
		onSaveChanged(new SaveCondition(saveId,
				SaveCondition.CHANGE_TYPE_ACTIVE));

		if (saveId != zoneconfig.cdsave) {// ????????????????????????
			InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
			// ????????????NPC
			logger.info((new StringBuilder().append("nextsave:").append(landkey).append(" ??????:").append(saveId)));
			onNpcChange(savecfg);
			// ????????????????????????????????????
			Module.getInstance().cancleInstMapFuture(getLandkey());
			// ?????????????????????????????????
			ScheduledFuture<?> addTask = mkdb.Mkdb.executor()
					.scheduleAtFixedRate(
							new InstMapTimer(getLandkey(),
									saveId, zoneconfig.instZoneId), Module.INSTANCE_MAP_TIMER,
							Module.INSTANCE_MAP_TIMER, TimeUnit.SECONDS);
			Module.getInstance().createInstMapFuture(getLandkey(), addTask);
			// ??????????????????
			// playCG(getRoleIds(), savecfg.activeCG);
		} else {
			// ????????????????????????????????????
			Module.getInstance().cancleInstMapFuture(getLandkey());
			// ?????????????????????????????????
			ScheduledFuture<?> addTask = mkdb.Mkdb.executor()
					.scheduleAtFixedRate(
							new InstMapTimer(getLandkey(),
									saveId - 1,  zoneconfig.instZoneId), Module.INSTANCE_MAP_TIMER,
							Module.INSTANCE_MAP_TIMER, TimeUnit.SECONDS);
			Module.getInstance().createInstMapFuture(getLandkey(), addTask);
		}

		logger.debug("onSaveActived();" + getDebugInfo());
	}

	public void gmSaveCompleted(int saveId) {
		onSaveCompleted(saveId);
	}

	protected void onSaveCompleted(int saveId) {
		onSaveChanged(new SaveCondition(saveId,
				SaveCondition.CHANGE_TYPE_COMPLETE));

		if (getZoneState() != xbean.InstanceZone.STATE_ACTIVE) {
			return;
		}

		InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
		// ??????????????????
		playCG(getRoleIds(), savecfg.endCG);

		// ????????????????????????????????????
		for (int activesaveId : zoneconfig.saves.keySet()) {
			if (triggerSaveActived(activesaveId)) {
				onSaveActived(activesaveId);
				if (activesaveId == zoneconfig.cdsave)
					onZoneCompleted();
			}
		}

		logger.debug("onSaveCompleted();" + getDebugInfo());
	}

	protected void onZoneCompleted() {
		// ??????????????????
		logger.debug("onZoneCompleted();" + getDebugInfo());
	}

	protected void playCG(Collection<Long> roleIds, int cgId) {
		if (cgId <= 0)
			return;
		for (long roleId : roleIds)
			CGPlayUtil.sendStartCGProtocal(roleId, cgId);
	}
	
	public boolean updateSubSave(int saveId, int subsaveId, int addcount) {
		return updateSubSave(new LinkedList<Long>(), saveId, subsaveId,
				addcount);
	}

	public boolean updateSubSave(long roleId, int saveId, int subsaveId,
			int addcount) {
		List<Long> roleIds = new LinkedList<Long>();
		roleIds.add(roleId);
		return updateSubSave(roleIds, saveId, subsaveId, addcount);
	}

	public boolean updateSubSave(List<Long> roleIds, int saveId, int subsaveId,
			int addcount) {
		if (addcount <= 0)
			return false;
		InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
		if (savecfg == null)
			return false;
		SubSaveConfig subsavConfig = savecfg.subsaves.get(subsaveId);
		if (subsavConfig == null)
			return false;

		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave == null)
			return false;
		if (xsave.getState() != InstanceText.ACTIVE)
			return false;

		// ?????????????????????
		for (int conflictId : subsavConfig.conflictSubSaveIds) {
			if (isSubSaveCompleted(saveId, conflictId))
				return false;
		}

		Integer count = xsave.getSubsaves().get(subsaveId);
		if (count == null)
			count = 0;
		if (count >= subsavConfig.maxcount)
			return false;

		count = Math.min(subsavConfig.maxcount, count + addcount);
		xsave.getSubsaves().put(subsaveId, count);

		onSubSaveChanged(saveId, subsaveId, count, subsavConfig.maxcount);// ???????????????
		return true;
	}

	void onSubSaveChanged(int saveId, int subsaveId, int count, int maxcount) {
		if (count >= maxcount)
			onSubSaveCompleted(saveId, subsaveId);

		logger.debug("onSubSaveChanged();" + getDebugInfo());
	}

	protected void onSubSaveCompleted(int saveId, int subsaveId) {
		InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
		if (savecfg == null)
			return;
		SubSaveConfig subsavConfig = savecfg.subsaves.get(subsaveId);
		if (subsavConfig == null)
			return;

		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave == null)
			return;
		SaveCondition condition = new SaveCondition(saveId,
				SaveCondition.CHANGE_TYPE_SUBSAVES);
		Map<Integer, Boolean> subsaves = getSubSaveStates(saveId);
		if (subsaves == null)
			return;
		condition.setSubSaves(subsaves);
		onSaveChanged(condition);

		// ??????????????????????????????
		if (triggerSaveCompleted(saveId))
			onSaveCompleted(saveId);

		logger.debug("onSubSaveCompleted();" + getDebugInfo());
	}

	private void onSaveChanged(SaveCondition savecondition) {

		for (NpcServiceConfig servcfg : zoneconfig.npcServices.values()) {
			Integer actId = servcfg.getSaveChange(savecondition);
			if (actId != null)
				changeServiceAct(servcfg.serviceId, actId);
		}

		if (getZoneState() != xbean.InstanceZone.STATE_ACTIVE)
			return;
	}

	private boolean changeServiceAct(int serviceId, int actId) {
		if (actId < 0)
			return false;
		xbean.InstanceNpcServ xserv = xzone.getServices().get(serviceId);
		if (xserv == null)
			return false;
		if (xserv.getActid() == actId)
			return false;
		xserv.setActid(actId);
		return true;
	}

	private Map<Integer, Boolean> getSubSaveStates(int saveId) {
		InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
		if (savecfg == null)
			return null;

		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave == null)
			return null;
		if (xsave.getState() == InstanceText.INACTIVE)
			return null;

		Map<Integer, Boolean> subsaves = new HashMap<Integer, Boolean>();
		for (int subSaveId : savecfg.subsaves.keySet()) {
			boolean complete = Module.isSubSaveCompleted(xsave, savecfg,
					subSaveId);
			subsaves.put(subSaveId, complete);
		}
		return subsaves;
	}

	boolean isSaveCompleted(int saveId) {
		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave == null)
			return false;

		if (xsave.getState() == InstanceText.COMPLETE)
			return true;

		return false;
	}

	boolean isSubSaveCompleted(int saveId, int subsaveId) {
		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave == null)
			return false;

		if (xsave.getState() == InstanceText.INACTIVE)
			return false;

		InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);

		return Module.isSubSaveCompleted(xsave, savecfg, subsaveId);
	}

	public int getZoneState() {
		return xzone.getZonestate();
	}

	private boolean triggerSaveActived(int saveId) {
		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave != null) {
			if (xsave.getState() == InstanceText.COMPLETE) {
				return false;// ??????????????????????????????
			}

			if (xsave.getState() == InstanceText.ACTIVE) {
				return false;// ??????????????????????????????
			}
		}
		InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
		if (savecfg == null) {
			return false;
		}
		if (savecfg.canActive(xzone.getSaves())) {// ????????????
			if (xsave == null) {
				xsave = xbean.Pod.newInstanceSave();
				xzone.getSaves().put(saveId, xsave);
			}
			xsave.setSaveid(saveId);
			xsave.setState(InstanceText.ACTIVE);
			return true;
		}
		return false;
	}

	public boolean triggerSaveCompleted(int saveId) {
		xbean.InstanceSave xsave = xzone.getSaves().get(saveId);
		if (xsave == null)
			return false;// ?????????

		if (xsave.getState() == InstanceText.COMPLETE)
			return false;// ??????????????????????????????

		if (xsave.getState() == InstanceText.INACTIVE)
			return false;// ????????????

		if (xsave.getState() == InstanceText.ACTIVE) {
			InstanceSaveConfig savecfg = zoneconfig.saves.get(saveId);
			if (savecfg == null)
				return false;
			if (savecfg.canComplete(xsave)) {
				xsave.setState(InstanceText.COMPLETE);
				return true;
			}
		}
		return false;
	}
	
	public boolean sendNpcServices(long roleId, long npckey) {
		NPC npc = fire.pb.scene.manager.SceneNpcManager.getInstance().getNpcByKey(npckey);
		if (npc == null)
			return false;
		
		//???????????????npc,???????????????????????????????????????
		final SVisitNpc svisitNpc = new SVisitNpc();
		svisitNpc.npckey = npckey;
		
		svisitNpc.services.add(NpcServices.WATCH_INST_NPC_BATTLE);
		svisitNpc.services.add(NpcServices.END_INST_NPC_BATTLE);
		
		gnet.link.Onlines.getInstance().send(roleId, svisitNpc);
		
		return true;
	}

	public boolean sendNpcServices(long roleId, long npckey, int npcId) {
		// ??????npc???????????????
		final java.util.List<Integer> services = NpcServiceManager.getInstance().getServicesIDSByNpcKey(roleId, npckey);
		if (services == null || services.isEmpty())
			return false;

		// ????????????npc?????????????????????????????????
		NpcConfig npccfg = zoneconfig.npcs.get(npcId);
		if (npccfg.rolenumber > 1) {
			// ??????????????????
			fire.pb.team.Team team = fire.pb.team.TeamManager
					.selectTeamByRoleId(roleId);
			if (null == team || !team.isTeamLeader(roleId)) {
				STransChatMessageNotify2Client notify = MessageMgr
						.getMsgNotify(160115, npcId, null);
				gnet.link.Onlines.getInstance().send(roleId, notify);
				return false;
			}

			// ???????????????????????? ??????
			final java.util.List<Long> members = team.getNormalMemberIds();
			if (members.size() < npccfg.rolenumber) {
				STransChatMessageNotify2Client notify = MessageMgr.getMsgNotify(160115, npcId, null);
				gnet.link.Onlines.getInstance().send(roleId, notify);
				return false;
			}
		}

		final SVisitNpc svisitNpc = new SVisitNpc();
		svisitNpc.npckey = npckey;
		for (int i = 0; i < services.size(); i++) {
			Integer serviceId = services.get(i);
			xbean.InstanceNpcServ xserv = xzone.getServices().get(serviceId);
			if (xserv == null) {
				continue;
			}
			if (xserv.getActid() > 0)
				svisitNpc.services.add(serviceId);// ?????????
		}

		int itemid = 0;
		if ((itemid = Module.getInstance().getNpcSubmitItemId(landkey, npckey)) != -1) {
			ItemShuXing iAttr = fire.pb.item.Module.getInstance()
					.getItemManager().getAttr(itemid);
			if (iAttr == null) {
				return true;
			}

			StringBuilder sb = new StringBuilder();
			sb.append("??????").append(iAttr.getName());

			int serviceid = services.get(0);
			SSendNpcService send = new SSendNpcService();
			send.npckey = npckey;
			send.service = serviceid;
			send.title = sb.toString();

			gnet.link.Onlines.getInstance().send(roleId, send);
			return true;
		} else {
			gnet.link.Onlines.getInstance().send(roleId, svisitNpc);
		}

		return true;
	}

	public boolean processEvent(Event event) {
		if (xzone.getZonestate() != xbean.InstanceZone.STATE_ACTIVE)
			return false;// ???????????????????????????????????????????????????
		// ????????????
		if (!zoneconfig.matchEvent(event))
			return false;
		if (!beforeEventProcess(event))
			return false;
		if (!event.process(this))
			return false;
		if (!afterEventProcess(event))
			return false;
		return true;
	}

	public boolean beforeEventProcess(Event event) {
		return true;
	}

	public boolean afterEventProcess(Event event) {
		return true;
	}

	public boolean processOtherEvent(OtherEvent e) {
		return true;
	}

	public boolean actNpcService(long roleId, long npckey, int npcid,
			int serviceId) {
		if (xzone.getZonestate() != xbean.InstanceZone.STATE_ACTIVE)
			return false;

		if (!xzone.getRoleids().contains(roleId))
			return false;

		int actId = getNpcServiceAct(serviceId);
		if (actId <= 0)
			return false;

		ActionConfig actcfg = zoneconfig.acts.get(actId);
		if (actcfg == null)
			return false;

		// ????????????????????????????????????
		if (this instanceof FactionInstZone) {
			if (actcfg.type == ActionConfig.TYPE_SUBMIT_ITEM) {
				int itemId = Module.getInstance().getNpcSubmitItemId(landkey,
						npckey);
				if (itemId == -1)
					return false;
				int posnum = (Integer) actcfg.params.get(ConfigParamName.COUNT);

				SSubmit2Npc snd = new SSubmit2Npc();
				snd.npckey = npckey;
				snd.questid = actId;
				snd.submittype = SubmitType.GUILD_ZONE_ITEM;
				snd.availableids.add(itemId);
				snd.availablepos = posnum;
				if (Transaction.current() == null)
					gnet.link.Onlines.getInstance().send(roleId, snd);
				else
					mkdb.Procedure.psendWhileCommit(roleId, snd);
				return true;
			}
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put(ConfigParamName.ROLE_ID, roleId);
		params.put(ConfigParamName.NPC_KEY, npckey);
		params.put(ConfigParamName.NPC_ID, npcid);
		params.put(ConfigParamName.NPC_SERVICE_ID, serviceId);
		params.putAll(actcfg.params);

		Act act = InstanceZoneFactory.createAction(actcfg, params);
		if (act == null)
			return false;

		return act.process(this);
	}

	Map<Integer, Integer> getSaves() {
		Map<Integer, Integer> saves = new HashMap<Integer, Integer>();
		for (int saveid = 1; saveid <= zoneconfig.saves.size(); saveid++) {
			xbean.InstanceSave xsave = xzone.getSaves().get(saveid);
			if (xsave != null)
				saves.put(saveid, xsave.getState());
		}
		return saves;
	}

	int getNpcServiceAct(int serviceId) {
		xbean.InstanceNpcServ xserv = xzone.getServices().get(serviceId);
		if (xserv == null)
			return 0;
		return xserv.getActid();
	}

	boolean isEmpty() {
		return xzone.getRoleids().isEmpty();
	}

	boolean isFull() {
		return xzone.getRoleids().size() >= zoneconfig.maxrolenum;
	}

	boolean canDestroy(boolean force) {
		if (force)
			return true;
		return isEmpty();
	}

	public boolean transferRoleToZone(long roleId, boolean haveboss) {
		int mapId = zoneconfig.initMapid;
		int gposx = zoneconfig.initPosx;
		int gposy = zoneconfig.initPosy;
		int curactsave = getCurActiveSave();
		if (curactsave == zoneconfig.cdsave) {
			curactsave = zoneconfig.cdsave - 1;
		}

		if (curactsave > 0) {
			InstanceSaveConfig savecfg = zoneconfig.saves.get(curactsave);
			if (savecfg != null && savecfg.mapId != -1) {
				mapId = savecfg.mapId;
				gposx = savecfg.gposx;
				gposy = savecfg.gposy;
			}
		}
		if (!haveboss) {
			// ??????????????????????????????????????????????????????
			MapConfig mapcfg = zoneconfig.maps.get(mapId);
			if (mapcfg.dynamic == 0)
				return Transfer.justGotoWhileCommit(roleId, mapId, gposx, gposy,
						SRoleEnterScene.CHEFU);
			else
				return DuplicateHelper.enterDynamicSceneWhileCommit(roleId, mapId,
						gposx, gposy, landkey, zoneconfig.name, -1,
						DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CHEFU, null);
		}
		else {
			// ??????????????????????????????????????????????????????
			MapConfig mapcfg = zoneconfig.maps.get(mapId);
			if (mapcfg.dynamic == 0)
				return Transfer.justGotoWhileCommit(roleId, mapId, gposx, gposy,
						SRoleEnterScene.CLAN_GOTO);
			else
				return DuplicateHelper.enterDynamicSceneWhileCommit(roleId, mapId,
						gposx, gposy, landkey, zoneconfig.name, -1,
						DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CLAN_GOTO, null);
		}
		
	}

	public void transferRoleOutZone(List<Long> roleIds) {
		// Message.psendMsgNotifyWhileCommit(roleId, 143258);
		for (Long roleId : roleIds) {
			Long battleId = xtable.Roleid2battleid.select(roleId);
			if (battleId != null)
				continue;

			// ?????????
			String roleName = xtable.Properties.selectRolename(roleId);
			// ??????????????????
			xtable.Role2instancezone.remove(roleId);
			// ??????????????????
			if (zoneconfig.outMapid == ClanUtils.MAPID) {
				
				Long clankey=xtable.Properties.selectClankey(roleId);
				
				if (clankey == null||clankey<=0) {
					MessageMgr.sendMsgNotify(roleId, 145077, null);
					final Team team = fire.pb.team.TeamManager
							.selectTeamByRoleId(roleId);
					if (team != null) {
						if (team.isTeamLeader(roleId)) {
							Transfer.justGotoWhileCommit(roleId,
									zoneconfig.outMapid, zoneconfig.outPosx,
									zoneconfig.outPosy, SRoleEnterScene.CHEFU);
						}
					} else {
						Transfer.justGotoWhileCommit(roleId,
								zoneconfig.outMapid, zoneconfig.outPosx,
								zoneconfig.outPosy, SRoleEnterScene.CHEFU);
					}

					continue;
				}
				
				InstanceZone.logger.info("????????????: " + roleName + "????????????");

				final Team team = fire.pb.team.TeamManager
						.selectTeamByRoleId(roleId);
				if (team != null) {
					if (team.isTeamLeader(roleId)) {
						DuplicateHelper.enterDynamicSceneWhileCommit(roleId, ClanUtils.MAPID,
								zoneconfig.outPosx, zoneconfig.outPosy, clankey, zoneconfig.name, -1,
								DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CLAN_GOTO, null);
					}
				} else {
					DuplicateHelper.enterDynamicSceneWhileCommit(roleId, ClanUtils.MAPID,
							zoneconfig.outPosx, zoneconfig.outPosy, clankey, zoneconfig.name, -1,
							DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CLAN_GOTO, null);
				}
			} else {
				InstanceZone.logger.info("????????????: " + roleName + "????????????");
				final Team team = fire.pb.team.TeamManager
						.selectTeamByRoleId(roleId);
				if (team != null) {
					if (team.isTeamLeader(roleId)) {
						Transfer.justGotoWhileCommit(roleId,
								zoneconfig.outMapid, zoneconfig.outPosx,
								zoneconfig.outPosy, SRoleEnterScene.CHEFU);
					}
				} else {
					Transfer.justGotoWhileCommit(roleId, zoneconfig.outMapid,
							zoneconfig.outPosx, zoneconfig.outPosy,
							SRoleEnterScene.CHEFU);
				}
			}
		}
	}

	public void transferRoleOutZone(long roleId) {
		// ?????????
		String roleName = xtable.Properties.selectRolename(roleId);

		// ??????????????????
		if (zoneconfig.outMapid == ClanUtils.MAPID) {
			Long clankey=xtable.Properties.selectClankey(roleId);
			if (clankey == null || clankey<=0) {
				MessageMgr.sendMsgNotify(roleId, 145077, null);
				return;
			}
			
			InstanceZone.logger.debug("????????????: " + roleName + "????????????");
			final Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleId);
			if (team != null) {
				if (team.isTeamLeader(roleId)) {
					DuplicateHelper.enterDynamicSceneWhileCommit(roleId, ClanUtils.MAPID,
							zoneconfig.outPosx, zoneconfig.outPosy, clankey, zoneconfig.name, -1,
							DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CLAN_GOTO, null);
				}
			} else {
				DuplicateHelper.enterDynamicSceneWhileCommit(roleId, ClanUtils.MAPID,
						zoneconfig.outPosx, zoneconfig.outPosy, clankey, zoneconfig.name, -1,
						DynamicSceneType.NORMAL_SCENE, SRoleEnterScene.CLAN_GOTO, null);
			}
		} else {
			InstanceZone.logger.debug("????????????: " + roleName + "????????????");
			final Team team = fire.pb.team.TeamManager
					.selectTeamByRoleId(roleId);
			if (team != null) {
				if (team.isTeamLeader(roleId)) {
					Transfer.justGotoWhileCommit(roleId, zoneconfig.outMapid,
							zoneconfig.outPosx, zoneconfig.outPosy,
							SRoleEnterScene.CHEFU);
				}
			} else {
				Transfer.justGotoWhileCommit(roleId, zoneconfig.outMapid,
						zoneconfig.outPosx, zoneconfig.outPosy,
						SRoleEnterScene.CHEFU);
			}
		}
	}

	boolean enterWhileOnline(long roleId, long sceneid) {
		if (!xzone.getRoleids().contains(roleId)) {
			// ?????????????????????
			if (xzone.getRoleids().size() >= zoneconfig.maxrolenum) {
				transferRoleOutZone(roleId);
				return false;
			}
			xzone.getRoleids().add(roleId);
		}

		int bossid = 0;
		int curactsave = getCurActiveSave();
		if (curactsave > 0) {
			InstanceSaveConfig savecfg = zoneconfig.saves.get(curactsave);
			bossid = savecfg.haveboss;
		}
		
		//??????????????????
		long now = System.currentTimeMillis();
		long refreshperiod = zoneconfig.getRefreshTime(now);//(zoneconfig.getRefreshTime(now) - now);
		
		if (zoneconfig.maps.containsKey((int) sceneid)) {// ??????????????????????????????????????????????????????
			if (bossid > 0) {
				transferRoleToZone(roleId, true);
			}
			else {
				transferRoleToZone(roleId, false);
			}
		}
		else {
			// ??????
			transferRoleOutZone(roleId);
			return false;
		}
		
		SGongHuiFuBenLastTime lastTime = new SGongHuiFuBenLastTime();
		lastTime.lasttime = refreshperiod;
		
		mkdb.Procedure.psendWhileCommit(roleId, lastTime);
		InstanceZone.logger.info(new StringBuilder().append("role enter zone,roleid:")
				.append(roleId).append(",landkey:").append(getLandkey()));
		return true;// ??????
	}

	boolean leaveWhileOffline(long roleId) {
		boolean removed = xzone.getRoleids().remove((Long) roleId);
		// ??????????????????????????????id??????role2instance??????????????????????????????????????????
		if (!removed)
			return false;
		if (checkEmpty())
			onEmpty(roleId, true);
		return true;
	}

	public void afterGoto(long roleId, long oldSceneId, long newSceneId) {
		int newMapId = (int) newSceneId;
		if (!zoneconfig.maps.containsKey(newMapId)) {
			if (!leave(roleId)) {
				xtable.Role2instancezone.remove(roleId);
				Module.logger.error("??????(ID=" + roleId
						+ ")?????????????????????????????????:"
						+ zoneconfig.instZoneId);
			}
		}
	}

	public boolean enter(long roleId, boolean autoSync) {
		List<Long> enterRoles = getValidEnterRoles(roleId);
		if (enterRoles == null || enterRoles.isEmpty())
			return false;// ?????????????????????
		// ???????????????????????????
		if (xzone.getRoleids().size() >= zoneconfig.maxrolenum) {
			// ???????????????????????????
			MessageMgr.psendMsgNotify(roleId, 143031, MessageMgr.getStringList(zoneconfig.maxrolenum));
			return false;
		} else if (xzone.getRoleids().size() + enterRoles.size() > zoneconfig.maxrolenum) {
			// ????????????????????????
			MessageMgr.psendMsgNotify(roleId, 142947, MessageMgr.getStringList(zoneconfig.maxrolenum));
			return false;
		}
		
		//?????????boss
		int bossid = 0;
		int curactsave = getCurActiveSave();
		if (curactsave > 0) {
			InstanceSaveConfig savecfg = zoneconfig.saves.get(curactsave);
			bossid = savecfg.haveboss;
		}
		
		//??????????????????
		long now = System.currentTimeMillis();
		//?????????????????????
		long refreshperiod = zoneconfig.getRefreshTime(now);//(zoneconfig.getRefreshTime(now) - now);
		Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, enterRoles));
		for (Long eroleid : enterRoles) {
			if (!xzone.getRoleids().contains(eroleid))
				xzone.getRoleids().add(eroleid);
			boolean removed = xtable.Role2instancezone.remove(eroleid);
			if (removed)
				Module.logger.error("??????(ID = " + eroleid + ")????????????????????????????????????????????????.??????????????????ID = " + zoneconfig.instZoneId);
			xtable.Role2instancezone.insert(eroleid, landkey);
			
			//?????????????????????????????????
			fire.pb.course.CourseManager.achieveCourse(eroleid, fire.pb.course.CourseType.ACTIVE_COURSE, RoleLiveness.GONG_HUI_FU_BEN, 0);
			//??????????????????????????????
			fire.pb.clan.srv.ClanManage.addClanInstNum(eroleid,1);
			//????????????
			RoleLiveness actrole = RoleLiveness.getRoleLiveness(eroleid);
			if (actrole != null)
				actrole.handleActiveLivenessData(RoleLiveness.GONG_HUI_FU_BEN);
			
			SGongHuiFuBenLastTime lastTime = new SGongHuiFuBenLastTime();
			lastTime.lasttime = refreshperiod;
			
			mkdb.Procedure.psendWhileCommit(eroleid, lastTime);
			
			InstanceZone.logger.info(new StringBuilder().append("role enter zone,roleid:")
					.append(eroleid).append(",landkey:").append(getLandkey()));
		}
		
		// ??????????????????????????????
		if (bossid > 0) {
			if (!transferRoleToZone(roleId, true))
				return false;
		}
		else {
			if (!transferRoleToZone(roleId, false))
				return false;
		}

		return true;
	}

	private List<Long> getValidEnterRoles(long roleId) {
		List<Long> normalRoleIds = new LinkedList<Long>();
		// ??????????????????
		Team team = TeamManager.getTeamByRoleId(roleId);
		if (team != null) {// ?????????
			if (zoneconfig.teamtype == InstanceZoneConfig.TEAM_TYPE_SINGLE)
				return null;
			if (team.isTeamLeader(roleId))
				normalRoleIds.addAll(team.getNormalMemberIds());
			else if (team.isAbsentMember(roleId))
				normalRoleIds.add(roleId);
			else
				return null;
		} else {
			if (zoneconfig.teamtype == InstanceZoneConfig.TEAM_TYPE_TEAM)
				return null;
			normalRoleIds.add(roleId);
		}

		return normalRoleIds;
	}

	public boolean leave(long roleId) {
		if (!xzone.getRoleids().contains(roleId))
			return false;
		List<Long> leaveRoleIds = new LinkedList<Long>();
		// ??????????????????
		Team team = TeamManager.getTeamByRoleId(roleId);
		if (team != null) {// ?????????
			if (team.isTeamLeader(roleId))
				leaveRoleIds.addAll(team.getNormalMemberIds());
			else if (team.isAbsentMember(roleId))
				leaveRoleIds.add(roleId);
		} else
			// ????????????
			leaveRoleIds.add(roleId);

		for (long enterRoleId : leaveRoleIds) {
			xzone.getRoleids().remove(enterRoleId);
			boolean removed = xtable.Role2instancezone.remove(enterRoleId);
			if (!removed)
				Module.logger.error("?????????ID = " + enterRoleId
						+ "??????????????????Role2instancezoneb????????????roleid?????????????????????ID = "
						+ zoneconfig.instZoneId);
		}

		onLeave(roleId);

		if (checkEmpty())
			onEmpty(roleId, false);

		return true;
	}

	private boolean checkEmpty() {
		if (xzone.getRoleids().isEmpty())
			return true;
		return false;
	}

	protected void onLeave(long roleId) {
	}

	protected void onEmpty(long lastroleId, boolean offline) {
	}

	boolean forceLeave(long roleId) {
		if (!leave(roleId))
			return false;
		// ???????????????????????????????????????????????????
		Long battleId = xtable.Roleid2battleid.select(roleId);
		if (battleId != null)
			new PBattleEnd(battleId, BattleField.BATTLE_DRAW).call();
		transferRoleOutZone(roleId);
		return true;
	}

	public boolean destroy(boolean force, boolean shutdown) {
		// ?????????????????????
		Module.getInstance().cancleInstMapFuture(landkey);
		if (!force) {
			InstanceZone.logger.debug("???????????????");
			return false;
		}
		
		if (xzone.getZonestate() != xbean.InstanceZone.STATE_CLOSED) {
			xzone.setZonestate(xbean.InstanceZone.STATE_CLOSING);
			if (zoneconfig.teamtype == InstanceZoneConfig.TEAM_TYPE_ALL) {
				for (long roleId : xzone.getRoleids()) {
					List<String> para = new ArrayList<String>(1);
					para.add(zoneconfig.name);

					MessageMgr.sendMsgNotify(roleId, 160385, para);
					MessageMgr.sendMsgNotify(roleId, 160386, para);
				}
			}
		}

		Procedure.pexecuteWhileCommit(new PTransOutRole(landkey,
				zoneconfig.outPosx, zoneconfig.outPosy));
		
		for (xbean.InstanceTimer xtimer : xzone.getTimers().values()) {
			xbean.TimerFuture f = xtable.Timerfutures.get(xtimer.getFuturekey());
			if (f == null)
				continue;
			f.getFuture().cancel(true);
			xtable.Timerfutures.remove(xtimer.getFuturekey());
		}

		xzone.setZonestate(xbean.InstanceZone.STATE_CLOSING);
		onDestroy(shutdown);
		
		/*if (Module.getInstance().getInstBattleRoleSize(landkey) == 0) {
			// ?????????????????????????????????,???????????????,??????????????????????????????
			xzone.setZonestate(xbean.InstanceZone.STATE_CLOSED);

			if (!shutdown)
				xtable.Instancezones.remove(landkey);

			// ??????????????????
			for (MapConfig mapcfg : zoneconfig.maps.values()) {
				if (mapcfg.dynamic == 1) {
					DuplicateHelper.destroyDynamicSceneWhileCommit(mapcfg.id, landkey);
				}
			}
		}*/

		return true;
	}

	public boolean destroyAfterBattle() {
		InstanceSaveConfig saveconf = zoneconfig.saves.get(getCurActiveSave());
		if (null == saveconf)
			return false;

		// ??????????????????
		for (MapConfig mapcfg : zoneconfig.maps.values()) {
			if (mapcfg.dynamic == 1) {
				DuplicateHelper.destroyDynamicSceneWhileCommit(mapcfg.id, landkey);
			}
		}

		xzone.setZonestate(xbean.InstanceZone.STATE_CLOSED);
		xtable.Instancezones.remove(landkey);
		return true;
	}

	protected void onDestroy(boolean shutdown) {

	}


	public BattleEndHandler getBattleEndHandler(final long npckey) {
		return new InstZoneBattleEndHandler(getLandkey(), npckey);
	}

	public int getCurActiveSave() {
		int id = 0;
		int level = 0;
		for (xbean.InstanceSave xsave : xzone.getSaves().values()) {
			if (xsave.getState() == fire.pb.instancezone.InstanceText.COMPLETE)
				level = xsave.getSaveid();
			if (xsave.getState() != fire.pb.instancezone.InstanceText.ACTIVE)
				continue;
			if (xsave.getSaveid() > id)
				id = xsave.getSaveid();
		}

		if (id == 0)
			id = level;

		return id;
	}

	private void onNpcChange(final InstanceSaveConfig savecfg) {
		try {
			List<NpcConfig> npcListConfig = zoneconfig.npcDynamic.get(savecfg.saveId);
			if (npcListConfig == null) {
				logger.error((new StringBuilder().append("npclist is null:").append(landkey).append(" ??????:").append(savecfg.saveId)));
				return;
			}
			for (NpcConfig config : npcListConfig) {
				// ????????????NPC
				if (config.npctype == 1) { // ??????????????????
					final int nNumber = config.getNpcNumber();
					for (int i = 0; i < nNumber; i++) {
						final long npcKey = fire.pb.map.SceneNpcManager.getInstance().getNextId();
						SceneNpcManager.createNpcByMap(npcKey, config.npcbaseId, "", savecfg.mapId, landkey, 3, 0);
						//TODO: ???????????????MAPTHREAD??????,????????????.
						Module.getInstance().setDynamicNpc(landkey, npcKey, 0, config.multibattle);

						ActionConfig actcfg = zoneconfig.acts.get(config.actid);
						if (actcfg == null)
							continue;
						// ?????????npc????????????
						if (actcfg.type == ActionConfig.TYPE_SUBMIT_ITEM) {
							int itemId = 0;
							@SuppressWarnings("unchecked")
							List<Integer> itemids = (List<Integer>) actcfg.params
									.get(ConfigParamName.SUBMIT_ITEM_IDS);
							int nNum = itemids.size();
							int nIndex = Misc.getRandomBetween(0, nNum - 1);
							itemId = itemids.get(nIndex);
							Module.getInstance().setNpcSubmitItemId(landkey,
									npcKey, itemId);
						}
					}
					
					logger.info((new StringBuilder().append("??????npc??????:").append(nNumber)
							.append(",npcid:").append(config.npcbaseId)
							.append(",mapid:").append(savecfg.mapId)
							.append(",landkey:").append(landkey)
							.append(",??????:").append(savecfg.saveId)));
				} else if (config.npctype == 2) { // ??????????????????
					if (config.posx != 0 && config.posy != 0) {
						int leftTopx = config.posx * 16;
						int leftTopy = config.posy * 16;
						long npcKey = SceneNpcManager.getInstance().getNextId();
						
						SceneNpcManager.createNpcByPos(npcKey, config.npcbaseId, 
								"", savecfg.mapId, landkey, leftTopx, leftTopy, 5, 0);

						Module.getInstance().setDynamicNpc(landkey, npcKey, 0, config.multibattle);
						
						logger.info((new StringBuilder().append("??????npc??????:").append(1)
								.append(",npcid:").append(config.npcbaseId)
								.append(",mapid:").append(savecfg.mapId)
								.append(",landkey:").append(landkey)
								.append(",??????:").append(savecfg.saveId)));
					}
				}
			}
		} catch (Exception e) {
			logger.error((new StringBuilder().append("??????npc??????:").append(landkey).append(",??????:").append(savecfg.saveId)));
			logger.error(Parser.convertStackTrace2String(e));
		}
	}

	public boolean getNpcSaveState(final long roleId, final long npckey) {
		final int currentSaveId = getCurActiveSave();
		xbean.InstanceSave xsave = xzone.getSaves().get(currentSaveId);
		if (xsave == null) {
			logger.error("npcSaveSetState(); xsave is null" + getDebugInfo());
			return false;
		}

		xbean.InstanceNpcSave xnpcsave = xsave.getNpcsaves().get(npckey);
		if (xnpcsave == null) {
			xnpcsave = xbean.Pod.newInstanceNpcSave();
			xsave.getNpcsaves().put(npckey, xnpcsave);
			xnpcsave.setRoleid(roleId);
			return true;
		}

		if (xnpcsave.getRoleid() == 0) {
			xnpcsave.setRoleid(roleId);
		}

		return xnpcsave.getRoleid() == roleId;
	}

	public void npcSaveSetState(final long roleId, final long npckey,
			final int count) {
		final int currentSaveId = getCurActiveSave();
		xbean.InstanceSave xsave = xzone.getSaves().get(currentSaveId);
		if (xsave == null) {
			logger.error("npcSaveSetState(); xsave is null" + getDebugInfo());
			return;
		}

		xbean.InstanceNpcSave xnpcsave = xsave.getNpcsaves().get(npckey);
		if (xnpcsave == null) {
			xnpcsave = xbean.Pod.newInstanceNpcSave();
			xsave.getNpcsaves().put(npckey, xnpcsave);
		}

		xnpcsave.setRoleid(roleId);
		xnpcsave.setNpckey(npckey);
		xnpcsave.setCount(count);
		return;
	}

	public boolean checkNpcSave(final long roleid, final long npckey) {
		final int currentSaveId = getCurActiveSave();
		xbean.InstanceSave xsave = xzone.getSaves().get(currentSaveId);
		if (xsave == null) {
			logger.error("npcSaveGetState(); xsave is null" + getDebugInfo());
			return false;
		}

		xbean.InstanceNpcSave xnpcsave = xsave.getNpcsaves().get(npckey);
		if (xnpcsave == null) {
			logger.error("npcSaveGetState(); xnpcsave is null" + getDebugInfo());
			return false;
		}

		return xnpcsave.getRoleid() == roleid;
	}

	public boolean checkNpcSaveCount(final long npckey) {
		final int currentSaveId = getCurActiveSave();
		xbean.InstanceSave xsave = xzone.getSaves().get(currentSaveId);
		if (xsave == null) {
			logger.error("npcSaveGetState(); xsave is null" + getDebugInfo());
			return false;
		}

		xbean.InstanceNpcSave xnpcsave = xsave.getNpcsaves().get(npckey);
		if (xnpcsave == null) {
			logger.error("npcSaveGetState(); xnpcsave is null" + getDebugInfo());
			return false;
		}

		xnpcsave.setFinishcount(xnpcsave.getFinishcount() + 1);

		return xnpcsave.getCount() == xnpcsave.getFinishcount();
	}

	public void reSetSaveNpcState(final long npckey) {
		final int currentSaveId = getCurActiveSave();
		xbean.InstanceSave xsave = xzone.getSaves().get(currentSaveId);
		if (xsave == null) {
			logger.error("npcSaveGetState(); xsave is null" + getDebugInfo());
			return;
		}

		xbean.InstanceNpcSave xnpcsave = xsave.getNpcsaves().get(npckey);
		if (xnpcsave == null) {
			logger.error("npcSaveGetState(); xnpcsave is null" + getDebugInfo());
			return;
		}

		xnpcsave.setFinishcount(0);
		xnpcsave.setRoleid(0);

		return;
	}

	public Act.Result act(Act act) {
		return Act.Result.NULL;
	}

	public long getStartTime() {
		return xzone.getStarttime();
	}

	public boolean validCreate(long roleId) {
		// ???????????????????????????
		int leaderlevel = xtable.Properties.selectLevel(roleId);
		if (leaderlevel < zoneconfig.minlevel) {
			MessageMgr.psendMsgNotify(roleId, 142951, MessageMgr.getStringList(
					zoneconfig.minlevel, zoneconfig.name));
			InstanceZone.logger.error("??????[" + roleId + "]???????????????["
					+ zoneconfig.instZoneId + "]????????????,?????????????????????");
			return false;
		}
		if (leaderlevel > zoneconfig.maxlevel) {
			MessageMgr.psendMsgNotify(roleId, 142983, MessageMgr.getStringList(
					zoneconfig.maxlevel, zoneconfig.name));
			InstanceZone.logger.error("??????[" + roleId + "]???????????????["
					+ zoneconfig.instZoneId + "]????????????,?????????????????????");
			return false;
		}
		long now = System.currentTimeMillis();
		if (!zoneconfig.inEnterTime(now)) {
			MessageMgr.psendMsgNotify(roleId, 160364, null);
			InstanceZone.logger.error("??????[" + roleId + "]????????????["
					+ zoneconfig.instZoneId + "]????????????,?????????????????????");
			return false;
		}

		if (zoneconfig.teamtype == InstanceZoneConfig.TEAM_TYPE_ALL) {
			InstanceZone oldinstzone = InstanceZoneFactory.getInstanceZoneByFactionRoleId(roleId, zoneconfig.instZoneId);
			if (oldinstzone != null) {
				// ?????????????????????????????????
				if (!oldinstzone.canDestroy(false)) {// ????????????????????????????????????????????????????????????????????????
					// ???????????????
					oldinstzone.destroy(true, false);
				}
			}
		}

		return true;

	}
}

package fire.pb.circletask.anye;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.locojoy.base.Marshal.OctetsStream;

import xbean.AnYeTask;
import fire.log.YYLogger;
import fire.pb.PropRole;
import fire.pb.activity.award.RewardMgr;
import fire.pb.activity.award.RewardObjs;
import fire.pb.circletask.AnYeMaXiTuanConf;
import fire.pb.circletask.BattleNpcInfo;
import fire.pb.circletask.CircTaskChallengeNpc;
import fire.pb.circletask.CircTaskClass;
import fire.pb.circletask.CircTaskItemFind;
import fire.pb.circletask.CircTaskPetCatch;
import fire.pb.circletask.CircTaskSchoolPatrolConf;
import fire.pb.circletask.CircleTaskManager;
import fire.pb.circletask.ItemFindInfo;
import fire.pb.circletask.SpecialQuestState;
import fire.pb.item.Pack;
import fire.pb.item.SItemToItem;
import fire.pb.main.ConfigManager;
import fire.pb.map.SceneNpcManager;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.pet.PetColumn;
import fire.pb.pet.PetColumnTypes;
import fire.pb.pet.PetTypeEnum;
import fire.pb.talk.MessageMgr;
import fire.pb.talk.SChatItemTips;
import fire.pb.util.GeneralFormat;
import fire.pb.util.Misc;

public class RoleAnYeTask {
	public static final int TASK_SIZE = 8;
	public static final Logger logger = Logger.getLogger("TASK");
	
	private long roleId;
	private xbean.AnYeData anYeTaskData;
	private fire.pb.PropRole prole;
	
	public RoleAnYeTask(long roleid) {
		this.roleId = roleid;
		this.prole = new fire.pb.PropRole(roleid, false);
		xbean.AnYeData xxx = xtable.Anyemaxituan.get(roleid);
		if (xxx == null) {
			anYeTaskData = xbean.Pod.newAnYeData();
			xtable.Anyemaxituan.insert(roleid, anYeTaskData);
		} else {
			anYeTaskData = xxx;
		}
	}
	
	public xbean.AnYeData getAnYeData(){
		return anYeTaskData;
	}
	
	public Map<Integer, AnYeTask> getTasks(){
		return anYeTaskData.getAnyetasks();
	}
	
	public void generateTasks(){
		if (anYeTaskData.getJointime() == 0 || 
				(anYeTaskData.getTimes() == TASK_SIZE * 20) && !fire.pb.util.DateValidate.inTheSameWeek(anYeTaskData.getJointime(), System.currentTimeMillis())) {
			logger.info("??????[" + roleId + "]????????????????????????????????????????????????????????????");
			clearTaskTimes();
			//randomTasks(prole.getLevel(), anYeTaskData.getTimes() == 0 ? 1 : anYeTaskData.getTimes());
			randomTasks(prole.getLevel(), 1);
			if(anYeTaskData.getAnyetasks().size() < TASK_SIZE)
				anYeTaskData.setRefreshtime(0);
		} else if (anYeTaskData.getAnyetasks().size() < TASK_SIZE) {
			logger.info("??????[" + roleId + "]????????????????????????????????????size=" + anYeTaskData.getAnyetasks().size() + ",????????????10????????????");
			randomTasks(prole.getLevel(), anYeTaskData.getTimes() == 0 ? 1 : anYeTaskData.getTimes());
		}
	}
	
	private void checkAllAnYeTask() {
		if(anYeTaskData.getAnyetasks() == null || anYeTaskData.getAnyetasks().isEmpty() || anYeTaskData.getAnyetasks().size() <= 0)
			return;
		for (Map.Entry<Integer, xbean.AnYeTask> e : anYeTaskData.getAnyetasks().entrySet()) {
			int anYeConfId = e.getValue().getId();
			AnYeMaXiTuanConf conf = ConfigManager.getInstance().getConf(AnYeMaXiTuanConf.class).get(anYeConfId);
			if(conf == null || conf.getTasktype() != e.getValue().getKind()){
				//????????????????????????????????????id??????,????????????????????????????????????????????????
				int times = anYeTaskData.getTimes() == 0 ? 1 : anYeTaskData.getTimes();
				List<AnYeMaXiTuanConf> temp = new LinkedList<AnYeMaXiTuanConf>();
				Map<Integer, AnYeMaXiTuanConf> rawData = ConfigManager.getInstance().getConf(AnYeMaXiTuanConf.class);
				if(rawData == null || rawData.isEmpty() || rawData.size() <=0)
					continue;
				int totalRate = 0;
				for (AnYeMaXiTuanConf sAnYeMaXiTuanConf : rawData.values()) {
					if(sAnYeMaXiTuanConf.levelmin <= prole.getLevel() && sAnYeMaXiTuanConf.levelmax >= prole.getLevel() &&
							sAnYeMaXiTuanConf.roundmin <= times && sAnYeMaXiTuanConf.roundmax >= times){
						temp.add(sAnYeMaXiTuanConf);
						totalRate += sAnYeMaXiTuanConf.getRoundrate();
					}
				}
				
				if(totalRate <= 0) {
					logger.warn("??????[" + roleId + "]????????????:" + prole.getLevel() + "????????????????????????:" + totalRate + "??????(<=0)???");
					continue;
				}
				
				int tempsize = temp.size();
				if(tempsize <= 0) {
					logger.warn("??????[" + roleId + "]????????????:" + prole.getLevel() + "????????????????????????:" + tempsize);
					continue;
				}
				
				int randrate = mkdb.Mkdb.random().nextInt(totalRate);
				AnYeMaXiTuanConf curAymxtconf = getAnYeConfByRate(randrate, temp);
				if(curAymxtconf == null)
					continue;
				xbean.AnYeTask ayt = xbean.Pod.newAnYeTask();
				ayt.setId(curAymxtconf.getId());
				ayt.setKind(curAymxtconf.getTasktype());
				ayt.setState(SpecialQuestState.UNDONE);
				if(ayt.getKind() == CircTaskClass.CircTask_ItemFind){
					ayt.setDstitemid(0);
					ayt.setDstitemnum(0);
					ayt.setDstnpcid(0);
					ayt.setDstnpckey(0);
					if(genItemFindParam(roleId, ayt, curAymxtconf.getGroup()) == false){
						logger.error("??????[" + roleId + "]?????????????????????????????????pos:" + e.getKey() + ",id:" +curAymxtconf.getId());
						continue;
					}
				}
				else if(ayt.getKind() == CircTaskClass.CircTask_PetCatch){
					ayt.setDstitemid(0);
					ayt.setDstitemnum(0);
					ayt.setDstnpcid(0);
					ayt.setDstnpckey(0);
					ItemFindInfo ifi = getPetFindInfo(roleId, curAymxtconf.getGroup());
					if (ifi == null) {
						logger.error("??????[" + roleId + "]??????????????????????????????pos:" + e.getKey() + ",id:" +curAymxtconf.getId());
						continue;
					}
					int dstpetid = ifi.getId(); // ??????id
					if (dstpetid == 0) {
						logger.error("??????[" + roleId + "]??????????????????????????????pos:" + e.getKey() + ",id:" +curAymxtconf.getId());
						continue;
					}
					ayt.setDstitemid(dstpetid);
					ayt.setDstitemnum(1);

					final PetColumn pc = new PetColumn(roleId, PetColumnTypes.PET, true);	
					int targetnum = pc.getPetNumByMapping(ayt.getDstitemid()); //?????????????????????????????????????????????????????????????????????
					if(targetnum >= ayt.getDstitemnum()) {
						if (ayt.getState() == SpecialQuestState.UNDONE){
							ayt.setState(SpecialQuestState.DONE);
						}
					} else {
						if (ayt.getState() == SpecialQuestState.DONE){
							ayt.setState(SpecialQuestState.UNDONE);
						}
					}
				} 
				else if(ayt.getKind() == CircTaskClass.CircTask_ChallengeNpc){
					ayt.setDstitemid(0);
					ayt.setDstitemnum(0);
					ayt.setDstnpcid(0);
					ayt.setDstnpckey(0);
					int battleAI = getChallengeNpcBattleAI(roleId, curAymxtconf.getGroup(), ayt);
					if (0 == battleAI){
						logger.error("??????[" + roleId + "]??????NPC?????????????????????pos:" + e.getKey() + ",id:" +curAymxtconf.getId());
						continue;
					}
				}
				else if(ayt.getKind() == CircTaskClass.CircTask_Patrol){
					ayt.setDstitemid(0);
					ayt.setDstitemnum(0);
					ayt.setDstnpcid(0);
					ayt.setDstnpckey(0);
					if (false == genPatrolParam(roleId, ayt, curAymxtconf.getGroup())) {
						logger.error("??????[" + roleId + "]???????????????????????????pos:" + e.getKey() + ",id:" +curAymxtconf.getId());
						continue;
					}
					if(ayt.getDstitemid() <= 0) {
						logger.error("??????[" + roleId + "]???????????????????????????dstitemid:" + ayt.getDstitemid() + ",?????????????????????pos:" + e.getKey() + ",id:" +curAymxtconf.getId());
						continue;
					}
				}
				anYeTaskData.getAnyetasks().remove(e.getKey());
				anYeTaskData.getAnyetasks().put(e.getKey(), ayt);
			}
			
			if(e.getValue().getKind() == CircTaskClass.CircTask_ChallengeNpc){
				continue;//npc???????????????????????????
			}
			else if(e.getValue().getKind() == CircTaskClass.CircTask_Patrol){
				continue;//???????????????????????????
			}
			else if(e.getValue().getKind() == CircTaskClass.CircTask_ItemFind){
				final Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(this.roleId, fire.pb.item.BagTypes.BAG, true);
				int hasnum = bag.getItemsNumByMapping(e.getValue().getDstitemid(), 0);
				if (hasnum >= e.getValue().getDstitemnum()) {
					logger.debug("??????[" + roleId + "]????????????????????????id(?????????):" + e.getValue().getDstitemid() + ",??????:" + hasnum);
					if (e.getValue().getState() == SpecialQuestState.UNDONE){
						e.getValue().setState(SpecialQuestState.DONE);
					}
				} else {
					logger.debug("??????[" + roleId + "]?????????????????????id(?????????):" + e.getValue().getDstitemid() + ",??????:" + hasnum);
					if (e.getValue().getState() == SpecialQuestState.DONE){
						e.getValue().setState(SpecialQuestState.UNDONE);
					}
				}
			}
			else if(e.getValue().getKind() == CircTaskClass.CircTask_PetCatch){
				final PetColumn pc = new PetColumn(roleId, PetColumnTypes.PET, true);
				int targetnum = pc.getPetNumByMapping(e.getValue().getDstitemid()); //?????????????????????????????????????????????????????????????????????
				if(targetnum >= e.getValue().getDstitemnum()) {
					if (e.getValue().getState() == SpecialQuestState.UNDONE){
						e.getValue().setState(SpecialQuestState.DONE);
					}
				} else {
					if (e.getValue().getState() == SpecialQuestState.DONE){
						e.getValue().setState(SpecialQuestState.UNDONE);
					}
				}
			}
		}
		
		int legendpos = anYeTaskData.getLegendtask();
		logger.info("??????[" + roleId + "]????????????????????????????????????,??????:" + legendpos);
		if(legendpos >= 0 && legendpos <= TASK_SIZE - 1){
			xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
			if(efur == null) {
				xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(legendpos);
				if(tt == null)
					return;
				if(tt.getLegend() == 2) {
					tt.setLegend(4);//????????????
				}
				anYeTaskData.setLegendtask(999);
			}
		}
	}
	
	public static void sendAllAnYeTask(long roleid) {
		RoleAnYeTask rayt = new RoleAnYeTask(roleid);
		rayt.generateTasks();
		rayt.checkAllAnYeTask();
		rayt.refreshAnYeTasks(-1);
	}
	
	public void randomTasks(){
		randomTasks(prole.getLevel(), anYeTaskData.getTimes() == 0 ? 1 : anYeTaskData.getTimes());
	}
	
	private AnYeMaXiTuanConf getAnYeConfByRate(int rate, List<AnYeMaXiTuanConf> randpool){
		//????????????????????????????????????????????????????????????
		int pilerate = 0;
		for (AnYeMaXiTuanConf sAnYeMaXiTuanConf : randpool) {
			pilerate += sAnYeMaXiTuanConf.getRoundrate();
			if (rate < pilerate) {
				//logger.debug("conf:" + sAnYeMaXiTuanConf.getId());
				return sAnYeMaXiTuanConf;
			}
		}
		return null;
	}
	
	public void randomTasks(int level, int times){
		//??????????????????????????????????????????10????????????????????????
		//1.?????????????????????????????????????????????
		List<AnYeMaXiTuanConf> temp = new LinkedList<AnYeMaXiTuanConf>();
		Map<Integer, AnYeMaXiTuanConf> rawData = ConfigManager.getInstance().getConf(AnYeMaXiTuanConf.class);
		if(rawData == null || rawData.isEmpty() || rawData.size() <=0)
			return;
		int totalRate = 0;
		for (AnYeMaXiTuanConf sAnYeMaXiTuanConf : rawData.values()) {
			if(sAnYeMaXiTuanConf.levelmin <= level && sAnYeMaXiTuanConf.levelmax >= level &&
					sAnYeMaXiTuanConf.roundmin <= times && sAnYeMaXiTuanConf.roundmax >= times){
				temp.add(sAnYeMaXiTuanConf);
				totalRate += sAnYeMaXiTuanConf.getRoundrate();
			}
		}
		
		if(totalRate <= 0) {
			logger.warn("??????[" + roleId + "]????????????:" + level + "????????????????????????:" + totalRate + "??????(<=0)???");
			return;
		}
		
		int tempsize = temp.size();
		if(tempsize <= 0) {
			logger.warn("??????[" + roleId + "]????????????:" + level + "????????????????????????:" + tempsize);
			return;
		}
		//??????????????????
		anYeTaskData.getAnyetasks().clear();
		//?????????????????????10?????????
		for (int i = 0; i < TASK_SIZE; i++) {
			int randrate = mkdb.Mkdb.random().nextInt(totalRate);
			//logger.debug("randrate:" + randrate);
			AnYeMaXiTuanConf curAymxtconf = getAnYeConfByRate(randrate, temp);
			//int currand = mkdb.Mkdb.random().nextInt(tempsize);		
			//AnYeMaXiTuanConf curAymxtconf = temp.get(currand);
			if(curAymxtconf == null)
				continue;
			xbean.AnYeTask ayt = xbean.Pod.newAnYeTask();
			ayt.setId(curAymxtconf.getId());
			ayt.setKind(curAymxtconf.getTasktype());
			ayt.setState(SpecialQuestState.UNDONE);
			if(ayt.getKind() == CircTaskClass.CircTask_ItemFind){
				ayt.setDstitemid(0);
				ayt.setDstitemnum(0);
				ayt.setDstnpcid(0);
				ayt.setDstnpckey(0);
				if(genItemFindParam(roleId, ayt, curAymxtconf.getGroup()) == false){
					logger.error("??????[" + roleId + "]?????????????????????????????????pos:" + i + ",id:" +curAymxtconf.getId());
					continue;
				}
			}
			else if(ayt.getKind() == CircTaskClass.CircTask_PetCatch){
				ayt.setDstitemid(0);
				ayt.setDstitemnum(0);
				ayt.setDstnpcid(0);
				ayt.setDstnpckey(0);
				ItemFindInfo ifi = getPetFindInfo(roleId, curAymxtconf.getGroup());
				if (ifi == null) {
					logger.error("??????[" + roleId + "]??????????????????????????????pos:" + i + ",id:" +curAymxtconf.getId());
					continue;
				}
				int dstpetid = ifi.getId(); // ??????id
				if (dstpetid == 0) {
					logger.error("??????[" + roleId + "]??????????????????????????????pos:" + i + ",id:" +curAymxtconf.getId());
					continue;
				}
				ayt.setDstitemid(dstpetid);
				ayt.setDstitemnum(1);

				final PetColumn pc = new PetColumn(roleId, PetColumnTypes.PET, true);	
				int targetnum = pc.getPetNumByMapping(ayt.getDstitemid()); //?????????????????????????????????????????????????????????????????????
				if(targetnum >= ayt.getDstitemnum()) {
					if (ayt.getState() == SpecialQuestState.UNDONE){
						ayt.setState(SpecialQuestState.DONE);
					}
				} else {
					if (ayt.getState() == SpecialQuestState.DONE){
						ayt.setState(SpecialQuestState.UNDONE);
					}
				}
			} 
			else if(ayt.getKind() == CircTaskClass.CircTask_ChallengeNpc){
				ayt.setDstitemid(0);
				ayt.setDstitemnum(0);
				ayt.setDstnpcid(0);
				ayt.setDstnpckey(0);
				int battleAI = getChallengeNpcBattleAI(roleId, curAymxtconf.getGroup(), ayt);
				if (0 == battleAI){
					logger.error("??????[" + roleId + "]??????NPC?????????????????????pos:" + i + ",id:" +curAymxtconf.getId());
					continue;
				}
			}
			else if(ayt.getKind() == CircTaskClass.CircTask_Patrol){
				ayt.setDstitemid(0);
				ayt.setDstitemnum(0);
				ayt.setDstnpcid(0);
				ayt.setDstnpckey(0);
				if (false == genPatrolParam(roleId, ayt, curAymxtconf.getGroup())) {
					logger.error("??????[" + roleId + "]???????????????????????????pos:" + i + ",id:" +curAymxtconf.getId());
					continue;
				}
				if(ayt.getDstitemid() <= 0) {
					logger.error("??????[" + roleId + "]???????????????????????????dstitemid:" + ayt.getDstitemid() + ",?????????????????????pos:" + i + ",id:" +curAymxtconf.getId());
					continue;
				}
			}
			anYeTaskData.getAnyetasks().put(i, ayt);
		}
		anYeTaskData.setRandomtime(Calendar.getInstance().getTimeInMillis());
	}
	
	private void dealWeekTask() {
		logger.info("??????[" + roleId + "]????????????????????????????????????????????????????????????");

		clearTaskTimes();
		randomTasks(prole.getLevel(), 1);
		if(anYeTaskData.getAnyetasks().size() < TASK_SIZE)
			anYeTaskData.setRefreshtime(0);	
		else
			refreshAnYeTasks(-1);
		
		RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleId);
		if (actrole != null){
			actrole.handleActiveLivenessAnye(RoleLiveness.ANYEMAXITUAN);
		}
	}
	
	//????????????????????????????????????npc????????????
	public static void addDynamicServices(long roleid, long npckey, java.util.List<Integer> result) {
		xbean.AnYeData aYTD = xtable.Anyemaxituan.select(roleid);
		if (aYTD == null) {
			return;
		} else {
			long now = System.currentTimeMillis();
			if(aYTD.getJointime() <= 0 || now < aYTD.getJointime())
				return;
			for (Map.Entry<Integer, xbean.AnYeTask> e : aYTD.getAnyetasks().entrySet()) {
				if(e.getValue().getKind() == CircTaskClass.CircTask_ChallengeNpc) {
					if(e.getValue().getState() == SpecialQuestState.UNDONE) {
						final fire.pb.map.Npc npc = SceneNpcManager.selectNpcByKey(npckey);
						if(npc == null || e.getValue().getDstnpcid() != npc.getNpcID())
							continue;
						
						if(e.getValue().getParam2() > 0){
							result.add((int)e.getValue().getParam2());
							logger.info("??????[" + roleid + "]npc????????????????????????id:" + (int)e.getValue().getParam2());
							break;//??????npc???????????????????????????????????????
						} else {
							logger.error("??????[" + roleid + "]npc????????????????????????id??????!");
						}
					}
				}
			}
		}
	}
	
	public void doneTask(int pos){
		xbean.AnYeTask ayt = anYeTaskData.getAnyetasks().get(pos);
		ayt.setState(SpecialQuestState.DONE);
	}
	
	public void undoneTask(int pos){
		xbean.AnYeTask ayt = anYeTaskData.getAnyetasks().get(pos);
		ayt.setState(SpecialQuestState.UNDONE);
	}
	
	public void completeTask(int pos){
		xbean.AnYeTask ayt = anYeTaskData.getAnyetasks().get(pos);
		ayt.setState(SpecialQuestState.SUCCESS);
	}
	
	public void abandonTask(){
		long now = System.currentTimeMillis();
		if (fire.pb.util.DateValidate.inTheSameWeek(anYeTaskData.getJointime(), now)) {
			//??????????????????????????????
			fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166134, null);
			return;
		}
		endLegendAnYeTask();
		clearTaskTimes();
		randomTasks(prole.getLevel(), 1);
		if(anYeTaskData.getAnyetasks().size() < TASK_SIZE)
			anYeTaskData.setRefreshtime(0);	
		else
			refreshAnYeTasks(-1);
		
		RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleId);
		if (actrole != null){
			actrole.handleActiveLivenessAnye(RoleLiveness.ANYEMAXITUAN);
		}
	}

	public void handleTaskOver(int pos){
		xbean.AnYeTask ayt = anYeTaskData.getAnyetasks().get(pos);
		if(ayt.getState() == SpecialQuestState.SUCCESS)
			return;
		completeTask(pos);
		addTaskTimes(1);
		if(checkUpdateTask()){
			refreshAnYeTasks(pos);//?????????????????????????????????????????????????????????????????????????????????npc?????????????????????
			logger.info("??????[" + roleId + "]?????????????????????10??????????????????????????????10????????????");
			randomTasks(prole.getLevel(), anYeTaskData.getTimes());
			endLegendAnYeTask();
			refreshAnYeTasks(-1);
		} else {
			int legendpos = anYeTaskData.getLegendtask();
			if(legendpos == pos){
				if(pos >= 0 && pos <= TASK_SIZE - 1){
					xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(legendpos);
					if(tt == null)
						return;
					logger.info("??????[" + roleId + "]??????????????????????????????,??????:" + legendpos + ",????????????:" + tt.getLegend());
					if(tt.getLegend() == 2) {
						tt.setLegend(4);//????????????
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166120, null);
					}
					anYeTaskData.setLegendtask(999);
					xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
					if (efur != null && efur.getLegendfuture() != null){
						efur.getLegendfuture().cancel(true);
					}
					xtable.Anyelegendtimer.remove(roleId);
					logger.info("??????[" + roleId + "]??????????????????????????????,??????:" + pos + ",????????????,?????????????????????!????????????????????????");
				}
			}
			refreshAnYeTasks(pos);
		}
		
		giveAward(roleId, prole.getLevel(), anYeTaskData, pos, false);
		
		if (checkWeekTask()) {
			logger.info("??????[" + roleId + "]???????????????????????????????????????");
			dealWeekTask();
		}
	}
	
	public void handleTaskOver(int pos, boolean teshu) {
		xbean.AnYeTask ayt = anYeTaskData.getAnyetasks().get(pos);
		if(ayt.getState() == SpecialQuestState.SUCCESS)
			return;
		completeTask(pos);
		addTaskTimes(1);
		if(checkUpdateTask()){
			logger.info("??????[" + roleId + "]?????????????????????10??????????????????????????????10????????????");
			randomTasks(prole.getLevel(), anYeTaskData.getTimes());
			refreshAnYeTasks(-1);
		} else {
			int legendpos = anYeTaskData.getLegendtask();
			if(legendpos == pos){
				if(pos >= 0 && pos <= TASK_SIZE - 1){
					xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(legendpos);
					if(tt == null)
						return;
					logger.info("??????[" + roleId + "]??????????????????????????????,??????:" + legendpos + ",????????????:" + tt.getLegend());
					if(tt.getLegend() == 2) {
						tt.setLegend(4);//????????????
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166120, null);
					}
					anYeTaskData.setLegendtask(999);
					xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
					if (efur != null && efur.getLegendfuture() != null){
						efur.getLegendfuture().cancel(true);
					}
					xtable.Anyelegendtimer.remove(roleId);
					logger.info("??????[" + roleId + "]??????????????????????????????,??????:" + pos + ",????????????,?????????????????????!????????????????????????");
				}
			}
			refreshAnYeTasks(pos);
		}
		giveAward(roleId, prole.getLevel(), anYeTaskData, pos, teshu);
		
		if (checkWeekTask()) {
			logger.info("??????[" + roleId + "]???????????????????????????????????????");
			dealWeekTask();
		}
	}
	
	private boolean checkWeekTask() {
		if (anYeTaskData.getTimes() != TASK_SIZE * 20)
			return false;
		
		long now = System.currentTimeMillis();
		if (fire.pb.util.DateValidate.inTheSameWeek(anYeTaskData.getJointime(), now))
			return false;
		
		return true;
	}
	
	public boolean checkUpdateTask(){
		if(anYeTaskData.getTimes() >= TASK_SIZE * 20)
			return false;
		boolean isOver = true;
		for (Map.Entry<Integer, xbean.AnYeTask> e : anYeTaskData.getAnyetasks().entrySet()) {
			if(e.getValue().getState() != SpecialQuestState.SUCCESS){
				isOver = false;
				break;
			}
		}
		return isOver;
	}
	
	public void clearTask(){
		anYeTaskData.getAnyetasks().clear();
	}
	
	public void clearTaskTimes(){
		anYeTaskData.setTimes(0);
		anYeTaskData.setRenxins(0);
		anYeTaskData.setJointime(0);
		anYeTaskData.setRefreshtime(Calendar.getInstance().getTimeInMillis());
	}
	
	public void addTaskTimes(int times){
		anYeTaskData.setTimes(anYeTaskData.getTimes() + times);
	}
	
	public void renXinTask(int pos){
		anYeTaskData.setRenxins(anYeTaskData.getRenxins() + 1);
		handleTaskOver(pos);
	}
	
	public static boolean getRoleAnYeTask(long croleid, long taskroleid, int pos, long times, SChatItemTips sendmsg) {
		xbean.AnYeData aYTD = xtable.Anyemaxituan.select(taskroleid);
		if (aYTD == null)
			return false;
		if((aYTD.getTimes() / 8 + 1) !=  (times / 8 + 1) ) {
			//?????????????????????????????????
			if(croleid != taskroleid)
				fire.pb.talk.MessageMgr.sendMsgNotify(croleid, 166104, null);
			else
				fire.pb.talk.MessageMgr.sendMsgNotify(croleid, 166081, null);
			return false;
		}
		xbean.AnYeTask ayt = aYTD.getAnyetasks().get(pos);
		if (ayt == null)
			return false;
		/*if (ayt.getState() == SpecialQuestState.SUCCESS) {
			fire.pb.talk.MessageMgr.sendMsgNotify(croleid, 166104, null);
			return false;
		}*/
		
		OctetsStream octs = new OctetsStream();
		octs.marshal(pos);
		octs.marshal(ayt.getId());
		octs.marshal(ayt.getKind());
		octs.marshal(ayt.getState());
		octs.marshal(ayt.getDstitemid());
		octs.marshal(ayt.getDstitemnum());
		octs.marshal(ayt.getDstnpcid());
		octs.marshal(ayt.getDstnpckey());
		fire.pb.PropRole prole = new fire.pb.PropRole(taskroleid, true);
		octs.marshal(prole.getLevel());
		octs.marshal(prole.getSchool());
		
		sendmsg.tips = octs;
		return true;
	}
	
	public static int isHavePatrol(long roleid) {
		xbean.AnYeData aYTD = xtable.Anyemaxituan.select(roleid);
		if (aYTD == null) {
			return -1;
		} else {
			for (Map.Entry<Integer, xbean.AnYeTask> e : aYTD.getAnyetasks().entrySet()) {
				if(e.getValue().getKind() == CircTaskClass.CircTask_Patrol) {
					if(e.getValue().getState() == SpecialQuestState.UNDONE)
						return e.getKey();
				}
			}
		}
		return -1;
	}
	
	public static java.util.Set<Integer> getPatrolMap(long roleid) {
		xbean.AnYeData aYTD = xtable.Anyemaxituan.select(roleid);
		java.util.Set<Integer> ret = new java.util.HashSet<Integer>();
		if (aYTD == null) {
			return ret;
		} else {
			for (Map.Entry<Integer, xbean.AnYeTask> e : aYTD.getAnyetasks().entrySet()) {
				if(e.getValue().getKind() == CircTaskClass.CircTask_Patrol) {
					if(e.getValue().getState() == SpecialQuestState.UNDONE)
						ret.add(e.getValue().getDstnpcid());
				}
			}
		}
		return ret;
	}
	
	public void setAnYeJoinTime(){
		anYeTaskData.setJointime(Calendar.getInstance().getTimeInMillis());
	}
	
	public void endLegendAnYeTask(){
		int pos = anYeTaskData.getLegendtask();
		logger.info("??????[" + roleId + "]??????????????????????????????????????????,??????:" + pos);
		if(pos >= 0 && pos <= TASK_SIZE - 1){
			int legendpos = anYeTaskData.getLegendtask();
			xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(legendpos);
			if(tt == null)
				return;
			logger.info("??????[" + roleId + "]??????????????????????????????,??????:" + legendpos + ",????????????:" + tt.getLegend());
			if(tt.getLegend() == 2) {
				tt.setLegend(4);//????????????
				fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166120, null);
			}
			anYeTaskData.setLegendtask(999);
			xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
			if (efur != null && efur.getLegendfuture() != null){
				efur.getLegendfuture().cancel(true);
			}
			xtable.Anyelegendtimer.remove(roleId);
			logger.info("??????[" + roleId + "]??????????????????????????????,??????:" + pos + ",????????????,?????????????????????!????????????????????????");
		}
	}
	
	public void startLegendAnYeTask(int pos){
		int lastlegendpos = anYeTaskData.getLegendtask();
		logger.info("??????[" + roleId + "]?????????????????????????????????,??????:" + lastlegendpos);
		if(lastlegendpos >= 0 && lastlegendpos <= TASK_SIZE - 1){
			xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(lastlegendpos);
			if(tt == null)
				return;
			logger.info("??????[" + roleId + "]?????????????????????????????????,??????:" + lastlegendpos + ",????????????:" + tt.getLegend());
			if(tt.getLegend() == 2) {
				tt.setLegend(4);//????????????
				fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166120, null);
			}
			anYeTaskData.setLegendtask(999);
			xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
			if (efur != null && efur.getLegendfuture() != null){
				efur.getLegendfuture().cancel(true);
			}
			xtable.Anyelegendtimer.remove(roleId);
			logger.info("??????[" + roleId + "]?????????????????????????????????,??????:" + pos + ",?????????,?????????????????????!");
			refreshAnYeTasks(lastlegendpos);
		}
		
		logger.info("??????[" + roleId + "]????????????????????????" + pos + "??????????????????.");
		xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(pos);
		if(tt == null)
			return;
		anYeTaskData.setLegendtask(pos);
		tt.setLegend(2);//??????????????????????????????
		final long now = Calendar.getInstance().getTimeInMillis();
		final long endtime = now + tt.getLegendtime() * 1000;
		tt.setLegendend(endtime);//?????????????????????????????????
		logger.info("??????[" + roleId + "]????????????" + pos + "??????????????????:" + tt.getId() + ",????????????:" + endtime + ",???????????????!");
		//??????????????????,?????????????????????	
		ScheduledFuture<?> fur = mkdb.Mkdb.executor().schedule(new Runnable() {
			@Override
			public void run() {
				new mkdb.Procedure(){
					@Override
					protected boolean process() throws Exception {
						int legendpos = anYeTaskData.getLegendtask();
						xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(legendpos);
						if(tt == null)
							return true;
						tt.setLegend(4);//????????????
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166120, null);
						//anYeTaskData.setLegendtask(999);
						xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
						if (efur != null && efur.getLegendfuture() != null){
							efur.getLegendfuture().cancel(true);
						}
						xtable.Anyelegendtimer.remove(roleId);
						logger.info("??????[" + roleId + "]???????????????????????????????????????!????????????????????????");
						refreshAnYeTasks(legendpos);
						return true;
					}
				}.submit();
			}
		}, tt.getLegendtime(), TimeUnit.SECONDS);
		//?????????????????????
		xbean.AnYeLegendFuture efur = xtable.Anyelegendtimer.get(roleId);
		if (efur != null && efur.getLegendfuture() != null){
			efur.getLegendfuture().cancel(true);
		}
		if (efur == null){
			efur = xbean.Pod.newAnYeLegendFuture();
			xtable.Anyelegendtimer.add(roleId, efur);
		}
		efur.setLegendfuture(fur);
		//fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166118, null);
		logger.info("??????[" + roleId + "]???????????????????????????????????????!??????????????????xdb.");
		SLengendAnYetask snd = new SLengendAnYetask(1);
		if (mkdb.Transaction.current() != null)
			mkdb.Procedure.psendWhileCommit(roleId, snd);
		else
			gnet.link.Onlines.getInstance().send(roleId, snd);
		//TODO:????????????????????????????????????????
	}
	
	public void refreshBasicAnYeData(){
		//???????????????????????????????????????????????????
		SRefreshAnYeData snd = new SRefreshAnYeData();
		snd.times = anYeTaskData.getTimes();
		snd.renxins = anYeTaskData.getRenxins();
		snd.jointime = anYeTaskData.getJointime();
		snd.legendpos = anYeTaskData.getLegendtask();
		calcAward(this.roleId, this.anYeTaskData, 0, snd);
		if (mkdb.Transaction.current() != null)
			mkdb.Procedure.psendWhileCommit(roleId, snd);
		else
			gnet.link.Onlines.getInstance().send(roleId, snd);
	}
	
	public void refreshAnYeTasks(int pos){
		SRefreshAnYeData snd = new SRefreshAnYeData();
		snd.times = anYeTaskData.getTimes();
		snd.renxins = anYeTaskData.getRenxins();
		snd.jointime = anYeTaskData.getJointime();
		snd.legendpos = anYeTaskData.getLegendtask();
		calcAward(this.roleId, this.anYeTaskData, pos, snd);
		if(pos >= 0 && pos <= TASK_SIZE - 1){
			xbean.AnYeTask tt = anYeTaskData.getAnyetasks().get(pos);
			if(tt == null)
				return;
			fire.pb.circletask.anye.AnYeTask ayt = new fire.pb.circletask.anye.AnYeTask();
			ayt.pos = pos;
			ayt.id = tt.getId();
			ayt.kind = tt.getKind();
			ayt.state = tt.getState();
			ayt.dstitemid = tt.getDstitemid();
			ayt.dstitemnum = tt.getDstitemnum();
			ayt.dstnpcid = tt.getDstnpcid();
			ayt.dstnpckey = tt.getDstnpckey();
			ayt.legend = tt.getLegend();
			ayt.legendtime = tt.getLegendtime();
			ayt.legendend = tt.getLegendend();
			snd.anyetasks.add(ayt);
			logger.debug("????????????,pos:"+ayt.pos+",id:"+ayt.id+",kind:"+ayt.kind+",state:"+ayt.state+
					",dstitemid:"+ayt.dstitemid+",dstitemnum:"+ayt.dstitemnum+",dstnpcid:"+ayt.dstnpcid+",dstnpckey:"+ayt.dstnpckey+
					",param1:"+tt.getParam1()+",param2:"+tt.getParam2()+",param3:"+tt.getParam3());
		} else {
			if(anYeTaskData.getAnyetasks() == null || anYeTaskData.getAnyetasks().isEmpty() || anYeTaskData.getAnyetasks().size() <= 0)
				return;
			for (Map.Entry<Integer, xbean.AnYeTask> e : anYeTaskData.getAnyetasks().entrySet()) {
				fire.pb.circletask.anye.AnYeTask ayt = new fire.pb.circletask.anye.AnYeTask();
				ayt.pos = e.getKey();
				ayt.id = e.getValue().getId();
				ayt.kind = e.getValue().getKind();
				ayt.state = e.getValue().getState();
				ayt.dstitemid = e.getValue().getDstitemid();
				ayt.dstitemnum = e.getValue().getDstitemnum();
				ayt.dstnpcid = e.getValue().getDstnpcid();
				ayt.dstnpckey = e.getValue().getDstnpckey();
				ayt.legend = e.getValue().getLegend();
				ayt.legendtime = e.getValue().getLegendtime();
				ayt.legendend = e.getValue().getLegendend();
				snd.anyetasks.add(ayt);
				logger.debug("????????????,pos:"+ayt.pos+",id:"+ayt.id+",kind:"+ayt.kind+",state:"+ayt.state+
						",dstitemid:"+ayt.dstitemid+",dstitemnum:"+ayt.dstitemnum+",dstnpcid:"+ayt.dstnpcid+",dstnpckey:"+ayt.dstnpckey+
						",param1:"+e.getValue().getParam1()+",param2:"+e.getValue().getParam2()+",param3:"+e.getValue().getParam3());
			}
		}
		if (mkdb.Transaction.current() != null)
			mkdb.Procedure.psendWhileCommit(roleId, snd);
		else
			gnet.link.Onlines.getInstance().send(roleId, snd);
	}
	
	public boolean genItemFindParam(long roleid, AnYeTask ayt, int ctgroup) {
		final PropRole role = new PropRole(roleid, true);
		int roleSchool = role.getSchool();
		int roleLevel = role.getLevel();
		
		NavigableMap<Integer, CircTaskItemFind> ctitemfind = ConfigManager.getInstance().getConf(fire.pb.circletask.CircTaskItemFind.class);
		for (CircTaskItemFind ctif : ctitemfind.values()) {
			if (ctgroup == ctif.ctgroup && (roleSchool == ctif.school || 0 == ctif.school) 
					&& roleLevel >= ctif.levelmin && roleLevel <= ctif.levelmax) {
				String items = ctif.getRecycleitem();
				java.util.List<GeneralFormat> results = fire.pb.util.ParseString.parseString2GeneralFormat(items);
				if (results == null)
					return false;
				int totalrate = 0;
				for (int i=0; i< results.size(); i++)
					totalrate += results.get(i).getRate();
				int randrate = mkdb.Mkdb.random().nextInt(totalrate);
				int pilerate = 0;
				for (int i=0; i< results.size(); i++){
					pilerate += results.get(i).getRate();
					if (randrate < pilerate) {
						ayt.setDstitemid(results.get(i).getId());
						ayt.setDstitemnum(ctif.itemnum);
						ayt.setLegend(ctif.islegend == 1 ? 1 : 0);
						if(ayt.getLegend() > 0) {
							logger.debug("??????[" + roleid + "]???????????????:" + ayt.getId() + "???????????????");
							int legendtime = ctif.getLegendtime();
							//legendtime = 60;
							ayt.setLegendtime(legendtime);//????????????
							String legenditems = ctif.getLegenditem();
							int ntimes = CircleTaskManager.getInstance().getCTItemFindLegend(); //?????????????????????
							logger.debug("??????[" + roleid + "]???????????????:" + ayt.getId() + "???????????????????????????:" + ntimes);
							ayt.setParam2((long)ntimes);//?????????????????????2???????????????????????????????????????????????????,??????3??????????????????????????????
							ayt.setParam3(0L);
							if(legenditems == null || legenditems == "" || legenditems.isEmpty()) {
								ayt.setLegenditem(ayt.getDstitemid());
							} else {
								//???????????????????????????
								java.util.List<GeneralFormat> legendresults = fire.pb.util.ParseString.parseString2GeneralFormat(legenditems);
								if (legendresults == null) {
									logger.error("??????[" + roleid + "]???????????????:" + ayt.getId() + "?????????????????????????????????null!!!??????????????????????????????????????????");
									return false;
								}	
								int ltotalrate = 0;
								for (int ii=0; ii< legendresults.size(); ii++)
									ltotalrate += legendresults.get(ii).getRate();
								int lrandrate = mkdb.Mkdb.random().nextInt(ltotalrate);
								int lpilerate = 0;
								for (int ii=0; ii< legendresults.size(); ii++){
									lpilerate += legendresults.get(ii).getRate();
									if (lrandrate < lpilerate) {
										ayt.setLegenditem(legendresults.get(ii).getId());
									}
								}
							}
							logger.debug("??????[" + roleid + "]???????????????:" + ayt.getId() + ",????????????:" + ayt.getLegendtime() + ",?????????????????????:" + ayt.getLegenditem());
						}
						final Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, true);
						if (bag.getItemNum(ayt.getDstitemid(), 0) >= ayt.getDstitemnum()) {
							logger.debug("??????[" + roleid + "]????????????????????????id:" + ayt.getDstitemid());		
							ayt.setState(SpecialQuestState.DONE);
						} else {
							logger.debug("??????[" + roleid + "]?????????????????????id:" + ayt.getDstitemid());
							java.util.List<Integer> sameitems = new ArrayList<Integer>();
							if(CircleTaskManager.getSameItems(ayt.getDstitemid(), sameitems) == true && sameitems.size() > 0){
								boolean idfind = false;
								for(Integer curitemid : sameitems) {
									if (bag.getItemNum(curitemid, 0) >= ayt.getDstitemnum()) {
										ayt.setState(SpecialQuestState.DONE);
										idfind = true;
										break;
									}
								}
								logger.debug("??????[" + roleid + "]???????????????????????????????????????.??????:" + idfind);
								if(idfind == false) {
									ayt.setState(SpecialQuestState.UNDONE);
								}
							} else {
								ayt.setState(SpecialQuestState.UNDONE);
							}
						}		
						ayt.setParam1(ctif.id);//???????????????id???????????????
						return true;
					}
				}
			}
		}
		//logger.error("??????[" + roleid + "]????????????????????????????????????????????????????????????");
		return false;
	}
	
	public ItemFindInfo getPetFindInfo(long roleid, int ctgroup) {
		final fire.pb.PropRole role = new fire.pb.PropRole(roleid, true);
		int roleSchool = role.getSchool();
		int roleLevel = role.getLevel();
		
		NavigableMap<Integer, CircTaskPetCatch> ctpetcatch = ConfigManager.getInstance().getConf(fire.pb.circletask.CircTaskPetCatch.class);
		for (CircTaskPetCatch ctif : ctpetcatch.values()) {
			if (ctgroup == ctif.ctgroup && (roleSchool == ctif.school || 0 == ctif.school) 
					&& roleLevel >= ctif.levelmin && roleLevel <= ctif.levelmax) {
				String pets = ctif.getRecycleitem();
				java.util.List<GeneralFormat> results = fire.pb.util.ParseString.parseString2GeneralFormat(pets);
				if (results == null)
					return null;
				
				int totalrate = 0;
				for (int i=0; i< results.size(); i++)
					totalrate += results.get(i).getRate();
				int randrate = mkdb.Mkdb.random().nextInt(totalrate);
				int pilerate = 0;
				for (int i=0; i< results.size(); i++){
					pilerate += results.get(i).getRate();
					if (randrate < pilerate) {
						ItemFindInfo ifi = new ItemFindInfo(results.get(i).getId(), results.get(i).getRate(), ctif.itemnum, ctif.levelmin, ctif.levelmax, ctif.shopnpc);
						return ifi;
					}
				}
			}
		}
		return null;
	}
	
	public boolean genPatrolParam(long roleid,AnYeTask ayt,int ctgroup){
		Integer level = xtable.Properties.selectLevel(roleid);
		Integer school = xtable.Properties.selectSchool(roleid);
		CircTaskSchoolPatrolConf ctschoolPatrolConf = CircleTaskManager.getInstance().getCTSchoolPatrolConf(ctgroup,school,level);
		if (ctschoolPatrolConf == null)
			return false;
		int index = Misc.getProbability(ctschoolPatrolConf.getMapProbs());
		ayt.setDstnpcid(ctschoolPatrolConf.getMapids().get(index));
		int battleCfgId = CircleTaskManager.getInstance().getCircTaskSchoolPatrolMonster(ctgroup, level, school);
		ayt.setDstitemid(battleCfgId);
		return true;
	}
	
	public int getChallengeNpcBattleAI(long roleid, int ctgroup, AnYeTask ayt) {
		final fire.pb.PropRole role = new fire.pb.PropRole(roleid, true);
		int roleSchool = role.getSchool();
		int roleLevel = role.getLevel();
		
		NavigableMap<Integer, CircTaskChallengeNpc> ctchallengenpc = ConfigManager.getInstance().getConf(fire.pb.circletask.CircTaskChallengeNpc.class);
		List<Integer> tempL = new LinkedList<Integer>();
		for (Entry<Integer, CircTaskChallengeNpc> e : ctchallengenpc.entrySet()) {
			if(ctgroup == e.getValue().ctgroup) {
				tempL.add(e.getValue().id);
			}
		}
		int randv = 0;
		if(tempL.size() > 0) {
			Collections.shuffle(tempL);
			randv = tempL.get(0).intValue();
		}
		for (CircTaskChallengeNpc ctcn : ctchallengenpc.values()) {
			if (ctgroup == ctcn.ctgroup && (roleSchool == ctcn.school || 0 == ctcn.school) 
					&& roleLevel >= ctcn.levelmin && roleLevel <= ctcn.levelmax && 
					(randv == 0 ? true : ctcn.id == randv)) {
				String battleinfo = ctcn.getBattleinfo();
				java.util.List<GeneralFormat> results = fire.pb.util.ParseString.parseString2GeneralFormat(battleinfo);
				if (results == null)
					break;
				
				int totalrate = 0;
				for (int i=0; i< results.size(); i++)
					totalrate += results.get(i).getRate();
				int randrate = mkdb.Mkdb.random().nextInt(totalrate);
				int pilerate = 0;
				for (int i=0; i< results.size(); i++){
					pilerate += results.get(i).getRate();
					if (randrate < pilerate) {
						int battleai = results.get(i).getId();
						BattleNpcInfo bInfo = CircleTaskManager.getInstance().getBattleNpcInfoMap().get(ctcn.getId());
						int npcId = bInfo.getNpcId();
						if (npcId != -1) 
							ayt.setDstnpcid(npcId);		
						ayt.setParam1(battleai);
						ayt.setParam2(ctcn.getNpcsrv()); //npc??????
						return battleai;
					}
				}
			}
		}
		return 0;
	}
	
	public static void calcAward(final long roleid, xbean.AnYeData ayd, int pos, SRefreshAnYeData proto) {
		if (ayd == null)
			return;
		AnYeMaXiTuanConf conf = null;
		if(pos >= 0 && pos <= TASK_SIZE - 1) {
			xbean.AnYeTask ayt = ayd.getAnyetasks().get(pos);
			if (ayt == null)
				return;
			conf = ConfigManager.getInstance().getConf(AnYeMaXiTuanConf.class).get(ayt.getId());
		} else {
			xbean.AnYeTask ayt = ayd.getAnyetasks().get(0);
			if (ayt == null)
				return;
			conf = ConfigManager.getInstance().getConf(AnYeMaXiTuanConf.class).get(ayt.getId());
		}
		if (conf == null)
			return;
		
		int normalaward = conf.getNormalaward();
		//int extaward = conf.getExtaward();
		//int spcaward = conf.getSpecialaward();
		int oneloopaward = conf.getOneloopaward();
		int round40award = conf.getRound40award();
		int round80award = conf.getRound80award();
		int round120award = conf.getRound120award();
		int round160award = conf.getRound160award();
		
		Map<Integer, RewardObjs> tmp = new HashMap<Integer, RewardObjs>();
		do {
			if (ayd.getTimes() < 0)
				break;
			if (ayd.getTimes() + 1 == 160) {
				if(round160award > 0) {
					tmp = calcAwardById(roleid, round160award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() + 1 == 120) {
				if(round120award > 0) {
					tmp = calcAwardById(roleid, round120award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() + 1 == 80) {
				if(round80award > 0) {
					tmp = calcAwardById(roleid, round80award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() + 1 == 40) {
				if(round40award > 0) {
					tmp = calcAwardById(roleid, round40award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() != 0 && (ayd.getTimes() + 1)% 8 == 0) {
				if(oneloopaward > 0) {
					tmp = calcAwardById(roleid, oneloopaward, ayd, 0, null);
					break;
				}
			}
			//??????????????????
			if (normalaward > 0) {
				tmp = calcAwardById(roleid, normalaward, ayd, 0, null);
			}
		} while (false);
		
		for(Map.Entry<Integer, RewardObjs> e : tmp.entrySet()) {
			if(e.getKey() == RewardMgr.EXP_AWARD) {
				proto.awardexp = e.getValue().getValue();
			} else if (e.getKey() == RewardMgr.MONEY_AWARD) {
				proto.awardsilver = e.getValue().getValue();
			} else if (e.getKey() == RewardMgr.GOLD_AWARD) {
				proto.swardgold = e.getValue().getValue();
			}
		}
	}
	

	public static void giveAward(final long roleid, final int roleLevel, xbean.AnYeData ayd, int pos, boolean teshu) {
		//???????????????????????????
		RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
		if (actrole != null){
			actrole.handleActiveLivenessData(RoleLiveness.ANYEMAXITUAN);
		}
		
		if (ayd == null)
			return;
		xbean.AnYeTask ayt = ayd.getAnyetasks().get(pos);
		if (ayt == null)
			return;
		CircleTaskManager.logger.debug("??????[" + roleid + "]??????????????????" + 1080000 + "???" + ayt.getId() + ",??????" + ayt.getKind() + "???????????????!");
		final AnYeMaXiTuanConf conf = ConfigManager.getInstance().getConf(AnYeMaXiTuanConf.class).get(ayt.getId());
		if (conf == null)
			return;
		
		int normalaward = conf.getNormalaward();
		//int extaward = conf.getExtaward();
		int spcaward = conf.getSpecialaward();
		int oneloopaward = conf.getOneloopaward();
		int round40award = conf.getRound40award();
		int round80award = conf.getRound80award();
		int round120award = conf.getRound120award();
		int round160award = conf.getRound160award();
		
		do {
			if (ayd.getTimes() <= 0)
				break;
			if (ayd.getTimes() == 160) {
				if(round160award > 0) {
					distributeAward(roleid, round160award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() == 120) {
				if(round120award > 0) {
					distributeAward(roleid, round120award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() == 80) {
				if(round80award > 0) {
					distributeAward(roleid, round80award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() == 40) {
				if(round40award > 0) {
					distributeAward(roleid, round40award, ayd, 0, null);
					break;
				}
			}
			if (ayd.getTimes() % 8 == 0) {
				if(oneloopaward > 0) {
					distributeAward(roleid, oneloopaward, ayd, 0, null);
					break;
				}
			}
			//??????????????????
			if (normalaward > 0) {
				distributeAward(roleid, normalaward, ayd, 0, null);
			}
		} while (false);
		
		if(spcaward > 0 && teshu){
			distributeAward(roleid, spcaward, ayd, 0, null);
		}
			
		//??????????????????
		YYLogger.completeTaskLog(roleid, 1080000, YYLogger.SUCC_FLAG, "");
	}
	
	public static Map<Integer, RewardObjs> calcAwardById(final long roleid, final int awardid, final xbean.AnYeData ayd, final int IsDbPoint, Map<String, Object> paras) {
		if (paras == null)
			paras = new HashMap<String, Object>(20);		
		paras.put(RewardMgr.RING, ayd.getTimes() + 1);
		paras.put(RewardMgr.ISDBPOINT, IsDbPoint);	
		return fire.pb.activity.award.RewardMgr.getInstance().calAllAward(roleid, awardid, paras);
	}
	
	public static void distributeAward(final long roleid, final int awardid, final xbean.AnYeData ayd, final int IsDbPoint, Map<String, Object> paras) {
		if (paras == null)
			paras = new HashMap<String, Object>(20);		
		paras.put(RewardMgr.RING, ayd.getTimes());
		paras.put(RewardMgr.ISDBPOINT, IsDbPoint);
		
		fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, awardid, paras,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, awardid,
						1080000, "??????????????????");
	}
}

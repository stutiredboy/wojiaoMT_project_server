package fire.pb.circletask;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.locojoy.base.Marshal.OctetsStream;

import fire.log.YYLogger;
import fire.pb.PAddExpProc;
import fire.pb.PropRole;
import fire.pb.activity.award.RewardMgr;
import fire.pb.battle.PNewBattle;
import fire.pb.circletask.CircTask;
import fire.pb.circletask.CircTaskClass;
import fire.pb.circletask.CircTaskConf;
import fire.pb.circletask.CircTaskItemFind;
import fire.pb.circletask.RefreshDataType;
import fire.pb.circletask.SpecialQuestID;
import fire.pb.circletask.SpecialQuestNpcMsg;
import fire.pb.circletask.SpecialQuestState;
import fire.pb.circletask.SpecialQuestType;
import fire.pb.circletask.anye.RoleAnYeTask;
import fire.pb.clan.ClanUtils;
import fire.pb.event.CircleTaskCompleteEvent;
import fire.pb.event.MissionCompleteEvent;
import fire.pb.hook.PSubDpointCntProc;
import fire.pb.hook.RoleHookManager;
import fire.pb.item.Commontext;
import fire.pb.item.EquipItem;
import fire.pb.item.FoodItem;
import fire.pb.item.ItemBase;
import fire.pb.item.ItemMaps;
import fire.pb.item.Pack;
import fire.pb.item.SItemToItem;
import fire.pb.item.Commontext.UseResult;
import fire.pb.main.ConfigManager;
import fire.pb.map.Role;
import fire.pb.map.SceneNpcManager;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.npc.NpcServices;
import fire.pb.npc.PReqFortuneWheel;
import fire.pb.pet.PetColumn;
import fire.pb.pet.PetColumnTypes;
import fire.pb.talk.ChatChannel;
import fire.pb.talk.MessageMgr;
import fire.pb.talk.SChatItemTips;
import fire.pb.talk.STransChatMessageNotify2Client;
import fire.pb.util.Misc;
import mkdb.Procedure;

public class CircleTask {
	public static final Set<Long> inBattleRoles = Collections.synchronizedSet(new HashSet<Long>());
	public static void addCatchItDstService(final long roleid, final int npcid, java.util.List<Integer> result) {
		xbean.CircleTaskMap quest_map = xtable.Rolecircletask.select(roleid);
		if (quest_map == null)
			return;
		xbean.CircleTaskInfo sqinfo = quest_map.getTaskmap().get(SpecialQuestID.catchIt);
		if (null == sqinfo)
			return;
		if (sqinfo.getQueststate() != SpecialQuestState.UNDONE)
			return;
		
		if (sqinfo.getQuestclass() == CircTaskClass.CircTask_CatchIt) {
			if (sqinfo.getDstnpcid() != npcid)
				return;
			if (sqinfo.getQueststate() == SpecialQuestState.UNDONE)
				result.add(NpcServices.CATCH_IT_Battle);
		}
		return;
	}
	//???????????????????????????npc????????????
	public static void addCTDynamicServices(long roleid, long npckey, java.util.List<Integer> result) {
		for(Integer curtype : CircleTaskManager.getInstance().getCircTaskTypes()) {
			final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid, curtype);
			if (null == sqinfo || sqinfo.getQueststate() != SpecialQuestState.UNDONE)
				continue;
			
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_Mail) {
				final fire.pb.map.Npc npc = SceneNpcManager.selectNpcByKey(npckey);
				if(null == npc || sqinfo.getDstnpcid() != npc.getNpcID())
					continue;
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE) {
					//result.add(NpcServices.SEND_MAIL);
					if (sqinfo.getDoneparam() > 0) {
						result.add(sqinfo.getDoneparam());
						CircleTaskManager.logger.error("?????????????????????id:" + sqinfo.getDoneparam());
					} else {
						CircleTaskManager.logger.error("?????????????????????id:" + sqinfo.getDoneparam() + ",??????!");
					}
				}
			} else if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemFind || 
					sqinfo.getQuestclass() == CircTaskClass.CircTask_PetCatch) {
				//TODO:?????????????????????????,??????
			} else {
				//??????????????????????????????????????????????????????npc????????????????????????????????????????????????????????????????????????
				
			}
		}
	}
	public static void distributeAward(final long roleid, final int awardid, final xbean.CircleTaskInfo sqinfo, final int IsDbPoint, Map<String, Object> paras) {
		if (paras == null)
			paras = new HashMap<String, Object>(20);
		
		paras.put(RewardMgr.RING, sqinfo.getRound());
		paras.put(RewardMgr.ISDBPOINT, IsDbPoint);
		
		int questType = 0;
		
		switch (sqinfo.getQuestid()) {
		case 1010000:
			questType = PAddExpProc.ZHIYE;
			break;
		case 1030000:
			questType = PAddExpProc.RICHANG;
			break;
		case 1060000:
			questType = PAddExpProc.GONGHUI_RENWU;
			break;
		case 1040000:
			questType = PAddExpProc.KAOGU;
			break;
		case 1050000:
			questType = PAddExpProc.YINGXIONGSILIAN;
			break;
		default:
			break;
		}
		
		fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, awardid, paras,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, awardid,
						questType, "??????????????????");
	}
	
    public static java.util.Set<Integer> getCTPatrolMap(long roleid) {
		java.util.Set<Integer> ret = new java.util.HashSet<Integer>();
		for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
			final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid, curType);
			if (null == sqinfo)
				continue;
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_Patrol) {
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE)
					ret.add(sqinfo.getDstmapid());
			}
		}
		return ret;
	}
	public static boolean getRoleSpecialQuest(long roleid, int questid, int questtype, SChatItemTips sendmsg) {
		final CircleTask sq = new CircleTask(roleid, false);
		xbean.CircleTaskInfo sqinfo = sq.getSpecialQuestInfo(questid);
		if(null == sqinfo)
			return false;
		
		OctetsStream octs = new OctetsStream();
		octs.marshal(sqinfo.getQuestid());
		octs.marshal(sqinfo.getQuesttype());
		octs.marshal(sqinfo.getQueststate());
		octs.marshal(sqinfo.getRound());
		octs.marshal(sqinfo.getSumnum());
		octs.marshal(sqinfo.getDstmapid());
		octs.marshal(sqinfo.getDstnpckey());
		octs.marshal(sqinfo.getDstnpcid());
		octs.marshal(sqinfo.getDstitemid());
		octs.marshal(sqinfo.getDstx());
		octs.marshal(sqinfo.getDsty());
		octs.marshal(sqinfo.getDstitemnum());
		octs.marshal(sqinfo.getBattlenum()); //destitemid2
		if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemFind && sqinfo.getDoneparam() > 0) {
			octs.marshal(sqinfo.getDoneparam()); //dstitemidnum2
		} else {
			octs.marshal((int)0);
		}
		octs.marshal((long)0L); //validtime
		octs.marshal((int)0); //islogin
		fire.pb.PropRole prole = new fire.pb.PropRole(roleid, true);
		octs.marshal(prole.getLevel());
		octs.marshal(prole.getSchool());
		sendmsg.tips = octs;
		return true;
	}
	
	public static xbean.CircleTaskInfo getSpecialQuestInfo(long roleid,
			int questid) {
		xbean.CircleTaskMap quests = xtable.Rolecircletask.get(roleid);
		if (null == quests)
			return null;
		return quests.getTaskmap().get(questid);
	}
	
	public static void giveCircleTaskWheel(long roleid, CircTask conf, final fire.pb.map.Npc npc, xbean.CircleTaskInfo sqinfo) {
		if (conf.getIsopenaward() == 1) {
//			sqinfo.setOpenawardnum(sqinfo.getOpenawardnum() + 1);
//			if (sqinfo.getOpenawardnum() >= conf.getOpenawardnum()) {
//				if (conf.getOpenawardid() > 0) {
//					if(npc != null) { 
//					 new PReqFortuneWheel(roleid, npc == null ? 0 :npc.getUniqueID(), npc == null ? 0 :npc.getNpcID(), 0, 0, 0, conf.getOpenawardid(),
//							 SpecialQuestNpcMsg.SPECIAL_QUEST_FORTUNEWHEEL_MSG,null,true,NpcServices.FORTUNE_WHEEL).call();
//					} else {
//						CircleTaskManager.logger.warn("??????[" + roleid + "]????????????" + conf.getType() + "???????????????????????????:" + conf.getOpenawardnum()
//								 + ",??????id:" + conf.getOpenawardid() + ".????????????:" + sqinfo.getOpenawardnum() + ",???npc???null!");
//					}
//				}
//				sqinfo.setOpenawardnum(0);
//			}
			if (sqinfo.getQuesttype() == 1070004){
				if(conf.getOpenawardid() > 0) {
					CircleTaskManager.logger.info("??????[" + roleid + "]????????????" + conf.getType() + "??????????????????id:" + conf.getOpenawardid());
					 new PReqFortuneWheel(roleid, npc == null ? 0 :npc.getUniqueID(), npc == null ? 0 :npc.getNpcID(), 0, 0, 0, conf.getOpenawardid(),
							 SpecialQuestNpcMsg.SPECIAL_QUEST_FORTUNEWHEEL_MSG,null,true,NpcServices.FORTUNE_WHEEL).call();
				}
			}
			CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + conf.getType() + "???????????????????????????:" + conf.getOpenawardnum()
					 + ",??????id:" + conf.getOpenawardid() + ".????????????:" + sqinfo.getOpenawardnum());
		} else {
			CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + conf.getType() + "????????????????????????,?????????.");
		}
	}
	
	public static void giveCTAward(final long roleid, final int roleLevel, final int circletype, final fire.pb.map.Npc npc, xbean.CircleTaskInfo sqinfo, Map<String, Object> paras, boolean teshu) {
		//????????????????????????????????????id
		if (sqinfo == null)
			return;
		
		CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + circletype + "???" + sqinfo.getQuesttype() + "???????????????!");
		
		if (paras == null)
			paras = new HashMap<String, Object>(20);
		
		// ????????????
		final CircTask ctaward = CircleTaskManager.getInstance().getCircTask(sqinfo.getId());
		if (ctaward == null) {
			return;
		}	

		int circleMax = CircleTaskManager.getInstance().getCTCircleMax(ctaward);
		if (sqinfo.getSumnum() >= circleMax) {
			if (circletype != 1060000) {
				//?????????20??????????????????
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ctaward.getMaxnumtips(), null);
			}
		}
				
//		final fire.pb.PropRole prole = new fire.pb.PropRole(roleid, false);
		int dayMax = ctaward.awardtime;
		int gaoJiangHuanShu = ctaward.gjhuanshu; //????????????
//		int petKey = prole.getFightpetkey();
		//?????????????????????????????????????????????
		short dpoint = RoleHookManager.getInstance().getLastDpoint(roleid);
		if (dpoint >= ctaward.doublepoint && dpoint > 0) { //???????????????????????????
			new PSubDpointCntProc(roleid, ctaward.doublepoint).call();
			
			// ??????????????????
			if (ctaward.getDbappendawardids() != null) {
				//???????????????
				int awardid = CircleTaskManager.getInstance().getCircTaskDoubleZong(sqinfo.getId(), roleLevel);
				distributeAward(roleid, awardid, sqinfo, 1, paras);
			}
			
			//??????????????????
			if (ctaward.specialaward > 0 && teshu) {
				distributeAward(roleid, ctaward.specialaward, sqinfo, 1, paras);
			}
			
			if (gaoJiangHuanShu >= sqinfo.getSumnum() && gaoJiangHuanShu > 0) {
				// ????????????
				if (ctaward.gjaward > 0) {
					distributeAward(roleid, ctaward.gjaward, sqinfo, 1, paras);
				}
				
				//??????????????????
				if (sqinfo.getRound() == ctaward.ring) {
					if (ctaward.mlgjitemaward > 0) {
						distributeAward(roleid, ctaward.mlgjitemaward, sqinfo, 1, paras);
					}
				}
			}
			else {
				// ??????????????????
				if (ctaward.ptitemaward > 0) {
					distributeAward(roleid, ctaward.ptitemaward, sqinfo, 1, paras);
				}
			}
			
			//??????????????????????????????
			if (sqinfo.getRound() == ctaward.ring) {
				if (ctaward.mldbitemaward > 0) {
					distributeAward(roleid, ctaward.mldbitemaward, sqinfo, 1, paras);
				}
			}
			
			//???10??????????????????			
			if (sqinfo.getRound() == ctaward.extraitemawardring) {
				if (ctaward.extraitemaward > 0) {
					distributeAward(roleid, ctaward.extraitemaward, sqinfo, 1, paras);
				}
			}
			
			//??????????????????
			CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
			if (ctc == null) {
				return;
			}
			if (ctc.awardid != 0) {
				paras.put(RewardMgr.RING, sqinfo.getRound());
				paras.put(RewardMgr.ISDBPOINT, 1);
				paras.put(RewardMgr.TASKLV, ctc.tasklevel);
				fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, ctc.awardid, paras,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, ctc.awardid, PAddExpProc.OTHER_QUEST, "??????????????????");
			}
		}
		else if ((sqinfo.getSumnum() - sqinfo.getCatchitdoubletime()) < dayMax) { //???????????????????????????
			//??????????????????
			if (ctaward.specialaward > 0 && teshu) {
				distributeAward(roleid, ctaward.specialaward, sqinfo, 0, paras);
			}
			
			if (gaoJiangHuanShu >= sqinfo.getSumnum() && gaoJiangHuanShu > 0) {
				// ????????????
				if (ctaward.gjaward > 0) {
					distributeAward(roleid, ctaward.gjaward, sqinfo, 0, paras);
				}
				
				//??????????????????
				if (sqinfo.getRound() == ctaward.ring) {
					if (ctaward.mlgjitemaward > 0) {
						distributeAward(roleid, ctaward.mlgjitemaward, sqinfo, 0, paras);
					}
				}
			}
			else {
				// ??????????????????
				if (ctaward.ptitemaward > 0) {
					distributeAward(roleid, ctaward.ptitemaward, sqinfo, 0, paras);
				}
			}
			
			//???10??????????????????			
			if (sqinfo.getRound() == ctaward.extraitemawardring) {
				if (ctaward.extraitemaward > 0) {
					distributeAward(roleid, ctaward.extraitemaward, sqinfo, 0, paras);
				}
			}
			
			//??????????????????
			CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
			if (ctc == null) {
				return;
			}
			if (ctc.awardid != 0) {
				paras.put(RewardMgr.RING, sqinfo.getRound());
				paras.put(RewardMgr.ISDBPOINT, 0);
				paras.put(RewardMgr.TASKLV, ctc.tasklevel);
				fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleid, ctc.awardid, paras,
						fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, ctc.awardid, PAddExpProc.OTHER_QUEST, "??????????????????");
			}
		}
		else if (ctaward.shengwangaward > 0) {
			distributeAward(roleid, ctaward.shengwangaward, sqinfo, 0, paras);
		}
		
		//???????????????
		int awardLevel = CircleTaskManager.getInstance().getCircTaskZong(sqinfo.getId(), roleLevel);
		if (awardLevel != -1) {
			RewardMgr.getInstance().distributeAllAward(roleid,
					awardLevel,
					paras,
					fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task,
					awardLevel, PAddExpProc.BATTLE_AWARD,
					"??????????????????", true);
		}
		
		if (npc != null) {
			giveCircleTaskWheel(roleid, ctaward, npc, sqinfo);
		} else {
			giveCircleTaskWheel(roleid, ctaward, null, sqinfo);
		}
		
		fire.pb.event.Poster.getPoster().dispatchEvent(new MissionCompleteEvent(roleid, sqinfo.getQuesttype()));
		fire.pb.event.Poster.getPoster().dispatchEvent(new CircleTaskCompleteEvent(roleid, sqinfo.getQuestid()));
		//?????????????????? ????????????
		if(1060000 != sqinfo.getQuestid())
			YYLogger.completeTaskLog(roleid, circletype, YYLogger.SUCC_FLAG, "");
		else
			YYLogger.completeActivityLog(roleid, 118, YYLogger.SUCC_FLAG, "");
	}

	public static void giveTeamLeaderAward(final long roleId, final xbean.CircleTaskInfo sqinfo, final CircTask ctaward, final int questType) {
		if (sqinfo == null)
			return;

//		Bag bag = (Bag)fire.pb.item.Module.getInstance().getItemColumn(
//				roleId, fire.pb.item.BagTypes.BAG, false);	
		
//		final fire.pb.PropRole prole = new fire.pb.PropRole(roleId, false);
		
		Map<String, Object> paras = new HashMap<String, Object>();
		paras.put(RewardMgr.IS_LEADER, 1);
		CircleTaskTeamLeaderAward teamleaderAward = CircleTaskManager.getInstance().getTeamLeaderAward(questType);
		if (teamleaderAward == null)
			return;
		int nIndex = 0;
		for (Integer itemid : teamleaderAward.itemIds) {
			//????????????????????????id
			if (teamleaderAward.awardRate.get(nIndex) > Misc.getRatePercent()) {
				
				if (itemid > 0) {
					fire.pb.activity.award.RewardMgr.getInstance().distributeAllAward(roleId, itemid, paras,
							fire.log.enums.YYLoggerTuJingEnum.tujing_Value_Task, itemid, PAddExpProc.OTHER_QUEST, "??????????????????");
				}
//				BasicItem item = Module.getInstance().getItemManager().genBasicItem(itemid, 1, 0, null, false);
//				
//				if (bag.addItem(item, -1, Constant.ADD_ITEM_REASON, fire.log.YYLogger.COUNTER_TYPE, 0) 
//						!= AddItemResult.SUCC){
//					Message.psendMsgNotifyWhileRollback(roleId, 142338, null);
//					return;
//				}
			}
			
			nIndex ++;
		}
	}
	

	public static boolean hasSpecialQuest(long roleid, int questid) {
		final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid,
				questid);
		if (null == sqinfo)
			return false;
		if (sqinfo.getQueststate() == SpecialQuestState.DONE
				|| sqinfo.getQueststate() == SpecialQuestState.UNDONE)
			return true;
		return false;
	}

	public static int isHaveItemCollect(long roleid) {
		for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
			final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid, curType);
			if (null == sqinfo)
				continue;
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemCollect) {
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE)
					return curType;
			}
		}
		return 0;
	}

	public static int isHaveItemFind(long roleid) {
		for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
			final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid, curType);
			if (null == sqinfo)
				continue;
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemFind) {
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE)
					return curType;
			}
		}
		return 0;
	}
	
	public static int isHaveKillMonster(long roleid) {
		for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
			final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid, curType);
			if (null == sqinfo)
				continue;
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_KillMonster) {
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE)
					return curType;
			}
		}
		return 0;
	}
	
	public static int isHavePatrol(long roleid) {
		for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
			final xbean.CircleTaskInfo sqinfo = selectSpecialQuestInfo(roleid, curType);
			if (null == sqinfo)
				continue;
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_Patrol) {
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE)
					return curType;
			}
		}
		return 0;
	}
	
	
	public static void loadCatchItService(long roleid, java.util.List<Integer> result) {
		xbean.CircleTaskMap quest_map = xtable.Rolecircletask.select(roleid);
		if (quest_map == null)
			return;
		xbean.CircleTaskInfo sqinfo = quest_map.getTaskmap().get(SpecialQuestID.catchIt);
		if (null == sqinfo) {
			result.add(NpcServices.CATCH_IT);
			result.add(NpcServices.CATCH_IT_QUERY);
			result.add(NpcServices.CATCH_IT_BJ);
			return;
		}
		
		if (sqinfo.getQueststate() == SpecialQuestState.UNDONE) {
			result.add(NpcServices.CATCH_IT_QUERY);
		}
		else {
//			if (sqinfo.getQueststate() == SpecialQuestState.DONE || sqinfo.getRound() == 0 || sqinfo.getQueststate() == SpecialQuestState.ABANDONED) {
//				
//			}
			result.add(NpcServices.CATCH_IT);
			result.add(NpcServices.CATCH_IT_QUERY);
			result.add(NpcServices.CATCH_IT_BJ);
			return;
		}
		
//		fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
//		if (null != team || !team.isTeamLeader(roleid)) {
//		}
		
		return;
	}

	
	public static void loggerCTSchoolQuestOnAbandon(long roleid, xbean.CircleTaskInfo sqinfo){
		fire.pb.PropRole prole = new fire.pb.PropRole(roleid, false);
		switch (sqinfo.getQuestclass()){
		case CircTaskClass.CircTask_Mail:{
			CircleTaskManager.logger.info("????????????????????????:??????id:"+sqinfo.getQuesttype() +", ??????id:"+ roleid + ", ????????????:"+ prole.getName() +"????????????:"+prole.getLevel()+ ", ????????????ID:"+ prole.getSchool() + ", ????????????NPCID:" + sqinfo.getDstnpcid() + ", ??????:"+sqinfo.getSumnum() + ", ??????:"+sqinfo.getRound());
		}
		break;
		case CircTaskClass.CircTask_ItemUse:{
			CircleTaskManager.logger.info("????????????????????????:??????id:"+sqinfo.getQuesttype() +", ??????id:"+ roleid + ", ????????????:"+ prole.getName() +"????????????:"+prole.getLevel()+ ", ????????????ID:"+ prole.getSchool() + ", ????????????ID:" + sqinfo.getDstitemid()+", ??????:"+sqinfo.getSumnum() + ", ??????:"+sqinfo.getRound());
		}
		break;
		}
		//log
		//doSchoolQuestLog(roleid,sqinfo,RemoteLogID.CTSCHOOL_ABANDONED);
	}

	
	public static void loggerCTSchoolQuestOnTake(long roleid, xbean.CircleTaskInfo sqinfo){
		xbean.Properties prop = xtable.Properties.select(roleid);
		switch (sqinfo.getQuestclass()){
		case CircTaskClass.CircTask_Mail:{
			CircleTaskManager.logger.info("????????????????????????:??????id:"+sqinfo.getQuesttype() +", ??????id:"+ roleid + ", ????????????:"+ prop.getRolename() +"????????????:"+prop.getLevel()+ ", ????????????ID:"+ prop.getSchool() + ", ????????????NPCID:" + sqinfo.getDstnpcid() + ", ??????:"+sqinfo.getSumnum() + ", ??????:"+sqinfo.getRound());
		}
		break;
		case CircTaskClass.CircTask_ItemUse:{
			CircleTaskManager.logger.info("????????????????????????:??????id:"+sqinfo.getQuesttype() +", ??????id:"+ roleid + ", ????????????:"+ prop.getRolename() +"????????????:"+prop.getLevel()+ ", ????????????ID:"+ prop.getSchool() + ", ????????????ID:" + sqinfo.getDstitemid()+", ??????:"+sqinfo.getSumnum() + ", ??????:"+sqinfo.getRound());
		}
		break;
		}
	}
	
	public static void loggerSchoolQuestOnTimeout(long roleid, xbean.CircleTaskInfo sqinfo){
		fire.pb.PropRole prole = new fire.pb.PropRole(roleid, false);
		CircleTaskManager.logger.info("??????????????????:??????id:"+sqinfo.getQuesttype() +", ??????id:"+ roleid + ", ????????????:"+ prole.getName() +"????????????:"+prole.getLevel()+ ", ????????????ID:"+ prole.getSchool()+ ", ??????:"+sqinfo.getSumnum() + ", ??????:"+sqinfo.getRound());
		
	}

	
	public static xbean.CircleTaskInfo selectSpecialQuestInfo(long roleid,
			int questid) {
		xbean.CircleTaskMap quests = xtable.Rolecircletask.select(roleid);
		if (null == quests)
			return null;
		return quests.getTaskmap().get(questid);
	}

	
	private long roleid;


	
	private xbean.CircleTaskMap questmap;

	
	private xbean.RenXingData renxingdata;
	
	private xbean.CircleTaskCompleteTimes ctcomtimes;

	
	private boolean readonly;
	
	public CircleTask(long roleid, boolean readonly) {
		this.roleid = roleid;
		this.readonly = readonly;
		if (readonly) {
			questmap = xtable.Rolecircletask.select(roleid);
			renxingdata = xtable.Rolerenxingdata.select(roleid);
			ctcomtimes = xtable.Rolecircletaskcomplete.select(roleid);
		}
		else {
			questmap = xtable.Rolecircletask.get(roleid);
			if (questmap == null){
				questmap = xbean.Pod.newCircleTaskMap();
				xtable.Rolecircletask.insert(roleid, questmap);
			}
			renxingdata = xtable.Rolerenxingdata.get(roleid);
			if (renxingdata == null){
				renxingdata = xbean.Pod.newRenXingData();
				xtable.Rolerenxingdata.insert(roleid, renxingdata);
			}
			ctcomtimes = xtable.Rolecircletaskcomplete.get(roleid);
			if (ctcomtimes == null){
				ctcomtimes = xbean.Pod.newCircleTaskCompleteTimes();
				for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
					ctcomtimes.getCircletaskcounts().put(curType, new Integer(0));
				}
				ctcomtimes.setLogtime(Calendar.getInstance().getTimeInMillis());
				xtable.Rolecircletaskcomplete.insert(roleid, ctcomtimes);
			}
		}
	}
	
	
	public void abandonSpecialQuest(int questid) {
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(questid);
		if (null == sqinfo)
			return;
		
		if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemUse) {
			fire.pb.item.Pack bag = (fire.pb.item.Pack)
			fire.pb.item.Module.getInstance().getItemMaps( roleid, 
			fire.pb.item.BagTypes.BAG, false );
		    bag.removeItemById( sqinfo.getDstitemid(), 1, 
				fire.log.enums.YYLoggerTuJingEnum.tujing_Value_use, 7, "????????????" );
		}
		
		CircleTask.loggerCTSchoolQuestOnAbandon(roleid, sqinfo);
		
		final long now = Calendar.getInstance().getTimeInMillis();
		sqinfo.setLastgiveuptime(now);	
		
		final CircTask circTask = CircleTaskManager.getInstance().getCircTask(sqinfo.getId());
		if (circTask.giveupreset == 1) { //????????????
			sqinfo.setRound(0);
		}
		else { //???????????????
			sqinfo.setRound(sqinfo.getRound() - 1);
		}
		
		fire.pb.mission.Module.getInstance().untrackMission( roleid, questid);
		final SRefreshSpecialQuestState sendstate = new SRefreshSpecialQuestState();
		sendstate.questid = questid;
		sendstate.state = SpecialQuestState.ABANDONED;
		Procedure.psendWhileCommit(roleid, sendstate);
	}
	public boolean addCircleTaskCompleteTimes(long roleid, int circletype) {
		if (readonly)
			return false;
		if (!fire.pb.util.DateValidate.inTheSameWeek(Calendar.getInstance().getTimeInMillis(), ctcomtimes.getLogtime())){
			CircleTaskManager.logger.info("??????[" + roleid + "]????????????[" + circletype + "]?????????????????????????????????(??????),??????");
			clearCircleTaskCompleteTimes();
		}
		Integer count =  ctcomtimes.getCircletaskcounts().get(new Integer(circletype));
		if(null == count || count.equals(0)) {
			CircleTaskManager.logger.info("??????[" + roleid + "]????????????[" + circletype + "]???????????????????????????=" + 0);
			ctcomtimes.getCircletaskcounts().put(new Integer(circletype), new Integer(1));
			ctcomtimes.setLogtime(Calendar.getInstance().getTimeInMillis());
		} else {
			CircleTaskManager.logger.info("??????[" + roleid + "]????????????[" + circletype + "]???????????????????????????=" + count);
			ctcomtimes.getCircletaskcounts().put(new Integer(circletype), new Integer(count + 1));
			ctcomtimes.setLogtime(Calendar.getInstance().getTimeInMillis());
		}
		CircleTaskManager.logger.info("??????[" + roleid + "]????????????[" + circletype + "]?????????????????????????????????:" + ctcomtimes.getCircletaskcounts().get(new Integer(circletype)));
		return true;
	}

	public boolean addRenXingCircTaskCount(long roleid, int circletype) {
		if (readonly)
			return false;
		Integer count =  renxingdata.getRenxinmap().get(new Integer(circletype));
		if(null == count || count.equals(0)) {
			renxingdata.getRenxinmap().put(new Integer(circletype), new Integer(1));
		} else {
			renxingdata.getRenxinmap().put(new Integer(circletype), new Integer(count + 1));
		}
		return true;
	}
	
	public boolean canRenXingCircTask(long roleid, int circletype) {
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(circletype);
		if (sqinfo != null) {
			return CircleTaskManager.getInstance().canRenXing(sqinfo.getQuesttype());
		}
		return false;
	}
	
	public boolean clearCircleTaskCompleteTimes() {
		if (readonly)
			return false;
		//ctcomtimes.getCircletaskcounts().clear();
		for(Integer curType : CircleTaskManager.getInstance().getCircTaskTypes()) {
			ctcomtimes.getCircletaskcounts().put(curType, new Integer(0));
		}
		return true;
	}
	
	public void clearSpecialQuestInfo(xbean.CircleTaskInfo sqinfo) {
		if (readonly)
			return;
		sqinfo.setDstitemid(0);
		sqinfo.setDstitemnum(0);
		sqinfo.setDstmapid(0);
		sqinfo.setDstnpcid(0);
		sqinfo.setDstnpckey(0);
		sqinfo.setDstx(0);
		sqinfo.setDsty(0);
		sqinfo.setQueststate(0);
		sqinfo.setQuesttype(0);
		sqinfo.setBattlenum(0);
		sqinfo.setNpcname("");
		sqinfo.setBigaward(0);
		//sqinfo.setEndtime(0);
		sqinfo.setDoneparam(0);
	}
	
	
	public UseResult CTItemUse(int itemid) {
		Role role=fire.pb.map.RoleManager.getInstance().getRoleByID(roleid);
		if (role==null)
			return Commontext.UseResult.FAIL;
		
		CircleTaskManager.logger.info("??????[" + roleid + "]??????????????????[" + itemid + "]?????????????????????");
		java.util.Set<Integer> sqtypes = CircleTaskManager.getInstance().getCircTaskTypes();
		for(Integer curtype : sqtypes) {
			final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(curtype);
			if (sqinfo == null 
					|| sqinfo.getQuestclass() != CircTaskClass.CircTask_ItemUse
					|| sqinfo.getQueststate() != SpecialQuestState.UNDONE
				)
				continue;
			
			if(sqinfo.getDstitemid() != itemid)
				continue;
			int mapid = sqinfo.getDstmapid();
			//int posx = ctiu.getXpos();
			//int posy = ctiu.getYpos();
			int posx = sqinfo.getDstx();
			int posy = sqinfo.getDsty();
			if (role.getMapId()!=mapid||Math.abs(role.getPos().toGridPos().getX()-posx)>5||Math.abs(role.getPos().toGridPos().getY()-posy)>5){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 166005, null);
				break;
			}
			
			CircleTaskManager.logger.info("??????[" + roleid + "]????????????[" + itemid + "]?????????????????????:" + curtype + "," + sqinfo.getQuestid());
			new UpdateCircleTaskState(roleid, curtype, SpecialQuestState.DONE).call();
			//????????????????????????
			CircTaskItemUse itemUse = CircleTaskManager.getInstance().getCTItemUseData(sqinfo.getSubitemtableid());
			
			mkdb.Procedure proc=new mkdb.Procedure(){
				@Override
				protected boolean process() throws Exception {
					try {
						if (itemUse.getHanhua() > 0) {
							xbean.ClanInfo clanInfo = ClanUtils.getClanInfoById(roleid, true);
							if (clanInfo == null) {
								return false;
							}
							
							String clanaim = clanInfo.getClanaim();
							fire.pb.message.SStringRes msg = ConfigManager.getInstance()
									.getConf(fire.pb.message.SStringRes.class).get(itemUse.getHanhua());
							if (msg == null) {
								return false;
							}
							
							String msgstring = msg.msg;
							msgstring = msgstring.replaceAll("\\$parameter1\\$", clanInfo.getClanname());
							msgstring = msgstring.replaceAll("\\$parameter2\\$", String.valueOf(clanInfo.getIndex()));
							msgstring = msgstring.replaceAll("\\$parameter3\\$", clanaim);
							final java.util.ArrayList<fire.pb.talk.DisplayInfo> showinfos  = new java.util.ArrayList<fire.pb.talk.DisplayInfo>();
							ChatChannel.getInstance().process(roleid, fire.pb.talk.ChannelType.CHANNEL_CURRENT, msgstring, clanaim, showinfos, 0);
						}
					} catch (Exception e) {
						CircleTaskManager.logger.error(e.getMessage());
						return false;
					}
					return true;
				}
			};
			mkdb.Procedure.pexecuteWhileCommit(proc);
			
			
			
			
			//Message.psendMsgNotifyWhileCommit(roleid, 142299,  null);
			return Commontext.UseResult.SUCC;
		}
		return Commontext.UseResult.FAIL;
	}
	
	
	public boolean dealGaoJiangCircleTask(int circletype, CircTask ct) {
		if(readonly)
			return false;
		int curComTimes = getCircleTaskCompleteTimes(circletype);
		CircleTaskManager.logger.info("??????[" + roleid + "]????????????[" + circletype + "]?????????????????????????????????:" + curComTimes + ",??????????????????:" + ct.gaojiang1quest + ",??????????????????:" + ct.gaojiang2quest);
		if(ct.gaojiang1quest > 0 && ct.gaojiang1 == curComTimes) {
			new PAutoAddCircleTask(roleid, ct.gaojiang1quest, 0, false, true).call();
		} else if(ct.gaojiang2quest > 0 && ct.gaojiang2 == curComTimes) {
			new PAutoAddCircleTask(roleid, ct.gaojiang2quest, 0, false, true).call();
		}
		return true;
	}
	
	public boolean exeCircTaskBattle(long roleid, long npckey, int circletype, int npcid) {
		if(circletype == 1080000) {//???????????????
			xbean.AnYeData aYTD = xtable.Anyemaxituan.select(roleid);
			if (aYTD == null) {
				return false;
			} else {
				for (Map.Entry<Integer, xbean.AnYeTask> e : aYTD.getAnyetasks().entrySet()) {
					if(e.getValue().getKind() == CircTaskClass.CircTask_ChallengeNpc) {
						if(e.getValue().getState() == SpecialQuestState.UNDONE && e.getValue().getDstnpcid() == npcid) {
							final fire.pb.map.Npc npc = SceneNpcManager.selectNpcByKey(npckey);
							if(npc == null || e.getValue().getDstnpcid() != npc.getNpcID())
								continue;
							
							final int aiid = (int)e.getValue().getParam1(); //????????????????????????????????????id
							CircleTaskManager.logger.debug("??????[" + roleid + "]" + circletype + "??????????????????npc:" + npcid + ",????????????:" + aiid);
							new PNewBattle(roleid, aiid, new AnYeChallengeNpcBattleEndHandler(circletype, roleid, npckey, e.getKey())).submit();
							break;
						}
					}
				}
				return true;
			}	
		}
		
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(circletype);
		if (sqinfo == null)
			return false;
		
		final CircTask ct = CircleTaskManager.getInstance().getCircTask(sqinfo.getId());
		if(ct == null) {
			return false;
		}
		
		if (ct.teamnum > 0) {
			fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleid);
			if (null == team || !team.isTeamLeader(roleid)){
				return false;
			}
			
			// ???????????????????????? ??????
			final java.util.List<Long> members = team.getNormalMemberIds();
			if (members.size() < ct.teamnum) {
				STransChatMessageNotify2Client notify = MessageMgr.getMsgNotify(140277, npcid, null);
				gnet.link.Onlines.getInstance().send(roleid, notify);
				return false;
			}
			
			//?????????????????????????????????
			List<String> levelApplyNames = new ArrayList<String>(5);
			for (Long mem : team.getNormalMemberIds()) {
				PropRole memberRole = new PropRole(mem, true);
				if(memberRole.getLevel() < ct.levelmin) {
					levelApplyNames.add(memberRole.getName());
				}
			}
			
			//??????????????????
			if (levelApplyNames.size() > 0) {
				StringBuffer strParam = new StringBuffer();
				int nIndex = 0;
				for (String name : levelApplyNames) {
					if (nIndex != (levelApplyNames.size() - 1)) {
						strParam.append(name).append(",");
					}
					else {
						strParam.append(name);
					}
				}
				
				List<String> paras = new ArrayList<String>(2);
				paras.add(strParam.toString());
				paras.add(String.valueOf(ct.levelmin));
				for (Long mem : team.getNormalMemberIds()) {
					STransChatMessageNotify2Client notify = MessageMgr.getMsgNotify(150523, 0, paras);
					gnet.link.Onlines.getInstance().send(mem, notify);
				}
				
				return false;
			}
		}
		
		if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ChallengeNpc
				&& sqinfo.getDstnpcid() == npcid) {
			//???npc????????????????????????
			final int aiid = sqinfo.getDoneparam(); //??????????????????????????????????????????id
			CircleTaskManager.logger.debug("??????[" + roleid + "]" + circletype + "??????????????????npc:" + npcid + ",????????????:" + aiid);
			new PNewBattle(roleid, aiid, new CircTaskChallengeNpcBattleEndHandler(circletype, roleid, npckey)).submit();
			return true;
		}
		return false;
	}
	
	public xbean.CircleTaskCompleteTimes getCircleTaskCompleteTimes() {
		return ctcomtimes;
	}
	
	public int getCircleTaskCompleteTimes(int circletype) {
		Integer count =  ctcomtimes.getCircletaskcounts().get(new Integer(circletype));
		if(null == count || count.equals(0)) {
			return 0;
		}
		return count.intValue();
		//return ctcomtimes.getCircletaskcounts().get(new Integer(circletype)).intValue();
	}
	
	
	//???????????????????????? RECYCLE:?????????,DONE:?????????,UNDONE:?????????
	public int getCircleTaskState(int circletype) {
		xbean.CircleTaskMap quest_map = xtable.Rolecircletask.select(roleid);
		if (null == quest_map) {
			return SpecialQuestState.RECYCLE;
		}
		xbean.CircleTaskInfo questinfo = quest_map.getTaskmap().get(circletype);
		if (null == questinfo) {
			return SpecialQuestState.RECYCLE;
		} else {
			final long now = Calendar.getInstance().getTimeInMillis();
			if (!fire.pb.util.DateValidate.inTheSameDay(questinfo.getTakequesttime(), now)){
				return SpecialQuestState.RECYCLE;
			}
			int dayMax = CircleTaskManager.getInstance().getCTCircleMax(roleid, circletype);
			if (dayMax > 0) {
				if (questinfo.getSumnum() >= dayMax) {
					return SpecialQuestState.DONE;
				}
			}
			if (now <= questinfo.getLastgiveuptime()) {
				return SpecialQuestState.UNDONE;
			}		
			if (questinfo.getQueststate() != SpecialQuestState.SUCCESS && questinfo.getQueststate() != 0) {
				if(questinfo.getQueststate() == SpecialQuestState.ABANDONED)
					return SpecialQuestState.RECYCLE;
				return SpecialQuestState.UNDONE;
			}
			return SpecialQuestState.RECYCLE;
		}
	}
	
	public int getCircTaskPatrolBattleNum(int circletype) {
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(circletype);
		if (sqinfo != null && sqinfo.getQuestclass() == CircTaskClass.CircTask_Patrol) {
			return sqinfo.getDstitemid();
		} else
			return -1;
	}
	
	
	public xbean.CircleTaskMap getQuestMap() {
		return questmap;
	}
	
	public int getRenXingCircTaskCount(long roleid, int circletype) {
		Integer count =  renxingdata.getRenxinmap().get(new Integer(circletype));
		if(null == count || count.equals(0)) {
			return 0;
		}
		return count.intValue();
	}
	
	
	public xbean.RenXingData getRenXingDate() {
		return renxingdata;
	}
	
	public int getSchoolQuestCurRound(int questid) {
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(questid);
		if (null == sqinfo)
			return 0;
		if (sqinfo.getQueststate()==SpecialQuestState.UNDONE || sqinfo.getQueststate() == SpecialQuestState.DONE ) 
			return sqinfo.getRound() - 1;
		return sqinfo.getRound();
	}
	
	//??????????????????????????????????????????????????????
	public java.util.Set<Integer> getSpecialQuestIdByType(int ctype) {
		java.util.Set<Integer> ret = new java.util.HashSet<Integer>();
		java.util.Set<Integer> cttypes = CircleTaskManager.getInstance().getCircTaskTypes();
		for(Integer curtype : cttypes) {
			final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(curtype);
			if(sqinfo != null) {
				if(sqinfo.getQuestclass() == ctype) {
					ret.add(curtype);
				}
			}
		}
		return ret;
	}
	
	
	public xbean.CircleTaskInfo getSpecialQuestInfo(int questid) {
		if (null == questmap)
			return null;
		else
			return questmap.getTaskmap().get(questid);
	}
	
	public int getSpecialQuestState(int questid) {
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(questid);
		if (sqinfo != null)
			return sqinfo.getQueststate();
		else
			return -1;
	}
	
	public boolean incCircTaskPatrolBattleNum(int circletype) {
		if (readonly)
			return false;
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(circletype);
		if (sqinfo != null && sqinfo.getQuestclass() == CircTaskClass.CircTask_Patrol) {
			sqinfo.setDstitemid(sqinfo.getDstitemid() + 1);
			return true;
		}
		return false;
	}
	
	public void onItemAdded(final int itemid, final int num) {
		if (readonly)
			return;

		final Pack bag = (Pack) fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, true);

		RoleAnYeTask rayt = new RoleAnYeTask(roleid);
		for(Map.Entry<Integer, xbean.AnYeTask> e : rayt.getTasks().entrySet()){
			xbean.AnYeTask ayt = e.getValue();
			if (ayt.getState() != SpecialQuestState.DONE && ayt.getState() != SpecialQuestState.UNDONE)
				continue;
			if(ayt.getKind() == CircTaskClass.CircTask_ItemFind) {
				CircleTaskManager.logger.info("??????[" + this.roleid + "]??????" + num + "?????????[" + itemid + "],???????????????[" + ayt.getId() + "]????????????[" + ayt.getDstitemid() + "]!??????????????????:" + ayt.getState());	
				//final Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, true);
				int hasnum = bag.getItemsNumByMapping(e.getValue().getDstitemid(), 0);
				if (hasnum >= e.getValue().getDstitemnum()) {
					CircleTaskManager.logger.debug("??????[" + roleid + "]????????????????????????id(?????????):" + e.getValue().getDstitemid() + ",??????:" + hasnum);
					if (e.getValue().getState() == SpecialQuestState.UNDONE){
						e.getValue().setState(SpecialQuestState.DONE);
					}
				} else {
					CircleTaskManager.logger.debug("??????[" + roleid + "]?????????????????????id(?????????):" + e.getValue().getDstitemid() + ",??????:" + hasnum);
					if (e.getValue().getState() == SpecialQuestState.DONE){
						e.getValue().setState(SpecialQuestState.UNDONE);
					}
				}
				rayt.refreshAnYeTasks(e.getKey());
				/*
				if(ayt.getDstitemid() == itemid) {
					int hasnum = bag.getItemNum(itemid, 0);
					CircleTaskManager.logger.info("??????[" + this.roleid + "]???????????????id:" + ayt.getId() + "????????????[" + ayt.getDstitemid() + "],????????????" + itemid + "??????" + hasnum);
					if (hasnum >= ayt.getDstitemnum()) {
						if (ayt.getState() == SpecialQuestState.UNDONE){
							rayt.doneTask(e.getKey());
						}
					} else {
						if (ayt.getState() == SpecialQuestState.DONE){
							rayt.undoneTask(e.getKey());
						}
					}
					rayt.refreshAnYeTasks(e.getKey());
				} else {
					if(CircleTaskManager.isItem2Item(ayt.getDstitemid(), itemid)){	
						int hasnum = bag.getItemNum(itemid, 0);
						CircleTaskManager.logger.info("??????[" + this.roleid + "]???????????????id:" + ayt.getId() + "????????????[" + ayt.getDstitemid() + "],???????????????[" + itemid + "](" + hasnum + ")??????????????????!");
						 if (hasnum >= ayt.getDstitemnum()) {
							if (ayt.getState() == SpecialQuestState.UNDONE){
								rayt.doneTask(e.getKey());
							}
						} else {
							if (ayt.getState() == SpecialQuestState.DONE){
								rayt.undoneTask(e.getKey());
							}
						}
						rayt.refreshAnYeTasks(e.getKey());
					}
				}
				*/
			}
		}
		
		if (questmap == null)
			return;
 		for (Map.Entry<Integer, xbean.CircleTaskInfo> e : questmap.getTaskmap().entrySet()) {
			final xbean.CircleTaskInfo sqinfo = e.getValue();
			if(sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemCollect
					&& sqinfo.getDstitemid() == itemid 
					&& sqinfo.getQueststate() == SpecialQuestState.DONE){
				final ItemMaps questbag =  fire.pb.item.Module.getInstance()
						.getItemMaps(roleid, fire.pb.item.BagTypes.QUEST, false);
				int hasnum = questbag.getItemNum(itemid, 0);
				int hasnum2 = bag.getItemNum(itemid, 0);
				if (hasnum + hasnum2 < sqinfo.getBattlenum()) {
					//new PAbandonSpecialQuestProc(roleid, sqinfo.getQuestid()).call();
				}else{
					boolean ret = new fire.pb.circletask.UpdateCircleTaskState(roleid, e.getKey(), SpecialQuestState.DONE).call();
					if(ret){
						final Pack bag4remove = (Pack) fire.pb.item.Module.getInstance().getItemMaps(roleid, fire.pb.item.BagTypes.BAG, false);
						if (bag4remove.removeItemById(itemid, hasnum2, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_use, 7,
									"Collect Item For SpecialQuest") != hasnum2){
							CircleTaskManager.logger.debug("?????????????????? ?????? id ???" + sqinfo.getQuestid() + "????????????:"+sqinfo.getQuesttype()
									+"  ????????????????????????" + itemid + "??????!!!");
							}
						if (questbag.removeItemById(itemid, hasnum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_use, 7,
								"Collect Item For SpecialQuest") != hasnum){
							CircleTaskManager.logger.debug("?????????????????? ?????? id ???" + sqinfo.getQuestid() + "????????????:"+sqinfo.getQuesttype()
									+"  ????????????????????????" + itemid + "??????!!!");
						}
					}
				}
			} else if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemFind) {
				int hasnum = bag.getItemsNumByMapping(sqinfo.getDstitemid(), 0);
				if (hasnum >= sqinfo.getDstitemnum()) {
					CircleTaskManager.logger.debug("?????? id:" + sqinfo.getQuestid() + ",????????????:"+sqinfo.getQuesttype()
						+",??????[" + roleid + "]????????????????????????id(?????????):" + sqinfo.getDstitemid() + ",??????:" + hasnum);
					if (sqinfo.getQueststate() == SpecialQuestState.UNDONE){
						new fire.pb.circletask.UpdateCircleTaskState(roleid, e
								.getKey(), SpecialQuestState.DONE).call();		
					}
					CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, false);
				} else {
					CircleTaskManager.logger.debug("?????? id:" + sqinfo.getQuestid() + ",????????????:"+sqinfo.getQuesttype()
							+",??????[" + roleid + "]?????????????????????id(?????????):" + sqinfo.getDstitemid() + ",??????:" + hasnum);
					if (sqinfo.getQueststate() == SpecialQuestState.DONE){
						new fire.pb.circletask.UpdateCircleTaskState(roleid, e
								.getKey(), SpecialQuestState.UNDONE).call();
						CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, false);
					}
				}
				
				
//				if(sqinfo.getDstitemnum() == itemid) {
//					int hasnum = bag.getItemNum(itemid, 0);
//					//stask.setDstitemnum(hasnum);
//					 if (hasnum >= sqinfo.getDstitemnum()) {
//						if (sqinfo.getQueststate() == SpecialQuestState.UNDONE){
//							new fire.pb.circletask.UpdateCircleTaskState(roleid, e
//									.getKey(), SpecialQuestState.DONE).call();
//							//BuffAgent agent = new BuffRoleImpl(roleid);
//							//agent.removeCBuffWithSP(SpecialQuestManager.ITEM_FIND_LEGEND_BUFF);
//						}
//					} else {
//						if (sqinfo.getQueststate() == SpecialQuestState.DONE)
//							new fire.pb.circletask.UpdateCircleTaskState(roleid, e
//									.getKey(), SpecialQuestState.UNDONE).call();
//					}
//					CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, false);
//				} else {
//					if(CircleTaskManager.isItem2Item(sqinfo.getDstitemid(), itemid)){
//						int hasnum = bag.getItemNum(itemid, 0);
//						//stask.setDstitemnum(hasnum);
//						 if (hasnum >= sqinfo.getDstitemnum()) {
//							if (sqinfo.getQueststate() == SpecialQuestState.UNDONE){
//								new fire.pb.circletask.UpdateCircleTaskState(roleid, e
//										.getKey(), SpecialQuestState.DONE).call();
//								//BuffAgent agent = new BuffRoleImpl(roleid);
//								//agent.removeCBuffWithSP(SpecialQuestManager.ITEM_FIND_LEGEND_BUFF);
//							}
//						} else {
//							if (sqinfo.getQueststate() == SpecialQuestState.DONE)
//								new fire.pb.circletask.UpdateCircleTaskState(roleid, e
//										.getKey(), SpecialQuestState.UNDONE).call();
//						}
//						CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, false);
//					}
//				}
			}
		}
	}
	
	
	public void onMoneyAdded(final long money) {
		
	}
	
	
	public void onPetColumnChange(final int petid) {
		if (questmap == null)
			return;
		final PetColumn pc = new PetColumn(roleid, fire.pb.pet.PetColumnTypes.PET, true);
		RoleAnYeTask rayt = new RoleAnYeTask(roleid);
		for(Map.Entry<Integer, xbean.AnYeTask> e : rayt.getTasks().entrySet()){
			xbean.AnYeTask ayt = e.getValue();
			if (ayt.getState() != SpecialQuestState.DONE && ayt.getState() != SpecialQuestState.UNDONE)
				continue;

			if(ayt.getKind() == CircTaskClass.CircTask_PetCatch) {
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
				rayt.refreshAnYeTasks(e.getKey());
			}
		}
		
		for (Map.Entry<Integer, xbean.CircleTaskInfo> e : questmap.getTaskmap().entrySet()) {
			final xbean.CircleTaskInfo sqinfo = e.getValue();
			if (sqinfo.getQueststate() != SpecialQuestState.DONE && sqinfo.getQueststate() != SpecialQuestState.UNDONE)
				continue;
			if (sqinfo.getQuesttype() != SpecialQuestType.CatchPet
					&& sqinfo.getQuestclass() != CircTaskClass.CircTask_PetCatch)
				continue;
			
			int targetnum = pc.getPetNumByMapping(sqinfo.getDstitemid()); //?????????????????????????????????????????????????????????????????????
			if(targetnum >= sqinfo.getDstitemnum()) {
				if (sqinfo.getQueststate() == SpecialQuestState.UNDONE ){
					new fire.pb.circletask.UpdateCircleTaskState(roleid, e.getKey(), SpecialQuestState.DONE).call();
				}
			} else {
				if (sqinfo.getQueststate() == SpecialQuestState.DONE)
					new fire.pb.circletask.UpdateCircleTaskState(roleid, e.getKey(), SpecialQuestState.UNDONE).call();
			}
			CircleTaskManager.getInstance().refresh2role(sqinfo, roleid, false);
		}
	}
	
	public boolean recycle(int questid) {
		return true;
	}
	
	public boolean sendCTSchoolNpcMail(int npcid) {
		java.util.Set<Integer> mailct = getSpecialQuestIdByType(CircTaskClass.CircTask_Mail);
		for(Integer curtype : mailct) {
			final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(curtype);
			if (sqinfo == null || sqinfo.getQueststate() != SpecialQuestState.UNDONE
					|| sqinfo.getDstnpcid() != npcid)
				continue;
			fire.pb.PropRole prole = new fire.pb.PropRole(roleid, false);
			int masterid = fire.pb.circletask.CircleTaskManager.getInstance().getMasterMap().get(prole.getSchool()).masterid;
			sqinfo.setDstnpcid(masterid);
			return new UpdateCircleTaskState(roleid, curtype,
						SpecialQuestState.DONE).call();
		}
		return false;
		
		
		
	}
	
	public boolean sendCTSchoolNpcMail(int npcid, int serviceid) {
		for (Map.Entry<Integer, xbean.CircleTaskInfo> e : questmap.getTaskmap().entrySet()) {
			final xbean.CircleTaskInfo sqinfo = e.getValue();
			if (sqinfo == null)
				continue;
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_Mail) {
				if(sqinfo.getQueststate() != SpecialQuestState.UNDONE || 
						sqinfo.getDstnpcid() != npcid ||
						sqinfo.getDoneparam() != serviceid)
					continue;
				fire.pb.PropRole prole = new fire.pb.PropRole(roleid, false);
				int masterid = fire.pb.circletask.CircleTaskManager.getInstance().getMasterMap().get(prole.getSchool()).masterid;
				sqinfo.setDstnpcid(masterid);
				return new UpdateCircleTaskState(roleid, sqinfo.getQuestid(), SpecialQuestState.DONE).call();
			}
		}
		return false;
	}
	
	public boolean stepState(int questid, int state) {
		if (readonly)
			return false;
		xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(questid);
		if (null == sqinfo)
			return false;
		if (sqinfo.getQueststate() != state && 
				sqinfo.getQueststate() == SpecialQuestState.UNDONE) {
			// ??????
			fire.pb.mission.UtilHelper.clearTransformID(roleid, sqinfo.getQuestid());
		}
		sqinfo.setQueststate(state);
		final SRefreshQuestData data = new SRefreshQuestData();
		data.questid = questid;
		data.datas.put(RefreshDataType.STATE, (long)state);
		if (state == SpecialQuestState.DONE){
			//????????????
			if(CircleTaskManager.getInstance().getCircTaskTypes().contains(sqinfo.getQuestid())) {
				CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
				if(ctc == null){
					return false;
				}
				if(ctc.autocomp == 0)
				{
					//int npcid = fire.pb.specialquest.SpecialQuestManager.getInstance().getMasterMap().get(prole.getSchool()).masterid;
					int npcid = sqinfo.getSubmitnpc();
					sqinfo.setDstnpckey(0);
					sqinfo.setDstnpcid(npcid);
				}
				else
				{
					//sqinfo.setDstnpckey(0);
					//sqinfo.setDstnpcid(0);
					
					//SpecialQuestManager.getInstance().refreshQuestState(roleid,
					//		questid, SpecialQuestState.SUCCESS);
				}
				data.datas.put(RefreshDataType.DEST_NPD_ID, (long)sqinfo.getDstnpcid());
				data.datas.put(RefreshDataType.DEST_NPD_KEY, (long)sqinfo.getDstnpckey());
			}

			// ??????????????????????????????npc?????????
//			if (sqinfo.getQuestid() == SpecialQuestID.factiondailyquestid){
//				if ( sqinfo.getQuesttype() == SpecialQuestType.FactionPublicize ) {
//					ArrayList<String> params = new ArrayList<String>();
//					xbean.FactionInfo fi = xtable.Factions.select( GradeRelationManager.getInstance().getFactionKeyByRoleid(roleid) );
//					if ( fi != null ) {
//						params.add( fi.getFactionname() );
//						params.add( String.valueOf( GradeRelationManager.getInstance().getFactionKeyByRoleid(roleid)) );
//						params.add( fi.getFactionaim() );
//						params.add( prole.getName() );
//						params.add( String.valueOf( prole.getTitleID() ) );
//						
//					//	fire.pb.talk.Message.getInstance().sendMsgScreen( , msg, showinfos, showkeytype)
//						fire.pb.talk.Message.psendMsgNotifyWhileCommit( roleid, 
//								SpecialQuestNpcMsg.FACTION_PUBLICIZE_MSG, roleid, params);
//					}
//				}
//				int npcid = fire.pb.util.FireProp.getIntValue(SpecialQuestManager.sqprop, "fire.pb.specialquest.factionmanager");
//				sqinfo.setDstnpcid(npcid);
//				data.datas.put(RefreshDataType.DEST_NPD_ID, (long)sqinfo.getDstnpcid());
//				
//			}
		}
		if (state == SpecialQuestState.UNDONE){
//			if (sqinfo.getQuestid() == SpecialQuestID.schoolquestid){
//				if (sqinfo.getQuesttype() == SpecialQuestType.CatchPet
//						|| sqinfo.getQuesttype() == SpecialQuestType.BuyItem)
//					sqinfo.setDstnpcid(0);
//					data.datas.put(RefreshDataType.DEST_NPD_ID, (long)sqinfo.getDstnpcid());
//			}
			
			sqinfo.setDstnpckey(0);
			sqinfo.setDstnpcid(0);
			data.datas.put(RefreshDataType.DEST_NPD_ID, (long)sqinfo.getDstnpcid());
			data.datas.put(RefreshDataType.DEST_NPD_KEY, (long)sqinfo.getDstnpckey());
			CircleTaskManager.getInstance().refreshQuestState(roleid, questid, SpecialQuestState.UNDONE);
		}
		mkdb.Procedure.psendWhileCommit(roleid, data);
		return true;
	}
	
	public boolean submit(int questid, fire.pb.map.Npc npc) {
		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(questid);
		if (null == sqinfo || npc == null)
			return false;
		if (sqinfo.getDstnpcid() != npc.getNpcID())
			return false;
		//??????????????????????????????????????????
		if (sqinfo.getQueststate() == SpecialQuestState.DONE) {
			if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemFind) {
				fire.pb.npc.SSubmit2Npc send = new fire.pb.npc.SSubmit2Npc();
				send.questid = questid;
				send.npckey = npc.getUniqueID();
				send.submittype =  fire.pb.npc.SubmitType.ITEM;
				Procedure.psendWhileCommit(roleid, send);
				return true;
			} else if (sqinfo.getQuestclass() == CircTaskClass.CircTask_PetCatch) {
				fire.pb.npc.SSubmit2Npc send = new fire.pb.npc.SSubmit2Npc();
				send.questid = questid;
				send.npckey = npc.getUniqueID();
				send.submittype = fire.pb.npc.SubmitType.PET;
				Procedure.psendWhileCommit(roleid, send);
				return true;
			} else {
				//????????????????????????????????????????????????????????????????????????????????????
				final int roleLevel = xtable.Properties.selectLevel(roleid);
				giveCTAward(roleid, roleLevel, sqinfo.getQuestid(), npc, sqinfo, null, false);
				//clearSpecialQuestInfo(sqinfo);
				CircleTaskManager.getInstance().refreshQuestState(roleid, questid, SpecialQuestState.SUCCESS);
				final CircTask ctq = CircleTaskManager.getInstance().getCircTask(roleid, sqinfo.getQuestid());
				if (ctq == null) {
					CircleTaskManager.logger.error("??????[" + roleid + "]????????????:" + sqinfo.getQuestid() + "?????????????????????");
					return false;
				}
				int circleMax = CircleTaskManager.getInstance().getCTCircleMax(ctq);
				if (ctq.getTaskcnt() == 2) {
					sqinfo.setSumnum(sqinfo.getSumnum() + 1);
					if (sqinfo.getSumnum() >= circleMax) {
						if (questid == 1060000) {
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150551, null);
						}
						else {
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ctq.getMaxnumtips(), null);
						}
					}
				}
				addCircleTaskCompleteTimes(roleid, questid);
				final CircTask ct = CircleTaskManager.getInstance().getCircTask(roleid, questid);
				if(null == ct)
					return false;
				dealGaoJiangCircleTask(questid, ct);
				
				fire.pb.course.CourseManager.achieveCourse(roleid, fire.pb.course.CourseType.ACTIVE_COURSE, ct.getActiveid(), 0);
				
				RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
				if (actrole != null && ct.getActiveid() > 0){
					actrole.handleActiveLivenessData(ct.getActiveid());
				}
				
				CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
				if(null == ctc){
					CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + sqinfo.getQuesttype() + "??????null???");
					return false;
				}
				if(ctc.getCompletetip() > 0) {
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ctc.getCompletetip(), null);
				}
				clearSpecialQuestInfo(sqinfo);
				if(ct.gjhuanshu == sqinfo.getSumnum()) {
					return true;
				}
				try {
					new PAutoAddCircleTask(roleid, sqinfo.getQuestid()).call();
				} catch (Exception e) {
					CircleTaskManager.logger.error("???????????????????????????????????????????????????:" , e);
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean submitItemPet(int questid, fire.pb.map.Npc npc,
			java.util.ArrayList<fire.pb.npc.SubmitUnit> things) {
		if (readonly)
			return false;
		if (null == things || things.isEmpty() || npc == null)
			return false;

		final xbean.CircleTaskInfo sqinfo = getSpecialQuestInfo(questid);
		if (sqinfo.getQueststate() != SpecialQuestState.DONE){
			return false;
		}
		
		if (sqinfo.getQuestclass() == CircTaskClass.CircTask_ItemFind) {
			int itemfindid = sqinfo.getGivetasknpcid();//?????????????????????????????????????????????id
			CircTaskItemFind ctif =  CircleTaskManager.getCircTaskItemFindConf(itemfindid);
			if (null != ctif) {
				if (1 == ctif.needquality) {
					//???????????????????????????(????????????)
					final fire.pb.PropRole role = new fire.pb.PropRole(roleid, true);
					int roleLevel = role.getLevel();
					//?????????????????????
					int targetquality = roleLevel * ctif.qualitya / 1000 + ctif.qualityb;
					CircleTaskManager.logger.debug("??????[" + roleid + "]???????????????????????????:" + targetquality + ".");
					boolean isdouble = false;
					for (fire.pb.npc.SubmitUnit unit : things) {
						final fire.pb.item.ItemMaps bag = fire.pb.item.Module
								.getInstance().getItemMaps(roleid,
										fire.pb.item.BagTypes.BAG, false);
						int curitemkey = unit.key;
						int curitemnum = unit.num;
						ItemBase targetitem = bag.getItem(curitemkey);
						if(null != targetitem){
							if(targetitem.getItemId() != sqinfo.getDstitemid() &&
									false == CircleTaskManager.isItem2Item(sqinfo.getDstitemid(), targetitem.getItemId())){
								CircleTaskManager.logger.debug("?????????????????? ??????id"+sqinfo.getQuestid()+"????????????:"+sqinfo.getQuesttype()+"????????????id?????????");
								return false;
								}
							if(targetitem instanceof EquipItem){
								EquipItem submititem = (EquipItem)targetitem;
								if(submititem.getEquipAttr().getDiamonds().size() > 0){
									fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 166001, null);
									CircleTaskManager.logger.debug("?????????????????? ??????id"+sqinfo.getQuestid()+"????????????:"+sqinfo.getQuesttype()+"???????????????????????????,???????????????");
									return false;
								}
							}
							if(targetitem instanceof FoodItem){
								FoodItem submititem = (FoodItem)targetitem;
								int curquality = submititem.getQuality();
								if(targetquality <= curquality){
									//?????????????????????????????????
									isdouble = true;
								} else {
									isdouble = false;
								}
								if (bag.removeItemWithKey(curitemkey, curitemnum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_use, 7, "Submit Item For SpecialQuest") != curitemnum){
									CircleTaskManager.logger.debug("?????????????????? ?????? id ???" + sqinfo.getQuestid() +"????????????:"+sqinfo.getQuesttype()+"  ??????????????????!!!");
									return false;
								}
							}
						}					
					}
					//giveSchoolQuestAward(roleid, npc, sqinfo);
					if(isdouble) {
						giveCTAward(roleid, roleLevel, sqinfo.getQuestid(), npc, sqinfo, null, true);
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150541, null);
					}
					else {
						giveCTAward(roleid, roleLevel, sqinfo.getQuestid(), npc, sqinfo, null, false);
					}
					//clearSpecialQuestInfo(sqinfo);
					CircleTaskManager.getInstance().refreshQuestState(roleid, questid, SpecialQuestState.SUCCESS);
					addCircleTaskCompleteTimes(roleid, questid);
					final CircTask ct = CircleTaskManager.getInstance().getCircTask(roleid, questid);
					if(null == ct) {
						CircleTaskManager.logger.error("??????[" + roleid + "]????????????:" + questid + "?????????????????????");
						return false;
					}
					RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
					if (actrole != null && ct.getActiveid() > 0){
						actrole.handleActiveLivenessData(ct.getActiveid());
					}
					dealGaoJiangCircleTask(questid, ct);
					
					fire.pb.course.CourseManager.achieveCourse(roleid, fire.pb.course.CourseType.ACTIVE_COURSE, ct.getActiveid(), 0);
					
					CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
					if(null == ctc){
						CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + sqinfo.getQuesttype() + "??????null???");
						return false;
					}
					if(ctc.getCompletetip() > 0) {
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ctc.getCompletetip(), null);
					}
					clearSpecialQuestInfo(sqinfo);
					if (ct.getTaskcnt() == 2) {
						sqinfo.setSumnum(sqinfo.getSumnum() + 1);
						int circleMax = CircleTaskManager.getInstance().getCTCircleMax(ct);
						if (sqinfo.getSumnum() >= circleMax) {
							if (questid == 1060000) {
								fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150551, null);
							}
							else {
								fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ct.getMaxnumtips(), null);
							}
						}
					}
					if(ct.gjhuanshu == sqinfo.getSumnum()) {
						return true;
					}
					try {
						//new PAddAutoCircTaskSchool(roleid).call();
						new PAutoAddCircleTask(roleid, sqinfo.getQuestid()).call();
					} catch (Exception e) {
						CircleTaskManager.logger.error("??????????????????????????????????????????????????????" , e);
					}
					return true;				
				} else if (0 == ctif.needquality) {
					//??????????????????????????????
					
					for (fire.pb.npc.SubmitUnit unit : things) {
						final fire.pb.item.ItemMaps bag = fire.pb.item.Module
								.getInstance().getItemMaps(roleid,
										fire.pb.item.BagTypes.BAG, false);
						int curitemkey = unit.key;
						int curitemnum = unit.num;
						ItemBase targetitem = bag.getItem(curitemkey);
						if(null != targetitem){
							if(targetitem.getItemId() != sqinfo.getDstitemid() &&
									false == CircleTaskManager.isItem2Item(sqinfo.getDstitemid(), targetitem.getItemId())){
								CircleTaskManager.logger.debug("?????????????????? ??????id"+sqinfo.getQuestid()+"????????????:"+sqinfo.getQuesttype()+"????????????id?????????");
								return false;
							}
							if(targetitem instanceof EquipItem){
								EquipItem submititem = (EquipItem)targetitem;
								if(submititem.getEquipAttr().getDiamonds().size() > 0){
									fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 166001, null);
									CircleTaskManager.logger.debug("?????????????????? ??????id"+sqinfo.getQuestid()+"????????????:"+sqinfo.getQuesttype()+"???????????????????????????,???????????????");
									return false;
								}
							}
							if (bag.removeItemWithKey(curitemkey, curitemnum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_use, 7, "Submit Item For SpecialQuest") != curitemnum){
								CircleTaskManager.logger.debug("?????????????????? ?????? id ???" + sqinfo.getQuestid() +"????????????:"+sqinfo.getQuesttype()+"  ??????????????????!!!");
								return false;
							}
						}					
					}
					//giveSchoolQuestAward(roleid, npc, sqinfo);
					final int roleLevel = xtable.Properties.selectLevel(roleid);
					if (ctif.teshu == 1)
						giveCTAward(roleid, roleLevel, sqinfo.getQuestid(), npc, sqinfo, null, true);
					else
						giveCTAward(roleid, roleLevel, sqinfo.getQuestid(), npc, sqinfo, null, false);
					//clearSpecialQuestInfo(sqinfo);
					CircleTaskManager.getInstance().refreshQuestState(roleid, questid, SpecialQuestState.SUCCESS);
					addCircleTaskCompleteTimes(roleid, questid);
					final CircTask ct = CircleTaskManager.getInstance().getCircTask(roleid, questid);	
					if (ct == null) {
						CircleTaskManager.logger.error("??????[" + roleid + "]????????????:" + questid + "?????????????????????");
						return false;
					}
					RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
					if (actrole != null && ct.getActiveid() > 0){
						actrole.handleActiveLivenessData(ct.getActiveid());
					}
					dealGaoJiangCircleTask(questid, ct);
					
					fire.pb.course.CourseManager.achieveCourse(roleid, fire.pb.course.CourseType.ACTIVE_COURSE, ct.getActiveid(), 0);
					
					CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
					if(null == ctc){
						CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + sqinfo.getQuesttype() + "??????null???");
						return false;
					}
					if(ctc.getCompletetip() > 0) {
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ctc.getCompletetip(), null);
					}
					clearSpecialQuestInfo(sqinfo);
					if (ct.getTaskcnt() == 2) {
						sqinfo.setSumnum(sqinfo.getSumnum() + 1);
						int circleMax = CircleTaskManager.getInstance().getCTCircleMax(ct);
						if (sqinfo.getSumnum() >= circleMax) {
							if (questid == 1060000) {
								fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150551, null);
							}
							else {
								fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ct.getMaxnumtips(), null);
							}
						}
					}
					if(ct.gjhuanshu == sqinfo.getSumnum()) {
						return true;
					}
					try {
						new PAutoAddCircleTask(roleid, sqinfo.getQuestid()).call();
					} catch (Exception e) {
						CircleTaskManager.logger.error("??????????????????????????????????????????????????????" , e);
					}
					return true;
				}
			}
		} else if (sqinfo.getQuestclass() == CircTaskClass.CircTask_PetCatch) {
			final fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(
					roleid, PetColumnTypes.PET, false);
			int dstpetid = sqinfo.getDstitemid();
			final xbean.PetInfo xpet = petcol.getPetInfo(things.get(0).key);//petcol.getPetInfoById(dstpetid);	  
			if (null == xpet || 
					(xpet.getId() != dstpetid && false == CircleTaskManager.isItem2Item(dstpetid, xpet.getId()))){
				CircleTaskManager.logger.debug("?????????????????? ??????id"+sqinfo.getQuestid()+"????????????:"+sqinfo.getQuesttype()+"??????????????????");
				return false;
			} else {
				if(petcol.removePet(xpet.getKey(),PetColumn.REMOVE_REASON_TASK,questid) < 0)
					return false;
				//giveSchoolQuestAward(roleid, npc,sqinfo);
				final int roleLevel = xtable.Properties.selectLevel(roleid);
				giveCTAward(roleid, roleLevel, sqinfo.getQuestid(), npc, sqinfo, null, false);
				//clearSpecialQuestInfo(sqinfo);
				CircleTaskManager.getInstance().refreshQuestState(roleid, questid, SpecialQuestState.SUCCESS);
				addCircleTaskCompleteTimes(roleid, questid);
				final CircTask ct = CircleTaskManager.getInstance().getCircTask(roleid, questid);
				if (ct == null) {
					CircleTaskManager.logger.error("??????[" + roleid + "]????????????:" + questid + "?????????????????????");
					return false;
				}
				RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleid);
				if (actrole != null && ct.getActiveid() > 0){
					actrole.handleActiveLivenessData(ct.getActiveid());
				}
				dealGaoJiangCircleTask(questid, ct);
				
				fire.pb.course.CourseManager.achieveCourse(roleid, fire.pb.course.CourseType.ACTIVE_COURSE, ct.getActiveid(), 0);
				
				CircTaskConf ctc = CircleTaskManager.getCircTaskConf(sqinfo.getQuesttype());
				if(null == ctc){
					CircleTaskManager.logger.debug("??????[" + roleid + "]????????????" + sqinfo.getQuesttype() + "??????null???");
					return false;
				}
				if(ctc.getCompletetip() > 0) {
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ctc.getCompletetip(), null);
				}
				clearSpecialQuestInfo(sqinfo);
				if (ct.getTaskcnt() == 2) {
					sqinfo.setSumnum(sqinfo.getSumnum() + 1);
					int circleMax = CircleTaskManager.getInstance().getCTCircleMax(ct);
					if (sqinfo.getSumnum() >= circleMax) {
						if (questid == 1060000) {
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150551, null);
						}
						else {
							fire.pb.talk.MessageMgr.sendMsgNotify(roleid, ct.getMaxnumtips(), null);
						}
					}
				}
				if(ct.gjhuanshu == sqinfo.getSumnum()) {
					return true;
				}
				try {
					//new PAddAutoCircTaskSchool(roleid).call();
					new PAutoAddCircleTask(roleid, sqinfo.getQuestid()).call();
				} catch (Exception e) {
					CircleTaskManager.logger.error("??????????????????????????????????????????????????????" , e);
				}
				return true;
			}
		}
		return true;
	}
}

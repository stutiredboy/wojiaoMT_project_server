package fire.pb.mission.treasuremap;

import java.util.List;
import fire.log.Logger;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.item.groceries.SuperTreasureMapItem;
import fire.pb.item.groceries.TreasuremapItem;
import fire.pb.mission.SUseTreasureMap;
import fire.pb.talk.MessageMgr;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import mkdb.Procedure;

public class PDigTreasureEnd extends Procedure {
	private final long roleId;
	private final int itemkey;
	private final int maptype;
	static Logger logger = Logger.getLogger("TASK");
	
	public PDigTreasureEnd(final long roleid, final int itemkey, final int maptype) {
		this.roleId = roleid;
		this.itemkey = itemkey;
		this.maptype = maptype;
	}
	
	@Override
	protected boolean process() throws Exception {
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER))
			return false;
		
		BuffAgent roleImpl = new BuffRoleImpl(roleId, true);
    	if (roleImpl.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)){
        	return false;
        }
		
		Team team = TeamManager.selectTeamByRoleId(roleId);
		if (team != null && (!team.isAbsentMember(roleId))) {
			if (!team.isTeamLeader(roleId)) {
				MessageMgr.sendMsgNotify(roleId, 130011, null);
				return false;
			}
		}
		
		fire.pb.item.Pack bag = new fire.pb.item.Pack(roleId, true);
		if (bag.getItem(itemkey) == null)
			return false;
		
		xbean.TreasureMapInfo info = xtable.Opentreasuremaptable.get(roleId);
		if (info == null) {
			info = xbean.Pod.newTreasureMapInfo();
			xtable.Opentreasuremaptable.insert(roleId, info);
		}
		
		info.setItemkey(itemkey);
		GiftResult giftRet = null;
		int tMapID = 0;
		
		final int roleLevel = xtable.Properties.selectLevel(roleId) ;
		
		if (maptype == 0) {
			TreasuremapItem item = (TreasuremapItem) bag.getItem(itemkey);
			if (item == null) {
				MessageMgr.psendMsgNotify(roleId, 160248, null);
				return false;
			}
			xbean.ArchMap mapProp = item.getExtInfo();
			if (mapProp == null) {
				return false;
			}
			tMapID = mapProp.getMapid();
			// ???????????????,????????????log
//			int suc = bag.removeItemWithKey(itemkey, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_wabaouse, 0, "Treasuremap used success");
//			if (suc != 1) {
//				return false;
//			}
			info.setItemid(item.getItemId());
			giftRet = BaoTuMapManager.getInstance().getGiftResult(item.getItemId(), roleLevel);
		}
		else if (maptype == 1) {
			SuperTreasureMapItem item = (SuperTreasureMapItem) bag.getItem(itemkey);
			if (item == null) {
				MessageMgr.psendMsgNotify(roleId, 160248, null);
				return false;
			}
			xbean.ArchMap mapProp = item.getExtInfo();
			if (mapProp == null) {
				return false;
			}
			tMapID = mapProp.getMapid();
			// ???????????????,????????????log
//			int suc = bag.removeItemWithKey(itemkey, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_wabaouse, 0, "Treasuremap used success");
//			if (suc != 1) {
//				return false;
//			}
			info.setItemid(item.getItemId());
			giftRet = BaoTuMapManager.getInstance().getGiftResult(item.getItemId(), roleLevel);
		}
		
		int awardRetId = 0; //0 ????????????, ??????????????????id
		if (giftRet == null)
			return false;
		/**
		 * 	1	????????????
			2	???????????????
			3	??????
			4	??????
			5	??????
		 */
		int awardType = giftRet.getAwardId();
		
		int roleLv = xtable.Properties.selectLevel(roleId);
//		List<Integer> itemLst = new ArrayList<Integer>();

		if (awardType > 100) { //????????????
			List<GiftByMap> itemAwardList = BaoTuMapManager.getInstance().getGiftMap(awardType);
			//??????mapId ??????0,?????????mapId ????????????;??????mapId???0,?????????????????????????????????
			if (itemAwardList.size() == 1) {
				//??????????????????
				GiftByMap giftByMap = itemAwardList.get(0);
				if (giftByMap.groupAward.size() == 0) {
					awardRetId = 0;
				}
				else {
					awardRetId = giftByMap.getAwardId(roleLv);
				}
				info.setTableindex(giftByMap.id);
//				itemLst.add(awardRetId);
//				giftRet.getAwardList(roleLv, tMapID, itemLst);
			}
			else {
				//???????????????
				for (GiftByMap giftByMap : itemAwardList) {
					if (giftByMap.mapId == tMapID) {
						awardRetId = giftByMap.getAwardId(roleLv);
						
						info.setTableindex(giftByMap.id);
//						itemLst.add(awardRetId);
						
						break;
					}
				}
				
//				giftRet.getAwardList(roleLv, tMapID, itemLst);
			}
		}
		else if(awardType < 10) { //????????????
//			itemLst.add(awardType);
//			giftRet.getAwardList(roleLv, tMapID, itemLst);
			
			GiftByEvent eventAward = BaoTuMapManager.getInstance().getEventGift(awardType);
			logger.info("????????????:" + eventAward.name);
			awardRetId = awardType;
		}
		
		info.setAwardid(awardRetId);
//		itemLst.add(awardRetId);
		
		SUseTreasureMap treasureMap = new SUseTreasureMap();
		treasureMap.awardid = awardRetId;
		treasureMap.maptype = maptype;
//		treasureMap.itemids.addAll(itemLst);
		Procedure.psendWhileCommit(roleId, treasureMap);
		
		return true;
	}
}

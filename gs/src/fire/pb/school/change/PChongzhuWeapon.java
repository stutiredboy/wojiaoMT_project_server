package fire.pb.school.change;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import java.util.Map;
import java.util.Map.Entry;

import com.locojoy.base.Octets;
import fire.pb.main.ConfigManager;
import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.RoleConfigManager;
import fire.pb.item.BagTypes;
import fire.pb.item.EquipItem;
import fire.pb.item.PetEquipItem;
import fire.pb.item.EquipItemShuXing;
import fire.pb.item.PetEquipItemShuXing;
import fire.pb.item.EquipUtils;
import fire.pb.item.make.ItemMakeFactory;
import fire.pb.item.ItemBase;
import fire.pb.item.ItemMaps;
import fire.pb.item.ItemShuXing;
import fire.pb.item.SAddItem;
import fire.pb.item.SGetItemTips;
import fire.pb.item.make.ItemMakeUtil;
import fire.pb.item.make.ZhuangBeiShuXing;
import fire.pb.item.make.ShuXing;
import fire.pb.ranklist.proc.PRoleZongheRankProc;
import fire.pb.shop.utils.MarketUtils;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;
import mkdb.Procedure;
import fire.pb.product.Commontext;
import fire.pb.util.BagUtil;

public class PChongzhuWeapon extends Procedure {
	public int srcweaponkey; 
    public int itemid; 
    public long roleid;
    private static Logger logger = Logger.getLogger("ITEM");
    public PChongzhuWeapon(final long roleid, final int srcweaponkey, final int itemid)
    {
        this.srcweaponkey = srcweaponkey;
        this.itemid = itemid;
        this.roleid = roleid;
    }
    @Override
    protected boolean process() throws Exception
    {
        fire.pb.item.Pack bag = null;
        // 拿到背包的锁
        bag = new fire.pb.item.Pack(roleid, false);
        ItemBase oldWeaponIB = bag.getItem((int)srcweaponkey);
        if (oldWeaponIB == null) {
            logger.error("重铸功能旧武器错误!!!----------------"+srcweaponkey);
			return false;
        }
        if(oldWeaponIB instanceof EquipItem)
        {
            logger.error("------------------------------装备重铸");
            Map<Integer, EquipItemShuXing> equipItemAttrConfig = ConfigManager.getInstance().getConf(EquipItemShuXing.class);
            if (fire.pb.buff.Module.existState(roleid,fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER))
                return false;
            if (oldWeaponIB == null || !(oldWeaponIB instanceof EquipItem)) {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("重铸功能旧武器错误!!!----"+itemid+"------------"+srcweaponkey);
                return false;
            }
            int itemID = oldWeaponIB.getItemId();
            EquipItem oldWeapon = ((EquipItem) oldWeaponIB);
                    
            EquipItemShuXing itemdata = equipItemAttrConfig.get(itemID);
            if(itemdata == null)
            {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("重铸功能没有找到该装备数据!!!");
                return false;
            }
            if(itemdata.ncanChongzhu == 0)
            {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("该装备不能重铸!!!");
                return false;
            }
            // 是否拍卖中
            if ((oldWeaponIB.getFlags() & fire.pb.Item.ONSTALL) != 0) {
                logger.error("拍卖的武器无法使用重铸功能");
                return false;
            }
            

            // 扣道具
            ItemMaps bagContainer = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);
            if (bagContainer == null) {
                logger.error("角色id " + roleid + "c重铸装备" + "\t背包错误");
                return false;
            }
            int needItemNum = itemdata.needItemCount;
            int usedNum = bagContainer.removeItemById((int)itemid, needItemNum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shenshoucost, (int)itemid,
                        "重铸装备");
            if (usedNum != needItemNum) {
                return false;
            }
            // 扣钱
            int confWeaponChangeCostMoney = itemdata.needGoldCoin;
            long ret = bag.subGold(-confWeaponChangeCostMoney, "重铸装备消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
            if (ret != -confWeaponChangeCostMoney) {
                return false;
            }

            // 删除原来的装备
            int removenum = bag.removeItemWithKey((int)srcweaponkey, 1,fire.log.enums.YYLoggerTuJingEnum.tujing_Value_dazao, 0,Commontext.REASON_STRING);
            if(removenum != 1)
            {
                return false;
            }

            // 增加新的装备

            ItemShuXing iAttr = fire.pb.item.Module.getInstance().getItemManager().getAttr(itemID);
            if (iAttr == null) {
                fire.pb.item.Module.logger.error("角色:" + roleid + "重铸物品的id:" + itemID+ "找不到属性!");
                return true;
            }
                    
            if (BagUtil.addItem(roleid, itemID, 1, "重铸物品", YYLoggerTuJingEnum.tujing_Value_daozaoget, itemID)	!= 1){
                MessageMgr.psendMsgNotifyWhileRollback(roleid, 142338, null);
                return false;
            }
            SChongzhuWeapon sendResult = new SChongzhuWeapon();
            psendWhileCommit(roleid, sendResult);
            // 更新玩家综合实力排行榜
            mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(this.roleid));
            return true;
        }
        else if(oldWeaponIB instanceof PetEquipItem)
        {
            logger.error("------------------------------宠物装备重铸");
            Map<Integer, PetEquipItemShuXing> equipItemAttrConfig = ConfigManager.getInstance().getConf(PetEquipItemShuXing.class);
            // 拿到背包的锁
            if (fire.pb.buff.Module.existState(roleid,fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER))
                return false;
            if (oldWeaponIB == null || !(oldWeaponIB instanceof PetEquipItem)) {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("宠物重铸功能旧武器错误!!!----"+itemid+"------------"+srcweaponkey);
                return false;
            }
            int itemID = oldWeaponIB.getItemId();
            PetEquipItem oldWeapon = ((PetEquipItem) oldWeaponIB);
                    
            PetEquipItemShuXing itemdata = equipItemAttrConfig.get(itemID);
            if(itemdata == null)
            {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("宠物重铸功能没有找到该装备数据!!!");
                return false;
            }
            if(itemdata.ncanChongzhu == 0)
            {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("该宠物装备不能重铸!!!");
                return false;
            }
            // 是否拍卖中
            if ((oldWeaponIB.getFlags() & fire.pb.Item.ONSTALL) != 0) {
                logger.error("拍卖的宠物武器无法使用重铸功能");
                return false;
            }
            

            // 扣道具
            ItemMaps bagContainer = fire.pb.item.Module.getInstance().getItemMaps(roleid, BagTypes.BAG, false);
            if (bagContainer == null) {
                logger.error("角色id " + roleid + "c重铸宠物装备" + "\t背包错误");
                return false;
            }
            int needItemNum = itemdata.needItemCount;
            int usedNum = bagContainer.removeItemById((int)itemid, needItemNum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shenshoucost, (int)itemid,
                        "重铸宠物装备");
            if (usedNum != needItemNum) {
                return false;
            }
            // 扣钱
            int confWeaponChangeCostMoney = itemdata.needGoldCoin;
            long ret = bag.subGold(-confWeaponChangeCostMoney, "重铸宠物装备消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
            if (ret != -confWeaponChangeCostMoney) {
                return false;
            }

            // 删除原来的装备
            int removenum = bag.removeItemWithKey((int)srcweaponkey, 1,fire.log.enums.YYLoggerTuJingEnum.tujing_Value_dazao, 0,Commontext.REASON_STRING);
            if(removenum != 1)
            {
                return false;
            }

            // 增加新的装备

            ItemShuXing iAttr = fire.pb.item.Module.getInstance().getItemManager().getAttr(itemID);
            if (iAttr == null) {
                fire.pb.item.Module.logger.error("角色:" + roleid + "重铸宠物物品的id:" + itemID+ "找不到属性!");
                return true;
            }
                    
            if (BagUtil.addItem(roleid, itemID, 1, "重铸宠物物品", YYLoggerTuJingEnum.tujing_Value_daozaoget, itemID)	!= 1){
                MessageMgr.psendMsgNotifyWhileRollback(roleid, 142338, null);
                return false;
            }
            SChongzhuWeapon sendResult = new SChongzhuWeapon();
            psendWhileCommit(roleid, sendResult);
            // 更新玩家综合实力排行榜
            mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(this.roleid));
            return true;
        }
        return false;
    }
}
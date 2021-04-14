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
import fire.pb.item.SEquipUpgradeConfig;
import fire.pb.ranklist.proc.PRoleZongheRankProc;
import fire.pb.shop.utils.MarketUtils;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;
import mkdb.Procedure;
import fire.pb.product.Commontext;
import fire.pb.util.BagUtil;

public class PEquipUpgrade extends Procedure {
	public int srcweaponkey; 
    public long roleid;
    private static Logger logger = Logger.getLogger("ITEM");
    public static final Map<Integer, SEquipUpgradeConfig> upgradeMap = ConfigManager.getInstance().getConf(SEquipUpgradeConfig.class);
    public PEquipUpgrade(final long roleid, final int srcweaponkey)
    {
        this.srcweaponkey = srcweaponkey;
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
            logger.error("装备升阶旧装备错误!!!----------------"+srcweaponkey);
			return false;
        }
        if(oldWeaponIB instanceof EquipItem)
        {
            logger.error("------------------------------装备升阶");
            Map<Integer, EquipItemShuXing> equipItemAttrConfig = ConfigManager.getInstance().getConf(EquipItemShuXing.class);
            if (fire.pb.buff.Module.existState(roleid,fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER))
                return false;
            if (oldWeaponIB == null || !(oldWeaponIB instanceof EquipItem)) {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                return false;
            }
            int itemID = oldWeaponIB.getItemId();
            EquipItem oldWeapon = ((EquipItem) oldWeaponIB);
                    
            EquipItemShuXing itemdata = equipItemAttrConfig.get(itemID);
            if(itemdata == null)
            {
                MessageMgr.psendMsgNotify(roleid, 150163, null);
                logger.error("升阶功能没有找到该装备数据!!!");
                return false;
            }
            // 是否拍卖中
            if ((oldWeaponIB.getFlags() & fire.pb.Item.ONSTALL) != 0) {
                logger.error("拍卖的武器无法使用升阶功能");
                return false;
            }


            if(!upgradeMap.containsKey(itemID))
            {
                logger.error("未找到对应升阶数据");
                return false;
            }
            
            SEquipUpgradeConfig conf = upgradeMap.get(itemID);
            // 扣钱
            int confWeaponChangeCostMoney = conf.needCold;
            long ret = bag.subGold(-confWeaponChangeCostMoney, "升阶装备消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
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
            int newItemID = conf.newEquipID;
            ItemShuXing iAttr = fire.pb.item.Module.getInstance().getItemManager().getAttr(newItemID);
            if (iAttr == null) {
                fire.pb.item.Module.logger.error("角色:" + roleid + "升阶物品的id:" + newItemID+ "找不到属性!");
                return true;
            }
                    
            if (BagUtil.addItem(roleid, newItemID, 1, "升阶物品", YYLoggerTuJingEnum.tujing_Value_daozaoget, newItemID)	!= 1){
                MessageMgr.psendMsgNotifyWhileRollback(roleid, 142338, null);
                return false;
            }
            SEquipUpgrade sendResult = new SEquipUpgrade();
            psendWhileCommit(roleid, sendResult);
            // 更新玩家综合实力排行榜
            mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(this.roleid));
            return true;
        }
        return false;
    }
}
package fire.pb.pet;

import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;

import fire.log.LogManager;
import fire.msp.move.GRoleEquipChange;

import fire.msp.role.GChangeEquipEffect;
import fire.pb.GsClient;
import fire.pb.course.CourseType;
import fire.pb.item.equip.WeaponItem;
import fire.pb.item.equip.diamond.EquipDiamondMgr;
import fire.pb.skill.SkillRole;
import fire.pb.talk.MessageMgr;
import fire.pb.pet.PetColumnTypes;
import fire.pb.attr.SRefreshPetData;
import mkdb.Procedure;
import org.apache.log4j.Logger;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import fire.pb.main.ConfigManager;
import fire.pb.item.BagTypes;
import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.pet.SHuanhuaTbl;
import fire.pb.item.ItemMaps;

public class PPetPutOnHuanHua extends Procedure
{
    public static final Logger logger = Logger.getLogger("SYSTEM");
	private final long roleId;
    private final int petKey;
    private final int huanhuaid;
    public static final Map<Integer, SHuanhuaTbl> PetHuanHuaTab = ConfigManager.getInstance().getConf(SHuanhuaTbl.class);
	public PPetPutOnHuanHua(long roleId,int huanhuaid,int petKey) {
		this.roleId = roleId;
        this.petKey = petKey;
        this.huanhuaid = huanhuaid;
    }
    
    @Override
	protected boolean process() throws Exception {
        logger.error("------宠物幻化外形-----------------11111");
        PetColumn petCol = new PetColumn(roleId, PetColumnTypes.PET, false);
		Pet pet = petCol.getPet(petKey);
		if (null == pet)
			return false;

		if(pet.isLocked() != -1) {
			MessageMgr.psendMsgNotify(roleId, Pet.PET_LOCK_ERROR_MSG, null);
			return true;
        }

        SHuanhuaTbl tabl = PetHuanHuaTab.get(huanhuaid);

        if( tabl == null)
        {
            logger.error("------宠物幻化外形-----------------没有找到对应表格数据");
            return false;
        }

        fire.pb.item.Pack bag = new fire.pb.item.Pack(roleId, false);
        // 扣道具
		ItemMaps bagContainer = fire.pb.item.Module.getInstance().getItemMaps(roleId, BagTypes.BAG, false);
		if (bagContainer == null) {
			logger.error("角色id " + roleId + "宠物幻化外形" + "\t背包错误");
			return false;
        }

        int needItemNum = tabl.freeItemCount;
        int needItemID = tabl.freeItemType;
		int usedNum = bagContainer.removeItemById(needItemID, needItemNum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shenshoucost, needItemID,
					"宠物幻化外形");
		if (usedNum != needItemNum) {
			logger.error("角色id " + roleId + "宠物幻化外形" + "扣除道具失败");
			return false;
		}
        
        // 扣钱
        int confCostType = tabl.freeCurrencyType;
        int confCostMoney = tabl.freeCurrencyCount;
        
        // 扣除银币
        if(confCostType == 1)
        {
            long ret = bag.subMoney(-confCostMoney, "宠物幻化外形消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
            if (ret != -confCostMoney) {
                return false;
            }
        }
        else if(confCostType == 2)
        {
            long ret = bag.subGold(-confCostMoney, "宠物幻化外形消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
            if (ret != -confCostMoney) {
                return false;
            }
        }
		
        logger.error("------宠物幻化外形-----------------"+pet.getPetInfo().getShapeID()+"--------------------"+huanhuaid);
        pet.getPetInfo().setShapeID(huanhuaid);

        SPetChangeHuanhua send = new SPetChangeHuanhua();
        send.petkey = petKey;
        send.huanhuaid = huanhuaid;
        mkdb.Procedure.psendWhileCommit(roleId, send);
        return true;
    }
}
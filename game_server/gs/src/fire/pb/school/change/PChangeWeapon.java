
package fire.pb.school.change;

import mkdb.Procedure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

import com.locojoy.base.Octets;
import fire.pb.main.ConfigManager;
import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.RoleConfigManager;
import fire.pb.item.BagTypes;
import fire.pb.item.EquipItem;
import fire.pb.item.EquipItemShuXing;
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
import fire.pb.item.SXilianEffect;
import fire.pb.ranklist.proc.PRoleZongheRankProc;
import fire.pb.shop.utils.MarketUtils;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;

/**
 * 转职转武器
 * author yebin @ 2016年8月16日
 */
public class PChangeWeapon extends Procedure {
	private static Logger logger = Logger.getLogger("ITEM");
	public static final Map<Integer, SXilianEffect> XILIANEFFECT_CFGS = ConfigManager.getInstance().getConf(SXilianEffect.class);
	private final long roleId;
	private final int equipKey;
	private final int dianhuashiTypeId;

	public PChangeWeapon(long roleId, int equipKey, int dianhuashiTypeId) {

		super();
		this.roleId = roleId;
		this.equipKey = equipKey;
		this.dianhuashiTypeId = dianhuashiTypeId;
	}

	@Override
	protected boolean process() throws Exception {
		xbean.Properties prop = xtable.Properties.get(roleId);
		if (null == prop) {
			return false;
		}

		// 战斗状态下不能使用该功能
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
			MessageMgr.psendMsgNotify(roleId, 150163, null);
			logger.error("战斗状态下无法使用装备点化功能");
			return false;
		}

		// 点化石是否存在
		ItemShuXing newEquipAttr = fire.pb.item.Module.getInstance().getItemManager().getAttr(dianhuashiTypeId);
		if (newEquipAttr == null) {
			logger.error("点化石不存在");
			return false;
		}

		// 拿到背包的锁
		fire.pb.item.Pack bag = new fire.pb.item.Pack(roleId, false);
		ItemBase oldWeaponIB = bag.getItem(equipKey);

		if (oldWeaponIB == null || !(oldWeaponIB instanceof EquipItem)) {
			MessageMgr.psendMsgNotify(roleId, 150163, null);
			logger.error("点化功能旧武器错误!!!");
			return false;
		}

		EquipItem oldWeapon = ((EquipItem) oldWeaponIB);
				
		// 是否拍卖中
		if ((oldWeaponIB.getFlags() & fire.pb.Item.ONSTALL) != 0) {
			logger.error("拍卖的武器无法使用点化功能");
			return false;
		}
		
		// 随机增加属性
		// 处理基础属性
		EquipItemShuXing attr = oldWeapon.getItemAttr();
		int BaseEffectId = attr.getBaseAttrId();
		// 从ItemMakeUtil.effectConfigs 中获取基础装备的属性
		ZhuangBeiShuXing equipAttrCnf = ItemMakeUtil.effectConfigs
				.get(BaseEffectId);
		if (equipAttrCnf == null) {
			return false;
		}
		// 扣道具
		ItemMaps bagContainer = fire.pb.item.Module.getInstance().getItemMaps(roleId, BagTypes.BAG, false);
		if (bagContainer == null) {
			logger.error("角色id " + roleId + "点化装备" + "\t背包错误");
			return false;
		}
		int needItemNum = 1;
		int usedNum = bagContainer.removeItemById(dianhuashiTypeId, needItemNum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shenshoucost, dianhuashiTypeId,
					"点化装备");
		if (usedNum != needItemNum) {
			return false;
		}
		// 扣钱
		int confWeaponChangeCostMoney = Integer.parseInt(RoleConfigManager.getRoleCommonConfig(473).getValue());
		long ret = bag.subGold(-confWeaponChangeCostMoney, "点化装备消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
		if (ret != -confWeaponChangeCostMoney) {
			return false;
		}
		Map<Integer, Integer> baseAttrs = oldWeapon.getEquipAttr().getAttr();
		Map<Integer, Integer> baseAddAttrs = new HashMap<Integer, Integer>();
		Map<Integer, Integer> plusAddAttrs = new HashMap<Integer, Integer>();
		Map<Integer, Integer> AddAttrs = oldWeapon.getEquipAttr().getAddattr();
		for (Integer key: baseAttrs.keySet()) {
			int id = key / 10;
			int value = 0;
			int randomval = 0;
			for (SXilianEffect sequipIteminfo : XILIANEFFECT_CFGS.values()) 
			{
				if(sequipIteminfo.id == id)
				{
					randomval = Misc.getRandomBetween(sequipIteminfo.attrInitvalue,sequipIteminfo.attrAddvalue);
					break;
				}
			}
			if(baseAttrs.containsKey(key) && baseAttrs.get(key) != 0)
			{
				value = baseAttrs.get(key) + randomval;
			}
			baseAddAttrs.put(key,value);
		}
		for (Integer key: AddAttrs.keySet()) {
			int id = key / 10;
			int value = 0;
			int randomval = 0;
			for (SXilianEffect sequipIteminfo : XILIANEFFECT_CFGS.values()) 
			{  
				if(sequipIteminfo.id == id)
				{
					randomval = Misc.getRandomBetween(sequipIteminfo.attrInitvalue,sequipIteminfo.attrAddvalue);
					break;
				}
			}
			if(AddAttrs.containsKey(key) && AddAttrs.get(key) != 0)
			{
				value = AddAttrs.get(key) + randomval;
			}
			plusAddAttrs.put(key,value);
		}
		oldWeapon.SetBaseAttr(baseAddAttrs);
		oldWeapon.SetAddAttr(plusAddAttrs);
		// 设置冷却时间
		//nt coolDownCostTime = Integer.parseInt(RoleConfigManager.getRoleCommonConfig(432).getValue());
		//long targetTimeMillis = System.currentTimeMillis() + coolDownCostTime * MarketUtils.ONE_DAY;
		//oldWeapon.getDataItem().setMarkettime(targetTimeMillis);
		
		// 是否珍品检测
		int score = fire.pb.item.Module.getInstance().getEquipScore(oldWeapon);
		oldWeapon.getEquipAttr().setEquipscore(score);
		if (score >= oldWeapon.getItemAttr().getTreasureScore()) {
			oldWeapon.getEquipAttr().setTreasure(1);
		} else {
			oldWeapon.getEquipAttr().setTreasure(0);
		}

		// 发消息
		SAddItem sAddItem = new SAddItem();
		sAddItem.packid = bag.getPackid();
		sAddItem.data.add(ItemMaps.transItemData2SendData(oldWeapon.getDataItem(), equipKey, 0));
		psendWhileCommit(roleId, sAddItem);

		Octets tips = oldWeapon.getTips();
		SGetItemTips send = new SGetItemTips(BagTypes.BAG, oldWeapon.getKey(), tips);
		psendWhileCommit(roleId, send);

		// 通知客户端点化武器成功
		SChangeWeapon sendResult = new SChangeWeapon();
		psendWhileCommit(roleId, sendResult);

		// 更新玩家综合实力排行榜
		mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(this.roleId));

		return true;
	}
}

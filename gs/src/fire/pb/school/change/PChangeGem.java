
package fire.pb.school.change;

import mkdb.Procedure;
import fire.pb.main.ConfigManager;
import org.apache.log4j.Logger;
import fire.log.enums.YYLoggerTuJingEnum;
import com.locojoy.base.Octets;
import fire.pb.RoleConfigManager;
import fire.pb.item.ItemBase;
import fire.pb.item.ItemMaps;
import fire.pb.item.ItemShuXing;
import fire.pb.item.gemItemShuXing;
import fire.pb.item.EquipItem;
import fire.pb.item.BagTypes;
import fire.pb.item.SAddItem;
import fire.pb.item.SGetItemTips;
import fire.pb.shop.srv.floating.FloatingOneManager;
import fire.pb.talk.MessageMgr;
import fire.pb.item.STaozhuangEffect;
import fire.pb.item.STaozhuangEffectConfig;
import fire.pb.item.EquipItemShuXing;
import java.util.Map;
import java.util.Random;
import fire.pb.skill.SceneSkillRole;

public class PChangeGem extends Procedure {
	private static Logger logger = Logger.getLogger("ITEM");
	private final long roleId;
	private final int taozhuangKey;
	private final int xilianshiId;
	public static final Map<Integer, STaozhuangEffect> DIANHUASHIEFFECT_CFGS = ConfigManager.getInstance().getConf(STaozhuangEffect.class);
	public static final Map<Integer, STaozhuangEffectConfig> DIANHUANSHICFG_CFGS = ConfigManager.getInstance().getConf(STaozhuangEffectConfig.class);

	public PChangeGem(long roleId, int taozhuangKey, int xilianshiId) {
		super();
		this.roleId = roleId;
		this.taozhuangKey = taozhuangKey;
		this.xilianshiId = xilianshiId;
	}

	@Override
	protected boolean process() throws Exception {
		// 战斗状态下不能使用该功能
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
			MessageMgr.psendMsgNotify(roleId, 150163, null);
			return false;
		}

		// 洗练石是否存在
		ItemShuXing newEquipAttr = fire.pb.item.Module.getInstance().getItemManager().getAttr(xilianshiId);
		if (newEquipAttr == null) {
			logger.error("洗练石不存在");
			return false;
		}

		// 拿到背包的锁
		fire.pb.item.Pack bag = new fire.pb.item.Pack(roleId, false);
		ItemBase oldWeaponIB = bag.getItem(taozhuangKey);

		if (oldWeaponIB == null || !(oldWeaponIB instanceof EquipItem)) {
			MessageMgr.psendMsgNotify(roleId, 150163, null);
			logger.error("点化功能套装错误!!!");
			return false;
		}

		EquipItem oldWeapon = ((EquipItem) oldWeaponIB);		
		// 是否拍卖中
		if ((oldWeaponIB.getFlags() & fire.pb.Item.ONSTALL) != 0) {
			logger.error("拍卖的套装无法使用点化功能");
			return false;
		}
		logger.error("-------------套装点化------"+oldWeapon.getEquipAttr()+"------");
		
		// 扣道具
		ItemMaps bagContainer = fire.pb.item.Module.getInstance().getItemMaps(roleId, BagTypes.BAG, false);
		if (bagContainer == null) {
			logger.error("角色id " + roleId + "点化套装" + "\t背包错误");
			return false;
		}
		int needItemNum = 1;
		int usedNum = bagContainer.removeItemById(xilianshiId, needItemNum, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shenshoucost, xilianshiId,
					"点化套装");
		if (usedNum != needItemNum) {
			logger.error("角色id " + roleId + "点化套装" + "扣除洗练石失败");
			return false;
		}
		// 扣钱
		int confWeaponChangeCostMoney = Integer.parseInt(RoleConfigManager.getRoleCommonConfig(473).getValue());
		long ret = bag.subGold(-confWeaponChangeCostMoney, "点化套装消耗", YYLoggerTuJingEnum.tujing_Value_changeschoolweaponcost, 0);
		if (ret != -confWeaponChangeCostMoney) {
			return false;
		}

		// 设置套装效果
		xbean.Equip equipAttr = oldWeapon.getEquipAttr();
		int suitid = equipAttr.getSuitID();
		Integer[] keys = DIANHUASHIEFFECT_CFGS.keySet().toArray(new Integer[0]);
		Random random = new Random();
		Integer randomKey = keys[random.nextInt(keys.length)];
		STaozhuangEffect effect = DIANHUASHIEFFECT_CFGS.get(randomKey);
		suitid = effect.id;
		equipAttr.setSuitID(suitid);
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
		sAddItem.data.add(ItemMaps.transItemData2SendData(oldWeapon.getDataItem(), taozhuangKey, 0));
		psendWhileCommit(roleId, sAddItem);

		Octets tips = oldWeapon.getTips();
		SGetItemTips send = new SGetItemTips(BagTypes.BAG, oldWeapon.getKey(), tips);
		psendWhileCommit(roleId, send);

		// 通知客户端点化套装成功
		SChangeGem sendResult = new SChangeGem();
		psendWhileCommit(roleId, sendResult);
		return true;
	}


}

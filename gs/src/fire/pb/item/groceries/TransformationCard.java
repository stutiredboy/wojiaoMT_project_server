package fire.pb.item.groceries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import xbean.Item;
import fire.pb.PropRole;
import fire.pb.WorldTime;
import fire.pb.item.GroceryItem;
import fire.pb.item.ItemMgr;
import fire.pb.item.Commontext.UseResult;
import fire.pb.skill.SkillRole;

public class TransformationCard extends GroceryItem {

	public TransformationCard(ItemMgr im, int itemid) {
		super(im, itemid);
	}
	
	public TransformationCard(ItemMgr im, Item item) {

		super(im, item);
	}

	@Override
	protected UseResult appendToRole(final long roleId, final int usenum) {
		if (usenum != 1)
			return UseResult.FAIL;
		Map<Integer, fire.pb.item.STransformationConfig> sTransConfigs = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.item.STransformationConfig.class);
		Map<Integer, fire.pb.item.STransformationEffectConfig> sTransEffectConfigs = fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.item.STransformationEffectConfig.class);
		
		fire.pb.item.STransformationConfig sTransConfig = sTransConfigs.get(getItemId());
		if (sTransConfig == null)
			return UseResult.FAIL;
		fire.pb.item.STransformationEffectConfig sTransEffectConfig = sTransEffectConfigs.get(sTransConfig.effectid);
		if (sTransEffectConfig == null)
			return UseResult.FAIL;

		final xbean.TransfromInfo ti = xtable.Transfromroles.select(roleId);
		if (ti != null) {
			WorldTime now = WorldTime.getInstance();
			if (now.getTimeInMillis() < ti.getValiddate() && ti.getTransformid() > 0) {
				return UseResult.FAIL;
			}
		}
		
		fire.pb.mission.UtilHelper.itemTransform(roleId, sTransEffectConfig.shapeid, sTransConfig.time);
		xbean.TransfromByItemData transdata = xtable.Transformbyitem.get(roleId);
		if (transdata == null) {
			return UseResult.FAIL;
		}
		transdata.setTransformid(sTransEffectConfig.shapeid);
		transdata.setUseitemid(getItemId());
		
		List<String> paramLst = new ArrayList<String>();
		paramLst.add(sTransConfig.name);
		paramLst.add(String.valueOf(sTransConfig.time));
		fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleId, 145324, paramLst);
		

		// 属性加成
		fire.pb.effect.RoleImpl role = new fire.pb.effect.RoleImpl( roleid );
		if(role == null)
		{
			return UseResult.FAIL;
		}
		// 判断是否有速度加成
		if(sTransEffectConfig.getSpeed_value() != 0)
		{
			role.attachEffect(AttrType.SPEED,sTransConfig.getSpeed_value());
		}

		// 判断是否有气血上限加成
		if(sTransEffectConfig.getUplimithp_value() != 0)
		{
			role.attachEffect(AttrType.MAX_HP,sTransEffectConfig.getUplimithp_value());
		}

		// 判断是否有增加魔法值
		if(sTransEffectConfig.getCurmp_value() != 0)
		{
			role.attachEffect(AttrType.MAX_MP,sTransEffectConfig.getCurmp_value());
		}

		// 判断是否有增加物理伤害
		if(sTransEffectConfig.getPhyattack_value() != 0)
		{
			role.attachEffect(AttrType.ATTACK,sTransEffectConfig.getPhyattack_value());
		}

		// 判断是否有增加法术伤害
		if(sTransEffectConfig.getMagicattack_value() != 0)
		{
			role.attachEffect(AttrType.MAGIC_ATTACK,sTransEffectConfig.getMagicattack_value());
		}

		// 判断是否有增加物理防御
		if(sTransEffectConfig.getDefend_value() != 0)
		{
			role.attachEffect(AttrType.DEFEND,sTransEffectConfig.getDefend_value());
		}

		// 判断是否有增加法术防御
		if(sTransEffectConfig.getMagicdef_value() != 0)
		{
			role.attachEffect(AttrType.MAGIC_DEF,sTransEffectConfig.getMagicdef_value());
		}

		SAddPointAttrData sendAddPointData = new SAddPointAttrData();
		sendAddPointData.max_hp = role.getAttrById(AttrType.MAX_HP);
		sendAddPointData.max_mp = role.getAttrById(AttrType.MAX_MP);
		sendAddPointData.attack = role.getAttrById(AttrType.ATTACK);
		sendAddPointData.defend = role.getAttrById(AttrType.DEFEND);
		sendAddPointData.magic_attack = role.getAttrById(AttrType.MAGIC_ATTACK);
		sendAddPointData.magic_def = role.getAttrById(AttrType.MAGIC_DEF);
		sendAddPointData.speed = role.getAttrById(AttrType.SPEED);
		mkdb.Procedure.psendWhileCommit(roleid, sendAddPointData);
		
		return UseResult.SUCC;
	}
}

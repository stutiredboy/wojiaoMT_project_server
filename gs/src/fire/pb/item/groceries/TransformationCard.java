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
import fire.pb.attr.AttrType;
import fire.pb.attr.EffectType;
import mkdb.Procedure;

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
		long oldItemid = 0;
		xbean.TransfromByItemData transdata = xtable.Transformbyitem.get(roleId);
		if (transdata == null) {
			oldItemid = 0;
		}
		else
		{
			oldItemid = transdata.getUseitemid();
		}
		
		fire.pb.mission.UtilHelper.itemTransform(roleId, sTransEffectConfig.shapeid, sTransConfig.time,oldItemid);
		transdata = xtable.Transformbyitem.get(roleId);
		transdata.setTransformid(sTransEffectConfig.shapeid);
		transdata.setUseitemid(getItemId());
		
		List<String> paramLst = new ArrayList<String>();
		paramLst.add(sTransConfig.name);
		paramLst.add(String.valueOf(sTransConfig.time));
		fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleId, 145324, paramLst);
		
		if(oldItemid != getItemId())
		{

			// 属性加成
			fire.pb.effect.RoleImpl role = new fire.pb.effect.RoleImpl( roleId );
			if(role == null)
			{
				return UseResult.FAIL;
			}

			if(sTransEffectConfig.getBuffid() != 0)
			{
				fire.pb.buff.BuffAgent agent = new fire.pb.buff.BuffRoleImpl(roleId);
				agent.addCBuffWithSP(sTransEffectConfig.getBuffid());
			}
			if(oldItemid != 0)
			{
				fire.pb.item.STransformationConfig sTransConfig1 = sTransConfigs.get((int)oldItemid);
				fire.pb.item.STransformationEffectConfig sTransEffectConfig1 = sTransEffectConfigs.get(sTransConfig1.effectid);
				if(sTransEffectConfig1.getBuffid() != 0)
				{
					fire.pb.buff.BuffAgent agent = new fire.pb.buff.BuffRoleImpl(roleId);
					agent.removeCBuffWithSP(sTransEffectConfig1.getBuffid());
				}
			}
			// // 判断是否有速度加成
			// if(sTransEffectConfig.getSpeed_value() != 0)
			// {
			// 	role.attachEffect(EffectType.SPEED_ABL,sTransEffectConfig.getSpeed_value());
			// }

			// // 判断是否有气血上限加成
			// if(sTransEffectConfig.getUplimithp_value() != 0)
			// {
			// 	role.attachEffect(EffectType.MAX_HP_ABL,sTransEffectConfig.getUplimithp_value());
			// }

			// // 判断是否有增加魔法值
			// if(sTransEffectConfig.getCurmp_value() != 0)
			// {
			// 	role.attachEffect(EffectType.MAX_MP_ABL,sTransEffectConfig.getCurmp_value());
			// }

			// // 判断是否有增加物理伤害
			// if(sTransEffectConfig.getPhyattack_value() != 0)
			// {
			// 	role.attachEffect(EffectType.DAMAGE_ABL,sTransEffectConfig.getPhyattack_value());
			// }

			// // 判断是否有增加法术伤害
			// if(sTransEffectConfig.getMagicattack_value() != 0)
			// {
			// 	role.attachEffect(EffectType.MAGIC_ATTACK_ABL,sTransEffectConfig.getMagicattack_value());
			// }

			// // 判断是否有增加物理防御
			// if(sTransEffectConfig.getDefend_value() != 0)
			// {
			// 	role.attachEffect(EffectType.DEFEND_ABL,sTransEffectConfig.getDefend_value());
			// }

			// // 判断是否有增加法术防御
			// if(sTransEffectConfig.getMagicdef_value() != 0)
			// {
			// 	role.attachEffect(EffectType.MAGIC_DEF_ABL,sTransEffectConfig.getMagicdef_value());
			// }

			// if(oldItemid != 0)
			// {
			// 	fire.pb.item.STransformationConfig sTransConfig1 = sTransConfigs.get((int)oldItemid);
			// 	fire.pb.item.STransformationEffectConfig sTransEffectConfig1 = sTransEffectConfigs.get(sTransConfig1.effectid);
			// 	// 判断是否有速度加成
			// 	if(sTransEffectConfig1.getSpeed_value() != 0)
			// 	{
			// 		role.detachEffect(EffectType.SPEED_ABL,sTransEffectConfig1.getSpeed_value());
			// 	}

			// 	// 判断是否有气血上限加成
			// 	if(sTransEffectConfig1.getUplimithp_value() != 0)
			// 	{
			// 		role.detachEffect(EffectType.MAX_HP_ABL,sTransEffectConfig1.getUplimithp_value());
			// 	}

			// 	// 判断是否有增加魔法值
			// 	if(sTransEffectConfig1.getCurmp_value() != 0)
			// 	{		
			// 		role.detachEffect(EffectType.MAX_MP_ABL,sTransEffectConfig1.getCurmp_value());
			// 	}

			// 	// 判断是否有增加物理伤害
			// 	if(sTransEffectConfig1.getPhyattack_value() != 0)
			// 	{
			// 		role.detachEffect(EffectType.DAMAGE_ABL,sTransEffectConfig1.getPhyattack_value());
			// 	}

			// 	// 判断是否有增加法术伤害
			// 	if(sTransEffectConfig1.getMagicattack_value() != 0)
			// 	{
			// 		role.detachEffect(EffectType.MAGIC_ATTACK_ABL,sTransEffectConfig1.getMagicattack_value());
			// 	}

			// 	// 判断是否有增加物理防御
			// 	if(sTransEffectConfig1.getDefend_value() != 0)
			// 	{
			// 		role.detachEffect(EffectType.DEFEND_ABL,sTransEffectConfig1.getDefend_value());
			// 	}

			// 	// 判断是否有增加法术防御
			// 	if(sTransEffectConfig1.getMagicdef_value() != 0)
			// 	{	
			// 		role.detachEffect(EffectType.MAGIC_DEF_ABL,sTransEffectConfig1.getMagicdef_value());
			// 	}
			// }
			// java.util.Map<Integer,Float> res = role.updateAllFinalAttrs();
			// final fire.pb.attr.SRefreshRoleData send = new fire.pb.attr.SRefreshRoleData();
			// send.datas.putAll(res);
			// Procedure.psendWhileCommit(roleId, send);
		}
		
		
		return UseResult.SUCC;
	}
}

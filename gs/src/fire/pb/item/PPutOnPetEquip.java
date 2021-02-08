package fire.pb.item;

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
import fire.pb.pet.PetColumn;
import fire.pb.pet.Pet;
import fire.pb.pet.SRefreshPetInfo;

public class PPutOnPetEquip extends Procedure
{
	public static final Logger logger = Logger.getLogger("SYSTEM");
	private final long roleId;
	private final int bagkey;
	private final int position;
	private final int petKey;
	public PPutOnPetEquip( long roleId,int bagkey,int position, int petKey) {
		this.roleId = roleId;
		this.bagkey = bagkey;
		this.position = position;
		this.petKey = petKey;
	}
	@Override
	protected boolean process() throws Exception {
		final Pack bag = new Pack(roleId, false);
		final PetEquip equip = new PetEquip(roleId, false);
		ItemBase bi = bag.getItem(bagkey);
		if (bi == null) {
			return false;
		}
		if (((PetEquipItem)bi).getEndure() == 0) {
			MessageMgr.psendMsgNotify(roleId, 160319, null);
			return false;
		}
		final int pos = bi.getPosition();
		bi = bag.TransOut(bagkey, -1, "穿装备");
		if (!(bi instanceof PetEquipItem)) {
			return false;
		}
		PetColumn petCol = new PetColumn(roleId, 1, false);
		Pet pet = petCol.getPet(petKey);
		PetEquipItem.PetEquipError errorcode = canEquip(equip, (PetEquipItem)bi, position);
		//int tmpPos = 0;
		if (errorcode == PetEquipItem.PetEquipError.NO_ERROR) {
			ItemBase dstitem = equip.getItemByPos(position);
			ItemBase item = null;
			if (dstitem != null) {
				item = equip.TransOut(dstitem.getKey(), -1, "卸下装备");
				if (item == null)
				{
						return false;
				}

				if (!bag.TransIn(item, pos))
					return false;
				List<Effect> effects = new ArrayList<>();
				Map<Integer, Integer> attr = ((PetEquipItem)dstitem).getBaseAttr();
				for (Map.Entry<Integer, Integer> entry : attr.entrySet()) {
					Effect effect = new Effect(entry.getKey(), entry.getValue());
					effects.add(effect);
				}
				fire.pb.skill.SceneSkillRole srole = fire.pb.skill.SkillManager.getSceneSkillRole(roleId);
				java.util.Map<Integer, Float> changemap = srole.removePetEquipEffect(petKey, ((PetEquipItem)dstitem).getItemId(), effects);
				if (!changemap.isEmpty()) {
					SRefreshPetData petdata = new SRefreshPetData();
					petdata.columnid = PetColumnTypes.PET;
					petdata.petkey = petKey;
					petdata.datas = (HashMap<Integer, Float>) changemap;
					mkdb.Procedure.psendWhileCommit(roleId, petdata);
					// 运营日志
					//writeYYLogger(useNum);
					//return Commontext.UseResult.SUCC;
				}
				pet.removeEquipItem(dstitem.getItemId());
			}
			if (!equip.TransIn(bi, position))
				return false;
			if ((bi.getFlags() & (fire.pb.Item.ONSTALL & fire.pb.Item.ONCOFCSELL)) != 0)
				return false;
			logger.error("RECV PPutOnPetEquip--------123---------\t");
			freshEquipBuff(roleId, (PetEquipItem)bi, petKey);
			//更新玩家综合实力排行榜
			mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PRoleZongheRankProc(roleId));
			//更新历程信息
			fire.pb.course.CourseManager.achieveCourse(roleId, CourseType.EQUIP_SPECIAL_COURSE, bi.getItemId(), 0);
			Equip.checkEquipDiamondCourse(roleId);
			
			mkdb.Procedure.pexecuteWhileCommit(new PEnhancementTimeout(roleId));

			
			pet.addEquipItem(bi.getItemId());
			List<Integer> equipIDList = pet.getEquipList();
			logger.error("RECV PPutOnPetEquip--------SIZE--------"+ equipIDList.size());
			for(Integer id : equipIDList)
			{
				logger.error("RECV PPutOnPetEquip--------ID--------"+ id);
			}
			
			// 刷新宠物信息
			final SRefreshPetInfo refresh = new SRefreshPetInfo(pet.getProtocolPet());
			psendWhileCommit(roleId, refresh);

			return true;
		} else if (errorcode == PetEquipItem.PetEquipError.LEVEL_NOT_SUIT) {
			MessageMgr.psendMsgNotify(roleId, 100065, null);
			return false;
		} else if (errorcode == PetEquipItem.PetEquipError.SCHOOL_NOT_SUIT) {
			MessageMgr.psendMsgNotify(roleId, 174002, null);
			return false;
		}
		else {
			return false;
		}
	}
	
	public static void freshEquipBuff(final long roleId, PetEquipItem ei, int petKey) {
		PetEquip equip = new PetEquip(roleId, true);
		if (ei != null) {
			//获取装备最低的品质
			Integer nquality = Integer.MAX_VALUE;
			if (equip.size() == 6) {
				for (fire.pb.item.ItemBase item : equip) {
					if (item instanceof EquipItem) {
						if (item.getItemAttr().nquality < nquality)
							nquality = item.getItemAttr().nquality;
					}
				}
				
				fire.pb.course.CourseManager.achieveCourse(roleId, fire.pb.course.CourseType.ALL_PUT_ON_EQUIP, nquality, 0);
			}
			else {
				nquality = 0;
			}
			
			xbean.Properties pProp = xtable.Properties.get(roleId);
			pProp.setEquipeffect(nquality);
			
			GRoleEquipChange notifymap = new GRoleEquipChange();
			notifymap.roleid = roleId;
			notifymap.pos = ei.getPosition();
			notifymap.itemid = ei.getItemId();
			notifymap.ride = -1;
			notifymap.effect = nquality;
			
			if (ei instanceof PetEquipItem)
				notifymap.itemcolor = ((PetEquipItem)ei).getItemAttr().equipcolor;
			GsClient.pSendWhileCommit(notifymap);
			
			if (nquality > 0) {
				GChangeEquipEffect equipeffect = new GChangeEquipEffect();
				equipeffect.effect = nquality;
				equipeffect.roleid = roleId;
				GsClient.pSendWhileCommit(equipeffect);
			}
		}
		Long teamId = xtable.Roleid2teamid.get(roleId);
		if (teamId != null)
			mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure(){
				protected boolean process() throws Exception{
					final fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(roleId);
					if (team != null){
						team.updateTeamMemberComponents2Others(roleId);
					}
					return true;
				};
			});
		
		SAllEquipScore equipTotalScore = new SAllEquipScore();
		int totalScore = Module.getInstance().getEquipTotalScore(roleId);
		equipTotalScore.score = totalScore;
		mkdb.Procedure.psendWhileCommit(roleId, equipTotalScore);
		if (ei != null) {
			if (ei.getExtInfo().getEndure() > 0) {
				List<Effect> effects = new ArrayList<>();
				Map<Integer, Integer> attr = ei.getBaseAttr();
				for (Map.Entry<Integer, Integer> entry : attr.entrySet()) {
					Effect effect = new Effect(entry.getKey(), entry.getValue());
					effects.add(effect);
				}
				fire.pb.skill.SceneSkillRole srole = fire.pb.skill.SkillManager.getSceneSkillRole(roleId);
				java.util.Map<Integer, Float> changemap = srole.addPetEquipEffect(petKey, ei.getItemId(), effects);
				if (!changemap.isEmpty()) {
					SRefreshPetData petdata = new SRefreshPetData();
					petdata.columnid = PetColumnTypes.PET;
					petdata.petkey = petKey;
					petdata.datas = (HashMap<Integer, Float>) changemap;
					mkdb.Procedure.psendWhileCommit(roleId, petdata);
				}
			}
		}
	}
	
	private static PetEquipItem.PetEquipError canEquip(PetEquip equip, PetEquipItem item, int dstpos) {
		xbean.Properties prop = xtable.Properties.select(equip.roleId);
		int roleLevel = prop.getLevel();
		int sex = prop.getSex();
		int shape = prop.getShape();
		int school = prop.getSchool();
		PetEquipItem.PetEquipError ret = item.canEquipment(dstpos, roleLevel, sex, shape, school);
		return ret;
	}
}

package fire.pb.pet;

import fire.log.beans.OpPetSkiBean;
import fire.pb.buff.BuffAgent;
import fire.pb.item.Pack;
import fire.pb.item.pet.PetInternalItem;
import fire.pb.main.ConfigManager;
import fire.pb.skill.BuffUnit;
import fire.pb.skill.SkillPet;
import fire.pb.skill.SubSkillConfig;
import fire.pb.skill.fight.FightSkillConfig;
import fire.pb.talk.MessageMgr;
import fire.pb.util.Misc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mkdb.Procedure;
import org.apache.log4j.Logger;
import xbean.PetInfo;
import xbean.PetSkill;

public class PPetLearnInternalByBook extends Procedure
{
  private long roleId;
  private int petKey;
  private int bookKey;
  public static final int RESULT_INVALID = -3;
  public static final int RESULT_NULL = -2;
  public static final int RESULT_ADD = -1;
  public static final int RESULT_REPLACE = 0;
  public static final int RESULT_LEVELLIMIT = -4;
  
  public PPetLearnInternalByBook(long roleId, int petKey, int bookKey)
  {
    this.roleId = roleId;
    this.petKey = petKey;
    this.bookKey = bookKey;
  }
  

  public boolean process()
  {
    if (Helper.isPetInBattle(this.roleId, this.petKey)) {
      return false;
    }
    PetColumn petCol = new PetColumn(this.roleId, 1, false);
    Pet pet = petCol.getPet(this.petKey);
    if (pet == null) {
      Module.logger.error("[PPetLearnInternalByBook] petKey=" + this.petKey + " non-existent.");
      return true;
    }
    
    PetInfo petInfo = pet.getPetInfo();
    if (pet.isLocked() != -1L) {
      MessageMgr.psendMsgNotify(this.roleId, Pet.PET_LOCK_ERROR_MSG, null);
      return true;
    }
    
    Pack bag = (Pack)fire.pb.item.Module.getInstance().getItemMaps(this.roleId, 1, false);
    fire.pb.item.ItemBase item = bag.getItem(this.bookKey);
    if (item == null) {
        Module.logger.error("[PPetLearnInternalByBook]  item == null.");
        return false;
    }
    if (!(item instanceof PetInternalItem)) {
      Module.logger.error("[PPetLearnInternalByBook] use item type != PetInternalItem.");
      return true;
    }
    

    PetInternalItem skillItem = (PetInternalItem)item;
    int skillId = ((fire.pb.item.PetItemShuXing)skillItem.getItemAttr()).getSkillid();
    
    if (PetManager.getInstance().getSkillUpGrade(skillId) == null) {
        Module.logger.error("[PPetLearnInternalByBook] 升级的技能为空");
      return false;
    }
    

    if (pet.hasAnyInternal(skillId)) {
      MessageMgr.psendMsgNotify(this.roleId, 141700, null);
      return true;
    }
    
    int oldSkillId = -4;
    
    int learnResult = getLearnResult(pet);
    if (learnResult == -2)
    {

      return true; }
    if (learnResult == -1)
    {
      if (!pet.addInternal(skillId, -1L, (int)skillItem.getDataItem().getExtid(), 1))
        return false;
    } 
    else 
    {
        if (learnResult == -4)
        {
            MessageMgr.psendMsgNotify(this.roleId, 191160, null);
            return false;
        }
        if (learnResult >= 0)
        {
            oldSkillId = pet.insertInternal(learnResult, skillId, -1L, 1);
            if (oldSkillId < 0) {
                return false;
            }
      }
      else {
        return true;
      }
    }
    if (pet.getBattleInternalIds().size() > pet.petInternalsGrid()) {
      return false;
    }
    
    if (bag.removeItemWithKey(this.bookKey, 1, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_peiyang, skillItem.getItemId(), "PetLearnSkill") != 1) {
      return false;
    }
    
    BuffAgent buffAgent = new fire.pb.buff.BuffPetImpl(this.roleId, this.petKey);
    
    if (oldSkillId > 0)
    {
      FightSkillConfig sconf = fire.pb.skill.Module.getInstance().getFightSkillConfig(oldSkillId);
      if ((sconf != null) && (!sconf.isActiveSkill()) && (sconf.getType() == 10) && (sconf.getSubSkills()[0] != null) && 
        (sconf.getSubSkills()[0].getBuffUnits()[0] != null)) { SubSkillConfig[] arrayOfSubSkillConfig;
        int j = (arrayOfSubSkillConfig = sconf.getSubSkills()).length; for (int i = 0; i < j; i++) { SubSkillConfig subSkill = arrayOfSubSkillConfig[i];
          BuffUnit[] arrayOfBuffUnit; int m = (arrayOfBuffUnit = subSkill.getBuffUnits()).length; for (int k = 0; k < m; k++) { BuffUnit buffArg = arrayOfBuffUnit[k];
            if ((buffArg != null) && (buffArg.buffIndex > 0)) {
              buffAgent.removeCBuffWithSP(buffArg.buffIndex);
            }
          }
        }
      }
    }
    SkillPet spet = new SkillPet(petInfo, this.roleId);
    fire.pb.skill.Result result = spet.addSkillBuffWhileOnline(null);
    buffAgent.psendSBuffChangeResult(result);
    spet.updateSkillBuffWhileOut(null);
    

    SRefreshPetInternal send = new SRefreshPetInternal();
    send.petkey = this.petKey;
    pet.fillSRefreshPetInternal(send);
    Procedure.psendWhileCommit(this.roleId, send);
    pet.updatePetScoreWhileChange();
    fire.pb.course.CourseManager.checkAchieveCourse(this.roleId, 31, pet.getPetInfo().getPetscore());
    
    fire.pb.course.CourseManager.achieveUpdate(this.roleId, 36);
    
    onLog(this.roleId, pet, skillId);
    return true;
  }
  public int getLearnResult(Pet pet)
  {
    List<PetSkill> internals = pet.getBattleInternals();
    int num = internals.size();
    java.util.Map<Integer, PetLearnInternalCountConfig> confs = ConfigManager.getInstance().getConf(PetLearnInternalCountConfig.class);
    if (confs != null) {
      PetLearnInternalCountConfig conf = (PetLearnInternalCountConfig)confs.get(Integer.valueOf(num));
      
      boolean isReplace = true;
      if (conf.getRate() > 0.0D)
      {

        int r = Misc.getRandomBetween(0, 9999);
        int v = (int)(conf.getRate() * 10000.0D);
        if (v >= r) {
          isReplace = false;
        }
      }
      

      if ((num < pet.getInternalMaxNum()) && 
        (!isReplace)) {
            Module.logger.error("[PPetLearnInternalByBook] 没有被替换");
            return -1;
      }
      


      List<Integer> replaceIndexList = new ArrayList();
      for (int i = 0; i < num; i++)
      {
        replaceIndexList.add(Integer.valueOf(i));
      }
      

      if (replaceIndexList.size() > 0) {
        int index = Misc.getRandomBetween(0, replaceIndexList.size() - 1);
        return ((Integer)replaceIndexList.get(index)).intValue();
      }
      Module.logger.error("[PPetLearnInternalByBook] 学习成功");
      return -2;
    }
    return -3;
  }
  



  public void onLog(long roleId, Pet pet, int SkiId)
  {
    if (Module.logger.isInfoEnabled()) {
      List<Integer> skillIds = new ArrayList();
      List<Integer> skillTypes = new ArrayList();
      List<Integer> skillCertifys = new ArrayList();
      for (PetSkill skill : pet.getPetInfo().getInternals()) {
        skillIds.add(Integer.valueOf(skill.getSkillid()));
        skillTypes.add(Integer.valueOf(skill.getSkilltype()));
        skillCertifys.add(Integer.valueOf(skill.getCertification()));
      }
      Module.logger.info("[PPetLearnInternalByBook] roleId:" + roleId + 
        " petKey:" + pet.getPetInfo().getKey() + 
        " uniqId:" + pet.getPetInfo().getUniqid() + 
        " petId:" + pet.getPetInfo().getId() + 
        " skillIds:" + Arrays.toString(skillIds.toArray()) + 
        " skillTypes:" + Arrays.toString(skillTypes.toArray()) + 
        " skillCertifys:" + Arrays.toString(skillCertifys.toArray()));
    }
    

    writeYYLogger(roleId, pet, SkiId);
  }
  





  private void writeYYLogger(long roleId, Pet pet, int SkiId)
  {
    if (pet == null) { return;
    }
    int isTrea = pet.getPetInfo().getPetscore() > pet.getPetAttr().getTreasureScore() ? 1 : 0;
    OpPetSkiBean opPetSkiBean = new OpPetSkiBean(pet.getPetInfo().getId(), 
      isTrea, pet.getPetInfo().getUniqid(), SkiId, OpPetSkiBean.Op_PetSkiBean_Operate_Add);
    
    fire.log.YYLogger.petSkiLog(roleId, opPetSkiBean);
  }
}
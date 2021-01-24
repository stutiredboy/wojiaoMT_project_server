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

public class PPetPutOnHuanHua extends Procedure
{
    public static final Logger logger = Logger.getLogger("SYSTEM");
	private final long roleId;
    private final int petKey;
    private final int huanhuaid;
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
        logger.error("------宠物幻化外形-----------------"+pet.getPetInfo().getShapeID()+"--------------------"+huanhuaid);
        pet.getPetInfo().setShapeID(huanhuaid);

        SPetChangeHuanhua send = new SPetChangeHuanhua();
        send.petkey = petKey;
        send.huanhuaid = huanhuaid;
        mkdb.Procedure.psendWhileCommit(roleId, send);
        return true;
    }
}
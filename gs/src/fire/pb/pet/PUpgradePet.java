package fire.pb.pet;
import org.apache.log4j.Logger;
public class PUpgradePet extends mkdb.Procedure
{
    private  long roleId;
	private  int petKey;
    private  int itemkey;
    public static final Logger logger = Logger.getLogger("SYSTEM");
    public PUpgradePet(final long roleId, final int petKey,final int itemkey) {
		this.roleId = roleId;
		this.petKey = petKey;
        this.itemkey = itemkey;
	}
    @Override
	public boolean process() {
        if (Helper.isPetInBattle(roleId, petKey))
			return false; // 战斗中的参战宠不能执行当前操作
        return true;
    }

}

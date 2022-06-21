package fire.pb.game;
import org.apache.log4j.Logger;
import fire.pb.PropRole;
import mkdb.Procedure;
import fire.pb.talk.MessageMgr;
import fire.pb.item.BagTypes;
import fire.pb.item.ItemMaps;
import fire.pb.item.Pack;
import fire.pb.title.Title;
import fire.pb.title.TitleManager;
import fire.pb.ranklist.proc.RankListManager;

public class PGoldDonate extends Procedure{
    private static Logger logger = Logger.getLogger("ITEM");

	private final long roleId;
    private final int goldCount;

	public PGoldDonate(long roleId,int goldCount) {

		super();
		this.roleId = roleId;
        this.goldCount = goldCount;
	}
	@Override
	protected boolean process() throws Exception {
        int itemid = 336011;
		xbean.Properties prop = xtable.Properties.get(roleId);
		if (null == prop) {
			return false;
		}

		// 战斗状态下不能使用该功能
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
			MessageMgr.psendMsgNotify(roleId, 150163, null);
			logger.error("战斗状态下无法使用捐献功能");
			return false;
		}

        Pack selfBag = new Pack(roleId, false);
		if (selfBag.getBagItemNum(itemid) < goldCount)
        {
            logger.error("梦幻币数量不足");
            return false;
        }
			

        // 扣道具
		ItemMaps bagContainer = fire.pb.item.Module.getInstance().getItemMaps(roleId, BagTypes.BAG, false);
		if (bagContainer == null) {
			logger.error("角色id " + roleId + "捐献" + "\t背包错误");
			return false;
		}
		int usedNum = bagContainer.removeItemById(itemid, goldCount, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shenshoucost, itemid,"捐献");
		if (usedNum != goldCount) {
			return false;
		}
        //送花排行榜
		mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PGiveFlowerkRankProc(this.roleId, itemid, goldCount));		
        return true;
    }
}

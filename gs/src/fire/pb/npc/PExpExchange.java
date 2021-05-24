package fire.pb.npc;
import mkdb.Procedure;
import org.apache.log4j.Logger;
import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.talk.MessageMgr;
import fire.pb.main.ConfigManager;
import java.util.Map;
import java.util.Arrays;
import fire.pb.shop.SExpChangeTable;
import fire.pb.SRefreshUserExp;
import fire.pb.item.ItemShuXing;
import fire.pb.util.BagUtil;
public class PExpExchange extends Procedure {
    private static Logger logger = Logger.getLogger("ITEM");
    private final long roleId;
	private final int itemid;
	private final int itemnum;
	public static final Map<Integer, SExpChangeTable> expExchangeList = ConfigManager.getInstance().getConf(SExpChangeTable.class);

	public PExpExchange(long roleId, int itemid, int itemnum) {
		super();
		this.roleId = roleId;
		this.itemid = itemid;
		this.itemnum = itemnum;
    }
    
    @Override
	protected boolean process() throws Exception {
		SExpChangeTable item = expExchangeList.get(itemid);
		if(item == null)
		{
			logger.error("未找到该物品!!!");
			return false;
		}
		final xbean.Properties prop = xtable.Properties.get(roleId);
		if (null == prop)
			return false;
		int needExp = item.needexp;
		int costExp = needExp * itemnum;
		long curexp = prop.getExp();
		long allexp = prop.getAllexp();
		if(costExp > curexp)
		{
			logger.error("当前经验不足以兑换该物品!!!");
			MessageMgr.sendMsgNotify(roleId, 196016, Arrays.asList(new String[] { "" }));
			return false;
		}

		ItemShuXing iAttr = fire.pb.item.Module.getInstance().getItemManager().getAttr(itemid);
		if (iAttr == null) {
			fire.pb.item.Module.logger.error("角色:" + roleId + "兑换物品的id:" + itemid+ "找不到属性!");
			return false;
		}
				
		if (BagUtil.addItem(roleId, itemid, 1, "兑换物品", YYLoggerTuJingEnum.tujing_Value_jifenduihuanget, itemid)	!= 1){
			MessageMgr.psendMsgNotifyWhileRollback(roleId, 142338, null);
			return false;
		}
		// 扣除经验
		prop.setExp(curexp - costExp);
		prop.setAllexp(allexp - costExp);
		// 通知客户端刷新经验
		MessageMgr.sendMsgNotify(roleId, 196017, Arrays.asList(new String[] { "" }));
		mkdb.Procedure.psendWhileCommit(roleId,new SRefreshUserExp(prop.getExp()));
        return true;
    }
    
}
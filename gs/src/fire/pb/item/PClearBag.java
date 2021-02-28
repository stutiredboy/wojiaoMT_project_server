package fire.pb.item;

import static fire.pb.item.Commontext.DROP_ITEM_FAIL;
import static fire.pb.item.Commontext.DROP_ITEM_SUCC;
import fire.pb.main.ConfigManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fire.pb.event.DeleteItemEvent;
import fire.pb.event.Poster;
import fire.pb.mission.SNpcFollowEnd;
import fire.pb.talk.MessageMgr;
import fire.pb.tel.utils.GoodsSafeLocksUtils;
import mkdb.Procedure;

public class PClearBag extends Procedure {
    public static final Map<Integer, SClearTypeConfig> clearLimitList = ConfigManager.getInstance().getConf(SClearTypeConfig.class);
	public PClearBag(long roleId, int packid) {
		this.roleId = roleId;
		this.packid = packid;
	}

	@Override
	protected boolean process() {
		final ItemMaps bag = Module.getInstance().getItemMaps(roleId,
				packid, false);
		if (bag == null)
            return false;
        Pack pack = new Pack(roleId,true);
        for (final ItemBase b : pack) {
			final ItemBase bi = bag.getItem(b.keyinpack);
            if (bi == null)
                continue;
            Map<Integer,Sanquan> map = fire.pb.main.ConfigManager.getInstance().getConf(Sanquan.class);
		    if(map != null){
			    if(map.containsKey(bi.getItemId())){
				    if (GoodsSafeLocksUtils.checkLockStatus(roleId,bi)) {
					    continue;
				    }
			    }
		    }
            fire.pb.talk.MessageMgr.psendMsgNotifyWhileRollback(roleId,DROP_ITEM_FAIL, null);
            if (!bi.itemAttr.destroy) {
                continue;
            }
            else
            {
                int key = b.keyinpack;
                final ItemBase item = bag.getItem(key);
                if (item == null)
                    continue;
                final Integer itemnum = item.getNumber();
                final String units = item.getItemAttr().unit;
                final String itemname = item.getItemAttr().name;
                final int itemid = item.getItemId();
                if(clearLimitList.containsKey(itemid))
                {
                    continue;
                }
                
                xbean.Properties prop = xtable.Properties.select(roleId);
                if (prop != null)
                {
                    if (itemid == prop.getRide())
                    {
                        MessageMgr.sendMsgNotify(roleId, 180000, null);
                        continue;
                    }
                }
                
                int removed = bag.removeItemWithKey(key, -1,
                        fire.log.enums.YYLoggerTuJingEnum.tujing_Value_diuqi, 0,
                        "丢弃物品");
                if (removed != 0) {
                    List<String> parameters = new ArrayList<String>();
                    parameters.add(itemnum.toString());
                    parameters.add(units);
                    parameters.add(itemname);
                    fire.pb.talk.MessageMgr.psendMsgNotify(roleId, DROP_ITEM_SUCC,
                            parameters);
                   if (itemid == 50205) {
                       SNpcFollowEnd sNpcFollowEnd = new SNpcFollowEnd(11398);
                       Procedure.psendWhileCommit(roleId, sNpcFollowEnd);
                    }
    
                    Poster.getPoster().dispatchEvent(new DeleteItemEvent(roleId,itemid,itemnum));
                    
                }
            }
        }
        //清除数据
        GoodsSafeLocksUtils.doClearDataWhileCommit(roleId);
        return true;
	}

	private long roleId = 0;
	private int packid = 0;
}
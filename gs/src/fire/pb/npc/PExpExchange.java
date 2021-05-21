package fire.pb.npc;
import mkdb.Procedure;
import org.apache.log4j.Logger;
import com.locojoy.base.Octets;
import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.item.BagTypes;
import fire.pb.item.ItemBase;
import fire.pb.item.ItemMaps;
import fire.pb.item.ItemShuXing;
import fire.pb.item.SAddItem;
import fire.pb.shop.utils.MarketUtils;
import fire.pb.talk.MessageMgr;
public class PExpExchange extends Procedure {
    private static Logger logger = Logger.getLogger("ITEM");
    private final long roleId;
	private final int itemid;
	private final int itemnum;

	public PExpExchange(long roleId, int itemid, int itemnum) {
		super();
		this.roleId = roleId;
		this.itemid = itemid;
		this.itemnum = itemnum;
    }
    
    @Override
	protected boolean process() throws Exception {
        
        return true;
    }
    
}
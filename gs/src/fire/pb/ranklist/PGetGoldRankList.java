package fire.pb.ranklist;
import mkdb.Procedure;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import fire.log.RemoteLogParam;
import fire.pb.PropRole;
import fire.pb.main.ConfigManager;
import mkdb.Procedure;
import xbean.PetScoreListRecord;
import xbean.PetScoreRankList;
import xbean.RoleLevelListRecord;
import xbean.RoleLevelRankList;


public class PGetGoldRankList extends Procedure {

    private static Logger logger = Logger.getLogger("ITEM");

	private final long roleId;

	public PGetGoldRankList(long roleId) {

		super();
		this.roleId = roleId;
	}
	@Override
	protected boolean process() throws Exception {
        xbean.RoleRankList ranlListBean = xtable.Rolerankdatalist.select(1);
		PropRole prole = new PropRole(roleId, true);		
		if(null == ranlListBean)
		{	
            logger.error("----------------排行榜数据为空");
			return false;
		}
        List<xbean.RoleRankRecord> roleRankList = ranlListBean.getRecords();
        fire.pb.ranklist.SResGoldCoinRank send = new SResGoldCoinRank();
        for(int i=0; i < roleRankList.size(); i++){
			xbean.RoleRankRecord current = roleRankList.get(i);
			GoldCoinRank data = new GoldCoinRank();
            long rid = current.getRoleid();
			data.nickname = current.getRolename();
            data.school = current.getSchool();
            fire.pb.item.Pack bag = new fire.pb.item.Pack(rid, false);
            data.coincount = (int)bag.getGold();
            data.rank = 0;
            send.goldcolininfo.add(data);
		}
		psendWhileCommit(roleId, send);
        return true;
    }

}


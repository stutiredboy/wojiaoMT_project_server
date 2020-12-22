package fire.pb.ranklist.provider;

import java.util.ArrayList;
import java.util.List;

import fire.pb.PropRole;
import fire.pb.ranklist.SRequestRankList;
import fire.pb.ranklist.proc.RankListManager;

import com.locojoy.base.Octets;
import com.locojoy.base.Marshal.OctetsStream;


/***
 * 职业排行榜
 * @author changhao
 *
 */
public class ProfessionZongheRankData extends RankData implements IRankListData{

	ProfessionZongheRankData(int rankype, long requestRoleid) {
		super(rankype, requestRoleid);
	}

	@Override
	public List<Octets> getMO(SRequestRankList response, int page) {
		
		xbean.RoleProfessionRankList ranlListBean = xtable.Roleprofessionranklist.select(rankType);
		
		PropRole prole = new PropRole(requestRoleid, true);
		if(null == ranlListBean)
		{
			response.extdata = prole.getProperties().getRolezonghemaxscore();
			return null;
		}

		List<xbean.RoleProfessionRankRecord> roleRankList = ranlListBean.getRecords();
		int start = page * RankListManager.PAGE_SIZE;
		int end = (page + 1)* RankListManager.PAGE_SIZE;
		int hasMorePage = (page + 1) * RankListManager.PAGE_SIZE < roleRankList.size() ? 0:1;
		List<com.locojoy.base.Octets> octets = new ArrayList<com.locojoy.base.Octets>();
		
		for(int i=0; i<roleRankList.size(); i++){
			xbean.RoleProfessionRankRecord current = roleRankList.get(i);
			if(i >= start && i < end) {
				OctetsStream os = new OctetsStream();
				os.marshal(i+1);
				os.marshal(current.getRoleid());
				os.marshal(current.getRolename(), "UTF-16LE");
				os.marshal(current.getSchool());
				os.marshal(current.getScore());
				os.marshal(current.getClanname(), "UTF-16LE");
				os.marshal(current.getLevel());
				octets.add(os);
			}
			if(current.getRoleid() == requestRoleid){
				response.myrank = i+1;
			}
		}
		response.mytitle = String.valueOf(new PropRole(this.requestRoleid, true).getProperties().getRolezonghemaxscore());
		response.hasmore = hasMorePage;
		response.page = page;
		
		//计算自己的评分 by changhao
		response.extdata = prole.getProperties().getRolezonghemaxscore();
		
		return octets;
	}

}
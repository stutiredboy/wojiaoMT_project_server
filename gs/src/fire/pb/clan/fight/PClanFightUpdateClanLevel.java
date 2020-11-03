package fire.pb.clan.fight;

import fire.pb.activity.clanfight.ActivityClanFightManager;
/**
 * 公会等级变化更新 公会战历史记录和竞赛记录  by changhao
 */
public class PClanFightUpdateClanLevel extends mkdb.Procedure
{
	long clanid;
	int level;
	
	public PClanFightUpdateClanLevel(long clanid, int level)
	{
		this.clanid = clanid;
		this.level = level;
	}
	
	@Override
	protected boolean process() throws Exception
	{	
		long cur = System.currentTimeMillis();
		
		long monday1500 = ActivityClanFightManager.GetMonday1500ByTime(cur);
		long wednesday1500 = ActivityClanFightManager.GetWednesday1500ByTime(cur);
		long datetime = ActivityClanFightManager.GetMonday0000ByTime(cur);
		
		xbean.ClanFightRaceRankList list1 = xtable.Clanfightracelist.get(monday1500);
		
		if (list1 != null)
		{
			for (xbean.ClanFightRaceRankRecord e : list1.getRecords())
			{
				if (e.getMarshaldata().getClanid() == clanid)
				{
					e.getMarshaldata().setClanlevel(level);
					break;
				}
			}			
		}
		
		xbean.ClanFightRaceRankList list2 = xtable.Clanfightracelist.get(wednesday1500);
		
		if (list2 != null)
		{
			for (xbean.ClanFightRaceRankRecord e : list2.getRecords())
			{
				if (e.getMarshaldata().getClanid() == clanid)
				{
					e.getMarshaldata().setClanlevel(level);
					break;
				}
			}			
		}
		
		xbean.ClanFightRaceRankList list3 = xtable.Clanfightracelist.get(datetime);
		
		if (list3 != null)
		{
			for (xbean.ClanFightRaceRankRecord e : list3.getRecords())
			{
				if (e.getMarshaldata().getClanid() == clanid)
				{
					e.getMarshaldata().setClanlevel(level);
					break;
				}
			}			
		}
		
		xbean.ClanFightHistroyRankList list4 = xtable.Clanfighthistroylist.get(0);
		
		if (list4 != null)
		{
			for (xbean.ClanFightHistroyRankRecord e : list4.getRecords())
			{
				if (e.getMarshaldata().getClanid() == clanid)
				{
					e.getMarshaldata().setClanlevel(level);
					break;
				}
			}			
		}
			
		return true;
	}
}

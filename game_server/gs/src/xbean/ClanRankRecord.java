
package xbean;

public interface ClanRankRecord extends mkdb.Bean {
	public ClanRankRecord copy(); // deep clone
	public ClanRankRecord toData(); // a Data instance
	public ClanRankRecord toBean(); // a Bean instance
	public ClanRankRecord toDataIf(); // a Data instance If need. else return this
	public ClanRankRecord toBeanIf(); // a Bean instance If need. else return this

	public int getRank(); // 排名
	public long getClankey(); // 公会表唯一键值
	public String getClanname(); // 公会名称
	public com.locojoy.base.Octets getClannameOctets(); // 公会名称
	public int getLevel(); // 公会等级
	public int getMembernum(); // 公会成员数
	public int getHotel(); // 旅馆等级 by changhao
	public long getTriggertime(); // 触发时间 by changhao

	public void setRank(int _v_); // 排名
	public void setClankey(long _v_); // 公会表唯一键值
	public void setClanname(String _v_); // 公会名称
	public void setClannameOctets(com.locojoy.base.Octets _v_); // 公会名称
	public void setLevel(int _v_); // 公会等级
	public void setMembernum(int _v_); // 公会成员数
	public void setHotel(int _v_); // 旅馆等级 by changhao
	public void setTriggertime(long _v_); // 触发时间 by changhao
}

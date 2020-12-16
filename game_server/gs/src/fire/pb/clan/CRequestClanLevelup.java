
package fire.pb.clan;

import java.util.ArrayList;
import java.util.List;

import fire.log.beans.ClanBuildUPBean;
import fire.log.beans.FactionOpbean;
import fire.pb.clan.srv.ClanManage;
import fire.pb.clan.srv.ClanRank;
import fire.pb.talk.MessageMgr;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestClanLevelup__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestClanLevelup extends __CRequestClanLevelup__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		/***
		 * 加锁顺序faction2->role by changhao
		 */
		mkdb.Procedure requestfactionlevelup = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				SClanLevelup sClanLevelup = new SClanLevelup();
				
				Long factionid = xtable.Roleidclan.select(roleid);
				xbean.ClanInfo clan = xtable.Clans.get(factionid);
				
				if (clan.getClanmaster() != roleid && clan.getClanvicemaster() != roleid)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 150127, null);
					return true;
				}
				
				int money = clan.getMoney();
				int uplevel=0;//升级后的等级
				int cost=0;//消�??
				int opid=0;//
				if (id == ClanManage.Lobby) //大厅升级 by changhao
				{
					int level = clan.getClanlevel();
					int sumlevel = 0;
					sumlevel += clan.getHouse().get(ClanManage.GoldBank);
					sumlevel += clan.getHouse().get(ClanManage.DrugStone);
					sumlevel += clan.getHouse().get(ClanManage.Hotel);

					fire.pb.clan.SClanLobby lobby =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanLobby.class).get(level);
					if (lobby == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanLobby l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanLobby.class).get(level + 1);
					if (l == null) //不能再升�? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					int sum = lobby.othersum;
					if (sumlevel < sum) //要求不够 by changhao
					{
						//java.util.List<String> parameters = new java.util.ArrayList<String>();
						//parameters.add(attr.name);
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160225, null);
						return true;
					}
				
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.Lobby)) //贮备的金钱不�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//扣钱 by changhao
					boolean ok = ClanManage.AddClanMoney(-lobby.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.setClanlevel(level + 1);
					
					sClanLevelup.change.put(ClanManage.Lobby, level + 1);
					sClanLevelup.money = clan.getMoney();	
					uplevel=level + 1;//升级后的等级
					cost=lobby.levelupcost;//消�??
					opid=FactionOpbean.TYPE_LOBBY_UP;
					
					SendAllFactionMemeber(clan, ClanManage.Lobby, level + 1);
					
					//更新公会等级排行 by changhao
					mkdb.Procedure.pexecuteWhileCommit(new ClanRank(clan.toData()));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clan.getKey(), false));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.fight.PClanFightUpdateClanLevel(clan.getKey(), clan.getClanlevel()));
				}
				else if (id == ClanManage.GoldBank)
				{
					int level = clan.getHouse().get(ClanManage.GoldBank);
					fire.pb.clan.SClanGoldBank bank =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanGoldBank.class).get(level);
					if (bank == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanGoldBank l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanGoldBank.class).get(level + 1);
					if (l == null) //不能再升�? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.GoldBank)) //贮备的金钱不�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//扣钱 by changhao
					boolean ok = ClanManage.AddClanMoney(-bank.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.GoldBank, level + 1);
					
					sClanLevelup.change.put(ClanManage.GoldBank, level + 1);
					sClanLevelup.money = clan.getMoney();	
					uplevel=level + 1;//升级后的等级
					cost=bank.levelupcost;//消�??
					opid=FactionOpbean.TYPE_GOLD_UP;
					
					SendAllFactionMemeber(clan, ClanManage.GoldBank, level + 1);
				}
				else if (id == ClanManage.DrugStone)
				{
					int level = clan.getHouse().get(ClanManage.DrugStone);
					fire.pb.clan.SClanDrugstore drugstone =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level);
					if (drugstone == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanDrugstore l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level + 1);
					if (l == null) //不能再升�? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.DrugStone)) //贮备的金钱不�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//扣钱 by changhao
					boolean ok = ClanManage.AddClanMoney(-drugstone.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.DrugStone, level + 1);
					
					sClanLevelup.change.put(ClanManage.DrugStone, level + 1);
					sClanLevelup.money = clan.getMoney();
					
					uplevel=level + 1;//升级后的等级
					cost=drugstone.levelupcost;//消�??
					opid=FactionOpbean.TYPE_DRUGSTONE_UP;
					
					SendAllFactionMemeber(clan, ClanManage.DrugStone, level + 1);
					//处理默认刷药逻辑
					if(level==0){
						mkdb.Procedure proc=fire.pb.clan.srv.ClanManage.refreshMedic(clan.getKey());
						mkdb.Procedure.pexecuteWhileCommit(proc);
					}
				}
				else if (id == ClanManage.Hotel)
				{
					int level = clan.getHouse().get(ClanManage.Hotel);
					fire.pb.clan.SClanHotel hotel =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanHotel.class).get(level);
					if (hotel == null)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 143583, null);
						return true;
					}
				
					fire.pb.clan.SClanDrugstore l =  fire.pb.main.ConfigManager.getInstance().getConf(fire.pb.clan.SClanDrugstore.class).get(level + 1);
					if (l == null) //不能再升�? by changhao
					{
						java.util.ArrayList<String> args = new java.util.ArrayList<String>();
						Integer s = level;
						args.add(s.toString());
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160226, args);
						return true;						
					}
					
					if (money < ClanUtils.getBuildLevelupMax(clan).get(ClanManage.Hotel)) //贮备的金钱不�? by changhao
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					//扣钱 by changhao
					boolean ok = ClanManage.AddClanMoney(-hotel.levelupcost, clan);
					if (ok == false)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 160224, null);
						return true;
					}
					
					clan.getHouse().put(ClanManage.Hotel, level + 1);
					
					sClanLevelup.change.put(ClanManage.Hotel, level + 1);
					sClanLevelup.money = clan.getMoney();
					uplevel=level + 1;//升级后的等级
					cost=hotel.levelupcost;//消�??
					opid=FactionOpbean.TYPE_HOTEL_UP;
					
					SendAllFactionMemeber(clan, ClanManage.Hotel, level + 1);
					//更新公会等级排行 by changhao
					mkdb.Procedure.pexecuteWhileCommit(new ClanRank(clan.toData()));
					mkdb.Procedure.pexecuteWhileCommit(new fire.pb.ranklist.proc.PFactionZongHeProc(clan.getKey(), false));
				}
				
				sClanLevelup.costmax.putAll(ClanUtils.getBuildLevelupMax(clan));
				mkdb.Procedure.psendWhileCommit(clan.getMembers().keySet(), sClanLevelup); //发�?�给�?有会�? by changhao
				//运营日志
				ClanBuildUPBean factionOpbean=new ClanBuildUPBean(clan.getKey(),opid, uplevel -1, uplevel,cost);
				fire.log.YYLogger.factionBuildUPLog(roleid,factionOpbean);
				
				return true;
			}
		};
		
		requestfactionlevelup.submit();	
	}
	
	public void SendAllFactionMemeber(xbean.ClanInfo clanInfo, int type, int data)
	{
		List<String> paras = new ArrayList<String>();
		paras.add(String.valueOf(data));
		int msgid = 160200;
		if (type == ClanManage.GoldBank)
		{
			msgid = 160219;
		}
		else if (type == ClanManage.DrugStone)
		{
			msgid = 160220;
		}
		else if (type == ClanManage.Hotel)
		{
			msgid = 160221;
		}
		
		for (long roleid : clanInfo.getMembers().keySet())
		{
			MessageMgr.psendSystemMessageToRole(roleid, msgid, paras);				
		}
		
		//处理帮派事件
		fire.pb.clan.srv.ClanManage.addDealClanEventInfo(clanInfo,fire.pb.clan.srv.ClanManage.EVENT_BUILD_UP,0,fire.pb.clan.srv.ClanManage.getClanBuildNameByType(type),data+"","");
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808472;

	public int getType() {
		return 808472;
	}

	public int id; // 1����2���3ҩ��4�ù� by changhao

	public CRequestClanLevelup() {
	}

	public CRequestClanLevelup(int _id_) {
		this.id = _id_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestClanLevelup) {
			CRequestClanLevelup _o_ = (CRequestClanLevelup)_o1_;
			if (id != _o_.id) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += id;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestClanLevelup _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = id - _o_.id;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


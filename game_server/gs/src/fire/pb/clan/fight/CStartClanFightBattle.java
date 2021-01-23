
package fire.pb.clan.fight;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CStartClanFightBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 鐎碉拷?濠殿喖顑呴崣鏇熷濮橆厼鐏� battle PK by changhao
 * @author Administrator
 *
 */
public class CStartClanFightBattle extends __CStartClanFightBattle__ {
	@Override
	protected void process() {
		// protocol handle
				
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		mkdb.Procedure startclanfightbattle = new mkdb.Procedure()
		{
			@Override
			protected boolean process()  throws Exception
			{
				long cur = System.currentTimeMillis();
				
				Long battleid = xtable.Roleid2battleid.select(roleid);
				if (battleid != null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ") " + srcname + " 閻熸瑦甯熸竟锟�(ID = " + targetid + ") " + targetname + " 闁革负鍔嶉崹顒勫棘濡炴崘鍘�");
					return false;
				}
				
				Long targetbattleid = xtable.Roleid2battleid.select(targetid);
				if (targetbattleid != null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ") " + srcname + " 閻熸瑦甯熸竟锟�(ID = " + targetid + ") " + targetname + " 闁烩晩鍠楅悥锝夊捶閵婏箑鐏涢柡鍌涖仦閼碉拷");
					return false;
				}
				
				Long c1 = xtable.Roleid2clanfightid.select(roleid); //婵★拷?婵炴潙顑嗗Σ鎼佸触閿曪拷濠�顏堝箣濡儤绨氬☉锟�? by changhao
				if (c1 == null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ") " + srcname + " 閻熸瑦甯熸竟锟�(ID = " + targetid + ") " + targetname + " 濞戞挸绉村﹢顏堝箣濡儤绨�");

					return false;
				}
				
				Long c2 = xtable.Roleid2clanfightid.select(targetid); //婵★拷?婵炴潙顑嗗Σ鎼佸触閿曪拷濠�顏堝箣濡儤绨氬☉锟�? by changhao
				if (c2 == null)
				{
					String srcname = xtable.Properties.selectRolename(roleid);
					String targetname = xtable.Properties.selectRolename(targetid);
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ") " + srcname + " 閻熸瑦甯熸竟锟�(ID = " + targetid + ") " + targetname + " 闁烩晩鍠楅悥锝嗙▔瀹ュ懏韬柟瀛樏┃锟�");

					return false;
				}
				
				if (!c1.equals(c2)) //闁哄嫷鍨伴幆渚�宕烽妸銉﹀�卞☉锟�?闁稿浚鍏涚槐浼村箣濮楋拷閸ｏ拷 by changhao
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")闁告艾濂旂粩鎾礂椤戣法绐�");
					return false;
				}
				
				xbean.EClanFightStatistics statistics1 = xtable.Roleid2clanfightstatistics.select(roleid);
				if (statistics1 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")婵炲备鍓濆﹢渚�寮悧鍫濈ウ濞ｅ洠鍓濇导锟�");
					return false;
				}
				
				xbean.EClanFightStatistics statistics2 = xtable.Roleid2clanfightstatistics.select(targetid);
				if (statistics2 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + targetid + ")闁烩晩鍠楅悥锝呪柦閳╁啯绠掗柡浣哄瀹撲焦绌遍埄鍐х礀");
					return false;
				}
				
				if (cur < statistics2.getLastlosestamp() + 10 * 1000)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410062, null);
					return false;
				}
				
				if (statistics2.getAct() <= 0)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")闁烩晩鍠楅悥锝呪柦閳╁啯绠掗悶娑樿嫰婵晠宕�? ");
					return false;
				}
				
				if (statistics1.getAct() < fire.pb.activity.clanfight.ActivityClanFightManager.ATTACK_SUB_ACT)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410056, null);
					return false;
				}
				
				int which1 = -1;
				int which2 = -1;
				fire.pb.clan.fight.ClanFightBattleField bf1 = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c1, true);
				if (bf1 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")闁瑰瓨锚濠э拷濞戞挸绉撮悺銊╁捶?");
					return false;
				}
				
				which1 = bf1.getSideByRoleId(roleid);
				
				fire.pb.clan.fight.ClanFightBattleField bf2 = fire.pb.clan.fight.ClanFightFactory.getClanFightBattleField(c2, true);
				if (bf2 == null)
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")闁瑰瓨锚濠э拷濞戞挸绉撮悺銊╁捶?");
					return false;
				}
				
				which2 = bf2.getSideByRoleId(targetid);
				
				//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍕靛灠椤曨喚绮�? by changhao
				if (!(which1 == 0 && which2 == 1) && !(which1 == 1 && which2 == 0))
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")闁烩晩鍠楅悥锝夋⒓娴ｅ啯鍎夊☉鎾崇Т椤曪拷");
					return false;
				}
				
				if (bf1.getClanfightBean().getState() == xbean.ClanFightBattleField.STATE_CLAN_FIGHT_OVER)
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410055, null);
					return false;
				}
				
				if (cur > bf1.getClanfightBean().getActivitystarttime() && cur < bf1.getClanfightBean().getActivitypreparetime())
				{
					fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 410052, null);
					return false;
				}
				
				if (cur < bf1.getClanfightBean().getActivitypreparetime() || cur > bf1.getClanfightBean().getActivityendtime())
				{
					fire.pb.clan.fight.ClanFightBattleField.logger.error("CStartClanFightBattle:閻熸瑦甯熸竟锟�(ID = " + roleid + ")濞戞挸绉村﹢鐙縆闁哄啫鐖煎Λ鍧楀礃?");
					return false;
				}
				
				long attackerclanid = 0;
				long hitclanid = 0;
				if (which1 == 0)
				{
					attackerclanid = bf1.getClanfightBean().getClanid1();
					hitclanid = bf1.getClanfightBean().getClanid2();
				}
				else
				{
					attackerclanid = bf1.getClanfightBean().getClanid2();
					hitclanid = bf1.getClanfightBean().getClanid1();
				}
				
				fire.pb.team.Team team = fire.pb.team.TeamManager.selectTeamByRoleId(targetid);
				if (team != null)
				{
					if (team.isNormalMember(targetid)) //濠碘�冲�归悘澶愬及椤栨侗鍔�閻㈩垱鎮傚Σ锕傚川? by changhao
					{
						targetid = team.getTeamLeaderId();
					}
				}
				
				if (xtable.Watcherid2battleid.select(targetid) != null)
				{
					new fire.pb.battle.watch.PEndWatchBattle(targetid).call();				
				}
								
				ClanFightEndHandler handler = new ClanFightEndHandler(c1, roleid, targetid, attackerclanid, hitclanid);
				fire.pb.battle.PNewBattle p = new fire.pb.battle.PNewBattle(roleid, targetid, fire.pb.battle.BattleType.BATTLE_CLAN_FIGHT, handler);
				p.call();
				
				return true;
			}
		};
		
		startclanfightbattle.submit();	
	}
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808534;

	public int getType() {
		return 808534;
	}

	public long targetid; // 目标id by changhao

	public CStartClanFightBattle() {
	}

	public CStartClanFightBattle(long _targetid_) {
		this.targetid = _targetid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(targetid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		targetid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CStartClanFightBattle) {
			CStartClanFightBattle _o_ = (CStartClanFightBattle)_o1_;
			if (targetid != _o_.targetid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)targetid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(targetid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CStartClanFightBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(targetid - _o_.targetid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


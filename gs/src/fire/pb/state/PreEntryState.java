package fire.pb.state;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.locojoy.base.Runnable;

import mkdb.Procedure;
import xbean.BasicFightProperties;
import fire.pb.GsClient;
import fire.pb.PAfterEnterWorld;
import fire.pb.PLoginWeekUpdatesProc;
import fire.pb.POnlineBegin;
import fire.pb.PSendLoginIp;
import fire.pb.PropRole;
import fire.pb.SAddPointAttrData;
import fire.pb.SEnterWorld;
import fire.pb.SysConfigType;
import fire.pb.activity.winner.PClearWinnerTask;
import fire.pb.attr.AttrType;
import fire.pb.attr.RoleCurrency;
import fire.pb.attr.SRefreshRoleCurrency;
import fire.pb.attr.SRefreshRoleData;
import fire.pb.attr.SRefreshRoleScore;
import fire.pb.battle.livedie.PLiveDieBattleLoginTip;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.clan.ClanUtils;
import fire.pb.clan.srv.ClanManage;
import fire.pb.friends.PFriendsInfoInit;
import fire.pb.fushi.PCoinToNum;
import fire.pb.fushi.spotcheck.SpotCheckManage;
import fire.pb.game.MoneyType;
import fire.pb.gm.GMInteface;
import fire.pb.gm.PFunOpenClose;
import fire.pb.hook.PRefreshLoginHookDataProc;
import fire.pb.item.PEquipRideProc;
import fire.pb.item.onlinegift.TimingRewardAssistant;
import fire.pb.lock.PUpdateRoleLock;
import fire.pb.main.ConfigManager;
import fire.pb.main.Gs;
import fire.pb.master.proc.PMasterOnLineProc;
import fire.pb.mission.activelist.PCalcYingFuExpProc;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.mission.fairyland.PSendFairylandMission;
import fire.pb.move.SceneState;
import fire.pb.mysql.C3P0Util;
import fire.pb.pet.Pet;
import fire.pb.pet.PetColumn;
import fire.pb.pet.PetColumnTypes;
import fire.pb.pingbi.PSendBlackRolesProc;
import fire.pb.ranklist.proc.PRoleZongheRankProc;
import fire.pb.shop.srv.market.MarketManager;
import fire.pb.skill.liveskill.LiveSkillManager;
import fire.pb.statistics.StatisticUtil;
import fire.pb.title.PRemoveTitleProc;
import fire.pb.title.Title;
import fire.pb.util.DateValidate;
import fire.pb.util.FireProp;

public class PreEntryState extends State {

	public PreEntryState(long roleId) {

		super(roleId);
	}

	@Override
	public boolean enter(int trigger) {

		Integer oldstate = xtable.Roleonoffstate.get(roleId);
		if (oldstate == null)
			oldstate = State.UNENTRY_STATE;
		boolean valid = false;
		if (trigger == State.TRIGGER_ONLINE && oldstate == State.UNENTRY_STATE)
			valid = true;
		if (!valid) {
			enterErrorLog(oldstate, trigger);
			return false;
		}
		xtable.Roleonoffstate.remove(roleId);
		xtable.Roleonoffstate.add(roleId, getState());
		StateManager.logger.info(new StringBuilder("roleId=").append(roleId)
				.append(" ?????????????????????").append(this.getClass()));

		return execute();
	}

	@Override
	public boolean execute() {

		if (!beforeEnterWorld())
			return false;
		sendEnterWorld();
		return trigger(State.TRIGGER_PROCESS_DONE);

	}

	protected boolean beforeEnterWorld() {

		final xbean.Properties pro = xtable.Properties.get(roleId);
		if (null == pro) {
			StateManager.logger.error(new StringBuilder("roleId=").append(
					roleId).append(" PreEntryState Error: ??????Properties??????"));
			return false;
		}
		if (pro.getDeletetime() > 0) {
			StateManager.logger.error(new StringBuilder("roleId=").append(
					roleId).append(" PreEntryState Error: ??????????????????"));
			return false;
		}
		// // ????????????????????????????????????????????????
		// final xbean.User u = xtable.User.select(pro.getUserid());
		// if (u != null) {
		// if (u.getPrevloginroleid() != 0 && roleId != u.getPrevloginroleid()) {
		// int stateId = StateManager.selectStateIdByRoleId(u
		// .getPrevloginroleid());
		// if (stateId == State.TRUSTEESHIP_STATE) {
		// StateManager.logger.error(new StringBuilder("roleId=")
		// .append(roleId)
		// .append(" PreEntryState Error: ???????????????????????????????????????: ")
		// .append(u.getPrevloginroleid()).append(" ?????????????????????"));
		// return false;
		// }
		// }
		// }

		if (!new fire.pb.buff.PRoleOnline(roleId).call()) {
			StateManager.logger.error(new StringBuilder("roleId=").append(
					roleId).append(" PreEntryState Error: ??????buff???????????????????????????"));
			return false;
		}
		if (!new fire.pb.item.PRoleOnline(roleId).call()) {
			StateManager.logger.error(new StringBuilder("roleId=").append(
					roleId).append(" PreEntryState Error: ????????????????????????????????????"));
			return false;
		}

		return true;
	}
	
	class TSyncFriendsToMysql extends Runnable {
		@Override
		public void run() {
			Connection conn = C3P0Util.getConnection();
			Statement stmt = null;
			Statement stmt2 = null;
			try {
				stmt = conn.createStatement();
				stmt2 = conn.createStatement();
				String delsqlstr = "DELETE FROM `role_relation` WHERE roleid=" + roleId;
				int ret2 = stmt2.executeUpdate(delsqlstr);
				fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:[" + roleId + "]" + delsqlstr + ";ret2 = " + ret2);
				if(ret2 < 0) {
					fire.pb.friends.Module.logger.error("PSyncFriendsToMysql:[" + roleId + "]??????mysql?????????????????????");
					if (stmt != null) {
						try {
							stmt.close();
						} catch (SQLException sqlEx) {
						}
						stmt = null;
					}
					if (stmt2 != null) {
						try {
							stmt2.close();
						} catch (SQLException sqlEx) {
						}
						stmt2 = null;
					}
					C3P0Util.close(conn, null, null);
					return;
				}	
				xbean.FriendGroups groups = xtable.Friends.select(roleId);
				if (groups == null) {
					fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:[" + roleId + "]xdb??????????????????,??????????????????mysql???");
					if (stmt != null) {
						try {
							stmt.close();
						} catch (SQLException sqlEx) {
						}
						stmt = null;
					}
					if (stmt2 != null) {
						try {
							stmt2.close();
						} catch (SQLException sqlEx) {
						}
						stmt2 = null;
					}
					C3P0Util.close(conn, null, null);
					return;
				}
				fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:????????????[" + roleId + "]???????????????mysql????????????:" + groups.getFriendmap().size());
				for(Long friendid : groups.getFriendmap().keySet()) {
					//????????????????????????????????????????????????????????????150???Insert
					String sqlstr = "INSERT INTO `role_relation`(roleid, friendid, relation) "
							+ "VALUES ('" + roleId + "', '" + friendid + "', '" + 1 + "')";
					stmt.addBatch(sqlstr);
				}	
				int ret[] = stmt.executeBatch();
				fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:ret.length=" + ret.length + ",friends.size=" + groups.getFriendmap().size());
				if(ret.length == groups.getFriendmap().size()) {
					fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:??????[" + roleId + "]???????????????mysql????????????????????????:" + ret.length);
				} else {
					fire.pb.friends.Module.logger.error("PSyncFriendsToMysql:??????[" + roleId + "]???????????????mysql???????????????????????????");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlEx) {
					}
					stmt = null;
				}
				if (stmt2 != null) {
					try {
						stmt2.close();
					} catch (SQLException sqlEx) {
					}
					stmt2 = null;
				}
				C3P0Util.close(conn, null, null);
				return;
			} finally {
				if (stmt2 != null) {
					try {
						stmt2.close();
					} catch (SQLException sqlEx) {
					}
					stmt2 = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException sqlEx) {
					}
					stmt = null;
				}
			}
			C3P0Util.close(conn, null, null);
			return;
		}
	}
	
//	class PSyncFriendsToMysql extends Procedure {
//		@Override
//		protected boolean process() throws Exception {
//			Connection conn = C3P0Util.getConnection();
//			Statement stmt = null;
//			Statement stmt2 = null;
//			try {
//				stmt = conn.createStatement();
//				stmt2 = conn.createStatement();
//				String delsqlstr = "DELETE FROM `role_relation` WHERE roleid=" + roleId;
//				int ret2 = stmt2.executeUpdate(delsqlstr);
//				fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:[" + roleId + "]" + delsqlstr + ";ret2 = " + ret2);
//				if(ret2 < 0) {
//					fire.pb.friends.Module.logger.error("PSyncFriendsToMysql:[" + roleId + "]??????mysql?????????????????????");
//					if (stmt != null) {
//						try {
//							stmt.close();
//						} catch (SQLException sqlEx) {
//						}
//						stmt = null;
//					}
//					if (stmt2 != null) {
//						try {
//							stmt2.close();
//						} catch (SQLException sqlEx) {
//						}
//						stmt2 = null;
//					}
//					C3P0Util.close(conn, null, null);
//					return true;
//				}	
//				xbean.FriendGroups groups = xtable.Friends.select(roleId);
//				if (groups == null) {
//					fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:[" + roleId + "]xdb??????????????????,??????????????????mysql???");
//					if (stmt != null) {
//						try {
//							stmt.close();
//						} catch (SQLException sqlEx) {
//						}
//						stmt = null;
//					}
//					if (stmt2 != null) {
//						try {
//							stmt2.close();
//						} catch (SQLException sqlEx) {
//						}
//						stmt2 = null;
//					}
//					C3P0Util.close(conn, null, null);
//					return true;
//				}
//				fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:????????????[" + roleId + "]???????????????mysql????????????:" + groups.getFriendmap().size());
//				for(Long friendid : groups.getFriendmap().keySet()) {
//					//????????????????????????????????????????????????????????????150???Insert
//					String sqlstr = "INSERT INTO `role_relation`(roleid, friendid, relation) "
//							+ "VALUES ('" + roleId + "', '" + friendid + "', '" + 1 + "')";
//					stmt.addBatch(sqlstr);
//				}	
//				int ret[] = stmt.executeBatch();
//				fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:ret.length=" + ret.length + ",friends.size=" + groups.getFriendmap().size());
//				if(ret.length == groups.getFriendmap().size()) {
//					fire.pb.friends.Module.logger.info("PSyncFriendsToMysql:??????[" + roleId + "]???????????????mysql????????????????????????:" + ret.length);
//				} else {
//					fire.pb.friends.Module.logger.error("PSyncFriendsToMysql:??????[" + roleId + "]???????????????mysql???????????????????????????");
//				}
//			} catch (SQLException ex) {
//				ex.printStackTrace();
//				if (stmt != null) {
//					try {
//						stmt.close();
//					} catch (SQLException sqlEx) {
//					}
//					stmt = null;
//				}
//				if (stmt2 != null) {
//					try {
//						stmt2.close();
//					} catch (SQLException sqlEx) {
//					}
//					stmt2 = null;
//				}
//				C3P0Util.close(conn, null, null);
//				return false;
//			} finally {
//				if (stmt2 != null) {
//					try {
//						stmt2.close();
//					} catch (SQLException sqlEx) {
//					}
//					stmt2 = null;
//				}
//				if (stmt != null) {
//					try {
//						stmt.close();
//					} catch (SQLException sqlEx) {
//					}
//					stmt = null;
//				}
//			}
//			C3P0Util.close(conn, null, null);
//			return true;
//		}
//	}

	protected void sendEnterWorld() {
		StateManager.logger.info(new StringBuilder("Begin sendEnterWorld roleId=").append(roleId)
				.append(",").append(this.getClass()));
		gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(roleId);
		if (linkrole == null)
			return;
		int userId = linkrole.getUserid();

		final xbean.Properties pro = xtable.Properties.get(roleId);
		if (null == pro)
			return;
		if (pro.getUserid() == 0) {
			pro.setUserid(userId);
		}
		long time = System.currentTimeMillis();
		long lastonline = pro.getOnlinetime();
		pro.setOnlinetime(time);// ??????????????????
		//????????????????????????
		boolean isSameDay=DateValidate.inTheSameDay(lastonline, time);
		if(isSameDay){
			pro.setLogintimesofday(pro.getLogintimesofday()+1);	
		}else{
			pro.setLogintimesofday(1);	
		}
		//??????????????????????????????
		boolean ischangeclan=false;
		long clankey=pro.getClankey();
		if(pro.getClankey()>0){
			Long clanId = xtable.Roleidclan.select(roleId);
			if(clanId==null){
				pro.setClankey(0);
				ischangeclan=true;
				StateManager.logger.error(new StringBuilder("roleId=").append(roleId).append(" ???????????????????????????,????????????id???").append(clankey));
			}
		}
		
		xbean.RoleSpace rs = xtable.Rolespaces.get(roleId);
		if(rs == null) {
			xbean.RoleSpace newrs = xbean.Pod.newRoleSpace();
			newrs.setGift(0);
			newrs.setPopularity(0);
			newrs.setRecvgift(0);
			newrs.setGetgiftnum(0);
			newrs.setGetgifttime(0);
			xtable.Rolespaces.insert(roleId, newrs);
		}
		
		xbean.RecruitAward ra = xtable.Rolerecruitaward.get(roleId);
		if(ra == null) {
			xbean.RecruitAward newra = xbean.Pod.newRecruitAward();
			newra.setGetnum(0);
			newra.setGettime(0L);
			xtable.Rolerecruitaward.insert(roleId, newra);
		}
		
		StatisticUtil.setUserLasttimeIntoWorld(userId, time);
		StatisticUtil.setRoleLasttimeIntoWorld(roleId, time);
		
		if(ConfigManager.getUseMysql()){
			Gs.getExecService().execute(new Runnable() {
				private boolean InsertMysqlRelation(long roleId, String rolename, int shapeid, int level) {
					boolean updateRet = false;
					Connection conn = C3P0Util.getConnection();
					Statement stmt = null;
					try {
						stmt = conn.createStatement();
						//?????????????????????????????????????????????????????????????????????????????????
//						String sqlstr = "INSERT IGNORE INTO `role`(roleid, name, avatar, level) "
//								+ "VALUES ('" + roleId + "', '" + rolename + "', '" + shapeid + "', '" + level + "') ";
						//??????????????????????????????????????????????????????????????????????????????
						String sqlstr = "INSERT INTO `role`(roleid, name, avatar, level) "
								+ "VALUES ('" + roleId + "', '" + rolename + "', '" + shapeid + "', '" + level + "') "
								+ "ON DUPLICATE KEY UPDATE " + "name='" + rolename + "', avatar='" + shapeid + "', level='" + level + "'";
						int ret = stmt.executeUpdate(sqlstr);
						fire.pb.friends.Module.logger.info("[" + roleId + "]InsertMysqlRealtion:" + sqlstr + ";ret = " + ret);
						if(ret >= 0) {
							updateRet = true;
							if(ret == 1) {
								fire.pb.friends.Module.logger.warn("??????[" + roleId + "]??????mysql????????????,?????????????????????");
								//????????????????????????????????????????????????????????????????????????
								//mkdb.Procedure.pexecuteWhileCommit(new PSyncFriendsToMysql());
								Gs.getExecService().execute(new TSyncFriendsToMysql());
							} else if(ret == 2) {
								fire.pb.friends.Module.logger.info("??????[" + roleId + "]??????mysql??????ret=2.");
							} else if(ret == 3) {
								fire.pb.friends.Module.logger.info("??????[" + roleId + "]??????mysql????????????!");
							} else {
								fire.pb.friends.Module.logger.warn("??????[" + roleId + "]??????mysql?????????????????????ret=" + ret);
							}
						}
					} catch (SQLException ex) {
						ex.printStackTrace();
						if (stmt != null) {
							try {
								stmt.close();
							} catch (SQLException sqlEx) {
							}
							stmt = null;
						}
						C3P0Util.close(conn, null, null);
						return false;
					} finally {
						if (stmt != null) {
							try {
								stmt.close();
							} catch (SQLException sqlEx) {
							}
							stmt = null;
						}
					}
					C3P0Util.close(conn, null, null);
					return updateRet;
				}
				
				@Override
				public void run() {
					if(!InsertMysqlRelation(roleId, pro.getRolename(), pro.getShape(), pro.getLevel())){ //??????mysql????????????????????????????????????????????????
						StateManager.logger.error("[" + roleId + "]PreEntryState.InsertMysqlRelation failed!");
					}
				}
			});
//			mkdb.Procedure.pexecute(new mkdb.Procedure(){
//				private boolean InsertMysqlRelation(long roleId, String rolename, int shapeid, int level) {
//					boolean updateRet = false;
//					Connection conn = C3P0Util.getConnection();
//					Statement stmt = null;
//					try {
//						stmt = conn.createStatement();
//						//?????????????????????????????????????????????????????????????????????????????????
//						String sqlstr = "INSERT IGNORE INTO `role`(roleid, name, avatar, level) "
//								+ "VALUES ('" + roleId + "', '" + rolename + "', '" + shapeid + "', '" + level + "') ";
//						int ret = stmt.executeUpdate(sqlstr);
//						fire.pb.friends.Module.logger.info("[" + roleId + "]InsertMysqlRealtion:" + sqlstr + ";ret = " + ret);
//						if(ret >= 0) {
//							updateRet = true;
//							if(ret >= 1){
//								fire.pb.friends.Module.logger.warn("??????[" + roleId + "]??????mysql????????????,?????????????????????");
//								//????????????????????????????????????????????????????????????????????????
//								mkdb.Procedure.pexecuteWhileCommit(new PSyncFriendsToMysql());
//							}
//						}
//					} catch (SQLException ex) {
//						ex.printStackTrace();
//						if (stmt != null) {
//							try {
//								stmt.close();
//							} catch (SQLException sqlEx) {
//							}
//							stmt = null;
//						}
//						C3P0Util.close(conn, null, null);
//						return false;
//					} finally {
//						if (stmt != null) {
//							try {
//								stmt.close();
//							} catch (SQLException sqlEx) {
//							}
//							stmt = null;
//						}
//					}
//					C3P0Util.close(conn, null, null);
//					return updateRet;
//				}
//				
//				@Override
//				protected boolean process() {
//					if(!InsertMysqlRelation(roleId, pro.getRolename(), pro.getShape(), pro.getLevel())){ //??????mysql????????????????????????????????????????????????
//						StateManager.logger.error("[" + roleId + "]PreEntryState.InsertMysqlRelation failed!");
//						return false;
//					}
//					return true;
//				}
//			});
		}
		
		try {
			boolean sendip = FireProp.getBooleanValue("sys", "sys.send.loginip");
			if (sendip)
				mkdb.Procedure.pexecuteWhileCommit(new PSendLoginIp(roleId,	lastonline));
		} catch (Exception e) {
			StateManager.logger.error(new StringBuilder("roleId=").append(roleId).append(" ??????sys.send.loginip?????????"), e);
		}
		try {
			if (!DateValidate.inTheSameDay(pro.getSchemechangetimes(), time)) {
				pro.setSchemechangetimes(time);
				pro.setSchemechanges(0);
			}
		} catch (Exception e) {
			StateManager.logger.error(
					new StringBuilder("roleId=").append(roleId).append(" PCheckFortune?????????"), e);
		}
		// ??????roleId2userId
		xtable.Roleid2userid.remove(roleId);
		xtable.Roleid2userid.insert(roleId, userId);

		final SEnterWorld snd = new SEnterWorld();

		snd.mydata.roleid = this.roleId;
		snd.mydata.level = pro.getLevel();
		snd.mydata.rolename = pro.getRolename();
		snd.mydata.school = pro.getSchool();
		snd.mydata.rolecreatetime = pro.getCreatetime();
		snd.mydata.shape = pro.getShape();
		snd.mydata.title = pro.getTitle();
		if (pro.getCreatetime() == pro.getOfflinetime())
			snd.mydata.lastlogin = -1;
		else
			snd.mydata.lastlogin = lastonline;

		snd.mydata.hp = pro.getHp();
		snd.mydata.mp = pro.getMp();
		snd.mydata.sp = pro.getSp();
		final fire.pb.effect.RoleImpl erole = new fire.pb.effect.RoleImpl(
				roleId, true);

		// ??????????????????????????????
		BasicFightProperties bfp = pro.getBfp();

		snd.mydata.bfp.agi = (int)(erole.getAttrById(AttrType.AGI));
		snd.mydata.bfp.cons = (int)(erole.getAttrById(AttrType.CONS));
		snd.mydata.bfp.endu = (int)(erole.getAttrById(AttrType.ENDU));
		snd.mydata.bfp.iq = (int)(erole.getAttrById(AttrType.IQ));
		snd.mydata.bfp.str = (int)(erole.getAttrById(AttrType.STR));

		snd.mydata.bfp.agi_save.putAll(pro.getAddpointfp().getAgi_save());
		snd.mydata.bfp.cons_save.putAll(pro.getAddpointfp().getCons_save());
		snd.mydata.bfp.endu_save.putAll(pro.getAddpointfp().getEndu_save());
		snd.mydata.bfp.iq_save.putAll(pro.getAddpointfp().getIq_save());
		snd.mydata.bfp.str_save.putAll(pro.getAddpointfp().getStr_save());

		snd.mydata.point.putAll(pro.getPoint());
		snd.mydata.pointscheme = pro.getScheme();
		snd.mydata.schemechanges = pro.getSchemechanges();

		// ????????????
		snd.mydata.factionvalue = ClanUtils.getCurrentClanPoint(roleId);

		snd.mydata.petindex = pro.getFightpetkey();
		snd.mydata.showpet = pro.getShowpetkey();
		snd.mydata.uplimithp = erole.getUplimithp();
		snd.mydata.maxhp = erole.getMaxHp();
		snd.mydata.maxmp = erole.getMaxMp();
		snd.mydata.maxsp = erole.getMaxSp();
		snd.mydata.hit = (int) erole.getHit();
		snd.mydata.damage = erole.getAttack();
		snd.mydata.defend = erole.getDefend();
		snd.mydata.speed = erole.getSpeed();
		snd.mydata.dodge = (int) erole.getDodge();
		snd.mydata.magicattack = erole.getMagicAttack();
		snd.mydata.magicdef = erole.getMagicDef();
		snd.mydata.medical = (int) erole.getAttrById(AttrType.MEDICAL);
		snd.mydata.enlimit = erole.getEnlimit();
		snd.mydata.seal = (int) erole.getAttrById(AttrType.SEAL);
		snd.mydata.unseal = (int) erole.getAttrById(AttrType.UNSEAL);
		snd.mydata.phy_critc_level = (int) erole
				.getAttrById(AttrType.PHY_CRITC_LEVEL);
		snd.mydata.anti_phy_critc_level = (int) erole
				.getAttrById(AttrType.ANTI_PHY_CRITC_LEVEL);
		snd.mydata.magic_critc_level = (int) erole
				.getAttrById(AttrType.MAGIC_CRITC_LEVEL);
		snd.mydata.anti_magic_critc_level = (int) erole
				.getAttrById(AttrType.ANTI_MAGIC_CRITC_LEVEL);

		snd.mydata.phy_critc_pct = erole.getAttrById(AttrType.PHY_CRIT_PCT);
		snd.mydata.magic_critc_pct = erole.getAttrById(AttrType.MAGIC_CRIT_PCT);
		snd.mydata.heal_critc_level = (int) erole
				.getAttrById(AttrType.HEAL_CRIT_LEVEL);
		snd.mydata.heal_critc_pct = erole.getAttrById(AttrType.HEAL_CRIT_PCT);
		snd.mydata.anti_critc_level = (int) erole
				.getAttrById(AttrType.ANTI_CRIT_LEVEL);

		// ?????????????????????????????????
		snd.mydata.exp = pro.getExp();
		snd.mydata.nexp = erole.getNextExp();
		snd.mydata.kongzhijiacheng = 0;
		snd.mydata.kongzhimianyi = 0;
		snd.mydata.zhiliaojiashen = 0;
		snd.mydata.wulidikang = 0;
		snd.mydata.fashudikang = 0;
		snd.mydata.fashuchuantou = 0;
		snd.mydata.wulichuantou = 0;

		snd.mydata.energy = pro.getEnergy(); // ?????? by changhao
		snd.mydata.enlimit = LiveSkillManager.getInstance().CalcEnergyMaxLimit(pro.getLevel());

		// ????????????????????????
		snd.mydata.sysconfigmap.putAll(pro.getSysconfigmap());
		// ????????????????????????
		snd.mydata.lineconfigmap.putAll(pro.getLineconfigmap());
		
		Set<Integer> set = pro.getFormationsmap().keySet();
		if (set.size() > 0) {
			for (int formId : set) {
				xbean.FormBean bean = pro.getFormationsmap().get(formId);
				fire.pb.FormBean temp = new fire.pb.FormBean();
				temp.activetimes = bean.getActivetimes();
				temp.level = bean.getLevel();
				temp.exp = bean.getExp();
				snd.mydata.learnedformsmap.put(formId, temp);
			}
		}

		fire.pb.map.Role.getPlayerComponents(roleId, snd.mydata.components);

		RoleLiveness actrole = RoleLiveness.getRoleLiveness(roleId);
		if (actrole != null) {
			snd.mydata.activeness = new Float(actrole.getLiveness()).intValue();
		}

		// ?????????????????????
		fire.pb.title.TitleInfo curtitleinfo = null;

		// ??????????????????????????????????????????????????????????????????
		// ????????????????????????
		List<Integer> titleIds = new ArrayList<Integer>();
		for (xbean.TitleInfo titleinfo : pro.getTitles().values()) {
			if(ischangeclan){
				//????????????????????????????????????
				if(fire.pb.clan.Constant.isClanTitle(titleinfo.getTitleid())){
					titleIds.add(titleinfo.getTitleid());
				}
			}
			if (titleinfo.getAvailtime() > 0)
				if (titleinfo.getAvailtime() < time)
					titleIds.add(titleinfo.getTitleid());
		}
		for (Integer titleid : titleIds) {
			mkdb.Procedure.pexecuteWhileCommit(new PRemoveTitleProc(roleId,	titleid));
		}
		if (pro.getTitles() != null) {
			xbean.TitleInfo curinfo = pro.getTitles().get(pro.getTitle());
			//?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
			if (curinfo != null) {
				if(!(curinfo.getAvailtime() > 0&&curinfo.getAvailtime() < time)){
					curtitleinfo = new fire.pb.title.TitleInfo();
					curtitleinfo.titleid = curinfo.getTitleid();
					curtitleinfo.name = curinfo.getTitlename();
					curtitleinfo.availtime = curinfo.getAvailtime();
				}
			}
			for (xbean.TitleInfo titleinfo : pro.getTitles().values()) {
				if(titleinfo.getAvailtime() > 0&&titleinfo.getAvailtime() < time){
					continue;
				}
				fire.pb.title.TitleInfo info = new fire.pb.title.TitleInfo();
				info.titleid = titleinfo.getTitleid();
				info.name = titleinfo.getTitlename();
				info.availtime = titleinfo.getAvailtime();
				snd.mydata.titles.put(info.titleid, info);
				//????????????????????????????????????????????????
				Title.titleroleids.put(roleId, roleId);
			}
		}

		// ??????????????????
		final PetColumn petcol = new PetColumn(roleId, PetColumnTypes.PET, true);
		snd.mydata.pets = petcol.getAllProtocolPets();
		snd.mydata.petmaxnum = petcol.getCapacity();

		// ??????????????????
		final fire.pb.item.Module itemmodule = (fire.pb.item.Module) fire.pb.main.ModuleManager
				.getInstance().getModuleByName("item");
		StateManager.logger.info(new StringBuilder("roleId=").append(roleId).append(" KKK11???").append(this.getClass()));
		if (itemmodule != null) {
			StateManager.logger.info(new StringBuilder("roleId=").append(roleId).append(" KKK22???").append(this.getClass()));
			snd.mydata.baginfo = itemmodule.getItemManager().getLoginPackInfo(roleId);
		}
		StateManager.logger.info(new StringBuilder("roleId=").append(roleId).append(" KKK33???").append(this.getClass()));
		
		// ??????????????????
		snd.mydata.depotnameinfo.putAll(pro.getDepotnameinfo());
		
		// ???????????????SEnterWorld
		gnet.link.Onlines.getInstance().send(roleId, snd);
		StateManager.logger.info(new StringBuilder("End sendEnterWorld roleId=").append(roleId)
				.append(",").append(this.getClass()));

		HashMap<Integer, Float> needSendAttr = new HashMap<Integer, Float>(); // ?????????????????????????????????
																				// by
																				// changhao

		java.util.List<Integer> attrlist = fire.pb.effect.Module.getInstance().getNeedSendAttrIds();
		if (attrlist != null) {
			for (Integer attrid : attrlist) {
				Integer attr = attrid;

				// ???????????????????????????????????????????????? by changhao
				if (attr == AttrType.PHY_CRITC_LEVEL
						|| attr == AttrType.ANTI_PHY_CRITC_LEVEL
						|| attr == AttrType.MAGIC_CRITC_LEVEL
						|| attr == AttrType.ANTI_MAGIC_CRITC_LEVEL
						|| attr == AttrType.PHY_CRIT_PCT
						|| attr == AttrType.MAGIC_CRIT_PCT
						|| attr == AttrType.HEAL_CRIT_LEVEL
						|| attr == AttrType.HEAL_CRIT_PCT
						|| attr == AttrType.ANTI_CRIT_LEVEL
						|| attr == AttrType.SEAL || attr == AttrType.UNSEAL
						|| attr == AttrType.MEDICAL || attr == AttrType.MAX_MP
						|| attr == AttrType.MAX_HP || attr == AttrType.HP
						|| attr == AttrType.MP || attr == AttrType.SP
						|| attr == AttrType.MAX_SP || attr == AttrType.CONS
						|| attr == AttrType.IQ || attr == AttrType.STR
						|| attr == AttrType.ENDU || attr == AttrType.AGI
						|| attr == AttrType.DEFEND || attr == AttrType.ATTACK
						|| attr == AttrType.MAGIC_ATTACK
						|| attr == AttrType.MAGIC_DEF || attr == AttrType.SPEED
						|| attr == AttrType.HIT_RATE
						|| attr == AttrType.DODGE_RATE
						|| attr == AttrType.UP_LIMITED_HP)
					continue;

				float v = erole.getAttrById(attr);
				needSendAttr.put(attr, v);
			}
		}

		if (needSendAttr.size() > 0) {
			mkdb.Procedure.psendWhileCommit(roleId, new SRefreshRoleData(needSendAttr));
		}
		//??????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PFunOpenClose(roleId));
		
		sendGEnterWorld(pro, petcol, snd.mydata.components);

		// ??????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(ClanManage.sendClanRedTip(roleId));//????????????????????????roleid???????????????????????????
		
		if (!fire.pb.util.DateValidate.inTheSameMonth(pro.getOfflinetime(), time)) {
			mkdb.Procedure.pexecuteWhileCommit(new fire.pb.fushi.PAddVipSuppRegNum(roleId));
		}

		afterEnterWorld(roleId, userId);

		mkdb.Procedure.pexecuteWhileCommit(new PRefreshLoginHookDataProc(roleId, lastonline));
		// ??????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PCalcYingFuExpProc(roleId));
		
		PEquipRideProc.updateRideMsg(roleId);;
		
		//??????1??????5?????????,???????????? by changhao
		mkdb.Executor.getInstance().schedule(new Runnable()
		{
			@Override
			public void run()
			{
				new fire.pb.PCheckKick(roleId).submit();					
			}
		}, 10, TimeUnit.MILLISECONDS);		
	}

	protected void afterEnterWorld(final long roleId, final int userId) {

		// ?????????????????????????????????????????????????????????
		new PAfterEnterWorld(userId, roleId).call();
		// ??????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PFriendsInfoInit(roleId));

		// ??????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new fire.pb.PLoginDayUpdatesProc(roleId));
		// ??????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PLoginWeekUpdatesProc(roleId));

		// ??????????????????
		mkdb.Procedure.pexecuteWhileCommit(new POnlineBegin(roleId, true));

		mkdb.Procedure.pexecuteWhileCommit(new PSendFairylandMission(roleId));
		// ????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PClearWinnerTask(roleId));
		// cn ???????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new fire.pb.skill.PRoleOnline(roleId));
		mkdb.Procedure.pexecuteWhileCommit(new fire.pb.talk.BroadcastSysMsg.PSendSysMsgWhileOnline(roleId));
		// ??????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new fire.pb.clan.PUpdateMemberDataProc(roleId));
		// ???????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PUpdateRoleLock(roleId));

		// ????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PSendBlackRolesProc(roleId));

		// ????????????????????????,????????????????????????platformuid
		mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure() {
			public boolean process() {
				String oldPlatformuid = xtable.Properties.selectPlatformuid(roleId);
				if (oldPlatformuid != null && oldPlatformuid.endsWith("apps")) {
					String platformuid = xtable.Auuserinfo.selectUsername(userId);
					xbean.Properties properties = xtable.Properties.get(roleId);
					properties.setPlatformuid(platformuid);
				}
				return true;
			}
		});
		mkdb.Procedure.pexecuteWhileCommit(new PCoinToNum(userId));

		// ???????????????????????????,????????????
		TimingRewardAssistant.sendTimingRewardMsg(roleId);

		// ??????????????????
		mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure() {
			public boolean process() {
				MulDayLogin.online(roleId);
				return true;
			}
		});
		mkdb.Procedure.pexecuteWhileCommit(new PMasterOnLineProc(roleId));

		mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure() {
			public boolean process() {
				final fire.pb.effect.RoleImpl erole = new fire.pb.effect.RoleImpl(
						roleId, true);
				SAddPointAttrData sendAddPointData = new SAddPointAttrData();
				sendAddPointData.max_hp = erole.getAttrById(AttrType.MAX_HP);
				sendAddPointData.max_mp = erole.getAttrById(AttrType.MAX_MP);
				sendAddPointData.attack = erole.getAttrById(AttrType.ATTACK);
				sendAddPointData.defend = erole.getAttrById(AttrType.DEFEND);
				sendAddPointData.magic_attack = erole
						.getAttrById(AttrType.MAGIC_ATTACK);
				sendAddPointData.magic_def = erole
						.getAttrById(AttrType.MAGIC_DEF);
				sendAddPointData.speed = erole.getAttrById(AttrType.SPEED);

				mkdb.Procedure.psendWhileCommit(roleId, sendAddPointData);
				return true;
			}
		});

		mkdb.Procedure.pexecuteWhileCommit(new PRoleZongheRankProc(roleId));
		// ????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure() {
			public boolean process() {
				PropRole prole = new PropRole(roleId, true);
				SRefreshRoleScore send = new SRefreshRoleScore();
				send.datas.put(SRefreshRoleScore.TOTAL_SCORE, prole
						.getProperties().getRolezonghemaxscore());
				send.datas.put(SRefreshRoleScore.EQUIP_SCORE, prole
						.getProperties().getEquipscore());
				send.datas.put(SRefreshRoleScore.MANY_PET_SCORE, prole
						.getProperties().getManypetscore());
				send.datas.put(SRefreshRoleScore.PET_SCORE, prole
						.getProperties().getPetscore());
				send.datas.put(SRefreshRoleScore.LEVEL_SCORE, prole
						.getProperties().getLevelscore());
				send.datas.put(SRefreshRoleScore.ROLE_SCORE, prole
						.getProperties().getRolescore());
				send.datas.put(SRefreshRoleScore.XIULIAN_SCORE, prole
						.getProperties().getXiulianscroe());
				send.datas.put(SRefreshRoleScore.SKILL_SCORE, prole
						.getProperties().getSkillscore());

				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		});

		// ????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure() {
			public boolean process() {
				fire.pb.item.Pack bag = new fire.pb.item.Pack(roleId, true);

				SRefreshRoleCurrency send = new SRefreshRoleCurrency();
				xbean.RoleClanPoint roleCon = ClanUtils.getRoleClanPoint(roleId, true);
				if (roleCon != null) {
					send.datas.put(RoleCurrency.GUILD_DED,(long) roleCon.getCurrentclanpoint());
				}
				send.datas.put(RoleCurrency.TEACHER_SCORE,
						bag.getCurrency(MoneyType.MoneyType_GoodTeacherVal));
				send.datas.put(RoleCurrency.ACTIVE_SCORE,
						bag.getCurrency(MoneyType.MoneyType_Activity));
				send.datas.put(RoleCurrency.HONOR_SCORE,
						bag.getCurrency(MoneyType.MoneyType_RongYu));
				send.datas.put(RoleCurrency.POP_SCORE,
						bag.getCurrency(MoneyType.MoneyType_ShengWang));
				send.datas.put(RoleCurrency.PROF_CONTR,
						bag.getCurrency(MoneyType.MoneyType_ProfContribute));
				send.datas.put(RoleCurrency.EREDITPOINT_SCORE,
						bag.getCurrency(MoneyType.MoneyType_EreditPoint));
				
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		});
		
		//??????????????????????????????????????????????????????????????????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(new PLiveDieBattleLoginTip(roleId));
		
		//?????????????????????????????????????????????
		mkdb.Procedure.pexecuteWhileCommit(SpotCheckManage.sendTradingOpenStateLogin(roleId));
		
		//???????????????????????????????????????
		if (Gs.isMergeServer()) {
			mkdb.Procedure.pexecuteWhileCommit(new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					// ???????????????????????????????????????????????????????????????
					Integer val = xtable.Takebackmarketcontainertab.select(roleId);
					if (val != null) // ?????????????????????
						return false;
					MarketManager.getInstance().sendTempMarketContainer(roleId);
					return true;
				}
			});
		}
	}

	protected void sendGEnterWorld(xbean.Properties pro, PetColumn petcol,
			Map<Byte, Integer> components) {

		fire.msp.GEnterWorld gsnd = new fire.msp.GEnterWorld();
		gsnd.mode.modeid = pro.getShape();
		gsnd.mode.transformid = fire.pb.mission.UtilHelper
				.getTransformid(roleId);
		gsnd.mode.follownpc = fire.pb.mission.UtilHelper.getFollowid(roleId);
		gsnd.level = pro.getLevel();
		gsnd.components.putAll(components);
		gsnd.protect = (getState() == State.BREAK_OFFLINE_PROTECT_STATE || getState() == State.BREAK_TRUSTEESHIP_STATE) ? 1
				: 0;

		gsnd.roleid = roleId;
		gsnd.rolename = pro.getRolename();
		gsnd.mapinfo.sceneid = pro.getSceneid();
		gsnd.mapinfo.posx = pro.getPosx();
		gsnd.mapinfo.posy = pro.getPosy();
		gsnd.mapinfo.posz = pro.getPosz();
		gsnd.laststaticmapinfo.sceneid = pro.getLaststaticsceneid();
		gsnd.laststaticmapinfo.posx = pro.getLaststaticposx();
		gsnd.laststaticmapinfo.posy = pro.getLaststaticposy();
		gsnd.laststaticmapinfo.posz = pro.getLaststaticposz();
		gsnd.schoolid = pro.getSchool();
		gsnd.scenestate = getSceneState(pro.getUserid());// ????????????
		gsnd.equipeffect = pro.getEquipeffect();
		Integer maxScreenShowNum = pro.getSysconfigmap().get(
				SysConfigType.MaxScreenShowNum);
		if (maxScreenShowNum == null)
			maxScreenShowNum = FireProp.getIntValue("sys",
					"sys.maxScreenShowNum");
		gsnd.showrolenum = maxScreenShowNum;
		// ????????????
		final Pet pet = petcol.getPet(pro.getShowpetkey());
		if (null != pet) {
			gsnd.showpet = pet.getShowPetInfo();
			petcol.addShowSkillBuff();
		}
		// ??????
		xbean.TitleInfo curTitleInfo = pro.getTitles().get(pro.getTitle());
		if (null != curTitleInfo) {
			long now = java.util.Calendar.getInstance().getTimeInMillis();
			if (curTitleInfo.getAvailtime() < 0) {
				gsnd.title.validtime = -1;
			} else {
				if (curTitleInfo.getAvailtime() > now) {
					gsnd.title.validtime = curTitleInfo.getAvailtime() - now;
				}
			}
			gsnd.title.titleid = curTitleInfo.getTitleid();
			gsnd.title.titlename = curTitleInfo.getTitlename();
		}

		GsClient.pSendWhileCommit(gsnd);
	}

	private int getSceneState(int useid) {
		BuffRoleImpl buffrole = new BuffRoleImpl(roleId);
		int scenestate = buffrole.getAllSceneState();// ????????????

		// ???????????????gm??????
		if (GMInteface.gmPriv(useid)) {
			scenestate = scenestate | SceneState.GM_FLAG;
		}

		// ????????????????????????
		if (fire.pb.buff.Module.existState(roleId,
				BuffConstant.StateType.STATE_BATTLE_FIGHTER))
			scenestate = scenestate | SceneState.BATTLE_FIGHTER;

		return scenestate;
	}

	@Override
	public boolean trigger(int trigger) {

		if (trigger == State.TRIGGER_PROCESS_DONE)
			return new EntryState(roleId).enter(trigger);
		triggerErrorLog(trigger);
		return false;
	}

	@Override
	public int getState() {

		return State.PRE_ENTRY_STATE;
	}

}

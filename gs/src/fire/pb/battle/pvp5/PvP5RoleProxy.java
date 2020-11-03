package fire.pb.battle.pvp5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mkdb.Transaction;
import fire.pb.PAddExpProc;
import fire.pb.activity.award.RewardMgr;
import fire.pb.battle.pvp.PvPHelper;
import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.map.Transfer;
import fire.pb.mission.activelist.RoleLiveness;
import fire.pb.move.SRoleEnterScene;
import fire.pb.talk.MessageMgr;
import fire.pb.team.PQuitTeamProc;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.util.StringConstant;

/**
 * 5v5角色代理
 * @author XGM
 */
public class PvP5RoleProxy {

	/**
	 * 获取PvP角色的代理
	 * @param roleId
	 * @param readonly
	 * @return
	 */
	public static PvP5RoleProxy getPvP5RoleProxy(long roleId, boolean readonly) {

		xbean.PvP5Role xpvprole = null;
		if (readonly) {
			xpvprole = xtable.Pvp5roles.select(roleId);
		} else {
			xpvprole = xtable.Pvp5roles.get(roleId);
		}

		if(xpvprole == null) {
			if (readonly) {
				xpvprole = xbean.Pod.newPvP5RoleData();
			} else {
				xpvprole = xbean.Pod.newPvP5Role();
				xtable.Pvp5roles.insert(roleId, xpvprole);
			}
		}
		return new PvP5RoleProxy(roleId, xpvprole, readonly);
	}

	private final long roleId;
	private xbean.PvP5Role xpvprole;
	private final boolean readonly;

	/**
	 * 构造
	 * @param roleId
	 * @param xpvprole
	 * @param readonly
	 */
	public PvP5RoleProxy(long roleId, xbean.PvP5Role xpvprole, boolean readonly) {
		this.roleId = roleId;
		this.xpvprole = xpvprole;
		this.readonly = readonly;
	}

	/**
	 * 清空战斗记录
	 */
	public void clearBattleInfo() {
		xpvprole.setBattlenum(0);
		xpvprole.setWinnum(0);
		xpvprole.setContinuewinnum(0);
		xpvprole.setFirstwinaward(0);
		xpvprole.setFivebattleaward(0);
	}

	/**
	 * 获得角色ID
	 * @return
	 */
	public long getRoleId() {
		return roleId;
	}

	/**
	 * 获得此记录所属的赛级
	 * @return
	 */
	public int getGrade() {
		return xpvprole.getGrade();
	}

	/**
	 * 获得阵营
	 * @return
	 */
	public int getCamp() {
		return xpvprole.getCamp();
	}

	/**
	 * 获得优胜场标示
	 * @return
	 */
	public int getExcellent() {
		return xpvprole.getExcellent();
	}

	/**
	 * 获得积分
	 * @return
	 */
	public int getScore() {
		return xpvprole.getScore();
	}

	/**
	 * 根据积分取得等级
	 * @return
	 */
	public int getScoreLevel() {
		return PvPHelper.getScoreLevel(getScore());
	}

	/**
	 * 获得战斗次数
	 * @return
	 */
	public int getBattleNum() {
		return xpvprole.getBattlenum();
	}

	/**
	 * 获得赢的次数
	 * @return
	 */
	public int getWinNum() {
		return xpvprole.getWinnum();
	}

	/**
	 * 获得连胜次数
	 * @return
	 */
	public int getContinueWinNum() {
		return xpvprole.getContinuewinnum();
	}

	/**
	 * 获得上次战斗结束的时间
	 * @return
	 */
	public long getLastBattleTime() {
		return xpvprole.getLastbattletime();
	}

	/**
	 * 获得上次进入赛场时间
	 * @return
	 */
	public long getLastEnterTime() {
		return xpvprole.getLastentertime();
	}

	/**
	 * 是否参加今天的活动
	 * @return
	 */
	public boolean isTodayJoinActivity() {
		return PvP5Control.getInstance().isActivityTime(xpvprole.getLastentertime());
	}

	/**
	 * 获得当前活动中的赛级
	 * @return
	 */
	public int getGradeInActivity() {

		// 如果活动还在进行中就返回赛级
		if (PvP5Control.getInstance().isActivityTime(xpvprole.getLastentertime())) {
			if (xpvprole.getGrade() > 0) {
				return xpvprole.getGrade();
			}
		}
		return -1;
	}

	/**
	 * 响应入场
	 * @param grade
	 */
	public void onEnter(int grade, int mapId) {

		// 是不是活动开始后首次进入
		boolean isFirst = false;

		long now = System.currentTimeMillis();
		if (PvP5Control.getInstance().isActivityTime(xpvprole.getLastentertime()) == false) {
			// 清空上次活动的信息
			clearBattleInfo();
			xpvprole.setLastbattletime(0);
			xpvprole.setScore(0);
			isFirst = true;
		}

		int camp = PvP5Helper.getCampByMapId(mapId);
		int excellent = PvP5Helper.getExcellentByMapId(mapId);

		xpvprole.setGrade(grade);
		xpvprole.setCamp(camp);
		xpvprole.setExcellent(excellent);
		xpvprole.setLastentertime(now);

		// 首次进入提示
		if (isFirst) {
			if (excellent == 1) {
				// 分配到优胜场的提示
				List<String> strings = new LinkedList<String>();
				strings.add(PvP5Helper.getGradeName(grade));
				strings.add(PvP5Helper.getCampName(camp));
				MessageMgr.psendMsgNotifyWhileCommit(roleId, 172029, strings);
			} else {
				// 分配到普通场的提示
				MessageMgr.psendMsgNotifyWhileCommit(roleId, 172034, null);
			}
			// 增加阵营人数
			PvP5CampPolicy.addRoleNumByCamp(grade, camp);
		}
	}

	/**
	 * 增加积分
	 * @param addValue
	 * @return
	 */
	public int addScore(int addValue, boolean levelUp) {
		onAddScore(addValue);
		return addValue;
	}

	/**
	 * 增加积分
	 * @param addValue
	 * @return
	 */
	private void onAddScore(int addValue) {
		int lastScore = getScore();
		xpvprole.setScore(lastScore + addValue);
	}

	/**
	 * 战斗结束的结果处理
	 * @param isWin
	 * @param enemyId
	 * @param addScore
	 * @param race
	 */
	public void onBattleEnd(boolean isWin, long enemyId, int addScore, PvP5RaceProxy race) {

		if (readonly)
			throw new UnsupportedOperationException("If readonly then cant invoke 5v5 onBattleEnd");

		if (race.getXRace() == null)
			return;

		long now = System.currentTimeMillis();
		xpvprole.setLastbattletime(now);
		xpvprole.setLastentertime(now);

		if (isWin) {
			xpvprole.setWinnum(xpvprole.getWinnum() + 1);
			xpvprole.setContinuewinnum(Math.min(PvP5Helper.RACE_MAX_BATTLE_NUM, xpvprole.getContinuewinnum() + 1));
			if (xpvprole.getWinnum() == 1 && xpvprole.getFirstwinaward() == 0) {
				xpvprole.setFirstwinaward(1); // 首胜
			}
		} else {
			xpvprole.setContinuewinnum(0);
		}

		xpvprole.setBattlenum(xpvprole.getBattlenum() + 1);
		if (xpvprole.getBattlenum() == 5 && xpvprole.getFivebattleaward() == 0) {
			xpvprole.setFivebattleaward(1); // 五战
		}

		// 增加活动计数
		RoleLiveness activeRole = RoleLiveness.getRoleLiveness(roleId);
		if (activeRole != null) {
			activeRole.handleActiveLivenessData(RoleLiveness.PVP5);
		}
		
		fire.pb.course.CourseManager.achieveCourse(roleId, fire.pb.course.CourseType.ACTIVE_COURSE, RoleLiveness.PVP5, 0);

		// 更新积分排行榜
		String roleName = xtable.Properties.selectRolename(roleId);
		race.updateRankingList(roleId, roleName, addScore, xpvprole.getScore(), xpvprole.getBattlenum(), xpvprole.getWinnum());

		// 发送刷新协议
		sendSPvP5MyInfo(now);
		//race.sendSPvP5RankingList(roleId); 排行榜需要单独请求 [4/18/2016 XGM]

		// 优胜场输2次掉到普通场
		if (isWin == false) {
			if (getExcellent() == 1) {
				if (getBattleNum() - getWinNum() >= PvP5Helper.DROP_SCENE_BATTLE_LOSE_NUM) {
					dropGeneralScene();
				}
			}
		}

		if (PvP5Control.getLogger().isInfoEnabled()) {
			PvP5Control.getLogger().info("PVP5::[PvP5RoleProxy.onBattleEnd] roleId:" + roleId
					+ " isWin:" + isWin
					+ " enemyId:" + enemyId
					+ " addScore:" + addScore
					+ " score:" + xpvprole.getScore()
					+ " continueWinNum:" + xpvprole.getContinuewinnum()
					+ " winNum:" + xpvprole.getWinnum()
					+ " battleNum:" + xpvprole.getBattlenum());
		}
	}

	/**
	 * 掉到普通场
	 */
	private void dropGeneralScene() {

		if (PvP5Control.getInstance().isFightTime() == false) {
			return;
		}

		final int grade = getGrade();
		final int camp = getCamp();
		mkdb.Procedure proc = new mkdb.Procedure() {
			@Override
			protected boolean process() {
				int mapId = PvP5Helper.getMapIdByRaceGrade(grade, false, camp);
				new PQuitTeamProc(roleId).call();
				MapConfig mapConf = ConfigManager.getInstance().getConf(MapConfig.class).get(mapId);
				Transfer.justGotoDeltaWhileCommit(roleId, mapId, mapConf.getXjPos(), mapConf.getYjPos(), SRoleEnterScene.CHEFU, 10);
				return true;
			}
		};
		mkdb.Procedure.pexecuteWhileCommit(proc);

		// 提示自己失败2次掉入普通场
		MessageMgr.sendMsgNotify(roleId, 172023, null);
		List<Long> ids = getTeamMemberIds(roleId);
		ids.remove((Long)roleId);
		if (ids.size() > 0) {
			// 提示队员自己掉入普通场
			String roleName = xtable.Properties.selectRolename(roleId);
			mkdb.Procedure.psendWhileCommit(ids, MessageMgr.getMsgNotify(172024, 0, MessageMgr.getStringList(roleName)));
		}
	}

	/**
	 * 发送自己的信息
	 * @param waitStartTime
	 */
	public void sendSPvP5MyInfo(long waitStartTime) {

		SPvP5MyInfo snd = new SPvP5MyInfo();
		snd.firstwin = (byte) xpvprole.getFirstwinaward();
		snd.fivefight = (byte) xpvprole.getFivebattleaward();
		snd.battlenum = (byte) xpvprole.getBattlenum();
		snd.winnum = (byte) xpvprole.getWinnum();
		snd.combowinnum = (byte) xpvprole.getContinuewinnum();
		snd.score = xpvprole.getScore();
		snd.camp = (byte) xpvprole.getCamp();
		snd.waitstarttime = waitStartTime / 1000;

		if (Transaction.current() != null) {
			mkdb.Procedure.psendWhileCommit(roleId, snd);
		} else {
			gnet.link.Onlines.getInstance().send(roleId, snd);
		}
	}

	/**
	 * 打开箱子
	 * @param boxType
	 * @return
	 */
	public boolean openBox(int boxType) {

		switch (boxType) {
		case 1:// 首胜
			if (xpvprole.getFirstwinaward() != 1) {
				if (xpvprole.getFirstwinaward() == 0)
					MessageMgr.sendMsgNotify(roleId, 160342, MessageMgr.getStringList(StringConstant.ID2String("首胜奖励", 304)));
				else
					MessageMgr.sendMsgNotify(roleId, 172000, MessageMgr.getStringList(StringConstant.ID2String("首胜奖励", 304)));
				return false;
			}

			// 发首胜奖励
			RewardMgr.getInstance().distributeAllAward(roleId, PvP5Helper.FIRST_WIN_AWARD_ID, null,
					fire.log.enums.YYLoggerTuJingEnum.tujing_Value_PVP5, 0, PAddExpProc.OTHER_QUEST, "首胜奖励");

			xpvprole.setFirstwinaward(2);
			mkdb.Procedure.psendWhileCommit(roleId, new SPvP5OpenBoxState((byte) 1, (byte) 2));

			// 记录日志
			if (PvP5Control.getLogger().isInfoEnabled()) {
				PvP5Control.getLogger().info("PVP5::[PvP5RoleProxy.openBox] roleId:" + roleId
						+ " boxType:" + boxType
						+ " firstWinAwardId:" + PvP5Helper.FIRST_WIN_AWARD_ID);
			}
			return true;

		case 2:// 五战
			if (xpvprole.getFivebattleaward() != 1) {
				if (xpvprole.getFivebattleaward() == 0)
					MessageMgr.sendMsgNotify(roleId, 160342, MessageMgr.getStringList(StringConstant.ID2String("五战奖励", 306)));
				else
					MessageMgr.sendMsgNotify(roleId, 172000, MessageMgr.getStringList(StringConstant.ID2String("五战奖励", 306)));
				return false;
			}

			// 发五战奖励
			RewardMgr.getInstance().distributeAllAward(roleId, PvP5Helper.FIVE_FIGHT_AWARD_ID, null,
					fire.log.enums.YYLoggerTuJingEnum.tujing_Value_PVP5, 0, PAddExpProc.OTHER_QUEST, "五战奖励");

			mkdb.Procedure.psendWhileCommit(roleId, new SPvP5OpenBoxState((byte) 2, (byte) 2));
			xpvprole.setFivebattleaward(2);

			// 记录日志
			if (PvP5Control.getLogger().isInfoEnabled()) {
				PvP5Control.getLogger().info("PVP5::[PvP5RoleProxy.openBox] roleId:" + roleId
						+ " boxType:" + boxType
						+ " tenFightAwardId:" + PvP5Helper.FIVE_FIGHT_AWARD_ID);
			}
			return true;
		}
		return false;
	}

	/**
	 * 获取队伍成员,如果没有队伍就填充自己
	 * @param roleId
	 * @return
	 */
	public static List<Long> getTeamMemberIds(long roleId) {

		Team team = TeamManager.selectTeamByRoleId(roleId);
		if (team != null) {
			return team.getNormalMemberIds();
		}

		List<Long> ids = new ArrayList<Long>();
		ids.add(roleId);
		return ids;
	}

	/**
	 * 发送消息给队伍里所有人,如果没有队伍就发送给自己
	 * @param roleId
	 * @param send
	 */
	public static void notifyTeamProtocol(long roleId, mkio.Protocol send) {

		List<Long> ids = getTeamMemberIds(roleId);
		mkdb.Procedure.psendWhileCommit(ids, send);
	}

	/**
	 * 设置队伍成员的PVP状态
	 * @param roleId
	 * @param state
	 */
	public static void setTeamMemberPvPState(long roleId, int state) {

		List<Long> ids = getTeamMemberIds(roleId);
		for (long id : ids) {
			PvP5RoleStateManager.getInstance().setRolePvPState(id, state);
		}
	}
}

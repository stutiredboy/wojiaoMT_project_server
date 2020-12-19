
package fire.pb.battle.livedie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fire.pb.PropRole;
import fire.pb.StateCommon;
import fire.pb.battle.pvp.PvPHelperManager;
import fire.pb.buff.BuffAgent;
import fire.pb.buff.BuffConstant;
import fire.pb.buff.BuffRoleImpl;
import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.talk.MessageMgr;
import fire.pb.team.PAbsentReturnTeam;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;
import fire.pb.title.COffTitle;
import fire.pb.util.MessageUtil;

import org.apache.log4j.Logger;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptLiveDieBattle extends __CAcceptLiveDieBattle__ {
	@Override
	protected void process() {
		// npc澶勫簲鎴樺紑鎴?
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//鍒ゆ柇涓嬫垬涔︾殑浜烘槸鍚﹀瓨鍦?
		Long hostid=xtable.Livedie2key.select(guestid);
		//鍒ゆ柇鏄惁鏈変笅鎴樹功鐨勪汉
		if(hostid==null){
			//鎻愮ず娌℃湁缁欎綘涓嬫垬涔︾殑浜?162079
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162079, null);
			return ;
		}
		//鑾峰緱涓嬫垬涔︿俊鎭紝鍒ゆ柇鏄惁杩囨湡
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			logger.info("鎴樹功宸茬粡杩囨湡浜?");
			return ;
		}
		
		//鍒ゆ柇鐜╁鏄惁鍦ㄧ嚎
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		//鍒ゆ柇鑷繁鏄惁鍦ㄥ壇鏈紝鍦ㄥ壇鏈棤娉曞彂閫佽姹?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162002, null);
			return ;
		}
		xbean.Properties guestprop=xtable.Properties.select(guestid);
		//绔炴妧鍦哄湴鍥炬棤娉?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162121, null);
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162130, Arrays.asList(guestprop.getRolename()));
			return ;
		}
		//鍒ゆ柇涓嬫垬涔︾殑鐜╁鏄惁鍦ㄦ垬鏂楁垨鑰呰鎴?
		BuffAgent hostAgent = new BuffRoleImpl(hostid, true);
		if (hostAgent.existBuff(BuffConstant.StateType.STATE_REPLAY)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_FIGHTER)||hostAgent.existBuff(BuffConstant.StateType.STATE_BATTLE_WATCHER)) {
			MessageMgr.sendMsgNotify(guestid, 162132, null);
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162130, Arrays.asList(guestprop.getRolename()));
			return ;
		}
		if (hostAgent.existBuff(500343)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 144999, 0, null);
			return ;
		}
		//鍒ゆ柇瀵规柟鏄惁鍦ㄧ嚎
		if (!StateCommon.isOnlineBuffer(hostid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		int isteamfight=0;
		
		//鍒ゆ柇鎴樻枟绫诲瀷锛屾槸缁勯槦杩樻槸鍗曚汉
		if(hostliveDieRoleInfo.getSelecttype()==1){//缁勯槦
			isteamfight=1;
			//濡傛灉鏄粍闃燂紝闇?瑕佸垽鏂綋鍓嶉槦浼嶆槸鍚﹂兘鏄槦闀?
			//缁勯槦鍐虫枟,鍙戣捣浜轰笉鏄槦闀挎椂,鎺ュ彈浜虹偣鍑诲紑鎴?,鎺ュ彈浜轰細鎻愮ず鍙戣捣浜轰笉鏄槦闀?,鍙戣捣浜轰細鎻愮ず鎺ュ彈浜哄凡缁忔帴鍙楀喅鏂?,璇锋垚涓洪槦闀?
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam==null){
				//鎻愮ず鍙戣捣浜猴紝鎴愪负闃熼暱
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			if(hostteam.getTeamLeaderId()!=hostid){
				//鎻愮ず鍙戣捣浜猴紝鎴愪负闃熼暱
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			//鍒ゆ柇闃熶紞涓殑鎴愬憳鏄惁绗﹀悎瑕佹眰
			if(isTeamCanFight(hostteam,hostid)==false){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			if(guestteam==null){
				//涓嶆槸闃熼暱锛屾棤娉曞簲鎴?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//鍒ゆ柇鏄惁鏄槦闀?
			if(guestteam.getTeamLeaderId()!=guestid){
				//涓嶆槸闃熼暱锛屾棤娉曞簲鎴?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//鍒ゆ柇闃熶紞涓殑鎴愬憳鏄惁绗﹀悎瑕佹眰
			if(isTeamCanFight(guestteam,guestid)==false){
				return ;
			}
			//濡傛灉鏈夐槦浼嶏紝鏆傜鐘舵?佷篃涓嶈兘寮?鎴?
			if(hostteam.getAbsentMemberIds().contains(hostid)){
				//鎻愮ず鍙戣捣浜猴紝鎴愪负闃熼暱
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162080, null);
				return ;
			}
			if(guestteam.getAbsentMemberIds().contains(guestid)){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			
		}else{
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			if(guestteam!=null){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162112, null);
				return ;
			}
			//鍗曚汉鎴樹功蹇呴』閮芥槸鍗曚汉鎵嶈兘鍙傚姞
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam!=null&&hostteam.getFighterMemberIds().contains(hostid)){
				//鐩存帴鎶婄洰鏍囩帺瀹舵殏绂讳簡
				//濡傛灉鏈夐槦浼嶅氨鏆傜闃熶紞
				new PAbsentReturnTeam(hostid, 1).submit();
			}
		}

		new PLiveDieBattle(hostid,guestid,isteamfight).submit();
		
	}
	
	/**
	 * 鍒ゆ柇闃熶紞涓殑鎴愬憳鏄惁绗﹀悎瑕佹眰
	 * @param guestteam
	 * @param guestid  闇?瑕佹彁绀烘秷鎭殑鐩爣id
	 * @return
	 */
	public boolean isTeamCanFight(Team guestteam,long guestid){
		//鍒ゆ柇褰撳墠闃熶紞涓殑鐜╁绛夌骇鏄惁绗﹀悎瑕佹眰锛屾槸鍚︽湁涓嬭繃鎴樹功鎴栬?呰澶辫触
		List<Long> guestlevelLess50 = new ArrayList<Long>();
		List<Long> guestfightLess50 = new ArrayList<Long>();
		
		List<Long> guestmembers = guestteam.getNormalMemberIds();
		for (long mem : guestmembers) {
			PropRole guestrole = new PropRole(mem, true);
			if (guestrole.getLevel() < LiveDieMange.getLiveDieLevel()) {
				//鎻愮ず闃熶紞涓湁绛夌骇涓嶇鍚堣姹傜殑
				guestlevelLess50.add(mem);
			}
			//韬笂鏈夌敓姝绘垬绉板彿
			if(COffTitle.isLiveDieTitle(guestrole)){
				//鎻愮ず闃熶紞涓湁韬笂鏈夌敓姝绘垬绉板彿
				guestfightLess50.add(mem);
			}
		}
		if (!guestlevelLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestlevelLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//鎻愮ず闃熶紞涓湁绛夌骇涓嶇鍚堣姹傜殑
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162119,paras);
			return false;
		}
		if (!guestfightLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestfightLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//鎻愮ず闃熶紞涓湁韬笂鏈夌敓姝绘垬绉板彿
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162118,paras);
			return false;
		}
		return true;
	}
	
	
	public static final Logger logger = Logger.getLogger("BATTLE");
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793839;

	public int getType() {
		return 793839;
	}


	public CAcceptLiveDieBattle() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptLiveDieBattle) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptLiveDieBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


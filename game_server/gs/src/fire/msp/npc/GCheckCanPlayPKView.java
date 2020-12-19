
package fire.msp.npc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import fire.pb.battle.BattleType;
import fire.pb.battle.QCmodelType;
import fire.pb.main.ConfigManager;
import fire.pb.npc.SLeitaiLevel;
import fire.pb.scene.Scene;
import fire.pb.scene.SceneClient;
import fire.pb.scene.SceneManager;
import fire.pb.scene.movable.Role;
import fire.pb.scene.sPos.GridPos;
import fire.pb.scene.sPos.Position;
import fire.pb.team.Team;
import fire.pb.team.TeamManager;






// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GCheckCanPlayPKView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GCheckCanPlayPKView extends __GCheckCanPlayPKView__ {
	
	public static final Logger logger = Logger.getLogger("BATTLE");
	public static final int CQMAPID=1615;//鍒囩鍦板浘id
	public static Map<Integer,SLeitaiLevel> sLeitaiLevelmap=ConfigManager.getInstance().getConf(SLeitaiLevel.class);
	
	public static final int MAX_NUM=50;
	
	@Override
	protected void process() {
		//鍒ゆ柇瀹㈡埛绔彂閫佺殑闂ㄦ淳鍜岀瓑绾т互鍙婃ā鍧楁暟鎹槸鍚︽纭?
		if(modeltype!=QCmodelType.ONE_FIGHT&&modeltype!=QCmodelType.TEAM_FIGHT&&modeltype!=QCmodelType.WATCH_FIGHT){
			logger.error("鍒囩妯″潡鏁版嵁閿欒锛屾ā鍧楅敊璇?");
			return ;
		}
		
		if(sLeitaiLevelmap==null){
			logger.error("鍒囩妯″潡鏁版嵁閿欒锛屾搨鍙扮瓑绾ч厤缃〃");
			return ;
		}
		int levelmin=0;
		int levelmax=1000;
		SLeitaiLevel sLeitaiLevel = sLeitaiLevelmap.get(levelindex);
		if(sLeitaiLevel!=null){
			levelmin=sLeitaiLevel.getLevelmin();
			levelmax=sLeitaiLevel.getLevelmax();
		}
		//鑾峰緱褰撳墠鍦烘櫙鏄墍鏈夌帺瀹讹紝骞朵笖鏄湪鎿傚彴涓婄殑
		LinkedList<Long> rolelistid=new LinkedList<Long>();//绗﹀悎鏉′欢鐨勬墍鏈夌帺瀹?
		HashMap<Long, Long> watchfight=new HashMap<Long, Long>();
		Scene scene = SceneManager.getInstance().getSceneByID(CQMAPID);
		Set<Integer> aroundIndexs = new java.util.HashSet<Integer>();
		aroundIndexs.add(3);
		aroundIndexs.add(65539);
		Map<Long, Role> roles=scene.getAllRolesInScreens(aroundIndexs);
		int num=0;
		for(Role role : roles.values()){
			GridPos hostGridPos = role.getPos().toGridPos();
			//鏄惁鍦ㄦ搨鍙?
			if (!role.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())) {
				continue;
			}
			//绛夌骇鏄惁绗﹀悎瑕佹眰
			if(role.getLevel()<fire.pb.battle.CSendInvitePlayPK.PVP_LEVEL){
				continue;
			}
			//鍒ゆ柇鍒犻?夌瓑绾?
			if(role.getLevel()<levelmin||role.getLevel()>levelmax){
				continue;
			}
			if(school>0){
				if(role.getSchoolId()!=school){
					continue;
				}
			}
			//杩囨护鑷繁
			if(role.getRoleID()==hostid){
				continue;
			}
			//鍒ゆ柇鐜╁鏄惁缁勯槦锛岃繃婊ら槦鍛?
			Team host_Team = TeamManager.selectTeamByRoleId(role.getRoleID());
			if (host_Team != null && host_Team.isNormalMember(role.getRoleID())){
				continue;
			}
			//鍒ゆ柇瀵瑰簲妯″潡
			if(modeltype==QCmodelType.TEAM_FIGHT){
				//缁勯槦锛屽繀椤绘槸鏈夐槦浼嶇殑
				if(host_Team == null){
					continue;
				}
				//杩囨护鎺夐潪闃熼暱鎴愬憳
				if(host_Team.getTeamLeaderId()!=role.getRoleID()){
					continue;
				}
				//杩欓噷闇?瑕佸垽鏂綋鍓嶇殑闃熶紞鏄惁鏄嚜宸辨墍鍦ㄧ殑闃熶紞
				Team selfTeam = TeamManager.selectTeamByRoleId(hostid);
				if(selfTeam!=null){
					if(host_Team.getTeamId()==selfTeam.getTeamId()){
						continue;
					}
				}
				if(fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
					continue;
				}
				rolelistid.add(role.getRoleID());
				num++;
			}else if(modeltype==QCmodelType.WATCH_FIGHT){
				watchFightView(role,watchfight);
				num=watchfight.size();
			}else if(modeltype==QCmodelType.ONE_FIGHT){
				//鍗曚汉锛岃繃婊ょ粍闃熷拰鍦ㄦ垬鏂楃殑鐜╁
				if(host_Team != null){
					continue;
				}
				if(fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
					continue;
				}
				rolelistid.add(role.getRoleID());
				num++;
			}
			if(num>=MAX_NUM){
				break;
			}
		}	
		SceneClient.pSend(new MCheckCanPlayPKView(hostid, modeltype, school, levelindex, rolelistid, watchfight));
	}
	
	/**
	 * 娣诲姞瑙傛垬鐨勭帺瀹?
	 * @param role
	 * @param watchfight
	 */
	private  void watchFightView(Role role,HashMap<Long, Long> watchfight){
		//杩囨护娌℃湁鍦ㄦ垬鏂楃殑鐜╁
		//涓嶅湪鎴樻枟涓?
		if(!fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
			return;
		}
		//杩囨护鎺変笉鏄富鏂圭殑
		Long battleid = xtable.Roleid2battleid.select(role.getRoleID());
		if (battleid==null){//鐜╁鍙兘鏄偣鍑昏鎴樿?呰繘鍏ヨ鎴樼殑
			battleid = xtable.Watcherid2battleid.select(role.getRoleID());
		}
		if(battleid == null){
			return;
		}
		Integer battleType = xtable.Battle.selectBattletype(battleid);
		if(battleType == null || battleType != BattleType.BATTLE_PVP){
			return;
		}
		Map<Integer, xbean.Fighter> fighters = xtable.Battle.selectFighters(battleid);
		if(fighters == null) {
			return;
		}
		if(fighters.get(1)!=null&&fighters.get(1).getUniqueid()==role.getRoleID()){
			if(fighters.get(15)!=null&&fighters.get(15).getFightertype() == xbean.Fighter.FIGHTER_ROLE){
				watchfight.put(role.getRoleID(), fighters.get(15).getUniqueid());
			}
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730439;

	public int getType() {
		return 730439;
	}

	public long hostid;
	public int modeltype; // 模块类型
	public int school; // 删选的职业 -1表示全职业
	public int levelindex; // 删选的角色等级区间 0表示全选

	public GCheckCanPlayPKView() {
	}

	public GCheckCanPlayPKView(long _hostid_, int _modeltype_, int _school_, int _levelindex_) {
		this.hostid = _hostid_;
		this.modeltype = _modeltype_;
		this.school = _school_;
		this.levelindex = _levelindex_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(hostid);
		_os_.marshal(modeltype);
		_os_.marshal(school);
		_os_.marshal(levelindex);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		hostid = _os_.unmarshal_long();
		modeltype = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		levelindex = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GCheckCanPlayPKView) {
			GCheckCanPlayPKView _o_ = (GCheckCanPlayPKView)_o1_;
			if (hostid != _o_.hostid) return false;
			if (modeltype != _o_.modeltype) return false;
			if (school != _o_.school) return false;
			if (levelindex != _o_.levelindex) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)hostid;
		_h_ += modeltype;
		_h_ += school;
		_h_ += levelindex;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(hostid).append(",");
		_sb_.append(modeltype).append(",");
		_sb_.append(school).append(",");
		_sb_.append(levelindex).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GCheckCanPlayPKView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(hostid - _o_.hostid);
		if (0 != _c_) return _c_;
		_c_ = modeltype - _o_.modeltype;
		if (0 != _c_) return _c_;
		_c_ = school - _o_.school;
		if (0 != _c_) return _c_;
		_c_ = levelindex - _o_.levelindex;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


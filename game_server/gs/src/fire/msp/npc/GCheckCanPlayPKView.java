
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
	public static final int CQMAPID=1615;//閸掑洨顥愰崷鏉挎禈id
	public static Map<Integer,SLeitaiLevel> sLeitaiLevelmap=ConfigManager.getInstance().getConf(SLeitaiLevel.class);
	
	public static final int MAX_NUM=50;
	
	@Override
	protected void process() {
		//閸掋倖鏌囩�广垺鍩涚粩顖氬絺闁胶娈戦梻銊︽烦閸滃瞼鐡戠痪褌浜掗崣濠兡侀崸妤佹殶閹诡喗妲搁崥锔筋劀绾�?
		if(modeltype!=QCmodelType.ONE_FIGHT&&modeltype!=QCmodelType.TEAM_FIGHT&&modeltype!=QCmodelType.WATCH_FIGHT){
			logger.error("閸掑洨顥愬Ο鈥虫健閺佺増宓侀柨娆掝嚖閿涘本膩閸ф鏁婄拠?");
			return ;
		}
		
		if(sLeitaiLevelmap==null){
			logger.error("閸掑洨顥愬Ο鈥虫健閺佺増宓侀柨娆掝嚖閿涘本鎼ㄩ崣鎵搼缁狙囧帳缂冾喛銆�");
			return ;
		}
		int levelmin=0;
		int levelmax=1000;
		SLeitaiLevel sLeitaiLevel = sLeitaiLevelmap.get(levelindex);
		if(sLeitaiLevel!=null){
			levelmin=sLeitaiLevel.getLevelmin();
			levelmax=sLeitaiLevel.getLevelmax();
		}
		//閼惧嘲绶辫ぐ鎾冲閸︾儤娅欓弰顖涘閺堝甯虹�硅绱濋獮鏈电瑬閺勵垰婀幙鍌氬酱娑撳﹦娈�
		LinkedList<Long> rolelistid=new LinkedList<Long>();//缁楋箑鎮庨弶鈥叉閻ㄥ嫭澧嶉張澶屽负鐎�?
		HashMap<Long, Long> watchfight=new HashMap<Long, Long>();
		Scene scene = SceneManager.getInstance().getSceneByID(CQMAPID);
		Set<Integer> aroundIndexs = new java.util.HashSet<Integer>();
		aroundIndexs.add(3);
		aroundIndexs.add(65539);
		Map<Long, Role> roles=scene.getAllRolesInScreens(aroundIndexs);
		int num=0;
		for(Role role : roles.values()){
			GridPos hostGridPos = role.getPos().toGridPos();
			//閺勵垰鎯侀崷銊︽惃閸�?
			if (!role.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())) {
				continue;
			}
			//缁涘楠囬弰顖氭儊缁楋箑鎮庣憰浣圭湴
			if(role.getLevel()<fire.pb.battle.CSendInvitePlayPK.PVP_LEVEL){
				continue;
			}
			//閸掋倖鏌囬崚鐘�?澶岀搼缁�?
			if(role.getLevel()<levelmin||role.getLevel()>levelmax){
				continue;
			}
			if(school>0){
				if(role.getSchoolId()!=school){
					continue;
				}
			}
			//鏉╁洦鎶ら懛顏勭箒
			if(role.getRoleID()==hostid){
				continue;
			}
			//閸掋倖鏌囬悳鈺侇啀閺勵垰鎯佺紒鍕Е閿涘矁绻冨銈夋Е閸�?
			Team host_Team = TeamManager.selectTeamByRoleId(role.getRoleID());
			if (host_Team != null && host_Team.isNormalMember(role.getRoleID())){
				continue;
			}
			//閸掋倖鏌囩�电懓绨插Ο鈥虫健
			if(modeltype==QCmodelType.TEAM_FIGHT){
				//缂佸嫰妲﹂敍灞界箑妞ょ粯妲搁張澶愭Е娴煎秶娈�
				if(host_Team == null){
					continue;
				}
				//鏉╁洦鎶ら幒澶愭姜闂冪喖鏆遍幋鎰喅
				if(host_Team.getTeamLeaderId()!=role.getRoleID()){
					continue;
				}
				//鏉╂瑩鍣烽棁?鐟曚礁鍨介弬顓炵秼閸撳秶娈戦梼鐔剁礊閺勵垰鎯侀弰顖濆殰瀹歌鲸澧嶉崷銊ф畱闂冪喍绱�
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
				//閸楁洑姹夐敍宀冪箖濠娿倗绮嶉梼鐔锋嫲閸︺劍鍨弬妤冩畱閻溾晛顔�
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
	 * 濞ｈ濮炵憴鍌涘灛閻ㄥ嫮甯虹��?
	 * @param role
	 * @param watchfight
	 */
	private  void watchFightView(Role role,HashMap<Long, Long> watchfight){
		//鏉╁洦鎶ゅ▽鈩冩箒閸︺劍鍨弬妤冩畱閻溾晛顔�
		//娑撳秴婀幋妯绘灍娑�?
		if(!fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
			return;
		}
		//鏉╁洦鎶ら幒澶夌瑝閺勵垯瀵岄弬鍦畱
		Long battleid = xtable.Roleid2battleid.select(role.getRoleID());
		if (battleid==null){//閻溾晛顔嶉崣顖濆厴閺勵垳鍋ｉ崙鏄忣潎閹存?鍛扮箻閸忋儴顫囬幋妯兼畱
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


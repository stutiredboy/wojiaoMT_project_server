
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
	public static final int CQMAPID=1615;//闁告帒娲ㄩˉ鎰板捶閺夋寧绂坕d
	public static Map<Integer,SLeitaiLevel> sLeitaiLevelmap=ConfigManager.getInstance().getConf(SLeitaiLevel.class);
	
	public static final int MAX_NUM=50;
	
	@Override
	protected void process() {
		//闁告帇鍊栭弻鍥╋拷骞垮灪閸╂稓绮╅姘岛闂侇偂鑳跺▓鎴︽⒒閵婏附鐑﹂柛婊冪灱閻℃垹鐥娴滄帡宕ｆ繝鍏′線宕稿Δ浣规闁硅鍠楀Σ鎼佸触閿旂瓔鍔�缁撅拷?
		if(modeltype!=QCmodelType.ONE_FIGHT&&modeltype!=QCmodelType.TEAM_FIGHT&&modeltype!=QCmodelType.WATCH_FIGHT){
			logger.error("闁告帒娲ㄩˉ鎰熼垾铏仴闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩闁挎稑鏈啯闁秆勵殜閺佸﹦鎷�?");
			return ;
		}
		
		if(sLeitaiLevelmap==null){
			logger.error("闁告帒娲ㄩˉ鎰熼垾铏仴闁轰胶澧楀畵渚�鏌ㄥ▎鎺濆殩闁挎稑鏈幖銊╁矗閹殿喚鎼肩紒鐙欏洤甯崇紓鍐惧枦閵嗭拷");
			return ;
		}
		int levelmin=0;
		int levelmax=1000;
		SLeitaiLevel sLeitaiLevel = sLeitaiLevelmap.get(levelindex);
		if(sLeitaiLevel!=null){
			levelmin=sLeitaiLevel.getLevelmin();
			levelmax=sLeitaiLevel.getLevelmax();
		}
		//闁兼儳鍢茬欢杈亹閹惧啿顤呴柛锔惧劋濞呮瑩寮伴娑橆暡闁哄牆顦辩敮铏癸拷纭咁啇缁辨繈鐛張鐢电懍闁哄嫷鍨板﹢顏堝箼閸屾艾閰卞☉鎾筹功濞堬拷
		LinkedList<Long> rolelistid=new LinkedList<Long>();//缂佹绠戦幃搴ㄥ级閳ュ弶顐介柣銊ュ婢у秹寮垫径灞借礋閻庯拷?
		HashMap<Long, Long> watchfight=new HashMap<Long, Long>();
		Scene scene = SceneManager.getInstance().getSceneByID(CQMAPID);
		Set<Integer> aroundIndexs = new java.util.HashSet<Integer>();
		aroundIndexs.add(3);
		aroundIndexs.add(65539);
		Map<Long, Role> roles=scene.getAllRolesInScreens(aroundIndexs);
		int num=0;
		for(Role role : roles.values()){
			GridPos hostGridPos = role.getPos().toGridPos();
			//闁哄嫷鍨伴幆渚�宕烽妸锔芥儍闁革拷?
			if (!role.getScene().getMapInfo().getBlockInfo().checkCanQiecuo(hostGridPos.getX(), hostGridPos.getY())) {
				continue;
			}
			//缂佹稑顦辨鍥及椤栨碍鍎婄紒妤嬬畱閹海鎲版担鍦勾
			if(role.getLevel()<fire.pb.battle.CSendInvitePlayPK.PVP_LEVEL){
				continue;
			}
			//闁告帇鍊栭弻鍥礆閻橈拷?婢跺瞼鎼肩紒锟�?
			if(role.getLevel()<levelmin||role.getLevel()>levelmax){
				continue;
			}
			if(school>0){
				if(role.getSchoolId()!=school){
					continue;
				}
			}
			//閺夆晛娲﹂幎銈夋嚊椤忓嫮绠�
			if(role.getRoleID()==hostid){
				continue;
			}
			//闁告帇鍊栭弻鍥偝閳轰緡鍟�闁哄嫷鍨伴幆浣虹磼閸曨垱袝闁挎稑鐭佺换鍐煥閵堝袝闁革拷?
			Team host_Team = TeamManager.selectTeamByRoleId(role.getRoleID());
			if (host_Team != null && host_Team.isNormalMember(role.getRoleID())){
				continue;
			}
			//闁告帇鍊栭弻鍥╋拷鐢垫嚀缁ㄦ彃螣閳ヨ櫕鍋�
			if(modeltype==QCmodelType.TEAM_FIGHT){
				//缂備礁瀚板Σ锕傛晬鐏炵晫绠戝銈囩帛濡叉悂寮垫径鎰曞ù鐓庣Ф濞堬拷
				if(host_Team == null){
					continue;
				}
				//閺夆晛娲﹂幎銈夊箳婢舵劖濮滈梻鍐枛閺嗛亶骞嬮幇顒佸枀
				if(host_Team.getTeamLeaderId()!=role.getRoleID()){
					continue;
				}
				//閺夆晜鐟╅崳鐑芥?閻熸洑绀侀崹浠嬪棘椤撶偟绉奸柛鎾崇Ф濞堟垿姊奸悢鍓佺闁哄嫷鍨伴幆渚�寮伴婵嗘鐎规瓕椴告晶宥夊捶閵娧勭暠闂傚啰鍠嶇槐锟�
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
				//闁告娲戝Ч澶愭晬瀹�鍐畺婵犲鍊楃划宥夋⒓閻旈攱瀚查柛锔哄妽閸剟寮Δ鍐╃暠闁绘壕鏅涢锟�
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
	 * 婵烇綀顕ф慨鐐垫喆閸屾稑鐏涢柣銊ュ鐢櫣锟斤拷?
	 * @param role
	 * @param watchfight
	 */
	private  void watchFightView(Role role,HashMap<Long, Long> watchfight){
		//閺夆晛娲﹂幎銈呪柦閳╁啯绠掗柛锔哄妽閸剟寮Δ鍐╃暠闁绘壕鏅涢锟�
		//濞戞挸绉村﹢顏堝箣濡粯鐏嶅☉锟�?
		if(!fire.pb.buff.Module.existState(role.getRoleID(), fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)){			
			return;
		}
		//閺夆晛娲﹂幎銈夊箳婢跺鐟濋柡鍕靛灟鐎靛矂寮崷顓熺暠
		Long battleid = xtable.Roleid2battleid.select(role.getRoleID());
		if (battleid==null){//闁绘壕鏅涢宥夊矗椤栨繂鍘撮柡鍕靛灣閸嬶綁宕欓弰蹇ｆ綆闁瑰瓨顭�?閸涙壆绠婚柛蹇嬪劥椤洭骞嬪Ο鍏肩暠
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



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
		// npc婢跺嫬绨查幋妯虹磻閹�?
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//閸掋倖鏌囨稉瀣灛娑旓妇娈戞禍鐑樻Ц閸氾箑鐡ㄩ崷?
		Long hostid=xtable.Livedie2key.select(guestid);
		//閸掋倖鏌囬弰顖氭儊閺堝绗呴幋妯瑰姛閻ㄥ嫪姹�
		if(hostid==null){
			//閹绘劗銇氬▽鈩冩箒缂佹瑤缍樻稉瀣灛娑旓妇娈戞禍?162079
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162079, null);
			return ;
		}
		//閼惧嘲绶辨稉瀣灛娑旓缚淇婇幁顖ょ礉閸掋倖鏌囬弰顖氭儊鏉╁洦婀�
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			logger.info("閹存ü鍔熷鑼病鏉╁洦婀℃禍?");
			return ;
		}
		
		//閸掋倖鏌囬悳鈺侇啀閺勵垰鎯侀崷銊у殠
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		//閸掋倖鏌囬懛顏勭箒閺勵垰鎯侀崷銊ュ閺堫剨绱濋崷銊ュ閺堫剚妫ゅ▔鏇炲絺闁浇顕Ч?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162002, null);
			return ;
		}
		xbean.Properties guestprop=xtable.Properties.select(guestid);
		//缁旂偞濡ч崷鍝勬勾閸ョ偓妫ゅ▔?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162121, null);
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162130, Arrays.asList(guestprop.getRolename()));
			return ;
		}
		//閸掋倖鏌囨稉瀣灛娑旓妇娈戦悳鈺侇啀閺勵垰鎯侀崷銊﹀灛閺傛鍨ㄩ懓鍛邦潎閹�?
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
		//閸掋倖鏌囩�佃鏌熼弰顖氭儊閸︺劎鍤�
		if (!StateCommon.isOnlineBuffer(hostid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		int isteamfight=0;
		
		//閸掋倖鏌囬幋妯绘灍缁鐎烽敍灞炬Ц缂佸嫰妲︽潻妯绘Ц閸楁洑姹�
		if(hostliveDieRoleInfo.getSelecttype()==1){//缂佸嫰妲�
			isteamfight=1;
			//婵″倹鐏夐弰顖滅矋闂冪噦绱濋棁?鐟曚礁鍨介弬顓炵秼閸撳秹妲︽导宥嗘Ц閸氾箓鍏橀弰顖炴Е闂�?
			//缂佸嫰妲﹂崘铏灍,閸欐垼鎹ｆ禍杞扮瑝閺勵垶妲﹂梹鎸庢,閹恒儱褰堟禍铏瑰仯閸戣绱戦幋?,閹恒儱褰堟禍杞扮窗閹绘劗銇氶崣鎴ｆ崳娴滆桨绗夐弰顖炴Е闂�?,閸欐垼鎹ｆ禍杞扮窗閹绘劗銇氶幒銉ュ綀娴滃搫鍑＄紒蹇斿复閸欐鍠呴弬?,鐠囬攱鍨氭稉娲Е闂�?
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam==null){
				//閹绘劗銇氶崣鎴ｆ崳娴滅尨绱濋幋鎰礋闂冪喖鏆�
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			if(hostteam.getTeamLeaderId()!=hostid){
				//閹绘劗銇氶崣鎴ｆ崳娴滅尨绱濋幋鎰礋闂冪喖鏆�
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			//閸掋倖鏌囬梼鐔剁礊娑擃厾娈戦幋鎰喅閺勵垰鎯佺粭锕�鎮庣憰浣圭湴
			if(isTeamCanFight(hostteam,hostid)==false){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			if(guestteam==null){
				//娑撳秵妲搁梼鐔兼毐閿涘本妫ゅ▔鏇炵安閹�?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//閸掋倖鏌囬弰顖氭儊閺勵垶妲﹂梹?
			if(guestteam.getTeamLeaderId()!=guestid){
				//娑撳秵妲搁梼鐔兼毐閿涘本妫ゅ▔鏇炵安閹�?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//閸掋倖鏌囬梼鐔剁礊娑擃厾娈戦幋鎰喅閺勵垰鎯佺粭锕�鎮庣憰浣圭湴
			if(isTeamCanFight(guestteam,guestid)==false){
				return ;
			}
			//婵″倹鐏夐張澶愭Е娴煎稄绱濋弳鍌滎瀲閻樿埖?浣风瘍娑撳秷鍏樺?閹�?
			if(hostteam.getAbsentMemberIds().contains(hostid)){
				//閹绘劗銇氶崣鎴ｆ崳娴滅尨绱濋幋鎰礋闂冪喖鏆�
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
			//閸楁洑姹夐幋妯瑰姛韫囧懘銆忛柈鑺ユЦ閸楁洑姹夐幍宥堝厴閸欏倸濮�
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam!=null&&hostteam.getFighterMemberIds().contains(hostid)){
				//閻╁瓨甯撮幎濠勬窗閺嶅洨甯虹�硅埖娈忕粋璁崇啊
				//婵″倹鐏夐張澶愭Е娴煎秴姘ㄩ弳鍌滎瀲闂冪喍绱�
				new PAbsentReturnTeam(hostid, 1).submit();
			}
		}

		new PLiveDieBattle(hostid,guestid,isteamfight).submit();
		
	}
	
	/**
	 * 閸掋倖鏌囬梼鐔剁礊娑擃厾娈戦幋鎰喅閺勵垰鎯佺粭锕�鎮庣憰浣圭湴
	 * @param guestteam
	 * @param guestid  闂�?鐟曚焦褰佺粈鐑樼Х閹垳娈戦惄顔界垼id
	 * @return
	 */
	public boolean isTeamCanFight(Team guestteam,long guestid){
		//閸掋倖鏌囪ぐ鎾冲闂冪喍绱炴稉顓犳畱閻溾晛顔嶇粵澶岄獓閺勵垰鎯佺粭锕�鎮庣憰浣圭湴閿涘本妲搁崥锔芥箒娑撳绻冮幋妯瑰姛閹存牞?鍛邦潶婢惰精瑙�
		List<Long> guestlevelLess50 = new ArrayList<Long>();
		List<Long> guestfightLess50 = new ArrayList<Long>();
		
		List<Long> guestmembers = guestteam.getNormalMemberIds();
		for (long mem : guestmembers) {
			PropRole guestrole = new PropRole(mem, true);
			if (guestrole.getLevel() < LiveDieMange.getLiveDieLevel()) {
				//閹绘劗銇氶梼鐔剁礊娑擃厽婀佺粵澶岄獓娑撳秶顑侀崥鍫ｎ洣濮瑰倻娈�
				guestlevelLess50.add(mem);
			}
			//闊偂绗傞張澶屾晸濮濈粯鍨粔鏉垮娇
			if(COffTitle.isLiveDieTitle(guestrole)){
				//閹绘劗銇氶梼鐔剁礊娑擃厽婀侀煬顐＄瑐閺堝鏁撳缁樺灛缁夋澘褰�
				guestfightLess50.add(mem);
			}
		}
		if (!guestlevelLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestlevelLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//閹绘劗銇氶梼鐔剁礊娑擃厽婀佺粵澶岄獓娑撳秶顑侀崥鍫ｎ洣濮瑰倻娈�
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162119,paras);
			return false;
		}
		if (!guestfightLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestfightLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//閹绘劗銇氶梼鐔剁礊娑擃厽婀侀煬顐＄瑐閺堝鏁撳缁樺灛缁夋澘褰�
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


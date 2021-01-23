
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
		// npc濠㈣泛瀚花鏌ュ箣濡櫣纾婚柟锟�?
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		//闁告帇鍊栭弻鍥ㄧ▔鐎ｎ偄鐏涘☉鏃撳濞堟垶绂嶉悜妯恍﹂柛姘剧畱閻°劑宕�?
		Long hostid=xtable.Livedie2key.select(guestid);
		//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍫濐槷缁楀懘骞嬪Ο鐟板闁汇劌瀚Ч锟�
		if(hostid==null){
			//闁圭粯鍔楅妵姘柦閳╁啯绠掔紓浣圭懁缂嶆ɑ绋夌�ｎ偄鐏涘☉鏃撳濞堟垶绂�?162079
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162079, null);
			return ;
		}
		//闁兼儳鍢茬欢杈ㄧ▔鐎ｎ偄鐏涘☉鏃撶細娣囧﹪骞侀銈囩闁告帇鍊栭弻鍥及椤栨碍鍎婇弶鈺佹处濠�锟�
		xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
		if(hostliveDieRoleInfo==null){
			return ;
		}
		if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
			logger.info("闁瑰瓨眉閸旂喎顔忛懠顒傜梾閺夆晛娲﹀﹢鈩冪?");
			return ;
		}
		
		//闁告帇鍊栭弻鍥偝閳轰緡鍟�闁哄嫷鍨伴幆渚�宕烽妸褍娈�
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		//闁告帇鍊栭弻鍥嚊椤忓嫮绠掗柡鍕靛灠閹線宕烽妸銉ヮ棇闁哄牜鍓ㄧ槐婵嬪捶閵娿儱顥岄柡鍫墯濡倕鈻旈弴鐐茬岛闂侇偂娴囬顒�效?
		MapConfig cfg = ConfigManager.getInstance().getConf(MapConfig.class).get(hostRole.getMapId());
		if(cfg.dynamic ==1){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162002, null);
			return ;
		}
		xbean.Properties guestprop=xtable.Properties.select(guestid);
		//缂佹梻鍋炴俊褔宕烽崫鍕嬀闁搞儳鍋撳Λ銈呪枖?
		if (PvPHelperManager.isPvPMap(hostRole.getMapId())){
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid,162121, null);
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162130, Arrays.asList(guestprop.getRolename()));
			return ;
		}
		//闁告帇鍊栭弻鍥ㄧ▔鐎ｎ偄鐏涘☉鏃撳濞堟垿鎮抽埡渚囧晙闁哄嫷鍨伴幆渚�宕烽妸锕�鐏涢柡鍌涱殕閸ㄣ劑鎳撻崨閭︽綆闁癸拷?
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
		//闁告帇鍊栭弻鍥╋拷浣冾潐閺岀喖寮伴姘剨闁革负鍔庨崵锟�
		if (!StateCommon.isOnlineBuffer(hostid)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 145001, null);
			return ;
		}
		int isteamfight=0;
		
		//闁告帇鍊栭弻鍥箣濡粯鐏嶇紒顐ヮ嚙閻庣兘鏁嶇仦鐐︾紓浣稿濡诧附娼诲Ο缁樞﹂柛妤佹磻濮癸拷
		if(hostliveDieRoleInfo.getSelecttype()==1){//缂備礁瀚板Σ锟�
			isteamfight=1;
			//濠碘�冲�归悘澶愬及椤栨粎鐭嬮梻鍐櫐缁辨繈妫�?閻熸洑绀侀崹浠嬪棘椤撶偟绉奸柛鎾崇Ч濡诧附瀵煎鍡樞﹂柛姘剧畵閸忔﹢寮伴鐐葱曢梻锟�?
			//缂備礁瀚板Σ锕傚礃閾忣偅鐏�,闁告瑦鍨奸幑锝嗙鏉炴壆鐟濋柡鍕靛灦濡诧箓姊归幐搴㈩槯,闁规亽鍎辫ぐ鍫熺閾忕懓浠柛鎴ｎ嚙缁辨垿骞�?,闁规亽鍎辫ぐ鍫熺鏉炴壆绐楅柟缁樺姉閵囨岸宕ｉ幋锝嗗闯濞存粏妗ㄧ粭澶愬及椤栫偞袝闂傦拷?,闁告瑦鍨奸幑锝嗙鏉炴壆绐楅柟缁樺姉閵囨岸骞掗妷銉ョ秬濞存粌鎼崙锛勭磼韫囨柨澶嶉柛娆愵殔閸犲懘寮�?,閻犲洭鏀遍崹姘▔濞差亝袝闂傦拷?
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam==null){
				//闁圭粯鍔楅妵姘跺矗閹达絾宕冲ù婊呭皑缁辨繈骞嬮幇顏囩闂傚啰鍠栭弳锟�
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			if(hostteam.getTeamLeaderId()!=hostid){
				//闁圭粯鍔楅妵姘跺矗閹达絾宕冲ù婊呭皑缁辨繈骞嬮幇顏囩闂傚啰鍠栭弳锟�
				fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162125, Arrays.asList(guestprop.getRolename()));
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			//闁告帇鍊栭弻鍥⒓閻斿墎绀婂☉鎿冨幘濞堟垿骞嬮幇顒佸枀闁哄嫷鍨伴幆浣虹箔閿曪拷閹海鎲版担鍦勾
			if(isTeamCanFight(hostteam,hostid)==false){
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162121, null);
				return ;
			}
			
			Team guestteam = TeamManager.selectTeamByRoleId(guestid);
			if(guestteam==null){
				//濞戞挸绉靛Σ鎼佹⒓閻斿吋姣愰柨娑樻湰濡倕鈻旈弴鐐靛畨闁癸拷?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//闁告帇鍊栭弻鍥及椤栨碍鍎婇柡鍕靛灦濡诧箓姊�?
			if(guestteam.getTeamLeaderId()!=guestid){
				//濞戞挸绉靛Σ鎼佹⒓閻斿吋姣愰柨娑樻湰濡倕鈻旈弴鐐靛畨闁癸拷?
				fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162081, null);
				return ;
			}
			//闁告帇鍊栭弻鍥⒓閻斿墎绀婂☉鎿冨幘濞堟垿骞嬮幇顒佸枀闁哄嫷鍨伴幆浣虹箔閿曪拷閹海鎲版担鍦勾
			if(isTeamCanFight(guestteam,guestid)==false){
				return ;
			}
			//濠碘�冲�归悘澶愬嫉婢舵劖袝濞寸厧绋勭槐婵嬪汲閸屾粠鐎查柣妯垮煐?娴ｉ鐦嶅☉鎾崇Х閸忔ê顕�?闁癸拷?
			if(hostteam.getAbsentMemberIds().contains(hostid)){
				//闁圭粯鍔楅妵姘跺矗閹达絾宕冲ù婊呭皑缁辨繈骞嬮幇顏囩闂傚啰鍠栭弳锟�
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
			//闁告娲戝Ч澶愬箣濡懓濮涢煫鍥ф嚇閵嗗繘鏌堥懞銉π﹂柛妤佹磻濮瑰骞嶅鍫濆幋闁告瑥鍊告慨锟�
			Team hostteam = TeamManager.selectTeamByRoleId(hostid);
			if(hostteam!=null&&hostteam.getFighterMemberIds().contains(hostid)){
				//闁烩晛鐡ㄧ敮鎾箮婵犲嫭绐楅柡宥呮川鐢櫣锟界鍩栧▓蹇曠矉鐠佸磭鍟�
				//濠碘�冲�归悘澶愬嫉婢舵劖袝濞寸厧绉村銊╁汲閸屾粠鐎查梻鍐枍缁憋拷
				new PAbsentReturnTeam(hostid, 1).submit();
			}
		}

		new PLiveDieBattle(hostid,guestid,isteamfight).submit();
		
	}
	
	/**
	 * 闁告帇鍊栭弻鍥⒓閻斿墎绀婂☉鎿冨幘濞堟垿骞嬮幇顒佸枀闁哄嫷鍨伴幆浣虹箔閿曪拷閹海鎲版担鍦勾
	 * @param guestteam
	 * @param guestid  闂傦拷?閻熸洑鐒﹁ぐ浣虹矆閻戞啸闁诡収鍨冲▓鎴︽儎椤旂晫鍨糹d
	 * @return
	 */
	public boolean isTeamCanFight(Team guestteam,long guestid){
		//闁告帇鍊栭弻鍥亹閹惧啿顤呴梻鍐枍缁辩偞绋夐鐘崇暠闁绘壕鏅涢宥囩驳婢跺矂鐛撻柡鍕靛灠閹胶绮敃锟介幃搴ｆ啺娴ｅ湱婀撮柨娑樻湰濡叉悂宕ラ敂鑺ョ畳濞戞挸顑堢换鍐箣濡懓濮涢柟瀛樼墳?閸涢偊娼跺鎯扮簿鐟欙拷
		List<Long> guestlevelLess50 = new ArrayList<Long>();
		List<Long> guestfightLess50 = new ArrayList<Long>();
		
		List<Long> guestmembers = guestteam.getNormalMemberIds();
		for (long mem : guestmembers) {
			PropRole guestrole = new PropRole(mem, true);
			if (guestrole.getLevel() < LiveDieMange.getLiveDieLevel()) {
				//闁圭粯鍔楅妵姘舵⒓閻斿墎绀婂☉鎿冨幗濠�浣虹驳婢跺矂鐛撳☉鎾崇Ф椤戜線宕ラ崼锝庢矗婵懓鍊诲▓锟�
				guestlevelLess50.add(mem);
			}
			//闂婎剦鍋傜粭鍌炲嫉婢跺本鏅告慨婵堢帛閸剛绮旈弶鍨▏
			if(COffTitle.isLiveDieTitle(guestrole)){
				//闁圭粯鍔楅妵姘舵⒓閻斿墎绀婂☉鎿冨幗濠�渚�鐓锛勭憪闁哄牆顦遍弫鎾愁潰缂佹ê鐏涚紒澶嬫緲瑜帮拷
				guestfightLess50.add(mem);
			}
		}
		if (!guestlevelLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestlevelLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//闁圭粯鍔楅妵姘舵⒓閻斿墎绀婂☉鎿冨幗濠�浣虹驳婢跺矂鐛撳☉鎾崇Ф椤戜線宕ラ崼锝庢矗婵懓鍊诲▓锟�
			fire.pb.talk.MessageMgr.sendMsgNotify(guestid, 162119,paras);
			return false;
		}
		if (!guestfightLess50.isEmpty()) {
			String roleNames = MessageUtil.getRoleNames(guestfightLess50);
			List<String> paras = MessageUtil.getMsgParaList(roleNames);
			//闁圭粯鍔楅妵姘舵⒓閻斿墎绀婂☉鎿冨幗濠�渚�鐓锛勭憪闁哄牆顦遍弫鎾愁潰缂佹ê鐏涚紒澶嬫緲瑜帮拷
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


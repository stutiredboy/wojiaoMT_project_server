package fire.msp;

import fire.pb.activity.impexam.ImpExamManager;
import fire.pb.activity.winner.WinnerManager;
import fire.pb.battle.pvp1.PvP1Control;
import fire.pb.battle.pvp1.PvP1Helper;
import fire.pb.battle.pvp3.PvP3Control;
import fire.pb.battle.pvp3.PvP3Helper;
import fire.pb.battle.pvp5.PvP5Control;
import fire.pb.battle.pvp5.PvP5Helper;
import fire.pb.huoban.HuoBanColumn;
import fire.pb.instancezone.bingfeng.BingFengLandMgr;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.map.Transfer;
import fire.pb.mission.notify.GiftBagMgr;
import fire.pb.mission.notify.TuiSongNotifyManager;
import fire.pb.move.SRoleEnterScene;
import fire.pb.util.DateValidate;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __MEnterScene__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/**
 * 娴滆櫣澧挎稉濠勫殠閿涘苯婧�閺咁垰顦╅悶鍡楃暚濮ｆ洖鎮楅崥鎴�?鏄忕帆閸欐垶顒濆☉鍫熶紖
 * 
 */
public class MEnterScene extends __MEnterScene__ {
	@Override
	protected void process() {

		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role == null)
		{
			role = RoleManager.getInstance().createRole(roleid,sceneid, posx, posy);
		}
		
		//娴滆櫣澧挎稉濠勫殠閿涘矂妲︽导宥囨祲閸忕绱欓弴瀛樻煀鐟欐帟澹婇梼鐔剁礊娣団剝浼呴敍澶涚礉閸ョ姳璐熼柅鏄忕帆闂冪喍绱為惃鍕繆閹垵顩︽笟婵婄閸︽澘娴橀梼鐔剁礊娣団剝浼呴敍灞惧娴犮儱婀崗鏈电閸氬骸顦╅悶鍡礉閸ョ姳璐熼崗鏈佃厬鐟曚線鏀ｉ梼鐔剁礊闁夸緤绱濋幍?娴犮儱绱撳銉ヮ槱閻�?
		new fire.pb.team.PRoleOnline(roleid).submit();
		
		
		//閸擃垱婀版径鍕倞
		new fire.pb.instancezone.PRoleOnline(roleid,sceneid).submit();
		
//		new fire.pb.mission.instance.PRoleOnline(roleid, sceneid).submit();
		
		//鐏忓繐婀撮崶鍙ョ瑐閸欐垿?浣稿З閹胶鏁撻幋鎰畱npc
		fire.pb.timer.AbstractScheduledActivity.sendActivityNpcToMiniMap(sceneid, roleid);
		
		//瑜版挸澧犳径鍕艾閹舵洜銈ㄦ稉?   鐟欐帟澹婂▽鈩冩箒閹舵洜銈ㄦ潻? 鐟欐帟澹婄粵澶岄獓婢堆傜艾30缁狙冨焼
		xbean.Properties prop =  xtable.Properties.select(roleid);
		Integer curlevel = prop.getLevel();

		//閸氬本顒瀐uobansize閸掔櫅ole
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				HuoBanColumn huobanColumn = HuoBanColumn.getHuoBanColumn(roleid, false);
				final Role rolescene = RoleManager.getInstance().getRoleByID(roleid);
				rolescene.setHuobanSize(huobanColumn.getFightHuobanKeys().size());
				return true;
			}
			
		}.submit();

		
		fire.pb.mission.Module.getInstance().enterWorldOK(role.getRoleID());
		//閺呭搫濮忕拠鏇犵矊濡�?濞�?
		if(ImpExamManager.getInstance().isInImpExamTime() != -1 && curlevel>=20){
			ImpExamManager.getInstance().roleLoginCheck(roleid);
		}
		
		fire.pb.activity.answerquestion.ActivityQuestionManager.getInstance().roleLoginCheck(roleid, prop.getLevel());
		fire.pb.activity.clanfight.ActivityClanFightManager.getInstance().roleLoginCheck(roleid, prop.getLevel());

		if (curlevel >= PvP1Helper.ENTER_MIN_LEVEL && (PvP1Control.getInstance().isActivityTime() || PvP1Helper.isPvPMap((int) sceneid))) {
			// 1v1
			PvP1Control.getInstance().onRoleOnline(roleid, (int) sceneid);
		} else if (curlevel >= PvP3Helper.ENTER_MIN_LEVEL && (PvP3Control.getInstance().isActivityTime() || PvP3Helper.isPvPMap((int) sceneid))) {
			// 3v3
			PvP3Control.getInstance().onRoleOnline(roleid, (int) sceneid);
		} else if (curlevel >= PvP5Helper.ENTER_MIN_LEVEL && (PvP5Control.getInstance().isActivityTime() || PvP5Helper.isPvPMap((int) sceneid))) {
			// 5v5
			PvP5Control.getInstance().onRoleOnline(roleid, (int) sceneid);
		}
		
		if (BingFengLandMgr.bingFengMaps.contains((int)sceneid)) {
			if (!DateValidate.inTheSameDay(prop.getOfflinetime(), prop.getOnlinetime())) {
				Transfer.justGoto(roleid, 1615, 49, 89, SRoleEnterScene.CHEFU);
			}else
			    BingFengLandMgr.getInstance().sendAfterEnterBingFengLand(roleid, true);
		}
		
		//娑撳﹦鍤庨幓鎰板晪閹恒劑??
		TuiSongNotifyManager.getInstance().roleLogin(roleid);
		
		//缁�鐓庡瘶閹绘劙鍟�
		GiftBagMgr.getInstance().roleLogin(roleid, curlevel);
		
		//閸愮姴鍟楃拠鏇犲仹娑撳﹦鍤庨幏澶夋眽
		//鏉╂瑩鍣锋径鍕倞娑�?娑撳鍟濋崘娑滅槸閻愯偐娈戞稉濠勫殠閹峰姹�
		if (curlevel >= WinnerManager.MIN_LEVEL) {
			WinnerManager.getInstance().sendWinnerCallPlayer(roleid);
		}
		
		new fire.pb.clan.fight.PRoleOnline(roleid).submit(); //瀹搞儰绱伴幋妯款潡閼硅弓绗傜痪? by changhao	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 720904;

	public int getType() {
		return 720904;
	}

	public long roleid; // 角色ID
	public long sceneid;
	public int posx;
	public int posy;

	public MEnterScene() {
	}

	public MEnterScene(long _roleid_, long _sceneid_, int _posx_, int _posy_) {
		this.roleid = _roleid_;
		this.sceneid = _sceneid_;
		this.posx = _posx_;
		this.posy = _posy_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(sceneid);
		_os_.marshal(posx);
		_os_.marshal(posy);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		sceneid = _os_.unmarshal_long();
		posx = _os_.unmarshal_int();
		posy = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof MEnterScene) {
			MEnterScene _o_ = (MEnterScene)_o1_;
			if (roleid != _o_.roleid) return false;
			if (sceneid != _o_.sceneid) return false;
			if (posx != _o_.posx) return false;
			if (posy != _o_.posy) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += (int)sceneid;
		_h_ += posx;
		_h_ += posy;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(sceneid).append(",");
		_sb_.append(posx).append(",");
		_sb_.append(posy).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(MEnterScene _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(sceneid - _o_.sceneid);
		if (0 != _c_) return _c_;
		_c_ = posx - _o_.posx;
		if (0 != _c_) return _c_;
		_c_ = posy - _o_.posy;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


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
 * 浜虹墿涓婄嚎锛屽満鏅鐞嗗畬姣曞悗鍚戦?昏緫鍙戞娑堟伅
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
		
		//浜虹墿涓婄嚎锛岄槦浼嶇浉鍏筹紙鏇存柊瑙掕壊闃熶紞淇℃伅锛夛紝鍥犱负閫昏緫闃熶紞鐨勪俊鎭渚濊禆鍦板浘闃熶紞淇℃伅锛屾墍浠ュ湪鍏朵箣鍚庡鐞嗭紝鍥犱负鍏朵腑瑕侀攣闃熶紞閿侊紝鎵?浠ュ紓姝ュ鐞?
		new fire.pb.team.PRoleOnline(roleid).submit();
		
		
		//鍓湰澶勭悊
		new fire.pb.instancezone.PRoleOnline(roleid,sceneid).submit();
		
//		new fire.pb.mission.instance.PRoleOnline(roleid, sceneid).submit();
		
		//灏忓湴鍥句笂鍙戦?佸姩鎬佺敓鎴愮殑npc
		fire.pb.timer.AbstractScheduledActivity.sendActivityNpcToMiniMap(sceneid, roleid);
		
		//褰撳墠澶勪簬鎶曠エ涓?   瑙掕壊娌℃湁鎶曠エ杩? 瑙掕壊绛夌骇澶т簬30绾у埆
		xbean.Properties prop =  xtable.Properties.select(roleid);
		Integer curlevel = prop.getLevel();

		//鍚屾huobansize鍒癛ole
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
		//鏅哄姏璇曠粌妫?娴?
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
		
		//涓婄嚎鎻愰啋鎺ㄩ??
		TuiSongNotifyManager.getInstance().roleLogin(roleid);
		
		//绀煎寘鎻愰啋
		GiftBagMgr.getInstance().roleLogin(roleid, curlevel);
		
		//鍐犲啗璇曠偧涓婄嚎鎷変汉
		//杩欓噷澶勭悊涓?涓嬪啝鍐涜瘯鐐肩殑涓婄嚎鎷変汉
		if (curlevel >= WinnerManager.MIN_LEVEL) {
			WinnerManager.getInstance().sendWinnerCallPlayer(roleid);
		}
		
		new fire.pb.clan.fight.PRoleOnline(roleid).submit(); //宸ヤ細鎴樿鑹蹭笂绾? by changhao	
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


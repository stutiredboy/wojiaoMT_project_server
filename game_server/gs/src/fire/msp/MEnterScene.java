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
 * 濞存粏娅ｆ晶鎸庣▔婵犲嫬娈犻柨娑樿嫰濠э拷闁哄拋鍨伴ˇ鈺呮偠閸℃鏆氭慨锝嗘礀閹宕ラ幋锟�?閺勫繒甯嗛柛娆愬灦椤掓繂鈽夐崼鐔剁礀
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
		
		//濞存粏娅ｆ晶鎸庣▔婵犲嫬娈犻柨娑樼焸濡诧附瀵煎鍥ㄧゲ闁稿繒顒茬槐娆撳即鐎涙ɑ鐓�閻熸瑦甯熸竟濠囨⒓閻斿墎绀婂ǎ鍥ｅ墲娴煎懘鏁嶆径娑氱闁搞儳濮崇拹鐔兼焻閺勫繒甯嗛梻鍐枍缁辩偤鎯冮崟顏冪箚闁诡収鍨甸々锔界瑹濠靛﹦顩柛锔芥緲濞存﹢姊奸悢鍓佺濞ｅ洠鍓濇导鍛存晬鐏炴儳顣插ù鐘劚濠�顏堝礂閺堢數顓洪柛姘椤︹晠鎮堕崱顓犵闁搞儳濮崇拹鐔煎礂閺堜絻鍘悷鏇氱窔閺�锝夋⒓閻斿墎绀婇梺澶哥筏缁辨繈骞�?濞寸姰鍎辩槐鎾愁潰閵夈儺妲遍柣锟�?
		new fire.pb.team.PRoleOnline(roleid).submit();
		
		
		//闁告搩鍨卞﹢鐗堝緞閸曨厽鍊�
		new fire.pb.instancezone.PRoleOnline(roleid,sceneid).submit();
		
//		new fire.pb.mission.instance.PRoleOnline(roleid, sceneid).submit();
		
		//閻忓繐绻愬﹢鎾炊閸欍儳鐟愰柛娆愬灴?娴ｇ袟闁诡兛鑳堕弫鎾诲箣閹邦喗鐣眓pc
		fire.pb.timer.AbstractScheduledActivity.sendActivityNpcToMiniMap(sceneid, roleid);
		
		//鐟滅増鎸告晶鐘冲緞閸曨亞鑹鹃柟鑸垫礈閵堛劍绋�?   閻熸瑦甯熸竟濠傗柦閳╁啯绠掗柟鑸垫礈閵堛劍娼�? 閻熸瑦甯熸竟濠勭驳婢跺矂鐛撳鍫嗗倻鑹�30缂佺嫏鍐ㄧ劶
		xbean.Properties prop =  xtable.Properties.select(roleid);
		Integer curlevel = prop.getLevel();

		//闁告艾鏈鐎恥obansize闁告帞娅卭le
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
		//闁哄懎鎼慨蹇曟嫚閺囩姷鐭婃俊锟�?婵烇拷?
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
		
		//濞戞挸锕﹂崵搴ㄥ箵閹版澘鏅柟鎭掑姂??
		TuiSongNotifyManager.getInstance().roleLogin(roleid);
		
		//缂侊拷閻撳骸鐦堕柟缁樺姍閸燂拷
		GiftBagMgr.getInstance().roleLogin(roleid, curlevel);
		
		//闁告劗濮撮崯妤冩嫚閺囩姴浠瑰☉鎾筹功閸ゅ酣骞忔径澶嬬溄
		//閺夆晜鐟╅崳閿嬪緞閸曨厽鍊炲☉锟�?濞戞挸顑呴崯婵嬪礃濞戞粎妲搁柣鎰亹濞堟垶绋夋繝鍕疇闁瑰嘲顦Ч锟�
		if (curlevel >= WinnerManager.MIN_LEVEL) {
			WinnerManager.getInstance().sendWinnerCallPlayer(roleid);
		}
		
		new fire.pb.clan.fight.PRoleOnline(roleid).submit(); //鐎规悶鍎扮槐浼村箣濡娼￠柤纭呭紦缁楀倻鐥�? by changhao	
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


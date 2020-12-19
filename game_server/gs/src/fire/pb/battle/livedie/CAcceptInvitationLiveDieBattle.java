
package fire.pb.battle.livedie;

import org.apache.log4j.Logger;

import fire.pb.PropRole;
import fire.pb.talk.MessageMgr;
import gnet.link.Onlines;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAcceptInvitationLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAcceptInvitationLiveDieBattle extends __CAcceptInvitationLiveDieBattle__ {
	@Override
	protected void process() {
		//纭畾鏄惁鎺ュ彈鎴樹功
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				Long hostid=xtable.Livedie2key.select(guestid);
				//鍒ゆ柇鏄惁鏈変笅鎴樹功鐨勪汉
				if(hostid==null){
					return false;
				}
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(guestid,true).getName();
				if(hostname==null||guestname==null){
					return false;
				}
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(guestid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				
				//鑾峰緱涓嬫垬涔︿俊鎭紝鍒ゆ柇鏄惁杩囨湡
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				if(hostliveDieRoleInfo==null){
					return false;
				}
				if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
					logger.info("鎴樹功宸茬粡杩囨湡浜?");
					return false;
				}
				//琚寫鎴樼帺瀹跺鏋滄嫆缁濇寫鎴橈紝浼氬脊鍑虹郴缁熼閬撴彁绀篨XX鑳嗘?簡涓嶆暍涓嶻YY涓?鎴橈紝濡傛灉鎺ュ彈鎸戞垬锛屽垯寮瑰嚭绯荤粺棰戦亾鎻愮ずXXX鎺ュ彈浜哬YY鐨勬寫鎴橈紝涓庝粬涓?鎴?
				if(acceptresult==1){//鎺ュ彈
					hostliveDieRoleInfo.setAcceptflag(1);
					MessageMgr.sendSystemMsg(162067,Arrays.asList(guestname,hostname));
					SAcceptInvitationLiveDieBattle sAcceptInvitationLiveDieBattle=new SAcceptInvitationLiveDieBattle();
					Onlines.getInstance().send(guestid, sAcceptInvitationLiveDieBattle);
					//缁欏ソ鍙嬫彁绀?
					MessageMgr.psendSystemMessageToRole(hostid,162115, Arrays.asList(guestname));
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162114, Arrays.asList(guestname));
					//娣诲姞鎴樻枟
					LiveDieMange.liveDieRoleids.put(hostid, guestid);
				}else{
					xtable.Livedie2key.remove(guestid);
					xtable.Livedieroleinfotab.remove(hostid);
					//瀵规柟涓嶆暍杩庢垬鍒欐妸閽辫繕缁欏ス
					fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
					int cost=LiveDieMange.getLiveDieCostMoney();
					bag.addSysMoney(cost, "鐢熸鎴橀??鍥炴娂閲?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shengsizhanyajin, 0);
					//缁欏ソ鍙嬫彁绀?
					MessageMgr.psendSystemMessageToRole(hostid, 162087, Arrays.asList(guestname));
					MessageMgr.sendSystemMsg(162068,Arrays.asList(guestname,hostname));
					logger.info("鐢熸鎴橈紝瀵规墜鎷掔粷鎸戞垬锛岄??鍥炴娂閲?,瑙掕壊id"+hostid+"閲戦挶鏁伴噺"+cost);
				}
				return true;
			};
		}.submit();
	}
	public static final Logger logger = Logger.getLogger("BATTLE");
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793837;

	public int getType() {
		return 793837;
	}

	public long sourceid; // 目标玩家id
	public int acceptresult; // 0拒绝  1接受

	public CAcceptInvitationLiveDieBattle() {
	}

	public CAcceptInvitationLiveDieBattle(long _sourceid_, int _acceptresult_) {
		this.sourceid = _sourceid_;
		this.acceptresult = _acceptresult_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(sourceid);
		_os_.marshal(acceptresult);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		sourceid = _os_.unmarshal_long();
		acceptresult = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAcceptInvitationLiveDieBattle) {
			CAcceptInvitationLiveDieBattle _o_ = (CAcceptInvitationLiveDieBattle)_o1_;
			if (sourceid != _o_.sourceid) return false;
			if (acceptresult != _o_.acceptresult) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)sourceid;
		_h_ += acceptresult;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(sourceid).append(",");
		_sb_.append(acceptresult).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAcceptInvitationLiveDieBattle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(sourceid - _o_.sourceid);
		if (0 != _c_) return _c_;
		_c_ = acceptresult - _o_.acceptresult;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


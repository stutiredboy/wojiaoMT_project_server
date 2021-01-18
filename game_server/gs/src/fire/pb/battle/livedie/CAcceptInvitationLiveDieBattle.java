
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
		//绾喖鐣鹃弰顖氭儊閹恒儱褰堥幋妯瑰姛
		final long guestid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (guestid <= 0)
			return;
		
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				Long hostid=xtable.Livedie2key.select(guestid);
				//閸掋倖鏌囬弰顖氭儊閺堝绗呴幋妯瑰姛閻ㄥ嫪姹�
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
				
				//閼惧嘲绶辨稉瀣灛娑旓缚淇婇幁顖ょ礉閸掋倖鏌囬弰顖氭儊鏉╁洦婀�
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				if(hostliveDieRoleInfo==null){
					return false;
				}
				if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()>LiveDieMange.getLiveDieTime()){
					logger.info("閹存ü鍔熷鑼病鏉╁洦婀℃禍?");
					return false;
				}
				//鐞氼偅瀵幋妯煎负鐎硅泛顩ч弸婊勫珕缂佹繃瀵幋姗堢礉娴兼艾鑴婇崙铏归兇缂佺喖顣堕柆鎾村絹缁�绡╔X閼冲棙?顖欑啊娑撳秵鏆嶆稉宥籝Y娑�?閹存﹫绱濇俊鍌涚亯閹恒儱褰堥幐鎴炲灛閿涘苯鍨鐟板毉缁崵绮烘０鎴︿壕閹绘劗銇歑XX閹恒儱褰堟禍鍝琘Y閻ㄥ嫭瀵幋姗堢礉娑撳簼绮稉?閹�?
				if(acceptresult==1){//閹恒儱褰�
					hostliveDieRoleInfo.setAcceptflag(1);
					MessageMgr.sendSystemMsg(162067,Arrays.asList(guestname,hostname));
					SAcceptInvitationLiveDieBattle sAcceptInvitationLiveDieBattle=new SAcceptInvitationLiveDieBattle();
					Onlines.getInstance().send(guestid, sAcceptInvitationLiveDieBattle);
					//缂佹瑥銈介崣瀣絹缁�?
					MessageMgr.psendSystemMessageToRole(hostid,162115, Arrays.asList(guestname));
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162114, Arrays.asList(guestname));
					//濞ｈ濮為幋妯绘灍
					LiveDieMange.liveDieRoleids.put(hostid, guestid);
				}else{
					xtable.Livedie2key.remove(guestid);
					xtable.Livedieroleinfotab.remove(hostid);
					//鐎佃鏌熸稉宥嗘殟鏉╁孩鍨崚娆愬Ω闁借精绻曠紒娆忋偣
					fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
					int cost=LiveDieMange.getLiveDieCostMoney();
					bag.addSysMoney(cost, "閻㈢喐顒撮幋姗�??閸ョ偞濞傞柌?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_shengsizhanyajin, 0);
					//缂佹瑥銈介崣瀣絹缁�?
					MessageMgr.psendSystemMessageToRole(hostid, 162087, Arrays.asList(guestname));
					MessageMgr.sendSystemMsg(162068,Arrays.asList(guestname,hostname));
					logger.info("閻㈢喐顒撮幋姗堢礉鐎佃澧滈幏鎺旂卜閹告垶鍨敍宀�??閸ョ偞濞傞柌?,鐟欐帟澹奿d"+hostid+"闁叉垿鎸堕弫浼村櫤"+cost);
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


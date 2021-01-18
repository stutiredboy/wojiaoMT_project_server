
package fire.pb.battle.livedie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import fire.pb.PropRole;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.talk.MessageMgr;
import fire.pb.title.COffTitle;
import gnet.link.Onlines;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationLiveDieBattleOK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationLiveDieBattleOK extends __CInvitationLiveDieBattleOK__ {
	public static final Logger logger = Logger.getLogger("BATTLE");
	@Override
	protected void process() {
		//绾喖鐣鹃弰顖氭儊娑撳鍨稊?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//閸掋倖鏌囬惄顔界垼閻溾晛顔嶉弰顖氭儊閸︺劎鍤�
				Role gRole = RoleManager.getInstance().getRoleByID(objectid);
				if (gRole == null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				xbean.Properties guestprop=xtable.Properties.select(objectid);
				if(guestprop==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//婵″倹鐏夐懛顏勭箒闊偂绗傞張澶屾晸濮濈粯鍨粔鏉垮娇閿涘奔绗夐懗鎴掔瑓閹存ü鍔�
				fire.pb.PropRole hostprole = new fire.pb.PropRole(hostid, true);
				Role hostrole = RoleManager.getInstance().getRoleByID(hostid);
				if(hostrole != null){
					if(COffTitle.isLiveDieTitle(hostprole)){
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162088, null);
						return false;
					}
				}
				//鏉╂瑩鍣烽棁?鐟曚礁鍨介弬顓熷灉閺勵垰鎯佸鑼病娑撳绻冮幋妯瑰姛
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
				if(hostliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(hostliveDieRoleInfo.getObjectid(),true).getName();
						if(objectid==hostliveDieRoleInfo.getObjectid()){
							//閹绘劗銇氬鑼病閸欐垿?浣界箖162073
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162073, Arrays.asList(name));
						}else{
							//閹绘劗銇氬鑼病閸欐垿?浣界箖162074
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162074, Arrays.asList(name));
						}
						return false;
					}
				}
				//閸掋倖鏌囬幋鎴炴Ц閸氾箑鍑＄紒蹇斿复閸欐绻冮崚顐℃眽閻ㄥ嫭鍨稊?
				Long selfid=xtable.Livedie2key.select(hostid);
				if(selfid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(selfid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(selfid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162076, Arrays.asList(name));
						return false;
					}
				}
				//閻╊喗鐖ｉ煬顐＄瑐閺堝鏁撳缁樺灛缁夋澘褰块敍灞肩瑝閼虫垝绗呴幋妯瑰姛
				fire.pb.PropRole guestprole = new fire.pb.PropRole(objectid, true);
				if(COffTitle.isLiveDieTitle(guestprole)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162089, null);
					return false;
				}
				//閸掋倖鏌囬惄顔界垼閺勵垰鎯佹稉瀣箖閹存ü鍔�
				xbean.LiveDieRoleInfo geustliveDieRoleInfo=xtable.Livedieroleinfotab.select(objectid);
				if(geustliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-geustliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(objectid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
						return false;
					}
				}
				//閻╊喗鐖ｉ弰顖氭儊閹恒儱褰堟禍鍡楀焼娴滆櫣娈戦幋妯瑰姛
				Long otherid=xtable.Livedie2key.select(objectid);
				if(otherid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(otherid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						if(otherLiveDieRoleInfo.getObjectid()==hostid){
							String name=new PropRole(objectid,true).getName();
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162075, Arrays.asList(name));
							return false;
						}else{
							String name=new PropRole(objectid,true).getName();
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
							return false;
						}
					}
				}
				//闂�?鐟曚線鏀�
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(objectid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				//閹碉綁娅庨柧璺虹
				fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
				int cost=LiveDieMange.getLiveDieCostMoney();
				if(bag.getMoney()<cost){
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				if (bag.subMoney(-cost, "娑撳鍨稊锔藉⒏闂勩倝鎽辩敮?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_xiazhanshu, 0) != -cost) {
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				//娣囨繂鐡ㄩ弫鐗堝祦鎼�?
				if(hostliveDieRoleInfo==null){
					hostliveDieRoleInfo=xbean.Pod.newLiveDieRoleInfo();
					xtable.Livedieroleinfotab.insert(hostid, hostliveDieRoleInfo);
				}
				hostliveDieRoleInfo.setObjectid(objectid);
				hostliveDieRoleInfo.setSelecttype(selecttype);
				hostliveDieRoleInfo.setInvitationtime(System.currentTimeMillis());
				hostliveDieRoleInfo.setAcceptflag(0);
				
				//閹绘帒鍙嗛崗瀹犱粓鐞�?
				Long object=xtable.Livedie2key.get(objectid);
				if(object==null){
					xtable.Livedie2key.insert(objectid, hostid);
				}else{
					//閺冨爼妫挎潻鍥ㄦ埂娴滃棴绱濋柌宥嗘煀鐠佸墽鐤嗛崐?
					xtable.Livedie2key.remove(objectid);
					xtable.Livedie2key.insert(objectid, hostid);
				}
				SInvitationLiveDieBattleOK sInvitationLiveDieBattleOK =new SInvitationLiveDieBattleOK();
				sInvitationLiveDieBattleOK.sourceid=hostid;
				sInvitationLiveDieBattleOK.sourcename=hostprole.getName();
				sInvitationLiveDieBattleOK.selecttype=selecttype;
				Onlines.getInstance().send(objectid, sInvitationLiveDieBattleOK);
				
				//閸欐垿?浣洪兇缂佺喎鍙曢崨?
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(objectid,true).getName();
				MessageMgr.sendSystemMsg(162066,Arrays.asList(hostname,guestname));
				
				logger.info("閻㈢喐顒撮幋姗堢礉娑撳鍨稊?,鐟欐帟澹奿d"+hostid+"\t鐎佃澧渋d"+objectid+"\t闁叉垿鎸堕弫浼村櫤"+cost);
				return true;
			};
		}.submit();
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793835;

	public int getType() {
		return 793835;
	}

	public long objectid; // 目标玩家id
	public int selecttype; // 0单人   1组队

	public CInvitationLiveDieBattleOK() {
	}

	public CInvitationLiveDieBattleOK(long _objectid_, int _selecttype_) {
		this.objectid = _objectid_;
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(objectid);
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		objectid = _os_.unmarshal_long();
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationLiveDieBattleOK) {
			CInvitationLiveDieBattleOK _o_ = (CInvitationLiveDieBattleOK)_o1_;
			if (objectid != _o_.objectid) return false;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)objectid;
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(objectid).append(",");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CInvitationLiveDieBattleOK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(objectid - _o_.objectid);
		if (0 != _c_) return _c_;
		_c_ = selecttype - _o_.selecttype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


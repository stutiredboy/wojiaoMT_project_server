
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
		//纭畾鏄惁涓嬫垬涔?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//鍒ゆ柇鐩爣鐜╁鏄惁鍦ㄧ嚎
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
				//濡傛灉鑷繁韬笂鏈夌敓姝绘垬绉板彿锛屼笉鑳戒笅鎴樹功
				fire.pb.PropRole hostprole = new fire.pb.PropRole(hostid, true);
				Role hostrole = RoleManager.getInstance().getRoleByID(hostid);
				if(hostrole != null){
					if(COffTitle.isLiveDieTitle(hostprole)){
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162088, null);
						return false;
					}
				}
				//杩欓噷闇?瑕佸垽鏂垜鏄惁宸茬粡涓嬭繃鎴樹功
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
				if(hostliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(hostliveDieRoleInfo.getObjectid(),true).getName();
						if(objectid==hostliveDieRoleInfo.getObjectid()){
							//鎻愮ず宸茬粡鍙戦?佽繃162073
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162073, Arrays.asList(name));
						}else{
							//鎻愮ず宸茬粡鍙戦?佽繃162074
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162074, Arrays.asList(name));
						}
						return false;
					}
				}
				//鍒ゆ柇鎴戞槸鍚﹀凡缁忔帴鍙楄繃鍒汉鐨勬垬涔?
				Long selfid=xtable.Livedie2key.select(hostid);
				if(selfid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(selfid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(selfid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162076, Arrays.asList(name));
						return false;
					}
				}
				//鐩爣韬笂鏈夌敓姝绘垬绉板彿锛屼笉鑳戒笅鎴樹功
				fire.pb.PropRole guestprole = new fire.pb.PropRole(objectid, true);
				if(COffTitle.isLiveDieTitle(guestprole)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162089, null);
					return false;
				}
				//鍒ゆ柇鐩爣鏄惁涓嬭繃鎴樹功
				xbean.LiveDieRoleInfo geustliveDieRoleInfo=xtable.Livedieroleinfotab.select(objectid);
				if(geustliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-geustliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(objectid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
						return false;
					}
				}
				//鐩爣鏄惁鎺ュ彈浜嗗埆浜虹殑鎴樹功
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
				//闇?瑕侀攣
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(objectid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				//鎵ｉ櫎閾跺竵
				fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
				int cost=LiveDieMange.getLiveDieCostMoney();
				if(bag.getMoney()<cost){
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				if (bag.subMoney(-cost, "涓嬫垬涔︽墸闄ら摱甯?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_xiazhanshu, 0) != -cost) {
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				//淇濆瓨鏁版嵁搴?
				if(hostliveDieRoleInfo==null){
					hostliveDieRoleInfo=xbean.Pod.newLiveDieRoleInfo();
					xtable.Livedieroleinfotab.insert(hostid, hostliveDieRoleInfo);
				}
				hostliveDieRoleInfo.setObjectid(objectid);
				hostliveDieRoleInfo.setSelecttype(selecttype);
				hostliveDieRoleInfo.setInvitationtime(System.currentTimeMillis());
				hostliveDieRoleInfo.setAcceptflag(0);
				
				//鎻掑叆鍏宠仈琛?
				Long object=xtable.Livedie2key.get(objectid);
				if(object==null){
					xtable.Livedie2key.insert(objectid, hostid);
				}else{
					//鏃堕棿杩囨湡浜嗭紝閲嶆柊璁剧疆鍊?
					xtable.Livedie2key.remove(objectid);
					xtable.Livedie2key.insert(objectid, hostid);
				}
				SInvitationLiveDieBattleOK sInvitationLiveDieBattleOK =new SInvitationLiveDieBattleOK();
				sInvitationLiveDieBattleOK.sourceid=hostid;
				sInvitationLiveDieBattleOK.sourcename=hostprole.getName();
				sInvitationLiveDieBattleOK.selecttype=selecttype;
				Onlines.getInstance().send(objectid, sInvitationLiveDieBattleOK);
				
				//鍙戦?佺郴缁熷叕鍛?
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(objectid,true).getName();
				MessageMgr.sendSystemMsg(162066,Arrays.asList(hostname,guestname));
				
				logger.info("鐢熸鎴橈紝涓嬫垬涔?,瑙掕壊id"+hostid+"\t瀵规墜id"+objectid+"\t閲戦挶鏁伴噺"+cost);
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


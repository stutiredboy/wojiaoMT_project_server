
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
		//缁绢収鍠栭悾楣冨及椤栨碍鍎婂☉鎾愁儐閸剚绋�?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闁告帇鍊栭弻鍥儎椤旂晫鍨奸柣婧炬櫅椤斿秹寮伴姘剨闁革负鍔庨崵锟�
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
				//濠碘�冲�归悘澶愭嚊椤忓嫮绠掗棅顒夊亗缁楀倿寮垫径灞炬櫢婵繄绮崹顒傜矓閺夊灝濞囬柨娑樺缁楀鎳楅幋鎺旂憮闁瑰瓨眉閸旓拷
				fire.pb.PropRole hostprole = new fire.pb.PropRole(hostid, true);
				Role hostrole = RoleManager.getInstance().getRoleByID(hostid);
				if(hostrole != null){
					if(COffTitle.isLiveDieTitle(hostprole)){
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162088, null);
						return false;
					}
				}
				//閺夆晜鐟╅崳鐑芥?閻熸洑绀侀崹浠嬪棘椤撶喎鐏夐柡鍕靛灠閹礁顔忛懠顒傜梾濞戞挸顑堢换鍐箣濡懓濮�
				xbean.LiveDieRoleInfo hostliveDieRoleInfo=xtable.Livedieroleinfotab.select(hostid);
				if(hostliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-hostliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(hostliveDieRoleInfo.getObjectid(),true).getName();
						if(objectid==hostliveDieRoleInfo.getObjectid()){
							//闁圭粯鍔楅妵姘啅閼碱剛鐥呴柛娆愬灴?娴ｇ晫绠�162073
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162073, Arrays.asList(name));
						}else{
							//闁圭粯鍔楅妵姘啅閼碱剛鐥呴柛娆愬灴?娴ｇ晫绠�162074
							fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162074, Arrays.asList(name));
						}
						return false;
					}
				}
				//闁告帇鍊栭弻鍥箣閹寸偞笑闁告熬绠戦崙锛勭磼韫囨柨澶嶉柛娆愵殙缁诲啴宕氶鈩冪溄闁汇劌瀚崹顒佺▕?
				Long selfid=xtable.Livedie2key.select(hostid);
				if(selfid!=null){
					xbean.LiveDieRoleInfo otherLiveDieRoleInfo=xtable.Livedieroleinfotab.select(selfid);
					if(otherLiveDieRoleInfo!=null&&System.currentTimeMillis()-otherLiveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(selfid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162076, Arrays.asList(name));
						return false;
					}
				}
				//闁烩晩鍠楅悥锝夌叕椤愶紕鐟愰柡鍫濐槺閺佹挸顫㈢紒妯虹仜缂佸婢樿ぐ鍧楁晬鐏炶偐鐟濋柤铏灊缁楀懘骞嬪Ο鐟板
				fire.pb.PropRole guestprole = new fire.pb.PropRole(objectid, true);
				if(COffTitle.isLiveDieTitle(guestprole)){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162089, null);
					return false;
				}
				//闁告帇鍊栭弻鍥儎椤旂晫鍨奸柡鍕靛灠閹焦绋夌�ｎ厾绠栭柟瀛樏奸崝锟�
				xbean.LiveDieRoleInfo geustliveDieRoleInfo=xtable.Livedieroleinfotab.select(objectid);
				if(geustliveDieRoleInfo!=null){
					if(System.currentTimeMillis()-geustliveDieRoleInfo.getInvitationtime()<LiveDieMange.getLiveDieTime()){
						String name=new PropRole(objectid,true).getName();
						fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162077, Arrays.asList(name));
						return false;
					}
				}
				//闁烩晩鍠楅悥锝夊及椤栨碍鍎婇柟鎭掑劚瑜板牊绂嶉崱妤�鐒煎ù婊嗘濞堟垿骞嬪Ο鐟板
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
				//闂傦拷?閻熸洑绶氶弨锟�
				List<Long> list = new ArrayList<Long>();
				list.add(hostid);
				list.add(objectid);
				mkdb.Lockeys.lock(mkdb.Lockeys.get(xtable.Locks.ROLELOCK, list));
				//闁圭缍佸▍搴ㄦ煣鐠鸿櫣顏�
				fire.pb.item.Pack bag = new fire.pb.item.Pack(hostid, false);
				int cost=LiveDieMange.getLiveDieCostMoney();
				if(bag.getMoney()<cost){
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				if (bag.subMoney(-cost, "濞戞挸顑嗛崹顒佺▕閿旇棄鈷忛梻鍕╁�濋幗杈╂暜?", fire.log.enums.YYLoggerTuJingEnum.tujing_Value_xiazhanshu, 0) != -cost) {
//					MessageMgr.sendMsgNotify(hostid, 145005, null);
					return false;
				}
				hostliveDieRoleInfo=xtable.Livedieroleinfotab.get(hostid);
				//濞ｅ洦绻傞悺銊╁极閻楀牆绁﹂幖锟�?
				if(hostliveDieRoleInfo==null){
					hostliveDieRoleInfo=xbean.Pod.newLiveDieRoleInfo();
					xtable.Livedieroleinfotab.insert(hostid, hostliveDieRoleInfo);
				}
				hostliveDieRoleInfo.setObjectid(objectid);
				hostliveDieRoleInfo.setSelecttype(selecttype);
				hostliveDieRoleInfo.setInvitationtime(System.currentTimeMillis());
				hostliveDieRoleInfo.setAcceptflag(0);
				
				//闁圭粯甯掗崣鍡涘礂鐎圭姳绮撻悶锟�?
				Long object=xtable.Livedie2key.get(objectid);
				if(object==null){
					xtable.Livedie2key.insert(objectid, hostid);
				}else{
					//闁哄啫鐖煎Λ鎸庢交閸ャ劍鍩傚ù婊冩４缁辨繈鏌屽鍡樼厐閻犱礁澧介悿鍡涘磹?
					xtable.Livedie2key.remove(objectid);
					xtable.Livedie2key.insert(objectid, hostid);
				}
				SInvitationLiveDieBattleOK sInvitationLiveDieBattleOK =new SInvitationLiveDieBattleOK();
				sInvitationLiveDieBattleOK.sourceid=hostid;
				sInvitationLiveDieBattleOK.sourcename=hostprole.getName();
				sInvitationLiveDieBattleOK.selecttype=selecttype;
				Onlines.getInstance().send(objectid, sInvitationLiveDieBattleOK);
				
				//闁告瑦鍨�?娴ｆ椽鍏囩紓浣哄枎閸欐洟宕�?
				String hostname=new PropRole(hostid,true).getName();
				String guestname=new PropRole(objectid,true).getName();
				MessageMgr.sendSystemMsg(162066,Arrays.asList(hostname,guestname));
				
				logger.info("闁汇垻鍠愰鎾箣濮楀牏绀夊☉鎾愁儐閸剚绋�?,閻熸瑦甯熸竟濂縟"+hostid+"\t閻庝絻顫夋晶娓媎"+objectid+"\t闂佸弶鍨块幐鍫曞极娴兼潙娅�"+cost);
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



package fire.pb.battle.livedie;

import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import gnet.link.Onlines;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CInvitationLiveDieBattle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CInvitationLiveDieBattle extends __CInvitationLiveDieBattle__ {
	@Override
	protected void process() {
		//濞戞挸顑嗛崹顒佺▕?
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (hostid <= 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() throws Exception {
				//闁告帇鍊栭弻鍥╃驳婢跺矂鐛撻梻锟�?婵拷?
				xbean.Properties hostprop=xtable.Properties.select(hostid);
				if(hostprop==null){
					return false;
				}
				if(hostprop.getLevel()<LiveDieMange.getLiveDieLevel()){
					return false;
				}
				
				//闁告帇鍊栭弻鍥儎椤旂晫鍨奸柣婧炬櫅椤斿秹寮伴姘剨閻庢稒锚濠�锟�
				Long objectid;
				try {
					objectid=Long.parseLong(idorname);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					objectid=xtable.Rolename2key.select(idorname);
				}
				if(objectid==null){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
					return false;
				}
				//闁煎浜滅换浣圭▔瀹ュ牆鍘撮梺锟�?閻犲洨鏌夐崵婊冾啅?
				if(hostid==objectid){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 166006, 0, null);
					return false;
				}
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
				//闁告帇鍊栭弻鍥╋拷浣冾潐閺岀喓绮垫径宀勭崜闁哄嫷鍨伴幆浣虹箔閿曪拷閹海鎲版担鍦勾
				if(guestprop.getLevel()<LiveDieMange.getLiveDieLevel()){
					fire.pb.talk.MessageMgr.sendMsgNotify(hostid,162078 , null);
					return false;
				}
				SInvitationLiveDieBattle sInvitationLiveDieBattle=new SInvitationLiveDieBattle();
				sInvitationLiveDieBattle.objectid=objectid;
				sInvitationLiveDieBattle.objectname=guestprop.getRolename();
				sInvitationLiveDieBattle.selecttype=selecttype;
				sInvitationLiveDieBattle.costmoney=LiveDieMange.getLiveDieCostMoney();
				Onlines.getInstance().send(hostid, sInvitationLiveDieBattle);
				
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793833;

	public int getType() {
		return 793833;
	}

	public java.lang.String idorname;
	public int selecttype; // 0单人   1组队

	public CInvitationLiveDieBattle() {
		idorname = "";
	}

	public CInvitationLiveDieBattle(java.lang.String _idorname_, int _selecttype_) {
		this.idorname = _idorname_;
		this.selecttype = _selecttype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(idorname, "UTF-16LE");
		_os_.marshal(selecttype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		idorname = _os_.unmarshal_String("UTF-16LE");
		selecttype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CInvitationLiveDieBattle) {
			CInvitationLiveDieBattle _o_ = (CInvitationLiveDieBattle)_o1_;
			if (!idorname.equals(_o_.idorname)) return false;
			if (selecttype != _o_.selecttype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += idorname.hashCode();
		_h_ += selecttype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(idorname.length()).append(",");
		_sb_.append(selecttype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


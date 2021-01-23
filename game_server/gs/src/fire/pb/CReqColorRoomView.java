
package fire.pb;
import fire.pb.common.SCommon;
import fire.pb.main.ConfigManager;

import java.util.Map;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqColorRoomView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqColorRoomView extends __CReqColorRoomView__ {
	@Override
	protected void process() {
		// protocol handle
		//閻犲洭鏀遍惇鐗堢閾忕懓鈷栭柡灞炬崄婢瑰﹦鎮伴敐鍡忔敵濞ｅ洠鍓濇导锟�
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
//				xbean.Properties prop=xtable.Properties.select(roleid);
//				if(prop==null){
//					return false;
//				}
//				SReqColorRoomView sReqColorRoomView=new SReqColorRoomView();
//				java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
//				for(xbean.RoleColorType type:list){
//					if(type!=null){
//						fire.pb.RoleColorType rolecolortype=new fire.pb.RoleColorType();
//						rolecolortype.colorpos1=type.getColorpos1();
//						rolecolortype.colorpos2=type.getColorpos2();
//						sReqColorRoomView.rolecolortypelist.add(rolecolortype);
//					}
//				}
//				int max=0;
//				Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
//				if(commonMap!=null){
//					SCommon sCommon=commonMap.get(228);
//					if(sCommon!=null){
//						max=Integer.parseInt(sCommon.getValue());
//					}
//				}
//				sReqColorRoomView.nummax=max;//闁哄本鎹佹竟濠傤潨鏉堛劎鍘查柡锟�?濠㈠爢锟�??
//				gnet.link.Onlines.getInstance().send(roleid, sReqColorRoomView);
				
				sendColorRoomInfo(roleid);
				
				return true;
			}
		}.submit();
		
	}
	
	/**
	 * 闁告瑦鍨�?娴ｅ锟藉倸顫滈崣妯圭箚闁癸拷?
	 * @param roleid
	 */
	public static void sendColorRoomInfo(long roleid){
		xbean.Properties prop=xtable.Properties.select(roleid);
		if(prop==null){
			return ;
		}
		SReqColorRoomView sReqColorRoomView=new SReqColorRoomView();
		java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
		//闁告帇鍊栭弻鍥ㄤ繆閸屾稓浜悶娑崇稻閳瑰秴鈻介埄鍐╃畳濠靛倹顨夐ˉ濠冪┍閳╁啩绱栭柨娑樼焸缁垳鎷嬮妶鍡樷枖缂侊拷妤﹀潡鐓╁☉鎾筹功濞堟垶绋�?濠碉拷?
		if(list.size()==0){
			xbean.RoleColorType rolecolortyoe=xbean.Pod.newRoleColorType();
			rolecolortyoe.setColorpos1(prop.getRolecolor1());
			rolecolortyoe.setColorpos2(prop.getRolecolor2());
			prop.getColorroomlist().add(rolecolortyoe);
		}
		
		
		
		for(xbean.RoleColorType type:list){
			if(type!=null){
				fire.pb.RoleColorType rolecolortype=new fire.pb.RoleColorType();
				rolecolortype.colorpos1=type.getColorpos1();
				rolecolortype.colorpos2=type.getColorpos2();
				sReqColorRoomView.rolecolortypelist.add(rolecolortype);
			}
		}
		int max=0;
		Map<Integer, SCommon> commonMap = ConfigManager.getInstance().getConf(SCommon.class);
		if(commonMap!=null){
			SCommon sCommon=commonMap.get(228);
			if(sCommon!=null){
				max=Integer.parseInt(sCommon.getValue());
			}
		}
		sReqColorRoomView.nummax=max;//闁哄本鎹佹竟濠傤潨鏉堛劎鍘查柡锟�?濠㈠爢锟�??
		gnet.link.Onlines.getInstance().send(roleid, sReqColorRoomView);
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786534;

	public int getType() {
		return 786534;
	}


	public CReqColorRoomView() {
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
		if (_o1_ instanceof CReqColorRoomView) {
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

	public int compareTo(CReqColorRoomView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


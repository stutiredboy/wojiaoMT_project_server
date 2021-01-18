
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
		//鐠囬攱鐪版禍铏瑰⒖閺屾捁澹婄悰锝嗏攳娣団剝浼�
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
//				sReqColorRoomView.nummax=max;//閺屾捁澹婂杈ㄧ厲閺�?婢堆�??
//				gnet.link.Onlines.getInstance().send(roleid, sReqColorRoomView);
				
				sendColorRoomInfo(roleid);
				
				return true;
			}
		}.submit();
		
	}
	
	/**
	 * 閸欐垿?浣姐�傚鍙樹繆閹�?
	 * @param roleid
	 */
	public static void sendColorRoomInfo(long roleid){
		xbean.Properties prop=xtable.Properties.select(roleid);
		if(prop==null){
			return ;
		}
		SReqColorRoomView sReqColorRoomView=new SReqColorRoomView();
		java.util.List<xbean.RoleColorType> list=prop.getColorroomlist();
		//閸掋倖鏌囨俊鍌涚亯鐞涳絾鈹嶅▽鈩冩箒婵傛顥婃穱鈩冧紖閿涘矂绮拋銈嗘▔缁�楦块煩娑撳﹦娈戞稉?婵�?
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
		sReqColorRoomView.nummax=max;//閺屾捁澹婂杈ㄧ厲閺�?婢堆�??
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


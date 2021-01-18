
package fire.pb;

import java.io.UnsupportedEncodingException;

import fire.pb.cross.CrossManager;
import fire.pb.role.PCreateRole;
import fire.pb.util.CheckName;

import org.apache.log4j.Logger;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateRole__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}


public class CCreateRole extends __CCreateRole__ {
	public static final Logger logger = Logger.getLogger("SYSTEM");
	
	private boolean  sendError(int err){
		final SCreateRoleError res=new SCreateRoleError();
		res.err=err;
		return gnet.link.Onlines.getInstance().sendResponse(this, res);
	}
	
	@Override
	protected void process() {
		if(CrossManager.getInstance().isInCrossServer()){
			logger.error("鐠恒劍婀囩粋浣诡剾閸掓稑缂撶憴鎺曞!!!");
			return;
		}
		
		if(!fire.pb.main.ConfigManager.isCanCreateRole) {
			sendError(SCreateRoleError.CREATE_CREATE_GM_FORBID);
			logger.error("GM瀹歌尙绮￠崗鎶芥４閸掓稑缂撶憴鎺曞!!!");
			return;
		}
		
		// protocol handle
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;		
		final xbean.User u = xtable.User.select(userID);
		// 濡�?閺屻儳甯虹�瑰爼?澶嬪閻ㄥ嫯顫楅懝韫瑢闂傘劍娣抽弰顖氭儊鐎电懓绨�
		final fire.pb.role.SCreateRoleConfig config = RoleConfigManager.getCreateRoleConfig(shape);
		if (config == null)
		{
			logger.error("-------------------------濞屸剝婀侀幍鎯у煂鐎电懓绨查惃鍕帳缂冾喗鏋冩禒?!!!--------"+shape);
			return;
		}
			
		if (!config.schools.contains(school))
		{
			logger.error("------"+shape+"-------------------濞屸剝婀侀幍鎯у煂鐎电懓绨查惃鍕捍娑�?!!!------"+school);
			return;
		}
		
		
		//濡�?閺屻儳鏁ら悽銊﹀煕閸氬秹鏆辨惔锔芥Ц閸氾箑鎮庨悶?
		int nameLen = CheckName.nameLen();
		int length=0;
		try {
			length=(new String(name.getBytes( "gb2312"), "ISO-8859-1")).length();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("閸氬秴鐡ч梹鍨娑撳秴顕�");
			return;
		} 
		
		
		if(length > nameLen){
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("閸氬秴鐡ч梹鍨娑撳秴顕�");
			return;
		}
		else if (length < CCreateRole.NAMELEN_MIN){
			sendError(SCreateRoleError.CREATE_SHORTLEN);
			logger.error("閸氬秴鐡ч梹鍨娑撳秴顕�");
			return;
		}
		
		int resultCode = fire.pb.util.CheckName.checkValid(name);
		if(resultCode == CheckName.WORD_ILLEGALITY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("閸欘亣鍏樻潏鎾冲弳2-7娑擃亙鑵戦弬鍥风礉4-14娑擃亣瀚抽弬鍥ㄥ灗閼板懌?浣规殶鐎涙鑻熸稉鏂剧瑝閼宠棄鎯堥張澶愭姜濞夋洖鐡х粭?");
			return;	
		}else if(resultCode == CheckName.SPECIAL_WORD_TOO_MANY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("閻楄鐣╃�涙顑佹潻鍥ь樋");
			return;
		}else if(resultCode == CheckName.NONE_CHARACTER){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("閸涜棄鎮曡箛鍛淬�忛崠鍛儓娑�?娑擃亝鐪界�涙鍨ㄩ懓鍛摟濮�?");
			return;
		}
		

		if(null != u){
			int roleNum = 0;
			for (Long rid : u.getIdlist()) {
				xbean.Properties prop = xtable.Properties.select(rid);
				if (prop.getDeletetime()==0)
					roleNum++;
			}
			if(roleNum >= PCreateRole.maxCreateRoleNum){
				logger.error("-----------------------鐟欐帟澹婇崚娑樼紦瀹歌尙绮℃潏鎯у煂閺�?婢堆勬殶");
				sendError(SCreateRoleError.CREATE_OVERCOUNT);
				return;
			}
		}
		
		
		
		final PCreateRole proc = new PCreateRole(this, userID, config.initequip);
		proc.submit();	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786435;

	public int getType() {
		return 786435;
	}

	public final static int NAMELEN_MAX = 14; // 名字的最大长度
	public final static int NAMELEN_MIN = 4; // 名字的最短长度

	public java.lang.String name; // 名称
	public int school; // 职业
	public int shape; // 角色id
	public java.lang.String code; // 招募码

	public CCreateRole() {
		name = "";
		code = "";
	}

	public CCreateRole(java.lang.String _name_, int _school_, int _shape_, java.lang.String _code_) {
		this.name = _name_;
		this.school = _school_;
		this.shape = _shape_;
		this.code = _code_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(name, "UTF-16LE");
		_os_.marshal(school);
		_os_.marshal(shape);
		_os_.marshal(code, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		name = _os_.unmarshal_String("UTF-16LE");
		school = _os_.unmarshal_int();
		shape = _os_.unmarshal_int();
		code = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CCreateRole) {
			CCreateRole _o_ = (CCreateRole)_o1_;
			if (!name.equals(_o_.name)) return false;
			if (school != _o_.school) return false;
			if (shape != _o_.shape) return false;
			if (!code.equals(_o_.code)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += name.hashCode();
		_h_ += school;
		_h_ += shape;
		_h_ += code.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(name.length()).append(",");
		_sb_.append(school).append(",");
		_sb_.append(shape).append(",");
		_sb_.append("T").append(code.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


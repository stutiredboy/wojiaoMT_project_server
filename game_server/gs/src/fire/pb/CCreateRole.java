
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
			logger.error("跨服禁止创建角色!!!");
			return;
		}
		
		if(!fire.pb.main.ConfigManager.isCanCreateRole) {
			sendError(SCreateRoleError.CREATE_CREATE_GM_FORBID);
			logger.error("GM已经关闭创建角色!!!");
			return;
		}
		
		// protocol handle
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;		
		final xbean.User u = xtable.User.select(userID);
		// �?查玩家�?�择的角色与门派是否对应
		final fire.pb.role.SCreateRoleConfig config = RoleConfigManager.getCreateRoleConfig(shape);
		if (config == null)
		{
			logger.error("-------------------------没有找到对应的配置文�?!!!--------"+shape);
			return;
		}
			
		if (!config.schools.contains(school))
		{
			logger.error("------"+shape+"-------------------没有找到对应的职�?!!!------"+school);
			return;
		}
		
		
		//�?查用用户名长度是否合�?
		int nameLen = CheckName.nameLen();
		int length=0;
		try {
			length=(new String(name.getBytes( "gb2312"), "ISO-8859-1")).length();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("名字长度不对");
			return;
		} 
		
		
		if(length > nameLen){
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("名字长度不对");
			return;
		}
		else if (length < CCreateRole.NAMELEN_MIN){
			sendError(SCreateRoleError.CREATE_SHORTLEN);
			logger.error("名字长度不对");
			return;
		}
		
		int resultCode = fire.pb.util.CheckName.checkValid(name);
		if(resultCode == CheckName.WORD_ILLEGALITY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("只能输入2-7个中文，4-14个英文或者�?�数字并且不能含有非法字�?");
			return;	
		}else if(resultCode == CheckName.SPECIAL_WORD_TOO_MANY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("特殊字符过多");
			return;
		}else if(resultCode == CheckName.NONE_CHARACTER){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("命名必须包含�?个汉字或者字�?");
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
				logger.error("-----------------------角色创建已经达到�?大数");
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

	public final static int NAMELEN_MAX = 14; // ���ֵ���󳤶�
	public final static int NAMELEN_MIN = 4; // ���ֵ���̳���

	public java.lang.String name; // ����
	public int school; // ְҵ
	public int shape; // ��ɫid
	public java.lang.String code; // ��ļ��

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


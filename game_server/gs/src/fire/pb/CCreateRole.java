
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
			logger.error("閻犳亽鍔嶅﹢鍥╃矉娴ｈ鍓鹃柛鎺撶☉缂傛挾鎲撮幒鏇烆棌!!!");
			return;
		}
		
		if(!fire.pb.main.ConfigManager.isCanCreateRole) {
			sendError(SCreateRoleError.CREATE_CREATE_GM_FORBID);
			logger.error("GM鐎规瓕灏欑划锟犲礂閹惰姤锛旈柛鎺撶☉缂傛挾鎲撮幒鏇烆棌!!!");
			return;
		}
		
		// protocol handle
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;		
		final xbean.User u = xtable.User.select(userID);
		// 婵★拷?闁哄被鍎崇敮铏癸拷鐟扮埣?婢跺顏ラ柣銊ュ椤鎳濋煫顓犵憿闂傚倶鍔嶅ǎ鎶藉及椤栨碍鍎婇悗鐢垫嚀缁拷
		final fire.pb.role.SCreateRoleConfig config = RoleConfigManager.getCreateRoleConfig(shape);
		if (config == null)
		{
			logger.error("-------------------------婵炲备鍓濆﹢渚�骞嶉幆褍鐓傞悗鐢垫嚀缁ㄦ煡鎯冮崟顖氬赋缂傚喚鍠楅弸鍐╃?!!!--------"+shape);
			return;
		}
			
		if (!config.schools.contains(school))
		{
			logger.error("------"+shape+"-------------------婵炲备鍓濆﹢渚�骞嶉幆褍鐓傞悗鐢垫嚀缁ㄦ煡鎯冮崟顔绘崓濞戯拷?!!!------"+school);
			return;
		}
		
		
		//婵★拷?闁哄被鍎抽弫銈夋偨閵婏箑鐓曢柛姘Ч閺嗚鲸鎯旈敂鑺バ﹂柛姘剧畱閹酣鎮�?
		int nameLen = CheckName.nameLen();
		int length=0;
		try {
			length=(new String(name.getBytes( "gb2312"), "ISO-8859-1")).length();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("闁告艾绉撮悺褔姊归崹顔碱唺濞戞挸绉撮锟�");
			return;
		} 
		
		
		if(length > nameLen){
			sendError(SCreateRoleError.CREATE_OVERLEN);
			logger.error("闁告艾绉撮悺褔姊归崹顔碱唺濞戞挸绉撮锟�");
			return;
		}
		else if (length < CCreateRole.NAMELEN_MIN){
			sendError(SCreateRoleError.CREATE_SHORTLEN);
			logger.error("闁告艾绉撮悺褔姊归崹顔碱唺濞戞挸绉撮锟�");
			return;
		}
		
		int resultCode = fire.pb.util.CheckName.checkValid(name);
		if(resultCode == CheckName.WORD_ILLEGALITY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闁告瑯浜ｉ崗妯绘綇閹惧啿寮�2-7濞戞搩浜欓懙鎴﹀棘閸ラ绀�4-14濞戞搩浜ｇ�氭娊寮崶銊ョ仐闁兼澘鎳�?娴ｈ娈堕悗娑欘殔閼荤喐绋夐弬鍓х憹闁煎疇妫勯幆鍫ュ嫉婢舵劖濮滄繛澶嬫礀閻⊙呯箔?");
			return;	
		}else if(resultCode == CheckName.SPECIAL_WORD_TOO_MANY){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闁绘顫夐悾鈺冿拷娑欘殘椤戜焦娼婚崶褜妯�");
			return;
		}else if(resultCode == CheckName.NONE_CHARACTER){
			sendError(SCreateRoleError.CREATE_INVALID);
			logger.error("闁告稖妫勯幃鏇＄疀閸涙番锟藉繘宕犻崨顓熷創濞戯拷?濞戞搩浜濋惇鐣岋拷娑欘殕閸ㄣ劑鎳撻崨顓犳憻婵拷?");
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
				logger.error("-----------------------閻熸瑦甯熸竟濠囧礆濞戞绱︾�规瓕灏欑划鈩冩綇閹冪厒闁猴拷?濠㈠爢鍕");
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


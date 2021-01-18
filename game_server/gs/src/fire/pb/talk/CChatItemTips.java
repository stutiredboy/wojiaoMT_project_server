
package fire.pb.talk;

import com.locojoy.base.Octets;







import fire.pb.HelpCountManage;
import fire.pb.circletask.CircleTask;
import fire.pb.circletask.anye.RoleAnYeTask;




// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CChatItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CChatItemTips extends __CChatItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (displayinfo == null || displayinfo.roleid < 0)
			return;
		if(displayinfo.displaytype == DisplayInfo.DISPLAY_TASK && 
				displayinfo.shopid == 2){
			//鏉╂瑩鍣锋径鍕倞瀵邦亞骞嗘禒璇插
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					boolean ret = CircleTask.getRoleSpecialQuest(displayinfo.roleid, displayinfo.uniqid, displayinfo.counterid, tips);
					if(ret) {
						psendWhileCommit(roleId, tips);
						return true;
					} else {
						psendWhileRollback(roleId, new SChatItemTips(displayinfo, new Octets()));
						return false;
					}
				}
			}.submit();
		} else if(displayinfo.displaytype == DisplayInfo.DISPLAY_TASK && 
				displayinfo.shopid == 3){
			//鏉╂瑩鍣锋径鍕倞閺嗘顧佹す顒佸灆閸ヮ澀鎹㈤崝?
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					//婢跺嫮鎮婄粵澶岄獓
					//濞ｈ濮為幓鏉戝И缁涘楠囬梽鎰煑
					int submiterLv = xtable.Properties.selectLevel(roleId);
					if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
						MessageMgr.sendMsgNotify(roleId, 145390, null);
						return false;
					}
					//閸掋倖鏌囬弰顖氭儊閹绘潙濮悧鈺佹惂濞嗏剝鏆熼弰顖氭儊濠�?
					if(!HelpCountManage.getInstance().canAddHelpGiveItemNum(roleId)){
						//閹绘劗銇氬☉鍫熶紖
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166088, null);
						return false;
					}
					//閸掋倖鏌囬惄顔界垼鐠囬攱鐪板▎鈩冩殶閺勵垰鎯佸鍙夊姬
			    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select(displayinfo.roleid);
			    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(displayinfo.roleid);
			    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
			    		MessageMgr.sendMsgNotify(roleId, 166093, null);
			    		return false;
			    	}
					
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					//tips:displayinfo閻ㄥ墖eamid閺勵垵鐤嗛弫?
					boolean ret = RoleAnYeTask.getRoleAnYeTask(roleId, displayinfo.roleid, displayinfo.uniqid, displayinfo.teamid, tips);
					if(ret) {
						psendWhileCommit(roleId, tips);
						return true;
					} else {
						psendWhileRollback(roleId, new SChatItemTips(displayinfo, new Octets()));
						return false;
					}
				}
			}.submit();
		} else {
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					SChatItemTips tips = new SChatItemTips();
					tips.tips = ChatChannel.getInstance().getOctets(roleId, displayinfo);
					if (tips.tips == null)
						return false;
					tips.displayinfo = displayinfo;
					psendWhileCommit(roleId, tips);
					//gnet.link.Onlines.getInstance().send(roleId, tips);
					return true;
				}
			}.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 792445;

	public int getType() {
		return 792445;
	}

	public fire.pb.talk.DisplayInfo displayinfo;

	public CChatItemTips() {
		displayinfo = new fire.pb.talk.DisplayInfo();
	}

	public CChatItemTips(fire.pb.talk.DisplayInfo _displayinfo_) {
		this.displayinfo = _displayinfo_;
	}

	public final boolean _validator_() {
		if (!displayinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(displayinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		displayinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CChatItemTips) {
			CChatItemTips _o_ = (CChatItemTips)_o1_;
			if (!displayinfo.equals(_o_.displayinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += displayinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(displayinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CChatItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = displayinfo.compareTo(_o_.displayinfo);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


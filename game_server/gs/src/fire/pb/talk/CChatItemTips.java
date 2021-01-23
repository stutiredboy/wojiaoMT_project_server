
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
			//閺夆晜鐟╅崳閿嬪緞閸曨厽鍊炵�甸偊浜為獮鍡樼鐠囨彃顫�
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
			//閺夆晜鐟╅崳閿嬪緞閸曨厽鍊為柡鍡橆殔椤т焦銇欓浣哥亞闁搞儺婢�閹广垽宕�?
			new mkdb.Procedure(){
				@Override
				protected boolean process(){
					//濠㈣泛瀚幃濠勭驳婢跺矂鐛�
					//婵烇綀顕ф慨鐐哄箵閺夋垵袠缂佹稑顦辨鍥⒔閹邦剙鐓�
					int submiterLv = xtable.Properties.selectLevel(roleId);
					if(submiterLv<fire.pb.circletask.PSubmitThings.getGiveHelpLevel()){
						MessageMgr.sendMsgNotify(roleId, 145390, null);
						return false;
					}
					//闁告帇鍊栭弻鍥及椤栨碍鍎婇柟缁樻綑婵亪鎮ч埡浣规儌婵炲棌鍓濋弳鐔煎及椤栨碍鍎婃繝锟�?
					if(!HelpCountManage.getInstance().canAddHelpGiveItemNum(roleId)){
						//闁圭粯鍔楅妵姘槈閸喍绱�
						fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 166088, null);
						return false;
					}
					//闁告帇鍊栭弻鍥儎椤旂晫鍨奸悹鍥敱閻澘鈻庨埄鍐╂闁哄嫷鍨伴幆浣割啅閸欏濮�
			    	xbean.helpcount taskrolehelpcount = xtable.Helpcount.select(displayinfo.roleid);
			    	int maxtaskrolehelpcount=HelpCountManage.getInstance().getHelpItemNumMax(displayinfo.roleid);
			    	if(taskrolehelpcount!=null&&taskrolehelpcount.getHelpitemnum()>=maxtaskrolehelpcount){
			    		MessageMgr.sendMsgNotify(roleId, 166093, null);
			    		return false;
			    	}
					
					SChatItemTips tips = new SChatItemTips();
					tips.displayinfo = displayinfo;
					//tips:displayinfo闁汇劌澧杄amid闁哄嫷鍨甸悿鍡涘极?
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


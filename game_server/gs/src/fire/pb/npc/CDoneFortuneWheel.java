
package fire.pb.npc;


import fire.pb.circletask.CircleTaskManager;
import fire.pb.fanpai.PPlayCardItemProc;
import fire.pb.map.Npc;
import fire.pb.map.SceneNpcManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDoneFortuneWheel__ extends mkio.Protocol { }

/** 玩家完成转盘,发给玩家奖励
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CDoneFortuneWheel extends __CDoneFortuneWheel__ {
	@Override
	protected void process() {
		final long	roleid = gnet.link.Onlines.getInstance().findRoleid(this);
        if(roleid<0) return;
        //閻╊喖澧犻弰顖滄暠婢堆嗘祮閻╂ɑ膩閸ф娼电拹鐔荤煑閸欐垿?浣割殯閸斿彉淇婇幁顖滅舶鐎广垺鍩涚粩?,閹�?娴犮儳鏁ap閺夈儱鐡ㄩ弨绶坰g,key閺勵垰顨涢崝杈╂畱缁鐎�(閻椻晛鎼�,缂佸繘鐛欓幋鏍尪),value
        //閺勭棳sgid.婢堆嗘祮閻╂娈戞總鏍уС娣団剝浼呴張?婵傝棄浠涢幋鎰閺嶉娈�,婵″倹鐏夌涵顔肩杽娑撳秳绔撮弽?,閸掓瑦鍧婇崝鐘辩娑擃亝鏌婇惃鍒緍otocal閺夈儱顦╅悶?,PFinishFortuneWheel
        //閸欘垯浜掗柌宥囨暏
//        java.util.Map<Integer, Integer> fortuneWheelMsgs=new java.util.HashMap<Integer, Integer>();
//        fortuneWheelMsgs.put(2, fire.pb.specialquest.SpecialQuestNpcMsg.SubmitQHYCSuccess);
        
        if(flag == 0){
        	fire.pb.PropRole prole = new fire.pb.PropRole(roleid, true);
        	Npc npc = SceneNpcManager.selectNpcByKey(npckey);
        	int masterid = CircleTaskManager.getInstance().getMasterMap().get(prole.getSchool()).masterid;
        	if (npc != null && npc.getNpcID() == masterid){
        	}
        	new PFinishFortuneWheel(roleid,npckey,taskid,succ).submit();
        }else{
			new PPlayCardItemProc(roleid).submit();
		}
      
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795457;

	public int getType() {
		return 795457;
	}

	public long npckey; // npckey为npc的唯一ID
	public int taskid; // 当前转盘的任务id
	public int succ; // 1表示正常完成,0表示玩家提前关闭了大转盘
	public byte flag; // 0 大转盘  1翻盘子

	public CDoneFortuneWheel() {
	}

	public CDoneFortuneWheel(long _npckey_, int _taskid_, int _succ_, byte _flag_) {
		this.npckey = _npckey_;
		this.taskid = _taskid_;
		this.succ = _succ_;
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		_os_.marshal(taskid);
		_os_.marshal(succ);
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		taskid = _os_.unmarshal_int();
		succ = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CDoneFortuneWheel) {
			CDoneFortuneWheel _o_ = (CDoneFortuneWheel)_o1_;
			if (npckey != _o_.npckey) return false;
			if (taskid != _o_.taskid) return false;
			if (succ != _o_.succ) return false;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		_h_ += taskid;
		_h_ += succ;
		_h_ += (int)flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(taskid).append(",");
		_sb_.append(succ).append(",");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CDoneFortuneWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = taskid - _o_.taskid;
		if (0 != _c_) return _c_;
		_c_ = succ - _o_.succ;
		if (0 != _c_) return _c_;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


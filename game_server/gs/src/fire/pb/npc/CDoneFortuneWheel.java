
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
        //闁烩晩鍠栨晶鐘诲及椤栨粍鏆犲鍫嗗棙绁柣鈺偵戣啯闁秆勵殕濞肩數鎷归悢鑽ょ厬闁告瑦鍨�?娴ｅ壊娈柛鏂垮綁娣囧﹪骞侀婊呰埗閻庡箍鍨洪崺娑氱博?,闁癸拷?濞寸姰鍎抽弫顦揳p闁哄鍎遍悺銊╁绩缁跺澃g,key闁哄嫷鍨伴〃娑㈠礉鏉堚晜鐣辩紒顐ヮ嚙閻庯拷(闁绘せ鏅涢幖锟�,缂備礁绻橀悰娆撳箣閺嶎厽灏�),value
        //闁哄嫮妫硈gid.濠㈠爢鍡樼ギ闁烩晜顭囧▓鎴炵附閺嵮冃″ǎ鍥ｅ墲娴煎懘寮�?濠靛倽妫勬禒娑㈠箣閹邦亞顏遍柡宥夘棑濞堬拷,濠碘�冲�归悘澶屾兜椤旇偐鏉藉☉鎾崇С缁旀挳寮�?,闁告帗鐟﹂崸濠囧礉閻樿京顏卞☉鎿冧簼閺屽﹪鎯冮崚绶峯tocal闁哄鍎遍ˇ鈺呮偠?,PFinishFortuneWheel
        //闁告瑯鍨禍鎺楁煂瀹ュ洦鏆�
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


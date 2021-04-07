
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CStartFortuneWheel__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CStartFortuneWheel extends __CStartFortuneWheel__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		fire.pb.map.Npc npc = fire.pb.map.SceneNpcManager.selectNpcByKey(npckey);
		if (npc ==null){
			fire.log.LogManager.logger.info("npc is null.npckey:"+npckey);
			return;
		}
		// protocol handle
		//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾剧粯绻涢幋鏃�鍤嶉柛銉墻閺佸洭鏌曡箛鏇炐㈤柣搴幖閳规垿鎮欓崣澶嗘灆婵炲瓨绮嶇划鎾诲箯閹达附鍋勫┑鍌氼槺閸炵敻姊洪崗鍏煎�愭繛浣冲嫭鍙忛柛銉墯閻撶喖鏌曢崼婵嬵�楁繛鍛Ч閺岋紕浠﹂崜褎鍒涢梺绯曟櫅鐎氭澘鐣峰锟介崺锟犲礃閻愵儷鐐烘⒒閸屾瑧鍔嶆俊鐐村缁傚秴鈻庨幋婵嗙亰濠电偛妫欓幐鎼佹嫅閻斿吋鐓ユ繝闈涙－濡叉悂骞嗛悢鍏尖拺闂傚牊渚楀Σ鍫曟煕鎼达絽鍔嬬紒鍌涘笚缁轰粙宕ㄦ繛鐐闂傚倸鍊搁悧濠勭矙閹烘绠归柟閭﹀幘缁犻箖鎮归崶鍥ф噽閺嗙姴顪冮妶搴″箹婵炲樊鍙冮妴渚�寮崼婵嬪敹濡炪倖鍔х徊鎯р枍瀹�鍕拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炴绱掑Ο缁樼彨闂備浇娉曢崳锕傚箯閿燂拷
		new PReqFortuneWheel(roleid, npckey,npc.getNpcID(),true,fire.pb.npc.NpcServices.FORTUNE_WHEEL).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795494;

	public int getType() {
		return 795494;
	}

	public long npckey; // 正在交互的Npckey

	public CStartFortuneWheel() {
	}

	public CStartFortuneWheel(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CStartFortuneWheel) {
			CStartFortuneWheel _o_ = (CStartFortuneWheel)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CStartFortuneWheel _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


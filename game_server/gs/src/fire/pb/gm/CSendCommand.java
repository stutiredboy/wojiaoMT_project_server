
package fire.pb.gm;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendCommand__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendCommand extends __CSendCommand__ {
	@Override
	protected void process() {
		final long gmroleid=gnet.link.Onlines.getInstance().findRoleid(this);
		if (gmroleid < 0)
			return;
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;
		final int localsid=((gnet.link.Dispatch)this.getContext()).linksid;
		GMInteface.execCommand(userID,gmroleid,localsid, cmd);
		//TODO:闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磸閿熸垝鐒︾换婵嬪磼濡や胶浜欐繝鐢靛仦閸ㄧ喖宕戦幘缁樻櫢闁芥ê顦伴崳鐣岀磼椤旇姤顥堢�规洘鍔欓弫鎾寸鐎ｎ偀鎷婚梺绋挎湰閻熝囁囬敃鍌涚厵閻犲泧鍛紵缂備緡鍠楅悷鈺呯嵁鐎ｎ喗鏅滈柤鎭掑劜閻濇牠姊绘笟锟藉褑澧濋梺鍝勬噺缁挸鐣烽弴鐔虹瘈闁搞儯鍔庨崢鎼佹⒑閸涘﹤濮傞柛鏂挎湰缁傚秵瀵肩�涙鍘垫俊鐐差儏妤犳悂宕㈤幘顔界厽婵炴垵宕▍宥囷拷瑙勬礀缂嶅﹪銆佸▎鎾崇煑闁靛／鍕剁础闂傚倸鍊搁崐鐑芥嚄閸撲焦鍏滈柛顐ｆ礀閻ょ偓绻濇繝鍌涘櫧闁活厽鐟╅弻鐔煎箲閹邦厾銆愰梺鎼炲妽缁诲牓寮婚妸鈺傚亞闁稿本绋戦锟�?
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 791433;

	public int getType() {
		return 791433;
	}

	public java.lang.String cmd;

	public CSendCommand() {
		cmd = "";
	}

	public CSendCommand(java.lang.String _cmd_) {
		this.cmd = _cmd_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(cmd, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		cmd = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendCommand) {
			CSendCommand _o_ = (CSendCommand)_o1_;
			if (!cmd.equals(_o_.cmd)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += cmd.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(cmd.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


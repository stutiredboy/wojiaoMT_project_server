
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqHelpCountView__ extends mkio.Protocol { }

/** 客户端请求援助统计面板
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqHelpCountView extends __CReqHelpCountView__ {
	@Override
	protected void process() {
		// protocol handle
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SReqHelpCountView sReqHelpCountView=new SReqHelpCountView();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sReqHelpCountView.expvalue=helpcount.getExpvalue();//缂佸繘鐛�
			sReqHelpCountView.shengwangvalue=helpcount.getShengwangvalue();//婢圭増婀�
			sReqHelpCountView.factionvalue=helpcount.getClanvalue();//鐢喛纭�
			sReqHelpCountView.helpgiveitemnum=helpcount.getHelpgiveitemnum();
			sReqHelpCountView.helpitemnum=helpcount.getHelpitemnum();
		}
		sReqHelpCountView.expvaluemax=fire.pb.HelpCountManage.getInstance().getExpValueMax(roleid);//缂佸繘鐛欓張?婢堆�?纭风礄娣囶喗鏁兼稉楦垮箯瀵版绮℃宀�娈戝▎鈩冩殶閿�?
		sReqHelpCountView.shengwangvaluemax=fire.pb.HelpCountManage.getInstance().getShengWangValueMax(roleid);//婢圭増婀滈張?婢堆�??
		sReqHelpCountView.factionvaluemax=fire.pb.HelpCountManage.getInstance().getClanValueMax(roleid);//鐢喛纭�閺�?婢堆�??
		sReqHelpCountView.helpgiveitemnummax=fire.pb.HelpCountManage.getInstance().getHelpGiveItemNumMax(roleid);
		sReqHelpCountView.helpitemnummax=fire.pb.HelpCountManage.getInstance().getHelpItemNumMax(roleid);
		
		gnet.link.Onlines.getInstance().send(roleid, sReqHelpCountView);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786532;

	public int getType() {
		return 786532;
	}


	public CReqHelpCountView() {
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
		if (_o1_ instanceof CReqHelpCountView) {
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

	public int compareTo(CReqHelpCountView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendHelpSW__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendHelpSW extends __CSendHelpSW__ {
	@Override
	protected void process() {
		long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		SSendHelpSW sSendHelpSW=new SSendHelpSW();
		xbean.helpcount helpcount=xtable.Helpcount.select(roleid);
		if(helpcount!=null){
			sSendHelpSW.helpsw=helpcount.getShengwangvalue();//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘劙婀侀梺绋跨箰閸氬绱為幋锔界厱闁靛鍎遍敓钘夋健瀵鏁愭径瀣簻閻庣懓瀚竟鍡涙儎鎼淬劍鈷戦柛蹇撳悑缁跺弶绻涚亸鏍垫嫹閹颁礁娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊х闁瑰浼濋鍫氾拷鏍ㄥ緞婵炵偓鏂�闂佺粯鍔曞鍫曞闯閽樺鏀芥い鏃囧亹娴犳稓绱掑畝鍐摵缂佺粯绻堝畷鍫曗�栭顒�娲ㄩ崣鎾绘煕閵夛絽濡介柣鎾卞劜閵囧嫯绠涢幘璺虹厽濠殿喖锕︾划顖炲箯閸涘瓨鍋￠梺顓ㄧ畱濞堟繃绻濋悽闈涗沪鐟滄澘鍟伴幑銏犖熼搹瑙勬闁荤喐鐟ョ�氼噣銆呴悜鑺ュ�甸柨婵嗙凹缁ㄥジ鏌ｆ惔顔煎⒋婵﹥妞介幃鐑藉级鎼存挻瀵栫紓鍌欑贰閸ｎ噣宕圭捄渚殨闁哄被鍎辩粻鐟懊归敐鍛础闁告瑥妫濆铏圭磼濡崵顦ラ梺绋匡工濠�閬嶆晸閼恒儳鍟查柟鍑ゆ嫹
		}
		gnet.link.Onlines.getInstance().send(roleid, sSendHelpSW);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786547;

	public int getType() {
		return 786547;
	}


	public CSendHelpSW() {
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
		if (_o1_ instanceof CSendHelpSW) {
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

	public int compareTo(CSendHelpSW _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


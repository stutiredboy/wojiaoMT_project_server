
package fire.pb.fushi.payday;

import fire.pb.fushi.DayPayManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CQueryConsumeDayPay__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠﹂柟绋款煼閹垽顢楅崟顐ゎ唵闂備礁鐏濋鎰枔娴犲鐓熼柟閭﹀灠閻ㄦ椽寮崼銉︹拺閺夌偞澹嗛崝宥夋煕閺冿拷閻熴儵鎮鹃悜钘夌闁绘垵妫欏娲⒑閸撴彃浜栭柛銊ヮ煼钘濇い鎰堕檮閳锋帡鏌涚仦鍓ф噮缂佹劖姊圭换娑㈡偂鎼搭喚鍚嬪Δ鐘靛仜缁绘﹢寮幘缁樻櫢闁跨噦鎷�? by changhao
 */
public class CQueryConsumeDayPay extends __CQueryConsumeDayPay__ {
	@Override
	protected void process() {
		
		if (yesorno == 1)
		{			
			final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
			if (roleid < 0)
				return;
			mkdb.Procedure queryconsumedaypay = new mkdb.Procedure()
			{
				@Override
				protected boolean process()
				{		
					gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(roleid);
					if (linkrole != null)
					{
						int userid = linkrole.getUserid();
						if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶缂侊拷婢跺绻嗛柕鍫濇噺閸ｅ湱绱掗悩闈涒枅闁哄瞼鍠栭獮鍡氼槾闁挎稑绉归弻锟犲幢椤撶姷鏆ゅ┑顔硷攻濡炰粙銆佸Δ鍛櫢闁伙絽鐬奸惌鎾绘倵閻㈠憡浜ら柟宄板槻椤繈顢楁径瀣撱劑姊虹捄銊ユ灆婵☆偄瀚划璇差吋婢跺﹦锛熼梻渚囧墮缁夊绮婚悩璇茬闁圭⒈鍘鹃崢婊呯磽瀹ュ棛澧甸柡灞炬礋瀹曠厧鈹戦幇顓壯囨⒑缂佹ɑ灏版繛鑼枛瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷? by changhao
						{
							fire.pb.fushi.DayPayManager.getInstance().ProcessDayPay(userid, roleid);	
						}					
					}
					
					return true;
				}
			};
			
			queryconsumedaypay.submit();	
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812595;

	public int getType() {
		return 812595;
	}

	public int yesorno; // 0是没有1是消耗 by changhao

	public CQueryConsumeDayPay() {
	}

	public CQueryConsumeDayPay(int _yesorno_) {
		this.yesorno = _yesorno_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(yesorno);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		yesorno = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CQueryConsumeDayPay) {
			CQueryConsumeDayPay _o_ = (CQueryConsumeDayPay)_o1_;
			if (yesorno != _o_.yesorno) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += yesorno;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(yesorno).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CQueryConsumeDayPay _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = yesorno - _o_.yesorno;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


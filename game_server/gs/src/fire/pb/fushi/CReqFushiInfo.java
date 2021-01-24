
package fire.pb.fushi;

import org.apache.http.client.methods.HttpGet;
import fire.pb.main.Gs;
import gnet.link.Dispatch;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqFushiInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqFushiInfo extends __CReqFushiInfo__ {
	@Override
	protected void process() {
		final int userID = ((Dispatch)this.getContext()).userid;
		final long roleID = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleID < 0)
			return;
		FushiManager.logger.info("CReqFushiInfo:userid:" + userID + ",roleid:" + roleID);
		if (fire.pb.fushi.Module.getIsYYBUser(userID)){
			try {
				final HttpGet request = FushiManager.makeYybGetCurrencyRequest(userID, roleID);
				if(request != null) {
					Gs.getHttpClient().execute(request, 
						new YybGetCurrencyHandler(userID, roleID) {
						@Override
						protected boolean executeHandler(int balance, int genBalance, int firstSave, int saveAmt){
							return true;
						}
					});
				} 
				else {
					FushiManager.logger.error(new StringBuilder("roleId=").append(roleID).append("闁兼儳鍢茶ぐ鍥ㄦ償閺冨倹鏆忛悗瑙勭箖閺嗙喖骞戦绗轰杭閻犳劑鍎荤槐锟�"));
				}
			}
			catch(Exception e){
				FushiManager.logger.error(new StringBuilder("roleId=").append(roleID).append("閹煎瓨姊婚弫銈囷拷锟�? 闁告瑦鍨�?娴ｅ搫璐熼悗鐟板濞堟垹绮敂鍓у従濞ｅ洠鍓濇导鍛存煥濞嗘帩鍤栭柨锟�?") , e);
			}
		} 
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812490;

	public int getType() {
		return 812490;
	}


	public CReqFushiInfo() {
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
		if (_o1_ instanceof CReqFushiInfo) {
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

	public int compareTo(CReqFushiInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


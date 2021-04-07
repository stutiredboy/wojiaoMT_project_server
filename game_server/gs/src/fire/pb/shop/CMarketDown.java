
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketDown__ extends mkio.Protocol { }

/** 摆摊下架
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketDown extends __CMarketDown__ {
	@Override
	protected void process() {
		// protocol handle
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				boolean success = proxy.down(downtype, roleId, key);
				if (success) {
					// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣芥硶閸犳挻鎱ㄧ�靛摜纾奸柍鍝勬噺閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箯閹达附鍋勯悘蹇庣劍閺傦拷闂備胶绮敋鐎殿喖鐖奸獮鏍箛椤斿墽锛滈梺璺ㄥ枍缁瑥鐣锋總闈╃稏妞ゆ棁妫勯璺何旈悩闈涗粶闁诲繑绻堝畷婵嗩潩閼哥數鍘甸梺鍛婂姈閻擄繝宕ｉ崟顖涚厸閻忕偞鏋婚煬顒勬煛鐏炶姤顥滄い鎾炽偢瀹曞崬鈻庤箛鎾额唶濠电姷鏁搁崑鐘诲箵椤忓棗绶ゅù鐘差儏缁犺銇勯幇鎯扮闁跨喕妫勯崐鍧楀箠閺嶎厼鐓涢悗锝庡亜椤忓爼鏌ｉ悢鍝ユ噧閻庢凹鍙冮獮鍡涘醇閵夛妇鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�
					fire.pb.shop.srv.market.MarketManager.getInstance().sendMarketContainerByRoleId(roleId);
				}
				return success;
//				return fire.pb.shop.srv.market.MarketManager.getInstance().marketDown(downtype, roleId, key);
			}
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810644;

	public int getType() {
		return 810644;
	}

	public int downtype; // 下架类型1道具,2宠物
	public int key; // 摆摊容器中的key

	public CMarketDown() {
	}

	public CMarketDown(int _downtype_, int _key_) {
		this.downtype = _downtype_;
		this.key = _key_;
	}

	public final boolean _validator_() {
		if (downtype < 1 || downtype > 2) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(downtype);
		_os_.marshal(key);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		downtype = _os_.unmarshal_int();
		key = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketDown) {
			CMarketDown _o_ = (CMarketDown)_o1_;
			if (downtype != _o_.downtype) return false;
			if (key != _o_.key) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += downtype;
		_h_ += key;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(downtype).append(",");
		_sb_.append(key).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CMarketDown _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = downtype - _o_.downtype;
		if (0 != _c_) return _c_;
		_c_ = key - _o_.key;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


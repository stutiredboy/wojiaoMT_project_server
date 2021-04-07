
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketUp__ extends mkio.Protocol { }

/** 摆摊上架
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketUp extends __CMarketUp__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		new mkdb.Procedure() {
			protected boolean process() {
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				boolean success = proxy.up(containertype, roleId, key, num, price);
				if (success) {
					// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣芥硶閸犳挻鎱ㄧ�靛摜纾奸柍鍝勬噺閳锋垶銇勯幒鐐村缂備礁顦伴幐鎶藉箯閹达附鍋勯悘蹇庣劍閺傦拷闂備胶绮敋鐎殿喖鐖奸獮鏍箛椤斿墽锛滈梺璺ㄥ枍缁瑥鐣锋總闈╃稏妞ゆ棁妫勯璺何旈悩闈涗粶闁诲繑绻堝畷婵嗩潩閼哥數鍘甸梺鍛婂姈閻擄繝宕ｉ崟顖涚厸閻忕偞鏋婚煬顒勬煛鐏炶姤顥滄い鎾炽偢瀹曞崬鈻庤箛鎾额唶濠电姷鏁搁崑鐘诲箵椤忓棗绶ゅù鐘差儏缁犺銇勯幇鎯扮闁跨喕妫勯崐鍧楀箠閺嶎厼鐓涢悗锝庡亜椤忓爼鏌ｉ悢鍝ユ噧閻庢凹鍙冮獮鍡涘醇閵夛妇鍘甸梺鍛婂灟閸婃牜锟芥熬鎷�
					fire.pb.shop.srv.market.MarketManager.getInstance().sendMarketContainerByRoleId(roleId);
				}
				return success;
			}
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810643;

	public int getType() {
		return 810643;
	}

	public int containertype; // 1背包 2宠物栏
	public int key; // 背包或宠物栏中的key
	public int num; // 数量
	public int price; // 价格

	public CMarketUp() {
	}

	public CMarketUp(int _containertype_, int _key_, int _num_, int _price_) {
		this.containertype = _containertype_;
		this.key = _key_;
		this.num = _num_;
		this.price = _price_;
	}

	public final boolean _validator_() {
		if (containertype < 1 || containertype > 2) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(containertype);
		_os_.marshal(key);
		_os_.marshal(num);
		_os_.marshal(price);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		containertype = _os_.unmarshal_int();
		key = _os_.unmarshal_int();
		num = _os_.unmarshal_int();
		price = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketUp) {
			CMarketUp _o_ = (CMarketUp)_o1_;
			if (containertype != _o_.containertype) return false;
			if (key != _o_.key) return false;
			if (num != _o_.num) return false;
			if (price != _o_.price) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += containertype;
		_h_ += key;
		_h_ += num;
		_h_ += price;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(containertype).append(",");
		_sb_.append(key).append(",");
		_sb_.append(num).append(",");
		_sb_.append(price).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CMarketUp _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = containertype - _o_.containertype;
		if (0 != _c_) return _c_;
		_c_ = key - _o_.key;
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		_c_ = price - _o_.price;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


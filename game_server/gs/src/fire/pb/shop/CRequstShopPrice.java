
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequstShopPrice__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequstShopPrice extends __CRequstShopPrice__ {
	@Override
	protected void process() {
		// protocol handle

		final gnet.link.Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		
		long roleid = role.getRoleid();
		
		if (!fire.pb.shop.srv.floating.FileterFloatingShop.getInstance().isFloatingOne(shopid)) {
			return;
		}
		
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				java.util.ArrayList<fire.pb.shop.Goods> goodsList = fire.pb.shop.srv.floating.FloatingOneManager.getInstance()
						.getGoodsAndPrice(shopid);
				//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顣洪梺钘夊暟閸犳牠寮婚弴鐔虹闁割煈鍠栨竟鍕攽閻愬弶鈻曞ù婊勭矒瀹曟﹢鏁撻挊澶樻富闁靛牆妫楁慨鍌炴煕婵犲喚娈滈柡浣哥Т椤劑宕橀敐鍡樻澑闂備胶绮崝鏇烆嚕閸泙澶婎煥閸曨厾顔曢柣搴㈢♁閿氶柛婵婃閿熷�燁潐濞插繘宕曢棃娑氭殾闁圭儤顨嗛崐鐑芥倵閻㈡鐒炬鐐茬Ч濮婄粯鎷呴崨濠呯闂佹儳绻愰柊锝呯暦閹剁瓔鏁婇柛銏狀槹閻╊垶鐛�ｎ喗鍊锋い蹇撳暟閻╁酣姊绘繝搴′簻婵炲眰鍨藉畷鏇㈡嚑椤掑﹥瀚规慨妯煎亾鐎氾拷
				mkdb.Procedure.psendWhileCommit(roleid, new SResponseShopPrice(shopid, goodsList));
				
				return true;
			}
		}.submit();

	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810635;

	public int getType() {
		return 810635;
	}

	public int shopid; // 商店序号

	public CRequstShopPrice() {
	}

	public CRequstShopPrice(int _shopid_) {
		this.shopid = _shopid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(shopid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		shopid = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequstShopPrice) {
			CRequstShopPrice _o_ = (CRequstShopPrice)_o1_;
			if (shopid != _o_.shopid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += shopid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(shopid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequstShopPrice _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = shopid - _o_.shopid;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

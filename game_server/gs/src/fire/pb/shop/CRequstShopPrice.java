
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀勩�傚ú顏呪拺闁芥ê顦弳鐔兼煕閻樺磭澧电�殿喖顭峰鎾偄閾忚鍟庨梻浣稿閻撳牓宕伴弽銊х彾闁告洦鍋�閺�浠嬫煟閹邦剙绾ч柍缁樻礀闇夋繝濠傚閻帞锟借娲橀敃銏ゅ极閹剧粯瀵犲鑸瞪戠�靛矂姊洪棃娑氬婵☆偅顨嗛幈銊╁磼閻愬鍘辨繝鐢靛Т閸犳艾鈻撳鍫熺厸濞达絽鎽滃瓭濡炪値鍘归崝鎴濈暦濮楋拷閺佹劙宕卞Ο缁樼帆闂傚倸鍊烽懗鍓佸垝椤栫偛绀夐柡鍥╁剱閸ゆ洟鏌涢锝嗙』濠㈣泛顭悡銉╂煕閺囥劌骞樻い鏃�娲熼弻锝嗘償閵忊懇妾ㄩ梺鎸庡哺閺屾稑鈹戞繝鍐句哗闂佽法鍠庨敓鐣屽櫏濞兼劖绻涢幓鎺旂鐎规洘娲熷Λ鍐ㄢ槈濮橆厽顔曢梻浣告贡閸庛倝銆冮崱娑樼９闁绘垼濮ら崐鐢告煟閵忊槅鍟忛柣鎺斿亾椤ㄣ儵鎮欓懠顑勬叏婵犲嫮甯涢柟宄版嚇瀹曘劍绻濋崨顖ｆ敤闂傚倷鐒﹂崕宕囨崲閹扮増鐓�闁挎繂鎳愰弳锕傛煙閸撲胶鎽傞柡浣革躬閺屾盯濮�閻欙拷濡插綊鏌ｉ埡濠傜仸闁绘侗鍠氶敓鏂ょ秵閸犳宕愰柨瀣ㄤ簻闊洦鎸搁弳鐔兼煟閳轰線鍙勬慨濠勭帛缁绘繃鎯旈垾鑼泿婵犵數鍋涢惇浼村垂閽樺鏆﹂柡鍥ュ灪閸ゆ垶銇勯幒鎴敾閻庢俺顫夐幈銊ノ熼悡搴濆闁诲孩鐔幏锟�
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

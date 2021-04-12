
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
				//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮村杈┬㈤梻浣规偠閸庢椽宕滈敃鍌氭瀬闁告劦鍠楅悡銉╂煛閸ユ湹绨奸悗姘秺濮婂搫效閸パ嶆嫹濡ゅ懎纾婚柟鎹愬煐瀹曞弶绻濋棃娑欏窛缂佲槄鎷烽梻浣侯焾閺堫剛鍒掑畝鍕╋拷鍌毭洪鍛嫼闂佽姤锚椤︻垶寮抽悢鍏肩厱闁绘ê纾晶鐢碉拷娈垮枛椤嘲顕ｉ幘顔藉亜闁惧繗顕栭崯搴ㄦ⒒娴ｇ顥忛柣鎾崇墦瀹曚即寮介妸褏褰鹃梺鍛婃处閸嬶拷闁猴拷娴犲鐓熼柟閭﹀墮缁狙囨煃缂佹ɑ绀�闂囧绻濇繝鍌氼伀闁活厽甯為敓鍊燁潐濞叉﹢鏁冮姀銈呮瀬闁瑰墽绮�电姴顭块懜鐬垹锟介潧鐭傚娲濞戞艾顣哄┑鈽嗗亝椤ㄥ棝骞堥妸鈺佺＜闁绘劕顕崢杈ㄧ節閻㈤潧孝闁哥姵鑹鹃埢鎾愁煥閸喓鍘告繛杈剧到閹芥粌鐡俊鐐�ら崢褰掑礉閹存繄鏆︽慨妤嬫嫹闁轰焦鍔欏畷鍗炍熺紒妯煎竼闂傚倸鍊搁崐鐑芥嚄閸撲礁鍨濇い鏍仜缁�澶愭煛閸モ晛鍓遍柛銈嗘礋閺屾盯顢曢敐鍡欍�忔繝銏ｆ硾椤剟鎮￠妷鈺傜厱闁哄洢鍔岄獮妯汇亜閺冿拷濞茬喖寮婚敐鍡樺劅闁靛繆鎳囧銊╂⒑閹稿骸鍝洪柡灞剧☉閳规垶绻濋崘鍙ュ摋闂備浇娉曢崰搴ㄦ晸閻ｅ苯娅忔繛鍏煎姈缁绘盯骞撻幒鏃傤啋閻庤娲樺ú鐔肺涢崘銊㈡婵﹩鍘介鏇㈡⒒娴ｅ憡璐￠柛搴涘�濋妴鍐幢濞戞锛欓梺缁樺灱婵倝宕愰悽鍛婄厽闁靛繆妲呴崯蹇涙煟閹烘柨浜炬い銊ｅ劦閹瑩鎳犻顐庡嫭鍙忓┑鐘插鐢盯鏌熷畡鐗堝殗鐎规洏鍔嶇换婵嬪川椤栵絾鏁ら梻鍌氬�烽悞锕傚磿瀹曞洦宕查柟鎵閻擄拷闂佹寧绻傞幊鎰板汲閿曞倹鐓欓柛鎾茶兌閹藉倿鏌℃担闈╄含闁哄本鐩慨锟介柣娆欐嫹婵℃彃缍婇弻锝夊煛婵犲倻浠搁梺缁樹緱閸犳岸鏁撻弬銈囩У闁哥姵顨婂畷鎰版煥鐎ｃ劋绨婚棅顐㈡处閹告悂寮抽悢鍏肩厽闁宠桨绶氶崣鍕叏婵犲嫮甯涚紒缁樼箖閹棃鍨鹃懠顒傛晨濠电姷鏁搁崑娑㈡儑娴兼潙鍨傞柦妯侯槺閺嗭箓鏌￠崶銉ョ仾闁搞倖鍨堕妵鍕箳閹搭垱鏁鹃柣搴亢椤骞堥妸銉庣喖鎮℃惔婵嗩棜闂佽瀛╅悢顒勫箯閿燂拷
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

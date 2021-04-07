package fire.pb.shop;
import fire.pb.shop.utils.MarketUtils;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketItemChatShow__ extends mkio.Protocol { }

/** 聊天发送摆摊道具协议
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
public class CMarketItemChatShow extends __CMarketItemChatShow__ {

	@Override
	protected void process() {
		if (!MarketUtils.isMarketItemChatShow)
			return;
		// protocol handle
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		
		new mkdb.Procedure() {

			@Override
			protected boolean process() throws Exception {
				long beginTime = System.currentTimeMillis();
				
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(
						market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				proxy.chatBrowseMarketItem(roleId, id, itemtype);
				
				long endTime = System.currentTimeMillis();
				long excuteTime = endTime - beginTime;
				if (excuteTime > 50) {
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐宄懊归崶顒夋晪鐟滃繘骞戦姀銈呯婵°倧鎷风痪鎯ь煼閺岋綁骞囬锝嗏挅闂佸憡绻傜�氱兘鎮￠妷鈺傜厱妞ゆ劧绲鹃崕鏇㈡煥閺冨洤袚闁告瑥绻戞穱濠囶敍濮橆厼浠撮梺鍛婄箖濡炰粙寮诲☉銏″亹闁告瑥顦藉Λ锕傛⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊箻椤曞懏鏅滈梺鍛婁緱閸欏孩瀵奸幘缁樷拺闁煎鍊曢弸鎴犵磼椤旇偐孝妞ゎ厼鐏濋～婊堟晸閽樺鏆﹂柟閭﹀幘缁★拷濠殿喗锕╅崢钘夆枍閵忋倖鈷戠紒瀣皡閸旂喖鏌涢敐鍐ㄥ姎妞ゎ厼娲獮鍥偋閸垹骞楁俊鐐�栭幐鍡涘礃閳哄啩澹曠紓鍌氬�峰ù鍥ㄧ椤掑嫬纾婚柕鍫濇噽閺嗭箓鏌曟繛鐐珔缂佺嫏鍥ㄧ厵閻庣數顭堥宀勬煕閻愬灚鏆柡宀嬬稻閹棃鏁嶉崟顓熸闂備胶顭堥柊锝嗙閸洜宓佸┑鐘插暞閸庣喖鏌ㄥ┑鍡樺窛闁绘帒銈搁弻锝堢疀閺囩偘绮舵繝鈷�鍛珪缂侇喚绮妶锝夊礃閳哄啫骞愬┑鐘灱濞夋盯顢栭崨瀛樺�堕柍鍝勫暟绾惧ジ鏌ｅ锟藉褔宕濈�ｎ喗鐓忛柛銉戝喚浼冨銈冨灪濞茬喐鎱ㄩ敓浠嬫煃鐠鸿櫣浠岄柛銉ｅ妿閸樻悂鏌ｈ箛鏇炰哗濠殿喓鍊濊棢闁靛繆妲呭▓浠嬫煟閹邦垱褰ч柤鎷屾硶閿熷�燁潐濞叉﹢鏁冮姀銈囧祦闁规崘顕х粻鎶芥煛閸愭寧瀚归梺宕囩帛濞茬喎顫忔繝姘＜婵炲棙甯掗崢锟犳⒑缁嬫寧鎹ｉ柡浣筋嚙閻ｇ兘骞嬮敃锟界粻濠氭偣閸ヮ亜鐨烘い锔诲櫍閹鐛崹顔煎闂佺懓鍢查鍛村Υ閹烘挾绡�婵﹩鍘鹃崢閬嶆倵閻у憡瀚归梺璺ㄥ枍缁瑥鐣烽幋锔藉�烽柛婵嗗閺屟囨⒑鐠恒劌娅愰柟鍑ゆ嫹?").append(excuteTime).append("婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽銊х煂缂侊拷婵犲洦鐓曢柍鈺佸暟閳藉鐥幆褜鐓奸柡灞剧洴閸╁嫰宕橀妸銉︾亞缂傚倸鍊哥粔鐢告偋閻樿钃熼柕濞炬櫆閸嬪棝鏌涚仦鍓р槈妞ゅ骏鎷�");
					fire.pb.shop.srv.market.MarketManager.LOG.error(sbd.toString());
				}
				return true;
			}
		}.submit();
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810665;

	public int getType() {
		return 810665;
	}

	public long id; // 数据库唯一id
	public int itemtype; // 物品类型:  1普通、2宠物、3装备 4范围

	public CMarketItemChatShow() {
	}

	public CMarketItemChatShow(long _id_, int _itemtype_) {
		this.id = _id_;
		this.itemtype = _itemtype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(itemtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_long();
		itemtype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketItemChatShow) {
			CMarketItemChatShow _o_ = (CMarketItemChatShow)_o1_;
			if (id != _o_.id) return false;
			if (itemtype != _o_.itemtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)id;
		_h_ += itemtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(itemtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CMarketItemChatShow _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(id - _o_.id);
		if (0 != _c_) return _c_;
		_c_ = itemtype - _o_.itemtype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}
}

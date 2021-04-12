
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketBuy__ extends mkio.Protocol { }

/** 摆摊购买
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketBuy extends __CMarketBuy__ {
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
				boolean success = proxy.buy(roleId, id, saleroleid, itemid, num);
//				if (success) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴懞銉с�婇梺鍝ュУ閹稿骞堥妸褝鎷烽棃娑欐喐缁炬儳銈搁弻宥夊传閸曨剙娅ら梺鎶芥敱閸ㄥ爼濡甸崟顖氱闁绘劖娼欓鍓佺磽閸屾瑧顦︽い锔垮嵆楠炴劙骞庨挊澶岊唵闂佺鎻梽鍕磻閸曨垱鍊堕煫鍥ф捣閸斿秹鏌￠崒锔藉闂傚倸鍊烽懗鍓佸垝椤栫偞鏅柣搴㈩問閸犳牠鎮ユ總鍝ュ祦闁哄稁鍘肩粻娑欍亜閺傚灝鈷旈柨娑欑矒濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熴儵鎮鹃柨瀣檮闂傚牃鏅濈粙蹇擃渻閵堝棙顥嗘俊顐㈠椤㈡梻鎹勬担鏇熸閹晠妫冨☉妤冩崟闂備浇顕х换鎴犳崲閸繄鏆︽繝闈涙－濞尖晠鏌ら崫銉︽毄闁告鏁诲娲川婵犲倸顫嶉梺缁樻惈缁绘繂鐣烽敐澶婄妞ゆ牗绋撻崢鎼佹煟韫囨洖浠﹂柡瀣煼閻擃剟顢楅崟顒傚幐闁诲繒鍋犳慨銈壦夊鍕╀簻闁瑰墽鍋ㄩ崑銏拷瑙勬礀瀹曨剟鍩㈡惔銈囩杸闁归箖顤傞崬鑸电節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰濡娆㈤妶鍚ゅ綊鎮╁顔煎壈缂備胶濮鹃～澶愬Φ閸曨垰绠涢柟顖涘椤︿即姊虹捄銊ユ灆婵☆偄瀚板畷鎰板锤濡わ拷缁犵娀鏌″搴″箹闁绘挻鐩幃妤呮晲鎼粹�茬盎濡炪倕绻愰悥濂稿蓟閿濆鍋勯柛婵勫劜閸Ｑ囨煟鎼淬垹鍤柛娆忓暣閻涱噣宕卞☉姗�鍞堕梺闈涱檧婵″洭宕㈤悽鍛娾拺闁告稑锕ら悘鐔兼煕婵犲啰澧遍柨鐔诲Г閻旑剟骞忛敓锟�
//					fire.pb.shop.srv.market.MarketManager.getInstance().sendMarketContainerByRoleId(roleId);
//				}
				return success;
//				return fire.pb.shop.srv.market.MarketManager.getInstance().marketBuy(roleId, id, saleroleid, itemid, num);
			}
			
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810641;

	public int getType() {
		return 810641;
	}

	public long id; // 唯一id(浏览时候发给的id)
	public long saleroleid; // 卖家角色id
	public int itemid; // 道具id
	public int num; // 数量

	public CMarketBuy() {
	}

	public CMarketBuy(long _id_, long _saleroleid_, int _itemid_, int _num_) {
		this.id = _id_;
		this.saleroleid = _saleroleid_;
		this.itemid = _itemid_;
		this.num = _num_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(id);
		_os_.marshal(saleroleid);
		_os_.marshal(itemid);
		_os_.marshal(num);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		id = _os_.unmarshal_long();
		saleroleid = _os_.unmarshal_long();
		itemid = _os_.unmarshal_int();
		num = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketBuy) {
			CMarketBuy _o_ = (CMarketBuy)_o1_;
			if (id != _o_.id) return false;
			if (saleroleid != _o_.saleroleid) return false;
			if (itemid != _o_.itemid) return false;
			if (num != _o_.num) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)id;
		_h_ += (int)saleroleid;
		_h_ += itemid;
		_h_ += num;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(id).append(",");
		_sb_.append(saleroleid).append(",");
		_sb_.append(itemid).append(",");
		_sb_.append(num).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CMarketBuy _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(id - _o_.id);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(saleroleid - _o_.saleroleid);
		if (0 != _c_) return _c_;
		_c_ = itemid - _o_.itemid;
		if (0 != _c_) return _c_;
		_c_ = num - _o_.num;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


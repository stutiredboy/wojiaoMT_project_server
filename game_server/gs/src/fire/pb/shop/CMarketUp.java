
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
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呴懞銉с�婇梺鍝ュУ閹稿骞堥妸褝鎷烽棃娑欐喐缁炬儳銈搁弻宥夊传閸曨剙娅ら梺鎶芥敱閸ㄥ爼濡甸崟顖氱闁绘劖娼欓鍓佺磽閸屾瑧顦︽い锔垮嵆楠炴劙骞庨挊澶岊唵闂佺鎻梽鍕磻閸曨垱鍊堕煫鍥ф捣閸斿秹鏌￠崒锔藉闂傚倸鍊烽懗鍓佸垝椤栫偞鏅柣搴㈩問閸犳牠鎮ユ總鍝ュ祦闁哄稁鍘肩粻娑欍亜閺傚灝鈷旈柨娑欑矒濮婅櫣鎹勯妸銉︾�虹紓渚囧枟閻熴儵鎮鹃柨瀣檮闂傚牃鏅濈粙蹇擃渻閵堝棙顥嗘俊顐㈠椤㈡梻鎹勬担鏇熸閹晠妫冨☉妤冩崟闂備浇顕х换鎴犳崲閸繄鏆︽繝闈涙－濞尖晠鏌ら崫銉︽毄闁告鏁诲娲川婵犲倸顫嶉梺缁樻惈缁绘繂鐣烽敐澶婄妞ゆ牗绋撻崢鎼佹煟韫囨洖浠﹂柡瀣煼閻擃剟顢楅崟顒傚幐闁诲繒鍋犳慨銈壦夊鍕╀簻闁瑰墽鍋ㄩ崑銏拷瑙勬礀瀹曨剟鍩㈡惔銈囩杸闁归箖顤傞崬鑸电節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰濡娆㈤妶鍚ゅ綊鎮╁顔煎壈缂備胶濮鹃～澶愬Φ閸曨垰绠涢柟顖涘椤︿即姊虹捄銊ユ灆婵☆偄瀚板畷鎰板锤濡わ拷缁犵娀鏌″搴″箹闁绘挻鐩幃妤呮晲鎼粹�茬盎濡炪倕绻愰悥濂稿蓟閿濆鍋勯柛婵勫劜閸Ｑ囨煟鎼淬垹鍤柛娆忓暣閻涱噣宕卞☉姗�鍞堕梺闈涱檧婵″洭宕㈤悽鍛娾拺闁告稑锕ら悘鐔兼煕婵犲啰澧遍柨鐔诲Г閻旑剟骞忛敓锟�
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


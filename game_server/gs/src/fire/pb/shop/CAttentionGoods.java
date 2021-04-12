
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAttentionGoods__ extends mkio.Protocol { }

/** 关注或取消关注商品
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAttentionGoods extends __CAttentionGoods__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		new mkdb.Procedure() {
			@Override
			protected boolean process() throws Exception {
				fire.pb.shop.srv.market.IMarket market = fire.pb.shop.srv.market.MarketManager.getInstance();
				fire.pb.shop.srv.market.proxy.MarketTransactionProxy handler = new fire.pb.shop.srv.market.proxy.MarketTransactionProxy(market);
				fire.pb.shop.srv.market.IMarket proxy = (fire.pb.shop.srv.market.IMarket) handler.getProxy();
				boolean success = proxy.attention(itemtype, attentiontype, roleId, id, attentype);
				if (success) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簻椤掋垺銇勯幇顏嗙煓闁哄被鍔戦幃銏ゅ传閸曟垯鍨婚惀顏堝箚瑜滈悡濂告煛鐏炲墽鈽夐柍钘夘樀瀹曪繝鎮欓幓鎺濆妧濠电姷鏁搁崑娑㈡儍閻戣棄鐤鹃柣妯款嚙閽冪喖鏌￠崶鈺佹灁缂佺娀绠栭弻锝夊箛闂堟稑顫梺缁樼箖濞茬喎顫忛搹鍦煓婵炲棙鍎抽崜浼存⒑缁嬪尅宸ユ繛灏栵拷鎰佸殨濠电姵鑹炬儫闂佸啿鎼崐鍛婄濠婂牊鈷戦柛娑橈功缁犳捇鎮楀顒佸殗濠殿噯鎷烽梺闈涚箞閸ㄥ鏁嶅鍫熲拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳冮柣锝夋敱缁轰粙妫冮埡鍐棨婵＄偑鍊栧Λ浣肝涢崟顖ｆ晜閻犺桨缍嶉弮鍫熷亹闂傚牊绋愮划鍫曟⒑鐠囪尙绠茬紒璇茬墕閻ｅ嘲鈹戦崱鈺傚兊闂佺厧鎽滈弫鎼佸储閻㈠憡鈷戦柛娑橈工婵牓鏌ｉ幙鍕瘈鐎规洩缍佸畷鐔碱敍濞戞艾骞愰梺璇茬箳閸嬬偤寮告繝姘卞彆妞ゆ帒瀚悡娑㈡倶閻愯泛袚妞ゃ儲绮嶉妵鍕箻閻愯棄浠悗瑙勬礀瀹曨剟鍩㈡惔銈囩杸闁归箖顤傞崬鑸电節閻㈤潧啸闁轰焦鎮傚畷鎴︽偐鐠囪尙顔屽銈呯箰濡娆㈤妶鍚ゅ綊鎮╁顔煎壈缂備胶濮鹃～澶愬Φ閸曨垰绠涢柟顖涘椤︿即姊虹捄銊ユ灆婵☆偄瀚板畷鎰板锤濡わ拷缁犵娀鏌″搴″箹闁绘挻鐩幃妤呮晲鎼粹�茬盎濡炪倕绻愰悥濂稿蓟閿濆鍋勯柛婵勫劜閸Ｑ囨煟鎼淬垹鍤柛娆忓暣閻涱噣宕卞☉姗�鍞堕梺闈涱檧婵″洭宕㈤悽鍛娾拺闁告稑锕ら悘鐔兼煕婵犲啰澧遍柨鐔诲Г閻旑剟骞忛敓锟�
					mkdb.Procedure.psendWhileCommit(roleId, new fire.pb.shop.SAttentionGoods(attentype, id, attentiontype, itemtype));
				}
				return success;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810658;

	public int getType() {
		return 810658;
	}

	public int attentype; // 关注状态 1购买，2公示
	public long id; // 唯一id(是服务器数据库的id)
	public int attentiontype; // 关注类型 1关注  2取消关注
	public int itemtype; // 1普通道具 2宠物 3装备

	public CAttentionGoods() {
	}

	public CAttentionGoods(int _attentype_, long _id_, int _attentiontype_, int _itemtype_) {
		this.attentype = _attentype_;
		this.id = _id_;
		this.attentiontype = _attentiontype_;
		this.itemtype = _itemtype_;
	}

	public final boolean _validator_() {
		if (attentiontype < 1 || attentiontype > 2) return false;
		if (itemtype < 1 || itemtype > 3) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(attentype);
		_os_.marshal(id);
		_os_.marshal(attentiontype);
		_os_.marshal(itemtype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		attentype = _os_.unmarshal_int();
		id = _os_.unmarshal_long();
		attentiontype = _os_.unmarshal_int();
		itemtype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAttentionGoods) {
			CAttentionGoods _o_ = (CAttentionGoods)_o1_;
			if (attentype != _o_.attentype) return false;
			if (id != _o_.id) return false;
			if (attentiontype != _o_.attentiontype) return false;
			if (itemtype != _o_.itemtype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += attentype;
		_h_ += (int)id;
		_h_ += attentiontype;
		_h_ += itemtype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(attentype).append(",");
		_sb_.append(id).append(",");
		_sb_.append(attentiontype).append(",");
		_sb_.append(itemtype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAttentionGoods _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = attentype - _o_.attentype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(id - _o_.id);
		if (0 != _c_) return _c_;
		_c_ = attentiontype - _o_.attentiontype;
		if (0 != _c_) return _c_;
		_c_ = itemtype - _o_.itemtype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


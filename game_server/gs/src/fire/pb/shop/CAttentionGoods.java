
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
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨绘い鎺嬪灪閵囧嫰骞囬鍡欑厯闂佸搫琚崝鎴﹀箖閵忋倕浼犻柛鏇熷灟閸ㄥ鎯�椤忓牆绠氱憸婊堟偂婵傚憡鐓涢悘鐐插⒔閳藉鏌嶉挊澶樻█鐎规洩绻濋幃娆撳箵閹烘繂濡ф繝鐢靛Х閺佹悂宕戝☉銏″剭闁绘垼妫勯悿楣冩煟濡鍤欓柦鍐枛閺岋繝宕堕埡浣圭亖缂備胶濞�缁犳牠寮婚敐澶婄疀闂傚牊绋戦～顏堟⒑缂佹绠栨繛鑼枎椤繘鎼归崷顓犵厯濠电偛妫欓崕鎶藉礈娴煎瓨鈷戠紒瀣皡瀹搞儲绻涚亸鏍垫嫹閹颁礁娈ㄦ繝鐢靛У閼圭偓鍎梻浣稿暱閹碱偊宕愰崨濠勵洸婵犲﹤鐗婇埛鎴︽煕濞戞﹫鍔熺紒鐘虫崌閹顫濋浣告畻婵犳鍣幏鐑芥⒑闂堟稓绠為柛銊ヮ煼閺佸秴顭ㄩ崼鐔叉嫼闁荤姵浜介崝宀勫几瀹ュ洨纾兼い鏃傛櫕閹冲啴鏌ｉ敐澶嬫暠缂佽桨绮欏Λ鍐煛閸愵亖妫ㄥ┑锛勫亼閸婃牕螞娴ｈ倽娑㈠礋椤栵絾鏅滈柣鐘烘〃缂嶅秹寮崼鐔蜂汗闂傚倸鐗婄粙鎰垝閸洘鈷戦悹鍥皺缁犺尙绱掔拠鑼闁伙絽鍢查埞鎴﹀幢閳哄倸鍏婇梻浣哄帶閹芥粓寮幖浣稿偍闁汇垹鎲￠埛鎴︽煕濞戞﹫宸ュ┑顔肩墦閺岋綁骞欓崟顓犵槇閻庤娲╃紞浣哥暦閻旂⒈鏁嶆繛鎴炶壘楠炴劙姊虹拠鑼闁稿鍋ゅ鍛婄節濮樺崬褰嗗銈嗗笒鐎氼參鎮″☉銏″�堕柣鎰硾琚氬銈冨劜缁秹濡甸崟顖氱闁绘劘妫勬禒顕�鎮楃憴鍕鐎规洦鍓熼崺銏℃償閵堝洨鏉搁梺褰掔畺椤ゅ倿宕懜鐢电瘈闁汇垽娼у暩闂佽桨鐒﹂幃鍌氱暦閹达附鍋愰悹鍥皺椤斿苯顪冮妶鍛婵☆偅顨堝▎銏ゅΧ閸氥倕缍婇幃鈺侇啅椤旂厧澹堢紓鍌欒兌婵箖锝炴径鎰﹂柛鏇ㄥ灠缁犳盯鏌熼娑橆棆妞わ缚鍗冲铏规崉閵娿儲鐏嗗┑鈽嗗亜鐎氭澘鐣烽幇鏉块敜婵°倧鎷风紒鐘靛█閺屸�愁吋鎼粹�崇闂佺粯鎸婚惄顖炲箖濡ゅ懏鏅查幖绮癸拷鑼泿婵＄偑鍊曠换鎰版偉婵傜钃熼柨婵嗩槹閸嬪嫰鏌涘┑鍕姕闁革急鍥ㄧ厽閹兼番鍨归崵顒勬煕濞嗗繐鏆ｉ柣娑卞櫍瀹曞崬鈽夊锟介崬鍫曟⒑闂堟侗妾у┑鈥虫喘瀹曘垽鎮介崨濞炬嫼闂佸憡绋戦敃銈夋倶閻斿吋鐓曞┑鐘插暟婢ч亶鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�
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



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
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛存嚍閵壯侊拷濠囨⒑閸濄儱校闁圭顭烽獮鍫ュΩ瑜濋幏鐑芥濞戞瑦鍠愮紒鐐劤閵堟悂寮诲澶婁紶闁告洦鍓欏▍銈夋⒑閹惰姤鏁遍柛銊ョ埣婵＄敻宕熼姘鳖唺闂佺粯鍔栧娆擃敂閸撲胶纾介柛灞剧懅椤︼附銇勯敂鍨祮妤犵偞鍔欓獮搴ㄦ寠婢跺矈鍞甸梻浣侯攰閹活亪姊介崟顖氱；闁告洦鍨遍崐鍫曠叓閸パ勬崳闁告柨绉归弻锟犲磼閿旇棄顏堕梻鍌氬�搁崐鐑芥嚄閸撲礁鍨濇い鏍仦閺咁亪鏌ｆ惔銏╁晱闁哥姵鐗犻幃銉︾附閸濄儱绁﹂梺鍝勭▉閸樿偐绮诲☉娆嶄簻闁哄倸鐏濋埛鏃堟煥濞戞瑧鐭掓慨濠呮閹瑰嫰濡搁妷锔撅拷铏圭磽娓氬洤鏋熼柣鐔村劦閹箖鏌ㄧ�ｎ剟妾梻鍌氱墐閺呮繄绮欒箛鎿冩富闁靛牆妫欓ˉ鍡樹繆椤愩垹顏い銏℃⒒閹瑰嫭鎷呴弴鐔割棃闁诡喒鏅犲Λ鍐ㄢ槈濡ゅ啯宕熼梻鍌欐祰椤曆呮崲閹寸姵宕查柛顐ｇ箘閺嗭附绻濋棃娑欙紞婵炲皷鏅犻弻銈夊传閵夛附姣勯梺鍛婎焽閺佽顫忓ú顏勫窛濠电姴鍊搁～宥夋⒑缂佹ɑ鎯堢紒缁樼箓閻ｇ兘鏁愭径濠勵槹濡炪倖鐗楃粙鎾诲储閹间焦鐓熼煫鍥ㄦ礀娴狅箓鏌＄�ｎ亶鐓奸柣鎿冨墴椤㈡宕熼鍌氬箰闂佽绻掗崑鐘虫叏閵堝＆澶婎煥閸曗晙绨婚梺鐟板⒔閸嬨劑宕戦姀顫嫹鐟欏嫭绀�鐎规洦鍓熼崺銏℃償閵堝洨鏉搁梺褰掔畺椤ゅ倿宕懜鐢电瘈闁汇垽娼у暩闂佽桨鐒﹂幃鍌氱暦閹达附鍋愰悹鍥皺椤斿苯顪冮妶鍛婵☆偅顨堝▎銏ゅΧ閸氥倕缍婇幃鈺侇啅椤旂厧澹堢紓鍌欒兌婵箖锝炴径鎰﹂柛鏇ㄥ灠缁犳盯鏌熼娑橆棆妞わ缚鍗冲铏规崉閵娿儲鐏嗗┑鈽嗗亜鐎氭澘鐣烽幇鏉块敜婵°倧鎷风紒鐘靛█閺屸�愁吋鎼粹�崇闂佺粯鎸婚惄顖炲箖濡ゅ懏鏅查幖绮癸拷鑼泿婵＄偑鍊曠换鎰版偉婵傜钃熼柨婵嗩槹閸嬪嫰鏌涘┑鍕姕闁革急鍥ㄧ厽閹兼番鍨归崵顒勬煕濞嗗繐鏆ｉ柣娑卞櫍瀹曞崬鈽夊锟介崬鍫曟⒑闂堟侗妾у┑鈥虫喘瀹曘垽鎮介崨濞炬嫼闂佸憡绋戦敃銈夋倶閻斿吋鐓曞┑鐘插暟婢ч亶鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�
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


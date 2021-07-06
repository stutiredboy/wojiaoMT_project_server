
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
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閹冣挃闁硅櫕鎹囬垾鏃堝礃椤忓孩瀚归柨婵嗙凹缁ㄧ粯銇勯幒瀣仾闁靛洤瀚伴獮鍥敂閸℃瑧鍘梻浣告惈鐞氼偊宕濋幋锕�绠栭柕蹇嬪�曟导鐘绘煕閺囩喎鐏熼柛銊ヮ煼閹拷妞ゅ繐鐗嗙粻姘辨喐濠婂牊鍋傚┑鍌氭啞閻撴盯鎮橀悙鎻掆挃闁宠棄顦甸弻宥夋寠婢舵ɑ鈻堥悗瑙勬穿缁绘繈骞冨▎鎾崇闁圭儤绻傛俊褎绻濋悽闈浶ラ柡浣规倐瀹曟垵鈽夐姀鈥冲壄闂佺粯鍨煎Λ鍕偪妤ｅ啯鐓熸俊顖涱儥閸ゆ瑩鏌﹂崘顏勬灈闁哄矉绻濆畷鍫曞煛娴ｅ湱浜栫紓鍌欒兌婵烇拷缂佺姵鐗犲濠氭晲婢跺﹦鐤�闂傚倸鐗婄粙鎴︼綖椤忓牊鈷戠紓浣诡焽缁犳牗绻涢懠顒�鏋庢い顐㈢箻閹煎綊宕烽鐘靛幆婵犵數鍋涘Λ娆撳磿閹惰棄绀堝ù鐓庣摠閳锋垹绱掔�ｎ亜鐨＄�规悶鍎茬换娑氫焊閺嶅灚瀚归柟棰佺濞堛劍绻濋悽闈浶ｉ柤鍦亾閸庮偊姊绘担绋挎毐闁圭⒈鍋婂畷鎰板川婵犲嫷娲稿┑鐘诧工閻楀﹪鍩涢幋锔界厱婵炴垶锕崝鐔虹磼閻樿櫕宕岄柟顔筋殔椤繈顢楁担鍛婄暬濠电姵顔栭崳顖炲箯閻戣姤鈷戦梻鍫熺〒缁犵偤鏌涢妸銉吋闁轰礁绉撮…銊╁醇閻斿弶瀚奸梺鑽ゅУ娴滀粙宕濆畝鍕嚑鐎广儱娲ㄧ壕鍏笺亜閺冨倹娅曢柟鍐插暣閺岋綁鏁愭径瀣殸缂備浇妗ㄧ划娆徫涢崘顔肩厸闁告劦浜栧Λ銊モ攽閿涘嫬浜奸柛濠冪墪铻炲ù锝堝�藉☉銏犵妞ゆ牭绲鹃弲婊堟煟閻樼儤銆冪紓宥呯Ч瀵噣宕奸悢铚傛睏闂傚倸鍊搁悧濠勭矙閹邦喖鍨濋柛顐ｆ礃閳锋垿鎮归崶顏勭毢缂佺姾灏欑槐鎺旀嫚閼碱剙顣洪梺浼欑到閸㈡煡鍩為幋锕�骞㈤柍鍝勫�搁崗濠囨⒒娴ｅ搫甯堕柟鑺ョ矒瀵偊骞栨担绋垮亶闂佹眹鍨归幉锟犲煕閹达附鐓曟繛鎴烇公瀹搞儱鈹戦鑲╁ⅵ闁哄矉缍侀獮娆撳礋椤撶姷妲囬柣搴ゎ潐濞测晝绱炴担鍝ユ殾闁绘梻鈷堥弫宥嗙箾閹寸偠澹樻鐐村姍濮婅櫣鎷犻懠顒傤唺闂佺顑囬崑銈咁嚕閸涘﹦绡�婵ê宕ぐ鍡楊渻閵堝棗绗掗悗姘煎弮閹�斥槈閵忊�筹拷鍫曟煟閹邦垱纭剧悮姘渻閵堝啫鍔滅紒顔肩Ч婵＄敻宕熼姘鳖啋闂佺粯鍔樺Λ鍕椤曪拷閹鎲撮崟顒傤槬閻庤娲﹂崜鐔煎春閵忊剝鍎熼柕鍫濇川閺夋悂姊鸿ぐ鎺旂暫妞ゃ倕鍊垮畷顒勬嚋閻㈢數鐦堥梺姹囧灲濞佳冩毄闂備浇妗ㄩ悞锕傚箖閸屾氨鏆﹂柟杈鹃檮閸嬫劙鎮归崶顏勭毢妞ゆ柨鑻—鍐Χ閸涱垳顔囧┑鈽嗗亝椤ㄥ牆鈻庨姀銈呂ч柛姘ュ�曠紞濠囧箖閳轰緡鍟呮い鏃傚帶婢瑰牏绱撻崒娆掑厡濠殿噣绠栭敐鐐村緞閹邦儵锕傛煕閺囥劌鐏犵紒鐘崇洴閺岀喖顢涘☉姗嗘濡炪倧缂氶崡鍐差潖閾忚宕夐柕濞垮劜閻忓棗鈹戦埥鍡椾簻閻庢碍婢橀悾鐑藉箛閺夊潡鏁滃┑掳鍊ч幏椋庣磼閻橀潧鈻堥柡灞革拷鎰佸悑閹肩补锟藉磭顔愰梻浣虹帛閹稿鎯勯鐐茬畺婵°倕鎳忛弲鏌ュ箹缁櫢鎷烽懠顒傛晨濠碉紕鍋戦崐鏇犳崲閹扮増鍋夊┑鍌滎焾閽冪喖鏌ㄥ┑鍡╂Ч闁稿瀚伴弻娑樷攽閸曨偄濮曢梺闈╂�ラ崶銊у幗闁瑰吋鐣崹褰掑吹椤掑嫭鐓曟繛鍡楃箰閺嗭綁鏌ｅ☉鍗炴珝鐎规洖宕埥澶婎潨閿熶粙宕崼鏇熲拺闂傚牊渚楀褍鈹戦垾铏枠鐎规洏鍨介幃浠嬪川婵炵偓瀚奸梻浣告啞缁嬫垿鏁冮妶澶嬪�堕柣鏂垮悑閻撴洖鈹戦悩鎻掓殶濠⒀囦憾閺屻劑鎮㈢拠娈嬫捇鏌ｉ弮鎴濆⒋妤犵偛绻橀弫鎾绘晸閿燂拷
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


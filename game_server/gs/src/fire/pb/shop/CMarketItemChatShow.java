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
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠绘鐐村灴婵拷闁靛牆鎳愰濠傗攽鎺抽崐褔骞忔搴ｆ／闁诡垎宀�鍚嬮梺鍝勭焿缂嶄線鐛崶顒夋晬闁挎繂妫岄幐鍛存⒒娴ｅ憡鍟炵紒璇插�婚敓鑺ユ皑閸忔﹢骞冮敓鐘参ㄩ柍鍝勫�婚崢鍗烆渻閵堝棗濮х紒鏌ョ畺瀹曟洟寮撮姀锛勫弳闂佸搫鍟ú銈堫暱闂備礁鎲￠悷銉ф崲閹寸偟鈹嶅┑鐘叉祩閺佸秵鎱ㄥ鍡楀箹濞寸姵鎸冲娲川婵犲嫮鐣哄┑锛勫仒缁瑥顕ｇ拠娴嬫闁靛繆锟藉厖姹楅梻浣告啞閻熴儵藝閽樺）娑㈡晝閸屾稈鎷洪梺鍛婄箓鐎氼垶锝為敃鍌涚厱闁哄喛鎷烽柛銊ф暬椤㈡岸鏁愭径濠勵啋濡炪倖娲栭幊蹇涘疾濠婂牊鈷戦柛娑橈梗缁堕亶鏌涘▎蹇擃劉閻庨潧銈搁獮妯肩磼濡攱瀚奸梻浣哄帶椤洟宕愰弴銏犲嚑闁瑰濮风壕鍏笺亜閺冨洤浜圭�涙繂顪冮妶搴″箹闁诲繑绻堥敐鐐差煥閸喐娅㈤梺鑺ッˇ閬嶅汲閿曞倹鐓欓梺顓ㄧ畱楠炴绱掗埥鍛濠电姵顔栭崰妤呮晝閳哄懎鍌ㄩ柦妯侯槴閺嬪秹鏌曡箛瀣拷鏍煕閹寸姷纾奸悗锝庝簻閻繝鏌涢弮鍌氭灈闁哄本鐩弫鎰板礃閵娿儱顫撴俊鐐�ら崢鐓幟洪銏㈠祦闁搞儺鍓氶崑瀣煕椤愮姴鐏╂鐐搭殕娣囧﹪鎮欓鍕舵嫹閺嶎厼绠伴柛鈩冪☉缁�鍐煃閸濆嫬鏆曞瑙勬礈缁辨捇宕掑顒婃嫹瀹勬噴褰掑炊閵娧屾锤濡炪倖甯掔�氼剛澹曟繝姘厪闁割偅绻冮崳浠嬫煛閸☆厾鐣甸柡灞炬礃缁绘盯鎮欓浣哄絽缂傚倷鑳剁�氬繘宕堕妸褍骞嶉梺璇叉捣閺佹悂鈥﹂崼銉晛鐎癸拷閸曨剛鍘遍梺缁樺姇閻忔岸寮抽鍕厸鐎癸拷鐎ｎ剛蓱闂佽鍨卞Λ鍐极瀹ュ绀嬫い鎾跺枑椤斿棝姊婚崒娆掑厡妞ゎ厼鐗撻弻濠囨晲閸℃瑯娲搁梺鍓插亝濞叉粌鐣垫担绯曟斀闁绘ɑ褰冮弳鐐烘煕鎼达絽鏋涢柡灞诲妼閳规垿宕卞Ο铏圭崺闂備胶绮敮鎺楀Χ閹间礁钃熼柨婵嗙墢閻わ拷闂佸搫娲ㄩ崑妯煎垝閼哥數绡�闁冲嚖鎷烽柛娑卞枟閻濐亞绱撴笟鍥ф灓缂侇噮鍨舵俊鍫曟晲婢跺﹦顦ㄩ梺鍐叉惈閸燁偊鐛幇顑芥斀闁绘﹩鍠栭悘杈ㄧ箾婢跺娲存い銏＄墵瀹曘劎锟芥稒锚閿熻棄鐖奸弻宥夊传閸曨偅娈剁紒鐐劤閵堟悂寮婚敐鍜佹建闁跨喕妫勯…鍥樄鐎规洘绻勯敓鏂ょ秵閸犳鎮¤箛娑欑厱闁靛鍨甸崰姘閸愵煈娓婚柕鍫濆暙閻忣亝绻涢懠顒�鏋戦柟渚垮姂閺佹挻绂掔�ｎ偆鍘撻柣鐘荤細濞咃絾绂掑畝鍕厱闁靛绲芥俊鍧楁煕濡粯鍊愰柡宀嬬秬缁犳盯寮撮悙鏉挎憢濠电姵顔栭崰鎾诲磹濠靛﹥锛傞梻渚�娼х换鍡椢ｉ崨顓涙灁濞寸姴顑嗛悡鐔兼煙闁箑鐏＄憸鎶婂洦鐓犻柟宄版湰绾爼鏌ㄩ悢鍑ゆ嫹閻曚焦缍堝┑鐐插级閿曘垽寮崘顔碱潊闁靛牆娲ょ粊锕傛⒑鐟欏嫬绀冩い鏇嗗懐涓嶉柟鎯板Г閻撴盯鏌涢幇顓烆嚋閻庢艾缍婂鍝勭暦閸モ晛绗″┑鐐跺皺閸犲酣锝炶箛鏃傜瘈婵﹩鍓涢敍婊冣攽閻愬弶顥為悽顖涘浮瀹曘垽鏁撻悩鏂ユ嫼缂備礁顑嗙�笛囧箲閿濆鐓涘ù锝囩摂閸ゆ瑩鏌ｉ敐鍥у幋妤犵偛顑夐弫鍐晸閻ｅ瞼涓嶅┑鐘崇閸嬶綁鏌涢妷顔荤盎闁汇劎鍎ら妵鍕晜鐠囧弶鐝濋梺璇″枟椤ㄥ﹪鎮伴锟藉畷褰掝敊閻撳寒娼涢梻鍌欒兌閹虫捇宕查弻銉晞闁告稒娼欒繚闂佸湱鍎ら幐鍓у姬閿熻棄鈹戦鏂や緵闁告﹢绠栧畷銏ゆ焼瀹ュ棗锟界敻鏌ｈ閹诧紕锟芥艾缍婂铏规崉閵娿儲鐎虹紓渚囧枟閻熴儵鎮鹃悜钘夌闁挎棁妫勯敓鐣屽厴閺屾稑鈹戦崱妤婁紑闂佸搫鐫欓崶銊㈡嫼闁荤姵浜介崝灞解枍閹扮増鐓欓柛鎴欏�栫�氾拷?").append(excuteTime).append("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇闂傚倸鍋嗛崹閬嶅Φ閸曨垰鍐�闁靛ě鍛帓缂傚倷绶ら幏宄扳攽閻樺弶澶勯柣鎾存礋閺屽秹鍩℃担鍛婃闂佸疇妫勯ˇ閬嶆儉椤忓牆绠氱憸婊堟偂婵傚憡鐓涢悘鐐插⒔濞叉挳鏌涢埡浣割伃鐎规洘锕㈡俊鎼佸Ψ閿斿彞绨界紓鍌氬�搁崐鎼佸磹閸濄儳鐭撻柣銏犳啞閸嬪鏌ｅΟ娆惧殭闁藉啰鍠栭弻鏇熺箾閻愵剚鐝曢梺绋款儏濡繈寮诲☉姘勃闁告挆锟藉Σ鍫濐渻閵堝懘鐛滈柟鍑ゆ嫹");
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

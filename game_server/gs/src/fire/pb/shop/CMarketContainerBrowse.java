
package fire.pb.shop;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CMarketContainerBrowse__ extends mkio.Protocol { }

/** 摆摊容器浏览
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CMarketContainerBrowse extends __CMarketContainerBrowse__ {
	@Override
	protected void process() {
		// protocol handle
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if (!fire.pb.shop.srv.market.Market.useMarketCheck(roleId))
			return;
		
/*		
		fire.pb.item.ItemColumn itemcol = fire.pb.item.Module.getInstance().getItemColumn(roleId, fire.pb.item.BagTypes.MARKET, true);
		fire.pb.pet.PetColumn petcol = new fire.pb.pet.PetColumn(roleId, fire.pb.pet.PetColumnTypes.MARKETPET,true);
		SMarketContainerBrowse browse = new SMarketContainerBrowse();
		browse.items = itemcol.getBagInfo().items;
		browse.pets = petcol.getAllProtocolPets();
		gnet.link.Onlines.getInstance().send(roleId, browse);
		*/
		new mkdb.Procedure() {
			protected boolean process() {
				if (fire.pb.main.Gs.isMergeServer()) {
					// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ閸℃ぞ绮℃俊鐐�栭崝褏绮婚幋鐘差棜闁秆勵殕閻撴瑧绱撴担闈涚仼婵炲懏锕㈤弻鈩冩媴閸撴彃鍓辨繛锝呮搐閿曨亝淇婇崼鏇炲窛妞ゆ挾鍠愰澶愭⒒娴ｄ警鐒炬い鎴濇閺佸啴濮�閵堝懓鎽曢梺鍝勬川閸犳挾绮绘ィ鍐╃厱妞ゎ厽鍨靛▍娆撴煙瀹勬澘妲婚柍钘夘樀婵拷闁绘ɑ褰冩禍鑸典繆閻愵亜锟芥牜鏁繝鍥ㄥ�块柨鏇炲�搁惌妤呯叓閸ャ劍鈷掔紒鈽呮嫹闂傚倸鍊搁悧濠勭矙閹达富鏁傞柍鍝勬噺閻撱儵鏌ｉ弮鍥跺殭鐞氭岸姊洪悜鈺傛珦闁搞劌鐖煎顐﹀箛閻楀牆锟界兘鏌涘▎蹇擄拷鐟拔涢崘銊ф殾闁靛ň鏅╅弫濠囨煕韫囨艾浜归柡澶夌矙濮婂宕掑▎鎴М闂佺顕滅换婵嬪箖閻戣棄唯闁冲鍐╁枠妤犵偛绉归、娆撴倷椤掞拷濞呮﹢姊婚崒姘拷鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓绨绘俊鐐�栫敮鎺旓拷姘煎弮閸╂盯寮崼鐔哄幈闂佸搫娲㈤崝灞剧妤ｅ啯鐓犻柡澶庢硶娴犮垽鏌曢崱妯虹瑨妞ゎ偅绻堥幃娆擃敆閿熶粙顢旈崼鏇熺厽閹兼番鍊ゅ鎰箾濞村娅囩紒杈╁仦閹峰懘宕滈幓鎺擃吙闂備胶顭堥敃锕傚闯閵夈儙锝夋嚃閳哄啰锛濇繛鎾磋壘閿曘儳锟芥艾缍婂铏规崉閵娿儲鐏嗘繝娈垮枔閸婃骞戦姀鐘闁靛繒濮烽娲⒑缂佹ê濮堟繛鍏肩懅閸犲﹤顓兼径瀣ф嫼闁诲海娅㈤梽鍕熆濡绻嗛柛蹇曨儠娴滄粍銇勮箛鎾愁仼闁哄棴绲块敓鍊燁潐濞叉鏁敓鐘茬畺婵炲棙鎸婚崵鎴炪亜閹烘埈妲搁柡浣规倐濮婅櫣鎷犻弻銉拷妤冪磼閻樿尙效鐎规洘娲熼弻鍡楊吋閸涱垳鏋冮梺纭呭閹活亞寰婇崸妤佸剹闁糕剝鐟遍幏鐑芥儌閸涘﹤顏堕梻浣告啞濞诧箓宕楀锟介獮蹇涘传閸曞灚瀵岄梺闈涚墕濡绮崒鐐寸厽闁硅櫣鍋涢々顒�霉濠婂嫭鍊愭い銏★耿婵拷闁挎稑瀚獮鍫熺節閻㈤潧浠滄俊顐ｎ殘閹广垽骞嬮敃锟界壕濠氭煏婢跺棙娅嗛柣鎾寸懄閵囧嫰寮介妸銊ヮ棟闂佸搫妫寸徊鍧楁晸閸婄噥娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娓氾拷瀵挳濮�閻欙拷濞煎﹪姊虹紒妯忣亞澹曢鐘电煋鐟滅増甯楅埛鎺楁煕鐏炲墽鎳呯紒鎰⒐缁绘盯鎮℃惔顔惧悑濡ょ姷鍋涚换姗�寮幘缁樻櫢闁跨噦鎷�?
					Integer val = xtable.Takebackmarketcontainertab.select(roleId);
					if (val == null) {
						fire.pb.shop.srv.market.MarketManager.getInstance().sendTempMarketContainer(roleId);
						if (fire.pb.shop.srv.market.MarketManager.LOG.isInfoEnabled()) {
							StringBuilder sbd = new StringBuilder();
							sbd.append("role=").append(roleId).append(", 婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｉ幇顒佲枙闁绘帟濮ょ换娑㈠幢濡櫣浠搁悗瑙勬礀瀵埖绌辨繝鍥ч柛娑卞枛閻濇梻绱撻崒姘毙ｉ柣妤佺矒閺佹捇鎸婃径宀�鏆涢梺绋块叄娴滄儼妫熸繛瀵稿帶閻°劑宕愰崹顔规斀闁稿本纰嶉崯鐐烘煟閹惧鎳囬柡宀�鍠栭、娑㈠幢濡わ拷閺嗙偞鎱ㄩ敐鍡楀闁诡喗顨婇幃浠嬫濞戣鲸姣夋繝纰樻閸嬪嫰宕锔绘晪闁挎繂顦柋鍥煛閸モ晛浠ч柛妯绘倐濮婅櫣绮欓幐搴㈡嫳缂備礁顑嗛幑鍥х暦閿濆骞㈡俊鐐电帛閺傦拷闂備胶绮崝鏍亹閸愵亞妫憸鏃堝蓟閿濆憘鏃�绗熼崶銊ф毉缂傚倷绶￠崰妤呮偡閿曪拷椤曘儵宕熼銈嗘畷闁诲函缍嗛崑鍕敂鐠鸿　鏀介柣鎰綑閻忥附銇勮箛搴″祮妤犵偛顑勭紞鍛存煕閵夘喕鎲炬俊顖氬濮婃椽宕崟顕呮蕉闂佺锕ョ换鍌炴偩瀹勯偊娼ㄩ柨鐔剁矙楠炲﹪鎮╅崹顐㈢／婵炴挻鍑归崹顖滄閺冨牊鈷掑ù锝囩摂閸ゆ瑥螖閻樿櫕鍊愰柟顔矫～婵嬫嚋閸偅鐝栭梻渚�娼х换鍫ュ磹閺囥垹鍑犲〒姘炬嫹闁哄被鍔戦幃銈夊磼濞戞﹩浼�?");
							fire.pb.shop.srv.market.MarketManager.LOG.info(sbd.toString());
						}
						return true;
					}
				}
				fire.pb.shop.srv.market.MarketManager.getInstance().sendMarketContainerByRoleId(roleId);
				return true;
			}
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810647;

	public int getType() {
		return 810647;
	}


	public CMarketContainerBrowse() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CMarketContainerBrowse) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CMarketContainerBrowse _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


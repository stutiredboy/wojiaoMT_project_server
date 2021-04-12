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
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊炲銈嗗笒椤︿即寮查鍫熷仭婵犲﹤鍟扮粻缁橆殽閻愭潙鐏村┑顕嗘嫹闂侀潧鐗嗛幊鎰邦敊婵犲倵鏀介幒鎶藉磹瑜旈獮蹇旑槹鎼达絾锛忛梺璇″瀻瀹�锟介崥瀣⒑閸濆嫮鐒跨紓宥勭窔閻涱噣宕堕澶嬫櫖闂佹寧绻傚Λ宀勫箰閸涘瓨鈷掑ù锝呮啞閸熺偟绱掔拠鎻掞拷濠氭晸閼恒儲鐨戦柛蹇旓耿楠炲啴鏁撻悩鍙傘劑鏌嶉崫鍕拷濠氬储閸楃儐娓婚柕鍫濇婵呯磼閺屻儳鐣虹�规洘娲熷鎾閿涘嫬寮抽梻浣告惈閸燁偄煤閵堝牜鏆遍梻鍌欑閹诧繝鎮烽妷褎宕查柟瀵稿仧閳瑰秴鈹戦悩鍙夌ォ闁轰礁绉甸幈銊ヮ潨閸℃绠规繛瀵稿У閹稿啿顫忓ú顏勫窛濠电姴瀚悾鍝勨攽閿涘嫬浠掔紒顔界懃椤曪絿鎷犲ù瀣潔闂侀潧绻嗛敓钘夊帠濮规姊绘担鍛婂暈闁荤喆鍎佃棟闁芥ê锛夊☉銏℃櫇闁稿本绋堥幏娲⒑閸涘﹦绠撻悗姘煎灦閿濈偤鏁冮崒娑氬幈闂佸搫鍠涢幏鐑芥煕閵娧勬毈妞ゃ垺宀搁弫鎰緞婵犲嫷鍟嬫俊鐐�栧ú鏍箠韫囨稑鐤炬繝濠傜墛閳锋垿鏌涘☉姗堟缂佸爼浜堕弻娑樷枎韫囨搩鍔夐柣搴ㄦ涧閵堟悂鐛Ο鑲╃＜婵☆垶鏀辩�氬ジ姊绘担鍝勫付妞ゎ偅娲熷畷鎰板即閵忕姴鍤戦梺鐟邦嚟婵澹曢崗绗轰簻闁哄啫娲ゆ禍鍦拷娑欑箓椤啴濡舵惔鈥崇闂佽绻戠换鍫ユ晲閻愬樊鐓ラ柛顐ゅ枑濞呫垽姊洪懞銉冾亪藝闁秴姹查柨鏇炲�归悡娆撴⒑椤撱劎鐣辨鐐搭焽缁辨帡鍩ラ崨顔碱伓婵犵數濮甸鏍窗濡ゅ懏鏅濋柍鍝勬噹閸屻劑鏌﹀Ο渚Т闁哄绉归弻鏇＄疀鐎ｎ亷鎷烽弽顓炵厱闁瑰濮风壕濂告倵閿濆簼绨婚柣顭掔節閺屾盯寮崒姘亪闂佸搫鏈惄顖炲极閹版澘绀冮柕濞垮劚椤挻淇婇悙顏勶拷銈夊储閻撳篃娲敇閵忋垹绁﹂梺鎼炲労閸撴岸宕戠�ｎ喗鐓曟い鎰Т閻忊晜顨ラ悙鎼畷濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡宥庡幖缁犱即鏌涢埄鍐槈缂侊拷閸愵喗鐓冮柛婵嗗閺嗘洖顭跨憴鍕缂佽鲸鎹囧畷鎺戭潩椤掑﹥瀚圭�瑰嫭鍣磋ぐ鎺戠倞闁靛ě灞鹃敜婵＄偑鍊栫敮鎺旓拷姘煎墰婢规洘绻濆顓犲帾闂佸壊鍋呯换鍐闯娴犲鐓涢柛鈽嗗幘閻ｇ敻鏌＄仦鐐缂佺粯鐩幃娆擃敆娴ｅ搫绲界紓鍌氬�烽懗鍓侊拷姘箻瀹曞爼濡歌楠炲秹姊虹拠鍙夋崳闁轰焦鎮傞垾锕傚醇閵夘喗鏅涢悗鐧告嫹闁告洦鍓涢崢閬嶆⒑缂佹ê濮囬柣蹇斿哺瀵娊顢楅崟顒傚幐閻庣櫢鎷烽悗锝庡墰钃遍梻浣筋嚃閸ㄥ崬螞閸愵喖鏋佺�广儱顦粈瀣亜閹捐泛鏋戞い鏂挎濮婂宕掑▎鎺戝帯濡炪値鍘奸悧鎾诲蓟婵犲洦鏅查柛鈩冪懐濞叉悂姊洪崜鎻掍簼婵炲弶绮岄悾鍨媴缁洘鏂�闂佺粯蓱瑜板啴寮抽悙鐑樼厱閹艰揪绲介弸娑㈡煛鐏炶濡奸柍瑙勫灴瀹曞崬螣閾忓湱宕洪梻鍌欒兌缁垳鏁幒妤�围闁归棿绀侀拑鐔兼煥濠靛棛澧㈤柣銈忔嫹闂備礁鎼ú銊╁磻濡厧鍨濋柤鍝ユ暩缁★拷闂佸啿鍤栭幏鐑芥煕濞戝崬鏋熼柣婵愪簽缁辨挻绗熼崶褎鐏撶紓渚囧櫘閸ㄨ埖淇婇崼鏇熸櫜濠㈣泛锕﹂ˇ銊╂⒑閸愬弶鎯堥柛鐕佸亰閻涱噣骞囬鑺ユ杸闂佺粯锕╅崰鏍倶鏉堛劎绠惧璺侯儑濞插瓨銇勯姀锛勫⒌鐎规洏鍔庨敓鑺ョ♁閿氶柨鐔绘閻栧ジ寮诲澶婁紶闁告洦鍋呭▓鍓佺磼閻愵剙鍔ら柕鍫熸倐瀵鏁愰崪浣瑰缓闂佽法鍠曞Λ鍕�﹂崶顏嶆▌閻庤娲樼换鍕晸閺傘倗绉甸柛鐘愁殜閹ょ疀濞戞瑧鍘遍梺闈涱槹閸ㄧ敻宕板顓烆嚤闁告劦鐓堝〒濠氭煏閸繂鏆欓柣蹇ｄ簼缁绘盯鎳犻锟介弸鎴︽煙娓氬灝濮傞柡浣规尰缁傛帞锟斤綆鍋嗛崢鎾绘煟閻樿崵绱版繛鍜冪稻缁傛帒鐣濋崟顒傚幈闂侀潧顧�缁茶姤淇婇崸妤佺厱婵☆垳绮崐鎰版煛瀹�瀣К缂佺姵鐩鎾倷閺夋寧鎲㈡繝鐢靛У椤旀牠宕伴幘璇茬９婵犻潧锕ラ敍鍌炴⒒娓氾拷濞佳呮崲閸℃あ锝夊川椤撴稒鐏佹繛瀵稿Т椤戝棝鎮￠悢鍏肩厵闂侇叏绠戦悘锛勬喐閹跺﹤娲﹂悡鐘绘煙瀹勭増婀扮痪顓炵埣閺屻劑鎮㈤崙銈嗗闁绘洑鐒︾紞鍫濃攽閻愭彃绾ч柨鏇樺灲瀵偊宕橀纰辨綂闂侀潧鐗嗗ú銈囩矈閿曞倹鈷戦悷娆忓缁�鍐┿亜閺囧棗鎳愭稉宥夋煙閹澘袚闁绘挻鐩弻娑㈠箛椤撶儐鍤嬮柣搴㈣壘缂嶅﹤顫忛崫鍕殾闁搞儮鏅涚粭鈥斥攽閻愯泛鐨洪柛鐘查叄閿濈偠绠涢弮鍌滅槇濠殿喗锕╅崜娑㈡晬濠婂啠鏀介柣鎰级椤ョ偤鎮介娑樻诞鐎规洏鍨介弫鎾绘偐閺傘儲瀚肩紓鍌欑椤戝棛锟界瑳鍥х闁挎繂顦伴悡娑樏归敐鍥╂憘闁搞倖鐟╅弻锝夋晲閸パ冨箣濡ょ姷鍋涢澶愬极閸愵喗鏅搁柣锝呯灱娑撳秴鈹戦悩宕囶暡闁稿缍侀弻娑㈠Ψ椤旇崵鐩庨梺姹囧妿閸庛倝濡甸崟顖涙櫆閻犲洤寮堕悵婵嬫⒑鐠団�虫灍妞ゃ劌锕幃浼搭敋閿熻棄鐣疯ぐ鎺濇晩闁绘挸瀵掑娑㈡⒒閸屾瑨鍏岄柟铏崌瀹曟煡寮婚妷顔芥櫈闂佸憡绋掑娆掔箽闂備礁婀遍崕銈夊箰閸撗冨К闁跨喕妫勯埞鎴︻敊閺傘倓绶甸梺鍛婏耿缁犳牕鐣烽姀銈嗙劶鐎广儱妫楅敓鐣屾暬閺岋綀顦查柟璇х磿閿熻姤鑹剧紞濠傤潖閾忚宕夐柕濞垮劜閻庤櫣绱撴笟鍥ф灍闁荤喆鍎甸幃楣冩倻閽樺顓洪梺鎸庢濡嫰鏁撻悾灞藉幋闁哄本绋戦埞鎴﹀幢濡ゅ﹣绱戦梻浣告惈閻瑩宕堕妸銏″闂佽崵濮垫禍浠嬪礉鐏炶В鏋嶉柟鎵閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹?").append(excuteTime).append("濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愰梻鍌氬�搁崑鍡涘垂闁秴桅闁告洦鍨伴崘锟介梺闈浤涢崨顖氬笓缂傚倸鍊风欢銈夊箯瀹勬壋鏀介柣妯哄级婢跺嫰鏌ｉ幘瀛樼闁哄苯绉归崺鈩冩媴閸涘﹥顔嶉梻浣哥枃濡嫰藝闁秵鍎夋い蹇撶墕缁犳氨鎲稿鍫熷亗濠靛倸鎲￠悡娑㈡倶閻愭彃鈷旀繛鍙夋尦閺屾盯鍩℃担鍓蹭純閻庤娲橀敃銏′繆閹间礁唯闁挎柨褰炵花鐣岀磽閸屾艾锟芥悂宕愰幖浣哥９闁告縿鍎抽惌鎾绘煟閵忕姵鍟為柛瀣儔閺岋絽螣濞嗘儳娈梺钘夊暟閸犳牠寮婚弴鐔虹闁绘劦鍓氶悵鏇㈡⒑缁嬫鍎忔俊顐ｇ箞瀵鈽夊顐ｅ媰闂佸憡鎸嗛敓钘壩ｉ崼婵愭富闁靛牆鎳橀悰婊堟煙閸戙倖瀚�");
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

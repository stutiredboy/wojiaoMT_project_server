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
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐差渻閵堝棗绗掓い锔垮嵆瀵煡顢旈崼鐔蜂画濠电姴锕ら崯鎵不缂佹﹩娈介柣鎰綑閻忔潙鈹戦鍡樺闂備線娼ч悧鍡涘箠閹伴偊鏁婂┑鐘插�甸弨浠嬪箳閹惰棄纾圭憸鏃堢嵁韫囨棏妲归幖杈剧稻閿涘繘姊虹拠鈥崇�荤�癸拷閿熶粙宕ョ�ｎ喗鈷戦柛婵嗗閻掕法绱撳鍕獢闁绘侗鍣ｅ畷鍫曨敆婢跺娅栭梻浣瑰缁诲倸螞瀹�鍕闁告稑鐡ㄩ埛鎺懨归敐鍛暈闁哥喓鍋熺槐鎺旀嫚閹绘帪鎷锋繝姘櫢闁兼亽鍎查惃鎴︽煕韫囨棑鑰挎鐐插暣閺佹捇鎮╅崣鍌樺姂閺屽秹宕崟顐嫹婵犳艾鍌ㄩ柛妤冨剱濞撳鏌曢崼婵囶棞濠殿啫鍛＜闁哄被鍎抽悾铏癸拷瑙勬礃濞茬喎顕ｉ幘顔碱潊闁挎稑瀚鎶芥⒒娴ｅ憡鎯堥柛鐕佸亜鐓ら柕鍫濈墱閺嗛亶姊婚崒娆戭槮闁硅绻濋幃鐑藉Ψ瑜庡畷鏌ユ煙鐎电浠ч柍鐟扮Т閳规垿鎮╅崣澶屻偐闂佽桨绀佺粔鐢稿箞閵娿儺娼ㄩ柛鈩冾殔缁犺绻涚�电校闁圭鍟块～蹇撁洪鍕獩婵犵數濮寸�氼噣鎮鹃崫鍕ㄦ斀闁挎稑瀚禒鎺旂磼椤旂晫鎳冩い鏇悼閹风姴霉鐎ｎ偒娼旈梻渚�娼х换鍡涙晸閽樺甯犳慨瑙勵殜濮婄粯鎷呴崨濠傛殘闂佽崵鍠嗛崕浣冩闂佽姤锚閿涘鈽夐姀鈩冩珖闂佺鏈粙鍫ュ箯濞差亝鈷戦柛娑橈功缁犳捇鎮楀鐓庣仸闁挎繄鍋ら弫鍐磼濞戞艾骞堥梻浣告惈閸犳盯骞忛悜鑺ョ厱闁靛ě鍕瘓濡炪們鍨哄畝鎼佸极閹邦厼绶炲┑鐘插閸熷淇婇悙顏勶拷鏍洪弽顓炵疇闊洦绋戦悿鐐節婵犲倻澧涢柍閿嬪灴閺屾稑鈽夊鍫燁暭缂備礁鐖兼禍鍫曞蓟濞戞ǚ鏋庨煫鍥ㄦ惄閸斿鏌ｆ惔銊︽锭闁靛牊鎮傞悰顔嘉熼懖鈺冿紲濠碘槅鍨堕弨杈╋拷姘偢濮婄粯鎷呴崫鍕粯濡炪値鍋呭ú鐔风暦閹版澘鍗抽柕蹇曞Т閸ゆ垿姊洪悷閭﹀殶濠殿噣顥撴竟鏇㈠礂缁楄桨绨婚梺鍝勫暙濞层倖绂嶉崷顓ㄦ嫹濞戞瑧绠撴い顏勫暣婵¤埖鎯旈垾宕囶啇闂備浇顕х换鎴犳崲閸儲鏅查柣鎰▕閻撱儵鏌涢銈呮瀾婵炲懌鍨藉娲嚍閵夊喚浜棟闂侇剙绉村Ч鏌ユ煥閺囩偛锟藉綊鎮″▎鎾粹拺妞ゆ挶鍔庨悾杈殽閻愭惌鐒界紒杈ㄥ浮閸┿儵宕ㄩ纰变紦濠电姷鏁告慨鐢割敊閺嶎厼绐楁俊銈呮噺閺呮繈鏌嶉崫鍕櫣闁稿被鍔戦弻锕�螣娓氼垱孝闂佸搫顑呯粔褰掑蓟閺囷紕鐤�閻庯綆浜烽幏鐑藉冀椤撶偟鍘遍梺鐟邦嚟婵澹曟總鍛婂�甸柨婵嗙凹缁ㄥ鏌ｉ…鎺旂瘈闁哄本鐩顕�宕掑顓犱邯闂備礁鎼張顒勬儎椤栫偛鏋侀柟鐗堟緲缁�鍐煏婵炲灝鍔氭い顐ｆ尰娣囧﹪鎮欓鍕舵嫹閵堝鍌ㄩ柣鎾崇瘍濞差亶鏁囬柕蹇嬪灩缁侊箓姊洪幖鐐插姶闁告挻宀稿畷鎴狅拷锝庡枟閻撴洘銇勯幇顔夹㈤柣蹇婃櫆椤ㄣ儵鎮欓幖顓熺暦婵烇絽娲ら敃顏堝箖濞嗘搩鏁傞柛鏇″煐鐎氬綊鏌″搴″箹缂佺姳鍗抽弻娑㈠焺閸愵亖妲堢紓渚婃嫹闁告劦鍠楅悡鍐煕濠靛棗顏╅柡鍡樻礀椤法鎲撮崟顒傤槶缂備浇椴搁幑鍥х暦閹烘埈娼╂い鎺戯攻鐎氬湱锟界懓瀚崳纾嬨亹閹烘垹鍊為梺闈浤涚仦楣冩暅濠碉紕鍋戦崐鏍暜閹烘棑鎷峰鐓庡濠㈣娲樼换婵嗩潩椤撶姴甯鹃梻浣稿閸嬪懐鎹㈤崘顔奸棷濞寸姴顑嗛悡娑㈡煕閳藉棗骞橀柣锝囨暬閺岋紕浠﹂悙顒傤槰缂備胶绮惄顖炲箖濞嗘搩鏁嗗ù锝呮惈缁茬晫绱撻崒姘拷鐑芥嚄閸撲緤鎷峰顒傜鐎规洖鐖兼俊姝岊槻妤犵偛绉瑰铏规嫚閸欏宕抽梺杞扮劍閹倿鍨鹃敃鍌氶唶闁靛鍠楅弲娑㈡倵閻у憡瀚归梺鍛婃处閸撴盯宕㈤柆宥嗏拺缂備焦锚婵洭鏌ｈ箛鏂垮摵鐎殿喗濞婇、妤呭礋椤掑倸骞愰柣搴ｆ閹风兘鎮楅敐搴″閽冮亶姊绘担绛嬪殐闁搞劌宕灋闁告劦鍠栭弸浣猴拷骞垮劚椤︻垳绮堢�ｎ偁浜滈柟鎹愭硾閺嬫垶銇勯弬鎸庮棦婵﹤顭峰畷鎺戔枎閹烘垵甯俊鐐�ら崢濂告偋閹捐钃熷┑鐘叉处閺呮煡鏌涢埄鍐噽婵炲弶鎮傚娲礈閹绘帊绨煎┑鐐插级缁矂鎮鹃崹顐ｅ缂侇垱娲橀弬锟介梻浣虹帛钃辩憸鏉垮暣瀵娊鎮欓悜妯煎幈闁硅壈鎻徊浠嬪几濞戙垺鐓涢悘鐐额嚙婵″ジ鏌嶇憴鍕伌鐎规洖宕灒闁惧繐婀卞畷娲⒒閸屾瑨鍏岀紒顕呭灣閺侇噣骞掑Δ锟藉洿闂佸綊妫跨粈渚�鎷戦悢鍏肩叆婵犻潧妫涙晶銏ゆ煟閵堝繑瀚归梻鍌欑閹碱偄煤閵娾晛纾绘俊顖滃帶閸ㄦ繈鏌ら崫銉︽毄缂佲槄鎷烽梻浣稿暱閸ゆ牠骞忛悜鑺ョ厱婵炴垵宕弸鐔兼煟濠垫劒绨界紒杈ㄦ尰缁楃喖宕惰閻忔挾绱撴笟鍥ф珮闁搞劏鍩栨穱濠囧醇閺囩喐娅滄繝銏ｆ硾閿曪箓藝閵娾晜鈷戦柛鎰级閹牓鏌涢悤浣镐喊闁绘侗鍣ｉ獮鍥敄閼恒儲鏉搁梻浣虹帛閿曗晠宕伴弽顓熷�堕弶鍫涘妿缁犳儳顭跨捄渚剳婵炴彃鐡ㄩ妵鍕閿涘嫬鈷岄悗瑙勬磸閸斿酣鏁撻懞銉р檨闁挎岸鏌ㄩ悢缁橆棄闁绘牕銈稿璇差吋婢跺﹣绱堕梺鍛婃处閸嬪懎鈻撻崜浣虹＜闁绘劦鍓欓崝銈夋煏閸喐鍊愮�殿喖顭烽弫鎰板椽娴ｇ懓缂撻梻浣芥硶閸犳洖螞閸曨垪锟斤箓宕堕宥嗏枌闁诲氦顫夊ú妯兼崲閸曨垱鏅搁柡鍌樺�楃粔鐢告煕閻樻剚娈滈柟顔欍倗鐤�婵炴垶鐟ч崢閬嶆⒑闂堟侗妲归柛銊ф暬瀹曟澘顫濋鐑嗗殼闂佸憡鍔﹂悡鍫濄�掓繝姘厪闁割偅绻傞弳娆撴煟韫囷絼绨肩紒缁樼洴閹崇娀顢楅敓浠嬪几閹达附鐓欏〒姘仢婵倿鏌℃担瑙勫鞍缂佸倹甯為敓鏂ょ秵閸嬪棝宕㈤幘缁樼厽闁绘宕电槐鐗堢箾閸滃啰绋荤紒鍌涘笒閻ｆ繈宕熼鍌氬箞闂備線娼ч¨锟界紒鑼跺Г娣囧﹪宕稿Δ浣哄幈濠碘槅鍨崇划顖炲磹閹扮増鐓涚�癸拷鐎ｎ剛袣缂備胶濮甸惄顖氼嚕閹绢喗鍊烽柡澶嬪閹层垺绻濋悽闈浶ｆい鏃�鐗犲畷浼村箻鐠囪尙锛欏┑鐘绘涧閿曘儵鏁嶉崒鐐粹拻濞撴熬鎷锋繛浣冲懏宕查柛鈩冦亗閿濆宸濇い鎾寸♁閻忎焦绻涚�电孝妞ゆ垵妫濋幃锟犳偄閸忚偐鍘甸梻渚囧弿缁犳垿鎮橀敍鍕枑闁硅泛锕ゅú锕傛偂閻樼粯鐓欑�瑰嫮澧楀﹢鎵棯椤撶偟鍩ｉ柡灞诲姂閹垽宕欓妶鍡楊伓闂佺粯娲戦悞锔剧礊閸績鏀介柣鎰絻缁狙囨煥閺囨ê鐏茬�殿噮鍋婂畷姗�顢欑喊杈ㄧ秱闂備線娼ч悧鍡椕洪妶鍥╃焾闁挎洖鍊归埛鎴︽偡濞嗗繐顏╃紒锟介崘鈹夸簻闁哄洤妫楅幊鎰▔瀹ュ鐓欓柟顖涙緲琚氶梺缁樻尰閻╊垶寮诲☉銏犵疀妞ゆ挾鍎愰崵瀣煟鎼淬垼澹樼紓宥咃工椤繘宕崟顓熸闂佹悶鍎弲娑氱箔閳ユ枼鏀介柣鎰硾閻ㄦ椽鏌涢悩鏌ュ弰闁挎繄鍋犵粻娑㈠籍閸屾粎妲囨繝娈垮枟閿曗晠宕滃☉銏℃櫖婵犲﹤鍟犻弨浠嬫煟閹邦剙绾фい銉у仱閹粙顢涘☉妯昏癁閻庤娲忛崹浠嬪极閹剧粯鍋愰柡鍌樺劜鐎氳偐绱撻崒娆戭槮妞ゆ垵妫涢敓鐣岀懗閸パ咁唹闂佹寧绻傞ˇ浼存偂濞戞◤褰掓晲閸モ晜鎲橀梺鎼炲�栭悷鈺呭蓟閿濆鏅查柛銉戝啫绠ｆ俊銈囧Х閸嬫盯顢栨径鎰瀬闁告劦鍠楅弲鎼佹煟閿濆懐鐏卞☉鎾崇Т閳规垿鎮╁畷鍥舵殹闂佺顑戠紞渚�寮诲☉銏犖ㄦい鏃囧吹閻╁酣姊哄Ч鍥у闁稿簺鍊濇俊鐢稿礋椤栨稒娅嗛柣鐘叉搐瀵爼鎮靛┑瀣拺閻犲洠锟借櫕鐏嶅銈冨妼閿曨亪骞冩导鎼晪闁跨喕妫勯悾鐤亹閹烘繃鏅╅梺缁樻尭鐎垫帒顭囧☉銏♀拻闁稿本鐟ㄩ崗宀勬煙閾忣偅宕岀�规洘鐓″濠氬Ψ椤旇姤娅堥梻浣告啞缁嬫帒顭囧▎鎺旂闂傚倷绀佸﹢閬嶅磿閵堝绠伴柛鎾楀啫袣闂佽法鍠曞Λ鍕煘閹达富鏁婇柡鍌樺�撶欢鐢告⒑閸涘鑰跨紒鐘崇墪閻ｇ兘濮�閵堝棛鍔堕悗骞垮劚濡鏁撻悾灞炬毈闁哄矉缍�椤︽煡鏌熺拠褏纾块柨鐔诲Г閼瑰墽绱炴繝鍌ゆ綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣搴ゆ缁辨挻绗熼崶褎鐏嶉梺鑽ゅ枂閸庣敻骞冩ィ鍐╁�婚柦妯侯槺椤撴椽姊洪幐搴㈩梿婵☆偄瀚伴弫鎾绘偩鐏炶棄骞嬮梺鍝勬湰缁嬫垿鍩為幋锕�骞㈡俊銈咃梗缁辨垿姊绘担鍛婃儓闁活偅鐟╁畷鍫曞Ω閵忊�愁伖闂備浇宕垫慨鍨娴犲绀夐悘鐐缎掗弸宥夋煙閹殿喖顣奸柣鎾寸懇閺屾盯骞嬪▎蹇ユ嫹閺嶎偓鎷峰鐐?").append(excuteTime).append("婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婎潊闁绘ê妯婂Λ宀勬⒑鏉炴壆顦﹂柨鏇ㄤ邯瀵鍨鹃幇浣告倯闁硅偐琛ラ敓钘夌－椤旀劙姊婚崒姘拷鎼佸磻閸℃稑鍨傞梺顒�绉存闂佸憡娲﹂崹浼村礃閿熶粙姊洪棃娴ゆ盯宕ㄩ姘瑩缂傚倸鍊搁崐椋庢閵堝绠�瑰嫭澹嬮弨浠嬫煟濡搫绾у璺哄閺岋綁骞樼�涙顦伴梺鍝勮嫰缁夊綊宕洪埄鍐╁闁告稑锕ラ宥夋⒒娴ｅ摜鏋冩俊顐㈠钘濋梺顒�绉甸崕澶嬨亜韫囨挾澧曠紒鐘虫皑閹茬顭ㄩ崼鐔蜂簵婵犻潧鍊搁幉锟犳偂濞戙垺鍊堕柣鎰絻閳锋梹绻涢崣澶嬪唉闁哄本鐩崺鈩冩媴閸撹弓绱旈柣搴ゎ潐濞叉﹢鏁冮姀鈥茬箚闁归棿绀佸敮闂佹寧鏌ㄨぐ鐐佃姳閻ｅ瞼纾介柛灞捐壘閿熻姤鎮傚畷鎰板箹娴ｅ摜锛欓梺鍛婄缚閸庢娊鎯岄幘缁樼厽闁靛繒濮甸崯鐐烘煕鐎ｎ亶鍎旈柡宀嬬到铻ｆ繛鍡樺劤濞堫參姊洪挊澶婃殶闁哥姵鐗犲濠氬即閻旇櫣顔曢梺缁樺姦閸撴岸鎮甸弴銏♀拺缂佸顑欓崕蹇斾繆椤愶絿绠炵�殿喛顕ч埥澶婎潩椤愶絽濯伴梻浣告啞閹稿棝鏁撻挊澹╋綁宕煎┑鎰瘜闂侀潧鐗嗛幊姗�鎮板鍫熺厵闁告垯鍊栫�氾拷");
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

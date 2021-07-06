
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetFightPet__ extends mkio.Protocol { }

/** 请求宠物参战
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetFightPet extends __CSetFightPet__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		Long battleId = xtable.Roleid2battleid.select(roleid);
		if (battleId == null) {
			PSetFightPetProc proc = new PSetFightPetProc(roleid, petkey, true);
			proc.submit();
		} else {
			// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦悡鏇㈡煙鐎电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樺殮閻熼偊鐓ラ柨鐔剁矙瀹曪繝骞庨挊澶庢憰濠电偞鍨崹鍦不婵犳碍鍊甸梻鍫熺♁閸熺偤鏌涢幒鎾垛槈妞ゎ亜鍟存俊鍫曞礃閵娧傜棯闂備焦瀵уú蹇涘垂瑜版帗鍋╅柣鎴犵摂閺佸啴鏌ㄩ弴顏呭缂備緤鎷烽悗锝庡枟閻撳繐鈹戦悩鑼婵＄虎鍣ｉ弻鈩冨緞鐎ｎ偄锟芥劖鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷顐﹀Ψ閿旀拝鎷烽灏栨斀闁宠棄妫楁禍婊堟倵濮樼厧澧查柣蹇擃儏閳规垶骞婇柛濠冩礋楠炲﹨绠涘☉妯硷紮闂佸壊鍋呭ú姗�鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐碉拷鐟版啞缁诲嫰鎯�椤忓牆绠氱憸宥夊箖閹达附鐓忛柛銉戝喚浼冮悗娈垮枟閹告娊骞冨▎鎾崇骇闁瑰鍎愭禒鈺呮⒒閸屾瑦绁版い鏇嗗嫷娈介煫鍥ㄦ礈娑撳秹鏌熼幑鎰靛殭闁藉啰鍠栭弻锝夊籍閸屾瀚涢梺杞扮閿曨亪寮婚敐澶樻晣鐟滃秵绂嶉挊澹濈懓顭ㄦ惔婵嬪仐闂侀潧妫旂粈浣界亽闂佺厧顫曢崐婵嗩瀶椤斿墽纾藉ù锝呭閸庡繘鏌ｈ箛鏃傜畼缂侇噯绲介埥澶婎潨閸℃ê鐦滈梻渚�娼ч悧鍡涘箠閹邦喚涓嶅ù鐓庣摠閻撴瑧锟界懓瀚伴崑濠囧磿韫囨柣浜滄い鎾跺仦閸犳锟芥鍣崳锝呯暦婵傚憡鍋勯柛娆忣槸椤忕儤绻濋悽闈涗哗闁规椿浜炲濠囧锤濡わ拷绾惧潡鏌曢崼婵愭Ц闁告艾缍婇弻銊╂偄閸撲胶鐓撳┑顔硷龚濞咃綁骞忛悩缁樺殤妞ゆ帒鍋嗛崬鍦磽閸屾瑦绁版い鏇嗗洦鍋嬮柛鈩冪♁閸嬧晠鏌ｉ幋鐘垫憘闁轰礁绉归弻锝夊箣濠靛浂妫￠梺鍝勬噺缁诲牆顫忓ú顏勭閹肩补鎳囬幏褰掓⒑缁嬪潡顎楃痪缁㈠幘閸掓帗绻濋崶銊︽珖闂佽法鍠嶇划娆撳春閻愬搫绠ｉ柣鎰皺閻ゅ洭姊绘担渚劸闁挎洏鍎辩叅闁绘棃顥撻弳锕傛煛婢跺﹦姘ㄦ俊鎻掔墦閺屾洝绠涢弴鐐愩儲銇勯弬鎸庮棡濞ｅ洤锕幃娆忣啅椤旂厧澹堥梺璇插缁嬪牓寮查悩鑼殾濞村吋娼欓獮銏＄箾閹寸偟鎳呴柛姗�浜跺娲传閸曨剙鍋嶉梺鍛婃煥閺堫剟寮查崼鏇熷亱闁割偅绋愮花濠氭⒑閹稿孩顥嗘い鏇嗗啠鏋嶇�广儱顦伴悡娑氾拷鐧告嫹閻庯綆鍓涜ⅲ缂傚倷鑳舵慨鐢告儎椤栫偟宓佹慨妤嬫嫹鐎规洘绮嶇粭鐔煎炊瑜庨弳顓㈡⒒閸屾艾锟藉嘲霉閸パ呮殾闁汇垻顭堥悿顕�鏌涜椤ㄥ懘鎮挎ィ鍐╃厽婵☆垳鍎ら埢鏇㈡煕閵堝棙绀冮柕鍥у楠炲洭宕滄担鐑樻缂傚倷鑳舵慨鎾�﹂悜钘夌畺鐟滅増甯掗悙濠勬喐瀹ュ洨妫憸搴ㄥΦ閸曨垰唯闁挎柨澧介悿鍕攽椤旂》鏀绘俊鐐舵铻為柛鎰╁妷濡插牊鎱ㄥ鍡楀⒒闁哄棭鍋呯换婵堝枈濡椿娼戦梺绋款儏閹虫﹢濡撮崘鈺冪瘈闁搞儯鍎婚幏閿嬬瑹閿熻棄顕ｉ锟藉畷濂告偄閸涘浠ч梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸顦╃紓浣虹帛缁诲倿顢氶妷鈺傜叆閻庯綆鍋嗛崙锟犳⒑鐠恒劌鏋欏┑顔哄�曠叅闁绘棁鍋愬畵浣糕攽閻樺弶鍣介柣銈忔嫹婵犵數鍋為崹鍫曗�﹂崶顒佹櫖婵炴垯鍨洪埛鎴︽偣閹帒濡奸柡瀣煥閳规垿顢欓悙顒佹瘓闂佽鍣换婵囦繆閻戣棄鐓涢柛灞剧矊楠炴劙姊绘担瑙勫仩闁稿寒鍣ｅ鎻掆槈濞嗘埈娴勫┑鐘诧工閻楀﹪鎮￠妷鈺傜厽闁哄啫娴傞崵娆戞偖濮樿埖鈷戦悹鍥ｏ拷铏亪闂佺锕ラ幃鍌炲箖妤ｅ啯鍋い鏍煎Ч妤呮⒑閸︻厼鍔嬮柛銊ョ秺閺佸秴顭ㄩ崘锝嗘杸闂佺粯鍔栧娆撴倶閿曞倹鐓熸俊銈勭劍閳锋帡鏌ゆウ鍧楀摵缂佺粯绻傞～婵嬵敇濞戞瑥顏归梻鍌欑窔濞艰崵锟介潧鐭傚畷銏＄附缁嬭法顦柣搴秵閸犳鎮￠弴銏＄厪濠电倯鍐仾婵絽鐗嗛—鍐Χ閸愩劎浠惧┑鈽嗗亜閸熸潙鐣峰ú顏呮櫢闁绘灏欓敍婊冣攽閻愬弶顥為柛銊ョ秺閹箖鎮欓璺ㄧ畾闂佺粯鍔︽禍婊堟晸閼恒儳澧电�规洘绻嗛ˇ瀵哥磼鏉堛劍灏扮�垫澘瀚伴獮鍥敆閸屻倕鎮堥梻鍌欒兌缁垶宕濆Δ鍛拷鍌涚鐎ｎ亞鍝楅梺鎯ф禋閸嬪棛寮ч敓浠嬫⒑濮瑰洤鐏叉繛浣冲啰鎽ュ┑鐘垫暩閸嬫盯鎯囨导鏉戠９闁哄洨浼濆ú顏勯敜婵°倓璁查幏缁樼箾鏉堝墽鍒伴柟璇х節瀹曨垶鎮欑仦鍌︽嫹閹烘埈娼╂い鎾楀嫮鏉归柣搴ゎ潐濞插繘宕规禒瀣濠电姴鍟欢鐐烘煕閳╁喚鐒藉ù婊勭墵濮婃椽鎳￠妶鍛瀰缂傚倸鍊瑰畝鍛婁繆閹绢喗鏅稿ù鐘差儐閻撴盯鏌ㄩ悢璇残撶紒鍌涘笧閿熸枻缍嗛崑鍡涘储娴犲鈷戠憸鐗堝笒娴滀即鏌涢幘鏉戝摵闁糕斂鍨藉鎾偄閸撲胶鐣鹃梻浣告贡缁垳鏁悙鍝勬槬闁挎繂顦伴悡娑㈡倶閻愭彃鈷旀繛鍙夋綑閳规垿鍩勯崘鈺侊拷鎰攽閳ュ磭鍩ｇ�规洖鐖奸崺锟犲礃閵娿儳鐣鹃梻鍌欐祰椤曆咃拷娑掓櫊椤㈡瑩寮介鐐电崶闂佸搫绋侀崢鎼佹晸閺傘倗鐣甸柟顔界矒閹稿﹥寰勭�ｎ倣姘舵⒒娴ｅ憡鍟炴繛璇х畵瀹曞綊骞嶉鍓х劶闂佸憡鍔﹂崰妤呮偂韫囨挴鏀介柣鎰灥閸燁垶宕抽悾宀嬫嫹鐟欏嫭灏紒鑸佃壘椤繒绱掑Ο璇差�撶紓浣圭☉椤戝懎鈻撻鐘电＝濞达綀娅ｇ敮娑㈡偨椤栨鎷峰畷鍥ㄦ闂佺鎻梽鍕磻閹扮増鐓ｉ煫鍥风到娴滄粎锟芥鍠栧鈥愁潖濞差亝顥堟繛鎴炶壘椤ｅ搫顪冮妶蹇曠窗闁告鍟块悾鐑藉箛閻楀牜妫冨┑鐐村灦鐢寮敓浠嬫⒒娴ｈ櫣甯涢柨姘辩棯缂併垹寮柕鍡楀�垮濠氬Ψ閿旀儳甯楅梻鍌欑閻忔繈顢栭崨瀛樺�堕柟缁㈠枟閻撴瑦銇勯弮鍥т汗缂佸娅ｉ敓鍊燁潐濞叉牠鎮ユ總绋挎瀬闁归偊鍨抽悿锟介梺鍝勫�归娆愬閹剧粯鈷掑ù锝囨嚀閸斻倖绻涚�涙ê鍝虹�规洘鍨垮畷鍗炍熺喊杈ㄩ敜闂備浇鍋愰…鍫ュ触閿熺晫绱掔拠鍙夘棦闁哄矉缍侀獮鍥礂閸濄儳娉块梻浣芥硶閸犳洘鎱ㄩ妶澶婂瀭闁割煈鍠氶弳锔界節闂堟稒顥犻柡鍡楁閺屾盯寮撮妸銉ヮ潽濠电偛鎳庡ú銈夆�旈崘顔嘉ч柛娑卞灣椤斿洭姊虹紒姗嗘當缂佺粯鍔欓幃楣冨垂椤愩倗鎳濋梺璺ㄥ枍缁瑥顕ｇ拠娴嬫闁靛繒濮烽悿锟介梻渚�娼ч…顓㈡⒔閸曨垱鍋熼柡宓本瀵岄梺闈涚墕閸婄懓鈻嶉崶顒佺厱闊洦妫戦懓鎸庮殽閻愭彃鏆欓摶鏍煕濞戝崬鏋熸繛鍛矒閺岀喖鎳栭埡鍕婂鏌ㄩ悢鍑ゆ嫹閻旈姣㈤梺鐑╂櫅妤犳悂鍩為幋锔藉�烽柤纰卞墯閹茶偐绱撴笟鍥ф灈缂佸鐖煎畷姘跺箳濡わ拷缁犲鏌熸０浣哄妽缂傚秴楠搁埞鎴︽倷閸欏鏋欐繛瀛樼矋缁矂顢欒箛鎾斀闁糕�崇箲閺傦拷闂備胶绮摫鐟滄澘鍟撮、鏃堝Χ閸℃洜绠氶梺鍦帛鐢偞鏅堕敂鑺ュ弿濠电姴鍟妵婵囶殽閻愭潙濮堥柟顖涙婵拷妞ゎ偒鍠氶崰姗�姊婚崒娆掑厡妞ゎ厼鐗嗛湁闁绘垼妫勯弸浣糕攽閻樿櫕鐨戠�规挷绶氶弻娑㈠箛闂堟稒鐏嶉梺绋款儍閸旀垿寮诲☉妯锋婵鐗婇弫鎯р攽閻愬弶鍣烽柛銊ㄦ椤繘鎼圭憴鍕／闂侀潧顭堥崕鏌ユ偟閵忋倖鈷戦柣鐔告緲濞堚晠鏌熼崙銈嗗
			mkdb.Procedure proc = new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					final xbean.BattleInfo battle = xtable.Battle.get(battleId);
					if (battle != null) {
						Integer index = battle.getRoleids().get(roleid);
						if (index != null) {
							xbean.Fighter fighter = battle.getFighters().get(index);
							if (fighter != null) {
								fighter.setInipetkey(petkey);
								fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 180031);
							}
						}
					}
					return true;
				}
			};
			proc.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788440;

	public int getType() {
		return 788440;
	}

	public int petkey; // 请求参战的宠物

	public CSetFightPet() {
	}

	public CSetFightPet(int _petkey_) {
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetFightPet) {
			CSetFightPet _o_ = (CSetFightPet)_o1_;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetFightPet _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


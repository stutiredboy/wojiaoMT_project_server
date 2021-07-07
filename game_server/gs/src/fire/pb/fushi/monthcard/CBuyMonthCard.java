
package fire.pb.fushi.monthcard;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CBuyMonthCard__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻鈥崇暆鐎ｎ剛袦婵犳鍣幏鐑芥⒑闂堟稓绠氶柡鍛箞瀹曟繈宕妷褏锛濇繛鎾磋壘閿曘儳锟芥俺顫夌换婵嬪閿濆懐鍘梺鍛婃⒐閻楃娀骞冮敓鐘参ㄩ柍鍝勫�婚崢鎼佹⒑閹肩偛鍔楅柡鍛♁缁傛帒顭ㄩ崼鐔哄弳闂佺粯妫侀褑顣块梻浣筋嚃閸犳牠宕愰幖浣瑰仼闁绘垼妫勭粻铏繆閵堝繑瀚归柟顖滃枛濮婃椽骞愭惔銏㈠弳婵犫拃鍌滅煓妞ゃ垺鐟╁鎾閳ョ鎷烽悽鍛婄厽闁绘柨鎲＄欢鍙夈亜閵夈儳绠婚柡灞剧洴閹晠鎼归銈庢Ф闂備礁鍚嬪鑺ョ閸洖绠犻柨鐔哄Т鍥撮梺鎼炲劗閺咁亞妲愰弻銉︹拻濞达綀娅ｇ敮娑㈡煟閻旈棿鎲炬鐐茬箻閹粓鎳為妷褍骞堥梻渚�娼ч…鍫ュ礉瀹ュ洦鍏滈柣鎰靛厵娴滄粍銇勯幇鈺佺伄缂佺姳鍗抽幃锟犲Χ閸℃劒绨婚棅顐㈡处閹哥偓鐗庨梻浣告惈閹冲矂宕归挊澶樻綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇庣窔濮婃椽宕崟顒�顎涢梺绋款儏濡繂鐣峰璺虹婵°倧鎷风紒顐㈢Ч閺屾稑鐣濈�ｎ喗顎嶉柣搴㈣壘缂嶅﹪寮婚敐澶婎潊闁绘ê鍟块弳鍫熺箾鐎涙ê娈犻柛濠冪箞瀵鎮㈡搴㈡疂闂佸搫顦扮�笛傜昂濠碉紕鍋戦崐銈夊磻閸涱垱宕查柛顐犲劘閿熸垝绀佽灃濞达絽鎽滅粣鐐烘煟鎼搭垱锟姐儵宕熼銊﹀濞寸厧鐡ㄩ埛鎺楁煕鐏炲墽鎳呮い锔肩畵閺岀喓鍠婇崡鐐板枈閻庢鍠氶弫濠氥�佸Δ鍛妞ゆ帪鎷烽柛鎿冨枛椤啴濡堕崱娆忊拡闂佺顑嗛崹鍧楀极閹捐绠ｉ柟鐑樻⒒閻涖垽鎮楀▓鍨灍闁规瓕娅曢幈銊╂晸娴犲鐓冮柍杞扮閺嗙偤鏌ｅ┑鍥р枙婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎垫帡宕抽敐鍜佸殨闁圭粯宸婚弨浠嬫倵閿濆簼绨奸弶鍫濈墦濮婃椽妫冨☉姘暫濠碘槅鍋呭濠氬箲閵忋倕骞㈡繛鎴炵懅閸橆亪姊洪崜鎻掍簼缂佽鍟撮獮鏍箛閺夎法鏌堥梺褰掓？閻掞箓鍩涢幋鐘电＜閻庯綆浜炴禒銏°亜閹哄鐏查柡灞剧洴婵℃悂濡烽敃锟芥禒鎾⒑缂佹ü绶遍柛鐘崇〒缁鈽夊Ο閿嬵潔濠电偛妫欓崝鏍敂閻斿吋鈷掑ù锝堝Г绾爼鏌涢敐蹇曠暤妤犵偛绻橀弫鎾绘晸閿燂拷 by changhao
 */
public class CBuyMonthCard extends __CBuyMonthCard__ {
	@Override
	protected void process() {
		// protocol handle
		
 		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
		{
			return;
		}
		
		mkdb.Procedure buymonthcard = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				if (fire.pb.fushi.Module.GetPayServiceType() == 0) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ剙浠遍柟顔ㄥ洦鍋愭慨鐟版祫閹烽攱绗熼敓钘夘嚕閹绢喖顫呴柍鈺佸暞閻濇牠姊绘担鑺ョ《闁哥姵鎹囧鏌ヮ敃閵堝懎鐏婃繝鐢靛У閸戝綊寮澶嬬厽闁归偊鍘界紞鎴︽煥閻旂儤娅曢柡浣割煼瀵濡搁妷銏℃杸闂佺硶鍓濇笟妤呮晸閼恒儺娈滈柡宀嬬磿閿熸枻缍嗛崑鍡椕虹�涙ɑ鍙忓┑鐘插亞閻撹偐锟借娲樼敮鈩冧繆閸洖宸濇い鏍ㄧ懄椤㈡﹢姊婚崒娆戭槮闁圭⒈鍋嗛幃顕�顢曢敃锟界粈澶愭煙鏉堝墽鐣辩紒鐘崇墵閺屾洟宕煎┑鎰︾紒鐐劤閸氬鎹㈠☉銏犵闁绘垵娲ｇ欢鍨箾鐎垫悶锟藉骞忛敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊閻樺樊妫岄梺杞扮閿曨亪寮婚垾鎰佸悑閹肩补锟藉磭顔愮紓鍌欑劍閸旀牠銆冮崱妯尖攳濠电姴娲ゅ洿闂佸憡渚楅崰鏍р枍閵堝鈷戦柛婵嗗閸ｈ櫣绱掔拠鑼ⅵ鐎殿喛顕ч鍏煎緞婵犱胶鐐婇梻浣告啞濞诧箓宕滃▎蹇婃瀺闁挎繂顦伴埛鎴犵磼鐎ｎ厼鍔垫い顐畵閺屾盯寮敓浠嬪垂閸噮鍤曞┑鐘崇閺呮彃顭跨捄渚剱婵炲懏绮撳娲川婵犱胶绻侀梺鎼炲姀濞呮洜锟介潧銈稿畷鍫曞Ω瑜忛鏇㈡⒑閻熼偊鍤熼柛瀣仧娴滄悂顢橀悩鐢碉紲婵犮垼娉涢張顒勫汲閳哄懏鐓欐鐐茬仢閻忊晠鏌嶉挊澶樻█濠殿噯鎷烽梺缁樕戦鏍触閸涱喚绡�闁汇垽娼ф禒婊勪繆椤愶綆娈橀柟骞垮灲楠炴帡骞樻０婵囩カ濠德板�х徊浠嬪疮椤栫偛鐓曢柟瀵稿Х绾捐棄霉閿濆牆浜楅柟瀵稿С閻掑﹤霉閻撳海鎽犻柣鎾跺枛閺岋綁寮崹顔鹃獓濠电偛鎳庨幊蹇涘Φ閸曨垼鏁冮柕蹇嬪灮椤斿绱撴担铏瑰笡缂佽鍊块敐鐐测攽鐎ｅ灚鏅㈤梺鍛婃处閸嬪懘寮抽鍫熲拻闁稿本鐟ㄩ崗宀�绱掗鍛仩妞ゎ偄绻掗幉鎾礋椤撗勯敜濠电偛顕慨鎾敄閸℃稑鐤鹃柟闂寸劍閻撶娀鏌熼鐔风瑨闁告梹纰嶇换娑㈠箹椤撶偞鐏撻梺璺ㄥ枎閿熺晫鍣ュ鎰箾鐠囇呯暤鐎规洖缍婂畷濂稿即閻樿尙銈﹂梻浣告惈缁夋煡宕濆鍡楀灁闁圭虎鍠楅悡鏇㈢叓閸ャ劍鎯勬俊鎻掔秺閹顫濋崘韫睏缂備浇椴搁幑鍥х暦閹烘垟鏋庨柟鎼幗琚﹀┑锛勫亼閸婃牠宕归悽鍛婂亱闁糕剝绋戦悡婵嬫煛閸愩劎澧曢柛妤佸▕閺岋絽螣閸濆嫭鍊庣紓浣诡殔椤﹂潧顫忓ú顏勫窛濠电姴瀚崳褍顪冮妶蹇撶槣闁告鏅划瀣吋閸滀胶鍙嗛梺鍛婃磵閺呮瑧鑺辨繝姘拺閻熸瑥瀚粈鍐╃箾婢跺鈾佺紒鍌涘浮閺佸啴宕掑☉姘箞闂備胶绮摫闁搞劍宀搁獮瀣晜閻氬瓨瀚归柛鎰靛枛鍞梺鍐叉惈閸婃悂鏁撻悾灞藉幋闁哄被鍊楅崰濠囧础閻愬樊娼炬俊鐐�栧褰掑垂閸噮娼栨繛宸簼椤ュ牊绻涢幋鐐垫噧妞わ腹鏅犲娲川婵犲啠鎷归梺鑽ゅ暱閺呯娀骞冩导鎼晪闁跨喍绮欓悰顕�骞掑Δ锟界粻锝夋煛閸愭寧瀚归梺鍝勫亰閹风兘姊婚崒娆戝妽闁诡喖鐖煎畷鏇㈩敍閻愯尙顦悗骞垮劚椤︿即宕戦悢鍝ョ瘈闂傚牊绋掗ˉ鎴︽煛閿熻姤绂掔�ｎ偆鍘藉┑鈽嗗灥濞咃絾绂掑☉銏＄厸闁糕�崇箲濞呭懘鏌嶇憴鍕伌闁诡喗绮撳畷鍫曞Ω閵夘喕绱﹀┑鐘垫暩婵兘寮幖浣哥；婵鎷风�规洜濞�閹晝鎷犻懠顒夋Н闂備胶绮…鍫濃枍閺囥垹桅婵犻潧妫岄弨浠嬫⒔閸ヮ剙鏄ラ柡宓苯娈梺鍛婃处閸婄娀鎮㈤搹鍦紲濠碘槅鍨靛畷浣冦亹閸℃せ鏀介柣妯虹仛閺嗏晠鏌涚�ｎ偆娲存い銏″哺椤㈡﹢濮�閻樻彃浜堕柣鐔哥矋濡啴鐛崘顭嬫椽顢旈崟搴樻櫊閺屽秵娼幏灞藉帯闂佸憡锕㈡禍璺侯潖閾忚鍏滈柛娑卞枛濞懷囨⒒閸屾艾顏╅悗姘嵆楠炲啴鏁撻悩鎻掑祮闂佺粯妫佸▍锝夋儊閸儲鈷掗柛灞炬皑婢ф稓绱掔�ｎ偄娴挊鐔哥節婵犲倸顏ュù婊勭矒閻擃偊宕舵搴″煂婵炲瓨绮嶇划宥夊Φ閸曨垼鏁囬柍銉ュ暱婵嘲顪冮妶蹇曠暢婵炲懏娲滈幑銏犫槈閵忊�虫濡炪倖甯幏鐑芥煛鐎ｎ偆銆掗柨鐔诲Г椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐎梺鍦濠㈡ê顔忓┑瀣厱閻忕偛澧介埦浣广亜閵夈儳澧﹂柡灞稿墲閹峰懐鎲撮崟顐わ紦闂備礁婀遍…鍫ユ晝閵壯呭崥闁绘梻鍘ч悡娑㈡煕鐏炴儳顥氭俊鎻掔墦閺屟呯磼濡厧鈷岄梺鍝勬湰缁嬫垿鍩ユ径鎰闁绘劕顕禍顏勨攽閻愬樊鍤熷┑顔芥尦婵″墎绮欏▎鐐稁闂佹儳绻愬﹢杈╁閸忛棿绻嗘い鏍ㄧ箖椤忕姴霉閻撳孩澶勭紒缁樼箓閳绘捇宕归鐣屼簴闂備胶顭堥敃銉ф崲閸岀儐鏁嬮柨婵嗩槸閽冪喖鏌曟径鍫濆姢妞ゆ梹鍔栫换娑欐綇閸撗冨煂濠电媴鎷烽梺顒�绉撮惌妤呮煕閳╁啰鈾侀柍閿嬪灩缁辨挻鎷呴懖鈩冨灩缁牓鏁撴禒瀣拺缂佸灏呭銉︾節閿熶粙鏌嗗鍡樻闂佸吋浜介崕鎶藉疮閺屻儲鐓欓柛鎴欏�栫�氾拷  by changhao
				{
					boolean ok = fire.pb.fushi.MonthCardManager.getInstance().CheckMonthCardLimit(roleid);
					if (ok)
					{
						fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 190067, null);					
					}
					else
					{
						xbean.Properties prop = xtable.Properties.select(roleid);
						if (prop != null)
						{
							fire.pb.fushi.MonthCardManager.getInstance().ProcessMonthCard(prop.getUserid(), roleid);						
						}
					}					
				}
							
				return true;
			}
		};
		buymonthcard.submit();		
		
		
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812687;

	public int getType() {
		return 812687;
	}


	public CBuyMonthCard() {
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
		if (_o1_ instanceof CBuyMonthCard) {
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

	public int compareTo(CBuyMonthCard _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


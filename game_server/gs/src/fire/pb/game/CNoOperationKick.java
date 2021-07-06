
package fire.pb.game;

import fire.log.LogManager;
import fire.pb.SReturnLogin;
import fire.pb.fushi.DayPayManager;
import fire.pb.fushi.Module;
import mkdb.Procedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CNoOperationKick__ extends mkio.Protocol { }

/** 踢掉长时间不操作的玩家
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CNoOperationKick extends __CNoOperationKick__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		new mkdb.Procedure() {

			@Override
			protected boolean process() throws Exception {
				
				xbean.Properties prop = xtable.Properties.select(roleId);
//				if (prop.getLevel() > 20) {
//					return false;
//				}
				
				boolean ok = false;
				if (Module.GetPayServiceType() == 1 ? true : false) {
					ok = DayPayManager.getInstance().CheckDayPay(roleId, DayPayManager.adddaypatime);
				} else {
					xbean.YbNums ybNums = xtable.Fushinum.select(prop.getUserid());
					int norpresentNum = 0;
					if (ybNums != null) {
						xbean.YbNum ybNum = ybNums.getRoleyb().get(roleId);
						if (ybNum != null) 
							norpresentNum = ybNum.getNopresentnum();
					}
					ok = norpresentNum == 0 ? false : true;
				}
				if (!ok) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽缂佺偓鍎抽鎰板船瑜版帗鈷戦悹鎭掑妼閺嬫垿鏌＄�ｎ厼鍚圭紒顔碱煼楠炴ê效閸ラ攱瀚瑰ù锝堝�介弮锟介幏鍛存偡闁讣鎷烽幘瀵哥闁圭偓娼欓崵顒勬煕閵娾晙鎲鹃柡灞诲姂婵″爼宕卞▎鎴犳闁诲骸鍚�閸楁娊寮ㄩ崡鐑嗙唵婵鎷烽柡浣规崌閹崇偤濡烽敂缁㈡Ч婵°倗濮烽崑娑㈡晝閵夆晛绠氶柡鍐ㄧ墕鎯熼梺闈涱槶閸庢娊鏁撶粵瀣籍婵﹨娅ｇ划娆戞崉閵娧傜礃闂備胶顭堥鍥磻閵堝绠栭柨鐔哄У閺呮彃顭跨捄楦垮鐟滄澘瀚板娲箹閻愭彃濮岄梺鍛婃煥閻倸鐣烽悽鍓叉晢濞达綀娅ｉ鏇㈡⒑缁嬭法绠抽柛妯犲嫭鍙忕�广儱顦伴悡娑氾拷鐧告嫹閻庯綆鍓涢惁鍫ユ倵鐟欏嫭绀�鐎规洦鍓濋悘鎺楁⒑閸忚偐銈撮柡鍛箞瀹曘垹顭ㄩ崼鐔叉嫽婵炶揪绲介幉锟犲箚閸儲鍋犳慨妯煎帶娴滄壆锟借娲樼换鍫ョ嵁鐎ｎ喗鏅濋柨鐔烘櫕缁寮介鐔哄帾闂佸壊鍋呯换宥呂ｉ崫銉ф／闁诡垎鍐╁�紓浣虹帛閻╊垶鐛�ｎ喗鍊婚柛銉鏉╂柨鈹戦悙宸殶闁靛棗顑夐獮蹇涙晸閿燂拷
					Procedure.psend(roleId, new SReturnLogin());
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞楅梻渚�娼х换鍫ュ春閸曨垱鍊块柛鎾楀懐锛滈梺褰掑亰閸欏骸鈻撳鍫熺厸鐎癸拷閿熶粙宕伴弽顓犲祦鐎广儱顦介弫濠勭棯閹峰矂鍝烘慨锝咁樀濮婄粯鎷呮笟顖滃姼濡炪倖鍨堕崹褰掑箲閵忕姭鏀介悗锝庝海閹芥洟姊洪棃娴ュ牓寮插☉姘卞暗鐎广儱顦伴悡鏇㈡倶閻愭彃鈷旈柣鎿冨灠椤法鎲撮崟顒傤槹濠殿喖锕ュ钘夌暦椤愶箑绀嬫い鎺戭槹閿涗胶绱撻崒娆戣窗闁哥姵顨婇獮鎴﹀炊瑜滈崵鏇炩攽閻樺磭顣查柡鍛絻椤法鎹勯悮瀛樻暰濡炪們鍎茬换鍫濐潖濞差亜鎹舵い鎾楀懎濮奸梺璇插缁嬪牓寮查悩鑼殾濞村吋娼欑粻娑㈡煟濡わ拷閻楀啴骞忛搹鍦＝闁稿本鐟ч崝宥嗐亜椤撶偞宸濈紒顔款嚙椤繈顢橀悩娈垮晭濠电姰鍨煎▔娑㈩敄閸ヮ灐娲箻椤旂晫鍘遍梺鍐叉惈閸燁偅绂掓潏顭戞闁绘劕妯婇崕鏃堟煛娴ｇ鏆ｉ柡浣规尰缁傛帞锟斤綆鍋勯敓鑺ュ缁绘稑顔忛鑽ゅ嚬闂佺粯鎸诲ú鐔煎蓟閻旂厧绠ラ柧蹇ｅ亝閻濇梹绻濈喊姗堟嫹閼碱剛鐓撻梺鍝勭焿缁绘繂鐣烽崡鐐嶇喎顭ㄩ崟顐ら榾=").append(roleId).append(", 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鎮㈤崗灏栨嫽闁诲酣娼ф竟濠偽ｉ鍓х＜闁绘劦鍓欑粈鍐┿亜閺囧棗娲ら悡姗�鏌熸潏楣冩闁稿鍔欓弻娑樷枎韫囷絾效闂佽鍠楅悷褏妲愰幘瀛樺闁告繂瀚烽敓钘夌焸閺屾盯濡搁妷褍鐓熼悗娈垮枛椤兘寮幇顓炵窞濠电姴瀚烽崥鍛存⒒娴ｇ懓顕滅紒璇插�块獮澶娾槈閵忕姷顔掔紓鍌欑劍椤洭宕㈡禒瀣拺閻熸瑥瀚崝銈嗐亜閺囥劌寮鐐诧躬瀹曘劑顢涘鍜冪床闂佸搫顦悧鍕礉瀹�锟界划顓☆樄闁哄被鍔戦幃銏ゅ川婵犲嫪绱曠紓鍌氬�哥粔鏉懳涘▎鎴犵焿鐎广儱顦伴崐鐑芥倵闂堟稑顥忔繛鏉戝濮婃椽妫冨☉姘崇箲婵☆偊顣﹂懗鍫曟儎鎼淬劍鈷掑ù锝囧劋閸わ拷闂佸湱鈷堥崑濠囥�侀弽顓炲窛閻庢稒锚閿熷�熷煐閵囧嫯绠涢幘璺侯杸闂佺粯鎸哥换姗�寮诲☉銏犖ㄩ柟瀛樼箓閺嬨倕霉閻撳骸锟藉灝顫忛搹鍦＜婵☆垵宕甸崣鍕磽娴ｈ棄鐓愮�癸拷缁嬫鍤曢悹鍥ㄧゴ濡插牓鏌曡箛鏇烆潔闁靛ň鏅滈悡銉︾節闂堟稒顥為柛锝呯秺瀹曨剟顢涢悙绮规嫽婵炶揪绲块崕銈夊吹閿熶粙姊洪幖鐐茬仾闁绘搫绻濋崹楣冩晝閿熶粙鎮鹃敓鐘崇劷闁挎梻鏅粙渚�姊绘担鐟板姢缂佺粯鍔曢敃銏ゆ焼瀹ュ棗鍓瑰┑鐐叉閹稿鎮″▎鎴犵＜閻庯綆浜炴禒銏°亜閹哄鐏查柡宀�鍠栭幃鍧楊敍濞嗗繑鍎撶紓鍌欐祰妞存悂骞愰懡銈囩當闁绘梻鍘ч悙濠勬喐鎼淬劍鍊堕柛顐ｇ妇閺�浠嬫煟閹邦剛鎽犵紓宥嗗灴閺屾盯濮�閿涘嫬寮ㄥ銈冨灪瀹�鎼佸极閹版澘閱囨い鎰剁岛閺嬪矂姊婚崒娆愮グ婵℃ぜ鍔戦幃鐐烘晝閸屾氨顔夐梺鎼炲労閸撴瑧绮婚弽顓熺厵妞ゆ牕妫楅幊蹇撯枔閺囥垺鈷戦悹鎭掑妼閺嬫棃鏌￠崪浣镐簼缂佹梻鍠栧鎾閳ュ磭妾┑鐘灱椤鎹㈤崒婊呯濠电姴娲ら弸渚�鏌熼悧鍫熺凡闂佸崬娲﹂妵鍕箛閳轰胶浠鹃梺浼欑悼婢ф鎹㈠┑瀣仺闂傚牊绋愮划鍫曟⒑缂佹﹩娈旈柨鏇樺�濋敐鐐剁疀濮樸儰姹楅梺鍦劋閸わ箓鏁冮崒娑氬幈闂佸搫娲㈤崝宀勬倶閿熺姵鐓涢柛娑卞枤閻帡鏌″畝瀣М妤犵偛娲Λ鍐ㄢ槈濮楀棙娴囧┑鐘愁問閸ｎ垳寰婃禒瀣亱闁圭偓鍓氬鏍煣韫囨挻璐＄痪鎯у悑娣囧﹪顢涘顓＄缂備浇顔婄欢姘潖濞差亜浼犻柕澶堝剾閿濆鐓熸俊銈呭暙閳诲牏锟借娲樺鑺ユ叏閿熶粙鏌嶉埡浣告殭闁告柨鎳樺娲濞戞艾顣哄┑鐐茬湴閸旀垵顕ｉ崼鏇炵濞达絽鍘滈幏娲⒑閸︻収鐒炬繛鎾棑缁骞樼紒妯煎幍闂佸憡鍔樼亸娆戠不閼姐倧鎷风憴鍕闁告梹鐟╅妴浣糕槈閵忊�筹拷椋庣磼椤旀娼愰悗姘虫閳规垿鎮欓懜闈涙锭缂備浇寮撶划娆撶嵁婢舵劖鏅搁柣妯垮皺閺屽牓姊虹紒妯哄妞ゆ洦鍘剧划缁樸偅閸愨晛浠梺鎼炲劚濞层倝骞婇幇鏉挎辈闁靛牆顦伴崐鐢告偡濞嗗繐顏痪鐐倐閺屾盯濡搁敂濮愪虎婵犵锟藉磭鍩ｉ柡浣瑰姈瀵板嫭绻濋崟鍨為梻鍌欑窔濞佳嗗櫣闂佸憡鍔戦崝搴敊婵犲洦鈷掗柛灞捐壘閿熶粙顥撶划鍫熺瑹閿熶粙鐛弽顓ф晝闁抽攱纰嶅鑺ユ叏閿熶粙鏌曢崼婵囧櫣闁诲寒鍘奸埞鎴︽倷閸欏鏋欐繛瀛樼矋缁捇骞冮敓鐘插嵆闁靛骏绱曢崢鐢告⒑缂佹ê鐏﹂柨姘舵煟韫囨挾效闁哄矉绻濋弫鎾绘嚍閵壯屾祫闁诲函缍嗛崑鍡涘储閽樺鏀介柍钘夋閻忕娀鏌ｈ箛鏃傜疄闁诡垰鍟叅妞ゅ繐鎳愰崢閬嶆⒑閻熸壆鎽犵紒璇插暟閹峰綊鏁嶉崟顓狅紲闁哄鐗勯崝灞矫归灏栨斀闁斥晛鍟伴幗鍐┿亜閿旇棄鈻曢柡宀嬬節瀹曢亶鍩℃担绯曟嫬闂備礁鎼惌澶屾閺囩喓顩烽柨鏇炲�哥粈鍫㈡喐鎼淬劌绀嗘繛鎴炵懅缁★拷缂佸墽澧楅敋濠⒀勭叀閺岀喖顢欓悡搴嫹鐟欏嫮鈹嶅┑鐘叉搐缁犵懓霉閿濆牜娼愭繛鍛閺岋綁鎮╂潏鈺婃М闂佸摜鍠庡锟犵嵁濡ゅ喛鎷烽敐搴℃灍闁抽攱甯￠弻娑氫沪閸撗勫櫗缂備椒鑳舵晶妤佺┍婵犲偆娓婚柣鎾抽椤鈹戦悙鍙夘棑闁搞劋绮欏顐﹀箻缂佹ê浜归梺鍝勮閸庢煡鏁嶅Δ鍛拻濞达絿鎳撻婊呯磼鐠囨彃锟借儻妫熷銈嗙墱閸嬫盯宕欓悩灞傦拷鎺戭潩閻愵剙顏堕梻浣告惈閻ジ宕伴弽顓犲祦闁糕剝鍑瑰銊╂⒑閹肩偛锟芥宕伴幇鏉课﹂柛鏇ㄥ灠閻撴盯鏌涢幇鈺佸妤犵偛顑夊铏规嫚閳ヨ櫕鐏嶅銈冨妼閿曨亜顕ｉ锕�绠涙い鎾跺枎閸斿懘姊洪悙钘夊姤閻忓繑鐟╁顐﹀冀椤撶啿鎷绘繛杈剧到閹诧繝宕悙鐑樼厽闁绘梹娼欓崝姘舵懚閻愬绡�闂傚牊绋掗敍宥嗙箾閸忚偐澧甸柡灞熷棛鐤�婵ê鍚嬬紞鍫ユ倵鐟欏嫭绀�妞わ妇鏁诲濠氬即閻旇櫣顔曢梺鍓茬厛閸犳牗鎱ㄩ弴銏♀拺缂備焦顭囩紓姘舵煕閵娿劍顥夋い顐㈢箰鐓ゆい蹇撴噹娴狀參姊洪崫鍕垫Ч閻庣瑳鍥舵晩闁跨喍绮欏缁樻媴閻戞ê娈岄梺鎼炲�栭悧鐘荤嵁韫囨稒鏅搁柨鐕傛嫹?");
					LogManager.logger.error(sbd.toString());
				}
				return true;
			}
		
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810375;

	public int getType() {
		return 810375;
	}


	public CNoOperationKick() {
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
		if (_o1_ instanceof CNoOperationKick) {
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

	public int compareTo(CNoOperationKick _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


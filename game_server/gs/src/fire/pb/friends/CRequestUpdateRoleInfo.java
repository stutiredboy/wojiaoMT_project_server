
package fire.pb.friends;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestUpdateRoleInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRequestUpdateRoleInfo extends __CRequestUpdateRoleInfo__ {
	@Override
	protected void process() {
		final long currentRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (currentRoleId < 0)
			return;

		mkdb.Procedure proc = new mkdb.Procedure() {
			@Override
			public boolean process() {

				if (xtable.Properties.selectRolename(roleid) == null) {
					// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀劼烽敓浠嬫⒒娴ｄ警鐒炬い鎴炲灩閹广垹鈹戠�ｎ亣鎽曢悗骞垮劚椤︻垱瀵奸悩缁樼厱闁哄洢鍔屾晶顔界箾閸滃啰绉慨濠傤煼瀹曟帒顫濋璺ㄦ晼闂備焦鎮堕崝瀣础閹惰棄鐏抽柡鍐ㄧ墕缁�鍐┿亜韫囨挸顒㈤悗姘秺閺屻劌鈹戦崱娆忓毈缂備降鍔岄…鐑藉蓟濞戙垹围濠㈣泛顦伴崰姘舵⒑閸濆嫮鐏遍柛鐘查叄閹箖鏁撻悩鑼獓闂佸湱顭堝鈺呭煛閸涱喒鎷洪柣搴℃贡婵敻藟婢跺浜滈柨鏃囶嚙閻忥箓鏌涢埞鍨仼妞ゆ挸鍚嬪鍕熺紒妯荤彎闂佽崵鍠愮划宀勬儔婵傚憡鍤嶉弶鍫涘妿缁★拷濠殿喗锕╅崢楣冨矗閸℃稒鈷戦柛婵嗗婢跺嫰鏌ㄥ鑸电厽闊洦鎸哥痪褔鏌曢崶褍顏┑顕嗘嫹闂佹枼鏅涢崰姘涢崘顔藉�甸悷娆忓缁�锟介梺闈涚墛閹倿鐛崘顔碱潊闁绘ê鐏氬▓婵嬫⒑閸濆嫷妲规い鎴炵懃铻為柛鏇ㄥ灡閳锋帡鏌涚仦鎹愬闁跨喍绮欓ˉ鎾跺垝閸喓鐟归柨鐔剁矙閻涱喗寰勯幇顒備紜闁烩剝甯婇悞锕�顪冩禒瀣瀬闁告劦鍠栫壕鍏兼叏濡鏁剧紒閬嶄憾濮婄粯鎷呴崨濠傛殘濠电偠顕滅粻鎾崇暦瑜版帒绾ч悹鍥╁亾缁嬫垼鐏掗梺绋跨箳閸樠囧几閹达附鈷戦柛婵嗗閺嗘瑩鏌ｅΔ锟藉Λ婵嬪箯閹达附鍋勯柛婵勫劤椤旀洟姊洪悷鎵憼闁荤喆鍎甸幃姗�鍩￠崨顓″煘濡炪倖鐗滈崑鐐哄磻閳╁啰绡�濠电姴鍊搁弳鐔煎冀閿熺姵鈷戠紓浣癸供濞堟棃鎮楀☉鎺撴珖闁瑰箍鍨归埞鎴﹀幢閳轰焦顔傞梻浣告惈椤戞劙宕戦崟顖涙櫢濠殿喗鍔曢敓鑺ョ箓閻ｇ兘鎮界喊澶嬪闁挎繂楠搁弸鐔兼煟閹惧鎳囬柡灞剧洴楠炲鈻庤箛銉﹀闁哄稁鍋撻幏宄邦潩閻愵剙顏�:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珕闂佽姤锚椤︻喚绱旈弴銏♀拻濞达綀娅ｉ妴濠囨煕閹惧绠為柟顔炬焿椤﹀綊鏌熼姘辩劯妤犵偞顭囩槐鎺懳熼悮瀛樺闁割煈鍋嗙粻楣冩煙鐎电鍓卞ù鐓庢閺岀喐娼忛崜褏鏆犻梺娲诲幗椤ㄥ﹪鎮￠锕�鐐婇柕濞э拷濡俱劑姊虹紒妯诲暗闁哥姵鐗犲濠氭晸閻樿尙顦ㄩ梺闈涱焾閸庡骞忛悜钘変紶闁靛闄勫▓浼存⒑閸撴彃浜濇繛鍙夛耿閸╂盯骞掑Δ浣哄幈闁诲繒鍋犻褔鏁撻懞銉︾闁诡喗锕㈤弫鍐磼濞戞艾骞愰梺璇茬箳閸嬬喖宕戦幘鍓佺焼闁告劦浜炵壕鑲╃磽娴ｈ鐒芥繛鎻掝嚟閿熷�燁潐濞叉牜绱炴繝鍥ワ拷浣糕枎閹炬潙浜楅柟鍏兼儗閸犳绱為幘缁樷拻闁稿本鑹鹃敓钘夊槻闇夐柛銉墻閺佸鎲歌箛娑樼闁靛繈鍊曢獮銏＄箾閹寸儐鐒介柡灞熷啠鏀介柣妯款嚋瀹搞儵鎮楀鐓庢珝闁糕晝鍋涢濂稿川椤忓懏鏉搁梻浣虹帛椤牆顕ｉ幘瀛樹氦鐟滅増甯楅悡娑㈡煕閹扳晛濡煎ù婊�鍗抽弻鐔割槹鎼粹�冲箣闂佽桨鐒﹂崝鏍箚閺冨牆鐏抽柟棰佺劍娴溿倕鈹戦敍鍕杭闁稿﹥鐗曠叅婵犻潧娲ㄩ々鍙夈亜閹烘垵锟藉綊锝為弴銏＄厵闁诡垎灞芥闂佽崵鍠庣紞濠囧蓟濞戙垹唯闁靛繆鍓濋悵鏃堟煟閵忊晛鐏涢柛鏃�鍨甸～蹇撁洪鍛画闂佸搫顦扮�笛囶敊閿熶粙姊绘担鐑樺殌闁搞倖鐗犻獮蹇涙晸閿燂拷,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔闈浢瑰鍐煟闁诡喓鍨藉畷鍗炍熺拠鎻掍紟婵犲痉鏉匡拷鏇㈩敄閸℃瑱鎷峰顒傜Ш婵﹥妞介幃鐑藉箥椤曞棛绀婇梻浣告憸婵敻鎮ч悩璇参ュù锝囩《濡插牓鏌曡箛濠忔嫹缁涜瀚瑰┑鐘崇閻撴洟鏌嶉埡浣稿絹闁瑰瓨绺鹃弸宥囷拷骞垮劚椤︿即鎮￠悢鍏肩厽闁哄倹瀵ч幉鎼佹煟椤撶偠瀚版い顓″劵椤﹁櫕銇勯妸銉уⅵ鐎殿噮鍋婇、姘舵晸娴犲宓侀柟鐑橆殔缁秹鏌涚仦鍓ф噮闁荤喐绻堝缁樻媴閻熼偊鍤嬬紓浣筋嚙閸婂潡鐛箛鏇嫹閿濆簼绨甸柨鐔诲Г鐢鎹㈠┑鍡╂僵妞ゆ挾鍎戦幏鐑芥偨閸涘﹦鍙嗗┑鐘绘涧濡盯宕欓崷顓犵＜闁靛鍎洪悡濂告煛瀹�瀣М闁轰礁鍊垮畷顐﹀礋椤愵偆锟芥娊姊婚崒姘悙妞わ妇鏁诲濠氭晲婢跺﹦顔掗梺鐟板閻℃棃鏁撻懞銉疁闁哄被鍔戦幃銏㈢磼濮楀棙顥夋繝鐢靛仜閻ㄧ兘鏁撻懞銉ュ闁搞倖娲栭埞鎴︽偐瀹曞浂鏆￠梺鍝勬噺閹倿寮婚敐鍛傜喖鎳￠妶鍛哗闂備礁鎽滈崑鐘测枖濞戔懇锟芥棃宕橀鍢壯囨煕閳╁喚娈旀い顐㈡喘濮婃椽骞栭悙鎻掝瀳缂傚倸绉撮敃顏堝极閹扮増鍊烽柛婵嗗閸樺憡绻涙潏鍓у埌鐎殿喖鐖煎顒勬晸娴犲鈷掑ù锝堟鐢盯鏌ｉ悢鏉戝姦妤犵偛锕ㄧ粻娑㈠即椤忓懎顏跺┑顔斤供閸撴稓绮旈悜妯诲弿濠电姴鍟妵婵堬拷瑙勬礈閸忔﹢銆佸锟介崺鍕礃閹惧懏瀚规俊銈呮噺閳锋垿鏌涘┑鍕姎閺嶁�愁渻閵堝啫濡奸柨鏇樺�濋幃楣冩倻閽樺宓嗛梺缁樺灥濡骞冮幋鐐电瘈闁靛骏绲剧涵鐐亜閹存繃鍠樼�规洏鍨介弻鍡楊吋閸″繑瀚奸梻浣告啞缁诲倻锟芥凹鍙冨畷鎺楀Ω閳哄倻鍘遍梺鍝勫�圭�笛冿耿娴煎瓨鐓涢柛娑卞幘閸╋絾銇勯姀锛勨槈鐞氭瑦銇勯幘璺轰户缂佸妞介弻鐔碱敊鐟欏嫭鐝栫紓渚囧枤閺佺鈽夐悽绋挎そ闁告劏鏅涢鍫曟煟閻樿精顒熼柣鎾愁樀楠炲繐鐣￠幍铏亖闂佸壊鐓堥崰妤呮倶閸儲鈷戠紓浣诡焽婢ь亪鏌曢崼銏╃劸闁伙絽鍢茬叅妞ゅ繐鎳忓▍銏ゆ⒑缂佹﹩鐒鹃悘蹇旂懇閺佸秴顭ㄩ崘锝嗘杸濡炪倖姊婚悡顐︻敂閸ャ儰姹楁繝銏ｆ硾閺堫剟锝為弴鐔剁箚妞ゆ牗绺块敓鏂ゆ嫹闂佺尨鎷峰ù鐘差儐閻撶喖鏌熼柇锕�澧柍缁樻礋閺屾盯濡堕崶褎鐎婚梺瀹狀潐閸ㄥ潡銆佸▎鎾村殟闁靛鍎遍弨顓㈡⒒娴ｇ瓔鍤冮柛鐕佸亰瀹曞崬鈻庨幋鐐寸帆濠电姷鏁搁崑鐐哄垂閸洍锟斤箓宕堕锕�娲弻鍡楊吋閸″繑瀚奸梻浣告啞缁诲倻锟芥凹鍣ｉ崺銏″緞閹邦厾鍘遍柣搴秵娴滄繈宕冲ú顏呯厱闁圭儤鍩婇弨鑽ょ磼鏉炴壆鐭欑�规洏鍔嶇换婵嬪礋椤愩垹寮烽梻鍌氬�搁…顒勫磻閸曨個褰掑礋椤撶偟绛忛梺鍏间航閸庢娊銆呴弻銉︾厽闁归偊鍓﹂崵鐔虹磼閳藉懏瀚归梺鑽ゅ枑缁瞼绮旈崼鏇熸櫢闁兼亽鍎抽。鍙夌節閵忊槄鑰块柨婵堝仩缁犳盯骞樻担瑙勩仢妞ゃ垺妫冨畷鐔碱敃閵堝洤鏄ュ┑鐘垫暩婵兘寮崨濠冨弿闁圭虎鍠栫壕鐟扳攽閻樺磭顣查柛瀣剁節閺岀喓绱掑Ο杞板垔濠电偞鎸搁…鐑藉蓟閺囥垹閱囨繝闈涙濞堫厽绻濈喊姗堟嫹閸愬弶鍊梺闈涙搐鐎氫即寮崘顔芥櫢濞寸姴顑嗛崐鑸垫叏濮楀棗骞橀柍鐟扮Т閳规垿鎮╅崣澶嬫倷缂備胶濮风划顖炲Φ閸曨垰绫嶉柛銉戝倹鐫忔俊鐐�х拹鐔煎礉瀹�鍕拷鏃堝礃椤斿槈褔鏌涢埄鍏︽岸骞忔繝姘拺闁告稑顭悞濂告煕閵夛絽濡煎ù鐘欏啠鏀介柍钘夋閻忕喖鎮归敓浠嬫晝閿熶粙濡撮幒鎾剁瘈婵﹩鍘鹃崢顏堟⒑閸撴彃浜濈紒璇插暣瀹曟娊鎮惧畝锟界壕濂告煟濡搫鑸圭�规挸妫濋弻鐔碱敊缁涘鐣跺銈庡亝缁诲牓骞冮埄鍐╁劅闁虫拝鎷烽柟濂夊亰濮婄粯鎷呯粵瀣異闂佸摜濮甸〃濠囧极閸愵喖顫呴柕鍫濇噺濡差剟姊虹捄銊ユ灁濠殿喗娼欓蹇撯攽閸ャ儰绨婚梺鍝勫暙濞村倸顭囬幇鐗堝�垫慨姗嗗亞閻瑦鎱ㄦ繝鍕笡闁瑰嘲鎳橀幊鐐哄Ψ瑜嬮敓钘夛躬濮婃椽妫冮埡鍐ょ紓浣哄У閹瑰洭鎮伴璺ㄧ杸婵炴垶鐟﹀▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹?
					Module.logger.warn("[CRequestUpdateRoleInfo] find non-existent role info, roleId:" + currentRoleId
							+ " targetRoleId:" + roleid);
					return true;
				}
				String clanname ="";
				Long factionId = xtable.Roleidclan.select(roleid);
				if (factionId != null && factionId > 0) {
					clanname = xtable.Clans.selectClanname(factionId);
				}
				SRequestUpdateRoleInfo send = new SRequestUpdateRoleInfo();
				send.friendinfobean = FriendHelper.toInfoBean(currentRoleId, roleid);
				if (clanname != null) {
					send.friendinfobean.factionname = clanname;
				}
				mkdb.Procedure.psendWhileCommit(currentRoleId, send);
				return true;
			}
		};
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 806533;

	public int getType() {
		return 806533;
	}

	public long roleid;

	public CRequestUpdateRoleInfo() {
	}

	public CRequestUpdateRoleInfo(long _roleid_) {
		this.roleid = _roleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRequestUpdateRoleInfo) {
			CRequestUpdateRoleInfo _o_ = (CRequestUpdateRoleInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRequestUpdateRoleInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


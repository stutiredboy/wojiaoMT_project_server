
package fire.pb.move;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.scene.Scene;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqSeeEachOther__ extends mkio.Protocol { }

/** 主动请求跟某个在周围的角色互相看见，如果在周围，就推下来
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqSeeEachOther extends __CReqSeeEachOther__ {
	@Override
	protected void process() {
		// protocol handle
		final long reqroleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (reqroleId < 0)
			return;
		Role reqrole = RoleManager.getInstance().getRoleByID(reqroleId);
		Role seerole = RoleManager.getInstance().getRoleByID(roleid);
		
		if(reqrole == null || seerole == null)
			return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽崺鍕礃閵娧呯嵁闂佽鍑界紞鍡樼閻愬搫鍌ㄩ柟鎵閳锋垿鏌ゅù瀣珔妞わ絽銈搁幃妤冪箔濞戞ɑ鎼愬鍛存⒑閸涘﹥澶勯柛鐘冲哺閹潡鏁撴禒瀣拺闁革富鍘兼禍楣冩煙椤栨俺瀚伴摶鐐烘煏閸繃鍣抽柡锟芥禒瀣厓闁芥ê顦伴ˉ婊兠瑰鍫㈢暫闁哄瞼鍠栧畷娆撳Χ閸℃浼�?
		
		if(reqrole.getScene() != seerole.getScene())
			return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽崺鍕礃閵娧呯嵁闂佽鍑界紞鍡樼閻愬搫鍌ㄩ柟鎵閳锋垿鏌ゅù瀣珔妞わ絽銈搁幃妤冪箔濞戞ɑ鎼愬鍛存⒑閸涘﹥澶勯柛鐘冲哺閹潡鏁撴禒瀣拺閻熸瑥瀚粈鍐╃箾婢跺娲撮柕鍡楀�哥叅妞ゅ繐鎳愰崢浠嬫⒑缂佹ɑ鐓ラ柟鑺ョ矒楠炲﹪寮撮悩鐢碉紲闂佺粯顭堝▍鏇炵暦鐏炵虎娈介柣鎰絻閺嗘瑦銇勯锝囩煉闁轰焦鎸荤粋鎺旓拷锝庝簽閻ｅ搫鈹戦悙鍙夘棡闁搞劏娉涢悾閿嬪緞閹邦剛楠囬梺缁樺姍濞佳囥�傛總鍛婄厽妞ゆ劑鍨荤粻鎻捛庨崶褝韬柟顔界懇椤㈡棃宕熼懜闈涱伓闂佸搫娲ㄦ慨闈涚暦閸欏绻嗘い鏍ㄧ箓閸氳銇勯埡鍌滃弨闁哄本鐩、鏇㈡晲閸℃瑯妲梻浣芥閸熶即宕伴幇顔藉床婵炴垯鍨圭粻锝嗙箾閸℃绠冲ù鐘荤畺濮婃椽宕崟顒�娅ょ紓渚囧枟閹瑰洤顕ｆ繝姘亜缁炬媽椴搁弲顒勬⒑缁洖澧叉い銊ユ嚇瀵啿鈻庨幇鈺�绨诲銈嗗釜閹烽攱淇婇锝囨噮闁瑰箍鍨归埞鎴狅拷锝庡亜娴犳椽姊婚崒姘卞缂佸鍔楅崚鎺楀醇閺囩啿鎷洪悷婊呭鐢寮柆宥嗙厱闁靛鍎查崑銉╂煟濞戝崬鏋︾紒鐘崇☉閳藉鈻庨幇顓т户闂傚倷娴囧▔鏇㈠闯閿曞倸绠柨鐕傛嫹
		
		Scene s = reqrole.getScene();
		int reqscreenindex = s.getScreenIndex(reqrole.getPos());
		int seescreenindex = s.getScreenIndex(seerole.getPos());
		if(Math.abs(reqscreenindex - seescreenindex) > 1)
			return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽崺鍕礃閵娧呯嵁闂佽鍑界紞鍡樼閻愬搫鍌ㄩ柟鎵閳锋垿鏌ゅù瀣珔妞わ絽銈搁幃妤冪箔濞戞ɑ鎼愬鍛存⒑閸涘﹥澶勯柛鐘冲哺閹潡鏁撴禒瀣拺閻熸瑥瀚粈鍐╃箾婢跺娲寸捄顖炴煥閻斿墎鐭欐慨濠勭帛閹峰懘鎮烽幍铏亞闂備胶灏ㄩ幏鐑芥煕濡ゅ啫锟斤絽鈽夐姀鐘殿槰濡炪倖妫佹竟鍫ュ箺閺囩偐鏀介柣鎰綑閻忕喖鏌涢妸銉хШ鐎规洩绻濋獮搴ㄦ嚍閵壯冨妇濠电姷鏁搁崑娑㈡倶濠靛绀夋繝濠傜墛閻撶喖鐓崶銊︹拹閻忓繒鏁哥槐鎺撴綇閵婏箑闉嶉梺鐟板槻閹虫ê鐣烽锕�绀嬬痪鏉款槹鐎氬湱锟界櫢鎷烽柛鏇ㄥ墰閸橀亶姊洪幐搴ｇ畵缂佺粯甯炵划鏃堫敊缁涘顔旈梺缁樺姈瑜板啴寮冲▎鎰╀簻妞ゆ劧绲块惌鎺楁煛娴ｈ灏扮紒鍌涘笧閿熸枻缍嗘禍鐐烘偩閸濆嫧鏀介柣鎰级椤ョ偤鏌熺粙娆剧吋鐎规洜鏁婚獮瀣倷椤忓啰鐩庨梻浣告贡閸庛倝宕归崹顐ゎ洸闁绘劗鍎ら悡鏇㈡煟閹邦垱纭鹃柣鎾村姉缁辨帞绱掑Ο鑲╃杽闂佽鍠曠划娆徫涢崘銊㈡婵°倕鍟畷鐔兼⒒閸屾瑧鍔嶉柣顏勭秺瀹曟繃鎯旈妸銉ь槯濠碘槅鍨靛▍锝夊汲閿旂晫绡�濠电姴鍊搁弳濠囨煛閿熻姤绂掔�ｎ偆鍘卞銈嗗姉婵挳鎮橀锟介弻锝夊箻鐎涙ê闉嶇紓浣虹帛缁诲牊鎱ㄩ敓浠嬫煥濠靛棙鍣介柛姗嗗亰濮婃椽宕ㄦ繝鍐炬缂備胶濮甸幐鎼侇敋閿濆鏁冮柨鏇嫹闁绘劕锕ラ妵鍕箳瀹ュ牆鍘￠梺鍛婏供娴滄繄鎹㈠┑瀣仺闂傚牊鍐婚幏鐑筋敍閻愯尙顦ㄩ梺瀹犳〃缁讹繝鏁撻懞銉р槈闁宠鍨块崺鍕礃閵娧呫偡闂備焦鎮堕崹娲偂閿熺姴鏄ラ柣鎰惈缁狅綁鏌ㄩ弮鍥棄闁跨喓鏅崗姗�寮婚妶鍥ф瀳闁告鍋涢～顏堟⒑绾懎钄奸柛瀣姉濡叉劙骞樼�靛摜鎳濋梺鎼炲劀閸曨厺閭紓鍌氬�风粈渚�藝椤栫偞鍋夐柣鎾冲瘨閸ゆ洘銇勯幇璺虹槣闁轰礁顑夐弻銊╂偄閸撲胶鐓撳Δ鐘靛仜閸燁偊鍩㈡惔銊ョ闁绘劕寮跺▍婵嗏攽閻愯埖褰х紒鎻掓健閹椽寮▎鍓у姺闂佸綊鍋婇崳顖炲箯閻戣棄鍨傛い鎰剁悼閸戯繝鏌ｆ惔銏㈢叝闁告濞婇幃浼搭敋閿熻棄鐣烽崼鏇ㄦ晢濠㈣泛顑嗗▍宥夋⒒娴ｈ櫣甯涢柛鏃�鐗為妵鎰板礃椤斻垹顦甸獮鍥偋閸碍瀚藉┑鐐舵彧缁插潡鎮洪弮鍫濆惞婵炲棙鎸婚悡鏇㈡煙鐎电校婵炲懏娲滈敓钘夌仛濠㈡﹢鏁冮妶鍥у疾婵＄偑鍊曠换鎰拷姘煎櫍瀵槒顦查柍瑙勫灴閹晝绱掑Ο濠氭暘婵＄偑鍊栭崹闈浳涘┑鍡欐殾闁硅揪绠戦悞娲煕閹板吀绨介柣锕�鐗撳濠氬磼濮樺崬顤�婵炴挻纰嶉〃濠傜暦閺囥垹绠涢柣妤�鐗忛崢浠嬫⒑鐟欏嫬鍔ら柣掳鍔庣划鍫拷锝庡枟閻撴盯鎮橀悙棰濆殭濠殿喖鍊块弻鐔碱敊閸濆嫸鎷峰┑鍡欐殾闁圭儤鍨熷Σ鍫熸叏濡わ拷濡梻妲愰敓锟�?
		
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(s.getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙璺虹毢妞ゎ厼鐗撻崺鐐哄箣閿旇棄浜归柣鐘叉厂閸愌呯煑闂傚倷鑳堕幊鎾诲疮鐠恒劍宕查柟鎵閸嬧晠鏌ｉ幋锝嗩棄缂佺姷鏁婚弻鐔煎传閸曢潧鍔�闂佸綊顥撻崗姗�鐛幒妤�绠ｆい鎾跺枎閸忓﹪姊绘担铏瑰笡闁告棑绠撳畷婊冣枎閹垮啯鏅滈梺鍓插亝濞叉﹢鎮￠悢鐓庣婵烇綆鍓欓敓濮愬�曢…鍥箛椤撶姷顔曞┑鐐存綑椤戝棗鈻嶉崶鈺冪＜閺夊牃鏅涙禒锔剧磼濡ゅ啫鏋涢柡浣规尰缁傛帞锟斤綆锟筋厹鍎遍湁闁挎繂娲ㄩ妴濠冧繆閹绘帞澧涘ǎ鍥э躬椤㈡盯鎮欑�涙ɑ娈搁梻浣告惈閸嬪﹪骞忛悜鑺モ拻闁稿本鐟чˇ锔剧磽瀹ュ拑韬�规洘鍨剁换婵嬪炊瑜嶉崑宥夋⒑閸涘﹥瀵欓柛娑卞灣閸樼娀姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠绘鐐村灴婵拷闁靛牆鎳愰悿锟芥俊鐐�栧Λ浣肝涢崟顒佸劅濠电姴娲﹂埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑㈡偐閹颁焦鐣堕梺浼欑悼閸忔ê鐣烽敐鍡楃窞濠㈣泛鐬奸悾鐐繆閻愵亜锟芥牠鎮уΔ鍛仭鐟滃繒鍒掗弮鍫濋敜婵°倓鑳堕崣鍡椻攽閻樼粯娑ф俊顐幖鍗辩憸鐗堝笚閻撴盯鏌涘☉鍗炴灓缂佺姷鍋ら弻锛勪沪閸撗侊拷鎺懨归悪鍛暤闁诡喗鐟╅、妤呭磼濞戝崬鎮嬮梻鍌氬�烽懗鍓佸垝椤栫偛绠板┑鐘宠壘閸ㄥ倿鏌ｉ姀銏€�婇柨鐔诲Г濡啫鐣峰锟介、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁鏆熼柟鍐插暞閵囧嫰顢曟惔鈩冨櫧缁炬崘妫勯湁闁挎繂娲ㄩ幗鍌炴煕閵堝棛鎳呯紒杈ㄥ笚瀵板嫮锟斤綆鍋勯崬澶愭⒑閻愯棄鍔电紒鐘虫尭閻ｇ兘宕奸弴銊︽櫌婵炶揪缍�椤顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�
		{
			final long reqteamid = reqrole.getTeamID();
			final long addteamid = seerole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		reqrole.seeSomeone(seerole);
		seerole.seeSomeone(reqrole);
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 790486;

	public int getType() {
		return 790486;
	}

	public long roleid;

	public CReqSeeEachOther() {
	}

	public CReqSeeEachOther(long _roleid_) {
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
		if (_o1_ instanceof CReqSeeEachOther) {
			CReqSeeEachOther _o_ = (CReqSeeEachOther)_o1_;
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

	public int compareTo(CReqSeeEachOther _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


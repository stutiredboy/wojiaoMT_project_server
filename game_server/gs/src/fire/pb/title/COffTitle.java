
package fire.pb.title;


import fire.pb.PropRole;
import fire.pb.battle.livedie.LiveDieMange;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __COffTitle__ extends mkio.Protocol { }

/** 客户端请求卸下称谓
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class COffTitle extends __COffTitle__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;
		if (checkCOfftitle(roleid))
			new POnTitleProc(roleid, -1).submit();
	}
	
	public boolean checkCOfftitle(long roleid){
		fire.pb.PropRole prole = new fire.pb.PropRole(roleid, true);
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role != null){
			if(isLiveDieTitle(prole)){
				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 162120, null);
				return false;
			}
//			if(isFactionTitle(prole)){
//				fire.pb.talk.MessageMgr.sendMsgNotify(roleid, 144142, null);
//				return false;
//			}
		}
		
		return true;
		
	}
	
	/**
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵挳鎮欑拠褎瀚圭憸鐗堝笒绾惧潡鏌熺�电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑橆殕閻撴洟鏌曟繛鍨姎闁跨喕濮ら幃鍌炲春閻愬搫绠ｉ柨鏃囨娴滃綊鏌ｆ惔鈩冭础濠殿喗鎸宠棢婵犻潧鐗忕壕钘壝归敐鍥ㄥ殌濠殿喖鐗婇妵鍕Ω閵夘垵鍚悗娈垮枛椤兘骞冮姀銏㈢煓婵炲棙鍎冲▓濂告⒒娴ｅ憡鎯堟い锔垮嵆瀹曞綊骞庨挊澶岀崶婵犵數濮村ú锕傚煕閹达箑绾ч柣鎰綑椤ュ銇勯敂濂告濞ｅ洤锕、鏇㈡晲閸モ晝鏉介柣搴㈩問閸犳牠鈥﹂悜钘夌畺闁靛繈鍊栭幆鐐烘煕閿旇寮跨紒杈ㄧ叀濮婄粯绗熼敓钘夘焽瑜忛幑銏ゅ箳閹炬潙寮块梺姹囧灩閹诧繝宕愰崼鏇熺厱妞ゆ劗濮撮悘顔剧棯閹规劖顥夐棁澶愭煥濠靛棙鍣洪柟顖氱墛閵囧嫭鎯旈姀鈥虫殫缂備浇椴哥敮锟犲箠閻樻椿鏁嗛柨鐔诲Г缁傚秹宕滆绾捐偐锟界櫢鎷烽柛鎰靛枛閹界數绱撴担铏瑰笡缂佽鐗嗛悾鐑藉醇閺囩喎娈濋梺鍓茬厛閸嬪懘鎮甸鈶╂斀闁绘ɑ鍓氶崯蹇涙煕閻樻剚娈滈柡浣稿暣閸╋繝宕ㄩ鐙�妲舵繝娈垮枟椤牆鈻斿☉姘棜閻熸瑥瀚ㄦ禍婊堟煛瀹ュ骸浜滃ù鐙呯畵閺屽秹鏌ㄧ�ｎ亞浠撮梻鍥ь樀閺屾稖绠涘顑挎睏闂佺懓鍟块幊鎰閹烘挸绶炴俊顖氭惈椤晠姊婚崶褜妲圭紒缁樼箖缁绘繈宕掗悜鍡嫹濡わ拷椤儻顦村褎顨嗙粚杈ㄧ節閸パ呯厬婵犮垼娉涢敃銈夛綖閹烘嚦鏃堟偐闂堟稐娌柣銏╁灲缁绘繈鎮伴鍢夌喖鎼圭憴鍕啎闂備焦鎮堕崕顕�寮插┑鍡欐殼濞撴熬鎷锋慨濠勭帛閹峰懐绮电�ｎ亝顔勯梻浣告啞閸ㄥ綊寮查銈嗩潟闁绘劕鎼獮銏＄箾閹寸儐鐒介柨娑欑洴濮婅櫣鍖栭弴鐐测拤缂備礁顑嗛崹鍦垝閸儱绀嬫い鏍ㄧ〒閸欏棝姊虹紒妯荤叆闁圭⒈鍋呴悧搴ㄦ⒒娴ｄ警鐒炬い鎴濆�垮畷婊冣攽閸喎搴婂┑鐘绘涧濞层劎寮ч敓浠嬫⒑缁嬫寧婀扮紒瀣灥閳诲秹鏁愰崪浣瑰瘜闂侀潧鐗嗙换鎺楀礆娴煎瓨鐓忛柛顐ゅ枑閸婃劖顨ラ悙鎻掓殭閾绘牠鏌涢幇鍏哥敖闁伙綀娉涢埞鎴︽倷閺夋垹浠搁柦鍐憾閺屾盯鏁愰崟顓犵厯闂佸搫鐭夌紞渚�銆佸锟介幃銏ゆ倻濡儤鐝ｅ┑锛勫亼閸娿倝宕ｉ敓鑺ョ箾婢跺绀嬫鐐村灴瀹曠喖顢楅崒婊勫殞婵＄偑鍊栭悧妤冨垝瀹�鍐︿汗闁糕剝绋掗埛鎺懨归敐鍛暈闁哥喓鍋ら弻銈堛亹閹烘梻鏆銈冨灪閻楁顕ラ崟顖氱疀妞ゆ帒鍟幉鐗堢節閻㈤潧浠﹂柛顭戝灦瀹曟椽宕熼姘�梺鍛婂姦閸犳鎮￠妷锔剧瘈闂傚牊绋掗ˉ鐐碉拷鐟版啞缁诲牓寮婚敐澶嬫櫜濠㈣泛顑嗛柨顓㈡煣缂佹澧甸柡宀嬬到椤粓鏁撻挊澶樼劷鐟滃海绮嬮幒鎴叆闁告洍鏅欑花濠氭⒑閻熸壆鎽犵紒璇茬Т铻ｉ柨鐔剁矙閹鈻撻崹顔界亪濡炪値鍘鹃崗妯侯嚕椤愶箑绠涙い鎾跺仧缁愮偤鏌ｆ惔顖滅У濞存粎鍏橀獮蹇涙倻閼恒儱锟藉鏌ら幁鎺戝姢闁告ê鎲＄换婵嬪閿濆棛銆愬銈嗗灥閹虫﹢骞冨锟芥俊鐑芥晜閽樺浼庨梻浣瑰缁诲倿骞婇幇顓熸珷闁挎棁濮ら崣蹇撯攽閻樺弶鍣烘い蹇曞Х缁辨帡顢欓悾灞惧櫑闂佸疇顕ч柊锝夌嵁閸℃凹妲绘繝銏㈡嚀閻楁挸顫忕紒妯诲闁绘垶锚濞堝矂姊洪崫銉ユ瀻婵炵》绻濆缁樼節閸ャ劍娅滈梺鍛婄矊閸熸娊鏁撻挊澶屼虎闂囧鏌ㄥ┑鍡樺窛闁靛棗锕弻锟犳晸閼恒儳顩烽悗锝庡亞閸樹粙姊鸿ぐ鎺戜喊闁告鏅槐鐐哄箣閿旂晫鍘介棅顐㈡储閸庢娊鎮鹃悽鍛婄厸鐎癸拷鐎ｎ剛袦闂佽鍠撻崹褰掑煘閹达箑骞㈡俊顖滅帛閸婄兘姊绘担铏瑰笡闁规瓕宕甸幑銏ゅ醇閵夈儴鎽曢梺闈浥堥弲婊堝磻閸℃稒鐓曢悘鐐插⒔閳藉銇勮箛銉﹀?
	 * @param prole
	 * @return
	 */
	public static boolean isLiveDieTitle(PropRole prole){
		if(prole.getTitleID() == LiveDieMange.getLiveDieTitle()){
			return true;
		}
		return false;
	}
	
	
/*	private boolean isFactionTitle(PropRole prole) {
		if(prole.getTitleID() >= fire.pb.clan.Constant.FACTION_MASTER_TITLE && prole.getTitleID() <= fire.pb.clan.Constant.FACTION_MEMBER_TITLE)
			return true;
		return false;
	}*/

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 798437;

	public int getType() {
		return 798437;
	}


	public COffTitle() {
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
		if (_o1_ instanceof COffTitle) {
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

	public int compareTo(COffTitle _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



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
	 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳娼￠弻鐔猴拷鐢殿焾鏍￠梺鍝ュУ閸旀瑩寮婚敐鍛傛棃鏁撴禒瀣亱闁糕剝鐟х粻鏃堟煙閻戞﹩娈曢柣鎾存礋閺屾洘绻涢崹顔煎闂佽法鍠曟慨銈夊箖閸岀偛鏄ラ柣鎰惈缁狅綁鏌ㄩ弮鍥棄濞存粌缍婇弻锝嗘償閳╁啳纭�婵犳鍠楅幐瀹犳＂濠电娀娼ч悧蹇曞閽樺褰掓晲閸ャ劌娈屾繝娈垮枛閻楀﹪濡甸崟顖毼╅柕澶樺灥閸氼偊鎮楀▓鍨灈妞ゎ厾鍏橀獮鍐閵忋垻鐓撳┑鐐叉閸庡啿鈻撴總鍛娾拻濞达絽鎲￠幆鍫熴亜閿斿灝宓嗙�规洖缍婇獮搴ㄦ寠婢跺瞼宕跺┑鐘垫暩婵潙煤閿曞倸鐓曢柟杈剧畱缁狙囨煟閹邦厽缍戞い銉ヮ儐閵囧嫰鏁傛總鍛婎�嶆繛锝呮搐閿曨亪銆侀弴銏℃櫜闁搞儮鏅濋弶浠嬫煟鎼淬埄鍟忛柛鐘崇墵閳ワ箓鎮滈挊澶岀暫闂侀潧绻堥崐鏍箚閻愮儤鐓曢柨鏃囶嚙瀵法绱掓潏銊у弨婵﹦绮粭鐔兼晸閽樺鐒界憸蹇涘箲閵忋倕绠抽柟鐐綑瀵潡姊哄Ч鍥х仼闁硅绻濆畷鎰板醇閺囩喓鍘卞銈嗗姉婵挳鎮橀鍓ф／闁硅鍔栭ˉ澶愭婢舵劖鐓ユ繝闈涙閸ｆ椽鏌熼姘卞闁靛洤瀚幆鏃堝閳ヨ櫕娈紓鍌欐祰妞村摜鏁敓鐘茬疇闁绘ɑ妞块弫鍡涙煥閻旇袚缂佸倸绉瑰畷婊嗩槾缁炬崘鍋愰敓鐣屾閹风兘鏌涢幇闈涙灈闁圭晫鏁哥槐鎾存媴閾忕懓绗＄紓浣筋嚙閻楀棝鎮鹃悜钘夐唶闁哄洨鍠庡▓婵嬫⒑閸撹尙鍘涢柛瀣嚇閹敻顢曢埗鈺傛杸闂佺粯蓱閸撴岸宕箛娑欑厱闁绘ɑ鍓氬▓婊堟煛娴ｇ鏆ｉ柛鈺嬬節瀹曘劑顢橀悪锟藉Σ鑸电節濞堝灝鏋熸い顓炵墕閳绘柨鈽夊顒夋闁荤喐鐟ョ�氥劍绂嶅鍫熺厸鐎广儱楠告禍婊兠归悪鍛暤闁哄苯绉归弻銊э拷锝庝簽娴犳挳姊婚崶褜妯�闁哄本绋栫粻娑橆潩椤戞寧鐫忛梻浣烘嚀閸熷潡骞婇幇顔筋潟闁圭儤鎸哥欢鐐翠繆椤栨碍鎯堟い顐熸櫊濮婂宕惰濡插湱绱掔紒妯肩畺缂佺粯绻堝畷鎺楁倻閸☆厽瀚规俊銈忔嫹妞ゎ叀鍎婚ˇ鏉戭熆瑜庨〃鍡欑矚鏉堛劎绡�闁搞儜鍛幀濠电姰鍨煎▔娑㈡晝閵堝缍栭柟鐑樺殾閺冨牊鍋愰梻鍫熺◥濞岊亪鏌ｉ姀鈺佺伈缂佺粯绻堥幃浼搭敊閸㈠鍠栭幖鍦喆閸曨剦鍟庨梻鍌欑劍閹爼宕曢锟藉鎻掆攽閸℃瑦娈兼繛鎾寸啲閹烽攱鎱ㄦ繝鍕笡闁瑰嘲鎳愮划鐢碉拷锝庝簼椤斿嫰姊绘担鍛婂暈闁搞劌缍婂鏌ヮ敃閵堝棭娼熼梺缁樺姇閹碱偊鐛姀锛勭闁瑰鍎愰悞浠嬫煥濞戞瑧娲存慨濠呮閸栨牠寮撮悙娴嬫嫟缂傚倷绀侀鍡涘垂閸︻厼鍨濋柛顐犲劚缁�瀣亜閺嶃劎銆掗柛娆忔濮婅櫣绱掑Ο鑽ゅ弳闂佸湱鈷堥崑鍛存偋鎼淬劍鈷掑ù锝勮閻掔偓銇勯幋婵嗭拷鍨暦濠婂啠鏀介柛顐ゅ枎鎼村﹤鈹戦悩缁樻锭婵炲眰鍔庡褔鏁撴禒瀣拺缂佸瀵у﹢鎵磼鐎ｎ偄鐏ラ柍璇茬Ч閺佹劙宕担鐟扮槣闂備線娼ч悧鍡欐崲閹烘绀嗗ù鐓庣摠閻撳繘鏌涢銈呮瀾闁稿﹥鍔栭〃銉╂倷閹绘帗娈柧缁樼墵閺屾盯骞囬崗鍝ユ晼闂佷紮缍�濞夋盯鍩為幋锔藉�烽柡澶嬪灩娴犳悂鏌﹂崘顔绘喚闁哄本鐩弫鎰板礋椤撶姷鍘梻浣告惈閻绱炴笟锟介妴浣割潨閿熶粙骞冮姀銈嗗�绘俊顖滃劋閻濓絽鈹戦敍鍕杭闁稿鍊濆畷锝夋晸閼恒儳绠惧璺侯儐缁�瀣殽閻愭潙鐏寸�规洜鍠栭、妤呭磼濠婂嫬娈炲┑锛勫亼閸婃牠鎮уΔ鍐ㄥ灊鐎癸拷閸愶缚姹楅梺绯曞墲缁嬫帡鍩涢幒鎳ㄥ綊鏁愰崨顔兼殘闂佸摜鍠撻崑銈夊蓟閵堝牄浜归柟鐑樻⒒閺嗩偄顪冮妶鍐ㄧ仾闁绘顨呴銉╁礋椤栨氨鐤�濡炪倖甯掗崯顖炲箟閻楀牏绡�闁汇垽娼ф禒锕傛煕椤垵鐏︾�规洘妞藉畷鐔碱敍濮橆厾锟筋剟姊洪崨濠傚Е闁哥姵顨婇幃锟犲Ψ閿斿墽鐦堥梻鍌氱墛缁嬫帡藟閻愮鎷烽悷鐗堝暈缂佽鐗撳濠氭晲婢跺娅滄繝銏ｆ硾椤戝棝鏌ㄩ銏＄叄缂備焦顭囨晶鐢告煛瀹�瀣埌妞ゎ偅绮撻弫鎾绘寠婢舵鍔烽悷婊冩捣缁骞掗幋顓犲弳闂佸憡娲嶉弲娆戣姳婵犳碍鈷戦柣鐔稿閹界姷绱掔拠鑼㈤摶锝夋煥閻斿墎鐭欓柟顔筋殔閳绘捇宕归鐣屼邯婵＄偑鍊ら崢楣冨礂濡警鍤曟い鎰剁畱缁犳稒銇勯幘璺轰户缂佹劗鍋ら弻锝嗘償椤栨粎校婵炲瓨绮庨崗姗�鐛箛娑欏�婚柤鎭掑劚閿熻棄顭烽弻銈夊箒閹烘垵濮㈤梺鍛娒幉锛勬崲濠靛顫呴柨婵嗘閵嗘劕顪冮妶鍡楃仴闁硅櫕锕㈤獮鍐潨閿熻姤淇婇悜鑺ユ櫆闁芥ê顦导搴ㄦ⒒娴ｇ懓顕滅紒璇插�块獮濠囧箛椤撶喐鐝烽梺鎸庢婵倝宕ｈ箛鎾斀闁绘ê寮堕崳鐑樸亜韫囨洖啸缂佽鲸甯￠、娆撴偩鐏炴儳娅戦梻浣哥枃椤曆囨煀閿濆宓侀柛鈩冨嚬濡茬粯绻濋姀銏″殌闁绘鎸搁～蹇曠磼濡顎撻梺缁樺灦閿氭繛鍫濈焸濮婃椽宕妷銉︾�诲┑鐐点�嬬换婵嗩嚕缂佹绡�闁搞儯鍔嶅▍婊堟⒑閸涘﹦鐭婇柛鐔稿▕閺佹捇鎸婃径灞艰檸闂傚洤顦甸弻銊モ攽閸℃ê绐涢梺闈涙閿曨亪寮婚敓鐘虫櫢闁兼亽鍎抽々鐑芥倵閿濆骸浜為柛妯圭矙濮婇缚銇愰幒鎴滃枈闂佸憡顭囬弲顐ゆ閻愬搫绠ｉ柨鏃傛櫕閸樹粙妫呴銏″偍闁稿孩濞婇幃楣冩偨閸涘﹦鍘搁悗鐧告嫹閻庯綆鍓涜ⅵ闂備浇顕栭崰鎾诲垂瑜版帒鐓橀柟杈剧畱楠炪垺淇婇婊呭笡闁稿﹦鍏樺缁樻媴閾忕懓绗￠梺瑙勭摃瀹曠敻骞戦姀銈呴唶闁靛鍎撮幗鏇㈡⒑闂堟单鍫ュ疾濠婂牆纾婚柛鈩冪♁閻撴洟鎮橀悙鎻掆挃闁宠棄顦伴妵鍕疀閵夛箑顏�?
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


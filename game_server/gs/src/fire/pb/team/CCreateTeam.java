
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CCreateTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸顦╃紓浣虹帛缁诲倿顢氶妷鈺傜叆閻庯綆鍋嗛崙锟犳⒑鐠恒劌鏋欏┑顔哄�曠叅闁绘棃顥撻弳锔姐亜閺嶃劎鈽夋い鏇憾閹鈽夊▍顓т邯瀹曟粓鎮烽幍铏杸闂佺粯鍔曞鍫曀夐悙鐑樼厵缂佸顑欓悡濂告煙椤旂櫢鎷烽弬銉︾�婚梺鍦亾濞兼瑩鏁撻悾灞炬毈闁哄矉缍佹慨锟介柍钘夋閺呴亶姊虹紒妯烘诞缂佺姵鐗曢悾鐑筋敍閻愯弓绱堕梺闈涳紡閸滃啰搴婇梻鍌欐祰椤曟牠宕规惔銊ョ妞ゅ繐妫屽Λ銊х磽閸屾艾锟介娆㈤敓鐘茬獥婵°倕鎳忛崑锟犳煃鏉炴壆璐伴柛銈嗘礀閳规垿鎮╁畷鍥舵殹闂佺顑呯�氫即寮婚敐澶婄闁惧浚鍋呭畷鍐差渻閵堝繐鐦滈柛娆忓暣楠炲啫鐣￠柇锔惧弳闂佸憡鍔︽禍鐐侯敊婵犲洦鈷戦弶鐐村鐠愪即鏌涢悩宕囧⒌闁糕斂鍎插鍕箛椤掑缍傞梻浣瑰缁嬫垹锟芥凹鍓涢弫顔嘉旈崨顔规嫽闂佺鏈悷褔藝閿曞倹鐓熼煫鍥ㄦ⒒缁犵偞銇勯姀锛勫⒌鐎规洖宕灃闁告劏鏅滈鏇㈡煟鎼达絾顏熼柟椋庡厴閺屾盯寮撮妸銉ヮ潾闂佸憡蓱閹倿骞冨Δ鍛剬闁告稑锕ら鍫曟⒑鐠囨彃鍤辩紓宥呮瀹曟粌鈽夊┃鎯у緧闂傚倷娴囬褏锟芥稈鏅犻、娆撳冀椤撶偤妫峰銈嗘穿閹烽锟借娲樼划鎾诲箖閵忊槅妲归幖娣灪椤旀洟鏌ｉ悢鍝ョ煂濠⒀勵殘閺侇噣鍩￠崨顓熺�柣搴秵閸犳鎮￠弴鐔虹闁瑰瓨绻傞懜褰掓煛鐎ｎ剙鏋戦柕鍥у瀵噣鏁撴禒瀣瀭闁革富鍘介～鏇㈡煙閹规劦鍤欑痪鎯у悑閹便劌顫滈崱妤�鈷曢梺鍦厴閺�閬嵥囬悧鍫熷劅闁靛繆鏅涙禒娲⒒娓氾拷濞佳囨偋閸℃蛋鍥敍濠婂懍绗夊銈嗙墱閸嬬偤鎮￠悢鍏肩厵閺夊牆澧介崚鎵偖濮樿埖鈷戠紓浣股戠亸顏堟煕鎼达絾鏆�殿喖顭烽弫鎰緞婵犲倸绁梻浣虹帛閸旀﹢顢氬鍫濈闁绘垼妫勯幑鑸点亜閹惧崬濡介悗姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷
 * @author changhao
 *
 */
public class CCreateTeam extends __CCreateTeam__ {
	@Override
	protected void process() {
		// protocol handle	
		TeamManager.logger.debug("Enter: " + this.getClass());
		final long leaderRoleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (leaderRoleId < 0)
			return;
		/*
		gnet.link.Role linkrole = gnet.link.Onlines.getInstance().find(leaderRoleId);
		if (linkrole != null)
		{
			int userid = linkrole.getUserid();
			if (fire.pb.fushi.Module.GetPayServiceType() == 1) //闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存鐐达耿閹崇娀顢楁径瀣撴粓姊绘担瑙勫仩闁告柨绉堕幑銏ゅ礃椤斿槈锕傛煕閺囥劌鐏犻柛鎰舵嫹婵＄偑鍊栭崝锕�顭块敓鐣岀磼椤旂厧顣崇紒杈ㄦ尰缁楃喐绻濋崘顭戜紦婵犵數濮伴崹鐓庘枖濞戙埄鏁勯柛鏇ㄥ幗瀹曟煡鏌涢埄鍐檨闁绘挸绻橀弻娑㈩敃閿濆洨鐣洪梺闈╃稻濡炰粙寮诲☉銏℃櫜闁告侗鍠涚涵锟界紓鍌欐祰妞村摜鏁敓鐘茬畺闁冲搫鎳忛ˉ鍫熺箾閹寸偛绗氶柣搴濆嵆濮婄粯鎷呴崨濠冨創闂佹椿鍓欓妶绋跨暦娴兼潙鍐�妞ゆ挾濮寸粊锕傛⒑缁洖澧查柛鎴犳嚀鍗卞Δ锝呭暞閳锋垿鏌熺粙鎸庢崳闁宠棄顦辩槐鎺撳緞婵犲嫮楔閻庢鍠栭…鐑藉极閹剧粯鍋愰柟缁樺笩閿熻棄鐏濋—鍐Χ閸℃ê鏆楁繝娈垮枤閸忔ê顕ｉ幎钘壩ч柛娑变簼閺傦拷婵＄偑鍊栧濠氬Υ鐎ｎ喖缁╃紓浣姑肩换鍡涙煟閹邦厼顥嬮柣顓熺懇閺屾洟宕遍弴鐙�妲柧缁樼墵閺屾稑鈽夐崡鐐寸亶濠电偛鎳岄崹钘夘潖閻戞ê顕辨繛鍡樺灥閸╁矂姊哄ú璇插闁靛牊鎮傞獮鍡楃暆閸曨偆顔掔紓鍌欑劍閿氶柨鐔烘櫕閺佸寮婚敐澶婎潊闁绘ê鍟块弳鍫熺箾鐎涙ê娈犻柛濠冪箞瀵鎮㈡搴㈡疂闂佸搫顦扮�笛傜昂濠碉紕鍋戦崐銈夊磻閸涱垱宕查柛顐犲劘閿熸垝绀佽灃濞达絽鎽滅粣鐐烘煟鎼搭垳绋婚柟绋跨埣瀹曟繈骞嬪┑鎰稁闂佹儳绻楅～澶婄暦婢舵劖鐓忓┑鐐茬仢閸旀粓鏌ｈ箛鎾搭棞闁宠鍨块崺銉╁幢濡炲墽鐩庨梺璇插閸戝綊宕板璺虹闁圭儤姊圭�氭氨锟界懓澹婇崰鏍箖閹寸偟绡�闁靛骏绲剧涵楣冩煥閺囶亞鐣甸柡浣哥Ч閹垽宕楃亸鏍ㄥ濠电偞鎸婚懝鎯洪妶鍡樻珷妞ゆ柨澧界壕鐓庮熆鐠轰警鐓柛銈囧枔缁辨帡顢欑喊杈╁悑闂佽鍠掗弲婵嬪箯閻樼粯鍤戞い鎺戭槸閺咃綁姊婚崒娆戭槮婵狅拷闁秴鐓曢柛顐犲劚閸屻劌螖閿濆懎鏆欓柛灞诲妽缁绘繃绻濋崒娑樻缂佹儳澧介弲顐︽晸閽樺鐣柛搴″船铻炴繛鎴炵懄濞呯娀鏌ｉ姀鐘冲暈闁绘挻鐩幃姗�鎮欓棃娑楀缂備緤鎷烽悗锝庡墾閹烽鎲撮崟顒傤槶闂佸憡顭嗛崶褏鍘撮梺纭呮彧缁犳垹绮诲☉娆嶄簻闁瑰墽顒茬槐锟犳煕閵夛絽濡烽柟鐤缁辨捇宕掑▎鎴濆闁藉啴浜堕幃妯跨疀閺囩儐鏆紓浣虹帛閻╊垶骞婇悩娲绘晢闁跨喍绮欏绋库槈濮樼偓瀚规繛鍫濈仢閺嬫稒銇勯銏℃暠濞ｅ洤锕獮鏍ㄦ媴閸濄儱骞愰梻浣侯焾閺堫剟鎯岄鎹愬С濞寸姴顑嗛埛鎺懨归敐鍕劅闁绘帡绠栭弻锟犲醇椤愩垹顫紓渚囧枟閻熲晠鐛�ｎ喗鏅滅紓浣股戝▍鍡涙⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�? by changhao
			{
				DayPayManager.getInstance().ProcessDayPay(userid, leaderRoleId);
			}					
		}
		*/
		
		new PCreateTeam(leaderRoleId).submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794433;

	public int getType() {
		return 794433;
	}


	public CCreateTeam() {
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
		if (_o1_ instanceof CCreateTeam) {
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

	public int compareTo(CCreateTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


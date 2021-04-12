
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRequestHaveTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌＄仦绋垮⒉鐎垫澘瀚敓鏂ょ秵娴滄繈顢欓崨顓涙斀闁绘劕寮堕埢鏇灻瑰鍕煉闁挎繄鍋ゅ畷銊э拷娑欘焽閸橆亪姊洪崜鎻掍簼缂佽鍟村畷瀹犮亹閹烘挾鍘介柟鍏兼儗閸犳牕顕ｉ鑺ュ弿濠电姴鍟妵婵嬫煙瀹曞洤浠卞┑锛勫厴瀹曟﹢宕ｉ妷鈺佷粣闂備浇妗ㄧ粈浣虹矓闂堟侗鍤楅柛鏇ㄥ墰缁犻箖鏌ｉ幇闈涘⒒婵炲吋妫冨缁樼瑹閿熻棄顭囪閹广垽骞掗幘鍓侇啎闂佽法鍠嶇划娆撳蓟濞戙垺鍊烽柤纰卞墮閻撶喎鈹戦纭锋敾婵＄偠妫勯悾鐑筋敃閿曪拷缁�瀣亜閹虹偞瀚圭紓浣瑰姈閻╊垰顫忛搹鍦煓婵炲棙鍎抽崜杈╃磽娴ｅ壊鍎愰柛銊ユ健閵嗕礁顫濋懜鍨珳闂佸憡渚楅崹鍗炩枔濠靛鈷掑〒姘搐瀵潡姊婚崟顐㈩伀闁跨喍绮欏褔鎯岄崒姘兼綎婵炲樊浜濋ˉ鍫熺箾閹寸偠澹樻い锝呮惈閳规垿鍩ラ崱妞剧凹缂備礁顑嗙敮鈥愁嚕閺屻儱閱囬柡鍥ュ妽閺呫垽姊虹粙鎸庢拱缂侇喖绉归弫宥堢疀濞戞瑢鎷洪梺鍛婄箓鐎氬嘲危閸忚偐绠惧璺侯儐缁�鍐煛閸涱偄鍔﹂柡宀嬬稻閹棃濡舵惔銏㈢Х婵犵數鍋涘鍫曟晪闁绘挶鍊栨穱濠囶敍濮橆剚鍊悗瑙勬礀瀵墎鎹㈠┑瀣棃婵炴垵宕崜浼存⒑缂佹ê濮囬柨鏇ㄤ邯瀵寮撮悢铏诡啎閻熸粌绉瑰畷顖烆敃閵堝洣绗夋繛瀵稿帶閻°劑鍩涢幒妤佺厱閻忕偛澧介幊鍛亜閿旇偐鐣辨い顓炴健閹鏁鍨儓闁诲氦顫夊ú姗�宕归崹顔炬殾闁靛ň鏅╅弫宥嗙箾閹寸伝顏嗚姳閵夆晜鐓熼幖杈剧磿閻ｎ參鏌涙惔銊ゆ喚妤犵偛顦～婊堟晸娴犲绠栭柕蹇嬪�曠粈鍌炴煕韫囨挸鎮戞い蹇曞枛濮婄粯鎷呴挊澹捇鏌ㄥ顓滀簻闁挎棁顕ф禍鎵拷娈垮枔閸斿秶绮嬮幒鏃撴嫹閿濆骸浜愰柟绋垮暣濮婃椽骞栭悙鎻掑Ф闂佸憡鎼粻鎾愁嚕椤愩倧鎷烽敐搴′簽缂佲槄鎷峰┑鐘垫暩婵挳宕愮紒妯绘珷闁哄洨濮风壕濂告煟濞嗘瑦瀚归梺鎼炲妼閻栫厧顕ｆ繝姘╅柍鍝勫�告禍鐐烘⒑缁嬫寧婀扮紒瀣灴椤㈡棃鏁撻敓锟�
 * @author changhao
 *
 */
public class CRequestHaveTeam extends __CRequestHaveTeam__ {
	@Override
	protected void process() {
		// protocol handle
		
		Long teamid = xtable.Roleid2teamid.select(roleid);
		
		SRequestHaveTeam msg = new SRequestHaveTeam();
		msg.ret = 0;
		if (teamid != null)
		{
			msg.ret = 1;
		}
		
		final long r = gnet.link.Onlines.getInstance().findRoleid(this);
		if (r < 0)
			return;
		
		gnet.link.Onlines.getInstance().send(r, msg);			
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794515;

	public int getType() {
		return 794515;
	}

	public long roleid; // 某个人是否有队 by changhao

	public CRequestHaveTeam() {
	}

	public CRequestHaveTeam(long _roleid_) {
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
		if (_o1_ instanceof CRequestHaveTeam) {
			CRequestHaveTeam _o_ = (CRequestHaveTeam)_o1_;
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

	public int compareTo(CRequestHaveTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


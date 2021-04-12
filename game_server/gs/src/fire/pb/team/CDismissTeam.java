
package fire.pb.team;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CDismissTeam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幗闂侀潧绻堥崺鍕倿閸撗呯＜闁归偊鍙庡▓婊堟煛瀹�锟介崰鏍嵁瀹ュ鏁婄痪鎷岄哺濮ｅ姊绘担渚劸妞ゆ垶鍨归幑銏犫攽閸♀晛娈ㄩ梺鍓插亝濞叉牠鏌嬮崶銊﹀弿婵妫楅獮妤呮煟濠靛洦鈷掔紒杈ㄦ尰閹峰懘鎮剧仦鐣屽闂備胶顭堥敃銉ッ哄┑瀣�堕柛鎰靛枟閳锋垿鏌熺粙鎸庢崳缂佺姵鎹囬弻鐔煎礃閺屻儱寮伴悗娈垮枛閸熷潡鍩㈡惔銊ョ疀妞ゆ挾鍋涙导搴ㄦ⒑閼姐倕鏋戦柣鐔村劤閿熻姤鍑归崳锝呯暦閿濆鏅搁柦妯猴級閺冨牊鍋愰梻鍫熺◥濞岊亪姊虹紒姗嗘畷婵炲弶绻嗛妵鎰媴閸撳弶瀵岄梺闈涚墕濡鏌屽鍫熺厵鐎瑰嫭婢樺Σ濠氭煃鐟欏嫬鐏撮柛銊╃畺閹崇娀顢楅崒婊冨箚闂傚倷绀侀幖顐︽嚐椤栨粎鐭撶憸鐗堝笒閽冪喖鏌曟繛褍绉电�氬綊鏌ㄥ┑鍡涱�楀ù婊勭矌閻ヮ亪鎮欓锟介埢鏇熸叏婵犲啯銇濈�规洦鍋婂畷鐔碱敇閻樻彃蝎缂傚倸鍊搁崐鍝ョ矓瀹曞洨鐭嗗〒姘炬嫹妞ゃ垺宀搁弫鎰緞濡粯娅岄梻浣告啞濞诧箓宕戦崟顖涘�垫い鎾跺剱濞撳鏌曢崼婵囶棡缂侊拷閿熶粙姊洪悷鏉挎毐缂佺粯鍔欓崺銏ゅ箻缂佹ɑ鍎梺闈╁瘜閸橀箖鏁嶅┑瀣拺缂佸瀵у﹢浼存煟閻旀繂鎳愭す鎶界叓閸ャ劎鈾侀柣鎾寸懃椤啰锟斤綆浜妤呮煕濡粯灏﹂柡宀嬬磿娴狅妇鎷犻幓鎺濇綆闂備浇顕栭崰鎾诲磹濠靛棛鏆﹂柟鐑樺灍濡插牊鎱ㄥΔ锟藉Λ鏃傛閿燂拷
 * @author changhao
 *
 */
public class CDismissTeam extends __CDismissTeam__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		Team team = TeamManager.selectTeamByRoleId(roleid);
		if(team == null)
			return;
		if(!team.isTeamLeader(roleid))
			return;
		new PDisMissTeam(team.teamId,PDisMissTeam.REASON_LEADER).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 794487;

	public int getType() {
		return 794487;
	}


	public CDismissTeam() {
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
		if (_o1_ instanceof CDismissTeam) {
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

	public int compareTo(CDismissTeam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


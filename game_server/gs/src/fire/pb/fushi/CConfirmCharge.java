
package fire.pb.fushi;
import gnet.link.Role;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CConfirmCharge__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}
/***
 * 缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱闁靛牆鎳庨顓㈡煛鐏炲墽娲存い銏℃礋閺佹劙宕卞▎妯恍為梻鍌欐祰椤曟牠宕归幎钘夌；闁靛牆顦卞畵渚�鏌″搴ｄ粓閹兼惌鐓堥弫鍡涙煥閻旇袚濞ｅ洤锕ョ缓浠嬪川婵犲嫬骞楁俊鐐�栭幐楣冨闯閵夈儮鏋旀繝濠傚濞堜粙鏌ｉ幇顒夊殶濠⒀屼邯閹筹綁骞囬婊�绨婚梺纭呮閸嬬偟锟芥俺顫夌换婵嗩嚗閺嬵偄锟芥洘绂嶉崷顓犵＜閺夊牄鍔屽ù顔筋殽閻愬弶鍠樻い銏☆焾椤︽娊鏌ｉ敐澶樻缂佽鲸鎸婚幏鍛存惞閻熸壆顐奸梻浣哄劦閺呪晠宕归崼鏇熷仒妞ゆ梹鎷濋幏鐑芥晲鎼存繄鎸夐梺鍝勵儏闁帮綁鎮￠锕�鐐婇柕濠忓椤︺儲绻濆▓鍨灈闁绘牜鍘ч～蹇曠磼濡顎撻梺鍏间航閸庮垶鏁撻挊澶婃殶缂佽鲸甯￠弫鎾绘嚍閵夛箑顎撻柣鐘叉储閸庢彃顪冮懞銉ょ箚闁兼悂娼х欢鐐测攽閻樻彃顏╂鐐差儔濮婄粯鎷呮笟顖涙暞闂佽妞挎禍顏勵潖娴犲绀嬫い鏍ㄦ皑閿涙盯姊虹憴鍕棆濠⒀勵殜瀹曟劙鎮介崨濠勫幈闂佹寧妫侀褔鐛弽顐嫹濞戞瑧绠撴い顏勫暣婵″爼宕橀妸銉ヮ潥缂傚倷娴囬褏锟芥凹鍠栧嵄闁圭増婢樼粻濠氭倵闂堟稒鎲搁柟铏箖缁绘繈鎮介棃娴躲垽鏌涢悤浣镐喊妞ゃ垺妫冨畷濂稿即閻斿弶瀚藉┑鐐舵彧缁茶偐鎷冮敃鍌涘�垮Δ锝呭暞閻撶喐銇勯幒鐐村闂侀潧鐗忛…鍫ユ偩閻戣棄绠ｉ柨鏃囨閿熺晫鍏橀弻锝夊箣閻忔椿浜濈粋宥呂旈崨顔规嫼闂佸憡绻傜�氼厼顔忓┑瀣厱闁绘娅曠亸鐢电磼椤斿墽甯涢柕鍫秮瀹曟﹢鍩￠崘銊ョ闂備礁鎼ˇ顖炴偋閸℃ɑ娅犻柣锝呯灱閻瑥鈹戦悩宕囶暡闁绘挾鍠愮换婵嬪垂椤愩垹顫堥梻渚囧弾閸ㄥ爼寮婚悢纰辨晩缂佹稑顑嗛悾璺侯渻閵堝骸浜濈紒璇茬墦楠炲啫鈻庨幙鍐╂櫌闂佽法鍠嶇划娆撱�侀弮鍫熸櫢闁跨噦鎷�??
 * @author changhao
 *
 */
public class CConfirmCharge extends __CConfirmCharge__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		
		Role role = gnet.link.Onlines.getInstance().find(this);
		if (role == null)
			return;
		new PPayConfirm(roleid, role.getUserid(), this).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812456;

	public int getType() {
		return 812456;
	}

	public int goodid;
	public int goodnum;
	public java.lang.String extra;

	public CConfirmCharge() {
		extra = "";
	}

	public CConfirmCharge(int _goodid_, int _goodnum_, java.lang.String _extra_) {
		this.goodid = _goodid_;
		this.goodnum = _goodnum_;
		this.extra = _extra_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(goodid);
		_os_.marshal(goodnum);
		_os_.marshal(extra, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		goodid = _os_.unmarshal_int();
		goodnum = _os_.unmarshal_int();
		extra = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CConfirmCharge) {
			CConfirmCharge _o_ = (CConfirmCharge)_o1_;
			if (goodid != _o_.goodid) return false;
			if (goodnum != _o_.goodnum) return false;
			if (!extra.equals(_o_.extra)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += goodid;
		_h_ += goodnum;
		_h_ += extra.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(goodid).append(",");
		_sb_.append(goodnum).append(",");
		_sb_.append("T").append(extra.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


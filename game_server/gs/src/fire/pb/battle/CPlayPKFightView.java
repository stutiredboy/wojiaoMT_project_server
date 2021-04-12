
package fire.pb.battle;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CPlayPKFightView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CPlayPKFightView extends __CPlayPKFightView__ {
	@Override
	protected void process() {
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂備胶濮锋繛锟介柡宀�鍠栧畷婊嗩槾閻㈩垱鐩弻娑欑節閸涱厾鍘紓浣虹帛缁诲牆螞閸愩劉妲堥柛妤冨仜婢瑰牏绱撴担鍝勪壕鐎规洘锕㈤敐鐐村緞閹邦剛鐤勯梺闈涱焾閸庮噣寮ㄦ禒瀣厱闁斥晛鍟崵顒佺箾閼规澘鐓愮紒缁樼〒閿熻姤绋掗…鍥儗婵犲嫮纾界�广儱鎷戦煬顒侇殽閻愭彃鏆欓摶鏍煕濞戝崬鏋涘ù鐘虫そ濮婃椽宕ㄦ繝鍕ㄦ闂佹寧娲╃徊浠嬶綖濠靛鏅濋柛灞剧▓閹锋椽鎮峰鍛暭閻㈩垪鏅涜灋闁硅揪闄勯悡鏇㈢叓閸ャ劍顥栭柤鐗堝椤ㄣ儵鎮欓幓鎺撴缂備礁鍊圭敮鐐烘晸閺傘倗绉甸柛瀣缁傛帒煤椤忓應鎷婚梺绋挎湰濮樸劍鏅跺☉姘辩＜閻庯綆鍋呭畷灞俱亜閵忊剝绀嬮柟顔瑰墲閹柨螣缂佹ɑ婢戦梻鍌欒兌缁垶鏁冮埡鍛獥闁哄稁鍘介崐鍫曞级閸稑濡稿ù婊勭矋閵囧嫰骞囬埡浣哄姶濠碘槅鍨介幏鐑芥⒒娴ｅ搫浠洪柛搴ゅ吹缁骞樺畷鍥ㄦ闂佸壊鍋呭ú锕傚极閸℃褰掓晲閸偅缍堝銈呯箳閸犳牕顫忕紒妯诲闁绘垶锚濞堝矂姊虹�癸附婢樻俊鍧楁煛娓氬洤娅嶉柟顔界懇閹粙鎮介悽闈涘Ъ闂傚倸鍊风粈渚�鎮樺┑瀣垫晞闁告劏鏅濋々鍙夌節婵犲倸顏ュù婊勭矒閺岀喖骞嶉搹顐ｇ彅闂佺粯甯為崕銈嗙┍婵犲洤绠甸柟鐑樻⒒妤旈梻浣告惈閻鎹㈠┑鍡欐殾闁靛ň鏅滈崑瀣煕椤愮喎浜鹃柨鐔诲Г閸旀洟鈥旈崘顔嘉ч幖绮癸拷宕囶唹闂備礁鎲″褰掑垂閻㈠憡鍋╅梺鍨儑闂勫嫰鏌涘☉姗堝伐濞存粍绮撳娲倷椤掑啫顥濋梺绋匡工缂嶅﹤鐣烽幋锕�宸濋悗娑櫱氶幏娲煟閻樺弶鎼愮�殿喖鐖奸獮鎴︽晲閸℃瑧顔曢梺鍛婁緱閸嬪嫰鎮橀崣澶樻闁绘劘灏欑粻濠氭煙椤旂晫鐭掗柟宕囧仱婵＄柉顦叉鐐茬墦濮婄粯鎷呴崨濠冨創濠电偛鐪伴崹钘夌暦濠靛牅娌柣鎰靛墯閻濆嘲顪冮妶鍡欏⒈闁稿鍋ら幃陇绠涘☉娆戝幈闂佸疇妫勫Λ妤呯嵁濡ゅ懏鍊垫慨妯煎亾鐎氾拷
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new PPlayPKFightView(roleid, modeltype, school, levelindex).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793683;

	public int getType() {
		return 793683;
	}

	public int modeltype; // 模块类型
	public int school; // 删选的职业 -1表示全职业
	public int levelindex; // 删选的角色等级区间 0表示全选

	public CPlayPKFightView() {
	}

	public CPlayPKFightView(int _modeltype_, int _school_, int _levelindex_) {
		this.modeltype = _modeltype_;
		this.school = _school_;
		this.levelindex = _levelindex_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(modeltype);
		_os_.marshal(school);
		_os_.marshal(levelindex);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modeltype = _os_.unmarshal_int();
		school = _os_.unmarshal_int();
		levelindex = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CPlayPKFightView) {
			CPlayPKFightView _o_ = (CPlayPKFightView)_o1_;
			if (modeltype != _o_.modeltype) return false;
			if (school != _o_.school) return false;
			if (levelindex != _o_.levelindex) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modeltype;
		_h_ += school;
		_h_ += levelindex;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modeltype).append(",");
		_sb_.append(school).append(",");
		_sb_.append(levelindex).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CPlayPKFightView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = modeltype - _o_.modeltype;
		if (0 != _c_) return _c_;
		_c_ = school - _o_.school;
		if (0 != _c_) return _c_;
		_c_ = levelindex - _o_.levelindex;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


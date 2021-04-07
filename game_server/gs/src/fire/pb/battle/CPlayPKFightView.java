
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
		//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛濠呭煐缁绘繈妫冨☉鍗炲壈缂佺偓宕橀～澶愬箞閵娿儮鏀介柛鈩冨嚬濞艰埖绻涚�涙鐭婄紓宥咃躬楠炲啫螖閸涱喖浠洪梺鍛婄☉閿曪絽顫濋敃鍌涒拺鐟滅増甯╁Λ鎴︽煕韫囨棑鑰挎鐐插暞缁傛帞锟斤綆鍋勬禒娲⒒閸屾氨澧涚紒瀣崌椤㈡洟鎮℃惔妯绘杸闂佺粯锕╅崰鏍倶鏉堛劊浜滄い鎰╁焺濡拷闂佺偨鍎荤粻鎾崇暦閸洦鏁嗗ù锝堫潐椤忕喖姊绘担鐑樺殌闁宦板妿閺侇噣鎮欓悽鐢电劸闂備礁鐏濋鍐╃濠婂嫨浜滈柟鎵虫櫅閻掔儤淇婇幓鎺旂Ш闁哄矉绻濆畷銊╂偋閸偓锟芥劕顪冮妶搴″箲闁告梹鍨甸悾閿嬬附閸涘﹤浜滈梺鐐壘閸婂綊宕戦崨瀛樷拺閻犲洤寮堕幑锝嗙箾閸涱偄鐏叉鐐茬箻閹粓鎳為妷褍骞堥梻浣告惈濞层垽宕濈仦鐐珷妞ゆ牜鍋為悡蹇涙煕閳藉棗骞楅悗姘炬嫹
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


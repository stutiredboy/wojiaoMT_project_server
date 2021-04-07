
package fire.pb.battle.livedie;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveDieBattleRankView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CLiveDieBattleRankView extends __CLiveDieBattleRankView__ {
	@Override
	protected void process() {
		// 闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｆ繝銏＄箓缂嶅﹪骞冮埄鍐╁劅闁挎繂妫欓崰鏍⒒娴ｄ警鐒炬い鎴濆暣瀹曟繈骞嬮敃锟介拑鐔兼煥濠靛棭妲告俊顐ｏ耿閺屾盯鈥﹂幋婵囩彯濠碘槅鍋勯惌鍌氼潖濞差亜宸濆┑鐘插暟閸樹粙姊虹粙鎸庢崳闁轰浇顕ч锝嗙節濮橆厼浜滈梺缁樿壘閻°劎锟芥俺顫夌换娑㈠箣閻愬灚鍣ｉ梺璺ㄥ枔閺咁偊宕戦妶澶屽祦閻庯綆鍠楅崑鎰版煣韫囷絽浜濇い鏂挎喘濮婄粯鎷呯粵瀣秷閻庤娲橀敃銏犵暦濞差亜鍐�妞ゆ挾鍋熼敍娑樷攽閳藉棗鐏ｉ柕鍡楊儔楠炲繘鎮滈懞銉ュ壃闂佸憡绋戦敃銈夘敂閸洘鈷掑ù锝堝Г绾爼鏌涢悩鑼ら柛鎺撳笒閳诲氦绠涢敐鍛吙闂備礁鎼悮顐﹀磿濞差亜鏋侀柛鎰靛枟閻撱儵鏌￠崘銊ワ拷濠氬箺閸屾稐绻嗘い鎰靛墯鐎氾拷?
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new PLiveDieBattleRankView(roleid, modeltype).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793842;

	public int getType() {
		return 793842;
	}

	public int modeltype; // 类型

	public CLiveDieBattleRankView() {
	}

	public CLiveDieBattleRankView(int _modeltype_) {
		this.modeltype = _modeltype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(modeltype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modeltype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CLiveDieBattleRankView) {
			CLiveDieBattleRankView _o_ = (CLiveDieBattleRankView)_o1_;
			if (modeltype != _o_.modeltype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modeltype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modeltype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CLiveDieBattleRankView _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = modeltype - _o_.modeltype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


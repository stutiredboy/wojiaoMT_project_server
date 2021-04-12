
package fire.pb.fushi.redpack;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendRedPackView__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendRedPackView extends __CSendRedPackView__ {
	@Override
	protected void process() {
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤濠�閬嶆晸閻ｅ本鍤�閻庢矮鍗冲畷鎴炵節閸屾﹫鎷烽幒鎾剁瘈婵﹩鍘鹃崢鐢告⒑缂佹ê鐏﹂柨鏇楁櫅閳绘捇寮崒婊咃紲闂佽法鍠撻弲顐︽晸閺傘倗绉甸柛瀣嚇瀹曪綀绠涢弬鍓х畾闂侀潧鐗嗛幏瀣磿閹扮増鍊垫慨姗嗗墰缁夋椽鏌熼绛嬫畼闁瑰弶鎸冲畷鐔碱敆閸屻倖袣缂傚倸鍊搁崐鍝ョ矓閹绢喗鏅濋柕鍫濐槹閸嬧晠鏌ｉ幋锝呅撻柛濠呭吹缁辨帒鈽夊鍡楀壉闂佸搫鎷戠紞浣割潖濞差亝顥堟繛鎴ｄ含閸欐氨绱撴担鍝勑ｉ柛銊ユ健閵嗕線寮崼婵嬪敹闂佸搫娲ㄩ崯鍧楀箯濞差亝鈷戦柛娑橈攻瀹曞嫰鎮樿箛鏃傛噰鐎规洏鍨归埥澶愬閿涘嫬骞堥梺璇插嚱缂嶅棝宕戦崨顓犳殾鐎癸拷閸曨剛鍘甸梺鎯ф禋閸嬪懎鐣峰畝锟介敓鍊燁潐濞叉粓鈥﹂崼锝囦簷濠电偠鎻徊浠嬪箹椤愶妇宓佺�广儱妫旂换鍡涙煟閹板吀绨婚柨鐔诲Г閻楁洝鐏嬫繛杈剧秬閸婅棄鈽夐姀鐘殿槹濡炪倖鐗楀銊┧囬锟藉娲濞戞艾顣哄銈忕細閸楁娊骞冮敓鐘冲亜闁稿繗鍋愰崣鍡椻攽閻樼粯娑ф俊顐ｇ懇钘熼柣妯兼暩绾惧ジ鏌ｅ锟藉褎绂掕閺屻劑鎮㈤崙銈嗗闁绘洑鐒︾紞鍫濃攽閻愭彃绾х紒顔芥尭閻ｉ攱瀵奸弶鎴濆敤濡炪倖鎸荤划锝夊箯闁垮濯撮柤鍙夌箖濮婂綊骞忛崨瀛樺仭闂侇叏璁ｉ幏鐑藉箻閸撲胶锛滈梺缁樺姦閸撴氨娆㈤崣澶堜簻闁挎棁妫勯ˉ瀣煥閻旇袚闁肩懓澧界槐鐐寸節閸パ嗘憰闂侀潧艌閺呮粓宕戦崱娑欑厱閻忕偛澧介埥澶嬨亜韫囥儲瀚�
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid < 0) {
			return;
		}
		new PSendRedPackView(roleid,modeltype,redpackid).submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812532;

	public int getType() {
		return 812532;
	}

	public int modeltype; // 红包类型
	public java.lang.String redpackid; // 红包Id  用来处理分页

	public CSendRedPackView() {
		redpackid = "";
	}

	public CSendRedPackView(int _modeltype_, java.lang.String _redpackid_) {
		this.modeltype = _modeltype_;
		this.redpackid = _redpackid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(modeltype);
		_os_.marshal(redpackid, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modeltype = _os_.unmarshal_int();
		redpackid = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendRedPackView) {
			CSendRedPackView _o_ = (CSendRedPackView)_o1_;
			if (modeltype != _o_.modeltype) return false;
			if (!redpackid.equals(_o_.redpackid)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modeltype;
		_h_ += redpackid.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modeltype).append(",");
		_sb_.append("T").append(redpackid.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


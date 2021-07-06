
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
		//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繝锟介柆宥嗘櫢闁伙絽鏈崵锟介柣搴㈢煯閸楀啿鐣烽幋鐐电瘈闁稿本锕幏鐑藉箳閹惧墎鐦堝┑顔斤供閸橀箖宕㈤悽鍛娾拺缂備焦锚閻忥箓鏌ㄩ弴妤佹珔闁崇粯鎹囧顕�宕掑鍜冪床闂備浇娉曢崰鎾诲疾椤愶附鏅搁柡鍌樺�楃粔鐢告煕鐎ｎ亝鍤囩�规洩缍�缁犳盯寮崜褏鐣鹃梻渚�娼ч悧鍡涘箯鐎ｎ喖纾块柟鎵閸婂灚鎱ㄥ鍡楀缂佸妞介弻鐔碱敊缁涘鐣奸梺鐟板级閹稿啿鐣烽悢纰辨晢闁稿被鍊栬ⅲ缂傚倸鍊搁崐鎼佸磹閸濄儳鐭撻柟缁㈠枟閺呮繈鏌曢崼婵愭Ч闁稿鏅犻弻锝夊箣閿濆憛鎾绘煕婵犲懎鍚圭紒杈ㄥ笒閳藉顫滈崱妤�澹夐梻浣告惈閹锋垹绱炴担鍓叉綎婵炲樊浜濋ˉ鍫熺箾閹达絼鍚柛娆愭皑缁辨挻鎷呴崫鍕戯綁鏌涢妸銉﹀仴闁靛棔绶氬顕�宕煎┑瀣暪闂備礁鎼ú銊╁疮閸ф绠繛宸簼閳锋垿鏌涘☉姗堟敾鐎规洖瀚伴幃妯跨疀閺冨倹鍣伴悗瑙勬磸閸ㄥ綊鍩ユ径鎰潊闁挎稑瀚獮鍫ユ⒑鐠囨彃鍤辩紓宥呮瀹曟垿宕ㄩ鐘虫閻庣櫢鎷烽柛鏇ㄥ墰閸樼敻姊洪幆褎绂嬮柛瀣噹閻ｅ嘲鐣濋敓浠嬫晸閸婄噥娼愭繛鍙夌矒閳ワ箓宕奸敐鍥︾胺婵犵數鍋犻幓顏嗗緤娴犲绠规い鎰跺瀹撲胶锟藉箍鍎卞Λ鏃傛崲閸℃稒鐓熼柟鏉垮悁缁ㄥ鏌ㄩ悢璇残撻柣妤佹礉閻忓绻涙潏鍓хК闁稿﹨妫勯埥澶愬閻樻妲规俊鐐�栭悧妤�顫濋妸鈹у洭顢氶敓钘夘潖濞差亝顥堟繛鎴炶壘椤ｅ搫顪冮妶蹇曠窗闁告濞婇獮鍐晸閻樺啿浜滈梺绋跨箺閸嬫劙宕ｉ崱妞绘斀闁绘绮☉褎淇婇锝囨噰閽樼喖鏌ｅΟ鍏兼毄缁炬儳銈搁弻锝咁潨閿熻棄顭囪缁傛帟顦归柡灞诲姂閹垽宕欓妶鍡楊伓闂佺粯娲戦悞锔剧礊閸績鏀介柣鎰絻缁狙呯磼椤旇姤灏柣锝夋敱鐎靛ジ寮堕幋婵嗘暏婵＄偑鍊栭幐鑽ゅ垝閿濆绠梺鍨儐婵挳鏌ら崣澶岀畺婵﹤缍婇獮蹇涘川鐎涙ê浠梻渚囧弿鐠侊綁骞忛悜钘夌闁告挷鑳堕敍婊堟⒑缂佹ê濮﹂柛鎾存皑濞嗐垽宕ｆ径鍫滅盎闂佹寧妫佸Λ鍕夌�ｎ喗鐓ラ柣鏃囶嚙琚氶梺鑲╂嚀婢х晫妲愰悙瀵哥瘈闁搞儜鍡樻啺闂備線娼ц墝闁哄懏绮撳畷鎴﹀幢濞戞瑧鍘遍柣蹇曞仜婢т粙鍩ユ径瀣ㄤ簻闊洢鍎茬�氾拷
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


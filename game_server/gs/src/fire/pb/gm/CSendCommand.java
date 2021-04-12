
package fire.pb.gm;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendCommand__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendCommand extends __CSendCommand__ {
	@Override
	protected void process() {
		final long gmroleid=gnet.link.Onlines.getInstance().findRoleid(this);
		if (gmroleid < 0)
			return;
		final int userID=((gnet.link.Dispatch)this.getContext()).userid;
		final int localsid=((gnet.link.Dispatch)this.getContext()).linksid;
		GMInteface.execCommand(userID,gmroleid,localsid, cmd);
		//TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕閵堝懎顏柡灞剧洴椤㈡洟鏁愰崱娆欑喘闂備浇娉曢崰鎰板垂濠靛鍊块柨鏃傚亾瀹曞弶绻濋棃娑卞剰缁炬儳鍚嬫穱濠囧Χ閸曨喖鍘℃繛瀛樼矋閻燂妇鎹㈠┑瀣仺闂傚牊绋愬▽顏堟⒑閹肩偛濡块柛鐘崇墪閻ｇ兘骞嬮敃锟界粻鑽ょ磽娴ｈ偂鎴濃枍閵忋倖鈷戦柤鎭掑剭椤忓煻鍥ㄥ閺夋垿妫烽梺浼欑到閻偐澹曢崗绗轰簻闁哄啫娲よ濡炪們鍎遍悧蹇涙晸閸婄噥娼愭繛鍙夛耿瀹曟繂鈻庨幘铏�梺瑙勫劤椤曨參銆呴悜鑺ュ�甸柨婵嗛娴滄劙鏌熷畡閭︾吋婵﹨娅ｇ划娆撳箰鎼淬垺瀚抽梻浣藉吹閸熸瑩宕舵担鍛婂枠闁轰礁鍟村畷鎺戔槈濮橆剙绠ラ梻浣藉吹婵潙鈻旇瀹曘劑顢涢妶鍥ф優缂傚倸鍊搁崐椋庢閿熺姴绐楁俊銈呮噺閸嬶繝鏌嶉崫鍕櫧鐎规挷绶氶幃妤呮晲鎼粹剝鐏嶉梺鍝勬噺缁捇寮婚妶澶婄畳闁圭儤鍨垫慨鏇㈡⒑缂佹绠栭柣妤冨Т椤繒绱掑Ο鑲╂嚌闂佽法鍠曞Λ鍕�﹂崶顏嶆▉婵犫拃鍕疄婵﹥妞藉畷顐﹀礋椤掞拷濞呫倗绱撴笟鍥ф灍闁瑰憡鎮傞幃楣冩倻閽樺宓嗛梺缁樻濞咃綁鎯侀崼銉︹拺闁硅偐鍋涢崝姗�鏌涢弬鍧楀弰鐎规洏鍨介獮鏍ㄦ媴閸忓瀚奸梻浣告啞缁嬫垿鏁冮妶鍡樺弿闁稿瞼鍋為悡鏇㈡煛閸屾稑顕滄繝锟介幍顔剧＜闁稿本姘ㄦ牎闁诲簼绲婚崑鎰版晸閼恒儳鈾佹い顓炴喘瀹曘垽宕归锛勭畾闂佺粯鍔曞Ο濠囧磿韫囨拹鏃堟偐閾忣偄锟芥劗锟借娲忛崹浠嬬嵁濮楋拷椤㈡瑩鎮剧仦钘夌濠电姷鏁搁崑鐐哄垂闂堟稓鏆︽い鎺炴嫹闁宠绉撮濂稿炊闁垮顏堕柣鐔哥懃鐎氼厾绮堥敓鐣岀磽閸屾氨孝闁挎洦浜俊瀛樻媴缁洘鐎婚梺瑙勫劤绾绢參鎮￠幋锔解拺闂傚牊鍐荤槐锟犳煕閺囩偛顣崇痪顓ㄦ嫹闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒�濡介梺绋跨箲缁捇寮诲☉銏╂晝闁挎繂妫涢ˇ銉╂⒑濮瑰洤锟芥宕戦幘鑸靛床婵犻潧娲ㄧ弧锟介梺绋挎湰缁嬫垵鈻嶈濮婂搫煤鐠囨彃绠洪梺鑽ゅ暱閺呯姴顕ｆ繝姘亜闁绘挸娴烽澶愭⒑瑜版帒浜伴柛姗�绠栨俊鎾箛閻楀牃鎷洪梺纭呭亹閸嬫稒淇婇悾宀�纾奸悹鍥皺婢э妇锟芥鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 791433;

	public int getType() {
		return 791433;
	}

	public java.lang.String cmd;

	public CSendCommand() {
		cmd = "";
	}

	public CSendCommand(java.lang.String _cmd_) {
		this.cmd = _cmd_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(cmd, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		cmd = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendCommand) {
			CSendCommand _o_ = (CSendCommand)_o1_;
			if (!cmd.equals(_o_.cmd)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += cmd.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append("T").append(cmd.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


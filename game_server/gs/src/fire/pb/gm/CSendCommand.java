
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
		//TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欙紭闂佽法鍠愰崹婵嬫倿閿旂偓宕叉繝闈涱儏绾惧吋淇婇妶鍕厡濞存粍鐟︾换婵嬫偨闂堟稐娌梺鎼炲妿閸犳牕鐣烽幋锕�绠荤紓浣股戝▍銏ゆ⒑閼恒儍顏埶囨导鏉戦棷闁伙絽鐬肩壕鍏笺亜閺冨洤袚妞ゃ儱鐗忛敓鍊燁潐濞叉﹢宕濆▎鎾虫瀬闁规儳顕々鐑芥倵閿濆骸浜愰柟宄邦煼濮婅櫣绮欓幐搴㈡嫳闂佽崵鍟欓崶浣告喘閺佸啴宕掑☉姘箥闂佽崵濮村▔褔宕ㄩ銈囧惞缂傚倸鍊风欢锟犲窗濡ゅ懏鍋￠柍鍝勬噽瀹撲線鎮楅敐搴℃灍闁哄懏绮撻弻銈夊箒閹烘垵濮曢梺缁樼箖閻楃姴顫忕紒妯肩懝闁跨喕妫勯…鍥樁濠⒀勭箞濮婃椽宕崟顒�娅ょ紓渚囧枟閹告悂鎮鹃悜钘夊嵆闁绘棁娅ｉ惁鍫ユ⒑閹肩偛鍔橀柛鏂块叄瀹曘垽骞栨担鍏夋嫼闂佸憡绋戦敃銈嗘叏閸岀偞鐓曢柡鍌涘濠�鎵磼閸屾氨校閻庝絻鍋愰敓鑺ョ♁椤洭宕㈤崹顐＄箚闁绘劕妯婇崕蹇撐旈悩铏�愮�规洏鍨介獮姗�顢欓悾灞藉箺婵犵數鍋為崹闈涚暦椤掞拷閳诲秴顓奸崶閿嬪閻熸瑥瀚粈锟界紓鍌氱Т閿曨亪濡存担绯曟瀻闁规儳纾悡鎴︽⒑闂堟冻绱￠柛鏇炲绾拷闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸ゅ嫰鏌涢幘鑼妽闁稿繑绮撻弻娑㈩敃閿濆棛顦ラ梺姹囧�楅崑鎾舵崲濠靛洨绡�闁稿本绋戝▍褔姊哄ú璇插箺闁荤啿鏅犲濠氭偄閻撳海顔夐梺褰掑亰閸橀箖濡撮幇鐗堚拺闁硅偐鍋涙俊鐣岀磼鐠囪尙澧︾�殿喖顭锋俊鎼佸煛閸屾矮绨介梻浣侯焾閺堫剛绮欓幋锔绘晜闁跨噦鎷�?
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


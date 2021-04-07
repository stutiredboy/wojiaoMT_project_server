
package fire.pb.npc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqQuestion__ extends mkio.Protocol { }

/** 向NPC请求问题
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CReqQuestion extends __CReqQuestion__ {
	@Override
	protected void process() {
		// protocol handle
		final long	roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (!validate(roleid)) {
			return;
		}
//		final fire.pb.mission.schoolanswerques.PReqQuestion pReq=new fire.pb.mission.schoolanswerques.PReqQuestion(npckey, roleid);
//		pReq.submit();
	}
	protected boolean validate(long roleid) {

		if (roleid < 0)
			return false;
//		if (xtable.Properties.select(roleid).getLevel() < 10)
//			return false;
		// TODO:闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻銊╂偆閸屾稑顏�?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴椤ユ捇鏁撻崐鐕佹綈婵炲弶绻堥敐鐐村緞瀹�锟介惌澶愭煙閻戞ɑ顥栭柟椋庡厴閺佹劖鎯斿┑鍫濆毈婵＄偑鍊戦崕鑼崲閸岀偐锟芥棃宕橀鍢壯囨煕閳╁厾顏堝汲濡や胶绡�婵炲牆鐏濋弸娑欍亜閺囥劌寮鐐茬箺閵囨劙骞掗幘鍏呯盎闂備胶顭堢换鎺楀储瑜旈弫鎾绘偩鐏炵偓姣勯梺姹囧労娴滎亪銆佸锟介幃娆撳级閹寸儐浠紓鍌欒兌閾忓酣宕ｉ崘顏嗕笉闁哄稁鍘奸拑鐔兼煟閺傚灝顥忔俊鎻掔秺楠炴牕菐椤掞拷閻忣噣鏌￠崱姗嗗姃c闂傚倸鍊搁崐鎼佸磹閻戣姤鍊块柨鏇炲�归崕鎴犳喐閻楀牆绗掔紒锟芥径宀嬫嫹閻у憡瀚归梺璺ㄥ枍缁瑩寮幘缁樺殟闁靛鍎卞В鍫熺箾鐎涙鐭岄柛瀣枎鍗遍柟鎵閸婄兘鏌涘┑鍡楊仼缂佹劖绋戦—鍐Χ閸℃瑥顫х紓渚囧枛闁帮綁寮澶嬪�风�瑰壊鍠楃�靛矂姊洪棃娑氬婵☆偅鐟╅崺娑㈠箳濡や胶鍘卞┑鈽嗗灣婵潙螞鎼淬垻顩茬憸鐗堝笚閻撶喐淇婇姘倯闁哄棌鏅濋惀顏堝箚瑜嶉幃鎴︽煏閸パ冾伃鐎殿喕绮欐俊姝岊槾妞ゆ挸銈稿娲箹閻愯鎷烽弽顓熷仭闁冲搫鎳庨拑鐔兼煟閺冨倵鎷￠柡浣革躬閺屾洘绻涢崹顔煎婵犮垼娉涚�氫即寮婚敓鐘叉そ闁告劏鏅涢锟�?
		
		
		return true;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795439;

	public int getType() {
		return 795439;
	}

	public long npckey; // npckey为npc的唯一ID

	public CReqQuestion() {
	}

	public CReqQuestion(long _npckey_) {
		this.npckey = _npckey_;
	}

	public final boolean _validator_() {
		if (npckey < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(npckey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		npckey = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqQuestion) {
			CReqQuestion _o_ = (CReqQuestion)_o1_;
			if (npckey != _o_.npckey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)npckey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(npckey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqQuestion _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


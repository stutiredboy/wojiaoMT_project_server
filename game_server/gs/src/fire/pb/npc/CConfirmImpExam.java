
package fire.pb.npc;

import fire.pb.activity.impexam.PConfirmProc;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CConfirmImpExam__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CConfirmImpExam extends __CConfirmImpExam__ {
	@Override
	protected void process() {
		//闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾粌顤�闂佺顑戠换婵嬪蓟閺囥垹閱囨繝鍨姈鏁堥梻浣虹帛閹告悂宕愰崷顓熷床婵炴垯鍨圭粻濠氭倵闂堟稑顥忛柡浣诡枀tocal闂傚倸鍊搁崐鎼佸磹妞嬪孩顐芥慨姗嗗墻閻掍粙鏌ゆ慨鎰拷鏍拷姘煼閺岋綁寮崒姘粯缂備緤鎷峰璺虹焿閹风兘鎯傞崨濠傤伓闂備礁鎲″ú锕傚磻閸℃稒鍋傞柟杈鹃檮椤ュ﹥銇勯幇鈺佺仾濠㈣泛瀚槐鎺旓拷锝庡亜閻忊晠鏌ｉ妷顔绘捣妞わ箑缍婇弻鈥崇暆閿熶粙宕伴幘缁樻櫢闁伙絽鏈弳鈺傘亜椤撶偟澧曢柡鍡忔櫊濮婄粯鎷呴搹骞匡拷濠囨煛閸涱喚绠栫紒缁樼洴閺佹挻绂掔�ｎ偆鍘搁柣蹇曞仩椤曆囨晸閼恒儳绠炵�殿噮鍋婇獮妯肩磼濡粯顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺冪焼濠㈣埖鍔曠粻鍦磽娴ｈ绶查幖瀛樼矒楠炲繘鎮滈挊澶岊唺闂佺懓鐏濋崯顖涙櫏闂備胶顢婃竟鍫ュ箵椤忓棗绶ら柛褎顨嗛弲顒佺節婵犲倻澧涢柍閿嬪灩缁辨挻鎷呴懖鈩冨灴钘熼柡宥庡幗閻撴瑩鏌涢幋娆忥拷鏍拷姘炬嫹??,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ磵閿熸枻绠撳畷濂稿閳ュ啿绨ラ梻浣稿閸嬩線宕曟潏鈺冪焼濠㈣埖鍔栭崐鍫曟煟閹邦喗鏆╅柛娆愭崌閺岋綁鎮㈢粙璺ㄥ綀闂佸搫鍟悧鍡欑矆閸愨斂浜滈煫鍥ㄦ尰閿涙梻绱掓潏銊у弨婵﹦绮幏鍛存惞閻熸壆顐兼繝纰樻閸嬪懘宕归崸妤冨祦闊洦绋掗弲鎼佹煥閻曞倹瀚�?闂傚倸鍊搁崐椋庣矆娓氾拷楠炲鏁撻悩鑼槷闂佹寧娲栭崐鍝ョ玻濡ゅ懏鐓涚�广儱楠搁獮鏍煕鐏炶濮傞柡灞稿墲瀵板嫮锟斤綆浜濋鍛存偡濠婂懎顣奸悽顖涘笧缁牓宕掗悙瀵稿幈闂婎偄娲﹂懝鐐鐟欏嫮绠鹃柛顐ｇ☉閿熻姤绻傞～蹇涙倻濡顫℃繛瀵稿帶閻°劑顢撻弽顓熲拺缂佸灏呴弨鑽ょ磼鐠囨彃锟藉潡骞冩ィ鍐╁�婚柤鎭掑劜濞呫垽姊虹捄銊ユ珢闁瑰嚖鎷�?.
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid >0){
			new PConfirmProc(roleid, impexamtype, operate).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795459;

	public int getType() {
		return 795459;
	}

	public int impexamtype; // 考试类型
	public byte operate; // 0=愿意  1=放弃参加

	public CConfirmImpExam() {
	}

	public CConfirmImpExam(int _impexamtype_, byte _operate_) {
		this.impexamtype = _impexamtype_;
		this.operate = _operate_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(impexamtype);
		_os_.marshal(operate);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		impexamtype = _os_.unmarshal_int();
		operate = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CConfirmImpExam) {
			CConfirmImpExam _o_ = (CConfirmImpExam)_o1_;
			if (impexamtype != _o_.impexamtype) return false;
			if (operate != _o_.operate) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += impexamtype;
		_h_ += (int)operate;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(impexamtype).append(",");
		_sb_.append(operate).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CConfirmImpExam _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = impexamtype - _o_.impexamtype;
		if (0 != _c_) return _c_;
		_c_ = operate - _o_.operate;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


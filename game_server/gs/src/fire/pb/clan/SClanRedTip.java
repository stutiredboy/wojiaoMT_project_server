
package fire.pb.clan;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __SClanRedTip__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SClanRedTip extends __SClanRedTip__ {
	@Override
	protected void process() {
		// protocol handle
	}

	public static final int TYPE_APPLY=1;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗鎸抽幃娆戞嫚瑜庣�氬湱鎲搁悧鍫濈瑨缁炬儳娼￠弻鐔猴拷鐢殿焾鏍￠梺鍝ュУ閸旀瑩寮婚敐鍛傛棃鏁撴禒瀣亱闁糕剝鐟х粻鏃堟煙閻戞﹩娈曢柣鎾存礋閺屾洘绻涢崹顔煎闂佽法鍠曞Λ鍕�﹂悜鐣屽祦濠㈣埖鍔曠粻鐟懊归敐鍥ㄥ殌濞存粓浜跺娲礈閹绘帊绨肩紓浣筋嚙鐎氫即骞冮悜钘夎摕闁靛鑵归幏铏圭磽娴ｅ壊鍎愭い鎴炵懇瀹曟洖鈽夊Ο蹇曟嚀椤劍鎯斿┑瀣粣闁诲孩顔栭崰娑㈩敋瑜旈崺銉﹀緞閹邦剦娼婇梺缁樕戦悧鎾诲礉瀹ュ桅闁告洦鍨扮猾宥夋煕鐏炴崘澹樺ù鐘筹耿濮婃椽骞庨懞銉︽殸闁汇埄鍨敓鑺ュ墯濞兼牠鏌ｉ幋鐐嗘垶鎱ㄥ鍫熺厵婵炲牆鐏濆▍妯讳繆瀹割喖鏋涙い顏勫暣婵″爼宕卞Δ鍐ф樊婵＄偑鍊х粻鎾愁焽瑜旈、姘舵晲閸℃瑧鐦堝┑顔斤供閸庣敻鍩￠崨顔惧帗闂佸憡绻傜�氼剟鏁撻挊澶嬪暈缂佸倸绉归幃娆撴倻濡攱瀚肩紓鍌欑椤戝棛锟界瑳鍐胯�块柟娈垮枤绾惧ジ鎮楅敐搴′簻闁诲繐鐡ㄩ妵鍕閳╁喚妫冮梺杞扮劍閹瑰洭寮幘缁樻櫢闁跨噦鎷�
	
	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 808517;

	public int getType() {
		return 808517;
	}

	public java.util.HashMap<Integer,Integer> redtips;

	public SClanRedTip() {
		redtips = new java.util.HashMap<Integer,Integer>();
	}

	public SClanRedTip(java.util.HashMap<Integer,Integer> _redtips_) {
		this.redtips = _redtips_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.compact_uint32(redtips.size());
		for (java.util.Map.Entry<Integer, Integer> _e_ : redtips.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			int _v_;
			_v_ = _os_.unmarshal_int();
			redtips.put(_k_, _v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SClanRedTip) {
			SClanRedTip _o_ = (SClanRedTip)_o1_;
			if (!redtips.equals(_o_.redtips)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += redtips.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(redtips).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


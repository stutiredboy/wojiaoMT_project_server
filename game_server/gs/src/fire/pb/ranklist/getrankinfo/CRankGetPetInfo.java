
package fire.pb.ranklist.getrankinfo;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRankGetPetInfo__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏堕柣搴ゎ潐濞插繘宕曢幎鑺ユ櫢闁哄倶鍊楃粔鐢告煕閻樺磭澧卞瑙勬礋瀹曠螖娴ｅ搫骞嶉梻浣筋嚃閸ㄨ櫕鏅跺Δ鍚藉寰勯幇顒傤啇闂佸搫顦伴崺濠囩叕椤掑嫭鐓涢悘鐐额嚙閿熻姤顨婂畷鐗堢節閸パ咁攨闂佺粯鍔曞Ο濠傤焽閼恒儰绻嗛柣鎰典簻閿熻姤鐗犲畷婵嬪箳閺傚灝鐏婂┑鐐叉濞存艾顭囬弽銊х鐎瑰壊鍠曢幉楣冩煛娴ｅ憡顥㈤柡灞诲姂閹垽鎮滃Ο鑽ゅ涧缂傚倷绶￠崰妤�顫忔繝姘櫢濞寸姴顑嗗☉褔鏌熼懞銉х煁缂佸顦鍏煎緞鐎ｎ剙骞嶉梻浣筋嚃閸ㄥ崬顭垮Ο娆炬毐闂傚倷鑳剁划顖炲箰婵犳碍鍋￠柍鍝勬噹閽冪喖鏌ㄥ┑鍡╂Ц缂佺媴缍侀弻锝夊箛椤掍緡妫￠梺鎼炲姀濞夋盯顢氶妷鈺佺妞ゆ牗姘ㄩˇ鏉款渻閵堝棛澧紒瀣崌瀹曘垽骞栨担鍏夋嫼闁荤姵浜介崝宀勫几瀹ュ洨纾兼い鏃傛櫕閹冲洦顨ラ悙璇ц含闁诡喗鐟╁畷顐﹀礋鎼存稑濮傞柡灞诲姂瀵挳顢旈崨顓т紦闂佽瀛╅鏍窗閺嵮岀劷闁炽儲鍓氬鏍ㄧ箾瀹割喕绨婚柟纭呭煐閵囧嫰骞樼捄杞扮捕婵犵鍓濆钘夘潖閾忚鍠嗛柛鏇ㄥ墮閿熻姤鍔楃槐鎺楁偐瀹曞洤鈷屽Δ鐘靛仜濡稒绂掗敃鍌氱鐟滃繘鎯侀崼銉︹拺闁硅偐鍋涢崝姗�鏌涢弬鍧楀弰鐎规洏鍨虹粋鎺旓拷锝庡亐閹锋椽姊婚崒姘卞缂佸鎸婚弲鍫曞即閵忥紕鍘甸梺鍛婂姌鐏忔瑧绮婚懡銈忔嫹鐟欏嫭绀冩繝銏★耿閿濈偛顭ㄩ崼鐔告婵炲濮撮鍛存嫅閻斿吋鐓熼柡鍐ㄥ�甸幏锟犳煛娴ｉ潻韬柡灞炬礃缁绘盯宕归鐓庮潥闂備胶鎳撻崥瀣礉濞嗘挸钃熼柨婵嗩槸缁犲鎮楅棃娑欏暈闁告帗鐩娲传閸曨剚鎷辩紓浣割儐閹歌崵绮嬮幒妤佹櫇闁稿本姘ㄩˇ顓㈡偡濠婂喚妲告い顒�锕俊鎼佸Ψ椤旇棄鐦滈梻渚�娼ч悧鍡椢涘▎鎾村亗闁靛／鍛紲婵犮垼娉涢張顒勫吹閿熻棄顪冮妶搴′簻缂佺粯鍔楅崣鍛渻閵堝懐绠伴柟鍐查叄瀹曟粓顢楅崟顑芥嫼闂佸憡绋戦敃锕傚煡婢舵劖鐓ラ柡鍥敓鑺ョ箞閵嗕線寮崼鐔告闂佽法鍣﹂幏锟�?
 * @author changhao
 *
 */
public class CRankGetPetInfo extends __CRankGetPetInfo__ {
	@Override
	protected void process() {
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		if(infotype == 1){
			new PGetPetData(-1,roleId,roleid, 0).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810258;

	public int getType() {
		return 810258;
	}

	public int roleid; // 角色Id
	public int infotype; // 1=宠物

	public CRankGetPetInfo() {
	}

	public CRankGetPetInfo(int _roleid_, int _infotype_) {
		this.roleid = _roleid_;
		this.infotype = _infotype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(infotype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_int();
		infotype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRankGetPetInfo) {
			CRankGetPetInfo _o_ = (CRankGetPetInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (infotype != _o_.infotype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += roleid;
		_h_ += infotype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(infotype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRankGetPetInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = roleid - _o_.roleid;
		if (0 != _c_) return _c_;
		_c_ = infotype - _o_.infotype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


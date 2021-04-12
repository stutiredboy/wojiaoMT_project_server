
package fire.pb;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetPilotType__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetPilotType extends __CSetPilotType__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return ;
		new mkdb.Procedure()
		{
			protected boolean process() throws Exception {
				final xbean.Properties roleProp = xtable.Properties.get(roleId);
				if (null == roleProp)
					return false;
				roleProp.setPilot(pilottype);
				
				// 闂傚倸鍊搁崐鎼佸磹閹间礁纾瑰瀣捣閻棗銆掑鐐濡ょ姷鍋為悧鐘汇�侀弴姘辩Т闂佹悶鍎洪崜锕傚极閸愵喗鐓ラ柡鍥朵簼鐎氬綊姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繝闈涙川缁★拷闂佺鏈划宀勩�傞搹鍦＝濞撴艾锕ョ�氳绻濋姀锝嗙【妞ゆ垵妫濆畷锝堢疀閺傚墽绠氶梺闈涚墕閹峰宕曢幇鐗堝�垫慨妯块哺閸わ拷闁剧粯鐗犻弻锝咁潨閿熻棄顭囪缁傛帒顭ㄩ崟顏嗙畾濡炪倖鍔х徊璺ㄧ不閻愮鎷峰▓鍨珮闁稿锕悰顔嘉熺涵閿嬪闂傚牊绋戦ˉ蹇旂箾閺夋垵顏柡宀嬬稻閹棃顢涘鍛咃綁姊虹粙娆惧剰婵☆偅绻傞悾鐑藉閵堝懐顔愭繛杈剧到閸樻粓骞忓ú顏呪拺闁告稑锕﹂埥澶愭煥閺囨ê锟芥牠骞堥妸顭戞Ь缂備浇椴哥敮锟犲箖閳哄懎绀冮柤纰卞厸缁辨繈鏌ｆ惔銈庢綈婵炲弶顭囬幑銏ゅ磼閻戝洨绋忓┑鐘绘涧濞诧妇绱為崶顒佺厓闁告繂瀚弸锔剧磼鏉堛劌绲婚柍瑙勫灴閹瑧锟芥稒顭囩粙鍥⒑閸涘﹨澹樻い鎴濐樀楠炲啴鎮滈懞銉︽珕闂佽鍎抽幊蹇曪拷姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷
				fire.log.YYLogger.usrFlgLog(roleId, "E1 : " + pilottype);
				
				return true;
			};
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786543;

	public int getType() {
		return 786543;
	}

	public int pilottype; // 适配引导类型  0新手 1老手

	public CSetPilotType() {
	}

	public CSetPilotType(int _pilottype_) {
		this.pilottype = _pilottype_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(pilottype);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		pilottype = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetPilotType) {
			CSetPilotType _o_ = (CSetPilotType)_o1_;
			if (pilottype != _o_.pilottype) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += pilottype;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(pilottype).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetPilotType _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = pilottype - _o_.pilottype;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


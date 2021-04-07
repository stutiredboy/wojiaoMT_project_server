
package fire.pb;


import fire.pb.buff.BuffConstant;
import fire.pb.common.SCommon;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CAddPointToAttr__ extends mkio.Protocol { }

/** 客户端请求属性加点
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CAddPointToAttr extends __CAddPointToAttr__ {
	@Override
	protected void process() {
		// protocol handle
		
		// TODO: 濠电姷鏁告慨鐑藉极閹间礁纾婚柣鎰惈閸ㄥ倿鏌涢锝嗙缂佺姳鍗抽弻娑樷攽閸曨偄濮㈤梺娲诲幗閹瑰洭寮婚敐澶婄闁挎繂妫Λ鍕磽娓氬﹥瀚归梺绋挎湰缁嬫帡宕ｈ箛鏂剧箚闁靛牆鎷嬮崕鎰版倵濮橆剛绉洪柟顔筋殘閹叉挳宕熼鍌ゆО缂傚倷娴囬褔鎮ч幘鑽ゅ祦闁告劦鍠栭悡娑㈡煕濞戝崬娅樻俊顐㈠暙閳规垿鎮欓弶鎴犱桓濡炪們鍔岄幊鎰版晸閽樺浠涢柣鎾拷鎰佹綎缂備焦蓱婵挳鏌涢敂璇插箺闁煎灝娲娲川婵犲啰鍙嗛梺娲诲墮閵堟悂寮幘缁樺殟闁靛鍎卞В鍫ユ⒑閸濄儱校妞ゃ劌锕悰顕�宕奸妷銉庘晠鏌嶆潪鎷屽厡妞ゆ梹鍔栫换娑欐綇閸撗冨煂闂佺濮ょ划鎾诲箖閻愵剚缍囬柕濞у拋鍟庨梺鍝勵槸閻楀棙鏅堕悾宀�鐭撴い鎺嶉檷娴滄粍銇勯幇鈺佺労婵☆垽鎷烽梻浣烘嚀閸㈣尙鎹㈤幒妤佹櫢闁哄倶鍊楃粔鐢告煥閻斿娼熼柛銊ユ贡缁辩偞绻濋崶褏鐣洪梺鍐叉惈閹冲繘宕愮紒妯圭箚妞ゆ牗绮犻崕鐘绘煥閻旇袚闁告梹鐟ラ～蹇撁洪鍕啇闂佺粯鍔栬ぐ鍐�栭崱娆戠＝濞撴艾娲ら弸鐔兼煟閻旀潙鍔︽い銏″哺閺佹劖寰勭�ｎ偅顏熼梻浣芥硶閸ｏ箓骞忛敓锟�?:濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊块、姘舵晸娴犲宓侀煫鍥ㄧ♁閺呮悂鏌ㄩ悤鍌涘? 闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀缁犵娀鏌熼崜褏甯涢柛瀣ㄥ�濋弻鏇熺箾閸喖顬夐梺鐟板暱閻倸顫忕紒妯诲闁告稑锕ラ崕鎾愁渻閵堝棗鐏ユ繛宸幖閻ｉ攱瀵奸弶鎴犵杸濡炪倖鏌ㄦ晶浠嬫偂閹剧粯鈷戦悹鎭掑妼濞呮劙鏌熼崙銈嗗?
		
		// 闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊瑜滃ù鏍煏婵炵偓娅嗛柛銈呭閺屻倗绮欑捄銊ょ驳濠电偛鎳愭慨鍨┍婵犲洤围闊洦鏌ㄩ鍫曟⒒娴ｉ涓茬紒韫矙閹ê顫濇潏鈺冪暥闂佺粯鏌ㄩ崥瀣疾閹间焦鐓㈡俊顖欒濡叉椽鏌￠崱顓犵暤闁哄本娲樺鍕幢濡崵褰呴梻鍌欑瀹曨剙煤椤撱垹钃熼柨婵嗩槸缁秹鏌ㄩ悢璇残撶紒鍌氱У缁傛帞锟斤綆鍋呭▍銏ゆ⒑閼恒儍顏埪ㄩ敓浠嬫椤掑澧撮柡灞革拷宕囨殕闁跨喍绮欏畷浼村冀椤撴粣鎷锋笟锟藉浠嬵敇瑜庨弲銏ゆ⒑鐠恒劌鏋旈柡鍜佸亰閺佹捇鎳為妷銊ヮ棟闂佹悶鍨洪悡锟犳晲閻愬墎鐤�闁哄倽顕ф禍婵嬫⒑閸涘﹤濮�闁哄懏绻堝畷銏ゅ箹娴ｅ厜鎷洪柣鐘充航閸斿苯鈻嶉幇鐗堢厵闁告垯鍊栫�氾拷?
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId == -1)
			return;
		
		if(fire.pb.buff.Module.existState(roleId, BuffConstant.StateType.STATE_BATTLE_FIGHTER))
			return;

		if (cons < 0 || iq < 0 
				|| str < 0 || agi < 0
				|| endu < 0){
			return;
		}
		if (cons == 0 && iq == 0 && str ==0
				&& agi == 0 && endu == 0)
			return;
		final xbean.Properties prop = xtable.Properties.select(roleId);
		if (null == prop)
			return;
		
		final SCommon cc = RoleConfigManager.getRoleCommonConfig(DataInit.COMMEN_ROLE_ADDPOINT);
		if (prop.getLevel() < Integer.parseInt(cc.getValue()))
			return;
		
		final long sum = cons + str + agi + endu + iq;
		if (sum > prop.getPoint().get(prop.getScheme()))
			return;
		
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸崹楣冨箛娴ｅ湱绋佺紓鍌氬�烽悞锕佹懌闂佸憡鐟ョ换姗�寮婚敐澶婄闁挎繂妫Λ鍕磼閻愵剙鍔ゆい顓犲厴瀵濡搁妷銏℃杸闂佺硶妾ч弲婊呯懅缂傚倸鍊烽懗鑸垫叏妤ｅ啫纾婚柟鎵閺呮悂鏌﹀Ο渚Ш闁伙綆鍙冮弻娑欐償閵堝嫬鎯堥梺璺ㄥ枙婵倝宕欒ぐ鎺戠獥婵ê宕崹婵囩箾閸℃ɑ灏伴柡鍛倐閺屻劑鎮ら崒娑橆伓
		final PAddPointProc addpoint = new PAddPointProc(roleId, this);
		addpoint.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 786444;

	public int getType() {
		return 786444;
	}

	public int cons; // 体质
	public int iq; // 智力
	public int str; // 力量
	public int agi; // 敏捷
	public int endu; // 耐力

	public CAddPointToAttr() {
	}

	public CAddPointToAttr(int _cons_, int _iq_, int _str_, int _agi_, int _endu_) {
		this.cons = _cons_;
		this.iq = _iq_;
		this.str = _str_;
		this.agi = _agi_;
		this.endu = _endu_;
	}

	public final boolean _validator_() {
		if (cons < 0) return false;
		if (iq < 0) return false;
		if (str < 0) return false;
		if (agi < 0) return false;
		if (endu < 0) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(cons);
		_os_.marshal(iq);
		_os_.marshal(str);
		_os_.marshal(agi);
		_os_.marshal(endu);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		cons = _os_.unmarshal_int();
		iq = _os_.unmarshal_int();
		str = _os_.unmarshal_int();
		agi = _os_.unmarshal_int();
		endu = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CAddPointToAttr) {
			CAddPointToAttr _o_ = (CAddPointToAttr)_o1_;
			if (cons != _o_.cons) return false;
			if (iq != _o_.iq) return false;
			if (str != _o_.str) return false;
			if (agi != _o_.agi) return false;
			if (endu != _o_.endu) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += cons;
		_h_ += iq;
		_h_ += str;
		_h_ += agi;
		_h_ += endu;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(cons).append(",");
		_sb_.append(iq).append(",");
		_sb_.append(str).append(",");
		_sb_.append(agi).append(",");
		_sb_.append(endu).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CAddPointToAttr _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = cons - _o_.cons;
		if (0 != _c_) return _c_;
		_c_ = iq - _o_.iq;
		if (0 != _c_) return _c_;
		_c_ = str - _o_.str;
		if (0 != _c_) return _c_;
		_c_ = agi - _o_.agi;
		if (0 != _c_) return _c_;
		_c_ = endu - _o_.endu;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


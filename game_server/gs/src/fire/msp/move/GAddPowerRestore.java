
package fire.msp.move;

import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddPowerRestore__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddPowerRestore extends __GAddPowerRestore__ {
	@Override
	protected void process() {
		// protocol handle
		Role role = RoleManager.getInstance().getRoleByID(roleid);
		if(role == null)
		{
			fire.pb.scene.SceneManager.logger.error("GAddPowerRestore闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝栭梻浣芥硶閸犲秶鍒掑▎鎾崇畺闁秆勵殢閺佸鏌ㄩ悢鍓佺煓鐎殿喖顭烽幃銏ゆ偂鎼达綆妲跺┑鐐舵彧缁插潡宕曢妶澶婄疅婵鎷锋慨濠勫劋濞碱亪骞嶉鍛滈梻浣瑰濞诧附绂嶉鍕靛殨濠电姵纰嶉崑鍕煕韫囨艾浜归柛鏃傚厴濮婃椽骞愭惔銏⑩敍闂佸綊顥撻崗姗�寮婚敍鍕舵嫹閿濆骸澧柡瀣灴閺屾洟宕惰椤忣厽銇勯姀鈩冪闁轰焦鍔欏畷鍗炩枎濡亶鐐电磽閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牗绮嶅畷鏌ユ煕椤愶絿绠ラ柛銈嗘礋閺岀喓绱掗姀鐘崇亶闂佺顑嗛崹鍧楀蓟閵娾晜鍋勭紓浣癸供濡嫰鏌ч懡銈呬槐闁哄备鍓濆鍕拷锝庡亝閺嗗繐鈹戦悩鍨毄濠殿喚鍏樺顐﹀川婵犲啫寮块梺缁樺灱濡嫰寮告笟锟介弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈鏍″┑鐘灪椤牓鎮橀崘顔解拺闁圭娴风粻鎾绘煙閸愭煡鍙勭�殿喗濞婇幃娆撴倻濡厧骞堥梺纭呭閹活亞妲愰弴鐔告珡闂傚倷绀侀幖顐︽儗婢跺瞼绀婂ù锝呭閸ゆ洖霉閻樺樊鍎忛幆鐔兼⒑闂堟侗妾ч梻鍕閳绘捇銆傞幒妤佲拻闁稿本鑹鹃敓鑺ユ倐瀹曟劙骞栨担鍝ワ紮闂佸綊妫跨粈浣哄瑜版帗鐓熼柟杈剧到琚氶梺绋匡工濞硷繝寮婚妸鈺佺睄闁跨喍绮欓獮蹇撯攽鐎ｎ亞顔嗘俊鐐差儏濞撮绮婚弮锟界换娑㈠箣閻愬棙鍨垮畷铏鐎ｎ偆鍘藉銈嗘尵閸犳捇骞婇崶顒佺厸鐎癸拷閿熶粙宕伴幇顒夌劷闊洦绋戠粻姘辨喐韫囨拹锝夋晲婢跺鎷洪柡澶屽仦婢瑰棝藝閿曞倹鐓ラ柡鍥ュ妺闁垳锟芥鍠栭…鐑藉箖閵忋倖鍋傞幖杈剧秵閸炰粙姊绘担鍛婅础闁稿簺鍊濆畷褰掑垂椤愶絽寮跨紓渚婄磿椤掋兙=" + roleid);
			return;
		}
		if(role.getJumpRole() == null)
			return;
		if(powerrestore > 0)
			role.getJumpRole().setPowerRestore(powerrestore);
		else
			role.getJumpRole().setPowerRestore(0);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724930;

	public int getType() {
		return 724930;
	}

	public long roleid;
	public int powerrestore; // 如果为-1，则为直接清除气力储备

	public GAddPowerRestore() {
	}

	public GAddPowerRestore(long _roleid_, int _powerrestore_) {
		this.roleid = _roleid_;
		this.powerrestore = _powerrestore_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(powerrestore);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		powerrestore = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddPowerRestore) {
			GAddPowerRestore _o_ = (GAddPowerRestore)_o1_;
			if (roleid != _o_.roleid) return false;
			if (powerrestore != _o_.powerrestore) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += powerrestore;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(powerrestore).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddPowerRestore _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(roleid - _o_.roleid);
		if (0 != _c_) return _c_;
		_c_ = powerrestore - _o_.powerrestore;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


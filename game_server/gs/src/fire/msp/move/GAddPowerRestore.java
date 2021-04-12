
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
			fire.pb.scene.SceneManager.logger.error("GAddPowerRestore闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠嶇划娆撳箖閸ф鏁嬮柨鐔剁矙瀵鎮㈤悡搴ｎ槶婵炶揪绲块崕銈夊箟濮楋拷濮婄儤娼幍顕呮М闂佹寧娲︽禍顏勵嚕婵犳碍鍋勯柛蹇氬亹閸旂兘姊洪幐搴㈢┛闁归鍏橀弻锛勶拷锝庡墮閺嬫垿鏌曢崶褍顏い銏℃礋閺佹劙宕卞▎妯恍炵紓鍌氬�烽懗鍓佸垝椤栨粍宕查柛顐ｇ箥閸ゆ洟鏌熺紒銏犳灍闁稿鍨块弻銊╂偄缂佹﹩妫勯柧鑽ゅ仱閺屸剝寰勭�ｎ偅鏆忓┑鐘垫暩婵兘寮崨濠冨弿闁绘垼妫勯弸渚�鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫校婵犮垺顭堥悘鍐⒑閹稿海绠撻柟鍐查叄瀵娊鎮欓悜妯煎幈闁硅壈鎻槐鏇熸櫏闂備礁鎼惌澶岀礊娴ｅ壊鍤曞ù鐘差儏鎯熼梺闈涱檧闂勫嫬鈻撻。鎺楁⒒閸屾艾锟芥悂宕愰幖浣哥９闁归棿绀佺壕褰掓煟閹达絽袚闁稿﹤娼￠弻銊╁籍閿熶粙骞忓┑瀣濡炲娴风粻鏃�绻涢幋鐐嗘垿宕虫禒瀣厽妞ゆ挾鍠撻幊鍥煛瀹�锟介崰鎰焽韫囨稑绠氱憸蹇撐ｉ敐澶嬧拺閺夌偞澹嗛ˇ锕傛煥閺囥劋閭�殿喖顭烽幃銏ゆ偂鎼达綆鍞介梻浣告贡閸庛倝宕归崹顐ｅ弿缂侊紕顒ヾ=" + roleid);
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


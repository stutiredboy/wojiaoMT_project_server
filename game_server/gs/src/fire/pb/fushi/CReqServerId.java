
package fire.pb.fushi;

import gnet.link.Onlines;
import fire.pb.main.ConfigManager;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CReqServerId__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡灞稿墲瀵板嫮锟斤綆浜濋鍛攽閻愬弶鈻曞ù婊冪埣瀵偊宕堕浣哄帾闂婎偄娲﹀ú鏍ф毄闂備礁鎲＄换鍐�冩繝鍌ゆ綎缂備焦顭囬悷褰掓煕閵夋垵鍠氬鑽ょ磽閸屾瑧顦︽い锕備憾瀵偆鎷犻懠顒佹闂佸搫娲㈤崹鍦不閿濆棛绡�闁靛骏绱曠粻鎾剁磽瀹ュ拑宸ラ柣锝呭槻铻栭柛娑卞幘椤ρ囨⒑閸忚偐銈撮柡鍛箞閸┿垼绠涘☉娆屾嫼闁荤姴娲﹁ぐ鍐敆閵忋倖鐓犵憸鐗堝笧閻ｆ椽鎸婂┑瀣拺妞ゆ帪鎷风紒澶屾暬瀵煡骞栨担鍦弮濠碘槅鍨拃锕�危濞差亝鐓熼柨婵嗛瀵噣鏌＄仦鍓р檨闁诡垱妫冩俊鎼佸Χ閸℃鐏撳┑掳鍊楁慨鐑藉磻濞戙垺鏅濋柕澶嗘櫅缁犳岸鏌￠崘銊у闁跨喐鏋荤粻鎾荤嵁閹烘绫嶉柛灞绢殕閿涘牓姊婚崒姘拷椋庢濮橆剦鐒界憸鏃堝箖瑜斿畷鍗灻归弶鎸庡閻庝絻鍋愰敓鑺ョ♁閿氬ù婊勵殜濮婃椽宕崟顒�鍋嶉梺鎼炲妽濡炰粙骞冮敓鐘参ㄩ柨鏂垮⒔閻﹀牓姊婚崒姘卞缂佸甯¤棢婵犲﹤鐗婇悡銉╂煟閺冨浂鍤欑悮姘舵⒑鐠団�虫灈闁稿﹥鎮傞、姘舵晲婢跺﹨鎽曢梺闈涱檧缁犳垿宕滈锟藉铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷
 * @author changhao
 *
 */
public class CReqServerId extends __CReqServerId__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if(roleid > 0){
			SRspServerId send = new SRspServerId();
			send.serverid = ConfigManager.getGsZoneId();
			send.flag = flag;
			Onlines.getInstance().send(roleid, send);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 812472;

	public int getType() {
		return 812472;
	}

	public int flag;

	public CReqServerId() {
	}

	public CReqServerId(int _flag_) {
		this.flag = _flag_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(flag);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		flag = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CReqServerId) {
			CReqServerId _o_ = (CReqServerId)_o1_;
			if (flag != _o_.flag) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += flag;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(flag).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CReqServerId _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = flag - _o_.flag;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.game;

import fire.log.LogManager;
import fire.pb.SReturnLogin;
import fire.pb.fushi.DayPayManager;
import fire.pb.fushi.Module;
import mkdb.Procedure;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CNoOperationKick__ extends mkio.Protocol { }

/** 踢掉长时间不操作的玩家
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CNoOperationKick extends __CNoOperationKick__ {
	@Override
	protected void process() {
		// protocol handle
		
		long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		new mkdb.Procedure() {

			@Override
			protected boolean process() throws Exception {
				
				xbean.Properties prop = xtable.Properties.select(roleId);
//				if (prop.getLevel() > 20) {
//					return false;
//				}
				
				boolean ok = false;
				if (Module.GetPayServiceType() == 1 ? true : false) {
					ok = DayPayManager.getInstance().CheckDayPay(roleId, DayPayManager.adddaypatime);
				} else {
					xbean.YbNums ybNums = xtable.Fushinum.select(prop.getUserid());
					int norpresentNum = 0;
					if (ybNums != null) {
						xbean.YbNum ybNum = ybNums.getRoleyb().get(roleId);
						if (ybNum != null) 
							norpresentNum = ybNum.getNopresentnum();
					}
					ok = norpresentNum == 0 ? false : true;
				}
				if (!ok) {// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂磋閿熸枻绠撻、妤佹媴娓氼垱閿ゆ繝寰锋澘锟芥洟骞婃惔銊ュ瀭闁稿瞼鍋為悡锝夌叓閸ャ劌鍤繛鍏煎姍閺岋繝宕卞Ο鑲╃厜闂佸搫琚崝鎴﹀箖閵堝纾兼繛鎴烇供娴硷拷
					Procedure.psend(roleId, new SReturnLogin());
					StringBuilder sbd = new StringBuilder();
					sbd.append("闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼幍顔碱暭闁稿绻濋弻銊╁籍閸屾矮澹曢梺鍝勬缁捇寮婚敐澶婃闁圭瀛╅崰鎰版⒑缂佹绠氭繛澶嬬洴閸╃偤骞嬮敃锟介悞娲煕閹扳晛濡介柡鍡樜揺=").append(roleId).append(", 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾捐鈹戦悩鍙夋悙缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煟閹惧鎳呯紒杈ㄥ笧閿熸枻缍嗘禍鐐寸閵徛颁簻闁瑰搫顑呴悘顏堟煏閸パ冾伂闁绘柧绶氶弻娑㈠Ψ閿濆懎唯闂佺懓鍢查…宄邦潖閾忓湱鐭欓柟绋垮閹疯京绱撴笟鍥ф灈婵炴潙鍢查锝堫樄闁轰焦鎹囬幃鎯х暆閿熺晫澹曢挊澹濆綊鏁愰崼顐㈡異濠电偛鐗婂褰掑Φ閸曨垱鏅滈柣鎰靛墯濮ｅ牓姊虹紒妯圭繁闁哥姵鐗犻崺銏℃償閵堝洨鏉搁梺鎸庣箓閹冲繘宕愰鐐粹拻濞达絽鎲￠崯鐐寸箾鐠囇呯暤鐎规洏鍨洪妶锝夊礃閵娧冨箳闂備礁鎼ú銏ゅ垂濞差亜鐓曢柟鐑樺灍閺�浠嬫煟濡灝鐨洪柛鎴濇贡缁辨帡濡歌閺嗩剟鏌＄仦鍓ф创濠碘剝鎮傛俊鎼佹晜鐠佸啿鎽嬮梻鍌欐祰濡椼劎娆㈤敓鐘查棷闁挎繂顦弸渚�鏌熼幆褜鍤熸い鈺冨厴閹鏁愭惔鈥茬敖闂佸憡鐟ュΛ婵嗩潖閾忚宕夐柕濞垮劜閻濄垽姊洪悷鏉挎闁瑰嚖鎷�?");
					LogManager.logger.error(sbd.toString());
				}
				return true;
			}
		
		}.submit();
		
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 810375;

	public int getType() {
		return 810375;
	}


	public CNoOperationKick() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CNoOperationKick) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CNoOperationKick _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


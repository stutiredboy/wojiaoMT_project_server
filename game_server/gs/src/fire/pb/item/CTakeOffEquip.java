
package fire.pb.item;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CTakeOffEquip__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CTakeOffEquip extends __CTakeOffEquip__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid( this );
		if (roleId < 0)
			return;
		
		if (fire.pb.buff.Module.existState(roleId, fire.pb.buff.BuffConstant.StateType.STATE_BATTLE_FIGHTER)) {
			fire.pb.talk.MessageMgr.sendMsgNotify(roleId, 131451, null);
			return;
		}
		// protocol handle
		new mkdb.Procedure(){

			@Override
			protected boolean process() throws Exception {
				final Equip srcbag = new Equip(roleId, false);
				final ItemMaps dstbag = new Pack(roleId, false);
				
				ItemBase bi = srcbag.TransOut(equipkey, -1, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劖銇勯弴鐐搭棡閻庢艾缍婇弻娑㈠箛閵婏附鐝栫紓浣叉閹风兘姊绘担瑙勫仩闁稿孩绮撳畷銊╊敊閹冨強闂傚倸鍊搁崐宄懊归崶顒�纾婚柟鐗堟緲閻撴洟鏌涢鐘插姎缂侊拷閸喓绠鹃柟瀵稿仦閻ㄦ垵鈽夐幘宕囆ч柡宀嬬節瀹曟﹢濡歌椤わ拷闂備胶绮幐璇裁哄Ο鍏煎床婵炴垯鍨圭粻锝嗙節闂堟稒顥￠柛鈺冨仱濮婅櫣鎷犻弻銉у椽缂備胶绮换鍫濐嚕鐠囨祴妲堥柕蹇婏拷鍏呯盎缂傚倷绀侀鍫濃枖閺囩喎顕辩�癸拷閸曨兘鎷洪梺鍛婄箓鐎氼厼锕㈤幍顔剧＜閻庯綆鍋勯悘鎾煕閳瑰灝鍔滅�垫澘瀚伴獮鍥敆閸屻倖鏁ら梻鍌欒兌缁垶宕濋弽顑句汗闁告劦鍣弫鍡樼節婵犲倸顏紒鈽呮嫹闁诲海鏁告晶妤呮倶濮樿泛纾归柕鍫濐槸閸氬綊鎮楅敐搴℃灍闁绘挻鐟╅弻娑㈠箣濞嗗骏鎷烽弽顐嫹濮樼偓瀚�");
				if (bi == null)
					return false;
				ItemBase dstitem;
				java.util.List<Integer> freepos = dstbag.getFreepos();
				if (freepos.size() > 0) {
					posinpack = freepos.get(0);
				} else {
					return false;
				}
				if (posinpack != -1)
					dstitem = dstbag.getItemByPos(posinpack);
				else
					dstitem = null;
				if (dstitem != null) {
					return false;
				}
				if (!dstbag.TransIn(bi, posinpack))
					return false;
				if (bi instanceof EquipItem)
					srcbag.onUnequip((EquipItem) bi);
				
				return true;
			}
			
		}.submit();
	}
	

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787446;

	public int getType() {
		return 787446;
	}

	public int equipkey;
	public int posinpack;

	public CTakeOffEquip() {
	}

	public CTakeOffEquip(int _equipkey_, int _posinpack_) {
		this.equipkey = _equipkey_;
		this.posinpack = _posinpack_;
	}

	public final boolean _validator_() {
		if (equipkey < 1) return false;
		if (posinpack < -1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(equipkey);
		_os_.marshal(posinpack);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		equipkey = _os_.unmarshal_int();
		posinpack = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CTakeOffEquip) {
			CTakeOffEquip _o_ = (CTakeOffEquip)_o1_;
			if (equipkey != _o_.equipkey) return false;
			if (posinpack != _o_.posinpack) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += equipkey;
		_h_ += posinpack;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(equipkey).append(",");
		_sb_.append(posinpack).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CTakeOffEquip _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = equipkey - _o_.equipkey;
		if (0 != _c_) return _c_;
		_c_ = posinpack - _o_.posinpack;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


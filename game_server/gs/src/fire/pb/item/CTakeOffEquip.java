
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
				
				ItemBase bi = srcbag.TransOut(equipkey, -1, "闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姈閵囧嫰寮撮悙鎼！闁诲孩鑹剧紞濠囧蓟濞戙垹绠涢柕濠忛檮閻濇牜绱撴担鍙夘潐闁归鍏樺缁樻媴鐟欏嫬浠╅梺绋垮缁挸鐣烽妸鈺婃晩闁诡垎鍐ㄥ挤闂傚倸鍊搁崐鎼佸磹瀹勬噴褰掑炊椤掞拷绾惧鏌熼悧鍫熺凡闁绘挻娲熼弻娑㈩敃閻樻彃濮庣紓渚婃嫹闁割偆鍠撶粻楣冩煙鐎电浠﹂柣銊﹀灥閳藉骞樺畷鍥喲囨煛瀹�瀣瘈鐎规洘锕㈡俊姝岊槻妞ゃ倧鎷烽梻鍌欒兌缁垶骞愮拠瑁佸搫螣閸忕厧搴婂┑鐐村灟閸ㄥ湱绮婚敐鍡欑瘈闂傚牊绋掗ˉ锟犳煕閳哄啫浠辨慨濠呮閹风娀寮婚妷褍妞界紓鍌欒兌缁垳鎹㈤崼婵愬殨閻犲洦绁村Σ鍫ユ煏韫囧鎷烽崗鍛泿缂傚倸鍊风粈渚�顢栭崼婵冩灃闁哄洨鍠庨杈╋拷鐧告嫹闁告洦鍏橀幏娲⒑閸涘﹦绠撻悗姘煎幖閿曘垽骞嶉鍓э紲闁诲函缍嗛崑鍕倶閹绢喗鐓曢柍鐟扮仢閸旀粎锟藉灚婢樼�氫即鐛崶顒夋晢闁稿被鍊栭弫銈夋⒒閸屾瑨鍏岀紒顕呭灦瀹曟繈寮介鍙ユ睏闂佸憡鍔﹂崳顕�寮崱妯肩瘈濠电姴鍊搁顐ょ磼閳藉懏瀚归梺璇叉捣閺佸憡鏅跺Δ鍛�舵慨妯挎硾绾惧綊鏌曢崼婵愭Ц闁告艾缍婇幃妤呮晲鎼粹剝鐏嶉梺缁樻尰閻熲晠寮诲☉銏犵婵炲棗楠忛幏鐑藉冀椤愵剚瀚规慨妯煎亾鐎氾拷");
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


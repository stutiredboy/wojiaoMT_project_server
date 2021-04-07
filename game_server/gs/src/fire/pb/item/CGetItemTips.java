
package fire.pb.item;
import com.locojoy.base.Octets;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGetItemTips__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetItemTips extends __CGetItemTips__ {
	@Override
	protected void process() {
		// protocol handle
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		ItemMaps bag = Module.getInstance().getItemMaps(roleId, packid, true);
		if (bag == null)
			return;
		final ItemBase item = bag.getItem(keyinpack);
		if (item == null) {
			return;
		}		

		Octets tips = item.getTips();
		if (tips == null) {
			Module.logger.error("闂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弮锟介幏婵嬪箯妞嬪海绠旀繛鎴炆戞径鍕煕鐎ｅ墎绡�闁哄本娲樼换娑㈡倷椤掍胶褰熼梻浣芥〃缁�渚�顢栨径鎰摕闁哄洢鍨归柋鍥ㄧ節閸偄濮堥弫鍫ユ⒒娴ｄ警鐒惧Δ鐘叉憸缁棁銇愰幒鎴ｆ憰濠电偞鍨崹鍦不婵犳碍鐓ｉ煫鍥风到娴滀粙鏌ㄩ悢缁橆棄婵炶偐鏅ｉ梻鍌氬�搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌℃径瀣婵炲樊浜堕弫鍥煏韫囨洖啸闁告繃顨婂缁樼瑹閸パ冾潻缂備礁顦遍弫璇茬暦閺囥垹绠ｉ柨鏃傛櫕閸欏棝姊虹紒妯荤闁稿﹤婀遍敓鑺ョ啲閹凤拷,闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛鎾茬閸ㄦ繃銇勯弽顐粶濡楀懎鈹戦悙鏉戠仧闁搞劌缍婇幃鍧楁倷椤掑倻顔曢梺鐟扮摠閻熴儵鎮橀埡鍐＜闁绘ê寮剁拹锟犳煙閸欏鍊愮�殿噮鍓涢幑鍕Ω閿旂瓔鍟庨梻鍌欐祰濞夋洟宕抽敃鍌氱闁跨噦鎷�?:" + item.getName());
			return;
		}
				
		SGetItemTips send = new SGetItemTips(packid, keyinpack, tips);
		gnet.link.Onlines.getInstance().sendResponse(this, send);
		
		if(item instanceof EquipItem)
		{
			PEnhancementTimeout p = new PEnhancementTimeout(roleId);
			p.submit();				
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 787453;

	public int getType() {
		return 787453;
	}

	public int packid;
	public int keyinpack;

	public CGetItemTips() {
	}

	public CGetItemTips(int _packid_, int _keyinpack_) {
		this.packid = _packid_;
		this.keyinpack = _keyinpack_;
	}

	public final boolean _validator_() {
		if (packid < 1) return false;
		if (keyinpack < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(packid);
		_os_.marshal(keyinpack);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		packid = _os_.unmarshal_int();
		keyinpack = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetItemTips) {
			CGetItemTips _o_ = (CGetItemTips)_o1_;
			if (packid != _o_.packid) return false;
			if (keyinpack != _o_.keyinpack) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += packid;
		_h_ += keyinpack;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(packid).append(",");
		_sb_.append(keyinpack).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetItemTips _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = packid - _o_.packid;
		if (0 != _c_) return _c_;
		_c_ = keyinpack - _o_.keyinpack;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


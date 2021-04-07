
package fire.msp.move;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyMapPetInfo__ extends mkio.Protocol { }

/** GS 向 地图模块 发送消息， 通知展示宠物的信息, 并通知周围玩家
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyMapPetInfo extends __GNotifyMapPetInfo__ {
	@Override
	protected void process() {
		// protocol handle
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if (role == null) return;
		if(null == role.getScene()) return;
		if (showpetinfo.petid != 0){
			final fire.pb.scene.movable.ScenePet showpet = 
				fire.pb.scene.movable.God.createPet(showpetinfo.petkey, showpetinfo.petname, showpetinfo.petid,  showpetinfo.color, showpetinfo.bodysize,showpetinfo.showeffect);
			
			if(showpet.checkAllTheSame(role.getShowPet()))
				return;//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倗鍋撶换娑㈠箣濞嗗繒浠肩紓浣哄Х閸庛倗鎹㈠┑鍥╃瘈闁稿本绮岄·锟介梻浣侯焾椤戝啴宕愬┑瀣摕闁绘柨鎲＄紞鍥煕閹炬鎳忓▓鍝ョ磽閸屾瑧绛忛柟椋庡厴閺屾盯鍩勯崘鍓у姺缂備胶濞�缁犳牠寮诲☉銏犵労闁告劗鍋撻悾鐑芥⒑閸︻厽顏熺紓宥勭窔瀵鏁愭径瀣簻闂佸憡绺块崕鎶芥偪閸曨垱鈷戦柛婵嗗閻掕法绱掔紒妯肩畵闁伙絿鍏橀獮鍡涙焽閿斿彨顒勬⒒娴ｅ憡璐￠柡鍜佸亝缁绘盯鏁撴禒瀣厸閻忕偤娼婚幏宄扮暦閸ャ劍鐣烽梺璇插嚱缂嶅棝宕戦崟顖ｆ晜闁跨噦鎷�
			role.setShowPet(showpet);
		}else{
			if(role.getShowPet() == null)
				return;//闂傚倸鍊搁崐鎼佸磹閻戣姤鍤勯柛顐ｆ礀绾惧潡鏌ｉ姀銏╃劸闁汇倗鍋撶换娑㈠箣濞嗗繒浠肩紓浣哄Х閸庛倗鎹㈠┑鍥╃瘈闁稿本绮岄·锟介梻浣侯焾椤戝啴宕愬┑瀣摕闁绘柨鎲＄紞鍥煕閹炬鎳忓▓鍝ョ磽閸屾瑧绛忛柟椋庡厴閺屾盯鍩勯崘鍓у姺缂備胶濞�缁犳牠寮诲☉銏犵労闁告劗鍋撻悾鐑芥⒑閸︻厽顏熺紓宥勭窔瀵鏁愭径瀣簻闂佸憡绺块崕鎶芥偪閸曨垱鈷戦柛婵嗗閻掕法绱掔紒妯肩畵闁伙絿鍏橀獮鍡涙焽閿斿彨顒勬⒒娴ｅ憡璐￠柡鍜佸亝缁绘盯鏁撴禒瀣厸閻忕偤娼婚幏宄扮暦閸ャ劍鐣烽梺璇插嚱缂嶅棝宕戦崟顖ｆ晜闁跨噦鎷�
			role.setShowPet(null);
		}
		
		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔芥尭閻ｉ攱绺界粙鍨祮闂佺粯鏌ㄩ幖顐︾嵁閸喓绡�闁汇垽娼ф禒锕傛煕閵娿儳鍩ｉ柟顔ㄥ洤鍗抽柣鏂垮缁犳岸姊虹粙璺ㄧ闁稿鍔楃划缁樸偅閸愨晝鍘电紓鍌欑劍閿氱紒妤佸哺閺屾稓锟斤絻鍔岄崝锕傛煛瀹�锟介崰鏍�佸▎鎾村癄濠㈣泛妫欓悘鍡涙⒒娴ｈ櫣銆婇柡鍌欑窔瀹曟粌鈹戦崼銏㈢暥闂佺粯姊婚崢褔鎮欐繝鍕枑閹肩补妾ч弸宥夋煥閻曞倹瀚�
		final fire.pb.pet.SShowPetAround send = new fire.pb.pet.SShowPetAround();
		send.roleid = roleid;
		send.showpetid = showpetinfo.petid;
		send.showpetkey = (int)showpetinfo.petkey;
		send.showpetname = showpetinfo.petname;
		send.colour = (byte)showpetinfo.color;
		send.size = (byte)showpetinfo.bodysize;
		send.showeffect = (byte)showpetinfo.showeffect;
		role.sendWhoSeeMeAndMe(send);	
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 724906;

	public int getType() {
		return 724906;
	}

	public long roleid;
	public fire.msp.showpetinfo showpetinfo;

	public GNotifyMapPetInfo() {
		showpetinfo = new fire.msp.showpetinfo();
	}

	public GNotifyMapPetInfo(long _roleid_, fire.msp.showpetinfo _showpetinfo_) {
		this.roleid = _roleid_;
		this.showpetinfo = _showpetinfo_;
	}

	public final boolean _validator_() {
		if (roleid <= 0) return false;
		if (!showpetinfo._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(showpetinfo);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		showpetinfo.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyMapPetInfo) {
			GNotifyMapPetInfo _o_ = (GNotifyMapPetInfo)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!showpetinfo.equals(_o_.showpetinfo)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += showpetinfo.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(showpetinfo).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


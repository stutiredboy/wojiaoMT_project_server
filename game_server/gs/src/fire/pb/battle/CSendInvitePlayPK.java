
package fire.pb.battle;

import fire.pb.map.GridPos;
import fire.pb.map.Role;
import fire.pb.map.RoleManager;
import fire.pb.scene.AreaInfo;
import fire.pb.util.MapUtil;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSendInvitePlayPK__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSendInvitePlayPK extends __CSendInvitePlayPK__ {
	public static final int PVP_LEVEL=20;//PVP缂傚倸鍊搁崐鎼佸磹閹间礁纾归柣鎴ｅГ閸婂潡鏌ㄩ弬鍨挃闁活厽鐟╅弻鐔封枎闄囬褍煤閿曪拷椤洩绠涘☉鎺炴嫹閿曞倸绠ｉ柣鎴濇閺咁剟姊婚崒娆戝妽闁诡喖鐖煎畷鏇灻洪鍕槶濠殿喗顭囬顒佸緞閹邦厽娅㈤梺璺ㄥ櫐閹凤拷?婵犵數濮烽弫鍛婃叏閻㈠壊鏁婇柡宥庡幖闂傤垱銇勯弽顐粶缂佺媭鍨堕弻銊╂偆閸屾稑顏�?
	@Override
	protected void process() {
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (-1 == hostid){
			return;
		}
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null)
			return ;
		//闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囬梻浣规偠閸庢椽宕滃▎鎴濐棜鐟滅増甯楅悡娑氾拷骞垮劚妤犳悂鐛弽顓熺參闁告劦浜滈弸娑㈡煛鐏炲墽娲村┑锛勫厴椤㈡瑩鎮℃惔顔芥祰闂傚倷鑳堕…鍫燁殽閸濄儻鎷峰☉鎺撴珚濠碉紕鏁诲畷鐔碱敍濮樿京娼夐梻浣侯焾閺堫剛绮欓幒妤佸仧妞ゅ繐鐗婇埛鎴︽煙閼测晛浠滃┑鈥炽偢閺屾洟宕奸悢绋匡拷鎰拷娈垮枛椤兘寮幘缁樺亹闁肩⒈鍓﹀Σ褰掓⒒閸屾艾锟芥悂鎮ф繝鍕煓闁规儳顕々鐑芥煃閸濆嫭鍣洪柍閿嬪灴閹綊宕堕敐蹇斿鐎规洖娲ｉ幋椋庣磽閸屾瑦绁伴柛鈺傜墵閹虫繃銈ｉ崘鈺佷患闂佺粯鍨兼慨銈夊磹婵犳碍鐓㈡俊顖滃皑缁辨岸鏌嶉崫鍕櫤闁绘挶鍎甸弻锟犲礃閵婏附鎮欓悶姘哺濮婅櫣绮欓崸妤婏拷妤冪磼婢跺本鍤�妞ゎ偄绻愮叅妞ゅ繐鎷嬪Λ鍐⒑閸愬弶鎯堥柛濠冩倐椤㈡棃鏁撻敓锟�?
		Role gRole = RoleManager.getInstance().getRoleByID(guestroleid);
		if (gRole == null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 145001, null);
			return ;
		}
		GridPos gpos = gRole.getPos().toGridPos();
		AreaInfo gareaInfo = MapUtil.getAreaInfo(hostRole.getMapId(), gpos.getX(), gpos.getY());
		if(gareaInfo==null){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162065, null);
			return ;
		}
		if(!gareaInfo.isQiecuoArea()){
			fire.pb.talk.MessageMgr.sendMsgNotify(hostid, 162065, null);
			return ;
		}
		
		
		new PSendInvitePlayPK(hostid,guestroleid).submit();
		return;
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 793564;

	public int getType() {
		return 793564;
	}

	public long guestroleid; // 被邀请角色ID

	public CSendInvitePlayPK() {
	}

	public CSendInvitePlayPK(long _guestroleid_) {
		this.guestroleid = _guestroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(guestroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		guestroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSendInvitePlayPK) {
			CSendInvitePlayPK _o_ = (CSendInvitePlayPK)_o1_;
			if (guestroleid != _o_.guestroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)guestroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(guestroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSendInvitePlayPK _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(guestroleid - _o_.guestroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


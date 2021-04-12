
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
	public static final int PVP_LEVEL=20;//PVP缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻锝夊箣閿濆憛鎾绘煕婵犲倹鍋ラ柡灞诲姂瀵剟宕归瑙勫瘱闂備焦妞块崢浠嬫偡閳哄懎钃熼柣鏂跨殱閺嬪酣姊介崶顒夋晪鐟滃秶鍙呴梺鎸庢穿閹烽攱銇勯鐐寸┛缂佺姵绋戦埥澶愬箳閻愭潙顏堕梺鎸庢礀閸婂摜绮婚敐澶嬬厽闁瑰瓨绻冮ˉ婊堟煛閸滀礁澧存慨濠傤煼瀹曟帒鈻庨幋婵嗩瀴闂備浇顕栭崰鏍偉閻撳海鏆﹂柡鍥╀紳濞差亶鏁傞柛鏇ㄥ弾濡茶埖绻濆▓鍨灍妞ゎ厼娲、鏃堫敆娴ｅ摜绐為梺褰掑亰閸樿棄鈻嶉姀銈嗏拺閻犳亽鍔屽▍鎰版煙閸戙倖瀚�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ姀鐘差棌闁轰礁锕弻鈥愁吋鎼粹�崇闂傚倸鍋嗛崹閬嶅Φ閸曨垰鍐�妞ゆ劦婢�缁墎绱撴担鍝勵�岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?
	@Override
	protected void process() {
		final long hostid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (-1 == hostid){
			return;
		}
		Role hostRole = RoleManager.getInstance().getRoleByID(hostid);
		if (hostRole == null)
			return ;
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋佺�广儱顦粈瀣亜閹哄秶鍔嶆い鏂挎喘濮婄粯鎷呯憴鍕哗闂佺瀛╁钘夌暦濠婂啠鏋庨柟瀛樼箥濡粓鎮峰鍛暭閻㈩垱顨婇幃鈥斥槈濮樼偓瀚规鐐茬仢閸旀艾螖閻樿櫕鍊愰柣娑卞櫍瀵粙顢橀悢鍝勫籍闂備礁鎲￠崝锔界濠婂牆鍑犳繛鎴欏灪閻撴盯鎮橀悙鎻掆挃婵炲弶娼欓埞鎴︽晬閸曨偄骞嬪銈冨灪閻熲晠骞冮埄鍐╁劅妞ゆ棁濮ょ粊浼存⒒閸屾艾锟界兘鎳楅崼鏇楋拷锕傚醇閻曚焦顔旈梺鍛婄缚閸庡骞忓畡鎵虫闁圭儤鎸婚悵姘節绾板纾块柡浣筋嚙閻ｇ兘鎮㈢喊杈ㄦ櫖濠殿喗顭堟禍顒�顭囨径鎰拻濞达絼璀﹂悞楣冩煛閸偄澧扮紒顔界懇楠炴帒螖娴ｉ晲鎴锋俊鐐�曠换鎰版偋婵犲洤鐓曢柟杈鹃檮閻撴瑩鏌ゅù瀣珔濞寸姵绮岄埞鎴﹀灳閻愯棄浠梺鍝勬湰濞茬喎鐣锋總鍛婂亜缂佸灏呴幏鐑藉箛椤曞棙瀚规繛鍫濈仢閺嬫稒銇勯鐘插幋鐎殿噮鍋婇獮妯肩磼濡桨姹楅梻浣藉亹閳峰牓宕滈敃锟藉嵄鐟滅増甯楅埛鎺楁煕鐏炴崘澹橀柨鐔诲Г閹倿骞冭缁绘繈宕熼鐘靛幆闂備浇顫夐崕鎶筋敋椤撯偓锟藉懘鎮滈懞銉у帗闂佸憡绻傜�氼參宕冲ú顏呯厓闂佸灝顑呴悘鎾煙椤旇偐绉虹�规洖鐖奸弫鎰疀閺傛浼撻柣搴ゎ潐濞叉牕煤閿濆绠ｅ瀣捣绾句粙鏌涚仦鍓ф噭缂佷椒鍗抽弻娑㈠煛閸屾粌鈷岄梺纭呮珪缁诲啴濡堕敐澶婄闁宠桨妞掗幃锝夋⒒娴ｈ櫣甯涢柛銊ュ悑閹便劑濡舵径濠勶紮婵犵數濮电喊宥夋偂閵忊�茬箚妞ゆ牗绮岄惃鎴犵磼鏉堛劌鍝洪柡灞界Ч瀹曨偊宕熼锟藉▍銈夋⒑缂佹ɑ灏柛搴ｆ暬瀵鏁撻悩鑼槰闂侀潧顭梽鍕箖濞嗘挻鍋犳慨姗嗗幖閸濈儤鎱ㄦ繝鍛仩缂侇喗鐟╁畷绋课旀繝蹇斿婵°倕鍟扮壕鐓庮熆鐠虹儤婀伴柛銈忔嫹婵＄偑鍊ら崑鍕崲閹邦喖寮叉俊鐐�曠换鎰板箯鐎ｎ�盯宕橀瑙ｆ嫼闂佸憡鍔曞鍫曞箚閸儲鐓曞┑鐘插暞閸婃劖銇勯姀鈩冾棃闁轰焦鎹囬弫鎾绘晸閿燂拷?
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


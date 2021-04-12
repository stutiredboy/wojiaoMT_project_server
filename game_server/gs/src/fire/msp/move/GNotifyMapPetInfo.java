
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
				return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅絾绻涢崱妤冪濞寸姾鍋愮槐鎾存媴閸濆嫅銉╂煕鎼存稑锟芥骞戦姀鐘斀闁搞儮鏅濋惁鍫ユ⒑缁嬫寧婀扮紒顔肩焸璺柨鐔剁矙濮婄粯鎷呮笟顖滃姼濡炪倖鍨甸崯鏉戠暦閹邦兘鏀介悗锝庝海閹芥洟姊虹紒妯荤叆闁硅绱曠槐鐐哄炊椤掍胶鍘遍梺鍦亾椤ㄥ懘骞婅箛鎾灁闁告縿鍎崇壕浠嬫煕鐏炲墽鎳呯紒娑樼箻閺岀喐顦版惔鈥冲箣闂佸搫鏈惄顖炲春閸曨垰绀冮柛鎾楀啫楔缂傚倸鍊烽懗鑸电箾閿熺晫绱掗悩宕囧⒌鐎殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘缁樺仼闁绘垼濮ら埛鎴︽煕閿旇骞楁い蹇曞枔缁辨挸顓奸崟顓犵崲閻庢鍠栭…鐑藉极閹邦厼绶為悗锝庝簷缁ㄥ姊绘担鍛婂暈缂佸搫娼″畷鏇㈠箮閼恒儱浠鹃梺鍛婃处閸ㄩ亶鍩涢幋锔界厱婵犻潧妫楅顐︽煟閹烘洘纭剁紒杈ㄥ笧缁辨帒螣閼测晝鏆ら梻浣风串缁插潡宕楀锟介悰顕�宕卞☉娆戝姺闂佹寧鏌ㄨぐ銊╊敆閸曨兘鎷绘繛杈剧到閹诧紕鎷归敓鐘崇厸闁告粈绀佹禍婵堢磼缂佹娲撮柡浣规尰缁傛帞锟斤綆鍋嗛崢鎼佹煟韫囨洖浠辨繛鐓庮煼楠炲繐鐣￠幍顔芥闂佹悶鍎崝宥夋偩閻戣姤鈷戦悹鍥ㄥ絻閸よ京绱撳鍛棦鐎规洘鍨垮畷鐔碱敍閿濆棙娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�
			role.setShowPet(showpet);
		}else{
			if(role.getShowPet() == null)
				return;//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬缂佺偓鍎冲锟犲蓟閿濆顫呴柕蹇婃櫇閸旀悂姊哄Ч鍥э拷妤呭磻閹捐埖宕叉繛鎴欏灩缁狅絾绻涢崱妤冪濞寸姾鍋愮槐鎾存媴閸濆嫅銉╂煕鎼存稑锟芥骞戦姀鐘斀闁搞儮鏅濋惁鍫ユ⒑缁嬫寧婀扮紒顔肩焸璺柨鐔剁矙濮婄粯鎷呮笟顖滃姼濡炪倖鍨甸崯鏉戠暦閹邦兘鏀介悗锝庝海閹芥洟姊虹紒妯荤叆闁硅绱曠槐鐐哄炊椤掍胶鍘遍梺鍦亾椤ㄥ懘骞婅箛鎾灁闁告縿鍎崇壕浠嬫煕鐏炲墽鎳呯紒娑樼箻閺岀喐顦版惔鈥冲箣闂佸搫鏈惄顖炲春閸曨垰绀冮柛鎾楀啫楔缂傚倸鍊烽懗鑸电箾閿熺晫绱掗悩宕囧⒌鐎殿喛顕ч埥澶愬閻橀潧濮堕梻浣告啞閸旀宕戦幘缁樺仼闁绘垼濮ら埛鎴︽煕閿旇骞楁い蹇曞枔缁辨挸顓奸崟顓犵崲閻庢鍠栭…鐑藉极閹邦厼绶為悗锝庝簷缁ㄥ姊绘担鍛婂暈缂佸搫娼″畷鏇㈠箮閼恒儱浠鹃梺鍛婃处閸ㄩ亶鍩涢幋锔界厱婵犻潧妫楅顐︽煟閹烘洘纭剁紒杈ㄥ笧缁辨帒螣閼测晝鏆ら梻浣风串缁插潡宕楀锟介悰顕�宕卞☉娆戝姺闂佹寧鏌ㄨぐ銊╊敆閸曨兘鎷绘繛杈剧到閹诧紕鎷归敓鐘崇厸闁告粈绀佹禍婵堢磼缂佹娲撮柡浣规尰缁傛帞锟斤綆鍋嗛崢鎼佹煟韫囨洖浠辨繛鐓庮煼楠炲繐鐣￠幍顔芥闂佹悶鍎崝宥夋偩閻戣姤鈷戦悹鍥ㄥ絻閸よ京绱撳鍛棦鐎规洘鍨垮畷鐔碱敍閿濆棙娅嗛梻浣芥硶閸ｏ箓骞忛敓锟�
			role.setShowPet(null);
		}
		
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顖氱处闁汇垹顭峰缁樻媴閻熼偊鍤嬪┑鐐插级閻楃姴鐣烽幇鏉跨濞达絿顭堥悗顓㈡⒑缁嬭法鐏遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柟闂寸绾惧鏌ｅΟ娆惧殭缂佺姴鐏氶妵鍕疀閹炬惌妫ょ紓渚婃嫹濠电姴娲﹂悡銉╂煟閺冨浂鍤欑悮姘辩磽娴ｈ櫣甯涢柣鈺婂灠閻ｇ兘顢旈崼婵堫槰濡炪倕绻愰弻濠傤煥閸啿鎷虹紒缁㈠幖閹冲繘鎮甸鍡欑＜妞ゆ棁濮ょ亸顓㈡煟閿濆鏁辩紒铏规櫕缁瑩宕归鑲┿偖闂傚倷鑳剁划顖炲蓟閵娾晛绠规い鎰跺瀹撲線鏌涢銈呮灁缂佲槄鎷烽梻浣圭湽閸ㄨ棄顭囪缁傛帡鏁冮崒娑氬幈闂侀潧顭堥崕鎶藉春閿濆鐓欐い鏂诲妼濞层倝宕￠幎鑺ョ厽闁哄倸鐏濋。宕囩磼閻樺啿鍝烘慨濠呮缁瑧鎹勯妸褜鍟堥梻浣侯焾椤戝棝宕濆Δ鍐ㄥ灊缂備焦菧閸嬪懘鏌涢幇銊︽珖闁告鏁哥槐鎾诲磼濞嗘垵濡介梺鎸庢皑缁辨帒螖娴ｇ鎽甸梺鍝勬湰缁嬫捇鏁撻弬銈囩シ闁告柨鐭傚畷婵嬫晝閸屾稓鍘搁悗鐧告嫹闁跨喍绮欏畷浼村冀椤撴粣鎷锋担绯曟瀻闁圭偓娼欓惂鍕節閵忥絾纭炬俊顐ｇ懇閹﹢宕卞☉娆屾嫽婵炶揪缍�濞咃綁濡存繝鍥ㄧ厸闁稿本鐟х粣鏃傦拷瑙勬礃缁矂鍩為幋锕�閱囬柕蹇嬪灮閺嗐儵姊绘担铏瑰笡婵﹤顭峰畷銏ｎ樄闁诡喗鐟︾换婵嬪礋椤掞拷閺嬫垿鏌熼懖鈺勊夋俊鐙欏洤鍑犵�广儱顦伴悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�
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


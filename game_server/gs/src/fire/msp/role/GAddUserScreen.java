
package fire.msp.role;

import fire.pb.main.ConfigManager;
import fire.pb.map.MapConfig;
import fire.pb.move.SAddUserScreen;
import fire.pb.scene.manager.RoleManager;
import fire.pb.scene.movable.Role;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GAddUserScreen__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GAddUserScreen extends __GAddUserScreen__ {
	@Override
	protected void process() {
		// protocol handle
		Role reqRole = RoleManager.getInstance().getRoleByID(reqroleid);
		Role addRole = RoleManager.getInstance().getRoleByID(addroleid);
		if(reqRole == null || addRole == null)
			return;
		if(reqRole.getScene().getSceneID() != addRole.getScene().getSceneID())
			return;//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁炬儳顭烽弻锝夊箛椤掍焦鍎撻梺鎼炲妼閸婂潡寮诲☉銏╂晝闁挎繂妫涢ˇ銉х磽娴ｅ搫小闁告濞婂璇测槈濡攱鏂�闂佸憡娲﹂崑鍕叏閵忋倖鈷戞繛鑼额嚙楠炴鏌熼悷鐗堝枠鐎殿喖顭烽崺鍕礃閵娧呯嵁闂佽鍑界紞鍡樼閻愬搫鍌ㄩ柟鎵閳锋垿鏌ゅù瀣珔妞わ絽銈搁幃妤冪箔濞戞ɑ鎼愬鍛存⒑閸涘﹥澶勯柛鐘冲哺閹潡鏁撴禒瀣拺閻熸瑥瀚粈鍐╃箾婢跺娲撮柕鍡楀�哥叅妞ゅ繐鎳愰崢浠嬫⒑缂佹ɑ鐓ラ柟鑺ョ矒楠炲﹪寮撮悩鐢碉紲闂佺粯顭堝▍鏇炵暦鐏炵虎娈介柣鎰絻閺嗘瑦銇勯锝囩煉闁轰焦鎸荤粋鎺旓拷锝庝簽閻ｅ搫鈹戦悙鍙夘棡闁搞劏娉涢悾閿嬪緞閹邦剛楠囬梺缁樺姍濞佳囥�傛總鍛婄厽妞ゆ劑鍨荤粻鎻捛庨崶褝韬柟顔界懇椤㈡棃宕熼懜闈涱伓闂佸搫娲ㄦ慨闈涚暦閸欏绻嗘い鏍ㄧ箓閸氳銇勯埡鍌滃弨闁哄本鐩、鏇㈡晲閸℃瑯妲梻浣芥閸熶即宕伴幇顔藉床婵炴垯鍨圭粻锝嗙箾閸℃绠冲ù鐘荤畺濮婃椽宕崟顒�娅ょ紓渚囧枟閹瑰洤顕ｆ繝姘亜缁炬媽椴搁弲顒勬⒑缁洖澧叉い銊ユ嚇瀵啿鈻庨幇鈺�绨诲銈嗗釜閹烽攱淇婇锝囨噮闁瑰箍鍨归埞鎴狅拷锝庡亜娴犳椽姊婚崒姘卞缂佸鍔楅崚鎺楀醇閺囩啿鎷洪梺鑽ゅ枑濠㈡﹢寮虫潏鈺冪＜缂備焦锕懓鎸庮殽閻愭彃鏆ｉ柟顔界矒閹崇偤濡烽敂鐣屽絾闂傚倷绀侀幉锟犲箰閸℃稑宸濇い鏍ㄨ壘缁犳艾鈹戦悩鍨毄濠殿喕鍗冲畷褰掓偂鎼存ɑ鐏冨┑鐐村灟閸ㄦ椽寮插┑瀣叆闁哄洨鍋涢敓鐣岊焾鏁堥柡灞诲劜閸婄敻鏌ㄥ┑鍡涱�楀ù婊勭箞閺屾稑鈻庤箛鏇狀唹缂備胶绮换鍫澪涢崘銊㈡婵﹩鍏橀幏顏堟⒒娴ｅ摜绉烘い銉︽崌瀹曟顫滈敓钘夘嚕椤愶箑绠荤紓浣股戝▍銏ゆ⒑鐠恒劌娅愰柟鍑ゆ嫹
		MapConfig mapcfg = ConfigManager.getInstance().getConf(MapConfig.class).get(reqRole.getScene().getMapID());
		if(mapcfg == null)
			return;
		if(mapcfg.getVisibletype() == 1)//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯顢曢敐鍡欘槬闂佺琚崝搴ㄥ箟閹间礁绫嶉柛顐ｆ儕閵夆晜鐓曢柟鑸妽濞呭棝鏌涙惔锝呮灈闁哄本娲濈粻娑氾拷锝庝簽閸旀潙鈹戦悙璺虹毢妞ゎ厼鐗撻崺鐐哄箣閿旇棄浜归柣鐘叉厂閸愌呯煑闂傚倷鑳堕幊鎾诲疮鐠恒劍宕查柟鎵閸嬧晠鏌ｉ幋锝嗩棄缂佺姷鏁婚弻鐔煎传閸曢潧鍔�闂佸綊顥撻崗姗�鐛幒妤�绠ｆい鎾跺枎閸忓﹪姊绘担铏瑰笡闁告棑绠撳畷婊冣枎閹垮啯鏅滈梺鍓插亝濞叉﹢鎮￠悢鐓庣婵烇綆鍓欓敓濮愬�曢…鍥箛椤撶姷顔曞┑鐐存綑椤戝棗鈻嶉崶鈺冪＜閺夊牃鏅涙禒锔剧磼濡ゅ啫鏋涢柡浣规尰缁傛帞锟斤綆锟筋厹鍎遍湁闁挎繂娲ㄩ妴濠冧繆閹绘帞澧涘ǎ鍥э躬椤㈡盯鎮欑�涙ɑ娈搁梻浣告惈閸嬪﹪骞忛悜鑺モ拻闁稿本鐟чˇ锔剧磽瀹ュ拑韬�规洘鍨剁换婵嬪炊瑜嶉崑宥夋⒑閸涘﹥瀵欓柛娑卞灣閸樼娀姊绘担鑺ョ《闁革綇绠撻獮蹇涙晸閿燂拷
			return;
		if(mapcfg.getVisibletype() == 2)//闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞妞ゆ帒顦伴弲顏堟偡濠婂啰绠绘鐐村灴婵拷闁靛牆鎳愰悿锟芥俊鐐�栧Λ浣肝涢崟顒佸劅濠电姴娲﹂埛鎴犳喐閻楀牆绗掑ù婊�鍗抽弻娑㈡偐閹颁焦鐣堕梺浼欑悼閸忔ê鐣烽敐鍡楃窞濠㈣泛鐬奸悾鐐繆閻愵亜锟芥牠鎮уΔ鍛仭鐟滃繒鍒掗弮鍫濋敜婵°倓鑳堕崣鍡椻攽閻樼粯娑ф俊顐幖鍗辩憸鐗堝笚閻撴盯鏌涘☉鍗炴灓缂佺姷鍋ら弻锛勪沪閸撗侊拷鎺懨归悪鍛暤闁诡喗鐟╅、妤呭磼濞戝崬鎮嬮梻鍌氬�烽懗鍓佸垝椤栫偛绠板┑鐘宠壘閸ㄥ倿鏌ｉ姀銏€�婇柨鐔诲Г濡啫鐣峰锟介、娆撳床婢诡垰娲﹂悡鏇㈡煃閳轰礁鏆熼柟鍐插暞閵囧嫰顢曟惔鈩冨櫧缁炬崘妫勯湁闁挎繂娲ㄩ幗鍌炴煕閵堝棛鎳呯紒杈ㄥ笚瀵板嫮锟斤綆鍋勯崬澶愭⒑閻愯棄鍔电紒鐘虫尭閻ｇ兘宕奸弴銊︽櫌婵炶揪缍�椤顢旈悢鍏尖拻濞达綀濮ょ涵鍫曟煕閿濆繒鐣垫鐐茬箻閺佹捇鏁撻敓锟�
		{
			final long reqteamid = reqRole.getTeamID();
			final long addteamid = addRole.getTeamID();
			if(reqteamid == 0 || addteamid == 0 || reqteamid != addteamid)
				return;
		}
		
		SAddUserScreen sadduser = new SAddUserScreen();
		sadduser.rolelist.add(addRole.getRoleBasic());
		gnet.link.Onlines.getInstance().send(reqroleid, sadduser);
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 730909;

	public int getType() {
		return 730909;
	}

	public long reqroleid;
	public long addroleid;

	public GAddUserScreen() {
	}

	public GAddUserScreen(long _reqroleid_, long _addroleid_) {
		this.reqroleid = _reqroleid_;
		this.addroleid = _addroleid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(reqroleid);
		_os_.marshal(addroleid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		reqroleid = _os_.unmarshal_long();
		addroleid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GAddUserScreen) {
			GAddUserScreen _o_ = (GAddUserScreen)_o1_;
			if (reqroleid != _o_.reqroleid) return false;
			if (addroleid != _o_.addroleid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)reqroleid;
		_h_ += (int)addroleid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(reqroleid).append(",");
		_sb_.append(addroleid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GAddUserScreen _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(reqroleid - _o_.reqroleid);
		if (0 != _c_) return _c_;
		_c_ = Long.signum(addroleid - _o_.addroleid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


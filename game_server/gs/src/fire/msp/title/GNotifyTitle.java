
package fire.msp.title;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GNotifyTitle__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GNotifyTitle extends __GNotifyTitle__ {
	@Override
	protected void process() {
		final fire.pb.scene.movable.Role role = fire.pb.scene.manager.RoleManager.getInstance().getRoleByID(roleid);
		if(null == role) return;
		if(null == role.getScene()) return;
		role.setMyTitleInfo(title);
		// 闂傚倸鍊搁崐椋庣矆娓氾拷楠炴牠顢曚綅閸ヮ剦鏁冮柨鏇嫹闁汇倗鍋撶换婵囩節閸屾侗妫￠梺鐟板暱閻倸顫忛搹瑙勫珰闁哄被鍎洪敓鑺ヮ殜閺岋綀绠涢弮锟介惃鎴︽煕閹烘挸娴鐐疵悾鐑藉炊閵婏富鍟庨梻鍌欑窔濞佳呮崲閸儱纾归柡宥庡幖绾惧鏌涢弴銊ョ仭闁绘挻娲樼换娑㈠箣閻戝洤鍙曢梻濠庡墻閸撴碍绌辨繝鍥х鐟滃秹宕㈢�涙ɑ鍙忓┑鐘插�归幆鍫ュ极閸儲鐓曢柕澶嬪灥閸犳岸鎮楅幎鑺モ拺閻犲洦褰冮銏ゆ煕閹存繄绉虹�规洏鍨藉畷婊嗩槻闁搞劍绻傞埞鎴︽偐閸欏顦╅梺鍝勬噺缁捇寮诲☉銏犵婵°倧鎷烽柟铏姍瀹曘垽顢涢悙绮规嫼闁荤姴娲﹁ぐ鍐吹鏉堚晝纾界�广儱鎳忛ˉ鐐电磼閸屾氨孝妞ゎ厹鍔戝畷濂告偄閸戙倖瀚归柣銏犳啞閸嬶綁鏌涢妷锝呭闁靛牆鐡ㄦ穱濠囧箵閹烘柨鈪甸梺鍝勭灱閸犳牠鐛崱姘兼Щ闂佽偐顭堢紞濠囧蓟閵娾晜鍋勯悹鍥ㄧ暙閹剧粯鐓熸俊銈勭劍缁�瀣煃閵夘垳鐣电�规洖鐖奸、妤佸緞鐎ｎ偅鐝┑鐘愁問閸犳鏁冮銈呯筏濡わ絽鍠涚紞鏍拷骞垮劚椤︿即鍩涢幋锔界厱闁圭偓娼欑徊璇裁瑰鍛槐闁哄本鐩幃鈺呮嚑椤戭偁鍊栨穱濠囧矗婢跺﹤顫掗悗娈垮枙缁瑩銆佸锟介幃銏ゆ憥閸屾艾顕ч梻浣藉吹閸犳劗鍒掑畝锟界划鏃堟偨缁嬭法鐣鹃梺鍝勫�归娆撴偂閵夆晜鐓曟繛鎴濆船濞呮ɑ绻涢懖鈺佹瀻闁宠鍨块幃鈺冪磼濡鏁繝鐢靛仜閻即宕濋幋锕�违闁告稑鐡ㄩ崐濠氭煠閹帒鍔ら柛姗嗕簼缁绘繈濮�閿濆棛銆愰梺缁橆殔濡繂鐣峰┑鍡╃叆闁割偆鍠撻崢杈ㄧ節閻㈤潧孝閻庢凹鍙冨鎶筋敆閸曨剛鍘搁柣蹇曞仜婢т粙鍩ユ径鎰厓閻犲洦鐓￠妤呮懚閿濆鐓ｉ煫鍥ㄥ喕閹峰嘲鈽夊▎鎰ㄦ灆闂傚倸鍊搁崐鐑芥嚄閸洍锟斤箓宕奸姀鈥冲簥闂佺鎻徊楣冨箠瀹�鍕拺閻犲洤寮堕幑锝夋煛娴ｈ鍊愮�规洏鍨奸ˇ鍫曟煟韫囨柨娴慨濠冩そ瀹曘劍绻濋崟顓犳殼闂佽瀛╁銊╁礂濡櫣鏆﹂梻鍫熺▓閺嬪酣鏌熼崜褑藟闁归攱妞藉娲嚒閵堝懏鐎炬繝銏㈡嚀濡繈鐛Δ鍛亹缂備焦顭囬崢閬嶆⒑閸濆嫬鏋﹂柟椋庡厴閹粙顢涘鍐ф埛闂佸憡甯楃敮锟犲春閿熺姴宸濇い鎾跺閸熷淇婇悙顏勶拷鏍涙笟锟藉畷鎴﹀箛椤撗勵啍闂佹悶鍎洪崜姘跺煕閹达附鐓涢柛灞久崝婊勭箾閸涱厽鍤囬柡灞剧洴閹垽宕ㄦ繝鍕殥闂備礁鎼Λ宀勫疾閻樺樊娼栫紓浣股戞刊瀵哥磼濞戞﹩鍎忔繛鍫熷姍濮婃椽宕ㄦ繝鍕櫑闂備礁搴滅徊浠嬫偩閻ゎ垬浜归柟鐑樻尭娴犲ジ鏌ｈ箛鏇炰户闁惧繐楠搁…鍥偄鐏忎焦鏂�闂佺粯顭囩划顖氣槈瑜庣换娑氫沪閸屾艾顫囬梺绯曟杺閸ㄨ棄顕ｉ锟藉畷鎺楁晜閽樺浼撴俊銈囧Х閸嬫盯鎮樺┑瀣婵鍩栭悡鐔镐繆閵堝繑瀚圭紓浣虹帛鐢偤宕氶幒鎾剁瘈婵﹩鍓欓崬銊ヮ渻閵堝棙灏甸柛鐔锋健楠炲繑绻濆顓涙嫼闁荤姵浜介崝灞解枍閹扮増鐓欓柛鎴欏�栫�氾拷?闂傚倸鍊搁崐宄懊归崶褏鏆﹂柣銏㈩焾缁愭鏌熼柇锕�鍔掓繛宸簻缁狅綁鏌ｅΟ鍏兼毄闁绘帒鍚嬬换娑㈠箻鐎电鏆￠梺鍦厴閺�閬嶅Φ閸曨垰顫呴柍钘夋閸旀悂姊洪棃娑欏闁告梹鐟╅悰顕�骞掑Δ锟界粻锝夋煟濞嗘瑦瀚归梺鍛婅壘閹冲酣鍩為幋锔芥櫖闁告洦鍋傜划璺侯渻閵堝棗鐏ラ柟铏姍閺佹捇鎸婃径灞肩驳闁汇埄鍨遍〃鍫ユ晸娴犲娑ч柕鍫㈩焾閻ｇ兘骞掑Δ浣革拷椋庣磼椤旀娼愰悗姘偢濮婄粯鎷呴崨濠冨創濡炪倧绠戦崯鍧楀煝閺冨牆鍗抽柣鎰仛閹冲啴姊婚崒姘拷宄懊归崶顒夋晪闁哄稁鍘肩粣妤呮煛瀹ュ骸浜鹃柟宄板槻閳藉骞掗幘瀵稿絽婵＄偑鍊栧ú蹇涘磿闂堟稓鏆﹂柣鏃傗拡閺佸秵鎱ㄥ锟界涵绋课ｇ憴鍕箚闁绘劦浜滈敓鑺ョ墵楠炴劖銈ｉ崘銊х崶闁瑰吋鐣崝宥夊疾閹间焦鐓涢柛灞久敓鑺ョ墱閿熻姤鐔幏锟�
		if (title.titleid > 0){
			final fire.pb.title.SOnTitle onTitle = new fire.pb.title.SOnTitle();
			onTitle.roleid = roleid;
			onTitle.titleid = title.titleid;
			onTitle.titlename = title.titlename;
			role.sendAround(onTitle);
		}
		else{
			final fire.pb.title.SOffTitle offTitle = new fire.pb.title.SOffTitle();
			offTitle.roleid = roleid;
			role.sendAround(offTitle);
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 732897;

	public int getType() {
		return 732897;
	}

	public long roleid;
	public fire.msp.showtitleinfo title;

	public GNotifyTitle() {
		title = new fire.msp.showtitleinfo();
	}

	public GNotifyTitle(long _roleid_, fire.msp.showtitleinfo _title_) {
		this.roleid = _roleid_;
		this.title = _title_;
	}

	public final boolean _validator_() {
		if (!title._validator_()) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(roleid);
		_os_.marshal(title);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		roleid = _os_.unmarshal_long();
		title.unmarshal(_os_);
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GNotifyTitle) {
			GNotifyTitle _o_ = (GNotifyTitle)_o1_;
			if (roleid != _o_.roleid) return false;
			if (!title.equals(_o_.title)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)roleid;
		_h_ += title.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(roleid).append(",");
		_sb_.append(title).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}



package fire.pb.pet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CRecoverPetInfo__ extends mkio.Protocol { }

/** 客户端请求查看一个找回宠物的信息
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CRecoverPetInfo extends __CRecoverPetInfo__ {
	@Override
	protected void process() {
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;

		new mkdb.Procedure() {
			@Override
			protected boolean process() {

				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚娼栨繛宸憾閺佸棝鏌ㄩ悢鐑樻珪缂侇喗妫冮獮姗�顢欓挊澶婂婵犲痉鏉匡拷鎾绘⒔瀹ュ棛顩叉繝濠傜墛閻撴稓锟藉箍鍎遍崯顐ｄ繆閹稿簺浜滈柨婵嗙墕閻ㄨ櫣绱掓潏銊ユ诞闁轰焦鎸荤粋鎺旓拷锝庡亝濞呫垺绻涚�电孝妞ゆ垵妫濋崺娑㈠箣閿旂晫鍘藉┑顔斤供閸撴盯骞楅悩缁樺�垫慨姗嗗墯鐠愶紕绱掓潏銊﹀鞍闁瑰嘲鎳樺畷婊堝矗婢诡厞鍥ㄢ拺缁绢厼鎷嬪鎰繆閼碱剛锛咺d闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟骞婂畝鍕櫢闁芥ê顦弳鐐碉拷鍨緲鐎氫即鐛崶顒夋晞闁崇懓鐏濋崝锕傛煛鐏炶濮傞柟顔哄�濆畷鎺戔槈濮楀棔绱�
				xbean.Petrecoverlist petRecoverList = xtable.Petrecover.select(roleId);
				if (petRecoverList == null) {
					return false;
				}

				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偞鐗犻、鏇㈠Χ韫囨柨顏跺┑顔矫畷顒勫储鐎甸潻鎷风憴鍕妞ゎ偄顦遍敓浠嬫涧閵堢顕ｉ崼鏇炵闁绘ê鐏氬В搴㈢節閻㈤潧浠╅柟娲讳簽瀵板﹦鎹勯妸銈囧墾闂侀潧艌閺呮稓绮婚婊愭嫹閻熸澘顏鐟邦儏鍗遍柛顐ゅ枔缁犻箖鏌涘锟界粈浣割嚕閹灐鐟邦煥閸曨厾鐓夐梺杞扮閸熷瓨鎱ㄩ敓浠嬫煏閸繂顒㈤柡鍛矒濮婃椽宕滈幓鎺嶇凹缂備浇顕х�氫即骞冮敓鐘茬婵犲灚鍔栫�靛矂姊洪棃娑氬婵☆偅绋掗弲鍫曨敆閸屾粍锛忛梺鍝勵槼濞夋洝鍊寸紓鍌欑贰閸犳牠鎮ч幘璇叉瀬闁规儳顕々鐑芥倵閿濆骸浜愰柟閿嬫そ濮婅櫣绱掑Ο鍨棟闂佸鏉垮闁跨喕濮ら懝鍓х礊婵犲偆娼栨繛宸簻瀹告繂鈹戦悩鎻掓殭闁活収鍣ｅ铏圭磼濡椽鍤嬬紓浣哄У閹瑰洭鐛崘鈹垮亝闁告劏鏅涢崜鍐测攽閻愬瓨灏版い顏勫祶Id
				if (petRecoverList.getUniqids().contains(uniqid) == false) {
					return false;
				}

				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹鐎规洏鍎抽敓鏂ょ秵閸犳牜澹曢崸妤佺厵闁诡垳澧楅ˉ澶愬箹閺夋埊韬柡灞诲�楅崰濠囧础閻愬樊娼芥俊鐐�栭崝鎺斿垝濞嗗浚鍤曢柛顐ｆ礀闁卞洦绻涢幋鐏活亪鈥栫�ｎ喗鈷戠�规洖娲ㄧ敮娑欎繆椤愩垹鏆ｇ�殿喖顭峰鎾晬閸曨厽婢戦梻浣告惈濞层劑宕愰锕�唯鐟滃繐螞椤栨鏃堟晲閸涱厽娈堕梺浼欑稻濡炰粙寮婚垾宕囨殕閻庯綆鍓涜ⅵ濠电姷顣介崜婵嬪箖閸屾稐绻嗛柣鎴ｆ鍞銈嗘⒒缁垶宕戦崨瀛樷拻闁稿本鐟ч崝宥夋煟椤忓嫮绉虹�规洘鍔欏鎾倶缂佹ɑ銇濇い銏★耿婵拷闁绘鏁搁弳顐︽⒒娴ｈ姤纭堕柛锝忕畵楠炲繘鏁撻敓锟�?
				xbean.DiscardPet discardPet = xtable.Petrecyclebin.select(uniqid);
				if (discardPet == null) {
					return false;
				}

				Pet pet = Pet.getPet(discardPet.getPet());

				// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愯弓鐢婚梻浣瑰濞叉牠宕愰幖浣稿瀭闁稿瞼鍋為悡銉╂煟閺囩偛锟藉湱锟芥熬鎷�?婵犵數濮烽弫鎼佸磻閻樿绠垫い蹇撴缁�濠囨煥閻旇袚缂佺粯鐩畷顏堝礃椤忓柊婊堟⒑绾懏鐝紒顔芥尭閻ｉ攱绺界粙鍨祮闂佺粯鏌ㄩ崵鏍箯閻戣棄鍨傛い鎰靛亝椤旀棃姊虹紒妯哄閻忓繑鐟︾粋鎺楀閵堝棛鍘介棅顐㈡祫缁插ジ鏌囬鐐寸厸閻忕偛澧藉ú鎾煕閳哄绡�鐎规洘甯掗埞鍐礌閳╁啫顏堕梺鍦劋濮婅崵澹曢崗绗轰簻闁哄洨鍋為ˉ鐐烘倵濮樼偓瀚�?
				SRecoverPetInfo send = new SRecoverPetInfo();
				send.petinfo = pet.getProtocolPet();
				mkdb.Procedure.psendWhileCommit(roleId, send);
				return true;
			}
		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788587;

	public int getType() {
		return 788587;
	}

	public long uniqid; // 唯一id

	public CRecoverPetInfo() {
	}

	public CRecoverPetInfo(long _uniqid_) {
		this.uniqid = _uniqid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(uniqid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		uniqid = _os_.unmarshal_long();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CRecoverPetInfo) {
			CRecoverPetInfo _o_ = (CRecoverPetInfo)_o1_;
			if (uniqid != _o_.uniqid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)uniqid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(uniqid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CRecoverPetInfo _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(uniqid - _o_.uniqid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


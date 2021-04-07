
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetFightPet__ extends mkio.Protocol { }

/** 请求宠物参战
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetFightPet extends __CSetFightPet__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		Long battleId = xtable.Roleid2battleid.select(roleid);
		if (battleId == null) {
			PSetFightPetProc proc = new PSetFightPetProc(roleid, petkey, true);
			proc.submit();
		} else {
			// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告创妞ゃ垺锕㈠畷顐﹀礋閵婏附鏉搁梻浣哥枃濡嫬螞濡ゅ懏鍊堕柨婵嗘川绾惧吋銇勯弴鐐村櫣闁诲骏绠撻弻鐔碱敊閻偒浜、妯荤附缁嬪灝绐涘銈呯箰閹峰顭囬弮鍫熲拻濞达絿鍎ら崵锟介梺璇茬箲缁诲牆鐣烽鐑嗘晝闁挎梹鍎崇粊锕�鈹戞幊閸婃洟宕板☉銏犵濡炲瀛╅崰鍡涙煕閺囥劌澧版い锔诲櫍閺岋綀绠涢幘鍓侇唹闂佽崵鍟块弲鐘差嚕椤愶箑绠婚悹鍥у级椤ユ繈姊洪棃娑氬婵☆偅顨婇、鏃堟晸閿燂拷?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟骞婅箛娑樼；闁跨喓濮甸悡銉╂煛閸モ晛浠滈柨鐔诲Г閹倸鐣疯ぐ鎺戠＜婵炴垶鐗旂花濠氭⒑閸︻厼鍔嬮柛銊ф暬椤㈡棃鍩￠崒娆戠畾濡炪倖鍔х紓澶愬箣閻愮鏀虫繝鐢靛Т濞层倕娲块梻浣告啞娓氭宕㈤挊澶嗘灁閻犻缚銆�閺�浠嬫煟閹邦剚鈻曟俊鎻掔埣閺屾盯濡搁妶鍥╃厯閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙缁绘帡宕戦悩铏弿闁靛牆顦伴崐闈涒攽閻樺磭顣查柍閿嬪灴閹綊宕堕敐蹇斿闁惧浚鍋嗘禍鑸典繆閻愵亜锟芥垿宕濆畝鍕櫇妞ゅ繐鐗忓畵渚�鏌涢幇銊︽珖妞も晝鍏橀幃妤呮晲鎼粹�茬盎婵炲瓨绮嶇划鎾愁潖濞差亜宸濆┑鐘插濡插牓姊洪幐搴㈢８闁稿海鏁婚獮鍐偨閸涘﹥娅㈤梺璺ㄥ櫐閹凤拷
			mkdb.Procedure proc = new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					final xbean.BattleInfo battle = xtable.Battle.get(battleId);
					if (battle != null) {
						Integer index = battle.getRoleids().get(roleid);
						if (index != null) {
							xbean.Fighter fighter = battle.getFighters().get(index);
							if (fighter != null) {
								fighter.setInipetkey(petkey);
								fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 180031);
							}
						}
					}
					return true;
				}
			};
			proc.submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788440;

	public int getType() {
		return 788440;
	}

	public int petkey; // 请求参战的宠物

	public CSetFightPet() {
	}

	public CSetFightPet(int _petkey_) {
		this.petkey = _petkey_;
	}

	public final boolean _validator_() {
		if (petkey < 1) return false;
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(petkey);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetFightPet) {
			CSetFightPet _o_ = (CSetFightPet)_o1_;
			if (petkey != _o_.petkey) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetFightPet _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = petkey - _o_.petkey;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


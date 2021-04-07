
package fire.pb.pet;
// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CSetFightPetRest__ extends mkio.Protocol { }

/** 请求将参战宠物置位休息状态
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSetFightPetRest extends __CSetFightPetRest__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0 || !fire.pb.StateCommon.isOnline(roleid))
			return;

		Long battleId = xtable.Roleid2battleid.select(roleid);
		if (battleId == null) {
			PSetFightPetProc proc = new PSetFightPetProc(roleid, 0, false);
			proc.submit();
		} else {
			// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴濐潟閿熻棄鍊圭粋鎺旓拷锝庡亝濞呫垽姊洪懞銉冾亪藝椤栫偛姹查梺顒�绉甸悡銉╂煟閺冨倻甯涙い銉ヮ槺缁辨挸顓奸崪鍐惈濡ょ姷鍋涢崯顐ョ亽闁荤姴娲╃亸娆戠玻閻愮儤鈷戠憸鐗堝笒娴滀即鏌涢幘瀵告创妞ゃ垺锕㈠畷顐﹀礋閵婏附鏉搁梻浣哥枃濡嫬螞濡ゅ懏鍊堕柨婵嗘川绾惧吋銇勯弴鐐村櫣闁诲骏绠撻弻鐔碱敊閻偒浜、妯荤附缁嬪灝绐涘銈呯箰閹峰顭囬弮鍫熲拻濞达絿鍎ら崵锟介梺璇茬箲缁诲牆鐣烽鐑嗘晝闁靛繆鏅涘▓銊╂⒑闂堟侗鐓悹鎰枑缁傚秴顭ㄩ崼鐔哄幐闂佸憡鍔栫�笛咃拷姘辨嚀閳规垿鎮欓幓鎺旈獓缂備緡鍠栨绋垮祫闂佸湱澧楀妯肩尵瀹ュ鐓曟い鎰靛亜娴滄繈鏌￠崨顏呮珚婵﹥妞藉畷妤呮嚃閳瑰灝浠﹂梻浣告惈閹冲繒鍒掗幘璇茬畺婵°倕鎷嬮弫瀣煥閻旂粯顥夋い顐㈢箻閹煎綊宕烽鐙呯床婵犵妲呴崹鍫曞疾閼碱剙鍨濋柛顐ｆ礃閳锋垿鏌涘┑鍡楊仾闁革絾妞介弻锝夋偄濠靛棗鎮╅柨婵嗩槸缁犳盯鏌℃径搴殾鐟滃秹鈥︾捄銊﹀磯闁绘碍娼欐慨娑㈡⒑娴兼瑧绉堕柟鍑ゆ嫹?,闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫宥夊礋椤掍焦顔囨繝寰锋澘锟芥洟骞婅箛娑樼；闁跨喓濮甸悡銉╂煛閸モ晛浠滈柨鐔诲Г閹倸鐣疯ぐ鎺戠＜婵炴垶鐗旂花濠氭⒑閸︻厼鍔嬮柛銊ф暬椤㈡棃鍩￠崒娆戠畾濡炪倖鍔х紓澶愬箣閻愮鏀虫繝鐢靛Т濞层倕娲块梻浣告啞娓氭宕㈤挊澶嗘灁閻犻缚銆�閺�浠嬫煟閹邦剚鈻曟俊鎻掔埣閺屾盯濡搁妶鍥╃厯閻庢鍠栭…鐑藉春閸曨垰绀冮柕濞у懐宓侀梻浣筋嚙缁绘帡宕戦悩铏弿闁靛牆顦伴崐闈涒攽閻樺磭顣查柍閿嬪灴閹綊宕堕敐蹇斿闁惧浚鍋嗘禍鑸典繆閻愵亜锟芥垿宕濆畝鍕櫇妞ゅ繐鐗忓畵渚�鏌涢幇銊︽珖妞も晝鍏橀幃妤呮晲鎼粹�茬盎婵炲瓨绮嶇划鎾愁潖濞差亜宸濆┑鐘插濡插牓姊洪幐搴㈢８闁稿海鏁婚獮鍐偨閸涘﹥娅㈤梺璺ㄥ櫐閹凤拷
			mkdb.Procedure proc = new mkdb.Procedure() {
				@Override
				protected boolean process() throws Exception {
					final xbean.BattleInfo battle = xtable.Battle.get(battleId);
					if (battle != null) {
						Integer index = battle.getRoleids().get(roleid);
						if (index != null) {
							xbean.Fighter fighter = battle.getFighters().get(index);
							if (fighter != null) {
								fighter.setInipetkey(-1);
								fire.pb.talk.MessageMgr.psendMsgNotifyWhileCommit(roleid, 150090);
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
	public static final int PROTOCOL_TYPE = 788442;

	public int getType() {
		return 788442;
	}


	public CSetFightPetRest() {
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSetFightPetRest) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSetFightPetRest _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


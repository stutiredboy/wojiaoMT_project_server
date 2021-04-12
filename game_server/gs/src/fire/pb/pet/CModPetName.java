
package fire.pb.pet;

import fire.pb.talk.MessageMgr;
import fire.pb.util.CheckName;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CModPetName__ extends mkio.Protocol { }

/** 客户端请求修改宠物名字
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CModPetName extends __CModPetName__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		if (!fire.pb.pet.Pet.isInBattle(roleid, petkey))
			return;

		final SPetError senderr = new SPetError();
		// check length
		if (petname.length() > NAMELEN_MAX) {
			// 142995
			senderr.peterror = PetError.PetNameOverLen;
			gnet.link.Onlines.getInstance().send(roleid, senderr);
			return;
		} else if (petname.length() < NAMELEN_MIN) {
			senderr.peterror = PetError.PetNameShotLen;
			gnet.link.Onlines.getInstance().send(roleid, senderr);
			return;
		}

		// check illegality
		int resultCode = fire.pb.util.CheckName.checkValid(petname);
		if (resultCode == CheckName.WORD_ILLEGALITY) {
			MessageMgr.sendMsgNotify(roleid, 142260, null);
			return;
		} else if (resultCode == CheckName.SPECIAL_WORD_TOO_MANY) {
			MessageMgr.sendMsgNotify(roleid, 142294, null);
			return;
		} else if (resultCode == CheckName.NONE_CHARACTER) {
			MessageMgr.sendMsgNotify(roleid, 146238, null);
			return;
		}

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌涢幇顒�绾ч柣銈呭濮婄粯鎷呴崨濠傛殘闂佸湱顭堝Λ婵嗙暦閵娾晩鏁嶆繝濠傚暙閼搭垶姊婚崒姘拷椋庣矆娴ｉ潻鑰块梺顒�绉甸幆鐐哄箹濞ｎ剙濡肩紒鎰殕娣囧﹪濡堕崨顔兼缂佺偓鍎抽…鐑藉蓟閺囥垹閱囨繝闈涙搐椤︹晠姊洪崫銉バｉ柛鏃�鐟╁濠氭晸閻樿尙锛滃┑鐘绘涧濞层劑濡存繝鍥ㄢ拺闁告繂瀚敍鏃傜磼閻樿櫕宕岀�殿喖顭峰鎾偄妞嬪海鐛梻浣虹《閸撴繆鎽梺缁樼箖濡啫顫忕紒妯诲缂佸鍎婚崺鐐测攽閻愬弶鈻曢柛娆忓暙椤曪絾绻濆顓熸珳婵犮垼娉涢敃锕傛儓閸曨垱鈷戦悹鎭掑妼閺嬫瑥鈹戦鍝勶拷妤冨垝鐎ｎ亶鍚嬮柛鈩冪懐濞村嫰鏌ｆ惔顖滅У闁稿鎳庨埢宥夊閵堝棌鎷洪梺鍛婄箓鐎氼剟鏁撻挊澶屽煟鐎规洘鍔欏浠嬵敃椤掍礁顏跺┑顔筋焽閸嬫挾锟芥熬鎷�,闂傚倸鍊搁崐鎼佸磹閹间礁纾圭�瑰嫭鍣磋ぐ鎺戠倞鐟滃繘寮抽敃鍌涚厱妞ゎ厽鍨垫禍婵嬫煕濞嗗繒绠婚柡宀�鍠撶槐鎺楀閻樺磭褰梻浣芥〃缁�浣猴拷姘嵆瀵鈽夊Ο閿嬵潔濠电偛妫欓崝妤冪矙閸ヮ剚鈷戞慨鐟版搐閿熷鍊濆畷浼村冀椤撶喓鐣抽梻鍌欒兌椤牏鎹㈤幇鏉胯Е閻庯綆鍓涚粈濠囨煙鏉堥箖妾柣鎾寸洴閹鏁愰崒娑欑彇缂備焦鍔栧Λ鍐蓟閿涘嫪娌柣鎰靛墰椤︿即鎮楃憴鍕闁告鍥х厴闁硅揪绠戦悙濠囨煠閸濄儺鏆滃Δ鐘茬箻濮婂宕掑▎鎴М缂佸墽铏庨崣鍐嵁婵犲洤绠婚柛鎾茶兌閻撳姊哄Ч鍥х伄妞ゎ厼鐗婇、濠囨⒒娴ｅ憡鍟炴繛璇х畵瀹曞綊骞嶉鎯ф殫閻庡箍鍎遍ˇ浼存偂閺囥垺鐓忓鑸得弸銈吤归悩顔肩伈闁哄瞼鍠栧畷婊嗩槾閻㈩垱鐩弻锝夊箻鐎靛憡鍒涢梺鍝勬湰閻╊垶宕洪敃鍌涙櫢濞寸姴顑呴悿鐐箾閹寸儑渚涢柛銈嗘礃閵囧嫰寮撮鍛伓闂備礁鎼惌澶屾閺囩喓顩烽柨鏇炲�哥粈鍫㈡喐婢跺á锝夊醇濠垫劖瀵岄梺闈涚墕妤犲憡绂嶅┑鍫㈢＜閻犲洩灏欐晶锕傛煏閸℃洜顦﹂摶鏍煕濞戝崬骞橀柨娑欑矒濮婅櫣绮欓幐搴㈡嫳闂佹寧宀搁弻锝堢疀閺冨倸寮ㄩ梺鍝勫閿熻棄纾弳鍡涙倵閿濆骸澧扮悮锕傛⒒娴ｈ櫣銆婇柡鍛洴閺佸啴濡舵径濠勫幒闁瑰吋鐣崐妤呮偪閿熶粙姊洪崫鍕拷褰掝敄濞嗗精锝夋焼瀹ュ棌鎷绘繛杈剧导鐠�锕傛倿閹灛鏃堟偐閸欏鍠愮紓渚囧枟濡線濡甸幇鏉跨闁硅揪绲鹃幉鐗堢節閻㈤潧浠﹂柛顭戝灦瀹曠銇愰幒鎴狀攨闂佽鍎兼慨銈夋偂韫囨挴鏀介柣鎰皺娴犮垽鏌涢弮锟介悷褏妲愰幒妤�惟闁靛牆娲ㄩ悡鎾斥攽椤旂》鏀绘俊鐐舵閻ｇ兘鎮滅粵瀣櫍闂佺粯鏌ㄩ幗婊嗐亹瑜嶉埞鎴︽偐閸偅姣勯梺绋垮閸ㄥ潡鐛箛娑欏�婚柤鎭掑劗閹锋椽姊洪崨濠勭畵閻庢凹鍘奸敃銏ゅ箥椤斿墽锛滈柣搴秵閸嬪懐浜搁幍顔剧＜闁稿本绋戝ù顕�鏌℃担绋匡拷鍧楀箖濞嗘搩鏁嗛柨鐔剁矙閹灚瀵肩�涙ǚ鎷洪梺闈╁瘜閸樺墽鏁☉銏″仺妞ゆ牗顨嗗▍鍛亜椤撶偞澶勭紒缁樼箞瀹曠喖顢橀悪鍛棷闂傚倷鑳堕…鍫ュ嫉椤掑嫭鍋￠柨鏂垮⒔閻牓鏌ｅΔ锟介悧鍕濠婂牊鐓涢柛銉戝嫷妫炲┑鐐茬湴閸婃繈骞冮崸妤婃晪闁跨喍绮欏濠氭偄鐏忎焦鐏侀梺鍓茬厛閸犳鎮橀崼銉︹拺闁硅偐鍋涙俊鐣岀磼鐠囨彃鏆熼柟骞垮灩閳藉濮�閻樿尪锟藉灝鈹戦埥鍡楃仴婵炲拑缍佸畷銏ゅ箛閻楀牃鎷洪悷婊呭鐢晛螞閹达附鐓曢煫鍥ㄦ閼拌法锟芥鍣崑濠囩嵁閸ヮ剦鏁嶆繝濠傛噺濠㈡垿姊绘担鍛婃儓闁稿﹤缍婇、鏍р枎閹邦剦鍤ら梺璺ㄥ櫐閹凤拷??
		PModPetName proc = new PModPetName(roleid, petkey, petname);
		proc.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 788450;

	public int getType() {
		return 788450;
	}

	public final static int NAMELEN_MAX = 6; // 名字的最大长度
	public final static int NAMELEN_MIN = 1; // 名字的最短长度

	public int petkey; // 宠物的key
	public java.lang.String petname; // 宠物的名字

	public CModPetName() {
		petname = "";
	}

	public CModPetName(int _petkey_, java.lang.String _petname_) {
		this.petkey = _petkey_;
		this.petname = _petname_;
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
		_os_.marshal(petname, "UTF-16LE");
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		petkey = _os_.unmarshal_int();
		petname = _os_.unmarshal_String("UTF-16LE");
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CModPetName) {
			CModPetName _o_ = (CModPetName)_o1_;
			if (petkey != _o_.petkey) return false;
			if (!petname.equals(_o_.petname)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += petkey;
		_h_ += petname.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(petkey).append(",");
		_sb_.append("T").append(petname.length()).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


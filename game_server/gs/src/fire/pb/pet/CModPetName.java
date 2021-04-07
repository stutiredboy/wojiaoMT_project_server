
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

		// 闂傚倸鍊搁崐鎼佸磹妞嬪海鐭嗗〒姘炬嫹妤犵偛顦甸弫鎾绘偐閸愬弶鐤勯梻浣告啞閹稿棝宕ㄩ婊冨脯闂傚倷绀佸﹢閬嶆惞鎼淬劌绐楁俊銈呮噹绾惧鏌曢崼婵囧闁哥姵鍔欓弻锟犲磼濠靛洨銆婇梺鍝勬４缁犳捇寮婚弴鐔风窞闁糕剝蓱閻濇棃姊绘担绋胯埞婵炲樊鍙冨濠氭晲婢跺﹦鐫勯梺璺ㄥ枙婵倗绮嬪鍡欘浄閻庯綆鍋呭▍銏ゆ⒑閸濆嫬锟藉爼宕愰弽顐嫹濮樼偓瀚�,闂傚倸鍊搁崐宄懊归崶褏鏆﹂柛顭戝亝閸欏繘鏌熺紒銏犳珮闁轰礁瀚伴弻娑樷槈濞嗘劗绋囬梺姹囧�ら崰鏍箒闂佺绻愰崥瀣礊閹达附鐓涢悗锝傛櫇缁愭棃鏌＄仦鐐鐎规洜鍘ч埞鎴﹀炊閼哥楠忛梻鍌欑绾绢參骞婇幘鍓佺煋闁汇垻顭堟闂佸憡娲﹂崹鎵尵瀹ュ鐓曢柕澶樺枤娴犮垽鏌熼崜褏甯涢柣鎾寸洴閺屾盯鍩﹂敓浠嬪疾濞戞﹩鍤曟い鏇嫹闁哄矉绱曟禒锕傚礈瑜夊Σ鍫濐渻閵堝骸浜濈紒璇茬墦閵嗕礁螖閸涱厾锛滈梺绋挎湰閿氶柣蹇旂叀閺屸�崇暆鐎ｎ剛袦闂佺硶鏅涢敃銈夊煝鎼淬倗鐤�闁哄倹顑欏Σ閬嶆⒒娴ｄ警鐒惧Δ鐘叉憸缁棁銇愰幒鎴ｆ憰濠电偞鍨崹褰掑础閹惰姤鐓忓┑鐐茬仢閸旀瑧绱掗妸銈囩煓婵﹥妞藉畷鐑筋敇閻斿摜褰у┑鐘垫暩閸庢垿骞忛悜鑺モ拺闁告繂瀚﹢鎵磼鐎ｎ偅灏扮紒鍌涘浮閺佸倿鎮欓锟介悵浼存⒑閸︻厾甯涢悽顖楁櫅椤洦绻濋崟顓狅紳闂佺鏈悷锔剧矈閻楀牄浜滈柡鍥ф濞层倝鎮块锟介弻鐔封枔閸喗鐏堥梺鎼炲妽缁诲啰鎹㈠☉銏犲耿婵☆垵娅ｉ崢鎰版⒑瑜版帩妫戦柛蹇旓耿瀵偊骞囬婊呮澑闂佸搫鍊归娆愬閿燂拷??
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


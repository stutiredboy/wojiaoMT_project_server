
package fire.pb.npc;
import fire.pb.activity.winner.PWinnerCallPlayer;
import fire.pb.move.SRoleEnterScene;
import fire.pb.npc.TransmitTypes;


// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CGeneralSummonCommand__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGeneralSummonCommand extends __CGeneralSummonCommand__ {
	@Override
	protected void process() {
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬬偤鎮ч悩姹囷拷渚�寮撮姀鈩冩珖闂佽法鍠撻弲顐ゅ垝婵犳碍鍋愰悹鍥皺椤旀劕鈹戦悜鍥╃У闁告挻鐟︽穱濠囨嚃閳哄啰锛滈梺缁樏肩拃锕�顭囬幇鐗堢厪闁搞儜鍐句純濡ょ姷鍋涘ú顓炵暦濠婂嫭濯撮柤浠嬫敱閸ㄥ灝顫忓ú顏勫窛濠电姴瀚崳褏绱撴担铏瑰笡闁挎洏鍨介獮鍐晸閻欙拷閺佸啴鏌ㄩ弴顏呭闂佺粯鍔曢敃顏堝蓟閺囩喓绡�闊洦鎼╁ú顓烆渻閵堝繗绀嬮柛鏃�鍨垮濠氭晲閸℃ê鍔呴梺闈涚箞閸╁嫰寮抽敓鐘冲�甸柣褍鎲＄�氬綊姊鸿ぐ鎺擄紵缂侊拷娓氾拷閹锋垿鎮㈤崗鑲╁弳闂佺粯鏌ㄩ幖顐㈢摥闂備胶绮崝鏇㈡晝椤忓牆钃熺�广儱妫欐慨婊堟煙濞堝灝鏋熼柛瀣斿洦鈷戦梻鍫熶緱濡叉挳鏌￠崨顔剧煉闁诡噯绻濋幃銏ゅ箹閻愭壆鐩庨梻浣筋潐瀹曟ê鈻斿☉銏犵闁规儼濮らˉ濠冦亜閹烘埈妲稿褎鎸抽弻锛勪沪闂堚晜瀚圭�规洖娲﹀▓鏇㈡⒑鐠恒劌鏋嶇紒顔界懃閻ｇ兘鎮ч崼鐔峰妳闂侀潧顭粻鎴炵婵傚憡鈷戦悹鎭掑妼閺嬫柨鈹戦鐐毈闁诡喚鍋炵粋鎺旓拷锝庡亞閸欏棝姊洪崫鍕拷鎼佹倶濠靛棭鍤堟繛宸簼閻撳繐顭跨捄铏瑰闁告梹顨婇弻锟犳晸娴犲鍤嶉柕澶涚导缁ㄥ姊洪崫鍕殭闁稿﹤鎲＄粋宥夋倷椤戝彞绨婚棅顐㈡处濞叉牠寮稿☉銏＄厸鐎癸拷閿熶粙宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�
		if (summontype == TransmitTypes.impexamsystem)
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾剧懓顪冪�ｎ亝鎹ｉ柣顓炴閵嗘帒顫濋悙顒�顏舵俊銈囧Х閸嬫盯藝閻㈢鏋侀柟鍓х帛閸嬫劙鏌ょ喊鍗炲⒒婵℃煡鏀辩换婵嗩嚗闁垮绶查柨鐔诲Г閹瑰洭骞冮悙鐑樻櫇闁稿本姘ㄩ悡鎴︽椤愩垺澶勭紒瀣浮閹�斥枎閹寸姷锛濇繛杈剧秮濞佳囨倶閳哄懏鐓涢悗锝庡亞濞叉挳鏌″畝瀣М濠德ゅ煐閹棃鍩勯崘顏冩喚婵犵數鍎戠徊钘壝洪妶澶嬫櫇妞ゅ繐鎳嶇换鍡涙煕椤愶絾绀�鐎瑰憡绻冮妵鍕箻鐠虹儤鐎惧銈嗘煥椤﹂潧顫忛搹瑙勫珰闁圭粯甯╅崝澶岀磼閻愵剚绶茬紒澶嬫尦閹儳鈹戠�ｎ亞顔愭繛杈剧稻閻℃洟骞楅弴銏♀拺閻犳亽鍔岄弸鏂库攽椤旇姤灏﹂柟顔界懄缁绘繈宕堕妸褍甯楅梺鍝勵槺閸嬬偞绔熼崱娑樼畺濠靛倸鎲￠悡蹇涚叓閸ャ劍绀�鏉╂繈鎮峰鍛暭閻㈩垱顨婂畷鎴﹀箛閻楀牏鍘剧紒鐐緲瀹曨剚鏅堕弶璇炬棃寮崼鐔叉嫽婵炶揪绲介幉锟犲箚閸儲鐓熸い鎺炴嫹闁靛牏顭堥悾鐑芥偋閸喎鍔呴梺闈涱煭缁犳垶绂掓總鍛娾拺閻犳亽鍔岄弸鏂库攽椤旂偓鏆柟顔惧仦缁傛帞锟斤綆鍋嗛崣鍡涙⒑閸濆嫬锟芥悂鎮樺┑鍡╁殘婵炲樊浜濋悡蹇擃熆鐠鸿櫣澧曢柛鏃�顨婇弻锟犳晸娴犲鍤嶉柕澶涚导缁ㄥ姊洪崫鍕殭闁稿﹤鎲＄粋宥夋倷椤戝彞绨婚棅顐㈡处濞叉牠寮稿☉銏＄厸鐎癸拷閿熶粙宕伴弽褏鏆︽繛鍡樻尭鍥撮梺绯曞墲椤ㄥ繑瀵奸敓锟�
		if (summontype == TransmitTypes.winnercall && agree == 1) {
			new PWinnerCallPlayer(roleid).submit();
			return;
		}
		if (summontype == TransmitTypes.singlepvp && agree == 1) {
			fire.pb.battle.pvp1.PvP1Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
		if (summontype == TransmitTypes.pvp3 && agree == 1) {
			fire.pb.battle.pvp3.PvP3Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
		if (summontype == TransmitTypes.pvp5 && agree == 1) {
			fire.pb.battle.pvp5.PvP5Control.getInstance().applyEnter(roleid, SRoleEnterScene.SYSTEM_DRAG);
			return;
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 795506;

	public int getType() {
		return 795506;
	}

	public int summontype; // 拉人类型 见TransmitTypes
	public long npckey; // npckey
	public int agree; // 1为同意，0为拒绝

	public CGeneralSummonCommand() {
	}

	public CGeneralSummonCommand(int _summontype_, long _npckey_, int _agree_) {
		this.summontype = _summontype_;
		this.npckey = _npckey_;
		this.agree = _agree_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(summontype);
		_os_.marshal(npckey);
		_os_.marshal(agree);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		summontype = _os_.unmarshal_int();
		npckey = _os_.unmarshal_long();
		agree = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGeneralSummonCommand) {
			CGeneralSummonCommand _o_ = (CGeneralSummonCommand)_o1_;
			if (summontype != _o_.summontype) return false;
			if (npckey != _o_.npckey) return false;
			if (agree != _o_.agree) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += summontype;
		_h_ += (int)npckey;
		_h_ += agree;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(summontype).append(",");
		_sb_.append(npckey).append(",");
		_sb_.append(agree).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGeneralSummonCommand _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = summontype - _o_.summontype;
		if (0 != _c_) return _c_;
		_c_ = Long.signum(npckey - _o_.npckey);
		if (0 != _c_) return _c_;
		_c_ = agree - _o_.agree;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


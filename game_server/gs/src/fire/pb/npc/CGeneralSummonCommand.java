
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
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣仱閹囨偐濮瑰浄鎷锋笟锟藉鎾閳╁啯鐝栭梻浣芥硶閸犳捇寮查銈呭灊濠电姵纰嶉崑鎰版偣閸ヮ亜鐨烘い鏃�鍔曢埞鎴︽倻閸モ晝校闂佸憡鎸婚悷锔界┍婵犲洦鍤冮柍鍝勫暟閿涙粓姊虹紒妯忚偐鎷冮敃锟介…鍥箛閻楀牏鍘梺鎼炲劀閸愬彞绱旀俊銈囧Х閸嬫稑煤椤撶偟鏆︽繝濠傚婵挳鏌ゆ禒瀣暠闁搞劌鐏濋～蹇撁洪鍕獩婵犵數濮寸�氼參宕宠缁辨挻鎷呴搹鐟扮闂佹寧娲忛崹浠嬬嵁閸愵喗鏅搁柣娆欐嫹闁轰礁鍟撮弻銊╁即椤忓懎顏堕梻浣虹帛閸旀洟鏁冮鍫濊摕闁哄洨鍠撶弧锟介棅顐㈡处閹尖晛煤椤撶儐娓婚柕鍫濈箺缁�瀣煕閺冿拷閸ㄥ灝顕ｆ繝姘櫜闁糕剝锚閸斿懘姊洪棃娑氱疄闁糕晛瀚板鎶芥晸閻樺啿锟界敻鏌ｈ閹诧紕锟芥艾缍婂楦裤亹閹烘搫绱电紓渚婃嫹濞撴熬鎷烽柟閿嬪灴閹垽宕楅懖鈺佸汲闂備胶绮弻銊╁箹椤愩垻鎽ラ梻鍌欒兌缁垶宕濋弴銏℃櫇妞ゅ繐鐗嗛拑鐔猴拷骞垮劚濡瑦鎱ㄥ鍫熺厵婵炲牆鐏濋弸鐔兼煕鐎ｆ柨娲﹂埛鎴︽⒒閸喍绶辨俊鍙夋尦閺岋繝宕ㄩ鍓х厜闂佽鍣换婵嬪箖閵忋倕绠归柣鎰閻╁酣姊绘担绛嬫綈鐎规洘锚閳绘柨鈽夐姀鐘殿槶闂佽鍎兼慨銈壦夋繝鍐︿簻闁圭儤鍩堝Σ绋款熆瑜庨幐鎶藉蓟閿涘嫪娌梻鍫氭櫆鐎氬湱锟借娲栧ú锕�鈻撻弴銏♀拺閻犳亽鍔岄弸宥囩磼椤旂晫鎳冮柣锝囧厴閹囧醇閻斿嘲濡抽梻渚�娼ч…顓犵不閹寸偟顩峰┑鍌氭啞閳锋垿鎮归幁鎺戝闁哄鏌ㄩ埞鎴︻敊閻愵剚姣堥梺璇″枤閸嬬偟绮嬮幒鏃撴嫹閿濆骸浜為柛娆忔濮婃椽宕崟顐嫹閹间焦鍊舵繝闈涙－閸ゅ牊绻涘顔荤凹闁绘挸绻愰…璺ㄦ崉閾忕懓顣洪梺鍛婃⒐椤ㄥ﹪寮婚敓鐘虫櫢濞寸姴顑嗛崵宥夋煏婢舵稓瀵肩紒銊ヮ煼濮婃椽宕崟顐ｆ闂佺锕ら幉锛勭矉瀹ュ鍊锋い鎴濆綖缁ㄥ妫呴銏″婵炲弶鐗犲绋库槈閵忥紕鍘搁悗鐧告嫹闁跨喍绮欏畷浼村冀瑜忛弳锔界箾閸℃ɑ灏崶鎾⒑缁洖澧叉い銊ョ箲鐎靛ジ鏁撻敓锟�
		if (summontype == TransmitTypes.impexamsystem)
			return;
		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屻倗鍠婇崡鐐测拻濠碘剝鐓￠弨杈╂崲濠靛棭鍤楅梺鍨儐缁舵煡鏌ㄩ悢璇残撻柟鐟版喘楠炲啴鎮欓悜妯绘珖闂佺鏈銊╂偂閹达附顥婃い鎰╁灪婢跺嫮绱掔�ｎ偄娴柟顔癸拷鏂ユ瀻闁瑰濮烽敍婵囩箾鏉堝墽绉繛浣冲洦鍊堕柍鍝勬噺閻撴盯鎮楅敐搴′簽婵炲弶鎸抽弻鈥崇暆鐎ｎ剛袦婵犲痉銈呯厫闁诡垱妫冮崺鍕礃椤忓啯鍠氬┑鐘垫暩閸庢垹寰婇挊澹濇椽濡舵径瀣珖濡炪倕绻愰幊宥囨崲閸℃稒鐓曟い鎰剁稻缁�锟介悗鐟版啞缁诲啴濡甸崟顖氱閻犺櫣鍎ら悗鎯ь渻閵堝棙鐓ユい锕傛涧椤繘鎼圭憴鍕彴闂佸湱绮敮鈺呭礉婢跺瞼纾奸柣鎰靛墯缁惰尙绱掓径瀣唉闁诡喗鍎抽埞鎴狅拷锝庝簽椤旀劖绻涙潏鍓хɑ闁烩剝娲熼獮妤呭即閵忊檧鎷洪柣鐘充航閸斿矂寮搁弬搴撴斀妞ゆ棁濮ょ亸锕傛煙椤旂晫鎳勭紒缁樼箞瀹曞爼濡歌鐢姊洪崫鍕垫Ш闁稿鍋炵粩鐔煎幢濞戞鐣烘繝闈涘�搁幉锟犳偂韫囨稓鍙撻柛銉ｅ妽缁�锟介弶鈺傜箞閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠傜暦閹达箑绠涢柣妤�鐗忛崢鍓х磼閻愵剚绶茬�规洦鍓氶弲鍫曞级鐠囩偓妫冨顕�宕奸悢鍙夊濠电偠鎻徊浠嬪箟閿熺姴绠氶柛顐犲劜閻撶喐銇勯幒鐐村闂侀潧鐗忛…鍫ユ偩閻戣姤鍋嬮柛顐ゅ枎閸斿懘姊洪棃娑辩叚缂佺姵鍨剁粋鎺撶附閸涘ň鎷洪柣鐘充航閸斿矂寮搁弬搴撴斀妞ゆ梻鍋撻弳顒勬煙椤旀儳浠︾紒鍌涘笧閿熸枻缍嗛崑鍡涘矗閸℃稒鈷戦柛婵嗗閿熻姤鎮傞幃妯衡攽閸♀晛娈樺┑鐐叉▕娴滄繈鎮¤箛鎿冪唵閻犻缚娅ｆ晶鏇㈡煕閺冿拷椤ㄥ﹪寮婚敓鐘虫櫢濞寸姴顑嗛崵宥夋煏婢舵稓瀵肩紒銊ヮ煼濮婃椽宕崟顐ｆ闂佺锕ら幉锛勭矉瀹ュ鍊锋い鎴濆綖缁ㄥ妫呴銏″婵炲弶鐗犲绋库槈閵忥紕鍘搁悗鐧告嫹闁跨喍绮欏畷浼村冀瑜忛弳锔界箾閸℃ɑ灏崶鎾⒑缁洖澧叉い銊ョ箲鐎靛ジ鏁撻敓锟�
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


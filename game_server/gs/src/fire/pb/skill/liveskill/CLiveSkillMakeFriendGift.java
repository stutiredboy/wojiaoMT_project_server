
package fire.pb.skill.liveskill;




import fire.log.enums.YYLoggerTuJingEnum;
import fire.pb.main.ConfigManager;
import fire.pb.skill.SSkillError;
import fire.pb.skill.SkillConstant;
import fire.pb.util.BagUtil;



// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CLiveSkillMakeFriendGift__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

/***
 * 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬锟界痪褔鏌ｉ妶鍛仼闁宠鍨堕獮濠囨煕婵炑冩噹缁躲倕霉閻樺樊鍎忛柣銈庡枟閵囧嫰寮介顫捕闂佸憡鑹剧紞濠囧蓟閻斿吋鐒介柨鏇嫹妤犵偞鍨甸湁婵犲﹤瀚惌鎺楁煛鐏為潻鎷烽幇浣告倯闂佸憡鍔戦崝宀勨�栫�ｎ喗鈷戞繛鑼额嚙楠炴牠鏌ｉ鍐ㄤ汗婵″弶鍔欓獮鎺懳旈敓鐣岀不閻斿吋鍊甸柨婵嗛婢т即鏌￠崱娆忊枅闁哄睙鍛＜婵☆垳鍘ч埛宀勬⒑閸濆嫯顫﹂柛鏂跨焸閸╃偤骞嬮敃锟介獮銏′繆椤栨粌鍔嬫い蹇曞█濮婄粯鎷呴崨濠冨創濠碘槅鍋呴悷鈺呭箖閻戣棄鐓涢柛娑卞弨閹芥洟姊虹紒妯荤叆闁告艾顑夊畷鏇炵暆閸曨剛鍘卞┑鐐村灦閿曨偄顔忛妷锔轰簻闊洢鍎茬�氾拷?
 * @author changhao
 *
 */
public class CLiveSkillMakeFriendGift extends __CLiveSkillMakeFriendGift__ {
	@Override
	protected void process() {
		// protocol handle
		
		final long roleid = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleid < 0)
			return;
		mkdb.Procedure liveskillmakefriendgift = new mkdb.Procedure()
		{
			@Override
			protected boolean process()
			{
				int skilllevel = 1;
				
				fire.pb.skill.SLifeSkill config = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkill.class).get(LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT);
				
				if (config == null)
				{
					LiveSkillManager.logger.error("CLiveSkillMakeFriendGift config error:" + LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT);
					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;						
				}
				
				fire.pb.skill.SLifeSkillCost cost = ConfigManager.getInstance().getConf(fire.pb.skill.SLifeSkillCost.class).get(skilllevel);
				if (cost == null)
				{
					LiveSkillManager.logger.error("CLiveSkillMakeFriendGift skill level error:" + skilllevel);
					
					psend(roleid, new SSkillError(SkillConstant.SkillError.LiveSkillIdError));
					return true;					
				}
				
				boolean energyenough = LiveSkillManager.getInstance().ConsumeMakeEnergy(roleid, LiveSkillManager.LIVE_SKILL_TYPE_MAKE_FRIEND_GIFT, 
						skilllevel,"婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牆濮涚紓浣哄█缁犳牠寮婚妸鈺傚亜閻犲洦鐣幘鍓佺＜缂備焦顭囬埦渚�鏌熷畡鐗堝殗鐎规洘锕㈠畷锝嗗緞鐎ｎ偄锟介绱撴担鍝勪壕闁稿骸纾槐鐐寸節閸パ嗘憰闂佹寧娲╅幏鐑芥懚閿濆鐓熸慨姗嗗墻閸ょ喓绱掗敓浠嬪幢濡炵粯鏂�闂佺粯鍔栧娆撴倶閻斿吋鐓曢柕濞垮劜鐠愶紕绱掗鑲╁ⅱ闁跨喐鏋荤紞鍡涘磻娴ｅ湱顩叉繝濠傜墛閻撴瑥霉閻撳海鎽犳繛鎳峰厾鐟邦煥閸曨厾鐓佺紓浣虹帛閻╊垰鐣烽悡搴樻婵☆垯璀﹀搴㈢節濞堝灝鏋涢柨鏇樺劚椤啴鎸婃径灞炬闂侀潧顭俊鍥╁姬閿熶粙姊洪崨濠冨闁告ê澧界划锝呂旈崨顔规嫽婵炶揪绲肩拃锕傛倿妤ｅ啯鍊垫繛鎴炲笚濞呭棛绱掔紒妯尖檨缂佺粯绻堝畷鎯邦槾闁伙綁绠栭幃妤呮儌閸涘﹤顏堕梻浣告啞濞诧箓宕戦崟顖涘殌闁割煈鍠掗弨浠嬫煟閹邦厽缍戦柣蹇ョ畵閺岋綁鎮㈠┑鍡樻悙闁稿被鍔戦弻鐔碱敍閸☆厽瀚归梺鐚存嫹濞寸姴顑嗛悡鐔兼煙闁箑澧伴柟鐣屽Х缁辨挸顓奸崱妤冧桓闂侀潧娲ょ�氫即鐛�ｎ亖鏀介柛銉ㄥ煐椤ワ綁姊绘担鍝ユ瀮妞ゆ泦鍛煋闁荤喐澹嗛弳锕傛煏婵炑冪У鐎氳绻涢幋鐐垫噽闁绘帊绮欓弻娑樜熺紒妯虹３濠殿喖锕ュ钘夌暦閵婏妇绡�闁稿本绮堥幋鐑芥⒒娴ｄ警鐒鹃柨鏇樺劦閹冾煥閸喐娅㈤梺鍏间航閸庢娊宕弻銉︾厵闁告垯鍊栫�氾拷", YYLoggerTuJingEnum.tujing_Value_friendgive, false);
				
				if (energyenough == false) //濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喖顭烽弫鎰緞婵犲孩缍傞梻浣虹帛閿氶柛鐔锋健瀵娊宕奸妷锔规嫼缂備礁顑嗛娆撳磿韫囨柣浜滈柟瀛樼箥濡拷閻庢鍠栭…閿嬩繆閹间礁鐓涢柛灞剧煯缁ㄤ粙姊绘担渚劸闁哄牜鍓涚划娆撳箣閿旂粯鏅滈梺璺ㄥ櫐閹凤拷?婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌熺紒銏犳灍闁稿骸顦…鍧楁嚋闂堟稑顫岀紓浣哄珡閸ャ劎鍘遍梺鍝勭Р閸婃洘鏅堕弻銉﹀�垫慨姗嗗墰缁夋椽鏌″畝锟介崰鏍х暦濠婂棭妲鹃柣銏╁灡閻╊垶寮诲☉娆戠瘈闁稿本绋戞禒鎾⒑閸濆嫯顫﹂柛鏃�鍨甸锝夊箻椤旇棄锟界兘鎮归崶鍥у椤忓爼姊洪崨濠勨槈妞ゎ収鍓熷銊﹀鐎涙ǚ鎷婚梺绋挎湰閻熴劑宕楀畝锟界槐鎺楊敋閸涱厾浠搁悗娈垮枛椤攱淇婇幖浣哥厸濞达絽褰ㄩ弴銏＄厽閹兼惌鍨崇粔鐢告煕閻樻剚娈滅�规洘鍨垮畷鎺楁倷鐎电骞愰梻浣规偠閸庮垶宕曢柆宥嗗�舵い蹇撶墛閻撶喖鏌熼幆褍鑸归柛鏃撶畵閺屸�崇暆鐎ｎ剛袦閻庢鍠楅幐鎶藉箖濞嗘垶瀚氱憸搴ｏ拷姘秺閺屾盯鏁傜拠鎻掍紟闂佺懓鍢查崲鏌ワ綖濠靛鍊锋い鎺炴嫹妞ゅ骏鎷�? by changhao
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.EnergyNotEnough));
					return true;						
				}				
				
				int added = BagUtil.addItem(roleid, LiveSkillManager.ITEM_TYPE_FRIEND_GIFT, 1, LiveSkillManager.MakeStuff, fire.log.enums.YYLoggerTuJingEnum.tujing_Value_tongxinjie, 1, true);
				
				if (1 != added)
				{
					psend(roleid, new SSkillError(SkillConstant.SkillError.UnkownError));
					return false;						
				}
				
				SLiveSkillMakeFriendGift msg = new SLiveSkillMakeFriendGift();
				msg.itemid = LiveSkillManager.ITEM_TYPE_FRIEND_GIFT;
				mkdb.Procedure.psendWhileCommit(roleid, msg);	
				
				return true;
			}
		};
		
		liveskillmakefriendgift.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 800523;

	public int getType() {
		return 800523;
	}


	public CLiveSkillMakeFriendGift() {
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
		if (_o1_ instanceof CLiveSkillMakeFriendGift) {
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

	public int compareTo(CLiveSkillMakeFriendGift _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


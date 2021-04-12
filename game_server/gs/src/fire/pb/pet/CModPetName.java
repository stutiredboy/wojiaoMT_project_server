
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

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩線鏌熼崜褏甯涢柛瀣姍閺屾盯骞囬锟界痪褔鏌ｉ妶鍛伃婵﹦绮幏鍛村川婵犲倹娈橀梻浣告贡椤牆螞濠靛棛鏆﹂柕濞炬櫓閺佸秵绻濇繝鍌氭殭闁兼惌鍨跺濠氬磼濮橆剨鎷锋搴ｇ焼濞达綁娼婚懓鍧楁⒑椤掞拷缁夌敻骞嗛悙鍝勭婵烇綆鍓欐俊鑲╃磼閹邦収娈曞ǎ鍥э躬婵″爼宕ㄩ鍏碱仩缂備胶鍋撻崕鎶解�﹂悜钘夎摕闁哄洢鍨归柋鍥ㄧ節闂堟稒鎼愭い锔规櫊濮婃椽宕妷銉愶綁鏌涢弮锟介悷鈺侇嚕婵犳碍鏅搁柣妯垮皺閿涙粌鈹戦悩缁樻锭婵炲眰鍔戞俊瀛樼節閸ャ劉鎷洪梺鍛婄箓鐎氼參鏁嶉弮鍌滅＜闁绘娅曞畷宀�锟芥鍠栭…宄邦嚕閹绢喗鍋勫瀣捣閻涱噣姊绘担铏广�婇柛鎾寸箚閹筋偊姊虹紒妯肩畺婵☆偄鍟～蹇曠磼濡顎撶紓浣割儓閸庡宕洪悙娴嬫斀闁绘劕寮堕埢鏇㈡煕濞嗗繐鏆欐い鏇稻缁绘繂顫濋鐔哥彸濠电姰鍨煎▔娑㈡晝閿曞倹鍎撻柛鏇ㄥ灡閳锋垿鎮归幁鎺戝闁哄鐟ラ埞鎴︻敊閸濆嫸鎷峰Δ鍐ㄥ灊閻庯綆浜堕崥瀣煕閳╁啰鎳愭繛鏉戝閺岋絾鎯旈婊呅ｉ梺绋款儏閹冲酣鍩㈠澶婎潊闁靛牆妫岄幏娲⒑閸涘﹦绠撻悗姘煎墴閺佹捇鎸婃径灞界厽閻庤娲橀崝娆忣嚕娴犲鏁冩い鎺嶇椤忚泛鈹戦绛嬬劷闁稿鎸鹃敓鑺ョ啲閹凤拷,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧湱锟界懓瀚崳纾嬨亹閹烘垹鍊為悷婊冪箻瀵娊鏁冮崒娑氬幈濡炪値鍘介崹鍨濠靛鐓曟繛鍡楃箳缁犲鏌″畝锟介崰鎾舵閹烘顫呴柣妯虹－瑜邦垶姊绘担鑺ャ�冪紒锟芥担鐚存嫹濮橆偄宓嗙�殿喛顕ч埥澶娢熼柨瀣垫綌婵犵數鍋涘Λ娆撳礉濡ゅ啰鐭欓柛銉墯閳锋垶鎱ㄩ悷鐗堟悙闁跨喎顫曢崐婵嗙暦娴兼潙鍐�妞ゆ挾鍠撻悾鎶芥⒒閸屾瑨鍏屾い顓炵墢閹广垽骞囬弶鑳曢柣搴秵閸撴稓绮堟繝鍥ㄧ厵閺夊牓绠栧顕�鏌ｉ幘瀵告创闁诡喗顨婇弫鎰板磼濞戞瑧褰囩紓鍌欑劍閸旀牕螞閸愵喖钃熼柨娑樺濞岊亪鏌ｉ幇闈涘妞わ缚鍗抽幃妤冩喆閸曨剛顦梺鍛婎焼閸パ呭幋闂佺鎻粻鎴︽倷婵犲洦鐓犻柛婵勫労閺嗘粌螖閻樿尙绠绘慨濠傤煼瀹曟帒鈻庨幋顓熜滅紓浣稿⒔閾忓酣宕ｉ崘顔惧祦濠电姴娲ょ粻濠氭煕閹捐尪鍏岄柣鎾愁儔濮婂搫效閸パ呬紕濡炪値鍘奸悧濠囥�佹繝鍥ㄢ拻濞达絽鎲￠崯鐐寸箾鐠囇呯暤鐎规洖缍婇獮宥夘敊閹勬闁诲骸绠嶉崕閬嵥囨导瀛樺亗闁哄洢鍨洪悡蹇擃熆閼稿緱顏堝几閵堝悿褰掓偐椤旇偐浼堥梺鍝勭灱閸犳牕鐣峰鍡╂Ь闁汇埄鍨遍惄顖炲蓟閿濆绠婚悗闈涙啞閸掓盯姊洪崫鍕拱闁烩晩鍨跺畷娲晝閸屾稒娅㈡繛瀵稿Т椤戝懘鎮块悙顒傜闁瑰鍎戞笟娑㈡煕閵堝棙绀冮柕鍥у瀵挳顢旈崨顓т紦闂傚倷绀侀幖顐︽儗婢跺本顫曢柡鍥╁枔椤╃兘鏌ㄩ弴鐐诧拷鍝ョ矆閸垺鍠愬璺好￠敐澶婇唶婵犲灚鍔栫�靛矂姊洪棃娑氬濡ょ姴鎲＄粋宥呪攽閸垻锛滈柣鐘叉穿鐏忔瑦鏅堕敃鍌涚厪闁糕剝娲滈ˇ锕傛懚閺嶎厽鐓曟繛鎴濆船楠炴﹢鏌ㄥ☉娆戠煉婵﹨娅ｇ划娆撳箰鎼淬垺瀚抽梻浣瑰瀹�鎼佸蓟閿濆牏鐤�闁哄啫鍊稿銊╂⒑閸濆嫬顦柨鐔绘绾绢參寮抽崱娑欏�甸柨婵嗛婢ф壆鎮敃鍌涒拻濞达綀娅ｉ妴濠囨煛閸涱喚娲撮柡浣稿暣婵¤埖寰勬繝鍕箳闂佺懓鍚嬮悾顏堝磹濡ゅ懏鍋柨鐔剁矙濮婃椽宕崟顐嫹瑜版帩鏁勬繛鍡楃簿閿濆鐒肩�广儱妫岄幏缁樼箾鏉堝墽瀵奸悹锟介敃鍌涘�块柟顖ｇ仜閺冨牊鍋愰柛娆忣槹閸犳劗绱撴笟鍥ф灍婵☆偂绶氭俊鐢稿箛閺夎法顔婇梺纭呮彧缁查箖骞夐悧鍫㈢瘈闁汇垽娼ф禒锕傛煕椤垵鐏︾�规洜顢婇妵鎰板箳閹寸媭鏀ㄩ梻浣筋潐閸庡吋鎱ㄩ妶澶嬪亗闊洦鎸撮弨浠嬫煟閹邦垰鐨哄ù鐘灲閺屾盯寮敓浠嬫偡瑜忓Σ鎰板箳濡わ拷鎯熼梺闈涚墕濞层劑鎮￠幘鏂ユ斀妞ゆ梻銆嬮弨缁樹繆閻愯埖顥夐柣锝囧厴閹粎绮电�ｎ偅娅嶉梻浣虹帛閺屻劑骞楀鍡愪汗鐟滃秹鍩為幋锔藉亹闁割煈鍋呭В鍕⒑缁嬪灝顒㈤柛銊ユ健閻涱喛绠涘☉娆忥拷濠氭煠閹帒鍔楅柟閿嬫そ濮婃椽宕ㄦ繝鍕暤闁诲孩鍑归崢濂告晝閵忋倕绠ユい鏂垮⒔閿涙粓鏌ｆ惔顖滅У闁稿鎳愭禍鎼佸箥椤斿墽锛滈梺绋挎湰缁嬫垵霉椤曪拷閺屸剝鎷呯粙鍖℃嫹閸ф绠栨繛鍡樻惄閺佸棝鏌ㄩ悢鍓佺煓闁诡喖鐏氱�佃偐锟芥稒菤閹锋椽姊洪棃鈺佺槣闁告ê澧介弫顔尖槈閵忊�充缓濡炪倖鐗楅〃鍡椻枍閸涱喓浜滄い鎾跺仦婢跺嫮绱掔紒妯肩疄鐎规洜鍠栭、姗�鎮崨顖炴７闂傚倸鍊烽懗鍫曗�﹂崼銉ュ珘妞ゆ帒瀚崑锟犳煥閺傚灝鈷旈柣顓炵墦閺岋絽螖閿熶粙鎮ч崟顒傤洸婵犲﹤鐗婇悡娑㈡煕閵夋垵瀚峰Λ鐐测攽閻愯尙婀撮柛濠冪箞楠炲啴宕稿Δ濠冩櫔闂佽法鍠嶇划娆忣嚕婵犳碍鍋勯悘蹇庣劍閻忎線姊洪崜鑼帥闁哥姵顨婇幃姗�宕奸妷锔规嫼闂佺鍋愰崑娑欎繆閻ｅ瞼纾奸悹鍥ㄥ絻閺嗙喖鏌熼獮鍨仼闁宠棄顦垫慨锟介柣妯垮蔼閿熻棄鐏濋埞鎴﹀煡閸℃浠村┑鐐叉嫅缂嶄礁鐣烽姀銈呯疀闁绘鐗冮幏娲偡濠婂懎顣奸悽顖楁櫅铻為柟杈鹃檮閻撴洟鐓崶銊︻棖闁兼媽娉曢敓鑺ヮ問閸ｎ噣宕戞繝鍥╁祦闁搞儺鍓﹂弫宥嗙節婵犲倹鍣烘繝銏″灴濮婄粯鎷呴崨濠冨創闂佺锕ょ紞濠囥�侀弽褉鏋庨柟閭﹀墻閸ゃ倝姊虹捄銊ユ珢闁瑰嚖鎷�??
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


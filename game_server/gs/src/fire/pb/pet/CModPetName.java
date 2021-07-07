
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

		// 闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╃窔閺岀喖宕滆鐢盯鏌涚�ｎ偄濮嶉柡灞剧洴楠炲洭顢楅敓鐣岀棯瑜旈弻锝夊Χ閸涱収浼冨┑顔硷功缁垶骞忛崨鏉戝窛濠电姴鍊瑰▓姗�姊绘担鍛婅础妞ゎ厼鐗嗚灋婵犻潧妫涢弳锕傛煏婵炵偓娅撻柡浣哥У缁绘繃绻濋崒姘闂佸吋鎯岄崹璺侯潖婵犳艾纾兼慨姗嗗墾閹烽攱顦版惔锝囩劶婵炶揪缍佸濠氭嚀閸ф鈷戞い鎺炴嫹缂佸鏁婚獮鍡涙倷閸濆嫮顔愬┑鐑囩秵閸撴瑦淇婇懖鈺冪＜闁归偊鍙庡▓鏇炃庨崶褝韬┑鈥崇埣瀹曘劑顢欓崗纰变哗缂傚倷鑳堕崑鎾诲磿閹惰В锟斤箓鎮滈挊澶庢憰闂佸搫娲㈤崹褰掓煁閸ャ劎绡�闂傚牊绋掗幖鎰亜閿旇娅婃慨濠冩そ瀹曨偊濡烽妷鎰剁秮閺屾盯寮敓浠嬫偡閳轰緡鍤曞┑鐘崇閺呮悂鏌ｅΟ鍨毢闁挎稒绮岄埞鎴︽偐缂佹ɑ閿┑鐐茬湴閸旀垶淇婄�涙绡�闁搞儯鍔夐幏娲⒑閸涘﹦绠撻悗姘煎弮閺佸秹寮崒婊咃紲闂佺粯顭堝▍鏇炵暦瀹�锟介敓鑺ヮ問閸犳牠鈥﹀畡閭﹀殨闁圭虎鍠楅崑鍕渻鐎ｎ亝鎹ｉ柣娑卞櫍濮婄粯鎷呴搹骞匡拷濠囨煕閹惧绠氶柟绛嬪亰濮婅櫣绱掑Ο鑲╃暫濠碘槅鍋勯崯顐︼綖韫囨洜纾兼俊顖濐嚙椤庢挾绱撴担鍓插創闁稿骸顭峰畷娲倷濞村鏂�闂佺粯鍔曞鍫曞煝閺囥垺鐓曟繛鍡楃箰閺嗘瑦銇勯弴顏嗙ɑ缂佺粯绻傞～婵嬵敇閻斿摜褰告繝鐢靛О閸ㄧ厧鈻斿☉銏℃櫇闁挎洖鍊归崕鎾绘煕閺囥劌鐏￠柍閿嬪灴閹綊骞侀幒鎴濐瀳闂佸搫顑嗛悷銉╁煘閹达富鏁婇柛婵嗗閹峰嘲螖閸愩劌鐏婇柣搴秵娴滃爼宕ョ�ｎ喗鐓曢柍鈺佸暟閹虫劖绻涢弶鎴濐伃闁哄矉绲鹃幆鏃堫敍濠婂憛锝夋⒑缁嬫鍎忛柟鍐查叄閸┿垹顓兼径濠庢綂闂侀潧鐗嗗Λ宀勫箯濞差亝鈷戦柛娑橈功缁犳捇鎮楀鐓庡⒋闁轰焦鎹囬幐濠冨緞鐏炵晫鍘介柣搴ゎ潐濞叉﹢宕濆▎蹇ｅ殨濞寸姴顑愰弫鍐┿亜閹哄秶顦︽い蹇氭硾閳规垿顢欑粵瀣姺闂佺顑嗛幐楣冩晸閼恒儳鍟查柟鍑ゆ嫹,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳婀遍敓鐣屾嚀鐎氼參宕崇壕瀣ㄤ汗闁圭儤鍨归崐鐐烘偡濠婂啰绠荤�殿喗濞婇弫鍐磼濞戞艾骞堟俊鐐�ら崢浠嬪垂閸偆顩叉繝闈涱儐閻撴洘绻涢崱妤冪缂佺姴顭烽弻鈥崇暆閿熶粙宕伴幘鑸殿潟闁圭儤顨呴～鍛存煟濡櫣锛嶇憸閭﹀灦濮婄粯鎷呴懞銉ｏ拷鍐磼閿熻姤鎷呴悮瀛樺婵﹩鍋勫畵鍡欙拷娈垮枦椤曆囧煡婢跺á鐔兼煥鐎ｅ灚缍屽┑鐘垫暩閸嬫稑螞濞嗘挸绀夋俊銈呭暟閻瑩鏌涢妷顔煎闁抽攱鍨堕幈銊╂偡閻楀牊鎮欓梺璺ㄥ枎椤洟宕愬┑鍡欐殾濞村吋娼欓崘锟藉銈嗘尵閸犳捇鎮鹃幎鑺モ拻闁稿本鐟ㄩ崗灞俱亜椤撶偟澧㈤柟骞垮灲楠炲洭寮堕懗顖呮洟鏌ｆ惔顖滅У闁告挻绋撶划鍫熺節閸ャ劎鍘甸柡澶婄墦缁犳牕顬婇锟介弻锝夊箻鐎靛憡鍒涢梺璇″枟椤ㄥ﹪寮幇鏉跨＜婵炴垶鐟цぐ鍥╃磽閸屾瑧鍔嶉柛鏃�鐗曡灋闁告劦鍠栭拑鐔兼煥濞戞ê顏ф繛宀婁邯閺岋綁骞囬棃娑橆潾濡炪倧缂氶崡鎶藉箖濡ゅ啯鍠嗛柛鏇ㄥ墰椤︻參姊洪崨濠庣劶闁搞儜鍛箣闂備胶顢婇幓顏嗙不閹达附鍊峰┑鐘叉处閻撶娀鏌涘┑鍕姶闁哄棙绮岃灃闁绘灏欑粻缁樻叏婵犲偆鐓肩�规洘甯掗埢搴ㄥ箣椤撶啘婊呯磽娴ｇ鈷旈柧蹇撻叄瀹曪綁宕橀鎯хウ婵犵數濮村ú銈囩不婵犳碍鐓曢柟鎹愬蔼閸忓矂鏌ｉ幘鎰佸剶婵﹤鎼晥闁搞儜鍛磿婵＄偑鍊ら崢濂告偋婵犲洢锟戒焦绻濋崶銊㈡嫽婵炶揪绲介幉锟犲疮閻愬绠鹃悹鍥囧懐鏆ら悗瑙勬礀缂嶅﹪鐛澶樻晩闁诡垎鍕唫闂佽楠哥粻宥夊磿闁单鍥ㄥ鐎涙ê浜楅梺鍝勬储閸ㄦ椽鎮¤箛鎿冪唵闁肩绶遍鍫濆嚑闁靛牆鎮胯ぐ鎺撳亹妞ゆ棁鍋愭导鍫ユ⒑閸濆嫮鐏遍柛鐘崇墪閻ｅ嘲顭ㄩ崱鈺傂梺姹囧焺閸ㄩ亶鎯勯鐐茶摕闁挎繂顦粻濠氭倵闂堟稒鍟為柛鎺撶洴濮婃椽宕崟顒佹嫳闂佺儵鏅╅崹璺虹暦濞差亝鏅濋柛灞剧♁濞呫垺绻涚�电孝妞ゆ垵鎳橀幃鍧楁倷椤掑倻顔曢梺鐟邦嚟閸庢垶绗熷☉銏＄厱闁靛牆妫欑粈鍐煏閸パ冾伃鐎殿喗鎸抽、鏃堝川椤撗傜处闂傚倸鍊风粈渚�骞栭锔藉剹濠㈣泛鏈～鏇㈡煛閸モ晛鏋旀い鈺冨厴閺屻劑寮撮悙璇ф嫹閸濄儳鐭嗛柛顐犲灪閸犳劕顭跨捄濂斤繝鏁愭径濠囧敹濠电姴鐏氶崝鏍拷闈涚焸濮婃椽妫冨☉姘暫婵°倗濮撮幉锛勭矉瀹ュ應鏀介柛顐犲灮閿涙粓鏌ｉ悩鍙夌┛閻忓繑鐟﹂弲鍫曟晝閸屾稓鍘梺绯曞墲濞叉粓藝閿曞倹鎳氶柡宥庡幗閻撴洘绻涢幋婵嗚埞妤犵偞锕㈤弻銊モ槈濞嗘垹鐓夊┑顔硷龚濞咃絿鍒掑▎鎾崇閹兼番鍨虹�氭娊姊绘担鐟邦嚋鐎癸拷閹间礁钃熼柨婵嗙墢閻わ拷闂佸搫鍟崐绋款嚕閵娾晜鈷戦柛婵嗗椤︻剟鏌ㄩ悢缁橆棄缁剧虎鍙冨鎶藉幢濞戞瑥锟界敻鏌ㄥ┑鍡涱�楀褎澹嗛幃顕�鏁冮崒娑掓嫽婵炶揪缍�濞咃綁濡存繝鍥ㄧ厸闁告侗鍠氬ú鎾煛娴ｇ鏆ｅ┑陇鍩栧鍕節閸曨偄绠抽梻浣烘嚀閸氬鎮鹃鍫濈９婵°倕鎳忛崑顏堟煥閻斿墎鐭欐慨濠冩そ瀹曨偊宕熼顒佸鐟滅増甯╅弫鍕箾閸℃绨块柨婵嗩槹閻掕偐锟藉箍鍎卞Λ宀勫箯缂佹绠鹃弶鍫濆⒔鐎靛ジ鎮归敓浠嬫晝閸屾稑锟藉潡鏌熼锝囦粶闁哄啫鐗婇崑鎰版煕濞嗗浚妲归柛鐘冲姉缁辨挻绗熼崶褎鐏嶅┑鈽嗗亗缁舵碍淇婇悽绋跨疀闁哄娉曢濠囨⒑绾懏褰х紒鏌ョ畺楠炲鎮ч崼銏㈢槇闂佹眹鍨藉褎绂掗敃鍌涚厱妞ゎ厽鍨甸悘锔撅拷瑙勬礈椤㈠﹪濡甸幇鏉跨闁瑰濯弨銊╂⒒娴ｇ瓔娼愰柛搴″悑閹便劑濡舵径瀣簵闂婎偄娲﹂幐鎾绩娴犲鐓熼柟閭﹀灠閻ㄥ搫霉閻橆喖鐏查柡灞剧洴瀵噣鏁撴禒瀣仭鐟滃繐危閹版澘绠虫俊銈忔嫹閹喖姊洪棃娑氬婵炲眰鍔戦幃锟犲箻閺傘儲鏂�濡炪倖姊婚妴瀣绩缂佹ü绻嗛柣鎰煐椤ュ鏌ｉ敐鍥у幋闁诡喗绮庣划鐢碉拷锝庡亝濞呭秹姊绘担铏瑰笡闁哄被鍔戦獮妤�顭ㄩ崱鎰睏閻熸粌绉归崺鐐哄箣閿旇棄浜归梺鍓茬厛閸嬪懎袙閸曨垱鈷戠紒瀣仢椤掋垽鏌涢妸銉﹀仴闁绘侗鍠涚粻娑樷槈濞嗗骏鎷锋繝姘厾闁诡厽甯掗崝妤呮煙闁垮銇濇慨濠冩そ瀹曘劍绻濋崟顓犳殼闂佽瀛╅崙褰掑储婵傚憡鏅濋柕蹇嬪�曠粻銉︺亜閺傚灝鈷旈柨娑欑矒閺岋絾鎯旈婊呅ｉ梺绋款儏閹虫劖绂嶉幖浣哥妞ゆ柨澧介敍婊堟⒑缁嬫寧婀扮紒瀣灥闇夋い鏇嫹闁哄备鍓濋幏鍛矙閸栤剝瀚归柛褎顨呯粻鏍ㄧ箾閸℃ɑ鎯勯柡浣告閺屻劑鎮㈤崜浣虹厯闂佽鍠栭悘姘憋拷浣冨亹閿熻姤绋掕彜闁归攱妞藉娲閳轰胶妲ｉ梺鍛娒晶浠嬪极椤斿皷妲堥柕蹇婏拷鍏呯紦婵＄偑鍊栭悧妤呫�冮崱妞绘瀺闁告侗鍠撴禍婊勩亜閹捐泛浠﹀璺哄缁辨帞绱掑Ο鑲╃杽閻庤娲滈崰鏍�佸锟介幃顏堝川椤栫偞锛楅梻鍌氬�搁崐鐑芥嚄閸洍锟斤箓宕奸妷銉ョ彉濡炪倖甯掔�氼參宕戦敓鐘崇叆闁哄倸鐏濋埛鏃堟煟椤撶偟澧﹂柡宀嬬到铻栭柨鐔剁矙閹囧礋椤掑偆娲稿┑鐘诧工閻楀﹪鎮″☉銏＄厱闁靛鍨电�氬嘲螞閻愭祴鏀介柣鎰皺濠�鎾煕婵犲啰绠炴鐐插暣瀹曠螖婵犲啯娅旈梻浣芥硶閸犲秶鍒掑▎蹇ｅ殨濠电姵纰嶉崑鍕倶韫囧海鍔嶉柣蹇庣窔濮婃椽宕滈懠顒�甯ラ梺鍝ュУ椤ㄥ﹪骞冨锟藉畷濂稿Ψ閿旇瀚奸梻浣侯攰閸嬫劙宕戝☉娆庣箚闁伙絽鐬肩壕濂告偣閸ャ劌绲婚柡鍡欏枛閺岀喖鐛崹顔句患闂佸疇妫勯ˇ鍨叏閿熶粙鏌ｅΟ鍨敿闁跨喕妫勯悘婵嬪煘閹达箑鐓￠柛鈩冾殘娴犳潙鈹戦悙鍙夊珔缂傚秳绀侀悾鐑藉閵堝懐鐤�闂佺粯顨呴悧鍐箯濞差亝鍋℃繝濠傛噹椤ｅジ鎮介妤佹珔閾荤偤鏌熸潏楣冩闁绘挻娲熼悡顐﹀炊閵婏富妫栭梺鍏煎濞夋洟鏁撻懞銉晱闁革綆鍣ｅ畷鎴炵節閸モ晛绁﹂梺鎼炲労閸擄箓寮鍡欑瘈濠电姴鍊归崳鐑樼節閵忊�崇伌婵﹦绮幏鍛村川婵犲啫鍓甸梻浣侯焾閿曘倗绱炴繝鍥ワ拷渚�寮借閺嬪酣鏌熼柇锕�澧婚柛銈冨�濆铏规崉閵娿儲鐝㈤梺鐟板殩閹凤拷??
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


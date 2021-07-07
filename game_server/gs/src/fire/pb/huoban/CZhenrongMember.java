
package fire.pb.huoban;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __CZhenrongMember__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CZhenrongMember extends __CZhenrongMember__ {
	@Override
	protected void process() {
		// protocol handle		
		final long roleId = gnet.link.Onlines.getInstance().findRoleid(this);
		if (roleId < 0)
			return;
		
		if (members.size() > 4)
			return;
		
		java.util.Set<Integer> setMember = new java.util.HashSet<Integer>(members.size());
		setMember.addAll(members);
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鎯у⒔閹虫捇鈥旈崘顏庢嫹閿濆簼绨奸柟鐧哥秮閺岋綁顢橀悙鎼闂侀潧妫欑敮鎺楋綖濠靛鍊锋い鎺炴嫹妞ゅ繗鍩栨穱濠囧Χ閸ヮ灝銉╂煕鐎ｎ偆娲撮挊婵嬫煟閵忋埄鐒鹃柡瀣╄兌閿熻棄绠嶉崕閬嵥囬婊呯焼閻庯綆鍋佹禍婊堟煙閸濆嫮肖闁告柨绉甸妵鍕棘閹稿骸鏋犲┑顔硷功缁垶骞忛崨顖涘枂闁告洦鍋傞崫妤呮⒒娴ｄ警鐒鹃悗娑掓櫅椤啴鎸婃径灞炬濠电姴锕ら崯鐘诲几鎼淬劍鐓欓悗娑欘焽缁犮儲淇婇锝囩煉闁诡喖鍢查…銊╁川椤撗勬瘔闂佹眹鍩勯崹閬嶃�冩繝鍥х畺闁炽儲鏋煎Σ鍫熸叏濡厧浜鹃悗姘愁潐椤ㄣ儵鎮欓懠顑胯檸闂佸憡姊归懝鎹愮亙闂佺粯顭堝▍鏇㈠磹閹扮増鐓熸繛鎴濆船濞呭秶锟芥鍠曠划娆撱�佸锟介幃銏ゅ传閸曨偆鐫勯梻鍌氬�风粈渚�骞夐敓鐘茬闁挎梻鏅々鍙夌節婵犲倻澧曢柛鎴犲У缁绘盯骞嬪▎蹇曚痪闂佺粯鎸婚惄顖炲箖濮楋拷閹瑩骞撻幒鍡樺瘱婵犵數鍋涘鍫曞箰閹惰棄钃熼柍鈺佸暞婵挳鏌ｉ悢鍛婄凡妞ゎ偅甯￠幃妤冩喆閸曨剛锛橀梺鍛婃⒐閸ㄥ潡濡存担绯曟瀻闁规儳纾ˇ顓烆渻閵堝骸澧婚柛鐘冲浮瀵娊寮伴妴鍞晄闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ょ紓宥咃躬瀵鏁愭径濠勵吅闂佹寧绻傞幉娑㈠箻缂佹鍘辨繝鐢靛Т閸婂綊宕戦妷鈺傜厸閻忕偠顕ф慨鍌滐拷娈垮枟濞兼瑩锝炲┑瀣殝婵炲牆灏呴幏鐑藉冀閵娧咁啎闁诲孩绋掗…鍥儗婵犲嫮纾界�广儱鎷戦煬顒傦拷娈垮枦椤曆囧煡婢舵劕顫呴柣妯兼暩閺夋悂姊婚崒姘拷鎼佹偋婵犲嫮鐭欓柟鐑橆殕閸婂爼鏌涢鐘插姕闁绘挾鍠栭獮鏍庨锟介悘鍗烆熆鐟欏媶鎴﹀Φ閸曨垱鏅滈柛顭戝枛缁侇喗绻濈喊澶岀？闁轰浇顕ч悾鐑芥偄绾拌鲸鏅┑顔斤耿绾悂宕ú顏呪拻濞达綀娅ｇ敮娑㈡煕閺冿拷閻楁洟鈥﹂崶褉鏋庨柟鍨暞閺呮粓姊洪崜鎻掍簼婵炲弶锕㈤崺娑㈠箣閿旂晫鍘卞┑鐐村灦閿曗晠鎮￠浣虹闁割偆鍠撻惌濠囨婢跺绡�濠电姴鍊搁弳鐔兼煕閳哄鎮奸柨鐔诲Г椤旀牠宕伴弽顓涳拷锕傛倻閽樺鐣洪梺闈涚箞閸婃洜绮堥崒鐐村�堕煫鍥ㄦ⒒婢ь剟鎮楀顐ょ煓婵﹨娅ｉ幏鐘诲蓟閵夈儱鍙婃繝鐢靛仒閸栫娀宕熼鐘查獎濠电姷鏁告慨瀛樺閿濆鏅插鑸瞪戦弲顏堟⒑鐠恒劌鏋嶇紒顔界懃椤曪絾绻濆顓熸珳婵犮垼娉涢鍛濠婂牊鈷戦柛娑橈功缂傛岸鏌涙惔銏㈠弨鐎规洜鏁诲畷鎺戭煥閸涱垽绱冲┑鐐舵彧缁蹭粙骞栭锝囧ⅰ闂傚倷绀佸﹢閬嶅箠閹捐秮娲Χ婢舵ɑ鏅梺鎸庣箓濡稓寮ч敓钘夆攽椤旀枻渚涢柛搴ｆ暬閸╋繝宕ㄩ鎯у笚闂佸搫顦遍崑鐐村垔娴犲绀傜�癸拷閸曨剛鍘藉銈嗗姂閸ㄥ綊顢旈鐔稿弿濠电姴鍟妵婵囶殽閻愬澧甸柟顔界懇楠炴捇骞掗幊韬插�濆缁樻媴缁涘娈紓浣虹帛閸ㄥ綊骞戦姀銈呴唶闁靛／鍐偊婵犳鍠楅〃鎰板箯妞嬪函鎷风憴鍕缂侇喖绉归獮蹇涘川鐎涙ê浠忛柣搴ｆ暩椤牏鑺遍妷鈺傗拻闁稿本鑹鹃敓鐣屽厴閹虫宕滄担绋跨亰濡炪倖鐗滈崑鐐哄疾椤忓牊鈷掑ù锝呮啞閹叉悂鏌涢悩鏌ュ弰闁诡喗锚閳规垹锟斤綆鍋嗛悾鍐测攽閿涘嫬浜奸柛濠冪墪铻炲ù锝堫潐閸欏繘鏌曢崼婵愭Ц闁活厽顨婇悡顐﹀炊閵婏箑鐨戦梺鐚存嫹濞寸姴顑嗛悡鐔镐繆椤栨繍鍤欑紒鎻掝煼閺岋繝宕卞▎蹇庢闂佸搫鏈ú鐔风暦閸洖惟鐟滃繘鎮鹃崫鍕垫富闁靛牆鍟俊鎼佹煕鎼达絾鏆鐐插暙閳诲酣骞嬮娑橆伓濠电偞鍨堕顏堫敂閸℃妫滈梺鍛婂姇瀵剟寮崼鐔蜂汗闂傚倸鐗婄粙鎰柦椤忓牊鐓熼柕蹇婃櫅閻忔瑩鏌ㄩ悢璇残撻柛鎾村哺瀹曠敻寮撮悢缈犵盎闂佺娅ｉ崑鐐碉拷姘秺濮婅櫣锟藉湱濯鎰版煕閵娿儳浠㈤柣锝囧厴閹垻鍠婃潏銊︽珖闂備線娼ч悧鍡欙拷姘煎枛铻炴い鏍仦閳锋帡鏌涚仦鍓ф噮缂佹劖姊圭换娑欐媴閸愭彃骞樻繛宸簻鍥撮梺鎼炲劦閺�杈╋拷姘愁潐閹便劌顫滈崱妞剧盎閻庤鎸稿Λ娑㈡晸閼恒儺鍟忛柛锝庡櫍瀹曟垶绻濋崒婊勬闂佸湱鍎ら〃鍡涘磹閻戣姤鐓涘璺侯儏閻忥綁鏌熼鍡欑М婵﹨娅ｉ幏鐘绘嚑椤掑偆鍞洪梻浣侯焾椤戝洦鎱ㄧ壕瀣罕闂備礁鎲″ú锕傚储閸撗冾棜濠靛倸鎲￠悡鍐煕濠靛棗顏柛锝嗘そ閺屽秹鏌ㄧ�ｎ亞鐟ㄩ梻鍥ь樀閺屻劌鈹戦崱妯虹獩闂佺妫勯崐鍧楀蓟濞戙垹围闁告侗鍘藉▓濠氭⒑閸濆嫭婀伴柣鈺婂灡娣囧﹪骞栨担鑲澭囨煕濞戝崬骞橀柕鍫櫍閺岋絾鎯旈妶搴㈢秷濠电偠顕滅粻鎾崇暦閸︻厽宕夊〒姘煎灠濞堛劑姊洪崜鎻掍簼婵炲弶鐗滅划濠氭晲婢跺鍘藉┑鈽嗗灡鐎笛囨偟椤忓懌浜滈柡鍐挎嫹婵炲弶顭囬幑銏犫攽閸″繑鐏侀梺鍓茬厛閸犳鎮樺鍜佹富闁靛牆楠搁獮鏍煟濡や焦灏柣锝呭槻鐓ゆい蹇撳閸炪劌顪冮妶鍡樺暗闁稿鍠栭弫宥呪槈閵忊檧鎷虹紓鍌欑劍閿曗晠鎮為悾宀�纾兼い鏇炴噹閻忥箓鏌熼鍡欑瘈濠碉紕鍏橀崺锟犲磼濠婂啫绠洪梻鍌欑閹碱偄煤閵娾晛纾绘繛鎴欏灪閺呮悂鏌﹀Ο渚Ч閻犳劧绻濋弻銊╂偄鐠囨畫鎾绘煟閺冩垵澧存鐐茬箻閺佹捇鏁撻敓锟�
		if (setMember.size() != members.size()) {
			return;
		}
		
		new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN).submit();
		
//		new xdb.Procedure()
//		{
//			protected boolean process() throws Exception {
//				if (members.size() > 4)
//					return false;
//				xdb.Procedure.pexecute(new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN));
//				return true;
//				boolean suc = huobancol.setFightHuoBans(members);
//				if (suc) {
//					//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婄拋鏌ュ几濞嗘挻鈷戠紓浣姑粭鈺佲攽椤斿搫锟芥骞戦姀鐘闁靛繒濮撮懓鍨攽閳藉棗鐏ユい鏇嗗懎鏋堢�广儱顦伴悡鐔兼煟閺傛寧鎲搁柟铏礈缁辨帡鎮╅搹顐㈢３濡ょ姷鍋涢崯顐ョ亙闂佸憡渚楅崰妤�鈻嶅鍫熺厵闁兼祴鏅炶棢闂佸憡鎸荤换鍫ュ箖濡警鍚嬪璺侯儌閹疯櫣绱撴担鍓插剱妞ゆ垶鐟╁畷鏇烆煥閸涱垳锛滅紓鍌欑劍椤洨绮婚悙纰夋嫹濞堝灝鏋涙い顓炲槻椤曪綁骞橀纰辨綂闂佺粯顭堥褔寮憴鍕瘈闁汇垽娼у瓭闂佽绻戝畝绋跨暦濠靛鍐�妞ゆ劑鍊栭崳顔剧磽閸屾艾锟芥悂宕愰悜鑺ュ殑闁割偅娲橀幆鐐哄箹濞ｎ剙濡奸柣顓燁殜閻擃偊宕堕妸褉妲堢紓浣哄閸ㄥ爼寮婚敐澶婄闁挎繂鎲涢幘缁樼厓闂佸灝顑呯粭鎺楁婢舵劖鐓ユ繝闈涙瀹告繈鏌熼挊澶婏拷鍦崲濞戙垹绀傞柣鎾抽椤帡姊洪崫鍕拱缂佸甯￠獮鍡涘籍閸繄浼嬮梺鎯ф禋閸嬪嫰鏁撶粵瀣仸婵﹥妞介弻鍛槈濮橈絾鏅欓梻浣告啞濮婂綊宕归懜鐢碘攳濠电姴娲﹂崵瀣⒒閸喓銆掔紒鎰仦缁绘繈鎮介棃娴躲垽鎮楀鐓庡⒋闁绘侗鍣ｅ畷濂稿Ψ閿旇瀚藉┑鐐舵彧缁插潡宕曢妶澶婂惞闁跨喕濮ょ换婵嬪煕閿熶粙宕ㄩ鐣屽涧闂備礁鎲＄敮妤冩暜閿熺姰锟戒礁鈽夐姀鈥筹拷鐑芥煠绾板崬澧鐐茬墦濮婄粯鎷呴崨濠呯闂佺绨洪崐婵嬪Υ閸愵喖骞㈡繛鎴炵懃娴滄姊洪崫鍕窛闁哥姴妫欑粋宥咁煥閸喓鍘甸梺閫涚祷濞呮洖鈻嶉崨瀛樼叆闁绘棁顕ц濠电偠灏欓崰搴敋閿濆洨鐭欐繛鍡樺劤閹垿姊洪幖鐐插姉闁哄懏绻堥弫宥咁煥閸啿鎷洪梺鍛婃尰瑜板啯绂嶅┑鍥╃闁告瑥顦悘瀛橆殽閻愬樊妲归柕鍫秮瀹曟﹢鍩￠崘銊ョ闂備浇顕х换鎺楀磻濞戞瑦娅犻柦妯侯棦濞差亜绠绘い鏃傛櫕閸橀潧顪冮妶鍡樼叆闁圭⒈鍋婇幃姗�寮婚妷锔惧幐闁诲繒鍋犻褎淇婇崸妤佺叆闁绘柨鎲￠悘顔剧磽瀹ュ懏顥炵紒鍌氱Т閳规垹锟斤綆鍋勯敓钘夌埣楠炴牕菐椤掞拷婵′粙鏌嶉柨瀣瑨闂囧鏌ㄥ┑鍡樺櫤闁哥喓鍋ら弻鐔碱敍濮樺崬鈪甸梺鍝勭焿缂嶄線銆佸锟介幃婊堝幢濡偑鍔戝娲偡閹殿喚鏆涢梺鎼炲妼缂嶅﹪宕洪悙鍝勭闁挎洩鎷锋鐐灪缁绘盯宕卞Ο鍝勵潔濡炪倖姊瑰ú鐔奉潖缂佹ɑ濯寸紒娑橆儏濞堟劙姊洪幖鐐插闁绘牜鍘ч悾鐑藉箣閻愮數鐦堥梺绋款儐閺嬭崵寰婃ィ鍐ㄎч柨婵嗩槸缁�鍐煃閸︻厼浜鹃悗姘偢濮婄粯绗熼敓钘夘焽閼姐倧鎷烽棃娑氱劯鐎规洏鍨介幐濠冨緞閸℃锟芥椽姊洪崫鍕窛闁稿鍔欏銊︾鐎ｎ偆鍘介梺鐟扮摠缁诲啯寰勯崟顖涘�垫慨姗嗗墰缁夌儤鎱ㄦ繝鍕笡闁瑰嘲鎳樺畷銊︾節閸愩劌澹嶆繝鐢靛О閸ㄧ厧鈻斿☉妯忔椽顢橀姀鐘崇�梺鐟板⒔缁垳锟界數濮撮…璺ㄦ崉閾忓湱鍔圭紓浣戒含閸嬨倕顫忓ú顏勪紶闁告洦鍓﹀Λ鐐测攽閳藉棗浜濈紒璇茬墦閻涱噣宕橀妸搴㈡瀹曘劑顢欓懞銉у礁闂備胶顢婇崑鎰偘閵夆晜鏅搁柛濠勫枎閻ㄦ椽鏌ｉ埡浣割劉濞ｅ洤锕幃娆擃敂閸曡埖瀚归柡鍥╁櫏濞堜粙鐓崶銊р槈缂佺媭鍨堕弻銊╂偆閸屾稑顏�
//					xdb.Procedure.pexecute(new PUpdateHuoBanZhenRong(roleId, 0, zhenyingid, members, PUpdateHuoBanZhenRong.HUOBAN));
//				}
//				else {
//					SChangeZhenrong snd = new SChangeZhenrong();
//					snd.zhenrong = zhenyingid;
//					snd.zhenfa = 0;
//					snd.huobanlist.clear();;
//					snd.reason = 5;
//					xdb.Procedure.psendWhileCommit(roleId, snd);
//				}
//				return suc;
//			};
//		}.submit();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 818838;

	public int getType() {
		return 818838;
	}

	public int zhenyingid;
	public java.util.ArrayList<Integer> members;

	public CZhenrongMember() {
		members = new java.util.ArrayList<Integer>();
	}

	public CZhenrongMember(int _zhenyingid_, java.util.ArrayList<Integer> _members_) {
		this.zhenyingid = _zhenyingid_;
		this.members = _members_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(zhenyingid);
		_os_.compact_uint32(members.size());
		for (Integer _v_ : members) {
			_os_.marshal(_v_);
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		zhenyingid = _os_.unmarshal_int();
		for (int _size_ = _os_.uncompact_uint32(); _size_ > 0; --_size_) {
			int _v_;
			_v_ = _os_.unmarshal_int();
			members.add(_v_);
		}
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CZhenrongMember) {
			CZhenrongMember _o_ = (CZhenrongMember)_o1_;
			if (zhenyingid != _o_.zhenyingid) return false;
			if (!members.equals(_o_.members)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += zhenyingid;
		_h_ += members.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(zhenyingid).append(",");
		_sb_.append(members).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


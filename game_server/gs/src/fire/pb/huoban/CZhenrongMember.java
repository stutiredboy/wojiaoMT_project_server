
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
		
		//闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁惧墽鎳撻—鍐拷锝庝簼閹癸綁鏌ｉ鐐搭棞闁靛棙甯掗～婵嬫倷椤掞拷椤忚埖淇婇妶鍥ラ柛瀣洴钘濋柣銏㈩焾閺嬩胶锟藉箍鍎遍ˇ顖滅矆鐎ｎ偁浜滈柟鍝勭Ф閸斿秵銇勯弬鎸庡枠婵﹦绮幏鍛喆閸曨偂鍝楅梻浣侯焾鐎涒晛顪冮挊澶屾殾婵犲﹤鍟犻弸搴ㄦ煙鐎涙绠ユ俊顐ｇ矒閹嘲顭ㄩ崨顓ф毉闁汇埄鍨遍〃濠囧箖閳ユ枼妲堟慨妯煎亾鐎氳顨ラ悙鑼虎闁告梹鑹捐灃闁绘娅曢崐鎰版煟濞戝崬娅嶇�殿喕绮欓、姗�鎮㈤崫鍕睄闂傚倷绀侀幉锟犲礉閿旂晫顩叉繝濠傜墕閸戠姵绻涢幋娆忕仾闁绘挻鐩幃姗�鎮欓幓鎺嗘寖濠电偛寮堕幐鎶藉蓟閳╁啯濯撮柣鐔告緲椤帡鎮楃憴鍕８闁告梹鍨块妴浣糕枎閹惧磭顦銈庡墻閸犳帡寮抽弰銆唕s闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚敐澶婄闁挎繂鎲涢幘缁樼厱濠电姴鍊归崑銉╂煛鐏炶濮傜�殿喗娼欓～婵嬫嚋濞堝尅鎷烽弽銊х閻庢稒顭囬惌濠勭磽瀹ュ拑韬�殿喛顕ч埥澶愬閻樼數鏉搁梻鍌氬�搁悧濠勭矙閹烘鍊堕柛顐犲劜閻撶喖骞栧ǎ顒�鐏卞瑙勆戦妵鍕晜閸喖绁繝纰夌磿閺佽鐣烽悢纰辨晬婵﹢纭搁崬娲⒒娴ｈ櫣甯涢柛鏃�鐗曢…鍥р枎閹垮啯鏅滈梺鍓插亝濞叉﹢鍩涢幋锔界厱婵炴垶锕╅悡顒佺箾閸喓鐭婇棁澶嬬節婵犲倸鏆熼柛鈺嬬悼閿熻姤顔栭崰鏍�﹂悜钘夌畺闁靛繈鍊曠粈鍌炴倶韫囨梻澧悗姘矙濮婅櫣鎷犻弻銉ュ及濠电偘鍖犻崟顓犲骄婵犵數濮存导锝夋晲婢舵ɑ鏅梺璺ㄥ枍缁瑥顕ｆ繝姘櫜濠㈣泛顑呮禍婊堟⒑閸涘﹦缂氶柛搴㈢叀瀹曠敻宕掑鍛紳婵炶揪绲介幖顐ｇ墡闂備礁婀遍幊鎾趁洪妶澶樻晪闁挎繂妫涚弧锟藉┑顔斤供閸庣敻鍩￠崨顔惧帗闁哄鍋炴刊浠嬪礂瀹�鍕厽妞ゆ劑鍨归顓熸叏婵犲啯銇濇鐐寸墵閹瑩骞撻幒鎳躲倝姊绘担绛嬪殭缂佺粯鍨归幑銏ゅ醇閵壯冪ウ濠殿喗顨愰幏椋庯拷瑙勬礃缁秹骞忛崨瀛樺仏閻庣數顭堢花銉╂⒒閸屾艾锟界兘鎳楅崜浣稿灊妞ゆ牜鍋為弲顏堟⒒娴ｅ憡鎲搁柛鐘查叄閹ê鈹戠�ｎ偆鐣冲┑锛勫亼閸婃牕螞娴ｈ鍙忛柕鍫濐槸閻鐓崶銊﹀皑闁猴拷娴犲鐓熸俊顖濐嚙缁插鏌￠崱娆忎槐闁哄本娲熷畷鍫曞Ω瑜忛悾鍝勵渻閵堝啫濡搁柛搴ｆ暬楠炲啫鈻庨幋顖涘婵炴垶顏鍡楊棜闁告劕寮弮鍫熷亹闂傚牊绋愬▽顏堟煟閵忊晛鐏欓柨鐔诲Г閸撴岸宕甸弴鐔翠簻闁硅櫣鍋炵�氬綊姊虹�圭媭娼愰柛銊ョ仢閻ｇ兘鎮㈢喊杈ㄦ櫇闂侀潧鐗嗙�氼喖螞椤栫偞鈷掗柛灞剧懅缁愭梹绻涙担鍐插幘濞差亜围闁搞儵鏀辩�氳鎱ㄥ鍡椾簻鐎规挸妫涢敓鑺ヮ問閸ｎ噣宕戞繝鍌滄殾闁圭儤顨嗛崐鐑芥煛婢跺鐏ｉ柟顕嗙秮濮婅櫣鎷犻懠顒傤唺闂佺顑囨慨纾嬬亱闂佸憡娲﹂崢鍓у婵傚憡鐓冮柛婵嗗閸ｆ椽鏌嶉柨瀣瑨闂囧鏌ㄥ┑鍡樺窛闁硅棄鍊块弻娑㈠Χ閸涱厽娈婚梺鍝勬湰閻╊垱淇婇幖浣肝ч柛娑卞幘閵堫噣鏌ｆ惔銈庢綈婵炶绠撳畷鍦崉娓氼垰娈ㄩ梺鍓插亝濞叉牜绮婚敐澶嬬厽婵☆垱瀵ч悵顏呫亜閺冿拷濞叉鎹㈠┑鍡忔灁闁割煈鍠楅悘宥咁渻閵堝骸骞栭柣妤佹尭閻ｅ嘲煤椤忓嫬鍞ㄥ銈嗘尵閸嬬喖鏁嶅☉銏♀拺缂備焦锕╅悞鐣岀磼椤曞懎鐏﹂柟顕嗙節婵＄兘鍩￠崒婊冨箺闂備礁鎼ú銊╁磻濞戙垺鏅搁柦妯侯槹鐠愶繝鏌ㄩ悢璇残撻柣鏃戝墴楠炲繘鏁撻敓锟�
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
//					//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊璁查弸娆撴⒑缂佹ê绗╁┑顔哄�楅幑銏犫槈閵忕姴鑰垮┑鈽嗗灥椤曆呭枈瀹ュ鐓熼柣鏂挎憸閹虫洜绱掗悩铏磳妤犵偛鍟灃闁告侗鍠楀▍婊堟煙閼测晞藟闁告挻绻堥幃妯侯吋婢跺鎷虹紓浣割儐椤戞瑩宕曞鍛＜缂備焦顭囩粻鐐碉拷娈垮枛椤嘲顕ｉ幘顔碱潊闁绘顕ч弫瑙勭節閻㈤潧孝闁诲繑宀稿畷婵嬪冀椤愩倖鍣紓鍌氬�搁崐鐑芥嚄閸洘鎯為幖娣妼閻鐓崶銊р槈缂佺媭鍨堕弻锝夊箣閿濆憛鎾绘煃闁垮绗掗棁澶愭煥濠靛棙宸濋柟钘夊�圭换娑㈠礂閻撳骸顫掗梺鍝勬湰缁嬫帡骞嗛弮鍫濈伋闁惧浚鍋勯敓绛嬪灦濮婃椽鏌呭☉姘ｆ晙闂佸憡姊归崹鑸电┍婵犲洦鍤嬮梻鍫熺〒缁愮偞绻濋悽闈浶㈤悗姘煎墴閻涱噣宕奸妷锔规嫽婵炶揪绲块崕銈夊吹閿熻姤绻濋埛锟介崨顔界彧闂佸憡甯楃敮锟犮�佸☉銏″�烽柤纰卞墮楠炲牓姊绘担鍛婅础闁稿簺鍊濋妴鍐幢濞戞瑥浜楅梺鍝勬川閸犲棙绂嶅鍫熺厵闁逛絻娅曞▍鍛存煥閻旇袚婵炶尙鍠庨锝囩矙濞嗘儳鎮戦梺鎼炲劗閺呮繈鏁嶅鍫熲拺闁告挻褰冩禍婵囩箾閸欏鐏存鐐差槹閵堬綁宕橀埡鍐ㄥ箰闂佽绻掗崑娑欐櫠閽樺娲箻椤旂晫鍘靛銈嗘煥閹碱偊鎮橀弻銉︾厸閻忕偠顕ф俊鍧楁煥閻斿憡鐏紓宥呮缁傚秴鈹戠�ｎ偄锟藉爼骞栧ǎ顒�濡介柍閿嬪笒闇夐柨婵嗘噺閸熺偤鏌熼姘卞ⅵ闁哄矉缍侀、姗�鎮滈崱妯炪劑姊洪悷鎵暛闁搞劌缍婇崺鐐哄箣閿曪拷楠炪垺绻涢崱妯哄妞ゆ梹娲熷缁樻媴缁涘娈愰梺鎼炲妼閻栫厧鐣烽幋鐐电瘈闁稿鏋荤徊楣冨Χ閿濆绀冮柍鍦亾鐎氬ジ姊绘笟锟藉鑽わ拷闈涚焸瀹曘垽鎸婃径鍡樼�洪梺鍝勬川閸嬫劙寮ㄦ禒瀣厽闁瑰瓨绻冩径鍕倵濮橆剛绉烘慨濠勭帛閹峰懘宕ㄦ繝鍐ㄥ壍濠电姰鍨煎▔娑樏洪銏犳瀬闁瑰墽绮�电姴顭跨捄铏圭効缂佽京鍋ゅ娲传閸曨剦妫炲┑鈽嗗亝缁诲牓鐛崘銊庢棃宕ㄩ鑺ョ彸闂佺鍋愮悰銉╂晸閸婄喎鐨洪柣鈺佸娣囧﹪鎮欓鍕舵嫹閺囩噥娈介煫鍥ㄧ☉缁狀垶鏌ㄩ悤鍌涘
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


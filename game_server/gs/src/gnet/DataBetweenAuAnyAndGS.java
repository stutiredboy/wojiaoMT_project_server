
package gnet;
import org.apache.log4j.Logger;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __DataBetweenAuAnyAndGS__ extends mkio.Protocol { }

/** qtype:	(8001)GS_TO_AuAny更新玩家的服务器角色信息,此时info是玩家角色信息
				(10001)GS_TO_AuAny代理http请求,此时info是http请求地址及参数
				(10002)AuAny_TO_GS代理http请求的返回结果
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class DataBetweenAuAnyAndGS extends __DataBetweenAuAnyAndGS__ {
	private static Logger logger=Logger.getLogger("RECHARGE");
	@Override
	protected void process() {
		if(this.flag != AuAny_TO_GS) {
			logger.error("DataBetweenAuAnyAndGS.flag:" + this.flag + ",isnt AuAny_TO_GS!");
			return;
		}
		if(qtype==10002) {
			try {
				String infos = new String(info.getBytes(), "ISO-8859-1");//缂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌熼梻瀵割槮缁炬儳缍婇弻鐔兼⒒鐎靛壊妲紒鐐劤缂嶅﹪寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆ繝锟介柆宥呯疅闁归棿鐒﹂崑瀣煕椤愶絿绠橀柣鐔哥叀濮婅櫣绮欏▎鎯у壈濡炪倖鍨靛Λ娑㈠箲閵忕姭鏀介柛銉㈡櫇閻﹀牓姊虹粙鎸庢拱缂侇喖鐭傝矾闁跨喍绮欏缁樻媴娓氼垳鍔稿銈嗗灥閹虫妫熼梺瑙勵問閸犳鐣烽崣澶岀瘈闂傚牊绋掑婵堢磼閳藉懏瀚归梻鍌欒兌椤牓寮甸鍕閻熸瑥瀚閬嶆煥閻斿墎鐭欐慨濠勭帛閹峰懘宕妷顖滅缂傚倷绶￠崳顕�宕规导杈剧稏闊洦姊荤弧锟藉┑顔斤供閸樿棄鈻嶉姀銈嗏拺闁兼亽鍎嶉鍩跺洭鏌嗗鍡椾患濡炪倖鎸堕崹娲偂閺囥垹绠规繛锝庡墮婵℃椽鏌熼弻銉х暫闁哄瞼鍠栭、娆撳Ω閵夈儲鐏撻梺缁樻尪閸庣敻寮诲☉婊呯杸闁哄洨鍊敐鍡曠箚闁绘劖澹嗛惌娆戯拷娈垮櫘閸嬪﹪鐛崶顒夋晣闁绘劗鏁搁悰顕�姊虹拠鎻掑毐缂傚秴妫濆畷婊冣枎閹捐泛绁﹂梺鍓插亖閸庢煡鍩涢幒鎳ㄥ綊鏁愰崨顔兼殘闂佽鍨伴悧鎾诲蓟濞戙垺鍋嗗ù锝呮憸娴犳悂鎮楃憴鍕妞ゃ垹锕俊鐢稿箛閺夎法顔婇梺鐟扮摠缁诲倹绂嶉懜鐢电瘈闁汇垽娼у瓭闂佹寧娲忛崐婵嬬嵁婵犲洤绠涙い鏃傗拡濡粍绻濋棃娑橈拷濠氣�﹂崼銏㈡／鐟滄棃寮诲☉銏╂晝闁挎繂娲犲Σ鍫熺節瀵版灚鍊栫涵鍓佺磼鏉堛劌娴柟顔规櫇缁數娑甸崪鍐╁闁秆勵殕閻撴稓锟界櫢鎷烽柨鐔剁矙瀹曚即寮介鐐电枃闂佺粯蓱濡炲潡寮崱娑欑叆闁绘柨澧庨惌娆撴煏閸℃锟藉湱缂撴禒瀣窛濠电姴瀚獮宥夋煟鎼达絾鍤�閻庢凹鍠楅弲璺何旈崨顓㈡７婵炲濮撮鍡涙偂濞嗘挻鐓曟繛鍡楁禋濡插綊鎮樿箛銉ヮ洭闁跨喎锟界噥娼愭繛鍙夌矒瀹曚即寮介婊愭嫹娴ｈ倽鏃�鎷呴悷閭︼拷鎾绘⒑缂佹ê鐏﹂柨鏇楁櫅椤洭鍩￠崨顔规嫽闂佺鏈懝楣冩晸閼恒儲鍊愮�规洘鍔栭ˇ鐗堟償閿濆洨鍔跺┑鐐存尰閻旑剟骞忛柨瀣垫闁绘劕妯婂Ο锟介梺杞扮劍閹瑰洭骞冮埡鍛殤闁肩鐏氶崯娲⒒閸屾瑧鍔嶉悗绗涘懏宕查柛宀�鍊涢崶顒夋晬婵犲﹤鎳愰悞鍏肩節閵忥絽鐓愰柛鏃�鐗犲畷鎰板醇閺囩喓鍘介梺瑙勫婢ф鈽夎闇夋繝濠傜墢閻ｆ椽鏌＄仦鍓р槈闁宠姘︾粻娑㈠即閻欙拷閸熷姊绘担鍛婃儓闁活厼顦辩槐鐐存媴閸撴彃娈ㄥ銈嗘穿閹烽锟借娲橀崕濂杆囬弻銉︾厵妞ゆ牗绮屾禒杈ㄦ叏婵犲倹鎯堥弫鍫ユ煕閵夋垵绉电�氬湱鎲搁弮鍫㈠祦闊洦绋掗崐濠氭煠閹帒鍔楅柟椋庣帛缁绘稒娼忛崜褍鍩岄梺纭咁嚋缁绘繂鐣烽鐐村�烽柣鎴烆焽閸橀亶姊鸿ぐ鎺戜喊闁告搫绠撻幃锟犲礂绾拌鲸顔旈梺缁樺姌鐏忔瑧绮绘繝姘厸濞达綀顫夊畷宀勬煛娴ｈ宕岄柡浣规崌閺佹捇鏁撻敓锟�?濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣銏犲閺佸﹪鏌″搴″箹缂佹劖顨嗘穱濠囧Χ閸涱喖娅濋梺璺ㄥ枑閺嬭崵绮婚幘宕囨殾濠靛倸鎲￠崑鍕�掑鐓庣仭闂佽￥鍊栨穱濠囨倷椤忓嫸鎷烽弽顐ｆ殰闁圭儤妫戦幏宄邦潩閻撳骸鈷嬮梺璇″灠閼活垵鐏冮梺鍛婁緱閸犳岸宕ｉ崱娑欌拺缂備焦蓱椤ュ棙绻涢崪鍐М闁靛棗鎳橀幃瑙勩偅閸愨斁鎷婚梺绋挎湰閼归箖鏁撻懞銉﹀�愮�规洘鍔欓幃婊堟嚍閵夈儲鐣遍梻浣稿閸嬪懎煤閺嶎偄顥氶柛褎顨嗛悡鐔兼煏韫囧鐒洪柣鎺楃畺閺岋綁濡堕崶褌澹曠紓浣虹帛缁诲牆螞閸愩劉妲堥柛妤冨仜婢瑰啴姊绘担鑺ョ《闁哥姵鍔欏鎼佹嚒閵堝洣绗夐梺瑙勫劤绾绢參寮抽敃锟介埞鎴﹀磼濠婂海鍔搁柛鐑嗗灦濮婃椽妫冨☉宕囩闂佸憡渚楅崢鑲╃不閹达附鈷掑ù锝堟閸氬綊鏌涢悩鍐插闁告帗甯掗悾婵嬫晸娴犲绠查柕蹇曞濞笺劑鏌ㄩ悢鍓佺煓闁诡喕鍗抽、娆戞崉閵娧勬緫婵犳鍠楄彠闁稿孩婢樻晥婵°倕鎳忛埛鎴︽煕閿旇骞栭柛鏂款儔閺岀喓绮欓幐搴℃殘缂備礁鍊哥粔鎾�﹂妸鈺侀唶闁绘柨寮剁�氬ジ姊绘担铏瑰笡闁圭鎽滈敓钘夌仛鐢帡鈥﹂崶顒佸亜闁稿繗鍋愰崢杈ㄧ節閻㈤潧孝闁哥姵鑹鹃埢鎾愁煥閸滃啯瀚归悷娆忓绾炬悂鏌涢妸銈囩煓闁靛棔绀佽灃濞达絿鎳撻鎾绘⒑閹呯妞ゆ洘鐗犲畷顖涙償閵婏腹鎷洪梺鍛婄箓鐎氬嘲危閹间焦鐓熸俊銈忔嫹缂佺粯锚閻ｇ兘骞嬮敃锟界粻濠氭偣娴ｇ瓔娼愰悗姘愁潐閹便劌螣閻撳簼澹曢柣搴㈢啲閹凤拷?
				logger.debug("DataBetweenAuAnyAndGS.user:" + userid + ",info:" + infos);
				//TODO:
				// 濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌熼梻瀵割槮缁惧墽绮换娑㈠箣濞嗗繒浠鹃梺绋款儍閸婃繈寮婚弴鐔虹鐟滃秹宕锔藉�跺┑鐘叉处閸婄敻鏌ｈ閹诧紕锟芥艾缍婂娲川婵犲啰顦ラ梺璇茬箲瀹�绋款嚕閺屻儲鍊烽柣鎴炃氶幏娲⒑绾懎浜归柛瀣洴瀹曟繂顫滈敓浠嬪蓟濞戙垹妫橀悹鎭掑壉閵忋倖鐓冮悹鍥皺鏁堥梺璇″枓閺呮繄妲愰幒鎳崇喖鎮℃惔锛勵吋缂傚倸鍊搁崐椋庣矆娓氾拷椤㈡牠宕卞▎娆愬缂佹绋戝ú銈囩不閺屻儲鐓ユ繝闈涙－濡插綊鏌ｉ幘鍐叉殶缂佽鲸鎸婚幏鍛存嚃閳╁啫鐏撮柛鈺傜洴楠炲洭鎮ч崼銏犲妇闂備焦鎮堕崕婊堝礃閸欍儳纾惧┑掳鍊楁慨鐑藉磻閻愯　锟斤箓宕堕锟界粻鏌ユ煕閺囥劌鐏犲ù鑲╁█閺屾盯寮撮妸銉よ埅濠碘槅鍋勯敃銈夊煘閹达附鍋愰柛顭戝亝濮ｅ嫰姊虹粙娆惧剱闁烩晩鍨堕獮鍡涘炊閵娿儺鍤ら梺鍝勵槹閸ㄥ綊鏁嶅▎鎾粹拺闁告繂瀚崒銊╂煕閵娿儳绉洪柟顕嗙節閸ㄩ箖骞囨担鍝勬暩闂備礁鍚嬮幃鍌氼焽瑜庨幈銊╁炊閳哄啰锛滈梺缁樏Ο濠囨偂婵傚憡鐓涚�癸拷閿熶粙宕伴幇鐗堟櫖闁归偊鍘芥刊鏉戙�掑鐓庣仭鐞氾箓姊婚崒娆戭槮闁硅绻濋獮鎴﹀炊瑜滈悞鐣屾喐閹达附鍊堕柛鎰靛枟閳锋垹绱撴担鐧稿叕闁肩増瀵х换娑欐媴閸愭彃顏い鈺呮敱缁绘繃绻濋崒娑樻缂佺偓宕橀崑鎰閹惧瓨濯村┑顔藉焾娴滄繈骞堥妸銉悑闁糕剝鍔掔花濠氭⒑闂堟稓绠氶柨鐔绘閸熷潡骞楅崹顐ょ瘈缁炬澘顦辩壕鍧楁煕韫囨枏鎴炵┍婵犲洦鐓ラ悗锝庡亜閸斿懘姊洪棃娑氱畾婵℃彃鎳庤灋闁告劦鍠楅崐鐢告偡濞嗗繐顏紒锟介崼銉︾厱闁绘ê纾晶顏堟煟閿濆洦鐒块柕鍥ㄥ姍楠炴帒鈹戦崶銊︾彇濠碉紕鍋戦崐銈夊磻閹烘鍌ㄩ柦妯猴級閻斿摜绡�闁搞儯鍔夐幏濠氭⒑缁嬫寧婀伴柤褰掔畺閺佹捇鎮剧仦钘夊箣闂佺娅曢〃濠傜暦婵傜鍗抽柣鎰Р閸庣敻骞冨Δ鍛櫜閹肩补鍓濋悘鍫㈢磽娴ｅ搫顎岄柛銊ョ埣瀵濡搁埡鍌氫簽闂佺鏈粙鎴︻敂閿燂拷?,闂傚倸鍊搁崐鎼佸磹閹间礁纾归柟闂寸绾惧綊鏌ｉ幋锝呅撻柛銈呭閺屾盯骞橀懠顒夋М闂佹悶鍔嶇换鍐Φ閸曨垰鍐�闁靛ě鍛帒闂備礁鎼Λ娆戝垝閹捐钃熼柨婵嗩槸濡﹢鎮归幁鎺戝妞ゆ柨鐗撳娲传閸曢潧鍓遍梺缁橆殕椤ㄥ牓骞戦姀鐘闁靛繒濮烽鍝勨攽閻愬弶顥滅紒缁樺笚缁傛帡鎳栭埡鍐紳婵炶揪绲介幖顐ｇ墡闂備胶绮〃鍡涖�冮崱娆戠煔閺夊牄鍔庣弧锟介梺鎼炲労閻忔稖顦归柡灞剧洴瀵挳濡搁妷銉ь啇濠电姴鐥夐妶鍛呮挾绱掔紒妯笺�掗柨鐔诲Г缁嬫帡鏁嬪┑鐐茬墢婵烇拷闁哄本绋掔换婵嬪礃椤忓嫧鎷￠梻浣烘嚀缁犲秹宕硅ぐ鎺戠叀濠㈣埖鍔曢～鍛存煟濡椿鍟忛柛姘嚇濮婄粯鎷呴搹鐟扮闂佸憡姊归〃濠傤嚕椤愶箑绠瑰ù锝囨嚀娴滄姊虹紒姗嗙劷缂侇噮鍨堕崺娑㈠箣閿旂晫鍘藉┑顔斤供閸撴盯骞楅悩缁樺�垫慨妯诲墯濞兼劗绱掔紒妯笺�掗柨鐔烘櫕閺佹悂鈥﹂崼婵堟懃濠碉紕鍋戦崐鏍垂闂堟党娑樷攽鐎ｎ亞鐣洪梺璺ㄥ枔婵敻宕戦崟顖涚厱闊洦鑹炬禍褰掓煕濡粯宕屾慨濠冩そ瀹曘劍绻濋崟顓犳殼闂佽瀛╅崙褰掑礈閻斿鍤曢柟闂寸鍥存繝銏ｆ硾椤戝洭宕㈡禒瀣拺闁革富鍘奸崝瀣亜閵娿儳澧﹂柟顔藉劤鐓ゆい蹇撴噽閸樻悂鏌ｈ箛鏇炰粶濠⒀傜矙閸┿儲寰勯幇顓犲帗闁荤姴娲╃亸娆掑�撮梻浣哥秺椤ユ挻绻涢敓鐣岋拷瑙勬穿缁叉儳顕ラ崟顒傜瘈閹肩补鎳ｉ悢鍏尖拻闁稿本鐟ㄩ崗宀�绱掗鍛仯闁轰緡鍣ｉ獮鎺戭渻娴兼瑦瀚归柨鏇炲�归崐濠氭煢濡警妲奸柟鑺ユ礋濮婅櫣鎹勯妸銉︾亖婵犳鍠栭顓犲垝閸澁鎷烽敐搴′簴濞存粍绮撻弻鐔煎箥閾忣偅鐝旈梺璺ㄥ枙婵倝銆冩繝鍥ワ拷浣糕枎閹邦喚鐦堥梺鎼炲劘閸斿酣宕㈡禒瀣拺闂傚牊绋撶粻姘舵煛閸涱喚娲撮柟顔斤耿閹晠宕楅崨顖滅暰婵＄偑鍊栭崝褏绱為崱妞绘灁婵犲﹤鐗婇悡鍐煏婢舵ê鐏犳い鈺婂墴閺岀喖鎮烽弶娆句純婵犵鍓濋幃鍌炲极閸愵喗鏅搁柣锝呰嫰椤ユ碍銇勯弽顐沪闁抽攱鍨块弻娑樷槈濮楀牆濮涚紓浣哄У閹瑰洭骞冨Δ锟介～婵嬫嚋閸偅娈搁梺璇查叄濞佳囧Χ閹间礁鏋侀柟鎯ь嚟椤╃兘鎮楅敐搴′簮闁归绮换娑欐綇閸撗勫仹闂佺儵鍓濆Λ鍐ㄧ暦閻㈢绀冩い鏃傛櫕閸橀亶姊洪幐搴ｇ畵濡ょ姵鎮傞幃姗�鏁傜粵瀣啍闂佺粯鍔樼亸娆戠不婵犳碍鐓涘ù锝堫潐瀹曞矂鏌℃担瑙勫磳闁轰焦鎹囬弫鎾绘晸閿燂拷
			  	xbean.User xuser = xtable.User.select(userid);
				if(xuser == null || xuser.getIdlist().isEmpty())
					return;
				long roleid = xuser.getIdlist().get(0);
				new fire.pb.activity.exchangecode.PExchangeCodeAuReturn(roleid, infos).submit();
			} catch(Exception e) {
				logger.error("LocojoyPlat.httpRequestFromGS:", e);
			}
		} else {
			new fire.pb.fushi.PReceiveDataFromAuany(this).submit();
		}
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 8920;

	public int getType() {
		return 8920;
	}

	public final static int AuAny_TO_GS = 1;
	public final static int GS_TO_AuAny = 2;

	public int userid;
	public int qtype;
	public byte flag;
	public com.locojoy.base.Octets info;
	public int reserved;

	public DataBetweenAuAnyAndGS() {
		info = new com.locojoy.base.Octets();
	}

	public DataBetweenAuAnyAndGS(int _userid_, int _qtype_, byte _flag_, com.locojoy.base.Octets _info_, int _reserved_) {
		this.userid = _userid_;
		this.qtype = _qtype_;
		this.flag = _flag_;
		this.info = _info_;
		this.reserved = _reserved_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(userid);
		_os_.marshal(qtype);
		_os_.marshal(flag);
		_os_.marshal(info);
		_os_.marshal(reserved);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		userid = _os_.unmarshal_int();
		qtype = _os_.unmarshal_int();
		flag = _os_.unmarshal_byte();
		info = _os_.unmarshal_Octets();
		reserved = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof DataBetweenAuAnyAndGS) {
			DataBetweenAuAnyAndGS _o_ = (DataBetweenAuAnyAndGS)_o1_;
			if (userid != _o_.userid) return false;
			if (qtype != _o_.qtype) return false;
			if (flag != _o_.flag) return false;
			if (!info.equals(_o_.info)) return false;
			if (reserved != _o_.reserved) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += userid;
		_h_ += qtype;
		_h_ += (int)flag;
		_h_ += info.hashCode();
		_h_ += reserved;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(userid).append(",");
		_sb_.append(qtype).append(",");
		_sb_.append(flag).append(",");
		_sb_.append("B").append(info.size()).append(",");
		_sb_.append(reserved).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


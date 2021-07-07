
package gnet;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.locojoy.base.Marshal.OctetsStream;
import com.locojoy.base.Marshal.MarshalException;

abstract class __GetAddCashSN2Req__ extends mkio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class GetAddCashSN2Req extends __GetAddCashSN2Req__ {
	@Override
	protected void process() {
		// protocol handle
		int sn = 0;
		boolean hasRole = false;
		final xbean.User u = xtable.User.select(userid);
		GetAddCashSN2Rep getAddCashSNRep = new GetAddCashSN2Rep();
		long roleid = 0;
		if (u!=null){
            for (Long rid : u.getIdlist()) {
				xbean.Properties prop = xtable.Properties.select(rid);
				if (prop!=null&&prop.getDeletetime()==0) {
					hasRole = true;
					break;
				}
			}			
            roleid = u.getPrevloginroleid();
		}
//		if (force==0&&(hasRole && forbiden())){//濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮诲☉妯锋婵鐗婇弫楣冩⒑閸涘﹦鎳冪紒缁橈耿瀵鏁愭径濠勵吅濠电姴鐏氶崝鏍礊濡ゅ懏鈷戦悹鎭掑妼閺嬫瑦淇婇銏狀伃鐎规洘鍔欏畷鐑筋敇閻樼數鍔归梻浣告贡閸庛倕螞閹达箑绠柣鎴ｅГ閺呮煡骞栫划鐧告嫹閼碱剙鍤┑鐘垫暩閸嬫盯骞婂畝鍕瀭闁芥ê顦藉鏍ㄧ箾瀹割喕绨奸柛銈呯Ч閺屾洘寰勬繝鍌涚亾婵炲瓨绮犳禍锝呂涢悢濂夋富闁靛牆妫涙晶閬嶆煕鐎ｎ偆鈽夐弫鍫ユ煛鐏炶鍔滈柍閿嬪灦閵囧嫰骞掗悙鏉戭伓缂傚倷绀侀ˇ閬嶅极婵犳艾绠栭柨鐔哄Т鍞梺鍐叉惈閸婂宕㈡禒瀣拺闁告繂瀚弳娆撴煕婵犲懎鍚归柡渚囧枛閳藉鈻庡鍕泿闂備線娼чˇ顓㈠磿閸濆嫀锝夋惞閸︻厾锛滈柡澶婄墑閸斿秶浜搁鐔翠簻闁瑰墽鍋ㄩ崑銏拷瑙勬处娴滎亜鐣峰锟介、姗�鎮欓弶鎴濆濠电姴鐥夐弶鍖℃嫹濡や焦鍙忛柣鎴ｆ绾剧粯绻涢幋娆忕仼闁汇値鍠楅妵鍕箛閳轰礁濮㈡繛瀛樼矆缁瑥顫忓ú顏呭殥闁靛牆鎲涢姀锛勭婵炴潙顑嗗▍鍥瑰鍜佺劸闁宠閰ｉ獮瀣偐闂堟稓顔岄梻鍌欒兌缁垶宕濆Δ鍛？闁靛牆顦悡鏇㈡煙鐎电校闁哥姵鍔欓弻锝呂旈敓浠嬫偋閸℃瑧绠旈柟鐑樺殮閻熼偊鐓ラ柨鐔剁矙瀹曪繝骞庨挊澶庢憰濠电偞鍨崹鍦不婵犳碍鍊甸梻鍫熺♁閸熺偤鏌涢敐鍕祮婵﹨娅ｉ幏鐘诲灳閾忣偆褰庢繝鐢靛仒閸栫娀宕卞▎搴ゅ焻闂傚倸鍊烽懗鍫曞储瑜旈敐鐐哄即閵忕姷锛欏┑掳鍊曢幊蹇涘磿婵犲洦鐓曟い鎰Т閸旀粓鏌嶉柨瀣伌婵﹤顭峰畷濂告偄閻戞ê鍨遍梻浣虹帛缁嬫帞鍒掓惔锝嗩潟闁圭儤顨呯粻鐢告煙閻戞ê鐏嶉柟绋垮暙閳规垿鎮欓弶鎴犱淮闂佽绻戝畝鍛婁繆閸洘鏅插璺猴功椤︺劑姊虹�圭姵銆冪紒韬插�濋獮蹇涙倻閼恒儱浠洪梺鍛婄☉閿曪箓宕㈤崡鐑嗘富闁靛牆楠搁獮妤呮煕閵娿儳浠涚紒鍌氱Т椤劑宕ㄩ婊愮床婵犲痉鏉匡拷鎾剁矆娴ｈ櫣绠旀慨妯垮煐閻撳繘鏌涢妷鎴濆枤娴煎啫顪冮妶鍐ㄧ仾闁挎洏鍨介獮鍐ㄢ枎閹惧磭楠囬梺鐟邦嚟閸嬬喐绂嶉悜鑺モ拻闁稿本鐟︾粊鐗堜繆濡炵厧濮傞柟顔惧仱閺佸啴宕掑槌栧敼闂備焦鎮堕崕娲礈濞嗘垹涓嶉柡宥庡幗閻撳啴寮堕悙鏉戭�滈柛蹇撶焸閺岋繝宕遍鐘垫殼闂佸搫鏈惄顖涗繆閻戣棄绠ｆ繝闈涙濞堣泛顪冮妶鍡樷拹閻㈩垪锟芥剚娼栧┑鐘宠壘绾惧吋鎱ㄥ鍡楀⒕闁瑰嘲鍢查悾锟犲箠婵犲倻绉虹�规洘鍎奸ˇ顕�鏌＄�ｎ偆澧甸柡宀嬬節瀹曞爼濡烽妷褌鎮ｉ梻鍌氬�搁崑鍡涘垂閸洖钃熼柕濞炬櫅閸楁娊鏌ｉ幇顖ｅ殝闁归鍏樺畷顐﹀Ψ瑜岀粭澶婎渻閵堝棛澧遍柛瀣仱閹繝濡烽埡鍌滃幗闂佸搫娲ㄩ崑娑㈡晸閽樺璐￠柨鐔诲Г閻旑剟骞忛敓锟�?,濠电姷鏁告慨鐑藉极閸涘﹥鍙忛柣鎴ｆ閺嬩線鏌涘☉姗堟敾闁告瑥绻橀弻锝夊箣閿濆棭妫勯梺鍝勵儎缁舵岸寮婚悢鍏尖拻閻庨潧澹婂Σ顔剧磼閻愵剙鍔ゆい顓犲厴瀵鏁愭径濠勭杸濡炪倖甯婇悞锕傚磿閹剧粯鈷戦柟鑲╁仜婵″ジ鏌涙繝鍌涘仴鐎殿喛顕ч埥澶愬閳哄倹娅囬梻浣瑰缁诲倸螞濞戔懞鍥Ψ瑜忕壕钘壝归敐鍛儓鐏忓繘姊洪崨濠庢畷濠电偛锕悰顕�宕橀婊�姹楅梺鍦劋閸ㄥ綊宕愰悙鐑樺仭婵犲﹤鍟板瓭闁捐崵鍋炴穱濠囶敍濠靛棗鎯炵紓浣哄█缁犳牠寮婚悢鐚存嫹閻㈡鐒惧ù鐘欏洦鐓欓柛鎰絻椤忊晠鏌嶇憴鍕伌妞ゃ垺绋戦埥澶娾枎韫囨挻鏁梻鍌欑閹碱偊鎯屾径宀�绀婂〒姘炬嫹妤犵偛鍟存慨锟介柕蹇嬪灮閻撴挸鈹戦悙鍙夘棤闁稿鎹囪棢閻庯綆鍓涚壕浠嬫煕鐏炲墽鎳呴柛鏂跨Ч閺屾盯寮敓浠嬨�冩繝鍌滄殾闁硅揪绠戝洿闂佸憡绮堥悞锔剧礊鎼粹檧鏀介柣鎰级閳绘洖霉濠婂嫮鐭婃い鏂跨箰閳规垿宕辫箛鏃�鏉搁梻浣虹帛钃辩憸鏉垮暣瀵啿鈻庨幇鈺�绨婚梺鎸庢椤鈻嶆繝鍐╁弿濠电姴鍟妵婵囶殽閻愬澧甸柟顔界懇楠炴捇骞掑┑鍫嫹闁秵鈷掑ù锝呮啞閸熺偞銇勯妸銉︻棡缂佺粯绋掔换婵嬪炊閳轰胶銈﹂梻浣虹《閸撴繈鎮烽妶鍛煢妞ゅ繐鐗嗙痪褔鏌ｉ幇顓熺稇妞ゆ洘绮嶆穱濠囶敃閵忕姵娈梺浼欑到閸㈡煡锝炲鍫熸櫢濞寸姴顑囧畵渚�鏌熼柇锕�骞楅柛搴ｅ枛閺屽秹鎸婃径瀣垫缂備焦鍞荤粻鎾愁潖婵犳艾纾兼繛鍡樺姉閵堜即鎮楃憴鍕闁轰浇顕ч悾閿嬪閺夋垹鐤�濡炪倖甯掗ˇ閬嶅船闂堟稈鏀芥い鏃傜摂濞堬綁鏌熼悜鑺ユ暠闁靛洤瀚版慨锟介柍鈺佸枤濡啫顪冮妶鍐ㄧ仾闁挎洏鍨洪幈銊╂晸娴犲鐓ユ繛鎴灻鈺傤殽閻愯尙澧︽慨濠呮閹风娀骞撻幒鎴炵槪缂傚倸鍊哥粔鏉懳涘▎鎴犵焿鐎广儱鎳愰弳瀣⒑椤撱劎鐣遍柡鍛█濮婃椽妫冨☉杈ㄐ㈤梺鍝勬噺缁嬫挸鈽夐悽鍛婃櫢濞寸姴顑嗛埛鎺戙�掑顒佹悙濠⒀屽枤缁辨帗寰勭仦鐐瘓闂佽鍣换婵嗩嚕閹绢喗鍋勯柛鎾茶兌閻ｉ箖姊绘笟锟藉褔鎮ч崱娑樼疇閹兼番鍔屽Ч鏌ユ煛閸モ晛啸缁炬儳銈稿鍫曞醇濞戞ê顬堥梺宕囩帛濞茬喖寮婚垾宕囨殕閻庯綆鍓涜ⅵ闂備浇顕栭崰鎾诲垂娴犲绠栭柍鈺佸暞閸庣喐绻濋棃娑欘棡闁诲孩濞婂濠氬磼濞嗘帒鍘＄紓渚囧櫘閸ㄥ爼鐛幇鏉块唶闁哄洨鍋熼敍鐔兼⒑濮瑰洤鐏い顓炵墦閹锋垿鎮㈤崫銉ь啎闂佺懓鐡ㄩ悷銉╂倶閳哄啰纾奸柣妯虹－濞插瓨鎱ㄦ繝鍌ょ吋鐎规洖銈搁幃銏㈡偘閳╁喚锟藉洭姊绘担铏瑰笡缂佽绉瑰畷鎶芥晲閸滀焦缍庨梺鎯х箺椤鐣锋径鎰厪濠电偛鐏濋崝婊堟煟韫囨挻顥炵紒缁樼箓閳绘捇宕归鐣屼簴闂備胶顭堥敃銉ф崲閸喍绻嗛柟缁㈠枛缁�鍐煃閸濆嫬鏆熼柣锕�鐗撳娲箹閻愭彃濡ч梺绯曞墲钃遍柛鐔告そ濮婂宕掑▎鎴濆闁诲海鐟抽崨顔煎簥闂佺鐬奸崐娑㈠炊椤掑鏅┑鐐村灦閿氬┑顔兼嚇濮婂宕掑顒婃嫹閻戣姤鍊块柨鏃�鎷濋幏椋庣箔濞戞ɑ鎼愰柦鍐枛閺屾洘绻濊箛娑欘�嶅┑鐐叉噽婵挳婀侀梺缁樏Ο濠囧磿閹扮増鐓曢悗锛卞嫭鐝氶梺鍝勮閸婃洟婀侀柣搴秵閸嬪懘鎮甸弽顐ょ＜闁绘劦鍓欑粈鍐╀繆椤愩垹顏┑鈩冩尦楠炴帡骞嬮鐔峰厞婵＄偑鍊栫敮濠囨倿閿曞倸绠栨繛鍡樻尰閳锋垿鏌涘┑鍡楊伌闁稿孩鍔楃槐鎺旓拷锝庡亜濞搭喖鈹戦敍鍕毈鐎规洜鍠栭、娑橆潩妲屾牕鎮堝┑鐘垫暩婵烇拷婵炰匠鍏犲綊宕掑В鍏肩洴閺佸啴鏁撻崐鐔轰簷闂備胶绮敃銏狀焽瑜庣粋鎺戭煥閸涱垳锛滅紓鍌欑劍閳笺倝顢旈崼鐔蜂患闂佺粯鍨煎Λ鍕劔闂備礁鐤囧銊╂嚄閼告娈介柛銉墯閳锋垿鏌ｉ悢绋款棆闁圭晫濮风槐鎺楊敊婵傜寮伴梺璇″枟閻燂妇鎹㈠┑瀣倞闁靛鍨虹�氳棄鈹戦悙鑸靛涧缂佽弓绮欓獮澶愭晸閻樿尙鏌堥梺缁樺姇椤曨厾绮绘ィ鍐╃厱婵炲棗娴氬褔鏌ら幏灞剧《闁跨喎锟界噥娼愭繛鍙夌矒瀹曟洟濡堕崶銊ュ簥濠电娀娼ч鍛矆鐎ｎ偁浜滈柟鎯ь嚟缁犳﹢鏌ｉ悢鍝ョ疄婵﹦绮幏鍛驳鐎ｎ偆绉烽柣搴ゎ潐濞叉﹢鏁冮姀銈冿拷浣割潩閹颁焦鈻岄梻浣哥秺閺�閬嶅垂閸ф绠栭柕蹇嬪�曠粈鍌炴煠濞村娅呮鐐搭殜濮婄粯鎷呴崨濠冨創闂佺锕ラ幃鍌炲箖濡　鏀介悗锝庝簽閻ｆ椽姊虹涵鍛涧闂傚嫬瀚伴幃鈥斥槈閵忥紕鍘卞┑鐐村灥瀹曨剟寮搁悢鍏肩厱濠电姴鍟慨宥夋煛瀹�瀣？濞寸媴濡囬幏鐘诲箵閹烘繃缍嗛梻鍌欐祰椤曟牠宕伴幘璇茬９婵犻潧妫涢弳锕傛煙閻戞ê鐏嶆俊鎻掔墛閹便劌螖閿熻棄螞閺冨倹顫曢柨鐕傛嫹?
//			getAddCashSNRep.sn = sn+1;
//			getAddCashSNRep.userid = userid;
//			getAddCashSNRep.xid = xid;
//			getAddCashSNRep.zoneid = zoneid;
//			getAddCashSNRep.retcode = -19;
//			DeliveryManager.getInstance().send(getAddCashSNRep);
//			return ;
//		}
		if (hasRole && roleid > 0){

			getAddCashSNRep.sn = sn+1;
			getAddCashSNRep.userid = userid;
			getAddCashSNRep.xid = xid;
			getAddCashSNRep.zoneid = zoneid;
			getAddCashSNRep.retcode = 0;
		}else  {
			getAddCashSNRep.sn = sn+1;
			getAddCashSNRep.userid = userid;
			getAddCashSNRep.xid = xid;
			getAddCashSNRep.zoneid = zoneid;
			getAddCashSNRep.retcode = -19;
		}

		DeliveryManager.getInstance().send(getAddCashSNRep);
	}



	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 202;

	public int getType() {
		return 202;
	}

	public int xid;
	public int userid;
	public int zoneid;
	public byte force;

	public GetAddCashSN2Req() {
		xid = -1;
		userid = -1;
		zoneid = -1;
		force = -1;
	}

	public GetAddCashSN2Req(int _xid_, int _userid_, int _zoneid_, byte _force_) {
		this.xid = _xid_;
		this.userid = _userid_;
		this.zoneid = _zoneid_;
		this.force = _force_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(xid);
		_os_.marshal(userid);
		_os_.marshal(zoneid);
		_os_.marshal(force);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		xid = _os_.unmarshal_int();
		userid = _os_.unmarshal_int();
		zoneid = _os_.unmarshal_int();
		force = _os_.unmarshal_byte();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof GetAddCashSN2Req) {
			GetAddCashSN2Req _o_ = (GetAddCashSN2Req)_o1_;
			if (xid != _o_.xid) return false;
			if (userid != _o_.userid) return false;
			if (zoneid != _o_.zoneid) return false;
			if (force != _o_.force) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += xid;
		_h_ += userid;
		_h_ += zoneid;
		_h_ += (int)force;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(xid).append(",");
		_sb_.append(userid).append(",");
		_sb_.append(zoneid).append(",");
		_sb_.append(force).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(GetAddCashSN2Req _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = xid - _o_.xid;
		if (0 != _c_) return _c_;
		_c_ = userid - _o_.userid;
		if (0 != _c_) return _c_;
		_c_ = zoneid - _o_.zoneid;
		if (0 != _c_) return _c_;
		_c_ = force - _o_.force;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}


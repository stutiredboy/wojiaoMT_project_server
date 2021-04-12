
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
//		if (force==0&&(hasRole && forbiden())){//婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻娑樷槈濮楀牊鏁鹃梺鍛婄懃缁绘﹢寮婚敐澶婄婵犲灚鍔栫紞妤呮⒑鐠恒劌鏋欐俊顐㈠瀹曟劙宕烽鐘电効闂佸湱鍎ゅΛ鎴﹀箯閻戣姤鏅查幖绮癸拷鑼嚬婵犵數鍋涢幊宀勫垂閽樺娼栨繛宸簼閸ゅ秹鏌曟径濠傛灓濞存粠浜ｅΛ鐔奉渻閵堝棛澧遍柛瀣☉鏁堥柡灞诲劜閳锋垶銇勯幒鐐村缂備礁顦遍弫濠氬箖閿熺姴唯闁冲搫鍊婚崢浠嬫⒑閸濆嫬鏆欓柛濠呭吹閺侇喖鈽夊▎宥勭盎闂侀潧顦崕鍝勎ｉ搹鍦＜閺夊牄鍔嶇亸顓熴亜閹剧偨鍋㈢�规洦浜畷姗�顢橀悙鏉戝壍婵犲痉鏉匡拷妤佹叏閻戣棄纾绘繛鎴欏灩閻ゎ喗銇勯幇鈺佸姢濞存粈绮欏娲嚒閵堝憛銏＄箾濞村娅囧ù婊咁焾閳诲酣骞嬮悩闈涚闂備胶绮崝妤呭磿閵堝鐓曢柟瀵稿У閸犳劙鏌ｅΔ锟介悧鍡欑箔閹烘嚚鐟邦煥閿熶粙宕￠幎钘夎摕婵炴垯鍨圭粻濠氭倵闂堟稒鍟為柛锝勫嵆濮婅櫣鎷犻垾铏彎濠电偘鍖犻崱娆庤埅闂傚倷鑳堕崢褔锝為弴銏犵９婵°倕鎳忛崕濠囨煕椤愮姴鍔滈柍閿嬪灴濮婂宕奸悢鐑樺垱闂佺粯绋掔划搴ｆ閹烘绠甸柟鐑樺灍閹稿啫鈹戦悙鏉戠仴闁诲繑宀告俊鍫曟晲婢跺﹦顦ㄩ梺瀹犳〃缁躲倝骞忛悜鑺ュ仺闁告稑锕﹂崢鍗烆渻閵堝骸骞楅柛銊ョ仛缁傚秴顭ㄩ崨顖滐紲濠德板�撶粈浣虹箔濮樿埖鐓忛柛銉戝喚浼冨銈冨灪閿曘垽骞冨▎鎾崇骇闁瑰鍋熸禍鐑芥⒒閸屾瑦绁版俊妞煎姂閹偤鏁冮崒姘鳖唹闂佹悶鍎洪崜娆戠不閺嶎厽鐓冮弶鐐村閸忓矂鏌￠崱顓犵暤闁哄本鐩俊鐑藉箣濠靛棙娈跺銈嗘⒐鐢�愁潖婵犳艾纾兼慨姗嗗墾閹峰嘲鐣￠幊濠傜秺瀹曟儼顦柡瀣墵閺岋繝宕堕妷銉т患闂傚倸鍋嗛崹鍫曞蓟閵娾晛鍗抽柣鎰嚋閹风兘宕妷褌绗夊銈嗙墱閸嬬偤鎮￠妷鈺傜厽闁哄洨鍋涢敓钘夋贡閿熻姤鐔幏锟�?,婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繘鏌ｉ幋锝嗩棄闁哄绶氶弻鐔兼⒒鐎靛壊妲紒鐐劤椤兘寮婚敐澶婄疀妞ゆ帊鐒﹂崕鎾绘⒑閹肩偛濡奸柛濠傛健瀵鈽夐姀鈺傛櫇闂佹寧绻傚Λ娑⑺囬妷褏纾藉ù锝呮惈灏忛梺鍛婎殕婵炲﹪鐛崘顓滀汗闁圭儤鍨归崐鐐烘偡濠婂啰孝閾荤偞淇婇婵嗗惞缂佺娀绠栭弻鐔猴拷鐢殿焾娴犙囨煙閸愭彃顏╅柍瑙勫灴椤㈡稑鈽夊▎蹇撴敪闂備礁鎼惌澶岀礊娓氾拷楠炲啴濮�閵忋垻鐓撳┑鐐叉閸嬫捇藟鐎ｎ剛纾介柛灞剧懅閸斿秹鏌涢弮锟介〃濠傜暦閹达箑围闁告粈鐒︾紞搴♀攽閻愬弶鈻曞ù婊勭矊椤斿繐鈹戦崱蹇旀杸闂佺粯蓱瑜板啴寮冲▎鎰╀簻闁挎棁顫夊▍濠冩叏婵犲啯銇濇鐐寸墵閹瑩骞撻幒婵堬拷閬嶆⒒娴ｅ憡鍟炴い銊ユ缁绘稒绻濋崶鈺佺ウ闂佺硶鍓濋悷銈呪柦椤忓牆绾ч柣鎰綑椤曟粍淇婇銏犳殭闁伙絽鍢查～婊堟晸娴犲宓侀柟閭﹀幗閸庣喖鏌嶉挊澶嬵棛缂佹唻绠撳濠氬磼濞嗘劗銈伴悗瑙勬礈閺佽鐣锋导鏉戠疀妞ゆ帒顦遍崬闈涒攽椤旂瓔娈ｉ柟鐑芥敱閵囧嫰濮�閳╁喚妫冨銈冨灪閿曘垺鎱ㄩ敓浠嬫煥濞戞ê顏╂鐐茬墦濮婅櫣鎷犻幓鎺戞瘣缂傚倸绉村Λ娆戠矉瀹ュ懐鏆嬮梺顓ㄧ畱閺呯娀姊洪棃娑辨Т闁哄懏绋撳☉鐢告晸娴犲鈷掑〒姘搐婢ь喚绱掓径灞炬毈闁诡噯绻濆鎾偄閸撲胶鐣鹃梻渚�娼ч悧鍡涘箠鎼淬劌姹查柡鍥╁Х绾惧ジ寮堕崼娑樺闁崇粯娲熼弻鈥崇暆鐎ｎ剛袦闂佽鍠撻崹浠嬪箖閳╁啯鍎熸繝闈涙閻庢娊姊婚崒娆掑厡缂侇噮鍨堕獮鎰板醇閺囩偟锛熼梺姹囧灮椤牓鎷戦悢鍝ョ闁瑰瓨鐟ラ悘鈺冪磼閻樺磭娲存慨濠傤煼瀹曞ジ鎮㈢悰鈩冾�囬梻浣虹帛缁诲秹宕抽敐鍜佹綎闁惧繗顫夊畷澶愭煏婵炲灝鍔滈柣蹇撴缁绘繂鈻撻崹顔界亖闂佺锕ョ换鍫熶繆閹绢喖绀冮柍鍝勫暟閻﹀牓姊洪幖鐐插妧闁糕剝蓱閸熸椽姊婚崒娆戝妽閻庣瑳鍛床闁稿瞼鍊涢崶顒夋晬婵炴垶锚婵懘姊婚崒姘拷鐑芥倿閿旀拝鎷风粭娑樻搐閽冪喖鏌曟繝蹇涙婵炲懐濮撮湁闁绘ê妯婇崕鎰版煕鐎Ｑ勬珚闁哄被鍊曢湁閻庯綆鍋呴悵鏍磼閻愵剙绀冩俊顐㈠婵℃挳骞掗幋顓熷兊濡炪倖甯婇悞锕傚箖濞嗘挻鈷戦柛婵嗗閸庢劗绱掔�ｎ偄娴┑锛勬暬瀹曠喖顢涘槌栧悈婵犵數濞�濞佳兠归崒姣兼盯鏁冮敓鍊熺亙闂佺粯锕㈠褎绂掑鍛＜缂備焦鈼ら鍫熷仼闁绘垼妫勬儫闂佸疇妗ㄩ懗鑸殿殽閸ヮ剚鈷戦柣鐔稿閹界姷绱掗濂稿弰闁诡喗鐟︾换婵嬪炊閵娿垺瀚藉┑鐐舵彧缁蹭粙骞夐敓鐘茬柈闁绘劕顕粻楣冩煕濞嗗浚妾ч柤鎷屾硶閿熷�燁潐濞叉粓宕曢妶鍥ㄥ床婵犻潧顑呯粈瀣亜閹惧绠橀柣鐔哥箞濮婄粯鎷呯粵瀣秷閻庤娲橀敃銏ゃ�佸鎰佹▌闂佸綊鏀遍崹鍧楀箖閵忋倕绀傞柤娴嬫櫅楠炴姊绘担鍛婃儓闁稿﹥鎮傞幃妯衡攽鐎ｎ亞鐣洪梺纭呮彧闂勫嫰鎮″☉銏＄厱婵炴垵宕弸鐔兼煕婵犲啫濮嶉柡宀嬬磿娴狅妇鎷犻幓鎺濇綆闂備浇顕栭崰鎾诲磹濠靛棛鏆﹂柟鐑樺灍濡插牊鎱ㄥΔ锟藉Λ鏃傛閿燂拷?
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

